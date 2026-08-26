package org.wildfly.extension.metrics._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:31+0200")
public class MetricsLogger_$logger_ja extends MetricsLogger_$logger implements MetricsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MetricsLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedInitializeJMXRegistrar$str() {
        return "WFLYMETRICS0002: JMX MBean からメトリクスの初期化に失敗しました。";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMETRICS0001: ベースメトリクスサブシステムのアクティブ化";
    }
    @Override
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYMETRICS0006: WildFly Metrics の設定中に次の追加のメトリクスシステムが検出されました: %1$s。詳細は管理ガイドを参照してください。";
    }
    @Override
    protected String malformedName$str() {
        return "WFLYMETRICS0005: 不正な名前。";
    }
    @Override
    protected String unableToConvertAttribute$str() {
        return "WFLYMETRICS0004: %2$s の属性 %1$s を Double の値に変換できません。";
    }
    @Override
    protected String unableToReadAttribute$str() {
        return "WFLYMETRICS0003: %2$s の属性 %1$s を読み取りできません: %3$s。";
    }
}
