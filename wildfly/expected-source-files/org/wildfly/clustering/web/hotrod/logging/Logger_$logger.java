package org.wildfly.clustering.web.hotrod.logging;

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


import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2025-08-27T11:22:48+0200")
public class Logger_$logger extends DelegatingBasicLogger implements org.wildfly.clustering.web.hotrod.logging.Logger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = Logger_$logger.class.getName();
    public Logger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void failedToExpireSession(final Throwable cause, final String sessionId) {
        super.log.logf(FQCN, WARN, cause, failedToExpireSession$str(), sessionId);
    }
    protected String failedToExpireSession$str() {
        return "WFLYCLWEBHR0001: Failed to expire session %s";
    }
    @Override
    public final void failedToActivateSession(final Throwable cause, final String sessionId) {
        super.log.logf(FQCN, WARN, cause, failedToActivateSession$str(), sessionId);
    }
    protected String failedToActivateSession$str() {
        return "WFLYCLWEBHR0007: Failed to activate attributes of session %s";
    }
    @Override
    public final void failedToActivateSessionAttribute(final Throwable cause, final String sessionId, final String attribute) {
        super.log.logf(FQCN, WARN, cause, failedToActivateSessionAttribute$str(), sessionId, attribute);
    }
    protected String failedToActivateSessionAttribute$str() {
        return "WFLYCLWEBHR0008: Failed to activate attribute %2$s of session %1$s";
    }
    protected String failedToReadSessionAttribute$str() {
        return "WFLYCLWEBHR0009: Failed to read attribute %2$s of session %1$s";
    }
    @Override
    public final IllegalStateException failedToReadSessionAttribute(final Throwable cause, final String sessionId, final String attribute) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failedToReadSessionAttribute$str(), sessionId, attribute), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void failedToActivateAuthentication(final Throwable cause, final String ssoId) {
        super.log.logf(FQCN, WARN, cause, failedToActivateAuthentication$str(), ssoId);
    }
    protected String failedToActivateAuthentication$str() {
        return "WFLYCLWEBHR0010: Failed to activate authentication for single sign on %s";
    }
    @Override
    public final void missingSessionAttributeCacheEntry(final String sessionId, final String attribute) {
        super.log.logf(FQCN, WARN, null, missingSessionAttributeCacheEntry$str(), sessionId, attribute);
    }
    protected String missingSessionAttributeCacheEntry$str() {
        return "WFLYCLWEBHR0011: Session %s is missing cache entry for attribute %s";
    }
}
