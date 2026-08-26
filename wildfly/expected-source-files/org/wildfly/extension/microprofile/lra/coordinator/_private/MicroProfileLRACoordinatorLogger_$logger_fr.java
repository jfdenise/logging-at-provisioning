package org.wildfly.extension.microprofile.lra.coordinator._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:16+0200")
public class MicroProfileLRACoordinatorLogger_$logger_fr extends MicroProfileLRACoordinatorLogger_$logger implements MicroProfileLRACoordinatorLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileLRACoordinatorLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYTXLRACOORD0001: Activation du sous-système coordinateur LRA de MicroProfile";
    }
    @Override
    protected String lraRecoveryServiceFailedToStart$str() {
        return "WFLYTXLRACOORD0002: Échec du démarrage du service de récupération LRA";
    }
    @Override
    protected String startingCoordinator$str() {
        return "WFLYTXLRACOORD0003: Coordinateur LRA de Narayana MicroProfile disponible sur le chemin%1$s /lra-coordinateur";
    }
    @Override
    protected String failedStoppingCoordinator$str() {
        return "WFLYTXLRACOORD0004: Impossible d'arrêter Narayana MicroProfile, coordinateur de la LRA, sur le chemin%1$s /lra-coordinateur";
    }
    @Override
    protected String failedToRunRecoveryScan$str() {
        return "WFLYTXLRACOORD0005: Échec du démarrage d'une analyse de récupération sur le coordinateur LRA du microprofil Narayana au chemin%1$s /lra-coordinateur";
    }
}
