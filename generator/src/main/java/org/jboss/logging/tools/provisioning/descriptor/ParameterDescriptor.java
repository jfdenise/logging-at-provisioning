package org.jboss.logging.tools.provisioning.descriptor;

/**
 * Metadata for one parameter of a @Message method, extracted from bytecode.
 * All annotation flags are derived from class-file annotation attributes (RetentionPolicy.CLASS).
 */
public class ParameterDescriptor {

    /** Parameter name from LocalVariableTable, or "arg0", "arg1", … */
    public final String name;

    /** JVM type descriptor, e.g. "Ljava/lang/String;" or "I". */
    public final String type;

    // ── annotation flags ──────────────────────────────────────────────────

    /** @Cause — this parameter is the exception cause. */
    public final boolean isCause;

    /** @Param — constructor-injection parameter. */
    public final boolean isParam;

    /**
     * Format parameter: no special annotation (@Cause, @Param, @Field, @Property,
     * @Suppressed, @LoggingClass) is present.
     */
    public final boolean isFormatParam;

    /** @Field / @Fields — sets a field on the returned exception. */
    public final boolean isField;

    /** @Property / @Properties — calls a setter on the returned exception. */
    public final boolean isProperty;

    /** @LoggingClass — overrides the FQCN used for log records. */
    public final boolean isLoggingClass;

    /** @Suppressed — adds this exception as a suppressed throwable on the returned exception. */
    public final boolean isSuppressed;

    /**
     * @Producer — provides the exception instance via Function/BiFunction rather than
     * constructing it directly.
     */
    public final boolean isProducer;

    /** @TransformException — re-wraps an incoming exception into the return type. */
    public final boolean isTransformException;

    /** @TransformException.copyStackTrace() — only meaningful when isTransformException. */
    public final boolean copyStackTrace;

    // ── type flags ────────────────────────────────────────────────────────

    /** Parameter type is an array or varargs. */
    public final boolean isArray;

    /** Parameter is declared as varargs (…). */
    public final boolean isVarArgs;

    /** Parameter type is a subtype of java.util.function.Supplier. */
    public final boolean isSupplier;

    /**
     * True when isSupplier and the Supplier's type argument is an array type.
     * Needed for Arrays.toString() wrapping in the generated source.
     */
    public final boolean supplierTypeArgIsArray;

    // ── annotation value fields ───────────────────────────────────────────

    /** @FormatWith value (FQCN of the formatter class), or null if absent. */
    public final String formatterClass;

    /** Decoded @Transform, or null if absent. */
    public final TransformDescriptor transformAnnotation;

    /** Decoded @Pos, or null if absent. */
    public final PosDescriptor posAnnotation;

    /** @Field.name() or first @Fields entry name, or null. */
    public final String fieldTargetName;

    /** @Property.name() or first @Properties entry name, or null. */
    public final String propertyTargetName;

    private ParameterDescriptor(Builder b) {
        this.name = b.name;
        this.type = b.type;
        this.isCause = b.isCause;
        this.isParam = b.isParam;
        this.isFormatParam = b.isFormatParam;
        this.isField = b.isField;
        this.isProperty = b.isProperty;
        this.isLoggingClass = b.isLoggingClass;
        this.isSuppressed = b.isSuppressed;
        this.isProducer = b.isProducer;
        this.isTransformException = b.isTransformException;
        this.copyStackTrace = b.copyStackTrace;
        this.isArray = b.isArray;
        this.isVarArgs = b.isVarArgs;
        this.isSupplier = b.isSupplier;
        this.supplierTypeArgIsArray = b.supplierTypeArgIsArray;
        this.formatterClass = b.formatterClass;
        this.transformAnnotation = b.transformAnnotation;
        this.posAnnotation = b.posAnnotation;
        this.fieldTargetName = b.fieldTargetName;
        this.propertyTargetName = b.propertyTargetName;
    }

    @Override
    public String toString() {
        return "ParameterDescriptor{name='" + name + "', type='" + type + "'}";
    }

    public static Builder builder(String name, String type) {
        return new Builder(name, type);
    }

    public static final class Builder {
        private final String name;
        private final String type;
        private boolean isCause;
        private boolean isParam;
        private boolean isFormatParam;
        private boolean isField;
        private boolean isProperty;
        private boolean isLoggingClass;
        private boolean isSuppressed;
        private boolean isProducer;
        private boolean isTransformException;
        private boolean copyStackTrace;
        private boolean isArray;
        private boolean isVarArgs;
        private boolean isSupplier;
        private boolean supplierTypeArgIsArray;
        private String formatterClass;
        private TransformDescriptor transformAnnotation;
        private PosDescriptor posAnnotation;
        private String fieldTargetName;
        private String propertyTargetName;

        private Builder(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public Builder cause(boolean v) { this.isCause = v; return this; }
        public Builder param(boolean v) { this.isParam = v; return this; }
        public Builder formatParam(boolean v) { this.isFormatParam = v; return this; }
        public Builder field(boolean v) { this.isField = v; return this; }
        public Builder property(boolean v) { this.isProperty = v; return this; }
        public Builder loggingClass(boolean v) { this.isLoggingClass = v; return this; }
        public Builder suppressed(boolean v) { this.isSuppressed = v; return this; }
        public Builder producer(boolean v) { this.isProducer = v; return this; }
        public Builder transformException(boolean v) { this.isTransformException = v; return this; }
        public Builder copyStackTrace(boolean v) { this.copyStackTrace = v; return this; }
        public Builder array(boolean v) { this.isArray = v; return this; }
        public Builder varArgs(boolean v) { this.isVarArgs = v; return this; }
        public Builder supplier(boolean v) { this.isSupplier = v; return this; }
        public Builder supplierTypeArgIsArray(boolean v) { this.supplierTypeArgIsArray = v; return this; }
        public Builder formatterClass(String v) { this.formatterClass = v; return this; }
        public Builder transformAnnotation(TransformDescriptor v) { this.transformAnnotation = v; return this; }
        public Builder posAnnotation(PosDescriptor v) { this.posAnnotation = v; return this; }
        public Builder fieldTargetName(String v) { this.fieldTargetName = v; return this; }
        public Builder propertyTargetName(String v) { this.propertyTargetName = v; return this; }

        public ParameterDescriptor build() {
            return new ParameterDescriptor(this);
        }
    }
}
