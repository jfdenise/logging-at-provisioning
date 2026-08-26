package org.wildfly.extension.mod_cluster;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:00+0200")
public class ModClusterLogger_$logger_ja extends ModClusterLogger_$logger implements ModClusterLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ModClusterLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String errorAddingMetrics$str() {
        return "WFLYMODCLS0001: メトリクスの追加エラー";
    }
    @Override
    protected String multicastInterfaceNotAvailable$str() {
        return "WFLYMODCLS0004: mod_cluster にはアドバタイズが必要ですが、マルチキャストインターフェースは利用できません。";
    }
    @Override
    protected String usingSimpleLoadProvider$str() {
        return "WFLYMODCLS0005: プロキシー '%1$s' に指定された mod_cluster の負荷分散係数プロバイダーはありません。定数係数 '1' で負荷分散係数プロバイダーを使用します。";
    }
    @Override
    protected String errorApplyingMetricProperties$str() {
        return "WFLYMODCLS0006: メトリッククラス '%1$s' をロードするためにプロパティーを適用するときにエラーが発生しました。メトリックはロードされません。";
    }
    @Override
    protected String contextOrHostNotFound$str() {
        return "WFLYMODCLS0011: 仮想ホスト '%1$s' またはコンテキスト '%2$s' が見つかりません。";
    }
    @Override
    protected String excludedContextsWrongFormat$str() {
        return "WFLYMODCLS0019: '%1$s' は excluded-contexts に有効な値ではありません。";
    }
    @Override
    protected String excludedContextsUseSlashInsteadROOT$str() {
        return "WFLYMODCLS0021: excluded-contexts の値 'ROOT' は非推奨です。ルートコンテキストを除外するには代わりに '/' を使用してください。";
    }
    @Override
    protected String errorLoadingModuleForCustomMetric$str() {
        return "WFLYMODCLS0023: カスタムメトリックをロードするモジュール '%1$s' のロードエラー。";
    }
    @Override
    protected String ignoredElement$str() {
        return "WFLYMODCLS0025: '%1$s' 要素はサポートされなくなり、無視されます。";
    }
    @Override
    protected String ignoredAttribute$str() {
        return "WFLYMODCLS0026: 要素 '%2$s' の属性 '%1$s' はサポートされなくなり、無視されます。";
    }
}
