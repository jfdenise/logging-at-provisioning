package org.jboss.as.clustering.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:12+0200")
public class ClusteringLogger_$logger_pt_BR extends ClusteringLogger_$logger_pt implements ClusteringLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ClusteringLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String parameterValueOutOfBounds$str() {
        return "WFLYCLCOM0001: %2$g não é um valor válido para o parâmetro %1$s. O valor deve ser %3$s %4$g";
    }
    @Override
    protected String failedToClose$str() {
        return "WFLYCLCOM0002: Falha ao fechar %1$s";
    }
    @Override
    protected String attributesDoNotSupportNegativeValues$str() {
        return "WFLYCLCOM0003: Os seguintes atributos não são compatíveis com valores negativos: %1$s";
    }
    @Override
    protected String attributesDoNotSupportZeroValues$str() {
        return "WFLYCLCOM0004: Os seguintes atributos não são compatíveis com valores iguais a zero: %1$s";
    }
    @Override
    protected String rejectedMultipleValues$str() {
        return "WFLYCLCOM0005: O host herdado não suporta múltiplos valores de atributos: %1$s";
    }
    @Override
    protected String attributeIgnored$str() {
        return "WFLYCLCOM0006: O atributo '%1$s' do elemento '%2$s' deixou de ser suportado e será ignorado.";
    }
    @Override
    protected String elementIgnored$str() {
        return "WFLYCLCOM0007: O elemento “%1$s” não é mais compatível e será ignorado.";
    }
    @Override
    protected String operationNotSupportedInNormalServerMode$str() {
        return "WFLYCLCOM0008: %1$s%2$s: a operação só é compatível no modo somente administrador.";
    }
}
