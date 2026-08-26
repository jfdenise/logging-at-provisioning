package org.wildfly.extension.microprofile.openapi.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:36+0200")
public class MicroProfileOpenAPILogger_$logger_fr extends MicroProfileOpenAPILogger_$logger implements MicroProfileOpenAPILogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileOpenAPILogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String requiredListenersNotFound$str() {
        return "WFLYMPOAI0006: Le §5.1 de la spécification de l'OpenAPI de MicroProfile exige que le point de terminaison soit accessible via %2$s, mais il n'existe pas de tel listener pour le serveur '%1$s'.";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMPOAI0001: Activation du sous-système OpenAPI MicroProfile";
    }
    @Override
    protected String endpointRegistered$str() {
        return "WFLYMPOAI0004: Point de terminaison OpenAPI MicroProfile enregistré '%1$s' pour l'hôte '%2$s'";
    }
    @Override
    protected String failedToLoadStaticFile$str() {
        return "WFLYMPOAI0002: Echec du chargement de l'OpenAPI '%1$s' depuis le déploiement '%2$s'";
    }
    @Override
    protected String disabled$str() {
        return "WFLYMPOAI0008: La documentation MicroProfile OpenAPI est désactivée pour '%1$s '";
    }
    @Override
    protected String endpointAlreadyRegistered$str() {
        return "WFLYMPOAI0003: Le point de terminaison MicroProfile OpenAPI est déjà enregistré pour l'hôte '%1$s'. Ignorer la documentation OpenAPI de '%2$s'.";
    }
    @Override
    protected String endpointUnregistered$str() {
        return "WFLYMPOAI0005: Point de terminaison OpenAPI MicroProfile non enregistré '%1$s' pour l'hôte '%2$s'";
    }
    @Override
    protected String nonStandardEndpoint$str() {
        return "WFLYMPOAI0007: Le §5.1 de la spécification MicroProfile OpenAPI exige que la documentation soit disponible à l'adresse '%3$s', mais '%1$s' est configuré pour utiliser '%2$s'";
    }
}
