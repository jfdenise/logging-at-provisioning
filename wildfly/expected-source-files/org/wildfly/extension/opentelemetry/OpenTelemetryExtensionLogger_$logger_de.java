package org.wildfly.extension.opentelemetry;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:20+0200")
public class OpenTelemetryExtensionLogger_$logger_de extends OpenTelemetryExtensionLogger_$logger implements OpenTelemetryExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public OpenTelemetryExtensionLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYOTELEXT0001: Aktivierung des OpenTelemetry-Subsystems";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYOTELEXT0004: Deployment %1$s erfordert die Verwendung der Capability '%2$s', ist aber derzeit nicht registriert";
    }
    @Override
    protected String errorResolvingTelemetry$str() {
        return "WFLYOTELEXT0005: Fehler bei der Auflösung der OpenTelemetry-Instanz.";
    }
    @Override
    protected String unsupportedExporter$str() {
        return "WFLYOTELEXT0008: Es wurde ein nicht unterstützter Exporter angegeben: '%1$s'.";
    }
    @Override
    protected String errorResolvingTracer$str() {
        return "WFLYOTELEXT0009: Fehler bei der Auflösung des Tracer.";
    }
    @Override
    protected String unsupportedSpanProcessor$str() {
        return "WFLYOTELEXT0010: Es wurde ein nicht unterstützter Span-Prozessor angegeben: '%1$s'.";
    }
    @Override
    protected String unsupportedSampler$str() {
        return "WFLYOTELEXT0011: Unbekannter Wert für Sampler: '%1$s'.";
    }
    @Override
    protected String invalidRatio$str() {
        return "WFLYOTELEXT0012: Ungültiges Verhältnis. Muss zwischen 0.0 und 1.0 einschließlich liegen";
    }
    @Override
    protected String jaegerIsNoLongerSupported$str() {
        return "WFLYOTELEXT0013: Der Exporter 'jaeger' wird nicht mehr unterstützt. Aktualisieren Sie das System, um OTLP zu verwenden.";
    }
    @Override
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYOTELEXT0014: Beim Konfigurieren von OpenTelemetry wurden zusätzliche Metriksysteme entdeckt: %1$s. Weitere Informationen finden Sie im Administrationshandbuch.";
    }
}
