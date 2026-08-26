package org.jboss.as.pojo.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:09+0200")
public class PojoLogger_$logger_pt_BR extends PojoLogger_$logger_pt implements PojoLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PojoLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String oldNamespace$str() {
        return "WFLYPOJO0001: Foi encontrado o namespace Bean/pojo herdado: %1$s - alguns recursos xml (potenciais exceções) podem estar faltando.";
    }
    @Override
    protected String ignoreUninstallError$str() {
        return "WFLYPOJO0002: Ignorando a ação desinstalar no destino: %1$s";
    }
    @Override
    protected String invokingCallback$str() {
        return "WFLYPOJO0003: Erro ao invocar a chamada de retorno: %1$s";
    }
    @Override
    protected String errorAtIncallback$str() {
        return "WFLYPOJO0004: Erro ao invocar o cancelamento da chamada de retorno: %1$s";
    }
    @Override
    protected String errorAtUncallback$str() {
        return "WFLYPOJO0005: Erro ao invocar o cancelamento de uncallback: %1$s";
    }
    @Override
    protected String noModuleFound$str() {
        return "WFLYPOJO0006: Falha ao obter o anexo do módulo para %1$s";
    }
    @Override
    protected String missingReflectionIndex$str() {
        return "WFLYPOJO0007: Falta o índice de reflexão da implantação para %1$s";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYPOJO0008: Falha ao pesquisar o xml POJO [ %1$s ]";
    }
    @Override
    protected String cannotInstantiateCollection$str() {
        return "WFLYPOJO0010: Não foi possível instanciar uma nova instância da coleção.";
    }
    @Override
    protected String cannotInstantiateMap$str() {
        return "WFLYPOJO0011: Não foi possível instanciar uma nova instância do mapa.";
    }
    @Override
    protected String tooDynamicFromFactory$str() {
        return "WFLYPOJO0012: É muito dinâmico para determinar o tipo injetado da criação!";
    }
    @Override
    protected String tooDynamicFromDependency$str() {
        return "WFLYPOJO0013: É muito dinâmico para determinar o tipo injetado da dependência!";
    }
    @Override
    protected String notValueConfig$str() {
        return "WFLYPOJO0014: O nó anterior não é uma configuração de valor: %1$s";
    }
    @Override
    protected String nullFactoryMethod$str() {
        return "WFLYPOJO0015: Método de criação nulo!";
    }
    @Override
    protected String nullBeanInfo$str() {
        return "WFLYPOJO0016: Informação do bean nula!";
    }
    @Override
    protected String invalidMatchSize$str() {
        return "WFLYPOJO0017: Número inválido de instâncias de tipo coincidentes: %1$s, tipo: %2$s";
    }
    @Override
    protected String cannotDetermineInjectedType$str() {
        return "WFLYPOJO0018: Não foi possível determinar o tipo de injeção: %1$s, tente configurar o atributo de classe (caso disponível).";
    }
    @Override
    protected String nullOrEmptyAlias$str() {
        return "WFLYPOJO0019: Alias nulo ou vazio.";
    }
    @Override
    protected String nullOrEmptyDependency$str() {
        return "WFLYPOJO0020: Dependência nula ou vazia.";
    }
    @Override
    protected String missingValue$str() {
        return "WFLYPOJO0021: Valor faltante";
    }
    @Override
    protected String nullValue$str() {
        return "WFLYPOJO0022: Valor nulo";
    }
    @Override
    protected String nullName$str() {
        return "WFLYPOJO0023: Nome nulo";
    }
    @Override
    protected String nullMethodName$str() {
        return "WFLYPOJO0024: Nome de método nulo!";
    }
    @Override
    protected String unknownType$str() {
        return "WFLYPOJO0025: Tipo desconhecido: %1$s";
    }
    @Override
    protected String illegalParameterLength$str() {
        return "WFLYPOJO0026: Comprimento de parâmetro ilegal: %1$s";
    }
    @Override
    protected String missingFactoryMethod$str() {
        return "WFLYPOJO0027: Método de criação na configuração de ctor faltante: %1$s";
    }
    @Override
    protected String missingBeanInfo$str() {
        return "WFLYPOJO0028: Informação do bean faltante, determine o atributo da classe do bean: %1$s";
    }
    @Override
    protected String wrongTypeSize$str() {
        return "WFLYPOJO0029: Tamanho de tipos errado, isto não coincide com os parâmetros!";
    }
    @Override
    protected String nullClassInfo$str() {
        return "WFLYPOJO0030: ClassInfo nula!";
    }
    @Override
    protected String ctorNotFound$str() {
        return "WFLYPOJO0031: Nenhum construtor: %1$s para a classe %2$s.";
    }
    @Override
    protected String methodNotFound$str() {
        return "WFLYPOJO0032: O método não foi encontrado %1$s%2$s para a classe %3$s";
    }
    @Override
    protected String getterNotFound$str() {
        return "WFLYPOJO0033: Nenhum getter: %1$s na classe %2$s.";
    }
    @Override
    protected String setterNotFound$str() {
        return "WFLYPOJO0034: Nenhum setter: %1$s na classe %2$s";
    }
    @Override
    protected String ambiguousMatch1$str() {
        return "WFLYPOJO0035: Correspondência ambígua %1$s.";
    }
    @Override
    protected String ambiguousMatch3$str() {
        return "WFLYPOJO0036: Correspondência ambígua do %1$s para o nome %2$s na classe %3$s.";
    }
    @Override
    protected String fieldNotFound$str() {
        return "WFLYPOJO0037: Campo não foi encontrado %1$s para a classe %2$s.";
    }
    @Override
    protected String parsingException$str() {
        return "WFLYPOJO0038: Foi encontrada uma exceção enquanto pesquisado o arquivo descritor POJO: %1$s";
    }
    @Override
    protected String cannotDetermineType$str() {
        return "WFLYPOJO0039: Não é possível determinar o tipo, informações insuficientes sobre a configuração!";
    }
}
