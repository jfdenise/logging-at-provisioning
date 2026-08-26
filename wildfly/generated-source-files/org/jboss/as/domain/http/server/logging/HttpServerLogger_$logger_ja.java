package org.jboss.as.domain.http.server.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:14+0200")
public class HttpServerLogger_$logger_ja extends HttpServerLogger_$logger implements HttpServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public HttpServerLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String errorContextModuleNotFound$str() {
        return "WFLYDMHTTP0004: スロット %1$s のエラーコンテキストがロードできません。エラーコンテキストを無効化します。";
    }
    @Override
    protected String invalidOperation$str() {
        return "WFLYDMHTTP0005: 無効な操作 '%1$s'";
    }
    @Override
    protected String managementHttpServerAlreadyBuild$str() {
        return "WFLYDMHTTP0014: ManagementHttpServer はこのビルダーを使用して既にビルドされています。";
    }
    @Override
    protected String realmNotReadyForSecuredManagementHandler$str() {
        return "WFLYDMHTTP0016: アプリケーションサーバーの実行中ですが、HTTP 管理インターフェイスへのアクセスを可能にするユーザーが追加されていません。新規ユーザーを追加するには、WildFly インストールの bin ディレクトリー内で %1$s スクリプトを実行し、要求された情報を入力します。デフォルトでは、WildFly によって使用されるレルム名は「ManagementRealm」で、すでに add-user ツールによってデフォルトで選択されています。";
    }
    @Override
    protected String consoleModuleNotFoundMsg$str() {
        return "WFLYDMHTTP0007: モジュール名が %1$s のコンソールモジュールはありません。";
    }
    @Override
    protected String uploadError$str() {
        return "WFLYDMHTTP0002: デプロイメントアップロードリクエスト実行時の予期せぬエラー";
    }
    @Override
    protected String realmNotReadyMessage$str() {
        return "WFLYDMHTTP0006: セキュリティーレルムは要求を処理する準備ができていません。%1$s を参照してください。";
    }
    @Override
    protected String httpsRedirectNotSupported$str() {
        return "WFLYDMHTTP0011: 管理インターフェイスで HTTP (%1$s) および HTTPS (%2$s) に対して異なるアドレスが使用されています。HTTP ソケットから HTTPS ソケットへの HTTPS 要求のリダイレクトはサポートされません。";
    }
    @Override
    protected String sslRequestedNoSslContext$str() {
        return "WFLYDMHTTP0012: HTTP インターフェイスにセキュアソケットが定義されましたが、参照されたセキュリティーレルムは SSLContext を提供しません。";
    }
    @Override
    protected String consoleModuleNotFound$str() {
        return "WFLYDMHTTP0003: スロット %1$s のコンソールモジュールをロードできません。コンソールを無効にします。";
    }
    @Override
    protected String invalidUseStreamAsResponseIndex$str() {
        return "WFLYDMHTTP0013: 無効な useStreamIndex の値 '%1$d'。操作のレスポンスには %2$d ストリームがアタッチされました。";
    }
    @Override
    protected String noRealmOrSSLContext$str() {
        return "WFLYDMHTTP0015: SecurityRealm または SSLContext が指定されていません。";
    }
    @Override
    protected String modelRequestError$str() {
        return "WFLYDMHTTP0001: モデルリクエスト実行時の予期せぬエラー";
    }
    @Override
    protected String invalidCredentialType$str() {
        return "WFLYDMHTTP0010: 無効なクレデンシャル型 '%1$s'";
    }
}
