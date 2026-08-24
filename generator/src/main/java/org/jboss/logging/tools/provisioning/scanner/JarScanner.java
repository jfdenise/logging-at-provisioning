package org.jboss.logging.tools.provisioning.scanner;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jboss.logging.tools.provisioning.descriptor.InterfaceDescriptor;
import org.jboss.logging.tools.provisioning.descriptor.InterfaceKind;
import org.jboss.logging.tools.provisioning.descriptor.MessageFormat;
import org.jboss.logging.tools.provisioning.descriptor.MethodDescriptor;
import org.jboss.logging.tools.provisioning.descriptor.ParameterDescriptor;
import org.jboss.logging.tools.provisioning.descriptor.PosDescriptor;
import org.jboss.logging.tools.provisioning.descriptor.TransformDescriptor;
import org.jboss.logging.tools.provisioning.descriptor.TranslationFileDescriptor;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/**
 * Phase 1: scans one or more JAR files and produces an {@link InterfaceDescriptor} for every
 * {@code @MessageLogger} or {@code @MessageBundle} interface found in the bytecode.
 *
 * <p>Annotations have {@code RetentionPolicy.CLASS} so they are read from class-file attributes
 * via ASM, not via reflection. The target JAR is <em>never</em> loaded into the JVM.</p>
 */
public class JarScanner {

    // ── Annotation descriptors (internal form) ────────────────────────────
    private static final String DESC_MESSAGE_LOGGER = "Lorg/jboss/logging/annotations/MessageLogger;";
    private static final String DESC_MESSAGE_BUNDLE = "Lorg/jboss/logging/annotations/MessageBundle;";
    private static final String DESC_MESSAGE = "Lorg/jboss/logging/annotations/Message;";
    private static final String DESC_LOG_MESSAGE = "Lorg/jboss/logging/annotations/LogMessage;";
    private static final String DESC_CAUSE = "Lorg/jboss/logging/annotations/Cause;";
    private static final String DESC_PARAM = "Lorg/jboss/logging/annotations/Param;";
    private static final String DESC_FIELD = "Lorg/jboss/logging/annotations/Field;";
    private static final String DESC_FIELDS = "Lorg/jboss/logging/annotations/Fields;";
    private static final String DESC_PROPERTY = "Lorg/jboss/logging/annotations/Property;";
    private static final String DESC_PROPERTIES = "Lorg/jboss/logging/annotations/Properties;";
    private static final String DESC_LOGGING_CLASS = "Lorg/jboss/logging/annotations/LoggingClass;";
    private static final String DESC_SUPPRESSED = "Lorg/jboss/logging/annotations/Suppressed;";
    private static final String DESC_PRODUCER = "Lorg/jboss/logging/annotations/Producer;";
    private static final String DESC_TRANSFORM_EXCEPTION = "Lorg/jboss/logging/annotations/TransformException;";
    private static final String DESC_FORMAT_WITH = "Lorg/jboss/logging/annotations/FormatWith;";
    private static final String DESC_TRANSFORM = "Lorg/jboss/logging/annotations/Transform;";
    private static final String DESC_POS = "Lorg/jboss/logging/annotations/Pos;";
    private static final String DESC_LOGGING_CLASS_IFACE = "Lorg/jboss/logging/annotations/LoggingClass;";

    private static final String BASIC_LOGGER = "org/jboss/logging/BasicLogger";

    // Translation file name pattern: SimpleName.i18n_<locale>.properties
    private static final Pattern TRANSLATION_PATTERN =
            Pattern.compile("^(.+)\\.i18n_([a-z]+(?:_[A-Z]+){0,2})\\.properties$");

