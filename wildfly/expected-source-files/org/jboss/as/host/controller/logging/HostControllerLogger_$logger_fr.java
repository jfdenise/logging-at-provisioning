package org.jboss.as.host.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:30+0200")
public class HostControllerLogger_$logger_fr extends HostControllerLogger_$logger implements HostControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public HostControllerLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotConnect$str() {
        return "WFLYHC0001: N'a pas pu se connecter au contrôleur de domaine distant %1$s";
    }
    @Override
    protected String cannotConnectToMaster$str() {
        return "WFLYHC0002: Impossible de se connecter au contrôleur de domaine. L'erreur était : %1$s";
    }
    @Override
    protected String creatingHttpManagementService$str() {
        return "WFLYHC0003: Création d'un service de gestion internet par l'interface de réseau (%1$s) port (%2$d) securePort (%3$d)";
    }
    @Override
    protected String existingServerWithState$str() {
        return "WFLYHC0005: Serveur existant [%1$s] ayant pour statut : %2$s";
    }
    @Override
    protected String failedToStartServer$str() {
        return "WFLYHC0008: N'a pas pu démarrer le serveur (%1$s)";
    }
    @Override
    protected String failedToStopServer$str() {
        return "WFLYHC0009: N'a pas pu stopper le serveur (%1$s)";
    }
    @Override
    protected String ignoringPermGen$str() {
        return "WFLYHC0011: Ignorer <permgen> pour jvm '%1$s' type jvm: %2$s";
    }
    @Override
    protected String noDomainControllerConfigurationProvided$str() {
        return "WFLYHC0012: Aucune configuration de <domain-controller> n'a été fournie et le mode d'exécution actuel ('%1$s') requiert un accès à l'hôte du Contrôleur de domaine. Le démarrage va être interrompu. Utiliser le ligne de commande %2$s pour démarrer en mode %3$s si vous avez besoin de démarrer sans connexion de contrôleur de domaine, puis utiliser les outils de gestion pour en configurer une.";
    }
    @Override
    protected String httpManagementInterfaceIsUnsecured$str() {
        return "WFLYHC0013: Aucun domaine de sécurité n'a été fourni pour le service de gestion http, tous les accès seront illimités.";
    }
    @Override
    protected String noServerAvailable$str() {
        return "WFLYHC0014: Aucun serveur nommé %1$s sera disponible";
    }
    @Override
    protected String lostRemoteDomainConnection$str() {
        return "WFLYHC0015: Connexion au contrôleur hôte fermée. Tentative de connexion à nouveau.";
    }
    @Override
    protected String optionAlreadySet$str() {
        return "WFLYHC0016: Ignorer <option value=\"%1$s\" pour jvm '%2$s' puisque '%3$s' a été défini";
    }
    @Override
    protected String reconnectingServer$str() {
        return "WFLYHC0018: Reconnexion du serveur %1$s";
    }
    @Override
    protected String registeredRemoteSlaveHost$str() {
        return "WFLYHC0019: Hôte secondaire distant enregistré \"%1$s\", %2$s";
    }
    @Override
    protected String registeringServer$str() {
        return "WFLYHC0020: Enregistrement du serveur %1$s";
    }
    @Override
    protected String serverConnected$str() {
        return "WFLYHC0021: Serveur [%1$s] connecté avec la connexion [%2$s]";
    }
    @Override
    protected String startingServer$str() {
        return "WFLYHC0023: Démarrage du serveur %1$s";
    }
    @Override
    protected String stoppingServer$str() {
        return "WFLYHC0024: Interruption du serveur %1$s";
    }
    @Override
    protected String unregisteredRemoteSlaveHost$str() {
        return "WFLYHC0026: Hôte secondaire distant non enregistré \"%1$s\"";
    }
    @Override
    protected String unregisteringServer$str() {
        return "WFLYHC0027: Serveur %1$s non enregistré";
    }
    @Override
    protected String unregisteredAtRemoteHostController$str() {
        return "WFLYHC0029: Non enregistré dans le contrôleur du domaine";
    }
    @Override
    protected String lostConnectionToRemoteHost$str() {
        return "WFLYHC0030: La connexion à l'hôte distant \"%1$s\" a été fermée de façon inattendue";
    }
    @Override
    protected String invalidRemoteBackupPersisterState$str() {
        return "WFLYHC0031: Impossible de charger le modèle de domaine avec --backup";
    }
    @Override
    protected String caughtExceptionDuringBoot$str() {
        return "WFLYHC0033: Exception interceptée au démarrage";
    }
    @Override
    protected String unsuccessfulBoot$str() {
        return "WFLYHC0034: L'amorçage du contrôleur hôte a échoué de manière irréversible ; sortie. Voir les messages précédents pour plus de détails. %1$s";
    }
    @Override
    protected String reportAdminOnlyDomainXmlFailure$str() {
        return "WFLYHC0035: L'installation de la configuration dans le domaine a échoué. Comme le mode d'exécution de ce Host Controller est ADMIN_ONLY, le démarrage a pu continuer. Si le mode ADMIN_ONLY n'était pas actif, le processus aurait été interrompu pour cause d'échec critique au démarrage (boot).";
    }
    @Override
    protected String masterHostControllerChanged$str() {
        return "WFLYHC0037: Le contrôleur hôte primaire a été redémarré. Réenregistrement de ce contrôleur hôte secondaire avec le nouveau contrôleur primaire.";
    }
    @Override
    protected String masterHostControllerUnreachable$str() {
        return "WFLYHC0038: Le contrôleur de domaine n'a pas pu être joint dans les dernières [%1$d] millisecondes. Reconnexion.";
    }
    @Override
    protected String slaveHostControllerChanged$str() {
        return "WFLYHC0039: Le contrôleur hôte secondaire \"%1$s\" a été redémarré ou tente de se reconnecter. Désenregistrement de la connexion actuelle à ce secondaire.";
    }
    @Override
    protected String slaveHostControllerUnreachable$str() {
        return "WFLYHC0040: Le contrôleur hôte secondaire \"%1$s\" n'a pas pu être joint au cours des dernières millisecondes [%2$d]. Désenregistrement.";
    }
    @Override
    protected String argumentExpected$str() {
        return "WFLYHC0041: Argument attendu pour l'option %1$s. %2$s";
    }
    @Override
    protected String attemptingToSet$str() {
        return "WFLYHC0042: Tentative de définir '%1$s' alors que '%2$s' était déjà défini";
    }
    @Override
    protected String authenticationFailureUnableToConnect$str() {
        return "WFLYHC0043: N'a pas pu se connecter pour cause d'échec d'authentification.";
    }
    @Override
    protected String cannotAccessRemoteFileRepository$str() {
        return "WFLYHC0044: Impossible d'accéder à un référentiel de fichiers distant depuis le contrôleur de domaine";
    }
    @Override
    protected String cannotCreateLocalDirectory$str() {
        return "WFLYHC0045: N'a pas pu créer un répertoire local : %1$s";
    }
    @Override
    protected String cannotObtainValidDefaultAddress$str() {
        return "WFLYHC0046: N'a pas pu obtenir une adresse valide par défaut pour communiquer avec le ProcessController en utilisant %1$s ou InetAddress.getLocalHost(). Veuillez vérifier votre configuration réseau sur votre système ou bien utiliser le commutateur de ligne de commande %2$s pour configurer une adresse valide";
    }
    @Override
    protected String cannotRestartServer$str() {
        return "WFLYHC0047: N'a pas pu démarrer à nouveau le serveur %1$s car il n'a pas encore démarré; il est %2$s";
    }
    @Override
    protected String cannotStartServersInvalidMode$str() {
        return "WFLYHC0048: N'a pas pu démarrer les serveurs quand le mode d'exécution du Host Controller est %1$s";
    }
    @Override
    protected String closeShouldBeManagedByService$str() {
        return "WFLYHC0049: La fermeture doit être gérée par le service";
    }
    @Override
    protected String configurationPersisterAlreadyInitialized$str() {
        return "WFLYHC0050: Le persisteur de configuration du modèle de domaine est déjà initialisé";
    }
    @Override
    protected String connectionToMasterInterrupted$str() {
        return "WFLYHC0051: Interruption lors de la tentative de connexion au contrôleur de domaine";
    }
    @Override
    protected String connectionToMasterTimeout$str() {
        return "WFLYHC0052: Impossible de se connecter au contrôleur de domaine lors de %1$d tentatives dans un délai de %2$s ms";
    }
    @Override
    protected String couldNotGetServerInventory$str() {
        return "WFLYHC0053: N'a pas pu obtenir l'inventaire du serveur dans %1$d %2$s";
    }
    @Override
    protected String didNotReadEntireFile$str() {
        return "WFLYHC0054: N'a pas lu le fichier dans son entier. %1$d Manquant";
    }
    @Override
    protected String errorClosingDownHost$str() {
        return "WFLYHC0055: Erreur lors de la fermeture de l'hôte";
    }
    @Override
    protected String failedProfileOperationsRetrieval$str() {
        return "WFLYHC0056: N'a pas pu extraire les opérations de profil du contrôleur du domaine";
    }
    @Override
    protected String failedToGetFileFromRemoteRepository$str() {
        return "WFLYHC0057: N'a pas pu obtenir de fichier du référentiel distant";
    }
    @Override
    protected String failedToGetServerStatus$str() {
        return "WFLYHC0058: N'a pas pu obtenir le statut du serveur";
    }
    @Override
    protected String failedToReadAuthenticationKey$str() {
        return "WFLYHC0059: N'a pas pu lire la clé d'authentification : %1$s";
    }
    @Override
    protected String insufficientInformationToGenerateHash$str() {
        return "WFLYHC0061: Informations insuffisantes pour générer le hachage.";
    }
    @Override
    protected String invalidOption$str() {
        return "WFLYHC0062: Option non valide '%1$s'. %2$s";
    }
    @Override
    protected String invalidRootId$str() {
        return "WFLYHC0063: id root non valide [%1$d]";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYHC0064: La valeur de %1$s ne correspond pas à un %2$s -- %3$s. %4$s";
    }
    @Override
    protected String invocationNotAllowedAfterBoot$str() {
        return "WFLYHC0065: Les invocations de %1$s après le démarrage du HostController sont permises";
    }
    @Override
    protected String malformedUrl$str() {
        return "WFLYHC0066: URL mal formé fourni pour l'option %1$s. %2$s";
    }
    @Override
    protected String mustInvokeBeforeCheckingSlaveStatus$str() {
        return "WFLYHC0067: Il faut appeler %1$s avant de vérifier l'état du contrôleur hôte secondaire";
    }
    @Override
    protected String mustInvokeBeforePersisting$str() {
        return "WFLYHC0068: Doit appeler %1$s avant de persister le modèle du domaine";
    }
    @Override
    protected String noServerInventory$str() {
        return "WFLYHC0071: Pas d'inventaire de serveur";
    }
    @Override
    protected String serverNameAlreadyRegistered$str() {
        return "WFLYHC0077: Il existe déjà un serveur enregistré nommé '%1$s'";
    }
    @Override
    protected String serverStillRunning$str() {
        return "WFLYHC0078: Le serveur (%1$s) est en cours d'exécution";
    }
    @Override
    protected String unableToGenerateHash$str() {
        return "WFLYHC0079: Impossible de générer le hachage";
    }
    @Override
    protected String unableToLoadProperties$str() {
        return "WFLYHC0080: Impossible de charger les propriétés de l'URL %1$s. %2$s";
    }
    @Override
    protected String undefinedSocketBinding$str() {
        return "WFLYHC0081: Groupe de liaison de sockets non défini pour le serveur %1$s";
    }
    @Override
    protected String undefinedSocketBindingGroup$str() {
        return "WFLYHC0082: Le groupe de liaisons de sockets %1$s inclus n'est pas défini";
    }
    @Override
    protected String unknown$str() {
        return "WFLYHC0084: %1$s %2$s Inconnu";
    }
    @Override
    protected String unknownHostValue$str() {
        return "WFLYHC0085: La valeur de %1$s n'est pas un hôte connu -- %2$s. %3$s";
    }
    @Override
    protected String hostAlreadyShutdown$str() {
        return "WFLYHC0087: Le Host-Controller est déjà fermé.";
    }
    @Override
    protected String hostControllerSystemPropertyUpdateNotSupported$str() {
        return "WFLYHC0090: HostControllerEnvironment ne prend pas en charge les mises à jour de propriétés système";
    }
    @Override
    protected String cannotIgnoreTypeHost$str() {
        return "WFLYHC0091: Les ressources de type %1$s ne peuvent pas être ignorées";
    }
    @Override
    protected String duplicateIgnoredResourceType$str() {
        return "WFLYHC0092: Un élément '%1$s' dont le type d'attribut est '%2$s' a déjà été trouvé";
    }
    @Override
    protected String cannotAccessJvmInputArgument$str() {
        return "WFLYHC0093: On ne peut pas accéder aux arguments entrants JVM, donc les propriétés système passées directement à ce Host Controller JVM ne seront pas passées aux processus du serveur. Cause du problème : %1$s";
    }
    @Override
    protected String missingHomeDirConfiguration$str() {
        return "WFLYHC0094: Valeur de configuration manquante pour : %1$s";
    }
    @Override
    protected String homeDirectoryDoesNotExist$str() {
        return "WFLYHC0095: Le répertoire d'accueil (home) n'existe pas : %1$s";
    }
    @Override
    protected String domainBaseDirectoryDoesNotExist$str() {
        return "WFLYHC0097: Le répertoire de base du domaine n'existe pas : %1$s";
    }
    @Override
    protected String domainBaseDirectoryIsNotADirectory$str() {
        return "WFLYHC0098: Le répertoire de base du domaine n'est pas un répertoire : %1$s";
    }
    @Override
    protected String configDirectoryDoesNotExist$str() {
        return "WFLYHC0099: Le répertoire de configuration n'existe pas : %1$s";
    }
    @Override
    protected String domainDataDirectoryIsNotDirectory$str() {
        return "WFLYHC0100: Le répertoire de données du domaine n'est pas un répertoire : %1$s";
    }
    @Override
    protected String couldNotCreateDomainDataDirectory$str() {
        return "WFLYHC0101: N'a pas pu créer un répertoire de données de domaine : %1$s";
    }
    @Override
    protected String domainContentDirectoryIsNotDirectory$str() {
        return "WFLYHC0102: Le répertoire du contenu du domaine n'est pas un répertoire : %1$s";
    }
    @Override
    protected String couldNotCreateDomainContentDirectory$str() {
        return "WFLYHC0103: N'a pas pu créer un répertoire de contenu de domaine : %1$s";
    }
    @Override
    protected String logDirectoryIsNotADirectory$str() {
        return "WFLYHC0104: Le répertoire log n'est pas un répertoire : %1$s";
    }
    @Override
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYHC0105: N'a pas pu créer un répertoire de log : %1$s";
    }
    @Override
    protected String serversDirectoryIsNotADirectory$str() {
        return "WFLYHC0106: Le répertoire des serveurs n'est pas un répertoire : %1$s";
    }
    @Override
    protected String couldNotCreateServersDirectory$str() {
        return "WFLYHC0107: N'a pas pu créer un répertoire de serveurs : %1$s";
    }
    @Override
    protected String domainTempDirectoryIsNotADirectory$str() {
        return "WFLYHC0108: Le répertoire temp du domaine n'existe pas : %1$s";
    }
    @Override
    protected String couldNotCreateDomainTempDirectory$str() {
        return "WFLYHC0109: N'a pas pu créer un répertoire temp de domaine : %1$s";
    }
    @Override
    protected String sslFailureUnableToConnect$str() {
        return "WFLYHC0110: N'a pas pu se connecter pour cause d'échec SSL.";
    }
    @Override
    protected String jvmOptionAlreadyExists$str() {
        return "WFLYHC0111: L'option '%1$s' existe déjà";
    }
    @Override
    protected String unsupportedManagementVersionForHost$str() {
        return "WFLYHC0113: La version de gestion de contrôleur hôte %1$s.%2$s est trop ancienne, seule la version %3$s.%4$s ou version supérieure sont prises en charge";
    }
    @Override
    protected String failedToAddExtensions$str() {
        return "WFLYHC0114: N'a pas pu ajouter des extensions utilisées par le domaine. Description de l'échec : %1$s";
    }
    @Override
    protected String argumentHasNoValue$str() {
        return "WFLYHC0115: Argument %1$s n'a aucune valeur. %2$s";
    }
    @Override
    protected String usageNote$str() {
        return "Utiliser %1$s --help pour les informations sur les arguments de lignes de commandes valides et pour leurs syntaxes.";
    }
    @Override
    protected String cannotAccessS3File$str() {
        return "WFLYHC0116: Impossible d'accéder au fichier S3: %1$s";
    }
    @Override
    protected String failedMarshallingDomainControllerData$str() {
        return "WFLYHC0117: N'a pas pu obtenir de données du contrôleur de domaine du fichier S3";
    }
    @Override
    protected String cannotWriteToS3File$str() {
        return "WFLYHC0118: Impossible d'écrire les données du contrôleur de domaine dans le fichier S3: %1$s";
    }
    @Override
    protected String cannotAccessS3Bucket$str() {
        return "WFLYHC0119: N'a pas pu accéder au compartiment S3 '%1$s': %2$s";
    }
    @Override
    protected String discoveryOptionsFailureUnableToConnect$str() {
        return "WFLYHC0120: A essayé toutes les options discovery du contrôleur de domaine, et impossible de connecter";
    }
    @Override
    protected String preSignedUrlsMustHaveSamePath$str() {
        return "WFLYHC0121: «pre_signed_put_url» et «pre_signed_delete_url» doivent avoir le même chemin";
    }
    @Override
    protected String preSignedUrlsMustBeSetOrUnset$str() {
        return "WFLYHC0122: «pre_signed_put_url» et «pre_signed_delete_url» doivent être tous deux définis ou tous deux non définis";
    }
    @Override
    protected String preSignedUrlMustPointToFile$str() {
        return "WFLYHC0123: «pre-signed url %1$s» doit pointer vers un fichier qui se trouve dans un compartiment";
    }
    @Override
    protected String invalidPreSignedUrl$str() {
        return "WFLYHC0124: «pre-signed url %1$s» non valide";
    }
    @Override
    protected String invalidPreSignedUrlLength$str() {
        return "WFLYHC0125: «pre-signed url %1$s» peuvent n'avoir qu'un seul sous-répertoire dans un compartiment";
    }
    @Override
    protected String creatingBucketWithUnsupportedCallingFormat$str() {
        return "WFLYHC0126: Création de compartiment limité à une location avec un format d'appel non pris en charge";
    }
    @Override
    protected String invalidS3Location$str() {
        return "WFLYHC0127: Location non valide : %1$s";
    }
    @Override
    protected String invalidS3Bucket$str() {
        return "WFLYHC0128: Nom de compartiment non valide : %1$s";
    }
    @Override
    protected String bucketAuthenticationFailure$str() {
        return "WFLYHC0129: le compartiment '%1$s' n'a pu être accédé (rsp=%2$d (%3$s)). Le compartiment appartient sans doute déjà à quelqu'un d'autre ou l'authentification a échoué";
    }
    @Override
    protected String unexpectedResponse$str() {
        return "WFLYHC0130: Réponse inattendue : %1$s";
    }
    @Override
    protected String httpRedirectSupportRequired$str() {
        return "WFLYHC0131: Support de redirection HTTP requis";
    }
    @Override
    protected String errorParsingBucketListings$str() {
        return "WFLYHC0132: Erreur inattendue lors du traitement des listings du compartiment";
    }
    @Override
    protected String cannotInitializeSaxDriver$str() {
        return "WFLYHC0133: N'a pas pu initialiser de driver SAX pour XML Reader";
    }
    @Override
    protected String cannotInstantiateDiscoveryOptionClass$str() {
        return "WFLYHC0134: N'a pas pu instancier la classe d'option discovery '%1$s': %2$s";
    }
    @Override
    protected String cannotWriteDomainControllerData$str() {
        return "WFLYHC0137: Impossible d'écrire les données du contrôleur de domaine dans un fichier S3. Erreur: %1$s";
    }
    @Override
    protected String cannotRemoveS3File$str() {
        return "WFLYHC0138: N'a pas pu retirer le fichier S3. Erreur: %1$s";
    }
    @Override
    protected String cannotExecuteTransactionalOperationFromSlave$str() {
        return "WFLYHC0140: Impossible d'exécuter l'opération transactionnelle '%1$s' à partir du contrôleur hôte secondaire";
    }
    @Override
    protected String failedToApplyDomainConfig0$str() {
        return "WFLYHC0142: Échec de l'application d'une configuration à l'échelle du domaine à partir du contrôleur de domaine";
    }
    @Override
    protected String failedToApplyDomainConfig2$str() {
        return "WFLYHC0143: Échec de l'application de la configuration à l'échelle du domaine à partir du contrôleur de domaine. Résultat de l'opération : %1$s. Description de l'échec %2$s";
    }
    @Override
    protected String fetchConfigFromDomainMasterFailed$str() {
        return "WFLYHC0144: L'hôte n'a pas pu démarrer car il a été démarré en mode '%1$s' n'ayant pas accès à une copie locale de la règle de configuration pour le domaine dans son ensemble. L'attribut '%2$s' a été défini sur '%3$s' et la politique de configuration de domaine n'a pas pu être obtenue de la part de l'hôte du contrôleur de domaine. Le démarrage sera abandonné. Utilisez l'argument de ligne de commande '%4$s' pour démarrer si vous avez besoin de démarrer sans vous connecter à un contrôleur de domaine.";
    }
    @Override
    protected String noAccessControlConfigurationAvailable$str() {
        return "WFLYHC0145: L'hôte ne peut pas démarrer car il a été lancé en mode '%1$s' et n'a donc pas accès à une copie locale de la politique de configuration de domaine dans son ensemble. L'attribut de '%2$s' a été défini sur '%3$s'. Le démarrage sera abandonné. Utilisez l'argument de ligne de commande '%4$s' pour démarrer en mode '%5$s'.";
    }
    @Override
    protected String failedDiscoveringMaster$str() {
        return "WFLYHC0146: Impossible de découvrir le contrôleur de domaine à l'aide de l'option de découverte %1$s. L'erreur était : %2$s";
    }
    @Override
    protected String noDiscoveryOptionsLeft$str() {
        return "WFLYHC0147: Aucune option discovery de contrôleur de domaine restante.";
    }
    @Override
    protected String connectedToMaster$str() {
        return "WFLYHC0148: Connecté au contrôleur de domaine à %1$s";
    }
    @Override
    protected String usingCachedDC$str() {
        return "WFLYHC0149: L'option %1$s a été définie; obtenant la configuration de %2$s pour tout le domaine";
    }
    @Override
    protected String reconnectingToMaster$str() {
        return "WFLYHC0150: Essaye de se reconnecter au contrôleur de domaine.";
    }
    @Override
    protected String noDomainControllerConfigurationProvidedForAdminOnly$str() {
        return "WFLYHC0151: Aucune configuration discovery de contrôleur de domaine n'a été fournie et l'attribut '%1$s' a été défini à '%2$s'. Le démarrage va être interrompu. Utiliser le ligne de commande %3$s pour démarrer en mode %4$s si vous avez besoin de démarrer sans connexion de contrôleur de domaine, puis utiliser les outils de gestion pour en configurer une.";
    }
    @Override
    protected String serverLaunchCommandPrefix$str() {
        return "WFLYHC0152: Le serveur %1$s commencera avec le préfixe '%2$s' de la commande de lancement JVM";
    }
    @Override
    protected String channelClosed$str() {
        return "WFLYHC0153: Canal fermé";
    }
    @Override
    protected String couldNotCreateDomainAutoStartDirectory$str() {
        return "WFLYHC0157: N'a pas pu créer un répertoire auto-start de domaine : %1$s";
    }
    @Override
    protected String couldNotPersistAutoStartServerStatus$str() {
        return "WFLYHC0158: Erreur persistant statut autostart de serveur";
    }
    @Override
    protected String invalidDiscoveryType$str() {
        return "WFLYHC0159: Type de détection non valide %1$s";
    }
    @Override
    protected String couldNotObtainDomainUuid$str() {
        return "WFLYHC0160: Impossible de lire ou créer l'UUID de domaine dans le fichier : %1$s";
    }
    @Override
    protected String bindingNameNotUnique$str() {
        return "WFLYHC0162: Le nom de liaison '%1$s' dans le groupe de liaison de socket '%2$s' n'est pas unique. Les noms doivent être uniques sur toutes les liaisons socket-binding, local-destination-outbound-socket-binding et remote-destination-outbound-socket-binding";
    }
    @Override
    protected String profileInvolvedInACycle$str() {
        return "WFLYHC0163: Le profile '%1$s' est inclus dans un cycle";
    }
    @Override
    protected String profileAttemptingToOverrideSubsystem$str() {
        return "WFLYHC0164: Le profil '%1$s' définit le sous-système '%2$s' qui est également défini dans son ancien profil '%3$s'. Le remplacement de sous-systèmes n'est pas pris en charge";
    }
    @Override
    protected String socketBindingGroupInvolvedInACycle$str() {
        return "WFLYHC0165: Le groupe de liaison de socket '%1$s' est inclus dans un cycle";
    }
    @Override
    protected String socketBindingGroupAttemptingToOverrideSocketBinding$str() {
        return "WFLYHC0166: Le groupe de liaison de socket '%1$s' définit la liaison de socket '%2$s' qui est également définie dans son groupe de liaison de socket '%3$s'. Le remplacement de liaisons de socket n'est pas pris en charge";
    }
    @Override
    protected String profileIncludesSameSubsystem$str() {
        return "WFLYHC0167: Le profil '%1$s' inclut le profil '%2$s' et '%3$s'. Ces deux profils définissent le sous-système '%4$s', qui n'est pas pris en charge";
    }
    @Override
    protected String socketBindingGroupIncludesSameSocketBinding$str() {
        return "WFLYHC0168: Le groupe de liaisons de socket '%1$s' inclut les groupes de liaison de socket '%2$s' et '%3$s'. Ces deux groupes définissent la liaison de socket '%4$s', qui n'est pas pris en charge";
    }
    @Override
    protected String embeddedHostControllerRestartMustProvideAdminOnlyTrue$str() {
        return "WFLYHC0169: Le rechargement en mode d'exécution n'est pas pris en charge avec un contrôleur d'hôte intégré, admin-only=true doit être spécifié.";
    }
    @Override
    protected String hostRegistrationCannotReleaseSharedLock$str() {
        return "WFLYHC0170: Erreur lors de la libération du verrou partagé suite à l'enregistrement de l'hôte pour operationID: %1$s";
    }
    @Override
    protected String suspendListenerFailed$str() {
        return "WFLYHC0171: N'a pas pu obtenir de réponse de la part de l'écouteur en attente sur le serveur : %1$s";
    }
    @Override
    protected String suspendExecutionFailed$str() {
        return "WFLYHC0172: N'a pas pu exécuter l'opération en attente sur le serveur : %1$s";
    }
    @Override
    protected String cannotBothHaveFalseUseCurrentHostConfigAndHostConfig$str() {
        return "WFLYHC0173: Il n'est pas possible d'utiliser use-current-host-config=false quand on spécifie une host-config";
    }
    @Override
    protected String cannotBothHaveFalseUseCurrentDomainConfigAndDomainConfig$str() {
        return "WFLYHC0174: Il n'est pas possible d'utiliser use-current-domain-config=false quand on spécifie une domain-config";
    }
    @Override
    protected String domainConfigForReloadNotFound$str() {
        return "WFLYHC0175: domain-config '%1$s' spécifié pour le rechargement n'a pas pu être trouvé";
    }
    @Override
    protected String nativeManagementInterfaceIsUnsecured$str() {
        return "WFLYHC0177: Aucun domaine de sécurité défini pour le service de gestion natif ; tous les accès seront libres.";
    }
    @Override
    protected String aborting$str() {
        return "WFLYHC0178: Abandon avec code de sortie %1$d";
    }
    @Override
    protected String shuttingDownInResponseToProcessControllerSignal$str() {
        return "WFLYHC0179: ProcessController a indiqué qu'il fallait procéder à une fermeture ; fermeture maintenant";
    }
    @Override
    protected String shuttingDownInResponseToManagementRequest$str() {
        return "WFLYHC0180: Fermeture suite à l'opération de gestion '%1$s'";
    }
    @Override
    protected String shutdownHookInvoked$str() {
        return "WFLYHC0181: La fermeture du contrôleur d'hôte à été demandée par un signal OS";
    }
    @Override
    protected String timedOutAwaitingSuspendResponse$str() {
        return "WFLYHC0182: Délai de %1$d ms dépassé alors que le serveur était en attente de réponse(s) du serveur : %2$s";
    }
    @Override
    protected String timedOutAwaitingSuspendResponseMsg$str() {
        return "WFLYHC0183: Délai de %1$d ms dépassé alors que le serveur était en attente de réponse(s) du serveur : %2$s";
    }
    @Override
    protected String interruptedAwaitingSuspendResponse$str() {
        return "WFLYHC0184: %1$s interrompu alors qu'il était en attente de réponse(s) du serveur";
    }
    @Override
    protected String interruptedAwaitingSuspendResponseMsg$str() {
        return "WFLYHC0185: %1$s interrompu alors qu'il était en attente de réponse(s) du serveur";
    }
    @Override
    protected String suspendExecutionFailedMsg$str() {
        return "WFLYHC0186: N'a pas pu exécuter l'opération en attente sur le serveur : %1$s";
    }
    @Override
    protected String suspendListenerFailedMsg$str() {
        return "WFLYHC0187: N'a pas pu obtenir de réponse de la part de l'écouteur en attente sur le serveur : %1$s";
    }
    @Override
    protected String timedOutAwaitingResumeResponse$str() {
        return "WFLYHC0188: Délai de %1$d ms dépassé alors que le serveur était en attente que les réponse(s) du serveur : %2$s reprennent";
    }
    @Override
    protected String timedOutAwaitingResumeResponseMsg$str() {
        return "WFLYHC0189: Délai de %1$d ms dépassé alors que le serveur était en attente que les réponse(s) du serveur : %2$s reprennent";
    }
    @Override
    protected String interruptedAwaitingResumeResponse$str() {
        return "WFLYHC0190: %1$s interrompu alors qu'il était en attente que les réponse(s) du serveur reprennent";
    }
    @Override
    protected String interruptedAwaitingResumeResponseMsg$str() {
        return "WFLYHC0191: %1$s interrompu alors qu'il était en attente que les réponse(s) du serveur reprennent";
    }
    @Override
    protected String resumeExecutionFailedMsg$str() {
        return "WFLYHC0192: N'a pas pu exécuter l'opération de reprise sur le serveur : %1$s";
    }
    @Override
    protected String resumeListenerFailedMsg$str() {
        return "WFLYHC0193: N'a pas pu obtenir de réponse de la part de l'écouteur de reprise sur le serveur : %1$s";
    }
    @Override
    protected String resumeExecutionFailed$str() {
        return "WFLYHC0194: N'a pas pu exécuter l'opération de reprise sur le serveur : %1$s";
    }
    @Override
    protected String resumeListenerFailed$str() {
        return "WFLYHC0195: N'a pas pu obtenir de réponse de la part de l'écouteur de reprise sur le serveur : %1$s";
    }
    @Override
    protected String cannotRenameCachedDomainXmlOnBoot$str() {
        return "WFLYHC0196: N'a pas pu déplacer le fichier %1$s vers %2$s, impossible de persister les changements de configuration du domaine : %3$s ";
    }
    @Override
    protected String attributeRequiresSSLContext$str() {
        return "WFLYHC0197: Si l'attribut %1$s est défini, un ssl-context doit également être défini";
    }
    @Override
    protected String managedServerUnstable1$str() {
        return "WFLYHC0198: Le serveur '%1$s' est instable et doit être arrêté ou démarré à nouveau. Un serveur instable risque de ne pas arrêter normalement, donc une opération « kill » peut être exigée pour faire cesser le processus serveur.";
    }
    @Override
    protected String managedServerUnstable2$str() {
        return "WFLYHC0198: Le serveur '%1$s' (géré par l'hôte '%2$s') est instable et devra être arrêté ou démarré à nouveau. Un serveur instable risque de ne pas stopper normalement, donc l'opération « kill » sera sans doute exigée pour faire cesser le processus serveur.";
    }
    @Override
    protected String serverSuspected$str() {
        return "WFLYHC0199: Le serveur '%1$s' (géré par l'hôte '%2$s') n'a pas répondu à une requête opérationnelle dans le temps imparti configuré. Cela signifie que le serveur est devenu instable.";
    }
    @Override
    protected String failedReportingServerInstabilityToMaster$str() {
        return "WFLYHC0200: Rapporter l'instabilité du serveur '%1$s' au Contrôleur de domaine a échoué.";
    }
    @Override
    protected String hostDomainSynchronizationError$str() {
        return "WFLYHC0201: Erreur de synchronisation du modèle de l'hôte avec le modèle de contrôleur de domaine avec l'erreur : %1$s.";
    }
    @Override
    protected String domainModelAppliedButReloadIsRequired$str() {
        return "WFLYHC0202: La configuration du domaine a été appliquée correctement, mais il faut une réinitialisation pour que les changements puissent s'activer.";
    }
    @Override
    protected String domainModelAppliedButRestartIsRequired$str() {
        return "WFLYHC0203: La configuration du domaine a été appliquée correctement, mais il faut un nouveau démarrage pour que les changements puissent s'activer.";
    }
    @Override
    protected String serverLoggingConfigurationFileNotFound$str() {
        return "WFLYHC0204: Aucun fichier de configuration de journalisation n'a été trouvé pour le démarrage initial des serveurs. La journalisation ne sera pas configurée tant que le sous-système de journalisation n'aura pas été activé pour le serveur %1$s";
    }
    @Override
    protected String failedToSetLoggingConfiguration$str() {
        return "WFLYHC0205: Une erreur s'est produite lors de la définition de la propriété -Dlogging.configuration pour le serveur %1$s. Chemin d'accès à la configuration %2$s";
    }
    @Override
    protected String cannotOverwriteDomainXmlWithEmpty$str() {
        return "WFLYHC0206: Le fichier %1$s existe déjà, vous devez utiliser --remove-existing-domain-config pour remplacer les fichiers existants.";
    }
    @Override
    protected String cannotOverwriteHostXmlWithEmpty$str() {
        return "WFLYHC0207: Le fichier %1$s existe déjà, vous devez utiliser --remove-existing-host-config pour remplacer les fichiers existants.";
    }
    @Override
    protected String cannotAddHostAlreadyRegistered$str() {
        return "WFLYHC0208: Un hôte (%1$s) a déjà été enregistré. Vous devez fermer cet hôte avant d'en ajouter un nouveau.";
    }
    @Override
    protected String nullHostName$str() {
        return "WFLYHC0209: Le nom d'hôte ne doit pas être nul.";
    }
    @Override
    protected String cannotAddSlaveHostAfterBoot$str() {
        return "WFLYHC0210: Un contrôleur d'hôte secondaire ne peut pas être ajouté en utilisant add(). Veuillez ajouter un hôte, en omettant ce paramètre, et configurer le contrôleur de domaine distant en utilisant write-attribute.";
    }
    @Override
    protected String bootConfigValidationFailed$str() {
        return "WFLYHC0211: Échec de la validation de la configuration de démarrage";
    }
    @Override
    protected String fetchOfMissingConfigurationFailed$str() {
        return "WFLYHC0212: L'extraction de la configuration manquante du contrôleur de domaine a échoué sans explication. Le résultat de l'opération de récupération est %1$s";
    }
    @Override
    protected String invalidJavaHome$str() {
        return "WFLYHC0213: Le '%1$s' de Java home n'existe pas.";
    }
    @Override
    protected String invalidJavaHomeBin$str() {
        return "WFLYHC0214: La corbeille de Java home '%1$s' n'existe pas. Le répertoire d'accueil aurait dû être %2$s.";
    }
    @Override
    protected String cannotFindJavaExe$str() {
        return "WFLYHC0215: N'a pas pu trouver d'exécutable java sous %1$s.";
    }
    @Override
    protected String moduleOptionNotAllowed$str() {
        return "WFLYHC0216: L'option module %1$s n'est pas autorisée.";
    }
    @Override
    protected String securityRealmReferencesUnsupported$str() {
        return "WFLYHC0217: Les domaines de sécurité ne sont plus supportés, veuillez migrer les références à ces domaines de la configuration.";
    }
    @Override
    protected String noServerInstallationPrepared$str() {
        return "WFLYHC0218: Aucune installation %1$s n'a été préparée.";
    }
    @Override
    protected String identityNotAuthorizedAsServer$str() {
        return "WFLYHC0219: L'autorisation a échoué pour '%1$s' qui tente de se connecter en tant que serveur de domaine.";
    }
    @Override
    protected String failedToSyncServerStatus$str() {
        return "WFLYHC0220: Échec de la synchronisation de l'état du serveur lors de l'enregistrement d'un contrôleur hôte. Aucun gestionnaire n'est enregistré pour gérer l'opération.%1$s pour le serveur %2$s .";
    }
    @Override
    protected String incompatibleStability$str() {
        return "WFLYHC0221: %1$s le niveau de stabilité du contrôleur de domaine ne correspond pas le niveau de stabilité %2$s de l'hôte connecté ";
    }
    @Override
    protected String unsupportedStability$str() {
        return "WFLYHC0222: %1$s le niveau de stabilité n'est pas pris en charge dans %2$s";
    }
    @Override
    protected String mixedDomainUnsupportedStability$str() {
        return "WFLYHC0223: %1$s Le niveau de stabilité n'est pris en charge que sur les contrôleurs hôtes possédant les mêmes versions de gestion majeure et mineure que le contrôleur de domaine. La version du contrôleur de domaine est %2$d .%3$d La version du contrôleur hôte distant est %4$d .%5$d";
    }
    @Override
    protected String configFilesInUse$str() {
        return "- Fichiers de configuration du contrôleur hôte utilisés : %1$s, %2$s";
    }
    @Override
    protected String configFileInUse$str() {
        return "- Fichier de configuration du contrôleur hôte en cours d'utilisation : %1$s";
    }
    @Override
    protected String stabilityInUse$str() {
        return "- Niveau minimum de stabilité des fonctionnalités : %1$s";
    }
}
