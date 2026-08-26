package org.jboss.as.mail.extension;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:52+0200")
public class MailLogger_$logger_pt_BR extends MailLogger_$logger_pt implements MailLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MailLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String boundMailSession$str() {
        return "WFLYMAIL0001: Sessão de e-mail associada [%1$s]";
    }
    @Override
    protected String unboundMailSession$str() {
        return "WFLYMAIL0002: Sessão de e-mail não associada [%1$s]";
    }
    @Override
    protected String removedMailSession$str() {
        return "WFLYMAIL0003: Sessão de e-mail removida [%1$s]";
    }
    @Override
    protected String outboundSocketBindingNotAvailable$str() {
        return "WFLYMAIL0004: Nenhuma configuração de socket binding de saída '%1$s' disponível.";
    }
    @Override
    protected String hostUnknown$str() {
        return "WFLYMAIL0009: O nome de host [%1$s] não pode ser resolvido!";
    }
}
