package org.jboss.logging.tools.provisioning;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.tools.provisioning.generator.LoggerClassGenerator;

/**
 * Command-line entry point for the provisioning-time logger class generator.
 *
 * <h2>Usage</h2>
 * <pre>
 * java -jar logging-provisioning-time-VERSION-runner.jar [OPTIONS] &lt;jar&gt; [&lt;jar&gt; ...]
 *
 * REQUIRED
 *   &lt;jar&gt; [&lt;jar&gt; ...]   One or more JAR files to scan for @MessageLogger /
 *                        @MessageBundle interfaces.  At least one JAR is required.
 *
 * OPTIONS
 *   --output &lt;dir&gt;       Output directory for generated .class files.
 *                        Created if it does not exist.  Default: ./generated-classes
 *
 *   --classpath &lt;jar&gt;    Add a JAR to the compilation classpath for type resolution
 *                        and compilation.  The JAR is NOT scanned for @MessageLogger /
 *                        @MessageBundle interfaces.  Repeat the option for each JAR.
 *                        Use this for transitive dependencies of the source JARs
 *                        (e.g. jakarta.ejb, jboss-as-controller, jandex, …).
 *
 *   --source-dir &lt;dir&gt;   Write intermediate .java files to this directory instead
 *                        of a randomly-named temp directory.  Implies --keep-sources.
 *
 *   --keep-sources       Keep the intermediate .java files after compilation.
 *                        Written to a temp directory printed to stdout.
 *
 *   -h, --help           Print this help and exit.
 *
 * EXAMPLE
 *   java -jar logging-provisioning-time-runner.jar \
 *       --output /tmp/out --source-dir /tmp/src \
 *       --classpath jakarta-ejb.jar --classpath wildfly-controller.jar \
 *       wildfly-ejb3.jar wildfly-web.jar
 * </pre>
 *
 * <p>All required dependencies (jboss-logging-annotations, jboss-logging, etc.) are
 * bundled in the fat JAR and used automatically — no extra classpath configuration
 * is needed.</p>
 *
 * <p><b>JDK required:</b> this tool must be run with a JDK (not a plain JRE) because it
 * uses {@code ToolProvider.getSystemJavaCompiler()} to compile the generated sources.</p>
 */
public class Main {

    private static final String DEFAULT_OUTPUT = "generated-classes";

    public static void main(String[] args) {
        try {
            System.exit(run(args));
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            System.exit(2);
        }
    }

    static int run(String[] args) throws Exception {
        // ── Argument parsing ──────────────────────────────────────────────
        List<Path> sourceJars = new ArrayList<>();
        List<Path> classpathJars = new ArrayList<>();
        Path outputDir = null;
        Path sourceDir = null;
        boolean keepSources = false;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-h":
                case "--help":
                    printUsage();
                    return 0;

                case "--output":
                    outputDir = requireNextPath(args, i, "--output");
                    i++;
                    break;

                case "--classpath":
                    Path cpJar = requireNextPath(args, i, "--classpath");
                    if (!Files.isRegularFile(cpJar)) {
                        System.err.println("[ERROR] Not a file: " + cpJar);
                        return 1;
                    }
                    classpathJars.add(cpJar);
                    i++;
                    break;

                case "--source-dir":
                    sourceDir = requireNextPath(args, i, "--source-dir");
                    keepSources = true;
                    i++;
                    break;

                case "--keep-sources":
                    keepSources = true;
                    break;

                default:
                    if (args[i].startsWith("-")) {
                        System.err.println("[ERROR] Unknown option: " + args[i]);
                        printUsage();
                        return 1;
                    }
                    // Positional: a JAR file or exploded-JAR directory to scan
                    Path jar = Paths.get(args[i]);
                    if (!Files.isRegularFile(jar) && !Files.isDirectory(jar)) {
                        System.err.println("[ERROR] Not a file or directory: " + jar);
                        return 1;
                    }
                    sourceJars.add(jar);
                    break;
            }
        }

        if (sourceJars.isEmpty()) {
            System.err.println("[ERROR] At least one source JAR must be specified.");
            printUsage();
            return 1;
        }

        // ── Defaults ──────────────────────────────────────────────────────
        if (outputDir == null) {
            outputDir = Paths.get(DEFAULT_OUTPUT);
        }
        Files.createDirectories(outputDir);

        // ── Summary ───────────────────────────────────────────────────────
        System.out.println("[INFO]  Source JARs:");
        for (Path jar : sourceJars) System.out.println("[INFO]    " + jar.toAbsolutePath());
        if (!classpathJars.isEmpty()) {
            System.out.println("[INFO]  Extra classpath JARs:");
            for (Path jar : classpathJars) System.out.println("[INFO]    " + jar.toAbsolutePath());
        }
        System.out.println("[INFO]  Output directory: " + outputDir.toAbsolutePath());
        if (sourceDir != null) {
            System.out.println("[INFO]  Source directory: " + sourceDir.toAbsolutePath());
        }

        // ── Run the generator ─────────────────────────────────────────────
        LoggerClassGenerator generator = sourceDir != null
                ? new LoggerClassGenerator(sourceDir)
                : new LoggerClassGenerator();

        long start = System.currentTimeMillis();
        generator.generate(sourceJars, classpathJars, outputDir, keepSources);
        long elapsed = System.currentTimeMillis() - start;

        System.out.printf("[INFO]  Generation complete in %d ms.%n", elapsed);
        System.out.println("[INFO]  Classes written to: " + outputDir.toAbsolutePath());
        if (keepSources) {
            System.out.println("[INFO]  Sources kept in: " + generator.lastSourceDir());
        }

        return 0;
    }

    // ── Helpers ───────────────────────────────────────────────────────────

    private static Path requireNextPath(String[] args, int i, String option) {
        if (i + 1 >= args.length) {
            throw new IllegalArgumentException("Option " + option + " requires an argument.");
        }
        return Paths.get(args[i + 1]);
    }

    private static void printUsage() {
        System.err.println();
        System.err.println("Usage:");
        System.err.println("  java -jar logging-provisioning-time-VERSION-runner.jar [OPTIONS] <jar> [<jar> ...]");
        System.err.println();
        System.err.println("OPTIONS");
        System.err.println("  --output <dir>       Output directory for .class files  (default: ./generated-classes)");
        System.err.println("  --classpath <jar>    Extra classpath JAR (not scanned; repeat for each JAR)");
        System.err.println("  --source-dir <dir>   Keep generated .java files here");
        System.err.println("  --keep-sources       Keep generated .java files (random temp dir)");
        System.err.println("  -h, --help           Print this help and exit");
        System.err.println();
        System.err.println("All required dependencies are bundled in this JAR.");
        System.err.println("Requires a JDK (not a plain JRE) at runtime.");
        System.err.println();
    }
}
