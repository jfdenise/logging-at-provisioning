package org.jboss.as.server.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:51+0200")
public class ServerLogger_$logger_de extends ServerLogger_$logger implements ServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ServerLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotMixUnmanagedAndManagedContentItems$str() {
        return "WFLYSRV0203: Kann %1$s nicht verwenden, wenn %2$s verwendet werden";
    }
    @Override
    protected String jbossDeploymentStructureIgnored$str() {
        return "WFLYSRV0001: %1$s in Unter-Deployment ignoriert. jboss-deployment-structure.xml wird nur für Deployments der obersten Ebene geparst.";
    }
    @Override
    protected String unableToCreateAuthDir$str() {
        return "WFLYSRV0289: Kann auth dir %1$s nicht erstellen.";
    }
    @Override
    protected String subdeploymentNotFound$str() {
        return "WFLYSRV0166: Unter-Deployment %1$s in jboss-deployment-structure.xml nicht gefunden. Verfügbare Unter-Deployments: %2$s";
    }
    @Override
    protected String shutdownHookInvoked$str() {
        return "WFLYSRV0220: Herunterfahren von Server wurde angefordert per OS-Signal";
    }
    @Override
    protected String invalidCommandLineOption$str() {
        return "WFLYSRV0073: Ungültige Option '%1$s'";
    }
    @Override
    protected String logHttpConsole$str() {
        return "WFLYSRV0051: Admin-Konsole horcht an http://%1$s:%2$d";
    }
    @Override
    protected String logDirectoryIsNotADirectory$str() {
        return "WFLYSRV0127: Protokollverzeichnis ist kein Verzeichnis: %1$s";
    }
    @Override
    protected String annotationImportIgnored$str() {
        return "WFLYSRV0017: Import-Option %1$s für Annotationen, die in der jboss-deployment-structure.xml für zusätzliches Modul %2$s definiert wurde, wurde ignoriert. Zusätzliche Module können keine Annotationen importieren.";
    }
    @Override
    protected String failedToLoadModule$str() {
        return "WFLYSRV0179: Laden des Moduls %1$s fehlgeschlagen";
    }
    @Override
    protected String couldNotCreateServerDataDirectory$str() {
        return "WFLYSRV0124: Konnte kein Server-Datenverzeichnis erstellen: %1$s";
    }
    @Override
    protected String serverConfigFileInUse$str() {
        return "- Verwendete Serverkonfigurationsdatei: %1$s";
    }
    @Override
    protected String valueExpectedForCommandLineOption$str() {
        return "WFLYSRV0072: Wert für Option %1$s erwartet";
    }
    @Override
    protected String startingNonGraceful$str() {
        return "WFLYSRV0282: Der Server wird mit deaktiviertem ordnungsgemäßen Start; externe Anfragen erhalten möglicherweise Fehlerantworten, bis der Startvorgang abgeschlossen ist.";
    }
    @Override
    protected String serverStarting$str() {
        return "WFLYSRV0049: %1$s startet %2$s";
    }
    @Override
    protected String mechNoLoginNameGiven$str() {
        return "WFLYSRV0307: Kein Anmeldename für Authentifizierungsmechanismus angegeben";
    }
    @Override
    protected String runtimeNameMustBeUnique$str() {
        return "WFLYSRV0205: Ein Deployment namens %1$s mit demselben Laufzeitnamen %2$s ist bereits vorhanden";
    }
    @Override
    protected String cannotSpecifyBothAdminOnlyAndStartMode$str() {
        return "WFLYSRV0264: \"admin-only\" und \"start-mode\" können nicht beide festgelegt werden";
    }
    @Override
    protected String logHttpManagement$str() {
        return "WFLYSRV0060: HTTP-Management-Interface ist empfangsbereit auf http://%1$s:%2$d/Management";
    }
    @Override
    protected String argGitAuth$str() {
        return "Elytron-Konfigurationsdatei zur Verwaltung von Git-Anmeldedaten. Standard ist 'null'";
    }
    @Override
    protected String noSuchDeploymentContent$str() {
        return "WFLYSRV0084: Kein Deployment-Inhalt mit Hash %1$s ist im Deployment-Inhalts-Repository verfügbar.";
    }
    @Override
    protected String excludedDependenciesNotExist$str() {
        return "WFLYSRV0274: Ausgeschlossene Abhängigkeit %1$s über jboss-deployment-structure.xml nicht vorhanden.";
    }
    @Override
    protected String domainConfigDirDoesNotExist$str() {
        return "WFLYSRV0134: Domain-Konfigurationsverzeichnis existiert nicht: %1$s";
    }
    @Override
    protected String cannotMergeResourceRoot$str() {
        return "WFLYSRV0163: Kann Ressourcen-Root für eine andere Datei nicht zusammenfügen. Diese: %1$s, Zusammenzufügende: %2$s";
    }
    @Override
    protected String nullModuleAttachment$str() {
        return "WFLYSRV0195: Kann erforderliches Modul nicht abrufen für: %1$s";
    }
    @Override
    protected String noSuchDeployment$str() {
        return "WFLYSRV0085: Kein Deployment mit Namen %1$s gefunden";
    }
    @Override
    protected String duplicateJBossXmlNamespace$str() {
        return "WFLYSRV0192: Doppelter Namespace %1$s in jboss-all.xml";
    }
    @Override
    protected String argInterfaceBindAddress$str() {
        return "Setzen Sie eine System-Property jboss.bind.address.<interface> auf den gegebenen Wert";
    }
    @Override
    protected String unableToInitialiseSSLContext$str() {
        return "WFLYSRV0117: Initialisierung eines einfachen SSLContext '%1$s' nicht möglich";
    }
    @Override
    protected String noMethodFound$str() {
        return "WFLYSRV0175: Keine Methode gefunden mit ID: %1$s an Klasse (oder ihrer Superklasse) %2$s";
    }
    @Override
    protected String cannotHaveMoreThanOneManagedContentItem$str() {
        return "WFLYSRV0201: Kann nicht mehr als ein %1$s haben";
    }
    @Override
    protected String errorGettingReflectiveInformation$str() {
        return "WFLYSRV0177: Fehler beim Abruf reflektiver Informationen für %1$s mit ClassLoader %2$s";
    }
    @Override
    protected String cannotBothHaveFalseUseCurrentConfigAndServerConfig$str() {
        return "WFLYSRV0237: Es ist nicht möglich, use-current-server-config=false zu verwenden, wenn Sie gleichzeitig eine server-config angeben";
    }
    @Override
    protected String didNotReadEntireFile$str() {
        return "WFLYSRV0107: Nicht die gesamte Datei gelesen. Fehlend: %1$d";
    }
    @Override
    protected String invalidPoolSize$str() {
        return "WFLYSRV0265: Ungültiger Wert '%1$s' für Systemeigenschaft '%2$s' – Wert muss eine nicht negative Ganzzahl sein";
    }
    @Override
    protected String failedToRestoreConfiguration$str() {
        return "WFLYSRV0315: Die Konfiguration konnte nicht wiederhergestellt werden, nachdem die Initialisierung des Repository %1$s fehlgeschlagen ist";
    }
    @Override
    protected String cannotReadContentFromSelfContainedServer$str() {
        return "WFLYSRV0254: Inhalte können nicht von einem Deployment in einem eigenständigen Server gelesen werden";
    }
    @Override
    protected String malformedCommandLineURL$str() {
        return "WFLYSRV0074: Nicht ordnungsgemäße URL '%1$s' für Option '%2$s' angegeben";
    }
    @Override
    protected String unknownMountType$str() {
        return "WFLYSRV0112: Unbekannter Einhängetyp %1$s";
    }
    @Override
    protected String deploymentDeployedNotification$str() {
        return "WFLYSRV0234: Deployment von \"%1$s\" durchgeführt (runtime-name: \"%2$s\")";
    }
    @Override
    protected String shuttingDownInResponseToManagementRequest$str() {
        return "WFLYSRV0241: Herunterfahren als Reaktion auf Management-Operation '%1$s'";
    }
    @Override
    protected String deploymentStructureFileNotFound$str() {
        return "WFLYSRV0167: Keine jboss-deployment-structure.xml-Datei in %1$s gefunden";
    }
    @Override
    protected String argDefaultMulticastAddress$str() {
        return "Setzen Sie eine System-Property jboss.default.multicast.address auf den gegebenen Wert";
    }
    @Override
    protected String serviceModuleLoaderAlreadyStopped$str() {
        return "WFLYSRV0098: ServiceModuleLoader ist bereits gestoppt";
    }
    @Override
    protected String deploymentReplaced$str() {
        return "WFLYSRV0016: Deployment \"%1$s\" durch Deployment \"%2$s\" ersetzt";
    }
    @Override
    protected String staticModuleIndexingFailed$str() {
        return "WFLYSRV0286: Indexierung des statischen Moduls %1$s für Anmerkungen fehlgeschlagen";
    }
    @Override
    protected String logHttpsManagement$str() {
        return "WFLYSRV0061: HTTP-Management-Interface ist empfangsbereit auf https://%1$s:%2$d/Management";
    }
    @Override
    protected String serverConfigForReloadNotFound$str() {
        return "WFLYSRV0238: Die zum Neuladen angegebene server-config '%1$s' konnte nicht gefunden werden";
    }
    @Override
    protected String creatingHttpManagementServiceOnSocket$str() {
        return "WFLYSRV0039: http-Management-Dienst wird mittels Socket-Binding (%1$s) erstellt";
    }
    @Override
    protected String classPathEntryNotValid$str() {
        return "WFLYSRV0059: Eintrag für Klassenpfad %1$s in %2$s zeigt nicht auf eine gültige JAR für eine Klassenpfadreferenz.";
    }
    @Override
    protected String couldNotMountOverlay$str() {
        return "WFLYSRV0224: Overlay %1$s konnte nicht eingehängt werden, da übergeordnetes Element %2$s kein Verzeichnis ist";
    }
    @Override
    protected String deploymentUndeployedNotification$str() {
        return "WFLYSRV0233: Deployment von \"%1$s\" aufgehoben (runtime-name: \"%2$s\")";
    }
    @Override
    protected String fdTooLow$str() {
        return "WFLYSRV0071: Das Betriebssystem hat die Anzahl offener Dateien für diesen Prozess auf %1$d begrenzt. Ein Wert von mindestens 4.096 wird empfohlen";
    }
    @Override
    protected String cannotExplodeAlreadyExplodedDeployment$str() {
        return "WFLYSRV0244: Bereits entpacktes Deployment kann nicht entpackt werden";
    }
    @Override
    protected String stoppedDeployment$str() {
        return "WFLYSRV0028: Deployment von %1$s in (runtime-name: %2$s) %3$d ms gestoppt";
    }
    @Override
    protected String cannotCreateLocalDirectory$str() {
        return "WFLYSRV0106: Kann kein lokales Verzeichnis erstellen: %1$s";
    }
    @Override
    protected String embeddedServerDirectoryNotFound$str() {
        return "WFLYSRV0143: Es existiert kein Verzeichnis namens '%1$s' unter '%2$s'";
    }
    @Override
    protected String serverBaseDirectoryIsNotADirectory$str() {
        return "WFLYSRV0135: Server-Basisverzeichnis ist kein Verzeichnis: %1$s";
    }
    @Override
    protected String wildflyConfigUrlIsSet$str() {
        return "WFLYSRV0281: Systemeigenschaft %1$s ist festgelegt. Dies sollte nur für Standalone-Clients verwendet werden. Wenn Sie dies auf dem Server festlegen, wird Ihre Profilkonfiguration außer Kraft gesetzt.";
    }
    @Override
    protected String undeployingDeploymentHasBeenRedeployed$str() {
        return "WFLYSRV0219: Deployment %1$s wurde erneut deployt und dessen Inhalt wird nicht entfernt. Sie müssen es neu starten.";
    }
    @Override
    protected String equivalentNamespacesInJBossXml$str() {
        return "WFLYSRV0193: Zwei verschiedene Versionen derselben Namespaces sind in jboss-all.xml vorhanden, %1$s und %2$s sind beide vorhanden";
    }
    @Override
    protected String deploymentRestartDetected$str() {
        return "WFLYSRV0070: Deployment-Neustart für Deployment %1$s erkannt, stattdessen wird ein vollständiges erneutes Deployment durchgeführt.";
    }
    @Override
    protected String unsupportedStability$str() {
        return "WFLYSRV0309: Die Stabilitätsstufe %1$s wird in %2$s nicht unterstützt";
    }
    @Override
    protected String illegalPermissionActions$str() {
        return "WFLYSRV0223: Unzulässige Berechtigungsaktionen '%1$s'";
    }
    @Override
    protected String argSystem$str() {
        return "Setzen Sie eine System-Property";
    }
    @Override
    protected String additionalResourceRootDoesNotExist$str() {
        return "WFLYSRV0058: Zusätzlicher, via jboss-deployment-structure.xml hinzugefügter Ressourcen-root %1$s existiert nicht";
    }
    @Override
    protected String argServerConfig$str() {
        return "Name der zu verwendenden Serverkonfigurationsdatei (Standard ist \"standalone.xml\") (dasselbe wie -c)";
    }
    @Override
    protected String invalidExtensionURI$str() {
        return "WFLYSRV0046: Die Syntax des %1$s-Erweiterungs-URI ist ungültig: %2$s";
    }
    @Override
    protected String couldNotCreateServerBaseDirectory$str() {
        return "WFLYSRV0136: Konnte kein Server-Basisverzeichnis erstellen: %1$s";
    }
    @Override
    protected String rootServiceRemoved$str() {
        return "WFLYSRV0140: Root-Dienst wurde entfernt";
    }
    @Override
    protected String aliasAddedAsExclusion$str() {
        return "WFLYSRV0294: Der Modulalias '%1$s' wurde von der Bereitstellung von '%2$s' über %3$s ausgeschlossen. Dies ist zwar zulässig, es wird jedoch empfohlen, stattdessen das Zielmodul zu verwenden. Ziehen Sie in Erwägung, diesen Alias durch sein Zielmodul '%4$s' zu ersetzen.";
    }
    @Override
    protected String couldNotGetModuleInfo$str() {
        return "WFLYSRV0232: Modulinformationen für Modulname %1$s konnten nicht abgerufen werden";
    }
    @Override
    protected String logNoConsole$str() {
        return "WFLYSRV0054: Admin-Konsole ist nicht aktiviert";
    }
    @Override
    protected String deploymentUndeployed$str() {
        return "WFLYSRV0009: Deployment von \"%1$s\" aufgehoben (runtime-name: \"%2$s\")";
    }
    @Override
    protected String noSuchDeploymentOverlayContentAtBoot$str() {
        return "WFLYSRV0198: Kein Deployment-Overlay Inhalt mit Hash %1$s ist im Deployment-Inhalts-Repository für Deployment-Overlay '%2$s' an Speicherort %3$s verfügbar. Dies ist ein schwerwiegender Boot-Fehler. Um das Problem zu beheben, starten Sie entweder mit dem --admin-only Switch-Set neu und verwenden Sie das CLI zur Installation des fehlenden Inhalts oder dessen Entfernung aus der Konfiguration oder entfernen Sie das Deployment-Overlay aus der XML-Konfigurationsdatei und starten Sie neu.";
    }
    @Override
    protected String unknownStartMode$str() {
        return "WFLYSRV0263: Unbekannter Startmodus %1$s";
    }
    @Override
    protected String failedToLoadFile$str() {
        return "WFLYSRV0200: Lesen von Datei %1$s fehlgeschlagen";
    }
    @Override
    protected String disregardingNonGraceful$str() {
        return "WFLYSRV0283: Es wurde ein nicht ordnungsgemäßer Start in Verbindung mit einem angehaltenen Start angefordert. Der Server wird angehalten starten.";
    }
    @Override
    protected String startingServerSuspended$str() {
        return "WFLYSRV0260: Server wird im angehaltenen Modus gestartet";
    }
    @Override
    protected String hostControllerNameNullInDomain$str() {
        return "WFLYSRV0080: hostControllerName darf nicht Null sein, wenn der Server in einer gemanagten Domain ist";
    }
    @Override
    protected String argReadOnlyServerConfig$str() {
        return "Name der zu verwendenden Serverkonfigurationsdatei. Dies unterscheidet sich von '--server-config' und '-c' darin, dass die Ursprungsdatei nie überschrieben wird.";
    }
    @Override
    protected String logHttpAndHttpsManagement$str() {
        return "WFLYSRV0062: HTTP-Management-Interface ist empfangsbereit auf http://%1$s:%2$d/Management und https://%3$s:%4$d/Management";
    }
    @Override
    protected String deploymentRootRequired$str() {
        return "WFLYSRV0101: Deployment-root ist erforderlich";
    }
    @Override
    protected String failedToCreateTempFileProvider$str() {
        return "WFLYSRV0164: Erstellung von temp-Datei Provider fehlgeschlagen";
    }
    @Override
    protected String errorOpeningZipFile$str() {
        return "WFLYSRV0276: Fehler beim Öffnen der ZIP-Datei %1$s aufgetreten";
    }
    @Override
    protected String securityRealmReferencesUnsupported$str() {
        return "WFLYSRV0287: Sicherheitsbereiche werden nicht mehr unterstützt, bitte Verweise darauf von der Konfiguration migrieren.";
    }
    @Override
    protected String throwableIsNull$str() {
        return "WFLYSRV0291: Die Fehlerursache ist in diesem Thread unbekannt. Überprüfen Sie andere Protokollmeldungen und den Aufrufer, um die mögliche Ursache zu erfahren.";
    }
    @Override
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYSRV0128: Konnte kein Protokollverzeichnis erstellen: %1$s";
    }
    @Override
    protected String cannotAddContentToUnmanagedDeployment$str() {
        return "WFLYSRV0247: Inhalte können nicht zu einem nicht verwalteten Deployment hinzugefügt werden";
    }
    @Override
    protected String deploymentDeployed$str() {
        return "WFLYSRV0010: Deployment von \"%1$s\" durchgeführt (runtime-name: \"%2$s\")";
    }
    @Override
    protected String failedToLoadSSHCredentials$str() {
        return "WFLYSRV0277: SSH-Anmeldedaten konnten nicht geladen werden %1$s";
    }
    @Override
    protected String invalidObject$str() {
        return "WFLYSRV0147: %1$s ist Null";
    }
    @Override
    protected String caughtExceptionDuringBoot$str() {
        return "WFLYSRV0055: Ausnahme beim Booten abgefangen";
    }
    @Override
    protected String couldNotFindHcFileRepositoryConnection$str() {
        return "WFLYSRV0109: Konnte die Datei-Repository Verbindung zum Host Controller finden.";
    }
    @Override
    protected String homeDirectoryDoesNotExist$str() {
        return "WFLYSRV0119: Home-Verzeichnis existiert nicht: %1$s";
    }
    @Override
    protected String errorCopyingFile$str() {
        return "WFLYSRV0146: Fehler beim Kopieren von '%1$s' zu '%2$s'";
    }
    @Override
    protected String invalidStreamURL$str() {
        return "WFLYSRV0150: Kann keinen Eingabe-Stream aus URL '%1$s' erstellen";
    }
    @Override
    protected String duplicateSubdeploymentListing$str() {
        return "WFLYSRV0169: Unter-Deployment '%1$s' ist zweimal in jboss-deployment-structure.xml gelistet";
    }
    @Override
    protected String cannotFindExtensionListEntry$str() {
        return "WFLYSRV0047: Erweiterungseintrag %1$s nicht in der Liste gefunden. Referenziert von %2$s";
    }
    @Override
    protected String configuredSystemPropertiesLabel$str() {
        return "Konfigurierte System-Properties:";
    }
    @Override
    protected String caughtExceptionClosingContentInputStream$str() {
        return "WFLYSRV0042: Ausnahme beim Schließen eines InputStream für hochgeladenen Deployment-Content abgefangen";
    }
    @Override
    protected String addingIgnored$str() {
        return "Hinzufügen von .gitignore";
    }
    @Override
    protected String mechCallbackHandlerFailedForUnknownReason$str() {
        return "WFLYSRV0306: Callback-Handler aus unbekanntem Grund fehlgeschlagen";
    }
    @Override
    protected String suspendingServer1$str() {
        return "WFLYSRV0211: Server wird mit Timeout von %1$d ms angehalten.";
    }
    @Override
    protected String startingSubDeployment$str() {
        return "WFLYSRV0207: Unter-Deployment (runtime-name: \"%1$s\") wird gestartet";
    }
    @Override
    protected String cannotAddMoreThanOneSocketBindingGroupForServerOrHost$str() {
        return "WFLYSRV0190: Kann nicht mehr als eine Socket-Binding-Gruppe hinzufügen. Hinzufügung von '%1$s' versucht, '%2$s' existiert jedoch bereits";
    }
    @Override
    protected String argGracefulStartup$str() {
        return "Starten Sie den Server ordnungsgemäß, indem Sie Anfragen in eine Warteschlange stellen oder sauber zurückweisen, bis der Server vollständig gestartet wurde";
    }
    @Override
    protected String deploymentAlreadyStarted$str() {
        return "WFLYSRV0087: Deployment %1$s ist bereits gestartet";
    }
    @Override
    protected String argStartMode$str() {
        return "Legt den Startmodus des Servers fest; kann entweder \"normal\", \"admin-only\" oder \"suspend\" sein. Im Fall von \"suspend\" wird der Server im angehaltenen Modus gestartet und verarbeitet keine Anfragen, bis er wiederaufgenommen wird. Beim Starten im Admin-Only-Modus öffnet der Server lediglich administrative Schnittstellen und akzeptiert Management -Anfragen, startet jedoch keine anderen Laufzeitdienste und nimmt keine Endnutzer-Anfragen an. Kann nicht in Verbindung mit \"--admin-only\" verwendet werden.";
    }
    @Override
    protected String logHttpsConsole$str() {
        return "WFLYSRV0052: Admin-Konsole horcht an https://%1$s:%2$d";
    }
    @Override
    protected String externalResourceRootsNotSupported$str() {
        return "WFLYSRV0171: Externe Ressourcen-roots nicht unterstützt, Ressourcen-roots dürfen nicht mit einem '/' beginnen: %1$s";
    }
    @Override
    protected String failedToGetFileFromRemoteRepository$str() {
        return "WFLYSRV0105: Abruf von Datei von Remote-Repository fehlgeschlagen";
    }
    @Override
    protected String duplicateDeploymentUnitProcessor$str() {
        return "WFLYSRV0206: Mehrere Deployment-Einheit-Prozessoren mit Priorität %1$s und Klasse %2$s registriert";
    }
    @Override
    protected String failedToCleanObsoleteContent$str() {
        return "WFLYSRV0216: Fehler bei der Bereinigung veralteter Inhalte %1$s ";
    }
    @Override
    protected String startedWitErrorsMessage$str() {
        return "%1$s wurde (mit Fehlern) in %2$d ms gestartet - %3$d von %4$d Diensten gestartet (der Start von %5$d Diensten ist fehlgeschlagen oder es fehlen Abhängigkeiten, %6$d Dienste sind verzögert, passiv oder werden bei Bedarf geladen) %7$s";
    }
    @Override
    protected String mechTokenNotVerified$str() {
        return "WFLYSRV0300: Token des Authentifizierungsmechanismus nicht verifiziert";
    }
    @Override
    protected String argShortServerConfig$str() {
        return "Name der zu verwendenden Serverkonfigurationsdatei (Standard ist \"standalone.xml\") (dasselbe wie --server-config)";
    }
    @Override
    protected String couldNotCreateServerContentDirectory$str() {
        return "WFLYSRV0126: Konnte kein Server-Inhaltsverzeichnis erstellen: %1$s";
    }
    @Override
    protected String failedToResolveMulticastAddress$str() {
        return "WFLYSRV0187: Abrufen der Multicast-Adresse für %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToConnectToHostController$str() {
        return "WFLYSRV0213: Verbindung zu Host-controller fehlgeschlagen, versuche es erneut.";
    }
    @Override
    protected String aborting$str() {
        return "WFLYSRV0239: Abbrechen mit Exit-Code %1$d";
    }
    @Override
    protected String failedToGetManifest$str() {
        return "WFLYSRV0161: Abruf von Manifest für Deployment %1$s fehlgeschlagen";
    }
    @Override
    protected String deploymentOverlayFailed$str() {
        return "WFLYSRV0196: Abruf von Inhalt für Deployment-Overlay %1$s an %2$s fehlgeschlagen";
    }
    @Override
    protected String caughtExceptionUndeploying$str() {
        return "WFLYSRV0043: Der Deployment-Einheit-Prozessor %1$s hat eine unerwartete Ausnahme während der Deployment-Aufhebungsphase %2$s von %3$s festgestellt";
    }
    @Override
    protected String errorUsingGit$str() {
        return "WFLYSRV0271: Git-Fehler: %1$s";
    }
    @Override
    protected String replaceRolledBackWithNoMessage$str() {
        return "WFLYSRV0015: Ersetzen von Deployment \"%1$s\" durch Deployment \"%2$s\" wurde ohne Fehlermeldung zurückgesetzt";
    }
    @Override
    protected String serverStabilityInUse$str() {
        return "- Mindeststabilitätsstufe des Features: %1$s";
    }
    @Override
    protected String cannotExplodeUnmanagedDeployment$str() {
        return "WFLYSRV0243: Nicht verwaltetes Deployment kann nicht entpackt werden";
    }
    @Override
    protected String couldNotObtainServerUuidFile$str() {
        return "WFLYSRV0231: Server-UUID konnte in Datei %1$s nicht gelesen oder erstellt werden";
    }
    @Override
    protected String suspendingServerWithNoTimeout$str() {
        return "WFLYSRV0236: Server wird ohne Timeout angehalten.";
    }
    @Override
    protected String mechNoTokenGiven$str() {
        return "WFLYSRV0304: Kein Authentifizierungsmechanismus-Token angegeben";
    }
    @Override
    protected String cannotLoadAnnotationIndex$str() {
        return "WFLYSRV0002: Das Laden ist für den Annotationsindex '%1$s' mit der folgenden Ausnahme fehlgeschlagen: %2$s";
    }
    @Override
    protected String argStability$str() {
        return "Führt den Server mit einer bestimmten Stabilitätsstufe aus. Mögliche Werte: %1$s, Standard = %2$s";
    }
    @Override
    protected String mechMessageTooLong$str() {
        return "WFLYSRV0298: Nachricht des Authentifizierungsmechanismus ist zu lang";
    }
    @Override
    protected String processStateChangeNotificationDescription$str() {
        return "Benachrichtigung, die bei einer Änderung des Prozess-Status ausgegeben wird";
    }
    @Override
    protected String argProperties$str() {
        return "Laden Sie die System-Properties der gegebenen URL";
    }
    @Override
    protected String noArgValue$str() {
        return "WFLYSRV0108: Kein Wert für Argument %1$s%n geliefert";
    }
    @Override
    protected String cannotRemoveContentFromUnexplodedDeployment$str() {
        return "WFLYSRV0252: Inhalte können nicht von einem nicht entpackten Deployment entfernt werden";
    }
    @Override
    protected String deprecatedApiUsed$str() {
        return "WFLYSRV0221: Deployment \"%1$s\" verwendet ein veraltetes Modul (\"%2$s\"), das in zukünftigen Versionen ggf. ohne Ankündigung entfernt wird.";
    }
    @Override
    protected String cannotHaveBothInitialServerConfigAndServerConfig$str() {
        return "WFLYSRV0191: Kann nicht sowohl --server-config als auch --initial-server-config verwenden";
    }
    @Override
    protected String failedCreatingTempProvider$str() {
        return "WFLYSRV0113: Erstellung von temp-Datei Provider fehlgeschlagen";
    }
    @Override
    protected String serverControllerServiceRemoved$str() {
        return "WFLYSRV0139: Server-Controller-Dienst wurde entfernt";
    }
    @Override
    protected String failedToInstantiateClassTransformer$str() {
        return "WFLYSRV0158: Instantiieren eines %1$s fehlgeschlagen";
    }
    @Override
    protected String resumingServer$str() {
        return "WFLYSRV0212: Server wird fortgesetzt";
    }
    @Override
    protected String vaultSupportRemoved$str() {
        return "WFLYSRV0285: Die Vault-Unterstützung wurde entfernt; es werden keine Vault-Ressourcen initialisiert.";
    }
    @Override
    protected String logNoHttpManagement$str() {
        return "WFLYSRV0063: HTTP-Management Interface ist nicht aktiviert";
    }
    @Override
    protected String unexpectedContent$str() {
        return "WFLYSRV0174: Unerwarteter Inhalt des Typs '%1$s', Name ist '%2$s', Text ist: '%3$s'";
    }
    @Override
    protected String invalidStreamBytes$str() {
        return "WFLYSRV0151: Keine Bytes an Param %1$s verfügbar";
    }
    @Override
    protected String deploymentRolledBackWithNoMessage$str() {
        return "WFLYSRV0022: Deployment von \"%1$s\" wurde ohne Fehlermeldung zurückgesetzt";
    }
    @Override
    protected String serverBaseDirectoryDoesNotExist$str() {
        return "WFLYSRV0122: Server-Basisverzeichnis existiert nicht: %1$s";
    }
    @Override
    protected String cannotRemoveContentFromUnmanagedDeployment$str() {
        return "WFLYSRV0251: Inhalte können nicht von einem nicht verwalteten Deployment entfernt werden";
    }
    @Override
    protected String creatingHttpManagementServiceOnSecureSocket$str() {
        return "WFLYSRV0040: http-Management-Dienst wird mittels Secure-Socket-Binding (%1$s) erstellt";
    }
    @Override
    protected String couldNotCreateServerTempDirectory$str() {
        return "WFLYSRV0130: Konnte kein Server-temp-Verzeichnis erstellen: %1$s";
    }
    @Override
    protected String creatingHttpManagementServiceOnSocketAndSecureSocket$str() {
        return "WFLYSRV0041: http-Management-Dienst wird mittels Socket-Binding (%1$s) und Secure-Socket-Binding (%2$s) erstellt";
    }
    @Override
    protected String deploymentIndexingFailed$str() {
        return "WFLYSRV0156: Indizierung von Deployment-root für Annotationen fehlgeschlagen";
    }
    @Override
    protected String unknownContentItemKey$str() {
        return "WFLYSRV0202: Unbekannter Inhaltselementschlüssel: %1$s";
    }
    @Override
    protected String subdeploymentsRequireParent$str() {
        return "WFLYSRV0102: Unter-Deployments benötigen eine übergeordnete Deployment-Einheit";
    }
    @Override
    protected String argHelp$str() {
        return "Diese Nachricht anzeigen und beenden";
    }
    @Override
    protected String reportAdminOnlyMissingDeploymentContent$str() {
        return "WFLYSRV0057: Kein Deployment-Inhalt mit Hash %1$s ist im Deployment-Inhalt Repository für Deployment '%2$s' verfügbar. Da dieser Host-Controller in ADMIN-ONLY Modus startet, wird das Fortsetzen des Startvorgangs erlaubt, um Administratoren die Gelegenheit zu geben, dieses Problem zu beheben. Wäre dieser Host Controller nicht im ADMIN-ONLY Modus, so wäre dies ein schwerwiegender Startfehler.";
    }
    @Override
    protected String failedToStartHttpManagementService$str() {
        return "WFLYSRV0083: Start des http-interface Dienstes fehlgeschlagen";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYSRV0173: Eines oder mehrere der erforderlichen Attribute fehlt:%1$s";
    }
    @Override
    protected String noDeploymentRepositoryAvailable$str() {
        return "WFLYSRV0159: Kein Deployment-Repository verfügbar.";
    }
    @Override
    protected String startingDeployment$str() {
        return "WFLYSRV0027: Deployment von \"%1$s\" wird gestartet (runtime-name: \"%2$s\")";
    }
    @Override
    protected String extensionMissingManifestAttribute$str() {
        return "WFLYSRV0045: Für die Erweiterung %1$s fehlt ein benötigtes Manifest-Attribut %2$s-%3$s (Erweiterung wird übersprungen)";
    }
    @Override
    protected String errorLoadingJBossXmlFile$str() {
        return "WFLYSRV0194: Fehler beim Laden von jboss-all.xml aus %1$s";
    }
    @Override
    protected String redeployRolledBack$str() {
        return "WFLYSRV0011: Erneutes Deployment von \"%1$s\" wurde mit folgender Fehlermeldung zurückgesetzt: %2$s";
    }
    @Override
    protected String illegalPermissionName$str() {
        return "WFLYSRV0222: Unzulässiger Berechtigungsname '%1$s'";
    }
    @Override
    protected String requiredSystemPropertyMissing$str() {
        return "WFLYSRV0257: Erforderliche Systemeigenschaft '%1$s' nicht definiert";
    }
    @Override
    protected String stoppedSubDeployment$str() {
        return "WFLYSRV0208: Unter-Deployment (runtime-name: %1$s) in %2$d ms";
    }
    @Override
    protected String multipleContentItemsNotSupported$str() {
        return "WFLYSRV0152: Nur 1 Teil Inhalt wird derzeit unterstützt (AS7-431)";
    }
    @Override
    protected String invalidModuleName$str() {
        return "WFLYSRV0170: Zusätzlicher Modulname '%1$s' ist nicht gültig. Namen müssen mit 'deployment' beginnen.";
    }
    @Override
    protected String failedToParseEnumProperty$str() {
        return "WFLYSRV0308: Parsen der Eigenschaft (%1$s) fehlgeschlagen, der Wert (%2$s) sollte einem der folgenden entsprechen: %3$s";
    }
    @Override
    protected String privateApiUsed$str() {
        return "WFLYSRV0018: Deployment \"%1$s\" verwendet ein privates Modul (\"%2$s\"), das in zukünftigen Versionen ohne vorherige Ankündigung geändert oder entfernt werden kann.";
    }
    @Override
    protected String unableToCreateTempDirForAuthTokensFileExists$str() {
        return "WFLYSRV0288: Kann tmp dir für auth Tokens nicht erstellen, da die Datei bereits existiert.";
    }
    @Override
    protected String domainBaseDirDoesNotExist$str() {
        return "WFLYSRV0133: Domain-Basisverzeichnis existiert nicht: %1$s";
    }
    @Override
    protected String nullParameter$str() {
        return "WFLYSRV0204: Null '%1$s'";
    }
    @Override
    protected String argGitRepo$str() {
        return "Git-Repository, das geklont werden soll, um die Serverkonfiguration abzurufen.";
    }
    @Override
    protected String configuredSystemEnvironmentLabel$str() {
        return "Konfigurierte Systemumgebung:";
    }
    @Override
    protected String errorLoadingDeploymentStructureFile$str() {
        return "WFLYSRV0168: Fehler beim Laden von jboss-deployment-structure.xml aus %1$s";
    }
    @Override
    protected String unsupportedApiUsed$str() {
        return "WFLYSRV0019: Deployment \"%1$s\" verwendet ein nicht unterstütztes Modul (\"%2$s\"), das in zukünftigen Versionen ohne vorherige Ankündigung geändert oder entfernt werden kann.";
    }
    @Override
    protected String noSuchDeploymentOverlayContent$str() {
        return "WFLYSRV0199: Kein Deployment-Overlay-Inhalt mit Hash %1$s ist im Deployment-Inhalts-Repository verfügbar.";
    }
    @Override
    protected String failedToUnmountContentOverride$str() {
        return "WFLYSRV0065: Aushängen des Deployment-Overlay fehlgeschlagen";
    }
    @Override
    protected String undeploymentRolledBackWithNoMessage$str() {
        return "WFLYSRV0008: Aufhebung von Deployment '%1$s' wurde ohne Fehlermeldung zurückgesetzt";
    }
    @Override
    protected String failedToParseCommandLineInteger$str() {
        return "WFLYSRV0023: Parsen von Eigenschaft (%1$s), Wert (%2$s) als Integer fehlgeschlagen";
    }
    @Override
    protected String cannotExplodeSubDeploymentOfUnexplodedDeployment$str() {
        return "WFLYSRV0258: Ein Unter-Deployment von einem nicht entpackten Deployment kann nicht entpackt werden";
    }
    @Override
    protected String couldNotCreateControllerTempDirectory$str() {
        return "WFLYSRV0132: Konnte kein Server-temp-Verzeichnis erstellen: %1$s";
    }
    @Override
    protected String argAdminOnly$str() {
        return "Legt den Ausführungstyp des Servers auf ADMIN_ONLY fest, sodass er administrative Interfaces öffnet und Verwaltungsanfragen akzeptiert, aber keine anderen Laufzeitdienste startet oder Endnutzer-Anfragen annimmt. Kann nicht in Verbindung mit \"--start-mode\" verwendet werden. Abgekündigt; \"--start-mode=admin-only\" stattdessen verwenden.";
    }
    @Override
    protected String unsuccessfulBoot$str() {
        return "WFLYSRV0056: Booten des Servers auf nicht wiederherstellbare Weise fehlgeschlagen; wird beendet. Details siehe vorherige Nachrichten. %1$s";
    }
    @Override
    protected String argSecurityProperty$str() {
        return "Setzen Sie eine Sicherheits-Property";
    }
    @Override
    protected String systemPropertyNotManageable$str() {
        return "WFLYSRV0115: Systemeigenschaft %1$s kann nicht über die XML-Konfigurationsdatei oder von einem Management-Client festgelegt werden; der Wert muss beim Anfangsprozess bekannt sein, weshalb er nur von der Befehlszeile aus festgelegt werden kann";
    }
    @Override
    protected String unexpectedEndOfDocument$str() {
        return "WFLYSRV0172: Unerwartetes Ende des Dokuments";
    }
    @Override
    protected String secureSocketBindingRequiresSSLContext$str() {
        return "WFLYSRV0259: Wenn das Attribut 'secure-socket-binding' definiert ist, muss auch 'ssl-context' definiert werden";
    }
    @Override
    protected String shuttingDownInResponseToProcessControllerSignal$str() {
        return "WFLYSRV0240: ProcessController sendete Signal zum Herunterfahren; es wird nun heruntergefahren";
    }
    @Override
    protected String argPublicBindAddress$str() {
        return "Setzen Sie eine System-Property jboss.bind.address auf den gegebenen Wert";
    }
    @Override
    protected String unableToInitialiseGitRepository$str() {
        return "WFLYSRV0280: Das Git Repository konnte nicht initialisiert werden.";
    }
    @Override
    protected String jbossDeploymentStructureNamespaceIgnored$str() {
        return "WFLYSRV0064: urn:jboss:deployment-structure-Namespace in jboss.xml für ein Unter-Deployment %1$s gefunden. Dies ist nur in einem Deployment der höchsten Ebene gültig.";
    }
    @Override
    protected String cannotExplodeEnabledDeployment$str() {
        return "WFLYSRV0245: Bereits bereitgestelltes Deployment kann nicht entpackt werden";
    }
    @Override
    protected String noSuchDeploymentContentAtBoot$str() {
        return "WFLYSRV0137: Kein Deployment-Inhalt mit Hash %1$s ist im Deployment-Inhalts-Repository für Deployment '%2$s' verfügbar. Dies ist ein schwerwiegender Boot-Fehler. Um dieses Problem zu beheben, starten Sie entweder mit dem --admin-only Switch-Satz und verwenden Sie das CLI zur Installation des fehlenden Inhalts oder entfernen Sie ihn aus der Konfiguration oder entfernen Sie das Deployment aus der XML-Konfigurationsdatei und starten Sie neu.";
    }
    @Override
    protected String caughtIOExceptionUploadingContent$str() {
        return "WFLYSRV0093: IOException beim Lesen des hochgeladenen Deployment-Content abgefangen";
    }
    @Override
    protected String serverDataDirectoryIsNotDirectory$str() {
        return "WFLYSRV0123: Server-Datenverzeichnis ist kein Verzeichnis: %1$s";
    }
    @Override
    protected String deploymentRolledBack$str() {
        return "WFLYSRV0021: Deployment von \"%1$s\" wurde mit folgender Fehlermeldung zurückgesetzt: %2$s";
    }
    @Override
    protected String noServerInstallationPrepared$str() {
        return "WFLYSRV0295: Es wurde keine %1$s-Installation vorbereitet.";
    }
    @Override
    protected String deploymentMountFailed$str() {
        return "WFLYSRV0160: Einhängen des Deployment-Contents fehlgeschlagen";
    }
    @Override
    protected String serverStopped$str() {
        return "WFLYSRV0050: %1$s in %2$d ms gestoppt";
    }
    @Override
    protected String deploymentRedeployed$str() {
        return "WFLYSRV0013: Erneutes Deployment von \"%1$s\" durchgeführt";
    }
    @Override
    protected String deploymentDependenciesAreATopLevelElement$str() {
        return "WFLYSRV0067: jboss-deployment-dependencies kann nicht in Unter-Deployment verwendet werden, es muss auf ear-Ebene festgelegt werden: %1$s";
    }
    @Override
    protected String cannotResolveInterface$str() {
        return "WFLYSRV0081: Eine IP-Adresse kann unter Verwendung der gegebenen Interface-Auswahlkriterien nicht aufgelöst werden. Fehler war – %1$s";
    }
    @Override
    protected String argVersion$str() {
        return "Version drucken und beenden";
    }
    @Override
    protected String couldNotCopyFiles$str() {
        return "WFLYSRV0249: Dateien konnten nicht vom verwalteten Inhalts-Repository auf das laufende Deployment für %1$s kopiert werden";
    }
    @Override
    protected String failedToPublishConfiguration$str() {
        return "WFLYSRV0270: Konfiguration konnte nicht in %1$s veröffentlicht werden";
    }
    @Override
    protected String vfsNotAvailable$str() {
        return "WFLYSRV0138: VFS ist vom konfigurierten Modullader nicht verfügbar";
    }
    @Override
    protected String argDebugPort$str() {
        return "Aktivierung des \"debug\"-Modus mit einem optionalen Argument zur Festlegung des Port. Funktioniert nur, wenn das Launch-Skript es unterstützt.";
    }
    @Override
    protected String cannotExplodeDeploymentOfSelfContainedServer$str() {
        return "WFLYSRV0242: Deployment kann nicht in einem eigenständigen Server entpackt werden";
    }
    @Override
    protected String jmxAttributeChange$str() {
        return "Der Status des Attributs '%1$s' hat sich von '%2$s' in %3$s geändert";
    }
    @Override
    protected String requiredServiceNotUp$str() {
        return "WFLYSRV0292: Der angeforderte Dienst '%1$s' ist nicht UP, er ist derzeit '%2$s'.";
    }
    @Override
    protected String cannotIndexClass$str() {
        return "WFLYSRV0003: Konnte Klasse %1$s in %2$s nicht indizieren";
    }
    @Override
    protected String bootComplete$str() {
        return "WFLYSRV0261: Boot abgeschlossen";
    }
    @Override
    protected String nullStreamAttachment$str() {
        return "WFLYSRV0094: Null-Stream an Index [%1$d]";
    }
    @Override
    protected String httpManagementInterfaceIsUnsecured$str() {
        return "WFLYSRV0035: Kein Sicherheitsbereich oder HTTP-Server-Authentifizierung definiert für den nativen Management-Dienst, der Zugriff ist nicht gesichert.";
    }
    @Override
    protected String failedToResolveMulticastAddressForRollback$str() {
        return "WFLYSRV0188: Abrufen der Multicast-Adresse für %1$s fehlgeschlagen";
    }
    @Override
    protected String unableToFindYaml$str() {
        return "WFLYSRV0290: Angegebene YAML-Datei %1$s nicht gefunden";
    }
    @Override
    protected String propertySpecifiedFileIsNotADirectory$str() {
        return "WFLYSRV0145: -D%1$s=%2$s ist kein Verzeichnis";
    }
    @Override
    protected String startedWitErrors$str() {
        return "WFLYSRV0026: %1$s";
    }
    @Override
    protected String gitRespositoryInitialized$str() {
        return "WFLYSRV0279: Git initialisiert in %1$s";
    }
    @Override
    protected String invalidStreamIndex$str() {
        return "WFLYSRV0149: Ungültiger '%1$s'-Wert: %2$d, der Maximum-Index ist %3$d";
    }
    @Override
    protected String undeploymentRolledBack$str() {
        return "WFLYSRV0007: Aufhebung von Deployment '%1$s' wurde mit folgender Fehlermeldung zurückgesetzt: %2$s";
    }
    @Override
    protected String unableToLoadProperties$str() {
        return "WFLYSRV0075: Kann Properties von URL '%1$s' nicht laden";
    }
    @Override
    protected String serverTempDirectoryIsNotADirectory$str() {
        return "WFLYSRV0129: Server-temp-Verzeichnis existiert nicht: %1$s";
    }
    @Override
    protected String redeployRolledBackWithNoMessage$str() {
        return "WFLYSRV0012: Erneutes Deployment von \"%1$s\" wurde ohne Fehlermeldung zurückgesetzt";
    }
    @Override
    protected String failedToRemoveDeploymentContent$str() {
        return "WFLYSRV0020: Bei der Entfernung von Deployment-Inhalt %1$s ist eine Ausnahme aufgetreten";
    }
    @Override
    protected String invalidDeploymentURL$str() {
        return "WFLYSRV0095: '%1$s' ist keine gültige URL";
    }
    @Override
    protected String reportAdminOnlyMissingDeploymentOverlayContent$str() {
        return "WFLYSRV0068: Kein Deployment-Overlay mit Hash %1$s ist im Deployment-Inhalts-Repository für Deployment '%2$s' am Speicherort %3$s verfügbar. Da dieser Host-Controller in ADMIN-ONLY Modus startet, wird das Fortsetzen des Startvorgangs erlaubt, um Administratoren die Gelegenheit zu geben, dieses Problem zu beheben. Wäre dieser Host Controller nicht im ADMIN-ONLY-Modus, so wäre dies ein schwerwiegender Startfehler.";
    }
    @Override
    protected String couldNotDeleteFile$str() {
        return "WFLYSRV0253: Datei %1$s konnte nicht aus dem laufenden Deployment %2$s gelöscht werden";
    }
    @Override
    protected String failedToInitRepository$str() {
        return "WFLYSRV0269: Repository %1$s konnte nicht initialisiert werden";
    }
    @Override
    protected String startedClean$str() {
        return "WFLYSRV0025: %1$s";
    }
    @Override
    protected String externalModuleServiceAlreadyStarted$str() {
        return "WFLYSRV0178: Externer Moduldienst bereits gestartet";
    }
    @Override
    protected String serverAlreadyPaused$str() {
        return "WFLYSRV0210: Server pausiert bereits";
    }
    @Override
    protected String serverContentDirectoryIsNotDirectory$str() {
        return "WFLYSRV0125: Server-Inhaltsverzeichnis ist kein Verzeichnis: %1$s";
    }
    @Override
    protected String cannotReadContentFromUnmanagedDeployment$str() {
        return "WFLYSRV0255: Inhalte können nicht von einem nicht verwalteten Deployment gelesen werden";
    }
    @Override
    protected String invalidPortOffset$str() {
        return "WFLYSRV0148: portOffset ist außerhalb des Bereichs";
    }
    @Override
    protected String archiveMountFailed$str() {
        return "WFLYSRV0267: Ressourcen-Root '%1$s' kann nicht eingebunden werden; ist es wirklich ein Archiv?";
    }
    @Override
    protected String usingGit$str() {
        return "WFLYSRV0278: Konfigurationsverlauf wird mittels Git verwaltet";
    }
    @Override
    protected String cannotAddContentToSelfContainedServer$str() {
        return "WFLYSRV0246: Inhalte können nicht zu einem Deployment in einem eigenständigen Server hinzugefügt werden";
    }
    @Override
    protected String logHttpAndHttpsConsole$str() {
        return "WFLYSRV0053: Admin-Konsole horcht an http://%1$s:%2$d und https://%3$s:%4$d";
    }
    @Override
    protected String failedToResolveInterface$str() {
        return "WFLYSRV0082: Auflösung von Interface %1$s fehlgeschlagen";
    }
    @Override
    protected String maximumNumberOfJarResources$str() {
        return "WFLYSRV0275: Maximale Anzahl der zulässigen JAR-Ressourcen, die für den Modulnamen des globalen Verzeichnisses '%1$s' erreicht werden. Maximal sind %2$d Dateien zulässig";
    }
    @Override
    protected String argGitBranch$str() {
        return "Git-Branch, der verwendet werden soll, um die Serverkonfiguration abzurufen. Standard ist 'master'";
    }
    @Override
    protected String propertySpecifiedFileDoesNotExist$str() {
        return "WFLYSRV0144: -D%1$s=%2$s existiert nicht";
    }
    @Override
    protected String securityManagerEnabled$str() {
        return "WFLYSRV0235: Sicherheitsmanager ist aktiviert";
    }
    @Override
    protected String excludedSubSystemsNotExist$str() {
        return "WFLYSRV0273: Ausgeschlossenes Subsystem %1$s über jboss-deployment-structure.xml nicht vorhanden.";
    }
    @Override
    protected String vmArgumentsLabel$str() {
        return "VM-Argumente: %1$s";
    }
    @Override
    protected String vaultNotInitializedException$str() {
        return "WFLYSRV0230: Vault ist nicht initialisert; Vault-Ausdrücke können nicht aufgelöst werden";
    }
    @Override
    protected String nativeManagementInterfaceIsUnsecured$str() {
        return "WFLYSRV0034: Kein Sicherheitsbereich oder SASL-Server-Authentifizierung definiert für den nativen Management-Dienst, der Zugriff ist nicht gesichert.";
    }
    @Override
    protected String failedToResume$str() {
        return "WFLYSRV0215: Fortsetzen der Aktivität %1$s fehlgeschlagen. Um den normalen Betrieb wieder aufzunehmen, wird empfohlen, den Server neu zu starten.";
    }
    @Override
    protected String suspendingServer0$str() {
        return "WFLYSRV0272: Server wird angehalten";
    }
    @Override
    protected String mechAuthorizationFailed$str() {
        return "WFLYSRV0301: Autorisierung des Authentifizierungsmechanismus fehlgeschlagen: \"%1$s\" ausgeführt als \"%2$s\"";
    }
    @Override
    protected String configDirectoryDoesNotExist$str() {
        return "WFLYSRV0121: Konfigurationsverzeichnis existiert nicht: %1$s";
    }
    @Override
    protected String cannotSetBothAdminOnlyAndStartMode$str() {
        return "WFLYSRV0262: \"--start-mode\" und \"--admin-only\" können nicht beide festgelegt werden";
    }
    @Override
    protected String aliasAddedAsDependency$str() {
        return "WFLYSRV0293: Der Modul-Alias '%1$s' wurde als Abhängigkeit zur Bereitstellung von '%2$s' über '%3$s' hinzugefügt. Dies ist zwar zulässig, es wird jedoch empfohlen, stattdessen das Zielmodul zu verwenden. Ziehen Sie in Erwägung, diesen Alias durch sein Zielmodul '%4$s' zu ersetzen.";
    }
    @Override
    protected String failedToCreateVFSResourceLoader$str() {
        return "WFLYSRV0104: Erstellung von VFSResourceLoader für root [%1$s] fehlgeschlagen";
    }
    @Override
    protected String systemPropertyCannotOverrideServerName$str() {
        return "WFLYSRV0116: Systemeigenschaft %1$s kann nicht festgelegt werden, nachdem der Servername über die XML-Konfigurationsdatei oder von einem Management-Client festgelegt wurde";
    }
    @Override
    protected String failedToPullRepository$str() {
        return "WFLYSRV0268: Repository %1$s konnte nicht gepullt werden";
    }
    @Override
    protected String missingModulePrefix$str() {
        return "WFLYSRV0099: '%1$s' kann nicht von einem ServiceModuleLoader geladen werden, da der Name nicht mit '%2$s' beginnt";
    }
    @Override
    protected String missingHomeDirConfiguration$str() {
        return "WFLYSRV0088: Fehlender Konfigurationswert für: %1$s";
    }
    @Override
    protected String resourceTooLarge$str() {
        return "WFLYSRV0165: Ressource ist zu groß, um eine gültige Klassendatei zu sein";
    }
    @Override
    protected String hostControllerNameNonNullInStandalone$str() {
        return "WFLYSRV0079: hostControllerName muss Null sein, wenn der Server nicht in einer gemanagten Domain ist";
    }
    @Override
    protected String repositoryInitialized$str() {
        return "Repository initialisiert";
    }
    @Override
    protected String mechNoSecurityLayer$str() {
        return "WFLYSRV0302: Authentifizierungsmechanismus unterstützt keine Sicherheitsebene (Umbruch/Umbruchaufhebung)";
    }
    @Override
    protected String cannotRemoveContentFromSelfContainedServer$str() {
        return "WFLYSRV0250: Inhalte können nicht von einem Deployment in einem eigenständigen Server entfernt werden";
    }
    @Override
    protected String argSecMgr$str() {
        return "Betreibt den Server mit einem installierten Security-Manager.";
    }
    @Override
    protected String deploymentPhaseFailed$str() {
        return "WFLYSRV0153: Verarbeitung von Phase %1$s von %2$s fehlgeschlagen";
    }
    @Override
    protected String cannotStartServer$str() {
        return "WFLYSRV0141: Kann Server nicht starten";
    }
    @Override
    protected String cannotAddContentToUnexplodedDeployment$str() {
        return "WFLYSRV0248: Inhalte können nicht zu einem nicht entpackten Deployment hinzugefügt werden";
    }
    @Override
    protected String problemOpeningStreamFromDeploymentURL$str() {
        return "WFLYSRV0096: Fehler beim Erhalt des Eingabe-Streams von URL '%1$s'";
    }
    @Override
    protected String failedToReadVirtualFile$str() {
        return "WFLYSRV0100: Lesen von '%1$s' fehlgeschlagen";
    }
    @Override
    protected String duplicateServerNameConfiguration$str() {
        return "WFLYSRV0048: Eine Konfiguration für Servernamen wurde sowohl als Systemeigenschaft %1$s ('%2$s') als auch als XML-Konfiguration ('%3$s') angegeben. Der Wert der XML-Konfiguration wird verwendet.";
    }
    @Override
    protected String cannotAddURLStreamHandlerFactory$str() {
        return "WFLYSRV0024: Kann Modul '%1$s' nicht als URLStreamHandlerFactory-Provider hinzufügen";
    }
    @Override
    protected String noModuleIdentifier$str() {
        return "WFLYSRV0103: Kein Modulbezeichner an Deployment '%1$s' angehängt";
    }
    @Override
    protected String mechAuthenticationNotComplete$str() {
        return "WFLYSRV0296: Authentifizierung des Authentifizierungsmechanismus ist noch nicht abgeschlossen";
    }
    @Override
    protected String mechMalformedFields$str() {
        return "WFLYSRV0305: Authentifizierung des Authentifizierungsmechanismus aufgrund eines oder mehrerer fehlerhafter Felder fehlgeschlagen";
    }
    @Override
    protected String serviceModuleLoaderAlreadyStarted$str() {
        return "WFLYSRV0097: ServiceModuleLoader ist bereits gestartet";
    }
    @Override
    protected String mechServerSideAuthenticationFailed$str() {
        return "WFLYSRV0299: Serverseitige Authentifizierung des Authentifizierungsmechanismus fehlgeschlagen";
    }
    @Override
    protected String cannotReplaceDeployment$str() {
        return "WFLYSRV0086: Kann %1$s nicht mit dem gleichen Wert für Parameter %2$s und %3$s verwenden. Verwenden Sie %4$s zum erneuten Deployment des gleichen Inhalts oder %5$s, um den Inhalt durch eine neue Version mit dem gleichen Namen zu ersetzen.";
    }
    @Override
    protected String vaultModuleWithNoCode$str() {
        return "WFLYSRV0209: Bei Festlegung eines Moduls 'module' müssen Sie auch den Code 'code' festlegen";
    }
    @Override
    protected String replaceRolledBack$str() {
        return "WFLYSRV0014: Ersetzen von Deployment \"%1$s\" durch Deployment \"%2$s\" wurde mit folgender Fehlermeldung zurückgesetzt: %3$s";
    }
    @Override
    protected String controllerTempDirectoryIsNotADirectory$str() {
        return "WFLYSRV0131: Controller-temp-Verzeichnis existiert nicht: %1$s";
    }
    @Override
    protected String mechInvalidMessageReceived$str() {
        return "WFLYSRV0303: Ungültige Verhandlungsnachricht des Authentifizierungsmechanismus empfangen";
    }
    @Override
    protected String mechMessageAfterComplete$str() {
        return "WFLYSRV0297: Austausch des Authentifizierungsmechanismus hat eine Nachricht erhalten, nachdem die Authentifizierung bereits abgeschlossen war";
    }
    @Override
    protected String startedCleanMessage$str() {
        return "%1$s wurde in %2$d ms gestartet - %3$d von %4$d Diensten gestartet (%5$d Dienste sind verzögert, passiv oder werden bei Bedarf geladen) %6$s";
    }
}
