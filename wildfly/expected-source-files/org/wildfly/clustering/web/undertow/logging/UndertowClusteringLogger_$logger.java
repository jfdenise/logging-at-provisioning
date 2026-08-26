package org.wildfly.clustering.web.undertow.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:57:30+0200")
public class UndertowClusteringLogger_$logger extends DelegatingBasicLogger implements UndertowClusteringLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = UndertowClusteringLogger_$logger.class.getName();
    public UndertowClusteringLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String sessionIsInvalid$str() {
        return "WFLYCLWEBUT0001: Session %s is invalid";
    }
    @Override
    public final IllegalStateException sessionIsInvalid(final String sessionId) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), sessionIsInvalid$str(), sessionId));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String sessionAlreadyExists$str() {
        return "WFLYCLWEBUT0002: Session %s already exists";
    }
    @Override
    public final IllegalStateException sessionAlreadyExists(final String sessionId) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), sessionAlreadyExists$str(), sessionId));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String sessionManagerStopped$str() {
        return "WFLYCLWEBUT0003: Session manager was stopped";
    }
    @Override
    public final IllegalStateException sessionManagerStopped() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), sessionManagerStopped$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void legacySessionManagementProviderOverride(final String deploymentName) {
        super.log.logf(FQCN, WARN, null, legacySessionManagementProviderOverride$str(), deploymentName);
    }
    protected String legacySessionManagementProviderOverride$str() {
        return "WFLYCLWEBUT0004: Legacy <replication-config/> overriding attached distributable session management provider for %s";
    }
    @Override
    public final void legacySessionManagementProviderInUse(final String name) {
        super.log.logf(FQCN, WARN, null, legacySessionManagementProviderInUse$str(), name);
    }
    protected String legacySessionManagementProviderInUse$str() {
        return "WFLYCLWEBUT0005: No distributable session management provider found for %s; using legacy provider based on <replication-config/>";
    }
    @Override
    public final void legacyRoutingProviderInUse(final String name) {
        super.log.logf(FQCN, WARN, null, legacyRoutingProviderInUse$str(), name);
    }
    protected String legacyRoutingProviderInUse$str() {
        return "WFLYCLWEBUT0007: No routing provider found for %s; using legacy provider based on static configuration";
    }
    @Override
    public final void legacySingleSignOnProviderInUse(final String name) {
        super.log.logf(FQCN, WARN, null, legacySingleSignOnProviderInUse$str(), name);
    }
    protected String legacySingleSignOnProviderInUse$str() {
        return "WFLYCLWEBUT0008: No distributable single sign-on management provider found for %s; using legacy provider based on static configuration";
    }
    protected String batchIsAlreadyClosed$str() {
        return "WFLYCLWEBUT0009: Invalidation attempted for session %s after the response was committed (e.g. after HttpServletResponse.sendRedirect or sendError)";
    }
    @Override
    public final IllegalStateException batchIsAlreadyClosed(final String sessionId) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), batchIsAlreadyClosed$str(), sessionId));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
