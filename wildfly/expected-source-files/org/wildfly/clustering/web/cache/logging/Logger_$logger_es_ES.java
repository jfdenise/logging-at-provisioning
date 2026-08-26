package org.wildfly.clustering.web.cache.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:48+0200")
public class Logger_$logger_es_ES extends Logger_$logger_es implements Logger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public Logger_$logger_es_ES(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("es", "ES");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String invalidSession$str() {
        return "WFLYCLWEB0001: La sesión %1$s no es válida";
    }
}
