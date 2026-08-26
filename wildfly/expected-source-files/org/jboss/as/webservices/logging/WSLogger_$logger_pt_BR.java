package org.jboss.as.webservices.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:14+0200")
public class WSLogger_$logger_pt_BR extends WSLogger_$logger_pt implements WSLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public WSLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotLoadDeploymentAspectsDefinitionFile$str() {
        return "WFLYWS0001: Não foi possível carregar os aspectos da implantação WS a partir do %1$s";
    }
    @Override
    protected String activatingWebservicesExtension$str() {
        return "WFLYWS0002: Ativação da Extensão WebServices";
    }
    @Override
    protected String starting$str() {
        return "WFLYWS0003: Inicializando %1$s";
    }
    @Override
    protected String stopping$str() {
        return "WFLYWS0004: Interrompendo %1$s";
    }
    @Override
    protected String configServiceCreationFailed$str() {
        return "WFLYWS0005: Erro na criação do serviço da configuração";
    }
    @Override
    protected String configServiceDestroyFailed$str() {
        return "WFLYWS0006: Erro ao destruir o serviço de configuração";
    }
    @Override
    protected String cannotReadWsdl$str() {
        return "WFLYWS0007: Não foi possível ler o WSDL a partir do: %1$s";
    }
    @Override
    protected String mutuallyExclusiveAnnotations$str() {
        return "WFLYWS0008: [Especificações JAXWS 2.2, seção 7.7] As anotações de @WebService e de @WebServiceProvider são mutualmente exclusivas - %1$s não será considerado como um ponto de extremidade do webservice, uma vez isto não preenche os pré-requisitos";
    }
    @Override
    protected String finalEndpointClassDetected$str() {
        return "WFLYWS0009: A classe do ponto de extremidade do WebService não pode ser final - %1$s não será considerado como o ponto de extremidade do webservice";
    }
    @Override
    protected String ignoringPortComponentRef$str() {
        return "WFLYWS0010: Ignorando <port-component-ref> sem <service-endpoint-interface> e <port-qname>: %1$s";
    }
    @Override
    protected String cannotRegisterRecordProcessor$str() {
        return "WFLYWS0011: Não foi possível registrar o processador de gravação com o servidor JMX";
    }
    @Override
    protected String cannotUnregisterRecordProcessor$str() {
        return "WFLYWS0012: Não foi possível cancelar o registro do processador de gravação a partir do servidor JMX";
    }
    @Override
    protected String mBeanServerNotAvailable$str() {
        return "WFLYWS0013: MBeanServer não está disponível, ignorando o registro/cancelamento de registro do %1$s";
    }
    @Override
    protected String multipleEndpointsWithDifferentDeclaredSecurityRoles$str() {
        return "WFLYWS0014: Múltiplos pontos de extremidade de Enterprise Beans 3 na mesma implantação com diferentes funções de segurança declaradas. Lembre-se que isto pode ser um risco de segurança caso você não esteja controlando as funções permitidas (@RolesAllowed) em cada método do ponto de extremidade.";
    }
    @Override
    protected String cannotRegisterEndpoint$str() {
        return "WFLYWS0015: Não foi possível registrar o ponto de extremidade: %1$s no servidor JMX";
    }
    @Override
    protected String cannotUnregisterEndpoint$str() {
        return "WFLYWS0016: Não foi possível registrar o ponto de extremidade: %1$s a partir do servidor JMX";
    }
    @Override
    protected String invalidHandlerChainFile$str() {
        return "WFLYWS0017: Arquivo de cadeia de identificador inválido: %1$s";
    }
    @Override
    protected String webMethodMustNotBeStaticOrFinal$str() {
        return "WFLYWS0018: O método de serviço web %1$s não deve ser estático ou final. Consulte a seção 5.3.2.4.2 de \"Jakarta Enterprise Web Services 2.0\"\".";
    }
    @Override
    protected String webMethodMustBePublic$str() {
        return "WFLYWS0019: O método de serviço web %1$s deve ser público. Veja seção 5.3.2.4.2 de \"Jakarta Enterprise Web Services 2.0\".";
    }
    @Override
    protected String webServiceMethodNotFound$str() {
        return "WFLYWS0020: A classe de implantação %1$s do serviço web não contém método %2$s";
    }
    @Override
    protected String accessibleWebServiceMethodNotFound$str() {
        return "WFLYWS0021: A classe de implantação %1$s do serviço web não contém um método %2$s acessível";
    }
    @Override
    protected String finalizeMethodNotAllowed$str() {
        return "WFLYWS0022: A classe de implementação do serviço web %1$s não pode declarar um método de finalizar(). Veja seção 5.3.2.4.2 de \"Jakarta Enterprise Web Services 2.0\".";
    }
    @Override
    protected String nullEndpointName$str() {
        return "WFLYWS0023: O nome do ponto de extremidade nulo";
    }
    @Override
    protected String nullEndpointClass$str() {
        return "WFLYWS0024: A classe do ponto de extremidade nulo";
    }
    @Override
    protected String classLoaderResolutionFailed$str() {
        return "WFLYWS0025: Não foi possível resolver o módulo ou o classloader para a implantação %1$s";
    }
    @Override
    protected String missingHandlerChainConfigFile$str() {
        return "WFLYWS0026: O arquivo de configuração da cadeia do identificador %1$s não foi encontrado no %2$s";
    }
    @Override
    protected String unexpectedElement$str() {
        return "WFLYWS0027: Elemento inesperado: %1$s";
    }
    @Override
    protected String unexpectedEndTag$str() {
        return "WFLYWS0028: Marca final inesperada: %1$s";
    }
    @Override
    protected String unexpectedEndOfDocument$str() {
        return "WFLYWS0029: Alcançou o final do documento xml inesperadamente";
    }
    @Override
    protected String missingDeploymentAspectClassAttribute$str() {
        return "WFLYWS0030: Não foi possível encontrar o atributo de classe para o aspecto de implantação";
    }
    @Override
    protected String cannotInstantiateDeploymentAspect$str() {
        return "WFLYWS0031: Não foi possível criar um aspecto de implantação da classe: %1$s";
    }
    @Override
    protected String missingPropertyNameAttribute$str() {
        return "WFLYWS0032: Não foi possível encontrar o atributo do nome da propriedade para o aspecto da implantação: %1$s";
    }
    @Override
    protected String missingPropertyClassAttribute$str() {
        return "WFLYWS0033: Não foi possível encontrar o atributo da classe da propriedade para o aspecto da implantação: %1$s";
    }
    @Override
    protected String unsupportedPropertyClass$str() {
        return "WFLYWS0034: A classe da propriedade não é compatível: %1$s";
    }
    @Override
    protected String cannotInstantiateList$str() {
        return "WFLYWS0035: Não foi possível criar a lista do tipo: %1$s";
    }
    @Override
    protected String cannotInstantiateMap$str() {
        return "WFLYWS0036: Não foi possível criar o mapa do tipo: %1$s";
    }
    @Override
    protected String noMetricsAvailable$str() {
        return "WFLYWS0037: Nenhuma métrica disponível";
    }
    @Override
    protected String cannotFindComponentView$str() {
        return "WFLYWS0038: Não foi possível localizar a visualização do componente: %1$s";
    }
    @Override
    protected String missingChild$str() {
        return "WFLYWS0039: Filho '%1$s' não encontrado para o VirtualFile: %2$s";
    }
    @Override
    protected String createContextPhaseFailed$str() {
        return "WFLYWS0040: Falha ao criar o contexto";
    }
    @Override
    protected String startContextPhaseFailed$str() {
        return "WFLYWS0041: Falha ao iniciar o contexto";
    }
    @Override
    protected String stopContextPhaseFailed$str() {
        return "WFLYWS0042: Falha ao encerrar o contexto";
    }
    @Override
    protected String destroyContextPhaseFailed$str() {
        return "WFLYWS0043: Falha ao destruir o contexto";
    }
    @Override
    protected String cannotInstantiateServletDelegate$str() {
        return "WFLYWS0044: Não foi possível criar o servlet delegado: %1$s";
    }
    @Override
    protected String missingDeploymentProperty$str() {
        return "WFLYWS0045: Não foi possível obter a propriedade da implantação: %1$s";
    }
    @Override
    protected String multipleSecurityDomainsDetected$str() {
        return "WFLYWS0046: Múltiplos security domains não compatíveis. Primeiro domínio: %1$s' segundo domíinio: '%2$s'";
    }
    @Override
    protected String sameUrlPatternRequested$str() {
        return "WFLYWS0047: O ponto de extremidade do Serviço da Web %1$s com o padrão URL %2$s já foi registrado. O ponto de extremidade do Serviço da Web %3$s está solicitando o mesmo URL padrão. ";
    }
    @Override
    protected String invalidServiceRefSetterMethodName$str() {
        return "WFLYWS0048: O destino de injeção do @WebServiceRef é inválido. Apenas os métodos dde configurador são permitidos: %1$s";
    }
    @Override
    protected String requiredServiceRefName$str() {
        return "WFLYWS0049: O 'nome' do atributo @WebServiceRef é solicitado para as anotações do nível da classe.";
    }
    @Override
    protected String requiredServiceRefType$str() {
        return "WFLYWS0050: O 'tipo' do atributo @WebServiceRef é solicitado para as anotações do nível da classe.";
    }
    @Override
    protected String missingConfig$str() {
        return "WFLYWS0051: Configuração %1$s não existe";
    }
    @Override
    protected String wrongHandlerChainType$str() {
        return "WFLYWS0052: Tipo de cadeia do identificador não compatível: %1$s. Os tipos compatíveis são tanto %2$s ou %3$s";
    }
    @Override
    protected String missingHandlerChain$str() {
        return "WFLYWS0054: Configuração %1$s: %2$s a cadeia do identificador com a id %3$s não existe ";
    }
    @Override
    protected String cannotGetURLForDescriptor$str() {
        return "WFLYWS0057: Não foi possível obter o URL para: %1$s";
    }
    @Override
    protected String jaxRpcNotSupported$str() {
        return "WFLYWS0058: Jakarta XML RPC não compatível";
    }
    @Override
    protected String invalidLibraryInDeployment$str() {
        return "WFLYWS0059: Biblioteca %1$s (%2$s) detectada na implantação do ponto de extremidade ws; ou fornece uma implantação adequada substituindo bibliotecas incorporadas com as dependências do módulo de armazenamento ou desabilita o subsystem de webservices para a implantação atual adicionando a ele um descritor jboss-deployment-structure.xml. A primeira abordagem é recomendada, uma vez que a segunda causa a desativação da maioria dos webservices e qualquer funcionalidade específica de Jakarta EE e de JBossWS.";
    }
    @Override
    protected String endpointClassNotFound$str() {
        return "WFLYWS0060: Não foi encontrada a classe de ponto de extremidade de serviço web %1$s";
    }
    @Override
    protected String declaredEndpointInterfaceClassNotFound$str() {
        return "WFLYWS0061: A endpointInterface %1$s declarada na anotação @WebService do Bean de implementação de serviço web %2$s não foi encontrada.";
    }
    @Override
    protected String jwsWebServiceClassVerificationFailed$str() {
        return "WFLYWS0062: Verificação da classe da classe %1$s de implementação do serviço Web de Java falhou.";
    }
    @Override
    protected String couldNotUpdateServerConfigBecauseOfReloadRequired$str() {
        return "WFLYWS0063: Não foi possível atualizar a configuração do servidor uma vez que a(s) atualização(ões) do modelo anterior pendente requerem o recarregamento.";
    }
    @Override
    protected String couldNotUpdateServerConfigBecauseOfExistingWSDeployment$str() {
        return "WFLYWS0064: Não foi possível atualizar a configuração do servidor WS devido à implantação existente WS no servidor.";
    }
    @Override
    protected String invalidWSServlet$str() {
        return "WFLYWS0066: Classe Servlet %1$s declarada em web.xml; ou proporcione uma implementação apropriada confiando em JBossWS ou desabilite o subsystem webservices para a atual implantação adicionando um descritor jboss-deployment-structure.xml adequado. A primeira abordagem é recomendada, pois a segunda causa a desativação da maioria dos webservices e qualquer funcionalidade específica de Jakarta EE e de JBossWS.";
    }
    @Override
    protected String couldNotActivateSubsystem$str() {
        return "WFLYWS0067: Não foi possível ativar o subsistema webservices. ";
    }
    @Override
    protected String failedAuthorization$str() {
        return "WFLYWS0070: Falha na autorização para o usuário: %1$s";
    }
    @Override
    protected String failedAuthentication$str() {
        return "WFLYWS0071: Falha ao autenticar o nome de usuário %1$s:, nome de usuário/senha incorreto";
    }
    @Override
    protected String failedAuthenticationWithException$str() {
        return "WFLYWS0072: Ocorreu um erro ao autenticar o nome de usuário %1$s. Mensagem de exceção: %2$s";
    }
    @Override
    protected String endpointAlreadyStopped$str() {
        return "WFLYWS0073: O ponto de extremidade de destino %1$s está interrompido ou sendo desimplantado";
    }
    @Override
    protected String warningLibraryInDeployment$str() {
        return "WFLYWS0068: Uma biblioteca potencialmente problemática %1$s (%2$s) detectada na implantação de ponto de extremidade de ws; Verifique se esta biblioteca pode ser substituída pelo módulo de armazenamento";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYWS0074: A implantação é configurada para usar a segurança herdada, que não é mais compatível.";
    }
    @Override
    protected String onlyStringPasswordAccepted$str() {
        return "WFLYWS0075: somente senha de string aceita";
    }
    @Override
    protected String checkModuleDependency$str() {
        return "WFLYWS0076: Encontrada anotação '@%1$s' na classe '%2$s'. Certifique-se de que a dependência de módulo '%3$s' esteja adicionada à sua implantação.";
    }
}
