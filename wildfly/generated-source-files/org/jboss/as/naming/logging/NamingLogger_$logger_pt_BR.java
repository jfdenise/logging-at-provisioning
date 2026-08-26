package org.jboss.as.naming.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:42+0200")
public class NamingLogger_$logger_pt_BR extends NamingLogger_$logger_pt implements NamingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public NamingLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String startingService$str() {
        return "WFLYNAM0003: Iniciando o Serviço de Nomeação";
    }
    @Override
    protected String duplicateBinding$str() {
        return "WFLYNAM0023: Vínculos JNDI duplicados para '%1$s' não são compatíveis. [%2$s] != [%3$s]";
    }
    @Override
    protected String threadInterrupt$str() {
        return "WFLYNAM0046: A thread foi interrompida enquanto restaurando a referência de serviço para o serviço %1$s";
    }
    @Override
    protected String notAnInstanceOfObjectFactory$str() {
        return "WFLYNAM0055: A classe %1$s do módulo %2$s não é uma instância do ObjectFactory";
    }
    @Override
    protected String entryNotRegistered$str() {
        return "WFLYNAM0025: '%1$s' da entrada jndi não está registrado no contexto '%2$s'";
    }
    @Override
    protected String failedToDestroyRootContext$str() {
        return "WFLYNAM0026: Falha ao destruir o contexto root";
    }
    @Override
    protected String cannotDeferenceObject$str() {
        return "WFLYNAM0016: Não foi possível cancelar o referenciamento do objeto";
    }
    @Override
    protected String tableIsFull$str() {
        return "WFLYNAM0045: A tabela está cheia!";
    }
    @Override
    protected String moduleNotFound$str() {
        return "WFLYNAM0065: Não foi possível carregar o módulo %1$s — o módulo ou uma das suas dependências está ausente [%2$s]";
    }
    @Override
    protected String cannotResolveService1$str() {
        return "WFLYNAM0020: Não foi possível resolver o serviço %1$s";
    }
    @Override
    protected String jndiViewNotAvailable$str() {
        return "WFLYNAM0038: A visualização jndi está apenas disponível no modo do período de rodagem.";
    }
    @Override
    protected String serviceAlreadyBound$str() {
        return "WFLYNAM0044: Serviço com nome [%1$s] já vinculado.";
    }
    @Override
    protected String failedToInstantiate$str() {
        return "WFLYNAM0027: Falha ao instanciar %1$s %2$s a partir do classloader %3$s";
    }
    @Override
    protected String couldNotLoadClassFromModule$str() {
        return "WFLYNAM0053: Não foi possível carregar a classe %1$s a partir do módulo %2$s";
    }
    @Override
    protected String cannotRebindExternalContext$str() {
        return "WFLYNAM0064: Não foi possível reassociar pesquisa de contexto externo";
    }
    @Override
    protected String illegalContextInName$str() {
        return "WFLYNAM0030: Contexto ilegal no nome: %1$s";
    }
    @Override
    protected String failedToStopRemoteNamingService$str() {
        return "WFLYNAM0067: Falha ao parar o serviço de nomenclatura remota";
    }
    @Override
    protected String unsupportedSimpleBindingType$str() {
        return "WFLYNAM0050: Tipo de vínculo simples não compatível %1$s";
    }
    @Override
    protected String cannotResolveServiceBug$str() {
        return "WFLYNAM0022: Não foi possível resolver a referência do serviço para %1$s na criação %2$s. Isto é um bug no ServiceReferenceObjectFactory. O estado era %3$s.";
    }
    @Override
    protected String invalidJndiName$str() {
        return "WFLYNAM0033: Um nome JNDI válido deve ser fornecido: %1$s";
    }
    @Override
    protected String invalidLoadFactor$str() {
        return "WFLYNAM0034: Fator de carregamento deve ser maior que 0 e menor ou igual a 1";
    }
    @Override
    protected String invalidNameForContextBinding$str() {
        return "WFLYNAM0047: Nome inválido para o vínculo do contexto %1$s";
    }
    @Override
    protected String emptyNameNotAllowed$str() {
        return "WFLYNAM0024: O nome vazio não é permitido";
    }
    @Override
    protected String resourceLookupForInjectionFailed$str() {
        return "WFLYNAM0059: Pesquisa de recurso para injeção falhou: %1$s";
    }
    @Override
    protected String bindingTypeRequiresAttributeDefined$str() {
        return "WFLYNAM0060: O tipo de vínculo %1$s requer atributo denominado %2$s definido ";
    }
    @Override
    protected String failedToReadContextEntries$str() {
        return "WFLYNAM0028: Falha ao ler %1$s das entradas de contexto.";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYNAM0001: Ativação do Subsistema de Nomeação";
    }
    @Override
    protected String couldNotInstantiateClassInstanceFromModule$str() {
        return "WFLYNAM0054: Não foi possível instanciar a instância da classe %1$s a partir do módulo %2$s";
    }
    @Override
    protected String failedToLookupJndiViewValue$str() {
        return "WFLYNAM0013: Ocorreu uma falha ao obter o valor de visualização jndi para a entrada %1$s.";
    }
    @Override
    protected String cannotListNonContextBinding$str() {
        return "WFLYNAM0017: Não foi possível listar um binding sem Contexto. ";
    }
    @Override
    protected String cannotLookupLink$str() {
        return "WFLYNAM0018: Não foi possível observar o link.";
    }
    @Override
    protected String invalidPermissionAction$str() {
        return "WFLYNAM0036: permissão inválida, ação desconhecida: %1$s";
    }
    @Override
    protected String couldNotLoadModule$str() {
        return "WFLYNAM0052: Não foi possível carregar o módulo %1$s";
    }
    @Override
    protected String cannotAddToReadOnlyPermissionCollection$str() {
        return "WFLYNAM0014: Tentativa de adição de uma Permissão a um PermissionCollection aleatório";
    }
    @Override
    protected String unableToTransformURLBindingValue$str() {
        return "WFLYNAM0051: Não foi possível transformar o valor vinculado de URL %1$s";
    }
    @Override
    protected String invalidTableSize$str() {
        return "WFLYNAM0037: Não foi possível uma tabela de tamanho negativo!";
    }
    @Override
    protected String failedToStartRemoteNamingService$str() {
        return "WFLYNAM0066: Falha ao iniciar o serviço de nomenclatura remota";
    }
    @Override
    protected String invalidContextReference$str() {
        return "WFLYNAM0032: Referência do contexto inválida. Não é uma referência de '%1$s'.";
    }
    @Override
    protected String cacheNotValidForBindingType$str() {
        return "WFLYNAM0061: O tipo de vínculo %1$s não pode obter um atributo 'cache'";
    }
    @Override
    protected String nameNotFoundInContext$str() {
        return "WFLYNAM0039: O nome '%1$s' não foi encontrado no contexto '%2$s'";
    }
    @Override
    protected String cannotResolveService3$str() {
        return "WFLYNAM0021: Não foi possível resolver a referência do serviço ao %1$s na criação %2$s. O serviço estava no estado %3$s.";
    }
    @Override
    protected String readOnlyNamingContext$str() {
        return "WFLYNAM0043: O contexto do nome é de leitura apenas";
    }
    @Override
    protected String invalidPermission$str() {
        return "WFLYNAM0035: permissão inválida, ação desconhecida: %1$s";
    }
    @Override
    protected String objectFactoryCreationFailure$str() {
        return "WFLYNAM0042: Falha ao criar a criação do objeto a partir do classloader.";
    }
    @Override
    protected String unknownBindingType$str() {
        return "WFLYNAM0049: Tipo de vínculo desconhecido %1$s";
    }
    @Override
    protected String cannotBeNull$str() {
        return "WFLYNAM0015: %1$s não pode ser nulo.";
    }
    @Override
    protected String failedToStart$str() {
        return "WFLYNAM0029: Falha ao iniciar %1$s";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYNAM0063: Serviço %1$s não iniciado ";
    }
    @Override
    protected String failedToReleaseBinderService$str() {
        return "WFLYNAM0012: Ocorreu uma falha ao liberar o serviço binder. Isto é usado para um período de rodagem feito pelo JNDI binding";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYNAM0041: %1$s é nulo";
    }
    @Override
    protected String failedToSet$str() {
        return "WFLYNAM0002: Falha ao configurar %1$s";
    }
    @Override
    protected String invalidNamespaceForBinding$str() {
        return "WFLYNAM0048: Nome de vinculação inválido %1$s, nome deve iniciar com um de %2$s";
    }
    @Override
    protected String lookupError$str() {
        return "WFLYNAM0062: Falha ao pesquisar %1$s";
    }
}
