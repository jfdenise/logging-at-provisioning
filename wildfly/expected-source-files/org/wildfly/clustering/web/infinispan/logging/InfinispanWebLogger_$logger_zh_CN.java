package org.wildfly.clustering.web.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:48+0200")
public class InfinispanWebLogger_$logger_zh_CN extends InfinispanWebLogger_$logger_zh implements InfinispanWebLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanWebLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToPassivateSession$str() {
        return "WFLYCLWEBINF0001: 钝化会话 %1$s 的属性失败";
    }
    @Override
    protected String failedToPassivateSessionAttribute$str() {
        return "WFLYCLWEBINF0002: 钝化会话 %1$s 的属性 %2$s 失败";
    }
    @Override
    protected String invalidSession$str() {
        return "WFLYCLWEBINF0003: 会话 %1$s 无效";
    }
    @Override
    protected String failedToExpireSession$str() {
        return "WFLYCLWEBINF0004: 使会话 %1$s 过期失败";
    }
    @Override
    protected String failedToCancelSession$str() {
        return "WFLYCLWEBINF0005: 取消主要所有者上的会话 %1$s 的终止/钝化失败。";
    }
    @Override
    protected String failedToScheduleSession$str() {
        return "WFLYCLWEBINF0006: 调度主要所有者上的会话 %1$s 的终止/钝化失败。";
    }
    @Override
    protected String failedToActivateSession$str() {
        return "WFLYCLWEBINF0007: 激活会话 %1$s 的属性失败";
    }
    @Override
    protected String failedToActivateSessionAttribute$str() {
        return "WFLYCLWEBINF0008: 激活会话 %1$s 的属性 %2$s 失败";
    }
    @Override
    protected String failedToReadSessionAttribute$str() {
        return "WFLYCLWEBINF0009: 激活会话 %1$s 的属性 %2$s 失败";
    }
    @Override
    protected String failedToActivateAuthentication$str() {
        return "WFLYCLWEBINF0010: 在 %1$s 上激活单点登录验证失败";
    }
    @Override
    protected String missingSessionAttributeCacheEntry$str() {
        return "WFLYCLWEBINF0011: 会话 %1$s 缺失了属性 %2$s 的缓存条目";
    }
    @Override
    protected String evictionDisabled$str() {
        return "WFLYCLWEBINF0012: 为缓存 '%1$s' 禁用逐出。应通过 jboss-web.xml 中的 <max-active-sessions/> 来配置 Web 会话钝化。";
    }
    @Override
    protected String expirationDisabled$str() {
        return "WFLYCLWEBINF0013: 为缓存 '%1$s' 禁用过期。应按照 servlet 规范的 §7.5 来配置 Web 会话过期。";
    }
}
