package org.wildfly.extension.microprofile.lra.coordinator._private;

import java.util.Locale;
import jakarta.servlet.ServletException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.msc.service.StartException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;
import java.lang.Exception;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T12:02:16+0200")
public class MicroProfileLRACoordinatorLogger_$logger extends DelegatingBasicLogger implements MicroProfileLRACoordinatorLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MicroProfileLRACoordinatorLogger_$logger.class.getName();
    public MicroProfileLRACoordinatorLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void activatingSubsystem() {
        super.log.logf(FQCN, INFO, null, activatingSubsystem$str());
    }
    protected String activatingSubsystem$str() {
        return "WFLYTXLRACOORD0001: Activating MicroProfile LRA Coordinator Subsystem";
    }
    protected String lraRecoveryServiceFailedToStart$str() {
        return "WFLYTXLRACOORD0002: LRA recovery service start failed";
    }
    @Override
    public final StartException lraRecoveryServiceFailedToStart() {
        final StartException result = new StartException(String.format(getLoggingLocale(), lraRecoveryServiceFailedToStart$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void startingCoordinator(final String path) {
        super.log.logf(FQCN, INFO, null, startingCoordinator$str(), path);
    }
    protected String startingCoordinator$str() {
        return "WFLYTXLRACOORD0003: Starting Narayana MicroProfile LRA Coordinator available at path %s/lra-coordinator";
    }
    @Override
    public final void failedStoppingCoordinator(final String path, final ServletException cause) {
        super.log.logf(FQCN, ERROR, cause, failedStoppingCoordinator$str(), path);
    }
    protected String failedStoppingCoordinator$str() {
        return "WFLYTXLRACOORD0004: Failed to stop Narayana MicroProfile LRA Coordinator at path %s/lra-coordinator";
    }
    @Override
    public final void failedToRunRecoveryScan(final String path, final Exception cause) {
        super.log.logf(FQCN, WARN, cause, failedToRunRecoveryScan$str(), path);
    }
    protected String failedToRunRecoveryScan$str() {
        return "WFLYTXLRACOORD0005: Failed to start a recovery scan on the Narayana MicroProfile LRA Coordinator at path %s/lra-coordinator";
    }
}
