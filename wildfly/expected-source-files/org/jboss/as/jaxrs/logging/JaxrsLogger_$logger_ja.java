package org.jboss.as.jaxrs.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:48+0200")
public class JaxrsLogger_$logger_ja extends JaxrsLogger_$logger implements JaxrsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JaxrsLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String classAnnotationNotFound$str() {
        return "WFLYRS0001: %1$s アノテーションはクラスにはありません: %2$s";
    }
    @Override
    protected String classOrMethodAnnotationNotFound$str() {
        return "WFLYRS0002: %1$s アノテーションはクラスあるいはメソッドにはありません: %2$s";
    }
    @Override
    protected String moreThanOneServletMapping$str() {
        return "WFLYRS0003: Jakarta RESTful Web Services サーブレットに複数のマッピングが見つかりました: %1$s。2 番目のマッピング %2$s は機能しません";
    }
    @Override
    protected String cannotLoadApplicationClass$str() {
        return "WFLYRS0006: Jakarta RESTful Web Services アプリケーションクラスをロードできませんでした";
    }
    @Override
    protected String typeNameNotAnEjbView$str() {
        return "WFLYRS0010: Jakarta RESTful Web Services リソース %1$s は、Jakarta Enterprise Beans %2$s のビューに対応していません。@Path アノテーションは、Jakarta Enterprise Beans のローカルビュー、リモートビュー、またはインターフェイスなしのビューを表すクラスまたはインターフェイスにのみ指定できます。";
    }
    @Override
    protected String invalidParamValue$str() {
        return "WFLYRS0011: パラメーター %1$s の値は無効です: %2$s";
    }
    @Override
    protected String noSpringIntegrationJar$str() {
        return "WFLYRS0012: spring integration jar がありません";
    }
    @Override
    protected String disablePropertyDeprecated$str() {
        return "WFLYRS0013: コンテキスト param org.jboss.as.jaxrs.disableSpringIntegration は廃止され、将来のリリースで削除される予定です。代わりに org.jboss.as.jaxrs.enableSpringIntegration を使用してください";
    }
    @Override
    protected String failedToRegisterManagementViewForRESTResources$str() {
        return "WFLYRS0014: REST リソースクラスの管理ビューを登録できませんでした: %1$s";
    }
    @Override
    protected String noServletDeclaration$str() {
        return "WFLYRS0015: Jakarta RESTful Web Services アプリケーションのサーブレット宣言がありません。%1$s では、jakarta.ws.rs.core.Application を拡張するクラスを提供するか、web.xml でサーブレットクラスを宣言します。";
    }
    @Override
    protected String resteasyVersion$str() {
        return "WFLYRS0016: RESTEasy バージョン %1$s";
    }
    @Override
    protected String failedToReadAttribute$str() {
        return "WFLYRS0017: 名前が %2$s の %1$s にある Jakarta RESTful Services デプロイメントから属性を読み取りできませんでした";
    }
    @Override
    protected String jacksonAnnotationDetected$str() {
        return "WFLYRS0018: Jakarta RESTful Web Services デプロイメントでの Jackson アノテーションの明示的な使用。システムは現在のデプロイメントの Jakarta JSON Binding 処理を無効にします。Jakarta JSON Binding を有効にするには %1$s プロパティーを false に設定してください。";
    }
    @Override
    protected String paramConverterFailed$str() {
        return "WFLYRS0019: パラメーターコンバーター %4$s を使用したメソッド %3$s のパラメーター %2$s のデフォルト値 %1$s を変換するエラー。例外 %5$s : %6$s";
    }
    @Override
    protected String baseTypeMethodFailed$str() {
        return "WFLYRS0020: \"メソッド %4$s を使用したメソッド %3$s のパラメーター %2$s のデフォルト値 %1$s を変換するエラー。例外 %5$s : %6$s\"";
    }
    @Override
    protected String classIntrospectionFailure$str() {
        return "WFLYRS0021: %1$s %2$s";
    }
    @Override
    protected String tracingEnabled$str() {
        return "WFLYRS0029: RESTEasy トレース API は、デプロイメント \"%1$s\" 向けに有効化されました。これは実稼働環境向けではありません。";
    }
    @Override
    protected String invalidConfigurationFactory$str() {
        return "WFLYRS0030: 無効な ConfigurationFactory が %1$s を見つけました";
    }
    @Override
    protected String failedToLoadConfigurationFactory$str() {
        return "WFLYRS0031: RESTEasy MicroProfile 設定のロードに失敗しました: %1$s";
    }
}
