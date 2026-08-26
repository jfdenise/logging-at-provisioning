package org.wildfly.microprofile.reactive.messaging.config._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:38+0200")
public class MicroProfileReactiveMessagingConfigLogger_$logger_zh_CN extends MicroProfileReactiveMessagingConfigLogger_$logger_zh implements MicroProfileReactiveMessagingConfigLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveMessagingConfigLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String tracingTypeOverridesProperty$str() {
        return "WFLYRXMCFG0001: 属性 %1$s 被设置为 %2$s。由于 microprofile-reactive-messaging 子系统中 %3$s 的值被设为 %4$s，所以属性会被覆盖以返回 %5$s";
    }
}
