package org.jboss.as.server.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:51+0200")
public class ServerLogger_$logger_fr extends ServerLogger_$logger implements ServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ServerLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotMixUnmanagedAndManagedContentItems$str() {
        return "WFLYSRV0203: Ne peut pas utiliser %1$s quand %2$s est utilisé";
    }
    @Override
    protected String jbossDeploymentStructureIgnored$str() {
        return "WFLYSRV0001: %1$s du sous-déploiement est ignoré. jboss-deployment-structure.xml est uniquement analysé pour les déploiements de niveau supérieur.";
    }
    @Override
    protected String unableToCreateAuthDir$str() {
        return "WFLYSRV0289: Impossible de créer un dir d'auth %1$s.";
    }
    @Override
    protected String subdeploymentNotFound$str() {
        return "WFLYSRV0166: %1$s du sous-déploiement de jboss-deployment-structure.xml n'a pas pu être trouvé. Sous-déploiements disponibles : %2$s";
    }
    @Override
    protected String shutdownHookInvoked$str() {
        return "WFLYSRV0220: La fermeture du serveur à été demandée par un signal OS";
    }
    @Override
    protected String invalidCommandLineOption$str() {
        return "WFLYSRV0073: Option '%1$s' invalide";
    }
    @Override
    protected String logHttpConsole$str() {
        return "WFLYSRV0051: La console d'administration écoute sur http://%1$s:%2$d";
    }
    @Override
    protected String logDirectoryIsNotADirectory$str() {
        return "WFLYSRV0127: Le répertoire log n'est pas un répertoire : %1$s";
    }
    @Override
    protected String annotationImportIgnored$str() {
        return "WFLYSRV0017: L'option d'import d'annotations %1$s, spécifiée dans jboss-deployment-structure.xml pour le module supplémentaire %2$s, a été ignorée. Les modules supplémentaires ne peuvent pas importer d'annotations.";
    }
    @Override
    protected String failedToLoadModule$str() {
        return "WFLYSRV0179: N'a pas pu charger le module : %1$s";
    }
    @Override
    protected String couldNotCreateServerDataDirectory$str() {
        return "WFLYSRV0124: Impossible de créer un répertoire de serveur de données : %1$s";
    }
    @Override
    protected String serverConfigFileInUse$str() {
        return "- Fichier de configuration du serveur en cours d'utilisation : %1$s";
    }
    @Override
    protected String valueExpectedForCommandLineOption$str() {
        return "WFLYSRV0072: Valeur attendue pour l'option %1$s";
    }
    @Override
    protected String startingNonGraceful$str() {
        return "WFLYSRV0282: Le serveur démarre avec le démarrage en douceur désactivé ; les demandes externes peuvent recevoir des réponses d'échec jusqu'à ce que le démarrage soit terminé.";
    }
    @Override
    protected String serverStarting$str() {
        return "WFLYSRV0049: %1$s démarre %2$s";
    }
    @Override
    protected String mechNoLoginNameGiven$str() {
        return "WFLYSRV0307: Aucun nom de connexion n'a été fourni pour le mécanisme d'authentification";
    }
    @Override
    protected String runtimeNameMustBeUnique$str() {
        return "WFLYSRV0205: Il y a déjà un déploiement nommé %1$s avec le même nom de runtime %2$s";
    }
    @Override
    protected String cannotSpecifyBothAdminOnlyAndStartMode$str() {
        return "WFLYSRV0264: Impossible d'indiquer à la fois admin-mode et start-mode";
    }
    @Override
    protected String logHttpManagement$str() {
        return "WFLYSRV0060: L'interface de gestion http écoute sur http://%1$s:%2$d/management";
    }
    @Override
    protected String argGitAuth$str() {
        return "Le fichier de configuration d'elytron pour la gestion des identifiants git, par défaut est 'null'";
    }
    @Override
    protected String noSuchDeploymentContent$str() {
        return "WFLYSRV0084: Aucun contenu de déploiement avec hash %1$s n'est disponible dans le référentiel de contenu de déploiement.";
    }
    @Override
    protected String excludedDependenciesNotExist$str() {
        return "WFLYSRV0274: La dépendance %1$s exclue via jboss-deployment-structure.xml n'existe pas.";
    }
    @Override
    protected String domainConfigDirDoesNotExist$str() {
        return "WFLYSRV0134: Le répertoire de configuration du domaine n'existe pas : %1$s";
    }
    @Override
    protected String cannotMergeResourceRoot$str() {
        return "WFLYSRV0163: N'a pas pu faire fusionner la racine de ressource dans un autre fichier. Ainsi : %1$s fusion : %2$s";
    }
    @Override
    protected String nullModuleAttachment$str() {
        return "WFLYSRV0195: Impossible d'obtenir le module requis pour : %1$s";
    }
    @Override
    protected String noSuchDeployment$str() {
        return "WFLYSRV0085: Aucun déploiement avec le nom %1$s trouvé";
    }
    @Override
    protected String duplicateJBossXmlNamespace$str() {
        return "WFLYSRV0192: Espace-nom %1$s en double dans jboss-all.xml";
    }
    @Override
    protected String argInterfaceBindAddress$str() {
        return "Définir la propriété système jboss.bind.address.<interface> sur la valeur donnée";
    }
    @Override
    protected String unableToInitialiseSSLContext$str() {
        return "WFLYSRV0117: Impossible d'initialiser un SSLContext de base '%1$s'";
    }
    @Override
    protected String noMethodFound$str() {
        return "WFLYSRV0175: Aucune méthode trouvée ayant pour id : %1$s sur la classe (ou sa super classe) %2$s";
    }
    @Override
    protected String cannotHaveMoreThanOneManagedContentItem$str() {
        return "WFLYSRV0201: Ne peut pas avoir plus d'un %1$s";
    }
    @Override
    protected String errorGettingReflectiveInformation$str() {
        return "WFLYSRV0177: Erreur d'obtention d'informations réflectives pour %1$s pour le ClassLoader (Chargeur de classe) %2$s";
    }
    @Override
    protected String cannotBothHaveFalseUseCurrentConfigAndServerConfig$str() {
        return "WFLYSRV0237: Il n'est pas possible d'utiliser use-current-server-config=false quand on spécifie une server-config";
    }
    @Override
    protected String didNotReadEntireFile$str() {
        return "WFLYSRV0107: N'a pas lu le fichier dans son entier. %1$d Manquant";
    }
    @Override
    protected String invalidPoolSize$str() {
        return "WFLYSRV0265: La valeur '%1$s' non valide pour la propriété de système '%2$s' -- doit pouvoir être un entier relatif non-négatif";
    }
    @Override
    protected String failedToRestoreConfiguration$str() {
        return "WFLYSRV0315: Échec de la restauration de la configuration après l'échec de l'initialisation du référentiel %1$s";
    }
    @Override
    protected String cannotReadContentFromSelfContainedServer$str() {
        return "WFLYSRV0254: Impossible d'analyser du contenu d'un déploiement dans un serveur autonome";
    }
    @Override
    protected String malformedCommandLineURL$str() {
        return "WFLYSRV0074: URL mal formé fourni pour l'option %1$s. %2$s";
    }
    @Override
    protected String unknownMountType$str() {
        return "WFLYSRV0112: Type de montage inconnu %1$s";
    }
    @Override
    protected String deploymentDeployedNotification$str() {
        return "WFLYSRV0234: Déploiement de \"%1$s\" (runtime-name: \"%2$s\")";
    }
    @Override
    protected String shuttingDownInResponseToManagementRequest$str() {
        return "WFLYSRV0241: Fermeture suite à l'opération de gestion '%1$s'";
    }
    @Override
    protected String deploymentStructureFileNotFound$str() {
        return "WFLYSRV0167: Aucun fichier jboss-deployment-structure.xml trouvé dans %1$s";
    }
    @Override
    protected String argDefaultMulticastAddress$str() {
        return "Définir la propriété système jboss.default.multicast.address sur la valeur donnée";
    }
    @Override
    protected String serviceModuleLoaderAlreadyStopped$str() {
        return "WFLYSRV0098: ServiceModuleLoader est déjà arrêté";
    }
    @Override
    protected String deploymentReplaced$str() {
        return "WFLYSRV0016: Le déploiement \"%1$s\" a été remplacé par le déploiement \"%2$s\"";
    }
    @Override
    protected String staticModuleIndexingFailed$str() {
        return "WFLYSRV0286: Échec de l'indexation du module statique %1$s pour les annotations";
    }
    @Override
    protected String logHttpsManagement$str() {
        return "WFLYSRV0061: L'interface de gestion http écoute sur https://%1$s:%2$d/management";
    }
    @Override
    protected String serverConfigForReloadNotFound$str() {
        return "WFLYSRV0238: server-config '%1$s' spécifié pour le rechargement n'a pas pu être trouvé";
    }
    @Override
    protected String creatingHttpManagementServiceOnSocket$str() {
        return "WFLYSRV0039: Création d'un service de gestion http à l'aide de socket-binding (%1$s)";
    }
    @Override
    protected String classPathEntryNotValid$str() {
        return "WFLYSRV0059: Le chemin de classe %1$s de %2$s  ne pointe pas vers un jar en cours de validité pour une référence Class-Path.";
    }
    @Override
    protected String couldNotMountOverlay$str() {
        return "WFLYSRV0224: Impossible de monter une superposition %1$s car le parent %2$s n'est pas un répertoire";
    }
    @Override
    protected String deploymentUndeployedNotification$str() {
        return "WFLYSRV0233: Annulation du déploiement de \"%1$s\" (runtime-name: \"%2$s\")";
    }
    @Override
    protected String fdTooLow$str() {
        return "WFLYSRV0071: Le système d'exploitation a limité le nombre de fichiers ouverts à %1$d pour ce processus ; une valeur de 4 096 minimum est recommandée";
    }
    @Override
    protected String cannotExplodeAlreadyExplodedDeployment$str() {
        return "WFLYSRV0244: Impossible d'éclater un déploiement qui a déjà été éclaté";
    }
    @Override
    protected String stoppedDeployment$str() {
        return "WFLYSRV0028: Arrêt du déploiement de %1$s (runtime-name: \"%2$s\") en %3$dms";
    }
    @Override
    protected String cannotCreateLocalDirectory$str() {
        return "WFLYSRV0106: N'a pas pu créer un répertoire local : %1$s";
    }
    @Override
    protected String embeddedServerDirectoryNotFound$str() {
        return "WFLYSRV0143: Aucun répertoire nommé '%1$s' n'existe sous '%2$s'";
    }
    @Override
    protected String serverBaseDirectoryIsNotADirectory$str() {
        return "WFLYSRV0135: Le répertoire de base du serveur n'est pas un répertoire : %1$s";
    }
    @Override
    protected String wildflyConfigUrlIsSet$str() {
        return "WFLYSRV0281: La propriété System %1$s est définie. Cette propriété ne doit être utilisée que pour les clients autonomes. La définition de cette propriété sur le serveur remplacera la configuration de votre profil.";
    }
    @Override
    protected String undeployingDeploymentHasBeenRedeployed$str() {
        return "WFLYSRV0219: Le déploiement %1$s a été redéployé. Son contenu va être supprimé. Vous allez devoir le redémarrer.";
    }
    @Override
    protected String equivalentNamespacesInJBossXml$str() {
        return "WFLYSRV0193: Il existe deux versions différentes ayant les mêmes espace-noms dans jboss-all.xml, %1$s et %2$s sont présents tous les deux";
    }
    @Override
    protected String deploymentRestartDetected$str() {
        return "WFLYSRV0070: Redémarrage du déploiement détecté pour le déploiement %1$s, avec déploiement total à la place.";
    }
    @Override
    protected String unsupportedStability$str() {
        return "WFLYSRV0309: %1$s le niveau de stabilité n'est pas pris en charge dans %2$s";
    }
    @Override
    protected String illegalPermissionActions$str() {
        return "WFLYSRV0223: Actions de permission illégale '%1$s'";
    }
    @Override
    protected String argSystem$str() {
        return "Définir une propriété système";
    }
    @Override
    protected String additionalResourceRootDoesNotExist$str() {
        return "WFLYSRV0058: Ressources racine supplémentaires %1$s ajoutées via jboss-deployment-structure.xml n'existent pas";
    }
    @Override
    protected String argServerConfig$str() {
        return "Nom du fichier de configuration du serveur à utiliser (par défaut \"standalone.xml\") (comme -c)";
    }
    @Override
    protected String invalidExtensionURI$str() {
        return "WFLYSRV0046: La syntaxe de l'URI de l'extension %1$s est invalide : %2$s";
    }
    @Override
    protected String couldNotCreateServerBaseDirectory$str() {
        return "WFLYSRV0136: Impossible de créer un répertoire de base du serveur : %1$s";
    }
    @Override
    protected String rootServiceRemoved$str() {
        return "WFLYSRV0140: Le service root a été retiré";
    }
    @Override
    protected String aliasAddedAsExclusion$str() {
        return "WFLYSRV0294: L'alias du module '%1$s' a été exclu du déploiement de '%2$s' via %3$s. Bien que cela soit autorisé, il est recommandé d'utiliser le module cible à la place. Envisagez de remplacer cet alias par son module cible '%4$s'.";
    }
    @Override
    protected String couldNotGetModuleInfo$str() {
        return "WFLYSRV0232: Impossible d'obtenir d'informations de modules pour le nom de module : %1$s";
    }
    @Override
    protected String logNoConsole$str() {
        return "WFLYSRV0054: La console d'administration n'est pas active";
    }
    @Override
    protected String deploymentUndeployed$str() {
        return "WFLYSRV0009: Annulation du déploiement de \"%1$s\" (runtime-name: \"%2$s\")";
    }
    @Override
    protected String noSuchDeploymentOverlayContentAtBoot$str() {
        return "WFLYSRV0198: Aucun contenu de couche superposée de déploiement avec le hachage %1$s n'est disponible dans le référentiel de contenu de déploiement pour la couche superposée de déploiement de '%2$s' à l'emplacement %3$s. Il s'agit d'une erreur fatale de démarrage. Pour corriger le problème, soit redémarrer par admin-only et utiliser CLI pour installer le contenu manquant ou le supprimer de la configuration, ou encore, retirer la couche superposée de déploiement du fichier de configuration xml et redémarrez.";
    }
    @Override
    protected String unknownStartMode$str() {
        return "WFLYSRV0263: Mode de démarrage inconnu %1$s";
    }
    @Override
    protected String failedToLoadFile$str() {
        return "WFLYSRV0200: N'a pas pu lire le fichier %1$s";
    }
    @Override
    protected String disregardingNonGraceful$str() {
        return "WFLYSRV0283: Un démarrage non gracieux a été demandé en conjonction avec un démarrage suspendu. Le serveur démarrera de manière suspendue.";
    }
    @Override
    protected String startingServerSuspended$str() {
        return "WFLYSRV0260: Démarrer un serveur en mode en attente";
    }
    @Override
    protected String hostControllerNameNullInDomain$str() {
        return "WFLYSRV0080: hostControllerName ne peut pas être null si le serveur est dans un domaine géré";
    }
    @Override
    protected String argReadOnlyServerConfig$str() {
        return "Nom du fichier de configuration de domaine à utiliser. Diffère de '--server-config', et '-c' dans le sens où le fichier initial n'est jamais remplacé.";
    }
    @Override
    protected String logHttpAndHttpsManagement$str() {
        return "WFLYSRV0062: L'interface de gestion http écoute sur http://%1$s:%2$d/management et sur https://%3$s:%4$d/management";
    }
    @Override
    protected String deploymentRootRequired$str() {
        return "WFLYSRV0101: La racine (root) du déploiement est requise";
    }
    @Override
    protected String failedToCreateTempFileProvider$str() {
        return "WFLYSRV0164: Échec de la création de fournisseur de fichiers temp";
    }
    @Override
    protected String errorOpeningZipFile$str() {
        return "WFLYSRV0276: Il y a une erreur lors de l'ouverture du fichier zip %1$s";
    }
    @Override
    protected String securityRealmReferencesUnsupported$str() {
        return "WFLYSRV0287: Les domaines de sécurité ne sont plus supportés, veuillez migrer les références à ces domaines de la configuration.";
    }
    @Override
    protected String throwableIsNull$str() {
        return "WFLYSRV0291: La cause de l'erreur est inconnue à ce stade. Vérifiez les autres messages du journal et l'appelant pour connaître la cause possible.";
    }
    @Override
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYSRV0128: N'a pas pu créer un répertoire de log : %1$s";
    }
    @Override
    protected String cannotAddContentToUnmanagedDeployment$str() {
        return "WFLYSRV0247: Impossible d'ajouter du contenu à un déploiement non géré";
    }
    @Override
    protected String deploymentDeployed$str() {
        return "WFLYSRV0010: Déploiement de \"%1$s\" (runtime-name: \"%2$s\")";
    }
    @Override
    protected String failedToLoadSSHCredentials$str() {
        return "WFLYSRV0277: Échec du chargement des informations d'identification SSH %1$s";
    }
    @Override
    protected String invalidObject$str() {
        return "WFLYSRV0147: %1$s est nul";
    }
    @Override
    protected String caughtExceptionDuringBoot$str() {
        return "WFLYSRV0055: Exception interceptée au démarrage";
    }
    @Override
    protected String couldNotFindHcFileRepositoryConnection$str() {
        return "WFLYSRV0109: Connexion du référentiel de fichier au contrôleur hôte introuvable.";
    }
    @Override
    protected String homeDirectoryDoesNotExist$str() {
        return "WFLYSRV0119: Le répertoire d'accueil (home) n'existe pas : %1$s";
    }
    @Override
    protected String errorCopyingFile$str() {
        return "WFLYSRV0146: Erreur lors de la copie de '%1$s' à '%2$s'";
    }
    @Override
    protected String invalidStreamURL$str() {
        return "WFLYSRV0150: Ne peut pas créer de flux d'entrée à partir de l'URL '%1$s'";
    }
    @Override
    protected String duplicateSubdeploymentListing$str() {
        return "WFLYSRV0169: Le sous-déploiement '%1$s' est listé à deux reprises dans jboss-deployment-structure.xml";
    }
    @Override
    protected String cannotFindExtensionListEntry$str() {
        return "WFLYSRV0047: Impossible de trouver l'entrée Extension-List %1$s référencée à partir de %2$s";
    }
    @Override
    protected String configuredSystemPropertiesLabel$str() {
        return "Propriétés de système configurées :";
    }
    @Override
    protected String caughtExceptionClosingContentInputStream$str() {
        return "WFLYSRV0042: Exception interceptée lors de la fermeture du flux d'entrée pour le contenu du déploiement téléchargé";
    }
    @Override
    protected String addingIgnored$str() {
        return "Ajout de .gitignore";
    }
    @Override
    protected String mechCallbackHandlerFailedForUnknownReason$str() {
        return "WFLYSRV0306: Le gestionnaire de rappel a échoué pour une raison inconnue";
    }
    @Override
    protected String suspendingServer1$str() {
        return "WFLYSRV0211: Serveur suspendu avec un délai dépassé de %1$d ms.";
    }
    @Override
    protected String startingSubDeployment$str() {
        return "WFLYSRV0207: Démarrage du sous-déploiement (runtime-name: \"%1$s\")";
    }
    @Override
    protected String cannotAddMoreThanOneSocketBindingGroupForServerOrHost$str() {
        return "WFLYSRV0190: Impossible d'ajouter plus d'un groupe de liaison de socket. Ajout de '%1$s' tenté, mais '%2$s' existe déjà";
    }
    @Override
    protected String argGracefulStartup$str() {
        return "Démarrer le serveur de façon progressive, en mettant en file d'attente ou en rejetant proprement les demandes jusqu'à ce que le serveur soit complètement démarré";
    }
    @Override
    protected String deploymentAlreadyStarted$str() {
        return "WFLYSRV0087: Le déploiement %1$s a déjà démarré";
    }
    @Override
    protected String argStartMode$str() {
        return "Définir le type de fonctionnement du serveur sur « admin-only » ou « suspend ». S'il est sur « suspend », le serveur démarrera en mode d'attente, et ne répondra pas aux demandes tant qu'il n'a pas repris. S'il est sur « admin-only », cela entraîne l'ouverture des interfaces administratives et le serveur accepte les requêtes de gestion mais ne démarrera pas d'autres services de runtime et n'acceptera pas de requêtes de la part des utilisateurs finaux. Ne peut être utilisé en conjonction avec le mode --admin-only.";
    }
    @Override
    protected String logHttpsConsole$str() {
        return "WFLYSRV0052: La console d'administration écoute sur https://%1$s:%2$d";
    }
    @Override
    protected String externalResourceRootsNotSupported$str() {
        return "WFLYSRV0171: Racines de ressources externes non supportées, les racines de ressource ne démarrent sans doute pas par un '' : %1$s";
    }
    @Override
    protected String failedToGetFileFromRemoteRepository$str() {
        return "WFLYSRV0105: N'a pas pu obtenir de fichier du référentiel distant";
    }
    @Override
    protected String duplicateDeploymentUnitProcessor$str() {
        return "WFLYSRV0206: Processeurs d'unités de déploiement multiples enregistrés avec priorité %1$s et classe %2$s";
    }
    @Override
    protected String failedToCleanObsoleteContent$str() {
        return "WFLYSRV0216: Erreur lors du nettoyage du contenu obsolète %1$s ";
    }
    @Override
    protected String startedWitErrorsMessage$str() {
        return "%1$s démarré (avec des erreurs) dans %2$dms - Démarrage de %3$d de %4$d services (%5$d services échoués ou dépendances manquantes, %6$d services lazy, passifs ou à la demande) %7$s";
    }
    @Override
    protected String mechTokenNotVerified$str() {
        return "WFLYSRV0300: Le jeton du mécanisme d'authentification n'a pas été vérifié";
    }
    @Override
    protected String argShortServerConfig$str() {
        return "Nom du fichier de configuration du serveur à utiliser (par défaut \"standalone.xml\") (comme --server-config)";
    }
    @Override
    protected String couldNotCreateServerContentDirectory$str() {
        return "WFLYSRV0126: Impossible de créer un répertoire de serveur de contenu : %1$s";
    }
    @Override
    protected String failedToResolveMulticastAddress$str() {
        return "WFLYSRV0187: N'a pas pu obtenir d'adresse multidiffusion pour %1$s";
    }
    @Override
    protected String failedToConnectToHostController$str() {
        return "WFLYSRV0213: N'a pas pu connecter le contrôleur hôte, nouvelle tentative.";
    }
    @Override
    protected String aborting$str() {
        return "WFLYSRV0239: Abandon avec code de sortie %1$d";
    }
    @Override
    protected String failedToGetManifest$str() {
        return "WFLYSRV0161: N'a pas pu obtenir de manifeste pour le déploiement %1$s";
    }
    @Override
    protected String deploymentOverlayFailed$str() {
        return "WFLYSRV0196: N'a pas pu obtenir le contenu de couche de déploiement %1$s à %2$s";
    }
    @Override
    protected String caughtExceptionUndeploying$str() {
        return "WFLYSRV0043: Le processeur de l'unité de déploiement %1$s a envoyé une exception de manière inattendue pendant la phase d'annulation du déploiement %2$s sur %3$s";
    }
    @Override
    protected String errorUsingGit$str() {
        return "WFLYSRV0271: Erreur Git : %1$s";
    }
    @Override
    protected String replaceRolledBackWithNoMessage$str() {
        return "WFLYSRV0015: Le remplacement du déploiement \"%1$s\" par le déploiement \"%2$s\" a été annulé sans message d'échec";
    }
    @Override
    protected String serverStabilityInUse$str() {
        return "- Niveau minimum de stabilité des fonctionnalités : %1$s";
    }
    @Override
    protected String cannotExplodeUnmanagedDeployment$str() {
        return "WFLYSRV0243: Impossible d'éclater un déploiement non géré";
    }
    @Override
    protected String couldNotObtainServerUuidFile$str() {
        return "WFLYSRV0231: Impossible de lire ou créer l'UUID du serveur dans le fichier : %1$s";
    }
    @Override
    protected String suspendingServerWithNoTimeout$str() {
        return "WFLYSRV0236: Serveur suspendu sans délai d'expiration.";
    }
    @Override
    protected String mechNoTokenGiven$str() {
        return "WFLYSRV0304: Aucun jeton de mécanisme d'authentification n'a été fourni";
    }
    @Override
    protected String cannotLoadAnnotationIndex$str() {
        return "WFLYSRV0002: Le chargement a échoué pour l'index d'annotation \"%1$s\" avec l'exception suivante : %2$s";
    }
    @Override
    protected String argStability$str() {
        return "Exécute le serveur avec un niveau de stabilité spécifique. Valeurs possibles :%1$s, Par défaut = %2$s";
    }
    @Override
    protected String mechMessageTooLong$str() {
        return "WFLYSRV0298: Le message du mécanisme d'authentification est trop long";
    }
    @Override
    protected String processStateChangeNotificationDescription$str() {
        return "Notification émise quand l'état du processus est modifié";
    }
    @Override
    protected String argProperties$str() {
        return "Charger les propriétés du système à partir de l'url donné";
    }
    @Override
    protected String noArgValue$str() {
        return "WFLYSRV0108: Aucune valeur n'a été fournie pour l'argument %1$s%n";
    }
    @Override
    protected String cannotRemoveContentFromUnexplodedDeployment$str() {
        return "WFLYSRV0252: Impossible de déplacer du contenu d'un déploiement non géré";
    }
    @Override
    protected String deprecatedApiUsed$str() {
        return "WFLYSRV0221: Le déploiement \"%1$s\" utilise un modèle obsolète (\"%2$s\") qui risque de disparaître dans les prochaines versions sans notification.";
    }
    @Override
    protected String cannotHaveBothInitialServerConfigAndServerConfig$str() {
        return "WFLYSRV0191: Impossible d'utiliser --server-config et --initial-server-config à la fois";
    }
    @Override
    protected String failedCreatingTempProvider$str() {
        return "WFLYSRV0113: Échec de la création de fournisseur de fichiers temp";
    }
    @Override
    protected String serverControllerServiceRemoved$str() {
        return "WFLYSRV0139: Le service du contrôleur du serveur a été retiré";
    }
    @Override
    protected String failedToInstantiateClassTransformer$str() {
        return "WFLYSRV0158: Échec d'instanciation d'un %1$s";
    }
    @Override
    protected String resumingServer$str() {
        return "WFLYSRV0212: Redémarrage du serveur";
    }
    @Override
    protected String vaultSupportRemoved$str() {
        return "WFLYSRV0285: Le support des espaces d'archivage sécurisé a été supprimé, aucune ressource d’espace d'archivage sécurisé ne sera initialisée.";
    }
    @Override
    protected String logNoHttpManagement$str() {
        return "WFLYSRV0063: L'interface de gestion http n'est pas activée";
    }
    @Override
    protected String unexpectedContent$str() {
        return "WFLYSRV0174: Contenu non attendu de type '%1$s' nommé '%2$s', texte : '%3$s'";
    }
    @Override
    protected String invalidStreamBytes$str() {
        return "WFLYSRV0151: Aucun octet disponible pour le paramètre %1$s";
    }
    @Override
    protected String deploymentRolledBackWithNoMessage$str() {
        return "WFLYSRV0022: Le déploiement du déploiement \"%1$s\" a été annulé sans message d'échec";
    }
    @Override
    protected String serverBaseDirectoryDoesNotExist$str() {
        return "WFLYSRV0122: Le répertoire du serveur de base n'existe pas : %1$s";
    }
    @Override
    protected String cannotRemoveContentFromUnmanagedDeployment$str() {
        return "WFLYSRV0251: Impossible de supprimer du contenu d'un déploiement non géré";
    }
    @Override
    protected String creatingHttpManagementServiceOnSecureSocket$str() {
        return "WFLYSRV0040: Création d'un service de gestion http à l'aide de secure-socket-binding (%1$s)";
    }
    @Override
    protected String couldNotCreateServerTempDirectory$str() {
        return "WFLYSRV0130: Impossible de créer le répertoire temp du serveur : %1$s";
    }
    @Override
    protected String creatingHttpManagementServiceOnSocketAndSecureSocket$str() {
        return "WFLYSRV0041: Création d'un service de gestion http à l'aide de socket-binding (%1$s) et de secure-socket-binding (%2$s)";
    }
    @Override
    protected String deploymentIndexingFailed$str() {
        return "WFLYSRV0156: Échec d'indexation du root de déploiement pour les annotations";
    }
    @Override
    protected String unknownContentItemKey$str() {
        return "WFLYSRV0202: Clé d'élément de contenu inconnue : %1$s";
    }
    @Override
    protected String subdeploymentsRequireParent$str() {
        return "WFLYSRV0102: Les sous-déploiements requièrent une unité de déploiement parent";
    }
    @Override
    protected String argHelp$str() {
        return "Afficher ce message et sortir";
    }
    @Override
    protected String reportAdminOnlyMissingDeploymentContent$str() {
        return "WFLYSRV0057: Aucun contenu de déploiement avec hachage %1$s n'est disponible dans le référentiel de contenu de déploiement pour le déploiement de %2$s. Comme ce contrôleur hôte démarre en mode ADMIN uniquement, le processus de démarrage (boot) pourra permettre aux administrateurs de corriger ce problème. Si ce contrôleur hôte n'était pas en mode ADMIN seulement, cela constituerait une panne fatale de démarrage.";
    }
    @Override
    protected String failedToStartHttpManagementService$str() {
        return "WFLYSRV0083: Échec du démarrage du service http-interface";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYSRV0173: Un ou plusieurs attributs requis manquants : %1$s";
    }
    @Override
    protected String noDeploymentRepositoryAvailable$str() {
        return "WFLYSRV0159: Pas de référentiel de déploiement disponible.";
    }
    @Override
    protected String startingDeployment$str() {
        return "WFLYSRV0027: Lancement du déploiement de \"%1$s\" (runtime-name: \"%2$s\")";
    }
    @Override
    protected String extensionMissingManifestAttribute$str() {
        return "WFLYSRV0045: L'extension %1$s n'a pas l'attribut de manifest requis %2$s-%3$s (ignore l'extension)";
    }
    @Override
    protected String errorLoadingJBossXmlFile$str() {
        return "WFLYSRV0194: Erreur de chargement de jboss-all.xml à partir de %1$s";
    }
    @Override
    protected String redeployRolledBack$str() {
        return "WFLYSRV0011: Le redéploiement de \"%1$s\" a été annulé avec le message d'échec : %2$s";
    }
    @Override
    protected String illegalPermissionName$str() {
        return "WFLYSRV0222: Nom de permission illégal '%1$s'";
    }
    @Override
    protected String requiredSystemPropertyMissing$str() {
        return "WFLYSRV0257: Propriété de système '%1$s' requise non définie";
    }
    @Override
    protected String stoppedSubDeployment$str() {
        return "WFLYSRV0208: Sous-déploiement arrêté (runtime-name: %1$s) en %2$dms";
    }
    @Override
    protected String multipleContentItemsNotSupported$str() {
        return "WFLYSRV0152: 1 seul portion du contenu est actuellement supportée (AS7-431)";
    }
    @Override
    protected String invalidModuleName$str() {
        return "WFLYSRV0170: Nom de module supplémentaire '%1$s' non valide. Les noms doivent démarrer par 'déploiement'.";
    }
    @Override
    protected String failedToParseEnumProperty$str() {
        return "WFLYSRV0308: Échec de l'analyse de la propriété (%1$s), valeur (%2$s) doit correspondre à l'un des éléments suivants : %3$s";
    }
    @Override
    protected String privateApiUsed$str() {
        return "WFLYSRV0018: Le déploiement \"%1$s\" utilise un module privé (\"%2$s\") qui peut être modifié ou supprimé sans préavis dans des versions futures.";
    }
    @Override
    protected String unableToCreateTempDirForAuthTokensFileExists$str() {
        return "WFLYSRV0288: Impossible de créer un dir tmp pour les tokens auth car le fichier existe déjà.";
    }
    @Override
    protected String domainBaseDirDoesNotExist$str() {
        return "WFLYSRV0133: Le répertoire de base du domaine n'existe pas : %1$s";
    }
    @Override
    protected String nullParameter$str() {
        return "WFLYSRV0204: '%1$s' Null";
    }
    @Override
    protected String argGitRepo$str() {
        return "Le référentiel git à cloner pour obtenir la configuration de serveur.";
    }
    @Override
    protected String configuredSystemEnvironmentLabel$str() {
        return "Environnement du système configuré :";
    }
    @Override
    protected String errorLoadingDeploymentStructureFile$str() {
        return "WFLYSRV0168: Erreur de chargement de jboss-deployment-structure.xml à partir de %1$s";
    }
    @Override
    protected String unsupportedApiUsed$str() {
        return "WFLYSRV0019: Le déploiement \"%1$s\" utilise un module non pris en charge (\"%2$s\") qui peut être modifié ou supprimé sans préavis dans des versions futures.";
    }
    @Override
    protected String noSuchDeploymentOverlayContent$str() {
        return "WFLYSRV0199: Aucune couche superposée de déploiement ayant pour hachage %1$s n'est disponible dans le référentiel de contenu de déploiement.";
    }
    @Override
    protected String failedToUnmountContentOverride$str() {
        return "WFLYSRV0065: Le démontage de la couche de déploiement a échoué";
    }
    @Override
    protected String undeploymentRolledBackWithNoMessage$str() {
        return "WFLYSRV0008: L'annulation du déploiement \"%1$s\" n'a pas eu lieu sans message d'échec";
    }
    @Override
    protected String failedToParseCommandLineInteger$str() {
        return "WFLYSRV0023: Échec de l'analyse de la propriété (%1$s), valeur (%2$s) en tant qu'entier";
    }
    @Override
    protected String cannotExplodeSubDeploymentOfUnexplodedDeployment$str() {
        return "WFLYSRV0258: Impossible d'éclater un sous-déploiement dans un déploiement qui n'est pas lui-même sous forme éclatée";
    }
    @Override
    protected String couldNotCreateControllerTempDirectory$str() {
        return "WFLYSRV0132: Impossible de créer le répertoire temp du serveur : %1$s";
    }
    @Override
    protected String argAdminOnly$str() {
        return "Définir le type de fonctionnement du serveur sur ADMIN_ONLY entraîne l'ouverture des interfaces administratives et accepte les requêtes de gestion mais ne démarrera pas d'autres services de runtime et n'acceptera pas de requêtes de la part des utilisateurs finaux. Ne peut être utilisé en conjonction avec le mode --start-mode. Déprécié; utiliser --start-mode=admin-only à la place.";
    }
    @Override
    protected String unsuccessfulBoot$str() {
        return "WFLYSRV0056: L'amorçage du serveur a échoué de manière irrécupérable ; sortie. Voir les messages précédents pour plus de détails. %1$s";
    }
    @Override
    protected String argSecurityProperty$str() {
        return "Définir une propriété de sécurité";
    }
    @Override
    protected String systemPropertyNotManageable$str() {
        return "WFLYSRV0115: La propriété système %1$s ne peut pas être définie via le fichier de configuration xml ou à partir d'un client de gestion ; sa valeur doit être connue au démarrage du processus initial et ne peut donc être définie que par la ligne de commande";
    }
    @Override
    protected String unexpectedEndOfDocument$str() {
        return "WFLYSRV0172: Fin de document inattendue";
    }
    @Override
    protected String secureSocketBindingRequiresSSLContext$str() {
        return "WFLYSRV0259: Si l'attribut secure-socket-binding est défini, ssl-context doit également être défini";
    }
    @Override
    protected String shuttingDownInResponseToProcessControllerSignal$str() {
        return "WFLYSRV0240: ProcessController a indiqué qu'il fallait procéder à une fermeture ; fermeture maintenant";
    }
    @Override
    protected String argPublicBindAddress$str() {
        return "Définir la propriété système jboss.bind.address sur la valeur donnée";
    }
    @Override
    protected String unableToInitialiseGitRepository$str() {
        return "WFLYSRV0280: Impossible d'initialiser le référentiel git.";
    }
    @Override
    protected String jbossDeploymentStructureNamespaceIgnored$str() {
        return "WFLYSRV0064: urn:jboss:deployment-structure namespace trouvé dans jboss.xml pour le sous-déploiement %1$s. Valide uniquement au niveau supérieur du déploiement.";
    }
    @Override
    protected String cannotExplodeEnabledDeployment$str() {
        return "WFLYSRV0245: Impossible d'éclater un déploiement qui a déjà été déployé";
    }
    @Override
    protected String noSuchDeploymentContentAtBoot$str() {
        return "WFLYSRV0137: Aucun contenu de déploiement avec le hachage %1$s n'est disponible dans le référentiel de contenu de déploiement pour le déploiement de '%2$s'. Il s'agit d'une erreur fatale de démarrage. Pour corriger le problème, soit redémarrer par admin-only et utiliser CLI pour installer le contenu manquant ou le supprimer de la configuration, ou encore, retirer le déploiement du fichier de configuration xml et redémarrez.";
    }
    @Override
    protected String caughtIOExceptionUploadingContent$str() {
        return "WFLYSRV0093: IOException interceptée lors de la lecture du contenu du déploiement téléchargé";
    }
    @Override
    protected String serverDataDirectoryIsNotDirectory$str() {
        return "WFLYSRV0123: Le répertoire du serveur de données n'est pas un répertoire : %1$s";
    }
    @Override
    protected String deploymentRolledBack$str() {
        return "WFLYSRV0021: Le déploiement \"%1$s\" a été annulé avec le message d'échec : %2$s";
    }
    @Override
    protected String noServerInstallationPrepared$str() {
        return "WFLYSRV0295: Aucune installation %1$s n'a été préparée.";
    }
    @Override
    protected String deploymentMountFailed$str() {
        return "WFLYSRV0160: N'a pas pu monter le contenu du déploiement";
    }
    @Override
    protected String serverStopped$str() {
        return "WFLYSRV0050: %1$s arrêté en %2$dms";
    }
    @Override
    protected String deploymentRedeployed$str() {
        return "WFLYSRV0013: Redéploiement de \"%1$s\"";
    }
    @Override
    protected String deploymentDependenciesAreATopLevelElement$str() {
        return "WFLYSRV0067: jboss-deployment-dependencies ne peut pas être utilisé dasn un sous déploiement, doit être spécifié au niveau ear : %1$s";
    }
    @Override
    protected String cannotResolveInterface$str() {
        return "WFLYSRV0081: Une adresse IP ne peut pas être résolue à l'aide du critère de sélection de l'interface donnée. L'échec est -- %1$s";
    }
    @Override
    protected String argVersion$str() {
        return "Imprimer la version et quitter";
    }
    @Override
    protected String couldNotCopyFiles$str() {
        return "WFLYSRV0249: Impossible de copier les fichiers du référentiel de contenu géré dans le déploiement en cours pour %1$s";
    }
    @Override
    protected String failedToPublishConfiguration$str() {
        return "WFLYSRV0270: Échec de la publication de la configuration à %1$s";
    }
    @Override
    protected String vfsNotAvailable$str() {
        return "WFLYSRV0138: VFS n'est pas disponible à partir du chargeur de module configuré";
    }
    @Override
    protected String argDebugPort$str() {
        return "Activer le mode debug avec un argument facultatif pour spécifier le port. Ne fonctionne que si le script de lancement le supporte.";
    }
    @Override
    protected String cannotExplodeDeploymentOfSelfContainedServer$str() {
        return "WFLYSRV0242: Impossible d'éclater un déploiement dans un serveur autonome";
    }
    @Override
    protected String jmxAttributeChange$str() {
        return "La valeur de l'attribut '%1$s' est passée de '%2$s' à '%3$s'";
    }
    @Override
    protected String requiredServiceNotUp$str() {
        return "WFLYSRV0292: Le service requis '%1$s' n'est pas actif. Il est actuellement défini sur '%2$s'.";
    }
    @Override
    protected String cannotIndexClass$str() {
        return "WFLYSRV0003: impossible d'indexer la classe %1$s sur %2$s";
    }
    @Override
    protected String bootComplete$str() {
        return "WFLYSRV0261: Boot terminé";
    }
    @Override
    protected String nullStreamAttachment$str() {
        return "WFLYSRV0094: Aucun flux à l'index [%1$d]";
    }
    @Override
    protected String httpManagementInterfaceIsUnsecured$str() {
        return "WFLYSRV0035: Aucun domaine de sécurité ou authentification de serveur http n'a été fourni pour le service de gestion http ; tous les accès seront libres.";
    }
    @Override
    protected String failedToResolveMulticastAddressForRollback$str() {
        return "WFLYSRV0188: N'a pas pu obtenir d'adresse multidiffusion pour %1$s";
    }
    @Override
    protected String unableToFindYaml$str() {
        return "WFLYSRV0290: Impossible de trouver le fichier YAML spécifié %1$s";
    }
    @Override
    protected String propertySpecifiedFileIsNotADirectory$str() {
        return "WFLYSRV0145: -D%1$s=%2$s n'est pas un répertoire";
    }
    @Override
    protected String startedWitErrors$str() {
        return "WFLYSRV0026: %1$s";
    }
    @Override
    protected String gitRespositoryInitialized$str() {
        return "WFLYSRV0279: Git initialisé dans %1$s";
    }
    @Override
    protected String invalidStreamIndex$str() {
        return "WFLYSRV0149: Valeur '%1$s' non valide : %2$d, l'index maximum est %3$d";
    }
    @Override
    protected String undeploymentRolledBack$str() {
        return "WFLYSRV0007: L'annulation du déploiement \"%1$s\" n'a pas eu lieu avec le message d'échec : %2$s";
    }
    @Override
    protected String unableToLoadProperties$str() {
        return "WFLYSRV0075: Impossible de charger les propriétés de l'URL '%1$s'";
    }
    @Override
    protected String serverTempDirectoryIsNotADirectory$str() {
        return "WFLYSRV0129: Le répertoire temp du serveur n'existe pas : %1$s";
    }
    @Override
    protected String redeployRolledBackWithNoMessage$str() {
        return "WFLYSRV0012: Le redéploiement de \"%1$s\" a été annulé sans message d'échec";
    }
    @Override
    protected String failedToRemoveDeploymentContent$str() {
        return "WFLYSRV0020: Un exception s'est produite lors de la suppression du contenu du déploiement %1$s";
    }
    @Override
    protected String invalidDeploymentURL$str() {
        return "WFLYSRV0095: '%1$s' n'est pas un URL valide";
    }
    @Override
    protected String reportAdminOnlyMissingDeploymentOverlayContent$str() {
        return "WFLYSRV0068: Aucun contenu de couche superposée de déploiement avec hachage %1$s n'est disponible dans le référentiel de contenu de déploiement pour le déploiement de %2$s à l'emplacement %3$s. Comme ce contrôleur hôte démarre en mode ADMIN uniquement, le processus de démarrage (boot) pourra permettre aux administrateurs de corriger ce problème. Si ce contrôleur hôte n'était pas en mode ADMIN seulement, cela constituerait une panne fatale de démarrage.";
    }
    @Override
    protected String couldNotDeleteFile$str() {
        return "WFLYSRV0253: Impossible de supprimer le fichier %1$s du déploiement en cours %2$s";
    }
    @Override
    protected String failedToInitRepository$str() {
        return "WFLYSRV0269: Échec de l'initialisation du référentiel %1$s";
    }
    @Override
    protected String startedClean$str() {
        return "WFLYSRV0025: %1$s";
    }
    @Override
    protected String externalModuleServiceAlreadyStarted$str() {
        return "WFLYSRV0178: Le module externe de service a déjà démarré";
    }
    @Override
    protected String serverAlreadyPaused$str() {
        return "WFLYSRV0210: Serveur déjà suspendu";
    }
    @Override
    protected String serverContentDirectoryIsNotDirectory$str() {
        return "WFLYSRV0125: Le répertoire du serveur de contenu n'est pas un répertoire : %1$s";
    }
    @Override
    protected String cannotReadContentFromUnmanagedDeployment$str() {
        return "WFLYSRV0255: Impossible d'analyser du contenu d'un déploiement non géré";
    }
    @Override
    protected String invalidPortOffset$str() {
        return "WFLYSRV0148: portOffset est hors de portée";
    }
    @Override
    protected String archiveMountFailed$str() {
        return "WFLYSRV0267: Impossible de monter la racine de la ressource '%1$s', est-ce vraiment une archive ?";
    }
    @Override
    protected String usingGit$str() {
        return "WFLYSRV0278: L'historique de configuration est géré via Git";
    }
    @Override
    protected String cannotAddContentToSelfContainedServer$str() {
        return "WFLYSRV0246: Impossible d'ajouter du contenu à un déploiement dans un serveur autonome";
    }
    @Override
    protected String logHttpAndHttpsConsole$str() {
        return "WFLYSRV0053: La console d'administration écoute sur http://%1$s:%2$d et https://%3$s:%4$d";
    }
    @Override
    protected String failedToResolveInterface$str() {
        return "WFLYSRV0082: échec de résolution de l'interface %1$s";
    }
    @Override
    protected String maximumNumberOfJarResources$str() {
        return "WFLYSRV0275: Nombre maximum de ressources de jar autorisées atteintes pour le nom de module global-directory '%1$s'. Le maximum autorisé est %2$dfichiers";
    }
    @Override
    protected String argGitBranch$str() {
        return "La branche git à utiliser pour obtenir la configuration du serveur, par défaut est ’master'";
    }
    @Override
    protected String propertySpecifiedFileDoesNotExist$str() {
        return "WFLYSRV0144: -D%1$s=%2$s n'existe pas";
    }
    @Override
    protected String securityManagerEnabled$str() {
        return "WFLYSRV0235: Le gestionnaire de sécurité est activé";
    }
    @Override
    protected String excludedSubSystemsNotExist$str() {
        return "WFLYSRV0273: Le sous-système %1$s exclu via jboss-deployment-structure.xml n'existe pas.";
    }
    @Override
    protected String vmArgumentsLabel$str() {
        return "Arguments MV : %1$s";
    }
    @Override
    protected String vaultNotInitializedException$str() {
        return "WFLYSRV0230: Le Vault n'est pas initialisé ; la résolution des expressions de Vault d'archivage n'est pas possible";
    }
    @Override
    protected String nativeManagementInterfaceIsUnsecured$str() {
        return "WFLYSRV0034: Aucun domaine de sécurité ou serveur sasl défini pour le service de gestion natif ; tous les accès seront libres.";
    }
    @Override
    protected String failedToResume$str() {
        return "WFLYSRV0215: Impossible de redémarrer l'activité %1$s. Pour redémarrer une opération normale, il est conseillé de redémarrer le serveur.";
    }
    @Override
    protected String suspendingServer0$str() {
        return "WFLYSRV0272: Suspension du serveur";
    }
    @Override
    protected String mechAuthorizationFailed$str() {
        return "WFLYSRV0301: Échec de l'autorisation du mécanisme d'authentification : \"%1$s\" s'exécutant en tant que \"%2$s\"";
    }
    @Override
    protected String configDirectoryDoesNotExist$str() {
        return "WFLYSRV0121: Le répertoire de configuration n'existe pas : %1$s";
    }
    @Override
    protected String cannotSetBothAdminOnlyAndStartMode$str() {
        return "WFLYSRV0262: Impossible d'indiquer à la fois --start-mode et --admin-only";
    }
    @Override
    protected String aliasAddedAsDependency$str() {
        return "WFLYSRV0293: L'alias du module '%1$s' a été ajouté en tant que dépendance au déploiement de '%2$s' via %3$s. Bien que cela soit autorisé, il est recommandé d'utiliser le module cible à la place. Envisagez de remplacer cet alias par son module cible '%4$s'.";
    }
    @Override
    protected String failedToCreateVFSResourceLoader$str() {
        return "WFLYSRV0104: Échec de la création de VFSResourceLoader pour root [%1$s]";
    }
    @Override
    protected String systemPropertyCannotOverrideServerName$str() {
        return "WFLYSRV0116: La propriété système %1$s ne peut pas être définie après que le nom du serveur a été défini via le fichier de configuration XML ou depuis un client de gestion";
    }
    @Override
    protected String failedToPullRepository$str() {
        return "WFLYSRV0268: N'a pas réussi à extraire %1$s du référentiel";
    }
    @Override
    protected String missingModulePrefix$str() {
        return "WFLYSRV0099: '%1$s' ne peut pas être chargé depuis un ServiceModuleLoader car son nom ne commence pas par '%2$s'";
    }
    @Override
    protected String missingHomeDirConfiguration$str() {
        return "WFLYSRV0088: Valeur de configuration manquante pour : %1$s";
    }
    @Override
    protected String resourceTooLarge$str() {
        return "WFLYSRV0165: La ressource est trop volumineuse pour pouvoir correspondre à un fichier de classe valide";
    }
    @Override
    protected String hostControllerNameNonNullInStandalone$str() {
        return "WFLYSRV0079: hostControllerName doit être null si le serveur n'est pas dans un domaine géré";
    }
    @Override
    protected String repositoryInitialized$str() {
        return "Référentiel initialisé";
    }
    @Override
    protected String mechNoSecurityLayer$str() {
        return "WFLYSRV0302: Le mécanisme d'authentification ne prend pas en charge la couche de sécurité (wrapping/dunwrapping).";
    }
    @Override
    protected String cannotRemoveContentFromSelfContainedServer$str() {
        return "WFLYSRV0250: Impossible de supprimer du contenu d'un déploiement dans un serveur autonome";
    }
    @Override
    protected String argSecMgr$str() {
        return "Exécute le serveur avec le gestionnaire de sécurité installé.";
    }
    @Override
    protected String deploymentPhaseFailed$str() {
        return "WFLYSRV0153: N'a pas pu traiter la phase %1$s de %2$s";
    }
    @Override
    protected String cannotStartServer$str() {
        return "WFLYSRV0141: Impossible de démarrer le serveur";
    }
    @Override
    protected String cannotAddContentToUnexplodedDeployment$str() {
        return "WFLYSRV0248: Impossible d'ajouter du contenu à un déploiement qui n'est pas sous forme éclatée";
    }
    @Override
    protected String problemOpeningStreamFromDeploymentURL$str() {
        return "WFLYSRV0096: Ne peut pas créer de flux d'entrée à partir de l'URL '%1$s'";
    }
    @Override
    protected String failedToReadVirtualFile$str() {
        return "WFLYSRV0100: Échec de la lecture de '%1$s'";
    }
    @Override
    protected String duplicateServerNameConfiguration$str() {
        return "WFLYSRV0048: Une configuration de nom de serveur a été fournie via la propriété de système %1$s ('%2$s') et via la configuration xml ('%3$s'). La configuration xml valide sera utilisée.";
    }
    @Override
    protected String cannotAddURLStreamHandlerFactory$str() {
        return "WFLYSRV0024: Impossible d'ajouter le module '%1$s' en tant que fournisseur d'URLStreamHandlerFactory";
    }
    @Override
    protected String noModuleIdentifier$str() {
        return "WFLYSRV0103: Aucun Module Identifier attaché au déploiement '%1$s'";
    }
    @Override
    protected String mechAuthenticationNotComplete$str() {
        return "WFLYSRV0296: Mécanisme d'authentification. L'authentification n'est pas encore terminée";
    }
    @Override
    protected String mechMalformedFields$str() {
        return "WFLYSRV0305: L'authentification du mécanisme d'authentification a échoué en raison d'un ou de plusieurs champs malformés";
    }
    @Override
    protected String serviceModuleLoaderAlreadyStarted$str() {
        return "WFLYSRV0097: ServiceModuleLoader est déjà démarré";
    }
    @Override
    protected String mechServerSideAuthenticationFailed$str() {
        return "WFLYSRV0299: Échec du mécanisme d'authentification côté serveur";
    }
    @Override
    protected String cannotReplaceDeployment$str() {
        return "WFLYSRV0086: Impossible d'utiliser %1$s avec la même valeur pour les paramètres %2$s et %3$s. Utilisez %4$s pour redéployer le même contenu ou %5$s pour remplacer le contenu avec une nouvelle version possédant le même nom.";
    }
    @Override
    protected String vaultModuleWithNoCode$str() {
        return "WFLYSRV0209: Quand vous spécifiez un 'module', vous devez également spécifier le 'code'";
    }
    @Override
    protected String replaceRolledBack$str() {
        return "WFLYSRV0014: Le remplacement du déploiement \"%1$s\" par le déploiement \"%2$s\" a été annulé avec le message d'échec : %3$s";
    }
    @Override
    protected String controllerTempDirectoryIsNotADirectory$str() {
        return "WFLYSRV0131: Le répertoire temp du contrôleur n'existe pas : %1$s";
    }
    @Override
    protected String mechInvalidMessageReceived$str() {
        return "WFLYSRV0303: Réception d'un message de négociation de mécanisme d'authentification non valide";
    }
    @Override
    protected String mechMessageAfterComplete$str() {
        return "WFLYSRV0297: L'échange du mécanisme d'authentification a reçu un message alors que l'authentification était déjà terminée.";
    }
    @Override
    protected String startedCleanMessage$str() {
        return "%1$s démarré dans %2$dms - Démarrage de %3$d de %4$d services (%5$d services sont lazy, passifs ou à la demande) %6$s";
    }
}
