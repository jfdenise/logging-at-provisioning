package org.wildfly.microprofile.reactive.messaging.config._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:21+0200")
public class MicroProfileReactiveMessagingConfigLogger_$logger_de extends MicroProfileReactiveMessagingConfigLogger_$logger implements MicroProfileReactiveMessagingConfigLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveMessagingConfigLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String tracingTypeOverridesProperty$str() {
        return "WFLYRXMCFG0001: Eigenschaft %1$s ist auf %2$s festgelegt. Da der Wert für %3$s im microprofile-reactive-messaging-Subsystem auf %4$s festgelegt ist, wird die Eigenschaft überschrieben, um %5$s zurückzugeben.";
    }
}
