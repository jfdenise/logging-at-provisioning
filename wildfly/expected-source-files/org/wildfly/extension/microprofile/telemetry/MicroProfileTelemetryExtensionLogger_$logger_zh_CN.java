package org.wildfly.extension.microprofile.telemetry;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:22+0200")
public class MicroProfileTelemetryExtensionLogger_$logger_zh_CN extends MicroProfileTelemetryExtensionLogger_$logger_zh implements MicroProfileTelemetryExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileTelemetryExtensionLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMPTEL0001: 激活 MicroProfile Telemetry 子系统";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYMPTEL0002: 部署 %1$s 需要使用 '%2$s' 功能，但它当前没有被注册";
    }
}
