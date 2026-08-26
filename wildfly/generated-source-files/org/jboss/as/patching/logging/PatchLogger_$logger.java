package org.jboss.as.patching.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.as.patching.PatchingException;
import org.jboss.as.patching.ContentConflictsException;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.as.patching.validation.PatchingArtifact.ArtifactState;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import java.io.IOException;
import java.io.SyncFailedException;
import org.jboss.logging.Logger;
import org.jboss.logging.BasicLogger;
import java.util.Collection;
import java.lang.Throwable;
import java.util.Arrays;
import org.jboss.as.patching.metadata.ContentItem;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:44+0200")
public class PatchLogger_$logger extends DelegatingBasicLogger implements PatchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = PatchLogger_$logger.class.getName();
    public PatchLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void cannotDeleteFile(final String arg0) {
        super.log.logf(FQCN, WARN, null, cannotDeleteFile$str(), arg0);
    }
    protected String cannotDeleteFile$str() {
        return "WFLYPAT0001: Cannot delete file %s";
    }
    @Override
    public final void cannotInvalidateZip(final String arg0) {
        super.log.logf(FQCN, WARN, null, cannotInvalidateZip$str(), arg0);
    }
    protected String cannotInvalidateZip$str() {
        return "WFLYPAT0002: Cannot invalidate %s";
    }
    protected String detectedConflicts$str() {
        return "Conflicts detected";
    }
    @Override
    public final String detectedConflicts() {
        return String.format(getLoggingLocale(), detectedConflicts$str());
    }
    protected String cliFailedToResolveDistribution$str() {
        return "failed to resolve a jboss.home.dir use the --distribution attribute to point to a valid installation";
    }
    @Override
    public final IllegalStateException cliFailedToResolveDistribution() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cliFailedToResolveDistribution$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String installationNoLayersConfigFound$str() {
        return "No layers directory found at %s";
    }
    @Override
    public final IllegalStateException installationNoLayersConfigFound(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), installationNoLayersConfigFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String installationMissingLayer$str() {
        return "Cannot find layer '%s' under directory %s";
    }
    @Override
    public final IllegalStateException installationMissingLayer(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), installationMissingLayer$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String installationInvalidLayerConfiguration$str() {
        return "no associated module or bundle repository with layer '%s'";
    }
    @Override
    public final IllegalStateException installationInvalidLayerConfiguration(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), installationInvalidLayerConfiguration$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String installationDuplicateLayer$str() {
        return "Duplicate %s '%s'";
    }
    @Override
    public final IllegalStateException installationDuplicateLayer(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), installationDuplicateLayer$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notADirectory$str() {
        return "Not a directory %s";
    }
    @Override
    public final IllegalStateException notADirectory(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), notADirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String patchTypesDontMatch$str() {
        return "patch types don't match";
    }
    @Override
    public final IllegalStateException patchTypesDontMatch() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), patchTypesDontMatch$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidRollbackInformation$str() {
        return "invalid rollback information";
    }
    @Override
    public final PatchingException invalidRollbackInformation() {
        final PatchingException result = new PatchingException(String.format(getLoggingLocale(), invalidRollbackInformation$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String doesNotApply$str() {
        return "WFLYPAT0003: Patch does not apply - expected (%s), but was (%s)";
    }
    @Override
    public final PatchingException doesNotApply(final String arg0, final String arg1) {
        final PatchingException result = new PatchingException(String.format(getLoggingLocale(), doesNotApply$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToDelete$str() {
        return "WFLYPAT0004: Failed to delete (%s)";
    }
    @Override
    public final IOException failedToDelete(final String arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), failedToDelete$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCreateDirectory$str() {
        return "WFLYPAT0005: Failed to create directory (%s)";
    }
    @Override
    public final IOException cannotCreateDirectory(final String arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), cannotCreateDirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String fileDoesNotExist$str() {
        return "WFLYPAT0008: File at path specified by argument %s does not exist";
    }
    @Override
    public final String fileDoesNotExist(final String arg0) {
        return String.format(getLoggingLocale(), fileDoesNotExist$str(), arg0);
    }
    protected String cannotRollbackPatch$str() {
        return "WFLYPAT0011: Cannot rollback patch (%s)";
    }
    @Override
    public final PatchingException cannotRollbackPatch(final String arg0) {
        final PatchingException result = new PatchingException(String.format(getLoggingLocale(), cannotRollbackPatch$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String alreadyApplied$str() {
        return "WFLYPAT0012: Patch '%s' already applied";
    }
    @Override
    public final PatchingException alreadyApplied(final String arg0) {
        final PatchingException result = new PatchingException(String.format(getLoggingLocale(), alreadyApplied$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSuchLayer$str() {
        return "WFLYPAT0013: There is no layer called %s installed";
    }
    @Override
    public final PatchingException noSuchLayer(final String arg0) {
        final PatchingException result = new PatchingException(String.format(getLoggingLocale(), noSuchLayer$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToResolvePatch$str() {
        return "WFLYPAT0014: Failed to resolve a valid patch descriptor for %s %s";
    }
    @Override
    public final PatchingException failedToResolvePatch(final String arg0, final String arg1) {
        final PatchingException result = new PatchingException(String.format(getLoggingLocale(), failedToResolvePatch$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String requiresPatch$str() {
        return "WFLYPAT0015: Requires patch '%s'";
    }
    @Override
    public final PatchingException requiresPatch(final String arg0) {
        final PatchingException result = new PatchingException(String.format(getLoggingLocale(), requiresPatch$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String incompatiblePatch$str() {
        return "WFLYPAT0016: Patch is incompatible with patch '%s'";
    }
    @Override
    public final PatchingException incompatiblePatch(final String arg0) {
        final PatchingException result = new PatchingException(String.format(getLoggingLocale(), incompatiblePatch$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String conflictsDetected$str() {
        return "WFLYPAT0017: Conflicts detected";
    }
    @Override
    public final ContentConflictsException conflictsDetected(final Collection<ContentItem> arg0) {
        final ContentConflictsException result = new ContentConflictsException(String.format(getLoggingLocale(), conflictsDetected$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String wrongCopiedContent$str() {
        return "WFLYPAT0018: copied content does not match expected hash for item: %s";
    }
    @Override
    public final SyncFailedException wrongCopiedContent(final ContentItem arg0) {
        final SyncFailedException result = new SyncFailedException(String.format(getLoggingLocale(), wrongCopiedContent$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalPatchName$str() {
        return "WFLYPAT0019: invalid patch name '%s'";
    }
    @Override
    public final IllegalArgumentException illegalPatchName(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalPatchName$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noPatchesApplied$str() {
        return "WFLYPAT0020: Cannot rollback. No patches applied.";
    }
    @Override
    public final IllegalArgumentException noPatchesApplied() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noPatchesApplied$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String patchNotFoundInHistory$str() {
        return "WFLYPAT0021: Patch '%s' not found in history.";
    }
    @Override
    public final PatchingException patchNotFoundInHistory(final String arg0) {
        final PatchingException result = new PatchingException(String.format(getLoggingLocale(), patchNotFoundInHistory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToShowHistory$str() {
        return "WFLYPAT0023: Failed to show history of patches";
    }
    @Override
    public final OperationFailedException failedToShowHistory(final Throwable arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), failedToShowHistory$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverRequiresRestart$str() {
        return "WFLYPAT0024: Unable to apply or rollback a patch when the server is in a restart-required state.";
    }
    @Override
    public final OperationFailedException serverRequiresRestart() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), serverRequiresRestart$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLoadIdentity$str() {
        return "WFLYPAT0025: failed to load identity info";
    }
    @Override
    public final String failedToLoadIdentity() {
        return String.format(getLoggingLocale(), failedToLoadIdentity$str());
    }
    protected String noMorePatches$str() {
        return "WFLYPAT0026: No more patches";
    }
    @Override
    public final String noMorePatches() {
        return String.format(getLoggingLocale(), noMorePatches$str());
    }
    protected String noPatchHistory$str() {
        return "WFLYPAT0027: No patch history %s";
    }
    @Override
    public final String noPatchHistory(final String arg0) {
        return String.format(getLoggingLocale(), noPatchHistory$str(), arg0);
    }
    protected String patchIsMissingFile$str() {
        return "WFLYPAT0028: Patch is missing file %s";
    }
    @Override
    public final String patchIsMissingFile(final String arg0) {
        return String.format(getLoggingLocale(), patchIsMissingFile$str(), arg0);
    }
    protected String fileIsNotReadable$str() {
        return "WFLYPAT0029: File is not readable %s";
    }
    @Override
    public final String fileIsNotReadable(final String arg0) {
        return String.format(getLoggingLocale(), fileIsNotReadable$str(), arg0);
    }
    protected String layerNotFound$str() {
        return "WFLYPAT0030: Layer not found %s";
    }
    @Override
    public final String layerNotFound(final String arg0) {
        return String.format(getLoggingLocale(), layerNotFound$str(), arg0);
    }
    @Override
    public final void failedToUndoChange(final String arg0) {
        super.log.logf(FQCN, ERROR, null, failedToUndoChange$str(), arg0);
    }
    protected String failedToUndoChange$str() {
        return "WFLYPAT0031: failed to undo change for: '%s'";
    }
    protected String missingArtifact$str() {
        return "WFLYPAT0032: missing: '%s'";
    }
    @Override
    public final String missingArtifact(final ArtifactState arg0) {
        return String.format(getLoggingLocale(), missingArtifact$str(), arg0);
    }
    protected String inconsistentArtifact$str() {
        return "WFLYPAT0033: inconsistent state: '%s'";
    }
    @Override
    public final String inconsistentArtifact(final ArtifactState arg0) {
        return String.format(getLoggingLocale(), inconsistentArtifact$str(), arg0);
    }
    protected String artifactInError$str() {
        return "WFLYPAT0034: in error: '%s'";
    }
    @Override
    public final String artifactInError(final ArtifactState arg0) {
        return String.format(getLoggingLocale(), artifactInError$str(), arg0);
    }
    @Override
    public final void cannotRenameFile(final String arg0) {
        super.log.logf(FQCN, WARN, null, cannotRenameFile$str(), arg0);
    }
    protected String cannotRenameFile$str() {
        return "WFLYPAT0035: Cannot rename file %s";
    }
    protected String cannotRenameFileDuringBackup$str() {
        return "WFLYPAT0036: Cannot process backup by renaming file %s";
    }
    @Override
    public final IllegalStateException cannotRenameFileDuringBackup(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotRenameFileDuringBackup$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRenameFileDuringRestore$str() {
        return "WFLYPAT0037: Cannot process restore by renaming file %s";
    }
    @Override
    public final IllegalStateException cannotRenameFileDuringRestore(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotRenameFileDuringRestore$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateElementPatchId$str() {
        return "WFLYPAT0038: Duplicate element patch-id (%s)";
    }
    @Override
    public final IllegalStateException duplicateElementPatchId(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), duplicateElementPatchId$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String productVersionDidNotMatchInstalled$str() {
        return "WFLYPAT0039: Requested %s version %s did not match the installed version %s";
    }
    @Override
    public final String productVersionDidNotMatchInstalled(final String arg0, final String arg1, final String arg2) {
        return String.format(getLoggingLocale(), productVersionDidNotMatchInstalled$str(), arg0, arg1, arg2);
    }
    protected String failedToLoadInfo$str() {
        return "WFLYPAT0040: failed to load %s info";
    }
    @Override
    public final String failedToLoadInfo(final String arg0) {
        return String.format(getLoggingLocale(), failedToLoadInfo$str(), arg0);
    }
    protected String patchIdFoundInMoreThanOneStream$str() {
        return "WFLYPAT0041: Patch %s found in more than one stream: %s and %s";
    }
    @Override
    public final String patchIdFoundInMoreThanOneStream(final String arg0, final String arg1, final String arg2) {
        return String.format(getLoggingLocale(), patchIdFoundInMoreThanOneStream$str(), arg0, arg1, arg2);
    }
    protected String patchBundleIsEmpty$str() {
        return "WFLYPAT0042: Patch bundle is empty";
    }
    @Override
    public final String patchBundleIsEmpty() {
        return String.format(getLoggingLocale(), patchBundleIsEmpty$str());
    }
    protected String contentItemTypeMissing$str() {
        return "WFLYPAT0043: Content item type is missing in '%s'";
    }
    @Override
    public final PatchingException contentItemTypeMissing(final String arg0) {
        final PatchingException result = new PatchingException(String.format(getLoggingLocale(), contentItemTypeMissing$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedContentType$str() {
        return "WFLYPAT0044: Unsupported content type '%s'";
    }
    @Override
    public final String unsupportedContentType(final String arg0) {
        return String.format(getLoggingLocale(), unsupportedContentType$str(), arg0);
    }
    protected String unrecognizedConditionFormat$str() {
        return "WFLYPAT0045: Unrecognized condition format '%s'";
    }
    @Override
    public final PatchingException unrecognizedConditionFormat(final String arg0) {
        final PatchingException result = new PatchingException(String.format(getLoggingLocale(), unrecognizedConditionFormat$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCopyFilesToTempDir$str() {
        return "WFLYPAT0046: Cannot copy files to temporary directory %s: %s. Note that '-Djava.io.tmpdir' switch can be used to set different temporary directory.";
    }
    @Override
    public final PatchingException cannotCopyFilesToTempDir(final String arg0, final String arg1, final Throwable arg2) {
        final PatchingException result = new PatchingException(String.format(getLoggingLocale(), cannotCopyFilesToTempDir$str(), arg0, arg1), arg2);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCopyFiles$str() {
        return "WFLYPAT0047: Cannot copy files from %s to %s: %s";
    }
    @Override
    public final IOException cannotCopyFiles(final String arg0, final String arg1, final String arg2, final Throwable arg3) {
        final IOException result = new IOException(String.format(getLoggingLocale(), cannotCopyFiles$str(), arg0, arg1, arg2), arg3);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void deleteRollbackError(final String arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, null, deleteRollbackError$str(), arg0, arg1);
    }
    protected String deleteRollbackError$str() {
        return "WFLYPAT0048: Error when restoring file[%s] - %s";
    }
    protected String failedToDeleteBackup$str() {
        return "WFLYPAT0049: Some backup files were not removed.";
    }
    @Override
    public final IOException failedToDeleteBackup() {
        final IOException result = new IOException(String.format(getLoggingLocale(), failedToDeleteBackup$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void logPatchingInfo(final String arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, INFO, null, logPatchingInfo$str(), arg0, arg1, arg2);
    }
    protected String logPatchingInfo$str() {
        return "WFLYPAT0050: %s cumulative patch ID is: %s, one-off patches include: %s";
    }
    protected String entryOutsideOfPatchDirectory$str() {
        return "WFLYPAT0051: Invalid zip file. Found an entry that resolves to a path outside of the patch directory: %s";
    }
    @Override
    public final IOException entryOutsideOfPatchDirectory(final String arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), entryOutsideOfPatchDirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
