package org.jboss.as.pojo.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:09+0200")
public class PojoLogger_$logger_fr extends PojoLogger_$logger implements PojoLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PojoLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String oldNamespace$str() {
        return "WFLYPOJO0001: Espace-nom bean/pojo hérité trouvé : %1$s - avec certaines fonctionnalités xml sans doute manquantes (exceptions possibles).";
    }
    @Override
    protected String ignoreUninstallError$str() {
        return "WFLYPOJO0002: Ignore la désinstallation sur la cible : %1$s";
    }
    @Override
    protected String invokingCallback$str() {
        return "WFLYPOJO0003: Erreur d'invocation du callback : %1$s";
    }
    @Override
    protected String errorAtIncallback$str() {
        return "WFLYPOJO0004: Erreur d'invocation d'incallback : %1$s";
    }
    @Override
    protected String errorAtUncallback$str() {
        return "WFLYPOJO0005: Erreur d'invocation d'uncallback : %1$s";
    }
    @Override
    protected String noModuleFound$str() {
        return "WFLYPOJO0006: N'a pas pu obtenir la pièce joint du module pour %1$s";
    }
    @Override
    protected String missingReflectionIndex$str() {
        return "WFLYPOJO0007: Index de réflexion de déploiement manquant pour %1$s";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYPOJO0008: N'a pas pu lire POJO xml [ %1$s ]";
    }
    @Override
    protected String cannotInstantiateCollection$str() {
        return "WFLYPOJO0010: N'a pas pu instancier la nouvelle instance de la collection.";
    }
    @Override
    protected String cannotInstantiateMap$str() {
        return "WFLYPOJO0011: N'a pas pu instancier la nouvelle instance de mappage.";
    }
    @Override
    protected String tooDynamicFromFactory$str() {
        return "WFLYPOJO0012: Trop dynamique pour déterminer le type injecté de la fabrique !";
    }
    @Override
    protected String tooDynamicFromDependency$str() {
        return "WFLYPOJO0013: Trop dynamique pour déterminer le type injecté de la dépendance !";
    }
    @Override
    protected String notValueConfig$str() {
        return "WFLYPOJO0014: Le nœud précédent ne correspond pas à une config de valeur : %1$s";
    }
    @Override
    protected String nullFactoryMethod$str() {
        return "WFLYPOJO0015: Méthode de fabrique nulle !";
    }
    @Override
    protected String nullBeanInfo$str() {
        return "WFLYPOJO0016: Info Bean Nul !";
    }
    @Override
    protected String invalidMatchSize$str() {
        return "WFLYPOJO0017: Nombre non valide de types de correspondances d'instances : %1$s, type: %2$s";
    }
    @Override
    protected String cannotDetermineInjectedType$str() {
        return "WFLYPOJO0018: N'a pas pu déterminer le type injecté : %1$s, essaie de définir l'attribut de classe (si disponible).";
    }
    @Override
    protected String nullOrEmptyAlias$str() {
        return "WFLYPOJO0019: Alias nul ou vide.";
    }
    @Override
    protected String nullOrEmptyDependency$str() {
        return "WFLYPOJO0020: Dépendance nulle ou vide.";
    }
    @Override
    protected String missingValue$str() {
        return "WFLYPOJO0021: Valeur manquante";
    }
    @Override
    protected String nullValue$str() {
        return "WFLYPOJO0022: Valeur nulle";
    }
    @Override
    protected String nullName$str() {
        return "WFLYPOJO0023: Nom nul";
    }
    @Override
    protected String nullMethodName$str() {
        return "WFLYPOJO0024: Nom de méthode nul !";
    }
    @Override
    protected String unknownType$str() {
        return "WFLYPOJO0025: Type inconnu : %1$s";
    }
    @Override
    protected String illegalParameterLength$str() {
        return "WFLYPOJO0026: Longueur de paramètre illégal : %1$s";
    }
    @Override
    protected String missingFactoryMethod$str() {
        return "WFLYPOJO0027: Méthode de fabrique manquante dans la configuration ctor : %1$s";
    }
    @Override
    protected String missingBeanInfo$str() {
        return "WFLYPOJO0028: Info bean manquante, définir l'attribut de la classe du bean : %1$s";
    }
    @Override
    protected String wrongTypeSize$str() {
        return "WFLYPOJO0029: Mauvaise taille de type, ne correspond pas aux paramètres !";
    }
    @Override
    protected String nullClassInfo$str() {
        return "WFLYPOJO0030: ClassInfo nulle !";
    }
    @Override
    protected String ctorNotFound$str() {
        return "WFLYPOJO0031: Pas de tel constructeur : %1$s pour la classe %2$s.";
    }
    @Override
    protected String methodNotFound$str() {
        return "WFLYPOJO0032: Méthode non trouvée %1$s%2$s pour la classe %3$s.";
    }
    @Override
    protected String getterNotFound$str() {
        return "WFLYPOJO0033: Pas de getter: %1$s sur la classe %2$s.";
    }
    @Override
    protected String setterNotFound$str() {
        return "WFLYPOJO0034: Pas de setter: %1$s sur la classe %2$s.";
    }
    @Override
    protected String ambiguousMatch1$str() {
        return "WFLYPOJO0035: Correspondance ambiguë %1$s.";
    }
    @Override
    protected String ambiguousMatch3$str() {
        return "WFLYPOJO0036: Résultat de correspondance ambiguë de %1$s pour le nom %2$s sur la classe %3$s.";
    }
    @Override
    protected String fieldNotFound$str() {
        return "WFLYPOJO0037: Champ non trouvé %1$s pour la classe %2$s.";
    }
    @Override
    protected String parsingException$str() {
        return "WFLYPOJO0038: Exception lors du traitement du fichier du descripteur POJO : %1$s";
    }
    @Override
    protected String cannotDetermineType$str() {
        return "WFLYPOJO0039: Impossible de déterminer le type - informations insuffisantes sur la configuration !";
    }
}
