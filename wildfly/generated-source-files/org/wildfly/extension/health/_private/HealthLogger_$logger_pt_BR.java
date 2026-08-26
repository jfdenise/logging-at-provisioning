package org.wildfly.extension.health._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:19+0200")
public class HealthLogger_$logger_pt_BR extends HealthLogger_$logger_pt implements HealthLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public HealthLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYHEALTH0001: Ativando o Subsistema Básico de integridade";
    }
}
