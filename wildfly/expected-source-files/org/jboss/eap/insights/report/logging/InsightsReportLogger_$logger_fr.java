package org.jboss.eap.insights.report.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:59:22+0200")
public class InsightsReportLogger_$logger_fr extends InsightsReportLogger_$logger implements InsightsReportLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InsightsReportLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToReadRuntimeConfiguration1$str() {
        return "WFLYINSIGHTS0001: La lecture de la configuration d'exécution a échoué avec  %1$s";
    }
    @Override
    protected String failedToReadRuntimeConfiguration0$str() {
        return "WFLYINSIGHTS0002: La lecture de la configuration d'exécution a échoué";
    }
    @Override
    protected String failedToReadModules$str() {
        return "WFLYINSIGHTS0003: L'analyse des chemins du module a échoué";
    }
    @Override
    protected String failedToProcessDeployments$str() {
        return "WFLYINSIGHTS0004: Erreur lors du traitement des déploiements";
    }
    @Override
    protected String missingAuthentication$str() {
        return "WFLYINSIGHTS0005: Authentification manquante dans la demande : %1$s";
    }
    @Override
    protected String payloadTooLarge$str() {
        return "WFLYINSIGHTS0006: Charge utile trop importante : %1$s";
    }
    @Override
    protected String unsupportedContentType$str() {
        return "WFLYINSIGHTS0007: Le type de contenu de la charge utile n'est pas pris en charge : %1$s";
    }
    @Override
    protected String serversideError$str() {
        return "WFLYINSIGHTS0008: La requête a échoué sur le serveur avec le code : %1$s";
    }
    @Override
    protected String addingAnalyzedJar$str() {
        return "Ajout des informations pour %1$s";
    }
    @Override
    protected String addingOverriddenJar$str() {
        return "Ajout des informations remplacées pour %1$s";
    }
    @Override
    protected String errorAnalyzingJar$str() {
        return "Analyse du pot%1$s échoué";
    }
    @Override
    protected String endProcessingModules$str() {
        return "Analyse des modules effectuée";
    }
    @Override
    protected String startProcessingModulePath$str() {
        return "Chemin du module%1$s est en cours de traitement";
    }
    @Override
    protected String startProcessingDeployment$str() {
        return "Déploiement du traitement %1$s";
    }
    @Override
    protected String startProcessingDeploymentForUpdate$str() {
        return "Déploiement du traitement%1$s pour la mise à jour";
    }
    @Override
    protected String deploymentHashFound$str() {
        return "Le déploiement%1$s a un hachage SHA1 %2$s";
    }
    @Override
    protected String endProcessingDeployments$str() {
        return "Tous les déploiements ont été traités";
    }
    @Override
    protected String endProcessingDeploymentsForUpdate$str() {
        return "Tous les déploiements ont été mis à jour";
    }
    @Override
    protected String scheduledSendFailed$str() {
        return "Échec de l'envoi programmé";
    }
    @Override
    protected String scheduledSendUnknownException$str() {
        return "Échec non lié aux insights";
    }
    @Override
    protected String endGettingConfiguration$str() {
        return "Configuration d'exécution du serveur obtenue";
    }
    @Override
    protected String startGettingConfiguration$str() {
        return "Obtention de la configuration d'exécution du serveur";
    }
}
