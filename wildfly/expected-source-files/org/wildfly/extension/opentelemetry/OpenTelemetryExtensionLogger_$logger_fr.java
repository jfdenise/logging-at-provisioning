package org.wildfly.extension.opentelemetry;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:20+0200")
public class OpenTelemetryExtensionLogger_$logger_fr extends OpenTelemetryExtensionLogger_$logger implements OpenTelemetryExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public OpenTelemetryExtensionLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYOTELEXT0001: Activation du sous-système OpenTelemetry";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYOTELEXT0004: Le déploiement %1$s nécessite l'utilisation de la capacité '%2$s' , mais elle n'est pas encore enregistrée";
    }
    @Override
    protected String errorResolvingTelemetry$str() {
        return "WFLYOTELEXT0005: Erreur de résolution de l'instance OpenTelemetry.";
    }
    @Override
    protected String unsupportedExporter$str() {
        return "WFLYOTELEXT0008: Un exportateur non pris en charge a été spécifié : '%1$s'.";
    }
    @Override
    protected String errorResolvingTracer$str() {
        return "WFLYOTELEXT0009: Erreur de résolution du traceur.";
    }
    @Override
    protected String unsupportedSpanProcessor$str() {
        return "WFLYOTELEXT0010: Un processeur span non pris en charge a été spécifié : '%1$s'";
    }
    @Override
    protected String unsupportedSampler$str() {
        return "WFLYOTELEXT0011: Valeur non reconnue pour l'échantillonneur : '%1$s'.";
    }
    @Override
    protected String invalidRatio$str() {
        return "WFLYOTELEXT0012: Ratio non valide. Doit être compris entre 0,0 et 1,0 inclus";
    }
    @Override
    protected String jaegerIsNoLongerSupported$str() {
        return "WFLYOTELEXT0013: L'exportateur « jaeger » n'est plus pris en charge. Veuillez mettre à jour votre système pour utiliser otlp.";
    }
    @Override
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYOTELEXT0014: Systèmes de mesures supplémentaires découverts lors de la configuration d'OpenTelemetry :%1$s Veuillez consulter le guide d’administration pour plus d’informations.";
    }
}
