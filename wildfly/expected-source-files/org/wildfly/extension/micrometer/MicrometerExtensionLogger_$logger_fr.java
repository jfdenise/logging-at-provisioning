package org.wildfly.extension.micrometer;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:10+0200")
public class MicrometerExtensionLogger_$logger_fr extends MicrometerExtensionLogger_$logger implements MicrometerExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicrometerExtensionLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMMTREXT0001: Activation du sous-système micrométrique";
    }
    @Override
    protected String processingDeployment$str() {
        return "WFLYMMTREXT0002: Le sous-système Micrometer traite le déploiement";
    }
    @Override
    protected String noCdiDeployment$str() {
        return "WFLYMMTREXT0003: Le déploiement ne dispose pas des contextes Jakarta ni de l'injection de dépendances activés. L'intégration de Micrometer est ignorée.";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYMMTREXT0004: Le déploiement %1$s nécessite l'utilisation de la capacité '%2$s' , mais elle n'est pas encore enregistrée";
    }
    @Override
    protected String unableToReadAttribute$str() {
        return "WFLYMMTREXT0005: Impossible de lire l'attribut %1$s sur %2$s: %3$s.";
    }
    @Override
    protected String unableToConvertAttribute$str() {
        return "WFLYMMTREXT0006: Impossible de convertir l'attribut %1$s sur %2$s en double valeur.";
    }
    @Override
    protected String malformedName$str() {
        return "WFLYMMTREXT0007: Nom malformé.";
    }
    @Override
    protected String failedInitializeJMXRegistrar$str() {
        return "WFLYMMTREXT0008: Échec de l'initialisation des métriques à partir de JMX MBeans";
    }
    @Override
    protected String unsupportedMetricType$str() {
        return "WFLYMMTREXT0009: Un type de métrique non pris en charge a été trouvé : %1$s";
    }
    @Override
    protected String notActivatingSubsystem$str() {
        return "WFLYMMTREXT0010: Ne pas activer le sous-système micrométrique";
    }
    @Override
    protected String noOpRegistryChosen$str() {
        return "WFLYMMTREXT0011: Le micromètre a été activé, mais aucun point de terminaison n'a été configuré. Un registre de métriques sans opération a été configuré.";
    }
    @Override
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYMMTREXT0012: Systèmes de mesures supplémentaires découverts lors de la configuration de Micrometer :%1$s Veuillez consulter le guide d’administration pour plus d’informations.";
    }
}
