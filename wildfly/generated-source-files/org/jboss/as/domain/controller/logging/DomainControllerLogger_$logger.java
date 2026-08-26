package org.jboss.as.domain.controller.logging;

import java.util.Locale;
import org.jboss.modules.ModuleLoadException;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import java.io.IOException;
import org.jboss.logging.Logger;
import org.jboss.as.controller.RunningMode;
import org.jboss.as.domain.controller.ServerIdentity;
import javax.xml.stream.XMLStreamException;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.PathAddress;
import java.lang.Throwable;
import java.util.Collection;
import java.util.List;
import org.jboss.as.controller.ModelVersion;
import org.jboss.dmr.ModelNode;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import javax.xml.stream.Location;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:19+0200")
public class DomainControllerLogger_$logger extends DelegatingBasicLogger implements DomainControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = DomainControllerLogger_$logger.class.getName();
    public DomainControllerLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void warnIgnoringSocketBindingGroupInclude(final Location arg0) {
        super.log.logf(FQCN, WARN, null, warnIgnoringSocketBindingGroupInclude$str(), arg0);
    }
    protected String warnIgnoringSocketBindingGroupInclude$str() {
        return "WFLYDC0001: Ignoring 'include' child of 'socket-binding-group' %s";
    }
    @Override
    public final void interruptedAwaitingFinalResponse(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, interruptedAwaitingFinalResponse2$str(), arg0, arg1);
    }
    protected String interruptedAwaitingFinalResponse2$str() {
        return "WFLYDC0003: Interrupted awaiting final response from server %s on host %s; remote process has been notified to cancel operation";
    }
    @Override
    public final void caughtExceptionAwaitingFinalResponse(final Throwable arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, WARN, arg0, caughtExceptionAwaitingFinalResponse2$str(), arg1, arg2);
    }
    protected String caughtExceptionAwaitingFinalResponse2$str() {
        return "WFLYDC0004: Caught exception awaiting final response from server %s on host %s";
    }
    @Override
    public final void interruptedAwaitingFinalResponse(final String arg0) {
        super.log.logf(FQCN, INFO, null, interruptedAwaitingFinalResponse1$str(), arg0);
    }
    protected String interruptedAwaitingFinalResponse1$str() {
        return "WFLYDC0005: Interrupted awaiting final response from host %s; remote process has been notified to cancel operation";
    }
    @Override
    public final void caughtExceptionAwaitingFinalResponse(final Throwable arg0, final String arg1) {
        super.log.logf(FQCN, WARN, arg0, caughtExceptionAwaitingFinalResponse1$str(), arg1);
    }
    protected String caughtExceptionAwaitingFinalResponse1$str() {
        return "WFLYDC0006: Caught exception awaiting final response from host %s";
    }
    @Override
    public final void caughtExceptionClosingInputStream(final Throwable arg0) {
        super.log.logf(FQCN, WARN, arg0, caughtExceptionClosingInputStream$str());
    }
    protected String caughtExceptionClosingInputStream$str() {
        return "WFLYDC0007: Caught exception closing input stream";
    }
    @Override
    public final void domainModelChangedOnReConnect(final Set<ServerIdentity> arg0) {
        super.log.logf(FQCN, INFO, null, domainModelChangedOnReConnect$str(), arg0);
    }
    protected String domainModelChangedOnReConnect$str() {
        return "WFLYDC0008: Domain model has changed on re-connect. The following servers will need to be restarted for changes to take affect: %s";
    }
    @Override
    public final void caughtExceptionWaitingForTask(final String arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, ERROR, null, caughtExceptionWaitingForTask$str(), arg0, arg1, arg2);
    }
    protected String caughtExceptionWaitingForTask$str() {
        return "WFLYDC0009: %s caught %s waiting for task %s. Cancelling task";
    }
    @Override
    public final void reportAdminOnlyMissingDeploymentContent(final String arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, null, reportAdminOnlyMissingDeploymentContent$str(), arg0, arg1);
    }
    protected String reportAdminOnlyMissingDeploymentContent$str() {
        return "WFLYDC0011: No deployment content with hash %s is available in the deployment content repository for deployment %s. Because this Host Controller is booting in ADMIN-ONLY mode, boot will be allowed to proceed to provide administrators an opportunity to correct this problem. If this Host Controller were not in ADMIN-ONLY mode this would be a fatal boot failure.";
    }
    @Override
    public final void failedToSetServerInRestartRequireState(final String arg0) {
        super.log.logf(FQCN, WARN, null, failedToSetServerInRestartRequireState$str(), arg0);
    }
    protected String failedToSetServerInRestartRequireState$str() {
        return "WFLYDC0012: failed to set server (%s) into a restart required state";
    }
    protected String slaveControllerCannotAcceptOtherSlaves$str() {
        return "WFLYDC0013: Registration of remote hosts is not supported on secondary host controllers";
    }
    @Override
    public final String slaveControllerCannotAcceptOtherSlaves() {
        return String.format(getLoggingLocale(), slaveControllerCannotAcceptOtherSlaves$str());
    }
    protected String adminOnlyModeCannotAcceptSlaves$str() {
        return "WFLYDC0014: The primary host controller cannot register secondary host controllers as its current running mode is '%s'";
    }
    @Override
    public final String adminOnlyModeCannotAcceptSlaves(final RunningMode arg0) {
        return String.format(getLoggingLocale(), adminOnlyModeCannotAcceptSlaves$str(), arg0);
    }
    protected String slaveAlreadyRegistered$str() {
        return "WFLYDC0015: There is already a registered host named '%s'";
    }
    @Override
    public final String slaveAlreadyRegistered(final String arg0) {
        return String.format(getLoggingLocale(), slaveAlreadyRegistered$str(), arg0);
    }
    protected String requiredChildIsMissing$str() {
        return "WFLYDC0016: %s is missing %s: %s";
    }
    @Override
    public final String requiredChildIsMissing(final String arg0, final String arg1, final String arg2) {
        return String.format(getLoggingLocale(), requiredChildIsMissing$str(), arg0, arg1, arg2);
    }
    protected String unrecognizedChildren$str() {
        return "WFLYDC0017: %s recognizes only %s as children: %s";
    }
    @Override
    public final String unrecognizedChildren(final String arg0, final String arg1, final String arg2) {
        return String.format(getLoggingLocale(), unrecognizedChildren$str(), arg0, arg1, arg2);
    }
    protected String inSeriesIsMissingGroups$str() {
        return "WFLYDC0018: in-series is missing groups: %s";
    }
    @Override
    public final String inSeriesIsMissingGroups(final String arg0) {
        return String.format(getLoggingLocale(), inSeriesIsMissingGroups$str(), arg0);
    }
    protected String serverGroupExpectsSingleChild$str() {
        return "WFLYDC0019: server-group expects one and only one child: %s";
    }
    @Override
    public final String serverGroupExpectsSingleChild(final String arg0) {
        return String.format(getLoggingLocale(), serverGroupExpectsSingleChild$str(), arg0);
    }
    protected String unexpectedInSeriesGroup$str() {
        return "WFLYDC0020: One of the groups does not define neither server-group nor concurrent-groups: %s";
    }
    @Override
    public final String unexpectedInSeriesGroup(final String arg0) {
        return String.format(getLoggingLocale(), unexpectedInSeriesGroup$str(), arg0);
    }
    protected String unexplainedFailure$str() {
        return "WFLYDC0021: Unexplained failure";
    }
    @Override
    public final String unexplainedFailure() {
        return String.format(getLoggingLocale(), unexplainedFailure$str());
    }
    protected String operationFailedOrRolledBack$str() {
        return "WFLYDC0022: Operation failed or was rolled back on all servers.";
    }
    @Override
    public final String operationFailedOrRolledBack() {
        return String.format(getLoggingLocale(), operationFailedOrRolledBack$str());
    }
    protected String interruptedAwaitingResultFromServer$str() {
        return "WFLYDC0023: Interrupted waiting for result from server %s";
    }
    @Override
    public final String interruptedAwaitingResultFromServer(final ServerIdentity arg0) {
        return String.format(getLoggingLocale(), interruptedAwaitingResultFromServer$str(), arg0);
    }
    protected String exceptionAwaitingResultFromServer$str() {
        return "WFLYDC0024: Exception getting result from server %s: %s";
    }
    @Override
    public final String exceptionAwaitingResultFromServer(final ServerIdentity arg0, final String arg1) {
        return String.format(getLoggingLocale(), exceptionAwaitingResultFromServer$str(), arg0, arg1);
    }
    protected String invalidRolloutPlan2$str() {
        return "WFLYDC0025: Invalid rollout plan. %s is not a valid child of node %s";
    }
    @Override
    public final String invalidRolloutPlan(final ModelNode arg0, final String arg1) {
        return String.format(getLoggingLocale(), invalidRolloutPlan2$str(), arg0, arg1);
    }
    protected String invalidRolloutPlan1$str() {
        return "WFLYDC0026: Invalid rollout plan. Plan operations affect server groups %s that are not reflected in the rollout plan";
    }
    @Override
    public final String invalidRolloutPlan(final Set<String> arg0) {
        return String.format(getLoggingLocale(), invalidRolloutPlan1$str(), arg0);
    }
    protected String invalidRolloutPlanGroupAlreadyExists$str() {
        return "WFLYDC0027: Invalid rollout plan. Server group %s appears more than once in the plan.";
    }
    @Override
    public final String invalidRolloutPlanGroupAlreadyExists(final String arg0) {
        return String.format(getLoggingLocale(), invalidRolloutPlanGroupAlreadyExists$str(), arg0);
    }
    protected String invalidRolloutPlanRange$str() {
        return "WFLYDC0028: Invalid rollout plan. Server group %s has a %s value of %s; must be between 0 and 100.";
    }
    @Override
    public final String invalidRolloutPlanRange(final String arg0, final String arg1, final int arg2) {
        return String.format(getLoggingLocale(), invalidRolloutPlanRange$str(), arg0, arg1, arg2);
    }
    protected String invalidRolloutPlanLess$str() {
        return "WFLYDC0029: Invalid rollout plan. Server group %s has a %s value of %s; cannot be less than 0.";
    }
    @Override
    public final String invalidRolloutPlanLess(final String arg0, final String arg1, final int arg2) {
        return String.format(getLoggingLocale(), invalidRolloutPlanLess$str(), arg0, arg1, arg2);
    }
    protected String interruptedAwaitingResultFromHost$str() {
        return "WFLYDC0030: Interrupted waiting for result from host %s";
    }
    @Override
    public final String interruptedAwaitingResultFromHost(final String arg0) {
        return String.format(getLoggingLocale(), interruptedAwaitingResultFromHost$str(), arg0);
    }
    protected String masterDomainControllerOnlyOperation$str() {
        return "WFLYDC0032: Operation %s for address %s can only be handled by the Domain Controller; this host is not the Domain Controller";
    }
    @Override
    public final String masterDomainControllerOnlyOperation(final String arg0, final PathAddress arg1) {
        return String.format(getLoggingLocale(), masterDomainControllerOnlyOperation$str(), arg0, arg1);
    }
    protected String invalidOperationTargetHost$str() {
        return "WFLYDC0033: Operation targets host %s but that host is not registered";
    }
    @Override
    public final OperationFailedException invalidOperationTargetHost(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidOperationTargetHost$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String caughtExceptionStoringDeploymentContent$str() {
        return "WFLYDC0034: Caught %s storing deployment content -- %s";
    }
    @Override
    public final OperationFailedException caughtExceptionStoringDeploymentContent(final String arg0, final Throwable arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), caughtExceptionStoringDeploymentContent$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedInitialPathKey$str() {
        return "WFLYDC0035: Unexpected initial path key %s";
    }
    @Override
    public final IllegalStateException unexpectedInitialPathKey(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unexpectedInitialPathKey$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullStream$str() {
        return "WFLYDC0036: Null stream at index %d";
    }
    @Override
    public final String nullStream(final int arg0) {
        return String.format(getLoggingLocale(), nullStream$str(), arg0);
    }
    protected String invalidByteStream$str() {
        return "WFLYDC0037: Invalid byte stream.";
    }
    @Override
    public final String invalidByteStream() {
        return String.format(getLoggingLocale(), invalidByteStream$str());
    }
    protected String invalidUrlStream$str() {
        return "WFLYDC0038: Invalid url stream.";
    }
    @Override
    public final String invalidUrlStream() {
        return String.format(getLoggingLocale(), invalidUrlStream$str());
    }
    protected String as7431$str() {
        return "WFLYDC0039: Only 1 piece of content is currently supported (AS7-431)";
    }
    @Override
    public final String as7431() {
        return String.format(getLoggingLocale(), as7431$str());
    }
    protected String noDeploymentContentWithHash$str() {
        return "WFLYDC0040: No deployment content with hash %s is available in the deployment content repository.";
    }
    @Override
    public final String noDeploymentContentWithHash(final String arg0) {
        return String.format(getLoggingLocale(), noDeploymentContentWithHash$str(), arg0);
    }
    protected String slaveCannotAcceptUploads$str() {
        return "WFLYDC0041: A secondary Host Controller cannot accept deployment content uploads";
    }
    @Override
    public final String slaveCannotAcceptUploads() {
        return String.format(getLoggingLocale(), slaveCannotAcceptUploads$str());
    }
    protected String noDeploymentContentWithName$str() {
        return "WFLYDC0042: No deployment with name %s found";
    }
    @Override
    public final String noDeploymentContentWithName(final String arg0) {
        return String.format(getLoggingLocale(), noDeploymentContentWithName$str(), arg0);
    }
    protected String cannotRemoveDeploymentInUse$str() {
        return "WFLYDC0043: Cannot remove deployment %s from the domain as it is still used by server groups %s";
    }
    @Override
    public final String cannotRemoveDeploymentInUse(final String arg0, final List<String> arg1) {
        return String.format(getLoggingLocale(), cannotRemoveDeploymentInUse$str(), arg0, arg1);
    }
    protected String invalidValue$str() {
        return "WFLYDC0044: Invalid '%s' value: %d, the maximum index is %d";
    }
    @Override
    public final String invalidValue(final String arg0, final int arg1, final int arg2) {
        return String.format(getLoggingLocale(), invalidValue$str(), arg0, arg1, arg2);
    }
    protected String invalidUrl$str() {
        return "WFLYDC0045: %s is not a valid URL -- %s";
    }
    @Override
    public final String invalidUrl(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), invalidUrl$str(), arg0, arg1);
    }
    protected String errorObtainingUrlStream$str() {
        return "WFLYDC0046: Error obtaining input stream from URL %s -- %s";
    }
    @Override
    public final String errorObtainingUrlStream(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), errorObtainingUrlStream$str(), arg0, arg1);
    }
    protected String invalidContentDeclaration$str() {
        return "WFLYDC0047: Invalid content declaration";
    }
    @Override
    public final String invalidContentDeclaration() {
        return String.format(getLoggingLocale(), invalidContentDeclaration$str());
    }
    protected String cannotUseSameValueForParameters$str() {
        return "WFLYDC0049: Cannot use %s with the same value for parameters %s and %s. Use %s to redeploy the same content or %s to replace content with a new version with the same name.";
    }
    @Override
    public final String cannotUseSameValueForParameters(final String arg0, final String arg1, final String arg2, final String arg3, final String arg4) {
        return String.format(getLoggingLocale(), cannotUseSameValueForParameters$str(), arg0, arg1, arg2, arg3, arg4);
    }
    protected String deploymentAlreadyStarted$str() {
        return "WFLYDC0050: Deployment %s is already started";
    }
    @Override
    public final String deploymentAlreadyStarted(final String arg0) {
        return String.format(getLoggingLocale(), deploymentAlreadyStarted$str(), arg0);
    }
    protected String unknown$str() {
        return "WFLYDC0051: Unknown %s %s";
    }
    @Override
    public final String unknown(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), unknown$str(), arg0, arg1);
    }
    protected String unknownServerGroup$str() {
        return "WFLYDC0052: Unknown server group %s";
    }
    @Override
    public final IllegalStateException unknownServerGroup(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unknownServerGroup$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownServer$str() {
        return "WFLYDC0053: Unknown server %s";
    }
    @Override
    public final IllegalStateException unknownServer(final ServerIdentity arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unknownServer$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidCode$str() {
        return "WFLYDC0054: Invalid code %d";
    }
    @Override
    public final IllegalArgumentException invalidCode(final int arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidCode$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String deploymentHashNotFoundInRepository$str() {
        return "WFLYDC0055: Repository does not contain any deployment with hash %s";
    }
    @Override
    public final IllegalStateException deploymentHashNotFoundInRepository(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), deploymentHashNotFoundInRepository$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String expectedOnlyOneDeployment$str() {
        return "WFLYDC0056: Expected only one deployment, found %d";
    }
    @Override
    public final IllegalStateException expectedOnlyOneDeployment(final int arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), expectedOnlyOneDeployment$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noProfileCalled$str() {
        return "WFLYDC0057: No profile called: %s";
    }
    @Override
    public final OperationFailedException noProfileCalled(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noProfileCalled$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noDeploymentContentWithHashAtBoot$str() {
        return "WFLYDC0058: No deployment content with hash %s is available in the deployment content repository for deployment '%s'. This is a fatal boot error. To correct the problem, either restart with the --admin-only switch set and use the CLI to install the missing content or remove it from the configuration, or remove the deployment from the xml configuraiton file and restart.";
    }
    @Override
    public final String noDeploymentContentWithHashAtBoot(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), noDeploymentContentWithHashAtBoot$str(), arg0, arg1);
    }
    protected String failedToLoadModule$str() {
        return "WFLYDC0059: Failed to load module '%s'.";
    }
    @Override
    public final OperationFailedException failedToLoadModule(final ModuleLoadException arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), failedToLoadModule$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidJSFSlotValue$str() {
        return "WFLYDC0060: Invalid Jakarta Server Faces slot value: '%s'. The host controller is not able to use a Jakarta Server Faces slot value different from its default. This resource will be ignored on that host";
    }
    @Override
    public final String invalidJSFSlotValue(final String arg0) {
        return String.format(getLoggingLocale(), invalidJSFSlotValue$str(), arg0);
    }
    protected String unknownAttributesFromSubsystemVersion$str() {
        return "WFLYDC0061: Operation '%s' fails because the attributes are not known from the subsytem '%s' model version '%s': %s";
    }
    @Override
    public final String unknownAttributesFromSubsystemVersion(final String arg0, final String arg1, final ModelVersion arg2, final Collection<String> arg3) {
        return String.format(getLoggingLocale(), unknownAttributesFromSubsystemVersion$str(), arg0, arg1, arg2, arg3);
    }
    protected String noSocketBindingGroupCalled$str() {
        return "WFLYDC0062: No socket-binding-group named: %s";
    }
    @Override
    public final OperationFailedException noSocketBindingGroupCalled(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noSocketBindingGroupCalled$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String runtimeNameMustBeUnique$str() {
        return "WFLYDC0063: There is already a deployment called %s with the same runtime name %s on server group %s";
    }
    @Override
    public final OperationFailedException runtimeNameMustBeUnique(final String arg0, final String arg1, final String arg2) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), runtimeNameMustBeUnique$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemoveUsedServerGroup$str() {
        return "WFLYDC0064: Cannot remove server-group '%s' since it's still in use by servers %s";
    }
    @Override
    public final OperationFailedException cannotRemoveUsedServerGroup(final String arg0, final Set<String> arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotRemoveUsedServerGroup$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedWildcardOperation$str() {
        return "WFLYDC0065: Wildcard operations are not supported as part of composite operations";
    }
    @Override
    public final OperationFailedException unsupportedWildcardOperation() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unsupportedWildcardOperation$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToSendMessage$str() {
        return "WFLYDC0066: Failed to send message: %s";
    }
    @Override
    public final String failedToSendMessage(final String arg0) {
        return String.format(getLoggingLocale(), failedToSendMessage$str(), arg0);
    }
    protected String failedToSendResponseHeader$str() {
        return "WFLYDC0067: Failed to send response header: %s";
    }
    @Override
    public final String failedToSendResponseHeader(final String arg0) {
        return String.format(getLoggingLocale(), failedToSendResponseHeader$str(), arg0);
    }
    protected String registrationTaskGotInterrupted$str() {
        return "WFLYDC0068: Host registration task got interrupted";
    }
    @Override
    public final String registrationTaskGotInterrupted() {
        return String.format(getLoggingLocale(), registrationTaskGotInterrupted$str());
    }
    protected String registrationTaskFailed$str() {
        return "WFLYDC0069: Host registration task failed: %s";
    }
    @Override
    public final String registrationTaskFailed(final String arg0) {
        return String.format(getLoggingLocale(), registrationTaskFailed$str(), arg0);
    }
    @Override
    public final void interruptedAwaitingPreparedResponse(final String arg0, final Set<ServerIdentity> arg1) {
        super.log.logf(FQCN, INFO, null, interruptedAwaitingPreparedResponse$str(), arg0, arg1);
    }
    protected String interruptedAwaitingPreparedResponse$str() {
        return "WFLYDC0070: %s interrupted awaiting server prepared response(s) -- cancelling updates for servers %s";
    }
    @Override
    public final void interruptedAwaitingHostPreparedResponse(final Set<String> arg0) {
        super.log.logf(FQCN, INFO, null, interruptedAwaitingHostPreparedResponse$str(), arg0);
    }
    protected String interruptedAwaitingHostPreparedResponse$str() {
        return "WFLYDC0071: Interrupted awaiting host prepared response(s) -- cancelling updates for hosts %s";
    }
    protected String caughtIOExceptionUploadingContent$str() {
        return "WFLYDC0072: Caught IOException reading uploaded deployment content";
    }
    @Override
    public final OperationFailedException caughtIOExceptionUploadingContent(final IOException arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), caughtIOExceptionUploadingContent$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void undeployingDeploymentHasBeenRedeployed(final String arg0) {
        super.log.logf(FQCN, WARN, null, undeployingDeploymentHasBeenRedeployed$str(), arg0);
    }
    protected String undeployingDeploymentHasBeenRedeployed$str() {
        return "WFLYDC0073: %s deployment has been re-deployed, its content will not be removed. You will need to restart it.";
    }
    protected String operationFailedOrRolledBackWithCause$str() {
        return "WFLYDC0074: Operation failed or was rolled back on all servers. Server failures:";
    }
    @Override
    public final String operationFailedOrRolledBackWithCause() {
        return String.format(getLoggingLocale(), operationFailedOrRolledBackWithCause$str());
    }
    protected String missingExtensions$str() {
        return "WFLYDC0075: Cannot synchronize the model due to missing extensions: %s";
    }
    @Override
    public final OperationFailedException missingExtensions(final Set<String> arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), missingExtensions$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateProfileInclude$str() {
        return "WFLYDC0076: Duplicate included profile '%s'";
    }
    @Override
    public final XMLStreamException duplicateProfileInclude(final String arg0) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), duplicateProfileInclude$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateSocketBindingGroupInclude$str() {
        return "WFLYDC0077: Duplicate included socket binding group '%s'";
    }
    @Override
    public final XMLStreamException duplicateSocketBindingGroupInclude(final String arg0) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), duplicateSocketBindingGroupInclude$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cloneOperationNotSupportedOnHost$str() {
        return "WFLYDC0078: The profile clone operation is not available on the host '%s'. To be able to use it in a domain containing older secondary hosts which do not support the profile clone operation, you need to either: a) Make sure that all older secondary hosts with a model version smaller than 4.0.0 ignore the cloned profile and the profile specified in the 'to-profile' parameter. b) Reload the domain controller into admin-only mode, perform the clone, then reload the domain controller into normal mode again, and check whether the secondary hosts need reloading.";
    }
    @Override
    public final String cloneOperationNotSupportedOnHost(final String arg0) {
        return String.format(getLoggingLocale(), cloneOperationNotSupportedOnHost$str(), arg0);
    }
    @Override
    public final void timedOutAwaitingHostPreparedResponses(final long arg0, final Set<String> arg1, final Set<String> arg2) {
        super.log.logf(FQCN, INFO, null, timedOutAwaitingHostPreparedResponses$str(), arg0, arg1, arg2);
    }
    protected String timedOutAwaitingHostPreparedResponses$str() {
        return "WFLYDC0079: Timed out after %d ms awaiting host prepared response(s) from hosts %s -- cancelling updates for hosts %s";
    }
    protected String timedOutAwaitingHostPreparedResponse$str() {
        return "WFLYDC0080: Timed out after %d ms awaiting host prepared response(s) -- remote host %s has been notified to cancel operation";
    }
    @Override
    public final String timedOutAwaitingHostPreparedResponse(final long arg0, final String arg1) {
        return String.format(getLoggingLocale(), timedOutAwaitingHostPreparedResponse$str(), arg0, arg1);
    }
    @Override
    public final void timedOutAwaitingFinalResponse(final long arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, timedOutAwaitingFinalResponse2$str(), arg0, arg1);
    }
    protected String timedOutAwaitingFinalResponse2$str() {
        return "WFLYDC0081: Timed out after %d ms awaiting final response from host %s; remote process has been notified to cancel operation";
    }
    @Override
    public final void timedOutAwaitingPreparedResponse(final String arg0, final long arg1, final Set<ServerIdentity> arg2) {
        super.log.logf(FQCN, INFO, null, timedOutAwaitingPreparedResponse$str(), arg0, arg1, arg2);
    }
    protected String timedOutAwaitingPreparedResponse$str() {
        return "WFLYDC0082: %s timed out after %d ms awaiting server prepared response(s) -- cancelling updates for servers %s";
    }
    @Override
    public final void timedOutAwaitingFinalResponse(final int arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, INFO, null, timedOutAwaitingFinalResponse3$str(), arg0, arg1, arg2);
    }
    protected String timedOutAwaitingFinalResponse3$str() {
        return "WFLYDC0083: Timed out after %d ms awaiting final response from server %s on host %s; remote process has been notified to cancel operation";
    }
    protected String cannotExplodeDeploymentOfSelfContainedServer$str() {
        return "WFLYDC0084: Cannot explode a deployment in a self-contained server";
    }
    @Override
    public final OperationFailedException cannotExplodeDeploymentOfSelfContainedServer() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotExplodeDeploymentOfSelfContainedServer$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotExplodeUnmanagedDeployment$str() {
        return "WFLYDC0085: Cannot explode an unmanaged deployment";
    }
    @Override
    public final OperationFailedException cannotExplodeUnmanagedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotExplodeUnmanagedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotExplodeAlreadyExplodedDeployment$str() {
        return "WFLYDC0086: Cannot explode an already exploded deployment";
    }
    @Override
    public final OperationFailedException cannotExplodeAlreadyExplodedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotExplodeAlreadyExplodedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotExplodeEnabledDeployment$str() {
        return "WFLYDC0087: Cannot explode an already deployed deployment";
    }
    @Override
    public final OperationFailedException cannotExplodeEnabledDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotExplodeEnabledDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAddContentToSelfContainedServer$str() {
        return "WFLYDC0088: Cannot add content to a deployment in a self-contained server";
    }
    @Override
    public final OperationFailedException cannotAddContentToSelfContainedServer() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotAddContentToSelfContainedServer$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAddContentToUnmanagedDeployment$str() {
        return "WFLYDC0089: Cannot add content to an unmanaged deployment";
    }
    @Override
    public final OperationFailedException cannotAddContentToUnmanagedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotAddContentToUnmanagedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAddContentToUnexplodedDeployment$str() {
        return "WFLYDC0090: Cannot add content to an unexploded deployment";
    }
    @Override
    public final OperationFailedException cannotAddContentToUnexplodedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotAddContentToUnexplodedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemoveContentFromSelfContainedServer$str() {
        return "WFLYDC0091: Cannot remove content from a deployment in a self-contained server";
    }
    @Override
    public final OperationFailedException cannotRemoveContentFromSelfContainedServer() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotRemoveContentFromSelfContainedServer$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemoveContentFromUnmanagedDeployment$str() {
        return "WFLYDC0092: Cannot remove content from an unmanaged deployment";
    }
    @Override
    public final OperationFailedException cannotRemoveContentFromUnmanagedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotRemoveContentFromUnmanagedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemoveContentFromUnexplodedDeployment$str() {
        return "WFLYDC0093: Cannot remove content from an unexploded deployment";
    }
    @Override
    public final OperationFailedException cannotRemoveContentFromUnexplodedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotRemoveContentFromUnexplodedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotReadContentFromSelfContainedServer$str() {
        return "WFLYDC0094: Cannot read content from a deployment in a self-contained server";
    }
    @Override
    public final OperationFailedException cannotReadContentFromSelfContainedServer() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotReadContentFromSelfContainedServer$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotReadContentFromUnmanagedDeployment$str() {
        return "WFLYDC0095: Cannot read content from an unmanaged deployment";
    }
    @Override
    public final OperationFailedException cannotReadContentFromUnmanagedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotReadContentFromUnmanagedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotReadContentFromUnexplodedDeployment$str() {
        return "WFLYDC0096: Cannot read content from an unexploded deployment";
    }
    @Override
    public final OperationFailedException cannotReadContentFromUnexplodedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotReadContentFromUnexplodedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotExplodeSubDeploymentOfUnexplodedDeployment$str() {
        return "WFLYDC0097: Cannot explode a subdeployment of an unexploded deployment";
    }
    @Override
    public final OperationFailedException cannotExplodeSubDeploymentOfUnexplodedDeployment() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotExplodeSubDeploymentOfUnexplodedDeployment$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverManagementUnavailableDuringBoot$str() {
        return "WFLYDC0098: The following servers %s are starting; execution of remote management operations is not currently available";
    }
    @Override
    public final OperationFailedException serverManagementUnavailableDuringBoot(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), serverManagementUnavailableDuringBoot$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
