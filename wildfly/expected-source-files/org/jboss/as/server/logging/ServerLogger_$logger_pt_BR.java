package org.jboss.as.server.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:26+0200")
public class ServerLogger_$logger_pt_BR extends ServerLogger_$logger_pt implements ServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ServerLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String jbossDeploymentStructureIgnored$str() {
        return "WFLYSRV0001: %1$s na subimplantação ignorado. O jboss-deployment-structure.xml só é analisado para implantações de nível superior.";
    }
    @Override
    protected String cannotLoadAnnotationIndex$str() {
        return "WFLYSRV0002: O carregamento falhou para o índice de anotação \"%1$s\", com a seguinte exceção: %2$s";
    }
    @Override
    protected String cannotIndexClass$str() {
        return "WFLYSRV0003: Não foi possível indexar a classe %1$s em %2$s";
    }
    @Override
    protected String undeploymentRolledBack$str() {
        return "WFLYSRV0007: O cancelamento da implantação \"%1$s\" foi revertido com a seguinte mensagem de falha: %2$s";
    }
    @Override
    protected String undeploymentRolledBackWithNoMessage$str() {
        return "WFLYSRV0008: O cancelamento da implantação \"%1$s\" foi revertido sem mensagem de falha";
    }
    @Override
    protected String deploymentUndeployed$str() {
        return "WFLYSRV0009: \"%1$s\" teve sua implantação cancelada (runtime-name: \"%2$s\")";
    }
    @Override
    protected String deploymentDeployed$str() {
        return "WFLYSRV0010: \"%1$s\" foi implantado (runtime-name: \"%2$s\")";
    }
    @Override
    protected String redeployRolledBack$str() {
        return "WFLYSRV0011: A reimplantação da implantação \"%1$s\" foi revertida com a mensagem de falha: %2$s";
    }
    @Override
    protected String redeployRolledBackWithNoMessage$str() {
        return "WFLYSRV0012: A reimplantação do cancelamento da implantação \"%1$s\" foi revertida sem nenhuma mensagem de falha";
    }
    @Override
    protected String deploymentRedeployed$str() {
        return "WFLYSRV0013: \"%1$s\" reimplantado";
    }
    @Override
    protected String replaceRolledBack$str() {
        return "WFLYSRV0014: A reimplantação da implantação \"%1$s\" pela implantação \"%2$s\" foi revertida com a seguinte mensagem de falha: %3$s";
    }
    @Override
    protected String replaceRolledBackWithNoMessage$str() {
        return "WFLYSRV0015: A reimplantação da implantação \"%1$s\" pela implantação \"%2$s\" foi revertida sem mensagem de falha";
    }
    @Override
    protected String deploymentReplaced$str() {
        return "WFLYSRV0016: A implantação \"%1$s\" foi substituída pela implantação \"%2$s\"";
    }
    @Override
    protected String annotationImportIgnored$str() {
        return "WFLYSRV0017: A opção da importação das anotações %1$s especificada no jboss-deployment-structure.xml para o módulo adicional %2$s foi ignorada. Os módulos adicionais não podem importar as anotações.";
    }
    @Override
    protected String privateApiUsed$str() {
        return "WFLYSRV0018: A implantação \"%1$s\" está usando um módulo privado (\"%2$s\") que pode ser alterado ou removido em versões futuras sem nenhum aviso.";
    }
    @Override
    protected String unsupportedApiUsed$str() {
        return "WFLYSRV0019: A implantação \"%1$s\" está usando um módulo não compatível (\"%2$s\") que pode ser alterado ou removido em versões futuras sem nenhum aviso.";
    }
    @Override
    protected String failedToRemoveDeploymentContent$str() {
        return "WFLYSRV0020: Ocorreu uma exceção na remoção do conteúdo de implantação %1$s";
    }
    @Override
    protected String deploymentRolledBack$str() {
        return "WFLYSRV0021: O procedimento da implantação \"%1$s\" foi revertido com mensagem de falha: %2$s";
    }
    @Override
    protected String deploymentRolledBackWithNoMessage$str() {
        return "WFLYSRV0022: O procedimento da implantação \"%1$s\" foi revertido sem mensagem de falha";
    }
    @Override
    protected String failedToParseCommandLineInteger$str() {
        return "WFLYSRV0023: Falha ao analisar a propriedade (%1$s), valor (%2$s) como um número inteiro";
    }
    @Override
    protected String cannotAddURLStreamHandlerFactory$str() {
        return "WFLYSRV0024: Não foi possível adicionar o módulo '%1$s' como provedor URLStreamHandlerFactory";
    }
    @Override
    protected String startedClean$str() {
        return "WFLYSRV0025: %1$s";
    }
    @Override
    protected String startedWitErrors$str() {
        return "WFLYSRV0026: %1$s";
    }
    @Override
    protected String startingDeployment$str() {
        return "WFLYSRV0027: Iniciando a implantação do \"%1$s\" (runtime-name: \"%2$s\")";
    }
    @Override
    protected String stoppedDeployment$str() {
        return "WFLYSRV0028: Implantação interrompida %1$s (runtime-name: %2$s) em %3$dms";
    }
    @Override
    protected String nativeManagementInterfaceIsUnsecured$str() {
        return "WFLYSRV0034: Nenhum domínio de segurança ou autenticação de servidor sasl definida para serviço de gerenciamento nativo; todos os acessos serão irrestritos.";
    }
    @Override
    protected String httpManagementInterfaceIsUnsecured$str() {
        return "WFLYSRV0035: Nenhum domínio de segurança ou autenticação de servidor http definida para o serviço de gerenciamento http; todos os acessos serão irrestritos.";
    }
    @Override
    protected String creatingHttpManagementServiceOnSocket$str() {
        return "WFLYSRV0039: Criando serviço de gerenciamento http usando o socket-binding (%1$s)";
    }
    @Override
    protected String creatingHttpManagementServiceOnSecureSocket$str() {
        return "WFLYSRV0040: Criando serviço de gerenciamento http usando secure-socket-binding (%1$s)";
    }
    @Override
    protected String creatingHttpManagementServiceOnSocketAndSecureSocket$str() {
        return "WFLYSRV0041: Criando serviço de gerenciamento http usando o socket-binding (%1$s) e o secure-socket-binding (%2$s)";
    }
    @Override
    protected String caughtExceptionClosingContentInputStream$str() {
        return "WFLYSRV0042: Foi vista uma exceção encerrando o fluxo de entrada para atualização do conteúdo de implantação";
    }
    @Override
    protected String caughtExceptionUndeploying$str() {
        return "WFLYSRV0043: O processador da unidade de implantação %1$s lançou uma exceção inesperada durante a fase de cancelamento da implantação %2$s ou %3$s";
    }
    @Override
    protected String extensionMissingManifestAttribute$str() {
        return "WFLYSRV0045: Falta a extensão %1$s solicitada no atributo do manifesto %2$s-%3$s (ignorando extensão)";
    }
    @Override
    protected String invalidExtensionURI$str() {
        return "WFLYSRV0046: A sintaxe do URI %1$s da extensão é inválida: %2$s";
    }
    @Override
    protected String cannotFindExtensionListEntry$str() {
        return "WFLYSRV0047: Não foi possível encontrar o %1$s da entrada da Lista da Extensões referenciado de %2$s";
    }
    @Override
    protected String duplicateServerNameConfiguration$str() {
        return "WFLYSRV0048: A configuração do nome do servidor foi fornecida através da propriedade de sistema %1$s ('%2$s') e através da configuração xml ('%3$s'). O valor da configuração xml será usado.";
    }
    @Override
    protected String serverStarting$str() {
        return "WFLYSRV0049: Iniciando %1$s %2$s";
    }
    @Override
    protected String serverStopped$str() {
        return "WFLYSRV0050: %1$s interrompido em %2$dms";
    }
    @Override
    protected String logHttpConsole$str() {
        return "WFLYSRV0051: O console de administração escutando em http://%1$s:%2$d";
    }
    @Override
    protected String logHttpsConsole$str() {
        return "WFLYSRV0052: O console de administração escutando no https://%1$s:%2$d";
    }
    @Override
    protected String logHttpAndHttpsConsole$str() {
        return "WFLYSRV0053: O console de administração escutando no http://%1$s:%2$d e https://%3$s:%4$d";
    }
    @Override
    protected String logNoConsole$str() {
        return "WFLYSRV0054: O console de administração não está ativado";
    }
    @Override
    protected String caughtExceptionDuringBoot$str() {
        return "WFLYSRV0055: Foi vista uma exceção durante a inicialização";
    }
    @Override
    protected String unsuccessfulBoot$str() {
        return "WFLYSRV0056: A inicialização do servidor falhou de uma maneira irrecuperável: saindo. Veja as mensagens anteriores para obter mais detalhes. %1$s";
    }
    @Override
    protected String reportAdminOnlyMissingDeploymentContent$str() {
        return "WFLYSRV0057: Nenhum conteúdo de implantação com hash %1$s está disponível no repositório do conteúdo para implantação %2$s. Como o controlador do host está iniciando no modo ADMIN-ONLY, a inicialização terá permissão para proceder e fornecer aos administradores a oportunidade de corrigir esse problema. Se o controlador do host não estivesse no modo ADMIN-ONLY, isso seria uma falha de inicialização fatal.";
    }
    @Override
    protected String additionalResourceRootDoesNotExist$str() {
        return "WFLYSRV0058: O root de recurso adicional %1$s adicionado través do jboss-deployment-structure.xml não existe";
    }
    @Override
    protected String classPathEntryNotValid$str() {
        return "WFLYSRV0059: A entrada do caminho da classe %1$s em %2$s não direciona a um jar válido para a referência do caminho da classe.";
    }
    @Override
    protected String logHttpManagement$str() {
        return "WFLYSRV0060: A interface de gerenciamento http escutando em http://%1$s:%2$d/management";
    }
    @Override
    protected String logHttpsManagement$str() {
        return "WFLYSRV0061: A interface de gerenciamento http escutando em https://%1$s:%2$d/management";
    }
    @Override
    protected String logHttpAndHttpsManagement$str() {
        return "WFLYSRV0062: A interface de gerenciamento http escutando em http://%1$s:%2$d/management e https://%3$s:%4$d/management";
    }
    @Override
    protected String logNoHttpManagement$str() {
        return "WFLYSRV0063: A interface do gerenciamento http não está ativada";
    }
    @Override
    protected String jbossDeploymentStructureNamespaceIgnored$str() {
        return "WFLYSRV0064: Namespace urn:jboss:deployment-structure encontrado no jboss.xml para a subimplantação %1$s. Isso só é válido numa implantação de nível superior.";
    }
    @Override
    protected String failedToUnmountContentOverride$str() {
        return "WFLYSRV0065: Falha ao desmontar a sobreposição da implantação";
    }
    @Override
    protected String deploymentDependenciesAreATopLevelElement$str() {
        return "WFLYSRV0067: jboss-deployment-dependencies não pode ser usado em uma subimplantação, ele deve ser especificado no nível EAR: %1$s";
    }
    @Override
    protected String reportAdminOnlyMissingDeploymentOverlayContent$str() {
        return "WFLYSRV0068: Nenhum conteúdo de sobreposição da implantação com hash %1$s disponível no repositório do conteúdo da implantação para a implantação %2$s no local %3$s. Como o controlador do host está iniciando em modo de ADMIN-ONLY, a inicialização será permitida para continuar a fornecer aos administradores uma oportunidade de corrigir este problema. Se o controlador do host não estivesse no modo ADMIN-ONLY, isso seria uma falha de inicialização fatal.";
    }
    @Override
    protected String deploymentRestartDetected$str() {
        return "WFLYSRV0070: Foi detectado o reinício da implantação para a implantação %1$s, executando a reimplantação completa.";
    }
    @Override
    protected String fdTooLow$str() {
        return "WFLYSRV0071: O sistema operacional tem um número limitado de arquivos abertos para %1$d para este processo; um valor mínimo de 4096 é recomendado";
    }
    @Override
    protected String argServerConfig$str() {
        return "O nome do arquivo de configuração do servidor para uso (o default é \"standalone.xml\") (mesmo ao -c)";
    }
    @Override
    protected String argShortServerConfig$str() {
        return "O nome do arquivo de configuração para uso (o default é \"standalone.xml\") (O mesmo ao do --server-config)";
    }
    @Override
    protected String argReadOnlyServerConfig$str() {
        return "O nome do arquivo de configuração do servidor para uso. Isto difere-se do '--server-config' e '-c' no arquivo inicial nunca é sobrescrito.";
    }
    @Override
    protected String argHelp$str() {
        return "Display esta mensagem e sai";
    }
    @Override
    protected String argProperties$str() {
        return "Carrega as propriedades a partir do url gerado";
    }
    @Override
    protected String argSecurityProperty$str() {
        return "Determina a propriedade de segurança";
    }
    @Override
    protected String argSystem$str() {
        return "Determina a propriedade do sistema";
    }
    @Override
    protected String argVersion$str() {
        return "Imprime a versão e encerra";
    }
    @Override
    protected String argPublicBindAddress$str() {
        return "Determina o jboss.bind.address da propriedade do sistema ao valor gerado";
    }
    @Override
    protected String argInterfaceBindAddress$str() {
        return "Determinar o jboss.bind.address.<interface> da propriedade do sistema para valor gerado";
    }
    @Override
    protected String argDefaultMulticastAddress$str() {
        return "Determina o jboss.default.multicast.address da propriedade do sistema ao valor gerado";
    }
    @Override
    protected String argAdminOnly$str() {
        return "Determina o tipo de execução do servidor para ADMIN_ONLY levando-o a abrir as interfaces administrativas e aceitar as solicitações de gerenciamento. No entanto, ele não inicia outros serviços de tempo de execução nem aceita as solicitações do usuário final. Não pode ser usado com --start-mode. Preterido; use --start-mode=admin-only no lugar.";
    }
    @Override
    protected String argDebugPort$str() {
        return "Ativa o modo de depuração com um argumento opcional para especificar a porta. Funciona apenas caso o script de inicialização suportar isto.";
    }
    @Override
    protected String argSecMgr$str() {
        return "Executa o servidor com o gerenciador de segurança instalado.";
    }
    @Override
    protected String argStartMode$str() {
        return "Determina o modo de início do servidor, pode ser ou 'normal', 'admin-only' ou 'suspend'. Se definido para 'suspend' o servidor iniciará em modo suspenso e não atenderá solicitações até que seja retornado. Caso for iniciado em modo 'admin-only' o servidor abrirá somente interfaces administrativas e aceita solicitações de gerenciamento porém não inicia outros serviços de runtime ou aceita solicitações de usuários finais. Não pode ser utilizado juntamente com --admin-only.";
    }
    @Override
    protected String argGracefulStartup$str() {
        return "Inicie o servidor normalmente, colocando em fila ou rejeitando corretamente as solicitações até que o servidor seja totalmente iniciado";
    }
    @Override
    protected String argGitRepo$str() {
        return "O Repositório Git a ser clonado para obter a configuração do servidor.";
    }
    @Override
    protected String argGitBranch$str() {
        return "A ramificação do Git a ser usada para obter a configuração do servidor. O padrão é \"mestre\"";
    }
    @Override
    protected String argGitAuth$str() {
        return "O arquivo de configuração do elytron para gerenciar credenciais do Git. O padrão é 'nulo'";
    }
    @Override
    protected String argStability$str() {
        return "Executa o servidor usando um nível de estabilidade específico. Valores possíveis: %1$s, Padrão = %2$s";
    }
    @Override
    protected String valueExpectedForCommandLineOption$str() {
        return "WFLYSRV0072: Valor esperado para a opção %1$s";
    }
    @Override
    protected String invalidCommandLineOption$str() {
        return "WFLYSRV0073: Opção '%1$s' inválida";
    }
    @Override
    protected String malformedCommandLineURL$str() {
        return "WFLYSRV0074: URL '%1$s' malformado fornecido para a opção '%2$s'";
    }
    @Override
    protected String unableToLoadProperties$str() {
        return "WFLYSRV0075: Não foi possível carregar as propriedades a partir da URL '%1$s'";
    }
    @Override
    protected String hostControllerNameNonNullInStandalone$str() {
        return "WFLYSRV0079: O hostControllerName deve ser nulo caso o serviço não esteja num domain controller";
    }
    @Override
    protected String hostControllerNameNullInDomain$str() {
        return "WFLYSRV0080: O hostControllerName pode não ser nulo caso o servidor esteja num domain controller";
    }
    @Override
    protected String cannotResolveInterface$str() {
        return "WFLYSRV0081: O endereço IP não pode ser resolvido usando o critério de seleção da interface. A falha era -- %1$s";
    }
    @Override
    protected String failedToResolveInterface$str() {
        return "WFLYSRV0082: Falha ao resolver a interface %1$s";
    }
    @Override
    protected String failedToStartHttpManagementService$str() {
        return "WFLYSRV0083: Falha ao iniciar o serviço http-interface";
    }
    @Override
    protected String noSuchDeploymentContent$str() {
        return "WFLYSRV0084: Nenhum conteúdo da implantação com hash %1$s disponível no repositório de conteúdo da implantação.";
    }
    @Override
    protected String noSuchDeployment$str() {
        return "WFLYSRV0085: Não foi encontrada nenhuma implantação com o nome %1$s";
    }
    @Override
    protected String cannotReplaceDeployment$str() {
        return "WFLYSRV0086: Não foi possível usar %1$s com o mesmo valor para parâmetros %2$s e %3$s. Use %4$s para reimplantar o mesmo conteúdo ou %5$s para substituir o conteúdo com uma nova versão de mesmo nome.";
    }
    @Override
    protected String deploymentAlreadyStarted$str() {
        return "WFLYSRV0087: A implantação %1$s já foi inicializada";
    }
    @Override
    protected String missingHomeDirConfiguration$str() {
        return "WFLYSRV0088: Falta o valor da configuração para: %1$s";
    }
    @Override
    protected String caughtIOExceptionUploadingContent$str() {
        return "WFLYSRV0093: Foi vista uma IOException de leitura atualizando o conteúdo da implantação";
    }
    @Override
    protected String nullStreamAttachment$str() {
        return "WFLYSRV0094: Fluxo nulo no índice [%1$d]";
    }
    @Override
    protected String invalidDeploymentURL$str() {
        return "WFLYSRV0095: %1$s não é um URL válido";
    }
    @Override
    protected String problemOpeningStreamFromDeploymentURL$str() {
        return "WFLYSRV0096: Ocorreu um erro ao obter o fluxo de entrada do URL '%1$s'";
    }
    @Override
    protected String serviceModuleLoaderAlreadyStarted$str() {
        return "WFLYSRV0097: O ServiceModuleLoader já foi instalado";
    }
    @Override
    protected String serviceModuleLoaderAlreadyStopped$str() {
        return "WFLYSRV0098: O ServiceModuleLoader jã foi encerrado";
    }
    @Override
    protected String missingModulePrefix$str() {
        return "WFLYSRV0099: O '%1$s' não pode ser carregado a partir de um uma vez que o nome não inicia com '%2$s'";
    }
    @Override
    protected String failedToReadVirtualFile$str() {
        return "WFLYSRV0100: Falha na leitura do '%1$s'";
    }
    @Override
    protected String deploymentRootRequired$str() {
        return "WFLYSRV0101: O root de implantação não é requerido";
    }
    @Override
    protected String subdeploymentsRequireParent$str() {
        return "WFLYSRV0102: As sub-implantação requerem uma unidade de implantação pai";
    }
    @Override
    protected String noModuleIdentifier$str() {
        return "WFLYSRV0103: Nenhum identificador de módulo anexado à implantação '%1$s'";
    }
    @Override
    protected String failedToCreateVFSResourceLoader$str() {
        return "WFLYSRV0104: Falha ao criar o VFSResourceLoader para o root [%1$s]";
    }
    @Override
    protected String failedToGetFileFromRemoteRepository$str() {
        return "WFLYSRV0105: Falha ao obter o arquivo a partir do repositório remoto";
    }
    @Override
    protected String cannotCreateLocalDirectory$str() {
        return "WFLYSRV0106: Não foi possível criar um diretório local: %1$s";
    }
    @Override
    protected String didNotReadEntireFile$str() {
        return "WFLYSRV0107: Não foi possível ler o arquivo inteiro. Falta: %1$d";
    }
    @Override
    protected String noArgValue$str() {
        return "WFLYSRV0108: Nenhum valor foi fornecido para o argumento %1$s%n";
    }
    @Override
    protected String couldNotFindHcFileRepositoryConnection$str() {
        return "WFLYSRV0109: Não foi possível encontrar a conexão do repositório para o controlador do host.";
    }
    @Override
    protected String unknownMountType$str() {
        return "WFLYSRV0112: Tipo de montagem desconhecida %1$s";
    }
    @Override
    protected String failedCreatingTempProvider$str() {
        return "WFLYSRV0113: Falha ao criar o provedor do arquivo temporário";
    }
    @Override
    protected String systemPropertyNotManageable$str() {
        return "WFLYSRV0115: A propriedade do sistema %1$s não pode ser definida com o arquivo de configuração xml ou de um cliente de gerenciamento. Seu valor deve ser conhecido no início do processo, por isso só pode ser definido a partir da linha de comando";
    }
    @Override
    protected String systemPropertyCannotOverrideServerName$str() {
        return "WFLYSRV0116: O %1$s da propriedade de sistema não pode ser determinado depois que o nome do servidor tiver sido configurado através do arquivo de configuração xml ou a partir do cliente de gerenciamento";
    }
    @Override
    protected String unableToInitialiseSSLContext$str() {
        return "WFLYSRV0117: Não foi possível inicializar o SSLContext básico '%1$s'";
    }
    @Override
    protected String homeDirectoryDoesNotExist$str() {
        return "WFLYSRV0119: O diretório principal não existe: %1$s";
    }
    @Override
    protected String configDirectoryDoesNotExist$str() {
        return "WFLYSRV0121: O diretório de configuração não existe: %1$s";
    }
    @Override
    protected String serverBaseDirectoryDoesNotExist$str() {
        return "WFLYSRV0122: O diretório base do servidor não existe: %1$s";
    }
    @Override
    protected String serverDataDirectoryIsNotDirectory$str() {
        return "WFLYSRV0123: O diretório de dados do servidor não é um diretório: %1$s";
    }
    @Override
    protected String couldNotCreateServerDataDirectory$str() {
        return "WFLYSRV0124: Não foi possível criar um diretório de dados do servidor: %1$s";
    }
    @Override
    protected String serverContentDirectoryIsNotDirectory$str() {
        return "WFLYSRV0125: O diretório do conteúdo do servidor não é um diretório: %1$s";
    }
    @Override
    protected String couldNotCreateServerContentDirectory$str() {
        return "WFLYSRV0126: Não foi possível criar o diretório do conteúdo do servidor: %1$s";
    }
    @Override
    protected String logDirectoryIsNotADirectory$str() {
        return "WFLYSRV0127: O diretório de registro de log não é um diretório: %1$s";
    }
    @Override
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYSRV0128: Não foi possível criar um diretório de registro de log: %1$s";
    }
    @Override
    protected String serverTempDirectoryIsNotADirectory$str() {
        return "WFLYSRV0129: O diretório temporário do servidor não existe: %1$s";
    }
    @Override
    protected String couldNotCreateServerTempDirectory$str() {
        return "WFLYSRV0130: Não foi possível criar o diretório temporário do servidor: %1$s";
    }
    @Override
    protected String controllerTempDirectoryIsNotADirectory$str() {
        return "WFLYSRV0131: O diretório temporário do controlador não existe: %1$s";
    }
    @Override
    protected String couldNotCreateControllerTempDirectory$str() {
        return "WFLYSRV0132: Não foi possível criar o diretório temporário do servidor: %1$s";
    }
    @Override
    protected String domainBaseDirDoesNotExist$str() {
        return "WFLYSRV0133: O diretório base do domínio não existe: %1$s";
    }
    @Override
    protected String domainConfigDirDoesNotExist$str() {
        return "WFLYSRV0134: O diretório de configuração do domínio não existe: %1$s";
    }
    @Override
    protected String serverBaseDirectoryIsNotADirectory$str() {
        return "WFLYSRV0135: O diretório base do servidor não é um diretório: %1$s";
    }
    @Override
    protected String couldNotCreateServerBaseDirectory$str() {
        return "WFLYSRV0136: Não foi possível criar um diretório base do servidor: %1$s";
    }
    @Override
    protected String noSuchDeploymentContentAtBoot$str() {
        return "WFLYSRV0137: Nenhum conteúdo de implantação com hash %1$s disponível no repositório do conteúdo de implantação para a implantação '%2$s'. Esse é um erro de inicialização fatal. Para corrigir esse problema, reinicie com a opção de configuração --admin-only e use a CLI para instalar o resto do conteúdo que falta, ou remova-o da configuração. Como alternativa, remova a implantação do arquivo de configuração xml e reinicie a máquina.";
    }
    @Override
    protected String configuredSystemPropertiesLabel$str() {
        return "Propriedades de sistema configurado:";
    }
    @Override
    protected String vmArgumentsLabel$str() {
        return "Argumentos da VM: %1$s";
    }
    @Override
    protected String configuredSystemEnvironmentLabel$str() {
        return "Ambiente de sistema configurado:";
    }
    @Override
    protected String vfsNotAvailable$str() {
        return "WFLYSRV0138: O VFS não está disponível no carregador de módulo configurado";
    }
    @Override
    protected String serverControllerServiceRemoved$str() {
        return "WFLYSRV0139: O serviço do controlador do serviço foi removido";
    }
    @Override
    protected String rootServiceRemoved$str() {
        return "WFLYSRV0140: O serviço root foi removido";
    }
    @Override
    protected String cannotStartServer$str() {
        return "WFLYSRV0141: Não foi possível iniciar o servidor";
    }
    @Override
    protected String embeddedServerDirectoryNotFound$str() {
        return "WFLYSRV0143: Não existe nenhum diretório chamado '%1$s' em '%2$s'";
    }
    @Override
    protected String propertySpecifiedFileDoesNotExist$str() {
        return "WFLYSRV0144: -D%1$s=%2$s não existe";
    }
    @Override
    protected String propertySpecifiedFileIsNotADirectory$str() {
        return "WFLYSRV0145: -D%1$s=%2$s não é um diretório";
    }
    @Override
    protected String errorCopyingFile$str() {
        return "WFLYSRV0146: Erro ao copiar '%1$s' para '%2$s'";
    }
    @Override
    protected String invalidObject$str() {
        return "WFLYSRV0147: %1$s é nulo";
    }
    @Override
    protected String invalidPortOffset$str() {
        return "WFLYSRV0148: O portOffset está fora de área";
    }
    @Override
    protected String invalidStreamIndex$str() {
        return "WFLYSRV0149: Valor '%1$s' inválido: %2$d, o índice máximo é %3$d";
    }
    @Override
    protected String invalidStreamURL$str() {
        return "WFLYSRV0150: Não foi possível criar um fluxo de entrada a partir da URL '%1$s'";
    }
    @Override
    protected String invalidStreamBytes$str() {
        return "WFLYSRV0151: Não há bytes disponíveis no parâmetro %1$s";
    }
    @Override
    protected String multipleContentItemsNotSupported$str() {
        return "WFLYSRV0152: Apenas 1 pedaço de conteúdo suportado no momento (AS7-431)";
    }
    @Override
    protected String deploymentPhaseFailed$str() {
        return "WFLYSRV0153: Falha ao processar a fase %1$s de %2$s";
    }
    @Override
    protected String deploymentIndexingFailed$str() {
        return "WFLYSRV0156: Falha ao adicionar o root da implantação para as anotações";
    }
    @Override
    protected String failedToInstantiateClassTransformer$str() {
        return "WFLYSRV0158: Falha ao instanciar um %1$s";
    }
    @Override
    protected String noDeploymentRepositoryAvailable$str() {
        return "WFLYSRV0159: Nenhum repositório de implantação disponível.";
    }
    @Override
    protected String deploymentMountFailed$str() {
        return "WFLYSRV0160: Falha ao montar o conteúdo de implantação";
    }
    @Override
    protected String failedToGetManifest$str() {
        return "WFLYSRV0161: Falha ao obter o manifesto para a implantação %1$s";
    }
    @Override
    protected String cannotMergeResourceRoot$str() {
        return "WFLYSRV0163: Não foi possível mesclar o root do recurso para um arquivo diferente. Este %1$s, incorporado: %2$s";
    }
    @Override
    protected String failedToCreateTempFileProvider$str() {
        return "WFLYSRV0164: Falha ao criar o provedor do arquivo temporário";
    }
    @Override
    protected String resourceTooLarge$str() {
        return "WFLYSRV0165: O recurso é muito grande para estar disponível num arquivo de classe válido";
    }
    @Override
    protected String subdeploymentNotFound$str() {
        return "WFLYSRV0166: Subimplantação %1$s no jboss-deployment-structure.xml não foi encontrada. Disponível nas subimplantações: %2$s";
    }
    @Override
    protected String deploymentStructureFileNotFound$str() {
        return "WFLYSRV0167: Nenhum arquivo jboss-deployment-structure.xml encontrado em %1$s";
    }
    @Override
    protected String errorLoadingDeploymentStructureFile$str() {
        return "WFLYSRV0168: Ocorreu um erro no carregamento do jboss-deployment-structure.xml a partir de %1$s";
    }
    @Override
    protected String duplicateSubdeploymentListing$str() {
        return "WFLYSRV0169: A subimplantação '%1$s' está listada duas vezes no jboss-deployment-structure.xml";
    }
    @Override
    protected String invalidModuleName$str() {
        return "WFLYSRV0170: O nome do módulo adicional '%1$s' não é válido. Os nomes devem começar com 'deployment'.";
    }
    @Override
    protected String externalResourceRootsNotSupported$str() {
        return "WFLYSRV0171: Os roots do recurso externo não são suportados. Os roots do recurso talvez não estejam iniciando com '/': %1$s";
    }
    @Override
    protected String unexpectedEndOfDocument$str() {
        return "WFLYSRV0172: Final de documento inesperado";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYSRV0173: Falta um ou mais atributos:%1$s";
    }
    @Override
    protected String unexpectedContent$str() {
        return "WFLYSRV0174: Conteúdo inesperado do tipo '%1$s'; o nome é '%2$s', o texto é: '%3$s'";
    }
    @Override
    protected String noMethodFound$str() {
        return "WFLYSRV0175: Não foi encontrado nenhum método com a ID: %1$s na classe (ou sua própria classe super) %2$s";
    }
    @Override
    protected String errorGettingReflectiveInformation$str() {
        return "WFLYSRV0177: Ocorreu um erro ao obter a informação reflexiva para o %1$s com o ClassLoader %2$s";
    }
    @Override
    protected String externalModuleServiceAlreadyStarted$str() {
        return "WFLYSRV0178: O Serviço do Módulo Externo já foi iniciado";
    }
    @Override
    protected String failedToLoadModule$str() {
        return "WFLYSRV0179: Falha ao carregar o módulo: %1$s";
    }
    @Override
    protected String failedToResolveMulticastAddress$str() {
        return "WFLYSRV0187: Falha ao obter o endereço multicast para %1$s";
    }
    @Override
    protected String failedToResolveMulticastAddressForRollback$str() {
        return "WFLYSRV0188: Falha ao obter o endereço multicast para %1$s";
    }
    @Override
    protected String cannotAddMoreThanOneSocketBindingGroupForServerOrHost$str() {
        return "WFLYSRV0190: Não foi possível adicionar mais que um soquete ao grupo socket binding. Houve a tentativa de adição de '%1$s', mas '%2$s' já existe";
    }
    @Override
    protected String cannotHaveBothInitialServerConfigAndServerConfig$str() {
        return "WFLYSRV0191: Não foi possível usar ambos --server-config e --initial-server-config";
    }
    @Override
    protected String duplicateJBossXmlNamespace$str() {
        return "WFLYSRV0192: O namespace duplicado %1$s no jboss-all.xml";
    }
    @Override
    protected String equivalentNamespacesInJBossXml$str() {
        return "WFLYSRV0193: Duas versões diferentes dos mesmos namespaces estão presentes no boss-all.xml, %1$s e %2$s estão ambos presentes";
    }
    @Override
    protected String errorLoadingJBossXmlFile$str() {
        return "WFLYSRV0194: Erro ao carregar o jboss-all.xml a partir do %1$s";
    }
    @Override
    protected String nullModuleAttachment$str() {
        return "WFLYSRV0195: Não foi possível obter o módulo necessário para: %1$s";
    }
    @Override
    protected String deploymentOverlayFailed$str() {
        return "WFLYSRV0196: Falha ao obter o conteúdo para a sobreposição da implantação %1$s em %2$s";
    }
    @Override
    protected String noSuchDeploymentOverlayContentAtBoot$str() {
        return "WFLYSRV0198: Nenhum conteúdo de sobreposição da implantação com hash %1$s disponível no repositório do conteúdo de implantação para sobreposição da implantação '%2$s' no local '%3$s'. Esse é um erro de inicialização fatal. Para corrigir esse problema, reinicie com a opção de configuração --admin-only e use a CLI para instalar o resto do conteúdo que falta, ou remova-o da configuração. Com alternativa, remova a sobreposição da implantação do arquivo de configuração xml e reinicie a máquina.";
    }
    @Override
    protected String noSuchDeploymentOverlayContent$str() {
        return "WFLYSRV0199: Nenhum conteúdo de sobreposição da implantação com hash %1$s disponível no repositório do conteúdo da implantação.";
    }
    @Override
    protected String failedToLoadFile$str() {
        return "WFLYSRV0200: Falha ao ler o arquivo %1$s";
    }
    @Override
    protected String cannotHaveMoreThanOneManagedContentItem$str() {
        return "WFLYSRV0201: Não é possível ter mais de um %1$s";
    }
    @Override
    protected String unknownContentItemKey$str() {
        return "WFLYSRV0202: Chave de item de conteúdo desconhecida: %1$s";
    }
    @Override
    protected String cannotMixUnmanagedAndManagedContentItems$str() {
        return "WFLYSRV0203: Não é possível usar %1$s quando %2$s for usado";
    }
    @Override
    protected String nullParameter$str() {
        return "WFLYSRV0204: '%1$s' nulo";
    }
    @Override
    protected String runtimeNameMustBeUnique$str() {
        return "WFLYSRV0205: Já existe uma implantação chamada %1$s com o mesmo nome de tempo de execução %2$s";
    }
    @Override
    protected String duplicateDeploymentUnitProcessor$str() {
        return "WFLYSRV0206: Vários processadores da unidade de implantação múltipla registrados com prioridade %1$s e classe %2$s";
    }
    @Override
    protected String startingSubDeployment$str() {
        return "WFLYSRV0207: Iniciando a subimplantação (runtime-name: \"%1$s\")";
    }
    @Override
    protected String stoppedSubDeployment$str() {
        return "WFLYSRV0208: Interrompendo a subimplantação (runtime-name: %1$s) em %2$dms";
    }
    @Override
    protected String vaultModuleWithNoCode$str() {
        return "WFLYSRV0209: Quando especificando um 'module' você precisará especificar também o 'code'";
    }
    @Override
    protected String serverAlreadyPaused$str() {
        return "WFLYSRV0210: Servidor já está em pausa";
    }
    @Override
    protected String suspendingServer1$str() {
        return "WFLYSRV0211: Suspendendo servidor com tempo limite de %1$d ms.";
    }
    @Override
    protected String resumingServer$str() {
        return "WFLYSRV0212: Retomando servidor";
    }
    @Override
    protected String failedToConnectToHostController$str() {
        return "WFLYSRV0213: Falha ao conectar ao host-controller, tentando novamente.";
    }
    @Override
    protected String failedToResume$str() {
        return "WFLYSRV0215: Falha ao retomar a atividade %1$s. Para retomar a operação normal é recomendável que você reinicie o servidor.";
    }
    @Override
    protected String failedToCleanObsoleteContent$str() {
        return "WFLYSRV0216: Erro ao limpar o conteúdo obsoleto %1$s ";
    }
    @Override
    protected String undeployingDeploymentHasBeenRedeployed$str() {
        return "WFLYSRV0219: A implantação %1$s foi reimplantada, e seu conteúdo será removido. Você precisará reiniciá-la.";
    }
    @Override
    protected String shutdownHookInvoked$str() {
        return "WFLYSRV0220: Foi solicitado o desligamento do servidor através de um sinal de OS";
    }
    @Override
    protected String deprecatedApiUsed$str() {
        return "WFLYSRV0221: A implantação \"%1$s\" está usando o módulo obsoleto (\"%2$s\") que pode ser removido em versões futuras sem aviso.";
    }
    @Override
    protected String illegalPermissionName$str() {
        return "WFLYSRV0222: Nome de permissão '%1$s' ilegal";
    }
    @Override
    protected String illegalPermissionActions$str() {
        return "WFLYSRV0223: Ações de permissão '%1$s' ilegais";
    }
    @Override
    protected String couldNotMountOverlay$str() {
        return "WFLYSRV0224: Não foi possível montar a sobreposição %1$s, pois o pai %2$s não é um diretório";
    }
    @Override
    protected String vaultNotInitializedException$str() {
        return "WFLYSRV0230: O vault não foi inicializado. Não foi possível resolver as expressões vault";
    }
    @Override
    protected String couldNotObtainServerUuidFile$str() {
        return "WFLYSRV0231: Não foi possível ler ou criar a UUID do servidor no arquivo: %1$s";
    }
    @Override
    protected String couldNotGetModuleInfo$str() {
        return "WFLYSRV0232: Não foi possível obter o módulo de informação para o nome de módulo: %1$s";
    }
    @Override
    protected String deploymentUndeployedNotification$str() {
        return "WFLYSRV0233: \"%1$s\" teve sua implantação cancelada (runtime-name: \"%2$s\")";
    }
    @Override
    protected String deploymentDeployedNotification$str() {
        return "WFLYSRV0234: \"%1$s\" foi implantado (runtime-name: \"%2$s\")";
    }
    @Override
    protected String securityManagerEnabled$str() {
        return "WFLYSRV0235: O gerenciador de segurança está ativado";
    }
    @Override
    protected String suspendingServerWithNoTimeout$str() {
        return "WFLYSRV0236: Servidor suspendido sem tempo de espera.";
    }
    @Override
    protected String cannotBothHaveFalseUseCurrentConfigAndServerConfig$str() {
        return "WFLYSRV0237: Não é possível utilizar use-current-server-config=false enquanto especifica-se um server-config";
    }
    @Override
    protected String serverConfigForReloadNotFound$str() {
        return "WFLYSRV0238: server-config '%1$s' especificado para recarregar não foi encontrado";
    }
    @Override
    protected String aborting$str() {
        return "WFLYSRV0239: Anulando com o código de saída %1$d";
    }
    @Override
    protected String shuttingDownInResponseToProcessControllerSignal$str() {
        return "WFLYSRV0240: ProcessController sinalizou para desligar; desligando";
    }
    @Override
    protected String shuttingDownInResponseToManagementRequest$str() {
        return "WFLYSRV0241: Desligando em resposta à operação de gerenciamento '%1$s'";
    }
    @Override
    protected String cannotExplodeDeploymentOfSelfContainedServer$str() {
        return "WFLYSRV0242: Não é possível expandir uma implementação em um servidor autônomo";
    }
    @Override
    protected String cannotExplodeUnmanagedDeployment$str() {
        return "WFLYSRV0243: Não foi possível expandir uma implantação não gerenciada";
    }
    @Override
    protected String cannotExplodeAlreadyExplodedDeployment$str() {
        return "WFLYSRV0244: Não foi possível expandir uma implantação já expandida";
    }
    @Override
    protected String cannotExplodeEnabledDeployment$str() {
        return "WFLYSRV0245: Não foi possível expandir uma implantação já implementada";
    }
    @Override
    protected String cannotAddContentToSelfContainedServer$str() {
        return "WFLYSRV0246: Não foi possível adicionar conteúdo a uma implementação em um servidor autônomo";
    }
    @Override
    protected String cannotAddContentToUnmanagedDeployment$str() {
        return "WFLYSRV0247: Não é possível adicionar conteúdo a uma implantação não gerenciada";
    }
    @Override
    protected String cannotAddContentToUnexplodedDeployment$str() {
        return "WFLYSRV0248: Não é possível adicionar conteúdo a uma implantação não expandida";
    }
    @Override
    protected String couldNotCopyFiles$str() {
        return "WFLYSRV0249: Não foi possível copiar os arquivos do repositório de conteúdo gerenciado para a implantação em execução para %1$s";
    }
    @Override
    protected String cannotRemoveContentFromSelfContainedServer$str() {
        return "WFLYSRV0250: Não foi possível remover conteúdo de uma implementação em um servidor autônomo";
    }
    @Override
    protected String cannotRemoveContentFromUnmanagedDeployment$str() {
        return "WFLYSRV0251: Não é possível remover conteúdo de uma implantação não gerenciada";
    }
    @Override
    protected String cannotRemoveContentFromUnexplodedDeployment$str() {
        return "WFLYSRV0252: Não é possível remover conteúdo de uma implantação não expandida";
    }
    @Override
    protected String couldNotDeleteFile$str() {
        return "WFLYSRV0253: Não foi possível excluir o arquivo %1$s da implantação em execução %2$s";
    }
    @Override
    protected String cannotReadContentFromSelfContainedServer$str() {
        return "WFLYSRV0254: Não foi possível ler o conteúdo de uma implementação em um servidor autônomo";
    }
    @Override
    protected String cannotReadContentFromUnmanagedDeployment$str() {
        return "WFLYSRV0255: Não é possível ler o conteúdo de uma implantação não gerenciada";
    }
    @Override
    protected String requiredSystemPropertyMissing$str() {
        return "WFLYSRV0257: Propriedade de sistema obrigatória '%1$s' não definida";
    }
    @Override
    protected String cannotExplodeSubDeploymentOfUnexplodedDeployment$str() {
        return "WFLYSRV0258: Não é possível expandir uma subimplantação de uma implantação não expandida";
    }
    @Override
    protected String secureSocketBindingRequiresSSLContext$str() {
        return "WFLYSRV0259: Se o atributo secure-socket-binding for definido, o ssl-context também deve ser definido";
    }
    @Override
    protected String startingServerSuspended$str() {
        return "WFLYSRV0260: A inicialização do servidor está em modo suspenso";
    }
    @Override
    protected String bootComplete$str() {
        return "WFLYSRV0261: Inicialização concluída";
    }
    @Override
    protected String cannotSetBothAdminOnlyAndStartMode$str() {
        return "WFLYSRV0262: Não é possível definir --start-mode e --admin-only";
    }
    @Override
    protected String unknownStartMode$str() {
        return "WFLYSRV0263: Modo de inicialização %1$s desconhecido";
    }
    @Override
    protected String cannotSpecifyBothAdminOnlyAndStartMode$str() {
        return "WFLYSRV0264: Não é possível especificar admin-only e start-mode";
    }
    @Override
    protected String invalidPoolSize$str() {
        return "WFLYSRV0265: Valor '%1$s' inválido para a propriedade de sistema '%2$s' -- o valor deve ser um número inteiro não negativo";
    }
    @Override
    protected String archiveMountFailed$str() {
        return "WFLYSRV0267: Não foi possível montar a raiz do recurso '%1$s'. É realmente um arquivo?";
    }
    @Override
    protected String failedToPullRepository$str() {
        return "WFLYSRV0268: Falha ao extrair o repositório %1$s";
    }
    @Override
    protected String failedToInitRepository$str() {
        return "WFLYSRV0269: Falha ao inicializar o repositório %1$s";
    }
    @Override
    protected String failedToPublishConfiguration$str() {
        return "WFLYSRV0270: Falha ao publicar configuração em %1$s";
    }
    @Override
    protected String errorUsingGit$str() {
        return "WFLYSRV0271: Erro de Git: %1$s";
    }
    @Override
    protected String suspendingServer0$str() {
        return "WFLYSRV0272: Servidor suspenso";
    }
    @Override
    protected String excludedSubSystemsNotExist$str() {
        return "WFLYSRV0273: O subsistema %1$s excluído do jboss-deployment-structure.xml não existe.";
    }
    @Override
    protected String excludedDependenciesNotExist$str() {
        return "WFLYSRV0274: A dependência %1$s excluída do jboss-deployment-structure.xml não existe.";
    }
    @Override
    protected String maximumNumberOfJarResources$str() {
        return "WFLYSRV0275: Número máximo de recursos jar permitidos atingido para o nome do módulo do diretório global '%1$s'. O máximo permitido são %2$d arquivos";
    }
    @Override
    protected String errorOpeningZipFile$str() {
        return "WFLYSRV0276: Há um erro na abertura do arquivo zip %1$s";
    }
    @Override
    protected String failedToLoadSSHCredentials$str() {
        return "WFLYSRV0277: Falha no carregamento das credenciais SSH %1$s";
    }
    @Override
    protected String usingGit$str() {
        return "WFLYSRV0278: O histórico de configuração é gerenciado por meio do Git";
    }
    @Override
    protected String gitRespositoryInitialized$str() {
        return "WFLYSRV0279: Git inicializado em %1$s";
    }
    @Override
    protected String unableToInitialiseGitRepository$str() {
        return "WFLYSRV0280: Não é possível inicializar o repositório Git.";
    }
    @Override
    protected String wildflyConfigUrlIsSet$str() {
        return "WFLYSRV0281: A propriedade do sistema %1$s está definida. Ela deve ser usada somente para clientes autônomos. Configurá-la no servidor substituirá a configuração do seu perfil.";
    }
    @Override
    protected String startingNonGraceful$str() {
        return "WFLYSRV0282: O servidor está iniciando com a inicialização normal desativada; as solicitações externas podem receber respostas de falha até que a inicialização seja concluída.";
    }
    @Override
    protected String disregardingNonGraceful$str() {
        return "WFLYSRV0283: Foi solicitada uma inicialização não normal em conjunto com uma inicialização suspensa. O servidor iniciará suspenso.";
    }
    @Override
    protected String vaultSupportRemoved$str() {
        return "WFLYSRV0285: O suporte do cofre foi removido, nenhum recurso do cofre será inicializado.";
    }
    @Override
    protected String staticModuleIndexingFailed$str() {
        return "WFLYSRV0286: Falha no módulo estático de indexação %1$s para anotações";
    }
    @Override
    protected String securityRealmReferencesUnsupported$str() {
        return "WFLYSRV0287: Os reinos de segurança não são mais compatíveis, migre as referências para eles da configuração.";
    }
    @Override
    protected String unableToCreateTempDirForAuthTokensFileExists$str() {
        return "WFLYSRV0288: Não foi possível criar um diretório tmp para tokens de autorização uma vez que o arquivo já existe.";
    }
    @Override
    protected String unableToCreateAuthDir$str() {
        return "WFLYSRV0289: Não foi possível criar um diretório de autorização %1$s.";
    }
    @Override
    protected String unableToFindYaml$str() {
        return "WFLYSRV0290: Não foi possível encontrar o arquivo YAML especificado %1$s";
    }
    @Override
    protected String throwableIsNull$str() {
        return "WFLYSRV0291: A causa do erro é desconhecida neste thread. Verifique outras mensagens de registro e o chamador para saber a possível causa.";
    }
    @Override
    protected String requiredServiceNotUp$str() {
        return "WFLYSRV0292: O serviço '%1$s' solicitado não está UP. No momento, ele está '%2$s'.";
    }
    @Override
    protected String aliasAddedAsDependency$str() {
        return "WFLYSRV0293: O alias do módulo '%1$s' foi adicionado como uma dependência à implantação do '%2$s' por %3$s. Embora isso seja permitido, é recomendável usar seu módulo de destino. Considere a possibilidade de substituir esse alias pelo módulo de destino '%4$s'.";
    }
    @Override
    protected String aliasAddedAsExclusion$str() {
        return "WFLYSRV0294: O alias do módulo '%1$s' foi excluído da implantação do '%2$s' por %3$s. Embora isso seja permitido, é recomendável usar seu módulo de destino. Considere a possibilidade de substituir esse alias pelo módulo de destino '%4$s'.";
    }
    @Override
    protected String noServerInstallationPrepared$str() {
        return "WFLYSRV0295: Nenhuma instalação do %1$s foi preparada.";
    }
    @Override
    protected String mechAuthenticationNotComplete$str() {
        return "WFLYSRV0296: A autenticação do mecanismo de autenticação ainda não foi concluída";
    }
    @Override
    protected String mechMessageAfterComplete$str() {
        return "WFLYSRV0297: A troca do mecanismo de autenticação recebeu uma mensagem depois que a autenticação já havia sido concluída";
    }
    @Override
    protected String mechMessageTooLong$str() {
        return "WFLYSRV0298: A mensagem do mecanismo de autenticação é muito longa";
    }
    @Override
    protected String mechServerSideAuthenticationFailed$str() {
        return "WFLYSRV0299: Falha na autenticação do lado do servidor do mecanismo de autenticação";
    }
    @Override
    protected String mechTokenNotVerified$str() {
        return "WFLYSRV0300: Token do mecanismo de autenticação não verificado";
    }
    @Override
    protected String mechAuthorizationFailed$str() {
        return "WFLYSRV0301: Falha na autorização do mecanismo de autenticação: \"%1$s\" em execução como \"%2$s\"";
    }
    @Override
    protected String mechNoSecurityLayer$str() {
        return "WFLYSRV0302: O mecanismo de autenticação não é compatível com a camada de segurança (encapsulamento/desencapsulamento)";
    }
    @Override
    protected String mechInvalidMessageReceived$str() {
        return "WFLYSRV0303: Mensagem de negociação de mecanismo de autenticação inválida recebida";
    }
    @Override
    protected String mechNoTokenGiven$str() {
        return "WFLYSRV0304: Nenhum token de mecanismo de autenticação foi fornecido";
    }
    @Override
    protected String mechMalformedFields$str() {
        return "WFLYSRV0305: Falha na autenticação do mecanismo de autenticação devido a um ou mais campos malformados";
    }
    @Override
    protected String mechCallbackHandlerFailedForUnknownReason$str() {
        return "WFLYSRV0306: O manipulador de retorno de chamada falhou por motivo desconhecido";
    }
    @Override
    protected String mechNoLoginNameGiven$str() {
        return "WFLYSRV0307: Nenhum nome de login de mecanismo de autenticação foi fornecido";
    }
    @Override
    protected String failedToParseEnumProperty$str() {
        return "WFLYSRV0308: Falha ao analisar a propriedade (%1$s), valor (%2$s) deve corresponder a um dos seguintes: %3$s";
    }
    @Override
    protected String unsupportedStability$str() {
        return "WFLYSRV0309: O nível de estabilidade %1$s não é compatível com %2$s";
    }
    @Override
    protected String processStateChangeNotificationDescription$str() {
        return "A notificação será enviada quando o estado do processo for alterado";
    }
    @Override
    protected String jmxAttributeChange$str() {
        return "O atributo '%1$s' foi alterado de '%2$s' para '%3$s'";
    }
    @Override
    protected String repositoryInitialized$str() {
        return "Repositório inicializado";
    }
    @Override
    protected String addingIgnored$str() {
        return "Adicionando .gitignore";
    }
    @Override
    protected String serverConfigFileInUse$str() {
        return "- Arquivo de configuração do servidor em uso: %1$s";
    }
    @Override
    protected String serverStabilityInUse$str() {
        return "- Nível mínimo de estabilidade do recurso: %1$s";
    }
    @Override
    protected String startedCleanMessage$str() {
        return "%1$s iniciado em %2$d ms - Iniciado %3$d de %4$d serviços (%5$d serviços são lentos, passivos ou sob demanda) %6$s";
    }
    @Override
    protected String startedWitErrorsMessage$str() {
        return "%1$s começou (com erros) em %2$d ms - começou %3$d de %4$d serviços (%5$d serviços com falha ou dependências ausentes, %6$d serviços são lentos, passivos ou sob demanda) %7$s";
    }
}
