package org.jboss.as.connector.logging;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import org.jboss.vfs.VirtualFile;
import org.jboss.modules.ModuleLoadException;
import java.lang.IllegalStateException;
import java.io.Serializable;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.jca.core.spi.rar.NotFoundException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.lang.NoSuchMethodException;
import org.jboss.as.controller.PathElement;
import org.jboss.logging.BasicLogger;
import org.jboss.msc.service.StartException;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;
import javax.annotation.processing.Generated;
import org.jboss.jca.deployers.common.DeployException;
import org.jboss.as.controller.OperationFailedException;
import java.lang.SecurityException;
import java.lang.Exception;
import javax.security.auth.Subject;
import javax.xml.stream.XMLStreamException;
import org.jboss.as.controller.PathAddress;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import java.util.Arrays;
import org.jboss.dmr.ModelNode;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:08+0200")
public class ConnectorLogger_$logger extends DelegatingBasicLogger implements ConnectorLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ConnectorLogger_$logger.class.getName();
    public ConnectorLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void boundDataSource(final String arg0) {
        super.log.logf(FQCN, INFO, null, boundDataSource$str(), arg0);
    }
    protected String boundDataSource$str() {
        return "WFLYJCA0001: Bound data source [%s]";
    }
    @Override
    public final void boundJca(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, boundJca$str(), arg0, arg1);
    }
    protected String boundJca$str() {
        return "WFLYJCA0002: Bound Jakarta Connectors %s [%s]";
    }
    @Override
    public final void cannotInstantiateDriverClass(final String arg0, final Throwable arg1) {
        super.log.logf(FQCN, WARN, null, cannotInstantiateDriverClass2$str(), arg0, arg1);
    }
    protected String cannotInstantiateDriverClass2$str() {
        return "WFLYJCA0003: Unable to instantiate driver class \"%s\": %s";
    }
    @Override
    public final void deployingCompliantJdbcDriver(final Class<? extends java.sql.Driver> arg0, final int arg1, final int arg2) {
        super.log.logf(FQCN, INFO, null, deployingCompliantJdbcDriver$str(), arg0, arg1, arg2);
    }
    protected String deployingCompliantJdbcDriver$str() {
        return "WFLYJCA0004: Deploying JDBC-compliant driver %s (version %d.%d)";
    }
    @Override
    public final void deployingNonCompliantJdbcDriver(final Class<? extends java.sql.Driver> arg0, final int arg1, final int arg2) {
        super.log.logf(FQCN, INFO, null, deployingNonCompliantJdbcDriver$str(), arg0, arg1, arg2);
    }
    protected String deployingNonCompliantJdbcDriver$str() {
        return "WFLYJCA0005: Deploying non-JDBC-compliant driver %s (version %d.%d)";
    }
    @Override
    public final void registeredAdminObject(final String arg0) {
        super.log.logf(FQCN, INFO, null, registeredAdminObject$str(), arg0);
    }
    protected String registeredAdminObject$str() {
        return "WFLYJCA0006: Registered admin object at %s";
    }
    @Override
    public final void registeredConnectionFactory(final String arg0) {
        super.log.logf(FQCN, INFO, null, registeredConnectionFactory$str(), arg0);
    }
    protected String registeredConnectionFactory$str() {
        return "WFLYJCA0007: Registered connection factory %s";
    }
    @Override
    public final void startingSubsystem(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, startingSubsystem$str(), arg0, arg1);
    }
    protected String startingSubsystem$str() {
        return "WFLYJCA0009: Starting %s Subsystem (%s)";
    }
    @Override
    public final void unboundDataSource(final String arg0) {
        super.log.logf(FQCN, INFO, null, unboundDataSource$str(), arg0);
    }
    protected String unboundDataSource$str() {
        return "WFLYJCA0010: Unbound data source [%s]";
    }
    @Override
    public final void unboundJca(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, unboundJca$str(), arg0, arg1);
    }
    protected String unboundJca$str() {
        return "WFLYJCA0011: Unbound Jakarta Connectors %s [%s]";
    }
    @Override
    public final void driversElementNotSupported(final String arg0) {
        super.log.logf(FQCN, WARN, null, driversElementNotSupported$str(), arg0);
    }
    protected String driversElementNotSupported$str() {
        return "WFLYJCA0012: <drivers/> in standalone -ds.xml deployments aren't supported: Ignoring %s";
    }
    protected String driverNameAndResourceNameNotEquals$str() {
        return "WFLYJCA0015: the attribute driver-name (%s) cannot be different from driver resource name (%s)";
    }
    @Override
    public final OperationFailedException driverNameAndResourceNameNotEquals(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), driverNameAndResourceNameNotEquals$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void methodNotFoundOnDataSource(final String arg0, final Class<?> arg1) {
        super.log.logf(FQCN, WARN, null, methodNotFoundOnDataSource$str(), arg0, arg1);
    }
    protected String methodNotFoundOnDataSource$str() {
        return "WFLYJCA0016: Method %s on DataSource class %s not found. Ignoring";
    }
    @Override
    public final void forceIJToNull() {
        super.log.logf(FQCN, DEBUG, null, forceIJToNull$str());
    }
    protected String forceIJToNull$str() {
        return "WFLYJCA0017: Forcing ironjacamar.xml descriptor to null";
    }
    @Override
    public final void startedDriverService(final String arg0) {
        super.log.logf(FQCN, INFO, null, startedDriverService$str(), arg0);
    }
    protected String startedDriverService$str() {
        return "WFLYJCA0018: Started Driver service with driver-name = %s";
    }
    @Override
    public final void stoppedDriverService(final String arg0) {
        super.log.logf(FQCN, INFO, null, stoppedDriverService$str(), arg0);
    }
    protected String stoppedDriverService$str() {
        return "WFLYJCA0019: Stopped Driver service with driver-name = %s";
    }
    @Override
    public final void unsupportedSelectorOption(final String arg0) {
        super.log.logf(FQCN, WARN, null, unsupportedSelectorOption$str(), arg0);
    }
    protected String unsupportedSelectorOption$str() {
        return "WFLYJCA0020: Unsupported selector's option: %s";
    }
    @Override
    public final void unsupportedPolicyOption(final String arg0) {
        super.log.logf(FQCN, WARN, null, unsupportedPolicyOption$str(), arg0);
    }
    protected String unsupportedPolicyOption$str() {
        return "WFLYJCA0021: Unsupported policy's option: %s";
    }
    protected String failedToStartJGroupsChannel$str() {
        return "WFLYJCA0022: Failed to start JGroups channel %s for distributed workmanager %s";
    }
    @Override
    public final StartException failedToStartJGroupsChannel(final String arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToStartJGroupsChannel$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToFindDistributedWorkManager$str() {
        return "WFLYJCA0023: Cannot find WorkManager %s or it isn't a distributed workmanager. Only DWM can override configurations";
    }
    @Override
    public final OperationFailedException failedToFindDistributedWorkManager(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), failedToFindDistributedWorkManager$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToStartDWMTransport$str() {
        return "WFLYJCA0024: Failed to start JGroups transport for distributed workmanager %s";
    }
    @Override
    public final StartException failedToStartDWMTransport(final String arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToStartDWMTransport$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedSelector$str() {
        return "WFLYJCA0025: Unsupported selector's option: %s";
    }
    @Override
    public final OperationFailedException unsupportedSelector(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unsupportedSelector$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedPolicy$str() {
        return "WFLYJCA0026: Unsupported policy's option: %s";
    }
    @Override
    public final OperationFailedException unsupportedPolicy(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unsupportedPolicy$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void noSecurityDefined(final String arg0) {
        super.log.logf(FQCN, WARN, null, noSecurityDefined$str(), arg0);
    }
    protected String noSecurityDefined$str() {
        return "WFLYJCA0027: No ironjacamar.security defined for %s";
    }
    @Override
    public final void connectionFactoryAnnotation(final String arg0) {
        super.log.logf(FQCN, WARN, null, connectionFactoryAnnotation$str(), arg0);
    }
    protected String connectionFactoryAnnotation$str() {
        return "WFLYJCA0028: @ConnectionFactoryDefinition will have limited management: %s";
    }
    @Override
    public final void adminObjectAnnotation(final String arg0) {
        super.log.logf(FQCN, WARN, null, adminObjectAnnotation$str(), arg0);
    }
    protected String adminObjectAnnotation$str() {
        return "WFLYJCA0029: @AdministeredObjectDefinition will have limited management: %s";
    }
    protected String cannotDeploy$str() {
        return "WFLYJCA0030: unable to deploy";
    }
    @Override
    public final DeployException cannotDeploy(final Throwable arg0) {
        final DeployException result = new DeployException(String.format(getLoggingLocale(), cannotDeploy$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotDeployAndValidate$str() {
        return "WFLYJCA0031: unable to validate and deploy ds or xads";
    }
    @Override
    public final DeployException cannotDeployAndValidate(final Throwable arg0) {
        final DeployException result = new DeployException(String.format(getLoggingLocale(), cannotDeployAndValidate$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String deploymentError$str() {
        return "WFLYJCA0033: Error during the deployment of %s";
    }
    @Override
    public final StartException deploymentError(final Throwable arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), deploymentError$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInstantiateDriverClass1$str() {
        return "WFLYJCA0034: Unable to instantiate driver class \"%s\". See log (WARN) for more details";
    }
    @Override
    public final String cannotInstantiateDriverClass(final String arg0) {
        return String.format(getLoggingLocale(), cannotInstantiateDriverClass1$str(), arg0);
    }
    protected String driverVersionMismatch$str() {
        return "WFLYJCA0035: Specified driver version doesn't match with actual driver version";
    }
    @Override
    public final IllegalStateException driverVersionMismatch() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), driverVersionMismatch$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToCreate$str() {
        return "WFLYJCA0036: Failed to create %s instance for [%s]%n reason: %s";
    }
    @Override
    public final String failedToCreate(final String arg0, final ModelNode arg1, final String arg2) {
        return String.format(getLoggingLocale(), failedToCreate$str(), arg0, arg1, arg2);
    }
    protected String failedToGetMetrics$str() {
        return "WFLYJCA0037: failed to get metrics: %s";
    }
    @Override
    public final String failedToGetMetrics(final String arg0) {
        return String.format(getLoggingLocale(), failedToGetMetrics$str(), arg0);
    }
    protected String failedToGetUrlDelimiter$str() {
        return "WFLYJCA0039: failed to get url delimiter";
    }
    @Override
    public final DeployException failedToGetUrlDelimiter(final Throwable arg0) {
        final DeployException result = new DeployException(String.format(getLoggingLocale(), failedToGetUrlDelimiter$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToInvokeOperation$str() {
        return "WFLYJCA0040: failed to invoke operation: %s";
    }
    @Override
    public final String failedToInvokeOperation(final String arg0) {
        return String.format(getLoggingLocale(), failedToInvokeOperation$str(), arg0);
    }
    protected String failedToLoadModuleDriver$str() {
        return "WFLYJCA0041: Failed to load driver module [%s]. %s, cause of failure [%s]";
    }
    @Override
    public final String failedToLoadModuleDriver(final String arg0, final String arg1, final String arg2) {
        return String.format(getLoggingLocale(), failedToLoadModuleDriver$str(), arg0, arg1, arg2);
    }
    protected String failedToMatchPool$str() {
        return "WFLYJCA0042: failed to match pool. Check JndiName: %s";
    }
    @Override
    public final IllegalArgumentException failedToMatchPool(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), failedToMatchPool$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParseServiceXml$str() {
        return "WFLYJCA0043: Failed to parse service xml [%s]";
    }
    @Override
    public final DeploymentUnitProcessingException failedToParseServiceXml(final VirtualFile arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToParseServiceXml$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final DeploymentUnitProcessingException failedToParseServiceXml(final Throwable arg0, final VirtualFile arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToParseServiceXml$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToProcessRaChild$str() {
        return "WFLYJCA0044: Failed to process RA child archives for [%s]";
    }
    @Override
    public final DeploymentUnitProcessingException failedToProcessRaChild(final Throwable arg0, final VirtualFile arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToProcessRaChild$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToSetAttribute$str() {
        return "WFLYJCA0045: failed to set attribute: %s";
    }
    @Override
    public final String failedToSetAttribute(final String arg0) {
        return String.format(getLoggingLocale(), failedToSetAttribute$str(), arg0);
    }
    protected String failedToStartRaDeployment$str() {
        return "WFLYJCA0046: Failed to start RA deployment [%s]";
    }
    @Override
    public final StartException failedToStartRaDeployment(final Throwable arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToStartRaDeployment$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidConnection$str() {
        return "WFLYJCA0047: Connection is not valid";
    }
    @Override
    public final IllegalStateException invalidConnection(final Exception arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidConnection$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jndiBindingsNotSupported$str() {
        return "WFLYJCA0049: Non-explicit JNDI bindings not supported";
    }
    @Override
    public final IllegalStateException jndiBindingsNotSupported() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), jndiBindingsNotSupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noMetricsAvailable$str() {
        return "WFLYJCA0050: no metrics available";
    }
    @Override
    public final String noMetricsAvailable() {
        return String.format(getLoggingLocale(), noMetricsAvailable$str());
    }
    protected String notAnAnnotation$str() {
        return "WFLYJCA0051: %s should be an annotation";
    }
    @Override
    public final IllegalArgumentException notAnAnnotation(final Class<?> arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notAnAnnotation$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullVar$str() {
        return "WFLYJCA0052: %s is null";
    }
    @Override
    public final String nullVar(final String arg0) {
        return String.format(getLoggingLocale(), nullVar$str(), arg0);
    }
    protected String serviceAlreadyStarted$str() {
        return "WFLYJCA0053: %s service [%s] is already started";
    }
    @Override
    public final String serviceAlreadyStarted(final String arg0, final Object arg1) {
        return String.format(getLoggingLocale(), serviceAlreadyStarted$str(), arg0, arg1);
    }
    protected String serviceNotAvailable$str() {
        return "WFLYJCA0054: %s service [%s] is not available";
    }
    @Override
    public final String serviceNotAvailable(final String arg0, final Object arg1) {
        return String.format(getLoggingLocale(), serviceNotAvailable$str(), arg0, arg1);
    }
    protected String serviceNotStarted$str() {
        return "WFLYJCA0056: Service not started";
    }
    @Override
    public final IllegalStateException serviceNotStarted() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serviceNotStarted$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String undefinedVar$str() {
        return "WFLYJCA0058: %s is undefined";
    }
    @Override
    public final IllegalArgumentException undefinedVar(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), undefinedVar$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLoadNativeLibraries$str() {
        return "WFLYJCA0061: Failed to load native libraries";
    }
    @Override
    public final DeploymentUnitProcessingException failedToLoadNativeLibraries(final Throwable arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToLoadNativeLibraries$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String exceptionDeployingDatasource$str() {
        return "WFLYJCA0064: Exception deploying datasource %s";
    }
    @Override
    public final DeploymentUnitProcessingException exceptionDeployingDatasource(final Throwable arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), exceptionDeployingDatasource$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noDataSourceRegisteredForAddress$str() {
        return "WFLYJCA0065: No DataSource exists at address %s";
    }
    @Override
    public final String noDataSourceRegisteredForAddress(final PathAddress arg0) {
        return String.format(getLoggingLocale(), noDataSourceRegisteredForAddress$str(), arg0);
    }
    protected String unknownAttribute$str() {
        return "WFLYJCA0066: Unknown attribute %s";
    }
    @Override
    public final IllegalStateException unknownAttribute(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unknownAttribute$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownOperation$str() {
        return "WFLYJCA0067: Unknown operation %s";
    }
    @Override
    public final IllegalStateException unknownOperation(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unknownOperation$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String xaDataSourcePropertiesNotPresent$str() {
        return "WFLYJCA0069: At least one xa-datasource-property is required for an xa-datasource";
    }
    @Override
    public final OperationFailedException xaDataSourcePropertiesNotPresent() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), xaDataSourcePropertiesNotPresent$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String deploymentFailed$str() {
        return "WFLYJCA0072: Deployment %s failed";
    }
    @Override
    public final DeployException deploymentFailed(final Throwable arg0, final String arg1) {
        final DeployException result = new DeployException(String.format(getLoggingLocale(), deploymentFailed$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToLoadModuleRA$str() {
        return "WFLYJCA0073: Failed to load module for RA [%s] Cause: %s";
    }
    @Override
    public final String failedToLoadModuleRA(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), failedToLoadModuleRA$str(), arg0, arg1);
    }
    protected String noSuchMethod$str() {
        return "WFLYJCA0074: Method %s not found";
    }
    @Override
    public final NoSuchMethodException noSuchMethod(final String arg0) {
        final NoSuchMethodException result = new NoSuchMethodException(String.format(getLoggingLocale(), noSuchMethod$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noSuchField$str() {
        return "WFLYJCA0075: Field %s not found";
    }
    @Override
    public final NoSuchMethodException noSuchField(final String arg0) {
        final NoSuchMethodException result = new NoSuchMethodException(String.format(getLoggingLocale(), noSuchField$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noPropertyResolution$str() {
        return "WFLYJCA0076: Unknown property resolution for property %s";
    }
    @Override
    public final IllegalArgumentException noPropertyResolution(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noPropertyResolution$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String archiveOrModuleRequired$str() {
        return "WFLYJCA0077: At least one of ARCHIVE or MODULE is required";
    }
    @Override
    public final OperationFailedException archiveOrModuleRequired() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), archiveOrModuleRequired$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String compressedRarNotSupportedInModuleRA$str() {
        return "WFLYJCA0078: Rar are supported only in uncompressed form. Failed to load module for RA [%s]";
    }
    @Override
    public final String compressedRarNotSupportedInModuleRA(final String arg0) {
        return String.format(getLoggingLocale(), compressedRarNotSupportedInModuleRA$str(), arg0);
    }
    protected String FailedDeployDriverNotSpecified$str() {
        return "WFLYJCA0079: Failed to deploy datasource %s because driver is not specified";
    }
    @Override
    public final DeploymentUnitProcessingException FailedDeployDriverNotSpecified(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), FailedDeployDriverNotSpecified$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String RARNotYetDeployed$str() {
        return "WFLYJCA0080: RAR '%s' not yet deployed.";
    }
    @Override
    public final OperationFailedException RARNotYetDeployed(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), RARNotYetDeployed$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidConnectionFactory$str() {
        return "WFLYJCA0083: Connection factory interface (%s) is incorrect for resource adapter '%s' while deploying %s";
    }
    @Override
    public final DeploymentUnitProcessingException invalidConnectionFactory(final String arg0, final String arg1, final String arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), invalidConnectionFactory$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String adminObjectForJCA10$str() {
        return "WFLYJCA0084: Admin object declared for JCA 1.0 resource adapter '%s' while deploying %s";
    }
    @Override
    public final DeploymentUnitProcessingException adminObjectForJCA10(final String arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), adminObjectForJCA10$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidAdminObject$str() {
        return "WFLYJCA0085: Admin object class (%s) is incorrect for resource adapter '%s' while deploying %s";
    }
    @Override
    public final DeploymentUnitProcessingException invalidAdminObject(final String arg0, final String arg1, final String arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), invalidAdminObject$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void cannotFindDriverClassName(final String arg0) {
        super.log.logf(FQCN, WARN, null, cannotFindDriverClassName$str(), arg0);
    }
    protected String cannotFindDriverClassName$str() {
        return "WFLYJCA0086: Unable to find driver class name in \"%s\" jar";
    }
    @Override
    public final void unableToRegisterRecovery(final String arg0, final boolean arg1) {
        super.log.logf(FQCN, ERROR, null, unableToRegisterRecovery$str(), arg0, arg1);
    }
    protected String unableToRegisterRecovery$str() {
        return "WFLYJCA0087: Unable to register recovery: %s (%s)";
    }
    protected String rejectAttributesMustBeTrue$str() {
        return "WFLYJCA0088: Attributes %s rejected. Must be true";
    }
    @Override
    public final String rejectAttributesMustBeTrue(final Set<String> arg0) {
        return String.format(getLoggingLocale(), rejectAttributesMustBeTrue$str(), arg0);
    }
    @Override
    public final void exceptionDuringUnregistering(final NotFoundException arg0) {
        super.log.logf(FQCN, WARN, arg0, exceptionDuringUnregistering$str());
    }
    protected String exceptionDuringUnregistering$str() {
        return "WFLYJCA0089: Exception during unregistering deployment";
    }
    protected String jndiNameShouldValidate$str() {
        return "WFLYJCA0090: Jndi name shouldn't include '//' or end with '/'";
    }
    @Override
    public final OperationFailedException jndiNameShouldValidate() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), jndiNameShouldValidate$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void deprecated() {
        super.log.logf(FQCN, WARN, null, deprecated$str());
    }
    protected String deprecated$str() {
        return "WFLYJCA0091: -ds.xml file deployments are deprecated. Support may be removed in a future version.";
    }
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYJCA0092: Indexed child resources can only be registered if the parent resource supports ordered children. The parent of '%s' is not indexed";
    }
    @Override
    public final IllegalStateException indexedChildResourceRegistrationNotAvailable(final PathElement arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), indexedChildResourceRegistrationNotAvailable$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void legacyDisableEnableOperation(final String arg0) {
        super.log.logf(FQCN, INFO, null, legacyDisableEnableOperation$str(), arg0);
    }
    protected String legacyDisableEnableOperation$str() {
        return "WFLYJCA0093: The '%s' operation is deprecated. Use of the 'add' or 'remove' operations is preferred, or if required the 'write-attribute' operation can used to set the deprecated 'enabled' attribute";
    }
    @Override
    public final void errorDuringRecoveryShutdown(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, errorDuringRecoveryShutdown$str());
    }
    protected String errorDuringRecoveryShutdown$str() {
        return "WFLYJCA0096: Error during recovery shutdown";
    }
    @Override
    public final void errorStoppingRA(final Throwable arg0) {
        super.log.logf(FQCN, WARN, arg0, errorStoppingRA$str());
    }
    protected String errorStoppingRA$str() {
        return "WFLYJCA0097: Exception while stopping resource adapter";
    }
    @Override
    public final void boundNonJTADataSource(final String arg0) {
        super.log.logf(FQCN, INFO, null, boundNonJTADataSource$str(), arg0);
    }
    protected String boundNonJTADataSource$str() {
        return "WFLYJCA0098: Bound non-transactional data source: %s";
    }
    @Override
    public final void unBoundNonJTADataSource(final String arg0) {
        super.log.logf(FQCN, INFO, null, unBoundNonJTADataSource$str(), arg0);
    }
    protected String unBoundNonJTADataSource$str() {
        return "WFLYJCA0099: Unbound non-transactional data source: %s";
    }
    protected String noSupportedOperation$str() {
        return "WFLYJCA0100: Operation %s is not supported";
    }
    @Override
    public final UnsupportedOperationException noSupportedOperation(final String arg0) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), noSupportedOperation$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String oneThreadPoolWorkManager$str() {
        return "WFLYJCA0101: Thread pool: %s(type: %s) can not be added for workmanager: %s, only one thread pool is allowed for each type.";
    }
    @Override
    public final OperationFailedException oneThreadPoolWorkManager(final String arg0, final String arg1, final String arg2) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), oneThreadPoolWorkManager$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String attributeRequiresTrueAttribute$str() {
        return "WFLYJCA0102: Attribute %s can only be defined if %s is true";
    }
    @Override
    public final OperationFailedException attributeRequiresTrueAttribute(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), attributeRequiresTrueAttribute$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String attributeRequiresFalseOrUndefinedAttribute$str() {
        return "WFLYJCA0103: Attribute %s can only be defined if %s is undefined or false";
    }
    @Override
    public final OperationFailedException attributeRequiresFalseOrUndefinedAttribute(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), attributeRequiresFalseOrUndefinedAttribute$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String subject$str() {
        return "WFLYJCA0104: Subject=%s\nSubject identity=%s";
    }
    @Override
    public final String subject(final Subject arg0, final String arg1) {
        return String.format(getLoggingLocale(), subject$str(), arg0, arg1);
    }
    @Override
    public final void elytronHandlerHandle(final String arg0) {
        super.log.logf(FQCN, INFO, null, elytronHandlerHandle$str(), arg0);
    }
    protected String elytronHandlerHandle$str() {
        return "WFLYJCA0106: Elytron handler handle: %s";
    }
    protected String executionSubjectNotSetInHandler$str() {
        return "WFLYJCA0107: Execution subject was not provided to the callback handler";
    }
    @Override
    public final SecurityException executionSubjectNotSetInHandler() {
        final SecurityException result = new SecurityException(String.format(getLoggingLocale(), executionSubjectNotSetInHandler$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidCallbackSecurityDomain$str() {
        return "WFLYJCA0108: Supplied callback doesn't contain a security domain reference";
    }
    @Override
    public final IllegalArgumentException invalidCallbackSecurityDomain() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidCallbackSecurityDomain$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedCreateCallbackHandlerMethod$str() {
        return "WFLYJCA0109: Callback with security domain is required - use createCallbackHandler(Callback callback) instead";
    }
    @Override
    public final UnsupportedOperationException unsupportedCreateCallbackHandlerMethod() {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), unsupportedCreateCallbackHandlerMethod$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidCredentialSourceSupplier$str() {
        return "WFLYJCA0110: CredentialSourceSupplier is invalid for DSSecurity";
    }
    @Override
    public final IllegalStateException invalidCredentialSourceSupplier(final Throwable arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidCredentialSourceSupplier$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidElytronWorkManagerSetting$str() {
        return "WFLYJCA0111: WorkManager hasn't elytron-enabled flag set accordingly with RA one";
    }
    @Override
    public final IllegalStateException invalidElytronWorkManagerSetting() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidElytronWorkManagerSetting$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String datasourceIsDisabled$str() {
        return "WFLYJCA0112: Datasource %s is disabled";
    }
    @Override
    public final IllegalArgumentException datasourceIsDisabled(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), datasourceIsDisabled$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void unexceptedWorkerCompletionError(final String arg0, final Throwable arg1) {
        super.log.logf(FQCN, ERROR, arg1, unexceptedWorkerCompletionError$str(), arg0);
    }
    protected String unexceptedWorkerCompletionError$str() {
        return "WFLYJCA0113: Unexcepted error during worker execution : %s";
    }
    protected String failedToLoadDataSourceClass$str() {
        return "WFLYJCA0114: Failed to load datasource class: %s";
    }
    @Override
    public final OperationFailedException failedToLoadDataSourceClass(final String arg0, final Throwable arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), failedToLoadDataSourceClass$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingDependencyInModuleDriver$str() {
        return "WFLYJCA0115: Module for driver [%s] or one of it dependencies is missing: [%s]";
    }
    @Override
    public final String missingDependencyInModuleDriver(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), missingDependencyInModuleDriver$str(), arg0, arg1);
    }
    protected String raModuleNotFound$str() {
        return "WFLYJCA0116: Failed to load module for RA [%s] - the module or one of its dependencies is missing [%s]";
    }
    @Override
    public final String raModuleNotFound(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), raModuleNotFound$str(), arg0, arg1);
    }
    protected String notAValidDataSourceClass$str() {
        return "WFLYJCA0117: %s is not a valid %s implementation";
    }
    @Override
    public final OperationFailedException notAValidDataSourceClass(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), notAValidDataSourceClass$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void bindingAlias(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, bindingAlias$str(), arg0, arg1);
    }
    protected String bindingAlias$str() {
        return "WFLYJCA0118: Binding connection factory named %s to alias %s";
    }
    @Override
    public final void unbindingAlias(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, unbindingAlias$str(), arg0, arg1);
    }
    protected String unbindingAlias$str() {
        return "WFLYJCA0119: Unbinding connection factory named %s to alias %s";
    }
    protected String cannotStartDSNoConnectionFactory$str() {
        return "WFLYJCA0120: Unable to start the data source '%s' because there are no connection factories, either not defined or failed, please check log.";
    }
    @Override
    public final StartException cannotStartDSNoConnectionFactory(final String arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), cannotStartDSNoConnectionFactory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotStartDSTooManyConnectionFactories$str() {
        return "WFLYJCA0121: Unable to start the data source '%s' because there is more than one(%s) connection factory defined.";
    }
    @Override
    public final StartException cannotStartDSTooManyConnectionFactories(final String arg0, final int arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), cannotStartDSTooManyConnectionFactories$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String threadPoolNameMustMatchWorkManagerName$str() {
        return "WFLYJCA0122: Thread pool name %s(type: %s) must match the workmanager name %s.";
    }
    @Override
    public final OperationFailedException threadPoolNameMustMatchWorkManagerName(final String arg0, final String arg1, final String arg2) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), threadPoolNameMustMatchWorkManagerName$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String legacySecurityNotAvailable2$str() {
        return "WFLYJCA0123: Connection definition %s from resource adapter %s is configured to require the legacy security subsystem, which is not present";
    }
    @Override
    public final OperationFailedException legacySecurityNotAvailable(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), legacySecurityNotAvailable2$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String legacySecurityNotAvailable1$str() {
        return "WFLYJCA0124: Datasource %s is configured to require the legacy security subsystem, which is not present";
    }
    @Override
    public final OperationFailedException legacySecurityNotAvailable(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), legacySecurityNotAvailable1$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String legacySecurityNotAvailableForDsXml$str() {
        return "WFLYJCA0125: Datasource %s is configured to require the legacy security subsystem, which is not present";
    }
    @Override
    public final DeploymentUnitProcessingException legacySecurityNotAvailableForDsXml(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), legacySecurityNotAvailableForDsXml$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String legacySecurityNotAvailableForRa$str() {
        return "WFLYJCA0126: Connection definition for %s is configured to require the legacy security subsystem, which is not present";
    }
    @Override
    public final DeploymentUnitProcessingException legacySecurityNotAvailableForRa(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), legacySecurityNotAvailableForRa$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String legacySecurityNotAvailableForConnectionFactory$str() {
        return "WFLYJCA0127: Connection factory  %s is configured to require the legacy security subsystem, which is not present";
    }
    @Override
    public final IllegalStateException legacySecurityNotAvailableForConnectionFactory(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), legacySecurityNotAvailableForConnectionFactory$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String legacySecurityNotAvailable0$str() {
        return "WFLYJCA0128: Legacy security is not available";
    }
    @Override
    public final IllegalStateException legacySecurityNotAvailable() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), legacySecurityNotAvailable0$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String wrongModuleName$str() {
        return "WFLYJCA0129: Wrong module name %s";
    }
    @Override
    public final OperationFailedException wrongModuleName(final ModuleLoadException arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), wrongModuleName$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String reportDirectoryDoesNotExist$str() {
        return "WFLYJCA0130: Report directory %s does not exist";
    }
    @Override
    public final OperationFailedException reportDirectoryDoesNotExist(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), reportDirectoryDoesNotExist$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String legacySecurityAttributeNotSupported$str() {
        return "WFLYJCA0131: Legacy security attribute %s is no longer supported. Please use Elytron configuration instead";
    }
    @Override
    public final OperationFailedException legacySecurityAttributeNotSupported(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), legacySecurityAttributeNotSupported$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String legacySecurityNotSupported$str() {
        return "WFLYJCA0132: Legacy security is no longer supported. Please use Elytron configuration instead";
    }
    @Override
    public final String legacySecurityNotSupported() {
        return String.format(getLoggingLocale(), legacySecurityNotSupported$str());
    }
    protected String authorizationFailed$str() {
        return "WFLYJCA0133: Authorization failed";
    }
    @Override
    public final SecurityException authorizationFailed() {
        final SecurityException result = new SecurityException(String.format(getLoggingLocale(), authorizationFailed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nameAttributeIsMandatory$str() {
        return "WFLYJCA0134: name attribute is mandatory for workmanager element";
    }
    @Override
    public final XMLStreamException nameAttributeIsMandatory() {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), nameAttributeIsMandatory$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jdbcDriverNotInstalled$str() {
        return "WFLYJCA0135: The jdbc driver: %s is not installed";
    }
    @Override
    public final OperationFailedException jdbcDriverNotInstalled(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), jdbcDriverNotInstalled$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String raXmlNotFound$str() {
        return "WFLYJCA0136: The %s module does not export a META-INF/ra.xml file.";
    }
    @Override
    public final String raXmlNotFound(final String arg0) {
        return String.format(getLoggingLocale(), raXmlNotFound$str(), arg0);
    }
}
