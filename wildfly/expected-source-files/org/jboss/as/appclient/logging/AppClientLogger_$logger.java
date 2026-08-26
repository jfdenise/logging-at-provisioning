package org.jboss.as.appclient.logging;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import org.jboss.vfs.VirtualFile;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.net.URL;
import java.lang.RuntimeException;
import javax.xml.stream.XMLStreamException;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.lang.Class;
import java.util.Arrays;
import java.io.File;
import javax.xml.stream.Location;


import static org.jboss.logging.Logger.Level.ERROR;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:54:03+0200")
public class AppClientLogger_$logger extends DelegatingBasicLogger implements AppClientLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = AppClientLogger_$logger.class.getName();
    public AppClientLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void exceptionRunningAppClient(final Throwable cause, final String exceptionName) {
        super.log.logf(FQCN, ERROR, cause, exceptionRunningAppClient$str(), exceptionName);
    }
    protected String exceptionRunningAppClient$str() {
        return "WFLYAC0002: %s running app client main";
    }
    protected String argAppClientConfig$str() {
        return "Name of the app client configuration file to use (default is \"appclient.xml\")";
    }
    @Override
    public final String argAppClientConfig() {
        return String.format(getLoggingLocale(), argAppClientConfig$str());
    }
    protected String argHelp$str() {
        return "Display this message and exit";
    }
    @Override
    public final String argHelp() {
        return String.format(getLoggingLocale(), argHelp$str());
    }
    protected String argHost$str() {
        return "Set the url of the application server instance to connect to";
    }
    @Override
    public final String argHost() {
        return String.format(getLoggingLocale(), argHost$str());
    }
    protected String argConnectionProperties$str() {
        return "Load ejb-client.properties file from the given url";
    }
    @Override
    public final String argConnectionProperties() {
        return String.format(getLoggingLocale(), argConnectionProperties$str());
    }
    protected String argProperties$str() {
        return "Load system properties from the given url";
    }
    @Override
    public final String argProperties() {
        return String.format(getLoggingLocale(), argProperties$str());
    }
    protected String argSystemProperty$str() {
        return "Set a system property";
    }
    @Override
    public final String argSystemProperty() {
        return String.format(getLoggingLocale(), argSystemProperty$str());
    }
    protected String argVersion$str() {
        return "Print version and exit";
    }
    @Override
    public final String argVersion() {
        return String.format(getLoggingLocale(), argVersion$str());
    }
    protected String argSecMgr$str() {
        return "Runs the container with the security manager enabled.";
    }
    @Override
    public final String argSecMgr() {
        return String.format(getLoggingLocale(), argSecMgr$str());
    }
    protected String usageDescription$str() {
        return "The appclient script starts an application client which can be used to test and access the deployed Jakarta Enterprise Beans.";
    }
    @Override
    public final String usageDescription() {
        return String.format(getLoggingLocale(), usageDescription$str());
    }
    protected String appClientNotSpecified$str() {
        return "WFLYAC0004: You must specify the application client to execute";
    }
    @Override
    public final String appClientNotSpecified() {
        return String.format(getLoggingLocale(), appClientNotSpecified$str());
    }
    protected String argumentExpected$str() {
        return "WFLYAC0005: Argument expected for option %s";
    }
    @Override
    public final String argumentExpected(final String arg) {
        return String.format(getLoggingLocale(), argumentExpected$str(), arg);
    }
    protected String cannotFindAppClient0$str() {
        return "WFLYAC0006: Could not find application client jar in deployment";
    }
    @Override
    public final RuntimeException cannotFindAppClient() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotFindAppClient0$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String cannotFindAppClient1$str() {
        return "WFLYAC0007: Could not find application client %s";
    }
    @Override
    public final DeploymentUnitProcessingException cannotFindAppClient(final String deploymentName) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), cannotFindAppClient1$str(), deploymentName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotLoadAppClientMainClass$str() {
        return "WFLYAC0008: Could not load application client main class";
    }
    @Override
    public final RuntimeException cannotLoadAppClientMainClass(final Throwable cause) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotLoadAppClientMainClass$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotLoadProperties$str() {
        return "WFLYAC0010: Unable to load properties from URL %s";
    }
    @Override
    public final String cannotLoadProperties(final URL url) {
        return String.format(getLoggingLocale(), cannotLoadProperties$str(), url);
    }
    protected String cannotStartAppClient1$str() {
        return "WFLYAC0011: Could not start app client %s as no main class was found";
    }
    @Override
    public final RuntimeException cannotStartAppClient(final String deploymentName) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotStartAppClient1$str(), deploymentName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotStartAppClient2$str() {
        return "WFLYAC0012: Could not start app client %s as no main method was found on main class %s";
    }
    @Override
    public final RuntimeException cannotStartAppClient(final String deploymentName, final Class<?> mainClass) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotStartAppClient2$str(), deploymentName, mainClass));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateSubsystemDeclaration$str() {
        return "WFLYAC0013: Duplicate subsystem declaration";
    }
    @Override
    public final XMLStreamException duplicateSubsystemDeclaration(final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), duplicateSubsystemDeclaration$str()), location);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParseXml1$str() {
        return "WFLYAC0015: Failed to parse %s";
    }
    @Override
    public final DeploymentUnitProcessingException failedToParseXml(final Throwable cause, final VirtualFile appXml) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToParseXml1$str(), appXml), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToParseXml3$str() {
        return "WFLYAC0016: Failed to parse %s at [%d,%d]";
    }
    @Override
    public final DeploymentUnitProcessingException failedToParseXml(final Throwable cause, final VirtualFile appXml, final int lineNumber, final int columnNumber) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToParseXml3$str(), appXml, lineNumber, columnNumber), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String malformedUrl$str() {
        return "WFLYAC0017: Malformed URL provided for option %s";
    }
    @Override
    public final String malformedUrl(final String arg) {
        return String.format(getLoggingLocale(), malformedUrl$str(), arg);
    }
    protected String multipleAppClientsFound$str() {
        return "WFLYAC0018: More than one application client found and no app client name specified";
    }
    @Override
    public final RuntimeException multipleAppClientsFound() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), multipleAppClientsFound$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownOption$str() {
        return "WFLYAC0020: Unknown option %s";
    }
    @Override
    public final String unknownOption(final String option) {
        return String.format(getLoggingLocale(), unknownOption$str(), option);
    }
    protected String couldNotLoadCallbackClass$str() {
        return "WFLYAC0021: Could not load callback-handler class %s";
    }
    @Override
    public final DeploymentUnitProcessingException couldNotLoadCallbackClass(final String clazz) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), couldNotLoadCallbackClass$str(), clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateCallbackHandler$str() {
        return "WFLYAC0022: Could not create instance of callback-handler class %s";
    }
    @Override
    public final DeploymentUnitProcessingException couldNotCreateCallbackHandler(final String clazz) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), couldNotCreateCallbackHandler$str(), clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotFindAppClientFile$str() {
        return "WFLYAC0023: Could not find application client %s";
    }
    @Override
    public final RuntimeException cannotFindAppClientFile(final File deploymentName) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotFindAppClientFile$str(), deploymentName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotSpecifyBothHostAndPropertiesFile$str() {
        return "WFLYAC0024: Cannot specify both a host to connect to and an ejb-client.properties file. ";
    }
    @Override
    public final RuntimeException cannotSpecifyBothHostAndPropertiesFile() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotSpecifyBothHostAndPropertiesFile$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
