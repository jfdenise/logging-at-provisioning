package org.keycloak.subsystem.adapter.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:26+0200")
public class KeycloakLogger_$logger_zh_CN extends KeycloakLogger_$logger_zh implements KeycloakLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public KeycloakLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String migrationFailed$str() {
        return "KEYCLOAK000002: 迁移失败，请查看结果获得更多细节。";
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "KEYCLOAK000001: 不能执行 migrate 操作：服务器必须处于 admin-only 模式。";
    }
}
