package org.wildfly.core.embedded.logging;

import java.util.Locale;
import org.wildfly.core.embedded.Context;
import java.lang.IllegalStateException;
import org.wildfly.core.embedded.EmbeddedProcessStartException;
import java.io.Serializable;
import org.jboss.modules.ModuleLoader;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import java.lang.reflect.Method;
import java.io.IOException;
import org.jboss.logging.Logger;
import java.lang.NoSuchMethodException;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.util.Arrays;
import java.lang.ClassNotFoundException;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:18+0200")
public class EmbeddedLogger_$logger extends DelegatingBasicLogger implements EmbeddedLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = EmbeddedLogger_$logger.class.getName();
    public EmbeddedLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String invalidJBossHome$str() {
        return "WFLYEMB0011: Invalid JBoss home directory: %s";
    }
    @Override
    public final IllegalStateException invalidJBossHome(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidJBossHome$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String moduleLoaderError$str() {
        return "WFLYEMB0014: Cannot load module %s from: %s";
    }
    @Override
    public final RuntimeException moduleLoaderError(final Throwable arg0, final String arg1, final ModuleLoader arg2) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), moduleLoaderError$str(), arg1, arg2), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullVar$str() {
        return "WFLYEMB0015: %s is null";
    }
    @Override
    public final IllegalArgumentException nullVar(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullVar$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotLoadEmbeddedServerFactory$str() {
        return "WFLYEMB0017: Cannot load embedded server factory: %s";
    }
    @Override
    public final IllegalStateException cannotLoadEmbeddedServerFactory(final ClassNotFoundException arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotLoadEmbeddedServerFactory$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotGetReflectiveMethod$str() {
        return "WFLYEMB0018: Cannot get reflective method '%s' for: %s";
    }
    @Override
    public final IllegalStateException cannotGetReflectiveMethod(final NoSuchMethodException arg0, final String arg1, final String arg2) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotGetReflectiveMethod$str(), arg1, arg2), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCreateStandaloneServer$str() {
        return "WFLYEMB0019: Cannot create standalone server using factory: %s";
    }
    @Override
    public final IllegalStateException cannotCreateStandaloneServer(final Throwable arg0, final Method arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotCreateStandaloneServer$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotSetupEmbeddedServer$str() {
        return "WFLYEMB0020: Cannot setup embedded process";
    }
    @Override
    public final IllegalStateException cannotSetupEmbeddedServer(final Throwable arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotSetupEmbeddedServer$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotStartEmbeddedServer$str() {
        return "WFLYEMB0021: Cannot start embedded process";
    }
    @Override
    public final EmbeddedProcessStartException cannotStartEmbeddedServer(final Throwable arg0) {
        final EmbeddedProcessStartException result = new EmbeddedProcessStartException(String.format(getLoggingLocale(), cannotStartEmbeddedServer$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotInvokeStandaloneServer$str() {
        return "WFLYEMB0022: Cannot invoke '%s' on embedded process";
    }
    @Override
    public final IllegalStateException cannotInvokeStandaloneServer(final Throwable arg0, final String arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotInvokeStandaloneServer$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String processIsStopping$str() {
        return "WFLYEMB0023: The embedded server is stopping and invocations on the ModelControllerClient are not available";
    }
    @Override
    public final IllegalStateException processIsStopping() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), processIsStopping$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String processIsReloading$str() {
        return "WFLYEMB0024: The embedded server is reloading and invocations on the ModelControllerClient are not yet available";
    }
    @Override
    public final IllegalStateException processIsReloading() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), processIsReloading$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotCreateHostController$str() {
        return "WFLYEMB0026: Cannot create host controller using factory: %s";
    }
    @Override
    public final IllegalStateException cannotCreateHostController(final Throwable arg0, final Method arg1) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotCreateHostController$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String processIsStopped$str() {
        return "WFLYEMB0027: The embedded server is stopped and invocations on the ModelControllerClient are not available";
    }
    @Override
    public final IllegalStateException processIsStopped() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), processIsStopped$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorCopyingFile$str() {
        return "WFLYEMB0028: Error copying '%s' to '%s' (%s)";
    }
    @Override
    public final RuntimeException errorCopyingFile(final String arg0, final String arg1, final IOException arg2) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), errorCopyingFile$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String propertySpecifiedFileIsNotADirectory$str() {
        return "WFLYEMB0029: -D%s=%s is not a directory";
    }
    @Override
    public final IllegalArgumentException propertySpecifiedFileIsNotADirectory(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), propertySpecifiedFileIsNotADirectory$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String propertySpecifiedFileDoesNotExist$str() {
        return "WFLYEMB0144: -D%s=%s does not exist";
    }
    @Override
    public final IllegalArgumentException propertySpecifiedFileDoesNotExist(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), propertySpecifiedFileDoesNotExist$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String embeddedServerDirectoryNotFound$str() {
        return "WFLYEMB0143: No directory called '%s' exists under '%s'";
    }
    @Override
    public final IllegalArgumentException embeddedServerDirectoryNotFound(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), embeddedServerDirectoryNotFound$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void moduleLoaderAlreadyConfigured(final String arg0) {
        super.log.logf(FQCN, WARN, null, moduleLoaderAlreadyConfigured$str(), arg0);
    }
    protected String moduleLoaderAlreadyConfigured$str() {
        return "WFLYEMB0145: The module loader has already been configured. Changing the %s property will have no effect.";
    }
    @Override
    public final void failedToRestoreContext(final Throwable arg0, final Context arg1) {
        super.log.logf(FQCN, ERROR, arg0, failedToRestoreContext$str(), arg1);
    }
    protected String failedToRestoreContext$str() {
        return "WFLYEMB0146: Failed to restore context %s";
    }
    @Override
    public final void errorExitingEmbeddedProcess(final Throwable arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, ERROR, arg0, errorExitingEmbeddedProcess$str(), arg1, arg2);
    }
    protected String errorExitingEmbeddedProcess$str() {
        return "WFLYEMB0147: Error exiting embedded %s: %s";
    }
}
