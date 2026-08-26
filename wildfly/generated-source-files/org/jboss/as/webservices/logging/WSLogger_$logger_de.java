package org.jboss.as.webservices.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:54+0200")
public class WSLogger_$logger_de extends WSLogger_$logger implements WSLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public WSLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String sameUrlPatternRequested$str() {
        return "WFLYWS0047: Webdienst-Endpunkt %1$s mit URL-Muster %2$s ist bereits registriert. Webdienst-Endpunkt %3$s fragt mit demselben URL-Muster an.";
    }
    @Override
    protected String missingDeploymentAspectClassAttribute$str() {
        return "WFLYWS0030: Konnte Klassenattribut für Deployment-Aspekt nicht finden";
    }
    @Override
    protected String missingHandlerChain$str() {
        return "WFLYWS0054: Konfiguration %1$s: Handler-Kette %2$s mit ID %3$s existiert nicht";
    }
    @Override
    protected String checkModuleDependency$str() {
        return "WFLYWS0076: Anmerkung '@%1$s' found on class '%2$s'. Stellen Sie sicher, dass die Modulabhängigkeit '%3$s' zu Ihrem Deployment hinzugefügt wird.";
    }
    @Override
    protected String mutuallyExclusiveAnnotations$str() {
        return "WFLYWS0008: [JAXWS 2.2 Spezifikation, Abschnitt 7.7] Die @WebService und @WebServiceProvider-Annotationen schließen sich gegenseitig aus - %1$s wird nicht als Webdienst-Endpunkt anerkannt, da diese Voraussetzung nicht erfüllt ist";
    }
    @Override
    protected String invalidWSServlet$str() {
        return "WFLYWS0066: Servlet-Klasse %1$s in web.xml deklariert; stellen Sie entweder ein ordnungsgemäßes Deployment bereit, das von JBossWS abhängt, oder deaktivieren Sie das Webservices-Subsystem für das aktuelle Deployment, indem Sie ihm einen ordnungsgemäßen jboss-deployment-structure.xml-Deskriptor hinzufügen. Die erste Vorgehensweise wird empfohlen, da die letztere dazu führt, dass die meisten der Jakarta EE- und JBossWS-spezifischen Funktionalitäten für Webservices deaktiviert werden.";
    }
    @Override
    protected String ignoringPortComponentRef$str() {
        return "WFLYWS0010: Ignoriere <port-component-ref> ohne <service-endpoint-interface> und <port-qname>: %1$s";
    }
    @Override
    protected String accessibleWebServiceMethodNotFound$str() {
        return "WFLYWS0021: Webservice-Implementierungsklasse %1$s enthält keine zugängliche Methode %2$s";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYWS0074: Die Bereitstellung ist so konfiguriert, dass Legacy-Sicherheit verwendet wird, die nicht mehr unterstützt wird.";
    }
    @Override
    protected String classLoaderResolutionFailed$str() {
        return "WFLYWS0025: Kann Modul oder Klassenlader für Deployment %1$s nicht auflösen";
    }
    @Override
    protected String requiredServiceRefType$str() {
        return "WFLYWS0050: @WebServiceRef-Attribut 'type' wird für Annotationen auf Klassenebene benötigt.";
    }
    @Override
    protected String stopping$str() {
        return "WFLYWS0004: %1$s wird gestoppt";
    }
    @Override
    protected String unsupportedPropertyClass$str() {
        return "WFLYWS0034: Nicht unterstützte Eigenschaftsklasse: %1$s";
    }
    @Override
    protected String cannotInstantiateServletDelegate$str() {
        return "WFLYWS0044: Erstellen von Servlet-Delegate nicht möglich: %1$s";
    }
    @Override
    protected String failedAuthenticationWithException$str() {
        return "WFLYWS0072: Beim Authentifizieren des Benutzernamens %1$s ist ein Fehler aufgetreten. Ausnahmemeldung: %2$s";
    }
    @Override
    protected String failedAuthentication$str() {
        return "WFLYWS0071: Benutzername %1$s konnte nicht authentifiziert werden: Benutzername/Passwort falsch";
    }
    @Override
    protected String starting$str() {
        return "WFLYWS0003: %1$s wird gestartet";
    }
    @Override
    protected String invalidLibraryInDeployment$str() {
        return "WFLYWS0059: %1$s-Bibliothek (%2$s) im WS-Endpunkt-Deployment gefunden; stellen Sie entweder ein ordnungsgemäßes Deployment bereit, das eingebettete Bibliotheken mit Container-Modul-Abhängigkeiten ersetzt, oder deaktivieren Sie das Webservices-Subsystem für das aktuelle Deployment, indem Sie ihm einen ordnungsgemäßen jboss-deployment-structure.xml-Deskriptor hinzufügen. Die erste Vorgehensweise wird empfohlen, da die letztere dazu führt, dass die meisten der Jakarta EE- und JBossWS-spezifischen Funktionalitäten für Webservices deaktiviert werden.";
    }
    @Override
    protected String unexpectedElement$str() {
        return "WFLYWS0027: Unerwartetes Element: %1$s";
    }
    @Override
    protected String missingPropertyClassAttribute$str() {
        return "WFLYWS0033: Konnte Eigenschaftsklassen-Attribut für Deployment-Aspekt %1$s nicht finden";
    }
    @Override
    protected String endpointAlreadyStopped$str() {
        return "WFLYWS0073: Der Zielendpunkt %1$s wurde gestoppt oder nicht bereitgestellt";
    }
    @Override
    protected String webMethodMustNotBeStaticOrFinal$str() {
        return "WFLYWS0018: Webservice-Methode %1$s darf nicht \"static\" oder \"final\" sein. Siehe Abschnitt 5.3.2.4.2 in \"Jakarta Enterprise Web Services 2.0\".";
    }
    @Override
    protected String stopContextPhaseFailed$str() {
        return "WFLYWS0042: Stoppen von Kontext fehlgeschlagen";
    }
    @Override
    protected String configServiceCreationFailed$str() {
        return "WFLYWS0005: Fehler bei Erstellung des Konfigurationsdiensts";
    }
    @Override
    protected String missingHandlerChainConfigFile$str() {
        return "WFLYWS0026: Config-Datei der Handler-Kette %1$s nicht in %2$s gefunden";
    }
    @Override
    protected String cannotFindComponentView$str() {
        return "WFLYWS0038: Kann Komponenten-Ansicht nicht finden: %1$s";
    }
    @Override
    protected String cannotLoadDeploymentAspectsDefinitionFile$str() {
        return "WFLYWS0001: WS-Deployment-Aspekte können nicht von %1$s geladen werden";
    }
    @Override
    protected String mBeanServerNotAvailable$str() {
        return "WFLYWS0013: MBeanServer nicht verfügbar, überspringe Registrierung/Deregistrierung von %1$s";
    }
    @Override
    protected String startContextPhaseFailed$str() {
        return "WFLYWS0041: Starten von Kontext fehlgeschlagen";
    }
    @Override
    protected String nullEndpointName$str() {
        return "WFLYWS0023: Null Endpunkt-Name";
    }
    @Override
    protected String createContextPhaseFailed$str() {
        return "WFLYWS0040: Erstellen von Kontext fehlgeschlagen";
    }
    @Override
    protected String endpointClassNotFound$str() {
        return "WFLYWS0060: Webservice-Endpunktklasse %1$s nicht gefunden";
    }
    @Override
    protected String cannotUnregisterRecordProcessor$str() {
        return "WFLYWS0012: Kann Eintragsprozessor nicht beim JMX-Server deregistrieren";
    }
    @Override
    protected String missingPropertyNameAttribute$str() {
        return "WFLYWS0032: Konnte kein Eigenschaftsnamen-Attribut für Deployment-Aspekt %1$s finden";
    }
    @Override
    protected String jaxRpcNotSupported$str() {
        return "WFLYWS0058: Jakarta-XML-RPC nicht unterstützt";
    }
    @Override
    protected String cannotInstantiateList$str() {
        return "WFLYWS0035: Liste vom Typ %1$s konnte nicht erstellt werden";
    }
    @Override
    protected String warningLibraryInDeployment$str() {
        return "WFLYWS0068: Eine potenziell problematische %1$s-Bibliothek (%2$s) in der ws-Endpunktbereitstellung entdeckt. Prüfen Sie, ob diese Bibliothek durch ein Containermodul ersetzt werden kann";
    }
    @Override
    protected String multipleEndpointsWithDifferentDeclaredSecurityRoles$str() {
        return "WFLYWS0014: Mehrere Enterprise Beans 3 Endpunkte in demselben Deployment mit unterschiedlich deklarierten Sicherheitsrollen; seien Sie sich dessen bewusst, dass dies ein Sicherheitsrisiko darstellt, wenn Sie erlaubte Rollen (@RolesAllowed) nicht an jeder ws Endpunkt-Methode kontrollieren.";
    }
    @Override
    protected String unexpectedEndOfDocument$str() {
        return "WFLYWS0029: Unerwartet das Ende des xml-Dokuments erreicht";
    }
    @Override
    protected String cannotGetURLForDescriptor$str() {
        return "WFLYWS0057: Abruf nicht möglich von URL für: %1$s";
    }
    @Override
    protected String wrongHandlerChainType$str() {
        return "WFLYWS0052: Nicht unterstützter Handler-Kettentyp: %1$s. Unterstützte Typen sind %2$s und %3$s";
    }
    @Override
    protected String cannotInstantiateMap$str() {
        return "WFLYWS0036: Map vom Typ %1$s konnte nicht erstellt werden";
    }
    @Override
    protected String missingChild$str() {
        return "WFLYWS0039: Untergeordnetes Element '%1$s' für VirtualFile %2$s nicht gefunden";
    }
    @Override
    protected String cannotUnregisterEndpoint$str() {
        return "WFLYWS0016: Kann Endpunkt nicht deregistrieren: %1$s vom JMX-Server";
    }
    @Override
    protected String nullEndpointClass$str() {
        return "WFLYWS0024: Null Endpunkt-Klasse";
    }
    @Override
    protected String multipleSecurityDomainsDetected$str() {
        return "WFLYWS0046: Mehrere Sicherheits-Domains nicht unterstützt. Erste Domain: '%1$s' Zweite Domain: '%2$s'";
    }
    @Override
    protected String missingConfig$str() {
        return "WFLYWS0051: Config %1$s existiert nicht";
    }
    @Override
    protected String couldNotUpdateServerConfigBecauseOfExistingWSDeployment$str() {
        return "WFLYWS0064: Konnte WS-Serverkonfiguration wegen bestehendem WS-Deployment auf dem Server nicht aktualisieren.";
    }
    @Override
    protected String finalizeMethodNotAllowed$str() {
        return "WFLYWS0022: Webservice-Implementierungsklasse %1$s darf keine finalize() Methode deklarieren. Siehe Abschnitt 5.3.2.4.2 in \"Jakarta Enterprise Web Services 2.0\".";
    }
    @Override
    protected String requiredServiceRefName$str() {
        return "WFLYWS0049: @WebServiceRef-Attribut 'name' wird für Annotationen auf Klassenebene benötigt.";
    }
    @Override
    protected String webServiceMethodNotFound$str() {
        return "WFLYWS0020: Webservice-Implementierungsklasse %1$s enthält nicht die Methode %2$s";
    }
    @Override
    protected String jwsWebServiceClassVerificationFailed$str() {
        return "WFLYWS0062: Klassenverifikation der Java Web Service-Implementierungsklasse %1$s ist fehlgeschlagen.";
    }
    @Override
    protected String cannotInstantiateDeploymentAspect$str() {
        return "WFLYWS0031: Konnte keinen Deployment-Aspekt von Klasse: %1$s finden";
    }
    @Override
    protected String failedAuthorization$str() {
        return "WFLYWS0070: Autorisierung fehlgeschlagen für Benutzer: %1$s";
    }
    @Override
    protected String webMethodMustBePublic$str() {
        return "WFLYWS0019: Webservice-Methode %1$s muss \"public\" sein. Siehe Abschnitt 5.3.2.4.2 in \"Jakarta Enterprise Web Services 2.0\".";
    }
    @Override
    protected String invalidServiceRefSetterMethodName$str() {
        return "WFLYWS0048: @WebServiceRef-Einspeisungsziel ist ungültig. Nur Setter-Methoden sind gestattet: %1$s";
    }
    @Override
    protected String unexpectedEndTag$str() {
        return "WFLYWS0028: Unerwartetes End-Tag: %1$s";
    }
    @Override
    protected String missingDeploymentProperty$str() {
        return "WFLYWS0045: Abruf von Deployment-Eigenschaft nicht möglich: %1$s";
    }
    @Override
    protected String noMetricsAvailable$str() {
        return "WFLYWS0037: Keine Metrik verfügbar";
    }
    @Override
    protected String finalEndpointClassDetected$str() {
        return "WFLYWS0009: Webdienst-Endpunkt-Klasse kann nicht final sein - %1$s wird nicht als Webdienst-Endpunkt anerkannt";
    }
    @Override
    protected String cannotReadWsdl$str() {
        return "WFLYWS0007: Konnte WSDL nicht lesen von: %1$s";
    }
    @Override
    protected String cannotRegisterRecordProcessor$str() {
        return "WFLYWS0011: Kann Eintragsprozessor nicht beim JMX-Server registrieren";
    }
    @Override
    protected String invalidHandlerChainFile$str() {
        return "WFLYWS0017: Ungültige Handler-Ketten-Datei: %1$s";
    }
    @Override
    protected String declaredEndpointInterfaceClassNotFound$str() {
        return "WFLYWS0061: Das in der @WebService-Annotation auf der Webservice-Implementierungs-Bean %2$s deklarierte endpointInterface %1$s wurde nicht gefunden.";
    }
    @Override
    protected String couldNotUpdateServerConfigBecauseOfReloadRequired$str() {
        return "WFLYWS0063: Konnte WS-Serverkonfiguration wegen ausstehender früherer Modellaktualisierung(en), die ein erneutes Laden erfordern, nicht aktualisieren.";
    }
    @Override
    protected String cannotRegisterEndpoint$str() {
        return "WFLYWS0015: Kann Endpunkt nicht registrieren: %1$s in JMX-Server";
    }
    @Override
    protected String couldNotActivateSubsystem$str() {
        return "WFLYWS0067: Webservices-Subsystem konnte nicht aktiviert werden.";
    }
    @Override
    protected String destroyContextPhaseFailed$str() {
        return "WFLYWS0043: Löschen von Kontext fehlgeschlagen";
    }
    @Override
    protected String activatingWebservicesExtension$str() {
        return "WFLYWS0002: Aktivierung der WebServices-Erweiterung";
    }
    @Override
    protected String configServiceDestroyFailed$str() {
        return "WFLYWS0006: Fehler bei Löschung des Konfigurationsdiensts";
    }
    @Override
    protected String onlyStringPasswordAccepted$str() {
        return "WFLYWS0075: Nur String-Passwörter werden akzeptiert";
    }
}
