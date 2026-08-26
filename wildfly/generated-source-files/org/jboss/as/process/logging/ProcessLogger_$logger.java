package org.jboss.as.process.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.util.Set;
import org.jboss.as.version.Stability;
import org.jboss.logging.DelegatingBasicLogger;
import java.net.ServerSocket;
import java.lang.String;
import java.io.IOException;
import org.jboss.logging.Logger;
import java.io.UTFDataFormatException;
import org.jboss.logging.BasicLogger;
import java.io.EOFException;
import java.lang.Throwable;
import java.lang.Object;
import java.util.Arrays;
import java.net.InetAddress;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:46+0200")
public class ProcessLogger_$logger extends DelegatingBasicLogger implements ProcessLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ProcessLogger_$logger.class.getName();
    public ProcessLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void attemptToReconnectNonExistentProcess(final String arg0) {
        super.log.logf(FQCN, WARN, null, attemptToReconnectNonExistentProcess$str(), arg0);
    }
    protected String attemptToReconnectNonExistentProcess$str() {
        return "WFLYPC0001: Attempted to reconnect non-existent process '%s'";
    }
    @Override
    public final void attemptToRemoveNonExistentProcess(final String arg0) {
        super.log.logf(FQCN, WARN, null, attemptToRemoveNonExistentProcess$str(), arg0);
    }
    protected String attemptToRemoveNonExistentProcess$str() {
        return "WFLYPC0002: Attempted to remove non-existent process '%s'";
    }
    @Override
    public final void attemptToStartNonExistentProcess(final String arg0) {
        super.log.logf(FQCN, WARN, null, attemptToStartNonExistentProcess$str(), arg0);
    }
    protected String attemptToStartNonExistentProcess$str() {
        return "WFLYPC0003: Attempted to start non-existent process '%s'";
    }
    @Override
    public final void attemptToStopNonExistentProcess(final String arg0) {
        super.log.logf(FQCN, WARN, null, attemptToStopNonExistentProcess$str(), arg0);
    }
    protected String attemptToStopNonExistentProcess$str() {
        return "WFLYPC0004: Attempted to stop non-existent process '%s'";
    }
    @Override
    public final void duplicateProcessName(final String arg0) {
        super.log.logf(FQCN, WARN, null, duplicateProcessName$str(), arg0);
    }
    protected String duplicateProcessName$str() {
        return "WFLYPC0005: Attempted to register duplicate named process '%s'";
    }
    @Override
    public final void failedToSendAuthKey(final String arg0, final Throwable arg1) {
        super.log.logf(FQCN, WARN, null, failedToSendAuthKey$str(), arg0, arg1);
    }
    protected String failedToSendAuthKey$str() {
        return "WFLYPC0006: Failed to send authentication key to process '%s': %s";
    }
    @Override
    public final void failedToSendDataBytes(final Throwable arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, failedToSendDataBytes$str(), arg1);
    }
    protected String failedToSendDataBytes$str() {
        return "WFLYPC0007: Failed to send data bytes to process '%s' input stream";
    }
    @Override
    public final void failedToSendReconnect(final Throwable arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, failedToSendReconnect$str(), arg1);
    }
    protected String failedToSendReconnect$str() {
        return "WFLYPC0008: Failed to send reconnect message to process '%s' input stream";
    }
    @Override
    public final void failedToStartProcess(final Throwable arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, failedToStartProcess$str(), arg1);
    }
    protected String failedToStartProcess$str() {
        return "WFLYPC0009: Failed to start process '%s'";
    }
    @Override
    public final void failedToWriteMessage(final String arg0, final Throwable arg1) {
        super.log.logf(FQCN, ERROR, null, failedToWriteMessage$str(), arg0, arg1);
    }
    protected String failedToWriteMessage$str() {
        return "WFLYPC0010: Failed to write %s message to connection: %s";
    }
    @Override
    public final void processFinished(final String arg0, final int arg1) {
        super.log.logf(FQCN, INFO, null, processFinished$str(), arg0, arg1);
    }
    protected String processFinished$str() {
        return "WFLYPC0011: Process '%s' finished with an exit status of %d";
    }
    @Override
    public final void receivedInvalidVersion(final InetAddress arg0) {
        super.log.logf(FQCN, WARN, null, receivedInvalidVersion$str(), arg0);
    }
    protected String receivedInvalidVersion$str() {
        return "WFLYPC0012: Received connection with invalid version from %s";
    }
    @Override
    public final void receivedUnknownGreetingCode(final int arg0, final InetAddress arg1) {
        super.log.logf(FQCN, WARN, null, receivedUnknownGreetingCode$str(), arg0, arg1);
    }
    protected String receivedUnknownGreetingCode$str() {
        return "WFLYPC0013: Received unrecognized greeting code 0x%02x from %s";
    }
    @Override
    public final void receivedUnknownCredentials(final InetAddress arg0) {
        super.log.logf(FQCN, WARN, null, receivedUnknownCredentials$str(), arg0);
    }
    protected String receivedUnknownCredentials$str() {
        return "WFLYPC0014: Received connection with unknown credentials from %s";
    }
    @Override
    public final void receivedUnknownMessageCode(final int arg0) {
        super.log.logf(FQCN, WARN, null, receivedUnknownMessageCode$str(), arg0);
    }
    protected String receivedUnknownMessageCode$str() {
        return "WFLYPC0015: Received unknown message with code 0x%02x";
    }
    @Override
    public final void shutdownComplete() {
        super.log.logf(FQCN, INFO, null, shutdownComplete$str());
    }
    protected String shutdownComplete$str() {
        return "WFLYPC0016: All processes finished; exiting";
    }
    @Override
    public final void shuttingDown() {
        super.log.logf(FQCN, INFO, null, shuttingDown$str());
    }
    protected String shuttingDown$str() {
        return "WFLYPC0017: Shutting down process controller";
    }
    @Override
    public final void startingProcess(final String arg0) {
        super.log.logf(FQCN, INFO, null, startingProcess$str(), arg0);
    }
    protected String startingProcess$str() {
        return "WFLYPC0018: Starting process '%s'";
    }
    @Override
    public final void stoppingProcess(final String arg0) {
        super.log.logf(FQCN, INFO, null, stoppingProcess$str(), arg0);
    }
    protected String stoppingProcess$str() {
        return "WFLYPC0019: Stopping process '%s'";
    }
    @Override
    public final void streamProcessingFailed(final String arg0, final Throwable arg1) {
        super.log.logf(FQCN, ERROR, null, streamProcessingFailed$str(), arg0, arg1);
    }
    protected String streamProcessingFailed$str() {
        return "WFLYPC0020: Stream processing failed for process '%s': %s";
    }
    @Override
    public final void waitingToRestart(final int arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, waitingToRestart$str(), arg0, arg1);
    }
    protected String waitingToRestart$str() {
        return "WFLYPC0021: Waiting %d seconds until trying to restart process %s.";
    }
    @Override
    public final void failedToKillProcess(final String arg0) {
        super.log.logf(FQCN, WARN, null, failedToKillProcess$str(), arg0);
    }
    protected String failedToKillProcess$str() {
        return "WFLYPC0022: Failed to kill process '%s', trying to destroy the process instead.";
    }
    protected String argUsage$str() {
        return "Usage: %s [args...]%nwhere args include:";
    }
    @Override
    public final String argUsage(final String arg0) {
        return String.format(getLoggingLocale(), argUsage$str(), arg0);
    }
    protected String argBackup$str() {
        return "Keep a copy of the persistent domain configuration even if this host is not the Domain Controller. If ignore-unused-configuration is unset in host.xml, then the complete domain configuration will be stored, otherwise the configured value of ignore-unused-configuration will be used.";
    }
    @Override
    public final String argBackup() {
        return String.format(getLoggingLocale(), argBackup$str());
    }
    protected String argCachedDc$str() {
        return "If this host is not the Domain Controller and cannot contact the Domain Controller at boot, a locally cached copy of the domain configuration is used for boot (if available, see --backup.) The Domain Controller is background polled until it becomes available. Note that starting a host with --cached-dc when the Domain Controller is available will cache a copy of the domain configuration even if --backup is not used.";
    }
    @Override
    public final String argCachedDc() {
        return String.format(getLoggingLocale(), argCachedDc$str());
    }
    protected String argDomainConfig$str() {
        return "Name of the domain configuration file to use (default is \"domain.xml\") (Same as -c)";
    }
    @Override
    public final String argDomainConfig() {
        return String.format(getLoggingLocale(), argDomainConfig$str());
    }
    protected String argShortDomainConfig$str() {
        return "Name of the domain configuration file to use (default is \"domain.xml\") (Same as --domain-config)";
    }
    @Override
    public final String argShortDomainConfig() {
        return String.format(getLoggingLocale(), argShortDomainConfig$str());
    }
    protected String argReadOnlyDomainConfig$str() {
        return "Name of the domain configuration file to use. This differs from '--domain-config', '-c' and '-domain-config' in that the initial file is never overwritten.";
    }
    @Override
    public final String argReadOnlyDomainConfig() {
        return String.format(getLoggingLocale(), argReadOnlyDomainConfig$str());
    }
    protected String argHelp$str() {
        return "Display this message and exit";
    }
    @Override
    public final String argHelp() {
        return String.format(getLoggingLocale(), argHelp$str());
    }
    protected String argInterProcessHcAddress$str() {
        return "Address on which the host controller should listen for communication from the process controller";
    }
    @Override
    public final String argInterProcessHcAddress() {
        return String.format(getLoggingLocale(), argInterProcessHcAddress$str());
    }
    protected String argInterProcessHcPort$str() {
        return "Port on which the host controller should listen for communication from the process controller";
    }
    @Override
    public final String argInterProcessHcPort() {
        return String.format(getLoggingLocale(), argInterProcessHcPort$str());
    }
    protected String argHostConfig$str() {
        return "Name of the host configuration file to use (default is \"host.xml\")";
    }
    @Override
    public final String argHostConfig() {
        return String.format(getLoggingLocale(), argHostConfig$str());
    }
    protected String argReadOnlyHostConfig$str() {
        return "Name of the host configuration file to use. This differs from '--host-config' in that the initial file is never overwritten.";
    }
    @Override
    public final String argReadOnlyHostConfig() {
        return String.format(getLoggingLocale(), argReadOnlyHostConfig$str());
    }
    protected String argPcAddress$str() {
        return "Address on which the process controller listens for communication from processes it controls";
    }
    @Override
    public final String argPcAddress() {
        return String.format(getLoggingLocale(), argPcAddress$str());
    }
    protected String argPcPort$str() {
        return "Port on which the process controller listens for communication from processes it controls";
    }
    @Override
    public final String argPcPort() {
        return String.format(getLoggingLocale(), argPcPort$str());
    }
    protected String argProperties$str() {
        return "Load system properties from the given url";
    }
    @Override
    public final String argProperties() {
        return String.format(getLoggingLocale(), argProperties$str());
    }
    protected String argSystem$str() {
        return "Set a system property";
    }
    @Override
    public final String argSystem() {
        return String.format(getLoggingLocale(), argSystem$str());
    }
    protected String argVersion$str() {
        return "Print version and exit";
    }
    @Override
    public final String argVersion() {
        return String.format(getLoggingLocale(), argVersion$str());
    }
    protected String argPublicBindAddress$str() {
        return "Set system property jboss.bind.address to the given value";
    }
    @Override
    public final String argPublicBindAddress() {
        return String.format(getLoggingLocale(), argPublicBindAddress$str());
    }
    protected String argInterfaceBindAddress$str() {
        return "Set system property jboss.bind.address.<interface> to the given value";
    }
    @Override
    public final String argInterfaceBindAddress() {
        return String.format(getLoggingLocale(), argInterfaceBindAddress$str());
    }
    protected String argDefaultMulticastAddress$str() {
        return "Set system property jboss.default.multicast.address to the given value";
    }
    @Override
    public final String argDefaultMulticastAddress() {
        return String.format(getLoggingLocale(), argDefaultMulticastAddress$str());
    }
    protected String argAdminOnly$str() {
        return "Set the host controller's running type to ADMIN_ONLY causing it to open administrative interfaces and accept management requests but not start servers or, if this host controller is the primary for the domain, accept incoming connections from secondary host controllers.";
    }
    @Override
    public final String argAdminOnly() {
        return String.format(getLoggingLocale(), argAdminOnly$str());
    }
    protected String argMasterAddress$str() {
        return "Set system property jboss.domain.primary.address to the given value. In a default secondary Host Controller config, this is used to configure the address of the primary Host Controller.";
    }
    @Override
    public final String argMasterAddress() {
        return String.format(getLoggingLocale(), argMasterAddress$str());
    }
    protected String argMasterPort$str() {
        return "Set system property jboss.domain.primary.port to the given value. In a default secondary Host Controller config, this is used to configure the port used for native management communication by the primary Host Controller.";
    }
    @Override
    public final String argMasterPort() {
        return String.format(getLoggingLocale(), argMasterPort$str());
    }
    protected String argSecMgr$str() {
        return "Runs the server with a security manager installed.";
    }
    @Override
    public final String argSecMgr() {
        return String.format(getLoggingLocale(), argSecMgr$str());
    }
    protected String argStability$str() {
        return "Runs the server using a specific stability level.  Possible values: %s, Default = %s";
    }
    @Override
    public final String argStability(final Set<Stability> arg0, final Stability arg1) {
        return String.format(getLoggingLocale(), argStability$str(), arg0, arg1);
    }
    protected String noArgValue$str() {
        return "WFLYPC0023: No value was provided for argument %s";
    }
    @Override
    public final String noArgValue(final String arg0) {
        return String.format(getLoggingLocale(), noArgValue$str(), arg0);
    }
    protected String invalidAuthKeyLen$str() {
        return "WFLYPC0025: Authentication key must be 24 bytes long";
    }
    @Override
    public final IllegalArgumentException invalidAuthKeyLen() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidAuthKeyLen$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String invalidLength$str() {
        return "WFLYPC0029: %s length is invalid";
    }
    @Override
    public final IllegalArgumentException invalidLength(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidLength$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidOption$str() {
        return "WFLYPC0030: Invalid option: %s";
    }
    @Override
    public final IllegalArgumentException invalidOption(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidOption$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullCommandComponent$str() {
        return "WFLYPC0031: Command contains a null component";
    }
    @Override
    public final IllegalArgumentException nullCommandComponent() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullCommandComponent$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToAcceptConnection(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, failedToAcceptConnection$str());
    }
    protected String failedToAcceptConnection$str() {
        return "WFLYPC0033: Failed to accept a connection";
    }
    @Override
    public final void failedToCloseResource(final Throwable arg0, final Object arg1) {
        super.log.logf(FQCN, ERROR, arg0, failedToCloseResource$str(), arg1);
    }
    protected String failedToCloseResource$str() {
        return "WFLYPC0034: Failed to close resource %s";
    }
    @Override
    public final void failedToCloseServerSocket(final Throwable arg0, final ServerSocket arg1) {
        super.log.logf(FQCN, ERROR, arg0, failedToCloseServerSocket$str(), arg1);
    }
    protected String failedToCloseServerSocket$str() {
        return "WFLYPC0035: Failed to close the server socket %s";
    }
    @Override
    public final void failedToCloseSocket(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, failedToCloseSocket$str());
    }
    protected String failedToCloseSocket$str() {
        return "WFLYPC0036: Failed to close a socket";
    }
    @Override
    public final void failedToHandleIncomingConnection(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, failedToHandleIncomingConnection$str());
    }
    protected String failedToHandleIncomingConnection$str() {
        return "WFLYPC0039: Failed to handle incoming connection";
    }
    @Override
    public final void failedToHandleSocketFailure(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, failedToHandleSocketFailure$str());
    }
    protected String failedToHandleSocketFailure$str() {
        return "WFLYPC0040: Failed to handle socket failure condition";
    }
    @Override
    public final void failedToHandleSocketFinished(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, failedToHandleSocketFinished$str());
    }
    protected String failedToHandleSocketFinished$str() {
        return "WFLYPC0041: Failed to handle socket finished condition";
    }
    @Override
    public final void failedToHandleSocketShutdown(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, failedToHandleSocketShutdown$str());
    }
    protected String failedToHandleSocketShutdown$str() {
        return "WFLYPC0042: Failed to handle socket shut down condition";
    }
    @Override
    public final void failedToReadMessage(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, failedToReadMessage$str());
    }
    protected String failedToReadMessage$str() {
        return "WFLYPC0043: Failed to read a message";
    }
    @Override
    public final void leakedMessageOutputStream() {
        super.log.logf(FQCN, WARN, null, leakedMessageOutputStream$str());
    }
    protected String leakedMessageOutputStream$str() {
        return "WFLYPC0044: Leaked a message output stream; cleaning";
    }
    protected String failedToCreateServerThread$str() {
        return "WFLYPC0045: Failed to create server thread";
    }
    @Override
    public final IOException failedToCreateServerThread() {
        final IOException result = new IOException(String.format(getLoggingLocale(), failedToCreateServerThread$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToReadObject$str() {
        return "WFLYPC0046: Failed to read object";
    }
    @Override
    public final IOException failedToReadObject(final Throwable arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), failedToReadObject$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidByte0$str() {
        return "WFLYPC0047: Invalid byte";
    }
    @Override
    public final UTFDataFormatException invalidByte() {
        final UTFDataFormatException result = new UTFDataFormatException(String.format(getLoggingLocale(), invalidByte0$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidByte2$str() {
        return "WFLYPC0048: Invalid byte:%s(%d)";
    }
    @Override
    public final UTFDataFormatException invalidByte(final char arg0, final int arg1) {
        final UTFDataFormatException result = new UTFDataFormatException(String.format(getLoggingLocale(), invalidByte2$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidByteToken$str() {
        return "WFLYPC0049: Invalid byte token.  Expecting '%s' received '%s'";
    }
    @Override
    public final IOException invalidByteToken(final int arg0, final byte arg1) {
        final IOException result = new IOException(String.format(getLoggingLocale(), invalidByteToken$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidCommandByte$str() {
        return "WFLYPC0050: Invalid command byte read: %s";
    }
    @Override
    public final IOException invalidCommandByte(final int arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), invalidCommandByte$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidStartChunk$str() {
        return "WFLYPC0051: Invalid start chunk start [%s]";
    }
    @Override
    public final IOException invalidStartChunk(final int arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), invalidStartChunk$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String readBytes$str() {
        return "WFLYPC0056: Read %d bytes.";
    }
    @Override
    public final EOFException readBytes(final int arg0) {
        final EOFException result = new EOFException(String.format(getLoggingLocale(), readBytes$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String streamClosed$str() {
        return "WFLYPC0058: Stream closed";
    }
    @Override
    public final IOException streamClosed() {
        final IOException result = new IOException(String.format(getLoggingLocale(), streamClosed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String threadCreationRefused$str() {
        return "WFLYPC0059: Thread creation was refused";
    }
    @Override
    public final IllegalStateException threadCreationRefused() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), threadCreationRefused$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedEndOfStream$str() {
        return "WFLYPC0060: Unexpected end of stream";
    }
    @Override
    public final EOFException unexpectedEndOfStream() {
        final EOFException result = new EOFException(String.format(getLoggingLocale(), unexpectedEndOfStream$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String writeChannelClosed$str() {
        return "WFLYPC0061: Write channel closed";
    }
    @Override
    public final IOException writeChannelClosed() {
        final IOException result = new IOException(String.format(getLoggingLocale(), writeChannelClosed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String writesAlreadyShutdown$str() {
        return "WFLYPC0062: Writes are already shut down";
    }
    @Override
    public final IOException writesAlreadyShutdown() {
        final IOException result = new IOException(String.format(getLoggingLocale(), writesAlreadyShutdown$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void attemptingToKillProcess(final String arg0, final long arg1) {
        super.log.logf(FQCN, INFO, null, attemptingToKillProcess$str(), arg0, arg1);
    }
    protected String attemptingToKillProcess$str() {
        return "WFLYPC0063: Process '%s' did not complete normal stop within %d ms; attempting to kill process using OS calls";
    }
    @Override
    public final void jpsCommandNotFound(final String arg0) {
        super.log.logf(FQCN, INFO, null, jpsCommandNotFound$str(), arg0);
    }
    protected String jpsCommandNotFound$str() {
        return "WFLYPC0064: Cannot locate process '%s' -- could not find the 'jps' command";
    }
    @Override
    public final void processNotFound(final String arg0) {
        super.log.logf(FQCN, INFO, null, processNotFound$str(), arg0);
    }
    protected String processNotFound$str() {
        return "WFLYPC0065: No process identifiable as '%s' could be found";
    }
    @Override
    public final void multipleProcessesFound(final String arg0) {
        super.log.logf(FQCN, INFO, null, multipleProcessesFound$str(), arg0);
    }
    protected String multipleProcessesFound$str() {
        return "WFLYPC0066: Multiple processes identifiable as '%s' found; OS level kill cannot be safely performed";
    }
    @Override
    public final void destroyingProcess(final String arg0, final long arg1) {
        super.log.logf(FQCN, INFO, null, destroyingProcess$str(), arg0, arg1);
    }
    protected String destroyingProcess$str() {
        return "WFLYPC0067: Process '%s' did not complete normal stop within %d ms; attempting to destroy process using java.lang.Process.destroyForcibly()";
    }
}
