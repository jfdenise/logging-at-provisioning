package org.wildfly.extension.messaging.activemq.injection._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:52+0200")
public class MessagingLogger_$logger_de extends MessagingLogger_$logger implements MessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MessagingLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String callNotPermittedOnInjectedJMSContext$str() {
        return "WFLYMSGAMQINJ0001: Es ist nicht zulässig, diese Methode auf injiziertem JMSContext aufzurufen (siehe Jakarta Messaging 2.0 Spezifikation, §12.4.5).";
    }
}
