package org.jboss.as.xts.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:15+0200")
public class XtsAsLogger_$logger_de extends XtsAsLogger_$logger implements XtsAsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public XtsAsLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String txBridgeInboundRecoveryServiceFailedToStart$str() {
        return "WFLYXTS0001: Start von TxBridge Inbound Recovery-Dienst fehlgeschlagen";
    }
    @Override
    protected String txBridgeOutboundRecoveryServiceFailedToStart$str() {
        return "WFLYXTS0002: Start von TxBridge Outbound Recovery-Dienst fehlgeschlagen";
    }
    @Override
    protected String xtsServiceFailedToStart$str() {
        return "WFLYXTS0003: Start von XTS-Dienst fehlgeschlagen";
    }
    @Override
    protected String xtsServiceIsNotStarted$str() {
        return "WFLYXTS0004: Dienst nicht gestartet";
    }
    @Override
    protected String rejectingCallBecauseNotPartOfXtsTx$str() {
        return "WFLYXTS0009: Aufruf wird abgelehnt, da er kein Teil einer XTS-Transaktion ist";
    }
    @Override
    protected String cannotGetTransactionStatus$str() {
        return "WFLYXTS0010: Der Transaktionsstatus im Verarbeitungskontext %1$s kann nicht abgerufen werden.";
    }
    @Override
    protected String unexpectedBridgeType$str() {
        return "WFLYXTS0011: Unerwarteter Bridge-Typ: '%1$s'";
    }
    @Override
    protected String errorProcessingEndpoint$str() {
        return "WFLYXTS0012: Fehler bei der Verarbeitung des Endpunkts '%1$s'";
    }
}
