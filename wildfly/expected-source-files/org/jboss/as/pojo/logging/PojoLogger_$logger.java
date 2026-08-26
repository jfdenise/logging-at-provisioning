package org.jboss.as.pojo.logging;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import org.jboss.vfs.VirtualFile;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.as.pojo.descriptor.ConfigVisitorNode;
import java.lang.String;
import org.jboss.logging.Logger;
import org.jboss.as.pojo.descriptor.BeanMetaDataConfig;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import org.jboss.msc.service.StartException;
import java.util.Arrays;
import org.jboss.as.server.deployment.DeploymentUnit;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:58:09+0200")
public class PojoLogger_$logger extends DelegatingBasicLogger implements PojoLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = PojoLogger_$logger.class.getName();
    public PojoLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void oldNamespace(final Object namespace) {
        super.log.logf(FQCN, INFO, null, oldNamespace$str(), namespace);
    }
    protected String oldNamespace$str() {
        return "WFLYPOJO0001: Found legacy bean/pojo namespace: %s - might be missing some xml features (potential exceptions).";
    }
    @Override
    public final void ignoreUninstallError(final Object joinpoint, final Throwable cause) {
        super.log.logf(FQCN, WARN, cause, ignoreUninstallError$str(), joinpoint);
    }
    protected String ignoreUninstallError$str() {
        return "WFLYPOJO0002: Ignoring uninstall action on target: %s";
    }
    @Override
    public final void invokingCallback(final Object callback, final Throwable cause) {
        super.log.logf(FQCN, WARN, cause, invokingCallback$str(), callback);
    }
    protected String invokingCallback$str() {
        return "WFLYPOJO0003: Error invoking callback: %s";
    }
    @Override
    public final void errorAtIncallback(final Object callback, final Throwable cause) {
        super.log.logf(FQCN, WARN, cause, errorAtIncallback$str(), callback);
    }
    protected String errorAtIncallback$str() {
        return "WFLYPOJO0004: Error invoking incallback: %s";
    }
    @Override
    public final void errorAtUncallback(final Object callback, final Throwable cause) {
        super.log.logf(FQCN, WARN, cause, errorAtUncallback$str(), callback);
    }
    protected String errorAtUncallback$str() {
        return "WFLYPOJO0005: Error invoking uncallback: %s";
    }
    protected String noModuleFound$str() {
        return "WFLYPOJO0006: Failed to get module attachment for %s";
    }
    @Override
    public final DeploymentUnitProcessingException noModuleFound(final DeploymentUnit unit) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), noModuleFound$str(), unit));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String missingReflectionIndex$str() {
        return "WFLYPOJO0007: Missing deployment reflection index for %s";
    }
    @Override
    public final DeploymentUnitProcessingException missingReflectionIndex(final DeploymentUnit unit) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), missingReflectionIndex$str(), unit));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParse$str() {
        return "WFLYPOJO0008: Failed to parse POJO xml [ %s ]";
    }
    @Override
    public final DeploymentUnitProcessingException failedToParse(final VirtualFile file) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToParse$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInstantiateCollection$str() {
        return "WFLYPOJO0010: Cannot instantiate new collection instance.";
    }
    @Override
    public final IllegalArgumentException cannotInstantiateCollection(final Throwable cause) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotInstantiateCollection$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInstantiateMap$str() {
        return "WFLYPOJO0011: Cannot instantiate new map instance.";
    }
    @Override
    public final IllegalArgumentException cannotInstantiateMap(final Throwable cause) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotInstantiateMap$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String tooDynamicFromFactory$str() {
        return "WFLYPOJO0012: Too dynamic to determine injected type from factory!";
    }
    @Override
    public final IllegalArgumentException tooDynamicFromFactory() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), tooDynamicFromFactory$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String tooDynamicFromDependency$str() {
        return "WFLYPOJO0013: Too dynamic to determine injected type from dependency!";
    }
    @Override
    public final IllegalArgumentException tooDynamicFromDependency() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), tooDynamicFromDependency$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notValueConfig$str() {
        return "WFLYPOJO0014: Previous node is not a value config: %s";
    }
    @Override
    public final IllegalArgumentException notValueConfig(final ConfigVisitorNode previous) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notValueConfig$str(), previous));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullFactoryMethod$str() {
        return "WFLYPOJO0015: Null factory method!";
    }
    @Override
    public final IllegalArgumentException nullFactoryMethod() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullFactoryMethod$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullBeanInfo$str() {
        return "WFLYPOJO0016: Null bean info!";
    }
    @Override
    public final IllegalArgumentException nullBeanInfo() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullBeanInfo$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidMatchSize$str() {
        return "WFLYPOJO0017: Invalid number of type instances match: %s, type: %s";
    }
    @Override
    public final IllegalArgumentException invalidMatchSize(final Set set, final Class type) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidMatchSize$str(), set, type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotDetermineInjectedType$str() {
        return "WFLYPOJO0018: Cannot determine injected type: %s, try setting class attribute (if available).";
    }
    @Override
    public final IllegalArgumentException cannotDetermineInjectedType(final String info) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotDetermineInjectedType$str(), info));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullOrEmptyAlias$str() {
        return "WFLYPOJO0019: Null or empty alias.";
    }
    @Override
    public final IllegalArgumentException nullOrEmptyAlias() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullOrEmptyAlias$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullOrEmptyDependency$str() {
        return "WFLYPOJO0020: Null or empty dependency.";
    }
    @Override
    public final IllegalArgumentException nullOrEmptyDependency() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullOrEmptyDependency$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingValue$str() {
        return "WFLYPOJO0021: Missing value";
    }
    @Override
    public final String missingValue() {
        return String.format(getLoggingLocale(), missingValue$str());
    }
    protected String nullValue$str() {
        return "WFLYPOJO0022: Null value";
    }
    @Override
    public final IllegalArgumentException nullValue() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullValue$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullName$str() {
        return "WFLYPOJO0023: Null name";
    }
    @Override
    public final IllegalArgumentException nullName() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullMethodName$str() {
        return "WFLYPOJO0024: Null method name!";
    }
    @Override
    public final IllegalArgumentException nullMethodName() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullMethodName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownType$str() {
        return "WFLYPOJO0025: Unknown type: %s";
    }
    @Override
    public final IllegalArgumentException unknownType(final Object type) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownType$str(), type));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalParameterLength$str() {
        return "WFLYPOJO0026: Illegal parameter length: %s";
    }
    @Override
    public final IllegalArgumentException illegalParameterLength(final Object info) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalParameterLength$str(), info));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingFactoryMethod$str() {
        return "WFLYPOJO0027: Missing factory method in ctor configuration: %s";
    }
    @Override
    public final StartException missingFactoryMethod(final BeanMetaDataConfig beanConfig) {
        final StartException result = new StartException(String.format(getLoggingLocale(), missingFactoryMethod$str(), beanConfig));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingBeanInfo$str() {
        return "WFLYPOJO0028: Missing bean info, set bean's class attribute: %s";
    }
    @Override
    public final String missingBeanInfo(final BeanMetaDataConfig beanConfig) {
        return String.format(getLoggingLocale(), missingBeanInfo$str(), beanConfig);
    }
    protected String wrongTypeSize$str() {
        return "WFLYPOJO0029: Wrong types size, doesn't match parameters!";
    }
    @Override
    public final IllegalArgumentException wrongTypeSize() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), wrongTypeSize$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullClassInfo$str() {
        return "WFLYPOJO0030: Null ClassInfo!";
    }
    @Override
    public final IllegalArgumentException nullClassInfo() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullClassInfo$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ctorNotFound$str() {
        return "WFLYPOJO0031: No such constructor: %s for class %s.";
    }
    @Override
    public final IllegalArgumentException ctorNotFound(final Object args, final String clazz) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), ctorNotFound$str(), args, clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String methodNotFound$str() {
        return "WFLYPOJO0032: Method not found %s%s for class %s.";
    }
    @Override
    public final IllegalArgumentException methodNotFound(final String name, final Object args, final String clazz) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), methodNotFound$str(), name, args, clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String getterNotFound$str() {
        return "WFLYPOJO0033: No such getter: %s on class %s.";
    }
    @Override
    public final IllegalArgumentException getterNotFound(final Class<?> type, final String clazz) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getterNotFound$str(), type, clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String setterNotFound$str() {
        return "WFLYPOJO0034: No such setter: %s on class %s.";
    }
    @Override
    public final IllegalArgumentException setterNotFound(final Class<?> type, final String clazz) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), setterNotFound$str(), type, clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ambiguousMatch1$str() {
        return "WFLYPOJO0035: Ambiguous match %s.";
    }
    @Override
    public final IllegalArgumentException ambiguousMatch(final Object info) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), ambiguousMatch1$str(), info));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ambiguousMatch3$str() {
        return "WFLYPOJO0036: Ambiguous match of %s for name %s on class %s.";
    }
    @Override
    public final IllegalArgumentException ambiguousMatch(final Object info, final String name, final String clazz) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), ambiguousMatch3$str(), info, name, clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String fieldNotFound$str() {
        return "WFLYPOJO0037: Field not found %s for class %s.";
    }
    @Override
    public final IllegalArgumentException fieldNotFound(final String name, final String clazz) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), fieldNotFound$str(), name, clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String parsingException$str() {
        return "WFLYPOJO0038: Exception while parsing POJO descriptor file: %s";
    }
    @Override
    public final DeploymentUnitProcessingException parsingException(final VirtualFile beansXml, final Throwable cause) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), parsingException$str(), beansXml), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotDetermineType$str() {
        return "WFLYPOJO0039: Cannot determine type - insufficient info on configuration!";
    }
    @Override
    public final IllegalArgumentException cannotDetermineType() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotDetermineType$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
