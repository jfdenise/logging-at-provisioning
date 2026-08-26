package org.wildfly.extension.microprofile.health._private;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T12:02:11+0200")
public class MicroProfileHealthLogger_$logger extends DelegatingBasicLogger implements MicroProfileHealthLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MicroProfileHealthLogger_$logger.class.getName();
    public MicroProfileHealthLogger_$logger(final Logger log) {
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
        return "WFLYMPHEALTH0001: Activating MicroProfile Health Subsystem";
    }
    protected String deploymentRequiresCapability$str() {
        return "WFLYMPHEALTH0002: Deployment %s requires use of the '%s' capability but it is not currently registered";
    }
    @Override
    public final DeploymentUnitProcessingException deploymentRequiresCapability(final String deploymentName, final String capabilityName) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), deploymentRequiresCapability$str(), deploymentName, capabilityName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void healthDownStatus(final String cause) {
        super.log.logf(FQCN, WARN, null, healthDownStatus$str(), cause);
    }
    protected String healthDownStatus$str() {
        return "WFLYMPHEALTH0003: Reporting health down status: %s";
    }
    @Override
    public final void defaultProceduresDisabledByDeployment(final String deploymentName) {
        super.log.logf(FQCN, INFO, null, defaultProceduresDisabledByDeployment$str(), deploymentName);
    }
    protected String defaultProceduresDisabledByDeployment$str() {
        return "WFLYMPHEALTH0007: The deployment %s configuration has specified that default MicroProfile Health procedures should be disabled; server-wide procedures will be disabled.";
    }
}
