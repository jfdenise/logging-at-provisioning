package org.wildfly.clustering.singleton.server;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:07+0200")
public class SingletonLogger_$logger_de extends SingletonLogger_$logger implements SingletonLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SingletonLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String multiplePrimaryProvidersDetected$str() {
        return "WFLYCLSN0008: Mehrere primäre Anbieter für Dienst %1$s gefunden: %2$s";
    }
    @Override
    protected String elected$str() {
        return "WFLYCLSN0003: %1$s als Singleton-Provider des %2$s Dienstes ausgewählt";
    }
    @Override
    protected String quorumNotReached$str() {
        return "WFLYCLSN0006: Das Quorum von %2$d für den Dienst %1$s wurde nicht erreicht. Es wird kein primärer Singleton-Anbieter ausgewählt.";
    }
    @Override
    protected String noPrimaryElected$str() {
        return "WFLYCLSN0010: Kein Knoten wurde als Singleton-Provider des %1$s Dienstes ausgewählt";
    }
    @Override
    protected String stopSingleton$str() {
        return "WFLYCLSN0002: Dieser Knoten fungiert jetzt nicht mehr als Singleton-Provider des %1$s Dienstes";
    }
    @Override
    protected String invalidQuorum$str() {
        return "WFLYCLSN0011: Angegebenes Quorum %1$d muss größer als null sein";
    }
    @Override
    protected String notStarted$str() {
        return "WFLYCLSN0009: Singleton Dienst %1$s ist nicht gestartet.";
    }
    @Override
    protected String startSingleton$str() {
        return "WFLYCLSN0001: Dieser Knoten fungiert jetzt als Singleton-Provider des %1$s Dienstes";
    }
    @Override
    protected String quorumJustReached$str() {
        return "WFLYCLSN0007: Quorum von %2$d für %1$s Dienst wurde gerade erreicht. Falls dieser Cluster ein weiteres Mitglied verliert, wird kein Knoten gewählt, um diesen Dienst bereitzustellen.";
    }
    @Override
    protected String noResponseFromPrimary$str() {
        return "WFLYCLSN0004: Keine Antwort vom primären Anbieter des %1$s-Dienstes erhalten, erneuter Versuch ...";
    }
}
