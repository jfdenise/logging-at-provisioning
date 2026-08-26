package org.wildfly.extension.batch.jberet._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:01+0200")
public class BatchLogger_$logger_de extends BatchLogger_$logger implements BatchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BatchLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String restartingJob$str() {
        return "WFLYBATCH000017: Zuvor gestoppter Batch-Job %1$s wird neu gestartet. Vorherige Ausführungs-ID %2$d. Neue Ausführungs-ID %3$d.";
    }
    @Override
    protected String failedToCreateJobRepository$str() {
        return "WFLYBATCH000011: Fehler beim Erstellen von %1$s Job-Repository.";
    }
    @Override
    protected String invalidJobXmlFile$str() {
        return "WFLYBATCH000007: Fehler bei der Verarbeitung der Job-XML-Datei %1$s. Ein Versuch, diesen Job auszuführen, könnte Fehler verursachen.";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYBATCH000009: Indexierte Unterressourcen können nur registriert werden, wenn die übergeordnete Ressource geordnete Unterelemente unterstützt. Das übergeordnete Element von '%1$s' ist nicht indexiert";
    }
    @Override
    protected String duplicateVirtualFile$str() {
        return "WFLYBATCH000021: Virtuelle Datei %1$s duplizieren.";
    }
    @Override
    protected String jobOperatorServiceStopped$str() {
        return "WFLYBATCH000004: Der Dienst JobOperatorService wurde gestoppt und konnte keine Operationen ausführen.";
    }
    @Override
    protected String stoppingJobFailed$str() {
        return "WFLYBATCH000015: Fehler beim Stoppen von Ausführung %1$d für Job %2$s auf Deployment %3$s";
    }
    @Override
    protected String emptyJobRepositoryElement$str() {
        return "WFLYBATCH000008: Leeres job-repository-Element im Deployment-Deskriptor gefunden. Standardmäßiges Job-Repository wird verwendet für Deployment %1$s.";
    }
    @Override
    protected String multipleJobRepositoriesFound$str() {
        return "WFLYBATCH000013: Nur ein Job-Repository kann im jboss-all.xml Deployment-Deskriptor definiert werden. Das erste Job-Repository wird verwendet.";
    }
    @Override
    protected String noBatchEnvironmentFound$str() {
        return "WFLYBATCH000019: Keine Batch-Umgebung für Klassenlader gefunden: %1$s";
    }
    @Override
    protected String stoppingJob$str() {
        return "WFLYBATCH000014: Ausführung %1$d von %2$s für Deployment %3$s wird gestoppt";
    }
    @Override
    protected String cannotRemoveResourceOfType$str() {
        return "WFLYBATCH000002: Ressourcen vom Typ %1$s können nicht entfernt werden";
    }
    @Override
    protected String couldNotFindJobXml$str() {
        return "WFLYBATCH000006: Konnte die Job-XML-Datei im Deployment nicht finden: %1$s";
    }
    @Override
    protected String unauthorized$str() {
        return "WFLYBATCH000020: Berechtigung abgelehnt. Benutzer %1$s hat keine %2$s-Berechtigungen.";
    }
    @Override
    protected String failedRestartingJob$str() {
        return "WFLYBATCH000016: Fehler beim Neustarten von Ausführung %1$d für Job %2$s auf Deployment %3$s";
    }
    @Override
    protected String errorProcessingBatchJobsDir$str() {
        return "WFLYBATCH000001: Fehler beim Verarbeiten vom META-INF/batch-jobs Verzeichnis.";
    }
    @Override
    protected String couldNotFindDeploymentName$str() {
        return "WFLYBATCH000003: Konnte Deployment-Name nicht finden: %1$s";
    }
    @Override
    protected String noSuchJobException$str() {
        return "WFLYBATCH000005: Der Jobname \"%1$s\" wurde für das Deployment nicht gefunden.";
    }
}
