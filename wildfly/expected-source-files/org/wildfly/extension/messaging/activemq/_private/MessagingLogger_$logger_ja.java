package org.wildfly.extension.messaging.activemq._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:58+0200")
public class MessagingLogger_$logger_ja extends MessagingLogger_$logger implements MessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MessagingLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String aioInfo$str() {
        return "WFLYMSGAMQ0001: AIO はこのプラットフォームにありませんでした。Pure Java NIO を使用してフォールバックします。";
    }
    @Override
    protected String boundJndiName$str() {
        return "WFLYMSGAMQ0002: jndi 名 %1$s へメッセージングオブジェクトをバインドしました。";
    }
    @Override
    protected String errorStoppingJmsServer$str() {
        return "WFLYMSGAMQ0003: Jakarta Messaging サーバーの停止時の例外";
    }
    @Override
    protected String failedToDestroy$str() {
        return "WFLYMSGAMQ0004: %1$s の破棄に失敗しました:%2$s";
    }
    @Override
    protected String revertOperationFailed$str() {
        return "WFLYMSGAMQ0005: %1$s はアドレス %3$s で操作 %2$s を元に戻そうとしている途中で例外を検出しました。";
    }
    @Override
    protected String unboundJndiName$str() {
        return "WFLYMSGAMQ0006: jndi 名 %1$s へのメッセージングオブジェクトをアンバインドしました。";
    }
    @Override
    protected String couldNotCloseFile$str() {
        return "WFLYMSGAMQ0007: ファイル %1$s を閉じることができませんでした。";
    }
    @Override
    protected String failedToUnbindJndiName$str() {
        return "WFLYMSGAMQ0008: %2$d %3$s 以内に jndi 名 %1$s にバインドされたメッセージングオブジェクトのバインドを解除できませんでした。";
    }
    @Override
    protected String startedService$str() {
        return "WFLYMSGAMQ0011: 開始済み %1$s %2$s";
    }
    @Override
    protected String stoppedService$str() {
        return "WFLYMSGAMQ0012: 終了済み %1$s %2$s";
    }
    @Override
    protected String unknownPooledConnectionFactoryAttribute$str() {
        return "WFLYMSGAMQ0015: プールされた接続ファクトリーでは不明なプロパティーである %1$s プロパティーを無視します。";
    }
    @Override
    protected String registeredHTTPUpgradeHandler$str() {
        return "WFLYMSGAMQ0016: %2$s アクセプターによって処理される %1$s プロトコルの登録済み HTTP アップグレード";
    }
    @Override
    protected String connectorForPooledConnectionFactory$str() {
        return "WFLYMSGAMQ0018: プールされた接続ファクトリー %1$s に対して明示的に定義されたコネクターはありません。%2$s をコネクターとして使用します。";
    }
    @Override
    protected String cannotBindJndiName$str() {
        return "WFLYMSGAMQ0022: null あるいは空の文字列を jndi 名としてバインドできません";
    }
    @Override
    protected String cannotUnbindJndiName$str() {
        return "WFLYMSGAMQ0025: null あるいは空の文字列を jndi 名としてアンバインドできません";
    }
    @Override
    protected String childResourceAlreadyExists$str() {
        return "WFLYMSGAMQ0026: 型 %1$s の子リソースはすでに存在します。メッセージングサブシステムは型 %1$s のリソース１つのみ利用可能です。";
    }
    @Override
    protected String connectorNotDefined$str() {
        return "WFLYMSGAMQ0027: コネクター %1$s が定義されていません。";
    }
    @Override
    protected String failedToCreate$str() {
        return "WFLYMSGAMQ0028: %1$s の作成に失敗しました。";
    }
    @Override
    protected String failedToFindBroadcastSocketBinding$str() {
        return "WFLYMSGAMQ0029: 次のブロードキャストバインディングの SocketBinding が見つかりませんでした: %1$s";
    }
    @Override
    protected String failedToFindConnectorSocketBinding$str() {
        return "WFLYMSGAMQ0030: 次のコネクターの SocketBinding が見つかりませんでした: %1$s";
    }
    @Override
    protected String failedToFindDiscoverySocketBinding$str() {
        return "WFLYMSGAMQ0031: 次のディスカバリーバインディングの SocketBinding が見つかりませんでした: %1$s";
    }
    @Override
    protected String failedToShutdownServer$str() {
        return "WFLYMSGAMQ0032: %1$s サーバーの停止に失敗しました。";
    }
    @Override
    protected String failedToStartService$str() {
        return "WFLYMSGAMQ0033: サービスの開始に失敗しました";
    }
    @Override
    protected String illegalValue$str() {
        return "WFLYMSGAMQ0036: 要素 %2$s の不正な値 %1$s";
    }
    @Override
    protected String immutableResource$str() {
        return "WFLYMSGAMQ0037: リソースは変更できません";
    }
    @Override
    protected String invalid$str() {
        return "WFLYMSGAMQ0038: %1$s は無効です。";
    }
    @Override
    protected String invalidAttributeType$str() {
        return "WFLYMSGAMQ0039: 属性 %1$s には予期せぬ型 %2$s があります。";
    }
    @Override
    protected String invalidServiceState$str() {
        return "WFLYMSGAMQ0042: サービス %1$s は %2$s 状態ではなく、 %3$s 状態です。";
    }
    @Override
    protected String jndiNameAlreadyRegistered$str() {
        return "WFLYMSGAMQ0043: JNDI 名 %1$s はすでに登録されています。";
    }
    @Override
    protected String required1$str() {
        return "WFLYMSGAMQ0045: %1$s が必要です。";
    }
    @Override
    protected String required2$str() {
        return "WFLYMSGAMQ0046: %1$s あるいは %2$s のいずれかが必要です。";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYMSGAMQ0047: %1$s が null です";
    }
    @Override
    protected String unsupportedAttribute$str() {
        return "WFLYMSGAMQ0050: 属性 %1$s に対する読み込みサポートが正しく実装されていませんでした。";
    }
    @Override
    protected String unsupportedOperation$str() {
        return "WFLYMSGAMQ0052: 操作 %1$s に対するサポートが正しく実装されませんでした。";
    }
    @Override
    protected String unsupportedRuntimeAttribute$str() {
        return "WFLYMSGAMQ0053: %1$s のランタイム処理が実装されていません。";
    }
    @Override
    protected String activeMQServerNotInstalled$str() {
        return "WFLYMSGAMQ0054: 名前 %1$s で利用可能な ActiveMQ サーバーはありません。";
    }
    @Override
    protected String couldNotParseDeployment$str() {
        return "WFLYMSGAMQ0055: ファイル %1$s を解析できませんでした。";
    }
    @Override
    protected String operationNotValid$str() {
        return "WFLYMSGAMQ0056: ハンドラーは操作 %1$s を処理できません。";
    }
    @Override
    protected String noDestinationRegisteredForAddress$str() {
        return "WFLYMSGAMQ0057: アドレス %1$s にメッセージの宛先は登録されていません。";
    }
    @Override
    protected String securityDomainContextNotSet$str() {
        return "WFLYMSGAMQ0058: SecurityDomainContext は設定されていません";
    }
    @Override
    protected String failedToRecover$str() {
        return "WFLYMSGAMQ0060: %1$s を復元できませんでした";
    }
    @Override
    protected String canNotRegisterResourceOfType$str() {
        return "WFLYMSGAMQ0063: タイプ %1$s のリソースは登録できません";
    }
    @Override
    protected String canNotRemoveResourceOfType$str() {
        return "WFLYMSGAMQ0064: タイプ %1$s のリソースは削除できません";
    }
    @Override
    protected String serverInBackupMode$str() {
        return "WFLYMSGAMQ0066: アドレス %1$s のリソースを管理できません。サーバーがバックアップモードです";
    }
    @Override
    protected String wrongConnectorRefInBroadCastGroup$str() {
        return "WFLYMSGAMQ0067: ブロードキャストグループ '%1$s' は、存在しないコネクター '%2$s' への参照を定義します。利用可能なコネクター '%3$s'。";
    }
    @Override
    protected String noMatchingExpiryAddress$str() {
        return "WFLYMSGAMQ0071: address-settings %2$s に対して expiry-address %1$s に一致するリソースがありません。この address-setting に一致する宛先からの期限切れメッセージは失われます。";
    }
    @Override
    protected String noMatchingDeadLetterAddress$str() {
        return "WFLYMSGAMQ0072: address-settings %2$s に対して dead-letter-address %1$s に一致するリソースがありません。この address-setting に一致する宛先からの未配信メッセージは失われます。";
    }
    @Override
    protected String canNotRemoveLastJNDIName$str() {
        return "WFLYMSGAMQ0073: JNDI 名 %1$s は削除できません。リソースには 1 つ以上の JNDI 名が必要です。";
    }
    @Override
    protected String aioInfoLinux$str() {
        return "WFLYMSGAMQ0075: AIO はこのプラットフォームにありませんでした。Pure Java NIO を使ってフォールバックします。お使いのプラットフォームが Linux の場合は LibAIO をインストールして AIO ジャーナルを有効にし、最適なパフォーマンスを実現してください。";
    }
    @Override
    protected String duplicateElements$str() {
        return "WFLYMSGAMQ0076: パラメーター %1$s には重複した要素 [%2$s] が含まれています";
    }
    @Override
    protected String canNotRemoveUnknownEntry$str() {
        return "WFLYMSGAMQ0077: 不明なエントリー %1$s を削除できません";
    }
    @Override
    protected String onlyOneChildIsAllowed$str() {
        return "WFLYMSGAMQ0078: 1 つの %1$s 子リソースのみが許可されます。見つかった子リソース: %2$s";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYMSGAMQ0079: インデックス化された子リソースは、順序付けされた子が親リソースによってサポートされる場合のみ登録できます。'%1$s' の親はインデックス化されていません。";
    }
    @Override
    protected String discoveryGroupIsNotDefined$str() {
        return "WFLYMSGAMQ0080: ディスカバリーグループ %1$s は定義されていません";
    }
    @Override
    protected String unsupportedBroadcastGroupConfigurationForLegacy$str() {
        return "WFLYMSGAMQ0081: レガシーリソースのブロードキャストグループ設定のサポートされないタイプ: %1$s";
    }
    @Override
    protected String unsupportedConnectorFactoryForLegacy$str() {
        return "WFLYMSGAMQ0082: レガシーリソースのコネクターファクトリーのサポートされない型: %1$s";
    }
    @Override
    protected String managementOperationAllowedOnlyInRunningMode$str() {
        return "WFLYMSGAMQ0083: %1$s 操作は実行できません。サーバーは %2$s モードである必要があります。";
    }
    @Override
    protected String noInVMConnector$str() {
        return "WFLYMSGAMQ0084: サーバーは in-vm コネクターを定義しません。ジャーナルをインポートできるようにするために 1 つのコネクターが必要になります";
    }
    @Override
    protected String unableToLoadClassFromModule$str() {
        return "WFLYMSGAMQ0085: モジュール %2$sからクラス %1$s をロードできません";
    }
    @Override
    protected String unableToLoadModule$str() {
        return "WFLYMSGAMQ0086: モジュール %1$s をロードできません";
    }
    @Override
    protected String unableToLoadConnectorServiceFactoryClass$str() {
        return "WFLYMSGAMQ0087: コネクターサービスファクトリークラスをロードできません: %1$s";
    }
    @Override
    protected String invalidModularParameterValue$str() {
        return "WFLYMSGAMQ0088: %1$s はパラメーター %2$s に対して有効な値ではありません。%3$s の倍数である必要があります。";
    }
    @Override
    protected String invalidConfiguration$str() {
        return "WFLYMSGAMQ0089: %1$s のリソースが正しく設定されていません。属性 %2$s が定義されている場合は、他の属性 %3$s は考慮されません。";
    }
    @Override
    protected String invalidNullSecurityDomain$str() {
        return "WFLYMSGAMQ0090: Elytron セキュリティードメインは null を取ることができません";
    }
    @Override
    protected String failedAuthenticationWithException$str() {
        return "WFLYMSGAMQ0091: ユーザー名 %1$s の認証に失敗しました。例外メッセージ: %2$s";
    }
    @Override
    protected String failedAuthentication$str() {
        return "WFLYMSGAMQ0092: ユーザー名 %1$s の認証に失敗しました。ユーザー名とパスワードのペアを確認できません";
    }
    @Override
    protected String failedAuthorization$str() {
        return "WFLYMSGAMQ0093: ユーザー名 %1$s の認証に失敗しました。パーミッションが不足しています";
    }
    @Override
    protected String jdbcDatabaseDialectDetectionFailed$str() {
        return "WFLYMSGAMQ0094: 接続メタデータまたは JDBC ドライバー名からデータベースダイアレクト検出できません。設定で 'journal-database' プロパティーを使用して、これを手作業で設定してください。既知のデータベースダイアレクトの文字列は %1$s です。";
    }
    @Override
    protected String multipleClientMappingsFound$str() {
        return "WFLYMSGAMQ0095: ActiveMQ [%2$s] トランスポート設定によって使用された [%1$s] ソケットバインディングに複数のクライアントマッピングが見つかりました。次のアドレスを使用します: [ホスト: %3$s, ポート %4$s]";
    }
    @Override
    protected String operationNotAllowedOnJdbcStore$str() {
        return "WFLYMSGAMQ0096: %1$s 操作は JDBC ストアジャーナルでは実行できません";
    }
    @Override
    protected String noSocketBinding$str() {
        return "WFLYMSGAMQ0097: %1$s の名前で設定された socket-binding または outbound-socket-binding はありません";
    }
    @Override
    protected String moduleNotFound$str() {
        return "WFLYMSGAMQ0098: モジュール %1$s をロードできません - モジュールまたは依存関係の 1 つが不足しています [%2$s]";
    }
    @Override
    protected String remoteDestinationCreationFailed$str() {
        return "WFLYMSGAMQ0099: リモート宛先 %1$s の作成がエラー %2$s で失敗しました。";
    }
    @Override
    protected String remoteDestinationDeletionFailed$str() {
        return "WFLYMSGAMQ0100: リモート宛先 %1$s の削除がエラー %2$s で失敗しました。";
    }
    @Override
    protected String invalidTransactionNameValue$str() {
        return "WFLYMSGAMQ0101: %2$s の無効な値 %1$s。有効な値は %3$s で、デフォルト値が適用されます。";
    }
    @Override
    protected String upgradeRequestMissingKey$str() {
        return "WFLYMSGAMQ0102: HTTP アップグレードリクエストに Sec-JbossRemoting-Key ヘッダーがありません";
    }
    @Override
    protected String brokerNotStarted$str() {
        return "WFLYMSGAMQ0103: ブローカーが起動していません。まだ管理できません。";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYMSGAMQ0104: レガシーセキュリティーはサポートされなくなりました。";
    }
    @Override
    protected String socketBindingMulticastNotSet$str() {
        return "WFLYMSGAMQ0105: %1$s %2$s は socket-binding %3$s を使用するよう設定されていますが、このソケットバインディングには multicast-address 属性または multicast-port 属性が設定されていません。";
    }
    @Override
    protected String failedBridgeDeployment$str() {
        return "WFLYMSGAMQ0106: ブリッジ %1$s はデプロイされませんでした。";
    }
    @Override
    protected String securityEnabledWithoutDomain$str() {
        return "WFLYMSGAMQ0107: セキュリティーが有効な場合、elytron セキュリティードメインを定義する必要があります。";
    }
    @Override
    protected String socketBindingOrJGroupsClusterRequired$str() {
        return "WFLYMSGAMQ0108: socket-binding または jgroups-cluster 属性のどちらかが必要です。";
    }
    @Override
    protected String unknownHAPolicyType$str() {
        return "WFLYMSGAMQ0109: 不明な ha ポリシータイプです。";
    }
    @Override
    protected String unableToFindRecoveryRegistry$str() {
        return "WFLYMSGAMQ0110: リカバリーレジストリーが見つかりません";
    }
    @Override
    protected String noSubscriptionError$str() {
        return "WFLYMSGAMQ0111: clientID %2$s に名前が %1$s のサブスクリプションはありません";
    }
    @Override
    protected String noSubscriptionWithQueueName$str() {
        return "WFLYMSGAMQ0112: 名前が %1$s のサブスクリプションはありません";
    }
    @Override
    protected String missingArguments$str() {
        return "WFLYMSGAMQ0113: 引数がありません";
    }
    @Override
    protected String missingRestype$str() {
        return "WFLYMSGAMQ0114: 必須パラメーター --restype がありません。";
    }
    @Override
    protected String missingJNDIName$str() {
        return "WFLYMSGAMQ0115: JNDI 名がありません。";
    }
    @Override
    protected String failedToParseProperty$str() {
        return "WFLYMSGAMQ0116: プロパティー '%1$s' の解析に失敗しました ";
    }
    @Override
    protected String unsupportedResourceType$str() {
        return "WFLYMSGAMQ0117: リソースタイプ %1$s はサポートされていません。";
    }
    @Override
    protected String missingName$str() {
        return "WFLYMSGAMQ0118: 名前がありません。";
    }
    @Override
    protected String jndiWasNotFound$str() {
        return "WFLYMSGAMQ0119: '%1$s' が既存の JMS リソース内に見つかりませんでした。";
    }
}
