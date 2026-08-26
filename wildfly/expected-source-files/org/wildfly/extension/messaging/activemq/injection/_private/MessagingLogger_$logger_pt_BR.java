package org.wildfly.extension.messaging.activemq.injection._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:52+0200")
public class MessagingLogger_$logger_pt_BR extends MessagingLogger_$logger_pt implements MessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MessagingLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String callNotPermittedOnInjectedJMSContext$str() {
        return "WFLYMSGAMQINJ0001: Não é permitido chamar este método em JMSContext injetado (consulte JMS 2.0 spec, , Â§12.4.5).";
    }
}
