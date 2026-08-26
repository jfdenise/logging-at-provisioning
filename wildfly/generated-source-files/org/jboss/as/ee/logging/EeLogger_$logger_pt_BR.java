package org.jboss.as.ee.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:15+0200")
public class EeLogger_$logger_pt_BR extends EeLogger_$logger_pt implements EeLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public EeLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String nullOrEmptyResourceReferenceType$str() {
        return "WFLYEE0076: O tipo de referência do recurso não pode ser nulo ou vazio";
    }
    @Override
    protected String noMessageDestination$str() {
        return "WFLYEE0092: Nenhum destino de mensagem com o nome %1$s para o vínculo%2$s";
    }
    @Override
    protected String propertiesNotAllowedOnGlobalModules$str() {
        return "WFLYEE0100: Os módulos globais podem não especificar 'annotations', 'meta-inf' ou 'services'.";
    }
    @Override
    protected String nullName$str() {
        return "WFLYEE0115: O nome do %1$s é nulo";
    }
    @Override
    protected String earModuleChildOfLibraryDirectory$str() {
        return "WFLYEE0097: O módulo pode não ser um filho do diretório da biblioteca de EAR. Diretório da biblioteca: %1$s, nome do arquivo de módulo: %2$s";
    }
    @Override
    protected String annotationAttributeMissing$str() {
        return "WFLYEE0020: As anotações do %1$s devem fornecer um %2$s.";
    }
    @Override
    protected String cannotAddRemotingReceiver$str() {
        return "WFLYEE0139: Não é possível adicionar um receptor remoto que faça referência a uma conexão de saída nula/vazia";
    }
    @Override
    protected String classDoesNotImplementAllInterfaces$str() {
        return "WFLYEE0114: A classe não implementa todas as interfaces fornecidas";
    }
    @Override
    protected String executorServiceNotFound$str() {
        return "WFLYEE0120: Falha ao localizar o serviço de executor '%1$s'";
    }
    @Override
    protected String componentNotFound$str() {
        return "WFLYEE0045: Nenhum componente encontrado para o tipo %1$s";
    }
    @Override
    protected String cannotDetermineType3$str() {
        return "WFLYEE0026: Não foi possível determinar o tipo para o %1$s %2$s por favor especifique o %3$s.";
    }
    @Override
    protected String cannotLoad$str() {
        return "WFLYEE0027: Não foi possível carregar o %1$s referenciado no-env-entry";
    }
    @Override
    protected String noComponentInstance$str() {
        return "WFLYEE0073: Nenhuma instância do componente associada";
    }
    @Override
    protected String conflictingBinding$str() {
        return "WFLYEE0047: Conflito de incompatibilidade de vínculo na %1$s fonte:%2$s";
    }
    @Override
    protected String invalidReturnType$str() {
        return "WFLYEE0064: O tipo de retorno do %1$s é requerido para o método %2$s anotado com %3$s na classe %4$s";
    }
    @Override
    protected String concurrentContextServiceNotInstalled$str() {
        return "WFLYEE0106: O serviço EE Concurrent Context %1$s não está instalado.";
    }
    @Override
    protected String rollbackOfTransactionStartedInEEConcurrentInvocation$str() {
        return "WFLYEE0015: Transação iniciou com a invocação de EE Concurrent deixada aberta, iniciando reversão para evitar vazamento. ";
    }
    @Override
    protected String failedToRead2$str() {
        return "WFLYEE0055: Falha ao ler as entradas%1$s para o aplicativo [%2$s]";
    }
    @Override
    protected String nullResourceReference$str() {
        return "WFLYEE0077: Não foi possível registrar um processador de referência do recurso nulo";
    }
    @Override
    protected String componentIsStopped$str() {
        return "WFLYEE0043: O componente foi interrompido";
    }
    @Override
    protected String unsupportedModuleType$str() {
        return "WFLYEE0095: Tipo de módulo de ear não suportado: %1$s";
    }
    @Override
    protected String failedToRead4$str() {
        return "WFLYEE0057: Falha ao ler as entradas %1$s para o componente [%2$s, %3$s, %4$s]";
    }
    @Override
    protected String systemErrorWhileCheckingForTransactionLeak$str() {
        return "WFLYEE0018: Erro de sistema enquanto verificava vazamento de transação em invocação EE Concurrent.";
    }
    @Override
    protected String priorityAlreadyExists$str() {
        return "WFLYEE0079: Não foi possível adicionar %1$s, 0x%2$s de prioridade já foi tomado pelo %3$s";
    }
    @Override
    protected String cannotDetermineType1$str() {
        return "WFLYEE0025: Não foi possível determinar o tipo para resource-env-ref %1$s";
    }
    @Override
    protected String oneGlobalDirectory$str() {
        return "WFLYEE0123: O diretório global %1$snão pode ser adicionado, porque o diretório global%2$s já está definido.";
    }
    @Override
    protected String hungTaskNotCancelled$str() {
        return "WFLYEE0130: %1$s tarefa suspensa %2$s não cancelada";
    }
    @Override
    protected String defaultConstructorNotFound$str() {
        return "WFLYEE0048: Não foi possível encontrar o construtor padrão para o %1$s";
    }
    @Override
    protected String invalidMaxThreads$str() {
        return "WFLYEE0113: O valor de max-threads %1$d não pode ser menor que o valor de core-threads %2$d.";
    }
    @Override
    protected String failedToProcessEJBClientDescriptor$str() {
        return "WFLYEE0089: Falha ao processar o jboss-ejb-client.xml";
    }
    @Override
    protected String methodNotFound3$str() {
        return "WFLYEE0068: Nenhum método coincidente encontrado para o método %1$s (%2$s) no %3$s";
    }
    @Override
    protected String injectionTargetNotFound$str() {
        return "WFLYEE0059: Nenhum destino de injeção encontrado";
    }
    @Override
    protected String multipleComponentsFound$str() {
        return "WFLYEE0070: Foram encontrados componentes múltiplos para o tipo '%1$s'";
    }
    @Override
    protected String cannotLoadInterceptor2$str() {
        return "WFLYEE0029: Não foi possível carregar a classe do interceptor %1$s no componente %2$s";
    }
    @Override
    protected String componentClassHasErrors$str() {
        return "WFLYEE0041: O %1$s da classe do componente para o %2$s do componente possui erros: %n%3$s";
    }
    @Override
    protected String unableToStartException$str() {
        return "WFLYEE0125: Não foi possível iniciar o serviço %1$s";
    }
    @Override
    protected String cannotParseResourceRefUri$str() {
        return "WFLYEE0032: Não foi possível analisar o URI da fonte de referência: %1$s";
    }
    @Override
    protected String circularDependency$str() {
        return "WFLYEE0037: Instalação de dependência circular %1$s";
    }
    @Override
    protected String failedToLoadJbossProperties$str() {
        return "WFLYEE0094: Falha ao carregar jboss.properties";
    }
    @Override
    protected String errorEqualsCannotBeCalledBeforeResolve$str() {
        return "WFLYEE0137: O erro equals() não pode ser chamado antes de resolve()";
    }
    @Override
    protected String elementAttributeMissing$str() {
        return "WFLYEE0051: Os elementos do %1$s devem fornecer um %2$s.";
    }
    @Override
    protected String multipleMethodsFound$str() {
        return "WFLYEE0071: Mais de um método coincidente encontrado para o método '%1$s (%2$s) no %3$s";
    }
    @Override
    protected String instanceDataCanOnlyBeSetDuringConstruction$str() {
        return "WFLYEE0108: Os dados de instâncias podem ser apenas determinados durante a construção";
    }
    @Override
    protected String failedToLoadConcurrencyImplementation$str() {
        return "WFLYEE0142: Falha ao carregar a implementação do Jakarta Concurrency";
    }
    @Override
    protected String cannotResolveMethod$str() {
        return "WFLYEE0034: Não foi possível resolver o método %1$s na classe %2$s com as anotações %3$s";
    }
    @Override
    protected String cannotConfigureComponent$str() {
        return "WFLYEE0024: Não foi possível configurar o componente %1$s";
    }
    @Override
    protected String defaultConstructorNotFoundOnComponent$str() {
        return "WFLYEE0050: Nenhum construtor padrão para a classe interceptora %1$s no componente %2$s";
    }
    @Override
    protected String cannotRunScheduledTask$str() {
        return "WFLYEE0111: Não foi possível executar a tarefa programada %1$s pois o recipiente esta suspenso";
    }
    @Override
    protected String viewMethodNotFound$str() {
        return "WFLYEE0086: Não foi possível encontrar o método %1$s %2$s na visualização %3$s de %4$s";
    }
    @Override
    protected String methodNotFound1$str() {
        return "WFLYEE0067: O método não existe %1$s";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYEE0066: Valor inválido: %1$s para o elemento '%2$s'";
    }
    @Override
    protected String componentViewConstructionFailure$str() {
        return "WFLYEE0046: Falha ao instanciar a visualização do componente";
    }
    @Override
    protected String managedReferenceMethodWasNull$str() {
        return "WFLYEE0132: ManagedReference foi nula e a injeção não é opcional para injeção no método %1$s";
    }
    @Override
    protected String invalidNamePrefix$str() {
        return "WFLYEE0127: Segmento de nome'%1$s inválido '' para env, nome não pode começar com o prefixo '/', o prefixo foi removido";
    }
    @Override
    protected String errorDeletingJACCPolicy$str() {
        return "WFLYEE0124: Erro ao eliminar a Política de Autorização de Jakarta";
    }
    @Override
    protected String failedToRollbackTransaction$str() {
        return "WFLYEE0016: Falha ao reverter transação. ";
    }
    @Override
    protected String multipleUsesOfAllRemaining$str() {
        return "WFLYEE0134: Múltiplos usos de ContextServiceDefinition.ALL_REMAINING";
    }
    @Override
    protected String cannotAddHTTPConnection$str() {
        return "WFLYEE0140: Não é possível adicionar uma conexão HTTP que faça referência a um URI nulo/vazio";
    }
    @Override
    protected String componentConstructionFailure$str() {
        return "WFLYEE0042: Falha ao construir a instância do componente";
    }
    @Override
    protected String invalidInjectionTarget$str() {
        return "WFLYEE0062: Destino de injeção %1$s na classe %2$s não é compatível com o tipo de injeção: %3$s";
    }
    @Override
    protected String invalidManagedBeanAbstractOrFinal$str() {
        return "WFLYEE0009: [Bean spec gerenciado, sessão %1$s] A classe de implementação do Bean gerenciado NÂO PODE ser uma interface - %2$s é uma interface, portanto não poderá ser considerada como um Bean gerenciável.";
    }
    @Override
    protected String aroundInvokeAnnotationUsedTooManyTimes$str() {
        return "WFLYEE0109: Uma classe não deve declarar mais do que um método AroundInvoke. %1$s possui %2$s métodos anotados.";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYEE0082: O serviço não foi inicializado";
    }
    @Override
    protected String invalidSignature$str() {
        return "WFLYEE0065: Assinatura inválida para o método %1$s anotado com %2$s na classe %3$s, a assinatura deve ser '%4$s'";
    }
    @Override
    protected String nullVar3$str() {
        return "WFLYEE0116: %1$s é nulo em %2$s %3$s";
    }
    @Override
    protected String factoryAlreadyExists$str() {
        return "WFLYEE0104: O EE Concurrent Context %1$s já possui criador nomeado %2$s";
    }
    @Override
    protected String cannotResolve$str() {
        return "WFLYEE0002: Não foi possível resolver o %1$s %2$s";
    }
    @Override
    protected String attributeNoLongerSupported$str() {
        return "WFLYEE0131: O atributo %1$s não é mais compatível.";
    }
    @Override
    protected String errorParsingEJBClientDescriptor$str() {
        return "WFLYEE0091: %1$s";
    }
    @Override
    protected String hungTaskCancelled$str() {
        return "WFLYEE0129: %1$s tarefa suspensa %2$s cancelada";
    }
    @Override
    protected String invalidNumberOfArguments$str() {
        return "WFLYEE0063: Número inválido de argumentos para o método %1$s anotado com %2$s na classe %3$s";
    }
    @Override
    protected String cannotResolveInjectionPoint$str() {
        return "WFLYEE0033: Não foi possível resolver a ponte de injeção %1$s na classe %2$s especificada no web.xml";
    }
    @Override
    protected String unsupportedExecutorServiceMetric$str() {
        return "WFLYEE0121: Atributo '%1$s' não compatível";
    }
    @Override
    protected String securityManagerNotAllowed$str() {
        return "WFLYEE0141: A execução com um SecurityManager habilitado não é permitida em um ambiente Jakarta EE 11 ou posterior";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYEE0053: Falha ao analisar %1$s";
    }
    @Override
    protected String invalidCoreThreadsSize$str() {
        return "WFLYEE0112: O valor de core-threads deve ser maior que 0 quando o tamanho da fila for %1$s";
    }
    @Override
    protected String componentAlreadyDefined$str() {
        return "WFLYEE0040: O componente “%1$s” na classe “%2$s” já está definido na classe “%3$s”";
    }
    @Override
    protected String cannotBeNullOrEmpty$str() {
        return "WFLYEE0023: O %1$s não pode ser nulo ou vazio";
    }
    @Override
    protected String duplicateJndiBindingFound$str() {
        return "WFLYEE0133: Uma ligação JNDI para o componente “%1$s” já foi instalada sob o nome JNDI “%2$s” de acordo com as especificações de Jakarta EE. A classe conflitante é %3$s. As soluções incluem o fornecimento de um nome alternativo para o componente ou a renomeação da classe.";
    }
    @Override
    protected String factoryNotFound$str() {
        return "WFLYEE0105: O EE Concurrent Context %1$s não possui criador nomeado %2$s";
    }
    @Override
    protected String serializationMustBeHandledByTheFactory$str() {
        return "WFLYEE0103: A serialização EE Concurrent ContextHandle deve ser administrada pela fábrica. ";
    }
    @Override
    protected String preDestroyInterceptorFailure$str() {
        return "WFLYEE0011: Exceção ao invocar o interceptor de pré-destruição para a classe do componente: %1$s";
    }
    @Override
    protected String alternateDeploymentDescriptor$str() {
        return "WFLYEE0019: Não foi possível encontrar o descritor alternativo de implantação %1$s especificado para o %2$s";
    }
    @Override
    protected String cannotProcessEarModule$str() {
        return "WFLYEE0031: Não foi possível processar os módulos no application.xml para o EAR [%1$s], arquivo de módulo %2$s não foi encontrado";
    }
    @Override
    protected String invalidCharacterLength$str() {
        return "WFLYEE0060: %1$s do tipo java.lang.Character não tem exatamente um caractere de comprimento %2$s";
    }
    @Override
    protected String huntTaskTerminationFailure$str() {
        return "WFLYEE0128: Falha ao terminar %1$s tarefa suspensa %2$s";
    }
    @Override
    protected String failedToRunTask$str() {
        return "WFLYEE0110: Falha ao executar a tarefa agendada: %1$s";
    }
    @Override
    protected String cannotLoadInterceptor1$str() {
        return "WFLYEE0028: Não foi possível carregar a classe do interceptor %1$s";
    }
    @Override
    protected String failureWhileRunningTask$str() {
        return "WFLYEE0136: Falha ao executar a tarefa agendada: %1$s";
    }
    @Override
    protected String fieldNotFound$str() {
        return "WFLYEE0058: Não foi encontrado nenhum campo correspondente para o '%1$s'";
    }
    @Override
    protected String multipleSetterMethodsFound$str() {
        return "WFLYEE0072: Vários métodos de configurador para %1$s na classe %2$s encontrados ao aplicar <injection-target> para env-entry";
    }
    @Override
    protected String componentDestroyFailure$str() {
        return "WFLYEE0006: Falha ao destruir a instância do componente %1$s";
    }
    @Override
    protected String classOnlyAnnotation$str() {
        return "WFLYEE0038: A anotação %1$s está apenas permitida em uma classe. %2$s não é uma classe.";
    }
    @Override
    protected String moreThanOneMessageDestination$str() {
        return "WFLYEE0093: Mais de um destino de mensagem com o nome %1$s para o vínculo %2$s de destinos: %3$s";
    }
    @Override
    protected String unknownAnnotationTargetType$str() {
        return "WFLYEE0084: Tipo de AnnotationTarget desconhecido: %1$s";
    }
    @Override
    protected String unexpectedElement$str() {
        return "WFLYEE0088: Elemento '%1$s' inesperado encontrado";
    }
    @Override
    protected String cannotAddMoreItems$str() {
        return "WFLYEE0021: Não foi possível adicionar mais itens uma vez que o getSortedItems() foi chamado";
    }
    @Override
    protected String hungTaskTerminationPeriodIsNotBiggerThanZero$str() {
        return "WFLYEE0138: hungTaskTerminationPeriod não é > 0";
    }
    @Override
    protected String setterMethodOnly$str() {
        return "WFLYEE0083: Destino de injeção %1$s é inválido. Apenas métodos de configurador são permitidos: %2$s";
    }
    @Override
    protected String concurrentServiceValueUninitialized$str() {
        return "WFLYEE0102: Valor do serviço EE Concurrent Service não inicializado. ";
    }
    @Override
    protected String methodOnlyAnnotation$str() {
        return "WFLYEE0069: @%1$s é apenas válido nos destinos do método.";
    }
    @Override
    protected String managedReferenceWasNull$str() {
        return "WFLYEE0098: O ManagedReference foi nulo e a injeção não é opcional para a injeção no campo %1$s";
    }
    @Override
    protected String cannotSetField$str() {
        return "WFLYEE0117: Não é possível definir o campo %1$s, o objeto de %2$s carregado por %3$s não pode ser atribuído a %4$s carregado por %5$s";
    }
    @Override
    protected String lifecycleOperationNotSupported$str() {
        return "WFLYEE0143: Operação de ciclo de vida não compatível";
    }
    @Override
    protected String invalidDescriptor$str() {
        return "WFLYEE0061: %1$s não é um descritor válido ";
    }
    @Override
    protected String failedToInstallComponent$str() {
        return "WFLYEE0052: Falha ao instalar o componente %1$s";
    }
    @Override
    protected String globalDirectoryDoNotExist$str() {
        return "WFLYEE0122: O caminho do diretório%1$s no recurso %2$sglobal-directory não aponta para um diretório válido.";
    }
    @Override
    protected String failedToProcessChild$str() {
        return "WFLYEE0054: Falha ao processar o filho para o EAR [%1$s]";
    }
    @Override
    protected String componentNotAvailable$str() {
        return "WFLYEE0044: O componente não está disponível";
    }
    @Override
    protected String xmlErrorParsingEJBClientDescriptor$str() {
        return "WFLYEE0090: Foi encontrada uma exceção do analisar o arquivo jboss-ejb-client.xml no %1$s";
    }
    @Override
    protected String failedToSuspendTransaction$str() {
        return "WFLYEE0017: Falha ao suspender a transação. ";
    }
    @Override
    protected String nullOrEmptyManagedBeanClassName$str() {
        return "WFLYEE0075: O nome da classe do bean gerenciado não pode ser nulo ou vazio";
    }
    @Override
    protected String unknownElementType$str() {
        return "WFLYEE0085: Desconhecido %1$sde tipo %2$s";
    }
    @Override
    protected String failedToResumeTransaction$str() {
        return "WFLYEE0135: Falha ao retomar a transação.";
    }
    @Override
    protected String subdeploymentIgnored$str() {
        return "WFLYEE0014: %1$s ignorado na subimplantação. O jboss-ejb-client.xml é apenas analisado para as implantações de nível superior.";
    }
    @Override
    protected String cannotBeEmpty$str() {
        return "WFLYEE0022: O %1$s não pode estar vazio";
    }
    @Override
    protected String cannotSpecifyBoth$str() {
        return "WFLYEE0036: Não foi possível especificar ambos %1$s e o %2$s numa entrada de ambiente.";
    }
    @Override
    protected String nullBindingName$str() {
        return "WFLYEE0074: O nome de vínculo não pode ser nulo: %1$s";
    }
    @Override
    protected String rejectedDueToMaxRequests$str() {
        return "WFLYEE0126: Rejeitado devido ao número máximo de solicitações";
    }
    @Override
    protected String nullVar1$str() {
        return "WFLYEE0078: %1$s é nulo";
    }
    @Override
    protected String cannotLoadViewClass$str() {
        return "WFLYEE0030: Não foi possível carregar a classe de visualização %1$s para o componente %2$s";
    }
    @Override
    protected String failedToRead3$str() {
        return "WFLYEE0056: Falha ao ler as entradas %1$s para o módulo [%2$s, %3$s]";
    }
    @Override
    protected String invalidManagedBeanInterface$str() {
        return "WFLYEE0010: [Bean spec gerenciado, sessão %1$s] A classe da implementação do bean gerenciado NÃO PODE ser abstrata ou final - o %2$s não será considerado como um Bean gerenciado, uma vez que não satisfaz o requisito.";
    }
    @Override
    protected String componentInstallationFailure$str() {
        return "WFLYEE0007: Nenhuma instalação do componente opcional %1$s devido à uma exceção (habilite o nível do log DEPURAR para verificar a causa)";
    }
    @Override
    protected String rootAsLibraryDirectory$str() {
        return "WFLYEE0096: biblioteca-diretório de valor / não suportado";
    }
    @Override
    protected String transactionSetupProviderServiceNotInstalled$str() {
        return "WFLYEE0107: O serviço de fornecimento de instalação de transação EE Concurrent não instalado. ";
    }
}
