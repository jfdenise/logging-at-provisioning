package org.wildfly.extension.discovery;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.Logger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:13+0200")
public class Messages_$logger extends DelegatingBasicLogger implements Messages, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = Messages_$logger.class.getName();
    public Messages_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
}
