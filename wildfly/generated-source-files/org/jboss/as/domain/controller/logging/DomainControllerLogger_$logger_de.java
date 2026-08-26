package org.jboss.as.domain.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:19+0200")
public class DomainControllerLogger_$logger_de extends DomainControllerLogger_$logger implements DomainControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DomainControllerLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToSendMessage$str() {
        return "WFLYDC0066: Senden von Nachricht fehlgeschlagen: %1$s";
    }
    @Override
    protected String unexplainedFailure$str() {
        return "WFLYDC0021: Unklarer Fehler";
    }
    @Override
    protected String noDeploymentContentWithName$str() {
        return "WFLYDC0042: Kein Deployment mit Namen %1$s gefunden";
    }
    @Override
    protected String adminOnlyModeCannotAcceptSlaves$str() {
        return "WFLYDC0014: Der primäre Host Controller kann keine sekundären Host Controller registrieren, da sein derzeitiger Ausführungsmodus '%1$s' ist";
    }
    @Override
    protected String invalidUrl$str() {
        return "WFLYDC0045: %1$s ist keine gültige URL – %2$s";
    }
    @Override
    protected String undeployingDeploymentHasBeenRedeployed$str() {
        return "WFLYDC0073: Deployment %1$s wurde erneut deployt und dessen Inhalt wird nicht entfernt. Sie müssen es neu starten.";
    }
    @Override
    protected String serverGroupExpectsSingleChild$str() {
        return "WFLYDC0019: server-group erwartet nur ein untergeordnetes Objekt: %1$s";
    }
    @Override
    protected String operationFailedOrRolledBackWithCause$str() {
        return "WFLYDC0074: Operation fehlgeschlagen oder an allen Servern zurückgesetzt. Serverfehler:";
    }
    @Override
    protected String cannotAddContentToUnmanagedDeployment$str() {
        return "WFLYDC0089: Inhalte können nicht zu einem nicht verwalteten Deployment hinzugefügt werden";
    }
    @Override
    protected String interruptedAwaitingFinalResponse1$str() {
        return "WFLYDC0005: Unterbrechung während Warten auf finale Antwort vom Host %1$s;Remote-Prozess wurde benachrichtigt den Vorgang abzubrechen";
    }
    @Override
    protected String cannotRemoveUsedServerGroup$str() {
        return "WFLYDC0064: server-group '%1$s' kann nicht entfernt werden, da sie von Servern %2$s in Gebrauch ist";
    }
    @Override
    protected String serverManagementUnavailableDuringBoot$str() {
        return "WFLYDC0098: Die folgenden Server %1$s werden gerade gestartet; Ausführung von Remote-Management-Vorgängen derzeit nicht möglich";
    }
    @Override
    protected String invalidUrlStream$str() {
        return "WFLYDC0038: Ungültiger URL-Stream.";
    }
    @Override
    protected String invalidCode$str() {
        return "WFLYDC0054: Ungültiger Code %1$d";
    }
    @Override
    protected String timedOutAwaitingHostPreparedResponse$str() {
        return "WFLYDC0080: Timeout nach %1$d ms Wartezeit auf von Host vorbereitete Antwort(en) -- Remote-Host %2$s wurde benachrichtigt, den Vorgang abzubrechen";
    }
    @Override
    protected String unknownAttributesFromSubsystemVersion$str() {
        return "WFLYDC0061: Operation '%1$s' schlägt fehl, weil die Attribute vom Subsystem '%2$s' Modellversion '%3$s' nicht bekannt sind: %4$s";
    }
    @Override
    protected String timedOutAwaitingHostPreparedResponses$str() {
        return "WFLYDC0079: Timeout nach %1$d ms Wartezeit auf von Host vorbereitete Antwort(en) von Hosts %2$s -- Updates für Hosts %3$s werden abgebrochen";
    }
    @Override
    protected String invalidRolloutPlanGroupAlreadyExists$str() {
        return "WFLYDC0027: Ungültiger Rollout-Plan. Servergruppe %1$s erscheint mehr als einmal im Plan.";
    }
    @Override
    protected String caughtExceptionAwaitingFinalResponse1$str() {
        return "WFLYDC0006: Ausnahme abgefangen beim Warten auf finale Antwort von Host %1$s";
    }
    @Override
    protected String slaveControllerCannotAcceptOtherSlaves$str() {
        return "WFLYDC0013: Die Registrierung von Remote-Hosts wird auf sekundären Host Controllern nicht unterstützt";
    }
    @Override
    protected String missingExtensions$str() {
        return "WFLYDC0075: Modell konnte aufgrund fehlender Erweiterungen nicht synchronisiert werden: %1$s";
    }
    @Override
    protected String caughtExceptionAwaitingFinalResponse2$str() {
        return "WFLYDC0004: Ausnahme abgefangen beim Warten auf finale Antwort vom Server %1$s auf Host %2$s";
    }
    @Override
    protected String cannotReadContentFromUnmanagedDeployment$str() {
        return "WFLYDC0095: Inhalte können nicht von einem nicht verwalteten Deployment gelesen werden";
    }
    @Override
    protected String timedOutAwaitingPreparedResponse$str() {
        return "WFLYDC0082: Timeout von %1$s nach %2$d ms Wartezeit auf von Server vorbereitete Antwort(en) -- Abbruch der Aktualisierungen für Server %3$s";
    }
    @Override
    protected String cloneOperationNotSupportedOnHost$str() {
        return "WFLYDC0078: Die Operation zum Klonen von Profilen ist auf dem Host '%1$s' nicht verfügbar. Um sie in einer Domain zu verwenden, die ältere sekundäre Hosts enthält, die diese Operation zum Klonen von Profilen nicht unterstützen, müssen Sie eine der folgenden Maßnahmen durchführen: a) Vergewissern Sie sich, dass alle älteren sekundären Hosts mit einer Modellversion niedriger als 4.0.0 das geklonte Profil und das im 'to-profile'-Parameter angegebene Profil ignorieren. b) Laden Sie den Domain-Controller im admin-only-Modus neu, führen Sie die Klon-Operation aus, und laden Sie dann den Domain-Controller wieder neu im normalen Modus, und prüfen Sie abschließend, ob die sekundären Hosts neu gestartet werden müssen.";
    }
    @Override
    protected String cannotAddContentToSelfContainedServer$str() {
        return "WFLYDC0088: Inhalte können nicht zu einem Deployment in einem eigenständigen Server hinzugefügt werden";
    }
    @Override
    protected String domainModelChangedOnReConnect$str() {
        return "WFLYDC0008: Domain-Modell hat sich bei Neuverbindung geändert. Die folgenden Server müssen neu gestartet werden, damit die Änderungen wirksam werden: %1$s";
    }
    @Override
    protected String unrecognizedChildren$str() {
        return "WFLYDC0017: %1$s erkennt nur %2$s als untergeordnete Objekte an: %3$s";
    }
    @Override
    protected String masterDomainControllerOnlyOperation$str() {
        return "WFLYDC0032: Die Operation %1$s für die Adresse %2$s kann nur vom Domain-Controller ausgeführt werden; dieser Host ist nicht der Domain-Controller";
    }
    @Override
    protected String unknownServerGroup$str() {
        return "WFLYDC0052: Unbekannte Servergruppe %1$s";
    }
    @Override
    protected String unknown$str() {
        return "WFLYDC0051: Unbekannter %1$s %2$s";
    }
    @Override
    protected String unexpectedInitialPathKey$str() {
        return "WFLYDC0035: Unerwarteter initialer Pfadschlüssel %1$s";
    }
    @Override
    protected String caughtExceptionStoringDeploymentContent$str() {
        return "WFLYDC0034: Abfangen von %1$s beim Speichern von Deployment-Inhalt -- %2$s";
    }
    @Override
    protected String invalidRolloutPlan1$str() {
        return "WFLYDC0026: Ungültiger Rollout-Plan. Planvorgänge betreffen Servergruppen %1$s, die nicht im Rollout-Plan reflektiert sind";
    }
    @Override
    protected String timedOutAwaitingFinalResponse2$str() {
        return "WFLYDC0081: Timeout nach %1$d ms Wartezeit auf finale Antwort von Host %2$s; Remote-Prozess wurde benachrichtigt, den Vorgang abzubrechen";
    }
    @Override
    protected String cannotExplodeSubDeploymentOfUnexplodedDeployment$str() {
        return "WFLYDC0097: Ein Unter-Deployment von einem nicht entpackten Deployment kann nicht entpackt werden";
    }
    @Override
    protected String unexpectedInSeriesGroup$str() {
        return "WFLYDC0020: Eine der Gruppen definiert weder server-group noch concurrent-groups: %1$s";
    }
    @Override
    protected String invalidRolloutPlan2$str() {
        return "WFLYDC0025: Ungültiger Rollout-Plan. %1$s ist kein gültiges untergeordnetes Objekt von Knoten %2$s";
    }
    @Override
    protected String deploymentHashNotFoundInRepository$str() {
        return "WFLYDC0055: Repository enthält kein Deployment mit Hash %1$s";
    }
    @Override
    protected String requiredChildIsMissing$str() {
        return "WFLYDC0016: Bei %1$s fehlt %2$s: %3$s";
    }
    @Override
    protected String interruptedAwaitingHostPreparedResponse$str() {
        return "WFLYDC0071: Unterbrechung während des Wartens auf Server vorbereitete Antwort(en) -- Abbruch von Updates für Hosts %1$s";
    }
    @Override
    protected String cannotReadContentFromSelfContainedServer$str() {
        return "WFLYDC0094: Inhalte können nicht von einem Deployment in einem eigenständigen Server gelesen werden";
    }
    @Override
    protected String exceptionAwaitingResultFromServer$str() {
        return "WFLYDC0024: Ausnahme beim Abrufen des Ergebnisses von Server %1$s: %2$s";
    }
    @Override
    protected String cannotRemoveDeploymentInUse$str() {
        return "WFLYDC0043: Kann Deployment %1$s nicht aus der Domain entfernen, da es noch von Servergruppen %2$s verwendet wird";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYDC0044: Ungültiger '%1$s'-Wert: %2$d, der Maximum-Index ist %3$d";
    }
    @Override
    protected String unknownServer$str() {
        return "WFLYDC0053: Unbekannter Server %1$s";
    }
    @Override
    protected String cannotUseSameValueForParameters$str() {
        return "WFLYDC0049: Kann %1$s nicht mit dem gleichen Wert für Parameter %2$s und %3$s verwenden. Verwenden Sie %4$s zum erneuten Deployment des gleichen Inhalts oder %5$s, um den Inhalt durch eine neue Version mit dem gleichen Namen zu ersetzen.";
    }
    @Override
    protected String slaveAlreadyRegistered$str() {
        return "WFLYDC0015: Es gibt bereits einen registrierten Host namens '%1$s'";
    }
    @Override
    protected String interruptedAwaitingResultFromHost$str() {
        return "WFLYDC0030: Unterbrechung während des Wartens auf Ergebnis von Host %1$s";
    }
    @Override
    protected String duplicateProfileInclude$str() {
        return "WFLYDC0076: Doppelt enthaltenes Profil '%1$s'";
    }
    @Override
    protected String timedOutAwaitingFinalResponse3$str() {
        return "WFLYDC0083: Timeout nach %1$d ms Wartezeit auf finale Antwort von Server %2$s auf Host %3$s; Remote-Prozess wurde benachrichtigt, den Vorgang abzubrechen";
    }
    @Override
    protected String invalidOperationTargetHost$str() {
        return "WFLYDC0033: Operation referenziert Host %1$s, dieser Host ist jedoch nicht registriert";
    }
    @Override
    protected String caughtIOExceptionUploadingContent$str() {
        return "WFLYDC0072: IOException beim Lesen des hochgeladenen Deployment-Content abgefangen";
    }
    @Override
    protected String slaveCannotAcceptUploads$str() {
        return "WFLYDC0041: Ein sekundärer Host Controller kann keine Uploads von Deployment-Inhalten akzeptieren";
    }
    @Override
    protected String cannotExplodeEnabledDeployment$str() {
        return "WFLYDC0087: Bereits bereitgestelltes Deployment kann nicht entpackt werden";
    }
    @Override
    protected String cannotReadContentFromUnexplodedDeployment$str() {
        return "WFLYDC0096: Inhalte können nicht von einem nicht entpackten Deployment gelesen werden";
    }
    @Override
    protected String cannotExplodeAlreadyExplodedDeployment$str() {
        return "WFLYDC0086: Bereits entpacktes Deployment kann nicht entpackt werden";
    }
    @Override
    protected String reportAdminOnlyMissingDeploymentContent$str() {
        return "WFLYDC0011: Kein Deployment-Inhalt mit Hash %1$s ist im Deployment-Inhalt Repository für Deployment '%2$s' verfügbar. Da dieser Host-Controller in ADMIN-ONLY Modus startet, wird das Fortsetzen des Startvorgangs erlaubt, um Administratoren die Gelegenheit zu geben, dieses Problem zu beheben. Wäre dieser Host Controller nicht im ADMIN-ONLY Modus, so wäre dies ein schwerwiegender Startfehler.";
    }
    @Override
    protected String registrationTaskGotInterrupted$str() {
        return "WFLYDC0068: Aufgabe Host-Registrierung wurde unterbrochen";
    }
    @Override
    protected String expectedOnlyOneDeployment$str() {
        return "WFLYDC0056: Nur ein Deployment erwartet, %1$d gefunden";
    }
    @Override
    protected String cannotExplodeUnmanagedDeployment$str() {
        return "WFLYDC0085: Nicht verwaltetes Deployment kann nicht entpackt werden";
    }
    @Override
    protected String interruptedAwaitingResultFromServer$str() {
        return "WFLYDC0023: Unterbrechung während des Wartens auf Ergebnis von Server %1$s";
    }
    @Override
    protected String cannotRemoveContentFromSelfContainedServer$str() {
        return "WFLYDC0091: Inhalte können nicht von einem Deployment in einem eigenständigen Server entfernt werden";
    }
    @Override
    protected String interruptedAwaitingFinalResponse2$str() {
        return "WFLYDC0003: Unterbrechung während Warten auf finale Antwort vom Server %1$s auf Host %2$s;Remote-Prozess wurde benachrichtigt den Vorgang abzubrechen";
    }
    @Override
    protected String failedToLoadModule$str() {
        return "WFLYDC0059: Laden des Moduls '%1$s' fehlgeschlagen.";
    }
    @Override
    protected String unsupportedWildcardOperation$str() {
        return "WFLYDC0065: Platzhalter-Operationen werden nicht unterstützt im Rahmen von Verbundoperationen";
    }
    @Override
    protected String registrationTaskFailed$str() {
        return "WFLYDC0069: Aufgabe Host-Registrierung fehlgeschlagen: %1$s";
    }
    @Override
    protected String cannotRemoveContentFromUnexplodedDeployment$str() {
        return "WFLYDC0093: Inhalte können nicht von einem nicht entpackten Deployment entfernt werden";
    }
    @Override
    protected String as7431$str() {
        return "WFLYDC0039: Nur 1 Teil Inhalt wird derzeit unterstützt (AS7-431)";
    }
    @Override
    protected String failedToSetServerInRestartRequireState$str() {
        return "WFLYDC0012: Festlegen des Servers (%1$s) in einen für Neustart nötigen Zustand fehlgeschlagen";
    }
    @Override
    protected String invalidJSFSlotValue$str() {
        return "WFLYDC0060: Ungültiger Jakarta Server Faces-Slot-Wert: '%1$s'. Der Host Controller ist nicht in der Lage, einen Jakarta Server Faces-Slot-Wert zu verwenden, der von seinem Standardwert abweicht. Diese Ressource wird auf diesem Host ignoriert";
    }
    @Override
    protected String cannotAddContentToUnexplodedDeployment$str() {
        return "WFLYDC0090: Inhalte können nicht zu einem nicht entpackten Deployment hinzugefügt werden";
    }
    @Override
    protected String interruptedAwaitingPreparedResponse$str() {
        return "WFLYDC0070: %1$s-Unterbrechung während des Wartens auf vom Server vorbereitete Antwort(en) – Abbruch von Aktualisierungen für Server %2$s";
    }
    @Override
    protected String invalidByteStream$str() {
        return "WFLYDC0037: Ungültiger Byte-Stream.";
    }
    @Override
    protected String noSocketBindingGroupCalled$str() {
        return "WFLYDC0062: Keine socket-binding-group benannt: %1$s";
    }
    @Override
    protected String failedToSendResponseHeader$str() {
        return "WFLYDC0067: Senden von Antwort-Header fehlgeschlagen: %1$s";
    }
    @Override
    protected String inSeriesIsMissingGroups$str() {
        return "WFLYDC0018: in-series fehlen Gruppen: %1$s";
    }
    @Override
    protected String operationFailedOrRolledBack$str() {
        return "WFLYDC0022: Operation fehlgeschlagen oder an allen Servern zurückgesetzt.";
    }
    @Override
    protected String nullStream$str() {
        return "WFLYDC0036: Null-Stream an Index %1$d";
    }
    @Override
    protected String duplicateSocketBindingGroupInclude$str() {
        return "WFLYDC0077: Doppelt enthaltene Socket-Binding-Gruppe '%1$s'";
    }
    @Override
    protected String cannotExplodeDeploymentOfSelfContainedServer$str() {
        return "WFLYDC0084: Deployment kann nicht in einem eigenständigen Server entpackt werden";
    }
    @Override
    protected String invalidRolloutPlanRange$str() {
        return "WFLYDC0028: Ungültiger Rollout-Plan. Servergruppe %1$s hat einen %2$s-Wert von %3$s; muss zwischen 0 und 100 sein.";
    }
    @Override
    protected String noProfileCalled$str() {
        return "WFLYDC0057: Kein Profil aufgerufen: %1$s";
    }
    @Override
    protected String caughtExceptionWaitingForTask$str() {
        return "WFLYDC0009: %1$s hat %2$s beim Warten auf Aufgabe %3$s abgefangen. Abbruch der Aufgabe";
    }
    @Override
    protected String deploymentAlreadyStarted$str() {
        return "WFLYDC0050: Deployment %1$s ist bereits gestartet";
    }
    @Override
    protected String cannotRemoveContentFromUnmanagedDeployment$str() {
        return "WFLYDC0092: Inhalte können nicht von einem nicht verwalteten Deployment entfernt werden";
    }
    @Override
    protected String noDeploymentContentWithHash$str() {
        return "WFLYDC0040: Kein Deployment-Inhalt mit Hash %1$s ist im Deployment-Inhalts-Repository verfügbar.";
    }
    @Override
    protected String invalidContentDeclaration$str() {
        return "WFLYDC0047: Ungültige Content-Deklaration";
    }
    @Override
    protected String noDeploymentContentWithHashAtBoot$str() {
        return "WFLYDC0058: Kein Deployment-Inhalt mit Hash %1$s ist im Deployment-Inhalts-Repository für Deployment '%2$s' verfügbar. Dies ist ein schwerwiegender Boot-Fehler. Um dieses Problem zu beheben, starten Sie entweder mit dem --admin-only Switch-Satz und verwenden Sie das CLI zur Installation des fehlenden Inhalts oder entfernen Sie ihn aus der Konfiguration oder entfernen Sie das Deployment aus der XML-Konfigurationsdatei und starten Sie neu.";
    }
    @Override
    protected String errorObtainingUrlStream$str() {
        return "WFLYDC0046: Fehler beim Abrufen des Eingabe-Streams von URL %1$s – %2$s";
    }
    @Override
    protected String invalidRolloutPlanLess$str() {
        return "WFLYDC0029: Ungültiger Rollout-Plan. Servergruppe %1$s hat einen %2$s-Wert von %3$s; kann nicht kleiner als 0 sein.";
    }
    @Override
    protected String caughtExceptionClosingInputStream$str() {
        return "WFLYDC0007: Ausnahme abgefangen beim Schließen des Eingabestream";
    }
    @Override
    protected String runtimeNameMustBeUnique$str() {
        return "WFLYDC0063: Ein Deployment namens %1$s mit demselben Laufzeitnamen %2$s an Servergruppe %3$s ist bereits vorhanden";
    }
    @Override
    protected String warnIgnoringSocketBindingGroupInclude$str() {
        return "WFLYDC0001: Untergeordnetes 'include'-Element von 'socket-binding-group' %1$s wird ignoriert";
    }
}
