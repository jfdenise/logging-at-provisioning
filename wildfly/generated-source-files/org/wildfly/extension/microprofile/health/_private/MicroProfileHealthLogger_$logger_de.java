package org.wildfly.extension.microprofile.health._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:33+0200")
public class MicroProfileHealthLogger_$logger_de extends MicroProfileHealthLogger_$logger implements MicroProfileHealthLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileHealthLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMPHEALTH0001: Aktivieren des MicroProfile Health-Subsystems";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYMPHEALTH0002: Deployment %1$s erfordert die Verwendung der Capability '%2$s', ist aber derzeit nicht registriert";
    }
    @Override
    protected String healthDownStatus$str() {
        return "WFLYMPHEALTH0003: Melden des deaktivierten Status von Health: %1$s";
    }
}
