package org.wildfly.extension.elytron._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:14+0200")
public class ElytronSubsystemMessages_$logger_fr extends ElytronSubsystemMessages_$logger implements ElytronSubsystemMessages, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ElytronSubsystemMessages_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String duplicateRealmInjection$str() {
        return "WFLYELY00002: Ne peut pas injecter le même realm '%1$s' dans un unique domaine de sécurité.";
    }
    @Override
    protected String operationAddressMissingKey$str() {
        return "WFLYELY00003: L'opération ne contenait pas d'adresse avec une valeur pour '%1$s'.";
    }
    @Override
    protected String unableToStartService$str() {
        return "WFLYELY00004: Impossible de démarrer le service.";
    }
    @Override
    protected String unableToAccessKeyStore$str() {
        return "WFLYELY00005: Impossible d'accéder au KeyStore pour terminer l'opération demandée.";
    }
    @Override
    protected String requiredServiceNotUp$str() {
        return "WFLYELY00007: Le service requis '%1$s' n'est pas actif. Il est actuellement défini sur '%2$s'.";
    }
    @Override
    protected String invalidOperationName$str() {
        return "WFLYELY00008: Nom d'opération non valide '%1$s' ; '%2$s' était attendu";
    }
    @Override
    protected String unableToCompleteOperation$str() {
        return "WFLYELY00009: Impossible de terminer l'opération. '%1$s'";
    }
    @Override
    protected String cantSaveWithoutFile$str() {
        return "WFLYELY00010: Impossible d'enregistrer le KeyStore. Le fichier de KeyStore '%1$s' n'existe pas.";
    }
    @Override
    protected String noSuitableProvider$str() {
        return "WFLYELY00012: Aucun fournisseur approprié n'a été trouvé pour le type '%1$s'";
    }
    @Override
    protected String defaultRealmNotReferenced$str() {
        return "WFLYELY00013: Le domaine par défaut '%1$s' ne figure pas dans la liste des domaines [%2$s] référencés par ce domaine.";
    }
    @Override
    protected String unableToLoadPropertiesFiles$str() {
        return "WFLYELY00014: Impossible de charger les fichiers de propriétés requis pour démarrer le domaine sauvegardé par un fichier de ce type : Fichier d'utilisateurs : '%1$s' Fichier de groupes : '%2$s'";
    }
    @Override
    protected String componentNotConfigurable$str() {
        return "WFLYELY00015: L'implémentation du composant personnalisé '%1$s' n'implémente pas la méthode initialize(Map<String, String>), cependant la configuration a été fournie.";
    }
    @Override
    protected String invalidRegularExpression$str() {
        return "WFLYELY00016: L'expression régulière fournie '%1$s' n'est pas valide.";
    }
    @Override
    protected String propertyFilesDoesNotExist$str() {
        return "WFLYELY00017: Le fichier de propriétés référencé dans properties-realm n'existe pas : %1$s";
    }
    @Override
    protected String unableToCreateManagerFactory$str() {
        return "WFLYELY00018: Impossible de créer %1$s pour l'algorithme '%2$s'.";
    }
    @Override
    protected String noTypeFound$str() {
        return "WFLYELY00019: '%1$s' introuvable dans la valeur injectée.";
    }
    @Override
    protected String unableToReLoadPropertiesFiles$str() {
        return "WFLYELY00020: Impossible de recharger les fichiers de propriétés requis par le domaine sauvegardé par le fichier des propriétés.";
    }
    @Override
    protected String exceptionWhileCreatingPermission$str() {
        return "WFLYELY00021: Exception lors de la création de l'objet d'autorisation pour le mappage d'autorisations. Vérifiez les valeurs [class-name], [target-name] (nom de l'autorisation) et [action] de [%1$s].";
    }
    @Override
    protected String keyStoreFileNotExists$str() {
        return "WFLYELY00022: Le fichier de KeyStore '%1$s' n'existe pas alors qu'il est obligatoire.";
    }
    @Override
    protected String keyStoreFileNotExistsButIgnored$str() {
        return "WFLYELY00023: Le fichier de KeyStore '%1$s' n'existe pas. Une valeur vide a été utilisée.";
    }
    @Override
    protected String certificateNotValid$str() {
        return "WFLYELY00024: Le certificat [%1$s] dans le KeyStore n'est pas valide";
    }
    @Override
    protected String propertyFileIsInvalid$str() {
        return "WFLYELY00025: Le fichier de propriétés référencé n'est pas valide : %1$s";
    }
    @Override
    protected String unableToObtainOidForX500Attribute$str() {
        return "WFLYELY00027: Impossible d'obtenir l'OID pour l'attribut X.500 '%1$s'";
    }
    @Override
    protected String x500AttributeMustBeDefined$str() {
        return "WFLYELY00028: L'attribut X.500 doit être défini par le nom ou l'OID";
    }
    @Override
    protected String invalidURL$str() {
        return "WFLYELY00029: Impossible d'analyser l'URL '%1$s'";
    }
    @Override
    protected String realmDoesNotSupportCache$str() {
        return "WFLYELY00030: Le domaine '%1$s' ne prend pas en charge le cache";
    }
    @Override
    protected String unableToAccessCRL$str() {
        return "WFLYELY00031: Impossible d'accéder au fichier CRL.";
    }
    @Override
    protected String unableToReloadCRL$str() {
        return "WFLYELY00032: Impossible de recharger le fichier CRL.";
    }
    @Override
    protected String unableToAccessEntryFromKeyStore$str() {
        return "WFLYELY00033: Impossible d'accéder à l'entrée [%1$s] à partir du key-store [%2$s].";
    }
    @Override
    protected String jdbcRealmOnlySingleKeyMapperAllowed$str() {
        return "WFLYELY00034: Une requête de principal ne peut avoir qu'un seul mappeur de clés";
    }
    @Override
    protected String unableToLoadModule$str() {
        return "WFLYELY00035: Impossible de charger le module '%1$s'.";
    }
    @Override
    protected String realmRefererencedTwice$str() {
        return "WFLYELY00036: Le domaine de sécurité '%1$s' a été référencé deux fois dans le même domaine de sécurité.";
    }
    @Override
    protected String invalidTypeInjected$str() {
        return "WFLYELY00037: La valeur injectée n'est pas de type '%1$s'.";
    }
    @Override
    protected String invalidPermissionClass$str() {
        return "WFLYELY00038: Impossible de charger la classe de permission '%1$s'";
    }
    @Override
    protected String unableToReloadCRLNotReloadable$str() {
        return "WFLYELY00039: Impossible de charger à nouveau le fichier CRL - TrustManager ne peut pas être rechargé à nouveau";
    }
    @Override
    protected String invalidPermissionModule$str() {
        return "WFLYELY00040: Impossible de charger le module de permission '%1$s' pour le mappage des permissions";
    }
    @Override
    protected String unableToTransformTornAttribute$str() {
        return "WFLYELY00041: Impossible de transformer la configuration en version cible - l'attribut '%1$s' est différent de '%2$s'";
    }
    @Override
    protected String unableToTransformMultipleRealms$str() {
        return "WFLYELY00042: Impossible de transformer plusieurs \" authorization-realms\" en une seule valeur";
    }
    @Override
    protected String cycleDetected$str() {
        return "WFLYELY00043: Un cycle d'initialisation des ressources a été détecté - %1$s";
    }
    @Override
    protected String invalidServiceNameParent$str() {
        return "WFLYELY00044: Nom inattendu du parent de servicename - %1$s";
    }
    @Override
    protected String failedToLoadCallbackhandlerFromProvidedModule$str() {
        return "WFLYELY00045: Échec du chargement du CallbackHandler à partir du module fourni.";
    }
    @Override
    protected String jaasFileDoesNotExist$str() {
        return "WFLYELY00046: Le chemin fourni '%1$s' vers le fichier de configuration de JAAS n'existe pas.";
    }
    @Override
    protected String ldapRealmDirectVerificationAndUserPasswordMapper$str() {
        return "WFLYELY00047: LDAP Realm est configuré pour utiliser la vérification directe et le mappage des mots de passe des utilisateurs, ce qui est une configuration invalide.";
    }
    @Override
    protected String representationOfX500IsRequired$str() {
        return "WFLYELY00048: Une représentation en chaîne d'un nom distingué X.500 est requise : %1$s";
    }
    @Override
    protected String jaasEntryNotDefined$str() {
        return "WFLYELY00049: L'entrée n'est pas définie.";
    }
    @Override
    protected String cachedRealmServiceNotAvailable$str() {
        return "WFLYELY00050: Le domaine n'est pas disponible. Impossible de vider le cache.";
    }
    @Override
    protected String credentialStoreEntryTypeNotSupported$str() {
        return "WFLYELY00909: Le magasin d'identifiants '%1$s' ne prend pas en charge le type d'entrée de magasin d'identifiants '%2$s' donné";
    }
    @Override
    protected String keyStorePasswordCannotBeResolved$str() {
        return "WFLYELY00910: Le mot de passe ne peut pas être résolu pour le key-store '%1$s'";
    }
    @Override
    protected String credentialStoreProtectionParameterCannotBeResolved$str() {
        return "WFLYELY00911: Le paramètre de protection du magasin d'identifiants '%1$s' ne peut pas être résolu";
    }
    @Override
    protected String credentialAlreadyExists$str() {
        return "WFLYELY00913: L'alias d'identifiant '%1$s' du type '%2$s' existe déjà dans le magasin";
    }
    @Override
    protected String providerLoaderCannotSupplyProvider$str() {
        return "WFLYELY00914: Le chargeur de fournisseur '%1$s' ne peut pas fournir de fournisseur de magasin d'identifiants du type '%2$s'";
    }
    @Override
    protected String credentialCannotBeResolved$str() {
        return "WFLYELY00916: Impossible de résoudre l'identifiant";
    }
    @Override
    protected String dirContextPasswordCannotBeResolved$str() {
        return "WFLYELY00917: Le mot de passe ne peut pas être résolu pour dir-context";
    }
    @Override
    protected String credentialDoesNotExist$str() {
        return "WFLYELY00920: L'alias d'identifiant '%1$s' du type '%2$s' n'existe pas dans le magasin";
    }
    @Override
    protected String filebasedKeystoreLocationMissing$str() {
        return "WFLYELY00921: Le paramètre d'emplacement n'est pas spécifié pour le type de keystore basé fichiers '%1$s'";
    }
    @Override
    protected String reloadDependantServices$str() {
        return "Rechargement des services dépendants ayant peut-être déjà mis la valeur secrète en cache";
    }
    @Override
    protected String updateDependantServices$str() {
        return "Mise à jour des ressources dépendantes car l'alias \"%1$s\" n'existe plus";
    }
    @Override
    protected String unableToLoadCredential$str() {
        return "WFLYELY00922: Impossible de charger l’identifiant en provenance du store d’identifiants.";
    }
    @Override
    protected String unableToEncryptClearText$str() {
        return "WFLYELY00923: Impossible de crypter le texte clair fourni.";
    }
    @Override
    protected String unableToCreateCredentialStoreImmediately$str() {
        return "WFLYELY00924: Impossible de créer un store d’identifiants immédiatement disponible.";
    }
    @Override
    protected String unableToReloadCredentialStore$str() {
        return "WFLYELY00925: Impossible de recharger le store d’identifiants.";
    }
    @Override
    protected String unableToInitialiseCredentialStore$str() {
        return "WFLYELY00926: Impossible d'initialiser le store d’identifiants.";
    }
    @Override
    protected String secretKeyOperationFailed$str() {
        return "WFLYELY00927: L'opération de clé secrète '%1$s' n'a pas abouti à cause de '%2$s'.";
    }
    @Override
    protected String identityAlreadyExists$str() {
        return "WFLYELY01000: L'identité nommée [%1$s] existe déjà.";
    }
    @Override
    protected String couldNotCreateIdentity$str() {
        return "WFLYELY01001: Impossible de créer l'identité avec le nom [%1$s].";
    }
    @Override
    protected String identityNotFound$str() {
        return "WFLYELY01002: L'identité avec le nom [%1$s] est introuvable.";
    }
    @Override
    protected String couldNotDeleteIdentity$str() {
        return "WFLYELY01003: Impossible de supprimer l'identité avec le nom [%1$s].";
    }
    @Override
    protected String identityNotAuthorized$str() {
        return "WFLYELY01004: L'identité avec le nom [%1$s] n'est pas autorisée.";
    }
    @Override
    protected String couldNotReadIdentity2$str() {
        return "WFLYELY01005: Impossible de lire l'identité [%1$s] à partir du domaine de sécurité [%2$s].";
    }
    @Override
    protected String couldNotReadIdentity1$str() {
        return "WFLYELY01007: Impossible de lire l'identité avec le nom [%1$s].";
    }
    @Override
    protected String couldNotObtainAuthorizationIdentity$str() {
        return "WFLYELY01008: Échec de l'obtention de l'identité d'autorisation.";
    }
    @Override
    protected String couldNotAddAttribute$str() {
        return "WFLYELY01009: Échec d'ajout de l'attribut.";
    }
    @Override
    protected String couldNotRemoveAttribute$str() {
        return "WFLYELY01010: Échec de suppression de l'attribut.";
    }
    @Override
    protected String couldNotCreatePassword$str() {
        return "WFLYELY01011: Impossible de créer le mot de passe.";
    }
    @Override
    protected String unexpectedPasswordType$str() {
        return "WFLYELY01012: Type de mot de passe inattendu [%1$s].";
    }
    @Override
    protected String patternRequiresCaptureGroup$str() {
        return "WFLYELY01013: Le modèle [%1$s] nécessite un groupe de capture";
    }
    @Override
    protected String invalidDefinition$str() {
        return "WFLYELY01014: Définition [%1$s] non valide. Une seule définition de '%2$s' ou '%3$s' peut être définie dans un Objet de la liste des filtres.";
    }
    @Override
    protected String unableToPerformOutflow$str() {
        return "WFLYELY01015: Impossible d'effectuer un déversement automatique pour '%1$s'";
    }
    @Override
    protected String serverNotKnown$str() {
        return "WFLYELY01016: Serveur '%1$s' inconnu";
    }
    @Override
    protected String invalidCipherSuiteFilter$str() {
        return "WFLYELY01017: Valeur non valide pour cipher-suite-filter. %1$s";
    }
    @Override
    protected String invalidSize$str() {
        return "WFLYELY01018: Taille %1$s non valide";
    }
    @Override
    protected String suffixContainsMillis$str() {
        return "WFLYELY01019: Le suffixe (%1$s) ne peut pas contenir de secondes ou de millisecondes.";
    }
    @Override
    protected String invalidSuffix$str() {
        return "WFLYELY01020: Le suffixe (%1$s) est non valide. Un suffixe doit être sous la forme d'un format valide.";
    }
    @Override
    protected String failedToSetPolicy$str() {
        return "WFLYELY01022: Échec de définition de la stratégie [%1$s]";
    }
    @Override
    protected String cannotFindPolicyProvider$str() {
        return "WFLYELY01023: Impossible de trouver le fournisseur de stratégies ayant pour nom [%1$s]";
    }
    @Override
    protected String failedToRegisterPolicyHandlers$str() {
        return "WFLYELY01024: Échec de l'enregistrement des gestionnaires de contexte de stratégie";
    }
    @Override
    protected String failedToCreatePolicy$str() {
        return "WFLYELY01025: Échec de création de la stratégie [%1$s]";
    }
    @Override
    protected String discardingUnusedPolicy$str() {
        return "WFLYELY01026: L'élément '%1$s' ayant pour attribut '%2$s' fixé à '%3$s' n'est pas utilisé. Comme les configurations de stratégies non utilisées ne peuvent plus être stockées dans le modèle de configuration, cet élément sera ignoré.";
    }
    @Override
    protected String keyPasswordCannotBeResolved$str() {
        return "WFLYELY01027: Le mot de passe ne peut pas être résolu pour le key-store '%1$s'";
    }
    @Override
    protected String invalidNotBefore$str() {
        return "WFLYELY01028: Valeur non valable pour les %1$s « non antérieurs à » (not-before).";
    }
    @Override
    protected String keyStoreAliasDoesNotExist$str() {
        return "WFLYELY01029: Alias '%1$s' n'existe pas dans key-store";
    }
    @Override
    protected String keyStoreAliasDoesNotIdentifyPrivateKeyEntry$str() {
        return "WFLYELY01030: L’alias '%1$s' n'identifie pas d’entrée de clé privée dans le key-store";
    }
    @Override
    protected String unableToObtainPrivateKey$str() {
        return "WFLYELY01031: Impossible d'obtenir de clé privée pour l'alias '%1$s'";
    }
    @Override
    protected String unableToObtainCertificate$str() {
        return "WFLYELY01032: Impossible d'obtenir un certificat pour l'alias '%1$s'";
    }
    @Override
    protected String noCertificatesFoundInCertificateReply$str() {
        return "WFLYELY01033: Aucun certificat trouvé dans la réponse au certificat";
    }
    @Override
    protected String publicKeyFromCertificateReplyDoesNotMatchKeyStore$str() {
        return "WFLYELY01034: La clé publique de la réponse au certificat ne correspond pas à la clé publique du certificat qui se trouve dans le key-store";
    }
    @Override
    protected String certificateReplySameAsCertificateFromKeyStore$str() {
        return "WFLYELY01035: La réponse du certificat est la même que le certificat d’entrée de clé privée du key-store";
    }
    @Override
    protected String keyStoreAliasAlreadyExists$str() {
        return "WFLYELY01036: L’alias '%1$s' existe déjà dans le key-store";
    }
    @Override
    protected String topMostCertificateFromCertificateReplyNotTrusted$str() {
        return "WFLYELY01037: Le certificat « Top-most » (le + élevé) de la réponse au certificat n'est pas fiable. Inspectez soigneusement le certificat et s'il est valide, exécutez à nouveau « import-certificate » avec le paramètre « validate » défini sur false.";
    }
    @Override
    protected String trustedCertificateAlreadyInKeyStore$str() {
        return "WFLYELY01038: Le certificat de confiance se trouve déjà dans key-store sous l'alias '%1$s'";
    }
    @Override
    protected String trustedCertificateAlreadyInCacertsKeyStore$str() {
        return "WFLYELY01039: Le certificat de confiance se trouve déjà dans key-store cacerts sous l'alias '%1$s'";
    }
    @Override
    protected String unableToDetermineIfCertificateIsTrusted$str() {
        return "WFLYELY01040: Impossible de déterminer si le certificat est fiable. Inspectez soigneusement le certificat et s'il est valide, exécutez à nouveau « import-certificate » avec le paramètre « validate » défini sur false.";
    }
    @Override
    protected String certificateFileDoesNotExist$str() {
        return "WFLYELY01041: Le fichier de certificat n'existe pas";
    }
    @Override
    protected String unableToObtainEntry$str() {
        return "WFLYELY01042: Impossible d'obtenir une Entrée pour l'alias '%1$s'";
    }
    @Override
    protected String unableToCreateAccountWithCertificateAuthority$str() {
        return "WFLYELY01043: Impossible de créer un compte auprès de l'autorité de certification : %1$s";
    }
    @Override
    protected String unableToChangeAccountKeyWithCertificateAuthority$str() {
        return "WFLYELY01044: Impossible de modifier la clé de compte associée à l'autorité de certification : %1$s";
    }
    @Override
    protected String unableToDeactivateAccountWithCertificateAuthority$str() {
        return "WFLYELY01045: Impossible de désactiver le compte associé à l'autorité de certification : %1$s";
    }
    @Override
    protected String unableToObtainCertificateAuthorityAccountCertificate$str() {
        return "WFLYELY01046: Impossible d'obtenir un Certificat de compte d'autorité de certification pour l'alias '%1$s'";
    }
    @Override
    protected String unableToObtainCertificateAuthorityAccountPrivateKey$str() {
        return "WFLYELY01047: Impossible d'obtenir une Clé privée de compte d'autorité de certification pour l'alias '%1$s'";
    }
    @Override
    protected String unableToUpdateCertificateAuthorityAccountKeyStore$str() {
        return "WFLYELY01048: Impossible de mettre à jour le magasin des clés de compte de l'autorité de certification : %1$s";
    }
    @Override
    protected String unableToRespondToCertificateAuthorityChallenge$str() {
        return "WFLYELY01049: Incapable de répondre à la contestation de l'autorité de certification : %1$s";
    }
    @Override
    protected String invalidCertificateAuthorityChallenge$str() {
        return "WFLYELY01050: Contestation de l'autorité de certification non valide";
    }
    @Override
    protected String invalidCertificateRevocationReason$str() {
        return "WFLYELY01051: Motif de révocation du certificat non valide '%1$s'";
    }
    @Override
    protected String unableToInstatiateAcmeClientSpiImplementation$str() {
        return "WFLYELY01052: Impossible d'instancier l'implémentation d'AcmeClientSpi";
    }
    @Override
    protected String unableToUpdateAccountWithCertificateAuthority$str() {
        return "WFLYELY01053: Impossible de mettre le compte à jour auprès de l'autorité de certification : %1$s";
    }
    @Override
    protected String unableToGetCertificateAuthorityMetadata$str() {
        return "WFLYELY01054: Impossible d'obtenir les métadonnées associées à l'autorité de certification : %1$s";
    }
    @Override
    protected String invalidKeySize$str() {
        return "WFLYELY01055: Taille de clé non valide : %1$d";
    }
    @Override
    protected String certificateAuthorityAccountAlreadyExists$str() {
        return "WFLYELY01056: Un compte d'autorité de certification avec cette clé de compte existe déjà. Pour mettre à jour les informations de contact associées à ce compte existant, utilisez %1$s. Pour modifier la clé associée à ce compte existant, utilisez %2$s.";
    }
    @Override
    protected String failedToCreateServerAuthModule$str() {
        return "WFLYELY01057: Échec de la création de ServerAuthModule [%1$s] en utilisant le module '%2$s'";
    }
    @Override
    protected String failedToParsePEMPublicKey$str() {
        return "WFLYELY01058: Échec de l'analyse de la clé publique PEM avec kid : %1$s";
    }
    @Override
    protected String unableToDetectKeyStore$str() {
        return "WFLYELY01059: Impossible de détecter KeyStore '%1$s'";
    }
    @Override
    protected String filelessKeyStoreMissingType$str() {
        return "WFLYELY01060: Fileless KeyStore doit avoir un type défini.";
    }
    @Override
    protected String invalidHostContextMapValue$str() {
        return "WFLYELY01061: Valeur incorrecte de la carte du contexte de l'hôte : '%1$s' n'est pas un modèle de nom d'hôte valide.";
    }
    @Override
    protected String invalidAttributeValue$str() {
        return "WFLYELY01062: Valeur d’attribut '%1$s' non valide.";
    }
    @Override
    protected String letsEncryptNameNotAllowed$str() {
        return "WFLYELY01063: L'autorité de certification LetsEncrypt est configurée par défaut.";
    }
    @Override
    protected String failedToLoadResponderCert$str() {
        return "WFLYELY01064: Impossible de charger le certificat de répondeur OCSP '%1$s'.";
    }
    @Override
    protected String multipleMaximumCertPathDefinitions$str() {
        return "WFLYELY01065: Définitions multiples de maximum-cert-path trouvées.";
    }
    @Override
    protected String invalidCipherSuiteNames$str() {
        return "WFLYELY01066: Valeur non valide pour cipher-suite-names. %1$s";
    }
    @Override
    protected String invalidRegex$str() {
        return "WFLYELY01067: La valeur '%1$s' n'est pas une regex valide.";
    }
    @Override
    protected String duplicatePolicyContextHandler$str() {
        return "WFLYELY01068: Duplicata du PolicyContextHandler trouvé pour la clé '%1$s'.";
    }
    @Override
    protected String invalidImplementationLoaded$str() {
        return "WFLYELY01069: %1$s non valide chargé, %2$s attendu mais %3$s reçu.";
    }
    @Override
    protected String unableToLoadModuleRuntime$str() {
        return "WFLYELY01079: Impossible de charger le module '%1$s'.";
    }
    @Override
    protected String nonexistingKeyStoreMissingType$str() {
        return "WFLYELY01080: Keystore non existant doit avoir un type défini.";
    }
    @Override
    protected String failedToLazilyInitKeyManager$str() {
        return "WFLYELY01081: Échec de l'initialisation lazy du gestionnaire de clés";
    }
    @Override
    protected String failedToStoreGeneratedSelfSignedCertificate$str() {
        return "WFLYELY01082: Impossible de stocker le certificat auto-signé généré";
    }
    @Override
    protected String noTypeFoundForLazyInitKeyManager$str() {
        return "WFLYELY01083: '%1$s' introuvable dans la valeur injectée.";
    }
    @Override
    protected String selfSignedCertificateWillBeCreated$str() {
        return "WFLYELY01084: KeyStore %1$s introuvable, il sera généré automatiquement lors de la première utilisation avec un certificat auto-signé pour l'hôte. %2$s";
    }
    @Override
    protected String unableToEnableJaccSupport$str() {
        return "WFLYELY01086: Impossible d'initialiser le support JACC d'Elytron quand le support JACC hérité est activé.";
    }
    @Override
    protected String hostContextMapHostnameContainsCaret$str() {
        return "WFLYELY01087: Le nom d'hôte dans le mappage SNI ne peut pas contenir le caractère ^.";
    }
    @Override
    protected String missingCertificateAuthorityChallenge$str() {
        return "WFLYELY01088: Contestation de l'autorité de certification manquante";
    }
    @Override
    protected String invalidEncodingName$str() {
        return "WFLYELY01089: L'encodage du fichier '%1$s' n'est pas valide.";
    }
    @Override
    protected String noAllowedJkuValuesSpecifiedForTokenRealm$str() {
        return "WFLYELY01090: Les valeurs jku autorisées n'ont pas été spécifiées pour le domaine de jeton '\n%1$s’ La validation du jeton échouera si celui-ci contient un paramètre d'en-tête « jku ». Les valeurs jku autorisées peuvent être spécifiées sous forme de chaîne séparée par des espaces à l'aide de l'attribut ’%2$s' propriété système.";
    }
    @Override
    protected String noResolverSpecifiedAndNoDefault$str() {
        return "WFLYELY01200: Le nom du résolveur à utiliser n'a pas été spécifié et aucun résolveur par défaut n'a été défini.";
    }
    @Override
    protected String noResolverWithSpecifiedName$str() {
        return "WFLYELY01201: Aucun résolveur d'expression n'a été défini avec le nom '%1$s'.";
    }
    @Override
    protected String cycleDetectedInitialisingExpressionResolver$str() {
        return "WFLYELY01202: Un cycle a été détecté lors de l'initialisation du résolveur d'expression '%1$s' et '%2$s'.";
    }
    @Override
    protected String expressionResolverInitialisationAlreadyFailed$str() {
        return "WFLYELY01203: L'initialisation du résolveur d'expression a déjà échoué.";
    }
    @Override
    protected String expressionResolutionWithoutResolver$str() {
        return "WFLYELY01204: L'expression '%1$s' ne spécifie pas de résolveur et aucun défaut n'est défini.";
    }
    @Override
    protected String invalidResolver$str() {
        return "WFLYELY01205: L'expression '%1$s' spécifie une configuration de résolveur qui n'existe pas.";
    }
    @Override
    protected String unableToDecryptExpression$str() {
        return "WFLYELY01206: Impossible de décrypter l'expression '%1$s'.";
    }
    @Override
    protected String modelStageResolutionNotSupported$str() {
        return "WFLYELY01207: La résolution des expressions du store d’identifiants n'est pas prise en charge dans l'étape d'exécution de l'opération MODEL.";
    }
    @Override
    protected String unableToResolveCredentialStore$str() {
        return "WFLYELY01208: Impossible de résoudre CredentialStore %1$s -- %2$s";
    }
    @Override
    protected String unableToInitializeCredentialStore$str() {
        return "WFLYELY01209: Impossible d'initialiser CredentialStore %1$s -- %2$s";
    }
    @Override
    protected String illegalNonManagementInitialization$str() {
        return "WFLYELY01210: L'initialisation d'un %1$s sans un OperationContext de gestion actif n'est pas autorisée.";
    }
    @Override
    protected String unableToLoadCredentialStore$str() {
        return "WFLYELY01211: Impossible de charger le store d'informations d'identification.";
    }
    @Override
    protected String missingPrivateKey$str() {
        return "WFLYELY01212: KeyStore ne contient pas de PrivateKey pour KeyStore : [%1$s] et l'alias : [%2$s].";
    }
    @Override
    protected String missingPublicKey$str() {
        return "WFLYELY01213: KeyStore ne contient pas de clé publique pour KeyStore : [%1$s] et l'alias : [%2$s].";
    }
    @Override
    protected String unableToVerifyIntegrity$str() {
        return "WFLYELY01214: Impossible de vérifier l'intégrité du système de fichiers réel : %1$s";
    }
    @Override
    protected String filesystemMissingKeypair$str() {
        return "WFLYELY01215: La configuration de la paire de clés du système de fichiers est manquante, la vérification de l'intégrité n'est pas activée";
    }
    @Override
    protected String unableToGetKeyStorePassword$str() {
        return "WFLYELY01216: Le système de fichiers réel ne peut pas obtenir le mot de passe du magasin de clés";
    }
    @Override
    protected String filesystemIntegrityInvalid$str() {
        return "WFLYELY01217: La vérification du domaine a échoué, signatures invalides pour les identités : %1$s";
    }
    @Override
    protected String keyStoreMissingAlias$str() {
        return "WFLYELY01218: Le magasin de clés utilisé par le domaine du système de fichiers ne contient pas l'alias : %1$s";
    }
    @Override
    protected String addKeypairToInitializedFilesystemRealm$str() {
        return "WFLYELY01219: La paire de clés d'intégrité ne peut pas être ajoutée à un domaine de système de fichiers non vide après l'initialisation. Pour mettre à jour un domaine de système de fichiers, utilisez la commande Elytron Tool `filesystem-realm-integrity`";
    }
    @Override
    protected String addSecretKeyToInitializedFilesystemRealm$str() {
        return "WFLYELY01220: La clé secrète de chiffrement ne peut pas être ajoutée à un domaine de système de fichiers non vide après l'initialisation. Pour mettre à jour un domaine de système de fichiers, utilisez la commande Elytron Tool `filesystem-realm-encrypt`";
    }
    @Override
    protected String unableToObtainDynamicSSLContext$str() {
        return "WFLYELY01221: Impossible d'obtenir DynamicSSLContext à partir du contexte d'authentification fourni";
    }
}
