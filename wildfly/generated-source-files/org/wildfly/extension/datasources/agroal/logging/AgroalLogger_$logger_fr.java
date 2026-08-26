package org.wildfly.extension.datasources.agroal.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:11+0200")
public class AgroalLogger_$logger_fr extends AgroalLogger_$logger implements AgroalLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public AgroalLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String startedDataSource$str() {
        return "WFLYAG0101: Source de données démarrée'%1$s' lié à[%2$s]";
    }
    @Override
    protected String datasourceStartException$str() {
        return "WFLYAG0105: Exception au démarrage de la source de données '%1$s'";
    }
    @Override
    protected String driverLoaded$str() {
        return "WFLYAG0501: Classe chargée %1$s pour le conducteur ’%2$s'";
    }
    @Override
    protected String stoppedXADataSource$str() {
        return "WFLYAG0104: xa-datasource'%1$s' arrêtée";
    }
    @Override
    protected String missingTransactionManager$str() {
        return "WFLYAG0109: Impossible de démarrer la source de données: le gestionnaire de transactions est manquant";
    }
    @Override
    protected String invalidConnectionProvider$str() {
        return "WFLYAG0107: Fournisseur de connexion invalide : une implémentation java.sql.Driver ou javax.sql.DataSource est nécessaire, fixez le fournisseur de connexion pour le pilote";
    }
    @Override
    protected String missingAttributeInDatasourceMetadata$str() {
        return "WFLYAG0403: Élément <data-source> doit fournir l'attribut '%1$s'";
    }
    @Override
    protected String loadModuleException$str() {
        return "WFLYAG0502: N'a pas pu charger le module de pilote '%1$s'";
    }
    @Override
    protected String jndiNameInvalidFormat$str() {
        return "WFLYAG0303: Le nom jndi doit commencer par java:/ ou java:jboss/";
    }
    @Override
    protected String invalidCredentialSourceSupplier$str() {
        return "WFLYAG0111: CredentialSourceSourceSourceSupplier de la source de données %1$s' est non valide";
    }
    @Override
    protected String unknownDatasourceServiceType$str() {
        return "WFLYAG0301: Service de source de données inconnu du type : %1$s";
    }
    @Override
    protected String invalidDeploymentConnectionProvider$str() {
        return "WFLYAG0401: Fournisseur de connexion invalide : une implémentation java.sql.Driver ou javax.sql.DataSource est nécessaire, fixez le fournisseur de connexion pour le pilote";
    }
    @Override
    protected String poolWarning$str() {
        return "WFLYAG0601: %1$s: %2$s";
    }
    @Override
    protected String invalidConnection$str() {
        return "WFLYAG0302: Connexion incorrecte dans '%1$s'";
    }
    @Override
    protected String loadClassDeploymentException$str() {
        return "WFLYAG0402: N'a pas réussi à charger la classe de fournisseur de connexion '%1$s'";
    }
    @Override
    protected String addingDeploymentProcessors$str() {
        return "WFLYAG0001: Ajout de processeurs de déploiement pour l'annotation DataSourceDefinition et les entrées resource-ref";
    }
    @Override
    protected String invalidXAConnectionProvider$str() {
        return "WFLYAG0108: Une xa-datasource nécessite une javax.sql.XADataSource comme fournisseur de connexion. Fixez le fournisseur de connexion pour le pilote";
    }
    @Override
    protected String flushOperation$str() {
        return "WFLYAG0201: Effectuer l’opération de vidage, mode %1$s";
    }
    @Override
    protected String jndiNameShouldValidate$str() {
        return "WFLYAG0304: Le nom Jndi ne doit pas comprendre de '//' ni se terminer par un '/'";
    }
    @Override
    protected String xaDatasourceStartException$str() {
        return "WFLYAG0106: Exception au démarrage de la source de données-xa '%1$s'";
    }
    @Override
    protected String invalidAuthentication$str() {
        return "WFLYAG0110: Erreur lors de l'obtention d'informations d'identification à partir du contexte d'authentification pour la source de données '%1$s'";
    }
    @Override
    protected String loadClassException$str() {
        return "WFLYAG0503: N'a pas pu charger la classe de pilote '%1$s'";
    }
    @Override
    protected String startedXADataSource$str() {
        return "WFLYAG0103: Source de données démarrée'%1$s' lié à[%2$s]";
    }
    @Override
    protected String stoppedDataSource$str() {
        return "WFLYAG0102: Source de données stoppée'%1$s'";
    }
}
