package org.jboss.as.ee.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:54:02+0200")
public class EeLogger_$logger_ja extends EeLogger_$logger implements EeLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public EeLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotResolve$str() {
        return "WFLYEE0002: %1$s %2$s を解決できませんでした。";
    }
    @Override
    protected String componentDestroyFailure$str() {
        return "WFLYEE0006: コンポーネントインスタンス %1$s の破棄に失敗しました。";
    }
    @Override
    protected String componentInstallationFailure$str() {
        return "WFLYEE0007: 例外が原因でオプションのコンポーネント %1$s をインストールしていません (DEBUG ログレベルを有効にして原因を確認してください)";
    }
    @Override
    protected String invalidManagedBeanAbstractOrFinal$str() {
        return "WFLYEE0009: [Managed Bean spec, section %1$s] マネージド Bean 実装クラスをインターフェースにしてはいけません(MUST NOT)。- %2$s はインターフェースであるため、マネージド Bean として認められません。";
    }
    @Override
    protected String invalidManagedBeanInterface$str() {
        return "WFLYEE0010: [Managed Bean spec, section %1$s] マネージド Bean 実装クラスは abstract または final にしてはいけません(MUST NOT)。 - 仕様の要件を満たさないため、%2$s はマネージド Bean として認められません。";
    }
    @Override
    protected String preDestroyInterceptorFailure$str() {
        return "WFLYEE0011: コンポーネントクラスの pre-destroy インターセプターを呼び出し中の例外 : %1$s";
    }
    @Override
    protected String subdeploymentIgnored$str() {
        return "WFLYEE0014: サブデプロイメントの %1$s は無視されます。jjboss-ejb-client.xml はトップレベルのデプロイメントに対してのみ解析されます。";
    }
    @Override
    protected String rollbackOfTransactionStartedInEEConcurrentInvocation$str() {
        return "WFLYEE0015: EE 同時呼び出しで開始されたトランザクションはオープン状態のままになっており、トランザクションリークを防ぐためロールバックを開始します。";
    }
    @Override
    protected String failedToRollbackTransaction$str() {
        return "WFLYEE0016: トランザクションのロールバックに失敗しました。";
    }
    @Override
    protected String failedToSuspendTransaction$str() {
        return "WFLYEE0017: トランザクションの一時停止に失敗しました。";
    }
    @Override
    protected String systemErrorWhileCheckingForTransactionLeak$str() {
        return "WFLYEE0018: EE 同時呼び出しでのトランザクションリークのチェック中にシステムエラーが発生しました。";
    }
    @Override
    protected String alternateDeploymentDescriptor$str() {
        return "WFLYEE0019: %2$s に指定された代替のデプロイメント記述子 %1$s は見つかりませんでした。";
    }
    @Override
    protected String annotationAttributeMissing$str() {
        return "WFLYEE0020: %1$s アノテーションは %2$s を提供する必要があります。";
    }
    @Override
    protected String cannotAddMoreItems$str() {
        return "WFLYEE0021: getSortedItems() を呼び出すとこれ以上アイテムの追加はできません";
    }
    @Override
    protected String cannotBeEmpty$str() {
        return "WFLYEE0022: %1$s は空にすることはできません。";
    }
    @Override
    protected String cannotBeNullOrEmpty$str() {
        return "WFLYEE0023: %1$s は null や空にすることはできません: %2$s";
    }
    @Override
    protected String cannotConfigureComponent$str() {
        return "WFLYEE0024: コンポーネント %1$s を設定できませんでした。";
    }
    @Override
    protected String cannotDetermineType1$str() {
        return "WFLYEE0025: resource-env-ref %1$s の型を判断することができませんでした。";
    }
    @Override
    protected String cannotDetermineType3$str() {
        return "WFLYEE0026: %1$s %2$s の型を判断することができませんでした。%3$s を指定してください。";
    }
    @Override
    protected String cannotLoad$str() {
        return "WFLYEE0027: env-entry で参照した %1$s をロードできませんでした。";
    }
    @Override
    protected String cannotLoadInterceptor1$str() {
        return "WFLYEE0028: インターセプタークラスをロードできませんでした: %1$s";
    }
    @Override
    protected String cannotLoadInterceptor2$str() {
        return "WFLYEE0029: コンポーネント %2$s にインターセプタークラス %1$s をロードできませんでした。";
    }
    @Override
    protected String cannotLoadViewClass$str() {
        return "WFLYEE0030: コンポーネント %2$s のビュークラス %1$s をロードできませんでした";
    }
    @Override
    protected String cannotProcessEarModule$str() {
        return "WFLYEE0031: EAR [%1$s] の application.xml に定義されたモジュールを処理できません。モジュールファイル %2$s が見つかりません";
    }
    @Override
    protected String cannotParseResourceRefUri$str() {
        return "WFLYEE0032: resource-ref URIの解析をできません: %1$s";
    }
    @Override
    protected String cannotResolveInjectionPoint$str() {
        return "WFLYEE0033: web.xml で指定されたクラス %2$s のインジェクションポイント %1$s を解決できませんでした。";
    }
    @Override
    protected String cannotResolveMethod$str() {
        return "WFLYEE0034: アノテーション %3$s が付いたクラス %2$s のメソッド %1$s を解決できませんでした。";
    }
    @Override
    protected String cannotSpecifyBoth$str() {
        return "WFLYEE0036: 環境エントリで %1$s と %2$s の両方を指定することができませんでした。";
    }
    @Override
    protected String circularDependency$str() {
        return "WFLYEE0037: 循環依存が検出されました %1$s";
    }
    @Override
    protected String classOnlyAnnotation$str() {
        return "WFLYEE0038: %1$s アノテーションはクラスでのみ利用できます。%2$s はクラスではありません。";
    }
    @Override
    protected String componentAlreadyDefined$str() {
        return "WFLYEE0040: クラス '%2$s' のコンポーネント '%1$s' はすでにクラス %3$s で定義されています";
    }
    @Override
    protected String componentClassHasErrors$str() {
        return "WFLYEE0041: コンポーネント %2$s のコンポーネントクラス %1$s にエラーがあります: %n%3$s";
    }
    @Override
    protected String componentConstructionFailure$str() {
        return "WFLYEE0042: コンポーネントインスタンスの構築に失敗しました";
    }
    @Override
    protected String componentIsStopped$str() {
        return "WFLYEE0043: コンポーネントは停止しました";
    }
    @Override
    protected String componentNotAvailable$str() {
        return "WFLYEE0044: コンポーネントは利用できません (中断されました)";
    }
    @Override
    protected String componentNotFound$str() {
        return "WFLYEE0045: '%1$s' 型のコンポーネントが見つかりません。";
    }
    @Override
    protected String componentViewConstructionFailure$str() {
        return "WFLYEE0046: コンポーネントビューのインスタンス化に失敗しました";
    }
    @Override
    protected String conflictingBinding$str() {
        return "WFLYEE0047: %1$s で互換性がなく矛盾したバインディングが検出されました。ソース: %2$s";
    }
    @Override
    protected String defaultConstructorNotFound$str() {
        return "WFLYEE0048: %1$s のデフォルトのコンストラクターが見つかりませんでした。";
    }
    @Override
    protected String defaultConstructorNotFoundOnComponent$str() {
        return "WFLYEE0050: コンポーネント %2$s にインターセプタークラス %1$s のデフォルトコンストラクターがありません。";
    }
    @Override
    protected String elementAttributeMissing$str() {
        return "WFLYEE0051: %1$s 要素は %2$s を提供しなければなりません。";
    }
    @Override
    protected String failedToInstallComponent$str() {
        return "WFLYEE0052: コンポーネント %1$s のインストールに失敗しました。";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYEE0053: %1$s の解析に失敗しました";
    }
    @Override
    protected String failedToProcessChild$str() {
        return "WFLYEE0054: EAR [%1$s] の子のプロセスに失敗しました。";
    }
    @Override
    protected String failedToRead2$str() {
        return "WFLYEE0055: アプリケーション [%2$s] の %1$s エントリーの読み込みに失敗しました。";
    }
    @Override
    protected String failedToRead3$str() {
        return "WFLYEE0056: モジュール [%2$s, %3$s]の %1$s エントリーの読み込みに失敗しました。";
    }
    @Override
    protected String failedToRead4$str() {
        return "WFLYEE0057: コンポーネント [%2$s, %3$s, %4$s] の %1$s エントリーの読み込みに失敗しました。";
    }
    @Override
    protected String fieldNotFound$str() {
        return "WFLYEE0058: '%1$s' と一致するフィールドが見つかりません。";
    }
    @Override
    protected String injectionTargetNotFound$str() {
        return "WFLYEE0059: インジェクションのターゲットが見つかりません";
    }
    @Override
    protected String invalidCharacterLength$str() {
        return "WFLYEE0060: java.lang.Character 型である %1$s は 1 文字ではありません。%2$s";
    }
    @Override
    protected String invalidDescriptor$str() {
        return "WFLYEE0061: %1$s は有効な記述子ではありません。";
    }
    @Override
    protected String invalidInjectionTarget$str() {
        return "WFLYEE0062: クラス %2$s のインジェクションターゲット %1$s はインジェクション型: %3$s と互換がありません。";
    }
    @Override
    protected String invalidNumberOfArguments$str() {
        return "WFLYEE0063: クラス %3$s のアノテーション %2$s が付いたメソッド %1$s の引数の数は無効です。";
    }
    @Override
    protected String invalidReturnType$str() {
        return "WFLYEE0064: クラス %4$s のアノテーション %3$s が付いたメソッド %2$s には %1$s 型の戻り値が必要です。";
    }
    @Override
    protected String invalidSignature$str() {
        return "WFLYEE0065: クラス %3$s のアノテーション %2$s が付いたメソッド %1$s の署名は無効です。署名は '%4$s' でなければなりません。";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYEE0066: '%2$s' 要素に無効な値 %1$s が指定されました。";
    }
    @Override
    protected String methodNotFound1$str() {
        return "WFLYEE0067: メソッド %1$s は存在しません。";
    }
    @Override
    protected String methodNotFound3$str() {
        return "WFLYEE0068: %3$s のメソッド %1$s (%2$s) と一致するメソッドはありません。";
    }
    @Override
    protected String methodOnlyAnnotation$str() {
        return "WFLYEE0069: @%1$s はメソッドターゲットでのみで有効です。";
    }
    @Override
    protected String multipleComponentsFound$str() {
        return "WFLYEE0070: '%1$s' 型の複数のコンポーネントが見つかりました。";
    }
    @Override
    protected String multipleMethodsFound$str() {
        return "WFLYEE0071: %3$s のメソッド %1$s (%2$s) と一致するメソッドが複数見つかりました。";
    }
    @Override
    protected String multipleSetterMethodsFound$str() {
        return "WFLYEE0072: env-entry に <injection-target> を適用するときにクラス %2$s で %1$s の setter メソッドが複数見つかりました。";
    }
    @Override
    protected String noComponentInstance$str() {
        return "WFLYEE0073: 関連付けられたコンポーネントインスタンスはありません";
    }
    @Override
    protected String nullBindingName$str() {
        return "WFLYEE0074: バインド名に null を指定してはいけません: %1$s";
    }
    @Override
    protected String nullOrEmptyManagedBeanClassName$str() {
        return "WFLYEE0075: マネージド Bean クラス名は null または空にすることはできません";
    }
    @Override
    protected String nullOrEmptyResourceReferenceType$str() {
        return "WFLYEE0076: リソース参照型は null または空にすることはできません";
    }
    @Override
    protected String nullResourceReference$str() {
        return "WFLYEE0077: null のリソース参照プロセッサーを登録できません";
    }
    @Override
    protected String nullVar1$str() {
        return "WFLYEE0078: %1$s が null です";
    }
    @Override
    protected String priorityAlreadyExists$str() {
        return "WFLYEE0079: %1$s を追加できません。優先度 0x%2$s はすでに %3$s によって使用されています。";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYEE0082: サービスは開始されていません";
    }
    @Override
    protected String setterMethodOnly$str() {
        return "WFLYEE0083: %1$s インジェクションターゲットは無効です。setter メソッドのみが許可されます: %2$s";
    }
    @Override
    protected String unknownAnnotationTargetType$str() {
        return "WFLYEE0084: 不明な AnnotationTarget 型: %1$s";
    }
    @Override
    protected String unknownElementType$str() {
        return "WFLYEE0085: 不明な %1$s 型: %2$s";
    }
    @Override
    protected String viewMethodNotFound$str() {
        return "WFLYEE0086: %4$s のビュー %3$s でメソッド %1$s %2$s を見つけることができませんでした";
    }
    @Override
    protected String unexpectedElement$str() {
        return "WFLYEE0088: 予期せぬ要素 '%1$s' が見つかりました";
    }
    @Override
    protected String failedToProcessEJBClientDescriptor$str() {
        return "WFLYEE0089: jboss-ejb-client.xml の処理に失敗しました";
    }
    @Override
    protected String xmlErrorParsingEJBClientDescriptor$str() {
        return "WFLYEE0090: %1$s で見つかった jboss-ejb-client.xml を解析中の例外";
    }
    @Override
    protected String errorParsingEJBClientDescriptor$str() {
        return "WFLYEE0091: %1$s";
    }
    @Override
    protected String noMessageDestination$str() {
        return "WFLYEE0092: %2$s をバインドするためのメッセージの宛先で名前が %1$s のものはありません。";
    }
    @Override
    protected String moreThanOneMessageDestination$str() {
        return "WFLYEE0093: %2$s 宛先をバインドするメッセージの宛先で名前が %1$s のものが複数あります: %3$s";
    }
    @Override
    protected String failedToLoadJbossProperties$str() {
        return "WFLYEE0094: jboss.properties のロードに失敗しました";
    }
    @Override
    protected String unsupportedModuleType$str() {
        return "WFLYEE0095: サポートされない ear モジュールタイプ: %1$s";
    }
    @Override
    protected String rootAsLibraryDirectory$str() {
        return "WFLYEE0096: 値が / の library-directory はサポートされません";
    }
    @Override
    protected String earModuleChildOfLibraryDirectory$str() {
        return "WFLYEE0097: モジュールが EAR の ライブラリディレクトリの子ではない可能性があります。ライブラリディレクトリ: %1$s、モジュールファイル名: %2$s";
    }
    @Override
    protected String managedReferenceWasNull$str() {
        return "WFLYEE0098: ManagedReference が null であり、フィールド %1$s へのインジェクションはオプションではありません";
    }
    @Override
    protected String propertiesNotAllowedOnGlobalModules$str() {
        return "WFLYEE0100: グローバルモジュールは 'annotations'、'meta-inf'、または 'services' を指定できないことがあります。";
    }
    @Override
    protected String concurrentServiceValueUninitialized$str() {
        return "WFLYEE0102: EE 同時サービスの値が初期化解除されました。";
    }
    @Override
    protected String serializationMustBeHandledByTheFactory$str() {
        return "WFLYEE0103: EE 同時 ContextHandle のシリアライズはファクトリーによって処理される必要があります。";
    }
    @Override
    protected String factoryAlreadyExists$str() {
        return "WFLYEE0104: EE 同時コンテキスト %1$s はすでに %2$s という名前のファクトリーを持っています";
    }
    @Override
    protected String factoryNotFound$str() {
        return "WFLYEE0105: EE 同時コンテキスト %1$s は %2$s という名前のファクトリーを持っていません";
    }
    @Override
    protected String concurrentContextServiceNotInstalled$str() {
        return "WFLYEE0106: EE 同時コンテキスト %1$s サービスはインストールされていません。";
    }
    @Override
    protected String transactionSetupProviderServiceNotInstalled$str() {
        return "WFLYEE0107: EE 同時トランザクションセットアッププロバイダーはインストールされていません。";
    }
    @Override
    protected String instanceDataCanOnlyBeSetDuringConstruction$str() {
        return "WFLYEE0108: インスタンスデータは構築中にのみ設定できます";
    }
    @Override
    protected String aroundInvokeAnnotationUsedTooManyTimes$str() {
        return "WFLYEE0109: クラスは複数の AroundInvoke メソッドを宣言してはいけません。%1$s にはアノテーションが付けられたメソッドが %2$s 個あります。";
    }
    @Override
    protected String failedToRunTask$str() {
        return "WFLYEE0110: スケジュールされたタスクの実行に失敗しました: %1$s";
    }
    @Override
    protected String cannotRunScheduledTask$str() {
        return "WFLYEE0111: コンテナが中断されたためスケジュールされたタスク %1$s を実行できません";
    }
    @Override
    protected String invalidCoreThreadsSize$str() {
        return "WFLYEE0112: queue-length が %1$s の場合、core-threads の値は 0 よりも大きくする必要があります";
    }
    @Override
    protected String invalidMaxThreads$str() {
        return "WFLYEE0113: max-threads の値 %1$d は core-threads の値 %2$d よりも大きくする必要があります。";
    }
    @Override
    protected String classDoesNotImplementAllInterfaces$str() {
        return "WFLYEE0114: クラスは提供されたインターフェースの一部を実装しません";
    }
    @Override
    protected String nullName$str() {
        return "WFLYEE0115: %1$s の名前は null です";
    }
    @Override
    protected String nullVar3$str() {
        return "WFLYEE0116: %1$s は %2$s %3$s で null です";
    }
    @Override
    protected String cannotSetField$str() {
        return "WFLYEE0117: フィールド %1$s を設定できません- %3$s によってロードされた %2$s のオブジェクトは %5$s によってロードされた %4$s には割り当てできません";
    }
    @Override
    protected String executorServiceNotFound$str() {
        return "WFLYEE0120: エグゼキューターサービス '%1$s' が見つかりませんでした";
    }
    @Override
    protected String unsupportedExecutorServiceMetric$str() {
        return "WFLYEE0121: 未対応の属性 '%1$s'";
    }
    @Override
    protected String globalDirectoryDoNotExist$str() {
        return "WFLYEE0122: %1$s グローバルディレクトリーリソースのディレクトリーパス %2$s は有効なディレクトリーを参照しません。";
    }
    @Override
    protected String oneGlobalDirectory$str() {
        return "WFLYEE0123: グローバルディレクトリー %1$s はすでに定義されているため、グローバルディレクトリー %2$s を追加できません。";
    }
    @Override
    protected String errorDeletingJACCPolicy$str() {
        return "WFLYEE0124: Jakarta Authorization ポリシーの削除エラー";
    }
    @Override
    protected String unableToStartException$str() {
        return "WFLYEE0125: %1$s サービスを開始できません。";
    }
    @Override
    protected String rejectedDueToMaxRequests$str() {
        return "WFLYEE0126: 要求の最大数によって拒否されました。";
    }
    @Override
    protected String invalidNamePrefix$str() {
        return "WFLYEE0127: env 用の '%1$s' 名のセグメントが無効です。名前は '/' 接頭辞で開始できません。接頭辞は削除されました";
    }
    @Override
    protected String huntTaskTerminationFailure$str() {
        return "WFLYEE0128: %1$s のハングタスク %2$s を終了する際の不具合";
    }
    @Override
    protected String hungTaskCancelled$str() {
        return "WFLYEE0129: %1$s ハングタスク %2$s がキャンセルされました";
    }
    @Override
    protected String hungTaskNotCancelled$str() {
        return "WFLYEE0130: %1$s ハングタスク %2$s はキャンセルされていません";
    }
    @Override
    protected String attributeNoLongerSupported$str() {
        return "WFLYEE0131: %1$s 属性はサポートされなくなりました。";
    }
    @Override
    protected String managedReferenceMethodWasNull$str() {
        return "WFLYEE0132: ManagedReference は null であり、メソッド %1$s の挿入ではインジェクションはオプションではありません。";
    }
    @Override
    protected String duplicateJndiBindingFound$str() {
        return "WFLYEE0133: コンポーネントの JNDI バインディング '%1$s' は、'%2$s' Jakarta EE 仕様に準拠して JNDI 名で既にインストールされています。競合するクラスは %3$s です。ソリューションには、コンポーネントの代替名を指定するか、クラスの名前を変更することが含まれます。";
    }
    @Override
    protected String multipleUsesOfAllRemaining$str() {
        return "WFLYEE0134: ContextServiceDefinition.ALL_REMAINING の複数使用";
    }
    @Override
    protected String failedToResumeTransaction$str() {
        return "WFLYEE0135: トランザクションを再開できませんでした。";
    }
    @Override
    protected String failureWhileRunningTask$str() {
        return "WFLYEE0136: スケジュールされたタスクの実行に失敗しました: %1$s";
    }
    @Override
    protected String errorEqualsCannotBeCalledBeforeResolve$str() {
        return "WFLYEE0137: エラー。equals() を resolve() の前に呼び出すことはできません";
    }
    @Override
    protected String hungTaskTerminationPeriodIsNotBiggerThanZero$str() {
        return "WFLYEE0138: hungTaskTerminationPeriod が 0 より大きくありません";
    }
    @Override
    protected String cannotAddRemotingReceiver$str() {
        return "WFLYEE0139: null/空の送信接続を参照するリモートレシーバーを追加することはできません";
    }
    @Override
    protected String cannotAddHTTPConnection$str() {
        return "WFLYEE0140: null/空の URI を参照する HTTP 接続を追加することはできません";
    }
    @Override
    protected String securityManagerNotAllowed$str() {
        return "WFLYEE0141: SecurityManager が有効な状態で実行することは、Jakarta EE 11 以降の環境では許可されません";
    }
    @Override
    protected String failedToLoadConcurrencyImplementation$str() {
        return "WFLYEE0142: Jakarta Concurrency 実装のロードに失敗しました";
    }
    @Override
    protected String lifecycleOperationNotSupported$str() {
        return "WFLYEE0143: ライフサイクル操作はサポートされていません";
    }
}
