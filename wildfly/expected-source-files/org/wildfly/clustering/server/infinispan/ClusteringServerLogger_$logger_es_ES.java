package org.wildfly.clustering.server.infinispan;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:44+0200")
public class ClusteringServerLogger_$logger_es_ES extends ClusteringServerLogger_$logger_es implements ClusteringServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ClusteringServerLogger_$logger_es_ES(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("es", "ES");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String commandDispatcherAlreadyExists$str() {
        return "WFLYCLSV0001: Ya existe un emisor de comandos para %1$s";
    }
    @Override
    protected String registryPurgeFailed$str() {
        return "WFLYCLSV0020: No se pudo purgar el registro %1$s/%2$s de las entradas anteriores para: %3$s";
    }
    @Override
    protected String registryListenerFailed$str() {
        return "WFLYCLSV0021: No se pudo notificar el oyente de registro %1$s/%2$s del evento %3$s(%4$s)";
    }
    @Override
    protected String failedToRestoreLocalRegistryEntry$str() {
        return "WFLYCLSV0022: Error al restaurar la entrada de registro %1$s/%2$s local después de la fusión de partición de red";
    }
    @Override
    protected String serviceProviderRegistrationListenerFailed$str() {
        return "WFLYCLSV0030: No se pudo notificar el oyente de registro del servicio de proveedor %1$s/%2$s de nuevos proveedores: %3$s";
    }
}
