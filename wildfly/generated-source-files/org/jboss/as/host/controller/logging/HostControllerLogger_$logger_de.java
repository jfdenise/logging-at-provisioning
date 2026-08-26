package org.jboss.as.host.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:19+0200")
public class HostControllerLogger_$logger_de extends HostControllerLogger_$logger implements HostControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public HostControllerLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String lostRemoteDomainConnection$str() {
        return "WFLYHC0015: Verbindung zu Remote Host-Controller geschlossen. Versuch der erneuten Verbindung.";
    }
    @Override
    protected String noServerInventory$str() {
        return "WFLYHC0071: Kein Server-Inventory";
    }
    @Override
    protected String channelClosed$str() {
        return "WFLYHC0153: Channel geschlossen";
    }
    @Override
    protected String failedProfileOperationsRetrieval$str() {
        return "WFLYHC0056: Abruf von Profiloperationen vom Domain-Controller fehlgeschlagen";
    }
    @Override
    protected String shutdownHookInvoked$str() {
        return "WFLYHC0181: Herunterfahren von Host-Controller wurde angefordert per OS-Signal";
    }
    @Override
    protected String couldNotCreateDomainDataDirectory$str() {
        return "WFLYHC0101: Konnte kein Domain-Datenverzeichnis erstellen: %1$s";
    }
    @Override
    protected String unsupportedManagementVersionForHost$str() {
        return "WFLYHC0113: Host Controller-Management-Version %1$s.%2$s ist veraltet. Nur %3$s.%4$s oder höher werden unterstützt";
    }
    @Override
    protected String cannotOverwriteDomainXmlWithEmpty$str() {
        return "WFLYHC0206: Die Datei %1$s existiert bereits; Sie müssen --remove-existing-domain-config verwenden, um bestehende Dateien zu überschreiben.";
    }
    @Override
    protected String profileInvolvedInACycle$str() {
        return "WFLYHC0163: Profil '%1$s' ist in einem Zyklus involviert";
    }
    @Override
    protected String lostConnectionToRemoteHost$str() {
        return "WFLYHC0030: Verbindung zu Remotehost \"%1$s\" unerwartet geschlossen";
    }
    @Override
    protected String socketBindingGroupInvolvedInACycle$str() {
        return "WFLYHC0165: Socket-Binding-Gruppe '%1$s' ist in einem Zyklus involviert";
    }
    @Override
    protected String cannotAccessS3File$str() {
        return "WFLYHC0116: Zugriff auf S3-Datei nicht möglich: %1$s";
    }
    @Override
    protected String reconnectingServer$str() {
        return "WFLYHC0018: Verbindung zum Server %1$s wird wiederhergestellt";
    }
    @Override
    protected String serverNameAlreadyRegistered$str() {
        return "WFLYHC0077: Es gibt bereits einen registrierten Server namens '%1$s'";
    }
    @Override
    protected String domainModelAppliedButRestartIsRequired$str() {
        return "WFLYHC0203: Die Domain-Konfiguration wurde erfolgreich angewendet, aber ein Neustart ist erforderlich, bevor die Änderungen wirksam werden.";
    }
    @Override
    protected String failedMarshallingDomainControllerData$str() {
        return "WFLYHC0117: Erhalt von Domain Controller Daten von S3 Datei fehlgeschlagen";
    }
    @Override
    protected String invalidPreSignedUrl$str() {
        return "WFLYHC0124: pre-signed url %1$s ist keine gültige URL";
    }
    @Override
    protected String unknownHostValue$str() {
        return "WFLYHC0085: Wert für %1$s ist kein bekannter Host – %2$s. %3$s";
    }
    @Override
    protected String serverLoggingConfigurationFileNotFound$str() {
        return "WFLYHC0204: Es wurde keine Protokollierungs-Konfigurationsdatei für den Erststart der Server gefunden. Die Protokollierung wird erst konfiguriert, nachdem das Protokollierungs-Subsystem für den Server \"%1$s\" aktiviert wurde";
    }
    @Override
    protected String hostDomainSynchronizationError$str() {
        return "WFLYHC0201: Fehler beim Synchronisieren des Hostmodells mit dem Domain-Controller-Modell. Fehler: %1$s";
    }
    @Override
    protected String interruptedAwaitingResumeResponse$str() {
        return "WFLYHC0190: %1$s unterbrach während des Wartens auf Antwort zu fortgesetztem Server";
    }
    @Override
    protected String undefinedSocketBindingGroup$str() {
        return "WFLYHC0082: Enthaltene Socket-Binding-Gruppe %1$s ist nicht definiert";
    }
    @Override
    protected String domainDataDirectoryIsNotDirectory$str() {
        return "WFLYHC0100: Domain-Datenverzeichnis ist kein Verzeichnis: %1$s";
    }
    @Override
    protected String couldNotCreateDomainAutoStartDirectory$str() {
        return "WFLYHC0157: Konnte kein Domain-auto-start-Verzeichnis erstellen: %1$s";
    }
    @Override
    protected String duplicateIgnoredResourceType$str() {
        return "WFLYHC0092: Ein '%1$s'-Element, dessen 'type'-Attribut '%2$s' lautet, wurde bereits gefunden";
    }
    @Override
    protected String managedServerUnstable1$str() {
        return "WFLYHC0198: Server '%1$s' ist instabil und sollte gestoppt oder neu gestartet werden. Ein instabiler Server kann evtl. nicht normal gestoppt werden, daher muss möglicherweise die Operation 'kill' ausgeführt werden, um den Serverprozess zu beenden.";
    }
    @Override
    protected String socketBindingGroupIncludesSameSocketBinding$str() {
        return "WFLYHC0168: Socket-Binding-Gruppe '%1$s' enthält Socket-Binding-Gruppe '%2$s' und Socket-Binding-Gruppe '%3$s'. Beide Socket-Binding-Gruppen definieren das Socket-Binding '%4$s', was nicht unterstützt wird";
    }
    @Override
    protected String resumeExecutionFailed$str() {
        return "WFLYHC0194: Ausführung der Fortsetzen-Operation fehlgeschlagen für Server: %1$s";
    }
    @Override
    protected String resumeListenerFailedMsg$str() {
        return "WFLYHC0193: Abrufen der Antwort vom Fortsetzen-Listener fehlgeschlagen für Server: %1$s";
    }
    @Override
    protected String domainBaseDirectoryIsNotADirectory$str() {
        return "WFLYHC0098: Domain-Basisverzeichnis ist kein Verzeichnis: %1$s";
    }
    @Override
    protected String hostControllerSystemPropertyUpdateNotSupported$str() {
        return "WFLYHC0090: HostControllerEnvironment Aktualisierungen von System-Properties nicht";
    }
    @Override
    protected String failedToApplyDomainConfig2$str() {
        return "WFLYHC0143: Anwendung der Domain-weiten Konfiguration vom Domain-Controller fehlgeschlagen. Ergebnis der Operation: %1$s. Fehlerbeschreibung: %2$s";
    }
    @Override
    protected String invalidJavaHome$str() {
        return "WFLYHC0213: Java Home '%1$s' existiert nicht.";
    }
    @Override
    protected String preSignedUrlMustPointToFile$str() {
        return "WFLYHC0123: pre-signed url %1$s muss auf eine Datei innerhalb eines Bucket weisen";
    }
    @Override
    protected String stoppingServer$str() {
        return "WFLYHC0024: Server %1$s wird gestoppt";
    }
    @Override
    protected String failedToStartServer$str() {
        return "WFLYHC0008: Start von Server (%1$s) fehlgeschlagen";
    }
    @Override
    protected String failedToGetServerStatus$str() {
        return "WFLYHC0058: Abruf von Server-Status fehlgeschlagen";
    }
    @Override
    protected String cannotBothHaveFalseUseCurrentHostConfigAndHostConfig$str() {
        return "WFLYHC0173: Es ist nicht möglich, use-current-host-config=false zu verwenden, wenn Sie gleichzeitig eine host-config angeben";
    }
    @Override
    protected String failedToSyncServerStatus$str() {
        return "WFLYHC0220: Der Serverstatus konnte bei der Registrierung eines Hostcontrollers nicht synchronisiert werden. Es ist kein Handler registriert, um die Operation %1$s für den Server %2$s zu verwalten.";
    }
    @Override
    protected String invalidRemoteBackupPersisterState$str() {
        return "WFLYHC0031: Kann Domain-Modell nicht mittels --backup laden";
    }
    @Override
    protected String interruptedAwaitingSuspendResponseMsg$str() {
        return "WFLYHC0185: %1$s unterbrach während des Wartens auf Antwort zu angehaltenem Server";
    }
    @Override
    protected String bindingNameNotUnique$str() {
        return "WFLYHC0162: Der Binding-Name '%1$s' in Socket-Binding-Gruppe '%2$s' ist nicht eindeutig. Namen müssen über socket-binding, local-destination-outbound-socket-binding und remote-destination-outbound-socket-binding hinweg eindeutig sein";
    }
    @Override
    protected String existingServerWithState$str() {
        return "WFLYHC0005: Bestehender Server [%1$s] mit Status: %2$s";
    }
    @Override
    protected String failedToSetLoggingConfiguration$str() {
        return "WFLYHC0205: Fehler beim Festlegen der Eigenschaft '-Dlogging.configuration' für Server '%1$s'. Konfigurationspfad '%2$s'";
    }
    @Override
    protected String cannotObtainValidDefaultAddress$str() {
        return "WFLYHC0046: Abrufen einer gültigen Standardadresse zur Kommunikation mit dem ProcessController mittels entweder %1$s oder InetAddress.getLocalHost() nicht möglich. Bitte überprüfen Sie die Netzwerkkonfiguration Ihres Systems oder verwenden Sie den Befehlszeilen-Switch %2$s zur Konfiguration einer gültigen Adresse";
    }
    @Override
    protected String fetchConfigFromDomainMasterFailed$str() {
        return "WFLYHC0144: Der Host konnte nicht starten, weil er im laufenden Modus '%1$s' ohne Zugriff auf eine lokale Kopie der Domain-weiten Konfigurationsrichtlinie gestartet wurde, das '%2$s'-Attribut war auf '%3$s' festgelegt und die Domain-weite Konfigurationsrichtlinie konnte nicht vom Domain-Controller-Host abgerufen werden. Starten wird abgebrochen. Verwenden Sie das Befehlszeilenargument '%4$s', um zu starten, falls Sie ohne Verbindung zur Domain-Controller-Verbindung starten müssen.";
    }
    @Override
    protected String closeShouldBeManagedByService$str() {
        return "WFLYHC0049: Schließung sollte vom Dienst gemanagt werden";
    }
    @Override
    protected String cannotInstantiateDiscoveryOptionClass$str() {
        return "WFLYHC0134: Kann Discovery-Option-Klasse '%1$s': %2$s nicht instantiieren";
    }
    @Override
    protected String failedReportingServerInstabilityToMaster$str() {
        return "WFLYHC0200: Melden der Instabilität von Server '%1$s' an Domain-Controller fehlgeschlagen.";
    }
    @Override
    protected String discoveryOptionsFailureUnableToConnect$str() {
        return "WFLYHC0120: Alle Domain Controller Discovery Option(en) ausprobiert, aber keine Verbindung möglich";
    }
    @Override
    protected String securityRealmReferencesUnsupported$str() {
        return "WFLYHC0217: Sicherheitsbereiche werden nicht mehr unterstützt, bitte Verweise darauf von der Konfiguration migrieren.";
    }
    @Override
    protected String invalidOption$str() {
        return "WFLYHC0062: Ungültige Option '%1$s'. %2$s";
    }
    @Override
    protected String errorParsingBucketListings$str() {
        return "WFLYHC0132: Unerwarteter Fehler beim Parsen der Bucket Auflistung(en)";
    }
    @Override
    protected String cannotAccessS3Bucket$str() {
        return "WFLYHC0119: Kann nicht auf S3-Bucket '%1$s' zugreifen: %2$s";
    }
    @Override
    protected String unknown$str() {
        return "WFLYHC0084: Unbekannter %1$s %2$s";
    }
    @Override
    protected String cannotWriteDomainControllerData$str() {
        return "WFLYHC0137: Konnte Domain-Controller-Daten nicht in S3-Datei schreiben. Fehler war: %1$s";
    }
    @Override
    protected String cannotOverwriteHostXmlWithEmpty$str() {
        return "WFLYHC0207: Die Datei %1$s existiert bereits; Sie müssen --remove-existing-host-config verwenden, um bestehende Dateien zu überschreiben.";
    }
    @Override
    protected String shuttingDownInResponseToManagementRequest$str() {
        return "WFLYHC0180: Herunterfahren als Reaktion auf Management-Operation '%1$s'";
    }
    @Override
    protected String socketBindingGroupAttemptingToOverrideSocketBinding$str() {
        return "WFLYHC0166: Socket-Binding-Gruppe '%1$s' definiert Socket-Binding '%2$s', das ebenfalls in dessen übergeordneter Socket-Binding-Gruppe '%3$s' definiert ist. Das Außerkraftsetzen von Socket-Bindings wird nicht unterstützt";
    }
    @Override
    protected String preSignedUrlsMustBeSetOrUnset$str() {
        return "WFLYHC0122: pre_signed_put_url und pre_signed_delete_url müssen beide eingestellt oder nicht eingestellt sein";
    }
    @Override
    protected String timedOutAwaitingResumeResponseMsg$str() {
        return "WFLYHC0189: Timeout nach %1$d ms Wartezeit auf Antwort zu fortgesetztem Server für Server: %2$s";
    }
    @Override
    protected String slaveHostControllerChanged$str() {
        return "WFLYHC0039: Der sekundäre Host Controller \"%1$s\" wurde neu gestartet oder versucht, die Verbindung wiederherzustellen. Aktuelle Verbindung zu diesem sekundären Host Controller wird abgemeldet.";
    }
    @Override
    protected String couldNotPersistAutoStartServerStatus$str() {
        return "WFLYHC0158: Fehler beim Persistieren von Server-Autostart-Status";
    }
    @Override
    protected String interruptedAwaitingSuspendResponse$str() {
        return "WFLYHC0184: %1$s unterbrach während des Wartens auf Antwort zu angehaltenem Server";
    }
    @Override
    protected String mixedDomainUnsupportedStability$str() {
        return "WFLYHC0223: Die Stabilitätsstufe %1$s wird nur auf Hostcontrollern mit derselben Verwaltungshaupt- und -nebenversion wie die des Domain-Controllers unterstützt. Die Version des Domain-Controllers ist %2$d.%3$d, und die Version des Remote-Hostcontrollers ist %4$d.%5$d.";
    }
    @Override
    protected String cannotAccessRemoteFileRepository$str() {
        return "WFLYHC0044: Zugriff auf ein Remote-Datei-Repository vom Domain-Controller nicht möglich";
    }
    @Override
    protected String jvmOptionAlreadyExists$str() {
        return "WFLYHC0111: Option '%1$s' existiert bereits";
    }
    @Override
    protected String cannotExecuteTransactionalOperationFromSlave$str() {
        return "WFLYHC0140: Transaktionale Operation '%1$s' kann nicht vom sekundären Host Controller ausgeführt werden";
    }
    @Override
    protected String invocationNotAllowedAfterBoot$str() {
        return "WFLYHC0065: Aufrufe von %1$s nach dem HostController-Boot sind nicht zulässig";
    }
    @Override
    protected String serverSuspected$str() {
        return "WFLYHC0199: Server '%1$s' (verwaltet von Host '%2$s') reagiert nicht innerhalb des konfigurierten Timeouts auf eine Operationsanfrage. Dies kann bedeuten, dass der Server instabil geworden ist.";
    }
    @Override
    protected String couldNotCreateDomainContentDirectory$str() {
        return "WFLYHC0103: Konnte kein Domain-Inhaltsverzeichnis erstellen: %1$s";
    }
    @Override
    protected String homeDirectoryDoesNotExist$str() {
        return "WFLYHC0095: Home-Verzeichnis existiert nicht: %1$s";
    }
    @Override
    protected String incompatibleStability$str() {
        return "WFLYHC0221: Die Stabilitätsstufe %1$s des Domain-Controllers stimmt nicht mit der Stabilitätsstufe %2$s des verbindenden Hosts überein";
    }
    @Override
    protected String cannotAccessJvmInputArgument$str() {
        return "WFLYHC0093: Auf die JVM-Eingabeargumente kann nicht zugegriffen werden, so dass Systemeigenschaften, die direkt an diese Host-Controller-JVM übergeben werden, nicht durch Serverprozesse geleitet werden. Ursache des Problems: %1$s";
    }
    @Override
    protected String preSignedUrlsMustHaveSamePath$str() {
        return "WFLYHC0121: pre_signed_put_url und pre_signed_delete_url müssen denselben Pfad haben";
    }
    @Override
    protected String unableToLoadProperties$str() {
        return "WFLYHC0080: Kann Eigenschaften von URL '%1$s' nicht laden. %2$s";
    }
    @Override
    protected String configFileInUse$str() {
        return "- Verwendete Host-Controller-Konfigurationsdatei: %1$s";
    }
    @Override
    protected String suspendExecutionFailed$str() {
        return "WFLYHC0172: Ausführung von Anhalte-Operation fehlgeschlagen für Server: %1$s";
    }
    @Override
    protected String cannotRestartServer$str() {
        return "WFLYHC0047: Kann Server %1$s nicht neu starten, da er derzeit nicht gestartet ist; er ist %2$s";
    }
    @Override
    protected String invalidS3Location$str() {
        return "WFLYHC0127: Ungültiger Speicherort: %1$s";
    }
    @Override
    protected String slaveHostControllerUnreachable$str() {
        return "WFLYHC0040: Der sekundäre Host Controller \"%1$s\" konnte in den letzten [%2$d] Millisekunden nicht erreicht werden. Verbindung wird abgemeldet.";
    }
    @Override
    protected String couldNotGetServerInventory$str() {
        return "WFLYHC0053: Konnte Server-Inventar in %1$d %2$s nicht abrufen";
    }
    @Override
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYHC0105: Konnte kein Protokollverzeichnis erstellen: %1$s";
    }
    @Override
    protected String stabilityInUse$str() {
        return "- Mindeststabilitätsstufe des Features: %1$s";
    }
    @Override
    protected String noDomainControllerConfigurationProvided$str() {
        return "WFLYHC0012: Es wurde keine <domain-controller>-Konfiguration bereitgestellt, und der aktuelle Betriebsmodus ('%1$s') benötigt Zugriff auf den Domain Controller Host. Starten wird abgebrochen. Verwenden Sie das Befehlszeilenargument %2$s zum Starten im %3$s-Modus, falls Sie ohne eine Domain-Controller-Verbindung starten müssen, und verwenden Sie anschließend die Verwaltungstools, um eine zu konfigurieren.";
    }
    @Override
    protected String sslFailureUnableToConnect$str() {
        return "WFLYHC0110: Verbindung aufgrund von SSL-Fehlschlagen nicht möglich.";
    }
    @Override
    protected String configDirectoryDoesNotExist$str() {
        return "WFLYHC0099: Konfigurationsverzeichnis existiert nicht: %1$s";
    }
    @Override
    protected String serverLaunchCommandPrefix$str() {
        return "WFLYHC0152: Server %1$s wird mit JVM-Startbefehl-Präfix '%2$s' gestartet";
    }
    @Override
    protected String failedToApplyDomainConfig0$str() {
        return "WFLYHC0142: Anwendung der Domain-weiten Konfiguration vom Domain-Controller fehlgeschlagen";
    }
    @Override
    protected String unregisteringServer$str() {
        return "WFLYHC0027: Registrierung des Servers %1$s wird aufgehoben";
    }
    @Override
    protected String invalidJavaHomeBin$str() {
        return "WFLYHC0214: Java Home '%1$s' existiert nicht. Das Home-Verzeichnis wurde als %2$s identifiziert.";
    }
    @Override
    protected String cannotStartServersInvalidMode$str() {
        return "WFLYHC0048: Kann Server nicht starten, wenn Betriebsmodus des Host Controllers %1$s ist";
    }
    @Override
    protected String creatingBucketWithUnsupportedCallingFormat$str() {
        return "WFLYHC0126: Erstellen eines Speicherort-beschränkten Bucket mit nicht unterstütztem Aufruf-Format";
    }
    @Override
    protected String couldNotCreateServersDirectory$str() {
        return "WFLYHC0107: Konnte kein Server-Verzeichnis erstellen: %1$s";
    }
    @Override
    protected String aborting$str() {
        return "WFLYHC0178: Abbrechen mit Exit-Code %1$d";
    }
    @Override
    protected String invalidPreSignedUrlLength$str() {
        return "WFLYHC0125: pre-signed url %1$s kann nur ein Unterverzeichnis unter einem Bucket haben";
    }
    @Override
    protected String unsuccessfulBoot$str() {
        return "WFLYHC0034: Booten von Host Controller auf nicht wiederherstellbare Weise fehlgeschlagen; wird beendet. Details siehe vorherige Nachrichten. %1$s";
    }
    @Override
    protected String domainContentDirectoryIsNotDirectory$str() {
        return "WFLYHC0102: Domain-Inhaltsverzeichnis ist kein Verzeichnis: %1$s";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYHC0064: Wert für %1$s ist kein %2$s – %3$s. %4$s";
    }
    @Override
    protected String cannotIgnoreTypeHost$str() {
        return "WFLYHC0091: Ressourcen vom Typ %1$s können nicht ignoriert werden";
    }
    @Override
    protected String noAccessControlConfigurationAvailable$str() {
        return "WFLYHC0145: Der Host konnte nicht starten, weil er im laufenden Modus '%1$s' ohne Zugriff auf eine lokale Kopie der Domain-weiten Konfigurationsrichtlinie gestartet wurde und das '%2$s'-Attribut auf '%3$s' festgelegt war. Starten wird abgebrochen. Verwenden Sie das Befehlszeilenargument '%4$s', um im laufenden Modus '%5$s' zu starten.";
    }
    @Override
    protected String timedOutAwaitingSuspendResponse$str() {
        return "WFLYHC0182: Timeout nach %1$d ms Wartezeit auf Antwort(en) zu angehaltenem Server: %2$s";
    }
    @Override
    protected String suspendListenerFailed$str() {
        return "WFLYHC0171: Abrufen von Antwort vom Anhalten-Listener fehlgeschlagen für Server: %1$s";
    }
    @Override
    protected String managedServerUnstable2$str() {
        return "WFLYHC0198: Server '%1$s' (verwaltet von Host '%2$s') ist instabil und sollte gestoppt oder neu gestartet werden. Ein instabiler Server kann evtl. nicht normal gestoppt werden, daher muss möglicherweise die Operation 'kill' ausgeführt werden, um den Serverprozess zu beenden.";
    }
    @Override
    protected String cannotRemoveS3File$str() {
        return "WFLYHC0138: Konnte S3-Datei nicht entfernen. Fehler war: %1$s";
    }
    @Override
    protected String domainTempDirectoryIsNotADirectory$str() {
        return "WFLYHC0108: Domain-temp-Verzeichnis existiert nicht: %1$s";
    }
    @Override
    protected String argumentExpected$str() {
        return "WFLYHC0041: Argument für Option %1$s erwartet. %2$s";
    }
    @Override
    protected String failedToAddExtensions$str() {
        return "WFLYHC0114: Hinzufügung von von der Domain verwendeten Erweiterungen fehlgeschlagen. Fehlerbeschreibung: %1$s";
    }
    @Override
    protected String moduleOptionNotAllowed$str() {
        return "WFLYHC0216: Die Moduloption %1$s ist nicht zulässig.";
    }
    @Override
    protected String bucketAuthenticationFailure$str() {
        return "WFLYHC0129: Zugriff auf Bucket '%1$s' nicht möglich (rsp=%2$d (%3$s)). Möglicherweise ist der Bucket im Besitz einer anderen Person oder die Authentifizierung ist fehlgeschlagen";
    }
    @Override
    protected String cannotInitializeSaxDriver$str() {
        return "WFLYHC0133: Konnte keinen SAX-Treiber für den XMLReader initialisieren";
    }
    @Override
    protected String undefinedSocketBinding$str() {
        return "WFLYHC0081: Undefinierte Socket-Binding-Gruppe für Server %1$s";
    }
    @Override
    protected String connectedToMaster$str() {
        return "WFLYHC0148: Verbunden mit dem Domain-Controller unter %1$s";
    }
    @Override
    protected String mustInvokeBeforeCheckingSlaveStatus$str() {
        return "WFLYHC0067: Muss %1$s aufrufen, bevor der Status des sekundären Host Controllers geprüft wird";
    }
    @Override
    protected String invalidDiscoveryType$str() {
        return "WFLYHC0159: Ungültiger Discovery-Typ %1$s";
    }
    @Override
    protected String cannotCreateLocalDirectory$str() {
        return "WFLYHC0045: Kann kein lokales Verzeichnis erstellen: %1$s";
    }
    @Override
    protected String reconnectingToMaster$str() {
        return "WFLYHC0150: Erneuter Verbindungsversuch mit Domain-Controller.";
    }
    @Override
    protected String mustInvokeBeforePersisting$str() {
        return "WFLYHC0068: Muss %1$s vor Persistierung des Domain-Modells aufrufen";
    }
    @Override
    protected String reportAdminOnlyDomainXmlFailure$str() {
        return "WFLYHC0035: Installation der Domain-weiten Konfiguration ist fehlgeschlagen. Da der Betriebsmodus dieses Host Controllers ADMIN_ONLY ist, wurde das Fortfahren des Bootvorgangs gestattet. Wäre der ADMIN_ONLY-Modus nicht wirksam, so würde der Prozess aufgrund eines kritischen Boot-Fehlers abgebrochen.";
    }
    @Override
    protected String noDomainControllerConfigurationProvidedForAdminOnly$str() {
        return "WFLYHC0151: Es wurde keine Domain-Controller-Discovery-Konfiguration bereitgestellt und das '%1$s'-Attribut ist auf '%2$s' festgelegt. Starten wird abgebrochen. Verwenden Sie das %3$s-Befehlszeilenargument, um im %4$s-Modus zu starten, wenn Sie ohne eine Domain-Controller-Verbindung starten müssen, und verwenden Sie dann die Verwaltungstools, um eine zu konfigurieren.";
    }
    @Override
    protected String shuttingDownInResponseToProcessControllerSignal$str() {
        return "WFLYHC0179: ProcessController sendete Signal zum Herunterfahren; es wird nun heruntergefahren";
    }
    @Override
    protected String unsupportedStability$str() {
        return "WFLYHC0222: Die Stabilitätsstufe %1$s wird in %2$s nicht unterstützt";
    }
    @Override
    protected String insufficientInformationToGenerateHash$str() {
        return "WFLYHC0061: Unzureichende Informationen zur Generierung von Hash.";
    }
    @Override
    protected String noServerInstallationPrepared$str() {
        return "WFLYHC0218: Es wurde keine %1$s-Installation vorbereitet.";
    }
    @Override
    protected String cannotConnect$str() {
        return "WFLYHC0001: Es konnte keine Verbindung zum Remote Domain Controller '%1$s' hergestellt werden";
    }
    @Override
    protected String caughtExceptionDuringBoot$str() {
        return "WFLYHC0033: Ausnahme beim Booten abgefangen";
    }
    @Override
    protected String timedOutAwaitingSuspendResponseMsg$str() {
        return "WFLYHC0183: Timeout nach %1$d ms Wartezeit auf Antwort(en) zu angehaltenem Server: %2$s";
    }
    @Override
    protected String registeringServer$str() {
        return "WFLYHC0020: Server %1$s wird registriert";
    }
    @Override
    protected String didNotReadEntireFile$str() {
        return "WFLYHC0054: Nicht die gesamte Datei gelesen. Fehlend: %1$d";
    }
    @Override
    protected String registeredRemoteSlaveHost$str() {
        return "WFLYHC0019: Registrierter sekundärer Remote-Host \"%1$s\", %2$s";
    }
    @Override
    protected String attemptingToSet$str() {
        return "WFLYHC0042: Versuch, '%1$s' festzulegen, wobei '%2$s' bereits festgelegt ist";
    }
    @Override
    protected String unregisteredRemoteSlaveHost$str() {
        return "WFLYHC0026: Nicht registrierter sekundärer Remote-Host \"%1$s\"";
    }
    @Override
    protected String suspendExecutionFailedMsg$str() {
        return "WFLYHC0186: Ausführung von Anhalte-Operation fehlgeschlagen für Server: %1$s";
    }
    @Override
    protected String bootConfigValidationFailed$str() {
        return "WFLYHC0211: Überprüfung der Boot-Konfiguration fehlgeschlagen";
    }
    @Override
    protected String cannotFindJavaExe$str() {
        return "WFLYHC0215: Konnte keine Java Executable unter %1$s finden.";
    }
    @Override
    protected String couldNotCreateDomainTempDirectory$str() {
        return "WFLYHC0109: Konnte kein Domain-temp-Verzeichnis erstellen: %1$s";
    }
    @Override
    protected String invalidS3Bucket$str() {
        return "WFLYHC0128: Ungültiger Bucket-Name: %1$s";
    }
    @Override
    protected String failedToGetFileFromRemoteRepository$str() {
        return "WFLYHC0057: Abruf von Datei von Remote-Repository fehlgeschlagen";
    }
    @Override
    protected String cannotRenameCachedDomainXmlOnBoot$str() {
        return "WFLYHC0196: Datei %1$s kann nicht nach %2$s verschoben werden, Domain-Konfigurationsänderungen können nicht persistiert werden: %3$s ";
    }
    @Override
    protected String resumeExecutionFailedMsg$str() {
        return "WFLYHC0192: Ausführung der Fortsetzen-Operation fehlgeschlagen für Server: %1$s";
    }
    @Override
    protected String embeddedHostControllerRestartMustProvideAdminOnlyTrue$str() {
        return "WFLYHC0169: Das Neuladen in Ausführungsmodus wird nicht unterstützt mit eingebettetem Host-Controller, admin-only=true muss angegeben sein.";
    }
    @Override
    protected String cannotAddHostAlreadyRegistered$str() {
        return "WFLYHC0208: Ein Host (%1$s) wurde bereits registriert. Sie müssen diesen Host herunterfahren, bevor Sie einen neuen hinzufügen können.";
    }
    @Override
    protected String connectionToMasterTimeout$str() {
        return "WFLYHC0052: Bei %1$d Versuchen innerhalb von %2$s ms konnte keine Verbindung zum Domain-Controller hergestellt werden";
    }
    @Override
    protected String optionAlreadySet$str() {
        return "WFLYHC0016: <option value='%1$s' für jvm '%2$s' wird ignoriert, da '%3$s' festgelegt wurde";
    }
    @Override
    protected String profileIncludesSameSubsystem$str() {
        return "WFLYHC0167: Profil \"%1$s\" enthält Profil \"%2$s\" und Profil \"%3$s\". Beide Profile definieren das Subsystem \"%4$s\", was nicht unterstützt wird";
    }
    @Override
    protected String serverConnected$str() {
        return "WFLYHC0021: Server [%1$s] verbunden mittels Verbindung [%2$s]";
    }
    @Override
    protected String identityNotAuthorizedAsServer$str() {
        return "WFLYHC0219: Autorisierung fehlgeschlagen für '%1$s' beim Versuch, eine Verbindung als Domänenserver herzustellen.";
    }
    @Override
    protected String timedOutAwaitingResumeResponse$str() {
        return "WFLYHC0188: Timeout nach %1$d ms Wartezeit auf Antwort zu fortgesetztem Server für Server: %2$s";
    }
    @Override
    protected String unexpectedResponse$str() {
        return "WFLYHC0130: Unerwartete Antwort: %1$s";
    }
    @Override
    protected String cannotBothHaveFalseUseCurrentDomainConfigAndDomainConfig$str() {
        return "WFLYHC0174: Es ist nicht möglich, use-current-domain-config=false zu verwenden, wenn Sie gleichzeitig eine domain-config angeben";
    }
    @Override
    protected String httpManagementInterfaceIsUnsecured$str() {
        return "WFLYHC0013: Kein Sicherheitsbereich für http Management-Dienst definiert, sämtlicher Zugriff erfolgt ohne Einschränkung.";
    }
    @Override
    protected String interruptedAwaitingResumeResponseMsg$str() {
        return "WFLYHC0191: %1$s unterbrach während des Wartens auf Antwort zu fortgesetztem Server";
    }
    @Override
    protected String unregisteredAtRemoteHostController$str() {
        return "WFLYHC0029: Abmeldung beim Domain-Controller";
    }
    @Override
    protected String configurationPersisterAlreadyInitialized$str() {
        return "WFLYHC0050: Konfigurations-Persistierer für Domain-Modell ist bereits initialisiert";
    }
    @Override
    protected String missingHomeDirConfiguration$str() {
        return "WFLYHC0094: Fehlender Konfigurationswert für: %1$s";
    }
    @Override
    protected String suspendListenerFailedMsg$str() {
        return "WFLYHC0187: Abrufen von Antwort vom Anhalten-Listener fehlgeschlagen für Server: %1$s";
    }
    @Override
    protected String serverStillRunning$str() {
        return "WFLYHC0078: Server (%1$s) läuft noch";
    }
    @Override
    protected String connectionToMasterInterrupted$str() {
        return "WFLYHC0051: Unterbrechung beim Versuch, eine Verbindung mit dem Domain-Controller herzustellen";
    }
    @Override
    protected String cannotAddSlaveHostAfterBoot$str() {
        return "WFLYHC0210: Ein sekundärer Host Controller kann nicht mit add() hinzugefügt werden. Fügen Sie einen Host ohne Verwendung dieses Parameters hinzu, und konfigurieren Sie den Remote-Domain-Controller mithilfe von Schreibattributen.";
    }
    @Override
    protected String usingCachedDC$str() {
        return "WFLYHC0149: Option %1$s wurde festgelegt; Domain-weite Konfiguration von %2$s wird abgerufen";
    }
    @Override
    protected String fetchOfMissingConfigurationFailed$str() {
        return "WFLYHC0212: Abrufen der fehlenden Konfiguration vom Domain-Controller ohne Erklärung fehlgeschlagen. Das Ergebnis der Abrufoperation war %1$s";
    }
    @Override
    protected String masterHostControllerUnreachable$str() {
        return "WFLYHC0038: Der Domain-Controller konnte in den letzten [%1$d] Millisekunden nicht erreicht werden. Verbindung wird wiederhergestellt.";
    }
    @Override
    protected String logDirectoryIsNotADirectory$str() {
        return "WFLYHC0104: Protokollverzeichnis ist kein Verzeichnis: %1$s";
    }
    @Override
    protected String cannotWriteToS3File$str() {
        return "WFLYHC0118: Domain-Controller-Daten können nicht in S3-Datei geschrieben werden: %1$s";
    }
    @Override
    protected String noDiscoveryOptionsLeft$str() {
        return "WFLYHC0147: Keine Domain Controller Discovery Optionen übrig.";
    }
    @Override
    protected String domainBaseDirectoryDoesNotExist$str() {
        return "WFLYHC0097: Domain-Basisverzeichnis existiert nicht: %1$s";
    }
    @Override
    protected String failedToReadAuthenticationKey$str() {
        return "WFLYHC0059: Lesen des Authentifizierungsschlüssels fehlgeschlagen: %1$s";
    }
    @Override
    protected String noServerAvailable$str() {
        return "WFLYHC0014: Kein aufgerufener Server %1$s verfügbar";
    }
    @Override
    protected String resumeListenerFailed$str() {
        return "WFLYHC0195: Abrufen der Antwort vom Fortsetzen-Listener fehlgeschlagen für Server: %1$s";
    }
    @Override
    protected String unableToGenerateHash$str() {
        return "WFLYHC0079: Generierung von Hash nicht möglich";
    }
    @Override
    protected String profileAttemptingToOverrideSubsystem$str() {
        return "WFLYHC0164: Profil \"%1$s\" definiert Subsystem \"%2$s\", das ebenfalls in dessen übergeordnetem Profil \"%3$s\" definiert ist. Das Außer-Kraft-Setzen von Subsystemen wird nicht unterstützt";
    }
    @Override
    protected String domainConfigForReloadNotFound$str() {
        return "WFLYHC0175: Die zum Neuladen angegebene domain-config '%1$s' konnte nicht gefunden werden";
    }
    @Override
    protected String serversDirectoryIsNotADirectory$str() {
        return "WFLYHC0106: Server-Verzeichnis ist kein Verzeichnis: %1$s";
    }
    @Override
    protected String hostAlreadyShutdown$str() {
        return "WFLYHC0087: Host-Controller bereits beendet.";
    }
    @Override
    protected String invalidRootId$str() {
        return "WFLYHC0063: Ungültige root-ID [%1$d]";
    }
    @Override
    protected String nativeManagementInterfaceIsUnsecured$str() {
        return "WFLYHC0177: Kein Sicherheitsbereich definiert für den nativen Management-Dienst, der Zugriff ist nicht gesichert.";
    }
    @Override
    protected String hostRegistrationCannotReleaseSharedLock$str() {
        return "WFLYHC0170: Fehler beim Freigeben von gemeinsam verwendeter Sperre nach Host-Registrierung für operationID: %1$s";
    }
    @Override
    protected String httpRedirectSupportRequired$str() {
        return "WFLYHC0131: HTTP-Umleitungssupport erforderlich";
    }
    @Override
    protected String errorClosingDownHost$str() {
        return "WFLYHC0055: Fehler beim Schließen des Host";
    }
    @Override
    protected String nullHostName$str() {
        return "WFLYHC0209: Hostname darf nicht Null sein.";
    }
    @Override
    protected String ignoringPermGen$str() {
        return "WFLYHC0011: <permgen> für jvm '%1$s' Typ jvm wird ignoriert: %2$s";
    }
    @Override
    protected String attributeRequiresSSLContext$str() {
        return "WFLYHC0197: Wenn das Attribut %1$s definiert ist, muss auch ein SSL-Kontext definiert werden";
    }
    @Override
    protected String argumentHasNoValue$str() {
        return "WFLYHC0115: Argument %1$s hat keinen Wert. %2$s";
    }
    @Override
    protected String domainModelAppliedButReloadIsRequired$str() {
        return "WFLYHC0202: Die Domain-Konfiguration wurde erfolgreich angewendet, aber Neuladen ist erforderlich, bevor die Änderungen wirksam werden.";
    }
    @Override
    protected String configFilesInUse$str() {
        return "- Verwendete Host-Controller-Konfigurationsdateien: %1$s, %2$s";
    }
    @Override
    protected String cannotConnectToMaster$str() {
        return "WFLYHC0002: Es konnte keine Verbindung zum Domain-Controller hergestellt werden. Fehler war: %1$s";
    }
    @Override
    protected String couldNotObtainDomainUuid$str() {
        return "WFLYHC0160: Domain-UUID konnte in Datei nicht gelesen oder erstellt werden: %1$s";
    }
    @Override
    protected String masterHostControllerChanged$str() {
        return "WFLYHC0037: Der primäre Host Controller wurde neu gestartet. Neuregistrierung dieses sekundären Host Controllers beim neuen primären Host Controller.";
    }
    @Override
    protected String usageNote$str() {
        return "Verwenden Sie %1$s --help für Informationen zu gültigen Befehlszeilenargumenten und deren Syntax.";
    }
    @Override
    protected String creatingHttpManagementService$str() {
        return "WFLYHC0003: http-Management-Dienst wird mittels Netzwerk-Interface (%1$s) Port (%2$d) securePort (%3$d) erstellt";
    }
    @Override
    protected String startingServer$str() {
        return "WFLYHC0023: Server %1$s wird gestartet";
    }
    @Override
    protected String malformedUrl$str() {
        return "WFLYHC0066: Nicht ordnungsgemäße URL für Option %1$s angegeben. %2$s";
    }
    @Override
    protected String failedToStopServer$str() {
        return "WFLYHC0009: Stoppen von Server (%1$s) fehlgeschlagen";
    }
    @Override
    protected String failedDiscoveringMaster$str() {
        return "WFLYHC0146: Auffinden des Domain-Controllers mittels Discovery-Option %1$s nicht möglich. Fehler war: %2$s";
    }
    @Override
    protected String authenticationFailureUnableToConnect$str() {
        return "WFLYHC0043: Verbindung aufgrund von fehlgeschlagener Authentifizierung nicht möglich.";
    }
}
