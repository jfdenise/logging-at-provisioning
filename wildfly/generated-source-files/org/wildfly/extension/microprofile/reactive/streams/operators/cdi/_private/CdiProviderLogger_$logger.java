package org.wildfly.extension.microprofile.reactive.streams.operators.cdi._private;

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
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:39+0200")
public class CdiProviderLogger_$logger extends DelegatingBasicLogger implements CdiProviderLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = CdiProviderLogger_$logger.class.getName();
    public CdiProviderLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String noImplementationFound$str() {
        return "WFLYRXSTOPSCDI0001: No implementation of the %s found in the classpath";
    }
    @Override
    public final IllegalStateException noImplementationFound(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noImplementationFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
}
