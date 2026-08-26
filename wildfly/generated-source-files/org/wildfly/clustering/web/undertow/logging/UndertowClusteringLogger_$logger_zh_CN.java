package org.wildfly.clustering.web.undertow.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:08+0200")
public class UndertowClusteringLogger_$logger_zh_CN extends UndertowClusteringLogger_$logger_zh implements UndertowClusteringLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public UndertowClusteringLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String legacySingleSignOnProviderInUse$str() {
        return "WFLYCLWEBUT0008: 没有找到 %1$s 的可分发单点登录管理提供程序；使用基于静态配置的旧提供程序";
    }
    @Override
    protected String legacyRoutingProviderInUse$str() {
        return "WFLYCLWEBUT0007: 没有找到 %1$s 的路由提供程序；使用基于静态配置的旧提供程序";
    }
    @Override
    protected String sessionIsInvalid$str() {
        return "WFLYCLWEBUT0001: 会话 %1$s 无效";
    }
    @Override
    protected String sessionManagerStopped$str() {
        return "WFLYCLWEBUT0003: 会话管理者已停止";
    }
    @Override
    protected String legacySessionManagementProviderOverride$str() {
        return "WFLYCLWEBUT0004: 旧的 <replication-config/> 会覆盖附加的 %1$s 的可分发会话提供程序";
    }
    @Override
    protected String legacySessionManagementProviderInUse$str() {
        return "WFLYCLWEBUT0005: 没有为 %1$s 找到可分发的会话管理提供程序；使用基于 <replication-config/> 的旧的提供程序";
    }
}
