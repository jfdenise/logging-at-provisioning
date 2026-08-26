package org.jboss.as.txn.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import org.jboss.logging.Logger;
import jakarta.transaction.Synchronization;
import java.lang.Exception;
import javax.transaction.xa.Xid;
import java.lang.RuntimeException;
import jakarta.transaction.Transaction;
import org.jboss.as.controller.PathElement;
import javax.xml.stream.XMLStreamException;
import org.jboss.logging.BasicLogger;
import jakarta.resource.spi.work.Work;
import java.lang.Throwable;
import org.jboss.msc.service.StartException;
import java.lang.Object;
import java.util.Arrays;
import javax.xml.stream.Location;
import jakarta.resource.spi.work.WorkCompletedException;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:53+0200")
public class TransactionLogger_$logger extends DelegatingBasicLogger implements TransactionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = TransactionLogger_$logger.class.getName();
    public TransactionLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void unableToRollBack(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, unableToRollBack$str());
    }
    protected String unableToRollBack$str() {
        return "WFLYTX0001: Unable to roll back active transaction";
    }
    @Override
    public final void unableToGetTransactionStatus(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, unableToGetTransactionStatus$str());
    }
    protected String unableToGetTransactionStatus$str() {
        return "WFLYTX0002: Unable to get transaction state";
    }
    @Override
    public final void transactionStillOpen(final int arg0) {
        super.log.logf(FQCN, ERROR, null, transactionStillOpen$str(), arg0);
    }
    protected String transactionStillOpen$str() {
        return "WFLYTX0003: APPLICATION ERROR: transaction still active in request with status %s";
    }
    protected String createFailed$str() {
        return "WFLYTX0004: Create failed";
    }
    @Override
    public final StartException createFailed(final Throwable arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), createFailed$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String managerStartFailure$str() {
        return "WFLYTX0005: %s manager create failed";
    }
    @Override
    public final StartException managerStartFailure(final Throwable arg0, final String arg1) {
        final StartException result = new StartException(String.format(getLoggingLocale(), managerStartFailure$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String objectStoreStartFailure$str() {
        return "WFLYTX0006: Failed to configure object store browser bean";
    }
    @Override
    public final StartException objectStoreStartFailure(final Throwable arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), objectStoreStartFailure$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String serviceNotStarted$str() {
        return "WFLYTX0007: Service not started";
    }
    @Override
    public final IllegalStateException serviceNotStarted() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), serviceNotStarted$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String startFailure$str() {
        return "WFLYTX0008: Start failed";
    }
    @Override
    public final StartException startFailure(final Throwable arg0) {
        final StartException result = new StartException(String.format(getLoggingLocale(), startFailure$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unknownMetric$str() {
        return "WFLYTX0009: Unknown metric %s";
    }
    @Override
    public final String unknownMetric(final Object arg0) {
        return String.format(getLoggingLocale(), unknownMetric$str(), arg0);
    }
    protected String jmxSubsystemNotInstalled$str() {
        return "WFLYTX0010: MBean Server service not installed, this functionality is not available if the JMX subsystem has not been installed.";
    }
    @Override
    public final RuntimeException jmxSubsystemNotInstalled() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), jmxSubsystemNotInstalled$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String inconsistentStatisticsSettings$str() {
        return "WFLYTX0012: Attributes %s and %s are alternatives; both cannot be set with conflicting values.";
    }
    @Override
    public final OperationFailedException inconsistentStatisticsSettings(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), inconsistentStatisticsSettings$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void nodeIdentifierIsSetToDefault(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, nodeIdentifierIsSetToDefault$str(), arg0, arg1);
    }
    protected String nodeIdentifierIsSetToDefault$str() {
        return "WFLYTX0013: The %s attribute on the %s is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.";
    }
    protected String jndiNameInvalidFormat$str() {
        return "WFLYTX0015: Jndi names have to start with java:/ or java:jboss/";
    }
    @Override
    public final OperationFailedException jndiNameInvalidFormat() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), jndiNameInvalidFormat$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mustBeUndefinedIfTrue$str() {
        return "WFLYTX0023: %s must be undefined if %s is 'true'.";
    }
    @Override
    public final OperationFailedException mustBeUndefinedIfTrue(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), mustBeUndefinedIfTrue$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mustBedefinedIfDefined$str() {
        return "WFLYTX0024: %s must be defined if %s is defined.";
    }
    @Override
    public final OperationFailedException mustBedefinedIfDefined(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), mustBedefinedIfDefined$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String eitherTrueOrDefined$str() {
        return "WFLYTX0025: Either %s must be 'true' or  %s must be defined.";
    }
    @Override
    public final OperationFailedException eitherTrueOrDefined(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), eitherTrueOrDefined$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void transactionNotFound(final Transaction arg0) {
        super.log.logf(FQCN, WARN, null, transactionNotFound$str(), arg0);
    }
    protected String transactionNotFound$str() {
        return "WFLYTX0026: The transaction %s could not be removed from the cache during cleanup.";
    }
    @Override
    public final void preJcaSyncAfterCompletionFailed(final Synchronization arg0, final Transaction arg1, final Exception arg2) {
        super.log.logf(FQCN, WARN, arg2, preJcaSyncAfterCompletionFailed$str(), arg0, arg1);
    }
    protected String preJcaSyncAfterCompletionFailed$str() {
        return "WFLYTX0027: The pre-Jakarta Connectors synchronization %s associated with tx %s failed during after completion";
    }
    @Override
    public final void jcaSyncAfterCompletionFailed(final Synchronization arg0, final Transaction arg1, final Exception arg2) {
        super.log.logf(FQCN, WARN, arg2, jcaSyncAfterCompletionFailed$str(), arg0, arg1);
    }
    protected String jcaSyncAfterCompletionFailed$str() {
        return "WFLYTX0028: The Jakarta Connectors synchronization %s associated with tx %s failed during after completion";
    }
    protected String syncsnotallowed$str() {
        return "WFLYTX0029: Syncs are not allowed to be registered when the tx is in state %s";
    }
    @Override
    public final IllegalStateException syncsnotallowed(final int arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), syncsnotallowed$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYTX0030: Indexed child resources can only be registered if the parent resource supports ordered children. The parent of '%s' is not indexed";
    }
    @Override
    public final IllegalStateException indexedChildResourceRegistrationNotAvailable(final PathElement arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), indexedChildResourceRegistrationNotAvailable$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unsupportedAttribute$str() {
        return "WFLYTX0031: The attribute '%s' is no longer supported";
    }
    @Override
    public final XMLStreamException unsupportedAttribute(final String arg0, final Location arg1) {
        final XMLStreamException result = new XMLStreamException(String.format(getLoggingLocale(), unsupportedAttribute$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String mustBeDefinedIfTrue$str() {
        return "WFLYTX0032: %s must be defined if %s is 'true'.";
    }
    @Override
    public final OperationFailedException mustBeDefinedIfTrue(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), mustBeDefinedIfTrue$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String onlyOneCanBeTrue$str() {
        return "WFLYTX0033: Only one of %s and %s can be 'true'.";
    }
    @Override
    public final OperationFailedException onlyOneCanBeTrue(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), onlyOneCanBeTrue$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void objectStoreRelativeToIsSetToDefault() {
        super.log.logf(FQCN, DEBUG, null, objectStoreRelativeToIsSetToDefault$str());
    }
    protected String objectStoreRelativeToIsSetToDefault$str() {
        return "WFLYTX0034: relative_to property of the object-store is set to the default value with jboss.server.data.dir";
    }
    protected String cannotFindOrImportInflowTransaction$str() {
        return "WFLYTX0035: Cannot find or import inflow transaction for xid %s and work %s";
    }
    @Override
    public final WorkCompletedException cannotFindOrImportInflowTransaction(final Xid arg0, final Work arg1, final Exception arg2) {
        final WorkCompletedException result = new WorkCompletedException(String.format(getLoggingLocale(), cannotFindOrImportInflowTransaction$str(), arg0, arg1), arg2);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String importedInflowTransactionIsInactive$str() {
        return "WFLYTX0036: Imported Jakarta Connectors inflow transaction with xid %s of work %s is inactive";
    }
    @Override
    public final WorkCompletedException importedInflowTransactionIsInactive(final Xid arg0, final Work arg1, final Exception arg2) {
        final WorkCompletedException result = new WorkCompletedException(String.format(getLoggingLocale(), importedInflowTransactionIsInactive$str(), arg0, arg1), arg2);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotResumeInflowTransactionUnexpectedError$str() {
        return "WFLYTX0037: Unexpected error on resuming transaction %s for work %s";
    }
    @Override
    public final WorkCompletedException cannotResumeInflowTransactionUnexpectedError(final Transaction arg0, final Work arg1, final Exception arg2) {
        final WorkCompletedException result = new WorkCompletedException(String.format(getLoggingLocale(), cannotResumeInflowTransactionUnexpectedError$str(), arg0, arg1), arg2);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotSuspendInflowTransactionUnexpectedError$str() {
        return "WFLYTX0038: Unexpected error on suspending transaction for work %s";
    }
    @Override
    public final RuntimeException cannotSuspendInflowTransactionUnexpectedError(final Work arg0, final Exception arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotSuspendInflowTransactionUnexpectedError$str(), arg0), arg1);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void timeoutValueIsSetToMaximum(final int arg0) {
        super.log.logf(FQCN, WARN, null, timeoutValueIsSetToMaximum$str(), arg0);
    }
    protected String timeoutValueIsSetToMaximum$str() {
        return "WFLYTX0039: A value of zero is not permitted for the maximum timeout, as such the timeout has been set to %s";
    }
    protected String noActiveTransactionToRegisterSynchronization$str() {
        return "WFLYTX0040: There is no active transaction at the current context to register synchronization '%s'";
    }
    @Override
    public final IllegalStateException noActiveTransactionToRegisterSynchronization(final Synchronization arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noActiveTransactionToRegisterSynchronization$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String jmxError$str() {
        return "WFLYTX0041: JMX error: %s";
    }
    @Override
    public final OperationFailedException jmxError(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), jmxError$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String transactionDiscoveryError$str() {
        return "WFLYTX0042: Transaction discovery error";
    }
    @Override
    public final OperationFailedException transactionDiscoveryError(final Exception arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), transactionDiscoveryError$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToDetermineInboundTransactionContext$str() {
        return "WFLYTX0043: InboundTransactionCurrentImpl unable to determine inbound transaction context";
    }
    @Override
    public final RuntimeException unableToDetermineInboundTransactionContext(final Exception arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unableToDetermineInboundTransactionContext$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableToSuspendInboundTransactionContext$str() {
        return "WFLYTX0044: InboundTransactionCurrentImpl unable to suspend inbound transaction context";
    }
    @Override
    public final RuntimeException unableToSuspendInboundTransactionContext(final Exception arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), unableToSuspendInboundTransactionContext$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRegister$str() {
        return "WFLYTX0045: Could not register initial reference for InboundTransactionCurrent implementation";
    }
    @Override
    public final RuntimeException cannotRegister(final Exception arg0) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotRegister$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void scanSuspensionInitiated() {
        super.log.logf(FQCN, INFO, null, scanSuspensionInitiated$str());
    }
    protected String scanSuspensionInitiated$str() {
        return "WFLYTX0046: Transactions subsystem: starting transactions recovery suspension";
    }
    @Override
    public final void scanSuspensionCompleted() {
        super.log.logf(FQCN, INFO, null, scanSuspensionCompleted$str());
    }
    protected String scanSuspensionCompleted$str() {
        return "WFLYTX0047: Transactions subsystem: transactions recovery suspension completed";
    }
    @Override
    public final void waitingForInFlightTransactions() {
        super.log.logf(FQCN, INFO, null, waitingForInFlightTransactions$str());
    }
    protected String waitingForInFlightTransactions$str() {
        return "WFLYTX0048: Transactions subsystem: waiting for in-flight transactions to terminate";
    }
    @Override
    public final void inFlightTransactionsTerminated() {
        super.log.logf(FQCN, INFO, null, inFlightTransactionsTerminated$str());
    }
    protected String inFlightTransactionsTerminated$str() {
        return "WFLYTX0049: Transactions subsystem: all in-flight transactions terminated";
    }
}
