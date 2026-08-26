package org.wildfly.extension.microprofile.lra.participant._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:35+0200")
public class MicroProfileLRAParticipantLogger_$logger_fr extends MicroProfileLRAParticipantLogger_$logger implements MicroProfileLRAParticipantLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileLRAParticipantLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedStoppingParticipant$str() {
        return "WFLYTXLRAPARTICIPANT0004: Impossible d'arrêter le proxy participant LRA de Narayana MicroProfile sur le chemin%1$s //lra-participant-narayana-proxy";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYTXLRAPARTICIPANT0001: Activation du sous-système participant MicroProfile LRA avec la valeur de propriété système (lra.coordinator.url) comme %1$s";
    }
    @Override
    protected String startingParticipantProxy$str() {
        return "WFLYTXLRAPARTICIPANT0002: Démarrage du proxy participant LRA MicroProfile de Narayana disponible sur le chemin%1$s /lra-participant-narayana-proxy";
    }
    @Override
    protected String cannotCreateCDIMarkerFile$str() {
        return "WFLYTXLRAPARTICIPANT0003: Le fichier marqueur CDI ne peut pas être créé";
    }
}
