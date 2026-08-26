package org.wildfly.extension.requestcontroller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.Object;
import org.jboss.logging.Logger;
import java.lang.Exception;


import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:27:21+0200")
public class RequestControllerLogger_$logger extends DelegatingBasicLogger implements RequestControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = RequestControllerLogger_$logger.class.getName();
    public RequestControllerLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void failedToCancelTask(final Object task, final Exception e) {
        super.log.logf(FQCN, WARN, e, failedToCancelTask$str(), task);
    }
    protected String failedToCancelTask$str() {
        return "WFLYREQCON001: Failed to cancel queued task %s";
    }
}
