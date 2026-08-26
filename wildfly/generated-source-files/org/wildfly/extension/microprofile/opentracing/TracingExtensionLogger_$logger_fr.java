package org.wildfly.extension.microprofile.opentracing;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:27+0200")
public class TracingExtensionLogger_$logger_fr extends TracingExtensionLogger_$logger implements TracingExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public TracingExtensionLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYTRACEXT0001: Activation du sous-système OpenTracing MicroProfile";
    }
    @Override
    protected String migrationFailed$str() {
        return "WFLYTRACEXT0014: Échec de la migration. Voir les résultats pour plus de détails.";
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "WFLYTRACEXT0013: L'opération de migration ne peut pas être effectuée : le serveur doit être en mode administrateur uniquement";
    }
}
