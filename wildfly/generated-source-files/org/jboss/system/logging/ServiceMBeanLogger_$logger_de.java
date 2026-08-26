package org.jboss.system.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:52+0200")
public class ServiceMBeanLogger_$logger_de extends ServiceMBeanLogger_$logger implements ServiceMBeanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ServiceMBeanLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unknownLifecycleMethod$str() {
        return "WFLYSYSJMX0002: Unbekannte Lebenszyklus-Methode %1$s";
    }
    @Override
    protected String nullMethodName$str() {
        return "WFLYSYSJMX0001: Null-Methodenname";
    }
    @Override
    protected String startingFailed$str() {
        return "WFLYSYSJMX0006: Start fehlgeschlagen %1$s";
    }
    @Override
    protected String errorInDestroy$str() {
        return "WFLYSYSJMX0003: Fehler bei Löschung %1$s";
    }
    @Override
    protected String stoppingFailed$str() {
        return "WFLYSYSJMX0007: Stoppen fehlgeschlagen %1$s";
    }
    @Override
    protected String destroyingFailed$str() {
        return "WFLYSYSJMX0008: Löschung fehlgeschlagen %1$s";
    }
    @Override
    protected String errorInStop$str() {
        return "WFLYSYSJMX0004: Fehler bei Stoppen %1$s";
    }
    @Override
    protected String initializationFailed$str() {
        return "WFLYSYSJMX0005: Initialisierung fehlgeschlagen %1$s";
    }
    @Override
    protected String postRegisterInitializationFailed$str() {
        return "WFLYSYSJMX0009: Fehlschlagen der Initialisierung während postRegister";
    }
}
