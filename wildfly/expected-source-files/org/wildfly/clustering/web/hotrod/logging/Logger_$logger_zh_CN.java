package org.wildfly.clustering.web.hotrod.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:48+0200")
public class Logger_$logger_zh_CN extends Logger_$logger_zh implements Logger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public Logger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToExpireSession$str() {
        return "WFLYCLWEBHR0001: 使会话 %1$s 过期失败";
    }
    @Override
    protected String failedToActivateSession$str() {
        return "WFLYCLWEBHR0007: 激活会话 %1$s 的属性失败";
    }
    @Override
    protected String failedToActivateSessionAttribute$str() {
        return "WFLYCLWEBHR0008: 激活会话 %1$s 的属性 %2$s 失败";
    }
    @Override
    protected String failedToReadSessionAttribute$str() {
        return "WFLYCLWEBHR0009: 激活会话 %1$s 的属性 %2$s 失败";
    }
    @Override
    protected String failedToActivateAuthentication$str() {
        return "WFLYCLWEBHR0010: 在 %1$s 上激活单点登录验证失败";
    }
    @Override
    protected String missingSessionAttributeCacheEntry$str() {
        return "WFLYCLWEBHR0011: 会话 %1$s 缺失了属性 %2$s 的缓存条目";
    }
}
