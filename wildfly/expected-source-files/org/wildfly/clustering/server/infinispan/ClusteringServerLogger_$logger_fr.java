package org.wildfly.clustering.server.infinispan;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:44+0200")
public class ClusteringServerLogger_$logger_fr extends ClusteringServerLogger_$logger implements ClusteringServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ClusteringServerLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String commandDispatcherAlreadyExists$str() {
        return "WFLYCLSV0001: Un répartiteur de commandes existe déjà pour %1$s";
    }
    @Override
    protected String registryPurgeFailed$str() {
        return "WFLYCLSV0020: Échec de la purge du registre %1$s/%2$s des anciennes entrées de registre pour : %3$s";
    }
    @Override
    protected String registryListenerFailed$str() {
        return "WFLYCLSV0021: Impossible de notifier l'écouteur de registre %1$s/%2$s de l'événement %3$s(%4$s)";
    }
    @Override
    protected String failedToRestoreLocalRegistryEntry$str() {
        return "WFLYCLSV0022: N'a pas pu restaurer l'entrée du registre local %1$s/%2$s suite à la fusion de la partition de réseau";
    }
    @Override
    protected String serviceProviderRegistrationListenerFailed$str() {
        return "WFLYCLSV0030: Impossible de notifier l'écouteur d'enregistrement du fournisseur de service %1$s/%2$s des nouveaux fournisseurs : %3$s";
    }
}
