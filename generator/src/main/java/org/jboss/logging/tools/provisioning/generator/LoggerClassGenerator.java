package org.jboss.logging.tools.provisioning.generator;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.lang.model.element.TypeElement;

import org.jboss.logging.processor.apt.MessageInterfaceFactory;
import org.jboss.logging.processor.generator.model.ClassModelFactory;
import org.jboss.logging.processor.model.MessageInterface;
import org.jboss.logging.processor.model.MessageMethod;
import org.jboss.logging.tools.provisioning.descriptor.InterfaceDescriptor;
import org.jboss.logging.tools.provisioning.descriptor.TranslationFileDescriptor;
import org.jboss.logging.tools.provisioning.scanner.JarScanner;

import com.sun.source.util.JavacTask;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;
import java.net.URI;
import java.nio.charset.StandardCharsets;

/**
 * Main entry point for provisioning-time logger class generation.
 *
 * <p>Orchestrates all three phases:</p>
 * <ol>
 *   <li><b>Phase 1</b> – ASM JAR scanner produces {@link InterfaceDescriptor} trees.</li>
 *   <li><b>Phase 2</b> – A live {@link JavacTask} resolves real {@code TypeElement} objects
 *       from the classpath; {@link MessageInterfaceFactory} and {@link ClassModelFactory}
 *       are called exactly as in the normal APT path, producing {@code .java} sources.</li>
 *   <li><b>Phase 3</b> – {@link SystemJavacCompiler} compiles the generated sources to
 *       {@code .class} files.</li>
 * </ol>
 *
 * <p>A JDK is required at runtime (not a plain JRE) because both {@code JavacTask}
 * and {@code ToolProvider.getSystemJavaCompiler()} are JDK-only.</p>
 */
public class LoggerClassGenerator {

    /** Fixed source directory, or null to create a temp directory on each run. */
    private final Path fixedSourceDir;

    /** The source directory used by the most recent {@link #generate} call. */
    private Path lastSourceDir;

    /** Creates a generator that writes intermediate sources to a randomly-named temp directory. */
    public LoggerClassGenerator() {
        this.fixedSourceDir = null;
    }

    /**
     * Creates a generator that always writes intermediate sources to the given directory.
     * The directory is created if it does not exist. Implies {@code keepSources = true}.
     *
     * @param sourceDir directory for intermediate {@code .java} files
     */
    public LoggerClassGenerator(Path sourceDir) {
        this.fixedSourceDir = sourceDir;
    }

    /**
     * Returns the source directory used by the most recent {@link #generate} call,
     * or {@code null} if {@link #generate} has not been called yet.
     */
    public Path lastSourceDir() {
        return lastSourceDir;
    }

