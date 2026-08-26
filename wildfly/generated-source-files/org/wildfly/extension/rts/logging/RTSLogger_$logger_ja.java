package org.wildfly.extension.rts.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:49+0200")
public class RTSLogger_$logger_ja extends RTSLogger_$logger implements RTSLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public RTSLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failueOnImportingGlobalTransactionFromWildflyClient$str() {
        return "WFLYRTS0001: グローバルトランザクションを wildfly トランザクションクライアントにインポートできません。";
    }
    @Override
    protected String cannotGetTransactionStatus$str() {
        return "WFLYRTS0002: レスポンスコンテキスト %1$s の処理でトランザクションの状態を取得できません。";
    }
}
