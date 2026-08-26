package org.wildfly.extension.microprofile.metrics._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:35+0200")
public class MicroProfileMetricsLogger_$logger_pt_BR extends MicroProfileMetricsLogger_$logger_pt implements MicroProfileMetricsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileMetricsLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String migrationFailed$str() {
        return "WFLYMPMETRICS0011: A migração falhou. Veja resultados para mais detalhes.";
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "WFLYMPMETRICS0010: A operação de migração não pode ser executada. O servidor deve estar em modo admin-only";
    }
}
