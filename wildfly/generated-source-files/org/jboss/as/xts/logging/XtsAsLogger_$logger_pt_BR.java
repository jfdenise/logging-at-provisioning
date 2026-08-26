package org.jboss.as.xts.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:56+0200")
public class XtsAsLogger_$logger_pt_BR extends XtsAsLogger_$logger_pt implements XtsAsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public XtsAsLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String txBridgeInboundRecoveryServiceFailedToStart$str() {
        return "WFLYXTS0001: Falha na inicialização do serviço de recuperação de entrada TxBridge";
    }
    @Override
    protected String unexpectedBridgeType$str() {
        return "WFLYXTS0011: Tipo de ponte inesperado: '%1$s'";
    }
    @Override
    protected String cannotGetTransactionStatus$str() {
        return "WFLYXTS0010: Não é possível obter o status da transação no contexto de tratamento %1$s";
    }
    @Override
    protected String xtsServiceIsNotStarted$str() {
        return "WFLYXTS0004: O serviço não foi inicializado";
    }
    @Override
    protected String txBridgeOutboundRecoveryServiceFailedToStart$str() {
        return "WFLYXTS0002: Falha na inicialização do serviço de recuperação de saída TxBridge";
    }
    @Override
    protected String errorProcessingEndpoint$str() {
        return "WFLYXTS0012: Erro ao processar o ponto final '%1$s'";
    }
    @Override
    protected String xtsServiceFailedToStart$str() {
        return "WFLYXTS0003: Falha na inicialização do serviço XTS";
    }
    @Override
    protected String rejectingCallBecauseNotPartOfXtsTx$str() {
        return "WFLYXTS0009: Rejeitando a chamada porque ela não faz parte de nenhuma transação XTS";
    }
}
