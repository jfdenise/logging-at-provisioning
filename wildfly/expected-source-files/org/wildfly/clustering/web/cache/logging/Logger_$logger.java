package org.wildfly.clustering.web.cache.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2025-08-27T11:22:48+0200")
public class Logger_$logger extends DelegatingBasicLogger implements org.wildfly.clustering.web.cache.logging.Logger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = Logger_$logger.class.getName();
    public Logger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String invalidSession$str() {
        return "WFLYCLWEB0001: Session %s is not valid";
    }
    @Override
    public final IllegalStateException invalidSession(final String sessionId) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidSession$str(), sessionId));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
}
