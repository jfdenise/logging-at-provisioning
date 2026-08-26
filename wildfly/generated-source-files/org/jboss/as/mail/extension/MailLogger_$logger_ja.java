package org.jboss.as.mail.extension;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:28+0200")
public class MailLogger_$logger_ja extends MailLogger_$logger implements MailLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MailLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unboundMailSession$str() {
        return "WFLYMAIL0002: メールセッション [%1$s] をアンバインドしました。";
    }
    @Override
    protected String boundMailSession$str() {
        return "WFLYMAIL0001: メールセッション [%1$s] をバインドしました。";
    }
    @Override
    protected String outboundSocketBindingNotAvailable$str() {
        return "WFLYMAIL0004: 利用可能なアウトバウンドソケットバインディング設定 '%1$s' がありません。";
    }
    @Override
    protected String removedMailSession$str() {
        return "WFLYMAIL0003: メールセッション [%1$s] を削除しました。";
    }
    @Override
    protected String hostUnknown$str() {
        return "WFLYMAIL0009: ホスト名 [%1$s] は解決できませんでした。";
    }
}
