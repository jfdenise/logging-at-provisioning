package org.wildfly.clustering.server.infinispan;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:44+0200")
public class ClusteringServerLogger_$logger_de extends ClusteringServerLogger_$logger implements ClusteringServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ClusteringServerLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String commandDispatcherAlreadyExists$str() {
        return "WFLYCLSV0001: Ein Befehls-Dispatcher für %1$s existiert bereits";
    }
    @Override
    protected String registryPurgeFailed$str() {
        return "WFLYCLSV0020: Bereinigen von %1$s/%2$s Registry von alten Registry-Einträgen ist fehlgeschlagen für: %3$s";
    }
    @Override
    protected String registryListenerFailed$str() {
        return "WFLYCLSV0021: Benachrichtigen von Registry-Listener für %1$s/%2$s über Ereignis %3$s(%4$s) fehlgeschlagen";
    }
    @Override
    protected String failedToRestoreLocalRegistryEntry$str() {
        return "WFLYCLSV0022: Lokaler %1$s/%2$s-Registrierungseintrag konnte nach Zusammenführung von Netzwerkpartitionen nicht wiederhergestellt werden";
    }
    @Override
    protected String serviceProviderRegistrationListenerFailed$str() {
        return "WFLYCLSV0030: Benachrichtigen von %1$s/%2$s Service-Provider-Registrierungs-Listener über neue Provider fehlgeschlagen: %3$s";
    }
}
