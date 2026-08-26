package org.wildfly.extension.metrics._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:00+0200")
public class MetricsLogger_$logger_de extends MetricsLogger_$logger implements MetricsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MetricsLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMETRICS0001: Aktivieren des Basismetriken-Subsystems";
    }
    @Override
    protected String failedInitializeJMXRegistrar$str() {
        return "WFLYMETRICS0002: Metriken aus JMX MBeans konnten nicht initialisiert werden";
    }
    @Override
    protected String unableToReadAttribute$str() {
        return "WFLYMETRICS0003: Attribut %1$s kann nicht gelesen werden auf %2$s: %3$s.";
    }
    @Override
    protected String unableToConvertAttribute$str() {
        return "WFLYMETRICS0004: Attribut %1$s auf %2$s kann nicht in Double-Wert konvertiert werden.";
    }
    @Override
    protected String malformedName$str() {
        return "WFLYMETRICS0005: Fehlerhaft gebildeter Name";
    }
    @Override
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYMETRICS0006: Beim Konfigurieren von WildFly Metrics wurden zusätzliche Metriksysteme entdeckt: %1$s. Weitere Informationen finden Sie im Administrationshandbuch.";
    }
}
