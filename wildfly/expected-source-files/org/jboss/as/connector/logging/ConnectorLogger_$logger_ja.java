package org.jboss.as.connector.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:48+0200")
public class ConnectorLogger_$logger_ja extends ConnectorLogger_$logger implements ConnectorLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ConnectorLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String boundDataSource$str() {
        return "WFLYJCA0001: データソース [%1$s] をバインドしました";
    }
    @Override
    protected String boundJca$str() {
        return "WFLYJCA0002: Jakarta Connectors %1$s [%2$s] をバインドました";
    }
    @Override
    protected String cannotInstantiateDriverClass2$str() {
        return "WFLYJCA0003: ドライバークラス \"%1$s\" をインスタンス化できません: %2$s";
    }
    @Override
    protected String deployingCompliantJdbcDriver$str() {
        return "WFLYJCA0004: JDBC 準拠のドライバー %1$s (バージョン %2$d.%3$d) をデプロイしています";
    }
    @Override
    protected String deployingNonCompliantJdbcDriver$str() {
        return "WFLYJCA0005: JDBC に準拠しないドライバー %1$s (バージョン %2$d.%3$d) をデプロイしています";
    }
    @Override
    protected String registeredAdminObject$str() {
        return "WFLYJCA0006: %1$s で管理オブジェクトを登録しました";
    }
    @Override
    protected String registeredConnectionFactory$str() {
        return "WFLYJCA0007: 接続ファクトリ %1$s を登録しました";
    }
    @Override
    protected String startingSubsystem$str() {
        return "WFLYJCA0009: %1$s サブシステム (%2$s) を開始しています";
    }
    @Override
    protected String unboundDataSource$str() {
        return "WFLYJCA0010: データソース [%1$s] をアンバインドしました";
    }
    @Override
    protected String unboundJca$str() {
        return "WFLYJCA0011: Jakarta Connectors %1$s [%2$s] をアンバインドました";
    }
    @Override
    protected String driversElementNotSupported$str() {
        return "WFLYJCA0012: standalone -ds.xml デプロイメントの <drivers/> はサポートされません。%1$s を無視します";
    }
    @Override
    protected String driverNameAndResourceNameNotEquals$str() {
        return "WFLYJCA0015: 属性 driver-name (%1$s) はドライバーリソース名 (%2$s) と同じでなければなりません";
    }
    @Override
    protected String methodNotFoundOnDataSource$str() {
        return "WFLYJCA0016: DataSource クラス %2$s のメソッド %1$s が見つかりません。無視します";
    }
    @Override
    protected String forceIJToNull$str() {
        return "WFLYJCA0017: ironjacamar.xml 記述子に null を強制します";
    }
    @Override
    protected String startedDriverService$str() {
        return "WFLYJCA0018: driver-name = %1$s でドライバーサービスを開始しました";
    }
    @Override
    protected String stoppedDriverService$str() {
        return "WFLYJCA0019: driver-name = %1$s でドライバーサービスを停止しました";
    }
    @Override
    protected String unsupportedSelectorOption$str() {
        return "WFLYJCA0020: サポートされないセレクターのオプション: %1$s";
    }
    @Override
    protected String unsupportedPolicyOption$str() {
        return "WFLYJCA0021: サポートされないポリシーのオプション: %1$s";
    }
    @Override
    protected String failedToStartJGroupsChannel$str() {
        return "WFLYJCA0022: 分散ワークマネージャー %2$s の JGroups チャネル %1$s を開始できませんでした";
    }
    @Override
    protected String failedToFindDistributedWorkManager$str() {
        return "WFLYJCA0023: WorkManager %1$s が見つからないか、分散ワークマネージャーではありません。DWM のみが設定をオーバーライドできます";
    }
    @Override
    protected String failedToStartDWMTransport$str() {
        return "WFLYJCA0024: 分散ワークマネージャー %1$s の JGroups トランスポートを開始できませんでした";
    }
    @Override
    protected String unsupportedSelector$str() {
        return "WFLYJCA0025: サポートされないセレクターのオプション: %1$s";
    }
    @Override
    protected String unsupportedPolicy$str() {
        return "WFLYJCA0026: サポートされないポリシーのオプション: %1$s";
    }
    @Override
    protected String noSecurityDefined$str() {
        return "WFLYJCA0027: %1$s に対して定義されている ironjacamar.security がありません";
    }
    @Override
    protected String connectionFactoryAnnotation$str() {
        return "WFLYJCA0028: @ConnectionFactoryDefinition の管理は制限されます: %1$s";
    }
    @Override
    protected String adminObjectAnnotation$str() {
        return "WFLYJCA0029: @AdministeredObjectDefinition の管理は制限されます: %1$s";
    }
    @Override
    protected String cannotDeploy$str() {
        return "WFLYJCA0030: デプロイできません";
    }
    @Override
    protected String cannotDeployAndValidate$str() {
        return "WFLYJCA0031: ds あるいは xads を検証、デプロイできません";
    }
    @Override
    protected String deploymentError$str() {
        return "WFLYJCA0033: %1$s のデプロイメント中のエラー";
    }
    @Override
    protected String cannotInstantiateDriverClass1$str() {
        return "WFLYJCA0034: ドライバークラス\"%1$s\" をインスタンス化できません。詳細はログ (WARN) を参照してください";
    }
    @Override
    protected String driverVersionMismatch$str() {
        return "WFLYJCA0035: 指定のドライバーバージョンと実際のドライバーバージョンが一致しません";
    }
    @Override
    protected String failedToCreate$str() {
        return "WFLYJCA0036: %2$s]%n の %1$s インスタンスを作成できませんでした。理由: %3$s";
    }
    @Override
    protected String failedToGetMetrics$str() {
        return "WFLYJCA0037: メトリクス %1$s の取得に失敗しました";
    }
    @Override
    protected String failedToGetUrlDelimiter$str() {
        return "WFLYJCA0039: URL の区切り記号を取得できませんでした";
    }
    @Override
    protected String failedToInvokeOperation$str() {
        return "WFLYJCA0040: 操作の呼び出しに失敗しました: %1$s";
    }
    @Override
    protected String failedToLoadModuleDriver$str() {
        return "WFLYJCA0041: ドライバー[%1$s] のモジュールをロードできませんでした";
    }
    @Override
    protected String failedToMatchPool$str() {
        return "WFLYJCA0042: プールの一致に失敗しました。JndiNameを確認してください: %1$s";
    }
    @Override
    protected String failedToParseServiceXml$str() {
        return "WFLYJCA0043: サービス xml [%1$s] の解析に失敗しました";
    }
    @Override
    protected String failedToProcessRaChild$str() {
        return "WFLYJCA0044: [%1$s] のRA 子アーカイブを処理できませんでした";
    }
    @Override
    protected String failedToSetAttribute$str() {
        return "WFLYJCA0045: 属性の設定に失敗しました: %1$s";
    }
    @Override
    protected String failedToStartRaDeployment$str() {
        return "WFLYJCA0046: RA デプロイメント [%1$s] を開始できませんでした";
    }
    @Override
    protected String invalidConnection$str() {
        return "WFLYJCA0047: 接続は無効です";
    }
    @Override
    protected String jndiBindingsNotSupported$str() {
        return "WFLYJCA0049: 明示的でない JNDI バインディングには対応していません";
    }
    @Override
    protected String noMetricsAvailable$str() {
        return "WFLYJCA0050: 利用できるメトリクスはありません";
    }
    @Override
    protected String notAnAnnotation$str() {
        return "WFLYJCA0051: %1$s はアノテーションでなければなりません";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYJCA0052: %1$s が null です";
    }
    @Override
    protected String serviceAlreadyStarted$str() {
        return "WFLYJCA0053: %1$s サービス [%2$s] はすでに開始しています";
    }
    @Override
    protected String serviceNotAvailable$str() {
        return "WFLYJCA0054: %1$s サービス [%2$s] は利用できません";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYJCA0056: サービスは開始されていません";
    }
    @Override
    protected String undefinedVar$str() {
        return "WFLYJCA0058: %1$s は定義されていません";
    }
    @Override
    protected String failedToLoadNativeLibraries$str() {
        return "WFLYJCA0061: ネーティブのライブラリをロードできませんでした";
    }
    @Override
    protected String exceptionDeployingDatasource$str() {
        return "WFLYJCA0064: データソース %1$s のデプロイ中の例外";
    }
    @Override
    protected String noDataSourceRegisteredForAddress$str() {
        return "WFLYJCA0065: アドレス %1$s に DataSource は存在しません";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYJCA0066: 不明な属性 %1$s";
    }
    @Override
    protected String unknownOperation$str() {
        return "WFLYJCA0067: 不明な操作 %1$s";
    }
    @Override
    protected String xaDataSourcePropertiesNotPresent$str() {
        return "WFLYJCA0069: xa-datasource には、少なくとも 1 つのxa-datasource-property が必要です";
    }
    @Override
    protected String deploymentFailed$str() {
        return "WFLYJCA0072: デプロイメント %1$s は失敗しました";
    }
    @Override
    protected String failedToLoadModuleRA$str() {
        return "WFLYJCA0073: RA [%1$s] Cause: %2$s のモジュールのロードに失敗しました";
    }
    @Override
    protected String noSuchMethod$str() {
        return "WFLYJCA0074: メソッド %1$s が見つかりません";
    }
    @Override
    protected String noSuchField$str() {
        return "WFLYJCA0075: フィールド %1$s が見つかりません";
    }
    @Override
    protected String noPropertyResolution$str() {
        return "WFLYJCA0076: プロパティー %1$s に対する未知のプロパティー解決法です";
    }
    @Override
    protected String archiveOrModuleRequired$str() {
        return "WFLYJCA0077: 最低でも ARCHIVE または MODULE のどちらかが必要です";
    }
    @Override
    protected String compressedRarNotSupportedInModuleRA$str() {
        return "WFLYJCA0078: Rar は圧縮されていない形式でのみサポートされます。RA [%1$s] のモジュールのロードに失敗しました";
    }
    @Override
    protected String FailedDeployDriverNotSpecified$str() {
        return "WFLYJCA0079: ドライバーが指定されていないため、データソース %1$s のデプロイに失敗しました";
    }
    @Override
    protected String RARNotYetDeployed$str() {
        return "WFLYJCA0080: RAR '%1$s' がデプロイされていません。";
    }
    @Override
    protected String invalidConnectionFactory$str() {
        return "WFLYJCA0083: %3$s のデプロイ時、接続ファクトリーインターフェース (%1$s) はリソースアダプター '%2$s' には適切ではありません";
    }
    @Override
    protected String adminObjectForJCA10$str() {
        return "WFLYJCA0084: %2$s のデプロイ時、JCA 1.0 リソースアダプター '%1$s' の Admin オブジェクトが宣言されました";
    }
    @Override
    protected String invalidAdminObject$str() {
        return "WFLYJCA0085: %3$s のデプロイ時、Admin ブジェクトクラス (%1$s) はリソースアダプター '%2$s' には適切でありません";
    }
    @Override
    protected String cannotFindDriverClassName$str() {
        return "WFLYJCA0086: \"%1$s\" jar でドライバークラス名が見つかりません";
    }
    @Override
    protected String unableToRegisterRecovery$str() {
        return "WFLYJCA0087: リカバリーを登録できません: %1$s (%2$s)";
    }
    @Override
    protected String rejectAttributesMustBeTrue$str() {
        return "WFLYJCA0088: 属性 %1$s が拒否されました。true である必要があります";
    }
    @Override
    protected String exceptionDuringUnregistering$str() {
        return "WFLYJCA0089: デプロイメントの登録解除中に例外が発生しました";
    }
    @Override
    protected String jndiNameShouldValidate$str() {
        return "WFLYJCA0090: JNDI 名には '//' を含めたり、'/' で終わったりすることはできません";
    }
    @Override
    protected String deprecated$str() {
        return "WFLYJCA0091: -ds.xml ファイルデプロイメントは廃止される予定です。サポートは今後のバージョンで廃止される可能性があります。";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYJCA0092: インデックス化された子リソースは、順序付けされた子が親リソースによってサポートされる場合のみ登録できます。'%1$s' の親はインデックス化されていません。";
    }
    @Override
    protected String legacyDisableEnableOperation$str() {
        return "WFLYJCA0093: '%1$s' 操作は廃止されました。add または remove 操作の使用が推奨されます。必要な場合は write-attribute 操作を使用して廃止された enabled 属性を設定できます。";
    }
    @Override
    protected String errorDuringRecoveryShutdown$str() {
        return "WFLYJCA0096: リカバリーシャットダウン中のエラー";
    }
    @Override
    protected String errorStoppingRA$str() {
        return "WFLYJCA0097: リソースアダプター停止中の例外";
    }
    @Override
    protected String boundNonJTADataSource$str() {
        return "WFLYJCA0098: バインドされた非トランザクションデータソース: %1$s";
    }
    @Override
    protected String unBoundNonJTADataSource$str() {
        return "WFLYJCA0099: バインド解除された非トランザクションデータソース: %1$s";
    }
    @Override
    protected String noSupportedOperation$str() {
        return "WFLYJCA0100: 操作 %1$s はサポートされていません";
    }
    @Override
    protected String oneThreadPoolWorkManager$str() {
        return "WFLYJCA0101: スレッドプール: %1$s(タイプ: %2$s) は workmanager %3$s 向けに追加できません。タイプごとに 1 つのスレッドプールのみが許可されます。";
    }
    @Override
    protected String attributeRequiresTrueAttribute$str() {
        return "WFLYJCA0102: 属性 %1$s は %2$s が true である場合のみ定義できます";
    }
    @Override
    protected String attributeRequiresFalseOrUndefinedAttribute$str() {
        return "WFLYJCA0103: 属性 %1$s は %2$s が 未定義または false である場合のみ定義できます";
    }
    @Override
    protected String elytronHandlerHandle$str() {
        return "WFLYJCA0106: Elytron ハンドラーは次を処理します: %1$s";
    }
    @Override
    protected String executionSubjectNotSetInHandler$str() {
        return "WFLYJCA0107: 実行サブジェクトがコールバックハンドラーに提供されませんでした";
    }
    @Override
    protected String invalidCallbackSecurityDomain$str() {
        return "WFLYJCA0108: 提供されたコールバックにはセキュリティードメイン参照が含まれていません";
    }
    @Override
    protected String unsupportedCreateCallbackHandlerMethod$str() {
        return "WFLYJCA0109: セキュリティードメインが含まれるコールバックが必要です - 代わりに createCallbackHandler(Callback callback) を使用してください";
    }
    @Override
    protected String invalidCredentialSourceSupplier$str() {
        return "WFLYJCA0110: CredentialSourceSupplier は DSSecurity に対して無効です";
    }
    @Override
    protected String invalidElytronWorkManagerSetting$str() {
        return "WFLYJCA0111: WorkManager は RA one にしたがって elytron 有効フラグを設定していません";
    }
    @Override
    protected String datasourceIsDisabled$str() {
        return "WFLYJCA0112: データソース %1$s は無効になっています";
    }
    @Override
    protected String unexceptedWorkerCompletionError$str() {
        return "WFLYJCA0113: ワーカー実行中の予期せぬエラー: %1$s";
    }
    @Override
    protected String failedToLoadDataSourceClass$str() {
        return "WFLYJCA0114: データソースクラスのロードに失敗しました: %1$s";
    }
    @Override
    protected String missingDependencyInModuleDriver$str() {
        return "WFLYJCA0115: ドライバー [%1$s] のモジュールまたは依存関係の 1 つが不足しています: [%2$s]";
    }
    @Override
    protected String raModuleNotFound$str() {
        return "WFLYJCA0116: RA [%1$s] のモジュールをロードできませんでした - モジュールまたは依存関係の 1 つが不足しています [%2$s]";
    }
    @Override
    protected String notAValidDataSourceClass$str() {
        return "WFLYJCA0117: %1$s は有効な %2$s 実装ではありません";
    }
    @Override
    protected String bindingAlias$str() {
        return "WFLYJCA0118: %1$s という名前の接続ファクトリーをエイリアス %2$s にバインドします。";
    }
    @Override
    protected String unbindingAlias$str() {
        return "WFLYJCA0119: %1$s という名前の接続ファクトリーからエイリアス %2$s へのバインドを解除します";
    }
    @Override
    protected String cannotStartDSNoConnectionFactory$str() {
        return "WFLYJCA0120: 接続ファクトリーが存在しないか、定義されていない、または失敗しているため、データソース '%1$s' を起動できません。ログを確認してください。";
    }
    @Override
    protected String cannotStartDSTooManyConnectionFactories$str() {
        return "WFLYJCA0121: 複数の (%2$s) 接続ファクトリーが定義されているため、データソース '%1$s' を起動できません。";
    }
    @Override
    protected String threadPoolNameMustMatchWorkManagerName$str() {
        return "WFLYJCA0122: スレッドプール名 %1$s (タイプ: %2$s) は、ワークマネージャー名 %3$s と一致する必要があります。";
    }
    @Override
    protected String legacySecurityNotAvailable2$str() {
        return "WFLYJCA0123: リソースアダプター %2$s からの接続定義 %1$s は、存在しないレガシーセキュリティーサブシステムを必要とするように設定されています";
    }
    @Override
    protected String legacySecurityNotAvailable1$str() {
        return "WFLYJCA0124: データソース %1$s は、存在しないレガシーセキュリティーサブシステムを必要とするように設定されています";
    }
    @Override
    protected String legacySecurityNotAvailableForDsXml$str() {
        return "WFLYJCA0125: データソース %1$s は、存在しないレガシーセキュリティーサブシステムを必要とするように設定されています";
    }
    @Override
    protected String legacySecurityNotAvailableForRa$str() {
        return "WFLYJCA0126: %1$s の接続定義は、存在しないレガシーセキュリティーサブシステムを必要とするように設定されています";
    }
    @Override
    protected String legacySecurityNotAvailableForConnectionFactory$str() {
        return "WFLYJCA0127: 接続ファクトリー %1$s は、存在しないレガシーセキュリティーサブシステムを必要とするように設定されています";
    }
    @Override
    protected String legacySecurityNotAvailable0$str() {
        return "WFLYJCA0128: レガシーセキュリティーは利用できません";
    }
    @Override
    protected String wrongModuleName$str() {
        return "WFLYJCA0129: 誤ったモジュール名 %1$s";
    }
    @Override
    protected String reportDirectoryDoesNotExist$str() {
        return "WFLYJCA0130: レポートディレクトリー %1$s が存在しません";
    }
    @Override
    protected String legacySecurityAttributeNotSupported$str() {
        return "WFLYJCA0131: 従来のセキュリティー属性 %1$s はサポートされなくなりました。代わりに Elytron 設定を使用してください";
    }
    @Override
    protected String legacySecurityNotSupported$str() {
        return "WFLYJCA0132: 従来のセキュリティーはサポートされなくなりました。代わりに Elytron 設定を使用してください";
    }
    @Override
    protected String authorizationFailed$str() {
        return "WFLYJCA0133: 認可に失敗しました";
    }
    @Override
    protected String nameAttributeIsMandatory$str() {
        return "WFLYJCA0134: name 属性は workmanager 要素に必須です";
    }
    @Override
    protected String jdbcDriverNotInstalled$str() {
        return "WFLYJCA0135: jdbcドライバー: %1$s がインストールされていません";
    }
}
