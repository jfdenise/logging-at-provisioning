package org.keycloak.subsystem.adapter.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:26+0200")
public class KeycloakLogger_$logger_pt_BR extends KeycloakLogger_$logger_pt implements KeycloakLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public KeycloakLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String migrationFailed$str() {
        return "KEYCLOAK000002: A migração falhou, veja resultados para mais detalhes. ";
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "KEYCLOAK000001: A operação de migração não pode ser executada: o servidor deve estar em modo admin-only";
    }
}
