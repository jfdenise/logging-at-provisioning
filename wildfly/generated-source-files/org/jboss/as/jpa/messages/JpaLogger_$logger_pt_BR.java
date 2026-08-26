package org.jboss.as.jpa.messages;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:25+0200")
public class JpaLogger_$logger_pt_BR extends JpaLogger_$logger_pt implements JpaLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JpaLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String relativePathNotFound$str() {
        return "WFLYJPA0058: Não foi possível encontrar um caminho relativo: %1$s";
    }
    @Override
    protected String cannotCloseTransactionContainerEntityManger$str() {
        return "WFLYJPA0017: O gerenciador de entidade gerenciado do recipiente pode apenas ser encerrado pelo recipiente (auto limpeza no tx/invocação e encerrar quando o componente pertencido for encerrado.)";
    }
    @Override
    protected String badSynchronizationTypeCombination$str() {
        return "WFLYJPA0064: A transação Jakarta Transactions já possui um contexto de persistência 'SynchronizationType.UNSYNCHRONIZED' (EntityManager) vinculado a ela, mas um componente com um 'SynchronizationType.SYNCHRONIZED' está sendo usado agora. Altere o código de componente para vincular o contexto de persistência (EntityManager) à transação ou altere o código de componente chamado para que também use 'SynchronizationType.UNSYNCHRONIZED'. Veja a especificação JPA 2.1 seção 7.6.4.1. Nome de unidade de persistência com escopo =%1$s.";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYJPA0040: Falha ao analisar %1$s";
    }
    @Override
    protected String cannotUseExtendedPersistenceTransaction$str() {
        return "WFLYJPA0030: Contexto de persistência estendido encontrado na pilha de invocação SFSB, mas não foi possível usá-lo porque transação já possui um contexto transacional associado a ela. Isso pode ser evitado pela alteração do código de aplicação. Elimine o contexto de persistência estendido ou o contexto transacional. Consulte a seção 7.6.3.1 do JPA especificação 2.0. Nome da unidade de persistência com escopo =%1$s, contexto de persistência já na transação =%2$s, contexto de persistência estendido =%3$s.";
    }
    @Override
    protected String persistenceProviderNotFound$str() {
        return "WFLYJPA0057: PersistenceProvider '%1$s' não encontrado";
    }
    @Override
    protected String invalidPersistenceUnitName$str() {
        return "WFLYJPA0043: Nome da unidade de persistência (%1$s) contém caracteres '%2$s' ilegais";
    }
    @Override
    protected String noPUnitNameSpecifiedAndMultiplePersistenceUnits$str() {
        return "WFLYJPA0061: O unitName persistente não foi especificado e existem %1$d definições de unidade persistentes na implantação do aplicativo %2$s. Altere a implantação do aplicativo para possuir apenas uma definição da unidade de persistência ou especifique o unitName para cada referência de uma unidade de persistência.";
    }
    @Override
    protected String unexpectedStatisticsProblem$str() {
        return "WFLYJPA0012: Problema inesperado ao coletar estatísticas";
    }
    @Override
    protected String cannotGetSessionFactory$str() {
        return "WFLYJPA0020: Não foi possível obter a criação da sessão Hibernate do gerenciador de entidade";
    }
    @Override
    protected String illegalCallOnCloseMethod$str() {
        return "WFLYJPA0075: É ilegal chamar esse método do EntityManager injetado e gerenciado";
    }
    @Override
    protected String differentSearchModuleDependencies$str() {
        return "WFLYJPA0071: Implantação '%1$s' especificou mais de um nome de módulo de Hibernate Search ('%2$s','%3$s')";
    }
    @Override
    protected String duplicatePersistenceUnitDefinition$str() {
        return "WFLYJPA0001: Definição de Unidade de Persistência duplicada para %1$s no aplicativo. Um dos duplicados persistence.xml deve ser removido do aplicativo. A implantação do aplicativo continuará com as definições persistence.xml do %2$s utilizado. As definições persistence.xml do %3$s serão ignoradas.";
    }
    @Override
    protected String setterMethodOnlyAnnotation$str() {
        return "WFLYJPA0059: Destino de injeção %1$s inválido. Apenas métodos de configurador são permitidos: %2$s";
    }
    @Override
    protected String failedToStopPUService$str() {
        return "WFLYJPA0007: Falha ao encerrar o serviço %1$s da unidade de persistência ";
    }
    @Override
    protected String failedToAddPersistenceUnit$str() {
        return "WFLYJPA0038: Falha ao adicionar o serviço da unidade de persistência para %1$s";
    }
    @Override
    protected String transactionRequired$str() {
        return "WFLYJPA0060: A transação é requerida para executar essa operação (tanto use a transação ou o contexto de persistência estendido)";
    }
    @Override
    protected String resourcesOfTypeCannotBeRegistered$str() {
        return "WFLYJPA0065: Os recursos do tipo %1$s não podem ser registrados";
    }
    @Override
    protected String stoppingService$str() {
        return "WFLYJPA0004: Interrompendo %1$s Serviço '%2$s'";
    }
    @Override
    protected String cannotCreateAdapter$str() {
        return "WFLYJPA0018: Não foi possível criar uma instância da classe do adaptador '%1$s'";
    }
    @Override
    protected String readingPersistenceXml$str() {
        return "WFLYJPA0002: Ler persistence.xml para %1$s";
    }
    @Override
    protected String errorGettingTransaction$str() {
        return "WFLYJPA0036: Ocorreu um erro enquanto obtendo a transação associada com o thread atual: %1$s";
    }
    @Override
    protected String cannotDeployApp$str() {
        return "WFLYJPA0019: Não foi possível implantar o provedor de persistência com pacote do aplicativo '%1$s'";
    }
    @Override
    protected String failedToGetAdapter$str() {
        return "WFLYJPA0037: Falha ao obter o adaptador para o provedor de persistência '%1$s'";
    }
    @Override
    protected String startingPersistenceUnitService$str() {
        return "WFLYJPA0010: Iniciando unidade de persistência (fase %1$d de 2) Serviço'%2$s'";
    }
    @Override
    protected String cannotLoadPersistenceProviderIntegratorModule$str() {
        return "WFLYJPA0074: Erro ao carregar o módulo integrador do provedor de persistência para %1$s";
    }
    @Override
    protected String invalidScopedName$str() {
        return "WFLYJPA0044: dica (%1$s) de jboss.as.jpa.scopedname contém caracteres '%2$s' ilegais ";
    }
    @Override
    protected String persistenceProviderAdaptorModuleLoadError$str() {
        return "WFLYJPA0069: Erro de carregamento do módulo do adaptador de provedor de persistência %1$s";
    }
    @Override
    protected String classloaderHasMultipleAdapters$str() {
        return "WFLYJPA0067: Carregador de classes '%1$s' possui mais de um adaptador de provedor de persistência. ";
    }
    @Override
    protected String couldNotCreateInstanceProvider$str() {
        return "WFLYJPA0062: Não foi possível criar a instância da classe do provedor de persistência %1$s";
    }
    @Override
    protected String cannotInjectResourceLocalEntityManager$str() {
        return "WFLYJPA0021: Não foi possível injetar o recipiente RESOURCE_LOCAL gerenciado EntityManagers usando o @PersistenceContext";
    }
    @Override
    protected String xpcOnlyFromSFSB$str() {
        return "WFLYJPA0070: Um contexto de persistência estendida gerenciada por contêiner pode ser iniciado somente dentro do âmbito de um bean de sessão com estado (unidade de persistência '%1$s').";
    }
    @Override
    protected String cannotLoadFromJpa$str() {
        return "WFLYJPA0025: Não foi possível carregar %1$s do classloader de módulos de Jakarta Persistence";
    }
    @Override
    protected String cannotLoadPersistenceProviderModule$str() {
        return "WFLYJPA0027: Erro ao carregar o módulo do provedor de persistência %1$s (classe %2$s)";
    }
    @Override
    protected String persistenceUnitNotFound2$str() {
        return "WFLYJPA0033: Não foi possível encontrar uma unidade de persistência nomeada %1$s no %2$s";
    }
    @Override
    protected String multipleAdapters$str() {
        return "WFLYJPA0048: O módulo do adaptador do provedor de persistência (%1$s) possui mais de um adaptador";
    }
    @Override
    protected String startingService$str() {
        return "WFLYJPA0003: Iniciando %1$s Serviço '%2$s'";
    }
    @Override
    protected String classLevelAnnotationParameterRequired$str() {
        return "WFLYJPA0032: Anotação do nível de classe %1$s em classe %2$s deve proporcionar um %3$s";
    }
    @Override
    protected String errorPreloadingDefaultProvider$str() {
        return "WFLYJPA0006: Não foi possível carregar o módulo do provedor de persistência.  ";
    }
    @Override
    protected String stoppingPersistenceUnitService$str() {
        return "WFLYJPA0011: Interrompendo unidade de persistência (fase %1$d de 2) Serviço '%2$s'";
    }
    @Override
    protected String cannotCloseContainerManagedEntityManager$str() {
        return "WFLYJPA0015: O gerenciador da entidade de gerenciamento do recipiente não pode apenas ser encerrado pelo recipiente (acontecerá quando o método @remove for invocado contendo SFSB)";
    }
    @Override
    protected String resourcesOfTypeCannotBeRemoved$str() {
        return "WFLYJPA0066: Os recursos do tipo %1$s não podem ser removidos";
    }
    @Override
    protected String persistenceUnitNotFound3$str() {
        return "WFLYJPA0034: Não foi possível encontrar uma unidade de persistência nomeada %1$s#%2$s no %3$s";
    }
    @Override
    protected String referenceCountedEntityManagerNegativeCount$str() {
        return "WFLYJPA0063: erro interno, o número de beans de sessão com estado (%1$d) associados com o contexto de persistência estendido (%2$s) não pode ser um número negativo.";
    }
    @Override
    protected String invalidClassFormat$str() {
        return "WFLYJPA0073: Reescrita de bytecode (transformação) da classe %1$s com falha";
    }
    @Override
    protected String nullParameter$str() {
        return "WFLYJPA0053: Erro %1$s interno, nulo %2$s passado ao";
    }
    @Override
    protected String cannotSpecifyBoth$str() {
        return "WFLYJPA0029: Não foi possível especificar ambos %1$s (%2$s) e %3$s (%4$s) em %5$s para %6$s";
    }
    @Override
    protected String childNotFound$str() {
        return "WFLYJPA0031: Não foi possível encontrar o filho '%1$s' no '%2$s'";
    }
}
