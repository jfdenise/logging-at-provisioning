package org.wildfly.extension.microprofile.lra.coordinator._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:16+0200")
public class MicroProfileLRACoordinatorLogger_$logger_pt_BR extends MicroProfileLRACoordinatorLogger_$logger_pt implements MicroProfileLRACoordinatorLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileLRACoordinatorLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYTXLRACOORD0001: Ativando o subsistema MicroProfile LRA Coordinator";
    }
    @Override
    protected String lraRecoveryServiceFailedToStart$str() {
        return "WFLYTXLRACOORD0002: Falha na inicialização do serviço de recuperação de LRA";
    }
    @Override
    protected String startingCoordinator$str() {
        return "WFLYTXLRACOORD0003: Iniciando o Narayana MicroProfile LRA Coordinator disponível no caminho %1$s/lra-coordinator";
    }
    @Override
    protected String failedStoppingCoordinator$str() {
        return "WFLYTXLRACOORD0004: Falha ao interromper o Narayana MicroProfile LRA Coordinator no caminho %1$s/lra-coordinator";
    }
    @Override
    protected String failedToRunRecoveryScan$str() {
        return "WFLYTXLRACOORD0005: Falha ao iniciar uma verificação de recuperação no Narayana MicroProfile LRA Coordinator no caminho %1$s/lra-coordinator";
    }
}
