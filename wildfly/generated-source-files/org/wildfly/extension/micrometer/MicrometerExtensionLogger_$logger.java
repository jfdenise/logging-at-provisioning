package org.wildfly.extension.micrometer;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import java.io.IOException;
import org.jboss.logging.Logger;
import java.lang.Exception;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.PathAddress;
import java.util.Arrays;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:43+0200")
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
    public final void deploymentRequiresCapability(final String arg0, final String arg1) {
        super.log.logf(FQCN, DEBUG, null, deploymentRequiresCapability$str(), arg0, arg1);
    }
    protected String deploymentRequiresCapability$str() {
        return "WFLYMMTREXT0004: Deployment %s requires use of the '%s' capability but it is not currently registered";
    }
    @Override
    public final void unableToReadAttribute(final String arg0, final PathAddress arg1, final String arg2) {
        super.log.logf(FQCN, WARN, null, unableToReadAttribute$str(), arg0, arg1, arg2);
    }
    protected String unableToReadAttribute$str() {
        return "WFLYMMTREXT0005: Unable to read attribute %s on %s: %s.";
    }
    @Override
    public final void unableToConvertAttribute(final String arg0, final PathAddress arg1, final Exception arg2) {
        super.log.logf(FQCN, WARN, arg2, unableToConvertAttribute$str(), arg0, arg1);
    }
    protected String unableToConvertAttribute$str() {
        return "WFLYMMTREXT0006: Unable to convert attribute %s on %s to Double value.";
    }
    @Override
    public final void malformedName(final Exception arg0) {
        super.log.logf(FQCN, ERROR, arg0, malformedName$str());
    }
    protected String malformedName$str() {
        return "WFLYMMTREXT0007: Malformed name.";
    }
    protected String failedInitializeJMXRegistrar$str() {
        return "WFLYMMTREXT0008: Failed to initialize metrics from JMX MBeans";
    }
    @Override
    public final IllegalArgumentException failedInitializeJMXRegistrar(final IOException arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), failedInitializeJMXRegistrar$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String unsupportedMetricType$str() {
        return "WFLYMMTREXT0009: An unsupported metric type was found: %s";
    }
    @Override
    public final IllegalArgumentException unsupportedMetricType(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unsupportedMetricType$str(), arg0));
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
    public final void multipleMetricsSystemsEnabled(final String arg0) {
        super.log.logf(FQCN, INFO, null, multipleMetricsSystemsEnabled$str(), arg0);
    }
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYMMTREXT0012: Additional metrics systems discovered while configuring Micrometer: %s. Please refer to the documentation for more information.";
    }
    protected String errorRegisteringMetric$str() {
        return "WFLYMMTREXT0013: There was an error registering the metric '%s'";
    }
    @Override
    public final IllegalArgumentException errorRegisteringMetric(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), errorRegisteringMetric$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String prometheusNotSupportedOnHostControllers$str() {
        return "WFLYMMTREXT0014: Prometheus is not supported on domain mode servers";
    }
    @Override
    public final OperationFailedException prometheusNotSupportedOnHostControllers() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), prometheusNotSupportedOnHostControllers$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void configNotSupported() {
        super.log.logf(FQCN, WARN, null, configNotSupported$str());
    }
    protected String configNotSupported$str() {
        return "WFLYMMTREXT0015: MeterRegistry.Config is not supported in a WildFly-managed MeterRegistry.";
    }
}
