package org.jboss.as.repository.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:21+0200")
public class DeploymentRepositoryLogger_$logger_de extends DeploymentRepositoryLogger_$logger implements DeploymentRepositoryLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DeploymentRepositoryLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String contentAdded$str() {
        return "WFLYDR0001: Inhalt in Speicherort %1$s hinzugefügt";
    }
    @Override
    protected String contentRemoved$str() {
        return "WFLYDR0002: Inhalt aus Speicherort %1$s entfernt";
    }
    @Override
    protected String cannotDeleteTempFile$str() {
        return "WFLYDR0003: Kann temp-Datei %1$s nicht löschen, wird beim Beenden gelöscht";
    }
    @Override
    protected String cannotCreateDirectory$str() {
        return "WFLYDR0004: Kann Verzeichnis %1$s nicht erstellen";
    }
    @Override
    protected String cannotObtainSha1$str() {
        return "WFLYDR0005: Kann SHA-1 %1$s nicht erhalten";
    }
    @Override
    protected String directoryNotWritable$str() {
        return "WFLYDR0006: Kann nicht in Verzeichnis %1$s schreiben";
    }
    @Override
    protected String notADirectory$str() {
        return "WFLYDR0007: %1$s ist kein Verzeichnis";
    }
    @Override
    protected String obsoleteContentCleaned$str() {
        return "WFLYDR0009: Inhalt %1$s ist obsolet und wird entfernt";
    }
    @Override
    protected String contentDeletionError$str() {
        return "WFLYDR0010: Inhalt %1$s konnte nicht gelöscht werden";
    }
    @Override
    protected String localContentListError$str() {
        return "WFLYDR0011: Verzeichnisdateien für %1$s konnten nicht aufgelistet werden";
    }
    @Override
    protected String hashingError$str() {
        return "WFLYDR0012: Anwenden von Hash auf aktuellen Deployment-Inhalt %1$s fehlgeschlagen";
    }
    @Override
    protected String forbiddenPath$str() {
        return "WFLYDR0013: Zugriff verweigert auf die Inhalte unter %1$s im Deployment";
    }
    @Override
    protected String couldNotDeleteDeployment$str() {
        return "WFLYDR0014: Fehler beim Löschen von Deployment %1$s";
    }
    @Override
    protected String notAnArchive$str() {
        return "WFLYDR0015: %1$s ist keine Archivdatei";
    }
    @Override
    protected String archiveNotFound$str() {
        return "WFLYDR0016: Archivdatei %1$s nicht gefunden";
    }
    @Override
    protected String contentExploded$str() {
        return "WFLYDR0017: Inhalt entpackt im Speicherort %1$s";
    }
    @Override
    protected String errorExplodingContent$str() {
        return "WFLYDR0018: Fehler beim Entpacken von Inhalten für %1$s";
    }
    @Override
    protected String errorLockingDeployment$str() {
        return "WFLYDR0019: Deployment ist gesperrt von einer anderen Operation";
    }
    @Override
    protected String errorAccessingDeployment$str() {
        return "WFLYDR0020: Fehler beim Zugriff auf Deployment-Dateien";
    }
    @Override
    protected String errorUpdatingDeployment$str() {
        return "WFLYDR0021: Fehler beim Aktualisieren der Inhalte des entpackten Deployments";
    }
    @Override
    protected String errorCopyingDeployment$str() {
        return "WFLYDR0022: Fehler beim Kopieren von Dateien des entpackten Deployments nach %1$s";
    }
    @Override
    protected String cannotDeleteFile$str() {
        return "WFLYDR0023: Fehler beim Löschen von Datei %1$s";
    }
    @Override
    protected String cannotCopyFile$str() {
        return "WFLYDR0024: Fehler beim Kopieren von Datei %1$s";
    }
}
