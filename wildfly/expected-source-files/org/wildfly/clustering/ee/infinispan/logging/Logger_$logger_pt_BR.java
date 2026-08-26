package org.wildfly.clustering.ee.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:17+0200")
public class Logger_$logger_pt_BR extends Logger_$logger_pt implements Logger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public Logger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToCancel$str() {
        return "WFLYCLEEINF0001: Falha ao cancelar %1$s no proprietário principal.";
    }
    @Override
    protected String failedToSchedule$str() {
        return "WFLYCLEEINF0002: Falha ao esquematizar %1$s no proprietário principal.";
    }
}
