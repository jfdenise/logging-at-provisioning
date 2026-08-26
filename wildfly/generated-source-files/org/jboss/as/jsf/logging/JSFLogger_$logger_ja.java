package org.jboss.as.jsf.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:26+0200")
public class JSFLogger_$logger_ja extends JSFLogger_$logger implements JSFLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JSFLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String classLoadingFailed$str() {
        return "WFLYJSF0008: アノテーションが付いたクラスのロードに失敗しました: %1$s";
    }
    @Override
    protected String loadingJsf12$str() {
        return "WFLYJSF0017: Faces 1.2 クラスが検出されました。org.jboss.as.jsf.injection.weld.legacy.WeldApplicationFactoryLegacy を使用しています。";
    }
    @Override
    protected String lazyBeanValidationEnabled$str() {
        return "WFLYJSF0020: Lazy Bean の検証が有効化されました。これにより、分散 Web セッションが期限切れになると @PreDestroy イベントがないことがあります。";
    }
    @Override
    protected String jsfInjectionFailed$str() {
        return "WFLYJSF0016: スロット %1$s からの Jakarta Server Faces の挿入に失敗しました";
    }
    @Override
    protected String jsfArtifactNoDefaultConstructor$str() {
        return "WFLYJSF0019: クラス %2$s を持つ Jakarta Server Faces アーティファクト %1$s にデフォルトのコンストラクターがないため、インジェクションの対象とみなされません。";
    }
    @Override
    protected String unknownJSFVersion$str() {
        return "WFLYJSF0005: 不明な Jakarta Server Faces バージョン '%1$s'。代わりにデフォルトのバージョン '%2$s' が使用されます。";
    }
    @Override
    protected String activatedJSFImplementations$str() {
        return "WFLYJSF0007: 以下の Jakarta Server Faces 実装をアクティベートしました。%1$s";
    }
    @Override
    protected String invalidDefaultJSFImpl$str() {
        return "WFLYJSF0014: デフォルトの Jakarta Server Faces 実装スロット '%1$s' は無効です";
    }
    @Override
    protected String managedBeansConfigParseFailed$str() {
        return "WFLYJSF0004: %1$s の解析に失敗しました。このファイルに定義された Jakarta Server Faces アーティファクトは利用できません";
    }
    @Override
    protected String missingJSFModule$str() {
        return "WFLYJSF0006: Jakarta Server Faces バージョンスロット '%1$s' がモジュール %2$s にありません";
    }
    @Override
    protected String invalidAnnotationLocation$str() {
        return "WFLYJSF0009: クラス %2$s 内のアノテーション %1$s はクラス上でのみ利用可能です。";
    }
    @Override
    protected String loadingJsf2x$str() {
        return "WFLYJSF0018: Faces 1.2 クラスは検出されませんでhした。org.jboss.as.jsf.injection.weld.WeldApplicationFactory を使用しています。";
    }
}
