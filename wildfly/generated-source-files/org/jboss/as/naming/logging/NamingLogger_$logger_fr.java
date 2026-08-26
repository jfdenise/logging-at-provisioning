package org.jboss.as.naming.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:42+0200")
public class NamingLogger_$logger_fr extends NamingLogger_$logger implements NamingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public NamingLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String startingService$str() {
        return "WFLYNAM0003: Démarrage du service de nommage";
    }
    @Override
    protected String duplicateBinding$str() {
        return "WFLYNAM0023: Liaisons JNDI dupliquées pour '%1$s' non compatibles. [%2$s] != [%3$s]";
    }
    @Override
    protected String threadInterrupt$str() {
        return "WFLYNAM0046: Thread interrompu alors qu'il recevait la référence du service pour %1$s";
    }
    @Override
    protected String notAnInstanceOfObjectFactory$str() {
        return "WFLYNAM0055: La classe %1$s du module %2$s n'est pas une instance d'ObjetFactory";
    }
    @Override
    protected String entryNotRegistered$str() {
        return "WFLYNAM0025: L'entrée Jndi '%1$s' n'est pas encore enregistrée dans le contexte '%2$s'";
    }
    @Override
    protected String failedToDestroyRootContext$str() {
        return "WFLYNAM0026: Échec de la destruction du contexte racine";
    }
    @Override
    protected String cannotDeferenceObject$str() {
        return "WFLYNAM0016: N'a pas pu déréférencier l'objet";
    }
    @Override
    protected String tableIsFull$str() {
        return "WFLYNAM0045: Le tableau est rempli !";
    }
    @Override
    protected String moduleNotFound$str() {
        return "WFLYNAM0065: Impossible de charger le module %1$s - le module ou une de ses dépendances est manquant [%2$s]";
    }
    @Override
    protected String cannotResolveService1$str() {
        return "WFLYNAM0020: Impossible de résoudre le service %1$s";
    }
    @Override
    protected String jndiViewNotAvailable$str() {
        return "WFLYNAM0038: La vue Jndi est seulement accessible en mode runtime.";
    }
    @Override
    protected String serviceAlreadyBound$str() {
        return "WFLYNAM0044: Service ayant pour nom [%1$s] déjà relié.";
    }
    @Override
    protected String failedToInstantiate$str() {
        return "WFLYNAM0027: Échec d'instanciation %1$s %2$s à partir du chargeur de classes %3$s";
    }
    @Override
    protected String couldNotLoadClassFromModule$str() {
        return "WFLYNAM0053: N'a pas pu charger la classe %1$s à partir du module %2$s";
    }
    @Override
    protected String cannotRebindExternalContext$str() {
        return "WFLYNAM0064: N'a pas pu relier la recherche de contexte externe";
    }
    @Override
    protected String illegalContextInName$str() {
        return "WFLYNAM0030: Contexte illégal dans le nom : %1$s";
    }
    @Override
    protected String failedToStopRemoteNamingService$str() {
        return "WFLYNAM0067: Échec de l'arrêt du service de nommage à distance";
    }
    @Override
    protected String unsupportedSimpleBindingType$str() {
        return "WFLYNAM0050: Type de liaison simple %1$s non supporté";
    }
    @Override
    protected String cannotResolveServiceBug$str() {
        return "WFLYNAM0022: N'a pas pu résoudre la référence du service à %1$s dans la fabrique %2$s. Il s'agit d'un bogue dans ServiceReferenceObjectFactory. L'état était %3$s.";
    }
    @Override
    protected String invalidJndiName$str() {
        return "WFLYNAM0033: Un nom JNDI valide doit être fourni : %1$s";
    }
    @Override
    protected String invalidLoadFactor$str() {
        return "WFLYNAM0034: Le facteur de chargement doit être supérieur à 0 et inférieur ou égal à 1";
    }
    @Override
    protected String invalidNameForContextBinding$str() {
        return "WFLYNAM0047: Nom invalide pour le contexte de nommage %1$s";
    }
    @Override
    protected String emptyNameNotAllowed$str() {
        return "WFLYNAM0024: Un nom vide n'est pas autorisé";
    }
    @Override
    protected String resourceLookupForInjectionFailed$str() {
        return "WFLYNAM0059: Le recherche d'injection de la ressource à échoué : %1$s";
    }
    @Override
    protected String bindingTypeRequiresAttributeDefined$str() {
        return "WFLYNAM0060: Les types de liaison %1$s doivent avoir des attributs nommés %2$s définis";
    }
    @Override
    protected String failedToReadContextEntries$str() {
        return "WFLYNAM0028: N'a pas pu lire les entrées de contexte %1$s.";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYNAM0001: Démarrage du sous-système de nommage";
    }
    @Override
    protected String couldNotInstantiateClassInstanceFromModule$str() {
        return "WFLYNAM0054: N'a pas pu instancier l'instance de classe %1$s à partir du module %2$s";
    }
    @Override
    protected String failedToLookupJndiViewValue$str() {
        return "WFLYNAM0013: N'a pas pu obtenir une valeur de vue jndi pour l'entrée %1$s.";
    }
    @Override
    protected String cannotListNonContextBinding$str() {
        return "WFLYNAM0017: N'a pas pu lister une liaison hors eontexte.";
    }
    @Override
    protected String cannotLookupLink$str() {
        return "WFLYNAM0018: N'a pas pu trouver le lien";
    }
    @Override
    protected String invalidPermissionAction$str() {
        return "WFLYNAM0036: permission invalide, action inconnue : %1$s";
    }
    @Override
    protected String couldNotLoadModule$str() {
        return "WFLYNAM0052: Impossible de charger le module [%1$s]";
    }
    @Override
    protected String cannotAddToReadOnlyPermissionCollection$str() {
        return "WFLYNAM0014: Tentative d'ajout d'une permission dans une PermissionCollection en lecture seule";
    }
    @Override
    protected String unableToTransformURLBindingValue$str() {
        return "WFLYNAM0051: Impossible de transformer la valeur de liaison d'URL %1$s";
    }
    @Override
    protected String invalidTableSize$str() {
        return "WFLYNAM0037: Impossible d'avoir une table de taille négative !";
    }
    @Override
    protected String failedToStartRemoteNamingService$str() {
        return "WFLYNAM0066: Échec du démarrage du service de nommage à distance";
    }
    @Override
    protected String invalidContextReference$str() {
        return "WFLYNAM0032: Référence de contexte non valide. Ne correspond pas à une référence '%1$s'.";
    }
    @Override
    protected String cacheNotValidForBindingType$str() {
        return "WFLYNAM0061: Le type de liaison %1$s ne peut pas avoir d'attribut 'cache'";
    }
    @Override
    protected String nameNotFoundInContext$str() {
        return "WFLYNAM0039: Nom '%1$s' non trouvé dans le contexte '%2$s'";
    }
    @Override
    protected String cannotResolveService3$str() {
        return "WFLYNAM0021: N'a pas pu résoudre la référence du service à %1$s dans la fabrique %2$s. Le service était dans l'état %3$s.";
    }
    @Override
    protected String readOnlyNamingContext$str() {
        return "WFLYNAM0043: Le contexte de nommage est en lecture-seule";
    }
    @Override
    protected String invalidPermission$str() {
        return "WFLYNAM0035: permission invalide, action inconnue : %1$s";
    }
    @Override
    protected String objectFactoryCreationFailure$str() {
        return "WFLYNAM0042: N'a pas pu créer une fabrique d'objets à partir du chargeur de classes.";
    }
    @Override
    protected String unknownBindingType$str() {
        return "WFLYNAM0049: Type de liaison %1$s inconnu";
    }
    @Override
    protected String cannotBeNull$str() {
        return "WFLYNAM0015: %1$s ne peut pas être nul.";
    }
    @Override
    protected String failedToStart$str() {
        return "WFLYNAM0029: Échec du démarrage %1$s";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYNAM0063: Service %1$s non démarré";
    }
    @Override
    protected String failedToReleaseBinderService$str() {
        return "WFLYNAM0012: N'a pas pu libérer le service de liaisons, utilisé pour une liaison JNDI faite en cours d'exécution";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYNAM0041: %1$s est nul";
    }
    @Override
    protected String failedToSet$str() {
        return "WFLYNAM0002: N'a pas pu définir %1$s";
    }
    @Override
    protected String invalidNamespaceForBinding$str() {
        return "WFLYNAM0048: Le nom de liaison n'est pas valide %1$s, le nom doit démarrer par un %2$s";
    }
    @Override
    protected String lookupError$str() {
        return "WFLYNAM0062: N'a pas pu trouver %1$s";
    }
}
