package org.wildfly.clustering.web.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:48+0200")
public class InfinispanWebLogger_$logger_fr extends InfinispanWebLogger_$logger implements InfinispanWebLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanWebLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToPassivateSession$str() {
        return "WFLYCLWEBINF0001: N'a pas pu rendre passifs les attributs de la session %1$s";
    }
    @Override
    protected String failedToPassivateSessionAttribute$str() {
        return "WFLYCLWEBINF0002: N'a pas pu rendre passif l'attribut %2$s de la session %1$s";
    }
    @Override
    protected String invalidSession$str() {
        return "WFLYCLWEBINF0003: La session %1$s n'est pas valide";
    }
    @Override
    protected String failedToExpireSession$str() {
        return "WFLYCLWEBINF0004: N'a pas pu expirer la session %1$s";
    }
    @Override
    protected String failedToCancelSession$str() {
        return "WFLYCLWEBINF0005: N'a pas pu annuler l'expiration/la passivation de la session %1$s sur le propriétaire primaire.";
    }
    @Override
    protected String failedToScheduleSession$str() {
        return "WFLYCLWEBINF0006: N'a pas pu programmer l'expiration/la passivation de la session %1$s sur le propriétaire primaire.";
    }
    @Override
    protected String failedToActivateSession$str() {
        return "WFLYCLWEBINF0007: N'a pas pu activer les attributs de la session %1$s";
    }
    @Override
    protected String failedToActivateSessionAttribute$str() {
        return "WFLYCLWEBINF0008: N'a pas pu activer l'attribut %2$s de la session %1$s";
    }
    @Override
    protected String failedToReadSessionAttribute$str() {
        return "WFLYCLWEBINF0009: N'a pas pu lire l'attribut %2$s de la session %1$s";
    }
    @Override
    protected String failedToActivateAuthentication$str() {
        return "WFLYCLWEBINF0010: N'a pas pu activer l'authentification de SSO sur %1$s";
    }
    @Override
    protected String missingSessionAttributeCacheEntry$str() {
        return "WFLYCLWEBINF0011: La session %1$s n'a pas d'entrée de cache pour l’attribut %2$s";
    }
    @Override
    protected String evictionDisabled$str() {
        return "WFLYCLWEBINF0012: Désactivation de l'éviction pour le cache '%1$s'. La passivation de session Web doit être configurée via <max-active-sessions/> dans jboss-web.xml.";
    }
    @Override
    protected String expirationDisabled$str() {
        return "WFLYCLWEBINF0013: Désactivation de l'expiration pour le cache '%1$s'. L'expiration de session Web doit être configurée conformément à la section 7.5 de la spécification servlet.";
    }
}
