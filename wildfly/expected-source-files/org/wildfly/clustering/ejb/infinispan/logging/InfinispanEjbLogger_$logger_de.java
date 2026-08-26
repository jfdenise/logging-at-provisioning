package org.wildfly.clustering.ejb.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:28+0200")
public class InfinispanEjbLogger_$logger_de extends InfinispanEjbLogger_$logger implements InfinispanEjbLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanEjbLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToExpireBean$str() {
        return "WFLYCLEJBINF0003: Verfallen von stateful Session Bean %1$s fehlgeschlagen";
    }
    @Override
    protected String expirationDisabled$str() {
        return "WFLYCLEJBINF0010: Ablauf für \"%1$s\" wird deaktiviert. SFSB-Ablauf sollte gemäß §4.3.11 der Jakarta Enterprise Beans-Spezifikation konfiguriert werden.";
    }
}
