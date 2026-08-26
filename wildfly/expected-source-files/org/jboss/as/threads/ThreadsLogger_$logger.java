package org.jboss.as.threads;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.as.threads.Attribute;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.math.BigDecimal;
import javax.xml.stream.XMLStreamException;
import org.jboss.msc.service.ServiceName;
import org.jboss.logging.BasicLogger;
import java.util.List;
import java.util.Arrays;
import javax.xml.stream.Location;


import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:27:25+0200")
public class ThreadsLogger_$logger extends DelegatingBasicLogger implements ThreadsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ThreadsLogger_$logger.class.getName();
    public ThreadsLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void perCpuNotSupported(final org.jboss.as.threads.Attribute perCpuAttr, final BigDecimal count, final org.jboss.as.threads.Attribute countAttr, final BigDecimal perCpu, final org.jboss.as.threads.Attribute perCpuAgain, final int processors, final int fullCount, final org.jboss.as.threads.Attribute countAttrAgain) {
        super.log.logf(FQCN, WARN, null, perCpuNotSupported$str(), perCpuAttr, count, countAttr, perCpu, perCpuAgain, processors, fullCount, countAttrAgain);
    }
    protected String perCpuNotSupported$str() {
        return "WFLYTHR0001: The '%s' attribute is no longer supported. The value [%f] of the '%s' attribute is being combined with the value [%f] of the '%s' attribute and the current processor count [%d] to derive a new value of [%d] for '%s'.";
    }
    protected String unsupportedBoundedQueueThreadPoolMetric$str() {
        return "WFLYTHR0002: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedBoundedQueueThreadPoolMetric(final String attributeName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedBoundedQueueThreadPoolMetric$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String unsupportedBoundedQueueThreadPoolAttribute$str() {
        return "WFLYTHR0003: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedBoundedQueueThreadPoolAttribute(final String attributeName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedBoundedQueueThreadPoolAttribute$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedQueuelessThreadPoolMetric$str() {
        return "WFLYTHR0004: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedQueuelessThreadPoolMetric(final String attributeName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedQueuelessThreadPoolMetric$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedQueuelessThreadPoolAttribute$str() {
        return "WFLYTHR0005: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedQueuelessThreadPoolAttribute(final String attributeName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedQueuelessThreadPoolAttribute$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedScheduledThreadPoolMetric$str() {
        return "WFLYTHR0006: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedScheduledThreadPoolMetric(final String attributeName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedScheduledThreadPoolMetric$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedScheduledThreadPoolAttribute$str() {
        return "WFLYTHR0007: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedScheduledThreadPoolAttribute(final String attributeName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedScheduledThreadPoolAttribute$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedThreadFactoryAttribute$str() {
        return "WFLYTHR0008: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedThreadFactoryAttribute(final String attributeName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedThreadFactoryAttribute$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedUnboundedQueueThreadPoolMetric$str() {
        return "WFLYTHR0009: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedUnboundedQueueThreadPoolMetric(final String attributeName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedUnboundedQueueThreadPoolMetric$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedUnboundedQueueThreadPoolAttribute$str() {
        return "WFLYTHR0010: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedUnboundedQueueThreadPoolAttribute(final String attributeName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedUnboundedQueueThreadPoolAttribute$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String boundedQueueThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0011: The executor service hasn't been initialized.";
    }
    @Override
    public final IllegalStateException boundedQueueThreadPoolExecutorUninitialized() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), boundedQueueThreadPoolExecutorUninitialized$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String queuelessThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0012: The executor service hasn't been initialized.";
    }
    @Override
    public final IllegalStateException queuelessThreadPoolExecutorUninitialized() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), queuelessThreadPoolExecutorUninitialized$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String scheduledThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0013: The executor service hasn't been initialized.";
    }
    @Override
    public final IllegalStateException scheduledThreadPoolExecutorUninitialized() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), scheduledThreadPoolExecutorUninitialized$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String threadFactoryUninitialized$str() {
        return "WFLYTHR0014: The thread factory service hasn't been initialized.";
    }
    @Override
    public final IllegalStateException threadFactoryUninitialized() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), threadFactoryUninitialized$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unboundedQueueThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0015: The executor service hasn't been initialized.";
    }
    @Override
    public final IllegalStateException unboundedQueueThreadPoolExecutorUninitialized() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unboundedQueueThreadPoolExecutorUninitialized$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String boundedQueueThreadPoolServiceNotFound$str() {
        return "WFLYTHR0016: Service '%s' not found.";
    }
    @Override
    public final OperationFailedException boundedQueueThreadPoolServiceNotFound(final ServiceName serviceName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), boundedQueueThreadPoolServiceNotFound$str(), serviceName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String queuelessThreadPoolServiceNotFound$str() {
        return "WFLYTHR0017: Service '%s' not found.";
    }
    @Override
    public final OperationFailedException queuelessThreadPoolServiceNotFound(final ServiceName serviceName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), queuelessThreadPoolServiceNotFound$str(), serviceName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String scheduledThreadPoolServiceNotFound$str() {
        return "WFLYTHR0018: Service '%s' not found.";
    }
    @Override
    public final OperationFailedException scheduledThreadPoolServiceNotFound(final ServiceName serviceName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), scheduledThreadPoolServiceNotFound$str(), serviceName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String threadFactoryServiceNotFound$str() {
        return "WFLYTHR0019: Service '%s' not found.";
    }
    @Override
    public final OperationFailedException threadFactoryServiceNotFound(final ServiceName serviceName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), threadFactoryServiceNotFound$str(), serviceName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unboundedQueueThreadPoolServiceNotFound$str() {
        return "WFLYTHR0020: Service '%s' not found.";
    }
    @Override
    public final OperationFailedException unboundedQueueThreadPoolServiceNotFound(final ServiceName serviceName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unboundedQueueThreadPoolServiceNotFound$str(), serviceName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String threadPoolServiceNotFoundForMetrics$str() {
        return "WFLYTHR0021: Failed to locate executor service '%s'";
    }
    @Override
    public final OperationFailedException threadPoolServiceNotFoundForMetrics(final ServiceName serviceName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), threadPoolServiceNotFoundForMetrics$str(), serviceName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingKeepAliveTime$str() {
        return "WFLYTHR0024: Missing '%s' for parameter '%s'";
    }
    @Override
    public final OperationFailedException missingKeepAliveTime(final String time, final String parameterName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), missingKeepAliveTime$str(), time, parameterName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingKeepAliveUnit$str() {
        return "WFLYTHR0025: Missing '%s' for parameter '%s'";
    }
    @Override
    public final OperationFailedException missingKeepAliveUnit(final String unit, final String parameterName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), missingKeepAliveUnit$str(), unit, parameterName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String countMustBePositive$str() {
        return "WFLYTHR0027: %s must be greater than or equal to zero";
    }
    @Override
    public final XMLStreamException countMustBePositive(final org.jboss.as.threads.Attribute count, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), countMustBePositive$str(), count), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String perCpuMustBePositive$str() {
        return "WFLYTHR0028: %s must be greater than or equal to zero";
    }
    @Override
    public final XMLStreamException perCpuMustBePositive(final org.jboss.as.threads.Attribute perCpu, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), perCpuMustBePositive$str(), perCpu), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingTimeSpecTime$str() {
        return "WFLYTHR0029: Missing '%s' for '%s'";
    }
    @Override
    public final OperationFailedException missingTimeSpecTime(final String time, final String parameterName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), missingTimeSpecTime$str(), time, parameterName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParseUnit$str() {
        return "WFLYTHR0030: Failed to parse '%s', allowed values are: %s";
    }
    @Override
    public final OperationFailedException failedToParseUnit(final String unit, final List<java.util.concurrent.TimeUnit> allowed) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), failedToParseUnit$str(), unit, allowed));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedEnhancedQueueExecutorAttribute$str() {
        return "WFLYTHR0031: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedEnhancedQueueExecutorAttribute(final String attributeName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedEnhancedQueueExecutorAttribute$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String enhancedQueueExecutorServiceNotFound$str() {
        return "WFLYTHR0032: Service '%s' not found.";
    }
    @Override
    public final OperationFailedException enhancedQueueExecutorServiceNotFound(final ServiceName serviceName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), enhancedQueueExecutorServiceNotFound$str(), serviceName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String enhancedQueueExecutorUninitialized$str() {
        return "WFLYTHR0033: The executor service hasn't been initialized.";
    }
    @Override
    public final IllegalStateException enhancedQueueExecutorUninitialized() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), enhancedQueueExecutorUninitialized$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedEnhancedQueueExecutorMetric$str() {
        return "WFLYTHR0034: Unsupported metric '%s'";
    }
    @Override
    public final IllegalStateException unsupportedEnhancedQueueExecutorMetric(final String attributeName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedEnhancedQueueExecutorMetric$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
