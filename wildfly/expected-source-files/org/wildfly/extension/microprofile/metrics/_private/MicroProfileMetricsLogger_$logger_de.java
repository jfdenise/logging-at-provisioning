package org.wildfly.extension.microprofile.metrics._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:10+0200")
public class MicroProfileMetricsLogger_$logger_de extends MicroProfileMetricsLogger_$logger implements MicroProfileMetricsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileMetricsLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "WFLYMPMETRICS0010: Die Migrations-Operation kann nicht ausgeführt werden: Der Server muss sich im Modus \"admin-only\" befinden.";
    }
    @Override
    protected String migrationFailed$str() {
        return "WFLYMPMETRICS0011: Die Migration ist fehlgeschlagen. Weitere Details finden Sie in den Ergebnissen.";
    }
}
