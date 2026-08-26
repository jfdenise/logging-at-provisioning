package org.jboss.as.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.xml.stream.XMLStreamReader;
import java.io.Closeable;
import org.jboss.as.controller.capability.registry.RegistrationPoint;
import java.lang.String;
import org.jboss.as.controller.PathElement;
import org.jboss.as.controller._private.OperationFailedRuntimeException;
import javax.xml.stream.XMLStreamWriter;
import org.jboss.as.controller.OperationContext.Stage;
import java.util.List;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;
import org.jboss.modules.ModuleNotFoundException;
import java.lang.Character;
import java.lang.NumberFormatException;
import org.jboss.as.controller.ExpressionResolver.ExpressionResolutionServerException;
import org.jboss.as.controller.registry.OperationEntry.Flag;
import java.util.concurrent.CancellationException;
import org.jboss.msc.service.ServiceName;
import org.yaml.snakeyaml.nodes.NodeId;
import java.lang.Throwable;
import java.util.Collection;
import java.lang.Class;
import java.lang.Object;
import org.jboss.dmr.ModelNode;
import java.util.Arrays;
import java.net.InetAddress;
import java.io.File;
import org.jboss.modules.ModuleLoadException;
import java.lang.IllegalStateException;
import java.util.Set;
import java.lang.StringBuilder;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.as.controller.ExpressionResolver.ExpressionResolutionUserException;
import org.jboss.as.controller.parsing.Element;
import org.yaml.snakeyaml.error.Mark;
import org.jboss.logging.Logger;
import org.jboss.as.controller.notification.Notification;
import org.jboss.as.controller.registry.Resource.NoSuchResourceException;
import org.jboss.as.controller.ProcessType;
import java.lang.RuntimeException;
import java.lang.Number;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.UnauthorizedException;
import org.jboss.msc.service.StartException;
import java.nio.file.Path;
import javax.annotation.processing.Generated;
import java.net.UnknownHostException;
import javax.xml.namespace.QName;
import org.jboss.as.controller.OperationStepHandler;
import org.jboss.as.controller.OperationFailedException;
import java.lang.SecurityException;
import java.io.IOException;
import java.lang.Exception;
import javax.xml.stream.XMLStreamException;
import org.jboss.as.controller.interfaces.InterfaceCriteria;
import org.jboss.as.controller.access.rbac.UnknowRoleException;
import org.jboss.as.controller.PathAddress;
import org.jboss.as.controller.persistence.ConfigurationPersistenceException;
import org.jboss.dmr.ModelType;
import org.jboss.as.controller._private.OperationCancellationException;
import org.jboss.as.controller.ModelVersion;
import javax.xml.stream.Location;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:26:04+0200")
public class ControllerLogger_$logger extends DelegatingBasicLogger implements ControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ControllerLogger_$logger.class.getName();
    public ControllerLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void cannotResolveAddress(final String address) {
        super.log.logf(FQCN, WARN, null, cannotResolveAddress$str(), address);
    }
    protected String cannotResolveAddress$str() {
        return "WFLYCTL0001: Cannot resolve address %s, so cannot match it to any InetAddress";
    }
    @Override
    public final void errorBootingContainer(final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, errorBootingContainer0$str());
    }
    protected String errorBootingContainer0$str() {
        return "WFLYCTL0002: Error booting the container";
    }
    @Override
    public final void errorBootingContainer(final Throwable cause, final long bootStackSize, final String name) {
        super.log.logf(FQCN, ERROR, cause, errorBootingContainer2$str(), bootStackSize, name);
    }
    protected String errorBootingContainer2$str() {
        return "WFLYCTL0003: Error booting the container due to insufficient stack space for the thread used to execute boot operations. The thread was configured with a stack size of [%1$d]. Setting system property %2$s to a value higher than [%1$d] may resolve this problem.";
    }
    @Override
    public final void errorRevertingOperation(final Throwable cause, final String className, final String op, final PathAddress address) {
        super.log.logf(FQCN, ERROR, cause, errorRevertingOperation$str(), className, op, address);
    }
    protected String errorRevertingOperation$str() {
        return "WFLYCTL0004: %s caught exception attempting to revert operation %s at address %s";
    }
    @Override
    public final void failedExecutingOperation(final Throwable cause, final ModelNode op, final PathAddress path) {
        super.log.logf(FQCN, ERROR, cause, failedExecutingOperation$str(), op, path);
    }
    protected String failedExecutingOperation$str() {
        return "WFLYCTL0005: Failed executing operation %s at address %s";
    }
    @Override
    public final void failedSubsystemBootOperations(final Throwable cause, final String name) {
        super.log.logf(FQCN, ERROR, cause, failedSubsystemBootOperations$str(), name);
    }
    protected String failedSubsystemBootOperations$str() {
        return "WFLYCTL0006: Failed executing subsystem %s boot operations";
    }
    @Override
    public final void failedToCloseResource(final Throwable cause, final Closeable closeable) {
        super.log.logf(FQCN, ERROR, cause, failedToCloseResource$str(), closeable);
    }
    protected String failedToCloseResource$str() {
        return "WFLYCTL0007: Failed to close resource %s";
    }
    @Override
    public final void failedToCloseResource(final Throwable cause, final XMLStreamWriter writer) {
        super.log.logf(FQCN, ERROR, cause, failedToCloseResource$str(), writer);
    }
    @Override
    public final void failedToCloseResource(final Throwable cause, final XMLStreamReader reader) {
        super.log.logf(FQCN, ERROR, cause, failedToCloseResource$str(), reader);
    }
    @Override
    public final void failedToPersistConfigurationChange(final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, failedToPersistConfigurationChange0$str());
    }
    protected String failedToPersistConfigurationChange0$str() {
        return "WFLYCTL0008: Failed to persist configuration change";
    }
    @Override
    public final void failedToStoreConfiguration(final Throwable cause, final String name) {
        super.log.logf(FQCN, ERROR, cause, failedToStoreConfiguration$str(), name);
    }
    protected String failedToStoreConfiguration$str() {
        return "WFLYCTL0009: Failed to store configuration to %s";
    }
    @Override
    public final void invalidSystemPropertyValue(final String value, final String name, final int defaultValue) {
        super.log.logf(FQCN, ERROR, null, invalidSystemPropertyValue$str(), value, name, defaultValue);
    }
    protected String invalidSystemPropertyValue$str() {
        return "WFLYCTL0010: Invalid value %s for system property %s -- using default value [%d]";
    }
    @Override
    public final void invalidWildcardAddress(final String address, final String inetAddress, final String anyAddress) {
        super.log.logf(FQCN, WARN, null, invalidWildcardAddress$str(), address, inetAddress, anyAddress);
    }
    protected String invalidWildcardAddress$str() {
        return "WFLYCTL0011: Address %1$s is a wildcard address, which will not match against any specific address. Do not use the '%2$s' configuration element to specify that an interface should use a wildcard address; use '%3$s'";
    }
    @Override
    public final void operationFailed(final Throwable cause, final ModelNode op, final ModelNode opAddress) {
        super.log.logf(FQCN, ERROR, cause, operationFailed2$str(), op, opAddress);
    }
    protected String operationFailed2$str() {
        return "WFLYCTL0013: Operation (%s) failed - address: (%s)";
    }
    @Override
    public final void operationFailed(final ModelNode op, final ModelNode opAddress, final ModelNode failureDescription) {
        super.log.logf(FQCN, ERROR, null, operationFailed3$str(), op, opAddress, failureDescription);
    }
    protected String operationFailed3$str() {
        return "WFLYCTL0013: Operation (%s) failed - address: (%s) - failure description: %s";
    }
    @Override
    public final void operationFailed(final ModelNode op, final ModelNode opAddress, final ModelNode failureDescription, final String emptyString) {
        super.log.logf(FQCN, DEBUG, null, operationFailed4$str(), op, opAddress, failureDescription, emptyString);
    }
    protected String operationFailed4$str() {
        return "WFLYCTL0013: Operation (%s) failed - address: (%s) - failure description: %s%s";
    }
    @Override
    public final void wildcardAddressDetected() {
        super.log.logf(FQCN, WARN, null, wildcardAddressDetected$str());
    }
    protected String wildcardAddressDetected$str() {
        return "WFLYCTL0015: Wildcard address detected - will ignore other interface criteria.";
    }
    @Override
    public final void noFinalProxyOutcomeReceived(final ModelNode op, final ModelNode opAddress, final ModelNode proxyAddress) {
        super.log.logf(FQCN, ERROR, null, noFinalProxyOutcomeReceived$str(), op, opAddress, proxyAddress);
    }
    protected String noFinalProxyOutcomeReceived$str() {
        return "WFLYCTL0016: Received no final outcome response for operation %s with address %s from remote process at address %s. The result of this operation will only include the remote process' preliminary response to the request.";
    }
    @Override
    public final void operationFailedOnClientError(final ModelNode op, final ModelNode opAddress, final ModelNode failureDescription) {
        super.log.logf(FQCN, DEBUG, null, operationFailedOnClientError$str(), op, opAddress, failureDescription);
    }
    protected String operationFailedOnClientError$str() {
        return "WFLYCTL0017: Operation (%s) failed - address: (%s) - failure description: %s";
    }
    @Override
    public final void gracefulManagementChannelHandlerShutdownTimedOut(final int timeout) {
        super.log.logf(FQCN, WARN, null, gracefulManagementChannelHandlerShutdownTimedOut$str(), timeout);
    }
    protected String gracefulManagementChannelHandlerShutdownTimedOut$str() {
        return "WFLYCTL0019: Graceful shutdown of the handler used for native management requests did not complete within [%d] ms but shutdown of the underlying communication channel is proceeding";
    }
    @Override
    public final void gracefulManagementChannelHandlerShutdownFailed(final Throwable cause) {
        super.log.logf(FQCN, WARN, cause, gracefulManagementChannelHandlerShutdownFailed$str());
    }
    protected String gracefulManagementChannelHandlerShutdownFailed$str() {
        return "WFLYCTL0020: Graceful shutdown of the handler used for native management requests failed but shutdown of the underlying communication channel is proceeding";
    }
    @Override
    public final void invalidChannelCloseTimeout(final NumberFormatException cause, final String propertyName, final String propValue) {
        super.log.logf(FQCN, WARN, cause, invalidChannelCloseTimeout$str(), propertyName, propValue);
    }
    protected String invalidChannelCloseTimeout$str() {
        return "WFLYCTL0021: Invalid value '%s' for system property '%s' -- value must be convertible into an int";
    }
    @Override
    public final void multipleMatchingAddresses(final String interfaceName, final Set<InetAddress> addresses, final Set<String> nis, final InetAddress inetAddress, final String networkInterface) {
        super.log.logf(FQCN, WARN, null, multipleMatchingAddresses5$str(), interfaceName, addresses, nis, inetAddress, networkInterface);
    }
    protected String multipleMatchingAddresses5$str() {
        return "WFLYCTL0022: Multiple addresses or network interfaces matched the selection criteria for interface '%s'. Matching addresses: %s.  Matching network interfaces: %s. The interface will use address %s and network interface %s.";
    }
    @Override
    public final void multipleMatchingAddresses(final String toMatch, final Set<InetAddress> addresses, final Set<String> nis) {
        super.log.logf(FQCN, WARN, null, multipleMatchingAddresses3$str(), toMatch, addresses, nis);
    }
    protected String multipleMatchingAddresses3$str() {
        return "WFLYCTL0023: Value '%s' for interface selection criteria 'inet-address' is ambiguous, as more than one address or network interface available on the machine matches it. Because of this ambiguity, no address will be selected as a match. Matching addresses: %s.  Matching network interfaces: %s.";
    }
    @Override
    public final void cannotReadTargetDefinition(final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, cannotReadTargetDefinition$str());
    }
    protected String cannotReadTargetDefinition$str() {
        return "WFLYCTL0024: Could not read target definition!";
    }
    @Override
    public final void interruptedWaitingStability(final String operation, final PathAddress address) {
        super.log.logf(FQCN, ERROR, null, interruptedWaitingStability$str(), operation, address);
    }
    protected String interruptedWaitingStability$str() {
        return "WFLYCTL0027: Operation was interrupted before service container stability could be reached. Process should be restarted. Step that first updated the service container was '%s' at address '%s'";
    }
    @Override
    public final void attributeDeprecated(final String name, final String address) {
        super.log.logf(FQCN, INFO, null, attributeDeprecated$str(), name, address);
    }
    protected String attributeDeprecated$str() {
        return "WFLYCTL0028: Attribute '%s' in the resource at address '%s' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.";
    }
    @Override
    public final void cannotDeleteTempFile(final String name) {
        super.log.logf(FQCN, WARN, null, cannotDeleteTempFile$str(), name);
    }
    protected String cannotDeleteTempFile$str() {
        return "WFLYCTL0029: Cannot delete temp file %s, will be deleted on exit";
    }
    protected String noSuchResourceType$str() {
        return "WFLYCTL0030: No resource definition is registered for address %s";
    }
    @Override
    public final String noSuchResourceType(final PathAddress address) {
        return String.format(getLoggingLocale(), noSuchResourceType$str(), address);
    }
    protected String noHandlerForOperation$str() {
        return "WFLYCTL0031: No operation named '%s' exists at address %s";
    }
    @Override
    public final String noHandlerForOperation(final String operationName, final PathAddress address) {
        return String.format(getLoggingLocale(), noHandlerForOperation$str(), operationName, address);
    }
    @Override
    public final void transformationWarnings(final String hostName, final Set<String> problems) {
        super.log.logf(FQCN, WARN, null, transformationWarnings$str(), hostName, problems);
    }
    protected String transformationWarnings$str() {
        return "WFLYCTL0032: There were problems during the transformation process for target host: '%s' %nProblems found: %n%s";
    }
    @Override
    public final void extensionDeprecated(final String extensionName) {
        super.log.logf(FQCN, INFO, null, extensionDeprecated$str(), extensionName);
    }
    protected String extensionDeprecated$str() {
        return "WFLYCTL0033: Extension '%s' is deprecated and may not be supported in future versions";
    }
    @Override
    public final void ignoringUnsupportedLegacyExtension(final List<String> subsystemNames, final String extensionName) {
        super.log.logf(FQCN, INFO, null, ignoringUnsupportedLegacyExtension$str(), subsystemNames, extensionName);
    }
    protected String ignoringUnsupportedLegacyExtension$str() {
        return "WFLYCTL0034: Subsystems %s provided by legacy extension '%s' are not supported on servers running this version. The extension is only supported for use by hosts running a previous release in a mixed-version managed domain. On this server the extension will not register any subsystems, and future attempts to create or address subsystem resources on this server will result in failure.";
    }
    @Override
    public final void failedToUpdateAuditLog(final Exception e) {
        super.log.logf(FQCN, ERROR, e, failedToUpdateAuditLog$str());
    }
    protected String failedToUpdateAuditLog$str() {
        return "WFLYCTL0035: Update of the management operation audit log failed";
    }
    @Override
    public final void disablingLoggingDueToFailures(final short failureCount) {
        super.log.logf(FQCN, ERROR, null, disablingLoggingDueToFailures$str(), failureCount);
    }
    protected String disablingLoggingDueToFailures$str() {
        return "WFLYCTL0036: [%d] consecutive management operation audit logging failures have occurred; disabling audit logging";
    }
    @Override
    public final void logHandlerWriteFailed(final Throwable t, final String name) {
        super.log.logf(FQCN, ERROR, t, logHandlerWriteFailed$str(), name);
    }
    protected String logHandlerWriteFailed$str() {
        return "WFLYCTL0037: Update of the management operation audit log failed in handler '%s'";
    }
    @Override
    public final void disablingLogHandlerDueToFailures(final int failureCount, final String name) {
        super.log.logf(FQCN, ERROR, null, disablingLogHandlerDueToFailures$str(), failureCount, name);
    }
    protected String disablingLogHandlerDueToFailures$str() {
        return "WFLYCTL0038: [%d] consecutive management operation audit logging failures have occurred in handler '%s'; disabling this handler for audit logging";
    }
    protected String alreadyDefined$str() {
        return "WFLYCTL0039: %s already defined";
    }
    @Override
    public final XMLStreamException alreadyDefined(final String name, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), alreadyDefined$str(), name), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String alreadyDeclared4$str() {
        return "WFLYCTL0041: A %s %s already declared has already been declared in %s %s";
    }
    @Override
    public final XMLStreamException alreadyDeclared(final String name, final String value, final String parentName, final String parentValue, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), alreadyDeclared4$str(), name, value, parentName, parentValue), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String alreadyDeclared5$str() {
        return "WFLYCTL0042: A %s or a %s %s already declared has already been declared in %s %s";
    }
    @Override
    public final XMLStreamException alreadyDeclared(final String name1, final String name2, final String value, final String parentName, final String parentValue, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), alreadyDeclared5$str(), name1, name2, value, parentName, parentValue), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String alreadyRegistered$str() {
        return "WFLYCTL0043: An %s named '%s' is already registered at location '%s'";
    }
    @Override
    public final IllegalArgumentException alreadyRegistered(final String type, final String name, final String location) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), alreadyRegistered$str(), type, name, location));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ambiguousConfigurationFiles$str() {
        return "WFLYCTL0044: Ambiguous configuration file name '%s' as there are multiple files in %s that end in %s";
    }
    @Override
    public final IllegalStateException ambiguousConfigurationFiles(final String backupType, final File searchDir, final String suffix) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), ambiguousConfigurationFiles$str(), backupType, searchDir, suffix));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ambiguousName$str() {
        return "WFLYCTL0045: Ambiguous name '%s' in %s: %s";
    }
    @Override
    public final IllegalArgumentException ambiguousName(final String prefix, final String dir, final Collection<String> files) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), ambiguousName$str(), prefix, dir, files));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String attributeNotWritable$str() {
        return "WFLYCTL0048: Attribute %s is not writable";
    }
    @Override
    public final String attributeNotWritable(final String attributeName) {
        return String.format(getLoggingLocale(), attributeNotWritable$str(), attributeName);
    }
    protected String cannotDetermineDefaultName$str() {
        return "WFLYCTL0050: Unable to determine a default name based on the local host name";
    }
    @Override
    public final RuntimeException cannotDetermineDefaultName(final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotDetermineDefaultName$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCreate$str() {
        return "WFLYCTL0051: Could not create %s";
    }
    @Override
    public final IllegalStateException cannotCreate(final String path) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotCreate$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotDelete$str() {
        return "WFLYCTL0052: Could not delete %s";
    }
    @Override
    public final IllegalStateException cannotDelete(final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotDelete$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRegisterSubmodelWithNullPath$str() {
        return "WFLYCTL0053: Cannot register submodels with a null PathElement";
    }
    @Override
    public final IllegalArgumentException cannotRegisterSubmodelWithNullPath() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotRegisterSubmodelWithNullPath$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemove$str() {
        return "WFLYCTL0055: Cannot remove %s";
    }
    @Override
    public final OperationFailedRuntimeException cannotRemove(final String name) {
        final OperationFailedRuntimeException result = new OperationFailedRuntimeException(String.format(getLoggingLocale(), cannotRemove$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void cannotRename(final IOException ioe, final Path fromPath, final Path toPath) {
        super.log.logf(FQCN, ERROR, ioe, cannotRename$str(), fromPath, toPath);
    }
    protected String cannotRename$str() {
        return "WFLYCTL0056: Could not rename %s to %s";
    }
    protected String cannotWriteTo$str() {
        return "WFLYCTL0057: Cannot write to %s";
    }
    @Override
    public final IllegalArgumentException cannotWriteTo(final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotWriteTo$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String childAlreadyDeclared$str() {
        return "WFLYCTL0058: Child %s of element %s already declared";
    }
    @Override
    public final XMLStreamException childAlreadyDeclared(final String childName, final String parentName, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), childAlreadyDeclared$str(), childName, parentName), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String canonicalBootFileNotFound$str() {
        return "WFLYCTL0059: Could not get canonical file for boot file: %s";
    }
    @Override
    public final RuntimeException canonicalBootFileNotFound(final Throwable cause, final File file) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), canonicalBootFileNotFound$str(), file), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String canonicalMainFileNotFound$str() {
        return "WFLYCTL0060: Could not get canonical file for main file: %s";
    }
    @Override
    public final IllegalStateException canonicalMainFileNotFound(final Throwable cause, final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), canonicalMainFileNotFound$str(), file), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String compositeOperationFailed$str() {
        return "WFLYCTL0062: Composite operation failed and was rolled back. Steps that failed:";
    }
    @Override
    public final String compositeOperationFailed() {
        return String.format(getLoggingLocale(), compositeOperationFailed$str());
    }
    protected String compositeOperationRolledBack$str() {
        return "WFLYCTL0063: Composite operation was rolled back";
    }
    @Override
    public final String compositeOperationRolledBack() {
        return String.format(getLoggingLocale(), compositeOperationRolledBack$str());
    }
    protected String configurationFileNameNotAllowed$str() {
        return "WFLYCTL0064: Configuration files whose complete name is %s are not allowed";
    }
    @Override
    public final IllegalArgumentException configurationFileNameNotAllowed(final String backupType) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), configurationFileNameNotAllowed$str(), backupType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String configurationFileNotFound$str() {
        return "WFLYCTL0065: No configuration file ending in %s found in %s";
    }
    @Override
    public final IllegalStateException configurationFileNotFound(final String suffix, final File dir) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), configurationFileNotFound$str(), suffix, dir));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String directoryNotFound$str() {
        return "WFLYCTL0066: No directory %s was found";
    }
    @Override
    public final IllegalArgumentException directoryNotFound(final String pathName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), directoryNotFound$str(), pathName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String domainControllerMustBeDeclared$str() {
        return "WFLYCTL0067: Either a %s or %s domain controller configuration must be declared.";
    }
    @Override
    public final XMLStreamException domainControllerMustBeDeclared(final String remoteName, final String localName, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), domainControllerMustBeDeclared$str(), remoteName, localName), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateAttribute$str() {
        return "WFLYCTL0068: An attribute named '%s' has already been declared";
    }
    @Override
    public final XMLStreamException duplicateAttribute(final String name, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), duplicateAttribute$str(), name), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateDeclaration1$str() {
        return "WFLYCTL0069: Duplicate %s declaration";
    }
    @Override
    public final XMLStreamException duplicateDeclaration(final String name, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), duplicateDeclaration1$str(), name), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateDeclaration2$str() {
        return "WFLYCTL0070: Duplicate %s declaration %s";
    }
    @Override
    public final XMLStreamException duplicateDeclaration(final String name, final String value, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), duplicateDeclaration2$str(), name, value), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateElement$str() {
        return "WFLYCTL0071: Duplicate path element '%s' found";
    }
    @Override
    public final OperationFailedRuntimeException duplicateElement(final String name) {
        final OperationFailedRuntimeException result = new OperationFailedRuntimeException(String.format(getLoggingLocale(), duplicateElement$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateInterfaceDeclaration$str() {
        return "WFLYCTL0072: Duplicate interface declaration";
    }
    @Override
    public final XMLStreamException duplicateInterfaceDeclaration(final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), duplicateInterfaceDeclaration$str()), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateNamedElement$str() {
        return "WFLYCTL0073: An element of this type named '%s' has already been declared";
    }
    @Override
    public final XMLStreamException duplicateNamedElement(final String name, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), duplicateNamedElement$str(), name), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateResource$str() {
        return "WFLYCTL0075: Duplicate resource %s";
    }
    @Override
    public final IllegalStateException duplicateResource(final String name) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), duplicateResource$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateResourceType$str() {
        return "WFLYCTL0076: Duplicate resource type %s";
    }
    @Override
    public final IllegalStateException duplicateResourceType(final String type) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), duplicateResourceType$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedInitializingModule$str() {
        return "WFLYCTL0079: Failed initializing module %s";
    }
    @Override
    public final RuntimeException failedInitializingModule(final Throwable cause, final String name) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedInitializingModule$str(), name), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedServices$str() {
        return "WFLYCTL0080: Failed services";
    }
    @Override
    public final String failedServices() {
        return String.format(getLoggingLocale(), failedServices$str());
    }
    protected String failedToBackup$str() {
        return "WFLYCTL0081: Failed to back up %s";
    }
    @Override
    public final ConfigurationPersistenceException failedToBackup(final Throwable cause, final File file) {
        final ConfigurationPersistenceException result = new ConfigurationPersistenceException(String.format(getLoggingLocale(), failedToBackup$str(), file), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToCreateConfigurationBackup$str() {
        return "WFLYCTL0082: Failed to create backup copies of configuration file %s";
    }
    @Override
    public final ConfigurationPersistenceException failedToCreateConfigurationBackup(final Throwable cause, final File file) {
        final ConfigurationPersistenceException result = new ConfigurationPersistenceException(String.format(getLoggingLocale(), failedToCreateConfigurationBackup$str(), file), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLoadModule0$str() {
        return "WFLYCTL0083: Failed to load module";
    }
    @Override
    public final XMLStreamException failedToLoadModule(final Throwable cause) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), failedToLoadModule0$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLoadModule1$str() {
        return "WFLYCTL0083: Failed to load module %s";
    }
    @Override
    public final XMLStreamException failedToLoadModule(final Throwable cause, final String name) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), failedToLoadModule1$str(), name), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToMarshalConfiguration$str() {
        return "WFLYCTL0084: Failed to marshal configuration";
    }
    @Override
    public final ConfigurationPersistenceException failedToMarshalConfiguration(final Throwable cause) {
        final ConfigurationPersistenceException result = new ConfigurationPersistenceException(String.format(getLoggingLocale(), failedToMarshalConfiguration$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParseConfiguration$str() {
        return "WFLYCTL0085: Failed to parse configuration";
    }
    @Override
    public final ConfigurationPersistenceException failedToParseConfiguration(final Throwable cause) {
        final ConfigurationPersistenceException result = new ConfigurationPersistenceException(String.format(getLoggingLocale(), failedToParseConfiguration$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToPersistConfigurationChange1$str() {
        return "WFLYCTL0086: Failed to persist configuration change: %s";
    }
    @Override
    public final String failedToPersistConfigurationChange(final String cause) {
        return String.format(getLoggingLocale(), failedToPersistConfigurationChange1$str(), cause);
    }
    protected String failedToTakeSnapshot$str() {
        return "WFLYCTL0088: Failed to take a snapshot of %s to %s";
    }
    @Override
    public final ConfigurationPersistenceException failedToTakeSnapshot(final Throwable cause, final File file, final File snapshot) {
        final ConfigurationPersistenceException result = new ConfigurationPersistenceException(String.format(getLoggingLocale(), failedToTakeSnapshot$str(), file, snapshot), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToWriteConfiguration$str() {
        return "WFLYCTL0089: Failed to write configuration";
    }
    @Override
    public final ConfigurationPersistenceException failedToWriteConfiguration(final Throwable cause) {
        final ConfigurationPersistenceException result = new ConfigurationPersistenceException(String.format(getLoggingLocale(), failedToWriteConfiguration$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String fileNotFound$str() {
        return "WFLYCTL0090: %s does not exist";
    }
    @Override
    public final IllegalArgumentException fileNotFound(final String path1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), fileNotFound$str(), path1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String fileNotFoundWithPrefix$str() {
        return "WFLYCTL0091: No files beginning with '%s' found in %s";
    }
    @Override
    public final IllegalArgumentException fileNotFoundWithPrefix(final String prefix, final String dir) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), fileNotFoundWithPrefix$str(), prefix, dir));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String fullServerBootRequired$str() {
        return "WFLYCTL0092: %s cannot be used except in a full server boot";
    }
    @Override
    public final IllegalStateException fullServerBootRequired(final Class<?> clazz) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), fullServerBootRequired$str(), clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalInterfaceCriteria$str() {
        return "WFLYCTL0094: Illegal interface criteria type %s; must be %s";
    }
    @Override
    public final String illegalInterfaceCriteria(final ModelType invalidType, final ModelType validType) {
        return String.format(getLoggingLocale(), illegalInterfaceCriteria$str(), invalidType, validType);
    }
    protected String illegalValueForInterfaceCriteria$str() {
        return "WFLYCTL0095: Illegal value %s for interface criteria %s; must be %s";
    }
    @Override
    public final String illegalValueForInterfaceCriteria(final ModelType valueType, final String id, final ModelType validType) {
        return String.format(getLoggingLocale(), illegalValueForInterfaceCriteria$str(), valueType, id, validType);
    }
    protected String immutableResource$str() {
        return "WFLYCTL0096: Resource is immutable";
    }
    @Override
    public final UnsupportedOperationException immutableResource() {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), immutableResource$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String incorrectType$str() {
        return "WFLYCTL0097: Wrong type for '%s'. Expected %s but was %s";
    }
    @Override
    public final OperationFailedException incorrectType(final String name, final Collection<ModelType> validTypes, final ModelType invalidType) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), incorrectType$str(), name, validTypes, invalidType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalid1$str() {
        return "WFLYCTL0099: %s is invalid";
    }
    @Override
    public final String invalid(final String name) {
        return String.format(getLoggingLocale(), invalid1$str(), name);
    }
    protected String invalid2$str() {
        return "WFLYCTL0100: %d is not a valid %s";
    }
    @Override
    public final XMLStreamException invalid(final Throwable cause, final int value, final String name, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), invalid2$str(), value, name), location, cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidAddress$str() {
        return "WFLYCTL0101: Invalid address %s (%s)";
    }
    @Override
    public final String invalidAddress(final String address, final String msg) {
        return String.format(getLoggingLocale(), invalidAddress$str(), address, msg);
    }
    protected String invalidAddressMaskValue$str() {
        return "WFLYCTL0102: Invalid 'value' %s -- must be of the form address/mask";
    }
    @Override
    public final String invalidAddressMaskValue(final String value) {
        return String.format(getLoggingLocale(), invalidAddressMaskValue$str(), value);
    }
    protected String invalidAddressMask$str() {
        return "WFLYCTL0103: Invalid mask %s (%s)";
    }
    @Override
    public final String invalidAddressMask(final String mask, final String msg) {
        return String.format(getLoggingLocale(), invalidAddressMask$str(), mask, msg);
    }
    protected String invalidAddressValue$str() {
        return "WFLYCTL0104: Invalid address %s (%s)";
    }
    @Override
    public final String invalidAddressValue(final String value, final String msg) {
        return String.format(getLoggingLocale(), invalidAddressValue$str(), value, msg);
    }
    protected String invalidAttributeCombo$str() {
        return "WFLYCTL0105: %s is invalid in combination with %s";
    }
    @Override
    public final String invalidAttributeCombo(final String attributeName, final StringBuilder combos) {
        return String.format(getLoggingLocale(), invalidAttributeCombo$str(), attributeName, combos);
    }
    protected String invalidAttributeValue2$str() {
        return "WFLYCTL0106: Invalid value '%s' for attribute '%s'";
    }
    @Override
    public final XMLStreamException invalidAttributeValue(final String value, final QName name, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), invalidAttributeValue2$str(), value, name), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidInterfaceCriteriaPattern$str() {
        return "WFLYCTL0109: Invalid pattern %s for interface criteria %s";
    }
    @Override
    public final String invalidInterfaceCriteriaPattern(final String pattern, final String name) {
        return String.format(getLoggingLocale(), invalidInterfaceCriteriaPattern$str(), pattern, name);
    }
    protected String invalidPathElementKey$str() {
        return "WFLYCTL0110: Invalid resource address element '%s'. The key '%s' is not valid for an element in a resource address.";
    }
    @Override
    public final String invalidPathElementKey(final String element, final String key) {
        return String.format(getLoggingLocale(), invalidPathElementKey$str(), element, key);
    }
    protected String invalidLoadFactor$str() {
        return "WFLYCTL0111: Load factor must be greater than 0 and less than or equal to 1";
    }
    @Override
    public final IllegalArgumentException invalidLoadFactor() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidLoadFactor$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidMaxLength$str() {
        return "WFLYCTL0112: '%s' is an invalid value for parameter %s. Values must have a maximum length of %d characters";
    }
    @Override
    public final String invalidMaxLength(final String value, final String name, final int length) {
        return String.format(getLoggingLocale(), invalidMaxLength$str(), value, name, length);
    }
    protected String invalidMinLength$str() {
        return "WFLYCTL0113: '%s' is an invalid value for parameter %s. Values must have a minimum length of %d characters";
    }
    @Override
    public final String invalidMinLength(final String value, final String name, final int length) {
        return String.format(getLoggingLocale(), invalidMinLength$str(), value, name, length);
    }
    protected String invalidMaxSize$str() {
        return "WFLYCTL0114: [%d] is an invalid size for parameter %s. A maximum length of [%d] is required";
    }
    @Override
    public final String invalidMaxSize(final int size, final String name, final int maxSize) {
        return String.format(getLoggingLocale(), invalidMaxSize$str(), size, name, maxSize);
    }
    protected String invalidMinSize$str() {
        return "WFLYCTL0115: [%d] is an invalid size for parameter %s. A minimum length of [%d] is required";
    }
    @Override
    public final String invalidMinSize(final int size, final String name, final int minSize) {
        return String.format(getLoggingLocale(), invalidMinSize$str(), size, name, minSize);
    }
    protected String invalidMaxValue$str() {
        return "WFLYCTL0116: %d is an invalid value for parameter %s. A maximum value of %d is required";
    }
    @Override
    public final String invalidMaxValue(final int value, final String name, final int maxValue) {
        return String.format(getLoggingLocale(), invalidMaxValue$str(), value, name, maxValue);
    }
    @Override
    public final String invalidMaxValue(final long value, final String name, final long maxValue) {
        return String.format(getLoggingLocale(), invalidMaxValue$str(), value, name, maxValue);
    }
    protected String invalidMinValue$str() {
        return "WFLYCTL0117: %d is an invalid value for parameter %s. A minimum value of %d is required";
    }
    @Override
    public final String invalidMinValue(final int value, final String name, final int minValue) {
        return String.format(getLoggingLocale(), invalidMinValue$str(), value, name, minValue);
    }
    @Override
    public final String invalidMinValue(final long value, final String name, final long minValue) {
        return String.format(getLoggingLocale(), invalidMinValue$str(), value, name, minValue);
    }
    protected String invalidModificationAfterCompletedStep$str() {
        return "WFLYCTL0118: Invalid modification after completed step";
    }
    @Override
    public final IllegalStateException invalidModificationAfterCompletedStep() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidModificationAfterCompletedStep$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidMulticastAddress$str() {
        return "WFLYCTL0119: Value %s for attribute %s is not a valid multicast address";
    }
    @Override
    public final OperationFailedException invalidMulticastAddress(final String value, final String name) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidMulticastAddress$str(), value, name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidOutboundSocketBinding$str() {
        return "WFLYCTL0120: An outbound socket binding: %s cannot have both %s as well as a %s at the same time";
    }
    @Override
    public final XMLStreamException invalidOutboundSocketBinding(final String name, final String localTag, final String remoteTag, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), invalidOutboundSocketBinding$str(), name, localTag, remoteTag), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidParameterValue$str() {
        return "WFLYCTL0121: %s is not a valid value for parameter %s -- must be one of %s";
    }
    @Override
    public final IllegalArgumentException invalidParameterValue(final Flag flag, final String name, final Collection<Flag> validFlags) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidParameterValue$str(), flag, name, validFlags));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidSha1Value$str() {
        return "WFLYCTL0122: Value %s for attribute %s does not represent a properly hex-encoded SHA1 hash";
    }
    @Override
    public final XMLStreamException invalidSha1Value(final Throwable cause, final String value, final String name, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), invalidSha1Value$str(), value, name), location, cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidStage$str() {
        return "WFLYCTL0123: Stage %s is not valid for context process type %s";
    }
    @Override
    public final IllegalStateException invalidStage(final Stage stage, final ProcessType processType) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidStage$str(), stage, processType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidStepStage$str() {
        return "WFLYCTL0124: Invalid step stage specified";
    }
    @Override
    public final IllegalArgumentException invalidStepStage() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidStepStage$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidTableSize$str() {
        return "WFLYCTL0126: Can not have a negative size table!";
    }
    @Override
    public final IllegalArgumentException invalidTableSize() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidTableSize$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidType$str() {
        return "WFLYCTL0127: Invalid type %s";
    }
    @Override
    public final String invalidType(final ModelType type) {
        return String.format(getLoggingLocale(), invalidType$str(), type);
    }
    protected String invalidPathElementValue$str() {
        return "WFLYCTL0128: Invalid resource address element '%s'. The value '%s' is not valid for an element in a resource address. Character '%s' is not allowed.";
    }
    @Override
    public final String invalidPathElementValue(final String element, final String value, final Character character) {
        return String.format(getLoggingLocale(), invalidPathElementValue$str(), element, value, character);
    }
    protected String invalidValue$str() {
        return "WFLYCTL0129: Invalid value %s for %s; legal values are %s";
    }
    @Override
    public final String invalidValue(final String value, final String name, final Collection<?> validValues) {
        return String.format(getLoggingLocale(), invalidValue$str(), value, name, validValues);
    }
    protected String missingOneOf$str() {
        return "WFLYCTL0132: Must include one of the following elements: %s";
    }
    @Override
    public final XMLStreamException missingOneOf(final StringBuilder sb, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), missingOneOf$str(), sb), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingRequiredAttributes$str() {
        return "WFLYCTL0133: Missing required attribute(s): %s";
    }
    @Override
    public final XMLStreamException missingRequiredAttributes(final StringBuilder sb, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), missingRequiredAttributes$str(), sb), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingRequiredElements$str() {
        return "WFLYCTL0134: Missing required element(s): %s";
    }
    @Override
    public final XMLStreamException missingRequiredElements(final StringBuilder sb, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), missingRequiredElements$str(), sb), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String moduleLoadingInterrupted$str() {
        return "WFLYCTL0135: Interrupted awaiting loading of module %s";
    }
    @Override
    public final XMLStreamException moduleLoadingInterrupted(final String name) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), moduleLoadingInterrupted$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String moduleInitializationInterrupted$str() {
        return "WFLYCTL0136: Interrupted awaiting initialization of module %s";
    }
    @Override
    public final RuntimeException moduleInitializationInterrupted(final String name) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), moduleInitializationInterrupted$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleModelNodes$str() {
        return "WFLYCTL0137: Model contains multiple %s nodes";
    }
    @Override
    public final IllegalStateException multipleModelNodes(final String name) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), multipleModelNodes$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String namespaceAlreadyRegistered$str() {
        return "WFLYCTL0138: Namespace with prefix %s already registered with schema URI %s";
    }
    @Override
    public final String namespaceAlreadyRegistered(final String prefix, final String uri) {
        return String.format(getLoggingLocale(), namespaceAlreadyRegistered$str(), prefix, uri);
    }
    protected String namespaceNotFound$str() {
        return "WFLYCTL0139: No namespace with URI %s found";
    }
    @Override
    public final String namespaceNotFound(final String prefix) {
        return String.format(getLoggingLocale(), namespaceNotFound$str(), prefix);
    }
    protected String nestedElementNotAllowed$str() {
        return "WFLYCTL0140: Nested %s not allowed";
    }
    @Override
    public final String nestedElementNotAllowed(final Element element) {
        return String.format(getLoggingLocale(), nestedElementNotAllowed$str(), element);
    }
    protected String noActiveStep$str() {
        return "WFLYCTL0144: No active step";
    }
    @Override
    public final IllegalStateException noActiveStep() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noActiveStep$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noChildType$str() {
        return "WFLYCTL0147: No child type %s";
    }
    @Override
    public final OperationFailedRuntimeException noChildType(final String name) {
        final OperationFailedRuntimeException result = new OperationFailedRuntimeException(String.format(getLoggingLocale(), noChildType$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noInterfaceCriteria$str() {
        return "WFLYCTL0149: No interface criteria was provided";
    }
    @Override
    public final String noInterfaceCriteria() {
        return String.format(getLoggingLocale(), noInterfaceCriteria$str());
    }
    protected String noOperationHandler0$str() {
        return "WFLYCTL0150: No operation handler";
    }
    @Override
    public final String noOperationHandler() {
        return String.format(getLoggingLocale(), noOperationHandler0$str());
    }
    protected String notADirectory$str() {
        return "WFLYCTL0152: %s is not a directory";
    }
    @Override
    public final IllegalStateException notADirectory(final String path) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), notADirectory$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notFound$str() {
        return "WFLYCTL0153: No %s%s found for %s";
    }
    @Override
    public final IllegalStateException notFound(final String path, final String className, final String moduleName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), notFound$str(), path, className, moduleName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullAsynchronousExecutor$str() {
        return "WFLYCTL0154: Cannot execute asynchronous operation without an executor";
    }
    @Override
    public final IllegalStateException nullAsynchronousExecutor() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), nullAsynchronousExecutor$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullNotAllowed$str() {
        return "WFLYCTL0155: '%s' may not be null";
    }
    @Override
    public final OperationFailedException nullNotAllowed(final String name) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), nullNotAllowed$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String operation$str() {
        return "Operation %s";
    }
    @Override
    public final String operation(final String step) {
        return String.format(getLoggingLocale(), operation$str(), step);
    }
    protected String operationAlreadyComplete$str() {
        return "WFLYCTL0157: Operation already complete";
    }
    @Override
    public final IllegalStateException operationAlreadyComplete() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), operationAlreadyComplete$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String operationHandlerFailed$str() {
        return "WFLYCTL0158: Operation handler failed: %s";
    }
    @Override
    public final String operationHandlerFailed(final String msg) {
        return String.format(getLoggingLocale(), operationHandlerFailed$str(), msg);
    }
    protected String operationRollingBack$str() {
        return "WFLYCTL0160: Operation rolling back";
    }
    @Override
    public final String operationRollingBack() {
        return String.format(getLoggingLocale(), operationRollingBack$str());
    }
    protected String operationSucceeded$str() {
        return "WFLYCTL0161: Operation succeeded, committing";
    }
    @Override
    public final String operationSucceeded() {
        return String.format(getLoggingLocale(), operationSucceeded$str());
    }
    protected String operationNotRegistered$str() {
        return "WFLYCTL0162: There is no operation %s registered at address %s";
    }
    @Override
    public final String operationNotRegistered(final String op, final PathAddress address) {
        return String.format(getLoggingLocale(), operationNotRegistered$str(), op, address);
    }
    protected String persisterNotInjected$str() {
        return "WFLYCTL0165: No configuration persister was injected";
    }
    @Override
    public final StartException persisterNotInjected() {
        final StartException result = new StartException(String.format(getLoggingLocale(), persisterNotInjected$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String proxyHandlerAlreadyRegistered$str() {
        return "WFLYCTL0169: A proxy handler is already registered at location '%s'";
    }
    @Override
    public final IllegalArgumentException proxyHandlerAlreadyRegistered(final String location) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), proxyHandlerAlreadyRegistered$str(), location));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String removingServiceUnsatisfiedDependencies0$str() {
        return "WFLYCTL0171: Removing services has lead to unsatisfied dependencies:";
    }
    @Override
    public final String removingServiceUnsatisfiedDependencies() {
        return String.format(getLoggingLocale(), removingServiceUnsatisfiedDependencies0$str());
    }
    protected String removingServiceUnsatisfiedDependencies1$str() {
        return "%nService %s was depended upon by ";
    }
    @Override
    public final String removingServiceUnsatisfiedDependencies(final String name) {
        return String.format(getLoggingLocale(), removingServiceUnsatisfiedDependencies1$str(), name);
    }
    protected String required$str() {
        return "WFLYCTL0172: %s is required";
    }
    @Override
    public final OperationFailedException required(final String name) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), required$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String reserved$str() {
        return "WFLYCTL0173: %s is reserved";
    }
    @Override
    public final XMLStreamException reserved(final String name, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), reserved$str(), name), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String resourceNotFound$str() {
        return "WFLYCTL0175: Resource %s does not exist; a resource at address %s cannot be created until all ancestor resources have been added";
    }
    @Override
    public final OperationFailedRuntimeException resourceNotFound(final PathAddress ancestor, final PathAddress address) {
        final OperationFailedRuntimeException result = new OperationFailedRuntimeException(String.format(getLoggingLocale(), resourceNotFound$str(), ancestor, address));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String rollbackAlreadyInvoked$str() {
        return "WFLYCTL0176: rollback() has already been invoked";
    }
    @Override
    public final IllegalStateException rollbackAlreadyInvoked() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), rollbackAlreadyInvoked$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String schemaAlreadyRegistered$str() {
        return "WFLYCTL0177: Schema with URI %s already registered with location %s";
    }
    @Override
    public final String schemaAlreadyRegistered(final String schemaUri, final String location) {
        return String.format(getLoggingLocale(), schemaAlreadyRegistered$str(), schemaUri, location);
    }
    protected String schemaNotFound$str() {
        return "WFLYCTL0178: No schema location with URI %s found";
    }
    @Override
    public final String schemaNotFound(final String uri) {
        return String.format(getLoggingLocale(), schemaNotFound$str(), uri);
    }
    protected String serviceInstallCancelled$str() {
        return "WFLYCTL0179: Service install was cancelled";
    }
    @Override
    public final CancellationException serviceInstallCancelled() {
        final CancellationException result = new CancellationException(String.format(getLoggingLocale(), serviceInstallCancelled$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String servicesMissing$str() {
        return "is missing [%s]";
    }
    @Override
    public final String servicesMissing(final StringBuilder sb) {
        return String.format(getLoggingLocale(), servicesMissing$str(), sb);
    }
    protected String servicesMissingDependencies$str() {
        return "WFLYCTL0180: Services with missing/unavailable dependencies";
    }
    @Override
    public final String servicesMissingDependencies() {
        return String.format(getLoggingLocale(), servicesMissingDependencies$str());
    }
    protected String serviceRegistryRuntimeOperationsOnly$str() {
        return "WFLYCTL0181: Get service registry only supported in runtime operations";
    }
    @Override
    public final IllegalStateException serviceRegistryRuntimeOperationsOnly() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serviceRegistryRuntimeOperationsOnly$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serviceRemovalRuntimeOperationsOnly$str() {
        return "WFLYCTL0182: Service removal only supported in runtime operations";
    }
    @Override
    public final IllegalStateException serviceRemovalRuntimeOperationsOnly() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serviceRemovalRuntimeOperationsOnly$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serviceStatusReportHeader$str() {
        return "WFLYCTL0183: Service status report%n";
    }
    @Override
    public final String serviceStatusReportHeader() {
        return String.format(getLoggingLocale(), serviceStatusReportHeader$str());
    }
    protected String serviceStatusReportDependencies$str() {
        return "WFLYCTL0184:    New missing/unsatisfied dependencies:%n";
    }
    @Override
    public final String serviceStatusReportDependencies() {
        return String.format(getLoggingLocale(), serviceStatusReportDependencies$str());
    }
    protected String serviceStatusReportMissing$str() {
        return "      %s (missing) dependents: %s %n";
    }
    @Override
    public final String serviceStatusReportMissing(final ServiceName serviceName, final String dependents) {
        return String.format(getLoggingLocale(), serviceStatusReportMissing$str(), serviceName, dependents);
    }
    protected String serviceStatusReportCorrected$str() {
        return "WFLYCTL0185:    Newly corrected services:%n";
    }
    @Override
    public final String serviceStatusReportCorrected() {
        return String.format(getLoggingLocale(), serviceStatusReportCorrected$str());
    }
    protected String serviceStatusReportNoLongerRequired$str() {
        return "      %s (no longer required)%n";
    }
    @Override
    public final String serviceStatusReportNoLongerRequired(final ServiceName serviceName) {
        return String.format(getLoggingLocale(), serviceStatusReportNoLongerRequired$str(), serviceName);
    }
    protected String serviceStatusReportAvailable$str() {
        return "      %s (new available)%n";
    }
    @Override
    public final String serviceStatusReportAvailable(final ServiceName serviceName) {
        return String.format(getLoggingLocale(), serviceStatusReportAvailable$str(), serviceName);
    }
    protected String serviceStatusReportFailed$str() {
        return "WFLYCTL0186:   Services which failed to start:";
    }
    @Override
    public final String serviceStatusReportFailed() {
        return String.format(getLoggingLocale(), serviceStatusReportFailed$str());
    }
    protected String serviceTargetRuntimeOperationsOnly$str() {
        return "WFLYCTL0187: Get service target only supported in runtime operations";
    }
    @Override
    public final IllegalStateException serviceTargetRuntimeOperationsOnly() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serviceTargetRuntimeOperationsOnly$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String stageAlreadyComplete$str() {
        return "WFLYCTL0188: Stage %s is already complete";
    }
    @Override
    public final IllegalStateException stageAlreadyComplete(final Stage stage) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), stageAlreadyComplete$str(), stage));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String stepHandlerFailed$str() {
        return "WFLYCTL0190: Step handler %s for operation %s at address %s failed -- %s";
    }
    @Override
    public final String stepHandlerFailed(final OperationStepHandler handler, final String op, final PathAddress address, final Throwable cause) {
        return String.format(getLoggingLocale(), stepHandlerFailed$str(), handler, op, address, cause);
    }
    protected String subsystemBootInterrupted$str() {
        return "WFLYCTL0191: Interrupted awaiting subsystem boot operation execution";
    }
    @Override
    public final String subsystemBootInterrupted() {
        return String.format(getLoggingLocale(), subsystemBootInterrupted$str());
    }
    protected String subsystemBootOperationFailed$str() {
        return "WFLYCTL0192: Boot operations for subsystem %s failed without explanation";
    }
    @Override
    public final String subsystemBootOperationFailed(final String name) {
        return String.format(getLoggingLocale(), subsystemBootOperationFailed$str(), name);
    }
    protected String subsystemBootOperationFailedExecuting$str() {
        return "WFLYCTL0193: Failed executing subsystem %s boot operations";
    }
    @Override
    public final String subsystemBootOperationFailedExecuting(final String name) {
        return String.format(getLoggingLocale(), subsystemBootOperationFailedExecuting$str(), name);
    }
    protected String tableIsFull$str() {
        return "WFLYCTL0194: Table is full!";
    }
    @Override
    public final IllegalStateException tableIsFull() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), tableIsFull$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String transactionInterrupted$str() {
        return "WFLYCTL0195: Interrupted awaiting transaction commit or rollback";
    }
    @Override
    public final RuntimeException transactionInterrupted() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), transactionInterrupted$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedAttribute1$str() {
        return "WFLYCTL0197: Unexpected attribute '%s' encountered";
    }
    @Override
    public final XMLStreamException unexpectedAttribute(final QName name, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unexpectedAttribute1$str(), name), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedElement1$str() {
        return "WFLYCTL0198: Unexpected element '%s' encountered";
    }
    @Override
    public final XMLStreamException unexpectedElement(final QName name, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unexpectedElement1$str(), name), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedEndElement$str() {
        return "WFLYCTL0199: Unexpected end of element '%s' encountered";
    }
    @Override
    public final XMLStreamException unexpectedEndElement(final QName name, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unexpectedEndElement$str(), name), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownAttribute$str() {
        return "WFLYCTL0201: Unknown attribute '%s'";
    }
    @Override
    public final String unknownAttribute(final String name) {
        return String.format(getLoggingLocale(), unknownAttribute$str(), name);
    }
    protected String unknownChildType$str() {
        return "WFLYCTL0202: No known child type named %s";
    }
    @Override
    public final String unknownChildType(final String name) {
        return String.format(getLoggingLocale(), unknownChildType$str(), name);
    }
    protected String unknownCriteriaInterfaceProperty$str() {
        return "WFLYCTL0203: Unknown property in interface criteria list: %s";
    }
    @Override
    public final RuntimeException unknownCriteriaInterfaceProperty(final String name) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unknownCriteriaInterfaceProperty$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownCriteriaInterfaceType$str() {
        return "WFLYCTL0204: Unknown interface criteria type %s";
    }
    @Override
    public final String unknownCriteriaInterfaceType(final String type) {
        return String.format(getLoggingLocale(), unknownCriteriaInterfaceType$str(), type);
    }
    protected String unknownInterface$str() {
        return "WFLYCTL0205: Unknown interface %s %s must be declared in element %s";
    }
    @Override
    public final XMLStreamException unknownInterface(final String value, final String attributeName, final String elementName, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unknownInterface$str(), value, attributeName, elementName), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownValueForElement$str() {
        return "WFLYCTL0206: Unknown %s %s %s must be declared in element %s";
    }
    @Override
    public final XMLStreamException unknownValueForElement(final String elementName1, final String value, final String elementName2, final String parentElement, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unknownValueForElement$str(), elementName1, value, elementName2, parentElement), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String validationFailed$str() {
        return "WFLYCTL0207: Validation failed for %s";
    }
    @Override
    public final String validationFailed(final String name) {
        return String.format(getLoggingLocale(), validationFailed$str(), name);
    }
    protected String andNMore$str() {
        return "WFLYCTL0208: ... and %s more";
    }
    @Override
    public final String andNMore(final int number) {
        return String.format(getLoggingLocale(), andNMore$str(), number);
    }
    protected String invalidAttributeValue3$str() {
        return "WFLYCTL0209: Invalid value '%s' for attribute '%s' -- valid values are %s";
    }
    @Override
    public final XMLStreamException invalidAttributeValue(final String value, final QName name, final Set<String> validValues, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), invalidAttributeValue3$str(), value, name, validValues), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noPermissionToResolveExpression$str() {
        return "WFLYCTL0210: Caught SecurityException attempting to resolve expression '%s' -- %s";
    }
    @Override
    public final ExpressionResolutionUserException noPermissionToResolveExpression(final ModelNode toResolve, final SecurityException e) {
        final ExpressionResolutionUserException result = new ExpressionResolutionUserException(String.format(getLoggingLocale(), noPermissionToResolveExpression$str(), toResolve, e));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotResolveExpression$str() {
        return "WFLYCTL0211: Cannot resolve expression '%s'";
    }
    @Override
    public final ExpressionResolutionUserException cannotResolveExpression(final String toResolve) {
        final ExpressionResolutionUserException result = new ExpressionResolutionUserException(String.format(getLoggingLocale(), cannotResolveExpression$str(), toResolve));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateResourceAddress$str() {
        return "WFLYCTL0212: Duplicate resource %s";
    }
    @Override
    public final OperationFailedRuntimeException duplicateResourceAddress(final PathAddress address) {
        final OperationFailedRuntimeException result = new OperationFailedRuntimeException(String.format(getLoggingLocale(), duplicateResourceAddress$str(), address));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mainFileNotFound$str() {
        return "WFLYCTL0214: Could not load configuration file: %s. The configuration file argument must specify the path to a file located in the configuration directory. The path must be a relative path, and must be relative to the configuration directory %s.";
    }
    @Override
    public final IllegalStateException mainFileNotFound(final String name, final File configurationDir) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), mainFileNotFound$str(), name, configurationDir));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String absolutePathMainFileNotFound$str() {
        return "WFLYCTL0215: Could not load configuration file: %s. The configuration file argument must specify one of the following: 1) an absolute path to an existing file; 2) a relative path to an existing file, relative to the current working directory; or 3) a relative path to a file located in the configuration directory. In the latter case, it must be a path relative to the configuration directory %s.";
    }
    @Override
    public final IllegalStateException absolutePathMainFileNotFound(final String name, final File configurationDir) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), absolutePathMainFileNotFound$str(), name, configurationDir));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String managementResourceNotFound$str() {
        return "WFLYCTL0216: Management resource '%s' not found";
    }
    @Override
    public final NoSuchResourceException managementResourceNotFound(final PathAddress pathAddress) {
        final NoSuchResourceException result = new NoSuchResourceException(String.format(getLoggingLocale(), managementResourceNotFound$str(), pathAddress));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String childResourceNotFound$str() {
        return "WFLYCTL0217: Child resource '%s' not found";
    }
    @Override
    public final String childResourceNotFound(final PathElement childAddress) {
        return String.format(getLoggingLocale(), childResourceNotFound$str(), childAddress);
    }
    protected String nodeAlreadyRegistered$str() {
        return "WFLYCTL0218: A node is already registered at '%s'";
    }
    @Override
    public final IllegalArgumentException nodeAlreadyRegistered(final String location) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nodeAlreadyRegistered$str(), location));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String removingExtensionWithRegisteredSubsystem$str() {
        return "WFLYCTL0219: An attempt was made to unregister extension %s which still has subsystem %s registered";
    }
    @Override
    public final IllegalStateException removingExtensionWithRegisteredSubsystem(final String moduleName, final String subsystem) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), removingExtensionWithRegisteredSubsystem$str(), moduleName, subsystem));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotOverrideRootRegistration$str() {
        return "WFLYCTL0220: An override model registration is not allowed for the root model registration";
    }
    @Override
    public final IllegalStateException cannotOverrideRootRegistration() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotOverrideRootRegistration$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotOverrideNonWildCardRegistration$str() {
        return "WFLYCTL0221: An override model registration is not allowed for non-wildcard model registrations. This registration is for the non-wildcard name '%s'.";
    }
    @Override
    public final IllegalStateException cannotOverrideNonWildCardRegistration(final String valueName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotOverrideNonWildCardRegistration$str(), valueName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String wildcardRegistrationIsNotAnOverride$str() {
        return "WFLYCTL0222: A registration named '*' is not an override model and cannot be unregistered via the unregisterOverrideModel API.";
    }
    @Override
    public final IllegalArgumentException wildcardRegistrationIsNotAnOverride() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), wildcardRegistrationIsNotAnOverride$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String rootRegistrationIsNotOverridable$str() {
        return "WFLYCTL0223: The root resource registration does not support overrides, so no override can be removed.";
    }
    @Override
    public final IllegalStateException rootRegistrationIsNotOverridable() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), rootRegistrationIsNotOverridable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String operationNotRegisteredException$str() {
        return "WFLYCTL0224: There is no operation %s registered at address %s";
    }
    @Override
    public final IllegalArgumentException operationNotRegisteredException(final String op, final PathAddress address) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), operationNotRegisteredException$str(), op, address));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToRecoverServices$str() {
        return "WFLYCTL0225: Failed to recover services during operation rollback";
    }
    @Override
    public final RuntimeException failedToRecoverServices(final OperationFailedException cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToRecoverServices$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateSubsystem$str() {
        return "WFLYCTL0226: A subsystem named '%s' cannot be registered by extension '%s' -- a subsystem with that name has already been registered by extension '%s'.";
    }
    @Override
    public final IllegalStateException duplicateSubsystem(final String subsystemName, final String duplicatingModule, final String existingModule) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), duplicateSubsystem$str(), subsystemName, duplicatingModule, existingModule));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String validationFailedOperationHasNoField$str() {
        return "WFLYCTL0227: Operation has no '%s' field. %s";
    }
    @Override
    public final IllegalArgumentException validationFailedOperationHasNoField(final String field, final String operation) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), validationFailedOperationHasNoField$str(), field, operation));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String validationFailedOperationHasANullOrEmptyName$str() {
        return "WFLYCTL0228: Operation has a null or empty name. %s";
    }
    @Override
    public final IllegalArgumentException validationFailedOperationHasANullOrEmptyName(final String operation) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), validationFailedOperationHasANullOrEmptyName$str(), operation));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String validationFailedNoOperationFound$str() {
        return "WFLYCTL0229: No operation called '%s' at '%s'. %s";
    }
    @Override
    public final IllegalArgumentException validationFailedNoOperationFound(final String name, final PathAddress address, final String operation) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), validationFailedNoOperationFound$str(), name, address, operation));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String validationFailedActualParameterNotDescribed$str() {
        return "WFLYCTL0230: Operation contains a parameter '%s' which is not one of the expected parameters %s. %s";
    }
    @Override
    public final IllegalArgumentException validationFailedActualParameterNotDescribed(final String paramName, final Set<String> parameterNames, final String operation) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), validationFailedActualParameterNotDescribed$str(), paramName, parameterNames, operation));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String validationFailedRequiredParameterNotPresent$str() {
        return "WFLYCTL0231: Required parameter %s is not present. %s";
    }
    @Override
    public final IllegalArgumentException validationFailedRequiredParameterNotPresent(final String paramName, final String operation) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), validationFailedRequiredParameterNotPresent$str(), paramName, operation));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String validationFailedRequiredParameterPresentAsWellAsAlternative$str() {
        return "WFLYCTL0232: Alternative parameter '%s' for required parameter '%s' was used. Please use one or the other. %s";
    }
    @Override
    public final IllegalArgumentException validationFailedRequiredParameterPresentAsWellAsAlternative(final String alternative, final String paramName, final String operation) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), validationFailedRequiredParameterPresentAsWellAsAlternative$str(), alternative, paramName, operation));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String validationFailedCouldNotConvertParamToType$str() {
        return "WFLYCTL0233: Could not convert the parameter '%s' to a %s. %s";
    }
    @Override
    public final IllegalArgumentException validationFailedCouldNotConvertParamToType(final String paramName, final ModelType type, final String operation) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), validationFailedCouldNotConvertParamToType$str(), paramName, type, operation));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String validationFailedValueIsSmallerThanMin$str() {
        return "WFLYCTL0234: The value '%s' passed in for '%s' is smaller than the minimum value '%s'. %s";
    }
    @Override
    public final IllegalArgumentException validationFailedValueIsSmallerThanMin(final Number value, final String paramName, final Number min, final String operation) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), validationFailedValueIsSmallerThanMin$str(), value, paramName, min, operation));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String validationFailedValueIsGreaterThanMax$str() {
        return "WFLYCTL0235: The value '%s' passed in for '%s' is bigger than the maximum value '%s'. %s";
    }
    @Override
    public final IllegalArgumentException validationFailedValueIsGreaterThanMax(final Number value, final String paramName, final Number max, final String operation) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), validationFailedValueIsGreaterThanMax$str(), value, paramName, max, operation));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String validationFailedValueIsShorterThanMinLength$str() {
        return "WFLYCTL0236: The value '%s' passed in for '%s' is shorter than the minimum length '%s'. %s";
    }
    @Override
    public final IllegalArgumentException validationFailedValueIsShorterThanMinLength(final Object value, final String paramName, final Object minLength, final String operation) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), validationFailedValueIsShorterThanMinLength$str(), value, paramName, minLength, operation));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String validationFailedValueIsLongerThanMaxLength$str() {
        return "WFLYCTL0237: The value '%s' passed in for '%s' is longer than the maximum length '%s'. %s";
    }
    @Override
    public final IllegalArgumentException validationFailedValueIsLongerThanMaxLength(final Object value, final String paramName, final Object maxLength, final String operation) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), validationFailedValueIsLongerThanMaxLength$str(), value, paramName, maxLength, operation));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String validationFailedInvalidElementType$str() {
        return "WFLYCTL0238: %s is expected to be a list of %s. %s";
    }
    @Override
    public final IllegalArgumentException validationFailedInvalidElementType(final String paramName, final ModelType elementType, final String operation) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), validationFailedInvalidElementType$str(), paramName, elementType, operation));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidDescriptionRequiredFlagIsNotABoolean$str() {
        return "WFLYCTL0239: 'required' parameter: '%s' must be a boolean in the description of the operation at %s: %s";
    }
    @Override
    public final String invalidDescriptionRequiredFlagIsNotABoolean(final String paramName, final PathAddress address, final ModelNode description) {
        return String.format(getLoggingLocale(), invalidDescriptionRequiredFlagIsNotABoolean$str(), paramName, address, description);
    }
    protected String invalidDescriptionUndefinedRequestProperty$str() {
        return "WFLYCTL0240: Undefined request property '%s' in description of the operation at %s: %s";
    }
    @Override
    public final String invalidDescriptionUndefinedRequestProperty(final String name, final PathAddress address, final ModelNode description) {
        return String.format(getLoggingLocale(), invalidDescriptionUndefinedRequestProperty$str(), name, address, description);
    }
    protected String invalidDescriptionNoParamTypeInDescription$str() {
        return "WFLYCTL0241: There is no type for parameter '%s' in the description of the operation at %s: %s";
    }
    @Override
    public final String invalidDescriptionNoParamTypeInDescription(final String paramName, final PathAddress address, final ModelNode description) {
        return String.format(getLoggingLocale(), invalidDescriptionNoParamTypeInDescription$str(), paramName, address, description);
    }
    protected String invalidDescriptionInvalidParamTypeInDescription$str() {
        return "WFLYCTL0242: Could not determine the type of parameter '%s' in the description of the operation at %s: %s";
    }
    @Override
    public final String invalidDescriptionInvalidParamTypeInDescription(final String paramName, final PathAddress address, final ModelNode description) {
        return String.format(getLoggingLocale(), invalidDescriptionInvalidParamTypeInDescription$str(), paramName, address, description);
    }
    protected String invalidDescriptionMinMaxForParameterHasWrongType$str() {
        return "WFLYCTL0243: The '%s' attribute of the '%s' parameter can not be converted to its type: %s in the description of the operation at %s: %s";
    }
    @Override
    public final String invalidDescriptionMinMaxForParameterHasWrongType(final String minOrMax, final String paramName, final ModelType expectedType, final PathAddress address, final ModelNode description) {
        return String.format(getLoggingLocale(), invalidDescriptionMinMaxForParameterHasWrongType$str(), minOrMax, paramName, expectedType, address, description);
    }
    protected String invalidDescriptionMinMaxLengthForParameterHasWrongType$str() {
        return "WFLYCTL0244: The '%s' attribute of the '%s' parameter can not be converted to an integer in the description of the operation at %s: %s";
    }
    @Override
    public final String invalidDescriptionMinMaxLengthForParameterHasWrongType(final String minOrMaxLength, final String paramName, final PathAddress address, final ModelNode description) {
        return String.format(getLoggingLocale(), invalidDescriptionMinMaxLengthForParameterHasWrongType$str(), minOrMaxLength, paramName, address, description);
    }
    protected String invalidPort$str() {
        return "WFLYCTL0245: Illegal '%s' value %s -- must be a valid port number";
    }
    @Override
    public final XMLStreamException invalidPort(final String name, final String value, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), invalidPort$str(), name, value), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotResolveProcessUUID$str() {
        return "WFLYCTL0246: Cannot resolve the localhost address to create a UUID-based name for this process";
    }
    @Override
    public final RuntimeException cannotResolveProcessUUID(final UnknownHostException cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotResolveProcessUUID$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String useOperationContextRemoveService$str() {
        return "WFLYCTL0247: Do not call ServiceController.setMode(REMOVE), use OperationContext.removeService() instead.";
    }
    @Override
    public final IllegalStateException useOperationContextRemoveService() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), useOperationContextRemoveService$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidEnumValue$str() {
        return "WFLYCTL0248: Invalid value %s for %s; legal values are %s";
    }
    @Override
    public final OperationFailedException invalidEnumValue(final String value, final String parameterName, final Set<?> allowedValues) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidEnumValue$str(), value, parameterName, allowedValues));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String modelUpdateNotAuthorized$str() {
        return "WFLYCTL0249: Operation '%s' targeted at resource '%s' was directly invoked by a user. User operations are not permitted to directly update the persistent configuration of a server in a managed domain.";
    }
    @Override
    public final OperationFailedRuntimeException modelUpdateNotAuthorized(final String operation, final PathAddress address) {
        final OperationFailedRuntimeException result = new OperationFailedRuntimeException(String.format(getLoggingLocale(), modelUpdateNotAuthorized$str(), operation, address));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverResultsAccessNotAllowed$str() {
        return "WFLYCTL0250: An operation handler attempted to access the operation response server results object on a process type other than '%s'. The current process type is '%s'";
    }
    @Override
    public final IllegalStateException serverResultsAccessNotAllowed(final ProcessType validType, final ProcessType processType) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serverResultsAccessNotAllowed$str(), validType, processType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cantHaveBothLoopbackAndInetAddressCriteria$str() {
        return "WFLYCTL0251: Can't have both loopback and inet-address criteria";
    }
    @Override
    public final String cantHaveBothLoopbackAndInetAddressCriteria() {
        return String.format(getLoggingLocale(), cantHaveBothLoopbackAndInetAddressCriteria$str());
    }
    protected String cantHaveSameCriteriaForBothNotAndInclusion$str() {
        return "WFLYCTL0253: Can't have same criteria for both not and inclusion %s";
    }
    @Override
    public final String cantHaveSameCriteriaForBothNotAndInclusion(final InterfaceCriteria interfaceCriteria) {
        return String.format(getLoggingLocale(), cantHaveSameCriteriaForBothNotAndInclusion$str(), interfaceCriteria);
    }
    protected String nonexistentInterface$str() {
        return "WFLYCTL0254: Invalid value '%s' for attribute '%s' -- no interface configuration with that name exists";
    }
    @Override
    public final OperationFailedException nonexistentInterface(final String attributeValue, final String attributeName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), nonexistentInterface$str(), attributeValue, attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String pathEntryNotFound$str() {
        return "WFLYCTL0256: Could not find a path called '%s'";
    }
    @Override
    public final IllegalArgumentException pathEntryNotFound(final String pathName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), pathEntryNotFound$str(), pathName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String pathEntryIsReadOnly$str() {
        return "WFLYCTL0257: Path entry is read-only: '%s'";
    }
    @Override
    public final IllegalArgumentException pathEntryIsReadOnly(final String pathName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), pathEntryIsReadOnly$str(), pathName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String pathEntryAlreadyExists$str() {
        return "WFLYCTL0258: There is already a path entry called: '%s'";
    }
    @Override
    public final IllegalArgumentException pathEntryAlreadyExists(final String pathName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), pathEntryAlreadyExists$str(), pathName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidRelativePathValue$str() {
        return "WFLYCTL0260: Invalid relativePath value '%s'";
    }
    @Override
    public final IllegalArgumentException invalidRelativePathValue(final String relativePath) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidRelativePathValue$str(), relativePath));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String pathIsAWindowsAbsolutePath$str() {
        return "WFLYCTL0261: '%s' is a Windows absolute path";
    }
    @Override
    public final IllegalArgumentException pathIsAWindowsAbsolutePath(final String path) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), pathIsAWindowsAbsolutePath$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemoveReadOnlyPath$str() {
        return "WFLYCTL0262: Path '%s' is read-only; it cannot be removed";
    }
    @Override
    public final OperationFailedException cannotRemoveReadOnlyPath(final String pathName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotRemoveReadOnlyPath$str(), pathName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotModifyReadOnlyPath$str() {
        return "WFLYCTL0263: Path '%s' is read-only; it cannot be modified";
    }
    @Override
    public final OperationFailedException cannotModifyReadOnlyPath(final String pathName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotModifyReadOnlyPath$str(), pathName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String expressionNotAllowed$str() {
        return "WFLYCTL0264: %s may not be ModelType.EXPRESSION";
    }
    @Override
    public final OperationFailedException expressionNotAllowed(final String name) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), expressionNotAllowed$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String pathManagerNotAvailable$str() {
        return "WFLYCTL0265: PathManager not available on processes of type '%s'";
    }
    @Override
    public final IllegalStateException pathManagerNotAvailable(final ProcessType processType) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), pathManagerNotAvailable$str(), processType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownMulticastAddress$str() {
        return "WFLYCTL0266: Value %s for attribute %s is not a valid multicast address";
    }
    @Override
    public final OperationFailedException unknownMulticastAddress(final UnknownHostException cause, final String value, final String name) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unknownMulticastAddress$str(), value, name), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemovePathWithDependencies$str() {
        return "WFLYCTL0267: Path '%s' cannot be removed, since the following paths depend on it: %s";
    }
    @Override
    public final OperationFailedException cannotRemovePathWithDependencies(final String pathName, final Set<String> dependencies) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotRemovePathWithDependencies$str(), pathName, dependencies));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToRenameTempFile$str() {
        return "WFLYCTL0268: Failed to rename temp file %s to %s";
    }
    @Override
    public final ConfigurationPersistenceException failedToRenameTempFile(final Throwable cause, final File temp, final File file) {
        final ConfigurationPersistenceException result = new ConfigurationPersistenceException(String.format(getLoggingLocale(), failedToRenameTempFile$str(), temp, file), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidLocaleString$str() {
        return "WFLYCTL0269: Invalid locale format:  %s";
    }
    @Override
    public final String invalidLocaleString(final String unparsed) {
        return String.format(getLoggingLocale(), invalidLocaleString$str(), unparsed);
    }
    protected String operationCancelled$str() {
        return "WFLYCTL0271: Operation cancelled";
    }
    @Override
    public final String operationCancelled() {
        return String.format(getLoggingLocale(), operationCancelled$str());
    }
    protected String operationCancelledAsynchronously$str() {
        return "WFLYCTL0272: Operation cancelled asynchronously";
    }
    @Override
    public final OperationCancellationException operationCancelledAsynchronously() {
        final OperationCancellationException result = new OperationCancellationException(String.format(getLoggingLocale(), operationCancelledAsynchronously$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String streamWasKilled$str() {
        return "WFLYCTL0273: Stream was killed";
    }
    @Override
    public final IOException streamWasKilled() {
        final IOException result = new IOException(String.format(getLoggingLocale(), streamWasKilled$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String streamWasClosed$str() {
        return "WFLYCTL0274: Stream was closed";
    }
    @Override
    public final IOException streamWasClosed() {
        final IOException result = new IOException(String.format(getLoggingLocale(), streamWasClosed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotHaveBothParameters$str() {
        return "WFLYCTL0275: Cannot define both '%s' and '%s'";
    }
    @Override
    public final OperationFailedException cannotHaveBothParameters(final String nameA, final String name2) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotHaveBothParameters$str(), nameA, name2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotDeleteFile$str() {
        return "WFLYCTL0276: Failed to delete file %s";
    }
    @Override
    public final IllegalStateException couldNotDeleteFile(final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotDeleteFile$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String aliasAlreadyRegistered$str() {
        return "WFLYCTL0277: An alias is already registered at location '%s'";
    }
    @Override
    public final IllegalArgumentException aliasAlreadyRegistered(final String location) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), aliasAlreadyRegistered$str(), location));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String aliasTargetResourceRegistrationNotFound$str() {
        return "WFLYCTL0279: Alias target address not found: %s";
    }
    @Override
    public final IllegalArgumentException aliasTargetResourceRegistrationNotFound(final PathAddress targetAddress) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), aliasTargetResourceRegistrationNotFound$str(), targetAddress));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String aliasStepHandlerOperationNotFound$str() {
        return "WFLYCTL0280: No operation called '%s' found for alias address '%s' which maps to '%s'";
    }
    @Override
    public final IllegalArgumentException aliasStepHandlerOperationNotFound(final String name, final PathAddress aliasAddress, final PathAddress targetAddress) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), aliasStepHandlerOperationNotFound$str(), name, aliasAddress, targetAddress));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String resourceRegistrationIsNotAnAlias$str() {
        return "WFLYCTL0281: Resource registration is not an alias";
    }
    @Override
    public final IllegalStateException resourceRegistrationIsNotAnAlias() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), resourceRegistrationIsNotAnAlias$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String modelFieldsNotKnown$str() {
        return "WFLYCTL0282: Model contains fields that are not known in definition, fields: %s, path: %s";
    }
    @Override
    public final RuntimeException modelFieldsNotKnown(final Set<String> fields, final PathAddress address) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), modelFieldsNotKnown$str(), fields, address));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotMarshalAttributeAsElement$str() {
        return "WFLYCTL0283: Could not marshal attribute as element: %s";
    }
    @Override
    public final UnsupportedOperationException couldNotMarshalAttributeAsElement(final String attributeName) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), couldNotMarshalAttributeAsElement$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotMarshalAttributeAsAttribute$str() {
        return "WFLYCTL0284: Could not marshal attribute as attribute: %s";
    }
    @Override
    public final UnsupportedOperationException couldNotMarshalAttributeAsAttribute(final String attributeName) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), couldNotMarshalAttributeAsAttribute$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String wildcardOperationFailedAtSingleAddress$str() {
        return "WFLYCTL0285: Operation %s invoked against multiple target addresses failed at address %s with failure description %s";
    }
    @Override
    public final String wildcardOperationFailedAtSingleAddress(final String operation, final PathAddress address, final String failureMessage) {
        return String.format(getLoggingLocale(), wildcardOperationFailedAtSingleAddress$str(), operation, address, failureMessage);
    }
    protected String wildcardOperationFailedAtSingleAddressWithComplexFailure$str() {
        return "WFLYCTL0286: Operation %s invoked against multiple target addresses failed at address %s. See the operation result for details.";
    }
    @Override
    public final String wildcardOperationFailedAtSingleAddressWithComplexFailure(final String operation, final PathAddress address) {
        return String.format(getLoggingLocale(), wildcardOperationFailedAtSingleAddressWithComplexFailure$str(), operation, address);
    }
    protected String wildcardOperationFailedAtMultipleAddresses$str() {
        return "WFLYCTL0287: Operation %s invoked against multiple target addresses failed at addresses %s. See the operation result for details.";
    }
    @Override
    public final String wildcardOperationFailedAtMultipleAddresses(final String operation, final Set<PathAddress> addresses) {
        return String.format(getLoggingLocale(), wildcardOperationFailedAtMultipleAddresses$str(), operation, addresses);
    }
    protected String missingTransitiveDependencyProblem$str() {
        return "WFLYCTL0288: One or more services were unable to start due to one or more indirect dependencies not being available.";
    }
    @Override
    public final String missingTransitiveDependencyProblem() {
        return String.format(getLoggingLocale(), missingTransitiveDependencyProblem$str());
    }
    protected String missingTransitiveDependents$str() {
        return "Services that were unable to start:";
    }
    @Override
    public final String missingTransitiveDependents() {
        return String.format(getLoggingLocale(), missingTransitiveDependents$str());
    }
    protected String missingTransitiveDependencies$str() {
        return "Services that may be the cause:";
    }
    @Override
    public final String missingTransitiveDependencies() {
        return String.format(getLoggingLocale(), missingTransitiveDependencies$str());
    }
    protected String noOperationEntry$str() {
        return "WFLYCTL0289: No operation entry called '%s' registered at '%s'";
    }
    @Override
    public final String noOperationEntry(final String op, final PathAddress pathAddress) {
        return String.format(getLoggingLocale(), noOperationEntry$str(), op, pathAddress);
    }
    protected String noOperationHandler2$str() {
        return "WFLYCTL0290: No operation handler called '%s' registered at '%s'";
    }
    @Override
    public final String noOperationHandler(final String op, final PathAddress pathAddress) {
        return String.format(getLoggingLocale(), noOperationHandler2$str(), op, pathAddress);
    }
    protected String noPathToResolve$str() {
        return "WFLYCTL0291: There is no registered path to resolve with path attribute '%s' and/or relative-to attribute '%s on: %s";
    }
    @Override
    public final IllegalStateException noPathToResolve(final String pathAttributeName, final String relativeToAttributeName, final ModelNode model) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noPathToResolve$str(), pathAttributeName, relativeToAttributeName, model));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String attributesDontSupportExpressions$str() {
        return "WFLYCTL0292: Attributes do not support expressions in the target model version and this resource will need to be ignored on the target host.";
    }
    @Override
    public final String attributesDontSupportExpressions() {
        return String.format(getLoggingLocale(), attributesDontSupportExpressions$str());
    }
    protected String attributesAreNotUnderstoodAndMustBeIgnored0$str() {
        return "WFLYCTL0293: Attributes are not understood in the target model version and this resource will need to be ignored on the target host.";
    }
    @Override
    public final String attributesAreNotUnderstoodAndMustBeIgnored() {
        return String.format(getLoggingLocale(), attributesAreNotUnderstoodAndMustBeIgnored0$str());
    }
    protected String transformerLoggerCoreModelResourceTransformerAttributes$str() {
        return "WFLYCTL0294: Transforming resource %s to core model version '%s' -- %s %s";
    }
    @Override
    public final String transformerLoggerCoreModelResourceTransformerAttributes(final PathAddress pathAddress, final ModelVersion modelVersion, final String attributeNames, final String message) {
        return String.format(getLoggingLocale(), transformerLoggerCoreModelResourceTransformerAttributes$str(), pathAddress, modelVersion, attributeNames, message);
    }
    protected String transformerLoggerCoreModelOperationTransformerAttributes$str() {
        return "WFLYCTL0295: Transforming operation %s at resource %s to core model version '%s' -- %s %s";
    }
    @Override
    public final String transformerLoggerCoreModelOperationTransformerAttributes(final ModelNode op, final PathAddress pathAddress, final ModelVersion modelVersion, final String attributeNames, final String message) {
        return String.format(getLoggingLocale(), transformerLoggerCoreModelOperationTransformerAttributes$str(), op, pathAddress, modelVersion, attributeNames, message);
    }
    protected String transformerLoggerSubsystemModelResourceTransformerAttributes$str() {
        return "WFLYCTL0296: Transforming resource %s to subsystem '%s' model version '%s' -- %s %s";
    }
    @Override
    public final String transformerLoggerSubsystemModelResourceTransformerAttributes(final PathAddress pathAddress, final String subsystem, final ModelVersion modelVersion, final String attributeNames, final String message) {
        return String.format(getLoggingLocale(), transformerLoggerSubsystemModelResourceTransformerAttributes$str(), pathAddress, subsystem, modelVersion, attributeNames, message);
    }
    protected String transformerLoggerSubsystemModelOperationTransformerAttributes$str() {
        return "WFLYCTL0297: Transforming operation %s at resource %s to subsystem '%s' model version '%s' -- %s %s";
    }
    @Override
    public final String transformerLoggerSubsystemModelOperationTransformerAttributes(final ModelNode op, final PathAddress pathAddress, final String subsystem, final ModelVersion modelVersion, final String attributeNames, final String message) {
        return String.format(getLoggingLocale(), transformerLoggerSubsystemModelOperationTransformerAttributes$str(), op, pathAddress, subsystem, modelVersion, attributeNames, message);
    }
    protected String illegalUnresolvedModel$str() {
        return "WFLYCTL0298: Node contains an unresolved expression %s -- a resolved model is required";
    }
    @Override
    public final OperationFailedException illegalUnresolvedModel(final String expression) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), illegalUnresolvedModel$str(), expression));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String rejectAttributesCoreModelResourceTransformer$str() {
        return "WFLYCTL0299: Transforming resource %s for host controller '%s' to core model version '%s' -- there were problems with some of the attributes and this resource will need to be ignored on that host. Details of the problems: %s";
    }
    @Override
    public final OperationFailedException rejectAttributesCoreModelResourceTransformer(final PathAddress pathAddress, final String legacyHostName, final ModelVersion modelVersion, final List<String> details) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), rejectAttributesCoreModelResourceTransformer$str(), pathAddress, legacyHostName, modelVersion, details));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String rejectAttributesSubsystemModelResourceTransformer$str() {
        return "WFLYCTL0300: Transforming resource %s for host controller '%s' to subsystem '%s' model version '%s' --there were problems with some of the attributes and this resource will need to be ignored on that host. Details of problems: %s";
    }
    @Override
    public final OperationFailedException rejectAttributesSubsystemModelResourceTransformer(final PathAddress pathAddress, final String legacyHostName, final String subsystem, final ModelVersion modelVersion, final List<String> details) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), rejectAttributesSubsystemModelResourceTransformer$str(), pathAddress, legacyHostName, subsystem, modelVersion, details));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String attributesDoNotSupportExpressions$str() {
        return "WFLYCTL0301: The following attributes do not support expressions: %s";
    }
    @Override
    public final String attributesDoNotSupportExpressions(final Set<String> attributeNames) {
        return String.format(getLoggingLocale(), attributesDoNotSupportExpressions$str(), attributeNames);
    }
    protected String attributeNames$str() {
        return "attributes %s";
    }
    @Override
    public final String attributeNames(final Set<String> attributes) {
        return String.format(getLoggingLocale(), attributeNames$str(), attributes);
    }
    protected String attributesAreNotUnderstoodAndMustBeIgnored1$str() {
        return "WFLYCTL0302: The following attributes are not understood in the target model version and this resource will need to be ignored on the target host: %s";
    }
    @Override
    public final String attributesAreNotUnderstoodAndMustBeIgnored(final Set<String> attributeNames) {
        return String.format(getLoggingLocale(), attributesAreNotUnderstoodAndMustBeIgnored1$str(), attributeNames);
    }
    protected String rejectedResourceResourceTransformation$str() {
        return "WFLYCTL0303: Resource %s is rejected on the target host, and will need to be ignored on the host";
    }
    @Override
    public final String rejectedResourceResourceTransformation(final PathAddress address) {
        return String.format(getLoggingLocale(), rejectedResourceResourceTransformation$str(), address);
    }
    protected String rejectResourceOperationTransformation$str() {
        return "WFLYCTL0304: Operation %2$s at %1s is rejected on the target host and will need to be ignored on the host";
    }
    @Override
    public final String rejectResourceOperationTransformation(final PathAddress address, final ModelNode operation) {
        return String.format(getLoggingLocale(), rejectResourceOperationTransformation$str(), address, operation);
    }
    protected String discoveryOptionsMustBeDeclared$str() {
        return "WFLYCTL0305: Unless the Host Controller is started with command line option %s and the %s attribute is not set to %s, %s must be declared or the %s and the %s need to be provided.";
    }
    @Override
    public final XMLStreamException discoveryOptionsMustBeDeclared(final String adminOnlyCmd, final String policyAttribute, final String fetchValue, final String discoveryOptionsName, final String hostName, final String portName, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), discoveryOptionsMustBeDeclared$str(), adminOnlyCmd, policyAttribute, fetchValue, discoveryOptionsName, hostName, portName), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String readOnlyContext$str() {
        return "WFLYCTL0306: read only context";
    }
    @Override
    public final IllegalStateException readOnlyContext() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), readOnlyContext$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotGetControllerLock$str() {
        return "WFLYCTL0307: We are trying to read data from the domain controller, which is currently busy executing another set of operations. This is a temporary situation, please retry";
    }
    @Override
    public final String cannotGetControllerLock() {
        return String.format(getLoggingLocale(), cannotGetControllerLock$str());
    }
    protected String unsupportedLegacyExtension$str() {
        return "WFLYCTL0309: Legacy extension '%s' is not supported on servers running this version. The extension is only supported for use by hosts running a previous release in a mixed-version managed domain";
    }
    @Override
    public final String unsupportedLegacyExtension(final String extensionName) {
        return String.format(getLoggingLocale(), unsupportedLegacyExtension$str(), extensionName);
    }
    protected String extensionModuleNotFound$str() {
        return "WFLYCTL0310: Extension module %s not found";
    }
    @Override
    public final OperationFailedRuntimeException extensionModuleNotFound(final ModuleNotFoundException cause, final String module) {
        final OperationFailedRuntimeException result = new OperationFailedRuntimeException(String.format(getLoggingLocale(), extensionModuleNotFound$str(), module));
        result.initCause(cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String extensionModuleLoadingFailure$str() {
        return "WFLYCTL0311: Failed to load Extension module %s";
    }
    @Override
    public final RuntimeException extensionModuleLoadingFailure(final ModuleLoadException cause, final String module) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), extensionModuleLoadingFailure$str(), module), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noContextToDelegateTo$str() {
        return "WFLYCTL0312: no context to delegate with id: %s";
    }
    @Override
    public final IllegalStateException noContextToDelegateTo(final int operationId) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noContextToDelegateTo$str(), operationId));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unauthorized$str() {
        return "WFLYCTL0313: Unauthorized to execute operation '%s' for resource '%s' -- %s";
    }
    @Override
    public final UnauthorizedException unauthorized(final String name, final PathAddress address, final ModelNode explanation) {
        final UnauthorizedException result = new UnauthorizedException(String.format(getLoggingLocale(), unauthorized$str(), name, address, explanation));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalMultipleRoles$str() {
        return "WFLYCTL0314: Users with multiple roles are not allowed";
    }
    @Override
    public final SecurityException illegalMultipleRoles() {
        final SecurityException result = new SecurityException(String.format(getLoggingLocale(), illegalMultipleRoles$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noHandlerCalled$str() {
        return "WFLYCTL0317: There is no handler called '%s'";
    }
    @Override
    public final IllegalStateException noHandlerCalled(final String name) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noHandlerCalled$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String operationContextIsNotAbstractOperationContext$str() {
        return "WFLYCTL0318: The operation context is not an AbstractOperationContext";
    }
    @Override
    public final OperationFailedException operationContextIsNotAbstractOperationContext() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), operationContextIsNotAbstractOperationContext$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String handlerIsReferencedBy$str() {
        return "WFLYCTL0319: The handler is referenced by %s and so cannot be removed";
    }
    @Override
    public final IllegalStateException handlerIsReferencedBy(final Set<PathAddress> references) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), handlerIsReferencedBy$str(), references));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String resolvedFileDoesNotExistOrIsDirectory$str() {
        return "WFLYCTL0320: The resolved file %s either does not exist or is a directory";
    }
    @Override
    public final IllegalStateException resolvedFileDoesNotExistOrIsDirectory(final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), resolvedFileDoesNotExistOrIsDirectory$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotBackUp$str() {
        return "WFLYCTL0321: Could not back up '%s' to '%s'";
    }
    @Override
    public final IllegalStateException couldNotBackUp(final IOException cause, final String absolutePath, final String absolutePath1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotBackUp$str(), absolutePath, absolutePath1), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String attemptToBothRemoveAndAddHandlerUpdateInstead$str() {
        return "WFLYCTL0322: Attempt was made to both remove and add a handler from a composite operation - update the handler instead";
    }
    @Override
    public final IllegalStateException attemptToBothRemoveAndAddHandlerUpdateInstead() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), attemptToBothRemoveAndAddHandlerUpdateInstead$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String attemptToBothAddAndRemoveAndHandlerFromCompositeOperation$str() {
        return "WFLYCTL0323: Attempt was made to both add and remove a handler from a composite operation";
    }
    @Override
    public final IllegalStateException attemptToBothAddAndRemoveAndHandlerFromCompositeOperation() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), attemptToBothAddAndRemoveAndHandlerFromCompositeOperation$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String attemptToBothUpdateAndRemoveHandlerFromCompositeOperation$str() {
        return "WFLYCTL0324: Attempt was made to both update and remove a handler from a composite operation";
    }
    @Override
    public final IllegalStateException attemptToBothUpdateAndRemoveHandlerFromCompositeOperation() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), attemptToBothUpdateAndRemoveHandlerFromCompositeOperation$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String attemptToBothRemoveAndAddHandlerReferenceFromCompositeOperation$str() {
        return "WFLYCTL0325: Attempt was made to both remove and add a handler reference from a composite operation";
    }
    @Override
    public final IllegalStateException attemptToBothRemoveAndAddHandlerReferenceFromCompositeOperation() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), attemptToBothRemoveAndAddHandlerReferenceFromCompositeOperation$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownRole$str() {
        return "WFLYCTL0327: Unknown role '%s'";
    }
    @Override
    public final UnknowRoleException unknownRole(final String roleName) {
        final UnknowRoleException result = new UnknowRoleException(String.format(getLoggingLocale(), unknownRole$str(), roleName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemoveStandardRole$str() {
        return "WFLYCTL0328: Cannot remove standard role '%s'";
    }
    @Override
    public final IllegalStateException cannotRemoveStandardRole(final String roleName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotRemoveStandardRole$str(), roleName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownBaseRole$str() {
        return "WFLYCTL0329: Unknown base role '%s'";
    }
    @Override
    public final IllegalArgumentException unknownBaseRole(final String roleName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownBaseRole$str(), roleName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String roleIsAlreadyRegistered$str() {
        return "WFLYCTL0330: Role '%s' is already registered";
    }
    @Override
    public final IllegalStateException roleIsAlreadyRegistered(final String roleName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), roleIsAlreadyRegistered$str(), roleName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String canOnlyCreateChildAuditLoggerForMainAuditLogger$str() {
        return "WFLYCTL0331: Can only create child audit logger for main audit logger";
    }
    @Override
    public final IllegalStateException canOnlyCreateChildAuditLoggerForMainAuditLogger() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), canOnlyCreateChildAuditLoggerForMainAuditLogger$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String permissionDenied$str() {
        return "WFLYCTL0332: Permission denied";
    }
    @Override
    public final String permissionDenied() {
        return String.format(getLoggingLocale(), permissionDenied$str());
    }
    protected String permissionCollectionIsReadOnly$str() {
        return "WFLYCTL0333: Cannot add a Permission to a readonly PermissionCollection";
    }
    @Override
    public final SecurityException permissionCollectionIsReadOnly() {
        final SecurityException result = new SecurityException(String.format(getLoggingLocale(), permissionCollectionIsReadOnly$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String incompatiblePermissionType$str() {
        return "WFLYCTL0334: Incompatible permission type %s";
    }
    @Override
    public final IllegalArgumentException incompatiblePermissionType(final Class<?> clazz) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), incompatiblePermissionType$str(), clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String managementResourceNotFoundMessage$str() {
        return "WFLYCTL0335: Management resource '%s' not found";
    }
    @Override
    public final String managementResourceNotFoundMessage(final PathAddress pathAddress) {
        return String.format(getLoggingLocale(), managementResourceNotFoundMessage$str(), pathAddress);
    }
    protected String attributesMustBeDefined$str() {
        return "WFLYCTL0336: The following attributes are nillable in the current model but must be defined in the target model version: %s";
    }
    @Override
    public final String attributesMustBeDefined(final Set<String> keySet) {
        return String.format(getLoggingLocale(), attributesMustBeDefined$str(), keySet);
    }
    protected String unsupportedIdentityType$str() {
        return "WFLYCTL0337: Unsupported Identity type '%X' received.";
    }
    @Override
    public final IOException unsupportedIdentityType(final byte type) {
        final IOException result = new IOException(String.format(getLoggingLocale(), unsupportedIdentityType$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedIdentityParameter$str() {
        return "WFLYCTL0338: Unsupported Identity parameter '%X' received parsing identity type '%X'.";
    }
    @Override
    public final IOException unsupportedIdentityParameter(final byte parameterType, final byte principalType) {
        final IOException result = new IOException(String.format(getLoggingLocale(), unsupportedIdentityParameter$str(), parameterType, principalType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String attributesMustBeDefinedAs$str() {
        return "WFLYCTL0339: The following attributes must be defined as %s in the current model: %s";
    }
    @Override
    public final String attributesMustBeDefinedAs(final ModelNode value, final Set<String> names) {
        return String.format(getLoggingLocale(), attributesMustBeDefinedAs$str(), value, names);
    }
    protected String attributesMustNotBeDefinedAs$str() {
        return "WFLYCTL0340: The following attributes must NOT be defined as %s in the current model: %s";
    }
    @Override
    public final String attributesMustNotBeDefinedAs(final ModelNode value, final Set<String> names) {
        return String.format(getLoggingLocale(), attributesMustNotBeDefinedAs$str(), value, names);
    }
    protected String badUriSyntax$str() {
        return "WFLYCTL0341: A uri with bad syntax '%s' was passed for validation.";
    }
    @Override
    public final OperationFailedException badUriSyntax(final String uri) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), badUriSyntax$str(), uri));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidBlockingTimeout$str() {
        return "WFLYCTL0342: Illegal value %d for operation header %s; value must be greater than zero";
    }
    @Override
    public final OperationFailedException invalidBlockingTimeout(final long timeout, final String headerName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidBlockingTimeout$str(), timeout, headerName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String timeoutAwaitingInitialStability0$str() {
        return "WFLYCTL0343: The service container has been destabilized by a previous operation and further runtime updates cannot be processed. Restart is required.";
    }
    @Override
    public final String timeoutAwaitingInitialStability() {
        return String.format(getLoggingLocale(), timeoutAwaitingInitialStability0$str());
    }
    protected String timeoutExecutingOperation0$str() {
        return "WFLYCTL0344: Operation timed out awaiting service container stability";
    }
    @Override
    public final String timeoutExecutingOperation() {
        return String.format(getLoggingLocale(), timeoutExecutingOperation0$str());
    }
    protected String serviceInstallTimedOut$str() {
        return "WFLYCTL0345: Timeout after %d seconds waiting for existing service %s to be removed so a new instance can be installed.";
    }
    @Override
    public final IllegalStateException serviceInstallTimedOut(final long timeout, final ServiceName name) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serviceInstallTimedOut$str(), timeout, name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void invalidDefaultBlockingTimeout(final String sysPropValue, final String sysPropName, final long defaultUsed) {
        super.log.logf(FQCN, ERROR, null, invalidDefaultBlockingTimeout$str(), sysPropValue, sysPropName, defaultUsed);
    }
    protected String invalidDefaultBlockingTimeout$str() {
        return "WFLYCTL0346: Invalid value %s for property %s; must be a numeric value greater than zero. Default value of %d will be used.";
    }
    @Override
    public final void timeoutAwaitingInitialStability(final long blockingTimeout, final String name, final PathAddress address) {
        super.log.logf(FQCN, DEBUG, null, timeoutAwaitingInitialStability3$str(), blockingTimeout, name, address);
    }
    protected String timeoutAwaitingInitialStability3$str() {
        return "WFLYCTL0347: Timeout after [%d] seconds waiting for initial service container stability before allowing runtime changes for operation '%s' at address '%s'. Operation will roll back; process restart is required.";
    }
    @Override
    public final void timeoutExecutingOperation(final long blockingTimeout, final String name, final PathAddress address) {
        super.log.logf(FQCN, ERROR, null, timeoutExecutingOperation3$str(), blockingTimeout, name, address);
    }
    protected String timeoutExecutingOperation3$str() {
        return "WFLYCTL0348: Timeout after [%d] seconds waiting for service container stability. Operation will roll back. Step that first updated the service container was '%s' at address '%s'";
    }
    @Override
    public final void timeoutCompletingOperation(final long blockingTimeout, final String name, final PathAddress address) {
        super.log.logf(FQCN, ERROR, null, timeoutCompletingOperation$str(), blockingTimeout, name, address);
    }
    protected String timeoutCompletingOperation$str() {
        return "WFLYCTL0349: Timeout after [%d] seconds waiting for service container stability while finalizing an operation. Process must be restarted. Step that first updated the service container was '%s' at address '%s'";
    }
    @Override
    public final void interruptedAwaitingInitialResponse(final String operation, final PathAddress proxyNodeAddress) {
        super.log.logf(FQCN, INFO, null, interruptedAwaitingInitialResponse$str(), operation, proxyNodeAddress);
    }
    protected String interruptedAwaitingInitialResponse$str() {
        return "WFLYCTL0350: Execution of operation '%s' on remote process at address '%s' interrupted while awaiting initial response; remote process has been notified to cancel operation";
    }
    @Override
    public final void interruptedAwaitingFinalResponse(final String operation, final PathAddress proxyNodeAddress) {
        super.log.logf(FQCN, INFO, null, interruptedAwaitingFinalResponse$str(), operation, proxyNodeAddress);
    }
    protected String interruptedAwaitingFinalResponse$str() {
        return "WFLYCTL0351: Execution of operation '%s' on remote process at address '%s' interrupted while awaiting final response; remote process has been notified to terminate operation";
    }
    @Override
    public final void cancellingOperation(final String operation, final int id, final String thread) {
        super.log.logf(FQCN, INFO, null, cancellingOperation$str(), operation, id, thread);
    }
    protected String cancellingOperation$str() {
        return "WFLYCTL0352: Cancelling operation '%s' with id '%d' running on thread '%s'";
    }
    protected String responseHandlerNotFound$str() {
        return "WFLYCTL0353: No response handler for request %s";
    }
    @Override
    public final IOException responseHandlerNotFound(final int id) {
        final IOException result = new IOException(String.format(getLoggingLocale(), responseHandlerNotFound$str(), id));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void attemptingReconnectToSyslog(final String name, final int timeout) {
        super.log.logf(FQCN, INFO, null, attemptingReconnectToSyslog$str(), name, timeout);
    }
    protected String attemptingReconnectToSyslog$str() {
        return "WFLYCTL0354: Attempting reconnect to syslog handler '%s; after timeout of %d seconds";
    }
    @Override
    public final void reconnectToSyslogFailed(final String name, final Throwable e) {
        super.log.logf(FQCN, INFO, e, reconnectToSyslogFailed$str(), name);
    }
    protected String reconnectToSyslogFailed$str() {
        return "WFLYCTL0355: Reconnecting to syslog handler '%s failed";
    }
    @Override
    public final void failedToEmitNotification(final Notification notification, final Throwable cause) {
        super.log.logf(FQCN, WARN, cause, failedToEmitNotification$str(), notification);
    }
    protected String failedToEmitNotification$str() {
        return "WFLYCTL0356: Failed to emit notification %s";
    }
    protected String notificationIsNotDescribed$str() {
        return "WFLYCTL0357: Notification of type %s is not described for the resource at the address %s";
    }
    @Override
    public final String notificationIsNotDescribed(final String type, final PathAddress source) {
        return String.format(getLoggingLocale(), notificationIsNotDescribed$str(), type, source);
    }
    protected String resourceWasAdded$str() {
        return "WFLYCTL0358: The resource was added at the address %s.";
    }
    @Override
    public final String resourceWasAdded(final PathAddress address) {
        return String.format(getLoggingLocale(), resourceWasAdded$str(), address);
    }
    protected String resourceWasRemoved$str() {
        return "WFLYCTL0359: The resource was removed at the address %s.";
    }
    @Override
    public final String resourceWasRemoved(final PathAddress address) {
        return String.format(getLoggingLocale(), resourceWasRemoved$str(), address);
    }
    protected String attributeValueWritten$str() {
        return "WFLYCTL0360: The attribute %s value has been changed from %s to %s.";
    }
    @Override
    public final String attributeValueWritten(final String attributeName, final ModelNode currentValue, final ModelNode newVal) {
        return String.format(getLoggingLocale(), attributeValueWritten$str(), attributeName, currentValue, newVal);
    }
    protected String capabilitiesNotAvailable$str() {
        return "WFLYCTL0361: Capabilities cannot be queried in stage '%s'; they are not available until stage '%s'.";
    }
    @Override
    public final IllegalStateException capabilitiesNotAvailable(final Stage currentStage, final Stage runtime) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), capabilitiesNotAvailable$str(), currentStage, runtime));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String requiredCapabilityMissing1$str() {
        return "WFLYCTL0362: Capabilities required by resource '%s' are not available:";
    }
    @Override
    public final String requiredCapabilityMissing(final String demandingAddress) {
        return String.format(getLoggingLocale(), requiredCapabilityMissing1$str(), demandingAddress);
    }
    protected String capabilityAlreadyRegisteredInContext2$str() {
        return "WFLYCTL0363: Capability '%s' is already registered in context '%s'.";
    }
    @Override
    public final IllegalStateException capabilityAlreadyRegisteredInContext(final String capability, final String context) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), capabilityAlreadyRegisteredInContext2$str(), capability, context));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownCapability$str() {
        return "WFLYCTL0364: Capability '%s' is unknown.";
    }
    @Override
    public final IllegalStateException unknownCapability(final String capability) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unknownCapability$str(), capability));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownCapabilityInContext$str() {
        return "WFLYCTL0365: Capability '%s' is unknown in context '%s'.";
    }
    @Override
    public final IllegalStateException unknownCapabilityInContext(final String capability, final String context) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unknownCapabilityInContext$str(), capability, context));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String capabilityDoesNotExposeRuntimeAPI$str() {
        return "WFLYCTL0366: Capability '%s' does not expose a runtime API.";
    }
    @Override
    public final IllegalArgumentException capabilityDoesNotExposeRuntimeAPI(final String capabilityName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), capabilityDoesNotExposeRuntimeAPI$str(), capabilityName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemoveRequiredCapability$str() {
        return "WFLYCTL0367: Cannot remove capability '%s' as it is required by other capabilities:";
    }
    @Override
    public final String cannotRemoveRequiredCapability(final String capability) {
        return String.format(getLoggingLocale(), cannotRemoveRequiredCapability$str(), capability);
    }
    protected String cannotRemoveRequiredCapabilityInContext$str() {
        return "WFLYCTL0368: Cannot remove capability '%s' from context '%s' as it is required by other capabilities:";
    }
    @Override
    public final String cannotRemoveRequiredCapabilityInContext(final String capability, final String context) {
        return String.format(getLoggingLocale(), cannotRemoveRequiredCapabilityInContext$str(), capability, context);
    }
    protected String requiredCapabilityMissing0$str() {
        return "WFLYCTL0369: Required capabilities are not available:";
    }
    @Override
    public final String requiredCapabilityMissing() {
        return String.format(getLoggingLocale(), requiredCapabilityMissing0$str());
    }
    protected String requirementPointSimple$str() {
        return "capability '%s' requires it for address '%s'";
    }
    @Override
    public final String requirementPointSimple(final String capability, final String requestingAddress) {
        return String.format(getLoggingLocale(), requirementPointSimple$str(), capability, requestingAddress);
    }
    protected String requirementPointFull$str() {
        return "capability '%s' requires it for attribute '%s' at address '%s'";
    }
    @Override
    public final String requirementPointFull(final String capability, final String attribute, final String requestingAddress) {
        return String.format(getLoggingLocale(), requirementPointFull$str(), capability, attribute, requestingAddress);
    }
    protected String formattedCapabilityName$str() {
        return "    %s";
    }
    @Override
    public final String formattedCapabilityName(final String capability) {
        return String.format(getLoggingLocale(), formattedCapabilityName$str(), capability);
    }
    protected String formattedCapabilityId$str() {
        return "    %s in context '%s'";
    }
    @Override
    public final String formattedCapabilityId(final String capability, final String context) {
        return String.format(getLoggingLocale(), formattedCapabilityId$str(), capability, context);
    }
    protected String possibleCapabilityProviderPoints$str() {
        return "; Possible registration points for this capability: %s";
    }
    @Override
    public final String possibleCapabilityProviderPoints(final String providerPoints) {
        return String.format(getLoggingLocale(), possibleCapabilityProviderPoints$str(), providerPoints);
    }
    protected String noKnownProviderPoints$str() {
        return "; There are no known registration points which can provide this capability.";
    }
    @Override
    public final String noKnownProviderPoints() {
        return String.format(getLoggingLocale(), noKnownProviderPoints$str());
    }
    protected String unsupportedUsageOfExpression$str() {
        return "; This unresolvable capability likely is due to the use of an expression string in a configuration attribute that does not support expressions.";
    }
    @Override
    public final String unsupportedUsageOfExpression() {
        return String.format(getLoggingLocale(), unsupportedUsageOfExpression$str());
    }
    protected String incompleteExpression$str() {
        return "WFLYCTL0370: Incomplete expression: %s";
    }
    @Override
    public final ExpressionResolutionUserException incompleteExpression(final String expression) {
        final ExpressionResolutionUserException result = new ExpressionResolutionUserException(String.format(getLoggingLocale(), incompleteExpression$str(), expression));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedElement$str() {
        return "WFLYCTL0371: The element '%s' is no longer supported, please use '%s' instead";
    }
    @Override
    public final XMLStreamException unsupportedElement(final QName name, final Location location, final String supportedElement) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unsupportedElement$str(), name, supportedElement), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateElementsInList$str() {
        return "WFLYCTL0372: List attribute '%s' contains duplicates, which are not allowed";
    }
    @Override
    public final String duplicateElementsInList(final String name) {
        return String.format(getLoggingLocale(), duplicateElementsInList$str(), name);
    }
    protected String deploymentResourceMustBeRuntimeOnly$str() {
        return "WFLYCTL0373: Deployment resource must be runtime only";
    }
    @Override
    public final IllegalArgumentException deploymentResourceMustBeRuntimeOnly() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), deploymentResourceMustBeRuntimeOnly$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToResolveExpressions$str() {
        return "WFLYCTL0374: Unable to resolve expressions at this location.";
    }
    @Override
    public final OperationFailedException unableToResolveExpressions() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToResolveExpressions$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void udpSyslogServerUnavailable(final String name, final String message) {
        super.log.logf(FQCN, WARN, null, udpSyslogServerUnavailable$str(), name, message);
    }
    protected String udpSyslogServerUnavailable$str() {
        return "WFLYCTL0375: Update of the management operation audit log failed on the handler '%s' due to '%s'. Please make sure that the syslog server is running and reachable";
    }
    protected String unexpectedAttribute2$str() {
        return "WFLYCTL0376: Unexpected attribute '%s' encountered. Valid attributes are: '%s'";
    }
    @Override
    public final XMLStreamException unexpectedAttribute(final QName name, final StringBuilder possibleAttributes, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unexpectedAttribute2$str(), name, possibleAttributes), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedElement2$str() {
        return "WFLYCTL0377: Unexpected element '%s' encountered. Valid elements are: '%s'";
    }
    @Override
    public final XMLStreamException unexpectedElement(final QName name, final StringBuilder possible, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unexpectedElement2$str(), name, possible), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String attributeIsWrongType$str() {
        return "WFLYCTL0378: Attribute '%s' is not of type '%s', it is type '%s'";
    }
    @Override
    public final OperationFailedException attributeIsWrongType(final String name, final ModelType expectedType, final ModelType providedType) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), attributeIsWrongType$str(), name, expectedType, providedType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String managementUnavailableDuringBoot$str() {
        return "WFLYCTL0379: System boot is in process; execution of remote management operations is not currently available";
    }
    @Override
    public final String managementUnavailableDuringBoot() {
        return String.format(getLoggingLocale(), managementUnavailableDuringBoot$str());
    }
    protected String requiredAttributeNotSet$str() {
        return "WFLYCTL0380: Attribute '%s' needs to be set or passed before attribute '%s' can be correctly set";
    }
    @Override
    public final OperationFailedException requiredAttributeNotSet(final String required, final String name) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), requiredAttributeNotSet$str(), required, name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalPermissionName$str() {
        return "WFLYCTL0381: Illegal permission name '%s'";
    }
    @Override
    public final IllegalArgumentException illegalPermissionName(final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalPermissionName$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalPermissionActions$str() {
        return "WFLYCTL0382: Illegal permission actions '%s'";
    }
    @Override
    public final IllegalArgumentException illegalPermissionActions(final String actions) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalPermissionActions$str(), actions));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noOperationDefined$str() {
        return "WFLYCTL0383: No operation is defined %s";
    }
    @Override
    public final String noOperationDefined(final ModelNode operation) {
        return String.format(getLoggingLocale(), noOperationDefined$str(), operation);
    }
    protected String nonHostCapableSubsystemInHostModel$str() {
        return "WFLYCTL0385: An attempt was made to register the non-host capable subsystem '%s' from extension module '%s' in the host model.";
    }
    @Override
    public final IllegalStateException nonHostCapableSubsystemInHostModel(final String subsystemName, final String extensionModuleName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), nonHostCapableSubsystemInHostModel$str(), subsystemName, extensionModuleName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String onlyAccessHostControllerInfoInRuntimeStage$str() {
        return "WFLYCTL0386: The host controller info can only be accessed after the model stage on boot";
    }
    @Override
    public final OperationFailedException onlyAccessHostControllerInfoInRuntimeStage() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), onlyAccessHostControllerInfoInRuntimeStage$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalCLIStylePathAddress$str() {
        return "WFLYCTL0387: Illegal path address '%s' , it is not in a correct CLI format";
    }
    @Override
    public final IllegalArgumentException illegalCLIStylePathAddress(final String pathAddress) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalCLIStylePathAddress$str(), pathAddress));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCreateEmptyConfig$str() {
        return "WFLYCTL0388: Could not create empty configuration file %s";
    }
    @Override
    public final IllegalStateException cannotCreateEmptyConfig(final String absolutePath, final IOException cause) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotCreateEmptyConfig$str(), absolutePath), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String rejectEmptyConfig$str() {
        return "WFLYCTL0389: Could not create an empty configuration at file %s as there is an existing non-empty configuration there";
    }
    @Override
    public final IllegalStateException rejectEmptyConfig(final String absolutePath) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), rejectEmptyConfig$str(), absolutePath));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotResolveExpressionIndex$str() {
        return "WFLYCTL0391: Could not resolve attribute expression: '%s', invalid index '%d'";
    }
    @Override
    public final OperationFailedException couldNotResolveExpressionIndex(final String attributeExpression, final int index) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), couldNotResolveExpressionIndex$str(), attributeExpression, index));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotResolveExpressionList$str() {
        return "WFLYCTL0392: Could not resolve attribute expression: '%s', type is not a list";
    }
    @Override
    public final OperationFailedException couldNotResolveExpressionList(final String attributeExpression) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), couldNotResolveExpressionList$str(), attributeExpression));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotResolveExpression$str() {
        return "WFLYCTL0393: Could not resolve attribute expression: '%s'";
    }
    @Override
    public final OperationFailedException couldNotResolveExpression(final String attributeExpression) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), couldNotResolveExpression$str(), attributeExpression));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidCapabilityServiceType$str() {
        return "WFLYCTL0394: Capability '%s' does not provide services of type '%s'";
    }
    @Override
    public final IllegalArgumentException invalidCapabilityServiceType(final String capabilityName, final Class<?> serviceType) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidCapabilityServiceType$str(), capabilityName, serviceType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void operationDeprecated(final String name, final String address) {
        super.log.logf(FQCN, INFO, null, operationDeprecated$str(), name, address);
    }
    protected String operationDeprecated$str() {
        return "WFLYCTL0395: Operation %s against the resource at address %s is deprecated, and it might be removed in future version. See the the output of the read-operation-description operation to learn more about the deprecation.";
    }
    protected String discardedResourceTransformation$str() {
        return "WFLYCTL0396: Resource %s is discarded on the target host %s";
    }
    @Override
    public final String discardedResourceTransformation(final PathAddress address, final String host) {
        return String.format(getLoggingLocale(), discardedResourceTransformation$str(), address, host);
    }
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYCTL0397: Indexed child resources can only be registered if the parent resource supports ordered children. The parent of '%s' is not indexed";
    }
    @Override
    public final IllegalStateException indexedChildResourceRegistrationNotAvailable(final PathElement element) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), indexedChildResourceRegistrationNotAvailable$str(), element));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String orderedChildTypeRenamed$str() {
        return "WFLYCTL0398: An attempt was made to rename the resource found at %s to %s. However, '%s' is one of the resource types defined to be ordered on the parent resource %s";
    }
    @Override
    public final OperationFailedRuntimeException orderedChildTypeRenamed(final PathAddress read, final PathAddress transformed, final String type, final Set<String> parentOrderedChildren) {
        final OperationFailedRuntimeException result = new OperationFailedRuntimeException(String.format(getLoggingLocale(), orderedChildTypeRenamed$str(), read, transformed, type, parentOrderedChildren));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String inconsistentCapabilityContexts4$str() {
        return "WFLYCTL0399: The capability '%s' required by capability '%s' in context '%s' is available in one or more socket binding groups, but not all socket binding capabilities required by '%s' can be resolved from a single socket binding group, so this configuration is invalid";
    }
    @Override
    public final String inconsistentCapabilityContexts(final String requiredName, final String dependentName, final String dependentContext, final String dependentContextAgain) {
        return String.format(getLoggingLocale(), inconsistentCapabilityContexts4$str(), requiredName, dependentName, dependentContext, dependentContextAgain);
    }
    @Override
    public final void inconsistentCapabilityContexts(final String dependentName, final String dependentContext, final String address, final String requiredName, final String dependentContextAgain) {
        super.log.logf(FQCN, ERROR, null, inconsistentCapabilityContexts5$str(), dependentName, dependentContext, address, requiredName, dependentContextAgain);
    }
    protected String inconsistentCapabilityContexts5$str() {
        return "WFLYCTL0400: Capability '%s' in context '%s' associated with resource '%s' requires capability '%s'. It is available in one or more socket binding groups, but not all socket binding capabilities required by '%s' can be resolved from a single socket binding group, so this configuration is invalid";
    }
    protected String failedToBuildReport$str() {
        return "WFLYCTL0401: Couldn't build the report";
    }
    @Override
    public final RuntimeException failedToBuildReport(final Throwable t) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToBuildReport$str()), t);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void removeUnsupportedLegacyExtension(final List<String> subsystemNames, final String extensionName) {
        super.log.logf(FQCN, ERROR, null, removeUnsupportedLegacyExtension$str(), subsystemNames, extensionName);
    }
    protected String removeUnsupportedLegacyExtension$str() {
        return "WFLYCTL0402: Subsystems %s provided by legacy extension '%s' are not supported on servers running this version. Both the subsystem and the extension must be removed or migrated before the server will function.";
    }
    @Override
    public final void unexpectedOperationExecutionException(final Throwable t, final List<ModelNode> controllerOperations) {
        super.log.logf(FQCN, ERROR, t, unexpectedOperationExecutionException$str(), controllerOperations);
    }
    protected String unexpectedOperationExecutionException$str() {
        return "WFLYCTL0403: Unexpected failure during execution of the following operation(s): %s";
    }
    protected String unexpectedOperationExecutionFailureDescription$str() {
        return "WFLYCTL0404: Unexpected exception during execution: %s";
    }
    @Override
    public final String unexpectedOperationExecutionFailureDescription(final RuntimeException e) {
        return String.format(getLoggingLocale(), unexpectedOperationExecutionFailureDescription$str(), e);
    }
    @Override
    public final void couldNotFindTransformerRegistryFallingBack(final ModelVersion currentVersion, final ModelVersion fallbackVersion) {
        super.log.logf(FQCN, WARN, null, couldNotFindTransformerRegistryFallingBack$str(), currentVersion, fallbackVersion);
    }
    protected String couldNotFindTransformerRegistryFallingBack$str() {
        return "WFLYCTL0405: Couldn't find a transformer to %s, falling back to %s";
    }
    protected String selectFailedCouldNotConvertAttributeToType$str() {
        return "WFLYCTL0406: Could not convert the attribute '%s' to a %s";
    }
    @Override
    public final OperationFailedException selectFailedCouldNotConvertAttributeToType(final String attribute, final ModelType type) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), selectFailedCouldNotConvertAttributeToType$str(), attribute, type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedSendingCompletedResponse(final Throwable cause, final ModelNode response, final int operationId) {
        super.log.logf(FQCN, ERROR, cause, failedSendingCompletedResponse$str(), response, operationId);
    }
    protected String failedSendingCompletedResponse$str() {
        return "WFLYCTL0407: Failed sending completed response %s for %d";
    }
    @Override
    public final void failedSendingFailedResponse(final Throwable cause, final ModelNode response, final int operationId) {
        super.log.logf(FQCN, ERROR, cause, failedSendingFailedResponse$str(), response, operationId);
    }
    protected String failedSendingFailedResponse$str() {
        return "WFLYCTL0408: Failed sending failure response %s for %d";
    }
    protected String proxiedOperationTimedOut$str() {
        return "WFLYCTL0409: Execution of operation '%s' on remote process at address '%s' timed out after %d ms while awaiting initial response; remote process has been notified to terminate operation";
    }
    @Override
    public final String proxiedOperationTimedOut(final String operation, final PathAddress target, final long timeout) {
        return String.format(getLoggingLocale(), proxiedOperationTimedOut$str(), operation, target, timeout);
    }
    @Override
    public final void timeoutAwaitingFinalResponse(final String operation, final PathAddress proxyNodeAddress, final long timeout) {
        super.log.logf(FQCN, INFO, null, timeoutAwaitingFinalResponse$str(), operation, proxyNodeAddress, timeout);
    }
    protected String timeoutAwaitingFinalResponse$str() {
        return "WFLYCTL0410: Execution of operation '%s' on remote process at address '%s' timed out after %d ms while awaiting final response; remote process has been notified to terminate operation";
    }
    @Override
    public final void failedToParseElementLenient(final XMLStreamException e, final String elementName) {
        super.log.logf(FQCN, WARN, e, failedToParseElementLenient$str(), elementName);
    }
    protected String failedToParseElementLenient$str() {
        return "WFLYCTL0411: Failed to parse element '%s', ignoring ...";
    }
    protected String missingRequiredServices$str() {
        return "WFLYCTL0412: Required services that are not installed:";
    }
    @Override
    public final String missingRequiredServices() {
        return String.format(getLoggingLocale(), missingRequiredServices$str());
    }
    protected String deprecatedAndCurrentParameterMismatch$str() {
        return "WFLYCTL0413: The deprecated parameter %s has been set in addition to the current parameter %s but with different values";
    }
    @Override
    public final OperationFailedException deprecatedAndCurrentParameterMismatch(final String deprecated, final String current) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), deprecatedAndCurrentParameterMismatch$str(), deprecated, current));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void couldNotCreateHistoricalBackup(final String currentHistoryDir) {
        super.log.logf(FQCN, WARN, null, couldNotCreateHistoricalBackup$str(), currentHistoryDir);
    }
    protected String couldNotCreateHistoricalBackup$str() {
        return "WFLYCTL0414: Could not create a timestamped backup of current history dir %s, so it may still include versions from the previous boot.";
    }
    protected String runtimeModificationBegun$str() {
        return "WFLYCTL0415: Modification of the runtime service container by a management operation has begun";
    }
    @Override
    public final String runtimeModificationBegun() {
        return String.format(getLoggingLocale(), runtimeModificationBegun$str());
    }
    protected String runtimeModificationComplete$str() {
        return "WFLYCTL0416: Modification of the runtime service container by a management operation has completed";
    }
    @Override
    public final String runtimeModificationComplete() {
        return String.format(getLoggingLocale(), runtimeModificationComplete$str());
    }
    protected String cannotAddMoreThanOneJvmForServerOrHost$str() {
        return "WFLYCTL0417: Cannot add more than one jvm. Add of '%s' attempted, but '%s' already exists";
    }
    @Override
    public final OperationFailedException cannotAddMoreThanOneJvmForServerOrHost(final PathAddress requested, final PathAddress existing) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotAddMoreThanOneJvmForServerOrHost$str(), requested, existing));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String socketBindingalreadyDeclared$str() {
        return "WFLYCTL0418: A %s or a %s %s already declared has already been declared in %s %s";
    }
    @Override
    public final OperationFailedRuntimeException socketBindingalreadyDeclared(final String name1, final String name2, final String value, final String parentName, final String parentValue) {
        final OperationFailedRuntimeException result = new OperationFailedRuntimeException(String.format(getLoggingLocale(), socketBindingalreadyDeclared$str(), name1, name2, value, parentName, parentValue));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidMaxBytesLength$str() {
        return "WFLYCTL0419: '%s' is an invalid value for parameter %s. Values must have a maximum length of %d bytes";
    }
    @Override
    public final String invalidMaxBytesLength(final String str, final String parameterName, final int max) {
        return String.format(getLoggingLocale(), invalidMaxBytesLength$str(), str, parameterName, max);
    }
    protected String invalidMinBytesLength$str() {
        return "WFLYCTL0420: '%s' is an invalid value for parameter %s. Values must have a minimum length of %d bytes";
    }
    @Override
    public final String invalidMinBytesLength(final String str, final String parameterName, final int min) {
        return String.format(getLoggingLocale(), invalidMinBytesLength$str(), str, parameterName, min);
    }
    protected String explodedDeploymentNotSupported$str() {
        return "WFLYCTL0421: Exploded deployment is not supported by some servers";
    }
    @Override
    public final String explodedDeploymentNotSupported() {
        return String.format(getLoggingLocale(), explodedDeploymentNotSupported$str());
    }
    protected String couldNotLoadModuleForTransformers$str() {
        return "WFLYCTL0422: Could not load module '%s' for transformers";
    }
    @Override
    public final RuntimeException couldNotLoadModuleForTransformers(final String name, final ModuleLoadException e) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotLoadModuleForTransformers$str(), name), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String wrongMaskedPasswordFormat$str() {
        return "WFLYCTL0423: Masked password command has the wrong format.%nUsage: MASK-<encoded secret>;<salt>;<iteration count> where <salt>=UTF-8 characters, <iteration count>=reasonable sized positive integer";
    }
    @Override
    public final IOException wrongMaskedPasswordFormat() {
        final IOException result = new IOException(String.format(getLoggingLocale(), wrongMaskedPasswordFormat$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidAddressFormat$str() {
        return "WFLYCTL0433: '%s' is not a valid representation of a resource address";
    }
    @Override
    public final OperationFailedException invalidAddressFormat(final ModelNode address) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidAddressFormat$str(), address));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String bootComplete$str() {
        return "WFLYCTL0434: Boot complete";
    }
    @Override
    public final String bootComplete() {
        return String.format(getLoggingLocale(), bootComplete$str());
    }
    protected String attributeWasNotMarkedAsReloadRequired$str() {
        return "WFLYCTL0435: Attribute %s of resource %s was not marked as reload required, either set the RESTART_ALL_SERVICES flag, or register a custom write handler.";
    }
    @Override
    public final RuntimeException attributeWasNotMarkedAsReloadRequired(final String name, final PathAddress pathAddress) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), attributeWasNotMarkedAsReloadRequired$str(), name, pathAddress));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String typeConversionError$str() {
        return "Couldn't convert %s to %s";
    }
    @Override
    public final String typeConversionError(final ModelNode value, final Collection<ModelType> validTypes) {
        return String.format(getLoggingLocale(), typeConversionError$str(), value, validTypes);
    }
    protected String capabilityAlreadyRegisteredInContext4$str() {
        return "WFLYCTL0436: Cannot register capability '%s' at location '%s' as it is already registered in context '%s' at location(s) '%s'";
    }
    @Override
    public final OperationFailedRuntimeException capabilityAlreadyRegisteredInContext(final String capability, final RegistrationPoint newPoint, final String context, final Set<RegistrationPoint> oldPoints) {
        final OperationFailedRuntimeException result = new OperationFailedRuntimeException(String.format(getLoggingLocale(), capabilityAlreadyRegisteredInContext4$str(), capability, newPoint, context, oldPoints));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateExtensionElement$str() {
        return "WFLYCTL0437: Duplicate extension: an %s element with %s attribute value '%s' has already been parsed";
    }
    @Override
    public final XMLStreamException duplicateExtensionElement(final String elementConstant, final String attrConstant, final String module, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), duplicateExtensionElement$str(), elementConstant, attrConstant, module), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldntConvertWarningLevel$str() {
        return "WFLYCTL0438: Couldn't convert '%s' into proper warning level, threshold falling back to 'ALL'. Possible values: SEVERE,WARNING,INFO,CONFIG,FINE,FINER,FINEST,ALL,OFF";
    }
    @Override
    public final String couldntConvertWarningLevel(final String level) {
        return String.format(getLoggingLocale(), couldntConvertWarningLevel$str(), level);
    }
    protected String invalidSubnetFormat$str() {
        return "WFLYCTL0439: Value %s for attribute %s is not a valid subnet format";
    }
    @Override
    public final OperationFailedException invalidSubnetFormat(final String value, final String name) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidSubnetFormat$str(), value, name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void cannotDeleteFileOrDirectory(final File file) {
        super.log.logf(FQCN, WARN, null, cannotDeleteFileOrDirectory$str(), file);
    }
    protected String cannotDeleteFileOrDirectory$str() {
        return "WFLYCTL0440: Cannot delete file or directory %s";
    }
    protected String serviceStatusReportFailureHeader$str() {
        return "WFLYCTL0441: Operation has resulted in failed or missing services %n";
    }
    @Override
    public final String serviceStatusReportFailureHeader() {
        return String.format(getLoggingLocale(), serviceStatusReportFailureHeader$str());
    }
    @Override
    public final void errorStoppingServer(final Exception cause) {
        super.log.logf(FQCN, WARN, cause, errorStoppingServer$str());
    }
    protected String errorStoppingServer$str() {
        return "WFLYCTL0442: Error stopping server";
    }
    @Override
    public final void errorObtainingPassword(final Exception cause, final String message) {
        super.log.logf(FQCN, WARN, cause, errorObtainingPassword$str(), message);
    }
    protected String errorObtainingPassword$str() {
        return "WFLYCTL0443: Error getting the password from the supplier %s";
    }
    @Override
    public final void invalidRuntimeStageForProfile(final String operation, final String address, final Stage stage, final ProcessType processType) {
        super.log.logf(FQCN, INFO, null, invalidRuntimeStageForProfile$str(), operation, address, stage, processType);
    }
    protected String invalidRuntimeStageForProfile$str() {
        return "WFLYCTL0444: The handler for operation '%s' at address '%s' attempted to add a stage %s step. This is not valid for a 'profile' resource on process type %s so this step will not be executed.";
    }
    protected String alreadyDefinedAttribute$str() {
        return "WFLYCTL0445: %s with value '%s' in attribute %s is already defined";
    }
    @Override
    public final OperationFailedException alreadyDefinedAttribute(final String resource, final String value, final String attribute) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), alreadyDefinedAttribute$str(), resource, value, attribute));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String requiredWithAlternatives$str() {
        return "WFLYCTL0446: %s or alternative(s) %s is required";
    }
    @Override
    public final OperationFailedException requiredWithAlternatives(final String name, final Set<String> alternatives) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), requiredWithAlternatives$str(), name, alternatives));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void attributeExpressionDeprecated(final String name, final String address) {
        super.log.logf(FQCN, WARN, null, attributeExpressionDeprecated$str(), name, address);
    }
    protected String attributeExpressionDeprecated$str() {
        return "WFLYCTL0447: Attribute '%s' in the resource at address '%s' has been configured with an expression, but support for use of expressions in this attribute's value may be removed in a future version. This attribute configures whether a capability that can be required by other parts of the configuration is present or itself configures a requirement for a capability provided by another part of the configuration. Full support for this kind of configuration cannot be provided when an expression is used.";
    }
    protected String servicesWithTransitiveUnavailability$str() {
        return "WFLYCTL0448: %s additional services are down due to their dependencies being missing or failed";
    }
    @Override
    public final String servicesWithTransitiveUnavailability(final int count) {
        return String.format(getLoggingLocale(), servicesWithTransitiveUnavailability$str(), count);
    }
    protected String operationDeprecatedMessage$str() {
        return "WFLYCTL0449: Operation %s against the resource at address %s is deprecated, and it might be removed in future version. See the the output of the read-operation-description operation to learn more about the deprecation.";
    }
    @Override
    public final String operationDeprecatedMessage(final String name, final String address) {
        return String.format(getLoggingLocale(), operationDeprecatedMessage$str(), name, address);
    }
    protected String failedToCloneRepository$str() {
        return "WFLYCTL0450: Failed to clone the repository %s";
    }
    @Override
    public final RuntimeException failedToCloneRepository(final Exception cause, final String repository) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToCloneRepository$str(), repository), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToPublishConfiguration$str() {
        return "WFLYCTL0451: Failed to publish configuration to %s because of %s";
    }
    @Override
    public final ConfigurationPersistenceException failedToPublishConfiguration(final Throwable cause, final String name, final String error) {
        final ConfigurationPersistenceException result = new ConfigurationPersistenceException(String.format(getLoggingLocale(), failedToPublishConfiguration$str(), name, error), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToPersistConfiguration$str() {
        return "WFLYCTL0452: Failed to persist configuration to %s because of %s";
    }
    @Override
    public final ConfigurationPersistenceException failedToPersistConfiguration(final Throwable cause, final String name, final String error) {
        final ConfigurationPersistenceException result = new ConfigurationPersistenceException(String.format(getLoggingLocale(), failedToPersistConfiguration$str(), name, error), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToDeleteConfigurationSnapshot(final Throwable cause, final String name) {
        super.log.logf(FQCN, ERROR, cause, failedToDeleteConfigurationSnapshot$str(), name);
    }
    protected String failedToDeleteConfigurationSnapshot$str() {
        return "WFLYCTL0453: Failed to delete configuration snapshot %s";
    }
    @Override
    public final void failedToListConfigurationSnapshot(final Throwable cause, final String name) {
        super.log.logf(FQCN, ERROR, cause, failedToListConfigurationSnapshot$str(), name);
    }
    protected String failedToListConfigurationSnapshot$str() {
        return "WFLYCTL0454: Failed to list configuration snapshots %s";
    }
    protected String snapshotAlreadyExistError$str() {
        return "WFLYCTL0455: Can't take snapshot %s because it already exists";
    }
    @Override
    public final ConfigurationPersistenceException snapshotAlreadyExistError(final String name) {
        final ConfigurationPersistenceException result = new ConfigurationPersistenceException(String.format(getLoggingLocale(), snapshotAlreadyExistError$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void systemPropertyAlreadyExist(final String name) {
        super.log.logf(FQCN, WARN, null, systemPropertyAlreadyExist$str(), name);
    }
    protected String systemPropertyAlreadyExist$str() {
        return "WFLYCTL0456: System property \"%s\" is already set in the <system-properties> section of the configuration file. The value set in the command line will be overridden by that value.";
    }
    protected String invalidHeaderName$str() {
        return "WFLYCTL0457: Invalid HTTP Header name '%s'";
    }
    @Override
    public final OperationFailedException invalidHeaderName(final String value) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidHeaderName$str(), value));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String disallowedHeaderName$str() {
        return "WFLYCTL0458: Disallowed HTTP Header name '%s'";
    }
    @Override
    public final OperationFailedException disallowedHeaderName(final String value) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), disallowedHeaderName$str(), value));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void missingManagementServices() {
        super.log.logf(FQCN, ERROR, null, missingManagementServices$str());
    }
    protected String missingManagementServices$str() {
        return "WFLYCTL0459: Triggering roll back due to missing management services.";
    }
    protected String propertyCanOnlyBeUsedWithStandaloneOrEmbeddedServer$str() {
        return "WFLYCTL0460: The system property '%s' can only be used with a standalone or embedded server";
    }
    @Override
    public final IllegalStateException propertyCanOnlyBeUsedWithStandaloneOrEmbeddedServer(final String propertyName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), propertyCanOnlyBeUsedWithStandaloneOrEmbeddedServer$str(), propertyName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String propertyCanOnlyBeUsedWithAdminOnlyModeServer$str() {
        return "WFLYCTL0461: The system property '%s' can only be used with an admin-only server";
    }
    @Override
    public final IllegalStateException propertyCanOnlyBeUsedWithAdminOnlyModeServer(final String propertyName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), propertyCanOnlyBeUsedWithAdminOnlyModeServer$str(), propertyName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotFindDirectorySpecifiedByProperty$str() {
        return "WFLYCTL0462: Could not find the directory '%s' specified by the system property '%s'. Please make sure it exists";
    }
    @Override
    public final IllegalStateException couldNotFindDirectorySpecifiedByProperty(final String fileName, final String propertyName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotFindDirectorySpecifiedByProperty$str(), fileName, propertyName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String moreThanOneInstanceOfAdditionalBootCliScriptInvokerFound$str() {
        return "WFLYCTL0463: More than one instance of AdditionalBootCliScriptInvoker found. Have: '%s'; found: '%s";
    }
    @Override
    public final IllegalStateException moreThanOneInstanceOfAdditionalBootCliScriptInvokerFound(final String name, final String name1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), moreThanOneInstanceOfAdditionalBootCliScriptInvokerFound$str(), name, name1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cliScriptPropertyDefinedWithoutMarkerDirectoryWhenNotSkippingReload$str() {
        return "WFLYCTL0464: If using %s=true, when you use -D%s you need to set -D%s";
    }
    @Override
    public final IllegalStateException cliScriptPropertyDefinedWithoutMarkerDirectoryWhenNotSkippingReload(final String skipProperty, final String scriptProperty, final String markerDirectoryProperty) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cliScriptPropertyDefinedWithoutMarkerDirectoryWhenNotSkippingReload$str(), skipProperty, scriptProperty, markerDirectoryProperty));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void initialisedAdditionalBootCliScriptSystemKeepingAlive(final File additionalBootCliScript, final File doneMarker) {
        super.log.logf(FQCN, INFO, null, initialisedAdditionalBootCliScriptSystemKeepingAlive$str(), additionalBootCliScript, doneMarker);
    }
    protected String initialisedAdditionalBootCliScriptSystemKeepingAlive$str() {
        return "WFLYCTL0465: Initialised the additional boot CLI script functionality. The CLI commands will be read from %s. The server will remain running in admin-only mode after these have been executed, and the result of the cli operations will be written to %s";
    }
    @Override
    public final void initialisedAdditionalBootCliScriptSystemNotKeepingAlive(final File additionalBootCliScript) {
        super.log.logf(FQCN, INFO, null, initialisedAdditionalBootCliScriptSystemNotKeepingAlive$str(), additionalBootCliScript);
    }
    protected String initialisedAdditionalBootCliScriptSystemNotKeepingAlive$str() {
        return "WFLYCTL0466: Initialised the additional boot CLI script functionality. The CLI commands will be read from %s. The server will be rebooted to normal mode after these have been executed";
    }
    @Override
    public final void executingBootCliScript(final File additionalBootCliScript) {
        super.log.logf(FQCN, INFO, null, executingBootCliScript$str(), additionalBootCliScript);
    }
    protected String executingBootCliScript$str() {
        return "WFLYCTL0467: Running the additional commands from the CLI script %s against the server which is running in admin-only mode";
    }
    @Override
    public final void completedRunningBootCliScript() {
        super.log.logf(FQCN, INFO, null, completedRunningBootCliScript$str());
    }
    protected String completedRunningBootCliScript$str() {
        return "WFLYCTL0468: Completed running the commands from the CLI script";
    }
    @Override
    public final void restartingServerAfterBootCliScript(final File shutdownInitiated, final String cliScriptProperty, final String skipReloadProperty, final String markerDirectoryProperty) {
        super.log.logf(FQCN, INFO, null, restartingServerAfterBootCliScript$str(), shutdownInitiated, cliScriptProperty, skipReloadProperty, markerDirectoryProperty);
    }
    protected String restartingServerAfterBootCliScript$str() {
        return "WFLYCTL0469: Restarting the server since the additional commands from the CLI script requires a restart. This will record that the restart has been initiated in the marker file %s since the restart mechanism will preserve all properties pertaining to the additional boot CLI script functionality (%s, %s, %s). The restart maintains the admin-only running mode, so a subsequent reload will happen";
    }
    @Override
    public final void reloadingServerToNormalModeAfterAdditionalBootCliScript(final String cliScriptProperty, final String skipReloadProperty, final String markerDirectoryProperty) {
        super.log.logf(FQCN, INFO, null, reloadingServerToNormalModeAfterAdditionalBootCliScript$str(), cliScriptProperty, skipReloadProperty, markerDirectoryProperty);
    }
    protected String reloadingServerToNormalModeAfterAdditionalBootCliScript$str() {
        return "WFLYCTL0470: Reloading the server to normal mode after execution of the additional commands from the CLI script. This will clear the properties triggering the additional boot cli script functionality if they were set (%s, %s, %s), and delete the marker file indicating the server was restarted";
    }
    @Override
    public final void reloadingServerToNormalModeAfterRestartAfterAdditionalBootCliScript(final String cliScriptProperty, final String skipReloadProperty, final String markerDirectoryProperty) {
        super.log.logf(FQCN, INFO, null, reloadingServerToNormalModeAfterRestartAfterAdditionalBootCliScript$str(), cliScriptProperty, skipReloadProperty, markerDirectoryProperty);
    }
    protected String reloadingServerToNormalModeAfterRestartAfterAdditionalBootCliScript$str() {
        return "WFLYCTL0471: Reloading the server to normal mode after restart follwoing execution of the additional commands from the CLI script. This will clear the properties triggering the additional boot cli script functionality if they were set (%s, %s, %s)";
    }
    @Override
    public final void checkingForPresenceOfRestartMarkerFile() {
        super.log.logf(FQCN, INFO, null, checkingForPresenceOfRestartMarkerFile$str());
    }
    protected String checkingForPresenceOfRestartMarkerFile$str() {
        return "WFLYCTL0472: Checking for presence of marker file indicating that the server has been restarted following execution of the additional commands from the CLI script";
    }
    @Override
    public final void foundRestartMarkerFile(final File file) {
        super.log.logf(FQCN, INFO, null, foundRestartMarkerFile$str(), file);
    }
    protected String foundRestartMarkerFile$str() {
        return "WFLYCTL0473: Marker file indicating that the server has been restarted following execution of the additional commands from the CLI script found at %s";
    }
    @Override
    public final void noRestartMarkerFile() {
        super.log.logf(FQCN, INFO, null, noRestartMarkerFile$str());
    }
    protected String noRestartMarkerFile$str() {
        return "WFLYCTL0474: No marker file found indicating that the server has been restarted following execution of the additional commands from the CLI script";
    }
    protected String invalidAttributeValue1$str() {
        return "WFLYCTL0475: Value for attribute '%s' is invalid.";
    }
    @Override
    public final OperationFailedException invalidAttributeValue(final String attributeName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidAttributeValue1$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidCredentialReferenceValue$str() {
        return "WFLYCTL0476: Value for attribute '%s' is invalid: either '%s' must be specified on its own or '%s' needs to be specified with at least one of '%s' or '%s'";
    }
    @Override
    public final OperationFailedException invalidCredentialReferenceValue(final String attributeName, final String clearTextAttributeName, final String credentialStoreAttributeName, final String clearTextAttributeName1, final String alias) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidCredentialReferenceValue$str(), attributeName, clearTextAttributeName, credentialStoreAttributeName, clearTextAttributeName1, alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidParameterName$str() {
        return "WFLYCTL0477: Parameter name '%s' is invalid.";
    }
    @Override
    public final IllegalArgumentException invalidParameterName(final String parameterName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidParameterName$str(), parameterName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToBuildCommandCredentialSource$str() {
        return "WFLYCTL0478: Unable to create command based CredentialSource for credential reference.";
    }
    @Override
    public final OperationFailedException unableToBuildCommandCredentialSource(final Throwable throwable) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToBuildCommandCredentialSource$str()), throwable);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String attributeUnresolvableUsingSimpleResolution$str() {
        return "WFLYCTL0479: Attribute '%s' at resource '%s' with unresolved value '%s' cannot be resolved using the non-security-sensitive resolution sources supported by the 'resolve' parameter. Response will report the unresolved value.";
    }
    @Override
    public final String attributeUnresolvableUsingSimpleResolution(final String attribute, final String address, final ModelNode unresolved) {
        return String.format(getLoggingLocale(), attributeUnresolvableUsingSimpleResolution$str(), attribute, address, unresolved);
    }
    protected String expressionUnresolvableUsingSimpleResolution$str() {
        return "WFLYCTL0480: Expression '%s' cannot be resolved using the non-security-sensitive resolution sources supported by the '%s' operation. Response will report the unresolved value.";
    }
    @Override
    public final String expressionUnresolvableUsingSimpleResolution(final ModelNode unresolved, final String opName) {
        return String.format(getLoggingLocale(), expressionUnresolvableUsingSimpleResolution$str(), unresolved, opName);
    }
    @Override
    public final void runtimePackageDependencyAlreadyRegistered(final String pckg, final String location) {
        super.log.logf(FQCN, WARN, null, runtimePackageDependencyAlreadyRegistered$str(), pckg, location);
    }
    protected String runtimePackageDependencyAlreadyRegistered$str() {
        return "WFLYCTL0481: The runtime dependency package '%s' is already registered at location '%s'";
    }
    protected String illegalCharsetName$str() {
        return "WFLYCTL0482: Value '%s' is not a legal charset name";
    }
    @Override
    public final OperationFailedException illegalCharsetName(final String charset) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), illegalCharsetName$str(), charset));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedCharset$str() {
        return "WFLYCTL0483: Charset '%s' is not supported in this instance of the Java Virtual Machine";
    }
    @Override
    public final OperationFailedException unsupportedCharset(final String charset) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unsupportedCharset$str(), charset));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidAttributeDefinition$str() {
        return "WFLYCTL0484: Attribute definition of attribute '%s' is null";
    }
    @Override
    public final IllegalArgumentException invalidAttributeDefinition(final String attributeName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidAttributeDefinition$str(), attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParseYamlConfigurationFile$str() {
        return "WFLYCTL0485: Error parsing yaml file %s";
    }
    @Override
    public final IllegalArgumentException failedToParseYamlConfigurationFile(final String path, final Throwable throwable) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), failedToParseYamlConfigurationFile$str(), path), throwable);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingYamlFile$str() {
        return "WFLYCTL0486: Missing yaml file %s";
    }
    @Override
    public final IllegalArgumentException missingYamlFile(final String path) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), missingYamlFile$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void loadingYamlFiles(final long duration, final String files) {
        super.log.logf(FQCN, DEBUG, null, loadingYamlFiles$str(), duration, files);
    }
    protected String loadingYamlFiles$str() {
        return "WFLYCTL0487: It took %s ms to load and parse the following yaml files [%s]";
    }
    @Override
    public final void noResourceRegistered(final String address) {
        super.log.logf(FQCN, WARN, null, noResourceRegistered1$str(), address);
    }
    protected String noResourceRegistered1$str() {
        return "WFLYCTL0488: No registration found for address %s - Ignoring the subtree";
    }
    protected String noResourceForUndefiningAttribute$str() {
        return "WFLYCTL0489: Can't undefine attribute %s since there is no resource at %s";
    }
    @Override
    public final IllegalArgumentException noResourceForUndefiningAttribute(final String attribute, final String address) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noResourceForUndefiningAttribute$str(), attribute, address));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void noAttributeSetForAddress(final String address) {
        super.log.logf(FQCN, WARN, null, noAttributeSetForAddress$str(), address);
    }
    protected String noAttributeSetForAddress$str() {
        return "WFLYCTL0490: A YAML resource has been defined for the address %s without any attribute. No actions will be taken.";
    }
    @Override
    public final void unexpectedValueForResource(final Object value, final String address, final String name) {
        super.log.logf(FQCN, WARN, null, unexpectedValueForResource$str(), value, address, name);
    }
    protected String unexpectedValueForResource$str() {
        return "WFLYCTL0491: We have an unexpected value %s for address %s and name %s";
    }
    @Override
    public final void noResourceRegistered(final String address, final String registration) {
        super.log.logf(FQCN, WARN, null, noResourceRegistered2$str(), address, registration);
    }
    protected String noResourceRegistered2$str() {
        return "WFLYCTL0492: Couldn't find a resource registration for address %s with current registration %s";
    }
    protected String missingListAttributeValueType$str() {
        return "WFLYCTL0493: The attribute %s hasn't a valueType properly defined.";
    }
    @Override
    public final UnsupportedOperationException missingListAttributeValueType(final String name) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), missingListAttributeValueType$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String resolverExtensionExpressionsNotAllowed$str() {
        return "WFLYCTL0494: Resolution of extension expression '%s' is not allowed at this point.";
    }
    @Override
    public final ExpressionResolutionServerException resolverExtensionExpressionsNotAllowed(final String expression) {
        final ExpressionResolutionServerException result = new ExpressionResolutionServerException(String.format(getLoggingLocale(), resolverExtensionExpressionsNotAllowed$str(), expression));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void adminOnlyPolicyDeprecatedValue() {
        super.log.logf(FQCN, INFO, null, adminOnlyPolicyDeprecatedValue$str());
    }
    protected String adminOnlyPolicyDeprecatedValue$str() {
        return "WFLYCTL0495: \"fetch-from-master\" is a deprecated value for \"domain-controller.remote.admin-only-policy\", \"fetch-from-domain-controller\" will be used instead.";
    }
    @Override
    public final void threadDump(final String dump) {
        super.log.logv(FQCN, WARN, null, threadDump$str(), dump);
    }
    protected String threadDump$str() {
        return "WFLYCTL0496: Thread dump:\n*******************************************************************************\n{0}\n===============================================================================\nEnd Thread dump\n*******************************************************************************\n";
    }
    @Override
    public final void deadLock(final String dump) {
        super.log.logv(FQCN, WARN, null, deadLock$str(), dump);
    }
    protected String deadLock$str() {
        return "WFLYCTL0497: Deadlock detected!\n*******************************************************************************\n{0}\n===============================================================================\nEnd Deadlock\n*******************************************************************************\n";
    }
    @Override
    public final void threadDumpException(final Exception cause) {
        super.log.logf(FQCN, WARN, cause, threadDumpException$str());
    }
    protected String threadDumpException$str() {
        return "WFLYCTL0498: Exception thrown during generation of thread dump";
    }
    protected String errorConstructingYAMLMapping$str() {
        return "While constructing a mapping; %s; expected a mapping for merging, but found %s";
    }
    @Override
    public final String errorConstructingYAMLMapping(final Mark mark, final NodeId node) {
        return String.format(getLoggingLocale(), errorConstructingYAMLMapping$str(), mark, node);
    }
    protected String argYaml$str() {
        return "The yaml configuration files for customizing the configuration. Paths can be absolute, relative to the current execution directory or relative to the standalone configuration directory.";
    }
    @Override
    public final String argYaml() {
        return String.format(getLoggingLocale(), argYaml$str());
    }
    protected String noSatisfactoryCapability$str() {
        return "WFLYCTL0499: There is no satisfactory capability '%s' available to resources with capability scope '%s'. This capability is registered at address(es) '%s', and are not accessible to resources with scope '%s'.";
    }
    @Override
    public final IllegalStateException noSatisfactoryCapability(final String capability, final String scopeName, final Set<RegistrationPoint> addresses, final String scopeNameAgain) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noSatisfactoryCapability$str(), capability, scopeName, addresses, scopeNameAgain));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void uuidIsEmpty(final String path) {
        super.log.logf(FQCN, WARN, null, uuidIsEmpty$str(), path);
    }
    protected String uuidIsEmpty$str() {
        return "WFLYCTL0500: There is no UUID string at '%s'. A new value will be generated.";
    }
    @Override
    public final void uuidNotValid(final String corruptedUuid, final String path) {
        super.log.logf(FQCN, WARN, null, uuidNotValid$str(), corruptedUuid, path);
    }
    protected String uuidNotValid$str() {
        return "WFLYCTL0501: An invalid UUID string '%s' was found at '%s'. A new value will be generated.";
    }
    protected String noChildResource$str() {
        return "WFLYCTL0502: No child resource called '%s' could be found at address '%s'.";
    }
    @Override
    public final IllegalArgumentException noChildResource(final String name, final String address) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noChildResource$str(), name, address));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToPublishConfigurationInvalidRemote$str() {
        return "WFLYCTL0503: Failed to publish configuration, because the remote name %s is not valid.";
    }
    @Override
    public final ConfigurationPersistenceException failedToPublishConfigurationInvalidRemote(final String name) {
        final ConfigurationPersistenceException result = new ConfigurationPersistenceException(String.format(getLoggingLocale(), failedToPublishConfigurationInvalidRemote$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingOperationForResource$str() {
        return "WFLYCTL0504: The operation %s is not defined for resource %s.";
    }
    @Override
    public final UnsupportedOperationException missingOperationForResource(final String op, final String address) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), missingOperationForResource$str(), op, address));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unstableSubsystemNamespace$str() {
        return "WFLYCTL0505: %s subsystem namespace %s is not enabled by the current stability level";
    }
    @Override
    public final XMLStreamException unstableSubsystemNamespace(final String subsystemName, final String namespaceURI) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unstableSubsystemNamespace$str(), subsystemName, namespaceURI));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void unstableExtension(final String extensionName, final String moduleName) {
        super.log.logf(FQCN, WARN, null, unstableExtension$str(), extensionName, moduleName);
    }
    protected String unstableExtension$str() {
        return "WFLYCTL0506: Extension %s from module %s is not enabled by the current stability level";
    }
    protected String unsupportedDeployment$str() {
        return "WFLYCTL0507: Unsuported deployment yaml file %s with attributes %s";
    }
    @Override
    public final IllegalArgumentException unsupportedDeployment(final String deployment, final Set<String> attributes) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unsupportedDeployment$str(), deployment, attributes));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ignoreYamlElement$str() {
        return "WFLYCTL0508: The yaml element '%s' and its sub-elements are ignored.";
    }
    @Override
    public final String ignoreYamlElement(final String element) {
        return String.format(getLoggingLocale(), ignoreYamlElement$str(), element);
    }
    protected String ignoreYamlSubElement$str() {
        return " Thus ignoring element '%s'.";
    }
    @Override
    public final String ignoreYamlSubElement(final String element) {
        return String.format(getLoggingLocale(), ignoreYamlSubElement$str(), element);
    }
    protected String noAttributeDefined$str() {
        return "WFLYCTL0509: No attribute called '%s' is defined at address '%s'.";
    }
    @Override
    public final IllegalArgumentException noAttributeDefined(final String name, final String address) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noAttributeDefined$str(), name, address));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalOperationForAttribute$str() {
        return "WFLYCTL0510: No operation %s can be executed for attribute called '%s' is defined at address '%s'.";
    }
    @Override
    public final IllegalArgumentException illegalOperationForAttribute(final String operationName, final String attribute, final String address) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalOperationForAttribute$str(), operationName, attribute, address));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void noAttributeValueDefined(final String name, final String address) {
        super.log.logf(FQCN, WARN, null, noAttributeValueDefined$str(), name, address);
    }
    protected String noAttributeValueDefined$str() {
        return "WFLYCTL0511: No value is defined for attribute '%s'  at address '%s'.";
    }
    @Override
    public final void removingUnexistingResource(final String address) {
        super.log.logf(FQCN, WARN, null, removingUnexistingResource$str(), address);
    }
    protected String removingUnexistingResource$str() {
        return "WFLYCTL0512: No resource exists at address '%s'. Ignoring the remove opreation.";
    }
    protected String unsupportedNamespace$str() {
        return "WFLYCTL0513: The XML namespace of %s is no longer supported.";
    }
    @Override
    public final XMLStreamException unsupportedNamespace(final QName name, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unsupportedNamespace$str(), name), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unstableManagementNamespace$str() {
        return "WFLYCTL0514: Management namespace %s is not enabled by the current stability level";
    }
    @Override
    public final XMLStreamException unstableManagementNamespace(final String namespaceURI) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unstableManagementNamespace$str(), namespaceURI));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void systemPropertyDeprecated(final String systemProperty, final String attribute, final String address) {
        super.log.logf(FQCN, INFO, null, systemPropertyDeprecated$str(), systemProperty, attribute, address);
    }
    protected String systemPropertyDeprecated$str() {
        return "WFLYCTL0515: The system property '%s' is deprecated and may be removed in a future version, attribute '%s' on resource '%s' should be used instead.";
    }
    protected String invalidModuleNameParameter$str() {
        return "WFLYCTL0516: Parameter %s specifies an invalid module name: %s";
    }
    @Override
    public final OperationFailedException invalidModuleNameParameter(final String parameterName, final String moduleName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidModuleNameParameter$str(), parameterName, moduleName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void multipleParallelBootOperation() {
        super.log.logf(FQCN, WARN, null, multipleParallelBootOperation$str());
    }
    protected String multipleParallelBootOperation$str() {
        return "WFLYCTL0517: There are multiple Parallel Boot Operations.";
    }
}
