package org.jboss.as.naming.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:42+0200")
public class NamingLogger_$logger_ja extends NamingLogger_$logger implements NamingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public NamingLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String startingService$str() {
        return "WFLYNAM0003: ネーミングサービスを開始しています。";
    }
    @Override
    protected String duplicateBinding$str() {
        return "WFLYNAM0023: '%1$s' の重複した JNDI バインディングには互換性がありません。 [%2$s] != [%3$s]";
    }
    @Override
    protected String threadInterrupt$str() {
        return "WFLYNAM0046: サービス %1$s に対するサービス参照を取得中にスレッドが中断されました。";
    }
    @Override
    protected String notAnInstanceOfObjectFactory$str() {
        return "WFLYNAM0055: モジュール %2$s のクラス %1$s は ObjectFactory のインスタンスではありません";
    }
    @Override
    protected String entryNotRegistered$str() {
        return "WFLYNAM0025: jndi エントリ '%1$s' はコンテキスト '%2$s' に登録されていません。";
    }
    @Override
    protected String failedToDestroyRootContext$str() {
        return "WFLYNAM0026: ルートコンテキストの破棄に失敗しました。";
    }
    @Override
    protected String cannotDeferenceObject$str() {
        return "WFLYNAM0016: オブジェクトの参照を解除できませんでした。";
    }
    @Override
    protected String tableIsFull$str() {
        return "WFLYNAM0045: テーブルは満杯です";
    }
    @Override
    protected String moduleNotFound$str() {
        return "WFLYNAM0065: モジュール %1$s をロードできませんでした - モジュールまたは依存関係の 1 つが不足しています [%2$s]";
    }
    @Override
    protected String cannotResolveService1$str() {
        return "WFLYNAM0020: サービス %1$s を解決できませんでした。";
    }
    @Override
    protected String jndiViewNotAvailable$str() {
        return "WFLYNAM0038: ランタイムモードでのみ jndi ビューを利用できます。";
    }
    @Override
    protected String serviceAlreadyBound$str() {
        return "WFLYNAM0044: [%1$s] という名前のサービスはすでにバインドされています。";
    }
    @Override
    protected String failedToInstantiate$str() {
        return "WFLYNAM0027: クラスローダー %3$s から %1$s %2$s のインスタンス化に失敗しました。";
    }
    @Override
    protected String couldNotLoadClassFromModule$str() {
        return "WFLYNAM0053: クラス %1$s をモジュール %2$s からロードできませんでした";
    }
    @Override
    protected String cannotRebindExternalContext$str() {
        return "WFLYNAM0064: 外部コンテキストルックアップを再バインドできません";
    }
    @Override
    protected String illegalContextInName$str() {
        return "WFLYNAM0030: 名前内の不正なコンテキスト: %1$s";
    }
    @Override
    protected String failedToStopRemoteNamingService$str() {
        return "WFLYNAM0067: リモートネーミングサービスを停止できませんでした";
    }
    @Override
    protected String unsupportedSimpleBindingType$str() {
        return "WFLYNAM0050: サポートされない単純なバインディングタイプ %1$s";
    }
    @Override
    protected String cannotResolveServiceBug$str() {
        return "WFLYNAM0022: ファクトリー %2$s で %1$s へのサービス参照を解決できませんでした。これはServiceReferenceObjectFactory のバグです。ステータスは %3$s です。";
    }
    @Override
    protected String invalidJndiName$str() {
        return "WFLYNAM0033: 有効な JNDI 名を提供してください: %1$s";
    }
    @Override
    protected String invalidLoadFactor$str() {
        return "WFLYNAM0034: 負荷係数は 0 より大きく1 以下でなければなりません。";
    }
    @Override
    protected String invalidNameForContextBinding$str() {
        return "WFLYNAM0047: コンテキストバインディング %1$s に対する無効な名前";
    }
    @Override
    protected String emptyNameNotAllowed$str() {
        return "WFLYNAM0024: 名前を空にすることはできません。";
    }
    @Override
    protected String resourceLookupForInjectionFailed$str() {
        return "WFLYNAM0059: インジェクションのリソースルックアップに失敗しました: %1$s";
    }
    @Override
    protected String bindingTypeRequiresAttributeDefined$str() {
        return "WFLYNAM0060: タイプ %1$s をバインドするには、%2$s という属性が定義されている必要があります。";
    }
    @Override
    protected String failedToReadContextEntries$str() {
        return "WFLYNAM0028: %1$s コンテキストエントリの読み込みに失敗しました。";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYNAM0001: ネーミングサブシステムを有効にしています。";
    }
    @Override
    protected String couldNotInstantiateClassInstanceFromModule$str() {
        return "WFLYNAM0054: クラス %1$s のインスタンスをモジュール %2$s からインスタンス化できませんでした";
    }
    @Override
    protected String failedToLookupJndiViewValue$str() {
        return "WFLYNAM0013: エントリー %1$s の jndi ビュー値を取得できませんでした";
    }
    @Override
    protected String cannotListNonContextBinding$str() {
        return "WFLYNAM0017: コンテキストバインディング以外のものをリストすることができません。";
    }
    @Override
    protected String cannotLookupLink$str() {
        return "WFLYNAM0018: リンクをルックアップできませんでした。";
    }
    @Override
    protected String invalidPermissionAction$str() {
        return "WFLYNAM0036: 無効なパーミッション。不明なアクション: %1$s";
    }
    @Override
    protected String couldNotLoadModule$str() {
        return "WFLYNAM0052: モジュール [%1$s] をロードできませんでした。";
    }
    @Override
    protected String cannotAddToReadOnlyPermissionCollection$str() {
        return "WFLYNAM0014: readonly PermissionCollection に Permission を追加しようとしています。";
    }
    @Override
    protected String unableToTransformURLBindingValue$str() {
        return "WFLYNAM0051: URL バインディング値 %1$s を変換できません";
    }
    @Override
    protected String invalidTableSize$str() {
        return "WFLYNAM0037: テーブルのサイズは負の値を持てません。";
    }
    @Override
    protected String failedToStartRemoteNamingService$str() {
        return "WFLYNAM0066: リモートネーミングサービスを起動できませんでした";
    }
    @Override
    protected String invalidContextReference$str() {
        return "WFLYNAM0032: 無効なコンテキスト参照。 '%1$s' 参照ではありません。";
    }
    @Override
    protected String cacheNotValidForBindingType$str() {
        return "WFLYNAM0061: バインディングタイプ %1$s は 'cache' 属性を取得できません";
    }
    @Override
    protected String nameNotFoundInContext$str() {
        return "WFLYNAM0039: '%2$s' コンテキストで名前 '%1$s' が見つかりません。";
    }
    @Override
    protected String cannotResolveService3$str() {
        return "WFLYNAM0021: ファクトリー %2$s の %1$s へのサービス参照を解決できませんでした。サービスは %3$s の状態です。";
    }
    @Override
    protected String readOnlyNamingContext$str() {
        return "WFLYNAM0043: ネーミングコンテキストは読み取り専用です。";
    }
    @Override
    protected String invalidPermission$str() {
        return "WFLYNAM0035: 無効なパーミッション。不明なアクション: %1$s";
    }
    @Override
    protected String objectFactoryCreationFailure$str() {
        return "WFLYNAM0042: クラスローダーからオブジェクトファクトリの作成に失敗しました。";
    }
    @Override
    protected String unknownBindingType$str() {
        return "WFLYNAM0049: 不明なバインディングタイプ %1$s";
    }
    @Override
    protected String cannotBeNull$str() {
        return "WFLYNAM0015: %1$s は null を取ることができません。";
    }
    @Override
    protected String failedToStart$str() {
        return "WFLYNAM0029: %1$s の開始に失敗しました。";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYNAM0063: %1$s サービスは開始されていません。";
    }
    @Override
    protected String failedToReleaseBinderService$str() {
        return "WFLYNAM0012: バインダーサービスをリリースできませんでした (ランタイムで作成された JNDI バインディングに使用されています)";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYNAM0041: %1$s が null です";
    }
    @Override
    protected String failedToSet$str() {
        return "WFLYNAM0002: %1$s の設定に失敗しました。";
    }
    @Override
    protected String invalidNamespaceForBinding$str() {
        return "WFLYNAM0048: 無効なバインディング名 %1$s。名前は %2$s の 1 つで始まる必要があります。";
    }
    @Override
    protected String lookupError$str() {
        return "WFLYNAM0062: %1$s のルックアップに失敗しました";
    }
}
