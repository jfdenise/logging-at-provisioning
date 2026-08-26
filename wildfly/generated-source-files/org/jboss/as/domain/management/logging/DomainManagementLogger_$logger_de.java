package org.jboss.as.domain.management.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:14+0200")
public class DomainManagementLogger_$logger_de extends DomainManagementLogger_$logger implements DomainManagementLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DomainManagementLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String passwordMustHaveSymbolInfo$str() {
        return "%1$s nicht-alphanumerische(s) Sonderzeichen";
    }
    @Override
    protected String argHelp$str() {
        return "Diese Nachricht anzeigen und beenden";
    }
    @Override
    protected String usernamePrompt0$str() {
        return "Benutzername";
    }
    @Override
    protected String handlerAlreadyExists$str() {
        return "WFLYDM0063: Handler-Namen müssen eindeutig sein. Es gibt bereits einen Handler namens '%1$s' an %2$s";
    }
    @Override
    protected String failedToGenerateSelfSignedCertificate$str() {
        return "WFLYDM0112: Selbstsigniertes Zertifikat konnte nicht generiert werden";
    }
    @Override
    protected String invalidChoiceUpdateUserResponse$str() {
        return "WFLYDM0070: Ungültige Antwort. (Gültige Antworten sind A, a, B, b, C oder c)";
    }
    @Override
    protected String argServerConfigDirUsers$str() {
        return "Definieren Sie sen Speicherort des server config Verzeichnisses.";
    }
    @Override
    protected String multipleAuthenticationMechanismsDefined$str() {
        return "WFLYDM0033: Konfiguration für Sicherheitsbereich '%1$s' beinhaltet mehrere Benutzernamen/Passwort-basierte Authentifizierungsmechanismen (%2$s). Nur einer ist zulässig";
    }
    @Override
    protected String passwordUsernameMustMatchInfo$str() {
        return "Das Passwort muss sich vom Benutzernamen unterscheiden";
    }
    @Override
    protected String addedGroups$str() {
        return "Benutzer '%1$s' mit Gruppen %2$s zu Datei '%3$s' hinzugefügt";
    }
    @Override
    protected String sysLogProtocolAlreadyConfigured$str() {
        return "WFLYDM0059: Es ist bereits ein Protokoll für den Syslog-Handler an %1$s konfiguriert";
    }
    @Override
    protected String multipleRealmDeclarations$str() {
        return "Benutzereigenschaftendatei '%1$s' enthält mehrere Bereichsnamendeklarationen";
    }
    @Override
    protected String realmPrompt$str() {
        return "Bereich (%1$s)";
    }
    @Override
    protected String passwordRequirements$str() {
        return "Passwortanforderungen sind unten angeführt. Um diese Einschränkungen zu ändern, bearbeiten Sie die add-user.properties Konfigurationsdatei.";
    }
    @Override
    protected String badBaseRole$str() {
        return "WFLYDM0081: Die Basisrolle '%1$s' ist keine der Standardrollen für den derzeitigen Autorisierungsanbieter.";
    }
    @Override
    protected String suffixContainsMillis$str() {
        return "WFLYDM0104: Das Suffix (%1$s) kann keine Sekunden oder Millisekunden enthalten.";
    }
    @Override
    protected String passwordShouldNotEqualInfo$str() {
        return "Das Passwort sollte keiner der folgenden eingeschränkten Werte sein {%1$s}";
    }
    @Override
    protected String argEnable$str() {
        return "Benutzer aktivieren";
    }
    @Override
    protected String aliasNotKey$str() {
        return "WFLYDM0084: Das vom Alias angegebene '%1$s' ist kein Schlüssel, gültige Aliasnamen sind %2$s";
    }
    @Override
    protected String multipleGroupSearchConfigurationsDefined$str() {
        return "WFLYDM0075: Konfiguration für Sicherheitsbereich '%1$s' beinhaltet mehrere group-search-Ressourcen innerhalb der authorization=ldap Ressource (%2$s). Nur eine ist zulässig";
    }
    @Override
    protected String passwordShouldContainInfo$str() {
        return "Passwort sollte mindestens %1$s haben";
    }
    @Override
    protected String yesNo$str() {
        return "ja/nein?";
    }
    @Override
    protected String failedToCreateLazyInitSSLContext$str() {
        return "WFLYDM0114: Verzögertes Initialisieren von SSL-Kontext fehlgeschlagen";
    }
    @Override
    protected String alternativeRealm$str() {
        return "Der angegebene Bereichsname muss mit dem von der Serverkonfiguration verwendeten Namen übereinstimmen, der standardmäßig '%1$s' lautet";
    }
    @Override
    protected String invalidConfirmationResponse$str() {
        return "WFLYDM0029: Ungültige Antwort. (Gültige Antworten sind %1$s und %2$s)";
    }
    @Override
    protected String realmMustBeSpecified$str() {
        return "WFLYDM0067: Es muss ein Bereichsname festgelegt werden.";
    }
    @Override
    protected String keystoreHasBeenCreated$str() {
        return "WFLYDM0113: In %1$s wurde ein selbstsigniertes Zertifikat generiert. Beachten Sie, dass selbstsignierte Zertifikate nicht sicher sind und nur zu Testzwecken verwendet werden sollten. Verwenden Sie dieses selbstsignierte Zertifikat nicht in der Produktion.%nSHA-1-Fingerabdruck des generierten Schlüssels ist %2$s.%nSHA-256-Fingerabdruck des generierten Schlüssels ist %3$s";
    }
    @Override
    protected String passwordConfirmationPrompt$str() {
        return "Passwort erneut eingeben";
    }
    @Override
    protected String aboutToUpdateEnabledUser$str() {
        return "Benutzer \"%1$s\" existiert bereits. Möchten Sie %n a) das bestehende Benutzerpasswort und die Rollen aktualisieren, %n b) den vorhandenen Benutzer deaktivieren %n c) oder einen neuen Benutzernamen eingeben";
    }
    @Override
    protected String unableToLoadProperties$str() {
        return "WFLYDM0017: Kann Properties nicht laden";
    }
    @Override
    protected String userSuppliedRealm$str() {
        return "Verwendung von Bereich '%1$s' wie in der Befehlszeile festgelegt.";
    }
    @Override
    protected String unableToLoadPlugInProviders$str() {
        return "WFLYDM0045: Kann Plug-in für Modul %1$s nicht laden aufgrund von Fehler (%2$s)";
    }
    @Override
    protected String aliasNotFound$str() {
        return "WFLYDM0085: Das vom Alias angegebene '%1$s' existiert nicht im KeyStore, gültige Aliasnamen sind %2$s";
    }
    @Override
    protected String unableToLoadSimpleNameForGroup$str() {
        return "WFLYDM0110: Einfacher Name für Gruppe '%1$s' konnte nicht geladen werden";
    }
    @Override
    protected String unableToAddUser$str() {
        return "WFLYDM0030: Kann Benutzer nicht zu %1$s hinzufügen aufgrund von Fehler %2$s";
    }
    @Override
    protected String noNonProgressingOperationFound$str() {
        return "WFLYDM0089: Es wurde keine Operation gefunden, die die Schreibsperre der Operationsausführung für länger als [%1$d] Sekunden hielt";
    }
    @Override
    protected String noHandlerCalled$str() {
        return "WFLYDM0058: Kein Handler namens '%1$s' vorhanden";
    }
    @Override
    protected String passwordUsernameShouldNotMatch$str() {
        return "WFLYDM0098: Das Passwort sollte sich vom Benutzernamen unterscheiden";
    }
    @Override
    protected String passwordMustHaveDigit$str() {
        return "WFLYDM0050: Passwort muss mindestens %1$d Ziffer haben.";
    }
    @Override
    protected String imcompatibleConfiguredRequiresAttributeValue$str() {
        return "WFLYDM0144: Die Sensitivitätseinschränkung %1$s enthält einen Attributwert, der mit anderen Einschränkungen für die Sensitivitätsklassifizierung nicht kompatibel ist.";
    }
    @Override
    protected String passwordMustNotEqualInfo$str() {
        return "Das Passwort darf keiner der folgenden eingeschränkten Werte sein {%1$s}";
    }
    @Override
    protected String no$str() {
        return "Nein";
    }
    @Override
    protected String outboundConnectionsUnsupported$str() {
        return "WFLYDM0146: Ausgehende Verbindungen werden nicht mehr unterstützt, bitte entfernen Sie diese aus der Konfiguration.";
    }
    @Override
    protected String invalidLocalUser$str() {
        return "WFLYDM0041: Der Benutzer '%1$s' ist in einer lokalen Authentifikation nicht zulässig.";
    }
    @Override
    protected String noGroupSearchDefined$str() {
        return "WFLYDM0074: Konfiguration für Sicherheitsbereich '%1$s' beinhaltet keine group-search Ressource innerhalb der authorization=ldap Ressource.";
    }
    @Override
    protected String passwordShouldHaveSymbol$str() {
        return "WFLYDM0102: Passwort muss mindestens %1$s nicht-alphanumerisches Sonderzeichen haben.";
    }
    @Override
    protected String passwordMustHaveAlphaInfo$str() {
        return "%1$d Buchstaben";
    }
    @Override
    protected String passwordRecommendations$str() {
        return "Passwortempfehlungen sind unten angeführt. Um diese Einschränkungen zu ändern, bearbeiten Sie die add-user.properties Konfigurationsdatei.";
    }
    @Override
    protected String scopedRoleStandardName$str() {
        return "WFLYDM0080: Der Name '%1$s' steht im Konflikt mit dem Standard Rollennamen von '%2$s' – Vergleich unterscheidet Groß- und Kleinschreibung.";
    }
    @Override
    protected String securityRealmsUnsupported$str() {
        return "WFLYDM0145: Sicherheitsbereiche werden nicht mehr unterstützt, bitte entfernen Sie diese aus der Konfiguration.";
    }
    @Override
    protected String userAndPasswordWarning$str() {
        return "WFLYDM0001: Properties-Datei mit Standard-Nutzer und -Passwort, dies ist leicht zu erraten.";
    }
    @Override
    protected String usageDescription$str() {
        return "Das add-user Skript ist ein Dienstprogramm zum Hinzufügen neuer Benutzer zu den Properties-Dateien für integrierte Authentifizierung. Es kann verwendet werden zur Verwaltung von Benutzern im ManagementRealm und ApplicationRealm.";
    }
    @Override
    protected String argConfirmWarning$str() {
        return "Warnung im interaktiven Modus automatisch bestätigen";
    }
    @Override
    protected String unableToUpdateUser$str() {
        return "WFLYDM0040: Kann Benutzer nicht zu %1$s aktualisieren aufgrund von Fehler %2$s";
    }
    @Override
    protected String multipleRealmsDetected$str() {
        return "WFLYDM0064: Verschiedene Bereichsnamen '%1$s', '%2$s' beim Lesen der Benutzereigenschaftsdateien gefunden, alle Bereich müssen gleich sein.";
    }
    @Override
    protected String inconsistentRbacRuntimeState$str() {
        return "WFLYDM0069: Die Runtime Rollen-Mapping Konfiguration ist inkonsistent, der Server muss neu gestartet werden.";
    }
    @Override
    protected String passwordMustNotBeEqual$str() {
        return "WFLYDM0049: Passwort darf nicht gleich '%1$s' sein, dieser Wert ist beschränkt.";
    }
    @Override
    protected String passwordShouldHaveAlpha$str() {
        return "WFLYDM0100: Passwort muss mindestens %1$d alphanumerisches Zeichen haben.";
    }
    @Override
    protected String usernamePrompt1$str() {
        return "Benutzername (%1$s)";
    }
    @Override
    protected String noFormatterCalled$str() {
        return "WFLYDM0061: Kein Formatierer namens '%1$s'";
    }
    @Override
    protected String usernameEasyToGuess$str() {
        return "Der Benutzername '%1$s' ist leicht zu erraten";
    }
    @Override
    protected String invalidKeytab$str() {
        return "WFLYDM0090: Ungültiger Keytab-Pfad";
    }
    @Override
    protected String passwordNotStrongEnough$str() {
        return "WFLYDM0048: Passwort ist nicht sicher genug, es ist '%1$s'. Es muss mindestens '%2$s' sein.";
    }
    @Override
    protected String argDomainConfigDirUsers$str() {
        return "Definieren Sie sen Speicherort des domain config Verzeichnisses.";
    }
    @Override
    protected String passwordMisMatch$str() {
        return "WFLYDM0026: Die Passwörter stimmen nicht überein.";
    }
    @Override
    protected String invalidRoleName$str() {
        return "WFLYDM0076: Der Rollenname '%1$s' ist keine gültige Standardrolle.";
    }
    @Override
    protected String passwordNotLongEnough$str() {
        return "WFLYDM0053: Passwort muss mindestens %1$s Zeichen haben!";
    }
    @Override
    protected String noSyslogProtocol$str() {
        return "WFLYDM0060: Kein Syslog-Protokoll angegeben";
    }
    @Override
    protected String duplicateScopedRole$str() {
        return "WFLYDM0079: Ein %1$s mit dem Namen '%2$s' ist bereits vorhanden";
    }
    @Override
    protected String userRealmNotMatchDiscovered$str() {
        return "WFLYDM0065: Der vom Benutzer angegebene Bereichsname '%1$s' stimmt nicht mit dem von der/den Eigenschaftsdatei(en) '%2$s' aufgefundenen überein.";
    }
    @Override
    protected String invalidChoiceResponse$str() {
        return "WFLYDM0039: Ungültige Antwort. (Gültige Antworten sind A, a, B, or b)";
    }
    @Override
    protected String argUser$str() {
        return "Name des Benutzers";
    }
    @Override
    protected String argUserProperties$str() {
        return "Der Dateiname der Benutzer Properties Datei, der der absolute Pfad sein kann.";
    }
    @Override
    protected String keyStoreNotFound$str() {
        return "WFLYDM0086: Der KeyStore befindet sich unter %1$s";
    }
    @Override
    protected String multipleCallbackHandlerForMechanism$str() {
        return "WFLYDM0042: Mehrere CallbackHandlerServices für denselben Mechanismus (%1$s)";
    }
    @Override
    protected String unableToObtainTGT$str() {
        return "WFLYDM0092: Erhalt von Kerberos TGT nicht möglich";
    }
    @Override
    protected String argPassword$str() {
        return "Passwort des Benutzers, das auf Übereinstimmung mit den in der add-user.properties Konfiguration definierten Anforderungen geprüft wird";
    }
    @Override
    protected String argApplicationUsers$str() {
        return "Falls eingestellt, Hinzufügen eines Applikationsnutzers statt eines Management-Nutzers";
    }
    @Override
    protected String sureToAddUser$str() {
        return "Sind Sie sicher, dass Sie den Benutzer '%1$s' hinzufügen möchten? ja/nein";
    }
    @Override
    protected String unableToOperateOnTrustStore$str() {
        return "WFLYDM0055: Kann nicht am Truststore operieren.";
    }
    @Override
    protected String noCipherSuitesInCommon$str() {
        return "WFLYDM0095: Keine gemeinsamen Cipher Suites, supported=(%1$s), requested=(%2$s)";
    }
    @Override
    protected String shortNo$str() {
        return "n";
    }
    @Override
    protected String aboutToAddUser$str() {
        return "Füge Benutzer '%1$s' für Bereich '%2$s' hinzu";
    }
    @Override
    protected String passwordMustContainInfo$str() {
        return "Passwort muss mindestens %1$s haben";
    }
    @Override
    protected String passwordPrompt$str() {
        return "Passwort";
    }
    @Override
    protected String usernameNotAlphaNumeric$str() {
        return "WFLYDM0028: Der Benutzername darf nur alphanumerische Zeichen enthalten, ausgenommen sind folgende akzeptierte Symbole (%1$s)";
    }
    @Override
    protected String noPlugInProvidersLoaded$str() {
        return "WFLYDM0044: Keine Plug-in-Provider für Modulname %1$s gefunden";
    }
    @Override
    protected String unsupportedResource$str() {
        return "WFLYDM0108: Nicht unterstützte Ressource '%1$s'";
    }
    @Override
    protected String updatedGroups$str() {
        return "Benutzer '%1$s' mit Gruppen %2$s in Datei '%3$s' aktualisiert";
    }
    @Override
    protected String argUsage$str() {
        return "Gebrauch: ./add-user.sh [args...]%n wo args beinhalten:";
    }
    @Override
    protected String isCorrectPrompt$str() {
        return "Ist das korrekt";
    }
    @Override
    protected String multipleUsernameToDnConfigurationsDefined$str() {
        return "WFLYDM0073: Konfiguration für Sicherheitsbereich '%1$s' beinhaltet mehrere username-to-dn-Ressourcen innerhalb der authorization=ldap Ressource (%2$s). Nur eine ist zulässig";
    }
    @Override
    protected String shortYes$str() {
        return "j";
    }
    @Override
    protected String argRealm$str() {
        return "Name des Bereichs, der zur Sicherung der Management-Interfaces verwendet wird (Standard ist \"ManagementRealm\")";
    }
    @Override
    protected String cannotRemoveReferencedFormatter$str() {
        return "WFLYDM0062: Kann Formatierer nicht entfernen, dieser wird noch von Handler '%1$s' referenziert";
    }
    @Override
    protected String usingDeprecatedSystemProperty$str() {
        return "WFLYDM0140: Die Systemeigenschaft '%1$s' sollte nicht verwendet werden, da sie veraltet ist. Verwenden Sie stattdessen die Konfiguration des Management-Modells.";
    }
    @Override
    protected String invalidRoleNameDomain$str() {
        return "WFLYDM0077: Der Rollenname '%1$s' ist keine gültige Standardrolle und ist keine Host-begrenzte Rolle oder eine Servergruppen-begrenzte Rolle.";
    }
    @Override
    protected String filePrompt$str() {
        return "Welchen Typ von Benutzer möchten Sie hinzufügen? %n a) Management-Benutzer (mgmt-users.properties) %n b) Applikationsbenutzer (application-users.properties)";
    }
    @Override
    protected String filePermissionsProblemsFound$str() {
        return "WFLYDM0106: Beim Aktualisieren der Datei %1$s sind Probleme mit den Dateiberechtigungen festgestellt worden.";
    }
    @Override
    protected String onlyOneSyslogHandlerProtocol$str() {
        return "WFLYDM0057: Der Syslog-Handler kann nur ein Protokoll %1$s enthalten";
    }
    @Override
    protected String noUsernameExiting$str() {
        return "WFLYDM0024: Kein Benutzername eingegeben, beende.";
    }
    @Override
    protected String invalidSensitiveClassificationAttribute$str() {
        return "WFLYDM0143: Ungültiges Sensitivitätsklassifizierungsattribut '%1$s'";
    }
    @Override
    protected String errorHeader$str() {
        return "Fehler";
    }
    @Override
    protected String noSecurityContextEstablished$str() {
        return "WFLYDM0037: Es wurde kein Sicherheitskontext etabliert.";
    }
    @Override
    protected String unableToLoadKeyTrustFile$str() {
        return "WFLYDM0054: Key Trust Datei kann nicht geladen werden.";
    }
    @Override
    protected String groupPropertiesButNoUserProperties$str() {
        return "WFLYDM0066: Eine Gruppeneigenschaftsdatei '%1$s' wurde festgelegt, jedoch wurden keine Benutzereigenschaften festgelegt.";
    }
    @Override
    protected String duplicateIncludeExclude$str() {
        return "WFLYDM0071: Rolle '%1$s' enthält bereits ein %2$s für type=%3$s, name=%4$s, realm=%5$s.";
    }
    @Override
    protected String keystoreWillBeCreated$str() {
        return "WFLYDM0111: Keystore %1$s nicht gefunden, er wird automatisch bei der erstmaligen Verwendung mit einem selbstsignierten Zertifikat für Host %2$s generiert";
    }
    @Override
    protected String unableToCreateDelegateTrustManager$str() {
        return "WFLYDM0056: Trust-Manager kann nicht erstellt werden.";
    }
    @Override
    protected String argGroup$str() {
        return "Durch Kommas getrennte Liste von Gruppen für den Benutzer.";
    }
    @Override
    protected String passwordMustHaveAlpha$str() {
        return "WFLYDM0052: Passwort muss mindestens %1$d alphanumerisches Zeichen haben.";
    }
    @Override
    protected String noPasswordExiting$str() {
        return "WFLYDM0025: Kein Passwort eingegeben, beende.";
    }
    @Override
    protected String passwordShouldHaveXCharacters$str() {
        return "WFLYDM0099: Passwort muss mindestens %1$s Zeichen haben!";
    }
    @Override
    protected String noConsoleAvailable$str() {
        return "WFLYDM0021: Keine java.io.Console zur Interaktion mit dem Nutzer verfügbar.";
    }
    @Override
    protected String unableToObtainCredential$str() {
        return "Erhalt von Anmeldedaten für Server %1$s nicht möglich";
    }
    @Override
    protected String invalidSize$str() {
        return "WFLYDM0103: Ungültige Größe %1$s";
    }
    @Override
    protected String unableToLoadUsers$str() {
        return "WFLYDM0031: Kann Benutzer nicht aus %1$s laden aufgrund von Fehler %2$s";
    }
    @Override
    protected String roleMappingRemaining$str() {
        return "WFLYDM0078: Die begrenzte Rolle '%1$s' kann nicht entfernt werden, da noch ein Rollen-Mapping existiert.";
    }
    @Override
    protected String passwordUsernameShouldMatchInfo$str() {
        return "Das Passwort sollte sich vom Benutzernamen unterscheiden";
    }
    @Override
    protected String passwordShouldHaveDigit$str() {
        return "WFLYDM0101: Passwort muss mindestens eine %1$d Ziffer haben.";
    }
    @Override
    protected String operationFailedOneOfRequired$str() {
        return "WFLYDM0034: Entweder '%1$s' oder '%2$s' wird benötigt.";
    }
    @Override
    protected String noCallbackHandlerForMechanism$str() {
        return "WFLYDM0043: Kein CallbackHandler verfügbar für Mechanismus %1$s in Bereich %2$s";
    }
    @Override
    protected String keyTabFileNotFound$str() {
        return "WFLYDM0109: Die Keytab-Datei '%1$s' existiert nicht.";
    }
    @Override
    protected String removedBrokenResource$str() {
        return "WFLYDM0135: Die Ressource %1$s funktionierte nicht einwandfrei und wurde entfernt.";
    }
    @Override
    protected String inconsistentRbacConfiguration$str() {
        return "WFLYDM0068: Die aktuelle(n) Operation(en) würden in der Aktivierung der rollenbasierten Zugangssteuerung resultieren, aber die Zuweisung von Rollen an authentifizierte Benutzer unmöglich machen.";
    }
    @Override
    protected String invalidSuffix$str() {
        return "WFLYDM0105: Das Suffix (%1$s) ist ungültig. Ein Suffix muss ein gültiges Datumsformat haben.";
    }
    @Override
    protected String usernameNotLoaded$str() {
        return "WFLYDM0088: Benutzername für angegebenen Benutzernamen '%1$s' konnte nicht geladen werden";
    }
    @Override
    protected String propertiesFileNotFound$str() {
        return "WFLYDM0023: Keine %1$s Dateien gefunden.";
    }
    @Override
    protected String groupsPrompt$str() {
        return "Zu welchen Gruppen soll dieser Benutzer gehören? (Bitte geben Sie eine durch Kommas getrennte Liste ein oder lassen Sie sie leer, falls keinen)";
    }
    @Override
    protected String kerberosWithoutKeytab$str() {
        return "WFLYDM0094: Kerberos ist für die Authentifizierung am Sicherheitsbereich '%1$s' aktiviert, aber es wurde der server-identity kein Keytab hinzugefügt.";
    }
    @Override
    protected String passwordMustHaveSymbol$str() {
        return "WFLYDM0051: Passwort muss mindestens %1$s nicht-alphanumerisches Sonderzeichen haben.";
    }
    @Override
    protected String multipleAuthorizationConfigurationsDefined$str() {
        return "WFLYDM0072: Konfiguration für Sicherheitsbereich '%1$s' beinhaltet mehrere Authentifizierungskonfigurationen (%2$s). Nur eine ist zulässig";
    }
    @Override
    protected String operationFailedOnlyOneOfRequired$str() {
        return "WFLYDM0035: Nur entweder '%1$s' oder '%2$s' ist erforderlich.";
    }
    @Override
    protected String multipleCacheConfigurationsDefined$str() {
        return "WFLYDM0087: Konfiguration für Sicherheitsbereich '%1$s' beinhaltet mehrere Cache-Definitionen an derselben Stelle in der Hierarchie. Es ist nur eine zulässig.";
    }
    @Override
    protected String noSubjectIdentityForProtocolAndHost$str() {
        return "WFLYDM0139: Es wurde keine SubjectIdentity gefunden für %1$s/%2$s.";
    }
    @Override
    protected String passwordLengthInfo$str() {
        return "%1$s Zeichen";
    }
    @Override
    protected String noKey$str() {
        return "WFLYDM0083: Der KeyStore %1$s enthält keine Schlüssel.";
    }
    @Override
    protected String domainRolloutNotProgressing$str() {
        return "WFLYDM0107: Operation '%1$s' hält die Schreibsperre bereits seit über [%2$d] Sekunden, ist jedoch Teil des Rollouts einer domainweiten Operation mit domain-uuid '%3$s', die andere Operationen umfasst, die ebenfalls nicht fortschreiten. Deren IDs sind: %4$s. Es wird empfohlen, die Operation auf dem Domain-Controller abzubrechen.";
    }
    @Override
    protected String legacyMechanismsAreNotSupported$str() {
        return "WFLYDM0142: Folgende auf dem Server (%1$s) konfigurierte Mechanismen werden vom Bereich '%2$s' nicht unterstützt.";
    }
    @Override
    protected String callbackHandlerNotInitialized$str() {
        return "Der Callback-Handler für Domain-Server %1$s konnte nicht initialisiert werden.";
    }
    @Override
    protected String subjectIdentityLoggedOut$str() {
        return "WFLYDM0091: Abmeldung wurde bereits an dieser SubjectIdentity aufgerufen.";
    }
    @Override
    protected String passwordMustHaveDigitInfo$str() {
        return "%1$d Ziffer(n)";
    }
    @Override
    protected String argSilent$str() {
        return "Aktivierung des \"silent\"-Modus (keine Ausgabe an der Konsole)";
    }
    @Override
    protected String aboutToUpdateDisabledUser$str() {
        return "Benutzer \"%1$s\" existiert bereits und ist deaktiviert. Möchten Sie %n a) das bestehende Benutzerpasswort und die Rollen aktualisieren, %n b) den vorhandenen Benutzer aktivieren %n c) oder einen neuen Benutzernamen eingeben";
    }
    @Override
    protected String noAuthenticationPlugInFound$str() {
        return "WFLYDM0046: Kein Authentifizierungs-Plug-in für Name %1$s gefunden";
    }
    @Override
    protected String argGroupProperties$str() {
        return "Der Dateiname der Gruppen Properties Datei, der ein absoluter Pfad sein kann. (Falls Gruppen Properties festgelegt, so MÜSSEN Benutzer Properties ebenfalls festgelegt werden).";
    }
    @Override
    protected String realmConfirmation$str() {
        return "Sind Sie sicher, dass Sie den Bereich auf '%1$s' festlegen möchten?";
    }
    @Override
    protected String keytabLoginFailed$str() {
        return "WFLYDM0093: Anmeldung mittels Keytab für Prinzipal '%1$s' zur Handhabung von Anfrage für Host '%2$s' fehlgeschlagen";
    }
    @Override
    protected String discoveredRealm$str() {
        return "Verwendung von Bereich '%1$s' wie von den vorhandenen Eigenschaftsdateien gefunden.";
    }
    @Override
    protected String unableToInitialisePlugIn$str() {
        return "WFLYDM0047: Kann Plug-in %1$s aufgrund von Fehler %2$s nicht initialisieren";
    }
    @Override
    protected String updateUser$str() {
        return "Benutzer '%1$s' in Datei '%2$s' aktualisiert";
    }
    @Override
    protected String noProtocolsInCommon$str() {
        return "WFLYDM0096: Keine gemeinsamen Protokolle, supported=(%1$s), requested=(%2$s)";
    }
    @Override
    protected String sureToSetPassword$str() {
        return "Sind Sie sicher, dass Sie das eingegebene Passwort verwenden wollen ja/nein?";
    }
    @Override
    protected String passwordUsernameMatchError$str() {
        return "WFLYDM0082: Das Passwort muss sich vom Benutzernamen unterscheiden";
    }
    @Override
    protected String passwordShouldNotBeEqual$str() {
        return "WFLYDM0097: Passwort darf nicht gleich '%1$s' sein, dieser Wert ist eingeschränkt.";
    }
    @Override
    protected String enterNewUserDetails$str() {
        return "Informationen des neu hinzuzufügenden Nutzers eingeben.";
    }
    @Override
    protected String yes$str() {
        return "Ja";
    }
    @Override
    protected String addedUser$str() {
        return "Benutzer '%1$s' zu Datei '%2$s' hinzugefügt";
    }
    @Override
    protected String argRole$str() {
        return "Eine durch Kommas getrennte Liste von Rollen für den Benutzer.";
    }
    @Override
    protected String argDisable$str() {
        return "Benutzer deaktivieren";
    }
    @Override
    protected String userNotFoundInDirectory$str() {
        return "WFLYDM0020: Benutzer '%1$s' nicht im Verzeichnis gefunden.";
    }
}
