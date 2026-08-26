package org.wildfly.extension.datasources.agroal.logging;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.sql.SQLException;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import org.jboss.logging.Logger;
import io.agroal.api.AgroalDataSource.FlushMode;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import org.jboss.msc.service.StartException;
import java.util.Arrays;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:11+0200")
public class AgroalLogger_$logger extends DelegatingBasicLogger implements AgroalLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = AgroalLogger_$logger.class.getName();
    public AgroalLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void addingDeploymentProcessors() {
        super.log.logf(FQCN, INFO, null, addingDeploymentProcessors$str());
    }
    protected String addingDeploymentProcessors$str() {
        return "WFLYAG0001: Adding deployment processors for DataSourceDefinition annotation and resource-ref entries";
    }
    @Override
    public final void startedDataSource(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, startedDataSource$str(), arg0, arg1);
    }
    protected String startedDataSource$str() {
        return "WFLYAG0101: Started datasource '%s' bound to [%s]";
    }
    @Override
    public final void stoppedDataSource(final String arg0) {
        super.log.logf(FQCN, INFO, null, stoppedDataSource$str(), arg0);
    }
    protected String stoppedDataSource$str() {
        return "WFLYAG0102: Stopped datasource '%s'";
    }
    @Override
    public final void startedXADataSource(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, startedXADataSource$str(), arg0, arg1);
    }
    protected String startedXADataSource$str() {
        return "WFLYAG0103: Started xa-datasource '%s' bound to [%s]";
    }
    @Override
    public final void stoppedXADataSource(final String arg0) {
        super.log.logf(FQCN, INFO, null, stoppedXADataSource$str(), arg0);
    }
    protected String stoppedXADataSource$str() {
        return "WFLYAG0104: Stopped xa-datasource '%s'";
    }
    protected String datasourceStartException$str() {
        return "WFLYAG0105: Exception starting datasource '%s'";
    }
    @Override
    public final StartException datasourceStartException(final SQLException arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), datasourceStartException$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String xaDatasourceStartException$str() {
        return "WFLYAG0106: Exception starting xa-datasource '%s'";
    }
    @Override
    public final StartException xaDatasourceStartException(final SQLException arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), xaDatasourceStartException$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidConnectionProvider$str() {
        return "WFLYAG0107: Invalid connection provider. Either a java.sql.Driver or javax.sql.DataSource implementation is required. Fix the connection-provider for the driver";
    }
    @Override
    public final StartException invalidConnectionProvider() {
        final StartException result = new StartException(String.format(getLoggingLocale(), invalidConnectionProvider$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidXAConnectionProvider$str() {
        return "WFLYAG0108: An xa-datasource requires a javax.sql.XADataSource as connection provider. Fix the connection-provider for the driver";
    }
    @Override
    public final StartException invalidXAConnectionProvider() {
        final StartException result = new StartException(String.format(getLoggingLocale(), invalidXAConnectionProvider$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingTransactionManager$str() {
        return "WFLYAG0109: Could not start datasource: transaction manager is missing";
    }
    @Override
    public final StartException missingTransactionManager() {
        final StartException result = new StartException(String.format(getLoggingLocale(), missingTransactionManager$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidAuthentication$str() {
        return "WFLYAG0110: Error obtaining credentials from authentication context for datasource '%s'";
    }
    @Override
    public final StartException invalidAuthentication(final Throwable arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), invalidAuthentication$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidCredentialSourceSupplier$str() {
        return "WFLYAG0111: CredentialSourceSupplier for datasource '%s' is invalid";
    }
    @Override
    public final StartException invalidCredentialSourceSupplier(final Throwable arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), invalidCredentialSourceSupplier$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void flushOperation(final FlushMode arg0) {
        super.log.logf(FQCN, INFO, null, flushOperation$str(), arg0);
    }
    protected String flushOperation$str() {
        return "WFLYAG0201: Performing flush operation, mode %s";
    }
    protected String unknownDatasourceServiceType$str() {
        return "WFLYAG0301: Unknown datasource service of type: %s";
    }
    @Override
    public final OperationFailedException unknownDatasourceServiceType(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unknownDatasourceServiceType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidConnection$str() {
        return "WFLYAG0302: Invalid connection in '%s'";
    }
    @Override
    public final OperationFailedException invalidConnection(final SQLException arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidConnection$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jndiNameInvalidFormat$str() {
        return "WFLYAG0303: JNDI name have to start with java:/ or java:jboss/";
    }
    @Override
    public final OperationFailedException jndiNameInvalidFormat() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), jndiNameInvalidFormat$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jndiNameShouldValidate$str() {
        return "WFLYAG0304: JNDI name shouldn't include '//' or end with '/'";
    }
    @Override
    public final OperationFailedException jndiNameShouldValidate() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), jndiNameShouldValidate$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidDeploymentConnectionProvider$str() {
        return "WFLYAG0401: Invalid connection provider. Either a java.sql.Driver or javax.sql.DataSource implementation is required. Fix the connection-provider for the driver";
    }
    @Override
    public final DeploymentUnitProcessingException invalidDeploymentConnectionProvider() {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), invalidDeploymentConnectionProvider$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String loadClassDeploymentException$str() {
        return "WFLYAG0402: Failed to load connection provider class '%s'";
    }
    @Override
    public final DeploymentUnitProcessingException loadClassDeploymentException(final Throwable arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), loadClassDeploymentException$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingAttributeInDatasourceMetadata$str() {
        return "WFLYAG0403: Element <data-source> must provide attribute '%s'";
    }
    @Override
    public final DeploymentUnitProcessingException missingAttributeInDatasourceMetadata(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), missingAttributeInDatasourceMetadata$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void driverLoaded(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, driverLoaded$str(), arg0, arg1);
    }
    protected String driverLoaded$str() {
        return "WFLYAG0501: Loaded class %s for driver '%s'";
    }
    protected String loadModuleException$str() {
        return "WFLYAG0502: Failed to load driver module '%s'";
    }
    @Override
    public final IllegalArgumentException loadModuleException(final Throwable arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), loadModuleException$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String loadClassException$str() {
        return "WFLYAG0503: Failed to load driver class '%s'";
    }
    @Override
    public final IllegalArgumentException loadClassException(final Throwable arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), loadClassException$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void poolWarning(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, poolWarning$str(), arg0, arg1);
    }
    protected String poolWarning$str() {
        return "WFLYAG0601: %s: %s";
    }
}
