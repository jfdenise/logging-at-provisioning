package org.jboss.as.jpa.messages;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import org.jboss.vfs.VirtualFile;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import jakarta.persistence.TransactionRequiredException;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.lang.Exception;
import jakarta.persistence.EntityManager;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import jakarta.persistence.PersistenceException;
import java.lang.Throwable;
import java.lang.Object;
import org.jboss.jandex.MethodInfo;
import java.util.Arrays;
import jakarta.ejb.EJBException;
import org.jboss.as.server.deployment.DeploymentUnit;
import java.lang.ClassNotFoundException;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:25+0200")
public class JpaLogger_$logger extends DelegatingBasicLogger implements JpaLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = JpaLogger_$logger.class.getName();
    public JpaLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void duplicatePersistenceUnitDefinition(final String arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, WARN, null, duplicatePersistenceUnitDefinition$str(), arg0, arg1, arg2);
    }
    protected String duplicatePersistenceUnitDefinition$str() {
        return "WFLYJPA0001: Duplicate Persistence Unit definition for %s in application.  One of the duplicate persistence.xml should be removed from the application. Application deployment will continue with the persistence.xml definitions from %s used.  The persistence.xml definitions from %s will be ignored.";
    }
    @Override
    public final void readingPersistenceXml(final String arg0) {
        super.log.logf(FQCN, INFO, null, readingPersistenceXml$str(), arg0);
    }
    protected String readingPersistenceXml$str() {
        return "WFLYJPA0002: Read persistence.xml for %s";
    }
    @Override
    public final void startingService(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, startingService$str(), arg0, arg1);
    }
    protected String startingService$str() {
        return "WFLYJPA0003: Starting %s Service '%s'";
    }
    @Override
    public final void stoppingService(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, stoppingService$str(), arg0, arg1);
    }
    protected String stoppingService$str() {
        return "WFLYJPA0004: Stopping %s Service '%s'";
    }
    @Override
    public final void errorPreloadingDefaultProvider(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, errorPreloadingDefaultProvider$str());
    }
    protected String errorPreloadingDefaultProvider$str() {
        return "WFLYJPA0006: Could not load default persistence provider module.  ";
    }
    @Override
    public final void failedToStopPUService(final Throwable arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, failedToStopPUService$str(), arg1);
    }
    protected String failedToStopPUService$str() {
        return "WFLYJPA0007: Failed to stop persistence unit service %s";
    }
    @Override
    public final void startingPersistenceUnitService(final int arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, startingPersistenceUnitService$str(), arg0, arg1);
    }
    protected String startingPersistenceUnitService$str() {
        return "WFLYJPA0010: Starting Persistence Unit (phase %d of 2) Service '%s'";
    }
    @Override
    public final void stoppingPersistenceUnitService(final int arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, stoppingPersistenceUnitService$str(), arg0, arg1);
    }
    protected String stoppingPersistenceUnitService$str() {
        return "WFLYJPA0011: Stopping Persistence Unit (phase %d of 2) Service '%s'";
    }
    @Override
    public final void unexpectedStatisticsProblem(final RuntimeException arg0) {
        super.log.logf(FQCN, WARN, arg0, unexpectedStatisticsProblem$str());
    }
    protected String unexpectedStatisticsProblem$str() {
        return "WFLYJPA0012: Unexpected problem gathering statistics";
    }
    protected String cannotCloseContainerManagedEntityManager$str() {
        return "WFLYJPA0015: Container managed entity manager can only be closed by the container (will happen when @remove method is invoked on containing SFSB)";
    }
    @Override
    public final IllegalStateException cannotCloseContainerManagedEntityManager() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotCloseContainerManagedEntityManager$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String cannotCloseTransactionContainerEntityManger$str() {
        return "WFLYJPA0017: Container managed entity manager can only be closed by the container (auto-cleared at tx/invocation end and closed when owning component is closed.)";
    }
    @Override
    public final IllegalStateException cannotCloseTransactionContainerEntityManger() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotCloseTransactionContainerEntityManger$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCreateAdapter$str() {
        return "WFLYJPA0018: Could not create instance of adapter class '%s'";
    }
    @Override
    public final DeploymentUnitProcessingException cannotCreateAdapter(final Throwable arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotCreateAdapter$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotDeployApp$str() {
        return "WFLYJPA0019: Could not deploy application packaged persistence provider '%s'";
    }
    @Override
    public final DeploymentUnitProcessingException cannotDeployApp(final Throwable arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotDeployApp$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotGetSessionFactory$str() {
        return "WFLYJPA0020: Couldn't get Hibernate session factory from entity manager";
    }
    @Override
    public final RuntimeException cannotGetSessionFactory(final Throwable arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotGetSessionFactory$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInjectResourceLocalEntityManager$str() {
        return "WFLYJPA0021: Cannot inject RESOURCE_LOCAL container managed EntityManagers using @PersistenceContext";
    }
    @Override
    public final String cannotInjectResourceLocalEntityManager() {
        return String.format(getLoggingLocale(), cannotInjectResourceLocalEntityManager$str());
    }
    protected String cannotLoadFromJpa$str() {
        return "WFLYJPA0025: Couldn't load %s from Jakarta Persistence modules classloader";
    }
    @Override
    public final RuntimeException cannotLoadFromJpa(final Throwable arg0, final String arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotLoadFromJpa$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotLoadPersistenceProviderModule$str() {
        return "WFLYJPA0027: Persistence provider module load error %s (class %s)";
    }
    @Override
    public final DeploymentUnitProcessingException cannotLoadPersistenceProviderModule(final Throwable arg0, final String arg1, final String arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotLoadPersistenceProviderModule$str(), arg1, arg2), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotSpecifyBoth$str() {
        return "WFLYJPA0029: Cannot specify both %s (%s) and %s (%s) in %s for %s";
    }
    @Override
    public final DeploymentUnitProcessingException cannotSpecifyBoth(final String arg0, final Object arg1, final String arg2, final Object arg3, final String arg4, final Object arg5) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotSpecifyBoth$str(), arg0, arg1, arg2, arg3, arg4, arg5));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotUseExtendedPersistenceTransaction$str() {
        return "WFLYJPA0030: Found extended persistence context in SFSB invocation call stack but that cannot be used because the transaction already has a transactional context associated with it.  This can be avoided by changing application code, either eliminate the extended persistence context or the transactional context.  See JPA spec 2.0 section 7.6.3.1.  Scoped persistence unit name=%s, persistence context already in transaction =%s, extended persistence context =%s.";
    }
    @Override
    public final EJBException cannotUseExtendedPersistenceTransaction(final String arg0, final EntityManager arg1, final EntityManager arg2) {
        final EJBException result = new EJBException(String.format(getLoggingLocale(), cannotUseExtendedPersistenceTransaction$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String childNotFound$str() {
        return "WFLYJPA0031: Could not find child '%s' on '%s'";
    }
    @Override
    public final RuntimeException childNotFound(final String arg0, final VirtualFile arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), childNotFound$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String classLevelAnnotationParameterRequired$str() {
        return "WFLYJPA0032: Class level %s annotation on class %s must provide a %s";
    }
    @Override
    public final String classLevelAnnotationParameterRequired(final String arg0, final String arg1, final String arg2) {
        return String.format(getLoggingLocale(), classLevelAnnotationParameterRequired$str(), arg0, arg1, arg2);
    }
    protected String persistenceUnitNotFound2$str() {
        return "WFLYJPA0033: Can't find a persistence unit named %s in %s";
    }
    @Override
    public final String persistenceUnitNotFound(final String arg0, final DeploymentUnit arg1) {
        return String.format(getLoggingLocale(), persistenceUnitNotFound2$str(), arg0, arg1);
    }
    protected String persistenceUnitNotFound3$str() {
        return "WFLYJPA0034: Can't find a persistence unit named %s#%s at %s";
    }
    @Override
    public final IllegalArgumentException persistenceUnitNotFound(final String arg0, final String arg1, final DeploymentUnit arg2) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), persistenceUnitNotFound3$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorGettingTransaction$str() {
        return "WFLYJPA0036: An error occurred while getting the transaction associated with the current thread: %s";
    }
    @Override
    public final IllegalStateException errorGettingTransaction(final Exception arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), errorGettingTransaction$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToGetAdapter$str() {
        return "WFLYJPA0037: Failed to get adapter for persistence provider '%s'";
    }
    @Override
    public final DeploymentUnitProcessingException failedToGetAdapter(final String arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToGetAdapter$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToAddPersistenceUnit$str() {
        return "WFLYJPA0038: Failed to add persistence unit service for %s";
    }
    @Override
    public final DeploymentUnitProcessingException failedToAddPersistenceUnit(final Throwable arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToAddPersistenceUnit$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParse$str() {
        return "WFLYJPA0040: Failed to parse %s";
    }
    @Override
    public final String failedToParse(final VirtualFile arg0) {
        return String.format(getLoggingLocale(), failedToParse$str(), arg0);
    }
    protected String invalidPersistenceUnitName$str() {
        return "WFLYJPA0043: Persistence unit name (%s) contains illegal '%s' character";
    }
    @Override
    public final IllegalArgumentException invalidPersistenceUnitName(final String arg0, final char arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidPersistenceUnitName$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidScopedName$str() {
        return "WFLYJPA0044: jboss.as.jpa.scopedname hint (%s) contains illegal '%s' character";
    }
    @Override
    public final IllegalArgumentException invalidScopedName(final String arg0, final char arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidScopedName$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String multipleAdapters$str() {
        return "WFLYJPA0048: Persistence provider adapter module (%s) has more than one adapter";
    }
    @Override
    public final RuntimeException multipleAdapters(final String arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), multipleAdapters$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullParameter$str() {
        return "WFLYJPA0053: Internal %s error, null %s passed in";
    }
    @Override
    public final RuntimeException nullParameter(final String arg0, final String arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), nullParameter$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String persistenceProviderNotFound$str() {
        return "WFLYJPA0057: PersistenceProvider '%s' not found";
    }
    @Override
    public final PersistenceException persistenceProviderNotFound(final String arg0) {
        final PersistenceException result = new PersistenceException(String.format(getLoggingLocale(), persistenceProviderNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String relativePathNotFound$str() {
        return "WFLYJPA0058: Could not find relative path: %s";
    }
    @Override
    public final RuntimeException relativePathNotFound(final Throwable arg0, final String arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), relativePathNotFound$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String setterMethodOnlyAnnotation$str() {
        return "WFLYJPA0059: %s injection target is invalid.  Only setter methods are allowed: %s";
    }
    @Override
    public final String setterMethodOnlyAnnotation(final String arg0, final MethodInfo arg1) {
        return String.format(getLoggingLocale(), setterMethodOnlyAnnotation$str(), arg0, arg1);
    }
    protected String transactionRequired$str() {
        return "WFLYJPA0060: Transaction is required to perform this operation (either use a transaction or extended persistence context)";
    }
    @Override
    public final TransactionRequiredException transactionRequired() {
        final TransactionRequiredException result = new TransactionRequiredException(String.format(getLoggingLocale(), transactionRequired$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noPUnitNameSpecifiedAndMultiplePersistenceUnits$str() {
        return "WFLYJPA0061: Persistence unitName was not specified and there are %d persistence unit definitions in application deployment %s.  Either change the application deployment to have only one persistence unit definition or specify the unitName for each reference to a persistence unit.";
    }
    @Override
    public final IllegalArgumentException noPUnitNameSpecifiedAndMultiplePersistenceUnits(final int arg0, final DeploymentUnit arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), noPUnitNameSpecifiedAndMultiplePersistenceUnits$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateInstanceProvider$str() {
        return "WFLYJPA0062: Could not create instance of persistence provider class %s";
    }
    @Override
    public final RuntimeException couldNotCreateInstanceProvider(final Throwable arg0, final String arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotCreateInstanceProvider$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String referenceCountedEntityManagerNegativeCount$str() {
        return "WFLYJPA0063: internal error, the number of stateful session beans (%d) associated with an extended persistence context (%s) cannot be a negative number.";
    }
    @Override
    public final RuntimeException referenceCountedEntityManagerNegativeCount(final int arg0, final String arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), referenceCountedEntityManagerNegativeCount$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String badSynchronizationTypeCombination$str() {
        return "WFLYJPA0064: Jakarta Transactions transaction already has a 'SynchronizationType.UNSYNCHRONIZED' persistence context (EntityManager) joined to it but a component with a 'SynchronizationType.SYNCHRONIZED' is now being used.  Change the calling component code to join the persistence context (EntityManager) to the transaction or change the called component code to also use 'SynchronizationType.UNSYNCHRONIZED'.  See JPA spec 2.1 section 7.6.4.1.  Scoped persistence unit name=%s.";
    }
    @Override
    public final IllegalStateException badSynchronizationTypeCombination(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), badSynchronizationTypeCombination$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String resourcesOfTypeCannotBeRegistered$str() {
        return "WFLYJPA0065: Resources of type %s cannot be registered";
    }
    @Override
    public final UnsupportedOperationException resourcesOfTypeCannotBeRegistered(final String arg0) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), resourcesOfTypeCannotBeRegistered$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String resourcesOfTypeCannotBeRemoved$str() {
        return "WFLYJPA0066: Resources of type %s cannot be removed";
    }
    @Override
    public final UnsupportedOperationException resourcesOfTypeCannotBeRemoved(final String arg0) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), resourcesOfTypeCannotBeRemoved$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String classloaderHasMultipleAdapters$str() {
        return "WFLYJPA0067: Classloader '%s' has more than one Persistence provider adapter";
    }
    @Override
    public final RuntimeException classloaderHasMultipleAdapters(final String arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), classloaderHasMultipleAdapters$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String persistenceProviderAdaptorModuleLoadError$str() {
        return "WFLYJPA0069: Persistence provider adapter module load error %s";
    }
    @Override
    public final DeploymentUnitProcessingException persistenceProviderAdaptorModuleLoadError(final Throwable arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), persistenceProviderAdaptorModuleLoadError$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String xpcOnlyFromSFSB$str() {
        return "WFLYJPA0070: A container-managed extended persistence context can only be initiated within the scope of a stateful session bean (persistence unit '%s').";
    }
    @Override
    public final IllegalStateException xpcOnlyFromSFSB(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), xpcOnlyFromSFSB$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String differentSearchModuleDependencies$str() {
        return "WFLYJPA0071: Deployment '%s' specified more than one Hibernate Search module name ('%s','%s')";
    }
    @Override
    public final DeploymentUnitProcessingException differentSearchModuleDependencies(final String arg0, final String arg1, final String arg2) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), differentSearchModuleDependencies$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidClassFormat$str() {
        return "WFLYJPA0073: Bytecode rewrite (transformation) of class %s failed";
    }
    @Override
    public final String invalidClassFormat(final String arg0) {
        return String.format(getLoggingLocale(), invalidClassFormat$str(), arg0);
    }
    protected String cannotLoadPersistenceProviderIntegratorModule$str() {
        return "WFLYJPA0074: Persistence provider integrator module load error for %s";
    }
    @Override
    public final DeploymentUnitProcessingException cannotLoadPersistenceProviderIntegratorModule(final Throwable arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotLoadPersistenceProviderIntegratorModule$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalCallOnCloseMethod$str() {
        return "WFLYJPA0075: Illegal to call this method from injected, managed EntityManager";
    }
    @Override
    public final IllegalStateException illegalCallOnCloseMethod() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), illegalCallOnCloseMethod$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void ignoreAppclientPersistenceUnitsInServer(final String arg0) {
        super.log.logf(FQCN, INFO, null, ignoreAppclientPersistenceUnitsInServer$str(), arg0);
    }
    protected String ignoreAppclientPersistenceUnitsInServer$str() {
        return "WFLYJPA0076: persistence.xml in application client %s deployment will not be deployed in server mode";
    }
    protected String classNotFound$str() {
        return "WFLYJPA0077: Jakarta Persistence/CDI Integration cannot be setup for bean type %s, persistence unit %s (%s)";
    }
    @Override
    public final RuntimeException classNotFound(final ClassNotFoundException arg0, final String arg1, final String arg2, final String arg3) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), classNotFound$str(), arg1, arg2, arg3), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String afterBeanDiscoveryEventRanAlready$str() {
        return "WFLYJPA0078: IntegratePersistenceAfterBeanDiscovery cannot register persistence unit %s as jakarta.enterprise.inject.spi.AfterBeanDiscovery event already ran for %s.";
    }
    @Override
    public final IllegalStateException afterBeanDiscoveryEventRanAlready(final String arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), afterBeanDiscoveryEventRanAlready$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void willNotNameEntityManagerFactoryBean(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, willNotNameEntityManagerFactoryBean$str(), arg0, arg1);
    }
    protected String willNotNameEntityManagerFactoryBean$str() {
        return "WFLYJPA0079: EntityManagerFactory CDI bean (for %s) will not have persistence unit name.  In order for the EntityManagerFactory CDI bean to be named remove duplicate copies of persistence unit %s.";
    }
}
