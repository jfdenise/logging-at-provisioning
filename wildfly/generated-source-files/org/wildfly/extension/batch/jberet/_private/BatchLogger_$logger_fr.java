package org.wildfly.extension.batch.jberet._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:01+0200")
public class BatchLogger_$logger_fr extends BatchLogger_$logger implements BatchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BatchLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String restartingJob$str() {
        return "WFLYBATCH000017: Redémarrage de la tâche précédemment arrêtée %1$s. ID de l'exécution précédente %2$d. Nouvel ID d'exécution %3$d.";
    }
    @Override
    protected String failedToCreateJobRepository$str() {
        return "WFLYBATCH000011: Échec lors de la création du référentiel de tâches %1$s.";
    }
    @Override
    protected String invalidJobXmlFile$str() {
        return "WFLYBATCH000007: Échec du traitement du fichier XML de la tâche %1$s. Tenter d'exécuter cette tâche pourrait provoquer des erreurs.";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYBATCH000009: Les ressources enfants indexées peuvent uniquement être enregistrées si la ressource parent prend en charge les enfants ordonnés. Le parent de '%1$s' n'est pas indexé";
    }
    @Override
    protected String duplicateVirtualFile$str() {
        return "WFLYBATCH000021: Dupliquer le fichier virtuel %1$s .";
    }
    @Override
    protected String jobOperatorServiceStopped$str() {
        return "WFLYBATCH000004: Le service JobOperatorService a été arrêté et ne peut pas exécuter d'opérations.";
    }
    @Override
    protected String stoppingJobFailed$str() {
        return "WFLYBATCH000015: Échec de l'arrêt de l'exécution %1$d de la tâche %2$s sur le déploiement %3$s";
    }
    @Override
    protected String emptyJobRepositoryElement$str() {
        return "WFLYBATCH000008: Élément référentiel-tâche (« job-repository ») vide trouvé dans le descripteur du déploiement. En utilisant le référentiel de tâches par défaut pour le déploiement %1$s.";
    }
    @Override
    protected String multipleJobRepositoriesFound$str() {
        return "WFLYBATCH000013: Un seul référentiel de tâches peut être défini dans le descripteur de déploiements jboss-all.xml. Le premier référentiel de tâches sera utilisé.";
    }
    @Override
    protected String noBatchEnvironmentFound$str() {
        return "WFLYBATCH000019: Aucun environnement de traitement par lots n'a été trouvé pour le chargeur de classes : %1$s";
    }
    @Override
    protected String stoppingJob$str() {
        return "WFLYBATCH000014: Arrêt de l'exécution %1$d sur %2$s pour le déploiement %3$s";
    }
    @Override
    protected String cannotRemoveResourceOfType$str() {
        return "WFLYBATCH000002: Les ressources de type %1$s ne peuvent pas être supprimées";
    }
    @Override
    protected String couldNotFindJobXml$str() {
        return "WFLYBATCH000006: Impossible de trouver le fichier XML de la tâche dans le déploiement : %1$s";
    }
    @Override
    protected String unauthorized$str() {
        return "WFLYBATCH000020: Permission refusée. L'utilisateur %1$s ne possède pas les permissions %2$s.";
    }
    @Override
    protected String failedRestartingJob$str() {
        return "WFLYBATCH000016: Échec du redémarrage de l'exécution %1$d pour la tâche %2$s sur le déploiement %3$s";
    }
    @Override
    protected String errorProcessingBatchJobsDir$str() {
        return "WFLYBATCH000001: Erreur de traitement du répertoire META-INF/batch-jobs.";
    }
    @Override
    protected String couldNotFindDeploymentName$str() {
        return "WFLYBATCH000003: Le nom du déploiement est introuvable : %1$s";
    }
    @Override
    protected String noSuchJobException$str() {
        return "WFLYBATCH000005: Le nom de la tâche « %1$s » n'a pas été trouvé pour le déploiement.";
    }
}
