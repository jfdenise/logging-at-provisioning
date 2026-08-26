package org.wildfly.extension.microprofile.faulttolerance;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:11+0200")
public class MicroProfileFaultToleranceLogger_$logger_zh_CN extends MicroProfileFaultToleranceLogger_$logger_zh implements MicroProfileFaultToleranceLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileFaultToleranceLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMPFTEXT0001: 激活 MicroProfile 容错子系统。";
    }
    @Override
    protected String metricsProvider$str() {
        return "WFLYMPFTEXT0002: MicroProfile 容错子系统将使用 %1$s 指标提供程序。";
    }
}
