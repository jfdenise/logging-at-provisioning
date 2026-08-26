package org.wildfly.clustering.ee.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:17+0200")
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
    protected String failedToCancel$str() {
        return "WFLYCLEEINF0001: 在主所有者上取消 %1$s 失败。";
    }
    @Override
    protected String failedToSchedule$str() {
        return "WFLYCLEEINF0002: 在主所有者上调度 %1$s 失败。";
    }
}
