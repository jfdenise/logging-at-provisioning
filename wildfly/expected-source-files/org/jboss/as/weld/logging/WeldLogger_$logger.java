package org.jboss.as.weld.logging;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import java.lang.IllegalStateException;
import java.io.Serializable;
import org.jboss.weld.resources.spi.ClassFileInfoException;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.as.ee.structure.DeploymentType;
import org.jboss.logging.Logger;
import java.net.URL;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import java.lang.ClassLoader;
import java.lang.reflect.Member;
import java.lang.IllegalArgumentException;
import javax.annotation.processing.Generated;
import jakarta.enterprise.inject.spi.InjectionPoint;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.Exception;
import java.lang.reflect.Type;
import java.lang.Throwable;
import org.jboss.weld.bootstrap.spi.BeanDeploymentArchive;
import java.lang.Class;
import java.lang.Object;
import java.util.Arrays;
import java.io.File;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:54:04+0200")
public class WeldLogger_$logger extends DelegatingBasicLogger implements WeldLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = WeldLogger_$logger.class.getName();
    public WeldLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void failedToSetupWeldContexts(final Throwable throwable) {
        super.log.logf(FQCN, ERROR, throwable, failedToSetupWeldContexts$str());
    }
    protected String failedToSetupWeldContexts$str() {
        return "WFLYWELD0001: Failed to setup Weld contexts";
    }
    @Override
    public final void failedToTearDownWeldContexts(final Throwable throwable) {
        super.log.logf(FQCN, ERROR, throwable, failedToTearDownWeldContexts$str());
    }
    protected String failedToTearDownWeldContexts$str() {
        return "WFLYWELD0002: Failed to tear down Weld contexts";
    }
    @Override
    public final void processingWeldDeployment(final String deployment) {
        super.log.logf(FQCN, INFO, null, processingWeldDeployment$str(), deployment);
    }
    protected String processingWeldDeployment$str() {
        return "WFLYWELD0003: Processing weld deployment %s";
    }
    @Override
    public final void couldNotFindBeanManagerForDeployment(final String beanManager) {
        super.log.logf(FQCN, ERROR, null, couldNotFindBeanManagerForDeployment$str(), beanManager);
    }
    protected String couldNotFindBeanManagerForDeployment$str() {
        return "WFLYWELD0005: Could not find BeanManager for deployment %s";
    }
    @Override
    public final void startingServicesForCDIDeployment(final String deploymentName) {
        super.log.logf(FQCN, DEBUG, null, startingServicesForCDIDeployment$str(), deploymentName);
    }
    protected String startingServicesForCDIDeployment$str() {
        return "WFLYWELD0006: Starting Services for Jakarta Contexts and Dependency Injection deployment: %s";
    }
    @Override
    public final void couldNotLoadPortableExceptionClass(final String className, final Throwable throwable) {
        super.log.logf(FQCN, WARN, throwable, couldNotLoadPortableExceptionClass$str(), className);
    }
    protected String couldNotLoadPortableExceptionClass$str() {
        return "WFLYWELD0007: Could not load portable extension class %s";
    }
    @Override
    public final void injectionTypeNotValue(final String type, final Member injectionPoint) {
        super.log.logf(FQCN, WARN, null, injectionTypeNotValue$str(), type, injectionPoint);
    }
    protected String injectionTypeNotValue$str() {
        return "WFLYWELD0008: @Resource injection of type %s is not supported for non-Jakarta Enterprise Beans components. Injection point: %s";
    }
    @Override
    public final void startingWeldService(final String deploymentName) {
        super.log.logf(FQCN, DEBUG, null, startingWeldService$str(), deploymentName);
    }
    protected String startingWeldService$str() {
        return "WFLYWELD0009: Starting weld service for deployment %s";
    }
    @Override
    public final void stoppingWeldService(final String deploymentName) {
        super.log.logf(FQCN, DEBUG, null, stoppingWeldService$str(), deploymentName);
    }
    protected String stoppingWeldService$str() {
        return "WFLYWELD0010: Stopping weld service for deployment %s";
    }
    @Override
    public final void beansXmlValidationWarning(final URL file, final int line, final String message) {
        super.log.logf(FQCN, WARN, null, beansXmlValidationWarning$str(), file, line, message);
    }
    protected String beansXmlValidationWarning$str() {
        return "WFLYWELD0011: Warning while parsing %s:%s %s";
    }
    @Override
    public final void beansXmlValidationError(final URL file, final int line, final String message) {
        super.log.logf(FQCN, WARN, null, beansXmlValidationError$str(), file, line, message);
    }
    protected String beansXmlValidationError$str() {
        return "WFLYWELD0012: Warning while parsing %s:%s %s";
    }
    @Override
    public final void cdiAnnotationsButNotBeanArchive(final String deploymentUnit) {
        super.log.logf(FQCN, WARN, null, cdiAnnotationsButNotBeanArchive$str(), deploymentUnit);
    }
    protected String cdiAnnotationsButNotBeanArchive$str() {
        return "WFLYWELD0013: Deployment %s contains Jakarta Contexts and Dependency Injection annotations but no bean archive was found (no beans.xml or class with bean defining annotations was present).";
    }
    @Override
    public final void exceptionClearingThreadState(final Exception e) {
        super.log.logf(FQCN, ERROR, e, exceptionClearingThreadState$str());
    }
    protected String exceptionClearingThreadState$str() {
        return "WFLYWELD0014: Exception tearing down thread state";
    }
    @Override
    public final void couldNotReadEntries(final IOException ioe) {
        super.log.logf(FQCN, ERROR, ioe, couldNotReadEntries$str());
    }
    protected String couldNotReadEntries$str() {
        return "WFLYWELD0016: Could not read entries";
    }
    @Override
    public final void doNotUnderstandProtocol(final URL url) {
        super.log.logf(FQCN, WARN, null, doNotUnderstandProtocol$str(), url);
    }
    protected String doNotUnderstandProtocol$str() {
        return "WFLYWELD0017: URL scanner does not understand the URL protocol %s, Jakarta Contexts and Dependency Injection beans will not be scanned.";
    }
    @Override
    public final void duplicateBeansXml() {
        super.log.logf(FQCN, WARN, null, duplicateBeansXml$str());
    }
    protected String duplicateBeansXml$str() {
        return "WFLYWELD0018: Found both WEB-INF/beans.xml and WEB-INF/classes/META-INF/beans.xml. It is not portable to use both locations at the same time. Weld is going to use the former location for this deployment.";
    }
    protected String couldNotGetBeansXmlAsURL$str() {
        return "WFLYWELD0019: Could get beans.xml file as URL when processing file: %s";
    }
    @Override
    public final DeploymentUnitProcessingException couldNotGetBeansXmlAsURL(final String beansXml, final Throwable cause) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), couldNotGetBeansXmlAsURL$str(), beansXml), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String couldNotLoadInterceptorClass$str() {
        return "WFLYWELD0020: Could not load interceptor class : %s";
    }
    @Override
    public final DeploymentUnitProcessingException couldNotLoadInterceptorClass(final String interceptorClass, final Throwable cause) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), couldNotLoadInterceptorClass$str(), interceptorClass), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String extensionDoesNotImplementExtension$str() {
        return "WFLYWELD0021: Service %s didn't implement the jakarta.enterprise.inject.spi.Extension interface";
    }
    @Override
    public final DeploymentUnitProcessingException extensionDoesNotImplementExtension(final Class<?> clazz) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), extensionDoesNotImplementExtension$str(), clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String viewNotFoundOnEJB$str() {
        return "WFLYWELD0022: View of type %s not found on Jakarta Enterprise Beans %s";
    }
    @Override
    public final IllegalArgumentException viewNotFoundOnEJB(final String viewType, final String ejb) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), viewNotFoundOnEJB$str(), viewType, ejb));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownInterceptorClassForCDIInjection$str() {
        return "WFLYWELD0030: Unknown interceptor class for Jakarta Contexts and Dependency Injection %s";
    }
    @Override
    public final IllegalArgumentException unknownInterceptorClassForCDIInjection(final Class<?> interceptorClass) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownInterceptorClassForCDIInjection$str(), interceptorClass));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String parameterCannotBeNull$str() {
        return "WFLYWELD0031: %s cannot be null";
    }
    @Override
    public final IllegalArgumentException parameterCannotBeNull(final String param) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), parameterCannotBeNull$str(), param));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String injectionPointNotAJavabean$str() {
        return "WFLYWELD0032: Injection point represents a method which doesn't follow JavaBean conventions (must have exactly one parameter) %s";
    }
    @Override
    public final IllegalArgumentException injectionPointNotAJavabean(final Method method) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), injectionPointNotAJavabean$str(), method));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String annotationNotFound$str() {
        return "WFLYWELD0033: %s annotation not found on %s";
    }
    @Override
    public final IllegalArgumentException annotationNotFound(final Class<? extends java.lang.annotation.Annotation> type, final Member member) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), annotationNotFound$str(), type, member));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ejbNotResolved$str() {
        return "WFLYWELD0034: Could not resolve @EJB injection for %s on %s";
    }
    @Override
    public final IllegalStateException ejbNotResolved(final Object ejb, final Member member) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), ejbNotResolved$str(), ejb, member));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String moreThanOneEjbResolved$str() {
        return "WFLYWELD0035: Resolved more than one Jakarta Enterprise Beans for @EJB injection of %s on %s. Found %s";
    }
    @Override
    public final IllegalStateException moreThanOneEjbResolved(final Object ejb, final Member member, final Set<org.jboss.as.ee.component.ViewDescription> viewService) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), moreThanOneEjbResolved$str(), ejb, member, viewService));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotDetermineUnderlyingType$str() {
        return "WFLYWELD0036: Could not determine bean class from injection point type of %s";
    }
    @Override
    public final IllegalArgumentException couldNotDetermineUnderlyingType(final Type type) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), couldNotDetermineUnderlyingType$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotFindPersistenceUnit$str() {
        return "WFLYWELD0037: Error injecting persistence unit into Jakarta Contexts and Dependency Injection managed bean. Can't find a persistence unit named '%s' in deployment %s for injection point %s";
    }
    @Override
    public final IllegalArgumentException couldNotFindPersistenceUnit(final String unitName, final String deployment, final Member injectionPoint) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), couldNotFindPersistenceUnit$str(), unitName, deployment, injectionPoint));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String securityNotEnabled$str() {
        return "WFLYWELD0038: Could not inject SecurityManager, security is not enabled";
    }
    @Override
    public final IllegalStateException securityNotEnabled() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), securityNotEnabled$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String singletonNotSet$str() {
        return "WFLYWELD0039: Singleton not set for %s. This means that you are trying to access a weld deployment with a Thread Context ClassLoader that is not associated with the deployment.";
    }
    @Override
    public final IllegalStateException singletonNotSet(final ClassLoader classLoader) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), singletonNotSet$str(), classLoader));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String alreadyRunning$str() {
        return "WFLYWELD0040: %s is already running";
    }
    @Override
    public final IllegalStateException alreadyRunning(final String object) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), alreadyRunning$str(), object));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notStarted$str() {
        return "WFLYWELD0041: %s is not started";
    }
    @Override
    public final IllegalStateException notStarted(final String object) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), notStarted$str(), object));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String beanDeploymentNotFound$str() {
        return "WFLYWELD0043: BeanDeploymentArchive with id %s not found in deployment";
    }
    @Override
    public final IllegalArgumentException beanDeploymentNotFound(final String beanDeploymentId) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), beanDeploymentNotFound$str(), beanDeploymentId));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotFindResource1$str() {
        return "WFLYWELD0044: Error injecting resource into Jakarta Contexts and Dependency Injection managed bean. Can't find a resource named %s";
    }
    @Override
    public final IllegalArgumentException couldNotFindResource(final String resourceName, final Throwable cause) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), couldNotFindResource1$str(), resourceName), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotDetermineResourceName$str() {
        return "WFLYWELD0045: Cannot determine resource name. Both jndiName and mappedName are null";
    }
    @Override
    public final IllegalArgumentException cannotDetermineResourceName() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotDetermineResourceName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInject$str() {
        return "WFLYWELD0046: Cannot inject injection point %s";
    }
    @Override
    public final IllegalArgumentException cannotInject(final InjectionPoint ip) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotInject$str(), ip));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotUseAtRuntime$str() {
        return "WFLYWELD0047: %s cannot be used at runtime";
    }
    @Override
    public final IllegalStateException cannotUseAtRuntime(final String description) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotUseAtRuntime$str(), description));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String rejectAttributesMustBeTrue$str() {
        return "WFLYWELD0048: These attributes must be 'true' for use with CDI 1.0 '%s'";
    }
    @Override
    public final String rejectAttributesMustBeTrue(final Set<String> keySet) {
        return String.format(getLoggingLocale(), rejectAttributesMustBeTrue$str(), keySet);
    }
    protected String couldNotFindResource2$str() {
        return "WFLYWELD0049: Error injecting resource into Jakarta Contexts and Dependency Injection managed bean. Can't find a resource named %s defined on %s";
    }
    @Override
    public final IllegalArgumentException couldNotFindResource(final String resourceName, final String member, final Throwable cause) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), couldNotFindResource2$str(), resourceName, member), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void beanArchiveDiscovered(final BeanDeploymentArchive bda) {
        super.log.logf(FQCN, DEBUG, null, beanArchiveDiscovered$str(), bda);
    }
    protected String beanArchiveDiscovered$str() {
        return "Discovered %s";
    }
    protected String nameNotFoundInIndex$str() {
        return "WFLYWELD0050: %s was not found in composite index";
    }
    @Override
    public final ClassFileInfoException nameNotFoundInIndex(final String name) {
        final ClassFileInfoException result = new ClassFileInfoException(String.format(getLoggingLocale(), nameNotFoundInIndex$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void unableToLoadAnnotation(final String annotationClassName) {
        super.log.logf(FQCN, DEBUG, null, unableToLoadAnnotation$str(), annotationClassName);
    }
    protected String unableToLoadAnnotation$str() {
        return "Unable to load annotation %s";
    }
    protected String cannotLoadClass$str() {
        return "WFLYWELD0051: Cannot load %s";
    }
    @Override
    public final ClassFileInfoException cannotLoadClass(final String name, final Throwable throwable) {
        final ClassFileInfoException result = new ClassFileInfoException(String.format(getLoggingLocale(), cannotLoadClass$str(), name), throwable);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void loadingProxiesUsingDeploymentClassLoader(final String moduleIdentifier, final String dependencies) {
        super.log.logf(FQCN, WARN, null, loadingProxiesUsingDeploymentClassLoader$str(), moduleIdentifier, dependencies);
    }
    protected String loadingProxiesUsingDeploymentClassLoader$str() {
        return "WFLYWELD0052: Using deployment classloader to load proxy classes for module %s. Package-private access will not work. To fix this the module should declare dependencies on %s";
    }
    protected String componentInterceptorSupportNotAvailable$str() {
        return "WFLYWELD0053: Component interceptor support not available for: %s";
    }
    @Override
    public final IllegalStateException componentInterceptorSupportNotAvailable(final Object componentClass) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), componentInterceptorSupportNotAvailable$str(), componentClass));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void cannotLoadAnnotationIndexOfExternalBeanArchive(final Object indexUrl) {
        super.log.logf(FQCN, WARN, null, cannotLoadAnnotationIndexOfExternalBeanArchive$str(), indexUrl);
    }
    protected String cannotLoadAnnotationIndexOfExternalBeanArchive$str() {
        return "WFLYWELD0054: Could not read provided index of an external bean archive: %s";
    }
    @Override
    public final void cannotIndexClassName(final Object name, final Object bda) {
        super.log.logf(FQCN, WARN, null, cannotIndexClassName$str(), name, bda);
    }
    protected String cannotIndexClassName$str() {
        return "WFLYWELD0055: Could not index class [%s] from an external bean archive: %s";
    }
    protected String weldNotInitialized$str() {
        return "WFLYWELD0056: Weld is not initialized yet";
    }
    @Override
    public final IllegalStateException weldNotInitialized() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), weldNotInitialized$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String persistenceUnitFailed$str() {
        return "WFLYWELD0057: Persistence unit '%s' failed.";
    }
    @Override
    public final IllegalStateException persistenceUnitFailed(final String scopedPuName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), persistenceUnitFailed$str(), scopedPuName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String persistenceUnitRemoved$str() {
        return "WFLYWELD0058: Persistence unit '%s' removed.";
    }
    @Override
    public final IllegalStateException persistenceUnitRemoved(final String scopedPuName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), persistenceUnitRemoved$str(), scopedPuName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownDeploymentType$str() {
        return "WFLYWELD0059: Unknown deployment type %s";
    }
    @Override
    public final IllegalArgumentException unknownDeploymentType(final DeploymentType deploymentType) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownDeploymentType$str(), deploymentType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorHandlingFile$str() {
        return "WFLYWELD0060: Error handling file %s";
    }
    @Override
    public final RuntimeException errorHandlingFile(final File file, final Throwable throwable) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorHandlingFile$str(), file), throwable);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingService$str() {
        return "WFLYWELD0061: Exactly one service provider is required for: %s";
    }
    @Override
    public final IllegalStateException missingService(final Class<?> serviceClass) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), missingService$str(), serviceClass));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotDeterminePackage$str() {
        return "WFLYWELD0062: Could not determine package from corrupted class name";
    }
    @Override
    public final IllegalStateException couldNotDeterminePackage() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotDeterminePackage$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String originalClassDoesNotHaveAModule$str() {
        return "WFLYWELD0063: Original %s does not have a module";
    }
    @Override
    public final IllegalArgumentException originalClassDoesNotHaveAModule(final Class<?> originalClass) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), originalClassDoesNotHaveAModule$str(), originalClass));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String incorrectBceTranslatorSetup$str() {
        return "WFLYWELD0064: Incorrect setup for Weld's LiteExtensionTranslator initialization; a deployment unit has to be specified";
    }
    @Override
    public final IllegalArgumentException incorrectBceTranslatorSetup() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), incorrectBceTranslatorSetup$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
