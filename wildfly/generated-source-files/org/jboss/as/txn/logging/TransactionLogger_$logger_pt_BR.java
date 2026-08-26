package org.jboss.as.txn.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:53+0200")
public class TransactionLogger_$logger_pt_BR extends TransactionLogger_$logger_pt implements TransactionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public TransactionLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String syncsnotallowed$str() {
        return "WFLYTX0029: As sincronizações não podem ser registradas quando o tx está em estado %1$s";
    }
    @Override
    protected String cannotFindOrImportInflowTransaction$str() {
        return "WFLYTX0035: Não é possível encontrar ou importar a transação de entrada para xid %1$s e trabalho %2$s";
    }
    @Override
    protected String startFailure$str() {
        return "WFLYTX0008: Falha ao iniciar";
    }
    @Override
    protected String onlyOneCanBeTrue$str() {
        return "WFLYTX0033: Somente um de %1$s e %2$s pode ser 'verdadeiro'. ";
    }
    @Override
    protected String mustBeDefinedIfTrue$str() {
        return "WFLYTX0032: %1$s deve ser definido caso %2$s for 'verdadeiro'.";
    }
    @Override
    protected String importedInflowTransactionIsInactive$str() {
        return "WFLYTX0036: A transação de entrada de Jakarta Connectors importados com xid %1$s de trabalho %2$s está inativa";
    }
    @Override
    protected String eitherTrueOrDefined$str() {
        return "WFLYTX0025: %1$s deve ser 'verdadeiro' ou %2$s deve ser definido.";
    }
    @Override
    protected String noActiveTransactionToRegisterSynchronization$str() {
        return "WFLYTX0040: Não há nenhuma transação ativa no contexto atual para registrar a sincronização '%1$s'";
    }
    @Override
    protected String jcaSyncAfterCompletionFailed$str() {
        return "WFLYTX0028: A sincronização de Jakarta Connectors %1$s associados ao tx %2$s falhou após a conclusão";
    }
    @Override
    protected String createFailed$str() {
        return "WFLYTX0004: Falha na criação";
    }
    @Override
    protected String mustBedefinedIfDefined$str() {
        return "WFLYTX0024: %1$s deve ser definido caso %2$s for definido.";
    }
    @Override
    protected String cannotResumeInflowTransactionUnexpectedError$str() {
        return "WFLYTX0037: Erro inesperado ao retomar a transação %1$s para o trabalho %2$s";
    }
    @Override
    protected String unableToSuspendInboundTransactionContext$str() {
        return "WFLYTX0044: InboundTransactionCurrentImpl não consegue suspender o contexto da transação de entrada";
    }
    @Override
    protected String transactionStillOpen$str() {
        return "WFLYTX0003: ERRO NO APLICATIVO: a transação continua ativa na solicitação com status %1$s";
    }
    @Override
    protected String unableToRollBack$str() {
        return "WFLYTX0001: Não foi possível reverter a transação ativa";
    }
    @Override
    protected String unableToGetTransactionStatus$str() {
        return "WFLYTX0002: Não foi possível obter o estado de transação";
    }
    @Override
    protected String objectStoreStartFailure$str() {
        return "WFLYTX0006: Ocorreu uma falha ao configurar o bean do navegador no store do objeto";
    }
    @Override
    protected String inconsistentStatisticsSettings$str() {
        return "WFLYTX0012: Os atributos %1$s e %2$s são alternativos. Ambos não podem ser determinados com os valores em conflito.";
    }
    @Override
    protected String nodeIdentifierIsSetToDefault$str() {
        return "WFLYTX0013: O atributo %1$s em %2$s está definido com o valor padrão. Isso é perigoso para ambientes executando vários servidores. Certifique-se de que o valor do atributo é exclusivo.";
    }
    @Override
    protected String unableToDetermineInboundTransactionContext$str() {
        return "WFLYTX0043: InboundTransactionCurrentImpl não conseguiu determinar o contexto da transação de entrada";
    }
    @Override
    protected String preJcaSyncAfterCompletionFailed$str() {
        return "WFLYTX0027: A sincronização pre-Jakarta Connectors %1$s associada a tx %2$s falhou ao final da execução";
    }
    @Override
    protected String unknownMetric$str() {
        return "WFLYTX0009: Métrica desconhecida %1$s";
    }
    @Override
    protected String mustBeUndefinedIfTrue$str() {
        return "WFLYTX0023: %1$s deve ser indefinido caso %2$s for 'verdadeiro'.";
    }
    @Override
    protected String jndiNameInvalidFormat$str() {
        return "WFLYTX0015: Os nomes Jndi necessitam iniciar com java:/ ou java:jboss/";
    }
    @Override
    protected String transactionNotFound$str() {
        return "WFLYTX0026: A transação %1$s não pode ser removida do cache durante a limpeza.";
    }
    @Override
    protected String cannotSuspendInflowTransactionUnexpectedError$str() {
        return "WFLYTX0038: Erro inesperado ao suspender a transação para o trabalho %1$s";
    }
    @Override
    protected String unsupportedAttribute$str() {
        return "WFLYTX0031: O atributo '%1$s' não é mais compatível";
    }
    @Override
    protected String transactionDiscoveryError$str() {
        return "WFLYTX0042: Erro de descoberta de transação";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYTX0030: Os recursos filhos indexados podem ser registrados somente se o recurso primário suportar filhos ordenados. O primário de '%1$s' não está indexado.";
    }
    @Override
    protected String jmxSubsystemNotInstalled$str() {
        return "WFLYTX0010: O Servidor do MBean não está instalado. Essa funcionalidade não está disponível caso o subsistema JMX não tenha sido instalado.";
    }
    @Override
    protected String objectStoreRelativeToIsSetToDefault$str() {
        return "WFLYTX0034: A propriedade relative_to de object-store está definida com o valor padrão com jboss.server.data.dir";
    }
    @Override
    protected String timeoutValueIsSetToMaximum$str() {
        return "WFLYTX0039: Um valor de zero não é permitido para o tempo limite máximo, por isso o tempo limite foi definido como %1$s";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYTX0007: O serviço não foi inicializado";
    }
    @Override
    protected String jmxError$str() {
        return "WFLYTX0041: Erro JMX: %1$s";
    }
    @Override
    protected String cannotRegister$str() {
        return "WFLYTX0045: Não foi possível registrar a referência inicial para a implementação InboundTransactionCurrent";
    }
    @Override
    protected String managerStartFailure$str() {
        return "WFLYTX0005: Falha na criação do gerenciador %1$s ";
    }
}
