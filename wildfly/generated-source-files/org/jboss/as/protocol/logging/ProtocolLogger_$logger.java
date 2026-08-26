package org.jboss.as.protocol.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.remoting3.Channel;
import java.net.ServerSocket;
import java.lang.String;
import java.io.IOException;
import org.jboss.logging.Logger;
import java.net.URI;
import java.lang.Exception;
import java.lang.Thread;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.lang.Object;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import java.net.ConnectException;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:47+0200")
public class ProtocolLogger_$logger extends DelegatingBasicLogger implements ProtocolLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ProtocolLogger_$logger.class.getName();
    public ProtocolLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void errorClosingChannel(final String arg0) {
        super.log.logf(FQCN, WARN, null, errorClosingChannel$str(), arg0);
    }
    protected String errorClosingChannel$str() {
        return "WFLYPRT0001: Got error closing channel %s";
    }
    @Override
    public final void failedToCloseResource(final Throwable arg0, final Object arg1) {
        super.log.logf(FQCN, ERROR, arg0, failedToCloseResource$str(), arg1);
    }
    protected String failedToCloseResource$str() {
        return "WFLYPRT0003: Failed to close resource %s";
    }
    @Override
    public final void failedToCloseServerSocket(final Throwable arg0, final ServerSocket arg1) {
        super.log.logf(FQCN, ERROR, arg0, failedToCloseServerSocket$str(), arg1);
    }
    protected String failedToCloseServerSocket$str() {
        return "WFLYPRT0004: Failed to close the server socket %s";
    }
    @Override
    public final void noSuchRequest(final int arg0, final Channel arg1) {
        super.log.logf(FQCN, WARN, null, noSuchRequest$str(), arg0, arg1);
    }
    protected String noSuchRequest$str() {
        return "WFLYPRT0018: No such request (%d) associated with channel %s";
    }
    protected String couldNotConnect$str() {
        return "WFLYPRT0023: Could not connect to %s. The connection timed out";
    }
    @Override
    public final ConnectException couldNotConnect(final URI arg0) {
        final ConnectException result = new ConnectException(String.format(getLoggingLocale(), couldNotConnect$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String invalidByteToken$str() {
        return "WFLYPRT0030: Invalid byte token.  Expecting '%d' received '%d'";
    }
    @Override
    public final IOException invalidByteToken(final int arg0, final byte arg1) {
        final IOException result = new IOException(String.format(getLoggingLocale(), invalidByteToken$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidSignature$str() {
        return "WFLYPRT0032: Invalid signature [%s]";
    }
    @Override
    public final IOException invalidSignature(final String arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), invalidSignature$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidType1$str() {
        return "WFLYPRT0034: Invalid type: %s";
    }
    @Override
    public final IOException invalidType(final String arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), invalidType1$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidType3$str() {
        return "WFLYPRT0035: Type is neither %s or %s: %s";
    }
    @Override
    public final IllegalArgumentException invalidType(final String arg0, final String arg1, final byte arg2) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidType3$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String operationIdAlreadyExists$str() {
        return "WFLYPRT0051: Operation with id %d already registered";
    }
    @Override
    public final IllegalStateException operationIdAlreadyExists(final int arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), operationIdAlreadyExists$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullExecutor$str() {
        return "WFLYPRT0052: Null executor";
    }
    @Override
    public final IllegalArgumentException nullExecutor() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullExecutor$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToConnect$str() {
        return "WFLYPRT0053: Could not connect to %s. The connection failed";
    }
    @Override
    public final ConnectException failedToConnect(final URI arg0, final Exception arg1) {
        final ConnectException result = new ConnectException(String.format(getLoggingLocale(), failedToConnect$str(), arg0));
        result.initCause(arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String channelClosed$str() {
        return "WFLYPRT0054: Channel closed";
    }
    @Override
    public final IOException channelClosed() {
        final IOException result = new IOException(String.format(getLoggingLocale(), channelClosed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSuchResponseHandler$str() {
        return "WFLYPRT0055: no handler registered for request type '%s'.";
    }
    @Override
    public final IOException noSuchResponseHandler(final String arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), noSuchResponseHandler$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String responseHandlerNotFound$str() {
        return "WFLYPRT0056: No response handler for request %s";
    }
    @Override
    public final IOException responseHandlerNotFound(final int arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), responseHandlerNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void cancelledAsyncTask(final String arg0, final Thread arg1) {
        super.log.logf(FQCN, INFO, null, cancelledAsyncTask$str(), arg0, arg1);
    }
    protected String cancelledAsyncTask$str() {
        return "WFLYPRT0057: %s cancelled task by interrupting thread %s";
    }
    @Override
    public final void cancelledAsyncTaskBeforeRun(final String arg0) {
        super.log.logf(FQCN, INFO, null, cancelledAsyncTaskBeforeRun$str(), arg0);
    }
    protected String cancelledAsyncTaskBeforeRun$str() {
        return "WFLYPRT0058: %s cancelled task before execution began";
    }
    @Override
    public final void deprecatedCLIConfiguration(final String arg0) {
        super.log.logf(FQCN, INFO, null, deprecatedCLIConfiguration$str(), arg0);
    }
    protected String deprecatedCLIConfiguration$str() {
        return "WFLYPRT0059: You are using a deprecated way to set the client bind address. Please use the \"--bind\" parameter on the CLI instead of the %s system property.";
    }
    protected String channelTimedOut$str() {
        return "WFLYPRT0060: Channel open request timed out";
    }
    @Override
    public final IOException channelTimedOut() {
        final IOException result = new IOException(String.format(getLoggingLocale(), channelTimedOut$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
