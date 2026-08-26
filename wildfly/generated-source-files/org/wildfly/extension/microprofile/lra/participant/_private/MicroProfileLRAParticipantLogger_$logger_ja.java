package org.wildfly.extension.microprofile.lra.participant._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:35+0200")
public class MicroProfileLRAParticipantLogger_$logger_ja extends MicroProfileLRAParticipantLogger_$logger implements MicroProfileLRAParticipantLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileLRAParticipantLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedStoppingParticipant$str() {
        return "WFLYTXLRAPARTICIPANT0004: パス %1$s//lra-participant-narayana-proxy にある Narayana MicroProfile LRA Participant プロキシーを停止できませんでした";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYTXLRAPARTICIPANT0001: システムプロパティー (lra.coordinator.url) の値として %1$s を使用して MicroProfile LRA Participant Subsystem をアクティブ化しています";
    }
    @Override
    protected String startingParticipantProxy$str() {
        return "WFLYTXLRAPARTICIPANT0002: パス %1$s/lra-participant-narayana-proxy にある Narayana MicroProfile LRA Participant プロキシーを起動しています";
    }
    @Override
    protected String cannotCreateCDIMarkerFile$str() {
        return "WFLYTXLRAPARTICIPANT0003: CDI マーカーファイルを作成できません";
    }
}
