package org.jboss.as.ejb3.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:32+0200")
public class EjbLogger_$logger_pt_BR extends EjbLogger_$logger_pt implements EjbLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public EjbLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String getTxManagerStatusFailed$str() {
        return "WFLYEJB0004: falha ao obter o status do gerenciador tx; ignorando";
    }
    @Override
    protected String setRollbackOnlyFailed$str() {
        return "WFLYEJB0005: falha ao determinar apenas a reversão; ignorando";
    }
    @Override
    protected String activationConfigPropertyIgnored$str() {
        return "WFLYEJB0006: O %1$s da ActivationConfigProperty será ignorado uma vez que ele não está permitido pelo adaptador de recurso: %2$s";
    }
    @Override
    protected String discardingStatefulComponent$str() {
        return "WFLYEJB0007: Descartando a instância do componente classificado: %1$s devido à exceção";
    }
    @Override
    protected String defaultInterceptorClassNotListed$str() {
        return "WFLYEJB0010: Classe do interceptor padrão %1$s não está listada na seção <interceptors> do ejb-jar.xml e não será aplicado";
    }
    @Override
    protected String unknownTimezoneId$str() {
        return "WFLYEJB0015: Id de fuso horário desconhecida: %1$s encontrado na expressão programada. Ignorando e utilizando o fuso horário do servidor: %2$s";
    }
    @Override
    protected String timerPersistenceNotEnable$str() {
        return "WFLYEJB0016: A persistência do timer, os timers de persistência não sobreviverão as reinicializações do JVM";
    }
    @Override
    protected String nextExpirationIsNull$str() {
        return "WFLYEJB0017: A próxima expiração é nula. Nenhuma tarefa será esquematizada para o %1$S do timer";
    }
    @Override
    protected String ignoringException$str() {
        return "WFLYEJB0018: Ignorando a exceção durante o setRollbackOnly";
    }
    @Override
    protected String errorInvokeTimeout$str() {
        return "WFLYEJB0020: Erro ao invocar o tempo limite para o temporizador: %1$s";
    }
    @Override
    protected String timerRetried$str() {
        return "WFLYEJB0021: Temporizador: %1$s será repetido";
    }
    @Override
    protected String errorDuringRetryTimeout$str() {
        return "WFLYEJB0022: Erro durante repetição do temporizador: %1$s";
    }
    @Override
    protected String retryingTimeout$str() {
        return "WFLYEJB0023: Repetindo tempo limite para o temporizador: %1$s";
    }
    @Override
    protected String timerNotActive$str() {
        return "WFLYEJB0024: O temporizador não está ativado, ignorando a nova tentativa para o temporizador: %1$s";
    }
    @Override
    protected String failToReadTimerInformation$str() {
        return "WFLYEJB0026: Não foi possível ler informações do temporizador para o componente Jakarta Enterprise Beans %1$s";
    }
    @Override
    protected String failToRestoreTimers$str() {
        return "WFLYEJB0028: %1$s não é um diretório. Não foi possível restaurar os temporizadores";
    }
    @Override
    protected String failToRestoreTimersFromFile$str() {
        return "WFLYEJB0029: Não foi possível restaurar o temporizador a partir do %1$s";
    }
    @Override
    protected String failToCloseFile$str() {
        return "WFLYEJB0030: erro ao encerrar o arquivo ";
    }
    @Override
    protected String failToRestoreTimersForObjectId$str() {
        return "WFLYEJB0031: Não foi possível restaurar os temporizadores para o %1$s";
    }
    @Override
    protected String failToCreateDirectoryForPersistTimers$str() {
        return "WFLYEJB0032: Não foi possível criar o diretório %1$s para manter os temporizadores do Jakarta Enterprise Beans.";
    }
    @Override
    protected String invocationFailed2$str() {
        return "WFLYEJB0034: A invocação de Jakarta Enterprise Beans falhou no componente %1$s para o método %2$s";
    }
    @Override
    protected String couldNotFindEjbForLocatorIIOP$str() {
        return "WFLYEJB0035: Não foi possível encontrar o bean Jakarta Enterprise Beans para o localizador %1$s, o proxy do cliente Jakarta Enterprise Beans não será substituído";
    }
    @Override
    protected String ejbNotExposedOverIIOP$str() {
        return "WFLYEJB0036: O bean do Jakarta Enterprise Beans %1$s não está sendo substituído por um Stub, pois não é exposto no IIOP";
    }
    @Override
    protected String dynamicStubCreationFailed$str() {
        return "WFLYEJB0037: A criação do stub dinâmico falhou para a classe %1$s";
    }
    @Override
    protected String logMDBStart$str() {
        return "WFLYEJB0042: Iniciada mensagem controlada por Bean '%1$s' com o adaptador de recurso '%2$s'";
    }
    @Override
    protected String skipOverlappingInvokeTimeout$str() {
        return "WFLYEJB0043: Uma execução prévia do temporizador %1$s ainda está em andamento, ignorando a execução desta superposição programada em: %2$s.";
    }
    @Override
    protected String resourceAdapterRepositoryUnAvailable$str() {
        return "WFLYEJB0044: O repositório do adaptador de recurso não está disponível";
    }
    @Override
    protected String noSuchEndpointException$str() {
        return "WFLYEJB0045: Não foi possível encontrar um Ponto de Extremidade para o adaptador de recurso %1$s";
    }
    @Override
    protected String endpointUnAvailable$str() {
        return "WFLYEJB0046: O Ponto de Extremidade não está disponível para o componente controlado por mensagem %1$s";
    }
    @Override
    protected String failureDuringEndpointDeactivation$str() {
        return "WFLYEJB0047: Não foi possível desativar o ponto de extremidade para o componente controlado por mensagens %1$s";
    }
    @Override
    protected String failureDuringLoadOfClusterNodeSelector$str() {
        return "WFLYEJB0049: Não foi possível criar uma instância do seletor de nó de cluster %1$s para o cluster %2$s";
    }
    @Override
    protected String failedToCreateOptionForProperty$str() {
        return "WFLYEJB0050: Falha ao analisar  propriedade%1$s devido ao %2$s";
    }
    @Override
    protected String viewNotFound$str() {
        return "WFLYEJB0051: Não foi possível encontrar visualização %1$s para Jakarta Enterprise Beans %2$s";
    }
    @Override
    protected String asyncInvocationOnlyApplicableForSessionBeans$str() {
        return "WFLYEJB0052: Não foi possível executar uma invocação local assíncrona para o componente que não é um bean de sessão";
    }
    @Override
    protected String notStatefulSessionBean$str() {
        return "WFLYEJB0053: %1$s não é um estado de bean de sessão no aplicativo: %2$s módulo: %3$s distintc-name: %4$s";
    }
    @Override
    protected String failedToMarshalEjbParameters$str() {
        return "WFLYEJB0054: Falha ao realizar marshaling dos parâmetros de Jakarta Enterprise Beans";
    }
    @Override
    protected String unknownDeployment$str() {
        return "WFLYEJB0055: Não há correspondência de implantação para Jakarta Enterprise Beans: %1$s";
    }
    @Override
    protected String ejbNotFoundInDeployment$str() {
        return "WFLYEJB0056: Não foi possível encontrar o Jakarta Enterprise Beans na implantação correspondente: %1$s";
    }
    @Override
    protected String annotationApplicableOnlyForMethods$str() {
        return "WFLYEJB0057: A anotação %1$s somente é válida nos métodos destino";
    }
    @Override
    protected String aroundTimeoutMethodExpectedWithInvocationContextParam$str() {
        return "WFLYEJB0058: Método %1$s, na classe %2$s, anotado com @jakarta.interceptor.AroundTimeout deve aceitar um único parâmetro do tipo jakarta.interceptor.InvocationContext";
    }
    @Override
    protected String aroundTimeoutMethodMustReturnObjectType$str() {
        return "WFLYEJB0059: Método %1$s, na classe %2$s, anotado com @jakarta.interceptor.AroundTimeout deve retornar Tipo de objeto";
    }
    @Override
    protected String wrongTxOnThread$str() {
        return "WFLYEJB0060: Tx errado no thread: esperado %1$s, atual %2$s";
    }
    @Override
    protected String unknownTxAttributeOnInvocation$str() {
        return "WFLYEJB0061: Atributo de transação inesperado %1$s na invocação %2$s";
    }
    @Override
    protected String txRequiredForInvocation$str() {
        return "WFLYEJB0062: A transação é requerida para invocação %1$s";
    }
    @Override
    protected String txPresentForNeverTxAttribute$str() {
        return "WFLYEJB0063: Transação presente no servidor em Never call (Enterprise Beans 3 13.6.2.6)";
    }
    @Override
    protected String failedToSetRollbackOnly$str() {
        return "WFLYEJB0064: Falha ao determinar a transação para a reversão apenas";
    }
    @Override
    protected String viewInterfaceCannotBeNull$str() {
        return "WFLYEJB0065: A interface de visualização não pode ser nula";
    }
    @Override
    protected String failedToLoadViewClassForComponent$str() {
        return "WFLYEJB0068: Não foi possível carregar a classe de visualização para o componente %1$s";
    }
    @Override
    protected String illegalCallToEjbHomeRemove$str() {
        return "WFLYEJB0073: Chamada ilegal ao EJBHome.remove(Object) num bean de sessão";
    }
    @Override
    protected String setRollbackOnlyNotAllowedForSupportsTxAttr$str() {
        return "WFLYEJB0074: Enterprise Beans 3.1 FR 13.6.2.8 setRollbackOnly não é permitido com o atributo da transação SUPORTES";
    }
    @Override
    protected String cannotCallGetPKOnSessionBean$str() {
        return "WFLYEJB0075: Não foi possível chamar o getPrimaryKey no bean de sessão";
    }
    @Override
    protected String ejb2xViewNotApplicableForSingletonBeans$str() {
        return "WFLYEJB0076: Singleton beans não podem ter visualizações do Enterprise Beans 2.x";
    }
    @Override
    protected String ejbLocalObjectUnavailable$str() {
        return "WFLYEJB0078: Bean %1$s não possui um EJBLocalObject";
    }
    @Override
    protected String cannotBeApplicationExceptionBecauseNotAnExceptionType$str() {
        return "WFLYEJB0079: Classe [EJB 3.1 spec, seção 14.1.1]: %1$s não pode ser marcado como um aplicativo exceção uma vez que isto não é um tipo de java.lang.Exception";
    }
    @Override
    protected String rmiRemoteExceptionCannotBeApplicationException$str() {
        return "WFLYEJB0080: Classe de Exceção [EJB 3.1 spec, seção 14.1.1]: %1$s não pode ser marcado como um aplicativo exceção uma vez que é do tipo java.rmi.RemoteException";
    }
    @Override
    protected String annotationOnlyAllowedOnClass$str() {
        return "WFLYEJB0081: A anotação %1$s é permitida apenas nas classes. %2$s não é uma classe";
    }
    @Override
    protected String beanWithRemoteAnnotationImplementsMoreThanOneInterface$str() {
        return "WFLYEJB0082: O Bean %1$s especifica a anotação @Remote, porém não implementa a interface 1";
    }
    @Override
    protected String beanWithLocalAnnotationImplementsMoreThanOneInterface$str() {
        return "WFLYEJB0083: O Bean %1$s especifica a anotação @Local, porém não implementa a interface 1";
    }
    @Override
    protected String failedToAnalyzeRemoteInterface$str() {
        return "WFLYEJB0084: Não foi possível analisar a interface remota para o %1$s";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYEJB0085: Exceção ao analisar %1$s";
    }
    @Override
    protected String failedToInstallManagementResource$str() {
        return "WFLYEJB0086: Falha ao instalar os recursos de gerenciamento para o %1$s";
    }
    @Override
    protected String failedToLoadViewClass$str() {
        return "WFLYEJB0087: Não foi possível carregar a visualização %1$s";
    }
    @Override
    protected String couldNotDetermineEjbRefForInjectionTarget$str() {
        return "WFLYEJB0088: Não foi possível determinar o tipo de ejb-ref %1$s para injeção do destino %2$s";
    }
    @Override
    protected String couldNotDetermineEjbLocalRefForInjectionTarget$str() {
        return "WFLYEJB0089: Não foi possível determinar o tipo deejb-local-ref %1$s para injeção do destino %2$s";
    }
    @Override
    protected String onlySetterMethodsAllowedToHaveEJBAnnotation$str() {
        return "WFLYEJB0090: O destino da injeção @EJB %1$s é inválido. Apenas os métodos de configurador são permitidos";
    }
    @Override
    protected String nameAttributeRequiredForEJBAnnotationOnClass$str() {
        return "WFLYEJB0091: O 'nome' do atributo @EJB é solicitado para as anotações do nível da classe. Classe: %1$s";
    }
    @Override
    protected String beanInterfaceAttributeRequiredForEJBAnnotationOnClass$str() {
        return "WFLYEJB0092: O 'beanInterface' do atributo @EJB é solicitado para as anotações do nível da classe. Classe: %1$s";
    }
    @Override
    protected String moduleNotAttachedToDeploymentUnit$str() {
        return "WFLYEJB0093: O módulo não foi anexado à unidade da implantação %1$s";
    }
    @Override
    protected String mdbDoesNotImplementNorSpecifyMessageListener$str() {
        return "WFLYEJB0094: Enterprise Beans 3.1 FR 5.4.2 MessageDrivenBean %1$s não implanta interface 1 nem especifica a interface do ouvinte da mensagem";
    }
    @Override
    protected String unknownSessionBeanType$str() {
        return "WFLYEJB0095: Tipo de bean de sessão desconhecido %1$s";
    }
    @Override
    protected String moreThanOneMethodWithSameNameOnComponent$str() {
        return "WFLYEJB0096: Mais de um método encontrado com o nome %1$s no %2$s";
    }
    @Override
    protected String unknownEJBLocatorType$str() {
        return "WFLYEJB0097: Tipo de localizador de Jakarta Enterprise Beans desconhecido %1$s";
    }
    @Override
    protected String couldNotCreateCorbaObject$str() {
        return "WFLYEJB0098: Não foi possível criar o objeto CORBA para %1$s";
    }
    @Override
    protected String incorrectEJBLocatorForBean$str() {
        return "WFLYEJB0099: Localizador %1$s fornecido não era para Jakarta Enterprise Beans %2$s";
    }
    @Override
    protected String failedToLookupORB$str() {
        return "WFLYEJB0100: Falha ao pesquisar java:comp/ORB";
    }
    @Override
    protected String notAnObjectImpl$str() {
        return "WFLYEJB0101: %1$s não é um Objectlmpl";
    }
    @Override
    protected String messageEndpointAlreadyReleased$str() {
        return "WFLYEJB0102: O ponto de extremidade da mensagem %1$s já foi lançado";
    }
    @Override
    protected String timerInvocationFailedDueToInvokerNotBeingStarted$str() {
        return "WFLYEJB0107: Falha na invocação do timer, o invocador não está iniciado";
    }
    @Override
    protected String invalidValueForSecondInScheduleExpression$str() {
        return "WFLYEJB0109: Valor inválido para o segundo: %1$s";
    }
    @Override
    protected String timerInvocationRolledBack$str() {
        return "WFLYEJB0110: A invocação do timer falhou, a transação foi revertida";
    }
    @Override
    protected String noJNDIBindingsForSessionBean$str() {
        return "WFLYEJB0111: Não serão criados vínculos jndi para Jakarta Enterprise Beans %1$s, uma vez que nenhuma vista está exposta";
    }
    @Override
    protected String sessionBeanClassCannotBeAnInterface$str() {
        return "WFLYEJB0118: [Especificação Jakarta Enterprise Beans 3.1, seção 4.9.2] A classe da implementação do bean de sessão NÂO PODE ser uma interface - %1$s é uma interface, portanto não poderá ser considerado como um bean de sessão";
    }
    @Override
    protected String sessionBeanClassMustBePublicNonAbstractNonFinal$str() {
        return "WFLYEJB0119: [Especificação Jakarta Enterprise Beans 3.1, seção 4.9.2] A classe da implementação do bean de sessão PRECISA ser publica, mas não abstrata ou final - o %1$s não será considerado como um bean de sessão, uma vez uma vez que isto não satisfaz o requisito";
    }
    @Override
    protected String mdbClassCannotBeAnInterface$str() {
        return "WFLYEJB0120: [Especificação Jakarta Enterprise Beans 3.1, seção 5.6.2] A classe da implementação do bean controlado por mensagem NÃO PODE ser uma interface - %1$s é uma interface, portanto não poderá ser considerado como um bean de sessão";
    }
    @Override
    protected String mdbClassMustBePublicNonAbstractNonFinal$str() {
        return "WFLYEJB0121: [Especificação Jakarta Enterprise Beans 3.1, seção 5.6.2] A classe da implementação do bean controlado PRECISA ser publica, mas não abstrata ou final - o %1$s não será considerado como um bean dirigido de mensagem, uma vez uma vez que isto não satisfaz o requisito";
    }
    @Override
    protected String failedToCreateDeploymentNodeSelector$str() {
        return "WFLYEJB0125: Não foi possível criar uma instância do seletor de nó de implantação %1$s";
    }
    @Override
    protected String ejbMustHavePublicDefaultConstructor$str() {
        return "WFLYEJB0127: Jakarta Enterprise Beans %1$s de tipo %2$s devem ter construtor público padrão";
    }
    @Override
    protected String ejbMustNotBeInnerClass$str() {
        return "WFLYEJB0128: Jakarta Enterprise Beans %1$s de tipo %2$s devem ser de classe interna";
    }
    @Override
    protected String ejbMustBePublicClass$str() {
        return "WFLYEJB0129: akarta Enterprise Beans %1$s de tipo %2$s devem ser declarados públicos";
    }
    @Override
    protected String ejbMustNotBeFinalClass$str() {
        return "WFLYEJB0130: akarta Enterprise Beans %1$s de tipo %2$s não devem ser declarados finais";
    }
    @Override
    protected String ejbMethodMustNotBeFinalNorStatic$str() {
        return "WFLYEJB0131: Jakarta Enterprise Beans %1$s não devem ter um método final ou estático (%2$s)";
    }
    @Override
    protected String reentrantSingletonCreation$str() {
        return "WFLYEJB0132: @PostConstruct método de Jakarta Enterprise Beans singleton %1$s de tipo %2$s foi invocado recursivamente";
    }
    @Override
    protected String unauthorizedAccessToUserTransaction$str() {
        return "WFLYEJB0137: Apenas a sessão e message-driven beans como a demarcação da transação de bean gerenciada são permitidas para acesso ao UserTransaction";
    }
    @Override
    protected String timerServiceIsNotActive$str() {
        return "WFLYEJB0139: O serviço de temporizador foi desabilitado. Adicione uma entrada <timer-service> na seção de Jakarta Enterprise Beans da configuração do servidor para habilitá-lo.";
    }
    @Override
    protected String ejbHasNoTimerMethods$str() {
        return "WFLYEJB0140: Este Jakarta Enterprise Beans não tem nenhum método de tempo limite";
    }
    @Override
    protected String deploymentAddListenerException$str() {
        return "WFLYEJB0141: Exceção na chamada ao ouvinte de implantação adicionada";
    }
    @Override
    protected String deploymentRemoveListenerException$str() {
        return "WFLYEJB0142: Exceção à chamada do ouvinte da remoção da implantação";
    }
    @Override
    protected String failedToRemoveManagementResources$str() {
        return "WFLYEJB0143: Falha ao remover os recursos de gerenciamento para %1$s -- %2$s";
    }
    @Override
    protected String cobraInterfaceRepository$str() {
        return "WFLYEJB0144: Repositório da interface CORBA para %1$s: %2$s";
    }
    @Override
    protected String cannotUnregisterEJBHomeFromCobra$str() {
        return "WFLYEJB0145: Não foi possível desregistrar o EJBHome do serviço de nomeação CORBA";
    }
    @Override
    protected String cannotDeactivateHomeServant$str() {
        return "WFLYEJB0146: Não foi possível desativar o servant da página principal";
    }
    @Override
    protected String cannotDeactivateBeanServant$str() {
        return "WFLYEJB0147: Não foi possível desativar o servant do bean";
    }
    @Override
    protected String couldNotWriteMethodInvocation$str() {
        return "WFLYEJB0150: Não foi possível gravar a falha da invocação do método para o método %1$s no bean nomeado %2$s para o appname %3$s modulename %4$s distinctname %5$s devido a";
    }
    @Override
    protected String exceptionGeneratingSessionId$str() {
        return "WFLYEJB0151: Exceção ao gerar o ID de sessão para o componente %1$s com a invocação %2$s";
    }
    @Override
    protected String failedToGetStatus$str() {
        return "WFLYEJB0157: Falha ao obter o status";
    }
    @Override
    protected String failedToRollback$str() {
        return "WFLYEJB0158: Falha ao reverter";
    }
    @Override
    protected String transactionNotComplete2$str() {
        return "WFLYEJB0159: O BMT statefull bean '%1$s' não completou a transação do usuário de maneira apropriada status=%2$s";
    }
    @Override
    protected String timerReinstatementFailed$str() {
        return "WFLYEJB0161: Falha ao restabelecer o temporizador '%1$s' (id=%2$s) a partir de seu estado persistente";
    }
    @Override
    protected String skipInvokeTimeoutDuringRetry$str() {
        return "WFLYEJB0162: A execução anterior do temporizador %1$s está sendo repetida, ignorando esta execução programada em: %2$s";
    }
    @Override
    protected String couldNotCreateTable$str() {
        return "WFLYEJB0163: Não foi possível criar uma tabela para a persistência do timer.";
    }
    @Override
    protected String exceptionRunningTimerTask$str() {
        return "WFLYEJB0164: Exceção de tarefa de temporizador em execução para temporizador %1$s em Jakarta Enterprise Beans %2$s";
    }
    @Override
    protected String deprecatedAnnotation$str() {
        return "WFLYEJB0166: A anotação @%1$s está preterida e será ignorada. ";
    }
    @Override
    protected String deprecatedNamespace$str() {
        return "WFLYEJB0167: O elemento <%2$s xmlns=\"%1$s\"/> será ignorado.";
    }
    @Override
    protected String couldNotFindEjb$str() {
        return "WFLYEJB0168: Não foi possível encontrar Jakarta Enterprise Beans com id %1$s";
    }
    @Override
    protected String componentNotSetInInterceptor$str() {
        return "WFLYEJB0169: O componente não configurado no InterceptorContext: %1$s";
    }
    @Override
    protected String methodNameIsNull$str() {
        return "WFLYEJB0170: O nome do método não pode ser nulo";
    }
    @Override
    protected String beanHomeInterfaceIsNull$str() {
        return "WFLYEJB0171: Bean %1$s não possui a interface Principal";
    }
    @Override
    protected String beanLocalHomeInterfaceIsNull$str() {
        return "WFLYEJB0172: Bean %1$s não possui a interface Principal Local";
    }
    @Override
    protected String failToCallgetRollbackOnly$str() {
        return "WFLYEJB0173: Enterprise Beans 3.1 FR 13.6.1 Apenas beans com a demarcação de transação gerenciada por recipiente podem usar getRollbackOnly.";
    }
    @Override
    protected String failToCallgetRollbackOnlyOnNoneTransaction$str() {
        return "WFLYEJB0174: O getRollbackOnly() não é permitido sem a transação.";
    }
    @Override
    protected String failToCallgetRollbackOnlyAfterTxcompleted$str() {
        return "WFLYEJB0175: O getRollbackOnly() não é permitido após a transação ser completada (EJBTHREE-1445)";
    }
    @Override
    protected String jndiNameCannotBeNull$str() {
        return "WFLYEJB0177: o nome jndi não pode ser nulo durante a pesquisa";
    }
    @Override
    protected String noNamespaceContextSelectorAvailable$str() {
        return "WFLYEJB0178: Nenhum NamespaceContextSelector disponível, não foi possível pesquisar %1$s";
    }
    @Override
    protected String failToLookupJNDI$str() {
        return "WFLYEJB0179: Não foi possível pesquisar o nome jndi: %1$s";
    }
    @Override
    protected String failToLookupJNDINameSpace$str() {
        return "WFLYEJB0180: Não foi possível pesquisar o nome jndi: %1$s uma vez que ele não pertence ao java:app, java:module, java:comp ou java:global namespace";
    }
    @Override
    protected String failToLookupStrippedJNDI$str() {
        return "WFLYEJB0181: Não foi possível pesquisar o nome jndi: %1$s no contexto: %2$s";
    }
    @Override
    protected String failToCallSetRollbackOnlyOnNoneCMB$str() {
        return "WFLYEJB0182: Enterprise Beans 3.1 FR 13.6.1 Apenas beans com a demarcação da transação gerenciada por recipiente podem usar o setRollbackOnly.";
    }
    @Override
    protected String failToCallSetRollbackOnlyWithNoTx$str() {
        return "WFLYEJB0183: O setRollbackOnly() não é permitido sem a transação.";
    }
    @Override
    protected String EjbJarConfigurationIsNull$str() {
        return "WFLYEJB0184: EjbJarConfiguration não pode ser nulo.";
    }
    @Override
    protected String SecurityRolesIsNull$str() {
        return "WFLYEJB0185: Não pode configurar a segurança para cancelamento";
    }
    @Override
    protected String failToLinkFromEmptySecurityRole$str() {
        return "WFLYEJB0193: Não foi possível vincular a partir de uma função de segurança vazia ou nula: %1$s";
    }
    @Override
    protected String failToLinkToEmptySecurityRole$str() {
        return "WFLYEJB0194: Não foi possível vincular para uma função de segurança vazia ou nula: %1$s";
    }
    @Override
    protected String ejbJarConfigNotFound$str() {
        return "WFLYEJB0195: EjbJarConfiguration não foi encontrado comi um anexo na unidade de implantação: %1$s";
    }
    @Override
    protected String componentViewNotAvailableInContext$str() {
        return "WFLYEJB0196: O ComponentViewInstance não está disponível no contexto do interceptor: %1$s";
    }
    @Override
    protected String unknownResourceAdapter$str() {
        return "WFLYEJB0199: Nenhum adaptador de recurso registrado com o nome de adaptador do recurso %1$s";
    }
    @Override
    protected String failToCompleteTaskBeforeTimeOut$str() {
        return "WFLYEJB0202: A tarefa não está completa no %1$s %2$S";
    }
    @Override
    protected String taskWasCancelled$str() {
        return "WFLYEJB0203: A tarefa foi cancelada";
    }
    @Override
    protected String methodNotImplemented$str() {
        return "WFLYEJB0206: Não foi implantado ainda";
    }
    @Override
    protected String unexpectedComponent$str() {
        return "WFLYEJB0213: Componente inesperado: %1$s componente esperado %2$s";
    }
    @Override
    protected String ejbJarConfigNotBeenSet$str() {
        return "WFLYEJB0214: O EjbJarConfiguration não foi definido ao %1$s Não foi possível criar o serviço de criação do componente para o Jakarta Enterprise Beans %2$S";
    }
    @Override
    protected String poolConfigIsEmpty$str() {
        return "WFLYEJB0218: O PoolConfig não pode ser nulo ou vazio";
    }
    @Override
    protected String failToAddClassToLocalView$str() {
        return "WFLYEJB0220: [Enterprise Beans 3.1 spec, section 4.9.7] - Não foi possível adicionar a classe de visualização: %1$s como visualização local uma vez que já foi marcada como uma visualização remota para o bean: %2$s";
    }
    @Override
    protected String businessInterfaceIsNull$str() {
        return "WFLYEJB0221: O tipo de interface comercial não pode ser nula";
    }
    @Override
    protected String beanComponentMissingEjbObject$str() {
        return "WFLYEJB0222: O bean %1$s não possui um %2$s";
    }
    @Override
    protected String getRollBackOnlyIsNotAllowWithSupportsAttribute$str() {
        return "WFLYEJB0223: Jakarta Enterprise Beans 3.1 FR 13.6.2.9 getRollbackOnly não é permitido com o atributo SUPORTE";
    }
    @Override
    protected String failToCallBusinessOnNonePublicMethod$str() {
        return "WFLYEJB0224: Não é um método comercial %1$s. Não chamar métodos não públicos no Jakarta Enterprise Beans";
    }
    @Override
    protected String componentInstanceNotAvailable$str() {
        return "WFLYEJB0225: A instância do componente não está disponível para invocação: %1$s";
    }
    @Override
    protected String failToObtainLock$str() {
        return "WFLYEJB0228: Tempo limite de acesso simultâneo de Enterprise Beans 3.1 FR 4.3.14.1 no %1$s - não foi possível obter trava em%2$s %3$s";
    }
    @Override
    protected String statefulSessionIdIsNull$str() {
        return "WFLYEJB0234: A id de sessão não foi configurada para o componente de estado: %1$s";
    }
    @Override
    protected String removeMethodIsNull$str() {
        return "WFLYEJB0235: O identificador do método @Remove não pode ser nulo ";
    }
    @Override
    protected String componentNotInstanceOfSessionComponent$str() {
        return "WFLYEJB0236: O %1$s do componentes %2$s%n com a classe do componente: %3$s";
    }
    @Override
    protected String bothMethodIntAndClassNameSet$str() {
        return "WFLYEJB0237: ambos methodIntf e className estão configurados no %1$s";
    }
    @Override
    protected String failToUpgradeToWriteLock$str() {
        return "WFLYEJB0238: Enterprise Beans 3.1 PFD2 4.8.5.1.1 atualizando de trava de leitura para gravação não é permitida";
    }
    @Override
    protected String componentIsNull$str() {
        return "WFLYEJB0239: %1$s não pode ser nulo.";
    }
    @Override
    protected String invocationNotApplicableForMethodInvocation$str() {
        return "WFLYEJB0240: O contexto de invocação: %1$s não pode ser processado uma vez que não é aplicado à invocação do método";
    }
    @Override
    protected String concurrentAccessTimeoutException$str() {
        return "WFLYEJB0241: O limite de acesso simultâneo Enterprise Beans 3.1 PFD2 4.8.5.5.1 no %1$s - não foi possível obter trava com o %2$s";
    }
    @Override
    protected String failToObtainLockIllegalType$str() {
        return "WFLYEJB0242: Tipo de bloqueio ilegal %1$s no %2$s para o componente %3$s";
    }
    @Override
    protected String noAsynchronousInvocationInProgress$str() {
        return "WFLYEJB0244: Nenhuma invocação assíncrona em andamento";
    }
    @Override
    protected String roleNamesIsNull$str() {
        return "WFLYEJB0255: <role-name> não pode ser nulo ou vazio no bean <security-role-ref>%nfor: %1$s";
    }
    @Override
    protected String defaultInterceptorsNotBindToMethod$str() {
        return "WFLYEJB0256: Os interceptores padrões não podem especificar um método para vincular ao ejb-jar.xml";
    }
    @Override
    protected String twoEjbBindingsSpecifyAbsoluteOrder$str() {
        return "WFLYEJB0258: Dois ejb-jar.xml bindings para %1$s especificam uma ordem absoluta";
    }
    @Override
    protected String failToFindMethodInEjbJarXml$str() {
        return "WFLYEJB0259: Não foi possível encontrar o método %1$s.%2$s referenciado no ejb-jar.xml";
    }
    @Override
    protected String multipleMethodReferencedInEjbJarXml$str() {
        return "WFLYEJB0260: Mais de um método %1$s encontrado na classe %2$s referenciada no ejb-jar.xml. Especifica os tipos de parâmetros para resolver a ambiguidade";
    }
    @Override
    protected String failToFindMethodWithParameterTypes$str() {
        return "WFLYEJB0261: Não foi possível encontrar o método %1$s.%2$s com tipos de parâmetros %3$s referenciados no ejb-jar.xml";
    }
    @Override
    protected String failToLoadComponentClass$str() {
        return "WFLYEJB0262: Não foi possível carregar a classe de componente para componente %1$s";
    }
    @Override
    protected String failToMergeData$str() {
        return "WFLYEJB0264: Não foi possível mesclar dados para o %1$s";
    }
    @Override
    protected String failToLoadEjbClass$str() {
        return "WFLYEJB0265: Não pôde carregar a classe de Jakarta Enterprise Beans %1$s";
    }
    @Override
    protected String multipleAnnotationsOnBean$str() {
        return "WFLYEJB0266: Apenas um método %1$s é permitido no bean %2$s";
    }
    @Override
    protected String multipleCreateMethod$str() {
        return "WFLYEJB0267: Não foi possível determinar o tipo correspondente implícito de interface local Enterprise Beans 2.x (ver EJB 3.1 21.4.5)%n devido a múltiplos métodos de criação* com diferentes tipos de retorno em casa %1$s";
    }
    @Override
    protected String failToFindEjbRefByDependsOn$str() {
        return "WFLYEJB0268: Não foi possível encontrar o Jakarta Enterprise Beans %1$s referenciado pela anotação @DependsOn em %2$s";
    }
    @Override
    protected String failToCallEjbRefByDependsOn$str() {
        return "WFLYEJB0269: Mais de um Jakarta Enterprise Beans chamado %1$s referenciado pela anotação @DependsOn em %2$s Componentes:%3$s";
    }
    @Override
    protected String wrongReturnTypeForAsyncMethod$str() {
        return "WFLYEJB0270: O método assíncrono %1$s não retorna nulo ou Futuro";
    }
    @Override
    protected String failToLoadAppExceptionClassInEjbJarXml$str() {
        return "WFLYEJB0271: Não foi possível carregar a classe de exceção do aplicativo %1$s no ejb-jar.xml";
    }
    @Override
    protected String invalidEjbEntityTimeout$str() {
        return "WFLYEJB0272: Bean de entidade %2$sdo Jakarta Enterprise Beans %1$s implantado no TimedObject, no entanto possui um método de limite de tempo diferente especificado tanto através das anotações ou através do descritor de implantação";
    }
    @Override
    protected String invalidEjbLocalInterface$str() {
        return "WFLYEJB0273: %1$s não tem uma interface local Enterprise Beans 2.x";
    }
    @Override
    protected String localHomeNotAllow$str() {
        return "WFLYEJB0274: Página inicial Local não foi permitida para o %1$s";
    }
    @Override
    protected String failToCallEjbCreateForHomeInterface$str() {
        return "WFLYEJB0275: Não foi possível resolver o ejbCreate correspondente ou o método @Init para o método de interface de página inicial %1$s no Jakarta Enterprise Beans %2$s";
    }
    @Override
    protected String failToGetEjbComponent$str() {
        return "WFLYEJB0276: EJBComponent não foi configurado no contexto da invocação atual %1$s";
    }
    @Override
    protected String invalidScheduleValue$str() {
        return "WFLYEJB0286: Valor do horário inválido %1$s: %2$s";
    }
    @Override
    protected String invalidScheduleExpressionType$str() {
        return "WFLYEJB0291: Valor inválido: %1$s sendo que %2$s não suporta os valores dos tipos %3$s";
    }
    @Override
    protected String invalidListValue$str() {
        return "WFLYEJB0292: O valor da lista pode apenas conter um intervalo ou um valor individual. Valor inválido: %1$s";
    }
    @Override
    protected String invalidValuesRange$str() {
        return "WFLYEJB0294: Valor inválido: %1$s Os valores válidos estão entre %2$s e %3$s";
    }
    @Override
    protected String invokerIsNull$str() {
        return "WFLYEJB0303: O invocador não pode ser nulo";
    }
    @Override
    protected String executorIsNull$str() {
        return "WFLYEJB0305: O executor não pode ser nulo";
    }
    @Override
    protected String invalidTimerParameter$str() {
        return "WFLYEJB0306: Parâmetro de temporizador inválido: %1$s = %2$s";
    }
    @Override
    protected String failToInvokeTimerServiceDoLifecycle$str() {
        return "WFLYEJB0325: Não foi possível invocar os métodos de serviços na chamada de retorno de beans non-singletons";
    }
    @Override
    protected String timerIsNull$str() {
        return "WFLYEJB0326: O timer não pode ser nulo";
    }
    @Override
    protected String invalidTimerHandlersForPersistentTimers$str() {
        return "WFLYEJB0327: Os manuseios de temporizador%1$s estão apenas disponíveis para temporizadores persistentes.";
    }
    @Override
    protected String noMoreTimeoutForTimer$str() {
        return "WFLYEJB0328: Não há mais intervalos para o temporizador %1$s";
    }
    @Override
    protected String invalidTimerNotCalendarBaseTimer$str() {
        return "WFLYEJB0329: O temporizador %1$s não é um calendário baseado em temporizador";
    }
    @Override
    protected String timerHasExpired$str() {
        return "WFLYEJB0330: O temporizador %1$s expirou";
    }
    @Override
    protected String timerWasCanceled$str() {
        return "WFLYEJB0331: O timer %1$s foi cancelado";
    }
    @Override
    protected String timerServiceWithIdNotRegistered$str() {
        return "WFLYEJB0338: O timerservice com o timedObjectId: %1$s não está registrado";
    }
    @Override
    protected String timerHandleIsNotActive$str() {
        return "WFLYEJB0339: O timer para manuseio com identificação do timer: %1$s, timedObjectId: %2$s não está ativo";
    }
    @Override
    protected String failToInvokegetTimeoutMethod$str() {
        return "WFLYEJB0341: Não foi possível invocar o getTimeoutMethod num timer uma vez que isto não é um timer automático";
    }
    @Override
    protected String failToLoadDeclaringClassOfTimeOut$str() {
        return "WFLYEJB0342: Não foi possível carregar a classe declarada: o %1$s do tempo limite de método";
    }
    @Override
    protected String failToInvokeTimeout$str() {
        return "WFLYEJB0343: Não foi possível invocar o tempo limite do método, uma vez que o método %1$s não é um tempo limite de método";
    }
    @Override
    protected String failToCreateTimerFileStoreDir$str() {
        return "WFLYEJB0344: Não foi possível criar o diretório de armazenamento de arquivos do temporizador %1$s";
    }
    @Override
    protected String timerFileStoreDirNotExist$str() {
        return "WFLYEJB0345: Diretório de armazenamento do arquivo %1$s não existe";
    }
    @Override
    protected String invalidTimerFileStoreDir$str() {
        return "WFLYEJB0346: Diretório de armazenamento de arquivos %1$s não é um diretório";
    }
    @Override
    protected String invalidSecurityForDomainSet$str() {
        return "WFLYEJB0347: Jakarta Enterprise Beans %1$sestá habilitado para segurança, mas não tem um conjunto de domínios de segurança";
    }
    @Override
    protected String invalidComponentConfiguration$str() {
        return "WFLYEJB0348: %1$s não é um componente do Jakarta Enterprise Beans";
    }
    @Override
    protected String failToLoadViewClassEjb$str() {
        return "WFLYEJB0349: Não foi possível carregar a classe de visualização para o ejb %1$s";
    }
    @Override
    protected String invalidEjbComponent$str() {
        return "WFLYEJB0350: O componente com nome %1$s e classe de componente %2$s não é um componente do Jakarta Enterprise Beans";
    }
    @Override
    protected String invalidComponentType$str() {
        return "WFLYEJB0356: O tipo %1$s de componente de Jakarta Enterprise Beans não suporta pools";
    }
    @Override
    protected String unknownComponentType$str() {
        return "WFLYEJB0357: Tipo de componente desconhecido do Jakarta Enterprise Beans %1$s";
    }
    @Override
    protected String failProcessInvocation$str() {
        return "WFLYEJB0363: O %1$s não pode manusear o método %2$s da classe de visualização %3$s. O método de visualização esperado deve ser %4$s na classe de visualização %5$s";
    }
    @Override
    protected String invocationOfMethodNotAllowed$str() {
        return "WFLYEJB0364: A invocação no método: %1$s do bean: %2$s não é permitida";
    }
    @Override
    protected String unknownComponentDescriptionType$str() {
        return "WFLYEJB0365: Descrição do componente de Jakarta Enterprise Beans desconhecido tipo %1$s";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYEJB0366: Atributo %1$s Desconhecido";
    }
    @Override
    protected String unknownOperations$str() {
        return "WFLYEJB0367: Operação %1$s Desconhecida";
    }
    @Override
    protected String noComponentRegisteredForAddress$str() {
        return "WFLYEJB0368: Nenhum componente de Jakarta Enterprise Beans registrado para o endereço %1$s";
    }
    @Override
    protected String noComponentAvailableForAddress$str() {
        return "WFLYEJB0369: Nenhum componente de Jakarta Enterprise Beans está disponível para o endereço %1$s";
    }
    @Override
    protected String componentClassHasMultipleTimeoutAnnotations$str() {
        return "WFLYEJB0372: Classe %1$s do componente possui múltiplas @Timeout";
    }
    @Override
    protected String currentComponentNotAEjb$str() {
        return "WFLYEJB0373: O componente atual não é um bean do Jakarta Enterprise Beans %1$s";
    }
    @Override
    protected String lifecycleMethodNotAllowed$str() {
        return "WFLYEJB0374: %1$s não é permitido nos métodos de ciclo de vida";
    }
    @Override
    protected String cannotCall$str() {
        return "WFLYEJB0376: Não foi possível chamar o %1$s na invocação através do %2$s ou do %3$s";
    }
    @Override
    protected String notAllowedFromStatefulBeans$str() {
        return "WFLYEJB0377: %1$s não é permitido a partir dos beans com estado";
    }
    @Override
    protected String failedToAcquirePermit$str() {
        return "WFLYEJB0378: Falha ao adquirir uma permissão com %1$s %2$s";
    }
    @Override
    protected String acquireSemaphoreInterrupted$str() {
        return "WFLYEJB0379: O semáforo de aquisição foi interrompido";
    }
    @Override
    protected String couldNotFindClassLoaderForStub$str() {
        return "WFLYEJB0382: Não foi possível determinar o Classloader para o stub %1$s";
    }
    @Override
    protected String unknownMessageListenerType$str() {
        return "WFLYEJB0383: Nenhum ouvinte da mensagem do tipo %1$s foi encontrado no adaptador de recurso %2$s";
    }
    @Override
    protected String couldNotFindViewMethodOnEjb$str() {
        return "WFLYEJB0384: Não foi possível encontrar o método %1$s da visualização %2$s na classe %3$s de Jakarta Enterprise Beans";
    }
    @Override
    protected String stringParamCannotBeNullOrEmpty$str() {
        return "WFLYEJB0385: O %1$s não pode ser nulo ou vazio";
    }
    @Override
    protected String cannotRemoveWhileParticipatingInTransaction$str() {
        return "WFLYEJB0386: Jakarta Enterprise Beans 4.6.4 Não é possível remover Jakarta Enterprise Beans através do método Enterprise Beans 2.x remove() enquanto participa de uma transação";
    }
    @Override
    protected String transactionPropagationNotSupported$str() {
        return "WFLYEJB0387: A propagação da transação sobre o IIOP não é suportada";
    }
    @Override
    protected String cannotCallMethodInAfterCompletion$str() {
        return "WFLYEJB0388: Não foi possível chamar o método %1$s na chamada de retorno do afterCompletion";
    }
    @Override
    protected String cannotCallMethod$str() {
        return "WFLYEJB0389: Não foi possível chamar o %1$s quando o estado for %2$s";
    }
    @Override
    protected String existingSerializationGroup$str() {
        return "WFLYEJB0390: %1$s já está associado com o grupo de serialização %2$s";
    }
    @Override
    protected String incompatibleSerializationGroup$str() {
        return "WFLYEJB0391: %1$s não é compatível com o grupo de serialização %2$s";
    }
    @Override
    protected String cacheEntryInUse$str() {
        return "WFLYEJB0392: Entrada de cache %1$s está em uso";
    }
    @Override
    protected String cacheEntryNotInUse$str() {
        return "WFLYEJB0393: Entrada de cache %1$s não está em uso";
    }
    @Override
    protected String lockAcquisitionInterrupted$str() {
        return "WFLYEJB0394: Falha ao adquirir bloqueio no %1$s";
    }
    @Override
    protected String duplicateSerializationGroupMember$str() {
        return "WFLYEJB0395: %1$s já é um membro do grupo de serialização %2$s";
    }
    @Override
    protected String missingSerializationGroupMember$str() {
        return "WFLYEJB0396: %1$s não é um membro do grupo de serialização %2$s";
    }
    @Override
    protected String duplicateCacheEntry$str() {
        return "WFLYEJB0397: %1$s já existe no cache ";
    }
    @Override
    protected String missingCacheEntry$str() {
        return "WFLYEJB0398: %1$s está faltando no cache ";
    }
    @Override
    protected String incompatibleCaches$str() {
        return "WFLYEJB0399: As implantações do cache incompatíveis numa hierarquia aninhada";
    }
    @Override
    protected String passivationFailed$str() {
        return "WFLYEJB0400: Falha ao passivar %1$s";
    }
    @Override
    protected String activationFailed$str() {
        return "WFLYEJB0401: Falha ao ativar %1$s";
    }
    @Override
    protected String passivationDirectoryCreationFailed$str() {
        return "WFLYEJB0402: Falha ao criar o diretório de passivação: %1$s";
    }
    @Override
    protected String passivationPathNotADirectory$str() {
        return "WFLYEJB0403: Falha ao criar o diretório de passivação: %1$s";
    }
    @Override
    protected String groupCreationContextAlreadyExists$str() {
        return "WFLYEJB0404: O contexto de criação do grupo já existe";
    }
    @Override
    protected String ejbNotFound3$str() {
        return "WFLYEJB0405: Nenhum Jakarta Enterprise Beans encontrado com interface do tipo '%1$s' e nome '%2$s' para a associação %3$s";
    }
    @Override
    protected String ejbNotFound2$str() {
        return "WFLYEJB0406: Não foi encontrado nenhum Jakarta Enterprise Beans com interface do tipo '%1$s' para associação %2$s";
    }
    @Override
    protected String moreThanOneEjbFound3$str() {
        return "WFLYEJB0408: Mais de um Jakarta Enterprise Beans encontrado com interface do tipo '%1$s' para a associação %2$s. Encontrado: %3$s";
    }
    @Override
    protected String clusteredAnnotationIsNotApplicableForMDB$str() {
        return "WFLYEJB0409: A anotação @Clustered não pode ser usada com os beans controlados por mensagem. %1$s falhou uma vez que o bean %2$s está marcado com o @Clustered na classe %3$s";
    }
    @Override
    protected String clusteredAnnotationIsNotApplicableForEntityBean$str() {
        return "WFLYEJB0410: A anotação @Clustered não pode ser usada com os beans de entidade. %1$s falhou uma vez que o bean %2$s está marcado com o @Clustered na classe %3$s";
    }
    @Override
    protected String clusteredAnnotationNotYetImplementedForSingletonBean$str() {
        return "WFLYEJB0411: A anotação @Clustered não é suportada pelo sigleton de Jakarta Enterprise Beans. %1$s falhou uma vez que o bean %2$s está marcado com o @Clustered na classe %3$s";
    }
    @Override
    protected String clusteredAnnotationIsNotApplicableForBean$str() {
        return "WFLYEJB0412: %1$s falhou uma vez que a anotação @Clustered não pode ser usada para o bean %2$s na classe %3$s";
    }
    @Override
    protected String sessionTypeNotSpecified$str() {
        return "WFLYEJB0413: <session-type> não especificado para Jakarta Enterprise Beans %1$s. Isto deve estar presente em ejb-jar.xml";
    }
    @Override
    protected String defaultInterceptorsNotSpecifyOrder$str() {
        return "WFLYEJB0414: Os interceptores padrão não podem especificar o elemento <interceptor-order> no ejb-jar.xml";
    }
    @Override
    protected String paramCannotBeNull$str() {
        return "WFLYEJB0416: %1$s não pode ser nulo.";
    }
    @Override
    protected String poolNameCannotBeEmptyString$str() {
        return "WFLYEJB0419: O nome do pool não pode ser uma cadeia de caracteres vazia para o bean %1$s";
    }
    @Override
    protected String noEjbContextAvailable$str() {
        return "WFLYEJB0420: Não há EjbContext disponível, pois não há invocação ativa de Jakarta Enterprise Beans";
    }
    @Override
    protected String componentIsShuttingDown$str() {
        return "WFLYEJB0421: A invocação não pode proceder uma vez que o componente está sendo encerrado";
    }
    @Override
    protected String failedToCreateSessionForStatefulBean$str() {
        return "WFLYEJB0423: Não foi possível criar a sessão para o bean de estado %1$s";
    }
    @Override
    protected String unknownChannelCreationOptionType$str() {
        return "WFLYEJB0436: Tipo de opção de criação de canal desconhecido %1$s";
    }
    @Override
    protected String couldNotDetermineRemoteInterfaceFromHome$str() {
        return "WFLYEJB0437: Não foi possível determinar a interface remota a partir da interface principal %1$s para o bean %2$s";
    }
    @Override
    protected String couldNotDetermineLocalInterfaceFromLocalHome$str() {
        return "WFLYEJB0438: Não foi possível determinar a interface local a partir da interface principal local %1$s para o bean %2$s";
    }
    @Override
    protected String unexpectedError$str() {
        return "WFLYEJB0442: Erro inesperado";
    }
    @Override
    protected String transactionNotComplete1$str() {
        return "WFLYEJB0443: Enterprise Beans 3.1 FR 13.3.3: BMT bean %1$s deve completar a transação antes de retornar.";
    }
    @Override
    protected String asymmetricCacheUsage$str() {
        return "WFLYEJB0445: Detectado o uso assimétrico de cache";
    }
    @Override
    protected String timerIsActive$str() {
        return "WFLYEJB0446: O temporizador %1$s já esta ativo. ";
    }
    @Override
    protected String transactionAlreadyRolledBack$str() {
        return "WFLYEJB0447: A transação '%1$s' já foi revertida";
    }
    @Override
    protected String transactionInUnexpectedState$str() {
        return "WFLYEJB0448: A transação '%1$s' está num estado inesperado (%2$s)";
    }
    @Override
    protected String timerServiceMethodNotAllowedForSFSB$str() {
        return "WFLYEJB0449: A API do Timerservice não está autorizada no estado de bean de sessão %1$s";
    }
    @Override
    protected String entityBeansAreNotSupported$str() {
        return "WFLYEJB0450: Os Beans de entidade não são mais suportados, %1$s beans não podem ser implementados. ";
    }
    @Override
    protected String inconsistentAttributeNotSupported$str() {
        return "WFLYEJB0451: O atributo '%1$s' não recebe suporte nos servidores da versão atual; somente é permitido se o valor coincidir com '%2$s'";
    }
    @Override
    protected String failedToPersistTimer$str() {
        return "WFLYEJB0453: Falha ao persistir temporizador %1$s";
    }
    @Override
    protected String mustOnlyBeSingleContainerTransactionElementWithWildcard$str() {
        return "WFLYEJB0454: Apenas uma instância no <container-transaction> com um ejb-name de * pode estar presente.";
    }
    @Override
    protected String wildcardContainerTransactionElementsMustHaveWildcardMethodName$str() {
        return "WFLYEJB0455: <container-transaction> elementos que usam o nome curinga de Jakarta Enterprise Beans * só podem usar um nome de método de *";
    }
    @Override
    protected String failedToRefreshTimers$str() {
        return "WFLYEJB0456: Falha ao atualizar temporizadores para %1$s";
    }
    @Override
    protected String unexpectedErrorRolledBack$str() {
        return "WFLYEJB0457: Erro inesperado";
    }
    @Override
    protected String relativeResourceAdapterNameInStandaloneModule$str() {
        return "WFLYEJB0459: O módulo %1$s contendo o bean %2$s não é implantado no ear, porém ele especifica o nome do adaptador de recurso '%3$s' em um formato relativo.";
    }
    @Override
    protected String wrongTransactionIsolationConfiguredForTimer$str() {
        return "WFLYEJB0460: A isolação da transação precisa ser igual ou mais restrita que READ_COMMITTED para garantir que o timer executa uma vez-e-apenas-uma vez";
    }
    @Override
    protected String timerUpdateFailedAndRollbackNotPossible$str() {
        return "WFLYEJB0461: A atualização do timer falhou e não foi possível reverter a transação!";
    }
    @Override
    protected String databaseDialectNotConfiguredOrDetected$str() {
        return "WFLYEJB0462: O atributo do banco de dados database-data-store do serviço do timer não está configurado e não é detectado pelos metadados de conexão ou pelo nome do driver JDBC.";
    }
    @Override
    protected String invalidTransactionTypeForSfsbLifecycleMethod$str() {
        return "WFLYEJB0463: Tipo %1$s de atributo de transação inválido no método %2$s de ciclo de vida SFSB da classe %3$s, tipos válidos são REQUIRES_NEW e NOT_SUPPORTED. Método será tratado como NOT_SUPPORTED.";
    }
    @Override
    protected String disableDefaultEjbPermissionsCannotBeTrue$str() {
        return "WFLYEJB0464: O atributo \"disable-default-ejb-permissions\" não deve ser definido para verdadeiro. ";
    }
    @Override
    protected String profileAndRemotingEjbReceiversUsedTogether$str() {
        return "WFLYEJB0465: Configuração de descritor de cliente inválida: 'profile' e 'remoting-ejb-receivers' não podem ser utilizados juntos. ";
    }
    @Override
    protected String failedToProcessBusinessInterfaces$str() {
        return "WFLYEJB0466: Falha no processamento de interfaces comerciais para a classe %1$s de Jakarta Enterprise Beans ";
    }
    @Override
    protected String containerSuspended$str() {
        return "WFLYEJB0467: A solicitação foi rejeitada pois o contêiner está suspenso. ";
    }
    @Override
    protected String timerInvocationFailed$str() {
        return "WFLYEJB0468: Falha ao invocar timer";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYEJB0469: Os recursos filhos indexados podem ser registrados somente se o recurso primário suportar filhos ordenados. O primário de '%1$s' não está indexado.";
    }
    @Override
    protected String rmiIiopVoliation$str() {
        return "WFLYEJB0471: Violação RMI/IIOP: %1$s%n";
    }
    @Override
    protected String exceptionRepositoryNotFound$str() {
        return "WFLYEJB0472: Não foi possível obter uma id do repositório de exceção para %1$s:%n%2$s";
    }
    @Override
    protected String jndiBindings$str() {
        return "WFLYEJB0473: As associações JNDI para o bean de sessão chamado '%1$s' na unidade de implementação '%2$s' são como segue:%3$s";
    }
    @Override
    protected String logInconsistentAttributeNotSupported$str() {
        return "WFLYEJB0474: O atributo '%1$s' não recebe suporte nos servidores da versão atual; somente permitido se seu valor coincidir com '%2$s'. Este atributo deve ser removido. ";
    }
    @Override
    protected String mdbDeliveryStarted$str() {
        return "WFLYEJB0475: A entrega de MDB foi iniciada: %1$s, %2$s";
    }
    @Override
    protected String mdbDeliveryStopped$str() {
        return "WFLYEJB0476: Entrega de MDB foi interrompida: %1$s, %2$s";
    }
    @Override
    protected String missingMdbDeliveryGroup$str() {
        return "WFLYEJB0477: Grupo de entrega MDB ausente: %1$s";
    }
    @Override
    protected String loadedPersistentTimerInTimeout$str() {
        return "WFLYEJB0480: O temporizador carregado (%1$s) para Jakarta Enterprise Beans (%2$s) e este nó que está marcado como se estivesse em um tempo limite. O tempo limite original pode não ter sido processado. Por favor, utilize encerramento automático para certificar-se que tarefas de tempo limite sejam finalizadas antes do enceramento.";
    }
    @Override
    protected String strictPoolDerivedFromWorkers$str() {
        return "WFLYEJB0481: O pool estrito %1$s está utilizando um tamanho de instância máximo de %2$d (por classe) que é derivado do tamanho de pool do thead de trabalho. ";
    }
    @Override
    protected String strictPoolDerivedFromCPUs$str() {
        return "WFLYEJB0482: O pool estrito %1$s está utilizando um tamanho de instância máximo de %2$d (por classe) que é derivado do número de CPUs neste host. ";
    }
    @Override
    protected String mutuallyExclusiveAttributes$str() {
        return "WFLYEJB0483: Os atributos são mutualmente exclusivos: %1$s, %2$s";
    }
    @Override
    protected String invalidTransactionTypeForMDB$str() {
        return "WFLYEJB0485: Tipo de transação %1$s não é especificado para o método %2$s do bean controlado por mensagem %3$s. Será administrado como NOT_SUPPORTED.";
    }
    @Override
    protected String remappingCacheAttributes$str() {
        return "WFLYEJB0486: O parâmetro 'default-clustered-sfsb-cache' foi definido para a operação 'add' para o recurso '%1$s'. Este parâmetro é obsoleto e seu comportamento prévio foi remapeado para o atributo 'default-sfsb-cache'. Como resultado o atributo 'default-sfsb-cache' foi definido para '%2$s' e o atributo 'default-sfsb-passivation-disabled-cache' foi definido para '%3$s'.";
    }
    @Override
    protected String unexpectedInvocationState$str() {
        return "WFLYEJB0487: Estado de invocação inesperado %1$s";
    }
    @Override
    protected String timerNotRunning$str() {
        return "WFLYEJB0489: Não foi possível iniciar o temporizador %1$s que não está em execução como transação";
    }
    @Override
    protected String multipleSecurityDomainsDetected$str() {
        return "WFLYEJB0490: Vários domínios de segurança não suportados";
    }
    @Override
    protected String cannotBeginUserTransaction$str() {
        return "WFLYEJB0491: A solicitação de início de transação foi rejeitada porque o contêiner está suspenso";
    }
    @Override
    protected String suspensionWaitingActiveTransactions$str() {
        return "WFLYEJB0492: Suspensão do subsistema de Jakarta Enterprise Beans aguardando por transações ativas, %1$d transação(ões) restante(s)";
    }
    @Override
    protected String suspensionComplete$str() {
        return "WFLYEJB0493: Suspensão completa do subsistema de Jakarta Enterprise Beans";
    }
    @Override
    protected String failedToObtainSSLContext$str() {
        return "WFLYEJB0494: Falha ao obter SSLContext";
    }
    @Override
    protected String scheduleExpressionDateFromTimerPersistenceInvalid$str() {
        return "WFLYEJB0495: Ignorando a data inicial ou final persistida para a expressão agendada do ID do temporizador:%1$s porque ela é inválida: %2$s.";
    }
    @Override
    protected String failedToCreateEJBClientInterceptor$str() {
        return "WFLYEJB0496: Não foi possível criar uma instância de interceptor de clientes %1$s de Jakarta Enterprise Beans";
    }
    @Override
    protected String failedToPersistTimerOnStartup$str() {
        return "WFLYEJB0497: Falha ao persistir temporizador %1$s na inicialização. Isso ocorre possivelmente devido a outro membro do cluster realizando a mesma alteração e não deve afetar a operação.";
    }
    @Override
    protected String cannotReadStrictMaxPoolDerivedSize$str() {
        return "WFLYEJB0499: Não é possível ler o tamanho derivado, serviço %1$s inacessível";
    }
    @Override
    protected String failedToActivateMdb$str() {
        return "WFLYEJB0501: Falha ao ativar MDB %1$s";
    }
    @Override
    protected String exceptionCheckingIfTimerShouldRun$str() {
        return "WFLYEJB0502: Exceção que verifica se o temporizador %1$s deve ser executado";
    }
    @Override
    protected String mdbOnMessageMethodCantBeFinal$str() {
        return "WFLYEJB0503: [Especificação Jakarta Enterprise Beans 3.2, seção 5.6.4] O método “onMessage” de Bean controlado por mensagens não pode ser final (MDB: %1$s).";
    }
    @Override
    protected String mdbOnMessageMethodCantBePrivate$str() {
        return "WFLYEJB0504: [Especificação Jakarta Enterprise Beans 3.2, seção 5.6.4] O método “onMessage” de Bean controlado por mensagens não pode ser privado (MDB: %1$s).";
    }
    @Override
    protected String mdbOnMessageMethodCantBeStatic$str() {
        return "WFLYEJB0505: [Especificação Jakarta Enterprise Beans 3.2, seção 5.6.4] O método “onMessage” de Bean controlado por mensagens não pode ser estático (MDB: %1$s).";
    }
    @Override
    protected String mdbCantHaveFinalizeMethod$str() {
        return "WFLYEJB0506: [Especificação Jakarta Enterprise Beans 3.2, seção 5.6.2] O Bean controlado por mensagem não pode ter um método de 'finalização'. (MDB: %1$s)";
    }
    @Override
    protected String exceptionPersistPostTimerState$str() {
        return "WFLYEJB0507: Falha ao persistir o estado do temporizador %1$s. O temporizador tem que ser restaurado manualmente";
    }
    @Override
    protected String exceptionPersistTimerState$str() {
        return "WFLYEJB0508: Falha ao persistir o estado do temporizador %1$s devido a %2$s";
    }
    @Override
    protected String clusteredEJBsBoundToINADDRANY$str() {
        return "WFLYEJB0509: Jakarta Enterprise Beans com cluster em Nó: %1$s são vinculados a INADDR_ANY(%2$s). Use um endereço de associação do servidor que não seja curinga ou adicione entradas de mapeamento do cliente à associação de socket relevante para o conector remoto";
    }
    @Override
    protected String missingRunAsAnnotation$str() {
        return "WFLYEJB0510: A anotação @RunAs é necessária ao usar @RunAsPrincipal na classe %1$s";
    }
    @Override
    protected String cannotBuildIndexForServerInterceptor$str() {
        return "WFLYEJB0511: Não é possível construir índice de reflexão para a classe de interceptor do servidor %1$s";
    }
    @Override
    protected String serverInterceptorNoEmptyConstructor$str() {
        return "WFLYEJB0512: A classe %1$s do interceptor do servidor não tem um construtor sem parâmetros";
    }
    @Override
    protected String serverInterceptorInvalidMethod$str() {
        return "WFLYEJB0513: Método %1$s no interceptador %2$s do servidor, anotado com %3$s tem assinatura inválida";
    }
    @Override
    protected String cannotLoadServerInterceptorModule$str() {
        return "WFLYEJB0514: Não é possível carregar o módulo %1$s de interceptor do servidor";
    }
    @Override
    protected String singletonCantImplementSessionBean$str() {
        return "WFLYEJB0515: [Especificação Jakarta Enterprise Beans 3.2, seção 4.9.2] Os beans de sessão singleton não podem implementar a interface “jakarta.ejb.SessionBean”. Essa interface no bean “%1$s” será ignorada e deve ser removida.";
    }
    @Override
    protected String iiopBindings$str() {
        return "WFLYEJB0516: As associações IIOP para sessão bean chamada '%1$s' na unidade de implementação '%2$s' são como segue:%3$s";
    }
    @Override
    protected String typeSpecViolation$str() {
        return "WFLYEJB0517: [Especificação Jakarta Enterprise Beans 3.2, seção 4.1] Violação especulativa para a classe %1$s. Sessão Jakarta Enterprise Beans deve ter apenas um dos seguintes tipos: Com Estado, Sem Estado, Singleton.";
    }
    @Override
    protected String cannotResolveFilteredClass$str() {
        return "WFLYEJB0518: Exceção que resolve a classe %1$s para o desempacotamento. Ela foi proibida ou não é permitida";
    }
    @Override
    protected String invalidFilterSpec$str() {
        return "WFLYEJB0519: Unmarshaling de filtros de especificação %1$s inválido. As especificações devem descrever padrões correspondentes de classes ou nomes de pacotes";
    }
    @Override
    protected String missingClassInAnnotation$str() {
        return "WFLYEJB0521: Algumas classes referenciadas por anotação: %1$s em classe: %2$s estão faltando.";
    }
    @Override
    protected String defaultPoolExpressionCouldNotBeResolved$str() {
        return "WFLYEJB0522: O nome padrão do pool %1$s não pôde ser resolvido a partir de seu valor: %2$s";
    }
    @Override
    protected String timerNotDeployed$str() {
        return "WFLYEJB0523: O temporizador %1$s não foi implantado";
    }
    @Override
    protected String timerCannotBeAdded$str() {
        return "WFLYEJB0524: O temporizador %1$s não pode ser nulo";
    }
    @Override
    protected String mappedNameNotSupported$str() {
        return "WFLYEJB0525: O 'mappedName' em anotações de Jacarta Enterprise Beans não é suportado. Valor de '%1$s' para Jacarta Enterprise Beans '%2$s' será ignorado.";
    }
    @Override
    protected String timerNotFound$str() {
        return "WFLYEJB0526: O timer %1$s não existe";
    }
    @Override
    protected String connectorNotConfiguredForEJBClientInvocations$str() {
        return "WFLYEJB0527: O conector remoto (endereço %1$s, porta %2$s) não está configurado corretamente para invocações de clientes EJB; o conector deve ser listado no atributo <remote/> 'conectores' para receber invocações de clientes EJB";
    }
    @Override
    protected String ejbBusinessMethodMustBePublic$str() {
        return "WFLYEJB0528: O método de negócios %1$s de Jakarta Enterprise Beans deve ser público";
    }
    @Override
    protected String failedToRetrieveTimerInfo$str() {
        return "WFLYEJB0529: Falha na recuperação de informações do banco de dados para o timer: %1$s";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYEJB0530: A implantação está configurada para usar um domínio de segurança legado “%1$s”, que não é mais compatível.";
    }
    @Override
    protected String legacyClientMappingsRegistryProviderInUse$str() {
        return "WFLYEJB0531: Nenhum provedor de registros de mapeamento de clientes encontrado para %1$s. Usando o provedor herdado baseado na configuração estática";
    }
    @Override
    protected String unknownDatabaseName$str() {
        return "WFLYEJB0532: O banco de dados detectado na configuração é: '%1$s'. Se isso estiver incorreto, especifique o banco de dados correto.";
    }
    @Override
    protected String invocationFailed0$str() {
        return "WFLYEJB0533: Falha na invocação";
    }
    @Override
    protected String authenticationFailed$str() {
        return "WFLYEJB0534: Falha na autenticação";
    }
    @Override
    protected String messageEndpointAlreadyReleasedISE$str() {
        return "WFLYEJB0535: O ponto de extremidade da mensagem %1$s já foi lançado";
    }
    @Override
    protected String unsupportedEJBReceiverProtocol$str() {
        return "WFLYEJB0536: Protocolo receptor EJB não compatível %1$s";
    }
}
