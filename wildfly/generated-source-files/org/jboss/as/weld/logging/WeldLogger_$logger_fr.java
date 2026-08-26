package org.jboss.as.weld.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:55+0200")
public class WeldLogger_$logger_fr extends WeldLogger_$logger implements WeldLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public WeldLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotLoadAnnotationIndexOfExternalBeanArchive$str() {
        return "WFLYWELD0054: Impossible de lire l'index fourni d'une archive externe de bean : %1$s";
    }
    @Override
    protected String cdiAnnotationsButNotBeanArchive$str() {
        return "WFLYWELD0013: Le déploiement %1$s contient des annotations Jakarta Contexts et Dependency Injection mais aucune archive de bean n'a été trouvée (aucun beans.xml ou classe avec des annotations de définition de bean n'était présent).";
    }
    @Override
    protected String couldNotReadEntries$str() {
        return "WFLYWELD0016: N'a pas pu lire les entrées";
    }
    @Override
    protected String couldNotFindPersistenceUnit$str() {
        return "WFLYWELD0037: Erreur d'injection d'une unité de persistance dans Jakarta Contexts et Dependency Injection. Impossible de trouver une unité de persistance nommée '%1$s' dans le déploiement %2$s pour le point d’injection %3$s";
    }
    @Override
    protected String couldNotDetermineUnderlyingType$str() {
        return "WFLYWELD0036: Impossible de déterminer la classe bean à partir du type de point d'injection de %1$s";
    }
    @Override
    protected String couldNotFindResource1$str() {
        return "WFLYWELD0044: Erreur d'injection d'une ressource dans un bean géré Jakarta Contexts et Dependency Injection. Impossible de trouver une ressource nommée %1$s";
    }
    @Override
    protected String doNotUnderstandProtocol$str() {
        return "WFLYWELD0017: L'analyseur d'URL ne comprend pas le protocole URL %1$s, les Contextes Jakarta et les beans d'injection de dépendance ne seront pas analysés.";
    }
    @Override
    protected String viewNotFoundOnEJB$str() {
        return "WFLYWELD0022: Affichage du type %1$s non trouvé sur Jakarta Enterprise Beans %2$s";
    }
    @Override
    protected String securityNotEnabled$str() {
        return "WFLYWELD0038: Impossible d'injecter le SecurityManager, la sécurité n'est pas activée";
    }
    @Override
    protected String couldNotLoadPortableExceptionClass$str() {
        return "WFLYWELD0007: Impossible de charger la classe d'extension portable %1$s";
    }
    @Override
    protected String rejectAttributesMustBeTrue$str() {
        return "WFLYWELD0048: Ces attributs doivent être définis sur 'true' pour pouvoir être utilisés avec CDI 1.0 « %1$s »";
    }
    @Override
    protected String extensionDoesNotImplementExtension$str() {
        return "WFLYWELD0021: Le service %1$s ne met pas en œuvre l'interface jakarta.enterprise.inject.spi.Extension";
    }
    @Override
    protected String couldNotLoadInterceptorClass$str() {
        return "WFLYWELD0020: Impossible de charger l'intercepteur de classe : %1$s";
    }
    @Override
    protected String injectionPointNotAJavabean$str() {
        return "WFLYWELD0032: Le point d'injection représente une méthode qui ne suit pas les conventions JavaBean (doit posséder exactement un paramètre) %1$s";
    }
    @Override
    protected String beanArchiveDiscovered$str() {
        return "%1$s trouvés";
    }
    @Override
    protected String failedToTearDownWeldContexts$str() {
        return "WFLYWELD0002: Échec de la destruction des contextes Weld";
    }
    @Override
    protected String incorrectBceTranslatorSetup$str() {
        return "WFLYWELD0064: Configuration incorrecte pour l'initialisation de LiteExtensionTranslator de Weld ; une unité de déploiement doit être spécifiée";
    }
    @Override
    protected String moreThanOneEjbResolved$str() {
        return "WFLYWELD0035: Résolu plus d'un Jakarta Enterprise Beans pour l’injection @EJB %1$s sur %2$s. Trouvé %3$s";
    }
    @Override
    protected String persistenceUnitFailed$str() {
        return "WFLYWELD0057: L'unité de persistance '%1$s' a échoué.";
    }
    @Override
    protected String startingWeldService$str() {
        return "WFLYWELD0009: Lancement du service Weld pour le déploiement %1$s";
    }
    @Override
    protected String parameterCannotBeNull$str() {
        return "WFLYWELD0031: %1$s ne peut pas être nul";
    }
    @Override
    protected String unableToLoadAnnotation$str() {
        return "N'a pas pu charger l'annotation %1$s";
    }
    @Override
    protected String notStarted$str() {
        return "WFLYWELD0041: %1$s n'est pas démarré";
    }
    @Override
    protected String annotationNotFound$str() {
        return "WFLYWELD0033: Annotation %1$s introuvable sur %2$s";
    }
    @Override
    protected String nameNotFoundInIndex$str() {
        return "WFLYWELD0050: %1$s n'a pas été trouvé dans l'index composite";
    }
    @Override
    protected String beansXmlValidationError$str() {
        return "WFLYWELD0012: Attention lors de la lecture de %1$s: %2$s %3$s";
    }
    @Override
    protected String cannotInject$str() {
        return "WFLYWELD0046: Impossible d'injecter le point d'injection %1$s";
    }
    @Override
    protected String persistenceUnitRemoved$str() {
        return "WFLYWELD0058: L'unité de persistance '%1$s' a été supprimée.";
    }
    @Override
    protected String couldNotFindResource2$str() {
        return "WFLYWELD0049: Erreur d'injection d'une ressource dans un bean géré Jakarta Contexts et Dependency Injection. Impossible de trouver une ressource nommée %1$s définie sur %2$s";
    }
    @Override
    protected String startingServicesForCDIDeployment$str() {
        return "WFLYWELD0006: Démarrage des services pour le déploiement de Jakarta Contexts et Dependency Injection : %1$s";
    }
    @Override
    protected String componentInterceptorSupportNotAvailable$str() {
        return "WFLYWELD0053: Impossible de charger la classe d'intercepteur sur le composant : %1$s";
    }
    @Override
    protected String errorHandlingFile$str() {
        return "WFLYWELD0060: Fichier de gestion des erreurs %1$s";
    }
    @Override
    protected String processingWeldDeployment$str() {
        return "WFLYWELD0003: Traitement du déploiement Weld %1$s";
    }
    @Override
    protected String duplicateBeansXml$str() {
        return "WFLYWELD0018: WEB-INF/beans.xml et WEB-INF/classes/META-INF/beans.xml présents à la fois. Utiliser les deux emplacements à la fois n'est pas une solution portable. Weld utilisera l'ancien emplacement pour ce déploiement.";
    }
    @Override
    protected String singletonNotSet$str() {
        return "WFLYWELD0039: Singleton non défini pour %1$s. Cela signifie que vous tentez d'accéder à un déploiement Weld avec ClassLoader Contexte Thread qui n'est pas associé au déploiement.";
    }
    @Override
    protected String loadingProxiesUsingDeploymentClassLoader$str() {
        return "WFLYWELD0052: Utilisation des chargeurs de classe de déploiement pour charger les classes de proxy pour le module %1$s. Package-private access ne fonctionnera pas. Pour régler cela, le module devra déclarer des dépendances sur %2$s";
    }
    @Override
    protected String weldNotInitialized$str() {
        return "WFLYWELD0056: Weld non initialisé pour l’instant";
    }
    @Override
    protected String couldNotDeterminePackage$str() {
        return "WFLYWELD0062: Impossible de déterminer le package à partir du nom de classe corrompu";
    }
    @Override
    protected String couldNotFindBeanManagerForDeployment$str() {
        return "WFLYWELD0005: Impossible de trouver BeanManager pour le déploiement %1$s";
    }
    @Override
    protected String beansXmlValidationWarning$str() {
        return "WFLYWELD0011: Attention lors de la lecture de %1$s: %2$s %3$s";
    }
    @Override
    protected String alreadyRunning$str() {
        return "WFLYWELD0040: %1$s est déjà en cours d'exécution";
    }
    @Override
    protected String beanDeploymentNotFound$str() {
        return "WFLYWELD0043: le BeanDeploymentArchive avec l'id %1$s est introuvable dans le déploiement";
    }
    @Override
    protected String cannotDetermineResourceName$str() {
        return "WFLYWELD0045: Impossible de déterminer le nom de la ressource. Les jndiName et mappedName sont tous les deux nuls";
    }
    @Override
    protected String unknownInterceptorClassForCDIInjection$str() {
        return "WFLYWELD0030: Classe d'interception inconnue pour Jakarta Contexts et Dependency injection %1$s";
    }
    @Override
    protected String unknownDeploymentType$str() {
        return "WFLYWELD0059: Type de déploiement inconnu %1$s";
    }
    @Override
    protected String failedToSetupWeldContexts$str() {
        return "WFLYWELD0001: Échec de l'installation des contextes Weld";
    }
    @Override
    protected String missingService$str() {
        return "WFLYWELD0061: Un seul prestataire de services est requis pour : %1$s";
    }
    @Override
    protected String exceptionClearingThreadState$str() {
        return "WFLYWELD0014: Exception qui détruit l'état du thread";
    }
    @Override
    protected String stoppingWeldService$str() {
        return "WFLYWELD0010: Arrêt du service Weld pour le déploiement %1$s";
    }
    @Override
    protected String injectionTypeNotValue$str() {
        return "WFLYWELD0008: L'injection @Resource de type %1$s n'est pas prise en charge pour les composants non-Jakarta Enterprise Beans. Point d'injection : %2$s";
    }
    @Override
    protected String couldNotGetBeansXmlAsURL$str() {
        return "WFLYWELD0019: Pourrait récupérer le fichier beans.xml en tant qu'URL lors du traitement du fichier : %1$s";
    }
    @Override
    protected String cannotIndexClassName$str() {
        return "WFLYWELD0055: Impossible d'indexer la classe[%1$s] d'une archive externe de bean : %2$s";
    }
    @Override
    protected String originalClassDoesNotHaveAModule$str() {
        return "WFLYWELD0063: Le %1$s original n'a pas de module";
    }
    @Override
    protected String ejbNotResolved$str() {
        return "WFLYWELD0034: Impossible de résoudre l'injection @EJB pour %1$s sur %2$s";
    }
    @Override
    protected String cannotUseAtRuntime$str() {
        return "WFLYWELD0047: %1$s ne peut pas être utilisé en cours d'exécution";
    }
    @Override
    protected String cannotLoadClass$str() {
        return "WFLYWELD0051: N'a pas pu charger %1$s";
    }
}
