package org.wildfly.extension.micrometer;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.PathAddress;
import java.lang.String;
import java.io.IOException;
import org.jboss.logging.Logger;
import java.util.Arrays;
import java.lang.Exception;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T12:02:10+0200")
public class MicrometerExtensionLogger_$logger extends DelegatingBasicLogger implements MicrometerExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MicrometerExtensionLogger_$logger.class.getName();
    public MicrometerExtensionLogger_$logger(final Logger log) {
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
        return "WFLYMMTREXT0001: Activating Micrometer Subsystem";
    }
    @Override
    public final void processingDeployment() {
        super.log.logf(FQCN, INFO, null, processingDeployment$str());
    }
    protected String processingDeployment$str() {
        return "WFLYMMTREXT0002: Micrometer Subsystem is processing deployment";
    }
    @Override
    public final void noCdiDeployment() {
        super.log.logf(FQCN, DEBUG, null, noCdiDeployment$str());
    }
    protected String noCdiDeployment$str() {
        return "WFLYMMTREXT0003: The deployment does not have Jakarta Contexts and Dependency Injection enabled. Skipping Micrometer integration.";
    }
    @Override
    public final void deploymentRequiresCapability(final String deploymentName, final String capabilityName) {
        super.log.logf(FQCN, DEBUG, null, deploymentRequiresCapability$str(), deploymentName, capabilityName);
    }
    protected String deploymentRequiresCapability$str() {
        return "WFLYMMTREXT0004: Deployment %s requires use of the '%s' capability but it is not currently registered";
    }
    @Override
    public final void unableToReadAttribute(final String attributeName, final PathAddress address, final String error) {
        super.log.logf(FQCN, WARN, null, unableToReadAttribute$str(), attributeName, address, error);
    }
    protected String unableToReadAttribute$str() {
        return "WFLYMMTREXT0005: Unable to read attribute %s on %s: %s.";
    }
    @Override
    public final void unableToConvertAttribute(final String attributeName, final PathAddress address, final Exception exception) {
        super.log.logf(FQCN, WARN, exception, unableToConvertAttribute$str(), attributeName, address);
    }
    protected String unableToConvertAttribute$str() {
        return "WFLYMMTREXT0006: Unable to convert attribute %s on %s to Double value.";
    }
    @Override
    public final void malformedName(final Exception exception) {
        super.log.logf(FQCN, ERROR, exception, malformedName$str());
    }
    protected String malformedName$str() {
        return "WFLYMMTREXT0007: Malformed name.";
    }
    protected String failedInitializeJMXRegistrar$str() {
        return "WFLYMMTREXT0008: Failed to initialize metrics from JMX MBeans";
    }
    @Override
    public final IllegalArgumentException failedInitializeJMXRegistrar(final IOException e) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), failedInitializeJMXRegistrar$str()), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String unsupportedMetricType$str() {
        return "WFLYMMTREXT0009: An unsupported metric type was found: %s";
    }
    @Override
    public final IllegalArgumentException unsupportedMetricType(final String type) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unsupportedMetricType$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void notActivatingSubsystem() {
        super.log.logf(FQCN, INFO, null, notActivatingSubsystem$str());
    }
    protected String notActivatingSubsystem$str() {
        return "WFLYMMTREXT0010: Not activating Micrometer Subsystem";
    }
    @Override
    public final void noOpRegistryChosen() {
        super.log.logf(FQCN, WARN, null, noOpRegistryChosen$str());
    }
    protected String noOpRegistryChosen$str() {
        return "WFLYMMTREXT0011: Micrometer has been enabled, but no endpoint has been configured. A No-op metrics registry has been configured.";
    }
    @Override
    public final void multipleMetricsSystemsEnabled(final String others) {
        super.log.logf(FQCN, INFO, null, multipleMetricsSystemsEnabled$str(), others);
    }
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYMMTREXT0012: Additional metrics systems discovered while configuring Micrometer: %s. Please see the administration guide for more information.";
    }
}
