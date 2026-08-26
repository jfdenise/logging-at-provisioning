package org.wildfly.extension.micrometer;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:10+0200")
public class MicrometerExtensionLogger_$logger_de extends MicrometerExtensionLogger_$logger implements MicrometerExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicrometerExtensionLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMMTREXT0001: Aktivieren des Micrometer-Subsystems";
    }
    @Override
    protected String processingDeployment$str() {
        return "WFLYMMTREXT0002: Das Micrometer-Subsystem verarbeitet das Deployment";
    }
    @Override
    protected String noCdiDeployment$str() {
        return "WFLYMMTREXT0003: Im Deployment sind Jakarta-Kontexte und Dependency Injection nicht aktiviert. Micrometer-Integration wird übersprungen.";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYMMTREXT0004: Deployment %1$s erfordert die Verwendung der Capability '%2$s', ist aber derzeit nicht registriert";
    }
    @Override
    protected String unableToReadAttribute$str() {
        return "WFLYMMTREXT0005: Attribut %1$s kann nicht gelesen werden auf %2$s: %3$s.";
    }
    @Override
    protected String unableToConvertAttribute$str() {
        return "WFLYMMTREXT0006: Attribut %1$s auf %2$s kann nicht in Double-Wert konvertiert werden.";
    }
    @Override
    protected String malformedName$str() {
        return "WFLYMMTREXT0007: Fehlerhaft gebildeter Name";
    }
    @Override
    protected String failedInitializeJMXRegistrar$str() {
        return "WFLYMMTREXT0008: Metriken aus JMX MBeans konnten nicht initialisiert werden";
    }
    @Override
    protected String unsupportedMetricType$str() {
        return "WFLYMMTREXT0009: Es wurde ein nicht unterstützter Metriktyp gefunden: %1$s";
    }
    @Override
    protected String notActivatingSubsystem$str() {
        return "WFLYMMTREXT0010: Micrometer-Subsystem wird nicht aktiviert";
    }
    @Override
    protected String noOpRegistryChosen$str() {
        return "WFLYMMTREXT0011: Micrometer wurde aktiviert, aber es wurde kein Endpunkt konfiguriert. Eine \"No-Op\"-Metrikregistrierung wurde konfiguriert.";
    }
    @Override
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYMMTREXT0012: Beim Konfigurieren von Micrometer wurden zusätzliche Metriksysteme entdeckt: %1$s. Weitere Informationen finden Sie im Administrationshandbuch.";
    }
}
