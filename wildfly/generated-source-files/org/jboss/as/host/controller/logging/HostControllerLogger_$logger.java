package org.jboss.as.host.controller.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.as.host.controller.model.jvm.JvmType;
import org.jboss.logging.Logger;
import org.jboss.as.controller.RunningMode;
import javax.security.sasl.SaslException;
import java.net.URI;
import java.lang.InterruptedException;
import java.net.URL;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.client.helpers.domain.ServerStatus;
import org.jboss.as.protocol.mgmt.RequestProcessingException;
import java.util.concurrent.ExecutionException;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;
import java.nio.file.Path;
import javax.annotation.processing.Generated;
import org.jboss.as.version.Stability;
import org.jboss.remoting3.Channel;
import java.security.GeneralSecurityException;
import org.jboss.as.controller.OperationFailedException;
import java.io.IOException;
import org.jboss.as.host.controller.model.host.AdminOnlyDomainConfigPolicy;
import java.lang.Exception;
import javax.xml.stream.XMLStreamException;
import java.lang.Throwable;
import java.lang.Object;
import java.util.Arrays;
import org.jboss.dmr.ModelNode;
import org.jboss.as.host.controller.discovery.DiscoveryOption;
import java.io.File;
import javax.xml.stream.Location;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.FATAL;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:19+0200")
public class HostControllerLogger_$logger extends DelegatingBasicLogger implements HostControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = HostControllerLogger_$logger.class.getName();
    public HostControllerLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void cannotConnect(final URI arg0, final Exception arg1) {
        super.log.logf(FQCN, WARN, arg1, cannotConnect$str(), arg0);
    }
    protected String cannotConnect$str() {
        return "WFLYHC0001: Could not connect to remote domain controller %s";
    }
    @Override
    public final void cannotConnectToMaster(final Exception arg0) {
        super.log.logf(FQCN, ERROR, null, cannotConnectToMaster$str(), arg0);
    }
    protected String cannotConnectToMaster$str() {
        return "WFLYHC0002: Could not connect to the domain controller. Error was: %s";
    }
    @Override
    public final void creatingHttpManagementService(final String arg0, final int arg1, final int arg2) {
        super.log.logf(FQCN, INFO, null, creatingHttpManagementService$str(), arg0, arg1, arg2);
    }
    protected String creatingHttpManagementService$str() {
        return "WFLYHC0003: Creating http management service using network interface (%s) port (%d) securePort (%d)";
    }
    @Override
    public final void existingServerWithState(final String arg0, final ServerStatus arg1) {
        super.log.logf(FQCN, WARN, null, existingServerWithState$str(), arg0, arg1);
    }
    protected String existingServerWithState$str() {
        return "WFLYHC0005: Existing server [%s] with status: %s";
    }
    @Override
    public final void failedToStartServer(final Throwable arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, failedToStartServer$str(), arg1);
    }
    protected String failedToStartServer$str() {
        return "WFLYHC0008: Failed to start server (%s)";
    }
    @Override
    public final void failedToStopServer(final Throwable arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, failedToStopServer$str(), arg1);
    }
    protected String failedToStopServer$str() {
        return "WFLYHC0009: Failed to stop server (%s)";
    }
    @Override
    public final void ignoringPermGen(final JvmType arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, ignoringPermGen$str(), arg0, arg1);
    }
    protected String ignoringPermGen$str() {
        return "WFLYHC0011: Ignoring <permgen> for jvm '%s' type jvm: %s";
    }
    @Override
    public final void noDomainControllerConfigurationProvided(final RunningMode arg0, final String arg1, final RunningMode arg2) {
        super.log.logf(FQCN, ERROR, null, noDomainControllerConfigurationProvided$str(), arg0, arg1, arg2);
    }
    protected String noDomainControllerConfigurationProvided$str() {
        return "WFLYHC0012: No <domain-controller> configuration was provided and the current running mode ('%s') requires access to the Domain Controller host. Startup will be aborted. Use the %s command line argument to start in %s mode if you need to start without a domain controller connection and then use the management tools to configure one.";
    }
    @Override
    public final void httpManagementInterfaceIsUnsecured() {
        super.log.logf(FQCN, WARN, null, httpManagementInterfaceIsUnsecured$str());
    }
    protected String httpManagementInterfaceIsUnsecured$str() {
        return "WFLYHC0013: No security realm defined for http management service, all access will be unrestricted.";
    }
    @Override
    public final void noServerAvailable(final String arg0) {
        super.log.logf(FQCN, ERROR, null, noServerAvailable$str(), arg0);
    }
    protected String noServerAvailable$str() {
        return "WFLYHC0014: No server called %s available";
    }
    @Override
    public final void lostRemoteDomainConnection() {
        super.log.logf(FQCN, WARN, null, lostRemoteDomainConnection$str());
    }
    protected String lostRemoteDomainConnection$str() {
        return "WFLYHC0015: Connection to remote host-controller closed. Trying to reconnect.";
    }
    @Override
    public final void optionAlreadySet(final String arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, WARN, null, optionAlreadySet$str(), arg0, arg1, arg2);
    }
    protected String optionAlreadySet$str() {
        return "WFLYHC0016: Ignoring <option value=\"%s\" for jvm '%s' since '%s' was set";
    }
    @Override
    public final void reconnectingServer(final String arg0) {
        super.log.logf(FQCN, INFO, null, reconnectingServer$str(), arg0);
    }
    protected String reconnectingServer$str() {
        return "WFLYHC0018: Reconnecting server %s";
    }
    @Override
    public final void registeredRemoteSlaveHost(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, registeredRemoteSlaveHost$str(), arg0, arg1);
    }
    protected String registeredRemoteSlaveHost$str() {
        return "WFLYHC0019: Registered remote secondary host \"%s\", %s";
    }
    @Override
    public final void registeringServer(final String arg0) {
        super.log.logf(FQCN, INFO, null, registeringServer$str(), arg0);
    }
    protected String registeringServer$str() {
        return "WFLYHC0020: Registering server %s";
    }
    @Override
    public final void serverConnected(final String arg0, final Channel arg1) {
        super.log.logf(FQCN, INFO, null, serverConnected$str(), arg0, arg1);
    }
    protected String serverConnected$str() {
        return "WFLYHC0021: Server [%s] connected using connection [%s]";
    }
    @Override
    public final void startingServer(final String arg0) {
        super.log.logf(FQCN, INFO, null, startingServer$str(), arg0);
    }
    protected String startingServer$str() {
        return "WFLYHC0023: Starting server %s";
    }
    @Override
    public final void stoppingServer(final String arg0) {
        super.log.logf(FQCN, INFO, null, stoppingServer$str(), arg0);
    }
    protected String stoppingServer$str() {
        return "WFLYHC0024: Stopping server %s";
    }
    @Override
    public final void unregisteredRemoteSlaveHost(final String arg0) {
        super.log.logf(FQCN, INFO, null, unregisteredRemoteSlaveHost$str(), arg0);
    }
    protected String unregisteredRemoteSlaveHost$str() {
        return "WFLYHC0026: Unregistered remote secondary host \"%s\"";
    }
    @Override
    public final void unregisteringServer(final String arg0) {
        super.log.logf(FQCN, INFO, null, unregisteringServer$str(), arg0);
    }
    protected String unregisteringServer$str() {
        return "WFLYHC0027: Unregistering server %s";
    }
    @Override
    public final void unregisteredAtRemoteHostController() {
        super.log.logf(FQCN, INFO, null, unregisteredAtRemoteHostController$str());
    }
    protected String unregisteredAtRemoteHostController$str() {
        return "WFLYHC0029: Unregistered at domain controller";
    }
    @Override
    public final void lostConnectionToRemoteHost(final String arg0) {
        super.log.logf(FQCN, WARN, null, lostConnectionToRemoteHost$str(), arg0);
    }
    protected String lostConnectionToRemoteHost$str() {
        return "WFLYHC0030: Connection to remote host \"%s\" closed unexpectedly";
    }
    @Override
    public final void invalidRemoteBackupPersisterState() {
        super.log.logf(FQCN, WARN, null, invalidRemoteBackupPersisterState$str());
    }
    protected String invalidRemoteBackupPersisterState$str() {
        return "WFLYHC0031: Cannot load the domain model using --backup";
    }
    @Override
    public final void caughtExceptionDuringBoot(final Exception arg0) {
        super.log.logf(FQCN, ERROR, arg0, caughtExceptionDuringBoot$str());
    }
    protected String caughtExceptionDuringBoot$str() {
        return "WFLYHC0033: Caught exception during boot";
    }
    protected String unsuccessfulBoot$str() {
        return "WFLYHC0034: Host Controller boot has failed in an unrecoverable manner; exiting. See previous messages for details. %s";
    }
    @Override
    public final String unsuccessfulBoot(final String arg0) {
        return String.format(getLoggingLocale(), unsuccessfulBoot$str(), arg0);
    }
    @Override
    public final void reportAdminOnlyDomainXmlFailure() {
        super.log.logf(FQCN, ERROR, null, reportAdminOnlyDomainXmlFailure$str());
    }
    protected String reportAdminOnlyDomainXmlFailure$str() {
        return "WFLYHC0035: Installation of the domain-wide configuration has failed. Because the running mode of this Host Controller is ADMIN_ONLY boot has been allowed to proceed. If ADMIN_ONLY mode were not in effect the process would be terminated due to a critical boot failure.";
    }
    @Override
    public final void masterHostControllerChanged() {
        super.log.logf(FQCN, INFO, null, masterHostControllerChanged$str());
    }
    protected String masterHostControllerChanged$str() {
        return "WFLYHC0037: The primary Host Controller has been restarted. Re-registering this secondary Host Controller with the new primary.";
    }
    @Override
    public final void masterHostControllerUnreachable(final long arg0) {
        super.log.logf(FQCN, WARN, null, masterHostControllerUnreachable$str(), arg0);
    }
    protected String masterHostControllerUnreachable$str() {
        return "WFLYHC0038: The domain controller could not be reached in the last [%d] milliseconds. Re-connecting.";
    }
    @Override
    public final void slaveHostControllerChanged(final String arg0) {
        super.log.logf(FQCN, INFO, null, slaveHostControllerChanged$str(), arg0);
    }
    protected String slaveHostControllerChanged$str() {
        return "WFLYHC0039: The secondary Host Controller \"%s\" has been restarted or is attempting to reconnect. Unregistering the current connection to this secondary.";
    }
    @Override
    public final void slaveHostControllerUnreachable(final String arg0, final long arg1) {
        super.log.logf(FQCN, WARN, null, slaveHostControllerUnreachable$str(), arg0, arg1);
    }
    protected String slaveHostControllerUnreachable$str() {
        return "WFLYHC0040: The secondary Host Controller \"%s\" could not be reached in the last [%d] milliseconds. Unregistering.";
    }
    protected String argumentExpected$str() {
        return "WFLYHC0041: Argument expected for option %s. %s";
    }
    @Override
    public final String argumentExpected(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), argumentExpected$str(), arg0, arg1);
    }
    protected String attemptingToSet$str() {
        return "WFLYHC0042: Attempting to set '%s' when '%s' was already set";
    }
    @Override
    public final IllegalArgumentException attemptingToSet(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), attemptingToSet$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String authenticationFailureUnableToConnect$str() {
        return "WFLYHC0043: Unable to connect due to authentication failure.";
    }
    @Override
    public final IllegalStateException authenticationFailureUnableToConnect(final Throwable arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), authenticationFailureUnableToConnect$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAccessRemoteFileRepository$str() {
        return "WFLYHC0044: Cannot access a remote file repository from the domain controller";
    }
    @Override
    public final IllegalStateException cannotAccessRemoteFileRepository() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotAccessRemoteFileRepository$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCreateLocalDirectory$str() {
        return "WFLYHC0045: Unable to create local directory: %s";
    }
    @Override
    public final IOException cannotCreateLocalDirectory(final File arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), cannotCreateLocalDirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotObtainValidDefaultAddress$str() {
        return "WFLYHC0046: Cannot obtain a valid default address for communicating with the ProcessController using either %s or InetAddress.getLocalHost(). Please check your system's network configuration or use the %s command line switch to configure a valid address";
    }
    @Override
    public final RuntimeException cannotObtainValidDefaultAddress(final Throwable arg0, final String arg1, final String arg2) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotObtainValidDefaultAddress$str(), arg1, arg2), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRestartServer$str() {
        return "WFLYHC0047: Cannot restart server %s as it is not currently started; it is %s";
    }
    @Override
    public final String cannotRestartServer(final String arg0, final ServerStatus arg1) {
        return String.format(getLoggingLocale(), cannotRestartServer$str(), arg0, arg1);
    }
    protected String cannotStartServersInvalidMode$str() {
        return "WFLYHC0048: Cannot start servers when the Host Controller running mode is %s";
    }
    @Override
    public final String cannotStartServersInvalidMode(final RunningMode arg0) {
        return String.format(getLoggingLocale(), cannotStartServersInvalidMode$str(), arg0);
    }
    protected String closeShouldBeManagedByService$str() {
        return "WFLYHC0049: Close should be managed by the service";
    }
    @Override
    public final UnsupportedOperationException closeShouldBeManagedByService() {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), closeShouldBeManagedByService$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String configurationPersisterAlreadyInitialized$str() {
        return "WFLYHC0050: Configuration persister for domain model is already initialized";
    }
    @Override
    public final IllegalStateException configurationPersisterAlreadyInitialized() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), configurationPersisterAlreadyInitialized$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String connectionToMasterInterrupted$str() {
        return "WFLYHC0051: Interrupted while trying to connect to the domain controller";
    }
    @Override
    public final IllegalStateException connectionToMasterInterrupted() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), connectionToMasterInterrupted$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String connectionToMasterTimeout$str() {
        return "WFLYHC0052: Could not connect to the domain controller in %d attempts within %s ms";
    }
    @Override
    public final IllegalStateException connectionToMasterTimeout(final Throwable arg0, final int arg1, final long arg2) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), connectionToMasterTimeout$str(), arg1, arg2), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotGetServerInventory$str() {
        return "WFLYHC0053: Could not get the server inventory in %d %s";
    }
    @Override
    public final RuntimeException couldNotGetServerInventory(final long arg0, final String arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotGetServerInventory$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String didNotReadEntireFile$str() {
        return "WFLYHC0054: Did not read the entire file. Missing: %d";
    }
    @Override
    public final IOException didNotReadEntireFile(final long arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), didNotReadEntireFile$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorClosingDownHost$str() {
        return "WFLYHC0055: Error closing down host";
    }
    @Override
    public final RuntimeException errorClosingDownHost(final Throwable arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorClosingDownHost$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedProfileOperationsRetrieval$str() {
        return "WFLYHC0056: Failed to retrieve profile operations from domain controller";
    }
    @Override
    public final String failedProfileOperationsRetrieval() {
        return String.format(getLoggingLocale(), failedProfileOperationsRetrieval$str());
    }
    protected String failedToGetFileFromRemoteRepository$str() {
        return "WFLYHC0057: Failed to get file from remote repository";
    }
    @Override
    public final RuntimeException failedToGetFileFromRemoteRepository(final Throwable arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToGetFileFromRemoteRepository$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToGetServerStatus$str() {
        return "WFLYHC0058: Failed to get server status";
    }
    @Override
    public final String failedToGetServerStatus() {
        return String.format(getLoggingLocale(), failedToGetServerStatus$str());
    }
    protected String failedToReadAuthenticationKey$str() {
        return "WFLYHC0059: Failed to read authentication key: %s";
    }
    @Override
    public final String failedToReadAuthenticationKey(final Throwable arg0) {
        return String.format(getLoggingLocale(), failedToReadAuthenticationKey$str(), arg0);
    }
    protected String insufficientInformationToGenerateHash$str() {
        return "WFLYHC0061: Insufficient information to generate hash.";
    }
    @Override
    public final SaslException insufficientInformationToGenerateHash() {
        final SaslException result = new SaslException(String.format(getLoggingLocale(), insufficientInformationToGenerateHash$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidOption$str() {
        return "WFLYHC0062: Invalid option '%s'. %s";
    }
    @Override
    public final String invalidOption(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), invalidOption$str(), arg0, arg1);
    }
    protected String invalidRootId$str() {
        return "WFLYHC0063: Invalid root id [%d]";
    }
    @Override
    public final RequestProcessingException invalidRootId(final int arg0) {
        final RequestProcessingException result = new RequestProcessingException(String.format(getLoggingLocale(), invalidRootId$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidValue$str() {
        return "WFLYHC0064: Value for %s is not an %s -- %s. %s";
    }
    @Override
    public final String invalidValue(final String arg0, final String arg1, final Object arg2, final String arg3) {
        return String.format(getLoggingLocale(), invalidValue$str(), arg0, arg1, arg2, arg3);
    }
    protected String invocationNotAllowedAfterBoot$str() {
        return "WFLYHC0065: Invocations of %s after HostController boot are not allowed";
    }
    @Override
    public final IllegalStateException invocationNotAllowedAfterBoot(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invocationNotAllowedAfterBoot$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final String invocationNotAllowedAfterBoot(final ModelNode arg0) {
        return String.format(getLoggingLocale(), invocationNotAllowedAfterBoot$str(), arg0);
    }
    protected String malformedUrl$str() {
        return "WFLYHC0066: Malformed URL provided for option %s. %s";
    }
    @Override
    public final String malformedUrl(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), malformedUrl$str(), arg0, arg1);
    }
    protected String mustInvokeBeforeCheckingSlaveStatus$str() {
        return "WFLYHC0067: Must call %s before checking for secondary Host Controller status";
    }
    @Override
    public final IllegalStateException mustInvokeBeforeCheckingSlaveStatus(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), mustInvokeBeforeCheckingSlaveStatus$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mustInvokeBeforePersisting$str() {
        return "WFLYHC0068: Must call %s before persisting the domain model";
    }
    @Override
    public final IllegalStateException mustInvokeBeforePersisting(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), mustInvokeBeforePersisting$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noServerInventory$str() {
        return "WFLYHC0071: No server inventory";
    }
    @Override
    public final IllegalStateException noServerInventory() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noServerInventory$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverNameAlreadyRegistered$str() {
        return "WFLYHC0077: There is already a registered server named '%s'";
    }
    @Override
    public final IllegalArgumentException serverNameAlreadyRegistered(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), serverNameAlreadyRegistered$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverStillRunning$str() {
        return "WFLYHC0078: Server (%s) still running";
    }
    @Override
    public final String serverStillRunning(final String arg0) {
        return String.format(getLoggingLocale(), serverStillRunning$str(), arg0);
    }
    protected String unableToGenerateHash$str() {
        return "WFLYHC0079: Unable to generate hash";
    }
    @Override
    public final SaslException unableToGenerateHash(final Throwable arg0) {
        final SaslException result = new SaslException(String.format(getLoggingLocale(), unableToGenerateHash$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToLoadProperties$str() {
        return "WFLYHC0080: Unable to load properties from URL %s. %s";
    }
    @Override
    public final String unableToLoadProperties(final URL arg0, final String arg1) {
        return String.format(getLoggingLocale(), unableToLoadProperties$str(), arg0, arg1);
    }
    protected String undefinedSocketBinding$str() {
        return "WFLYHC0081: Undefined socket binding group for server %s";
    }
    @Override
    public final IllegalArgumentException undefinedSocketBinding(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), undefinedSocketBinding$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String undefinedSocketBindingGroup$str() {
        return "WFLYHC0082: Included socket binding group %s is not defined";
    }
    @Override
    public final IllegalStateException undefinedSocketBindingGroup(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), undefinedSocketBindingGroup$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknown$str() {
        return "WFLYHC0084: Unknown %s %s";
    }
    @Override
    public final IllegalArgumentException unknown(final String arg0, final Object arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknown$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownHostValue$str() {
        return "WFLYHC0085: Value for %s is not a known host -- %s. %s";
    }
    @Override
    public final String unknownHostValue(final String arg0, final Object arg1, final String arg2) {
        return String.format(getLoggingLocale(), unknownHostValue$str(), arg0, arg1, arg2);
    }
    protected String hostAlreadyShutdown$str() {
        return "WFLYHC0087: Host-Controller is already shutdown.";
    }
    @Override
    public final IllegalStateException hostAlreadyShutdown() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), hostAlreadyShutdown$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String hostControllerSystemPropertyUpdateNotSupported$str() {
        return "WFLYHC0090: HostControllerEnvironment does not support system property updates";
    }
    @Override
    public final UnsupportedOperationException hostControllerSystemPropertyUpdateNotSupported() {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), hostControllerSystemPropertyUpdateNotSupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotIgnoreTypeHost$str() {
        return "WFLYHC0091: Resources of type %s cannot be ignored";
    }
    @Override
    public final OperationFailedException cannotIgnoreTypeHost(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotIgnoreTypeHost$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateIgnoredResourceType$str() {
        return "WFLYHC0092: An '%s' element whose 'type' attribute is '%s' has already been found";
    }
    @Override
    public final XMLStreamException duplicateIgnoredResourceType(final String arg0, final String arg1, final Location arg2) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), duplicateIgnoredResourceType$str(), arg0, arg1), arg2);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAccessJvmInputArgument$str() {
        return "WFLYHC0093: The JVM input arguments cannot be accessed so system properties passed directly to this Host Controller JVM will not be passed through to server processes. Cause of the problem: %s";
    }
    @Override
    public final String cannotAccessJvmInputArgument(final Exception arg0) {
        return String.format(getLoggingLocale(), cannotAccessJvmInputArgument$str(), arg0);
    }
    protected String missingHomeDirConfiguration$str() {
        return "WFLYHC0094: Missing configuration value for: %s";
    }
    @Override
    public final IllegalStateException missingHomeDirConfiguration(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), missingHomeDirConfiguration$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String homeDirectoryDoesNotExist$str() {
        return "WFLYHC0095: Home directory does not exist: %s";
    }
    @Override
    public final IllegalStateException homeDirectoryDoesNotExist(final File arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), homeDirectoryDoesNotExist$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String domainBaseDirectoryDoesNotExist$str() {
        return "WFLYHC0097: Domain base directory does not exist: %s";
    }
    @Override
    public final IllegalStateException domainBaseDirectoryDoesNotExist(final File arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), domainBaseDirectoryDoesNotExist$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String domainBaseDirectoryIsNotADirectory$str() {
        return "WFLYHC0098: Domain base directory is not a directory: %s";
    }
    @Override
    public final IllegalStateException domainBaseDirectoryIsNotADirectory(final File arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), domainBaseDirectoryIsNotADirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String configDirectoryDoesNotExist$str() {
        return "WFLYHC0099: Configuration directory does not exist: %s";
    }
    @Override
    public final IllegalStateException configDirectoryDoesNotExist(final File arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), configDirectoryDoesNotExist$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String domainDataDirectoryIsNotDirectory$str() {
        return "WFLYHC0100: Domain data directory is not a directory: %s";
    }
    @Override
    public final IllegalStateException domainDataDirectoryIsNotDirectory(final File arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), domainDataDirectoryIsNotDirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateDomainDataDirectory$str() {
        return "WFLYHC0101: Could not create domain data directory: %s";
    }
    @Override
    public final IllegalStateException couldNotCreateDomainDataDirectory(final File arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotCreateDomainDataDirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String domainContentDirectoryIsNotDirectory$str() {
        return "WFLYHC0102: Domain content directory is not a directory: %s";
    }
    @Override
    public final IllegalStateException domainContentDirectoryIsNotDirectory(final File arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), domainContentDirectoryIsNotDirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateDomainContentDirectory$str() {
        return "WFLYHC0103: Could not create domain content directory: %s";
    }
    @Override
    public final IllegalStateException couldNotCreateDomainContentDirectory(final File arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotCreateDomainContentDirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String logDirectoryIsNotADirectory$str() {
        return "WFLYHC0104: Log directory is not a directory: %s";
    }
    @Override
    public final IllegalStateException logDirectoryIsNotADirectory(final File arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), logDirectoryIsNotADirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYHC0105: Could not create log directory: %s";
    }
    @Override
    public final IllegalStateException couldNotCreateLogDirectory(final File arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotCreateLogDirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serversDirectoryIsNotADirectory$str() {
        return "WFLYHC0106: Servers directory is not a directory: %s";
    }
    @Override
    public final IllegalStateException serversDirectoryIsNotADirectory(final File arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serversDirectoryIsNotADirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateServersDirectory$str() {
        return "WFLYHC0107: Could not create servers directory: %s";
    }
    @Override
    public final IllegalStateException couldNotCreateServersDirectory(final File arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotCreateServersDirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String domainTempDirectoryIsNotADirectory$str() {
        return "WFLYHC0108: Domain temp directory does not exist: %s";
    }
    @Override
    public final IllegalStateException domainTempDirectoryIsNotADirectory(final File arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), domainTempDirectoryIsNotADirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateDomainTempDirectory$str() {
        return "WFLYHC0109: Could not create domain temp directory: %s";
    }
    @Override
    public final IllegalStateException couldNotCreateDomainTempDirectory(final File arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotCreateDomainTempDirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String sslFailureUnableToConnect$str() {
        return "WFLYHC0110: Unable to connect due to SSL failure.";
    }
    @Override
    public final IllegalStateException sslFailureUnableToConnect(final Throwable arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), sslFailureUnableToConnect$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jvmOptionAlreadyExists$str() {
        return "WFLYHC0111: Option '%s' already exists";
    }
    @Override
    public final IllegalStateException jvmOptionAlreadyExists(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), jvmOptionAlreadyExists$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedManagementVersionForHost$str() {
        return "WFLYHC0113: Host controller management version %s.%s is too old, Only %s.%s or higher are supported";
    }
    @Override
    public final OperationFailedException unsupportedManagementVersionForHost(final int arg0, final int arg1, final int arg2, final int arg3) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unsupportedManagementVersionForHost$str(), arg0, arg1, arg2, arg3));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToAddExtensions$str() {
        return "WFLYHC0114: Failed to add extensions used by the domain. Failure description: %s";
    }
    @Override
    public final IllegalStateException failedToAddExtensions(final ModelNode arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failedToAddExtensions$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String argumentHasNoValue$str() {
        return "WFLYHC0115: Argument %s has no value. %s";
    }
    @Override
    public final String argumentHasNoValue(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), argumentHasNoValue$str(), arg0, arg1);
    }
    protected String usageNote$str() {
        return "Use %s --help for information on valid command line arguments and their syntax.";
    }
    @Override
    public final String usageNote(final String arg0) {
        return String.format(getLoggingLocale(), usageNote$str(), arg0);
    }
    protected String cannotAccessS3File$str() {
        return "WFLYHC0116: Cannot access S3 file: %s";
    }
    @Override
    public final IllegalStateException cannotAccessS3File(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotAccessS3File$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedMarshallingDomainControllerData$str() {
        return "WFLYHC0117: Failed to obtain domain controller data from S3 file";
    }
    @Override
    public final IllegalStateException failedMarshallingDomainControllerData() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failedMarshallingDomainControllerData$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotWriteToS3File$str() {
        return "WFLYHC0118: Cannot write domain controller data to S3 file: %s";
    }
    @Override
    public final IOException cannotWriteToS3File(final String arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), cannotWriteToS3File$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAccessS3Bucket$str() {
        return "WFLYHC0119: Cannot access S3 bucket '%s': %s";
    }
    @Override
    public final IllegalStateException cannotAccessS3Bucket(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotAccessS3Bucket$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String discoveryOptionsFailureUnableToConnect$str() {
        return "WFLYHC0120: Tried all domain controller discovery option(s) but unable to connect";
    }
    @Override
    public final IllegalStateException discoveryOptionsFailureUnableToConnect(final Throwable arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), discoveryOptionsFailureUnableToConnect$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String preSignedUrlsMustHaveSamePath$str() {
        return "WFLYHC0121: pre_signed_put_url and pre_signed_delete_url must have the same path";
    }
    @Override
    public final IllegalStateException preSignedUrlsMustHaveSamePath() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), preSignedUrlsMustHaveSamePath$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String preSignedUrlsMustBeSetOrUnset$str() {
        return "WFLYHC0122: pre_signed_put_url and pre_signed_delete_url must both be set or both unset";
    }
    @Override
    public final IllegalStateException preSignedUrlsMustBeSetOrUnset() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), preSignedUrlsMustBeSetOrUnset$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String preSignedUrlMustPointToFile$str() {
        return "WFLYHC0123: pre-signed url %s must point to a file within a bucket";
    }
    @Override
    public final IllegalStateException preSignedUrlMustPointToFile(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), preSignedUrlMustPointToFile$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidPreSignedUrl$str() {
        return "WFLYHC0124: pre-signed url %s is not a valid url";
    }
    @Override
    public final IllegalStateException invalidPreSignedUrl(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidPreSignedUrl$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidPreSignedUrlLength$str() {
        return "WFLYHC0125: pre-signed url %s may only have a subdirectory under a bucket";
    }
    @Override
    public final IllegalStateException invalidPreSignedUrlLength(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidPreSignedUrlLength$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String creatingBucketWithUnsupportedCallingFormat$str() {
        return "WFLYHC0126: Creating location-constrained bucket with unsupported calling-format";
    }
    @Override
    public final IllegalArgumentException creatingBucketWithUnsupportedCallingFormat() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), creatingBucketWithUnsupportedCallingFormat$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidS3Location$str() {
        return "WFLYHC0127: Invalid location: %s";
    }
    @Override
    public final IllegalArgumentException invalidS3Location(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidS3Location$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidS3Bucket$str() {
        return "WFLYHC0128: Invalid bucket name: %s";
    }
    @Override
    public final IllegalArgumentException invalidS3Bucket(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidS3Bucket$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String bucketAuthenticationFailure$str() {
        return "WFLYHC0129: bucket '%s' could not be accessed (rsp=%d (%s)). Maybe the bucket is owned by somebody else or the authentication failed";
    }
    @Override
    public final IOException bucketAuthenticationFailure(final String arg0, final int arg1, final String arg2) {
        final IOException result = new IOException(String.format(getLoggingLocale(), bucketAuthenticationFailure$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedResponse$str() {
        return "WFLYHC0130: Unexpected response: %s";
    }
    @Override
    public final IOException unexpectedResponse(final String arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), unexpectedResponse$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String httpRedirectSupportRequired$str() {
        return "WFLYHC0131: HTTP redirect support required";
    }
    @Override
    public final RuntimeException httpRedirectSupportRequired() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), httpRedirectSupportRequired$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorParsingBucketListings$str() {
        return "WFLYHC0132: Unexpected error parsing bucket listing(s)";
    }
    @Override
    public final RuntimeException errorParsingBucketListings(final Throwable arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorParsingBucketListings$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInitializeSaxDriver$str() {
        return "WFLYHC0133: Couldn't initialize a SAX driver for the XMLReader";
    }
    @Override
    public final RuntimeException cannotInitializeSaxDriver() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotInitializeSaxDriver$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInstantiateDiscoveryOptionClass$str() {
        return "WFLYHC0134: Cannot instantiate discovery option class '%s': %s";
    }
    @Override
    public final IllegalStateException cannotInstantiateDiscoveryOptionClass(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotInstantiateDiscoveryOptionClass$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void cannotWriteDomainControllerData(final Exception arg0) {
        super.log.logf(FQCN, ERROR, null, cannotWriteDomainControllerData$str(), arg0);
    }
    protected String cannotWriteDomainControllerData$str() {
        return "WFLYHC0137: Could not write domain controller data to S3 file. Error was: %s";
    }
    @Override
    public final void cannotRemoveS3File(final Exception arg0) {
        super.log.logf(FQCN, ERROR, null, cannotRemoveS3File$str(), arg0);
    }
    protected String cannotRemoveS3File$str() {
        return "WFLYHC0138: Could not remove S3 file. Error was: %s";
    }
    protected String cannotExecuteTransactionalOperationFromSlave$str() {
        return "WFLYHC0140: Can't execute transactional operation '%s' from the secondary Host Controller";
    }
    @Override
    public final IllegalStateException cannotExecuteTransactionalOperationFromSlave(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotExecuteTransactionalOperationFromSlave$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToApplyDomainConfig(final Exception arg0) {
        super.log.logf(FQCN, ERROR, arg0, failedToApplyDomainConfig0$str());
    }
    protected String failedToApplyDomainConfig0$str() {
        return "WFLYHC0142: Failed to apply domain-wide configuration from the domain controller";
    }
    @Override
    public final void failedToApplyDomainConfig(final String arg0, final ModelNode arg1) {
        super.log.logf(FQCN, ERROR, null, failedToApplyDomainConfig2$str(), arg0, arg1);
    }
    protected String failedToApplyDomainConfig2$str() {
        return "WFLYHC0143: Failed to apply domain-wide configuration from the Domain Controller. Operation outcome: %s. Failure description %s";
    }
    @Override
    public final void fetchConfigFromDomainMasterFailed(final RunningMode arg0, final String arg1, final AdminOnlyDomainConfigPolicy arg2, final String arg3) {
        super.log.logf(FQCN, ERROR, null, fetchConfigFromDomainMasterFailed$str(), arg0, arg1, arg2, arg3);
    }
    protected String fetchConfigFromDomainMasterFailed$str() {
        return "WFLYHC0144: The host cannot start because it was started in running mode '%s' with no access to a local copy of the domain wide configuration policy, the '%s' attribute was set to '%s' and the domain wide configuration policy could not be obtained from the Domain Controller host. Startup will be aborted. Use the '%s' command line argument to start if you need to start without connecting to a domain controller connection.";
    }
    @Override
    public final void noAccessControlConfigurationAvailable(final RunningMode arg0, final String arg1, final AdminOnlyDomainConfigPolicy arg2, final String arg3, final RunningMode arg4) {
        super.log.logf(FQCN, ERROR, null, noAccessControlConfigurationAvailable$str(), arg0, arg1, arg2, arg3, arg4);
    }
    protected String noAccessControlConfigurationAvailable$str() {
        return "WFLYHC0145: The host cannot start because it was started in running mode '%s' with no access to a local copy of the domain wide configuration policy, and the '%s' attribute was set to '%s'. Startup will be aborted. Use the '%s' command line argument to start in running mode '%s'.";
    }
    @Override
    public final void failedDiscoveringMaster(final DiscoveryOption arg0, final Exception arg1) {
        super.log.logf(FQCN, WARN, null, failedDiscoveringMaster$str(), arg0, arg1);
    }
    protected String failedDiscoveringMaster$str() {
        return "WFLYHC0146: Could not discover the domain controller using discovery option %s. Error was: %s";
    }
    @Override
    public final void noDiscoveryOptionsLeft() {
        super.log.logf(FQCN, WARN, null, noDiscoveryOptionsLeft$str());
    }
    protected String noDiscoveryOptionsLeft$str() {
        return "WFLYHC0147: No domain controller discovery options remain.";
    }
    @Override
    public final void connectedToMaster(final URI arg0) {
        super.log.logf(FQCN, INFO, null, connectedToMaster$str(), arg0);
    }
    protected String connectedToMaster$str() {
        return "WFLYHC0148: Connected to the domain controller at %s";
    }
    @Override
    public final void usingCachedDC(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, usingCachedDC$str(), arg0, arg1);
    }
    protected String usingCachedDC$str() {
        return "WFLYHC0149: Option %s was set; obtaining domain-wide configuration from %s";
    }
    @Override
    public final void reconnectingToMaster() {
        super.log.logf(FQCN, INFO, null, reconnectingToMaster$str());
    }
    protected String reconnectingToMaster$str() {
        return "WFLYHC0150: Trying to reconnect to the domain controller.";
    }
    @Override
    public final void noDomainControllerConfigurationProvidedForAdminOnly(final String arg0, final AdminOnlyDomainConfigPolicy arg1, final String arg2, final RunningMode arg3) {
        super.log.logf(FQCN, ERROR, null, noDomainControllerConfigurationProvidedForAdminOnly$str(), arg0, arg1, arg2, arg3);
    }
    protected String noDomainControllerConfigurationProvidedForAdminOnly$str() {
        return "WFLYHC0151: No domain controller discovery configuration was provided and the '%s' attribute was set to '%s'. Startup will be aborted. Use the %s command line argument to start in %s mode if you need to start without a domain controller connection and then use the management tools to configure one.";
    }
    @Override
    public final void serverLaunchCommandPrefix(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, serverLaunchCommandPrefix$str(), arg0, arg1);
    }
    protected String serverLaunchCommandPrefix$str() {
        return "WFLYHC0152: Server %s will be started with JVM launch command prefix '%s'";
    }
    protected String channelClosed$str() {
        return "WFLYHC0153: Channel closed";
    }
    @Override
    public final IOException channelClosed() {
        final IOException result = new IOException(String.format(getLoggingLocale(), channelClosed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateDomainAutoStartDirectory$str() {
        return "WFLYHC0157: Could not create domain auto-start directory: %s";
    }
    @Override
    public final IllegalStateException couldNotCreateDomainAutoStartDirectory(final Path arg0, final Throwable arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotCreateDomainAutoStartDirectory$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void couldNotPersistAutoStartServerStatus(final Throwable arg0) {
        super.log.logf(FQCN, INFO, arg0, couldNotPersistAutoStartServerStatus$str());
    }
    protected String couldNotPersistAutoStartServerStatus$str() {
        return "WFLYHC0158: Error persisting server autostart status";
    }
    protected String invalidDiscoveryType$str() {
        return "WFLYHC0159: Invalid discovery type %s";
    }
    @Override
    public final String invalidDiscoveryType(final String arg0) {
        return String.format(getLoggingLocale(), invalidDiscoveryType$str(), arg0);
    }
    protected String couldNotObtainDomainUuid$str() {
        return "WFLYHC0160: Could not read or create the domain UUID in file: %s";
    }
    @Override
    public final IllegalStateException couldNotObtainDomainUuid(final Throwable arg0, final Path arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotObtainDomainUuid$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String bindingNameNotUnique$str() {
        return "WFLYHC0162: The binding name '%s' in socket binding group '%s' is not unique. Names must be unique across socket-binding, local-destination-outbound-socket-binding and remote-destination-outbound-socket-binding";
    }
    @Override
    public final OperationFailedException bindingNameNotUnique(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), bindingNameNotUnique$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String profileInvolvedInACycle$str() {
        return "WFLYHC0163: Profile '%s' is involved in a cycle";
    }
    @Override
    public final OperationFailedException profileInvolvedInACycle(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), profileInvolvedInACycle$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String profileAttemptingToOverrideSubsystem$str() {
        return "WFLYHC0164: Profile '%s' defines subsystem '%s' which is also defined in its ancestor profile '%s'. Overriding subsystems is not supported";
    }
    @Override
    public final OperationFailedException profileAttemptingToOverrideSubsystem(final String arg0, final String arg1, final String arg2) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), profileAttemptingToOverrideSubsystem$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String socketBindingGroupInvolvedInACycle$str() {
        return "WFLYHC0165: Socket binding group '%s' is involved in a cycle";
    }
    @Override
    public final OperationFailedException socketBindingGroupInvolvedInACycle(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), socketBindingGroupInvolvedInACycle$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String socketBindingGroupAttemptingToOverrideSocketBinding$str() {
        return "WFLYHC0166: Socket binding group '%s' defines socket binding '%s' which is also defined in its ancestor socket binding group '%s'. Overriding socket bindings is not supported";
    }
    @Override
    public final OperationFailedException socketBindingGroupAttemptingToOverrideSocketBinding(final String arg0, final String arg1, final String arg2) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), socketBindingGroupAttemptingToOverrideSocketBinding$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String profileIncludesSameSubsystem$str() {
        return "WFLYHC0167: Profile '%s' includes profile '%s' and profile '%s'. Both these profiles define subsystem '%s', which is not supported";
    }
    @Override
    public final OperationFailedException profileIncludesSameSubsystem(final String arg0, final String arg1, final String arg2, final String arg3) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), profileIncludesSameSubsystem$str(), arg0, arg1, arg2, arg3));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String socketBindingGroupIncludesSameSocketBinding$str() {
        return "WFLYHC0168: Socket binding group '%s' includes socket binding group '%s' and socket binding group '%s'. Both these socket binding groups define socket binding '%s', which is not supported";
    }
    @Override
    public final OperationFailedException socketBindingGroupIncludesSameSocketBinding(final String arg0, final String arg1, final String arg2, final String arg3) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), socketBindingGroupIncludesSameSocketBinding$str(), arg0, arg1, arg2, arg3));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String embeddedHostControllerRestartMustProvideAdminOnlyTrue$str() {
        return "WFLYHC0169: Reload into running mode is not supported with embedded host controller, admin-only=true must be specified.";
    }
    @Override
    public final OperationFailedException embeddedHostControllerRestartMustProvideAdminOnlyTrue() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), embeddedHostControllerRestartMustProvideAdminOnlyTrue$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String hostRegistrationCannotReleaseSharedLock$str() {
        return "WFLYHC0170: Error releasing shared lock after host registration for operationID: %s";
    }
    @Override
    public final String hostRegistrationCannotReleaseSharedLock(final int arg0) {
        return String.format(getLoggingLocale(), hostRegistrationCannotReleaseSharedLock$str(), arg0);
    }
    @Override
    public final void suspendListenerFailed(final ExecutionException arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, suspendListenerFailed$str(), arg1);
    }
    protected String suspendListenerFailed$str() {
        return "WFLYHC0171: Failed getting the response from the suspend listener for server: %s";
    }
    @Override
    public final void suspendExecutionFailed(final IOException arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, suspendExecutionFailed$str(), arg1);
    }
    protected String suspendExecutionFailed$str() {
        return "WFLYHC0172: Failed executing the suspend operation for server: %s";
    }
    protected String cannotBothHaveFalseUseCurrentHostConfigAndHostConfig$str() {
        return "WFLYHC0173: It is not possible to use use-current-host-config=false while specifying a host-config";
    }
    @Override
    public final OperationFailedException cannotBothHaveFalseUseCurrentHostConfigAndHostConfig() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotBothHaveFalseUseCurrentHostConfigAndHostConfig$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotBothHaveFalseUseCurrentDomainConfigAndDomainConfig$str() {
        return "WFLYHC0174: It is not possible to use use-current-domain-config=false while specifying a domain-config";
    }
    @Override
    public final OperationFailedException cannotBothHaveFalseUseCurrentDomainConfigAndDomainConfig() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotBothHaveFalseUseCurrentDomainConfigAndDomainConfig$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String domainConfigForReloadNotFound$str() {
        return "WFLYHC0175: domain-config '%s' specified for reload could not be found";
    }
    @Override
    public final OperationFailedException domainConfigForReloadNotFound(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), domainConfigForReloadNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void nativeManagementInterfaceIsUnsecured() {
        super.log.logf(FQCN, WARN, null, nativeManagementInterfaceIsUnsecured$str());
    }
    protected String nativeManagementInterfaceIsUnsecured$str() {
        return "WFLYHC0177: No security realm defined for native management service; all access will be unrestricted.";
    }
    @Override
    public final void aborting(final int arg0) {
        super.log.logf(FQCN, FATAL, null, aborting$str(), arg0);
    }
    protected String aborting$str() {
        return "WFLYHC0178: Aborting with exit code %d";
    }
    @Override
    public final void shuttingDownInResponseToProcessControllerSignal() {
        super.log.logf(FQCN, INFO, null, shuttingDownInResponseToProcessControllerSignal$str());
    }
    protected String shuttingDownInResponseToProcessControllerSignal$str() {
        return "WFLYHC0179: ProcessController has signalled to shut down; shutting down";
    }
    @Override
    public final void shuttingDownInResponseToManagementRequest(final String arg0) {
        super.log.logf(FQCN, INFO, null, shuttingDownInResponseToManagementRequest$str(), arg0);
    }
    protected String shuttingDownInResponseToManagementRequest$str() {
        return "WFLYHC0180: Shutting down in response to management operation '%s'";
    }
    @Override
    public final void shutdownHookInvoked() {
        super.log.logf(FQCN, INFO, null, shutdownHookInvoked$str());
    }
    protected String shutdownHookInvoked$str() {
        return "WFLYHC0181: Host Controller shutdown has been requested via an OS signal";
    }
    @Override
    public final void timedOutAwaitingSuspendResponse(final int arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, timedOutAwaitingSuspendResponse$str(), arg0, arg1);
    }
    protected String timedOutAwaitingSuspendResponse$str() {
        return "WFLYHC0182: Timed out after %d ms awaiting server suspend response(s) for server: %s";
    }
    protected String timedOutAwaitingSuspendResponseMsg$str() {
        return "WFLYHC0183: Timed out after %d ms awaiting server suspend response(s) for server: %s";
    }
    @Override
    public final String timedOutAwaitingSuspendResponseMsg(final int arg0, final String arg1) {
        return String.format(getLoggingLocale(), timedOutAwaitingSuspendResponseMsg$str(), arg0, arg1);
    }
    @Override
    public final void interruptedAwaitingSuspendResponse(final InterruptedException arg0, final String arg1) {
        super.log.logf(FQCN, INFO, arg0, interruptedAwaitingSuspendResponse$str(), arg1);
    }
    protected String interruptedAwaitingSuspendResponse$str() {
        return "WFLYHC0184: %s interrupted awaiting server suspend response(s)";
    }
    protected String interruptedAwaitingSuspendResponseMsg$str() {
        return "WFLYHC0185: %s interrupted awaiting server suspend response(s)";
    }
    @Override
    public final String interruptedAwaitingSuspendResponseMsg(final String arg0) {
        return String.format(getLoggingLocale(), interruptedAwaitingSuspendResponseMsg$str(), arg0);
    }
    protected String suspendExecutionFailedMsg$str() {
        return "WFLYHC0186: Failed executing the suspend operation for server: %s";
    }
    @Override
    public final String suspendExecutionFailedMsg(final String arg0) {
        return String.format(getLoggingLocale(), suspendExecutionFailedMsg$str(), arg0);
    }
    protected String suspendListenerFailedMsg$str() {
        return "WFLYHC0187: Failed getting the response from the suspend listener for server: %s";
    }
    @Override
    public final String suspendListenerFailedMsg(final String arg0) {
        return String.format(getLoggingLocale(), suspendListenerFailedMsg$str(), arg0);
    }
    @Override
    public final void timedOutAwaitingResumeResponse(final int arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, timedOutAwaitingResumeResponse$str(), arg0, arg1);
    }
    protected String timedOutAwaitingResumeResponse$str() {
        return "WFLYHC0188: Timed out after %d ms awaiting server resume response(s) for server: %s";
    }
    protected String timedOutAwaitingResumeResponseMsg$str() {
        return "WFLYHC0189: Timed out after %d ms awaiting server resume response(s) for server: %s";
    }
    @Override
    public final String timedOutAwaitingResumeResponseMsg(final int arg0, final String arg1) {
        return String.format(getLoggingLocale(), timedOutAwaitingResumeResponseMsg$str(), arg0, arg1);
    }
    @Override
    public final void interruptedAwaitingResumeResponse(final InterruptedException arg0, final String arg1) {
        super.log.logf(FQCN, INFO, arg0, interruptedAwaitingResumeResponse$str(), arg1);
    }
    protected String interruptedAwaitingResumeResponse$str() {
        return "WFLYHC0190: %s interrupted awaiting server resume response(s)";
    }
    protected String interruptedAwaitingResumeResponseMsg$str() {
        return "WFLYHC0191: %s interrupted awaiting server resume response(s)";
    }
    @Override
    public final String interruptedAwaitingResumeResponseMsg(final String arg0) {
        return String.format(getLoggingLocale(), interruptedAwaitingResumeResponseMsg$str(), arg0);
    }
    protected String resumeExecutionFailedMsg$str() {
        return "WFLYHC0192: Failed executing the resume operation for server: %s";
    }
    @Override
    public final String resumeExecutionFailedMsg(final String arg0) {
        return String.format(getLoggingLocale(), resumeExecutionFailedMsg$str(), arg0);
    }
    protected String resumeListenerFailedMsg$str() {
        return "WFLYHC0193: Failed getting the response from the resume listener for server: %s";
    }
    @Override
    public final String resumeListenerFailedMsg(final String arg0) {
        return String.format(getLoggingLocale(), resumeListenerFailedMsg$str(), arg0);
    }
    @Override
    public final void resumeExecutionFailed(final IOException arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, resumeExecutionFailed$str(), arg1);
    }
    protected String resumeExecutionFailed$str() {
        return "WFLYHC0194: Failed executing the resume operation for server: %s";
    }
    @Override
    public final void resumeListenerFailed(final ExecutionException arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, resumeListenerFailed$str(), arg1);
    }
    protected String resumeListenerFailed$str() {
        return "WFLYHC0195: Failed getting the response from the resume listener for server: %s";
    }
    @Override
    public final void cannotRenameCachedDomainXmlOnBoot(final String arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, ERROR, null, cannotRenameCachedDomainXmlOnBoot$str(), arg0, arg1, arg2);
    }
    protected String cannotRenameCachedDomainXmlOnBoot$str() {
        return "WFLYHC0196: Cannot move the file %s to %s, unable to persist domain configuration changes: %s ";
    }
    protected String attributeRequiresSSLContext$str() {
        return "WFLYHC0197: If attribute %s is defined an ssl-context must also be defined";
    }
    @Override
    public final OperationFailedException attributeRequiresSSLContext(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), attributeRequiresSSLContext$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void managedServerUnstable(final String arg0) {
        super.log.logf(FQCN, WARN, null, managedServerUnstable1$str(), arg0);
    }
    protected String managedServerUnstable1$str() {
        return "WFLYHC0198: Server '%s' is unstable and should be stopped or restarted. An unstable server may not stop normally, so the 'kill' operation may be required to terminate the server process.";
    }
    @Override
    public final void managedServerUnstable(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, managedServerUnstable2$str(), arg0, arg1);
    }
    protected String managedServerUnstable2$str() {
        return "WFLYHC0198: Server '%s' (managed by host '%s') is unstable and should be stopped or restarted. An unstable server may not stop normally, so the 'kill' operation may be required to terminate the server process.";
    }
    @Override
    public final void serverSuspected(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, serverSuspected$str(), arg0, arg1);
    }
    protected String serverSuspected$str() {
        return "WFLYHC0199: Server '%s' (managed by host '%s') has not responded to an operation request within the configured timeout. This may mean the server has become unstable.";
    }
    @Override
    public final void failedReportingServerInstabilityToMaster(final Exception arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, failedReportingServerInstabilityToMaster$str(), arg1);
    }
    protected String failedReportingServerInstabilityToMaster$str() {
        return "WFLYHC0200: Reporting instability of server '%s' to Domain Controller failed.";
    }
    protected String hostDomainSynchronizationError$str() {
        return "WFLYHC0201: Error synchronizing the host model with the domain controller model with failure : %s.";
    }
    @Override
    public final String hostDomainSynchronizationError(final String arg0) {
        return String.format(getLoggingLocale(), hostDomainSynchronizationError$str(), arg0);
    }
    @Override
    public final void domainModelAppliedButReloadIsRequired() {
        super.log.logf(FQCN, WARN, null, domainModelAppliedButReloadIsRequired$str());
    }
    protected String domainModelAppliedButReloadIsRequired$str() {
        return "WFLYHC0202: The domain configuration was successfully applied, but reload is required before changes become active.";
    }
    @Override
    public final void domainModelAppliedButRestartIsRequired() {
        super.log.logf(FQCN, WARN, null, domainModelAppliedButRestartIsRequired$str());
    }
    protected String domainModelAppliedButRestartIsRequired$str() {
        return "WFLYHC0203: The domain configuration was successfully applied, but restart is required before changes become active.";
    }
    @Override
    public final void serverLoggingConfigurationFileNotFound(final String arg0) {
        super.log.logf(FQCN, WARN, null, serverLoggingConfigurationFileNotFound$str(), arg0);
    }
    protected String serverLoggingConfigurationFileNotFound$str() {
        return "WFLYHC0204: No logging configuration file could be found for the servers initial boot. Logging will not be configured until the logging subsystem is activated for the server %s";
    }
    @Override
    public final void failedToSetLoggingConfiguration(final Throwable arg0, final String arg1, final File arg2) {
        super.log.logf(FQCN, ERROR, arg0, failedToSetLoggingConfiguration$str(), arg1, arg2);
    }
    protected String failedToSetLoggingConfiguration$str() {
        return "WFLYHC0205: An error occurred setting the -Dlogging.configuration property for server %s. Configuration path %s";
    }
    protected String cannotOverwriteDomainXmlWithEmpty$str() {
        return "WFLYHC0206: File %s already exists, you must use --remove-existing-domain-config to overwrite existing files.";
    }
    @Override
    public final IllegalStateException cannotOverwriteDomainXmlWithEmpty(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotOverwriteDomainXmlWithEmpty$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotOverwriteHostXmlWithEmpty$str() {
        return "WFLYHC0207: File %s already exists, you must use --remove-existing-host-config to overwrite existing files.";
    }
    @Override
    public final IllegalStateException cannotOverwriteHostXmlWithEmpty(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotOverwriteHostXmlWithEmpty$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAddHostAlreadyRegistered$str() {
        return "WFLYHC0208: A host (%s) has already been registered. You must shutdown this host before adding a new one.";
    }
    @Override
    public final OperationFailedException cannotAddHostAlreadyRegistered(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotAddHostAlreadyRegistered$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullHostName$str() {
        return "WFLYHC0209: Host name may not be null.";
    }
    @Override
    public final OperationFailedException nullHostName() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), nullHostName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAddSlaveHostAfterBoot$str() {
        return "WFLYHC0210: A secondary Host Controller may not be added using add(). Please add a host, omitting this parameter, and configure the remote domain controller using write-attribute.";
    }
    @Override
    public final OperationFailedException cannotAddSlaveHostAfterBoot() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotAddSlaveHostAfterBoot$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String bootConfigValidationFailed$str() {
        return "WFLYHC0211: Boot configuration validation failed";
    }
    @Override
    public final OperationFailedException bootConfigValidationFailed(final ModelNode arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), bootConfigValidationFailed$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String fetchOfMissingConfigurationFailed$str() {
        return "WFLYHC0212: Fetch of missing configuration from the Domain Controller failed without explanation. Fetch operation outcome was %s";
    }
    @Override
    public final OperationFailedException fetchOfMissingConfigurationFailed(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), fetchOfMissingConfigurationFailed$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidJavaHome$str() {
        return "WFLYHC0213: Java home '%s' does not exist.";
    }
    @Override
    public final IllegalStateException invalidJavaHome(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidJavaHome$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidJavaHomeBin$str() {
        return "WFLYHC0214: Java home's bin '%s' does not exist. The home directory was determined to be %s.";
    }
    @Override
    public final IllegalStateException invalidJavaHomeBin(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidJavaHomeBin$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotFindJavaExe$str() {
        return "WFLYHC0215: Could not find java executable under %s.";
    }
    @Override
    public final IllegalStateException cannotFindJavaExe(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotFindJavaExe$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String moduleOptionNotAllowed$str() {
        return "WFLYHC0216: The module option %s is not allowed.";
    }
    @Override
    public final OperationFailedException moduleOptionNotAllowed(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), moduleOptionNotAllowed$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String securityRealmReferencesUnsupported$str() {
        return "WFLYHC0217: Security realms are no longer supported, please migrate references to them from the configuration.";
    }
    @Override
    public final XMLStreamException securityRealmReferencesUnsupported() {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), securityRealmReferencesUnsupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noServerInstallationPrepared$str() {
        return "WFLYHC0218: No %s installation has been prepared.";
    }
    @Override
    public final OperationFailedException noServerInstallationPrepared(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noServerInstallationPrepared$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String identityNotAuthorizedAsServer$str() {
        return "WFLYHC0219: Authorization failed for '%s' attempting to connect as a domain server.";
    }
    @Override
    public final GeneralSecurityException identityNotAuthorizedAsServer(final String arg0) {
        final GeneralSecurityException result = new GeneralSecurityException(String.format(getLoggingLocale(), identityNotAuthorizedAsServer$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToSyncServerStatus$str() {
        return "WFLYHC0220: Failed to synchronize server status upon a Host Controller registration. There is no handler registered to manage the operation %s for the server %s.";
    }
    @Override
    public final IllegalStateException failedToSyncServerStatus(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failedToSyncServerStatus$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String incompatibleStability$str() {
        return "WFLYHC0221: %s stability level of domain controller does not match %s stability level of connecting host";
    }
    @Override
    public final OperationFailedException incompatibleStability(final Stability arg0, final Stability arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), incompatibleStability$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedStability$str() {
        return "WFLYHC0222: %s stability level is not supported in %s";
    }
    @Override
    public final IllegalArgumentException unsupportedStability(final Stability arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unsupportedStability$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mixedDomainUnsupportedStability$str() {
        return "WFLYHC0223: %s stability level is only supported on Host Controllers with the same management major and minor version than the Domain Controller. Domain Controller version is %d.%d. Remote Host Controller version is %d.%d";
    }
    @Override
    public final OperationFailedException mixedDomainUnsupportedStability(final Stability arg0, final int arg1, final int arg2, final int arg3, final int arg4) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), mixedDomainUnsupportedStability$str(), arg0, arg1, arg2, arg3, arg4));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCreateHostControllerEnvironment$str() {
        return "WFLYHC0224: Cannot create a HostControllerEnvironment for an embedded host controller";
    }
    @Override
    public final IllegalStateException cannotCreateHostControllerEnvironment() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotCreateHostControllerEnvironment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String configFilesInUse$str() {
        return "- Host Controller configuration files in use: %s, %s";
    }
    @Override
    public final String configFilesInUse(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), configFilesInUse$str(), arg0, arg1);
    }
    protected String configFileInUse$str() {
        return "- Host Controller configuration file in use: %s";
    }
    @Override
    public final String configFileInUse(final String arg0) {
        return String.format(getLoggingLocale(), configFileInUse$str(), arg0);
    }
    protected String stabilityInUse$str() {
        return "- Minimum feature stability level: %s";
    }
    @Override
    public final String stabilityInUse(final Stability arg0) {
        return String.format(getLoggingLocale(), stabilityInUse$str(), arg0);
    }
}
