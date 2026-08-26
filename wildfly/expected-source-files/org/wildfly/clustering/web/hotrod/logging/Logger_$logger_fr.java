package org.wildfly.clustering.web.hotrod.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:48+0200")
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
    protected String failedToExpireSession$str() {
        return "WFLYCLWEBHR0001: N'a pas pu expirer la session %1$s";
    }
    @Override
    protected String failedToActivateSession$str() {
        return "WFLYCLWEBHR0007: N'a pas pu activer les attributs de la session %1$s";
    }
    @Override
    protected String failedToActivateSessionAttribute$str() {
        return "WFLYCLWEBHR0008: N'a pas pu activer l'attribut %2$s de la session %1$s";
    }
    @Override
    protected String failedToReadSessionAttribute$str() {
        return "WFLYCLWEBHR0009: N'a pas pu lire l'attribut %2$s de la session %1$s";
    }
    @Override
    protected String failedToActivateAuthentication$str() {
        return "WFLYCLWEBHR0010: N'a pas pu activer l'authentification de SSO sur %1$s";
    }
    @Override
    protected String missingSessionAttributeCacheEntry$str() {
        return "WFLYCLWEBHR0011: La session %1$s n'a pas d'entrée de cache pour l’attribut %2$s";
    }
}
