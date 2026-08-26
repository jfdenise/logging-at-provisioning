package org.jboss.as.remoting.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.net.BindException;
import java.lang.String;
import java.io.IOException;
import org.jboss.logging.Logger;
import java.lang.Exception;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.PathAddress;
import org.jboss.msc.service.StartException;
import java.util.Arrays;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:26:25+0200")
public class RemotingLogger_$logger extends DelegatingBasicLogger implements RemotingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = RemotingLogger_$logger.class.getName();
    public RemotingLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void listeningOnSocket(final String address) {
        super.log.logf(FQCN, INFO, null, listeningOnSocket$str(), address);
    }
    protected String listeningOnSocket$str() {
        return "WFLYRMT0001: Listening on %s";
    }
    protected String couldNotStartChanelListener$str() {
        return "WFLYRMT0002: Could not start channel listener";
    }
    @Override
    public final StartException couldNotStartChanelListener(final Exception e) {
        final StartException result = new StartException(String.format(getLoggingLocale(), couldNotStartChanelListener$str()), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String couldNotBindToSocket$str() {
        return "WFLYRMT0004: %s";
    }
    @Override
    public final StartException couldNotBindToSocket(final String message, final BindException e) {
        final StartException result = new StartException(String.format(getLoggingLocale(), couldNotBindToSocket$str(), message), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotStart$str() {
        return "WFLYRMT0005: Failed to start service";
    }
    @Override
    public final StartException couldNotStart(final Exception e) {
        final StartException result = new StartException(String.format(getLoggingLocale(), couldNotStart$str()), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String endpointEmpty$str() {
        return "WFLYRMT0006: Endpoint is null";
    }
    @Override
    public final IllegalStateException endpointEmpty() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), endpointEmpty$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidQOPV$str() {
        return "WFLYRMT0016: Invalid QOP value: %s";
    }
    @Override
    public final IllegalStateException invalidQOPV(final String qop) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidQOPV$str(), qop));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidStrength$str() {
        return "WFLYRMT0017: Invalid Strength value: %s";
    }
    @Override
    public final IllegalStateException invalidStrength(final String strengthValue) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidStrength$str(), strengthValue));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String couldNotCreateURI$str() {
        return "WFLYRMT0018: Cannot create a valid URI from %s -- %s";
    }
    @Override
    public final OperationFailedException couldNotCreateURI(final String uri, final String msg) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), couldNotCreateURI$str(), uri, msg));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalStrength$str() {
        return "WFLYRMT0020: Invalid Strength '%s' string given";
    }
    @Override
    public final IllegalArgumentException illegalStrength(final String strength) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalStrength$str(), strength));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String upgradeRequestMissingKey$str() {
        return "WFLYRMT0021: HTTP Upgrade request missing Sec-JbossRemoting-Key header";
    }
    @Override
    public final IOException upgradeRequestMissingKey() {
        final IOException result = new IOException(String.format(getLoggingLocale(), upgradeRequestMissingKey$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String workerConfigurationIgnored$str() {
        return "WFLYRMT0022: Worker configuration is no longer used, please use endpoint worker configuration";
    }
    @Override
    public final OperationFailedException workerConfigurationIgnored() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), workerConfigurationIgnored$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String workerThreadsEndpointConfigurationChoiceRequired$str() {
        return "WFLYRMT0023: Only one of '%s' configuration or '%s' configuration is allowed";
    }
    @Override
    public final String workerThreadsEndpointConfigurationChoiceRequired(final String workerThreads, final String endpoint) {
        return String.format(getLoggingLocale(), workerThreadsEndpointConfigurationChoiceRequired$str(), workerThreads, endpoint);
    }
    @Override
    public final void addingIOSubsystem(final String legacyNS) {
        super.log.logf(FQCN, INFO, null, addingIOSubsystem$str(), legacyNS);
    }
    protected String addingIOSubsystem$str() {
        return "WFLYRMT0024: The remoting subsystem is present but no io subsystem was found. An io subsystem was not required when remoting schema '%s' was current but now is, so a default subsystem is being added.";
    }
    protected String couldNotRemoveResource$str() {
        return "WFLYRMT0025: Can't remove %s as JMX uses it as a remoting endpoint";
    }
    @Override
    public final OperationFailedException couldNotRemoveResource(final PathAddress address) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), couldNotRemoveResource$str(), address));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String warningOnWorkerChange$str() {
        return "WFLYRMT0026: Change of worker to '%s' in remoting might require the same change in linked resources depending on remoting and in definition of http(s) listeners.";
    }
    @Override
    public final String warningOnWorkerChange(final String worker) {
        return String.format(getLoggingLocale(), warningOnWorkerChange$str(), worker);
    }
    protected String failedToObtainSSLContext$str() {
        return "WFLYRMT0027: Failed to obtain SSLContext";
    }
    @Override
    public final StartException failedToObtainSSLContext(final Exception cause) {
        final StartException result = new StartException(String.format(getLoggingLocale(), failedToObtainSSLContext$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidOption$str() {
        return "WFLYRMT0028: Invalid option '%s'.";
    }
    @Override
    public final OperationFailedException invalidOption(final String message) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidOption$str(), message));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYRMT0029: The use of security realms at runtime is unsupported.";
    }
    @Override
    public final OperationFailedException runtimeSecurityRealmUnsupported() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), runtimeSecurityRealmUnsupported$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
