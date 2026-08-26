package org.jboss.as.service.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:13+0200")
public class SarLogger_$logger_ja extends SarLogger_$logger implements SarLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SarLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedExecutingLegacyMethod$str() {
        return "WFLYSAR0001: レガシーサービス %1$s メソッドの実行に失敗しました。";
    }
    @Override
    protected String propertyNotFound$str() {
        return "WFLYSAR0002: 型 %1$s に対し PropertyEditor を見つけることができません。";
    }
    @Override
    protected String classNotFound$str() {
        return "WFLYSAR0003: クラスが見つかりません。";
    }
    @Override
    protected String classNotInstantiated$str() {
        return "WFLYSAR0004: クラスはインスタンス化されていません。";
    }
    @Override
    protected String failedToGetAttachment$str() {
        return "WFLYSAR0005: %2$s へのアタッチメント %1$s の取得に失敗しました。";
    }
    @Override
    protected String failedXmlParsing$str() {
        return "WFLYSAR0006: サービス xml [%1$s] の解析に失敗しました。";
    }
    @Override
    protected String methodNotFound$str() {
        return "WFLYSAR0007: メソッド '%1$s(%2$s)' が見つかりません: %3$s";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYSAR0008: 必須属性が1つ以上見つかりません:";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYSAR0009: %1$s が null です";
    }
    @Override
    protected String propertyMethodNotFound$str() {
        return "WFLYSAR0010: プロパティー '%2$s' の %1$s メソッドが見つかりません: %3$s";
    }
    @Override
    protected String unexpectedContent$str() {
        return "WFLYSAR0011: 型 '%1$s' 名前 '%2$s' の予期せぬコンテンツ、テキスト: %3$s";
    }
    @Override
    protected String failedToProcessSarChild$str() {
        return "WFLYSAR0012: [%1$s] の SAR 子アーカイブを処理できませんでした。";
    }
    @Override
    protected String malformedDependencyName$str() {
        return "WFLYSAR0013: 不正な依存関係名 %1$s";
    }
    @Override
    protected String defaultConstructorNotFound$str() {
        return "WFLYSAR0014: %1$s のデフォルトのコンストラクターが見つかりませんでした。";
    }
    @Override
    protected String mbeanRegistrationFailed$str() {
        return "WFLYSAR0015: mbean [%1$s] の登録に失敗しました。";
    }
    @Override
    protected String cannotUnregisterObject$str() {
        return "WFLYSAR0016: ObjectName がないため登録解除できません。";
    }
    @Override
    protected String unregistrationFailure$str() {
        return "WFLYSAR0017: 登録解除に失敗しました [%1$s]";
    }
    @Override
    protected String objectSupplierNotAvailable$str() {
        return "WFLYSAR0018: オブジェクトサプライヤーが利用できません";
    }
    @Override
    protected String objectNotAvailable$str() {
        return "WFLYSAR0019: オブジェクトが利用できません";
    }
    @Override
    protected String methodIsNotAccessible$str() {
        return "WFLYSAR0020: メソッドにアクセスできません";
    }
    @Override
    protected String failedToInvokeMethod$str() {
        return "WFLYSAR0021: メソッドの呼び出しに失敗しました";
    }
}
