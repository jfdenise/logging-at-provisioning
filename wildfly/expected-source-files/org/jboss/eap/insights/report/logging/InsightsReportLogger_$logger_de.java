package org.jboss.eap.insights.report.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:59:22+0200")
public class InsightsReportLogger_$logger_de extends InsightsReportLogger_$logger implements InsightsReportLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InsightsReportLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToReadRuntimeConfiguration1$str() {
        return "WFLYINSIGHTS0001: Das Lesen der Laufzeitkonfiguration schlug fehl mit %1$s";
    }
    @Override
    protected String failedToReadRuntimeConfiguration0$str() {
        return "WFLYINSIGHTS0002: Das Lesen der Laufzeitkonfiguration ist fehlgeschlagen";
    }
    @Override
    protected String failedToReadModules$str() {
        return "WFLYINSIGHTS0003: Die Analyse der Modulpfade ist fehlgeschlagen";
    }
    @Override
    protected String failedToProcessDeployments$str() {
        return "WFLYINSIGHTS0004: Fehler bei der Verarbeitung von Deployments";
    }
    @Override
    protected String missingAuthentication$str() {
        return "WFLYINSIGHTS0005: Bei der Anforderung fehlt die Authentifizierung: %1$s";
    }
    @Override
    protected String payloadTooLarge$str() {
        return "WFLYINSIGHTS0006: Payload zu groß: %1$s";
    }
    @Override
    protected String unsupportedContentType$str() {
        return "WFLYINSIGHTS0007: Der Inhaltstyp der Payload wird nicht unterstützt: %1$s";
    }
    @Override
    protected String serversideError$str() {
        return "WFLYINSIGHTS0008: Die Anforderung auf dem Server ist mit folgendem Code fehlgeschlagen: %1$s";
    }
    @Override
    protected String addingAnalyzedJar$str() {
        return "Hinzufügen der Informationen für %1$s";
    }
    @Override
    protected String addingOverriddenJar$str() {
        return "Hinzufügen der überschriebenen Informationen für %1$s";
    }
    @Override
    protected String errorAnalyzingJar$str() {
        return "Analyse des JAR %1$s ist fehlgeschlagen";
    }
    @Override
    protected String endProcessingModules$str() {
        return "Modulanalyse abgeschlossen";
    }
    @Override
    protected String startProcessingModulePath$str() {
        return "Modulpfad %1$s wird verarbeitet";
    }
    @Override
    protected String startProcessingDeployment$str() {
        return "Verarbeiten des Deployments %1$s";
    }
    @Override
    protected String startProcessingDeploymentForUpdate$str() {
        return "Verarbeiten des Deployments %1$s für Update";
    }
    @Override
    protected String deploymentHashFound$str() {
        return "Das Deployment %1$s hat den sha1-Hash %2$s";
    }
    @Override
    protected String endProcessingDeployments$str() {
        return "Alle Deployments wurden verarbeitet";
    }
    @Override
    protected String endProcessingDeploymentsForUpdate$str() {
        return "Alle Deployments wurden aktualisiert";
    }
    @Override
    protected String scheduledSendFailed$str() {
        return "Geplantes Senden fehlgeschlagen";
    }
    @Override
    protected String scheduledSendUnknownException$str() {
        return "Nicht-Insights-Fehler";
    }
    @Override
    protected String endGettingConfiguration$str() {
        return "Server-Laufzeitkonfiguration erhalten";
    }
    @Override
    protected String startGettingConfiguration$str() {
        return "Abrufen der Server-Laufzeitkonfiguration";
    }
}
