package org.wildfly.extension.datasources.agroal.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:11+0200")
public class AgroalLogger_$logger_ja extends AgroalLogger_$logger implements AgroalLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public AgroalLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String startedDataSource$str() {
        return "WFLYAG0101: [%2$s] にバインドされたデータソース '%1$s' を開始しました";
    }
    @Override
    protected String datasourceStartException$str() {
        return "WFLYAG0105: データソース '%1$s' の開始中の例外";
    }
    @Override
    protected String driverLoaded$str() {
        return "WFLYAG0501: ドライバー '%2$s' のクラス %1$s をロードしました";
    }
    @Override
    protected String stoppedXADataSource$str() {
        return "WFLYAG0104: XA データソース '%1$s' を停止しました";
    }
    @Override
    protected String missingTransactionManager$str() {
        return "WFLYAG0109: データソースを開始できませんでした: トランザクションマネージャーがありません";
    }
    @Override
    protected String invalidConnectionProvider$str() {
        return "WFLYAG0107: 無効な接続プロバイダー。java.sql.Driver または javax.sql.DataSource 実装のいずれかが必要です。ドライバーの connection-provider を修正してください。";
    }
    @Override
    protected String missingAttributeInDatasourceMetadata$str() {
        return "WFLYAG0403: 要素 <data-source> は属性 '%1$s' を提供する必要があります";
    }
    @Override
    protected String loadModuleException$str() {
        return "WFLYAG0502: ドライバーモジュール '%1$s' のロードに失敗しました";
    }
    @Override
    protected String jndiNameInvalidFormat$str() {
        return "WFLYAG0303: JNDI 名は java:/ または java:jboss/ で始まる必要があります。";
    }
    @Override
    protected String invalidCredentialSourceSupplier$str() {
        return "WFLYAG0111: データソース '%1$s' の CredentialSourceSupplier は無効です";
    }
    @Override
    protected String unknownDatasourceServiceType$str() {
        return "WFLYAG0301: 不明なデータソースサービス型: %1$s";
    }
    @Override
    protected String invalidDeploymentConnectionProvider$str() {
        return "WFLYAG0401: 無効な接続プロバイダー。java.sql.Driver または javax.sql.DataSource 実装のいずれかが必要です。ドライバーの connection-provider を修正してください。";
    }
    @Override
    protected String poolWarning$str() {
        return "WFLYAG0601: %1$s: %2$s";
    }
    @Override
    protected String invalidConnection$str() {
        return "WFLYAG0302: '%1$s' の無効な接続";
    }
    @Override
    protected String loadClassDeploymentException$str() {
        return "WFLYAG0402: 接続プロバイダークラス '%1$s' のロードに失敗しました";
    }
    @Override
    protected String addingDeploymentProcessors$str() {
        return "WFLYAG0001: DataSourceDefinition アノテーションおよび resource-ref エントリーのデプロイメントプロセッサーを追加します";
    }
    @Override
    protected String invalidXAConnectionProvider$str() {
        return "WFLYAG0108: XA データソースには接続ドライバーとして javax.sql.XADataSource が必要です。ドライバーの connection-provider を修正してください。";
    }
    @Override
    protected String flushOperation$str() {
        return "WFLYAG0201: フラッシュ操作、モード %1$s を実行しています";
    }
    @Override
    protected String jndiNameShouldValidate$str() {
        return "WFLYAG0304: JNDI 名には '//' が含まれてはならず、'/' で終わってはなりません。";
    }
    @Override
    protected String xaDatasourceStartException$str() {
        return "WFLYAG0106: XA データソース '%1$s' の開始中の例外";
    }
    @Override
    protected String invalidAuthentication$str() {
        return "WFLYAG0110: データソース '%1$s' の認証コンテキストからのクレデンシャル取得エラー";
    }
    @Override
    protected String loadClassException$str() {
        return "WFLYAG0503: ドライバークラス '%1$s' のロードに失敗しました";
    }
    @Override
    protected String startedXADataSource$str() {
        return "WFLYAG0103: [%2$s] にバインドされた XA データソース '%1$s' を開始しました";
    }
    @Override
    protected String stoppedDataSource$str() {
        return "WFLYAG0102: データソース '%1$s' を停止しました";
    }
}
