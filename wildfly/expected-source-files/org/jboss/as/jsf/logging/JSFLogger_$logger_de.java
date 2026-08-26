package org.jboss.as.jsf.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:57+0200")
public class JSFLogger_$logger_de extends JSFLogger_$logger implements JSFLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JSFLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String managedBeansConfigParseFailed$str() {
        return "WFLYJSF0004: Parsen von %1$s fehlgeschlagen, in dieser Datei definierte Jakarta Server Faces werden nicht verfügbar sein";
    }
    @Override
    protected String unknownJSFVersion$str() {
        return "WFLYJSF0005: Unbekannte Jakarta Server Faces-Version '%1$s'. Standardversion '%2$s' wird stattdessen verwendet.";
    }
    @Override
    protected String missingJSFModule$str() {
        return "WFLYJSF0006: Jakarta Server Faces-Versions-Slot '%1$s' fehlt im Modul %2$s";
    }
    @Override
    protected String activatedJSFImplementations$str() {
        return "WFLYJSF0007: Die folgenden Jakarta Server Faces-Implementierungen wurden aktiviert: %1$s";
    }
    @Override
    protected String classLoadingFailed$str() {
        return "WFLYJSF0008: Laden der annotierten Klasse fehlgeschlagen: %1$s";
    }
    @Override
    protected String invalidAnnotationLocation$str() {
        return "WFLYJSF0009: Annotation %1$s in Klasse %2$s ist nur an Klassen erlaubt";
    }
    @Override
    protected String invalidDefaultJSFImpl$str() {
        return "WFLYJSF0014: Standard-Implementierungsslot für Jakarta-Server-Faces '%1$s' ist ungültig";
    }
    @Override
    protected String jsfInjectionFailed$str() {
        return "WFLYJSF0016: Injizieren von Jakarta Server Faces aus Slot %1$s fehlgeschlagen";
    }
    @Override
    protected String loadingJsf12$str() {
        return "WFLYJSF0017: Faces 1.2-Klassen erkannt. org.jboss.as.jsf.injection.weld.weld.legacy.WeldApplicationFactoryLegacy wird verwendet.";
    }
    @Override
    protected String loadingJsf2x$str() {
        return "WFLYJSF0018: Faces 1.2-Klassen nicht erkannt. org.jboss.as.jsf.injection.weld.WeldApplicationFactory wird verwendet.";
    }
    @Override
    protected String jsfArtifactNoDefaultConstructor$str() {
        return "WFLYJSF0019: Jakarta Server Faces-Artefakt %1$s mit Klasse %2$s hat keinen Standardkonstruktor, sodass es nicht für die Injektion berücksichtigt wird";
    }
    @Override
    protected String lazyBeanValidationEnabled$str() {
        return "WFLYJSF0020: Die verzögerte Bean-Validierung wurde aktiviert. Dies kann zu fehlenden @PreDestroy-Ereignissen führen, wenn verteilte Websitzungen ablaufen.";
    }
}
