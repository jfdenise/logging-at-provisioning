package org.wildfly.microprofile.reactive.messaging.config._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:21+0200")
public class MicroProfileReactiveMessagingConfigLogger_$logger_pt_BR extends MicroProfileReactiveMessagingConfigLogger_$logger_pt implements MicroProfileReactiveMessagingConfigLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveMessagingConfigLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String tracingTypeOverridesProperty$str() {
        return "WFLYRXMCFG0001: A propriedade %1$s está definido como %2$s. Já que o valor para %3$s no subsistema microprofile-reactive-messaging está definido como %4$s, a propriedade é substituída para retornar %5$s";
    }
}
