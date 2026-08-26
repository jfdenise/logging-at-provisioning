package org.wildfly.extension.rts.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import jakarta.transaction.SystemException;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import jakarta.ws.rs.container.ContainerResponseContext;
import java.lang.Throwable;
import org.jboss.logging.Logger;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.ERROR;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:58:12+0200")
public class RTSLogger_$logger extends DelegatingBasicLogger implements RTSLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = RTSLogger_$logger.class.getName();
    public RTSLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String failueOnImportingGlobalTransactionFromWildflyClient$str() {
        return "WFLYRTS0001: Can't import global transaction to wildfly transaction client.";
    }
    @Override
    public final IllegalStateException failueOnImportingGlobalTransactionFromWildflyClient(final SystemException se) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failueOnImportingGlobalTransactionFromWildflyClient$str()), se);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void cannotGetTransactionStatus(final ContainerResponseContext responseCtx, final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, cannotGetTransactionStatus$str(), responseCtx);
    }
    protected String cannotGetTransactionStatus$str() {
        return "WFLYRTS0002: Cannot get transaction status on handling response context %s";
    }
}
