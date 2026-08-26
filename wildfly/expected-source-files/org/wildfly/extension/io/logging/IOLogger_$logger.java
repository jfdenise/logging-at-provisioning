package org.wildfly.extension.io.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import java.net.InetSocketAddress;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.PathAddress;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import org.wildfly.common.net.CidrAddress;
import org.jboss.logging.Logger;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:27:19+0200")
public class IOLogger_$logger extends DelegatingBasicLogger implements IOLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = IOLogger_$logger.class.getName();
    public IOLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void printDefaults(final String workerName, final int ioThreads, final int workerThreads, final int cpuCount) {
        super.log.logf(FQCN, INFO, null, printDefaults$str(), workerName, ioThreads, workerThreads, cpuCount);
    }
    protected String printDefaults$str() {
        return "WFLYIO001: Worker '%s' has auto-configured to %d IO threads with %d max task threads based on your %d available processors";
    }
    @Override
    public final void printDefaultsIoThreads(final String workerName, final int ioThreads, final int cpuCount) {
        super.log.logf(FQCN, INFO, null, printDefaultsIoThreads$str(), workerName, ioThreads, cpuCount);
    }
    protected String printDefaultsIoThreads$str() {
        return "WFLYIO002: Worker '%s' has auto-configured to %d IO threads based on your %d available processors";
    }
    @Override
    public final void printDefaultsWorkerThreads(final String workerName, final int workerThreads, final int cpuCount) {
        super.log.logf(FQCN, INFO, null, printDefaultsWorkerThreads$str(), workerName, workerThreads, cpuCount);
    }
    protected String printDefaultsWorkerThreads$str() {
        return "WFLYIO003: Worker '%s' has auto-configured to %d max task threads based on your %d available processors";
    }
    @Override
    public final void lowFD(final String workerName, final int suggestedWorkerThreadCount, final int cpuCount) {
        super.log.logf(FQCN, WARN, null, lowFD$str(), workerName, suggestedWorkerThreadCount, cpuCount);
    }
    protected String lowFD$str() {
        return "WFLYIO004: Worker '%s' would auto-configure to %d max task threads based on %d available processors, however your system does not have enough file descriptors configured to support this configuration. It is likely you will experience application degradation unless you increase your file descriptor limit.";
    }
    @Override
    public final void lowGlobalFD(final int maxFd, final int requiredCount) {
        super.log.logf(FQCN, WARN, null, lowGlobalFD$str(), maxFd, requiredCount);
    }
    protected String lowGlobalFD$str() {
        return "WFLYIO005: Your system is configured with %d file descriptors, but your current application server configuration will require a minimum of %d (and probably more than that); attempting to adjust, however you should expect stability problems unless you increase this number";
    }
    protected String noMetrics$str() {
        return "WFLYIO006: no metrics available";
    }
    @Override
    public final String noMetrics() {
        return String.format(getLoggingLocale(), noMetrics$str());
    }
    protected String unexpectedBindAddressConflict$str() {
        return "WFLYIO007: Unexpected bind address conflict in resource \"%s\" when attempting to establish binding for destination %s to %s: a binding of %s already existed";
    }
    @Override
    public final OperationFailedException unexpectedBindAddressConflict(final PathAddress currentAddress, final CidrAddress cidrAddress, final InetSocketAddress bindAddress, final InetSocketAddress existing) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unexpectedBindAddressConflict$str(), currentAddress, cidrAddress, bindAddress, existing));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void wrongStackSize(final long val, final String workerName) {
        super.log.logf(FQCN, WARN, null, wrongStackSize$str(), val, workerName);
    }
    protected String wrongStackSize$str() {
        return "WFLYIO008: The stack-size value of %d bytes for IO worker %s is low and may result in problems. A value of at least 150,000 is recommended.";
    }
}
