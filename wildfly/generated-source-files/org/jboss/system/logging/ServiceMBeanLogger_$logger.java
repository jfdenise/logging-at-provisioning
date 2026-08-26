package org.jboss.system.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;
import java.lang.IllegalArgumentException;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:52+0200")
public class ServiceMBeanLogger_$logger extends DelegatingBasicLogger implements ServiceMBeanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ServiceMBeanLogger_$logger.class.getName();
    public ServiceMBeanLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String nullMethodName$str() {
        return "WFLYSYSJMX0001: Null method name";
    }
    @Override
    public final IllegalArgumentException nullMethodName() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullMethodName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String unknownLifecycleMethod$str() {
        return "WFLYSYSJMX0002: Unknown lifecyle method %s";
    }
    @Override
    public final IllegalArgumentException unknownLifecycleMethod(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownLifecycleMethod$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorInDestroy$str() {
        return "WFLYSYSJMX0003: Error in destroy %s";
    }
    @Override
    public final String errorInDestroy(final String arg0) {
        return String.format(getLoggingLocale(), errorInDestroy$str(), arg0);
    }
    protected String errorInStop$str() {
        return "WFLYSYSJMX0004: Error in stop %s";
    }
    @Override
    public final String errorInStop(final String arg0) {
        return String.format(getLoggingLocale(), errorInStop$str(), arg0);
    }
    protected String initializationFailed$str() {
        return "WFLYSYSJMX0005: Initialization failed %s";
    }
    @Override
    public final String initializationFailed(final String arg0) {
        return String.format(getLoggingLocale(), initializationFailed$str(), arg0);
    }
    protected String startingFailed$str() {
        return "WFLYSYSJMX0006: Starting failed %s";
    }
    @Override
    public final String startingFailed(final String arg0) {
        return String.format(getLoggingLocale(), startingFailed$str(), arg0);
    }
    protected String stoppingFailed$str() {
        return "WFLYSYSJMX0007: Stopping failed %s";
    }
    @Override
    public final String stoppingFailed(final String arg0) {
        return String.format(getLoggingLocale(), stoppingFailed$str(), arg0);
    }
    protected String destroyingFailed$str() {
        return "WFLYSYSJMX0008: Destroying failed %s";
    }
    @Override
    public final String destroyingFailed(final String arg0) {
        return String.format(getLoggingLocale(), destroyingFailed$str(), arg0);
    }
    protected String postRegisterInitializationFailed$str() {
        return "WFLYSYSJMX0009: Initialization failed during postRegister";
    }
    @Override
    public final String postRegisterInitializationFailed() {
        return String.format(getLoggingLocale(), postRegisterInitializationFailed$str());
    }
}