    /**
     * Runs the full generation pipeline.
     *
     * <p>The running JAR (when shaded) is automatically added to the javac compilation
     * classpath, so all bundled dependencies ({@code jboss-logging-annotations},
     * {@code jboss-logging}, etc.) are available to the compiler without any extra
     * parameters.</p>
     *
     * @param sourceJars      JAR files to scan.  These JARs are also placed on the
     *                        javac classpath during Phase 2 (type resolution) and
     *                        Phase 3 (compilation).
     * @param extraClasspath  Additional JARs placed on the classpath for type resolution
     *                        and compilation but NOT scanned for interfaces.  Use this for
     *                        transitive dependencies of the source JARs (e.g. {@code jakarta.ejb},
     *                        {@code jboss-as-controller}, {@code jandex}, …).
     * @param classOutputDir  Directory into which the final {@code .class} files are written.
     * @param keepSources     If {@code true}, the intermediate {@code .java} files are kept
     *                        after compilation.  Ignored when a fixed source directory was
     *                        provided to the constructor (sources are always kept in that case).
     */
    public void generate(
            List<Path> sourceJars,
            List<Path> extraClasspath,
            Path classOutputDir,
            boolean keepSources) throws Exception {

        // ── Phase 1: ASM scan ────────────────────────────────────────────
        JarScanner scanner = new JarScanner();
        List<InterfaceDescriptor> descriptors = scanner.scan(sourceJars);

        if (descriptors.isEmpty()) {
            System.out.println("[INFO]  No @MessageLogger / @MessageBundle interfaces found — nothing to generate.");
            return;
        }
        System.out.println("[INFO]  Found " + descriptors.size() + " interface(s) to process.");

        // ── Phase 1b: synthesize empty intermediate locale parent classes ─
        // Mirrors TranslationClassGenerator.generateSourceFileFor() in jboss-logging-tools:
        // when EjbLogger.i18n_pt_BR.properties exists but EjbLogger.i18n_pt.properties does
        // not, the APT processor auto-generates an empty _pt superclass so that _pt_BR can
        // extend it. We must do the same or the class hierarchy will be wrong.
        for (InterfaceDescriptor descriptor : descriptors) {
            synthesizeMissingParents(descriptor);
        }

        // ── Phase 2 setup: JavacTask for type resolution ──────────────────
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        if (compiler == null) {
            throw new IllegalStateException(
                    "No system Java compiler is available. " +
                    "This tool must be run on a JDK, not a plain JRE.");
        }

        // Resolve the source directory: fixed (from constructor) or temp
        Path tempSourceDir;
        if (fixedSourceDir != null) {
            tempSourceDir = fixedSourceDir;
            Files.createDirectories(tempSourceDir);
            keepSources = true; // always keep when caller specified a fixed dir
        } else {
            tempSourceDir = Files.createTempDirectory("logging-bridge-src-");
        }
        lastSourceDir = tempSourceDir;
        System.out.println("[INFO]  Source directory: " + tempSourceDir.toAbsolutePath());

        // Build the classpath for javac:
        //   • the source JARs being scanned (needed to resolve their own types)
        //   • extra (non-scanned) JARs for transitive dependencies
        //   • the running JAR itself — when shaded it contains jboss-logging-annotations,
        //     jboss-logging, and jdeparser; when running from an exploded classes/ directory
        //     (IDE / unit tests) selfJar() returns empty and those JARs are already on the
        //     JVM classpath so javac can find them via jarForClass() fallbacks.
        List<java.io.File> classpathFiles = new ArrayList<>();
        for (Path jar : sourceJars) classpathFiles.add(jar.toFile());
        for (Path jar : extraClasspath) classpathFiles.add(jar.toFile());
        selfJar().ifPresent(classpathFiles::add);
        // Fallback for non-fat-JAR contexts: locate dependency JARs from the live classloader.
        if (selfJar().isEmpty()) {
            jarForClass(org.jboss.logging.annotations.Param.class).ifPresent(classpathFiles::add);
            jarForClass(org.jboss.logging.BasicLogger.class).ifPresent(classpathFiles::add);
        }

        // Determine the --release from the highest class-file major version seen
        int maxMajor = descriptors.stream()
                .mapToInt(d -> d.classFileMajorVersion)
                .max()
                .orElse(55); // default to Java 11
        int releaseVersion = SystemJavacCompiler.majorVersionToRelease(maxMajor);

        try (StandardJavaFileManager fm = compiler.getStandardFileManager(
                null, null, StandardCharsets.UTF_8)) {

            fm.setLocation(StandardLocation.CLASS_PATH, classpathFiles);

            // A single empty source file drives javac to populate its symbol table
            JavaFileObject dummySource = new DummySourceFile();

            @SuppressWarnings("unchecked")
            JavacTask task = (JavacTask) compiler.getTask(
                    null, fm, null,
                    List.of("--release", String.valueOf(releaseVersion)),
                    null,
                    List.of(dummySource));

            task.analyze(); // populates Elements + Types from the classpath

            PathJFiler pathFiler = new PathJFiler(tempSourceDir);
            JavacTaskProcessingEnvironment processingEnv =
                    new JavacTaskProcessingEnvironment(task, pathFiler);

            // ── Phase 2: generate .java sources ─────────────────────────
            for (InterfaceDescriptor descriptor : descriptors) {
                TypeElement te = processingEnv.getElementUtils()
                        .getTypeElement(descriptor.qualifiedName);
                if (te == null) {
                    System.err.println("[WARN] Could not resolve TypeElement for: "
                            + descriptor.qualifiedName + " — skipping");
                    continue;
                }

                // MessageInterfaceFactory.of() requires the full ProcessingEnvironment
                // and builds a fully real MessageInterface from the live TypeElement.
                MessageInterface mi = MessageInterfaceFactory.of(
                        processingEnv, te, new Properties(), /* addGeneratedAnnotation */ false);

                // Implementation class
                ClassModelFactory.implementation(processingEnv, mi).generateAndWrite();

                // Translation classes — ordered less-specific first (Phase 1 guarantees this)
                for (TranslationFileDescriptor tfd : descriptor.translationFiles) {
                    Map<MessageMethod, String> translationMap =
                            buildTranslationMap(mi, tfd);
                    ClassModelFactory.translation(processingEnv, mi, tfd.localeSuffix, translationMap)
                            .generateAndWrite();
                }
            }
        }

        // ── Phase 3: compile .java → .class ──────────────────────────────
        List<Path> compileClasspath = new ArrayList<>(sourceJars);
        compileClasspath.addAll(extraClasspath);
        selfJar().map(java.io.File::toPath).ifPresent(compileClasspath::add);
        if (selfJar().isEmpty()) {
            jarForClass(org.jboss.logging.annotations.Param.class)
                    .map(java.io.File::toPath).ifPresent(compileClasspath::add);
            jarForClass(org.jboss.logging.BasicLogger.class)
                    .map(java.io.File::toPath).ifPresent(compileClasspath::add);
        }

        new SystemJavacCompiler().compile(
                tempSourceDir, classOutputDir, compileClasspath, releaseVersion, keepSources);
    }

