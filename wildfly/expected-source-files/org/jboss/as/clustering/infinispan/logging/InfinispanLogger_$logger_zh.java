package org.jboss.as.clustering.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:51+0200")
public class InfinispanLogger_$logger_zh extends InfinispanLogger_$logger implements InfinispanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanLogger_$logger_zh(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
}
