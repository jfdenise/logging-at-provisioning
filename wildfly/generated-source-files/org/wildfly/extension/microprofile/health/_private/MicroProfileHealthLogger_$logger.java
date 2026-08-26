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
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:33+0200")
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
    public final DeploymentUnitProcessingException deploymentRequiresCapability(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), deploymentRequiresCapability$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void healthDownStatus(final String arg0) {
        super.log.logf(FQCN, WARN, null, healthDownStatus$str(), arg0);
    }
    protected String healthDownStatus$str() {
        return "WFLYMPHEALTH0003: Reporting health down status: %s";
    }
    @Override
    public final void addDefaultProceduresDisabledByDeployment(final String arg0) {
        super.log.logf(FQCN, INFO, null, addDefaultProceduresDisabledByDeployment$str(), arg0);
    }
    protected String addDefaultProceduresDisabledByDeployment$str() {
        return "WFLYMPHEALTH0007: The deployment %s configuration has specified that default MicroProfile Health procedures should be disabled; server-wide procedures will be disabled.";
    }
    @Override
    public final void removeDefaultProceduresDisabledByDeployment(final String arg0) {
        super.log.logf(FQCN, INFO, null, removeDefaultProceduresDisabledByDeployment$str(), arg0);
    }
    protected String removeDefaultProceduresDisabledByDeployment$str() {
        return "WFLYMPHEALTH0008: The deployment %s configuration which specified that default MicroProfile Health procedures had to be disabled has been undeployed.";
    }
}
