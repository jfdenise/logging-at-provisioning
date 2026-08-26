package org.jboss.as.controller.client.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import java.io.IOException;
import org.jboss.logging.Logger;
import org.jboss.as.controller.client.helpers.domain.RollbackCancelledException;
import java.net.URI;
import java.net.URL;
import org.jboss.as.controller.client.logging.ControllerClientLogger.LeakDescription;
import org.jboss.as.controller.client.helpers.domain.DeploymentAction.Type;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.lang.Object;
import java.util.Arrays;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:26:01+0200")
public class ControllerClientLogger_$logger extends DelegatingBasicLogger implements ControllerClientLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ControllerClientLogger_$logger.class.getName();
    public ControllerClientLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String cannotAddDeploymentAction$str() {
        return "WFLYCC0001: Cannot add deployment actions after starting creation of a rollout plan";
    }
    @Override
    public final IllegalStateException cannotAddDeploymentAction() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotAddDeploymentAction$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String cannotAddDeploymentActionsAfterStart$str() {
        return "WFLYCC0002: Cannot add deployment actions after starting creation of a rollout plan";
    }
    @Override
    public final IllegalStateException cannotAddDeploymentActionsAfterStart() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotAddDeploymentActionsAfterStart$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotConvert$str() {
        return "WFLYCC0003: Cannot convert %s to %s";
    }
    @Override
    public final String cannotConvert(final String first, final String second) {
        return String.format(getLoggingLocale(), cannotConvert$str(), first, second);
    }
    protected String cannotDeriveDeploymentName$str() {
        return "WFLYCC0004: Cannot derive a deployment name from %s -- use an overloaded method variant that takes a 'name' parameter";
    }
    @Override
    public final IllegalArgumentException cannotDeriveDeploymentName(final URL url) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotDeriveDeploymentName$str(), url));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotUseDeploymentPlan$str() {
        return "WFLYCC0005: Cannot use a DeploymentPlan not created by this manager";
    }
    @Override
    public final IllegalArgumentException cannotUseDeploymentPlan() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotUseDeploymentPlan$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String domainDeploymentAlreadyExists$str() {
        return "WFLYCC0007: Deployment with name %s already present in the domain";
    }
    @Override
    public final String domainDeploymentAlreadyExists(final String name) {
        return String.format(getLoggingLocale(), domainDeploymentAlreadyExists$str(), name);
    }
    protected String failed$str() {
        return "WFLYCC0008: failed";
    }
    @Override
    public final String failed() {
        return String.format(getLoggingLocale(), failed$str());
    }
    protected String globalRollbackNotCompatible$str() {
        return "WFLYCC0009: Global rollback is not compatible with a server restart";
    }
    @Override
    public final IllegalStateException globalRollbackNotCompatible() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), globalRollbackNotCompatible$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String gracefulShutdownAlreadyConfigured$str() {
        return "WFLYCC0010: Graceful shutdown already configured with a timeout of %d ms";
    }
    @Override
    public final IllegalStateException gracefulShutdownAlreadyConfigured(final long timeout) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), gracefulShutdownAlreadyConfigured$str(), timeout));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String incompleteDeploymentReplace$str() {
        return "WFLYCC0011: Only one version of deployment with a given unique name can exist in the domain. The deployment plan specified that a new version of deployment %s replace an existing deployment with the same unique name, but did not apply the replacement to all server groups. Missing server groups were: %s";
    }
    @Override
    public final String incompleteDeploymentReplace(final String deploymentName, final String missingGroups) {
        return String.format(getLoggingLocale(), incompleteDeploymentReplace$str(), deploymentName, missingGroups);
    }
    protected String invalidActionType$str() {
        return "WFLYCC0012: Invalid action type %s";
    }
    @Override
    public final IllegalStateException invalidActionType(final Type type) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidActionType$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidPrecedingAction$str() {
        return "WFLYCC0013: Preceding action was not a %s";
    }
    @Override
    public final IllegalStateException invalidPrecedingAction(final Object type) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidPrecedingAction$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidUri$str() {
        return "WFLYCC0014: %s is not a valid URI";
    }
    @Override
    public final IllegalArgumentException invalidUri(final Throwable cause, final URL url) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidUri$str(), url), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidValue3$str() {
        return "WFLYCC0015: Illegal %s value %d -- must be greater than %d";
    }
    @Override
    public final IllegalArgumentException invalidValue(final String name, final int value, final int minValue) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidValue3$str(), name, value, minValue));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidValue4$str() {
        return "WFLYCC0016: Illegal %s value %d -- must be greater than %d and less than %d";
    }
    @Override
    public final IllegalArgumentException invalidValue(final String name, final int value, final int minValue, final int maxValue) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidValue4$str(), name, value, minValue, maxValue));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String maxDisplayUnitLength$str() {
        return "WFLYCC0017: Screen real estate is expensive; displayUnits must be 5 characters or less";
    }
    @Override
    public final RuntimeException maxDisplayUnitLength() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), maxDisplayUnitLength$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noFailureDetails$str() {
        return "WFLYCC0019: No failure details provided";
    }
    @Override
    public final String noFailureDetails() {
        return String.format(getLoggingLocale(), noFailureDetails$str());
    }
    protected String notConfigured$str() {
        return "WFLYCC0020: No %s is configured";
    }
    @Override
    public final IllegalStateException notConfigured(final String name) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), notConfigured$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String objectIsClosed$str() {
        return "WFLYCC0022: %s is closed";
    }
    @Override
    public final IllegalStateException objectIsClosed(final String name) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), objectIsClosed$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String operationOutcome$str() {
        return "WFLYCC0023: Operation outcome is %s";
    }
    @Override
    public final RuntimeException operationOutcome(final String outcome) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), operationOutcome$str(), outcome));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String operationsNotAllowed$str() {
        return "WFLYCC0024: %s operations are not allowed after content and deployment modifications";
    }
    @Override
    public final IllegalStateException operationsNotAllowed(final String name) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), operationsNotAllowed$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String rollbackCancelled$str() {
        return "WFLYCC0025: Rollback was cancelled";
    }
    @Override
    public final RollbackCancelledException rollbackCancelled() {
        final RollbackCancelledException result = new RollbackCancelledException(String.format(getLoggingLocale(), rollbackCancelled$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String rollbackRolledBack$str() {
        return "WFLYCC0026: Rollback was itself rolled back";
    }
    @Override
    public final RollbackCancelledException rollbackRolledBack() {
        final RollbackCancelledException result = new RollbackCancelledException(String.format(getLoggingLocale(), rollbackRolledBack$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String rollbackTimedOut$str() {
        return "WFLYCC0027: Rollback timed out";
    }
    @Override
    public final RollbackCancelledException rollbackTimedOut() {
        final RollbackCancelledException result = new RollbackCancelledException(String.format(getLoggingLocale(), rollbackTimedOut$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverDeploymentAlreadyExists$str() {
        return "WFLYCC0028: Deployment with name %s already present in the server";
    }
    @Override
    public final String serverDeploymentAlreadyExists(final String name) {
        return String.format(getLoggingLocale(), serverDeploymentAlreadyExists$str(), name);
    }
    protected String unknownActionType$str() {
        return "WFLYCC0029: Unknown action type %s";
    }
    @Override
    public final IllegalStateException unknownActionType(final Object type) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unknownActionType$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String controllerClientNotClosed$str() {
        return "WFLYCC0030: Allocation stack trace:";
    }
    @Override
    public final LeakDescription controllerClientNotClosed() {
        final LeakDescription result = new LeakDescription(String.format(getLoggingLocale(), controllerClientNotClosed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noFailureDescription$str() {
        return "WFLYCC0031: No failure description as the operation was successful.";
    }
    @Override
    public final IllegalArgumentException noFailureDescription() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noFailureDescription$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String operationNameNotFound$str() {
        return "WFLYCC0032: The operation name was not defined.";
    }
    @Override
    public final IllegalArgumentException operationNameNotFound() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), operationNameNotFound$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidAddressType$str() {
        return "WFLYCC0033: The address must be of type ModelType.LIST.";
    }
    @Override
    public final IllegalArgumentException invalidAddressType() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidAddressType$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void leakedControllerClient(final Throwable allocationStackTrace) {
        super.log.logf(FQCN, WARN, allocationStackTrace, leakedControllerClient$str());
    }
    protected String leakedControllerClient$str() {
        return "WFLYCC0034: Closing leaked controller client";
    }
    @Override
    public final void cannotDeleteTempFile(final String name) {
        super.log.logf(FQCN, WARN, null, cannotDeleteTempFile$str(), name);
    }
    protected String cannotDeleteTempFile$str() {
        return "WFLYCC0035: Cannot delete temp file %s, will be deleted on exit";
    }
    protected String streamWasClosed$str() {
        return "WFLYCC0036: Stream was closed";
    }
    @Override
    public final IOException streamWasClosed() {
        final IOException result = new IOException(String.format(getLoggingLocale(), streamWasClosed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParseAuthenticationConfig$str() {
        return "WFLYCC0037: Failed to parse the configuration file: %s";
    }
    @Override
    public final RuntimeException failedToParseAuthenticationConfig(final Throwable cause, final URI location) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToParseAuthenticationConfig$str(), location), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
}
