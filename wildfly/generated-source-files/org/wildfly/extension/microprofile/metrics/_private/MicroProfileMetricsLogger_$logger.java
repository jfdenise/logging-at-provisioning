package org.wildfly.extension.microprofile.metrics._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:35+0200")
public class MicroProfileMetricsLogger_$logger extends DelegatingBasicLogger implements MicroProfileMetricsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MicroProfileMetricsLogger_$logger.class.getName();
    public MicroProfileMetricsLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "WFLYMPMETRICS0010: The migrate operation cannot be performed. The server must be in admin-only mode.";
    }
    @Override
    public final OperationFailedException migrateOperationAllowedOnlyInAdminOnly() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), migrateOperationAllowedOnlyInAdminOnly$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String migrationFailed$str() {
        return "WFLYMPMETRICS0011: Migration failed. See results for more details.";
    }
    @Override
    public final String migrationFailed() {
        return String.format(getLoggingLocale(), migrationFailed$str());
    }
}
