package org.jboss.as.repository.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:21+0200")
public class DeploymentRepositoryLogger_$logger_fr extends DeploymentRepositoryLogger_$logger implements DeploymentRepositoryLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DeploymentRepositoryLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String contentAdded$str() {
        return "WFLYDR0001: Contenu ajouté dans location %1$s";
    }
    @Override
    protected String contentRemoved$str() {
        return "WFLYDR0002: Contenu supprimé de la location %1$s";
    }
    @Override
    protected String cannotDeleteTempFile$str() {
        return "WFLYDR0003: Impossible de supprimer le fichier temp %1$s, sera supprimé à la sortie";
    }
    @Override
    protected String cannotCreateDirectory$str() {
        return "WFLYDR0004: N'a pas pu créer le répertoire %1$s";
    }
    @Override
    protected String cannotObtainSha1$str() {
        return "WFLYDR0005: N'a pas pu obtenir SHA-1 %1$s";
    }
    @Override
    protected String directoryNotWritable$str() {
        return "WFLYDR0006: On ne peut pas écrire sur le répertoire %1$s";
    }
    @Override
    protected String notADirectory$str() {
        return "WFLYDR0007: %1$s n'est pas un répertoire";
    }
    @Override
    protected String obsoleteContentCleaned$str() {
        return "WFLYDR0009: Le contenu %1$s est obsolète et va être supprimé";
    }
    @Override
    protected String contentDeletionError$str() {
        return "WFLYDR0010: Impossible de supprimer le contenu %1$s";
    }
    @Override
    protected String localContentListError$str() {
        return "WFLYDR0011: Impossible d'afficher les fichiers de répertoire pour %1$s";
    }
    @Override
    protected String hashingError$str() {
        return "WFLYDR0012: Impossible de hacher le contenu du déploiement en cours %1$s";
    }
    @Override
    protected String forbiddenPath$str() {
        return "WFLYDR0013: Accès non autorisé au contenu de %1$s du déploiement";
    }
    @Override
    protected String couldNotDeleteDeployment$str() {
        return "WFLYDR0014: Erreur lors de la suppression du déploiement %1$s";
    }
    @Override
    protected String notAnArchive$str() {
        return "WFLYDR0015: %1$s n'est pas un fichier d'archivage";
    }
    @Override
    protected String archiveNotFound$str() {
        return "WFLYDR0016: Le fichier d'archivage %1$s n'a pas pu être trouvé";
    }
    @Override
    protected String contentExploded$str() {
        return "WFLYDR0017: Contenu sous forme éclatée de la location %1$s";
    }
    @Override
    protected String errorExplodingContent$str() {
        return "WFLYDR0018: Erreur lors de l'éclatement du contenu de %1$s";
    }
    @Override
    protected String errorLockingDeployment$str() {
        return "WFLYDR0019: Le déploiement est verrouillé par une autre opération";
    }
    @Override
    protected String errorAccessingDeployment$str() {
        return "WFLYDR0020: Erreur lors de l'accès aux fichiers de déploiement";
    }
    @Override
    protected String errorUpdatingDeployment$str() {
        return "WFLYDR0021: Erreur lors de la mise à jour du contenu du déploiement sous forme éclatée";
    }
    @Override
    protected String errorCopyingDeployment$str() {
        return "WFLYDR0022: Erreur lors de la copie de fichiers du déploiement sous forme éclatée vers %1$s";
    }
    @Override
    protected String cannotDeleteFile$str() {
        return "WFLYDR0023: Erreur de suppression du fichier %1$s";
    }
    @Override
    protected String cannotCopyFile$str() {
        return "WFLYDR0024: Erreur lors de la copie du fichier %1$s";
    }
}
