package org.jboss.as.domain.http.server.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import org.jboss.modules.ModuleNotFoundException;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.util.Arrays;
import java.net.InetAddress;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:14+0200")
public class HttpServerLogger_$logger extends DelegatingBasicLogger implements HttpServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = HttpServerLogger_$logger.class.getName();
    public HttpServerLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void modelRequestError(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, modelRequestError$str());
    }
    protected String modelRequestError$str() {
        return "WFLYDMHTTP0001: Unexpected error executing model request";
    }
    @Override
    public final void uploadError(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, uploadError$str());
    }
    protected String uploadError$str() {
        return "WFLYDMHTTP0002: Unexpected error executing deployment upload request";
    }
    @Override
    public final void consoleModuleNotFound(final String arg0) {
        super.log.logf(FQCN, WARN, null, consoleModuleNotFound$str(), arg0);
    }
    protected String consoleModuleNotFound$str() {
        return "WFLYDMHTTP0003: Unable to load console module for slot %s, disabling console";
    }
    @Override
    public final void errorContextModuleNotFound(final String arg0) {
        super.log.logf(FQCN, ERROR, null, errorContextModuleNotFound$str(), arg0);
    }
    protected String errorContextModuleNotFound$str() {
        return "WFLYDMHTTP0004: Unable to load error context for slot %s, disabling error context.";
    }
    protected String invalidOperation$str() {
        return "WFLYDMHTTP0005: Invalid operation '%s'";
    }
    @Override
    public final IllegalArgumentException invalidOperation(final Throwable arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidOperation$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String realmNotReadyMessage$str() {
        return "WFLYDMHTTP0006: The security realm is not ready to process requests, see %s";
    }
    @Override
    public final String realmNotReadyMessage(final String arg0) {
        return String.format(getLoggingLocale(), realmNotReadyMessage$str(), arg0);
    }
    protected String consoleModuleNotFoundMsg$str() {
        return "WFLYDMHTTP0007: No console module available with module name %s";
    }
    @Override
    public final ModuleNotFoundException consoleModuleNotFoundMsg(final String arg0) {
        final ModuleNotFoundException result = new ModuleNotFoundException(String.format(getLoggingLocale(), consoleModuleNotFoundMsg$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidCredentialType$str() {
        return "WFLYDMHTTP0010: Invalid Credential Type '%s'";
    }
    @Override
    public final IllegalArgumentException invalidCredentialType(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidCredentialType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void httpsRedirectNotSupported(final InetAddress arg0, final InetAddress arg1) {
        super.log.logf(FQCN, INFO, null, httpsRedirectNotSupported$str(), arg0, arg1);
    }
    protected String httpsRedirectNotSupported$str() {
        return "WFLYDMHTTP0011: Management interface is using different addresses for HTTP (%s) and HTTPS (%s). Redirection of HTTPS requests from HTTP socket to HTTPS socket will not be supported.";
    }
    protected String sslRequestedNoSslContext$str() {
        return "WFLYDMHTTP0012: A secure socket has been defined for the HTTP interface, however the referenced security realm is not supplying a SSLContext.";
    }
    @Override
    public final IllegalArgumentException sslRequestedNoSslContext() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), sslRequestedNoSslContext$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidUseStreamAsResponseIndex$str() {
        return "WFLYDMHTTP0013: Invalid useStreamIndex value '%d'. The operation response had %d streams attached.";
    }
    @Override
    public final String invalidUseStreamAsResponseIndex(final int arg0, final int arg1) {
        return String.format(getLoggingLocale(), invalidUseStreamAsResponseIndex$str(), arg0, arg1);
    }
    protected String managementHttpServerAlreadyBuild$str() {
        return "WFLYDMHTTP0014: The ManagementHttpServer has already been built using this Builder.";
    }
    @Override
    public final IllegalStateException managementHttpServerAlreadyBuild() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), managementHttpServerAlreadyBuild$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noRealmOrSSLContext$str() {
        return "WFLYDMHTTP0015: No SecurityRealm or SSLContext has been provided.";
    }
    @Override
    public final IllegalStateException noRealmOrSSLContext() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noRealmOrSSLContext$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String realmNotReadyForSecuredManagementHandler$str() {
        return "WFLYDMHTTP0016: Your Application Server is running. However you have not yet added any users to be able to access the HTTP management interface. To add a new user execute the %s script within the bin folder of your WildFly installation and enter the requested information. By default the realm name used by WildFly is 'ManagementRealm' and this is already selected by default by the add-user tool.";
    }
    @Override
    public final String realmNotReadyForSecuredManagementHandler(final String arg0) {
        return String.format(getLoggingLocale(), realmNotReadyForSecuredManagementHandler$str(), arg0);
    }
    protected String conflictingContextNames$str() {
        return "WFLYDMHTTP0017: The context name conflicts with an already registered context: %s";
    }
    @Override
    public final IllegalStateException conflictingContextNames(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), conflictingContextNames$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
