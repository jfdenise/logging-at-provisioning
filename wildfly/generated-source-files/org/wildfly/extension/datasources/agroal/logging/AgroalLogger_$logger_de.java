package org.wildfly.extension.datasources.agroal.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:11+0200")
public class AgroalLogger_$logger_de extends AgroalLogger_$logger implements AgroalLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public AgroalLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String startedDataSource$str() {
        return "WFLYAG0101: Gestartete Datenquelle ''%1$s'' an [%2$s] gebunden";
    }
    @Override
    protected String datasourceStartException$str() {
        return "WFLYAG0105: Ausnahme beim Starten der Datenquelle ''%1$s''";
    }
    @Override
    protected String driverLoaded$str() {
        return "WFLYAG0501: Geladene Klasse %1$s für Treiber ''%2$s''";
    }
    @Override
    protected String stoppedXADataSource$str() {
        return "WFLYAG0104: Angehaltene xa-Datenquelle ''%1$s''";
    }
    @Override
    protected String missingTransactionManager$str() {
        return "WFLYAG0109: Datenquelle konnte nicht gestartet werden: Transaktionsmanager fehlt";
    }
    @Override
    protected String invalidConnectionProvider$str() {
        return "WFLYAG0107: Ungültiger Verbindungs-Provider. Es wird entweder eine java.sql.Driver- oder javax.sql.DataSource-Implementierung benötigt. Korrigieren Sie den Verbindungs-Provider für den Treiber";
    }
    @Override
    protected String missingAttributeInDatasourceMetadata$str() {
        return "WFLYAG0403: Element <data-source> muss Attribut ''%1$s'' bereitstellen";
    }
    @Override
    protected String loadModuleException$str() {
        return "WFLYAG0502: Fehler beim Laden des Treibermoduls ''%1$s''";
    }
    @Override
    protected String jndiNameInvalidFormat$str() {
        return "WFLYAG0303: JNDI-Name muss mit java:/ oder java:jboss/ beginnen";
    }
    @Override
    protected String invalidCredentialSourceSupplier$str() {
        return "WFLYAG0111: CredentialSourceSupplier für Datenquelle ''%1$s'' ist ungültig";
    }
    @Override
    protected String unknownDatasourceServiceType$str() {
        return "WFLYAG0301: Unbekannter Datenquellendienst vom Typ: %1$s";
    }
    @Override
    protected String invalidDeploymentConnectionProvider$str() {
        return "WFLYAG0401: Ungültiger Verbindungs-Provider. Es wird entweder eine java.sql.Driver- oder javax.sql.DataSource-Implementierung benötigt. Korrigieren Sie den Verbindungs-Provider für den Treiber";
    }
    @Override
    protected String poolWarning$str() {
        return "WFLYAG0601: %1$s: %2$s";
    }
    @Override
    protected String invalidConnection$str() {
        return "WFLYAG0302: Ungültige Verbindung in ''%1$s''";
    }
    @Override
    protected String loadClassDeploymentException$str() {
        return "WFLYAG0402: Fehler beim Laden der Verbindungs-Provider-Klasse ''%1$s''";
    }
    @Override
    protected String addingDeploymentProcessors$str() {
        return "WFLYAG0001: Hinzufügen von Deployment-Prozessoren für die DataSourceDefinition-Annotation und resource-ref-Einträge";
    }
    @Override
    protected String invalidXAConnectionProvider$str() {
        return "WFLYAG0108: Eine xa-Datenquelle benötigt javax.sql.XADataSource als Verbindungs-Provider. Korrigieren Sie den Verbindungs-Provider für den Treiber";
    }
    @Override
    protected String flushOperation$str() {
        return "WFLYAG0201: Durchführung der Bereinigungsoperation, Modus %1$s";
    }
    @Override
    protected String jndiNameShouldValidate$str() {
        return "WFLYAG0304: JNDI-Name sollte '//' nicht enthalten oder in '/' enden";
    }
    @Override
    protected String xaDatasourceStartException$str() {
        return "WFLYAG0106: Ausnahme beim Starten der xa-Datenquelle ''%1$s''";
    }
    @Override
    protected String invalidAuthentication$str() {
        return "WFLYAG0110: Fehler beim Abrufen von Anmeldeinformationen aus dem Authentifizierungskontext für Datenquelle ''%1$s''";
    }
    @Override
    protected String loadClassException$str() {
        return "WFLYAG0503: Fehler beim Laden der Treiberklasse ''%1$s''";
    }
    @Override
    protected String startedXADataSource$str() {
        return "WFLYAG0103: Gestartete xa-Datenquelle ''%1$s'' an [%2$s] gebunden";
    }
    @Override
    protected String stoppedDataSource$str() {
        return "WFLYAG0102: Angehaltene Datenquelle ''%1$s''";
    }
}
