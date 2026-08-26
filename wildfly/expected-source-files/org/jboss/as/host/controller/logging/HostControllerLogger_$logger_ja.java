package org.jboss.as.host.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:30+0200")
public class HostControllerLogger_$logger_ja extends HostControllerLogger_$logger implements HostControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public HostControllerLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotConnect$str() {
        return "WFLYHC0001: リモートのドメインコントローラー %1$s に接続できませんでした";
    }
    @Override
    protected String cannotConnectToMaster$str() {
        return "WFLYHC0002: ドメインコントローラーに接続できませんでした。発生したエラー: %1$s";
    }
    @Override
    protected String creatingHttpManagementService$str() {
        return "WFLYHC0003: ネットワークインターフェイス (%1$s)、port (%2$d)、securePort (%3$d) を使い、http 管理サービスを作成しています。";
    }
    @Override
    protected String existingServerWithState$str() {
        return "WFLYHC0005: 既存のサーバー [%1$s] ステータス: %2$s";
    }
    @Override
    protected String failedToStartServer$str() {
        return "WFLYHC0008: サーバー (%1$s) の起動に失敗しました。";
    }
    @Override
    protected String failedToStopServer$str() {
        return "WFLYHC0009: サーバー (%1$s) の停止に失敗しました。";
    }
    @Override
    protected String ignoringPermGen$str() {
        return "WFLYHC0011: jvm '%1$s' type に対する <permgen> を無視します。jvm: %2$s";
    }
    @Override
    protected String noDomainControllerConfigurationProvided$str() {
        return "WFLYHC0012: <domain-controller> 設定が提示されていません。現在の稼働モード ('%1$s') ではドメインコントローラーのホストへのアクセス権限が必要です。起動は中止されます。ドメインコントローラーへ接続せずに起動する必要がある場合は、%2$s コマンドラインの引数を使用して %3$s モードで起動し、管理ツールを使用して設定してください。";
    }
    @Override
    protected String httpManagementInterfaceIsUnsecured$str() {
        return "WFLYHC0013: http 管理サービスに対してセキュリティーレルムが定義されていません。アクセス制限はすべてなくなります。";
    }
    @Override
    protected String noServerAvailable$str() {
        return "WFLYHC0014: %1$s というサーバーはありません。";
    }
    @Override
    protected String lostRemoteDomainConnection$str() {
        return "WFLYHC0015: リモートホストコントローラーへの接続が切断されました。再接続の試行中です。";
    }
    @Override
    protected String optionAlreadySet$str() {
        return "WFLYHC0016: '%3$s' が設定されていたため、jvm '%2$s' の <option value=\"%1$s\" は無視されます。";
    }
    @Override
    protected String reconnectingServer$str() {
        return "WFLYHC0018: サーバー %1$s を再接続中";
    }
    @Override
    protected String registeredRemoteSlaveHost$str() {
        return "WFLYHC0019: 登録済みリモートセカンダリーホスト \"%1$s\"、%2$s";
    }
    @Override
    protected String registeringServer$str() {
        return "WFLYHC0020: サーバー %1$s を登録しています。";
    }
    @Override
    protected String serverConnected$str() {
        return "WFLYHC0021: 接続 [%2$s] を使用してサーバー [%1$s] が接続されました";
    }
    @Override
    protected String startingServer$str() {
        return "WFLYHC0023: サーバー %1$s を開始しています。";
    }
    @Override
    protected String stoppingServer$str() {
        return "WFLYHC0024: サーバー %1$s を停止しています。";
    }
    @Override
    protected String unregisteredRemoteSlaveHost$str() {
        return "WFLYHC0026: 未登録のリモートセカンダリーホスト \"%1$s\"";
    }
    @Override
    protected String unregisteringServer$str() {
        return "WFLYHC0027: サーバー %1$s の登録を解除しています。";
    }
    @Override
    protected String unregisteredAtRemoteHostController$str() {
        return "WFLYHC0029: ドメインコントローラーで登録を解除しました。";
    }
    @Override
    protected String lostConnectionToRemoteHost$str() {
        return "WFLYHC0030: リモートホスト \"%1$s\" への接続が予期せず切断されました。";
    }
    @Override
    protected String invalidRemoteBackupPersisterState$str() {
        return "WFLYHC0031: --backup を使用してドメインモデルをロードできません";
    }
    @Override
    protected String caughtExceptionDuringBoot$str() {
        return "WFLYHC0033: 起動時に例外を検出しました。";
    }
    @Override
    protected String unsuccessfulBoot$str() {
        return "WFLYHC0034: ホストコントローラーは起動に失敗しリカバリーできません。終了します。詳細については以前のメッセージを参照してください。%1$s";
    }
    @Override
    protected String reportAdminOnlyDomainXmlFailure$str() {
        return "WFLYHC0035: ドメイン全体の設定のインストールに失敗しました。このホストコントローラーの作動モードはADMIN_ONLY 起動であるため、そのまま起動することができました。ADMIN_ONLY モードでない場合は、このプロセスは致命的な起動エラーとして終了されたはずです。";
    }
    @Override
    protected String masterHostControllerChanged$str() {
        return "WFLYHC0037: プライマリーホストコントローラーが再起動されました。このセカンダリーホストコントローラーを新しいプライマリーで再登録しています。";
    }
    @Override
    protected String masterHostControllerUnreachable$str() {
        return "WFLYHC0038: [%1$d] ミリ秒前からドメインホストコントローラーへ接続できません。再接続しています。";
    }
    @Override
    protected String slaveHostControllerChanged$str() {
        return "WFLYHC0039: セカンダリーホストコントローラー \"%1$s\" が再起動したか、再接続しようとしています。このセカンダリーへの現接続の登録を解除しています。";
    }
    @Override
    protected String slaveHostControllerUnreachable$str() {
        return "WFLYHC0040: [%2$d] ミリ秒前からセカンダリーホストコントローラー \"%1$s\" へ接続できません。登録を解除しています。";
    }
    @Override
    protected String argumentExpected$str() {
        return "WFLYHC0041: オプション %1$s には引数が必要です。 %2$s";
    }
    @Override
    protected String attemptingToSet$str() {
        return "WFLYHC0042: '%2$s' がすでに設定されているにも関わらず、'%1$s' を設定しようとしています。";
    }
    @Override
    protected String authenticationFailureUnableToConnect$str() {
        return "WFLYHC0043: 認証に失敗したため接続できません。";
    }
    @Override
    protected String cannotAccessRemoteFileRepository$str() {
        return "WFLYHC0044: ドメインコントローラーからリモートのファイルレポジトリーにアクセスできません。";
    }
    @Override
    protected String cannotCreateLocalDirectory$str() {
        return "WFLYHC0045: ローカルディレクトリーを作成できません: %1$s";
    }
    @Override
    protected String cannotObtainValidDefaultAddress$str() {
        return "WFLYHC0046: %1$s あるいは InetAddress.getLocalHost() を使ってProcessController と通信するための有効なデフォルトアドレスを取得できません。システムのネットワーク設定を確認するか、%2$s コマンドラインオプションを使い有効なアドレスを設定してください。";
    }
    @Override
    protected String cannotRestartServer$str() {
        return "WFLYHC0047: サーバー %1$s は現在起動していないため、再起動できません。現在の状態は %2$s です。";
    }
    @Override
    protected String cannotStartServersInvalidMode$str() {
        return "WFLYHC0048: ホストコントローラーの作動モードが %1$s の場合、サーバーを開始できません。";
    }
    @Override
    protected String closeShouldBeManagedByService$str() {
        return "WFLYHC0049: 終了についてはサービスが管理するものとします。";
    }
    @Override
    protected String configurationPersisterAlreadyInitialized$str() {
        return "WFLYHC0050: ドメインモデルの Configuration Persister はすでに初期化されています。";
    }
    @Override
    protected String connectionToMasterInterrupted$str() {
        return "WFLYHC0051: ドメインコントローラーへの接続試行中に中断されました。";
    }
    @Override
    protected String connectionToMasterTimeout$str() {
        return "WFLYHC0052: %2$s ミリ秒の間に %1$d 回試行しましたが、ドメインコントローラーに接続できませんでした。";
    }
    @Override
    protected String couldNotGetServerInventory$str() {
        return "WFLYHC0053: %1$d %2$s でサーバーインベントリーを取得できませんでした。";
    }
    @Override
    protected String didNotReadEntireFile$str() {
        return "WFLYHC0054: ファイル全体を読み取りしませんでした。%1$d がありません。";
    }
    @Override
    protected String errorClosingDownHost$str() {
        return "WFLYHC0055: ホストの接続解除中のエラー";
    }
    @Override
    protected String failedProfileOperationsRetrieval$str() {
        return "WFLYHC0056: ドメインコントローラーからプロファイル操作のリトリーブに失敗しました。";
    }
    @Override
    protected String failedToGetFileFromRemoteRepository$str() {
        return "WFLYHC0057: リモートレポジトリからファイルを取得できませんでした。";
    }
    @Override
    protected String failedToGetServerStatus$str() {
        return "WFLYHC0058: サーバーのステータスを取得できませんでした。";
    }
    @Override
    protected String failedToReadAuthenticationKey$str() {
        return "WFLYHC0059: 認証キーの読み込みに失敗しました: %1$s";
    }
    @Override
    protected String insufficientInformationToGenerateHash$str() {
        return "WFLYHC0061: ハッシュを生成するには情報が不足しています。";
    }
    @Override
    protected String invalidOption$str() {
        return "WFLYHC0062: 無効なオプション '%1$s'。%2$s";
    }
    @Override
    protected String invalidRootId$str() {
        return "WFLYHC0063: 無効な root id [%1$d]";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYHC0064: %1$s の値は %2$s ではありません -- %3$s。%4$s";
    }
    @Override
    protected String invocationNotAllowedAfterBoot$str() {
        return "WFLYHC0065: HostController 起動の後に %1$s の呼び出しはできません。";
    }
    @Override
    protected String malformedUrl$str() {
        return "WFLYHC0066: オプション %1$s に不正の URL が提供されました。%2$s";
    }
    @Override
    protected String mustInvokeBeforeCheckingSlaveStatus$str() {
        return "WFLYHC0067: セカンダリーホストコントローラーのステータスをチェックする前に %1$s を呼び出す必要があります。";
    }
    @Override
    protected String mustInvokeBeforePersisting$str() {
        return "WFLYHC0068: ドメインモデルを永続化する前に %1$s を呼び出す必要があります。";
    }
    @Override
    protected String noServerInventory$str() {
        return "WFLYHC0071: サーバーインベントリーがありません。";
    }
    @Override
    protected String serverNameAlreadyRegistered$str() {
        return "WFLYHC0077: '%1$s' という名前の登録済みサーバーが存在します。";
    }
    @Override
    protected String serverStillRunning$str() {
        return "WFLYHC0078: サーバー (%1$s) は稼働中です。";
    }
    @Override
    protected String unableToGenerateHash$str() {
        return "WFLYHC0079: ハッシュを生成できません。";
    }
    @Override
    protected String unableToLoadProperties$str() {
        return "WFLYHC0080: URL %1$s からプロパティーをロードできません。%2$s";
    }
    @Override
    protected String undefinedSocketBinding$str() {
        return "WFLYHC0081: サーバー %1$s に対しソケットバインディンググループが定義されていません。";
    }
    @Override
    protected String undefinedSocketBindingGroup$str() {
        return "WFLYHC0082: 含まれているソケットバインディンググループ %1$s は定義されていません。";
    }
    @Override
    protected String unknown$str() {
        return "WFLYHC0084: 不明な %1$s %2$s";
    }
    @Override
    protected String unknownHostValue$str() {
        return "WFLYHC0085: %1$s の値は不明なホストです -- %2$s。%3$s";
    }
    @Override
    protected String hostAlreadyShutdown$str() {
        return "WFLYHC0087: Host-Controller はすでに終了しています。";
    }
    @Override
    protected String hostControllerSystemPropertyUpdateNotSupported$str() {
        return "WFLYHC0090: HostControllerEnvironment はシステムプロパティーの更新に対応していません。";
    }
    @Override
    protected String cannotIgnoreTypeHost$str() {
        return "WFLYHC0091: 型 %1$s のリソースは無視できません。";
    }
    @Override
    protected String duplicateIgnoredResourceType$str() {
        return "WFLYHC0092: 'type' 属性が '%2$s' である '%1$s' 要素はすでに見つかりました";
    }
    @Override
    protected String cannotAccessJvmInputArgument$str() {
        return "WFLYHC0093: JVM 入力引数にアクセスできないため、システムプロパティーはこのホストコントローラーに直接渡しました。システムプロパティーはサーバープロセスまで渡されません。問題の原因: %1$s";
    }
    @Override
    protected String missingHomeDirConfiguration$str() {
        return "WFLYHC0094: 設定値が抜けています: %1$s";
    }
    @Override
    protected String homeDirectoryDoesNotExist$str() {
        return "WFLYHC0095: ホームディレクトリーは存在しません: %1$s";
    }
    @Override
    protected String domainBaseDirectoryDoesNotExist$str() {
        return "WFLYHC0097: ドメインのベースディレクトリーは存在しません: %1$s";
    }
    @Override
    protected String domainBaseDirectoryIsNotADirectory$str() {
        return "WFLYHC0098: ドメインのベースディレクトリーはディレクトリーではありません: %1$s";
    }
    @Override
    protected String configDirectoryDoesNotExist$str() {
        return "WFLYHC0099: 設定ディレクトリーは存在しません: %1$s";
    }
    @Override
    protected String domainDataDirectoryIsNotDirectory$str() {
        return "WFLYHC0100: ドメインのデータディレクトリーはディレクトリーではありません: %1$s";
    }
    @Override
    protected String couldNotCreateDomainDataDirectory$str() {
        return "WFLYHC0101: ドメインのデータディレクトリーを作成できませんでした: %1$s";
    }
    @Override
    protected String domainContentDirectoryIsNotDirectory$str() {
        return "WFLYHC0102: ドメインのコンテンツディレクトリーはディレクトリーではありません: %1$s";
    }
    @Override
    protected String couldNotCreateDomainContentDirectory$str() {
        return "WFLYHC0103: ドメインのコンテンツディレクトリーを作成できませんでした: %1$s";
    }
    @Override
    protected String logDirectoryIsNotADirectory$str() {
        return "WFLYHC0104: ログディレクトリーはディレクトリーではありません: %1$s";
    }
    @Override
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYHC0105: ログディレクトリーを作成できませんでした: %1$s";
    }
    @Override
    protected String serversDirectoryIsNotADirectory$str() {
        return "WFLYHC0106: サーバーディレクトリーはディレクトリーではありません: %1$s";
    }
    @Override
    protected String couldNotCreateServersDirectory$str() {
        return "WFLYHC0107: サーバーディレクトリーを作成できませんでした: %1$s";
    }
    @Override
    protected String domainTempDirectoryIsNotADirectory$str() {
        return "WFLYHC0108: ドメインの一時ディレクトリーは存在しません: %1$s";
    }
    @Override
    protected String couldNotCreateDomainTempDirectory$str() {
        return "WFLYHC0109: ドメインの一時ディレクトリーを作成できませんでした: %1$s";
    }
    @Override
    protected String sslFailureUnableToConnect$str() {
        return "WFLYHC0110: SSL に問題があるため接続できません。";
    }
    @Override
    protected String jvmOptionAlreadyExists$str() {
        return "WFLYHC0111: オプション '%1$s' はすでに存在します。";
    }
    @Override
    protected String unsupportedManagementVersionForHost$str() {
        return "WFLYHC0113: ホストコントローラーの管理バージョン %1$s.%2$s は古いバージョンです。 %3$s.%4$s 以降のバージョンのみサポートされます。";
    }
    @Override
    protected String failedToAddExtensions$str() {
        return "WFLYHC0114: ドメインで利用する拡張の追加に失敗しました。問題の詳細: %1$s";
    }
    @Override
    protected String argumentHasNoValue$str() {
        return "WFLYHC0115: 引数 %1$s に値がありません。%2$s";
    }
    @Override
    protected String usageNote$str() {
        return "有効なコマンドラインの引数や構文については %1$s --help を使用してください。";
    }
    @Override
    protected String cannotAccessS3File$str() {
        return "WFLYHC0116: S3 ファイルへアクセスできません: %1$s";
    }
    @Override
    protected String failedMarshallingDomainControllerData$str() {
        return "WFLYHC0117: S3 ファイルからドメインコントローラーデータを取得できませんでした";
    }
    @Override
    protected String cannotWriteToS3File$str() {
        return "WFLYHC0118: S3 ファイルへドメインコントローラーデータを書き込みできません: %1$s";
    }
    @Override
    protected String cannotAccessS3Bucket$str() {
        return "WFLYHC0119: S3 バケット '%1$s' へアクセスできません: %2$s";
    }
    @Override
    protected String discoveryOptionsFailureUnableToConnect$str() {
        return "WFLYHC0120: ドメインコントローラー検出オプションをすべて試行しましたが、接続できませんでした";
    }
    @Override
    protected String preSignedUrlsMustHaveSamePath$str() {
        return "WFLYHC0121: pre_signed_put_url と pre_signed_delete_url のパスが同じでなければなりません";
    }
    @Override
    protected String preSignedUrlsMustBeSetOrUnset$str() {
        return "WFLYHC0122: pre_signed_put_url と pre_signed_delete_url の両方が設定または未設定でなければなりません";
    }
    @Override
    protected String preSignedUrlMustPointToFile$str() {
        return "WFLYHC0123: 事前に署名された url %1$s がバケット内のファイルを示さなければなりません";
    }
    @Override
    protected String invalidPreSignedUrl$str() {
        return "WFLYHC0124: 事前に署名された url %1$s は有効な url ではありません";
    }
    @Override
    protected String invalidPreSignedUrlLength$str() {
        return "WFLYHC0125: 事前に署名された url %1$s にはバケット下にサブディレクトリのみがある場合があります";
    }
    @Override
    protected String creatingBucketWithUnsupportedCallingFormat$str() {
        return "WFLYHC0126: 未サポートの呼び出し形式で、場所が制約されたバケットを作成しています";
    }
    @Override
    protected String invalidS3Location$str() {
        return "WFLYHC0127: 無効な場所: %1$s";
    }
    @Override
    protected String invalidS3Bucket$str() {
        return "WFLYHC0128: 無効なバケット名: %1$s";
    }
    @Override
    protected String bucketAuthenticationFailure$str() {
        return "WFLYHC0129: バケット '%1$s' へアクセスできませんでした (rsp=%2$d (%3$s))。バケットの所有者が別ユーザーである可能性があります。その場合、認証に失敗します。";
    }
    @Override
    protected String unexpectedResponse$str() {
        return "WFLYHC0130: 予期せぬ応答: %1$s";
    }
    @Override
    protected String httpRedirectSupportRequired$str() {
        return "WFLYHC0131: HTTP リダイレクトのサポートが必要";
    }
    @Override
    protected String errorParsingBucketListings$str() {
        return "WFLYHC0132: バケットリストの解析中に予期せぬエラー";
    }
    @Override
    protected String cannotInitializeSaxDriver$str() {
        return "WFLYHC0133: XMLReader の SAX ドライバーを初期化できませんでした";
    }
    @Override
    protected String cannotInstantiateDiscoveryOptionClass$str() {
        return "WFLYHC0134: 検出オプションクラス '%1$s' をインスタンス化できません: %2$s";
    }
    @Override
    protected String cannotWriteDomainControllerData$str() {
        return "WFLYHC0137: ドメインコントローラーデータを S3 ファイルへ書き込みできませんでした。エラーは %1$s でした。";
    }
    @Override
    protected String cannotRemoveS3File$str() {
        return "WFLYHC0138: S3 ファイルを削除できませんでした。エラーは %1$s でした。";
    }
    @Override
    protected String cannotExecuteTransactionalOperationFromSlave$str() {
        return "WFLYHC0140: セカンダリーホストコントローラーからトランザクション操作 '%1$s' を実行できません";
    }
    @Override
    protected String failedToApplyDomainConfig0$str() {
        return "WFLYHC0142: ドメインコントローラーからドメイン全体の設定を適用できませんでした";
    }
    @Override
    protected String failedToApplyDomainConfig2$str() {
        return "WFLYHC0143: ドメインコントローラーからドメイン全体の設定を適用できませんでした。操作の結果: %1$s。失敗の詳細 %2$s。";
    }
    @Override
    protected String fetchConfigFromDomainMasterFailed$str() {
        return "WFLYHC0144: ドメイン全体の設定ポリシーのローカルコピーへアクセスできないモード '%1$s' を実行して起動したため、ホストが起動できません。'%2$s' 属性は '%3$s' に設定され、ドメイン全体の設定ポリシーをドメインコントローラーホストより取得できませんでした。起動を停止します。ドメインコントローラー接続へ接続せずに起動する必要がある場合は、'%4$s' コマンドライン引数を使用して起動してください。";
    }
    @Override
    protected String noAccessControlConfigurationAvailable$str() {
        return "WFLYHC0145: ドメイン全体の設定ポリシーのローカルコピーへアクセスできないモード '%1$s' を実行して起動したため、ホストが起動できません。また、'%2$s' 属性は '%3$s' に設定されています。起動を停止します。モード '%5$s' を実行して起動するには、コマンドライン引数 '%4$s\" を使用してください。";
    }
    @Override
    protected String failedDiscoveringMaster$str() {
        return "WFLYHC0146: 検出オプション %1$s を使用してドメインコントローラーを検出できませんでした。エラー: %2$s";
    }
    @Override
    protected String noDiscoveryOptionsLeft$str() {
        return "WFLYHC0147: ドメインコントローラー検出オプションはこれ以上ありません。";
    }
    @Override
    protected String connectedToMaster$str() {
        return "WFLYHC0148: %1$s でドメインコントローラーに接続しました";
    }
    @Override
    protected String usingCachedDC$str() {
        return "WFLYHC0149: オプション %1$s が設定されています; %2$s からドメイン全体の設定を取得中";
    }
    @Override
    protected String reconnectingToMaster$str() {
        return "WFLYHC0150: ドメインコントローラーに再接続しようとしています。";
    }
    @Override
    protected String noDomainControllerConfigurationProvidedForAdminOnly$str() {
        return "WFLYHC0151: ドメインコントローラー検出設定が提供されず、'%1$s' 属性が '%2$s' に設定されました。起動は中断されます。ドメインコントローラーに接続せずに起動する必要がある場合は、%3$s コマンドライン引数を使用して %4$s モードで起動し、管理ツールを使用して設定を行います。";
    }
    @Override
    protected String serverLaunchCommandPrefix$str() {
        return "WFLYHC0152: サーバー %1$s は JVM 起動コマンド接頭辞 '%2$s' で起動されます";
    }
    @Override
    protected String channelClosed$str() {
        return "WFLYHC0153: チャネルは閉じています";
    }
    @Override
    protected String couldNotCreateDomainAutoStartDirectory$str() {
        return "WFLYHC0157: ドメイン自動起動ディレクトリーを作成できませんでした: %1$s";
    }
    @Override
    protected String couldNotPersistAutoStartServerStatus$str() {
        return "WFLYHC0158: サーバーの自動起動でエラーのステータスが継続しています";
    }
    @Override
    protected String invalidDiscoveryType$str() {
        return "WFLYHC0159: 無効なディスカバリー型 %1$s";
    }
    @Override
    protected String couldNotObtainDomainUuid$str() {
        return "WFLYHC0160: ファイルでドメイン UUID を読み取りまたは作成できませんでした: %1$s";
    }
    @Override
    protected String bindingNameNotUnique$str() {
        return "WFLYHC0162: ソケットバインディンググループ '%2$s' のバインディング名 '%1$s'が一意ではありません。名前は socket-binding、local-destination-outbound-socket-binding、および remote-destination-outbound-socket-binding 全体で一意である必要があります。";
    }
    @Override
    protected String profileInvolvedInACycle$str() {
        return "WFLYHC0163: プロファイル '%1$s' はサイクルに関与しています。";
    }
    @Override
    protected String profileAttemptingToOverrideSubsystem$str() {
        return "WFLYHC0164: プロファイル '%1$s' は先祖プロファイル '%3$s' にも定義されているサブシステム '%2$s' を定義します。サブシステムのオーバーライドはサポートされていません。";
    }
    @Override
    protected String socketBindingGroupInvolvedInACycle$str() {
        return "WFLYHC0165: ソケットバインディンググループ '%1$s' はサイクルに関与します";
    }
    @Override
    protected String socketBindingGroupAttemptingToOverrideSocketBinding$str() {
        return "WFLYHC0166: ソケットバインディンググループ '%1$s' は先祖ソケットバインディンググループ '%3$s' にも定義されているソケットバインディング '%2$s' を定義します。ソケットバインディングのオーバーライドはサポートされていません。";
    }
    @Override
    protected String profileIncludesSameSubsystem$str() {
        return "WFLYHC0167: プロファイル '%1$s' にはプロファイル '%2$s' およびプロファイル '%3$s' が含まれています。両方のプロファイルはサポートされないサブシステム '%4$s' を定義します。";
    }
    @Override
    protected String socketBindingGroupIncludesSameSocketBinding$str() {
        return "WFLYHC0168: ソケットバインディンググループ '%1$s' にはソケットバインディンググループ '%2$s' およびソケットバインディンググループ '%3$s' が含まれています。両方のソケットバインディンググループはサポートされないソケットバインディング '%4$s' を定義します。";
    }
    @Override
    protected String embeddedHostControllerRestartMustProvideAdminOnlyTrue$str() {
        return "WFLYHC0169: 埋め込みのホストコントローラーでは稼働中モードでのリロードはサポートされていません。 admin-only=true を指定する必要があります。";
    }
    @Override
    protected String hostRegistrationCannotReleaseSharedLock$str() {
        return "WFLYHC0170: operationID のホスト登録後に共有ロックを解除するときにエラーが発生しました: %1$s";
    }
    @Override
    protected String suspendListenerFailed$str() {
        return "WFLYHC0171: サーバーの一時停止リスナーから応答の取得に失敗しました: %1$s";
    }
    @Override
    protected String suspendExecutionFailed$str() {
        return "WFLYHC0172: サーバーの一時停止操作の実行に失敗しました: %1$s";
    }
    @Override
    protected String cannotBothHaveFalseUseCurrentHostConfigAndHostConfig$str() {
        return "WFLYHC0173: host-config を指定する場合に use-current-host-config=false を使用することはできません";
    }
    @Override
    protected String cannotBothHaveFalseUseCurrentDomainConfigAndDomainConfig$str() {
        return "WFLYHC0174: host-config を指定する場合に use-current-domain-config=false を使用することはできません";
    }
    @Override
    protected String domainConfigForReloadNotFound$str() {
        return "WFLYHC0175: リロードに対して指定された domain-config '%1$s' が見つかりませんでした";
    }
    @Override
    protected String nativeManagementInterfaceIsUnsecured$str() {
        return "WFLYHC0177: ネーティブ管理サービスに対してセキュリティーレルムが設定されていません。すべてのアクセスは制限されません。";
    }
    @Override
    protected String aborting$str() {
        return "WFLYHC0178: 終了コード %1$d で強制終了します";
    }
    @Override
    protected String shuttingDownInResponseToProcessControllerSignal$str() {
        return "WFLYHC0179: ProcessController がシャットダウンするよう通知しました; シャットダウン中";
    }
    @Override
    protected String shuttingDownInResponseToManagementRequest$str() {
        return "WFLYHC0180: 管理操作 '%1$s' に応じてシャットダウンしています";
    }
    @Override
    protected String shutdownHookInvoked$str() {
        return "WFLYHC0181: OS シグナルを介してホストコントローラーのシャットダウンが要求されました";
    }
    @Override
    protected String timedOutAwaitingSuspendResponse$str() {
        return "WFLYHC0182: サーバーのサーバー一時停止応答を %1$d ミリ秒待った後にタイムアウトしました: %2$s";
    }
    @Override
    protected String timedOutAwaitingSuspendResponseMsg$str() {
        return "WFLYHC0183: サーバーのサーバー一時停止応答を %1$d ミリ秒待った後にタイムアウトしました: %2$s";
    }
    @Override
    protected String interruptedAwaitingSuspendResponse$str() {
        return "WFLYHC0184: サーバー一時停止応答の待機中に %1$s が中断されました";
    }
    @Override
    protected String interruptedAwaitingSuspendResponseMsg$str() {
        return "WFLYHC0185: サーバー一時停止応答の待機中に %1$s が中断されました";
    }
    @Override
    protected String suspendExecutionFailedMsg$str() {
        return "WFLYHC0186: サーバーの一時停止操作の実行に失敗しました: %1$s";
    }
    @Override
    protected String suspendListenerFailedMsg$str() {
        return "WFLYHC0187: サーバーの一時停止リスナーから応答の取得に失敗しました: %1$s";
    }
    @Override
    protected String timedOutAwaitingResumeResponse$str() {
        return "WFLYHC0188: サーバーのサーバー再開応答を %1$d ミリ秒待った後にタイムアウトしました: %2$s";
    }
    @Override
    protected String timedOutAwaitingResumeResponseMsg$str() {
        return "WFLYHC0189: サーバーのサーバー再開応答を %1$d ミリ秒待った後にタイムアウトしました: %2$s";
    }
    @Override
    protected String interruptedAwaitingResumeResponse$str() {
        return "WFLYHC0190: サーバー再開応答の待機中に %1$s が中断されました";
    }
    @Override
    protected String interruptedAwaitingResumeResponseMsg$str() {
        return "WFLYHC0191: サーバー再開応答の待機中に %1$s が中断されました";
    }
    @Override
    protected String resumeExecutionFailedMsg$str() {
        return "WFLYHC0192: サーバーの再開操作の実行に失敗しました: %1$s";
    }
    @Override
    protected String resumeListenerFailedMsg$str() {
        return "WFLYHC0193: サーバーの再開リスナーから応答の取得に失敗しました: %1$s";
    }
    @Override
    protected String resumeExecutionFailed$str() {
        return "WFLYHC0194: サーバーの再開操作の実行に失敗しました: %1$s";
    }
    @Override
    protected String resumeListenerFailed$str() {
        return "WFLYHC0195: サーバーの再開リスナーから応答の取得に失敗しました: %1$s";
    }
    @Override
    protected String cannotRenameCachedDomainXmlOnBoot$str() {
        return "WFLYHC0196: ファイル %1$s を %2$s に移動できません。ドメイン設定の変更を永続化できません: %3$s";
    }
    @Override
    protected String attributeRequiresSSLContext$str() {
        return "WFLYHC0197: 属性 %1$s が定義されている場合は、ssl-context も定義する必要があります";
    }
    @Override
    protected String managedServerUnstable1$str() {
        return "WFLYHC0198: サーバー '%1$s' は不安定であり、停止または再起動する必要があります。不安定なサーバーは正常に停止しないことがあるため、サーバープロセスを終了するのに 'kill' 操作が必要になることがあります。";
    }
    @Override
    protected String managedServerUnstable2$str() {
        return "WFLYHC0198: (ホスト '%2$s' が管理する) サーバー '%1$s' は不安定であり、停止または再起動する必要があります。不安定なサーバーは正常に停止しないことがあるため、サーバープロセスを終了するのに 'kill' 操作が必要になることがあります。";
    }
    @Override
    protected String serverSuspected$str() {
        return "WFLYHC0199: (ホスト ''%2$s が管理する) サーバー '%1$s' は設定したタイムアウト期間内に操作リクエストに応答しませんでした。サーバーが不安定になっている可能性があります。";
    }
    @Override
    protected String failedReportingServerInstabilityToMaster$str() {
        return "WFLYHC0200: サーバー '%1$s' の不安定さをドメインコントローラーに報告できませんでした。";
    }
    @Override
    protected String hostDomainSynchronizationError$str() {
        return "WFLYHC0201: ドメインコントローラーモデルによるホストモデルの同期化エラー: %1$s";
    }
    @Override
    protected String domainModelAppliedButReloadIsRequired$str() {
        return "WFLYHC0202: ドメイン設定は正常に適用されましたが、変更を有効にするにはリロードする必要があります。";
    }
    @Override
    protected String domainModelAppliedButRestartIsRequired$str() {
        return "WFLYHC0203: ドメイン設定は正常に適用されましたが、変更を有効にするには再起動する必要があります。";
    }
    @Override
    protected String serverLoggingConfigurationFileNotFound$str() {
        return "WFLYHC0204: サーバーの初期ブートのロギング設定ファイルが見つかりませんでした。サーバー %1$s に対して logging サブシステムがアクティブ化されるまでロギングは設定されません。";
    }
    @Override
    protected String failedToSetLoggingConfiguration$str() {
        return "WFLYHC0205: サーバー %1$s の -Dlogging.configuration プロパティーの設定でエラーが発生しました。設定パス %2$s";
    }
    @Override
    protected String cannotOverwriteDomainXmlWithEmpty$str() {
        return "WFLYHC0206: ファイル %1$s はすでに存在するため、 --remove-existing-domain-config を使用して既存のファイルを上書きする必要があります。";
    }
    @Override
    protected String cannotOverwriteHostXmlWithEmpty$str() {
        return "WFLYHC0207: ファイル %1$s はすでに存在するため、--remove-existing-host-config を使用して既存のファイルを上書きする必要があります。";
    }
    @Override
    protected String cannotAddHostAlreadyRegistered$str() {
        return "WFLYHC0208: ホスト (%1$s) はすでに登録されています。新規のホストを追加する前にこのホストをシャットダウンする必要があります。";
    }
    @Override
    protected String nullHostName$str() {
        return "WFLYHC0209: ホスト名に null を使用できません。";
    }
    @Override
    protected String cannotAddSlaveHostAfterBoot$str() {
        return "WFLYHC0210: セカンダリーホストコントローラーは add() を使用して追加できないことがあります。このパラメーターを除外してホストを追加し、write-attribute を使用してリモートドメインコントローラーを設定してください。";
    }
    @Override
    protected String bootConfigValidationFailed$str() {
        return "WFLYHC0211: ブート設定検証に失敗しました";
    }
    @Override
    protected String fetchOfMissingConfigurationFailed$str() {
        return "WFLYHC0212: 欠落している設定をドメインコントローラーから取得できませんでした。説明はありません。取得操作の結果は %1$s でした。";
    }
    @Override
    protected String invalidJavaHome$str() {
        return "WFLYHC0213: Java home '%1$s' は存在しません。";
    }
    @Override
    protected String invalidJavaHomeBin$str() {
        return "WFLYHC0214: Java home の bin '%1$s' は存在しません。ホームディレクトリーは %2$s と判断されました。";
    }
    @Override
    protected String cannotFindJavaExe$str() {
        return "WFLYHC0215: %1$s には java の実行可能ファイルがありませんでした。";
    }
    @Override
    protected String moduleOptionNotAllowed$str() {
        return "WFLYHC0216: モジュールオプション %1$s は許可されていません。";
    }
    @Override
    protected String securityRealmReferencesUnsupported$str() {
        return "WFLYHC0217: セキュリティーレルムはサポート対象外になりました。設定から該当する参照を移行してください。";
    }
    @Override
    protected String noServerInstallationPrepared$str() {
        return "WFLYHC0218: %1$s インストールは準備されていません。";
    }
    @Override
    protected String identityNotAuthorizedAsServer$str() {
        return "WFLYHC0219: ドメイン・サーバーとして接続を試みた '%1$s' の認可に失敗しました。";
    }
    @Override
    protected String failedToSyncServerStatus$str() {
        return "WFLYHC0220: ホストコントローラーの登録時にサーバーステータスの同期に失敗しました。サーバー %2$s の操作 %1$s を管理するためのハンドラーが登録されていません。";
    }
    @Override
    protected String incompatibleStability$str() {
        return "WFLYHC0221: ドメインコントローラーの %1$s 安定性レベルが接続元ホストの %2$s 安定性レベルと一致しません";
    }
    @Override
    protected String unsupportedStability$str() {
        return "WFLYHC0222: %1$s 安定性レベルは %2$s ではサポートされていません";
    }
    @Override
    protected String mixedDomainUnsupportedStability$str() {
        return "WFLYHC0223: %1$s 安定性レベルは、ドメインコントローラーと同じ管理メジャーバージョンおよびマイナーバージョンを持つホストコントローラーでのみサポートされています。ドメインコントローラーのバージョンは %2$d.%3$d です。リモートホストコントローラーのバージョンは %4$d.%5$d です";
    }
    @Override
    protected String configFilesInUse$str() {
        return "- 使用中のホストコントローラー設定ファイル: %1$s、%2$s";
    }
    @Override
    protected String configFileInUse$str() {
        return "- 使用中のホストコントローラー設定ファイル: %1$s";
    }
    @Override
    protected String stabilityInUse$str() {
        return "- 最低限の機能安定性レベル: %1$s";
    }
}
