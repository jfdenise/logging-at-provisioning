package org.jboss.as.webservices.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:14+0200")
public class WSLogger_$logger_fr extends WSLogger_$logger implements WSLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public WSLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotLoadDeploymentAspectsDefinitionFile$str() {
        return "WFLYWS0001: Impossible de charger les aspects WS du déploiement à partir de %1$s";
    }
    @Override
    protected String activatingWebservicesExtension$str() {
        return "WFLYWS0002: Activation de l'extension WebServices";
    }
    @Override
    protected String starting$str() {
        return "WFLYWS0003: Démarrage de %1$s";
    }
    @Override
    protected String stopping$str() {
        return "WFLYWS0004: Arrêt de %1$s";
    }
    @Override
    protected String configServiceCreationFailed$str() {
        return "WFLYWS0005: Erreur lors de la création du service de configuration";
    }
    @Override
    protected String configServiceDestroyFailed$str() {
        return "WFLYWS0006: Erreur lors de la destruction du service de configuration";
    }
    @Override
    protected String cannotReadWsdl$str() {
        return "WFLYWS0007: Impossible de lire WSDL à partir de : %1$s";
    }
    @Override
    protected String mutuallyExclusiveAnnotations$str() {
        return "WFLYWS0008: [JAXWS 2.2 spec, section 7.7] Les annotations @WebService et @WebServiceProvider sont mutuellement exclusives - %1$s ne sera pas considéré comme un point de terminaison de webservice car cette condition n'est pas remplie";
    }
    @Override
    protected String finalEndpointClassDetected$str() {
        return "WFLYWS0009: La classe du point de terminaison WebService ne peut pas être finale - %1$s ne sera pas considéré comme un point de terminaison de webservice";
    }
    @Override
    protected String ignoringPortComponentRef$str() {
        return "WFLYWS0010: Ignorer <port-component-ref> sans <service-endpoint-interface> et <port-qname> : %1$s";
    }
    @Override
    protected String cannotRegisterRecordProcessor$str() {
        return "WFLYWS0011: Impossible d'enregistrer le processeur des enregistrement avec le serveur JMX";
    }
    @Override
    protected String cannotUnregisterRecordProcessor$str() {
        return "WFLYWS0012: Impossible de dés-enregistrer le processeur des enregistrements du serveur JMX";
    }
    @Override
    protected String mBeanServerNotAvailable$str() {
        return "WFLYWS0013: MBeanServer non disponible, évitez l'enregistrement/dés-enregistrement de %1$s";
    }
    @Override
    protected String multipleEndpointsWithDifferentDeclaredSecurityRoles$str() {
        return "WFLYWS0014: Plusieurs points de terminaison Enterprise Beans 3 du même déploiement avec des rôles de sécurité déclarés différents ; sachez que cela peut être un risque de sécurité si vous ne contrôlez pas les rôles autorisés (@RolesAllowed) sur chaque méthode de point de terminaison ws.";
    }
    @Override
    protected String cannotRegisterEndpoint$str() {
        return "WFLYWS0015: Impossible d'enregistrer endpoint: %1$s dans le serveur JMX";
    }
    @Override
    protected String cannotUnregisterEndpoint$str() {
        return "WFLYWS0016: Impossible de dés-enregistrer endpoint: %1$s à partir du serveur JMX";
    }
    @Override
    protected String invalidHandlerChainFile$str() {
        return "WFLYWS0017: Fichier de chaîne de gestionnaires non valide: %1$s";
    }
    @Override
    protected String webMethodMustNotBeStaticOrFinal$str() {
        return "WFLYWS0018: La méthode de service web %1$s ne doit pas être statique ou finale. Voir la section 5.3.2.4.2 de \"Jakarta Enterprise Web Services 2.0\".";
    }
    @Override
    protected String webMethodMustBePublic$str() {
        return "WFLYWS0019: La méthode du service Web %1$s doit être publique. Voir la section 5.3.2.4.2 de \"Jakarta Enterprise Web Services 2.0\".";
    }
    @Override
    protected String webServiceMethodNotFound$str() {
        return "WFLYWS0020: La classe d'implémentation %1$s du service web ne contient pas de méthode %2$s";
    }
    @Override
    protected String accessibleWebServiceMethodNotFound$str() {
        return "WFLYWS0021: La classe d'implémentation %1$s du service web ne contient pas de méthode %2$s accessible";
    }
    @Override
    protected String finalizeMethodNotAllowed$str() {
        return "WFLYWS0022: La classe d'implémentation de service web %1$s ne déclare pas forcément de méthode finalize(). Voir la section 5.3.2.4.2 de \"Jakarta Enterprise Web Services 2.0\".";
    }
    @Override
    protected String nullEndpointName$str() {
        return "WFLYWS0023: Nom du point de terminaison nul";
    }
    @Override
    protected String nullEndpointClass$str() {
        return "WFLYWS0024: Classe du point de terminaison nulle";
    }
    @Override
    protected String classLoaderResolutionFailed$str() {
        return "WFLYWS0025: Impossible de résoudre le module ou le chargeur de classe pour le déploiement %1$s";
    }
    @Override
    protected String missingHandlerChainConfigFile$str() {
        return "WFLYWS0026: Fichier de configuration de la chaîne de gestionnaires %1$s introuvable dans %2$s";
    }
    @Override
    protected String unexpectedElement$str() {
        return "WFLYWS0027: Élément inattendu : %1$s";
    }
    @Override
    protected String unexpectedEndTag$str() {
        return "WFLYWS0028: Balise de fin inattendue : %1$s";
    }
    @Override
    protected String unexpectedEndOfDocument$str() {
        return "WFLYWS0029: La fin du document XML a été atteinte de manière inattendue";
    }
    @Override
    protected String missingDeploymentAspectClassAttribute$str() {
        return "WFLYWS0030: Impossible de trouver l'attribut de classe pour l'aspect de déploiement";
    }
    @Override
    protected String cannotInstantiateDeploymentAspect$str() {
        return "WFLYWS0031: Impossible de créer un aspect de déploiement de classe : %1$s";
    }
    @Override
    protected String missingPropertyNameAttribute$str() {
        return "WFLYWS0032: Impossible de trouver l'attribut de nom de la propriété pour l'aspect de déploiement : %1$s";
    }
    @Override
    protected String missingPropertyClassAttribute$str() {
        return "WFLYWS0033: Impossible de trouver l'attribut de classe de la propriété pour l'aspect de déploiement : %1$s";
    }
    @Override
    protected String unsupportedPropertyClass$str() {
        return "WFLYWS0034: Classe de propriété non prise en charge : %1$s";
    }
    @Override
    protected String cannotInstantiateList$str() {
        return "WFLYWS0035: Impossible de créer une liste de type : %1$s";
    }
    @Override
    protected String cannotInstantiateMap$str() {
        return "WFLYWS0036: Impossible de créer une carte (map) de type : %1$s";
    }
    @Override
    protected String noMetricsAvailable$str() {
        return "WFLYWS0037: Aucun métrique disponible";
    }
    @Override
    protected String cannotFindComponentView$str() {
        return "WFLYWS0038: N'a pas pu trouver l'affichage du composant : %1$s";
    }
    @Override
    protected String missingChild$str() {
        return "WFLYWS0039: L'enfant '%1$s' est introuvable pour VirtualFile : %2$s";
    }
    @Override
    protected String createContextPhaseFailed$str() {
        return "WFLYWS0040: Échec de la création du contexte";
    }
    @Override
    protected String startContextPhaseFailed$str() {
        return "WFLYWS0041: Échec du démarrage du contexte";
    }
    @Override
    protected String stopContextPhaseFailed$str() {
        return "WFLYWS0042: Échec de l'arrêt du contexte";
    }
    @Override
    protected String destroyContextPhaseFailed$str() {
        return "WFLYWS0043: Échec de la destruction du contexte";
    }
    @Override
    protected String cannotInstantiateServletDelegate$str() {
        return "WFLYWS0044: Impossible de créer un délégué de servlet : %1$s";
    }
    @Override
    protected String missingDeploymentProperty$str() {
        return "WFLYWS0045: Impossible d'obtenir une propriété de déploiement : %1$s";
    }
    @Override
    protected String multipleSecurityDomainsDetected$str() {
        return "WFLYWS0046: De multiples domaines de sécurité ne sont pas pris en charge. Premier domaine : '%1$s' second domaine : '%2$s'";
    }
    @Override
    protected String sameUrlPatternRequested$str() {
        return "WFLYWS0047: Le point de terminaison Web Service %1$s avec le schéma d'URL %2$s est déjà enregistré. Le point de terminaison Web Service %3$s requiert le même schéma d'URL.";
    }
    @Override
    protected String invalidServiceRefSetterMethodName$str() {
        return "WFLYWS0048: La cible d'injection @WebServiceRef est invalide. Seules les méthodes setter sont autorisées : %1$s";
    }
    @Override
    protected String requiredServiceRefName$str() {
        return "WFLYWS0049: L'attribut @WebServiceRef 'name' est requis pour les annotations de niveau de classe.";
    }
    @Override
    protected String requiredServiceRefType$str() {
        return "WFLYWS0050: L'attribut @WebServiceRef 'type' est requis pour les annotations de niveau de classe.";
    }
    @Override
    protected String missingConfig$str() {
        return "WFLYWS0051: Config %1$s n'existe pas";
    }
    @Override
    protected String wrongHandlerChainType$str() {
        return "WFLYWS0052: Type de chaîne de gestionnaires non pris en charge : %1$s. Les types pris en charge sont soit %2$s, soit %3$s";
    }
    @Override
    protected String missingHandlerChain$str() {
        return "WFLYWS0054: Config %1$s : %2$s chaîne de gestionnaires avec l'id %3$s n'existe pas";
    }
    @Override
    protected String cannotGetURLForDescriptor$str() {
        return "WFLYWS0057: Impossible d'obtenir URL pour : %1$s";
    }
    @Override
    protected String jaxRpcNotSupported$str() {
        return "WFLYWS0058: Jakarta XML RPC non pris en charge";
    }
    @Override
    protected String invalidLibraryInDeployment$str() {
        return "WFLYWS0059: %1$s bibliothèques (%2$s) détectées dans le déploiement ws endpoint. Vous devez fournir un déploiement qui convient en remplaçant les bibliothèques intégrées par des dépendances de module de conteneur ou vous devrez désactiver le sous-système des services web du déploiement en cours en y ajoutant un descripteur jboss-deployment-structure.xml qui convient. L'ancienne approche est conseillée, car l'approche la plus récente entraîne la désactivation des services web Java EE et de la fonctionnalité spécifique à JBoss WS.";
    }
    @Override
    protected String endpointClassNotFound$str() {
        return "WFLYWS0060: La classe de point de terminaison de service web %1$s n'a pas été trouvée";
    }
    @Override
    protected String declaredEndpointInterfaceClassNotFound$str() {
        return "WFLYWS0061: L'interface de point de terminaison %1$s déclarée dans l'annotation @WebService du bean %2$s d'implémentation du service web, n'a pas été trouvée.";
    }
    @Override
    protected String jwsWebServiceClassVerificationFailed$str() {
        return "WFLYWS0062: La vérification de la classe d'implémentation de Java Service Web %1$s a échoué.";
    }
    @Override
    protected String couldNotUpdateServerConfigBecauseOfReloadRequired$str() {
        return "WFLYWS0063: N'a pas pu mettre à jour la configuration de serveur WS à cause de mises à jour de l'ancien modèle en attente de mise(s) à jour.";
    }
    @Override
    protected String couldNotUpdateServerConfigBecauseOfExistingWSDeployment$str() {
        return "WFLYWS0064: Impossible de mettre à jour la configuration du serveur WS à cause d'un déploiement WS existant sur le serveur.";
    }
    @Override
    protected String invalidWSServlet$str() {
        return "WFLYWS0066: Classe de servlet %1$s déclarée dans le fichier web.xml; vous devrez fournir un déploiement basé sur JBossWS ou vous devrez désactiver le sous-système des services web du déploiement en cours en y ajoutant un descripteur jboss-deployment-structure.xml qui convient. La dernière méthode est conseillée, car la précédente entraîne la désactivation de la plupart des services web Java EE ou de toute fonctionnalité spécifique à JBossWS.";
    }
    @Override
    protected String couldNotActivateSubsystem$str() {
        return "WFLYWS0067: N'a pas pu activer le sous-système de service web.";
    }
    @Override
    protected String failedAuthorization$str() {
        return "WFLYWS0070: L'autorisation pour l'utilisateur %1$s a échoué";
    }
    @Override
    protected String failedAuthentication$str() {
        return "WFLYWS0071: N'a pas pu authentifier le nom d'utilisateur %1$s: nom d’utilisateur / mot de passe incorrects";
    }
    @Override
    protected String failedAuthenticationWithException$str() {
        return "WFLYWS0072: Erreur lors de l'authentification du nom d'utilisateur %1$s. Message d'exception : %2$s";
    }
    @Override
    protected String endpointAlreadyStopped$str() {
        return "WFLYWS0073: Le point de terminaison cible %1$s est en cours de suppression de développement ou s'est arrêté";
    }
    @Override
    protected String warningLibraryInDeployment$str() {
        return "WFLYWS0068: Une bibliothèque potentiellement problématique %1$s (%2$s) a été détectée dans le déploiement de ws endpoint ; vérifiez si cette bibliothèque puisse être remplacée par un module de conteneur";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYWS0074: Le déploiement est configuré pour utiliser une sécurité ancienne qui n'est plus prise en charge.";
    }
    @Override
    protected String onlyStringPasswordAccepted$str() {
        return "WFLYWS0075: seul le mot de passe de chaîne est accepté";
    }
    @Override
    protected String checkModuleDependency$str() {
        return "WFLYWS0076: Annotation '@%1$s' trouvé en classe '%2$s « Veuillez vous assurer »%3$s' la dépendance du module est ajoutée à votre déploiement.";
    }
}
