package org.jboss.as.txn.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:54:08+0200")
public class TransactionLogger_$logger_de extends TransactionLogger_$logger implements TransactionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public TransactionLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unableToRollBack$str() {
        return "WFLYTX0001: Zurücksetzen der aktiven Transaktion nicht möglich";
    }
    @Override
    protected String unableToGetTransactionStatus$str() {
        return "WFLYTX0002: Abruf des aktuellen Transaktionsstatus nicht möglich";
    }
    @Override
    protected String transactionStillOpen$str() {
        return "WFLYTX0003: APPLIKATIONSFEHLER: Transaktion noch aktiv in Anfrage mit Status %1$s";
    }
    @Override
    protected String createFailed$str() {
        return "WFLYTX0004: Erstellung fehlgeschlagen";
    }
    @Override
    protected String managerStartFailure$str() {
        return "WFLYTX0005: Erstellung von Manager %1$s fehlgeschlagen";
    }
    @Override
    protected String objectStoreStartFailure$str() {
        return "WFLYTX0006: Konfiguration des Objektspeicher Browser-Beans fehlgeschlagen";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYTX0007: Dienst nicht gestartet";
    }
    @Override
    protected String startFailure$str() {
        return "WFLYTX0008: Start fehlgeschlagen";
    }
    @Override
    protected String unknownMetric$str() {
        return "WFLYTX0009: Unbekannte Metrik %1$s";
    }
    @Override
    protected String jmxSubsystemNotInstalled$str() {
        return "WFLYTX0010: MBean Server-Dienst nicht installiert, diese Funktionalität ist nicht verfügbar, wenn das JMX-Subsystem nicht installiert wurde.";
    }
    @Override
    protected String inconsistentStatisticsSettings$str() {
        return "WFLYTX0012: Attribute %1$s und %2$s sind Alternativen; die beiden dürfen nicht mit widersprüchlichen Werten eingestellt werden.";
    }
    @Override
    protected String nodeIdentifierIsSetToDefault$str() {
        return "WFLYTX0013: Das Attribut %1$s bei %2$s ist auf den Standardwert gesetzt. Dies stellt eine Gefahr für Umgebungen dar, in denen mehrere Server ausgeführt werden. Stellen Sie sicher, dass der Attributwert eindeutig ist.";
    }
    @Override
    protected String jndiNameInvalidFormat$str() {
        return "WFLYTX0015: JNDI-Namen müssen mit java:/ oder java:jboss/ beginnen";
    }
    @Override
    protected String mustBeUndefinedIfTrue$str() {
        return "WFLYTX0023: %1$s muss undefiniert sein, wenn %2$s 'true' ist.";
    }
    @Override
    protected String mustBedefinedIfDefined$str() {
        return "WFLYTX0024: %1$s muss definiert sein, wenn %2$s definiert ist.";
    }
    @Override
    protected String eitherTrueOrDefined$str() {
        return "WFLYTX0025: Entweder muss %1$s 'true' oder %2$s muss definiert sein.";
    }
    @Override
    protected String transactionNotFound$str() {
        return "WFLYTX0026: Die Transaktion %1$s konnte während der Bereinigung nicht vom Cache entfernt werden.";
    }
    @Override
    protected String preJcaSyncAfterCompletionFailed$str() {
        return "WFLYTX0027: Die pre-Jakarta-Connectors-Synchronisierung %1$s der Transaktion %2$s ist fehlgeschlagen nach Abschluss";
    }
    @Override
    protected String jcaSyncAfterCompletionFailed$str() {
        return "WFLYTX0028: Die Jakarta Connectors-Synchronisierung %1$s der Transaktion %2$s ist fehlgeschlagen nach Abschluss";
    }
    @Override
    protected String syncsnotallowed$str() {
        return "WFLYTX0029: Synchronisierungen dürfen nicht registriert werden, wenn die Transaktion im Status %1$s ist";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYTX0030: Indexierte Unterressourcen können nur registriert werden, wenn die übergeordnete Ressource geordnete Unterelemente unterstützt. Das übergeordnete Element von '%1$s' ist nicht indexiert";
    }
    @Override
    protected String unsupportedAttribute$str() {
        return "WFLYTX0031: Das Attribut '%1$s' wird nicht mehr unterstützt";
    }
    @Override
    protected String mustBeDefinedIfTrue$str() {
        return "WFLYTX0032: %1$s muss definiert sein, wenn %2$s 'true' ist.";
    }
    @Override
    protected String onlyOneCanBeTrue$str() {
        return "WFLYTX0033: Nur eines von beiden, %1$s oder %2$s, kann 'true' sein.";
    }
    @Override
    protected String objectStoreRelativeToIsSetToDefault$str() {
        return "WFLYTX0034: Eigenschaft \"relative_to\" des Objektspeichers ist auf den Standardwert mit jboss.server.data.dir gesetzt";
    }
    @Override
    protected String cannotFindOrImportInflowTransaction$str() {
        return "WFLYTX0035: Zugangstransaktion für Xid %1$s und Arbeit %2$s kann nicht gefunden oder importiert werden";
    }
    @Override
    protected String importedInflowTransactionIsInactive$str() {
        return "WFLYTX0036: Importierte Jakarta Connectors-Zugangstransaktion mit Xid %1$s von Arbeit %2$s ist inaktiv";
    }
    @Override
    protected String cannotResumeInflowTransactionUnexpectedError$str() {
        return "WFLYTX0037: Unerwarteter Fehler beim Fortsetzen der Transaktion %1$s für Arbeit %2$s";
    }
    @Override
    protected String cannotSuspendInflowTransactionUnexpectedError$str() {
        return "WFLYTX0038: Unerwarteter Fehler beim Unterbrechen der Transaktion für Arbeit %1$s";
    }
    @Override
    protected String timeoutValueIsSetToMaximum$str() {
        return "WFLYTX0039: Ein Wert von Null ist für den maximalen Timeout nicht zulässig, da der Timeout auf %1$s gesetzt wurde";
    }
    @Override
    protected String noActiveTransactionToRegisterSynchronization$str() {
        return "WFLYTX0040: Es gibt keine aktive Transaktion im aktuellen Kontext, um die Synchronisation '%1$s' zu registrieren";
    }
    @Override
    protected String jmxError$str() {
        return "WFLYTX0041: JMX-Fehler: %1$s";
    }
    @Override
    protected String transactionDiscoveryError$str() {
        return "WFLYTX0042: Fehler bei der Transaktionserkennung";
    }
    @Override
    protected String unableToDetermineInboundTransactionContext$str() {
        return "WFLYTX0043: InboundTransactionCurrentImpl kann den Kontext der eingehenden Transaktionen nicht ermitteln";
    }
    @Override
    protected String unableToSuspendInboundTransactionContext$str() {
        return "WFLYTX0044: InboundTransactionCurrentImpl kann den Kontext der eingehenden Transaktionen nicht aussetzen";
    }
    @Override
    protected String cannotRegister$str() {
        return "WFLYTX0045: Anfängliche Referenz für die InboundTransactionCurrent-Implementierung konnte nicht registriert werden";
    }
}
