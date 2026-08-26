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
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:52+0200")
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
    public final void perCpuNotSupported(final org.jboss.as.threads.Attribute arg0, final BigDecimal arg1, final org.jboss.as.threads.Attribute arg2, final BigDecimal arg3, final org.jboss.as.threads.Attribute arg4, final int arg5, final int arg6, final org.jboss.as.threads.Attribute arg7) {
        super.log.logf(FQCN, WARN, null, perCpuNotSupported$str(), arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }
    protected String perCpuNotSupported$str() {
        return "WFLYTHR0001: The '%s' attribute is no longer supported. The value [%f] of the '%s' attribute is being combined with the value [%f] of the '%s' attribute and the current processor count [%d] to derive a new value of [%d] for '%s'.";
    }
    protected String unsupportedBoundedQueueThreadPoolMetric$str() {
        return "WFLYTHR0002: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedBoundedQueueThreadPoolMetric(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedBoundedQueueThreadPoolMetric$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String unsupportedBoundedQueueThreadPoolAttribute$str() {
        return "WFLYTHR0003: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedBoundedQueueThreadPoolAttribute(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedBoundedQueueThreadPoolAttribute$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedQueuelessThreadPoolMetric$str() {
        return "WFLYTHR0004: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedQueuelessThreadPoolMetric(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedQueuelessThreadPoolMetric$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedQueuelessThreadPoolAttribute$str() {
        return "WFLYTHR0005: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedQueuelessThreadPoolAttribute(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedQueuelessThreadPoolAttribute$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedScheduledThreadPoolMetric$str() {
        return "WFLYTHR0006: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedScheduledThreadPoolMetric(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedScheduledThreadPoolMetric$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedScheduledThreadPoolAttribute$str() {
        return "WFLYTHR0007: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedScheduledThreadPoolAttribute(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedScheduledThreadPoolAttribute$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedThreadFactoryAttribute$str() {
        return "WFLYTHR0008: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedThreadFactoryAttribute(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedThreadFactoryAttribute$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedUnboundedQueueThreadPoolMetric$str() {
        return "WFLYTHR0009: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedUnboundedQueueThreadPoolMetric(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedUnboundedQueueThreadPoolMetric$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedUnboundedQueueThreadPoolAttribute$str() {
        return "WFLYTHR0010: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedUnboundedQueueThreadPoolAttribute(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedUnboundedQueueThreadPoolAttribute$str(), arg0));
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
    public final OperationFailedException boundedQueueThreadPoolServiceNotFound(final ServiceName arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), boundedQueueThreadPoolServiceNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String queuelessThreadPoolServiceNotFound$str() {
        return "WFLYTHR0017: Service '%s' not found.";
    }
    @Override
    public final OperationFailedException queuelessThreadPoolServiceNotFound(final ServiceName arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), queuelessThreadPoolServiceNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String scheduledThreadPoolServiceNotFound$str() {
        return "WFLYTHR0018: Service '%s' not found.";
    }
    @Override
    public final OperationFailedException scheduledThreadPoolServiceNotFound(final ServiceName arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), scheduledThreadPoolServiceNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String threadFactoryServiceNotFound$str() {
        return "WFLYTHR0019: Service '%s' not found.";
    }
    @Override
    public final OperationFailedException threadFactoryServiceNotFound(final ServiceName arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), threadFactoryServiceNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unboundedQueueThreadPoolServiceNotFound$str() {
        return "WFLYTHR0020: Service '%s' not found.";
    }
    @Override
    public final OperationFailedException unboundedQueueThreadPoolServiceNotFound(final ServiceName arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unboundedQueueThreadPoolServiceNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String threadPoolServiceNotFoundForMetrics$str() {
        return "WFLYTHR0021: Failed to locate executor service '%s'";
    }
    @Override
    public final OperationFailedException threadPoolServiceNotFoundForMetrics(final ServiceName arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), threadPoolServiceNotFoundForMetrics$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingKeepAliveTime$str() {
        return "WFLYTHR0024: Missing '%s' for parameter '%s'";
    }
    @Override
    public final OperationFailedException missingKeepAliveTime(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), missingKeepAliveTime$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingKeepAliveUnit$str() {
        return "WFLYTHR0025: Missing '%s' for parameter '%s'";
    }
    @Override
    public final OperationFailedException missingKeepAliveUnit(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), missingKeepAliveUnit$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String countMustBePositive$str() {
        return "WFLYTHR0027: %s must be greater than or equal to zero";
    }
    @Override
    public final XMLStreamException countMustBePositive(final org.jboss.as.threads.Attribute arg0, final Location arg1) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), countMustBePositive$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String perCpuMustBePositive$str() {
        return "WFLYTHR0028: %s must be greater than or equal to zero";
    }
    @Override
    public final XMLStreamException perCpuMustBePositive(final org.jboss.as.threads.Attribute arg0, final Location arg1) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), perCpuMustBePositive$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingTimeSpecTime$str() {
        return "WFLYTHR0029: Missing '%s' for '%s'";
    }
    @Override
    public final OperationFailedException missingTimeSpecTime(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), missingTimeSpecTime$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParseUnit$str() {
        return "WFLYTHR0030: Failed to parse '%s', allowed values are: %s";
    }
    @Override
    public final OperationFailedException failedToParseUnit(final String arg0, final List<java.util.concurrent.TimeUnit> arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), failedToParseUnit$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedEnhancedQueueExecutorAttribute$str() {
        return "WFLYTHR0031: Unsupported attribute '%s'";
    }
    @Override
    public final IllegalStateException unsupportedEnhancedQueueExecutorAttribute(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedEnhancedQueueExecutorAttribute$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String enhancedQueueExecutorServiceNotFound$str() {
        return "WFLYTHR0032: Service '%s' not found.";
    }
    @Override
    public final OperationFailedException enhancedQueueExecutorServiceNotFound(final ServiceName arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), enhancedQueueExecutorServiceNotFound$str(), arg0));
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
    public final IllegalStateException unsupportedEnhancedQueueExecutorMetric(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedEnhancedQueueExecutorMetric$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
