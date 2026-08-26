package org.wildfly.extension.messaging.activemq._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:30+0200")
public class MessagingLogger_$logger_de extends MessagingLogger_$logger implements MessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MessagingLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unknownPooledConnectionFactoryAttribute$str() {
        return "WFLYMSGAMQ0015: Property %1$s wird ignoriert, es ist keine bekannte Property für gepoolte Verbindungs-Factory.";
    }
    @Override
    protected String remoteDestinationDeletionFailed$str() {
        return "WFLYMSGAMQ0100: Löschen des Remote-Ziels %1$s ist mit Fehler %2$s fehlgeschlagen";
    }
    @Override
    protected String invalidTransactionNameValue$str() {
        return "WFLYMSGAMQ0101: Ungültiger Wert %1$s für %2$s, gültige Werte sind %3$s, Standardwert wird angewendet.";
    }
    @Override
    protected String immutableResource$str() {
        return "WFLYMSGAMQ0037: Ressource ist unveränderlich";
    }
    @Override
    protected String discoveryGroupIsNotDefined$str() {
        return "WFLYMSGAMQ0080: Discovery-Gruppe %1$s ist nicht definiert";
    }
    @Override
    protected String moduleNotFound$str() {
        return "WFLYMSGAMQ0098: Modul %1$s konnte nicht geladen werden - das Modul oder eine seiner Abhängigkeiten fehlt [%2$s]";
    }
    @Override
    protected String errorStoppingJmsServer$str() {
        return "WFLYMSGAMQ0003: Ausnahme beim Beenden des Jakarta Messaging-Servers";
    }
    @Override
    protected String aioInfoLinux$str() {
        return "WFLYMSGAMQ0075: AIO befindet sich nicht auf dieser Plattform, es wird auf die Verwendung der reinen Java NIO zurückgegriffen. Wenn Sie eine Linux-Plattform besitzen, installieren Sie LibAIO, um das AIO-Journal zu aktivieren und optimale Performance zu erreichen.";
    }
    @Override
    protected String unsupportedRuntimeAttribute$str() {
        return "WFLYMSGAMQ0053: Runtime-Handling für %1$s ist nicht implementiert";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYMSGAMQ0104: Legacy-Sicherheit wird nicht mehr unterstützt.";
    }
    @Override
    protected String failedBridgeDeployment$str() {
        return "WFLYMSGAMQ0106: Kein Deployment von Bridge %1$s";
    }
    @Override
    protected String missingJNDIName$str() {
        return "WFLYMSGAMQ0115: JNDI-Name fehlt.";
    }
    @Override
    protected String failedToFindConnectorSocketBinding$str() {
        return "WFLYMSGAMQ0030: SocketBinding für Connector %1$s nicht gefunden";
    }
    @Override
    protected String aioInfo$str() {
        return "WFLYMSGAMQ0001: AIO befindet sich nicht auf dieser Plattform, es wird auf die Verwendung der reinen Java NIO zurückgegriffen.";
    }
    @Override
    protected String managementOperationAllowedOnlyInRunningMode$str() {
        return "WFLYMSGAMQ0083: Die Operation %1$s kann nicht ausgeführt werden: Server muss sich im %2$s-Modus befinden";
    }
    @Override
    protected String jdbcDatabaseDialectDetectionFailed$str() {
        return "WFLYMSGAMQ0094: Datenbankdialekt kann nicht aus Metadaten der Verbindung oder JDBC-Treibername gefunden werden. Konfigurieren Sie dies mittels der Property 'journal-database' in der Konfiguration manuell. Bekannte Datenbankdialektstrings sind %1$s";
    }
    @Override
    protected String couldNotCloseFile$str() {
        return "WFLYMSGAMQ0007: Konnte Datei %1$s nicht schließen";
    }
    @Override
    protected String unsupportedResourceType$str() {
        return "WFLYMSGAMQ0117: Ressourcentyp %1$s wird nicht unterstützt.";
    }
    @Override
    protected String unableToLoadClassFromModule$str() {
        return "WFLYMSGAMQ0085: Konnte Klasse %1$s nicht vom Modul %2$s laden";
    }
    @Override
    protected String missingArguments$str() {
        return "WFLYMSGAMQ0113: Es fehlen Argumente";
    }
    @Override
    protected String unboundJndiName$str() {
        return "WFLYMSGAMQ0006: Bindung des Messaging-Objekts an jndi-Namen %1$s aufgelöst";
    }
    @Override
    protected String cannotUnbindJndiName$str() {
        return "WFLYMSGAMQ0025: Kann einen Null- oder leeren String nicht als jndi-Namen entbinden";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYMSGAMQ0047: %1$s ist Null";
    }
    @Override
    protected String cannotBindJndiName$str() {
        return "WFLYMSGAMQ0022: Kann einen Null- oder leeren String nicht als jndi-Namen binden";
    }
    @Override
    protected String failedToStartService$str() {
        return "WFLYMSGAMQ0033: Start des Dienstes fehlgeschlagen";
    }
    @Override
    protected String duplicateElements$str() {
        return "WFLYMSGAMQ0076: Parameter %1$s enthält doppelte Elemente [%2$s]";
    }
    @Override
    protected String remoteDestinationCreationFailed$str() {
        return "WFLYMSGAMQ0099: Erstellung des Remote-Ziels %1$s ist mit Fehler %2$s fehlgeschlagen";
    }
    @Override
    protected String childResourceAlreadyExists$str() {
        return "WFLYMSGAMQ0026: Eine untergeordnete Ressource vom Typ %1$s existiert bereits; das Messaging-Subsystem gestattet nur eine einzelne Ressource vom Typ %1$s";
    }
    @Override
    protected String unableToLoadModule$str() {
        return "WFLYMSGAMQ0086: Modul \"%1$s\" konnte nicht geladen werden";
    }
    @Override
    protected String boundJndiName$str() {
        return "WFLYMSGAMQ0002: Messaging-Objekt an jndi-Namen %1$s gebunden";
    }
    @Override
    protected String failedToDestroy$str() {
        return "WFLYMSGAMQ0004: Löschen fehlgeschlagen von %1$s: %2$s";
    }
    @Override
    protected String failedToFindDiscoverySocketBinding$str() {
        return "WFLYMSGAMQ0031: SocketBinding für Discovery-Binding %1$s nicht gefunden";
    }
    @Override
    protected String unableToFindRecoveryRegistry$str() {
        return "WFLYMSGAMQ0110: Wiederherstellungsregistrierung konnte nicht gefunden werden";
    }
    @Override
    protected String socketBindingOrJGroupsClusterRequired$str() {
        return "WFLYMSGAMQ0108: Das Attribut 'socket-binding' oder 'jgroups-cluster' ist erforderlich.";
    }
    @Override
    protected String failedToUnbindJndiName$str() {
        return "WFLYMSGAMQ0008: Lösen der Bindung des Messaging-Objekts an jndi-Namen %1$s in %2$d %3$s fehlgeschlagen";
    }
    @Override
    protected String onlyOneChildIsAllowed$str() {
        return "WFLYMSGAMQ0078: Nur eine untergeordnete %1$s-Ressource ist erlaubt; gefundene Unterressourcen: %2$s";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYMSGAMQ0079: Indexierte Unterressourcen können nur registriert werden, wenn die übergeordnete Ressource geordnete Unterelemente unterstützt. Das übergeordnete Element von '%1$s' ist nicht indexiert";
    }
    @Override
    protected String noSubscriptionError$str() {
        return "WFLYMSGAMQ0111: Keine Abonnements mit Namen %1$s für clientID %2$s";
    }
    @Override
    protected String revertOperationFailed$str() {
        return "WFLYMSGAMQ0005: %1$s Ausnahme beim Versuch, die Operation %2$s unter Adresse %3$s rückgängig zu machen.";
    }
    @Override
    protected String noInVMConnector$str() {
        return "WFLYMSGAMQ0084: Der Server definiert keine in-vm Connectors. Einer ist erforderlich, um ein Journal importieren zu können";
    }
    @Override
    protected String multipleClientMappingsFound$str() {
        return "WFLYMSGAMQ0095: client-mapping mehrmals in Socket-Binding [%1$s] gefunden, das von der ActiveMQ-Transportkonfiguration [%2$s] verwendet wird. Folgende Adresse wird verwendet: [Host: %3$s, Port %4$s]";
    }
    @Override
    protected String failedToParseProperty$str() {
        return "WFLYMSGAMQ0116: Fehler beim Parsen der Eigenschaft '%1$s' ";
    }
    @Override
    protected String jndiWasNotFound$str() {
        return "WFLYMSGAMQ0119: '%1$s' wurde unter den vorhandenen JMS-Ressourcen nicht gefunden.";
    }
    @Override
    protected String securityDomainContextNotSet$str() {
        return "WFLYMSGAMQ0058: SecurityDomainContext nicht eingestellt";
    }
    @Override
    protected String stoppedService$str() {
        return "WFLYMSGAMQ0012: %1$s %2$s gestoppt";
    }
    @Override
    protected String upgradeRequestMissingKey$str() {
        return "WFLYMSGAMQ0102: HTTP-Upgrade-Anfrage fehlt Sec-JbossRemoting-Key Header";
    }
    @Override
    protected String canNotRemoveResourceOfType$str() {
        return "WFLYMSGAMQ0064: Ressourcen vom Typ %1$s können nicht entfernt werden";
    }
    @Override
    protected String unknownHAPolicyType$str() {
        return "WFLYMSGAMQ0109: Unbekannter HA-Richtlinientyp.";
    }
    @Override
    protected String connectorNotDefined$str() {
        return "WFLYMSGAMQ0027: Connector %1$s nicht definiert";
    }
    @Override
    protected String required2$str() {
        return "WFLYMSGAMQ0046: Entweder %1$s oder %2$s ist erforderlich";
    }
    @Override
    protected String unsupportedOperation$str() {
        return "WFLYMSGAMQ0052: Support für Operation %1$s nicht ordnungsgemäß implementiert";
    }
    @Override
    protected String failedAuthenticationWithException$str() {
        return "WFLYMSGAMQ0091: Benutzername %1$s konnte nicht authentifiziert werden. Ausnahmemeldung: %2$s";
    }
    @Override
    protected String jndiNameAlreadyRegistered$str() {
        return "WFLYMSGAMQ0043: JNDI-Name %1$s ist bereits registriert";
    }
    @Override
    protected String noMatchingDeadLetterAddress$str() {
        return "WFLYMSGAMQ0072: Keine mit dead-letter-address %1$s für address-settings %2$s übereinstimmende Ressource vorhanden, nicht gelieferte Nachrichten von mit diesem address-setting übereinstimmenden Zielen gehen verloren!";
    }
    @Override
    protected String wrongConnectorRefInBroadCastGroup$str() {
        return "WFLYMSGAMQ0067: Die Broadcast-Gruppe '%1$s' definiert Referenz zu nicht vorhandenem Connector '%2$s'. Verfügbare Connectors '%3$s'.";
    }
    @Override
    protected String registeredHTTPUpgradeHandler$str() {
        return "WFLYMSGAMQ0016: Registriertes HTTP-Upgrade für %1$s-Protokoll wird gehandhabt vom Acceptor %2$s";
    }
    @Override
    protected String failedToFindBroadcastSocketBinding$str() {
        return "WFLYMSGAMQ0029: SocketBinding für Broadcast-Binding %1$s nicht gefunden";
    }
    @Override
    protected String illegalValue$str() {
        return "WFLYMSGAMQ0036: Unzulässiger Wert %1$s für Element %2$s";
    }
    @Override
    protected String required1$str() {
        return "WFLYMSGAMQ0045: %1$s ist erforderlich";
    }
    @Override
    protected String startedService$str() {
        return "WFLYMSGAMQ0011: %1$s %2$s gestartet";
    }
    @Override
    protected String failedToRecover$str() {
        return "WFLYMSGAMQ0060: Wiederherstellung von %1$s fehlgeschlagen";
    }
    @Override
    protected String failedAuthorization$str() {
        return "WFLYMSGAMQ0093: Benutzername %1$s konnte nicht autorisiert werden: Berechtigungen fehlen";
    }
    @Override
    protected String unsupportedBroadcastGroupConfigurationForLegacy$str() {
        return "WFLYMSGAMQ0081: Nicht unterstützter Typ für Broadcast-Gruppenkonfiguration für veraltete Ressource: %1$s";
    }
    @Override
    protected String canNotRegisterResourceOfType$str() {
        return "WFLYMSGAMQ0063: Ressourcen vom Typ %1$s können nicht registriert werden";
    }
    @Override
    protected String socketBindingMulticastNotSet$str() {
        return "WFLYMSGAMQ0105: %1$s %2$s ist so konfiguriert, dass das Socket-Binding %3$s verwendet wird, aber für dieses Socket-Binding ist weder das Attribut 'multicast-address' noch 'multicast-port' konfiguriert.";
    }
    @Override
    protected String activeMQServerNotInstalled$str() {
        return "WFLYMSGAMQ0054: Kein ActiveMQ-Server unter dem Namen %1$s verfügbar";
    }
    @Override
    protected String failedAuthentication$str() {
        return "WFLYMSGAMQ0092: Benutzername %1$s konnte nicht authentifiziert werden: Benutzername/Passwort-Paar kann nicht verifiziert werden";
    }
    @Override
    protected String failedToShutdownServer$str() {
        return "WFLYMSGAMQ0032: Herunterfahren von %1$s-Server fehlgeschlagen";
    }
    @Override
    protected String invalidServiceState$str() {
        return "WFLYMSGAMQ0042: Dienst %1$s ist nicht in Status %2$s, er ist in Status %3$s";
    }
    @Override
    protected String unableToLoadConnectorServiceFactoryClass$str() {
        return "WFLYMSGAMQ0087: Konnte Connector-Dienst-Factory-Klasse %1$s nicht laden";
    }
    @Override
    protected String invalid$str() {
        return "WFLYMSGAMQ0038: %1$s ist ungültig";
    }
    @Override
    protected String couldNotParseDeployment$str() {
        return "WFLYMSGAMQ0055: Konnte Datei %1$s nicht parsen";
    }
    @Override
    protected String canNotRemoveUnknownEntry$str() {
        return "WFLYMSGAMQ0077: Kann unbekannten Eintrag %1$s nicht entfernen";
    }
    @Override
    protected String missingRestype$str() {
        return "WFLYMSGAMQ0114: Der erforderliche Parameter --restype fehlt.";
    }
    @Override
    protected String canNotRemoveLastJNDIName$str() {
        return "WFLYMSGAMQ0073: Kann JNDI-Namen %1$s nicht entfernen. Die Ressource muss mindestens einen JNDI-Namen haben.";
    }
    @Override
    protected String invalidAttributeType$str() {
        return "WFLYMSGAMQ0039: Attribut %1$s hat unerwarteten Typ %2$s";
    }
    @Override
    protected String failedToCreate$str() {
        return "WFLYMSGAMQ0028: Erstellen von %1$s fehlgeschlagen";
    }
    @Override
    protected String serverInBackupMode$str() {
        return "WFLYMSGAMQ0066: Ressource an der Adresse %1$s kann nicht gemanagt werden, der Server ist im Backup-Modus";
    }
    @Override
    protected String connectorForPooledConnectionFactory$str() {
        return "WFLYMSGAMQ0018: Keine Connectors wurden explizit für die gepoolte Verbindungs-Factory %1$s definiert. Verwende %2$s als Connector.";
    }
    @Override
    protected String unsupportedAttribute$str() {
        return "WFLYMSGAMQ0050: Read-Support für Attribut %1$s nicht ordnungsgemäß implementiert";
    }
    @Override
    protected String operationNotAllowedOnJdbcStore$str() {
        return "WFLYMSGAMQ0096: Der Vorgang %1$s kann in einem JDBC-Speicherjournal nicht ausgeführt werden";
    }
    @Override
    protected String noSubscriptionWithQueueName$str() {
        return "WFLYMSGAMQ0112: Keine Abonnements mit Namen %1$s";
    }
    @Override
    protected String noMatchingExpiryAddress$str() {
        return "WFLYMSGAMQ0071: Keine mit expiry-address %1$s für address-settings %2$s übereinstimmende Ressource vorhanden, abgelaufene Nachrichten von mit diesem address-setting übereinstimmenden Zielen gehen verloren!";
    }
    @Override
    protected String invalidNullSecurityDomain$str() {
        return "WFLYMSGAMQ0090: Die Elytron-Sicherheitsdomain darf nicht Null sein";
    }
    @Override
    protected String brokerNotStarted$str() {
        return "WFLYMSGAMQ0103: Der Broker ist nicht gestartet. Er kann noch nicht verwaltet werden.";
    }
    @Override
    protected String invalidConfiguration$str() {
        return "WFLYMSGAMQ0089: Ressource unter %1$s ist nicht korrekt konfiguriert: Wenn deren Attribut %2$s definiert ist, werden die anderen Attribute %3$s nicht berücksichtigt";
    }
    @Override
    protected String unsupportedConnectorFactoryForLegacy$str() {
        return "WFLYMSGAMQ0082: Nicht unterstützter Typ für Connector-Factory für veraltete Ressource: %1$s";
    }
    @Override
    protected String noDestinationRegisteredForAddress$str() {
        return "WFLYMSGAMQ0057: Kein Nachrichtenziel an Adresse %1$s registriert";
    }
    @Override
    protected String operationNotValid$str() {
        return "WFLYMSGAMQ0056: Handler kann Operation %1$s nicht handhaben";
    }
    @Override
    protected String noSocketBinding$str() {
        return "WFLYMSGAMQ0097: Es ist kein Socket-Binding bzw. Outbound-Socket-Binding konfiguriert mit dem Namen %1$s";
    }
    @Override
    protected String securityEnabledWithoutDomain$str() {
        return "WFLYMSGAMQ0107: Sie müssen einen Elytron-Sicherheitsdomain definieren, wenn die Sicherheit aktiviert ist.";
    }
    @Override
    protected String missingName$str() {
        return "WFLYMSGAMQ0118: Name fehlt.";
    }
    @Override
    protected String invalidModularParameterValue$str() {
        return "WFLYMSGAMQ0088: %1$s ist kein gültiger Wert für Parameter %2$s. Wert muss ein Vielfaches von %3$s sein.";
    }
}
