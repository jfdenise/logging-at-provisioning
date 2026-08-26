package org.jboss.as.connector.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:08+0200")
public class ConnectorLogger_$logger_fr extends ConnectorLogger_$logger implements ConnectorLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ConnectorLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String boundJca$str() {
        return "WFLYJCA0002: Bound Jakarta Connectors %1$s [%2$s]";
    }
    @Override
    protected String failedToParseServiceXml$str() {
        return "WFLYJCA0043: N'a pas pu traiter le service xml [%1$s]";
    }
    @Override
    protected String cannotInstantiateDriverClass2$str() {
        return "WFLYJCA0003: Impossible d'instancier la classe de pilote \"%1$s\": %2$s";
    }
    @Override
    protected String legacySecurityNotAvailableForRa$str() {
        return "WFLYJCA0126: La définition de la connexion de %1$s est configurée pour nécessiter le sous-système de sécurité traditionnel, qui n'est pas présent";
    }
    @Override
    protected String bindingAlias$str() {
        return "WFLYJCA0118: Connexion de la fabrique de liaisons nommée à %1$s l'alias %2$s";
    }
    @Override
    protected String deploymentError$str() {
        return "WFLYJCA0033: Erreur lors du déploiement du %1$s";
    }
    @Override
    protected String failedToStartRaDeployment$str() {
        return "WFLYJCA0046: N'a pas pu démarrer le déploiement RA [%1$s]";
    }
    @Override
    protected String RARNotYetDeployed$str() {
        return "WFLYJCA0080: RAR '%1$s' non encore déployé.";
    }
    @Override
    protected String failedToSetAttribute$str() {
        return "WFLYJCA0045: n'a pas pu définir l'attribut : %1$s";
    }
    @Override
    protected String driverNameAndResourceNameNotEquals$str() {
        return "WFLYJCA0015: l'attribut driver-name (%1$s) ne peut pas différer du nom de ressource du pilote (%2$s)";
    }
    @Override
    protected String serviceNotAvailable$str() {
        return "WFLYJCA0054: %1$s service [%2$s] non disponible";
    }
    @Override
    protected String undefinedVar$str() {
        return "WFLYJCA0058: %1$s non défini";
    }
    @Override
    protected String attributeRequiresFalseOrUndefinedAttribute$str() {
        return "WFLYJCA0103: L'attribut %1$s ne peut pas être défini si %2$s n'est pas défini ou sur false";
    }
    @Override
    protected String cannotStartDSTooManyConnectionFactories$str() {
        return "WFLYJCA0121: Impossible de démarrer la source de données '%1$s' parce qu'il y a plus d'une(%2$s) usine de connexion définies.";
    }
    @Override
    protected String invalidAdminObject$str() {
        return "WFLYJCA0085: La classe d'objet admin (%1$s) n'est pas correcte pour l'adaptateur de ressource '%2$s' en déployant %3$s";
    }
    @Override
    protected String legacySecurityAttributeNotSupported$str() {
        return "WFLYJCA0131: L'ancien attribut de sécurité %1$s n'est plus pris en charge. Veuillez utiliser la configuration Elytron à la place";
    }
    @Override
    protected String unsupportedSelector$str() {
        return "WFLYJCA0025: Option de sélecteur non prise en charge : %1$s";
    }
    @Override
    protected String notAValidDataSourceClass$str() {
        return "WFLYJCA0117: %1$s n'est pas une implémentation %2$s valide";
    }
    @Override
    protected String datasourceIsDisabled$str() {
        return "WFLYJCA0112: La source de données %1$s est désactivée";
    }
    @Override
    protected String failedToFindDistributedWorkManager$str() {
        return "WFLYJCA0023: Impossible de trouver le workmanager %1$s, ou bien, ce n'est pas un workmanager distribué. Seul DWM peut remplacer les configurations";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYJCA0092: Les ressources enfants indexées peuvent uniquement être enregistrées si la ressource parent prend en charge les enfants ordonnés. Le parent de '%1$s' n'est pas indexé";
    }
    @Override
    protected String threadPoolNameMustMatchWorkManagerName$str() {
        return "WFLYJCA0122: Le nom du pool de threads %1$s(type : %2$s) doit correspondre au nom du gestionnaire de tâches %3$s.";
    }
    @Override
    protected String elytronHandlerHandle$str() {
        return "WFLYJCA0106: Elytron handler handle: %1$s";
    }
    @Override
    protected String forceIJToNull$str() {
        return "WFLYJCA0017: Forcer le descripteur ironjacamar.xml à null";
    }
    @Override
    protected String cannotDeploy$str() {
        return "WFLYJCA0030: Impossible de déployer";
    }
    @Override
    protected String driverVersionMismatch$str() {
        return "WFLYJCA0035: La version de pilote indiquée ne correspond pas à la version du pilote";
    }
    @Override
    protected String invalidCallbackSecurityDomain$str() {
        return "WFLYJCA0108: Le callback handler fourni ne contient pas de référence au domaine de sécurité";
    }
    @Override
    protected String invalidElytronWorkManagerSetting$str() {
        return "WFLYJCA0111: WorkManager n'a pas d'indicateur elytron-enabled défini en fonction de celui de RA";
    }
    @Override
    protected String legacySecurityNotAvailable1$str() {
        return "WFLYJCA0124: La source de données %1$s est configurée pour nécessiter le sous-système de sécurité traditionnel, qui n'est pas présent";
    }
    @Override
    protected String unBoundNonJTADataSource$str() {
        return "WFLYJCA0099: Source de données non transactionnelle non liée  : %1$s";
    }
    @Override
    protected String missingDependencyInModuleDriver$str() {
        return "WFLYJCA0115: Module pour driver[%1$s] ou l'une de ses dépendances est manquante :[%2$s]";
    }
    @Override
    protected String startedDriverService$str() {
        return "WFLYJCA0018: Démarrage du service de pilote avec le nom de pilote = %1$s";
    }
    @Override
    protected String attributeRequiresTrueAttribute$str() {
        return "WFLYJCA0102: L'attribut %1$s ne peut pas être défini si %2$s est sur true";
    }
    @Override
    protected String unsupportedSelectorOption$str() {
        return "WFLYJCA0020: Option de sélecteur non prise en charge : %1$s";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYJCA0052: %1$s est nul";
    }
    @Override
    protected String failedToProcessRaChild$str() {
        return "WFLYJCA0044: N'a pas pu traiter les archives du dépendant RA pour [%1$s]";
    }
    @Override
    protected String noPropertyResolution$str() {
        return "WFLYJCA0076: Résolution de propriété inconnue pour la propriété %1$s";
    }
    @Override
    protected String unbindingAlias$str() {
        return "WFLYJCA0119: Suppression de la connexion de la fabrique de liaisons nommée à %1$s l'alias %2$s";
    }
    @Override
    protected String serviceAlreadyStarted$str() {
        return "WFLYJCA0053: %1$s service [%2$s] déjà démarré";
    }
    @Override
    protected String unsupportedCreateCallbackHandlerMethod$str() {
        return "WFLYJCA0109: Vous avez besoin d'un domaine de sécurité d'un rappel (callback) avec un domaine de sécurité - utiliser createCallbackHandler(Callback callback) à la place";
    }
    @Override
    protected String cannotStartDSNoConnectionFactory$str() {
        return "WFLYJCA0120: Impossible de démarrer la source de données '%1$s' car il n'y a pas de facteurs de connexion, soit non définis, soit en échec, veuillez vérifier le journal.";
    }
    @Override
    protected String legacySecurityNotAvailable2$str() {
        return "WFLYJCA0123: La définition de connexion %1$s de l'adaptateur de ressources %2$s est configurée de manière à nécessiter le sous-système de sécurité hérité, qui n'est pas présent";
    }
    @Override
    protected String connectionFactoryAnnotation$str() {
        return "WFLYJCA0028: @ConnectionFactoryDefinition aura une gestion limitée : %1$s";
    }
    @Override
    protected String noMetricsAvailable$str() {
        return "WFLYJCA0050: aucune métrique disponible";
    }
    @Override
    protected String adminObjectForJCA10$str() {
        return "WFLYJCA0084: Objet admin déclaré pour l'adaptateur de ressources JCA 1.0 '%1$s' en déployant %2$s";
    }
    @Override
    protected String deploymentFailed$str() {
        return "WFLYJCA0072: Le déploiement %1$s a échoué";
    }
    @Override
    protected String invalidCredentialSourceSupplier$str() {
        return "WFLYJCA0110: CredentialSourceSupplier non valide dans DSSecurity";
    }
    @Override
    protected String notAnAnnotation$str() {
        return "WFLYJCA0051: %1$s doit correspondre à une annotation";
    }
    @Override
    protected String legacySecurityNotSupported$str() {
        return "WFLYJCA0132: L'ancienne sécurité n'est plus prise en charge. Veuillez utiliser la configuration Elytron à la place";
    }
    @Override
    protected String cannotDeployAndValidate$str() {
        return "WFLYJCA0031: Impossible de valider et de déployer ds ou xads";
    }
    @Override
    protected String oneThreadPoolWorkManager$str() {
        return "WFLYJCA0101: Le pool de threads : %1$s(type: %2$s) ne peut être ajouté au workmanager: %3$s, un thread pool uniquement est autorisé pour chaque type.";
    }
    @Override
    protected String unboundJca$str() {
        return "WFLYJCA0011: Unbound Jakarta Connectors %1$s [%2$s]";
    }
    @Override
    protected String unboundDataSource$str() {
        return "WFLYJCA0010: Source de données non liée [%1$s]";
    }
    @Override
    protected String errorStoppingRA$str() {
        return "WFLYJCA0097: Exception au moment de l'arrêt de l'adaptateur de ressources";
    }
    @Override
    protected String registeredAdminObject$str() {
        return "WFLYJCA0006: Objet admin enregistré à %1$s";
    }
    @Override
    protected String failedToGetMetrics$str() {
        return "WFLYJCA0037: Échec d'obtention des métriques : %1$s";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYJCA0056: Service non démarré";
    }
    @Override
    protected String noDataSourceRegisteredForAddress$str() {
        return "WFLYJCA0065: Aucune DataSource n'existe à l'adresse %1$s";
    }
    @Override
    protected String failedToInvokeOperation$str() {
        return "WFLYJCA0040: n'a pas pu invoquer l'opération : %1$s";
    }
    @Override
    protected String methodNotFoundOnDataSource$str() {
        return "WFLYJCA0016: Méthode %1$s sur la classe de la DataSource %2$s non trouvée. Ignorer";
    }
    @Override
    protected String invalidConnection$str() {
        return "WFLYJCA0047: La connexion n'est pas valide";
    }
    @Override
    protected String invalidConnectionFactory$str() {
        return "WFLYJCA0083: Interface d'usine de connexion (%1$s) non correcte pour l'adaptateur de ressources '%2$s'en déployant %3$s";
    }
    @Override
    protected String raModuleNotFound$str() {
        return "WFLYJCA0116: Impossible de charger le module pour RA[%1$s] - le module ou une de ses dépendances est manquant [%2$s]";
    }
    @Override
    protected String archiveOrModuleRequired$str() {
        return "WFLYJCA0077: Au moins une ARCHIVE ou un MODULE sont requis";
    }
    @Override
    protected String xaDataSourcePropertiesNotPresent$str() {
        return "WFLYJCA0069: Au moins une des xa-datasource-property est requise pour une xa-datasource";
    }
    @Override
    protected String stoppedDriverService$str() {
        return "WFLYJCA0019: Arrêt du service de pilote avec le nom de pilote = %1$s";
    }
    @Override
    protected String authorizationFailed$str() {
        return "WFLYJCA0133: L'autorisation a échoué";
    }
    @Override
    protected String jndiBindingsNotSupported$str() {
        return "WFLYJCA0049: Liaisons JNDI non explicites non prises en charge";
    }
    @Override
    protected String executionSubjectNotSetInHandler$str() {
        return "WFLYJCA0107: Le sujet d'exécution n'a pas été donné au callback handler";
    }
    @Override
    protected String boundDataSource$str() {
        return "WFLYJCA0001: Source de données liée [%1$s]";
    }
    @Override
    protected String failedToStartDWMTransport$str() {
        return "WFLYJCA0024: N'a pas pu démarrer le transport de JGroups pour le workmanager distribué %1$s";
    }
    @Override
    protected String noSecurityDefined$str() {
        return "WFLYJCA0027: Aucun ironjacamar.security défini pour %1$s";
    }
    @Override
    protected String failedToMatchPool$str() {
        return "WFLYJCA0042: n'a pas pu trouver une correspondance dans le pool. Vérifier JndiName : %1$s";
    }
    @Override
    protected String rejectAttributesMustBeTrue$str() {
        return "WFLYJCA0088: Les attribut %1$s ont été rejetés. Doit être true";
    }
    @Override
    protected String registeredConnectionFactory$str() {
        return "WFLYJCA0007: Fabrique de connexions enregistrée %1$s";
    }
    @Override
    protected String legacySecurityNotAvailableForConnectionFactory$str() {
        return "WFLYJCA0127: L'usine de connexion %1$s est configurée pour nécessiter le sous-système de sécurité traditionnel, qui n'est pas présent";
    }
    @Override
    protected String failedToLoadDataSourceClass$str() {
        return "WFLYJCA0114: Échec du chargement de la classe de source de données : %1$s";
    }
    @Override
    protected String wrongModuleName$str() {
        return "WFLYJCA0129: Nom de module erroné %1$s";
    }
    @Override
    protected String reportDirectoryDoesNotExist$str() {
        return "WFLYJCA0130: Le répertoire de rapport %1$s n'existe pas";
    }
    @Override
    protected String noSupportedOperation$str() {
        return "WFLYJCA0100: L'opération %1$s n'est pas prise en charge";
    }
    @Override
    protected String failedToLoadNativeLibraries$str() {
        return "WFLYJCA0061: N'a pas pu charger les bibliothèques natives";
    }
    @Override
    protected String deprecated$str() {
        return "WFLYJCA0091: Les déploiements de fichiers -ds.xml sont dépréciés. Il risque donc de ne plus avoir de support dans une prochaine version.";
    }
    @Override
    protected String deployingCompliantJdbcDriver$str() {
        return "WFLYJCA0004: Déploiement du pilote compatible JDBC %1$s (version %2$d.%3$d)";
    }
    @Override
    protected String exceptionDeployingDatasource$str() {
        return "WFLYJCA0064: Exception lors du déploiement de la source de données %1$s";
    }
    @Override
    protected String exceptionDuringUnregistering$str() {
        return "WFLYJCA0089: Exception pendant le dés-enregistrement du déploiement";
    }
    @Override
    protected String driversElementNotSupported$str() {
        return "WFLYJCA0012: <drivers/> en autonome, les déploiements -ds.xml ne sont pas pris en charge : %1$s ignoré";
    }
    @Override
    protected String subject$str() {
        return "WFLYJCA0104: Subject=%1$s";
    }
    @Override
    protected String jndiNameShouldValidate$str() {
        return "WFLYJCA0090: Le nom Jndi ne doit pas comprendre de '//' ni se terminer par un '/'";
    }
    @Override
    protected String adminObjectAnnotation$str() {
        return "WFLYJCA0029: @AdministeredObjectDefinition aura une gestion limitée : %1$s";
    }
    @Override
    protected String startingSubsystem$str() {
        return "WFLYJCA0009: Démarrage du sous-système %1$s (%2$s)";
    }
    @Override
    protected String failedToLoadModuleDriver$str() {
        return "WFLYJCA0041: N'a pas pu charger le module pour le pilote [%1$s]";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYJCA0066: Attribut inconnu %1$s";
    }
    @Override
    protected String failedToLoadModuleRA$str() {
        return "WFLYJCA0073: Échec du chargement du module pour RA [%1$s] Cause : %2$s";
    }
    @Override
    protected String legacyDisableEnableOperation$str() {
        return "WFLYJCA0093: L'opération '%1$s' est obsolète. Utiliser les opérations 'ajouter' ou 'supprimer' est la meilleure solution, ou, si nécessaire, l'opération 'write-attribute' peut être utilisée pour définir l'attribut 'enabled' (activé) obsolète";
    }
    @Override
    protected String unsupportedPolicyOption$str() {
        return "WFLYJCA0021: Option de stratégie non prise en charge : %1$s";
    }
    @Override
    protected String FailedDeployDriverNotSpecified$str() {
        return "WFLYJCA0079: N'a pas pu déployer la source de données %1$s car le pilote n'est pas spécifié";
    }
    @Override
    protected String noSuchField$str() {
        return "WFLYJCA0075: Champ %1$s non trouvé";
    }
    @Override
    protected String cannotFindDriverClassName$str() {
        return "WFLYJCA0086: Impossible de trouver le nom de classe du driver dans jar \"%1$s\"";
    }
    @Override
    protected String failedToStartJGroupsChannel$str() {
        return "WFLYJCA0022: N'a pas pu démarrer le canal de JGroups %1$s pour le workmanager %2$s";
    }
    @Override
    protected String failedToCreate$str() {
        return "WFLYJCA0036: N'a pas pu créer une instance %1$s en raison de [%2$s] %n: %3$s";
    }
    @Override
    protected String unexceptedWorkerCompletionError$str() {
        return "WFLYJCA0113: Erreur non acceptée pendant l'exécution du worker : %1$s";
    }
    @Override
    protected String cannotInstantiateDriverClass1$str() {
        return "WFLYJCA0034: Impossible d'instancier la classe du pilote \"%1$s\". Voir le log (WARN) pour obtenir davantage d'informations";
    }
    @Override
    protected String failedToGetUrlDelimiter$str() {
        return "WFLYJCA0039: n'a pas pu obtenir le délimiteur d'url";
    }
    @Override
    protected String jdbcDriverNotInstalled$str() {
        return "WFLYJCA0135: Le pilote jdbc :%1$s n'est pas installé";
    }
    @Override
    protected String unsupportedPolicy$str() {
        return "WFLYJCA0026: Option de stratégie non prise en charge : %1$s";
    }
    @Override
    protected String legacySecurityNotAvailable0$str() {
        return "WFLYJCA0128: La sécurité héritée n'est pas disponible";
    }
    @Override
    protected String deployingNonCompliantJdbcDriver$str() {
        return "WFLYJCA0005: Déploiement du pilote non compatible JDBC %1$s (version %2$d.%3$d)";
    }
    @Override
    protected String compressedRarNotSupportedInModuleRA$str() {
        return "WFLYJCA0078: Rar supportés en forme non compressée uniquement. N'a pas pu charger le module pour RA [%1$s]";
    }
    @Override
    protected String boundNonJTADataSource$str() {
        return "WFLYJCA0098: Source de données non transactionnelle liée  : %1$s";
    }
    @Override
    protected String noSuchMethod$str() {
        return "WFLYJCA0074: Méthode %1$s non trouvée";
    }
    @Override
    protected String nameAttributeIsMandatory$str() {
        return "WFLYJCA0134: l'attribut nom est obligatoire pour l'élément workmanager";
    }
    @Override
    protected String unableToRegisterRecovery$str() {
        return "WFLYJCA0087: N'a pas pu enregistrer le recouvrement : %1$s (%2$s)";
    }
    @Override
    protected String errorDuringRecoveryShutdown$str() {
        return "WFLYJCA0096: Erreur lors la fermeture de l'opération de recouvrement";
    }
    @Override
    protected String legacySecurityNotAvailableForDsXml$str() {
        return "WFLYJCA0125: La source de données %1$s est configurée pour nécessiter le sous-système de sécurité traditionnel, qui n'est pas présent";
    }
    @Override
    protected String unknownOperation$str() {
        return "WFLYJCA0067: Opération %1$s inconnue";
    }
}
