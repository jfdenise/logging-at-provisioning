package org.jboss.as.naming.logging;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import org.jboss.as.naming.deployment.JndiName;
import java.lang.IllegalStateException;
import java.io.Serializable;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import javax.naming.Name;
import java.lang.RuntimeException;
import javax.naming.InvalidNameException;
import org.jboss.as.naming.subsystem.BindingType;
import org.jboss.logging.BasicLogger;
import java.security.Permission;
import java.lang.ClassLoader;
import javax.naming.NamingException;
import org.jboss.msc.service.StartException;
import java.lang.IllegalArgumentException;
import javax.naming.Context;
import javax.naming.OperationNotSupportedException;
import javax.annotation.processing.Generated;
import javax.naming.NameNotFoundException;
import org.jboss.as.controller.OperationFailedException;
import java.lang.SecurityException;
import org.jboss.msc.service.ServiceName;
import java.lang.Throwable;
import java.lang.Object;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:53:56+0200")
public class NamingLogger_$logger extends DelegatingBasicLogger implements NamingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = NamingLogger_$logger.class.getName();
    public NamingLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void activatingSubsystem() {
        super.log.logf(FQCN, INFO, null, activatingSubsystem$str());
    }
    protected String activatingSubsystem$str() {
        return "WFLYNAM0001: Activating Naming Subsystem";
    }
    @Override
    public final void failedToSet(final Throwable cause, final String name) {
        super.log.logf(FQCN, WARN, cause, failedToSet$str(), name);
    }
    protected String failedToSet$str() {
        return "WFLYNAM0002: Failed to set %s";
    }
    @Override
    public final void startingService() {
        super.log.logf(FQCN, INFO, null, startingService$str());
    }
    protected String startingService$str() {
        return "WFLYNAM0003: Starting Naming Service";
    }
    @Override
    public final void failedToReleaseBinderService(final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, failedToReleaseBinderService$str());
    }
    protected String failedToReleaseBinderService$str() {
        return "WFLYNAM0012: Failed to release binder service, used for a runtime made JNDI binding";
    }
    @Override
    public final void failedToLookupJndiViewValue(final String entry, final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, failedToLookupJndiViewValue$str(), entry);
    }
    protected String failedToLookupJndiViewValue$str() {
        return "WFLYNAM0013: Failed to obtain jndi view value for entry %s.";
    }
    protected String cannotAddToReadOnlyPermissionCollection$str() {
        return "WFLYNAM0014: Attempt to add a Permission to a readonly PermissionCollection";
    }
    @Override
    public final SecurityException cannotAddToReadOnlyPermissionCollection() {
        final SecurityException result = new SecurityException(String.format(getLoggingLocale(), cannotAddToReadOnlyPermissionCollection$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String cannotBeNull$str() {
        return "WFLYNAM0015: %s cannot be null.";
    }
    @Override
    public final String cannotBeNull(final String name) {
        return String.format(getLoggingLocale(), cannotBeNull$str(), name);
    }
    protected String cannotDeferenceObject$str() {
        return "WFLYNAM0016: Could not dereference object";
    }
    @Override
    public final NamingException cannotDeferenceObject(final Throwable cause) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), cannotDeferenceObject$str()));
        result.initCause(cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotListNonContextBinding$str() {
        return "WFLYNAM0017: Unable to list a non Context binding.";
    }
    @Override
    public final NamingException cannotListNonContextBinding() {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), cannotListNonContextBinding$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotLookupLink$str() {
        return "WFLYNAM0018: Could not lookup link";
    }
    @Override
    public final String cannotLookupLink() {
        return String.format(getLoggingLocale(), cannotLookupLink$str());
    }
    protected String cannotResolveService1$str() {
        return "WFLYNAM0020: Could not resolve service %s";
    }
    @Override
    public final NamingException cannotResolveService(final ServiceName serviceName) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), cannotResolveService1$str(), serviceName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotResolveService3$str() {
        return "WFLYNAM0021: Could not resolve service reference to %s in factory %s. Service was in state %s.";
    }
    @Override
    public final NamingException cannotResolveService(final ServiceName serviceName, final String className, final String state) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), cannotResolveService3$str(), serviceName, className, state));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotResolveServiceBug$str() {
        return "WFLYNAM0022: Could not resolve service reference to %s in factory %s. This is a bug in ServiceReferenceObjectFactory. State was %s.";
    }
    @Override
    public final NamingException cannotResolveServiceBug(final ServiceName serviceName, final String className, final String state) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), cannotResolveServiceBug$str(), serviceName, className, state));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateBinding$str() {
        return "WFLYNAM0023: Duplicate JNDI bindings for '%s' are not compatible.  [%s] != [%s]";
    }
    @Override
    public final String duplicateBinding(final JndiName jndiName, final Object existing, final Object value) {
        return String.format(getLoggingLocale(), duplicateBinding$str(), jndiName, existing, value);
    }
    protected String emptyNameNotAllowed$str() {
        return "WFLYNAM0024: An empty name is not allowed";
    }
    @Override
    public final InvalidNameException emptyNameNotAllowed() {
        final InvalidNameException result = new InvalidNameException(String.format(getLoggingLocale(), emptyNameNotAllowed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String entryNotRegistered$str() {
        return "WFLYNAM0025: Jndi entry '%s' is not yet registered in context '%s'";
    }
    @Override
    public final IllegalStateException entryNotRegistered(final Throwable cause, final String contextName, final Context context) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), entryNotRegistered$str(), contextName, context), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToDestroyRootContext$str() {
        return "WFLYNAM0026: Failed to destroy root context";
    }
    @Override
    public final IllegalStateException failedToDestroyRootContext(final Throwable cause) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failedToDestroyRootContext$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToInstantiate$str() {
        return "WFLYNAM0027: Failed instantiate %s %s from classloader %s";
    }
    @Override
    public final NamingException failedToInstantiate(final Throwable cause, final String description, final String className, final ClassLoader classLoader) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), failedToInstantiate$str(), description, className, classLoader));
        result.initCause(cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToReadContextEntries$str() {
        return "WFLYNAM0028: Failed to read %s context entries.";
    }
    @Override
    public final String failedToReadContextEntries(final String bindingName) {
        return String.format(getLoggingLocale(), failedToReadContextEntries$str(), bindingName);
    }
    protected String failedToStart$str() {
        return "WFLYNAM0029: Failed to start %s";
    }
    @Override
    public final String failedToStart(final String name) {
        return String.format(getLoggingLocale(), failedToStart$str(), name);
    }
    protected String illegalContextInName$str() {
        return "WFLYNAM0030: Illegal context in name: %s";
    }
    @Override
    public final RuntimeException illegalContextInName(final String jndiName) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), illegalContextInName$str(), jndiName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidContextReference$str() {
        return "WFLYNAM0032: Invalid context reference.  Not a '%s' reference.";
    }
    @Override
    public final NamingException invalidContextReference(final String referenceName) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), invalidContextReference$str(), referenceName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidJndiName$str() {
        return "WFLYNAM0033: A valid JNDI name must be provided: %s";
    }
    @Override
    public final IllegalArgumentException invalidJndiName(final String jndiName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidJndiName$str(), jndiName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidLoadFactor$str() {
        return "WFLYNAM0034: Load factor must be greater than 0 and less than or equal to 1";
    }
    @Override
    public final IllegalArgumentException invalidLoadFactor() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidLoadFactor$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidPermission$str() {
        return "WFLYNAM0035: invalid permission, unknown action: %s";
    }
    @Override
    public final IllegalArgumentException invalidPermission(final Permission permission) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidPermission$str(), permission));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidPermissionAction$str() {
        return "WFLYNAM0036: invalid permission, unknown action: %s";
    }
    @Override
    public final IllegalArgumentException invalidPermissionAction(final String permissionAction) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidPermissionAction$str(), permissionAction));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidTableSize$str() {
        return "WFLYNAM0037: Can not have a negative size table!";
    }
    @Override
    public final IllegalArgumentException invalidTableSize() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidTableSize$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jndiViewNotAvailable$str() {
        return "WFLYNAM0038: Jndi view is only available in runtime mode.";
    }
    @Override
    public final String jndiViewNotAvailable() {
        return String.format(getLoggingLocale(), jndiViewNotAvailable$str());
    }
    protected String nameNotFoundInContext$str() {
        return "WFLYNAM0039: Name '%s' not found in context '%s'";
    }
    @Override
    public final NameNotFoundException nameNotFoundInContext(final String name, final Name contextName) {
        final NameNotFoundException result = new NameNotFoundException(String.format(getLoggingLocale(), nameNotFoundInContext$str(), name, contextName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullVar$str() {
        return "WFLYNAM0041: %s is null";
    }
    @Override
    public final IllegalArgumentException nullVar(final String varName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullVar$str(), varName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String objectFactoryCreationFailure$str() {
        return "WFLYNAM0042: Failed to create object factory from classloader.";
    }
    @Override
    public final NamingException objectFactoryCreationFailure(final Throwable cause) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), objectFactoryCreationFailure$str()));
        result.initCause(cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String readOnlyNamingContext$str() {
        return "WFLYNAM0043: Naming context is read-only";
    }
    @Override
    public final OperationNotSupportedException readOnlyNamingContext() {
        final OperationNotSupportedException result = new OperationNotSupportedException(String.format(getLoggingLocale(), readOnlyNamingContext$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serviceAlreadyBound$str() {
        return "WFLYNAM0044: Service with name [%s] already bound.";
    }
    @Override
    public final IllegalArgumentException serviceAlreadyBound(final ServiceName serviceName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), serviceAlreadyBound$str(), serviceName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String tableIsFull$str() {
        return "WFLYNAM0045: Table is full!";
    }
    @Override
    public final IllegalStateException tableIsFull() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), tableIsFull$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String threadInterrupt$str() {
        return "WFLYNAM0046: Thread interrupted while retrieving service reference for service %s";
    }
    @Override
    public final NamingException threadInterrupt(final ServiceName serviceName) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), threadInterrupt$str(), serviceName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidNameForContextBinding$str() {
        return "WFLYNAM0047: Invalid name for context binding %s";
    }
    @Override
    public final DeploymentUnitProcessingException invalidNameForContextBinding(final String name) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), invalidNameForContextBinding$str(), name));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidNamespaceForBinding$str() {
        return "WFLYNAM0048: Invalid binding name %s, name must start with one of %s";
    }
    @Override
    public final OperationFailedException invalidNamespaceForBinding(final String name, final String namespaces) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidNamespaceForBinding$str(), name, namespaces));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownBindingType$str() {
        return "WFLYNAM0049: Unknown binding type %s";
    }
    @Override
    public final OperationFailedException unknownBindingType(final String type) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unknownBindingType$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedSimpleBindingType$str() {
        return "WFLYNAM0050: Unsupported simple binding type %s";
    }
    @Override
    public final OperationFailedException unsupportedSimpleBindingType(final String type) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unsupportedSimpleBindingType$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToTransformURLBindingValue$str() {
        return "WFLYNAM0051: Unable to transform URL binding value %s";
    }
    @Override
    public final OperationFailedException unableToTransformURLBindingValue(final String value, final Throwable cause) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToTransformURLBindingValue$str(), value), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotLoadModule$str() {
        return "WFLYNAM0052: Could not load module %s";
    }
    @Override
    public final OperationFailedException couldNotLoadModule(final String moduleID) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), couldNotLoadModule$str(), moduleID));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotLoadClassFromModule$str() {
        return "WFLYNAM0053: Could not load class %s from module %s";
    }
    @Override
    public final OperationFailedException couldNotLoadClassFromModule(final String className, final String moduleID) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), couldNotLoadClassFromModule$str(), className, moduleID));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotInstantiateClassInstanceFromModule$str() {
        return "WFLYNAM0054: Could not instantiate instance of class %s from module %s";
    }
    @Override
    public final OperationFailedException couldNotInstantiateClassInstanceFromModule(final String className, final String moduleID) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), couldNotInstantiateClassInstanceFromModule$str(), className, moduleID));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notAnInstanceOfObjectFactory$str() {
        return "WFLYNAM0055: Class %s from module %s is not an instance of ObjectFactory";
    }
    @Override
    public final OperationFailedException notAnInstanceOfObjectFactory(final String className, final String moduleID) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), notAnInstanceOfObjectFactory$str(), className, moduleID));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String resourceLookupForInjectionFailed$str() {
        return "WFLYNAM0059: Resource lookup for injection failed: %s";
    }
    @Override
    public final RuntimeException resourceLookupForInjectionFailed(final String jndiName, final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), resourceLookupForInjectionFailed$str(), jndiName), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String bindingTypeRequiresAttributeDefined$str() {
        return "WFLYNAM0060: Binding type %s requires attribute named %s defined";
    }
    @Override
    public final OperationFailedException bindingTypeRequiresAttributeDefined(final BindingType bindingType, final String attributeName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), bindingTypeRequiresAttributeDefined$str(), bindingType, attributeName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cacheNotValidForBindingType$str() {
        return "WFLYNAM0061: Binding type %s can not take a 'cache' attribute";
    }
    @Override
    public final OperationFailedException cacheNotValidForBindingType(final BindingType type) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cacheNotValidForBindingType$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String lookupError$str() {
        return "WFLYNAM0062: Failed to lookup %s";
    }
    @Override
    public final NamingException lookupError(final Throwable cause, final String name) {
        final NamingException result = new NamingException(String.format(getLoggingLocale(), lookupError$str(), name));
        result.initCause(cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serviceNotStarted$str() {
        return "WFLYNAM0063: %s service not started";
    }
    @Override
    public final IllegalStateException serviceNotStarted(final ServiceName serviceName) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serviceNotStarted$str(), serviceName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRebindExternalContext$str() {
        return "WFLYNAM0064: Cannot rebind external context lookup";
    }
    @Override
    public final OperationFailedException cannotRebindExternalContext() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), cannotRebindExternalContext$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String moduleNotFound$str() {
        return "WFLYNAM0065: Could not load module %s - the module or one of its dependencies is missing [%s]";
    }
    @Override
    public final OperationFailedException moduleNotFound(final String moduleID, final String missingModule) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), moduleNotFound$str(), moduleID, missingModule));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToStartRemoteNamingService$str() {
        return "WFLYNAM0066: Failed to start remote naming service";
    }
    @Override
    public final StartException failedToStartRemoteNamingService(final Throwable cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToStartRemoteNamingService$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToStopRemoteNamingService$str() {
        return "WFLYNAM0067: Failed to stop remote naming service";
    }
    @Override
    public final IllegalStateException failedToStopRemoteNamingService(final Throwable cause) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failedToStopRemoteNamingService$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
}
