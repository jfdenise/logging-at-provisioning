package org.wildfly.clustering.web.hotrod.logging;

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
    protected String failedToExpireSession$str() {
        return "WFLYCLWEBHR0001: No se pudo hacer expirar la sesión %1$s";
    }
    @Override
    protected String failedToActivateSession$str() {
        return "WFLYCLWEBHR0007: No se pudieron activar los atributos de sesión %1$s";
    }
    @Override
    protected String failedToActivateSessionAttribute$str() {
        return "WFLYCLWEBHR0008: No se logró activar el atributo %2$s de la sesión %1$s";
    }
    @Override
    protected String failedToReadSessionAttribute$str() {
        return "WFLYCLWEBHR0009: No se logró leer el atributo %2$s de la sesión %1$s";
    }
    @Override
    protected String failedToActivateAuthentication$str() {
        return "WFLYCLWEBHR0010: No se pudo activar la autenticación para el inicio de sesión único en %1$s";
    }
    @Override
    protected String missingSessionAttributeCacheEntry$str() {
        return "WFLYCLWEBHR0011: La sesión %1$s no tiene entrada de caché para el atributo %2$s";
    }
}
