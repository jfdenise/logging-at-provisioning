package org.keycloak.subsystem.adapter.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:57:51+0200")
public class KeycloakLogger_$logger extends DelegatingBasicLogger implements KeycloakLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = KeycloakLogger_$logger.class.getName();
    public KeycloakLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "KEYCLOAK000001: The migrate operation can not be performed: the server must be in admin-only mode";
    }
    @Override
    public final OperationFailedException migrateOperationAllowedOnlyInAdminOnly() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), migrateOperationAllowedOnlyInAdminOnly$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String migrationFailed$str() {
        return "KEYCLOAK000002: Migration failed, see results for more details.";
    }
    @Override
    public final String migrationFailed() {
        return String.format(getLoggingLocale(), migrationFailed$str());
    }
}
