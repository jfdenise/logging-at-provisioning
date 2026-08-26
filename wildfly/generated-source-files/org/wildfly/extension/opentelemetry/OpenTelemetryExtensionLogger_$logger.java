package org.wildfly.extension.opentelemetry;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;
import java.lang.Exception;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:44+0200")
public class OpenTelemetryExtensionLogger_$logger extends DelegatingBasicLogger implements OpenTelemetryExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = OpenTelemetryExtensionLogger_$logger.class.getName();
    public OpenTelemetryExtensionLogger_$logger(final Logger log) {
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
        return "WFLYOTELEXT0001: Activating OpenTelemetry Subsystem";
    }
    protected String deploymentRequiresCapability$str() {
        return "WFLYOTELEXT0004: Deployment %s requires use of the '%s' capability but it is not currently registered";
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
    public final void errorResolvingTelemetry(final Exception arg0) {
        super.log.logf(FQCN, ERROR, arg0, errorResolvingTelemetry$str());
    }
    protected String errorResolvingTelemetry$str() {
        return "WFLYOTELEXT0005: Error resolving the OpenTelemetry instance.";
    }
    protected String unsupportedExporter$str() {
        return "WFLYOTELEXT0008: An unsupported exporter was specified: '%s'.";
    }
    @Override
    public final IllegalArgumentException unsupportedExporter(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unsupportedExporter$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void errorResolvingTracer(final Exception arg0) {
        super.log.logf(FQCN, ERROR, arg0, errorResolvingTracer$str());
    }
    protected String errorResolvingTracer$str() {
        return "WFLYOTELEXT0009: Error resolving the tracer.";
    }
    protected String unsupportedSpanProcessor$str() {
        return "WFLYOTELEXT0010: An unsupported span processor was specified: '%s'.";
    }
    @Override
    public final IllegalArgumentException unsupportedSpanProcessor(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unsupportedSpanProcessor$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedSampler$str() {
        return "WFLYOTELEXT0011: Unrecognized value for sampler: '%s'.";
    }
    @Override
    public final IllegalArgumentException unsupportedSampler(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unsupportedSampler$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidRatio$str() {
        return "WFLYOTELEXT0012: Invalid ratio. Must be between 0.0 and 1.0 inclusive";
    }
    @Override
    public final IllegalArgumentException invalidRatio() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidRatio$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jaegerIsNoLongerSupported$str() {
        return "WFLYOTELEXT0013: The 'jaeger' exporter is no longer supported. Please update the system to use otlp.";
    }
    @Override
    public final String jaegerIsNoLongerSupported() {
        return String.format(getLoggingLocale(), jaegerIsNoLongerSupported$str());
    }
    @Override
    public final void multipleMetricsSystemsEnabled(final String arg0) {
        super.log.logf(FQCN, INFO, null, multipleMetricsSystemsEnabled$str(), arg0);
    }
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYOTELEXT0014: Additional metrics systems discovered while configuring OpenTelemetry: %s. Please refer to the documentation for more information.";
    }
}
