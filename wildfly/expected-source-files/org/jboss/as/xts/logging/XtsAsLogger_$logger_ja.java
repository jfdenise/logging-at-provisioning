package org.jboss.as.xts.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:15+0200")
public class XtsAsLogger_$logger_ja extends XtsAsLogger_$logger implements XtsAsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public XtsAsLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String txBridgeInboundRecoveryServiceFailedToStart$str() {
        return "WFLYXTS0001: TxBridge インバウンドリカバリーサービスの開始に失敗しました。";
    }
    @Override
    protected String txBridgeOutboundRecoveryServiceFailedToStart$str() {
        return "WFLYXTS0002: TxBridge アウトバウンドリカバリーサービスの開始に失敗しました。";
    }
    @Override
    protected String xtsServiceFailedToStart$str() {
        return "WFLYXTS0003: XTS サービスの開始に失敗しました。";
    }
    @Override
    protected String xtsServiceIsNotStarted$str() {
        return "WFLYXTS0004: サービスは開始されていません";
    }
    @Override
    protected String rejectingCallBecauseNotPartOfXtsTx$str() {
        return "WFLYXTS0009: XTS トランザクションの一部ではないため呼び出しを拒否しています";
    }
    @Override
    protected String cannotGetTransactionStatus$str() {
        return "WFLYXTS0010: コンテキスト %1$s の処理でトランザクションの状態を取得できません。";
    }
    @Override
    protected String unexpectedBridgeType$str() {
        return "WFLYXTS0011: 予期しないブリッジタイプ: '%1$s'";
    }
    @Override
    protected String errorProcessingEndpoint$str() {
        return "WFLYXTS0012: エンドポイント '%1$s' の処理中にエラーが発生しました";
    }
}
