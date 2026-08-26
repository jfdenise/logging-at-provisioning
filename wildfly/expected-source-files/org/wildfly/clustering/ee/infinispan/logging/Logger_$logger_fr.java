package org.wildfly.clustering.ee.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:17+0200")
public class Logger_$logger_fr extends Logger_$logger implements Logger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public Logger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToCancel$str() {
        return "WFLYCLEEINF0001: Échec de l'annulation de %1$s sur le propriétaire principal.";
    }
    @Override
    protected String failedToSchedule$str() {
        return "WFLYCLEEINF0002: Échec de la programmation de %1$s sur le propriétaire principal.";
    }
}
