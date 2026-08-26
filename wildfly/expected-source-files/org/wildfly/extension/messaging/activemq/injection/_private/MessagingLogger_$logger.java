package org.wildfly.extension.messaging.activemq.injection._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import jakarta.jms.IllegalStateRuntimeException;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.Logger;
import java.util.Arrays;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:57:52+0200")
public class MessagingLogger_$logger extends DelegatingBasicLogger implements MessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MessagingLogger_$logger.class.getName();
    public MessagingLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String callNotPermittedOnInjectedJMSContext$str() {
        return "WFLYMSGAMQINJ0001: It is not permitted to call this method on injected JMSContext (see Jakarta Messaging 2.0 spec, §12.4.5).";
    }
    @Override
    public final IllegalStateRuntimeException callNotPermittedOnInjectedJMSContext() {
        final IllegalStateRuntimeException result = new IllegalStateRuntimeException(String.format(getLoggingLocale(), callNotPermittedOnInjectedJMSContext$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
}
