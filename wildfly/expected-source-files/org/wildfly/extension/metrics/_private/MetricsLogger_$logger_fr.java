package org.wildfly.extension.metrics._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:00+0200")
public class MetricsLogger_$logger_fr extends MetricsLogger_$logger implements MetricsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MetricsLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMETRICS0001: Activation du sous-système des métriques de base";
    }
    @Override
    protected String failedInitializeJMXRegistrar$str() {
        return "WFLYMETRICS0002: Échec de l'initialisation des métriques à partir de JMX MBeans";
    }
    @Override
    protected String unableToReadAttribute$str() {
        return "WFLYMETRICS0003: Impossible de lire l'attribut %1$s sur %2$s: %3$s.";
    }
    @Override
    protected String unableToConvertAttribute$str() {
        return "WFLYMETRICS0004: Impossible de convertir l'attribut %1$s sur %2$s en double valeur.";
    }
    @Override
    protected String malformedName$str() {
        return "WFLYMETRICS0005: Nom malformé.";
    }
    @Override
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYMETRICS0006: Systèmes de mesures supplémentaires découverts lors de la configuration de WildFly Metrics :%1$s Veuillez consulter le guide d’administration pour plus d’informations.";
    }
}
