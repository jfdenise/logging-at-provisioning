package org.wildfly.extension.microprofile.lra.participant._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:20+0200")
public class MicroProfileLRAParticipantLogger_$logger_de extends MicroProfileLRAParticipantLogger_$logger implements MicroProfileLRAParticipantLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileLRAParticipantLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYTXLRAPARTICIPANT0001: Aktivieren des MicroProfile LRA Participant-Subsystems mit dem Systemeigenschaftenwert (lra.coordinator.url) als %1$s";
    }
    @Override
    protected String startingParticipantProxy$str() {
        return "WFLYTXLRAPARTICIPANT0002: Starten des Narayana MicroProfile LRA Participant-Proxys ist unter folgendem Pfad verfügbar %1$s/lra-participant-narayana-proxy";
    }
    @Override
    protected String cannotCreateCDIMarkerFile$str() {
        return "WFLYTXLRAPARTICIPANT0003: Die CDI-Markierungsdatei kann nicht erstellt werden";
    }
    @Override
    protected String failedStoppingParticipant$str() {
        return "WFLYTXLRAPARTICIPANT0004: Der Narayana MicroProfile LRA Participant-Proxy konnte nicht an folgendem Pfad gestoppt werden. %1$s//lra-participant-narayana-proxy";
    }
}
