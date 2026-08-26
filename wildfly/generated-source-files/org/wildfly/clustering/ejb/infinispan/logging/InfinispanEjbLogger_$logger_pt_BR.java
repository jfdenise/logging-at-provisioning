package org.wildfly.clustering.ejb.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:05+0200")
public class InfinispanEjbLogger_$logger_pt_BR extends InfinispanEjbLogger_$logger_pt implements InfinispanEjbLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanEjbLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String expirationDisabled$str() {
        return "WFLYCLEJBINF0010: Desativando expiração para '%1$s'. A expiração da SFSB deve ser configurada de acordo com o §4.3.11 da especificação de Jakarta Enterprise Beans.";
    }
    @Override
    protected String failedToExpireBean$str() {
        return "WFLYCLEJBINF0003: Falha ao terminar estado de bean de sessão %1$s";
    }
}
