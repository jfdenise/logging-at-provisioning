package org.wildfly.extension.microprofile.lra.participant._private;

import java.util.Locale;
import jakarta.servlet.ServletException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.lang.String;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T12:02:20+0200")
public class MicroProfileLRAParticipantLogger_$logger extends DelegatingBasicLogger implements MicroProfileLRAParticipantLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MicroProfileLRAParticipantLogger_$logger.class.getName();
    public MicroProfileLRAParticipantLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void activatingSubsystem(final String url) {
        super.log.logf(FQCN, INFO, null, activatingSubsystem$str(), url);
    }
    protected String activatingSubsystem$str() {
        return "WFLYTXLRAPARTICIPANT0001: Activating MicroProfile LRA Participant Subsystem with system property (lra.coordinator.url) value as %s";
    }
    @Override
    public final void startingParticipantProxy(final String path) {
        super.log.logf(FQCN, INFO, null, startingParticipantProxy$str(), path);
    }
    protected String startingParticipantProxy$str() {
        return "WFLYTXLRAPARTICIPANT0002: Starting Narayana MicroProfile LRA Participant Proxy available at path %s/lra-participant-narayana-proxy";
    }
    @Override
    public final void cannotCreateCDIMarkerFile(final Throwable e) {
        super.log.logf(FQCN, WARN, e, cannotCreateCDIMarkerFile$str());
    }
    protected String cannotCreateCDIMarkerFile$str() {
        return "WFLYTXLRAPARTICIPANT0003: The CDI marker file cannot be created";
    }
    @Override
    public final void failedStoppingParticipant(final String path, final ServletException cause) {
        super.log.logf(FQCN, ERROR, cause, failedStoppingParticipant$str(), path);
    }
    protected String failedStoppingParticipant$str() {
        return "WFLYTXLRAPARTICIPANT0004: Failed to stop Narayana MicroProfile LRA Participant Proxy at path %s//lra-participant-narayana-proxy";
    }
}
