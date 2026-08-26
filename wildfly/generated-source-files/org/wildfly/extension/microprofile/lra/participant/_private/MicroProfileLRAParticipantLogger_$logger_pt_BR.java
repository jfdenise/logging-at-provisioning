package org.wildfly.extension.microprofile.lra.participant._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:35+0200")
public class MicroProfileLRAParticipantLogger_$logger_pt_BR extends MicroProfileLRAParticipantLogger_$logger_pt implements MicroProfileLRAParticipantLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileLRAParticipantLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedStoppingParticipant$str() {
        return "WFLYTXLRAPARTICIPANT0004: Falha ao interromper o proxy Narayana MicroProfile LRA Participant no caminho %1$s//lra-participant-narayana-proxy";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYTXLRAPARTICIPANT0001: Ativando o subsistema MicroProfile LRA Participant com o valor da propriedade do sistema (lra.coordinator.url) como %1$s";
    }
    @Override
    protected String startingParticipantProxy$str() {
        return "WFLYTXLRAPARTICIPANT0002: Iniciando o proxy Narayana MicroProfile LRA Participant disponível no caminho %1$s/lra-participant-narayana-proxy";
    }
    @Override
    protected String cannotCreateCDIMarkerFile$str() {
        return "WFLYTXLRAPARTICIPANT0003: O arquivo do marcador CDI não pode ser criado";
    }
}
