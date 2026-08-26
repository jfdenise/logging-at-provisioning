package org.jboss.as.repository.logging;

import java.util.Locale;
import java.nio.file.Path;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.lang.Exception;
import org.jboss.as.repository.ExplodedContentException;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.util.Arrays;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:26:21+0200")
public class DeploymentRepositoryLogger_$logger extends DelegatingBasicLogger implements DeploymentRepositoryLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = DeploymentRepositoryLogger_$logger.class.getName();
    public DeploymentRepositoryLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void contentAdded(final String path) {
        super.log.logf(FQCN, INFO, null, contentAdded$str(), path);
    }
    protected String contentAdded$str() {
        return "WFLYDR0001: Content added at location %s";
    }
    @Override
    public final void contentRemoved(final String path) {
        super.log.logf(FQCN, INFO, null, contentRemoved$str(), path);
    }
    protected String contentRemoved$str() {
        return "WFLYDR0002: Content removed from location %s";
    }
    @Override
    public final void cannotDeleteTempFile(final Throwable cause, final String path) {
        super.log.logf(FQCN, WARN, cause, cannotDeleteTempFile$str(), path);
    }
    protected String cannotDeleteTempFile$str() {
        return "WFLYDR0003: Cannot delete temp file %s, will be deleted on exit";
    }
    protected String cannotCreateDirectory$str() {
        return "WFLYDR0004: Cannot create directory %s";
    }
    @Override
    public final IllegalStateException cannotCreateDirectory(final Throwable cause, final String path) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotCreateDirectory$str(), path), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String cannotObtainSha1$str() {
        return "WFLYDR0005: Cannot obtain SHA-1 %s";
    }
    @Override
    public final IllegalStateException cannotObtainSha1(final Throwable cause, final String name) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotObtainSha1$str(), name), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String directoryNotWritable$str() {
        return "WFLYDR0006: Directory %s is not writable";
    }
    @Override
    public final IllegalStateException directoryNotWritable(final String path) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), directoryNotWritable$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notADirectory$str() {
        return "WFLYDR0007: %s is not a directory";
    }
    @Override
    public final IllegalStateException notADirectory(final String path) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), notADirectory$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void obsoleteContentCleaned(final String contentIdentifier) {
        super.log.logf(FQCN, INFO, null, obsoleteContentCleaned$str(), contentIdentifier);
    }
    protected String obsoleteContentCleaned$str() {
        return "WFLYDR0009: Content %s is obsolete and will be removed";
    }
    @Override
    public final void contentDeletionError(final Throwable cause, final String name) {
        super.log.logf(FQCN, ERROR, cause, contentDeletionError$str(), name);
    }
    protected String contentDeletionError$str() {
        return "WFLYDR0010: Couldn't delete content %s";
    }
    @Override
    public final void localContentListError(final String name) {
        super.log.logf(FQCN, INFO, null, localContentListError$str(), name);
    }
    protected String localContentListError$str() {
        return "WFLYDR0011: Couldn't list directory files for %s";
    }
    protected String hashingError$str() {
        return "WFLYDR0012: Cannot hash current deployment content %s";
    }
    @Override
    public final RuntimeException hashingError(final Throwable cause, final Path path) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), hashingError$str(), path), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String forbiddenPath$str() {
        return "WFLYDR0013: Access denied to the content at %s in the deployment";
    }
    @Override
    public final IllegalArgumentException forbiddenPath(final String path) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), forbiddenPath$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void couldNotDeleteDeployment(final Exception ex, final String path) {
        super.log.logf(FQCN, ERROR, ex, couldNotDeleteDeployment$str(), path);
    }
    protected String couldNotDeleteDeployment$str() {
        return "WFLYDR0014: Error deleting deployment %s";
    }
    protected String notAnArchive$str() {
        return "WFLYDR0015: %s is not an archive file";
    }
    @Override
    public final IllegalStateException notAnArchive(final String path) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), notAnArchive$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String archiveNotFound$str() {
        return "WFLYDR0016: Achive file %s not found";
    }
    @Override
    public final ExplodedContentException archiveNotFound(final String path) {
        final ExplodedContentException result = new ExplodedContentException(String.format(getLoggingLocale(), archiveNotFound$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void contentExploded(final String path) {
        super.log.logf(FQCN, INFO, null, contentExploded$str(), path);
    }
    protected String contentExploded$str() {
        return "WFLYDR0017: Content exploded at location %s";
    }
    protected String errorExplodingContent$str() {
        return "WFLYDR0018: Error exploding content for %s";
    }
    @Override
    public final ExplodedContentException errorExplodingContent(final Exception ex, final String path) {
        final ExplodedContentException result = new ExplodedContentException(String.format(getLoggingLocale(), errorExplodingContent$str(), path), ex);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorLockingDeployment$str() {
        return "WFLYDR0019: Deployment is locked by another operation";
    }
    @Override
    public final ExplodedContentException errorLockingDeployment() {
        final ExplodedContentException result = new ExplodedContentException(String.format(getLoggingLocale(), errorLockingDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorAccessingDeployment$str() {
        return "WFLYDR0020: Error accessing deployment files";
    }
    @Override
    public final ExplodedContentException errorAccessingDeployment(final Exception ex) {
        final ExplodedContentException result = new ExplodedContentException(String.format(getLoggingLocale(), errorAccessingDeployment$str()), ex);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorUpdatingDeployment$str() {
        return "WFLYDR0021: Error updating content of exploded deployment";
    }
    @Override
    public final ExplodedContentException errorUpdatingDeployment(final Exception ex) {
        final ExplodedContentException result = new ExplodedContentException(String.format(getLoggingLocale(), errorUpdatingDeployment$str()), ex);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorCopyingDeployment$str() {
        return "WFLYDR0022: Error copying files of exploded deployment to %s";
    }
    @Override
    public final ExplodedContentException errorCopyingDeployment(final Exception ex, final String target) {
        final ExplodedContentException result = new ExplodedContentException(String.format(getLoggingLocale(), errorCopyingDeployment$str(), target), ex);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void cannotDeleteFile(final Exception ex, final Path path) {
        super.log.logf(FQCN, ERROR, ex, cannotDeleteFile$str(), path);
    }
    protected String cannotDeleteFile$str() {
        return "WFLYDR0023: Error deleting file %s";
    }
    @Override
    public final void cannotCopyFile(final Exception ex, final Path path) {
        super.log.logf(FQCN, ERROR, ex, cannotCopyFile$str(), path);
    }
    protected String cannotCopyFile$str() {
        return "WFLYDR0024: Error copying file %s";
    }
}
