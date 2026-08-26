package org.jboss.as.mail.extension;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:52+0200")
public class MailLogger_$logger_zh_CN extends MailLogger_$logger_zh implements MailLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MailLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String boundMailSession$str() {
        return "WFLYMAIL0001: 绑定 mail 会话 [%1$s]";
    }
    @Override
    protected String unboundMailSession$str() {
        return "WFLYMAIL0002: 解除 mail 会话 [%1$s] 的绑定";
    }
    @Override
    protected String removedMailSession$str() {
        return "WFLYMAIL0003: 删除的 mail 会话 [%1$s]";
    }
    @Override
    protected String outboundSocketBindingNotAvailable$str() {
        return "WFLYMAIL0004: 没有可用的转出套接字绑定配置 '%1$s'。";
    }
    @Override
    protected String hostUnknown$str() {
        return "WFLYMAIL0009: 无法解析主机名 [%1$s]！";
    }
}
