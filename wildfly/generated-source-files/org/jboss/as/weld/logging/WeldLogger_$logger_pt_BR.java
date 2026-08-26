package org.jboss.as.weld.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:55+0200")
public class WeldLogger_$logger_pt_BR extends WeldLogger_$logger_pt implements WeldLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public WeldLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotLoadAnnotationIndexOfExternalBeanArchive$str() {
        return "WFLYWELD0054: Não foi possível ler o índice fornecido de um arquivo de bean externo: %1$s";
    }
    @Override
    protected String cdiAnnotationsButNotBeanArchive$str() {
        return "WFLYWELD0013: A implantação %1$s contém anotações de Jakarta Contexts and Dependency Injection, mas nenhum arquivo de bean foi encontrado (nenhum bean.xml ou classe com anotações definidoras de bean estava presente).";
    }
    @Override
    protected String couldNotReadEntries$str() {
        return "WFLYWELD0016: Não foi possível ler as entradas";
    }
    @Override
    protected String couldNotFindPersistenceUnit$str() {
        return "WFLYWELD0037: Erro injetando unidade de persistência em Jakarta Contexts and Dependency Injection. Não é possível encontrar uma unidade de persistência chamada '%1$s' na implantação %2$s para ponto de injeção %3$s";
    }
    @Override
    protected String couldNotDetermineUnderlyingType$str() {
        return "WFLYWELD0036: Não foi possível determinar a classe de bean a partir do tipo do ponto de injeção de %1$s";
    }
    @Override
    protected String couldNotFindResource1$str() {
        return "WFLYWELD0044: Erro ao injetar recursos em Jakarta Contexts and Dependency Injection gerenciados por bean. Não é possível encontrar um recurso chamado %1$s";
    }
    @Override
    protected String doNotUnderstandProtocol$str() {
        return "WFLYWELD0017: O scanner URL não entende o protocolo URL %1$s, os Os beans de Jakarta Contexts and Dependency Injection não serão escaneados.";
    }
    @Override
    protected String viewNotFoundOnEJB$str() {
        return "WFLYWELD0022: Visualização do tipo %1$s não encontrada em Jakarta Enterprise Beans %2$s";
    }
    @Override
    protected String securityNotEnabled$str() {
        return "WFLYWELD0038: Não foi possível injetar SecurityManager, a segurança não está ativada";
    }
    @Override
    protected String couldNotLoadPortableExceptionClass$str() {
        return "WFLYWELD0007: Não foi possível carregar a classe de extensão portátil %1$s";
    }
    @Override
    protected String rejectAttributesMustBeTrue$str() {
        return "WFLYWELD0048: Estes atributos devem ser 'verdadeiros' para uso com CDI 1.0 '%1$s'";
    }
    @Override
    protected String extensionDoesNotImplementExtension$str() {
        return "WFLYWELD0021: Serviço %1$s não implantou a interface jakarta.enterprise.inject.spi.Extension";
    }
    @Override
    protected String couldNotLoadInterceptorClass$str() {
        return "WFLYWELD0020: Não foi possível carregar a classe do interceptor %1$s";
    }
    @Override
    protected String injectionPointNotAJavabean$str() {
        return "WFLYWELD0032: O ponto de injeção representa um método que não segue as convenções do JavaBean (deve possuir exatamente um parâmetro) %1$s";
    }
    @Override
    protected String beanArchiveDiscovered$str() {
        return "%1$s descoberto ";
    }
    @Override
    protected String failedToTearDownWeldContexts$str() {
        return "WFLYWELD0002: Falha ao desmontar os contextos Weld";
    }
    @Override
    protected String incorrectBceTranslatorSetup$str() {
        return "WFLYWELD0064: Configuração incorreta para inicialização do LiteExtensionTranslator do Weld; uma unidade de implantação deve ser especificada";
    }
    @Override
    protected String moreThanOneEjbResolved$str() {
        return "WFLYWELD0035: Resolvido mais de um Jakarta Enterprise Beans para a injeção de @EJB de %1$s no %2$s. Encontrado %3$s";
    }
    @Override
    protected String persistenceUnitFailed$str() {
        return "WFLYWELD0057: A unidade de persistência '%1$s' falhou.";
    }
    @Override
    protected String startingWeldService$str() {
        return "WFLYWELD0009: Inicialização do serviço weld para a implantação %1$s";
    }
    @Override
    protected String parameterCannotBeNull$str() {
        return "WFLYWELD0031: %1$s não pode ser nulo.";
    }
    @Override
    protected String unableToLoadAnnotation$str() {
        return "Não é possível carregar anotação %1$s";
    }
    @Override
    protected String notStarted$str() {
        return "WFLYWELD0041: %1$s não foi iniciado";
    }
    @Override
    protected String annotationNotFound$str() {
        return "WFLYWELD0033: Anotação %1$s não foi encontrada em %2$s ";
    }
    @Override
    protected String nameNotFoundInIndex$str() {
        return "WFLYWELD0050: %1$s não foi encontrado no índice de composição";
    }
    @Override
    protected String beansXmlValidationError$str() {
        return "WFLYWELD0012: Aviso ao pesquisar %1$s:%2$s %3$s";
    }
    @Override
    protected String cannotInject$str() {
        return "WFLYWELD0046: Não foi possível injetar ponto de injeção %1$s";
    }
    @Override
    protected String persistenceUnitRemoved$str() {
        return "WFLYWELD0058: A unidade de persistência '%1$s' foi removida.";
    }
    @Override
    protected String couldNotFindResource2$str() {
        return "WFLYWELD0049: Erro ao injetar recursos em Jakarta Contexts and Dependency Injection gerenciados por bean. Não é possível encontrar um recurso definido em %2$s";
    }
    @Override
    protected String startingServicesForCDIDeployment$str() {
        return "WFLYWELD0006: Serviços iniciais para a implantação de Jakarta Contexts and Dependency Injection: %1$s";
    }
    @Override
    protected String componentInterceptorSupportNotAvailable$str() {
        return "WFLYWELD0053: Componente suporte de interceptor não disponível para: %1$s";
    }
    @Override
    protected String errorHandlingFile$str() {
        return "WFLYWELD0060: Arquivo de tratamento de erros %1$s";
    }
    @Override
    protected String processingWeldDeployment$str() {
        return "WFLYWELD0003: Processando da implantação weld %1$s";
    }
    @Override
    protected String duplicateBeansXml$str() {
        return "WFLYWELD0018: Encontrados ambos WEB-INF/beans.xml e WEB-INF/classes/META-INF/beans.xml. Não é portátil utilizar ambos locais ao mesmo tempo. Weld utilizará o antigo local para esta implementação.";
    }
    @Override
    protected String singletonNotSet$str() {
        return "WFLYWELD0039: O singleton não foi configurado para %1$s. Isto significa que você está tentando acessar uma implantação weld com ClassLoader do Contexto do Thread que não está associado com a implantação.";
    }
    @Override
    protected String loadingProxiesUsingDeploymentClassLoader$str() {
        return "WFLYWELD0052: Usando o classloader de implantação para carregar as classes proxy para o módulo %1$s. O acesso package-private não funcionará. Para corrigir isto, este módulo deve declarar dependências no %2$s";
    }
    @Override
    protected String weldNotInitialized$str() {
        return "WFLYWELD0056: O Weld ainda não foi inicializado";
    }
    @Override
    protected String couldNotDeterminePackage$str() {
        return "WFLYWELD0062: Não foi possível determinar o pacote a partir do nome da classe corrompida";
    }
    @Override
    protected String couldNotFindBeanManagerForDeployment$str() {
        return "WFLYWELD0005: Não foi possível encontrar BeanManager para implantação %1$s ";
    }
    @Override
    protected String beansXmlValidationWarning$str() {
        return "WFLYWELD0011: Aviso ao pesquisar %1$s:%2$s %3$s";
    }
    @Override
    protected String alreadyRunning$str() {
        return "WFLYWELD0040: %1$s já está em execução";
    }
    @Override
    protected String beanDeploymentNotFound$str() {
        return "WFLYWELD0043: Não foi encontrado BeanDeploymentArchive com a id %1$s na implantação";
    }
    @Override
    protected String cannotDetermineResourceName$str() {
        return "WFLYWELD0045: Não foi possível determinar o nome do recurso. Ambos jndiName e mappedName são nulos";
    }
    @Override
    protected String unknownInterceptorClassForCDIInjection$str() {
        return "WFLYWELD0030: Classe de interceptor desconhecida para Jakarta Contexts and Dependency Injection %1$s";
    }
    @Override
    protected String unknownDeploymentType$str() {
        return "WFLYWELD0059: Tipo de implantação desconhecido %1$s";
    }
    @Override
    protected String failedToSetupWeldContexts$str() {
        return "WFLYWELD0001: Falha ao montar os contextos Weld";
    }
    @Override
    protected String missingService$str() {
        return "WFLYWELD0061: É necessário exatamente um provedor de serviços para: %1$s";
    }
    @Override
    protected String exceptionClearingThreadState$str() {
        return "WFLYWELD0014: Exceção ao desmontando estado de thread ";
    }
    @Override
    protected String stoppingWeldService$str() {
        return "WFLYWELD0010: Interrupção do serviço Weld para implantação %1$s";
    }
    @Override
    protected String injectionTypeNotValue$str() {
        return "WFLYWELD0008: @Resource injection do tipo %1$s não é compatível para componentes que não sejam Jakarta Enterprise Beans. Ponto de injeção: %2$s";
    }
    @Override
    protected String couldNotGetBeansXmlAsURL$str() {
        return "WFLYWELD0019: Foi possível obter o arquivo beans.xml como URL no processamento do arquivo: %1$s";
    }
    @Override
    protected String cannotIndexClassName$str() {
        return "WFLYWELD0055: Não foi possível indexar a classe [%1$s] de um arquivo de bean externo: %2$s";
    }
    @Override
    protected String originalClassDoesNotHaveAModule$str() {
        return "WFLYWELD0063: %1$s original não tem um módulo";
    }
    @Override
    protected String ejbNotResolved$str() {
        return "WFLYWELD0034: Não foi possível resolver a injeção @EJB para %1$s em %2$s";
    }
    @Override
    protected String cannotUseAtRuntime$str() {
        return "WFLYWELD0047: %1$s não pode ser utilizado em tempo de execução";
    }
    @Override
    protected String cannotLoadClass$str() {
        return "WFLYWELD0051: Não foi possível carregar %1$s";
    }
}
