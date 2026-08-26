package org.wildfly.extension.undertow.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:29+0200")
public class UndertowLogger_$logger_pt_BR extends UndertowLogger_$logger_pt implements UndertowLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public UndertowLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String couldNotInitJsp$str() {
        return "WFLYUT0001: Não foi possível inicializar Jakarta Server Pages";
    }
    @Override
    protected String serverStarting$str() {
        return "WFLYUT0003: Iniciando Undertow %1$s";
    }
    @Override
    protected String serverStopping$str() {
        return "WFLYUT0004: Interrompendo Undertow %1$s";
    }
    @Override
    protected String secureListenerNotAvailableForPort$str() {
        return "WFLYUT0005: Não foi encontrado um ouvinte seguro para o protocolo '%1$s'! Utilizando porta não segura!";
    }
    @Override
    protected String listenerStarted$str() {
        return "WFLYUT0006: Undertow%1$s ouvinte %2$s escutando em %3$s:%4$d";
    }
    @Override
    protected String listenerStopped$str() {
        return "WFLYUT0007: Undertow %1$s ouvinte %2$s interrompido, estava vinculado a %3$s:%4$d";
    }
    @Override
    protected String listenerSuspend$str() {
        return "WFLYUT0008: Undertow %1$s ouvinte %2$s está suspendendo";
    }
    @Override
    protected String cannotLoadDesignatedHandleTypes$str() {
        return "WFLYUT0009: Não foi possível carregar a classe designada pelo HandlesTypes [%1$s].";
    }
    @Override
    protected String couldNotLoadWebSocketEndpoint$str() {
        return "WFLYUT0010: Não foi possível carregar ponto de extremidade de socket %1$s";
    }
    @Override
    protected String couldNotLoadWebSocketConfig$str() {
        return "WFLYUT0011: Não foi possível carregar a configuração do aplicativo de socket de web %1$s. ";
    }
    @Override
    protected String startedServer$str() {
        return "WFLYUT0012: Servidor %1$s foi iniciado. ";
    }
    @Override
    protected String invalidRedirectURI$str() {
        return "WFLYUT0013: Não foi possível criar redireção URI. ";
    }
    @Override
    protected String creatingFileHandler$str() {
        return "WFLYUT0014: Criando identificador de arquivo para caminho de acesso '%1$s' com as opções [directory-listing: '%2$s', follow-symlink: '%3$s', case-sensitive: '%4$s', safe-symlink-paths: '%5$s']";
    }
    @Override
    protected String invalidAbsoluteOrdering$str() {
        return "WFLYUT0016: Não foi possível resolver o nome na ordem absoluta: %1$s";
    }
    @Override
    protected String couldNotDeleteTempFile$str() {
        return "WFLYUT0017: Não foi possível remover arquivo temporário servlet %1$s";
    }
    @Override
    protected String hostStarting$str() {
        return "WFLYUT0018: Iniciando host %1$s";
    }
    @Override
    protected String hostStopping$str() {
        return "WFLYUT0019: Interrompendo host %1$s";
    }
    @Override
    protected String clusteringNotSupported$str() {
        return "WFLYUT0020: O clustering não é suportado, retornando ao gerenciador da sessão sem-cluster";
    }
    @Override
    protected String registerWebapp$str() {
        return "WFLYUT0021: Contexto web registrado: '%1$s' para servidor '%2$s'";
    }
    @Override
    protected String unregisterWebapp$str() {
        return "WFLYUT0022: Contexto web não registrado:'%1$s' do servidor '%2$s' ";
    }
    @Override
    protected String skippedSCI$str() {
        return "WFLYUT0023: Ignorado SCI para o jar: %1$s.";
    }
    @Override
    protected String failedToPersistSessionAttribute$str() {
        return "WFLYUT0024: Falhou ao persistir atributo de sessão %1$s com valor %2$s para sessão %3$s";
    }
    @Override
    protected String failToParseXMLDescriptor3$str() {
        return "WFLYUT0027: Falha ao analisar o descritor XML %1$s no [%2$s,%3$s]";
    }
    @Override
    protected String failToParseXMLDescriptor1$str() {
        return "WFLYUT0028: Falha ao analisar o descritor XML %1$s";
    }
    @Override
    protected String invalidWebServletAnnotation$str() {
        return "WFLYUT0029: O @WebServlet é apenas permitido no nível da classe %1$s";
    }
    @Override
    protected String invalidWebInitParamAnnotation$str() {
        return "WFLYUT0030: O @WebInitParam requer o nome e o valor no %1$s";
    }
    @Override
    protected String invalidWebFilterAnnotation$str() {
        return "WFLYUT0031: O @WebFilter é apenas permitido no nível de classe %1$s";
    }
    @Override
    protected String invalidWebListenerAnnotation$str() {
        return "WFLYUT0032: O @WebListener é apenas permitido no nível de classe %1$s";
    }
    @Override
    protected String invalidRunAsAnnotation$str() {
        return "WFLYUT0033: O @RunAs precisa especificar um nome de função no %1$s";
    }
    @Override
    protected String invalidDeclareRolesAnnotation$str() {
        return "WFLYUT0034: O @DeclareRoles precisa especificar os nomes da função no %1$s";
    }
    @Override
    protected String invalidMultipartConfigAnnotation$str() {
        return "WFLYUT0035: O @MultipartConfig é apenas permitido no nível da classe %1$s";
    }
    @Override
    protected String invalidServletSecurityAnnotation$str() {
        return "WFLYUT0036: O @ServletSecurity é apenas permitido no nível da classe %1$s";
    }
    @Override
    protected String wrongComponentType$str() {
        return "WFLYUT0037: %1$s possui o tipo de componente errado, ele não pode ser usado como um componente da web";
    }
    @Override
    protected String tldFileNotContainedInRoot$str() {
        return "WFLYUT0038: Arquivo TLD %1$s não contido na raiz %2$s";
    }
    @Override
    protected String failedToResolveModule$str() {
        return "WFLYUT0039: Falha ao resolver o módulo para a implantação %1$s";
    }
    @Override
    protected String invalidMultipleOthers$str() {
        return "WFLYUT0040: Duplicação dos demais em ordem absoluta";
    }
    @Override
    protected String invalidRelativeOrdering0$str() {
        return "WFLYUT0041: Ordem relativa inválida";
    }
    @Override
    protected String invalidWebFragment$str() {
        return "WFLYUT0042: Ocorreu um conflito no processamento do fragmento da web no JAR: %1$s";
    }
    @Override
    protected String invalidRelativeOrdering1$str() {
        return "WFLYUT0043: Erro no processamento de ordem relativa com o JAR: %1$s";
    }
    @Override
    protected String invalidRelativeOrderingBeforeAndAfter$str() {
        return "WFLYUT0044: A ordenação inclui ambos os outros antes e depois no JAR: %1$s";
    }
    @Override
    protected String invalidRelativeOrderingDuplicateName$str() {
        return "WFLYUT0045: Nome duplicado declarado no JAR: %1$s";
    }
    @Override
    protected String invalidRelativeOrderingUnknownName$str() {
        return "WFLYUT0046: Nome desconhecido do fragmento da web no JAR: %1$s";
    }
    @Override
    protected String invalidRelativeOrderingConflict$str() {
        return "WFLYUT0047: Conflito na ordenação relativa com o JAR: %1$s";
    }
    @Override
    protected String failToProcessWebInfLib$str() {
        return "WFLYUT0048: Falha ao processar WEB-INF/lib: %1$s";
    }
    @Override
    protected String errorLoadingSCIFromModule$str() {
        return "WFLYUT0049: Erro ao carregar o SCI a partir do módulo: %1$s";
    }
    @Override
    protected String unableToResolveAnnotationIndex$str() {
        return "WFLYUT0050: Não foi possível resolver o índice da anotação para a unidade da implantação: %1$s";
    }
    @Override
    protected String errorProcessingSCI$str() {
        return "WFLYUT0051: Erro de implantação processando SCI para o jar: %1$s";
    }
    @Override
    protected String unknownMetric$str() {
        return "WFLYUT0054: Métrica desconhecida %1$s";
    }
    @Override
    protected String nullDefaultHost$str() {
        return "WFLYUT0055: O host default é nulo";
    }
    @Override
    protected String nullHostName$str() {
        return "WFLYUT0056: O nome do host é nulo";
    }
    @Override
    protected String invalidPersistentSessionDir$str() {
        return "WFLYUT0060: Diretório de sessões persistentes inválido %1$s";
    }
    @Override
    protected String failedToCreatePersistentSessionDir$str() {
        return "WFLYUT0061: Falha ao criar diretório de sessões persistentes %1$s";
    }
    @Override
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYUT0062: Não foi possível criar um diretório de registro de log: %1$s";
    }
    @Override
    protected String noPortListeningForProtocol$str() {
        return "WFLYUT0063: Não foi possível encontrar o número de porta de ouvinte para o protocolo %1$s";
    }
    @Override
    protected String failedToConfigureHandler$str() {
        return "WFLYUT0064: Falha ao configurar manipulador %1$s";
    }
    @Override
    protected String handlerWasNotAHandlerOrWrapper$str() {
        return "WFLYUT0065: Classe de identificador %1$s não era um identificador ou um invólucro.";
    }
    @Override
    protected String failedToConfigureHandlerClass$str() {
        return "WFLYUT0066: Falha ao configurar manipulador %1$s";
    }
    @Override
    protected String servletClassNotDefined$str() {
        return "WFLYUT0067: Classe de servlet não definida para servlet %1$s";
    }
    @Override
    protected String sharedSessionConfigNotInRootDeployment$str() {
        return "WFLYUT0069: Ignorando shared-session-config em jboss-all.xml na implementação %1$s. Esta entrada é válida somente em implementações de nível superior. ";
    }
    @Override
    protected String couldNotLoadHandlerFromModule$str() {
        return "WFLYUT0070: Não foi possível carregar identificador %1$s a partir do módulo %2$s";
    }
    @Override
    protected String alpnNotFound$str() {
        return "WFLYUT0071: Nenhum provedor ALPN encontrado, HTTP/2 não será habilitado . Para remover esta mensagem, defina enable-http2 para falso no ouvinte %1$s do subsystem Undertow . ";
    }
    @Override
    protected String couldNotFindExternalPath$str() {
        return "WFLYUT0072: Não foi possível encontrar caminho externo configurado %1$s";
    }
    @Override
    protected String advertiseSocketBindingRequiresMulticastAddress$str() {
        return "WFLYUT0073: mod_cluster anuncia que a associação de soquete requer que se estabeleça endereço multicast ";
    }
    @Override
    protected String tldNotFound$str() {
        return "WFLYUT0074: Não foi possível encontrar TLD %1$s";
    }
    @Override
    protected String failedToRegisterWebsocket$str() {
        return "WFLYUT0078: Falha ao registrar exibição de gerenciamento para websocket %1$s em %2$s";
    }
    @Override
    protected String unsupportedValveFeature$str() {
        return "WFLYUT0080: Válvulas não são mais suportadas, %1$s não está ativado. ";
    }
    @Override
    protected String distributableDisabledInFragmentXml$str() {
        return "WFLYUT0081: A implementação %1$s não será de distribuição pois este recurso está desabilitado em web-fragment.xml do módulo %2$s.";
    }
    @Override
    protected String couldNotStartListener$str() {
        return "WFLYUT0082: Não foi possível iniciar ouvinte '%1$s'";
    }
    @Override
    protected String nullNotAllowed$str() {
        return "WFLYUT0083: %1$s não pode ser nulo.";
    }
    @Override
    protected String duplicateDefaultWebModuleMapping$str() {
        return "WFLYUT0087: Duplicar o módulo web padrão '%1$s' configurado no servidor '%2$s', host '%3$s'";
    }
    @Override
    protected String predicateNotValid$str() {
        return "WFLYUT0089: Predicado %1$s não é válido, mensagem foi: %2$s";
    }
    @Override
    protected String missingKeyStoreEntry$str() {
        return "WFLYUT0090: O alias de chave %1$s não existe no armazenamento de chaves configurado";
    }
    @Override
    protected String keyStoreEntryNotPrivate$str() {
        return "WFLYUT0091: A entrada do armazenamento de chaves %1$s não é uma entrada de chave privada";
    }
    @Override
    protected String missingCredential$str() {
        return "WFLYUT0092: O alias de credencial %1$s não existe no armazenamento de credenciais configurado";
    }
    @Override
    protected String credentialNotClearPassword$str() {
        return "WFLYUT0093: A credencial %1$s não é uma senha com texto não criptografado";
    }
    @Override
    protected String configurationOptionIgnoredWhenUsingElytron$str() {
        return "WFLYUT0094: Opção de configuração [%1$s] ignorada ao usar o subsistema Elytron";
    }
    @Override
    protected String unableAddHandlerForPath$str() {
        return "WFLYUT0095: o caminho ['%1$s'] não existe no sistema de arquivos";
    }
    @Override
    protected String workerValueInHTTPListenerMustMatchRemoting$str() {
        return "WFLYUT0097: Se http-upgrade estiver ativado, o operador de comunicação remota e o operador http(s) devem ser iguais. Ajuste os valores se necessário.";
    }
    @Override
    protected String sessionManagerNotAvailable$str() {
        return "WFLYUT0099: Gerenciador de sessão não disponível";
    }
    @Override
    protected String sessionNotFound$str() {
        return "WFLYUT0100: Sessão %1$s não encontrada";
    }
    @Override
    protected String duplicateServletMapping$str() {
        return "WFLYUT0101: Mapeamento %1$s de servlet duplicado encontrado";
    }
    @Override
    protected String invalidDateTimeFormatterPattern$str() {
        return "WFLYUT0102: O padrão %1$s não é um padrão de data válido.";
    }
    @Override
    protected String invalidTimeZoneId$str() {
        return "WFLYUT0103: A ID do fuso horário %1$s é inválido.";
    }
    @Override
    protected String missingClassInAnnotation$str() {
        return "WFLYUT0104: Algumas classes referenciadas por anotação: %1$s em classe: %2$s estão faltando.";
    }
    @Override
    protected String duplicateHostContextDeployments$str() {
        return "WFLYUT0105: Host e caminho de contexto estão ocupados, %1$s não podem ser registrados. A mensagem foi: %2$s";
    }
    @Override
    protected String unableToObfuscateSessionRoute$str() {
        return "WFLYUT0106: Incapaz de gerar rota de sessão ofuscada a partir de '%1$s'";
    }
    @Override
    protected String obfuscatedSessionRoute$str() {
        return "WFLYUT0107: Rota de sessão ofuscada gerada '%1$s' de '%2$s'";
    }
    @Override
    protected String deploymentConfiguredForLegacySecurity$str() {
        return "WFLYUT0108: A implantação é configurada para usar a segurança herdada, que não está mais disponível.";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYUT0109: A implantação é configurada para usar a segurança herdada, que não é mais compatível.";
    }
    @Override
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYUT0110: O uso de reinos de segurança em tempo de execução não é compatível.";
    }
    @Override
    protected String badAnnotationOnServlet$str() {
        return "WFLYUT0111: A anotação: '%1$s' não terá efeito no Servlet: '%2$s'";
    }
}
