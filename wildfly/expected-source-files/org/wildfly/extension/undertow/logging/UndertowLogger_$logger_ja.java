package org.wildfly.extension.undertow.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:29+0200")
public class UndertowLogger_$logger_ja extends UndertowLogger_$logger implements UndertowLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public UndertowLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String couldNotInitJsp$str() {
        return "WFLYUT0001: Jakarta Server ページを初期化できませんでした";
    }
    @Override
    protected String serverStarting$str() {
        return "WFLYUT0003: Undertow %1$s の起動中";
    }
    @Override
    protected String serverStopping$str() {
        return "WFLYUT0004: Undertow %1$s の停止中";
    }
    @Override
    protected String secureListenerNotAvailableForPort$str() {
        return "WFLYUT0005: プロトコルのセキュアなリスナー: '%1$s' が見つかりませんでした。セキュアでないポートを使用します!";
    }
    @Override
    protected String listenerStarted$str() {
        return "WFLYUT0006: Undertow %1$s リスナー %2$s が %3$s:%4$d でリッスンしています";
    }
    @Override
    protected String listenerStopped$str() {
        return "WFLYUT0007: Undertow %1$s リスナー %2$s が停止しました。%3$s:%4$d へバインドされました。";
    }
    @Override
    protected String listenerSuspend$str() {
        return "WFLYUT0008: Undertow %1$s リスナー %2$s を一時停止しています";
    }
    @Override
    protected String cannotLoadDesignatedHandleTypes$str() {
        return "WFLYUT0009: HandlesTypes [%1$s] により指定されたクラスをロードできませんでした。";
    }
    @Override
    protected String couldNotLoadWebSocketEndpoint$str() {
        return "WFLYUT0010: web ソケットエンドポイント %1$s をロードできませんでした。";
    }
    @Override
    protected String couldNotLoadWebSocketConfig$str() {
        return "WFLYUT0011: web ソケットアプリケーション設定 %1$s をロードできませんでした。";
    }
    @Override
    protected String startedServer$str() {
        return "WFLYUT0012: サーバー %1$s を起動しました。";
    }
    @Override
    protected String invalidRedirectURI$str() {
        return "WFLYUT0013: リダイレクト URI を作成できませんでした。";
    }
    @Override
    protected String creatingFileHandler$str() {
        return "WFLYUT0014: オプション [directory-listing: '%2$s', follow-symlink: '%3$s', case-sensitive: '%4$s', safe-symlink-paths: '%5$s'] でパス '%1$s' のファイルハンドラーを作成します";
    }
    @Override
    protected String invalidAbsoluteOrdering$str() {
        return "WFLYUT0016: 絶対的な順序で名前を解決できませんでした: %1$s";
    }
    @Override
    protected String couldNotDeleteTempFile$str() {
        return "WFLYUT0017: サーブレット一時ファイル %1$s を削除できませんでした";
    }
    @Override
    protected String hostStarting$str() {
        return "WFLYUT0018: ホスト %1$s が起動しています";
    }
    @Override
    protected String hostStopping$str() {
        return "WFLYUT0019: ホスト %1$s が停止しています";
    }
    @Override
    protected String clusteringNotSupported$str() {
        return "WFLYUT0020: クラスタリングはサポートされてません。非クラスター化セッションマネージャーに戻ります。";
    }
    @Override
    protected String registerWebapp$str() {
        return "WFLYUT0021: 登録された web コンテキスト: '%1$s' (サーバー '%2$s' 用)";
    }
    @Override
    protected String unregisterWebapp$str() {
        return "WFLYUT0022: 登録解除された web コンテキスト: '%1$s' (サーバー '%2$s' から)";
    }
    @Override
    protected String skippedSCI$str() {
        return "WFLYUT0023: jar の SCI の省略: %1$s.";
    }
    @Override
    protected String failedToPersistSessionAttribute$str() {
        return "WFLYUT0024: セッション %3$s の値 %2$s を持つセッション属性 %1$s の永続化に失敗しました";
    }
    @Override
    protected String failToParseXMLDescriptor3$str() {
        return "WFLYUT0027: [%2$s,%3$s] で XML 記述子 %1$s の解析に失敗しました。";
    }
    @Override
    protected String failToParseXMLDescriptor1$str() {
        return "WFLYUT0028: XML 記述子 %1$s の解析に失敗しました。";
    }
    @Override
    protected String invalidWebServletAnnotation$str() {
        return "WFLYUT0029: @WebServlet はクラスレベル %1$s でのみ利用可能です。";
    }
    @Override
    protected String invalidWebInitParamAnnotation$str() {
        return "WFLYUT0030: %1$s では @WebInitParam は名前と値が必要です。";
    }
    @Override
    protected String invalidWebFilterAnnotation$str() {
        return "WFLYUT0031: @WebFilter はクラスレベル %1$s でのみ利用可能です。";
    }
    @Override
    protected String invalidWebListenerAnnotation$str() {
        return "WFLYUT0032: @WebListener はクラスレベル %1$s でのみ利用可能です。";
    }
    @Override
    protected String invalidRunAsAnnotation$str() {
        return "WFLYUT0033: %1$s では @RunAs はロール名を指定する必要があります。";
    }
    @Override
    protected String invalidDeclareRolesAnnotation$str() {
        return "WFLYUT0034: %1$s では @DeclareRoles はロール名を指定する必要があります。";
    }
    @Override
    protected String invalidMultipartConfigAnnotation$str() {
        return "WFLYUT0035: @MultipartConfig はクラスレベル %1$s でのみ利用可能です。";
    }
    @Override
    protected String invalidServletSecurityAnnotation$str() {
        return "WFLYUT0036: @ServletSecurity はクラスレベル %1$s でのみ利用可能です。";
    }
    @Override
    protected String wrongComponentType$str() {
        return "WFLYUT0037: %1$s に不正なコンポーネント型があり、Web コンポーネントとして利用できません。";
    }
    @Override
    protected String tldFileNotContainedInRoot$str() {
        return "WFLYUT0038: TDL ファイル %1$s は root %2$s には含まれていません。";
    }
    @Override
    protected String failedToResolveModule$str() {
        return "WFLYUT0039: デプロイメント %1$s に対してモジュールを解決できませんでした。";
    }
    @Override
    protected String invalidMultipleOthers$str() {
        return "WFLYUT0040: absolute ordering で others が重複しています。";
    }
    @Override
    protected String invalidRelativeOrdering0$str() {
        return "WFLYUT0041: relative ordering が無効です。";
    }
    @Override
    protected String invalidWebFragment$str() {
        return "WFLYUT0042: JAR で Web フラグメントの処理中に競合が発生しました: %1$s";
    }
    @Override
    protected String invalidRelativeOrdering1$str() {
        return "WFLYUT0043: JAR で Relative ordering を処理中のエラー: %1$s";
    }
    @Override
    protected String invalidRelativeOrderingBeforeAndAfter$str() {
        return "WFLYUT0044: 並び順には JAR の others 前後両方を含みます: %1$s";
    }
    @Override
    protected String invalidRelativeOrderingDuplicateName$str() {
        return "WFLYUT0045: JARで名前が重複して宣言されました: %1$s";
    }
    @Override
    protected String invalidRelativeOrderingUnknownName$str() {
        return "WFLYUT0046: JAR で宣言された不明な Web フラグメント名: %1$s";
    }
    @Override
    protected String invalidRelativeOrderingConflict$str() {
        return "WFLYUT0047: 相対順序 と JAR が競合しています: %1$s";
    }
    @Override
    protected String failToProcessWebInfLib$str() {
        return "WFLYUT0048: WEB-INF/libの処理に失敗しました: %1$s";
    }
    @Override
    protected String errorLoadingSCIFromModule$str() {
        return "WFLYUT0049: モジュールから SCI のロード中のエラー: %1$s";
    }
    @Override
    protected String unableToResolveAnnotationIndex$str() {
        return "WFLYUT0050: デプロイメントユニットのアノテーションインデックスを解決できませんでした: %1$s";
    }
    @Override
    protected String errorProcessingSCI$str() {
        return "WFLYUT0051: jar の SCI 処理中のデプロイメントエラー: %1$s";
    }
    @Override
    protected String unknownMetric$str() {
        return "WFLYUT0054: 不明なメトリック %1$s";
    }
    @Override
    protected String nullDefaultHost$str() {
        return "WFLYUT0055: デフォルトのホストは null です。";
    }
    @Override
    protected String nullHostName$str() {
        return "WFLYUT0056: ホスト名は null です。";
    }
    @Override
    protected String invalidPersistentSessionDir$str() {
        return "WFLYUT0060: 無効な永続セッションディレクトリー %1$s";
    }
    @Override
    protected String failedToCreatePersistentSessionDir$str() {
        return "WFLYUT0061: 永続セッションディレクトリー %1$s の作成に失敗しました";
    }
    @Override
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYUT0062: ログディレクトリーを作成できませんでした: %1$s";
    }
    @Override
    protected String noPortListeningForProtocol$str() {
        return "WFLYUT0063: プロトコル %1$s をリッスンしているポート番号が見つかりませんでした";
    }
    @Override
    protected String failedToConfigureHandler$str() {
        return "WFLYUT0064: ハンドラー %1$s の設定に失敗しました";
    }
    @Override
    protected String handlerWasNotAHandlerOrWrapper$str() {
        return "WFLYUT0065: ハンドラークラス %1$s はハンドラーまたはラッパーではありませんでした";
    }
    @Override
    protected String failedToConfigureHandlerClass$str() {
        return "WFLYUT0066: ハンドラー %1$s の設定に失敗しました";
    }
    @Override
    protected String servletClassNotDefined$str() {
        return "WFLYUT0067: サーブレットクラスがサーブレット %1$s に定義されていません";
    }
    @Override
    protected String sharedSessionConfigNotInRootDeployment$str() {
        return "WFLYUT0069: デプロイメント %1$s の jboss-all.xml にある shared-session-config を無視します。このエントリーはトップレベルデプロイメントのみで有効です。";
    }
    @Override
    protected String couldNotLoadHandlerFromModule$str() {
        return "WFLYUT0070: %2$s モジュールからハンドラー %1$s をロードできませんでした";
    }
    @Override
    protected String alpnNotFound$str() {
        return "WFLYUT0071: ALPN プロバイダーが見つかりませんでした。HTTP/2 は有効にされません。このメッセージを削除するには、Undertow サブシステムのリスナー %1$s で enable-http2 を false に設定します。";
    }
    @Override
    protected String couldNotFindExternalPath$str() {
        return "WFLYUT0072: 設定された外部パス %1$s が見つかりませんでした";
    }
    @Override
    protected String advertiseSocketBindingRequiresMulticastAddress$str() {
        return "WFLYUT0073: mod_cluster アドバタイズソケットバインディングにはマルチキャストアドレスを設定する必要があります";
    }
    @Override
    protected String tldNotFound$str() {
        return "WFLYUT0074: TLD %1$s が見つかりませんでした";
    }
    @Override
    protected String failedToRegisterWebsocket$str() {
        return "WFLYUT0078: %2$s にある websocket %1$s の管理ビューを登録できませんでした";
    }
    @Override
    protected String unsupportedValveFeature$str() {
        return "WFLYUT0080: バルブはサポート対象外になりました。%1$s はアクティベートされていません。";
    }
    @Override
    protected String distributableDisabledInFragmentXml$str() {
        return "WFLYUT0081: この機能はモジュール %2$s の web-fragment.xml で無効であるため、デプロイメント %1$s は配布できません。";
    }
    @Override
    protected String couldNotStartListener$str() {
        return "WFLYUT0082: '%1$s' リスナーを起動できませんでした。";
    }
    @Override
    protected String nullNotAllowed$str() {
        return "WFLYUT0083: %1$s を null にすることは許可されません";
    }
    @Override
    protected String duplicateDefaultWebModuleMapping$str() {
        return "WFLYUT0087: 重複するデフォルトの Web モジュール '%1$s' がサーバー '%2$s'、ホスト '%3$s' で設定されています";
    }
    @Override
    protected String predicateNotValid$str() {
        return "WFLYUT0089: 述語 %1$s は有効ではありません。メッセージは: %2$s";
    }
    @Override
    protected String missingKeyStoreEntry$str() {
        return "WFLYUT0090: キーエイリアス %1$s は設定されたキーストアに存在しません";
    }
    @Override
    protected String keyStoreEntryNotPrivate$str() {
        return "WFLYUT0091: キーストアエントリー %1$s はプライベートキーエントリーではありません";
    }
    @Override
    protected String missingCredential$str() {
        return "WFLYUT0092: クレデンシャルエイリアス %1$s は設定されたクレデンシャルストアに存在しません";
    }
    @Override
    protected String credentialNotClearPassword$str() {
        return "WFLYUT0093: クレデンシャル %1$s はクリアテキストのパスワードではありません";
    }
    @Override
    protected String configurationOptionIgnoredWhenUsingElytron$str() {
        return "WFLYUT0094: Elytron サブシステムの使用時は設定オプション [%1$s] は無視されます";
    }
    @Override
    protected String unableAddHandlerForPath$str() {
        return "WFLYUT0095: ファイルシステム上にパス ['%1$s'] は存在しません。";
    }
    @Override
    protected String workerValueInHTTPListenerMustMatchRemoting$str() {
        return "WFLYUT0097: http-upgrade が有効になっている場合、リモーティングワーカーと http(s) ワーカーは同じである必要があります。必要な場合は値を調整してください。";
    }
    @Override
    protected String sessionManagerNotAvailable$str() {
        return "WFLYUT0099: セッションマネージャーを利用できません";
    }
    @Override
    protected String sessionNotFound$str() {
        return "WFLYUT0100: セッション %1$s が見つかりません";
    }
    @Override
    protected String duplicateServletMapping$str() {
        return "WFLYUT0101: 重複したサーブレットマッピング %1$s が見つかりました";
    }
    @Override
    protected String invalidDateTimeFormatterPattern$str() {
        return "WFLYUT0102: パターン %1$s は有効な日付パターンではありません。";
    }
    @Override
    protected String invalidTimeZoneId$str() {
        return "WFLYUT0103: タイムゾーン IDの %1$s は無効です。";
    }
    @Override
    protected String missingClassInAnnotation$str() {
        return "WFLYUT0104: アノテーションで参照される一部のクラス: クラスの %1$s: %2$s がありません。";
    }
    @Override
    protected String duplicateHostContextDeployments$str() {
        return "WFLYUT0105: ホストとコンテキストパスが使用されている場合、%1$s は登録できません。メッセージは次のとおりです: %2$s";
    }
    @Override
    protected String unableToObfuscateSessionRoute$str() {
        return "WFLYUT0106: '%1$s' からあいまいなセッションルートを生成できません";
    }
    @Override
    protected String obfuscatedSessionRoute$str() {
        return "WFLYUT0107: '%1$s' から、不明瞭なセッションルート '%2$s' を生成しました";
    }
    @Override
    protected String deploymentConfiguredForLegacySecurity$str() {
        return "WFLYUT0108: デプロイメントは、使用できなくなったレガシーセキュリティーを使用するように設定されます。";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYUT0109: デプロイメントは、サポート対象外になったレガシーセキュリティーを使用するように設定されています。";
    }
    @Override
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYUT0110: ランタイム時のセキュリティーレルムの使用はサポート対象外です。";
    }
    @Override
    protected String badAnnotationOnServlet$str() {
        return "WFLYUT0111: アノテーション: '%1$s' は Servlet: '%2$s' に影響を与えません";
    }
}
