package org.jboss.as.threads;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:25+0200")
public class ThreadsLogger_$logger_de extends ThreadsLogger_$logger implements ThreadsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ThreadsLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String perCpuNotSupported$str() {
        return "WFLYTHR0001: Das '%1$s' Attribute wird nicht mehr unterstützt. Der Wert [%2$f] des '%3$s' Attributs wird mit dem Wert [%4$f] des '%5$s' Attributs und der aktuellen Prozessorzählung [%6$d] kombiniert, um einen neuen Wert [%7$d] für '%8$s' abzuleiten.";
    }
    @Override
    protected String unsupportedBoundedQueueThreadPoolMetric$str() {
        return "WFLYTHR0002: Nicht unterstütztes Attribut '%1$s'";
    }
    @Override
    protected String unsupportedBoundedQueueThreadPoolAttribute$str() {
        return "WFLYTHR0003: Nicht unterstütztes Attribut '%1$s'";
    }
    @Override
    protected String unsupportedQueuelessThreadPoolMetric$str() {
        return "WFLYTHR0004: Nicht unterstütztes Attribut '%1$s'";
    }
    @Override
    protected String unsupportedQueuelessThreadPoolAttribute$str() {
        return "WFLYTHR0005: Nicht unterstütztes Attribut '%1$s'";
    }
    @Override
    protected String unsupportedScheduledThreadPoolMetric$str() {
        return "WFLYTHR0006: Nicht unterstütztes Attribut '%1$s'";
    }
    @Override
    protected String unsupportedScheduledThreadPoolAttribute$str() {
        return "WFLYTHR0007: Nicht unterstütztes Attribut '%1$s'";
    }
    @Override
    protected String unsupportedThreadFactoryAttribute$str() {
        return "WFLYTHR0008: Nicht unterstütztes Attribut '%1$s'";
    }
    @Override
    protected String unsupportedUnboundedQueueThreadPoolMetric$str() {
        return "WFLYTHR0009: Nicht unterstütztes Attribut '%1$s'";
    }
    @Override
    protected String unsupportedUnboundedQueueThreadPoolAttribute$str() {
        return "WFLYTHR0010: Nicht unterstütztes Attribut '%1$s'";
    }
    @Override
    protected String boundedQueueThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0011: Der Executor-Dienst wurde nicht initialisert.";
    }
    @Override
    protected String queuelessThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0012: Der Executor-Dienst wurde nicht initialisert.";
    }
    @Override
    protected String scheduledThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0013: Der Executor-Dienst wurde nicht initialisert.";
    }
    @Override
    protected String threadFactoryUninitialized$str() {
        return "WFLYTHR0014: Der Thread-Factory-Dienst wurde nicht initialisert.";
    }
    @Override
    protected String unboundedQueueThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0015: Der Executor-Dienst wurde nicht initialisert.";
    }
    @Override
    protected String boundedQueueThreadPoolServiceNotFound$str() {
        return "WFLYTHR0016: Dienst '%1$s' nicht gefunden.";
    }
    @Override
    protected String queuelessThreadPoolServiceNotFound$str() {
        return "WFLYTHR0017: Dienst '%1$s' nicht gefunden.";
    }
    @Override
    protected String scheduledThreadPoolServiceNotFound$str() {
        return "WFLYTHR0018: Dienst '%1$s' nicht gefunden.";
    }
    @Override
    protected String threadFactoryServiceNotFound$str() {
        return "WFLYTHR0019: Dienst '%1$s' nicht gefunden.";
    }
    @Override
    protected String unboundedQueueThreadPoolServiceNotFound$str() {
        return "WFLYTHR0020: Dienst '%1$s' nicht gefunden.";
    }
    @Override
    protected String threadPoolServiceNotFoundForMetrics$str() {
        return "WFLYTHR0021: Executor-Dienst '%1$s' nicht gefunden";
    }
    @Override
    protected String missingKeepAliveTime$str() {
        return "WFLYTHR0024: Fehlender '%1$s' für Parameter '%2$s'";
    }
    @Override
    protected String missingKeepAliveUnit$str() {
        return "WFLYTHR0025: Fehlender '%1$s' für Parameter '%2$s'";
    }
    @Override
    protected String countMustBePositive$str() {
        return "WFLYTHR0027: %1$s muss größer oder gleich Null sein";
    }
    @Override
    protected String perCpuMustBePositive$str() {
        return "WFLYTHR0028: %1$s muss größer oder gleich Null sein";
    }
    @Override
    protected String missingTimeSpecTime$str() {
        return "WFLYTHR0029: Fehlender '%1$s' für '%2$s'";
    }
    @Override
    protected String failedToParseUnit$str() {
        return "WFLYTHR0030: Parsen von '%1$s' fehlgeschlagen, zulässige Werte sind: %2$s";
    }
    @Override
    protected String unsupportedEnhancedQueueExecutorAttribute$str() {
        return "WFLYTHR0031: Nicht unterstütztes Attribut '%1$s'";
    }
    @Override
    protected String enhancedQueueExecutorServiceNotFound$str() {
        return "WFLYTHR0032: Dienst '%1$s' nicht gefunden.";
    }
    @Override
    protected String enhancedQueueExecutorUninitialized$str() {
        return "WFLYTHR0033: Der Executor-Dienst wurde nicht initialisert.";
    }
    @Override
    protected String unsupportedEnhancedQueueExecutorMetric$str() {
        return "WFLYTHR0034: Nicht unterstützte Metrik '%1$s'";
    }
}
