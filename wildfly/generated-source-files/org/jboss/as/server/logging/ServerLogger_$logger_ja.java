package org.jboss.as.server.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:51+0200")
public class ServerLogger_$logger_ja extends ServerLogger_$logger implements ServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ServerLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotMixUnmanagedAndManagedContentItems$str() {
        return "WFLYSRV0203: %2$s の使用時に %1$s は使用できません。";
    }
    @Override
    protected String jbossDeploymentStructureIgnored$str() {
        return "WFLYSRV0001: サブデプロイメントの %1$s は無視されます。jboss-deployment-structure.xml はトップレベルのデプロイメントに対してのみ解析されます。";
    }
    @Override
    protected String unableToCreateAuthDir$str() {
        return "WFLYSRV0289: auth dir %1$s を作成できません。";
    }
    @Override
    protected String subdeploymentNotFound$str() {
        return "WFLYSRV0166: jboss-deployment-structure.xml でサブデプロイメント %1$s は見つかりませんでした。利用可能なサブデプロイメント: %2$s";
    }
    @Override
    protected String shutdownHookInvoked$str() {
        return "WFLYSRV0220: OS シグナルを介してサーバーのシャットダウンがリクエストされました";
    }
    @Override
    protected String invalidCommandLineOption$str() {
        return "WFLYSRV0073: 無効なオプション '%1$s'";
    }
    @Override
    protected String logHttpConsole$str() {
        return "WFLYSRV0051: 管理コンソールは http://%1$s:%2$d をリッスンしています。";
    }
    @Override
    protected String logDirectoryIsNotADirectory$str() {
        return "WFLYSRV0127: ログディレクトリーはディレクトリーではありません: %1$s";
    }
    @Override
    protected String annotationImportIgnored$str() {
        return "WFLYSRV0017: 追加モジュール %2$s の jboss-deployment-structure.xml に指定されたアノテーションのインポートオプション %1$s は無視されました。追加モジュールでアノテーションをインポートできません。";
    }
    @Override
    protected String failedToLoadModule$str() {
        return "WFLYSRV0179: モジュール '%1$s' のロードに失敗しました。";
    }
    @Override
    protected String couldNotCreateServerDataDirectory$str() {
        return "WFLYSRV0124: サーバーのデータディレクトリーを作成できませんでした: %1$s";
    }
    @Override
    protected String serverConfigFileInUse$str() {
        return "- 使用中のサーバー設定ファイル: %1$s";
    }
    @Override
    protected String valueExpectedForCommandLineOption$str() {
        return "WFLYSRV0072: オプション %1$s に想定される値";
    }
    @Override
    protected String startingNonGraceful$str() {
        return "WFLYSRV0282: サーバーは正常な起動を無効にして起動します。外部リクエストは、起動が完了するまで失敗の応答を受け取る可能性があります。";
    }
    @Override
    protected String serverStarting$str() {
        return "WFLYSRV0049: %1$s が起動中%2$s";
    }
    @Override
    protected String mechNoLoginNameGiven$str() {
        return "WFLYSRV0307: 認証メカニズムのログイン名が指定されていません";
    }
    @Override
    protected String runtimeNameMustBeUnique$str() {
        return "WFLYSRV0205: 同じランタイム名 %2$s の %1$s というデプロイメントがすでに存在します。";
    }
    @Override
    protected String cannotSpecifyBothAdminOnlyAndStartMode$str() {
        return "WFLYSRV0264: admin-only と start-mode の両方を指定することはできません";
    }
    @Override
    protected String logHttpManagement$str() {
        return "WFLYSRV0060: http://%1$s:%2$d/management 上でリッスンする HTTP 管理インターフェイス";
    }
    @Override
    protected String argGitAuth$str() {
        return "git クレデンシャルの管理するための elytron 設定ファイル。デフォルトは 'null' です。";
    }
    @Override
    protected String noSuchDeploymentContent$str() {
        return "WFLYSRV0084: デプロイメントコンテンツリポジトリーにはハッシュ %1$s があるデプロイメントコンテンツはありません。";
    }
    @Override
    protected String excludedDependenciesNotExist$str() {
        return "WFLYSRV0274: jboss-deployment-structure.xml を介して除外された依存関係 %1$s は存在しません。";
    }
    @Override
    protected String domainConfigDirDoesNotExist$str() {
        return "WFLYSRV0134: ドメイン設定ディレクトリーは存在しません: %1$s";
    }
    @Override
    protected String cannotMergeResourceRoot$str() {
        return "WFLYSRV0163: 別のファイルのリソースルートをマージできません。マージ元: %1$s、マージ先: %2$s";
    }
    @Override
    protected String nullModuleAttachment$str() {
        return "WFLYSRV0195: 必要なモジュールを取得できません: %1$s";
    }
    @Override
    protected String noSuchDeployment$str() {
        return "WFLYSRV0085: %1$s という名前のデプロイメントは見つかりませんでした。";
    }
    @Override
    protected String duplicateJBossXmlNamespace$str() {
        return "WFLYSRV0192: jboss-all.xml での名前空間 %1$s の重複";
    }
    @Override
    protected String argInterfaceBindAddress$str() {
        return "システムプロパティー jboss.bind.address.<interface> を指定の値に設定します。";
    }
    @Override
    protected String unableToInitialiseSSLContext$str() {
        return "WFLYSRV0117: 基本的な SSLContext '%1$s' を初期化できません。";
    }
    @Override
    protected String noMethodFound$str() {
        return "WFLYSRV0175: クラス (あるいはスーパークラス) %2$s で id %1$s があるメソッドが見つかりません";
    }
    @Override
    protected String cannotHaveMoreThanOneManagedContentItem$str() {
        return "WFLYSRV0201: 複数の %1$s は存在できません。";
    }
    @Override
    protected String errorGettingReflectiveInformation$str() {
        return "WFLYSRV0177: ClassLoader %2$s を持つ %1$s の反映情報の取得エラー";
    }
    @Override
    protected String cannotBothHaveFalseUseCurrentConfigAndServerConfig$str() {
        return "WFLYSRV0237: server-config を指定する場合に use-current-server-config=false を使用することはできません";
    }
    @Override
    protected String didNotReadEntireFile$str() {
        return "WFLYSRV0107: ファイル全体を読み取りしませんでした。%1$d がありません。";
    }
    @Override
    protected String invalidPoolSize$str() {
        return "WFLYSRV0265: システムプロパティー '%2$s' に対して無効な値 '%1$s' -- 値は負の値でない整数である必要があります。";
    }
    @Override
    protected String failedToRestoreConfiguration$str() {
        return "WFLYSRV0315: リポジトリー %1$s の初期化に失敗した後、設定を復元できませんでした";
    }
    @Override
    protected String cannotReadContentFromSelfContainedServer$str() {
        return "WFLYSRV0254: 自己充足的なサーバーでデプロイメントからコンテンツを読み取ることができません";
    }
    @Override
    protected String malformedCommandLineURL$str() {
        return "WFLYSRV0074: オプション '%2$s' に指定された不正な形式の URL '%1$s'";
    }
    @Override
    protected String unknownMountType$str() {
        return "WFLYSRV0112: 不明なマウントタイプ %1$s";
    }
    @Override
    protected String deploymentDeployedNotification$str() {
        return "WFLYSRV0234: \"%1$s\" (runtime-name : \"%2$s\") をデプロイしました。";
    }
    @Override
    protected String shuttingDownInResponseToManagementRequest$str() {
        return "WFLYSRV0241: 管理操作 '%1$s' に応じてシャットダウンしています";
    }
    @Override
    protected String deploymentStructureFileNotFound$str() {
        return "WFLYSRV0167: %1$s には jboss-deployment-structure.xml ファイルがありません。";
    }
    @Override
    protected String argDefaultMulticastAddress$str() {
        return "システムプロパティー jboss.default.multicast.address を指定の値に設定します。";
    }
    @Override
    protected String serviceModuleLoaderAlreadyStopped$str() {
        return "WFLYSRV0098: ServiceModuleLoader はすでに停止されています。";
    }
    @Override
    protected String deploymentReplaced$str() {
        return "WFLYSRV0016: デプロイメント \"%1$s\" がデプロイメント \"%2$s\" に置き換えられました。";
    }
    @Override
    protected String staticModuleIndexingFailed$str() {
        return "WFLYSRV0286: アノテーションの静的モジュール %1$s をインデックス化できませんでした";
    }
    @Override
    protected String logHttpsManagement$str() {
        return "WFLYSRV0061: https://%1$s:%2$d/management 上でリッスンする HTTP 管理インターフェイス";
    }
    @Override
    protected String serverConfigForReloadNotFound$str() {
        return "WFLYSRV0238: リロードに対して指定された server-config '%1$s' が見つかりませんでした";
    }
    @Override
    protected String creatingHttpManagementServiceOnSocket$str() {
        return "WFLYSRV0039: socket-binding (%1$s) を使い http 管理サービスを作成しています。";
    }
    @Override
    protected String classPathEntryNotValid$str() {
        return "WFLYSRV0059: %2$s のクラスパスエントリー %1$s は、Class-Path 参照において有効な jar を参照していません。";
    }
    @Override
    protected String couldNotMountOverlay$str() {
        return "WFLYSRV0224: 親 %2$s はディレクトリーでないためオーバーレイ %1$s をマウントできませんでした。";
    }
    @Override
    protected String deploymentUndeployedNotification$str() {
        return "WFLYSRV0233: \"%1$s\" (runtime-name: \"%2$s\") をアンデプロイしました。";
    }
    @Override
    protected String fdTooLow$str() {
        return "WFLYSRV0071: このプロセスではオペレーティングシステムによって、開かれたファイルの数が %1$d に制限されます。4096 以上の値が推奨されます。";
    }
    @Override
    protected String cannotExplodeAlreadyExplodedDeployment$str() {
        return "WFLYSRV0244: すでに展開されたデプロイメントを展開できません";
    }
    @Override
    protected String stoppedDeployment$str() {
        return "WFLYSRV0028: %3$d ミリ秒後にデプロイメント %1$s (runtime-name: %2$s) が停止しました。";
    }
    @Override
    protected String cannotCreateLocalDirectory$str() {
        return "WFLYSRV0106: ローカルディレクトリーを作成できません: %1$s";
    }
    @Override
    protected String embeddedServerDirectoryNotFound$str() {
        return "WFLYSRV0143: '%2$s' で '%1$s' と呼ばれるディレクトリーはありません";
    }
    @Override
    protected String serverBaseDirectoryIsNotADirectory$str() {
        return "WFLYSRV0135: サーバーベースディレクトリーはディレクトリーではありません: %1$s";
    }
    @Override
    protected String wildflyConfigUrlIsSet$str() {
        return "WFLYSRV0281: システムプロパティー %1$s が設定されました。これはスタンドアロンクライアントにのみ使用してください。これをサーバーで設定すると、プロファイル設定が上書きされます。";
    }
    @Override
    protected String undeployingDeploymentHasBeenRedeployed$str() {
        return "WFLYSRV0219: %1$s デプロイメントは再デプロイされ、デプロイメントのコンテンツは削除されません。再起動する必要があります。";
    }
    @Override
    protected String equivalentNamespacesInJBossXml$str() {
        return "WFLYSRV0193: jboss-all.xml に同じ名前空間の 2 つの異なるバージョンである %1$s と %2$s の両方が存在します。";
    }
    @Override
    protected String deploymentRestartDetected$str() {
        return "WFLYSRV0070: デプロイメント %1$s に対してデプロイメントの再開始が検出されました。代わりに完全な再デプロイが実行されます。";
    }
    @Override
    protected String unsupportedStability$str() {
        return "WFLYSRV0309: %1$s 安定性レベルは %2$s ではサポートされていません";
    }
    @Override
    protected String illegalPermissionActions$str() {
        return "WFLYSRV0223: 不正なパーミッションアクション '%1$s'";
    }
    @Override
    protected String argSystem$str() {
        return "システムプロパティーを設定します。";
    }
    @Override
    protected String additionalResourceRootDoesNotExist$str() {
        return "WFLYSRV0058: jboss-deployment-structure.xml で追加されたリソースルート %1$s は存在しません。";
    }
    @Override
    protected String argServerConfig$str() {
        return "使用するサーバー設定ファイル名 (デフォルトは \"standalone.xml\") (-c と同じ)";
    }
    @Override
    protected String invalidExtensionURI$str() {
        return "WFLYSRV0046: 拡張 %1$s の URI 構文は無効です: %2$s";
    }
    @Override
    protected String couldNotCreateServerBaseDirectory$str() {
        return "WFLYSRV0136: サーバーベースディレクトリーを作成できませんでした: %1$s";
    }
    @Override
    protected String rootServiceRemoved$str() {
        return "WFLYSRV0140: Root サービスが削除されました。";
    }
    @Override
    protected String aliasAddedAsExclusion$str() {
        return "WFLYSRV0294: '%1$s' モジュールエイリアスが、%3$s 経由で '%2$s' デプロイメントから除外されました。これは許可されていますが、ターゲットモジュールを代用することが推奨されます。このエイリアスをターゲットモジュール '%4$s' に置き換えることを検討してください。";
    }
    @Override
    protected String couldNotGetModuleInfo$str() {
        return "WFLYSRV0232: モジュール名のモジュール情報を取得できませんでした: %1$s";
    }
    @Override
    protected String logNoConsole$str() {
        return "WFLYSRV0054: 管理コンソールは有効ではありません。";
    }
    @Override
    protected String deploymentUndeployed$str() {
        return "WFLYSRV0009: \"%1$s\" (runtime-name: \"%2$s\") をアンデプロイしました。";
    }
    @Override
    protected String noSuchDeploymentOverlayContentAtBoot$str() {
        return "WFLYSRV0198: %3$s にあるデプロイメントオーバーレイ %2$s のデプロイメントコンテンツリポジトリーには、ハッシュ %1$s があるデプロイメントオーバーレイコンテンツがありません。これは致命的な起動エラーです。この問題を解決するには、--admin-only スイッチセットでの再起動、CLI を使用した不足しているコンテンツのインストール、または設定からの削除を行うか、xml 設定ファイルからデプロイメントオーバーレイを削除して再起動します。";
    }
    @Override
    protected String unknownStartMode$str() {
        return "WFLYSRV0263: 不明な起動モード %1$s";
    }
    @Override
    protected String failedToLoadFile$str() {
        return "WFLYSRV0200: ファイル %1$s の読み取りに失敗しました。";
    }
    @Override
    protected String disregardingNonGraceful$str() {
        return "WFLYSRV0283: 正常でない起動が一時停止中とともに要求されました。サーバーは一時停止を開始します。";
    }
    @Override
    protected String startingServerSuspended$str() {
        return "WFLYSRV0260: サーバーをサスペンドモードで起動しています";
    }
    @Override
    protected String hostControllerNameNullInDomain$str() {
        return "WFLYSRV0080: サーバーが管理対象ドメインにある場合は、hostControllerName は null とすることはできません。";
    }
    @Override
    protected String argReadOnlyServerConfig$str() {
        return "使用するサーバー設定ファイル名。これは '--server-config' とは異なり、元のファイルの '-c' は上書きされません。";
    }
    @Override
    protected String logHttpAndHttpsManagement$str() {
        return "WFLYSRV0062: http://%1$s:%2$d/management と https://%3$s:%4$d/management 上でリッスンする HTTP 管理インターフェイス";
    }
    @Override
    protected String deploymentRootRequired$str() {
        return "WFLYSRV0101: デプロイメントルートが必要です。";
    }
    @Override
    protected String failedToCreateTempFileProvider$str() {
        return "WFLYSRV0164: 一時ファイルプロバイダーの作成に失敗しました。";
    }
    @Override
    protected String errorOpeningZipFile$str() {
        return "WFLYSRV0276: zip ファイル %1$s を開くとエラーが発生します。";
    }
    @Override
    protected String securityRealmReferencesUnsupported$str() {
        return "WFLYSRV0287: セキュリティーレルムはサポート対象外になりました。設定から該当する参照を移行してください。";
    }
    @Override
    protected String throwableIsNull$str() {
        return "WFLYSRV0291: このスレッドでは、エラーの原因が不明です。他のログメッセージと呼び出し元で、可能性のある原因を確認してください。";
    }
    @Override
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYSRV0128: ログディレクトリーを作成できませんでした: %1$s";
    }
    @Override
    protected String cannotAddContentToUnmanagedDeployment$str() {
        return "WFLYSRV0247: 未管理のデプロイメントにコンテンツを追加できません";
    }
    @Override
    protected String deploymentDeployed$str() {
        return "WFLYSRV0010: \"%1$s\" (runtime-name : \"%2$s\") をデプロイしました。";
    }
    @Override
    protected String failedToLoadSSHCredentials$str() {
        return "WFLYSRV0277: SSH 認証情報のロードに失敗しました %1$s";
    }
    @Override
    protected String invalidObject$str() {
        return "WFLYSRV0147: %1$s が null です。";
    }
    @Override
    protected String caughtExceptionDuringBoot$str() {
        return "WFLYSRV0055: 起動時に例外を検出しました。";
    }
    @Override
    protected String couldNotFindHcFileRepositoryConnection$str() {
        return "WFLYSRV0109: ホストコントローラーに対するファイルレポジトリ接続が見つかりませんでした。";
    }
    @Override
    protected String homeDirectoryDoesNotExist$str() {
        return "WFLYSRV0119: ホームディレクトリーは存在しません: %1$s";
    }
    @Override
    protected String errorCopyingFile$str() {
        return "WFLYSRV0146: '%1$s' から '%2$s' へのコピーエラー";
    }
    @Override
    protected String invalidStreamURL$str() {
        return "WFLYSRV0150: URL '%1$s' から入力ストリームを作成できません。";
    }
    @Override
    protected String duplicateSubdeploymentListing$str() {
        return "WFLYSRV0169: サブデプロイメント '%1$s' は jboss-deployment-structure.xml にて 2 回リストされています。";
    }
    @Override
    protected String cannotFindExtensionListEntry$str() {
        return "WFLYSRV0047: %2$s から参照された Extension-List エントリー %1$s が見つかりませんでした。";
    }
    @Override
    protected String configuredSystemPropertiesLabel$str() {
        return "システムプロパティーを設定しました。";
    }
    @Override
    protected String caughtExceptionClosingContentInputStream$str() {
        return "WFLYSRV0042: アップロードしたデプロイメントコンテンツに対する入力ストリームを終了中に例外が検出されました。";
    }
    @Override
    protected String addingIgnored$str() {
        return ".gitignore を追加しています";
    }
    @Override
    protected String mechCallbackHandlerFailedForUnknownReason$str() {
        return "WFLYSRV0306: 不明な理由でコールバックハンドラーが失敗します";
    }
    @Override
    protected String suspendingServer1$str() {
        return "WFLYSRV0211: %1$d ミリ秒のタイムアウトでサーバーを一時停止しています。";
    }
    @Override
    protected String startingSubDeployment$str() {
        return "WFLYSRV0207: サブデプロイメントを開始します (runtime-name: \"%1$s\")";
    }
    @Override
    protected String cannotAddMoreThanOneSocketBindingGroupForServerOrHost$str() {
        return "WFLYSRV0190: ソケットバインディンググループを複数追加できません。'%1$s' の追加が試行されましたが、'%2$s' はすでに存在しています。";
    }
    @Override
    protected String argGracefulStartup$str() {
        return "サーバーが完全に起動するまで、サーバーを正常に起動して、リクエストをキューするか、明確に拒否します。";
    }
    @Override
    protected String deploymentAlreadyStarted$str() {
        return "WFLYSRV0087: デプロイメント %1$s はすでに開始されています。";
    }
    @Override
    protected String argStartMode$str() {
        return "サーバーの起動モードを設定し、'normal'、'admin-only' または 'suspend' とすることができます。'suspend' にするとサーバーはサスペンドモードで起動し、再開するまでリクエストに対応しません。admin-only モードで起動するとサーバーは管理インターフェイスのみを開き、管理リクエストを受け取りますが、他のランタイムサービスを開始しない、あるいはエンドユーザーのリクエストを受け取りません。--admin-only と併せて使用することはできません。";
    }
    @Override
    protected String logHttpsConsole$str() {
        return "WFLYSRV0052: 管理コンソールは https://%1$s:%2$d をリッスンしています。";
    }
    @Override
    protected String externalResourceRootsNotSupported$str() {
        return "WFLYSRV0171: 外部リソースルートはサポートしていません。リソースルートを '/' で始めてはなりません: %1$s";
    }
    @Override
    protected String failedToGetFileFromRemoteRepository$str() {
        return "WFLYSRV0105: リモートレポジトリからファイルを取得できませんでした。";
    }
    @Override
    protected String duplicateDeploymentUnitProcessor$str() {
        return "WFLYSRV0206: 優先度が %1$s でクラスが %2$s の複数のデプロイメントユニットプロセッサーが登録されています";
    }
    @Override
    protected String failedToCleanObsoleteContent$str() {
        return "WFLYSRV0216: 廃止されたコンテンツ %1$s の消去エラー";
    }
    @Override
    protected String startedWitErrorsMessage$str() {
        return "%1$s はエラーがある状態で %2$d ミリ秒で開始しました - サービス %4$d 個のうち %3$d 個を開始しました (%5$d のサービスは失敗したか、依存関係が不明です。%6$d のサービスはレイジー、パッシブ、またはオンデマンドです) %7$s";
    }
    @Override
    protected String mechTokenNotVerified$str() {
        return "WFLYSRV0300: 認証メカニズムトークンが検証されていません";
    }
    @Override
    protected String argShortServerConfig$str() {
        return "使用するサーバー設定ファイル名 (デフォルトは \"standalone.xml\") (--server-config と同じ)";
    }
    @Override
    protected String couldNotCreateServerContentDirectory$str() {
        return "WFLYSRV0126: サーバーコンテンツディレクトリーを作成できませんでした: %1$s";
    }
    @Override
    protected String failedToResolveMulticastAddress$str() {
        return "WFLYSRV0187: %1$s のマルチキャストアドレスの取得に失敗しました。";
    }
    @Override
    protected String failedToConnectToHostController$str() {
        return "WFLYSRV0213: ホストコントローラーへの接続に失敗しました。再試行しています。";
    }
    @Override
    protected String aborting$str() {
        return "WFLYSRV0239: 終了コード %1$d で強制終了します";
    }
    @Override
    protected String failedToGetManifest$str() {
        return "WFLYSRV0161: デプロイメント %1$s のマニフェストを取得できませんでした。";
    }
    @Override
    protected String deploymentOverlayFailed$str() {
        return "WFLYSRV0196: %2$s でデプロイメントオーバーレイ %1$s のコンテンツを取得できませんでした。";
    }
    @Override
    protected String caughtExceptionUndeploying$str() {
        return "WFLYSRV0043: デプロイメントユニットプロセッサー %1$s によって、%3$s のアンデプロイフェーズ %2$s の最中に予期せぬ例外が発生しました。";
    }
    @Override
    protected String errorUsingGit$str() {
        return "WFLYSRV0271: Git エラー: %1$s";
    }
    @Override
    protected String replaceRolledBackWithNoMessage$str() {
        return "WFLYSRV0015: デプロイメント \"%1$s\" のデプロイメント \"%2$s\" への置き換えがロールバックされましたが、失敗メッセージは出力されませんでした。";
    }
    @Override
    protected String serverStabilityInUse$str() {
        return "- 最低限の機能安定性レベル: %1$s";
    }
    @Override
    protected String cannotExplodeUnmanagedDeployment$str() {
        return "WFLYSRV0243: 管理されていないデプロイメントを展開できません";
    }
    @Override
    protected String couldNotObtainServerUuidFile$str() {
        return "WFLYSRV0231: ファイルのサーバー UUID を読み取りまたは作成できませんでした: %1$s";
    }
    @Override
    protected String suspendingServerWithNoTimeout$str() {
        return "WFLYSRV0236: タイムアウトなしでサーバーを一時停止しています。";
    }
    @Override
    protected String mechNoTokenGiven$str() {
        return "WFLYSRV0304: 認証メカニズムトークンが指定されていません";
    }
    @Override
    protected String cannotLoadAnnotationIndex$str() {
        return "WFLYSRV0002: アノテーションインデックス \"%1$s\" のロードに失敗しましたが、以下の例外があります: %2$s";
    }
    @Override
    protected String argStability$str() {
        return "特定の安定性レベルを使用してサーバーを実行します。使用可能な値: %1$s、デフォルト = %2$s";
    }
    @Override
    protected String mechMessageTooLong$str() {
        return "WFLYSRV0298: 認証メカニズムのメッセージが長すぎます";
    }
    @Override
    protected String processStateChangeNotificationDescription$str() {
        return "プロセスのステータスが変更すると警告が出力されます";
    }
    @Override
    protected String argProperties$str() {
        return "指定の url からシステムプロパティーをロードします";
    }
    @Override
    protected String noArgValue$str() {
        return "WFLYSRV0108: 引数 %1$s%n に値が指定されていません。";
    }
    @Override
    protected String cannotRemoveContentFromUnexplodedDeployment$str() {
        return "WFLYSRV0252: 展開されていないデプロイメントからコンテンツを削除できません";
    }
    @Override
    protected String deprecatedApiUsed$str() {
        return "WFLYSRV0221: デプロイメント \"%1$s\" は非推奨のモジュール (\"%2$s\") を使用していますが、今後のバージョンで予告なく削除される可能性があります。";
    }
    @Override
    protected String cannotHaveBothInitialServerConfigAndServerConfig$str() {
        return "WFLYSRV0191: --server-config と --initial-server-config を同時に使用することはできません。";
    }
    @Override
    protected String failedCreatingTempProvider$str() {
        return "WFLYSRV0113: 一時ファイルプロバイダーの作成に失敗しました。";
    }
    @Override
    protected String serverControllerServiceRemoved$str() {
        return "WFLYSRV0139: サーバーコントローラーサービスが削除されました。";
    }
    @Override
    protected String failedToInstantiateClassTransformer$str() {
        return "WFLYSRV0158: %1$s のインスタンス化に失敗しました。";
    }
    @Override
    protected String resumingServer$str() {
        return "WFLYSRV0212: サーバーを再開しています";
    }
    @Override
    protected String vaultSupportRemoved$str() {
        return "WFLYSRV0285: Vault サポートは削除され、vault リソースは初期化されません。";
    }
    @Override
    protected String logNoHttpManagement$str() {
        return "WFLYSRV0063: HTTP 管理インターフェイスが有効になっていません。";
    }
    @Override
    protected String unexpectedContent$str() {
        return "WFLYSRV0174: 型 '%1$s' 名前 '%2$s'、テキスト %3$s の予期せぬコンテンツ";
    }
    @Override
    protected String invalidStreamBytes$str() {
        return "WFLYSRV0151: パラメーター %1$s に利用できるバイト数がありません。";
    }
    @Override
    protected String deploymentRolledBackWithNoMessage$str() {
        return "WFLYSRV0022: デプロイメント \"%1$s\" のデプロイがロールバックされましたが、失敗メッセージは出力されませんでした。";
    }
    @Override
    protected String serverBaseDirectoryDoesNotExist$str() {
        return "WFLYSRV0122: サーバーベースディレクトリーは存在しません: %1$s";
    }
    @Override
    protected String cannotRemoveContentFromUnmanagedDeployment$str() {
        return "WFLYSRV0251: 未管理のデプロイメントからコンテンツを削除できません";
    }
    @Override
    protected String creatingHttpManagementServiceOnSecureSocket$str() {
        return "WFLYSRV0040: secure-socket-binding (%1$s) を使い http 管理サービスを作成しています。";
    }
    @Override
    protected String couldNotCreateServerTempDirectory$str() {
        return "WFLYSRV0130: サーバーの一時ディレクトリーを作成できませんでした: %1$s";
    }
    @Override
    protected String creatingHttpManagementServiceOnSocketAndSecureSocket$str() {
        return "WFLYSRV0041: socket-binding (%1$s) と secure-socket-binding (%2$s) を使い http 管理サービスを作成しています。";
    }
    @Override
    protected String deploymentIndexingFailed$str() {
        return "WFLYSRV0156: アノテーション向けにデプロイメントルートをインデックス化できませんでした。";
    }
    @Override
    protected String unknownContentItemKey$str() {
        return "WFLYSRV0202: 不明なコンテンツアイテムキー: %1$s";
    }
    @Override
    protected String subdeploymentsRequireParent$str() {
        return "WFLYSRV0102: サブデプロイメントには親となるデプロイメントユニットが必要です。";
    }
    @Override
    protected String argHelp$str() {
        return "このメッセージを表示し、終了";
    }
    @Override
    protected String reportAdminOnlyMissingDeploymentContent$str() {
        return "WFLYSRV0057: デプロイメント %2$s のデプロイメントコンテンツリポジトリーにはハッシュ %1$s があるデプロイメントコンテンツがありません。この Host Controller は ADMIN-ONLY モードで起動しているため、管理者がこの問題を修正できるように起動は続行されます。Host Controller が ADMIN-ONLY モードでない場合、これは致命的な起動障害となります。";
    }
    @Override
    protected String failedToStartHttpManagementService$str() {
        return "WFLYSRV0083: http-interface サービスの開始に失敗しました。";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYSRV0173: 必要な属性が 1 つ以上見つかりません: %1$s";
    }
    @Override
    protected String noDeploymentRepositoryAvailable$str() {
        return "WFLYSRV0159: デプロイメントリポジトリがありません。";
    }
    @Override
    protected String startingDeployment$str() {
        return "WFLYSRV0027: \"%1$s\" (runtime-name: \"%2$s\") のデプロイメントを開始しました。";
    }
    @Override
    protected String extensionMissingManifestAttribute$str() {
        return "WFLYSRV0045: 拡張 %1$s には必要なマニフェスト属性 %2$s-%3$s がありません (拡張をスキップします)。";
    }
    @Override
    protected String errorLoadingJBossXmlFile$str() {
        return "WFLYSRV0194: %1$s から jboss-all.xml の読み込み中にエラー";
    }
    @Override
    protected String redeployRolledBack$str() {
        return "WFLYSRV0011: デプロイメント \"%1$s\" の再デプロイがロールバックされ、次の失敗メッセージが出力されました: %2$s";
    }
    @Override
    protected String illegalPermissionName$str() {
        return "WFLYSRV0222: 不正なパーミッション名 '%1$s'";
    }
    @Override
    protected String requiredSystemPropertyMissing$str() {
        return "WFLYSRV0257: 必須のシステムプロパティー '%1$s' が設定されていません。";
    }
    @Override
    protected String stoppedSubDeployment$str() {
        return "WFLYSRV0208: サブデプロイメントが %1$s ミリ秒で停止されました (runtime-name: \"%2$d\")";
    }
    @Override
    protected String multipleContentItemsNotSupported$str() {
        return "WFLYSRV0152: 現在対応しているコンテンツは 1 つのみです(AS7-431)。";
    }
    @Override
    protected String invalidModuleName$str() {
        return "WFLYSRV0170: 追加のモジュール名 '%1$s' は無効です。名前は 'deployment' で始まる必要があります。";
    }
    @Override
    protected String failedToParseEnumProperty$str() {
        return "WFLYSRV0308: プロパティーの解析に失敗しました (%1$s)。値 (%2$s) が次のいずれかに一致する必要があります: %3$s";
    }
    @Override
    protected String privateApiUsed$str() {
        return "WFLYSRV0018: デプロイメント \"%1$s\" はプライベートモジュール (\"%2$s\") を使っていますが、このモジュールは今後のバージョンで予告なく変更または削除される可能性があります。";
    }
    @Override
    protected String unableToCreateTempDirForAuthTokensFileExists$str() {
        return "WFLYSRV0288: ファイルがすでに存在しているため認証トークンに tmp dir を作成できません。";
    }
    @Override
    protected String domainBaseDirDoesNotExist$str() {
        return "WFLYSRV0133: ドメインベースディレクトリーは存在しません: %1$s";
    }
    @Override
    protected String nullParameter$str() {
        return "WFLYSRV0204: Null '%1$s'";
    }
    @Override
    protected String argGitRepo$str() {
        return "サーバー設定を取得するためにクローンする git リポジトリー。";
    }
    @Override
    protected String configuredSystemEnvironmentLabel$str() {
        return "システム環境を設定しました。";
    }
    @Override
    protected String errorLoadingDeploymentStructureFile$str() {
        return "WFLYSRV0168: %1$s から jboss-deployment-structure.xml をロード中にエラー";
    }
    @Override
    protected String unsupportedApiUsed$str() {
        return "WFLYSRV0019: デプロイメント \"%1$s\" ではサポートされていないモジュール (\"%2$s\") が使用されていますが、このモジュールは今後のバージョンで予告なく変更または削除される可能性があります。";
    }
    @Override
    protected String noSuchDeploymentOverlayContent$str() {
        return "WFLYSRV0199: デプロイメントコンテンツリポジトリーにはハッシュ %1$s があるデプロイメントオーバーレイコンテンツはありません。";
    }
    @Override
    protected String failedToUnmountContentOverride$str() {
        return "WFLYSRV0065: デプロイメントオーバーレイをアンマウントできませんでした。";
    }
    @Override
    protected String undeploymentRolledBackWithNoMessage$str() {
        return "WFLYSRV0008: デプロイメント \"%1$s\" のアンデプロイがロールバックされましたが、失敗メッセージは出力されませんでした。";
    }
    @Override
    protected String failedToParseCommandLineInteger$str() {
        return "WFLYSRV0023: プロパティー (%1$s)、値 (%2$s) を整数として解析できませんでした。";
    }
    @Override
    protected String cannotExplodeSubDeploymentOfUnexplodedDeployment$str() {
        return "WFLYSRV0258: 展開されていないデプロイメントのサブデプロイメントを展開できません";
    }
    @Override
    protected String couldNotCreateControllerTempDirectory$str() {
        return "WFLYSRV0132: サーバーの一時ディレクトリーを作成できませんでした: %1$s";
    }
    @Override
    protected String argAdminOnly$str() {
        return "サーバーの実行タイプを ADMIN_ONLY に設定します。ADMIN_ONLY では管理インターフェイスが開き管理リクエストを受け取りますが、他のランタイムサービスを開始しない、あるいはエンドユーザーのリクエストを受け取りません。--start-mode と併せて使用することはできません。非推奨であるため、代わりに --start-mode=admin-only を使用してください。";
    }
    @Override
    protected String unsuccessfulBoot$str() {
        return "WFLYSRV0056: サーバーは起動に失敗しリカバリーできません。終了します。詳細については以前のメッセージを参照してください。%1$s";
    }
    @Override
    protected String argSecurityProperty$str() {
        return "セキュリティープロパティーを設定します。";
    }
    @Override
    protected String systemPropertyNotManageable$str() {
        return "WFLYSRV0115: システムプロパティー %1$s は xml 設定ファイルあるいは管理クライアントから設定できません。初期プロセスの開始時にこの値が認識される必要があるため、コマンドラインからのみ設定可能です。";
    }
    @Override
    protected String unexpectedEndOfDocument$str() {
        return "WFLYSRV0172: 予期せず文書が終了しました。";
    }
    @Override
    protected String secureSocketBindingRequiresSSLContext$str() {
        return "WFLYSRV0259: secure-socket-binding 属性が定義される場合は、ssl-context も定義する必要があります。";
    }
    @Override
    protected String shuttingDownInResponseToProcessControllerSignal$str() {
        return "WFLYSRV0240: ProcessController がシャットダウンするよう通知しました; シャットダウン中";
    }
    @Override
    protected String argPublicBindAddress$str() {
        return "システムプロパティー jboss.bind.address を指定の値に設定します。";
    }
    @Override
    protected String unableToInitialiseGitRepository$str() {
        return "WFLYSRV0280: git リポジトリーを初期化できません。";
    }
    @Override
    protected String jbossDeploymentStructureNamespaceIgnored$str() {
        return "WFLYSRV0064: urn:jboss:deployment-structure 名前空間がサブデプロイメント %1$s の jboss.xml で見つかりました。これはトップレベルのデプロイメントでのみ有効です。";
    }
    @Override
    protected String cannotExplodeEnabledDeployment$str() {
        return "WFLYSRV0245: すでにデプロイされたデプロイメントを展開できません";
    }
    @Override
    protected String noSuchDeploymentContentAtBoot$str() {
        return "WFLYSRV0137: デプロイメント %2$s のデプロイメントコンテンツリポジトリーには、ハッシュ %1$s があるデプロイメントコンテンツがありません。これは致命的な起動エラーです。この問題を解決するには、--admin-only スイッチセットでの再起動、CLI を使用した不足しているコンテンツのインストール、または設定からの削除を行うか、xml 設定ファイルからデプロイメントを削除して再起動します。";
    }
    @Override
    protected String caughtIOExceptionUploadingContent$str() {
        return "WFLYSRV0093: アップロードしたデプロイメントコンテンツを読み取り中に IOException を検出しました。";
    }
    @Override
    protected String serverDataDirectoryIsNotDirectory$str() {
        return "WFLYSRV0123: サーバーデータディレクトリーはディレクトリーではありません: %1$s";
    }
    @Override
    protected String deploymentRolledBack$str() {
        return "WFLYSRV0021: デプロイメント \"%1$s\" のデプロイがロールバックされ、次の失敗メッセージが出力されました: %2$s";
    }
    @Override
    protected String noServerInstallationPrepared$str() {
        return "WFLYSRV0295: %1$s インストールは準備されていません。";
    }
    @Override
    protected String deploymentMountFailed$str() {
        return "WFLYSRV0160: デプロイメントコンテンツのマウントに失敗しました。";
    }
    @Override
    protected String serverStopped$str() {
        return "WFLYSRV0050: %2$dミリ秒以内に %1$s が停止しました。";
    }
    @Override
    protected String deploymentRedeployed$str() {
        return "WFLYSRV0013: \"%1$s\" を再デプロイしました。";
    }
    @Override
    protected String deploymentDependenciesAreATopLevelElement$str() {
        return "WFLYSRV0067: jboss-deployment-dependencies はサブデプロイメントで使用できません。ear レベルで指定する必要があります: %1$s";
    }
    @Override
    protected String cannotResolveInterface$str() {
        return "WFLYSRV0081: 指定のインターフェイス選択基準を使って IP アドレスを解決できません。失敗 -- %1$s";
    }
    @Override
    protected String argVersion$str() {
        return "バージョンを出力し、終了";
    }
    @Override
    protected String couldNotCopyFiles$str() {
        return "WFLYSRV0249: 管理されたコンテンツリポジトリーから %1$s の稼働中のデプロイメントにファイルをコピーできませんでした";
    }
    @Override
    protected String failedToPublishConfiguration$str() {
        return "WFLYSRV0270: %1$s に設定を公開できませんでした";
    }
    @Override
    protected String vfsNotAvailable$str() {
        return "WFLYSRV0138: VFS は設定済みのモジュールローダーから利用できません。";
    }
    @Override
    protected String argDebugPort$str() {
        return "ポートを指定するオプションの引数でデバッグモードを有効にします。起動スクリプトがデバッグモードをサポートする場合のみ動作します。";
    }
    @Override
    protected String cannotExplodeDeploymentOfSelfContainedServer$str() {
        return "WFLYSRV0242: 自己充足的なサーバーでデプロイメントを展開できません";
    }
    @Override
    protected String jmxAttributeChange$str() {
        return "属性 '%1$s' が '%2$s' から '%3$s' に変更されました";
    }
    @Override
    protected String requiredServiceNotUp$str() {
        return "WFLYSRV0292: 要求されたサービス '%1$s' は UP の状態ではなく、現在 '%2$s' の状態です。";
    }
    @Override
    protected String cannotIndexClass$str() {
        return "WFLYSRV0003: %2$s のクラス %1$s をインデックス化できませんでした。";
    }
    @Override
    protected String bootComplete$str() {
        return "WFLYSRV0261: ブートが完了";
    }
    @Override
    protected String nullStreamAttachment$str() {
        return "WFLYSRV0094: インデックス [%1$d] の null ストリーム";
    }
    @Override
    protected String httpManagementInterfaceIsUnsecured$str() {
        return "WFLYSRV0035: http 管理サービスに対してセキュリティーレルムや http サーバー認証が定義されていません。アクセスはすべて制限されなくなります。";
    }
    @Override
    protected String failedToResolveMulticastAddressForRollback$str() {
        return "WFLYSRV0188: %1$s のマルチキャストアドレスの取得に失敗しました。";
    }
    @Override
    protected String unableToFindYaml$str() {
        return "WFLYSRV0290: 指定された YAML ファイルが見つかりませんでした %1$s";
    }
    @Override
    protected String propertySpecifiedFileIsNotADirectory$str() {
        return "WFLYSRV0145: -D%1$s=%2$s is はディレクトリーではありません";
    }
    @Override
    protected String startedWitErrors$str() {
        return "WFLYSRV0026: %1$s";
    }
    @Override
    protected String gitRespositoryInitialized$str() {
        return "WFLYSRV0279: %1$s で Git が初期化されました";
    }
    @Override
    protected String invalidStreamIndex$str() {
        return "WFLYSRV0149: 無効な '%1$s' 値: %2$d、最大インデックスは %3$d です。";
    }
    @Override
    protected String undeploymentRolledBack$str() {
        return "WFLYSRV0007: デプロイメント \"%1$s\" のアンデプロイがロールバックされ、次の失敗メッセージが出力されました: %2$s";
    }
    @Override
    protected String unableToLoadProperties$str() {
        return "WFLYSRV0075: URL %1$s からプロパティーをロードできません。";
    }
    @Override
    protected String serverTempDirectoryIsNotADirectory$str() {
        return "WFLYSRV0129: サーバーの一時ディレクトリーは存在しません: %1$s";
    }
    @Override
    protected String redeployRolledBackWithNoMessage$str() {
        return "WFLYSRV0012: デプロイメント \"%1$s\" の再デプロイがロールバックされましたが、失敗メッセージは出力されませんでした。";
    }
    @Override
    protected String failedToRemoveDeploymentContent$str() {
        return "WFLYSRV0020: デプロイメントコンテンツ %1$s の削除中に例外が発生しました。";
    }
    @Override
    protected String invalidDeploymentURL$str() {
        return "WFLYSRV0095: '%1$s' は有効な URL ではありません";
    }
    @Override
    protected String reportAdminOnlyMissingDeploymentOverlayContent$str() {
        return "WFLYSRV0068: %3$s では、デプロイメント %2$s のデプロイメントコンテンツリポジトリーにはハッシュ %1$s があるデプロイメントオーバーレイコンテンツがありません。この Host Controller は ADMIN-ONLY モードで起動しているため、管理者がこの問題を修正できるように起動は続行されます。Host Controller が ADMIN-ONLY モードでない場合、これは致命的な起動障害となります。";
    }
    @Override
    protected String couldNotDeleteFile$str() {
        return "WFLYSRV0253: ファイル %1$s を稼働中のデプロイメント %2$s から削除できませんでした。";
    }
    @Override
    protected String failedToInitRepository$str() {
        return "WFLYSRV0269: リポジトリー %1$s の初期化に失敗しました";
    }
    @Override
    protected String startedClean$str() {
        return "WFLYSRV0025: %1$s";
    }
    @Override
    protected String externalModuleServiceAlreadyStarted$str() {
        return "WFLYSRV0178: 外部モジュールサービスはすでに開始されています。";
    }
    @Override
    protected String serverAlreadyPaused$str() {
        return "WFLYSRV0210: サーバーはすでに一時停止されています";
    }
    @Override
    protected String serverContentDirectoryIsNotDirectory$str() {
        return "WFLYSRV0125: サーバーコンテンツディレクトリーはディレクトリーではありません: %1$s";
    }
    @Override
    protected String cannotReadContentFromUnmanagedDeployment$str() {
        return "WFLYSRV0255: 未管理のデプロイメントからコンテンツを読み取ることができません";
    }
    @Override
    protected String invalidPortOffset$str() {
        return "WFLYSRV0148: portOffset は範囲外です。";
    }
    @Override
    protected String archiveMountFailed$str() {
        return "WFLYSRV0267: リソースルート '%1$s' をマウントできません。これはアーカイブですか?";
    }
    @Override
    protected String usingGit$str() {
        return "WFLYSRV0278: 設定履歴は Git を介して管理されます。";
    }
    @Override
    protected String cannotAddContentToSelfContainedServer$str() {
        return "WFLYSRV0246: 自己充足的なサーバーでデプロイメントにコンテンツを追加できません";
    }
    @Override
    protected String logHttpAndHttpsConsole$str() {
        return "WFLYSRV0053: 管理コンソールは http://%1$s:%2$d と https://%3$s:%4$d をリッスンしています。";
    }
    @Override
    protected String failedToResolveInterface$str() {
        return "WFLYSRV0082: インターフェイス %1$s の解決に失敗しました。";
    }
    @Override
    protected String maximumNumberOfJarResources$str() {
        return "WFLYSRV0275: global-directory モジュール名 '%1$s' は許容される jar リソースの最大数に達しました。最大で %2$d 個のファイルが許可されます。";
    }
    @Override
    protected String argGitBranch$str() {
        return "サーバー設定を取得するために使用する git ブランチ。デフォルトは 'master' です。";
    }
    @Override
    protected String propertySpecifiedFileDoesNotExist$str() {
        return "WFLYSRV0144: -D%1$s=%2$s は存在しません";
    }
    @Override
    protected String securityManagerEnabled$str() {
        return "WFLYSRV0235: セキュリティーマネージャーは有効になっています";
    }
    @Override
    protected String excludedSubSystemsNotExist$str() {
        return "WFLYSRV0273: jboss-deployment-structure.xml を介して除外されたサブシステム %1$s は存在しません。";
    }
    @Override
    protected String vmArgumentsLabel$str() {
        return "VM 引数: %1$s";
    }
    @Override
    protected String vaultNotInitializedException$str() {
        return "WFLYSRV0230: vault は初期化されていません。 vault 式を解決できません。";
    }
    @Override
    protected String nativeManagementInterfaceIsUnsecured$str() {
        return "WFLYSRV0034: ネイティブ管理サービスに対してセキュリティーレルムや sasl サーバー認証が定義されていません。アクセスはすべて制限されなくなります。";
    }
    @Override
    protected String failedToResume$str() {
        return "WFLYSRV0215: アクティビティー %1$s の再開に失敗しました。通常の操作を再開するにはサーバーを再起動することが推奨されます。";
    }
    @Override
    protected String suspendingServer0$str() {
        return "WFLYSRV0272: サーバーの一時停止";
    }
    @Override
    protected String mechAuthorizationFailed$str() {
        return "WFLYSRV0301: 認証メカニズムの認可が失敗しました: \"%1$s\" は \"%2$s\" として実行中です";
    }
    @Override
    protected String configDirectoryDoesNotExist$str() {
        return "WFLYSRV0121: 設定ディレクトリーは存在しません: %1$s";
    }
    @Override
    protected String cannotSetBothAdminOnlyAndStartMode$str() {
        return "WFLYSRV0262: --start-mode と --admin-only の両方を設定することはできません。";
    }
    @Override
    protected String aliasAddedAsDependency$str() {
        return "WFLYSRV0293: '%1$s' モジュールエイリアスが、'%2$s' デプロイメントへの依存関係として %3$s 経由で追加されました。これは許可されていますが、ターゲットモジュールを代用することが推奨されます。このエイリアスをターゲットモジュール '%4$s' に置き換えることを検討してください。";
    }
    @Override
    protected String failedToCreateVFSResourceLoader$str() {
        return "WFLYSRV0104: ルート [%1$s] の VFSResourceLoader を作成できませんでした。";
    }
    @Override
    protected String systemPropertyCannotOverrideServerName$str() {
        return "WFLYSRV0116: xml 設定ファイルあるいは管理クライアントからサーバー名を設定した後にシステムプロパティー %1$s を設定できません。";
    }
    @Override
    protected String failedToPullRepository$str() {
        return "WFLYSRV0268: リポジトリー %1$s のプルに失敗しました";
    }
    @Override
    protected String missingModulePrefix$str() {
        return "WFLYSRV0099: 名前が '%2$s' で始まらないため、'%1$s' は ServiceModuleLoader からロードできません。";
    }
    @Override
    protected String missingHomeDirConfiguration$str() {
        return "WFLYSRV0088: 設定値が抜けています: %1$s";
    }
    @Override
    protected String resourceTooLarge$str() {
        return "WFLYSRV0165: 有効なクラスファイルとなるには、リソースが大きすぎます。";
    }
    @Override
    protected String hostControllerNameNonNullInStandalone$str() {
        return "WFLYSRV0079: サーバーが管理対象ドメインにない場合は、hostControllerName は null でなければなりません。";
    }
    @Override
    protected String repositoryInitialized$str() {
        return "リポジトリーが初期化されました";
    }
    @Override
    protected String mechNoSecurityLayer$str() {
        return "WFLYSRV0302: 認証メカニズムはセキュリティー層をサポートしていません (ラップ/アンラップ)";
    }
    @Override
    protected String cannotRemoveContentFromSelfContainedServer$str() {
        return "WFLYSRV0250: 自己充足的なサーバーでデプロイメントからコンテンツを削除できません";
    }
    @Override
    protected String argSecMgr$str() {
        return "セキュリティーマネージャーがインストールされた状態でサーバーを実行します。";
    }
    @Override
    protected String deploymentPhaseFailed$str() {
        return "WFLYSRV0153: %2$s のフェーズ %1$s の処理に失敗しました。";
    }
    @Override
    protected String cannotStartServer$str() {
        return "WFLYSRV0141: サーバーを起動できません";
    }
    @Override
    protected String cannotAddContentToUnexplodedDeployment$str() {
        return "WFLYSRV0248: 展開されていないデプロイメントにコンテンツを追加できません";
    }
    @Override
    protected String problemOpeningStreamFromDeploymentURL$str() {
        return "WFLYSRV0096: URL '%1$s' からの入力ストリームの取得エラー";
    }
    @Override
    protected String failedToReadVirtualFile$str() {
        return "WFLYSRV0100: '%1$s' の読み取りに失敗しました。";
    }
    @Override
    protected String duplicateServerNameConfiguration$str() {
        return "WFLYSRV0048: システムプロパティー %1$s ('%2$s') と xml 設定 ('%3$s') の両方よりサーバー名の設定が提供されました。xml 設定の値が使用されます。";
    }
    @Override
    protected String cannotAddURLStreamHandlerFactory$str() {
        return "WFLYSRV0024: URLStreamHandlerFactory プロバイダーとしてモジュール '%1$s' を追加できません。";
    }
    @Override
    protected String noModuleIdentifier$str() {
        return "WFLYSRV0103: デプロイメント '%1$s' にモジュール識別子が関連付けられていません。";
    }
    @Override
    protected String mechAuthenticationNotComplete$str() {
        return "WFLYSRV0296: 認証メカニズムの認証が完了していません";
    }
    @Override
    protected String mechMalformedFields$str() {
        return "WFLYSRV0305: 1 つ以上の不正なフィールドが原因で認証メカニズムの認証が失敗しました。";
    }
    @Override
    protected String serviceModuleLoaderAlreadyStarted$str() {
        return "WFLYSRV0097: ServiceModuleLoader はすでに開始されています。";
    }
    @Override
    protected String mechServerSideAuthenticationFailed$str() {
        return "WFLYSRV0299: 認証メカニズムサーバー側での認証が失敗しました";
    }
    @Override
    protected String cannotReplaceDeployment$str() {
        return "WFLYSRV0086: パラメーター %2$s と %3$s に同じ値がある %1$s を使用できません。%4$s を使用して同じコンテンツを再度デプロイするか、%5$s を使用してコンテンツを同じ名前の新しいバージョンに置き換えてください。";
    }
    @Override
    protected String vaultModuleWithNoCode$str() {
        return "WFLYSRV0209: 'module' を指定する場合は、'code' も指定する必要があります。";
    }
    @Override
    protected String replaceRolledBack$str() {
        return "WFLYSRV0014: デプロイメント \"%1$s\" のデプロイメント \"%2$s\" への置き換えがロールバックされ、次の失敗メッセージが出力されました: %3$s";
    }
    @Override
    protected String controllerTempDirectoryIsNotADirectory$str() {
        return "WFLYSRV0131: コントローラーの一時ディレクトリーは存在しません: %1$s";
    }
    @Override
    protected String mechInvalidMessageReceived$str() {
        return "WFLYSRV0303: 無効な認証メカニズムネゴシエーションメッセージを受信しました";
    }
    @Override
    protected String mechMessageAfterComplete$str() {
        return "WFLYSRV0297: 認証メカニズムエクスチェンジが認証完了後にメッセージを受信しました";
    }
    @Override
    protected String startedCleanMessage$str() {
        return "%1$s は %2$d ミリ秒で開始しました - サービス %4$d 個のうち %3$d 個を開始しました (%5$d のサービスはレイジー、パッシブ、またはオンデマンドです) %6$s";
    }
}
