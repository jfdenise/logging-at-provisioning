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
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:46+0200")
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
    public final void oldNamespace(final Object arg0) {
        super.log.logf(FQCN, INFO, null, oldNamespace$str(), arg0);
    }
    protected String oldNamespace$str() {
        return "WFLYPOJO0001: Found legacy bean/pojo namespace: %s - might be missing some xml features (potential exceptions).";
    }
    @Override
    public final void ignoreUninstallError(final Object arg0, final Throwable arg1) {
        super.log.logf(FQCN, WARN, arg1, ignoreUninstallError$str(), arg0);
    }
    protected String ignoreUninstallError$str() {
        return "WFLYPOJO0002: Ignoring uninstall action on target: %s";
    }
    @Override
    public final void invokingCallback(final Object arg0, final Throwable arg1) {
        super.log.logf(FQCN, WARN, arg1, invokingCallback$str(), arg0);
    }
    protected String invokingCallback$str() {
        return "WFLYPOJO0003: Error invoking callback: %s";
    }
    @Override
    public final void errorAtIncallback(final Object arg0, final Throwable arg1) {
        super.log.logf(FQCN, WARN, arg1, errorAtIncallback$str(), arg0);
    }
    protected String errorAtIncallback$str() {
        return "WFLYPOJO0004: Error invoking incallback: %s";
    }
    @Override
    public final void errorAtUncallback(final Object arg0, final Throwable arg1) {
        super.log.logf(FQCN, WARN, arg1, errorAtUncallback$str(), arg0);
    }
    protected String errorAtUncallback$str() {
        return "WFLYPOJO0005: Error invoking uncallback: %s";
    }
    protected String noModuleFound$str() {
        return "WFLYPOJO0006: Failed to get module attachment for %s";
    }
    @Override
    public final DeploymentUnitProcessingException noModuleFound(final DeploymentUnit arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), noModuleFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String missingReflectionIndex$str() {
        return "WFLYPOJO0007: Missing deployment reflection index for %s";
    }
    @Override
    public final DeploymentUnitProcessingException missingReflectionIndex(final DeploymentUnit arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), missingReflectionIndex$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParse$str() {
        return "WFLYPOJO0008: Failed to parse POJO xml [ %s ]";
    }
    @Override
    public final DeploymentUnitProcessingException failedToParse(final VirtualFile arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToParse$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInstantiateCollection$str() {
        return "WFLYPOJO0010: Cannot instantiate new collection instance.";
    }
    @Override
    public final IllegalArgumentException cannotInstantiateCollection(final Throwable arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotInstantiateCollection$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInstantiateMap$str() {
        return "WFLYPOJO0011: Cannot instantiate new map instance.";
    }
    @Override
    public final IllegalArgumentException cannotInstantiateMap(final Throwable arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotInstantiateMap$str()), arg0);
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
    public final IllegalArgumentException notValueConfig(final ConfigVisitorNode arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), notValueConfig$str(), arg0));
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
    public final IllegalArgumentException invalidMatchSize(final Set arg0, final Class arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidMatchSize$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotDetermineInjectedType$str() {
        return "WFLYPOJO0018: Cannot determine injected type: %s, try setting class attribute (if available).";
    }
    @Override
    public final IllegalArgumentException cannotDetermineInjectedType(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotDetermineInjectedType$str(), arg0));
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
    public final IllegalArgumentException unknownType(final Object arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unknownType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalParameterLength$str() {
        return "WFLYPOJO0026: Illegal parameter length: %s";
    }
    @Override
    public final IllegalArgumentException illegalParameterLength(final Object arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalParameterLength$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingFactoryMethod$str() {
        return "WFLYPOJO0027: Missing factory method in ctor configuration: %s";
    }
    @Override
    public final StartException missingFactoryMethod(final BeanMetaDataConfig arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), missingFactoryMethod$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingBeanInfo$str() {
        return "WFLYPOJO0028: Missing bean info, set bean's class attribute: %s";
    }
    @Override
    public final String missingBeanInfo(final BeanMetaDataConfig arg0) {
        return String.format(getLoggingLocale(), missingBeanInfo$str(), arg0);
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
    public final IllegalArgumentException ctorNotFound(final Object arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), ctorNotFound$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String methodNotFound$str() {
        return "WFLYPOJO0032: Method not found %s%s for class %s.";
    }
    @Override
    public final IllegalArgumentException methodNotFound(final String arg0, final Object arg1, final String arg2) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), methodNotFound$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String getterNotFound$str() {
        return "WFLYPOJO0033: No such getter: %s on class %s.";
    }
    @Override
    public final IllegalArgumentException getterNotFound(final Class<?> arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getterNotFound$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String setterNotFound$str() {
        return "WFLYPOJO0034: No such setter: %s on class %s.";
    }
    @Override
    public final IllegalArgumentException setterNotFound(final Class<?> arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), setterNotFound$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ambiguousMatch1$str() {
        return "WFLYPOJO0035: Ambiguous match %s.";
    }
    @Override
    public final IllegalArgumentException ambiguousMatch(final Object arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), ambiguousMatch1$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String ambiguousMatch3$str() {
        return "WFLYPOJO0036: Ambiguous match of %s for name %s on class %s.";
    }
    @Override
    public final IllegalArgumentException ambiguousMatch(final Object arg0, final String arg1, final String arg2) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), ambiguousMatch3$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String fieldNotFound$str() {
        return "WFLYPOJO0037: Field not found %s for class %s.";
    }
    @Override
    public final IllegalArgumentException fieldNotFound(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), fieldNotFound$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String parsingException$str() {
        return "WFLYPOJO0038: Exception while parsing POJO descriptor file: %s";
    }
    @Override
    public final DeploymentUnitProcessingException parsingException(final VirtualFile arg0, final Throwable arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), parsingException$str(), arg0), arg1);
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
