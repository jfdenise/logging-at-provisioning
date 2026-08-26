package org.wildfly.clustering.web.infinispan.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2025-08-27T11:22:48+0200")
public class InfinispanWebLogger_$logger extends DelegatingBasicLogger implements InfinispanWebLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = InfinispanWebLogger_$logger.class.getName();
    public InfinispanWebLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void failedToPassivateSession(final Throwable cause, final String sessionId) {
        super.log.logf(FQCN, WARN, cause, failedToPassivateSession$str(), sessionId);
    }
    protected String failedToPassivateSession$str() {
        return "WFLYCLWEBINF0001: Failed to passivate attributes of session %s";
    }
    @Override
    public final void failedToPassivateSessionAttribute(final Throwable cause, final String sessionId, final String attribute) {
        super.log.logf(FQCN, WARN, cause, failedToPassivateSessionAttribute$str(), sessionId, attribute);
    }
    protected String failedToPassivateSessionAttribute$str() {
        return "WFLYCLWEBINF0002: Failed to passivate attribute %2$s of session %1$s";
    }
    protected String invalidSession$str() {
        return "WFLYCLWEBINF0003: Session %s is not valid";
    }
    @Override
    public final IllegalStateException invalidSession(final String sessionId) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), invalidSession$str(), sessionId));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void failedToExpireSession(final Throwable cause, final String sessionId) {
        super.log.logf(FQCN, WARN, cause, failedToExpireSession$str(), sessionId);
    }
    protected String failedToExpireSession$str() {
        return "WFLYCLWEBINF0004: Failed to expire session %s";
    }
    @Override
    public final void failedToCancelSession(final Throwable cause, final String sessionId) {
        super.log.logf(FQCN, DEBUG, cause, failedToCancelSession$str(), sessionId);
    }
    protected String failedToCancelSession$str() {
        return "WFLYCLWEBINF0005: Failed to cancel expiration/passivation of session %s on primary owner.";
    }
    @Override
    public final void failedToScheduleSession(final Throwable cause, final String sessionId) {
        super.log.logf(FQCN, DEBUG, cause, failedToScheduleSession$str(), sessionId);
    }
    protected String failedToScheduleSession$str() {
        return "WFLYCLWEBINF0006: Failed to schedule expiration/passivation of session %s on primary owner.";
    }
    @Override
    public final void failedToActivateSession(final Throwable cause, final String sessionId) {
        super.log.logf(FQCN, WARN, cause, failedToActivateSession$str(), sessionId);
    }
    protected String failedToActivateSession$str() {
        return "WFLYCLWEBINF0007: Failed to activate attributes of session %s";
    }
    @Override
    public final void failedToActivateSessionAttribute(final Throwable cause, final String sessionId, final String attribute) {
        super.log.logf(FQCN, WARN, cause, failedToActivateSessionAttribute$str(), sessionId, attribute);
    }
    protected String failedToActivateSessionAttribute$str() {
        return "WFLYCLWEBINF0008: Failed to activate attribute %2$s of session %1$s";
    }
    protected String failedToReadSessionAttribute$str() {
        return "WFLYCLWEBINF0009: Failed to read attribute %2$s of session %1$s";
    }
    @Override
    public final IllegalStateException failedToReadSessionAttribute(final Throwable cause, final String sessionId, final String attribute) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failedToReadSessionAttribute$str(), sessionId, attribute), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void failedToActivateAuthentication(final Throwable cause, final String ssoId) {
        super.log.logf(FQCN, WARN, cause, failedToActivateAuthentication$str(), ssoId);
    }
    protected String failedToActivateAuthentication$str() {
        return "WFLYCLWEBINF0010: Failed to activate authentication for single sign on %s";
    }
    @Override
    public final void missingSessionAttributeCacheEntry(final String sessionId, final String attribute) {
        super.log.logf(FQCN, WARN, null, missingSessionAttributeCacheEntry$str(), sessionId, attribute);
    }
    protected String missingSessionAttributeCacheEntry$str() {
        return "WFLYCLWEBINF0011: Session %s is missing cache entry for attribute %s";
    }
    @Override
    public final void evictionDisabled(final String cacheName) {
        super.log.logf(FQCN, WARN, null, evictionDisabled$str(), cacheName);
    }
    protected String evictionDisabled$str() {
        return "WFLYCLWEBINF0012: Disabling eviction for cache '%s'. Web session passivation should be configured via <max-active-sessions/> in jboss-web.xml.";
    }
    @Override
    public final void expirationDisabled(final String cacheName) {
        super.log.logf(FQCN, WARN, null, expirationDisabled$str(), cacheName);
    }
    protected String expirationDisabled$str() {
        return "WFLYCLWEBINF0013: Disabling expiration for cache '%s'. Web session expiration should be configured per §7.5 of the servlet specification.";
    }
}
