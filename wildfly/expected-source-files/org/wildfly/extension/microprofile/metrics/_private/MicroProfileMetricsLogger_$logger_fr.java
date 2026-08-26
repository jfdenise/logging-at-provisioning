package org.wildfly.extension.microprofile.metrics._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:10+0200")
public class MicroProfileMetricsLogger_$logger_fr extends MicroProfileMetricsLogger_$logger implements MicroProfileMetricsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileMetricsLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "WFLYMPMETRICS0010: L'opération de migration est impossible. Le serveur doit être en mode administrateur uniquement.";
    }
    @Override
    protected String migrationFailed$str() {
        return "WFLYMPMETRICS0011: Échec de la migration. Voir les résultats pour plus de détails.";
    }
}
