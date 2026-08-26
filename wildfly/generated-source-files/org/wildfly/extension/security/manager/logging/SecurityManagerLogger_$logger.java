package org.wildfly.extension.security.manager.logging;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.lang.StringBuilder;
import org.jboss.logging.DelegatingBasicLogger;
import javax.xml.namespace.QName;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import org.jboss.logging.Logger;
import javax.xml.stream.XMLStreamException;
import org.jboss.logging.BasicLogger;
import java.util.Arrays;
import javax.xml.stream.Location;


import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:50+0200")
public class SecurityManagerLogger_$logger extends DelegatingBasicLogger implements SecurityManagerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = SecurityManagerLogger_$logger.class.getName();
    public SecurityManagerLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String invalidPermissionsXMLVersion$str() {
        return "WFLYSM0002: Invalid version found in the permissions element. Found %s, expected %s";
    }
    @Override
    public final XMLStreamException invalidPermissionsXMLVersion(final String arg0, final String arg1) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), invalidPermissionsXMLVersion$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String invalidSubsystemConfiguration$str() {
        return "WFLYSM0003: Subsystem configuration error: the following permissions are not implied by the maximum permissions set %s";
    }
    @Override
    public final OperationFailedException invalidSubsystemConfiguration(final StringBuilder arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidSubsystemConfiguration$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidDeploymentConfiguration$str() {
        return "WFLYSM0004: Deployment configuration error: the following permissions are not implied by the maximum permissions set %s";
    }
    @Override
    public final DeploymentUnitProcessingException invalidDeploymentConfiguration(final StringBuilder arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), invalidDeploymentConfiguration$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String rejectedEmptyMaximumSet$str() {
        return "WFLYSM0005: Empty maximum sets are not understood in the target model version and must be rejected";
    }
    @Override
    public final String rejectedEmptyMaximumSet() {
        return String.format(getLoggingLocale(), rejectedEmptyMaximumSet$str());
    }
    protected String unexpectedElement$str() {
        return "WFLYSM0006: Unexpected element '%s' encountered";
    }
    @Override
    public final XMLStreamException unexpectedElement(final QName arg0, final Location arg1) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unexpectedElement$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedAttribute$str() {
        return "WFLYSM0007: Unexpected attribute '%s' encountered";
    }
    @Override
    public final XMLStreamException unexpectedAttribute(final QName arg0, final Location arg1) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unexpectedAttribute$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedEndOfDocument$str() {
        return "WFLYSM0008: Unexpected end of document";
    }
    @Override
    public final XMLStreamException unexpectedEndOfDocument(final Location arg0) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unexpectedEndOfDocument$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingRequiredAttributes$str() {
        return "WFLYSM0009: Missing required attribute(s): %s";
    }
    @Override
    public final XMLStreamException missingRequiredAttributes(final StringBuilder arg0, final Location arg1) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), missingRequiredAttributes$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingRequiredElements$str() {
        return "WFLYSM0010: Missing required element(s): %s";
    }
    @Override
    public final XMLStreamException missingRequiredElements(final StringBuilder arg0, final Location arg1) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), missingRequiredElements$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedContentType$str() {
        return "WFLYSM0011: Unexpected content of type %s";
    }
    @Override
    public final XMLStreamException unexpectedContentType(final String arg0, final Location arg1) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unexpectedContentType$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void ignoredPermission(final String arg0, final String arg1, final String arg2, final String arg3) {
        super.log.logf(FQCN, WARN, null, ignoredPermission$str(), arg0, arg1, arg2, arg3);
    }
    protected String ignoredPermission$str() {
        return "WFLYSM0012: The following permission could not be constructed and will be ignored in the %s: (class=\"%s\" name=\"%s\" actions=\"%s\")";
    }
}
