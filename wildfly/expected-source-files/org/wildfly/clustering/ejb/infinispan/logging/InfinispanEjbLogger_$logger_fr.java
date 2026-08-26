package org.wildfly.clustering.ejb.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:28+0200")
public class InfinispanEjbLogger_$logger_fr extends InfinispanEjbLogger_$logger implements InfinispanEjbLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanEjbLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToExpireBean$str() {
        return "WFLYCLEJBINF0003: Impossible de faire expirer le SSB %1$s";
    }
    @Override
    protected String expirationDisabled$str() {
        return "WFLYCLEJBINF0010: Désactiver l'expiration pour '%1$s'. L'expiration du SFSB doit être configurée conformément au §4.3.11 de la spécification Jakarta Enterprise Beans.";
    }
}
