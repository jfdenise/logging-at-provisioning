package org.jboss.as.jmx.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:23+0200")
public class JmxLogger_$logger_fr extends JmxLogger_$logger implements JmxLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JmxLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String attributeNotWritable$str() {
        return "WFLYJMX0008: L'attribut %1$s n'est pas accessible en écriture";
    }
    @Override
    protected String cannotUnregisterMBeansUnderReservedDomain$str() {
        return "WFLYJMX0045: Vous ne pouvez pas annuler l'enregistrement de mbeans sous le domaine réservé '%1$s'";
    }
    @Override
    protected String unknownChild$str() {
        return "WFLYJMX0031: Dépendant %1$s inconnu";
    }
    @Override
    protected String unsupportedMethod$str() {
        return "WFLYJMX0043: %1$s n'est pas pris en charge";
    }
    @Override
    protected String notAuthorizedToExecuteOperation$str() {
        return "WFLYJMX0040: Non autorisé à invoquer l'opération: '%1$s'";
    }
    @Override
    protected String errorUnregisteringMBeanWithBadCalculatedName$str() {
        return "WFLYJMX0047: Une erreur s'est produite lors de l'annulation de l'enregistrement de '%1$s' MBean dans un domaine JMX réservé";
    }
    @Override
    protected String differentLengths$str() {
        return "WFLYJMX0012: %1$s et %2$s ont des longueurs différentes";
    }
    @Override
    protected String cannotSetAttribute$str() {
        return "WFLYJMX0010: N'a pas pu définir %1$s";
    }
    @Override
    protected String removeNotificationListenerNotAllowed$str() {
        return "WFLYJMX0051: Supprimer un listener de notification par ObjectName%1$s n'est pas pris en charge";
    }
    @Override
    protected String descriptorMBeanExpressionSupportFalse$str() {
        return "Ce mbean ne prend pas en charge les expressions de paramètres d'opérations ou d'attributs, même si elles sont prises en charge par le modèle sous-jacent. Au lieu de cela, l'attribut est retourné, et la valeur réelle saisie devra être utilisée quand on écrit les opérations attributs/invocation.";
    }
    @Override
    protected String registrationNotFound$str() {
        return "WFLYJMX0022: Aucun enregistrement trouvé pour l'adresse de chemin %1$s";
    }
    @Override
    protected String notAuthorizedToWriteAttribute$str() {
        return "WFLYJMX0038: Non autorisé à l'attribut (écriture): '%1$s'";
    }
    @Override
    protected String descriptorAlternateMBeanLegacy$str() {
        return "Pour lire les valeurs résolues et pour écrire les attributs saisis et les paramètres d'opérations saisis, aller à %1$s";
    }
    @Override
    protected String descriptorAttributeExpressionsAllowedFalse$str() {
        return "Ce paramètre ne supporte pas les expressions";
    }
    @Override
    protected String cannotCreateObjectName$str() {
        return "WFLYJMX0009: N'a pas pu créer ObjectName pour l'adresse %1$s à partir de la chaîne %2$s";
    }
    @Override
    protected String objectNameCantBeNull$str() {
        return "WFLYJMX0032: ObjectName ne peut être Null";
    }
    @Override
    protected String attributeNotFound$str() {
        return "WFLYJMX0007: N'a pas pu trouver d'attribut correspondant : %1$s";
    }
    @Override
    protected String compositeEntryValueDescription$str() {
        return "La valeur";
    }
    @Override
    protected String dontKnowHowToDeserialize$str() {
        return "WFLYJMX0042: Ignore comment désérialiser";
    }
    @Override
    protected String compositeEntryTypeDescription$str() {
        return "Une entrée";
    }
    @Override
    protected String descriptorAttributeExpressionsAllowedTrue$str() {
        return "Ce paramètre supporte les expressions";
    }
    @Override
    protected String cannotRegisterMBeansUnderReservedDomain$str() {
        return "WFLYJMX0044: Vous ne pouvez pas enregistrer de mbeans sous le domaine réservé '%1$s'";
    }
    @Override
    protected String noOperationCalled1$str() {
        return "WFLYJMX0019: Aucune opération n'a appelé '%1$s'";
    }
    @Override
    protected String descriptorMBeanExpressionSupportTrue$str() {
        return "Le mbean prend en charge les expression raw pour les paramètres d'opérations ou d'attributs quand elles sont prises en charge par le modèle sous-jacent. Si aucune expression n'est utilisée, la représentation string sera convertie en valeur réelle d'attribut.";
    }
    @Override
    protected String propertyValue$str() {
        return "La valeur de la propriété";
    }
    @Override
    protected String invalidAttributeType$str() {
        return "WFLYJMX0013: Mauvais type pour '%1$s'";
    }
    @Override
    protected String mbeanNotFound$str() {
        return "WFLYJMX0017: Pas de MBean trouvé pour le nom %1$s";
    }
    @Override
    protected String noOperationCalled2$str() {
        return "WFLYJMX0020: Aucune opération n'a appelé '%1$s' à %2$s";
    }
    @Override
    protected String unknownValue$str() {
        return "WFLYJMX0025: Valeur %1$s inconnue";
    }
    @Override
    protected String addNotificationListenerNotAllowed$str() {
        return "WFLYJMX0050: Ajouter un listener de notification par ObjectName%1$s n'est pas pris en charge";
    }
    @Override
    protected String compositeEntryTypeName$str() {
        return "entrée";
    }
    @Override
    protected String unknownType$str() {
        return "WFLYJMX0024: Type %1$s inconnu";
    }
    @Override
    protected String cannotCreateMBeansInReservedDomain$str() {
        return "WFLYJMX0041: Vous ne pouvez pas créer de mbeans sous le domaine réservé '%1$s'";
    }
    @Override
    protected String compositeEntryKeyDescription$str() {
        return "La clé";
    }
    @Override
    protected String compositeMapDescription$str() {
        return "Une mappe est indexée par 'key' (clé)";
    }
    @Override
    protected String complexCompositeEntryTypeName$str() {
        return "Type complexe";
    }
    @Override
    protected String unknownDomain$str() {
        return "WFLYJMX0029: Domaine inconnu: %1$s";
    }
    @Override
    protected String badDomainInCalculatedObjectNameException$str() {
        return "WFLYJMX0046: Le nom ObjectName provenant de MBeanRegistration.preRegister() '%1$s' se situe dans un domaine JMX réservé";
    }
    @Override
    protected String invalidKey$str() {
        return "WFLYJMX0014: Clé non valide %1$s pour %2$s";
    }
    @Override
    protected String mbeanRegistrationFailed$str() {
        return "WFLYJMX0018: N'a pas pu enregistrer le mbean [%1$s]";
    }
    @Override
    protected String invalidObjectName3$str() {
        return "WFLYJMX0015: ObjectName non valide : %1$s, %2$s; %3$s";
    }
    @Override
    protected String expressionCannotBeConvertedIntoTargeteType$str() {
        return "WFLYJMX0030: L'expression ne peut être convertie en un type %1$s cible";
    }
    @Override
    protected String jmxConnectorNotSupported$str() {
        return "WFLYJMX0006: <jmx-connector/> n'est plus pris en charge. <remoting-connector/> doit être utilisé à la place pour permettre les connexions distantes via JBoss Remoting.";
    }
    @Override
    protected String unauthorized$str() {
        return "WFLYJMX0037: Accès non autorisé";
    }
    @Override
    protected String notAuthorizedToReadAttribute$str() {
        return "WFLYJMX0039: Non autorisé à l'attribut (lecture): '%1$s'";
    }
    @Override
    protected String cannotUnregisterObject$str() {
        return "WFLYJMX0004: Pas d'ObjectName disponible à dés-enregistrer";
    }
    @Override
    protected String invalidObjectName2$str() {
        return "WFLYJMX0015: ObjectName non valide : %1$s; %2$s";
    }
    @Override
    protected String removeNotificationListerWithObjectNameNotSupported$str() {
        return "WFLYJMX0049: Supprimer un listener de notification par ObjectName%1$s n'est pas pris en charge";
    }
    @Override
    protected String noHandlerCalled$str() {
        return "WFLYJMX0036: Il n'y a pas de handler nommé '%1$s'";
    }
    @Override
    protected String descriptorAlternateMBeanExpressions$str() {
        return "Pour pouvoir définir ou lire les expression, aller à %1$s";
    }
    @Override
    protected String propertyCompositeType$str() {
        return "Un type composite représentant une propriété";
    }
    @Override
    protected String wildcardNameParameterRequired$str() {
        return "WFLYJMX0026: Nom du paramètre requis pour ajouter le caractère générique";
    }
    @Override
    protected String propertyName$str() {
        return "Le nom de la propriété";
    }
    @Override
    protected String complexCompositeEntryTypeDescription$str() {
        return "Un type complexe";
    }
    @Override
    protected String invalidObjectName4$str() {
        return "WFLYJMX0015: ObjectName non valide : %1$s; %2$s, %3$s; %4$s";
    }
    @Override
    protected String compositeMapName$str() {
        return "Une mappe";
    }
    @Override
    protected String addNotificationListerWithObjectNameNotSupported$str() {
        return "WFLYJMX0048: Ajouter un listener de notification par ObjectName%1$s n'est pas pris en charge";
    }
    @Override
    protected String unregistrationFailure$str() {
        return "WFLYJMX0005: N'a pas pu supprimer l'enregistrement [%1$s]";
    }
}
