package org.jboss.as.protocol.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:47+0200")
public class ProtocolLogger_$logger_de extends ProtocolLogger_$logger implements ProtocolLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ProtocolLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String invalidType3$str() {
        return "WFLYPRT0035: Typ ist weder %1$s noch %2$s: %3$s";
    }
    @Override
    protected String cancelledAsyncTaskBeforeRun$str() {
        return "WFLYPRT0058: %1$s hat Aufgabe abgebrochen, ehe die Ausführung begann";
    }
    @Override
    protected String channelTimedOut$str() {
        return "WFLYPRT0060: Timeout bei Anfrage zum Öffnen des Channels";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYPRT0003: Schließen von Ressource %1$s fehlgeschlagen";
    }
    @Override
    protected String channelClosed$str() {
        return "WFLYPRT0054: Channel geschlossen";
    }
    @Override
    protected String errorClosingChannel$str() {
        return "WFLYPRT0001: Fehler beim Schließen des Channels %1$s";
    }
    @Override
    protected String couldNotConnect$str() {
        return "WFLYPRT0023: Konnte keine Verbindung mit %1$s herstellen. Timeout der Verbindung";
    }
    @Override
    protected String operationIdAlreadyExists$str() {
        return "WFLYPRT0051: Operation mit ID %1$d bereits registriert";
    }
    @Override
    protected String failedToConnect$str() {
        return "WFLYPRT0053: Konnte keine Verbindung mit %1$s herstellen. Die Verbindung ist fehlgeschlagen";
    }
    @Override
    protected String noSuchRequest$str() {
        return "WFLYPRT0018: Keine solche Anfrage (%1$d) mit Channel %2$s verknüpft";
    }
    @Override
    protected String nullExecutor$str() {
        return "WFLYPRT0052: Null-Executor";
    }
    @Override
    protected String cancelledAsyncTask$str() {
        return "WFLYPRT0057: %1$s hat Aufgabe abgebrochen durch Unterbrechung von Thread %2$s";
    }
    @Override
    protected String responseHandlerNotFound$str() {
        return "WFLYPRT0056: Kein Response-Handler für Anforderung %1$s";
    }
    @Override
    protected String noSuchResponseHandler$str() {
        return "WFLYPRT0055: Kein Handler registriert für Anfragentyp '%1$s'.";
    }
    @Override
    protected String failedToCloseServerSocket$str() {
        return "WFLYPRT0004: Schließen von Server-Socket %1$s fehlgeschlagen";
    }
    @Override
    protected String deprecatedCLIConfiguration$str() {
        return "WFLYPRT0059: Sie verwenden eine veraltete Methode zum Festlegen der Client-Bind-Adresse. Verwenden Sie den Parameter '--bind' auf dem CLI anstelle der %1$s Systemeigenschaft.";
    }
    @Override
    protected String invalidType1$str() {
        return "WFLYPRT0034: Ungültiger Typ: %1$s";
    }
    @Override
    protected String invalidByteToken$str() {
        return "WFLYPRT0030: Ungültiger Byte-Token. Erwartet wurde '%1$d', empfangen wurde jedoch '%2$d'";
    }
    @Override
    protected String invalidSignature$str() {
        return "WFLYPRT0032: Ungültige Signatur [%1$s]";
    }
}
