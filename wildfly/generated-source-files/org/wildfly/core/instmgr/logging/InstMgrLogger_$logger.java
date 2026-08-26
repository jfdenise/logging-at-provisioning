package org.wildfly.core.instmgr.logging;

import java.util.Locale;
import java.nio.file.Path;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.util.zip.ZipException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.lang.Exception;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:21+0200")
public class InstMgrLogger_$logger extends DelegatingBasicLogger implements InstMgrLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = InstMgrLogger_$logger.class.getName();
    public InstMgrLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String serverAlreadyPrepared$str() {
        return "WFLYIM0001: There is an installation prepared and ready to be applied. The current prepared installation can be discarded by using the 'clean' operation.";
    }
    @Override
    public final OperationFailedException serverAlreadyPrepared() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), serverAlreadyPrepared$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String unexpectedArtifactChange$str() {
        return "WFLYIM0002: Invalid status change found for the artifact: '%s'";
    }
    @Override
    public final RuntimeException unexpectedArtifactChange(final String arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unexpectedArtifactChange$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedConfigurationChange$str() {
        return "WFLYIM0003: Invalid status change found for the configuration change: '%s'";
    }
    @Override
    public final RuntimeException unexpectedConfigurationChange(final String arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unexpectedConfigurationChange$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingChannelName$str() {
        return "WFLYIM0004: Channel name is mandatory.";
    }
    @Override
    public final OperationFailedException missingChannelName() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), missingChannelName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noChannelRepositoriesDefined$str() {
        return "WFLYIM0005: No repositories have been defined in the '%s' channel.";
    }
    @Override
    public final OperationFailedException noChannelRepositoriesDefined(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noChannelRepositoriesDefined$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noChannelRepositoryURLDefined$str() {
        return "WFLYIM0006: The '%s' repository in the channel does not have its URL defined.";
    }
    @Override
    public final OperationFailedException noChannelRepositoryURLDefined(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noChannelRepositoryURLDefined$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidChannelRepositoryURL$str() {
        return "WFLYIM0007: The repository URL '%s' for '%s' channel is invalid.";
    }
    @Override
    public final OperationFailedException invalidChannelRepositoryURL(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidChannelRepositoryURL$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noChannelRepositoryIDDefined$str() {
        return "WFLYIM0008: The '%s' repository in the channel does not have its ID defined.";
    }
    @Override
    public final OperationFailedException noChannelRepositoryIDDefined(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noChannelRepositoryIDDefined$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidChannelManifestGAV$str() {
        return "WFLYIM0009: The manifest GAV coordinate '%s' for '%s' channel is invalid.";
    }
    @Override
    public final OperationFailedException invalidChannelManifestGAV(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidChannelManifestGAV$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidChannelManifestURL$str() {
        return "WFLYIM0010: The manifest URL '%s' for '%s' channel is invalid.";
    }
    @Override
    public final OperationFailedException invalidChannelManifestURL(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidChannelManifestURL$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String localCacheWithNoResolveLocalCache$str() {
        return "WFLYIM0011: You cannot use the 'local-cache' option when the 'no-resolve-local-cache' option is enabled.";
    }
    @Override
    public final OperationFailedException localCacheWithNoResolveLocalCache() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), localCacheWithNoResolveLocalCache$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mavenRepoFileWithRepositories$str() {
        return "WFLYIM0012: You cannot use the 'maven-repo-file' option with the 'repositories' option because they are mutually exclusive.";
    }
    @Override
    public final OperationFailedException mavenRepoFileWithRepositories() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), mavenRepoFileWithRepositories$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidRepositoryURL$str() {
        return "WFLYIM0013: Invalid format for the repository URL: '%s'";
    }
    @Override
    public final OperationFailedException invalidRepositoryURL(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidRepositoryURL$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String workDirWithMavenRepoFileOrRepositories$str() {
        return "WFLYIM0014: You cannot use the 'work-dir' option with the 'repositories' or 'maven-repo-file' options because they are mutually exclusive.";
    }
    @Override
    public final OperationFailedException workDirWithMavenRepoFileOrRepositories() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), workDirWithMavenRepoFileOrRepositories$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String channelNameNotFound$str() {
        return "WFLYIM0015: Channel with name '%s' cannot be found.";
    }
    @Override
    public final OperationFailedException channelNameNotFound(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), channelNameNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidManifestGAOnly$str() {
        return "WFLYIM0016: The manifest maven coordinates for '%s' are invalid. The expected maven coordinates for this manifest are GA (GroupId:ArtifactId).";
    }
    @Override
    public final OperationFailedException invalidManifestGAOnly(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidManifestGAOnly$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidManifestGAV$str() {
        return "WFLYIM0017: The manifest maven coordinates for '%s' are invalid. The expected maven coordinates for this manifest are GAV (GroupId:ArtifactId:Version) where Version is optional.";
    }
    @Override
    public final OperationFailedException invalidManifestGAV(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidManifestGAV$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String installationManagerServiceDown$str() {
        return "WFLYIM0018: Installation Manager Service is down.";
    }
    @Override
    public final IllegalStateException installationManagerServiceDown() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), installationManagerServiceDown$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String operationCancelled$str() {
        return "WFLYIM0019: Operation has been cancelled.";
    }
    @Override
    public final OperationFailedException operationCancelled() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), operationCancelled$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noCustomPatchFound$str() {
        return "WFLYIM0020: No custom patches installed found for the specified manifest maven coordinates: '%s'";
    }
    @Override
    public final OperationFailedException noCustomPatchFound(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noCustomPatchFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String localCacheWithUseDefaultLocalCache$str() {
        return "WFLYIM0021: You cannot use the 'local-cache' option when the 'use-default-local-cache' option is enabled.";
    }
    @Override
    public final OperationFailedException localCacheWithUseDefaultLocalCache() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), localCacheWithUseDefaultLocalCache$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noResolveLocalCacheWithUseDefaultLocalCache$str() {
        return "WFLYIM0022: 'no-resolve-local-cache' and 'use-default-local-cache' are mutually exclusive (specify only one).";
    }
    @Override
    public final OperationFailedException noResolveLocalCacheWithUseDefaultLocalCache() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noResolveLocalCacheWithUseDefaultLocalCache$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void provisioningChannels(final String arg0) {
        super.log.logf(FQCN, INFO, null, provisioningChannels$str(), arg0);
    }
    protected String provisioningChannels$str() {
        return "WFLYIM0023: Installation was provisioned using the following channel manifest versions: %s";
    }
    @Override
    public final void failedToCreateInstallationManager(final Path arg0, final Exception arg1) {
        super.log.logf(FQCN, ERROR, null, failedToCreateInstallationManager$str(), arg0, arg1);
    }
    protected String failedToCreateInstallationManager$str() {
        return "WFLYIM0024: Cannot report installation status. Cannot create an InstallationManager for path '%s': '%s'";
    }
    @Override
    public final void failedToFindInstallationChannels(final Exception arg0) {
        super.log.logf(FQCN, ERROR, null, failedToFindInstallationChannels$str(), arg0);
    }
    protected String failedToFindInstallationChannels$str() {
        return "WFLYIM0025: Cannot report installation channels: '%s'";
    }
    protected String exactlyOneOfManifestVersionOrUrlRequired$str() {
        return "WFLYIM0026: Exactly one of version string or URL fields is required to define a manifest version.";
    }
    @Override
    public final OperationFailedException exactlyOneOfManifestVersionOrUrlRequired() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), exactlyOneOfManifestVersionOrUrlRequired$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String zipEntryOutsideOfTarget$str() {
        return "Zip entry %s is outside of the target dir %s.";
    }
    @Override
    public final ZipException zipEntryOutsideOfTarget(final String arg0, final String arg1) {
        final ZipException result = new ZipException(String.format(getLoggingLocale(), zipEntryOutsideOfTarget$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidZipEntry$str() {
        return "The structure of directories and files in the .zip file is invalid. The '%s' directory cannot be found as a second-level entry in the extracted .zip file.";
    }
    @Override
    public final ZipException invalidZipEntry(final String arg0) {
        final ZipException result = new ZipException(String.format(getLoggingLocale(), invalidZipEntry$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
