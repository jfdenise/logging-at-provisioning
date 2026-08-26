package org.jboss.as.weld._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:55+0200")
public class WeldEjbLogger_$logger_pt_BR extends WeldEjbLogger_$logger_pt implements WeldEjbLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public WeldEjbLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String ejbHashBeenRemoved$str() {
        return "WFLYWELDEJB0001: EJB foi removido: %1$s";
    }
}
