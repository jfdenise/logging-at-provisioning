package org.jboss.as.security.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.SecurityException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.lang.RuntimeException;
import javax.xml.stream.XMLStreamException;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.util.Arrays;
import java.lang.UnsupportedOperationException;
import javax.xml.stream.Location;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-22T10:39:01+0200")
public class SecurityLogger_$logger extends DelegatingBasicLogger implements SecurityLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = SecurityLogger_$logger.class.getName();
    public SecurityLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String runtimeException$str() {
        return "WFLYSEC0007: Runtime Exception:";
    }
    @Override
    public final RuntimeException runtimeException(final Throwable e) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), runtimeException$str()), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String securityException$str() {
        return "WFLYSEC0015: Security Exception";
    }
    @Override
    public final SecurityException securityException(final Throwable t) {
        final SecurityException result = new SecurityException(String.format(getLoggingLocale(), securityException$str()), t);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedOperationExceptionUseResourceDesc$str() {
        return "WFLYSEC0018: Use the ResourceDescriptionResolver variant";
    }
    @Override
    public final UnsupportedOperationException unsupportedOperationExceptionUseResourceDesc() {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), unsupportedOperationExceptionUseResourceDesc$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedOperation$str() {
        return "WFLYSEC0019: Unsupported Operation";
    }
    @Override
    public final UnsupportedOperationException unsupportedOperation() {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), unsupportedOperation$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String xmlStreamExceptionAuth$str() {
        return "WFLYSEC0022: A security domain can have either an <authentication> or <authentication-jaspi> element, not both";
    }
    @Override
    public final XMLStreamException xmlStreamExceptionAuth(final Location loc) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), xmlStreamExceptionAuth$str()), loc);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String xmlStreamExceptionMissingAttribute$str() {
        return "WFLYSEC0023: Missing required attribute: either %s or %s must be present";
    }
    @Override
    public final XMLStreamException xmlStreamExceptionMissingAttribute(final String a, final String b, final Location loc) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), xmlStreamExceptionMissingAttribute$str(), a, b), loc);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String passwordAgain$str() {
        return "WFLYSEC0061:  again: ";
    }
    @Override
    public final String passwordAgain() {
        return String.format(getLoggingLocale(), passwordAgain$str());
    }
    protected String unableToEnableJaccSupport$str() {
        return "WFLYSEC0105: Unable to initialize legacy JACC support while elytron JACC support is enabled.";
    }
    @Override
    public final IllegalStateException unableToEnableJaccSupport() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unableToEnableJaccSupport$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String validationFailed$str() {
        return "WFLYSEC0107: Validation failed for %s";
    }
    @Override
    public final String validationFailed(final String name) {
        return String.format(getLoggingLocale(), validationFailed$str(), name);
    }
}
