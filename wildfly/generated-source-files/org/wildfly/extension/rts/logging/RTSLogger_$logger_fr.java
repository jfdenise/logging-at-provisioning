package org.wildfly.extension.rts.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:49+0200")
public class RTSLogger_$logger_fr extends RTSLogger_$logger implements RTSLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public RTSLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failueOnImportingGlobalTransactionFromWildflyClient$str() {
        return "WFLYRTS0001: Impossible d'importer une transaction globale vers un client de transaction WildFly.";
    }
    @Override
    protected String cannotGetTransactionStatus$str() {
        return "WFLYRTS0002: Impossible d'obtenir l'état de la transaction dans le contexte de traitement (handling) %1$s";
    }
}
