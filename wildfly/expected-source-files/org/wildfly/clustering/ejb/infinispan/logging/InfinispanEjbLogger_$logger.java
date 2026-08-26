package org.wildfly.clustering.ejb.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:56:28+0200")
public class InfinispanEjbLogger_$logger extends DelegatingBasicLogger implements InfinispanEjbLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = InfinispanEjbLogger_$logger.class.getName();
    public InfinispanEjbLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void failedToExpireBean(final Throwable cause, final Object id) {
        super.log.logf(FQCN, WARN, cause, failedToExpireBean$str(), id);
    }
    protected String failedToExpireBean$str() {
        return "WFLYCLEJBINF0003: Failed to expire stateful session bean %s";
    }
    @Override
    public final void expirationDisabled(final String cacheName) {
        super.log.logf(FQCN, WARN, null, expirationDisabled$str(), cacheName);
    }
    protected String expirationDisabled$str() {
        return "WFLYCLEJBINF0010: Disabling expiration for '%s'. SFSB expiration should be configured per §4.3.11 of the Jakarta Enterprise Beans specification.";
    }
}
