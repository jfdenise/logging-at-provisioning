package org.jboss.as.domain.http.server.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:20+0200")
public class HttpServerLogger_$logger_de extends HttpServerLogger_$logger implements HttpServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public HttpServerLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String modelRequestError$str() {
        return "WFLYDMHTTP0001: Unerwarteter Fehler bei der Ausführung der Modellanfrage";
    }
    @Override
    protected String uploadError$str() {
        return "WFLYDMHTTP0002: Unerwarteter Fehler bei der Ausführung der Deployment Upload-Anfrage";
    }
    @Override
    protected String consoleModuleNotFound$str() {
        return "WFLYDMHTTP0003: Kann Konsolenmodul für Slot %1$s nicht laden, deaktiviere Konsole";
    }
    @Override
    protected String errorContextModuleNotFound$str() {
        return "WFLYDMHTTP0004: Kann Fehlerkontext für Slot %1$s nicht laden, deaktiviere Fehlerkontext.";
    }
    @Override
    protected String invalidOperation$str() {
        return "WFLYDMHTTP0005: Ungültige Operation '%1$s'";
    }
    @Override
    protected String realmNotReadyMessage$str() {
        return "WFLYDMHTTP0006: Der Sicherheitsbereich ist nicht bereit für die Verarbeitung von Anforderungen, siehe %1$s";
    }
    @Override
    protected String consoleModuleNotFoundMsg$str() {
        return "WFLYDMHTTP0007: Kein Konsolenmodul mit Modulname %1$s verfügbar";
    }
    @Override
    protected String invalidCredentialType$str() {
        return "WFLYDMHTTP0010: Ungültiger Anmeldedatentyp '%1$s'";
    }
    @Override
    protected String httpsRedirectNotSupported$str() {
        return "WFLYDMHTTP0011: Management-Schnittstelle verwendet unterschiedliche Adressen für HTTP (%1$s) und HTTPS (%2$s). Die Umleitung von HTTPS-Anfragen von HTTP-Socket zu HTTPS-Socket wird nicht unterstützt.";
    }
    @Override
    protected String sslRequestedNoSslContext$str() {
        return "WFLYDMHTTP0012: Ein sicherer Socket wurde definiert für die HTTP-Schnittstelle, allerdings stellt der referenzierte Sicherheitsbereich keinen SSLContext bereit.";
    }
    @Override
    protected String invalidUseStreamAsResponseIndex$str() {
        return "WFLYDMHTTP0013: Ungültiger useStreamIndex-Wert '%1$d'. Die Antwort der Operation hatte %2$d Streams angehängt.";
    }
    @Override
    protected String managementHttpServerAlreadyBuild$str() {
        return "WFLYDMHTTP0014: Der ManagementHttpServer wurde bereits erstellt mit diesem Builder.";
    }
    @Override
    protected String noRealmOrSSLContext$str() {
        return "WFLYDMHTTP0015: Es wurde kein SecurityRealm oder SSLContext angegeben.";
    }
    @Override
    protected String realmNotReadyForSecuredManagementHandler$str() {
        return "WFLYDMHTTP0016: Ihr Anwendungsserver wird ausgeführt. Sie haben jedoch noch keine Benutzer hinzugefügt, um auf die HTTP-Management-Interface zugreifen zu können. Um einen neuen Benutzer hinzuzufügen, führen Sie das Skript %1$s im bin-Ordner Ihrer WildFly-Installation aus und geben Sie die erforderlichen Informationen ein. Standardmäßig lautet der von WildFly verwendete Bereichsname 'ManagementRealm' und ist standardmäßig vom 'add-user'-Tool bereits ausgewählt.";
    }
}