    /**
     * Locates the JAR file from which the given class was loaded.
     *
     * <p>Used as a fallback when {@link #selfJar()} returns empty (i.e. when running from an
     * exploded class directory rather than a shaded fat JAR).  By passing a sentinel class from
     * each required dependency (e.g. {@code Param.class} from {@code jboss-logging-annotations},
     * {@code BasicLogger.class} from {@code jboss-logging}) we can put those JARs on javac's
     * {@code CLASS_PATH} so that annotation mirrors on classpath types are fully resolvable.</p>
     *
     * @param clazz any class whose containing JAR should be located
     * @return the JAR file, or empty if the class is not loaded from a JAR
     */
    private static java.util.Optional<java.io.File> jarForClass(Class<?> clazz) {
        try {
            java.security.CodeSource cs = clazz.getProtectionDomain().getCodeSource();
            if (cs == null) return java.util.Optional.empty();
            java.net.URL location = cs.getLocation();
            if (location == null) return java.util.Optional.empty();
            java.io.File f = new java.io.File(location.toURI());
            if (f.isFile() && f.getName().endsWith(".jar")) {
                return java.util.Optional.of(f);
            }
            return java.util.Optional.empty();
        } catch (Exception e) {
            return java.util.Optional.empty();
        }
    }

    /**
     * Locates the JAR file from which this class was loaded.
     *
     * <p>When running as a shaded fat JAR ({@code java -jar runner.jar}), the code source
     * is the fat JAR itself, which already contains all bundled dependencies.  Putting it
     * on the javac classpath makes {@code jboss-logging-annotations}, {@code jboss-logging},
     * and all other bundled classes available to the compiler without any extra parameters.</p>
     *
     * <p>Returns {@link java.util.Optional#empty()} when running from an exploded class
     * directory (e.g. during IDE runs or unit tests), in which case the individual
     * dependency JARs are already on the JVM classpath and javac can see them.</p>
     */
    private static java.util.Optional<java.io.File> selfJar() {
        try {
            java.security.CodeSource cs =
                    LoggerClassGenerator.class.getProtectionDomain().getCodeSource();
            if (cs == null) return java.util.Optional.empty();
            java.net.URL location = cs.getLocation();
            if (location == null) return java.util.Optional.empty();
            java.io.File f = new java.io.File(location.toURI());
            // Only add if it is an actual JAR file (not an exploded classes/ dir)
            if (f.isFile() && f.getName().endsWith(".jar")) {
                return java.util.Optional.of(f);
            }
            return java.util.Optional.empty();
        } catch (Exception e) {
            return java.util.Optional.empty();
        }
    }

