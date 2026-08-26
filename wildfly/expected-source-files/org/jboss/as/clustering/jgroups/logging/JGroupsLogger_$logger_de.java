package org.jboss.as.clustering.jgroups.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:30+0200")
public class JGroupsLogger_$logger_de extends JGroupsLogger_$logger implements JGroupsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JGroupsLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYCLJG0001: JGroups-Subsystem wird aktiviert. JGroups-Version %1$s";
    }
    @Override
    protected String parserFailure$str() {
        return "WFLYCLJG0007: Parsen von %1$s fehlgeschlagen";
    }
    @Override
    protected String notFound$str() {
        return "WFLYCLJG0008: Auffinden von %1$s fehlgeschlagen";
    }
    @Override
    protected String transportNotDefined$str() {
        return "WFLYCLJG0010: Transport für Stack %1$s ist nicht definiert. Bitte geben Sie eine Transport- und Protokoll-Liste entweder als optionale Parameter zu add() oder via Batching an.";
    }
    @Override
    protected String unknownMetric$str() {
        return "WFLYCLJG0015: Unbekannte Metrik %1$s";
    }
    @Override
    protected String unableToLoadProtocolClass$str() {
        return "WFLYCLJG0016: Konnte Protokollklasse %1$s nicht laden";
    }
    @Override
    protected String keyEntryNotFound$str() {
        return "WFLYCLJG0022: Eintrag %1$s wurde im konfigurierten Schlüsselspeicher nicht gefunden";
    }
    @Override
    protected String unexpectedKeyStoreEntryType$str() {
        return "WFLYCLJG0023: Schlüsselspeichereintrag %1$s entspricht nicht dem erwarteten Typ: %2$s";
    }
    @Override
    protected String unexpectedCredentialSource$str() {
        return "WFLYCLJG0025: Konfigurierte Anmeldedatenquelle referenziert keine Passwortanmeldedaten in Klartext";
    }
    @Override
    protected String failedToResolveSocketBinding$str() {
        return "WFLYCLJG0028: Zieladresse für ausgehendes Socket-Binding namens \"%1$s\" konnte nicht aufgelöst werden";
    }
    @Override
    protected String legacyProtocol$str() {
        return "WFLYCLJG0030: Das Protokoll %1$s ist veraltet und wird automatisch auf %2$s aktualisiert";
    }
    @Override
    protected String unrecognizedProtocolProperty$str() {
        return "WFLYCLJG0031: Ignorieren der nicht erkannten Property %1$s: %2$s";
    }
    @Override
    protected String connecting$str() {
        return "WFLYCLJG0032: Verbinden von Channel '%1$s'. '%2$s' tritt Cluster '%3$s' über %4$s bei";
    }
    @Override
    protected String connected$str() {
        return "WFLYCLJG0033: Verbundener Channel '%1$s'. '%2$s' Cluster '%3$s' mit Ansicht %4$s beigetreten";
    }
    @Override
    protected String disconnecting$str() {
        return "WFLYCLJG0034: Trennen von Channel '%1$s'. '%2$s' verlässt Cluster '%3$s' mit Ansicht %4$s";
    }
    @Override
    protected String disconnected$str() {
        return "WFLYCLJG0035: Getrennter Channel '%1$s'. '%2$s' hat Cluster '%3$s' verlassen";
    }
}
