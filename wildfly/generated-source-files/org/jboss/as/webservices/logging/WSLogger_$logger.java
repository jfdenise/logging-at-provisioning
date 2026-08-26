package org.jboss.as.webservices.logging;

import java.util.Locale;
import org.jboss.vfs.VirtualFile;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import java.lang.IllegalStateException;
import java.io.Serializable;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import org.jboss.as.server.deployment.module.ResourceRoot;
import java.lang.RuntimeException;
import java.lang.NullPointerException;
import org.jboss.wsf.spi.deployment.DeploymentAspect;
import org.jboss.logging.BasicLogger;
import org.jboss.wsf.spi.WSFException;
import org.jboss.msc.service.StartException;
import org.jboss.as.webservices.config.DisabledOperationException;
import java.lang.IllegalArgumentException;
import javax.annotation.processing.Generated;
import jakarta.xml.ws.WebServiceException;
import org.jboss.as.controller.OperationFailedException;
import java.lang.SecurityException;
import java.lang.reflect.Method;
import java.io.IOException;
import java.lang.Exception;
import org.jboss.msc.service.ServiceName;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.FATAL;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:54+0200")
public class WSLogger_$logger extends DelegatingBasicLogger implements WSLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = WSLogger_$logger.class.getName();
    public WSLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void cannotLoadDeploymentAspectsDefinitionFile(final String arg0) {
        super.log.logf(FQCN, WARN, null, cannotLoadDeploymentAspectsDefinitionFile$str(), arg0);
    }
    protected String cannotLoadDeploymentAspectsDefinitionFile$str() {
        return "WFLYWS0001: Cannot load WS deployment aspects from %s";
    }
    @Override
    public final RuntimeException cannotLoadDeploymentAspectsDefinitionFile(final Throwable arg0, final String arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotLoadDeploymentAspectsDefinitionFile$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void activatingWebservicesExtension() {
        super.log.logf(FQCN, INFO, null, activatingWebservicesExtension$str());
    }
    protected String activatingWebservicesExtension$str() {
        return "WFLYWS0002: Activating WebServices Extension";
    }
    @Override
    public final void starting(final Object arg0) {
        super.log.logf(FQCN, INFO, null, starting$str(), arg0);
    }
    protected String starting$str() {
        return "WFLYWS0003: Starting %s";
    }
    @Override
    public final void stopping(final Object arg0) {
        super.log.logf(FQCN, INFO, null, stopping$str(), arg0);
    }
    protected String stopping$str() {
        return "WFLYWS0004: Stopping %s";
    }
    @Override
    public final void configServiceCreationFailed() {
        super.log.logf(FQCN, FATAL, null, configServiceCreationFailed$str());
    }
    protected String configServiceCreationFailed$str() {
        return "WFLYWS0005: Error while creating configuration service";
    }
    @Override
    public final void configServiceDestroyFailed() {
        super.log.logf(FQCN, ERROR, null, configServiceDestroyFailed$str());
    }
    protected String configServiceDestroyFailed$str() {
        return "WFLYWS0006: Error while destroying configuration service";
    }
    @Override
    public final void cannotReadWsdl(final String arg0) {
        super.log.logf(FQCN, WARN, null, cannotReadWsdl$str(), arg0);
    }
    protected String cannotReadWsdl$str() {
        return "WFLYWS0007: Could not read WSDL from: %s";
    }
    @Override
    public final void mutuallyExclusiveAnnotations(final String arg0) {
        super.log.logf(FQCN, WARN, null, mutuallyExclusiveAnnotations$str(), arg0);
    }
    protected String mutuallyExclusiveAnnotations$str() {
        return "WFLYWS0008: [JAXWS 2.2 spec, section 7.7] The @WebService and @WebServiceProvider annotations are mutually exclusive - %s won't be considered as a webservice endpoint, since it doesn't meet that requirement";
    }
    @Override
    public final void finalEndpointClassDetected(final String arg0) {
        super.log.logf(FQCN, WARN, null, finalEndpointClassDetected$str(), arg0);
    }
    protected String finalEndpointClassDetected$str() {
        return "WFLYWS0009: WebService endpoint class cannot be final - %s won't be considered as a webservice endpoint";
    }
    @Override
    public final void ignoringPortComponentRef(final Object arg0) {
        super.log.logf(FQCN, WARN, null, ignoringPortComponentRef$str(), arg0);
    }
    protected String ignoringPortComponentRef$str() {
        return "WFLYWS0010: Ignoring <port-component-ref> without <service-endpoint-interface> and <port-qname>: %s";
    }
    @Override
    public final void cannotRegisterRecordProcessor() {
        super.log.logf(FQCN, ERROR, null, cannotRegisterRecordProcessor$str());
    }
    protected String cannotRegisterRecordProcessor$str() {
        return "WFLYWS0011: Cannot register record processor in JMX server";
    }
    @Override
    public final void cannotUnregisterRecordProcessor() {
        super.log.logf(FQCN, ERROR, null, cannotUnregisterRecordProcessor$str());
    }
    protected String cannotUnregisterRecordProcessor$str() {
        return "WFLYWS0012: Cannot unregister record processor from JMX server";
    }
    @Override
    public final void mBeanServerNotAvailable(final Object arg0) {
        super.log.logf(FQCN, INFO, null, mBeanServerNotAvailable$str(), arg0);
    }
    protected String mBeanServerNotAvailable$str() {
        return "WFLYWS0013: MBeanServer not available, skipping registration/unregistration of %s";
    }
    @Override
    public final void multipleEndpointsWithDifferentDeclaredSecurityRoles() {
        super.log.logf(FQCN, WARN, null, multipleEndpointsWithDifferentDeclaredSecurityRoles$str());
    }
    protected String multipleEndpointsWithDifferentDeclaredSecurityRoles$str() {
        return "WFLYWS0014: Multiple Enterprise Beans 3 endpoints in the same deployment with different declared security roles; be aware this might be a security risk if you're not controlling allowed roles (@RolesAllowed) on each ws endpoint method.";
    }
    @Override
    public final void cannotRegisterEndpoint(final Object arg0) {
        super.log.logf(FQCN, ERROR, null, cannotRegisterEndpoint$str(), arg0);
    }
    protected String cannotRegisterEndpoint$str() {
        return "WFLYWS0015: Cannot register endpoint: %s in JMX server";
    }
    @Override
    public final void cannotUnregisterEndpoint(final Object arg0) {
        super.log.logf(FQCN, ERROR, null, cannotUnregisterEndpoint$str(), arg0);
    }
    protected String cannotUnregisterEndpoint$str() {
        return "WFLYWS0016: Cannot unregister endpoint: %s from JMX server";
    }
    @Override
    public final void invalidHandlerChainFile(final String arg0) {
        super.log.logf(FQCN, WARN, null, invalidHandlerChainFile$str(), arg0);
    }
    protected String invalidHandlerChainFile$str() {
        return "WFLYWS0017: Invalid handler chain file: %s";
    }
    @Override
    public final void webMethodMustNotBeStaticOrFinal(final Method arg0) {
        super.log.logf(FQCN, ERROR, null, webMethodMustNotBeStaticOrFinal$str(), arg0);
    }
    protected String webMethodMustNotBeStaticOrFinal$str() {
        return "WFLYWS0018: Web service method %s must not be static or final. See section 5.3.2.4.2 of \"Jakarta Enterprise Web Services 2.0\".";
    }
    @Override
    public final void webMethodMustBePublic(final Method arg0) {
        super.log.logf(FQCN, ERROR, null, webMethodMustBePublic$str(), arg0);
    }
    protected String webMethodMustBePublic$str() {
        return "WFLYWS0019: Web service method %s must be public. See section 5.3.2.4.2 of \"Jakarta Enterprise Web Services 2.0\".";
    }
    @Override
    public final void webServiceMethodNotFound(final Class<?> arg0, final Method arg1) {
        super.log.logf(FQCN, ERROR, null, webServiceMethodNotFound$str(), arg0, arg1);
    }
    protected String webServiceMethodNotFound$str() {
        return "WFLYWS0020: Web service implementation class %s does not contain method %s";
    }
    @Override
    public final void accessibleWebServiceMethodNotFound(final Class<?> arg0, final Method arg1, final SecurityException arg2) {
        super.log.logf(FQCN, ERROR, arg2, accessibleWebServiceMethodNotFound$str(), arg0, arg1);
    }
    protected String accessibleWebServiceMethodNotFound$str() {
        return "WFLYWS0021: Web service implementation class %s does not contain an accessible method %s";
    }
    @Override
    public final void finalizeMethodNotAllowed(final Class<?> arg0) {
        super.log.logf(FQCN, ERROR, null, finalizeMethodNotAllowed$str(), arg0);
    }
    protected String finalizeMethodNotAllowed$str() {
        return "WFLYWS0022: Web service implementation class %s may not declare a finalize() method. See section 5.3.2.4.2 of \"Jakarta Enterprise Web Services 2.0\".";
    }
    protected String nullEndpointName$str() {
        return "WFLYWS0023: Null endpoint name";
    }
    @Override
    public final NullPointerException nullEndpointName() {
        final NullPointerException result = new NullPointerException(String.format(getLoggingLocale(), nullEndpointName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullEndpointClass$str() {
        return "WFLYWS0024: Null endpoint class";
    }
    @Override
    public final NullPointerException nullEndpointClass() {
        final NullPointerException result = new NullPointerException(String.format(getLoggingLocale(), nullEndpointClass$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String classLoaderResolutionFailed$str() {
        return "WFLYWS0025: Cannot resolve module or classloader for deployment %s";
    }
    @Override
    public final IllegalStateException classLoaderResolutionFailed(final Object arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), classLoaderResolutionFailed$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingHandlerChainConfigFile$str() {
        return "WFLYWS0026: Handler chain config file %s not found in %s";
    }
    @Override
    public final WebServiceException missingHandlerChainConfigFile(final String arg0, final ResourceRoot arg1) {
        final WebServiceException result = new WebServiceException(String.format(getLoggingLocale(), missingHandlerChainConfigFile$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedElement$str() {
        return "WFLYWS0027: Unexpected element: %s";
    }
    @Override
    public final IllegalStateException unexpectedElement(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unexpectedElement$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedEndTag$str() {
        return "WFLYWS0028: Unexpected end tag: %s";
    }
    @Override
    public final IllegalStateException unexpectedEndTag(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unexpectedEndTag$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedEndOfDocument$str() {
        return "WFLYWS0029: Reached end of xml document unexpectedly";
    }
    @Override
    public final IllegalStateException unexpectedEndOfDocument() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unexpectedEndOfDocument$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingDeploymentAspectClassAttribute$str() {
        return "WFLYWS0030: Could not find class attribute for deployment aspect";
    }
    @Override
    public final IllegalStateException missingDeploymentAspectClassAttribute() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), missingDeploymentAspectClassAttribute$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInstantiateDeploymentAspect$str() {
        return "WFLYWS0031: Could not create a deployment aspect of class: %s";
    }
    @Override
    public final IllegalStateException cannotInstantiateDeploymentAspect(final Throwable arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotInstantiateDeploymentAspect$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingPropertyNameAttribute$str() {
        return "WFLYWS0032: Could not find property name attribute for deployment aspect: %s";
    }
    @Override
    public final IllegalStateException missingPropertyNameAttribute(final DeploymentAspect arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), missingPropertyNameAttribute$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingPropertyClassAttribute$str() {
        return "WFLYWS0033: Could not find property class attribute for deployment aspect: %s";
    }
    @Override
    public final IllegalStateException missingPropertyClassAttribute(final DeploymentAspect arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), missingPropertyClassAttribute$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedPropertyClass$str() {
        return "WFLYWS0034: Unsupported property class: %s";
    }
    @Override
    public final IllegalArgumentException unsupportedPropertyClass(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unsupportedPropertyClass$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInstantiateList$str() {
        return "WFLYWS0035: Could not create list of type: %s";
    }
    @Override
    public final IllegalStateException cannotInstantiateList(final Throwable arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotInstantiateList$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInstantiateMap$str() {
        return "WFLYWS0036: Could not create map of type: %s";
    }
    @Override
    public final IllegalStateException cannotInstantiateMap(final Throwable arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotInstantiateMap$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noMetricsAvailable$str() {
        return "WFLYWS0037: No metrics available";
    }
    @Override
    public final String noMetricsAvailable() {
        return String.format(getLoggingLocale(), noMetricsAvailable$str());
    }
    protected String cannotFindComponentView$str() {
        return "WFLYWS0038: Cannot find component view: %s";
    }
    @Override
    public final IllegalStateException cannotFindComponentView(final ServiceName arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotFindComponentView$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingChild$str() {
        return "WFLYWS0039: Child '%s' not found for VirtualFile: %s";
    }
    @Override
    public final IOException missingChild(final String arg0, final VirtualFile arg1) {
        final IOException result = new IOException(String.format(getLoggingLocale(), missingChild$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String createContextPhaseFailed$str() {
        return "WFLYWS0040: Failed to create context";
    }
    @Override
    public final Exception createContextPhaseFailed(final Throwable arg0) {
        final Exception result = new Exception(String.format(getLoggingLocale(), createContextPhaseFailed$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String startContextPhaseFailed$str() {
        return "WFLYWS0041: Failed to start context";
    }
    @Override
    public final Exception startContextPhaseFailed(final Throwable arg0) {
        final Exception result = new Exception(String.format(getLoggingLocale(), startContextPhaseFailed$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String stopContextPhaseFailed$str() {
        return "WFLYWS0042: Failed to stop context";
    }
    @Override
    public final Exception stopContextPhaseFailed(final Throwable arg0) {
        final Exception result = new Exception(String.format(getLoggingLocale(), stopContextPhaseFailed$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String destroyContextPhaseFailed$str() {
        return "WFLYWS0043: Failed to destroy context";
    }
    @Override
    public final Exception destroyContextPhaseFailed(final Throwable arg0) {
        final Exception result = new Exception(String.format(getLoggingLocale(), destroyContextPhaseFailed$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInstantiateServletDelegate$str() {
        return "WFLYWS0044: Cannot create servlet delegate: %s";
    }
    @Override
    public final IllegalStateException cannotInstantiateServletDelegate(final Throwable arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotInstantiateServletDelegate$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingDeploymentProperty$str() {
        return "WFLYWS0045: Cannot obtain deployment property: %s";
    }
    @Override
    public final IllegalStateException missingDeploymentProperty(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), missingDeploymentProperty$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleSecurityDomainsDetected$str() {
        return "WFLYWS0046: Multiple security domains not supported. First domain: '%s' second domain: '%s'";
    }
    @Override
    public final IllegalStateException multipleSecurityDomainsDetected(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), multipleSecurityDomainsDetected$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String sameUrlPatternRequested$str() {
        return "WFLYWS0047: Web Service endpoint %s with URL pattern %s is already registered. Web service endpoint %s is requesting the same URL pattern.";
    }
    @Override
    public final IllegalArgumentException sameUrlPatternRequested(final String arg0, final String arg1, final String arg2) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), sameUrlPatternRequested$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidServiceRefSetterMethodName$str() {
        return "WFLYWS0048: @WebServiceRef injection target is invalid.  Only setter methods are allowed: %s";
    }
    @Override
    public final DeploymentUnitProcessingException invalidServiceRefSetterMethodName(final Object arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), invalidServiceRefSetterMethodName$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String requiredServiceRefName$str() {
        return "WFLYWS0049: @WebServiceRef attribute 'name' is required for class level annotations.";
    }
    @Override
    public final DeploymentUnitProcessingException requiredServiceRefName() {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), requiredServiceRefName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String requiredServiceRefType$str() {
        return "WFLYWS0050: @WebServiceRef attribute 'type' is required for class level annotations.";
    }
    @Override
    public final DeploymentUnitProcessingException requiredServiceRefType() {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), requiredServiceRefType$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingConfig$str() {
        return "WFLYWS0051: Config %s doesn't exist";
    }
    @Override
    public final OperationFailedException missingConfig(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), missingConfig$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String wrongHandlerChainType$str() {
        return "WFLYWS0052: Unsupported handler chain type: %s. Supported types are either %s or %s";
    }
    @Override
    public final StartException wrongHandlerChainType(final String arg0, final String arg1, final String arg2) {
        final StartException result = new StartException(String.format(getLoggingLocale(), wrongHandlerChainType$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingHandlerChain$str() {
        return "WFLYWS0054: Config %s: %s handler chain with id %s doesn't exist";
    }
    @Override
    public final OperationFailedException missingHandlerChain(final String arg0, final String arg1, final String arg2) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), missingHandlerChain$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotGetURLForDescriptor$str() {
        return "WFLYWS0057: Unable to get URL for: %s";
    }
    @Override
    public final DeploymentUnitProcessingException cannotGetURLForDescriptor(final Throwable arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotGetURLForDescriptor$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jaxRpcNotSupported$str() {
        return "WFLYWS0058: Jakarta XML RPC not supported";
    }
    @Override
    public final DeploymentUnitProcessingException jaxRpcNotSupported() {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), jaxRpcNotSupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidLibraryInDeployment$str() {
        return "WFLYWS0059: %s library (%s) detected in ws endpoint deployment; either provide a proper deployment replacing embedded libraries with container module dependencies or disable the webservices subsystem for the current deployment adding a proper jboss-deployment-structure.xml descriptor to it. The former approach is recommended, as the latter approach causes most of the webservices Jakarta EE and any JBossWS specific functionality to be disabled.";
    }
    @Override
    public final DeploymentUnitProcessingException invalidLibraryInDeployment(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), invalidLibraryInDeployment$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String endpointClassNotFound$str() {
        return "WFLYWS0060: Web service endpoint class %s not found";
    }
    @Override
    public final DeploymentUnitProcessingException endpointClassNotFound(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), endpointClassNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String declaredEndpointInterfaceClassNotFound$str() {
        return "WFLYWS0061: The endpointInterface %s declared in the @WebService annotation on web service implementation bean %s was not found.";
    }
    @Override
    public final DeploymentUnitProcessingException declaredEndpointInterfaceClassNotFound(final String arg0, final Class<?> arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), declaredEndpointInterfaceClassNotFound$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jwsWebServiceClassVerificationFailed$str() {
        return "WFLYWS0062: Class verification of Java Web Service implementation class %s failed.";
    }
    @Override
    public final DeploymentUnitProcessingException jwsWebServiceClassVerificationFailed(final Class<?> arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), jwsWebServiceClassVerificationFailed$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotUpdateServerConfigBecauseOfReloadRequired$str() {
        return "WFLYWS0063: Could not update WS server configuration because of pending former model update(s) requiring reload.";
    }
    @Override
    public final DisabledOperationException couldNotUpdateServerConfigBecauseOfReloadRequired() {
        final DisabledOperationException result = new DisabledOperationException(String.format(getLoggingLocale(), couldNotUpdateServerConfigBecauseOfReloadRequired$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotUpdateServerConfigBecauseOfExistingWSDeployment$str() {
        return "WFLYWS0064: Could not update WS server configuration because of existing WS deployment on the server.";
    }
    @Override
    public final DisabledOperationException couldNotUpdateServerConfigBecauseOfExistingWSDeployment() {
        final DisabledOperationException result = new DisabledOperationException(String.format(getLoggingLocale(), couldNotUpdateServerConfigBecauseOfExistingWSDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidWSServlet$str() {
        return "WFLYWS0066: Servlet class %s declared in web.xml; either provide a proper deployment relying on JBossWS or disable the webservices subsystem for the current deployment adding a proper jboss-deployment-structure.xml descriptor to it. The former approach is recommended, as the latter approach causes most of the webservices Jakarta EE and any JBossWS specific functionality to be disabled.";
    }
    @Override
    public final WSFException invalidWSServlet(final String arg0) {
        final WSFException result = new WSFException(String.format(getLoggingLocale(), invalidWSServlet$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void couldNotActivateSubsystem(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, couldNotActivateSubsystem$str());
    }
    protected String couldNotActivateSubsystem$str() {
        return "WFLYWS0067: Could not activate the webservices subsystem.";
    }
    @Override
    public final void failedAuthorization(final String arg0) {
        super.log.logf(FQCN, DEBUG, null, failedAuthorization$str(), arg0);
    }
    protected String failedAuthorization$str() {
        return "WFLYWS0070: Authorization failed for user: %s";
    }
    @Override
    public final void failedAuthentication(final String arg0) {
        super.log.logf(FQCN, DEBUG, null, failedAuthentication$str(), arg0);
    }
    protected String failedAuthentication$str() {
        return "WFLYWS0071: Failed to authenticate username %s:, incorrect username/password";
    }
    @Override
    public final void failedAuthenticationWithException(final Throwable arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, DEBUG, arg0, failedAuthenticationWithException$str(), arg1, arg2);
    }
    protected String failedAuthenticationWithException$str() {
        return "WFLYWS0072: Error occurred when authenticate username %s. Exception message: %s";
    }
    protected String endpointAlreadyStopped$str() {
        return "WFLYWS0073: The target endpoint %s is undeploying or stopped";
    }
    @Override
    public final IllegalStateException endpointAlreadyStopped(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), endpointAlreadyStopped$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void warningLibraryInDeployment(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, warningLibraryInDeployment$str(), arg0, arg1);
    }
    protected String warningLibraryInDeployment$str() {
        return "WFLYWS0068: A potentially problematic %s library (%s) detected in ws endpoint deployment; Check if this library can be replaced with container module";
    }
    protected String legacySecurityUnsupported$str() {
        return "WFLYWS0074: The deployment is configured to use legacy security which is no longer supported.";
    }
    @Override
    public final IllegalStateException legacySecurityUnsupported() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), legacySecurityUnsupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String onlyStringPasswordAccepted$str() {
        return "WFLYWS0075: only string password accepted";
    }
    @Override
    public final IllegalArgumentException onlyStringPasswordAccepted() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), onlyStringPasswordAccepted$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void checkModuleDependency(final String arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, INFO, null, checkModuleDependency$str(), arg0, arg1, arg2);
    }
    protected String checkModuleDependency$str() {
        return "WFLYWS0076: Annotation '@%s' found on class '%s'. Please make sure '%s' module dependency is added to your deployment.";
    }
}
