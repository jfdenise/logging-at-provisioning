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
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:05+0200")
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
    public final void failedToExpireBean(final Throwable arg0, final Object arg1) {
        super.log.logf(FQCN, WARN, arg0, failedToExpireBean$str(), arg1);
    }
    protected String failedToExpireBean$str() {
        return "WFLYCLEJBINF0003: Failed to expire stateful session bean %s";
    }
    @Override
    public final void expirationDisabled(final String arg0) {
        super.log.logf(FQCN, WARN, null, expirationDisabled$str(), arg0);
    }
    protected String expirationDisabled$str() {
        return "WFLYCLEJBINF0010: Disabling expiration for '%s'. SFSB expiration should be configured per §4.3.11 of the Jakarta Enterprise Beans specification.";
    }
}
