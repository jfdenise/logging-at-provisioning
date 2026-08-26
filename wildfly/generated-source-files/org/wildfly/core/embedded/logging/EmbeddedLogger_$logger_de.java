package org.wildfly.core.embedded.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:18+0200")
public class EmbeddedLogger_$logger_de extends EmbeddedLogger_$logger implements EmbeddedLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public EmbeddedLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotCreateStandaloneServer$str() {
        return "WFLYEMB0019: Kann keinen eigenständigen Server mittels Factory erstellen: %1$s";
    }
    @Override
    protected String errorCopyingFile$str() {
        return "WFLYEMB0028: Fehler beim Kopieren von '%1$s' zu '%2$s' (%3$s)";
    }
    @Override
    protected String cannotGetReflectiveMethod$str() {
        return "WFLYEMB0018: Kann reflektive Methode '%1$s' für %2$s nicht abrufen";
    }
    @Override
    protected String processIsReloading$str() {
        return "WFLYEMB0024: Der eingebettete Server wird neu geladen und Aufrufe auf dem ModelControllerClient sind noch nicht verfügbar";
    }
    @Override
    protected String propertySpecifiedFileIsNotADirectory$str() {
        return "WFLYEMB0029: -D%1$s=%2$s ist kein Verzeichnis";
    }
    @Override
    protected String embeddedServerDirectoryNotFound$str() {
        return "WFLYEMB0143: Es existiert kein Verzeichnis namens '%1$s' unter '%2$s'";
    }
    @Override
    protected String moduleLoaderAlreadyConfigured$str() {
        return "WFLYEMB0145: Der Modullader wurde bereits konfiguriert. Das Ändern der Eigenschaft %1$s hat keine Auswirkung.";
    }
    @Override
    protected String failedToRestoreContext$str() {
        return "WFLYEMB0146: Kontext %1$s konnte nicht wiederhergestellt werden";
    }
    @Override
    protected String propertySpecifiedFileDoesNotExist$str() {
        return "WFLYEMB0144: -D%1$s=%2$s existiert nicht";
    }
    @Override
    protected String moduleLoaderError$str() {
        return "WFLYEMB0014: Kann Modul %1$s nicht aus %2$s laden";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYEMB0015: %1$s ist Null";
    }
    @Override
    protected String cannotInvokeStandaloneServer$str() {
        return "WFLYEMB0022: Kann '%1$s' am eingebetteten Prozess nicht aufrufen";
    }
    @Override
    protected String processIsStopped$str() {
        return "WFLYEMB0027: Der eingebettete Server wurde gestoppt und Aufrufe auf dem ModelControllerClient sind nicht verfügbar";
    }
    @Override
    protected String cannotStartEmbeddedServer$str() {
        return "WFLYEMB0021: Kann eingebetteten Prozess nicht starten";
    }
    @Override
    protected String cannotLoadEmbeddedServerFactory$str() {
        return "WFLYEMB0017: Kann eingebettete Server-Factory nicht laden: %1$s";
    }
    @Override
    protected String cannotSetupEmbeddedServer$str() {
        return "WFLYEMB0020: Kann keinen eingebetteten Prozess einrichten";
    }
    @Override
    protected String invalidJBossHome$str() {
        return "WFLYEMB0011: Ungültiges JBoss-Home-Verzeichnis: %1$s";
    }
    @Override
    protected String cannotCreateHostController$str() {
        return "WFLYEMB0026: Host Controller konnte nicht erstellt werden mithilfe der Factory: %1$s";
    }
    @Override
    protected String processIsStopping$str() {
        return "WFLYEMB0023: Der eingebettete Server ist gestoppt und Aufrufe auf dem ModelControllerClient sind nicht verfügbar";
    }
}
