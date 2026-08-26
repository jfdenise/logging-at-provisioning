package org.jboss.as.threads;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:25+0200")
public class ThreadsLogger_$logger_pt_BR extends ThreadsLogger_$logger_pt implements ThreadsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ThreadsLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String perCpuNotSupported$str() {
        return "WFLYTHR0001: O atributo '%1$s' não é mais suportado. O valor [%2$f] do atributo '%3$s' foi combinado ao valor [%4$f] do atributo '%5$s' e o [%6$d] da contagem do processador atual para derivação de um novo valor do [%7$d] para '%8$s'.";
    }
    @Override
    protected String unsupportedBoundedQueueThreadPoolMetric$str() {
        return "WFLYTHR0002: Atributo '%1$s' não compatível";
    }
    @Override
    protected String unsupportedBoundedQueueThreadPoolAttribute$str() {
        return "WFLYTHR0003: Atributo '%1$s' não compatível";
    }
    @Override
    protected String unsupportedQueuelessThreadPoolMetric$str() {
        return "WFLYTHR0004: Atributo '%1$s' não compatível";
    }
    @Override
    protected String unsupportedQueuelessThreadPoolAttribute$str() {
        return "WFLYTHR0005: Atributo '%1$s' não compatível";
    }
    @Override
    protected String unsupportedScheduledThreadPoolMetric$str() {
        return "WFLYTHR0006: Atributo '%1$s' não compatível";
    }
    @Override
    protected String unsupportedScheduledThreadPoolAttribute$str() {
        return "WFLYTHR0007: Atributo '%1$s' não compatível";
    }
    @Override
    protected String unsupportedThreadFactoryAttribute$str() {
        return "WFLYTHR0008: Atributo '%1$s' não compatível";
    }
    @Override
    protected String unsupportedUnboundedQueueThreadPoolMetric$str() {
        return "WFLYTHR0009: Atributo '%1$s' não compatível";
    }
    @Override
    protected String unsupportedUnboundedQueueThreadPoolAttribute$str() {
        return "WFLYTHR0010: Atributo '%1$s' não compatível";
    }
    @Override
    protected String boundedQueueThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0011: O serviço do executor não foi inicializado.";
    }
    @Override
    protected String queuelessThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0012: O serviço do executor não foi inicializado.";
    }
    @Override
    protected String scheduledThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0013: O serviço do executor não foi inicializado.";
    }
    @Override
    protected String threadFactoryUninitialized$str() {
        return "WFLYTHR0014: O serviço da criação do thread não foi inicializado.";
    }
    @Override
    protected String unboundedQueueThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0015: O serviço do executor não foi inicializado.";
    }
    @Override
    protected String boundedQueueThreadPoolServiceNotFound$str() {
        return "WFLYTHR0016: O serviço '%1$s' não foi encontrado.";
    }
    @Override
    protected String queuelessThreadPoolServiceNotFound$str() {
        return "WFLYTHR0017: O serviço '%1$s' não foi encontrado.";
    }
    @Override
    protected String scheduledThreadPoolServiceNotFound$str() {
        return "WFLYTHR0018: O serviço '%1$s' não foi encontrado.";
    }
    @Override
    protected String threadFactoryServiceNotFound$str() {
        return "WFLYTHR0019: O serviço '%1$s' não foi encontrado.";
    }
    @Override
    protected String unboundedQueueThreadPoolServiceNotFound$str() {
        return "WFLYTHR0020: O serviço '%1$s' não foi encontrado.";
    }
    @Override
    protected String threadPoolServiceNotFoundForMetrics$str() {
        return "WFLYTHR0021: Falha ao localizar o serviço '%1$s' do executor";
    }
    @Override
    protected String missingKeepAliveTime$str() {
        return "WFLYTHR0024: Falta '%1$s' para o '%2$s' do parâmetro";
    }
    @Override
    protected String missingKeepAliveUnit$str() {
        return "WFLYTHR0025: Falta '%1$s' para o '%2$s' do parâmetro";
    }
    @Override
    protected String countMustBePositive$str() {
        return "WFLYTHR0027: %1$s deve ser maior que ou igual a zero";
    }
    @Override
    protected String perCpuMustBePositive$str() {
        return "WFLYTHR0028: %1$s deve ser maior que ou igual a zero";
    }
    @Override
    protected String missingTimeSpecTime$str() {
        return "WFLYTHR0029: Falta '%1$s' para '%2$s'";
    }
    @Override
    protected String failedToParseUnit$str() {
        return "WFLYTHR0030: Falha ao analisar '%1$s', os valores permitidos são: %2$s";
    }
    @Override
    protected String unsupportedEnhancedQueueExecutorAttribute$str() {
        return "WFLYTHR0031: Atributo '%1$s' não compatível";
    }
    @Override
    protected String enhancedQueueExecutorServiceNotFound$str() {
        return "WFLYTHR0032: O serviço '%1$s' não foi encontrado.";
    }
    @Override
    protected String enhancedQueueExecutorUninitialized$str() {
        return "WFLYTHR0033: O serviço do executor não foi inicializado.";
    }
    @Override
    protected String unsupportedEnhancedQueueExecutorMetric$str() {
        return "WFLYTHR0034: Métrica não compatível '%1$s'";
    }
}
