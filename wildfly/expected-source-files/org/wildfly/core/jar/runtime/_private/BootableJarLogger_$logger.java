package org.wildfly.core.jar.runtime._private;

import java.util.Locale;
import java.nio.file.Path;
import java.lang.IllegalStateException;
import java.io.Serializable;
import org.jboss.modules.ModuleLoader;
import javax.annotation.processing.Generated;
import java.util.Set;
import org.jboss.as.version.Stability;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import java.io.IOException;
import org.jboss.logging.Logger;
import java.lang.Exception;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.util.List;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:32:41+0200")
public class BootableJarLogger_$logger extends DelegatingBasicLogger implements BootableJarLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = BootableJarLogger_$logger.class.getName();
    public BootableJarLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void shuttingDown() {
        super.log.logf(FQCN, DEBUG, null, shuttingDown$str());
    }
    protected String shuttingDown$str() {
        return "WFLYJAR0001: Shutting down";
    }
    @Override
    public final void serverStopped() {
        super.log.logf(FQCN, DEBUG, null, serverStopped$str());
    }
    protected String serverStopped$str() {
        return "WFLYJAR0002: Server stopped, exiting";
    }
    @Override
    public final void serverNotStopped() {
        super.log.logf(FQCN, DEBUG, null, serverNotStopped$str());
    }
    protected String serverNotStopped$str() {
        return "WFLYJAR0003: Server not yet stopped, waiting";
    }
    @Override
    public final void nullController() {
        super.log.logf(FQCN, DEBUG, null, nullController$str());
    }
    protected String nullController$str() {
        return "WFLYJAR0004: Null controller client, exiting";
    }
    protected String unexpectedExceptionWhileShuttingDown$str() {
        return "WFLYJAR0005: Unexpected exception while shutting down server";
    }
    @Override
    public final RuntimeException unexpectedExceptionWhileShuttingDown(final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unexpectedExceptionWhileShuttingDown$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void installDeployment(final Path dep) {
        super.log.logf(FQCN, INFO, null, installDeployment$str(), dep);
    }
    protected String installDeployment$str() {
        return "WFLYJAR0006: Deployed %s in server";
    }
    @Override
    public final void advertiseInstall(final Path home, final long duration) {
        super.log.logf(FQCN, INFO, null, advertiseInstall$str(), home, duration);
    }
    protected String advertiseInstall$str() {
        return "WFLYJAR0007: Installed server and application in %s, took %sms";
    }
    @Override
    public final void advertiseOptions(final List<String> options) {
        super.log.logf(FQCN, INFO, null, advertiseOptions$str(), options);
    }
    protected String advertiseOptions$str() {
        return "WFLYJAR0008: Server options: %s";
    }
    @Override
    public final void deletingHome(final Path dep) {
        super.log.logf(FQCN, DEBUG, null, deletingHome$str(), dep);
    }
    protected String deletingHome$str() {
        return "WFLYJAR0009: Deleting %s dir";
    }
    protected String deploymentAlreadyExist$str() {
        return "WFLYJAR0010: Not an hollow jar, deployment already exists";
    }
    @Override
    public final Exception deploymentAlreadyExist() {
        final Exception result = new Exception(String.format(getLoggingLocale(), deploymentAlreadyExist$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownArgument$str() {
        return "WFLYJAR0011: Unknown argument %s";
    }
    @Override
    public final RuntimeException unknownArgument(final String arg) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unknownArgument$str(), arg));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notExistingFile$str() {
        return "WFLYJAR0012: File %s doesn't exist";
    }
    @Override
    public final RuntimeException notExistingFile(final String file) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), notExistingFile$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidArgument$str() {
        return "WFLYJAR0013: Invalid argument %s, no value provided";
    }
    @Override
    public final RuntimeException invalidArgument(final String arg) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), invalidArgument$str(), arg));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String processIsStopping$str() {
        return "WFLYJAR0014: The server is stopping and invocations on the ModelControllerClient are not available";
    }
    @Override
    public final IllegalStateException processIsStopping() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), processIsStopping$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String processIsReloading$str() {
        return "WFLYJAR0015: The server is reloading and invocations on the ModelControllerClient are not yet available";
    }
    @Override
    public final IllegalStateException processIsReloading() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), processIsReloading$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String processIsStopped$str() {
        return "WFLYJAR0016: The server is stopped and invocations on the ModelControllerClient are not available";
    }
    @Override
    public final IllegalStateException processIsStopped() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), processIsStopped$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotStartServer$str() {
        return "WFLYJAR0017: Cannot start server";
    }
    @Override
    public final RuntimeException cannotStartServer(final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotStartServer$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String moduleLoaderError$str() {
        return "WFLYJAR0018: Cannot load module %s from: %s";
    }
    @Override
    public final RuntimeException moduleLoaderError(final Throwable cause, final String msg, final ModuleLoader moduleLoader) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), moduleLoaderError$str(), msg, moduleLoader), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void cantRestartServer() {
        super.log.logf(FQCN, WARN, null, cantRestartServer$str());
    }
    protected String cantRestartServer$str() {
        return "WFLYJAR0019: Cannot restart server, exiting";
    }
    @Override
    public final void cantDelete(final String path, final IOException ioex) {
        super.log.logf(FQCN, WARN, null, cantDelete$str(), path, ioex);
    }
    protected String cantDelete$str() {
        return "WFLYJAR0020: Can't delete %s. Exception %s";
    }
    @Override
    public final void cantRegisterModuleMBeans(final Exception ex) {
        super.log.logf(FQCN, WARN, null, cantRegisterModuleMBeans$str(), ex);
    }
    protected String cantRegisterModuleMBeans$str() {
        return "WFLYJAR0021: Cannot register JBoss Modules MBeans, %s";
    }
    protected String pidFileAlreadyExists$str() {
        return "WFLYJAR0022: The PID file %s already exists. This may result in the install directory \"%s\" not being properly deleted.";
    }
    @Override
    public final IllegalStateException pidFileAlreadyExists(final Path pidFile, final Path installDir) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), pidFileAlreadyExists$str(), pidFile, installDir));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToStartCleanupProcess(final Throwable cause, final Path installDir) {
        super.log.logf(FQCN, WARN, cause, failedToStartCleanupProcess$str(), installDir);
    }
    protected String failedToStartCleanupProcess$str() {
        return "WFLYJAR0023: Failed to start the cleanup processor. This may result in the install directory \"%s\" not being properly deleted.";
    }
    @Override
    public final void cleanupTimeout(final long timeout, final Path installDir) {
        super.log.logf(FQCN, WARN, null, cleanupTimeout$str(), timeout, installDir);
    }
    protected String cleanupTimeout$str() {
        return "WFLYJAR0024: The container has not properly shutdown within %ds. This may result in the install directory \"%s\" not being properly deleted.";
    }
    protected String argPublicBindAddress$str() {
        return "Set system property jboss.bind.address to the given value";
    }
    @Override
    public final String argPublicBindAddress() {
        return String.format(getLoggingLocale(), argPublicBindAddress$str());
    }
    protected String argInterfaceBindAddress$str() {
        return "Set system property jboss.bind.address.<interface> to the given value";
    }
    @Override
    public final String argInterfaceBindAddress() {
        return String.format(getLoggingLocale(), argInterfaceBindAddress$str());
    }
    protected String argSystem$str() {
        return "Set a system property";
    }
    @Override
    public final String argSystem() {
        return String.format(getLoggingLocale(), argSystem$str());
    }
    protected String argHelp$str() {
        return "Display this message and exit";
    }
    @Override
    public final String argHelp() {
        return String.format(getLoggingLocale(), argHelp$str());
    }
    protected String argProperties$str() {
        return "Load system properties from the given url";
    }
    @Override
    public final String argProperties() {
        return String.format(getLoggingLocale(), argProperties$str());
    }
    protected String argDefaultMulticastAddress$str() {
        return "Set system property jboss.default.multicast.address to the given value";
    }
    @Override
    public final String argDefaultMulticastAddress() {
        return String.format(getLoggingLocale(), argDefaultMulticastAddress$str());
    }
    protected String argVersion$str() {
        return "Print version and exit";
    }
    @Override
    public final String argVersion() {
        return String.format(getLoggingLocale(), argVersion$str());
    }
    protected String argSecurityManager$str() {
        return "Activate the SecurityManager";
    }
    @Override
    public final String argSecurityManager() {
        return String.format(getLoggingLocale(), argSecurityManager$str());
    }
    protected String argStability$str() {
        return "Runs the server using a specific stability level. Possible values: %s, Default = %s";
    }
    @Override
    public final String argStability(final Set<Stability> levels, final Stability defaultLevel) {
        return String.format(getLoggingLocale(), argStability$str(), levels, defaultLevel);
    }
    protected String argSecurityProperty$str() {
        return "Set a security property";
    }
    @Override
    public final String argSecurityProperty() {
        return String.format(getLoggingLocale(), argSecurityProperty$str());
    }
    protected String argDeployment$str() {
        return "Path to deployment artifact (war,jar,ear or exploded deployment dir) to deploy in hollow jar";
    }
    @Override
    public final String argDeployment() {
        return String.format(getLoggingLocale(), argDeployment$str());
    }
    protected String argInstallation$str() {
        return "Path to directory in which the server is installed. By default the server is installed in TEMP directory.";
    }
    @Override
    public final String argInstallation() {
        return String.format(getLoggingLocale(), argInstallation$str());
    }
    protected String argDisplayGalleonConfig$str() {
        return "Display the content of the Galleon configuration used to build this bootable JAR";
    }
    @Override
    public final String argDisplayGalleonConfig() {
        return String.format(getLoggingLocale(), argDisplayGalleonConfig$str());
    }
    protected String argCliScript$str() {
        return "Path to a CLI script to execute when starting the Bootable JAR";
    }
    @Override
    public final String argCliScript() {
        return String.format(getLoggingLocale(), argCliScript$str());
    }
    @Override
    public final void securityProviderFailed(final Throwable ex) {
        super.log.logf(FQCN, DEBUG, null, securityProviderFailed$str(), ex);
    }
    protected String securityProviderFailed$str() {
        return "WFLYJAR0025: Failed to initialize a security provider. Reason: %s";
    }
    @Override
    public final void advertiseSerialFilterSet() {
        super.log.logf(FQCN, INFO, null, advertiseSerialFilterSet$str());
    }
    protected String advertiseSerialFilterSet$str() {
        return "WFLYJAR0026: The JDK_SERIAL_FILTER environment variable is being ignored because the global ObjectInputFilter was already configured by the jdk.serialFilter system or security property";
    }
}
