package org.wildfly.extension.microprofile.faulttolerance;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:32+0200")
public class MicroProfileFaultToleranceLogger_$logger_de extends MicroProfileFaultToleranceLogger_$logger implements MicroProfileFaultToleranceLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileFaultToleranceLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMPFTEXT0001: MicroProfile-Fehlertoleranzsubsystem wird aktiviert.";
    }
    @Override
    protected String metricsProvider$str() {
        return "WFLYMPFTEXT0002: Das MicroProfile Fehlertoleranz-Subsystem verwendet den Metrik-Provider %1$s.";
    }
}
