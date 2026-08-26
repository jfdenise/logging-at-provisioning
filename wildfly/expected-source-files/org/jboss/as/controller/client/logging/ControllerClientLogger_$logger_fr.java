package org.jboss.as.controller.client.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:01+0200")
public class ControllerClientLogger_$logger_fr extends ControllerClientLogger_$logger implements ControllerClientLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ControllerClientLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotAddDeploymentAction$str() {
        return "WFLYCC0001: Impossible d'ajouter des actions de déploiement après le début de la création d'un plan de déploiement";
    }
    @Override
    protected String cannotAddDeploymentActionsAfterStart$str() {
        return "WFLYCC0002: Impossible d'ajouter des actions de déploiement après le début de la création d'un plan de déploiement";
    }
    @Override
    protected String cannotConvert$str() {
        return "WFLYCC0003: Impossible de convertir %1$s en %2$s";
    }
    @Override
    protected String cannotDeriveDeploymentName$str() {
        return "WFLYCC0004: Impossible de déduire un nom de déploiement à partir de %1$s -- utiliser une variante de méthode surchargée qui accepte le paramètre 'nom'";
    }
    @Override
    protected String cannotUseDeploymentPlan$str() {
        return "WFLYCC0005: Impossible d'utiliser un Plan de déploiement qui n'a pas été créé par ce gestionnaire";
    }
    @Override
    protected String domainDeploymentAlreadyExists$str() {
        return "WFLYCC0007: Déploiement ayant pour nom %1$s déjà présent dans le domaine";
    }
    @Override
    protected String failed$str() {
        return "WFLYCC0008: échec";
    }
    @Override
    protected String globalRollbackNotCompatible$str() {
        return "WFLYCC0009: globalRollback non compatible avec un nouveau démarrage du serveur";
    }
    @Override
    protected String gracefulShutdownAlreadyConfigured$str() {
        return "WFLYCC0010: Fermeture en bonne et due forme déjà configurée avec un délai de %1$d ms";
    }
    @Override
    protected String incompleteDeploymentReplace$str() {
        return "WFLYCC0011: Il ne peut exister qu'une seule version de déploiement avec un nom unique donné dans le domaine. Le plan de déploiement a indiqué qu'une nouvelle version de déploiement %1$s remplace un déploiement existant ayant le même nom unique, mais n'applique pas le remplacement à tous les groupes de serveurs. Les groupes de serveurs manquants étaient les suivants : %2$s";
    }
    @Override
    protected String invalidActionType$str() {
        return "WFLYCC0012: Type d'action non valide %1$s";
    }
    @Override
    protected String invalidPrecedingAction$str() {
        return "WFLYCC0013: L'action précédente n'était pas un %1$s";
    }
    @Override
    protected String invalidUri$str() {
        return "WFLYCC0014: %1$s n'est pas un URI valide";
    }
    @Override
    protected String invalidValue3$str() {
        return "WFLYCC0015: Valeur %1$s illégale %2$d -- doit être supérieure à %3$d";
    }
    @Override
    protected String invalidValue4$str() {
        return "WFLYCC0016: Valeur %1$s illégale %2$d -- doit être supérieure à %3$d et inférieure à %4$d";
    }
    @Override
    protected String maxDisplayUnitLength$str() {
        return "WFLYCC0017: L'écran immobilier est coûteux; les unités d'affichage doivent avoir 5 caractères de long maximum";
    }
    @Override
    protected String noFailureDetails$str() {
        return "WFLYCC0019: Aucune information fournie à propos des échecs";
    }
    @Override
    protected String notConfigured$str() {
        return "WFLYCC0020: Aucun %1$s configuré";
    }
    @Override
    protected String objectIsClosed$str() {
        return "WFLYCC0022: %1$s est fermé";
    }
    @Override
    protected String operationOutcome$str() {
        return "WFLYCC0023: Le résultat de l'opération est %1$s";
    }
    @Override
    protected String operationsNotAllowed$str() {
        return "WFLYCC0024: Les opérations %1$s ne sont pas permises suite à des modifications de contenu ou de déploiement";
    }
    @Override
    protected String rollbackCancelled$str() {
        return "WFLYCC0025: Rollback annulé";
    }
    @Override
    protected String rollbackRolledBack$str() {
        return "WFLYCC0026: Le rollback a lui même été annulé";
    }
    @Override
    protected String rollbackTimedOut$str() {
        return "WFLYCC0027: Expiration du délai de rollback";
    }
    @Override
    protected String serverDeploymentAlreadyExists$str() {
        return "WFLYCC0028: Le déploiement ayant pour nom %1$s est déjà présent dans le serveur";
    }
    @Override
    protected String unknownActionType$str() {
        return "WFLYCC0029: Type d'action %1$s inconnu";
    }
    @Override
    protected String controllerClientNotClosed$str() {
        return "WFLYCC0030: Allocation du Suivi de la pile :";
    }
    @Override
    protected String noFailureDescription$str() {
        return "WFLYCC0031: Pas de description d'échec car l'opération a réussi.";
    }
    @Override
    protected String operationNameNotFound$str() {
        return "WFLYCC0032: Le nom de l'opération n'a pas été défini.";
    }
    @Override
    protected String invalidAddressType$str() {
        return "WFLYCC0033: L'adresse doit être du type ModelType.LIST.";
    }
    @Override
    protected String leakedControllerClient$str() {
        return "WFLYCC0034: Fermeture du client contrôleur qui a fui";
    }
    @Override
    protected String cannotDeleteTempFile$str() {
        return "WFLYCC0035: Impossible de supprimer le fichier temp %1$s, sera supprimé à la sortie";
    }
    @Override
    protected String streamWasClosed$str() {
        return "WFLYCC0036: Stream était fermé";
    }
    @Override
    protected String failedToParseAuthenticationConfig$str() {
        return "WFLYCC0037: Échec de l'analyse du fichier de configuration : %1$s";
    }
}
