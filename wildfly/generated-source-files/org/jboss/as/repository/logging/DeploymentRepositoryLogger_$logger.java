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
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:12+0200")
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
    public final void contentAdded(final String arg0) {
        super.log.logf(FQCN, INFO, null, contentAdded$str(), arg0);
    }
    protected String contentAdded$str() {
        return "WFLYDR0001: Content added at location %s";
    }
    @Override
    public final void contentRemoved(final String arg0) {
        super.log.logf(FQCN, INFO, null, contentRemoved$str(), arg0);
    }
    protected String contentRemoved$str() {
        return "WFLYDR0002: Content removed from location %s";
    }
    @Override
    public final void cannotDeleteTempFile(final Throwable arg0, final String arg1) {
        super.log.logf(FQCN, WARN, arg0, cannotDeleteTempFile$str(), arg1);
    }
    protected String cannotDeleteTempFile$str() {
        return "WFLYDR0003: Cannot delete temp file %s, will be deleted on exit";
    }
    protected String cannotCreateDirectory$str() {
        return "WFLYDR0004: Cannot create directory %s";
    }
    @Override
    public final IllegalStateException cannotCreateDirectory(final Throwable arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotCreateDirectory$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String cannotObtainSha1$str() {
        return "WFLYDR0005: Cannot obtain SHA-1 %s";
    }
    @Override
    public final IllegalStateException cannotObtainSha1(final Throwable arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotObtainSha1$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String directoryNotWritable$str() {
        return "WFLYDR0006: Directory %s is not writable";
    }
    @Override
    public final IllegalStateException directoryNotWritable(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), directoryNotWritable$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notADirectory$str() {
        return "WFLYDR0007: %s is not a directory";
    }
    @Override
    public final IllegalStateException notADirectory(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), notADirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void obsoleteContentCleaned(final String arg0) {
        super.log.logf(FQCN, INFO, null, obsoleteContentCleaned$str(), arg0);
    }
    protected String obsoleteContentCleaned$str() {
        return "WFLYDR0009: Content %s is obsolete and will be removed";
    }
    @Override
    public final void contentDeletionError(final Throwable arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, contentDeletionError$str(), arg1);
    }
    protected String contentDeletionError$str() {
        return "WFLYDR0010: Couldn't delete content %s";
    }
    @Override
    public final void localContentListError(final String arg0) {
        super.log.logf(FQCN, INFO, null, localContentListError$str(), arg0);
    }
    protected String localContentListError$str() {
        return "WFLYDR0011: Couldn't list directory files for %s";
    }
    protected String hashingError$str() {
        return "WFLYDR0012: Cannot hash current deployment content %s";
    }
    @Override
    public final RuntimeException hashingError(final Throwable arg0, final Path arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), hashingError$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String forbiddenPath$str() {
        return "WFLYDR0013: Access denied to the content at %s in the deployment";
    }
    @Override
    public final IllegalArgumentException forbiddenPath(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), forbiddenPath$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void couldNotDeleteDeployment(final Exception arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, couldNotDeleteDeployment$str(), arg1);
    }
    protected String couldNotDeleteDeployment$str() {
        return "WFLYDR0014: Error deleting deployment %s";
    }
    protected String notAnArchive$str() {
        return "WFLYDR0015: %s is not an archive file";
    }
    @Override
    public final IllegalStateException notAnArchive(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), notAnArchive$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String archiveNotFound$str() {
        return "WFLYDR0016: Achive file %s not found";
    }
    @Override
    public final ExplodedContentException archiveNotFound(final String arg0) {
        final ExplodedContentException result = new ExplodedContentException(String.format(getLoggingLocale(), archiveNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void contentExploded(final String arg0) {
        super.log.logf(FQCN, INFO, null, contentExploded$str(), arg0);
    }
    protected String contentExploded$str() {
        return "WFLYDR0017: Content exploded at location %s";
    }
    protected String errorExplodingContent$str() {
        return "WFLYDR0018: Error exploding content for %s";
    }
    @Override
    public final ExplodedContentException errorExplodingContent(final Exception arg0, final String arg1) {
        final ExplodedContentException result = new ExplodedContentException(String.format(getLoggingLocale(), errorExplodingContent$str(), arg1), arg0);
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
    public final ExplodedContentException errorAccessingDeployment(final Exception arg0) {
        final ExplodedContentException result = new ExplodedContentException(String.format(getLoggingLocale(), errorAccessingDeployment$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorUpdatingDeployment$str() {
        return "WFLYDR0021: Error updating content of exploded deployment";
    }
    @Override
    public final ExplodedContentException errorUpdatingDeployment(final Exception arg0) {
        final ExplodedContentException result = new ExplodedContentException(String.format(getLoggingLocale(), errorUpdatingDeployment$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorCopyingDeployment$str() {
        return "WFLYDR0022: Error copying files of exploded deployment to %s";
    }
    @Override
    public final ExplodedContentException errorCopyingDeployment(final Exception arg0, final String arg1) {
        final ExplodedContentException result = new ExplodedContentException(String.format(getLoggingLocale(), errorCopyingDeployment$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void cannotDeleteFile(final Exception arg0, final Path arg1) {
        super.log.logf(FQCN, ERROR, arg0, cannotDeleteFile$str(), arg1);
    }
    protected String cannotDeleteFile$str() {
        return "WFLYDR0023: Error deleting file %s";
    }
    @Override
    public final void cannotCopyFile(final Exception arg0, final Path arg1) {
        super.log.logf(FQCN, ERROR, arg0, cannotCopyFile$str(), arg1);
    }
    protected String cannotCopyFile$str() {
        return "WFLYDR0024: Error copying file %s";
    }
    protected String forbiddenHostFilePath$str() {
        return "WFLYDR0025: Access denied to path %s";
    }
    @Override
    public final IllegalArgumentException forbiddenHostFilePath(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), forbiddenHostFilePath$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
