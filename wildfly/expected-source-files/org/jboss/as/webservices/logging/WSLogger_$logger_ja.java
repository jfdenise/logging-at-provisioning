package org.jboss.as.webservices.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:14+0200")
public class WSLogger_$logger_ja extends WSLogger_$logger implements WSLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public WSLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotLoadDeploymentAspectsDefinitionFile$str() {
        return "WFLYWS0001: %1$s から WS デプロイメントアスペクトをロードできませんでした。";
    }
    @Override
    protected String activatingWebservicesExtension$str() {
        return "WFLYWS0002: WebServices Extension を有効にしています。";
    }
    @Override
    protected String starting$str() {
        return "WFLYWS0003: %1$s の開始中";
    }
    @Override
    protected String stopping$str() {
        return "WFLYWS0004: %1$s の停止中";
    }
    @Override
    protected String configServiceCreationFailed$str() {
        return "WFLYWS0005: 設定サービス作成中のエラー";
    }
    @Override
    protected String configServiceDestroyFailed$str() {
        return "WFLYWS0006: 設定サービス破棄中のエラー";
    }
    @Override
    protected String cannotReadWsdl$str() {
        return "WFLYWS0007: %1$s から WSDL を読み取ることができませんでした。";
    }
    @Override
    protected String mutuallyExclusiveAnnotations$str() {
        return "WFLYWS0008: [JAXWS 2.2 spec, section 7.7] @WebService および @WebServiceProvider のアノテーションは相互に排他的です-　この要件を満たさないため、%1$s は webservice エンドポイントとして認識されません。";
    }
    @Override
    protected String finalEndpointClassDetected$str() {
        return "WFLYWS0009: WebService エンドポイントクラスを最後にすることができません - %1$s は Webservice エンドポイントとして認識されません。";
    }
    @Override
    protected String ignoringPortComponentRef$str() {
        return "WFLYWS0010: <service-endpoint-interface> および <port-qname> のない <port-component-ref> を無視します: %1$s";
    }
    @Override
    protected String cannotRegisterRecordProcessor$str() {
        return "WFLYWS0011: JMX サーバーにレコードプロセッサーを登録できません。";
    }
    @Override
    protected String cannotUnregisterRecordProcessor$str() {
        return "WFLYWS0012: JMX サーバーからレコードプロセッサーの登録を解除できません。";
    }
    @Override
    protected String mBeanServerNotAvailable$str() {
        return "WFLYWS0013: MBeanServer は利用できません。%1$s の登録／登録解除をスキップします。";
    }
    @Override
    protected String multipleEndpointsWithDifferentDeclaredSecurityRoles$str() {
        return "WFLYWS0014: 宣言されたセキュリティーロールが異なる同じデプロイメント内の複数の Enterprise Beans 3 エンドポイント。これは、各 ws エンドポイントメソッドで許可済みロール (@RolesAllowed) を制御していない場合に、セキュリティーリスクになる場合があることに注意してください。";
    }
    @Override
    protected String cannotRegisterEndpoint$str() {
        return "WFLYWS0015: エンドポイント: %1$s を JMX サーバーに登録できません";
    }
    @Override
    protected String cannotUnregisterEndpoint$str() {
        return "WFLYWS0016: エンドポイント: %1$s を JMX サーバーで登録解除できません。";
    }
    @Override
    protected String invalidHandlerChainFile$str() {
        return "WFLYWS0017: 無効なハンドラーチェーンファイル: %1$s";
    }
    @Override
    protected String webMethodMustNotBeStaticOrFinal$str() {
        return "WFLYWS0018: Web サービスメソッド %1$s は静的または最終であってはなりません。「Jakarta Enterprise Web Services 2.0」の項 5.3.2.4.2 を参照してください。";
    }
    @Override
    protected String webMethodMustBePublic$str() {
        return "WFLYWS0019: Web サービスメソッド %1$s は public である必要がいます。「Jakarta Enterprise Web Services 2.0」の項 5.3.2.4.2 を参照してください。";
    }
    @Override
    protected String webServiceMethodNotFound$str() {
        return "WFLYWS0020: web サービス実装クラス %1$s にはメソッド %2$s が含まれていません。";
    }
    @Override
    protected String accessibleWebServiceMethodNotFound$str() {
        return "WFLYWS0021: web サービス実装クラス %1$s にはアクセス可能なメソッド %2$s が含まれていません。";
    }
    @Override
    protected String finalizeMethodNotAllowed$str() {
        return "WFLYWS0022: Web サービスメソッドクラス %1$s は finalize() メソッドを宣言しない可能性があります。「Jakarta Enterprise Web Services 2.0」の 項 5.3.2.4.2 を参照してください。";
    }
    @Override
    protected String nullEndpointName$str() {
        return "WFLYWS0023: null のエンドポイント名";
    }
    @Override
    protected String nullEndpointClass$str() {
        return "WFLYWS0024: null のエンドポイントクラス";
    }
    @Override
    protected String classLoaderResolutionFailed$str() {
        return "WFLYWS0025: デプロイメント %1$s に対しモジュールあるいはクラスローダーを解決できません。";
    }
    @Override
    protected String missingHandlerChainConfigFile$str() {
        return "WFLYWS0026: ハンドラーチェーン設定ファイル %1$s が %2$s で見つかりませんでした。";
    }
    @Override
    protected String unexpectedElement$str() {
        return "WFLYWS0027: 予期せぬ要素: %1$s";
    }
    @Override
    protected String unexpectedEndTag$str() {
        return "WFLYWS0028: 予期せぬ終了タグ: %1$s";
    }
    @Override
    protected String unexpectedEndOfDocument$str() {
        return "WFLYWS0029: 予期せず xml ドキュメントの最後に到達しました。";
    }
    @Override
    protected String missingDeploymentAspectClassAttribute$str() {
        return "WFLYWS0030: デプロイメントアスペクトのクラス属性が見つかりませんでした。";
    }
    @Override
    protected String cannotInstantiateDeploymentAspect$str() {
        return "WFLYWS0031: クラスのデプロイメントアスペクトを作成できませんでした: %1$s";
    }
    @Override
    protected String missingPropertyNameAttribute$str() {
        return "WFLYWS0032: デプロイメントアスペクトのプロパティ名属性を見つけることができませんでした: %1$s";
    }
    @Override
    protected String missingPropertyClassAttribute$str() {
        return "WFLYWS0033: デプロイメントアスペクトのプロパティクラス属性を見つけることができませんでした: %1$s";
    }
    @Override
    protected String unsupportedPropertyClass$str() {
        return "WFLYWS0034: プロパティクラスには対応していません: %1$s";
    }
    @Override
    protected String cannotInstantiateList$str() {
        return "WFLYWS0035: 型一覧を作成できませんでした: %1$s";
    }
    @Override
    protected String cannotInstantiateMap$str() {
        return "WFLYWS0036: 型のマップを作成できませんでした: %1$s";
    }
    @Override
    protected String noMetricsAvailable$str() {
        return "WFLYWS0037: 利用可能なメトリクスがありません。";
    }
    @Override
    protected String cannotFindComponentView$str() {
        return "WFLYWS0038: コンポーネントビューを見つけることができません: %1$s";
    }
    @Override
    protected String missingChild$str() {
        return "WFLYWS0039: VirtualFile の子 '%1$s' が見つかりません: %2$s";
    }
    @Override
    protected String createContextPhaseFailed$str() {
        return "WFLYWS0040: コンテキスト作成に失敗しました。";
    }
    @Override
    protected String startContextPhaseFailed$str() {
        return "WFLYWS0041: コンテキストの開始に失敗しました。";
    }
    @Override
    protected String stopContextPhaseFailed$str() {
        return "WFLYWS0042: コンテキストの停止に失敗しました。";
    }
    @Override
    protected String destroyContextPhaseFailed$str() {
        return "WFLYWS0043: コンテキストの破棄に失敗しました。";
    }
    @Override
    protected String cannotInstantiateServletDelegate$str() {
        return "WFLYWS0044: サーブレットの委譲を作成できません: %1$s";
    }
    @Override
    protected String missingDeploymentProperty$str() {
        return "WFLYWS0045: デプロイメントプロパティを取得できません: %1$s";
    }
    @Override
    protected String multipleSecurityDomainsDetected$str() {
        return "WFLYWS0046: 複数のセキュリティドメインには対応していません。最初のドメイン: '%1$s' 2 番目のドメイン: '%2$s'";
    }
    @Override
    protected String sameUrlPatternRequested$str() {
        return "WFLYWS0047: URL パターン %2$s のWeb サービスのエンドポイント %1$s はすでに登録されています。Web サービスエンドポイント %3$s は同じ URL パターンをリクエストしています。";
    }
    @Override
    protected String invalidServiceRefSetterMethodName$str() {
        return "WFLYWS0048: @WebServiceRef インジェクションターゲットは無効です。setter メソッドのみを利用できます: %1$s";
    }
    @Override
    protected String requiredServiceRefName$str() {
        return "WFLYWS0049: @WebServiceRef 属性 'name' はクラスレベルのアノテーションには必須です。";
    }
    @Override
    protected String requiredServiceRefType$str() {
        return "WFLYWS0050: @WebServiceRef 属性 'type' はクラスレベルのアノテーションには必須です。";
    }
    @Override
    protected String missingConfig$str() {
        return "WFLYWS0051: 設定 %1$s は存在しません。";
    }
    @Override
    protected String wrongHandlerChainType$str() {
        return "WFLYWS0052: ハンドラーチェーンの型: %1$s には対応していません。対応している型は %2$s あるいは %3$s です。";
    }
    @Override
    protected String missingHandlerChain$str() {
        return "WFLYWS0054: 設定 %1$s: id が %3$s の %2$s ハンドラーチェーンは存在しません。";
    }
    @Override
    protected String cannotGetURLForDescriptor$str() {
        return "WFLYWS0057: URL を取得できません: %1$s";
    }
    @Override
    protected String jaxRpcNotSupported$str() {
        return "WFLYWS0058: Jakarta XML RPC はサポートされません";
    }
    @Override
    protected String invalidLibraryInDeployment$str() {
        return "WFLYWS0059: ws エンドポイントデプロイメントで %1$s ライブラリー (%2$s) が検出されました。適切なデプロイメントを提供して組み込みライブラリーをコンテナーモジュールの依存関係に置き換えるか、現在のデプロイメントに対して Web サービスサブシステムを無効にして適切な jboss-deployment-structure.xml 記述子を追加します。Web サービスサブシステムを無効にする方法を使用すると、ほとんどの Web サービス Jakarta EE および JBossWS 固有の機能が無効になるため、適切なデプロイメントを提供する方法が推奨されます。";
    }
    @Override
    protected String endpointClassNotFound$str() {
        return "WFLYWS0060: Web サービスエンドポイントクラス %1$s は見つかりませんでした";
    }
    @Override
    protected String declaredEndpointInterfaceClassNotFound$str() {
        return "WFLYWS0061: Web サービス実装 Bean %2$s の @WebService アノテーションで宣言された endpointInterface %1$s は見つかりませんでした。";
    }
    @Override
    protected String jwsWebServiceClassVerificationFailed$str() {
        return "WFLYWS0062: Java Web Service 実装クラス %1$s のクラス検証に失敗しました。";
    }
    @Override
    protected String couldNotUpdateServerConfigBecauseOfReloadRequired$str() {
        return "WFLYWS0063: リロードを必要とする以前のモデルアップデートが保留中であるため、WS サーバー設定をアップデートできませんでした。";
    }
    @Override
    protected String couldNotUpdateServerConfigBecauseOfExistingWSDeployment$str() {
        return "WFLYWS0064: サーバーに WS デプロイメントが存在するため、WSサーバー設定をアップデートできませんでした。";
    }
    @Override
    protected String invalidWSServlet$str() {
        return "WFLYWS0066: サーブレットクラス %1$s が web.xml で宣言されました。JBossWS に依存する適切なデプロイメントを提供するか、現在のデプロイメントに対して Web サービスサブシステムを無効にして適切な jboss-deployment-structure.xml 記述子を追加します。Web サービスサブシステムを無効にする方法を使用すると、ほとんどの Web サービス Jakarta EE および JBossWS 固有の機能が無効になるため、適切なデプロイメントを提供する方法が推奨されます。";
    }
    @Override
    protected String couldNotActivateSubsystem$str() {
        return "WFLYWS0067: webservices サブシステムをアクティブ化できませんでした。";
    }
    @Override
    protected String failedAuthorization$str() {
        return "WFLYWS0070: ユーザーの承認に失敗しました: %1$s";
    }
    @Override
    protected String failedAuthentication$str() {
        return "WFLYWS0071: ユーザー名 %1$s の認証に失敗しました。不適切なユーザー名/パスワード";
    }
    @Override
    protected String failedAuthenticationWithException$str() {
        return "WFLYWS0072: ユーザー名 %1$s の認証時にエラーが発生しました。例外メッセージ: %2$s";
    }
    @Override
    protected String endpointAlreadyStopped$str() {
        return "WFLYWS0073: ターゲットエンドポイント %1$s はアンデプロイ中であるか、停止されています";
    }
    @Override
    protected String warningLibraryInDeployment$str() {
        return "WFLYWS0068: ws エンドポイントデプロイメントで問題となる可能性のある %1$s ライブラリー (%2$s) が検出されました。このライブラリーをコンテナーモジュールに置き換えることができるかどうかを確認します";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYWS0074: デプロイメントは、サポート対象外になったレガシーセキュリティーを使用するように設定されています。";
    }
    @Override
    protected String onlyStringPasswordAccepted$str() {
        return "WFLYWS0075: 文字列のパスワードのみ使用できます";
    }
    @Override
    protected String checkModuleDependency$str() {
        return "WFLYWS0076: アノテーション '@%1$s' がクラス '%2$s' で見つかりました。'%3$s' モジュールの依存関係がデプロイメントに追加されていることを確認してください。";
    }
}
