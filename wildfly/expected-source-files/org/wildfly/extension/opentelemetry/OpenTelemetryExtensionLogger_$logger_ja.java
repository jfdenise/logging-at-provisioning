package org.wildfly.extension.opentelemetry;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:20+0200")
public class OpenTelemetryExtensionLogger_$logger_ja extends OpenTelemetryExtensionLogger_$logger implements OpenTelemetryExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public OpenTelemetryExtensionLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYOTELEXT0001: OpenTelemetry サブシステムのアクティブ化";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYOTELEXT0004: デプロイメント %1$s には %2$s 機能の使用が必要ですが、現在登録されていません。";
    }
    @Override
    protected String errorResolvingTelemetry$str() {
        return "WFLYOTELEXT0005: OpenTelemetry インスタンスの解決エラー。";
    }
    @Override
    protected String unsupportedExporter$str() {
        return "WFLYOTELEXT0008: サポートされていないエクスポーターが指定されました: '%1$s'";
    }
    @Override
    protected String errorResolvingTracer$str() {
        return "WFLYOTELEXT0009: トレーサーの解決エラー。";
    }
    @Override
    protected String unsupportedSpanProcessor$str() {
        return "WFLYOTELEXT0010: サポートされていないスパンプロセッサーが指定されています: '%1$s'。";
    }
    @Override
    protected String unsupportedSampler$str() {
        return "WFLYOTELEXT0011: サンプラーの認識されない値: '%1$s'。";
    }
    @Override
    protected String invalidRatio$str() {
        return "WFLYOTELEXT0012: 無効な比率です。0.0 から 1.0 の範囲内で指定する必要があります。";
    }
    @Override
    protected String jaegerIsNoLongerSupported$str() {
        return "WFLYOTELEXT0013: 'jaeger' エクスポーターはサポートされなくなりました。otlp を使用するようにシステムを更新してください。";
    }
    @Override
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYOTELEXT0014: OpenTelemetry の設定中に次の追加のメトリクスシステムが検出されました: %1$s。詳細は管理ガイドを参照してください。";
    }
}
