package org.jboss.as.threads;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:25+0200")
public class ThreadsLogger_$logger_ja extends ThreadsLogger_$logger implements ThreadsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ThreadsLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String perCpuNotSupported$str() {
        return "WFLYTHR0001: '%1$s' 属性はサポート対象外になりました。'%3$s' 属性の値 [%2$f] は、'%5$s' 属性の値 [%4$f] と現在のプロセッサー数 [%6$d] を組み合わせ、'%8$s' に対して新しい値 [%7$d] を生成します。";
    }
    @Override
    protected String unsupportedBoundedQueueThreadPoolMetric$str() {
        return "WFLYTHR0002: 未対応の属性 '%1$s'";
    }
    @Override
    protected String unsupportedBoundedQueueThreadPoolAttribute$str() {
        return "WFLYTHR0003: 未対応の属性 '%1$s'";
    }
    @Override
    protected String unsupportedQueuelessThreadPoolMetric$str() {
        return "WFLYTHR0004: 未対応の属性 '%1$s'";
    }
    @Override
    protected String unsupportedQueuelessThreadPoolAttribute$str() {
        return "WFLYTHR0005: 未対応の属性 '%1$s'";
    }
    @Override
    protected String unsupportedScheduledThreadPoolMetric$str() {
        return "WFLYTHR0006: 未対応の属性 '%1$s'";
    }
    @Override
    protected String unsupportedScheduledThreadPoolAttribute$str() {
        return "WFLYTHR0007: 未対応の属性 '%1$s'";
    }
    @Override
    protected String unsupportedThreadFactoryAttribute$str() {
        return "WFLYTHR0008: 未対応の属性 '%1$s'";
    }
    @Override
    protected String unsupportedUnboundedQueueThreadPoolMetric$str() {
        return "WFLYTHR0009: 未対応の属性 '%1$s'";
    }
    @Override
    protected String unsupportedUnboundedQueueThreadPoolAttribute$str() {
        return "WFLYTHR0010: 未対応の属性 '%1$s'";
    }
    @Override
    protected String boundedQueueThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0011: エグゼキューターサービスは初期化されていません。";
    }
    @Override
    protected String queuelessThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0012: エグゼキューターサービスは初期化されていません。";
    }
    @Override
    protected String scheduledThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0013: エグゼキューターサービスは初期化されていません。";
    }
    @Override
    protected String threadFactoryUninitialized$str() {
        return "WFLYTHR0014: スレッドのファクトリーサービスは初期化されていません。";
    }
    @Override
    protected String unboundedQueueThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0015: エグゼキューターサービスは初期化されていません。";
    }
    @Override
    protected String boundedQueueThreadPoolServiceNotFound$str() {
        return "WFLYTHR0016: サービス '%1$s' が見つかりません。";
    }
    @Override
    protected String queuelessThreadPoolServiceNotFound$str() {
        return "WFLYTHR0017: サービス '%1$s' が見つかりません。";
    }
    @Override
    protected String scheduledThreadPoolServiceNotFound$str() {
        return "WFLYTHR0018: サービス '%1$s' が見つかりません。";
    }
    @Override
    protected String threadFactoryServiceNotFound$str() {
        return "WFLYTHR0019: サービス '%1$s' が見つかりません。";
    }
    @Override
    protected String unboundedQueueThreadPoolServiceNotFound$str() {
        return "WFLYTHR0020: サービス '%1$s' が見つかりません。";
    }
    @Override
    protected String threadPoolServiceNotFoundForMetrics$str() {
        return "WFLYTHR0021: エグゼキューターサービス '%1$s' が見つかりませんでした。";
    }
    @Override
    protected String missingKeepAliveTime$str() {
        return "WFLYTHR0024: パラメーター '%2$s' に '%1$s' がありません。";
    }
    @Override
    protected String missingKeepAliveUnit$str() {
        return "WFLYTHR0025: パラメーター '%2$s' に '%1$s' がありません。";
    }
    @Override
    protected String countMustBePositive$str() {
        return "WFLYTHR0027: %1$s は 0 以上でなければなりません。";
    }
    @Override
    protected String perCpuMustBePositive$str() {
        return "WFLYTHR0028: %1$s は 0 以上でなければなりません。";
    }
    @Override
    protected String missingTimeSpecTime$str() {
        return "WFLYTHR0029: '%2$s' に '%1$s' がありません。";
    }
    @Override
    protected String failedToParseUnit$str() {
        return "WFLYTHR0030: '%1$s' の解析に失敗しました。許容値: %2$s";
    }
    @Override
    protected String unsupportedEnhancedQueueExecutorAttribute$str() {
        return "WFLYTHR0031: 未対応の属性 '%1$s'";
    }
    @Override
    protected String enhancedQueueExecutorServiceNotFound$str() {
        return "WFLYTHR0032: サービス '%1$s' が見つかりません。";
    }
    @Override
    protected String enhancedQueueExecutorUninitialized$str() {
        return "WFLYTHR0033: エグゼキューターサービスは初期化されていません。";
    }
    @Override
    protected String unsupportedEnhancedQueueExecutorMetric$str() {
        return "WFLYTHR0034: サポートされないメトリクス: '%1$s'";
    }
}