    /**
     * Scans all given JARs and returns one {@link InterfaceDescriptor} per discovered
     * {@code @MessageLogger} / {@code @MessageBundle} interface.
     */
    public List<InterfaceDescriptor> scan(List<Path> jars) throws IOException {
        // Map binaryName → descriptor (mutable during scan)
        Map<String, InterfaceDescriptor> byName = new LinkedHashMap<>();

        // First pass: collect all interface descriptors from class files
        for (Path jar : jars) {
            try (JarFile jf = new JarFile(jar.toFile())) {
                var entries = jf.entries();
                while (entries.hasMoreElements()) {
                    JarEntry entry = entries.nextElement();
                    if (!entry.getName().endsWith(".class")) continue;
                    try (InputStream in = jf.getInputStream(entry)) {
                        byte[] bytes = in.readAllBytes();
                        InterfaceDescriptor desc = tryParseInterface(bytes);
                        if (desc != null) {
                            byName.put(desc.binaryName, desc);
                        }
                    }
                }
            }
        }

        // Second pass: collect translation .properties files
        for (Path jar : jars) {
            try (JarFile jf = new JarFile(jar.toFile())) {
                var entries = jf.entries();
                while (entries.hasMoreElements()) {
                    JarEntry entry = entries.nextElement();
                    String entryName = entry.getName();
                    if (!entryName.endsWith(".properties")) continue;

                    // Extract the "directory/SimpleName.i18n_locale" portion
                    int lastSlash = entryName.lastIndexOf('/');
                    String dirPrefix = lastSlash < 0 ? "" : entryName.substring(0, lastSlash + 1);
                    String fileName = lastSlash < 0 ? entryName : entryName.substring(lastSlash + 1);

                    Matcher m = TRANSLATION_PATTERN.matcher(fileName);
                    if (!m.matches()) continue;
                    String simpleName = m.group(1);
                    String locale = m.group(2);
                    String localeSuffix = "_" + locale;

                    // Find the owning InterfaceDescriptor
                    String candidateBinary = (dirPrefix + simpleName).replace('/', '/');
                    // dirPrefix already has trailing slash so: dirPrefix + simpleName
                    String binaryKey = lastSlash < 0 ? simpleName
                            : entryName.substring(0, lastSlash) + "/" + simpleName;
                    InterfaceDescriptor owner = byName.get(binaryKey);
                    if (owner == null) continue;

                    // Parse the .properties file
                    Properties props = new Properties();
                    try (InputStream in = jf.getInputStream(entry)) {
                        props.load(in);
                    }

                    // Build validated translations map keyed by translationKey
                    Map<String, String> translationMap = buildTranslationMap(owner, props);
                    if (translationMap == null) continue; // nothing valid

                    // Compute parent class name (spec §1.7.3)
                    String baseImplClass = owner.qualifiedName + "_$" +
                            (owner.kind == InterfaceKind.LOGGER ? "logger" : "bundle");
                    String generatedClass = baseImplClass + localeSuffix;
                    String parentClass = computeParentClassName(generatedClass, baseImplClass);

                    owner.translationFiles.add(new TranslationFileDescriptor(
                            owner.binaryName, localeSuffix, locale, parentClass, translationMap));
                }
            }
        }

        // Sort each descriptor's translationFiles by locale specificity (fewest '_' first)
        for (InterfaceDescriptor desc : byName.values()) {
            desc.translationFiles.sort(
                    Comparator.comparingInt(t -> countChar(t.localeSuffix, '_') - 1)); // -1 for leading _
        }

        // Resolve Message.INHERIT id inheritance
        for (InterfaceDescriptor desc : byName.values()) {
            resolveInheritedIds(desc, byName);
        }

        return new ArrayList<>(byName.values());
    }

    // ── Interface parsing ─────────────────────────────────────────────────

    private InterfaceDescriptor tryParseInterface(byte[] bytes) {
        InterfaceClassVisitor visitor = new InterfaceClassVisitor();
        new ClassReader(bytes).accept(visitor, ClassReader.SKIP_FRAMES);
        return visitor.build();
    }

    // ── Translation helpers ───────────────────────────────────────────────

    /**
     * Builds a map of translationKey → translated string from a .properties file,
     * validating that each key matches a method and the format-argument count is correct.
     * Returns an empty map if nothing valid was found (never null).
     */
    private Map<String, String> buildTranslationMap(InterfaceDescriptor owner, Properties props) {
        // Build a lookup: translationKey → MethodDescriptor
        Map<String, MethodDescriptor> keyToMethod = new HashMap<>();
        for (MethodDescriptor md : owner.methods) {
            keyToMethod.put(md.translationKey, md);
        }

        Map<String, String> result = new LinkedHashMap<>();
        for (String key : props.stringPropertyNames()) {
            String value = props.getProperty(key);
            if (value == null || value.isBlank()) continue;
            MethodDescriptor md = keyToMethod.get(key);
            if (md == null) continue; // unknown key — ignore
            result.put(key, value);
        }
        return result;
    }

