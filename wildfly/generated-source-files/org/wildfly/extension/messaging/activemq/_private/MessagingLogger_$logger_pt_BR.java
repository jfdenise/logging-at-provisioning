package org.wildfly.extension.messaging.activemq._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:30+0200")
public class MessagingLogger_$logger_pt_BR extends MessagingLogger_$logger_pt implements MessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MessagingLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unknownPooledConnectionFactoryAttribute$str() {
        return "WFLYMSGAMQ0015: Ignorando propriedade %1$s que é uma propriedade desconhecida para fábrica de conexões em pool.";
    }
    @Override
    protected String remoteDestinationDeletionFailed$str() {
        return "WFLYMSGAMQ0100: A exclusão do destino remoto %1$s falhou com erro %2$s";
    }
    @Override
    protected String invalidTransactionNameValue$str() {
        return "WFLYMSGAMQ0101: Valor inválido %1$s para %2$s, valores legais são %3$s, valor padrão foi aplicado.";
    }
    @Override
    protected String immutableResource$str() {
        return "WFLYMSGAMQ0037: O recurso é imutável";
    }
    @Override
    protected String discoveryGroupIsNotDefined$str() {
        return "WFLYMSGAMQ0080: O grupo de descoberta %1$s não está definido";
    }
    @Override
    protected String moduleNotFound$str() {
        return "WFLYMSGAMQ0098: Não foi possível carregar o módulo %1$s — o módulo ou uma das suas dependências está ausente [%2$s]";
    }
    @Override
    protected String errorStoppingJmsServer$str() {
        return "WFLYMSGAMQ0003: Exceção durante a parada do servidor de Jakarta Messaging";
    }
    @Override
    protected String aioInfoLinux$str() {
        return "WFLYMSGAMQ0075: O AIO não foi localizado nessa plataforma, reverterá para utilizar NIO do Java puro. Caso sua plataforma for Linux, instale LibAIO para ativar o diário AIO e obter desempenho otimizado. ";
    }
    @Override
    protected String unsupportedRuntimeAttribute$str() {
        return "WFLYMSGAMQ0053: O processamento do tempo de execução para o %1$s não foi implementado";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYMSGAMQ0104: A segurança do legado não é mais compatível.";
    }
    @Override
    protected String failedBridgeDeployment$str() {
        return "WFLYMSGAMQ0106: A ponte %1$s não foi implantada.";
    }
    @Override
    protected String missingJNDIName$str() {
        return "WFLYMSGAMQ0115: O nome JNDI está ausente.";
    }
    @Override
    protected String failedToFindConnectorSocketBinding$str() {
        return "WFLYMSGAMQ0030: Falha ao encontrar o SocketBinding para o conector: %1$s";
    }
    @Override
    protected String aioInfo$str() {
        return "WFLYMSGAMQ0001: AIO não foi localizado nesta plataforma, irá reverter para utilizar NIO do Java puro";
    }
    @Override
    protected String managementOperationAllowedOnlyInRunningMode$str() {
        return "WFLYMSGAMQ0083: A operação %1$s não pode ser executada: o servidor deve estar em modo %2$s";
    }
    @Override
    protected String jdbcDatabaseDialectDetectionFailed$str() {
        return "WFLYMSGAMQ0094: Não foi possível detectar o dialeto do banco de dados a partir dos metadados de conexão ou do nome do driver JDBC. Configure isso manualmente usando a propriedade \"journal-database\" em sua configuração. As cadeias de caracteres conhecidas do dialeto do banco de dados são %1$s";
    }
    @Override
    protected String couldNotCloseFile$str() {
        return "WFLYMSGAMQ0007: Não foi possível encerrar o arquivo %1$s";
    }
    @Override
    protected String unsupportedResourceType$str() {
        return "WFLYMSGAMQ0117: O tipo de recurso %1$s não é compatível.";
    }
    @Override
    protected String unableToLoadClassFromModule$str() {
        return "WFLYMSGAMQ0085: Não foi possível carregar classe %1$s a partir do módulo %2$s";
    }
    @Override
    protected String missingArguments$str() {
        return "WFLYMSGAMQ0113: Faltam argumentos";
    }
    @Override
    protected String unboundJndiName$str() {
        return "WFLYMSGAMQ0006: Objeto de mensagem não vinculado ao nome jndi %1$s";
    }
    @Override
    protected String cannotUnbindJndiName$str() {
        return "WFLYMSGAMQ0025: Não foi possível desvincular uma sequência vazia ou nula com o nome jndi";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYMSGAMQ0047: %1$s é nulo";
    }
    @Override
    protected String cannotBindJndiName$str() {
        return "WFLYMSGAMQ0022: Não foi possível aplicar o bind numa sequência nula ou vazia com o nome jndi";
    }
    @Override
    protected String failedToStartService$str() {
        return "WFLYMSGAMQ0033: Falha ao iniciar o serviço";
    }
    @Override
    protected String duplicateElements$str() {
        return "WFLYMSGAMQ0076: O parâmetro %1$s contém elementos duplicados [%2$s]";
    }
    @Override
    protected String remoteDestinationCreationFailed$str() {
        return "WFLYMSGAMQ0099: Criação de destino remoto %1$s falhou com erro %2$s";
    }
    @Override
    protected String childResourceAlreadyExists$str() {
        return "WFLYMSGAMQ0026: Um recurso filho de tipo %1$s já existe; o subsistema de mensagem apenas permite um recurso único de tipo %1$s";
    }
    @Override
    protected String unableToLoadModule$str() {
        return "WFLYMSGAMQ0086: Não é possível carregar módulo %1$s";
    }
    @Override
    protected String boundJndiName$str() {
        return "WFLYMSGAMQ0002: Objeto de mensagem vinculado ao nome jndi %1$s";
    }
    @Override
    protected String failedToDestroy$str() {
        return "WFLYMSGAMQ0004: Falha ao destruir %1$s: %2$s";
    }
    @Override
    protected String failedToFindDiscoverySocketBinding$str() {
        return "WFLYMSGAMQ0031: Falha ao encontrar o SocketBinding para o vínculo de descoberta: %1$s";
    }
    @Override
    protected String unableToFindRecoveryRegistry$str() {
        return "WFLYMSGAMQ0110: Não é possível encontrar o Registro de recuperação";
    }
    @Override
    protected String socketBindingOrJGroupsClusterRequired$str() {
        return "WFLYMSGAMQ0108: O atributo socket-binding ou jgroups-cluster é necessário.";
    }
    @Override
    protected String failedToUnbindJndiName$str() {
        return "WFLYMSGAMQ0008: Falha ao desvincular o objeto de mensagem vinculado para o nome jndi %1$s em %2$d %3$s";
    }
    @Override
    protected String onlyOneChildIsAllowed$str() {
        return "WFLYMSGAMQ0078: Somente um recurso filho %1$s é permitido, filho encontrado: %2$s";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYMSGAMQ0079: Os recursos filhos indexados podem ser registrados somente se o recurso primário suportar filhos ordenados. O primário de '%1$s' não está indexado.";
    }
    @Override
    protected String noSubscriptionError$str() {
        return "WFLYMSGAMQ0111: Nenhuma assinatura com nome %1$s para clientID %2$s";
    }
    @Override
    protected String revertOperationFailed$str() {
        return "WFLYMSGAMQ0005: %1$s encontrada uma exceção na tentativa de reverter a operação %2$s no endereço %3$s";
    }
    @Override
    protected String noInVMConnector$str() {
        return "WFLYMSGAMQ0084: O servidor não define qualquer conector in-vm. É necessário um para poder importar um diário. ";
    }
    @Override
    protected String multipleClientMappingsFound$str() {
        return "WFLYMSGAMQ0095: Vários client-mapping encontrados em associação de vínculo de socket [%1$s] usada pela configuração de transporte [%2$s] do ActiveMQ. Usando endereço: [host: %3$s, porta %4$s]";
    }
    @Override
    protected String failedToParseProperty$str() {
        return "WFLYMSGAMQ0116: Falha ao analisar a propriedade '%1$s' ";
    }
    @Override
    protected String jndiWasNotFound$str() {
        return "WFLYMSGAMQ0119: '%1$s' não foi encontrado entre os recursos JMS existentes.";
    }
    @Override
    protected String securityDomainContextNotSet$str() {
        return "WFLYMSGAMQ0058: O SecurityDomainContext não foi enviado";
    }
    @Override
    protected String stoppedService$str() {
        return "WFLYMSGAMQ0012: Interrompido %1$s %2$s";
    }
    @Override
    protected String upgradeRequestMissingKey$str() {
        return "WFLYMSGAMQ0102: Sec-JbossRemoting-Key header ausente para solicitação de atualização HTTP";
    }
    @Override
    protected String canNotRemoveResourceOfType$str() {
        return "WFLYMSGAMQ0064: Os recursos do tipo %1$s não podem ser removidos";
    }
    @Override
    protected String unknownHAPolicyType$str() {
        return "WFLYMSGAMQ0109: Tipo de política ha desconhecido.";
    }
    @Override
    protected String connectorNotDefined$str() {
        return "WFLYMSGAMQ0027: Conector %1$s não definido";
    }
    @Override
    protected String required2$str() {
        return "WFLYMSGAMQ0046: Tanto o %1$s ou o %2$s são necessários";
    }
    @Override
    protected String unsupportedOperation$str() {
        return "WFLYMSGAMQ0052: O suporte para a operação %1$s não foi implementado devidamente";
    }
    @Override
    protected String failedAuthenticationWithException$str() {
        return "WFLYMSGAMQ0091: Falha ao autenticar nome de usuário %1$s. Mensagem de exceção: %2$s";
    }
    @Override
    protected String jndiNameAlreadyRegistered$str() {
        return "WFLYMSGAMQ0043: O nome JNDI %1$s já está registrado";
    }
    @Override
    protected String noMatchingDeadLetterAddress$str() {
        return "WFLYMSGAMQ0072: Não existe nenhum recurso coincidente com o dead-letter-address %1$s para o address-settings %2$s. As mensagens não entregues dos destinos coincidentes com este address-setting serão perdidas!";
    }
    @Override
    protected String wrongConnectorRefInBroadCastGroup$str() {
        return "WFLYMSGAMQ0067: O grupo de transmissão '%1$s' define a referência ao conector não existente '%2$s'. Conectores disponíveis '%3$s'.";
    }
    @Override
    protected String registeredHTTPUpgradeHandler$str() {
        return "WFLYMSGAMQ0016: Atualização HTTP registrada para protocolo %1$s manipulado pelo aceitador %2$s";
    }
    @Override
    protected String failedToFindBroadcastSocketBinding$str() {
        return "WFLYMSGAMQ0029: Falha ao encontrar o SocketBinding para o vínculo de transmissão: %1$s";
    }
    @Override
    protected String illegalValue$str() {
        return "WFLYMSGAMQ0036: Valor ilegal %1$s para o elemento %2$s";
    }
    @Override
    protected String required1$str() {
        return "WFLYMSGAMQ0045: %1$s é necessário";
    }
    @Override
    protected String startedService$str() {
        return "WFLYMSGAMQ0011: Iniciado %1$s %2$s";
    }
    @Override
    protected String failedToRecover$str() {
        return "WFLYMSGAMQ0060: Falha ao recuperar %1$s";
    }
    @Override
    protected String failedAuthorization$str() {
        return "WFLYMSGAMQ0093: Falha ao autorizar nome de usuário %1$s: permissões faltantes";
    }
    @Override
    protected String unsupportedBroadcastGroupConfigurationForLegacy$str() {
        return "WFLYMSGAMQ0081: Tipo não compatível de configuração de grupo de transmissão para recurso herdado: %1$s";
    }
    @Override
    protected String canNotRegisterResourceOfType$str() {
        return "WFLYMSGAMQ0063: Os recursos do tipo %1$s não podem ser registrados";
    }
    @Override
    protected String socketBindingMulticastNotSet$str() {
        return "WFLYMSGAMQ0105: O %1$s %2$s está configurado para usar o binding de socket %3$s, mas esse binding de socket não tem o endereço multicast ou os atributos de porta multicast configurados.";
    }
    @Override
    protected String activeMQServerNotInstalled$str() {
        return "WFLYMSGAMQ0054: Nenhum servidor ActiveMQ disponível com o nome %1$s";
    }
    @Override
    protected String failedAuthentication$str() {
        return "WFLYMSGAMQ0092: Falha ao autenticar nome de usuário %1$s: não foi possível verificar o par de nome de usuário/senha ";
    }
    @Override
    protected String failedToShutdownServer$str() {
        return "WFLYMSGAMQ0032: Falha ao encerrar o servidor %1$s";
    }
    @Override
    protected String invalidServiceState$str() {
        return "WFLYMSGAMQ0042: O serviço %1$s não está no estado %2$s, ele está no estado %3$s";
    }
    @Override
    protected String unableToLoadConnectorServiceFactoryClass$str() {
        return "WFLYMSGAMQ0087: Não é possível carregar a classe de alocador de serviço de conector: %1$s";
    }
    @Override
    protected String invalid$str() {
        return "WFLYMSGAMQ0038: %1$s é inválido";
    }
    @Override
    protected String couldNotParseDeployment$str() {
        return "WFLYMSGAMQ0055: Não foi possível analisar o arquivo %1$s";
    }
    @Override
    protected String canNotRemoveUnknownEntry$str() {
        return "WFLYMSGAMQ0077: Não foi possível remover a entrada %1$s desconhecida";
    }
    @Override
    protected String missingRestype$str() {
        return "WFLYMSGAMQ0114: O parâmetro obrigatório --restype está ausente.";
    }
    @Override
    protected String canNotRemoveLastJNDIName$str() {
        return "WFLYMSGAMQ0073: Não foi possível remover o nome JNDI %1$s. O recurso deve possuir pelo menos um nome JNDI";
    }
    @Override
    protected String invalidAttributeType$str() {
        return "WFLYMSGAMQ0039: O Atributo %1$s possui um tipo inesperado %2$s";
    }
    @Override
    protected String failedToCreate$str() {
        return "WFLYMSGAMQ0028: Falha ao criar %1$s";
    }
    @Override
    protected String serverInBackupMode$str() {
        return "WFLYMSGAMQ0066: O recurso no endereço %1$s não pode ser gerenciado, o servidor está em modo de backup";
    }
    @Override
    protected String connectorForPooledConnectionFactory$str() {
        return "WFLYMSGAMQ0018: Nenhum conector foi definido explicitamente para o alocador de conexões em pool %1$s. Utilizando %2$s como conector. ";
    }
    @Override
    protected String unsupportedAttribute$str() {
        return "WFLYMSGAMQ0050: O suporte de leitura para o atributo %1$s não estava implantado apropriadamente ";
    }
    @Override
    protected String operationNotAllowedOnJdbcStore$str() {
        return "WFLYMSGAMQ0096: A operação %1$s não pode ser realizada em um diário de armazenamento JDBC";
    }
    @Override
    protected String noSubscriptionWithQueueName$str() {
        return "WFLYMSGAMQ0112: Nenhuma assinatura com nome %1$s";
    }
    @Override
    protected String noMatchingExpiryAddress$str() {
        return "WFLYMSGAMQ0071: Não existe nenhum recurso coincidente com o expiry-address %1$s para o address-settings %2$s. As mensagens expiradas dos destinos coincidentes com este address-setting serão perdidas!";
    }
    @Override
    protected String invalidNullSecurityDomain$str() {
        return "WFLYMSGAMQ0090: O domínio de segurança Elytron não pode ser nulo ";
    }
    @Override
    protected String brokerNotStarted$str() {
        return "WFLYMSGAMQ0103: Broker não foi iniciado. Ainda não pode ser administrado.";
    }
    @Override
    protected String invalidConfiguration$str() {
        return "WFLYMSGAMQ0089: O recurso em %1$s não está configurado corretamente: quando seu atributo %2$s é definido, os outros atributos %3$s não serão considerados";
    }
    @Override
    protected String unsupportedConnectorFactoryForLegacy$str() {
        return "WFLYMSGAMQ0082: Tipo não compatível de alocador de conectores para recurso herdado: %1$s";
    }
    @Override
    protected String noDestinationRegisteredForAddress$str() {
        return "WFLYMSGAMQ0057: Nenhum destino de mensagem registrado no endereço %1$s";
    }
    @Override
    protected String operationNotValid$str() {
        return "WFLYMSGAMQ0056: O manuseador não pôde processar a operação %1$s";
    }
    @Override
    protected String noSocketBinding$str() {
        return "WFLYMSGAMQ0097: Não há um socket-binding ou outbound-socket-binding configurado com o nome %1$s";
    }
    @Override
    protected String securityEnabledWithoutDomain$str() {
        return "WFLYMSGAMQ0107: Você deve definir um domínio de segurança eletrônica quando a segurança estiver ativada.";
    }
    @Override
    protected String missingName$str() {
        return "WFLYMSGAMQ0118: O name está ausente.";
    }
    @Override
    protected String invalidModularParameterValue$str() {
        return "WFLYMSGAMQ0088: %1$s é um valor inválido para parâmetro %2$s, deve ser múltiplo de %3$s";
    }
}
