package org.jboss.as.weld.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:55+0200")
public class WeldLogger_$logger_ja extends WeldLogger_$logger implements WeldLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public WeldLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotLoadAnnotationIndexOfExternalBeanArchive$str() {
        return "WFLYWELD0054: 外部 bean アーカイブの提供されたインデックスを読み取りできませんでした: %1$s";
    }
    @Override
    protected String cdiAnnotationsButNotBeanArchive$str() {
        return "WFLYWELD0013: デプロイメント %1$s には Jakarta Contexts and Dependency Injection アノテーションが含まれますが、Bean アーカイブは見つかりませんでした (beans.xml および Beanを定義するアノテーションを持つクラスがありません)。";
    }
    @Override
    protected String couldNotReadEntries$str() {
        return "WFLYWELD0016: エントリーを読み取ることができませんでした";
    }
    @Override
    protected String couldNotFindPersistenceUnit$str() {
        return "WFLYWELD0037: Jakarta Contexts and Dependency Injection 管理対象 bean への永続ユニットの注入時にエラーが発生しました。インジェクションポイント %3$s に対するデプロイメント %2$s の '%1$s' と呼ばれる永続ユニットが見つかりません";
    }
    @Override
    protected String couldNotDetermineUnderlyingType$str() {
        return "WFLYWELD0036: インジェクションポイント型 %1$s から bean クラスを判断することができませんでした";
    }
    @Override
    protected String couldNotFindResource1$str() {
        return "WFLYWELD0044: リソースを Jakarta Contexts and Dependency Injection 管理対象 Bean にインジェクトする際にエラーが発生しました。%1$s という名前のリソースが見つかりません";
    }
    @Override
    protected String doNotUnderstandProtocol$str() {
        return "WFLYWELD0017: URL スキャナーは URL プロトコル %1$s を理解しません。Jakarta Contexts and Dependency Injection Bean はスキャンされません。";
    }
    @Override
    protected String viewNotFoundOnEJB$str() {
        return "WFLYWELD0022: Jakarta Enterprise Beans %2$s でタイプ %1$s のビューが見つかりません";
    }
    @Override
    protected String securityNotEnabled$str() {
        return "WFLYWELD0038: SecurityManager を注入できませんでした。セキュリティーが有効になっていません";
    }
    @Override
    protected String couldNotLoadPortableExceptionClass$str() {
        return "WFLYWELD0007: 移植可能な継承クラス %1$s をロードできませんでした。";
    }
    @Override
    protected String rejectAttributesMustBeTrue$str() {
        return "WFLYWELD0048: CDI 1.0 '%1$s' と使用するには、これらの属性が true である必要があります";
    }
    @Override
    protected String extensionDoesNotImplementExtension$str() {
        return "WFLYWELD0021: サービス %1$s が jakarta.enterprise.inject.spi.Extension インターフェイスを実装しませんでした";
    }
    @Override
    protected String couldNotLoadInterceptorClass$str() {
        return "WFLYWELD0020: インターセプタークラスをロードできませんでした: %1$s";
    }
    @Override
    protected String injectionPointNotAJavabean$str() {
        return "WFLYWELD0032: インジェクションポイントは、JavaBean 規則に準拠しないメソッド %1$s を表しています (パラメーターを 1 つ持つ必要があります)。";
    }
    @Override
    protected String beanArchiveDiscovered$str() {
        return "%1$s が発見されました";
    }
    @Override
    protected String failedToTearDownWeldContexts$str() {
        return "WFLYWELD0002: Weld コンテキストの終了処理に失敗しました";
    }
    @Override
    protected String incorrectBceTranslatorSetup$str() {
        return "WFLYWELD0064: Weld の LiteExtensionTranslator 初期化の設定が正しくありません。デプロイメントユニットを指定する必要があります";
    }
    @Override
    protected String moreThanOneEjbResolved$str() {
        return "WFLYWELD0035: %2$s 上の %1$s の @EJB インジェクションに複数の Jakarta Enterprise Beans を解決しました。%3$s が見つかりました";
    }
    @Override
    protected String persistenceUnitFailed$str() {
        return "WFLYWELD0057: 永続ユニット '%1$s' が失敗しました。";
    }
    @Override
    protected String startingWeldService$str() {
        return "WFLYWELD0009: デプロイメント %1$s に対して Weld サービスを開始しています";
    }
    @Override
    protected String parameterCannotBeNull$str() {
        return "WFLYWELD0031: %1$s は null を取ることができません。";
    }
    @Override
    protected String unableToLoadAnnotation$str() {
        return "アノテーション %1$s をロードできません";
    }
    @Override
    protected String notStarted$str() {
        return "WFLYWELD0041: %1$s は起動していません";
    }
    @Override
    protected String annotationNotFound$str() {
        return "WFLYWELD0033: %1$s アノテーションが %2$s で見つかりませんでした。";
    }
    @Override
    protected String nameNotFoundInIndex$str() {
        return "WFLYWELD0050: %1$s は複合インデックスで見つかりませんでした";
    }
    @Override
    protected String beansXmlValidationError$str() {
        return "WFLYWELD0012: %1$s:%2$s %3$s 解析中の警告";
    }
    @Override
    protected String cannotInject$str() {
        return "WFLYWELD0046: インジェクションポイント %1$s をインジェクトできません";
    }
    @Override
    protected String persistenceUnitRemoved$str() {
        return "WFLYWELD0058: 永続ユニット '%1$s' が削除されました。";
    }
    @Override
    protected String couldNotFindResource2$str() {
        return "WFLYWELD0049: リソースを Jakarta Contexts and Dependency Injection 管理対象 Bean にインジェクトする際にエラーが発生しました。%2$s で定義された %1$s という名前のリソースが見つかりません";
    }
    @Override
    protected String startingServicesForCDIDeployment$str() {
        return "WFLYWELD0006: Jakarta Contexts and Dependency Injection デプロイメントのサービスを開始します。%1$s";
    }
    @Override
    protected String componentInterceptorSupportNotAvailable$str() {
        return "WFLYWELD0053: %1$s ではコンポーネントインターセプターのサポートが利用できません";
    }
    @Override
    protected String errorHandlingFile$str() {
        return "WFLYWELD0060: エラー処理ファイル %1$s";
    }
    @Override
    protected String processingWeldDeployment$str() {
        return "WFLYWELD0003: Weld デプロイメント %1$s を処理しています";
    }
    @Override
    protected String duplicateBeansXml$str() {
        return "WFLYWELD0018: WEB-INF/beans.xml および WEB-INF/classes/META-INF/beans.xml の両方が見つかりました。両方の場所を同時に使用することはポータブルではありません。Weld はこのデプロイメントに WEB-INF/beans.xml を使用します。";
    }
    @Override
    protected String singletonNotSet$str() {
        return "WFLYWELD0039: %1$s に対してシングルトンが設定されていません。Weld デプロイメントに関連付けられていない Thread Context ClassLoader でこのデプロイメントにアクセスしようとしています。";
    }
    @Override
    protected String loadingProxiesUsingDeploymentClassLoader$str() {
        return "WFLYWELD0052: デプロイメントクラスローダーを使用してモジュール %1$s のプロキシクラスをロードします。パッケージプライベートのアクセスは動作しません。これを修正するには、モジュールが %2$s で依存関係を宣言する必要があります。";
    }
    @Override
    protected String weldNotInitialized$str() {
        return "WFLYWELD0056: Weld が初期化されていません";
    }
    @Override
    protected String couldNotDeterminePackage$str() {
        return "WFLYWELD0062: 破損したクラス名からパッケージを特定できませんでした";
    }
    @Override
    protected String couldNotFindBeanManagerForDeployment$str() {
        return "WFLYWELD0005: デプロイメント %1$s に対する BeanManager が見つかりませんでした。";
    }
    @Override
    protected String beansXmlValidationWarning$str() {
        return "WFLYWELD0011: %1$s:%2$s %3$s 解析中の警告";
    }
    @Override
    protected String alreadyRunning$str() {
        return "WFLYWELD0040: %1$s はすでに起動しています";
    }
    @Override
    protected String beanDeploymentNotFound$str() {
        return "WFLYWELD0043: id %1$s の BeanDeploymentArchive はデプロイメントで見つかりませんでした";
    }
    @Override
    protected String cannotDetermineResourceName$str() {
        return "WFLYWELD0045: リソース名を判断できません。jndiName および mappedName は両方とも null です";
    }
    @Override
    protected String unknownInterceptorClassForCDIInjection$str() {
        return "WFLYWELD0030: Jakarta Contexts および Dependency Injection %1$s の不明なインターセプタークラス";
    }
    @Override
    protected String unknownDeploymentType$str() {
        return "WFLYWELD0059: 不明なデプロイメントタイプ %1$s";
    }
    @Override
    protected String failedToSetupWeldContexts$str() {
        return "WFLYWELD0001: Weld コンテキストの設定に失敗しました";
    }
    @Override
    protected String missingService$str() {
        return "WFLYWELD0061: 次のものに必要なサービスプロバイダーは 1 つだけです: %1$s";
    }
    @Override
    protected String exceptionClearingThreadState$str() {
        return "WFLYWELD0014: スレッド状態の破棄中の例外";
    }
    @Override
    protected String stoppingWeldService$str() {
        return "WFLYWELD0010: デプロイメント %1$s の Weld サービスを停止しています";
    }
    @Override
    protected String injectionTypeNotValue$str() {
        return "WFLYWELD0008: %1$s 型の @Resource インジェクションは Jakarta Enterprise Beans 以外のコンポーネントには対応していません。インジェクションポイント: %2$s";
    }
    @Override
    protected String couldNotGetBeansXmlAsURL$str() {
        return "WFLYWELD0019: ファイルの処理中に beans.xml ファイルを URL として取得できませんでした: %1$s";
    }
    @Override
    protected String cannotIndexClassName$str() {
        return "WFLYWELD0055: 外部 bean アーカイブからクラス [%1$s] をインデックスできませんでした: %2$s";
    }
    @Override
    protected String originalClassDoesNotHaveAModule$str() {
        return "WFLYWELD0063: 元の %1$s にモジュールがありません";
    }
    @Override
    protected String ejbNotResolved$str() {
        return "WFLYWELD0034: %2$s にある %1$s の @EJB インジェクションを解決できませんでした";
    }
    @Override
    protected String cannotUseAtRuntime$str() {
        return "WFLYWELD0047: %1$s はランタイムに使用できません";
    }
    @Override
    protected String cannotLoadClass$str() {
        return "WFLYWELD0051: %1$s をロードできません";
    }
}
