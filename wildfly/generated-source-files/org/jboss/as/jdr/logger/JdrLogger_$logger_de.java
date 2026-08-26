package org.jboss.as.jdr.logger;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:23+0200")
public class JdrLogger_$logger_de extends JdrLogger_$logger implements JdrLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JdrLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String jdrConfigMessage$str() {
        return "Konfigurationsdatei des Servers, falls dieser nicht läuft.";
    }
    @Override
    protected String couldNotConfigureJDR$str() {
        return "WFLYJDR0008: Konnte JDR nicht konfigurieren. Mindestens ein Konfigurationsschritt ist fehlgeschlagen.";
    }
    @Override
    protected String jdrDescriptionMessage$str() {
        return "JBoss Diagnostic Reporter (JDR) ist ein Untersystem zum Sammeln von Informationen, die bei der Suche und Bereinigung von Fehlern helfen. Das jdr-Skript ist ein Dienstprogramm zum Generieren von JDR-Berichten.";
    }
    @Override
    protected String noCommandsToRun$str() {
        return "WFLYJDR0009: Es wurden keine JDR-Befehle geladen. Stellen Sie sicher, dass eine gültige Plugin-Klasse in den plugins.properties festgelegt ist.";
    }
    @Override
    protected String jdrProtocolMessage$str() {
        return "Für Verbindung verwendetes Protokoll. Kann remote, http oder https sein (Standard: http)";
    }
    @Override
    protected String jdrPortMessage$str() {
        return "Port, an den das Management-API gebunden wird. (Standard: 9990)";
    }
    @Override
    protected String couldNotCreateJDRPropertiesFile$str() {
        return "WFLYJDR0012: Konnte JDR-Properties-Datei nicht erstellen unter %1$s";
    }
    @Override
    protected String jdrHostnameMessage$str() {
        return "Hostname, an den das Management-API gebunden wird. (Standard: localhost)";
    }
    @Override
    protected String couldNotCreateZipfile$str() {
        return "WFLYJDR0007: Konnte zipfile nicht erstellen";
    }
    @Override
    protected String jdrHelpMessage$str() {
        return "Diese Nachricht anzeigen und beenden";
    }
    @Override
    protected String couldNotFindJDRPropertiesFile$str() {
        return "WFLYJDR0011: Konnte JDR-Properties-Datei nicht finden.";
    }
}
