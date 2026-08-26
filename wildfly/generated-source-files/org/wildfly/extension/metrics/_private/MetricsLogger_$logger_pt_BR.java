package org.wildfly.extension.metrics._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:31+0200")
public class MetricsLogger_$logger_pt_BR extends MetricsLogger_$logger_pt implements MetricsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MetricsLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedInitializeJMXRegistrar$str() {
        return "WFLYMETRICS0002: Falha ao inicializar as métricas de JMX MBeans";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMETRICS0001: Ativando o subsistema de métricas de base";
    }
    @Override
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYMETRICS0006: Sistemas de métricas adicionais descobertos durante a configuração do WildFly Metrics:%1$s. Consulte o guia de administração para obter mais informações.";
    }
    @Override
    protected String malformedName$str() {
        return "WFLYMETRICS0005: Nome malformado.";
    }
    @Override
    protected String unableToConvertAttribute$str() {
        return "WFLYMETRICS0004: Não é possível converter o atributo %1$s em %2$sem valor duplo.";
    }
    @Override
    protected String unableToReadAttribute$str() {
        return "WFLYMETRICS0003: Não é possível ler o atributo %1$s em %2$s: %3$s.";
    }
}