    /**
     * Mirrors {@code TranslationClassGenerator.generateSourceFileFor()} in jboss-logging-tools.
     *
     * <p>For each {@link TranslationFileDescriptor} whose locale suffix has more than one
     * {@code _} segment (e.g. {@code _pt_BR}, {@code _zh_CN}, {@code _en_US_POSIX}), ensures
     * that every intermediate parent suffix ({@code _pt}, {@code _zh}, {@code _en},
     * {@code _en_US}) is also present in {@code descriptor.translationFiles}.  If a parent
     * suffix is missing it is added as an empty descriptor (no translated messages) so that
     * {@link ClassModelFactory#translation} generates the parent class with only the
     * {@code getLoggingLocale()} override, matching the APT output exactly.</p>
     *
     * <p>The synthesized entries are inserted immediately before the child that required them
     * so the list remains sorted less-specific-first.</p>
     */
    private static void synthesizeMissingParents(InterfaceDescriptor descriptor) {
        // Build a mutable ordered map: localeSuffix → descriptor, preserving order
        // (list is already sorted less-specific first by JarScanner).
        LinkedHashMap<String, TranslationFileDescriptor> byLocale = new LinkedHashMap<>();
        for (TranslationFileDescriptor tfd : descriptor.translationFiles) {
            byLocale.put(tfd.localeSuffix, tfd);
        }

        // Iterate in a stable order; collect insertions so we don't mutate while iterating.
        // Use a snapshot of current suffixes to drive the loop — new entries added will be
        // processed in the next pass.
        boolean changed = true;
        while (changed) {
            changed = false;
            // Snapshot to avoid ConcurrentModificationException
            List<String> suffixes = new ArrayList<>(byLocale.keySet());
            for (String suffix : suffixes) {
                String parentSuffix = parentLocaleSuffix(suffix);
                if (parentSuffix == null) continue; // language-only, no parent needed
                if (byLocale.containsKey(parentSuffix)) continue; // already present

                // Synthesize an empty parent.
                // Parent locale string: strip leading '_' from parentSuffix
                String parentLocale = parentSuffix.substring(1);
                // Determine the parent's superclass name
                String baseImplClass = descriptor.qualifiedName + "_$"
                        + (descriptor.kind == org.jboss.logging.tools.provisioning.descriptor.InterfaceKind.LOGGER
                                ? "logger" : "bundle");
                String grandParentSuffix = parentLocaleSuffix(parentSuffix);
                String parentParentClass = grandParentSuffix == null
                        ? baseImplClass
                        : descriptor.qualifiedName + "_$"
                              + (descriptor.kind == org.jboss.logging.tools.provisioning.descriptor.InterfaceKind.LOGGER
                                      ? "logger" : "bundle") + grandParentSuffix;

                TranslationFileDescriptor synthetic = new TranslationFileDescriptor(
                        descriptor.binaryName,
                        parentSuffix,
                        parentLocale,
                        parentParentClass,
                        Collections.emptyMap());

                // Re-build the map with the parent inserted immediately before the child.
                LinkedHashMap<String, TranslationFileDescriptor> reordered = new LinkedHashMap<>();
                for (Map.Entry<String, TranslationFileDescriptor> e : byLocale.entrySet()) {
                    if (e.getKey().equals(suffix)) {
                        reordered.put(parentSuffix, synthetic); // parent before child
                    }
                    reordered.put(e.getKey(), e.getValue());
                }
                byLocale = reordered;

                System.out.println("[INFO]    Synthesizing empty parent locale class for suffix '"
                        + parentSuffix + "' (required by '" + suffix + "')");
                changed = true; // re-scan: the new parent might itself need a grandparent
                break; // restart loop over updated map
            }
        }

        // Replace the descriptor's translationFiles in-place with the augmented list
        descriptor.translationFiles.clear();
        descriptor.translationFiles.addAll(byLocale.values());
    }

    /**
     * Returns the parent locale suffix for a given suffix, or {@code null} if none.
     *
     * <p>Mirrors {@code TranslationHelper.getEnclosingTranslationFileName()}:
     * strips the last {@code _}-delimited segment.  Returns {@code null} when the
     * suffix has exactly one segment (language-only, e.g. {@code _fr}, {@code _pt}).</p>
     *
     * <ul>
     *   <li>{@code _pt_BR}    → {@code _pt}</li>
     *   <li>{@code _zh_CN}    → {@code _zh}</li>
     *   <li>{@code _en_US_POSIX} → {@code _en_US}</li>
     *   <li>{@code _fr}       → {@code null} (no parent)</li>
     * </ul>
     */
    private static String parentLocaleSuffix(String localeSuffix) {
        // localeSuffix starts with '_'; count segments by counting underscores.
        // "_fr" has 1 underscore → language-only, no parent.
        int firstUnderscore = localeSuffix.indexOf('_');                  // always 0
        int lastUnderscore  = localeSuffix.lastIndexOf('_');
        if (firstUnderscore == lastUnderscore) return null; // language-only, no parent
        return localeSuffix.substring(0, lastUnderscore);
    }

    /**
     * Converts the string-keyed translation map from {@link TranslationFileDescriptor}
     * into the {@code Map<MessageMethod, String>} form expected by
     * {@link ClassModelFactory#translation}.
     */
    private Map<MessageMethod, String> buildTranslationMap(
            MessageInterface mi, TranslationFileDescriptor tfd) {
        Map<MessageMethod, String> result = new HashMap<>();
        for (MessageMethod mm : mi.methods()) {
            String translated = tfd.translations.get(mm.translationKey());
            if (translated != null) {
                result.put(mm, translated);
            }
        }
        return result;
    }

    // ─────────────────────────────────────────────────────────────────────
    // A minimal in-memory source file that forces javac to run a compilation
    // round so that its symbol table gets populated from the classpath.
    // ─────────────────────────────────────────────────────────────────────

    private static class DummySourceFile extends SimpleJavaFileObject {
        DummySourceFile() {
            super(URI.create("mem:////__LoggingBridgeTrigger.java"),
                    JavaFileObject.Kind.SOURCE);
        }

        @Override
        public CharSequence getCharContent(boolean ignoreEncodingErrors) {
            return "class __LoggingBridgeTrigger {}";
        }
    }
}
