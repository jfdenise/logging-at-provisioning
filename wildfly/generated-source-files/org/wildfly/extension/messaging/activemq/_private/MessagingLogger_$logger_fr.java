package org.wildfly.extension.messaging.activemq._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:30+0200")
public class MessagingLogger_$logger_fr extends MessagingLogger_$logger implements MessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MessagingLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unknownPooledConnectionFactoryAttribute$str() {
        return "WFLYMSGAMQ0015: Ignore la propriété %1$s qui est une propriété connue de la fabrique de connexions en commun.";
    }
    @Override
    protected String remoteDestinationDeletionFailed$str() {
        return "WFLYMSGAMQ0100: La suppression de la destination distante %1$s a échoué à cause d'une erreur %2$s";
    }
    @Override
    protected String invalidTransactionNameValue$str() {
        return "WFLYMSGAMQ0101: Valeur incorrecte %1$s pour %2$s, les valeurs légales sont %3$s, la valeur par défaut est appliquée.";
    }
    @Override
    protected String immutableResource$str() {
        return "WFLYMSGAMQ0037: La ressource ne peut être mutée";
    }
    @Override
    protected String discoveryGroupIsNotDefined$str() {
        return "WFLYMSGAMQ0080: Le groupe discovery %1$s n'est pas défini";
    }
    @Override
    protected String moduleNotFound$str() {
        return "WFLYMSGAMQ0098: Impossible de charger le module %1$s - le module ou une de ses dépendances est manquant [%2$s]";
    }
    @Override
    protected String errorStoppingJmsServer$str() {
        return "WFLYMSGAMQ0003: Exception lors de l'arrêt du serveur de Messagerie Jakarta";
    }
    @Override
    protected String aioInfoLinux$str() {
        return "WFLYMSGAMQ0075: AIO ne se trouvait pas sur cette plateforme, il faudra donc utiliser du Java NIO pur. Si votre plateforme est Linux, installer LibAIO pour activer le journal AIO et afin d'obtenir une performance optimale.";
    }
    @Override
    protected String unsupportedRuntimeAttribute$str() {
        return "WFLYMSGAMQ0053: La gestion du runtime n'a pas été implémentée pour %1$s";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYMSGAMQ0104: L'ancienne sécurité n'est plus prise en charge.";
    }
    @Override
    protected String failedBridgeDeployment$str() {
        return "WFLYMSGAMQ0106: Le pont %1$s ne s'est pas déployé.";
    }
    @Override
    protected String missingJNDIName$str() {
        return "WFLYMSGAMQ0115: Le nom JNDI est manquant.";
    }
    @Override
    protected String failedToFindConnectorSocketBinding$str() {
        return "WFLYMSGAMQ0030: N'a pas pu trouver SocketBinding pour le connecteur : %1$s";
    }
    @Override
    protected String aioInfo$str() {
        return "WFLYMSGAMQ0001: AIO ne se trouvait pas sur cette plateforme, il faudra donc utiliser du Java NIO pur.";
    }
    @Override
    protected String managementOperationAllowedOnlyInRunningMode$str() {
        return "WFLYMSGAMQ0083: Cette opération %1$s ne peut pas être effectuée : le serveur doit être en mode %2$s";
    }
    @Override
    protected String jdbcDatabaseDialectDetectionFailed$str() {
        return "WFLYMSGAMQ0094: Impossible de détecter le dialecte de la base de données des métadonnées de connexion ou du nom du pilote JDBC. Veuillez configurer cela manuellement à l'aide de la propriété 'journal-database' dans votre configuration. Les chaînes de dialecte de base de données connus sont %1$s";
    }
    @Override
    protected String couldNotCloseFile$str() {
        return "WFLYMSGAMQ0007: N'a pas pu fermer le fichier %1$s";
    }
    @Override
    protected String unsupportedResourceType$str() {
        return "WFLYMSGAMQ0117: Type de ressource%1$s n'est pas pris en charge.";
    }
    @Override
    protected String unableToLoadClassFromModule$str() {
        return "WFLYMSGAMQ0085: N'a pas pu charger la classe %1$s à partir du module %2$s";
    }
    @Override
    protected String missingArguments$str() {
        return "WFLYMSGAMQ0113: Les arguments manquent";
    }
    @Override
    protected String unboundJndiName$str() {
        return "WFLYMSGAMQ0006: Object de messagerie non lié au nom jndi %1$s";
    }
    @Override
    protected String cannotUnbindJndiName$str() {
        return "WFLYMSGAMQ0025: Ne peut pas séparer une chaîne nulle ou vide en nom jndi";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYMSGAMQ0047: %1$s est nul";
    }
    @Override
    protected String cannotBindJndiName$str() {
        return "WFLYMSGAMQ0022: Ne peut pas lier une chaîne nulle ou vide en nom jndi";
    }
    @Override
    protected String failedToStartService$str() {
        return "WFLYMSGAMQ0033: N'a pas pu démarrer le service";
    }
    @Override
    protected String duplicateElements$str() {
        return "WFLYMSGAMQ0076: Le paramètre %1$s contient des éléments en dupicata [%2$s]";
    }
    @Override
    protected String remoteDestinationCreationFailed$str() {
        return "WFLYMSGAMQ0099: La création de la destination distante %1$s a échoué à cause d'une erreur %2$s";
    }
    @Override
    protected String childResourceAlreadyExists$str() {
        return "WFLYMSGAMQ0026: Une ressource enfant de type %1$s existe déjà; le sous-système de messagerie n'autorise qu'une seule ressource de type %1$s";
    }
    @Override
    protected String unableToLoadModule$str() {
        return "WFLYMSGAMQ0086: N'a pas pu charger le module %1$s";
    }
    @Override
    protected String boundJndiName$str() {
        return "WFLYMSGAMQ0002: Object de messagerie lié au nom jndi %1$s";
    }
    @Override
    protected String failedToDestroy$str() {
        return "WFLYMSGAMQ0004: N'a pas pu détruire %1$s: %2$s";
    }
    @Override
    protected String failedToFindDiscoverySocketBinding$str() {
        return "WFLYMSGAMQ0031: N'a pas pu trouver SocketBinding pour les liaisons discovery : %1$s";
    }
    @Override
    protected String unableToFindRecoveryRegistry$str() {
        return "WFLYMSGAMQ0110: Impossible de trouver le registre de récupération";
    }
    @Override
    protected String socketBindingOrJGroupsClusterRequired$str() {
        return "WFLYMSGAMQ0108: L'attribut socket-binding ou jgroups-cluster est requis.";
    }
    @Override
    protected String failedToUnbindJndiName$str() {
        return "WFLYMSGAMQ0008: N'a pas pu supprimer la liaison de l'objet de messagerie liée au nom jndi %1$s dans %2$d %3$s";
    }
    @Override
    protected String onlyOneChildIsAllowed$str() {
        return "WFLYMSGAMQ0078: Une seule ressource enfant %1$s est autorisée, enfants trouvés : %2$s";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYMSGAMQ0079: Les ressources enfants indexées peuvent uniquement être enregistrées si la ressource parent prend en charge les enfants ordonnés. Le parent de '%1$s' n'est pas indexé";
    }
    @Override
    protected String noSubscriptionError$str() {
        return "WFLYMSGAMQ0111: Aucun abonnement avec nom%1$s pour clientID %2$s";
    }
    @Override
    protected String revertOperationFailed$str() {
        return "WFLYMSGAMQ0005: %1$s a intercepté une exception en tentant de renverser l'opération %2$s à l'adresse %3$s";
    }
    @Override
    protected String noInVMConnector$str() {
        return "WFLYMSGAMQ0084: Le serveur ne définit aucun connecteur in-vm. On en a besoin d'un au moins pour pouvoir importer un journal";
    }
    @Override
    protected String multipleClientMappingsFound$str() {
        return "WFLYMSGAMQ0095: Plusieurs mappages client ont été trouvés dans la liaison de socket [%1$s] utilisée par la configuration de transport ActiveMQ [%2$s]. Adresse utilisée : [hôte: %3$s, port %4$s]";
    }
    @Override
    protected String failedToParseProperty$str() {
        return "WFLYMSGAMQ0116: Échec de l'analyse de la propriété '%1$s ' ";
    }
    @Override
    protected String jndiWasNotFound$str() {
        return "WFLYMSGAMQ0119: '%1$s ' n'a pas été trouvé parmi les ressources JMS existantes.";
    }
    @Override
    protected String securityDomainContextNotSet$str() {
        return "WFLYMSGAMQ0058: SecurityDomainContext n'a pas été défini";
    }
    @Override
    protected String stoppedService$str() {
        return "WFLYMSGAMQ0012: A stoppé %1$s %2$s";
    }
    @Override
    protected String upgradeRequestMissingKey$str() {
        return "WFLYMSGAMQ0102: Sec-JbossRemoting-Key header manque à la requête de mise à niveau HTTP";
    }
    @Override
    protected String canNotRemoveResourceOfType$str() {
        return "WFLYMSGAMQ0064: Les ressources de type %1$s ne peuvent pas être supprimées";
    }
    @Override
    protected String unknownHAPolicyType$str() {
        return "WFLYMSGAMQ0109: Type de politique ha inconnu.";
    }
    @Override
    protected String connectorNotDefined$str() {
        return "WFLYMSGAMQ0027: Le connecteur %1$s n'a pas été défini";
    }
    @Override
    protected String required2$str() {
        return "WFLYMSGAMQ0046: Soit %1$s ou %2$s est exigé";
    }
    @Override
    protected String unsupportedOperation$str() {
        return "WFLYMSGAMQ0052: Le support de l'opération %1$s n'a pas été implémenté correctement";
    }
    @Override
    protected String failedAuthenticationWithException$str() {
        return "WFLYMSGAMQ0091: N'a pas pu authentifier le nom d'utilisateur %1$s. Message d'exception : %2$s";
    }
    @Override
    protected String jndiNameAlreadyRegistered$str() {
        return "WFLYMSGAMQ0043: Le nom JNDI %1$s est déjà enregistré";
    }
    @Override
    protected String noMatchingDeadLetterAddress$str() {
        return "WFLYMSGAMQ0072: Il n'y a aucune ressource qui corresponde à dead-letter-address %1$s pour address-settings %2$s, donc les messages non délivrés en provenance de destinations correspondant à cet address-setting seront perdus !";
    }
    @Override
    protected String wrongConnectorRefInBroadCastGroup$str() {
        return "WFLYMSGAMQ0067: Le groupe de diffusion '%1$s' définit une référence à un connecteur '%2$s' non existant. Connecteurs disponibles '%3$s'.";
    }
    @Override
    protected String registeredHTTPUpgradeHandler$str() {
        return "WFLYMSGAMQ0016: Mise à niveau HTTP enregistré pour le protocole %1$s géré par l'acceptateur %2$s";
    }
    @Override
    protected String failedToFindBroadcastSocketBinding$str() {
        return "WFLYMSGAMQ0029: N'a pas pu trouver SocketBinding pour les liaisons broadcast : %1$s";
    }
    @Override
    protected String illegalValue$str() {
        return "WFLYMSGAMQ0036: Valeur illégale %1$s pour élément %2$s";
    }
    @Override
    protected String required1$str() {
        return "WFLYMSGAMQ0045: %1$s est requis";
    }
    @Override
    protected String startedService$str() {
        return "WFLYMSGAMQ0011: A démarré %1$s %2$s";
    }
    @Override
    protected String failedToRecover$str() {
        return "WFLYMSGAMQ0060: N'a pas pu restaurer %1$s";
    }
    @Override
    protected String failedAuthorization$str() {
        return "WFLYMSGAMQ0093: N'a pas pu autoriser le nom d'utilisateur %1$s : permissions manquantes";
    }
    @Override
    protected String unsupportedBroadcastGroupConfigurationForLegacy$str() {
        return "WFLYMSGAMQ0081: Type de configuration de groupe de diffusion non pris en charge pour l'ancienne ressource : %1$s";
    }
    @Override
    protected String canNotRegisterResourceOfType$str() {
        return "WFLYMSGAMQ0063: Les ressources de type %1$s ne peuvent pas être enregistrées";
    }
    @Override
    protected String socketBindingMulticastNotSet$str() {
        return "WFLYMSGAMQ0105: Le site %1$s %2$s est configuré pour utiliser le socket-binding %3$s, mais ce socket-binding n'a pas les attributs multicast-address ou multicast-port configurés.";
    }
    @Override
    protected String activeMQServerNotInstalled$str() {
        return "WFLYMSGAMQ0054: Aucun Serveur ActiveMQ n'est disponible sous le nom %1$s";
    }
    @Override
    protected String failedAuthentication$str() {
        return "WFLYMSGAMQ0092: N'a pas pu authentifier le nom d'utilisateur %1$s: n'a pas pu vérifier la paire nom d’utilisateur / mot de passe";
    }
    @Override
    protected String failedToShutdownServer$str() {
        return "WFLYMSGAMQ0032: N'a pas pu fermer le serveur %1$s";
    }
    @Override
    protected String invalidServiceState$str() {
        return "WFLYMSGAMQ0042: Le service %1$s n'est pas dans l'état %2$s, il est dans l'état %3$s";
    }
    @Override
    protected String unableToLoadConnectorServiceFactoryClass$str() {
        return "WFLYMSGAMQ0087: Impossible de charger la classe de fabrique de service de connecteur : %1$s";
    }
    @Override
    protected String invalid$str() {
        return "WFLYMSGAMQ0038: %1$s n'est pas valide";
    }
    @Override
    protected String couldNotParseDeployment$str() {
        return "WFLYMSGAMQ0055: N'a pas pu gérer le fichier %1$s";
    }
    @Override
    protected String canNotRemoveUnknownEntry$str() {
        return "WFLYMSGAMQ0077: Impossible de supprimer l'entrée inconnue %1$s";
    }
    @Override
    protected String missingRestype$str() {
        return "WFLYMSGAMQ0114: Le paramètre obligatoire --restype est manquant.";
    }
    @Override
    protected String canNotRemoveLastJNDIName$str() {
        return "WFLYMSGAMQ0073: Impossible de supprimer le nom de JNDI %1$s. La ressource doit comporter au moins un nom JNDI";
    }
    @Override
    protected String invalidAttributeType$str() {
        return "WFLYMSGAMQ0039: L'attribut %1$s a un type inattendu %2$s";
    }
    @Override
    protected String failedToCreate$str() {
        return "WFLYMSGAMQ0028: N'a pas pu créer %1$s";
    }
    @Override
    protected String serverInBackupMode$str() {
        return "WFLYMSGAMQ0066: La ressource qui se trouve à l'adresse %1$s ne peut être gérée, le serveur est en mode de sauvegarde";
    }
    @Override
    protected String connectorForPooledConnectionFactory$str() {
        return "WFLYMSGAMQ0018: Aucun connecteur n'a été défini explicitement pour la fabrique de connexions en commun %1$s en utilisant %2$s comme connecteur.";
    }
    @Override
    protected String unsupportedAttribute$str() {
        return "WFLYMSGAMQ0050: Le support de lecture de l'attribut %1$s n'a pas été implémenté correctement";
    }
    @Override
    protected String operationNotAllowedOnJdbcStore$str() {
        return "WFLYMSGAMQ0096: Impossible d'effectuer l'opération %1$s sur un journal du store JDBC";
    }
    @Override
    protected String noSubscriptionWithQueueName$str() {
        return "WFLYMSGAMQ0112: Aucun abonnement avec nom %1$s";
    }
    @Override
    protected String noMatchingExpiryAddress$str() {
        return "WFLYMSGAMQ0071: Il n'y a aucune ressource qui corresponde à l'adresse d'expiration expiry-address %1$s pour address-settings %2$s, donc les messages expirés en provenance de destinations correspondant à cet address-setting seront perdus !";
    }
    @Override
    protected String invalidNullSecurityDomain$str() {
        return "WFLYMSGAMQ0090: Le domaine de sécurité Elytron ne peut être nul";
    }
    @Override
    protected String brokerNotStarted$str() {
        return "WFLYMSGAMQ0103: Broker n’a pas encore démarré. Il ne peut donc pas encore être géré.";
    }
    @Override
    protected String invalidConfiguration$str() {
        return "WFLYMSGAMQ0089: La ressource qui se trouve dans %1$s n'est pas correctement configurée : quand son attribut %2$s est défini, les autres attributs %3$s ne seront pas pris en considération";
    }
    @Override
    protected String unsupportedConnectorFactoryForLegacy$str() {
        return "WFLYMSGAMQ0082: Type de fabrique de connecteurs non pris en charge pour l'ancienne ressource : %1$s";
    }
    @Override
    protected String noDestinationRegisteredForAddress$str() {
        return "WFLYMSGAMQ0057: Aucune destination de message n'a été enregistrée à l'adresse %1$s";
    }
    @Override
    protected String operationNotValid$str() {
        return "WFLYMSGAMQ0056: Le gestionnaire ne peut pas gérer l'opération %1$s";
    }
    @Override
    protected String noSocketBinding$str() {
        return "WFLYMSGAMQ0097: Il n'y a pas de socket-binding ou de socket-socket-binding sortant configuré avec le nom %1$s";
    }
    @Override
    protected String securityEnabledWithoutDomain$str() {
        return "WFLYMSGAMQ0107: Vous devez définir un domaine de sécurité elytron lorsque la sécurité est activée.";
    }
    @Override
    protected String missingName$str() {
        return "WFLYMSGAMQ0118: le nom est manquant.";
    }
    @Override
    protected String invalidModularParameterValue$str() {
        return "WFLYMSGAMQ0088: %1$s ne correspond pas à une valeur valide pour le paramètre %2$s, doit correspondre à un multiple de %3$s";
    }
}
