package org.wildfly.extension.microprofile.opentracing;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:21+0200")
public class TracingExtensionLogger_$logger_zh_CN extends TracingExtensionLogger_$logger_zh implements TracingExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public TracingExtensionLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYTRACEXT0001: 激活 MicroProfile OpenTracing 子系统";
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "WFLYTRACEXT0013: 无法执行迁移操作：服务器必须在 admin-only 模式下";
    }
    @Override
    protected String migrationFailed$str() {
        return "WFLYTRACEXT0014: 迁移失败。更多详情请参阅结果。";
    }
}
