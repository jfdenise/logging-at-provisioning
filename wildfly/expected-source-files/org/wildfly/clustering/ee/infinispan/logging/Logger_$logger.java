package org.wildfly.clustering.ee.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.lang.Object;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2025-08-27T11:22:17+0200")
public class Logger_$logger extends DelegatingBasicLogger implements org.wildfly.clustering.ee.infinispan.logging.Logger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = Logger_$logger.class.getName();
    public Logger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void failedToCancel(final Throwable cause, final Object id) {
        super.log.logf(FQCN, INFO, cause, failedToCancel$str(), id);
    }
    protected String failedToCancel$str() {
        return "WFLYCLEEINF0001: Failed to cancel %s on primary owner.";
    }
    @Override
    public final void failedToSchedule(final Throwable cause, final Object id) {
        super.log.logf(FQCN, INFO, cause, failedToSchedule$str(), id);
    }
    protected String failedToSchedule$str() {
        return "WFLYCLEEINF0002: Failed to schedule %s on primary owner.";
    }
}
