package org.jboss.as.appclient.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:01+0200")
public class AppClientLogger_$logger_ja extends AppClientLogger_$logger implements AppClientLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public AppClientLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String argHelp$str() {
        return "このメッセージを表示し、終了";
    }
    @Override
    protected String malformedUrl$str() {
        return "WFLYAC0017: オプション %1$s に提示された形式の URL は不正です";
    }
    @Override
    protected String cannotLoadAppClientMainClass$str() {
        return "WFLYAC0008: アプリケーションクライアントのメインクラスをロードできませんでした";
    }
    @Override
    protected String unknownOption$str() {
        return "WFLYAC0020: 不明なオプション %1$s";
    }
    @Override
    protected String cannotLoadProperties$str() {
        return "WFLYAC0010: URL %1$s からプロパティをロードできません";
    }
    @Override
    protected String failedToParseXml1$str() {
        return "WFLYAC0015: %1$s の解析に失敗しました";
    }
    @Override
    protected String usageDescription$str() {
        return "appclient スクリプトにより、デプロイされた Jakarta Enterprise Beans をテストし、その EJB にアクセスするために使用できるアプリケーションクライアントが起動されます。";
    }
    @Override
    protected String cannotStartAppClient1$str() {
        return "WFLYAC0011: メインクラスが見つからなかったため、アプリケーションクライアント %1$s を起動できませんでした";
    }
    @Override
    protected String couldNotLoadCallbackClass$str() {
        return "WFLYAC0021: callback-handler クラス %1$s をロードできませんでした";
    }
    @Override
    protected String appClientNotSpecified$str() {
        return "WFLYAC0004: 実行したいアプリケーションクライアントを指定してください";
    }
    @Override
    protected String cannotStartAppClient2$str() {
        return "WFLYAC0012: メインクラス %2$s で main メソッドが見つからなかったため、アプリケーションクライアント %1$s を起動できませんでした";
    }
    @Override
    protected String multipleAppClientsFound$str() {
        return "WFLYAC0018: 複数のアプリケーションクライアントが見つかりましたが、アプリケーションクライアント名が指定されていません";
    }
    @Override
    protected String cannotSpecifyBothHostAndPropertiesFile$str() {
        return "WFLYAC0024: 接続先ホストと ejb-client.properties の両方を指定できませんでした";
    }
    @Override
    protected String failedToParseXml3$str() {
        return "WFLYAC0016: [%2$d,%3$d] で %1$s の解析に失敗しました";
    }
    @Override
    protected String argSecMgr$str() {
        return "セキュリティーマネージャーが有効な状態でコンテナを実行します。";
    }
    @Override
    protected String argAppClientConfig$str() {
        return "利用するアプリケーションクライアント設定ファイル名 (デフォルトは\"appclient.xml\")";
    }
    @Override
    protected String argumentExpected$str() {
        return "WFLYAC0005: オプション %1$s には引数が想定されます";
    }
    @Override
    protected String argProperties$str() {
        return "指定の url からシステムプロパティーをロードします";
    }
    @Override
    protected String argSystemProperty$str() {
        return "システムプロパティを設定します";
    }
    @Override
    protected String argVersion$str() {
        return "バージョンを出力し、終了";
    }
    @Override
    protected String cannotFindAppClient0$str() {
        return "WFLYAC0006: アプリケーションクライアント jar がデプロイメントで見つかりませんでした";
    }
    @Override
    protected String argConnectionProperties$str() {
        return "指定の url から ejb-client.properties ファイルをロードします";
    }
    @Override
    protected String argHost$str() {
        return "アプリケーションサーバーインスタンスの接続先 URL を設定します";
    }
    @Override
    protected String cannotFindAppClient1$str() {
        return "WFLYAC0007: アプリケーションクライアント %1$s が見つかりませんでした";
    }
    @Override
    protected String couldNotCreateCallbackHandler$str() {
        return "WFLYAC0022: callback-handler クラス %1$s のインスタンスを作成できませんでした";
    }
    @Override
    protected String duplicateSubsystemDeclaration$str() {
        return "WFLYAC0013: サブシステム宣言の重複";
    }
    @Override
    protected String exceptionRunningAppClient$str() {
        return "WFLYAC0002: %1$s が app client main を実行しています。";
    }
    @Override
    protected String cannotFindAppClientFile$str() {
        return "WFLYAC0023: アプリケーションクライアント %1$s が見つかりませんでした";
    }
}
