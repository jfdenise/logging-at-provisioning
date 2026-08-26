package org.jboss.as.clustering.jgroups.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.net.UnknownHostException;
import org.jboss.as.network.OutboundSocketBinding;
import org.jboss.logging.DelegatingBasicLogger;
import java.net.InetSocketAddress;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import org.jboss.logging.Logger;
import org.jgroups.View;
import java.net.URL;
import org.jboss.logging.BasicLogger;
import java.util.Arrays;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:06+0200")
public class JGroupsLogger_$logger extends DelegatingBasicLogger implements JGroupsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = JGroupsLogger_$logger.class.getName();
    public JGroupsLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void activatingSubsystem(final String arg0) {
        super.log.logf(FQCN, INFO, null, activatingSubsystem$str(), arg0);
    }
    protected String activatingSubsystem$str() {
        return "WFLYCLJG0001: Activating JGroups subsystem. JGroups version %s";
    }
    protected String parserFailure$str() {
        return "WFLYCLJG0007: Failed to parse %s";
    }
    @Override
    public final String parserFailure(final URL arg0) {
        return String.format(getLoggingLocale(), parserFailure$str(), arg0);
    }
    protected String notFound$str() {
        return "WFLYCLJG0008: Failed to locate %s";
    }
    @Override
    public final String notFound(final String arg0) {
        return String.format(getLoggingLocale(), notFound$str(), arg0);
    }
    protected String unknownMetric$str() {
        return "WFLYCLJG0015: Unknown metric %s";
    }
    @Override
    public final String unknownMetric(final String arg0) {
        return String.format(getLoggingLocale(), unknownMetric$str(), arg0);
    }
    protected String unableToLoadProtocolClass$str() {
        return "WFLYCLJG0016: Unable to load protocol class %s";
    }
    @Override
    public final OperationFailedException unableToLoadProtocolClass(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToLoadProtocolClass$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String keyEntryNotFound$str() {
        return "WFLYCLJG0022: %s entry not found in configured key store";
    }
    @Override
    public final IllegalArgumentException keyEntryNotFound(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), keyEntryNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedKeyStoreEntryType$str() {
        return "WFLYCLJG0023: %s key store entry is not of the expected type: %s";
    }
    @Override
    public final IllegalArgumentException unexpectedKeyStoreEntryType(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unexpectedKeyStoreEntryType$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedCredentialSource$str() {
        return "WFLYCLJG0025: Configured credential source does not reference a clear-text password credential";
    }
    @Override
    public final IllegalArgumentException unexpectedCredentialSource() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unexpectedCredentialSource$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToResolveSocketBinding$str() {
        return "WFLYCLJG0028: Could not resolve destination address for outbound socket binding named '%s'";
    }
    @Override
    public final IllegalArgumentException failedToResolveSocketBinding(final UnknownHostException arg0, final OutboundSocketBinding arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), failedToResolveSocketBinding$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void legacyProtocol(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, legacyProtocol$str(), arg0, arg1);
    }
    protected String legacyProtocol$str() {
        return "WFLYCLJG0030: Protocol %s is obsolete and will be auto-updated to %s";
    }
    @Override
    public final void unrecognizedProtocolProperty(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, unrecognizedProtocolProperty$str(), arg0, arg1);
    }
    protected String unrecognizedProtocolProperty$str() {
        return "WFLYCLJG0031: Ignoring unrecognized %s property: %s";
    }
    @Override
    public final void connecting(final String arg0, final String arg1, final String arg2, final InetSocketAddress arg3) {
        super.log.logf(FQCN, INFO, null, connecting$str(), arg0, arg1, arg2, arg3);
    }
    protected String connecting$str() {
        return "WFLYCLJG0032: Connecting '%s' channel. '%s' joining cluster '%s' via %s";
    }
    @Override
    public final void connected(final String arg0, final String arg1, final String arg2, final View arg3) {
        super.log.logf(FQCN, INFO, null, connected$str(), arg0, arg1, arg2, arg3);
    }
    protected String connected$str() {
        return "WFLYCLJG0033: Connected '%s' channel. '%s' joined cluster '%s' with view: %s";
    }
    @Override
    public final void disconnecting(final String arg0, final String arg1, final String arg2, final View arg3) {
        super.log.logf(FQCN, INFO, null, disconnecting$str(), arg0, arg1, arg2, arg3);
    }
    protected String disconnecting$str() {
        return "WFLYCLJG0034: Disconnecting '%s' channel. '%s' leaving cluster '%s' with view: %s";
    }
    @Override
    public final void disconnected(final String arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, INFO, null, disconnected$str(), arg0, arg1, arg2);
    }
    protected String disconnected$str() {
        return "WFLYCLJG0035: Disconnected '%s' channel. '%s' left cluster '%s'";
    }
    protected String unableToLoadProtocolModule$str() {
        return "WFLYCLJG0036: Unable to load module %s for protocol %s";
    }
    @Override
    public final OperationFailedException unableToLoadProtocolModule(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToLoadProtocolModule$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void secureSocketChannelNotAvailable(final String arg0) {
        super.log.logf(FQCN, WARN, null, secureSocketChannelNotAvailable1$str(), arg0);
    }
    protected String secureSocketChannelNotAvailable1$str() {
        return "WFLYCLJG0037: Service '%s' requires a non-blocking socket for which TLS support is not available.  To secure cluster communication for this service, use a blocking socket variant of the associated protocol.";
    }
    @Override
    public final void secureSocketChannelNotAvailable() {
        super.log.logf(FQCN, WARN, null, secureSocketChannelNotAvailable0$str());
    }
    protected String secureSocketChannelNotAvailable0$str() {
        return "WFLYCLJG0038: Unknown service requires a non-blocking socket for which TLS support is not available.  To secure cluster communication for this service, use a blocking socket variant of the associated protocol.";
    }
}
