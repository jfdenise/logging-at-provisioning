package org.wildfly.extension.microprofile.config.smallrye._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:31+0200")
public class MicroProfileConfigLogger_$logger_fr extends MicroProfileConfigLogger_$logger implements MicroProfileConfigLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileConfigLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYCONF0001: Activation du sous-système de configuration MicroProfile";
    }
    @Override
    protected String unableToLoadClassFromModule$str() {
        return "WFLYCONF0002: N'a pas pu charger la classe %1$s à partir du module %2$s";
    }
    @Override
    protected String loadConfigSourceFromClass$str() {
        return "WFLYCONF0004: Utiliser la classe pour MicroProfile Config Source : %1$s";
    }
    @Override
    protected String loadConfigSourceRootFromDir$str() {
        return "WFLYCONF0009: Utiliser le répertoire pour la racine source de configuration de MicroProfile : %1$s";
    }
    @Override
    protected String loadConfigSourceFromDir$str() {
        return "WFLYCONF0003: Utiliser le répertoire pour MicroProfile Config Source : %1$s";
    }
    @Override
    protected String logDirectoriesUnderConfigSourceRoot$str() {
        return "WFLYCONF0010: Le répertoire racine de la source de configuration MicroProfile '%1$s ' contient les répertoires suivants qui seront utilisés comme sources de configuration MicroProfile : %2$s";
    }
}
