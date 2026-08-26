package org.wildfly.extension.microprofile.reactive.messaging._private;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;
import org.jboss.jandex.DotName;


import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:38+0200")
public class MicroProfileReactiveMessagingLogger_$logger extends DelegatingBasicLogger implements MicroProfileReactiveMessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MicroProfileReactiveMessagingLogger_$logger.class.getName();
    public MicroProfileReactiveMessagingLogger_$logger(final Logger log) {
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
        return "WFLYRXMESS0001: Activating MicroProfile Reactive Messaging Subsystem";
    }
    protected String deploymentRequiresCapability$str() {
        return "WFLYRXMESS0002: Deployment %s requires use of the '%s' capability but it is not currently registered";
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
    public final void intermediateModuleNotPresent(final String arg0) {
        super.log.logf(FQCN, INFO, null, intermediateModuleNotPresent$str(), arg0);
    }
    protected String intermediateModuleNotPresent$str() {
        return "WFLYRXMESS0003: Intermediate module %s is not present. Skipping recursively adding modules from it";
    }
    protected String experimentalPropertyNotAllowed$str() {
        return "WFLYRXMESS0004: Use of -D%s=true is not allowed in this setup";
    }
    @Override
    public final DeploymentUnitProcessingException experimentalPropertyNotAllowed(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), experimentalPropertyNotAllowed$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String experimentalAnnotationNotAllowed$str() {
        return "WFLYRXMESS0005: Use of @%s is not allowed in this setup";
    }
    @Override
    public final DeploymentUnitProcessingException experimentalAnnotationNotAllowed(final DotName arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), experimentalAnnotationNotAllowed$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
