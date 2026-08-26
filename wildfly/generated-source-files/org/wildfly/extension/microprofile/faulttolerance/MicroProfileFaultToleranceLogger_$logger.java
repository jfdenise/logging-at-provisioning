package org.wildfly.extension.microprofile.faulttolerance;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:32+0200")
public class MicroProfileFaultToleranceLogger_$logger extends DelegatingBasicLogger implements MicroProfileFaultToleranceLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MicroProfileFaultToleranceLogger_$logger.class.getName();
    public MicroProfileFaultToleranceLogger_$logger(final Logger log) {
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
        return "WFLYMPFTEXT0001: Activating MicroProfile Fault Tolerance subsystem.";
    }
    @Override
    public final void metricsProvider(final Set<String> arg0) {
        super.log.logf(FQCN, INFO, null, metricsProvider$str(), arg0);
    }
    protected String metricsProvider$str() {
        return "WFLYMPFTEXT0002: MicroProfile Fault Tolerance subsystem will use %s metrics provider.";
    }
}
