package org.wildfly.extension.undertow.logging;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import org.jboss.vfs.VirtualFile;
import java.lang.IllegalStateException;
import java.io.Serializable;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import java.security.NoSuchAlgorithmException;
import org.jboss.logging.Logger;
import org.jboss.msc.service.DuplicateServiceException;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import java.util.List;
import org.jboss.msc.service.StartException;
import java.lang.ClassNotFoundException;
import java.lang.IllegalArgumentException;
import org.jboss.jandex.AnnotationTarget;
import java.nio.file.Path;
import javax.annotation.processing.Generated;
import org.jboss.as.controller.OperationFailedException;
import java.io.IOException;
import java.lang.Exception;
import java.lang.Integer;
import org.jboss.msc.service.ServiceName;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.util.Arrays;
import java.io.File;
import org.jboss.as.server.deployment.DeploymentUnit;
import org.jboss.jandex.ClassInfo;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:57:29+0200")
public class UndertowLogger_$logger extends DelegatingBasicLogger implements UndertowLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = UndertowLogger_$logger.class.getName();
    public UndertowLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void couldNotInitJsp(final ClassNotFoundException e) {
        super.log.logf(FQCN, ERROR, e, couldNotInitJsp$str());
    }
    protected String couldNotInitJsp$str() {
        return "WFLYUT0001: Could not initialize Jakarta Server Pages";
    }
    @Override
    public final void serverStarting(final String version) {
        super.log.logf(FQCN, INFO, null, serverStarting$str(), version);
    }
    protected String serverStarting$str() {
        return "WFLYUT0003: Undertow %s starting";
    }
    @Override
    public final void serverStopping(final String version) {
        super.log.logf(FQCN, INFO, null, serverStopping$str(), version);
    }
    protected String serverStopping$str() {
        return "WFLYUT0004: Undertow %s stopping";
    }
    @Override
    public final void secureListenerNotAvailableForPort(final String protocol) {
        super.log.logf(FQCN, WARN, null, secureListenerNotAvailableForPort$str(), protocol);
    }
    protected String secureListenerNotAvailableForPort$str() {
        return "WFLYUT0005: Secure listener for protocol: '%s' not found! Using non secure port!";
    }
    @Override
    public final void listenerStarted(final String type, final String name, final String address, final int port) {
        super.log.logf(FQCN, INFO, null, listenerStarted$str(), type, name, address, port);
    }
    protected String listenerStarted$str() {
        return "WFLYUT0006: Undertow %s listener %s listening on %s:%d";
    }
    @Override
    public final void listenerStopped(final String type, final String name, final String address, final int port) {
        super.log.logf(FQCN, INFO, null, listenerStopped$str(), type, name, address, port);
    }
    protected String listenerStopped$str() {
        return "WFLYUT0007: Undertow %s listener %s stopped, was bound to %s:%d";
    }
    @Override
    public final void listenerSuspend(final String type, final String name) {
        super.log.logf(FQCN, INFO, null, listenerSuspend$str(), type, name);
    }
    protected String listenerSuspend$str() {
        return "WFLYUT0008: Undertow %s listener %s suspending";
    }
    @Override
    public final void cannotLoadDesignatedHandleTypes(final ClassInfo classInfo, final Exception e) {
        super.log.logf(FQCN, INFO, e, cannotLoadDesignatedHandleTypes$str(), classInfo);
    }
    protected String cannotLoadDesignatedHandleTypes$str() {
        return "WFLYUT0009: Could not load class designated by HandlesTypes [%s].";
    }
    @Override
    public final void couldNotLoadWebSocketEndpoint(final String s, final Exception e) {
        super.log.logf(FQCN, WARN, e, couldNotLoadWebSocketEndpoint$str(), s);
    }
    protected String couldNotLoadWebSocketEndpoint$str() {
        return "WFLYUT0010: Could not load web socket endpoint %s.";
    }
    @Override
    public final void couldNotLoadWebSocketConfig(final String s, final Exception e) {
        super.log.logf(FQCN, WARN, e, couldNotLoadWebSocketConfig$str(), s);
    }
    protected String couldNotLoadWebSocketConfig$str() {
        return "WFLYUT0011: Could not load web socket application config %s.";
    }
    @Override
    public final void startedServer(final String name) {
        super.log.logf(FQCN, INFO, null, startedServer$str(), name);
    }
    protected String startedServer$str() {
        return "WFLYUT0012: Started server %s.";
    }
    @Override
    public final void invalidRedirectURI(final Throwable cause) {
        super.log.logf(FQCN, WARN, cause, invalidRedirectURI$str());
    }
    protected String invalidRedirectURI$str() {
        return "WFLYUT0013: Could not create redirect URI.";
    }
    @Override
    public final void creatingFileHandler(final String path, final boolean directoryListing, final boolean followSymlink, final boolean caseSensitive, final List<String> safePaths) {
        super.log.logf(FQCN, INFO, null, creatingFileHandler$str(), path, directoryListing, followSymlink, caseSensitive, safePaths);
    }
    protected String creatingFileHandler$str() {
        return "WFLYUT0014: Creating file handler for path '%s' with options [directory-listing: '%s', follow-symlink: '%s', case-sensitive: '%s', safe-symlink-paths: '%s']";
    }
    @Override
    public final void invalidAbsoluteOrdering(final String name) {
        super.log.logf(FQCN, WARN, null, invalidAbsoluteOrdering$str(), name);
    }
    protected String invalidAbsoluteOrdering$str() {
        return "WFLYUT0016: Could not resolve name in absolute ordering: %s";
    }
    @Override
    public final void couldNotDeleteTempFile(final File file) {
        super.log.logf(FQCN, WARN, null, couldNotDeleteTempFile$str(), file);
    }
    protected String couldNotDeleteTempFile$str() {
        return "WFLYUT0017: Could not delete servlet temp file %s";
    }
    @Override
    public final void hostStarting(final String version) {
        super.log.logf(FQCN, INFO, null, hostStarting$str(), version);
    }
    protected String hostStarting$str() {
        return "WFLYUT0018: Host %s starting";
    }
    @Override
    public final void hostStopping(final String version) {
        super.log.logf(FQCN, INFO, null, hostStopping$str(), version);
    }
    protected String hostStopping$str() {
        return "WFLYUT0019: Host %s stopping";
    }
    @Override
    public final void clusteringNotSupported() {
        super.log.logf(FQCN, WARN, null, clusteringNotSupported$str());
    }
    protected String clusteringNotSupported$str() {
        return "WFLYUT0020: Clustering not supported, falling back to non-clustered session manager";
    }
    @Override
    public final void registerWebapp(final String webappPath, final String serverName) {
        super.log.logf(FQCN, INFO, null, registerWebapp$str(), webappPath, serverName);
    }
    protected String registerWebapp$str() {
        return "WFLYUT0021: Registered web context: '%s' for server '%s'";
    }
    @Override
    public final void unregisterWebapp(final String webappPath, final String serverName) {
        super.log.logf(FQCN, INFO, null, unregisterWebapp$str(), webappPath, serverName);
    }
    protected String unregisterWebapp$str() {
        return "WFLYUT0022: Unregistered web context: '%s' from server '%s'";
    }
    @Override
    public final void skippedSCI(final String jar, final Exception e) {
        super.log.logf(FQCN, INFO, e, skippedSCI$str(), jar);
    }
    protected String skippedSCI$str() {
        return "WFLYUT0023: Skipped SCI for jar: %s.";
    }
    @Override
    public final void failedToPersistSessionAttribute(final String attributeName, final Object value, final String sessionID, final Exception e) {
        super.log.logf(FQCN, WARN, e, failedToPersistSessionAttribute$str(), attributeName, value, sessionID);
    }
    protected String failedToPersistSessionAttribute$str() {
        return "WFLYUT0024: Failed to persist session attribute %s with value %s for session %s";
    }
    protected String failToParseXMLDescriptor3$str() {
        return "WFLYUT0027: Failed to parse XML descriptor %s at [%s,%s]";
    }
    @Override
    public final String failToParseXMLDescriptor(final String xmlFile, final Integer line, final Integer column) {
        return String.format(getLoggingLocale(), failToParseXMLDescriptor3$str(), xmlFile, line, column);
    }
    protected String failToParseXMLDescriptor1$str() {
        return "WFLYUT0028: Failed to parse XML descriptor %s";
    }
    @Override
    public final String failToParseXMLDescriptor(final String xmlFile) {
        return String.format(getLoggingLocale(), failToParseXMLDescriptor1$str(), xmlFile);
    }
    protected String invalidWebServletAnnotation$str() {
        return "WFLYUT0029: @WebServlet is only allowed at class level %s";
    }
    @Override
    public final String invalidWebServletAnnotation(final AnnotationTarget target) {
        return String.format(getLoggingLocale(), invalidWebServletAnnotation$str(), target);
    }
    protected String invalidWebInitParamAnnotation$str() {
        return "WFLYUT0030: @WebInitParam requires name and value on %s";
    }
    @Override
    public final String invalidWebInitParamAnnotation(final AnnotationTarget target) {
        return String.format(getLoggingLocale(), invalidWebInitParamAnnotation$str(), target);
    }
    protected String invalidWebFilterAnnotation$str() {
        return "WFLYUT0031: @WebFilter is only allowed at class level %s";
    }
    @Override
    public final String invalidWebFilterAnnotation(final AnnotationTarget target) {
        return String.format(getLoggingLocale(), invalidWebFilterAnnotation$str(), target);
    }
    protected String invalidWebListenerAnnotation$str() {
        return "WFLYUT0032: @WebListener is only allowed at class level %s";
    }
    @Override
    public final String invalidWebListenerAnnotation(final AnnotationTarget target) {
        return String.format(getLoggingLocale(), invalidWebListenerAnnotation$str(), target);
    }
    protected String invalidRunAsAnnotation$str() {
        return "WFLYUT0033: @RunAs needs to specify a role name on %s";
    }
    @Override
    public final String invalidRunAsAnnotation(final AnnotationTarget target) {
        return String.format(getLoggingLocale(), invalidRunAsAnnotation$str(), target);
    }
    protected String invalidDeclareRolesAnnotation$str() {
        return "WFLYUT0034: @DeclareRoles needs to specify role names on %s";
    }
    @Override
    public final String invalidDeclareRolesAnnotation(final AnnotationTarget target) {
        return String.format(getLoggingLocale(), invalidDeclareRolesAnnotation$str(), target);
    }
    protected String invalidMultipartConfigAnnotation$str() {
        return "WFLYUT0035: @MultipartConfig is only allowed at class level %s";
    }
    @Override
    public final String invalidMultipartConfigAnnotation(final AnnotationTarget target) {
        return String.format(getLoggingLocale(), invalidMultipartConfigAnnotation$str(), target);
    }
    protected String invalidServletSecurityAnnotation$str() {
        return "WFLYUT0036: @ServletSecurity is only allowed at class level %s";
    }
    @Override
    public final String invalidServletSecurityAnnotation(final AnnotationTarget target) {
        return String.format(getLoggingLocale(), invalidServletSecurityAnnotation$str(), target);
    }
    protected String wrongComponentType$str() {
        return "WFLYUT0037: %s has the wrong component type, it cannot be used as a web component";
    }
    @Override
    public final RuntimeException wrongComponentType(final String clazz) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), wrongComponentType$str(), clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String tldFileNotContainedInRoot$str() {
        return "WFLYUT0038: TLD file %s not contained in root %s";
    }
    @Override
    public final String tldFileNotContainedInRoot(final String tldPath, final String rootPath) {
        return String.format(getLoggingLocale(), tldFileNotContainedInRoot$str(), tldPath, rootPath);
    }
    protected String failedToResolveModule$str() {
        return "WFLYUT0039: Failed to resolve module for deployment %s";
    }
    @Override
    public final DeploymentUnitProcessingException failedToResolveModule(final DeploymentUnit deploymentUnit) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToResolveModule$str(), deploymentUnit));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidMultipleOthers$str() {
        return "WFLYUT0040: Duplicate others in absolute ordering";
    }
    @Override
    public final String invalidMultipleOthers() {
        return String.format(getLoggingLocale(), invalidMultipleOthers$str());
    }
    protected String invalidRelativeOrdering0$str() {
        return "WFLYUT0041: Invalid relative ordering";
    }
    @Override
    public final String invalidRelativeOrdering() {
        return String.format(getLoggingLocale(), invalidRelativeOrdering0$str());
    }
    protected String invalidWebFragment$str() {
        return "WFLYUT0042: Conflict occurred processing web fragment in JAR: %s";
    }
    @Override
    public final String invalidWebFragment(final String jar) {
        return String.format(getLoggingLocale(), invalidWebFragment$str(), jar);
    }
    protected String invalidRelativeOrdering1$str() {
        return "WFLYUT0043: Relative ordering processing error with JAR: %s";
    }
    @Override
    public final String invalidRelativeOrdering(final String jar) {
        return String.format(getLoggingLocale(), invalidRelativeOrdering1$str(), jar);
    }
    protected String invalidRelativeOrderingBeforeAndAfter$str() {
        return "WFLYUT0044: Ordering includes both before and after others in JAR: %s";
    }
    @Override
    public final String invalidRelativeOrderingBeforeAndAfter(final String jar) {
        return String.format(getLoggingLocale(), invalidRelativeOrderingBeforeAndAfter$str(), jar);
    }
    protected String invalidRelativeOrderingDuplicateName$str() {
        return "WFLYUT0045: Duplicate name declared in JAR: %s";
    }
    @Override
    public final String invalidRelativeOrderingDuplicateName(final String jar) {
        return String.format(getLoggingLocale(), invalidRelativeOrderingDuplicateName$str(), jar);
    }
    @Override
    public final void invalidRelativeOrderingUnknownName(final String jar) {
        super.log.logf(FQCN, WARN, null, invalidRelativeOrderingUnknownName$str(), jar);
    }
    protected String invalidRelativeOrderingUnknownName$str() {
        return "WFLYUT0046: Unknown web fragment name declared in JAR: %s";
    }
    protected String invalidRelativeOrderingConflict$str() {
        return "WFLYUT0047: Relative ordering conflict with JAR: %s";
    }
    @Override
    public final String invalidRelativeOrderingConflict(final String jar) {
        return String.format(getLoggingLocale(), invalidRelativeOrderingConflict$str(), jar);
    }
    protected String failToProcessWebInfLib$str() {
        return "WFLYUT0048: Failed to process WEB-INF/lib: %s";
    }
    @Override
    public final String failToProcessWebInfLib(final VirtualFile xmlFile) {
        return String.format(getLoggingLocale(), failToProcessWebInfLib$str(), xmlFile);
    }
    protected String errorLoadingSCIFromModule$str() {
        return "WFLYUT0049: Error loading SCI from module: %s";
    }
    @Override
    public final DeploymentUnitProcessingException errorLoadingSCIFromModule(final String identifier, final Exception e) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), errorLoadingSCIFromModule$str(), identifier), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToResolveAnnotationIndex$str() {
        return "WFLYUT0050: Unable to resolve annotation index for deployment unit: %s";
    }
    @Override
    public final DeploymentUnitProcessingException unableToResolveAnnotationIndex(final DeploymentUnit deploymentUnit) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), unableToResolveAnnotationIndex$str(), deploymentUnit));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorProcessingSCI$str() {
        return "WFLYUT0051: Deployment error processing SCI for jar: %s";
    }
    @Override
    public final DeploymentUnitProcessingException errorProcessingSCI(final String jar, final Exception e) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), errorProcessingSCI$str(), jar), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownMetric$str() {
        return "WFLYUT0054: Unknown metric %s";
    }
    @Override
    public final String unknownMetric(final Object metric) {
        return String.format(getLoggingLocale(), unknownMetric$str(), metric);
    }
    protected String nullDefaultHost$str() {
        return "WFLYUT0055: Null default host";
    }
    @Override
    public final IllegalArgumentException nullDefaultHost() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullDefaultHost$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullHostName$str() {
        return "WFLYUT0056: Null host name";
    }
    @Override
    public final IllegalStateException nullHostName() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), nullHostName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidPersistentSessionDir$str() {
        return "WFLYUT0060: Invalid persistent sessions directory %s";
    }
    @Override
    public final StartException invalidPersistentSessionDir(final File baseDir) {
        final StartException result = new StartException(String.format(getLoggingLocale(), invalidPersistentSessionDir$str(), baseDir));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToCreatePersistentSessionDir$str() {
        return "WFLYUT0061: Failed to create persistent sessions dir %s";
    }
    @Override
    public final StartException failedToCreatePersistentSessionDir(final File baseDir) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToCreatePersistentSessionDir$str(), baseDir));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYUT0062: Could not create log directory: %s";
    }
    @Override
    public final StartException couldNotCreateLogDirectory(final Path directory, final IOException e) {
        final StartException result = new StartException(String.format(getLoggingLocale(), couldNotCreateLogDirectory$str(), directory), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noPortListeningForProtocol$str() {
        return "WFLYUT0063: Could not find the port number listening for protocol %s";
    }
    @Override
    public final IllegalStateException noPortListeningForProtocol(final String protocol) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noPortListeningForProtocol$str(), protocol));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToConfigureHandler$str() {
        return "WFLYUT0064: Failed to configure handler %s";
    }
    @Override
    public final RuntimeException failedToConfigureHandler(final Class<?> handlerClass, final Exception e) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToConfigureHandler$str(), handlerClass), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String handlerWasNotAHandlerOrWrapper$str() {
        return "WFLYUT0065: Handler class %s was not a handler or a wrapper";
    }
    @Override
    public final IllegalArgumentException handlerWasNotAHandlerOrWrapper(final Class<?> handlerClass) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), handlerWasNotAHandlerOrWrapper$str(), handlerClass));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToConfigureHandlerClass$str() {
        return "WFLYUT0066: Failed to configure handler %s";
    }
    @Override
    public final RuntimeException failedToConfigureHandlerClass(final String handlerClass, final Exception e) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToConfigureHandlerClass$str(), handlerClass), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String servletClassNotDefined$str() {
        return "WFLYUT0067: Servlet class not defined for servlet %s";
    }
    @Override
    public final IllegalArgumentException servletClassNotDefined(final String servletName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), servletClassNotDefined$str(), servletName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void sharedSessionConfigNotInRootDeployment(final String deployment) {
        super.log.logf(FQCN, ERROR, null, sharedSessionConfigNotInRootDeployment$str(), deployment);
    }
    protected String sharedSessionConfigNotInRootDeployment$str() {
        return "WFLYUT0069: Ignoring shared-session-config in jboss-all.xml in deployment %s. This entry is only valid in top level deployments.";
    }
    protected String couldNotLoadHandlerFromModule$str() {
        return "WFLYUT0070: Could not load handler %s from %s module";
    }
    @Override
    public final RuntimeException couldNotLoadHandlerFromModule(final String className, final String moduleName, final Exception e) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), couldNotLoadHandlerFromModule$str(), className, moduleName), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void alpnNotFound(final String listener) {
        super.log.logf(FQCN, WARN, null, alpnNotFound$str(), listener);
    }
    protected String alpnNotFound$str() {
        return "WFLYUT0071: No ALPN provider found, HTTP/2 will not be enabled. To remove this message set enable-http2 to false on the listener %s in the Undertow subsystem.";
    }
    protected String couldNotFindExternalPath$str() {
        return "WFLYUT0072: Could not find configured external path %s";
    }
    @Override
    public final DeploymentUnitProcessingException couldNotFindExternalPath(final File path) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), couldNotFindExternalPath$str(), path));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String advertiseSocketBindingRequiresMulticastAddress$str() {
        return "WFLYUT0073: mod_cluster advertise socket binding requires multicast address to be set";
    }
    @Override
    public final IllegalArgumentException advertiseSocketBindingRequiresMulticastAddress() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), advertiseSocketBindingRequiresMulticastAddress$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void tldNotFound(final String location) {
        super.log.logf(FQCN, ERROR, null, tldNotFound$str(), location);
    }
    protected String tldNotFound$str() {
        return "WFLYUT0074: Could not find TLD %s";
    }
    @Override
    public final void failedToRegisterWebsocket(final Class endpoint, final String path, final Exception e) {
        super.log.logf(FQCN, ERROR, e, failedToRegisterWebsocket$str(), endpoint, path);
    }
    protected String failedToRegisterWebsocket$str() {
        return "WFLYUT0078: Failed to register management view for websocket %s at %s";
    }
    @Override
    public final void unsupportedValveFeature(final String valve) {
        super.log.logf(FQCN, WARN, null, unsupportedValveFeature$str(), valve);
    }
    protected String unsupportedValveFeature$str() {
        return "WFLYUT0080: Valves are no longer supported, %s is not activated.";
    }
    @Override
    public final void distributableDisabledInFragmentXml(final String deployment, final String module) {
        super.log.logf(FQCN, WARN, null, distributableDisabledInFragmentXml$str(), deployment, module);
    }
    protected String distributableDisabledInFragmentXml$str() {
        return "WFLYUT0081: The deployment %s will not be distributable because this feature is disabled in web-fragment.xml of the module %s.";
    }
    protected String couldNotStartListener$str() {
        return "WFLYUT0082: Could not start '%s' listener.";
    }
    @Override
    public final StartException couldNotStartListener(final String name, final IOException e) {
        final StartException result = new StartException(String.format(getLoggingLocale(), couldNotStartListener$str(), name), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullNotAllowed$str() {
        return "WFLYUT0083: %s is not allowed to be null";
    }
    @Override
    public final String nullNotAllowed(final String name) {
        return String.format(getLoggingLocale(), nullNotAllowed$str(), name);
    }
    protected String duplicateDefaultWebModuleMapping$str() {
        return "WFLYUT0087: Duplicate default web module '%s' configured on server '%s', host '%s'";
    }
    @Override
    public final IllegalArgumentException duplicateDefaultWebModuleMapping(final String defaultDeploymentName, final String serverName, final String hostName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), duplicateDefaultWebModuleMapping$str(), defaultDeploymentName, serverName, hostName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String predicateNotValid$str() {
        return "WFLYUT0089: Predicate %s was not valid, message was: %s";
    }
    @Override
    public final String predicateNotValid(final String predicate, final String error) {
        return String.format(getLoggingLocale(), predicateNotValid$str(), predicate, error);
    }
    protected String missingKeyStoreEntry$str() {
        return "WFLYUT0090: Key alias %s does not exist in the configured key store";
    }
    @Override
    public final IllegalArgumentException missingKeyStoreEntry(final String alias) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), missingKeyStoreEntry$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String keyStoreEntryNotPrivate$str() {
        return "WFLYUT0091: Key store entry %s is not a private key entry";
    }
    @Override
    public final IllegalArgumentException keyStoreEntryNotPrivate(final String alias) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), keyStoreEntryNotPrivate$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingCredential$str() {
        return "WFLYUT0092: Credential alias %s does not exist in the configured credential store";
    }
    @Override
    public final IllegalArgumentException missingCredential(final String alias) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), missingCredential$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String credentialNotClearPassword$str() {
        return "WFLYUT0093: Credential %s is not a clear text password";
    }
    @Override
    public final IllegalArgumentException credentialNotClearPassword(final String alias) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), credentialNotClearPassword$str(), alias));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void configurationOptionIgnoredWhenUsingElytron(final String option) {
        super.log.logf(FQCN, WARN, null, configurationOptionIgnoredWhenUsingElytron$str(), option);
    }
    protected String configurationOptionIgnoredWhenUsingElytron$str() {
        return "WFLYUT0094: Configuration option [%s] ignored when using Elytron subsystem";
    }
    protected String unableAddHandlerForPath$str() {
        return "WFLYUT0095: the path ['%s'] doesn't exist on file system";
    }
    @Override
    public final String unableAddHandlerForPath(final String path) {
        return String.format(getLoggingLocale(), unableAddHandlerForPath$str(), path);
    }
    protected String workerValueInHTTPListenerMustMatchRemoting$str() {
        return "WFLYUT0097: If http-upgrade is enabled, remoting worker and http(s) worker must be the same. Please adjust values if need be.";
    }
    @Override
    public final String workerValueInHTTPListenerMustMatchRemoting() {
        return String.format(getLoggingLocale(), workerValueInHTTPListenerMustMatchRemoting$str());
    }
    protected String sessionManagerNotAvailable$str() {
        return "WFLYUT0099: Session manager not available";
    }
    @Override
    public final OperationFailedException sessionManagerNotAvailable() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), sessionManagerNotAvailable$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String sessionNotFound$str() {
        return "WFLYUT0100: Session %s not found";
    }
    @Override
    public final OperationFailedException sessionNotFound(final String sessionId) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), sessionNotFound$str(), sessionId));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void duplicateServletMapping(final String mapping) {
        super.log.logf(FQCN, WARN, null, duplicateServletMapping$str(), mapping);
    }
    protected String duplicateServletMapping$str() {
        return "WFLYUT0101: Duplicate servlet mapping %s found";
    }
    protected String invalidDateTimeFormatterPattern$str() {
        return "WFLYUT0102: The pattern %s is not a valid date pattern.";
    }
    @Override
    public final OperationFailedException invalidDateTimeFormatterPattern(final String pattern) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidDateTimeFormatterPattern$str(), pattern));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidTimeZoneId$str() {
        return "WFLYUT0103: The time zone id %s is invalid.";
    }
    @Override
    public final OperationFailedException invalidTimeZoneId(final String zoneId) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidTimeZoneId$str(), zoneId));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingClassInAnnotation$str() {
        return "WFLYUT0104: Some classes referenced by annotation: %s in class: %s are missing.";
    }
    @Override
    public final DeploymentUnitProcessingException missingClassInAnnotation(final String anCls, final String resCls) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), missingClassInAnnotation$str(), anCls, resCls));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String duplicateHostContextDeployments$str() {
        return "WFLYUT0105: Host and context path are occupied, %s can't be registered. Message was: %s";
    }
    @Override
    public final DuplicateServiceException duplicateHostContextDeployments(final ServiceName deploymentInfoServiceName, final String errorMessage) {
        final DuplicateServiceException result = new DuplicateServiceException(String.format(getLoggingLocale(), duplicateHostContextDeployments$str(), deploymentInfoServiceName, errorMessage));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void unableToObfuscateSessionRoute(final String route, final NoSuchAlgorithmException e) {
        super.log.logf(FQCN, ERROR, e, unableToObfuscateSessionRoute$str(), route);
    }
    protected String unableToObfuscateSessionRoute$str() {
        return "WFLYUT0106: Unable to generate obfuscated session route from '%s'";
    }
    @Override
    public final void obfuscatedSessionRoute(final String obfuscatedRoute, final String route) {
        super.log.logf(FQCN, INFO, null, obfuscatedSessionRoute$str(), obfuscatedRoute, route);
    }
    protected String obfuscatedSessionRoute$str() {
        return "WFLYUT0107: Generated obfuscated session route '%s' from '%s'";
    }
    protected String deploymentConfiguredForLegacySecurity$str() {
        return "WFLYUT0108: The deployment is configured to use legacy security which is no longer available.";
    }
    @Override
    public final DeploymentUnitProcessingException deploymentConfiguredForLegacySecurity() {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), deploymentConfiguredForLegacySecurity$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String legacySecurityUnsupported$str() {
        return "WFLYUT0109: The deployment is configured to use legacy security which is no longer supported.";
    }
    @Override
    public final StartException legacySecurityUnsupported() {
        final StartException result = new StartException(String.format(getLoggingLocale(), legacySecurityUnsupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYUT0110: The use of security realms at runtime is unsupported.";
    }
    @Override
    public final OperationFailedException runtimeSecurityRealmUnsupported() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), runtimeSecurityRealmUnsupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void badAnnotationOnServlet(final String annotation, final String servlet) {
        super.log.logf(FQCN, WARN, null, badAnnotationOnServlet$str(), annotation, servlet);
    }
    protected String badAnnotationOnServlet$str() {
        return "WFLYUT0111: The annotation: '%s' will have no effect on Servlet: '%s'";
    }
}
