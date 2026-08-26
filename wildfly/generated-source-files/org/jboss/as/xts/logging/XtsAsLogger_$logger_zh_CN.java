package org.jboss.as.xts.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:56+0200")
public class XtsAsLogger_$logger_zh_CN extends XtsAsLogger_$logger_zh implements XtsAsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public XtsAsLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String txBridgeInboundRecoveryServiceFailedToStart$str() {
        return "WFLYXTS0001: 事务桥接入口恢复服务启动失败";
    }
    @Override
    protected String unexpectedBridgeType$str() {
        return "WFLYXTS0011: 意外的网桥类型：'%1$s'";
    }
    @Override
    protected String cannotGetTransactionStatus$str() {
        return "WFLYXTS0010: 在处理上下文时无法获取交易状态 %1$s";
    }
    @Override
    protected String xtsServiceIsNotStarted$str() {
        return "WFLYXTS0004: 服务尚未启动";
    }
    @Override
    protected String txBridgeOutboundRecoveryServiceFailedToStart$str() {
        return "WFLYXTS0002: 事务桥接出口恢复服务启动失败";
    }
    @Override
    protected String errorProcessingEndpoint$str() {
        return "WFLYXTS0012: 处理端点 '%1$s' 时出错";
    }
    @Override
    protected String xtsServiceFailedToStart$str() {
        return "WFLYXTS0003: XTS服务启动失败";
    }
    @Override
    protected String rejectingCallBecauseNotPartOfXtsTx$str() {
        return "WFLYXTS0009: 拒绝调用，因为它不是任何 XTS 事务的一部分";
    }
}
