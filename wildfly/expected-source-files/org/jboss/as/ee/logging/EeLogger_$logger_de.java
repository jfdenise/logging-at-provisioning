package org.jboss.as.ee.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:54:02+0200")
public class EeLogger_$logger_de extends EeLogger_$logger implements EeLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public EeLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotResolve$str() {
        return "WFLYEE0002: Konnte %1$s %2$s nicht auflösen";
    }
    @Override
    protected String componentDestroyFailure$str() {
        return "WFLYEE0006: Löschung der Komponenteninstanz %1$s fehlgeschlagen";
    }
    @Override
    protected String componentInstallationFailure$str() {
        return "WFLYEE0007: Optionale Komponente %1$s wird aufgrund einer Ausnahme nicht installiert (aktivieren Sie DEBUG Protokollierungsebene, um die Ursache zu sehen)";
    }
    @Override
    protected String invalidManagedBeanAbstractOrFinal$str() {
        return "WFLYEE0009: [Managed Bean Spezifikationen, Abschnitt %1$s] Implementierungsklasse der gemanagten Bean DARF KEINE Schnittstelle sein - %2$s ist eine Schnittstelle und wird deshalb nicht als gemanagtes Bean betrachtet.";
    }
    @Override
    protected String invalidManagedBeanInterface$str() {
        return "WFLYEE0010: [Managed Bean Spezifikationen, Abschnitt %1$s] Implementierungsklasse der gemanagten Bean DARF NICHT abstrakt oder endgültig sein - %2$s wird nicht als gemanagtes Bean betrachtet, da sie diese Anforderung nicht erfüllt.";
    }
    @Override
    protected String preDestroyInterceptorFailure$str() {
        return "WFLYEE0011: Ausnahme während pre-destroy-Interceptor-Aufruf für Komponentenklasse: %1$s";
    }
    @Override
    protected String subdeploymentIgnored$str() {
        return "WFLYEE0014: %1$s in Unter-Deployment ignoriert. jboss-ejb-client.xml wird nur für Deployments der obersten Ebene geparst.";
    }
    @Override
    protected String rollbackOfTransactionStartedInEEConcurrentInvocation$str() {
        return "WFLYEE0015: In EE Concurrent gestarteter Aufruf ist noch offen; Zurücksetzen wird gestartet, um Leck zu vermeiden.";
    }
    @Override
    protected String failedToRollbackTransaction$str() {
        return "WFLYEE0016: Zurücksetzen der Transaktion fehlgeschlagen.";
    }
    @Override
    protected String failedToSuspendTransaction$str() {
        return "WFLYEE0017: Aussetzen der Transaktion fehlgeschlagen.";
    }
    @Override
    protected String systemErrorWhileCheckingForTransactionLeak$str() {
        return "WFLYEE0018: Systemfehler beim Prüfen auf Transaktionsleck EE Concurrent Aufruf.";
    }
    @Override
    protected String alternateDeploymentDescriptor$str() {
        return "WFLYEE0019: Konnte keinen alternativen Deployment-Deskriptor %1$s spezifiziert für %2$s finden";
    }
    @Override
    protected String annotationAttributeMissing$str() {
        return "WFLYEE0020: %1$s Annotationen müssen %2$s liefern.";
    }
    @Override
    protected String cannotAddMoreItems$str() {
        return "WFLYEE0021: Kann keine weiteren Elemente hinzufügen, nachdem getSortedItems() aufgerufen wurde";
    }
    @Override
    protected String cannotBeEmpty$str() {
        return "WFLYEE0022: %1$s darf nicht leer sein";
    }
    @Override
    protected String cannotBeNullOrEmpty$str() {
        return "WFLYEE0023: %1$s kann nicht Null oder leer sein: %2$s";
    }
    @Override
    protected String cannotConfigureComponent$str() {
        return "WFLYEE0024: Konnte Komponente %1$s´nicht konfigurieren";
    }
    @Override
    protected String cannotDetermineType1$str() {
        return "WFLYEE0025: Konnte Typ nicht bestimmen für resource-env-ref %1$s";
    }
    @Override
    protected String cannotDetermineType3$str() {
        return "WFLYEE0026: Konnte Typ nicht bestimmen für %1$s %2$s, bitte %3$s spezifizieren.";
    }
    @Override
    protected String cannotLoad$str() {
        return "WFLYEE0027: Konnte %1$s referenziert in env-entry nicht laden";
    }
    @Override
    protected String cannotLoadInterceptor1$str() {
        return "WFLYEE0028: Interzeptorklasse %1$s konnte nicht geladen werden";
    }
    @Override
    protected String cannotLoadInterceptor2$str() {
        return "WFLYEE0029: Konnte Interzeptorklasse %1$s nicht an Komponente %2$s laden";
    }
    @Override
    protected String cannotLoadViewClass$str() {
        return "WFLYEE0030: Konnte View-Klasse %1$s nicht an Komponente %2$s laden";
    }
    @Override
    protected String cannotProcessEarModule$str() {
        return "WFLYEE0031: Konnte Module in application.xml für EAR [%1$s] nicht verarbeiten, Moduldatei %2$s nicht gefunden";
    }
    @Override
    protected String cannotParseResourceRefUri$str() {
        return "WFLYEE0032: Ressourcen-Ref URI konnte nicht analysiert werden: %1$s";
    }
    @Override
    protected String cannotResolveInjectionPoint$str() {
        return "WFLYEE0033: Konnte Einspeisungspunkt %1$s auf Klasse %2$s spezifiziert in web.xml nicht auflösen";
    }
    @Override
    protected String cannotResolveMethod$str() {
        return "WFLYEE0034: Konnte Methode %1$s auf Klasse %2$s mit Annotationen %3$s nicht auflösen";
    }
    @Override
    protected String cannotSpecifyBoth$str() {
        return "WFLYEE0036: Kann nicht sowohl %1$s als auch %2$s in einem Umgebungseintrag festlegen.";
    }
    @Override
    protected String circularDependency$str() {
        return "WFLYEE0037: Zirkuläre Abhängigkeit bei Installation von %1$s";
    }
    @Override
    protected String classOnlyAnnotation$str() {
        return "WFLYEE0038: %1$s Annotation ist nur erlaubt auf einer Klasse. %2$s ist keine Klasse.";
    }
    @Override
    protected String componentAlreadyDefined$str() {
        return "WFLYEE0040: Komponente '%1$s' in Klasse '%2$s' ist bereits in Klasse '%3$s' definiert";
    }
    @Override
    protected String componentClassHasErrors$str() {
        return "WFLYEE0041: Komponentenklasse %1$s für Komponente %2$s hat Fehler: %n%3$s";
    }
    @Override
    protected String componentConstructionFailure$str() {
        return "WFLYEE0042: Erstellung der Komponenteninstanz fehlgeschlagen";
    }
    @Override
    protected String componentIsStopped$str() {
        return "WFLYEE0043: Komponente ist gestoppt";
    }
    @Override
    protected String componentNotAvailable$str() {
        return "WFLYEE0044: Komponente nicht verfügbar (unterbrochen)";
    }
    @Override
    protected String componentNotFound$str() {
        return "WFLYEE0045: Keine Komponente gefunden für Typ \"%1$s\"";
    }
    @Override
    protected String componentViewConstructionFailure$str() {
        return "WFLYEE0046: Instantiierung der Komponentenansicht fehlgeschlagen";
    }
    @Override
    protected String conflictingBinding$str() {
        return "WFLYEE0047: Inkompatibles konfliktbehaftetes Binding unter %1$s Quelle: %2$s";
    }
    @Override
    protected String defaultConstructorNotFound$str() {
        return "WFLYEE0048: Konnte Standard-Konstruktor für %1$s nicht finden";
    }
    @Override
    protected String defaultConstructorNotFoundOnComponent$str() {
        return "WFLYEE0050: Kein Standard-Konstruktor für Interzeptorklasse %1$s auf Komponente %2$s";
    }
    @Override
    protected String elementAttributeMissing$str() {
        return "WFLYEE0051: %1$s Elemente müssen %2$s liefern.";
    }
    @Override
    protected String failedToInstallComponent$str() {
        return "WFLYEE0052: Installation von Komponente %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYEE0053: Parsen von %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToProcessChild$str() {
        return "WFLYEE0054: Verarbeitung untergeordneter Objekte für EAR [%1$s] fehlgeschlagen";
    }
    @Override
    protected String failedToRead2$str() {
        return "WFLYEE0055: Lesen von %1$s Einträgen für Applikation [%2$s] fehlgeschlagen";
    }
    @Override
    protected String failedToRead3$str() {
        return "WFLYEE0056: Lesen von %1$s Einträgen für Modul [%2$s, %3$s] fehlgeschlagen";
    }
    @Override
    protected String failedToRead4$str() {
        return "WFLYEE0057: Lesen von %1$s Einträgen für Komponente [%2$s, %3$s, %4$s] fehlgeschlagen";
    }
    @Override
    protected String fieldNotFound$str() {
        return "WFLYEE0058: Kein übereinstimmendes Feld gefunden für \"%1$s\"";
    }
    @Override
    protected String injectionTargetNotFound$str() {
        return "WFLYEE0059: Kein Einspeisungsziel gefunden";
    }
    @Override
    protected String invalidCharacterLength$str() {
        return "WFLYEE0060: %1$s vom Typ java.lang.Character ist nicht genau ein Zeichen lang %2$s";
    }
    @Override
    protected String invalidDescriptor$str() {
        return "WFLYEE0061: %1$s ist kein gültiger Deskriptor";
    }
    @Override
    protected String invalidInjectionTarget$str() {
        return "WFLYEE0062: Einspeisungsziel %1$s auf Klasse %2$s ist nicht kompatibel mit Typ der Einspeisung: %3$s";
    }
    @Override
    protected String invalidNumberOfArguments$str() {
        return "WFLYEE0063: Ungültige Anzahl von Parametern für Methode %1$s annotiert mit %2$s auf Klasse %3$s";
    }
    @Override
    protected String invalidReturnType$str() {
        return "WFLYEE0064: Ein Rückgabetyp von %1$s ist erforderlich für Methode %2$s annotiert mit %3$s auf Klasse %4$s";
    }
    @Override
    protected String invalidSignature$str() {
        return "WFLYEE0065: Ungültige Signatur für Methode %1$s annotiert mit %2$s auf Klasse %3$s, Signatur muss \"%4$s\" sein";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYEE0066: Ungültiger Wert: %1$s für \"%2$s\" Element";
    }
    @Override
    protected String methodNotFound1$str() {
        return "WFLYEE0067: Methode existiert nicht %1$s";
    }
    @Override
    protected String methodNotFound3$str() {
        return "WFLYEE0068: Keine übereinstimmende Methode gefunden für Methode %1$s (%2$s) an %3$s";
    }
    @Override
    protected String methodOnlyAnnotation$str() {
        return "WFLYEE0069: @%1$s ist nur gültig auf Methodenzielen.";
    }
    @Override
    protected String multipleComponentsFound$str() {
        return "WFLYEE0070: Mehrere Komponenten gefunden für Typ \"%1$s\"";
    }
    @Override
    protected String multipleMethodsFound$str() {
        return "WFLYEE0071: Mehr als eine übereinstimmende Methode gefunden für Methode \"%1$s\" (%2$s) an %3$s";
    }
    @Override
    protected String multipleSetterMethodsFound$str() {
        return "WFLYEE0072: Mehrere Setter-Methoden für %1$s für Klasse %2$s bei Anwendung von <injection-target> für env-entry gefunden";
    }
    @Override
    protected String noComponentInstance$str() {
        return "WFLYEE0073: Keine Komponenteninstanz assoziiert";
    }
    @Override
    protected String nullBindingName$str() {
        return "WFLYEE0074: Binding-Name darf nicht Null sein: %1$s";
    }
    @Override
    protected String nullOrEmptyManagedBeanClassName$str() {
        return "WFLYEE0075: Klassenname des gemanagten Beans kann nicht Null oder leer sein";
    }
    @Override
    protected String nullOrEmptyResourceReferenceType$str() {
        return "WFLYEE0076: Ressourcen-Referenztyp kann nicht Null oder leer sein";
    }
    @Override
    protected String nullResourceReference$str() {
        return "WFLYEE0077: Kann keinen Null-Ressourcenreferenz-Prozessor registrieren";
    }
    @Override
    protected String nullVar1$str() {
        return "WFLYEE0078: %1$s ist Null";
    }
    @Override
    protected String priorityAlreadyExists$str() {
        return "WFLYEE0079: Kann %1$s nicht hinzufügen, Priorität 0x%2$s ist bereits von %3$s genommen";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYEE0082: Dienst nicht gestartet";
    }
    @Override
    protected String setterMethodOnly$str() {
        return "WFLYEE0083: %1$s Einspeisungsziel ist ungültig. Es sind nur Setter-Methoden gestattet: %2$s";
    }
    @Override
    protected String unknownAnnotationTargetType$str() {
        return "WFLYEE0084: Unbekannter AnnotationTarget-Typ: %1$s";
    }
    @Override
    protected String unknownElementType$str() {
        return "WFLYEE0085: Unbekannter %1$s Typ %2$s";
    }
    @Override
    protected String viewMethodNotFound$str() {
        return "WFLYEE0086: Konnte Methode %1$s %2$s auf Ansicht %3$s von %4$s nicht finden";
    }
    @Override
    protected String unexpectedElement$str() {
        return "WFLYEE0088: Unerwartetes Element \"%1$s\" gefunden";
    }
    @Override
    protected String failedToProcessEJBClientDescriptor$str() {
        return "WFLYEE0089: Verarbeitung von jboss-ejb-client.xml fehlgeschlagen";
    }
    @Override
    protected String xmlErrorParsingEJBClientDescriptor$str() {
        return "WFLYEE0090: Ausnahme während des Parsens von jboss-ejb-client.xml-Datei gefunden an %1$s";
    }
    @Override
    protected String errorParsingEJBClientDescriptor$str() {
        return "WFLYEE0091: %1$s";
    }
    @Override
    protected String noMessageDestination$str() {
        return "WFLYEE0092: Kein Nachrichtenziel mit Name %1$s für Binding von %2$s";
    }
    @Override
    protected String moreThanOneMessageDestination$str() {
        return "WFLYEE0093: Mehr als ein Nachrichtenziel mit Name %1$s für Binding von %2$s Zielen: %3$s";
    }
    @Override
    protected String failedToLoadJbossProperties$str() {
        return "WFLYEE0094: Laden von jboss.properties fehlgeschlagen";
    }
    @Override
    protected String unsupportedModuleType$str() {
        return "WFLYEE0095: Nicht unterstützter EAR-Modultype: %1$s";
    }
    @Override
    protected String rootAsLibraryDirectory$str() {
        return "WFLYEE0096: Library-Verzeichnis mit Wert '/' ist nicht unterstützt";
    }
    @Override
    protected String earModuleChildOfLibraryDirectory$str() {
        return "WFLYEE0097: Modul kann nicht ein untergeordnetes Modul des EAR-Bibliothek-Verzeichnisses sein. Bibliothek-Verzeichnis: %1$s, Moduldateiname: %2$s";
    }
    @Override
    protected String managedReferenceWasNull$str() {
        return "WFLYEE0098: ManagedReference war Null und Einspeisung ist nicht optional für Einspeisung in Feld %1$s";
    }
    @Override
    protected String propertiesNotAllowedOnGlobalModules$str() {
        return "WFLYEE0100: Globale Module können keine 'annotations', 'meta-inf' oder 'services' festlegen.";
    }
    @Override
    protected String concurrentServiceValueUninitialized$str() {
        return "WFLYEE0102: EE Concurrent Service-Wert nicht initialisiert.";
    }
    @Override
    protected String serializationMustBeHandledByTheFactory$str() {
        return "WFLYEE0103: EE Concurrent ContextHandle Serialisierung muss von der Factory gehandhabt werden.";
    }
    @Override
    protected String factoryAlreadyExists$str() {
        return "WFLYEE0104: EE Concurrent Context %1$s hat bereits eine Factory mit dem Namen %2$s";
    }
    @Override
    protected String factoryNotFound$str() {
        return "WFLYEE0105: EE Concurrent Context %1$s hat keine Factory mit dem Namen %2$s";
    }
    @Override
    protected String concurrentContextServiceNotInstalled$str() {
        return "WFLYEE0106: EE Concurrent Context %1$s Dienst nicht installiert.";
    }
    @Override
    protected String transactionSetupProviderServiceNotInstalled$str() {
        return "WFLYEE0107: EE Concurrent Transaction Setup Provider Dienst nicht installiert.";
    }
    @Override
    protected String instanceDataCanOnlyBeSetDuringConstruction$str() {
        return "WFLYEE0108: Instanzdaten können nur während Construction eingestellt werden.";
    }
    @Override
    protected String aroundInvokeAnnotationUsedTooManyTimes$str() {
        return "WFLYEE0109: Eine Klasse darf nicht mehr als eine AroundInvoke-Methode deklarieren. %1$s annotiert %2$s Methoden.";
    }
    @Override
    protected String failedToRunTask$str() {
        return "WFLYEE0110: Geplante Aufgabe konnte nicht ausgeführt werden: %1$s";
    }
    @Override
    protected String cannotRunScheduledTask$str() {
        return "WFLYEE0111: Eingeplanter Task %1$s kann nicht ausgeführt werden, da Container angehalten wurde";
    }
    @Override
    protected String invalidCoreThreadsSize$str() {
        return "WFLYEE0112: Der Wert für core-threads muss größer als 0 sein, wenn die Warteschlangenlänge %1$s beträgt";
    }
    @Override
    protected String invalidMaxThreads$str() {
        return "WFLYEE0113: Der Wert %1$d für max-threads kann nicht kleiner sein als der Wert %2$d für core-threads.";
    }
    @Override
    protected String classDoesNotImplementAllInterfaces$str() {
        return "WFLYEE0114: Klasse implementiert nicht alle bereitgestellten Interfaces";
    }
    @Override
    protected String nullName$str() {
        return "WFLYEE0115: Der Name von %1$s ist Null";
    }
    @Override
    protected String nullVar3$str() {
        return "WFLYEE0116: %1$s ist null in %2$s %3$s";
    }
    @Override
    protected String cannotSetField$str() {
        return "WFLYEE0117: Feld %1$s kann nicht festgelegt werden – Objekt von %2$s (geladen von %3$s) kann nicht %4$s zugewiesen werden (geladen von %5$s)";
    }
    @Override
    protected String executorServiceNotFound$str() {
        return "WFLYEE0120: Executor-Dienst \"%1$s\" nicht gefunden";
    }
    @Override
    protected String unsupportedExecutorServiceMetric$str() {
        return "WFLYEE0121: Nicht unterstütztes Attribut \"%1$s\"";
    }
    @Override
    protected String globalDirectoryDoNotExist$str() {
        return "WFLYEE0122: Verzeichnispfad %1$s in global-directory-Ressource %2$s zeigt nicht auf ein gültiges Verzeichnis.";
    }
    @Override
    protected String oneGlobalDirectory$str() {
        return "WFLYEE0123: Globales Verzeichnis %1$s kann nicht hinzugefügt werden, da globales Verzeichnis %2$s bereits definiert ist.";
    }
    @Override
    protected String errorDeletingJACCPolicy$str() {
        return "WFLYEE0124: Fehler beim Löschen der Jakarta-Autorisierungsrichtlinie";
    }
    @Override
    protected String unableToStartException$str() {
        return "WFLYEE0125: Dienst %1$s kann nicht gestartet werden.";
    }
    @Override
    protected String rejectedDueToMaxRequests$str() {
        return "WFLYEE0126: Abgelehnt aufgrund der maximalen Anzahl von Anfragen";
    }
    @Override
    protected String invalidNamePrefix$str() {
        return "WFLYEE0127: Ungültiges \"%1$s\"-Namenssegment für env, Name kann nicht mit \"/\"-Präfix beginnen, Präfix wurde entfernt";
    }
    @Override
    protected String huntTaskTerminationFailure$str() {
        return "WFLYEE0128: Fehler beim Beenden von %1$s hängengebliebener Task %2$s";
    }
    @Override
    protected String hungTaskCancelled$str() {
        return "WFLYEE0129: %1$s hängengebliebende Aufgabe %2$s abgebrochen";
    }
    @Override
    protected String hungTaskNotCancelled$str() {
        return "WFLYEE0130: %1$s hängengebliebende Aufgabe %2$s nicht abgebrochen";
    }
    @Override
    protected String attributeNoLongerSupported$str() {
        return "WFLYEE0131: Das Attribut %1$s wird nicht mehr unterstützt.";
    }
    @Override
    protected String managedReferenceMethodWasNull$str() {
        return "WFLYEE0132: ManagedReference war null; Einspeisung nicht optional für Einspeisung in Methode %1$s";
    }
    @Override
    protected String duplicateJndiBindingFound$str() {
        return "WFLYEE0133: Eine JNDI-Bindung für die Komponente '%1$s' wurde bereits unter dem JNDI-Namen '%2$s' gemäß den Jakarta EE-Spezifikationen installiert. Die kollidierende Klasse ist %3$s. Lösung: Bereitstellung eines alternativen Namens für die Komponente oder Umbenennung der Klasse.";
    }
    @Override
    protected String multipleUsesOfAllRemaining$str() {
        return "WFLYEE0134: Mehrfache Verwendung von ContextServiceDefinition.ALL_REMAINING";
    }
    @Override
    protected String failedToResumeTransaction$str() {
        return "WFLYEE0135: Die Transaktion konnte nicht fortgesetzt werden.";
    }
    @Override
    protected String failureWhileRunningTask$str() {
        return "WFLYEE0136: Geplante Aufgabe konnte nicht ausgeführt werden: %1$s";
    }
    @Override
    protected String errorEqualsCannotBeCalledBeforeResolve$str() {
        return "WFLYEE0137: Fehler equals() kann nicht vor resolve() aufgerufen werden";
    }
    @Override
    protected String hungTaskTerminationPeriodIsNotBiggerThanZero$str() {
        return "WFLYEE0138: hungTaskTerminationPeriod ist nicht > 0";
    }
    @Override
    protected String cannotAddRemotingReceiver$str() {
        return "WFLYEE0139: Es kann kein Remoting-Empfänger hinzugefügt werden, der auf eine ausgehende Verbindung verweist, die null bzw. leer ist";
    }
    @Override
    protected String cannotAddHTTPConnection$str() {
        return "WFLYEE0140: Es kann keine HTTP-Verbindung hinzugefügt werden, die auf einen URI verweist, der null bzw. leer ist";
    }
    @Override
    protected String securityManagerNotAllowed$str() {
        return "WFLYEE0141: Ausführung mit aktiviertem SecurityManager ist in einer Umgebung mit Jakarta EE 11 oder höher nicht zulässig";
    }
    @Override
    protected String failedToLoadConcurrencyImplementation$str() {
        return "WFLYEE0142: Jakarta Concurrency-Implementierung konnte nicht geladen werden";
    }
    @Override
    protected String lifecycleOperationNotSupported$str() {
        return "WFLYEE0143: Lebenszyklusvorgang wird nicht unterstützt";
    }
}
