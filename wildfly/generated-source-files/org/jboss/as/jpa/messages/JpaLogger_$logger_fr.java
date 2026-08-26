package org.jboss.as.jpa.messages;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:25+0200")
public class JpaLogger_$logger_fr extends JpaLogger_$logger implements JpaLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JpaLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String relativePathNotFound$str() {
        return "WFLYJPA0058: Chemin relatif non trouvé : %1$s";
    }
    @Override
    protected String cannotCloseTransactionContainerEntityManger$str() {
        return "WFLYJPA0017: Le gestionnaire d'entités géré par le conteneur peut uniquement être fermé par le conteneur (auto-nettoyé à tx/invocation et fermé lorsque le composant propriétaire est fermé).";
    }
    @Override
    protected String badSynchronizationTypeCombination$str() {
        return "WFLYJPA0064: La transaction Jakarta Transactions possède déjà un contexte de persistance « SynchronizationType.UNSYNCHRONIZED » (EntityManager) qui vient s’y joindre, mais un composant avec « SynchronizationType.SYNCHRONIZED » est maintenant utilisé. Changer le code du composant appelant pour rejoindre le contexte de persistance (EntityManager) à la transaction ou modifier le code du composant appelé pour utiliser aussi « SynchronizationType.UNSYNCHRONIZED ». Voir la section Spécifications 2.1 de JPA 7.6.4.1. Nom de l'unité de persistance scoped = %1$s.";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYJPA0040: N'a pas pu traiter %1$s";
    }
    @Override
    protected String cannotUseExtendedPersistenceTransaction$str() {
        return "WFLYJPA0030: Contexte de persistance étendu trouvé dans la pile d'appels d'invocations SFSB, mais ne peut pas être utilisé car la transaction a déjà un contexte transactionnel qui lui est associé. Cela peut être évité si on change le code d'application, soit en éliminant le contexte de persistance étendu, soit le contexte transactionnel. Voir JPA spec 2.0 section 7.6.3.1. Le nom d'unité de persistance scoped=%1$s, contexte de persistance déjà en transaction=%2$s, contexte de persistance étendue = %3$s.";
    }
    @Override
    protected String persistenceProviderNotFound$str() {
        return "WFLYJPA0057: PersistenceProvider '%1$s' non trouvé";
    }
    @Override
    protected String invalidPersistenceUnitName$str() {
        return "WFLYJPA0043: Le nom de l'unité de persistance (%1$s) contient un caractère '%2$s' illégal";
    }
    @Override
    protected String noPUnitNameSpecifiedAndMultiplePersistenceUnits$str() {
        return "WFLYJPA0061: Le nom d'unité (unitName) n'a pas été spécifié et il y a %1$d définitions d'unités de persistances dans l'application de déploiement %2$s. Il vous suffira soit de modifier l'application de déploiement pour obtenir une définition d'unité de persistance, ou bien de spécifier le nom d'unité (unitName) pour chaque référence d'unité de persistance.";
    }
    @Override
    protected String unexpectedStatisticsProblem$str() {
        return "WFLYJPA0012: Problème inattendu lors de la collecte des statistiques";
    }
    @Override
    protected String cannotGetSessionFactory$str() {
        return "WFLYJPA0020: N'a pas pu obtenir de fabrique de session de la part du gestionnaire d'entités";
    }
    @Override
    protected String illegalCallOnCloseMethod$str() {
        return "WFLYJPA0075: Il est illégal d'appeler cette méthode à partir d'un EntityManager injecté et géré";
    }
    @Override
    protected String differentSearchModuleDependencies$str() {
        return "WFLYJPA0071: Le déploiement '%1$s' spécifiait plus d'un nom de module d'Hibernate Search ('%2$s','%3$s')";
    }
    @Override
    protected String duplicatePersistenceUnitDefinition$str() {
        return "WFLYJPA0001: Définition de l'unité de persistance en double pour %1$s dans l'application. Une des persistence.xml doit être retirée de l'application. Le déploiement de l'application se poursuivra dans les définitions persistence.xml du %2$s utilisé. Les définitions de persistence.xml de %3$s seront ignorées.";
    }
    @Override
    protected String setterMethodOnlyAnnotation$str() {
        return "WFLYJPA0059: La cible d'injection %1$s n'est pas valide. Les méthodes setter uniquement sont autorisées: %2$s";
    }
    @Override
    protected String failedToStopPUService$str() {
        return "WFLYJPA0007: N'a pas pu ajouter le service d'unité de persistance pour %1$s";
    }
    @Override
    protected String failedToAddPersistenceUnit$str() {
        return "WFLYJPA0038: N'a pas pu ajouter le service d'unité de persistance pour %1$s";
    }
    @Override
    protected String transactionRequired$str() {
        return "WFLYJPA0060: La transaction doit effectuer cette opération (soit en utilisant une transaction, soit un contexte de persistance étendu)";
    }
    @Override
    protected String resourcesOfTypeCannotBeRegistered$str() {
        return "WFLYJPA0065: Les ressources de type %1$s ne peuvent pas être enregistrées";
    }
    @Override
    protected String stoppingService$str() {
        return "WFLYJPA0004: Arrêt du service %1$s '%2$s'";
    }
    @Override
    protected String cannotCreateAdapter$str() {
        return "WFLYJPA0018: N'a pas pu créer d'instance de classe d'adaptateur '%1$s'";
    }
    @Override
    protected String readingPersistenceXml$str() {
        return "WFLYJPA0002: Lecture de persistence.xml de %1$s";
    }
    @Override
    protected String errorGettingTransaction$str() {
        return "WFLYJPA0036: Une erreur a eu lieu lors de l'obtention de la transaction associée au thread en cours : %1$s";
    }
    @Override
    protected String cannotDeployApp$str() {
        return "WFLYJPA0019: N'a pas pu déployer le fournisseur de persistance du paquetage de l'application '%1$s'";
    }
    @Override
    protected String failedToGetAdapter$str() {
        return "WFLYJPA0037: N'a pas pu obtenir l'adaptateur pour le fournisseur de persistance '%1$s'";
    }
    @Override
    protected String startingPersistenceUnitService$str() {
        return "WFLYJPA0010: Démarrage de l'unité de persistance (phase %1$d de 2) Service '%2$s'";
    }
    @Override
    protected String cannotLoadPersistenceProviderIntegratorModule$str() {
        return "WFLYJPA0074: Erreur de chargement du module intégrateur du fournisseur de persistance pour %1$s";
    }
    @Override
    protected String invalidScopedName$str() {
        return "WFLYJPA0044: jboss.as.jpa.scopedname hint (%1$s) contient un caractère illégal '%2$s'";
    }
    @Override
    protected String persistenceProviderAdaptorModuleLoadError$str() {
        return "WFLYJPA0069: Erreur de chargement du module de l'adaptateur du fournisseur de persistances %1$s";
    }
    @Override
    protected String classloaderHasMultipleAdapters$str() {
        return "WFLYJPA0067: Le chargeur de classe '%1$s' possède plus d'un adaptateur de fournisseur de persistances";
    }
    @Override
    protected String couldNotCreateInstanceProvider$str() {
        return "WFLYJPA0062: N'a pas pu créer une instance de classe de fournisseur de persistance %1$s";
    }
    @Override
    protected String cannotInjectResourceLocalEntityManager$str() {
        return "WFLYJPA0021: Impossible d'injecter RESOURCE_LOCAL Container Managed EntityManagers par @PersistenceContext";
    }
    @Override
    protected String xpcOnlyFromSFSB$str() {
        return "WFLYJPA0070: Un contexte de persistance étendu géré-conteneur peut uniquement être initié dans le cadre d'un bean de session stateful (unité de persistance '%1$s').";
    }
    @Override
    protected String cannotLoadFromJpa$str() {
        return "WFLYJPA0025: Impossible de charger %1$s du chargeur de classe des modules Jakarta Persistence";
    }
    @Override
    protected String cannotLoadPersistenceProviderModule$str() {
        return "WFLYJPA0027: Erreur de chargement du module du fournisseur de persistances %1$s (classe %2$s)";
    }
    @Override
    protected String persistenceUnitNotFound2$str() {
        return "WFLYJPA0033: Impossible de trouver une unité de persistance nommée %1$s dans %2$s";
    }
    @Override
    protected String multipleAdapters$str() {
        return "WFLYJPA0048: Le module de l'adaptateur du fournisseur de persistance (%1$s) a plus d'un adaptateur";
    }
    @Override
    protected String startingService$str() {
        return "WFLYJPA0003: Démarrage du service %1$s '%2$s'";
    }
    @Override
    protected String classLevelAnnotationParameterRequired$str() {
        return "WFLYJPA0032: Les annotations de niveau de classe %1$s de la classe %2$s doivent fournir un %3$s";
    }
    @Override
    protected String errorPreloadingDefaultProvider$str() {
        return "WFLYJPA0006: N'a pas pu charger le module du fournisseur de persistance par défaut.  ";
    }
    @Override
    protected String stoppingPersistenceUnitService$str() {
        return "WFLYJPA0011: Arrêt de l'unité de persistance (phase %1$d de 2) Service '%2$s'";
    }
    @Override
    protected String cannotCloseContainerManagedEntityManager$str() {
        return "WFLYJPA0015: Le gestionnaire d'entités géré par le conteneur ne peut être fermé que par le conteneur (aura lieu si la méthode @remove est invoquée sur le SFSB contenant)";
    }
    @Override
    protected String resourcesOfTypeCannotBeRemoved$str() {
        return "WFLYJPA0066: Les ressources de type %1$s ne peuvent pas être supprimées";
    }
    @Override
    protected String persistenceUnitNotFound3$str() {
        return "WFLYJPA0034: Impossible de trouver une unité de persistance nommée %1$s#%2$s à %3$s";
    }
    @Override
    protected String referenceCountedEntityManagerNegativeCount$str() {
        return "WFLYJPA0063: erreur interne, le nombre de stateful session beans (%1$d) associé au contexte de persistance étendu (%2$s) ne peut pas correspondre à un nombre négatif.";
    }
    @Override
    protected String invalidClassFormat$str() {
        return "WFLYJPA0073: Réécriture (transformation) du bytecode de la classe%1$s échoué";
    }
    @Override
    protected String nullParameter$str() {
        return "WFLYJPA0053: Erreur %1$s interne, %2$s null passé";
    }
    @Override
    protected String cannotSpecifyBoth$str() {
        return "WFLYJPA0029: Impossible de spécifier %1$s (%2$s) et %3$s (%4$s) dans %5$s pour %6$s";
    }
    @Override
    protected String childNotFound$str() {
        return "WFLYJPA0031: N'a pas pu trouver l'enfant '%1$s' sur '%2$s'";
    }
}
