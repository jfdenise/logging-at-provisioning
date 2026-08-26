package org.jboss.as.connector.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:48+0200")
public class ConnectorLogger_$logger_de extends ConnectorLogger_$logger implements ConnectorLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ConnectorLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String boundDataSource$str() {
        return "WFLYJCA0001: Gebundene Datenquelle [%1$s]";
    }
    @Override
    protected String boundJca$str() {
        return "WFLYJCA0002: Gebundene Jakarta-Connectors %1$s [%2$s]";
    }
    @Override
    protected String cannotInstantiateDriverClass2$str() {
        return "WFLYJCA0003: Keine Instantiierung möglich von Treiberklasse \"%1$s\": %2$s";
    }
    @Override
    protected String deployingCompliantJdbcDriver$str() {
        return "WFLYJCA0004: Deployment von JDBC-konformem Treiber %1$s (Version %2$d.%3$d)";
    }
    @Override
    protected String deployingNonCompliantJdbcDriver$str() {
        return "WFLYJCA0005: Deployment von nicht-JDBC-konformem Treiber %1$s (Version %2$d.%3$d)";
    }
    @Override
    protected String registeredAdminObject$str() {
        return "WFLYJCA0006: Registrierung von admin-Objekt unter %1$s";
    }
    @Override
    protected String registeredConnectionFactory$str() {
        return "WFLYJCA0007: Registrierung von Connection-Factory %1$s";
    }
    @Override
    protected String startingSubsystem$str() {
        return "WFLYJCA0009: Starten von %1$s-Subsystem (%2$s)";
    }
    @Override
    protected String unboundDataSource$str() {
        return "WFLYJCA0010: Ungebundene Datenquelle [%1$s]";
    }
    @Override
    protected String unboundJca$str() {
        return "WFLYJCA0011: Ungebundene Jakarta-Connectors %1$s [%2$s]";
    }
    @Override
    protected String driversElementNotSupported$str() {
        return "WFLYJCA0012: <drivers/> in eigenständigen \"-ds.xml\"-Deployments werden nicht unterstützt: Ignoriere %1$s";
    }
    @Override
    protected String driverNameAndResourceNameNotEquals$str() {
        return "WFLYJCA0015: Der Attribut-Treibername (%1$s) kann sich nicht vom Treiber-Ressourcennamen (%2$s) unterscheiden";
    }
    @Override
    protected String methodNotFoundOnDataSource$str() {
        return "WFLYJCA0016: Methode %1$s an DataSource-Klasse %2$s nicht gefunden. Ignoriere";
    }
    @Override
    protected String forceIJToNull$str() {
        return "WFLYJCA0017: Erzwinge ironjacamar.xml Deskriptor auf Null";
    }
    @Override
    protected String startedDriverService$str() {
        return "WFLYJCA0018: Treiberdienst mit driver-name = %1$s gestartet";
    }
    @Override
    protected String stoppedDriverService$str() {
        return "WFLYJCA0019: Treiberdienst mit driver-name = %1$s gestoppt";
    }
    @Override
    protected String unsupportedSelectorOption$str() {
        return "WFLYJCA0020: Nicht unterstützte Selector-Option: %1$s";
    }
    @Override
    protected String unsupportedPolicyOption$str() {
        return "WFLYJCA0021: Nicht unterstützte Richtlinien-Option: %1$s";
    }
    @Override
    protected String failedToStartJGroupsChannel$str() {
        return "WFLYJCA0022: Starten von JGroups-Channel %1$s für verteilten Workmanager %2$s fehlgeschlagen";
    }
    @Override
    protected String failedToFindDistributedWorkManager$str() {
        return "WFLYJCA0023: Konnte WorkManager %1$s nicht finden oder es ist kein verteilter Workmanager. Nur DWM kann Konfigurationen außer Kraft setzen.";
    }
    @Override
    protected String failedToStartDWMTransport$str() {
        return "WFLYJCA0024: Starten von JGroups-Transport für verteilten Workmanager %1$s fehlgeschlagen";
    }
    @Override
    protected String unsupportedSelector$str() {
        return "WFLYJCA0025: Nicht unterstützte Selector-Option: %1$s";
    }
    @Override
    protected String unsupportedPolicy$str() {
        return "WFLYJCA0026: Nicht unterstützte Richtlinien-Option: %1$s";
    }
    @Override
    protected String noSecurityDefined$str() {
        return "WFLYJCA0027: Kein ironjacamar.security definiert für %1$s";
    }
    @Override
    protected String connectionFactoryAnnotation$str() {
        return "WFLYJCA0028: @ConnectionFactoryDefinition wird eingeschränktes Management haben: %1$s";
    }
    @Override
    protected String adminObjectAnnotation$str() {
        return "WFLYJCA0029: @AdministeredObjectDefinition wird eingeschränktes Management haben: %1$s";
    }
    @Override
    protected String cannotDeploy$str() {
        return "WFLYJCA0030: Deployment nicht möglich";
    }
    @Override
    protected String cannotDeployAndValidate$str() {
        return "WFLYJCA0031: Validierung und Deployment von ds oder xads nicht möglich";
    }
    @Override
    protected String deploymentError$str() {
        return "WFLYJCA0033: Fehler beim Deployment von %1$s";
    }
    @Override
    protected String cannotInstantiateDriverClass1$str() {
        return "WFLYJCA0034: Instantiierung von Treiberklasse \"%1$s\" nicht möglich. Siehe Protokoll (WARN) für weitere Informationen";
    }
    @Override
    protected String driverVersionMismatch$str() {
        return "WFLYJCA0035: Angegebene Treiberversion stimmt nicht mit der tatsächlichen Treiberversion überein";
    }
    @Override
    protected String failedToCreate$str() {
        return "WFLYJCA0036: Erstellung von %1$s Instanz aus [%2$s]%n Grund fehlgeschlagen: %3$s";
    }
    @Override
    protected String failedToGetMetrics$str() {
        return "WFLYJCA0037: Abruf von Metriken fehlgeschlagen: %1$s";
    }
    @Override
    protected String failedToGetUrlDelimiter$str() {
        return "WFLYJCA0039: Abruf von url-Delimiter fehlgeschlagen";
    }
    @Override
    protected String failedToInvokeOperation$str() {
        return "WFLYJCA0040: Aufruf von Operation fehlgeschlagen: %1$s";
    }
    @Override
    protected String failedToLoadModuleDriver$str() {
        return "WFLYJCA0041: Laden von Modul für Treiber [%1$s] fehlgeschlagen";
    }
    @Override
    protected String failedToMatchPool$str() {
        return "WFLYJCA0042: Übereinstimmung von Pool fehlgeschlagen. Überprüfen Sie JndiName: %1$s";
    }
    @Override
    protected String failedToParseServiceXml$str() {
        return "WFLYJCA0043: Parsen von Dienst-XML [%1$s] fehlgeschlagen";
    }
    @Override
    protected String failedToProcessRaChild$str() {
        return "WFLYJCA0044: Bearbeitung von untergeordneten RA-Archiven für [%1$s] fehlgeschlagen";
    }
    @Override
    protected String failedToSetAttribute$str() {
        return "WFLYJCA0045: Festlegen von Attribut fehlgeschlagen: %1$s";
    }
    @Override
    protected String failedToStartRaDeployment$str() {
        return "WFLYJCA0046: Starten von RA-Deployment [%1$s] fehlgeschlagen";
    }
    @Override
    protected String invalidConnection$str() {
        return "WFLYJCA0047: Connection ist nicht gültig";
    }
    @Override
    protected String jndiBindingsNotSupported$str() {
        return "WFLYJCA0049: Nicht-explizite JNDI-Bindings nicht unterstützt";
    }
    @Override
    protected String noMetricsAvailable$str() {
        return "WFLYJCA0050: Keine Metrik verfügbar";
    }
    @Override
    protected String notAnAnnotation$str() {
        return "WFLYJCA0051: %1$s sollte eine Annotation sein";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYJCA0052: %1$s ist Null";
    }
    @Override
    protected String serviceAlreadyStarted$str() {
        return "WFLYJCA0053: %1$s Dienst [%2$s] ist bereits gestartet";
    }
    @Override
    protected String serviceNotAvailable$str() {
        return "WFLYJCA0054: %1$s Dienst [%2$s] ist nicht verfügbar";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYJCA0056: Dienst nicht gestartet";
    }
    @Override
    protected String undefinedVar$str() {
        return "WFLYJCA0058: %1$s ist nicht definiert";
    }
    @Override
    protected String failedToLoadNativeLibraries$str() {
        return "WFLYJCA0061: Laden nativer Bibliotheken fehlgeschlagen";
    }
    @Override
    protected String exceptionDeployingDatasource$str() {
        return "WFLYJCA0064: Ausnahme beim Deployment von Datenquelle %1$s";
    }
    @Override
    protected String noDataSourceRegisteredForAddress$str() {
        return "WFLYJCA0065: Es existiert keine DataSource an Adresse %1$s";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYJCA0066: Unbekanntes Attribut %1$s";
    }
    @Override
    protected String unknownOperation$str() {
        return "WFLYJCA0067: Unbekannte Operation %1$s";
    }
    @Override
    protected String xaDataSourcePropertiesNotPresent$str() {
        return "WFLYJCA0069: Mindestens eine xa-datasource-property ist für eine xa-datasource erforderlich";
    }
    @Override
    protected String deploymentFailed$str() {
        return "WFLYJCA0072: Deployment %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToLoadModuleRA$str() {
        return "WFLYJCA0073: Modul für RA konnte nicht geladen werden [%1$s] Ursache: %2$s";
    }
    @Override
    protected String noSuchMethod$str() {
        return "WFLYJCA0074: Methode %1$s nicht gefunden";
    }
    @Override
    protected String noSuchField$str() {
        return "WFLYJCA0075: Feld %1$s nicht gefunden";
    }
    @Override
    protected String noPropertyResolution$str() {
        return "WFLYJCA0076: Unbekannte Property-Auflösung für Property %1$s";
    }
    @Override
    protected String archiveOrModuleRequired$str() {
        return "WFLYJCA0077: Es wird mindestens entweder ARCHIVE oder MODULE benötigt";
    }
    @Override
    protected String compressedRarNotSupportedInModuleRA$str() {
        return "WFLYJCA0078: Rar wird nur in unkomprimierter Form unterstützt. Laden von Modul für RA [%1$s] fehlgeschlagen";
    }
    @Override
    protected String FailedDeployDriverNotSpecified$str() {
        return "WFLYJCA0079: Deployment von Datenquelle %1$s fehlgeschlagen, da Treiber nicht festgelegt";
    }
    @Override
    protected String RARNotYetDeployed$str() {
        return "WFLYJCA0080: RAR \"%1$s\" noch nicht deployt.";
    }
    @Override
    protected String invalidConnectionFactory$str() {
        return "WFLYJCA0083: Verbindungs-Factory-Schnittstelle (%1$s) ist inkorrekt für Ressourcenadapter \"%2$s\" beim Deployment von %3$s";
    }
    @Override
    protected String adminObjectForJCA10$str() {
        return "WFLYJCA0084: Admin-Objekt für JCA 1.0-Ressourcenadapter \"%1$s\" beim Deployment von %2$s deklariert";
    }
    @Override
    protected String invalidAdminObject$str() {
        return "WFLYJCA0085: Admin-Objektklasse (%1$s) für Ressourcenadapter \"%2$s\" ist inkorrekt beim Deployment von %3$s";
    }
    @Override
    protected String cannotFindDriverClassName$str() {
        return "WFLYJCA0086: Kann Treiberklassennamen nicht in \"%1$s\" jar finden";
    }
    @Override
    protected String unableToRegisterRecovery$str() {
        return "WFLYJCA0087: Wiederherstellung kann nicht registriert werden: %1$s (%2$s)";
    }
    @Override
    protected String rejectAttributesMustBeTrue$str() {
        return "WFLYJCA0088: Attribute %1$s abgelehnt. Müssen \"true\" sein";
    }
    @Override
    protected String exceptionDuringUnregistering$str() {
        return "WFLYJCA0089: Fehler bei der Deregistrierung des Deployments";
    }
    @Override
    protected String jndiNameShouldValidate$str() {
        return "WFLYJCA0090: Jndi-Name sollte '//' nicht enthalten oder in '/' enden";
    }
    @Override
    protected String deprecated$str() {
        return "WFLYJCA0091: -ds.xml Datei-Deployments sind veraltet. Unterstützung wird in zukünftigen Versionen ggf. entfernt.";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYJCA0092: Indexierte Unterressourcen können nur registriert werden, wenn die übergeordnete Ressource geordnete Unterelemente unterstützt. Das übergeordnete Element von '%1$s' ist nicht indexiert";
    }
    @Override
    protected String legacyDisableEnableOperation$str() {
        return "WFLYJCA0093: Die \"%1$s\"-Operation ist veraltet. Vorzugsweise sollten die Operationen \"add\" oder \"remove\" verwendet werden, oder falls nötig kann die Operation \"write-attribute\" verwendet werden, um das veraltete \"enabled\"-Attribut festzulegen";
    }
    @Override
    protected String errorDuringRecoveryShutdown$str() {
        return "WFLYJCA0096: Fehler beim Herunterfahren zur Wiederherstellung";
    }
    @Override
    protected String errorStoppingRA$str() {
        return "WFLYJCA0097: Ausnahme beim Stoppen des Ressourcen-Adapters";
    }
    @Override
    protected String boundNonJTADataSource$str() {
        return "WFLYJCA0098: Gebundene nicht transaktionale Datenquelle: %1$s";
    }
    @Override
    protected String unBoundNonJTADataSource$str() {
        return "WFLYJCA0099: Ungebundene nicht transaktionale Datenquelle: %1$s";
    }
    @Override
    protected String noSupportedOperation$str() {
        return "WFLYJCA0100: Operation %1$s wird nicht unterstützt";
    }
    @Override
    protected String oneThreadPoolWorkManager$str() {
        return "WFLYJCA0101: Thread-Pool: %1$s (Typ: %2$s) kann nicht hinzugefügt werden für Workmanager: %3$s; nur ein Thread-Pool je Typ ist zulässig.";
    }
    @Override
    protected String attributeRequiresTrueAttribute$str() {
        return "WFLYJCA0102: Attribut %1$s kann nur definiert werden, wenn %2$s \"true\" ist";
    }
    @Override
    protected String attributeRequiresFalseOrUndefinedAttribute$str() {
        return "WFLYJCA0103: Attribut %1$s kann nur definiert werden, wenn %2$s nicht definiert oder \"false\" ist";
    }
    @Override
    protected String elytronHandlerHandle$str() {
        return "WFLYJCA0106: Elytron-Handler-Handle: %1$s";
    }
    @Override
    protected String executionSubjectNotSetInHandler$str() {
        return "WFLYJCA0107: Ausführungssubjekt wurde nicht an den Callback-Handler übergeben";
    }
    @Override
    protected String invalidCallbackSecurityDomain$str() {
        return "WFLYJCA0108: Der angegebene Callback enthält keine Sicherheitsdomainreferenz";
    }
    @Override
    protected String unsupportedCreateCallbackHandlerMethod$str() {
        return "WFLYJCA0109: Callback mit Sicherheitsdomain ist erforderlich. Verwenden Sie stattdessen createCallbackHandler(Callback callback)";
    }
    @Override
    protected String invalidCredentialSourceSupplier$str() {
        return "WFLYJCA0110: CredentialSourceSupplier ist ungültig für DSSecurity";
    }
    @Override
    protected String invalidElytronWorkManagerSetting$str() {
        return "WFLYJCA0111: Für WorkManager ist das Elytron-Flag entsprechend RA nicht festgelegt";
    }
    @Override
    protected String datasourceIsDisabled$str() {
        return "WFLYJCA0112: Datenquelle %1$s ist deaktiviert";
    }
    @Override
    protected String unexceptedWorkerCompletionError$str() {
        return "WFLYJCA0113: Unerwarteter Fehler während Worker-Ausführung : %1$s";
    }
    @Override
    protected String failedToLoadDataSourceClass$str() {
        return "WFLYJCA0114: Die Klasse der Datenquelle konnte nicht geladen werden: %1$s";
    }
    @Override
    protected String missingDependencyInModuleDriver$str() {
        return "WFLYJCA0115: Modul für Treiber [%1$s] oder eine seiner Abhängigkeiten fehlt: [%2$s]";
    }
    @Override
    protected String raModuleNotFound$str() {
        return "WFLYJCA0116: Modul für RA [%1$s] konnte nicht geladen werden - das Modul oder eine seiner Abhängigkeiten fehlt [%2$s]";
    }
    @Override
    protected String notAValidDataSourceClass$str() {
        return "WFLYJCA0117: %1$s ist keine gültige %2$s-Implementierung";
    }
    @Override
    protected String bindingAlias$str() {
        return "WFLYJCA0118: Verbindungs-Factory namens %1$s wird an Alias %2$s gebunden";
    }
    @Override
    protected String unbindingAlias$str() {
        return "WFLYJCA0119: Bindung von Verbindungs-Factory namens %1$s an Alias %2$s wird aufgehoben";
    }
    @Override
    protected String cannotStartDSNoConnectionFactory$str() {
        return "WFLYJCA0120: Die Datenquelle ''%1$s'' kann nicht gestartet werden, da keine Verbindungs-Factories vorhanden sind, entweder nicht definiert oder fehlgeschlagen, bitte Protokoll prüfen.";
    }
    @Override
    protected String cannotStartDSTooManyConnectionFactories$str() {
        return "WFLYJCA0121: Die Datenquelle ''%1$s'' kann nicht gestartet werden, da mehr als eine(%2$s) Verbindungs-Factory definiert ist.";
    }
    @Override
    protected String threadPoolNameMustMatchWorkManagerName$str() {
        return "WFLYJCA0122: Der Name des Thread-Pools %1$s (Typ: %2$s) muss mit dem Namen des Workmanagers %3$s übereinstimmen.";
    }
    @Override
    protected String legacySecurityNotAvailable2$str() {
        return "WFLYJCA0123: Die Verbindungsdefinition %1$s vom Ressourcenadapter %2$s ist so konfiguriert, dass sie das alte Sicherheitssubsystem benötigt. Dieses ist nicht vorhanden.";
    }
    @Override
    protected String legacySecurityNotAvailable1$str() {
        return "WFLYJCA0124: Die Datenquelle %1$s ist so konfiguriert, dass sie das alte Sicherheitssubsystem benötigt. Dieses ist nicht vorhanden.";
    }
    @Override
    protected String legacySecurityNotAvailableForDsXml$str() {
        return "WFLYJCA0125: Die Datenquelle %1$s ist so konfiguriert, dass sie das alte Sicherheitssubsystem benötigt. Dieses ist nicht vorhanden.";
    }
    @Override
    protected String legacySecurityNotAvailableForRa$str() {
        return "WFLYJCA0126: Verbindungsdefinition für %1$s ist so konfiguriert, dass sie das alte Sicherheitssubsystem benötigt. Dieses ist nicht vorhanden.";
    }
    @Override
    protected String legacySecurityNotAvailableForConnectionFactory$str() {
        return "WFLYJCA0127: Die Verbindungs-Factory %1$s ist so konfiguriert, dass sie das alte Sicherheitssubsystem benötigt. Dieses ist nicht vorhanden.";
    }
    @Override
    protected String legacySecurityNotAvailable0$str() {
        return "WFLYJCA0128: Legacy-Sicherheit ist nicht verfügbar";
    }
    @Override
    protected String wrongModuleName$str() {
        return "WFLYJCA0129: Falscher Modulname %1$s";
    }
    @Override
    protected String reportDirectoryDoesNotExist$str() {
        return "WFLYJCA0130: Das Berichtsverzeichnis %1$s existiert nicht";
    }
    @Override
    protected String legacySecurityAttributeNotSupported$str() {
        return "WFLYJCA0131: Das alte Sicherheitsattribut %1$s wird nicht mehr unterstützt. Bitte verwenden Sie stattdessen die Elytron-Konfiguration.";
    }
    @Override
    protected String legacySecurityNotSupported$str() {
        return "WFLYJCA0132: Die alte Sicherheitslösung wird nicht mehr unterstützt. Bitte verwenden Sie stattdessen die Elytron-Konfiguration.";
    }
    @Override
    protected String authorizationFailed$str() {
        return "WFLYJCA0133: Autorisierung fehlgeschlagen";
    }
    @Override
    protected String nameAttributeIsMandatory$str() {
        return "WFLYJCA0134: Das Namensattribut ist für das Workmanager-Element obligatorisch.";
    }
    @Override
    protected String jdbcDriverNotInstalled$str() {
        return "WFLYJCA0135: Der JDBC-Treiber:%1$s ist nicht installiert.";
    }
}
