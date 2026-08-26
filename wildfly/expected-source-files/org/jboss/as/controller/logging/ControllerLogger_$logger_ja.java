package org.jboss.as.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:04+0200")
public class ControllerLogger_$logger_ja extends ControllerLogger_$logger implements ControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ControllerLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotResolveAddress$str() {
        return "WFLYCTL0001: アドレス %1$s を解決できないため、どの InetAddress とも一致しません。";
    }
    @Override
    protected String errorBootingContainer0$str() {
        return "WFLYCTL0002: コンテナーの起動エラー";
    }
    @Override
    protected String errorBootingContainer2$str() {
        return "WFLYCTL0003: 起動操作を実行するのに利用するスレッドに十分なスタックスペースがないため、コンテナーのブートエラーが発生しました。このスレッドは、[%1$d] というスタックサイズで設定されていました。システムプロパティー %2$s を [%1$d ]よりも大きい値に設定し、この問題を解決してみてください。";
    }
    @Override
    protected String errorRevertingOperation$str() {
        return "WFLYCTL0004: %1$s はアドレス %3$s で操作 %2$s を元に戻そうとしている途中で例外を検出しました";
    }
    @Override
    protected String failedExecutingOperation$str() {
        return "WFLYCTL0005: アドレス %2$s で操作 %1$s の実行に失敗しました。";
    }
    @Override
    protected String failedSubsystemBootOperations$str() {
        return "WFLYCTL0006: サブシステム %1$s のブート操作を実行できませんでした。";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYCTL0007: リソース %1$s を終了することができませんでした。";
    }
    @Override
    protected String failedToPersistConfigurationChange0$str() {
        return "WFLYCTL0008: 設定の変更を永続化できませんでした。";
    }
    @Override
    protected String failedToStoreConfiguration$str() {
        return "WFLYCTL0009: %1$s に設定を保存できませんでした";
    }
    @Override
    protected String invalidSystemPropertyValue$str() {
        return "WFLYCTL0010: システムプロパティー %2$s の値 %1$s は無効です。-- デフォルト値 [%3$d] を利用します。";
    }
    @Override
    protected String invalidWildcardAddress$str() {
        return "WFLYCTL0011: アドレス %1$s はワイルドカードアドレスで、特定のアドレスとは一致しません。インターフェイスはワイルドカードアドレスを使用する必要があると指定するために '%2$s' 設定要素を使用しないでください。代わりに '%3$s' を使用してください。";
    }
    @Override
    protected String operationFailed2$str() {
        return "WFLYCTL0013: 操作 (%1$s) の失敗 - アドレス: (%2$s)";
    }
    @Override
    protected String operationFailed3$str() {
        return "WFLYCTL0013: 操作 (%1$s) の失敗 - アドレス: (%2$s) - 問題の詳細: %3$s";
    }
    @Override
    protected String operationFailed4$str() {
        return "WFLYCTL0013: 操作 (%1$s) の失敗 - アドレス: (%2$s) - 問題の詳細: %3$s%4$s";
    }
    @Override
    protected String wildcardAddressDetected$str() {
        return "WFLYCTL0015: ワイルドカードのアドレスが検出されました。他のインターフェイス基準は無視します。";
    }
    @Override
    protected String noFinalProxyOutcomeReceived$str() {
        return "WFLYCTL0016: アドレス %3$s でのリモートプロセスから、アドレス %2$s の操作 %1$s に対する最終結果のレスポンスを受け取れませんでした。この操作の結果には、リクエストに対するリモートプロセスの事前レスポンスのみが含まれます。";
    }
    @Override
    protected String operationFailedOnClientError$str() {
        return "WFLYCTL0017: 操作 (%1$s) の失敗 - アドレス: (%2$s) - 問題の詳細: %3$s";
    }
    @Override
    protected String gracefulManagementChannelHandlerShutdownTimedOut$str() {
        return "WFLYCTL0019: ネイティブ管理リクエストに利用したハンドラーの正常シャットダウンは [%1$d] ミリ秒以内に完了しませんでしたが、基盤の通信チャネルのシャットダウン処理は進行中です。";
    }
    @Override
    protected String gracefulManagementChannelHandlerShutdownFailed$str() {
        return "WFLYCTL0020: ネーティブ管理リクエストに利用したハンドラーのグレースフルシャットダウンに失敗しましたが、基盤の通信チャネルのシャットダウン処理は進められています。";
    }
    @Override
    protected String invalidChannelCloseTimeout$str() {
        return "WFLYCTL0021: システムプロパティー '%2$s' の無効な値 '%1$s' -- 値は int に変換できなければなりません。";
    }
    @Override
    protected String multipleMatchingAddresses5$str() {
        return "WFLYCTL0022: 複数のアドレスあるいはネットワークインターフェイスがインターフェイス '%1$s' の選択基準と一致しました。一致したアドレス: %2$s。一致したネットワークインターフェイス: %3$s。インターフェイスはアドレス %4$s とネットワークインターフェイス %5$s を使います。";
    }
    @Override
    protected String multipleMatchingAddresses3$str() {
        return "WFLYCTL0023: このマシン上で利用可能なアドレスあるいはネットワークアドレスが複数一致しているため、インターフェイス選択基準 'inet-address' の値 '%1$s' は不明です。これが理由で一致するアドレスは選択されていません。一致したアドレス: %2$s。一致したネットワークインターフェイス：%3$s。";
    }
    @Override
    protected String cannotReadTargetDefinition$str() {
        return "WFLYCTL0024: ターゲットの定義を読み取りできませんでした。";
    }
    @Override
    protected String interruptedWaitingStability$str() {
        return "WFLYCTL0027: サービスコンテナーが安定する前に操作が中断されました。プロセスが再起動する必要があります。サービスコンテナーを最初に更新したステップはアドレス '%1$s' の '%2$s' でした。";
    }
    @Override
    protected String attributeDeprecated$str() {
        return "WFLYCTL0028: アドレス '%2$s' にあるリソースの '%1$s' は非推奨となり、今後のバージョンで削除される可能性があります。read-resource-description 操作で出力される属性の説明を読み、非推奨に関する詳細を確認してください。";
    }
    @Override
    protected String cannotDeleteTempFile$str() {
        return "WFLYCTL0029: 一時ファイル %1$s は削除できません。終了時に削除されます。";
    }
    @Override
    protected String noSuchResourceType$str() {
        return "WFLYCTL0030: アドレス %1$s に対して登録されたリソース定義はありません";
    }
    @Override
    protected String noHandlerForOperation$str() {
        return "WFLYCTL0031: アドレス %2$s に '%1$s' という名前の操作は存在しません。";
    }
    @Override
    protected String transformationWarnings$str() {
        return "WFLYCTL0032: ターゲットホストのトランスフォーメーション処理中に問題がありました: '%1$s' %nの問題が見つかりました: %n%2$s";
    }
    @Override
    protected String extensionDeprecated$str() {
        return "WFLYCTL0033: 拡張子 '%1$s' は非推奨となり、今後のバージョンでサポートされない可能性があります。";
    }
    @Override
    protected String ignoringUnsupportedLegacyExtension$str() {
        return "WFLYCTL0034: レガシー拡張 '%2$s' によって提供されるサブシステム %1$s は、本バージョンを実行しているサーバーではサポートされません。この拡張は、混合バージョンの管理対象ドメインで、以前のリリースを実行しているホストが使用する場合のみサポートされます。このサーバーでは、拡張がサブシステムを登録しないため、このサーバー上ではサブシステムリソースの作成またはアドレス指定に失敗します。";
    }
    @Override
    protected String failedToUpdateAuditLog$str() {
        return "WFLYCTL0035: 管理操作監査ログの更新に失敗しました";
    }
    @Override
    protected String disablingLoggingDueToFailures$str() {
        return "WFLYCTL0036: 管理操作の監査ロギングに [%1$d] 回続けて失敗しました。監査ロギングを無効にします。";
    }
    @Override
    protected String logHandlerWriteFailed$str() {
        return "WFLYCTL0037: ハンドラー '%1$s' で管理操作監査ログの更新に失敗しました";
    }
    @Override
    protected String disablingLogHandlerDueToFailures$str() {
        return "WFLYCTL0038: ハンドラー '%1$d' での管理操作の監査ロギングに [%2$s] 回続けて失敗しました。このハンドラーの監査ロギングを無効にします。";
    }
    @Override
    protected String alreadyDefined$str() {
        return "WFLYCTL0039: %1$s はすでに定義されています。";
    }
    @Override
    protected String alreadyDeclared4$str() {
        return "WFLYCTL0041: 宣言済みの %1$s %2$s は %3$s %4$s にてすでに宣言されています。";
    }
    @Override
    protected String alreadyDeclared5$str() {
        return "WFLYCTL0042: %1$s または宣言済みの %2$s %3$s はすでに %4$s %5$s で宣言されています。";
    }
    @Override
    protected String alreadyRegistered$str() {
        return "WFLYCTL0043: '%2$s' という名前の %1$s は場所 '%3$s' にすでに登録されています。";
    }
    @Override
    protected String ambiguousConfigurationFiles$str() {
        return "WFLYCTL0044: %2$s に %3$s で終わるファイルが複数存在するため、設定ファイル名 '%1$s' はあいまいです。";
    }
    @Override
    protected String ambiguousName$str() {
        return "WFLYCTL0045: %2$s の名前 '%1$s' はあいまいです: %3$s";
    }
    @Override
    protected String attributeNotWritable$str() {
        return "WFLYCTL0048: 属性 %1$s は書き込みできません。";
    }
    @Override
    protected String cannotDetermineDefaultName$str() {
        return "WFLYCTL0050: ローカルホスト名をベースにデフォルト名を判断できません";
    }
    @Override
    protected String cannotCreate$str() {
        return "WFLYCTL0051: %1$s を作成できませんでした";
    }
    @Override
    protected String cannotDelete$str() {
        return "WFLYCTL0052: %1$s を削除できませんでした";
    }
    @Override
    protected String cannotRegisterSubmodelWithNullPath$str() {
        return "WFLYCTL0053: PathElement が null の場合、サブモデルの登録はできません";
    }
    @Override
    protected String cannotRemove$str() {
        return "WFLYCTL0055: %1$s を削除できません";
    }
    @Override
    protected String cannotRename$str() {
        return "WFLYCTL0056: %1$s の名前を %2$s に変更できませんでした";
    }
    @Override
    protected String cannotWriteTo$str() {
        return "WFLYCTL0057: %1$s へ書き込みできません";
    }
    @Override
    protected String childAlreadyDeclared$str() {
        return "WFLYCTL0058: 要素 %2$s の子 %1$s はすでに宣言されています";
    }
    @Override
    protected String canonicalBootFileNotFound$str() {
        return "WFLYCTL0059: ブートファイル用に正規ファイルを取得できませんでした: %1$s";
    }
    @Override
    protected String canonicalMainFileNotFound$str() {
        return "WFLYCTL0060: メインファイル用に正規ファイルを取得できませんでした: %1$s";
    }
    @Override
    protected String compositeOperationFailed$str() {
        return "WFLYCTL0062: 複合演算が失敗しロールバックされました。失敗した操作:";
    }
    @Override
    protected String compositeOperationRolledBack$str() {
        return "WFLYCTL0063: 複合演算がロールバックされました";
    }
    @Override
    protected String configurationFileNameNotAllowed$str() {
        return "WFLYCTL0064: 完全名が %1$s の設定ファイルは利用できません";
    }
    @Override
    protected String configurationFileNotFound$str() {
        return "WFLYCTL0065: %2$s には %1$s で終わる設定ファイルはありません";
    }
    @Override
    protected String directoryNotFound$str() {
        return "WFLYCTL0066: ディレクトリー %1$s は見つかりませんでした。";
    }
    @Override
    protected String domainControllerMustBeDeclared$str() {
        return "WFLYCTL0067: %1$s あるいは %2$s ドメインのコントローラー設定のいずれかを宣言してください。";
    }
    @Override
    protected String duplicateAttribute$str() {
        return "WFLYCTL0068: '%1$s ' という名前の属性がすでに宣言されています";
    }
    @Override
    protected String duplicateDeclaration1$str() {
        return "WFLYCTL0069: %1$s 宣言が重複しています";
    }
    @Override
    protected String duplicateDeclaration2$str() {
        return "WFLYCTL0070: %1$s 宣言が重複しています %2$s";
    }
    @Override
    protected String duplicateElement$str() {
        return "WFLYCTL0071: 重複したパス要素 '%1$s' が見つかりました";
    }
    @Override
    protected String duplicateInterfaceDeclaration$str() {
        return "WFLYCTL0072: インターフェイス宣言が重複しています";
    }
    @Override
    protected String duplicateNamedElement$str() {
        return "WFLYCTL0073: '%1$s' という名前のこの型の要素はすでに宣言されています";
    }
    @Override
    protected String duplicateResource$str() {
        return "WFLYCTL0075: リソース %1$s が重複しています";
    }
    @Override
    protected String duplicateResourceType$str() {
        return "WFLYCTL0076: リソース型 %1$s が重複しています";
    }
    @Override
    protected String failedInitializingModule$str() {
        return "WFLYCTL0079: モジュール %1$s の初期化に失敗しました";
    }
    @Override
    protected String failedServices$str() {
        return "WFLYCTL0080: サービスに問題がありました";
    }
    @Override
    protected String failedToBackup$str() {
        return "WFLYCTL0081: %1$s のバックアップに失敗しました";
    }
    @Override
    protected String failedToCreateConfigurationBackup$str() {
        return "WFLYCTL0082: 設定ファイル %1$s のバックアップコピーの作成に失敗しました";
    }
    @Override
    protected String failedToLoadModule0$str() {
        return "WFLYCTL0083: モジュールのロードに失敗しました";
    }
    @Override
    protected String failedToLoadModule1$str() {
        return "WFLYCTL0083: モジュール '%1$s' のロードに失敗しました。";
    }
    @Override
    protected String failedToMarshalConfiguration$str() {
        return "WFLYCTL0084: 設定のマーシャリングに失敗しました";
    }
    @Override
    protected String failedToParseConfiguration$str() {
        return "WFLYCTL0085: 設定の解析に失敗しました";
    }
    @Override
    protected String failedToPersistConfigurationChange1$str() {
        return "WFLYCTL0086: 設定の変更を永続化できませんでした: %1$s";
    }
    @Override
    protected String failedToTakeSnapshot$str() {
        return "WFLYCTL0088: %1$s のスナップショットを %2$s に取ることができませんでした";
    }
    @Override
    protected String failedToWriteConfiguration$str() {
        return "WFLYCTL0089: 設定の書き込みに失敗しました";
    }
    @Override
    protected String fileNotFound$str() {
        return "WFLYCTL0090: %1$s は存在しません";
    }
    @Override
    protected String fileNotFoundWithPrefix$str() {
        return "WFLYCTL0091: %2$s に '%1$s' で始まるファイルは存在しません";
    }
    @Override
    protected String fullServerBootRequired$str() {
        return "WFLYCTL0092: %1$s はサーバーが起動している場合以外で利用できません";
    }
    @Override
    protected String illegalInterfaceCriteria$str() {
        return "WFLYCTL0094: 不正なインターフェイス基準型 %1$s; %2$s でなければなりません";
    }
    @Override
    protected String illegalValueForInterfaceCriteria$str() {
        return "WFLYCTL0095: インターフェイス基準 %2$s に対し不正な値 %1$s; %3$s でなければなりません";
    }
    @Override
    protected String immutableResource$str() {
        return "WFLYCTL0096: リソースは変更できません";
    }
    @Override
    protected String incorrectType$str() {
        return "WFLYCTL0097: %1$s に対してタイプは不正です。%2$s が必要でしたが、%3$s でした";
    }
    @Override
    protected String invalid1$str() {
        return "WFLYCTL0099: %1$s は無効です";
    }
    @Override
    protected String invalid2$str() {
        return "WFLYCTL0100: %1$d は有効な %2$s ではありません";
    }
    @Override
    protected String invalidAddress$str() {
        return "WFLYCTL0101: 無効なアドレス %1$s (%2$s)";
    }
    @Override
    protected String invalidAddressMaskValue$str() {
        return "WFLYCTL0102: 無効な 'value' %1$s -- アドレス/マスクの形式でなければなりません";
    }
    @Override
    protected String invalidAddressMask$str() {
        return "WFLYCTL0103: 無効なマスク %1$s (%2$s)";
    }
    @Override
    protected String invalidAddressValue$str() {
        return "WFLYCTL0104: 無効なアドレス %1$s (%2$s)";
    }
    @Override
    protected String invalidAttributeCombo$str() {
        return "WFLYCTL0105: %2$s との組み合わせで、%1$s は無効です";
    }
    @Override
    protected String invalidAttributeValue2$str() {
        return "WFLYCTL0106: 属性 '%2$s' の無効な値 '%1$s'";
    }
    @Override
    protected String invalidInterfaceCriteriaPattern$str() {
        return "WFLYCTL0109: インターフェイス基準 %2$s の無効なパターン %1$s";
    }
    @Override
    protected String invalidPathElementKey$str() {
        return "WFLYCTL0110: 無効なソースアドレス要素 '%1$s'。キー '%2$s' はリソースアドレスの要素に対して有効ではありません。";
    }
    @Override
    protected String invalidLoadFactor$str() {
        return "WFLYCTL0111: 負荷係数は 0 より大きく1 以下でなければなりません。";
    }
    @Override
    protected String invalidMaxLength$str() {
        return "WFLYCTL0112: '%1$s' はパラメーター %2$s に対して無効な値です。値の長さは最大で %3$d 文字です";
    }
    @Override
    protected String invalidMinLength$str() {
        return "WFLYCTL0113: '%1$s' はパラメーター %2$s に対して無効な値です。値の長さは最小で %3$d 文字です";
    }
    @Override
    protected String invalidMaxSize$str() {
        return "WFLYCTL0114: [%1$d] はパラメーター %2$s に対して無効なサイズです。長さは最大で [%3$d] です";
    }
    @Override
    protected String invalidMinSize$str() {
        return "WFLYCTL0115: [%1$d] はパラメーター %2$s に対して無効なサイズです。長さは最小で [%3$d] です";
    }
    @Override
    protected String invalidMaxValue$str() {
        return "WFLYCTL0116: %1$d はパラメーター %2$s に対して無効な値です。最大値は %3$d です";
    }
    @Override
    protected String invalidMinValue$str() {
        return "WFLYCTL0117: %1$d はパラメーター %2$s に対して無効な値です。最小値は %3$d です";
    }
    @Override
    protected String invalidModificationAfterCompletedStep$str() {
        return "WFLYCTL0118: ステップ完了後の操作は無効です";
    }
    @Override
    protected String invalidMulticastAddress$str() {
        return "WFLYCTL0119: 属性 %2$s の値 %1$s は有効なマルチキャストアドレスではありません";
    }
    @Override
    protected String invalidOutboundSocketBinding$str() {
        return "WFLYCTL0120: アウトバウンドソケットバインディング: %1$s は同時に %2$s と %3$s を持つことができません";
    }
    @Override
    protected String invalidParameterValue$str() {
        return "WFLYCTL0121: %1$s はパラメーター %2$s に対して有効な値ではありません -- %3$s の１つでなければなりません";
    }
    @Override
    protected String invalidSha1Value$str() {
        return "WFLYCTL0122: 属性 %2$s の値 %1$s は正しく hex エンコードされた SHA1 ハッシュではありません";
    }
    @Override
    protected String invalidStage$str() {
        return "WFLYCTL0123: ステージ %1$s はコンテキストプロセスタイプ %2$s に対して有効ではありません";
    }
    @Override
    protected String invalidStepStage$str() {
        return "WFLYCTL0124: 指定されたステップステージは無効です";
    }
    @Override
    protected String invalidTableSize$str() {
        return "WFLYCTL0126: テーブルのサイズは負の値を持てません。";
    }
    @Override
    protected String invalidType$str() {
        return "WFLYCTL0127: 無効な型 %1$s";
    }
    @Override
    protected String invalidPathElementValue$str() {
        return "WFLYCTL0128: 無効なソースアドレス要素 '%1$s'。値 '%2$s' はリソースアドレスの要素に対して有効ではありません。文字 '%3$s' は使用できません。";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYCTL0129: %2$s に対する無効な値 %1$s; 有効な値は %3$s";
    }
    @Override
    protected String missingOneOf$str() {
        return "WFLYCTL0132: 以下の要素の1 つを含むようにしてください: %1$s";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYCTL0133: 必須属性がありません: %1$s";
    }
    @Override
    protected String missingRequiredElements$str() {
        return "WFLYCTL0134: 必須要素がありません: %1$s";
    }
    @Override
    protected String moduleLoadingInterrupted$str() {
        return "WFLYCTL0135: モジュール %1$s のローディング待機が中断されました";
    }
    @Override
    protected String moduleInitializationInterrupted$str() {
        return "WFLYCTL0136: モジュール %1$s の初期化の待機が中断されました";
    }
    @Override
    protected String multipleModelNodes$str() {
        return "WFLYCTL0137: モデルには複数の %1$s ノードが含まれています";
    }
    @Override
    protected String namespaceAlreadyRegistered$str() {
        return "WFLYCTL0138: 接頭辞が %1$s の名前空間はスキーマ URI %2$s ですでに登録されています";
    }
    @Override
    protected String namespaceNotFound$str() {
        return "WFLYCTL0139: URI %1$s の名前空間が見つかりません";
    }
    @Override
    protected String nestedElementNotAllowed$str() {
        return "WFLYCTL0140: ネストされた %1$s は利用できません";
    }
    @Override
    protected String noActiveStep$str() {
        return "WFLYCTL0144: 有効なステップがありません";
    }
    @Override
    protected String noChildType$str() {
        return "WFLYCTL0147: 子の型 %1$s がありません";
    }
    @Override
    protected String noInterfaceCriteria$str() {
        return "WFLYCTL0149: インターフェイスの基準が提示されていません";
    }
    @Override
    protected String noOperationHandler0$str() {
        return "WFLYCTL0150: オペレーションハンドラーがありません";
    }
    @Override
    protected String notADirectory$str() {
        return "WFLYCTL0152: %1$s はディレクトリーではありません。";
    }
    @Override
    protected String notFound$str() {
        return "WFLYCTL0153: %3$s に対して %1$s%2$s は見つかりませんでした";
    }
    @Override
    protected String nullAsynchronousExecutor$str() {
        return "WFLYCTL0154: エグゼキューターなしに非同期演算を実行できません";
    }
    @Override
    protected String nullNotAllowed$str() {
        return "WFLYCTL0155: %1$s は null を取ることができません";
    }
    @Override
    protected String operation$str() {
        return "操作 %1$s";
    }
    @Override
    protected String operationAlreadyComplete$str() {
        return "WFLYCTL0157: 操作はすでに完了しています";
    }
    @Override
    protected String operationHandlerFailed$str() {
        return "WFLYCTL0158: オペレーションハンドラーに問題が発生しました: %1$s";
    }
    @Override
    protected String operationRollingBack$str() {
        return "WFLYCTL0160: ロールバックの操作";
    }
    @Override
    protected String operationSucceeded$str() {
        return "WFLYCTL0161: 操作は成功しました、コミットしています";
    }
    @Override
    protected String operationNotRegistered$str() {
        return "WFLYCTL0162: アドレス %2$s で登録されている操作 %1$s はありません";
    }
    @Override
    protected String persisterNotInjected$str() {
        return "WFLYCTL0165: インジェクトされた Configuration Persister はありませんでした";
    }
    @Override
    protected String proxyHandlerAlreadyRegistered$str() {
        return "WFLYCTL0169: プロキシハンドラーはすでに場所 '%1$s' で登録されています";
    }
    @Override
    protected String removingServiceUnsatisfiedDependencies0$str() {
        return "WFLYCTL0171: サービスを削除したため、依存関係が満たされなくなっています:";
    }
    @Override
    protected String removingServiceUnsatisfiedDependencies1$str() {
        return "%nサービス %1$s の依存元 ";
    }
    @Override
    protected String required$str() {
        return "WFLYCTL0172: %1$s が必要です";
    }
    @Override
    protected String reserved$str() {
        return "WFLYCTL0173: %1$s が確保されています";
    }
    @Override
    protected String resourceNotFound$str() {
        return "WFLYCTL0175: リソース %1$s は存在しません。アドレス %2$s のリソースは、祖先となるすべてのリソースが追加されるまで作成できません。";
    }
    @Override
    protected String rollbackAlreadyInvoked$str() {
        return "WFLYCTL0176: rollback() はすでに呼び出されています";
    }
    @Override
    protected String schemaAlreadyRegistered$str() {
        return "WFLYCTL0177: URI %1$s を持つスキーマはすでに場所 %2$s で登録されています";
    }
    @Override
    protected String schemaNotFound$str() {
        return "WFLYCTL0178: URI %1$s を持つスキーマロケーションが見つかりませんでした";
    }
    @Override
    protected String serviceInstallCancelled$str() {
        return "WFLYCTL0179: サービスのインストールがキャンセルされました";
    }
    @Override
    protected String servicesMissing$str() {
        return "[%1$s] がありません";
    }
    @Override
    protected String servicesMissingDependencies$str() {
        return "WFLYCTL0180: 依存関係がないか、利用できないサービス";
    }
    @Override
    protected String serviceRegistryRuntimeOperationsOnly$str() {
        return "WFLYCTL0181: サービスレジストリの取得はランタイム操作でのみ対応しています";
    }
    @Override
    protected String serviceRemovalRuntimeOperationsOnly$str() {
        return "WFLYCTL0182: サービスの削除はランタイム操作でのみ対応しています";
    }
    @Override
    protected String serviceStatusReportHeader$str() {
        return "WFLYCTL0183: サービスステータスレポート %n";
    }
    @Override
    protected String serviceStatusReportDependencies$str() {
        return "WFLYCTL0184: 新しい不足している/満足しない依存関係: %n";
    }
    @Override
    protected String serviceStatusReportMissing$str() {
        return "%1$s (不足している) 依存元: %2$s %n";
    }
    @Override
    protected String serviceStatusReportCorrected$str() {
        return "WFLYCTL0185: 新たに修正されたサービス:%n";
    }
    @Override
    protected String serviceStatusReportNoLongerRequired$str() {
        return "%1$s (必要なし)%n";
    }
    @Override
    protected String serviceStatusReportAvailable$str() {
        return "%1$s (新たに利用可能)%n";
    }
    @Override
    protected String serviceStatusReportFailed$str() {
        return "WFLYCTL0186: 開始に失敗したサービス:";
    }
    @Override
    protected String serviceTargetRuntimeOperationsOnly$str() {
        return "WFLYCTL0187: サービス対象の取得はランタイム操作でのみ対応しています";
    }
    @Override
    protected String stageAlreadyComplete$str() {
        return "WFLYCTL0188: ステージ %1$s はすでに完了しています";
    }
    @Override
    protected String stepHandlerFailed$str() {
        return "WFLYCTL0190: アドレス %3$s での操作 %2$s のステップハンドラー %1$s は失敗しました -- %4$s";
    }
    @Override
    protected String subsystemBootInterrupted$str() {
        return "WFLYCTL0191: サブシステムのブート操作実行の待機中に中断されました";
    }
    @Override
    protected String subsystemBootOperationFailed$str() {
        return "WFLYCTL0192: サブシステム %1$s のブート操作が説明なしに失敗しました";
    }
    @Override
    protected String subsystemBootOperationFailedExecuting$str() {
        return "WFLYCTL0193: サブシステム %1$s のブート操作を実行できませんでした。";
    }
    @Override
    protected String tableIsFull$str() {
        return "WFLYCTL0194: テーブルは満杯です";
    }
    @Override
    protected String transactionInterrupted$str() {
        return "WFLYCTL0195: トランザクションのコミットあるいはロールバックの待機が中断されました";
    }
    @Override
    protected String unexpectedAttribute1$str() {
        return "WFLYCTL0197: 予期せぬ属性 '%1$s' が見つかりました";
    }
    @Override
    protected String unexpectedElement1$str() {
        return "WFLYCTL0198: 予期せぬ要素 '%1$s' が見つかりました";
    }
    @Override
    protected String unexpectedEndElement$str() {
        return "WFLYCTL0199: 要素 '%1$s' が予期せず終了しました";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYCTL0201: 不明な属性 '%1$s'";
    }
    @Override
    protected String unknownChildType$str() {
        return "WFLYCTL0202: %1$s という名前の子の型で既知のものはありません";
    }
    @Override
    protected String unknownCriteriaInterfaceProperty$str() {
        return "WFLYCTL0203: インターフェイス基準一覧にある不明な型: %1$s";
    }
    @Override
    protected String unknownCriteriaInterfaceType$str() {
        return "WFLYCTL0204: 不明なインターフェイス基準型 %1$s";
    }
    @Override
    protected String unknownInterface$str() {
        return "WFLYCTL0205: 不明なインターフェイス %1$s %2$s は要素 %3$s で宣言する必要があります";
    }
    @Override
    protected String unknownValueForElement$str() {
        return "WFLYCTL0206: 不明な %1$s %2$s %3$s は要素 %4$s で宣言する必要があります";
    }
    @Override
    protected String validationFailed$str() {
        return "WFLYCTL0207: %1$s の検証に失敗しました";
    }
    @Override
    protected String andNMore$str() {
        return "WFLYCTL0208: あと %1$s です";
    }
    @Override
    protected String invalidAttributeValue3$str() {
        return "WFLYCTL0209: 属性 '%2$s' に対する無効な値 '%1$s' -- 有効な値は %3$s";
    }
    @Override
    protected String noPermissionToResolveExpression$str() {
        return "WFLYCTL0210: 式 '%1$s' の解決試行中に SecurityException を検出しました。-- %2$s";
    }
    @Override
    protected String cannotResolveExpression$str() {
        return "WFLYCTL0211: 式 '%1$s' を解決できません";
    }
    @Override
    protected String duplicateResourceAddress$str() {
        return "WFLYCTL0212: リソース %1$s が重複しています";
    }
    @Override
    protected String mainFileNotFound$str() {
        return "WFLYCTL0214: 設定ファイルをロードできません: %1$s。設定ファイルの引数は、設定ディレクトリーにあるファイルへのパスを指定する必要があります。パスは相対パスで、設定ディレクトリー %2$s への相対パスである必要があります。";
    }
    @Override
    protected String absolutePathMainFileNotFound$str() {
        return "WFLYCTL0215: 設定ファイルをロードできません: %1$s。設定ファイルの因数は、1) 既存ファイルへの絶対パス、2) 既存ファイルへの相対パスで現在の作業ディレクトリーへの相対パス、3) 設定ディレクトリーにあるファイルへの相対パス、のいずれかを指定する必要があります。後者の場合は、設定ディレクトリー %2$s と相対するパスでなければなりません。";
    }
    @Override
    protected String managementResourceNotFound$str() {
        return "WFLYCTL0216: 管理リソース '%1$s' が見つかりません";
    }
    @Override
    protected String childResourceNotFound$str() {
        return "WFLYCTL0217: 子リソース '%1$s' が見つかりません";
    }
    @Override
    protected String nodeAlreadyRegistered$str() {
        return "WFLYCTL0218: ノードは '%1$s' ですでに登録されています";
    }
    @Override
    protected String removingExtensionWithRegisteredSubsystem$str() {
        return "WFLYCTL0219: サブシステム %2$s を登録している拡張 %1$s の登録解除を試行しました";
    }
    @Override
    protected String cannotOverrideRootRegistration$str() {
        return "WFLYCTL0220: オーバーライドモデルの登録はルートモデル登録で利用できません";
    }
    @Override
    protected String cannotOverrideNonWildCardRegistration$str() {
        return "WFLYCTL0221: オーバーライドモデルの登録はワイルドカード以外のモデル登録で利用できません。この登録はワイルドカード以外の名前 '%1$s' を対象としています。";
    }
    @Override
    protected String wildcardRegistrationIsNotAnOverride$str() {
        return "WFLYCTL0222: '*' と呼ばれる登録はオーバーライドモデルではないため、unregisterOverrideModel API で登録解除できません。";
    }
    @Override
    protected String rootRegistrationIsNotOverridable$str() {
        return "WFLYCTL0223: ルートリソース登録はオーバーライドに対応していないため、オーバーライドの削除はできません。";
    }
    @Override
    protected String operationNotRegisteredException$str() {
        return "WFLYCTL0224: アドレス %2$s で登録されている操作 %1$s はありません";
    }
    @Override
    protected String failedToRecoverServices$str() {
        return "WFLYCTL0225: 操作のロールバック中にサービスの復元に失敗しました";
    }
    @Override
    protected String duplicateSubsystem$str() {
        return "WFLYCTL0226: '%1$s' という名前のサブシステムは拡張 '%2$s' で登録することができません -- その名前のサブシステムはすでに拡張 '%3$s' によって登録されています";
    }
    @Override
    protected String validationFailedOperationHasNoField$str() {
        return "WFLYCTL0227: オペレーションに '%1$s' フィールドがありません。%2$s";
    }
    @Override
    protected String validationFailedOperationHasANullOrEmptyName$str() {
        return "WFLYCTL0228: 操作の名称が null か空です。%1$s";
    }
    @Override
    protected String validationFailedNoOperationFound$str() {
        return "WFLYCTL0229: '%2$s' には '%1$s' と呼ばれる操作がありません。%3$s";
    }
    @Override
    protected String validationFailedActualParameterNotDescribed$str() {
        return "WFLYCTL0230: 操作には、想定されたパラメーター %2$s の 1 つでないパラメーター '%1$s' が含まれています。%3$s";
    }
    @Override
    protected String validationFailedRequiredParameterNotPresent$str() {
        return "WFLYCTL0231: 必須パラメーター %1$s がありません。 %2$s";
    }
    @Override
    protected String validationFailedRequiredParameterPresentAsWellAsAlternative$str() {
        return "WFLYCTL0232: 必須パラメーター '%2$s' の代わりにパラメーター '%1$s' が使用されました。どちらか 1 つを使用してください。%3$s";
    }
    @Override
    protected String validationFailedCouldNotConvertParamToType$str() {
        return "WFLYCTL0233: パラメーター '%1$s' を %2$s に変換できませんでした。%3$s";
    }
    @Override
    protected String validationFailedValueIsSmallerThanMin$str() {
        return "WFLYCTL0234: '%2$s' に対して渡した値 '%1$s' は最小値 '%3$s' よりも小さくなっています。 %4$s";
    }
    @Override
    protected String validationFailedValueIsGreaterThanMax$str() {
        return "WFLYCTL0235: '%2$s' に対して渡した値 '%1$s' は最大値 '%3$s' よりも大きくなっています。 %4$s";
    }
    @Override
    protected String validationFailedValueIsShorterThanMinLength$str() {
        return "WFLYCTL0236: '%2$s' に対して渡した値 '%1$s' は最小長 '%3$s' よりも短くなっています。 %4$s";
    }
    @Override
    protected String validationFailedValueIsLongerThanMaxLength$str() {
        return "WFLYCTL0237: '%2$s' に対して渡した値 '%1$s' は最大長 '%3$s' よりも長くなっています。 %4$s";
    }
    @Override
    protected String validationFailedInvalidElementType$str() {
        return "WFLYCTL0238: %1$s は %2$s の一覧であると想定されます。%3$s";
    }
    @Override
    protected String invalidDescriptionRequiredFlagIsNotABoolean$str() {
        return "WFLYCTL0239: '必須' パラメーター: %2$s の操作の記述では '%1$s' はブール値でなければなりません: %3$s";
    }
    @Override
    protected String invalidDescriptionUndefinedRequestProperty$str() {
        return "WFLYCTL0240: %2$s の操作の記述でリクエストプロパティー '%1$s' は定義されていません: %3$s";
    }
    @Override
    protected String invalidDescriptionNoParamTypeInDescription$str() {
        return "WFLYCTL0241: %2$s の操作の記述にはパラメーター '%1$s' の型がありません: %3$s";
    }
    @Override
    protected String invalidDescriptionInvalidParamTypeInDescription$str() {
        return "WFLYCTL0242: %2$s の操作の記述ではパラメーター '%1$s' の型を判断できませんでした: %3$s";
    }
    @Override
    protected String invalidDescriptionMinMaxForParameterHasWrongType$str() {
        return "WFLYCTL0243: '%2$s' パラメーターの属性 '%1$s' は、%4$s の操作の記述で型: %3$sに変換することができません: %5$s";
    }
    @Override
    protected String invalidDescriptionMinMaxLengthForParameterHasWrongType$str() {
        return "WFLYCTL0244: '%2$s' パラメーターの属性 '%1$s' は、%3$s の操作の記述で整数に変換することができません: %4$s";
    }
    @Override
    protected String invalidPort$str() {
        return "WFLYCTL0245: 不正な '%1$s' の値 %2$s -- 有効なポート番号でなければなりません";
    }
    @Override
    protected String cannotResolveProcessUUID$str() {
        return "WFLYCTL0246: localhost アドレスが解決できないので、プロセスに割り当てる UUID ベースの名前を作成できません";
    }
    @Override
    protected String useOperationContextRemoveService$str() {
        return "WFLYCTL0247: ServiceController.setMode(REMOVE) 呼び出さず、OperationContext.removeService() を使ってください。";
    }
    @Override
    protected String invalidEnumValue$str() {
        return "WFLYCTL0248: %2$s に対する無効な値 %1$s; 有効な値は %3$s";
    }
    @Override
    protected String modelUpdateNotAuthorized$str() {
        return "WFLYCTL0249: リソース '%2$s' に対する操作 '%1$s' は、直接ユーザーにより呼び出されました。管理対象ドメインにあるサーバーの永続設定を直接更新するというユーザーの操作は許可されていません。";
    }
    @Override
    protected String serverResultsAccessNotAllowed$str() {
        return "WFLYCTL0250: 操作ハンドラーは、'%1$s' 以外のプロセス型で operation-response-server-results オブジェクトへアクセスしようとしました。現在のプロセス型は '%2$s' です。";
    }
    @Override
    protected String cantHaveBothLoopbackAndInetAddressCriteria$str() {
        return "WFLYCTL0251: ループバックと inet-address 基準の両方を同時に利用できません。";
    }
    @Override
    protected String cantHaveSameCriteriaForBothNotAndInclusion$str() {
        return "WFLYCTL0253: 「%1$s ではない／を含む」との基準を両方同時に利用できません。";
    }
    @Override
    protected String nonexistentInterface$str() {
        return "WFLYCTL0254: 属性 '%2$s' の値 '%1$s' は無効です。その名前のインターフェイス設定は存在します。";
    }
    @Override
    protected String pathEntryNotFound$str() {
        return "WFLYCTL0256: '%1$s' と呼ばれるパスが見つかりませんでした。";
    }
    @Override
    protected String pathEntryIsReadOnly$str() {
        return "WFLYCTL0257: パスエントリーは読み取り専用です: '%1$s'";
    }
    @Override
    protected String pathEntryAlreadyExists$str() {
        return "WFLYCTL0258: '%1$s' と呼ばれるパスエントリーがすでに存在します。";
    }
    @Override
    protected String invalidRelativePathValue$str() {
        return "WFLYCTL0260: 無効な relativePath 値 '%1$s'";
    }
    @Override
    protected String pathIsAWindowsAbsolutePath$str() {
        return "WFLYCTL0261: '%1$s' は Windows の絶対パスです。";
    }
    @Override
    protected String cannotRemoveReadOnlyPath$str() {
        return "WFLYCTL0262: パス '%1$s' は読み取り専用です。削除できません。";
    }
    @Override
    protected String cannotModifyReadOnlyPath$str() {
        return "WFLYCTL0263: パス '%1$s' は読み取り専用です。変更できません。";
    }
    @Override
    protected String expressionNotAllowed$str() {
        return "WFLYCTL0264: %1$s は ModelType.EXPRESSION でない場合があります。";
    }
    @Override
    protected String pathManagerNotAvailable$str() {
        return "WFLYCTL0265: PathManager はタイプが '%1$s' のプロセスで利用できません。";
    }
    @Override
    protected String unknownMulticastAddress$str() {
        return "WFLYCTL0266: 属性 %2$s の値 %1$s は有効なマルチキャストアドレスではありません";
    }
    @Override
    protected String cannotRemovePathWithDependencies$str() {
        return "WFLYCTL0267: 以下のパスが依存しているため、パス '%1$s' を削除できません: %2$s";
    }
    @Override
    protected String failedToRenameTempFile$str() {
        return "WFLYCTL0268: 一時ファイルの名前を %1$s から %2$s に変更できませんでした。";
    }
    @Override
    protected String invalidLocaleString$str() {
        return "WFLYCTL0269: 無効なロケール形式: %1$s";
    }
    @Override
    protected String operationCancelled$str() {
        return "WFLYCTL0271: 操作がキャンセルされました";
    }
    @Override
    protected String operationCancelledAsynchronously$str() {
        return "WFLYCTL0272: 操作が非同期的にキャンセルされました";
    }
    @Override
    protected String streamWasKilled$str() {
        return "WFLYCTL0273: ストリームが中止されました";
    }
    @Override
    protected String streamWasClosed$str() {
        return "WFLYCTL0274: ストリームは閉じられました";
    }
    @Override
    protected String cannotHaveBothParameters$str() {
        return "WFLYCTL0275: '%1$s' と '%2$s' の両方を定義できません";
    }
    @Override
    protected String couldNotDeleteFile$str() {
        return "WFLYCTL0276: ファイル %1$s の削除に失敗しました";
    }
    @Override
    protected String aliasAlreadyRegistered$str() {
        return "WFLYCTL0277: エイリアスはすでに場所 '%1$s' で登録されています";
    }
    @Override
    protected String aliasTargetResourceRegistrationNotFound$str() {
        return "WFLYCTL0279: エイリアスのターゲットアドレスが見つかりません: %1$s";
    }
    @Override
    protected String aliasStepHandlerOperationNotFound$str() {
        return "WFLYCTL0280: '%3$s' にマッピングするエイリアスアドレス '%2$s' の '%1$s' と呼ばれる操作はありません。";
    }
    @Override
    protected String resourceRegistrationIsNotAnAlias$str() {
        return "WFLYCTL0281: リソース登録はエイリアスではありません";
    }
    @Override
    protected String modelFieldsNotKnown$str() {
        return "WFLYCTL0282: モデルには定義では認識されていないフィールドが含まれています。フィールド: %1$s、パス: %2$s";
    }
    @Override
    protected String couldNotMarshalAttributeAsElement$str() {
        return "WFLYCTL0283: 属性を要素としてマーシャルできませんでした: %1$s";
    }
    @Override
    protected String couldNotMarshalAttributeAsAttribute$str() {
        return "WFLYCTL0284: 属性を属性としてマーシャルできませんでした: %1$s";
    }
    @Override
    protected String wildcardOperationFailedAtSingleAddress$str() {
        return "WFLYCTL0285: 複数のターゲットアドレスに対して呼び出された操作 %1$s がアドレス %2$s で失敗しました。問題の詳細 %3$s";
    }
    @Override
    protected String wildcardOperationFailedAtSingleAddressWithComplexFailure$str() {
        return "WFLYCTL0286: 複数のターゲットアドレスに対して呼び出された操作 %1$s がアドレス %2$s で失敗しました。詳細は操作結果を参照してください。";
    }
    @Override
    protected String wildcardOperationFailedAtMultipleAddresses$str() {
        return "WFLYCTL0287: 複数のターゲットアドレスに対して呼び出された操作 %1$s がアドレス %2$s で失敗しました。詳細は操作結果を参照してください。";
    }
    @Override
    protected String missingTransitiveDependencyProblem$str() {
        return "WFLYCTL0288: 1 つまたは複数の間接的な依存関係が使用できなかったため、1 つまたは複数のサービスが起動できませんでした。";
    }
    @Override
    protected String missingTransitiveDependents$str() {
        return "起動できなかったサービス:";
    }
    @Override
    protected String missingTransitiveDependencies$str() {
        return "原因である可能性があるサービス:";
    }
    @Override
    protected String noOperationEntry$str() {
        return "WFLYCTL0289: '%1$s' と呼ばれる操作エントリーは '%2$s' に登録されていません";
    }
    @Override
    protected String noOperationHandler2$str() {
        return "WFLYCTL0290: '%1$s' と呼ばれる操作ハンドラーは '%2$s' に登録されていません";
    }
    @Override
    protected String noPathToResolve$str() {
        return "WFLYCTL0291: パス属性 '%1$s' や relative-to 属性 '%2$s で解決するパスは登録されていません: %3$s";
    }
    @Override
    protected String attributesDontSupportExpressions$str() {
        return "WFLYCTL0292: 属性はターゲットモデルバージョンの式をサポートしません。ターゲットホスト上でこのリソースを無視する必要があります。";
    }
    @Override
    protected String attributesAreNotUnderstoodAndMustBeIgnored0$str() {
        return "WFLYCTL0293: 属性はターゲットモデルバージョンでは理解されません。ターゲットホスト上でこのリソースを無視する必要があります。";
    }
    @Override
    protected String transformerLoggerCoreModelResourceTransformerAttributes$str() {
        return "WFLYCTL0294: リソース %1$s をコアモデルバージョン '%2$s' に変換しています -- %3$s %4$s";
    }
    @Override
    protected String transformerLoggerCoreModelOperationTransformerAttributes$str() {
        return "WFLYCTL0295: リソース %2$s での操作 %1$s をコアモデルバージョン '%3$s' に変換しています -- %4$s %5$s";
    }
    @Override
    protected String transformerLoggerSubsystemModelResourceTransformerAttributes$str() {
        return "WFLYCTL0296: リソース %1$s をサブシステム '%2$s' のモデルバージョン '%3$s' に変換しています -- %4$s %5$s";
    }
    @Override
    protected String transformerLoggerSubsystemModelOperationTransformerAttributes$str() {
        return "WFLYCTL0297: リソース %2$s での操作 %1$s をサブシステム '%3$s' のモデルバージョン '%4$s' に変換しています -- %5$s %6$s";
    }
    @Override
    protected String illegalUnresolvedModel$str() {
        return "WFLYCTL0298: ノードには未解決の式 %1$s が含まれています -- 解決済みのモデルが必要です";
    }
    @Override
    protected String rejectAttributesCoreModelResourceTransformer$str() {
        return "WFLYCTL0299: ホストコントローラー '%2$s' のリソース %1$s をコアモデルバージョン '%3$s' に変換しています -- 属性の一部に問題があったため、ホスト上でこのリソースを無視する必要があります。問題の詳細: %4$s";
    }
    @Override
    protected String rejectAttributesSubsystemModelResourceTransformer$str() {
        return "WFLYCTL0300: ホストコントローラー '%2$s' のリソース %1$s をサブシステム '%3$s' のモデルバージョン '%4$s' へ変換しています -- 属性の一部に問題があったため、ホスト上でこのリソースを無視する必要があります。問題の詳細: %5$s";
    }
    @Override
    protected String attributesDoNotSupportExpressions$str() {
        return "WFLYCTL0301: 次の属性は式をサポートしません: %1$s";
    }
    @Override
    protected String attributeNames$str() {
        return "属性 %1$s";
    }
    @Override
    protected String attributesAreNotUnderstoodAndMustBeIgnored1$str() {
        return "WFLYCTL0302: 次の属性はターゲットモデルバージョンでは理解されません。ターゲットホスト上でこのリソースを無視する必要があります: %1$s";
    }
    @Override
    protected String rejectedResourceResourceTransformation$str() {
        return "WFLYCTL0303: リソース %1$s はターゲットホスト上で拒否されるため、ホスト上で無視する必要があります";
    }
    @Override
    protected String rejectResourceOperationTransformation$str() {
        return "WFLYCTL0304: %1$1s の操作 %2$s はターゲットホストで拒否され、ホストで無視する必要があります。";
    }
    @Override
    protected String discoveryOptionsMustBeDeclared$str() {
        return "WFLYCTL0305: ホストコントローラーがコマンドラインオプション %1$s で起動され、%2$s 属性が %3$s に設定されていない限り、%4$s を宣言するか、%5$s および %6$s を提供する必要があります。";
    }
    @Override
    protected String readOnlyContext$str() {
        return "WFLYCTL0306: 読み取り専用コンテキスト";
    }
    @Override
    protected String cannotGetControllerLock$str() {
        return "WFLYCTL0307: ドメインコントローラーからデータを読み取ろうとしていますが、現在は他の操作を実行しています。これは一時的な状況であるため、再試行してください。";
    }
    @Override
    protected String unsupportedLegacyExtension$str() {
        return "WFLYCTL0309: レガシー拡張 '%1$s' は、本バージョンを稼働しているサーバーではサポートされません。この拡張は、混合バージョンの管理対象ドメインで、以前のリリースを実行しているホストが使用する場合のみサポートされます。";
    }
    @Override
    protected String extensionModuleNotFound$str() {
        return "WFLYCTL0310: 拡張モジュール %1$s が見つかりません";
    }
    @Override
    protected String extensionModuleLoadingFailure$str() {
        return "WFLYCTL0311: 拡張モジュール %1$s のロードに失敗しました";
    }
    @Override
    protected String noContextToDelegateTo$str() {
        return "WFLYCTL0312: id が %1$s の委譲するコンテキストはありません";
    }
    @Override
    protected String unauthorized$str() {
        return "WFLYCTL0313: リソース '%2$s' に対する操作 '%1$s' の実行は許可されていません -- %3$s";
    }
    @Override
    protected String illegalMultipleRoles$str() {
        return "WFLYCTL0314: 複数のロールを持つユーザーは許可されません";
    }
    @Override
    protected String noHandlerCalled$str() {
        return "WFLYCTL0317: '%1$s' というハンドラーはありません";
    }
    @Override
    protected String operationContextIsNotAbstractOperationContext$str() {
        return "WFLYCTL0318: 演算コンテキストは AbstractOperationContext ではありません";
    }
    @Override
    protected String handlerIsReferencedBy$str() {
        return "WFLYCTL0319: ハンドラーは %1$s が参照しているため削除できません。";
    }
    @Override
    protected String resolvedFileDoesNotExistOrIsDirectory$str() {
        return "WFLYCTL0320: 解決済みファイル %1$s は存在しないか、またはディレクトリーです";
    }
    @Override
    protected String couldNotBackUp$str() {
        return "WFLYCTL0321: '%1$s' を '%2$s' にバックアップできませんでした";
    }
    @Override
    protected String attemptToBothRemoveAndAddHandlerUpdateInstead$str() {
        return "WFLYCTL0322: 複合演算のハンドラーの削除および追加を試行しました - 代わりにハンドラーを更新します";
    }
    @Override
    protected String attemptToBothAddAndRemoveAndHandlerFromCompositeOperation$str() {
        return "WFLYCTL0323: 複合演算のハンドラーの削除および追加を試行しました";
    }
    @Override
    protected String attemptToBothUpdateAndRemoveHandlerFromCompositeOperation$str() {
        return "WFLYCTL0324: 複合演算のハンドラーの更新および削除を試行しました";
    }
    @Override
    protected String attemptToBothRemoveAndAddHandlerReferenceFromCompositeOperation$str() {
        return "WFLYCTL0325: 複合演算のハンドラー参照の削除および追加を試行しました";
    }
    @Override
    protected String unknownRole$str() {
        return "WFLYCTL0327: 不明なロール '%1$s'";
    }
    @Override
    protected String cannotRemoveStandardRole$str() {
        return "WFLYCTL0328: 標準のロール '%1$s' を削除できません";
    }
    @Override
    protected String unknownBaseRole$str() {
        return "WFLYCTL0329: 不明なベースロール '%1$s'";
    }
    @Override
    protected String roleIsAlreadyRegistered$str() {
        return "WFLYCTL0330: ロール '%1$s' はすでに登録されています";
    }
    @Override
    protected String canOnlyCreateChildAuditLoggerForMainAuditLogger$str() {
        return "WFLYCTL0331: メインの監査ロガーのみに子監査ロガーを作成できます";
    }
    @Override
    protected String permissionDenied$str() {
        return "WFLYCTL0332: パーミッションは拒否されました";
    }
    @Override
    protected String permissionCollectionIsReadOnly$str() {
        return "WFLYCTL0333: 読み取り専用の PermissionCollection にパーミッションを追加できません";
    }
    @Override
    protected String incompatiblePermissionType$str() {
        return "WFLYCTL0334: 互換性のないパーミッションタイプ %1$s";
    }
    @Override
    protected String managementResourceNotFoundMessage$str() {
        return "WFLYCTL0335: 管理リソース '%1$s' が見つかりません";
    }
    @Override
    protected String attributesMustBeDefined$str() {
        return "WFLYCTL0336: 次の属性は現在のモデルで nill に指定できますが、ターゲットモデルバージョンで定義する必要があります: %1$s";
    }
    @Override
    protected String unsupportedIdentityType$str() {
        return "WFLYCTL0337: サポートされていないアイデンティティータイプ '%1$X' を受け取りました。";
    }
    @Override
    protected String unsupportedIdentityParameter$str() {
        return "WFLYCTL0338: アイデンティティータイプ '%2$X' の解析中に未サポートのアイデンティティーパラメーター '%1$X' を受け取りました。";
    }
    @Override
    protected String attributesMustBeDefinedAs$str() {
        return "WFLYCTL0339: 次の属性は現在のモデルで %1$s として定義する必要があります: %2$s";
    }
    @Override
    protected String attributesMustNotBeDefinedAs$str() {
        return "WFLYCTL0340: 次の属性は現在のモデルで %1$s として定義しないでください: %2$s";
    }
    @Override
    protected String badUriSyntax$str() {
        return "WFLYCTL0341: 検証に対して構文が不正な uri '%1$s' が渡されました。";
    }
    @Override
    protected String invalidBlockingTimeout$str() {
        return "WFLYCTL0342: 操作ヘッダー %2$s に対する不正な値 %1$d; 値はゼロよりも大きい必要があります";
    }
    @Override
    protected String timeoutAwaitingInitialStability0$str() {
        return "WFLYCTL0343: サービスコンテナは以前の操作により不安定になり、実行時更新を処理できません。再起動が必要です。";
    }
    @Override
    protected String timeoutExecutingOperation0$str() {
        return "WFLYCTL0344: 操作はサービスコンテナが安定するのを待機中にタイムアウトしました";
    }
    @Override
    protected String serviceInstallTimedOut$str() {
        return "WFLYCTL0345: 新しいインスタンスをインストールできるように、既存のサービス %2$s が削除されるのを %1$d 秒待ってからタイムアウト。";
    }
    @Override
    protected String invalidDefaultBlockingTimeout$str() {
        return "WFLYCTL0346: プロパティー %2$s に対して無効な値 %1$s; ゼロよりも大きい数値である必要があります。%3$d のデフォルト値が使用されます。";
    }
    @Override
    protected String timeoutAwaitingInitialStability3$str() {
        return "WFLYCTL0347: 最初のサービスコンテナが安定するまで [%1$d] 秒待機した後、アドレス '%3$s' の操作 '%2$s' の実行時変更を許可する前にタイムアウト。操作はロールバックされ、プロセスの再起動が必要です。";
    }
    @Override
    protected String timeoutExecutingOperation3$str() {
        return "WFLYCTL0348: サービスコンテナーが安定するまで [%1$d] 秒待機した後にタイムアウト。操作はロールバックされます。サービスコンテナーを最初に更新したステップはアドレス '%3$s' の '%2$s' でした。";
    }
    @Override
    protected String timeoutCompletingOperation$str() {
        return "WFLYCTL0349: 操作を完了する一方でサービスコンテナーが安定するまで [%1$d] 秒待機したあとにタイムアウト。プロセスは再起動する必要があります。サービスコンテーナを最初に更新したステップはアドレス '%3$s' の '%2$s' でした。";
    }
    @Override
    protected String interruptedAwaitingInitialResponse$str() {
        return "WFLYCTL0350: アドレス '%2$s' で、リモートプロセスの操作 '%1$s' の実行が、初期応答の待機中に中断されました。リモートプロセスは操作をキャンセルする通知を受けました。";
    }
    @Override
    protected String interruptedAwaitingFinalResponse$str() {
        return "WFLYCTL0351: アドレス '%2$s' で、リモートプロセスの操作 '%1$s' の実行が、最終応答の待機中に中断されました。リモートプロセスは操作を終了する通知を受け取りました。";
    }
    @Override
    protected String cancellingOperation$str() {
        return "WFLYCTL0352: スレッド '%3$s' で実行されている、ID が '%2$d' の操作 '%1$s' をキャンセルしています。";
    }
    @Override
    protected String responseHandlerNotFound$str() {
        return "WFLYCTL0353: 要求 %1$s の応答ハンドラーがありません";
    }
    @Override
    protected String attemptingReconnectToSyslog$str() {
        return "WFLYCTL0354: %2$d 秒のタイムアウト後、syslog ハンドラー '%1$s への再接続を試行しています。";
    }
    @Override
    protected String reconnectToSyslogFailed$str() {
        return "WFLYCTL0355: syslog ハンドラー '%1$s への再接続に失敗しました";
    }
    @Override
    protected String failedToEmitNotification$str() {
        return "WFLYCTL0356: 通知 %1$s の出力に失敗しました";
    }
    @Override
    protected String notificationIsNotDescribed$str() {
        return "WFLYCTL0357: タイプ %1$s の通知はアドレス %2$s のリソースに対して記述されていません";
    }
    @Override
    protected String resourceWasAdded$str() {
        return "WFLYCTL0358: リソースがアドレス %1$s で追加されました。";
    }
    @Override
    protected String resourceWasRemoved$str() {
        return "WFLYCTL0359: リソースはアドレス %1$s で削除されました。";
    }
    @Override
    protected String attributeValueWritten$str() {
        return "WFLYCTL0360: 属性 %1$s の値が %2$s から %3$s へ変更されました。";
    }
    @Override
    protected String capabilitiesNotAvailable$str() {
        return "WFLYCTL0361: ステージ '%1$s' では機能をクエリーできません。これらはステージ '%2$s' まで利用できません。";
    }
    @Override
    protected String requiredCapabilityMissing1$str() {
        return "WFLYCTL0362: リソース '%1$s' が必要な機能は利用できません:";
    }
    @Override
    protected String capabilityAlreadyRegisteredInContext2$str() {
        return "WFLYCTL0363: 機能 '%1$s' はすでにコンテキスト '%2$s' に登録されています。";
    }
    @Override
    protected String unknownCapability$str() {
        return "WFLYCTL0364: 機能 '%1$s' は不明です。";
    }
    @Override
    protected String unknownCapabilityInContext$str() {
        return "WFLYCTL0365: 機能 '%1$s' はコンテキスト '%2$s' では不明です。";
    }
    @Override
    protected String capabilityDoesNotExposeRuntimeAPI$str() {
        return "WFLYCTL0366: 機能 '%1$s' はランタイム API を公開しません。";
    }
    @Override
    protected String cannotRemoveRequiredCapability$str() {
        return "WFLYCTL0367: 他の機能で必要になるため、機能 '%1$s' を削除できません。";
    }
    @Override
    protected String cannotRemoveRequiredCapabilityInContext$str() {
        return "WFLYCTL0368: 他の機能で必要になるため、機能 '%1$s' をコンテキスト '%2$s' から削除できません。";
    }
    @Override
    protected String requiredCapabilityMissing0$str() {
        return "WFLYCTL0369: 必要な機能が使用できません:";
    }
    @Override
    protected String requirementPointSimple$str() {
        return "アドレス '%2$s' のために機能 '%1$s' で必要です。";
    }
    @Override
    protected String requirementPointFull$str() {
        return "アドレス '%3$s' の属性 '%2$s' のために機能 '%1$s' で必要です。";
    }
    @Override
    protected String formattedCapabilityName$str() {
        return "%1$s";
    }
    @Override
    protected String formattedCapabilityId$str() {
        return "コンテキスト '%2$s' の %1$s";
    }
    @Override
    protected String possibleCapabilityProviderPoints$str() {
        return "; この機能の可能な登録ポイント: %1$s";
    }
    @Override
    protected String noKnownProviderPoints$str() {
        return "; この機能を提供できる既知の登録ポイントがありません。";
    }
    @Override
    protected String unsupportedUsageOfExpression$str() {
        return "; これは、式をサポートしない設定属性で式文字列を使用していることが原因です。";
    }
    @Override
    protected String incompleteExpression$str() {
        return "WFLYCTL0370: 不完全な式: %1$s";
    }
    @Override
    protected String unsupportedElement$str() {
        return "WFLYCTL0371: 要素 '%1$s' はサポート対象外になりました。代わりに '%2$s' を使用してください。";
    }
    @Override
    protected String duplicateElementsInList$str() {
        return "WFLYCTL0372: 許可されない複製が含まれる属性 '%1$s' をリストします";
    }
    @Override
    protected String deploymentResourceMustBeRuntimeOnly$str() {
        return "WFLYCTL0373: デプロイメントリソースはランタイムのみである必要があります";
    }
    @Override
    protected String unableToResolveExpressions$str() {
        return "WFLYCTL0374: この場所では式を解決できません。";
    }
    @Override
    protected String udpSyslogServerUnavailable$str() {
        return "WFLYCTL0375: ’%2$s' が原因でハンドラー '%1$s' 上で管理操作監査ログのアップデートに失敗しました。syslog サーバーが稼働中で通信可能であることを確認してください。";
    }
    @Override
    protected String unexpectedAttribute2$str() {
        return "WFLYCTL0376: 予期せぬ属性 '%1$s' が見つかりました。有効な属性は次のとおりです: '%2$s'";
    }
    @Override
    protected String unexpectedElement2$str() {
        return "WFLYCTL0377: 予期せぬ要素 '%1$s' が見つかりました。有効な要素は次のとおりです: '%2$s'";
    }
    @Override
    protected String attributeIsWrongType$str() {
        return "WFLYCTL0378: 属性 '%1$s' の型は '%2$s' ではなく、'%3$s' です";
    }
    @Override
    protected String managementUnavailableDuringBoot$str() {
        return "WFLYCTL0379: システムの起動中です。現在、リモート管理操作を実行できません。";
    }
    @Override
    protected String requiredAttributeNotSet$str() {
        return "WFLYCTL0380: 属性 '%1$s' を設定または渡してから属性 '%2$s' を適切に設定する必要があります";
    }
    @Override
    protected String illegalPermissionName$str() {
        return "WFLYCTL0381: 不正なパーミッション名 '%1$s'";
    }
    @Override
    protected String illegalPermissionActions$str() {
        return "WFLYCTL0382: 不正なパーミッションアクション '%1$s'";
    }
    @Override
    protected String noOperationDefined$str() {
        return "WFLYCTL0383: 定義された操作はありません %1$s";
    }
    @Override
    protected String nonHostCapableSubsystemInHostModel$str() {
        return "WFLYCTL0385: ホストモデルの拡張モジュール '%2$s' からホスト対応でないサブシステム '%1$s' の登録が試行されました。";
    }
    @Override
    protected String onlyAccessHostControllerInfoInRuntimeStage$str() {
        return "WFLYCTL0386: ホストコントローラーの情報は起動時のモデルステージの後でのみアクセスできます";
    }
    @Override
    protected String illegalCLIStylePathAddress$str() {
        return "WFLYCTL0387: 不正なパスアドレス '%1$s'、正しい CLI 形式ではありません";
    }
    @Override
    protected String cannotCreateEmptyConfig$str() {
        return "WFLYCTL0388: 空の設定ファイル %1$s を作成できませんでした。";
    }
    @Override
    protected String rejectEmptyConfig$str() {
        return "WFLYCTL0389: 既存の空でない設定があるため、ファイル %1$s で空の設定ファイルを作成できませんでした。";
    }
    @Override
    protected String couldNotResolveExpressionIndex$str() {
        return "WFLYCTL0391: 属性式を解決できませんでした: '%1$s'、無効なインデックス '%2$d'";
    }
    @Override
    protected String couldNotResolveExpressionList$str() {
        return "WFLYCTL0392: 属性式を解決できませんでした: '%1$s'、型はリストではありません";
    }
    @Override
    protected String couldNotResolveExpression$str() {
        return "WFLYCTL0393: 属性式を解決できませんでした: '%1$s'";
    }
    @Override
    protected String invalidCapabilityServiceType$str() {
        return "WFLYCTL0394: 機能 '%1$s' は型 '%2$s' のサービスを提供しません。";
    }
    @Override
    protected String operationDeprecated$str() {
        return "WFLYCTL0395: アドレス %2$s のリソースに対する操作 %1$s は非推奨となり、今後のバージョンで削除される可能性があります。非推奨の詳細について read-operation-description 操作の出力を確認してください。";
    }
    @Override
    protected String discardedResourceTransformation$str() {
        return "WFLYCTL0396: リソース %1$s はターゲットホスト %2$s で破棄されます";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYCTL0397: インデックス化された子リソースは、順序付けされた子が親リソースによってサポートされる場合のみ登録できます。'%1$s' の親はインデックス化されていません。";
    }
    @Override
    protected String orderedChildTypeRenamed$str() {
        return "WFLYCTL0398: %1$s で見つかったリソースの名前を %2$s に変更しようとしましたが、'%3$s' は親リソース %4$s で順序付けされるよう定義されたリソース型の 1 つです。";
    }
    @Override
    protected String inconsistentCapabilityContexts4$str() {
        return "WFLYCTL0399: コンテキスト '%3$s' の機能 '%2$s' で必要な機能 '%1$s' は 1 つ以上のソケットバインディンググループで利用できますが、'%4$s' で必要なソケットバインディング機能には単一のソケットバインディンググループから解決できないものもあるため、この設定は無効です。";
    }
    @Override
    protected String inconsistentCapabilityContexts5$str() {
        return "WFLYCTL0400: リソース '%3$s' と関連するコンテキスト '%2$s' の機能 '%1$s' には機能 '%4$s' が必要です。これは、1 つ以上のソケットバインディンググループで利用できますが、'%5$s' が必要とするソケットバインディング機能には単一のソケットバインディンググループから解決できないものもあるため、この設定は無効です。";
    }
    @Override
    protected String failedToBuildReport$str() {
        return "WFLYCTL0401: レポートをビルドできませんでした";
    }
    @Override
    protected String removeUnsupportedLegacyExtension$str() {
        return "WFLYCTL0402: レガシー拡張 '%2$s' によって提供されるサブシステム %1$s は、本バージョンを実行しているサーバーではサポートされません。サーバーが機能するようにするには、サブシステムと拡張の両方を削除または移行する必要があります。";
    }
    @Override
    protected String unexpectedOperationExecutionException$str() {
        return "WFLYCTL0403: 次の操作の実行中に予期せぬ障害が発生しました: %1$s";
    }
    @Override
    protected String unexpectedOperationExecutionFailureDescription$str() {
        return "WFLYCTL0404: 実行中に予期せぬ例外が発生しました: %1$s";
    }
    @Override
    protected String couldNotFindTransformerRegistryFallingBack$str() {
        return "WFLYCTL0405: %1$s へのトランスフォーマーが見つかりませんでした。%2$s にフォールバックします。";
    }
    @Override
    protected String selectFailedCouldNotConvertAttributeToType$str() {
        return "WFLYCTL0406: 属性 '%1$s' を %2$s に変換できませんでした";
    }
    @Override
    protected String failedSendingCompletedResponse$str() {
        return "WFLYCTL0407: %2$d の完了応答 %1$s の送信に失敗しました";
    }
    @Override
    protected String failedSendingFailedResponse$str() {
        return "WFLYCTL0408: %2$d の失敗応答 %1$s の送信に失敗しました";
    }
    @Override
    protected String proxiedOperationTimedOut$str() {
        return "WFLYCTL0409: 初期応答の待機中、アドレス '%2$s' でリモートプロセスの操作 '%1$s' の実行が、%3$d ミリ秒後にタイムアウトしました。リモートプロセスは操作を終了するよう通知されました。";
    }
    @Override
    protected String timeoutAwaitingFinalResponse$str() {
        return "WFLYCTL0410: 最終応答の待機中、アドレス '%2$s' でリモートプロセスの操作 '%1$s' の実行が、%3$d ミリ秒後にタイムアウトしました。リモートプロセスは操作を終了するよう通知されました。";
    }
    @Override
    protected String failedToParseElementLenient$str() {
        return "WFLYCTL0411: 要素 '%1$s' の解析に失敗しました。無視します。";
    }
    @Override
    protected String missingRequiredServices$str() {
        return "WFLYCTL0412: インストールされていない必須のサービス:";
    }
    @Override
    protected String deprecatedAndCurrentParameterMismatch$str() {
        return "WFLYCTL0413: 現在のパラメーター %2$s 以外に非推奨のパラメーター %1$s が異なる値で設定されました";
    }
    @Override
    protected String couldNotCreateHistoricalBackup$str() {
        return "WFLYCTL0414: 現在の履歴ディレクトリー %1$s のタイムスタンプ付きバックアップを作成できませんでした。したがって、前の起動のバージョンがまだ含まれている可能性があります。";
    }
    @Override
    protected String runtimeModificationBegun$str() {
        return "WFLYCTL0415: 管理操作による実行時サービスコンテナーの変更が開始されました";
    }
    @Override
    protected String runtimeModificationComplete$str() {
        return "WFLYCTL0416: 管理操作による実行時サービスコンテナーの変更が完了しました";
    }
    @Override
    protected String cannotAddMoreThanOneJvmForServerOrHost$str() {
        return "WFLYCTL0417: jvm を複数追加することはできません。'%1$s' の追加が試行されましたが、'%2$s' はすでに存在します。";
    }
    @Override
    protected String socketBindingalreadyDeclared$str() {
        return "WFLYCTL0418: %1$s または宣言済みの %2$s %3$s はすでに %4$s %5$s で宣言されています。";
    }
    @Override
    protected String invalidMaxBytesLength$str() {
        return "WFLYCTL0419: '%1$s' はパラメーター %2$s に対して無効な値です。値の長さは最大で %3$d バイトです";
    }
    @Override
    protected String invalidMinBytesLength$str() {
        return "WFLYCTL0420: '%1$s' はパラメーター %2$s に対して無効な値です。値の長さは最小で %3$d バイトです";
    }
    @Override
    protected String explodedDeploymentNotSupported$str() {
        return "WFLYCTL0421: 展開されたデプロイメントは一部のサーバーでサポートされません";
    }
    @Override
    protected String couldNotLoadModuleForTransformers$str() {
        return "WFLYCTL0422: トランスフォーマーに対してモジュール '%1$s' をロードできませんでした";
    }
    @Override
    protected String wrongMaskedPasswordFormat$str() {
        return "WFLYCTL0423: マスクされたパスワードコマンドの形式が間違っています。%n使い方: MASK-<encoded secret>;<salt>;<iteration count> (<salt>=UTF-8 の文字、<iteration count>=妥当なサイズの正整数)。";
    }
    @Override
    protected String invalidAddressFormat$str() {
        return "WFLYCTL0433: '%1$s' はリソースアドレスの有効な表記ではありません";
    }
    @Override
    protected String bootComplete$str() {
        return "WFLYCTL0434: ブートが完了";
    }
    @Override
    protected String attributeWasNotMarkedAsReloadRequired$str() {
        return "WFLYCTL0435: リソース %2$s の属性 %1$s はリロードが必要とマーク付けされていません。RESTART_ALL_SERVICES フラグを設定するか、カスタムの書き込みハンドラーを登録します。";
    }
    @Override
    protected String typeConversionError$str() {
        return "%1$s を %2$s に変換できませんでした";
    }
    @Override
    protected String capabilityAlreadyRegisteredInContext4$str() {
        return "WFLYCTL0436: 場所 '%4$s' のコンテキスト '%3$s' にすでに登録されているため、場所 '%2$s' に機能 '%1$s' を登録できません。";
    }
    @Override
    protected String duplicateExtensionElement$str() {
        return "WFLYCTL0437: 重複の拡張: %2$s 属性の値 '%3$s' を持つ %1$s 要素はすでに解析済みです";
    }
    @Override
    protected String couldntConvertWarningLevel$str() {
        return "WFLYCTL0438: '%1$s' を適切な警告レベルに変換できませんでした。しきい値は 'ALL' にフォールバックします。可能な値: SEVERE、WARNING、INFO、CONFIG、FINE、FINER、FINEST、ALL、OFF";
    }
    @Override
    protected String invalidSubnetFormat$str() {
        return "WFLYCTL0439: 属性 %2$s の値 %1$s は有効なサブネット形式ではありません";
    }
    @Override
    protected String cannotDeleteFileOrDirectory$str() {
        return "WFLYCTL0440: ファイルまたはディレクトリー %1$s を削除できません";
    }
    @Override
    protected String serviceStatusReportFailureHeader$str() {
        return "WFLYCTL0441: 操作によってサービス %n に失敗したか、それらのサービスが見つかりません。";
    }
    @Override
    protected String errorStoppingServer$str() {
        return "WFLYCTL0442: サーバーの停止エラー";
    }
    @Override
    protected String errorObtainingPassword$str() {
        return "WFLYCTL0443: サプライヤー %1$s からのパスワード取得エラー";
    }
    @Override
    protected String invalidRuntimeStageForProfile$str() {
        return "WFLYCTL0444: アドレス %2$s の 操作 %1$s のハンドラーがステージ %3$s のステップを追加しようとしました。これは、プロセス型 %4$s の profile リソースには有効でないため、このステップは実行されません。";
    }
    @Override
    protected String alreadyDefinedAttribute$str() {
        return "WFLYCTL0445: 属性 %3$s の値 '%2$s' を持つ %1$s はすでに定義されています";
    }
    @Override
    protected String requiredWithAlternatives$str() {
        return "WFLYCTL0446: %1$s または代替の %2$s が必要です";
    }
    @Override
    protected String attributeExpressionDeprecated$str() {
        return "WFLYCTL0447: アドレス '%2$s' のリソースにある '%1$s' は式で設定されていますが、この属性の値で使用する式のサポートは今後のバージョンで廃止される可能性があります。この属性は、設定の他の部分で必要となる機能が存在するか、またはこの属性自体が設定の他の部分によって提供される機能に必要となる条件を設定するかどうかを設定します。式が使用された場合、このような設定の完全サポートは提供されません。";
    }
    @Override
    protected String servicesWithTransitiveUnavailability$str() {
        return "WFLYCTL0448: 依存関係の欠如または失敗が原因で %1$s 個のサービスがダウンしています";
    }
    @Override
    protected String operationDeprecatedMessage$str() {
        return "WFLYCTL0449: アドレス %2$s のリソースに対する操作 %1$s は非推奨となり、今後のバージョンで削除される可能性があります。非推奨の詳細について read-operation-description 操作の出力を確認してください。";
    }
    @Override
    protected String failedToCloneRepository$str() {
        return "WFLYCTL0450: リポジトリー %1$s のクローンに失敗しました";
    }
    @Override
    protected String failedToPublishConfiguration$str() {
        return "WFLYCTL0451: %2$s が原因で %1$s に設定をパブリッシュできませんでした";
    }
    @Override
    protected String failedToPersistConfiguration$str() {
        return "WFLYCTL0452: %2$s が原因で %1$s に設定を永続化できませんでした";
    }
    @Override
    protected String failedToDeleteConfigurationSnapshot$str() {
        return "WFLYCTL0453: 設定スナップショット %1$s の削除に失敗しました";
    }
    @Override
    protected String failedToListConfigurationSnapshot$str() {
        return "WFLYCTL0454: 設定スナップショット %1$s の一覧表示に失敗しました";
    }
    @Override
    protected String snapshotAlreadyExistError$str() {
        return "WFLYCTL0455: スナップショット %1$s はすでに存在するため作成できません";
    }
    @Override
    protected String systemPropertyAlreadyExist$str() {
        return "WFLYCTL0456: システムプロパティー \"%1$s\" はすでに設定ファイルの <system-properties> セクションに設定されています。コマンドラインで設定した値はこの値によって上書きされます。";
    }
    @Override
    protected String invalidHeaderName$str() {
        return "WFLYCTL0457: 無効な HTTP ヘッダー名 '%1$s'";
    }
    @Override
    protected String disallowedHeaderName$str() {
        return "WFLYCTL0458: 許可されない HTTP ヘッダー名 '%1$s'";
    }
    @Override
    protected String missingManagementServices$str() {
        return "WFLYCTL0459: 管理サービスがないためロールバックをトリガーします。";
    }
    @Override
    protected String propertyCanOnlyBeUsedWithStandaloneOrEmbeddedServer$str() {
        return "WFLYCTL0460: システムプロパティー '%1$s' はスタンドアロンサーバーと組み込みサーバーのみで使用できます";
    }
    @Override
    protected String propertyCanOnlyBeUsedWithAdminOnlyModeServer$str() {
        return "WFLYCTL0461: システムプロパティー '%1$s' は管理専用サーバーでのみ使用できます";
    }
    @Override
    protected String couldNotFindDirectorySpecifiedByProperty$str() {
        return "WFLYCTL0462: システムプロパティー '%1$s' により指定されたディレクトリー '%2$s' が見つかりませんでした。存在することを確認してください";
    }
    @Override
    protected String moreThanOneInstanceOfAdditionalBootCliScriptInvokerFound$str() {
        return "WFLYCTL0463: AdditionalBootCliScriptInvoker のインスタンスが複数見つかりました。所有: %1$s'; 発見: '%2$s";
    }
    @Override
    protected String cliScriptPropertyDefinedWithoutMarkerDirectoryWhenNotSkippingReload$str() {
        return "WFLYCTL0464: %1$s=true を使用している場合、-D%2$s を使用するときは、-D %3$s を設定する必要があります";
    }
    @Override
    protected String initialisedAdditionalBootCliScriptSystemKeepingAlive$str() {
        return "WFLYCTL0465: 追加のブート CLI スクリプト機能を初期化しました。CLI コマンドは %1$s から読み込まれます。これらの実行後、サーバーは管理専用モードで稼働し続けます。cli 操作の結果が %2$s に書き込まれます";
    }
    @Override
    protected String initialisedAdditionalBootCliScriptSystemNotKeepingAlive$str() {
        return "WFLYCTL0466: 追加のブート CLI スクリプト機能が導入されました。CLI コマンドは %1$s から読み込まれます。これらのコマンドは、実行後にサーバーは通常モードに再起動されます。";
    }
    @Override
    protected String executingBootCliScript$str() {
        return "WFLYCTL0467: CLI スクリプト %1$s から管理専用モードで実行しているサーバーに対して追加のコマンドを実行";
    }
    @Override
    protected String completedRunningBootCliScript$str() {
        return "WFLYCTL0468: CLI スクリプトからのコマンドの実行が完了しました";
    }
    @Override
    protected String restartingServerAfterBootCliScript$str() {
        return "WFLYCTL0469: CLI スクリプトから追加のコマンド必要になるため、サーバーを再起動しています。これは、再起動メカニズムが、追加のブート CLI スクリプト機能 (%2$s、%3$s、%4$s) に関連するすべてのプロパティーを保持するため、再起動がマーカーファイル %1$s で開始されたことを記録します。再起動メカニズムは管理のみの実行モードを維持しますので、後続のリロードが発生します";
    }
    @Override
    protected String reloadingServerToNormalModeAfterAdditionalBootCliScript$str() {
        return "WFLYCTL0470: CLI スクリプトから追加コマンドを実行した後にサーバーを通常モードにリロードします。これにより、追加の起動 cli スクリプト機能が設定されている場合 (%1$s、%2$s、%3$s)、これらをトリガーするプロパティーが消去されます。また、サーバーが再起動されたことを示すマーカーファイルが削除されます";
    }
    @Override
    protected String reloadingServerToNormalModeAfterRestartAfterAdditionalBootCliScript$str() {
        return "WFLYCTL0471: CLI スクリプトから追加コマンドの以下の実行を再起動した後にサーバーを通常モードにリロードします。これにより、追加の起動 cli スクリプト機能が設定されている場合 (%1$s、%2$s、%3$s)、これらをトリガーするプロパティーが消去されます";
    }
    @Override
    protected String checkingForPresenceOfRestartMarkerFile$str() {
        return "WFLYCTL0472: CLI スクリプトから追加コマンドを実行した後にサーバーが再起動されたことを示すマーカーファイルの有無の確認";
    }
    @Override
    protected String foundRestartMarkerFile$str() {
        return "WFLYCTL0473: %1$s で見つかった CLI スクリプトから追加のコマンドを実行した後にサーバーが再起動されたことを示すマーカーファイル";
    }
    @Override
    protected String noRestartMarkerFile$str() {
        return "WFLYCTL0474: CLI スクリプトから追加のコマンドの実行後にサーバーが再起動されたことを示すマーカーファイルがありません";
    }
    @Override
    protected String invalidAttributeValue1$str() {
        return "WFLYCTL0475: 属性 '%1$s' の値は無効です。";
    }
    @Override
    protected String invalidCredentialReferenceValue$str() {
        return "WFLYCTL0476: 属性 '%1$s' の値は無効です。'%2$s' は独自で指定する必要があります。あるいは、%3$s は '%4$s' または '%5$s' のいずれか 1 つで指定される必要があります";
    }
    @Override
    protected String invalidParameterName$str() {
        return "WFLYCTL0477: パラメーター名 '%1$s' は無効です。";
    }
    @Override
    protected String unableToBuildCommandCredentialSource$str() {
        return "WFLYCTL0478: 認証情報の参照用にコマンドベースの CredentialSource を作成できません。";
    }
    @Override
    protected String attributeUnresolvableUsingSimpleResolution$str() {
        return "WFLYCTL0479: 'resolve' パラメーターでサポートされているセキュリティー上問題のない解決ソースを使用して、未解決の値 '%3$s' を含むリソース '%2$s' の属性 '%1$s' を解決できません。レスポンスで未解決の値が報告されます。";
    }
    @Override
    protected String expressionUnresolvableUsingSimpleResolution$str() {
        return "WFLYCTL0480: '%2$s' 操作でサポートされているセキュリティー上問題のない解決ソースを使用して、式 '%1$s' を解決できません。レスポンスで未解決の値が報告されます。";
    }
    @Override
    protected String runtimePackageDependencyAlreadyRegistered$str() {
        return "WFLYCTL0481: ランタイム依存関係パッケージの '%1$s' は、すでにロケーション '%2$s' に登録されています";
    }
    @Override
    protected String illegalCharsetName$str() {
        return "WFLYCTL0482: 値 '%1$s' は有効な文字セット名ではありません";
    }
    @Override
    protected String unsupportedCharset$str() {
        return "WFLYCTL0483: 文字セット '%1$s' は、Java 仮想マシンのこのインスタンスではサポートされていません";
    }
    @Override
    protected String invalidAttributeDefinition$str() {
        return "WFLYCTL0484: 属性 '%1$s' の属性定義は null です";
    }
    @Override
    protected String failedToParseYamlConfigurationFile$str() {
        return "WFLYCTL0485: yaml ファイル %1$s の解析エラー";
    }
    @Override
    protected String missingYamlFile$str() {
        return "WFLYCTL0486: yaml ファイル %1$s がありません";
    }
    @Override
    protected String loadingYamlFiles$str() {
        return "WFLYCTL0487: yaml ファイル [%2$s] のロードと解析に %1$s ms かかりました ";
    }
    @Override
    protected String noResourceRegistered1$str() {
        return "WFLYCTL0488: アドレス %1$s の登録が見つかりません - サブツリーは無視しています";
    }
    @Override
    protected String noResourceForUndefiningAttribute$str() {
        return "WFLYCTL0489: %1$s にリソースがないため、属性 %2$s の定義を解除できません";
    }
    @Override
    protected String noAttributeSetForAddress$str() {
        return "WFLYCTL0490: 属性のないアドレス %1$s に対して YAML リソースが定義されています。アクションは何も実行されません。";
    }
    @Override
    protected String unexpectedValueForResource$str() {
        return "WFLYCTL0491: アドレス %1$s と名前 %3$s に予期せぬ値 %2$s があります";
    }
    @Override
    protected String noResourceRegistered2$str() {
        return "WFLYCTL0492: 現在の登録 %2$s でアドレス %1$s のリソース登録が見つかりません";
    }
    @Override
    protected String missingListAttributeValueType$str() {
        return "WFLYCTL0493: 属性 %1$s の valueType が適切に定義されていません。";
    }
    @Override
    protected String resolverExtensionExpressionsNotAllowed$str() {
        return "WFLYCTL0494: この時点では、拡張式 '%1$s' の解決は許可されません。";
    }
    @Override
    protected String adminOnlyPolicyDeprecatedValue$str() {
        return "WFLYCTL0495: \"fetch-from-master\" は \"domain-controller.remote.admin-only-policy\" の非推奨になった値です。代わりに \"fetch-from-domain-controller\" が使用されます。";
    }
    @Override
    protected String threadDumpException$str() {
        return "WFLYCTL0498: スレッドダンプの生成中に例外が発生しました";
    }
    @Override
    protected String errorConstructingYAMLMapping$str() {
        return "マッピング %1$s の構築中、マージのマッピングが予想されましたが %2$s が見つかりました";
    }
    @Override
    protected String argYaml$str() {
        return "設定をカスタマイズするための yaml 設定ファイルです。パスは、絶対パス、現在の実行ディレクトリーへの相対パス、スタンドアロン設定ディレクトリーへの相対パスを使用できます。";
    }
    @Override
    protected String noSatisfactoryCapability$str() {
        return "WFLYCTL0499: 機能スコープが '%2$s' のリソースには、十分な機能 '%1$s' がありません。この機能はアドレス '%3$s' で登録され、スコープが '%4$s' のリソースからアクセスできません。";
    }
    @Override
    protected String uuidIsEmpty$str() {
        return "WFLYCTL0500: '%1$s' には UUID 文字列がありません。新しい値が生成されます。";
    }
    @Override
    protected String uuidNotValid$str() {
        return "WFLYCTL0501: 無効な UUID 文字列 '%1$s' が '%2$s' で見つかりました。新しい値が生成されます。";
    }
    @Override
    protected String noChildResource$str() {
        return "WFLYCTL0502: '%1$s' という子リソースはアドレス '%2$s' で見つかりませんでした。";
    }
    @Override
    protected String failedToPublishConfigurationInvalidRemote$str() {
        return "WFLYCTL0503: リモート名 %1$s は無効なため、設定の公開に失敗しました。";
    }
    @Override
    protected String missingOperationForResource$str() {
        return "WFLYCTL0504: 操作 %1$s はリソース %2$s に対して定義されていません。";
    }
    @Override
    protected String unstableSubsystemNamespace$str() {
        return "WFLYCTL0505: %1$s サブシステムの名前空間 %2$s が現在の安定性レベルによって有効化されていません";
    }
    @Override
    protected String unstableExtension$str() {
        return "WFLYCTL0506: モジュール %2$s の拡張 %1$s が現在の安定性レベルによって有効化されていません";
    }
    @Override
    protected String unsupportedDeployment$str() {
        return "WFLYCTL0507: 属性 %2$s を含むサポートされていないデプロイメント yaml ファイル %1$s";
    }
    @Override
    protected String ignoreYamlElement$str() {
        return "WFLYCTL0508: yaml 要素 '%1$s' およびそのサブ要素は無視されます。";
    }
    @Override
    protected String ignoreYamlSubElement$str() {
        return "そのため、要素 '%1$s' は無視されます。";
    }
    @Override
    protected String noAttributeDefined$str() {
        return "WFLYCTL0509: アドレス '%2$s' で定義されている '%1$s' という属性はありません。";
    }
    @Override
    protected String illegalOperationForAttribute$str() {
        return "WFLYCTL0510: アドレス '%3$s' で定義されている '%2$s' という属性に対して実行できる操作 %1$s がありません。";
    }
    @Override
    protected String noAttributeValueDefined$str() {
        return "WFLYCTL0511: アドレス '%2$s' の属性 '%1$s' に対して定義されている値がありません。";
    }
    @Override
    protected String removingUnexistingResource$str() {
        return "WFLYCTL0512: アドレス '%1$s' にリソースが存在しません。削除操作を無視します。";
    }
    @Override
    protected String unsupportedNamespace$str() {
        return "WFLYCTL0513: %1$s の XML 名前空間はサポートされなくなりました。";
    }
    @Override
    protected String unstableManagementNamespace$str() {
        return "WFLYCTL0514: 管理名前空間 %1$s が現在の安定性レベルによって有効化されていません";
    }
    @Override
    protected String systemPropertyDeprecated$str() {
        return "WFLYCTL0515: システムプロパティー '%1$s' は非推奨であり、今後のバージョンで削除される可能性があります。代わりにリソース '%3$s' の 属性 '%2$s' を使用してください。";
    }
    @Override
    protected String invalidModuleNameParameter$str() {
        return "WFLYCTL0516: パラメーター %1$s で次の無効なモジュール名が指定されています: %2$s";
    }
    @Override
    protected String multipleParallelBootOperation$str() {
        return "WFLYCTL0517: 複数の並列ブート操作があります。";
    }
}
