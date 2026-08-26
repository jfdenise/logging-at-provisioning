package org.jboss.as.clustering.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:12+0200")
public class ClusteringLogger_$logger_de extends ClusteringLogger_$logger implements ClusteringLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ClusteringLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String parameterValueOutOfBounds$str() {
        return "WFLYCLCOM0001: %2$g ist kein gültiger Wert für Parameter %1$s. Der Wert muss %3$s %4$g lauten";
    }
    @Override
    protected String failedToClose$str() {
        return "WFLYCLCOM0002: Fehler beim Schließen von %1$s";
    }
    @Override
    protected String attributesDoNotSupportNegativeValues$str() {
        return "WFLYCLCOM0003: Die folgenden Attribute unterstützen keine negativen Werte: %1$s";
    }
    @Override
    protected String attributesDoNotSupportZeroValues$str() {
        return "WFLYCLCOM0004: Die folgenden Attribute unterstützen keine Nullwerte: %1$s";
    }
    @Override
    protected String rejectedMultipleValues$str() {
        return "WFLYCLCOM0005: Der Legacy-Host unterstützt nicht mehrere Werte für Attribute: %1$s";
    }
    @Override
    protected String attributeIgnored$str() {
        return "WFLYCLCOM0006: Das \"%1$s\"-Attribut des \"%2$s\"-Elements wird nicht mehr unterstützt und wird ignoriert";
    }
    @Override
    protected String elementIgnored$str() {
        return "WFLYCLCOM0007: Das Element '%1$s' wird nicht mehr unterstützt und wird ignoriert.";
    }
    @Override
    protected String operationNotSupportedInNormalServerMode$str() {
        return "WFLYCLCOM0008: %1$s: Die %2$s-Operation wird nur im admin-only-Modus unterstützt.";
    }
}
