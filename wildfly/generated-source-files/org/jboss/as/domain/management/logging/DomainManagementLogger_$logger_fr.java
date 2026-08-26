package org.jboss.as.domain.management.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:14+0200")
public class DomainManagementLogger_$logger_fr extends DomainManagementLogger_$logger implements DomainManagementLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DomainManagementLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String passwordMustHaveSymbolInfo$str() {
        return "%1$s symbole(s) non alpha-numériques";
    }
    @Override
    protected String argHelp$str() {
        return "Afficher ce message et sortir";
    }
    @Override
    protected String usernamePrompt0$str() {
        return "Nom d'utilisateur";
    }
    @Override
    protected String handlerAlreadyExists$str() {
        return "WFLYDM0063: Les noms de handler doivent être uniques. Il existe déjà un handler nommé '%1$s' dans %2$s";
    }
    @Override
    protected String failedToGenerateSelfSignedCertificate$str() {
        return "WFLYDM0112: Échec de la génération du certificat auto-signé";
    }
    @Override
    protected String invalidChoiceUpdateUserResponse$str() {
        return "WFLYDM0070: Réponse non valide. (Réponses valides: A, a, B, b, C ou c)";
    }
    @Override
    protected String argServerConfigDirUsers$str() {
        return "Définir l'emplacement du répertoire de config du serveur.";
    }
    @Override
    protected String multipleAuthenticationMechanismsDefined$str() {
        return "WFLYDM0033: La configuration du domaine de sécurité '%1$s' inclut des noms d'utilisateur/mots de passe multiples basés sur les mécanismes d'authentification (%2$s). Une seule est permise";
    }
    @Override
    protected String passwordUsernameMustMatchInfo$str() {
        return "Le mot de passe doit être différent du nom d'utilisateur";
    }
    @Override
    protected String addedGroups$str() {
        return "Utilisateur '%1$s' ajouté aux groupes %2$s dans le fichier '%3$s'";
    }
    @Override
    protected String sysLogProtocolAlreadyConfigured$str() {
        return "WFLYDM0059: Il y a déjà un protocole configuré pour le syslog handler dans %1$s";
    }
    @Override
    protected String multipleRealmDeclarations$str() {
        return "Le fichier des propriétés utilisateurs '%1$s' contient plusieurs déclarations de noms de domaines";
    }
    @Override
    protected String realmPrompt$str() {
        return "Domaine (%1$s)";
    }
    @Override
    protected String passwordRequirements$str() {
        return "Les prérequis de mot de passe sont énumérés ci-dessous. Pour modifier ces restrictions, modifier le fichier de configuration add-user.properties.";
    }
    @Override
    protected String badBaseRole$str() {
        return "WFLYDM0081: Le rôle de base '%1$s' n'est pas un des rôles standards du fournisseur d'autorisation en cours.";
    }
    @Override
    protected String suffixContainsMillis$str() {
        return "WFLYDM0104: Le suffixe (%1$s) ne peut pas contenir de secondes ou de millisecondes.";
    }
    @Override
    protected String passwordShouldNotEqualInfo$str() {
        return "Le mot de passe doit correspondre à une des valeurs limitées suivantes {%1$s}";
    }
    @Override
    protected String argEnable$str() {
        return "Activer l'utilisateur";
    }
    @Override
    protected String aliasNotKey$str() {
        return "WFLYDM0084: L'alias spécifié '%1$s' n'est pas une clé, les alias valides sont %2$s";
    }
    @Override
    protected String multipleGroupSearchConfigurationsDefined$str() {
        return "WFLYDM0075: La configuration du domaine de sécurité '%1$s' inclut des ressources group-search multiples dans la ressource authorization=ldap (%2$s). Une seule est permise";
    }
    @Override
    protected String passwordShouldContainInfo$str() {
        return "Le mot de passe doit contenir au moins %1$s";
    }
    @Override
    protected String yesNo$str() {
        return "oui/non ?";
    }
    @Override
    protected String failedToCreateLazyInitSSLContext$str() {
        return "WFLYDM0114: N'a pas pu différer l'initialisation du contexte SSL";
    }
    @Override
    protected String alternativeRealm$str() {
        return "Le nom de domaine fourni doit correspondre au nom utilisé par la configuration du serveur, qui par défaut, correspond à '%1$s'";
    }
    @Override
    protected String invalidConfirmationResponse$str() {
        return "WFLYDM0029: Réponse non valide. (Les réponses valides sont %1$s et %2$s)";
    }
    @Override
    protected String realmMustBeSpecified$str() {
        return "WFLYDM0067: Un nom de domaine doit être spécifié.";
    }
    @Override
    protected String keystoreHasBeenCreated$str() {
        return "WFLYDM0113: Certificat auto-signé généré à l'adresse %1$s. Veuillez noter que les certificats auto-signés ne sont pas sécurisés et ne doivent être utilisés qu'à des fins de test. N'utilisez pas ce certificat auto-signé en production.%nL'empreinte SHA-1 de la clé générée est %2$s%nL'empreinte SHA-256 de la clé générée est %3$s";
    }
    @Override
    protected String passwordConfirmationPrompt$str() {
        return "Saisir mot de passe à nouveau";
    }
    @Override
    protected String aboutToUpdateEnabledUser$str() {
        return "L'utilisateur '%1$s' existe déjà et est activé. Souhaitez-vous ... %n a) mettre à jour les rôles et mot de passe de l'utilisateur existant ? %n b) désactiver l'utilisateur existant ? %n c) saisir un nouveau nom d'utilisateur";
    }
    @Override
    protected String unableToLoadProperties$str() {
        return "WFLYDM0017: Impossible de charger les propriétés";
    }
    @Override
    protected String userSuppliedRealm$str() {
        return "Utiliser le domaine '%1$s' selon les instructions sur la ligne de commande.";
    }
    @Override
    protected String unableToLoadPlugInProviders$str() {
        return "WFLYDM0045: Impossible de charger le plug-in pour le module %1$s en raison de l'erreur (%2$s)";
    }
    @Override
    protected String aliasNotFound$str() {
        return "WFLYDM0085: L'alias spécifié '%1$s' n'existe pas dans le KeyStore, les alias valides sont %2$s";
    }
    @Override
    protected String unableToLoadSimpleNameForGroup$str() {
        return "WFLYDM0110: Impossible de charger un nom simple pour le groupe '%1$s'";
    }
    @Override
    protected String unableToAddUser$str() {
        return "WFLYDM0030: Impossible d'ajouter l'utilisateur %1$s à cause de l'erreur %2$s";
    }
    @Override
    protected String noNonProgressingOperationFound$str() {
        return "WFLYDM0089: Aucune opération ayant pu contenir le verrou d'écriture d'exécution de l'opération pendant plus de [%1$d] secondes n'a été trouvée";
    }
    @Override
    protected String noHandlerCalled$str() {
        return "WFLYDM0058: Il n'y a pas de handler nommé '%1$s'";
    }
    @Override
    protected String passwordUsernameShouldNotMatch$str() {
        return "WFLYDM0098: Le mot de passe doit être différent du nom d'utilisateur";
    }
    @Override
    protected String passwordMustHaveDigit$str() {
        return "WFLYDM0050: Le mot de passe doit comporter au moins un chiffre %1$d.";
    }
    @Override
    protected String imcompatibleConfiguredRequiresAttributeValue$str() {
        return "WFLYDM0144: La contrainte de sensibilité %1$s contient une valeur d'attribut incompatible avec d'autres contraintes de classification sensibles.";
    }
    @Override
    protected String passwordMustNotEqualInfo$str() {
        return "Le mot de passe doit correspondre à une des valeurs limitées suivantes {%1$s}";
    }
    @Override
    protected String no$str() {
        return "non";
    }
    @Override
    protected String outboundConnectionsUnsupported$str() {
        return "WFLYDM0146: Les connexions sortantes ne sont plus prises en charge, veuillez les supprimer de la configuration.";
    }
    @Override
    protected String invalidLocalUser$str() {
        return "WFLYDM0041: L'utilisateur '%1$s' n'est pas autorisé pour une authentification locale.";
    }
    @Override
    protected String noGroupSearchDefined$str() {
        return "WFLYDM0074: La configuration du domaine de sécurité '%1$s' ne comprend pas de ressources group-search dans la ressource authorization=ldap.";
    }
    @Override
    protected String passwordShouldHaveSymbol$str() {
        return "WFLYDM0102: Le mot de passe doit comporter au moins un symbole %1$s non-alphanumérique.";
    }
    @Override
    protected String passwordMustHaveAlphaInfo$str() {
        return "%1$d caractère(s) alphabétique(s)";
    }
    @Override
    protected String passwordRecommendations$str() {
        return "Les recommandations de mot de passe sont énumérés ci-dessous. Pour modifier ces restrictions, modifier le fichier de configuration add-user.properties.";
    }
    @Override
    protected String scopedRoleStandardName$str() {
        return "WFLYDM0080: Le nom '%1$s' entre en conflit avec le nom de rôle standard de '%2$s' - la comparaison respecte la casse.";
    }
    @Override
    protected String securityRealmsUnsupported$str() {
        return "WFLYDM0145: Les domaines de sécurité ne sont plus pris en charge, veuillez les supprimer de la configuration.";
    }
    @Override
    protected String userAndPasswordWarning$str() {
        return "WFLYDM0001: Le fichier de propriétés définies par le mot de passe de l'utilisateur, qui sera facile à deviner.";
    }
    @Override
    protected String usageDescription$str() {
        return "Le script add-user est un utilitaire servant à ajouter des nouveaux utilisateurs aux fichiers de propriétés pour les authentifications prêtes à l'emploi. Il peut également être utilisé pour gérer des utilisateurs dans ManagementRealm et ApplicationRealm.";
    }
    @Override
    protected String argConfirmWarning$str() {
        return "Confirmer automatiquement l'avertissement en mode interactif";
    }
    @Override
    protected String unableToUpdateUser$str() {
        return "WFLYDM0040: Impossible de mettre à jour l'utilisateur %1$s à cause de l'erreur %2$s";
    }
    @Override
    protected String multipleRealmsDetected$str() {
        return "WFLYDM0064: Différents noms de domaines détectés '%1$s', '%2$s' lisant les fichiers de propriétés de l'utilisateur, tous domaines étant égaux.";
    }
    @Override
    protected String inconsistentRbacRuntimeState$str() {
        return "WFLYDM0069: La configuration de mappage de rôle de runtime n'est pas consistante. Le serveur doit être démarré à nouveau.";
    }
    @Override
    protected String passwordMustNotBeEqual$str() {
        return "WFLYDM0049: Le mot de passe doit être égal à '%1$s', cette valeur est limitée.";
    }
    @Override
    protected String passwordShouldHaveAlpha$str() {
        return "WFLYDM0100: Le mot de passe doit contenir au moins un caractère %1$d alphanumérique.";
    }
    @Override
    protected String usernamePrompt1$str() {
        return "Nom d'utilisateur (%1$s)";
    }
    @Override
    protected String noFormatterCalled$str() {
        return "WFLYDM0061: Aucun formateur nommé '%1$s'";
    }
    @Override
    protected String usernameEasyToGuess$str() {
        return "Le nom d'utilisateur '%1$s' est facile à deviner";
    }
    @Override
    protected String invalidKeytab$str() {
        return "WFLYDM0090: Chemin de Keytab non valide";
    }
    @Override
    protected String passwordNotStrongEnough$str() {
        return "WFLYDM0048: Le mot de passe n'est pas suffisamment puissant, il est de '%1$s'. Il devrait être d'au moins '%2$s'.";
    }
    @Override
    protected String argDomainConfigDirUsers$str() {
        return "Définir l'emplacement du répertoire de config de domaine.";
    }
    @Override
    protected String passwordMisMatch$str() {
        return "WFLYDM0026: Les mots de passe ne correspondent pas.";
    }
    @Override
    protected String invalidRoleName$str() {
        return "WFLYDM0076: Le nom du rôle '%1$s' n'est pas un rôle standard valide.";
    }
    @Override
    protected String passwordNotLongEnough$str() {
        return "WFLYDM0053: Le mot de passe devrait être d'au moins %1$s caractères !";
    }
    @Override
    protected String noSyslogProtocol$str() {
        return "WFLYDM0060: Aucun protocole de syslog indiqué";
    }
    @Override
    protected String duplicateScopedRole$str() {
        return "WFLYDM0079: Un %1$s ayant pour nom '%2$s' existe déjà";
    }
    @Override
    protected String userRealmNotMatchDiscovered$str() {
        return "WFLYDM0065: Le nom de domaine fourni par l'utilisateur '%1$s' ne correspond pas au nom de domaine découvert dans le(s) fichier(s) de propriétés '%2$s'.";
    }
    @Override
    protected String invalidChoiceResponse$str() {
        return "WFLYDM0039: Réponse non valide. (Les réponses valides sont A, a, B ou b)";
    }
    @Override
    protected String argUser$str() {
        return "Nom de l'utilisateur";
    }
    @Override
    protected String argUserProperties$str() {
        return "Le nom de fichier du fichier de propriétés de l'utilisateur qui peut être un chemin absolu.";
    }
    @Override
    protected String keyStoreNotFound$str() {
        return "WFLYDM0086: Le KeyStore ne peut être trouvé sur %1$s";
    }
    @Override
    protected String multipleCallbackHandlerForMechanism$str() {
        return "WFLYDM0042: CallbackHandlerServices multiples pour le même mécanisme (%1$s)";
    }
    @Override
    protected String unableToObtainTGT$str() {
        return "WFLYDM0092: Impossible d'obtenir Kerberos TGT";
    }
    @Override
    protected String argPassword$str() {
        return "Le mot de passe de l'utilisateur doit être en rapports aux exigences de mot de passe définies dans la configuration add-user.properties";
    }
    @Override
    protected String argApplicationUsers$str() {
        return "Si défini, ajouter un Appication User au lieu d'un Management User";
    }
    @Override
    protected String sureToAddUser$str() {
        return "Êtes-vous certain de vouloir ajouter l'utilisateur '%1$s' oui/non ?";
    }
    @Override
    protected String unableToOperateOnTrustStore$str() {
        return "WFLYDM0055: Impossible d'opérer sur un trust store.";
    }
    @Override
    protected String noCipherSuitesInCommon$str() {
        return "WFLYDM0095: Aucune suite cipher en commun, prises en charge=(%1$s), demandées=(%2$s)";
    }
    @Override
    protected String shortNo$str() {
        return "n";
    }
    @Override
    protected String aboutToAddUser$str() {
        return "L'utilisateur '%1$s' va être ajouté pour le domaine '%2$s'";
    }
    @Override
    protected String passwordMustContainInfo$str() {
        return "Le mot de passe doit contenir au moins %1$s";
    }
    @Override
    protected String passwordPrompt$str() {
        return "Mot de passe";
    }
    @Override
    protected String usernameNotAlphaNumeric$str() {
        return "WFLYDM0028: Les noms d'utilisateurs doivent être alpha/numériques sauf pour les symboles suivants (%1$s) acceptés";
    }
    @Override
    protected String noPlugInProvidersLoaded$str() {
        return "WFLYDM0044: Aucun plug-in trouvé dans les fournisseurs pour le nom de module %1$s";
    }
    @Override
    protected String unsupportedResource$str() {
        return "WFLYDM0108: Ressource '%1$s' non prise en charge";
    }
    @Override
    protected String updatedGroups$str() {
        return "Mise à jour de l'utilisateur '%1$s' avec les groupes %2$s dans le fichier '%3$s'";
    }
    @Override
    protected String argUsage$str() {
        return "Usage : . ./add-user.sh [args...]%n où les args incluent :";
    }
    @Override
    protected String isCorrectPrompt$str() {
        return "Est-ce correct ?";
    }
    @Override
    protected String multipleUsernameToDnConfigurationsDefined$str() {
        return "WFLYDM0073: La configuration du domaine de sécurité '%1$s' inclut des ressources username-to-dn contenues dans la ressource authorization=ldap (%2$s). Une seule est permise";
    }
    @Override
    protected String shortYes$str() {
        return "oui";
    }
    @Override
    protected String argRealm$str() {
        return "Nom du domaine utilisé pour sécuriser les interfaces de gestion (la valeur par défaut est \"ManagementRealm\")";
    }
    @Override
    protected String cannotRemoveReferencedFormatter$str() {
        return "WFLYDM0062: Impossible de supprimer le formateur, il est toujours référencé par le handler '%1$s'";
    }
    @Override
    protected String usingDeprecatedSystemProperty$str() {
        return "WFLYDM0140: Vous ne devriez pas utiliser la propriété système '%1$s' car elle est dépréciée. Utiliser la configuration de modèle de gestion à la place.";
    }
    @Override
    protected String invalidRoleNameDomain$str() {
        return "WFLYDM0077: Le nom du rôle '%1$s' n'est pas un rôle standard valide, ni un «hosted scoped role», ou un «group scoped role» de serveur.";
    }
    @Override
    protected String filePrompt$str() {
        return "Quel type d'utilisateur souhaitez-vous ajouter ? %n a) Management User (mgmt-users.properties) %n b) Application User (application-users.properties)";
    }
    @Override
    protected String filePermissionsProblemsFound$str() {
        return "WFLYDM0106: Problèmes de permissions de fichier trouvés lors de la tentative de mise à jour du fichier %1$s.";
    }
    @Override
    protected String onlyOneSyslogHandlerProtocol$str() {
        return "WFLYDM0057: Le syslog-handler ne peut contenir qu'un seul protocole %1$s";
    }
    @Override
    protected String noUsernameExiting$str() {
        return "WFLYDM0024: Aucun nom d'utilisateur saisi, sortie.";
    }
    @Override
    protected String invalidSensitiveClassificationAttribute$str() {
        return "WFLYDM0143: Attribut de classification sensible invalide '%1$s'";
    }
    @Override
    protected String errorHeader$str() {
        return "Erreur";
    }
    @Override
    protected String noSecurityContextEstablished$str() {
        return "WFLYDM0037: Aucun contexte de sécurité n'a été établi.";
    }
    @Override
    protected String unableToLoadKeyTrustFile$str() {
        return "WFLYDM0054: Impossible de charger le fichier key trust.";
    }
    @Override
    protected String groupPropertiesButNoUserProperties$str() {
        return "WFLYDM0066: Le fichier de propriétés de groupe '%1$s' a été spécifié, mais aucune propriété d'utilisateur n'a été spécifiée.";
    }
    @Override
    protected String duplicateIncludeExclude$str() {
        return "WFLYDM0071: Le rôle '%1$s' contient déjà un %2$s pour type=%3$s, name=%4$s, realm=%5$s.";
    }
    @Override
    protected String keystoreWillBeCreated$str() {
        return "WFLYDM0111: Keystore %1$s introuvable, il sera généré automatiquement lors de la première utilisation avec un certificat auto-signé pour l'hôte. %2$s";
    }
    @Override
    protected String unableToCreateDelegateTrustManager$str() {
        return "WFLYDM0056: Impossible de créer un trust manager délégué.";
    }
    @Override
    protected String argGroup$str() {
        return "Liste de groupes séparés par des virgules pour l'utilisateur.";
    }
    @Override
    protected String passwordMustHaveAlpha$str() {
        return "WFLYDM0052: Le mot de passe doit comporter au moins un caractère %1$d alphanumérique.";
    }
    @Override
    protected String noPasswordExiting$str() {
        return "WFLYDM0025: Aucun mot de passe saisi, sortie.";
    }
    @Override
    protected String passwordShouldHaveXCharacters$str() {
        return "WFLYDM0099: Le mot de passe doit contenir au moins %1$s caractères !";
    }
    @Override
    protected String noConsoleAvailable$str() {
        return "WFLYDM0021: Aucune java.io.Console disponible pour interagir avec l'utilisateur.";
    }
    @Override
    protected String unableToObtainCredential$str() {
        return "Impossible d'obtenir les informations d'identification pour le serveur %1$s";
    }
    @Override
    protected String invalidSize$str() {
        return "WFLYDM0103: Taille %1$s non valide";
    }
    @Override
    protected String unableToLoadUsers$str() {
        return "WFLYDM0031: Impossible d'ajouter des utilisateurs de la charge de %1$s en raison de l'erreur %2$s";
    }
    @Override
    protected String roleMappingRemaining$str() {
        return "WFLYDM0078: Le scoped role '%1$s' ne peut pas être supprimé car il y a encore un mappage de rôle.";
    }
    @Override
    protected String passwordUsernameShouldMatchInfo$str() {
        return "Le mot de passe doit être différent du nom d'utilisateur";
    }
    @Override
    protected String passwordShouldHaveDigit$str() {
        return "WFLYDM0101: Le mot de passe doit comporter au moins un chiffre %1$d.";
    }
    @Override
    protected String operationFailedOneOfRequired$str() {
        return "WFLYDM0034: '%1$s' ou '%2$s' requis.";
    }
    @Override
    protected String noCallbackHandlerForMechanism$str() {
        return "WFLYDM0043: Aucun CallbackHandler disponible pour le mécanisme %1$s su domaine %2$s";
    }
    @Override
    protected String keyTabFileNotFound$str() {
        return "WFLYDM0109: Le fichier Keytab '%1$s' n'existe pas.";
    }
    @Override
    protected String removedBrokenResource$str() {
        return "WFLYDM0135: La ressource %1$s ne fonctionnait pas correctement et a été supprimée.";
    }
    @Override
    protected String inconsistentRbacConfiguration$str() {
        return "WFLYDM0068: Les opération(s) courantes menaient à l'activation du contrôle d'accès basé rôle mais rendant impossible l'assignation de rôles aux utilisateurs authentiqués.";
    }
    @Override
    protected String invalidSuffix$str() {
        return "WFLYDM0105: Le suffixe (%1$s) est non valide. Un suffixe doit être sous la forme d'un format valide.";
    }
    @Override
    protected String usernameNotLoaded$str() {
        return "WFLYDM0088: Impossible de charger le nom d'utilisateur pour le nom d'utilisateur fourni '%1$s'";
    }
    @Override
    protected String propertiesFileNotFound$str() {
        return "WFLYDM0023: Aucun fichier %1$s trouvé.";
    }
    @Override
    protected String groupsPrompt$str() {
        return "Quels groupes souhaitez-vous impartir à cet utilisateur ? (Veuillez saisir une liste séparée par des virgules, ou laisser vide)";
    }
    @Override
    protected String kerberosWithoutKeytab$str() {
        return "WFLYDM0094: Kerberos est activé pour l'authentification sur le domaine de sécurité '%1$s' mais aucun Keytab n'a été ajouté au serveur-identity.";
    }
    @Override
    protected String passwordMustHaveSymbol$str() {
        return "WFLYDM0051: Le mot de passe doit comporter au moins un symbole %1$s non-alphanumérique.";
    }
    @Override
    protected String multipleAuthorizationConfigurationsDefined$str() {
        return "WFLYDM0072: La configuration du domaine de sécurité '%1$s' inclut des configurations d'autorisations multiples (%2$s). Une seule est permise";
    }
    @Override
    protected String operationFailedOnlyOneOfRequired$str() {
        return "WFLYDM0035: Un seul '%1$s' ou '%2$s' requis.";
    }
    @Override
    protected String multipleCacheConfigurationsDefined$str() {
        return "WFLYDM0087: La configuration du domaine de sécurité '%1$s' inclut des définitions de cache multiples sur la même position dans le hiérarchie. Une seule est autorisée";
    }
    @Override
    protected String noSubjectIdentityForProtocolAndHost$str() {
        return "WFLYDM0139: Aucune identité de sujet trouvée pour %1$s/%2$s.";
    }
    @Override
    protected String passwordLengthInfo$str() {
        return "%1$s caractères";
    }
    @Override
    protected String noKey$str() {
        return "WFLYDM0083: Le KeyStore %1$s ne contient aucune clé.";
    }
    @Override
    protected String domainRolloutNotProgressing$str() {
        return "WFLYDM0107: L'opération '%1$s' détient le verrou d'écriture de l'exécution de l'opération depuis plus de [%2$d] secondes, mais elle fait partie du déploiement d'une opération à l'échelle du domaine avec le domain-uuid '%3$s' qui a d'autres opérations qui ne progressent pas. Leurs ids sont : %4$s. L'annulation de l'opération sur le contrôleur de domaine est recommandée.";
    }
    @Override
    protected String legacyMechanismsAreNotSupported$str() {
        return "WFLYDM0142: Les mécanismes suivants configurés sur le serveur (%1$s) ne sont pas supportés par le domaine '%2$s'.";
    }
    @Override
    protected String callbackHandlerNotInitialized$str() {
        return "Le gestionnaire de rappel (callback handler) n'est pas initialisé pour le serveur de domaine %1$s.";
    }
    @Override
    protected String subjectIdentityLoggedOut$str() {
        return "WFLYDM0091: déconnexion déjà demandée pour ce SubjectIdentity.";
    }
    @Override
    protected String passwordMustHaveDigitInfo$str() {
        return "%1$d digit(s)";
    }
    @Override
    protected String argSilent$str() {
        return "Active le mode silencieux (par de sortie vers la console)";
    }
    @Override
    protected String aboutToUpdateDisabledUser$str() {
        return "L'utilisateur '%1$s' existe déjà et est désactivé. Souhaitez-vous ... %n a) mettre à jour les rôles et mot de passe de l'utilisateur existant ? %n b) activer l'utilisateur existant ? %n c) saisir un nouveau nom d'utilisateur";
    }
    @Override
    protected String noAuthenticationPlugInFound$str() {
        return "WFLYDM0046: Aucun plug-in d'authentification trouvé pour le nom %1$s";
    }
    @Override
    protected String argGroupProperties$str() {
        return "Le nom de fichier du fichier de propriétés du groupe qui peut être un chemin absolu. (Si les propriétés de groupes sont spécifiées, alors les propriétés utilisateur DOIVENT être également spécifiées).";
    }
    @Override
    protected String realmConfirmation$str() {
        return "Êtes-vous certain de vouloir définir le domaine à '%1$s'";
    }
    @Override
    protected String keytabLoginFailed$str() {
        return "WFLYDM0093: La connexion n'a pas réussi avec Keytab utilisé pour que le principal '%1$s' gère la requête de l'hôte '%2$s'";
    }
    @Override
    protected String discoveredRealm$str() {
        return "Utiliser le domaine '%1$s' selon les fichiers de propriétés existants.";
    }
    @Override
    protected String unableToInitialisePlugIn$str() {
        return "WFLYDM0047: Impossible d'initialiser le plug-in %1$s à cause de l'erreur %2$s";
    }
    @Override
    protected String updateUser$str() {
        return "Utilisateur '%1$s' mis à jour dans le fichier '%2$s'";
    }
    @Override
    protected String noProtocolsInCommon$str() {
        return "WFLYDM0096: Aucun protocole en commun, pris en charge=(%1$s), demandé=(%2$s)";
    }
    @Override
    protected String sureToSetPassword$str() {
        return "Êtes-vous certain de vouloir définir le mot de passe saisi oui/non ?";
    }
    @Override
    protected String passwordUsernameMatchError$str() {
        return "WFLYDM0082: Le mot de passe doit être différent du nom d'utilisateur";
    }
    @Override
    protected String passwordShouldNotBeEqual$str() {
        return "WFLYDM0097: Le mot de passe ne doit pas être égal à '%1$s', cette valeur est restreinte.";
    }
    @Override
    protected String enterNewUserDetails$str() {
        return "Saisir les informations sur le nouvel utilisateur.";
    }
    @Override
    protected String yes$str() {
        return "oui";
    }
    @Override
    protected String addedUser$str() {
        return "Utilisateur '%1$s' ajouté au fichier '%2$s'";
    }
    @Override
    protected String argRole$str() {
        return "Liste de rôles séparés par des virgules pour l'utilisateur.";
    }
    @Override
    protected String argDisable$str() {
        return "Désactiver l'utilisateur";
    }
    @Override
    protected String userNotFoundInDirectory$str() {
        return "WFLYDM0020: Utilisateur '%1$s' non trouvé dans le répertoire.";
    }
}
