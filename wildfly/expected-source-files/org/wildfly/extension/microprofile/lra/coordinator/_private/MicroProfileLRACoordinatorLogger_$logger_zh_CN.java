package org.wildfly.extension.microprofile.lra.coordinator._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:16+0200")
public class MicroProfileLRACoordinatorLogger_$logger_zh_CN extends MicroProfileLRACoordinatorLogger_$logger_zh implements MicroProfileLRACoordinatorLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileLRACoordinatorLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYTXLRACOORD0001: 激活 MicroProfile LRA Coordinator 子系统";
    }
    @Override
    protected String lraRecoveryServiceFailedToStart$str() {
        return "WFLYTXLRACOORD0002: LRA 恢复服务启动失败";
    }
    @Override
    protected String startingCoordinator$str() {
        return "WFLYTXLRACOORD0003: 在路径 %1$s/lra-coordinator 处启动 Narayana MicroProfile LRA Coordinator";
    }
    @Override
    protected String failedStoppingCoordinator$str() {
        return "WFLYTXLRACOORD0004: 无法在路径 %1$s/lra-coordinator 处停止 Narayana MicroProfile LRA Coordinator";
    }
    @Override
    protected String failedToRunRecoveryScan$str() {
        return "WFLYTXLRACOORD0005: 无法在路径 %1$s/lra-coordinator 处启动对 Narayana MicroProfile LRA Coordinator 的恢复扫描";
    }
}
