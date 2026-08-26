package org.jboss.as.appclient.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:54:03+0200")
public class AppClientLogger_$logger_de extends AppClientLogger_$logger implements AppClientLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public AppClientLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String exceptionRunningAppClient$str() {
        return "WFLYAC0002: %1$s running app client main";
    }
    @Override
    protected String argAppClientConfig$str() {
        return "Name der zu verwendenden App-Client-Konfigurationsdatei (Standard lautet \"appclient.xml\")";
    }
    @Override
    protected String argHelp$str() {
        return "Diese Nachricht anzeigen und beenden";
    }
    @Override
    protected String argHost$str() {
        return "Setzen Sie die URL der Applikationsserverinstanz, mit der eine Verbindung hergestellt werden soll";
    }
    @Override
    protected String argConnectionProperties$str() {
        return "Laden Sie die ejb-client.properties-Datei von der gegebenen url";
    }
    @Override
    protected String argProperties$str() {
        return "Laden Sie die System-Properties der gegebenen URL";
    }
    @Override
    protected String argSystemProperty$str() {
        return "Setzen Sie eine System-Property";
    }
    @Override
    protected String argVersion$str() {
        return "Version drucken und beenden";
    }
    @Override
    protected String argSecMgr$str() {
        return "Führt den Container mit aktiviertem Security Manager aus.";
    }
    @Override
    protected String usageDescription$str() {
        return "Das Appclient-Skript startet einen Applikations-Client, der zum Testen von bzw. zum Zugriff auf deployte Jakarta Enterprise Beans verwendet werden kann.";
    }
    @Override
    protected String appClientNotSpecified$str() {
        return "WFLYAC0004: Sie müssen den Applikations-Client für die Ausführung festlegen";
    }
    @Override
    protected String argumentExpected$str() {
        return "WFLYAC0005: Argument für Option %1$s erwartet";
    }
    @Override
    protected String cannotFindAppClient0$str() {
        return "WFLYAC0006: Konnte Applikations-Client-Jar nicht in Deployment finden";
    }
    @Override
    protected String cannotFindAppClient1$str() {
        return "WFLYAC0007: Konnte Applikations-Client %1$s nicht finden";
    }
    @Override
    protected String cannotLoadAppClientMainClass$str() {
        return "WFLYAC0008: Konnte Applikations-Client Hauptklasse nicht laden";
    }
    @Override
    protected String cannotLoadProperties$str() {
        return "WFLYAC0010: Kann Properties von URL %1$s nicht laden";
    }
    @Override
    protected String cannotStartAppClient1$str() {
        return "WFLYAC0011: Konnte App Client %1$s nicht starten, da keine Hauptklasse gefunden werden konnte";
    }
    @Override
    protected String cannotStartAppClient2$str() {
        return "WFLYAC0012: Konnte App Client %1$s nicht starten, da keine Hauptmethode an der Hauptklasse %2$s gefunden werden konnte";
    }
    @Override
    protected String duplicateSubsystemDeclaration$str() {
        return "WFLYAC0013: Doppelte Untersystem Deklaration";
    }
    @Override
    protected String failedToParseXml1$str() {
        return "WFLYAC0015: Parsen von %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToParseXml3$str() {
        return "WFLYAC0016: Parsen von %1$s an [%2$d,%3$d] fehlgeschlagen";
    }
    @Override
    protected String malformedUrl$str() {
        return "WFLYAC0017: Nicht ordnungsgemäße URL für Option %1$s angegeben";
    }
    @Override
    protected String multipleAppClientsFound$str() {
        return "WFLYAC0018: Mehr als einen Applikations-Client gefunden und kein App Client Name angegeben";
    }
    @Override
    protected String unknownOption$str() {
        return "WFLYAC0020: Unbekannte Option %1$s";
    }
    @Override
    protected String couldNotLoadCallbackClass$str() {
        return "WFLYAC0021: Konnte Callback-Handler Klasse %1$s nicht laden";
    }
    @Override
    protected String couldNotCreateCallbackHandler$str() {
        return "WFLYAC0022: Konnte keine Instanz von Callback-Handler Klasse %1$s erstellen";
    }
    @Override
    protected String cannotFindAppClientFile$str() {
        return "WFLYAC0023: Konnte Applikations-Client %1$s nicht finden";
    }
    @Override
    protected String cannotSpecifyBothHostAndPropertiesFile$str() {
        return "WFLYAC0024: Kann nicht sowohl einen Host für die Verbindung als auch eine ejb-client.properties-Datei festlegen. ";
    }
}
