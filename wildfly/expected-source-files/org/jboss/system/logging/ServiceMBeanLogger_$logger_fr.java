package org.jboss.system.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:14+0200")
public class ServiceMBeanLogger_$logger_fr extends ServiceMBeanLogger_$logger implements ServiceMBeanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ServiceMBeanLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String nullMethodName$str() {
        return "WFLYSYSJMX0001: Nom de méthode nulle";
    }
    @Override
    protected String unknownLifecycleMethod$str() {
        return "WFLYSYSJMX0002: Méthode de cycle de vie inconnue %1$s";
    }
    @Override
    protected String errorInDestroy$str() {
        return "WFLYSYSJMX0003: Erreur dans destruction %1$s";
    }
    @Override
    protected String errorInStop$str() {
        return "WFLYSYSJMX0004: Erreur dans stop %1$s";
    }
    @Override
    protected String initializationFailed$str() {
        return "WFLYSYSJMX0005: Initialisation ayant échoué %1$s";
    }
    @Override
    protected String startingFailed$str() {
        return "WFLYSYSJMX0006: Le démarrage a échoué %1$s";
    }
    @Override
    protected String stoppingFailed$str() {
        return "WFLYSYSJMX0007: L'arrêt a échoué %1$s";
    }
    @Override
    protected String destroyingFailed$str() {
        return "WFLYSYSJMX0008: La destruction a échoué %1$s";
    }
    @Override
    protected String postRegisterInitializationFailed$str() {
        return "WFLYSYSJMX0009: L'initialisation a échoué pendant postRegister";
    }
}
