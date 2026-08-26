package org.wildfly.extension.undertow.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:54+0200")
public class UndertowLogger_$logger_fr extends UndertowLogger_$logger implements UndertowLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public UndertowLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToCreatePersistentSessionDir$str() {
        return "WFLYUT0061: N'a pas pu créer de dir %1$s de sessions persistantes";
    }
    @Override
    protected String creatingFileHandler$str() {
        return "WFLYUT0014: Création de gestionnaire de fichier pour le chemin '%1$s' avec les options [directory-listing: '%2$s', follow-symlink: '%3$s', case-sensitive: '%4$s', safe-symlink-paths: '%5$s']";
    }
    @Override
    protected String invalidWebInitParamAnnotation$str() {
        return "WFLYUT0030: @WebInitParam requiert un nom et une valeur sur %1$s";
    }
    @Override
    protected String invalidRedirectURI$str() {
        return "WFLYUT0013: N'a pas pu créer de redirection d'URI.";
    }
    @Override
    protected String couldNotFindExternalPath$str() {
        return "WFLYUT0072: N'a pas pu trouver le chemin externe %1$s configuré";
    }
    @Override
    protected String invalidPersistentSessionDir$str() {
        return "WFLYUT0060: Répertoire de sessions persistantes non valide %1$s";
    }
    @Override
    protected String invalidWebFilterAnnotation$str() {
        return "WFLYUT0031: @WebFilter est autorisé au niveau de la classe %1$s uniquement";
    }
    @Override
    protected String skippedSCI$str() {
        return "WFLYUT0023: A évité SCI avec jar : %1$s.";
    }
    @Override
    protected String unableAddHandlerForPath$str() {
        return "WFLYUT0095: le chemin ['%1$s'] n'existe pas dans le système de fichiers";
    }
    @Override
    protected String couldNotInitJsp$str() {
        return "WFLYUT0001: Impossible d'initialiser Jakarta Server Pages";
    }
    @Override
    protected String invalidRelativeOrderingBeforeAndAfter$str() {
        return "WFLYUT0044: Le classement inclut avant et après les autres dans JAR : %1$s";
    }
    @Override
    protected String keyStoreEntryNotPrivate$str() {
        return "WFLYUT0091: L'entrée de key store %1$s n'est pas une entrée de clé privée";
    }
    @Override
    protected String workerValueInHTTPListenerMustMatchRemoting$str() {
        return "WFLYUT0097: Si http-upgrade est activé, le worker distant et le worker http(s) doivent être identiques. Veuillez régler les valeurs si nécessaire.";
    }
    @Override
    protected String invalidRelativeOrderingUnknownName$str() {
        return "WFLYUT0046: Nom de fragment web inconnu déclaré dans le JAR : %1$s";
    }
    @Override
    protected String serverStopping$str() {
        return "WFLYUT0004: Arrêt %1$s d'Undertow";
    }
    @Override
    protected String invalidDeclareRolesAnnotation$str() {
        return "WFLYUT0034: @DeclareRoles doit spécifier des noms de rôles sur %1$s";
    }
    @Override
    protected String invalidRelativeOrderingDuplicateName$str() {
        return "WFLYUT0045: Un nom dupliqué a été déclaré dans JAR : %1$s";
    }
    @Override
    protected String failedToConfigureHandler$str() {
        return "WFLYUT0064: N'a pas pu configurer le gestionnaire %1$s";
    }
    @Override
    protected String handlerWasNotAHandlerOrWrapper$str() {
        return "WFLYUT0065: La classe de gestionnaire %1$s n'était pas un gestionnaire, ni un wrapper";
    }
    @Override
    protected String failToProcessWebInfLib$str() {
        return "WFLYUT0048: Échec du traitement de WEB-INF/lib : %1$s";
    }
    @Override
    protected String unsupportedValveFeature$str() {
        return "WFLYUT0080: Les valves ne sont plus prises en charge, %1$s n'est pas activé.";
    }
    @Override
    protected String nullDefaultHost$str() {
        return "WFLYUT0055: Hôte par défaut nul";
    }
    @Override
    protected String duplicateServletMapping$str() {
        return "WFLYUT0101: Mappage de servlets en double %1$s trouvé";
    }
    @Override
    protected String missingKeyStoreEntry$str() {
        return "WFLYUT0090: L'alias de clé %1$s n'existe pas dans le key store configuré";
    }
    @Override
    protected String invalidAbsoluteOrdering$str() {
        return "WFLYUT0016: Impossible de résoudre le nom dans le classement absolu : %1$s";
    }
    @Override
    protected String couldNotStartListener$str() {
        return "WFLYUT0082: Impossible de démarrer l'écouteur « %1$s ».";
    }
    @Override
    protected String invalidWebServletAnnotation$str() {
        return "WFLYUT0029: @WebServlet est autorisé au niveau de la classe %1$s uniquement";
    }
    @Override
    protected String listenerStarted$str() {
        return "WFLYUT0006: Écouteur %1$s Undertow %2$s écoute sur %3$s:%4$d";
    }
    @Override
    protected String startedServer$str() {
        return "WFLYUT0012: A démarré le serveur %1$s.";
    }
    @Override
    protected String credentialNotClearPassword$str() {
        return "WFLYUT0093: L'identifiant %1$s n'est pas un mot de passe en texte clair";
    }
    @Override
    protected String tldNotFound$str() {
        return "WFLYUT0074: N'a pas pu trouver TLD %1$s";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYUT0109: Le déploiement est configuré pour utiliser une sécurité ancienne qui n'est plus prise en charge.";
    }
    @Override
    protected String secureListenerNotAvailableForPort$str() {
        return "WFLYUT0005: Le détecteur sécurisé de protocole  '%1$s' non trouvé. Utilisation d'un port non sécurisé.";
    }
    @Override
    protected String obfuscatedSessionRoute$str() {
        return "WFLYUT0107: Route de session obfusquée générée %1$s' à partir de '%2$s'";
    }
    @Override
    protected String failedToResolveModule$str() {
        return "WFLYUT0039: Échec de la résolution du module pour le déploiement %1$s";
    }
    @Override
    protected String failToParseXMLDescriptor1$str() {
        return "WFLYUT0028: Échec de l'analyse du descripteur XML %1$s";
    }
    @Override
    protected String invalidRelativeOrdering0$str() {
        return "WFLYUT0041: Classement relatif invalide";
    }
    @Override
    protected String invalidMultipleOthers$str() {
        return "WFLYUT0040: Dupliquer les autres dans un ordre absolu";
    }
    @Override
    protected String tldFileNotContainedInRoot$str() {
        return "WFLYUT0038: Fichier TDL %1$s non contenu dans la racine %2$s";
    }
    @Override
    protected String advertiseSocketBindingRequiresMulticastAddress$str() {
        return "WFLYUT0073: La liaison de socket advertise de mod_cluster requiert une adresse multidiffusion pour être définie";
    }
    @Override
    protected String unableToResolveAnnotationIndex$str() {
        return "WFLYUT0050: Échec de la résolution de l'index d'annotations pour l'unité de déploiement : %1$s";
    }
    @Override
    protected String duplicateHostContextDeployments$str() {
        return "WFLYUT0105: L'hôte et le chemin du contexte sont occupés, %1$s ne peut pas être enregistré. Le message était : %2$s";
    }
    @Override
    protected String couldNotLoadHandlerFromModule$str() {
        return "WFLYUT0070: N'a pas pu charger le gestionnaire %1$s du module %2$s";
    }
    @Override
    protected String nullNotAllowed$str() {
        return "WFLYUT0083: %1$s ne peut pas être nul";
    }
    @Override
    protected String cannotLoadDesignatedHandleTypes$str() {
        return "WFLYUT0009: N'a pas pu télécharger les classes désignées par les HandlesTypes [%1$s].";
    }
    @Override
    protected String wrongComponentType$str() {
        return "WFLYUT0037: %1$s possède le mauvais type de composant et ne peut pas être utilisé en tant que composant web";
    }
    @Override
    protected String invalidWebListenerAnnotation$str() {
        return "WFLYUT0032: @WebListener est autorisé au niveau de la classe %1$s uniquement";
    }
    @Override
    protected String configurationOptionIgnoredWhenUsingElytron$str() {
        return "WFLYUT0094: L'option de configuration [%1$s] est ignorée quand on utilise un sous-système Elytron";
    }
    @Override
    protected String deploymentConfiguredForLegacySecurity$str() {
        return "WFLYUT0108: Le déploiement est configuré pour utiliser une sécurité ancienne qui n'est plus disponible.";
    }
    @Override
    protected String clusteringNotSupported$str() {
        return "WFLYUT0020: Le clustering n'est pas pris en charge, rétablissement du gestionnaire de sessions non-clusterisées";
    }
    @Override
    protected String sharedSessionConfigNotInRootDeployment$str() {
        return "WFLYUT0069: Ignore la config de session partagée ou shared-session-config dans jboss-all.xml pour le déploiement %1$s. Cette entrée n'est valide que pour les déploiements de haut niveau.";
    }
    @Override
    protected String listenerStopped$str() {
        return "WFLYUT0007: Écouteur %1$s Undertow %2$s s'est arrêté, était lié à %3$s:%4$d";
    }
    @Override
    protected String sessionNotFound$str() {
        return "WFLYUT0100: Session %1$s non trouvée";
    }
    @Override
    protected String badAnnotationOnServlet$str() {
        return "WFLYUT0111: L'annotation : '%1$s' n'aura aucun effet sur le servlet : '%2$s'";
    }
    @Override
    protected String missingCredential$str() {
        return "WFLYUT0092: L'alias d'identifiant %1$s n'existe pas dans le store d'identifiants configuré";
    }
    @Override
    protected String servletClassNotDefined$str() {
        return "WFLYUT0067: Classe de servlet non définie pour le servlet %1$s";
    }
    @Override
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYUT0110: L'utilisation des domaines de sécurité au moment de l'exécution n'est pas prise en charge.";
    }
    @Override
    protected String invalidDateTimeFormatterPattern$str() {
        return "WFLYUT0102: Le modèle %1$s n'est pas un modèle de date valide.";
    }
    @Override
    protected String failedToConfigureHandlerClass$str() {
        return "WFLYUT0066: N'a pas pu configurer le gestionnaire %1$s";
    }
    @Override
    protected String failToParseXMLDescriptor3$str() {
        return "WFLYUT0027: Échec de l'analyse du descripteur XML %1$s sur [%2$s,%3$s]";
    }
    @Override
    protected String nullHostName$str() {
        return "WFLYUT0056: Nom d'hôte nul";
    }
    @Override
    protected String unknownMetric$str() {
        return "WFLYUT0054: Métrique %1$s inconnue";
    }
    @Override
    protected String couldNotLoadWebSocketEndpoint$str() {
        return "WFLYUT0010: N'a pas pu télécharger le point de terminaison du socket web %1$s.";
    }
    @Override
    protected String serverStarting$str() {
        return "WFLYUT0003: Démarrage %1$s d'Undertow";
    }
    @Override
    protected String failedToPersistSessionAttribute$str() {
        return "WFLYUT0024: N'a pas pu persister l'attribut de session %1$s ayant comme valeur %2$s pour la session %3$s";
    }
    @Override
    protected String invalidRelativeOrderingConflict$str() {
        return "WFLYUT0047: Conflit du classement relatif avec JAR : %1$s";
    }
    @Override
    protected String invalidTimeZoneId$str() {
        return "WFLYUT0103: L'identifiant du fuseau horaire %1$s n'est pas valide.";
    }
    @Override
    protected String duplicateDefaultWebModuleMapping$str() {
        return "WFLYUT0087: Reproduire module web par défaut  « %1$s » configuré sur le serveur « %2$s », et l'hôte « %3$s »";
    }
    @Override
    protected String distributableDisabledInFragmentXml$str() {
        return "WFLYUT0081: Le déploiement %1$s ne sera pas distribuable car cette fonctionnalité est désactivée en web-fragment.xml du module %2$s.";
    }
    @Override
    protected String registerWebapp$str() {
        return "WFLYUT0021: Contexte web enregistré :  « %1$s » pour le serveur « %2$s »";
    }
    @Override
    protected String hostStarting$str() {
        return "WFLYUT0018: L'hôte %1$s démarre";
    }
    @Override
    protected String errorProcessingSCI$str() {
        return "WFLYUT0051: Erreur de déploiement lors du traitement SCI avec jar : %1$s";
    }
    @Override
    protected String invalidRelativeOrdering1$str() {
        return "WFLYUT0043: Erreur de traitement du classement relatif avec JAR : %1$s";
    }
    @Override
    protected String missingClassInAnnotation$str() {
        return "WFLYUT0104: Certaines classes référencées par l'annotation : %1$s classe: %2$s sont manquantes.";
    }
    @Override
    protected String predicateNotValid$str() {
        return "WFLYUT0089: Le prédicat %1$s n'était pas valide, le message était : %2$s";
    }
    @Override
    protected String invalidMultipartConfigAnnotation$str() {
        return "WFLYUT0035: @MultipartConfig est autorisé au niveau de la classe %1$s uniquement";
    }
    @Override
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYUT0062: N'a pas pu créer un répertoire de log : %1$s";
    }
    @Override
    protected String unableToObfuscateSessionRoute$str() {
        return "WFLYUT0106: Impossible de générer un itinéraire de session obfusqué à partir de %1$s'";
    }
    @Override
    protected String couldNotLoadWebSocketConfig$str() {
        return "WFLYUT0011: N'a pas pu télécharger la config d'application de socket web %1$s.";
    }
    @Override
    protected String invalidWebFragment$str() {
        return "WFLYUT0042: Un conflit s'est produit lors du traitement du fragment web dans JAR : %1$s";
    }
    @Override
    protected String errorLoadingSCIFromModule$str() {
        return "WFLYUT0049: Erreur de chargement de SCI du module : %1$s";
    }
    @Override
    protected String alpnNotFound$str() {
        return "WFLYUT0071: Aucun fournisseur ALPN trouvé, HTTP/2 ne sera pas activé. Pour supprimer ce message, définir enable-http2 à false sur le %1$s de l'écouteur dans le sous-système Untertow.";
    }
    @Override
    protected String invalidRunAsAnnotation$str() {
        return "WFLYUT0033: @RunAs doit spécifier un nom de rôle sur %1$s";
    }
    @Override
    protected String hostStopping$str() {
        return "WFLYUT0019: L'hôte %1$s s'arrête";
    }
    @Override
    protected String noPortListeningForProtocol$str() {
        return "WFLYUT0063: N'a pas pu trouver de numéro de port écoutant le protocole %1$s";
    }
    @Override
    protected String failedToRegisterWebsocket$str() {
        return "WFLYUT0078: N'a pas pu enregistrer la vue de gestion du websocket %1$s à %2$s";
    }
    @Override
    protected String listenerSuspend$str() {
        return "WFLYUT0008: Écouteur %1$s Undertow %2$s interrompu";
    }
    @Override
    protected String unregisterWebapp$str() {
        return "WFLYUT0022: Contexte web désenregistré :  « %1$s » du serveur « %2$s »";
    }
    @Override
    protected String sessionManagerNotAvailable$str() {
        return "WFLYUT0099: Gestionnaire de session non disponible";
    }
    @Override
    protected String couldNotDeleteTempFile$str() {
        return "WFLYUT0017: N'a pas pu supprimer le fichier temp %1$s du servlet";
    }
    @Override
    protected String invalidServletSecurityAnnotation$str() {
        return "WFLYUT0036: @ServletSecurity est autorisé au niveau de la classe %1$s uniquement";
    }
}
