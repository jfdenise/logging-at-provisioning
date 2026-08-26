package org.jboss.as.threads;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:52+0200")
public class ThreadsLogger_$logger_fr extends ThreadsLogger_$logger implements ThreadsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ThreadsLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String perCpuNotSupported$str() {
        return "WFLYTHR0001: L'attribut '%1$s' n'est plus pris en charge. La valeur [%2$f] de l'attribut '%3$s' est combinée avec la valeur [%4$f] de l'attribut '%5$s' et le compte du processeur actuel [%6$d] afin de dériver une nouvelle valeur [%7$d] pour '%8$s'.";
    }
    @Override
    protected String unsupportedQueuelessThreadPoolAttribute$str() {
        return "WFLYTHR0005: Attribut non pris en charge '%1$s'";
    }
    @Override
    protected String enhancedQueueExecutorUninitialized$str() {
        return "WFLYTHR0033: Le service executor n'a pas été initialisé.";
    }
    @Override
    protected String scheduledThreadPoolServiceNotFound$str() {
        return "WFLYTHR0018: Service '%1$s' introuvable.";
    }
    @Override
    protected String boundedQueueThreadPoolServiceNotFound$str() {
        return "WFLYTHR0016: Service '%1$s' introuvable.";
    }
    @Override
    protected String threadFactoryServiceNotFound$str() {
        return "WFLYTHR0019: Service '%1$s' introuvable.";
    }
    @Override
    protected String unboundedQueueThreadPoolServiceNotFound$str() {
        return "WFLYTHR0020: Service '%1$s' introuvable.";
    }
    @Override
    protected String unsupportedBoundedQueueThreadPoolAttribute$str() {
        return "WFLYTHR0003: Attribut non pris en charge '%1$s'";
    }
    @Override
    protected String unsupportedScheduledThreadPoolAttribute$str() {
        return "WFLYTHR0007: Attribut non pris en charge '%1$s'";
    }
    @Override
    protected String unsupportedQueuelessThreadPoolMetric$str() {
        return "WFLYTHR0004: Attribut non pris en charge '%1$s'";
    }
    @Override
    protected String scheduledThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0013: Le service executor n'a pas été initialisé.";
    }
    @Override
    protected String missingKeepAliveUnit$str() {
        return "WFLYTHR0025: Il manque '%1$s' au paramètre '%2$s'";
    }
    @Override
    protected String missingTimeSpecTime$str() {
        return "WFLYTHR0029: Il manque '%1$s' à '%2$s'";
    }
    @Override
    protected String perCpuMustBePositive$str() {
        return "WFLYTHR0028: %1$s doit être plus grand que ou égal à zéro";
    }
    @Override
    protected String missingKeepAliveTime$str() {
        return "WFLYTHR0024: Il manque '%1$s' au paramètre '%2$s'";
    }
    @Override
    protected String failedToParseUnit$str() {
        return "WFLYTHR0030: Échec de l'analyse de '%1$s', les valeurs autorisées sont : %2$s";
    }
    @Override
    protected String unsupportedUnboundedQueueThreadPoolMetric$str() {
        return "WFLYTHR0009: Attribut non pris en charge '%1$s'";
    }
    @Override
    protected String enhancedQueueExecutorServiceNotFound$str() {
        return "WFLYTHR0032: Service '%1$s' introuvable.";
    }
    @Override
    protected String unsupportedScheduledThreadPoolMetric$str() {
        return "WFLYTHR0006: Attribut non pris en charge '%1$s'";
    }
    @Override
    protected String unsupportedThreadFactoryAttribute$str() {
        return "WFLYTHR0008: Attribut non pris en charge '%1$s'";
    }
    @Override
    protected String unsupportedUnboundedQueueThreadPoolAttribute$str() {
        return "WFLYTHR0010: Attribut non pris en charge '%1$s'";
    }
    @Override
    protected String unsupportedBoundedQueueThreadPoolMetric$str() {
        return "WFLYTHR0002: Attribut non pris en charge '%1$s'";
    }
    @Override
    protected String queuelessThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0012: Le service executor n'a pas été initialisé.";
    }
    @Override
    protected String unsupportedEnhancedQueueExecutorMetric$str() {
        return "WFLYTHR0034: Métrique non pris en charge '%1$s'";
    }
    @Override
    protected String countMustBePositive$str() {
        return "WFLYTHR0027: %1$s doit être plus grand que ou égal à zéro";
    }
    @Override
    protected String threadFactoryUninitialized$str() {
        return "WFLYTHR0014: Le service thread factory n'a pas été initialisé.";
    }
    @Override
    protected String unsupportedEnhancedQueueExecutorAttribute$str() {
        return "WFLYTHR0031: Attribut non pris en charge '%1$s'";
    }
    @Override
    protected String queuelessThreadPoolServiceNotFound$str() {
        return "WFLYTHR0017: Service '%1$s' introuvable.";
    }
    @Override
    protected String boundedQueueThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0011: Le service executor n'a pas été initialisé.";
    }
    @Override
    protected String unboundedQueueThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0015: Le service executor n'a pas été initialisé.";
    }
    @Override
    protected String threadPoolServiceNotFoundForMetrics$str() {
        return "WFLYTHR0021: Impossible de trouver le service executor '%1$s'";
    }
}
