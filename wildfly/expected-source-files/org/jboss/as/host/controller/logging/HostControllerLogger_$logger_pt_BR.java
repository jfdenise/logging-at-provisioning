package org.jboss.as.host.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:30+0200")
public class HostControllerLogger_$logger_pt_BR extends HostControllerLogger_$logger_pt implements HostControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public HostControllerLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotConnect$str() {
        return "WFLYHC0001: Não foi possível conectar ao controlador de domínio remoto %1$s";
    }
    @Override
    protected String cannotConnectToMaster$str() {
        return "WFLYHC0002: Não foi possível se conectar com o controlador de domínios. O erro foi: %1$s";
    }
    @Override
    protected String creatingHttpManagementService$str() {
        return "WFLYHC0003: A criação do serviço de gerenciamento http usando o securePort (%1$s) da porta (%2$d) da interface de rede (%3$d)";
    }
    @Override
    protected String existingServerWithState$str() {
        return "WFLYHC0005: Servidor existente [%1$s] com status %2$s";
    }
    @Override
    protected String failedToStartServer$str() {
        return "WFLYHC0008: Falha ao iniciar o servidor (%1$s)";
    }
    @Override
    protected String failedToStopServer$str() {
        return "WFLYHC0009: Falha ao interromper o servidor (%1$s)";
    }
    @Override
    protected String ignoringPermGen$str() {
        return "WFLYHC0011: Ignorando <permgen> para jvm '%1$s'; jvm do tipo: %2$s";
    }
    @Override
    protected String noDomainControllerConfigurationProvided$str() {
        return "WFLYHC0012: Nenhuma configuração <domain-controller> foi fornecida e o modo de execução atual ('%1$s') exige acesso ao host do controlador de domínio. A inicialização será anulada. Use o argumento da linha de comando %2$s para iniciar no modo %3$s se precisar iniciar sem a conexão do controlador de domínio, e use as ferramentas de gerenciamento para configurá-lo.";
    }
    @Override
    protected String httpManagementInterfaceIsUnsecured$str() {
        return "WFLYHC0013: Nenhum domínio de segurança definido para o serviço do gerenciamento http, todos os acessos serão irrestritos.";
    }
    @Override
    protected String noServerAvailable$str() {
        return "WFLYHC0014: Nenhum servidor chamado %1$s disponível";
    }
    @Override
    protected String lostRemoteDomainConnection$str() {
        return "WFLYHC0015: Conexão para o host-controller remoto encerrada. Tente a reconexão.";
    }
    @Override
    protected String optionAlreadySet$str() {
        return "WFLYHC0016: Ignorando <option value=\"%1$s\" para jvm '%2$s' já que o '%3$s' foi configurado";
    }
    @Override
    protected String reconnectingServer$str() {
        return "WFLYHC0018: Reconectando ao servidor %1$s";
    }
    @Override
    protected String registeredRemoteSlaveHost$str() {
        return "WFLYHC0019: Host secundário remoto registrado \"%1$s\", %2$s";
    }
    @Override
    protected String registeringServer$str() {
        return "WFLYHC0020: Registrando servidor %1$s";
    }
    @Override
    protected String serverConnected$str() {
        return "WFLYHC0021: Servidor [%1$s] conectado usando a conexão [%2$s]";
    }
    @Override
    protected String startingServer$str() {
        return "WFLYHC0023: Iniciando o servidor %1$s";
    }
    @Override
    protected String stoppingServer$str() {
        return "WFLYHC0024: Interrompendo o servidor %1$s";
    }
    @Override
    protected String unregisteredRemoteSlaveHost$str() {
        return "WFLYHC0026: Host remoto secundário não registrado \"%1$s\"";
    }
    @Override
    protected String unregisteringServer$str() {
        return "WFLYHC0027: Servidor não registrado %1$s";
    }
    @Override
    protected String unregisteredAtRemoteHostController$str() {
        return "WFLYHC0029: Não registrado no domain controller";
    }
    @Override
    protected String lostConnectionToRemoteHost$str() {
        return "WFLYHC0030: A conexão para o host remoto \"%1$s\" encerrou inesperadamente";
    }
    @Override
    protected String invalidRemoteBackupPersisterState$str() {
        return "WFLYHC0031: Não foi possível carregar o modelo de domain usando --backup";
    }
    @Override
    protected String caughtExceptionDuringBoot$str() {
        return "WFLYHC0033: Foi vista uma exceção durante a inicialização";
    }
    @Override
    protected String unsuccessfulBoot$str() {
        return "WFLYHC0034: A inicialização do controlador de hosts falhou de forma irrecuperável: saindo. Veja as mensagens anteriores para obter mais detalhes. %1$s";
    }
    @Override
    protected String reportAdminOnlyDomainXmlFailure$str() {
        return "WFLYHC0035: A instalação da configuração domain-wide falhou. Uma vez que o modo de execução do Controlador do Host é ADMIN_ONLY, a inicialização foi permitida. Caso o modo ADMIN_ONLY não tivesse efeito, o processo seria encerrado devido a uma falha crítica de inicialização.";
    }
    @Override
    protected String masterHostControllerChanged$str() {
        return "WFLYHC0037: O controlador de hosts principal foi reiniciado. Registrando esse controlador de hosts secundário novamente com o novo principal.";
    }
    @Override
    protected String masterHostControllerUnreachable$str() {
        return "WFLYHC0038: O controlador de domínios não pôde ser alcançado nos últimos [%1$d] milissegundos. Reconectando.";
    }
    @Override
    protected String slaveHostControllerChanged$str() {
        return "WFLYHC0039: O controlador de hosts secundário \"%1$s\" foi reiniciado ou está tentando se reconectar. Desfazendo o registro da conexão atual com esse secundário.";
    }
    @Override
    protected String slaveHostControllerUnreachable$str() {
        return "WFLYHC0040: O controlador de hosts secundário \"%1$s\" não pôde ser alcançado nos últimos [%2$d] milissegundos. Desfazendo o registro.";
    }
    @Override
    protected String argumentExpected$str() {
        return "WFLYHC0041: Argumento esperado para a opção %1$s. %2$s";
    }
    @Override
    protected String attemptingToSet$str() {
        return "WFLYHC0042: Tentativa de configurar '%1$s' quando '%2$s' já havia sido configurado";
    }
    @Override
    protected String authenticationFailureUnableToConnect$str() {
        return "WFLYHC0043: A conexão não foi possível devido a uma falha de autenticação.";
    }
    @Override
    protected String cannotAccessRemoteFileRepository$str() {
        return "WFLYHC0044: Não é possível acessar um repositório de arquivos remoto a partir do controlador de domínios";
    }
    @Override
    protected String cannotCreateLocalDirectory$str() {
        return "WFLYHC0045: Não foi possível criar um diretório local: %1$s";
    }
    @Override
    protected String cannotObtainValidDefaultAddress$str() {
        return "WFLYHC0046: Não foi possível obter um endereço padrão válido para comunicação com o ProcessController usando o %1$s ou InetAddress.getLocalHost(). Verifique a configuração de rede do seu sistema ou use a opção de linha de comando %2$s para configurar um endereço válido";
    }
    @Override
    protected String cannotRestartServer$str() {
        return "WFLYHC0047: Não foi possível reiniciar o servidor %1$s, pois ele não foi iniciado; ele está %2$s";
    }
    @Override
    protected String cannotStartServersInvalidMode$str() {
        return "WFLYHC0048: Não é possível iniciar os servidores quando o modo de execução do controlador do host for %1$s";
    }
    @Override
    protected String closeShouldBeManagedByService$str() {
        return "WFLYHC0049: O encerramento deve ser gerenciado pelo serviço";
    }
    @Override
    protected String configurationPersisterAlreadyInitialized$str() {
        return "WFLYHC0050: A persistência da configuração para o modelo do domain já foi inicializada";
    }
    @Override
    protected String connectionToMasterInterrupted$str() {
        return "WFLYHC0051: Interrompido enquanto tentava se conectar ao controlador de domínios";
    }
    @Override
    protected String connectionToMasterTimeout$str() {
        return "WFLYHC0052: Não foi possível conectar-se ao controlador de domínios em %1$d tentativas em %2$s ms";
    }
    @Override
    protected String couldNotGetServerInventory$str() {
        return "WFLYHC0053: Não foi possível obter o inventário do servidor em %1$d %2$s";
    }
    @Override
    protected String didNotReadEntireFile$str() {
        return "WFLYHC0054: Não foi possível ler o arquivo inteiro. Falta: %1$d";
    }
    @Override
    protected String errorClosingDownHost$str() {
        return "WFLYHC0055: Erro ao encerrar o host";
    }
    @Override
    protected String failedProfileOperationsRetrieval$str() {
        return "WFLYHC0056: Falha ao restaurar as operações de perfil a partir do domain controller";
    }
    @Override
    protected String failedToGetFileFromRemoteRepository$str() {
        return "WFLYHC0057: Falha ao obter o arquivo a partir do repositório remoto";
    }
    @Override
    protected String failedToGetServerStatus$str() {
        return "WFLYHC0058: Falha ao obter o status do servidor";
    }
    @Override
    protected String failedToReadAuthenticationKey$str() {
        return "WFLYHC0059: Falha ao ler a chave de autenticação: %1$s";
    }
    @Override
    protected String insufficientInformationToGenerateHash$str() {
        return "WFLYHC0061: Informação insuficiente para gerar o hash.";
    }
    @Override
    protected String invalidOption$str() {
        return "WFLYHC0062: Opção inválida '%1$s'. %2$s";
    }
    @Override
    protected String invalidRootId$str() {
        return "WFLYHC0063: ID de root inválida [%1$d]";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYHC0064: O valor para %1$s não é um %2$s -- %3$s. %4$s";
    }
    @Override
    protected String invocationNotAllowedAfterBoot$str() {
        return "WFLYHC0065: As invocações de %1$s após a inicialização do HostController não são permitidas";
    }
    @Override
    protected String malformedUrl$str() {
        return "WFLYHC0066: URL malformado fornecido para a opção %1$s. %2$s";
    }
    @Override
    protected String mustInvokeBeforeCheckingSlaveStatus$str() {
        return "WFLYHC0067: Deve ligar para %1$s antes de verificar o status do controlador de hosts secundário";
    }
    @Override
    protected String mustInvokeBeforePersisting$str() {
        return "WFLYHC0068: É preciso chamar %1$s antes de persistir o modelo do domínio";
    }
    @Override
    protected String noServerInventory$str() {
        return "WFLYHC0071: Nenhum inventário do servidor";
    }
    @Override
    protected String serverNameAlreadyRegistered$str() {
        return "WFLYHC0077: Já existe um servidor registrado chamado '%1$s'";
    }
    @Override
    protected String serverStillRunning$str() {
        return "WFLYHC0078: O servidor (%1$s) continua em execução";
    }
    @Override
    protected String unableToGenerateHash$str() {
        return "WFLYHC0079: Não foi possível gerar o hash";
    }
    @Override
    protected String unableToLoadProperties$str() {
        return "WFLYHC0080: Não foi possível carregar propriedades a partir do URL %1$s. %2$s";
    }
    @Override
    protected String undefinedSocketBinding$str() {
        return "WFLYHC0081: Grupo de socket indefinido para o servidor %1$s";
    }
    @Override
    protected String undefinedSocketBindingGroup$str() {
        return "WFLYHC0082: O grupo de socket binding incluído %1$s não foi definido";
    }
    @Override
    protected String unknown$str() {
        return "WFLYHC0084: %1$s %2$s desconhecido";
    }
    @Override
    protected String unknownHostValue$str() {
        return "WFLYHC0085: O valor para %1$s não é um host conhecido -- %2$s. %3$s";
    }
    @Override
    protected String hostAlreadyShutdown$str() {
        return "WFLYHC0087: O Host-Controller já foi encerrado.";
    }
    @Override
    protected String hostControllerSystemPropertyUpdateNotSupported$str() {
        return "WFLYHC0090: O HostControllerEnvironment não suporta as atualizações da propriedade de sistema";
    }
    @Override
    protected String cannotIgnoreTypeHost$str() {
        return "WFLYHC0091: Os recursos do tipo %1$s não podem ser ignorados";
    }
    @Override
    protected String duplicateIgnoredResourceType$str() {
        return "WFLYHC0092: Já foi localizado um elemento '%1$s' cujo atributo 'type' é '%2$s'";
    }
    @Override
    protected String cannotAccessJvmInputArgument$str() {
        return "WFLYHC0093: Os argumentos de entrada JVM não podem ser acessados, por isso, as propriedades do sistema transferidas diretamente para este controlador de host JVM não serão transferidas através dos processos do servidor. A causa do problema: %1$s";
    }
    @Override
    protected String missingHomeDirConfiguration$str() {
        return "WFLYHC0094: Falta o valor da configuração para: %1$s";
    }
    @Override
    protected String homeDirectoryDoesNotExist$str() {
        return "WFLYHC0095: O diretório principal não existe: %1$s";
    }
    @Override
    protected String domainBaseDirectoryDoesNotExist$str() {
        return "WFLYHC0097: O diretório base do domínio não existe: %1$s";
    }
    @Override
    protected String domainBaseDirectoryIsNotADirectory$str() {
        return "WFLYHC0098: O diretório base do domínio não é um diretório: %1$s";
    }
    @Override
    protected String configDirectoryDoesNotExist$str() {
        return "WFLYHC0099: O diretório de configuração não existe: %1$s";
    }
    @Override
    protected String domainDataDirectoryIsNotDirectory$str() {
        return "WFLYHC0100: O diretório de domínio não é um diretório: %1$s";
    }
    @Override
    protected String couldNotCreateDomainDataDirectory$str() {
        return "WFLYHC0101: Não foi possível criar um diretório de dados do domínio: %1$s";
    }
    @Override
    protected String domainContentDirectoryIsNotDirectory$str() {
        return "WFLYHC0102: O diretório do conteúdo de domínio não é um diretório: %1$s";
    }
    @Override
    protected String couldNotCreateDomainContentDirectory$str() {
        return "WFLYHC0103: Não foi possível criar um diretório de conteúdo do domínio: %1$s";
    }
    @Override
    protected String logDirectoryIsNotADirectory$str() {
        return "WFLYHC0104: O diretório de registro de log não é um diretório: %1$s";
    }
    @Override
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYHC0105: Não foi possível criar um diretório de registro de log: %1$s";
    }
    @Override
    protected String serversDirectoryIsNotADirectory$str() {
        return "WFLYHC0106: O diretório de servidores não é um diretório: %1$s";
    }
    @Override
    protected String couldNotCreateServersDirectory$str() {
        return "WFLYHC0107: Não foi possível criar o diretório de servidores: %1$s";
    }
    @Override
    protected String domainTempDirectoryIsNotADirectory$str() {
        return "WFLYHC0108: O diretório temporário do domínio não existe: %1$s";
    }
    @Override
    protected String couldNotCreateDomainTempDirectory$str() {
        return "WFLYHC0109: Não foi possível criar o diretório temporário do domínio: %1$s";
    }
    @Override
    protected String sslFailureUnableToConnect$str() {
        return "WFLYHC0110: Não foi possível conexão devido falha do SSL.";
    }
    @Override
    protected String jvmOptionAlreadyExists$str() {
        return "WFLYHC0111: A opção '%1$s' já existe";
    }
    @Override
    protected String unsupportedManagementVersionForHost$str() {
        return "WFLYHC0113: A versão de gerenciamento do controlador do host %1$s.%2$s é muito antiga. Apenas %3$s.%4$s ou posteriores são compatíveis";
    }
    @Override
    protected String failedToAddExtensions$str() {
        return "WFLYHC0114: Falha ao adicionar as extensões usadas pelo domínio. Falha na descrição: %1$s";
    }
    @Override
    protected String argumentHasNoValue$str() {
        return "WFLYHC0115: O argumento %1$s não tem valor. %2$s";
    }
    @Override
    protected String usageNote$str() {
        return "Use %1$s --help para obter informações sobre os argumentos da linha de comando válidos e suas sintaxes.";
    }
    @Override
    protected String cannotAccessS3File$str() {
        return "WFLYHC0116: Não foi possível acessar o arquivo S3: %1$s";
    }
    @Override
    protected String failedMarshallingDomainControllerData$str() {
        return "WFLYHC0117: Falha ao obter os dados do controlador do domain a partir do arquivo S3";
    }
    @Override
    protected String cannotWriteToS3File$str() {
        return "WFLYHC0118: Não foi possível gravar os dados do controlador do domínio no arquivo S3: %1$s";
    }
    @Override
    protected String cannotAccessS3Bucket$str() {
        return "WFLYHC0119: Não foi possível acessar o bucket S3 '%1$s': %2$s";
    }
    @Override
    protected String discoveryOptionsFailureUnableToConnect$str() {
        return "WFLYHC0120: Foram tentadas todas a(s) opção(ões) de descoberta do controlador, porém foi impossível a conexão";
    }
    @Override
    protected String preSignedUrlsMustHaveSamePath$str() {
        return "WFLYHC0121: O pre_signed_put_url e o pre_signed_delete_url devem possuir o mesmo caminho";
    }
    @Override
    protected String preSignedUrlsMustBeSetOrUnset$str() {
        return "WFLYHC0122: O pre_signed_put_url e pre_signed_delete_url devem ser ambos determinados ou indeterminados";
    }
    @Override
    protected String preSignedUrlMustPointToFile$str() {
        return "WFLYHC0123: A URL pré-assinada %1$s deve direcionar para um arquivo em um bucket";
    }
    @Override
    protected String invalidPreSignedUrl$str() {
        return "WFLYHC0124: A URL pré-assinada %1$s não é uma URL válida";
    }
    @Override
    protected String invalidPreSignedUrlLength$str() {
        return "WFLYHC0125: A URL pré-assinada %1$s pode ter apenas um subdiretório em um bucket";
    }
    @Override
    protected String creatingBucketWithUnsupportedCallingFormat$str() {
        return "WFLYHC0126: Criando um bucket location-constrained com um calling-format não suportado";
    }
    @Override
    protected String invalidS3Location$str() {
        return "WFLYHC0127: Local inválido: %1$s";
    }
    @Override
    protected String invalidS3Bucket$str() {
        return "WFLYHC0128: Nome do bucket inválido: %1$s";
    }
    @Override
    protected String bucketAuthenticationFailure$str() {
        return "WFLYHC0129: O bucket '%1$s' não pôde ser acessado (rsp=%2$d (%3$s)). Talvez o bucket seja de propriedade de outra pessoa, ou a autenticação falhou";
    }
    @Override
    protected String unexpectedResponse$str() {
        return "WFLYHC0130: Resposta não esperada: %1$s";
    }
    @Override
    protected String httpRedirectSupportRequired$str() {
        return "WFLYHC0131: Suporte de redireção HTTP solicitado";
    }
    @Override
    protected String errorParsingBucketListings$str() {
        return "WFLYHC0132: Erro inesperado na listagem(ns) do bucket de pesquisa";
    }
    @Override
    protected String cannotInitializeSaxDriver$str() {
        return "WFLYHC0133: Não foi possível inicializar o driver SAX para o XMLReader";
    }
    @Override
    protected String cannotInstantiateDiscoveryOptionClass$str() {
        return "WFLYHC0134: Não foi possível instanciar a classe de opção de descoberta '%1$s': %2$s";
    }
    @Override
    protected String cannotWriteDomainControllerData$str() {
        return "WFLYHC0137: Não foi possível gravar os dados do controlador de domínio no arquivo S3. O erro foi: %1$s";
    }
    @Override
    protected String cannotRemoveS3File$str() {
        return "WFLYHC0138: Não foi possível remover o arquivo S3. O erro foi: %1$s";
    }
    @Override
    protected String cannotExecuteTransactionalOperationFromSlave$str() {
        return "WFLYHC0140: Não pode executar operação transacional “%1$s” do controlador de hosts secundário";
    }
    @Override
    protected String failedToApplyDomainConfig0$str() {
        return "WFLYHC0142: Falha na aplicação da configuração em todo o domínio a partir do controlador de domínios";
    }
    @Override
    protected String failedToApplyDomainConfig2$str() {
        return "WFLYHC0143: Falha na aplicação da configuração em todo o domínio a partir do controlador de domínios. Resultado da operação: %1$s. Descrição de falhas %2$s";
    }
    @Override
    protected String fetchConfigFromDomainMasterFailed$str() {
        return "WFLYHC0144: O host não pode ser iniciado porque foi iniciado no modo de execução '%1$s' sem nenhum acesso a uma cópia local da política de configuração do domínio. O atributo '%2$s' foi determinado para '%3$s' e a política de configuração do domínio não pôde ser obtida a partir do host do controlador de domínio. A inicialização será cancelada. Use o argumento da linha de comando '%4$s' para iniciar caso você precise iniciar sem estar vinculado a uma conexão do controlador do domínio.";
    }
    @Override
    protected String noAccessControlConfigurationAvailable$str() {
        return "WFLYHC0145: Não é possível iniciar o host porque ele foi iniciado no modo de execução '%1$s' sem acesso à cópia local da política de configuração do domínio, e o atributo '%2$s' foi determinado para '%3$s'. A inicialização será cancelada. Use o argumento da linha de comando '%4$s' para iniciar o modo de execução '%5$s'.";
    }
    @Override
    protected String failedDiscoveringMaster$str() {
        return "WFLYHC0146: Não foi possível descobrir o controlador de domínios usando a opção de descoberta %1$s. O erro foi: %2$s";
    }
    @Override
    protected String noDiscoveryOptionsLeft$str() {
        return "WFLYHC0147: Nenhuma das opções de descoberta do controlador do domain disponíveis.";
    }
    @Override
    protected String connectedToMaster$str() {
        return "WFLYHC0148: Conectado-se ao controlador de domínios em %1$s";
    }
    @Override
    protected String usingCachedDC$str() {
        return "WFLYHC0149: A opção %1$s foi configurada; obtendo a configuração domain-wide a partir do %2$s";
    }
    @Override
    protected String reconnectingToMaster$str() {
        return "WFLYHC0150: Tentando reconectar-se com o controlador de domínios.";
    }
    @Override
    protected String noDomainControllerConfigurationProvidedForAdminOnly$str() {
        return "WFLYHC0151: Nenhuma configuração de descoberta do controlador de domínio foi fornecida, e o atributo '%1$s' foi determinado para '%2$s'. A inicialização será cancelada. Use o argumento da linha de comando %3$s para iniciar no modo %4$s caso precise iniciar sem a conexão do controlador de domínio e, depois, use as ferramentas de gerenciamento para configuração de uma conexão.";
    }
    @Override
    protected String serverLaunchCommandPrefix$str() {
        return "WFLYHC0152: O servidor %1$s será iniciado com o prefixo do comando de lançamento da JVM '%2$s'";
    }
    @Override
    protected String channelClosed$str() {
        return "WFLYHC0153: Canal encerrado";
    }
    @Override
    protected String couldNotCreateDomainAutoStartDirectory$str() {
        return "WFLYHC0157: Não foi possível criar o diretório de inicialização automática do domínio: %1$s";
    }
    @Override
    protected String couldNotPersistAutoStartServerStatus$str() {
        return "WFLYHC0158: Erro persistente do status autostart do servidor";
    }
    @Override
    protected String invalidDiscoveryType$str() {
        return "WFLYHC0159: Tipo de detecção inválido %1$s";
    }
    @Override
    protected String couldNotObtainDomainUuid$str() {
        return "WFLYHC0160: Não foi possível ler ou criar a UUID do domínio no arquivo: %1$s";
    }
    @Override
    protected String bindingNameNotUnique$str() {
        return "WFLYHC0162: O nome de associação '%1$s' no socket binding group '%2$s' não é exclusivo. Os nomes devem ser exclusivos considerando todos os socket-binding, local-destination-outbound-socket-binding e remote-destination-outbound-socket-binding";
    }
    @Override
    protected String profileInvolvedInACycle$str() {
        return "WFLYHC0163: O perfil '%1$s' está envolvido em um ciclo";
    }
    @Override
    protected String profileAttemptingToOverrideSubsystem$str() {
        return "WFLYHC0164: O perfil '%1$s' define o subsistema '%2$s' que também é definido no seu perfil anterior '%3$s'. Não há compatibilidade com a substituição de subsistemas";
    }
    @Override
    protected String socketBindingGroupInvolvedInACycle$str() {
        return "WFLYHC0165: O socket binding group '%1$s' está envolvido em um ciclo";
    }
    @Override
    protected String socketBindingGroupAttemptingToOverrideSocketBinding$str() {
        return "WFLYHC0166: O socket binding group '%1$s' define o socket binding '%2$s', que também é definido no seu socket binding group anterior '%3$s'. Não há compatibilidade com a substituição de socket bindings";
    }
    @Override
    protected String profileIncludesSameSubsystem$str() {
        return "WFLYHC0167: O perfil '%1$s' inclui o perfil '%2$s' e o '%3$s'. Ambos definem o subsistema '%4$s', que não é compatível";
    }
    @Override
    protected String socketBindingGroupIncludesSameSocketBinding$str() {
        return "WFLYHC0168: O socket binding group '%1$s' inclui socket binding group '%2$s' e socket binding group '%3$s'. Ambos definem socket o binding '%4$s', que não é compatível";
    }
    @Override
    protected String embeddedHostControllerRestartMustProvideAdminOnlyTrue$str() {
        return "WFLYHC0169: O recarregamento em mode de execução não é suportado com host controller incorporado, deve-se especificar admin-only=true.";
    }
    @Override
    protected String hostRegistrationCannotReleaseSharedLock$str() {
        return "WFLYHC0170: Erro na liberação do bloqueio compartilhado após o registro de host para operationID: %1$s";
    }
    @Override
    protected String suspendListenerFailed$str() {
        return "WFLYHC0171: Falha ao obter resposta do ouvinte de suspensão para o servidor: %1$s";
    }
    @Override
    protected String suspendExecutionFailed$str() {
        return "WFLYHC0172: Falha ao executar a operação suspensa para o servidor: %1$s";
    }
    @Override
    protected String cannotBothHaveFalseUseCurrentHostConfigAndHostConfig$str() {
        return "WFLYHC0173: Não é possível utilizar use-current-host-config=false enquanto especifica-se um host-config";
    }
    @Override
    protected String cannotBothHaveFalseUseCurrentDomainConfigAndDomainConfig$str() {
        return "WFLYHC0174: Não é possível utilizar use-current-domain-config=false enquanto especifica-se um domain-config";
    }
    @Override
    protected String domainConfigForReloadNotFound$str() {
        return "WFLYHC0175: domain-config '%1$s' especificado para o recarregamento não foi encontrado";
    }
    @Override
    protected String nativeManagementInterfaceIsUnsecured$str() {
        return "WFLYHC0177: Nenhum domínio de segurança definido para o serviço de gerenciamento nativo; todos os acessos serão irrestritos.";
    }
    @Override
    protected String aborting$str() {
        return "WFLYHC0178: Anulando com o código de saída %1$d";
    }
    @Override
    protected String shuttingDownInResponseToProcessControllerSignal$str() {
        return "WFLYHC0179: ProcessController sinalizou para desligar; desligando";
    }
    @Override
    protected String shuttingDownInResponseToManagementRequest$str() {
        return "WFLYHC0180: Desligando em resposta à operação de gerenciamento '%1$s'";
    }
    @Override
    protected String shutdownHookInvoked$str() {
        return "WFLYHC0181: O desligamento do controlador de host foi solicitado via um sinal OS";
    }
    @Override
    protected String timedOutAwaitingSuspendResponse$str() {
        return "WFLYHC0182: Tempo limite atingido após %1$d ms aguardando resposta(s) de suspensão de servidor para o servidor: %2$s";
    }
    @Override
    protected String timedOutAwaitingSuspendResponseMsg$str() {
        return "WFLYHC0183: Tempo limite atingido após %1$d ms aguardando resposta(s) de suspensão de servidor para o servidor: %2$s";
    }
    @Override
    protected String interruptedAwaitingSuspendResponse$str() {
        return "WFLYHC0184: %1$s interrompido aguardando resposta(s) de suspensão de servidor";
    }
    @Override
    protected String interruptedAwaitingSuspendResponseMsg$str() {
        return "WFLYHC0185: %1$s interrompido aguardando resposta(s) de suspensão de servidor";
    }
    @Override
    protected String suspendExecutionFailedMsg$str() {
        return "WFLYHC0186: Falha ao executar a operação suspensa para o servidor: %1$s";
    }
    @Override
    protected String suspendListenerFailedMsg$str() {
        return "WFLYHC0187: Falha ao obter resposta do ouvinte de suspensão para o servidor: %1$s";
    }
    @Override
    protected String timedOutAwaitingResumeResponse$str() {
        return "WFLYHC0188: Tempo limite atingido após %1$d ms aguardando resposta(s) de retomada de servidor para o servidor: %2$s";
    }
    @Override
    protected String timedOutAwaitingResumeResponseMsg$str() {
        return "WFLYHC0189: Tempo limite atingido após %1$d ms aguardando resposta(s) de retomada de servidor para o servidor: %2$s";
    }
    @Override
    protected String interruptedAwaitingResumeResponse$str() {
        return "WFLYHC0190: %1$s interrompido aguardando resposta(s) de retomada de servidor";
    }
    @Override
    protected String interruptedAwaitingResumeResponseMsg$str() {
        return "WFLYHC0191: %1$s interrompido aguardando resposta(s) de retomada de servidor";
    }
    @Override
    protected String resumeExecutionFailedMsg$str() {
        return "WFLYHC0192: Falha ao executar a operação de retomada para o servidor: %1$s";
    }
    @Override
    protected String resumeListenerFailedMsg$str() {
        return "WFLYHC0193: Falha ao obter resposta do ouvinte de retomada para o servidor: %1$s";
    }
    @Override
    protected String resumeExecutionFailed$str() {
        return "WFLYHC0194: Falha ao executar a operação de retomada para o servidor: %1$s";
    }
    @Override
    protected String resumeListenerFailed$str() {
        return "WFLYHC0195: Falha ao obter resposta do ouvinte de retomada para o servidor: %1$s";
    }
    @Override
    protected String cannotRenameCachedDomainXmlOnBoot$str() {
        return "WFLYHC0196: Não foi possível mover o arquivo %1$s para %2$s. Não é possível persistir as alterações de configuração do domínio: %3$s ";
    }
    @Override
    protected String attributeRequiresSSLContext$str() {
        return "WFLYHC0197: Se o atributo %1$s for definido, um ssl-context também deve ser definido";
    }
    @Override
    protected String managedServerUnstable1$str() {
        return "WFLYHC0198: O servidor '%1$s' está instável e deve ser interrompido ou reiniciado. Um servidor instável pode não ser interrompido normalmente, portanto, a operação 'kill' pode ser necessária para encerrar o processo do servidor.";
    }
    @Override
    protected String managedServerUnstable2$str() {
        return "WFLYHC0198: O servidor '%1$s' (gerenciado pelo host '%2$s') está instável e deve ser interrompido ou reiniciado. Um servidor instável pode não ser interrompido normalmente, portanto, a operação 'kill' pode ser necessária para encerrar o processo do servidor.";
    }
    @Override
    protected String serverSuspected$str() {
        return "WFLYHC0199: O servidor '%1$s' (gerenciado pelo host '%2$s') não respondeu a uma solicitação de operação dentro do tempo limite configurado. Isso pode significar que o servidor se tornou instável.";
    }
    @Override
    protected String failedReportingServerInstabilityToMaster$str() {
        return "WFLYHC0200: Falha ao reportar a instabilidade do servidor '%1$s' ao controlador de domínio.";
    }
    @Override
    protected String hostDomainSynchronizationError$str() {
        return "WFLYHC0201: Erro ao sincronizar o modelo de host com o modelo de controlador de domínio com falha: %1$s.";
    }
    @Override
    protected String domainModelAppliedButReloadIsRequired$str() {
        return "WFLYHC0202: A configuração do domínio foi aplicada com êxito, mas é necessário recarregar para que as alterações se tornem ativas.";
    }
    @Override
    protected String domainModelAppliedButRestartIsRequired$str() {
        return "WFLYHC0203: A configuração do domínio foi aplicada com êxito, mas é necessário reiniciar para que as alterações se tornem ativas.";
    }
    @Override
    protected String serverLoggingConfigurationFileNotFound$str() {
        return "WFLYHC0204: Nenhum arquivo de configuração de registro em log foi encontrado na primeira inicialização dos servidores. O registro em log não será configurado até que o subsistema de registro em log esteja ativado para o servidor %1$s";
    }
    @Override
    protected String failedToSetLoggingConfiguration$str() {
        return "WFLYHC0205: Ocorreu um erro durante a configuração da propriedade -Dlogging.configuration para o servidor %1$s. Caminho de configuração %2$s";
    }
    @Override
    protected String cannotOverwriteDomainXmlWithEmpty$str() {
        return "WFLYHC0206: O arquivo %1$s já existe, você deve usar --remove-existing-domain-config para substituir os arquivos existentes.";
    }
    @Override
    protected String cannotOverwriteHostXmlWithEmpty$str() {
        return "WFLYHC0207: O arquivo %1$s já existe, você deve usar --remove-existing-host-config para substituir os arquivos existentes.";
    }
    @Override
    protected String cannotAddHostAlreadyRegistered$str() {
        return "WFLYHC0208: Um host (%1$s) já foi registrado. Você deve desligar esse host antes de adicionar um novo.";
    }
    @Override
    protected String nullHostName$str() {
        return "WFLYHC0209: O nome do host não pode ser nulo.";
    }
    @Override
    protected String cannotAddSlaveHostAfterBoot$str() {
        return "WFLYHC0210: Um controlador de hosts secundário não pode ser adicionado usando add(). Adicione um host omitindo esse parâmetro e configure o controlador de domínios remoto usando o atributo write-attribute.";
    }
    @Override
    protected String bootConfigValidationFailed$str() {
        return "WFLYHC0211: Falha na validação da configuração de inicialização";
    }
    @Override
    protected String fetchOfMissingConfigurationFailed$str() {
        return "WFLYHC0212: A busca da configuração ausente no controlador de domínios falhou sem explicação. O resultado da operação de busca foi %1$s";
    }
    @Override
    protected String invalidJavaHome$str() {
        return "WFLYHC0213: A página principal do Java '%1$s' não existe.";
    }
    @Override
    protected String invalidJavaHomeBin$str() {
        return "WFLYHC0214: O bin '%1$s' da página principal do Java não existe. Foi determinado que o diretório base deve ser %2$s.";
    }
    @Override
    protected String cannotFindJavaExe$str() {
        return "WFLYHC0215: Não foi possível encontrar o Java executável em %1$s.";
    }
    @Override
    protected String moduleOptionNotAllowed$str() {
        return "WFLYHC0216: A opção de módulo %1$s não é permitida.";
    }
    @Override
    protected String securityRealmReferencesUnsupported$str() {
        return "WFLYHC0217: Os reinos de segurança não são mais compatíveis, migre as referências para eles da configuração.";
    }
    @Override
    protected String noServerInstallationPrepared$str() {
        return "WFLYHC0218: Nenhuma instalação do %1$s foi preparada.";
    }
    @Override
    protected String identityNotAuthorizedAsServer$str() {
        return "WFLYHC0219: Falha na autorização para '%1$s' tentando se conectar como um servidor de domínio.";
    }
    @Override
    protected String failedToSyncServerStatus$str() {
        return "WFLYHC0220: Falha ao sincronizar o status do servidor no registro de um controlador de host. Não há nenhum manipulador registrado para gerenciar a operação %1$s para o servidor%2$s.";
    }
    @Override
    protected String incompatibleStability$str() {
        return "WFLYHC0221: O nível de estabilidade do controlador de domínio %1$s não corresponde ao nível de estabilidade do host de conexão %2$s";
    }
    @Override
    protected String unsupportedStability$str() {
        return "WFLYHC0222: O nível de estabilidade %1$s não é compatível com %2$s";
    }
    @Override
    protected String mixedDomainUnsupportedStability$str() {
        return "WFLYHC0223: O nível de estabilidade %1$s só é compatível em controladores de host com a mesma versão principal e secundária de gerenciamento que o controlador de domínio. A versão do controlador de domínio é %2$d.%3$d. A versão do controlador de host remoto é %4$d.%5$d";
    }
    @Override
    protected String configFilesInUse$str() {
        return "- Arquivos de configuração do controlador de hosts em uso: %1$s, %2$s";
    }
    @Override
    protected String configFileInUse$str() {
        return "- Arquivo de configuração do controlador de hosts em uso: %1$s";
    }
    @Override
    protected String stabilityInUse$str() {
        return "- Nível mínimo de estabilidade do recurso: %1$s";
    }
}
