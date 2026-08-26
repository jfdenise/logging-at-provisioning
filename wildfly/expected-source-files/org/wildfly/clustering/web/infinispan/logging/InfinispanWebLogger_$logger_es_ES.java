package org.wildfly.clustering.web.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:48+0200")
public class InfinispanWebLogger_$logger_es_ES extends InfinispanWebLogger_$logger_es implements InfinispanWebLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanWebLogger_$logger_es_ES(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("es", "ES");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToPassivateSession$str() {
        return "WFLYCLWEBINF0001: No se pudieron hacer pasivos los atributos de sesión %1$s";
    }
    @Override
    protected String failedToPassivateSessionAttribute$str() {
        return "WFLYCLWEBINF0002: No se logró hacer pasivo el atributo %2$s de la sesión %1$s";
    }
    @Override
    protected String invalidSession$str() {
        return "WFLYCLWEBINF0003: La sesión %1$s no es válida";
    }
    @Override
    protected String failedToExpireSession$str() {
        return "WFLYCLWEBINF0004: No se pudo hacer expirar la sesión %1$s";
    }
    @Override
    protected String failedToCancelSession$str() {
        return "WFLYCLWEBINF0005: No se logró cancelar la expiración o pasivisación de la sesión %1$s en propietario primario.";
    }
    @Override
    protected String failedToScheduleSession$str() {
        return "WFLYCLWEBINF0006: No se logró programar expiración o pasivisación de la sesión %1$s en propietario primario.";
    }
    @Override
    protected String failedToActivateSession$str() {
        return "WFLYCLWEBINF0007: No se pudieron activar los atributos de sesión %1$s";
    }
    @Override
    protected String failedToActivateSessionAttribute$str() {
        return "WFLYCLWEBINF0008: No se logró activar el atributo %2$s de la sesión %1$s";
    }
    @Override
    protected String failedToReadSessionAttribute$str() {
        return "WFLYCLWEBINF0009: No se logró leer el atributo %2$s de la sesión %1$s";
    }
    @Override
    protected String failedToActivateAuthentication$str() {
        return "WFLYCLWEBINF0010: No se pudo activar la autenticación para el inicio de sesión único en %1$s";
    }
    @Override
    protected String missingSessionAttributeCacheEntry$str() {
        return "WFLYCLWEBINF0011: La sesión %1$s no tiene entrada de caché para el atributo %2$s";
    }
    @Override
    protected String evictionDisabled$str() {
        return "WFLYCLWEBINF0012: Desactivando expulsión para la caché '%1$s'. La pasivisación de la sesión web debe configurarse a través de <max-active-sessions/> en jboss-web.xml.";
    }
    @Override
    protected String expirationDisabled$str() {
        return "WFLYCLWEBINF0013: Desactivando expiración para la caché '%1$s'. La expiración de la sesión web debe configurarse según §7.5 de la especificación de servlet.";
    }
}
