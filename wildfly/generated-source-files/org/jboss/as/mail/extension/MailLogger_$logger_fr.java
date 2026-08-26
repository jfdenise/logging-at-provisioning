package org.jboss.as.mail.extension;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:28+0200")
public class MailLogger_$logger_fr extends MailLogger_$logger implements MailLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MailLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unboundMailSession$str() {
        return "WFLYMAIL0002: Session mail non reliée [%1$s]";
    }
    @Override
    protected String boundMailSession$str() {
        return "WFLYMAIL0001: Session mail reliée [%1$s]";
    }
    @Override
    protected String outboundSocketBindingNotAvailable$str() {
        return "WFLYMAIL0004: Aucune configuration de liaison de socket de sortie '%1$s' n'est disponible.";
    }
    @Override
    protected String removedMailSession$str() {
        return "WFLYMAIL0003: Session mail supprimée [%1$s]";
    }
    @Override
    protected String hostUnknown$str() {
        return "WFLYMAIL0009: Le nom d'hôte [%1$s] n'a pu être résolu!";
    }
}
