package org.jboss.as.jpa.hibernate;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:36+0200")
public class JpaLogger_$logger_zh_CN extends JpaLogger_$logger_zh implements JpaLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JpaLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String secondLevelCacheIsEnabled$str() {
        return "JIPIORMV6020260: 为 %1$s 启用二级缓存";
    }
    @Override
    protected String HibernateORMDidNotRegisterLifeCycleListener$str() {
        return "JIPIORMV6020261: Hibernate ORM 没有注册 LifeCycleListener";
    }
    @Override
    protected String ignoredCacheRegionSetting$str() {
        return "JIPIORMV6020262: 应用程序自定义缓存区域设置被忽略 %1$s=%2$s";
    }
    @Override
    protected String failOnIncompatibleSetting$str() {
        return "JIPIORMV6020263: 不支持将 Hibernate.id.new_generator_mappings 设为 false，删除设置或设为 true。请参阅 Hibernate ORM 迁移文档来了解如何更新应用程序数据库中的下一个 id 状态。";
    }
    @Override
    protected String unableOpenInputStream$str() {
        return "JIPIORMV6020264: 无法打开基于 VirtualFile 的 InputStream";
    }
}
