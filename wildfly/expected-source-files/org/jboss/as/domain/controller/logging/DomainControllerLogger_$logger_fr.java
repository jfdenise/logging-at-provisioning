package org.jboss.as.domain.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:30+0200")
public class DomainControllerLogger_$logger_fr extends DomainControllerLogger_$logger implements DomainControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DomainControllerLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String warnIgnoringSocketBindingGroupInclude$str() {
        return "WFLYDC0001: Ignorer 'include' enfant de 'socket-binding-group' %1$s";
    }
    @Override
    protected String interruptedAwaitingFinalResponse2$str() {
        return "WFLYDC0003: Interrompu en attendant la réponse finale du serveur %1$s sur l'hôte %2$s; le process éloigné a reçu l'ordre d'annuler l'opération";
    }
    @Override
    protected String caughtExceptionAwaitingFinalResponse2$str() {
        return "WFLYDC0004: Exception interceptée en attendant la réponse finale du serveur %1$s sur l'hôte %2$s";
    }
    @Override
    protected String interruptedAwaitingFinalResponse1$str() {
        return "WFLYDC0005: Interrompu en attendant la réponse finale de l'hôte %1$s; le processus éloigné a reçu l'ordre d'annuler l'opération";
    }
    @Override
    protected String caughtExceptionAwaitingFinalResponse1$str() {
        return "WFLYDC0006: Exception interceptée en attendant la réponse finale de l'hôte %1$s";
    }
    @Override
    protected String caughtExceptionClosingInputStream$str() {
        return "WFLYDC0007: Exception interceptée lors de la fermeture du flux entrant";
    }
    @Override
    protected String domainModelChangedOnReConnect$str() {
        return "WFLYDC0008: Le modèle du domaine a changé au moment de la connexion à nouveau. Les serveurs suivants devront être démarrés à nouveau pour que les changements puissent prendre effet : %1$s";
    }
    @Override
    protected String caughtExceptionWaitingForTask$str() {
        return "WFLYDC0009: %1$s a intercepté %2$s en attendant la tâche %3$s. Tâche annulée";
    }
    @Override
    protected String reportAdminOnlyMissingDeploymentContent$str() {
        return "WFLYDC0011: Aucun contenu de déploiement avec hachage %1$s n'est disponible dans le référentiel de contenu de déploiement pour le déploiement de %2$s. Comme ce contrôleur hôte démarre en mode ADMIN uniquement, le processus de démarrage (boot) pourra permettre aux administrateurs de corriger ce problème. Si ce contrôleur hôte n'était pas en mode ADMIN seulement, cela constituerait une panne fatale de démarrage.";
    }
    @Override
    protected String failedToSetServerInRestartRequireState$str() {
        return "WFLYDC0012: n'a pas pu mettre le serveur (%1$s) dans un état requis de redémarrage";
    }
    @Override
    protected String slaveControllerCannotAcceptOtherSlaves$str() {
        return "WFLYDC0013: L'enregistrement des hôtes distants n'est pas pris en charge par les contrôleurs d'hôtes secondaires";
    }
    @Override
    protected String adminOnlyModeCannotAcceptSlaves$str() {
        return "WFLYDC0014: Le contrôleur hôte primaire ne peut pas enregistrer les contrôleurs hôtes secondaires car son mode de fonctionnement actuel est '%1$s'";
    }
    @Override
    protected String slaveAlreadyRegistered$str() {
        return "WFLYDC0015: Il existe déjà un hôte enregistré nommé '%1$s'";
    }
    @Override
    protected String requiredChildIsMissing$str() {
        return "WFLYDC0016: %1$s est manquant %2$s : %3$s";
    }
    @Override
    protected String unrecognizedChildren$str() {
        return "WFLYDC0017: %1$s reconnaît %2$s uniquement en tant qu'enfants : %3$s";
    }
    @Override
    protected String inSeriesIsMissingGroups$str() {
        return "WFLYDC0018: in-series devrait contenir les groupes : %1$s";
    }
    @Override
    protected String serverGroupExpectsSingleChild$str() {
        return "WFLYDC0019: server-group s'attend à un et un seul enfant : %1$s";
    }
    @Override
    protected String unexpectedInSeriesGroup$str() {
        return "WFLYDC0020: L'un des groupes ne définit ni le server-group ni les concurrent-groups : %1$s";
    }
    @Override
    protected String unexplainedFailure$str() {
        return "WFLYDC0021: Échec non expliqué";
    }
    @Override
    protected String operationFailedOrRolledBack$str() {
        return "WFLYDC0022: L'opération a échoué ou à été renvoyée sur tous les serveurs.";
    }
    @Override
    protected String interruptedAwaitingResultFromServer$str() {
        return "WFLYDC0023: Attente de résultat serveur %1$s interrompue";
    }
    @Override
    protected String exceptionAwaitingResultFromServer$str() {
        return "WFLYDC0024: Exception lors de l'attente d'un résultat du serveur %1$s : %2$s";
    }
    @Override
    protected String invalidRolloutPlan2$str() {
        return "WFLYDC0025: Plan de lancement non valide. %1$s n'est pas un enfant de nœud %2$s valide";
    }
    @Override
    protected String invalidRolloutPlan1$str() {
        return "WFLYDC0026: Plan de lancement non valide. Les opérations du plan affectent les groupes de serveur %1$s qui ne sont pas représentés dans le plan de lancement";
    }
    @Override
    protected String invalidRolloutPlanGroupAlreadyExists$str() {
        return "WFLYDC0027: Plan de lancement non valide. Le groupe de serveur %1$s apparaît plus d'une occasion dans le plan.";
    }
    @Override
    protected String invalidRolloutPlanRange$str() {
        return "WFLYDC0028: Plan de lancement non valide. Le groupe de serveur %1$s possède une valeur %2$s de %3$s; doit être contenue entre 0 et 100.";
    }
    @Override
    protected String invalidRolloutPlanLess$str() {
        return "WFLYDC0029: Plan de lancement non valide. Le groupe de serveur %1$s a une valeur %2$s de %3$s; ne peut pas être inférieure à 0.";
    }
    @Override
    protected String interruptedAwaitingResultFromHost$str() {
        return "WFLYDC0030: Interrompu en attendant le résultat de l'hôte %1$s";
    }
    @Override
    protected String masterDomainControllerOnlyOperation$str() {
        return "WFLYDC0032: L'opération %1$s pour l'adresse %2$s ne peut être traitée que par le contrôleur de domaine ; cet hôte n'est pas le contrôleur de domaine";
    }
    @Override
    protected String invalidOperationTargetHost$str() {
        return "WFLYDC0033: L'opération vise l'hôte %1$s mais cet hôte n'est pas enregistré";
    }
    @Override
    protected String caughtExceptionStoringDeploymentContent$str() {
        return "WFLYDC0034: %1$s intercepté lors du stockage du contenu de déploiement -- %2$s";
    }
    @Override
    protected String unexpectedInitialPathKey$str() {
        return "WFLYDC0035: Clé de chemin d'accès de départ %1$s non attendue";
    }
    @Override
    protected String nullStream$str() {
        return "WFLYDC0036: Aucun flux à l'index %1$d";
    }
    @Override
    protected String invalidByteStream$str() {
        return "WFLYDC0037: Flux d'octets non valide.";
    }
    @Override
    protected String invalidUrlStream$str() {
        return "WFLYDC0038: Flux URL non valide.";
    }
    @Override
    protected String as7431$str() {
        return "WFLYDC0039: 1 seule portion de contenu est actuellement prise en charge (AS7-431)";
    }
    @Override
    protected String noDeploymentContentWithHash$str() {
        return "WFLYDC0040: Aucun contenu de déploiement avec hash %1$s n'est disponible dans le référentiel de contenu de déploiement.";
    }
    @Override
    protected String slaveCannotAcceptUploads$str() {
        return "WFLYDC0041: Un contrôleur hôte secondaire ne peut pas accepter les téléchargements de contenu de déploiement";
    }
    @Override
    protected String noDeploymentContentWithName$str() {
        return "WFLYDC0042: Aucun déploiement avec le nom %1$s trouvé";
    }
    @Override
    protected String cannotRemoveDeploymentInUse$str() {
        return "WFLYDC0043: Impossible de supprimer le déploiement %1$s du domaine car il est toujours utilisé par les groupes de serveurs %2$s";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYDC0044: Valeur '%1$s' non valide : %2$d, l'index maximum est %3$d";
    }
    @Override
    protected String invalidUrl$str() {
        return "WFLYDC0045: %1$s n'est pas un URL valide -- %2$s";
    }
    @Override
    protected String errorObtainingUrlStream$str() {
        return "WFLYDC0046: Erreur d'obtention de flux entrant en provenance de URL %1$s -- %2$s";
    }
    @Override
    protected String invalidContentDeclaration$str() {
        return "WFLYDC0047: Déclaration de contenu non valide";
    }
    @Override
    protected String cannotUseSameValueForParameters$str() {
        return "WFLYDC0049: Impossible d'utiliser %1$s avec la même valeur pour les paramètres %2$s et %3$s. Utilisez %4$s pour redéployer le même contenu ou %5$s pour remplacer le contenu avec une nouvelle version possédant le même nom.";
    }
    @Override
    protected String deploymentAlreadyStarted$str() {
        return "WFLYDC0050: Le déploiement %1$s a déjà démarré";
    }
    @Override
    protected String unknown$str() {
        return "WFLYDC0051: %1$s %2$s Inconnu";
    }
    @Override
    protected String unknownServerGroup$str() {
        return "WFLYDC0052: Groupe de serveur %1$s inconnu";
    }
    @Override
    protected String unknownServer$str() {
        return "WFLYDC0053: Serveur %1$s inconnu";
    }
    @Override
    protected String invalidCode$str() {
        return "WFLYDC0054: Code %1$d non valide";
    }
    @Override
    protected String deploymentHashNotFoundInRepository$str() {
        return "WFLYDC0055: Le référentiel ne contient aucun déploiement ayant pour hachage %1$s";
    }
    @Override
    protected String expectedOnlyOneDeployment$str() {
        return "WFLYDC0056: Un seul déploiement attendu, %1$d trouvé";
    }
    @Override
    protected String noProfileCalled$str() {
        return "WFLYDC0057: Aucun profil attendu : %1$s";
    }
    @Override
    protected String noDeploymentContentWithHashAtBoot$str() {
        return "WFLYDC0058: Aucun contenu de déploiement avec le hachage %1$s n'est disponible dans le référentiel de contenu de déploiement pour le déploiement de '%2$s'. Il s'agit d'une erreur fatale de démarrage. Pour corriger le problème, soit redémarrer par admin-only et utiliser CLI pour installer le contenu manquant ou le supprimer de la configuration, ou encore, retirer le déploiement du fichier de configuration xml et redémarrez.";
    }
    @Override
    protected String failedToLoadModule$str() {
        return "WFLYDC0059: N'a pas pu charger le module '%1$s'.";
    }
    @Override
    protected String invalidJSFSlotValue$str() {
        return "WFLYDC0060: Valeur d'emplacement Jakarta Server Faces non valide : '%1$s'. Le contrôleur hôte n'est pas en mesure d'utiliser une valeur d'emplacement Jakarta Server Faces différente de sa valeur par défaut. Cette ressource sera ignorée sur cet hôte";
    }
    @Override
    protected String unknownAttributesFromSubsystemVersion$str() {
        return "WFLYDC0061: L'opération '%1$s' a échoué car les attributs sont inconnus du sous-système '%2$s' ayant pour version de modèle '%3$s':%4$s";
    }
    @Override
    protected String noSocketBindingGroupCalled$str() {
        return "WFLYDC0062: Aucun socket-binding-group appelé : %1$s";
    }
    @Override
    protected String runtimeNameMustBeUnique$str() {
        return "WFLYDC0063: Il y a déjà un déploiement nommé %1$s avec le même nom de runtime %2$s sur le groupe de serveurs %3$s";
    }
    @Override
    protected String cannotRemoveUsedServerGroup$str() {
        return "WFLYDC0064: Impossible de supprimer le sever-group '%1$s' car ce dernier est utilisé par les serveurs %2$s";
    }
    @Override
    protected String unsupportedWildcardOperation$str() {
        return "WFLYDC0065: Les operations génériques ne sont pas prises en charge dans le cadre des opérations composites";
    }
    @Override
    protected String failedToSendMessage$str() {
        return "WFLYDC0066: N'a pas pu envoyer le message : %1$s";
    }
    @Override
    protected String failedToSendResponseHeader$str() {
        return "WFLYDC0067: N'a pas pu envoyer d'en-tête de réponse : %1$s";
    }
    @Override
    protected String registrationTaskGotInterrupted$str() {
        return "WFLYDC0068: Tâche d'enregistrement d'hôte non interrompue";
    }
    @Override
    protected String registrationTaskFailed$str() {
        return "WFLYDC0069: La tâche d'enregistrement a échoué : %1$s";
    }
    @Override
    protected String interruptedAwaitingPreparedResponse$str() {
        return "WFLYDC0070: %1$s interrompu alors qu'il était en attente de réponse(s) préparée(s) de serveur --annulation des mises à jour dans serveurs %2$s";
    }
    @Override
    protected String interruptedAwaitingHostPreparedResponse$str() {
        return "WFLYDC0071: Interrompu alors qu'il était en attente de réponse(s) préparée(s) d'hôte --annulation des mises à jour dans hôtes %1$s";
    }
    @Override
    protected String caughtIOExceptionUploadingContent$str() {
        return "WFLYDC0072: IOException interceptée lors de la lecture du contenu du déploiement téléchargé";
    }
    @Override
    protected String undeployingDeploymentHasBeenRedeployed$str() {
        return "WFLYDC0073: Le déploiement %1$s a été redéployé. Son contenu va être supprimé. Vous allez devoir le redémarrer.";
    }
    @Override
    protected String operationFailedOrRolledBackWithCause$str() {
        return "WFLYDC0074: L'opération a échoué ou a été renvoyée sur tous les serveurs. Échecs du serveur :";
    }
    @Override
    protected String missingExtensions$str() {
        return "WFLYDC0075: Impossible de synchroniser le modèle à cause d'extensions manquantes : %1$s";
    }
    @Override
    protected String duplicateProfileInclude$str() {
        return "WFLYDC0076: Le doublon a inclu le profile '%1$s'";
    }
    @Override
    protected String duplicateSocketBindingGroupInclude$str() {
        return "WFLYDC0077: Le doublon a inclu le groupe de liaison de socket '%1$s'";
    }
    @Override
    protected String cloneOperationNotSupportedOnHost$str() {
        return "WFLYDC0078: L'opération de clonage de profil n'est pas disponible sur l'hôte '%1$s'. Pour pouvoir l'utiliser dans un domaine contenant des hôtes secondaires plus anciens qui ne prennent pas en charge l'opération de clonage de profil, vous devez : a) vous assurer que tous les hôtes secondaires plus anciens dont la version du modèle est inférieure à 4.0.0 ignorent le profil cloné et le profil spécifié dans le paramètre 'to-profile'. b) recharger le contrôleur de domaine en mode administrateur uniquement, effectuer le clonage, puis recharger le contrôleur de domaine en mode normal et vérifier si les hôtes secondaires doivent être rechargés.";
    }
    @Override
    protected String timedOutAwaitingHostPreparedResponses$str() {
        return "WFLYDC0079: Délai dépassé après %1$d ms d'attente de la ou des réponse(s) préparée(s) de l'hôte %2$s -- suppression des mises à jour pour les hôtes %3$s";
    }
    @Override
    protected String timedOutAwaitingHostPreparedResponse$str() {
        return "WFLYDC0080: Délai dépasse après %1$d ms d'attente de la ou des réponse(s) préparées de l'hôte -- l'hôte distant %2$s a été informé de supprimer l'opération";
    }
    @Override
    protected String timedOutAwaitingFinalResponse2$str() {
        return "WFLYDC0081: Délai dépassé après %1$d ms d'attente de la réponse finale de l'hôte %2$s ; le processus distant a été informé de supprimer l'opération";
    }
    @Override
    protected String timedOutAwaitingPreparedResponse$str() {
        return "WFLYDC0082: Délai de %1$s dépassé %3$s alors qu'il était en attente de réponse(s) préparée(s) de serveur --annulation des mises à jour dans serveurs %2$d";
    }
    @Override
    protected String timedOutAwaitingFinalResponse3$str() {
        return "WFLYDC0083: Délai dépassé après %1$d ms d'attente de la réponse finale du serveur %2$s sur l'hôte %3$s ; le processus distant a été informé de supprimer l'opération";
    }
    @Override
    protected String cannotExplodeDeploymentOfSelfContainedServer$str() {
        return "WFLYDC0084: Impossible d'éclater un déploiement dans un serveur autonome";
    }
    @Override
    protected String cannotExplodeUnmanagedDeployment$str() {
        return "WFLYDC0085: Impossible d'éclater un déploiement non géré";
    }
    @Override
    protected String cannotExplodeAlreadyExplodedDeployment$str() {
        return "WFLYDC0086: Impossible d'éclater un déploiement qui a déjà été éclaté";
    }
    @Override
    protected String cannotExplodeEnabledDeployment$str() {
        return "WFLYDC0087: Impossible d'éclater un déploiement qui a déjà été déployé";
    }
    @Override
    protected String cannotAddContentToSelfContainedServer$str() {
        return "WFLYDC0088: Impossible d'ajouter du contenu à un déploiement dans un serveur autonome";
    }
    @Override
    protected String cannotAddContentToUnmanagedDeployment$str() {
        return "WFLYDC0089: Impossible d'ajouter du contenu à un déploiement non géré";
    }
    @Override
    protected String cannotAddContentToUnexplodedDeployment$str() {
        return "WFLYDC0090: Impossible d'ajouter du contenu à un déploiement qui n'est pas sous forme éclatée";
    }
    @Override
    protected String cannotRemoveContentFromSelfContainedServer$str() {
        return "WFLYDC0091: Impossible de supprimer du contenu d'un déploiement dans un serveur autonome";
    }
    @Override
    protected String cannotRemoveContentFromUnmanagedDeployment$str() {
        return "WFLYDC0092: Impossible de supprimer du contenu d'un déploiement non géré";
    }
    @Override
    protected String cannotRemoveContentFromUnexplodedDeployment$str() {
        return "WFLYDC0093: Impossible de déplacer du contenu d'un déploiement non géré";
    }
    @Override
    protected String cannotReadContentFromSelfContainedServer$str() {
        return "WFLYDC0094: Impossible d'analyser du contenu d'un déploiement dans un serveur autonome";
    }
    @Override
    protected String cannotReadContentFromUnmanagedDeployment$str() {
        return "WFLYDC0095: Impossible d'analyser du contenu d'un déploiement non géré";
    }
    @Override
    protected String cannotReadContentFromUnexplodedDeployment$str() {
        return "WFLYDC0096: Impossible d'analyser du contenu d'un déploiement non géré";
    }
    @Override
    protected String cannotExplodeSubDeploymentOfUnexplodedDeployment$str() {
        return "WFLYDC0097: Impossible d'éclater un sous-déploiement dans un déploiement qui n'est pas lui-même sous forme éclatée";
    }
    @Override
    protected String serverManagementUnavailableDuringBoot$str() {
        return "WFLYDC0098: Les serveurs suivants %1$s démarrent; l'exécution des opérations de gestion à distance n'est pas actuellement disponible";
    }
}
