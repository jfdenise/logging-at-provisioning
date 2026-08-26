package org.jboss.as.process.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:22+0200")
public class ProcessLogger_$logger_de extends ProcessLogger_$logger implements ProcessLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ProcessLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String attemptToReconnectNonExistentProcess$str() {
        return "WFLYPC0001: Versuch der Wiederverbindung mit nicht vorhandenem Prozess '%1$s'";
    }
    @Override
    protected String attemptToRemoveNonExistentProcess$str() {
        return "WFLYPC0002: Versuch des Entfernens von nicht vorhandenem Prozess '%1$s'";
    }
    @Override
    protected String attemptToStartNonExistentProcess$str() {
        return "WFLYPC0003: Versuch des Starts von nicht vorhandenem Prozess '%1$s'";
    }
    @Override
    protected String attemptToStopNonExistentProcess$str() {
        return "WFLYPC0004: Versuch des Stopps von nicht vorhandenem Prozess '%1$s'";
    }
    @Override
    protected String duplicateProcessName$str() {
        return "WFLYPC0005: Versuch der Registrierung eines Prozesses '%1$s' mit identischem Namen";
    }
    @Override
    protected String failedToSendAuthKey$str() {
        return "WFLYPC0006: Senden von Authentifizierungsschlüssel an Prozess fehlgeschlagen: '%1$s': %2$s";
    }
    @Override
    protected String failedToSendDataBytes$str() {
        return "WFLYPC0007: Senden von Datenbytes an Prozess '%1$s' Input-Stream fehlgeschlagen";
    }
    @Override
    protected String failedToSendReconnect$str() {
        return "WFLYPC0008: Wiederverbindung der Nachricht mit Prozess '%1$s' Input-Stream fehlgeschlagen";
    }
    @Override
    protected String failedToStartProcess$str() {
        return "WFLYPC0009: Starten von Prozess '%1$s' fehlgeschlagen";
    }
    @Override
    protected String failedToWriteMessage$str() {
        return "WFLYPC0010: Schreiben von %1$s-Nachricht an Verbindung: %2$s fehlgeschlagen";
    }
    @Override
    protected String processFinished$str() {
        return "WFLYPC0011: Prozess '%1$s' mit Exit-Status %2$d beendet";
    }
    @Override
    protected String receivedInvalidVersion$str() {
        return "WFLYPC0012: Verbindung mit ungültiger Version von %1$s erhalten";
    }
    @Override
    protected String receivedUnknownGreetingCode$str() {
        return "WFLYPC0013: Erhalt von nicht erkanntem Begrüßungscode 0x%1$02x von %2$s";
    }
    @Override
    protected String receivedUnknownCredentials$str() {
        return "WFLYPC0014: Erhalt von Verbindung mit unbekannten Anmeldedaten von %1$s";
    }
    @Override
    protected String receivedUnknownMessageCode$str() {
        return "WFLYPC0015: Erhalt von unbekannter Nachricht mit Code 0x%1$02x";
    }
    @Override
    protected String shutdownComplete$str() {
        return "WFLYPC0016: Alle Prozesse beendet; beende";
    }
    @Override
    protected String shuttingDown$str() {
        return "WFLYPC0017: Herunterfahren von Prozess-Controller";
    }
    @Override
    protected String startingProcess$str() {
        return "WFLYPC0018: Prozess '%1$s' wird gestartet";
    }
    @Override
    protected String stoppingProcess$str() {
        return "WFLYPC0019: Prozess '%1$s' wird gestoppt";
    }
    @Override
    protected String streamProcessingFailed$str() {
        return "WFLYPC0020: Stream-Verarbeitung für Prozess '%1$s': %2$s fehlgeschlagen";
    }
    @Override
    protected String waitingToRestart$str() {
        return "WFLYPC0021: Es wird %1$d Sekunden vor erneutem Versuch zum Starten des Prozesses %2$s gewartet.";
    }
    @Override
    protected String failedToKillProcess$str() {
        return "WFLYPC0022: Abbrechen von Prozess '%1$s' fehlgeschlagen, es wird versucht, den Prozess stattdessen zu löschen.";
    }
    @Override
    protected String argUsage$str() {
        return "Gebrauch: %1$s [args...]%n wo args beinhalten:";
    }
    @Override
    protected String argBackup$str() {
        return "Verwahren Sie eine Kopie der persistenten Domain-Konfiguration, selbst wenn dieser Host nicht der Domain Controller ist. Falls ignore-unused-configuration in host.xml nicht festgelegt ist, wird die gesamte Domain-Konfiguration gespeichert; andernfalls wird der Konfigurationswert von ignore-unused-configuration verwendet.";
    }
    @Override
    protected String argCachedDc$str() {
        return "Ist dieser Host nicht der Domain-Controller und kann den Domain Controller zum Boot-Zeitpunkt nicht kontaktieren, erfolgt der Boot mittels einer gecachten Kopie der Domain-Konfiguration (falls verfügbar, siehe --backup). Der Domain-Controller wird im Hintergrund weiter kontaktiert, bis er verfügbar wird. Beachten Sie, dass beim Start eines Hosts mit --cached-dc, wenn der Domain-Controller verfügbar ist, eine Kopie der Domain-Konfiguration gecacht wird, selbst wenn --backup nicht verwendet wird.";
    }
    @Override
    protected String argDomainConfig$str() {
        return "Name der zu verwendenden Domain-Konfigurationsdatei (Standard ist \"domain.xml\") (dasselbe wie -c)";
    }
    @Override
    protected String argShortDomainConfig$str() {
        return "Name der zu verwendenden Domain-Konfigurationsdatei (Standard ist \"domain.xml\") (dasselbe wie --domain-config)";
    }
    @Override
    protected String argReadOnlyDomainConfig$str() {
        return "Der Name der zu verwendenden Domain-Konfigurationsdatei. Dies unterscheidet sich von '--domain-config', '-c' und '-domain-config' darin, das die Ursprungsdatei nie überschrieben wird.";
    }
    @Override
    protected String argHelp$str() {
        return "Diese Nachricht anzeigen und beenden";
    }
    @Override
    protected String argInterProcessHcAddress$str() {
        return "Adresse, an der der Host-Controller auf Kommunikation vom Prozess-Controller horchen sollte";
    }
    @Override
    protected String argInterProcessHcPort$str() {
        return "Port, an dem der Host-Controller auf Kommunikation vom Prozess-Controller horchen sollte";
    }
    @Override
    protected String argHostConfig$str() {
        return "Name der zu verwendenden Host-Konfigurationsdatei (Standard ist \"host.xml\")";
    }
    @Override
    protected String argReadOnlyHostConfig$str() {
        return "Der Name der zu verwendenden Host-Konfigurationsdatei. Dies unterscheidet sich von '--host-config' darin, das die Ursprungsdatei nie überschrieben wird.";
    }
    @Override
    protected String argPcAddress$str() {
        return "Adresse, an der der Prozess-Controller auf Kommunikation vom Prozess, den er steuert, horcht";
    }
    @Override
    protected String argPcPort$str() {
        return "Port, an dem der Prozess-Controller auf Kommunikation vom Prozess, den er steuert, horcht";
    }
    @Override
    protected String argProperties$str() {
        return "Laden Sie die System-Properties der gegebenen URL";
    }
    @Override
    protected String argSystem$str() {
        return "Setzen Sie eine System-Property";
    }
    @Override
    protected String argVersion$str() {
        return "Version drucken und beenden";
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
    protected String argDefaultMulticastAddress$str() {
        return "Setzen Sie eine System-Property jboss.default.multicast.address auf den gegebenen Wert";
    }
    @Override
    protected String argAdminOnly$str() {
        return "Legen Sie den Ausführungstyp des Host Controllers auf ADMIN_ONLY fest, wodurch dieser Verwaltungsoberflächen öffnet und Verwaltungsanfragen akzeptiert, jedoch keine Server startet und, falls dieser Host Controller der primäre Host Controller für die Domain ist, keine eingehenden Verbindungen von sekundären Host Controllern akzeptiert.";
    }
    @Override
    protected String argMasterAddress$str() {
        return "Legen Sie die Systemeigenschaft jboss.domain.master.address auf den angegebenen Wert fest. In einer Standardkonfiguration für sekundäre Host Controller wird diese zur Konfiguration der Adresse des primären Host Controllers verwendet.";
    }
    @Override
    protected String argMasterPort$str() {
        return "Legen Sie die Systemeigenschaft jboss.domain.primary.port auf den angegebenen Wert fest. In einer Standardkonfiguration für sekundäre Host Controller wird diese zur Konfiguration des Ports für die native Verwaltungskommunikation durch den primären Host Controller verwendet.";
    }
    @Override
    protected String argSecMgr$str() {
        return "Betreibt den Server mit einem installierten Security-Manager.";
    }
    @Override
    protected String argStability$str() {
        return "Führt den Server mit einer bestimmten Stabilitätsstufe aus. Mögliche Werte: %1$s, Standard = %2$s";
    }
    @Override
    protected String noArgValue$str() {
        return "WFLYPC0023: Kein Wert für Argument %1$s angegeben";
    }
    @Override
    protected String invalidAuthKeyLen$str() {
        return "WFLYPC0025: Authentifizierungsschlüssel muss 24 Bytes lang sein";
    }
    @Override
    protected String invalidLength$str() {
        return "WFLYPC0029: %1$s-Länge ist ungültig";
    }
    @Override
    protected String invalidOption$str() {
        return "WFLYPC0030: Ungültige Option %1$s";
    }
    @Override
    protected String nullCommandComponent$str() {
        return "WFLYPC0031: Befehl enthält eine Nullkomponente";
    }
    @Override
    protected String failedToAcceptConnection$str() {
        return "WFLYPC0033: Akzeptieren einer Verbindung fehlgeschlagen";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYPC0034: Schließen von Ressource %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToCloseServerSocket$str() {
        return "WFLYPC0035: Schließen von Server-Socket %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToCloseSocket$str() {
        return "WFLYPC0036: Schließen des Sockets fehlgeschlagen";
    }
    @Override
    protected String failedToHandleIncomingConnection$str() {
        return "WFLYPC0039: Handhabung einer eingehenden Verbindung fehlgeschlagen";
    }
    @Override
    protected String failedToHandleSocketFailure$str() {
        return "WFLYPC0040: Bearbeitung des Socket Fehlschlagproblems fehlgeschlagen";
    }
    @Override
    protected String failedToHandleSocketFinished$str() {
        return "WFLYPC0041: Bearbeitung des Socket Beendigungsproblems fehlgeschlagen";
    }
    @Override
    protected String failedToHandleSocketShutdown$str() {
        return "WFLYPC0042: Bearbeitung des Socket Herunterfahrproblems fehlgeschlagen";
    }
    @Override
    protected String failedToReadMessage$str() {
        return "WFLYPC0043: Lesen einer Nachricht fehlgeschlagen";
    }
    @Override
    protected String leakedMessageOutputStream$str() {
        return "WFLYPC0044: Leck beim Nachrichtenausgabe-Stream; bereinige";
    }
    @Override
    protected String failedToCreateServerThread$str() {
        return "WFLYPC0045: Erstellen von Server-Thread fehlgeschlagen";
    }
    @Override
    protected String failedToReadObject$str() {
        return "WFLYPC0046: Lesen des Objekts fehlgeschlagen";
    }
    @Override
    protected String invalidByte0$str() {
        return "WFLYPC0047: Ungültiges Byte";
    }
    @Override
    protected String invalidByte2$str() {
        return "WFLYPC0048: Ungültiges Byte: %1$s(%2$d)";
    }
    @Override
    protected String invalidByteToken$str() {
        return "WFLYPC0049: Ungültiger Byte-Token. Erwartet wurde '%1$s', empfangen wurde jedoch '%2$s'";
    }
    @Override
    protected String invalidCommandByte$str() {
        return "WFLYPC0050: Ungültiger Command Byte Read: %1$s";
    }
    @Override
    protected String invalidStartChunk$str() {
        return "WFLYPC0051: Ungültiger Start Chunk Start [%1$s]";
    }
    @Override
    protected String readBytes$str() {
        return "WFLYPC0056: %1$d Bytes gelesen.";
    }
    @Override
    protected String streamClosed$str() {
        return "WFLYPC0058: Stream geschlossen";
    }
    @Override
    protected String threadCreationRefused$str() {
        return "WFLYPC0059: Thread-Erstellung abgelehnt";
    }
    @Override
    protected String unexpectedEndOfStream$str() {
        return "WFLYPC0060: Unerwartetes Ende des Streams";
    }
    @Override
    protected String writeChannelClosed$str() {
        return "WFLYPC0061: Write-Channel geschlossen";
    }
    @Override
    protected String writesAlreadyShutdown$str() {
        return "WFLYPC0062: Writes sind bereits beendet";
    }
    @Override
    protected String attemptingToKillProcess$str() {
        return "WFLYPC0063: Prozess '%1$s' wurde nicht innerhalb von %2$d ms ordnungsgemäß beendet; es wurde versucht, den Prozess mithilfe von OS-Aufrufen zu beenden";
    }
    @Override
    protected String jpsCommandNotFound$str() {
        return "WFLYPC0064: Prozess '%1$s' kann nicht lokalisiert werden – Befehl 'jps' wurde nicht gefunden";
    }
    @Override
    protected String processNotFound$str() {
        return "WFLYPC0065: Kein Prozess gefunden, der als '%1$s' identifiziert werden kann";
    }
    @Override
    protected String multipleProcessesFound$str() {
        return "WFLYPC0066: Mehrere Prozesse gefunden, die als '%1$s' identifiziert werden können. Der Löschvorgang auf Betriebssystemebene kann nicht sicher durchgeführt werden";
    }
    @Override
    protected String destroyingProcess$str() {
        return "WFLYPC0067: Prozess '%1$s' wurde nicht innerhalb von %2$d ms ordnungsgemäß beendet; es wurde versucht, den Prozess mit java.lang.Process.destroyForcibly() zu beenden";
    }
}
