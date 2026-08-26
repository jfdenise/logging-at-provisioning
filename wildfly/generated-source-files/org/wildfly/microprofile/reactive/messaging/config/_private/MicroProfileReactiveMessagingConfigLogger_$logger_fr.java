package org.wildfly.microprofile.reactive.messaging.config._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:38+0200")
public class MicroProfileReactiveMessagingConfigLogger_$logger_fr extends MicroProfileReactiveMessagingConfigLogger_$logger implements MicroProfileReactiveMessagingConfigLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveMessagingConfigLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String tracingTypeOverridesProperty$str() {
        return "WFLYRXMCFG0001: Propriété%1$s est réglé sur%2$s . Étant donné que la valeur de%3$s dans le sous-système de messagerie réactive microprofile est défini sur%4$s , la propriété est remplacée pour renvoyer %5$s";
    }
}
