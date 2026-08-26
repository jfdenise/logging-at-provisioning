package org.jboss.as.service.logging;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import org.jboss.vfs.VirtualFile;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import javax.xml.namespace.QName;
import java.lang.String;
import org.jboss.logging.Logger;
import javax.management.ObjectName;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.lang.Class;
import org.jboss.msc.service.StartException;
import java.util.Arrays;
import org.jboss.as.server.deployment.DeploymentUnit;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:49+0200")
public class SarLogger_$logger extends DelegatingBasicLogger implements SarLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = SarLogger_$logger.class.getName();
    public SarLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String failedExecutingLegacyMethod$str() {
        return "WFLYSAR0001: Failed to execute legacy service %s method";
    }
    @Override
    public final String failedExecutingLegacyMethod(final String arg0) {
        return String.format(getLoggingLocale(), failedExecutingLegacyMethod$str(), arg0);
    }
    @Override
    public final void propertyNotFound(final Class<?> arg0) {
        super.log.logf(FQCN, WARN, null, propertyNotFound$str(), arg0);
    }
    protected String propertyNotFound$str() {
        return "WFLYSAR0002: Unable to find PropertyEditor for type %s";
    }
    protected String classNotFound$str() {
        return "WFLYSAR0003: Class not found";
    }
    @Override
    public final IllegalArgumentException classNotFound(final Throwable arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), classNotFound$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String classNotInstantiated$str() {
        return "WFLYSAR0004: Class not instantiated";
    }
    @Override
    public final IllegalArgumentException classNotInstantiated(final Throwable arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), classNotInstantiated$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToGetAttachment$str() {
        return "WFLYSAR0005: Failed to get %s attachment for %s";
    }
    @Override
    public final DeploymentUnitProcessingException failedToGetAttachment(final String arg0, final DeploymentUnit arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToGetAttachment$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedXmlParsing$str() {
        return "WFLYSAR0006: Failed to parse service xml [%s]";
    }
    @Override
    public final DeploymentUnitProcessingException failedXmlParsing(final VirtualFile arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedXmlParsing$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final DeploymentUnitProcessingException failedXmlParsing(final Throwable arg0, final VirtualFile arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedXmlParsing$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String methodNotFound$str() {
        return "WFLYSAR0007: Method '%s(%s)' not found for: %s";
    }
    @Override
    public final IllegalStateException methodNotFound(final String arg0, final String arg1, final String arg2) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), methodNotFound$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingRequiredAttributes$str() {
        return "WFLYSAR0008: Missing one or more required attributes:";
    }
    @Override
    public final String missingRequiredAttributes() {
        return String.format(getLoggingLocale(), missingRequiredAttributes$str());
    }
    protected String nullVar$str() {
        return "WFLYSAR0009: %s is null";
    }
    @Override
    public final IllegalArgumentException nullVar(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullVar$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String propertyMethodNotFound$str() {
        return "WFLYSAR0010: %s method for property '%s' not found for: %s";
    }
    @Override
    public final IllegalStateException propertyMethodNotFound(final String arg0, final String arg1, final String arg2) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), propertyMethodNotFound$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedContent$str() {
        return "WFLYSAR0011: Unexpected content of type '%s' named '%s', text is: %s";
    }
    @Override
    public final String unexpectedContent(final String arg0, final QName arg1, final String arg2) {
        return String.format(getLoggingLocale(), unexpectedContent$str(), arg0, arg1, arg2);
    }
    protected String failedToProcessSarChild$str() {
        return "WFLYSAR0012: Failed to process SAR child archives for [%s]";
    }
    @Override
    public final DeploymentUnitProcessingException failedToProcessSarChild(final Throwable arg0, final VirtualFile arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToProcessSarChild$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String malformedDependencyName$str() {
        return "WFLYSAR0013: Malformed dependency name %s";
    }
    @Override
    public final DeploymentUnitProcessingException malformedDependencyName(final Throwable arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), malformedDependencyName$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String defaultConstructorNotFound$str() {
        return "WFLYSAR0014: Could not find default constructor for %s";
    }
    @Override
    public final DeploymentUnitProcessingException defaultConstructorNotFound(final Class<?> arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), defaultConstructorNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mbeanRegistrationFailed$str() {
        return "WFLYSAR0015: Failed to register mbean [%s]";
    }
    @Override
    public final StartException mbeanRegistrationFailed(final Throwable arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), mbeanRegistrationFailed$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void cannotUnregisterObject() {
        super.log.logf(FQCN, WARN, null, cannotUnregisterObject$str());
    }
    protected String cannotUnregisterObject$str() {
        return "WFLYSAR0016: No ObjectName available to unregister";
    }
    @Override
    public final void unregistrationFailure(final Throwable arg0, final ObjectName arg1) {
        super.log.logf(FQCN, ERROR, arg0, unregistrationFailure$str(), arg1);
    }
    protected String unregistrationFailure$str() {
        return "WFLYSAR0017: Failed to unregister [%s]";
    }
    protected String objectSupplierNotAvailable$str() {
        return "WFLYSAR0018: Object supplier not available";
    }
    @Override
    public final IllegalStateException objectSupplierNotAvailable() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), objectSupplierNotAvailable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String objectNotAvailable$str() {
        return "WFLYSAR0019: Object not available";
    }
    @Override
    public final IllegalStateException objectNotAvailable() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), objectNotAvailable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String methodIsNotAccessible$str() {
        return "WFLYSAR0020: Method is not accessible";
    }
    @Override
    public final IllegalStateException methodIsNotAccessible(final Throwable arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), methodIsNotAccessible$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToInvokeMethod$str() {
        return "WFLYSAR0021: Failed to invoke method";
    }
    @Override
    public final IllegalStateException failedToInvokeMethod(final Throwable arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failedToInvokeMethod$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
}
