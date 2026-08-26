package org.jboss.as.ejb3.logging;

import java.util.Locale;
import jakarta.ejb.NoSuchEJBException;
import java.io.Serializable;
import java.lang.String;
import jakarta.transaction.RollbackException;
import jakarta.ejb.LockType;
import org.jboss.as.ejb3.component.EJBComponentDescription;
import jakarta.ejb.EJBAccessException;
import org.jboss.as.controller.PathElement;
import jakarta.ejb.NoMoreTimeoutsException;
import org.jboss.invocation.InterceptorContext;
import org.jboss.as.ee.component.ComponentInstance;
import java.util.concurrent.TimeUnit;
import jakarta.resource.ResourceException;
import org.jboss.as.ejb3.tx.TimerTransactionRolledBackException;
import jakarta.ejb.EJBTransactionRolledbackException;
import org.jboss.ejb.client.EJBLocator;
import java.lang.IllegalArgumentException;
import java.util.concurrent.TimeoutException;
import org.jboss.jandex.AnnotationTarget;
import org.jboss.as.ejb3.component.EJBComponentUnavailableException;
import java.io.InvalidClassException;
import java.lang.reflect.Method;
import jakarta.transaction.Transaction;
import jakarta.ejb.RemoveException;
import java.util.concurrent.CancellationException;
import org.jboss.msc.service.ServiceName;
import org.jboss.as.ee.component.ResourceInjectionTarget;
import org.jboss.msc.service.ServiceController.State;
import java.lang.Throwable;
import org.jboss.as.ee.component.ComponentCreateServiceFactory;
import java.lang.Object;
import java.lang.Class;
import org.jboss.as.ejb3.component.singleton.SingletonComponent;
import java.util.Arrays;
import jakarta.ejb.EJBException;
import jakarta.ejb.ConcurrentAccessTimeoutException;
import org.jboss.dmr.ModelNode;
import jakarta.transaction.NotSupportedException;
import java.io.File;
import jakarta.ejb.EJBTransactionRequiredException;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import java.lang.IllegalStateException;
import jakarta.ejb.IllegalLoopbackException;
import java.util.Set;
import java.lang.StringBuilder;
import java.sql.SQLException;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.as.ejb3.component.stateful.StatefulSessionComponentInstance;
import jakarta.resource.spi.UnavailableException;
import org.jboss.jca.core.spi.rar.NotFoundException;
import org.jboss.logging.Logger;
import org.jboss.as.naming.context.NamespaceContextSelector;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import org.jboss.as.ejb3.subsystem.deployment.EJBComponentType;
import org.jboss.as.ee.component.Component;
import jakarta.interceptor.InvocationContext;
import javax.naming.Context;
import jakarta.resource.spi.endpoint.MessageEndpoint;
import javax.annotation.processing.Generated;
import org.jboss.as.controller.OperationFailedException;
import java.lang.Error;
import java.lang.SecurityException;
import java.io.IOException;
import org.jboss.metadata.ejb.spec.MethodParametersMetaData;
import org.jboss.invocation.proxy.MethodIdentifier;
import java.util.Date;
import java.lang.Exception;
import java.lang.Integer;
import jakarta.ejb.NoSuchObjectLocalException;
import jakarta.ejb.Timer;
import org.jboss.as.ejb3.subsystem.deployment.InstalledComponent;
import javax.xml.stream.XMLStreamException;
import org.jboss.as.controller.PathAddress;
import org.jboss.jandex.MethodInfo;
import org.jboss.as.ejb3.timerservice.TimerImpl;
import java.rmi.RemoteException;
import org.jboss.as.server.deployment.DeploymentUnit;
import jakarta.ejb.TransactionAttributeType;
import org.jboss.jandex.ClassInfo;
import javax.xml.stream.Location;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:16+0200")
public class EjbLogger_$logger extends DelegatingBasicLogger implements EjbLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = EjbLogger_$logger.class.getName();
    public EjbLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void getTxManagerStatusFailed(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, getTxManagerStatusFailed$str());
    }
    protected String getTxManagerStatusFailed$str() {
        return "WFLYEJB0004: failed to get tx manager status; ignoring";
    }
    @Override
    public final void setRollbackOnlyFailed(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, setRollbackOnlyFailed$str());
    }
    protected String setRollbackOnlyFailed$str() {
        return "WFLYEJB0005: failed to set rollback only; ignoring";
    }
    @Override
    public final void activationConfigPropertyIgnored(final Object arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, activationConfigPropertyIgnored$str(), arg0, arg1);
    }
    protected String activationConfigPropertyIgnored$str() {
        return "WFLYEJB0006: ActivationConfigProperty %s will be ignored since it is not allowed by resource adapter: %s";
    }
    @Override
    public final void discardingStatefulComponent(final StatefulSessionComponentInstance arg0, final Throwable arg1) {
        super.log.logf(FQCN, ERROR, arg1, discardingStatefulComponent$str(), arg0);
    }
    protected String discardingStatefulComponent$str() {
        return "WFLYEJB0007: Discarding stateful component instance: %s due to exception";
    }
    @Override
    public final void defaultInterceptorClassNotListed(final String arg0) {
        super.log.logf(FQCN, WARN, null, defaultInterceptorClassNotListed$str(), arg0);
    }
    protected String defaultInterceptorClassNotListed$str() {
        return "WFLYEJB0010: Default interceptor class %s is not listed in the <interceptors> section of ejb-jar.xml and will not be applied";
    }
    @Override
    public final void unknownTimezoneId(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, unknownTimezoneId$str(), arg0, arg1);
    }
    protected String unknownTimezoneId$str() {
        return "WFLYEJB0015: Unknown timezone id: %s found in schedule expression. Ignoring it and using server's timezone: %s";
    }
    @Override
    public final void timerPersistenceNotEnable() {
        super.log.logf(FQCN, WARN, null, timerPersistenceNotEnable$str());
    }
    protected String timerPersistenceNotEnable$str() {
        return "WFLYEJB0016: Timer persistence is not enabled, persistent timers will not survive JVM restarts";
    }
    @Override
    public final void nextExpirationIsNull(final TimerImpl arg0) {
        super.log.logf(FQCN, INFO, null, nextExpirationIsNull$str(), arg0);
    }
    protected String nextExpirationIsNull$str() {
        return "WFLYEJB0017: Next expiration is null. No tasks will be scheduled for timer %S";
    }
    @Override
    public final void ignoringException(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, ignoringException$str());
    }
    protected String ignoringException$str() {
        return "WFLYEJB0018: Ignoring exception during setRollbackOnly";
    }
    @Override
    public final void errorInvokeTimeout(final Timer arg0, final Throwable arg1) {
        super.log.logf(FQCN, ERROR, arg1, errorInvokeTimeout$str(), arg0);
    }
    protected String errorInvokeTimeout$str() {
        return "WFLYEJB0020: Error invoking timeout for timer: %s";
    }
    @Override
    public final void timerRetried(final Timer arg0) {
        super.log.logf(FQCN, INFO, null, timerRetried$str(), arg0);
    }
    protected String timerRetried$str() {
        return "WFLYEJB0021: Timer: %s will be retried";
    }
    @Override
    public final void errorDuringRetryTimeout(final Timer arg0, final Throwable arg1) {
        super.log.logf(FQCN, ERROR, arg1, errorDuringRetryTimeout$str(), arg0);
    }
    protected String errorDuringRetryTimeout$str() {
        return "WFLYEJB0022: Error during retrying timeout for timer: %s";
    }
    @Override
    public final void retryingTimeout(final Timer arg0) {
        super.log.logf(FQCN, INFO, null, retryingTimeout$str(), arg0);
    }
    protected String retryingTimeout$str() {
        return "WFLYEJB0023: Retrying timeout for timer: %s";
    }
    @Override
    public final void timerNotActive(final Timer arg0) {
        super.log.logf(FQCN, INFO, null, timerNotActive$str(), arg0);
    }
    protected String timerNotActive$str() {
        return "WFLYEJB0024: Timer is not active, skipping retry of timer: %s";
    }
    @Override
    public final void failToReadTimerInformation(final String arg0, final Throwable arg1) {
        super.log.logf(FQCN, WARN, arg1, failToReadTimerInformation$str(), arg0);
    }
    protected String failToReadTimerInformation$str() {
        return "WFLYEJB0026: Could not read timer information for Jakarta Enterprise Beans component %s";
    }
    @Override
    public final void failToRestoreTimers(final File arg0) {
        super.log.logf(FQCN, ERROR, null, failToRestoreTimers$str(), arg0);
    }
    protected String failToRestoreTimers$str() {
        return "WFLYEJB0028: %s is not a directory, could not restore timers";
    }
    @Override
    public final void failToRestoreTimersFromFile(final File arg0, final Throwable arg1) {
        super.log.logf(FQCN, ERROR, arg1, failToRestoreTimersFromFile$str(), arg0);
    }
    protected String failToRestoreTimersFromFile$str() {
        return "WFLYEJB0029: Could not restore timer from %s";
    }
    @Override
    public final void failToCloseFile(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, failToCloseFile$str());
    }
    protected String failToCloseFile$str() {
        return "WFLYEJB0030: error closing file ";
    }
    @Override
    public final void failToRestoreTimersForObjectId(final String arg0, final Throwable arg1) {
        super.log.logf(FQCN, ERROR, arg1, failToRestoreTimersForObjectId$str(), arg0);
    }
    protected String failToRestoreTimersForObjectId$str() {
        return "WFLYEJB0031: Could not restore timers for %s";
    }
    @Override
    public final void failToCreateDirectoryForPersistTimers(final File arg0) {
        super.log.logf(FQCN, ERROR, null, failToCreateDirectoryForPersistTimers$str(), arg0);
    }
    protected String failToCreateDirectoryForPersistTimers$str() {
        return "WFLYEJB0032: Could not create directory %s to persist Jakarta Enterprise Beans timers.";
    }
    @Override
    public final void invocationFailed(final String arg0, final Method arg1, final Throwable arg2) {
        super.log.logf(FQCN, ERROR, arg2, invocationFailed2$str(), arg0, arg1);
    }
    protected String invocationFailed2$str() {
        return "WFLYEJB0034: Jakarta Enterprise Beans Invocation failed on component %s for method %s";
    }
    @Override
    public final void couldNotFindEjbForLocatorIIOP(final EJBLocator<?> arg0) {
        super.log.logf(FQCN, WARN, null, couldNotFindEjbForLocatorIIOP$str(), arg0);
    }
    protected String couldNotFindEjbForLocatorIIOP$str() {
        return "WFLYEJB0035: Could not find Jakarta Enterprise Beans bean for locator %s, Jakarta Enterprise Beans client proxy will not be replaced";
    }
    @Override
    public final void ejbNotExposedOverIIOP(final EJBLocator<?> arg0) {
        super.log.logf(FQCN, WARN, null, ejbNotExposedOverIIOP$str(), arg0);
    }
    protected String ejbNotExposedOverIIOP$str() {
        return "WFLYEJB0036: Jakarta Enterprise Beans bean %s is not being replaced with a Stub as it is not exposed over IIOP";
    }
    @Override
    public final void dynamicStubCreationFailed(final String arg0, final Throwable arg1) {
        super.log.logf(FQCN, ERROR, arg1, dynamicStubCreationFailed$str(), arg0);
    }
    protected String dynamicStubCreationFailed$str() {
        return "WFLYEJB0037: Dynamic stub creation failed for class %s";
    }
    @Override
    public final void logMDBStart(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, logMDBStart$str(), arg0, arg1);
    }
    protected String logMDBStart$str() {
        return "WFLYEJB0042: Started message driven bean '%s' with '%s' resource adapter";
    }
    @Override
    public final void skipOverlappingInvokeTimeout(final Timer arg0, final Date arg1) {
        super.log.logf(FQCN, WARN, null, skipOverlappingInvokeTimeout$str(), arg0, arg1);
    }
    protected String skipOverlappingInvokeTimeout$str() {
        return "WFLYEJB0043: A previous execution of timer %s is still in progress, skipping this overlapping scheduled execution at: %s.";
    }
    protected String resourceAdapterRepositoryUnAvailable$str() {
        return "WFLYEJB0044: Resource adapter repository is not available";
    }
    @Override
    public final IllegalStateException resourceAdapterRepositoryUnAvailable() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), resourceAdapterRepositoryUnAvailable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String noSuchEndpointException$str() {
        return "WFLYEJB0045: Could not find an Endpoint for resource adapter %s";
    }
    @Override
    public final IllegalArgumentException noSuchEndpointException(final String arg0, final NotFoundException arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noSuchEndpointException$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String endpointUnAvailable$str() {
        return "WFLYEJB0046: Endpoint is not available for message driven component %s";
    }
    @Override
    public final IllegalStateException endpointUnAvailable(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), endpointUnAvailable$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failureDuringEndpointDeactivation$str() {
        return "WFLYEJB0047: Could not deactivate endpoint for message driven component %s";
    }
    @Override
    public final RuntimeException failureDuringEndpointDeactivation(final String arg0, final ResourceException arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failureDuringEndpointDeactivation$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failureDuringLoadOfClusterNodeSelector$str() {
        return "WFLYEJB0049: Could not create an instance of cluster node selector %s for cluster %s";
    }
    @Override
    public final RuntimeException failureDuringLoadOfClusterNodeSelector(final String arg0, final String arg1, final Exception arg2) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failureDuringLoadOfClusterNodeSelector$str(), arg0, arg1), arg2);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToCreateOptionForProperty(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, failedToCreateOptionForProperty$str(), arg0, arg1);
    }
    protected String failedToCreateOptionForProperty$str() {
        return "WFLYEJB0050: Failed to parse property %s due to %s";
    }
    protected String viewNotFound$str() {
        return "WFLYEJB0051: Could not find view %s for Jakarta Enterprise Beans %s";
    }
    @Override
    public final IllegalStateException viewNotFound(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), viewNotFound$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String asyncInvocationOnlyApplicableForSessionBeans$str() {
        return "WFLYEJB0052: Cannot perform asynchronous local invocation for component that is not a session bean";
    }
    @Override
    public final RuntimeException asyncInvocationOnlyApplicableForSessionBeans() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), asyncInvocationOnlyApplicableForSessionBeans$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notStatefulSessionBean$str() {
        return "WFLYEJB0053: %s is not a Stateful Session bean in app: %s module: %s distinct-name: %s";
    }
    @Override
    public final IllegalArgumentException notStatefulSessionBean(final String arg0, final String arg1, final String arg2, final String arg3) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notStatefulSessionBean$str(), arg0, arg1, arg2, arg3));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToMarshalEjbParameters$str() {
        return "WFLYEJB0054: Failed to marshal Jakarta Enterprise Beans parameters";
    }
    @Override
    public final RuntimeException failedToMarshalEjbParameters(final Exception arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToMarshalEjbParameters$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownDeployment$str() {
        return "WFLYEJB0055: No matching deployment for Jakarta Enterprise Beans: %s";
    }
    @Override
    public final NoSuchEJBException unknownDeployment(final EJBLocator<?> arg0) {
        final NoSuchEJBException result = new NoSuchEJBException(String.format(getLoggingLocale(), unknownDeployment$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ejbNotFoundInDeployment$str() {
        return "WFLYEJB0056: Could not find Jakarta Enterprise Beans in matching deployment: %s";
    }
    @Override
    public final NoSuchEJBException ejbNotFoundInDeployment(final EJBLocator<?> arg0) {
        final NoSuchEJBException result = new NoSuchEJBException(String.format(getLoggingLocale(), ejbNotFoundInDeployment$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String annotationApplicableOnlyForMethods$str() {
        return "WFLYEJB0057: %s annotation is only valid on method targets";
    }
    @Override
    public final IllegalArgumentException annotationApplicableOnlyForMethods(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), annotationApplicableOnlyForMethods$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String aroundTimeoutMethodExpectedWithInvocationContextParam$str() {
        return "WFLYEJB0058: Method %s, on class %s, annotated with @jakarta.interceptor.AroundTimeout is expected to accept a single param of type jakarta.interceptor.InvocationContext";
    }
    @Override
    public final IllegalArgumentException aroundTimeoutMethodExpectedWithInvocationContextParam(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), aroundTimeoutMethodExpectedWithInvocationContextParam$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String aroundTimeoutMethodMustReturnObjectType$str() {
        return "WFLYEJB0059: Method %s, on class %s, annotated with @jakarta.interceptor.AroundTimeout must return Object type";
    }
    @Override
    public final IllegalArgumentException aroundTimeoutMethodMustReturnObjectType(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), aroundTimeoutMethodMustReturnObjectType$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String wrongTxOnThread$str() {
        return "WFLYEJB0060: Wrong tx on thread: expected %s, actual %s";
    }
    @Override
    public final IllegalStateException wrongTxOnThread(final Transaction arg0, final Transaction arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), wrongTxOnThread$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownTxAttributeOnInvocation$str() {
        return "WFLYEJB0061: Unknown transaction attribute %s on invocation %s";
    }
    @Override
    public final IllegalStateException unknownTxAttributeOnInvocation(final TransactionAttributeType arg0, final InterceptorContext arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unknownTxAttributeOnInvocation$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String txRequiredForInvocation$str() {
        return "WFLYEJB0062: Transaction is required for invocation %s";
    }
    @Override
    public final EJBTransactionRequiredException txRequiredForInvocation(final InterceptorContext arg0) {
        final EJBTransactionRequiredException result = new EJBTransactionRequiredException(String.format(getLoggingLocale(), txRequiredForInvocation$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String txPresentForNeverTxAttribute$str() {
        return "WFLYEJB0063: Transaction present on server in Never call (Enterprise Beans 3 13.6.2.6)";
    }
    @Override
    public final EJBException txPresentForNeverTxAttribute() {
        final EJBException result = new EJBException(String.format(getLoggingLocale(), txPresentForNeverTxAttribute$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToSetRollbackOnly(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, failedToSetRollbackOnly$str());
    }
    protected String failedToSetRollbackOnly$str() {
        return "WFLYEJB0064: Failed to set transaction for rollback only";
    }
    protected String viewInterfaceCannotBeNull$str() {
        return "WFLYEJB0065: View interface cannot be null";
    }
    @Override
    public final IllegalArgumentException viewInterfaceCannotBeNull() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), viewInterfaceCannotBeNull$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLoadViewClassForComponent$str() {
        return "WFLYEJB0068: Could not load view class for component %s";
    }
    @Override
    public final RuntimeException failedToLoadViewClassForComponent(final Exception arg0, final String arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToLoadViewClassForComponent$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalCallToEjbHomeRemove$str() {
        return "WFLYEJB0073: Illegal call to EJBHome.remove(Object) on a session bean";
    }
    @Override
    public final RemoveException illegalCallToEjbHomeRemove() {
        final RemoveException result = new RemoveException(String.format(getLoggingLocale(), illegalCallToEjbHomeRemove$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String setRollbackOnlyNotAllowedForSupportsTxAttr$str() {
        return "WFLYEJB0074: Enterprise Beans 3.1 FR 13.6.2.8 setRollbackOnly is not allowed with SUPPORTS transaction attribute";
    }
    @Override
    public final IllegalStateException setRollbackOnlyNotAllowedForSupportsTxAttr() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), setRollbackOnlyNotAllowedForSupportsTxAttr$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCallGetPKOnSessionBean$str() {
        return "WFLYEJB0075: Cannot call getPrimaryKey on a session bean";
    }
    @Override
    public final EJBException cannotCallGetPKOnSessionBean() {
        final EJBException result = new EJBException(String.format(getLoggingLocale(), cannotCallGetPKOnSessionBean$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ejb2xViewNotApplicableForSingletonBeans$str() {
        return "WFLYEJB0076: Singleton beans cannot have Enterprise Beans 2.x views";
    }
    @Override
    public final RuntimeException ejb2xViewNotApplicableForSingletonBeans() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), ejb2xViewNotApplicableForSingletonBeans$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ejbLocalObjectUnavailable$str() {
        return "WFLYEJB0078: Bean %s does not have an EJBLocalObject";
    }
    @Override
    public final IllegalStateException ejbLocalObjectUnavailable(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), ejbLocalObjectUnavailable$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotBeApplicationExceptionBecauseNotAnExceptionType$str() {
        return "WFLYEJB0079: [Enterprise Beans 3.1 spec, section 14.1.1] Class: %s cannot be marked as an application exception because it is not of type java.lang.Exception";
    }
    @Override
    public final IllegalArgumentException cannotBeApplicationExceptionBecauseNotAnExceptionType(final Class<?> arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotBeApplicationExceptionBecauseNotAnExceptionType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String rmiRemoteExceptionCannotBeApplicationException$str() {
        return "WFLYEJB0080: [Enterprise Beans 3.1 spec, section 14.1.1] Exception class: %s cannot be marked as an application exception because it is of type java.rmi.RemoteException";
    }
    @Override
    public final IllegalArgumentException rmiRemoteExceptionCannotBeApplicationException(final Class<?> arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), rmiRemoteExceptionCannotBeApplicationException$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String annotationOnlyAllowedOnClass$str() {
        return "WFLYEJB0081: %s annotation is allowed only on classes. %s is not a class";
    }
    @Override
    public final RuntimeException annotationOnlyAllowedOnClass(final String arg0, final AnnotationTarget arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), annotationOnlyAllowedOnClass$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String beanWithRemoteAnnotationImplementsMoreThanOneInterface$str() {
        return "WFLYEJB0082: Bean %s specifies @Remote annotation, but does not implement 1 interface";
    }
    @Override
    public final DeploymentUnitProcessingException beanWithRemoteAnnotationImplementsMoreThanOneInterface(final Class<?> arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), beanWithRemoteAnnotationImplementsMoreThanOneInterface$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String beanWithLocalAnnotationImplementsMoreThanOneInterface$str() {
        return "WFLYEJB0083: Bean %s specifies @Local annotation, but does not implement 1 interface";
    }
    @Override
    public final DeploymentUnitProcessingException beanWithLocalAnnotationImplementsMoreThanOneInterface(final Class<?> arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), beanWithLocalAnnotationImplementsMoreThanOneInterface$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToAnalyzeRemoteInterface$str() {
        return "WFLYEJB0084: Could not analyze remote interface for %s";
    }
    @Override
    public final RuntimeException failedToAnalyzeRemoteInterface(final Exception arg0, final String arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToAnalyzeRemoteInterface$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParse$str() {
        return "WFLYEJB0085: Exception while parsing %s";
    }
    @Override
    public final DeploymentUnitProcessingException failedToParse(final Exception arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToParse$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToInstallManagementResource$str() {
        return "WFLYEJB0086: Failed to install management resources for %s";
    }
    @Override
    public final DeploymentUnitProcessingException failedToInstallManagementResource(final Exception arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToInstallManagementResource$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLoadViewClass$str() {
        return "WFLYEJB0087: Could not load view %s";
    }
    @Override
    public final RuntimeException failedToLoadViewClass(final Exception arg0, final String arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToLoadViewClass$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotDetermineEjbRefForInjectionTarget$str() {
        return "WFLYEJB0088: Could not determine type of ejb-ref %s for injection target %s";
    }
    @Override
    public final DeploymentUnitProcessingException couldNotDetermineEjbRefForInjectionTarget(final String arg0, final ResourceInjectionTarget arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), couldNotDetermineEjbRefForInjectionTarget$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotDetermineEjbLocalRefForInjectionTarget$str() {
        return "WFLYEJB0089: Could not determine type of ejb-local-ref %s for injection target %s";
    }
    @Override
    public final DeploymentUnitProcessingException couldNotDetermineEjbLocalRefForInjectionTarget(final String arg0, final ResourceInjectionTarget arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), couldNotDetermineEjbLocalRefForInjectionTarget$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String onlySetterMethodsAllowedToHaveEJBAnnotation$str() {
        return "WFLYEJB0090: @EJB injection target %s is invalid. Only setter methods are allowed";
    }
    @Override
    public final IllegalArgumentException onlySetterMethodsAllowedToHaveEJBAnnotation(final MethodInfo arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), onlySetterMethodsAllowedToHaveEJBAnnotation$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nameAttributeRequiredForEJBAnnotationOnClass$str() {
        return "WFLYEJB0091: @EJB attribute 'name' is required for class level annotations. Class: %s";
    }
    @Override
    public final DeploymentUnitProcessingException nameAttributeRequiredForEJBAnnotationOnClass(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), nameAttributeRequiredForEJBAnnotationOnClass$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String beanInterfaceAttributeRequiredForEJBAnnotationOnClass$str() {
        return "WFLYEJB0092: @EJB attribute 'beanInterface' is required for class level annotations. Class: %s";
    }
    @Override
    public final DeploymentUnitProcessingException beanInterfaceAttributeRequiredForEJBAnnotationOnClass(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), beanInterfaceAttributeRequiredForEJBAnnotationOnClass$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String moduleNotAttachedToDeploymentUnit$str() {
        return "WFLYEJB0093: Module hasn't been attached to deployment unit %s";
    }
    @Override
    public final IllegalStateException moduleNotAttachedToDeploymentUnit(final DeploymentUnit arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), moduleNotAttachedToDeploymentUnit$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mdbDoesNotImplementNorSpecifyMessageListener$str() {
        return "WFLYEJB0094: Enterprise Beans 3.1 FR 5.4.2 MessageDrivenBean %s does not implement 1 interface nor specifies message listener interface";
    }
    @Override
    public final DeploymentUnitProcessingException mdbDoesNotImplementNorSpecifyMessageListener(final ClassInfo arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), mdbDoesNotImplementNorSpecifyMessageListener$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownSessionBeanType$str() {
        return "WFLYEJB0095: Unknown session bean type %s";
    }
    @Override
    public final IllegalArgumentException unknownSessionBeanType(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownSessionBeanType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String moreThanOneMethodWithSameNameOnComponent$str() {
        return "WFLYEJB0096: More than one method found with name %s on %s";
    }
    @Override
    public final DeploymentUnitProcessingException moreThanOneMethodWithSameNameOnComponent(final String arg0, final Class<?> arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), moreThanOneMethodWithSameNameOnComponent$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownEJBLocatorType$str() {
        return "WFLYEJB0097: Unknown Jakarta Enterprise Beans locator type %s";
    }
    @Override
    public final RuntimeException unknownEJBLocatorType(final EJBLocator<?> arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unknownEJBLocatorType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateCorbaObject$str() {
        return "WFLYEJB0098: Could not create CORBA object for %s";
    }
    @Override
    public final RuntimeException couldNotCreateCorbaObject(final Exception arg0, final EJBLocator<?> arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotCreateCorbaObject$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String incorrectEJBLocatorForBean$str() {
        return "WFLYEJB0099: Provided locator %s was not for Jakarta Enterprise Beans %s";
    }
    @Override
    public final IllegalArgumentException incorrectEJBLocatorForBean(final EJBLocator<?> arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), incorrectEJBLocatorForBean$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLookupORB$str() {
        return "WFLYEJB0100: Failed to lookup java:comp/ORB";
    }
    @Override
    public final IOException failedToLookupORB() {
        final IOException result = new IOException(String.format(getLoggingLocale(), failedToLookupORB$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notAnObjectImpl$str() {
        return "WFLYEJB0101: %s is not an ObjectImpl";
    }
    @Override
    public final IOException notAnObjectImpl(final Class<?> arg0) {
        final IOException result = new IOException(String.format(getLoggingLocale(), notAnObjectImpl$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String messageEndpointAlreadyReleased$str() {
        return "WFLYEJB0102: Message endpoint %s has already been released";
    }
    @Override
    public final UnavailableException messageEndpointAlreadyReleased(final MessageEndpoint arg0) {
        final UnavailableException result = new UnavailableException(String.format(getLoggingLocale(), messageEndpointAlreadyReleased$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String timerInvocationFailedDueToInvokerNotBeingStarted$str() {
        return "WFLYEJB0107: Timer invocation failed, invoker is not started";
    }
    @Override
    public final IllegalStateException timerInvocationFailedDueToInvokerNotBeingStarted() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), timerInvocationFailedDueToInvokerNotBeingStarted$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidValueForSecondInScheduleExpression$str() {
        return "WFLYEJB0109: Invalid value for second: %s";
    }
    @Override
    public final IllegalArgumentException invalidValueForSecondInScheduleExpression(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidValueForSecondInScheduleExpression$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String timerInvocationRolledBack$str() {
        return "WFLYEJB0110: Timer invocation failed, transaction rolled back";
    }
    @Override
    public final TimerTransactionRolledBackException timerInvocationRolledBack() {
        final TimerTransactionRolledBackException result = new TimerTransactionRolledBackException(String.format(getLoggingLocale(), timerInvocationRolledBack$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void noJNDIBindingsForSessionBean(final String arg0) {
        super.log.logf(FQCN, INFO, null, noJNDIBindingsForSessionBean$str(), arg0);
    }
    protected String noJNDIBindingsForSessionBean$str() {
        return "WFLYEJB0111: No jndi bindings will be created for Jakarta Enterprise Beans %s since no views are exposed";
    }
    @Override
    public final void sessionBeanClassCannotBeAnInterface(final String arg0) {
        super.log.logf(FQCN, WARN, null, sessionBeanClassCannotBeAnInterface$str(), arg0);
    }
    protected String sessionBeanClassCannotBeAnInterface$str() {
        return "WFLYEJB0118: [Enterprise Beans 3.1 spec, section 4.9.2] Session bean implementation class MUST NOT be a interface - %s is an interface, hence won't be considered as a session bean";
    }
    @Override
    public final void sessionBeanClassMustBePublicNonAbstractNonFinal(final String arg0) {
        super.log.logf(FQCN, WARN, null, sessionBeanClassMustBePublicNonAbstractNonFinal$str(), arg0);
    }
    protected String sessionBeanClassMustBePublicNonAbstractNonFinal$str() {
        return "WFLYEJB0119: [Enterprise Beans 3.1 spec, section 4.9.2] Session bean implementation class MUST be public, not abstract and not final - %s won't be considered as a session bean, since it doesn't meet that requirement";
    }
    @Override
    public final void mdbClassCannotBeAnInterface(final String arg0) {
        super.log.logf(FQCN, WARN, null, mdbClassCannotBeAnInterface$str(), arg0);
    }
    protected String mdbClassCannotBeAnInterface$str() {
        return "WFLYEJB0120: [Enterprise Beans 3.1 spec, section 5.6.2] Message driven bean implementation class MUST NOT be a interface - %s is an interface, hence won't be considered as a message driven bean";
    }
    @Override
    public final void mdbClassMustBePublicNonAbstractNonFinal(final String arg0) {
        super.log.logf(FQCN, WARN, null, mdbClassMustBePublicNonAbstractNonFinal$str(), arg0);
    }
    protected String mdbClassMustBePublicNonAbstractNonFinal$str() {
        return "WFLYEJB0121: [Enterprise Beans 3.1 spec, section 5.6.2] Message driven bean implementation class MUST be public, not abstract and not final - %s won't be considered as a message driven bean, since it doesn't meet that requirement";
    }
    protected String failedToCreateDeploymentNodeSelector$str() {
        return "WFLYEJB0125: Could not create an instance of deployment node selector %s";
    }
    @Override
    public final DeploymentUnitProcessingException failedToCreateDeploymentNodeSelector(final Exception arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToCreateDeploymentNodeSelector$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ejbMustHavePublicDefaultConstructor$str() {
        return "WFLYEJB0127: Jakarta Enterprise Beans %s of type %s must have public default constructor";
    }
    @Override
    public final DeploymentUnitProcessingException ejbMustHavePublicDefaultConstructor(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), ejbMustHavePublicDefaultConstructor$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ejbMustNotBeInnerClass$str() {
        return "WFLYEJB0128: Jakarta Enterprise Beans %s of type %s must not be inner class";
    }
    @Override
    public final DeploymentUnitProcessingException ejbMustNotBeInnerClass(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), ejbMustNotBeInnerClass$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ejbMustBePublicClass$str() {
        return "WFLYEJB0129: Jakarta Enterprise Beans %s of type %s must be declared public";
    }
    @Override
    public final DeploymentUnitProcessingException ejbMustBePublicClass(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), ejbMustBePublicClass$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ejbMustNotBeFinalClass$str() {
        return "WFLYEJB0130: Jakarta Enterprise Beans %s of type %s must not be declared final";
    }
    @Override
    public final DeploymentUnitProcessingException ejbMustNotBeFinalClass(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), ejbMustNotBeFinalClass$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void ejbMethodMustNotBeFinalNorStatic(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, ejbMethodMustNotBeFinalNorStatic$str(), arg0, arg1);
    }
    protected String ejbMethodMustNotBeFinalNorStatic$str() {
        return "WFLYEJB0131: Jakarta Enterprise Beans %s should not have a final or static method (%s)";
    }
    protected String reentrantSingletonCreation$str() {
        return "WFLYEJB0132: @PostConstruct method of Jakarta Enterprise Beans singleton %s of type %s has been recursively invoked";
    }
    @Override
    public final IllegalStateException reentrantSingletonCreation(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), reentrantSingletonCreation$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unauthorizedAccessToUserTransaction$str() {
        return "WFLYEJB0137: Only session and message-driven beans with bean-managed transaction demarcation are allowed to access UserTransaction";
    }
    @Override
    public final IllegalStateException unauthorizedAccessToUserTransaction() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unauthorizedAccessToUserTransaction$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String timerServiceIsNotActive$str() {
        return "WFLYEJB0139: The timer service has been disabled. Please add a <timer-service> entry into the Jakarta Enterprise Beans section of the server configuration to enable it.";
    }
    @Override
    public final String timerServiceIsNotActive() {
        return String.format(getLoggingLocale(), timerServiceIsNotActive$str());
    }
    protected String ejbHasNoTimerMethods$str() {
        return "WFLYEJB0140: This Jakarta Enterprise Beans does not have any timeout methods";
    }
    @Override
    public final String ejbHasNoTimerMethods() {
        return String.format(getLoggingLocale(), ejbHasNoTimerMethods$str());
    }
    @Override
    public final void deploymentAddListenerException(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, deploymentAddListenerException$str());
    }
    protected String deploymentAddListenerException$str() {
        return "WFLYEJB0141: Exception calling deployment added listener";
    }
    @Override
    public final void deploymentRemoveListenerException(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, deploymentRemoveListenerException$str());
    }
    protected String deploymentRemoveListenerException$str() {
        return "WFLYEJB0142: Exception calling deployment removal listener";
    }
    @Override
    public final void failedToRemoveManagementResources(final InstalledComponent arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, null, failedToRemoveManagementResources$str(), arg0, arg1);
    }
    protected String failedToRemoveManagementResources$str() {
        return "WFLYEJB0143: Failed to remove management resources for %s -- %s";
    }
    @Override
    public final void cobraInterfaceRepository(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, cobraInterfaceRepository$str(), arg0, arg1);
    }
    protected String cobraInterfaceRepository$str() {
        return "WFLYEJB0144: CORBA interface repository for %s: %s";
    }
    @Override
    public final void cannotUnregisterEJBHomeFromCobra(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, cannotUnregisterEJBHomeFromCobra$str());
    }
    protected String cannotUnregisterEJBHomeFromCobra$str() {
        return "WFLYEJB0145: Cannot unregister EJBHome from CORBA naming service";
    }
    @Override
    public final void cannotDeactivateHomeServant(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, cannotDeactivateHomeServant$str());
    }
    protected String cannotDeactivateHomeServant$str() {
        return "WFLYEJB0146: Cannot deactivate home servant";
    }
    @Override
    public final void cannotDeactivateBeanServant(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, cannotDeactivateBeanServant$str());
    }
    protected String cannotDeactivateBeanServant$str() {
        return "WFLYEJB0147: Cannot deactivate bean servant";
    }
    @Override
    public final void couldNotWriteMethodInvocation(final Throwable arg0, final Method arg1, final String arg2, final String arg3, final String arg4, final String arg5) {
        super.log.logf(FQCN, ERROR, arg0, couldNotWriteMethodInvocation$str(), arg1, arg2, arg3, arg4, arg5);
    }
    protected String couldNotWriteMethodInvocation$str() {
        return "WFLYEJB0150: Could not write method invocation failure for method %s on bean named %s for appname %s modulename %s distinctname %s due to";
    }
    @Override
    public final void exceptionGeneratingSessionId(final Throwable arg0, final String arg1, final Object arg2) {
        super.log.logf(FQCN, ERROR, arg0, exceptionGeneratingSessionId$str(), arg1, arg2);
    }
    protected String exceptionGeneratingSessionId$str() {
        return "WFLYEJB0151: Exception while generating session id for component %s with invocation %s";
    }
    @Override
    public final void failedToGetStatus(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, failedToGetStatus$str());
    }
    protected String failedToGetStatus$str() {
        return "WFLYEJB0157: Failed to get status";
    }
    @Override
    public final void failedToRollback(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, failedToRollback$str());
    }
    protected String failedToRollback$str() {
        return "WFLYEJB0158: Failed to rollback";
    }
    @Override
    public final void transactionNotComplete(final String arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, null, transactionNotComplete2$str(), arg0, arg1);
    }
    protected String transactionNotComplete2$str() {
        return "WFLYEJB0159: BMT stateful bean '%s' did not complete user transaction properly status=%s";
    }
    @Override
    public final void timerReinstatementFailed(final String arg0, final String arg1, final Throwable arg2) {
        super.log.logf(FQCN, WARN, arg2, timerReinstatementFailed$str(), arg0, arg1);
    }
    protected String timerReinstatementFailed$str() {
        return "WFLYEJB0161: Failed to reinstate timer '%s' (id=%s) from its persistent state";
    }
    @Override
    public final void skipInvokeTimeoutDuringRetry(final Timer arg0, final Date arg1) {
        super.log.logf(FQCN, WARN, null, skipInvokeTimeoutDuringRetry$str(), arg0, arg1);
    }
    protected String skipInvokeTimeoutDuringRetry$str() {
        return "WFLYEJB0162: A previous execution of timer %s is being retried, skipping this scheduled execution at: %s";
    }
    @Override
    public final void couldNotCreateTable(final SQLException arg0) {
        super.log.logf(FQCN, ERROR, arg0, couldNotCreateTable$str());
    }
    protected String couldNotCreateTable$str() {
        return "WFLYEJB0163: Cannot create table for timer persistence";
    }
    @Override
    public final void exceptionRunningTimerTask(final Timer arg0, final String arg1, final Exception arg2) {
        super.log.logf(FQCN, ERROR, arg2, exceptionRunningTimerTask$str(), arg0, arg1);
    }
    protected String exceptionRunningTimerTask$str() {
        return "WFLYEJB0164: Exception running timer task for timer %s on Jakarta Enterprise Beans %s";
    }
    @Override
    public final void deprecatedAnnotation(final String arg0) {
        super.log.logf(FQCN, WARN, null, deprecatedAnnotation$str(), arg0);
    }
    protected String deprecatedAnnotation$str() {
        return "WFLYEJB0166: The @%s annotation is deprecated and will be ignored.";
    }
    @Override
    public final void deprecatedNamespace(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, deprecatedNamespace$str(), arg0, arg1);
    }
    protected String deprecatedNamespace$str() {
        return "WFLYEJB0167: The <%2$s xmlns=\"%1$s\"/> element will be ignored.";
    }
    protected String couldNotFindEjb$str() {
        return "WFLYEJB0168: Could not find Jakarta Enterprise Beans with id %s";
    }
    @Override
    public final NoSuchEJBException couldNotFindEjb(final String arg0) {
        final NoSuchEJBException result = new NoSuchEJBException(String.format(getLoggingLocale(), couldNotFindEjb$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String componentNotSetInInterceptor$str() {
        return "WFLYEJB0169: Component not set in InterceptorContext: %s";
    }
    @Override
    public final IllegalStateException componentNotSetInInterceptor(final InterceptorContext arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), componentNotSetInInterceptor$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String methodNameIsNull$str() {
        return "WFLYEJB0170: Method name cannot be null";
    }
    @Override
    public final IllegalArgumentException methodNameIsNull() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), methodNameIsNull$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String beanHomeInterfaceIsNull$str() {
        return "WFLYEJB0171: Bean %s does not have a Home interface";
    }
    @Override
    public final IllegalStateException beanHomeInterfaceIsNull(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), beanHomeInterfaceIsNull$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String beanLocalHomeInterfaceIsNull$str() {
        return "WFLYEJB0172: Bean %s does not have a Local Home interface";
    }
    @Override
    public final IllegalStateException beanLocalHomeInterfaceIsNull(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), beanLocalHomeInterfaceIsNull$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToCallgetRollbackOnly$str() {
        return "WFLYEJB0173: Enterprise Beans 3.1 FR 13.6.1 Only beans with container-managed transaction demarcation can use getRollbackOnly.";
    }
    @Override
    public final IllegalStateException failToCallgetRollbackOnly() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failToCallgetRollbackOnly$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToCallgetRollbackOnlyOnNoneTransaction$str() {
        return "WFLYEJB0174: getRollbackOnly() not allowed without a transaction.";
    }
    @Override
    public final IllegalStateException failToCallgetRollbackOnlyOnNoneTransaction() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failToCallgetRollbackOnlyOnNoneTransaction$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToCallgetRollbackOnlyAfterTxcompleted$str() {
        return "WFLYEJB0175: getRollbackOnly() not allowed after transaction is completed (EJBTHREE-1445)";
    }
    @Override
    public final IllegalStateException failToCallgetRollbackOnlyAfterTxcompleted() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failToCallgetRollbackOnlyAfterTxcompleted$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jndiNameCannotBeNull$str() {
        return "WFLYEJB0177: jndi name cannot be null during lookup";
    }
    @Override
    public final IllegalArgumentException jndiNameCannotBeNull() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), jndiNameCannotBeNull$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noNamespaceContextSelectorAvailable$str() {
        return "WFLYEJB0178: No NamespaceContextSelector available, cannot lookup %s";
    }
    @Override
    public final IllegalArgumentException noNamespaceContextSelectorAvailable(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noNamespaceContextSelectorAvailable$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToLookupJNDI$str() {
        return "WFLYEJB0179:  Could not lookup jndi name: %s";
    }
    @Override
    public final RuntimeException failToLookupJNDI(final String arg0, final Throwable arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failToLookupJNDI$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToLookupJNDINameSpace$str() {
        return "WFLYEJB0180: Cannot lookup jndi name: %s since it doesn't belong to java:app, java:module, java:comp or java:global namespace";
    }
    @Override
    public final IllegalArgumentException failToLookupJNDINameSpace(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), failToLookupJNDINameSpace$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToLookupStrippedJNDI$str() {
        return "WFLYEJB0181: Could not lookup jndi name: %s in context: %s";
    }
    @Override
    public final IllegalArgumentException failToLookupStrippedJNDI(final NamespaceContextSelector arg0, final Context arg1, final Throwable arg2) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), failToLookupStrippedJNDI$str(), arg0, arg1), arg2);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToCallSetRollbackOnlyOnNoneCMB$str() {
        return "WFLYEJB0182: Enterprise Beans 3.1 FR 13.6.1 Only beans with container-managed transaction demarcation can use setRollbackOnly.";
    }
    @Override
    public final IllegalStateException failToCallSetRollbackOnlyOnNoneCMB() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failToCallSetRollbackOnlyOnNoneCMB$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToCallSetRollbackOnlyWithNoTx$str() {
        return "WFLYEJB0183: setRollbackOnly() not allowed without a transaction.";
    }
    @Override
    public final IllegalStateException failToCallSetRollbackOnlyWithNoTx() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failToCallSetRollbackOnlyWithNoTx$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String EjbJarConfigurationIsNull$str() {
        return "WFLYEJB0184: EjbJarConfiguration cannot be null";
    }
    @Override
    public final IllegalArgumentException EjbJarConfigurationIsNull() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), EjbJarConfigurationIsNull$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String SecurityRolesIsNull$str() {
        return "WFLYEJB0185: Cannot set security roles to null";
    }
    @Override
    public final IllegalArgumentException SecurityRolesIsNull() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), SecurityRolesIsNull$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToLinkFromEmptySecurityRole$str() {
        return "WFLYEJB0193: Cannot link from a null or empty security role: %s";
    }
    @Override
    public final IllegalArgumentException failToLinkFromEmptySecurityRole(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), failToLinkFromEmptySecurityRole$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToLinkToEmptySecurityRole$str() {
        return "WFLYEJB0194: Cannot link to a null or empty security role: %s";
    }
    @Override
    public final IllegalArgumentException failToLinkToEmptySecurityRole(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), failToLinkToEmptySecurityRole$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ejbJarConfigNotFound$str() {
        return "WFLYEJB0195: EjbJarConfiguration not found as an attachment in deployment unit: %s";
    }
    @Override
    public final DeploymentUnitProcessingException ejbJarConfigNotFound(final DeploymentUnit arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), ejbJarConfigNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String componentViewNotAvailableInContext$str() {
        return "WFLYEJB0196: ComponentViewInstance not available in interceptor context: %s";
    }
    @Override
    public final IllegalStateException componentViewNotAvailableInContext(final InterceptorContext arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), componentViewNotAvailableInContext$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownResourceAdapter$str() {
        return "WFLYEJB0199: No resource adapter registered with resource adapter name %s";
    }
    @Override
    public final IllegalStateException unknownResourceAdapter(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unknownResourceAdapter$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToCompleteTaskBeforeTimeOut$str() {
        return "WFLYEJB0202: Task did not complete in %s  %S";
    }
    @Override
    public final TimeoutException failToCompleteTaskBeforeTimeOut(final long arg0, final TimeUnit arg1) {
        final TimeoutException result = new TimeoutException(String.format(getLoggingLocale(), failToCompleteTaskBeforeTimeOut$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String taskWasCancelled$str() {
        return "WFLYEJB0203: Task was cancelled";
    }
    @Override
    public final CancellationException taskWasCancelled() {
        final CancellationException result = new CancellationException(String.format(getLoggingLocale(), taskWasCancelled$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String methodNotImplemented$str() {
        return "WFLYEJB0206: Not implemented yet";
    }
    @Override
    public final IllegalStateException methodNotImplemented() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), methodNotImplemented$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedComponent$str() {
        return "WFLYEJB0213: Unexpected component: %s component Expected %s";
    }
    @Override
    public final IllegalStateException unexpectedComponent(final Component arg0, final Class<?> arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unexpectedComponent$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ejbJarConfigNotBeenSet$str() {
        return "WFLYEJB0214: EjbJarConfiguration hasn't been set in %s Cannot create component create service for Jakarta Enterprise Beans %S";
    }
    @Override
    public final IllegalStateException ejbJarConfigNotBeenSet(final ComponentCreateServiceFactory arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), ejbJarConfigNotBeenSet$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String poolConfigIsEmpty$str() {
        return "WFLYEJB0218: PoolConfig cannot be null or empty";
    }
    @Override
    public final IllegalStateException poolConfigIsEmpty() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), poolConfigIsEmpty$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToAddClassToLocalView$str() {
        return "WFLYEJB0220: [Enterprise Beans 3.1 spec, section 4.9.7] - Can't add view class: %s as local view since it's already marked as remote view for bean: %s";
    }
    @Override
    public final IllegalStateException failToAddClassToLocalView(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failToAddClassToLocalView$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String businessInterfaceIsNull$str() {
        return "WFLYEJB0221: Business interface type cannot be null";
    }
    @Override
    public final IllegalStateException businessInterfaceIsNull() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), businessInterfaceIsNull$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String beanComponentMissingEjbObject$str() {
        return "WFLYEJB0222: Bean %s does not have an %s";
    }
    @Override
    public final IllegalStateException beanComponentMissingEjbObject(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), beanComponentMissingEjbObject$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String getRollBackOnlyIsNotAllowWithSupportsAttribute$str() {
        return "WFLYEJB0223: Jakarta Enterprise Beans 3.1 FR 13.6.2.9 getRollbackOnly is not allowed with SUPPORTS attribute";
    }
    @Override
    public final IllegalStateException getRollBackOnlyIsNotAllowWithSupportsAttribute() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), getRollBackOnlyIsNotAllowWithSupportsAttribute$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToCallBusinessOnNonePublicMethod$str() {
        return "WFLYEJB0224: Not a business method %s. Do not call non-public methods on Jakarta Enterprise Beans's";
    }
    @Override
    public final EJBException failToCallBusinessOnNonePublicMethod(final Method arg0) {
        final EJBException result = new EJBException(String.format(getLoggingLocale(), failToCallBusinessOnNonePublicMethod$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String componentInstanceNotAvailable$str() {
        return "WFLYEJB0225: Component instance isn't available for invocation: %s";
    }
    @Override
    public final Exception componentInstanceNotAvailable(final InterceptorContext arg0) {
        final Exception result = new Exception(String.format(getLoggingLocale(), componentInstanceNotAvailable$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToObtainLock$str() {
        return "WFLYEJB0228: Enterprise Beans 3.1 FR 4.3.14.1 concurrent access timeout on %s - could not obtain lock within %s %s";
    }
    @Override
    public final ConcurrentAccessTimeoutException failToObtainLock(final String arg0, final long arg1, final TimeUnit arg2) {
        final ConcurrentAccessTimeoutException result = new ConcurrentAccessTimeoutException(String.format(getLoggingLocale(), failToObtainLock$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String statefulSessionIdIsNull$str() {
        return "WFLYEJB0234: Session id hasn't been set for stateful component: %s";
    }
    @Override
    public final IllegalStateException statefulSessionIdIsNull(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), statefulSessionIdIsNull$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String removeMethodIsNull$str() {
        return "WFLYEJB0235: @Remove method identifier cannot be null";
    }
    @Override
    public final IllegalArgumentException removeMethodIsNull() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), removeMethodIsNull$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String componentNotInstanceOfSessionComponent$str() {
        return "WFLYEJB0236: Component %s with component class: %s%n isn't a %s component";
    }
    @Override
    public final IllegalArgumentException componentNotInstanceOfSessionComponent(final Component arg0, final Class<?> arg1, final String arg2) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), componentNotInstanceOfSessionComponent$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String bothMethodIntAndClassNameSet$str() {
        return "WFLYEJB0237: both methodIntf and className are set on %s";
    }
    @Override
    public final IllegalArgumentException bothMethodIntAndClassNameSet(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), bothMethodIntAndClassNameSet$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToUpgradeToWriteLock$str() {
        return "WFLYEJB0238: Enterprise Beans 3.1 PFD2 4.8.5.1.1 upgrading from read to write lock is not allowed";
    }
    @Override
    public final IllegalLoopbackException failToUpgradeToWriteLock() {
        final IllegalLoopbackException result = new IllegalLoopbackException(String.format(getLoggingLocale(), failToUpgradeToWriteLock$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String componentIsNull$str() {
        return "WFLYEJB0239: %s cannot be null";
    }
    @Override
    public final IllegalArgumentException componentIsNull(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), componentIsNull$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invocationNotApplicableForMethodInvocation$str() {
        return "WFLYEJB0240: Invocation context: %s cannot be processed because it's not applicable for a method invocation";
    }
    @Override
    public final IllegalArgumentException invocationNotApplicableForMethodInvocation(final InvocationContext arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invocationNotApplicableForMethodInvocation$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String concurrentAccessTimeoutException$str() {
        return "WFLYEJB0241: Enterprise Beans 3.1 PFD2 4.8.5.5.1 concurrent access timeout on %s - could not obtain lock within %s";
    }
    @Override
    public final ConcurrentAccessTimeoutException concurrentAccessTimeoutException(final String arg0, final String arg1) {
        final ConcurrentAccessTimeoutException result = new ConcurrentAccessTimeoutException(String.format(getLoggingLocale(), concurrentAccessTimeoutException$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToObtainLockIllegalType$str() {
        return "WFLYEJB0242: Illegal lock type %s on %s for component %s";
    }
    @Override
    public final IllegalStateException failToObtainLockIllegalType(final LockType arg0, final Method arg1, final SingletonComponent arg2) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failToObtainLockIllegalType$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noAsynchronousInvocationInProgress$str() {
        return "WFLYEJB0244: No asynchronous invocation in progress";
    }
    @Override
    public final IllegalStateException noAsynchronousInvocationInProgress() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noAsynchronousInvocationInProgress$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String roleNamesIsNull$str() {
        return "WFLYEJB0255: <role-name> cannot be null or empty in <security-role-ref>%nfor bean: %s";
    }
    @Override
    public final DeploymentUnitProcessingException roleNamesIsNull(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), roleNamesIsNull$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String defaultInterceptorsNotBindToMethod$str() {
        return "WFLYEJB0256: Default interceptors cannot specify a method to bind to in ejb-jar.xml";
    }
    @Override
    public final DeploymentUnitProcessingException defaultInterceptorsNotBindToMethod() {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), defaultInterceptorsNotBindToMethod$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String twoEjbBindingsSpecifyAbsoluteOrder$str() {
        return "WFLYEJB0258: Two ejb-jar.xml bindings for %s specify an absolute order";
    }
    @Override
    public final DeploymentUnitProcessingException twoEjbBindingsSpecifyAbsoluteOrder(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), twoEjbBindingsSpecifyAbsoluteOrder$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToFindMethodInEjbJarXml$str() {
        return "WFLYEJB0259: Could not find method %s.%s referenced in ejb-jar.xml";
    }
    @Override
    public final DeploymentUnitProcessingException failToFindMethodInEjbJarXml(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failToFindMethodInEjbJarXml$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleMethodReferencedInEjbJarXml$str() {
        return "WFLYEJB0260: More than one method %s found on class %s referenced in ejb-jar.xml. Specify the parameter types to resolve the ambiguity";
    }
    @Override
    public final DeploymentUnitProcessingException multipleMethodReferencedInEjbJarXml(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), multipleMethodReferencedInEjbJarXml$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToFindMethodWithParameterTypes$str() {
        return "WFLYEJB0261: Could not find method %s.%s with parameter types %s referenced in ejb-jar.xml";
    }
    @Override
    public final DeploymentUnitProcessingException failToFindMethodWithParameterTypes(final String arg0, final String arg1, final MethodParametersMetaData arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failToFindMethodWithParameterTypes$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToLoadComponentClass$str() {
        return "WFLYEJB0262: Could not load component class for component %s";
    }
    @Override
    public final DeploymentUnitProcessingException failToLoadComponentClass(final Throwable arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failToLoadComponentClass$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToMergeData$str() {
        return "WFLYEJB0264: Could not merge data for %s";
    }
    @Override
    public final DeploymentUnitProcessingException failToMergeData(final String arg0, final Throwable arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failToMergeData$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToLoadEjbClass$str() {
        return "WFLYEJB0265: Could not load Jakarta Enterprise Beans class %s";
    }
    @Override
    public final DeploymentUnitProcessingException failToLoadEjbClass(final String arg0, final Throwable arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failToLoadEjbClass$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleAnnotationsOnBean$str() {
        return "WFLYEJB0266: Only one %s method is allowed on bean %s";
    }
    @Override
    public final RuntimeException multipleAnnotationsOnBean(final String arg0, final String arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), multipleAnnotationsOnBean$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleCreateMethod$str() {
        return "WFLYEJB0267: Could not determine type of corresponding implied Enterprise Beans 2.x local interface (see Enterprise Beans 3.1 21.4.5)%n due to multiple create* methods with different return types on home %s";
    }
    @Override
    public final DeploymentUnitProcessingException multipleCreateMethod(final Class<?> arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), multipleCreateMethod$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToFindEjbRefByDependsOn$str() {
        return "WFLYEJB0268: Could not find Jakarta Enterprise Beans %s referenced by @DependsOn annotation in %s";
    }
    @Override
    public final DeploymentUnitProcessingException failToFindEjbRefByDependsOn(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failToFindEjbRefByDependsOn$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToCallEjbRefByDependsOn$str() {
        return "WFLYEJB0269: More than one Jakarta Enterprise Beans called %s referenced by @DependsOn annotation in %s Components:%s";
    }
    @Override
    public final DeploymentUnitProcessingException failToCallEjbRefByDependsOn(final String arg0, final String arg1, final Set<org.jboss.as.ee.component.ComponentDescription> arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failToCallEjbRefByDependsOn$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String wrongReturnTypeForAsyncMethod$str() {
        return "WFLYEJB0270: Async method %s does not return void or Future";
    }
    @Override
    public final DeploymentUnitProcessingException wrongReturnTypeForAsyncMethod(final Method arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), wrongReturnTypeForAsyncMethod$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToLoadAppExceptionClassInEjbJarXml$str() {
        return "WFLYEJB0271: Could not load application exception class %s in ejb-jar.xml";
    }
    @Override
    public final DeploymentUnitProcessingException failToLoadAppExceptionClassInEjbJarXml(final String arg0, final Throwable arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failToLoadAppExceptionClassInEjbJarXml$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidEjbEntityTimeout$str() {
        return "WFLYEJB0272: Jakarta Enterprise Beans %s entity bean %s implemented TimedObject, but has a different timeout method specified either via annotations or via the deployment descriptor";
    }
    @Override
    public final DeploymentUnitProcessingException invalidEjbEntityTimeout(final String arg0, final Class<?> arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), invalidEjbEntityTimeout$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidEjbLocalInterface$str() {
        return "WFLYEJB0273: %s does not have an Enterprise Beans 2.x local interface";
    }
    @Override
    public final RuntimeException invalidEjbLocalInterface(final String arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), invalidEjbLocalInterface$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String localHomeNotAllow$str() {
        return "WFLYEJB0274: Local Home not allowed for %s";
    }
    @Override
    public final DeploymentUnitProcessingException localHomeNotAllow(final EJBComponentDescription arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), localHomeNotAllow$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToCallEjbCreateForHomeInterface$str() {
        return "WFLYEJB0275: Could not resolve corresponding ejbCreate or @Init method for home interface method %s on Jakarta Enterprise Beans %s";
    }
    @Override
    public final DeploymentUnitProcessingException failToCallEjbCreateForHomeInterface(final Method arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failToCallEjbCreateForHomeInterface$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToGetEjbComponent$str() {
        return "WFLYEJB0276: EJBComponent has not been set in the current invocation context %s";
    }
    @Override
    public final IllegalStateException failToGetEjbComponent(final InterceptorContext arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failToGetEjbComponent$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidScheduleValue$str() {
        return "WFLYEJB0286: Invalid schedule %s value: %s";
    }
    @Override
    public final IllegalArgumentException invalidScheduleValue(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidScheduleValue$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidScheduleExpressionType$str() {
        return "WFLYEJB0291: Invalid value: %s since %s doesn't support values of types %s";
    }
    @Override
    public final IllegalArgumentException invalidScheduleExpressionType(final String arg0, final String arg1, final String arg2) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidScheduleExpressionType$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidListValue$str() {
        return "WFLYEJB0292: A list value can only contain either a range or an individual value. Invalid value: %s";
    }
    @Override
    public final IllegalArgumentException invalidListValue(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidListValue$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidValuesRange$str() {
        return "WFLYEJB0294: Invalid value: %s Valid values are between %s and %s";
    }
    @Override
    public final IllegalArgumentException invalidValuesRange(final Integer arg0, final int arg1, final int arg2) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidValuesRange$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invokerIsNull$str() {
        return "WFLYEJB0303: Invoker cannot be null";
    }
    @Override
    public final IllegalArgumentException invokerIsNull() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invokerIsNull$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String executorIsNull$str() {
        return "WFLYEJB0305: Executor cannot be null";
    }
    @Override
    public final IllegalArgumentException executorIsNull() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), executorIsNull$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidTimerParameter$str() {
        return "WFLYEJB0306: Invalid timer parameter: %s = %s";
    }
    @Override
    public final IllegalArgumentException invalidTimerParameter(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidTimerParameter$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToInvokeTimerServiceDoLifecycle$str() {
        return "WFLYEJB0325: Cannot invoke timer service methods in lifecycle callback of non-singleton beans";
    }
    @Override
    public final IllegalStateException failToInvokeTimerServiceDoLifecycle() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failToInvokeTimerServiceDoLifecycle$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String timerIsNull$str() {
        return "WFLYEJB0326: Timer cannot be null";
    }
    @Override
    public final IllegalStateException timerIsNull() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), timerIsNull$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidTimerHandlersForPersistentTimers$str() {
        return "WFLYEJB0327: %s Timer handles are only available for persistent timers.";
    }
    @Override
    public final IllegalStateException invalidTimerHandlersForPersistentTimers(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidTimerHandlersForPersistentTimers$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noMoreTimeoutForTimer$str() {
        return "WFLYEJB0328: No more timeouts for timer %s";
    }
    @Override
    public final NoMoreTimeoutsException noMoreTimeoutForTimer(final Timer arg0) {
        final NoMoreTimeoutsException result = new NoMoreTimeoutsException(String.format(getLoggingLocale(), noMoreTimeoutForTimer$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidTimerNotCalendarBaseTimer$str() {
        return "WFLYEJB0329: Timer %s is not a calendar based timer";
    }
    @Override
    public final IllegalStateException invalidTimerNotCalendarBaseTimer(final Timer arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidTimerNotCalendarBaseTimer$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String timerHasExpired$str() {
        return "WFLYEJB0330: Timer %s has expired";
    }
    @Override
    public final NoSuchObjectLocalException timerHasExpired(final String arg0) {
        final NoSuchObjectLocalException result = new NoSuchObjectLocalException(String.format(getLoggingLocale(), timerHasExpired$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String timerWasCanceled$str() {
        return "WFLYEJB0331: Timer %s was canceled";
    }
    @Override
    public final NoSuchObjectLocalException timerWasCanceled(final String arg0) {
        final NoSuchObjectLocalException result = new NoSuchObjectLocalException(String.format(getLoggingLocale(), timerWasCanceled$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String timerServiceWithIdNotRegistered$str() {
        return "WFLYEJB0338: Timerservice with timedObjectId: %s is not registered";
    }
    @Override
    public final EJBException timerServiceWithIdNotRegistered(final String arg0) {
        final EJBException result = new EJBException(String.format(getLoggingLocale(), timerServiceWithIdNotRegistered$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String timerHandleIsNotActive$str() {
        return "WFLYEJB0339: Timer for handle with timer id: %s, timedObjectId: %s is not active";
    }
    @Override
    public final NoSuchObjectLocalException timerHandleIsNotActive(final String arg0, final String arg1) {
        final NoSuchObjectLocalException result = new NoSuchObjectLocalException(String.format(getLoggingLocale(), timerHandleIsNotActive$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToInvokegetTimeoutMethod$str() {
        return "WFLYEJB0341: Cannot invoke getTimeoutMethod on a timer which is not an auto-timer";
    }
    @Override
    public final IllegalStateException failToInvokegetTimeoutMethod() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failToInvokegetTimeoutMethod$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToLoadDeclaringClassOfTimeOut$str() {
        return "WFLYEJB0342: Could not load declaring class: %s of timeout method";
    }
    @Override
    public final RuntimeException failToLoadDeclaringClassOfTimeOut(final String arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failToLoadDeclaringClassOfTimeOut$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToInvokeTimeout$str() {
        return "WFLYEJB0343: Cannot invoke timeout method because method %s is not a timeout method";
    }
    @Override
    public final RuntimeException failToInvokeTimeout(final Method arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failToInvokeTimeout$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToCreateTimerFileStoreDir$str() {
        return "WFLYEJB0344: Could not create timer file store directory %s";
    }
    @Override
    public final RuntimeException failToCreateTimerFileStoreDir(final File arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failToCreateTimerFileStoreDir$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String timerFileStoreDirNotExist$str() {
        return "WFLYEJB0345: Timer file store directory %s does not exist";
    }
    @Override
    public final RuntimeException timerFileStoreDirNotExist(final File arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), timerFileStoreDirNotExist$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidTimerFileStoreDir$str() {
        return "WFLYEJB0346: Timer file store directory %s is not a directory";
    }
    @Override
    public final RuntimeException invalidTimerFileStoreDir(final File arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), invalidTimerFileStoreDir$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidSecurityForDomainSet$str() {
        return "WFLYEJB0347: Jakarta Enterprise Beans %s are enabled for security but doesn't have a security domain set";
    }
    @Override
    public final IllegalStateException invalidSecurityForDomainSet(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidSecurityForDomainSet$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidComponentConfiguration$str() {
        return "WFLYEJB0348: %s is not a Jakarta Enterprise Beans component";
    }
    @Override
    public final IllegalArgumentException invalidComponentConfiguration(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidComponentConfiguration$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failToLoadViewClassEjb$str() {
        return "WFLYEJB0349: Could not load view class for ejb %s";
    }
    @Override
    public final RuntimeException failToLoadViewClassEjb(final String arg0, final Throwable arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failToLoadViewClassEjb$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidEjbComponent$str() {
        return "WFLYEJB0350: Component named %s with component class %s is not a Jakarta Enterprise Beans component";
    }
    @Override
    public final IllegalArgumentException invalidEjbComponent(final String arg0, final Class<?> arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidEjbComponent$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidComponentType$str() {
        return "WFLYEJB0356: Jakarta Enterprise Beans component type %s does not support pools";
    }
    @Override
    public final IllegalStateException invalidComponentType(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidComponentType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownComponentType$str() {
        return "WFLYEJB0357: Unknown Jakarta Enterprise Beans Component type %s";
    }
    @Override
    public final IllegalStateException unknownComponentType(final EJBComponentType arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unknownComponentType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failProcessInvocation$str() {
        return "WFLYEJB0363: %s cannot handle method %s of view class %s.Expected view method to be %s on view class %s";
    }
    @Override
    public final IllegalStateException failProcessInvocation(final String arg0, final Method arg1, final String arg2, final Method arg3, final String arg4) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failProcessInvocation$str(), arg0, arg1, arg2, arg3, arg4));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invocationOfMethodNotAllowed$str() {
        return "WFLYEJB0364: Invocation on method: %s of bean: %s is not allowed";
    }
    @Override
    public final EJBAccessException invocationOfMethodNotAllowed(final Method arg0, final String arg1) {
        final EJBAccessException result = new EJBAccessException(String.format(getLoggingLocale(), invocationOfMethodNotAllowed$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownComponentDescriptionType$str() {
        return "WFLYEJB0365: Unknown Jakarta Enterprise Beans Component description type %s";
    }
    @Override
    public final IllegalArgumentException unknownComponentDescriptionType(final Class<?> arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownComponentDescriptionType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownAttribute$str() {
        return "WFLYEJB0366: Unknown attribute %s";
    }
    @Override
    public final IllegalStateException unknownAttribute(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unknownAttribute$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownOperations$str() {
        return "WFLYEJB0367: Unknown operation %s";
    }
    @Override
    public final IllegalStateException unknownOperations(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unknownOperations$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noComponentRegisteredForAddress$str() {
        return "WFLYEJB0368: No Jakarta Enterprise Beans component registered for address %s";
    }
    @Override
    public final String noComponentRegisteredForAddress(final PathAddress arg0) {
        return String.format(getLoggingLocale(), noComponentRegisteredForAddress$str(), arg0);
    }
    protected String noComponentAvailableForAddress$str() {
        return "WFLYEJB0369: No Jakarta Enterprise Beans component is available for address %s";
    }
    @Override
    public final String noComponentAvailableForAddress(final PathAddress arg0) {
        return String.format(getLoggingLocale(), noComponentAvailableForAddress$str(), arg0);
    }
    protected String invalidComponentState$str() {
        return "WFLYEJB0370: Jakarta Enterprise Beans component for address %s is in %n state %s, must be in state %s";
    }
    @Override
    public final String invalidComponentState(final PathAddress arg0, final State arg1, final State arg2) {
        return String.format(getLoggingLocale(), invalidComponentState$str(), arg0, arg1, arg2);
    }
    protected String componentClassHasMultipleTimeoutAnnotations$str() {
        return "WFLYEJB0372: Component class %s has multiple @Timeout annotations";
    }
    @Override
    public final DeploymentUnitProcessingException componentClassHasMultipleTimeoutAnnotations(final Class<?> arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), componentClassHasMultipleTimeoutAnnotations$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String currentComponentNotAEjb$str() {
        return "WFLYEJB0373: Current component is not a Jakarta Enterprise Beans bean %s";
    }
    @Override
    public final IllegalStateException currentComponentNotAEjb(final ComponentInstance arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), currentComponentNotAEjb$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String lifecycleMethodNotAllowed$str() {
        return "WFLYEJB0374: %s not allowed in lifecycle methods";
    }
    @Override
    public final IllegalStateException lifecycleMethodNotAllowed(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), lifecycleMethodNotAllowed$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCall$str() {
        return "WFLYEJB0376: Cannot call %s when invoking through %s or %s";
    }
    @Override
    public final IllegalStateException cannotCall(final String arg0, final String arg1, final String arg2) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotCall$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notAllowedFromStatefulBeans$str() {
        return "WFLYEJB0377: %s is not allowed from stateful beans";
    }
    @Override
    public final IllegalStateException notAllowedFromStatefulBeans(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), notAllowedFromStatefulBeans$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToAcquirePermit$str() {
        return "WFLYEJB0378: Failed to acquire a permit within %s %s";
    }
    @Override
    public final EJBException failedToAcquirePermit(final long arg0, final TimeUnit arg1) {
        final EJBException result = new EJBException(String.format(getLoggingLocale(), failedToAcquirePermit$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String acquireSemaphoreInterrupted$str() {
        return "WFLYEJB0379: Acquire semaphore was interrupted";
    }
    @Override
    public final EJBException acquireSemaphoreInterrupted() {
        final EJBException result = new EJBException(String.format(getLoggingLocale(), acquireSemaphoreInterrupted$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotFindClassLoaderForStub$str() {
        return "WFLYEJB0382: Could not determine ClassLoader for stub %s";
    }
    @Override
    public final RuntimeException couldNotFindClassLoaderForStub(final String arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotFindClassLoaderForStub$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownMessageListenerType$str() {
        return "WFLYEJB0383: No message listener of type %s found in resource adapter %s";
    }
    @Override
    public final IllegalStateException unknownMessageListenerType(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unknownMessageListenerType$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotFindViewMethodOnEjb$str() {
        return "WFLYEJB0384: Could not find method %s from view %s on Jakarta Enterprise Beans class %s";
    }
    @Override
    public final DeploymentUnitProcessingException couldNotFindViewMethodOnEjb(final Method arg0, final String arg1, final String arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), couldNotFindViewMethodOnEjb$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String stringParamCannotBeNullOrEmpty$str() {
        return "WFLYEJB0385: %s cannot be null or empty";
    }
    @Override
    public final IllegalArgumentException stringParamCannotBeNullOrEmpty(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), stringParamCannotBeNullOrEmpty$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemoveWhileParticipatingInTransaction$str() {
        return "WFLYEJB0386: Jakarta Enterprise Beans 4.6.4 Cannot remove Jakarta Enterprise Beans via Enterprise Beans 2.x remove() method while participating in a transaction";
    }
    @Override
    public final RemoveException cannotRemoveWhileParticipatingInTransaction() {
        final RemoveException result = new RemoveException(String.format(getLoggingLocale(), cannotRemoveWhileParticipatingInTransaction$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String transactionPropagationNotSupported$str() {
        return "WFLYEJB0387: Transaction propagation over IIOP is not supported";
    }
    @Override
    public final RemoteException transactionPropagationNotSupported() {
        final RemoteException result = new RemoteException(String.format(getLoggingLocale(), transactionPropagationNotSupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCallMethodInAfterCompletion$str() {
        return "WFLYEJB0388: Cannot call method %s in afterCompletion callback";
    }
    @Override
    public final IllegalStateException cannotCallMethodInAfterCompletion(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotCallMethodInAfterCompletion$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCallMethod$str() {
        return "WFLYEJB0389: Cannot call %s when state is %s";
    }
    @Override
    public final IllegalStateException cannotCallMethod(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotCallMethod$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String existingSerializationGroup$str() {
        return "WFLYEJB0390: %s is already associated with serialization group %s";
    }
    @Override
    public final IllegalStateException existingSerializationGroup(final Object arg0, final Object arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), existingSerializationGroup$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String incompatibleSerializationGroup$str() {
        return "WFLYEJB0391: %s is not compatible with serialization group %s";
    }
    @Override
    public final IllegalStateException incompatibleSerializationGroup(final Object arg0, final Object arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), incompatibleSerializationGroup$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cacheEntryInUse$str() {
        return "WFLYEJB0392: Cache entry %s is in use";
    }
    @Override
    public final IllegalStateException cacheEntryInUse(final Object arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cacheEntryInUse$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cacheEntryNotInUse$str() {
        return "WFLYEJB0393: Cache entry %s is not in use";
    }
    @Override
    public final IllegalStateException cacheEntryNotInUse(final Object arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cacheEntryNotInUse$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String lockAcquisitionInterrupted$str() {
        return "WFLYEJB0394: Failed to acquire lock on %s";
    }
    @Override
    public final RuntimeException lockAcquisitionInterrupted(final Throwable arg0, final Object arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), lockAcquisitionInterrupted$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateSerializationGroupMember$str() {
        return "WFLYEJB0395: %s is already a member of serialization group %s";
    }
    @Override
    public final IllegalStateException duplicateSerializationGroupMember(final Object arg0, final Object arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), duplicateSerializationGroupMember$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingSerializationGroupMember$str() {
        return "WFLYEJB0396: %s is not a member of serialization group %s";
    }
    @Override
    public final IllegalStateException missingSerializationGroupMember(final Object arg0, final Object arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), missingSerializationGroupMember$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateCacheEntry$str() {
        return "WFLYEJB0397: %s already exists in cache";
    }
    @Override
    public final IllegalStateException duplicateCacheEntry(final Object arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), duplicateCacheEntry$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingCacheEntry$str() {
        return "WFLYEJB0398: %s is missing from cache";
    }
    @Override
    public final IllegalStateException missingCacheEntry(final Object arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), missingCacheEntry$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String incompatibleCaches$str() {
        return "WFLYEJB0399: Incompatible cache implementations in nested hierarchy";
    }
    @Override
    public final IllegalStateException incompatibleCaches() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), incompatibleCaches$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String passivationFailed$str() {
        return "WFLYEJB0400: Failed to passivate %s";
    }
    @Override
    public final RuntimeException passivationFailed(final Throwable arg0, final Object arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), passivationFailed$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String activationFailed$str() {
        return "WFLYEJB0401: Failed to activate %s";
    }
    @Override
    public final RuntimeException activationFailed(final Throwable arg0, final Object arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), activationFailed$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String passivationDirectoryCreationFailed$str() {
        return "WFLYEJB0402: Failed to create passivation directory: %s";
    }
    @Override
    public final RuntimeException passivationDirectoryCreationFailed(final String arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), passivationDirectoryCreationFailed$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String passivationPathNotADirectory$str() {
        return "WFLYEJB0403: Failed to create passivation directory: %s";
    }
    @Override
    public final RuntimeException passivationPathNotADirectory(final String arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), passivationPathNotADirectory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String groupCreationContextAlreadyExists$str() {
        return "WFLYEJB0404: Group creation context already exists";
    }
    @Override
    public final IllegalStateException groupCreationContextAlreadyExists() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), groupCreationContextAlreadyExists$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ejbNotFound3$str() {
        return "WFLYEJB0405: No Jakarta Enterprise Beans found with interface of type '%s' and name '%s' for binding %s";
    }
    @Override
    public final String ejbNotFound(final String arg0, final String arg1, final String arg2) {
        return String.format(getLoggingLocale(), ejbNotFound3$str(), arg0, arg1, arg2);
    }
    protected String ejbNotFound2$str() {
        return "WFLYEJB0406: No Jakarta Enterprise Beans found with interface of type '%s' for binding %s";
    }
    @Override
    public final String ejbNotFound(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), ejbNotFound2$str(), arg0, arg1);
    }
    protected String moreThanOneEjbFound4$str() {
        return "WFLYEJB0407: More than one Jakarta Enterprise Beans found with interface of type '%s' and name '%s' for binding %s. Found: %s";
    }
    @Override
    public final String moreThanOneEjbFound(final String arg0, final String arg1, final String arg2, final Set<org.jboss.as.ejb3.component.EJBViewDescription> arg3) {
        return String.format(getLoggingLocale(), moreThanOneEjbFound4$str(), arg0, arg1, arg2, arg3);
    }
    protected String moreThanOneEjbFound3$str() {
        return "WFLYEJB0408: More than one Jakarta Enterprise Beans found with interface of type '%s' for binding %s. Found: %s";
    }
    @Override
    public final String moreThanOneEjbFound(final String arg0, final String arg1, final Set<org.jboss.as.ejb3.component.EJBViewDescription> arg2) {
        return String.format(getLoggingLocale(), moreThanOneEjbFound3$str(), arg0, arg1, arg2);
    }
    protected String clusteredAnnotationIsNotApplicableForMDB$str() {
        return "WFLYEJB0409: @Clustered annotation cannot be used with message driven beans. %s failed since %s bean is marked with @Clustered on class %s";
    }
    @Override
    public final DeploymentUnitProcessingException clusteredAnnotationIsNotApplicableForMDB(final DeploymentUnit arg0, final String arg1, final String arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), clusteredAnnotationIsNotApplicableForMDB$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String clusteredAnnotationIsNotApplicableForEntityBean$str() {
        return "WFLYEJB0410: @Clustered annotation cannot be used with entity beans. %s failed since %s bean is marked with @Clustered on class %s";
    }
    @Override
    public final DeploymentUnitProcessingException clusteredAnnotationIsNotApplicableForEntityBean(final DeploymentUnit arg0, final String arg1, final String arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), clusteredAnnotationIsNotApplicableForEntityBean$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String clusteredAnnotationNotYetImplementedForSingletonBean$str() {
        return "WFLYEJB0411: @Clustered annotation is currently not supported for singleton Jakarta Enterprise Beans. %s failed since %s bean is marked with @Clustered on class %s";
    }
    @Override
    public final DeploymentUnitProcessingException clusteredAnnotationNotYetImplementedForSingletonBean(final DeploymentUnit arg0, final String arg1, final String arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), clusteredAnnotationNotYetImplementedForSingletonBean$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String clusteredAnnotationIsNotApplicableForBean$str() {
        return "WFLYEJB0412: %s failed since @Clustered annotation cannot be used for %s bean on class %s";
    }
    @Override
    public final DeploymentUnitProcessingException clusteredAnnotationIsNotApplicableForBean(final DeploymentUnit arg0, final String arg1, final String arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), clusteredAnnotationIsNotApplicableForBean$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String sessionTypeNotSpecified$str() {
        return "WFLYEJB0413: <session-type> not specified for Jakarta Enterprise Beans %s. This must be present in ejb-jar.xml";
    }
    @Override
    public final DeploymentUnitProcessingException sessionTypeNotSpecified(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), sessionTypeNotSpecified$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String defaultInterceptorsNotSpecifyOrder$str() {
        return "WFLYEJB0414: Default interceptors cannot specify an <interceptor-order> element in ejb-jar.xml";
    }
    @Override
    public final DeploymentUnitProcessingException defaultInterceptorsNotSpecifyOrder() {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), defaultInterceptorsNotSpecifyOrder$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String paramCannotBeNull$str() {
        return "WFLYEJB0416: %s cannot be null";
    }
    @Override
    public final IllegalArgumentException paramCannotBeNull(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), paramCannotBeNull$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String poolNameCannotBeEmptyString$str() {
        return "WFLYEJB0419: Pool name cannot be empty string for bean %s";
    }
    @Override
    public final IllegalArgumentException poolNameCannotBeEmptyString(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), poolNameCannotBeEmptyString$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noEjbContextAvailable$str() {
        return "WFLYEJB0420: No EjbContext available as no Jakarta Enterprise Beans invocation is active";
    }
    @Override
    public final IllegalStateException noEjbContextAvailable() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noEjbContextAvailable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String componentIsShuttingDown$str() {
        return "WFLYEJB0421: Invocation cannot proceed as component is shutting down";
    }
    @Override
    public final EJBComponentUnavailableException componentIsShuttingDown() {
        final EJBComponentUnavailableException result = new EJBComponentUnavailableException(String.format(getLoggingLocale(), componentIsShuttingDown$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToCreateSessionForStatefulBean$str() {
        return "WFLYEJB0423: Could not create session for stateful bean %s";
    }
    @Override
    public final RuntimeException failedToCreateSessionForStatefulBean(final Exception arg0, final String arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToCreateSessionForStatefulBean$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownChannelCreationOptionType$str() {
        return "WFLYEJB0436: Unknown channel creation option type %s";
    }
    @Override
    public final IllegalArgumentException unknownChannelCreationOptionType(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownChannelCreationOptionType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotDetermineRemoteInterfaceFromHome$str() {
        return "WFLYEJB0437: Could not determine remote interface from home interface %s for bean %s";
    }
    @Override
    public final DeploymentUnitProcessingException couldNotDetermineRemoteInterfaceFromHome(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), couldNotDetermineRemoteInterfaceFromHome$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotDetermineLocalInterfaceFromLocalHome$str() {
        return "WFLYEJB0438: Could not determine local interface from local home interface %s for bean %s";
    }
    @Override
    public final DeploymentUnitProcessingException couldNotDetermineLocalInterfaceFromLocalHome(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), couldNotDetermineLocalInterfaceFromLocalHome$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedError$str() {
        return "WFLYEJB0442: Unexpected Error";
    }
    @Override
    public final EJBException unexpectedError(final Throwable arg0) {
        final EJBException result = new EJBException(String.format(getLoggingLocale(), unexpectedError$str()));
        result.initCause(arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String transactionNotComplete1$str() {
        return "WFLYEJB0443: Enterprise Beans 3.1 FR 13.3.3: BMT bean %s should complete transaction before returning.";
    }
    @Override
    public final String transactionNotComplete(final String arg0) {
        return String.format(getLoggingLocale(), transactionNotComplete1$str(), arg0);
    }
    protected String asymmetricCacheUsage$str() {
        return "WFLYEJB0445: Detected asymmetric usage of cache";
    }
    @Override
    public final IllegalStateException asymmetricCacheUsage() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), asymmetricCacheUsage$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String timerIsActive$str() {
        return "WFLYEJB0446: The timer %s is already active.";
    }
    @Override
    public final IllegalStateException timerIsActive(final Timer arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), timerIsActive$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String transactionAlreadyRolledBack$str() {
        return "WFLYEJB0447: Transaction '%s' was already rolled back";
    }
    @Override
    public final RollbackException transactionAlreadyRolledBack(final Transaction arg0) {
        final RollbackException result = new RollbackException(String.format(getLoggingLocale(), transactionAlreadyRolledBack$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String transactionInUnexpectedState$str() {
        return "WFLYEJB0448: Transaction '%s' is in unexpected state (%s)";
    }
    @Override
    public final EJBException transactionInUnexpectedState(final Transaction arg0, final String arg1) {
        final EJBException result = new EJBException(String.format(getLoggingLocale(), transactionInUnexpectedState$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String timerServiceMethodNotAllowedForSFSB$str() {
        return "WFLYEJB0449: Timerservice API is not allowed on stateful session bean %s";
    }
    @Override
    public final String timerServiceMethodNotAllowedForSFSB(final String arg0) {
        return String.format(getLoggingLocale(), timerServiceMethodNotAllowedForSFSB$str(), arg0);
    }
    protected String entityBeansAreNotSupported$str() {
        return "WFLYEJB0450: Entity Beans are no longer supported, beans %s cannot be deployed";
    }
    @Override
    public final DeploymentUnitProcessingException entityBeansAreNotSupported(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), entityBeansAreNotSupported$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String inconsistentAttributeNotSupported$str() {
        return "WFLYEJB0451: Attribute '%s' is not supported on current version servers; it is only allowed if its value matches '%s'";
    }
    @Override
    public final OperationFailedException inconsistentAttributeNotSupported(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), inconsistentAttributeNotSupported$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToPersistTimer(final Timer arg0, final Exception arg1) {
        super.log.logf(FQCN, ERROR, arg1, failedToPersistTimer$str(), arg0);
    }
    protected String failedToPersistTimer$str() {
        return "WFLYEJB0453: Failed to persist timer %s";
    }
    protected String mustOnlyBeSingleContainerTransactionElementWithWildcard$str() {
        return "WFLYEJB0454: Only one instance on <container-transaction> with an ejb-name of * can be present.";
    }
    @Override
    public final DeploymentUnitProcessingException mustOnlyBeSingleContainerTransactionElementWithWildcard() {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), mustOnlyBeSingleContainerTransactionElementWithWildcard$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String wildcardContainerTransactionElementsMustHaveWildcardMethodName$str() {
        return "WFLYEJB0455: <container-transaction> elements that use the wildcard Jakarta Enterprise Beans name * can only use a method name of *";
    }
    @Override
    public final DeploymentUnitProcessingException wildcardContainerTransactionElementsMustHaveWildcardMethodName() {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), wildcardContainerTransactionElementsMustHaveWildcardMethodName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToRefreshTimers(final String arg0) {
        super.log.logf(FQCN, ERROR, null, failedToRefreshTimers$str(), arg0);
    }
    protected String failedToRefreshTimers$str() {
        return "WFLYEJB0456: Failed to refresh timers for %s";
    }
    protected String unexpectedErrorRolledBack$str() {
        return "WFLYEJB0457: Unexpected Error";
    }
    @Override
    public final EJBTransactionRolledbackException unexpectedErrorRolledBack(final Error arg0) {
        final EJBTransactionRolledbackException result = new EJBTransactionRolledbackException(String.format(getLoggingLocale(), unexpectedErrorRolledBack$str()));
        result.initCause(arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String relativeResourceAdapterNameInStandaloneModule$str() {
        return "WFLYEJB0459: Module %s containing bean %s is not deployed in ear but it specifies resource adapter name '%s' in a relative format.";
    }
    @Override
    public final DeploymentUnitProcessingException relativeResourceAdapterNameInStandaloneModule(final String arg0, final String arg1, final String arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), relativeResourceAdapterNameInStandaloneModule$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void wrongTransactionIsolationConfiguredForTimer() {
        super.log.logf(FQCN, WARN, null, wrongTransactionIsolationConfiguredForTimer$str());
    }
    protected String wrongTransactionIsolationConfiguredForTimer$str() {
        return "WFLYEJB0460: The transaction isolation need to be equal or stricter than READ_COMMITTED to ensure that the timer run once-and-only-once";
    }
    @Override
    public final void timerUpdateFailedAndRollbackNotPossible(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, timerUpdateFailedAndRollbackNotPossible$str());
    }
    protected String timerUpdateFailedAndRollbackNotPossible$str() {
        return "WFLYEJB0461: Update timer failed and it was not possible to rollback the transaction!";
    }
    @Override
    public final void databaseDialectNotConfiguredOrDetected() {
        super.log.logf(FQCN, WARN, null, databaseDialectNotConfiguredOrDetected$str());
    }
    protected String databaseDialectNotConfiguredOrDetected$str() {
        return "WFLYEJB0462: Timer service database-data-store database attribute is not configured, and is not detected from connection metadata or JDBC driver name.";
    }
    @Override
    public final void invalidTransactionTypeForSfsbLifecycleMethod(final TransactionAttributeType arg0, final MethodIdentifier arg1, final Class<?> arg2) {
        super.log.logf(FQCN, WARN, null, invalidTransactionTypeForSfsbLifecycleMethod$str(), arg0, arg1, arg2);
    }
    protected String invalidTransactionTypeForSfsbLifecycleMethod$str() {
        return "WFLYEJB0463: Invalid transaction attribute type %s on SFSB lifecycle method %s of class %s, valid types are REQUIRES_NEW and NOT_SUPPORTED. Method will be treated as NOT_SUPPORTED.";
    }
    protected String disableDefaultEjbPermissionsCannotBeTrue$str() {
        return "WFLYEJB0464: The \"disable-default-ejb-permissions\" attribute may not be set to true";
    }
    @Override
    public final OperationFailedException disableDefaultEjbPermissionsCannotBeTrue() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), disableDefaultEjbPermissionsCannotBeTrue$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String profileAndRemotingEjbReceiversUsedTogether$str() {
        return "WFLYEJB0465: Invalid client descriptor configuration: 'profile' and 'remoting-ejb-receivers' cannot be used together";
    }
    @Override
    public final DeploymentUnitProcessingException profileAndRemotingEjbReceiversUsedTogether() {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), profileAndRemotingEjbReceiversUsedTogether$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToProcessBusinessInterfaces$str() {
        return "WFLYEJB0466: Failed to process business interfaces for Jakarta Enterprise Beans class %s";
    }
    @Override
    public final DeploymentUnitProcessingException failedToProcessBusinessInterfaces(final Class<?> arg0, final Exception arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToProcessBusinessInterfaces$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String containerSuspended$str() {
        return "WFLYEJB0467: The request was rejected as the container is suspended";
    }
    @Override
    public final EJBComponentUnavailableException containerSuspended() {
        final EJBComponentUnavailableException result = new EJBComponentUnavailableException(String.format(getLoggingLocale(), containerSuspended$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String timerInvocationFailed$str() {
        return "WFLYEJB0468: Timer invocation failed";
    }
    @Override
    public final OperationFailedException timerInvocationFailed(final Exception arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), timerInvocationFailed$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYEJB0469: Indexed child resources can only be registered if the parent resource supports ordered children. The parent of '%s' is not indexed";
    }
    @Override
    public final IllegalStateException indexedChildResourceRegistrationNotAvailable(final PathElement arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), indexedChildResourceRegistrationNotAvailable$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String rmiIiopVoliation$str() {
        return "WFLYEJB0471: RMI/IIOP Violation: %s%n";
    }
    @Override
    public final RuntimeException rmiIiopVoliation(final String arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), rmiIiopVoliation$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String exceptionRepositoryNotFound$str() {
        return "WFLYEJB0472: Cannot obtain exception repository id for %s:%n%s";
    }
    @Override
    public final RuntimeException exceptionRepositoryNotFound(final String arg0, final String arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), exceptionRepositoryNotFound$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void jndiBindings(final String arg0, final DeploymentUnit arg1, final StringBuilder arg2) {
        super.log.logf(FQCN, INFO, null, jndiBindings$str(), arg0, arg1, arg2);
    }
    protected String jndiBindings$str() {
        return "WFLYEJB0473: JNDI bindings for session bean named '%s' in deployment unit '%s' are as follows:%s";
    }
    @Override
    public final void logInconsistentAttributeNotSupported(final String arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, null, logInconsistentAttributeNotSupported$str(), arg0, arg1);
    }
    protected String logInconsistentAttributeNotSupported$str() {
        return "WFLYEJB0474: Attribute '%s' is not supported on current version servers; it is only allowed if its value matches '%s'. This attribute should be removed.";
    }
    @Override
    public final void mdbDeliveryStarted(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, mdbDeliveryStarted$str(), arg0, arg1);
    }
    protected String mdbDeliveryStarted$str() {
        return "WFLYEJB0475: MDB delivery started: %s,%s";
    }
    @Override
    public final void mdbDeliveryStopped(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, mdbDeliveryStopped$str(), arg0, arg1);
    }
    protected String mdbDeliveryStopped$str() {
        return "WFLYEJB0476: MDB delivery stopped: %s,%s";
    }
    protected String missingMdbDeliveryGroup$str() {
        return "WFLYEJB0477: MDB delivery group is missing: %s";
    }
    @Override
    public final DeploymentUnitProcessingException missingMdbDeliveryGroup(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), missingMdbDeliveryGroup$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void loadedPersistentTimerInTimeout(final String arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, null, loadedPersistentTimerInTimeout$str(), arg0, arg1);
    }
    protected String loadedPersistentTimerInTimeout$str() {
        return "WFLYEJB0480: Loaded timer (%s) for Jakarta Enterprise Beans (%s) and this node that is marked as being in a timeout. The original timeout may not have been processed. Please use graceful shutdown to ensure timeout tasks are finished before shutting down.";
    }
    @Override
    public final void strictPoolDerivedFromWorkers(final String arg0, final int arg1) {
        super.log.logf(FQCN, INFO, null, strictPoolDerivedFromWorkers$str(), arg0, arg1);
    }
    protected String strictPoolDerivedFromWorkers$str() {
        return "WFLYEJB0481: Strict pool %s is using a max instance size of %d (per class), which is derived from thread worker pool sizing.";
    }
    @Override
    public final void strictPoolDerivedFromCPUs(final String arg0, final int arg1) {
        super.log.logf(FQCN, INFO, null, strictPoolDerivedFromCPUs$str(), arg0, arg1);
    }
    protected String strictPoolDerivedFromCPUs$str() {
        return "WFLYEJB0482: Strict pool %s is using a max instance size of %d (per class), which is derived from the number of CPUs on this host.";
    }
    protected String mutuallyExclusiveAttributes$str() {
        return "WFLYEJB0483: Attributes are mutually exclusive: %s, %s";
    }
    @Override
    public final XMLStreamException mutuallyExclusiveAttributes(final Location arg0, final String arg1, final String arg2) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), mutuallyExclusiveAttributes$str(), arg1, arg2), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void invalidTransactionTypeForMDB(final TransactionAttributeType arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, WARN, null, invalidTransactionTypeForMDB$str(), arg0, arg1, arg2);
    }
    protected String invalidTransactionTypeForMDB$str() {
        return "WFLYEJB0485: Transaction type %s is unspecified for the %s method of the %s message-driven bean. It will be handled as NOT_SUPPORTED.";
    }
    @Override
    public final void remappingCacheAttributes(final String arg0, final ModelNode arg1, final ModelNode arg2) {
        super.log.logf(FQCN, INFO, null, remappingCacheAttributes$str(), arg0, arg1, arg2);
    }
    protected String remappingCacheAttributes$str() {
        return "WFLYEJB0486: Parameter 'default-clustered-sfsb-cache' was defined for the 'add' operation for resource '%s'. This parameter is deprecated and its previous behavior has been remapped to attribute 'default-sfsb-cache'. As a result the 'default-sfsb-cache' attribute has been set to '%s' and the 'default-sfsb-passivation-disabled-cache' attribute has been set to '%s'.";
    }
    @Override
    public final void unexpectedInvocationState(final int arg0, final String arg1, final String arg2, final String arg3) {
        super.log.logf(FQCN, ERROR, null, unexpectedInvocationState$str(), arg0, arg1, arg2, arg3);
    }
    protected String unexpectedInvocationState$str() {
        return "WFLYEJB0487: Unexpected invocation state %s for stateful bean %s/%s/%s";
    }
    @Override
    public final void timerNotRunning(final NotSupportedException arg0, final TimerImpl arg1) {
        super.log.logf(FQCN, ERROR, arg0, timerNotRunning$str(), arg1);
    }
    protected String timerNotRunning$str() {
        return "WFLYEJB0489: Timer %s not running as transaction could not be started";
    }
    protected String multipleSecurityDomainsDetected$str() {
        return "WFLYEJB0490: Multiple security domains not supported";
    }
    @Override
    public final DeploymentUnitProcessingException multipleSecurityDomainsDetected() {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), multipleSecurityDomainsDetected$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotBeginUserTransaction$str() {
        return "WFLYEJB0491: The transaction begin request was rejected as the container is suspended";
    }
    @Override
    public final EJBException cannotBeginUserTransaction() {
        final EJBException result = new EJBException(String.format(getLoggingLocale(), cannotBeginUserTransaction$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void suspensionWaitingActiveTransactions(final int arg0) {
        super.log.logf(FQCN, INFO, null, suspensionWaitingActiveTransactions$str(), arg0);
    }
    protected String suspensionWaitingActiveTransactions$str() {
        return "WFLYEJB0492: Jakarta Enterprise Beans subsystem suspension waiting for active transactions, %d transaction(s) remaining";
    }
    @Override
    public final void suspensionComplete() {
        super.log.logf(FQCN, INFO, null, suspensionComplete$str());
    }
    protected String suspensionComplete$str() {
        return "WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete";
    }
    protected String failedToObtainSSLContext$str() {
        return "WFLYEJB0494: Failed to obtain SSLContext";
    }
    @Override
    public final RuntimeException failedToObtainSSLContext(final Exception arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToObtainSSLContext$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void scheduleExpressionDateFromTimerPersistenceInvalid(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, scheduleExpressionDateFromTimerPersistenceInvalid$str(), arg0, arg1);
    }
    protected String scheduleExpressionDateFromTimerPersistenceInvalid$str() {
        return "WFLYEJB0495: Ignoring the persisted start or end date for scheduled expression of timer ID:%s as it is not valid : %s.";
    }
    protected String failedToCreateEJBClientInterceptor$str() {
        return "WFLYEJB0496: Could not create an instance of Jakarta Enterprise Beans client interceptor %s";
    }
    @Override
    public final DeploymentUnitProcessingException failedToCreateEJBClientInterceptor(final Exception arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToCreateEJBClientInterceptor$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToPersistTimerOnStartup(final TimerImpl arg0, final Exception arg1) {
        super.log.logf(FQCN, WARN, arg1, failedToPersistTimerOnStartup$str(), arg0);
    }
    protected String failedToPersistTimerOnStartup$str() {
        return "WFLYEJB0497: Failed to persist timer %s on startup. This is likely due to another cluster member making the same change, and should not affect operation.";
    }
    protected String cannotReadStrictMaxPoolDerivedSize$str() {
        return "WFLYEJB0499: Cannot read derived size - service %s unreachable";
    }
    @Override
    public final OperationFailedException cannotReadStrictMaxPoolDerivedSize(final ServiceName arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotReadStrictMaxPoolDerivedSize$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToActivateMdb$str() {
        return "WFLYEJB0501: Failed to activate MDB %s";
    }
    @Override
    public final RuntimeException failedToActivateMdb(final String arg0, final Exception arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToActivateMdb$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void exceptionCheckingIfTimerShouldRun(final Timer arg0, final Exception arg1) {
        super.log.logf(FQCN, ERROR, arg1, exceptionCheckingIfTimerShouldRun$str(), arg0);
    }
    protected String exceptionCheckingIfTimerShouldRun$str() {
        return "WFLYEJB0502: Exception checking if timer %s should run";
    }
    @Override
    public final void mdbOnMessageMethodCantBeFinal(final String arg0) {
        super.log.logf(FQCN, WARN, null, mdbOnMessageMethodCantBeFinal$str(), arg0);
    }
    protected String mdbOnMessageMethodCantBeFinal$str() {
        return "WFLYEJB0503: [Jakarta Enterprise Beans 3.2 spec, section 5.6.4] Message Driven Bean 'onMessage' method can not be final (MDB: %s).";
    }
    @Override
    public final void mdbOnMessageMethodCantBePrivate(final String arg0) {
        super.log.logf(FQCN, WARN, null, mdbOnMessageMethodCantBePrivate$str(), arg0);
    }
    protected String mdbOnMessageMethodCantBePrivate$str() {
        return "WFLYEJB0504: [Jakarta Enterprise Beans 3.2 spec, section 5.6.4] Message Driven Bean 'onMessage' method can not be private (MDB: %s).";
    }
    @Override
    public final void mdbOnMessageMethodCantBeStatic(final String arg0) {
        super.log.logf(FQCN, WARN, null, mdbOnMessageMethodCantBeStatic$str(), arg0);
    }
    protected String mdbOnMessageMethodCantBeStatic$str() {
        return "WFLYEJB0505: [Jakarta Enterprise Beans 3.2 spec, section 5.6.4] Message Driven Bean 'onMessage' method can not be static (MDB: %s).";
    }
    @Override
    public final void mdbCantHaveFinalizeMethod(final String arg0) {
        super.log.logf(FQCN, WARN, null, mdbCantHaveFinalizeMethod$str(), arg0);
    }
    protected String mdbCantHaveFinalizeMethod$str() {
        return "WFLYEJB0506: [Jakarta Enterprise Beans 3.2 spec, section 5.6.2] Message Driven Bean can not have a 'finalize' method. (MDB: %s)";
    }
    @Override
    public final void exceptionPersistPostTimerState(final Timer arg0, final Exception arg1) {
        super.log.logf(FQCN, ERROR, arg1, exceptionPersistPostTimerState$str(), arg0);
    }
    protected String exceptionPersistPostTimerState$str() {
        return "WFLYEJB0507: Failed to persist timer's state %s. Timer has to be restored manually";
    }
    @Override
    public final void exceptionPersistTimerState(final Timer arg0, final Exception arg1) {
        super.log.logf(FQCN, WARN, null, exceptionPersistTimerState$str(), arg0, arg1);
    }
    protected String exceptionPersistTimerState$str() {
        return "WFLYEJB0508: Failed to persist timer's state %s due to %s";
    }
    @Override
    public final void clusteredEJBsBoundToINADDRANY(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, clusteredEJBsBoundToINADDRANY$str(), arg0, arg1);
    }
    protected String clusteredEJBsBoundToINADDRANY$str() {
        return "WFLYEJB0509: Clustered Jakarta Enterprise Beans in Node: %s are bound to INADDR_ANY(%s). Either use a non-wildcard server bind address or add client-mapping entries to the relevant socket-binding for the Remoting connector";
    }
    @Override
    public final void missingRunAsAnnotation(final String arg0) {
        super.log.logf(FQCN, WARN, null, missingRunAsAnnotation$str(), arg0);
    }
    protected String missingRunAsAnnotation$str() {
        return "WFLYEJB0510: @RunAs annotation is required when using @RunAsPrincipal on class %s";
    }
    protected String cannotBuildIndexForServerInterceptor$str() {
        return "WFLYEJB0511: Cannot build reflection index for server interceptor class %s";
    }
    @Override
    public final RuntimeException cannotBuildIndexForServerInterceptor(final String arg0, final Exception arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotBuildIndexForServerInterceptor$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverInterceptorNoEmptyConstructor$str() {
        return "WFLYEJB0512: Server interceptor class %s does not have a no parameter constructor";
    }
    @Override
    public final RuntimeException serverInterceptorNoEmptyConstructor(final String arg0, final Exception arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), serverInterceptorNoEmptyConstructor$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serverInterceptorInvalidMethod$str() {
        return "WFLYEJB0513: Method %s in server interceptor %s annotated with %s has invalid signature";
    }
    @Override
    public final RuntimeException serverInterceptorInvalidMethod(final String arg0, final String arg1, final String arg2, final Exception arg3) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), serverInterceptorInvalidMethod$str(), arg0, arg1, arg2), arg3);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotLoadServerInterceptorModule$str() {
        return "WFLYEJB0514: Cannot load server interceptor module %s";
    }
    @Override
    public final RuntimeException cannotLoadServerInterceptorModule(final String arg0, final Exception arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotLoadServerInterceptorModule$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void singletonCantImplementSessionBean(final String arg0) {
        super.log.logf(FQCN, WARN, null, singletonCantImplementSessionBean$str(), arg0);
    }
    protected String singletonCantImplementSessionBean$str() {
        return "WFLYEJB0515: [Jakarta Enterprise Beans 3.2 spec, section 4.9.2] Singleton session beans are not allowed to implement 'jakarta.ejb.SessionBean' interface. This interface on bean '%s' is going to be ignored and should be removed.";
    }
    @Override
    public final void iiopBindings(final String arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, INFO, null, iiopBindings$str(), arg0, arg1, arg2);
    }
    protected String iiopBindings$str() {
        return "WFLYEJB0516: IIOP bindings for session bean named '%s' in deployment unit '%s' are as follows: %s";
    }
    @Override
    public final void typeSpecViolation(final String arg0) {
        super.log.logf(FQCN, ERROR, null, typeSpecViolation$str(), arg0);
    }
    protected String typeSpecViolation$str() {
        return "WFLYEJB0517: [Jakarta Enterprise Beans 3.2 spec, section 4.1] Spec violation for class %s. Session Jakarta Enterprise Beans should have only one of the following types : Stateful, Stateless, Singleton.";
    }
    protected String cannotResolveFilteredClass$str() {
        return "WFLYEJB0518: Exception resolving class %s for unmarshalling; it has either been blocklisted or not allowlisted";
    }
    @Override
    public final InvalidClassException cannotResolveFilteredClass(final String arg0) {
        final InvalidClassException result = new InvalidClassException(String.format(getLoggingLocale(), cannotResolveFilteredClass$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidFilterSpec$str() {
        return "WFLYEJB0519: Invalid unmarshalling filter specification %s; specifications must describe class or package name matching patterns";
    }
    @Override
    public final IllegalArgumentException invalidFilterSpec(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidFilterSpec$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingClassInAnnotation$str() {
        return "WFLYEJB0521: Some classes referenced by annotation: %s in class: %s are missing.";
    }
    @Override
    public final DeploymentUnitProcessingException missingClassInAnnotation(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), missingClassInAnnotation$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void defaultPoolExpressionCouldNotBeResolved(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, defaultPoolExpressionCouldNotBeResolved$str(), arg0, arg1);
    }
    protected String defaultPoolExpressionCouldNotBeResolved$str() {
        return "WFLYEJB0522: The default pool name %s could not be resolved from its value: %s";
    }
    @Override
    public final void timerNotDeployed(final String arg0) {
        super.log.logf(FQCN, WARN, null, timerNotDeployed$str(), arg0);
    }
    protected String timerNotDeployed$str() {
        return "WFLYEJB0523: Timer %s has not been deployed";
    }
    protected String timerCannotBeAdded$str() {
        return "WFLYEJB0524: Timer %s cannot be added";
    }
    @Override
    public final RuntimeException timerCannotBeAdded(final TimerImpl arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), timerCannotBeAdded$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void mappedNameNotSupported(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, mappedNameNotSupported$str(), arg0, arg1);
    }
    protected String mappedNameNotSupported$str() {
        return "WFLYEJB0525: The 'mappedName' in Jakarta Enterprise Beans  annotations is not supported. Value of '%s' for Jakarta Enterprise Beans '%s' will be ignored.";
    }
    protected String timerNotFound$str() {
        return "WFLYEJB0526: Timer %s does not exist";
    }
    @Override
    public final OperationFailedException timerNotFound(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), timerNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void connectorNotConfiguredForEJBClientInvocations(final String arg0, final int arg1) {
        super.log.logf(FQCN, ERROR, null, connectorNotConfiguredForEJBClientInvocations$str(), arg0, arg1);
    }
    protected String connectorNotConfiguredForEJBClientInvocations$str() {
        return "WFLYEJB0527: Remoting connector (address %s, port %s) is not correctly configured for EJB client invocations, the connector must be listed in <remote/> 'connectors' attribute to receive EJB client invocations";
    }
    @Override
    public final void ejbBusinessMethodMustBePublic(final Method arg0) {
        super.log.logf(FQCN, DEBUG, null, ejbBusinessMethodMustBePublic$str(), arg0);
    }
    protected String ejbBusinessMethodMustBePublic$str() {
        return "WFLYEJB0528: Jakarta Enterprise Beans business method %s must be public";
    }
    @Override
    public final void failedToRetrieveTimerInfo(final TimerImpl arg0, final Exception arg1) {
        super.log.logf(FQCN, WARN, arg1, failedToRetrieveTimerInfo$str(), arg0);
    }
    protected String failedToRetrieveTimerInfo$str() {
        return "WFLYEJB0529: Failed to retrieve info from database for timer: %s";
    }
    protected String legacySecurityUnsupported$str() {
        return "WFLYEJB0530: The deployment is configured to use a legacy security domain '%s' which is no longer supported.";
    }
    @Override
    public final IllegalStateException legacySecurityUnsupported(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), legacySecurityUnsupported$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void legacyClientMappingsRegistryProviderInUse(final String arg0) {
        super.log.logf(FQCN, WARN, null, legacyClientMappingsRegistryProviderInUse$str(), arg0);
    }
    protected String legacyClientMappingsRegistryProviderInUse$str() {
        return "WFLYEJB0531: No client mappings registry provider found for %s; using legacy provider based on static configuration";
    }
    @Override
    public final void unknownDatabaseName(final String arg0) {
        super.log.logf(FQCN, WARN, null, unknownDatabaseName$str(), arg0);
    }
    protected String unknownDatabaseName$str() {
        return "WFLYEJB0532: Database detected from configuration is: '%s'. If this is incorrect, please specify the correct database.";
    }
    protected String invocationFailed0$str() {
        return "WFLYEJB0533: Invocation failed";
    }
    @Override
    public final RemoteException invocationFailed(final Exception arg0) {
        final RemoteException result = new RemoteException(String.format(getLoggingLocale(), invocationFailed0$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String authenticationFailed$str() {
        return "WFLYEJB0534: Authentication failed";
    }
    @Override
    public final SecurityException authenticationFailed() {
        final SecurityException result = new SecurityException(String.format(getLoggingLocale(), authenticationFailed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String messageEndpointAlreadyReleasedISE$str() {
        return "WFLYEJB0535: Message endpoint %s has already been released";
    }
    @Override
    public final IllegalStateException messageEndpointAlreadyReleasedISE(final MessageEndpoint arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), messageEndpointAlreadyReleasedISE$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedEJBReceiverProtocol$str() {
        return "WFLYEJB0536: Unsupported EJB receiver protocol %s";
    }
    @Override
    public final IllegalArgumentException unsupportedEJBReceiverProtocol(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unsupportedEJBReceiverProtocol$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
