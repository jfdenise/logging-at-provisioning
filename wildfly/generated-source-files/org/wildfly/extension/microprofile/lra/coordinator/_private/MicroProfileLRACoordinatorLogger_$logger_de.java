package org.wildfly.extension.microprofile.lra.coordinator._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:34+0200")
public class MicroProfileLRACoordinatorLogger_$logger_de extends MicroProfileLRACoordinatorLogger_$logger implements MicroProfileLRACoordinatorLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileLRACoordinatorLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYTXLRACOORD0001: Aktivieren des MicroProfile LRA Coordinator-Subsystems";
    }
    @Override
    protected String startingCoordinator$str() {
        return "WFLYTXLRACOORD0003: Starten von Narayana MicroProfile LRA Coordinator ist unter folgendem Pfad verfügbar: %1$s/lra-coordinator";
    }
    @Override
    protected String failedToRunRecoveryScan$str() {
        return "WFLYTXLRACOORD0005: Ein Wiederherstellungsscan für Narayana MicroProfile LRA Coordinator konnte am folgenden Pfad nicht gestartet werden: %1$s/lra-coordinator";
    }
    @Override
    protected String lraRecoveryServiceFailedToStart$str() {
        return "WFLYTXLRACOORD0002: Der Start des LRA-Wiederherstellungsdienstes ist fehlgeschlagen";
    }
    @Override
    protected String failedStoppingCoordinator$str() {
        return "WFLYTXLRACOORD0004: Narayana MicroProfile LRA Coordinator konnte nicht am folgenden Pfad gestoppt werden: %1$s/lra-coordinator";
    }
}
