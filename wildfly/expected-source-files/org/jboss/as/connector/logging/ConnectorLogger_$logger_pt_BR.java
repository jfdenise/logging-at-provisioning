package org.jboss.as.connector.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:48+0200")
public class ConnectorLogger_$logger_pt_BR extends ConnectorLogger_$logger_pt implements ConnectorLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ConnectorLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String boundDataSource$str() {
        return "WFLYJCA0001: Fonte de dados vinculada[%1$s]";
    }
    @Override
    protected String boundJca$str() {
        return "WFLYJCA0002: Conectores de Jakarta vinculados %1$s [%2$s]";
    }
    @Override
    protected String cannotInstantiateDriverClass2$str() {
        return "WFLYJCA0003: Não foi possível instanciar a classe do driver \"%1$s\": %2$s";
    }
    @Override
    protected String deployingCompliantJdbcDriver$str() {
        return "WFLYJCA0004: Implantação do driver compatível-JDBC %1$s (versão %2$d.%3$d)";
    }
    @Override
    protected String deployingNonCompliantJdbcDriver$str() {
        return "WFLYJCA0005: Implantação do driver não compatível-JDBC %1$s (versão %2$d.%3$d)";
    }
    @Override
    protected String registeredAdminObject$str() {
        return "WFLYJCA0006: Objeto de administrador registrado no %1$s";
    }
    @Override
    protected String registeredConnectionFactory$str() {
        return "WFLYJCA0007: Criação de conexão registrada %1$s";
    }
    @Override
    protected String startingSubsystem$str() {
        return "WFLYJCA0009: Inicialização do Subsistema %1$s (%2$s)";
    }
    @Override
    protected String unboundDataSource$str() {
        return "WFLYJCA0010: Fonte de dados sem limite [%1$s]";
    }
    @Override
    protected String unboundJca$str() {
        return "WFLYJCA0011: Sem limite de conectores de Jakarta %1$s [%2$s]";
    }
    @Override
    protected String driversElementNotSupported$str() {
        return "WFLYJCA0012: <drivers/> não são compatíveis nas implantações -ds.xml autônomas : ignorando %1$s";
    }
    @Override
    protected String driverNameAndResourceNameNotEquals$str() {
        return "WFLYJCA0015: o atributo nome-do-driver (%1$s) não pode ser diferente do nome do recurso do driver (%2$s)";
    }
    @Override
    protected String methodNotFoundOnDataSource$str() {
        return "WFLYJCA0016: O método %1$s não foi encontrado na classe de fonte de dados %2$s. Ignorando";
    }
    @Override
    protected String forceIJToNull$str() {
        return "WFLYJCA0017: Forçando o descritor ironjacamar.xml para nulo";
    }
    @Override
    protected String startedDriverService$str() {
        return "WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = %1$s";
    }
    @Override
    protected String stoppedDriverService$str() {
        return "WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = %1$s";
    }
    @Override
    protected String unsupportedSelectorOption$str() {
        return "WFLYJCA0020: Opção de seletor sem suporte: %1$s";
    }
    @Override
    protected String unsupportedPolicyOption$str() {
        return "WFLYJCA0021: Opção de política sem suporte: %1$s";
    }
    @Override
    protected String failedToStartJGroupsChannel$str() {
        return "WFLYJCA0022: Falha ao iniciar canal de JGroups %1$s para workmanager distribuído %2$s";
    }
    @Override
    protected String failedToFindDistributedWorkManager$str() {
        return "WFLYJCA0023: Não foi possível encontrar WorkManager %1$s ou não é um workmanager distribuído. Somente DWM pode substituir configurações ";
    }
    @Override
    protected String failedToStartDWMTransport$str() {
        return "WFLYJCA0024: Falha ao iniciar transporte JGroups para workmanager distribuído %1$s";
    }
    @Override
    protected String unsupportedSelector$str() {
        return "WFLYJCA0025: Opção de seletor sem suporte: %1$s";
    }
    @Override
    protected String unsupportedPolicy$str() {
        return "WFLYJCA0026: Opção de política sem suporte: %1$s";
    }
    @Override
    protected String noSecurityDefined$str() {
        return "WFLYJCA0027: Nenhuma segurança de ironjacamar definida para %1$s";
    }
    @Override
    protected String connectionFactoryAnnotation$str() {
        return "WFLYJCA0028: @ConnectionFactoryDefinition terá gerenciamento limitado: %1$s";
    }
    @Override
    protected String adminObjectAnnotation$str() {
        return "WFLYJCA0029: @AdministeredObjectDefinition terá gerenciamento limitado: %1$s";
    }
    @Override
    protected String cannotDeploy$str() {
        return "WFLYJCA0030: não foi possível efetuar a implantação";
    }
    @Override
    protected String cannotDeployAndValidate$str() {
        return "WFLYJCA0031: não foi possível validar e implantar ds ou xads";
    }
    @Override
    protected String deploymentError$str() {
        return "WFLYJCA0033: Erro durante a implantação do %1$s";
    }
    @Override
    protected String cannotInstantiateDriverClass1$str() {
        return "WFLYJCA0034: Não foi possível instanciar a classe\"%1$s\" do driver Consulte o log (WARN) para maiores informações";
    }
    @Override
    protected String driverVersionMismatch$str() {
        return "WFLYJCA0035: A versão de driver especificada não coincide com a versão de driver atual";
    }
    @Override
    protected String failedToCreate$str() {
        return "WFLYJCA0036: Falha ao criar %1$s instância para [%2$s]%n razão: %3$s";
    }
    @Override
    protected String failedToGetMetrics$str() {
        return "WFLYJCA0037: falha ao obter métricas: %1$s";
    }
    @Override
    protected String failedToGetUrlDelimiter$str() {
        return "WFLYJCA0039: falha ao obter o delimitador do url";
    }
    @Override
    protected String failedToInvokeOperation$str() {
        return "WFLYJCA0040: falha ao invocar a operação: %1$s";
    }
    @Override
    protected String failedToLoadModuleDriver$str() {
        return "WFLYJCA0041: Falha ao carregar o módulo para o driver [%1$s]";
    }
    @Override
    protected String failedToMatchPool$str() {
        return "WFLYJCA0042: falha ao coincidir o pool. Verifique o JndiName: %1$s";
    }
    @Override
    protected String failedToParseServiceXml$str() {
        return "WFLYJCA0043: Falha ao analisar o serviço xml [%1$s]";
    }
    @Override
    protected String failedToProcessRaChild$str() {
        return "WFLYJCA0044: Falha ao processar arquivos filhos RA para [%1$s]";
    }
    @Override
    protected String failedToSetAttribute$str() {
        return "WFLYJCA0045: falha ao determinar o atributo: %1$s";
    }
    @Override
    protected String failedToStartRaDeployment$str() {
        return "WFLYJCA0046: Falha ao iniciar a implantação RA [%1$s]";
    }
    @Override
    protected String invalidConnection$str() {
        return "WFLYJCA0047: A conexão não é válida";
    }
    @Override
    protected String jndiBindingsNotSupported$str() {
        return "WFLYJCA0049: Bindings JNDI não-explícitos não são suportados";
    }
    @Override
    protected String noMetricsAvailable$str() {
        return "WFLYJCA0050: nenhuma métrica disponível";
    }
    @Override
    protected String notAnAnnotation$str() {
        return "WFLYJCA0051: %1$s deve ser uma anotação";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYJCA0052: %1$s é nulo";
    }
    @Override
    protected String serviceAlreadyStarted$str() {
        return "WFLYJCA0053: %1$s serviço [%2$s] já iniciado ";
    }
    @Override
    protected String serviceNotAvailable$str() {
        return "WFLYJCA0054: %1$s serviço [%2$s] não disponível";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYJCA0056: O serviço não foi inicializado";
    }
    @Override
    protected String undefinedVar$str() {
        return "WFLYJCA0058: %1$s é indefinido";
    }
    @Override
    protected String failedToLoadNativeLibraries$str() {
        return "WFLYJCA0061: Falha ao carregar bibliotecas nativas";
    }
    @Override
    protected String exceptionDeployingDatasource$str() {
        return "WFLYJCA0064: Exceção na implantação da fonte de dados %1$s";
    }
    @Override
    protected String noDataSourceRegisteredForAddress$str() {
        return "WFLYJCA0065: Não há nenhuma fonte de dados no endereço %1$s";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYJCA0066: Atributo %1$s Desconhecido";
    }
    @Override
    protected String unknownOperation$str() {
        return "WFLYJCA0067: Operação Desconhecida %1$s";
    }
    @Override
    protected String xaDataSourcePropertiesNotPresent$str() {
        return "WFLYJCA0069: É solicitado pelo menos um xa-datasource-property para um xa-datasource";
    }
    @Override
    protected String deploymentFailed$str() {
        return "WFLYJCA0072: Implantação de %1$s falhou";
    }
    @Override
    protected String failedToLoadModuleRA$str() {
        return "WFLYJCA0073: Falha ao carregar o módulo para RA [%1$s] Causa: %2$s";
    }
    @Override
    protected String noSuchMethod$str() {
        return "WFLYJCA0074: O método %1$s não foi encontrado";
    }
    @Override
    protected String noSuchField$str() {
        return "WFLYJCA0075: Campo %1$s não encontrado";
    }
    @Override
    protected String noPropertyResolution$str() {
        return "WFLYJCA0076: Resolução da propriedade desconhecida para a propriedade %1$s";
    }
    @Override
    protected String archiveOrModuleRequired$str() {
        return "WFLYJCA0077: Pelo menos um ARQUIVO ou MÓDULO é requerido";
    }
    @Override
    protected String compressedRarNotSupportedInModuleRA$str() {
        return "WFLYJCA0078: Rar são suportados apenas na forma descompactada. Falha ao carregar o módulo para o RA [%1$s]";
    }
    @Override
    protected String FailedDeployDriverNotSpecified$str() {
        return "WFLYJCA0079: Falha ao implantar a fonte de dados %1$s uma vez que o driver não foi especificado";
    }
    @Override
    protected String RARNotYetDeployed$str() {
        return "WFLYJCA0080: RAR '%1$s' ainda não foi implantado.";
    }
    @Override
    protected String invalidConnectionFactory$str() {
        return "WFLYJCA0083: A interface da criação de conexão (%1$s) está incorreta para o adaptador de recurso '%2$s' durante a implantação %3$s";
    }
    @Override
    protected String adminObjectForJCA10$str() {
        return "WFLYJCA0084: Objeto de administrador declarado para o adaptador de recurso JCA 1.0 '%1$s' durante a implantação %2$s";
    }
    @Override
    protected String invalidAdminObject$str() {
        return "WFLYJCA0085: A classe (%1$s) do objeto de administrador está incorreta para o adaptador de recurso '%2$s' durante a implantação %3$s";
    }
    @Override
    protected String cannotFindDriverClassName$str() {
        return "WFLYJCA0086: Não foi possível encontrar o nome da classe do driver no jar \"%1$s\"";
    }
    @Override
    protected String unableToRegisterRecovery$str() {
        return "WFLYJCA0087: Não foi possível registrar a recuperação: %1$s (%2$s)";
    }
    @Override
    protected String rejectAttributesMustBeTrue$str() {
        return "WFLYJCA0088: Atributos %1$s rejeitados. Deve ser verdadeiro";
    }
    @Override
    protected String exceptionDuringUnregistering$str() {
        return "WFLYJCA0089: Exceção durante o cancelamento de registro de implementação";
    }
    @Override
    protected String jndiNameShouldValidate$str() {
        return "WFLYJCA0090: O nome jndi não deve possuir '//' ou terminar com '/'";
    }
    @Override
    protected String deprecated$str() {
        return "WFLYJCA0091: As implantações do arquivo -ds.xml estão preteridas. O suporte pode ser removido numa versão futura.";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYJCA0092: Os recursos filhos indexados podem ser registrados somente se o recurso primário suportar filhos ordenados. O primário de '%1$s' não está indexado.";
    }
    @Override
    protected String legacyDisableEnableOperation$str() {
        return "WFLYJCA0093: A operação '%1$s' esta preterida. A utilização de operações 'adicionar' ou 'remover' é preferível, ou se necessário a operação 'write-attribute' pode ser utilizada para definir o atributo preterido 'enabled'";
    }
    @Override
    protected String errorDuringRecoveryShutdown$str() {
        return "WFLYJCA0096: Erro durante desligamento da operação de recuperação";
    }
    @Override
    protected String errorStoppingRA$str() {
        return "WFLYJCA0097: Exceção na interrupção do adaptador de recursos";
    }
    @Override
    protected String boundNonJTADataSource$str() {
        return "WFLYJCA0098: Fonte de dados não transacional vinculada: %1$s";
    }
    @Override
    protected String unBoundNonJTADataSource$str() {
        return "WFLYJCA0099: Fonte de dados não transacional desvinculada: %1$s";
    }
    @Override
    protected String noSupportedOperation$str() {
        return "WFLYJCA0100: A operação %1$s não é suportada";
    }
    @Override
    protected String oneThreadPoolWorkManager$str() {
        return "WFLYJCA0101: Thread pool: %1$s(tipo: %2$s) não pode ser adicionado para workmanager: %3$s, somente um thread pool é permitido para cada tipo.";
    }
    @Override
    protected String attributeRequiresTrueAttribute$str() {
        return "WFLYJCA0102: O atributo %1$s só pode ser definido se %2$s for verdadeiro";
    }
    @Override
    protected String attributeRequiresFalseOrUndefinedAttribute$str() {
        return "WFLYJCA0103: O atributo %1$s só pode ser definido se %2$s for indefinido ou falso";
    }
    @Override
    protected String elytronHandlerHandle$str() {
        return "WFLYJCA0106: Identificador do manipulador Elytron: %1$s";
    }
    @Override
    protected String executionSubjectNotSetInHandler$str() {
        return "WFLYJCA0107: A entidade da execução não foi fornecida ao manipulador de retorno de chamada";
    }
    @Override
    protected String invalidCallbackSecurityDomain$str() {
        return "WFLYJCA0108: O retorno de chamada fornecido não contém uma referência de domínio de segurança";
    }
    @Override
    protected String unsupportedCreateCallbackHandlerMethod$str() {
        return "WFLYJCA0109: O retorno de chamada com domínio de segurança é obrigatório. Use createCallbackHandler(Callback callback) em seu lugar";
    }
    @Override
    protected String invalidCredentialSourceSupplier$str() {
        return "WFLYJCA0110: CredentialSourceSupplier é inválido para DSSecurity";
    }
    @Override
    protected String invalidElytronWorkManagerSetting$str() {
        return "WFLYJCA0111: WorkManager não tem o sinalizador elytron-enabled definido de acordo com RA um";
    }
    @Override
    protected String datasourceIsDisabled$str() {
        return "WFLYJCA0112: A fonte de dados %1$s está desativada";
    }
    @Override
    protected String unexceptedWorkerCompletionError$str() {
        return "WFLYJCA0113: Erro inesperado durante a execução do worker: %1$s";
    }
    @Override
    protected String failedToLoadDataSourceClass$str() {
        return "WFLYJCA0114: Falha ao carregar a classe de fonte de dados: %1$s";
    }
    @Override
    protected String missingDependencyInModuleDriver$str() {
        return "WFLYJCA0115: O módulo para o driver [%1$s] ou uma das suas dependências está faltando: [%2$s]";
    }
    @Override
    protected String raModuleNotFound$str() {
        return "WFLYJCA0116: Falha ao carregar o módulo para RA [%1$s] — o módulo ou uma das suas dependências está faltando [%2$s]";
    }
    @Override
    protected String notAValidDataSourceClass$str() {
        return "WFLYJCA0117: %1$s não é uma implementação %2$s válida";
    }
    @Override
    protected String bindingAlias$str() {
        return "WFLYJCA0118: Vínculo de criação de conexão chamado %1$s para o alias %2$s";
    }
    @Override
    protected String unbindingAlias$str() {
        return "WFLYJCA0119: Desfazendo o vínculo da criação de conexão chamada %1$s para o alias %2$s";
    }
    @Override
    protected String cannotStartDSNoConnectionFactory$str() {
        return "WFLYJCA0120: Não foi possível iniciar a fonte de dados '%1$s' porque não há criações de conexão, ou não foram definidas ou falharam, por favor verificar o log.";
    }
    @Override
    protected String cannotStartDSTooManyConnectionFactories$str() {
        return "WFLYJCA0121: Não foi possível iniciar a fonte de dados '%1$s' porque existe mais de uma (%2$s) criação de conexão definida.";
    }
    @Override
    protected String threadPoolNameMustMatchWorkManagerName$str() {
        return "WFLYJCA0122: O nome do pool de threads %1$s(tipo: %2$s) deve corresponder ao nome do workmanager %3$s.";
    }
    @Override
    protected String legacySecurityNotAvailable2$str() {
        return "WFLYJCA0123: A definição da conexão %1$s do adaptador de recursos %2$s está configurada para exigir o subsistema de segurança legado, que não está presente";
    }
    @Override
    protected String legacySecurityNotAvailable1$str() {
        return "WFLYJCA0124: A fonte de dados %1$s está configurada para exigir o subsistema de segurança legado, que não está presente";
    }
    @Override
    protected String legacySecurityNotAvailableForDsXml$str() {
        return "WFLYJCA0125: A fonte de dados %1$s está configurada para exigir o subsistema de segurança legado, que não está presente";
    }
    @Override
    protected String legacySecurityNotAvailableForRa$str() {
        return "WFLYJCA0126: A definição da conexão para %1$s está configurada para exigir o subsistema de segurança legado, que não está presente";
    }
    @Override
    protected String legacySecurityNotAvailableForConnectionFactory$str() {
        return "WFLYJCA0127: A criação de conexão %1$s está configurada para exigir o subsistema de segurança legado, que não está presente";
    }
    @Override
    protected String legacySecurityNotAvailable0$str() {
        return "WFLYJCA0128: A segurança do legado não está disponível";
    }
    @Override
    protected String wrongModuleName$str() {
        return "WFLYJCA0129: Nome do módulo errado %1$s";
    }
    @Override
    protected String reportDirectoryDoesNotExist$str() {
        return "WFLYJCA0130: O diretório de relatórios %1$s não existe";
    }
    @Override
    protected String legacySecurityAttributeNotSupported$str() {
        return "WFLYJCA0131: O atributo de segurança legado %1$s não é mais compatível. Em vez disso, use a configuração do Elytron";
    }
    @Override
    protected String legacySecurityNotSupported$str() {
        return "WFLYJCA0132: A segurança legada não é mais compatível. Em vez disso, use a configuração do Elytron";
    }
    @Override
    protected String authorizationFailed$str() {
        return "WFLYJCA0133: Falha na autorização";
    }
    @Override
    protected String nameAttributeIsMandatory$str() {
        return "WFLYJCA0134: O atributo name é obrigatório para o elemento workmanager";
    }
    @Override
    protected String jdbcDriverNotInstalled$str() {
        return "WFLYJCA0135: O driver jdbc:%1$s não está instalado";
    }
}
