package org.wildfly.microprofile.reactive.messaging.config._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.wildfly.microprofile.reactive.messaging.config.TracingType;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T12:02:21+0200")
public class MicroProfileReactiveMessagingConfigLogger_$logger extends DelegatingBasicLogger implements MicroProfileReactiveMessagingConfigLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MicroProfileReactiveMessagingConfigLogger_$logger.class.getName();
    public MicroProfileReactiveMessagingConfigLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void tracingTypeOverridesProperty(final String propertyName, final String value, final String connectorAttribute, final TracingType type, final String fromTracingType) {
        super.log.logf(FQCN, WARN, null, tracingTypeOverridesProperty$str(), propertyName, value, connectorAttribute, type, fromTracingType);
    }
    protected String tracingTypeOverridesProperty$str() {
        return "WFLYRXMCFG0001: Property %s is set to %s. Since the value for %s in the microprofile-reactive-messaging subsystem is set to %s, the property is overridden to return %s";
    }
}
