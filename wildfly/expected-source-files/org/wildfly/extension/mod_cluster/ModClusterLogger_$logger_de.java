package org.wildfly.extension.mod_cluster;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:00+0200")
public class ModClusterLogger_$logger_de extends ModClusterLogger_$logger implements ModClusterLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ModClusterLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String errorAddingMetrics$str() {
        return "WFLYMODCLS0001: Fehler bei der Hinzufügung der Metriken.";
    }
    @Override
    protected String multicastInterfaceNotAvailable$str() {
        return "WFLYMODCLS0004: Mod_cluster erfordert Advertise, aber Multicast-Interface ist nicht verfügbar";
    }
    @Override
    protected String usingSimpleLoadProvider$str() {
        return "WFLYMODCLS0005: Der Provider für Lastverteilungsfaktoren mod_cluster wurde für Proxy'%1$s' nicht angegeben! Der Provider für Lastverteilungsfaktoren wird mit dem konstantem Faktor '1' verwendet.";
    }
    @Override
    protected String errorApplyingMetricProperties$str() {
        return "WFLYMODCLS0006: Fehler bei der Anwendung von Properties zum Laden metrischer Klasse '%1$s'. Metrik wird nicht geladen.";
    }
    @Override
    protected String contextOrHostNotFound$str() {
        return "WFLYMODCLS0011: Virtueller Host '%1$s' oder Kontext '%2$s' nicht gefunden.";
    }
    @Override
    protected String excludedContextsWrongFormat$str() {
        return "WFLYMODCLS0019: '%1$s' ist kein gültiger Wert für excluded-contexts.";
    }
    @Override
    protected String excludedContextsUseSlashInsteadROOT$str() {
        return "WFLYMODCLS0021: Wert \"ROOT\" für excluded-contexts ist veraltet. Verwenden Sie stattdessen \"/\", um den Root-Kontext auszuschließen.";
    }
    @Override
    protected String errorLoadingModuleForCustomMetric$str() {
        return "WFLYMODCLS0023: Fehler beim Laden des Moduls '%1$s', aus dem die benutzerdefinierte Metrik geladen werden soll.";
    }
    @Override
    protected String ignoredElement$str() {
        return "WFLYMODCLS0025: Das Element '%1$s' wird nicht mehr unterstützt und wird ignoriert.";
    }
    @Override
    protected String ignoredAttribute$str() {
        return "WFLYMODCLS0026: Das Attribut '%1$s' des Elements '%2$s' wird nicht mehr unterstützt und wird ignoriert.";
    }
}
