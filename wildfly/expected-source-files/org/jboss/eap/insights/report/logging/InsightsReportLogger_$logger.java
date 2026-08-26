package org.jboss.eap.insights.report.logging;

import java.util.Locale;
import java.nio.file.Path;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import com.redhat.insights.jars.JarInfo;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;
import com.redhat.insights.InsightsException;
import java.lang.Exception;


import static org.jboss.logging.Logger.Level.DEBUG;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:59:22+0200")
public class InsightsReportLogger_$logger extends DelegatingBasicLogger implements InsightsReportLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = InsightsReportLogger_$logger.class.getName();
    public InsightsReportLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String failedToReadRuntimeConfiguration1$str() {
        return "WFLYINSIGHTS0001: Reading the runtime configuration failed with  %s";
    }
    @Override
    public final InsightsException failedToReadRuntimeConfiguration(final String failureDescription) {
        final InsightsException result = new InsightsException(String.format(getLoggingLocale(), failedToReadRuntimeConfiguration1$str(), failureDescription));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String failedToReadRuntimeConfiguration0$str() {
        return "WFLYINSIGHTS0002: Reading the runtime configuration failed";
    }
    @Override
    public final InsightsException failedToReadRuntimeConfiguration(final Exception cause) {
        final InsightsException result = new InsightsException(String.format(getLoggingLocale(), failedToReadRuntimeConfiguration0$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToReadModules$str() {
        return "WFLYINSIGHTS0003: Analyzing the module paths failed";
    }
    @Override
    public final InsightsException failedToReadModules(final Exception cause) {
        final InsightsException result = new InsightsException(String.format(getLoggingLocale(), failedToReadModules$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToProcessDeployments$str() {
        return "WFLYINSIGHTS0004: Error processing deployments";
    }
    @Override
    public final InsightsException failedToProcessDeployments(final Exception cause) {
        final InsightsException result = new InsightsException(String.format(getLoggingLocale(), failedToProcessDeployments$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingAuthentication$str() {
        return "WFLYINSIGHTS0005: Authentication missing from request: %s";
    }
    @Override
    public final InsightsException missingAuthentication(final String message) {
        final InsightsException result = new InsightsException(String.format(getLoggingLocale(), missingAuthentication$str(), message));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String payloadTooLarge$str() {
        return "WFLYINSIGHTS0006: Payload too large: %s";
    }
    @Override
    public final InsightsException payloadTooLarge(final String message) {
        final InsightsException result = new InsightsException(String.format(getLoggingLocale(), payloadTooLarge$str(), message));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedContentType$str() {
        return "WFLYINSIGHTS0007: Content type of payload is unsupported: %s";
    }
    @Override
    public final InsightsException unsupportedContentType(final String message) {
        final InsightsException result = new InsightsException(String.format(getLoggingLocale(), unsupportedContentType$str(), message));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serversideError$str() {
        return "WFLYINSIGHTS0008: Request failed on the server with code: %s";
    }
    @Override
    public final InsightsException serversideError(final String statusLine) {
        final InsightsException result = new InsightsException(String.format(getLoggingLocale(), serversideError$str(), statusLine));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void addingAnalyzedJar(final JarInfo info) {
        super.log.logf(FQCN, DEBUG, null, addingAnalyzedJar$str(), info);
    }
    protected String addingAnalyzedJar$str() {
        return "Adding the info for %s";
    }
    @Override
    public final void addingOverriddenJar(final JarInfo info) {
        super.log.logf(FQCN, DEBUG, null, addingOverriddenJar$str(), info);
    }
    protected String addingOverriddenJar$str() {
        return "Adding the overridden info for %s";
    }
    @Override
    public final void errorAnalyzingJar(final Path jar, final Exception cause) {
        super.log.logf(FQCN, DEBUG, cause, errorAnalyzingJar$str(), jar);
    }
    protected String errorAnalyzingJar$str() {
        return "Analyzing the jar %s failed";
    }
    @Override
    public final void endProcessingModules() {
        super.log.logf(FQCN, DEBUG, null, endProcessingModules$str());
    }
    protected String endProcessingModules$str() {
        return "Modules analysis done";
    }
    @Override
    public final void startProcessingModulePath(final Path modulePath) {
        super.log.logf(FQCN, DEBUG, null, startProcessingModulePath$str(), modulePath);
    }
    protected String startProcessingModulePath$str() {
        return "Module path %s is being processed";
    }
    @Override
    public final void startProcessingDeployment(final String deploymentName) {
        super.log.logf(FQCN, DEBUG, null, startProcessingDeployment$str(), deploymentName);
    }
    protected String startProcessingDeployment$str() {
        return "Processing deployment %s";
    }
    @Override
    public final void startProcessingDeploymentForUpdate(final String deploymentName) {
        super.log.logf(FQCN, DEBUG, null, startProcessingDeploymentForUpdate$str(), deploymentName);
    }
    protected String startProcessingDeploymentForUpdate$str() {
        return "Processing deployment %s for update";
    }
    @Override
    public final void deploymentHashFound(final String deploymentName, final String hash) {
        super.log.logf(FQCN, DEBUG, null, deploymentHashFound$str(), deploymentName, hash);
    }
    protected String deploymentHashFound$str() {
        return "The deployment %s has sha1 hash %s";
    }
    @Override
    public final void endProcessingDeployments() {
        super.log.logf(FQCN, DEBUG, null, endProcessingDeployments$str());
    }
    protected String endProcessingDeployments$str() {
        return "All deployments have been processed";
    }
    @Override
    public final void endProcessingDeploymentsForUpdate() {
        super.log.logf(FQCN, DEBUG, null, endProcessingDeploymentsForUpdate$str());
    }
    protected String endProcessingDeploymentsForUpdate$str() {
        return "All deployments have been updated";
    }
    @Override
    public final void scheduledSendFailed(final Exception cause) {
        super.log.logf(FQCN, DEBUG, cause, scheduledSendFailed$str());
    }
    protected String scheduledSendFailed$str() {
        return "Scheduled send failed";
    }
    @Override
    public final void scheduledSendUnknownException(final Exception cause) {
        super.log.logf(FQCN, DEBUG, cause, scheduledSendUnknownException$str());
    }
    protected String scheduledSendUnknownException$str() {
        return "Non-Insights failure";
    }
    @Override
    public final void endGettingConfiguration() {
        super.log.logf(FQCN, DEBUG, null, endGettingConfiguration$str());
    }
    protected String endGettingConfiguration$str() {
        return "Got server runtime configuration";
    }
    @Override
    public final void startGettingConfiguration() {
        super.log.logf(FQCN, DEBUG, null, startGettingConfiguration$str());
    }
    protected String startGettingConfiguration$str() {
        return "Getting server runtime configuration";
    }
}
