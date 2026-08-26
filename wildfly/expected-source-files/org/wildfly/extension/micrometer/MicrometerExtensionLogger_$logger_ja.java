package org.wildfly.extension.micrometer;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:10+0200")
public class MicrometerExtensionLogger_$logger_ja extends MicrometerExtensionLogger_$logger implements MicrometerExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicrometerExtensionLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMMTREXT0001: Micrometer サブシステムをアクティブ化しています";
    }
    @Override
    protected String processingDeployment$str() {
        return "WFLYMMTREXT0002: Micrometer サブシステムがデプロイメントを処理しています";
    }
    @Override
    protected String noCdiDeployment$str() {
        return "WFLYMMTREXT0003: Jakarta Contexts and Dependency Injection がデプロイメントで有効になっていません。Micrometer の統合をスキップします。";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYMMTREXT0004: デプロイメント %1$s には %2$s 機能の使用が必要ですが、現在登録されていません。";
    }
    @Override
    protected String unableToReadAttribute$str() {
        return "WFLYMMTREXT0005: %2$s の属性 %1$s を読み取りできません: %3$s。";
    }
    @Override
    protected String unableToConvertAttribute$str() {
        return "WFLYMMTREXT0006: %2$s の属性 %1$s を Double の値に変換できません。";
    }
    @Override
    protected String malformedName$str() {
        return "WFLYMMTREXT0007: 不正な名前。";
    }
    @Override
    protected String failedInitializeJMXRegistrar$str() {
        return "WFLYMMTREXT0008: JMX MBean からメトリクスの初期化に失敗しました。";
    }
    @Override
    protected String unsupportedMetricType$str() {
        return "WFLYMMTREXT0009: サポートされていないメトリクスタイプが見つかりました: %1$s";
    }
    @Override
    protected String notActivatingSubsystem$str() {
        return "WFLYMMTREXT0010: Micrometer サブシステムをアクティブ化していません";
    }
    @Override
    protected String noOpRegistryChosen$str() {
        return "WFLYMMTREXT0011: Micrometer は有効化されていますが、エンドポイントが設定されていません。No-op メトリクスレジストリーが設定されています。";
    }
    @Override
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYMMTREXT0012: Micrometer の設定中に次の追加のメトリクスシステムが検出されました: %1$s。詳細は管理ガイドを参照してください。";
    }
}
