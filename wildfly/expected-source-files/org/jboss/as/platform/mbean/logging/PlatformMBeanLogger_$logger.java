package org.jboss.as.platform.mbean.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;
import java.lang.UnsupportedOperationException;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:26:21+0200")
public class PlatformMBeanLogger_$logger extends DelegatingBasicLogger implements PlatformMBeanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = PlatformMBeanLogger_$logger.class.getName();
    public PlatformMBeanLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String unknownAttribute$str() {
        return "WFLYPMB0001: No known attribute %s";
    }
    @Override
    public final OperationFailedException unknownAttribute(final String attributeName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unknownAttribute$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String modelNotWritable$str() {
        return "WFLYPMB0002: A platform mbean resource does not have a writable model";
    }
    @Override
    public final UnsupportedOperationException modelNotWritable() {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), modelNotWritable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String addingChildrenNotSupported$str() {
        return "WFLYPMB0003: Adding child resources is not supported";
    }
    @Override
    public final UnsupportedOperationException addingChildrenNotSupported() {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), addingChildrenNotSupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String removingChildrenNotSupported$str() {
        return "WFLYPMB0004: Removing child resources is not supported";
    }
    @Override
    public final UnsupportedOperationException removingChildrenNotSupported() {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), removingChildrenNotSupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownBufferPool$str() {
        return "WFLYPMB0005: No BufferPoolMXBean with name '%s' currently exists";
    }
    @Override
    public final OperationFailedException unknownBufferPool(final String poolName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unknownBufferPool$str(), poolName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badReadAttributeImpl$str() {
        return "WFLYPMB0006: Read support for attribute %s was not properly implemented";
    }
    @Override
    public final IllegalStateException badReadAttributeImpl(final String attributeName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), badReadAttributeImpl$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badWriteAttributeImpl$str() {
        return "WFLYPMB0007: Write support for attribute %s was not properly implemented";
    }
    @Override
    public final IllegalStateException badWriteAttributeImpl(final String attributeName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), badWriteAttributeImpl$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownGarbageCollector$str() {
        return "WFLYPMB0008: No GarbageCollectorMXBean with name %s currently exists";
    }
    @Override
    public final OperationFailedException unknownGarbageCollector(final String gcName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unknownGarbageCollector$str(), gcName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownMemoryManager$str() {
        return "WFLYPMB0009: No MemoryManagerMXBean with name %s currently exists";
    }
    @Override
    public final OperationFailedException unknownMemoryManager(final String mmName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unknownMemoryManager$str(), mmName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownMemoryPool$str() {
        return "WFLYPMB0010: No MemoryPoolMXBean with name %s currently exists";
    }
    @Override
    public final OperationFailedException unknownMemoryPool(final String mmName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unknownMemoryPool$str(), mmName));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
