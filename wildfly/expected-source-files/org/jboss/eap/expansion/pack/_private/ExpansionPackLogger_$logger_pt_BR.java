package org.jboss.eap.expansion.pack._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:09+0200")
public class ExpansionPackLogger_$logger_pt_BR extends ExpansionPackLogger_$logger_pt implements ExpansionPackLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ExpansionPackLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String expansionPackActive$str() {
        return "JBEAPXP0003: Iniciando o servidor com %1$s instalado.";
    }
}
