package org.keycloak.subsystem.adapter.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:51+0200")
public class KeycloakLogger_$logger_de extends KeycloakLogger_$logger implements KeycloakLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public KeycloakLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "KEYCLOAK000001: Die Migrations-Operation kann nicht ausgeführt werden: Server muss sich im \"admin-only\" Modus befinden";
    }
    @Override
    protected String migrationFailed$str() {
        return "KEYCLOAK000002: Migration fehlgeschlagen, siehe Ergebnisse für weitere Einzelheiten.";
    }
}
