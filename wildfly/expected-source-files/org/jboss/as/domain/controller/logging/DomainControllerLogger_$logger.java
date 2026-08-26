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
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:26:30+0200")
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
    public final void warnIgnoringSocketBindingGroupInclude(final Location location) {
        super.log.logf(FQCN, WARN, null, warnIgnoringSocketBindingGroupInclude$str(), location);
    }
    protected String warnIgnoringSocketBindingGroupInclude$str() {
        return "WFLYDC0001: Ignoring 'include' child of 'socket-binding-group' %s";
    }
    @Override
    public final void interruptedAwaitingFinalResponse(final String serverName, final String hostName) {
        super.log.logf(FQCN, INFO, null, interruptedAwaitingFinalResponse2$str(), serverName, hostName);
    }
    protected String interruptedAwaitingFinalResponse2$str() {
        return "WFLYDC0003: Interrupted awaiting final response from server %s on host %s; remote process has been notified to cancel operation";
    }
    @Override
    public final void caughtExceptionAwaitingFinalResponse(final Throwable cause, final String serverName, final String hostName) {
        super.log.logf(FQCN, WARN, cause, caughtExceptionAwaitingFinalResponse2$str(), serverName, hostName);
    }
    protected String caughtExceptionAwaitingFinalResponse2$str() {
        return "WFLYDC0004: Caught exception awaiting final response from server %s on host %s";
    }
    @Override
    public final void interruptedAwaitingFinalResponse(final String hostName) {
        super.log.logf(FQCN, INFO, null, interruptedAwaitingFinalResponse1$str(), hostName);
    }
    protected String interruptedAwaitingFinalResponse1$str() {
        return "WFLYDC0005: Interrupted awaiting final response from host %s; remote process has been notified to cancel operation";
    }
    @Override
    public final void caughtExceptionAwaitingFinalResponse(final Throwable cause, final String hostName) {
        super.log.logf(FQCN, WARN, cause, caughtExceptionAwaitingFinalResponse1$str(), hostName);
    }
    protected String caughtExceptionAwaitingFinalResponse1$str() {
        return "WFLYDC0006: Caught exception awaiting final response from host %s";
    }
    @Override
    public final void caughtExceptionClosingInputStream(final Throwable cause) {
        super.log.logf(FQCN, WARN, cause, caughtExceptionClosingInputStream$str());
    }
    protected String caughtExceptionClosingInputStream$str() {
        return "WFLYDC0007: Caught exception closing input stream";
    }
    @Override
    public final void domainModelChangedOnReConnect(final Set<ServerIdentity> servers) {
        super.log.logf(FQCN, INFO, null, domainModelChangedOnReConnect$str(), servers);
    }
    protected String domainModelChangedOnReConnect$str() {
        return "WFLYDC0008: Domain model has changed on re-connect. The following servers will need to be restarted for changes to take affect: %s";
    }
    @Override
    public final void caughtExceptionWaitingForTask(final String className, final String exceptionName, final String task) {
        super.log.logf(FQCN, ERROR, null, caughtExceptionWaitingForTask$str(), className, exceptionName, task);
    }
    protected String caughtExceptionWaitingForTask$str() {
        return "WFLYDC0009: %s caught %s waiting for task %s. Cancelling task";
    }
    @Override
    public final void reportAdminOnlyMissingDeploymentContent(final String contentHash, final String deploymentName) {
        super.log.logf(FQCN, ERROR, null, reportAdminOnlyMissingDeploymentContent$str(), contentHash, deploymentName);
    }
    protected String reportAdminOnlyMissingDeploymentContent$str() {
        return "WFLYDC0011: No deployment content with hash %s is available in the deployment content repository for deployment %s. Because this Host Controller is booting in ADMIN-ONLY mode, boot will be allowed to proceed to provide administrators an opportunity to correct this problem. If this Host Controller were not in ADMIN-ONLY mode this would be a fatal boot failure.";
    }
    @Override
    public final void failedToSetServerInRestartRequireState(final String serverName) {
        super.log.logf(FQCN, WARN, null, failedToSetServerInRestartRequireState$str(), serverName);
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
    public final String adminOnlyModeCannotAcceptSlaves(final RunningMode runningMode) {
        return String.format(getLoggingLocale(), adminOnlyModeCannotAcceptSlaves$str(), runningMode);
    }
    protected String slaveAlreadyRegistered$str() {
        return "WFLYDC0015: There is already a registered host named '%s'";
    }
    @Override
    public final String slaveAlreadyRegistered(final String secondaryName) {
        return String.format(getLoggingLocale(), slaveAlreadyRegistered$str(), secondaryName);
    }
    protected String requiredChildIsMissing$str() {
        return "WFLYDC0016: %s is missing %s: %s";
    }
    @Override
    public final String requiredChildIsMissing(final String parent, final String child, final String parentSpec) {
        return String.format(getLoggingLocale(), requiredChildIsMissing$str(), parent, child, parentSpec);
    }
    protected String unrecognizedChildren$str() {
        return "WFLYDC0017: %s recognizes only %s as children: %s";
    }
    @Override
    public final String unrecognizedChildren(final String parent, final String children, final String parentSpec) {
        return String.format(getLoggingLocale(), unrecognizedChildren$str(), parent, children, parentSpec);
    }
    protected String inSeriesIsMissingGroups$str() {
        return "WFLYDC0018: in-series is missing groups: %s";
    }
    @Override
    public final String inSeriesIsMissingGroups(final String rolloutPlan) {
        return String.format(getLoggingLocale(), inSeriesIsMissingGroups$str(), rolloutPlan);
    }
    protected String serverGroupExpectsSingleChild$str() {
        return "WFLYDC0019: server-group expects one and only one child: %s";
    }
    @Override
    public final String serverGroupExpectsSingleChild(final String rolloutPlan) {
        return String.format(getLoggingLocale(), serverGroupExpectsSingleChild$str(), rolloutPlan);
    }
    protected String unexpectedInSeriesGroup$str() {
        return "WFLYDC0020: One of the groups does not define neither server-group nor concurrent-groups: %s";
    }
    @Override
    public final String unexpectedInSeriesGroup(final String rolloutPlan) {
        return String.format(getLoggingLocale(), unexpectedInSeriesGroup$str(), rolloutPlan);
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
    public final String interruptedAwaitingResultFromServer(final ServerIdentity server) {
        return String.format(getLoggingLocale(), interruptedAwaitingResultFromServer$str(), server);
    }
    protected String exceptionAwaitingResultFromServer$str() {
        return "WFLYDC0024: Exception getting result from server %s: %s";
    }
    @Override
    public final String exceptionAwaitingResultFromServer(final ServerIdentity server, final String message) {
        return String.format(getLoggingLocale(), exceptionAwaitingResultFromServer$str(), server, message);
    }
    protected String invalidRolloutPlan2$str() {
        return "WFLYDC0025: Invalid rollout plan. %s is not a valid child of node %s";
    }
    @Override
    public final String invalidRolloutPlan(final ModelNode modelNode, final String nodeName) {
        return String.format(getLoggingLocale(), invalidRolloutPlan2$str(), modelNode, nodeName);
    }
    protected String invalidRolloutPlan1$str() {
        return "WFLYDC0026: Invalid rollout plan. Plan operations affect server groups %s that are not reflected in the rollout plan";
    }
    @Override
    public final String invalidRolloutPlan(final Set<String> groups) {
        return String.format(getLoggingLocale(), invalidRolloutPlan1$str(), groups);
    }
    protected String invalidRolloutPlanGroupAlreadyExists$str() {
        return "WFLYDC0027: Invalid rollout plan. Server group %s appears more than once in the plan.";
    }
    @Override
    public final String invalidRolloutPlanGroupAlreadyExists(final String group) {
        return String.format(getLoggingLocale(), invalidRolloutPlanGroupAlreadyExists$str(), group);
    }
    protected String invalidRolloutPlanRange$str() {
        return "WFLYDC0028: Invalid rollout plan. Server group %s has a %s value of %s; must be between 0 and 100.";
    }
    @Override
    public final String invalidRolloutPlanRange(final String name, final String propertyName, final int value) {
        return String.format(getLoggingLocale(), invalidRolloutPlanRange$str(), name, propertyName, value);
    }
    protected String invalidRolloutPlanLess$str() {
        return "WFLYDC0029: Invalid rollout plan. Server group %s has a %s value of %s; cannot be less than 0.";
    }
    @Override
    public final String invalidRolloutPlanLess(final String name, final String propertyName, final int value) {
        return String.format(getLoggingLocale(), invalidRolloutPlanLess$str(), name, propertyName, value);
    }
    protected String interruptedAwaitingResultFromHost$str() {
        return "WFLYDC0030: Interrupted waiting for result from host %s";
    }
    @Override
    public final String interruptedAwaitingResultFromHost(final String name) {
        return String.format(getLoggingLocale(), interruptedAwaitingResultFromHost$str(), name);
    }
    protected String masterDomainControllerOnlyOperation$str() {
        return "WFLYDC0032: Operation %s for address %s can only be handled by the Domain Controller; this host is not the Domain Controller";
    }
    @Override
    public final String masterDomainControllerOnlyOperation(final String operation, final PathAddress address) {
        return String.format(getLoggingLocale(), masterDomainControllerOnlyOperation$str(), operation, address);
    }
    protected String invalidOperationTargetHost$str() {
        return "WFLYDC0033: Operation targets host %s but that host is not registered";
    }
    @Override
    public final OperationFailedException invalidOperationTargetHost(final String name) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidOperationTargetHost$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String caughtExceptionStoringDeploymentContent$str() {
        return "WFLYDC0034: Caught %s storing deployment content -- %s";
    }
    @Override
    public final OperationFailedException caughtExceptionStoringDeploymentContent(final String exceptionName, final Throwable exception) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), caughtExceptionStoringDeploymentContent$str(), exceptionName, exception));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedInitialPathKey$str() {
        return "WFLYDC0035: Unexpected initial path key %s";
    }
    @Override
    public final IllegalStateException unexpectedInitialPathKey(final String key) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unexpectedInitialPathKey$str(), key));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullStream$str() {
        return "WFLYDC0036: Null stream at index %d";
    }
    @Override
    public final String nullStream(final int index) {
        return String.format(getLoggingLocale(), nullStream$str(), index);
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
    public final String noDeploymentContentWithHash(final String hash) {
        return String.format(getLoggingLocale(), noDeploymentContentWithHash$str(), hash);
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
    public final String noDeploymentContentWithName(final String name) {
        return String.format(getLoggingLocale(), noDeploymentContentWithName$str(), name);
    }
    protected String cannotRemoveDeploymentInUse$str() {
        return "WFLYDC0043: Cannot remove deployment %s from the domain as it is still used by server groups %s";
    }
    @Override
    public final String cannotRemoveDeploymentInUse(final String name, final List<String> groups) {
        return String.format(getLoggingLocale(), cannotRemoveDeploymentInUse$str(), name, groups);
    }
    protected String invalidValue$str() {
        return "WFLYDC0044: Invalid '%s' value: %d, the maximum index is %d";
    }
    @Override
    public final String invalidValue(final String name, final int value, final int maxIndex) {
        return String.format(getLoggingLocale(), invalidValue$str(), name, value, maxIndex);
    }
    protected String invalidUrl$str() {
        return "WFLYDC0045: %s is not a valid URL -- %s";
    }
    @Override
    public final String invalidUrl(final String url, final String message) {
        return String.format(getLoggingLocale(), invalidUrl$str(), url, message);
    }
    protected String errorObtainingUrlStream$str() {
        return "WFLYDC0046: Error obtaining input stream from URL %s -- %s";
    }
    @Override
    public final String errorObtainingUrlStream(final String url, final String message) {
        return String.format(getLoggingLocale(), errorObtainingUrlStream$str(), url, message);
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
    public final String cannotUseSameValueForParameters(final String opName, final String param1, final String param2, final String redeployOpName, final String replaceOpName) {
        return String.format(getLoggingLocale(), cannotUseSameValueForParameters$str(), opName, param1, param2, redeployOpName, replaceOpName);
    }
    protected String deploymentAlreadyStarted$str() {
        return "WFLYDC0050: Deployment %s is already started";
    }
    @Override
    public final String deploymentAlreadyStarted(final String name) {
        return String.format(getLoggingLocale(), deploymentAlreadyStarted$str(), name);
    }
    protected String unknown$str() {
        return "WFLYDC0051: Unknown %s %s";
    }
    @Override
    public final String unknown(final String name, final String value) {
        return String.format(getLoggingLocale(), unknown$str(), name, value);
    }
    protected String unknownServerGroup$str() {
        return "WFLYDC0052: Unknown server group %s";
    }
    @Override
    public final IllegalStateException unknownServerGroup(final String serverGroup) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unknownServerGroup$str(), serverGroup));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownServer$str() {
        return "WFLYDC0053: Unknown server %s";
    }
    @Override
    public final IllegalStateException unknownServer(final ServerIdentity server) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unknownServer$str(), server));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidCode$str() {
        return "WFLYDC0054: Invalid code %d";
    }
    @Override
    public final IllegalArgumentException invalidCode(final int code) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidCode$str(), code));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String deploymentHashNotFoundInRepository$str() {
        return "WFLYDC0055: Repository does not contain any deployment with hash %s";
    }
    @Override
    public final IllegalStateException deploymentHashNotFoundInRepository(final String hash) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), deploymentHashNotFoundInRepository$str(), hash));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String expectedOnlyOneDeployment$str() {
        return "WFLYDC0056: Expected only one deployment, found %d";
    }
    @Override
    public final IllegalStateException expectedOnlyOneDeployment(final int i) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), expectedOnlyOneDeployment$str(), i));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noProfileCalled$str() {
        return "WFLYDC0057: No profile called: %s";
    }
    @Override
    public final OperationFailedException noProfileCalled(final String profile) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noProfileCalled$str(), profile));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noDeploymentContentWithHashAtBoot$str() {
        return "WFLYDC0058: No deployment content with hash %s is available in the deployment content repository for deployment '%s'. This is a fatal boot error. To correct the problem, either restart with the --admin-only switch set and use the CLI to install the missing content or remove it from the configuration, or remove the deployment from the xml configuraiton file and restart.";
    }
    @Override
    public final String noDeploymentContentWithHashAtBoot(final String contentHash, final String deploymentName) {
        return String.format(getLoggingLocale(), noDeploymentContentWithHashAtBoot$str(), contentHash, deploymentName);
    }
    protected String failedToLoadModule$str() {
        return "WFLYDC0059: Failed to load module '%s'.";
    }
    @Override
    public final OperationFailedException failedToLoadModule(final ModuleLoadException e, final String module) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), failedToLoadModule$str(), module), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidJSFSlotValue$str() {
        return "WFLYDC0060: Invalid Jakarta Server Faces slot value: '%s'. The host controller is not able to use a Jakarta Server Faces slot value different from its default. This resource will be ignored on that host";
    }
    @Override
    public final String invalidJSFSlotValue(final String slot) {
        return String.format(getLoggingLocale(), invalidJSFSlotValue$str(), slot);
    }
    protected String unknownAttributesFromSubsystemVersion$str() {
        return "WFLYDC0061: Operation '%s' fails because the attributes are not known from the subsytem '%s' model version '%s': %s";
    }
    @Override
    public final String unknownAttributesFromSubsystemVersion(final String operationName, final String subsystemName, final ModelVersion version, final Collection<String> attributes) {
        return String.format(getLoggingLocale(), unknownAttributesFromSubsystemVersion$str(), operationName, subsystemName, version, attributes);
    }
    protected String noSocketBindingGroupCalled$str() {
        return "WFLYDC0062: No socket-binding-group named: %s";
    }
    @Override
    public final OperationFailedException noSocketBindingGroupCalled(final String socketBindingGroup) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), noSocketBindingGroupCalled$str(), socketBindingGroup));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String runtimeNameMustBeUnique$str() {
        return "WFLYDC0063: There is already a deployment called %s with the same runtime name %s on server group %s";
    }
    @Override
    public final OperationFailedException runtimeNameMustBeUnique(final String existingDeployment, final String runtimeName, final String serverGroup) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), runtimeNameMustBeUnique$str(), existingDeployment, runtimeName, serverGroup));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemoveUsedServerGroup$str() {
        return "WFLYDC0064: Cannot remove server-group '%s' since it's still in use by servers %s";
    }
    @Override
    public final OperationFailedException cannotRemoveUsedServerGroup(final String group, final Set<String> servers) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotRemoveUsedServerGroup$str(), group, servers));
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
    public final String failedToSendMessage(final String cause) {
        return String.format(getLoggingLocale(), failedToSendMessage$str(), cause);
    }
    protected String failedToSendResponseHeader$str() {
        return "WFLYDC0067: Failed to send response header: %s";
    }
    @Override
    public final String failedToSendResponseHeader(final String cause) {
        return String.format(getLoggingLocale(), failedToSendResponseHeader$str(), cause);
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
    public final String registrationTaskFailed(final String cause) {
        return String.format(getLoggingLocale(), registrationTaskFailed$str(), cause);
    }
    @Override
    public final void interruptedAwaitingPreparedResponse(final String callerClass, final Set<ServerIdentity> servers) {
        super.log.logf(FQCN, INFO, null, interruptedAwaitingPreparedResponse$str(), callerClass, servers);
    }
    protected String interruptedAwaitingPreparedResponse$str() {
        return "WFLYDC0070: %s interrupted awaiting server prepared response(s) -- cancelling updates for servers %s";
    }
    @Override
    public final void interruptedAwaitingHostPreparedResponse(final Set<String> hosts) {
        super.log.logf(FQCN, INFO, null, interruptedAwaitingHostPreparedResponse$str(), hosts);
    }
    protected String interruptedAwaitingHostPreparedResponse$str() {
        return "WFLYDC0071: Interrupted awaiting host prepared response(s) -- cancelling updates for hosts %s";
    }
    protected String caughtIOExceptionUploadingContent$str() {
        return "WFLYDC0072: Caught IOException reading uploaded deployment content";
    }
    @Override
    public final OperationFailedException caughtIOExceptionUploadingContent(final IOException cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), caughtIOExceptionUploadingContent$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void undeployingDeploymentHasBeenRedeployed(final String deploymentName) {
        super.log.logf(FQCN, WARN, null, undeployingDeploymentHasBeenRedeployed$str(), deploymentName);
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
    public final OperationFailedException missingExtensions(final Set<String> missingExtensions) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), missingExtensions$str(), missingExtensions));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateProfileInclude$str() {
        return "WFLYDC0076: Duplicate included profile '%s'";
    }
    @Override
    public final XMLStreamException duplicateProfileInclude(final String name) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), duplicateProfileInclude$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateSocketBindingGroupInclude$str() {
        return "WFLYDC0077: Duplicate included socket binding group '%s'";
    }
    @Override
    public final XMLStreamException duplicateSocketBindingGroupInclude(final String s) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), duplicateSocketBindingGroupInclude$str(), s));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cloneOperationNotSupportedOnHost$str() {
        return "WFLYDC0078: The profile clone operation is not available on the host '%s'. To be able to use it in a domain containing older secondary hosts which do not support the profile clone operation, you need to either: a) Make sure that all older secondary hosts with a model version smaller than 4.0.0 ignore the cloned profile and the profile specified in the 'to-profile' parameter. b) Reload the domain controller into admin-only mode, perform the clone, then reload the domain controller into normal mode again, and check whether the secondary hosts need reloading.";
    }
    @Override
    public final String cloneOperationNotSupportedOnHost(final String hostName) {
        return String.format(getLoggingLocale(), cloneOperationNotSupportedOnHost$str(), hostName);
    }
    @Override
    public final void timedOutAwaitingHostPreparedResponses(final long timeout, final Set<String> timeoutHosts, final Set<String> allHosts) {
        super.log.logf(FQCN, INFO, null, timedOutAwaitingHostPreparedResponses$str(), timeout, timeoutHosts, allHosts);
    }
    protected String timedOutAwaitingHostPreparedResponses$str() {
        return "WFLYDC0079: Timed out after %d ms awaiting host prepared response(s) from hosts %s -- cancelling updates for hosts %s";
    }
    protected String timedOutAwaitingHostPreparedResponse$str() {
        return "WFLYDC0080: Timed out after %d ms awaiting host prepared response(s) -- remote host %s has been notified to cancel operation";
    }
    @Override
    public final String timedOutAwaitingHostPreparedResponse(final long timeout, final String host) {
        return String.format(getLoggingLocale(), timedOutAwaitingHostPreparedResponse$str(), timeout, host);
    }
    @Override
    public final void timedOutAwaitingFinalResponse(final long timeout, final String hostName) {
        super.log.logf(FQCN, INFO, null, timedOutAwaitingFinalResponse2$str(), timeout, hostName);
    }
    protected String timedOutAwaitingFinalResponse2$str() {
        return "WFLYDC0081: Timed out after %d ms awaiting final response from host %s; remote process has been notified to cancel operation";
    }
    @Override
    public final void timedOutAwaitingPreparedResponse(final String callerClass, final long timeout, final Set<ServerIdentity> servers) {
        super.log.logf(FQCN, INFO, null, timedOutAwaitingPreparedResponse$str(), callerClass, timeout, servers);
    }
    protected String timedOutAwaitingPreparedResponse$str() {
        return "WFLYDC0082: %s timed out after %d ms awaiting server prepared response(s) -- cancelling updates for servers %s";
    }
    @Override
    public final void timedOutAwaitingFinalResponse(final int patient, final String serverName, final String hostName) {
        super.log.logf(FQCN, INFO, null, timedOutAwaitingFinalResponse3$str(), patient, serverName, hostName);
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
    public final OperationFailedException serverManagementUnavailableDuringBoot(final String serverNames) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), serverManagementUnavailableDuringBoot$str(), serverNames));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