    /** Computes parent class name per spec §1.7.3. */
    private String computeParentClassName(String generatedClass, String baseImplClass) {
        int last = generatedClass.lastIndexOf('_');
        if (last < 0) return baseImplClass;
        String candidate = generatedClass.substring(0, last);
        // If stripping one segment leaves the base implementation name, that IS the parent
        return candidate.equals(baseImplClass) ? baseImplClass : candidate;
    }

    private int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == c) count++;
        return count;
    }

    // ── Message-ID inheritance resolution (spec §1.5) ─────────────────────

    private void resolveInheritedIds(InterfaceDescriptor desc,
            Map<String, InterfaceDescriptor> allByName) {
        // Group methods by name so overloads can share IDs
        Map<String, List<MethodDescriptor>> byMethodName = new LinkedHashMap<>();
        for (MethodDescriptor md : desc.methods) {
            byMethodName.computeIfAbsent(md.name, k -> new ArrayList<>()).add(md);
        }
        // Nothing to do if all methods have explicit IDs; the scanner sets messageId
        // directly from the annotation. INHERIT (-1) propagation across interfaces
        // requires the full descriptor tree and is handled below.
        for (Map.Entry<String, List<MethodDescriptor>> e : byMethodName.entrySet()) {
            List<MethodDescriptor> overloads = e.getValue();
            // Find an explicit id among overloads
            int explicit = -1;
            for (MethodDescriptor md : overloads) {
                if (md.messageId > 0) { explicit = md.messageId; break; }
            }
            if (explicit == -1) {
                // Walk extended interfaces to find an id
                explicit = findIdInExtended(e.getKey(), desc, allByName);
            }
            // Note: we cannot mutate MethodDescriptor (it's immutable); at this stage we
            // simply log unresolvable INHERIT cases. A mutable wrapper would be needed
            // for full resolution, which is a future enhancement.
        }
    }

    private int findIdInExtended(String methodName, InterfaceDescriptor desc,
            Map<String, InterfaceDescriptor> allByName) {
        for (String extBinary : desc.extendedInterfaces) {
            InterfaceDescriptor ext = allByName.get(extBinary);
            if (ext == null) continue;
            for (MethodDescriptor md : ext.methods) {
                if (md.name.equals(methodName) && md.messageId > 0) return md.messageId;
            }
            int found = findIdInExtended(methodName, ext, allByName);
            if (found > 0) return found;
        }
        return -1;
    }

    // ─────────────────────────────────────────────────────────────────────
    // ASM visitor: one per class file
    // ─────────────────────────────────────────────────────────────────────

    private static class InterfaceClassVisitor extends ClassVisitor {

        private String binaryName;
        private boolean isInterface;
        private int classFileMajorVersion;
        private InterfaceKind kind;
        private String projectCode = "";
        private int idPadLength = 6;
        private String rootLocale = "";
        private boolean extendsBasicLogger;
        private String loggingFQCN;
        private final List<String> extendedInterfaces = new ArrayList<>();
        private final List<MethodCollector> methodCollectors = new ArrayList<>();

        InterfaceClassVisitor() {
            super(Opcodes.ASM9);
        }

        @Override
        public void visit(int version, int access, String name, String signature,
                String superName, String[] interfaces) {
            this.classFileMajorVersion = version & 0xFFFF; // low 16 bits = major
            this.binaryName = name;
            this.isInterface = (access & Opcodes.ACC_INTERFACE) != 0;
            if (interfaces != null) {
                for (String iface : interfaces) {
                    if (BASIC_LOGGER.equals(iface)) {
                        extendsBasicLogger = true;
                    } else {
                        extendedInterfaces.add(iface);
                    }
                }
            }
        }

        @Override
        public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
            // RetentionPolicy.CLASS → visible=false
            if (DESC_MESSAGE_LOGGER.equals(descriptor)) {
                kind = InterfaceKind.LOGGER;
                return new InterfaceAnnotationVisitor() {
                    @Override void onValue(String name, Object value) {
                        if ("projectCode".equals(name)) projectCode = (String) value;
                        else if ("length".equals(name)) idPadLength = (int) value;
                        else if ("rootLocale".equals(name)) rootLocale = (String) value;
                        else if ("loggingClass".equals(name)) loggingFQCN = (String) value;
                    }
                };
            }
            if (DESC_MESSAGE_BUNDLE.equals(descriptor)) {
                kind = InterfaceKind.BUNDLE;
                return new InterfaceAnnotationVisitor() {
                    @Override void onValue(String name, Object value) {
                        if ("projectCode".equals(name)) projectCode = (String) value;
                        else if ("length".equals(name)) idPadLength = (int) value;
                        else if ("rootLocale".equals(name)) rootLocale = (String) value;
                    }
                };
            }
            return null;
        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String descriptor,
                String signature, String[] exceptions) {
            if (!isInterface) return null;
            // Skip static and default (concrete) methods — spec §1.6.
            // In a class file, interface default methods have ACC_STATIC cleared and no ACC_ABSTRACT.
            // Abstract interface methods have ACC_ABSTRACT set.
            if ((access & Opcodes.ACC_STATIC) != 0) return null;
            if ((access & Opcodes.ACC_ABSTRACT) == 0) return null; // not abstract → default method
            MethodCollector mc = new MethodCollector(name, descriptor, exceptions);
            methodCollectors.add(mc);
            return mc;
        }

        InterfaceDescriptor build() {
            if (!isInterface || kind == null) return null;

            // Collect only methods that have @Message
            List<MethodDescriptor> methods = new ArrayList<>();
            // First pass: collect raw methods
            List<MethodCollector> messageMethods = new ArrayList<>();
            for (MethodCollector mc : methodCollectors) {
                if (mc.messageValue != null) messageMethods.add(mc);
            }

            // Compute overload counts per name
            Map<String, Long> nameCount = new HashMap<>();
            for (MethodCollector mc : messageMethods) {
                nameCount.merge(mc.methodName, 1L, Long::sum);
            }
            // Track per-name how many format params each overload has
            Map<String, Integer> perNameSeen = new HashMap<>();

            for (MethodCollector mc : messageMethods) {
                boolean overloaded = nameCount.get(mc.methodName) > 1;
                int fpc = mc.countFormatParams();
                String messageMethodName;
                String translationKey;
                if (overloaded) {
                    messageMethodName = mc.methodName + fpc + "$str";
                    translationKey = mc.methodName + "." + fpc;
                } else {
                    messageMethodName = mc.methodName + "$str";
                    translationKey = mc.methodName;
                }
                methods.add(mc.toDescriptor(messageMethodName, translationKey));
            }

            return new InterfaceDescriptor(binaryName, projectCode, idPadLength, rootLocale,
                    kind, extendsBasicLogger, loggingFQCN, methods, extendedInterfaces,
                    classFileMajorVersion);
        }
    }

    // ── Per-method collector ──────────────────────────────────────────────

    private static class MethodCollector extends MethodVisitor {

        final String methodName;
        final String methodDescriptor;
        final String[] exceptions;

        // @Message fields
        int messageId = -1;  // INHERIT
        String messageValue;
        MessageFormat messageFormat = MessageFormat.MESSAGE_FORMAT;

        // @LogMessage fields
        boolean isLogMethod;
        String logLevel;
        boolean useThreadContext;

        // Parameters collected per position
        final List<ParameterCollector> params;

        MethodCollector(String name, String descriptor, String[] exceptions) {
            super(Opcodes.ASM9);
            this.methodName = name;
            this.methodDescriptor = descriptor;
            this.exceptions = exceptions;
            Type[] argTypes = Type.getArgumentTypes(descriptor);
            this.params = new ArrayList<>(argTypes.length);
            for (int i = 0; i < argTypes.length; i++) {
                params.add(new ParameterCollector("arg" + i, argTypes[i].getDescriptor()));
            }
        }

        @Override
        public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
            if (DESC_MESSAGE.equals(descriptor)) {
                return new InterfaceAnnotationVisitor() {
                    @Override void onValue(String name, Object value) {
                        if ("id".equals(name)) messageId = (int) value;
                        else if ("value".equals(name)) messageValue = (String) value;
                        else if ("format".equals(name)) {
                            // value is an array [descriptor, enumName] from ASM enum visit
                            messageFormat = parseFormat(value.toString());
                        }
                    }
                    @Override public void visitEnum(String name, String descriptor, String value) {
                        if ("format".equals(name)) messageFormat = parseFormat(value);
                    }
                };
            }
            if (DESC_LOG_MESSAGE.equals(descriptor)) {
                isLogMethod = true;
                return new InterfaceAnnotationVisitor() {
                    @Override void onValue(String name, Object value) {
                        if ("useThreadContext".equals(name)) useThreadContext = (boolean) value;
                    }
                    @Override public void visitEnum(String name, String descriptor, String value) {
                        if ("level".equals(name)) logLevel = value;
                    }
                };
            }
            return null;
        }

        @Override
        public AnnotationVisitor visitParameterAnnotation(int parameter, String descriptor, boolean visible) {
            if (parameter >= params.size()) return null;
            ParameterCollector pc = params.get(parameter);
            return pc.visitAnnotation(descriptor);
        }

        @Override
        public void visitLocalVariable(String name, String descriptor, String signature,
                Label start, Label end, int index) {
            // index 0 is 'this' in instance methods; interface methods are abstract so
            // local variable tables are rarely present. Use if available.
            if (index > 0 && index - 1 < params.size()) {
                params.get(index - 1).name = name;
            }
        }

        int countFormatParams() {
            int count = 0;
            for (ParameterCollector pc : params) {
                if (pc.isFormatParam()) count++;
            }
            return count;
        }

        MethodDescriptor toDescriptor(String messageMethodName, String translationKey) {
            Type returnType = Type.getReturnType(methodDescriptor);
            List<ParameterDescriptor> paramDescs = new ArrayList<>();
            for (ParameterCollector pc : params) {
                paramDescs.add(pc.build());
            }
            List<String> thrownTypes = new ArrayList<>();
            if (exceptions != null) {
                for (String ex : exceptions) thrownTypes.add("L" + ex + ";");
            }
            return new MethodDescriptor(
                    methodName, methodDescriptor, returnType.getDescriptor(),
                    messageId, messageValue, messageFormat,
                    isLogMethod, logLevel, useThreadContext,
                    paramDescs, thrownTypes, countFormatParams(),
                    messageMethodName, translationKey);
        }

        private MessageFormat parseFormat(String name) {
            if ("PRINTF".equals(name)) return MessageFormat.PRINTF;
            if ("NO_FORMAT".equals(name)) return MessageFormat.NO_FORMAT;
            return MessageFormat.MESSAGE_FORMAT;
        }
    }

    // ── Per-parameter collector ───────────────────────────────────────────

    private static class ParameterCollector {
        String name;
        final String type;
        boolean isCause, isParam, isField, isProperty, isLoggingClass,
                isSuppressed, isProducer, isTransformException, copyStackTrace;
        boolean isArray, isVarArgs, isSupplier, supplierTypeArgIsArray;
        String formatterClass;
        TransformDescriptor transformAnnotation;
        PosDescriptor posAnnotation;
        String fieldTargetName;
        String propertyTargetName;

        ParameterCollector(String name, String type) {
            this.name = name;
            this.type = type;
            this.isArray = type.startsWith("[");
            this.isSupplier = type.contains("Supplier");
        }

        AnnotationVisitor visitAnnotation(String descriptor) {
            if (DESC_CAUSE.equals(descriptor)) { isCause = true; return null; }
            if (DESC_PARAM.equals(descriptor)) { isParam = true; return null; }
            if (DESC_LOGGING_CLASS_IFACE.equals(descriptor)) { isLoggingClass = true; return null; }
            if (DESC_SUPPRESSED.equals(descriptor)) { isSuppressed = true; return null; }
            if (DESC_PRODUCER.equals(descriptor)) { isProducer = true; return null; }
            if (DESC_TRANSFORM_EXCEPTION.equals(descriptor)) {
                isTransformException = true;
                return new InterfaceAnnotationVisitor() {
                    @Override void onValue(String n, Object v) {
                        if ("copyStackTrace".equals(n)) copyStackTrace = (boolean) v;
                    }
                };
            }
            if (DESC_FORMAT_WITH.equals(descriptor)) {
                return new InterfaceAnnotationVisitor() {
                    @Override public void visit(String name, Object value) {
                        // value is org.objectweb.asm.Type for class-valued annotation elements
                        if (value instanceof org.objectweb.asm.Type) {
                            formatterClass = ((org.objectweb.asm.Type) value).getClassName();
                        }
                    }
                };
            }
            if (DESC_FIELD.equals(descriptor)) {
                isField = true;
                return new InterfaceAnnotationVisitor() {
                    @Override void onValue(String n, Object v) {
                        if ("name".equals(n)) fieldTargetName = (String) v;
                    }
                };
            }
            if (DESC_PROPERTY.equals(descriptor)) {
                isProperty = true;
                return new InterfaceAnnotationVisitor() {
                    @Override void onValue(String n, Object v) {
                        if ("name".equals(n)) propertyTargetName = (String) v;
                    }
                };
            }
            if (DESC_TRANSFORM.equals(descriptor)) {
                final List<String> types = new ArrayList<>();
                return new AnnotationVisitor(Opcodes.ASM9) {
                    @Override public void visitEnum(String name, String desc, String value) {
                        types.add(value);
                    }
                    @Override public void visitEnd() {
                        transformAnnotation = new TransformDescriptor(types);
                    }
                };
            }
            if (DESC_POS.equals(descriptor)) {
                final List<Integer> positions = new ArrayList<>();
                final List<TransformDescriptor> transforms = new ArrayList<>();
                return new AnnotationVisitor(Opcodes.ASM9) {
                    @Override public AnnotationVisitor visitArray(String name) {
                        if ("value".equals(name)) {
                            return new AnnotationVisitor(Opcodes.ASM9) {
                                @Override public void visit(String n, Object v) { positions.add((int) v); }
                            };
                        }
                        if ("transform".equals(name)) {
                            return new AnnotationVisitor(Opcodes.ASM9) {
                                @Override public AnnotationVisitor visitAnnotation(String n, String d) {
                                    final List<String> tt = new ArrayList<>();
                                    return new AnnotationVisitor(Opcodes.ASM9) {
                                        @Override public void visitEnum(String nm, String desc, String val) {
                                            tt.add(val);
                                        }
                                        @Override public void visitEnd() {
                                            transforms.add(new TransformDescriptor(tt));
                                        }
                                    };
                                }
                            };
                        }
                        return null;
                    }
                    @Override public void visitEnd() {
                        int[] pos = positions.stream().mapToInt(Integer::intValue).toArray();
                        TransformDescriptor[] td = transforms.toArray(new TransformDescriptor[0]);
                        posAnnotation = new PosDescriptor(pos, td);
                    }
                };
            }
            return null;
        }

        boolean isFormatParam() {
            return !isCause && !isParam && !isField && !isProperty && !isSuppressed && !isLoggingClass;
        }

        ParameterDescriptor build() {
            return ParameterDescriptor.builder(name, type)
                    .cause(isCause)
                    .param(isParam)
                    .formatParam(isFormatParam())
                    .field(isField)
                    .property(isProperty)
                    .loggingClass(isLoggingClass)
                    .suppressed(isSuppressed)
                    .producer(isProducer)
                    .transformException(isTransformException)
                    .copyStackTrace(copyStackTrace)
                    .array(isArray)
                    .varArgs(isVarArgs)
                    .supplier(isSupplier)
                    .supplierTypeArgIsArray(supplierTypeArgIsArray)
                    .formatterClass(formatterClass)
                    .transformAnnotation(transformAnnotation)
                    .posAnnotation(posAnnotation)
                    .fieldTargetName(fieldTargetName)
                    .propertyTargetName(propertyTargetName)
                    .build();
        }
    }

    // ── Utility base visitor ──────────────────────────────────────────────

    private abstract static class InterfaceAnnotationVisitor extends AnnotationVisitor {
        InterfaceAnnotationVisitor() { super(Opcodes.ASM9); }
        @Override public void visit(String name, Object value) { onValue(name, value); }
        void onValue(String name, Object value) {}
    }
}
