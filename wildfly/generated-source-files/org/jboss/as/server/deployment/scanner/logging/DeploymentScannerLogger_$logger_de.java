package org.jboss.as.server.deployment.scanner.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:12+0200")
public class DeploymentScannerLogger_$logger_de extends DeploymentScannerLogger_$logger implements DeploymentScannerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DeploymentScannerLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedCheckingZipFile$str() {
        return "WFLYDS0008: Überprüfung, ob %1$s eine komplette ZIP ist, fehlgeschlagen";
    }
    @Override
    protected String scannerDeploymentRemovedButNotByScanner$str() {
        return "WFLYDS0019: Deployment %1$s wurde zuvor von diesem Scanner bereitgestellt, dann jedoch von einem anderen Management-Tool von der Server-Deployment-Liste entfernt. Statusdatei %2$s wird zur Speicherung dieser Tatsache hinzugefügt.";
    }
    @Override
    protected String previousContentDeployed$str() {
        return "Eine frühere Version dieses Contents wurde deployt und bleibt deployt.";
    }
    @Override
    protected String directoryIsNotWritable$str() {
        return "WFLYDS0039: %1$s ist nicht schreibbar";
    }
    @Override
    protected String failedStatusSynchronization$str() {
        return "WFLYDS0034: Synchronisation des Status von Deployment %1$s fehlgeschlagen.";
    }
    @Override
    protected String bootTimeScanFailed$str() {
        return "WFLYDS0042: Scan beim Hochfahren fehlgeschlagen, da nicht auf Deployment-Verzeichnis zugegriffen werden konnte: %1$s";
    }
    @Override
    protected String scanFailed$str() {
        return "WFLYDS0043: Deployment-Verzeichnis-Scan fehlgeschlagen, da nicht auf Deployment-Verzeichnis zugegriffen werden konnte: %1$s";
    }
    @Override
    protected String cannotRemoveDeploymentMarker$str() {
        return "WFLYDS0002: Kann überzählige Deployment-Statusdatei nicht entfernen %1$s";
    }
    @Override
    protected String cannotDeleteDeploymentProgressMarker$str() {
        return "WFLYDS0001: Kann Deployment-Fortschritts-Statusdatei nicht löschen %1$s";
    }
    @Override
    protected String fileSystemDeploymentFailed$str() {
        return "WFLYDS0009: Dateisystem-Deploymentdienst fehlgeschlagen";
    }
    @Override
    protected String deploymentTriggered$str() {
        return "WFLYDS0004: %1$s in Deployment-Verzeichnis gefunden. Um Deployment zu starten, erstellen Sie eine Datei namens %1$s%2$s";
    }
    @Override
    protected String deploymentContentIncomplete$str() {
        return "WFLYDS0021: Deployment-Inhalt %1$s scheint unvollständig und macht keine Fortschritte hinsichtlich Abschluss. Dieser Inhalt kann nicht automatisch bereitgestellt werden.%2$s";
    }
    @Override
    protected String invalidXmlFileFound$str() {
        return "WFLYDS0035: Scan hat die Datei %1$s gefunden, die Fehler in Zeile %2$s, Spalte %3$s enthält. Entweder wurde die Datei beim Scannen unvollständig kopiert oder sie ist inkorrekt.";
    }
    @Override
    protected String invalidZipFileFormat$str() {
        return "WFLYDS0025: Datei %1$s kann nicht gescannt werden, da sie nicht mit einer lokalen ZIP-Dateiformat-Datei-Headersignatur beginnt";
    }
    @Override
    protected String deploymentScannerNotForDomainMode$str() {
        return "WFLYDS0031: Erweiterung mit Modul 'org.jboss.as.deployment-scanner' kann nicht in einer Managed Domain installiert werden. Bitte entfernen Sie sie sowie eventuelle Untersysteme, die darauf verweisen";
    }
    @Override
    protected String incompleteContent$str() {
        return "WFLYDS0010: Scan hat unvollständig kopierte Dateiinhalte für Deployment %1$s gefunden. Deployment-Änderungen werden erst verarbeitet, wenn alle Inhalte vollständig sind.";
    }
    @Override
    protected String unsafeAutoDeploy2$str() {
        return "WFLYDS0030: Datei %2$s war für auto-deploy konfiguriert, das Auto-Deployment konnte aber nicht auf sichere Weise durchgeführt werden. Der Grund, aus dem das Auto-Deployment der Datei nicht durchgeführt werden konnte, war: %1$s. Um das Deployment dieser Datei zu ermöglichen, erstellen Sie eine Datei namens %2$s%3$s";
    }
    @Override
    protected String directoryIsNotReadable$str() {
        return "WFLYDS0041: %1$s ist nicht lesbar";
    }
    @Override
    protected String failedCheckingXMLFile$str() {
        return "WFLYDS0016: Überprüfung, ob %1$s eine komplette XML ist, fehlgeschlagen";
    }
    @Override
    protected String deploymentTimeout$str() {
        return "WFLYDS0022: Keine Antwort auf Deployment-Operation innerhalb des zulässigen Timeout-Zeitraums [%1$d Sekunden] erhalten. Prüfen Sie die Server-Konfigurationsdatei und die Serverprotokolle, um mehr über den Status des Deployments zu erfahren.";
    }
    @Override
    protected String invalidZip64FileFormat$str() {
        return "WFLYDS0026: Datei %1$s kann nicht gescannt werden, da sie das derzeit nicht unterstützte ZIP64-Format verwendet";
    }
    @Override
    protected String scanException$str() {
        return "WFLYDS0012: Scan von %1$s meldet Ausnahme";
    }
    @Override
    protected String invalidExplodedDeploymentDirectory$str() {
        return "WFLYDS0011: Der Deployment-Scanner hat ein Verzeichnis namens %1$s gefunden, dass sich nicht innerhalb eines Verzeichnisses befand, dessen Name auf .ear, .jar, .rar, .sar oder .war endet. Dies ist wahrscheinlich darauf zurückzuführen, dass ein Archivverzeichnis direkt innerhalb des %2$s Verzeichnisses entpackt wurde, was einen Benutzerfehler darstellt. Das %1$s Verzeichnis wird nicht auf Deployments untersucht, doch es ist möglich, dass der Scanner andere Dateien vom nicht entpackten Archiv findet und versucht, diese zu deployen, was zu Fehlern führen kann.";
    }
    @Override
    protected String started$str() {
        return "WFLYDS0013: Start von %1$s für Verzeichnis %2$s";
    }
    @Override
    protected String initialScanFailed$str() {
        return "WFLYDS0017: Initial Deployment-Scan ist fehlgeschlagen";
    }
    @Override
    protected String pathEntryNotFound$str() {
        return "WFLYDS0040: Konnte keinen 'relative-to' Pfadeintrag finden für %1$s";
    }
    @Override
    protected String unsafeAutoDeploy$str() {
        return "WFLYDS0014: Scan hat für 'auto-deploy' konfigurierte Inhalte gefunden, deren Auto-Deployment nicht auf sichere Weise durchgeführt werden konnte. Siehe Informationen oben. Deployment-Änderungen werden erst bearbeitet, wenn sämtlicher problematischer Inhalt entfernt wurde oder das Deployment des Inhalts nicht über eine %1$s oder %2$s-Statusdatei angezeigt wird. Problematische Deployments sind %3$s";
    }
    @Override
    protected String explodedAutoDeploymentContentWarning$str() {
        return "WFLYDS0006: Zuverlässiges Deployment-Verhalten ist nicht möglich, wenn automatisches Deployment von entpackten Inhalten aktiviert ist (d. h. Deployment ohne Verwendung von '%1$s'-Statusdateien). Konfiguration von automatischem Deployment von entpackten Inhalten wird nicht empfohlen für Situationen, in denen Zuverlässigkeit erforderlich ist. Die Konfiguration der Einstellung %2$s des Deployment-Scanners auf 'false' wird empfohlen.";
    }
    @Override
    protected String reattemptingFailedDeployment$str() {
        return "WFLYDS0015: Erneuter Versuch des fehlgeschlagenen Deployments %1$s";
    }
    @Override
    protected String directoryIsNonexistent$str() {
        return "WFLYDS0037: %1$s existiert nicht";
    }
    @Override
    protected String deployModelOperationFailed$str() {
        return "WFLYDS0036: Deployment-Modelloperation fehlgeschlagen. %1$s";
    }
    @Override
    protected String scannerDeploymentRedeployedButNotByScanner$str() {
        return "WFLYDS0033: Deployment %1$s wurde zuvor von diesem Scanner aufgehoben, wurde jedoch von einem anderen Management-Tool erneut bereitgestellt. Statusdatei %2$s wird zur Speicherung dieser Tatsache entfernt.";
    }
    @Override
    protected String explodedDeploymentContentDeleted$str() {
        return "WFLYDS0007: Der Deployment-Scanner stellte fest, dass der Inhalt für das entpackte Deployment %1$s gelöscht wurde, dass automatisches Deploy/Undeploy für entpackte Deployments jedoch nicht aktiviert ist und dass die %1$s%2$s Statusdatei für dieses Deployment nicht entfernt wurde. Dadurch wurde das Deployment nicht undeployt, allerdings wurden vom Deployment benötigte Ressourcen möglicherweise gelöscht und Applikationsfehler können auftreten. Es wird empfohlen, die %1$s%2$s Statusdatei zu löschen, um den Undeploy-Vorgang auszulösen.";
    }
    @Override
    protected String isNotADirectory$str() {
        return "WFLYDS0038: %1$s ist kein Verzeichnis";
    }
    @Override
    protected String scannerDeploymentUndeployedButNotByScanner$str() {
        return "WFLYDS0018: Deployment %1$s wurde zuvor von diesem Scanner bereitgestellt, das Deployment dann jedoch von einem anderen Management-Tool aufgehoben. Statusdatei %2$s wird zur Speicherung dieser Tatsache hinzugefügt.";
    }
    @Override
    protected String errorWritingDeploymentMarker$str() {
        return "WFLYDS0005: Es trat eine Ausnahme beim Schreiben der Deployment-Statusdatei %1$s auf";
    }
    @Override
    protected String deploymentNotFound$str() {
        return "WFLYDS0003: Deployment von '%1$s' angefordert, aber das Deployment ist nicht vorhanden";
    }
    @Override
    protected String cannotListDirectoryFiles$str() {
        return "WFLYDS0032: Auflistung von Dateien im Verzeichnis %1$s fehlgeschlagen. Überprüfen Sie, ob die Inhalte des Verzeichnisses lesbar sind.";
    }
}
