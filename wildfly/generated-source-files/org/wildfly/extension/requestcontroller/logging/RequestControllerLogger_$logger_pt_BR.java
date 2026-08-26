package org.wildfly.extension.requestcontroller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:48+0200")
public class RequestControllerLogger_$logger_pt_BR extends RequestControllerLogger_$logger_pt implements RequestControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public RequestControllerLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToCancelTask$str() {
        return "WFLYREQCON001: Falha ao cancelar tarefa na fila de espera %1$s";
    }
}
