package org.jboss.as.clustering.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:51+0200")
public class InfinispanLogger_$logger_fr extends InfinispanLogger_$logger implements InfinispanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYCLINF0001: Activation du sous-système Infinispan.";
    }
    @Override
    protected String cacheStarted$str() {
        return "WFLYCLINF0002: Cache %1$s démarré depuis le conteneur %2$s";
    }
    @Override
    protected String cacheStopped$str() {
        return "WFLYCLINF0003: Cache %1$s arrêté depuis le conteneur %2$s";
    }
    @Override
    protected String invalidCacheStore$str() {
        return "WFLYCLINF0010: %1$s n'est pas un store cache valide";
    }
    @Override
    protected String remoteCacheContainerStarted$str() {
        return "WFLYCLINF0029: Démarrage du conteneur de cache distant « %1$s ».";
    }
    @Override
    protected String remoteCacheContainerStopped$str() {
        return "WFLYCLINF0030: Arrêt du conteneur de cache distant « %1$s ».";
    }
    @Override
    protected String remoteCacheMustBeDefined$str() {
        return "WFLYCLINF0031: La version du protocole HotRod %1$s spécifiée ne supporte pas la création automatique de caches. Le cache nommé « %2$s » doit déjà être créé sur le serveur Infinispan.";
    }
    @Override
    protected String marshallerEnumValueDeprecated$str() {
        return "WFLYCLINF0033: L'attribut '%1$s' est configuré pour utiliser une valeur obsolète : %2$s; utilisez plutôt l'une des valeurs suivantes : %3$s";
    }
}
