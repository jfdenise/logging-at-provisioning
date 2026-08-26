package org.jboss.eap.insights.report.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:59:22+0200")
public class InsightsReportLogger_$logger_ja extends InsightsReportLogger_$logger implements InsightsReportLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InsightsReportLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToReadRuntimeConfiguration1$str() {
        return "WFLYINSIGHTS0001: ランタイム設定の読み取りが %1$s で失敗しました";
    }
    @Override
    protected String failedToReadRuntimeConfiguration0$str() {
        return "WFLYINSIGHTS0002: ランタイム設定の読み取りに失敗しました";
    }
    @Override
    protected String failedToReadModules$str() {
        return "WFLYINSIGHTS0003: モジュールパスの分析に失敗しました";
    }
    @Override
    protected String failedToProcessDeployments$str() {
        return "WFLYINSIGHTS0004: デプロイメントの処理中にエラーが発生しました";
    }
    @Override
    protected String missingAuthentication$str() {
        return "WFLYINSIGHTS0005: リクエストに認証がありません: %1$s";
    }
    @Override
    protected String payloadTooLarge$str() {
        return "WFLYINSIGHTS0006: ペイロードが大きすぎます: %1$s";
    }
    @Override
    protected String unsupportedContentType$str() {
        return "WFLYINSIGHTS0007: ペイロードのコンテンツタイプがサポートされていません: %1$s";
    }
    @Override
    protected String serversideError$str() {
        return "WFLYINSIGHTS0008: サーバーでリクエストが失敗しました。コード: %1$s";
    }
    @Override
    protected String addingAnalyzedJar$str() {
        return "%1$s の情報を追加しています";
    }
    @Override
    protected String addingOverriddenJar$str() {
        return "%1$s のオーバーライドされる情報を追加しています";
    }
    @Override
    protected String errorAnalyzingJar$str() {
        return "jar %1$s の分析に失敗しました";
    }
    @Override
    protected String endProcessingModules$str() {
        return "モジュール分析完了";
    }
    @Override
    protected String startProcessingModulePath$str() {
        return "モジュールパス %1$s を処理中です";
    }
    @Override
    protected String startProcessingDeployment$str() {
        return "デプロイメント %1$s を処理しています";
    }
    @Override
    protected String startProcessingDeploymentForUpdate$str() {
        return "デプロイメント %1$s の更新を処理しています";
    }
    @Override
    protected String deploymentHashFound$str() {
        return "デプロイメント %1$s に sha1 ハッシュ %2$s があります";
    }
    @Override
    protected String endProcessingDeployments$str() {
        return "すべてのデプロイメントが処理されました";
    }
    @Override
    protected String endProcessingDeploymentsForUpdate$str() {
        return "すべてのデプロイメントが更新されました";
    }
    @Override
    protected String scheduledSendFailed$str() {
        return "スケジュールされた送信に失敗しました";
    }
    @Override
    protected String scheduledSendUnknownException$str() {
        return "Insights 以外の失敗";
    }
    @Override
    protected String endGettingConfiguration$str() {
        return "サーバーのランタイム設定を取得しました";
    }
    @Override
    protected String startGettingConfiguration$str() {
        return "サーバーのランタイム設定を取得しています";
    }
}
