package org.wildfly.extension.core.management.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.Throwable;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:27:17+0200")
public class CoreManagementLogger_$logger extends DelegatingBasicLogger implements CoreManagementLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = CoreManagementLogger_$logger.class.getName();
    public CoreManagementLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String processStateInitError$str() {
        return "WFLYCM0002: Error initializing the process state listener %s";
    }
    @Override
    public final String processStateInitError(final Throwable t, final String name) {
        return String.format(getLoggingLocale(), processStateInitError$str(), name);
    }
    @Override
    public final void processStateInvokationError(final Throwable t, final String name) {
        super.log.logf(FQCN, ERROR, t, processStateInvokationError$str(), name);
    }
    protected String processStateInvokationError$str() {
        return "WFLYCM0003: Error invoking the process state listener %s";
    }
    @Override
    public final void processStateTimeoutError(final Throwable t, final String name) {
        super.log.logf(FQCN, ERROR, t, processStateTimeoutError$str(), name);
    }
    protected String processStateTimeoutError$str() {
        return "WFLYCM0004: The process state listener %s took to much time to complete.";
    }
    @Override
    public final void processStateCleanupError(final Throwable t, final String name) {
        super.log.logf(FQCN, ERROR, t, processStateCleanupError$str(), name);
    }
    protected String processStateCleanupError$str() {
        return "WFLYCM0005: Error cleaning up for the process state listener %s";
    }
    protected String errorToLoadModule$str() {
        return "WFLYCM0006: Error to load module %s";
    }
    @Override
    public final OperationFailedException errorToLoadModule(final String moduleID) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), errorToLoadModule$str(), moduleID));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String errorToLoadModuleClass$str() {
        return "WFLYCM0007: Error to load class %s from module %s";
    }
    @Override
    public final OperationFailedException errorToLoadModuleClass(final String className, final String moduleID) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), errorToLoadModuleClass$str(), className, moduleID));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorToInstantiateClassInstanceFromModule$str() {
        return "WFLYCM0008: Error to instantiate instance of class %s from module %s";
    }
    @Override
    public final OperationFailedException errorToInstantiateClassInstanceFromModule(final String className, final String moduleID) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), errorToInstantiateClassInstanceFromModule$str(), className, moduleID));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String deploymentContainsUnstableApiAnnotations$str() {
        return "WFLYCM0009: %s contains usage of annotations which indicate unstable API.";
    }
    @Override
    public final String deploymentContainsUnstableApiAnnotations(final String deployment) {
        return String.format(getLoggingLocale(), deploymentContainsUnstableApiAnnotations$str(), deployment);
    }
    protected String classExtendsClassWithUnstableApiAnnotations$str() {
        return "WFLYCM0010: %s extends %s which has been annotated with %s";
    }
    @Override
    public final String classExtendsClassWithUnstableApiAnnotations(final String sourceClass, final String superClass, final Set<String> annotations) {
        return String.format(getLoggingLocale(), classExtendsClassWithUnstableApiAnnotations$str(), sourceClass, superClass, annotations);
    }
    protected String classImplementsInterfaceWithUnstableApiAnnotations$str() {
        return "WFLYCM0011: %s implements %s which has been annotated with %s";
    }
    @Override
    public final String classImplementsInterfaceWithUnstableApiAnnotations(final String sourceClass, final String superClass, final Set<String> annotations) {
        return String.format(getLoggingLocale(), classImplementsInterfaceWithUnstableApiAnnotations$str(), sourceClass, superClass, annotations);
    }
    protected String classReferencesFieldWithUnstableApiAnnotations$str() {
        return "WFLYCM0012: %s references field %s.%s which has been annotated with %s";
    }
    @Override
    public final String classReferencesFieldWithUnstableApiAnnotations(final String sourceClass, final String fieldClass, final String fieldName, final Set<String> annotations) {
        return String.format(getLoggingLocale(), classReferencesFieldWithUnstableApiAnnotations$str(), sourceClass, fieldClass, fieldName, annotations);
    }
    protected String classReferencesMethodWithUnstableApiAnnotations$str() {
        return "WFLYCM0013: %s references method %s.%s%s which has been annotated with %s";
    }
    @Override
    public final String classReferencesMethodWithUnstableApiAnnotations(final String sourceClass, final String methodClass, final String methodName, final String methodSignature, final Set<String> annotations) {
        return String.format(getLoggingLocale(), classReferencesMethodWithUnstableApiAnnotations$str(), sourceClass, methodClass, methodName, methodSignature, annotations);
    }
    protected String classReferencesClassWithUnstableApiAnnotations$str() {
        return "WFLYCM0014: %s references class %s which has been annotated with %s";
    }
    @Override
    public final String classReferencesClassWithUnstableApiAnnotations(final String sourceClass, final String referencedClass, final Set<String> annotations) {
        return String.format(getLoggingLocale(), classReferencesClassWithUnstableApiAnnotations$str(), sourceClass, referencedClass, annotations);
    }
    protected String classUsesAnnotatedAnnotations$str() {
        return "WFLYCM0015: Class %s is annotated with one or more annotations which in turn have been annotated with annotations indicating unstable api: %s";
    }
    @Override
    public final String classUsesAnnotatedAnnotations(final String clazz, final Set<String> annotations) {
        return String.format(getLoggingLocale(), classUsesAnnotatedAnnotations$str(), clazz, annotations);
    }
    @Override
    public final void testOutputNumberOfClassesScanned(final int number) {
        super.log.logf(FQCN, INFO, null, testOutputNumberOfClassesScanned$str(), number);
    }
    protected String testOutputNumberOfClassesScanned$str() {
        return "WFLYCM0016: %d";
    }
}
