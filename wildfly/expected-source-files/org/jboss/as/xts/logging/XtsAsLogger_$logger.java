package org.jboss.as.xts.logging;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import org.jboss.as.xts.XTSException;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import org.jboss.msc.service.StartException;
import jakarta.xml.ws.handler.MessageContext;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:58:15+0200")
public class XtsAsLogger_$logger extends DelegatingBasicLogger implements XtsAsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = XtsAsLogger_$logger.class.getName();
    public XtsAsLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String txBridgeInboundRecoveryServiceFailedToStart$str() {
        return "WFLYXTS0001: TxBridge inbound recovery service start failed";
    }
    @Override
    public final StartException txBridgeInboundRecoveryServiceFailedToStart() {
        final StartException result = new StartException(String.format(getLoggingLocale(), txBridgeInboundRecoveryServiceFailedToStart$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String txBridgeOutboundRecoveryServiceFailedToStart$str() {
        return "WFLYXTS0002: TxBridge outbound recovery service start failed";
    }
    @Override
    public final StartException txBridgeOutboundRecoveryServiceFailedToStart() {
        final StartException result = new StartException(String.format(getLoggingLocale(), txBridgeOutboundRecoveryServiceFailedToStart$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String xtsServiceFailedToStart$str() {
        return "WFLYXTS0003: XTS service start failed";
    }
    @Override
    public final StartException xtsServiceFailedToStart() {
        final StartException result = new StartException(String.format(getLoggingLocale(), xtsServiceFailedToStart$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String xtsServiceIsNotStarted$str() {
        return "WFLYXTS0004: Service not started";
    }
    @Override
    public final IllegalStateException xtsServiceIsNotStarted() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), xtsServiceIsNotStarted$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void rejectingCallBecauseNotPartOfXtsTx() {
        super.log.logf(FQCN, WARN, null, rejectingCallBecauseNotPartOfXtsTx$str());
    }
    protected String rejectingCallBecauseNotPartOfXtsTx$str() {
        return "WFLYXTS0009: Rejecting call because it is not part of any XTS transaction";
    }
    @Override
    public final void cannotGetTransactionStatus(final MessageContext ctx, final Throwable cause) {
        super.log.logf(FQCN, ERROR, cause, cannotGetTransactionStatus$str(), ctx);
    }
    protected String cannotGetTransactionStatus$str() {
        return "WFLYXTS0010: Cannot get transaction status on handling context %s";
    }
    protected String unexpectedBridgeType$str() {
        return "WFLYXTS0011: Unexpected bridge type: '%s'";
    }
    @Override
    public final XTSException unexpectedBridgeType(final String bridgeType) {
        final XTSException result = new XTSException(String.format(getLoggingLocale(), unexpectedBridgeType$str(), bridgeType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorProcessingEndpoint$str() {
        return "WFLYXTS0012: Error processing endpoint '%s'";
    }
    @Override
    public final DeploymentUnitProcessingException errorProcessingEndpoint(final String endpoint, final Throwable cause) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), errorProcessingEndpoint$str(), endpoint), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
}
