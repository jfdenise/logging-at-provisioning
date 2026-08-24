package org.jboss.logging.tools.provisioning.descriptor;

import java.util.ArrayList;
import java.util.List;

/**
 * All metadata needed to regenerate the implementation class(es) for one
 * @MessageLogger or @MessageBundle source interface. See spec §1.4.
 */
public class InterfaceDescriptor {

    /**
     * Internal (binary) class name with '/' separators,
     * e.g. "org/jboss/as/web/WebLogger".
     */
    public final String binaryName;

    /** Package name with '.' separators, e.g. "org.jboss.as.web". */
    public final String packageName;

    /** Simple class name, e.g. "WebLogger". */
    public final String simpleName;

    /** Fully-qualified class name with '.' separators, e.g. "org.jboss.as.web.WebLogger". */
    public final String qualifiedName;

    /** @MessageLogger.projectCode() or @MessageBundle.projectCode(). */
    public final String projectCode;

    /** @MessageLogger.length() / @MessageBundle.length() — default 6. */
    public final int idPadLength;

    /**
     * @MessageLogger.rootLocale() / @MessageBundle.rootLocale() — default "".
     * BCP-47 tag or empty string for root locale.
     */
    public final String rootLocale;

    /** Whether this interface is @MessageLogger or @MessageBundle. */
    public final InterfaceKind kind;

    /**
     * True if org/jboss/logging/BasicLogger is among the directly declared
     * superinterfaces of this interface.
     */
    public final boolean extendsBasicLogger;

    /**
     * Value of @LoggingClass on the interface itself, or null if absent.
     * Overrides the FQCN recorded in log records.
     */
    public final String loggingFQCN;

    /** All @Message methods in declaration order. */
    public final List<MethodDescriptor> methods;

    /**
     * Binary names of directly declared superinterfaces (other than BasicLogger),
     * e.g. ["org/jboss/as/controller/logging/ControllerLogger"].
     */
    public final List<String> extendedInterfaces;

    /**
     * Major version of the class file (e.g. 55 for Java 11, 61 for Java 17).
     * Used to derive the --release flag for the compilation step.
     */
    public final int classFileMajorVersion;

    /**
     * Translation files discovered for this interface, sorted by locale specificity
     * (less-specific first, e.g. _de before _de_DE). See spec §1.7.5.
     */
    public final List<TranslationFileDescriptor> translationFiles;

    public InterfaceDescriptor(String binaryName, String projectCode, int idPadLength,
            String rootLocale, InterfaceKind kind, boolean extendsBasicLogger,
            String loggingFQCN, List<MethodDescriptor> methods,
            List<String> extendedInterfaces, int classFileMajorVersion) {
        this.binaryName = binaryName;
        int lastSlash = binaryName.lastIndexOf('/');
        this.simpleName = lastSlash < 0 ? binaryName : binaryName.substring(lastSlash + 1);
        this.packageName = lastSlash < 0 ? "" : binaryName.substring(0, lastSlash).replace('/', '.');
        this.qualifiedName = binaryName.replace('/', '.');
        this.projectCode = projectCode;
        this.idPadLength = idPadLength;
        this.rootLocale = rootLocale;
        this.kind = kind;
        this.extendsBasicLogger = extendsBasicLogger;
        this.loggingFQCN = loggingFQCN;
        this.methods = List.copyOf(methods);
        this.extendedInterfaces = List.copyOf(extendedInterfaces);
        this.classFileMajorVersion = classFileMajorVersion;
        this.translationFiles = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "InterfaceDescriptor{binaryName='" + binaryName + "', kind=" + kind + '}';
    }
}
