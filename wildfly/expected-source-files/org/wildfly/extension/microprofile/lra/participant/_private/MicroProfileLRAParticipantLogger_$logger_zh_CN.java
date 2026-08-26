package org.wildfly.extension.microprofile.lra.participant._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:20+0200")
public class MicroProfileLRAParticipantLogger_$logger_zh_CN extends MicroProfileLRAParticipantLogger_$logger_zh implements MicroProfileLRAParticipantLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileLRAParticipantLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYTXLRAPARTICIPANT0001: 使用值为 %1$s 的系统属性(lra.coordinator.url)值激活 MicroProfile LRA Participant 子系统";
    }
    @Override
    protected String startingParticipantProxy$str() {
        return "WFLYTXLRAPARTICIPANT0002: 在路径 %1$s/lra-participant-narayana-proxy 处启动 Narayana MicroProfile LRA Participant 代理";
    }
    @Override
    protected String cannotCreateCDIMarkerFile$str() {
        return "WFLYTXLRAPARTICIPANT0003: 无法创建 CDI 标记文件";
    }
    @Override
    protected String failedStoppingParticipant$str() {
        return "WFLYTXLRAPARTICIPANT0004: 无法在路径 %1$s//lra-participant-narayana-proxy 处停止 Narayana MicroProfile LRA Participant 代理";
    }
}
