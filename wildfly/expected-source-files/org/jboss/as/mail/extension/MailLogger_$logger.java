package org.jboss.as.mail.extension;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.msc.service.StartException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:57:52+0200")
public class MailLogger_$logger extends DelegatingBasicLogger implements MailLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MailLogger_$logger.class.getName();
    public MailLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void boundMailSession(final String jndiName) {
        super.log.logf(FQCN, INFO, null, boundMailSession$str(), jndiName);
    }
    protected String boundMailSession$str() {
        return "WFLYMAIL0001: Bound mail session [%s]";
    }
    @Override
    public final void unboundMailSession(final String jndiName) {
        super.log.logf(FQCN, INFO, null, unboundMailSession$str(), jndiName);
    }
    protected String unboundMailSession$str() {
        return "WFLYMAIL0002: Unbound mail session [%s]";
    }
    @Override
    public final void removedMailSession(final String jndiName) {
        super.log.logf(FQCN, DEBUG, null, removedMailSession$str(), jndiName);
    }
    protected String removedMailSession$str() {
        return "WFLYMAIL0003: Removed mail session [%s]";
    }
    protected String outboundSocketBindingNotAvailable$str() {
        return "WFLYMAIL0004: No outbound socket binding configuration '%s' is available.";
    }
    @Override
    public final StartException outboundSocketBindingNotAvailable(final String outgoingSocketBindingRef) {
        final StartException result = new StartException(String.format(getLoggingLocale(), outboundSocketBindingNotAvailable$str(), outgoingSocketBindingRef));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void hostUnknown(final String hostName) {
        super.log.logf(FQCN, WARN, null, hostUnknown$str(), hostName);
    }
    protected String hostUnknown$str() {
        return "WFLYMAIL0009: Host name [%s] could not be resolved!";
    }
}
