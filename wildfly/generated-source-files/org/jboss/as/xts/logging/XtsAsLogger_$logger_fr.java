package org.jboss.as.xts.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:56+0200")
public class XtsAsLogger_$logger_fr extends XtsAsLogger_$logger implements XtsAsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public XtsAsLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String txBridgeInboundRecoveryServiceFailedToStart$str() {
        return "WFLYXTS0001: Échec du démarrage du service de récupération d'entrée(s) TxBridge";
    }
    @Override
    protected String unexpectedBridgeType$str() {
        return "WFLYXTS0011: Type de pont inattendu : '%1$s'";
    }
    @Override
    protected String cannotGetTransactionStatus$str() {
        return "WFLYXTS0010: Impossible d'obtenir l'état de la transaction dans le contexte de traitement (handling) %1$s";
    }
    @Override
    protected String xtsServiceIsNotStarted$str() {
        return "WFLYXTS0004: Service non démarré";
    }
    @Override
    protected String txBridgeOutboundRecoveryServiceFailedToStart$str() {
        return "WFLYXTS0002: Échec du démarrage du service de récupération de sortie(s) TxBridge";
    }
    @Override
    protected String errorProcessingEndpoint$str() {
        return "WFLYXTS0012: Erreur lors du traitement du point de terminaison '%1$s'";
    }
    @Override
    protected String xtsServiceFailedToStart$str() {
        return "WFLYXTS0003: Échec du démarrage du service XTS";
    }
    @Override
    protected String rejectingCallBecauseNotPartOfXtsTx$str() {
        return "WFLYXTS0009: Appel rejeté car ne faisant pas partie d'aucune transaction XTS";
    }
}
