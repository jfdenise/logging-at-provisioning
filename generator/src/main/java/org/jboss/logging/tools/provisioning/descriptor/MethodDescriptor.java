package org.jboss.logging.tools.provisioning.descriptor;

import java.util.List;

/**
 * Metadata for one @Message method in a source interface, extracted from bytecode.
 */
public class MethodDescriptor {

    /** Method name. */
    public final String name;

    /** JVM method descriptor, e.g. "(Ljava/lang/String;)V". */
    public final String descriptor;

    /** JVM type descriptor of the return type, e.g. "Ljava/lang/Throwable;" or "V". */
    public final String returnType;

    /** @Message.id() — may be Message.INHERIT (-1) or Message.NONE (0). */
    public final int messageId;

    /** @Message.value() — the message template string. */
    public final String messageValue;

    /** @Message.format() decoded to our local enum. */
    public final MessageFormat messageFormat;

    /** True if @LogMessage is present. */
    public final boolean isLogMethod;

    /** @LogMessage.level().name(), or null for bundle methods. */
    public final String logLevel;

    /** @LogMessage.useThreadContext(). */
    public final boolean useThreadContext;

    /** Ordered list of all parameters. */
    public final List<ParameterDescriptor> parameters;

    /** JVM type descriptors of checked exceptions in the throws clause. */
    public final List<String> thrownTypes;

    /** Number of format parameters (isFormatParam == true). */
    public final int formatParameterCount;

    /**
     * Name of the $str helper method for this message — see spec §1.4.1.
     * E.g. "myMethod$str" or "myMethod2$str" for overloaded methods.
     */
    public final String messageMethodName;

    /**
     * Key used in .properties translation files — see spec §1.4.1.
     * E.g. "myMethod" or "myMethod.2" for overloaded methods.
     */
    public final String translationKey;

    public MethodDescriptor(String name, String descriptor, String returnType,
            int messageId, String messageValue, MessageFormat messageFormat,
            boolean isLogMethod, String logLevel, boolean useThreadContext,
            List<ParameterDescriptor> parameters, List<String> thrownTypes,
            int formatParameterCount, String messageMethodName, String translationKey) {
        this.name = name;
        this.descriptor = descriptor;
        this.returnType = returnType;
        this.messageId = messageId;
        this.messageValue = messageValue;
        this.messageFormat = messageFormat;
        this.isLogMethod = isLogMethod;
        this.logLevel = logLevel;
        this.useThreadContext = useThreadContext;
        this.parameters = List.copyOf(parameters);
        this.thrownTypes = List.copyOf(thrownTypes);
        this.formatParameterCount = formatParameterCount;
        this.messageMethodName = messageMethodName;
        this.translationKey = translationKey;
    }

    @Override
    public String toString() {
        return "MethodDescriptor{name='" + name + "', descriptor='" + descriptor + "'}";
    }
}
