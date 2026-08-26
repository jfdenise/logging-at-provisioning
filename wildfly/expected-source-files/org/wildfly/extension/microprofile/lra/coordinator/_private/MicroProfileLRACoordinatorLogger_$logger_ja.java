package org.wildfly.extension.microprofile.lra.coordinator._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:16+0200")
public class MicroProfileLRACoordinatorLogger_$logger_ja extends MicroProfileLRACoordinatorLogger_$logger implements MicroProfileLRACoordinatorLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileLRACoordinatorLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYTXLRACOORD0001: MicroProfile LRA コーディネーターサブシステムをアクティブ化しています";
    }
    @Override
    protected String lraRecoveryServiceFailedToStart$str() {
        return "WFLYTXLRACOORD0002: LRA リカバリーサービスの起動に失敗しました";
    }
    @Override
    protected String startingCoordinator$str() {
        return "WFLYTXLRACOORD0003: パス %1$s/lra-coordinator にある Narayana MicroProfile LRA Coordinator を起動しています";
    }
    @Override
    protected String failedStoppingCoordinator$str() {
        return "WFLYTXLRACOORD0004: パス %1$s/lra-coordinator にある Narayana MicroProfile LRA Coordinator を停止できませんでした";
    }
    @Override
    protected String failedToRunRecoveryScan$str() {
        return "WFLYTXLRACOORD0005: パス %1$s/lra-coordinator にある Narayana MicroProfile LRA Coordinator のリカバリースキャンを開始できませんでした";
    }
}
