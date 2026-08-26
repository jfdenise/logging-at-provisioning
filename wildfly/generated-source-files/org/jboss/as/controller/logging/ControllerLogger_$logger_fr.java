package org.jboss.as.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:09+0200")
public class ControllerLogger_$logger_fr extends ControllerLogger_$logger implements ControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ControllerLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String duplicateElementsInList$str() {
        return "WFLYCTL0372: L'attribut '%1$s' de la liste contient des doublons, ce qui n'est pas autorisé";
    }
    @Override
    protected String invalidInterfaceCriteriaPattern$str() {
        return "WFLYCTL0109: Modèle %1$s non valide pour le critère d'interface %2$s";
    }
    @Override
    protected String invalidRelativePathValue$str() {
        return "WFLYCTL0260: Valeur de relativePath non valide '%1$s'";
    }
    @Override
    protected String formattedCapabilityId$str() {
        return "%1$s dans le contexte '%2$s'";
    }
    @Override
    protected String socketBindingalreadyDeclared$str() {
        return "WFLYCTL0418: Un %1$s ou un %2$s %3$s déjà déclaré a déjà été déclaré dans %4$s %5$s";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYCTL0129: Valeur non valide %1$s pour %2$s; valeurs légales %3$s";
    }
    @Override
    protected String noResourceForUndefiningAttribute$str() {
        return "WFLYCTL0489: On ne peut pas défaire l'attribut %1$s puisqu'il n'y a pas de ressource à %2$s";
    }
    @Override
    protected String typeConversionError$str() {
        return "Impossible de convertir %1$s en %2$s";
    }
    @Override
    protected String cannotResolveAddress$str() {
        return "WFLYCTL0001: Impossible de résoudre l'adresse %1$s, donc impossible de la faire correspondre à une adresse InetAddress";
    }
    @Override
    protected String couldNotFindDirectorySpecifiedByProperty$str() {
        return "WFLYCTL0462: Impossible de trouver le répertoire '%1$s' spécifié par la propriété système '%2$s'. Veuillez vous assurer qu'il existe";
    }
    @Override
    protected String serviceTargetRuntimeOperationsOnly$str() {
        return "WFLYCTL0187: Obtenez la cible de service uniquement prise en charge pour les opérations en cours d'exécution";
    }
    @Override
    protected String failedToBuildReport$str() {
        return "WFLYCTL0401: Impossible de créer le rapport";
    }
    @Override
    protected String resourceRegistrationIsNotAnAlias$str() {
        return "WFLYCTL0281: L'enregistrement de la ressource n'est pas un alias";
    }
    @Override
    protected String requiredWithAlternatives$str() {
        return "WFLYCTL0446: %1$s ou %2$salternative(s) requis(es)";
    }
    @Override
    protected String cannotResolveProcessUUID$str() {
        return "WFLYCTL0246: Impossible de résoudre l'adresse de l'hôte local pour créer un nom basé-UUID pour ce process";
    }
    @Override
    protected String failedToBackup$str() {
        return "WFLYCTL0081: Impossible de sauvegarder %1$s";
    }
    @Override
    protected String timeoutCompletingOperation$str() {
        return "WFLYCTL0349: Expire après [%1$d] secondes en attendant que le conteneur de service se stabilise en fin d'opération. Le processus doit être démarré à nouveau. L'étape qui a mis le conteneur de service à jour au départ était '%2$s' à l'adresse suivante '%3$s'";
    }
    @Override
    protected String cannotAddMoreThanOneJvmForServerOrHost$str() {
        return "WFLYCTL0417: Impossible d'ajouter plus d'une jvm. Ajout de '%1$s' tenté, mais '%2$s' existe déjà";
    }
    @Override
    protected String serviceStatusReportDependencies$str() {
        return "WFLYCTL0184: Nouvelles dépendances manquantes/non complétées : %n";
    }
    @Override
    protected String failedToCloneRepository$str() {
        return "WFLYCTL0450: N'a pas réussi à cloner le référentiel %1$s";
    }
    @Override
    protected String rootRegistrationIsNotOverridable$str() {
        return "WFLYCTL0223: L'enregistrement de ressource root ne supporte pas les remplacements, donc aucun remplacement ne peut être supprimé.";
    }
    @Override
    protected String uuidNotValid$str() {
        return "WFLYCTL0501: Une chaîne UUID invalide '%1$s' a été trouvée à '%2$s'. Une nouvelle valeur sera générée.";
    }
    @Override
    protected String argYaml$str() {
        return "Les fichiers de configuration yaml pour personnaliser la configuration. Les chemins peuvent être absolus, relatifs au répertoire d'exécution actuel ou relatifs au répertoire de la configuration autonome.";
    }
    @Override
    protected String couldNotFindTransformerRegistryFallingBack$str() {
        return "WFLYCTL0405: Impossible de trouver un transformateur pour %1$s, retour à %2$s";
    }
    @Override
    protected String errorStoppingServer$str() {
        return "WFLYCTL0442: Erreur lors de l'arrêt du serveur";
    }
    @Override
    protected String attributeWasNotMarkedAsReloadRequired$str() {
        return "WFLYCTL0435: L'attribut %1$s de la ressource %2$s n'a pas été marqué selon les besoins de chargement, donc il vous faut soit définir le marqueur RESTART_ALL_SERVICES, ou bien, enregistrer un gestionnaire d'écriture personnalisé.";
    }
    @Override
    protected String validationFailedCouldNotConvertParamToType$str() {
        return "WFLYCTL0233: Impossible de convertir '%1$s' en un %2$s. %3$s";
    }
    @Override
    protected String invalidSystemPropertyValue$str() {
        return "WFLYCTL0010: Valeur %1$s non valide pour la propriété de système %2$s -- utilisant la valeur par défaut [%3$d]";
    }
    @Override
    protected String cannotModifyReadOnlyPath$str() {
        return "WFLYCTL0263: Le chemin '%1$s' est en lecture-seule; il ne peut pas être modifié";
    }
    @Override
    protected String unauthorized$str() {
        return "WFLYCTL0313: Non autorisé à exécuter l'opération '%1$s' pour la ressource '%2$s' -- %3$s";
    }
    @Override
    protected String illegalCharsetName$str() {
        return "WFLYCTL0482: La valeur '%1$s' n'est pas un nom composé d’un jeu de caractères légal";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYCTL0007: N'a pas pu fermer la ressource %1$s";
    }
    @Override
    protected String removingServiceUnsatisfiedDependencies1$str() {
        return "%nService %1$s était dépendant de ";
    }
    @Override
    protected String invalidEnumValue$str() {
        return "WFLYCTL0248: Valeur non valide %1$s pour %2$s; valeurs légales %3$s";
    }
    @Override
    protected String unknownBaseRole$str() {
        return "WFLYCTL0329: Rôle de base inconnu '%1$s'";
    }
    @Override
    protected String attributesDoNotSupportExpressions$str() {
        return "WFLYCTL0301: Les attributs suivants de supportent pas les expressions : %1$s";
    }
    @Override
    protected String unsupportedCharset$str() {
        return "WFLYCTL0483: Le jeu de caractères '%1$s' n'est pas pris en charge par cette instance de la machine virtuelle Java";
    }
    @Override
    protected String requiredCapabilityMissing0$str() {
        return "WFLYCTL0369: Les fonctions requises ne sont pas disponibles :";
    }
    @Override
    protected String missingOneOf$str() {
        return "WFLYCTL0132: Doit inclure un des éléments suivants : %1$s";
    }
    @Override
    protected String initialisedAdditionalBootCliScriptSystemNotKeepingAlive$str() {
        return "WFLYCTL0466: Initialisation de la fonctionnalité supplémentaire de script CLI de démarrage. Les commandes CLI seront lues à partir de %1$s. Le serveur sera redémarré en mode normal après l'exécution de ces commandes";
    }
    @Override
    protected String errorBootingContainer2$str() {
        return "WFLYCTL0003: Erreur de démarrage du conteneur dûe au manque d'espace dans la pile pour le thread utilisé pour exécuter les opérations de démarrage. Le thread a été configuré avec une taille de pile de [%1$d]. Vous pourrez sans doute résoudre ce problème en définissant la propriété système %2$s avec une valeur supérieure à [%1$d].";
    }
    @Override
    protected String wildcardOperationFailedAtSingleAddressWithComplexFailure$str() {
        return "WFLYCTL0286: L'opération %1$s invoquée contre des adresses cibles multiples a échoué à l'adresse %2$s. Voir le résultat de l'opération pour plus d'informations.";
    }
    @Override
    protected String invalidCredentialReferenceValue$str() {
        return "WFLYCTL0476: La valeur de l'attribut '%1$s' n'est pas valide : soit '%2$s' doit être spécifié seul, soit '%3$s' doit être spécifié avec au moins un des attributs '%4$s' ou '%5$s'";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYCTL0201: Attribut inconnu '%1$s'";
    }
    @Override
    protected String attributesDontSupportExpressions$str() {
        return "WFLYCTL0292: Les attributs de supportent pas les expressions dans la version du modèle cible et cette ressource aura besoin d'être ignorée sur l'hôte cible.";
    }
    @Override
    protected String cannotCreateEmptyConfig$str() {
        return "WFLYCTL0388: Impossible de créer un fichier de configuration %1$s vide";
    }
    @Override
    protected String transformerLoggerCoreModelOperationTransformerAttributes$str() {
        return "WFLYCTL0295: Transformation de l'opération %1$s de la ressource %2$s dans la version modèle principal '%3$s' -- %4$s %5$s";
    }
    @Override
    protected String serviceStatusReportFailed$str() {
        return "WFLYCTL0186: Services qui n'ont pas pu démarrer :";
    }
    @Override
    protected String failedToListConfigurationSnapshot$str() {
        return "WFLYCTL0454: N'a pas réussi à lister les snapshots de configuration %1$s";
    }
    @Override
    protected String invalidDescriptionNoParamTypeInDescription$str() {
        return "WFLYCTL0241: Il n'y a pas de type pour le paramètre '%1$s' dans la description de l'opération dans %2$s :%3$s";
    }
    @Override
    protected String fileNotFoundWithPrefix$str() {
        return "WFLYCTL0091: Aucun fichier commençant par '%1$s' trouvé dans %2$s";
    }
    @Override
    protected String noAttributeDefined$str() {
        return "WFLYCTL0509: Aucun attribut appelé '%1$s ' est défini à l'adresse '%2$s'.";
    }
    @Override
    protected String alreadyDefined$str() {
        return "WFLYCTL0039: %1$s déjà défini";
    }
    @Override
    protected String deadLock$str() {
        return "WFLYCTL0497: Blocage détecté !";
    }
    @Override
    protected String failedToUpdateAuditLog$str() {
        return "WFLYCTL0035: La mise à jour du log d'audit des opérations de gestion a échoué";
    }
    @Override
    protected String failedToTakeSnapshot$str() {
        return "WFLYCTL0088: N'a pas pu prendre un instantané de %1$s à %2$s";
    }
    @Override
    protected String notFound$str() {
        return "WFLYCTL0153: Aucun %1$s%2$s trouvé pour %3$s";
    }
    @Override
    protected String modelFieldsNotKnown$str() {
        return "WFLYCTL0282: Le modèle contient des champs qui ne sont pas connus par définition, champs: %1$s, chemin : %2$s";
    }
    @Override
    protected String nodeAlreadyRegistered$str() {
        return "WFLYCTL0218: Nœud déjà enregistré dans '%1$s'";
    }
    @Override
    protected String failedSubsystemBootOperations$str() {
        return "WFLYCTL0006: N'a pas pu exécuter les opérations de démarrage %1$s du sous-système";
    }
    @Override
    protected String unknownMulticastAddress$str() {
        return "WFLYCTL0266: La valeur %1$s de l'attribut %2$s ne correspond pas à une adresse multicast valide";
    }
    @Override
    protected String serviceInstallCancelled$str() {
        return "WFLYCTL0179: L'installation du service a été annulée";
    }
    @Override
    protected String noPathToResolve$str() {
        return "WFLYCTL0291: Il n'y a pas de chemin enregistré pour résoudre avec l'attribut de chemin '%1$s' et/ou en relation à l'attribut '%2$s' sur: %3$s";
    }
    @Override
    protected String failedToParseElementLenient$str() {
        return "WFLYCTL0411: Impossible d'analyser l'élément '%1$s', ignore ...";
    }
    @Override
    protected String noFinalProxyOutcomeReceived$str() {
        return "WFLYCTL0016: N'a pas reçu de réponse finale pour l'opération %1$s ayant pour adresse %2$s en provenance du processus à l'adresse %3$s. Le résultat de cette opération n'inclura que la réponse préliminaire du processus distant à la requête.";
    }
    @Override
    protected String illegalPermissionName$str() {
        return "WFLYCTL0381: Nom de permission illégal '%1$s'";
    }
    @Override
    protected String extensionModuleLoadingFailure$str() {
        return "WFLYCTL0311: N'a pas pu charger le module d'extension %1$s";
    }
    @Override
    protected String unexpectedAttribute1$str() {
        return "WFLYCTL0197: Attribut '%1$s' inattendu rencontré";
    }
    @Override
    protected String reloadingServerToNormalModeAfterRestartAfterAdditionalBootCliScript$str() {
        return "WFLYCTL0471: Rechargement du serveur en mode normal après le redémarrage suivant l'exécution des commandes supplémentaires du script CLI. Cela effacera les propriétés déclenchant la fonctionnalité supplémentaire du script CLI de démarrage si celles-ci sont définies (%1$s,%2$s ,%3$s)";
    }
    @Override
    protected String invalidMaxSize$str() {
        return "WFLYCTL0114: [%1$d] n'est pas à la bonne taille pour le paramètre %2$s. Il vous faut une longueur maximum de [%3$d]";
    }
    @Override
    protected String operationNotRegisteredException$str() {
        return "WFLYCTL0224: Il n'y a pas d'opération %1$s enregistrée à l'adresse %2$s";
    }
    @Override
    protected String aliasAlreadyRegistered$str() {
        return "WFLYCTL0277: Un alias a déjà été enregistré dans la location '%1$s'";
    }
    @Override
    protected String operationFailedOnClientError$str() {
        return "WFLYCTL0017: L'opération (%1$s) a échoué - adresse : (%2$s) - description de l'échec : %3$s";
    }
    @Override
    protected String interruptedAwaitingInitialResponse$str() {
        return "WFLYCTL0350: Exécution de l'opération '%1$s' sur le processus distant à l'adresse '%2$s' interrompue lors de l'attente de la réponse initiale ; le processus distant a reçu une notification d'annuler l'opération";
    }
    @Override
    protected String serviceRemovalRuntimeOperationsOnly$str() {
        return "WFLYCTL0182: La suppression du service n'est prise en charge uniquement que pour les opérations en cours d'exécution";
    }
    @Override
    protected String unsupportedDeployment$str() {
        return "WFLYCTL0507: Fichier yaml de déploiement non pris en charge %1$s avec des attributs %2$s";
    }
    @Override
    protected String namespaceAlreadyRegistered$str() {
        return "WFLYCTL0138: Espace nom ayant le préfixe %1$s déjà enregistré avec schéma URI %2$s";
    }
    @Override
    protected String runtimeModificationComplete$str() {
        return "WFLYCTL0416: La modification du conteneur de service de runtime par une opération de gestion est terminée";
    }
    @Override
    protected String validationFailedValueIsSmallerThanMin$str() {
        return "WFLYCTL0234: La valeur '%1$s' qui a été passée à '%2$s' est inférieure à la valeur minimum '%3$s'. %4$s";
    }
    @Override
    protected String cannotOverrideNonWildCardRegistration$str() {
        return "WFLYCTL0221: L'enregistrement d'un modèle de remplacement non permis pour les enregistrements de modèles non génériques. Cette enregistrement est pour le nom non générique '%1$s'.";
    }
    @Override
    protected String invalidAttributeCombo$str() {
        return "WFLYCTL0105: %1$s n'est pas valide combiné avec %2$s";
    }
    @Override
    protected String adminOnlyPolicyDeprecatedValue$str() {
        return "WFLYCTL0495: \"fetch-from-master\" est une valeur obsolète pour \"domain-controller.remote.admin-only-policy\", \"fetch-from-domain-controller\" sera utilisé à la place.";
    }
    @Override
    protected String operationDeprecatedMessage$str() {
        return "WFLYCTL0449: L'opération %1$s sur la ressource à l'adresse %2$s est obsolète et pourrait être supprimée dans la prochaine version. Pour en savoir plus sur la dépréciation, consultez la sortie de l'opération read-operation-description.";
    }
    @Override
    protected String proxyHandlerAlreadyRegistered$str() {
        return "WFLYCTL0169: Un gestionnaire de proxy est déjà enregistré dans la location '%1$s'";
    }
    @Override
    protected String cannotRemoveStandardRole$str() {
        return "WFLYCTL0328: Impossible de supprimer le rôle standard '%1$s'";
    }
    @Override
    protected String invalidAttributeValue1$str() {
        return "WFLYCTL0475: Valeur d’attribut '%1$s' non valide.";
    }
    @Override
    protected String failedToParseYamlConfigurationFile$str() {
        return "WFLYCTL0485: Erreur d'analyse du fichier yaml %1$s";
    }
    @Override
    protected String runtimePackageDependencyAlreadyRegistered$str() {
        return "WFLYCTL0481: Le paquet de dépendances d'exécution '%1$s' est déjà enregistré à l'emplacement '%2$s'";
    }
    @Override
    protected String illegalInterfaceCriteria$str() {
        return "WFLYCTL0094: Le type de critère d'interface illégal %1$s, devrait être %2$s";
    }
    @Override
    protected String initialisedAdditionalBootCliScriptSystemKeepingAlive$str() {
        return "WFLYCTL0465: Initialisation de la fonctionnalité supplémentaire de script CLI de démarrage. Les commandes CLI seront lues à partir de %1$s. Le serveur restera en mode admin-only après leur exécution, et le résultat des opérations cli sera écrit dans le fichier %2$s";
    }
    @Override
    protected String compositeOperationFailed$str() {
        return "WFLYCTL0062: Opération composite échouée et annulée. Étapes déficientes :";
    }
    @Override
    protected String duplicateInterfaceDeclaration$str() {
        return "WFLYCTL0072: Déclaration d'interface en double";
    }
    @Override
    protected String pathIsAWindowsAbsolutePath$str() {
        return "WFLYCTL0261: '%1$s' est un chemin Windows absolu";
    }
    @Override
    protected String invalidPort$str() {
        return "WFLYCTL0245: Valeur '%1$s' illégale %2$s -- doit être un numéro de port valide";
    }
    @Override
    protected String ambiguousName$str() {
        return "WFLYCTL0045: Nom '%1$s' ambigu dans %2$s : %3$s";
    }
    @Override
    protected String useOperationContextRemoveService$str() {
        return "WFLYCTL0247: N'appelez pas ServiceController.setMode(REMOVE), utiliser OperationContext.removeService() à la place.";
    }
    @Override
    protected String noSatisfactoryCapability$str() {
        return "WFLYCTL0499: Il n'y a pas de capacité satisfaisante '%1$s' disponible pour les ressources ayant l'étendue de capacité '%2$s'. Cette capacité est enregistrée à l'adresse ou aux adresses '%3$s', et n'est pas accessible aux ressources ayant scope '%4$s’.";
    }
    @Override
    protected String timeoutExecutingOperation0$str() {
        return "WFLYCTL0344: Le délai de l'opération a expiré en attendant que le service de conteneur se stabilise";
    }
    @Override
    protected String orderedChildTypeRenamed$str() {
        return "WFLYCTL0398: Un tentative de renommer la ressource trouvée sur %1$s par %2$s a été effectuée. Cependant, '%3$s' est l'un des types de ressources défini de manière à être ordonné sur la ressource parente %4$s";
    }
    @Override
    protected String noChildType$str() {
        return "WFLYCTL0147: Aucun type de dépendant %1$s";
    }
    @Override
    protected String operationContextIsNotAbstractOperationContext$str() {
        return "WFLYCTL0318: Le contexte opérationnel n'est pas un AbstractOperationContext";
    }
    @Override
    protected String invalidMaxLength$str() {
        return "WFLYCTL0112: '%1$s' est une valeur non valide pour le paramètre %2$s. Les valeurs doivent avoir une longueur maximum de %3$d caractères";
    }
    @Override
    protected String validationFailedValueIsLongerThanMaxLength$str() {
        return "WFLYCTL0237: La valeur '%1$s' qui a été passée à '%2$s' est plus longue que la valeur maximum '%3$s'. %4$s";
    }
    @Override
    protected String missingYamlFile$str() {
        return "WFLYCTL0486: Fichier yaml manquant %1$s";
    }
    @Override
    protected String invalidDescriptionInvalidParamTypeInDescription$str() {
        return "WFLYCTL0242: Impossible de déterminer le type de paramètre '%1$s' dans la description de l'opération dans %2$s: %3$s";
    }
    @Override
    protected String pathEntryIsReadOnly$str() {
        return "WFLYCTL0257: L'entrée du chemin est en lecture-seule : '%1$s'";
    }
    @Override
    protected String cancellingOperation$str() {
        return "WFLYCTL0352: Annulation de l'opération '%1$s' ayant pour id '%2$d' exécutant sur la chaîne '%3$s'";
    }
    @Override
    protected String cannotReadTargetDefinition$str() {
        return "WFLYCTL0024: N'a pas pu lire la définition de la cible !";
    }
    @Override
    protected String illegalCLIStylePathAddress$str() {
        return "WFLYCTL0387: L'adresse du chemin d'accès '%1$s' est illégale : elle n'est pas sous un format CLI correct";
    }
    @Override
    protected String invalidMaxBytesLength$str() {
        return "WFLYCTL0419: '%1$s' est une valeur non valide pour le paramètre %2$s. Les valeurs doivent avoir une longueur maximum de %3$d octets";
    }
    @Override
    protected String failedToLoadModule0$str() {
        return "WFLYCTL0083: N'a pas pu charger le module";
    }
    @Override
    protected String requiredCapabilityMissing1$str() {
        return "WFLYCTL0362: Les fonctions requises par la ressource '%1$s' ne sont pas disponibles :";
    }
    @Override
    protected String invalidDescriptionMinMaxForParameterHasWrongType$str() {
        return "WFLYCTL0243: L'attribut '%1$s' du paramètre '%2$s' ne peut pas être converti dans son type : %3$s dans la description de l'opération dans %4$s: %5$s";
    }
    @Override
    protected String invalidAttributeDefinition$str() {
        return "WFLYCTL0484: La définition de l'attribut '%1$s' est nulle";
    }
    @Override
    protected String invalidPathElementValue$str() {
        return "WFLYCTL0128: Élément d'adresse de ressource non valide '%1$s'. La valeur '%2$s' n'est pas valide pour un élément qui se trouve dans une adresse de ressource. Le caractère '%3$s' n'est pas autorisé.";
    }
    @Override
    protected String subsystemBootInterrupted$str() {
        return "WFLYCTL0191: Interruption lors de l'attente de l'exécution de l'opération d'amorçage du sous-système";
    }
    @Override
    protected String wildcardRegistrationIsNotAnOverride$str() {
        return "WFLYCTL0222: Un enregistrement nommé '*' n'est pas un modèle de remplacement et ne peut pas être enregistré via l'API unregisterOverrideModel.";
    }
    @Override
    protected String invalidWildcardAddress$str() {
        return "WFLYCTL0011: L'adresse %1$s est une adresse générique, qui ne pourra pas correspondre à une adresse particulière. N'utilisez pas l'élément de configuration '%2$s' pour spécifier qu'une interface doit utiliser une adresse générique, utilisez '%3$s'";
    }
    @Override
    protected String invalidAddressMask$str() {
        return "WFLYCTL0103: Masque non valide %1$s (%2$s)";
    }
    @Override
    protected String pathEntryAlreadyExists$str() {
        return "WFLYCTL0258: Il existe déjà une entrée de chemin nommée : '%1$s'";
    }
    @Override
    protected String cannotDeleteTempFile$str() {
        return "WFLYCTL0029: Impossible de supprimer le fichier temp %1$s, sera supprimé à la sortie";
    }
    @Override
    protected String inconsistentCapabilityContexts4$str() {
        return "WFLYCTL0399: La fonction '%1$s' requise par la fonction '%2$s' dans le contexte '%3$s' est disponible dans un ou plusieurs groupes de liaison de socket mais toutes les fonctions de liaison de socket requises par '%4$s' ne peuvent pas être résolues à partir d'un seul groupe de liaison de socket. Cette configuration n'est donc pas valide";
    }
    @Override
    protected String cannotOverrideRootRegistration$str() {
        return "WFLYCTL0220: L'enregistrement d'un modèle de remplacement non permis pour l'enregistrement du modèle root";
    }
    @Override
    protected String operationFailed3$str() {
        return "WFLYCTL0013: L'opération (%1$s) a échoué - adresse : (%2$s) - description de l'échec : %3$s";
    }
    @Override
    protected String couldNotCreateHistoricalBackup$str() {
        return "WFLYCTL0414: N'a pas pu créer une sauvegarde horodatée du rép %1$s d'historique en cours, peut donc inclure des versions héritées du dernier démarrage.";
    }
    @Override
    protected String noAttributeValueDefined$str() {
        return "WFLYCTL0511: Aucune valeur n'est définie pour l'attribut '%1$s' à l'adresse '%2$s'.";
    }
    @Override
    protected String invalidAttributeValue3$str() {
        return "WFLYCTL0209: La valeur '%1$s' est non valide pour l'attribut '%2$s' -- les valeurs valides sont %3$s";
    }
    @Override
    protected String invalidCapabilityServiceType$str() {
        return "WFLYCTL0394: La fonction '%1$s' ne fournit pas de services de type '%2$s'";
    }
    @Override
    protected String logHandlerWriteFailed$str() {
        return "WFLYCTL0037: Échec de la mise à jour du log d'audit des opérations de gestion dans le handler '%1$s'";
    }
    @Override
    protected String invalidLoadFactor$str() {
        return "WFLYCTL0111: Le facteur de chargement doit être supérieur à 0 et inférieur ou égal à 1";
    }
    @Override
    protected String snapshotAlreadyExistError$str() {
        return "WFLYCTL0455: Impossible de prendre les instantanés %1$s parce qu'ils existent déjà";
    }
    @Override
    protected String ignoringUnsupportedLegacyExtension$str() {
        return "WFLYCTL0034: Les sous-systèmes %1$s fournis par l'extension héritée '%2$s' ne sont pas supportés sur des serveurs exécutant cette version. L'extension est uniquement prise en charge pour une utilisation par hôtes exécutant une version antérieure dans un domaine géré de version mixte. Sur ce serveur, l'extension n'enregistrera pas de sous-systèmes et les futures tentatives de créer ou de s'adresser aux ressources de sous-systèmes sur ce serveur se traduiront par un échec.";
    }
    @Override
    protected String systemPropertyAlreadyExist$str() {
        return "WFLYCTL0456: La propriété système \"%1$s\" est déjà définie dans la section <system-properties> du fichier de configuration. La valeur définie dans la ligne de commande sera remplacée par cette valeur.";
    }
    @Override
    protected String threadDump$str() {
        return "WFLYCTL0496: Thread dump:";
    }
    @Override
    protected String noInterfaceCriteria$str() {
        return "WFLYCTL0149: Aucun critère d'interface n'a été fourni";
    }
    @Override
    protected String invalidAddressValue$str() {
        return "WFLYCTL0104: Adresse non valide %1$s (%2$s)";
    }
    @Override
    protected String nullNotAllowed$str() {
        return "WFLYCTL0155: '%1$s' n'est sans doute pas null";
    }
    @Override
    protected String invalidMinValue$str() {
        return "WFLYCTL0117: %1$d n'est pas à la bonne taille pour le paramètre %2$s. Il vous faut une valeur minimum de %3$d";
    }
    @Override
    protected String rollbackAlreadyInvoked$str() {
        return "WFLYCTL0176: rollback() a déjà été invoqué";
    }
    @Override
    protected String capabilityDoesNotExposeRuntimeAPI$str() {
        return "WFLYCTL0366: La fonction '%1$s' n'expose pas une API de runtime.";
    }
    @Override
    protected String invalidAddressFormat$str() {
        return "WFLYCTL0433: '%1$s' n'est pas une représentation valide d'une adresse de ressource";
    }
    @Override
    protected String incompleteExpression$str() {
        return "WFLYCTL0370: Expression incomplète : %1$s";
    }
    @Override
    protected String invalidDescriptionUndefinedRequestProperty$str() {
        return "WFLYCTL0240: Propriété de requête non définie '%1$s' dans la description de l'opération dans %2$s: %3$s";
    }
    @Override
    protected String unexpectedOperationExecutionFailureDescription$str() {
        return "WFLYCTL0404: Exception inattendue lors de l'exécution : %1$s";
    }
    @Override
    protected String systemPropertyDeprecated$str() {
        return "WFLYCTL0515: La propriété système '%1$s' est obsolète et peut être supprimé dans une future version, attribut '%2$s’ sur la ressource ’%3$s' devrait être utilisé à la place.";
    }
    @Override
    protected String noRestartMarkerFile$str() {
        return "WFLYCTL0474: Aucun fichier de marqueur trouvé indiquant que le serveur a été redémarré suite à l'exécution des commandes supplémentaires du script CLI";
    }
    @Override
    protected String timeoutAwaitingFinalResponse$str() {
        return "WFLYCTL0410: Le délai d'exécution de l'opération '%1$s' sur le processus distant à l'adresse '%2$s' a expiré après %3$d ms en attendant la réponse finale ; le processus distant a été informé de terminer l'opération";
    }
    @Override
    protected String moreThanOneInstanceOfAdditionalBootCliScriptInvokerFound$str() {
        return "WFLYCTL0463: Plus d'une instance de AdditionalBootCliScriptInvoker trouvée. Ayant : '%1$s' ; trouvé : '%2$s";
    }
    @Override
    protected String attributesAreNotUnderstoodAndMustBeIgnored0$str() {
        return "WFLYCTL0293: Les attributs ne sont pas compris par la version du modèle cible et cette ressource aura besoin d'être ignorée sur l'hôte cible.";
    }
    @Override
    protected String stepHandlerFailed$str() {
        return "WFLYCTL0190: Le gestionnaire d'étape %1$s pour l'opération %2$s à l’addresse %3$s fa échoué -- %4$s";
    }
    @Override
    protected String wildcardOperationFailedAtMultipleAddresses$str() {
        return "WFLYCTL0287: L'opération %1$s invoquée contre des adresses cibles multiples a échoué aux adresses %2$s. Voir le résultat de l'opération pour plus d'informations.";
    }
    @Override
    protected String invalidSha1Value$str() {
        return "WFLYCTL0122: La valeur %1$s de l'attribut %2$s ne représente pas un hachage SHA1 codifié-hex correctement";
    }
    @Override
    protected String ambiguousConfigurationFiles$str() {
        return "WFLYCTL0044: Nom de fichier de configuration '%1$s' ambigu car il y a plusieurs fichiers dans %2$s qui se terminent par %3$s";
    }
    @Override
    protected String invalidTableSize$str() {
        return "WFLYCTL0126: Impossible d'avoir une table de taille négative !";
    }
    @Override
    protected String validationFailedOperationHasNoField$str() {
        return "WFLYCTL0227: L'opération n'a pas de champ '%1$s'. %2$s";
    }
    @Override
    protected String unsupportedLegacyExtension$str() {
        return "WFLYCTL0309: L'extension héritée '%1$s' n'est pas supportée sur des serveurs exécutant cette version. L'extension est uniquement prise en charge pour une utilisation par hôtes exécutant une version antérieure dans un domaine géré de version mixte";
    }
    @Override
    protected String transactionInterrupted$str() {
        return "WFLYCTL0195: Interruption lors de l'attente de la validation ou du rollback de la transaction";
    }
    @Override
    protected String noHandlerForOperation$str() {
        return "WFLYCTL0031: Il n'y a pas d'opération '%1$s' enregistrée à l'adresse %2$s";
    }
    @Override
    protected String duplicateAttribute$str() {
        return "WFLYCTL0068: Un attribut nommé '%1$s' a déjà été déclaré";
    }
    @Override
    protected String udpSyslogServerUnavailable$str() {
        return "WFLYCTL0375: La mise à jour du journal d'auditing des opérations de gestion a échoué sur le handler '%1$s' en raison de '%2$s'. Veuillez vous assurer que le serveur syslog exécute bien et qu'il soit joignable";
    }
    @Override
    protected String illegalMultipleRoles$str() {
        return "WFLYCTL0314: Les utilisateurs à rôles multiples ne sont pas autorisés";
    }
    @Override
    protected String noOperationDefined$str() {
        return "WFLYCTL0383: Aucune opération définie %1$s";
    }
    @Override
    protected String andNMore$str() {
        return "WFLYCTL0208: ... et %1$s de plus";
    }
    @Override
    protected String selectFailedCouldNotConvertAttributeToType$str() {
        return "WFLYCTL0406: Impossible de convertir l'attribut '%1$s' vers un %2$s";
    }
    @Override
    protected String errorConstructingYAMLMapping$str() {
        return "Lors de la construction d'un mapping ; %1$s; on s'attendait à un mapping pour la fusion, mais on a trouvé %2$s";
    }
    @Override
    protected String noActiveStep$str() {
        return "WFLYCTL0144: Aucune étape active";
    }
    @Override
    protected String cannotGetControllerLock$str() {
        return "WFLYCTL0307: Nous essayons de lire des données à partir du contrôleur de domaine, qui est actuellement occupé à exécuter une autre série d'opérations. Il s'agit d'une situation temporaire, veuillez réessayer";
    }
    @Override
    protected String validationFailedValueIsShorterThanMinLength$str() {
        return "WFLYCTL0236: La valeur '%1$s' qui a été passée à '%2$s' est plus courte que la valeur minimum '%3$s'. %4$s";
    }
    @Override
    protected String notADirectory$str() {
        return "WFLYCTL0152: %1$s n'est pas un répertoire";
    }
    @Override
    protected String rejectAttributesSubsystemModelResourceTransformer$str() {
        return "WFLYCTL0300: Transformation de la ressource %1$s du contrôleur hôte '%2$s' vers le modèle de version '%3$s' du sous-système '%4$s' -- il y avait des problèmes avec certains des attributs et cette ressource devra être ignorée sur cet hôte. Détails du problème : %5$s";
    }
    @Override
    protected String missingRequiredServices$str() {
        return "WFLYCTL0412: Les services requis ne sont pas installés :";
    }
    @Override
    protected String onlyAccessHostControllerInfoInRuntimeStage$str() {
        return "WFLYCTL0386: Les informations du contrôleur de l'hôte peuvent uniquement être accédées après l'étape du modèle au démarrage";
    }
    @Override
    protected String servicesMissingDependencies$str() {
        return "WFLYCTL0180: Services avec des dépendances manquantes/non disponibles";
    }
    @Override
    protected String pathManagerNotAvailable$str() {
        return "WFLYCTL0265: PathManager non disponible pour les processus du type '%1$s'";
    }
    @Override
    protected String serviceStatusReportNoLongerRequired$str() {
        return "%1$s (plus requis actuellement) %n";
    }
    @Override
    protected String noChildResource$str() {
        return "WFLYCTL0502: Aucune ressource enfant appelée ’%1$s ' pourrait être trouvé à l'adresse '%2$s'.";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYCTL0397: Les ressources enfants indexées peuvent uniquement être enregistrées si la ressource parent prend en charge les enfants ordonnés. Le parent de '%1$s' n'est pas indexé";
    }
    @Override
    protected String pathEntryNotFound$str() {
        return "WFLYCTL0256: N'a pas pu trouver un chemin nommé '%1$s'";
    }
    @Override
    protected String explodedDeploymentNotSupported$str() {
        return "WFLYCTL0421: Les déploiements sous forme éclatée ne sont pas pris en charge par tous les serveurs";
    }
    @Override
    protected String invalidParameterValue$str() {
        return "WFLYCTL0121: %1$s ne correspond pas à une valeur de paramètre valide pour le paramètre %2$s -- doit correspondre à un des %3$s";
    }
    @Override
    protected String attemptingReconnectToSyslog$str() {
        return "WFLYCTL0354: Tentative de reconnexion au syslog handler '%1$s; après un délai d'expiration de %2$d secondes";
    }
    @Override
    protected String attributesMustBeDefined$str() {
        return "WFLYCTL0336: Les attributs suivants peuvent être annulés dans le modèle en cours, mais ils doivent être définis dans la version du modèle cible: %1$s";
    }
    @Override
    protected String invalidHeaderName$str() {
        return "WFLYCTL0457: Le nom de l'en-tête HTTP est non valide '%1$s'";
    }
    @Override
    protected String validationFailed$str() {
        return "WFLYCTL0207: La validation a échoué pour %1$s";
    }
    @Override
    protected String timeoutExecutingOperation3$str() {
        return "WFLYCTL0348: Expiration aprés [%1$d] secondes en attendant que le conteneur de service se stabilise. L'opération sera annulée. L'étape qui a mis le conteneur de service à jour au départ était '%2$s' à l'adresse suivante '%3$s'";
    }
    @Override
    protected String failedToPersistConfigurationChange1$str() {
        return "WFLYCTL0086: N'a pas pu faire persister la modification de configuration : %1$s";
    }
    @Override
    protected String reserved$str() {
        return "WFLYCTL0173: %1$s réservé";
    }
    @Override
    protected String tableIsFull$str() {
        return "WFLYCTL0194: Le tableau est rempli !";
    }
    @Override
    protected String timeoutAwaitingInitialStability3$str() {
        return "WFLYCTL0347: Expire après [%1$d] secondes en attendant que le conteneur initial de service se stabilise avant d'autoriser des changements de runtime pour l'opération '%2$s' à l'adresse suivante '%3$s'. L'opération est alors annulée; vous devrez démarrer le processus à nouveau.";
    }
    @Override
    protected String noSuchResourceType$str() {
        return "WFLYCTL0030: Il n'y a pas de définition de ressource enregistrée à l'adresse %1$s";
    }
    @Override
    protected String missingRequiredElements$str() {
        return "WFLYCTL0134: Élément(s) manquants requis : %1$s";
    }
    @Override
    protected String operationFailed4$str() {
        return "WFLYCTL0013: Opération (%1$s) échoué - adresse : (%2$s) - description de l'échec : %3$s%4$s";
    }
    @Override
    protected String readOnlyContext$str() {
        return "WFLYCTL0306: contexte lecture-seule";
    }
    @Override
    protected String duplicateExtensionElement$str() {
        return "WFLYCTL0437: Extension double : un élément %1$s ayant %2$spour valeur '%3$s' a déjà été analysé";
    }
    @Override
    protected String missingManagementServices$str() {
        return "WFLYCTL0459: Déclenchement d'un roll back en raison de services de gestion manquants.";
    }
    @Override
    protected String extensionDeprecated$str() {
        return "WFLYCTL0033: L'extension %1$s est obsolète, et ne sera pas forcément supportée dans les futures versions";
    }
    @Override
    protected String servicesMissing$str() {
        return "[%1$s] est manquant";
    }
    @Override
    protected String noKnownProviderPoints$str() {
        return "; aucun point d'enregistrement connu pouvant fournir cette fonctionnalité.";
    }
    @Override
    protected String rejectResourceOperationTransformation$str() {
        return "WFLYCTL0304: L'opération %2$s à %1$1s est rejetée sur l'hôte cible, et devra être ignorée sur l'hôte";
    }
    @Override
    protected String unableToBuildCommandCredentialSource$str() {
        return "WFLYCTL0478: Impossible de créer CredentialSource basé sur une commande pour la référence d'authentification.";
    }
    @Override
    protected String failedToCreateConfigurationBackup$str() {
        return "WFLYCTL0082: Impossible de créer des copies de sauvegarde du fichier de configuration %1$s";
    }
    @Override
    protected String aliasTargetResourceRegistrationNotFound$str() {
        return "WFLYCTL0279: Adresse cible alias introuvable : %1$s";
    }
    @Override
    protected String attemptToBothRemoveAndAddHandlerUpdateInstead$str() {
        return "WFLYCTL0322: Il y a eu une tentative de supprimer et d'ajouter à la fois un handler d'une opération composite - à la place, mettre le handler à jour";
    }
    @Override
    protected String canOnlyCreateChildAuditLoggerForMainAuditLogger$str() {
        return "WFLYCTL0331: Impossible de créer un Enregistreur d'événements d'audit dépendant de l'Enregistreur d'audit principal";
    }
    @Override
    protected String nonHostCapableSubsystemInHostModel$str() {
        return "WFLYCTL0385: Une tentative a été effectuée pour enregistrer le sous-système non hôte '%1$s' à partir du module d'extension '%2$s' dans le modèle de l'hôte.";
    }
    @Override
    protected String invalidLocaleString$str() {
        return "WFLYCTL0269: Format de locale non valide : %1$s";
    }
    @Override
    protected String attemptToBothAddAndRemoveAndHandlerFromCompositeOperation$str() {
        return "WFLYCTL0323: Il y a eu une tentative d'ajouter et de supprimer à la fois un handler d'une opération composite";
    }
    @Override
    protected String attributeNotWritable$str() {
        return "WFLYCTL0048: L'attribut %1$s n'est pas accessible en écriture";
    }
    @Override
    protected String schemaNotFound$str() {
        return "WFLYCTL0178: Aucune location de schéma ayant comme URI %1$s n'a été trouvée";
    }
    @Override
    protected String nonexistentInterface$str() {
        return "WFLYCTL0254: La valeur '%1$s' non valide pour l'attribut '%2$s' -- il n'existe pas de configuration d'interface qui existe avec ce nom";
    }
    @Override
    protected String invalidModificationAfterCompletedStep$str() {
        return "WFLYCTL0118: Modification non valide suite à cette étape";
    }
    @Override
    protected String deploymentResourceMustBeRuntimeOnly$str() {
        return "WFLYCTL0373: La ressource de déploiement doit être uniquement le runtime";
    }
    @Override
    protected String persisterNotInjected$str() {
        return "WFLYCTL0165: Aucun persisteur de configuration n'a été injecté";
    }
    @Override
    protected String cannotCreate$str() {
        return "WFLYCTL0051: N'a pas pu créer %1$s";
    }
    @Override
    protected String invalidRuntimeStageForProfile$str() {
        return "WFLYCTL0444: Le gestionnaire de l'opération '%1$s' adresse '%2$s' a tenté d'ajouter une étape sur le stage intermédiaire %3$s. Ce n'est pas valide pour une ressource de profil sur un type de process %4$s, donc cette étape ne sera pas exécutée.";
    }
    @Override
    protected String timeoutAwaitingInitialStability0$str() {
        return "WFLYCTL0343: Le conteneur de services a été déstabilisé par l'opération précédente et il n'est pas possible de traiter davantage de mises à jour en cours d'exécution.";
    }
    @Override
    protected String cannotRemoveRequiredCapabilityInContext$str() {
        return "WFLYCTL0368: Impossible de supprimer la fonction '%1$s' du contexte '%2$s' car elle est requise par d'autres fonctions :";
    }
    @Override
    protected String configurationFileNameNotAllowed$str() {
        return "WFLYCTL0064: Les fichiers de configuration ayant pour nom complet %1$s ne sont pas autorisés";
    }
    @Override
    protected String streamWasClosed$str() {
        return "WFLYCTL0274: Stream était fermé";
    }
    @Override
    protected String alreadyDeclared4$str() {
        return "WFLYCTL0041: Un %1$s %2$s déjà déclaré a déjà été déclaré dans %3$s %4$s";
    }
    @Override
    protected String stageAlreadyComplete$str() {
        return "WFLYCTL0188: L'étape %1$s déjà complétée";
    }
    @Override
    protected String ignoreYamlSubElement$str() {
        return "Ignorant ainsi l'élément '%1$s '.";
    }
    @Override
    protected String illegalPermissionActions$str() {
        return "WFLYCTL0382: Actions de permission illégale '%1$s'";
    }
    @Override
    protected String proxiedOperationTimedOut$str() {
        return "WFLYCTL0409: Le délai d'exécution de l'opération '%1$s' sur le processus distant à l'adresse '%2$s' a expiré après %3$d ms en attendant la réponse initiale ; le processus distant a été informé de terminer l'opération";
    }
    @Override
    protected String unableToResolveExpressions$str() {
        return "WFLYCTL0374: Impossible de résoudre des expressions à cet emplacement.";
    }
    @Override
    protected String couldNotDeleteFile$str() {
        return "WFLYCTL0276: N'a pas pu supprimer le fichier %1$s";
    }
    @Override
    protected String validationFailedInvalidElementType$str() {
        return "WFLYCTL0238: %1$s devrait être une liste de %2$s. %3$s";
    }
    @Override
    protected String noResourceRegistered1$str() {
        return "WFLYCTL0488: Aucun enregistrement trouvé pour l'adresse %1$s - Ignorer le sous-arbre";
    }
    @Override
    protected String noOperationHandler2$str() {
        return "WFLYCTL0290: Aucun gestionnaire d'opération appelé '%1$s' enregistré à '%2$s'";
    }
    @Override
    protected String responseHandlerNotFound$str() {
        return "WFLYCTL0353: Pas de contrôleur de réponse pour la requête %1$s";
    }
    @Override
    protected String handlerIsReferencedBy$str() {
        return "WFLYCTL0319: Le handler est référencé par %1$s et ne peut pas être supprimé";
    }
    @Override
    protected String serviceStatusReportMissing$str() {
        return "Dépendances %1$s (manquantes) : %2$s %n";
    }
    @Override
    protected String cannotRemoveRequiredCapability$str() {
        return "WFLYCTL0367: Impossible de supprimer la fonction '%1$s' car elle est requise par d'autres fonctions :";
    }
    @Override
    protected String cliScriptPropertyDefinedWithoutMarkerDirectoryWhenNotSkippingReload$str() {
        return "WFLYCTL0464: Si vous utilisez %1$s=true, lorsque vous utilisez -D%2$s, vous devez définir -D%3$s";
    }
    @Override
    protected String immutableResource$str() {
        return "WFLYCTL0096: La ressource ne peut être mutée";
    }
    @Override
    protected String unsupportedIdentityParameter$str() {
        return "WFLYCTL0338: Paramètre '%1$X' d’identité non supporté a reçu le type de principal d'analyse de type '%2$X'.";
    }
    @Override
    protected String serverResultsAccessNotAllowed$str() {
        return "WFLYCTL0250: Un gestionnaire d'opérations a tenté d'accéder l'objet résultats du serveur - réponse opération - sur un type de process autre que '%1$s'. Le type de processus actuel est '%2$s'";
    }
    @Override
    protected String namespaceNotFound$str() {
        return "WFLYCTL0139: Aucun nom d'espace ayant URI %1$s n'a été trouvé";
    }
    @Override
    protected String noOperationHandler0$str() {
        return "WFLYCTL0150: Aucun gestionnaire d'opération";
    }
    @Override
    protected String transformerLoggerSubsystemModelOperationTransformerAttributes$str() {
        return "WFLYCTL0297: Transformation de l'opération %1$s de la ressource %2$s en sous-système '%3$s' la version du modèle '%4$s' -- %5$s %6$s";
    }
    @Override
    protected String cannotRename$str() {
        return "WFLYCTL0056: N'a pas pu renommer %1$s en %2$s";
    }
    @Override
    protected String operationRollingBack$str() {
        return "WFLYCTL0160: Annulation de l'opération";
    }
    @Override
    protected String rejectedResourceResourceTransformation$str() {
        return "WFLYCTL0303: La ressource %1$s est rejetée sur l'hôte cible, et devra être ignorée sur l'hôte";
    }
    @Override
    protected String mainFileNotFound$str() {
        return "WFLYCTL0214: Impossible de charger le fichier de configuration : %1$s. L'argument fichier de configuration doit spécifier le chemin d'accès à un fichier situé dans le répertoire de configuration. Le chemin doit être un chemin relatif, et doit être relatif au répertoire de configuration %2$s.";
    }
    @Override
    protected String invalidDescriptionRequiredFlagIsNotABoolean$str() {
        return "WFLYCTL0239: Paramètre 'requis' : '%1$s' doit correspondre à un nombre booléen dans la description de l'opération à %2$s: %3$s";
    }
    @Override
    protected String cannotDeleteFileOrDirectory$str() {
        return "WFLYCTL0440: Impossible de supprimer le fichier ou le répertoire %1$s";
    }
    @Override
    protected String fullServerBootRequired$str() {
        return "WFLYCTL0092: %1$s ne peut pas être utilisé sauf pour un amorçage de serveur complet";
    }
    @Override
    protected String interruptedWaitingStability$str() {
        return "WFLYCTL0027: L'opération a été interrompue avant que le conteneur de service se stabilise en fin d'opération. Le processus doit être démarré à nouveau. L'étape qui a mis le conteneur de service à jour au départ était '%1$s' à l'adresse suivante '%2$s'";
    }
    @Override
    protected String discoveryOptionsMustBeDeclared$str() {
        return "WFLYCTL0305: A moins que le contrôleur d'hôte ne soit démarré par ligne de commande, l'option %1$s et l'attribut %2$s ne seront pas définis à %3$s; %4$s doit être déclaré ou les %5$s et %6$s doivent être fournis.";
    }
    @Override
    protected String resourceNotFound$str() {
        return "WFLYCTL0175: La ressource %1$s n'existe pas; une ressource à l'adresse %2$s ne peut pas être créée tant que toutes les ressources ancestor n'ont pas été ajoutées";
    }
    @Override
    protected String noAttributeSetForAddress$str() {
        return "WFLYCTL0490: Une ressource YAML a été définie pour l'adresse%1$s sans aucun attribut. Aucune action ne sera entreprise.";
    }
    @Override
    protected String unexpectedElement1$str() {
        return "WFLYCTL0198: Élément '%1$s' non attendu rencontré";
    }
    @Override
    protected String couldNotBackUp$str() {
        return "WFLYCTL0321: Impossible de sauvegarder '%1$s' dans '%2$s'";
    }
    @Override
    protected String reloadingServerToNormalModeAfterAdditionalBootCliScript$str() {
        return "WFLYCTL0470: Rechargement du serveur en mode normal après l'exécution des commandes supplémentaires du script CLI. Cela effacera les propriétés déclenchant la fonctionnalité supplémentaire du script CLI de démarrage si elles sont définies (%1$s,%2$s, %3$s), et supprimera le fichier marqueur indiquant que le serveur a été redémarré";
    }
    @Override
    protected String failedToMarshalConfiguration$str() {
        return "WFLYCTL0084: N'a pas pu marshaler la configuration";
    }
    @Override
    protected String attributeNames$str() {
        return "attributs %1$s";
    }
    @Override
    protected String multipleMatchingAddresses5$str() {
        return "WFLYCTL0022: De multiples adresses ou des interfaces réseau correspondent aux critères de sélection pour l'interface '%1$s'. Adresses correspondant: %2$s. Interfaces réseau correspondant : %3$s. L'interface utilisera l'adresse %4$s et l'interface de réseau %5$s.";
    }
    @Override
    protected String cannotRemoveReadOnlyPath$str() {
        return "WFLYCTL0262: Le chemin '%1$s' est en lecture-seule; il ne peut pas être supprimé";
    }
    @Override
    protected String failedToEmitNotification$str() {
        return "WFLYCTL0356: N'a pas pu créer de notification %1$s";
    }
    @Override
    protected String subsystemBootOperationFailedExecuting$str() {
        return "WFLYCTL0193: N'a pas pu exécuter les opérations de démarrage %1$s du sous-système";
    }
    @Override
    protected String wildcardOperationFailedAtSingleAddress$str() {
        return "WFLYCTL0285: L'opération %1$s invoquée contre des adresses cibles multiples a échoué à l'adresse %2$s avec comme description d'échec %3$s";
    }
    @Override
    protected String duplicateElement$str() {
        return "WFLYCTL0071: L'élément de chemin en double '%1$s' trouvé";
    }
    @Override
    protected String operationDeprecated$str() {
        return "WFLYCTL0395: L'opération %1$s sur la ressource à l'adresse %2$s est obsolète et pourrait être supprimée dans la prochaine version. Pour en savoir plus sur la dépréciation, consultez la sortie de l'opération read-operation-description.";
    }
    @Override
    protected String gracefulManagementChannelHandlerShutdownTimedOut$str() {
        return "WFLYCTL0019: L'arrêt contrôlé du handler utilisé pour les requêtes de gestion natives n'a pas pu s'achever en [%1$d] ms, mais la fermeture du canal de communication sous-jacent se poursuit";
    }
    @Override
    protected String attemptToBothRemoveAndAddHandlerReferenceFromCompositeOperation$str() {
        return "WFLYCTL0325: Il y a eu une tentative de supprimer et d'ajouter à la fois une référence de handler d'une opération composite";
    }
    @Override
    protected String illegalValueForInterfaceCriteria$str() {
        return "WFLYCTL0095: Valeur illégale %1$s pour le critère d'interface %2$s, devrait être %3$s";
    }
    @Override
    protected String duplicateDeclaration2$str() {
        return "WFLYCTL0070: Déclaration %1$s en double %2$s";
    }
    @Override
    protected String invalidBlockingTimeout$str() {
        return "WFLYCTL0342: Valeur %1$d illégale pour l'en-tête de l'opération %2$s; la valeur doit être supérieure à zéro";
    }
    @Override
    protected String transformerLoggerSubsystemModelResourceTransformerAttributes$str() {
        return "WFLYCTL0296: Transformation de la ressource %1$s vers sous-système '%2$s' version modèle '%3$s' -- %4$s %5$s";
    }
    @Override
    protected String cannotDetermineDefaultName$str() {
        return "WFLYCTL0050: Impossible de déterminer un nom par défaut basé sur le nom d'hôte local";
    }
    @Override
    protected String unsupportedElement$str() {
        return "WFLYCTL0371: L'élément '%1$s' n'est plus pris en charge, veuillez utiliser '%2$s' à la place";
    }
    @Override
    protected String cannotRegisterSubmodelWithNullPath$str() {
        return "WFLYCTL0053: N'a pas pu enregistrer les sous-modèles avec un PathElement null";
    }
    @Override
    protected String invalidOutboundSocketBinding$str() {
        return "WFLYCTL0120: Une liaison de socket sortante : %1$s ne peut pas comprendre %2$s et %3$s à la fois";
    }
    @Override
    protected String failedToParseConfiguration$str() {
        return "WFLYCTL0085: N'a pas pu analyser la configuration";
    }
    @Override
    protected String servicesWithTransitiveUnavailability$str() {
        return "WFLYCTL0448: %1$s services supplémentaires sont en baisse en raison de l'absence ou de l'échec de leurs dépendances";
    }
    @Override
    protected String failedToPublishConfigurationInvalidRemote$str() {
        return "WFLYCTL0503: Échec de la publication de la configuration, car le nom distant %1$s n'est pas valide.";
    }
    @Override
    protected String moduleLoadingInterrupted$str() {
        return "WFLYCTL0135: Interrompu alors qu'il était en attente d'un chargement de module %1$s";
    }
    @Override
    protected String badUriSyntax$str() {
        return "WFLYCTL0341: Un uri de mauvaise syntaxe '%1$s' a été passé pour validation.";
    }
    @Override
    protected String reconnectToSyslogFailed$str() {
        return "WFLYCTL0355: La reconnexion au syslog handler '%1$s a échoué";
    }
    @Override
    protected String invalidChannelCloseTimeout$str() {
        return "WFLYCTL0021: Valeur ’%1$s’ non valide pour la propriété de système '%2$s' -- doit pouvoir être convertie en entier (int)";
    }
    @Override
    protected String failedToDeleteConfigurationSnapshot$str() {
        return "WFLYCTL0453: Échec de la suppression de l'instantané de configuration %1$s";
    }
    @Override
    protected String failedInitializingModule$str() {
        return "WFLYCTL0079: Échec lors de l'initialisation du module %1$s";
    }
    @Override
    protected String rejectEmptyConfig$str() {
        return "WFLYCTL0389: Impossible de créer une configuration vide sur le fichier %1$s à cause de la présence d'une configuration non vide";
    }
    @Override
    protected String unsupportedUsageOfExpression$str() {
        return "; Cette capacité non résolue est probablement due à l'utilisation d'une chaîne d'expression dans un attribut de configuration qui ne prend pas en charge les expressions.";
    }
    @Override
    protected String unexpectedValueForResource$str() {
        return "WFLYCTL0491: Nous avons une valeur inattendue %1$s pour l'adresse %2$s et le nom %3$s";
    }
    @Override
    protected String noContextToDelegateTo$str() {
        return "WFLYCTL0312: aucun contexte à déléguer avec id: %1$s";
    }
    @Override
    protected String couldNotResolveExpressionList$str() {
        return "WFLYCTL0392: Impossible de résoudre l'expression de l'attribut : '%1$s', le type n'est pas une liste";
    }
    @Override
    protected String invalid1$str() {
        return "WFLYCTL0099: %1$s est invalide";
    }
    @Override
    protected String operationCancelled$str() {
        return "WFLYCTL0271: Opération annulée";
    }
    @Override
    protected String invalidDefaultBlockingTimeout$str() {
        return "WFLYCTL0346: Valeur %1$s non valide pour la propriété %2$s;doit correspondre à une valeur numérique supérieure à zéro. La valeur par défaut suivante %3$d sera utilisée.";
    }
    @Override
    protected String cannotRemove$str() {
        return "WFLYCTL0055: Impossible de supprimer %1$s";
    }
    @Override
    protected String failedServices$str() {
        return "WFLYCTL0080: Les services ont échoué";
    }
    @Override
    protected String invalidMaxValue$str() {
        return "WFLYCTL0116: %1$d n'est pas à la bonne taille pour le paramètre %2$s. Il vous faut une valeur maximum de %3$d";
    }
    @Override
    protected String transformationWarnings$str() {
        return "WFLYCTL0032: Il y a eu des problèmes pendant le processus de transformation de l'hôte cible : '%1$s' %nProblems found: %n%2$s";
    }
    @Override
    protected String invalid2$str() {
        return "WFLYCTL0100: %1$d n'est pas un %2$s valide";
    }
    @Override
    protected String unknownCriteriaInterfaceProperty$str() {
        return "WFLYCTL0203: Propriété inconnue dans la liste de critères d'interface : %1$s";
    }
    @Override
    protected String managementUnavailableDuringBoot$str() {
        return "WFLYCTL0379: L'amorçage du système est en cours; l'exécution des opérations de gestion à distance n'est pas actuellement disponible";
    }
    @Override
    protected String resolvedFileDoesNotExistOrIsDirectory$str() {
        return "WFLYCTL0320: Le fichier résolu %1$s n'existe pas ou est un répertoire";
    }
    @Override
    protected String operationHandlerFailed$str() {
        return "WFLYCTL0158: Le gestionnaire d'opérations a échoué : %1$s";
    }
    @Override
    protected String illegalUnresolvedModel$str() {
        return "WFLYCTL0298: Le noeud contient une expression non résolue %1$s -- un modèle résolu est requis";
    }
    @Override
    protected String possibleCapabilityProviderPoints$str() {
        return "; points d'enregistrements possibles pour cette fonctionnalité : %1$s";
    }
    @Override
    protected String subsystemBootOperationFailed$str() {
        return "WFLYCTL0192: Les opérations d'amorçage du sous-système %1$s ont échoué sans aucune explication";
    }
    @Override
    protected String validationFailedRequiredParameterNotPresent$str() {
        return "WFLYCTL0231: Le paramètre requis %1$s n'est pas présent. %2$s";
    }
    @Override
    protected String multipleMatchingAddresses3$str() {
        return "WFLYCTL0023: La valeur '%1$s' pour les critères de sélection d'interface 'inet-address' est ambigüe, car plus d'une adresse ou réseau d'interface disponible sur la machine y correspond. En raison de cette ambiguïté, aucune adresse n'est choisie pour la correspondance. Adresse de correspondance: %2$s. Interfaces de réseau correspondantes : %3$s.";
    }
    @Override
    protected String modelUpdateNotAuthorized$str() {
        return "WFLYCTL0249: L'opération '%1$s' qui cible la ressource '%2$s' a été invoquée directement par un utilisateur. Les opérations utilisateur ne sont pas autorisées pour mettre à jour directement la configuration persistante d'un serveur dans un domaine géré.";
    }
    @Override
    protected String cannotRemovePathWithDependencies$str() {
        return "WFLYCTL0267: Le chemin '%1$s' ne peut pas être supprimé car les chemins suivants en dépendent : %2$s";
    }
    @Override
    protected String propertyCanOnlyBeUsedWithStandaloneOrEmbeddedServer$str() {
        return "WFLYCTL0460: La propriété système '%1$s' ne peut être utilisée qu'avec un serveur autonome ou intégré";
    }
    @Override
    protected String serviceStatusReportHeader$str() {
        return "WFLYCTL0183: Rapport de statut de service%n";
    }
    @Override
    protected String completedRunningBootCliScript$str() {
        return "WFLYCTL0468: Fin de l'exécution des commandes à partir du script CLI";
    }
    @Override
    protected String roleIsAlreadyRegistered$str() {
        return "WFLYCTL0330: Le rôle '%1$s' est déjà enregistré";
    }
    @Override
    protected String expressionUnresolvableUsingSimpleResolution$str() {
        return "WFLYCTL0480: Expression '%1$s’ ne peut pas être résolu à l'aide des sources de résolution non sensibles à la sécurité prises en charge par le ’%2$s' opération. La réponse signalera la valeur non résolue.";
    }
    @Override
    protected String unexpectedEndElement$str() {
        return "WFLYCTL0199: Bout d'élément '%1$s' inattendu rencontré";
    }
    @Override
    protected String removingExtensionWithRegisteredSubsystem$str() {
        return "WFLYCTL0219: Tentative d'enregistrement de l'extension %1$s qui comporte encore un sous-système %2$s enregistré";
    }
    @Override
    protected String unexpectedElement2$str() {
        return "WFLYCTL0377: Élément '%1$s' inattendu rencontré. Les éléments valides sont : '%2$s'";
    }
    @Override
    protected String threadDumpException$str() {
        return "WFLYCTL0498: Exception levée lors de la génération du thread dump";
    }
    @Override
    protected String inconsistentCapabilityContexts5$str() {
        return "WFLYCTL0400: La fonction '%1$s' dans le contexte '%2$s' associée à la ressource '%3$s' nécessite la fonction '%4$s'. Elle est disponible dans un ou plusieurs groupes de liaison de socket mais toutes les fonctions de liaison de socket requises par '%5$s' ne peuvent pas être résolues à partir d'un seul groupe de liaison de socket. Cette configuration n'est donc pas valide";
    }
    @Override
    protected String multipleModelNodes$str() {
        return "WFLYCTL0137: Le modèle contient des nœuds %1$s multiples";
    }
    @Override
    protected String failedToWriteConfiguration$str() {
        return "WFLYCTL0089: N'a pas pu écrire la configuration";
    }
    @Override
    protected String invalidMinBytesLength$str() {
        return "WFLYCTL0420: '%1$s' correspond à une valeur non valide pour les paramètre %2$s. Les valeurs doivent avoir une longueur minimum de %3$d octets";
    }
    @Override
    protected String operation$str() {
        return "Opération %1$s";
    }
    @Override
    protected String directoryNotFound$str() {
        return "WFLYCTL0066: Aucun répertoire %1$s n'a été trouvé";
    }
    @Override
    protected String failedToPersistConfiguration$str() {
        return "WFLYCTL0452: Échec de la persistance de la configuration à %1$s à cause de %2$s";
    }
    @Override
    protected String unknownCapability$str() {
        return "WFLYCTL0364: La fonction '%1$s' est inconnue.";
    }
    @Override
    protected String couldntConvertWarningLevel$str() {
        return "WFLYCTL0438: N'a pas pu convertir '%1$s' en niveau d'avertissement correct, revient par défaut à la valeur « ALL ». Les valeurs possibles sont : SEVERE,WARNING,INFO,CONFIG,FINE,FINER,FINEST,ALL,OFF";
    }
    @Override
    protected String invalidPathElementKey$str() {
        return "WFLYCTL0110: Élément d'adresse de ressource non valide '%1$s'. La clé '%2$s' n'est pas valide pour un élément qui se trouve dans une adresse de ressource.";
    }
    @Override
    protected String noHandlerCalled$str() {
        return "WFLYCTL0317: Il n'y a pas de handler nommé '%1$s'";
    }
    @Override
    protected String failedToPersistConfigurationChange0$str() {
        return "WFLYCTL0008: N'a pas pu faire persister le changement de configuration";
    }
    @Override
    protected String unknownCriteriaInterfaceType$str() {
        return "WFLYCTL0204: Type de critères d'interface inconnu %1$s";
    }
    @Override
    protected String invalidType$str() {
        return "WFLYCTL0127: Type non valide %1$s";
    }
    @Override
    protected String alreadyRegistered$str() {
        return "WFLYCTL0043: Un %1$s nommé '%2$s' a déjà été enregistré à l’emplacement '%3$s'";
    }
    @Override
    protected String nestedElementNotAllowed$str() {
        return "WFLYCTL0140: %1$s imbriqué non autorisé";
    }
    @Override
    protected String duplicateResourceAddress$str() {
        return "WFLYCTL0212: Ressource %1$s en double";
    }
    @Override
    protected String cannotHaveBothParameters$str() {
        return "WFLYCTL0275: Impossible de spécifier à la fois '%1$s' et '%2$s'";
    }
    @Override
    protected String configurationFileNotFound$str() {
        return "WFLYCTL0065: Aucun fichier de configuration se terminant par %1$s n'a été trouvé dans %2$s";
    }
    @Override
    protected String cantHaveSameCriteriaForBothNotAndInclusion$str() {
        return "WFLYCTL0253: Ne peut pas avoir à la fois les mêmes critères avec ou sans inclusion %1$s";
    }
    @Override
    protected String invalidModuleNameParameter$str() {
        return "WFLYCTL0516: Paramètre%1$s spécifie un nom de module non valide : %2$s";
    }
    @Override
    protected String noOperationEntry$str() {
        return "WFLYCTL0289: Aucune entrée d'opération appelée '%1$s' enregistrée à '%2$s'";
    }
    @Override
    protected String moduleInitializationInterrupted$str() {
        return "WFLYCTL0136: Interrompu alors qu'il était en attente d'initialisation de module %1$s";
    }
    @Override
    protected String notificationIsNotDescribed$str() {
        return "WFLYCTL0357: Notification de type %1$s non décrite pour la ressource qui se trouve à l'adresse %2$s";
    }
    @Override
    protected String ignoreYamlElement$str() {
        return "WFLYCTL0508: L'élément yaml '%1$s' et ses sous-éléments sont ignorés.";
    }
    @Override
    protected String unsupportedNamespace$str() {
        return "WFLYCTL0513: L'espace de noms XML de%1$s n'est plus pris en charge.";
    }
    @Override
    protected String validationFailedValueIsGreaterThanMax$str() {
        return "WFLYCTL0235: La valeur '%1$s' qui a été passée à '%2$s' est supérieure à la valeur maximum '%3$s'. %4$s";
    }
    @Override
    protected String operationSucceeded$str() {
        return "WFLYCTL0161: Opération réussie, validation";
    }
    @Override
    protected String disablingLogHandlerDueToFailures$str() {
        return "WFLYCTL0038: [%1$d] échecs consécutifs d'enregistrements de l'audit des opérations de gestion '%2$s'; le handler de la journalisation de l'audit a été désactivé";
    }
    @Override
    protected String duplicateDeclaration1$str() {
        return "WFLYCTL0069: Déclaration %1$s en double";
    }
    @Override
    protected String invalidMinLength$str() {
        return "WFLYCTL0113: '%1$s' correspond à une valeur non valide pour les paramètre %2$s. Les valeurs doivent avoir une longueur minimum de %3$d caractères";
    }
    @Override
    protected String failedToStoreConfiguration$str() {
        return "WFLYCTL0009: N'a pas pu stocker la configuration à %1$s";
    }
    @Override
    protected String resolverExtensionExpressionsNotAllowed$str() {
        return "WFLYCTL0494: La résolution de l'expression d'extension '%1$s' n'est pas autorisée à ce stade.";
    }
    @Override
    protected String permissionDenied$str() {
        return "WFLYCTL0332: Permission non accordée";
    }
    @Override
    protected String invalidStepStage$str() {
        return "WFLYCTL0124: Stage intermédiaire d'étape non valide spécifiée";
    }
    @Override
    protected String rejectAttributesCoreModelResourceTransformer$str() {
        return "WFLYCTL0299: Transformation de la ressource %1$s du contrôleur hôte '%2$s' vers le modèle de version principal '%3$s' -- il y avait des problèmes avec certains des attributs et cette ressource devra être ignorée sur cet hôte. Détails du problème : %4$s";
    }
    @Override
    protected String unknownInterface$str() {
        return "WFLYCTL0205: L'interface inconnue %1$s %2$s doit être déclarée dans l'élément %3$s";
    }
    @Override
    protected String couldNotLoadModuleForTransformers$str() {
        return "WFLYCTL0422: Impossible de charger le module '%1$s' pour les transformateurs";
    }
    @Override
    protected String missingTransitiveDependents$str() {
        return "Services qui n'ont pas pu démarrer :";
    }
    @Override
    protected String schemaAlreadyRegistered$str() {
        return "WFLYCTL0177: Le schéma ayant pour URI %1$s a déjà été enregistré dans la location %2$s";
    }
    @Override
    protected String validationFailedActualParameterNotDescribed$str() {
        return "WFLYCTL0230: L'opération contient un paramètre '%1$s' qui n'est pas un des paramètres attendus %2$s. %3$s";
    }
    @Override
    protected String discardedResourceTransformation$str() {
        return "WFLYCTL0396: La ressource %1$s est ignorée sur l'hôte cible %2$s";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYCTL0133: Attribut(s) manquants requis : %1$s";
    }
    @Override
    protected String canonicalMainFileNotFound$str() {
        return "WFLYCTL0060: N'a pas pu obtenir de fichier canonique pour le fichier de main : %1$s";
    }
    @Override
    protected String uuidIsEmpty$str() {
        return "WFLYCTL0500: Il n'y a pas de chaîne UUID à '%1$s'. Une nouvelle valeur sera générée.";
    }
    @Override
    protected String expressionNotAllowed$str() {
        return "WFLYCTL0264: %1$s ne correspond sans doute pas à ModelType.EXPRESSION";
    }
    @Override
    protected String missingTransitiveDependencies$str() {
        return "Services qui pourraient être à l'origine de la cause :";
    }
    @Override
    protected String cannotDelete$str() {
        return "WFLYCTL0052: N'a pas pu supprimer %1$s";
    }
    @Override
    protected String resourceWasRemoved$str() {
        return "WFLYCTL0359: La ressource a été retirée de l'adresse %1$s.";
    }
    @Override
    protected String serviceStatusReportAvailable$str() {
        return "%1$s (nouvellement disponible) %n";
    }
    @Override
    protected String removeUnsupportedLegacyExtension$str() {
        return "WFLYCTL0402: Les sous-systèmes %1$s fournis par l'extension héritée '%2$s' ne sont pas pris en charge sur les serveurs exécutant cette version. Le sous-système et l'extension doivent tous les deux être supprimés ou migrés pour que le serveur puisse fonctionner.";
    }
    @Override
    protected String failedSendingFailedResponse$str() {
        return "WFLYCTL0408: Échec de l'envoi des réponses échouées %1$s pour %2$d";
    }
    @Override
    protected String removingServiceUnsatisfiedDependencies0$str() {
        return "WFLYCTL0171: Le retrait des services a apporté des dépendances non satisfaisantes :";
    }
    @Override
    protected String operationNotRegistered$str() {
        return "WFLYCTL0162: Il n'y a pas d'opération %1$s enregistrée à l'adresse %2$s";
    }
    @Override
    protected String unstableSubsystemNamespace$str() {
        return "WFLYCTL0505: %1$s espace de noms du sous-système %2$s n'est pas activé par le niveau de stabilité actuel";
    }
    @Override
    protected String failedToRecoverServices$str() {
        return "WFLYCTL0225: N'a pas pu recouvrir les services pendant les opérations de rollback";
    }
    @Override
    protected String requirementPointFull$str() {
        return "la fonctionnalité '%1$s' en a besoin pour l'attribut '%2$s' à l'adresse '%3$s'";
    }
    @Override
    protected String childResourceNotFound$str() {
        return "WFLYCTL0217: La ressource enfant '%1$s' n'a pas été trouvée";
    }
    @Override
    protected String invalidParameterName$str() {
        return "WFLYCTL0477: Le nom du paramètre '%1$s' est non valide.";
    }
    @Override
    protected String unexpectedOperationExecutionException$str() {
        return "WFLYCTL0403: Échec inattendu lors de l'exécution des opérations suivantes : %1$s";
    }
    @Override
    protected String errorBootingContainer0$str() {
        return "WFLYCTL0002: Erreur de démarrage du conteneur";
    }
    @Override
    protected String childAlreadyDeclared$str() {
        return "WFLYCTL0058: Le dépendant %1$s de l'élément %2$s a déjà été déclaré";
    }
    @Override
    protected String validationFailedNoOperationFound$str() {
        return "WFLYCTL0229: Aucune opération n'a appelé '%1$s' à '%2$s'. %3$s";
    }
    @Override
    protected String interruptedAwaitingFinalResponse$str() {
        return "WFLYCTL0351: Exécution de l'opération '%1$s' sur le processus distant à l'adresse '%2$s' interrompu lors de l'attente de la réponse finale ; le processus distant a reçu une notification d'annuler l'opération";
    }
    @Override
    protected String attributeValueWritten$str() {
        return "WFLYCTL0360: La valeur de l'attribut %1$s est passée de %2$s à %3$s.";
    }
    @Override
    protected String restartingServerAfterBootCliScript$str() {
        return "WFLYCTL0469: Redémarrage du serveur puisque les commandes supplémentaires du script CLI nécessitent un redémarrage. Cela permettra d'enregistrer que le redémarrage a été initié dans le fichier de marquage %1$s puisque le mécanisme de redémarrage préservera toutes les propriétés relatives à la fonctionnalité supplémentaire du script CLI de démarrage (%2$s,%3$s, %4$s). Le redémarrage maintient le mode d'exécution en mode administrateur seulement, de sorte qu'un rechargement ultérieur se produira";
    }
    @Override
    protected String invalidMulticastAddress$str() {
        return "WFLYCTL0119: La valeur %1$s de l'attribut %2$s ne correspond pas à une adresse multicast valide";
    }
    @Override
    protected String cantHaveBothLoopbackAndInetAddressCriteria$str() {
        return "WFLYCTL0251: Ne peut pas avoir à la fois les critères loopback (bouclage) et inet-address à la fois";
    }
    @Override
    protected String invalidAttributeValue2$str() {
        return "WFLYCTL0106: Valeur '%1$s' non valide pour l'attribut '%2$s'";
    }
    @Override
    protected String operationAlreadyComplete$str() {
        return "WFLYCTL0157: Opération déjà terminée";
    }
    @Override
    protected String foundRestartMarkerFile$str() {
        return "WFLYCTL0473: Fichier marqueur indiquant que le serveur a été redémarré suite à l'exécution des commandes supplémentaires du script CLI se trouvant à l'adresse suivante %1$s";
    }
    @Override
    protected String unsupportedIdentityType$str() {
        return "WFLYCTL0337: Type '%1$X' Identité Non supporté reçu.";
    }
    @Override
    protected String alreadyDeclared5$str() {
        return "WFLYCTL0042: Un %1$s ou un %2$s %3$s déjà déclaré a déjà été déclaré dans %4$s %5$s";
    }
    @Override
    protected String nullAsynchronousExecutor$str() {
        return "WFLYCTL0154: Impossible d'exécuter une opération asynchrone sans un exécuteur";
    }
    @Override
    protected String compositeOperationRolledBack$str() {
        return "WFLYCTL0063: L'opération composite a été annulée";
    }
    @Override
    protected String couldNotMarshalAttributeAsAttribute$str() {
        return "WFLYCTL0284: N'a pas pu marshaler l'attribut comme attribut : %1$s";
    }
    @Override
    protected String deprecatedAndCurrentParameterMismatch$str() {
        return "WFLYCTL0413: L'ancien paramètre %1$s est défini en plus du paramètre %2$s en cours, mais avec des valeurs différentes";
    }
    @Override
    protected String validationFailedRequiredParameterPresentAsWellAsAlternative$str() {
        return "WFLYCTL0232: Un paramètre différent '%1$s' a été utilisé à la place du paramètre demandé '%2$s'. Veuillez utiliser l'un ou l'autre. %3$s";
    }
    @Override
    protected String requirementPointSimple$str() {
        return "la fonctionnalité '%1$s' en a besoin pour l'adresse '%2$s'";
    }
    @Override
    protected String attemptToBothUpdateAndRemoveHandlerFromCompositeOperation$str() {
        return "WFLYCTL0324: Il y a eu une tentative de mettre à jour et de supprimer à la fois un handler d'une opération composite";
    }
    @Override
    protected String extensionModuleNotFound$str() {
        return "WFLYCTL0310: Module d'extension %1$s non trouvé";
    }
    @Override
    protected String disablingLoggingDueToFailures$str() {
        return "WFLYCTL0036: [%1$d] échecs consécutifs d'enregistrements de l'audit des opérations de gestion; la journalisation de l'audit a été désactivée";
    }
    @Override
    protected String noPermissionToResolveExpression$str() {
        return "WFLYCTL0210: SecurityException interceptée en cours de tentative de résolution de l'expression '%1$s' -- %2$s";
    }
    @Override
    protected String streamWasKilled$str() {
        return "WFLYCTL0273: Flux anéanti";
    }
    @Override
    protected String unstableManagementNamespace$str() {
        return "WFLYCTL0514: Espace de noms de gestion%1$s n'est pas activé par le niveau de stabilité actuel";
    }
    @Override
    protected String duplicateResourceType$str() {
        return "WFLYCTL0076: Type de ressource %1$s dupliquée";
    }
    @Override
    protected String propertyCanOnlyBeUsedWithAdminOnlyModeServer$str() {
        return "WFLYCTL0461: La propriété système '%1$s' ne peut être utilisée qu'avec un serveur réservé aux administrateurs";
    }
    @Override
    protected String executingBootCliScript$str() {
        return "WFLYCTL0467: Exécution des commandes supplémentaires du script CLI %1$s sur le serveur qui fonctionne en mode administrateur uniquement";
    }
    @Override
    protected String absolutePathMainFileNotFound$str() {
        return "WFLYCTL0215: Impossible de charger le fichier de configuration : %1$s. L'argument du fichier de configuration doit spécifier l'un des éléments suivants : 1) un chemin absolu vers un fichier existant ; 2) un chemin relatif vers un fichier existant, par rapport au répertoire de travail actuel ; ou 3) un chemin relatif vers un fichier situé dans le répertoire de configuration. Dans ce dernier cas, il doit s'agir d'un chemin relatif au répertoire de configuration %2$s.";
    }
    @Override
    protected String invalidDescriptionMinMaxLengthForParameterHasWrongType$str() {
        return "WFLYCTL0244: L'attribut '%1$s' du paramètre '%2$s' ne peut pas être converti en un entier relatif dans la description de l'opération dans %3$s: %4$s";
    }
    @Override
    protected String duplicateResource$str() {
        return "WFLYCTL0075: Ressource %1$s en double";
    }
    @Override
    protected String serviceInstallTimedOut$str() {
        return "WFLYCTL0345: Expiration après %1$d secondes en attendant que le service %2$s existant soit supprimé pour laisser place à l'installation d'une nouvelle instance.";
    }
    @Override
    protected String invalidSubnetFormat$str() {
        return "WFLYCTL0439: La valeur %1$s de l'attribut %2$s ne correspond pas à un format de sous-réseau valide";
    }
    @Override
    protected String failedToLoadModule1$str() {
        return "WFLYCTL0083: N'a pas pu charger le module %1$s";
    }
    @Override
    protected String bootComplete$str() {
        return "WFLYCTL0434: Boot terminé";
    }
    @Override
    protected String required$str() {
        return "WFLYCTL0172: %1$s requis";
    }
    @Override
    protected String validationFailedOperationHasANullOrEmptyName$str() {
        return "WFLYCTL0228: L'opération a un nom nul ou vide. %1$s";
    }
    @Override
    protected String unknownChildType$str() {
        return "WFLYCTL0202: Aucun type d'enfant connu nommé %1$s";
    }
    @Override
    protected String checkingForPresenceOfRestartMarkerFile$str() {
        return "WFLYCTL0472: Vérification de la présence d'un fichier marqueur indiquant que le serveur a été redémarré après l'exécution des commandes supplémentaires du script CLI";
    }
    @Override
    protected String runtimeModificationBegun$str() {
        return "WFLYCTL0415: La modification du conteneur de service de runtime par une opération de gestion a commencé";
    }
    @Override
    protected String attributeIsWrongType$str() {
        return "WFLYCTL0378: L'attribut '%1$s' n'est pas de type '%2$s' mais de type '%3$s'";
    }
    @Override
    protected String errorRevertingOperation$str() {
        return "WFLYCTL0004: Exception interceptée par %1$s lors d'une tentative de rétablissement de l'opération %2$s à l'adresse %3$s";
    }
    @Override
    protected String noResourceRegistered2$str() {
        return "WFLYCTL0492: Impossible de trouver un enregistrement de ressource pour l'adresse %1$s avec l'enregistrement actuel %2$s";
    }
    @Override
    protected String attributeExpressionDeprecated$str() {
        return "WFLYCTL0447: L’attribut '%1$s' dans la ressource à l'adresse '%2$s' a été configuré avec une expression, mais la prise en charge de l'utilisation d'expressions dans valeur de cet attribut peut être supprimée dans une version ultérieure. Cet attribut configure si une capacité qui peut être requise par d'autres parties de la configuration est présente ou configure elle-même une exigence pour une fonctionnalité fournie par une autre partie de la configuration. La prise en charge complète pour ce type de configuration ne peut être fournie quand une expression est utilisée.";
    }
    @Override
    protected String illegalOperationForAttribute$str() {
        return "WFLYCTL0510: Aucune opération%1$s peut être exécuté pour l'attribut appelé '%2$s' est défini à l'adresse '%3$s '.";
    }
    @Override
    protected String formattedCapabilityName$str() {
        return "%1$s";
    }
    @Override
    protected String aliasStepHandlerOperationNotFound$str() {
        return "WFLYCTL0280: Aucune opération '%1$s' trouvée pour l'adresse alias '%2$s' qui mappe dans '%3$s'";
    }
    @Override
    protected String serviceRegistryRuntimeOperationsOnly$str() {
        return "WFLYCTL0181: Obtenez un registre de service uniquement pris en charge pour les opérations en cours d'exécution";
    }
    @Override
    protected String invalidAddress$str() {
        return "WFLYCTL0101: Adresse non valide %1$s (%2$s)";
    }
    @Override
    protected String couldNotMarshalAttributeAsElement$str() {
        return "WFLYCTL0283: N'a pas pu marshaler l'attribut comme élément : %1$s";
    }
    @Override
    protected String failedExecutingOperation$str() {
        return "WFLYCTL0005: N'a pas pu exécuter l'opération %1$s à l'adresse %2$s";
    }
    @Override
    protected String managementResourceNotFoundMessage$str() {
        return "WFLYCTL0335: Ressource de gestion '%1$s' non trouvée";
    }
    @Override
    protected String missingListAttributeValueType$str() {
        return "WFLYCTL0493: L'attribut %1$s n'a pas de valueType correctement défini.";
    }
    @Override
    protected String serviceStatusReportCorrected$str() {
        return "WFLYCTL0185: Services nouvellement modifiés : %n";
    }
    @Override
    protected String couldNotResolveExpressionIndex$str() {
        return "WFLYCTL0391: Impossible de résoudre l'expression de l'attribut : '%1$s', index '%2$d' non valide";
    }
    @Override
    protected String attributeDeprecated$str() {
        return "WFLYCTL0028: L'attribut '%1$s' dans les ressources à l'adresse '%2$s' est désapprouvé et peut être supprimé dans la prochaine version. Pour en savoir plus sur son obsolescence, consulter la description de l'attribut dans la sortie de l'opération read-resource-description.";
    }
    @Override
    protected String cannotWriteTo$str() {
        return "WFLYCTL0057: N'a pas pu écrire dans %1$s";
    }
    @Override
    protected String incompatiblePermissionType$str() {
        return "WFLYCTL0334: Type de permission incompatible %1$s";
    }
    @Override
    protected String capabilityAlreadyRegisteredInContext4$str() {
        return "WFLYCTL0436: Impossible d'enregistrer la fonction '%1$s' à l'emplacement '%2$s' car elle est déjà enregistrée dans le contexte '%3$s' emplacement(s) '%4$s'";
    }
    @Override
    protected String wildcardAddressDetected$str() {
        return "WFLYCTL0015: Adresse générique détectée - ignorera les autres critères d'interface.";
    }
    @Override
    protected String invalidMinSize$str() {
        return "WFLYCTL0115: [%1$d] n'est pas à la bonne taille pour le paramètre %2$s. Il vous faut une longueur minimum de [%3$d]";
    }
    @Override
    protected String failedSendingCompletedResponse$str() {
        return "WFLYCTL0407: Échec de l'envoi des réponses complétées %1$s pour %2$d";
    }
    @Override
    protected String disallowedHeaderName$str() {
        return "WFLYCTL0458: Nom de l'en-tête HTTP non autorisé ''%1$s'";
    }
    @Override
    protected String unknownValueForElement$str() {
        return "WFLYCTL0206: Les %1$s %2$s %3$s inconnus doivent être déclarés dans l'élément %4$s";
    }
    @Override
    protected String transformerLoggerCoreModelResourceTransformerAttributes$str() {
        return "WFLYCTL0294: Transformation de la ressource %1$s dans la version modèle principal '%2$s' -- %3$s %4$s";
    }
    @Override
    protected String unknownCapabilityInContext$str() {
        return "WFLYCTL0365: La fonction '%1$s' est inconnue dans le contexte '%2$s'.";
    }
    @Override
    protected String attributesMustBeDefinedAs$str() {
        return "WFLYCTL0339: Les attributs suivants doivent être définis en tant que %1$s dans le modèle courant: %2$s";
    }
    @Override
    protected String multipleParallelBootOperation$str() {
        return "WFLYCTL0517: Il existe plusieurs opérations de démarrage parallèle.";
    }
    @Override
    protected String incorrectType$str() {
        return "WFLYCTL0097: Type erroné pour '%1$s'. %2$s attendu, mais avons obtenu %3$s";
    }
    @Override
    protected String serviceStatusReportFailureHeader$str() {
        return "WFLYCTL0441: L'opération a donné lieu à des services défectueux ou manquants %n";
    }
    @Override
    protected String failedToRenameTempFile$str() {
        return "WFLYCTL0268: N'a pas pu renommer le fichier temp %1$s en %2$s";
    }
    @Override
    protected String capabilitiesNotAvailable$str() {
        return "WFLYCTL0361: Les fonctions ne peuvent pas être demandées à l'étape '%1$s' : elles ne seront disponibles qu'à l'étape '%2$s'.";
    }
    @Override
    protected String capabilityAlreadyRegisteredInContext2$str() {
        return "WFLYCTL0363: La fonction '%1$s' est déjà enregistrée dans le contexte '%2$s'.";
    }
    @Override
    protected String errorObtainingPassword$str() {
        return "WFLYCTL0443: Erreur lors de l'obtention du mot de passe du fournisseur %1$s";
    }
    @Override
    protected String cannotResolveExpression$str() {
        return "WFLYCTL0211: Impossible de résoudre l'expression '%1$s'";
    }
    @Override
    protected String managementResourceNotFound$str() {
        return "WFLYCTL0216: Ressource de gestion '%1$s' non trouvée";
    }
    @Override
    protected String failedToPublishConfiguration$str() {
        return "WFLYCTL0451: Échec de la publication de la configuration à %1$s à cause de %2$s";
    }
    @Override
    protected String gracefulManagementChannelHandlerShutdownFailed$str() {
        return "WFLYCTL0020: L'arrêt contrôlé du handler utilisé pour les requêtes de gestion natives a échoué, mais la fermeture du canal de communication sous-jacent se poursuit";
    }
    @Override
    protected String unexpectedAttribute2$str() {
        return "WFLYCTL0376: Attribut '%1$s' inattendu rencontré. Les attributs valides sont : '%2$s'";
    }
    @Override
    protected String duplicateSubsystem$str() {
        return "WFLYCTL0226: Un sous-système nommé '%1$s' ne peut pas être enregistré par l'extension '%2$s' -- un sous-système comportant ce nom a déjà été enregistré par l'extension '%3$s'.";
    }
    @Override
    protected String resourceWasAdded$str() {
        return "WFLYCTL0358: La ressource a été ajoutée à l'adresse %1$s.";
    }
    @Override
    protected String wrongMaskedPasswordFormat$str() {
        return "WFLYCTL0423: La commande de mot de passe masqué n'a pas le bon format.%nUsage: MASK-<encoded secret>;<salt>;<iteration count> avec <salt>=UTF-8 caractères, <iteration count>=entier relatif positif de taille raisonnable";
    }
    @Override
    protected String attributesMustNotBeDefinedAs$str() {
        return "WFLYCTL0340: Les attributs suivants NE doivent PAS être définis en tant que %1$s dans le modèle courant: %2$s";
    }
    @Override
    protected String invalidStage$str() {
        return "WFLYCTL0123: L'étape %1$s n'est pas valide pour le type de processus de contexte %2$s";
    }
    @Override
    protected String alreadyDefinedAttribute$str() {
        return "WFLYCTL0445: %1$s avec la valeur '%2$s' dans l'attribut %3$s est déjà défini";
    }
    @Override
    protected String permissionCollectionIsReadOnly$str() {
        return "WFLYCTL0333: Impossible d'ajouter une Permission à une PermissionCollection en lecture-seule";
    }
    @Override
    protected String canonicalBootFileNotFound$str() {
        return "WFLYCTL0059: N'a pas pu obtenir de fichier canonique pour le fichier de démarrage : %1$s";
    }
    @Override
    protected String invalidAddressMaskValue$str() {
        return "WFLYCTL0102: 'valeur' non valide %1$s -- devrait être sous la forme adresse/masque";
    }
    @Override
    protected String removingUnexistingResource$str() {
        return "WFLYCTL0512: Aucune ressource n'existe à l'adresse '%1$s'. Ignorer l'opération de suppression.";
    }
    @Override
    protected String attributesAreNotUnderstoodAndMustBeIgnored1$str() {
        return "WFLYCTL0302: Les attributs suivants ne sont pas compris par la version du modèle cible et cette ressource aura besoin d'être ignorée sur l'hôte cible: %1$s";
    }
    @Override
    protected String loadingYamlFiles$str() {
        return "WFLYCTL0487: Ça a pris %1$s ms pour charger et analyser les fichiers yaml suivants [%2$s]";
    }
    @Override
    protected String attributeUnresolvableUsingSimpleResolution$str() {
        return "WFLYCTL0479: Attribut '%1$s' à la ressource '%2$s' avec une valeur non résolue '%3$s' ne peut pas être résolu à l'aide des sources de résolution non sensibles à la sécurité prises en charge par le paramètre « resolve ». La réponse indiquera la valeur non résolue.";
    }
    @Override
    protected String domainControllerMustBeDeclared$str() {
        return "WFLYCTL0067: On doit déclarer une configuration de contrôleur de domaine %1$s ou %2$s.";
    }
    @Override
    protected String requiredAttributeNotSet$str() {
        return "WFLYCTL0380: L'attribut '%1$s' doit être défini ou passé avant que l'attribut '%2$s' puisse être défini correctement";
    }
    @Override
    protected String couldNotResolveExpression$str() {
        return "WFLYCTL0393: Impossible de résoudre l'expression de l'attribut : '%1$s'";
    }
    @Override
    protected String missingTransitiveDependencyProblem$str() {
        return "WFLYCTL0288: Un de nos services n'a pas pu démarrer car une ou plusieurs dépendance(s) indirecte(s) n'étaient pas disponible(s)";
    }
    @Override
    protected String unstableExtension$str() {
        return "WFLYCTL0506: Extension%1$s du module%2$s n'est pas activé par le niveau de stabilité actuel";
    }
    @Override
    protected String operationCancelledAsynchronously$str() {
        return "WFLYCTL0272: Opération annulée de façon asynchrone";
    }
    @Override
    protected String duplicateNamedElement$str() {
        return "WFLYCTL0073: Un élément de ce type nommé '%1$s' a déjà été déclaré";
    }
    @Override
    protected String fileNotFound$str() {
        return "WFLYCTL0090: %1$s n'existe pas";
    }
    @Override
    protected String unknownRole$str() {
        return "WFLYCTL0327: Rôle inconnu '%1$s'";
    }
    @Override
    protected String missingOperationForResource$str() {
        return "WFLYCTL0504: L'opération %1$s n'est pas défini pour la ressource %2$s.";
    }
}
