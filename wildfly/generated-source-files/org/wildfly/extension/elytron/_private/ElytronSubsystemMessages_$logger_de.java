package org.wildfly.extension.elytron._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:16+0200")
public class ElytronSubsystemMessages_$logger_de extends ElytronSubsystemMessages_$logger implements ElytronSubsystemMessages, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ElytronSubsystemMessages_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unableToLoadPropertiesFiles$str() {
        return "WFLYELY00014: Die Eigenschaftendateien, die zum Starten des Eigenschaftendatei-gestützten Bereichs erforderlich sind, konnten nicht geladen werden: Benutzerdatei: '%1$s' Gruppendatei: '%2$s'";
    }
    @Override
    protected String updateDependantServices$str() {
        return "Aktualisierte abhängige Ressourcen als Alias '%1$s' ist nicht mehr vorhanden";
    }
    @Override
    protected String invalidRegularExpression$str() {
        return "WFLYELY00016: Der angegebene reguläre Ausdruck '%1$s' ist ungültig.";
    }
    @Override
    protected String topMostCertificateFromCertificateReplyNotTrusted$str() {
        return "WFLYELY01037: Das oberste Zertifikat aus der Zertifikatsantwort ist nicht vertrauenswürdig. Überprüfen Sie das Zertifikat sorgfältig. Wenn es gültig ist, führen Sie import-certificate erneut aus, wobei die Validierung auf \"false\" gesetzt ist.";
    }
    @Override
    protected String unableToObtainDynamicSSLContext$str() {
        return "WFLYELY01221: DynamicSSLContext kann nicht aus dem bereitgestellten Authentifizierungskontext abgerufen werden.";
    }
    @Override
    protected String couldNotRemoveAttribute$str() {
        return "WFLYELY01010: Entfernen von Attribut fehlgeschlagen.";
    }
    @Override
    protected String suffixContainsMillis$str() {
        return "WFLYELY01019: Das Suffix (%1$s) kann keine Sekunden oder Millisekunden enthalten.";
    }
    @Override
    protected String unableToPerformOutflow$str() {
        return "WFLYELY01015: Automatische Übergabe für '%1$s' kann nicht durchgeführt werden";
    }
    @Override
    protected String keyStoreAliasAlreadyExists$str() {
        return "WFLYELY01036: Alias '%1$s' ist bereits im Keystore vorhanden";
    }
    @Override
    protected String failedToSetPolicy$str() {
        return "WFLYELY01022: Richtlinie [%1$s] konnte nicht festgelegt werden";
    }
    @Override
    protected String cycleDetected$str() {
        return "WFLYELY00043: Es wurde ein Zyklus zur Initialisierung der Ressourcen erkannt – %1$s";
    }
    @Override
    protected String reloadDependantServices$str() {
        return "Abhängige Dienste neu laden, die möglicherweise bereits den geheimen Wert zwischengespeichert haben";
    }
    @Override
    protected String failedToStoreGeneratedSelfSignedCertificate$str() {
        return "WFLYELY01082: Generiertes selbstsigniertes Zertifikat konnte nicht gespeichert werden";
    }
    @Override
    protected String unableToCompleteOperation$str() {
        return "WFLYELY00009: Operation konnte nicht abgeschlossen werden. '%1$s'";
    }
    @Override
    protected String providerLoaderCannotSupplyProvider$str() {
        return "WFLYELY00914: Provider-Ladeprogramm '%1$s' kann keinen Anmeldedatenspeicher-Provider vom Typ '%2$s' bereitstellen";
    }
    @Override
    protected String unableToCreateCredentialStoreImmediately$str() {
        return "WFLYELY00924: Es konnte kein sofort verfügbarer Anmeldedatenspeicher erstellt werden.";
    }
    @Override
    protected String trustedCertificateAlreadyInKeyStore$str() {
        return "WFLYELY01038: Vertrauenswürdiges Zertifikat ist bereits in Keystore unter dem Alias '%1$s' vorhanden";
    }
    @Override
    protected String identityNotAuthorized$str() {
        return "WFLYELY01004: Identität mit Namen [%1$s] ist nicht autorisiert.";
    }
    @Override
    protected String propertyFileIsInvalid$str() {
        return "WFLYELY00025: Referenzierte Eigenschaftendatei ist ungültig: %1$s";
    }
    @Override
    protected String unableToChangeAccountKeyWithCertificateAuthority$str() {
        return "WFLYELY01044: Der mit der Zertifizierungsstelle %1$s verknüpfte Kontoschlüssel kann nicht geändert werden";
    }
    @Override
    protected String componentNotConfigurable$str() {
        return "WFLYELY00015: Die benutzerdefinierte Komponentenimplementierung '%1$s' implementiert die Methode 'initialize(Map<String, String>)' nicht, die Konfiguration wurde jedoch bereitgestellt.";
    }
    @Override
    protected String defaultRealmNotReferenced$str() {
        return "WFLYELY00013: Der Standardbereich '%1$s' ist nicht in der Liste der Bereiche [%2$s] enthalten, die von dieser Domäne referenziert wird.";
    }
    @Override
    protected String invalidCertificateAuthorityChallenge$str() {
        return "WFLYELY01050: Ungültige Abfrage der Zertifizierungsstelle";
    }
    @Override
    protected String letsEncryptNameNotAllowed$str() {
        return "WFLYELY01063: Die Zertifizierungsstelle von LetsEncrypt ist standardmäßig konfiguriert.";
    }
    @Override
    protected String couldNotObtainAuthorizationIdentity$str() {
        return "WFLYELY01008: Autorisierungsidentität konnte nicht abgerufen werden.";
    }
    @Override
    protected String unableToDetectKeyStore$str() {
        return "WFLYELY01059: KeyStore '%1$s' kann nicht erkannt werden";
    }
    @Override
    protected String unableToLoadModule$str() {
        return "WFLYELY00035: Modul '%1$s' konnte nicht geladen werden.";
    }
    @Override
    protected String unableToTransformMultipleRealms$str() {
        return "WFLYELY00042: Mehrere 'authorization-realms' können nicht in den Einzelwert umgewandelt werden";
    }
    @Override
    protected String unableToEncryptClearText$str() {
        return "WFLYELY00923: Der bereitgestellte Klartext kann nicht verschlüsselt werden.";
    }
    @Override
    protected String invalidNotBefore$str() {
        return "WFLYELY01028: Ungültiger Wert für 'not-before': %1$s";
    }
    @Override
    protected String noResolverSpecifiedAndNoDefault$str() {
        return "WFLYELY01200: Der Name des zu verwendenden Resolvers wurde nicht angegeben und es wurde kein Standard-Resolver definiert.";
    }
    @Override
    protected String cantSaveWithoutFile$str() {
        return "WFLYELY00010: KeyStore konnte nicht gespeichert werden – KeyStore-Datei '%1$s' ist nicht vorhanden.";
    }
    @Override
    protected String unableToReloadCredentialStore$str() {
        return "WFLYELY00925: Der Anmeldedatenspeicher kann nicht neu geladen werden.";
    }
    @Override
    protected String filesystemMissingKeypair$str() {
        return "WFLYELY01215: Im Dateisystembereich fehlt eine Schlüsselpaar-Konfiguration, die Integritätsprüfung ist nicht aktiviert";
    }
    @Override
    protected String nonexistingKeyStoreMissingType$str() {
        return "WFLYELY01080: Ein nicht vorhandener Keystore muss einen definierten Typ haben.";
    }
    @Override
    protected String unableToCreateManagerFactory$str() {
        return "WFLYELY00018: '%1$s' kann für Algorithmus '%2$s' nicht erstellt werden.";
    }
    @Override
    protected String unableToTransformTornAttribute$str() {
        return "WFLYELY00041: Konfiguration kann nicht in Zielversion umgewandelt werden – Attribut '%1$s' unterscheidet sich von '%2$s'";
    }
    @Override
    protected String keyStoreMissingAlias$str() {
        return "WFLYELY01218: Der vom Dateisystembereich verwendete Schlüsselspeicher enthält den Alias nicht: %1$s";
    }
    @Override
    protected String noTypeFound$str() {
        return "WFLYELY00019: Kein '%1$s' in eingespeistem Wert gefunden.";
    }
    @Override
    protected String cachedRealmServiceNotAvailable$str() {
        return "WFLYELY00050: Der Bereich ist nicht verfügbar. Sie können den Cache nicht leeren.";
    }
    @Override
    protected String missingCertificateAuthorityChallenge$str() {
        return "WFLYELY01088: Fehlende Abfrage der Zertifizierungsstelle";
    }
    @Override
    protected String unableToVerifyIntegrity$str() {
        return "WFLYELY01214: Die Integrität des Dateisystembereichs konnte nicht überprüft werden: %1$s";
    }
    @Override
    protected String duplicateRealmInjection$str() {
        return "WFLYELY00002: Der Bereich '%1$s' kann nicht erneut in eine bestimmte Sicherheitsdomäne eingespeist werden.";
    }
    @Override
    protected String failedToLoadCallbackhandlerFromProvidedModule$str() {
        return "WFLYELY00045: CallbackHandler konnte nicht aus dem angegebenen Modul geladen werden.";
    }
    @Override
    protected String hostContextMapHostnameContainsCaret$str() {
        return "WFLYELY01087: Der Hostname im SNI-Mapping darf das Zeichen ^ nicht enthalten.";
    }
    @Override
    protected String certificateFileDoesNotExist$str() {
        return "WFLYELY01041: Zertifikatsdatei existiert nicht";
    }
    @Override
    protected String unableToUpdateCertificateAuthorityAccountKeyStore$str() {
        return "WFLYELY01048: Keystore für das mit der Zertifizierungsstelle verknüpfte Konto %1$s kann nicht aktualisiert werden";
    }
    @Override
    protected String unableToObtainCertificate$str() {
        return "WFLYELY01032: Zertifikat für Alias '%1$s' kann nicht abgerufen werden";
    }
    @Override
    protected String invalidCertificateRevocationReason$str() {
        return "WFLYELY01051: Ungültiger Zertifikatssperrgrund '%1$s'";
    }
    @Override
    protected String invalidAttributeValue$str() {
        return "WFLYELY01062: Wert für Attribut '%1$s' ist ungültig.";
    }
    @Override
    protected String keyStoreFileNotExistsButIgnored$str() {
        return "WFLYELY00023: KeyStore-Datei '%1$s' ist nicht vorhanden. Leere verwendet.";
    }
    @Override
    protected String credentialCannotBeResolved$str() {
        return "WFLYELY00916: Anmeldedaten können nicht aufgelöst werden";
    }
    @Override
    protected String unableToRespondToCertificateAuthorityChallenge$str() {
        return "WFLYELY01049: Auf Abfrage der Zertifizierungsstelle %1$s kann nicht reagiert werden";
    }
    @Override
    protected String unableToAccessEntryFromKeyStore$str() {
        return "WFLYELY00033: Zugriff auf Eintrag [%1$s] aus Schlüsselspeicher [%2$s] nicht möglich.";
    }
    @Override
    protected String jaasEntryNotDefined$str() {
        return "WFLYELY00049: Eintrag ist nicht definiert.";
    }
    @Override
    protected String couldNotReadIdentity2$str() {
        return "WFLYELY01005: Identität [%1$s] konnte nicht aus Sicherheitsdomäne [%2$s] gelesen werden.";
    }
    @Override
    protected String unableToObtainPrivateKey$str() {
        return "WFLYELY01031: Privater Schlüssel für Alias '%1$s' kann nicht abgerufen werden";
    }
    @Override
    protected String unableToLoadModuleRuntime$str() {
        return "WFLYELY01079: Modul '%1$s' konnte nicht geladen werden.";
    }
    @Override
    protected String invalidCipherSuiteFilter$str() {
        return "WFLYELY01017: Ungültiger Wert für Cipher-Suite-Filter. %1$s";
    }
    @Override
    protected String representationOfX500IsRequired$str() {
        return "WFLYELY00048: Eine Zeichenfolgendarstellung eines eindeutigen X.500-Namens ist erforderlich: %1$s";
    }
    @Override
    protected String unableToDetermineIfCertificateIsTrusted$str() {
        return "WFLYELY01040: Es konnte nicht festgestellt werden, ob das Zertifikat vertrauenswürdig ist. Überprüfen Sie das Zertifikat sorgfältig. Wenn es gültig ist, führen Sie import-certificate erneut aus, wobei die Validierung auf \"false\" gesetzt ist.";
    }
    @Override
    protected String noCertificatesFoundInCertificateReply$str() {
        return "WFLYELY01033: Keine Zertifikate in Zertifikatsantwort gefunden";
    }
    @Override
    protected String jaasFileDoesNotExist$str() {
        return "WFLYELY00046: Der angegebene Pfad '%1$s' zur JAAS-Konfigurationsdatei existiert nicht.";
    }
    @Override
    protected String keyStoreAliasDoesNotIdentifyPrivateKeyEntry$str() {
        return "WFLYELY01030: Alias '%1$s' identifiziert keinen Eintrag für private Schlüssel in Keystore";
    }
    @Override
    protected String failedToCreatePolicy$str() {
        return "WFLYELY01025: Erstellen der Richtlinie [%1$s] fehlgeschlagen";
    }
    @Override
    protected String unableToObtainCertificateAuthorityAccountCertificate$str() {
        return "WFLYELY01046: Zertifikat für das mit der Zertifizierungsstelle verknüpfte Konto kann für Alias '%1$s' nicht abgerufen werden";
    }
    @Override
    protected String noTypeFoundForLazyInitKeyManager$str() {
        return "WFLYELY01083: Kein '%1$s' in eingespeistem Wert gefunden.";
    }
    @Override
    protected String selfSignedCertificateWillBeCreated$str() {
        return "WFLYELY01084: Keystore %1$s nicht gefunden, er wird automatisch bei der erstmaligen Verwendung mit einem selbstsignierten Zertifikat für Host %2$s generiert";
    }
    @Override
    protected String jdbcRealmOnlySingleKeyMapperAllowed$str() {
        return "WFLYELY00034: Eine Prinzipal-Abfrage darf nur einen einzigen Schlüssel-Mapper haben";
    }
    @Override
    protected String requiredServiceNotUp$str() {
        return "WFLYELY00007: Der angeforderte Dienst '%1$s' ist nicht UP, er ist derzeit '%2$s'.";
    }
    @Override
    protected String addSecretKeyToInitializedFilesystemRealm$str() {
        return "WFLYELY01220: Einem nicht leeren Dateisystem-Bereich kann nach der Initialisierung kein geheimer Verschlüsselungsschlüssel hinzugefügt werden. Um einen Dateisystem-Bereich zu aktualisieren, verwenden Sie den Elytron Tool-Befehl 'filesystem-realm-encrypt'";
    }
    @Override
    protected String certificateReplySameAsCertificateFromKeyStore$str() {
        return "WFLYELY01035: Zertifikatsantwort stimmt mit Zertifikat aus dem Eintrag zum privaten Schlüssel in KeyStore überein";
    }
    @Override
    protected String keyStoreFileNotExists$str() {
        return "WFLYELY00022: KeyStore-Datei '%1$s' ist erforderlich, aber nicht vorhanden.";
    }
    @Override
    protected String certificateNotValid$str() {
        return "WFLYELY00024: Zertifikat [%1$s] in KeyStore ist ungültig";
    }
    @Override
    protected String trustedCertificateAlreadyInCacertsKeyStore$str() {
        return "WFLYELY01039: Vertrauenswürdiges Zertifikat ist bereits in Keystore 'cacerts' unter dem Alias '%1$s' vorhanden";
    }
    @Override
    protected String failedToLoadResponderCert$str() {
        return "WFLYELY01064: OCSP-Responder-Zertifikat '%1$s' konnte nicht geladen werden.";
    }
    @Override
    protected String keyPasswordCannotBeResolved$str() {
        return "WFLYELY01027: Schlüsselpasswort kann für Keystore '%1$s' nicht aufgelöst werden";
    }
    @Override
    protected String unableToEnableJaccSupport$str() {
        return "WFLYELY01086: JACC-Unterstützung für Elytron kann nicht initialisiert werden, während veraltete JACC-Unterstützung aktiviert ist.";
    }
    @Override
    protected String propertyFilesDoesNotExist$str() {
        return "WFLYELY00017: Die im Eigenschaftenbereich referenzierte Eigenschaftendatei ist nicht vorhanden: %1$s";
    }
    @Override
    protected String invalidDefinition$str() {
        return "WFLYELY01014: Ungültige Definition von [%1$s]. Nur einer der Filter '%2$s' oder '%3$s' kann in einem Objekt in der Liste der Filter festgelegt werden.";
    }
    @Override
    protected String noResolverWithSpecifiedName$str() {
        return "WFLYELY01201: Es wurde kein Ausdrucks-Resolver mit dem Namen '%1$s' definiert.";
    }
    @Override
    protected String couldNotReadIdentity1$str() {
        return "WFLYELY01007: Identität mit Namen [%1$s] konnte nicht gelesen werden.";
    }
    @Override
    protected String cycleDetectedInitialisingExpressionResolver$str() {
        return "WFLYELY01202: Es wurde ein Zyklus zur Initialisierung des Ausdrucks-Resolvers für '%1$s' und '%2$s' erkannt.";
    }
    @Override
    protected String invalidServiceNameParent$str() {
        return "WFLYELY00044: Unerwarteter Name des übergeordneten Elements von 'servicename' - %1$s";
    }
    @Override
    protected String credentialDoesNotExist$str() {
        return "WFLYELY00920: Anmeldedatenalias '%1$s' vom Anmeldedatentyp '%2$s' ist nicht im Speicher vorhanden";
    }
    @Override
    protected String invalidTypeInjected$str() {
        return "WFLYELY00037: Eingespeister Wert hat nicht den Typ '%1$s'.";
    }
    @Override
    protected String unableToGetCertificateAuthorityMetadata$str() {
        return "WFLYELY01054: Die mit der Zertifizierungsstelle %1$s verknüpften Metadaten konnten nicht abgerufen werden";
    }
    @Override
    protected String unableToReloadCRL$str() {
        return "WFLYELY00032: CRL-Datei kann nicht erneut geladen werden.";
    }
    @Override
    protected String realmRefererencedTwice$str() {
        return "WFLYELY00036: Sicherheitsbereich '%1$s' wurde zweimal in derselben Sicherheitsdomäne referenziert.";
    }
    @Override
    protected String couldNotAddAttribute$str() {
        return "WFLYELY01009: Hinzufügen von Attribut fehlgeschlagen.";
    }
    @Override
    protected String filelessKeyStoreMissingType$str() {
        return "WFLYELY01060: Für dateilosen KeyStore muss ein Typ definiert sein.";
    }
    @Override
    protected String realmDoesNotSupportCache$str() {
        return "WFLYELY00030: Bereich '%1$s' unterstützt keinen Cache";
    }
    @Override
    protected String publicKeyFromCertificateReplyDoesNotMatchKeyStore$str() {
        return "WFLYELY01034: Öffentlicher Schlüssel aus Zertifikatsantwort stimmt nicht mit öffentlichem Schlüssel aus Zertifikat in Keystore überein";
    }
    @Override
    protected String exceptionWhileCreatingPermission$str() {
        return "WFLYELY00021: Ausnahme beim Erstellen des Berechtigungsobjekts für das Berechtigungs-Mapping. Überprüfen Sie [class-name], [target-name] (Name der Berechtigung) und [action] von [%1$s].";
    }
    @Override
    protected String invalidCipherSuiteNames$str() {
        return "WFLYELY01066: Ungültiger Wert für cipher-suite-names. %1$s";
    }
    @Override
    protected String invalidImplementationLoaded$str() {
        return "WFLYELY01069: Ungültiger Wert %1$s geladen, erwartet wurde %2$s. Stattdessen %3$s erhalten.";
    }
    @Override
    protected String unableToLoadCredential$str() {
        return "WFLYELY00922: Anmeldedaten können nicht aus dem Anmeldedatenspeicher geladen werden.";
    }
    @Override
    protected String unableToCreateAccountWithCertificateAuthority$str() {
        return "WFLYELY01043: Ein Konto mit der Zertifizierungsstelle %1$s kann nicht erstellt werden";
    }
    @Override
    protected String unableToObtainEntry$str() {
        return "WFLYELY01042: Eintrag für Alias '%1$s' kann nicht abgerufen werden";
    }
    @Override
    protected String unableToGetKeyStorePassword$str() {
        return "WFLYELY01216: Der Dateisystembereich kann das Passwort für den Schlüsselspeicher nicht abrufen";
    }
    @Override
    protected String keyStorePasswordCannotBeResolved$str() {
        return "WFLYELY00910: Passwort kann für Schlüsselspeicher '%1$s' nicht aufgelöst werden";
    }
    @Override
    protected String invalidSuffix$str() {
        return "WFLYELY01020: Das Suffix (%1$s) ist ungültig. Ein Suffix muss ein gültiges Datumsformat haben.";
    }
    @Override
    protected String illegalNonManagementInitialization$str() {
        return "WFLYELY01210: Initialisierung von %1$s ohne aktiven Management OperationContext nicht erlaubt.";
    }
    @Override
    protected String invalidPermissionModule$str() {
        return "WFLYELY00040: Berechtigungsmodul '%1$s' für die Berechtigungszuordnung konnte nicht geladen werden";
    }
    @Override
    protected String discardingUnusedPolicy$str() {
        return "WFLYELY01026: Das '%1$s'-Element mit dem '%2$s'-Attribut, festgelegt auf '%3$s', wird nicht verwendet. Da nicht verwendete Richtlinienkonfigurationen nicht mehr im Konfigurationsmodell gespeichert werden können, wird dieses Objekt verworfen.";
    }
    @Override
    protected String couldNotCreateIdentity$str() {
        return "WFLYELY01001: Identität mit Namen [%1$s] konnte nicht erstellt werden.";
    }
    @Override
    protected String patternRequiresCaptureGroup$str() {
        return "WFLYELY01013: Muster [%1$s] erfordert eine Erfassungsgruppe";
    }
    @Override
    protected String couldNotDeleteIdentity$str() {
        return "WFLYELY01003: Identität mit Namen [%1$s] konnte nicht gelöscht werden.";
    }
    @Override
    protected String duplicatePolicyContextHandler$str() {
        return "WFLYELY01068: Duplizierter PolicyContextHandler für Schlüssel '%1$s' gefunden.";
    }
    @Override
    protected String unableToResolveCredentialStore$str() {
        return "WFLYELY01208: CredentialStore kann nicht aufgelöst werden %1$s -- %2$s";
    }
    @Override
    protected String unableToAccessKeyStore$str() {
        return "WFLYELY00005: Es kann nicht auf den KeyStore zugegriffen werden, um die angeforderte Aktion abzuschließen.";
    }
    @Override
    protected String filesystemIntegrityInvalid$str() {
        return "WFLYELY01217: Die Verifizierung des Bereichs ist fehlgeschlagen, ungültige Signaturen für die Identitäten: %1$s";
    }
    @Override
    protected String serverNotKnown$str() {
        return "WFLYELY01016: Server '%1$s' nicht bekannt";
    }
    @Override
    protected String unableToStartService$str() {
        return "WFLYELY00004: Dienst kann nicht gestartet werden.";
    }
    @Override
    protected String unableToReloadCRLNotReloadable$str() {
        return "WFLYELY00039: CRL-Datei kann nicht neu geladen werden – TrustManager ist nicht nachladbar";
    }
    @Override
    protected String secretKeyOperationFailed$str() {
        return "WFLYELY00927: Die Geheimschlüsseloperation '%1$s' konnte aufgrund von '%2$s' nicht abgeschlossen werden.";
    }
    @Override
    protected String identityNotFound$str() {
        return "WFLYELY01002: Identität mit Namen [%1$s] wurde nicht gefunden.";
    }
    @Override
    protected String failedToRegisterPolicyHandlers$str() {
        return "WFLYELY01024: Registrieren von Richtlinien-Kontext-Handler fehlgeschlagen";
    }
    @Override
    protected String unableToLoadCredentialStore$str() {
        return "WFLYELY01211: Der Anmeldedatenspeicher kann nicht geladen werden.";
    }
    @Override
    protected String credentialStoreProtectionParameterCannotBeResolved$str() {
        return "WFLYELY00911: Schutzparameter für Anmeldedatenspeicher '%1$s' kann nicht aufgelöst werden";
    }
    @Override
    protected String multipleMaximumCertPathDefinitions$str() {
        return "WFLYELY01065: Mehrere maximum-cert-path-Definitionen gefunden.";
    }
    @Override
    protected String expressionResolverInitialisationAlreadyFailed$str() {
        return "WFLYELY01203: Die Initialisierung des Ausdrucks-Resolvers ist bereits fehlgeschlagen.";
    }
    @Override
    protected String filebasedKeystoreLocationMissing$str() {
        return "WFLYELY00921: Standortparameter ist für dateibasierten Keystore-Typ '%1$s' nicht angegeben";
    }
    @Override
    protected String unableToInstatiateAcmeClientSpiImplementation$str() {
        return "WFLYELY01052: AcmeClientSpi-Implementierung kann nicht instanziiert werden";
    }
    @Override
    protected String unableToUpdateAccountWithCertificateAuthority$str() {
        return "WFLYELY01053: Das Konto kann nicht mit der Zertifizierungsstelle %1$s aktualisiert werden";
    }
    @Override
    protected String x500AttributeMustBeDefined$str() {
        return "WFLYELY00028: Das X.500-Attribut muss nach Name oder OID definiert werden";
    }
    @Override
    protected String unableToObtainCertificateAuthorityAccountPrivateKey$str() {
        return "WFLYELY01047: Der private Schlüssel für das mit der Zertifizierungsstelle verknüpfte Konto kann für Alias '%1$s' nicht abgerufen werden";
    }
    @Override
    protected String dirContextPasswordCannotBeResolved$str() {
        return "WFLYELY00917: Passwort kann für Verzeichniskontext nicht aufgelöst werden";
    }
    @Override
    protected String certificateAuthorityAccountAlreadyExists$str() {
        return "WFLYELY01056: Ein Zertifizierungsstellenkonto mit diesem Kontoschlüssel ist bereits vorhanden. Um die mit diesem bestehenden Konto verknüpften Kontaktinformationen zu aktualisieren, verwenden Sie %1$s. Um den Schlüssel für dieses bestehende Konto zu ändern, verwenden Sie %2$s.";
    }
    @Override
    protected String credentialStoreEntryTypeNotSupported$str() {
        return "WFLYELY00909: Anmeldedatenspeicher '%1$s' unterstützt den angegebenen Anmeldedatenspeicher-Eintragstyp '%2$s' nicht";
    }
    @Override
    protected String noAllowedJkuValuesSpecifiedForTokenRealm$str() {
        return "WFLYELY01090: Für den Token-Bereich '%1$s' wurden keine zulässigen JKU-Werte angegeben. Die Token-Validierung schlägt fehl, wenn das Token einen 'jku'-Header-Parameter enthält. Die zulässigen JKU-Werte können als durch Leerzeichen getrennte Zeichenfolge mit der Systemeigenschaft '%2$s' angegeben werden.";
    }
    @Override
    protected String missingPublicKey$str() {
        return "WFLYELY01213: KeyStore enthält keinen PublicKey für KeyStore: [%1$s] und Alias: [%2$s].";
    }
    @Override
    protected String keyStoreAliasDoesNotExist$str() {
        return "WFLYELY01029: Alias '%1$s' existiert nicht im Keystore";
    }
    @Override
    protected String invalidSize$str() {
        return "WFLYELY01018: Ungültige Größe %1$s";
    }
    @Override
    protected String expressionResolutionWithoutResolver$str() {
        return "WFLYELY01204: Der Ausdruck '%1$s' gibt keinen Resolver an und es ist kein Standard definiert.";
    }
    @Override
    protected String failedToCreateServerAuthModule$str() {
        return "WFLYELY01057: ServerAuthModule [%1$s] konnte nicht mit Modul '%2$s' erstellt werden";
    }
    @Override
    protected String selfSignedCertificateHasBeenCreated$str() {
        return "WFLYELY01085: Generiertes selbstsigniertes Zertifikat bei %1$s. Bitte beachten Sie, dass selbstsignierte Zertifikate nicht sicher sind und nur zu Testzwecken verwendet werden sollten. Verwenden Sie dieses selbstsignierte Zertifikat nicht in der Produktion.";
    }
    @Override
    protected String missingPrivateKey$str() {
        return "WFLYELY01212: KeyStore enthält keinen PrivateKey für KeyStore: [%1$s] und Alias: [%2$s].";
    }
    @Override
    protected String unableToInitializeCredentialStore$str() {
        return "WFLYELY01209: CredentialStore kann nicht initialisiert werden %1$s -- %2$s";
    }
    @Override
    protected String ldapRealmDirectVerificationAndUserPasswordMapper$str() {
        return "WFLYELY00047: Der LDAP-Bereich ist so konfiguriert, dass direkte Verifizierung und Benutzer-Passwort-Mapper verwendet werden, was eine ungültige Konfiguration ist.";
    }
    @Override
    protected String modelStageResolutionNotSupported$str() {
        return "WFLYELY01207: Auflösung von CredentialStore-Ausdrücken wird in der MODEL-Phase der Vorgangsausführung nicht unterstützt.";
    }
    @Override
    protected String unableToReLoadPropertiesFiles$str() {
        return "WFLYELY00020: Die Eigenschaftendateien, die vom Eigenschaftendatei-gestützten Bereich benötigt werden, konnten nicht neu geladen werden.";
    }
    @Override
    protected String credentialAlreadyExists$str() {
        return "WFLYELY00913: Anmeldedatenalias '%1$s' vom Anmeldedatentyp '%2$s' ist bereits im Speicher vorhanden";
    }
    @Override
    protected String failedToParsePEMPublicKey$str() {
        return "WFLYELY01058: Öffentlicher PEM-Schlüssel konnte nicht analysiert werden mit untergeordnetem Element: %1$s";
    }
    @Override
    protected String invalidRegex$str() {
        return "WFLYELY01067: Wert '%1$s' ist kein gültiger Regex.";
    }
    @Override
    protected String noSuitableProvider$str() {
        return "WFLYELY00012: Es wurde kein geeigneter Anbieter für Typ '%1$s' gefunden";
    }
    @Override
    protected String invalidPermissionClass$str() {
        return "WFLYELY00038: Berechtigungsklasse '%1$s' konnte nicht geladen werden";
    }
    @Override
    protected String addKeypairToInitializedFilesystemRealm$str() {
        return "WFLYELY01219: Einem nicht leeren Dateisystem-Bereich kann nach der Initialisierung kein Integritätsschlüsselpaar hinzugefügt werden. Um einen Dateisystem-Bereich zu aktualisieren, verwenden Sie den Elytron Tool-Befehl 'filesystem-realm-integrity'";
    }
    @Override
    protected String invalidOperationName$str() {
        return "WFLYELY00008: Ungültiger Operationsname '%1$s'; erwartet wurde einer der folgenden Namen: '%2$s'";
    }
    @Override
    protected String invalidKeySize$str() {
        return "WFLYELY01055: Ungültige Schlüsselgröße: %1$d";
    }
    @Override
    protected String cannotFindPolicyProvider$str() {
        return "WFLYELY01023: Der Richtlinienanbieter mit dem Namen [%1$s] konnte nicht gefunden werden";
    }
    @Override
    protected String invalidResolver$str() {
        return "WFLYELY01205: Der Ausdruck '%1$s' gibt eine Resolver-Konfiguration an, die nicht vorhanden ist.";
    }
    @Override
    protected String operationAddressMissingKey$str() {
        return "WFLYELY00003: Die Operation enthielt keine Adresse mit einem Wert für '%1$s'.";
    }
    @Override
    protected String invalidHostContextMapValue$str() {
        return "WFLYELY01061: Ungültiger Wert der Hostkontext-Zuordnung: '%1$s' ist kein gültiges Hostnamenmuster.";
    }
    @Override
    protected String invalidURL$str() {
        return "WFLYELY00029: Parsen von URL '%1$s' fehlgeschlagen";
    }
    @Override
    protected String unableToDecryptExpression$str() {
        return "WFLYELY01206: Ausdruck '%1$s' kann nicht entschlüsselt werden.";
    }
    @Override
    protected String couldNotCreatePassword$str() {
        return "WFLYELY01011: Passwort konnte nicht erstellt werden.";
    }
    @Override
    protected String unexpectedPasswordType$str() {
        return "WFLYELY01012: Unerwarteter Passworttyp [%1$s].";
    }
    @Override
    protected String unableToInitialiseCredentialStore$str() {
        return "WFLYELY00926: Der Anmeldedatenspeicher konnte nicht initialisiert werden.";
    }
    @Override
    protected String failedToLazilyInitKeyManager$str() {
        return "WFLYELY01081: Verzögerte Initialisierung des Schlüsselmanagers fehlgeschlagen";
    }
    @Override
    protected String unableToAccessCRL$str() {
        return "WFLYELY00031: Zugriff auf CRL-Datei nicht möglich.";
    }
    @Override
    protected String unableToObtainOidForX500Attribute$str() {
        return "WFLYELY00027: OID für X.500-Attribut '%1$s' kann nicht abgerufen werden";
    }
    @Override
    protected String identityAlreadyExists$str() {
        return "WFLYELY01000: Identität mit Namen [%1$s] ist bereits vorhanden.";
    }
    @Override
    protected String unableToDeactivateAccountWithCertificateAuthority$str() {
        return "WFLYELY01045: Das mit der Zertifizierungsstelle %1$s verknüpfte Konto kann nicht deaktiviert werden";
    }
    @Override
    protected String invalidEncodingName$str() {
        return "WFLYELY01089: Ungültige Dateiverschlüsselung '%1$s'.";
    }
}
