package org.jboss.as.clustering.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:51+0200")
public class InfinispanLogger_$logger_zh_CN extends InfinispanLogger_$logger_zh implements InfinispanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYCLINF0001: 激活 Infinispan 子系统。";
    }
    @Override
    protected String cacheStarted$str() {
        return "WFLYCLINF0002: 从容器 %2$s 启动 %1$s 缓存";
    }
    @Override
    protected String cacheStopped$str() {
        return "WFLYCLINF0003: 从容器 %2$s 停止 %1$s 缓存";
    }
    @Override
    protected String invalidCacheStore$str() {
        return "WFLYCLINF0010: %1$s 不是一个有效的缓存库";
    }
    @Override
    protected String remoteCacheContainerStarted$str() {
        return "WFLYCLINF0029: 已启动远程缓存容器 '%1$s'。";
    }
    @Override
    protected String remoteCacheContainerStopped$str() {
        return "WFLYCLINF0030: 已停止远程缓存容器 '%1$s'。";
    }
    @Override
    protected String remoteCacheMustBeDefined$str() {
        return "WFLYCLINF0031: 指定的 HotRod 协议版本 %1$s 不支持自动创建缓存。必须已经在 Infinispan 服务器上创建名为 '%2$s' 的缓存！";
    }
    @Override
    protected String marshallerEnumValueDeprecated$str() {
        return "WFLYCLINF0033: 属性 '%1$s' 被配置为使用一个已弃用的值： %2$s; 改为使用以下值之一：%3$s";
    }
}
