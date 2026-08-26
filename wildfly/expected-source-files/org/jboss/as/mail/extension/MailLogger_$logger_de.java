package org.jboss.as.mail.extension;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:52+0200")
public class MailLogger_$logger_de extends MailLogger_$logger implements MailLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MailLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String boundMailSession$str() {
        return "WFLYMAIL0001: Gebundene Mail-Session [%1$s]";
    }
    @Override
    protected String unboundMailSession$str() {
        return "WFLYMAIL0002: Ungebundene Mail-Session [%1$s]";
    }
    @Override
    protected String removedMailSession$str() {
        return "WFLYMAIL0003: Mail-Session [%1$s] entfernt";
    }
    @Override
    protected String outboundSocketBindingNotAvailable$str() {
        return "WFLYMAIL0004: Keine ausgehende Socket-Binding-Konfiguration '%1$s' ist verfügbar.";
    }
    @Override
    protected String hostUnknown$str() {
        return "WFLYMAIL0009: Hostname [%1$s] konnte nicht aufgelöst werden!";
    }
}
