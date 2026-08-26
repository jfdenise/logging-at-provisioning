package org.wildfly.extension.rts.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:49+0200")
public class RTSLogger_$logger_zh_CN extends RTSLogger_$logger_zh implements RTSLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public RTSLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failueOnImportingGlobalTransactionFromWildflyClient$str() {
        return "WFLYRTS0001: 无法将全局事务导入到 wildfly 事务客户端中。";
    }
    @Override
    protected String cannotGetTransactionStatus$str() {
        return "WFLYRTS0002: 在处理响应上下文时无法获取交易状态 %1$s";
    }
}
