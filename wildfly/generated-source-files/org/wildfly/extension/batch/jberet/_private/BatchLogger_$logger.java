package org.wildfly.extension.batch.jberet._private;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import org.jboss.vfs.VirtualFile;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import jakarta.batch.operations.JobStartException;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import jakarta.batch.operations.NoSuchJobException;
import org.jboss.as.controller.PathElement;
import jakarta.batch.operations.JobSecurityException;
import jakarta.batch.operations.BatchRuntimeException;
import org.jboss.logging.BasicLogger;
import java.security.Permission;
import java.lang.Throwable;
import java.lang.ClassLoader;
import org.jboss.msc.service.StartException;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:01+0200")
public class BatchLogger_$logger extends DelegatingBasicLogger implements BatchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = BatchLogger_$logger.class.getName();
    public BatchLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String errorProcessingBatchJobsDir$str() {
        return "WFLYBATCH000001: Error processing META-INF/batch-jobs directory.";
    }
    @Override
    public final DeploymentUnitProcessingException errorProcessingBatchJobsDir(final Throwable arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), errorProcessingBatchJobsDir$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String cannotRemoveResourceOfType$str() {
        return "WFLYBATCH000002: Resources of type %s cannot be removed";
    }
    @Override
    public final UnsupportedOperationException cannotRemoveResourceOfType(final String arg0) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), cannotRemoveResourceOfType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotFindDeploymentName$str() {
        return "WFLYBATCH000003: Could not find deployment name: %s";
    }
    @Override
    public final IllegalArgumentException couldNotFindDeploymentName(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), couldNotFindDeploymentName$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jobOperatorServiceStopped$str() {
        return "WFLYBATCH000004: The service JobOperatorService has been stopped and cannot execute operations.";
    }
    @Override
    public final IllegalStateException jobOperatorServiceStopped() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), jobOperatorServiceStopped$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSuchJobException$str() {
        return "WFLYBATCH000005: The job name '%s' was not found for the deployment.";
    }
    @Override
    public final NoSuchJobException noSuchJobException(final String arg0) {
        final NoSuchJobException result = new NoSuchJobException(String.format(getLoggingLocale(), noSuchJobException$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotFindJobXml$str() {
        return "WFLYBATCH000006: Could not find the job XML file in the deployment: %s";
    }
    @Override
    public final JobStartException couldNotFindJobXml(final String arg0) {
        final JobStartException result = new JobStartException(String.format(getLoggingLocale(), couldNotFindJobXml$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void invalidJobXmlFile(final String arg0) {
        super.log.logf(FQCN, WARN, null, invalidJobXmlFile$str(), arg0);
    }
    protected String invalidJobXmlFile$str() {
        return "WFLYBATCH000007: Failed processing the job XML file %s. Attempting to execute this job may result in errors.";
    }
    @Override
    public final void emptyJobRepositoryElement(final String arg0) {
        super.log.logf(FQCN, WARN, null, emptyJobRepositoryElement$str(), arg0);
    }
    protected String emptyJobRepositoryElement$str() {
        return "WFLYBATCH000008: Empty job-repository element found in deployment descriptor. Using the default job repository for deployment %s.";
    }
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYBATCH000009: Indexed child resources can only be registered if the parent resource supports ordered children. The parent of '%s' is not indexed";
    }
    @Override
    public final IllegalStateException indexedChildResourceRegistrationNotAvailable(final PathElement arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), indexedChildResourceRegistrationNotAvailable$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToCreateJobRepository$str() {
        return "WFLYBATCH000011: Failed to create %s job repository.";
    }
    @Override
    public final StartException failedToCreateJobRepository(final Throwable arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToCreateJobRepository$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void multipleJobRepositoriesFound() {
        super.log.logf(FQCN, ERROR, null, multipleJobRepositoriesFound$str());
    }
    protected String multipleJobRepositoriesFound$str() {
        return "WFLYBATCH000013: Only one job repository can be defined in the jboss-all.xml deployment descriptor. The first job repository will be used.";
    }
    @Override
    public final void stoppingJob(final long arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, WARN, null, stoppingJob$str(), arg0, arg1, arg2);
    }
    protected String stoppingJob$str() {
        return "WFLYBATCH000014: Stopping execution %d of %s for deployment %s";
    }
    @Override
    public final void stoppingJobFailed(final Throwable arg0, final long arg1, final String arg2, final String arg3) {
        super.log.logf(FQCN, ERROR, arg0, stoppingJobFailed$str(), arg1, arg2, arg3);
    }
    protected String stoppingJobFailed$str() {
        return "WFLYBATCH000015: Failed to stop execution %d for job %s on deployment %s";
    }
    @Override
    public final void failedRestartingJob(final Throwable arg0, final long arg1, final String arg2, final String arg3) {
        super.log.logf(FQCN, ERROR, arg0, failedRestartingJob$str(), arg1, arg2, arg3);
    }
    protected String failedRestartingJob$str() {
        return "WFLYBATCH000016: Failed to restart execution %d for job %s on deployment %s";
    }
    @Override
    public final void restartingJob(final String arg0, final long arg1, final long arg2) {
        super.log.logf(FQCN, INFO, null, restartingJob$str(), arg0, arg1, arg2);
    }
    protected String restartingJob$str() {
        return "WFLYBATCH000017: Restarting previously stopped batch job %s. Previous execution id %d. New execution id %d.";
    }
    protected String noBatchEnvironmentFound$str() {
        return "WFLYBATCH000019: No batch environment was found for class loader: %s";
    }
    @Override
    public final BatchRuntimeException noBatchEnvironmentFound(final ClassLoader arg0) {
        final BatchRuntimeException result = new BatchRuntimeException(String.format(getLoggingLocale(), noBatchEnvironmentFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unauthorized$str() {
        return "WFLYBATCH000020: Permission denied. User %s does not have %s permissions.";
    }
    @Override
    public final JobSecurityException unauthorized(final String arg0, final Permission arg1) {
        final JobSecurityException result = new JobSecurityException(String.format(getLoggingLocale(), unauthorized$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateVirtualFile$str() {
        return "WFLYBATCH000021: Duplicate virtual file %s.";
    }
    @Override
    public final IllegalStateException duplicateVirtualFile(final VirtualFile arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), duplicateVirtualFile$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jobRepositoryServiceStopped$str() {
        return "WFLYBATCH000022: The service JobRepositoryService has been stopped and cannot execute operations.";
    }
    @Override
    public final IllegalStateException jobRepositoryServiceStopped() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), jobRepositoryServiceStopped$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToStopJobs(final Throwable arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, failedToStopJobs$str(), arg1);
    }
    protected String failedToStopJobs$str() {
        return "WFLYBATCH000023: Failed to stop running jobs on deployment %s.";
    }
}
