package org.wildfly.extension.microprofile.telemetry;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:22+0200")
public class MicroProfileTelemetryExtensionLogger_$logger_fr extends MicroProfileTelemetryExtensionLogger_$logger implements MicroProfileTelemetryExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileTelemetryExtensionLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMPTEL0001: Activation du sous-système de télémétrie MicroProfile";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYMPTEL0002: Le déploiement %1$s nécessite l'utilisation de la capacité '%2$s' , mais elle n'est pas encore enregistrée";
    }
}
