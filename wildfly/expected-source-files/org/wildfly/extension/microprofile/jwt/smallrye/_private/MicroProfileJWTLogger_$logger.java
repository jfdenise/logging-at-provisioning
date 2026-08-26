package org.wildfly.extension.microprofile.jwt.smallrye._private;

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
public class MicroProfileJWTLogger_$logger extends DelegatingBasicLogger implements MicroProfileJWTLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MicroProfileJWTLogger_$logger.class.getName();
    public MicroProfileJWTLogger_$logger(final Logger log) {
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
        return "WFLYJWT0001: Activating MicroProfile JWT Subsystem";
    }
    @Override
    public final void loginConfigInvalidTarget(final String target) {
        super.log.logf(FQCN, WARN, null, loginConfigInvalidTarget$str(), target);
    }
    protected String loginConfigInvalidTarget$str() {
        return "WFLYJWT0002: @LoginConfig annotation detected on invalid target \"%s\".";
    }
    protected String noAuthMethodSpecified$str() {
        return "WFLYJWT0003: No `authMethod` specified on the @LoginConfig annotation.";
    }
    @Override
    public final DeploymentUnitProcessingException noAuthMethodSpecified() {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), noAuthMethodSpecified$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
}
