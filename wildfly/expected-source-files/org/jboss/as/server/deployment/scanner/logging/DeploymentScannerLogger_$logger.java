package org.jboss.as.server.deployment.scanner.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.util.Arrays;
import java.io.File;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:27:17+0200")
public class DeploymentScannerLogger_$logger extends DelegatingBasicLogger implements DeploymentScannerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = DeploymentScannerLogger_$logger.class.getName();
    public DeploymentScannerLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void cannotDeleteDeploymentProgressMarker(final File file) {
        super.log.logf(FQCN, WARN, null, cannotDeleteDeploymentProgressMarker$str(), file);
    }
    protected String cannotDeleteDeploymentProgressMarker$str() {
        return "WFLYDS0001: Cannot delete deployment progress marker file %s";
    }
    @Override
    public final void cannotRemoveDeploymentMarker(final String fileName) {
        super.log.logf(FQCN, WARN, null, cannotRemoveDeploymentMarker$str(), fileName);
    }
    protected String cannotRemoveDeploymentMarker$str() {
        return "WFLYDS0002: Cannot remove extraneous deployment marker file %s";
    }
    @Override
    public final void cannotRemoveDeploymentMarker(final File file) {
        super.log.logf(FQCN, WARN, null, cannotRemoveDeploymentMarker$str(), file);
    }
    @Override
    public final void deploymentNotFound(final String deploymentName) {
        super.log.logf(FQCN, WARN, null, deploymentNotFound$str(), deploymentName);
    }
    protected String deploymentNotFound$str() {
        return "WFLYDS0003: Deployment of '%s' requested, but the deployment is not present";
    }
    @Override
    public final void deploymentTriggered(final String fileName, final String marker) {
        super.log.logf(FQCN, INFO, null, deploymentTriggered$str(), fileName, marker);
    }
    protected String deploymentTriggered$str() {
        return "WFLYDS0004: Found %1$s in deployment directory. To trigger deployment create a file called %1$s%2$s";
    }
    @Override
    public final void errorWritingDeploymentMarker(final Throwable cause, final String markerFile) {
        super.log.logf(FQCN, ERROR, cause, errorWritingDeploymentMarker$str(), markerFile);
    }
    protected String errorWritingDeploymentMarker$str() {
        return "WFLYDS0005: Caught exception writing deployment marker file %s";
    }
    @Override
    public final void explodedAutoDeploymentContentWarning(final String marker, final String elementName) {
        super.log.logf(FQCN, WARN, null, explodedAutoDeploymentContentWarning$str(), marker, elementName);
    }
    protected String explodedAutoDeploymentContentWarning$str() {
        return "WFLYDS0006: Reliable deployment behaviour is not possible when auto-deployment of exploded content is enabled (i.e. deployment without use of \"%s\"' marker files). Configuration of auto-deployment of exploded content is not recommended in any situation where reliability is desired. Configuring the deployment scanner's %s setting to \"false\" is recommended.";
    }
    @Override
    public final void explodedDeploymentContentDeleted(final String fileName, final String marker) {
        super.log.logf(FQCN, WARN, null, explodedDeploymentContentDeleted$str(), fileName, marker);
    }
    protected String explodedDeploymentContentDeleted$str() {
        return "WFLYDS0007: The deployment scanner found that the content for exploded deployment %1$s has been deleted, but auto-deploy/undeploy for exploded deployments is not enabled and the %1$s%2$s marker file for this deployment has not been removed. As a result, the deployment is not being undeployed, but resources needed by the deployment may have been deleted and application errors may occur. Deleting the %1$s%2$s marker file to trigger undeploy is recommended.";
    }
    @Override
    public final void failedCheckingZipFile(final Throwable cause, final String fileName) {
        super.log.logf(FQCN, ERROR, cause, failedCheckingZipFile$str(), fileName);
    }
    protected String failedCheckingZipFile$str() {
        return "WFLYDS0008: Failed checking whether %s was a complete zip";
    }
    @Override
    public final void fileSystemDeploymentFailed(final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, fileSystemDeploymentFailed$str());
    }
    protected String fileSystemDeploymentFailed$str() {
        return "WFLYDS0009: File system deployment service failed";
    }
    @Override
    public final void incompleteContent(final String name) {
        super.log.logf(FQCN, INFO, null, incompleteContent$str(), name);
    }
    protected String incompleteContent$str() {
        return "WFLYDS0010: Scan found incompletely copied file content for deployment %s. Deployment changes will not be processed until all content is complete.";
    }
    @Override
    public final void invalidExplodedDeploymentDirectory(final String fileName, final String deploymentDir) {
        super.log.logf(FQCN, ERROR, null, invalidExplodedDeploymentDirectory$str(), fileName, deploymentDir);
    }
    protected String invalidExplodedDeploymentDirectory$str() {
        return "WFLYDS0011: The deployment scanner found a directory named %1$s that was not inside a directory whose name ends with .ear, .jar, .rar, .sar or .war. This is likely the result of unzipping an archive directly inside the %2$s directory, which is a user error. The %1$s directory will not be scanned for deployments, but it is possible that the scanner may find other files from the unzipped archive and attempt to deploy them, leading to errors.";
    }
    @Override
    public final void scanException(final Throwable cause, final String fileName) {
        super.log.logf(FQCN, ERROR, cause, scanException$str(), fileName);
    }
    protected String scanException$str() {
        return "WFLYDS0012: Scan of %s threw Exception";
    }
    @Override
    public final void started(final String className, final String deploymentPath) {
        super.log.logf(FQCN, INFO, null, started$str(), className, deploymentPath);
    }
    protected String started$str() {
        return "WFLYDS0013: Started %s for directory %s";
    }
    @Override
    public final void unsafeAutoDeploy(final String marker1, final String marker2, final Set<String> problems) {
        super.log.logf(FQCN, WARN, null, unsafeAutoDeploy$str(), marker1, marker2, problems);
    }
    protected String unsafeAutoDeploy$str() {
        return "WFLYDS0014: Scan found content configured for auto-deploy that could not be safely auto-deployed. See details above. Deployment changes will not be processed until all problematic content is either removed or whether to deploy the content or not is indicated via a %s or %s marker file. Problematic deployments are %s";
    }
    @Override
    public final void reattemptingFailedDeployment(final String deploymentName) {
        super.log.logf(FQCN, INFO, null, reattemptingFailedDeployment$str(), deploymentName);
    }
    protected String reattemptingFailedDeployment$str() {
        return "WFLYDS0015: Re-attempting failed deployment %s";
    }
    @Override
    public final void failedCheckingXMLFile(final Throwable cause, final String fileName) {
        super.log.logf(FQCN, ERROR, cause, failedCheckingXMLFile$str(), fileName);
    }
    protected String failedCheckingXMLFile$str() {
        return "WFLYDS0016: Failed checking whether %s was a complete XML";
    }
    @Override
    public final void initialScanFailed(final Throwable t) {
        super.log.logf(FQCN, ERROR, t, initialScanFailed$str());
    }
    protected String initialScanFailed$str() {
        return "WFLYDS0017: Initial deployment scan failed";
    }
    @Override
    public final void scannerDeploymentUndeployedButNotByScanner(final String deploymentName, final File marker) {
        super.log.logf(FQCN, INFO, null, scannerDeploymentUndeployedButNotByScanner$str(), deploymentName, marker);
    }
    protected String scannerDeploymentUndeployedButNotByScanner$str() {
        return "WFLYDS0018: Deployment %s was previously deployed by this scanner but has been undeployed by another management tool. Marker file %s is being added to record this fact.";
    }
    @Override
    public final void scannerDeploymentRemovedButNotByScanner(final String deploymentName, final File marker) {
        super.log.logf(FQCN, INFO, null, scannerDeploymentRemovedButNotByScanner$str(), deploymentName, marker);
    }
    protected String scannerDeploymentRemovedButNotByScanner$str() {
        return "WFLYDS0019: Deployment %s was previously deployed by this scanner but has been removed from the server deployment list by another management tool. Marker file %s is being added to record this fact.";
    }
    protected String deploymentContentIncomplete$str() {
        return "WFLYDS0021: Deployment content %s appears to be incomplete and is not progressing toward completion. This content cannot be auto-deployed.%s";
    }
    @Override
    public final String deploymentContentIncomplete(final File file, final String suffix) {
        return String.format(getLoggingLocale(), deploymentContentIncomplete$str(), file, suffix);
    }
    protected String deploymentTimeout$str() {
        return "WFLYDS0022: Did not receive a response to the deployment operation within the allowed timeout period [%d seconds]. Check the server configuration file and the server logs to find more about the status of the deployment.";
    }
    @Override
    public final String deploymentTimeout(final long timeout) {
        return String.format(getLoggingLocale(), deploymentTimeout$str(), timeout);
    }
    protected String invalidZipFileFormat$str() {
        return "WFLYDS0025: File %s cannot be scanned because it does not begin with a ZIP file format local file header signature";
    }
    @Override
    public final String invalidZipFileFormat(final String fileName) {
        return String.format(getLoggingLocale(), invalidZipFileFormat$str(), fileName);
    }
    protected String invalidZip64FileFormat$str() {
        return "WFLYDS0026: File %s cannot be scanned because it uses the currently unsupported ZIP64 format";
    }
    @Override
    public final String invalidZip64FileFormat(final String fileName) {
        return String.format(getLoggingLocale(), invalidZip64FileFormat$str(), fileName);
    }
    protected String previousContentDeployed$str() {
        return " A previous version of this content was deployed and remains deployed.";
    }
    @Override
    public final String previousContentDeployed() {
        return String.format(getLoggingLocale(), previousContentDeployed$str());
    }
    protected String unsafeAutoDeploy2$str() {
        return "WFLYDS0030: File %2$s was configured for auto-deploy but could not be safely auto-deployed. The reason the file could not be auto-deployed was: %1$s.  To enable deployment of this file create a file called %2$s%3$s";
    }
    @Override
    public final String unsafeAutoDeploy2(final String errorMsg, final String fileName, final String marker) {
        return String.format(getLoggingLocale(), unsafeAutoDeploy2$str(), errorMsg, fileName, marker);
    }
    protected String deploymentScannerNotForDomainMode$str() {
        return "WFLYDS0031: Extension with module 'org.jboss.as.deployment-scanner' cannot be installed in a managed domain. Please remove it and any subsystem referencing it";
    }
    @Override
    public final IllegalStateException deploymentScannerNotForDomainMode() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), deploymentScannerNotForDomainMode$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String cannotListDirectoryFiles$str() {
        return "WFLYDS0032: Failed to list files in directory %s. Check that the contents of the directory are readable.";
    }
    @Override
    public final RuntimeException cannotListDirectoryFiles(final Throwable ioex, final File directory) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotListDirectoryFiles$str(), directory), ioex);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void scannerDeploymentRedeployedButNotByScanner(final String deploymentName, final File marker) {
        super.log.logf(FQCN, INFO, null, scannerDeploymentRedeployedButNotByScanner$str(), deploymentName, marker);
    }
    protected String scannerDeploymentRedeployedButNotByScanner$str() {
        return "WFLYDS0033: Deployment %s was previously undeployed by this scanner but has been redeployed by another management tool. Marker file %s is being removed to record this fact.";
    }
    @Override
    public final void failedStatusSynchronization(final Throwable cause, final String deploymentName) {
        super.log.logf(FQCN, ERROR, cause, failedStatusSynchronization$str(), deploymentName);
    }
    protected String failedStatusSynchronization$str() {
        return "WFLYDS0034: Failed synchronizing status of deployment %s.";
    }
    protected String invalidXmlFileFound$str() {
        return "WFLYDS0035: Scan found %s which is not well-formed at lineNumber: %s, columnNumber: %s. Either the file was incompletely copied at the time of the scanning or it is just wrong.";
    }
    @Override
    public final String invalidXmlFileFound(final String name, final int lineNumber, final int columnNumber) {
        return String.format(getLoggingLocale(), invalidXmlFileFound$str(), name, lineNumber, columnNumber);
    }
    protected String deployModelOperationFailed$str() {
        return "WFLYDS0036: Deployment model operation failed. %s";
    }
    @Override
    public final RuntimeException deployModelOperationFailed(final String msg) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), deployModelOperationFailed$str(), msg));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void directoryIsNonexistent(final String path) {
        super.log.logf(FQCN, WARN, null, directoryIsNonexistent$str(), path);
    }
    protected String directoryIsNonexistent$str() {
        return "WFLYDS0037: %s does not exist";
    }
    @Override
    public final void isNotADirectory(final String path) {
        super.log.logf(FQCN, WARN, null, isNotADirectory$str(), path);
    }
    protected String isNotADirectory$str() {
        return "WFLYDS0038: %s is not a directory";
    }
    @Override
    public final void directoryIsNotWritable(final String path) {
        super.log.logf(FQCN, WARN, null, directoryIsNotWritable$str(), path);
    }
    protected String directoryIsNotWritable$str() {
        return "WFLYDS0039: %s is not writable";
    }
    protected String pathEntryNotFound$str() {
        return "WFLYDS0040: Could not find relative-to path entry for %s";
    }
    @Override
    public final OperationFailedException pathEntryNotFound(final String pathName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), pathEntryNotFound$str(), pathName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void directoryIsNotReadable(final String path) {
        super.log.logf(FQCN, WARN, null, directoryIsNotReadable$str(), path);
    }
    protected String directoryIsNotReadable$str() {
        return "WFLYDS0041: %s is not readable";
    }
    @Override
    public final void bootTimeScanFailed(final String dir) {
        super.log.logf(FQCN, ERROR, null, bootTimeScanFailed$str(), dir);
    }
    protected String bootTimeScanFailed$str() {
        return "WFLYDS0042: Boot-time scan failed due to inaccessible deployment directory: %s";
    }
    @Override
    public final void scanFailed(final String dir) {
        super.log.logf(FQCN, WARN, null, scanFailed$str(), dir);
    }
    protected String scanFailed$str() {
        return "WFLYDS0043: Deployment directory scan failed due to inaccessible deployment directory: %s";
    }
}
