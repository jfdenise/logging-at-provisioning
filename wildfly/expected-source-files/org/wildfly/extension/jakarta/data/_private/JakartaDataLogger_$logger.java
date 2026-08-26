package org.wildfly.extension.jakarta.data._private;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;
import java.lang.Exception;


import static org.jboss.logging.Logger.Level.DEBUG;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-22T10:38:26+0200")
public class JakartaDataLogger_$logger extends DelegatingBasicLogger implements JakartaDataLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = JakartaDataLogger_$logger.class.getName();
    public JakartaDataLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void noCdiDeployment() {
        super.log.logf(FQCN, DEBUG, null, noCdiDeployment$str());
    }
    protected String noCdiDeployment$str() {
        return "WFLYJDATA0001: The deployment does not have Jakarta Contexts and Dependency Injection enabled. Skipping Jakarta Data integration.";
    }
    @Override
    public final void deploymentRequiresCapability(final String deploymentName, final String capabilityName) {
        super.log.logf(FQCN, DEBUG, null, deploymentRequiresCapability$str(), deploymentName, capabilityName);
    }
    protected String deploymentRequiresCapability$str() {
        return "WFLYJDATA0002: Deployment %s requires use of the '%s' capability but it is not currently registered";
    }
    protected String errorGettingTransaction$str() {
        return "WFLYJDATA0003: An error occurred while getting the transaction associated with the current thread: %s";
    }
    @Override
    public final IllegalStateException errorGettingTransaction(final Exception cause) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), errorGettingTransaction$str(), cause));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
}
