package org.wildfly.clustering.web.hotrod.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:48+0200")
public class Logger_$logger_de extends Logger_$logger implements Logger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public Logger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToExpireSession$str() {
        return "WFLYCLWEBHR0001: Verfallen von Session %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToActivateSession$str() {
        return "WFLYCLWEBHR0007: Aktivierung der Attribute von Session %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToActivateSessionAttribute$str() {
        return "WFLYCLWEBHR0008: Aktivierung des Attribut %2$s von Session %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToReadSessionAttribute$str() {
        return "WFLYCLWEBHR0009: Lesen des Attribut %2$s von Session %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToActivateAuthentication$str() {
        return "WFLYCLWEBHR0010: Aktivierung von Authentifizierung für Single Sign On %1$s fehlgeschlagen";
    }
    @Override
    protected String missingSessionAttributeCacheEntry$str() {
        return "WFLYCLWEBHR0011: Für Session %1$s fehlt Cache-Eintrag für Attribut %2$s";
    }
}
