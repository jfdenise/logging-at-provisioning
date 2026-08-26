package org.jboss.as.jaxrs.logging;

import java.util.Locale;
import org.jboss.jandex.AnnotationTarget;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.lang.Exception;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.PathAddress;
import java.lang.Throwable;
import java.util.List;
import java.lang.Class;
import java.util.Arrays;
import org.jboss.dmr.ModelNode;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:22+0200")
public class JaxrsLogger_$logger extends DelegatingBasicLogger implements JaxrsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = JaxrsLogger_$logger.class.getName();
    public JaxrsLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void classAnnotationNotFound(final String arg0, final AnnotationTarget arg1) {
        super.log.logf(FQCN, WARN, null, classAnnotationNotFound$str(), arg0, arg1);
    }
    protected String classAnnotationNotFound$str() {
        return "WFLYRS0001: %s annotation not on Class: %s";
    }
    @Override
    public final void classOrMethodAnnotationNotFound(final String arg0, final AnnotationTarget arg1) {
        super.log.logf(FQCN, WARN, null, classOrMethodAnnotationNotFound$str(), arg0, arg1);
    }
    protected String classOrMethodAnnotationNotFound$str() {
        return "WFLYRS0002: %s annotation not on Class or Method: %s";
    }
    @Override
    public final void moreThanOneServletMapping(final String arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, null, moreThanOneServletMapping$str(), arg0, arg1);
    }
    protected String moreThanOneServletMapping$str() {
        return "WFLYRS0003: More than one mapping found for Jakarta RESTful Web Services servlet: %s the second mapping %s will not work";
    }
    protected String cannotLoadApplicationClass$str() {
        return "WFLYRS0006: Could not load Jakarta RESTful Web Services Application class";
    }
    @Override
    public final DeploymentUnitProcessingException cannotLoadApplicationClass(final Throwable arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotLoadApplicationClass$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String typeNameNotAnEjbView$str() {
        return "WFLYRS0010: Jakarta RESTful Web Services resource %s does not correspond to a view on the Jakarta Enterprise Beans %s. @Path annotations can only be placed on classes or interfaces that represent a local, remote or no-interface view of a Jakarta Enterprise Beans bean.";
    }
    @Override
    public final DeploymentUnitProcessingException typeNameNotAnEjbView(final List<Class<?>> arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), typeNameNotAnEjbView$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidParamValue$str() {
        return "WFLYRS0011: Invalid value for parameter %s: %s";
    }
    @Override
    public final DeploymentUnitProcessingException invalidParamValue(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), invalidParamValue$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSpringIntegrationJar$str() {
        return "WFLYRS0012: No spring integration jar found";
    }
    @Override
    public final DeploymentUnitProcessingException noSpringIntegrationJar() {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), noSpringIntegrationJar$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void disablePropertyDeprecated() {
        super.log.logf(FQCN, WARN, null, disablePropertyDeprecated$str());
    }
    protected String disablePropertyDeprecated$str() {
        return "WFLYRS0013: The context param org.jboss.as.jaxrs.disableSpringIntegration is deprecated, and will be removed in a future release. Please use org.jboss.as.jaxrs.enableSpringIntegration instead";
    }
    @Override
    public final void failedToRegisterManagementViewForRESTResources(final String arg0, final Exception arg1) {
        super.log.logf(FQCN, ERROR, arg1, failedToRegisterManagementViewForRESTResources$str(), arg0);
    }
    protected String failedToRegisterManagementViewForRESTResources$str() {
        return "WFLYRS0014: Failed to register management view for REST resource class: %s";
    }
    @Override
    public final void noServletDeclaration(final String arg0) {
        super.log.logf(FQCN, WARN, null, noServletDeclaration$str(), arg0);
    }
    protected String noServletDeclaration$str() {
        return "WFLYRS0015: No Servlet declaration found for Jakarta RESTful Web Services application.  In %s either provide a class that extends jakarta.ws.rs.core.Application or declare a servlet class in web.xml.";
    }
    @Override
    public final void resteasyVersion(final String arg0) {
        super.log.logf(FQCN, INFO, null, resteasyVersion$str(), arg0);
    }
    protected String resteasyVersion$str() {
        return "WFLYRS0016: RESTEasy version %s";
    }
    @Override
    public final void failedToReadAttribute(final Exception arg0, final PathAddress arg1, final ModelNode arg2) {
        super.log.logf(FQCN, WARN, arg0, failedToReadAttribute$str(), arg1, arg2);
    }
    protected String failedToReadAttribute$str() {
        return "WFLYRS0017: Failed to read attribute from Jakarta RESTful Web Services deployment at %s with name %s";
    }
    @Override
    public final void jacksonAnnotationDetected(final String arg0) {
        super.log.logf(FQCN, WARN, null, jacksonAnnotationDetected$str(), arg0);
    }
    protected String jacksonAnnotationDetected$str() {
        return "WFLYRS0018: Explicit usage of Jackson annotation in a Jakarta RESTful Web Services deployment; the system will disable Jakarta JSON Binding processing for the current deployment. Consider setting the '%s' property to 'false' to restore Jakarta JSON Binding.";
    }
    @Override
    public final void paramConverterFailed(final String arg0, final String arg1, final String arg2, final String arg3, final String arg4, final String arg5) {
        super.log.logf(FQCN, WARN, null, paramConverterFailed$str(), arg0, arg1, arg2, arg3, arg4, arg5);
    }
    protected String paramConverterFailed$str() {
        return "WFLYRS0019: Error converting default value %s for parameter %s in method %s using param converter %s. Exception: %s : %s";
    }
    @Override
    public final void baseTypeMethodFailed(final String arg0, final String arg1, final String arg2, final String arg3, final String arg4, final String arg5) {
        super.log.logf(FQCN, WARN, null, baseTypeMethodFailed$str(), arg0, arg1, arg2, arg3, arg4, arg5);
    }
    protected String baseTypeMethodFailed$str() {
        return "WFLYRS0020: \"Error converting default value %s for parameter %s in method %s using method %s. Exception: %s : %s\"";
    }
    @Override
    public final void classIntrospectionFailure(final String arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, null, classIntrospectionFailure$str(), arg0, arg1);
    }
    protected String classIntrospectionFailure$str() {
        return "WFLYRS0021: %s %s";
    }
    @Override
    public final void tracingEnabled(final String arg0) {
        super.log.logf(FQCN, WARN, null, tracingEnabled$str(), arg0);
    }
    protected String tracingEnabled$str() {
        return "WFLYRS0029: The RESTEasy tracing API has been enabled for deployment \"%s\" and is not meant for production.";
    }
    protected String invalidConfigurationFactory$str() {
        return "WFLYRS0030: Invalid ConfigurationFactory found %s";
    }
    @Override
    public final IllegalStateException invalidConfigurationFactory(final Class<?> arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidConfigurationFactory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToLoadConfigurationFactory(final String arg0) {
        super.log.logf(FQCN, WARN, null, failedToLoadConfigurationFactory$str(), arg0);
    }
    protected String failedToLoadConfigurationFactory$str() {
        return "WFLYRS0031: Failed to load RESTEasy MicroProfile Configuration: %s";
    }
}
