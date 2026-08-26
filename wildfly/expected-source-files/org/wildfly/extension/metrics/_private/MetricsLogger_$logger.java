package org.wildfly.extension.metrics._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.PathAddress;
import java.io.IOException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import java.lang.Exception;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:58:00+0200")
public class MetricsLogger_$logger extends DelegatingBasicLogger implements MetricsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MetricsLogger_$logger.class.getName();
    public MetricsLogger_$logger(final Logger log) {
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
        return "WFLYMETRICS0001: Activating Base Metrics Subsystem";
    }
    protected String failedInitializeJMXRegistrar$str() {
        return "WFLYMETRICS0002: Failed to initialize metrics from JMX MBeans";
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
    @Override
    public final void unableToReadAttribute(final String attributeName, final PathAddress address, final String error) {
        super.log.logf(FQCN, WARN, null, unableToReadAttribute$str(), attributeName, address, error);
    }
    protected String unableToReadAttribute$str() {
        return "WFLYMETRICS0003: Unable to read attribute %s on %s: %s.";
    }
    @Override
    public final void unableToConvertAttribute(final String attributeName, final PathAddress address, final Exception exception) {
        super.log.logf(FQCN, WARN, exception, unableToConvertAttribute$str(), attributeName, address);
    }
    protected String unableToConvertAttribute$str() {
        return "WFLYMETRICS0004: Unable to convert attribute %s on %s to Double value.";
    }
    @Override
    public final void malformedName(final Exception exception) {
        super.log.logf(FQCN, ERROR, exception, malformedName$str());
    }
    protected String malformedName$str() {
        return "WFLYMETRICS0005: Malformed name.";
    }
    @Override
    public final void multipleMetricsSystemsEnabled(final String others) {
        super.log.logf(FQCN, INFO, null, multipleMetricsSystemsEnabled$str(), others);
    }
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYMETRICS0006: Additional metrics systems discovered while configuring WildFly Metrics: %s. Please see the administration guide for more information.";
    }
}
