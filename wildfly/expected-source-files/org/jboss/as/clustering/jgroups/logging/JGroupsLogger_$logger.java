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
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:56:30+0200")
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
    public final void activatingSubsystem(final String version) {
        super.log.logf(FQCN, INFO, null, activatingSubsystem$str(), version);
    }
    protected String activatingSubsystem$str() {
        return "WFLYCLJG0001: Activating JGroups subsystem. JGroups version %s";
    }
    protected String parserFailure$str() {
        return "WFLYCLJG0007: Failed to parse %s";
    }
    @Override
    public final String parserFailure(final URL url) {
        return String.format(getLoggingLocale(), parserFailure$str(), url);
    }
    protected String notFound$str() {
        return "WFLYCLJG0008: Failed to locate %s";
    }
    @Override
    public final String notFound(final String resource) {
        return String.format(getLoggingLocale(), notFound$str(), resource);
    }
    protected String transportNotDefined$str() {
        return "WFLYCLJG0010: Transport for stack %s is not defined. Please specify both a transport and protocol list, either as optional parameters to add() or via batching.";
    }
    @Override
    public final OperationFailedException transportNotDefined(final String stackName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), transportNotDefined$str(), stackName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String unknownMetric$str() {
        return "WFLYCLJG0015: Unknown metric %s";
    }
    @Override
    public final String unknownMetric(final String metricName) {
        return String.format(getLoggingLocale(), unknownMetric$str(), metricName);
    }
    protected String unableToLoadProtocolClass$str() {
        return "WFLYCLJG0016: Unable to load protocol class %s";
    }
    @Override
    public final OperationFailedException unableToLoadProtocolClass(final String protocolName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToLoadProtocolClass$str(), protocolName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String keyEntryNotFound$str() {
        return "WFLYCLJG0022: %s entry not found in configured key store";
    }
    @Override
    public final IllegalArgumentException keyEntryNotFound(final String alias) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), keyEntryNotFound$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedKeyStoreEntryType$str() {
        return "WFLYCLJG0023: %s key store entry is not of the expected type: %s";
    }
    @Override
    public final IllegalArgumentException unexpectedKeyStoreEntryType(final String alias, final String type) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unexpectedKeyStoreEntryType$str(), alias, type));
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
    public final IllegalArgumentException failedToResolveSocketBinding(final UnknownHostException cause, final OutboundSocketBinding binding) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), failedToResolveSocketBinding$str(), binding), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void legacyProtocol(final String legacyProtocol, final String targetProtocol) {
        super.log.logf(FQCN, WARN, null, legacyProtocol$str(), legacyProtocol, targetProtocol);
    }
    protected String legacyProtocol$str() {
        return "WFLYCLJG0030: Protocol %s is obsolete and will be auto-updated to %s";
    }
    @Override
    public final void unrecognizedProtocolProperty(final String protocol, final String property) {
        super.log.logf(FQCN, WARN, null, unrecognizedProtocolProperty$str(), protocol, property);
    }
    protected String unrecognizedProtocolProperty$str() {
        return "WFLYCLJG0031: Ignoring unrecognized %s property: %s";
    }
    @Override
    public final void connecting(final String channelName, final String nodeName, final String clusterName, final InetSocketAddress address) {
        super.log.logf(FQCN, INFO, null, connecting$str(), channelName, nodeName, clusterName, address);
    }
    protected String connecting$str() {
        return "WFLYCLJG0032: Connecting '%s' channel. '%s' joining cluster '%s' via %s";
    }
    @Override
    public final void connected(final String channelName, final String nodeName, final String clusterName, final View view) {
        super.log.logf(FQCN, INFO, null, connected$str(), channelName, nodeName, clusterName, view);
    }
    protected String connected$str() {
        return "WFLYCLJG0033: Connected '%s' channel. '%s' joined cluster '%s' with view: %s";
    }
    @Override
    public final void disconnecting(final String channelName, final String nodeName, final String clusterName, final View view) {
        super.log.logf(FQCN, INFO, null, disconnecting$str(), channelName, nodeName, clusterName, view);
    }
    protected String disconnecting$str() {
        return "WFLYCLJG0034: Disconnecting '%s' channel. '%s' leaving cluster '%s' with view: %s";
    }
    @Override
    public final void disconnected(final String channelName, final String nodeName, final String clusterName) {
        super.log.logf(FQCN, INFO, null, disconnected$str(), channelName, nodeName, clusterName);
    }
    protected String disconnected$str() {
        return "WFLYCLJG0035: Disconnected '%s' channel. '%s' left cluster '%s'";
    }
}
