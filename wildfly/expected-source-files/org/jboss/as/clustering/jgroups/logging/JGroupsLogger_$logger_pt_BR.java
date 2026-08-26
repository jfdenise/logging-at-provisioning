package org.jboss.as.clustering.jgroups.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:30+0200")
public class JGroupsLogger_$logger_pt_BR extends JGroupsLogger_$logger_pt implements JGroupsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JGroupsLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYCLJG0001: Ativação do subsistema JGroups. Versão do JGroups %1$s";
    }
    @Override
    protected String parserFailure$str() {
        return "WFLYCLJG0007: Falha ao analisar %1$s";
    }
    @Override
    protected String notFound$str() {
        return "WFLYCLJG0008: Falha ao localizar o %1$s";
    }
    @Override
    protected String transportNotDefined$str() {
        return "WFLYCLJG0010: O transporte para a pilha %1$s não está definido. Por favor especifique ambos o transporte e a lista do protocolo, tanto como parâmetros opcionais para adicionar() ou através do envio de lote.";
    }
    @Override
    protected String unknownMetric$str() {
        return "WFLYCLJG0015: Métrica desconhecida %1$s";
    }
    @Override
    protected String unableToLoadProtocolClass$str() {
        return "WFLYCLJG0016: Não foi possível carregar classe de protocolo %1$s";
    }
    @Override
    protected String keyEntryNotFound$str() {
        return "WFLYCLJG0022: Entrada %1$s não encontrada no armazenamento de chaves configurado";
    }
    @Override
    protected String unexpectedKeyStoreEntryType$str() {
        return "WFLYCLJG0023: A entrada do armazenamento de chaves %1$s não é do tipo esperado: %2$s";
    }
    @Override
    protected String unexpectedCredentialSource$str() {
        return "WFLYCLJG0025: A fonte de credenciais configurada não referencia uma credencial de senha com texto não criptografado";
    }
    @Override
    protected String failedToResolveSocketBinding$str() {
        return "WFLYCLJG0028: Não foi possível resolver o endereço de destino da associação de socket de saída chamada '%1$s'";
    }
    @Override
    protected String legacyProtocol$str() {
        return "WFLYCLJG0030: O protocolo %1$s é obsoleto e será atualizado automaticamente para %2$s";
    }
    @Override
    protected String unrecognizedProtocolProperty$str() {
        return "WFLYCLJG0031: Ignorando propriedade %1$s não reconhecida: %2$s";
    }
    @Override
    protected String connecting$str() {
        return "WFLYCLJG0032: Conectando o canal '%1$s'. '%2$s' ingressando no cluster '%3$s' por %4$s";
    }
    @Override
    protected String connected$str() {
        return "WFLYCLJG0033: Canal '%1$s' conectado. '%2$s' entrou no cluster '%3$s' com visualização: %4$s";
    }
    @Override
    protected String disconnecting$str() {
        return "WFLYCLJG0034: Desconectando o canal '%1$s'. '%2$s' deixando o cluster '%3$s' com a visualização: %4$s";
    }
    @Override
    protected String disconnected$str() {
        return "WFLYCLJG0035: Canal '%1$s' desconectado. '%2$s' cluster esquerdo '%3$s'";
    }
}
