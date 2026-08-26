package org.wildfly.microprofile.reactive.messaging.common._private;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:37+0200")
public class MicroProfileReactiveMessagingCommonLogger_$logger extends DelegatingBasicLogger implements MicroProfileReactiveMessagingCommonLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MicroProfileReactiveMessagingCommonLogger_$logger.class.getName();
    public MicroProfileReactiveMessagingCommonLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void foundPropertyUsingElytronClientSSLContext(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, foundPropertyUsingElytronClientSSLContext$str(), arg0, arg1);
    }
    protected String foundPropertyUsingElytronClientSSLContext$str() {
        return "WFLYRXMKAF0001: Found property %s, will use the Elytron client-ssl-context: %s";
    }
    protected String noElytronClientSSLContext$str() {
        return "WFLYRXMKAF0002: Could not find an Elytron client-ssl-context called: %s";
    }
    @Override
    public final IllegalStateException noElytronClientSSLContext(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noElytronClientSSLContext$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
}
