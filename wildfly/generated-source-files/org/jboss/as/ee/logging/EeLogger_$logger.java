package org.jboss.as.ee.logging;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import org.jboss.vfs.VirtualFile;
import java.lang.IllegalStateException;
import java.io.Serializable;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.as.ee.component.ComponentIsStoppedException;
import org.jboss.logging.Logger;
import org.jboss.jandex.DotName;
import java.lang.reflect.Field;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import org.jboss.as.ee.component.ComponentInstance;
import java.lang.ClassLoader;
import org.jboss.msc.service.StartException;
import java.lang.IllegalArgumentException;
import org.jboss.as.ee.component.BindingConfiguration;
import org.jboss.jandex.AnnotationTarget;
import javax.annotation.processing.Generated;
import javax.xml.namespace.QName;
import org.jboss.as.controller.OperationFailedException;
import org.jboss.invocation.proxy.MethodIdentifier;
import java.lang.reflect.Method;
import java.io.IOException;
import java.lang.Exception;
import java.util.concurrent.RejectedExecutionException;
import org.jboss.as.ee.component.ComponentConfiguration;
import javax.xml.stream.XMLStreamException;
import org.jboss.msc.service.ServiceName;
import org.jboss.as.ee.component.InjectionSource;
import java.lang.Throwable;
import java.util.Collection;
import java.lang.Class;
import java.lang.Object;
import org.jboss.jandex.MethodInfo;
import java.util.Arrays;
import javax.xml.stream.Location;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:15+0200")
public class EeLogger_$logger extends DelegatingBasicLogger implements EeLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = EeLogger_$logger.class.getName();
    public EeLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void cannotResolve(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, cannotResolve$str(), arg0, arg1);
    }
    protected String cannotResolve$str() {
        return "WFLYEE0002: Could not resolve %s %s";
    }
    @Override
    public final void componentDestroyFailure(final Throwable arg0, final ComponentInstance arg1) {
        super.log.logf(FQCN, WARN, arg0, componentDestroyFailure$str(), arg1);
    }
    protected String componentDestroyFailure$str() {
        return "WFLYEE0006: Failed to destroy component instance %s";
    }
    @Override
    public final void componentInstallationFailure(final String arg0) {
        super.log.logf(FQCN, WARN, null, componentInstallationFailure$str(), arg0);
    }
    protected String componentInstallationFailure$str() {
        return "WFLYEE0007: Not installing optional component %s due to an exception (enable DEBUG log level to see the cause)";
    }
    @Override
    public final void invalidManagedBeanAbstractOrFinal(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, invalidManagedBeanAbstractOrFinal$str(), arg0, arg1);
    }
    protected String invalidManagedBeanAbstractOrFinal$str() {
        return "WFLYEE0009: [Managed Bean spec, section %s] Managed bean implementation class MUST NOT be an interface - %s is an interface, hence won't be considered as a managed bean.";
    }
    @Override
    public final void invalidManagedBeanInterface(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, invalidManagedBeanInterface$str(), arg0, arg1);
    }
    protected String invalidManagedBeanInterface$str() {
        return "WFLYEE0010: [Managed Bean spec, section %s] Managed bean implementation class MUST NOT be abstract or final - %s won't be considered as a managed bean, since it doesn't meet that requirement.";
    }
    @Override
    public final void preDestroyInterceptorFailure(final Throwable arg0, final Class<?> arg1) {
        super.log.logf(FQCN, WARN, arg0, preDestroyInterceptorFailure$str(), arg1);
    }
    protected String preDestroyInterceptorFailure$str() {
        return "WFLYEE0011: Exception while invoking pre-destroy interceptor for component class: %s";
    }
    @Override
    public final void subdeploymentIgnored(final String arg0) {
        super.log.logf(FQCN, WARN, null, subdeploymentIgnored$str(), arg0);
    }
    protected String subdeploymentIgnored$str() {
        return "WFLYEE0014: %s in subdeployment ignored. jboss-ejb-client.xml is only parsed for top level deployments.";
    }
    @Override
    public final void rollbackOfTransactionStartedInEEConcurrentInvocation() {
        super.log.logf(FQCN, WARN, null, rollbackOfTransactionStartedInEEConcurrentInvocation$str());
    }
    protected String rollbackOfTransactionStartedInEEConcurrentInvocation$str() {
        return "WFLYEE0015: Transaction started in EE Concurrent invocation left open, starting rollback to prevent leak.";
    }
    @Override
    public final void failedToRollbackTransaction(final Throwable arg0) {
        super.log.logf(FQCN, WARN, arg0, failedToRollbackTransaction$str());
    }
    protected String failedToRollbackTransaction$str() {
        return "WFLYEE0016: Failed to rollback transaction.";
    }
    @Override
    public final void failedToSuspendTransaction(final Throwable arg0) {
        super.log.logf(FQCN, WARN, arg0, failedToSuspendTransaction$str());
    }
    protected String failedToSuspendTransaction$str() {
        return "WFLYEE0017: Failed to suspend transaction.";
    }
    @Override
    public final void systemErrorWhileCheckingForTransactionLeak(final Throwable arg0) {
        super.log.logf(FQCN, WARN, arg0, systemErrorWhileCheckingForTransactionLeak$str());
    }
    protected String systemErrorWhileCheckingForTransactionLeak$str() {
        return "WFLYEE0018: System error while checking for transaction leak in EE Concurrent invocation.";
    }
    protected String alternateDeploymentDescriptor$str() {
        return "WFLYEE0019: Could not find alternate deployment descriptor %s specified for %s";
    }
    @Override
    public final DeploymentUnitProcessingException alternateDeploymentDescriptor(final VirtualFile arg0, final VirtualFile arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), alternateDeploymentDescriptor$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String annotationAttributeMissing$str() {
        return "WFLYEE0020: %s annotations must provide a %s.";
    }
    @Override
    public final IllegalArgumentException annotationAttributeMissing(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), annotationAttributeMissing$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAddMoreItems$str() {
        return "WFLYEE0021: Cannot add any more items once getSortedItems() has been called";
    }
    @Override
    public final IllegalStateException cannotAddMoreItems() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotAddMoreItems$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotBeEmpty$str() {
        return "WFLYEE0022: %s may not be empty";
    }
    @Override
    public final RuntimeException cannotBeEmpty(final String arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotBeEmpty$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotBeNullOrEmpty$str() {
        return "WFLYEE0023: %s cannot be null or empty: %s";
    }
    @Override
    public final IllegalArgumentException cannotBeNullOrEmpty(final String arg0, final Object arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotBeNullOrEmpty$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotConfigureComponent$str() {
        return "WFLYEE0024: Could not configure component %s";
    }
    @Override
    public final DeploymentUnitProcessingException cannotConfigureComponent(final Throwable arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotConfigureComponent$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotDetermineType1$str() {
        return "WFLYEE0025: Could not determine type for resource-env-ref %s";
    }
    @Override
    public final DeploymentUnitProcessingException cannotDetermineType(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotDetermineType1$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotDetermineType3$str() {
        return "WFLYEE0026: Could not determine type for %s %s please specify the %s.";
    }
    @Override
    public final DeploymentUnitProcessingException cannotDetermineType(final String arg0, final String arg1, final String arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotDetermineType3$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotLoad$str() {
        return "WFLYEE0027: Could not load %s referenced in env-entry";
    }
    @Override
    public final DeploymentUnitProcessingException cannotLoad(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotLoad$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final DeploymentUnitProcessingException cannotLoad(final Throwable arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotLoad$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotLoadInterceptor1$str() {
        return "WFLYEE0028: Could not load interceptor class %s";
    }
    @Override
    public final RuntimeException cannotLoadInterceptor(final Throwable arg0, final String arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotLoadInterceptor1$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotLoadInterceptor2$str() {
        return "WFLYEE0029: Could not load interceptor class %s on component %s";
    }
    @Override
    public final DeploymentUnitProcessingException cannotLoadInterceptor(final Throwable arg0, final String arg1, final Class<?> arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotLoadInterceptor2$str(), arg1, arg2), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotLoadViewClass$str() {
        return "WFLYEE0030: Could not load view class %s for component %s";
    }
    @Override
    public final DeploymentUnitProcessingException cannotLoadViewClass(final Throwable arg0, final String arg1, final ComponentConfiguration arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotLoadViewClass$str(), arg1, arg2), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotProcessEarModule$str() {
        return "WFLYEE0031: Unable to process modules in application.xml for EAR [%s], module file %s not found";
    }
    @Override
    public final DeploymentUnitProcessingException cannotProcessEarModule(final VirtualFile arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotProcessEarModule$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotParseResourceRefUri$str() {
        return "WFLYEE0032: Unable to parse resource-ref URI: %s";
    }
    @Override
    public final DeploymentUnitProcessingException cannotParseResourceRefUri(final Throwable arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotParseResourceRefUri$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotResolveInjectionPoint$str() {
        return "WFLYEE0033: Could not resolve injection point %s on class %s specified in web.xml";
    }
    @Override
    public final DeploymentUnitProcessingException cannotResolveInjectionPoint(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotResolveInjectionPoint$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotResolveMethod$str() {
        return "WFLYEE0034: Could not resolve method %s on class %s with annotations %s";
    }
    @Override
    public final RuntimeException cannotResolveMethod(final MethodIdentifier arg0, final Class<?> arg1, final Collection<?> arg2) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotResolveMethod$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotSpecifyBoth$str() {
        return "WFLYEE0036: Cannot specify both a %s and a %s in an environment entry.";
    }
    @Override
    public final DeploymentUnitProcessingException cannotSpecifyBoth(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotSpecifyBoth$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String circularDependency$str() {
        return "WFLYEE0037: Circular dependency installing %s";
    }
    @Override
    public final IllegalArgumentException circularDependency(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), circularDependency$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String classOnlyAnnotation$str() {
        return "WFLYEE0038: %s annotation is only allowed on a class. %s is not a class.";
    }
    @Override
    public final DeploymentUnitProcessingException classOnlyAnnotation(final String arg0, final AnnotationTarget arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), classOnlyAnnotation$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String componentAlreadyDefined$str() {
        return "WFLYEE0040: Component '%s' in class '%s' is already defined in class '%s'";
    }
    @Override
    public final IllegalArgumentException componentAlreadyDefined(final String arg0, final String arg1, final String arg2) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), componentAlreadyDefined$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String componentClassHasErrors$str() {
        return "WFLYEE0041: Component class %s for component %s has errors: %n%s";
    }
    @Override
    public final DeploymentUnitProcessingException componentClassHasErrors(final String arg0, final String arg1, final String arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), componentClassHasErrors$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String componentConstructionFailure$str() {
        return "WFLYEE0042: Failed to construct component instance";
    }
    @Override
    public final IllegalStateException componentConstructionFailure(final Throwable arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), componentConstructionFailure$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String componentIsStopped$str() {
        return "WFLYEE0043: Component is stopped";
    }
    @Override
    public final ComponentIsStoppedException componentIsStopped() {
        final ComponentIsStoppedException result = new ComponentIsStoppedException(String.format(getLoggingLocale(), componentIsStopped$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String componentNotAvailable$str() {
        return "WFLYEE0044: Component not available (interrupted)";
    }
    @Override
    public final IllegalStateException componentNotAvailable() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), componentNotAvailable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String componentNotFound$str() {
        return "WFLYEE0045: No component found for type '%s'";
    }
    @Override
    public final DeploymentUnitProcessingException componentNotFound(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), componentNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String componentViewConstructionFailure$str() {
        return "WFLYEE0046: Failed to instantiate component view";
    }
    @Override
    public final IllegalStateException componentViewConstructionFailure(final Throwable arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), componentViewConstructionFailure$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String conflictingBinding$str() {
        return "WFLYEE0047: Incompatible conflicting binding at %s source: %s";
    }
    @Override
    public final IllegalArgumentException conflictingBinding(final String arg0, final InjectionSource arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), conflictingBinding$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String defaultConstructorNotFound$str() {
        return "WFLYEE0048: Could not find default constructor for %s";
    }
    @Override
    public final DeploymentUnitProcessingException defaultConstructorNotFound(final Class<?> arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), defaultConstructorNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String defaultConstructorNotFoundOnComponent$str() {
        return "WFLYEE0050: No default constructor for interceptor class %s on component %s";
    }
    @Override
    public final DeploymentUnitProcessingException defaultConstructorNotFoundOnComponent(final String arg0, final Class<?> arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), defaultConstructorNotFoundOnComponent$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String elementAttributeMissing$str() {
        return "WFLYEE0051: %s elements must provide a %s.";
    }
    @Override
    public final IllegalArgumentException elementAttributeMissing(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), elementAttributeMissing$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToInstallComponent$str() {
        return "WFLYEE0052: Failed to install component %s";
    }
    @Override
    public final DeploymentUnitProcessingException failedToInstallComponent(final Throwable arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToInstallComponent$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParse$str() {
        return "WFLYEE0053: Failed to parse %s";
    }
    @Override
    public final DeploymentUnitProcessingException failedToParse(final Throwable arg0, final VirtualFile arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToParse$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToProcessChild$str() {
        return "WFLYEE0054: Failed to process children for EAR [%s]";
    }
    @Override
    public final DeploymentUnitProcessingException failedToProcessChild(final Throwable arg0, final VirtualFile arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToProcessChild$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToRead2$str() {
        return "WFLYEE0055: Failed to read %s entries for application [%s]";
    }
    @Override
    public final String failedToRead(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), failedToRead2$str(), arg0, arg1);
    }
    protected String failedToRead3$str() {
        return "WFLYEE0056: Failed to read %s entries for module [%s, %s]";
    }
    @Override
    public final String failedToRead(final String arg0, final String arg1, final String arg2) {
        return String.format(getLoggingLocale(), failedToRead3$str(), arg0, arg1, arg2);
    }
    protected String failedToRead4$str() {
        return "WFLYEE0057: Failed to read %s entries for component [%s, %s, %s]";
    }
    @Override
    public final String failedToRead(final String arg0, final String arg1, final String arg2, final String arg3) {
        return String.format(getLoggingLocale(), failedToRead4$str(), arg0, arg1, arg2, arg3);
    }
    protected String fieldNotFound$str() {
        return "WFLYEE0058: No matching field found for '%s'";
    }
    @Override
    public final DeploymentUnitProcessingException fieldNotFound(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), fieldNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String injectionTargetNotFound$str() {
        return "WFLYEE0059: No injection target found";
    }
    @Override
    public final IllegalStateException injectionTargetNotFound() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), injectionTargetNotFound$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidCharacterLength$str() {
        return "WFLYEE0060: %s of type java.lang.Character is not exactly one character long %s";
    }
    @Override
    public final DeploymentUnitProcessingException invalidCharacterLength(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), invalidCharacterLength$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidDescriptor$str() {
        return "WFLYEE0061: %s is not a valid descriptor";
    }
    @Override
    public final RuntimeException invalidDescriptor(final String arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), invalidDescriptor$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidInjectionTarget$str() {
        return "WFLYEE0062: Injection target %s on class %s is not compatible with the type of injection: %s";
    }
    @Override
    public final DeploymentUnitProcessingException invalidInjectionTarget(final String arg0, final String arg1, final Class<?> arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), invalidInjectionTarget$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidNumberOfArguments$str() {
        return "WFLYEE0063: Invalid number of arguments for method %s annotated with %s on class %s";
    }
    @Override
    public final String invalidNumberOfArguments(final String arg0, final DotName arg1, final DotName arg2) {
        return String.format(getLoggingLocale(), invalidNumberOfArguments$str(), arg0, arg1, arg2);
    }
    protected String invalidReturnType$str() {
        return "WFLYEE0064: A return type of %s is required for method %s annotated with %s on class %s";
    }
    @Override
    public final IllegalArgumentException invalidReturnType(final String arg0, final String arg1, final DotName arg2, final DotName arg3) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidReturnType$str(), arg0, arg1, arg2, arg3));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidSignature$str() {
        return "WFLYEE0065: Invalid signature for method %s annotated with %s on class %s, signature must be '%s'";
    }
    @Override
    public final String invalidSignature(final String arg0, final DotName arg1, final DotName arg2, final String arg3) {
        return String.format(getLoggingLocale(), invalidSignature$str(), arg0, arg1, arg2, arg3);
    }
    protected String invalidValue$str() {
        return "WFLYEE0066: Invalid value: %s for '%s' element";
    }
    @Override
    public final XMLStreamException invalidValue(final String arg0, final String arg1, final Location arg2) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), invalidValue$str(), arg0, arg1), arg2);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String methodNotFound1$str() {
        return "WFLYEE0067: Method does not exist %s";
    }
    @Override
    public final IllegalStateException methodNotFound(final Method arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), methodNotFound1$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String methodNotFound3$str() {
        return "WFLYEE0068: No matching method found for method %s (%s) on %s";
    }
    @Override
    public final DeploymentUnitProcessingException methodNotFound(final String arg0, final String arg1, final String arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), methodNotFound3$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String methodOnlyAnnotation$str() {
        return "WFLYEE0069: @%s is only valid on method targets.";
    }
    @Override
    public final DeploymentUnitProcessingException methodOnlyAnnotation(final DotName arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), methodOnlyAnnotation$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleComponentsFound$str() {
        return "WFLYEE0070: Multiple components found for type '%s'";
    }
    @Override
    public final DeploymentUnitProcessingException multipleComponentsFound(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), multipleComponentsFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleMethodsFound$str() {
        return "WFLYEE0071: More than one matching method found for method '%s (%s) on %s";
    }
    @Override
    public final DeploymentUnitProcessingException multipleMethodsFound(final String arg0, final String arg1, final String arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), multipleMethodsFound$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleSetterMethodsFound$str() {
        return "WFLYEE0072: Multiple setter methods for %s on class %s found when applying <injection-target> for env-entry";
    }
    @Override
    public final DeploymentUnitProcessingException multipleSetterMethodsFound(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), multipleSetterMethodsFound$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noComponentInstance$str() {
        return "WFLYEE0073: No component instance associated";
    }
    @Override
    public final IllegalStateException noComponentInstance() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noComponentInstance$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullBindingName$str() {
        return "WFLYEE0074: Binding name must not be null: %s";
    }
    @Override
    public final DeploymentUnitProcessingException nullBindingName(final BindingConfiguration arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), nullBindingName$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullOrEmptyManagedBeanClassName$str() {
        return "WFLYEE0075: Managed bean class name cannot be null or empty";
    }
    @Override
    public final IllegalArgumentException nullOrEmptyManagedBeanClassName() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullOrEmptyManagedBeanClassName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullOrEmptyResourceReferenceType$str() {
        return "WFLYEE0076: Resource reference type cannot be null or empty";
    }
    @Override
    public final IllegalArgumentException nullOrEmptyResourceReferenceType() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullOrEmptyResourceReferenceType$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullResourceReference$str() {
        return "WFLYEE0077: Cannot register a null resource reference processor";
    }
    @Override
    public final IllegalArgumentException nullResourceReference() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullResourceReference$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullVar1$str() {
        return "WFLYEE0078: %s is null";
    }
    @Override
    public final IllegalArgumentException nullVar(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullVar1$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String priorityAlreadyExists$str() {
        return "WFLYEE0079: Can't add %s, priority 0x%s is already taken by %s";
    }
    @Override
    public final IllegalArgumentException priorityAlreadyExists(final Object arg0, final String arg1, final Object arg2) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), priorityAlreadyExists$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serviceNotStarted$str() {
        return "WFLYEE0082: Service not started";
    }
    @Override
    public final IllegalStateException serviceNotStarted() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serviceNotStarted$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String setterMethodOnly$str() {
        return "WFLYEE0083: %s injection target is invalid.  Only setter methods are allowed: %s";
    }
    @Override
    public final IllegalArgumentException setterMethodOnly(final String arg0, final MethodInfo arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), setterMethodOnly$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownAnnotationTargetType$str() {
        return "WFLYEE0084: Unknown AnnotationTarget type: %s";
    }
    @Override
    public final RuntimeException unknownAnnotationTargetType(final AnnotationTarget arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unknownAnnotationTargetType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownElementType$str() {
        return "WFLYEE0085: Unknown %s type %s";
    }
    @Override
    public final DeploymentUnitProcessingException unknownElementType(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), unknownElementType$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String viewMethodNotFound$str() {
        return "WFLYEE0086: Could not find method %s %s on view %s of %s";
    }
    @Override
    public final IllegalArgumentException viewMethodNotFound(final String arg0, final String arg1, final Class<?> arg2, final Class<?> arg3) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), viewMethodNotFound$str(), arg0, arg1, arg2, arg3));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedElement$str() {
        return "WFLYEE0088: Unexpected element '%s' encountered";
    }
    @Override
    public final XMLStreamException unexpectedElement(final QName arg0, final Location arg1) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unexpectedElement$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToProcessEJBClientDescriptor$str() {
        return "WFLYEE0089: Failed to process jboss-ejb-client.xml";
    }
    @Override
    public final DeploymentUnitProcessingException failedToProcessEJBClientDescriptor(final Throwable arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToProcessEJBClientDescriptor$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String xmlErrorParsingEJBClientDescriptor$str() {
        return "WFLYEE0090: Exception while parsing jboss-ejb-client.xml file found at %s";
    }
    @Override
    public final DeploymentUnitProcessingException xmlErrorParsingEJBClientDescriptor(final XMLStreamException arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), xmlErrorParsingEJBClientDescriptor$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorParsingEJBClientDescriptor$str() {
        return "WFLYEE0091: %s";
    }
    @Override
    public final XMLStreamException errorParsingEJBClientDescriptor(final String arg0, final Location arg1) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), errorParsingEJBClientDescriptor$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noMessageDestination$str() {
        return "WFLYEE0092: No message destination with name %s for binding %s";
    }
    @Override
    public final String noMessageDestination(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), noMessageDestination$str(), arg0, arg1);
    }
    protected String moreThanOneMessageDestination$str() {
        return "WFLYEE0093: More than one message destination with name %s for binding %s destinations: %s";
    }
    @Override
    public final String moreThanOneMessageDestination(final String arg0, final String arg1, final Set<String> arg2) {
        return String.format(getLoggingLocale(), moreThanOneMessageDestination$str(), arg0, arg1, arg2);
    }
    protected String failedToLoadJbossProperties$str() {
        return "WFLYEE0094: Failed to load jboss.properties";
    }
    @Override
    public final DeploymentUnitProcessingException failedToLoadJbossProperties(final IOException arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToLoadJbossProperties$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedModuleType$str() {
        return "WFLYEE0095: Unsupported ear module type: %s";
    }
    @Override
    public final DeploymentUnitProcessingException unsupportedModuleType(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), unsupportedModuleType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String rootAsLibraryDirectory$str() {
        return "WFLYEE0096: library-directory of value / is not supported";
    }
    @Override
    public final DeploymentUnitProcessingException rootAsLibraryDirectory() {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), rootAsLibraryDirectory$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String earModuleChildOfLibraryDirectory$str() {
        return "WFLYEE0097: Module may not be a child of the EAR's library directory. Library directory: %s, module file name: %s";
    }
    @Override
    public final DeploymentUnitProcessingException earModuleChildOfLibraryDirectory(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), earModuleChildOfLibraryDirectory$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String managedReferenceWasNull$str() {
        return "WFLYEE0098: ManagedReference was null and injection is not optional for injection into field %s";
    }
    @Override
    public final RuntimeException managedReferenceWasNull(final Field arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), managedReferenceWasNull$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String propertiesNotAllowedOnGlobalModules$str() {
        return "WFLYEE0100: Global modules may not specify 'annotations', 'meta-inf' or 'services'.";
    }
    @Override
    public final String propertiesNotAllowedOnGlobalModules() {
        return String.format(getLoggingLocale(), propertiesNotAllowedOnGlobalModules$str());
    }
    protected String concurrentServiceValueUninitialized$str() {
        return "WFLYEE0102: EE Concurrent Service's value uninitialized.";
    }
    @Override
    public final IllegalStateException concurrentServiceValueUninitialized() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), concurrentServiceValueUninitialized$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serializationMustBeHandledByTheFactory$str() {
        return "WFLYEE0103: EE Concurrent ContextHandle serialization must be handled by the factory.";
    }
    @Override
    public final IOException serializationMustBeHandledByTheFactory() {
        final IOException result = new IOException(String.format(getLoggingLocale(), serializationMustBeHandledByTheFactory$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String factoryAlreadyExists$str() {
        return "WFLYEE0104: The EE Concurrent Context %s already has a factory named %s";
    }
    @Override
    public final IllegalArgumentException factoryAlreadyExists(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), factoryAlreadyExists$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String factoryNotFound$str() {
        return "WFLYEE0105: EE Concurrent Context %s does not has a factory named %s";
    }
    @Override
    public final IOException factoryNotFound(final String arg0, final String arg1) {
        final IOException result = new IOException(String.format(getLoggingLocale(), factoryNotFound$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String concurrentContextServiceNotInstalled$str() {
        return "WFLYEE0106: EE Concurrent Context %s service not installed.";
    }
    @Override
    public final IOException concurrentContextServiceNotInstalled(final ServiceName arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), concurrentContextServiceNotInstalled$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String transactionSetupProviderServiceNotInstalled$str() {
        return "WFLYEE0107: EE Concurrent Transaction Setup Provider service not installed.";
    }
    @Override
    public final IllegalStateException transactionSetupProviderServiceNotInstalled() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), transactionSetupProviderServiceNotInstalled$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String instanceDataCanOnlyBeSetDuringConstruction$str() {
        return "WFLYEE0108: Instance data can only be set during construction";
    }
    @Override
    public final IllegalStateException instanceDataCanOnlyBeSetDuringConstruction() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), instanceDataCanOnlyBeSetDuringConstruction$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String aroundInvokeAnnotationUsedTooManyTimes$str() {
        return "WFLYEE0109: A class must not declare more than one AroundInvoke method. %s has %s methods annotated.";
    }
    @Override
    public final DeploymentUnitProcessingException aroundInvokeAnnotationUsedTooManyTimes(final DotName arg0, final int arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), aroundInvokeAnnotationUsedTooManyTimes$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToRunTask(final Object arg0, final Exception arg1) {
        super.log.logf(FQCN, ERROR, arg1, failedToRunTask$str(), arg0);
    }
    protected String failedToRunTask$str() {
        return "WFLYEE0110: Failed to run scheduled task: %s";
    }
    protected String cannotRunScheduledTask$str() {
        return "WFLYEE0111: Cannot run scheduled task %s as container is suspended";
    }
    @Override
    public final IllegalStateException cannotRunScheduledTask(final Object arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotRunScheduledTask$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidCoreThreadsSize$str() {
        return "WFLYEE0112: The core-threads value must be greater than 0 when the queue-length is %s";
    }
    @Override
    public final OperationFailedException invalidCoreThreadsSize(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidCoreThreadsSize$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidMaxThreads$str() {
        return "WFLYEE0113: The max-threads value %d cannot be less than the core-threads value %d.";
    }
    @Override
    public final OperationFailedException invalidMaxThreads(final int arg0, final int arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidMaxThreads$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String classDoesNotImplementAllInterfaces$str() {
        return "WFLYEE0114: Class does not implement all of the provided interfaces";
    }
    @Override
    public final IllegalArgumentException classDoesNotImplementAllInterfaces() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), classDoesNotImplementAllInterfaces$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullName$str() {
        return "WFLYEE0115: The name of the %s is null";
    }
    @Override
    public final IllegalArgumentException nullName(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullName$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullVar3$str() {
        return "WFLYEE0116: %s is null in the %s %s";
    }
    @Override
    public final IllegalArgumentException nullVar(final String arg0, final String arg1, final String arg2) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullVar3$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotSetField$str() {
        return "WFLYEE0117: Field %s cannot be set - object of %s loaded by %s is not assignable to %s loaded by %s";
    }
    @Override
    public final IllegalArgumentException cannotSetField(final String arg0, final Class<?> arg1, final ClassLoader arg2, final Class<?> arg3, final ClassLoader arg4) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotSetField$str(), arg0, arg1, arg2, arg3, arg4));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String executorServiceNotFound$str() {
        return "WFLYEE0120: Failed to locate executor service '%s'";
    }
    @Override
    public final OperationFailedException executorServiceNotFound(final ServiceName arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), executorServiceNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedExecutorServiceMetric$str() {
        return "WFLYEE0121: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedExecutorServiceMetric(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedExecutorServiceMetric$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String globalDirectoryDoNotExist$str() {
        return "WFLYEE0122: Directory path %s in %s global-directory resource does not point to a valid directory.";
    }
    @Override
    public final StartException globalDirectoryDoNotExist(final String arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), globalDirectoryDoNotExist$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String oneGlobalDirectory$str() {
        return "WFLYEE0123: Global directory %s cannot be added, because global directory %s is already defined.";
    }
    @Override
    public final OperationFailedException oneGlobalDirectory(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), oneGlobalDirectory$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void errorDeletingJACCPolicy(final Throwable arg0) {
        super.log.logf(FQCN, WARN, arg0, errorDeletingJACCPolicy$str());
    }
    protected String errorDeletingJACCPolicy$str() {
        return "WFLYEE0124: Error deleting Jakarta Authorization Policy";
    }
    protected String unableToStartException$str() {
        return "WFLYEE0125: Unable to start the %s service";
    }
    @Override
    public final StartException unableToStartException(final String arg0, final Throwable arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), unableToStartException$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String rejectedDueToMaxRequests$str() {
        return "WFLYEE0126: Rejected due to maximum number of requests";
    }
    @Override
    public final RejectedExecutionException rejectedDueToMaxRequests() {
        final RejectedExecutionException result = new RejectedExecutionException(String.format(getLoggingLocale(), rejectedDueToMaxRequests$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void invalidNamePrefix(final String arg0) {
        super.log.logf(FQCN, WARN, null, invalidNamePrefix$str(), arg0);
    }
    protected String invalidNamePrefix$str() {
        return "WFLYEE0127: Invalid '%s' name segment for env, name can't start with '/' prefix, prefix has been removed";
    }
    @Override
    public final void huntTaskTerminationFailure(final Throwable arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, WARN, arg0, huntTaskTerminationFailure$str(), arg1, arg2);
    }
    protected String huntTaskTerminationFailure$str() {
        return "WFLYEE0128: Failure when terminating %s hung task %s";
    }
    @Override
    public final void hungTaskCancelled(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, hungTaskCancelled$str(), arg0, arg1);
    }
    protected String hungTaskCancelled$str() {
        return "WFLYEE0129: %s hung task %s cancelled";
    }
    @Override
    public final void hungTaskNotCancelled(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, hungTaskNotCancelled$str(), arg0, arg1);
    }
    protected String hungTaskNotCancelled$str() {
        return "WFLYEE0130: %s hung task %s not cancelled";
    }
    protected String attributeNoLongerSupported$str() {
        return "WFLYEE0131: The attribute %s is no longer supported.";
    }
    @Override
    public final XMLStreamException attributeNoLongerSupported(final String arg0) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), attributeNoLongerSupported$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String managedReferenceMethodWasNull$str() {
        return "WFLYEE0132: ManagedReference was null and injection is not optional for injection into method %s";
    }
    @Override
    public final RuntimeException managedReferenceMethodWasNull(final Method arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), managedReferenceMethodWasNull$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void duplicateJndiBindingFound(final String arg0, final String arg1, final Class arg2) {
        super.log.logf(FQCN, ERROR, null, duplicateJndiBindingFound$str(), arg0, arg1, arg2);
    }
    protected String duplicateJndiBindingFound$str() {
        return "WFLYEE0133: A JNDI binding for component '%s' has already been installed under JNDI name '%s' in accordance with Jakarta EE specifications. The conflicting class is %s. Solutions include providing an alternate name for the component or renaming the class.";
    }
    protected String multipleUsesOfAllRemaining$str() {
        return "WFLYEE0134: Multiple uses of ContextServiceDefinition.ALL_REMAINING";
    }
    @Override
    public final IllegalStateException multipleUsesOfAllRemaining() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), multipleUsesOfAllRemaining$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToResumeTransaction(final Throwable arg0) {
        super.log.logf(FQCN, WARN, arg0, failedToResumeTransaction$str());
    }
    protected String failedToResumeTransaction$str() {
        return "WFLYEE0135: Failed to resume transaction.";
    }
    protected String failureWhileRunningTask$str() {
        return "WFLYEE0136: Failed to run scheduled task: %s";
    }
    @Override
    public final RuntimeException failureWhileRunningTask(final Object arg0, final Exception arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failureWhileRunningTask$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorEqualsCannotBeCalledBeforeResolve$str() {
        return "WFLYEE0137: Error equals() cannot be called before resolve()";
    }
    @Override
    public final RuntimeException errorEqualsCannotBeCalledBeforeResolve() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorEqualsCannotBeCalledBeforeResolve$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String hungTaskTerminationPeriodIsNotBiggerThanZero$str() {
        return "WFLYEE0138: hungTaskTerminationPeriod is not > 0";
    }
    @Override
    public final IllegalArgumentException hungTaskTerminationPeriodIsNotBiggerThanZero() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), hungTaskTerminationPeriodIsNotBiggerThanZero$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAddRemotingReceiver$str() {
        return "WFLYEE0139: Cannot add a remoting receiver which references a null/empty outbound connection";
    }
    @Override
    public final IllegalArgumentException cannotAddRemotingReceiver() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotAddRemotingReceiver$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAddHTTPConnection$str() {
        return "WFLYEE0140: Cannot add a HTTP connection which references a null/empty URI";
    }
    @Override
    public final IllegalArgumentException cannotAddHTTPConnection() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotAddHTTPConnection$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String securityManagerNotAllowed$str() {
        return "WFLYEE0141: Running with a SecurityManager enabled is not allowed in a Jakarta EE 11 or later environment";
    }
    @Override
    public final OperationFailedException securityManagerNotAllowed() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), securityManagerNotAllowed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLoadConcurrencyImplementation$str() {
        return "WFLYEE0142: Failed to load Jakarta Concurrency implementation";
    }
    @Override
    public final RuntimeException failedToLoadConcurrencyImplementation(final Throwable arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToLoadConcurrencyImplementation$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String lifecycleOperationNotSupported$str() {
        return "WFLYEE0143: Lifecycle operation not supported";
    }
    @Override
    public final IllegalStateException lifecycleOperationNotSupported() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), lifecycleOperationNotSupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
