package org.wildfly.core.jar.runtime._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:32:41+0200")
public class BootableJarLogger_$logger_de extends BootableJarLogger_$logger implements BootableJarLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BootableJarLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String shuttingDown$str() {
        return "WFLYJAR0001: Wird heruntergefahren";
    }
    @Override
    protected String serverStopped$str() {
        return "WFLYJAR0002: Server gestoppt, wird beendet";
    }
    @Override
    protected String serverNotStopped$str() {
        return "WFLYJAR0003: Server noch nicht gestoppt, warten";
    }
    @Override
    protected String nullController$str() {
        return "WFLYJAR0004: Null-Controller-Client, wird beendet";
    }
    @Override
    protected String unexpectedExceptionWhileShuttingDown$str() {
        return "WFLYJAR0005: Unerwartete Ausnahme beim Herunterfahren des Servers";
    }
    @Override
    protected String installDeployment$str() {
        return "WFLYJAR0006: %1$s in Server bereitgestellt";
    }
    @Override
    protected String advertiseInstall$str() {
        return "WFLYJAR0007: Server und Anwendung in %1$s installiert, Dauer %2$s ms";
    }
    @Override
    protected String advertiseOptions$str() {
        return "WFLYJAR0008: Server-Optionen: %1$s";
    }
    @Override
    protected String deletingHome$str() {
        return "WFLYJAR0009: Löschen von %1$s dir";
    }
    @Override
    protected String deploymentAlreadyExist$str() {
        return "WFLYJAR0010: Kein Hollow JAR, Deployment existiert bereits";
    }
    @Override
    protected String unknownArgument$str() {
        return "WFLYJAR0011: Unbekanntes Argument %1$s";
    }
    @Override
    protected String notExistingFile$str() {
        return "WFLYJAR0012: Datei %1$s ist nicht vorhanden";
    }
    @Override
    protected String invalidArgument$str() {
        return "WFLYJAR0013: Ungültiges Argument %1$s, kein Wert angegeben";
    }
    @Override
    protected String processIsStopping$str() {
        return "WFLYJAR0014: Der Server ist gestoppt und Aufrufe auf dem ModelControllerClient sind nicht verfügbar";
    }
    @Override
    protected String processIsReloading$str() {
        return "WFLYJAR0015: Der Server wird neu geladen und Aufrufe auf dem ModelControllerClient sind noch nicht verfügbar";
    }
    @Override
    protected String processIsStopped$str() {
        return "WFLYJAR0016: Der Server wurde gestoppt und Aufrufe auf dem ModelControllerClient sind nicht verfügbar";
    }
    @Override
    protected String cannotStartServer$str() {
        return "WFLYJAR0017: Kann Server nicht starten";
    }
    @Override
    protected String moduleLoaderError$str() {
        return "WFLYJAR0018: Kann Modul %1$s nicht aus %2$s laden";
    }
    @Override
    protected String cantRestartServer$str() {
        return "WFLYJAR0019: Neustart des Servers nicht möglich, beenden";
    }
    @Override
    protected String cantDelete$str() {
        return "WFLYJAR0020: Kann %1$s nicht löschen. Ausnahme %2$s";
    }
    @Override
    protected String cantRegisterModuleMBeans$str() {
        return "WFLYJAR0021: JBoss Modules MBeans können nicht registriert werden, %1$s";
    }
    @Override
    protected String pidFileAlreadyExists$str() {
        return "WFLYJAR0022: Die PID-Datei %1$s ist bereits vorhanden. Dies kann dazu führen, dass das Installationsverzeichnis \"%2$s\" nicht richtig gelöscht wird.";
    }
    @Override
    protected String failedToStartCleanupProcess$str() {
        return "WFLYJAR0023: Der Bereinigungsprozessor konnte nicht gestartet werden. Dies kann dazu führen, dass das Installationsverzeichnis \"%1$s\" nicht richtig gelöscht wird.";
    }
    @Override
    protected String cleanupTimeout$str() {
        return "WFLYJAR0024: Der Container wurde innerhalb von %1$d s nicht ordnungsgemäß heruntergefahren. Dies kann dazu führen, dass das Installationsverzeichnis \"%2$s\" nicht ordnungsgemäß gelöscht wird.";
    }
    @Override
    protected String argPublicBindAddress$str() {
        return "Setzen Sie eine System-Property jboss.bind.address auf den gegebenen Wert";
    }
    @Override
    protected String argInterfaceBindAddress$str() {
        return "Setzen Sie eine System-Property jboss.bind.address.<interface> auf den gegebenen Wert";
    }
    @Override
    protected String argSystem$str() {
        return "Setzen Sie eine System-Property";
    }
    @Override
    protected String argHelp$str() {
        return "Diese Nachricht anzeigen und beenden";
    }
    @Override
    protected String argProperties$str() {
        return "Laden Sie die System-Properties der gegebenen URL";
    }
    @Override
    protected String argDefaultMulticastAddress$str() {
        return "Setzen Sie eine System-Property jboss.default.multicast.address auf den gegebenen Wert";
    }
    @Override
    protected String argVersion$str() {
        return "Version drucken und beenden";
    }
    @Override
    protected String argSecurityManager$str() {
        return "SecurityManager aktivieren";
    }
    @Override
    protected String argStability$str() {
        return "Führt den Server mit einer bestimmten Stabilitätsstufe aus. Mögliche Werte: %1$s, Standard = %2$s";
    }
    @Override
    protected String argSecurityProperty$str() {
        return "Setzen Sie eine Sicherheits-Property";
    }
    @Override
    protected String argDeployment$str() {
        return "Pfad zum Deployment-Artefakt (war, jar, ear oder entpacktes Deployment-Verzeichnis) für Deployment in Hollow JAR";
    }
    @Override
    protected String argInstallation$str() {
        return "Pfad zum Verzeichnis, in dem der Server installiert ist. Standardmäßig wird der Server im TEMP-Verzeichnis installiert.";
    }
    @Override
    protected String argDisplayGalleonConfig$str() {
        return "Zeigt den Inhalt der Galleon-Konfiguration an, die zum Erstellen dieser bootfähigen JAR verwendet wurde";
    }
    @Override
    protected String argCliScript$str() {
        return "Pfad zu einem CLI-Skript, das beim Starten der Bootable JAR ausgeführt werden soll";
    }
    @Override
    protected String securityProviderFailed$str() {
        return "WFLYJAR0025: Initialisierung eines Sicherheitsanbieters fehlgeschlagen. Grund: %1$s";
    }
}
