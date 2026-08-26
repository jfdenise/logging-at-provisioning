package org.jboss.as.ee.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:54:02+0200")
public class EeLogger_$logger_fr extends EeLogger_$logger implements EeLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public EeLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotResolve$str() {
        return "WFLYEE0002: Impossible de résoudre %1$s %2$s";
    }
    @Override
    protected String componentDestroyFailure$str() {
        return "WFLYEE0006: Impossible de détruire l'instance de composant %1$s";
    }
    @Override
    protected String componentInstallationFailure$str() {
        return "WFLYEE0007: Composant optionnel %1$s non installé à cause de l'exception (activer le niveau log DEBUG pour en voir la cause)";
    }
    @Override
    protected String invalidManagedBeanAbstractOrFinal$str() {
        return "WFLYEE0009: [Managed Bean spec, section %1$s] L'implémentation de Managed bean ne DOIT PAS être une interface - %2$s est une interface, donc ne sera pas considérée comme bean géré.";
    }
    @Override
    protected String invalidManagedBeanInterface$str() {
        return "WFLYEE0010: [Managed Bean spec, section %1$s] L'implémentation de Managed bean ne DOIT PAS être abstraite ou finale - %2$s ne sera pas considéré en tant que bean géré, car il ne répond pas aux critères.";
    }
    @Override
    protected String preDestroyInterceptorFailure$str() {
        return "WFLYEE0011: Exception lors de l'invocation de l'intercepteur pre-destroy pour la classe de composant : %1$s";
    }
    @Override
    protected String subdeploymentIgnored$str() {
        return "WFLYEE0014: %1$s du sous-déploiement est ignoré. jboss-ejb-client.xml est uniquement analysé pour les déploiements de niveau supérieur.";
    }
    @Override
    protected String rollbackOfTransactionStartedInEEConcurrentInvocation$str() {
        return "WFLYEE0015: Transaction démarrée dans l'invocation d'EE Concurrent, démarrage du rollback pour éviter une fuite.";
    }
    @Override
    protected String failedToRollbackTransaction$str() {
        return "WFLYEE0016: N'a pas pu restaurer la transaction.";
    }
    @Override
    protected String failedToSuspendTransaction$str() {
        return "WFLYEE0017: N'a pas pu mettre la transaction en attente.";
    }
    @Override
    protected String systemErrorWhileCheckingForTransactionLeak$str() {
        return "WFLYEE0018: Erreur système lors du contrôle de fuite de transaction dans l'invocation d'EE Concurrent.";
    }
    @Override
    protected String alternateDeploymentDescriptor$str() {
        return "WFLYEE0019: Impossible de trouver un descripteur de déploiement différent %1$s spécifié pour %2$s";
    }
    @Override
    protected String annotationAttributeMissing$str() {
        return "WFLYEE0020: Les annotations %1$s doivent fournir un %2$s.";
    }
    @Override
    protected String cannotAddMoreItems$str() {
        return "WFLYEE0021: Impossible d'ajouter des éléments supplémentaires une fois que getSortedItems() a été appelé";
    }
    @Override
    protected String cannotBeEmpty$str() {
        return "WFLYEE0022: %1$s n'est pas forcément vide";
    }
    @Override
    protected String cannotBeNullOrEmpty$str() {
        return "WFLYEE0023: %1$s ne peut pas rester null ou vide : %2$s";
    }
    @Override
    protected String cannotConfigureComponent$str() {
        return "WFLYEE0024: Impossible de configurer le composant %1$s";
    }
    @Override
    protected String cannotDetermineType1$str() {
        return "WFLYEE0025: Impossible de déterminer le type pour la ressource-env-ref %1$s";
    }
    @Override
    protected String cannotDetermineType3$str() {
        return "WFLYEE0026: Impossible de déterminer le type pour %1$s %2$s veuillez spécifier %3$s.";
    }
    @Override
    protected String cannotLoad$str() {
        return "WFLYEE0027: Impossible de charger %1$s référencé dans env-entry";
    }
    @Override
    protected String cannotLoadInterceptor1$str() {
        return "WFLYEE0028: Impossible de charger l'intercepteur de classe %1$s";
    }
    @Override
    protected String cannotLoadInterceptor2$str() {
        return "WFLYEE0029: Impossible de charger la classe d'intercepteur %1$s sur le composant %2$s";
    }
    @Override
    protected String cannotLoadViewClass$str() {
        return "WFLYEE0030: Impossible de charger la classe de vue %1$s pour le composant %2$s";
    }
    @Override
    protected String cannotProcessEarModule$str() {
        return "WFLYEE0031: Impossible de traiter les modules dans application.xml pour EAR [%1$s], le fichier de module %2$s n'a pas été trouvé";
    }
    @Override
    protected String cannotParseResourceRefUri$str() {
        return "WFLYEE0032: Impossible de traiter URI resource-ref : %1$s";
    }
    @Override
    protected String cannotResolveInjectionPoint$str() {
        return "WFLYEE0033: Impossible de résoudre le point d'injection %1$s sur la classe %2$s indiquée dans web.xml";
    }
    @Override
    protected String cannotResolveMethod$str() {
        return "WFLYEE0034: Impossible de résoudre la méthode %1$s sur la classe %2$s avec les annotations %3$s";
    }
    @Override
    protected String cannotSpecifyBoth$str() {
        return "WFLYEE0036: Impossible de spécifier à la fois un %1$s et un %2$s dans une entrée d'environnement.";
    }
    @Override
    protected String circularDependency$str() {
        return "WFLYEE0037: Dépendance circulaire qui installe %1$s";
    }
    @Override
    protected String classOnlyAnnotation$str() {
        return "WFLYEE0038: L'annotation %1$s n'est autorisée que sur une classe. %2$s n'est pas une classe.";
    }
    @Override
    protected String componentAlreadyDefined$str() {
        return "WFLYEE0040: Le composant '%1$s' de la classe '%2$s' est déjà défini dans la classe '%3$s'";
    }
    @Override
    protected String componentClassHasErrors$str() {
        return "WFLYEE0041: La classe de composant %1$s du composant %2$s comprend des erreurs : %n%3$s";
    }
    @Override
    protected String componentConstructionFailure$str() {
        return "WFLYEE0042: Impossible de construire une instance de composant";
    }
    @Override
    protected String componentIsStopped$str() {
        return "WFLYEE0043: Le composant a cessé";
    }
    @Override
    protected String componentNotAvailable$str() {
        return "WFLYEE0044: Le composant n'est pas disponible (interrompu)";
    }
    @Override
    protected String componentNotFound$str() {
        return "WFLYEE0045: Aucun composant trouvé pour le type '%1$s'";
    }
    @Override
    protected String componentViewConstructionFailure$str() {
        return "WFLYEE0046: N'a pas pu instancier le vue du composant";
    }
    @Override
    protected String conflictingBinding$str() {
        return "WFLYEE0047: Liaison incompatible en conflit à la source %1$s : %2$s";
    }
    @Override
    protected String defaultConstructorNotFound$str() {
        return "WFLYEE0048: Impossible de trouver le constructeur par défaut pour %1$s";
    }
    @Override
    protected String defaultConstructorNotFoundOnComponent$str() {
        return "WFLYEE0050: Aucun constructeur par défaut pour la classe d'intercepteur %1$s du composant %2$s";
    }
    @Override
    protected String elementAttributeMissing$str() {
        return "WFLYEE0051: Les éléments %1$s doivent fournir un %2$s.";
    }
    @Override
    protected String failedToInstallComponent$str() {
        return "WFLYEE0052: N'a pas pu installer le composant %1$s";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYEE0053: N'a pas pu traiter %1$s";
    }
    @Override
    protected String failedToProcessChild$str() {
        return "WFLYEE0054: N'a pas pu traiter les dépendants pour EAR [%1$s]";
    }
    @Override
    protected String failedToRead2$str() {
        return "WFLYEE0055: N'a pas pu lire les entrées %1$s pour l'application [%2$s]";
    }
    @Override
    protected String failedToRead3$str() {
        return "WFLYEE0056: N'a pas pu lire les entrées %1$s pour le module [%2$s, %3$s]";
    }
    @Override
    protected String failedToRead4$str() {
        return "WFLYEE0057: N'a pas pu lire les entrées %1$s pour le composant [%2$s, %3$s, %4$s]";
    }
    @Override
    protected String fieldNotFound$str() {
        return "WFLYEE0058: Aucun champ correspondant trouvé pour '%1$s'";
    }
    @Override
    protected String injectionTargetNotFound$str() {
        return "WFLYEE0059: Aucune cible d'injection trouvée";
    }
    @Override
    protected String invalidCharacterLength$str() {
        return "WFLYEE0060: %1$s du type java.lang.Character n'est pas exactement de la longueur d'un caractère %2$s";
    }
    @Override
    protected String invalidDescriptor$str() {
        return "WFLYEE0061: %1$s n'est pas un descripteur valide";
    }
    @Override
    protected String invalidInjectionTarget$str() {
        return "WFLYEE0062: La cible d'injection %1$s sur la classe %2$s n'est pas compatible avec le type d'injection : %3$s";
    }
    @Override
    protected String invalidNumberOfArguments$str() {
        return "WFLYEE0063: Nombre d'arguments non valide pour la méthode %1$s annotée par %2$s sur la classe %3$s";
    }
    @Override
    protected String invalidReturnType$str() {
        return "WFLYEE0064: Le type de retour de %1$s est requis pour la méthode %2$s annotée par %3$s sur la classe %4$s";
    }
    @Override
    protected String invalidSignature$str() {
        return "WFLYEE0065: La signature est non valide pour la méthode %1$s annotée par %2$s sur la classe %3$s, la signature doit être '%4$s'";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYEE0066: Valeur non valide : %1$s pour l'élément '%2$s'";
    }
    @Override
    protected String methodNotFound1$str() {
        return "WFLYEE0067: La méthode n'existe pas %1$s";
    }
    @Override
    protected String methodNotFound3$str() {
        return "WFLYEE0068: Aucune méthode trouvée pour la méthode %1$s (%2$s) sur %3$s";
    }
    @Override
    protected String methodOnlyAnnotation$str() {
        return "WFLYEE0069: @%1$s uniquement valide sur les cibles de méthode.";
    }
    @Override
    protected String multipleComponentsFound$str() {
        return "WFLYEE0070: Composants multiples trouvés pour le type '%1$s'";
    }
    @Override
    protected String multipleMethodsFound$str() {
        return "WFLYEE0071: Plusieurs méthodes trouvées pour la méthode %1$s (%2$s) sur %3$s";
    }
    @Override
    protected String multipleSetterMethodsFound$str() {
        return "WFLYEE0072: Plusieurs méthodes setter trouvées pour %1$s sur la classe %2$s quand on applique <injection-target> pour env-entry";
    }
    @Override
    protected String noComponentInstance$str() {
        return "WFLYEE0073: Aucune instance de composant associée";
    }
    @Override
    protected String nullBindingName$str() {
        return "WFLYEE0074: Le nom de liaison ne doit pas être null : %1$s";
    }
    @Override
    protected String nullOrEmptyManagedBeanClassName$str() {
        return "WFLYEE0075: Le nom de classe bean géré ne peut pas être null ou vide";
    }
    @Override
    protected String nullOrEmptyResourceReferenceType$str() {
        return "WFLYEE0076: Le type de référence de ressource ne peut pas être null ou vide";
    }
    @Override
    protected String nullResourceReference$str() {
        return "WFLYEE0077: Impossible d'enregistrer un processeur de références de ressources";
    }
    @Override
    protected String nullVar1$str() {
        return "WFLYEE0078: %1$s est nul";
    }
    @Override
    protected String priorityAlreadyExists$str() {
        return "WFLYEE0079: Impossible l'ajouter %1$s, la priorité 0x%2$s a déjà été prise par %3$s";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYEE0082: Service non démarré";
    }
    @Override
    protected String setterMethodOnly$str() {
        return "WFLYEE0083: La cible d'injection %1$s n'est pas valide. Les méthodes setter uniquement sont autorisées: %2$s";
    }
    @Override
    protected String unknownAnnotationTargetType$str() {
        return "WFLYEE0084: Type AnnotationTarget inconnu : %1$s";
    }
    @Override
    protected String unknownElementType$str() {
        return "WFLYEE0085: %1$stype inconnu %2$s";
    }
    @Override
    protected String viewMethodNotFound$str() {
        return "WFLYEE0086: Impossible de trouver la méthode %1$s %2$s sur la vue %3$s de %4$s";
    }
    @Override
    protected String unexpectedElement$str() {
        return "WFLYEE0088: Élément '%1$s' non attendu rencontré";
    }
    @Override
    protected String failedToProcessEJBClientDescriptor$str() {
        return "WFLYEE0089: N'a pas pu traiter jboss-ejb-client.xml";
    }
    @Override
    protected String xmlErrorParsingEJBClientDescriptor$str() {
        return "WFLYEE0090: Exception lors du traitement du fichier jboss-ejb-client.xml trouvé dans %1$s";
    }
    @Override
    protected String errorParsingEJBClientDescriptor$str() {
        return "WFLYEE0091: %1$s";
    }
    @Override
    protected String noMessageDestination$str() {
        return "WFLYEE0092: Aucune destination de message ayant pour nom %1$s pour lier %2$s";
    }
    @Override
    protected String moreThanOneMessageDestination$str() {
        return "WFLYEE0093: Il existe plus d'une destination de message ayant pour nom %1$s pour lier les destinations %2$s : %3$s";
    }
    @Override
    protected String failedToLoadJbossProperties$str() {
        return "WFLYEE0094: N'a pas pu charger les jboss.properties";
    }
    @Override
    protected String unsupportedModuleType$str() {
        return "WFLYEE0095: Type de module non pris en charge : %1$s";
    }
    @Override
    protected String rootAsLibraryDirectory$str() {
        return "WFLYEE0096: Le répertoire-bibliothèque de valeur / n'est pas pris en charge";
    }
    @Override
    protected String earModuleChildOfLibraryDirectory$str() {
        return "WFLYEE0097: Le module est sans doute un dépendant du répertoire de bibliothèque de l'EAR. Répertoire de bibliothèque: %1$s, nom du fichier de module: %2$s";
    }
    @Override
    protected String managedReferenceWasNull$str() {
        return "WFLYEE0098: ManagedReference était null et l'injection n'est pas optionnelle pour le champ %1$s";
    }
    @Override
    protected String propertiesNotAllowedOnGlobalModules$str() {
        return "WFLYEE0100: Les modules globaux risquent de ne pas spécifier les 'annotations', 'meta-inf' ou 'services'.";
    }
    @Override
    protected String concurrentServiceValueUninitialized$str() {
        return "WFLYEE0102: Valeur du service concurrent EE désinitialisée.";
    }
    @Override
    protected String serializationMustBeHandledByTheFactory$str() {
        return "WFLYEE0103: La sérialisation du gestionnaire de contexte concurrent EE doit être gérée par la fabrique.";
    }
    @Override
    protected String factoryAlreadyExists$str() {
        return "WFLYEE0104: Le contexte concurrent EE %1$s doit déjà posséder un nom de fabrique %2$s";
    }
    @Override
    protected String factoryNotFound$str() {
        return "WFLYEE0105: Le contexte concurrent EE %1$s n'a pas encore de nom de fabrique %2$s";
    }
    @Override
    protected String concurrentContextServiceNotInstalled$str() {
        return "WFLYEE0106: Le contexte concurrent EE %1$s n'est pas installé.";
    }
    @Override
    protected String transactionSetupProviderServiceNotInstalled$str() {
        return "WFLYEE0107: Service de fournisseur d'installation de transaction concurrente EE non installé.";
    }
    @Override
    protected String instanceDataCanOnlyBeSetDuringConstruction$str() {
        return "WFLYEE0108: Les données d'instances ne peuvent être définies que lors de la construction";
    }
    @Override
    protected String aroundInvokeAnnotationUsedTooManyTimes$str() {
        return "WFLYEE0109: Une classe ne doit pas déclarer plus d'une méthode AroundInvoke. %1$s a %2$s méthodes annotées.";
    }
    @Override
    protected String failedToRunTask$str() {
        return "WFLYEE0110: Échec de l'exécution de la tâche planifiée : %1$s";
    }
    @Override
    protected String cannotRunScheduledTask$str() {
        return "WFLYEE0111: N'a pas pu exécuter la tâche %1$s programmée car le conteneur est en attente";
    }
    @Override
    protected String invalidCoreThreadsSize$str() {
        return "WFLYEE0112: La valeur des core-threads doit être supérieure à 0 quand la longueur de la file d'attente est %1$s";
    }
    @Override
    protected String invalidMaxThreads$str() {
        return "WFLYEE0113: La valeur maximum des threads %1$d doit être inférieure à la valeur %2$d des core-threads.";
    }
    @Override
    protected String classDoesNotImplementAllInterfaces$str() {
        return "WFLYEE0114: La classe n'implémente pas toutes les interfaces fournies";
    }
    @Override
    protected String nullName$str() {
        return "WFLYEE0115: Le nom de %1$s est nul";
    }
    @Override
    protected String nullVar3$str() {
        return "WFLYEE0116: %1$s est nul dans les %2$s %3$s";
    }
    @Override
    protected String cannotSetField$str() {
        return "WFLYEE0117: Le champ %1$s ne peut pas être défini - l'objet %2$s chargé par %3$s n'est pas assignable aux %4$s chargés par %5$s";
    }
    @Override
    protected String executorServiceNotFound$str() {
        return "WFLYEE0120: Impossible de trouver le service executor '%1$s'";
    }
    @Override
    protected String unsupportedExecutorServiceMetric$str() {
        return "WFLYEE0121: Attribut non pris en charge '%1$s'";
    }
    @Override
    protected String globalDirectoryDoNotExist$str() {
        return "WFLYEE0122: Le chemin du répertoire %1$s dans la ressource global-directory %2$s ne pointe pas vers un répertoire valide.";
    }
    @Override
    protected String oneGlobalDirectory$str() {
        return "WFLYEE0123: Le répertoire global %1$s ne peut pas être ajouté, car le répertoire global %2$s est déjà défini.";
    }
    @Override
    protected String errorDeletingJACCPolicy$str() {
        return "WFLYEE0124: Erreur de suppression de la politique d'autorisation de Jakarta";
    }
    @Override
    protected String unableToStartException$str() {
        return "WFLYEE0125: Impossible de démarrer le service %1$s";
    }
    @Override
    protected String rejectedDueToMaxRequests$str() {
        return "WFLYEE0126: Rejeté en raison du nombre maximum de demandes";
    }
    @Override
    protected String invalidNamePrefix$str() {
        return "WFLYEE0127: Segment de nom '%1$s' non valide pour env, le nom ne peut pas commencer par le préfixe '/', le préfixe a été supprimé";
    }
    @Override
    protected String huntTaskTerminationFailure$str() {
        return "WFLYEE0128: Échec lors de la fin de %1$s tâche suspendue %2$s";
    }
    @Override
    protected String hungTaskCancelled$str() {
        return "WFLYEE0129: %1$s tâche suspendue %2$s annulée";
    }
    @Override
    protected String hungTaskNotCancelled$str() {
        return "WFLYEE0130: %1$s tâche suspendue %2$s non annulée";
    }
    @Override
    protected String attributeNoLongerSupported$str() {
        return "WFLYEE0131: L'attribut %1$s n'est plus pris en charge.";
    }
    @Override
    protected String managedReferenceMethodWasNull$str() {
        return "WFLYEE0132: ManagedReference était nulle et l'injection n'est pas facultative pour l'injection dans la méthode %1$s";
    }
    @Override
    protected String duplicateJndiBindingFound$str() {
        return "WFLYEE0133: Une liaison JNDI pour le composant '%1$s' a déjà été installée sous le nom JNDI '%2$s' conformément aux spécifications de Jakarta EE. La classe en conflit est %3$s. Les solutions consistent à fournir un autre nom pour le composant ou à renommer la classe.";
    }
    @Override
    protected String multipleUsesOfAllRemaining$str() {
        return "WFLYEE0134: Utilisations multiples de ContextServiceDefinition.ALL_REMAINING";
    }
    @Override
    protected String failedToResumeTransaction$str() {
        return "WFLYEE0135: Échec de la reprise de la transaction.";
    }
    @Override
    protected String failureWhileRunningTask$str() {
        return "WFLYEE0136: Échec de l'exécution de la tâche planifiée : %1$s";
    }
    @Override
    protected String errorEqualsCannotBeCalledBeforeResolve$str() {
        return "WFLYEE0137: L'erreur equals() ne peut pas être appelée avant resolve()";
    }
    @Override
    protected String hungTaskTerminationPeriodIsNotBiggerThanZero$str() {
        return "WFLYEE0138: hungTaskTerminationPeriod n'est pas > 0";
    }
    @Override
    protected String cannotAddRemotingReceiver$str() {
        return "WFLYEE0139: Impossible d'ajouter un récepteur distant qui fait référence à une connexion sortante nulle/vide";
    }
    @Override
    protected String cannotAddHTTPConnection$str() {
        return "WFLYEE0140: Impossible d'ajouter une connexion HTTP qui fait référence à une URI nulle/vide";
    }
    @Override
    protected String securityManagerNotAllowed$str() {
        return "WFLYEE0141: L'exécution avec un SecurityManager activé n'est pas autorisée dans un environnement Jakarta EE 11 ou version ultérieure";
    }
    @Override
    protected String failedToLoadConcurrencyImplementation$str() {
        return "WFLYEE0142: Échec du chargement de l'implémentation de Jakarta Concurrency";
    }
    @Override
    protected String lifecycleOperationNotSupported$str() {
        return "WFLYEE0143: Opération de cycle de vie non prise en charge";
    }
}
