package org.jboss.as.logging.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:19+0200")
public class LoggingLogger_$logger_ja extends LoggingLogger_$logger implements LoggingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public LoggingLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYLOG0006: リソース %1$s を終了することができませんでした。";
    }
    @Override
    protected String invalidPropertyAttribute$str() {
        return "WFLYLOG0007: 設定可能なプロパティー値ではないため属性 %1$s を設定できませんでした。";
    }
    @Override
    protected String pathManagerServiceNotStarted$str() {
        return "WFLYLOG0008: パスマネージャーサービスが起動されなかったようです。そのため、変更が失われる可能性があります。";
    }
    @Override
    protected String loggingProfileNotFound$str() {
        return "WFLYLOG0010: デプロイメント '%2$s' に指定されたロギングプロファイル '%1$s' が見つかりません。システムロギング設定を使用します。";
    }
    @Override
    protected String julConfigurationFileFound$str() {
        return "WFLYLOG0011: '%1$s' の設定ファイルは J.U.L. 設定ファイルのようです。ログマネージャーはこのタイプの設定ファイルを許可しません。";
    }
    @Override
    protected String replacingNamedHandler$str() {
        return "WFLYLOG0012: 追加操作中にハンドラー '%1$s' を置き換えます。ハンドラー型またはモジュール名のいずれかが初期設定とは異なります。";
    }
    @Override
    protected String replacingConfigurator$str() {
        return "WFLYLOG0013: 設定クラス '%1$s' は既知のコンフィギュレーターではないため、置き換えられます。";
    }
    @Override
    protected String logContextNotRemoved$str() {
        return "WFLYLOG0014: ログコンテキスト (%1$s) をデプロイメント %2$s に対して削除できませんでした";
    }
    @Override
    protected String perDeploymentPropertyDeprecated$str() {
        return "WFLYLOG0015: ロギングごとのデプロイメントプロパティー (%1$s) は非推奨となりました。%2$s 属性を使用してデプロイメントごとのロギングを有効または無効にしてください。";
    }
    @Override
    protected String perLoggingDeploymentIgnored$str() {
        return "WFLYLOG0016: デプロイメント %3$s の設定ファイルを無視するよう属性 %2$s が設定されたため、ロギングごとのデプロイメントプロパティー (%1$s) は無視されました。";
    }
    @Override
    protected String cannotLoadModule$str() {
        return "WFLYLOG0019: %2$s '%3$s' のモジュール '%1$s' をロードできませんでした。";
    }
    @Override
    protected String classNotFound$str() {
        return "WFLYLOG0021: クラス '%1$s' が見つかりませんでした。";
    }
    @Override
    protected String handlerAlreadyDefined$str() {
        return "WFLYLOG0023: ハンドラー %1$s はすでに割り当てられています。";
    }
    @Override
    protected String invalidFilter$str() {
        return "WFLYLOG0025: フィルター %1$s は無効です。";
    }
    @Override
    protected String invalidLogLevel$str() {
        return "WFLYLOG0026: ログレベル %1$s は無効です。";
    }
    @Override
    protected String invalidOverflowAction$str() {
        return "WFLYLOG0027: オーバーフローアクション %1$s は無効です。";
    }
    @Override
    protected String invalidSize$str() {
        return "WFLYLOG0028: 無効なサイズ %1$s";
    }
    @Override
    protected String loggerNotFound$str() {
        return "WFLYLOG0035: ロガー '%1$s' は見つかりませんでした。";
    }
    @Override
    protected String invalidRelativeTo$str() {
        return "WFLYLOG0039: 絶対パス (%1$s) を relative-to に指定できません。";
    }
    @Override
    protected String invalidSuffix$str() {
        return "WFLYLOG0041: 接尾辞 (%1$s) は無効です。接尾辞は有効な日付形式でなければなりません。";
    }
    @Override
    protected String failedToConfigureLogging$str() {
        return "WFLYLOG0042: '%1$s' 設定ファイルを使ったロギング設定に失敗しました。";
    }
    @Override
    protected String errorProcessingLoggingConfiguration$str() {
        return "WFLYLOG0043: ロギング設定ファイルの検索中にエラーが発生しました。";
    }
    @Override
    protected String handlerAttachedToHandlers$str() {
        return "WFLYLOG0044: ハンドラー %1$s は以下のハンドラーに接続しているため、削除できません; %2$s";
    }
    @Override
    protected String handlerAttachedToLoggers$str() {
        return "WFLYLOG0045: ハンドラー %1$s は以下のロガーに接続しているため、削除できません; %2$s";
    }
    @Override
    protected String cannotAddHandlerToSelf$str() {
        return "WFLYLOG0046: ハンドラー (%1$s) をそれ自体に追加できません。";
    }
    @Override
    protected String handlerClosed$str() {
        return "WFLYLOG0047: ハンドラーは閉じられています。閉じられているハンドラーへ公開できません。";
    }
    @Override
    protected String handlerConfigurationNotFound$str() {
        return "WFLYLOG0048: ハンドラー %1$s の設定が見つかりませんでした。";
    }
    @Override
    protected String loggerConfigurationNotFound$str() {
        return "WFLYLOG0049: ロガー '%1$s' の設定は見つかりませんでした。";
    }
    @Override
    protected String unsupportedMethod$str() {
        return "WFLYLOG0050: クラス %2$s 上のメソッド %1$s はサポートされません。";
    }
    @Override
    protected String failedToWriteConfigurationFile$str() {
        return "WFLYLOG0051: 設定ファイル %1$s の書き込みに失敗しました。";
    }
    @Override
    protected String formatterNotFound$str() {
        return "WFLYLOG0061: フォーマッター '%1$s' が見つかりません。";
    }
    @Override
    protected String truncatedFilterExpression$str() {
        return "WFLYLOG0070: 省略されたフィルター式文字列";
    }
    @Override
    protected String invalidEscapeFoundInFilterExpression$str() {
        return "WFLYLOG0071: フィルター式文字列に無効なエスケープが見つかりました。";
    }
    @Override
    protected String filterNotFound$str() {
        return "WFLYLOG0072: フィルター '%1$s' が見つかりません。";
    }
    @Override
    protected String expectedIdentifier$str() {
        return "WFLYLOG0073: フィルター式で次に想定される識別子";
    }
    @Override
    protected String expectedString$str() {
        return "WFLYLOG0074: フィルター式で次に想定される文字列";
    }
    @Override
    protected String expected1$str() {
        return "WFLYLOG0075: フィルター式で次に想定される '%1$s'";
    }
    @Override
    protected String expected2$str() {
        return "WFLYLOG0075: フィルター式で次に想定される '%1$s' または '%2$s'";
    }
    @Override
    protected String unexpectedEnd$str() {
        return "WFLYLOG0076: フィルター式の予期せぬ終了";
    }
    @Override
    protected String extensionNotInitialized$str() {
        return "WFLYLOG0078: ロギングシステムではログマネージャーが org.jboss.logmanager.LogManager である必要があります。サブシステムは初期化されず、使用できません。JBoss Log Manager を使用するには、システムプロパティー \"java.util.logging.manager\" を追加し、\"org.jboss.logmanager.LogManager\" に設定しなければなりません。";
    }
    @Override
    protected String failedToReadLogFile$str() {
        return "WFLYLOG0079: ログファイル '%1$s' の読み取りに失敗しました。";
    }
    @Override
    protected String logFileNotFound$str() {
        return "WFLYLOG0080: ファイル '%1$s' は見つからず、%2$s ディレクトリーにありません。";
    }
    @Override
    protected String readNotAllowed$str() {
        return "WFLYLOG0081: ファイル '%1$s' は読み取りできません。";
    }
    @Override
    protected String suffixContainsMillis$str() {
        return "WFLYLOG0082: 接尾辞 (%1$s) に秒またはミリ秒を含むことはできません。";
    }
    @Override
    protected String invalidLogFile$str() {
        return "WFLYLOG0083: パス '%1$s' はディレクトリーで、ログファイルとして使用できません。";
    }
    @Override
    protected String cannotRegisterResourceOfType$str() {
        return "WFLYLOG0084: タイプ %1$s のリソースは登録できません";
    }
    @Override
    protected String cannotRemoveResourceOfType$str() {
        return "WFLYLOG0085: タイプ %1$s のリソースは削除できません";
    }
    @Override
    protected String deploymentNameNotFound$str() {
        return "WFLYLOG0086: アドレス %1$s からデプロイメント名を判断できませんでした。";
    }
    @Override
    protected String errorProcessingLogDirectory$str() {
        return "WFLYLOG0087: ロギングディレクトリー %1$s の処理に失敗しました。ログファイルはリストできません。";
    }
    @Override
    protected String errorDeterminingChildrenExist$str() {
        return "WFLYLOG0088: %1$s に子リソースがあることを確認できませんでした。";
    }
    @Override
    protected String unknownLogManager$str() {
        return "WFLYLOG0089: ログマネージャーチェックが省略されました。ログマネージャーシステムプロパティー \"java.util.logging.manager\" が \"org.jboss.logmanager.LogManager\" に設定されていない可能性があります。現在の値は \"%1$s\" です。MDC や NDC などのログ記録された出力の一部の動作は期待どおりに実行されないことがあります。";
    }
    @Override
    protected String unresolvablePathExpressions$str() {
        return "WFLYLOG0090: どのログファイルが読み取り可能かを判断する間、次のパス式が解決できませんでした: %1$s";
    }
    @Override
    protected String invalidExceptionOutputType$str() {
        return "WFLYLOG0091: 例外出力タイプ %1$s は無効です。";
    }
    @Override
    protected String invalidType$str() {
        return "WFLYLOG0092: 無効な型が見つかりました。%1$s を想定していましたが %2$s が見つかりました。";
    }
    @Override
    protected String failedToConfigureSslContext$str() {
        return "WFLYLOG0093: %1$s %2$s の SSL コンテキストの設定に失敗しました。";
    }
    @Override
    protected String illegalFormatterName$str() {
        return "WFLYLOG0094: フォーマッター名を '-wfcore-pattern-formatter' で終わらせることはできません。";
    }
    @Override
    protected String reservedFilterName$str() {
        return "WFLYLOG0095: 名前 %1$s は予約されたフィルター名であるため、フィルター名として使用できません。予約された名前: %2$s";
    }
    @Override
    protected String invalidFilterNameStart$str() {
        return "WFLYLOG0096: 名前 %1$s は無効な文字 %2$s で始まるためフィルター名として使用できません。";
    }
    @Override
    protected String invalidFilterName$str() {
        return "WFLYLOG0097: 名前 %1$s には無効な文字 %2$s が含まれるためフィルター名として使用できません。";
    }
    @Override
    protected String usageOfAppender$str() {
        return "WFLYLOG0099: custom-handler で log4j アペンダー (%1$s) の使用が見つかりました。アペンダーのカスタムハンドラーとしての使用に対するサポートは非推奨となり、今後のリリースで削除される予定です。";
    }
    @Override
    protected String usageOfLog4j1Config$str() {
        return "WFLYLOG0100: デプロイメント %2$s で log4j 設定ファイル (%1$s) の使用が見つかり明日。デプロイメントでの log4j 設定ファイルに対するサポートは非推奨となり、今後のリリースで削除される予定です。";
    }
}
