package org.jboss.as.weld.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:55+0200")
public class WeldLogger_$logger_de extends WeldLogger_$logger implements WeldLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public WeldLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotLoadAnnotationIndexOfExternalBeanArchive$str() {
        return "WFLYWELD0054: Der bereitgestellte Index des externen Bean-Archivs %1$s konnte nicht gelesen werden.";
    }
    @Override
    protected String cdiAnnotationsButNotBeanArchive$str() {
        return "WFLYWELD0013: Deployment %1$s enthält Annotationen für Jakarta Contexts and Dependency Injection, aber es wurde kein Bean-Archiv gefunden (keine beans.xml oder Klasse mit Bean für Annotationsdefinition war vorhanden).";
    }
    @Override
    protected String couldNotReadEntries$str() {
        return "WFLYWELD0016: Einträge konnten nicht gelesen werden";
    }
    @Override
    protected String couldNotFindPersistenceUnit$str() {
        return "WFLYWELD0037: Fehler beim Einspeisen der Persistenzeinheit in ein durch Jakarta Contexts and Dependency Injection verwaltetes Bean. Es kann keine Persistenzeinheit mit dem Namen '%1$s' in Deployment %2$s für Einspeisungspunkt %3$s gefunden werden";
    }
    @Override
    protected String couldNotDetermineUnderlyingType$str() {
        return "WFLYWELD0036: Bean-Klasse konnte nicht von Einspeisungspunkt-Typ %1$s bestimmt werden";
    }
    @Override
    protected String couldNotFindResource1$str() {
        return "WFLYWELD0044: Fehler beim Injizieren von Ressource in durch Jakarta Contexts and Dependency Injection verwaltetes Bean. Kann keine Ressource namens %1$s finden";
    }
    @Override
    protected String doNotUnderstandProtocol$str() {
        return "WFLYWELD0017: URL-Scanner versteht das URL-Protokoll %1$s nicht. Beans für Jakarta Contexts and Dependency Injection werden nicht gescannt.";
    }
    @Override
    protected String viewNotFoundOnEJB$str() {
        return "WFLYWELD0022: Ansicht vom Typ %1$s nicht gefunden auf Jakarta Enterprise Beans %2$s";
    }
    @Override
    protected String securityNotEnabled$str() {
        return "WFLYWELD0038: SecurityManager konnte nicht eingespeist werden. Sicherheit ist nicht aktiviert";
    }
    @Override
    protected String couldNotLoadPortableExceptionClass$str() {
        return "WFLYWELD0007: Portable Erweiterungsklasse %1$s konnte nicht geladen werden";
    }
    @Override
    protected String rejectAttributesMustBeTrue$str() {
        return "WFLYWELD0048: Diese Attribute müssen zur Nutzung mit CDI 1.0 '%1$s' 'true' sein";
    }
    @Override
    protected String extensionDoesNotImplementExtension$str() {
        return "WFLYWELD0021: Der Dienst %1$s hat die Schnittstelle jakarta.enterprise.inject.spi.Extension nicht implementiert.";
    }
    @Override
    protected String couldNotLoadInterceptorClass$str() {
        return "WFLYWELD0020: Interzeptorklasse %1$s konnte nicht geladen werden";
    }
    @Override
    protected String injectionPointNotAJavabean$str() {
        return "WFLYWELD0032: Einspeisungspunkt repräsentiert eine Methode, die den JavaBean-Konventionen nicht folgt (muss genau einen Parameter haben) %1$s";
    }
    @Override
    protected String beanArchiveDiscovered$str() {
        return "%1$s entdeckt";
    }
    @Override
    protected String failedToTearDownWeldContexts$str() {
        return "WFLYWELD0002: Abbruch der Weld-Kontexte fehlgeschlagen";
    }
    @Override
    protected String incorrectBceTranslatorSetup$str() {
        return "WFLYWELD0064: Falsches Setup für die Initialisierung des LiteExtensionTranslator von Weld; es muss eine Deployment-Einheit angegeben werden";
    }
    @Override
    protected String moreThanOneEjbResolved$str() {
        return "WFLYWELD0035: Mehr als ein Jakarta Enterprise Beans für @EJB-Einspeisung von %1$s auf %2$s aufgelöst. %3$s gefunden";
    }
    @Override
    protected String persistenceUnitFailed$str() {
        return "WFLYWELD0057: Persistenzeinheit \"%1$s\" fehlgeschlagen.";
    }
    @Override
    protected String startingWeldService$str() {
        return "WFLYWELD0009: Weld-Dienst für Deployment %1$s wird gestartet";
    }
    @Override
    protected String parameterCannotBeNull$str() {
        return "WFLYWELD0031: %1$s kann nicht Null sein";
    }
    @Override
    protected String unableToLoadAnnotation$str() {
        return "Annotation %1$s konnte nicht geladen werden";
    }
    @Override
    protected String notStarted$str() {
        return "WFLYWELD0041: %1$s wurde nicht gestartet";
    }
    @Override
    protected String annotationNotFound$str() {
        return "WFLYWELD0033: %1$s-Annotation auf %2$s nicht gefunden";
    }
    @Override
    protected String nameNotFoundInIndex$str() {
        return "WFLYWELD0050: %1$s wurde in Verbundindex nicht gefunden";
    }
    @Override
    protected String beansXmlValidationError$str() {
        return "WFLYWELD0012: Warnung während des Parsens %1$s:%2$s %3$s";
    }
    @Override
    protected String cannotInject$str() {
        return "WFLYWELD0046: Einspeisungspunkt %1$s kann nicht eingespeist werden";
    }
    @Override
    protected String persistenceUnitRemoved$str() {
        return "WFLYWELD0058: Persistenzeinheit \"%1$s\" entfernt.";
    }
    @Override
    protected String couldNotFindResource2$str() {
        return "WFLYWELD0049: Fehler beim Injizieren von Ressource in durch Jakarta Contexts and Dependency Injection verwaltetes Bean. Kann keine Ressource namens %1$s finden, die auf %2$s definiert ist";
    }
    @Override
    protected String startingServicesForCDIDeployment$str() {
        return "WFLYWELD0006: Starten von Diensten für die Bereitstellung von Jakarta Contexts and Dependency Injection: %1$s";
    }
    @Override
    protected String componentInterceptorSupportNotAvailable$str() {
        return "WFLYWELD0053: Komponenteninterzeptor-Unterstützung nicht verfügbar für: %1$s";
    }
    @Override
    protected String errorHandlingFile$str() {
        return "WFLYWELD0060: Fehlerbehandlungsdatei %1$s";
    }
    @Override
    protected String processingWeldDeployment$str() {
        return "WFLYWELD0003: Weld-Deployment %1$s wird verarbeitet";
    }
    @Override
    protected String duplicateBeansXml$str() {
        return "WFLYWELD0018: Sowohl WEB-INF/beans.xml als auch WEB-INF/classes/META-INF/beans.xml wurden gefunden. Es können nicht beide Speicherorte gleichzeitig verwendet werden. Weld verwendet den ersten Speicherort für dieses Deployment.";
    }
    @Override
    protected String singletonNotSet$str() {
        return "WFLYWELD0039: Singleton nicht für %1$s gesetzt. Dies bedeutet, dass Sie den Zugriff auf ein Weld-Deployment mit einem Thread-Kontext-Klassenlader versuchen, der nicht mit dem Deployment verknüpft ist.";
    }
    @Override
    protected String loadingProxiesUsingDeploymentClassLoader$str() {
        return "WFLYWELD0052: Deployment-Klassenlader wird verwendet, um Proxy-Klassen für Modul %1$s zu laden. Package-private-Zugriff funktioniert nicht. Um dies zu beheben, sollte das Modul Abhängigkeiten von %2$s deklarieren";
    }
    @Override
    protected String weldNotInitialized$str() {
        return "WFLYWELD0056: Weld ist noch nicht initialisiert.";
    }
    @Override
    protected String couldNotDeterminePackage$str() {
        return "WFLYWELD0062: Paket konnte nicht anhand des beschädigten Klassennamens ermittelt werden";
    }
    @Override
    protected String couldNotFindBeanManagerForDeployment$str() {
        return "WFLYWELD0005: BeanManager für Deployment %1$s konnte nicht gefunden werden";
    }
    @Override
    protected String beansXmlValidationWarning$str() {
        return "WFLYWELD0011: Warnung während des Parsens %1$s:%2$s %3$s";
    }
    @Override
    protected String alreadyRunning$str() {
        return "WFLYWELD0040: %1$s wird bereits ausgeführt";
    }
    @Override
    protected String beanDeploymentNotFound$str() {
        return "WFLYWELD0043: BeanDeploymentArchive mit ID %1$s im Deployment nicht gefunden";
    }
    @Override
    protected String cannotDetermineResourceName$str() {
        return "WFLYWELD0045: Ressourcenname kann nicht bestimmt werden. Sowohl jndiName als auch mappedName sind Null";
    }
    @Override
    protected String unknownInterceptorClassForCDIInjection$str() {
        return "WFLYWELD0030: Unbekannte Interceptor-Klasse für Jakarta Contexts and Dependency Injection %1$s";
    }
    @Override
    protected String unknownDeploymentType$str() {
        return "WFLYWELD0059: Unbekannter Deployment-Typ %1$s";
    }
    @Override
    protected String failedToSetupWeldContexts$str() {
        return "WFLYWELD0001: Einstellung der Weld-Kontexte fehlgeschlagen";
    }
    @Override
    protected String missingService$str() {
        return "WFLYWELD0061: Es wird genau ein Provider benötigt für: %1$s";
    }
    @Override
    protected String exceptionClearingThreadState$str() {
        return "WFLYWELD0014: Ausnahme beim Abbrechen des Thread-Status";
    }
    @Override
    protected String stoppingWeldService$str() {
        return "WFLYWELD0010: Weld-Dienst für Deployment %1$s wird gestoppt";
    }
    @Override
    protected String injectionTypeNotValue$str() {
        return "WFLYWELD0008: @Resource-Einspeisung vom Typ %1$s wird nicht für Komponenten, die nicht vom Typ Jakarta Enterprise Beans sind, unterstützt. Einspeisungspunkt: %2$s";
    }
    @Override
    protected String couldNotGetBeansXmlAsURL$str() {
        return "WFLYWELD0019: Konnte beans.xml-Datei als URL abrufen bei Verarbeitung von Datei: %1$s";
    }
    @Override
    protected String cannotIndexClassName$str() {
        return "WFLYWELD0055: Die Indexklasse [%1$s] aus dem externen Bean-Archiv %2$s konnte nicht indiziert werden.";
    }
    @Override
    protected String originalClassDoesNotHaveAModule$str() {
        return "WFLYWELD0063: Original-%1$s hat kein Modul";
    }
    @Override
    protected String ejbNotResolved$str() {
        return "WFLYWELD0034: @EJB-Einspeisung für %1$s auf %2$s konnte nicht aufgelöst werden";
    }
    @Override
    protected String cannotUseAtRuntime$str() {
        return "WFLYWELD0047: %1$s kann zur Laufzeit nicht verwendet werden";
    }
    @Override
    protected String cannotLoadClass$str() {
        return "WFLYWELD0051: %1$s kann nicht geladen werden";
    }
}
