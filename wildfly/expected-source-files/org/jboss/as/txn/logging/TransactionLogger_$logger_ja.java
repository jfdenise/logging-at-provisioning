package org.jboss.as.txn.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:54:08+0200")
public class TransactionLogger_$logger_ja extends TransactionLogger_$logger implements TransactionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public TransactionLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unableToRollBack$str() {
        return "WFLYTX0001: アクティブなトランザクションをロールバックできません。";
    }
    @Override
    protected String unableToGetTransactionStatus$str() {
        return "WFLYTX0002: トランザクションのステータスを取得できません。";
    }
    @Override
    protected String transactionStillOpen$str() {
        return "WFLYTX0003: アプリケーションエラー: ステータス %1$s のリクエストでトランザクションは依然アクティブな状態です。";
    }
    @Override
    protected String createFailed$str() {
        return "WFLYTX0004: 作成失敗";
    }
    @Override
    protected String managerStartFailure$str() {
        return "WFLYTX0005: %1$s マネージャーの作成失敗";
    }
    @Override
    protected String objectStoreStartFailure$str() {
        return "WFLYTX0006: オブジェクトストアのブラウザー bean の設定に失敗しました。";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYTX0007: サービスは開始されていません";
    }
    @Override
    protected String startFailure$str() {
        return "WFLYTX0008: 起動失敗";
    }
    @Override
    protected String unknownMetric$str() {
        return "WFLYTX0009: 不明なメトリック %1$s";
    }
    @Override
    protected String jmxSubsystemNotInstalled$str() {
        return "WFLYTX0010: MBean Server サービスがインストールされていません。JMX サブシステムがインストールされていない場合は、この機能を利用できません。";
    }
    @Override
    protected String inconsistentStatisticsSettings$str() {
        return "WFLYTX0012: 属性 %1$s および %2$s は代替です。競合する値で両方を設定することはできません。";
    }
    @Override
    protected String nodeIdentifierIsSetToDefault$str() {
        return "WFLYTX0013: %2$s の %1$s 属性はデフォルト値に設定されています。これは、複数のサーバーを実行する環境では危険です。属性の値が一意になるようにしてください。";
    }
    @Override
    protected String jndiNameInvalidFormat$str() {
        return "WFLYTX0015: Jndi 名は java:/ or java:jboss/ で始める必要があります";
    }
    @Override
    protected String mustBeUndefinedIfTrue$str() {
        return "WFLYTX0023: %2$s が 'true' の場合、%1$s は未定義でなければなりません。";
    }
    @Override
    protected String mustBedefinedIfDefined$str() {
        return "WFLYTX0024: %2$s が定義されている場合、%1$s を定義する必要があります。";
    }
    @Override
    protected String eitherTrueOrDefined$str() {
        return "WFLYTX0025: %1$s を 'true' にするか %2$s を定義する必要があります。";
    }
    @Override
    protected String transactionNotFound$str() {
        return "WFLYTX0026: クリーンアップ中にトラザクション %1$s をキャッシュから削除できませんでした。";
    }
    @Override
    protected String preJcaSyncAfterCompletionFailed$str() {
        return "WFLYTX0027: 完了後、トランザクション %2$s に関連する Jakarta Connectors 以前の同期化 %1$s に失敗しました";
    }
    @Override
    protected String jcaSyncAfterCompletionFailed$str() {
        return "WFLYTX0028: 完了後、トランザクション %2$s に関連する Jakarta Connectors の同期化 %1$s に失敗しました";
    }
    @Override
    protected String syncsnotallowed$str() {
        return "WFLYTX0029: トランザクションの状態が %1$s であるときは同期化の登録が許可されません";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYTX0030: インデックス化された子リソースは、順序付けされた子が親リソースによってサポートされる場合のみ登録できます。'%1$s' の親はインデックス化されていません。";
    }
    @Override
    protected String unsupportedAttribute$str() {
        return "WFLYTX0031: 属性 '%1$s' はサポート対象外になりました";
    }
    @Override
    protected String mustBeDefinedIfTrue$str() {
        return "WFLYTX0032: %2$s が 'true' の場合、%1$s が定義されている必要があります。";
    }
    @Override
    protected String onlyOneCanBeTrue$str() {
        return "WFLYTX0033: %1$s と %2$s のどちらか 1 つのみを true にできます。";
    }
    @Override
    protected String objectStoreRelativeToIsSetToDefault$str() {
        return "WFLYTX0034: object-store の relative_to プロパティーは jboss.server.data.dir とデフォルト値に設定されています";
    }
    @Override
    protected String cannotFindOrImportInflowTransaction$str() {
        return "WFLYTX0035: xid %1$s およびワーク %2$s のインフロートランザクションが見つからないかインポートできません";
    }
    @Override
    protected String importedInflowTransactionIsInactive$str() {
        return "WFLYTX0036: ワーク %2$s の xid %1$s のインポートされた Jakarta Connectors インフロートランザクションは非アクティブです";
    }
    @Override
    protected String cannotResumeInflowTransactionUnexpectedError$str() {
        return "WFLYTX0037: ワーク %2$s のトランザクション %1$s の再開で予期せぬエラーが発生しました";
    }
    @Override
    protected String cannotSuspendInflowTransactionUnexpectedError$str() {
        return "WFLYTX0038: ワーク %1$s のトランザクションの停止で予期せぬエラーが発生しました";
    }
    @Override
    protected String timeoutValueIsSetToMaximum$str() {
        return "WFLYTX0039: 最大タイムアウトにはゼロの値を使用できないため、タイムアウトは %1$s に設定されました。";
    }
    @Override
    protected String noActiveTransactionToRegisterSynchronization$str() {
        return "WFLYTX0040: 同期 '%1$s' を登録するアクティブなトランザクションが現在のコンテキストにありません。";
    }
    @Override
    protected String jmxError$str() {
        return "WFLYTX0041: JMX エラー: %1$s";
    }
    @Override
    protected String transactionDiscoveryError$str() {
        return "WFLYTX0042: トランザクション検出エラー";
    }
    @Override
    protected String unableToDetermineInboundTransactionContext$str() {
        return "WFLYTX0043: InboundTransactionCurrentImpl がインバウンドトランザクションのコンテキストを判別できません";
    }
    @Override
    protected String unableToSuspendInboundTransactionContext$str() {
        return "WFLYTX0044: InboundTransactionCurrentImpl がインバウンドトランザクションのコンテキストを中断できません";
    }
    @Override
    protected String cannotRegister$str() {
        return "WFLYTX0045: InboundTransactionCurrent 実装の初期参照を登録できませんでした";
    }
}
