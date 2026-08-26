package org.wildfly.microprofile.reactive.messaging.config._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:38+0200")
public class MicroProfileReactiveMessagingConfigLogger_$logger_ja extends MicroProfileReactiveMessagingConfigLogger_$logger implements MicroProfileReactiveMessagingConfigLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveMessagingConfigLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String tracingTypeOverridesProperty$str() {
        return "WFLYRXMCFG0001: プロパティー %1$s が %2$s に設定されています。microprofile-reactive-messaging サブシステムの %3$s の値は %4$s に設定されているため、プロパティーがオーバーライドされて %5$s が返されます";
    }
}
