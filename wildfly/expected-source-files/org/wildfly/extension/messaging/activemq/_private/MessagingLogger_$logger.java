package org.wildfly.extension.messaging.activemq._private;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import org.jboss.modules.ModuleLoadException;
import java.lang.IllegalStateException;
import java.io.Serializable;
import java.util.Set;
import org.jboss.as.cli.operation.OperationFormatException;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import org.jboss.as.controller.RunningMode;
import java.lang.RuntimeException;
import org.jboss.as.controller.PathElement;
import org.jboss.logging.BasicLogger;
import org.jboss.msc.service.StartException;
import java.util.List;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;
import org.jboss.modules.ModuleNotFoundException;
import javax.annotation.processing.Generated;
import org.jboss.as.controller.OperationFailedException;
import java.io.IOException;
import org.jboss.msc.service.ServiceName;
import org.jboss.msc.service.ServiceController.State;
import org.jboss.as.controller.PathAddress;
import java.lang.Throwable;
import org.jboss.dmr.ModelType;
import java.util.Collection;
import java.lang.Object;
import java.util.Arrays;
import org.jboss.dmr.ModelNode;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:57:58+0200")
public class MessagingLogger_$logger extends DelegatingBasicLogger implements MessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MessagingLogger_$logger.class.getName();
    public MessagingLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void aioInfo() {
        super.log.logf(FQCN, INFO, null, aioInfo$str());
    }
    protected String aioInfo$str() {
        return "WFLYMSGAMQ0001: AIO wasn't located on this platform, it will fall back to using pure Java NIO.";
    }
    @Override
    public final void boundJndiName(final String jndiName) {
        super.log.logf(FQCN, INFO, null, boundJndiName$str(), jndiName);
    }
    protected String boundJndiName$str() {
        return "WFLYMSGAMQ0002: Bound messaging object to jndi name %s";
    }
    @Override
    public final void errorStoppingJmsServer(final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, errorStoppingJmsServer$str());
    }
    protected String errorStoppingJmsServer$str() {
        return "WFLYMSGAMQ0003: Exception while stopping Jakarta Messaging server";
    }
    @Override
    public final void failedToDestroy(final Throwable cause, final String description, final String name) {
        super.log.logf(FQCN, WARN, cause, failedToDestroy$str(), description, name);
    }
    protected String failedToDestroy$str() {
        return "WFLYMSGAMQ0004: Failed to destroy %s: %s";
    }
    @Override
    public final void failedToDestroy(final String description, final String name) {
        super.log.logf(FQCN, WARN, null, failedToDestroy$str(), description, name);
    }
    @Override
    public final void revertOperationFailed(final Throwable cause, final String className, final String operation, final PathAddress address) {
        super.log.logf(FQCN, ERROR, cause, revertOperationFailed$str(), className, operation, address);
    }
    protected String revertOperationFailed$str() {
        return "WFLYMSGAMQ0005: %s caught exception attempting to revert operation %s at address %s";
    }
    @Override
    public final void unboundJndiName(final String jndiName) {
        super.log.logf(FQCN, INFO, null, unboundJndiName$str(), jndiName);
    }
    protected String unboundJndiName$str() {
        return "WFLYMSGAMQ0006: Unbound messaging object to jndi name %s";
    }
    @Override
    public final void couldNotCloseFile(final String file, final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, couldNotCloseFile$str(), file);
    }
    protected String couldNotCloseFile$str() {
        return "WFLYMSGAMQ0007: Could not close file %s";
    }
    @Override
    public final void failedToUnbindJndiName(final String jndiName, final long timeout, final String timeUnit) {
        super.log.logf(FQCN, WARN, null, failedToUnbindJndiName$str(), jndiName, timeout, timeUnit);
    }
    protected String failedToUnbindJndiName$str() {
        return "WFLYMSGAMQ0008: Failed to unbind messaging object bound to jndi name %s in %d %s";
    }
    @Override
    public final void startedService(final String type, final String name) {
        super.log.logf(FQCN, INFO, null, startedService$str(), type, name);
    }
    protected String startedService$str() {
        return "WFLYMSGAMQ0011: Started %s %s";
    }
    @Override
    public final void stoppedService(final String type, final String name) {
        super.log.logf(FQCN, INFO, null, stoppedService$str(), type, name);
    }
    protected String stoppedService$str() {
        return "WFLYMSGAMQ0012: Stopped %s %s";
    }
    @Override
    public final void unknownPooledConnectionFactoryAttribute(final String name) {
        super.log.logf(FQCN, WARN, null, unknownPooledConnectionFactoryAttribute$str(), name);
    }
    protected String unknownPooledConnectionFactoryAttribute$str() {
        return "WFLYMSGAMQ0015: Ignoring %s property that is not a known property for pooled connection factory.";
    }
    @Override
    public final void registeredHTTPUpgradeHandler(final String name, final String acceptor) {
        super.log.logf(FQCN, INFO, null, registeredHTTPUpgradeHandler$str(), name, acceptor);
    }
    protected String registeredHTTPUpgradeHandler$str() {
        return "WFLYMSGAMQ0016: Registered HTTP upgrade for %s protocol handled by %s acceptor";
    }
    @Override
    public final void connectorForPooledConnectionFactory(final String name, final String connectorName) {
        super.log.logf(FQCN, WARN, null, connectorForPooledConnectionFactory$str(), name, connectorName);
    }
    protected String connectorForPooledConnectionFactory$str() {
        return "WFLYMSGAMQ0018: No connectors were explicitly defined for the pooled connection factory %s. Using %s as the connector.";
    }
    protected String cannotBindJndiName$str() {
        return "WFLYMSGAMQ0022: Cannot bind a null or empty string as jndi name";
    }
    @Override
    public final IllegalArgumentException cannotBindJndiName() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotBindJndiName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String cannotUnbindJndiName$str() {
        return "WFLYMSGAMQ0025: Cannot unbind a null or empty string as jndi name";
    }
    @Override
    public final IllegalArgumentException cannotUnbindJndiName() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotUnbindJndiName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String childResourceAlreadyExists$str() {
        return "WFLYMSGAMQ0026: A child resource of type %1$s already exists; the messaging subsystem only allows a single resource of type %1$s";
    }
    @Override
    public final String childResourceAlreadyExists(final String type) {
        return String.format(getLoggingLocale(), childResourceAlreadyExists$str(), type);
    }
    protected String connectorNotDefined$str() {
        return "WFLYMSGAMQ0027: Connector %s not defined";
    }
    @Override
    public final IllegalStateException connectorNotDefined(final String connectorName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), connectorNotDefined$str(), connectorName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToCreate$str() {
        return "WFLYMSGAMQ0028: Failed to create %s";
    }
    @Override
    public final StartException failedToCreate(final Throwable cause, final String name) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToCreate$str(), name), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToFindBroadcastSocketBinding$str() {
        return "WFLYMSGAMQ0029: Failed to find SocketBinding for broadcast binding: %s";
    }
    @Override
    public final StartException failedToFindBroadcastSocketBinding(final String name) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToFindBroadcastSocketBinding$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToFindConnectorSocketBinding$str() {
        return "WFLYMSGAMQ0030: Failed to find SocketBinding for connector: %s";
    }
    @Override
    public final StartException failedToFindConnectorSocketBinding(final String name) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToFindConnectorSocketBinding$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToFindDiscoverySocketBinding$str() {
        return "WFLYMSGAMQ0031: Failed to find SocketBinding for discovery binding: %s";
    }
    @Override
    public final StartException failedToFindDiscoverySocketBinding(final String name) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToFindDiscoverySocketBinding$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToShutdownServer$str() {
        return "WFLYMSGAMQ0032: Failed to shutdown %s server";
    }
    @Override
    public final RuntimeException failedToShutdownServer(final Throwable cause, final String server) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToShutdownServer$str(), server), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToStartService$str() {
        return "WFLYMSGAMQ0033: Failed to start service";
    }
    @Override
    public final StartException failedToStartService(final Throwable cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToStartService$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalValue$str() {
        return "WFLYMSGAMQ0036: Illegal value %s for element %s";
    }
    @Override
    public final String illegalValue(final Object value, final String element) {
        return String.format(getLoggingLocale(), illegalValue$str(), value, element);
    }
    protected String immutableResource$str() {
        return "WFLYMSGAMQ0037: Resource is immutable";
    }
    @Override
    public final UnsupportedOperationException immutableResource() {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), immutableResource$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalid$str() {
        return "WFLYMSGAMQ0038: %s is invalid";
    }
    @Override
    public final String invalid(final Object obj) {
        return String.format(getLoggingLocale(), invalid$str(), obj);
    }
    protected String invalidAttributeType$str() {
        return "WFLYMSGAMQ0039: Attribute %s has unexpected type %s";
    }
    @Override
    public final IllegalStateException invalidAttributeType(final String name, final ModelType type) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidAttributeType$str(), name, type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidServiceState$str() {
        return "WFLYMSGAMQ0042: Service %s is not in state %s, it is in state %s";
    }
    @Override
    public final IllegalStateException invalidServiceState(final ServiceName service, final State validState, final State currentState) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidServiceState$str(), service, validState, currentState));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jndiNameAlreadyRegistered$str() {
        return "WFLYMSGAMQ0043: JNDI name %s is already registered";
    }
    @Override
    public final String jndiNameAlreadyRegistered(final String jndiName) {
        return String.format(getLoggingLocale(), jndiNameAlreadyRegistered$str(), jndiName);
    }
    protected String required1$str() {
        return "WFLYMSGAMQ0045: %s is required";
    }
    @Override
    public final String required(final Object obj) {
        return String.format(getLoggingLocale(), required1$str(), obj);
    }
    protected String required2$str() {
        return "WFLYMSGAMQ0046: Either %s or %s is required";
    }
    @Override
    public final String required(final Object obj1, final Object obj2) {
        return String.format(getLoggingLocale(), required2$str(), obj1, obj2);
    }
    protected String nullVar$str() {
        return "WFLYMSGAMQ0047: %s is null";
    }
    @Override
    public final IllegalArgumentException nullVar(final String varName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullVar$str(), varName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedAttribute$str() {
        return "WFLYMSGAMQ0050: Read support for attribute %s was not properly implemented";
    }
    @Override
    public final IllegalStateException unsupportedAttribute(final String name) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedAttribute$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedOperation$str() {
        return "WFLYMSGAMQ0052: Support for operation %s was not properly implemented";
    }
    @Override
    public final IllegalStateException unsupportedOperation(final String name) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unsupportedOperation$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedRuntimeAttribute$str() {
        return "WFLYMSGAMQ0053: Runtime handling for %s is not implemented";
    }
    @Override
    public final UnsupportedOperationException unsupportedRuntimeAttribute(final String name) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), unsupportedRuntimeAttribute$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String activeMQServerNotInstalled$str() {
        return "WFLYMSGAMQ0054: No ActiveMQ Server is available under name %s";
    }
    @Override
    public final OperationFailedException activeMQServerNotInstalled(final String name) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), activeMQServerNotInstalled$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotParseDeployment$str() {
        return "WFLYMSGAMQ0055: Could not parse file %s";
    }
    @Override
    public final DeploymentUnitProcessingException couldNotParseDeployment(final String file, final Throwable cause) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), couldNotParseDeployment$str(), file), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String operationNotValid$str() {
        return "WFLYMSGAMQ0056: Handler cannot handle operation %s";
    }
    @Override
    public final IllegalStateException operationNotValid(final String operation) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), operationNotValid$str(), operation));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noDestinationRegisteredForAddress$str() {
        return "WFLYMSGAMQ0057: No message destination registered at address %s";
    }
    @Override
    public final String noDestinationRegisteredForAddress(final PathAddress address) {
        return String.format(getLoggingLocale(), noDestinationRegisteredForAddress$str(), address);
    }
    protected String securityDomainContextNotSet$str() {
        return "WFLYMSGAMQ0058: SecurityDomainContext has not been set";
    }
    @Override
    public final IllegalStateException securityDomainContextNotSet() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), securityDomainContextNotSet$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToRecover$str() {
        return "WFLYMSGAMQ0060: Failed to recover %s";
    }
    @Override
    public final OperationFailedException failedToRecover(final Throwable cause, final String name) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), failedToRecover$str(), name), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String canNotRegisterResourceOfType$str() {
        return "WFLYMSGAMQ0063: Resources of type %s cannot be registered";
    }
    @Override
    public final UnsupportedOperationException canNotRegisterResourceOfType(final String childType) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), canNotRegisterResourceOfType$str(), childType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String canNotRemoveResourceOfType$str() {
        return "WFLYMSGAMQ0064: Resources of type %s cannot be removed";
    }
    @Override
    public final UnsupportedOperationException canNotRemoveResourceOfType(final String childType) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), canNotRemoveResourceOfType$str(), childType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverInBackupMode$str() {
        return "WFLYMSGAMQ0066: Resource at the address %s can not be managed, the server is in backup mode";
    }
    @Override
    public final String serverInBackupMode(final PathAddress address) {
        return String.format(getLoggingLocale(), serverInBackupMode$str(), address);
    }
    protected String wrongConnectorRefInBroadCastGroup$str() {
        return "WFLYMSGAMQ0067: The broadcast group '%s' defines reference to nonexistent connector '%s'. Available connectors '%s'.";
    }
    @Override
    public final OperationFailedException wrongConnectorRefInBroadCastGroup(final String bgName, final String connectorRef, final Collection<String> presentConnectors) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), wrongConnectorRefInBroadCastGroup$str(), bgName, connectorRef, presentConnectors));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void noMatchingExpiryAddress(final String address, final String addressSettings) {
        super.log.logf(FQCN, WARN, null, noMatchingExpiryAddress$str(), address, addressSettings);
    }
    protected String noMatchingExpiryAddress$str() {
        return "WFLYMSGAMQ0071: There is no resource matching the expiry-address %s for the address-settings %s, expired messages from destinations matching this address-setting will be lost!";
    }
    @Override
    public final void noMatchingDeadLetterAddress(final String address, final String addressSettings) {
        super.log.logf(FQCN, WARN, null, noMatchingDeadLetterAddress$str(), address, addressSettings);
    }
    protected String noMatchingDeadLetterAddress$str() {
        return "WFLYMSGAMQ0072: There is no resource matching the dead-letter-address %s for the address-settings %s, undelivered messages from destinations matching this address-setting will be lost!";
    }
    protected String canNotRemoveLastJNDIName$str() {
        return "WFLYMSGAMQ0073: Can not remove JNDI name %s. The resource must have at least one JNDI name";
    }
    @Override
    public final String canNotRemoveLastJNDIName(final String jndiName) {
        return String.format(getLoggingLocale(), canNotRemoveLastJNDIName$str(), jndiName);
    }
    @Override
    public final void aioInfoLinux() {
        super.log.logf(FQCN, INFO, null, aioInfoLinux$str());
    }
    protected String aioInfoLinux$str() {
        return "WFLYMSGAMQ0075: AIO wasn't located on this platform, it will fall back to using pure Java NIO. Your platform is Linux, install LibAIO to enable the AIO journal and achieve optimal performance.";
    }
    protected String duplicateElements$str() {
        return "WFLYMSGAMQ0076: Parameter %s contains duplicate elements [%s]";
    }
    @Override
    public final OperationFailedException duplicateElements(final String parameterName, final ModelNode elements) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), duplicateElements$str(), parameterName, elements));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String canNotRemoveUnknownEntry$str() {
        return "WFLYMSGAMQ0077: Can not remove unknown entry %s";
    }
    @Override
    public final OperationFailedException canNotRemoveUnknownEntry(final String entry) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), canNotRemoveUnknownEntry$str(), entry));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String onlyOneChildIsAllowed$str() {
        return "WFLYMSGAMQ0078: Only one %s child resource is allowed, found children: %s";
    }
    @Override
    public final OperationFailedException onlyOneChildIsAllowed(final String childType, final Set<String> childrenNames) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), onlyOneChildIsAllowed$str(), childType, childrenNames));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYMSGAMQ0079: Indexed child resources can only be registered if the parent resource supports ordered children. The parent of '%s' is not indexed";
    }
    @Override
    public final IllegalStateException indexedChildResourceRegistrationNotAvailable(final PathElement address) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), indexedChildResourceRegistrationNotAvailable$str(), address));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String discoveryGroupIsNotDefined$str() {
        return "WFLYMSGAMQ0080: Discovery group %s is not defined";
    }
    @Override
    public final StartException discoveryGroupIsNotDefined(final String discoveryGroupName) {
        final StartException result = new StartException(String.format(getLoggingLocale(), discoveryGroupIsNotDefined$str(), discoveryGroupName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedBroadcastGroupConfigurationForLegacy$str() {
        return "WFLYMSGAMQ0081: Unsupported type of broadcast group configuration for legacy resource: %s";
    }
    @Override
    public final StartException unsupportedBroadcastGroupConfigurationForLegacy(final String broadcastGroupConfigurationClassName) {
        final StartException result = new StartException(String.format(getLoggingLocale(), unsupportedBroadcastGroupConfigurationForLegacy$str(), broadcastGroupConfigurationClassName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedConnectorFactoryForLegacy$str() {
        return "WFLYMSGAMQ0082: Unsupported type of connector factory for legacy resource: %s";
    }
    @Override
    public final StartException unsupportedConnectorFactoryForLegacy(final String connectorFactoryClassName) {
        final StartException result = new StartException(String.format(getLoggingLocale(), unsupportedConnectorFactoryForLegacy$str(), connectorFactoryClassName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String managementOperationAllowedOnlyInRunningMode$str() {
        return "WFLYMSGAMQ0083: The %s operation can not be performed: the server must be in %s mode";
    }
    @Override
    public final OperationFailedException managementOperationAllowedOnlyInRunningMode(final String operationName, final RunningMode mode) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), managementOperationAllowedOnlyInRunningMode$str(), operationName, mode));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noInVMConnector$str() {
        return "WFLYMSGAMQ0084: The server does not define any in-vm connector. One is required to be able to import a journal";
    }
    @Override
    public final OperationFailedException noInVMConnector() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noInVMConnector$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToLoadClassFromModule$str() {
        return "WFLYMSGAMQ0085: Unable to load class %s from module %s";
    }
    @Override
    public final OperationFailedException unableToLoadClassFromModule(final String className, final String moduleName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToLoadClassFromModule$str(), className, moduleName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToLoadModule$str() {
        return "WFLYMSGAMQ0086: Unable to load module %s";
    }
    @Override
    public final OperationFailedException unableToLoadModule(final String moduleName, final ModuleLoadException cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToLoadModule$str(), moduleName), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToLoadConnectorServiceFactoryClass$str() {
        return "WFLYMSGAMQ0087: Unable to load connector service factory class: %s";
    }
    @Override
    public final OperationFailedException unableToLoadConnectorServiceFactoryClass(final String factoryClass) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToLoadConnectorServiceFactoryClass$str(), factoryClass));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidModularParameterValue$str() {
        return "WFLYMSGAMQ0088: %s is an invalid value for parameter %s, it should be multiple of %s";
    }
    @Override
    public final OperationFailedException invalidModularParameterValue(final long size, final String parameterName, final long modular) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidModularParameterValue$str(), size, parameterName, modular));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void invalidConfiguration(final PathAddress address, final String definedAttribute, final List<String> otherAttributes) {
        super.log.logf(FQCN, WARN, null, invalidConfiguration$str(), address, definedAttribute, otherAttributes);
    }
    protected String invalidConfiguration$str() {
        return "WFLYMSGAMQ0089: Resource at %s is not correctly configured: when its attribute %s is defined, the other attributes %s will not be taken into account";
    }
    protected String invalidNullSecurityDomain$str() {
        return "WFLYMSGAMQ0090: The Elytron security domain cannot be null";
    }
    @Override
    public final IllegalArgumentException invalidNullSecurityDomain() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidNullSecurityDomain$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedAuthenticationWithException(final Throwable cause, final String username, final String message) {
        super.log.logf(FQCN, DEBUG, cause, failedAuthenticationWithException$str(), username, message);
    }
    protected String failedAuthenticationWithException$str() {
        return "WFLYMSGAMQ0091: Failed to authenticate username %s. Exception message: %s";
    }
    @Override
    public final void failedAuthentication(final String username) {
        super.log.logf(FQCN, DEBUG, null, failedAuthentication$str(), username);
    }
    protected String failedAuthentication$str() {
        return "WFLYMSGAMQ0092: Failed to authenticate username %s: cannot verify username/password pair";
    }
    @Override
    public final void failedAuthorization(final String username) {
        super.log.logf(FQCN, DEBUG, null, failedAuthorization$str(), username);
    }
    protected String failedAuthorization$str() {
        return "WFLYMSGAMQ0093: Failed to authorize username %s: missing permissions";
    }
    @Override
    public final void jdbcDatabaseDialectDetectionFailed(final String databaseDialects) {
        super.log.logf(FQCN, WARN, null, jdbcDatabaseDialectDetectionFailed$str(), databaseDialects);
    }
    protected String jdbcDatabaseDialectDetectionFailed$str() {
        return "WFLYMSGAMQ0094: Unable to detect database dialect from connection metadata or JDBC driver name. Please configure this manually using the 'journal-database' property in your configuration.  Known database dialect strings are %s";
    }
    @Override
    public final void multipleClientMappingsFound(final String socketBindingName, final String transportConfigName, final String host, final int port) {
        super.log.logf(FQCN, WARN, null, multipleClientMappingsFound$str(), socketBindingName, transportConfigName, host, port);
    }
    protected String multipleClientMappingsFound$str() {
        return "WFLYMSGAMQ0095: Multiple client-mapping found in [%s] socket binding used by ActiveMQ [%s] transport configuration. Using address: [host: %s, port %s]";
    }
    protected String operationNotAllowedOnJdbcStore$str() {
        return "WFLYMSGAMQ0096: The %s operation can not be performed on a JDBC store journal";
    }
    @Override
    public final OperationFailedException operationNotAllowedOnJdbcStore(final String operationName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), operationNotAllowedOnJdbcStore$str(), operationName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSocketBinding$str() {
        return "WFLYMSGAMQ0097: There is no socket-binding or outbound-socket-binding configured with the name %s";
    }
    @Override
    public final OperationFailedException noSocketBinding(final String connectorSocketBinding) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noSocketBinding$str(), connectorSocketBinding));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String moduleNotFound$str() {
        return "WFLYMSGAMQ0098: Unable to load module %s - the module or one of its dependencies is missing [%s]";
    }
    @Override
    public final OperationFailedException moduleNotFound(final String moduleName, final String missingModule, final ModuleNotFoundException e) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), moduleNotFound$str(), moduleName, missingModule), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String remoteDestinationCreationFailed$str() {
        return "WFLYMSGAMQ0099: Creating the remote destination %s failed with error %s";
    }
    @Override
    public final StartException remoteDestinationCreationFailed(final String destinationName, final String error) {
        final StartException result = new StartException(String.format(getLoggingLocale(), remoteDestinationCreationFailed$str(), destinationName, error));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String remoteDestinationDeletionFailed$str() {
        return "WFLYMSGAMQ0100: Deleting the remote destination %s failed with error %s";
    }
    @Override
    public final RuntimeException remoteDestinationDeletionFailed(final String destinationName, final String error) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), remoteDestinationDeletionFailed$str(), destinationName, error));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void invalidTransactionNameValue(final String value, final String name, final Collection<?> validValues) {
        super.log.logf(FQCN, WARN, null, invalidTransactionNameValue$str(), value, name, validValues);
    }
    protected String invalidTransactionNameValue$str() {
        return "WFLYMSGAMQ0101: Invalid value %s for %s, legal values are %s, default value is applied.";
    }
    protected String upgradeRequestMissingKey$str() {
        return "WFLYMSGAMQ0102: HTTP Upgrade request missing Sec-JbossRemoting-Key header";
    }
    @Override
    public final IOException upgradeRequestMissingKey() {
        final IOException result = new IOException(String.format(getLoggingLocale(), upgradeRequestMissingKey$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String brokerNotStarted$str() {
        return "WFLYMSGAMQ0103: Broker is not started. It cannot be managed yet.";
    }
    @Override
    public final IllegalStateException brokerNotStarted() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), brokerNotStarted$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String legacySecurityUnsupported$str() {
        return "WFLYMSGAMQ0104: Legacy security is no longer supported.";
    }
    @Override
    public final IllegalStateException legacySecurityUnsupported() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), legacySecurityUnsupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String socketBindingMulticastNotSet$str() {
        return "WFLYMSGAMQ0105: The %s %s is configured to use socket-binding %s, but this socket binding doesn't have the multicast-address or a multicast-port attributes configured.";
    }
    @Override
    public final OperationFailedException socketBindingMulticastNotSet(final String resourceType, final String resourceName, final String socketBindingName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), socketBindingMulticastNotSet$str(), resourceType, resourceName, socketBindingName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedBridgeDeployment$str() {
        return "WFLYMSGAMQ0106: The bridge %s didn't deploy.";
    }
    @Override
    public final OperationFailedException failedBridgeDeployment(final String bridgeName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), failedBridgeDeployment$str(), bridgeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String securityEnabledWithoutDomain$str() {
        return "WFLYMSGAMQ0107: You must define a elytron security domain when security is enabled.";
    }
    @Override
    public final IllegalStateException securityEnabledWithoutDomain() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), securityEnabledWithoutDomain$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String socketBindingOrJGroupsClusterRequired$str() {
        return "WFLYMSGAMQ0108: Either socket-binding or jgroups-cluster attribute is required.";
    }
    @Override
    public final OperationFailedException socketBindingOrJGroupsClusterRequired() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), socketBindingOrJGroupsClusterRequired$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownHAPolicyType$str() {
        return "WFLYMSGAMQ0109: Unknown ha policy type.";
    }
    @Override
    public final OperationFailedException unknownHAPolicyType() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unknownHAPolicyType$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToFindRecoveryRegistry$str() {
        return "WFLYMSGAMQ0110: Unable to find Recovery Registry";
    }
    @Override
    public final IllegalStateException unableToFindRecoveryRegistry() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unableToFindRecoveryRegistry$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSubscriptionError$str() {
        return "WFLYMSGAMQ0111: No subscriptions with name %s for clientID %s";
    }
    @Override
    public final IllegalArgumentException noSubscriptionError(final String queueName, final String clientID) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noSubscriptionError$str(), queueName, clientID));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSubscriptionWithQueueName$str() {
        return "WFLYMSGAMQ0112: No subscriptions with name %s";
    }
    @Override
    public final IllegalArgumentException noSubscriptionWithQueueName(final String queueName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noSubscriptionWithQueueName$str(), queueName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingArguments$str() {
        return "WFLYMSGAMQ0113: Arguments are missing";
    }
    @Override
    public final OperationFormatException missingArguments() {
        final OperationFormatException result = new OperationFormatException(String.format(getLoggingLocale(), missingArguments$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingRestype$str() {
        return "WFLYMSGAMQ0114: Required parameter --restype is missing.";
    }
    @Override
    public final OperationFormatException missingRestype() {
        final OperationFormatException result = new OperationFormatException(String.format(getLoggingLocale(), missingRestype$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingJNDIName$str() {
        return "WFLYMSGAMQ0115: JNDI name is missing.";
    }
    @Override
    public final OperationFormatException missingJNDIName() {
        final OperationFormatException result = new OperationFormatException(String.format(getLoggingLocale(), missingJNDIName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParseProperty$str() {
        return "WFLYMSGAMQ0116: Failed to parse property '%s' ";
    }
    @Override
    public final OperationFormatException failedToParseProperty(final String prop) {
        final OperationFormatException result = new OperationFormatException(String.format(getLoggingLocale(), failedToParseProperty$str(), prop));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedResourceType$str() {
        return "WFLYMSGAMQ0117: Resource type %s isn't supported.";
    }
    @Override
    public final OperationFormatException unsupportedResourceType(final String restype) {
        final OperationFormatException result = new OperationFormatException(String.format(getLoggingLocale(), unsupportedResourceType$str(), restype));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingName$str() {
        return "WFLYMSGAMQ0118: name is missing.";
    }
    @Override
    public final OperationFormatException missingName() {
        final OperationFormatException result = new OperationFormatException(String.format(getLoggingLocale(), missingName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jndiWasNotFound$str() {
        return "WFLYMSGAMQ0119: '%s' wasn't found among existing JMS resources.";
    }
    @Override
    public final OperationFormatException jndiWasNotFound(final String jndiName) {
        final OperationFormatException result = new OperationFormatException(String.format(getLoggingLocale(), jndiWasNotFound$str(), jndiName));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
