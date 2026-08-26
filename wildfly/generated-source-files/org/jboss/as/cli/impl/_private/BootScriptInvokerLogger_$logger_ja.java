package org.jboss.as.cli.impl._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:03+0200")
public class BootScriptInvokerLogger_$logger_ja extends BootScriptInvokerLogger_$logger implements BootScriptInvokerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BootScriptInvokerLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cliOutput$str() {
        return "WFLYCLI0004: CLI 実行出力:";
    }
    @Override
    protected String executeCommand$str() {
        return "WFLYCLI0006: CLI コマンド %1$s の実行";
    }
    @Override
    protected String unexpectedException$str() {
        return "WFLYCLI0007: %1$s からの CLI コマンドの処理中の予期しない例外";
    }
    @Override
    protected String propertiesFileNotFound$str() {
        return "WFLYCLI0003: CLI プロパティーファイルが見つかりませんでした %1$s";
    }
    @Override
    protected String unexpectedErrors$str() {
        return "WFLYCLI0008: CLI スクリプト %1$s の処理中にエラーが発生しました。Operations が実行されましたが、予期しない値が発生しました。%2$s のエラーのリストを参照してください";
    }
    @Override
    protected String unexpectedCommandException$str() {
        return "WFLYCLI0009: %2$s からの CLI コマンド %1$s の処理中に予期しない例外";
    }
    @Override
    protected String errorProcessingScript$str() {
        return "WFLYCLI0002: CLI スクリプトの処理中にエラーが発生しました %1$s";
    }
    @Override
    protected String doneProcessScript$str() {
        return "WFLYCLI0005: CLI スクリプト %1$s の処理が完了";
    }
    @Override
    protected String processScript$str() {
        return "WFLYCLI0001: CLI スクリプトの処理 %1$s";
    }
}
