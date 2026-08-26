package org.jboss.as.server.logging;

import java.util.Locale;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.lang.String;
import java.util.jar.Attributes.Name;
import java.lang.IllegalArgumentException;
import org.jboss.as.version.Stability;
import org.jboss.as.server.deployment.DeploymentUnitProcessor;
import org.jboss.msc.service.ServiceName;
import org.jboss.msc.service.ServiceNotFoundException;
import org.jboss.as.server.suspend.SuspendableActivity;
import org.jboss.msc.service.ServiceController.State;
import java.lang.Throwable;
import java.lang.Class;
import java.util.Arrays;
import java.io.File;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import org.jboss.vfs.VirtualFile;
import org.jboss.modules.ModuleLoadException;
import java.lang.IllegalStateException;
import org.jboss.as.server.deployment.Phase;
import java.util.Set;
import java.lang.StringBuilder;
import org.jboss.logging.DelegatingBasicLogger;
import java.net.URISyntaxException;
import org.jboss.logging.Logger;
import java.net.URL;
import org.jboss.as.server.deployment.module.ResourceRoot;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import java.lang.ClassLoader;
import org.jboss.msc.service.StartException;
import java.io.InvalidObjectException;
import org.jboss.modules.ModuleIdentifier;
import org.wildfly.security.mechanism.AuthenticationMechanismException;
import java.nio.file.Path;
import javax.annotation.processing.Generated;
import org.jboss.as.server.deployment.MountType;
import java.net.UnknownHostException;
import javax.xml.namespace.QName;
import org.jboss.as.controller.OperationFailedException;
import java.util.zip.ZipException;
import java.io.IOException;
import org.jboss.invocation.proxy.MethodIdentifier;
import java.lang.Exception;
import org.jboss.as.server.deployment.module.ExtensionListEntry;
import javax.xml.stream.XMLStreamException;
import org.jboss.as.controller.PathAddress;
import org.jboss.as.server.deployment.DeploymentUnit;
import javax.xml.stream.Location;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.FATAL;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:26:25+0200")
public class ServerLogger_$logger extends DelegatingBasicLogger implements ServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ServerLogger_$logger.class.getName();
    public ServerLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void jbossDeploymentStructureIgnored(final String file) {
        super.log.logf(FQCN, WARN, null, jbossDeploymentStructureIgnored$str(), file);
    }
    protected String jbossDeploymentStructureIgnored$str() {
        return "WFLYSRV0001: %s in subdeployment ignored. jboss-deployment-structure.xml is only parsed for top level deployments.";
    }
    @Override
    public final void cannotLoadAnnotationIndex(final String index, final String message) {
        super.log.logf(FQCN, WARN, null, cannotLoadAnnotationIndex$str(), index, message);
    }
    protected String cannotLoadAnnotationIndex$str() {
        return "WFLYSRV0002: Loading failed for the annotation index \"%s\" with the following exception: %s";
    }
    @Override
    public final void cannotIndexClass(final String className, final String resourceRoot, final Throwable throwable) {
        super.log.logf(FQCN, WARN, throwable, cannotIndexClass$str(), className, resourceRoot);
    }
    protected String cannotIndexClass$str() {
        return "WFLYSRV0003: Could not index class %s at %s";
    }
    @Override
    public final void undeploymentRolledBack(final String deployment, final String message) {
        super.log.logf(FQCN, ERROR, null, undeploymentRolledBack$str(), deployment, message);
    }
    protected String undeploymentRolledBack$str() {
        return "WFLYSRV0007: Undeploy of deployment \"%s\" was rolled back with the following failure message: %s";
    }
    @Override
    public final void undeploymentRolledBackWithNoMessage(final String deployment) {
        super.log.logf(FQCN, ERROR, null, undeploymentRolledBackWithNoMessage$str(), deployment);
    }
    protected String undeploymentRolledBackWithNoMessage$str() {
        return "WFLYSRV0008: Undeploy of deployment \"%s\" was rolled back with no failure message";
    }
    @Override
    public final void deploymentUndeployed(final String managementName, final String deploymentUnitName) {
        super.log.logf(FQCN, INFO, null, deploymentUndeployed$str(), managementName, deploymentUnitName);
    }
    protected String deploymentUndeployed$str() {
        return "WFLYSRV0009: Undeployed \"%s\" (runtime-name: \"%s\")";
    }
    @Override
    public final void deploymentDeployed(final String managementName, final String deploymentUnitName) {
        super.log.logf(FQCN, INFO, null, deploymentDeployed$str(), managementName, deploymentUnitName);
    }
    protected String deploymentDeployed$str() {
        return "WFLYSRV0010: Deployed \"%s\" (runtime-name : \"%s\")";
    }
    @Override
    public final void redeployRolledBack(final String deployment, final String message) {
        super.log.logf(FQCN, ERROR, null, redeployRolledBack$str(), deployment, message);
    }
    protected String redeployRolledBack$str() {
        return "WFLYSRV0011: Redeploy of deployment \"%s\" was rolled back with the following failure message: %s";
    }
    @Override
    public final void redeployRolledBackWithNoMessage(final String deployment) {
        super.log.logf(FQCN, ERROR, null, redeployRolledBackWithNoMessage$str(), deployment);
    }
    protected String redeployRolledBackWithNoMessage$str() {
        return "WFLYSRV0012: Redeploy of deployment \"%s\" was rolled back with no failure message";
    }
    @Override
    public final void deploymentRedeployed(final String deploymentName) {
        super.log.logf(FQCN, INFO, null, deploymentRedeployed$str(), deploymentName);
    }
    protected String deploymentRedeployed$str() {
        return "WFLYSRV0013: Redeployed \"%s\"";
    }
    @Override
    public final void replaceRolledBack(final String replaced, final String deployment, final String message) {
        super.log.logf(FQCN, ERROR, null, replaceRolledBack$str(), replaced, deployment, message);
    }
    protected String replaceRolledBack$str() {
        return "WFLYSRV0014: Replacement of deployment \"%s\" by deployment \"%s\" was rolled back with the following failure message: %s";
    }
    @Override
    public final void replaceRolledBackWithNoMessage(final String replaced, final String deployment) {
        super.log.logf(FQCN, ERROR, null, replaceRolledBackWithNoMessage$str(), replaced, deployment);
    }
    protected String replaceRolledBackWithNoMessage$str() {
        return "WFLYSRV0015: Replacement of deployment \"%s\" by deployment \"%s\" was rolled back with no failure message";
    }
    @Override
    public final void deploymentReplaced(final String replaced, final String deployment) {
        super.log.logf(FQCN, INFO, null, deploymentReplaced$str(), replaced, deployment);
    }
    protected String deploymentReplaced$str() {
        return "WFLYSRV0016: Replaced deployment \"%s\" with deployment \"%s\"";
    }
    @Override
    public final void annotationImportIgnored(final ModuleIdentifier annotationModuleId, final ModuleIdentifier additionalModuleId) {
        super.log.logf(FQCN, WARN, null, annotationImportIgnored$str(), annotationModuleId, additionalModuleId);
    }
    protected String annotationImportIgnored$str() {
        return "WFLYSRV0017: Annotations import option %s specified in jboss-deployment-structure.xml for additional module %s has been ignored. Additional modules cannot import annotations.";
    }
    @Override
    public final void privateApiUsed(final String deployment, final String dependency) {
        super.log.logf(FQCN, WARN, null, privateApiUsed$str(), deployment, dependency);
    }
    protected String privateApiUsed$str() {
        return "WFLYSRV0018: Deployment \"%s\" is using a private module (\"%s\") which may be changed or removed in future versions without notice.";
    }
    @Override
    public final void unsupportedApiUsed(final String deployment, final String dependency) {
        super.log.logf(FQCN, WARN, null, unsupportedApiUsed$str(), deployment, dependency);
    }
    protected String unsupportedApiUsed$str() {
        return "WFLYSRV0019: Deployment \"%s\" is using an unsupported module (\"%s\") which may be changed or removed in future versions without notice.";
    }
    @Override
    public final void failedToRemoveDeploymentContent(final Throwable cause, final String hash) {
        super.log.logf(FQCN, WARN, cause, failedToRemoveDeploymentContent$str(), hash);
    }
    protected String failedToRemoveDeploymentContent$str() {
        return "WFLYSRV0020: Exception occurred removing deployment content %s";
    }
    @Override
    public final void deploymentRolledBack(final String deployment, final String message) {
        super.log.logf(FQCN, ERROR, null, deploymentRolledBack$str(), deployment, message);
    }
    protected String deploymentRolledBack$str() {
        return "WFLYSRV0021: Deploy of deployment \"%s\" was rolled back with the following failure message: %s";
    }
    @Override
    public final void deploymentRolledBackWithNoMessage(final String deployment) {
        super.log.logf(FQCN, ERROR, null, deploymentRolledBackWithNoMessage$str(), deployment);
    }
    protected String deploymentRolledBackWithNoMessage$str() {
        return "WFLYSRV0022: Deploy of deployment \"%s\" was rolled back with no failure message";
    }
    @Override
    public final void failedToParseCommandLineInteger(final String property, final String value) {
        super.log.logf(FQCN, WARN, null, failedToParseCommandLineInteger$str(), property, value);
    }
    protected String failedToParseCommandLineInteger$str() {
        return "WFLYSRV0023: Failed to parse property (%s), value (%s) as an integer";
    }
    @Override
    public final void cannotAddURLStreamHandlerFactory(final Exception cause, final String moduleID) {
        super.log.logf(FQCN, ERROR, cause, cannotAddURLStreamHandlerFactory$str(), moduleID);
    }
    protected String cannotAddURLStreamHandlerFactory$str() {
        return "WFLYSRV0024: Cannot add module '%s' as URLStreamHandlerFactory provider";
    }
    @Override
    public final void startedClean(final String bootStatisticsMessage) {
        super.log.logf(FQCN, INFO, null, startedClean$str(), bootStatisticsMessage);
    }
    protected String startedClean$str() {
        return "WFLYSRV0025: %s";
    }
    @Override
    public final void startedWitErrors(final String bootStatisticsMessage) {
        super.log.logf(FQCN, ERROR, null, startedWitErrors$str(), bootStatisticsMessage);
    }
    protected String startedWitErrors$str() {
        return "WFLYSRV0026: %s";
    }
    @Override
    public final void startingDeployment(final String managementName, final String deploymentUnitName) {
        super.log.logf(FQCN, INFO, null, startingDeployment$str(), managementName, deploymentUnitName);
    }
    protected String startingDeployment$str() {
        return "WFLYSRV0027: Starting deployment of \"%s\" (runtime-name: \"%s\")";
    }
    @Override
    public final void stoppedDeployment(final String managementName, final String deploymentUnitName, final int elapsedTime) {
        super.log.logf(FQCN, INFO, null, stoppedDeployment$str(), managementName, deploymentUnitName, elapsedTime);
    }
    protected String stoppedDeployment$str() {
        return "WFLYSRV0028: Stopped deployment %s (runtime-name: %s) in %dms";
    }
    @Override
    public final void nativeManagementInterfaceIsUnsecured() {
        super.log.logf(FQCN, WARN, null, nativeManagementInterfaceIsUnsecured$str());
    }
    protected String nativeManagementInterfaceIsUnsecured$str() {
        return "WFLYSRV0034: No security realm or sasl server authentication defined for native management service; all access will be unrestricted.";
    }
    @Override
    public final void httpManagementInterfaceIsUnsecured() {
        super.log.logf(FQCN, WARN, null, httpManagementInterfaceIsUnsecured$str());
    }
    protected String httpManagementInterfaceIsUnsecured$str() {
        return "WFLYSRV0035: No security realm or http server authentication defined for http management service; all access will be unrestricted.";
    }
    @Override
    public final void creatingHttpManagementServiceOnSocket(final String socketName) {
        super.log.logf(FQCN, INFO, null, creatingHttpManagementServiceOnSocket$str(), socketName);
    }
    protected String creatingHttpManagementServiceOnSocket$str() {
        return "WFLYSRV0039: Creating http management service using socket-binding (%s)";
    }
    @Override
    public final void creatingHttpManagementServiceOnSecureSocket(final String secureSocketName) {
        super.log.logf(FQCN, INFO, null, creatingHttpManagementServiceOnSecureSocket$str(), secureSocketName);
    }
    protected String creatingHttpManagementServiceOnSecureSocket$str() {
        return "WFLYSRV0040: Creating http management service using secure-socket-binding (%s)";
    }
    @Override
    public final void creatingHttpManagementServiceOnSocketAndSecureSocket(final String socketName, final String secureSocketName) {
        super.log.logf(FQCN, INFO, null, creatingHttpManagementServiceOnSocketAndSecureSocket$str(), socketName, secureSocketName);
    }
    protected String creatingHttpManagementServiceOnSocketAndSecureSocket$str() {
        return "WFLYSRV0041: Creating http management service using socket-binding (%s) and secure-socket-binding (%s)";
    }
    @Override
    public final void caughtExceptionClosingContentInputStream(final Exception cause) {
        super.log.logf(FQCN, WARN, cause, caughtExceptionClosingContentInputStream$str());
    }
    protected String caughtExceptionClosingContentInputStream$str() {
        return "WFLYSRV0042: Caught exception closing input stream for uploaded deployment content";
    }
    @Override
    public final void caughtExceptionUndeploying(final Throwable cause, final DeploymentUnitProcessor dup, final Phase phase, final DeploymentUnit unit) {
        super.log.logf(FQCN, ERROR, cause, caughtExceptionUndeploying$str(), dup, phase, unit);
    }
    protected String caughtExceptionUndeploying$str() {
        return "WFLYSRV0043: Deployment unit processor %s unexpectedly threw an exception during undeploy phase %s of %s";
    }
    @Override
    public final void extensionMissingManifestAttribute(final String item, final String again, final Name suffix) {
        super.log.logf(FQCN, WARN, null, extensionMissingManifestAttribute$str(), item, again, suffix);
    }
    protected String extensionMissingManifestAttribute$str() {
        return "WFLYSRV0045: Extension %s is missing the required manifest attribute %s-%s (skipping extension)";
    }
    @Override
    public final void invalidExtensionURI(final String item, final URISyntaxException e) {
        super.log.logf(FQCN, WARN, null, invalidExtensionURI$str(), item, e);
    }
    protected String invalidExtensionURI$str() {
        return "WFLYSRV0046: Extension %s URI syntax is invalid: %s";
    }
    @Override
    public final void cannotFindExtensionListEntry(final ExtensionListEntry entry, final ResourceRoot resourceRoot) {
        super.log.logf(FQCN, WARN, null, cannotFindExtensionListEntry$str(), entry, resourceRoot);
    }
    protected String cannotFindExtensionListEntry$str() {
        return "WFLYSRV0047: Could not find Extension-List entry %s referenced from %s";
    }
    @Override
    public final void duplicateServerNameConfiguration(final String systemProperty, final String rawServerProp, final String processName) {
        super.log.logf(FQCN, WARN, null, duplicateServerNameConfiguration$str(), systemProperty, rawServerProp, processName);
    }
    protected String duplicateServerNameConfiguration$str() {
        return "WFLYSRV0048: A server name configuration was provided both via system property %s ('%s') and via the xml configuration ('%s'). The xml configuration value will be used.";
    }
    @Override
    public final void serverStarting(final String prettyVersion, final String banner) {
        super.log.logf(FQCN, INFO, null, serverStarting$str(), prettyVersion, banner);
    }
    protected String serverStarting$str() {
        return "WFLYSRV0049: %s starting%s";
    }
    @Override
    public final void serverStopped(final String prettyVersion, final int time) {
        super.log.logf(FQCN, INFO, null, serverStopped$str(), prettyVersion, time);
    }
    protected String serverStopped$str() {
        return "WFLYSRV0050: %s stopped in %dms";
    }
    @Override
    public final void logHttpConsole(final String httpAddr, final int httpPort) {
        super.log.logf(FQCN, INFO, null, logHttpConsole$str(), httpAddr, httpPort);
    }
    protected String logHttpConsole$str() {
        return "WFLYSRV0051: Admin console listening on http://%s:%d";
    }
    @Override
    public final void logHttpsConsole(final String httpsAddr, final int httpsPort) {
        super.log.logf(FQCN, INFO, null, logHttpsConsole$str(), httpsAddr, httpsPort);
    }
    protected String logHttpsConsole$str() {
        return "WFLYSRV0052: Admin console listening on https://%s:%d";
    }
    @Override
    public final void logHttpAndHttpsConsole(final String httpAddr, final int httpPort, final String httpsAddr, final int httpsPort) {
        super.log.logf(FQCN, INFO, null, logHttpAndHttpsConsole$str(), httpAddr, httpPort, httpsAddr, httpsPort);
    }
    protected String logHttpAndHttpsConsole$str() {
        return "WFLYSRV0053: Admin console listening on http://%s:%d and https://%s:%d";
    }
    @Override
    public final void logNoConsole() {
        super.log.logf(FQCN, INFO, null, logNoConsole$str());
    }
    protected String logNoConsole$str() {
        return "WFLYSRV0054: Admin console is not enabled";
    }
    @Override
    public final void caughtExceptionDuringBoot(final Throwable e) {
        super.log.logf(FQCN, ERROR, e, caughtExceptionDuringBoot$str());
    }
    protected String caughtExceptionDuringBoot$str() {
        return "WFLYSRV0055: Caught exception during boot";
    }
    protected String unsuccessfulBoot$str() {
        return "WFLYSRV0056: Server boot has failed in an unrecoverable manner; exiting. See previous messages for details. %s";
    }
    @Override
    public final String unsuccessfulBoot(final String append) {
        return String.format(getLoggingLocale(), unsuccessfulBoot$str(), append);
    }
    @Override
    public final void reportAdminOnlyMissingDeploymentContent(final String contentHash, final String deploymentName) {
        super.log.logf(FQCN, ERROR, null, reportAdminOnlyMissingDeploymentContent$str(), contentHash, deploymentName);
    }
    protected String reportAdminOnlyMissingDeploymentContent$str() {
        return "WFLYSRV0057: No deployment content with hash %s is available in the deployment content repository for deployment %s. Because this Host Controller is booting in ADMIN-ONLY mode, boot will be allowed to proceed to provide administrators an opportunity to correct this problem. If this Host Controller were not in ADMIN-ONLY mode this would be a fatal boot failure.";
    }
    @Override
    public final void additionalResourceRootDoesNotExist(final String resourceRoot) {
        super.log.logf(FQCN, WARN, null, additionalResourceRootDoesNotExist$str(), resourceRoot);
    }
    protected String additionalResourceRootDoesNotExist$str() {
        return "WFLYSRV0058: Additional resource root %s added via jboss-deployment-structure.xml does not exist";
    }
    @Override
    public final void classPathEntryNotValid(final String classPathEntry, final String resourceRoot) {
        super.log.logf(FQCN, WARN, null, classPathEntryNotValid$str(), classPathEntry, resourceRoot);
    }
    protected String classPathEntryNotValid$str() {
        return "WFLYSRV0059: Class Path entry %s in %s  does not point to a valid jar for a Class-Path reference.";
    }
    @Override
    public final void logHttpManagement(final String httpAddr, final int httpPort) {
        super.log.logf(FQCN, INFO, null, logHttpManagement$str(), httpAddr, httpPort);
    }
    protected String logHttpManagement$str() {
        return "WFLYSRV0060: Http management interface listening on http://%s:%d/management";
    }
    @Override
    public final void logHttpsManagement(final String httpsAddr, final int httpsPort) {
        super.log.logf(FQCN, INFO, null, logHttpsManagement$str(), httpsAddr, httpsPort);
    }
    protected String logHttpsManagement$str() {
        return "WFLYSRV0061: Http management interface listening on https://%s:%d/management";
    }
    @Override
    public final void logHttpAndHttpsManagement(final String httpAddr, final int httpPort, final String httpsAddr, final int httpsPort) {
        super.log.logf(FQCN, INFO, null, logHttpAndHttpsManagement$str(), httpAddr, httpPort, httpsAddr, httpsPort);
    }
    protected String logHttpAndHttpsManagement$str() {
        return "WFLYSRV0062: Http management interface listening on http://%s:%d/management and https://%s:%d/management";
    }
    @Override
    public final void logNoHttpManagement() {
        super.log.logf(FQCN, INFO, null, logNoHttpManagement$str());
    }
    protected String logNoHttpManagement$str() {
        return "WFLYSRV0063: Http management interface is not enabled";
    }
    @Override
    public final void jbossDeploymentStructureNamespaceIgnored(final String deploymentUnitName) {
        super.log.logf(FQCN, WARN, null, jbossDeploymentStructureNamespaceIgnored$str(), deploymentUnitName);
    }
    protected String jbossDeploymentStructureNamespaceIgnored$str() {
        return "WFLYSRV0064: urn:jboss:deployment-structure namespace found in jboss.xml for a sub deployment %s. This is only valid in a top level deployment.";
    }
    @Override
    public final void failedToUnmountContentOverride(final Throwable cause) {
        super.log.logf(FQCN, WARN, cause, failedToUnmountContentOverride$str());
    }
    protected String failedToUnmountContentOverride$str() {
        return "WFLYSRV0065: Failed to unmount deployment overlay";
    }
    @Override
    public final void deploymentDependenciesAreATopLevelElement(final String name) {
        super.log.logf(FQCN, WARN, null, deploymentDependenciesAreATopLevelElement$str(), name);
    }
    protected String deploymentDependenciesAreATopLevelElement$str() {
        return "WFLYSRV0067: jboss-deployment-dependencies cannot be used in a sub deployment, it must be specified at ear level: %s";
    }
    @Override
    public final void reportAdminOnlyMissingDeploymentOverlayContent(final String contentHash, final String deploymentName, final String contentName) {
        super.log.logf(FQCN, ERROR, null, reportAdminOnlyMissingDeploymentOverlayContent$str(), contentHash, deploymentName, contentName);
    }
    protected String reportAdminOnlyMissingDeploymentOverlayContent$str() {
        return "WFLYSRV0068: No deployment overlay content with hash %s is available in the deployment content repository for deployment %s at location %s. Because this Host Controller is booting in ADMIN-ONLY mode, boot will be allowed to proceed to provide administrators an opportunity to correct this problem. If this Host Controller were not in ADMIN-ONLY mode this would be a fatal boot failure.";
    }
    @Override
    public final void deploymentRestartDetected(final String deployment) {
        super.log.logf(FQCN, INFO, null, deploymentRestartDetected$str(), deployment);
    }
    protected String deploymentRestartDetected$str() {
        return "WFLYSRV0070: Deployment restart detected for deployment %s, performing full redeploy instead.";
    }
    @Override
    public final void fdTooLow(final long fdCount) {
        super.log.logf(FQCN, WARN, null, fdTooLow$str(), fdCount);
    }
    protected String fdTooLow$str() {
        return "WFLYSRV0071: The operating system has limited the number of open files to %d for this process; a value of at least 4096 is recommended";
    }
    protected String argServerConfig$str() {
        return "Name of the server configuration file to use (default is \"standalone.xml\") (Same as -c)";
    }
    @Override
    public final String argServerConfig() {
        return String.format(getLoggingLocale(), argServerConfig$str());
    }
    protected String argShortServerConfig$str() {
        return "Name of the server configuration file to use (default is \"standalone.xml\") (Same as --server-config)";
    }
    @Override
    public final String argShortServerConfig() {
        return String.format(getLoggingLocale(), argShortServerConfig$str());
    }
    protected String argReadOnlyServerConfig$str() {
        return "Name of the server configuration file to use. This differs from '--server-config' and '-c' in that the original file is never overwritten.";
    }
    @Override
    public final String argReadOnlyServerConfig() {
        return String.format(getLoggingLocale(), argReadOnlyServerConfig$str());
    }
    protected String argHelp$str() {
        return "Display this message and exit";
    }
    @Override
    public final String argHelp() {
        return String.format(getLoggingLocale(), argHelp$str());
    }
    protected String argProperties$str() {
        return "Load system properties from the given url";
    }
    @Override
    public final String argProperties() {
        return String.format(getLoggingLocale(), argProperties$str());
    }
    protected String argSecurityProperty$str() {
        return "Set a security property";
    }
    @Override
    public final String argSecurityProperty() {
        return String.format(getLoggingLocale(), argSecurityProperty$str());
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
        return "Set the server's running type to ADMIN_ONLY causing it to open administrative interfaces and accept management requests but not start other runtime services or accept end user requests. Cannot be used in conjunction with --start-mode. Deprecated; use --start-mode=admin-only instead.";
    }
    @Override
    public final String argAdminOnly() {
        return String.format(getLoggingLocale(), argAdminOnly$str());
    }
    protected String argDebugPort$str() {
        return "Activate debug mode with an optional argument to specify the port. Only works if the launch script supports it.";
    }
    @Override
    public final String argDebugPort() {
        return String.format(getLoggingLocale(), argDebugPort$str());
    }
    protected String argSecMgr$str() {
        return "Runs the server with a security manager installed.";
    }
    @Override
    public final String argSecMgr() {
        return String.format(getLoggingLocale(), argSecMgr$str());
    }
    protected String argStartMode$str() {
        return "Sets the start mode of the server, it can be either 'normal','admin-only' or 'suspend'. If this is 'suspend' the server will start in suspended mode, and will not service requests until it has been resumed. If this is started in admin-only mode the server will only open administrative interfaces and accept management requests but not start other runtime services or accept end user requests. Cannot be used in conjunction with --admin-only.";
    }
    @Override
    public final String argStartMode() {
        return String.format(getLoggingLocale(), argStartMode$str());
    }
    protected String argGracefulStartup$str() {
        return "Start the server gracefully, queuing or cleanly rejecting requests until the server is fully started";
    }
    @Override
    public final String argGracefulStartup() {
        return String.format(getLoggingLocale(), argGracefulStartup$str());
    }
    protected String argGitRepo$str() {
        return "The git repository to clone to get the server configuration.";
    }
    @Override
    public final String argGitRepo() {
        return String.format(getLoggingLocale(), argGitRepo$str());
    }
    protected String argGitBranch$str() {
        return "The git branch to use to get the server configuration. Default is 'master'";
    }
    @Override
    public final String argGitBranch() {
        return String.format(getLoggingLocale(), argGitBranch$str());
    }
    protected String argGitAuth$str() {
        return "The elytron configuration file for managing git credentials. Default is 'null'";
    }
    @Override
    public final String argGitAuth() {
        return String.format(getLoggingLocale(), argGitAuth$str());
    }
    protected String argStability$str() {
        return "Runs the server using a specific stability level.  Possible values: %s, Default = %s";
    }
    @Override
    public final String argStability(final Set<Stability> stabilities, final Stability defaultStability) {
        return String.format(getLoggingLocale(), argStability$str(), stabilities, defaultStability);
    }
    protected String valueExpectedForCommandLineOption$str() {
        return "WFLYSRV0072: Value expected for option %s";
    }
    @Override
    public final String valueExpectedForCommandLineOption(final String option) {
        return String.format(getLoggingLocale(), valueExpectedForCommandLineOption$str(), option);
    }
    protected String invalidCommandLineOption$str() {
        return "WFLYSRV0073: Invalid option '%s'";
    }
    @Override
    public final String invalidCommandLineOption(final String option) {
        return String.format(getLoggingLocale(), invalidCommandLineOption$str(), option);
    }
    protected String malformedCommandLineURL$str() {
        return "WFLYSRV0074: Malformed URL '%s' provided for option '%s'";
    }
    @Override
    public final String malformedCommandLineURL(final String urlSpec, final String option) {
        return String.format(getLoggingLocale(), malformedCommandLineURL$str(), urlSpec, option);
    }
    protected String unableToLoadProperties$str() {
        return "WFLYSRV0075: Unable to load properties from URL '%s'";
    }
    @Override
    public final String unableToLoadProperties(final URL url) {
        return String.format(getLoggingLocale(), unableToLoadProperties$str(), url);
    }
    protected String hostControllerNameNonNullInStandalone$str() {
        return "WFLYSRV0079: hostControllerName must be null if the server is not in a managed domain";
    }
    @Override
    public final IllegalArgumentException hostControllerNameNonNullInStandalone() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), hostControllerNameNonNullInStandalone$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String hostControllerNameNullInDomain$str() {
        return "WFLYSRV0080: hostControllerName may not be null if the server is in a managed domain";
    }
    @Override
    public final IllegalArgumentException hostControllerNameNullInDomain() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), hostControllerNameNullInDomain$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotResolveInterface$str() {
        return "WFLYSRV0081: An IP address cannot be resolved using the given interface selection criteria. Failure was -- %s";
    }
    @Override
    public final OperationFailedException cannotResolveInterface(final Exception msg, final Exception cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotResolveInterface$str(), msg), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToResolveInterface$str() {
        return "WFLYSRV0082: failed to resolve interface %s";
    }
    @Override
    public final StartException failedToResolveInterface(final String name) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToResolveInterface$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToStartHttpManagementService$str() {
        return "WFLYSRV0083: Failed to start the http-interface service";
    }
    @Override
    public final StartException failedToStartHttpManagementService(final Exception e) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToStartHttpManagementService$str()), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSuchDeploymentContent$str() {
        return "WFLYSRV0084: No deployment content with hash %s is available in the deployment content repository.";
    }
    @Override
    public final OperationFailedException noSuchDeploymentContent(final String hash) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noSuchDeploymentContent$str(), hash));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSuchDeployment$str() {
        return "WFLYSRV0085: No deployment with name %s found";
    }
    @Override
    public final OperationFailedException noSuchDeployment(final String deploymentName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noSuchDeployment$str(), deploymentName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotReplaceDeployment$str() {
        return "WFLYSRV0086: Cannot use %s with the same value for parameters %s and %s. Use %s to redeploy the same content or %s to replace content with a new version with the same name.";
    }
    @Override
    public final OperationFailedException cannotReplaceDeployment(final String replaceOperation, final String name, final String toReplace, final String redeployOperation, final String fullReplace) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotReplaceDeployment$str(), replaceOperation, name, toReplace, redeployOperation, fullReplace));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String deploymentAlreadyStarted$str() {
        return "WFLYSRV0087: Deployment %s is already started";
    }
    @Override
    public final OperationFailedException deploymentAlreadyStarted(final String deploymentName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), deploymentAlreadyStarted$str(), deploymentName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingHomeDirConfiguration$str() {
        return "WFLYSRV0088: Missing configuration value for: %s";
    }
    @Override
    public final IllegalStateException missingHomeDirConfiguration(final String propertyName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), missingHomeDirConfiguration$str(), propertyName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String caughtIOExceptionUploadingContent$str() {
        return "WFLYSRV0093: Caught IOException reading uploaded deployment content";
    }
    @Override
    public final OperationFailedException caughtIOExceptionUploadingContent(final IOException cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), caughtIOExceptionUploadingContent$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullStreamAttachment$str() {
        return "WFLYSRV0094: Null stream at index [%d]";
    }
    @Override
    public final OperationFailedException nullStreamAttachment(final int index) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), nullStreamAttachment$str(), index));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidDeploymentURL$str() {
        return "WFLYSRV0095: '%s' is not a valid URL";
    }
    @Override
    public final OperationFailedException invalidDeploymentURL(final String urlSpec, final MalformedURLException e) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidDeploymentURL$str(), urlSpec), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String problemOpeningStreamFromDeploymentURL$str() {
        return "WFLYSRV0096: Error obtaining input stream from URL '%s'";
    }
    @Override
    public final OperationFailedException problemOpeningStreamFromDeploymentURL(final String urlSpec, final IOException e) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), problemOpeningStreamFromDeploymentURL$str(), urlSpec), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serviceModuleLoaderAlreadyStarted$str() {
        return "WFLYSRV0097: ServiceModuleLoader already started";
    }
    @Override
    public final IllegalStateException serviceModuleLoaderAlreadyStarted() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serviceModuleLoaderAlreadyStarted$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serviceModuleLoaderAlreadyStopped$str() {
        return "WFLYSRV0098: ServiceModuleLoader already stopped";
    }
    @Override
    public final IllegalStateException serviceModuleLoaderAlreadyStopped() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serviceModuleLoaderAlreadyStopped$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingModulePrefix$str() {
        return "WFLYSRV0099: '%s' cannot be loaded from a ServiceModuleLoader as its name does not start with '%s'";
    }
    @Override
    public final IllegalArgumentException missingModulePrefix(final String name, final String prefix) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), missingModulePrefix$str(), name, prefix));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToReadVirtualFile$str() {
        return "WFLYSRV0100: Failed to read '%s'";
    }
    @Override
    public final DeploymentUnitProcessingException failedToReadVirtualFile(final VirtualFile file, final IOException cause) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToReadVirtualFile$str(), file), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String deploymentRootRequired$str() {
        return "WFLYSRV0101: Deployment root is required";
    }
    @Override
    public final IllegalArgumentException deploymentRootRequired() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), deploymentRootRequired$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String subdeploymentsRequireParent$str() {
        return "WFLYSRV0102: Sub-deployments require a parent deployment unit";
    }
    @Override
    public final IllegalArgumentException subdeploymentsRequireParent() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), subdeploymentsRequireParent$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noModuleIdentifier$str() {
        return "WFLYSRV0103: No Module Identifier attached to deployment '%s'";
    }
    @Override
    public final DeploymentUnitProcessingException noModuleIdentifier(final String deploymentUnitName) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), noModuleIdentifier$str(), deploymentUnitName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToCreateVFSResourceLoader$str() {
        return "WFLYSRV0104: Failed to create VFSResourceLoader for root [%s]";
    }
    @Override
    public final DeploymentUnitProcessingException failedToCreateVFSResourceLoader(final String resourceRoot, final IOException cause) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToCreateVFSResourceLoader$str(), resourceRoot), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToGetFileFromRemoteRepository$str() {
        return "WFLYSRV0105: Failed to get file from remote repository";
    }
    @Override
    public final RuntimeException failedToGetFileFromRemoteRepository(final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToGetFileFromRemoteRepository$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCreateLocalDirectory$str() {
        return "WFLYSRV0106: Unable to create local directory: %s";
    }
    @Override
    public final IOException cannotCreateLocalDirectory(final File path) {
        final IOException result = new IOException(String.format(getLoggingLocale(), cannotCreateLocalDirectory$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String didNotReadEntireFile$str() {
        return "WFLYSRV0107: Did not read the entire file. Missing: %d";
    }
    @Override
    public final IOException didNotReadEntireFile(final long missing) {
        final IOException result = new IOException(String.format(getLoggingLocale(), didNotReadEntireFile$str(), missing));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noArgValue$str() {
        return "WFLYSRV0108: No value was provided for argument %s%n";
    }
    @Override
    public final String noArgValue(final String argument) {
        return String.format(getLoggingLocale(), noArgValue$str(), argument);
    }
    protected String couldNotFindHcFileRepositoryConnection$str() {
        return "WFLYSRV0109: Could not find the file repository connection to the host controller.";
    }
    @Override
    public final IllegalStateException couldNotFindHcFileRepositoryConnection() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotFindHcFileRepositoryConnection$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownMountType$str() {
        return "WFLYSRV0112: Unknown mount type %s";
    }
    @Override
    public final IllegalArgumentException unknownMountType(final MountType mountType) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownMountType$str(), mountType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedCreatingTempProvider$str() {
        return "WFLYSRV0113: Failed to create temp file provider";
    }
    @Override
    public final StartException failedCreatingTempProvider(final Throwable cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedCreatingTempProvider$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String systemPropertyNotManageable$str() {
        return "WFLYSRV0115: System property %s cannot be set via the xml configuration file or from a management client; it's value must be known at initial process start so it can only set from the command line";
    }
    @Override
    public final OperationFailedException systemPropertyNotManageable(final String propertyName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), systemPropertyNotManageable$str(), propertyName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String systemPropertyCannotOverrideServerName$str() {
        return "WFLYSRV0116: System property %s cannot be set after the server name has been set via the xml configuration file or from a management client";
    }
    @Override
    public final OperationFailedException systemPropertyCannotOverrideServerName(final String propertyName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), systemPropertyCannotOverrideServerName$str(), propertyName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToInitialiseSSLContext$str() {
        return "WFLYSRV0117: Unable to initialise a basic SSLContext '%s'";
    }
    @Override
    public final IllegalStateException unableToInitialiseSSLContext(final String message) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unableToInitialiseSSLContext$str(), message));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String homeDirectoryDoesNotExist$str() {
        return "WFLYSRV0119: Home directory does not exist: %s";
    }
    @Override
    public final IllegalStateException homeDirectoryDoesNotExist(final File f) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), homeDirectoryDoesNotExist$str(), f));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String configDirectoryDoesNotExist$str() {
        return "WFLYSRV0121: Configuration directory does not exist: %s";
    }
    @Override
    public final IllegalStateException configDirectoryDoesNotExist(final File f) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), configDirectoryDoesNotExist$str(), f));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverBaseDirectoryDoesNotExist$str() {
        return "WFLYSRV0122: Server base directory does not exist: %s";
    }
    @Override
    public final IllegalStateException serverBaseDirectoryDoesNotExist(final File f) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serverBaseDirectoryDoesNotExist$str(), f));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverDataDirectoryIsNotDirectory$str() {
        return "WFLYSRV0123: Server data directory is not a directory: %s";
    }
    @Override
    public final IllegalStateException serverDataDirectoryIsNotDirectory(final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serverDataDirectoryIsNotDirectory$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateServerDataDirectory$str() {
        return "WFLYSRV0124: Could not create server data directory: %s";
    }
    @Override
    public final IllegalStateException couldNotCreateServerDataDirectory(final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotCreateServerDataDirectory$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverContentDirectoryIsNotDirectory$str() {
        return "WFLYSRV0125: Server content directory is not a directory: %s";
    }
    @Override
    public final IllegalStateException serverContentDirectoryIsNotDirectory(final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serverContentDirectoryIsNotDirectory$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateServerContentDirectory$str() {
        return "WFLYSRV0126: Could not create server content directory: %s";
    }
    @Override
    public final IllegalStateException couldNotCreateServerContentDirectory(final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotCreateServerContentDirectory$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String logDirectoryIsNotADirectory$str() {
        return "WFLYSRV0127: Log directory is not a directory: %s";
    }
    @Override
    public final IllegalStateException logDirectoryIsNotADirectory(final File f) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), logDirectoryIsNotADirectory$str(), f));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYSRV0128: Could not create log directory: %s";
    }
    @Override
    public final IllegalStateException couldNotCreateLogDirectory(final File f) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotCreateLogDirectory$str(), f));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverTempDirectoryIsNotADirectory$str() {
        return "WFLYSRV0129: Server temp directory does not exist: %s";
    }
    @Override
    public final IllegalStateException serverTempDirectoryIsNotADirectory(final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serverTempDirectoryIsNotADirectory$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateServerTempDirectory$str() {
        return "WFLYSRV0130: Could not create server temp directory: %s";
    }
    @Override
    public final IllegalStateException couldNotCreateServerTempDirectory(final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotCreateServerTempDirectory$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String controllerTempDirectoryIsNotADirectory$str() {
        return "WFLYSRV0131: Controller temp directory does not exist: %s";
    }
    @Override
    public final IllegalStateException controllerTempDirectoryIsNotADirectory(final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), controllerTempDirectoryIsNotADirectory$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateControllerTempDirectory$str() {
        return "WFLYSRV0132: Could not create server temp directory: %s";
    }
    @Override
    public final IllegalStateException couldNotCreateControllerTempDirectory(final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotCreateControllerTempDirectory$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String domainBaseDirDoesNotExist$str() {
        return "WFLYSRV0133: Domain base dir does not exist: %s";
    }
    @Override
    public final IllegalStateException domainBaseDirDoesNotExist(final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), domainBaseDirDoesNotExist$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String domainConfigDirDoesNotExist$str() {
        return "WFLYSRV0134: Domain config dir does not exist: %s";
    }
    @Override
    public final IllegalStateException domainConfigDirDoesNotExist(final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), domainConfigDirDoesNotExist$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverBaseDirectoryIsNotADirectory$str() {
        return "WFLYSRV0135: Server base directory is not a directory: %s";
    }
    @Override
    public final IllegalStateException serverBaseDirectoryIsNotADirectory(final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serverBaseDirectoryIsNotADirectory$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateServerBaseDirectory$str() {
        return "WFLYSRV0136: Could not create server base directory: %s";
    }
    @Override
    public final IllegalStateException couldNotCreateServerBaseDirectory(final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotCreateServerBaseDirectory$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSuchDeploymentContentAtBoot$str() {
        return "WFLYSRV0137: No deployment content with hash %s is available in the deployment content repository for deployment '%s'. This is a fatal boot error. To correct the problem, either restart with the --admin-only switch set and use the CLI to install the missing content or remove it from the configuration, or remove the deployment from the xml configuration file and restart.";
    }
    @Override
    public final OperationFailedException noSuchDeploymentContentAtBoot(final String contentHash, final String deploymentName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noSuchDeploymentContentAtBoot$str(), contentHash, deploymentName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String configuredSystemPropertiesLabel$str() {
        return "Configured system properties:";
    }
    @Override
    public final String configuredSystemPropertiesLabel() {
        return String.format(getLoggingLocale(), configuredSystemPropertiesLabel$str());
    }
    protected String vmArgumentsLabel$str() {
        return "VM Arguments: %s";
    }
    @Override
    public final String vmArgumentsLabel(final String arguments) {
        return String.format(getLoggingLocale(), vmArgumentsLabel$str(), arguments);
    }
    protected String configuredSystemEnvironmentLabel$str() {
        return "Configured system environment:";
    }
    @Override
    public final String configuredSystemEnvironmentLabel() {
        return String.format(getLoggingLocale(), configuredSystemEnvironmentLabel$str());
    }
    protected String vfsNotAvailable$str() {
        return "WFLYSRV0138: VFS is not available from the configured module loader";
    }
    @Override
    public final IllegalStateException vfsNotAvailable() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), vfsNotAvailable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverControllerServiceRemoved$str() {
        return "WFLYSRV0139: Server controller service was removed";
    }
    @Override
    public final ServiceNotFoundException serverControllerServiceRemoved() {
        final ServiceNotFoundException result = new ServiceNotFoundException(String.format(getLoggingLocale(), serverControllerServiceRemoved$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String rootServiceRemoved$str() {
        return "WFLYSRV0140: Root service was removed";
    }
    @Override
    public final IllegalStateException rootServiceRemoved() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), rootServiceRemoved$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotStartServer$str() {
        return "WFLYSRV0141: Cannot start server";
    }
    @Override
    public final IllegalStateException cannotStartServer(final Exception e) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotStartServer$str()), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String embeddedServerDirectoryNotFound$str() {
        return "WFLYSRV0143: No directory called '%s' exists under '%s'";
    }
    @Override
    public final IllegalArgumentException embeddedServerDirectoryNotFound(final String relativePath, final String homePath) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), embeddedServerDirectoryNotFound$str(), relativePath, homePath));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String propertySpecifiedFileDoesNotExist$str() {
        return "WFLYSRV0144: -D%s=%s does not exist";
    }
    @Override
    public final IllegalArgumentException propertySpecifiedFileDoesNotExist(final String property, final String path) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), propertySpecifiedFileDoesNotExist$str(), property, path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String propertySpecifiedFileIsNotADirectory$str() {
        return "WFLYSRV0145: -D%s=%s is not a directory";
    }
    @Override
    public final IllegalArgumentException propertySpecifiedFileIsNotADirectory(final String property, final String path) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), propertySpecifiedFileIsNotADirectory$str(), property, path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorCopyingFile$str() {
        return "WFLYSRV0146: Error copying '%s' to '%s'";
    }
    @Override
    public final RuntimeException errorCopyingFile(final String src, final String dest, final IOException e) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorCopyingFile$str(), src, dest), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidObject$str() {
        return "WFLYSRV0147: %s is null";
    }
    @Override
    public final InvalidObjectException invalidObject(final String field) {
        final InvalidObjectException result = new InvalidObjectException(String.format(getLoggingLocale(), invalidObject$str(), field));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidPortOffset$str() {
        return "WFLYSRV0148: portOffset is out of range";
    }
    @Override
    public final InvalidObjectException invalidPortOffset() {
        final InvalidObjectException result = new InvalidObjectException(String.format(getLoggingLocale(), invalidPortOffset$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidStreamIndex$str() {
        return "WFLYSRV0149: Invalid '%s' value: %d, the maximum index is %d";
    }
    @Override
    public final OperationFailedException invalidStreamIndex(final String name, final int value, final int maxIndex) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidStreamIndex$str(), name, value, maxIndex));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidStreamURL$str() {
        return "WFLYSRV0150: Cannot create input stream from URL '%s'";
    }
    @Override
    public final OperationFailedException invalidStreamURL(final Exception cause, final String url) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidStreamURL$str(), url), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidStreamBytes$str() {
        return "WFLYSRV0151: No bytes available at param %s";
    }
    @Override
    public final OperationFailedException invalidStreamBytes(final String param) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidStreamBytes$str(), param));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleContentItemsNotSupported$str() {
        return "WFLYSRV0152: Only 1 piece of content is current supported (AS7-431)";
    }
    @Override
    public final OperationFailedException multipleContentItemsNotSupported() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), multipleContentItemsNotSupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String deploymentPhaseFailed$str() {
        return "WFLYSRV0153: Failed to process phase %s of %s";
    }
    @Override
    public final StartException deploymentPhaseFailed(final Phase phase, final DeploymentUnit deploymentUnit, final Throwable cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), deploymentPhaseFailed$str(), phase, deploymentUnit), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String deploymentIndexingFailed$str() {
        return "WFLYSRV0156: Failed to index deployment root for annotations";
    }
    @Override
    public final DeploymentUnitProcessingException deploymentIndexingFailed(final Throwable cause) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), deploymentIndexingFailed$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToInstantiateClassTransformer$str() {
        return "WFLYSRV0158: Failed to instantiate a %s";
    }
    @Override
    public final DeploymentUnitProcessingException failedToInstantiateClassTransformer(final String clazz, final Exception cause) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToInstantiateClassTransformer$str(), clazz), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noDeploymentRepositoryAvailable$str() {
        return "WFLYSRV0159: No deployment repository available.";
    }
    @Override
    public final DeploymentUnitProcessingException noDeploymentRepositoryAvailable() {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), noDeploymentRepositoryAvailable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String deploymentMountFailed$str() {
        return "WFLYSRV0160: Failed to mount deployment content";
    }
    @Override
    public final DeploymentUnitProcessingException deploymentMountFailed(final IOException cause) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), deploymentMountFailed$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToGetManifest$str() {
        return "WFLYSRV0161: Failed to get manifest for deployment %s";
    }
    @Override
    public final DeploymentUnitProcessingException failedToGetManifest(final VirtualFile file, final IOException cause) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToGetManifest$str(), file), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotMergeResourceRoot$str() {
        return "WFLYSRV0163: Cannot merge resource root for a different file. This: %s mergee: %s";
    }
    @Override
    public final IllegalArgumentException cannotMergeResourceRoot(final VirtualFile file, final VirtualFile mergee) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotMergeResourceRoot$str(), file, mergee));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToCreateTempFileProvider$str() {
        return "WFLYSRV0164: Failed to create temp file provider";
    }
    @Override
    public final RuntimeException failedToCreateTempFileProvider(final IOException cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToCreateTempFileProvider$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String resourceTooLarge$str() {
        return "WFLYSRV0165: Resource is too large to be a valid class file";
    }
    @Override
    public final IOException resourceTooLarge() {
        final IOException result = new IOException(String.format(getLoggingLocale(), resourceTooLarge$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String subdeploymentNotFound$str() {
        return "WFLYSRV0166: Sub deployment %s in jboss-deployment-structure.xml was not found. Available sub deployments: %s";
    }
    @Override
    public final DeploymentUnitProcessingException subdeploymentNotFound(final String path, final StringBuilder subdeployments) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), subdeploymentNotFound$str(), path, subdeployments));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String deploymentStructureFileNotFound$str() {
        return "WFLYSRV0167: No jboss-deployment-structure.xml file found at %s";
    }
    @Override
    public final DeploymentUnitProcessingException deploymentStructureFileNotFound(final File file) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), deploymentStructureFileNotFound$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorLoadingDeploymentStructureFile$str() {
        return "WFLYSRV0168: Error loading jboss-deployment-structure.xml from %s";
    }
    @Override
    public final DeploymentUnitProcessingException errorLoadingDeploymentStructureFile(final String path, final XMLStreamException cause) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), errorLoadingDeploymentStructureFile$str(), path), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateSubdeploymentListing$str() {
        return "WFLYSRV0169: Sub deployment '%s' is listed twice in jboss-deployment-structure.xml";
    }
    @Override
    public final XMLStreamException duplicateSubdeploymentListing(final String name) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), duplicateSubdeploymentListing$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidModuleName$str() {
        return "WFLYSRV0170: Additional module name '%s' is not valid. Names must start with 'deployment.'";
    }
    @Override
    public final XMLStreamException invalidModuleName(final String name) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), invalidModuleName$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String externalResourceRootsNotSupported$str() {
        return "WFLYSRV0171: External resource roots not supported, resource roots may not start with a '/' : %s";
    }
    @Override
    public final XMLStreamException externalResourceRootsNotSupported(final String path) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), externalResourceRootsNotSupported$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedEndOfDocument$str() {
        return "WFLYSRV0172: Unexpected end of document";
    }
    @Override
    public final XMLStreamException unexpectedEndOfDocument(final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unexpectedEndOfDocument$str()), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingRequiredAttributes$str() {
        return "WFLYSRV0173: Missing one or more required attributes:%s";
    }
    @Override
    public final XMLStreamException missingRequiredAttributes(final String missing, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), missingRequiredAttributes$str(), missing), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedContent$str() {
        return "WFLYSRV0174: Unexpected content of type '%s', name is '%s', text is: '%s'";
    }
    @Override
    public final XMLStreamException unexpectedContent(final String kind, final QName name, final String text, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unexpectedContent$str(), kind, name, text), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noMethodFound$str() {
        return "WFLYSRV0175: No method found with id: %s on class (or its super class) %s";
    }
    @Override
    public final DeploymentUnitProcessingException noMethodFound(final MethodIdentifier method, final Class<?> clazz) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), noMethodFound$str(), method, clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorGettingReflectiveInformation$str() {
        return "WFLYSRV0177: Error getting reflective information for %s with ClassLoader %s";
    }
    @Override
    public final RuntimeException errorGettingReflectiveInformation(final Class<?> clazz, final ClassLoader cl, final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorGettingReflectiveInformation$str(), clazz, cl), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String externalModuleServiceAlreadyStarted$str() {
        return "WFLYSRV0178: External Module Service already started";
    }
    @Override
    public final IllegalStateException externalModuleServiceAlreadyStarted() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), externalModuleServiceAlreadyStarted$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLoadModule$str() {
        return "WFLYSRV0179: Failed to load module: %s";
    }
    @Override
    public final StartException failedToLoadModule(final ModuleIdentifier module, final ModuleLoadException cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToLoadModule$str(), module), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToResolveMulticastAddress$str() {
        return "WFLYSRV0187: Failed to get multicast address for %s";
    }
    @Override
    public final OperationFailedException failedToResolveMulticastAddress(final UnknownHostException cause, final String address) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), failedToResolveMulticastAddress$str(), address), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToResolveMulticastAddressForRollback$str() {
        return "WFLYSRV0188: Failed to get multicast address for %s";
    }
    @Override
    public final RuntimeException failedToResolveMulticastAddressForRollback(final UnknownHostException cause, final String address) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToResolveMulticastAddressForRollback$str(), address), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAddMoreThanOneSocketBindingGroupForServerOrHost$str() {
        return "WFLYSRV0190: Cannot add more than one socket binding group. Add of '%s' attempted, but '%s' already exists";
    }
    @Override
    public final OperationFailedException cannotAddMoreThanOneSocketBindingGroupForServerOrHost(final PathAddress wanted, final PathAddress existing) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotAddMoreThanOneSocketBindingGroupForServerOrHost$str(), wanted, existing));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotHaveBothInitialServerConfigAndServerConfig$str() {
        return "WFLYSRV0191: Can't use both --server-config and --initial-server-config";
    }
    @Override
    public final IllegalArgumentException cannotHaveBothInitialServerConfigAndServerConfig() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotHaveBothInitialServerConfigAndServerConfig$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateJBossXmlNamespace$str() {
        return "WFLYSRV0192: Duplicate namespace %s in jboss-all.xml";
    }
    @Override
    public final XMLStreamException duplicateJBossXmlNamespace(final QName namespace, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), duplicateJBossXmlNamespace$str(), namespace), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String equivalentNamespacesInJBossXml$str() {
        return "WFLYSRV0193: Two different versions of the same namespaces are present in jboss-all.xml, %s and %s are both present";
    }
    @Override
    public final DeploymentUnitProcessingException equivalentNamespacesInJBossXml(final QName key, final QName s) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), equivalentNamespacesInJBossXml$str(), key, s));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorLoadingJBossXmlFile$str() {
        return "WFLYSRV0194: Error loading jboss-all.xml from %s";
    }
    @Override
    public final DeploymentUnitProcessingException errorLoadingJBossXmlFile(final String path, final XMLStreamException e) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), errorLoadingJBossXmlFile$str(), path), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullModuleAttachment$str() {
        return "WFLYSRV0195: Cannot obtain required module for: %s";
    }
    @Override
    public final IllegalStateException nullModuleAttachment(final DeploymentUnit depUnit) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), nullModuleAttachment$str(), depUnit));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String deploymentOverlayFailed$str() {
        return "WFLYSRV0196: Failed to get content for deployment overlay %s at %s";
    }
    @Override
    public final DeploymentUnitProcessingException deploymentOverlayFailed(final Exception cause, final String contentOverlay, final String file) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), deploymentOverlayFailed$str(), contentOverlay, file), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSuchDeploymentOverlayContentAtBoot$str() {
        return "WFLYSRV0198: No deployment overlay content with hash %s is available in the deployment content repository for deployment overlay '%s' at location %s. This is a fatal boot error. To correct the problem, either restart with the --admin-only switch set and use the CLI to install the missing content or remove it from the configuration, or remove the deployment overlay from the xml configuration file and restart.";
    }
    @Override
    public final OperationFailedException noSuchDeploymentOverlayContentAtBoot(final String contentHash, final String deploymentOverlayName, final String contentFile) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noSuchDeploymentOverlayContentAtBoot$str(), contentHash, deploymentOverlayName, contentFile));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSuchDeploymentOverlayContent$str() {
        return "WFLYSRV0199: No deployment overlay content with hash %s is available in the deployment content repository.";
    }
    @Override
    public final OperationFailedException noSuchDeploymentOverlayContent(final String hash) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noSuchDeploymentOverlayContent$str(), hash));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLoadFile$str() {
        return "WFLYSRV0200: Failed to read file %s";
    }
    @Override
    public final OperationFailedException failedToLoadFile(final VirtualFile file, final IOException e) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), failedToLoadFile$str(), file), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotHaveMoreThanOneManagedContentItem$str() {
        return "WFLYSRV0201: Cannot have more than one of %s";
    }
    @Override
    public final OperationFailedException cannotHaveMoreThanOneManagedContentItem(final Set<String> managedAttributes) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotHaveMoreThanOneManagedContentItem$str(), managedAttributes));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownContentItemKey$str() {
        return "WFLYSRV0202: Unknown content item key: %s";
    }
    @Override
    public final OperationFailedException unknownContentItemKey(final String key) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unknownContentItemKey$str(), key));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotMixUnmanagedAndManagedContentItems$str() {
        return "WFLYSRV0203: Cannot use %s when %s are used";
    }
    @Override
    public final OperationFailedException cannotMixUnmanagedAndManagedContentItems(final Set<String> usedManaged, final Set<String> usedUnmanaged) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotMixUnmanagedAndManagedContentItems$str(), usedManaged, usedUnmanaged));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullParameter$str() {
        return "WFLYSRV0204: Null '%s'";
    }
    @Override
    public final OperationFailedException nullParameter(final String name) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), nullParameter$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String runtimeNameMustBeUnique$str() {
        return "WFLYSRV0205: There is already a deployment called %s with the same runtime name %s";
    }
    @Override
    public final OperationFailedException runtimeNameMustBeUnique(final String existingDeployment, final String runtimename) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), runtimeNameMustBeUnique$str(), existingDeployment, runtimename));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateDeploymentUnitProcessor$str() {
        return "WFLYSRV0206: Multiple deployment unit processors registered with priority %s and class %s";
    }
    @Override
    public final IllegalStateException duplicateDeploymentUnitProcessor(final int priority, final Class aClass) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), duplicateDeploymentUnitProcessor$str(), priority, aClass));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void startingSubDeployment(final String deploymentUnitName) {
        super.log.logf(FQCN, INFO, null, startingSubDeployment$str(), deploymentUnitName);
    }
    protected String startingSubDeployment$str() {
        return "WFLYSRV0207: Starting subdeployment (runtime-name: \"%s\")";
    }
    @Override
    public final void stoppedSubDeployment(final String deploymentUnitName, final int elapsedTime) {
        super.log.logf(FQCN, INFO, null, stoppedSubDeployment$str(), deploymentUnitName, elapsedTime);
    }
    protected String stoppedSubDeployment$str() {
        return "WFLYSRV0208: Stopped subdeployment (runtime-name: %s) in %dms";
    }
    protected String vaultModuleWithNoCode$str() {
        return "WFLYSRV0209: When specifying a 'module' you also need to specify the 'code'";
    }
    @Override
    public final OperationFailedException vaultModuleWithNoCode() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), vaultModuleWithNoCode$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverAlreadyPaused$str() {
        return "WFLYSRV0210: Server is already paused";
    }
    @Override
    public final IllegalStateException serverAlreadyPaused() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serverAlreadyPaused$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void suspendingServer(final long timeoutMillis) {
        super.log.logf(FQCN, INFO, null, suspendingServer1$str(), timeoutMillis);
    }
    protected String suspendingServer1$str() {
        return "WFLYSRV0211: Suspending server with %d ms timeout.";
    }
    @Override
    public final void resumingServer() {
        super.log.logf(FQCN, INFO, null, resumingServer$str());
    }
    protected String resumingServer$str() {
        return "WFLYSRV0212: Resuming server";
    }
    @Override
    public final void failedToConnectToHostController() {
        super.log.logf(FQCN, WARN, null, failedToConnectToHostController$str());
    }
    protected String failedToConnectToHostController$str() {
        return "WFLYSRV0213: Failed to connect to host-controller, retrying.";
    }
    @Override
    public final void failedToResume(final SuspendableActivity activity, final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, failedToResume$str(), activity);
    }
    protected String failedToResume$str() {
        return "WFLYSRV0215: Failed to resume activity %s. To resume normal operation it is recommended that you restart the server.";
    }
    @Override
    public final void failedToCleanObsoleteContent(final String failure) {
        super.log.logf(FQCN, ERROR, null, failedToCleanObsoleteContent$str(), failure);
    }
    protected String failedToCleanObsoleteContent$str() {
        return "WFLYSRV0216: Error cleaning obsolete content %s ";
    }
    @Override
    public final void undeployingDeploymentHasBeenRedeployed(final String deploymentName) {
        super.log.logf(FQCN, WARN, null, undeployingDeploymentHasBeenRedeployed$str(), deploymentName);
    }
    protected String undeployingDeploymentHasBeenRedeployed$str() {
        return "WFLYSRV0219: %s deployment has been re-deployed, its content will not be removed. You will need to restart it.";
    }
    @Override
    public final void shutdownHookInvoked() {
        super.log.logf(FQCN, INFO, null, shutdownHookInvoked$str());
    }
    protected String shutdownHookInvoked$str() {
        return "WFLYSRV0220: Server shutdown has been requested via an OS signal";
    }
    @Override
    public final void deprecatedApiUsed(final String name, final String id) {
        super.log.logf(FQCN, WARN, null, deprecatedApiUsed$str(), name, id);
    }
    protected String deprecatedApiUsed$str() {
        return "WFLYSRV0221: Deployment \"%s\" is using a deprecated module (\"%s\") which may be removed in future versions without notice.";
    }
    protected String illegalPermissionName$str() {
        return "WFLYSRV0222: Illegal permission name '%s'";
    }
    @Override
    public final IllegalArgumentException illegalPermissionName(final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalPermissionName$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalPermissionActions$str() {
        return "WFLYSRV0223: Illegal permission actions '%s'";
    }
    @Override
    public final IllegalArgumentException illegalPermissionActions(final String actions) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalPermissionActions$str(), actions));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void couldNotMountOverlay(final String path, final VirtualFile parent) {
        super.log.logf(FQCN, ERROR, null, couldNotMountOverlay$str(), path, parent);
    }
    protected String couldNotMountOverlay$str() {
        return "WFLYSRV0224: Could not mount overlay %s as parent %s is not a directory";
    }
    @Override
    public final void vaultNotInitializedException() {
        super.log.logf(FQCN, DEBUG, null, vaultNotInitializedException$str());
    }
    protected String vaultNotInitializedException$str() {
        return "WFLYSRV0230: Vault is not initialized; resolution of vault expressions is not possible";
    }
    protected String couldNotObtainServerUuidFile$str() {
        return "WFLYSRV0231: Could not read or create the server UUID in file: %s";
    }
    @Override
    public final IllegalStateException couldNotObtainServerUuidFile(final Throwable cause, final Path file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), couldNotObtainServerUuidFile$str(), file), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotGetModuleInfo$str() {
        return "WFLYSRV0232: Could not get module info for module name: %s";
    }
    @Override
    public final OperationFailedException couldNotGetModuleInfo(final String moduleName, final Throwable cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), couldNotGetModuleInfo$str(), moduleName), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String deploymentUndeployedNotification$str() {
        return "WFLYSRV0233: Undeployed \"%s\" (runtime-name: \"%s\")";
    }
    @Override
    public final String deploymentUndeployedNotification(final String managementName, final String deploymentUnitName) {
        return String.format(getLoggingLocale(), deploymentUndeployedNotification$str(), managementName, deploymentUnitName);
    }
    protected String deploymentDeployedNotification$str() {
        return "WFLYSRV0234: Deployed \"%s\" (runtime-name : \"%s\")";
    }
    @Override
    public final String deploymentDeployedNotification(final String managementName, final String deploymentUnitName) {
        return String.format(getLoggingLocale(), deploymentDeployedNotification$str(), managementName, deploymentUnitName);
    }
    @Override
    public final void securityManagerEnabled() {
        super.log.logf(FQCN, INFO, null, securityManagerEnabled$str());
    }
    protected String securityManagerEnabled$str() {
        return "WFLYSRV0235: Security Manager is enabled";
    }
    @Override
    public final void suspendingServerWithNoTimeout() {
        super.log.logf(FQCN, INFO, null, suspendingServerWithNoTimeout$str());
    }
    protected String suspendingServerWithNoTimeout$str() {
        return "WFLYSRV0236: Suspending server with no timeout.";
    }
    protected String cannotBothHaveFalseUseCurrentConfigAndServerConfig$str() {
        return "WFLYSRV0237: It is not possible to use use-current-server-config=false while specifying a server-config";
    }
    @Override
    public final OperationFailedException cannotBothHaveFalseUseCurrentConfigAndServerConfig() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotBothHaveFalseUseCurrentConfigAndServerConfig$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverConfigForReloadNotFound$str() {
        return "WFLYSRV0238: server-config '%s' specified for reload could not be found";
    }
    @Override
    public final OperationFailedException serverConfigForReloadNotFound(final String serverConfig) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), serverConfigForReloadNotFound$str(), serverConfig));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void aborting(final int code) {
        super.log.logf(FQCN, FATAL, null, aborting$str(), code);
    }
    protected String aborting$str() {
        return "WFLYSRV0239: Aborting with exit code %d";
    }
    @Override
    public final void shuttingDownInResponseToProcessControllerSignal() {
        super.log.logf(FQCN, INFO, null, shuttingDownInResponseToProcessControllerSignal$str());
    }
    protected String shuttingDownInResponseToProcessControllerSignal$str() {
        return "WFLYSRV0240: ProcessController has signalled to shut down; shutting down";
    }
    @Override
    public final void shuttingDownInResponseToManagementRequest(final String op) {
        super.log.logf(FQCN, INFO, null, shuttingDownInResponseToManagementRequest$str(), op);
    }
    protected String shuttingDownInResponseToManagementRequest$str() {
        return "WFLYSRV0241: Shutting down in response to management operation '%s'";
    }
    protected String cannotExplodeDeploymentOfSelfContainedServer$str() {
        return "WFLYSRV0242: Cannot explode a deployment in a self-contained server";
    }
    @Override
    public final OperationFailedException cannotExplodeDeploymentOfSelfContainedServer() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotExplodeDeploymentOfSelfContainedServer$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotExplodeUnmanagedDeployment$str() {
        return "WFLYSRV0243: Cannot explode an unmanaged deployment";
    }
    @Override
    public final OperationFailedException cannotExplodeUnmanagedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotExplodeUnmanagedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotExplodeAlreadyExplodedDeployment$str() {
        return "WFLYSRV0244: Cannot explode an already exploded deployment";
    }
    @Override
    public final OperationFailedException cannotExplodeAlreadyExplodedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotExplodeAlreadyExplodedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotExplodeEnabledDeployment$str() {
        return "WFLYSRV0245: Cannot explode an already deployed deployment";
    }
    @Override
    public final OperationFailedException cannotExplodeEnabledDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotExplodeEnabledDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAddContentToSelfContainedServer$str() {
        return "WFLYSRV0246: Cannot add content to a deployment in a self-contained server";
    }
    @Override
    public final OperationFailedException cannotAddContentToSelfContainedServer() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotAddContentToSelfContainedServer$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAddContentToUnmanagedDeployment$str() {
        return "WFLYSRV0247: Cannot add content to an unmanaged deployment";
    }
    @Override
    public final OperationFailedException cannotAddContentToUnmanagedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotAddContentToUnmanagedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAddContentToUnexplodedDeployment$str() {
        return "WFLYSRV0248: Cannot add content to an unexploded deployment";
    }
    @Override
    public final OperationFailedException cannotAddContentToUnexplodedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotAddContentToUnexplodedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void couldNotCopyFiles(final Exception ex, final String managementName) {
        super.log.logf(FQCN, ERROR, ex, couldNotCopyFiles$str(), managementName);
    }
    protected String couldNotCopyFiles$str() {
        return "WFLYSRV0249: Could not copy files from the managed content repository to the running deployment for %s";
    }
    protected String cannotRemoveContentFromSelfContainedServer$str() {
        return "WFLYSRV0250: Cannot remove content from a deployment in a self-contained server";
    }
    @Override
    public final OperationFailedException cannotRemoveContentFromSelfContainedServer() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotRemoveContentFromSelfContainedServer$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemoveContentFromUnmanagedDeployment$str() {
        return "WFLYSRV0251: Cannot remove content from an unmanaged deployment";
    }
    @Override
    public final OperationFailedException cannotRemoveContentFromUnmanagedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotRemoveContentFromUnmanagedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemoveContentFromUnexplodedDeployment$str() {
        return "WFLYSRV0252: Cannot remove content from an unexploded deployment";
    }
    @Override
    public final OperationFailedException cannotRemoveContentFromUnexplodedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotRemoveContentFromUnexplodedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void couldNotDeleteFile(final Exception ex, final String path, final String managementName) {
        super.log.logf(FQCN, ERROR, ex, couldNotDeleteFile$str(), path, managementName);
    }
    protected String couldNotDeleteFile$str() {
        return "WFLYSRV0253: Could not delete file %s from the running deployment %s";
    }
    protected String cannotReadContentFromSelfContainedServer$str() {
        return "WFLYSRV0254: Cannot read content from a deployment in a self-contained server";
    }
    @Override
    public final OperationFailedException cannotReadContentFromSelfContainedServer() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotReadContentFromSelfContainedServer$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotReadContentFromUnmanagedDeployment$str() {
        return "WFLYSRV0255: Cannot read content from an unmanaged deployment";
    }
    @Override
    public final OperationFailedException cannotReadContentFromUnmanagedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotReadContentFromUnmanagedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String requiredSystemPropertyMissing$str() {
        return "WFLYSRV0257: Required system property '%s' not set";
    }
    @Override
    public final IllegalArgumentException requiredSystemPropertyMissing(final String propName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), requiredSystemPropertyMissing$str(), propName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotExplodeSubDeploymentOfUnexplodedDeployment$str() {
        return "WFLYSRV0258: Cannot explode a subdeployment of an unexploded deployment";
    }
    @Override
    public final OperationFailedException cannotExplodeSubDeploymentOfUnexplodedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotExplodeSubDeploymentOfUnexplodedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String secureSocketBindingRequiresSSLContext$str() {
        return "WFLYSRV0259: If attribute secure-socket-binding is defined ssl-context must also be defined";
    }
    @Override
    public final OperationFailedException secureSocketBindingRequiresSSLContext() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), secureSocketBindingRequiresSSLContext$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void startingServerSuspended() {
        super.log.logf(FQCN, INFO, null, startingServerSuspended$str());
    }
    protected String startingServerSuspended$str() {
        return "WFLYSRV0260: Starting server in suspended mode";
    }
    protected String bootComplete$str() {
        return "WFLYSRV0261: Boot complete";
    }
    @Override
    public final String bootComplete() {
        return String.format(getLoggingLocale(), bootComplete$str());
    }
    protected String cannotSetBothAdminOnlyAndStartMode$str() {
        return "WFLYSRV0262: You cannot set both --start-mode and --admin-only";
    }
    @Override
    public final String cannotSetBothAdminOnlyAndStartMode() {
        return String.format(getLoggingLocale(), cannotSetBothAdminOnlyAndStartMode$str());
    }
    protected String unknownStartMode$str() {
        return "WFLYSRV0263: Unknown start mode %s";
    }
    @Override
    public final String unknownStartMode(final String value) {
        return String.format(getLoggingLocale(), unknownStartMode$str(), value);
    }
    protected String cannotSpecifyBothAdminOnlyAndStartMode$str() {
        return "WFLYSRV0264: Cannot specify both admin-only and start-mode";
    }
    @Override
    public final OperationFailedException cannotSpecifyBothAdminOnlyAndStartMode() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotSpecifyBothAdminOnlyAndStartMode$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void invalidPoolSize(final String val, final String configSysProp) {
        super.log.logf(FQCN, WARN, null, invalidPoolSize$str(), val, configSysProp);
    }
    protected String invalidPoolSize$str() {
        return "WFLYSRV0265: Invalid value '%s' for system property '%s' -- value must be a non-negative integer";
    }
    protected String archiveMountFailed$str() {
        return "WFLYSRV0267: Cannot mount resource root '%s', is it really an archive?";
    }
    @Override
    public final XMLStreamException archiveMountFailed(final String path, final ZipException cause) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), archiveMountFailed$str(), path), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToPullRepository$str() {
        return "WFLYSRV0268: Failed to pull the repository %s";
    }
    @Override
    public final RuntimeException failedToPullRepository(final Exception cause, final String repository) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToPullRepository$str(), repository), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToInitRepository$str() {
        return "WFLYSRV0269: Failed to initialize the repository %s";
    }
    @Override
    public final RuntimeException failedToInitRepository(final Exception cause, final String repository) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToInitRepository$str(), repository), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToPublishConfiguration(final Throwable cause, final String name) {
        super.log.logf(FQCN, ERROR, cause, failedToPublishConfiguration$str(), name);
    }
    protected String failedToPublishConfiguration$str() {
        return "WFLYSRV0270: Failed to publish configuration to %s";
    }
    @Override
    public final void errorUsingGit(final Throwable cause, final String message) {
        super.log.logf(FQCN, ERROR, cause, errorUsingGit$str(), message);
    }
    protected String errorUsingGit$str() {
        return "WFLYSRV0271: Git error: %s";
    }
    @Override
    public final void suspendingServer() {
        super.log.logf(FQCN, INFO, null, suspendingServer0$str());
    }
    protected String suspendingServer0$str() {
        return "WFLYSRV0272: Suspending server";
    }
    @Override
    public final void excludedSubSystemsNotExist(final String subSystem) {
        super.log.logf(FQCN, WARN, null, excludedSubSystemsNotExist$str(), subSystem);
    }
    protected String excludedSubSystemsNotExist$str() {
        return "WFLYSRV0273: Excluded subsystem %s via jboss-deployment-structure.xml does not exist.";
    }
    @Override
    public final void excludedDependenciesNotExist(final String dependency) {
        super.log.logf(FQCN, WARN, null, excludedDependenciesNotExist$str(), dependency);
    }
    protected String excludedDependenciesNotExist$str() {
        return "WFLYSRV0274: Excluded dependency %s via jboss-deployment-structure.xml does not exist.";
    }
    protected String maximumNumberOfJarResources$str() {
        return "WFLYSRV0275: Maximum number of allowed jar resources reached for global-directory module name '%s'. The maximum allowed is %d files";
    }
    @Override
    public final RuntimeException maximumNumberOfJarResources(final String globalDirectory, final long max) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), maximumNumberOfJarResources$str(), globalDirectory, max));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorOpeningZipFile$str() {
        return "WFLYSRV0276: There is an error in opening zip file %s";
    }
    @Override
    public final StartException errorOpeningZipFile(final String filename, final Throwable throwable) {
        final StartException result = new StartException(String.format(getLoggingLocale(), errorOpeningZipFile$str(), filename), throwable);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLoadSSHCredentials$str() {
        return "WFLYSRV0277: Failed to load SSH Credentials %s";
    }
    @Override
    public final RuntimeException failedToLoadSSHCredentials(final Throwable cause, final String message) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToLoadSSHCredentials$str(), message), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void usingGit() {
        super.log.logf(FQCN, INFO, null, usingGit$str());
    }
    protected String usingGit$str() {
        return "WFLYSRV0278: The configuration history is managed through Git";
    }
    @Override
    public final void gitRespositoryInitialized(final String name) {
        super.log.logf(FQCN, INFO, null, gitRespositoryInitialized$str(), name);
    }
    protected String gitRespositoryInitialized$str() {
        return "WFLYSRV0279: Git initialized in %s";
    }
    protected String unableToInitialiseGitRepository$str() {
        return "WFLYSRV0280: Unable to initialise the git repository.";
    }
    @Override
    public final IllegalArgumentException unableToInitialiseGitRepository(final Throwable cause) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unableToInitialiseGitRepository$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void wildflyConfigUrlIsSet(final String property) {
        super.log.logf(FQCN, WARN, null, wildflyConfigUrlIsSet$str(), property);
    }
    protected String wildflyConfigUrlIsSet$str() {
        return "WFLYSRV0281: System property %s is set. This should only be used for standalone clients. Setting this on the server will override your profile configuration.";
    }
    @Override
    public final void startingNonGraceful() {
        super.log.logf(FQCN, INFO, null, startingNonGraceful$str());
    }
    protected String startingNonGraceful$str() {
        return "WFLYSRV0282: Server is starting with graceful startup disabled; external requests may receive failure responses until startup completes.";
    }
    @Override
    public final void disregardingNonGraceful() {
        super.log.logf(FQCN, INFO, null, disregardingNonGraceful$str());
    }
    protected String disregardingNonGraceful$str() {
        return "WFLYSRV0283: A non-graceful startup was requested in conjunction with a suspended startup. The server will start suspended.";
    }
    @Override
    public final void vaultSupportRemoved() {
        super.log.logf(FQCN, WARN, null, vaultSupportRemoved$str());
    }
    protected String vaultSupportRemoved$str() {
        return "WFLYSRV0285: Vault support has been removed, no vault resources will be initialised.";
    }
    protected String staticModuleIndexingFailed$str() {
        return "WFLYSRV0286: Failed to index static module %s for annotations";
    }
    @Override
    public final DeploymentUnitProcessingException staticModuleIndexingFailed(final String moduleId, final Throwable cause) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), staticModuleIndexingFailed$str(), moduleId), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String securityRealmReferencesUnsupported$str() {
        return "WFLYSRV0287: Security realms are no longer supported, please migrate references to them from the configuration.";
    }
    @Override
    public final XMLStreamException securityRealmReferencesUnsupported() {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), securityRealmReferencesUnsupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToCreateTempDirForAuthTokensFileExists$str() {
        return "WFLYSRV0288: Unable to create tmp dir for auth tokens as file already exists.";
    }
    @Override
    public final IllegalStateException unableToCreateTempDirForAuthTokensFileExists() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unableToCreateTempDirForAuthTokensFileExists$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToCreateAuthDir$str() {
        return "WFLYSRV0289: Unable to create auth dir %s.";
    }
    @Override
    public final IllegalStateException unableToCreateAuthDir(final String dir) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unableToCreateAuthDir$str(), dir));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToFindYaml$str() {
        return "WFLYSRV0290: Couldn't find the specified YAML file %s";
    }
    @Override
    public final IllegalArgumentException unableToFindYaml(final String file) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unableToFindYaml$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String throwableIsNull$str() {
        return "WFLYSRV0291: The error cause is unknown at this thread. Check other log messages and caller to know the possible cause.";
    }
    @Override
    public final IllegalStateException throwableIsNull() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), throwableIsNull$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String requiredServiceNotUp$str() {
        return "WFLYSRV0292: The required service '%s' is not UP, it is currently '%s'.";
    }
    @Override
    public final DeploymentUnitProcessingException requiredServiceNotUp(final ServiceName serviceName, final State state) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), requiredServiceNotUp$str(), serviceName, state));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void aliasAddedAsDependency(final String aliasModule, final String deploymentName, final String context, final String targetModule) {
        super.log.logf(FQCN, WARN, null, aliasAddedAsDependency$str(), aliasModule, deploymentName, context, targetModule);
    }
    protected String aliasAddedAsDependency$str() {
        return "WFLYSRV0293: The '%s' module alias has been added as a dependency to '%s' deployment via %s. While this is allowed, it is recommended to use its target module instead. Consider replacing this alias with its target module '%s'.";
    }
    @Override
    public final void aliasAddedAsExclusion(final String aliasModule, final String deploymentName, final String context, final String targetModule) {
        super.log.logf(FQCN, WARN, null, aliasAddedAsExclusion$str(), aliasModule, deploymentName, context, targetModule);
    }
    protected String aliasAddedAsExclusion$str() {
        return "WFLYSRV0294: The '%s' module alias has been excluded from '%s' deployment via %s. While this is allowed, it is recommended to use its target module instead. Consider replacing this alias with its target module '%s'.";
    }
    protected String noServerInstallationPrepared$str() {
        return "WFLYSRV0295: No %s installation has been prepared.";
    }
    @Override
    public final OperationFailedException noServerInstallationPrepared(final String productName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noServerInstallationPrepared$str(), productName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mechAuthenticationNotComplete$str() {
        return "WFLYSRV0296: Authentication mechanism authentication is not yet complete";
    }
    @Override
    public final IllegalStateException mechAuthenticationNotComplete() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), mechAuthenticationNotComplete$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mechMessageAfterComplete$str() {
        return "WFLYSRV0297: Authentication mechanism exchange received a message after authentication was already complete";
    }
    @Override
    public final AuthenticationMechanismException mechMessageAfterComplete() {
        final AuthenticationMechanismException result = new AuthenticationMechanismException(String.format(getLoggingLocale(), mechMessageAfterComplete$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mechMessageTooLong$str() {
        return "WFLYSRV0298: Authentication mechanism message is too long";
    }
    @Override
    public final AuthenticationMechanismException mechMessageTooLong() {
        final AuthenticationMechanismException result = new AuthenticationMechanismException(String.format(getLoggingLocale(), mechMessageTooLong$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mechServerSideAuthenticationFailed$str() {
        return "WFLYSRV0299: Authentication mechanism server-side authentication failed";
    }
    @Override
    public final AuthenticationMechanismException mechServerSideAuthenticationFailed(final Exception e) {
        final AuthenticationMechanismException result = new AuthenticationMechanismException(String.format(getLoggingLocale(), mechServerSideAuthenticationFailed$str()), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mechTokenNotVerified$str() {
        return "WFLYSRV0300: Authentication mechanism token not verified";
    }
    @Override
    public final AuthenticationMechanismException mechTokenNotVerified() {
        final AuthenticationMechanismException result = new AuthenticationMechanismException(String.format(getLoggingLocale(), mechTokenNotVerified$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mechAuthorizationFailed$str() {
        return "WFLYSRV0301: Authentication mechanism authorization failed: \"%s\" running as \"%s\"";
    }
    @Override
    public final AuthenticationMechanismException mechAuthorizationFailed(final String userName, final String authorizationId) {
        final AuthenticationMechanismException result = new AuthenticationMechanismException(String.format(getLoggingLocale(), mechAuthorizationFailed$str(), userName, authorizationId));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mechNoSecurityLayer$str() {
        return "WFLYSRV0302: Authentication mechanism does not support security layer (wrapping/unwrapping)";
    }
    @Override
    public final IllegalStateException mechNoSecurityLayer() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), mechNoSecurityLayer$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mechInvalidMessageReceived$str() {
        return "WFLYSRV0303: Invalid authentication mechanism negotiation message received";
    }
    @Override
    public final AuthenticationMechanismException mechInvalidMessageReceived() {
        final AuthenticationMechanismException result = new AuthenticationMechanismException(String.format(getLoggingLocale(), mechInvalidMessageReceived$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mechNoTokenGiven$str() {
        return "WFLYSRV0304: No authentication mechanism token was given";
    }
    @Override
    public final AuthenticationMechanismException mechNoTokenGiven() {
        final AuthenticationMechanismException result = new AuthenticationMechanismException(String.format(getLoggingLocale(), mechNoTokenGiven$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mechMalformedFields$str() {
        return "WFLYSRV0305: Authentication mechanism authentication failed due to one or more malformed fields";
    }
    @Override
    public final AuthenticationMechanismException mechMalformedFields(final IllegalArgumentException ex) {
        final AuthenticationMechanismException result = new AuthenticationMechanismException(String.format(getLoggingLocale(), mechMalformedFields$str()), ex);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mechCallbackHandlerFailedForUnknownReason$str() {
        return "WFLYSRV0306: Callback handler failed for unknown reason";
    }
    @Override
    public final AuthenticationMechanismException mechCallbackHandlerFailedForUnknownReason(final Throwable cause) {
        final AuthenticationMechanismException result = new AuthenticationMechanismException(String.format(getLoggingLocale(), mechCallbackHandlerFailedForUnknownReason$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mechNoLoginNameGiven$str() {
        return "WFLYSRV0307: No authentication mechanism login name was given";
    }
    @Override
    public final AuthenticationMechanismException mechNoLoginNameGiven() {
        final AuthenticationMechanismException result = new AuthenticationMechanismException(String.format(getLoggingLocale(), mechNoLoginNameGiven$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParseEnumProperty$str() {
        return "WFLYSRV0308: Failed to parse property (%s), value (%s) should match one of: %s";
    }
    @Override
    public final IllegalArgumentException failedToParseEnumProperty(final String name, final String value, final Set<?> values) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), failedToParseEnumProperty$str(), name, value, values));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedStability$str() {
        return "WFLYSRV0309: %s stability level is not supported in %s";
    }
    @Override
    public final IllegalArgumentException unsupportedStability(final Stability stability, final String name) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unsupportedStability$str(), stability, name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void caughtExceptionDuringShutdown(final Throwable e) {
        super.log.logf(FQCN, ERROR, e, caughtExceptionDuringShutdown$str());
    }
    protected String caughtExceptionDuringShutdown$str() {
        return "WFLYSRV0312: Caught exception during shutdown";
    }
    @Override
    public final void suspendFailed(final Throwable e) {
        super.log.logf(FQCN, ERROR, e, suspendFailed$str());
    }
    protected String suspendFailed$str() {
        return "WFLYSRV0313: Caught exception during server suspend";
    }
    @Override
    public final void resumeFailed(final Throwable e) {
        super.log.logf(FQCN, ERROR, e, resumeFailed$str());
    }
    protected String resumeFailed$str() {
        return "WFLYSRV0314: Caught exception during server resume";
    }
    @Override
    public final void failedToRestoreConfiguration(final Path failed, final String repository, final String cause) {
        super.log.logf(FQCN, ERROR, null, failedToRestoreConfiguration$str(), failed, repository, cause);
    }
    protected String failedToRestoreConfiguration$str() {
        return "WFLYSRV0315: Failed to restore file %s after failing to initialize the git repository %s -- Cause: %s";
    }
    @Override
    public final void startedWithRootUser(final String userName) {
        super.log.logf(FQCN, WARN, null, startedWithRootUser$str(), userName);
    }
    protected String startedWithRootUser$str() {
        return "WFLYSRV0316: Server started as %s. If this user has elevated privileges, it is discouraged to run the server under this account, as it can compromise system security. You can dismiss this warning by starting the server with: -Djboss.ignore.root.username.warning=true";
    }
    protected String processStateChangeNotificationDescription$str() {
        return "Notification emitted when the process state changes";
    }
    @Override
    public final String processStateChangeNotificationDescription() {
        return String.format(getLoggingLocale(), processStateChangeNotificationDescription$str());
    }
    protected String jmxAttributeChange$str() {
        return "The attribute '%s' has changed from '%s' to '%s'";
    }
    @Override
    public final String jmxAttributeChange(final String name, final String oldState, final String stateString) {
        return String.format(getLoggingLocale(), jmxAttributeChange$str(), name, oldState, stateString);
    }
    protected String repositoryInitialized$str() {
        return "Repository initialized";
    }
    @Override
    public final String repositoryInitialized() {
        return String.format(getLoggingLocale(), repositoryInitialized$str());
    }
    protected String addingIgnored$str() {
        return "Adding .gitignore";
    }
    @Override
    public final String addingIgnored() {
        return String.format(getLoggingLocale(), addingIgnored$str());
    }
    protected String serverConfigFileInUse$str() {
        return "- Server configuration file in use: %s";
    }
    @Override
    public final String serverConfigFileInUse(final String serverConfigFile) {
        return String.format(getLoggingLocale(), serverConfigFileInUse$str(), serverConfigFile);
    }
    protected String serverStabilityInUse$str() {
        return "- Minimum feature stability level: %s";
    }
    @Override
    public final String serverStabilityInUse(final Stability stability) {
        return String.format(getLoggingLocale(), serverStabilityInUse$str(), stability);
    }
    protected String startedCleanMessage$str() {
        return "%s started in %dms - Started %d of %d services (%d services are lazy, passive or on-demand) %s";
    }
    @Override
    public final String startedCleanMessage(final String prettyVersionString, final long time, final int startedServices, final int allServices, final int passiveOnDemandServices, final String append) {
        return String.format(getLoggingLocale(), startedCleanMessage$str(), prettyVersionString, time, startedServices, allServices, passiveOnDemandServices, append);
    }
    protected String startedWitErrorsMessage$str() {
        return "%s started (with errors) in %dms - Started %d of %d services (%d services failed or missing dependencies, %d services are lazy, passive or on-demand) %s";
    }
    @Override
    public final String startedWitErrorsMessage(final String prettyVersionString, final long time, final int startedServices, final int allServices, final int problemServices, final int passiveOnDemandServices, final String append) {
        return String.format(getLoggingLocale(), startedWitErrorsMessage$str(), prettyVersionString, time, startedServices, allServices, problemServices, passiveOnDemandServices, append);
    }
}
