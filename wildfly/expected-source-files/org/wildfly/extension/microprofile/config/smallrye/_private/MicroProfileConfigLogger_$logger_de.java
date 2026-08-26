package org.wildfly.extension.microprofile.config.smallrye._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:10+0200")
public class MicroProfileConfigLogger_$logger_de extends MicroProfileConfigLogger_$logger implements MicroProfileConfigLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileConfigLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYCONF0001: Aktivieren des MicroProfile-Konfigurationssubsystems";
    }
    @Override
    protected String unableToLoadClassFromModule$str() {
        return "WFLYCONF0002: Konnte Klasse %1$s nicht vom Modul %2$s laden";
    }
    @Override
    protected String loadConfigSourceFromDir$str() {
        return "WFLYCONF0003: Verzeichnis für MicroProfile-Konfigurationsquelle %1$s verwenden";
    }
    @Override
    protected String loadConfigSourceFromClass$str() {
        return "WFLYCONF0004: Klasse für MicroProfile-Konfigurationsquelle %1$s verwenden";
    }
    @Override
    protected String loadConfigSourceRootFromDir$str() {
        return "WFLYCONF0009: Verzeichnis für MicroProfile-Root \"Config Source\": %1$s";
    }
    @Override
    protected String logDirectoriesUnderConfigSourceRoot$str() {
        return "WFLYCONF0010: Das MicroProfile-Root-Verzeichnis \"Config Source\" '%1$s' enthält die folgenden Verzeichnisse, die als MicroProfile-Konfigurationsquellen verwendet werden: %2$s";
    }
}
