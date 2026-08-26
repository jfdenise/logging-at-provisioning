package org.wildfly.extension.microprofile.opentracing;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:27+0200")
public class TracingExtensionLogger_$logger extends DelegatingBasicLogger implements TracingExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = TracingExtensionLogger_$logger.class.getName();
    public TracingExtensionLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void activatingSubsystem() {
        super.log.logf(FQCN, INFO, null, activatingSubsystem$str());
    }
    protected String activatingSubsystem$str() {
        return "WFLYTRACEXT0001: Activating MicroProfile OpenTracing Subsystem";
    }
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "WFLYTRACEXT0013: The migrate operation cannot be performed: the server must be in admin-only mode";
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
        return "WFLYTRACEXT0014: Migration failed. See results for more details.";
    }
    @Override
    public final String migrationFailed() {
        return String.format(getLoggingLocale(), migrationFailed$str());
    }
}
