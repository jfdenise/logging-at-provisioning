package org.jboss.as.service.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:13+0200")
public class SarLogger_$logger_pt_BR extends SarLogger_$logger_pt implements SarLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SarLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedExecutingLegacyMethod$str() {
        return "WFLYSAR0001: Falha ao executar o método %1$s do serviço herdado";
    }
    @Override
    protected String propertyNotFound$str() {
        return "WFLYSAR0002: Não foi possível encontrar o PropertyEditor para o tipo %1$s";
    }
    @Override
    protected String classNotFound$str() {
        return "WFLYSAR0003: A classe não foi encontrada";
    }
    @Override
    protected String classNotInstantiated$str() {
        return "WFLYSAR0004: A classe não foi instanciada";
    }
    @Override
    protected String failedToGetAttachment$str() {
        return "WFLYSAR0005: Falha ao obter o anexo %1$s para %2$s";
    }
    @Override
    protected String failedXmlParsing$str() {
        return "WFLYSAR0006: Falha ao analisar o serviço xml [%1$s]";
    }
    @Override
    protected String methodNotFound$str() {
        return "WFLYSAR0007: O método '%1$s(%2$s)' não foi encontrado para: %3$s";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYSAR0008: Falta um ou mais atributos:";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYSAR0009: %1$s é nulo";
    }
    @Override
    protected String propertyMethodNotFound$str() {
        return "WFLYSAR0010: Método %1$s para a propriedade '%2$s' não encontrado para: %3$s";
    }
    @Override
    protected String unexpectedContent$str() {
        return "WFLYSAR0011: Conteúdo inesperado do tipo '%1$s' nomeado '%2$s', o texto é: %3$s ";
    }
    @Override
    protected String failedToProcessSarChild$str() {
        return "WFLYSAR0012: Falha ao proceder arquivos filhos SAR para [%1$s]";
    }
    @Override
    protected String malformedDependencyName$str() {
        return "WFLYSAR0013: Nome de dependência malformada %1$s";
    }
    @Override
    protected String defaultConstructorNotFound$str() {
        return "WFLYSAR0014: Não foi possível encontrar o construtor padrão para o %1$s";
    }
    @Override
    protected String mbeanRegistrationFailed$str() {
        return "WFLYSAR0015: Falha ao registrar o mbean [%1$s]";
    }
    @Override
    protected String cannotUnregisterObject$str() {
        return "WFLYSAR0016: Não há ObjectName disponível para cancelamento do registro";
    }
    @Override
    protected String unregistrationFailure$str() {
        return "WFLYSAR0017: Falha ao cancelar o registro [%1$s]";
    }
    @Override
    protected String objectSupplierNotAvailable$str() {
        return "WFLYSAR0018: Fornecedor do objeto não disponível";
    }
    @Override
    protected String objectNotAvailable$str() {
        return "WFLYSAR0019: Objeto não disponível";
    }
    @Override
    protected String methodIsNotAccessible$str() {
        return "WFLYSAR0020: O método não está acessível";
    }
    @Override
    protected String failedToInvokeMethod$str() {
        return "WFLYSAR0021: Falha ao invocar o método";
    }
}
