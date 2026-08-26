package org.wildfly.extension.undertow.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:54+0200")
public class UndertowLogger_$logger_de extends UndertowLogger_$logger implements UndertowLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public UndertowLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToCreatePersistentSessionDir$str() {
        return "WFLYUT0061: Verzeichnis für persistente Sessions %1$s konnte nicht erstellt werden";
    }
    @Override
    protected String creatingFileHandler$str() {
        return "WFLYUT0014: Datei-Handler für Pfad '%1$s' mit Optionen [directory-listing: '%2$s', follow-symlink: '%3$s', case-sensitive: '%4$s', safe-symlink-paths: '%5$s'] wird erstellt";
    }
    @Override
    protected String invalidWebInitParamAnnotation$str() {
        return "WFLYUT0030: @WebInitParam erfordert Name und Wert an %1$s";
    }
    @Override
    protected String invalidRedirectURI$str() {
        return "WFLYUT0013: Konnte Umleitungs-URI nicht erstellen";
    }
    @Override
    protected String couldNotFindExternalPath$str() {
        return "WFLYUT0072: Konfigurierter externer Pfad %1$s konnte nicht gefunden werden";
    }
    @Override
    protected String invalidPersistentSessionDir$str() {
        return "WFLYUT0060: Ungültiges Verzeichnis für persistente Sessions %1$s";
    }
    @Override
    protected String invalidWebFilterAnnotation$str() {
        return "WFLYUT0031: @WebFilter ist nur auf Klassenebene %1$s gestattet";
    }
    @Override
    protected String skippedSCI$str() {
        return "WFLYUT0023: Überspringen von SCI für jar: %1$s.";
    }
    @Override
    protected String unableAddHandlerForPath$str() {
        return "WFLYUT0095: Der Pfad ['%1$s'] ist nicht im Dateisystem vorhanden";
    }
    @Override
    protected String couldNotInitJsp$str() {
        return "WFLYUT0001: Jakarta Server Pages konnte nicht initialisiert werden";
    }
    @Override
    protected String invalidRelativeOrderingBeforeAndAfter$str() {
        return "WFLYUT0044: Die Reihenfolgen beinhaltet sowohl vor als auch nach anderen in JAR: %1$s";
    }
    @Override
    protected String keyStoreEntryNotPrivate$str() {
        return "WFLYUT0091: Schlüsselspeichereintrag %1$s ist kein privater Schlüsseleintrag";
    }
    @Override
    protected String workerValueInHTTPListenerMustMatchRemoting$str() {
        return "WFLYUT0097: If http-upgrade is enabled, remoting worker and http(s) worker must be the same. Please adjust values if need be.";
    }
    @Override
    protected String invalidRelativeOrderingUnknownName$str() {
        return "WFLYUT0046: Unbekannter Web-Fragmentname deklariert in JAR: %1$s";
    }
    @Override
    protected String serverStopping$str() {
        return "WFLYUT0004: Undertow %1$s wird gestoppt";
    }
    @Override
    protected String invalidDeclareRolesAnnotation$str() {
        return "WFLYUT0034: @DeclareRoles muss Rollennamen auf %1$s spezifizieren";
    }
    @Override
    protected String invalidRelativeOrderingDuplicateName$str() {
        return "WFLYUT0045: Doppelter Name in JAR deklariert: %1$s";
    }
    @Override
    protected String failedToConfigureHandler$str() {
        return "WFLYUT0064: Konfiguration von Handler %1$s fehlgeschlagen";
    }
    @Override
    protected String handlerWasNotAHandlerOrWrapper$str() {
        return "WFLYUT0065: Handler-Klasse %1$s war kein Handler oder ein Wrapper";
    }
    @Override
    protected String failToProcessWebInfLib$str() {
        return "WFLYUT0048: Bearbeitung von WEB-INF/lib fehlgeschlagen: %1$s";
    }
    @Override
    protected String unsupportedValveFeature$str() {
        return "WFLYUT0080: Valves werden nicht mehr unterstützt, %1$s wird nicht aktiviert.";
    }
    @Override
    protected String nullDefaultHost$str() {
        return "WFLYUT0055: Null Standard Host";
    }
    @Override
    protected String duplicateServletMapping$str() {
        return "WFLYUT0101: Doppeltes Servlet Mapping %1$s gefunden";
    }
    @Override
    protected String missingKeyStoreEntry$str() {
        return "WFLYUT0090: Schlüsselalias %1$s ist im konfigurierten Schlüsselspeicher nicht vorhanden";
    }
    @Override
    protected String invalidAbsoluteOrdering$str() {
        return "WFLYUT0016: Name konnte nicht aufgelöst werden in absoluter Reihenfolge: %1$s";
    }
    @Override
    protected String couldNotStartListener$str() {
        return "WFLYUT0082: '%1$s'-Listener konnte nicht gestartet werden.";
    }
    @Override
    protected String invalidWebServletAnnotation$str() {
        return "WFLYUT0029: @WebServlet ist nur auf Klassenebene %1$s gestattet";
    }
    @Override
    protected String listenerStarted$str() {
        return "WFLYUT0006: Undertow %1$s Listener %2$s horcht an %3$s:%4$d";
    }
    @Override
    protected String startedServer$str() {
        return "WFLYUT0012: Server %1$s gestartet.";
    }
    @Override
    protected String credentialNotClearPassword$str() {
        return "WFLYUT0093: Anmeldedaten %1$s stellen kein Klartextpasswort dar";
    }
    @Override
    protected String tldNotFound$str() {
        return "WFLYUT0074: TLD %1$s konnte nicht gefunden werden";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYUT0109: Die Bereitstellung ist so konfiguriert, dass Legacy-Sicherheit verwendet wird, die nicht mehr unterstützt wird.";
    }
    @Override
    protected String secureListenerNotAvailableForPort$str() {
        return "WFLYUT0005: Sicherer Listener für Protokoll: '%1$s' nicht gefunden! Unsicherer Port verwendet!";
    }
    @Override
    protected String obfuscatedSessionRoute$str() {
        return "WFLYUT0107: Erstellte verschleierte Sitzungsroute '%1$s' aus '%2$s'";
    }
    @Override
    protected String failedToResolveModule$str() {
        return "WFLYUT0039: Auflösung von Modul für Deployment %1$s fehlgeschlagen";
    }
    @Override
    protected String failToParseXMLDescriptor1$str() {
        return "WFLYUT0028: Parsen von XML-Deskriptor %1$s fehlgeschlagen";
    }
    @Override
    protected String invalidRelativeOrdering0$str() {
        return "WFLYUT0041: Ungültige relative Reihenfolge";
    }
    @Override
    protected String invalidMultipleOthers$str() {
        return "WFLYUT0040: Andere duplizieren in absoluter Reihenfolge";
    }
    @Override
    protected String tldFileNotContainedInRoot$str() {
        return "WFLYUT0038: TLD-Datei %1$s nicht in root %2$s enthalten";
    }
    @Override
    protected String advertiseSocketBindingRequiresMulticastAddress$str() {
        return "WFLYUT0073: mod_cluster Advertise-Socket-Binding erfordert die Einstellung der Multicast-Adresse";
    }
    @Override
    protected String unableToResolveAnnotationIndex$str() {
        return "WFLYUT0050: Kann Annotationsindex für Deployment-Einheit: %1$s nicht auflösen";
    }
    @Override
    protected String duplicateHostContextDeployments$str() {
        return "WFLYUT0105: Host und Kontextpfad sind belegt, %1$s kann nicht registriert werden. Meldung war: %2$s";
    }
    @Override
    protected String couldNotLoadHandlerFromModule$str() {
        return "WFLYUT0070: Handler %1$s von Modul %2$s konnte nicht geladen werden";
    }
    @Override
    protected String nullNotAllowed$str() {
        return "WFLYUT0083: %1$s darf nicht Null sein";
    }
    @Override
    protected String cannotLoadDesignatedHandleTypes$str() {
        return "WFLYUT0009: Konnte von HandlesTypes [%1$s] designierte Klasse nicht laden.";
    }
    @Override
    protected String wrongComponentType$str() {
        return "WFLYUT0037: %1$s besitzt den falschen Komponententyp, es kann nicht als Web-Komponente verwendet werden";
    }
    @Override
    protected String invalidWebListenerAnnotation$str() {
        return "WFLYUT0032: @WebListener ist nur auf Klassenebene %1$s gestattet";
    }
    @Override
    protected String configurationOptionIgnoredWhenUsingElytron$str() {
        return "WFLYUT0094: Konfigurationsoption [%1$s] wurde bei Verwendung des Elytron-Untersystems ignoriert";
    }
    @Override
    protected String deploymentConfiguredForLegacySecurity$str() {
        return "WFLYUT0108: Die Bereitstellung ist so konfiguriert, dass Legacy-Sicherheit verwendet wird, die nicht mehr verfügbar ist.";
    }
    @Override
    protected String clusteringNotSupported$str() {
        return "WFLYUT0020: Clustering wird nicht unterstützt, wobei auf einen nicht-geclusterten Session-Manager zurückgegriffen wird";
    }
    @Override
    protected String sharedSessionConfigNotInRootDeployment$str() {
        return "WFLYUT0069: shared-session-config in jboss-all.xml in Deployment %1$s wird ignoriert. Dieser Eintrag ist nur gültig in Deployments oberster Ebene.";
    }
    @Override
    protected String listenerStopped$str() {
        return "WFLYUT0007: Undertow %1$s Listener %2$s gestoppt, war gebunden an %3$s:%4$d";
    }
    @Override
    protected String sessionNotFound$str() {
        return "WFLYUT0100: Sitzung %1$s nicht gefunden";
    }
    @Override
    protected String badAnnotationOnServlet$str() {
        return "WFLYUT0111: Die Anmerkung '%1$s' hat keine Auswirkungen auf das Servlet '%2$s'.";
    }
    @Override
    protected String missingCredential$str() {
        return "WFLYUT0092: Anmeldedatenalias %1$s ist im konfigurierten Anmeldedatenspeicher nicht vorhanden";
    }
    @Override
    protected String servletClassNotDefined$str() {
        return "WFLYUT0067: Servlet-Klasse nicht definiert für Servlet %1$s";
    }
    @Override
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYUT0110: Die Verwendung von Sicherheitsbereichen zur Laufzeit wird nicht unterstützt.";
    }
    @Override
    protected String invalidDateTimeFormatterPattern$str() {
        return "WFLYUT0102: Das Muster %1$s ist kein gültiges Datumsmuster.";
    }
    @Override
    protected String failedToConfigureHandlerClass$str() {
        return "WFLYUT0066: Konfiguration von Handler %1$s fehlgeschlagen";
    }
    @Override
    protected String failToParseXMLDescriptor3$str() {
        return "WFLYUT0027: Parsen von XML-Deskriptor %1$s an [%2$s,%3$s] fehlgeschlagen";
    }
    @Override
    protected String nullHostName$str() {
        return "WFLYUT0056: Null Host-Name";
    }
    @Override
    protected String unknownMetric$str() {
        return "WFLYUT0054: Unbekannte Metrik %1$s";
    }
    @Override
    protected String couldNotLoadWebSocketEndpoint$str() {
        return "WFLYUT0010: Web-Socket-Endpunkt %1$s konnte nicht geladen werden.";
    }
    @Override
    protected String serverStarting$str() {
        return "WFLYUT0003: Undertow %1$s wird gestartet";
    }
    @Override
    protected String failedToPersistSessionAttribute$str() {
        return "WFLYUT0024: Persistieren von Session-Attribut %1$s mit Wert %2$s für Session %3$s fehlgeschlagen";
    }
    @Override
    protected String invalidRelativeOrderingConflict$str() {
        return "WFLYUT0047: Konflikt bei relativer Reihenfolge mit JAR: %1$s";
    }
    @Override
    protected String invalidTimeZoneId$str() {
        return "WFLYUT0103: Die Zeitzonen-ID %1$s ist ungültig.";
    }
    @Override
    protected String duplicateDefaultWebModuleMapping$str() {
        return "WFLYUT0087: Standardmäßiges Webmodul '%1$s' doppelt konfiguriert auf Server '%2$s', Host '%3$s'";
    }
    @Override
    protected String distributableDisabledInFragmentXml$str() {
        return "WFLYUT0081: Das Deployment %1$s wird nicht verteilbar sein, da dieses Feature in der web-fragment.xml des Moduls %2$s deaktiviert ist.";
    }
    @Override
    protected String registerWebapp$str() {
        return "WFLYUT0021: Web-Kontext registriert: '%1$s' für Server '%2$s'";
    }
    @Override
    protected String hostStarting$str() {
        return "WFLYUT0018: Host %1$s wird gestartet";
    }
    @Override
    protected String errorProcessingSCI$str() {
        return "WFLYUT0051: Deployment-Fehler bei Verarbeitung von SCI für jar: %1$s";
    }
    @Override
    protected String invalidRelativeOrdering1$str() {
        return "WFLYUT0043: Fehler bei der Bearbeitung der relativen Reihenfolge mit JAR: %1$s";
    }
    @Override
    protected String missingClassInAnnotation$str() {
        return "WFLYUT0104: Einige Klassen, die durch die Annotation %1$s in Klasse %2$s referenziert werden, fehlen.";
    }
    @Override
    protected String predicateNotValid$str() {
        return "WFLYUT0089: Prädikat %1$s war nicht gültig, Nachricht lautete: %2$s";
    }
    @Override
    protected String invalidMultipartConfigAnnotation$str() {
        return "WFLYUT0035: @MultipartConfig ist nur auf Klassenebene %1$s gestattet";
    }
    @Override
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYUT0062: Konnte kein Protokollverzeichnis erstellen: %1$s";
    }
    @Override
    protected String unableToObfuscateSessionRoute$str() {
        return "WFLYUT0106: Kann keine verschleierte Sitzungsroute aus '%1$s' erzeugen";
    }
    @Override
    protected String couldNotLoadWebSocketConfig$str() {
        return "WFLYUT0011: Web-Socket-Applikationskonfiguration %1$s konnte nicht geladen werden.";
    }
    @Override
    protected String invalidWebFragment$str() {
        return "WFLYUT0042: Konflikt bei der Bearbeitung des Web-Fragments in JAR: %1$s";
    }
    @Override
    protected String errorLoadingSCIFromModule$str() {
        return "WFLYUT0049: Fehler beim Laden von SCI vom Modul: %1$s";
    }
    @Override
    protected String alpnNotFound$str() {
        return "WFLYUT0071: Kein ALPN-Provider gefunden, HTTP/2 wird nicht aktiviert. Um diese Nachricht zu entfernen, setzen Sie enable-http2 auf 'false' auf dem Listener %1$s im Undertow-Subsystem.";
    }
    @Override
    protected String invalidRunAsAnnotation$str() {
        return "WFLYUT0033: @RunAs muss einen Rollennamen auf %1$s spezifizieren";
    }
    @Override
    protected String hostStopping$str() {
        return "WFLYUT0019: Host %1$s wird gestoppt";
    }
    @Override
    protected String noPortListeningForProtocol$str() {
        return "WFLYUT0063: Portnummer zum Horchen auf Protokoll %1$s konnte nicht gefunden werden";
    }
    @Override
    protected String failedToRegisterWebsocket$str() {
        return "WFLYUT0078: Fehler beim Registrieren der Managementansicht für Websocket %1$s unter %2$s";
    }
    @Override
    protected String listenerSuspend$str() {
        return "WFLYUT0008: Undertow %1$s Listener %2$s wird angehalten";
    }
    @Override
    protected String unregisterWebapp$str() {
        return "WFLYUT0022: Web-Kontext deregistriert: '%1$s' von Server '%2$s'";
    }
    @Override
    protected String sessionManagerNotAvailable$str() {
        return "WFLYUT0099: Sitzungs-Manager nicht verfügbar";
    }
    @Override
    protected String couldNotDeleteTempFile$str() {
        return "WFLYUT0017: Temporäre Servlet-Datei %1$s konnte nicht gelöscht werden";
    }
    @Override
    protected String invalidServletSecurityAnnotation$str() {
        return "WFLYUT0036: @ServletSecurity ist nur auf Klassenebene %1$s gestattet";
    }
}
