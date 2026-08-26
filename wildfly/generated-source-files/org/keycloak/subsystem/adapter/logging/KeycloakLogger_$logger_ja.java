package org.keycloak.subsystem.adapter.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:26+0200")
public class KeycloakLogger_$logger_ja extends KeycloakLogger_$logger implements KeycloakLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public KeycloakLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String migrationFailed$str() {
        return "KEYCLOAK000002: 移行に失敗しました。詳細については、結果を参照してください。";
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "KEYCLOAK000001: 移行操作は実行できません。サーバーは admin-onlyモードである必要があります。";
    }
}
