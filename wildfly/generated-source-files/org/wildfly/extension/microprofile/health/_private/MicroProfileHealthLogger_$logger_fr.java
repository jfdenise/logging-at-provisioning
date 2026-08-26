package org.wildfly.extension.microprofile.health._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:33+0200")
public class MicroProfileHealthLogger_$logger_fr extends MicroProfileHealthLogger_$logger implements MicroProfileHealthLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileHealthLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMPHEALTH0001: Activation du sous-système de santé MicroProfile";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYMPHEALTH0002: Le déploiement %1$s nécessite l'utilisation de la capacité '%2$s' , mais elle n'est pas encore enregistrée";
    }
    @Override
    protected String healthDownStatus$str() {
        return "WFLYMPHEALTH0003: Signalement d'un état de santé défaillant : %1$s";
    }
}
