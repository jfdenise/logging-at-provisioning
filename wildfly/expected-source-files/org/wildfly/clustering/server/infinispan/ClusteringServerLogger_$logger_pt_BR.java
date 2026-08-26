package org.wildfly.clustering.server.infinispan;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:44+0200")
public class ClusteringServerLogger_$logger_pt_BR extends ClusteringServerLogger_$logger_pt implements ClusteringServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ClusteringServerLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String commandDispatcherAlreadyExists$str() {
        return "WFLYCLSV0001: Já existe um dispatcher de comando para %1$s";
    }
    @Override
    protected String registryPurgeFailed$str() {
        return "WFLYCLSV0020: Falha ao limpar registro %1$s/%2$s de entradas antigas de registros para: %3$s";
    }
    @Override
    protected String registryListenerFailed$str() {
        return "WFLYCLSV0021: Falha ao notificar o ouvinte de registro %1$s/%2$s do evento %3$s(%4$s)";
    }
    @Override
    protected String failedToRestoreLocalRegistryEntry$str() {
        return "WFLYCLSV0022: Falha ao restaurar a entrada de registro %1$s/%2$s local após mesclagem de partição de rede";
    }
    @Override
    protected String serviceProviderRegistrationListenerFailed$str() {
        return "WFLYCLSV0030: Falha ao notificar ouvinte de registro de fornecedor de serviço %1$s/%2$s de novos fornecedores: %3$s";
    }
}
