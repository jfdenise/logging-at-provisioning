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
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:28+0200")
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
    public final void boundMailSession(final String arg0) {
        super.log.logf(FQCN, INFO, null, boundMailSession$str(), arg0);
    }
    protected String boundMailSession$str() {
        return "WFLYMAIL0001: Bound mail session [%s]";
    }
    @Override
    public final void unboundMailSession(final String arg0) {
        super.log.logf(FQCN, INFO, null, unboundMailSession$str(), arg0);
    }
    protected String unboundMailSession$str() {
        return "WFLYMAIL0002: Unbound mail session [%s]";
    }
    @Override
    public final void removedMailSession(final String arg0) {
        super.log.logf(FQCN, DEBUG, null, removedMailSession$str(), arg0);
    }
    protected String removedMailSession$str() {
        return "WFLYMAIL0003: Removed mail session [%s]";
    }
    protected String outboundSocketBindingNotAvailable$str() {
        return "WFLYMAIL0004: No outbound socket binding configuration '%s' is available.";
    }
    @Override
    public final StartException outboundSocketBindingNotAvailable(final String arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), outboundSocketBindingNotAvailable$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void hostUnknown(final String arg0) {
        super.log.logf(FQCN, WARN, null, hostUnknown$str(), arg0);
    }
    protected String hostUnknown$str() {
        return "WFLYMAIL0009: Host name [%s] could not be resolved!";
    }
}
