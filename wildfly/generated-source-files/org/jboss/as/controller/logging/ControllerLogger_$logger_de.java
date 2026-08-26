package org.jboss.as.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:09+0200")
public class ControllerLogger_$logger_de extends ControllerLogger_$logger implements ControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ControllerLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String duplicateElementsInList$str() {
        return "WFLYCTL0372: Listen-Attribut '%1$s' enthält Duplikate, was unzulässig ist";
    }
    @Override
    protected String invalidInterfaceCriteriaPattern$str() {
        return "WFLYCTL0109: Ungültiges Muster %1$s für Interface-Kriterien %2$s";
    }
    @Override
    protected String invalidRelativePathValue$str() {
        return "WFLYCTL0260: Ungültiger relativePath-Wert '%1$s'";
    }
    @Override
    protected String formattedCapabilityId$str() {
        return "%1$s in Kontext '%2$s'";
    }
    @Override
    protected String socketBindingalreadyDeclared$str() {
        return "WFLYCTL0418: Ein bereits deklariertes %1$s oder ein %2$s %3$s wurde schon in %4$s %5$s deklariert";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYCTL0129: Ungültiger Wert %1$s für %2$s; zulässige Werte sind %3$s";
    }
    @Override
    protected String noResourceForUndefiningAttribute$str() {
        return "WFLYCTL0489: Die Definition des Attributs %1$s kann nicht rückgängig gemacht werden, da keine Ressource unter %2$s vorhanden ist";
    }
    @Override
    protected String typeConversionError$str() {
        return "'%1$s' konnte nicht in '%2$s' konvertiert werden";
    }
    @Override
    protected String cannotResolveAddress$str() {
        return "WFLYCTL0001: Kann Adresse %1$s nicht auflösen, und kann sie daher keiner InetAddress zuordnen";
    }
    @Override
    protected String couldNotFindDirectorySpecifiedByProperty$str() {
        return "WFLYCTL0462: Das über die Systemeigenschaft '%1$s' angegebene Verzeichnis '%2$s' wurde nicht gefunden. Stellen Sie sicher, dass es existiert";
    }
    @Override
    protected String serviceTargetRuntimeOperationsOnly$str() {
        return "WFLYCTL0187: Dienstabruf-Ziel nur bei Runtime Operationen unterstützt";
    }
    @Override
    protected String failedToBuildReport$str() {
        return "WFLYCTL0401: Bericht konnte nicht erstellt werden";
    }
    @Override
    protected String resourceRegistrationIsNotAnAlias$str() {
        return "WFLYCTL0281: Ressourcen-Registrierung ist kein Alias";
    }
    @Override
    protected String requiredWithAlternatives$str() {
        return "WFLYCTL0446: %1$s oder Alternative %2$s ist erforderlich";
    }
    @Override
    protected String cannotResolveProcessUUID$str() {
        return "WFLYCTL0246: Kann die localhost-Adresse zur Erstellung eines UUID-basierten Namens für diesen Prozess nicht auflösen";
    }
    @Override
    protected String failedToBackup$str() {
        return "WFLYCTL0081: Backup von %1$s fehlgeschlagen";
    }
    @Override
    protected String timeoutCompletingOperation$str() {
        return "WFLYCTL0349: Timeout nach [%1$d] Sekunden des Wartens auf Service-Container-Stabilität während der Beendigung einer Operation. Prozess muss neu gestartet werden. Der Schritt, der den Service-Container zuerst aktualisiert hat, war '%2$s' an Adresse '%3$s'";
    }
    @Override
    protected String cannotAddMoreThanOneJvmForServerOrHost$str() {
        return "WFLYCTL0417: Kann nicht mehr als eine JVM hinzufügen. Hinzufügung von '%1$s' versucht, aber '%2$s' existiert bereits";
    }
    @Override
    protected String serviceStatusReportDependencies$str() {
        return "WFLYCTL0184: Neue fehlende/unbefriedigte Abhängigkeiten:%n";
    }
    @Override
    protected String failedToCloneRepository$str() {
        return "WFLYCTL0450: Repository %1$s konnte nicht geklont werden";
    }
    @Override
    protected String rootRegistrationIsNotOverridable$str() {
        return "WFLYCTL0223: Die root-Ressourcen-Registrierung unterstützt Außerkraftsetzungen (\"overrides\") nicht, weswegen keine Außerkraftsetzung entfernt werden kann.";
    }
    @Override
    protected String uuidNotValid$str() {
        return "WFLYCTL0501: Eine ungültige UUID-Zeichenkette '%1$s' wurde bei '%2$s' gefunden. Es wird ein neuer Wert generiert.";
    }
    @Override
    protected String argYaml$str() {
        return "Die YAML-Konfigurationsdateien zum Anpassen der Konfiguration. Die Pfade können absolut, relativ zum aktuellen Ausführungsverzeichnis oder relativ zum eigenständigen Konfigurationsverzeichnis sein.";
    }
    @Override
    protected String couldNotFindTransformerRegistryFallingBack$str() {
        return "WFLYCTL0405: Transformer zu %1$s konnte nicht gefunden werden, Rückkehr zu %2$s";
    }
    @Override
    protected String errorStoppingServer$str() {
        return "WFLYCTL0442: Fehler beim Stoppen von Server";
    }
    @Override
    protected String attributeWasNotMarkedAsReloadRequired$str() {
        return "WFLYCTL0435: Attribut '%1$s' von Ressource '%2$s' war nicht mit 'Neuladen erforderlich' markiert; legen Sie entweder das Flag RESTART_ALL_SERVICES fest oder registrieren Sie einen benutzerdefinierten Write-Handler.";
    }
    @Override
    protected String validationFailedCouldNotConvertParamToType$str() {
        return "WFLYCTL0233: Konnte den Parameter '%1$s' nicht in %2$skonvertieren. %3$s";
    }
    @Override
    protected String invalidSystemPropertyValue$str() {
        return "WFLYCTL0010: Ungültiger Wert %1$s für Systemeigenschaft %2$s -- Verwendung von Standardwert [%3$d]";
    }
    @Override
    protected String cannotModifyReadOnlyPath$str() {
        return "WFLYCTL0263: Pfad \"%1$s\" ist schreibgeschützt; er kann nicht bearbeitet werden";
    }
    @Override
    protected String unauthorized$str() {
        return "WFLYCTL0313: Nicht autorisiert zur Ausführung von Operation '%1$s' für Ressource '%2$s' -- %3$s";
    }
    @Override
    protected String illegalCharsetName$str() {
        return "WFLYCTL0482: Der Wert '%1$s' ist kein zulässiger Zeichensatzname";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYCTL0007: Schließen von Ressource %1$s fehlgeschlagen";
    }
    @Override
    protected String removingServiceUnsatisfiedDependencies1$str() {
        return "von %nService %1$s abhängig ist ";
    }
    @Override
    protected String invalidEnumValue$str() {
        return "WFLYCTL0248: Ungültiger Wert %1$s für %2$s; zulässige Werte sind %3$s";
    }
    @Override
    protected String unknownBaseRole$str() {
        return "WFLYCTL0329: Unbekannte Basisrolle '%1$s'";
    }
    @Override
    protected String attributesDoNotSupportExpressions$str() {
        return "WFLYCTL0301: Die folgenden Attribute unterstützen keine Ausdrücke: %1$s";
    }
    @Override
    protected String unsupportedCharset$str() {
        return "WFLYCTL0483: Der Zeichensatz '%1$s' wird in dieser Instanz der Java Virtual Machine nicht unterstützt";
    }
    @Override
    protected String requiredCapabilityMissing0$str() {
        return "WFLYCTL0369: Erforderliche Capabilitys sind nicht verfügbar:";
    }
    @Override
    protected String missingOneOf$str() {
        return "WFLYCTL0132: Muss eines der folgenden Elemente beinhalten: %1$s";
    }
    @Override
    protected String initialisedAdditionalBootCliScriptSystemNotKeepingAlive$str() {
        return "WFLYCTL0466: Initialisiert die zusätzliche Boot-CLI-Skriptfunktionalität. Die CLI-Befehle werden von %1$s gelesen. Nach deren Ausführung wird der Server in den normalen Modus neu gebootet";
    }
    @Override
    protected String errorBootingContainer2$str() {
        return "WFLYCTL0003: Fehler beim Booten des Containers aufgrund von unzureichendem Stack-Platz für den zur Ausführung von Boot-Operationen verwendeten Thread. Der Thread wurde mit einer Stack-Größe von [%1$d] konfiguriert. Die Einstellung der System-Property %2$s auf einen höheren Wert als [%1$d] kann dieses Problem lösen.";
    }
    @Override
    protected String wildcardOperationFailedAtSingleAddressWithComplexFailure$str() {
        return "WFLYCTL0286: Für mehrere Zieladressen aufgerufene Operation %1$s ist an Adresse %2$s fehlgeschlagen. Siehe Operationsergebnis zu Einzelheiten.";
    }
    @Override
    protected String invalidCredentialReferenceValue$str() {
        return "WFLYCTL0476: Wert für Attribut '%1$s' ist ungültig: entweder muss '%2$s' alleine angegeben werden oder '%3$s' muss mit mindestens einem von '%4$s' oder '%5$s' angegeben werden";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYCTL0201: Unbekanntes Attribut \"%1$s\"";
    }
    @Override
    protected String attributesDontSupportExpressions$str() {
        return "WFLYCTL0292: Attribute unterstützen keine Ausdrücke in der Zielmodellversion und diese Ressource wird am Zielhost ignoriert werden müssen.";
    }
    @Override
    protected String cannotCreateEmptyConfig$str() {
        return "WFLYCTL0388: Leere Konfigurationsdatei %1$s konnte nicht erstellt werden";
    }
    @Override
    protected String transformerLoggerCoreModelOperationTransformerAttributes$str() {
        return "WFLYCTL0295: Transformiere Operation %1$s an Ressource %2$s zur Kernmodellversion '%3$s' -- %4$s %5$s";
    }
    @Override
    protected String serviceStatusReportFailed$str() {
        return "WFLYCTL0186: Dienste, deren Start fehlgeschlagen ist:";
    }
    @Override
    protected String failedToListConfigurationSnapshot$str() {
        return "WFLYCTL0454: Konfigurations-Schnappschüsse %1$s konnten nicht aufgelistet werden";
    }
    @Override
    protected String invalidDescriptionNoParamTypeInDescription$str() {
        return "WFLYCTL0241: Es gibt keinen Typ für Parameter \"%1$s\" in der Beschreibung der Operation unter %2$s: %3$s";
    }
    @Override
    protected String fileNotFoundWithPrefix$str() {
        return "WFLYCTL0091: Keine mit '%1$s' beginnenden Dateien in %2$s gefunden";
    }
    @Override
    protected String noAttributeDefined$str() {
        return "WFLYCTL0509: Kein Attribut namens '%1$s' unter Adresse '%2$s' definiert.";
    }
    @Override
    protected String alreadyDefined$str() {
        return "WFLYCTL0039: %1$s bereits definiert";
    }
    @Override
    protected String deadLock$str() {
        return "WFLYCTL0497: Deadlock entdeckt!";
    }
    @Override
    protected String failedToUpdateAuditLog$str() {
        return "WFLYCTL0035: Aktualisierung des Management-Operation Audit-Protokolls schlug fehl";
    }
    @Override
    protected String failedToTakeSnapshot$str() {
        return "WFLYCTL0088: Erstellen von Schnappschuss %1$s zu %2$s fehlgeschlagen";
    }
    @Override
    protected String notFound$str() {
        return "WFLYCTL0153: Kein %1$s%2$s gefunden für %3$s";
    }
    @Override
    protected String modelFieldsNotKnown$str() {
        return "WFLYCTL0282: Modell enthält Felder, die nicht in der Definition bekannt sind, Felder: %1$s, Pfad: %2$s";
    }
    @Override
    protected String nodeAlreadyRegistered$str() {
        return "WFLYCTL0218: Ein Knoten ist bereits registriert unter '%1$s'";
    }
    @Override
    protected String failedSubsystemBootOperations$str() {
        return "WFLYCTL0006: Ausführung der Boot-Operationen für Subsystem %1$s fehlgeschlagen";
    }
    @Override
    protected String unknownMulticastAddress$str() {
        return "WFLYCTL0266: Wert %1$s für Attribut %2$s ist keine gültige Multicast-Adresse";
    }
    @Override
    protected String serviceInstallCancelled$str() {
        return "WFLYCTL0179: Dienstinstallation wurde abgebrochen";
    }
    @Override
    protected String noPathToResolve$str() {
        return "WFLYCTL0291: Es existiert kein registrierter Pfad zur Auflösung mit dem Pfadattribut '%1$s' und/oder relative-to Attribut '%2$s' auf: %3$s";
    }
    @Override
    protected String failedToParseElementLenient$str() {
        return "WFLYCTL0411: Parsen von Element '%1$s' fehlgeschlagen, wird ignoriert ...";
    }
    @Override
    protected String noFinalProxyOutcomeReceived$str() {
        return "WFLYCTL0016: Keine endgültige Ergebnisantwort für Operation %1$s mit Adresse %2$s vom Remote-Prozess unter Adresse %3$s erhalten. Das Ergebnis dieser Operation enthält nur die vorläufige Antwort auf die Anfrage vom Remote Prozess.";
    }
    @Override
    protected String illegalPermissionName$str() {
        return "WFLYCTL0381: Unzulässiger Berechtigungsname '%1$s'";
    }
    @Override
    protected String extensionModuleLoadingFailure$str() {
        return "WFLYCTL0311: Laden des Erweiterungsmoduls %1$s fehlgeschlagen";
    }
    @Override
    protected String unexpectedAttribute1$str() {
        return "WFLYCTL0197: Unerwartetes Attribut \"%1$s\" gefunden";
    }
    @Override
    protected String reloadingServerToNormalModeAfterRestartAfterAdditionalBootCliScript$str() {
        return "WFLYCTL0471: Neuladen des Servers in den normalen Modus nach dem Neustart, nachdem die zusätzlichen Befehle des CLI-Skripts ausgeführt wurden. Dadurch werden die Eigenschaften, die die zusätzliche Boot-CLI-Skriptfunktionalität auslösen, gelöscht, falls sie festgelegt wurden (%1$s, %2$s, %3$s)";
    }
    @Override
    protected String invalidMaxSize$str() {
        return "WFLYCTL0114: [%1$d] ist keine gültige Größe für Parameter %2$s. Eine maximale Länge von [%3$d] ist erforderlich";
    }
    @Override
    protected String operationNotRegisteredException$str() {
        return "WFLYCTL0224: Es ist keine Operation %1$s registriert unter Adresse %2$s";
    }
    @Override
    protected String aliasAlreadyRegistered$str() {
        return "WFLYCTL0277: Ein Alias ist bereits am Speicherort '%1$s' registriert";
    }
    @Override
    protected String operationFailedOnClientError$str() {
        return "WFLYCTL0017: Operation (%1$s) fehlgeschlagen – Adresse: (%2$s) – Fehlerbeschreibung: %3$s";
    }
    @Override
    protected String interruptedAwaitingInitialResponse$str() {
        return "WFLYCTL0350: Ausführung von Operation '%1$s' für Remote-Prozess an Adresse '%2$s' während des Wartens auf Erstantwort unterbrochen; Remote-Prozess wurde benachrichtigt, dass die Operation abgebrochen werden soll";
    }
    @Override
    protected String serviceRemovalRuntimeOperationsOnly$str() {
        return "WFLYCTL0182: Dienstentfernung nur in Runtime-Operationen unterstützt";
    }
    @Override
    protected String unsupportedDeployment$str() {
        return "WFLYCTL0507: Nicht unterstützte Deployment-YAML-Datei %1$s mit Attributen %2$s";
    }
    @Override
    protected String namespaceAlreadyRegistered$str() {
        return "WFLYCTL0138: Namespace mit Präfix %1$s bereits registriert mit Schema-URI %2$s";
    }
    @Override
    protected String runtimeModificationComplete$str() {
        return "WFLYCTL0416: Veränderungen des Runtime-Dienst-Containers durch eine Management-Operation wurden abgeschlossen";
    }
    @Override
    protected String validationFailedValueIsSmallerThanMin$str() {
        return "WFLYCTL0234: Der Wert \"%1$s\" für \"%2$s\" ist kleiner als der Mindestwert \"%3$s\". %4$s";
    }
    @Override
    protected String cannotOverrideNonWildCardRegistration$str() {
        return "WFLYCTL0221: Die Registrierung eines Außerkraftsetzungsmodells ist bei Registrierungen von Nicht-Platzhalter-Modellen nicht zulässig. Die Registrierung gilt für den Nicht-Platzhalter Namen '%1$s'.";
    }
    @Override
    protected String invalidAttributeCombo$str() {
        return "WFLYCTL0105: %1$s ist ungültig in Verbindung mit %2$s";
    }
    @Override
    protected String adminOnlyPolicyDeprecatedValue$str() {
        return "WFLYCTL0495: \"fetch-from-master\" ist ein veralteter Wert für \"domain-controller.remote.admin-only-policy\"; stattdessen wird \"fetch-from-domain-controller\" verwendet.";
    }
    @Override
    protected String operationDeprecatedMessage$str() {
        return "WFLYCTL0449: Die Operation '%1$s' für die Ressource an Adresse '%2$s' ist veraltet und wird ggf. aus zukünftigen Versionen entfernt. Siehe die Ausgabe der Operation 'read-operation-description', um mehr darüber zu erfahren.";
    }
    @Override
    protected String proxyHandlerAlreadyRegistered$str() {
        return "WFLYCTL0169: Ein Proxy-Handler ist bereits am Speicherort '%1$s' registriert";
    }
    @Override
    protected String cannotRemoveStandardRole$str() {
        return "WFLYCTL0328: Kann Standardrolle '%1$s' nicht entfernen";
    }
    @Override
    protected String invalidAttributeValue1$str() {
        return "WFLYCTL0475: Wert für Attribut '%1$s' ist ungültig.";
    }
    @Override
    protected String failedToParseYamlConfigurationFile$str() {
        return "WFLYCTL0485: Fehler beim Parsen der YAML-Datei %1$s";
    }
    @Override
    protected String runtimePackageDependencyAlreadyRegistered$str() {
        return "WFLYCTL0481: Das Laufzeitabhängigkeitspaket '%1$s' ist bereits am Speicherort '%2$s' registriert";
    }
    @Override
    protected String illegalInterfaceCriteria$str() {
        return "WFLYCTL0094: Unzulässiger Interface-Kriterientyp %1$s; muss %2$s sein";
    }
    @Override
    protected String initialisedAdditionalBootCliScriptSystemKeepingAlive$str() {
        return "WFLYCTL0465: Initialisiert die zusätzliche Boot-CLI-Skriptfunktionalität. Die CLI-Befehle werden von %1$s gelesen. Der Server läuft nach deren Ausführung weiterhin im Nur-Admin-Modus, und das Ergebnis der CLI-Operationen wird in %2$s geschrieben";
    }
    @Override
    protected String compositeOperationFailed$str() {
        return "WFLYCTL0062: Zusammengesetzte Operation ist fehlgeschlagen und wurde zurückgesetzt. Die Schritte die fehlgeschlagen sind:";
    }
    @Override
    protected String duplicateInterfaceDeclaration$str() {
        return "WFLYCTL0072: Doppelte Interface-Deklaration";
    }
    @Override
    protected String pathIsAWindowsAbsolutePath$str() {
        return "WFLYCTL0261: \"%1$s\" ist ein absoluter Windows-Pfad";
    }
    @Override
    protected String invalidPort$str() {
        return "WFLYCTL0245: Ungültiger Wert \"%1$s\" %2$s -- muss eine gültige Portnummer sein";
    }
    @Override
    protected String ambiguousName$str() {
        return "WFLYCTL0045: Missverständlicher Name \"%1$s\" in %2$s: %3$s";
    }
    @Override
    protected String useOperationContextRemoveService$str() {
        return "WFLYCTL0247: Rufen Sie nicht ServiceController.setMode(REMOVE) auf, verwenden Sie stattdessen OperationContext.removeService().";
    }
    @Override
    protected String noSatisfactoryCapability$str() {
        return "WFLYCTL0499: Es gibt keine zufriedenstellende Capability '%1$s', die für Ressourcen mit dem Capability-Bereich '%2$s' verfügbar ist. Diese Capability ist unter den Adressen '%3$s' registriert und für Ressourcen mit dem Bereich '%4$s' nicht zugänglich.";
    }
    @Override
    protected String timeoutExecutingOperation0$str() {
        return "WFLYCTL0344: Timeout bei der Operation während des Wartens auf Service Container Stabilität";
    }
    @Override
    protected String orderedChildTypeRenamed$str() {
        return "WFLYCTL0398: Es wurde versucht, die Ressource unter %1$s in %2$s umzubenennen. Allerdings ist '%3$s' einer der Ressourcentypen, der auf der übergeordneten Ressource %4$s als geordnet definiert ist";
    }
    @Override
    protected String noChildType$str() {
        return "WFLYCTL0147: Kein untergeordneter Typ %1$s";
    }
    @Override
    protected String operationContextIsNotAbstractOperationContext$str() {
        return "WFLYCTL0318: Der Operationskontext ist kein AbstractOperationContext";
    }
    @Override
    protected String invalidMaxLength$str() {
        return "WFLYCTL0112: '%1$s' ist kein gültiger Wert für Parameter %2$s. Werte dürfen eine maximale Länge von %3$d Zeichen haben";
    }
    @Override
    protected String validationFailedValueIsLongerThanMaxLength$str() {
        return "WFLYCTL0237: Der Wert '%1$s' für '%2$s' ist länger als die Höchstlänge '%3$s'. %4$s";
    }
    @Override
    protected String missingYamlFile$str() {
        return "WFLYCTL0486: Fehlende YAML-Datei %1$s";
    }
    @Override
    protected String invalidDescriptionInvalidParamTypeInDescription$str() {
        return "WFLYCTL0242: Konnte den Typ von Parameter '%1$s' in der Beschreibung der Operation unter %2$s: %3$s nicht bestimmen";
    }
    @Override
    protected String pathEntryIsReadOnly$str() {
        return "WFLYCTL0257: Pfadeintrag ist schreibgeschützt: '%1$s'";
    }
    @Override
    protected String cancellingOperation$str() {
        return "WFLYCTL0352: Abbruch von Operation '%1$s' mit ID '%2$d', die auf Thread '%3$s' läuft";
    }
    @Override
    protected String cannotReadTargetDefinition$str() {
        return "WFLYCTL0024: Konnte Zieldefinition nicht lesen!";
    }
    @Override
    protected String illegalCLIStylePathAddress$str() {
        return "WFLYCTL0387: Unzulässige Pfadadresse '%1$s', fehlerhaftes CLI-Format";
    }
    @Override
    protected String invalidMaxBytesLength$str() {
        return "WFLYCTL0419: '%1$s' ist kein gültiger Wert für Parameter %2$s. Werte dürfen eine maximale Länge von %3$d Byte haben";
    }
    @Override
    protected String failedToLoadModule0$str() {
        return "WFLYCTL0083: Laden des Moduls fehlgeschlagen";
    }
    @Override
    protected String requiredCapabilityMissing1$str() {
        return "WFLYCTL0362: Von Ressource '%1$s' erforderte Capabilitys sind nicht verfügbar:";
    }
    @Override
    protected String invalidDescriptionMinMaxForParameterHasWrongType$str() {
        return "WFLYCTL0243: Das Attribut \"%1$s\" des Parameters \"%2$s\" kann nicht in seinen Typ konvertiert werden: %3$s in der Beschreibung der Operation unter %4$s: %5$s";
    }
    @Override
    protected String invalidAttributeDefinition$str() {
        return "WFLYCTL0484: Die Attributdefinition des Attributs '%1$s' ist null";
    }
    @Override
    protected String invalidPathElementValue$str() {
        return "WFLYCTL0128: Ungültiges Ressourcenadresselement '%1$s'. Der Wert '%2$s' ist nicht gültig für ein Element in einer Ressourcenadresse. Das Zeichen '%3$s' ist unzulässig.";
    }
    @Override
    protected String subsystemBootInterrupted$str() {
        return "WFLYCTL0191: Unterbrechung während des Wartens auf Ausführung der Boot-Operation des Untersystems";
    }
    @Override
    protected String wildcardRegistrationIsNotAnOverride$str() {
        return "WFLYCTL0222: Eine Registrierung namens \"*\" ist kein Außerkraftsetzungsmodell und kann nicht über das unregisterOverrideModel-API deregistriert werden.";
    }
    @Override
    protected String invalidWildcardAddress$str() {
        return "WFLYCTL0011: Adresse %1$s ist eine Platzhalter-Adresse, die nicht mit einer bestimmten Adresse übereinstimmt. Verwenden Sie das \"%2$s\" Konfigurationselement nicht um festzulegen, dass ein Interface eine Platzhalter-Adresse verwenden sollte. Verwenden Sie \"%3$s\"";
    }
    @Override
    protected String invalidAddressMask$str() {
        return "WFLYCTL0103: Ungültige Maske %1$s (%2$s)";
    }
    @Override
    protected String pathEntryAlreadyExists$str() {
        return "WFLYCTL0258: Es gibt bereits einen Pfadeintrag namens: '%1$s'";
    }
    @Override
    protected String cannotDeleteTempFile$str() {
        return "WFLYCTL0029: Kann temp-Datei %1$s nicht löschen, wird beim Beenden gelöscht";
    }
    @Override
    protected String inconsistentCapabilityContexts4$str() {
        return "WFLYCTL0399: Die Capability '%1$s', die für die Capability '%2$s' im Kontext '%3$s' erforderlich ist, ist in einer oder mehreren Socket-Binding-Gruppen verfügbar, doch nicht alle von '%4$s' erforderlichen Socket-Binding-Capabilitys können von einer einzelnen Socket-Binding-Gruppe aufgelöst werden, also ist diese Konfiguration ungültig";
    }
    @Override
    protected String cannotOverrideRootRegistration$str() {
        return "WFLYCTL0220: Die Registrierung eines Außerkraftsetzungsmodells ist bei der Registrierung des root-Modells nicht gestattet";
    }
    @Override
    protected String operationFailed3$str() {
        return "WFLYCTL0013: Operation (%1$s) fehlgeschlagen – Adresse: (%2$s) – Fehlerbeschreibung: %3$s";
    }
    @Override
    protected String couldNotCreateHistoricalBackup$str() {
        return "WFLYCTL0414: Erstellen von Backup mit Timestamp des aktuellen Chronik-Verzeichnisses %1$s fehlgeschlagen, weshalb es noch Versionen vom vorherigen Systemstart enthalten kann.";
    }
    @Override
    protected String noAttributeValueDefined$str() {
        return "WFLYCTL0511: Für das Attribut '%1$s' ist kein Wert unter der Adresse '%2$s' definiert.";
    }
    @Override
    protected String invalidAttributeValue3$str() {
        return "WFLYCTL0209: Ungültiger Wert '%1$s' für Attribut '%2$s' -- zulässige Werte sind %3$s";
    }
    @Override
    protected String invalidCapabilityServiceType$str() {
        return "WFLYCTL0394: Capability '%1$s' bietet keine Dienste vom Typ '%2$s'";
    }
    @Override
    protected String logHandlerWriteFailed$str() {
        return "WFLYCTL0037: Aktualisierung des Management-Operation Audit-Protokolls in Handler '%1$s' fehlgeschlagen";
    }
    @Override
    protected String invalidLoadFactor$str() {
        return "WFLYCTL0111: Load-Faktor muss größer als 0 und kleiner oder gleich 1 sein";
    }
    @Override
    protected String snapshotAlreadyExistError$str() {
        return "WFLYCTL0455: Schnappschuss %1$s kann nicht erstellt werden, da er bereits existiert";
    }
    @Override
    protected String ignoringUnsupportedLegacyExtension$str() {
        return "WFLYCTL0034: Subsysteme %1$s, die von der veralteten Erweiterung '%2$s' bereitgestellt werden, werden von Servern dieser Version nicht unterstützt. Die Erweiterung wird nur für den Gebrauch von Hosts unterstützt, die eine frühere Release in einer verwalteten Domain mit gemischten Versionen betreiben. Auf diesem Server registriert die Erweiterung keine Subsysteme, und zukünftige Versuche, auf diesem Server Subsysteme-Ressourcen zu erstellen oder darauf zuzugreifen, schlagen fehl.";
    }
    @Override
    protected String systemPropertyAlreadyExist$str() {
        return "WFLYCTL0456: Die Systemeigenschaft \"%1$s\" ist bereits im Abschnitt <system-properties> der Konfigurationsdatei festgelegt. Der in der Befehlszeile festgelegte Wert wird durch diesen Wert überschrieben.";
    }
    @Override
    protected String threadDump$str() {
        return "WFLYCTL0496: Thread Dump:";
    }
    @Override
    protected String noInterfaceCriteria$str() {
        return "WFLYCTL0149: Keine Interface-Kriterien geliefert";
    }
    @Override
    protected String invalidAddressValue$str() {
        return "WFLYCTL0104: Ungültige Adresse %1$s (%2$s)";
    }
    @Override
    protected String nullNotAllowed$str() {
        return "WFLYCTL0155: \"%1$s\" darf nicht null sein";
    }
    @Override
    protected String invalidMinValue$str() {
        return "WFLYCTL0117: [%1$d] ist kein gültiger Wert für Parameter %2$s. Eine minimaler Wert von %3$d ist erforderlich";
    }
    @Override
    protected String rollbackAlreadyInvoked$str() {
        return "WFLYCTL0176: rollback() wurde bereits aufgerufen";
    }
    @Override
    protected String capabilityDoesNotExposeRuntimeAPI$str() {
        return "WFLYCTL0366: Capability '%1$s' stellt keine Runtime-API zur Verfügung.";
    }
    @Override
    protected String invalidAddressFormat$str() {
        return "WFLYCTL0433: '%1$s' ist keine gültige Darstellung einer Ressourcenadresse";
    }
    @Override
    protected String incompleteExpression$str() {
        return "WFLYCTL0370: Unvollständiger Ausdruck: %1$s";
    }
    @Override
    protected String invalidDescriptionUndefinedRequestProperty$str() {
        return "WFLYCTL0240: Undefinierte Anfrageneigenschaft '%1$s' in Beschreibung der Operation unter %2$s: %3$s";
    }
    @Override
    protected String unexpectedOperationExecutionFailureDescription$str() {
        return "WFLYCTL0404: Unerwartete Ausnahme bei der Ausführung: %1$s";
    }
    @Override
    protected String systemPropertyDeprecated$str() {
        return "WFLYCTL0515: Die Systemeigenschaft '%1$s' ist veraltet und wird möglicherweise in einer zukünftigen Version entfernt. Stattdessen sollte das Attribut '%2$s' auf Ressource '%3$s' verwendet werden.";
    }
    @Override
    protected String noRestartMarkerFile$str() {
        return "WFLYCTL0474: Keine Statusdatei gefunden, die angibt, dass der Server nach Ausführung der zusätzlichen Befehle aus dem CLI-Skript neu gestartet wurde";
    }
    @Override
    protected String timeoutAwaitingFinalResponse$str() {
        return "WFLYCTL0410: Während der Ausführung von Operation '%1$s' auf dem Remote-Prozess an Adresse '%2$s' trat beim Warten auf finale Antwort ein Timeout nach %3$d ms auf; der Remote-Prozess wurde benachrichtigt, dass die Operation beendet werden soll";
    }
    @Override
    protected String moreThanOneInstanceOfAdditionalBootCliScriptInvokerFound$str() {
        return "WFLYCTL0463: Mehr als eine Instanz von AdditionalBootCliScriptInvoker gefunden. Habe: '%1$s'; gefunden: '%2$s'";
    }
    @Override
    protected String attributesAreNotUnderstoodAndMustBeIgnored0$str() {
        return "WFLYCTL0293: Attribute werden von der Zielmodellversion nicht verstanden und diese Ressource wird am Zielhost ignoriert werden müssen.";
    }
    @Override
    protected String stepHandlerFailed$str() {
        return "WFLYCTL0190: Schritt-Handler %1$s für Operation %2$s an Adresse %3$s fehlgeschlagen -- %4$s";
    }
    @Override
    protected String wildcardOperationFailedAtMultipleAddresses$str() {
        return "WFLYCTL0287: Für mehrere Zieladressen aufgerufene Operation %1$s ist an Adressen %2$s fehlgeschlagen. Siehe Operationsergebnis zu Einzelheiten.";
    }
    @Override
    protected String invalidSha1Value$str() {
        return "WFLYCTL0122: Wert %1$s für Attribut %2$s stellt keinen ordnungsgemäß Hex-verschlüsselten SHA1-Hash dar";
    }
    @Override
    protected String ambiguousConfigurationFiles$str() {
        return "WFLYCTL0044: Missverständlicher Konfigurationsdateiname \"%1$s\", da es mehrere Dateien in %2$s gibt, die auf %3$s enden";
    }
    @Override
    protected String invalidTableSize$str() {
        return "WFLYCTL0126: Tabelle in negativer Größe ist nicht möglich!";
    }
    @Override
    protected String validationFailedOperationHasNoField$str() {
        return "WFLYCTL0227: Operation hat kein Feld '%1$s'. %2$s";
    }
    @Override
    protected String unsupportedLegacyExtension$str() {
        return "WFLYCTL0309: Legacy-Erweiterung '%1$s' wird von Servern, die diese Version ausführen, nicht unterstützt. Die Erweiterung wird nur für den Gebrauch durch Hosts unterstützt, die eine frühere Release in einer gemischten, Versions-verwalteten Domain betreiben";
    }
    @Override
    protected String transactionInterrupted$str() {
        return "WFLYCTL0195: Unterbrechung beim Warten auf Festschreibung oder Rollback von Transaktion";
    }
    @Override
    protected String noHandlerForOperation$str() {
        return "WFLYCTL0031: Es existiert keine Operation namens '%1$s' unter Adresse %2$s";
    }
    @Override
    protected String duplicateAttribute$str() {
        return "WFLYCTL0068: Ein Attribut namens \"%1$s\" wurde bereits deklariert";
    }
    @Override
    protected String udpSyslogServerUnavailable$str() {
        return "WFLYCTL0375: Aktualisierung des Management-Operation-Audit-Protokolls am Handler '%1$s' fehlgeschlagen wegen '%2$s'. Stellen Sie sicher, dass der Syslog-Server läuft und erreichbar ist";
    }
    @Override
    protected String illegalMultipleRoles$str() {
        return "WFLYCTL0314: Benutzer mit mehreren Rollen sind nicht gestattet";
    }
    @Override
    protected String noOperationDefined$str() {
        return "WFLYCTL0383: Keine Operation definiert %1$s";
    }
    @Override
    protected String andNMore$str() {
        return "WFLYCTL0208: ... und %1$s mehr";
    }
    @Override
    protected String selectFailedCouldNotConvertAttributeToType$str() {
        return "WFLYCTL0406: Attribut '%1$s' konnte nicht zu %2$s konvertiert werden";
    }
    @Override
    protected String errorConstructingYAMLMapping$str() {
        return "Beim Erstellen eines Mappings; %1$s; wurde ein Mapping zum Zusammenführen erwartet, aber %2$s gefunden";
    }
    @Override
    protected String noActiveStep$str() {
        return "WFLYCTL0144: Kein aktiver Schritt";
    }
    @Override
    protected String cannotGetControllerLock$str() {
        return "WFLYCTL0307: Wir versuchen, Daten aus dem Domain-Controller zu lesen, der derzeit mit der Ausführung eines anderen Satzes an Operationen beschäftigt ist. Dies ist eine temporäre Situation, bitte versuchen Sie es erneut";
    }
    @Override
    protected String validationFailedValueIsShorterThanMinLength$str() {
        return "WFLYCTL0236: Der Wert \"%1$s\" für \"%2$s\" ist kürzer als die Mindestlänge \"%3$s\". %4$s";
    }
    @Override
    protected String notADirectory$str() {
        return "WFLYCTL0152: %1$s ist kein Verzeichnis";
    }
    @Override
    protected String rejectAttributesSubsystemModelResourceTransformer$str() {
        return "WFLYCTL0300: Transformiere Ressource %1$s für Host Controller '%2$s' zu Subsystem '%3$s' Modellversion '%4$s' -- Es gab Probleme mit einigen der Attribute und diese Ressource wird an diesem Host ignoriert. Einzelheiten zu den Problemen: %5$s";
    }
    @Override
    protected String missingRequiredServices$str() {
        return "WFLYCTL0412: Erforderliche Dienste, die nicht installiert sind:";
    }
    @Override
    protected String onlyAccessHostControllerInfoInRuntimeStage$str() {
        return "WFLYCTL0386: Auf die Host-Controller-Informationen kann nur zugegriffen werden nach der Modell-Phase während des Systemstarts";
    }
    @Override
    protected String servicesMissingDependencies$str() {
        return "WFLYCTL0180: Dienste mit fehlenden/unverfügbaren Abhängigkeiten";
    }
    @Override
    protected String pathManagerNotAvailable$str() {
        return "WFLYCTL0265: PathManager nicht für Prozesse des Typs '%1$s' verfügbar";
    }
    @Override
    protected String serviceStatusReportNoLongerRequired$str() {
        return "%1$s (nicht mehr erforderlich)%n";
    }
    @Override
    protected String noChildResource$str() {
        return "WFLYCTL0502: Keine untergeordnete Ressource namens '%1$s' unter der Adresse '%2$s' gefunden.";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYCTL0397: Indexierte Unterressourcen können nur registriert werden, wenn die übergeordnete Ressource geordnete Unterelemente unterstützt. Das übergeordnete Element von '%1$s' ist nicht indexiert";
    }
    @Override
    protected String pathEntryNotFound$str() {
        return "WFLYCTL0256: Konnte keinen Pfad namens '%1$s' finden";
    }
    @Override
    protected String explodedDeploymentNotSupported$str() {
        return "WFLYCTL0421: Entpacktes Deployment wird von einigen Servern nicht unterstützt";
    }
    @Override
    protected String invalidParameterValue$str() {
        return "WFLYCTL0121: %1$s ist kein gültiger Wert für Parameter %2$s -- muss einer von %3$s sein";
    }
    @Override
    protected String attemptingReconnectToSyslog$str() {
        return "WFLYCTL0354: Erneuter Verbindungsversuch mit dem Syslog-Handler '%1$s'; nach Timeout von %2$d Sekunden";
    }
    @Override
    protected String attributesMustBeDefined$str() {
        return "WFLYCTL0336: Die folgenden Attribute sind \"nillable\" (d.h. enthalten keinen Wert) im aktuellen Modell, müssen aber in der Zielmodellversion definiert werden: %1$s";
    }
    @Override
    protected String invalidHeaderName$str() {
        return "WFLYCTL0457: Ungültiger HTTP-Header-Name '%1$s'";
    }
    @Override
    protected String validationFailed$str() {
        return "WFLYCTL0207: Validierung fehlgeschlagen für %1$s";
    }
    @Override
    protected String timeoutExecutingOperation3$str() {
        return "WFLYCTL0348: Timeout nach [%1$d] Sekunden des Wartens auf Service-Container-Stabilität. Operation wird zurückgesetzt. Der Schritt, der den Service-Container zuerst aktualisiert, hat war '%2$s' an Adresse '%3$s'";
    }
    @Override
    protected String failedToPersistConfigurationChange1$str() {
        return "WFLYCTL0086: Persistierung der Konfigurationsänderung fehlgeschlagen: %1$s";
    }
    @Override
    protected String reserved$str() {
        return "WFLYCTL0173: %1$s ist reserviert";
    }
    @Override
    protected String tableIsFull$str() {
        return "WFLYCTL0194: Tabelle ist voll!";
    }
    @Override
    protected String timeoutAwaitingInitialStability3$str() {
        return "WFLYCTL0347: Timeout nach [%1$d] Sekunden des Wartens auf die erste Service-Container-Stabilität, ehe Runtime-Änderungen für Operation '%2$s' an Adresse '%3$s' zulässig sind. Operation wird zurückgesetzt; ein Prozessneustart ist erforderlich.";
    }
    @Override
    protected String noSuchResourceType$str() {
        return "WFLYCTL0030: Es ist keine Ressourcendefinition für Adresse %1$s registriert";
    }
    @Override
    protected String missingRequiredElements$str() {
        return "WFLYCTL0134: Fehlende(s) erforderliche(s) Element(e): %1$s";
    }
    @Override
    protected String operationFailed4$str() {
        return "WFLYCTL0013: Operation (%1$s) fehlgeschlagen – Adresse: (%2$s) – Fehlerbeschreibung: %3$s%4$s";
    }
    @Override
    protected String readOnlyContext$str() {
        return "WFLYCTL0306: Schreibgeschützter Kontext";
    }
    @Override
    protected String duplicateExtensionElement$str() {
        return "WFLYCTL0437: Doppelte Erweiterung: Ein %1$s-Element mit %2$s-Attribut mit Wert '%3$s' wurde bereits geparst";
    }
    @Override
    protected String missingManagementServices$str() {
        return "WFLYCTL0459: Auslösen eines Rollbacks aufgrund fehlender Managementdienste.";
    }
    @Override
    protected String extensionDeprecated$str() {
        return "WFLYCTL0033: Erweiterung '%1$s' ist veraltet und wird möglicherweise in zukünftigen Versionen nicht mehr unterstützt";
    }
    @Override
    protected String servicesMissing$str() {
        return "[%1$s] fehlt";
    }
    @Override
    protected String noKnownProviderPoints$str() {
        return "; Es gibt keine bekannten Registrierungspunkte, die diese Capability bereitstellen können.";
    }
    @Override
    protected String rejectResourceOperationTransformation$str() {
        return "WFLYCTL0304: Operation %2$s auf %1$1s wird am Zielhost abgelehnt und wird am Host ignoriert werden müssen";
    }
    @Override
    protected String unableToBuildCommandCredentialSource$str() {
        return "WFLYCTL0478: Es konnte keine befehlsbasierte CredentialSource für die Credential-Referenz erstellt werden.";
    }
    @Override
    protected String failedToCreateConfigurationBackup$str() {
        return "WFLYCTL0082: Erstellen von Backup-Kopien der Konfigurationsdatei %1$s fehlgeschlagen";
    }
    @Override
    protected String aliasTargetResourceRegistrationNotFound$str() {
        return "WFLYCTL0279: Alias-Zieladresse nicht gefunden: %1$s";
    }
    @Override
    protected String attemptToBothRemoveAndAddHandlerUpdateInstead$str() {
        return "WFLYCTL0322: Ein Versuch wurde unternommen, einen Handler aus einer zusammengesetzten Operation zu entfernen und hinzuzufügen - aktualisieren Sie den Handler stattdessen";
    }
    @Override
    protected String canOnlyCreateChildAuditLoggerForMainAuditLogger$str() {
        return "WFLYCTL0331: Kann nur untergeordneten Audit-Logger für Haupt-Audit-Logger erstellen";
    }
    @Override
    protected String nonHostCapableSubsystemInHostModel$str() {
        return "WFLYCTL0385: Ein Versuch wurde unternommen, das nicht hostfähige Subsystem \"%1$s\" vom Erweiterungsmodul \"%2$s\" im Hostmodell zu registrieren.";
    }
    @Override
    protected String invalidLocaleString$str() {
        return "WFLYCTL0269: Ungültiges Gebietsschemaformat: %1$s";
    }
    @Override
    protected String attemptToBothAddAndRemoveAndHandlerFromCompositeOperation$str() {
        return "WFLYCTL0323: Ein Versuch wurde unternommen, einen Handler aus einer zusammengesetzten Operation zu entfernen und hinzuzufügen";
    }
    @Override
    protected String attributeNotWritable$str() {
        return "WFLYCTL0048: Attribut %1$s ist nicht schreibbar";
    }
    @Override
    protected String schemaNotFound$str() {
        return "WFLYCTL0178: Kein Schema-Speicherort mit URI %1$s gefunden";
    }
    @Override
    protected String nonexistentInterface$str() {
        return "WFLYCTL0254: Ungültiger Wert '%1$s' für Attribut '%2$s' -- es existiert keine Interface-Konfiguration mit diesem Namen";
    }
    @Override
    protected String invalidModificationAfterCompletedStep$str() {
        return "WFLYCTL0118: Ungültige Änderung nach abgeschlossenem Schritt";
    }
    @Override
    protected String deploymentResourceMustBeRuntimeOnly$str() {
        return "WFLYCTL0373: Deployment-Ressource muss nur Runtime sein";
    }
    @Override
    protected String persisterNotInjected$str() {
        return "WFLYCTL0165: Es wurde kein Konfigurations-Persistierer eingespeist";
    }
    @Override
    protected String cannotCreate$str() {
        return "WFLYCTL0051: Konnte %1$s nicht erstellen";
    }
    @Override
    protected String invalidRuntimeStageForProfile$str() {
        return "WFLYCTL0444: Der Handler für die Operation '%1$s' an der Adresse '%2$s' hat versucht, einen Stage %3$s-Schritt hinzuzufügen. Dies gilt nicht für eine 'Profil'-Ressource auf Prozesstyp %4$s, daher wird dieser Schritt nicht ausgeführt.";
    }
    @Override
    protected String timeoutAwaitingInitialStability0$str() {
        return "WFLYCTL0343: Der Service Container wurde durch eine frühere Operation destabilisiert und weitere Runtime-Updates können nicht bearbeitet werden. Ein Neustart ist erforderlich.";
    }
    @Override
    protected String cannotRemoveRequiredCapabilityInContext$str() {
        return "WFLYCTL0368: Capability '%1$s' kann nicht von Kontext '%2$s' entfernt werden, da sie von anderen Capabilitys benötigt wird:";
    }
    @Override
    protected String configurationFileNameNotAllowed$str() {
        return "WFLYCTL0064: Konfigurationsdateien, deren vollständiger Name %1$s ist, sind nicht zulässig";
    }
    @Override
    protected String streamWasClosed$str() {
        return "WFLYCTL0274: Stream wurde geschlossen";
    }
    @Override
    protected String alreadyDeclared4$str() {
        return "WFLYCTL0041: Ein bereits deklariertes %1$s %2$s wurde schon in %3$s %4$s deklariert";
    }
    @Override
    protected String stageAlreadyComplete$str() {
        return "WFLYCTL0188: Schritt %1$s ist bereits abgeschlossen";
    }
    @Override
    protected String ignoreYamlSubElement$str() {
        return "Deshalb wird das Element '%1$s' ignoriert.";
    }
    @Override
    protected String illegalPermissionActions$str() {
        return "WFLYCTL0382: Unzulässige Berechtigungsaktionen '%1$s'";
    }
    @Override
    protected String proxiedOperationTimedOut$str() {
        return "WFLYCTL0409: Während der Ausführung von Operation '%1$s' auf dem Remote-Prozess an Adresse '%2$s' trat beim Warten auf Erstantwort ein Timeout nach %3$d ms auf; der Remote-Prozess wurde benachrichtigt, dass die Operation beendet werden soll";
    }
    @Override
    protected String unableToResolveExpressions$str() {
        return "WFLYCTL0374: Ausdrücke an diesem Speicherort können nicht aufgelöst werden.";
    }
    @Override
    protected String couldNotDeleteFile$str() {
        return "WFLYCTL0276: Löschung von Datei %1$s fehlgeschlagen";
    }
    @Override
    protected String validationFailedInvalidElementType$str() {
        return "WFLYCTL0238: %1$s wird als Liste von %2$s. %3$s erwartet";
    }
    @Override
    protected String noResourceRegistered1$str() {
        return "WFLYCTL0488: Keine Registrierung für Adresse %1$s gefunden - Teilbaum wird ignoriert";
    }
    @Override
    protected String noOperationHandler2$str() {
        return "WFLYCTL0290: Kein Operations-Handler namens '%1$s' unter '%2$s' registriert";
    }
    @Override
    protected String responseHandlerNotFound$str() {
        return "WFLYCTL0353: Kein Response-Handler für Anforderung %1$s";
    }
    @Override
    protected String handlerIsReferencedBy$str() {
        return "WFLYCTL0319: Der Handler wird von %1$s referenziert und kann daher nicht entfernt werden";
    }
    @Override
    protected String serviceStatusReportMissing$str() {
        return "%1$s (fehlende) Dependents: %2$s %n";
    }
    @Override
    protected String cannotRemoveRequiredCapability$str() {
        return "WFLYCTL0367: Capability '%1$s' kann nicht entfernt werden, da sie von anderen Capabilitys benötigt wird:";
    }
    @Override
    protected String cliScriptPropertyDefinedWithoutMarkerDirectoryWhenNotSkippingReload$str() {
        return "WFLYCTL0464: Wenn Sie %1$s=true verwenden, müssen Sie bei der Verwendung von -D%2$s die Option -D%3$s festlegen";
    }
    @Override
    protected String immutableResource$str() {
        return "WFLYCTL0096: Ressource ist unveränderlich";
    }
    @Override
    protected String unsupportedIdentityParameter$str() {
        return "WFLYCTL0338: Nicht unterstützter Identitätsparameter \"%1$X\" bei Parsen von Identitätstyp \"%2$X\" empfangen.";
    }
    @Override
    protected String serverResultsAccessNotAllowed$str() {
        return "WFLYCTL0250: Ein Operation-Handler hat versucht, auf die Antwortergebnisse des Servers der Operation über einen Prozesstyp zuzugreifen, der nicht '%1$s' ist. Der aktuelle Prozesstyp ist '%2$s'";
    }
    @Override
    protected String namespaceNotFound$str() {
        return "WFLYCTL0139: Kein Namespace mit URI %1$s gefunden";
    }
    @Override
    protected String noOperationHandler0$str() {
        return "WFLYCTL0150: Kein Operation-Handler";
    }
    @Override
    protected String transformerLoggerSubsystemModelOperationTransformerAttributes$str() {
        return "WFLYCTL0297: Transformiere Operation %1$s an Ressource %2$s zu Subsystem '%3$s' Modellversion '%4$s' -- %5$s %6$s";
    }
    @Override
    protected String cannotRename$str() {
        return "WFLYCTL0056: Konnte %1$s nicht in %2$s umbenennen";
    }
    @Override
    protected String operationRollingBack$str() {
        return "WFLYCTL0160: Operation wird zurückgesetzt";
    }
    @Override
    protected String rejectedResourceResourceTransformation$str() {
        return "WFLYCTL0303: Ressource %1$s wird am Zielhost abgelehnt und wird am Host ignoriert";
    }
    @Override
    protected String mainFileNotFound$str() {
        return "WFLYCTL0214: Die Konfigurationsdatei konnte nicht geladen werden: %1$s. Das Argument für die Konfigurationsdatei muss den Pfad zu einer Datei angeben, die sich im Konfigurationsverzeichnis befindet. Der Pfad muss ein relativer Pfad sein und sich auf das Konfigurationsverzeichnis %2$s beziehen.";
    }
    @Override
    protected String invalidDescriptionRequiredFlagIsNotABoolean$str() {
        return "WFLYCTL0239: \"required\"-Parameter: \"%1$s\" muss ein boolescher Wert in der Beschreibung unter %2$s: %3$s sein";
    }
    @Override
    protected String cannotDeleteFileOrDirectory$str() {
        return "WFLYCTL0440: Datei oder Verzeichnis '%1$s' kann nicht gelöscht werden";
    }
    @Override
    protected String fullServerBootRequired$str() {
        return "WFLYCTL0092: %1$s kann außer bei einem vollen Server-Boot nicht verwendet werden";
    }
    @Override
    protected String interruptedWaitingStability$str() {
        return "WFLYCTL0027: Operation wurde unterbrochen, bevor die Service Container-Stabilität erreicht werden konnte. Prozess muss neu gestartet werden. Schritt, der den Service Container zuerst aktualisierte, war '%1$s' an Adresse '%2$s'";
    }
    @Override
    protected String discoveryOptionsMustBeDeclared$str() {
        return "WFLYCTL0305: Wenn der Host-Controller nicht mit der Befehlszeilenoption %1$s gestartet wurde und das %2$s-Attribut nicht auf %3$s festgelegt ist, muss %4$s deklariert werden oder %5$s und %6$s müssen bereitgestellt werden.";
    }
    @Override
    protected String resourceNotFound$str() {
        return "WFLYCTL0175: Ressource %1$s existiert nicht; eine Ressource an Adresse %2$s kann erst erstellt werden, wenn alle Vorgängerressourcen hinzugefügt wurden";
    }
    @Override
    protected String noAttributeSetForAddress$str() {
        return "WFLYCTL0490: Für die Adresse %1$s wurde eine YAML-Ressource ohne Attribut definiert. Es werden keine Aktionen ausgeführt.";
    }
    @Override
    protected String unexpectedElement1$str() {
        return "WFLYCTL0198: Unerwartetes Element '%1$s' gefunden";
    }
    @Override
    protected String couldNotBackUp$str() {
        return "WFLYCTL0321: Backup von '%1$s' auf '%2$s' fehlgeschlagen";
    }
    @Override
    protected String reloadingServerToNormalModeAfterAdditionalBootCliScript$str() {
        return "WFLYCTL0470: Neustart des Servers in den Normalmodus nach Ausführung der zusätzlichen Befehle aus dem CLI-Skript. Dadurch werden die Eigenschaften, die die zusätzliche Boot-CLI-Skriptfunktionalität auslösen, gelöscht, falls sie festgelegt waren (%1$s, %2$s, %3$s), und die Markierungsdatei, die anzeigt, dass der Server neu gestartet wurde, wird gelöscht";
    }
    @Override
    protected String failedToMarshalConfiguration$str() {
        return "WFLYCTL0084: Marshallen der Konfiguration fehlgeschlagen";
    }
    @Override
    protected String attributeNames$str() {
        return "Attribute %1$s";
    }
    @Override
    protected String multipleMatchingAddresses5$str() {
        return "WFLYCTL0022: Mehrere Adressen oder Netzwerk-Interfaces stimmen mit den Auswahlkriterien für Interface '%1$s' überein. Übereinstimmende Adressen: %2$s. Übereinstimmende Interfaces: %3$s. Das Interface verwendet Adresse %4$s und Netzwerk-Interface %5$s.";
    }
    @Override
    protected String cannotRemoveReadOnlyPath$str() {
        return "WFLYCTL0262: Pfad \"%1$s\" ist schreibgeschützt; er kann nicht entfernt werden";
    }
    @Override
    protected String failedToEmitNotification$str() {
        return "WFLYCTL0356: Senden von Benachrichtigung %1$s fehlgeschlagen";
    }
    @Override
    protected String subsystemBootOperationFailedExecuting$str() {
        return "WFLYCTL0193: Ausführung der Boot-Operationen für Subsystem %1$s fehlgeschlagen";
    }
    @Override
    protected String wildcardOperationFailedAtSingleAddress$str() {
        return "WFLYCTL0285: Für mehrere Zieladressen aufgerufene Operation %1$s ist an Adresse %2$s mit der Fehlerbeschreibung %3$s fehlgeschlagen";
    }
    @Override
    protected String duplicateElement$str() {
        return "WFLYCTL0071: Doppeltes Pfadelement '%1$s' gefunden";
    }
    @Override
    protected String operationDeprecated$str() {
        return "WFLYCTL0395: Die Operation '%1$s' für die Ressource an Adresse '%2$s' ist veraltet und wird ggf. aus zukünftigen Versionen entfernt. Siehe die Ausgabe der Operation 'read-operation-description', um mehr darüber zu erfahren.";
    }
    @Override
    protected String gracefulManagementChannelHandlerShutdownTimedOut$str() {
        return "WFLYCTL0019: Das Herunterfahren des für native Verwaltungsanforderungen verwendeten Handlers wurde nicht innerhalb von [%1$d] ms abgeschlossen. Das Herunterfahren des zugrunde liegenden Kommunikations-Channels wird jedoch fortgesetzt";
    }
    @Override
    protected String attemptToBothRemoveAndAddHandlerReferenceFromCompositeOperation$str() {
        return "WFLYCTL0325: Ein Versuch wurde unternommen, einen Handler aus einer zusammengesetzten Operation zu entfernen und hinzuzufügen";
    }
    @Override
    protected String illegalValueForInterfaceCriteria$str() {
        return "WFLYCTL0095: Unzulässiger Wert %1$s für Interface-Kriterien %2$s; muss %3$s sein";
    }
    @Override
    protected String duplicateDeclaration2$str() {
        return "WFLYCTL0070: Doppelte %1$s Deklaration %2$s";
    }
    @Override
    protected String invalidBlockingTimeout$str() {
        return "WFLYCTL0342: Unzulässiger Wert %1$d für Operations-Header %2$s; Wert muss größer als null sein";
    }
    @Override
    protected String transformerLoggerSubsystemModelResourceTransformerAttributes$str() {
        return "WFLYCTL0296: Transformiere Resource %1$s zu Subsystem '%2$s' Modellversion '%3$s' -- %4$s %5$s";
    }
    @Override
    protected String cannotDetermineDefaultName$str() {
        return "WFLYCTL0050: Kann basierend auf dem lokalen Hostnamen keinen Standardnamen bestimmen";
    }
    @Override
    protected String unsupportedElement$str() {
        return "WFLYCTL0371: Das Element '%1$s' wird nicht mehr unterstützt, verwenden Sie stattdessen '%2$s'";
    }
    @Override
    protected String cannotRegisterSubmodelWithNullPath$str() {
        return "WFLYCTL0053: Kann Untermodelle nicht mit einem Null PathElement registrieren";
    }
    @Override
    protected String invalidOutboundSocketBinding$str() {
        return "WFLYCTL0120: Ein Outbound Socket Binding: %1$s kann nicht sowohl %2$s als auch ein %3$s gleichzeitig haben";
    }
    @Override
    protected String failedToParseConfiguration$str() {
        return "WFLYCTL0085: Parsen der Konfiguration fehlgeschlagen";
    }
    @Override
    protected String servicesWithTransitiveUnavailability$str() {
        return "WFLYCTL0448: %1$s zusätzliche Dienste sind aufgrund fehlender oder fehlgeschlagener Abhängigkeiten nicht verfügbar";
    }
    @Override
    protected String failedToPublishConfigurationInvalidRemote$str() {
        return "WFLYCTL0503: Konfiguration konnte nicht veröffentlicht werden, da der Remote-Name %1$s nicht gültig ist.";
    }
    @Override
    protected String moduleLoadingInterrupted$str() {
        return "WFLYCTL0135: Unterbrechung, Warten auf das Laden von Modul %1$s";
    }
    @Override
    protected String badUriSyntax$str() {
        return "WFLYCTL0341: Ein URI mit nicht ordnungsgemäßer Syntax '%1$s' wurde zur Validierung übergeben.";
    }
    @Override
    protected String reconnectToSyslogFailed$str() {
        return "WFLYCTL0355: Erneute Verbindung mit Syslog-Handler '%1$s' fehlgeschlagen";
    }
    @Override
    protected String invalidChannelCloseTimeout$str() {
        return "WFLYCTL0021: Ungültiger Wert '%1$s' für Systemeigenschaft '%2$s' -- Wert muss in int konvertierbar sein";
    }
    @Override
    protected String failedToDeleteConfigurationSnapshot$str() {
        return "WFLYCTL0453: Konfigurations-Schnappschuss %1$s konnte nicht gelöscht werden";
    }
    @Override
    protected String failedInitializingModule$str() {
        return "WFLYCTL0079: Initialisierung des Moduls %1$s fehlgeschlagen";
    }
    @Override
    protected String rejectEmptyConfig$str() {
        return "WFLYCTL0389: Leere Konfiguration in Datei %1$s konnte nicht erstellt werden, da es dort bereits eine nicht leere Konfiguration gibt";
    }
    @Override
    protected String unsupportedUsageOfExpression$str() {
        return "; Diese nicht auflösbare Fähigkeit ist wahrscheinlich auf die Verwendung einer Ausdruckszeichenfolge in einem Konfigurationsattribut zurückzuführen, das keine Ausdrücke unterstützt.";
    }
    @Override
    protected String unexpectedValueForResource$str() {
        return "WFLYCTL0491: Wir haben einen unerwarteten Wert %1$s für die Adresse %2$s und den Namen %3$s";
    }
    @Override
    protected String noContextToDelegateTo$str() {
        return "WFLYCTL0312: Kein zu delegierender Kontext mit ID: %1$s";
    }
    @Override
    protected String couldNotResolveExpressionList$str() {
        return "WFLYCTL0392: Attributausdruck konnte nicht aufgelöst werden: '%1$s', Typ ist keine Liste";
    }
    @Override
    protected String invalid1$str() {
        return "WFLYCTL0099: %1$s ist ungültig";
    }
    @Override
    protected String operationCancelled$str() {
        return "WFLYCTL0271: Operation abgebrochen";
    }
    @Override
    protected String invalidDefaultBlockingTimeout$str() {
        return "WFLYCTL0346: Ungültiger Wert %1$s für Eigenschaft %2$s; muss ein numerischer Wert größer null sein. Der Standardwert %3$d wird verwendet.";
    }
    @Override
    protected String cannotRemove$str() {
        return "WFLYCTL0055: Kann %1$s nicht entfernen";
    }
    @Override
    protected String failedServices$str() {
        return "WFLYCTL0080: Fehlgeschlagene Dienste";
    }
    @Override
    protected String invalidMaxValue$str() {
        return "WFLYCTL0116: [%1$d] ist kein gültiger Wert für Parameter %2$s. Eine maximaler Wert von %3$d ist erforderlich";
    }
    @Override
    protected String transformationWarnings$str() {
        return "WFLYCTL0032: Es sind während des Transformationsprozesses für den Zielhost aufgetreten: \"%1$s\" %nProblems found: %n%2$s";
    }
    @Override
    protected String invalid2$str() {
        return "WFLYCTL0100: %1$d ist kein gültiges %2$s";
    }
    @Override
    protected String unknownCriteriaInterfaceProperty$str() {
        return "WFLYCTL0203: Unbekannte Eigenschaft in Interface-Kriterienliste: %1$s";
    }
    @Override
    protected String managementUnavailableDuringBoot$str() {
        return "WFLYCTL0379: System-Boot ist im Gange; Ausführung von Remote Management Operations ist derzeit nicht verfügbar";
    }
    @Override
    protected String resolvedFileDoesNotExistOrIsDirectory$str() {
        return "WFLYCTL0320: Die aufgelöste Datei %1$s existiert entweder nicht oder ist ein Verzeichnis";
    }
    @Override
    protected String operationHandlerFailed$str() {
        return "WFLYCTL0158: Operation-Handler fehlgeschlagen: %1$s";
    }
    @Override
    protected String illegalUnresolvedModel$str() {
        return "WFLYCTL0298: Knoten enthält einen nicht aufgelösten Ausdruck %1$s -- ein aufgelöstes Modell ist erforderlich";
    }
    @Override
    protected String possibleCapabilityProviderPoints$str() {
        return "; Mögliche Registrierungspunkte für diese Capability: %1$s";
    }
    @Override
    protected String subsystemBootOperationFailed$str() {
        return "WFLYCTL0192: Bootvorgänge für Subsystem %1$s sind ohne Erklärung fehlgeschlagen";
    }
    @Override
    protected String validationFailedRequiredParameterNotPresent$str() {
        return "WFLYCTL0231: Erforderlicher Parameter %1$s ist nicht vorhanden. %2$s";
    }
    @Override
    protected String multipleMatchingAddresses3$str() {
        return "WFLYCTL0023: Wert '%1$s' für Interface-Auswahlkriterium \"inet-address\" ist nicht eindeutig, da mehr als eine auf dem Rechner verfügbare Adresse oder ein Netzwerk-Interface damit übereinstimmt. Aufgrund dieser Ambiguität wird keine Adresse als Übereinstimmung ausgewählt. Übereinstimmende Adressen: %2$s. Übereinstimmende Netzwerk-Interfaces: %3$s.";
    }
    @Override
    protected String modelUpdateNotAuthorized$str() {
        return "WFLYCTL0249: Operation '%1$s' mit Ressource '%2$s' als Ziel wurde von einem Benutzer direkt aufgerufen. Benutzeroperationen ist es nicht zulässig, die persistente Konfiguration eines Servers in einer gemanagten Domain zu aktualisieren.";
    }
    @Override
    protected String cannotRemovePathWithDependencies$str() {
        return "WFLYCTL0267: Pfad '%1$s' kann nicht entfernt werden, da die folgenden Pfade von ihm abhängen: %2$s";
    }
    @Override
    protected String propertyCanOnlyBeUsedWithStandaloneOrEmbeddedServer$str() {
        return "WFLYCTL0460: Die Systemeigenschaft '%1$s' kann nur mit einem Standalone- oder Embedded-Server verwendet werden";
    }
    @Override
    protected String serviceStatusReportHeader$str() {
        return "WFLYCTL0183: Dienst-Statusbericht%n";
    }
    @Override
    protected String completedRunningBootCliScript$str() {
        return "WFLYCTL0468: Beendet die Ausführung der Befehle aus dem CLI-Skript";
    }
    @Override
    protected String roleIsAlreadyRegistered$str() {
        return "WFLYCTL0330: Rolle '%1$s' ist bereits registriert";
    }
    @Override
    protected String expressionUnresolvableUsingSimpleResolution$str() {
        return "WFLYCTL0480: Der Ausdruck '%1$s' kann nicht mit den nicht sicherheitsrelevanten Auflösungsquellen aufgelöst werden, die von der Operation '%2$s' unterstützt werden. In der Antwort wird der nicht aufgelöste Wert angegeben.";
    }
    @Override
    protected String unexpectedEndElement$str() {
        return "WFLYCTL0199: Auf unerwartetes Ende von Element \"%1$s\" getroffen";
    }
    @Override
    protected String removingExtensionWithRegisteredSubsystem$str() {
        return "WFLYCTL0219: Es wurde versucht, die Erweiterung %1$s zu deregistrieren, bei der noch das Subsystem %2$s registriert ist";
    }
    @Override
    protected String unexpectedElement2$str() {
        return "WFLYCTL0377: Unerwartetes Element '%1$s'. Gültige Elemente sind: '%2$s'";
    }
    @Override
    protected String threadDumpException$str() {
        return "WFLYCTL0498: Ausnahme, die bei der Generierung eines Thread Dump ausgelöst wurde";
    }
    @Override
    protected String inconsistentCapabilityContexts5$str() {
        return "WFLYCTL0400: Capability '%1$s' im Kontext '%2$s' zugehörig zur Ressource '%3$s' erfordert die Capability '%4$s'. Sie ist in einer oder mehreren Socket-Binding-Gruppen verfügbar, doch nicht alle von '%5$s' erforderlichen Socket-Binding-Capabilitys können von einer einzelnen Socket-Binding-Gruppe aufgelöst werden, also ist diese Konfiguration ungültig";
    }
    @Override
    protected String multipleModelNodes$str() {
        return "WFLYCTL0137: Modell enthält mehrere %1$s Knoten";
    }
    @Override
    protected String failedToWriteConfiguration$str() {
        return "WFLYCTL0089: Schreiben der Konfiguration fehlgeschlagen";
    }
    @Override
    protected String invalidMinBytesLength$str() {
        return "WFLYCTL0420: '%1$s' ist kein gültiger Wert für Parameter %2$s. Werte müssen eine minimale Länge von %3$d Byte haben";
    }
    @Override
    protected String operation$str() {
        return "Operation %1$s";
    }
    @Override
    protected String directoryNotFound$str() {
        return "WFLYCTL0066: Kein Verzeichnis %1$s gefunden";
    }
    @Override
    protected String failedToPersistConfiguration$str() {
        return "WFLYCTL0452: Konfiguration konnte in %1$s nicht in beibehalten werden wegen %2$s";
    }
    @Override
    protected String unknownCapability$str() {
        return "WFLYCTL0364: Capability '%1$s' ist unbekannt.";
    }
    @Override
    protected String couldntConvertWarningLevel$str() {
        return "WFLYCTL0438: '%1$s' konnte nicht in die richtige Warnstufe konvertiert werden, Grenzwert wird auf 'ALL' zurückgesetzt. Mögliche Werte: SEVERE,WARNING,INFO,CONFIG,FINE,FINER,FINEST,ALL,OFF";
    }
    @Override
    protected String invalidPathElementKey$str() {
        return "WFLYCTL0110: Ungültiges Ressourcenadresselement '%1$s'.Der Schlüssel '%2$s' ist für ein Element in einer Ressourcenadresse nicht gültig.";
    }
    @Override
    protected String noHandlerCalled$str() {
        return "WFLYCTL0317: Kein Handler namens '%1$s' vorhanden";
    }
    @Override
    protected String failedToPersistConfigurationChange0$str() {
        return "WFLYCTL0008: Persistierung der Konfigurationsänderung fehlgeschlagen";
    }
    @Override
    protected String unknownCriteriaInterfaceType$str() {
        return "WFLYCTL0204: Unbekannter Interface-Kriterientyp: %1$s";
    }
    @Override
    protected String invalidType$str() {
        return "WFLYCTL0127: Ungültiger Typ %1$s";
    }
    @Override
    protected String alreadyRegistered$str() {
        return "WFLYCTL0043: Ein %1$s namens '%2$s' ist bereits an Speicherort '%3$s' registriert";
    }
    @Override
    protected String nestedElementNotAllowed$str() {
        return "WFLYCTL0140: Verschachtelte %1$s nicht zulässig";
    }
    @Override
    protected String duplicateResourceAddress$str() {
        return "WFLYCTL0212: Doppelte Ressource %1$s";
    }
    @Override
    protected String cannotHaveBothParameters$str() {
        return "WFLYCTL0275: Kann nicht sowohl '%1$s' als auch '%2$s' definieren";
    }
    @Override
    protected String configurationFileNotFound$str() {
        return "WFLYCTL0065: Keine auf %1$s endende Konfigurationsdatei in %2$s gefunden";
    }
    @Override
    protected String cantHaveSameCriteriaForBothNotAndInclusion$str() {
        return "WFLYCTL0253: Für 'not' und 'inclusion' %1$s können nicht die gleichen Kriterien verwendet werden";
    }
    @Override
    protected String invalidModuleNameParameter$str() {
        return "WFLYCTL0516: Parameter %1$s gibt ungültigen Modulnamen an: %2$s";
    }
    @Override
    protected String noOperationEntry$str() {
        return "WFLYCTL0289: Kein Operationseintrag namens '%1$s' unter '%2$s' registriert";
    }
    @Override
    protected String moduleInitializationInterrupted$str() {
        return "WFLYCTL0136: Unterbrechung, Warten auf die Initialisierung von Modul %1$s";
    }
    @Override
    protected String notificationIsNotDescribed$str() {
        return "WFLYCTL0357: Benachrichtigung vom Typ %1$s ist nicht für die Ressource unter der Adresse %2$s beschrieben";
    }
    @Override
    protected String ignoreYamlElement$str() {
        return "WFLYCTL0508: Das YAML-Element '%1$s' und seine Unterelemente werden ignoriert.";
    }
    @Override
    protected String unsupportedNamespace$str() {
        return "WFLYCTL0513: Der XML-Namespace von %1$s wird nicht mehr unterstützt.";
    }
    @Override
    protected String validationFailedValueIsGreaterThanMax$str() {
        return "WFLYCTL0235: Der Wert '%1$s' für '%2$s' ist größer als der Höchstwert '%3$s'. %4$s";
    }
    @Override
    protected String operationSucceeded$str() {
        return "WFLYCTL0161: Operation erfolgreich, schreibe fest";
    }
    @Override
    protected String disablingLogHandlerDueToFailures$str() {
        return "WFLYCTL0038: [%1$d] aufeinanderfolgende Management-Operation Audit-Protokollierungsfehler sind in Handler '%2$s' aufgetreten; Deaktivierung dieses Handlers von Audit-Protokollierung";
    }
    @Override
    protected String duplicateDeclaration1$str() {
        return "WFLYCTL0069: Doppelte %1$s Deklaration";
    }
    @Override
    protected String invalidMinLength$str() {
        return "WFLYCTL0113: \"%1$s\" ist kein gültiger Wert für Parameter %2$s. Werte müssen eine minimale Länge von %3$d Zeichen haben";
    }
    @Override
    protected String failedToStoreConfiguration$str() {
        return "WFLYCTL0009: Speicherung der Konfiguration in %1$s fehlgeschlagen";
    }
    @Override
    protected String resolverExtensionExpressionsNotAllowed$str() {
        return "WFLYCTL0494: Auflösung des Erweiterungsausdrucks '%1$s' ist an dieser Stelle nicht zulässig.";
    }
    @Override
    protected String permissionDenied$str() {
        return "WFLYCTL0332: Berechtigung verweigert";
    }
    @Override
    protected String invalidStepStage$str() {
        return "WFLYCTL0124: Ungültiger Schritt festgelegt";
    }
    @Override
    protected String rejectAttributesCoreModelResourceTransformer$str() {
        return "WFLYCTL0299: Transformiere Ressource %1$s für Host Controller '%2$s' zu Kernmodellversion '%3$s' -- Es gab Probleme mit einigen der Attribute und diese Ressource wird an diesem Host ignoriert. Einzelheiten zu den Problemen: %4$s";
    }
    @Override
    protected String unknownInterface$str() {
        return "WFLYCTL0205: Unbekanntes Interface %1$s %2$s muss in Element %3$s deklariert sein";
    }
    @Override
    protected String couldNotLoadModuleForTransformers$str() {
        return "WFLYCTL0422: Modul '%1$s' für Transformer konnte nicht geladen werden";
    }
    @Override
    protected String missingTransitiveDependents$str() {
        return "Dienste, deren Start nicht möglich war:";
    }
    @Override
    protected String schemaAlreadyRegistered$str() {
        return "WFLYCTL0177: Schema mit URI %1$s ist bereits an Speicherort %2$s registriert";
    }
    @Override
    protected String validationFailedActualParameterNotDescribed$str() {
        return "WFLYCTL0230: Operation enthält einen Parameter '%1$s', der keiner der erwarteten Parameter ist %2$s. %3$s";
    }
    @Override
    protected String discardedResourceTransformation$str() {
        return "WFLYCTL0396: Ressource %1$s wird auf Zielhost %2$s verworfen";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYCTL0133: Fehlende(s) erforderliche(s) Attribut(e): %1$s";
    }
    @Override
    protected String canonicalMainFileNotFound$str() {
        return "WFLYCTL0060: Erhalt einer vorschriftsmäßigen Datei für Hauptdatei nicht möglich: %1$s";
    }
    @Override
    protected String uuidIsEmpty$str() {
        return "WFLYCTL0500: Es gibt keine UUID-Zeichenkette unter '%1$s'. Es wird ein neuer Wert generiert.";
    }
    @Override
    protected String expressionNotAllowed$str() {
        return "WFLYCTL0264: %1$s darf nicht ModelType.EXPRESSION sein";
    }
    @Override
    protected String missingTransitiveDependencies$str() {
        return "Dienste, die die Ursache sein können:";
    }
    @Override
    protected String cannotDelete$str() {
        return "WFLYCTL0052: Konnte %1$s nicht löschen";
    }
    @Override
    protected String resourceWasRemoved$str() {
        return "WFLYCTL0359: Die Ressource wurde an Adresse %1$s entfernt.";
    }
    @Override
    protected String serviceStatusReportAvailable$str() {
        return "%1$s (neu verfügbar)%n";
    }
    @Override
    protected String removeUnsupportedLegacyExtension$str() {
        return "WFLYCTL0402: Subsysteme %1$s, die von der veralteten Erweiterung \"%2$s\" bereitgestellt werden, werden von Servern dieser Version nicht unterstützt. Sowohl das Subsystem als auch die Erweiterung müssen entfernt oder migriert werden, ehe der Server funktioniert.";
    }
    @Override
    protected String failedSendingFailedResponse$str() {
        return "WFLYCTL0408: Senden von Fehler-Antwort %1$s für %2$d konnte nicht gesendet werden";
    }
    @Override
    protected String removingServiceUnsatisfiedDependencies0$str() {
        return "WFLYCTL0171: Entfernung von Diensten hat zu unbefriedigten Abhängigkeiten geführt:";
    }
    @Override
    protected String operationNotRegistered$str() {
        return "WFLYCTL0162: Es ist keine Operation %1$s registriert unter Adresse %2$s";
    }
    @Override
    protected String unstableSubsystemNamespace$str() {
        return "WFLYCTL0505: %1$s-Subsystem-Namespace %2$s wird durch die aktuelle Stabilitätsstufe nicht ermöglicht";
    }
    @Override
    protected String failedToRecoverServices$str() {
        return "WFLYCTL0225: Wiederherstellung von Diensten während Zurücksetzen der Operation fehlgeschlagen";
    }
    @Override
    protected String requirementPointFull$str() {
        return "Capability '%1$s' erfordert dies für Attribut '%2$s' unter Adresse '%3$s'";
    }
    @Override
    protected String childResourceNotFound$str() {
        return "WFLYCTL0217: Untergeordnete Ressource '%1$s' nicht gefunden";
    }
    @Override
    protected String invalidParameterName$str() {
        return "WFLYCTL0477: Parametername '%1$s' ist ungültig.";
    }
    @Override
    protected String unexpectedOperationExecutionException$str() {
        return "WFLYCTL0403: Unerwarteter Fehler bei der Ausführung der folgenden Operationen: %1$s";
    }
    @Override
    protected String errorBootingContainer0$str() {
        return "WFLYCTL0002: Fehler beim Booten des Containers";
    }
    @Override
    protected String childAlreadyDeclared$str() {
        return "WFLYCTL0058: Untergeordnetes %1$s von Element %2$s bereits deklariert";
    }
    @Override
    protected String validationFailedNoOperationFound$str() {
        return "WFLYCTL0229: Keine Operation namens \"%1$s\" unter \"%2$s\". %3$s";
    }
    @Override
    protected String interruptedAwaitingFinalResponse$str() {
        return "WFLYCTL0351: Die Ausführung von Operation '%1$s' für Remote-Prozess an Adresse '%2$s' wurde beim Warten auf finale Antwort unterbrochen; der Remote-Prozess wurde benachrichtigt, dass die Operation beendet werden soll";
    }
    @Override
    protected String attributeValueWritten$str() {
        return "WFLYCTL0360: Der Wert des Attributs %1$s wurde von %2$s zu %3$s geändert.";
    }
    @Override
    protected String restartingServerAfterBootCliScript$str() {
        return "WFLYCTL0469: Server wird neu gestartet, da die zusätzlichen Befehle aus dem CLI-Skript einen Neustart erfordern. Dadurch wird in der Statusdatei %1$s festgehalten, dass der Neustart eingeleitet wurde, da der Neustart-Mechanismus alle Eigenschaften beibehält, die sich auf die zusätzliche Boot-CLI-Skriptfunktionalität beziehen (%2$s, %3$s, %4$s). Der Neustart behält den Nur-Admin-Modus bei, so dass ein anschließendes Neuladen erfolgt";
    }
    @Override
    protected String invalidMulticastAddress$str() {
        return "WFLYCTL0119: Wert %1$s für Attribut %2$s ist keine gültige Multicast-Adresse";
    }
    @Override
    protected String cantHaveBothLoopbackAndInetAddressCriteria$str() {
        return "WFLYCTL0251: Loopback und inet-Adresskriterien nicht beide möglich";
    }
    @Override
    protected String invalidAttributeValue2$str() {
        return "WFLYCTL0106: Ungültiger Wert '%1$s' für Attribut '%2$s'";
    }
    @Override
    protected String operationAlreadyComplete$str() {
        return "WFLYCTL0157: Operation bereits abgeschlossen";
    }
    @Override
    protected String foundRestartMarkerFile$str() {
        return "WFLYCTL0473: Statusdatei, die angibt, dass der Server neu gestartet wurde, nachdem die zusätzlichen Befehle aus dem CLI-Skript unter %1$s ausgeführt wurden";
    }
    @Override
    protected String unsupportedIdentityType$str() {
        return "WFLYCTL0337: Nicht unterstützter Identitätstyp \"%1$X\" empfangen.";
    }
    @Override
    protected String alreadyDeclared5$str() {
        return "WFLYCTL0042: Ein bereits deklariertes %1$s oder ein %2$s %3$s wurde schon in %4$s %5$s deklariert";
    }
    @Override
    protected String nullAsynchronousExecutor$str() {
        return "WFLYCTL0154: Kann asynchrone Operation nicht ohne einen Executor ausführen";
    }
    @Override
    protected String compositeOperationRolledBack$str() {
        return "WFLYCTL0063: Zusammengesetzte Operation wurde zurückgesetzt";
    }
    @Override
    protected String couldNotMarshalAttributeAsAttribute$str() {
        return "WFLYCTL0284: Marshalling von Attribut als Attribut nicht möglich: %1$s";
    }
    @Override
    protected String deprecatedAndCurrentParameterMismatch$str() {
        return "WFLYCTL0413: Der veraltete Parameter %1$s wurde zusätzlich zum aktuellen Parameter %2$s festgelegt, jedoch mit unterschiedlichen Werten";
    }
    @Override
    protected String validationFailedRequiredParameterPresentAsWellAsAlternative$str() {
        return "WFLYCTL0232: Alternativer Parameter '%1$s' für erforderlichen Parameter '%2$s' wurde verwendet. Bitte verwenden Sie entweder den einen oder den anderen. %3$s";
    }
    @Override
    protected String requirementPointSimple$str() {
        return "Capability '%1$s' erfordert dies für Adresse '%2$s'";
    }
    @Override
    protected String attemptToBothUpdateAndRemoveHandlerFromCompositeOperation$str() {
        return "WFLYCTL0324: Ein Versuch wurde unternommen, einen Handler aus einer zusammengesetzten Operation zu aktualisieren und zu entfernen";
    }
    @Override
    protected String extensionModuleNotFound$str() {
        return "WFLYCTL0310: Erweiterungsmodul %1$s nicht gefunden";
    }
    @Override
    protected String disablingLoggingDueToFailures$str() {
        return "WFLYCTL0036: [%1$d] aufeinanderfolgende Management-Operation Audit-Protokollierungsfehler sind aufgetreten; Deaktivierung von Audit-Protokollierung";
    }
    @Override
    protected String noPermissionToResolveExpression$str() {
        return "WFLYCTL0210: SecurityException abgefangen beim Versuch der Auflösung des Ausdrucks \"%1$s\" -- %2$s";
    }
    @Override
    protected String streamWasKilled$str() {
        return "WFLYCTL0273: Stream wurde abgebrochen";
    }
    @Override
    protected String unstableManagementNamespace$str() {
        return "WFLYCTL0514: Der Verwaltungsnamespace %1$s wird durch die aktuelle Stabilitätsstufe nicht ermöglicht";
    }
    @Override
    protected String duplicateResourceType$str() {
        return "WFLYCTL0076: Doppelter Ressourcentyp %1$s";
    }
    @Override
    protected String propertyCanOnlyBeUsedWithAdminOnlyModeServer$str() {
        return "WFLYCTL0461: Die Systemeigenschaft '%1$s' kann nur mit einem reinen Admin-Server verwendet werden";
    }
    @Override
    protected String executingBootCliScript$str() {
        return "WFLYCTL0467: Ausführen der zusätzlichen Befehle aus dem CLI-Skript %1$s für den Server, der im reinen Admin-Modus läuft";
    }
    @Override
    protected String absolutePathMainFileNotFound$str() {
        return "WFLYCTL0215: Die Konfigurationsdatei konnte nicht geladen werden: %1$s. Das Argument für die Konfigurationsdatei muss eine der folgenden Angaben enthalten: 1) absoluter Pfad zu einer vorhandenen Datei, 2) relativer Pfad zu einer vorhandenen Datei, relativ zum aktuellen Arbeitsverzeichnis oder 3) relativer Pfad zu einer Datei, die sich im Konfigurationsverzeichnis befindet. In letzterem Fall muss es sich um einen Pfad relativ zum Konfigurationsverzeichnis %2$s handeln.";
    }
    @Override
    protected String invalidDescriptionMinMaxLengthForParameterHasWrongType$str() {
        return "WFLYCTL0244: Das Attribut '%1$s' des Parameters '%2$s' kann nicht in einen Integer in der Beschreibung der Operation unter %3$s: %4$s konvertiert werden";
    }
    @Override
    protected String duplicateResource$str() {
        return "WFLYCTL0075: Doppelte Ressource %1$s";
    }
    @Override
    protected String serviceInstallTimedOut$str() {
        return "WFLYCTL0345: Timeout nach %1$d Sekunden des Wartens auf Entfernung des bestehenden Dienstes %2$s, damit eine neue Instanz installiert werden kann.";
    }
    @Override
    protected String invalidSubnetFormat$str() {
        return "WFLYCTL0439: Wert '%1$s' für Attribut '%2$s' hat kein gültiges Subnetzformat";
    }
    @Override
    protected String failedToLoadModule1$str() {
        return "WFLYCTL0083: Laden des Moduls %1$s fehlgeschlagen";
    }
    @Override
    protected String bootComplete$str() {
        return "WFLYCTL0434: Boot abgeschlossen";
    }
    @Override
    protected String required$str() {
        return "WFLYCTL0172: %1$s ist erforderlich";
    }
    @Override
    protected String validationFailedOperationHasANullOrEmptyName$str() {
        return "WFLYCTL0228: Operation hat keinen (null) oder einen leeren Namen. %1$s";
    }
    @Override
    protected String unknownChildType$str() {
        return "WFLYCTL0202: Kein bekannter untergeordneter Typ namens %1$s";
    }
    @Override
    protected String checkingForPresenceOfRestartMarkerFile$str() {
        return "WFLYCTL0472: Prüfung auf Vorhandensein einer Statusdatei, die angibt, dass der Server nach Ausführung der zusätzlichen Befehle aus dem CLI-Skript neu gestartet wurde";
    }
    @Override
    protected String runtimeModificationBegun$str() {
        return "WFLYCTL0415: Veränderungen des Runtime-Dienst-Containers durch eine Management-Operation wurden begonnen";
    }
    @Override
    protected String attributeIsWrongType$str() {
        return "WFLYCTL0378: Attribut '%1$s' ist nicht vom Typ '%2$s,' sondern vom Typ '%3$s'";
    }
    @Override
    protected String errorRevertingOperation$str() {
        return "WFLYCTL0004: %1$s Ausnahme beim Versuch, die Operation %2$s unter Adresse %3$s rückgängig zu machen";
    }
    @Override
    protected String noResourceRegistered2$str() {
        return "WFLYCTL0492: Keine Ressourcenregistrierung für Adresse %1$s mit aktueller Registrierung %2$s gefunden";
    }
    @Override
    protected String attributeExpressionDeprecated$str() {
        return "WFLYCTL0447: Das Attribut '%1$s' in der Ressource unter der Adresse '%2$s' wurde mit einem Ausdruck konfiguriert; die Unterstützung für die Verwendung von Ausdrücken im Wert dieses Attributs kann in einer zukünftigen Version jedoch entfernt werden. Dieses Attribut konfiguriert, ob eine Capability vorhanden ist, die von anderen Teilen der Konfiguration angefordert werden kann, oder ob die Capability selbst eine Anforderung für eine Capability konfiguriert, die von einem anderen Teil der Konfiguration bereitgestellt wird. Bei Verwendung eines Ausdrucks kann kein vollständiger Support für diese Art von Konfiguration gewährleistet werden.";
    }
    @Override
    protected String illegalOperationForAttribute$str() {
        return "WFLYCTL0510: Keine Operation %1$s kann für das Attribut namens '%2$s' ausgeführt werden, das unter der Adresse '%3$s' definiert ist.";
    }
    @Override
    protected String formattedCapabilityName$str() {
        return "%1$s";
    }
    @Override
    protected String aliasStepHandlerOperationNotFound$str() {
        return "WFLYCTL0280: Keine Operation namens '%1$s' für Aliasadresse '%2$s' gefunden, die '%3$s' zugeordnet ist";
    }
    @Override
    protected String serviceRegistryRuntimeOperationsOnly$str() {
        return "WFLYCTL0181: Dienstabruf-Registry nur bei Runtime Operationen unterstützt";
    }
    @Override
    protected String invalidAddress$str() {
        return "WFLYCTL0101: Ungültige Adresse %1$s (%2$s)";
    }
    @Override
    protected String couldNotMarshalAttributeAsElement$str() {
        return "WFLYCTL0283: Marshalling von Attribut als Element nicht möglich: %1$s";
    }
    @Override
    protected String failedExecutingOperation$str() {
        return "WFLYCTL0005: Ausführung von Operation %1$s an Adresse %2$s fehlgeschlagen";
    }
    @Override
    protected String managementResourceNotFoundMessage$str() {
        return "WFLYCTL0335: Management-Ressource '%1$s' nicht gefunden";
    }
    @Override
    protected String missingListAttributeValueType$str() {
        return "WFLYCTL0493: Für Attribut %1$s ist kein valueType richtig definiert.";
    }
    @Override
    protected String serviceStatusReportCorrected$str() {
        return "WFLYCTL0185: Frisch korrigierte Dienste:%n";
    }
    @Override
    protected String couldNotResolveExpressionIndex$str() {
        return "WFLYCTL0391: Attributausdruck konnte nicht aufgelöst werden: '%1$s', ungültiger Index '%2$d'";
    }
    @Override
    protected String attributeDeprecated$str() {
        return "WFLYCTL0028: Attribut '%1$s' in der Ressource unter der Adresse '%2$s' ist veraltet und wird aus zukünftigen Versionen ggf. entfernt. Siehe Attributbeschreibung in der Ausgabe der \"read-resource-description\"-Operation, um mehr darüber zu erfahren.";
    }
    @Override
    protected String cannotWriteTo$str() {
        return "WFLYCTL0057: Kann nicht in %1$s schreiben";
    }
    @Override
    protected String incompatiblePermissionType$str() {
        return "WFLYCTL0334: Inkompatibler Berechtigungstyp %1$s";
    }
    @Override
    protected String capabilityAlreadyRegisteredInContext4$str() {
        return "WFLYCTL0436: Capability '%1$s' kann nicht an Speicherort '%2$s' registriert werden, da sie bereits im Kontext '%3$s' an Speicherort(en) '%4$s' registriert ist";
    }
    @Override
    protected String wildcardAddressDetected$str() {
        return "WFLYCTL0015: Platzhalter-Adresse gefunden - andere Interface-Kriterien werden ignoriert.";
    }
    @Override
    protected String invalidMinSize$str() {
        return "WFLYCTL0115: [%1$d] ist keine gültige Größe für Parameter %2$s. Eine minimale Länge von [%3$d] ist erforderlich";
    }
    @Override
    protected String failedSendingCompletedResponse$str() {
        return "WFLYCTL0407: Senden von Abschluss-Antwort %1$s für %2$d konnte nicht gesendet werden";
    }
    @Override
    protected String disallowedHeaderName$str() {
        return "WFLYCTL0458: Unzulässiger HTTP-Header-Name '%1$s'";
    }
    @Override
    protected String unknownValueForElement$str() {
        return "WFLYCTL0206: Unbekanntes %1$s %2$s %3$s muss in Element %4$s deklariert sein";
    }
    @Override
    protected String transformerLoggerCoreModelResourceTransformerAttributes$str() {
        return "WFLYCTL0294: Transformiere Resource %1$s zur Kernmodellversion '%2$s' -- %3$s %4$s";
    }
    @Override
    protected String unknownCapabilityInContext$str() {
        return "WFLYCTL0365: Capability '%1$s' ist unbekannt in Kontext '%2$s'.";
    }
    @Override
    protected String attributesMustBeDefinedAs$str() {
        return "WFLYCTL0339: Die folgenden Attribute müssen als %1$s im aktuellen Modell definiert sein: %2$s";
    }
    @Override
    protected String multipleParallelBootOperation$str() {
        return "WFLYCTL0517: Es gibt mehrere parallele Startoperationen.";
    }
    @Override
    protected String incorrectType$str() {
        return "WFLYCTL0097: Falscher Typ für \"%1$s\". Erwartet wurde %2$s, erhalten wurde %3$s";
    }
    @Override
    protected String serviceStatusReportFailureHeader$str() {
        return "WFLYCTL0441: Operation hat dazu geführt, dass Dienste fehlerhaft sind oder fehlen: %n";
    }
    @Override
    protected String failedToRenameTempFile$str() {
        return "WFLYCTL0268: Umbenennung der temp-Datei %1$s in %2$s fehlgeschlagen";
    }
    @Override
    protected String capabilitiesNotAvailable$str() {
        return "WFLYCTL0361: Capabilitys können in Phase '%1$s' nicht abgerufen werden; sie sind erst in Phase '%2$s' verfügbar.";
    }
    @Override
    protected String capabilityAlreadyRegisteredInContext2$str() {
        return "WFLYCTL0363: Capability '%1$s' ist bereits in Kontext '%2$s' registriert.";
    }
    @Override
    protected String errorObtainingPassword$str() {
        return "WFLYCTL0443: Fehler beim Abrufen des Passworts vom Anbieter %1$s";
    }
    @Override
    protected String cannotResolveExpression$str() {
        return "WFLYCTL0211: Kann Ausdruck nicht auflösen '%1$s'";
    }
    @Override
    protected String managementResourceNotFound$str() {
        return "WFLYCTL0216: Management-Ressource '%1$s' nicht gefunden";
    }
    @Override
    protected String failedToPublishConfiguration$str() {
        return "WFLYCTL0451: Konfiguration konnte in %1$s nicht veröffentlicht werden wegen %2$s";
    }
    @Override
    protected String gracefulManagementChannelHandlerShutdownFailed$str() {
        return "WFLYCTL0020: Das Herunterfahren des für native Verwaltungsanfragen verwendeten Handlers ist fehlgeschlagen, aber das Herunterfahren des zugrunde liegenden Kommunikations-Channels schreitet fort";
    }
    @Override
    protected String unexpectedAttribute2$str() {
        return "WFLYCTL0376: Unerwartetes Attribut '%1$s'. Gültige Attribute sind: '%2$s'";
    }
    @Override
    protected String duplicateSubsystem$str() {
        return "WFLYCTL0226: Ein Subsystem namens '%1$s' kann nicht durch die Erweiterung '%2$s' deregistriert werden -- Ein Subsystem mit diesem Namen wurde bereits durch die Erweiterung '%3$s' registriert.";
    }
    @Override
    protected String resourceWasAdded$str() {
        return "WFLYCTL0358: Die Ressource wurde an Adresse %1$s hinzugefügt.";
    }
    @Override
    protected String wrongMaskedPasswordFormat$str() {
        return "WFLYCTL0423: Maskierter Passwortbefehl weist das falsche Format auf.%nVerwendung: MASK-<encoded secret>;<salt>;<iteration count>, wobei <salt>=UTF-8-Zeichen, <iteration count>=angemessene positive Ganzzahl";
    }
    @Override
    protected String attributesMustNotBeDefinedAs$str() {
        return "WFLYCTL0340: Die folgenden Attribute dürfen NICHT als %1$s im aktuellen Modell definiert sein: %2$s";
    }
    @Override
    protected String invalidStage$str() {
        return "WFLYCTL0123: Schritt %1$s ist nicht gültig für Kontext-Prozesstyp %2$s";
    }
    @Override
    protected String alreadyDefinedAttribute$str() {
        return "WFLYCTL0445: %1$s mit dem Wert '%2$s' in Attribut %3$s ist bereits definiert";
    }
    @Override
    protected String permissionCollectionIsReadOnly$str() {
        return "WFLYCTL0333: Kann keine Berechtigung zu einer PermissionCollection hinzufügen";
    }
    @Override
    protected String canonicalBootFileNotFound$str() {
        return "WFLYCTL0059: Erhalt einer vorschriftsmäßigen Datei für Boot-Datei nicht möglich: %1$s";
    }
    @Override
    protected String invalidAddressMaskValue$str() {
        return "WFLYCTL0102: Ungültiger 'value' %1$s -- muss das Format Adresse/Maske haben";
    }
    @Override
    protected String removingUnexistingResource$str() {
        return "WFLYCTL0512: Unter der Adresse '%1$s' ist keine Ressource vorhanden. Entfernungsvorgang wird ignoriert.";
    }
    @Override
    protected String attributesAreNotUnderstoodAndMustBeIgnored1$str() {
        return "WFLYCTL0302: Die folgenden Attribute werden von der Zielmodellversion nicht verstanden und diese Ressource wird am Zielhost ignoriert: %1$s";
    }
    @Override
    protected String loadingYamlFiles$str() {
        return "WFLYCTL0487: Es dauerte %1$s ms, um die folgenden YAML-Dateien zu laden und zu analysieren [%2$s]";
    }
    @Override
    protected String attributeUnresolvableUsingSimpleResolution$str() {
        return "WFLYCTL0479: Attribut '%1$s' bei Ressource '%2$s' mit nicht aufgelöstem Wert '%3$s' kann nicht mit den nicht sicherheitsrelevanten Auflösungsquellen aufgelöst werden, die vom Parameter 'resolve' unterstützt werden. In der Antwort wird der nicht aufgelöste Wert angegeben.";
    }
    @Override
    protected String domainControllerMustBeDeclared$str() {
        return "WFLYCTL0067: Es muss entweder eine %1$s oder eine %2$s Domain-Controller Konfiguration deklariert werden.";
    }
    @Override
    protected String requiredAttributeNotSet$str() {
        return "WFLYCTL0380: Attribut '%1$s' muss eingestellt oder weitergegeben werden, bevor Attribut '%2$s' korrekt eingestellt werden kann";
    }
    @Override
    protected String couldNotResolveExpression$str() {
        return "WFLYCTL0393: Attributausdruck konnte nicht aufgelöst werden: '%1$s'";
    }
    @Override
    protected String missingTransitiveDependencyProblem$str() {
        return "WFLYCTL0288: Einer oder mehrere Dienste konnten wegen der Nichtverfügbarkeit von einer oder mehreren indirekten Abhängigkeiten nicht gestartet werden.";
    }
    @Override
    protected String unstableExtension$str() {
        return "WFLYCTL0506: Erweiterung %1$s vom Modul %2$s wird durch die aktuelle Stabilitätsstufe nicht ermöglicht";
    }
    @Override
    protected String operationCancelledAsynchronously$str() {
        return "WFLYCTL0272: Operation asynchron abgebrochen";
    }
    @Override
    protected String duplicateNamedElement$str() {
        return "WFLYCTL0073: Ein Element dieses Typs namens '%1$s' wurde bereits deklariert";
    }
    @Override
    protected String fileNotFound$str() {
        return "WFLYCTL0090: %1$s existiert nicht";
    }
    @Override
    protected String unknownRole$str() {
        return "WFLYCTL0327: Unbekannte Rolle '%1$s'";
    }
    @Override
    protected String missingOperationForResource$str() {
        return "WFLYCTL0504: Die Operation %1$s ist für die Ressource %2$s nicht definiert.";
    }
}
