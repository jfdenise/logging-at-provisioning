package org.jboss.as.jsf.logging;

import java.util.Locale;
import org.jboss.vfs.VirtualFile;
import org.jboss.jandex.AnnotationTarget;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import org.jboss.jandex.DotName;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.util.List;
import java.lang.Object;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:56:57+0200")
public class JSFLogger_$logger extends DelegatingBasicLogger implements JSFLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = JSFLogger_$logger.class.getName();
    public JSFLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void managedBeansConfigParseFailed(final VirtualFile facesConfig) {
        super.log.logf(FQCN, ERROR, null, managedBeansConfigParseFailed$str(), facesConfig);
    }
    protected String managedBeansConfigParseFailed$str() {
        return "WFLYJSF0004: Failed to parse %s, Jakarta Server Faces artifacts defined in this file will not be available";
    }
    @Override
    public final void unknownJSFVersion(final String version, final String defaultVersion) {
        super.log.logf(FQCN, WARN, null, unknownJSFVersion$str(), version, defaultVersion);
    }
    protected String unknownJSFVersion$str() {
        return "WFLYJSF0005: Unknown Jakarta Server Faces version '%s'.  Default version '%s' will be used instead.";
    }
    @Override
    public final void missingJSFModule(final String version, final String module) {
        super.log.logf(FQCN, WARN, null, missingJSFModule$str(), version, module);
    }
    protected String missingJSFModule$str() {
        return "WFLYJSF0006: Jakarta Server Faces version slot '%s' is missing from module %s";
    }
    @Override
    public final void activatedJSFImplementations(final List target) {
        super.log.logf(FQCN, INFO, null, activatedJSFImplementations$str(), target);
    }
    protected String activatedJSFImplementations$str() {
        return "WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: %s";
    }
    protected String classLoadingFailed$str() {
        return "WFLYJSF0008: Failed to load annotated class: %s";
    }
    @Override
    public final String classLoadingFailed(final DotName clazz) {
        return String.format(getLoggingLocale(), classLoadingFailed$str(), clazz);
    }
    protected String invalidAnnotationLocation$str() {
        return "WFLYJSF0009: Annotation %s in class %s is only allowed on classes";
    }
    @Override
    public final String invalidAnnotationLocation(final Object annotation, final AnnotationTarget classInfo) {
        return String.format(getLoggingLocale(), invalidAnnotationLocation$str(), annotation, classInfo);
    }
    protected String invalidDefaultJSFImpl$str() {
        return "WFLYJSF0014: Default Jakarta Server Faces implementation slot '%s' is invalid";
    }
    @Override
    public final DeploymentUnitProcessingException invalidDefaultJSFImpl(final String defaultJsfVersion) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), invalidDefaultJSFImpl$str(), defaultJsfVersion));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String jsfInjectionFailed$str() {
        return "WFLYJSF0016: Failed to inject Jakarta Server Faces from slot %s";
    }
    @Override
    public final DeploymentUnitProcessingException jsfInjectionFailed(final String slotName, final Throwable cause) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), jsfInjectionFailed$str(), slotName), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void loadingJsf12() {
        super.log.logf(FQCN, DEBUG, null, loadingJsf12$str());
    }
    protected String loadingJsf12$str() {
        return "WFLYJSF0017: Faces 1.2 classes detected. Using org.jboss.as.jsf.injection.weld.legacy.WeldApplicationFactoryLegacy.";
    }
    @Override
    public final void loadingJsf2x() {
        super.log.logf(FQCN, DEBUG, null, loadingJsf2x$str());
    }
    protected String loadingJsf2x$str() {
        return "WFLYJSF0018: Faces 1.2 classes not detected. Using org.jboss.as.jsf.injection.weld.WeldApplicationFactory.";
    }
    @Override
    public final void jsfArtifactNoDefaultConstructor(final String type, final String className) {
        super.log.logf(FQCN, INFO, null, jsfArtifactNoDefaultConstructor$str(), type, className);
    }
    protected String jsfArtifactNoDefaultConstructor$str() {
        return "WFLYJSF0019: Jakarta Server Faces artifact %s with class %s has no default constructor so it will not be considered for injection";
    }
    @Override
    public final void lazyBeanValidationEnabled() {
        super.log.logf(FQCN, WARN, null, lazyBeanValidationEnabled$str());
    }
    protected String lazyBeanValidationEnabled$str() {
        return "WFLYJSF0020: Lazy bean validation was enabled. This can result in missing @PreDestroy events when distributed web sessions expire.";
    }
}
