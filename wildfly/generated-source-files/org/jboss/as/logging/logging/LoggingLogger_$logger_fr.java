package org.jboss.as.logging.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:28+0200")
public class LoggingLogger_$logger_fr extends LoggingLogger_$logger implements LoggingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public LoggingLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String invalidPropertyAttribute$str() {
        return "WFLYLOG0007: L'attribut %1$s n'a pas pu être défini car il ne correspond pas à une valeur de propriété configurable.";
    }
    @Override
    protected String perDeploymentPropertyDeprecated$str() {
        return "WFLYLOG0015: La propriété de déploiement par journalisation (%1$s) est déconseillée. Veuillez utiliser l'attribut %2$s pour activer/désactiver la journalisation par déploiement.";
    }
    @Override
    protected String loggerNotFound$str() {
        return "WFLYLOG0035: L'enregistreur '%1$s' n'a pas été trouvé.";
    }
    @Override
    protected String unresolvablePathExpressions$str() {
        return "WFLYLOG0090: Les expressions de chemin suivantes n'ont pas pu être résolues quand on tentait de déterminer quels fichiers de journalisation étaient disponibles à la lecture: %1$s";
    }
    @Override
    protected String replacingNamedHandler$str() {
        return "WFLYLOG0012: Remplacement du gestionnaire '%1$s' lors de l'opération Ajouter. Soit le type de gestionnaire, soit le nom du module a été modifié par rapport à la configuration initiale.";
    }
    @Override
    protected String formatterNotFound$str() {
        return "WFLYLOG0061: Formatter '%1$s' non trouvé";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYLOG0006: N'a pas pu fermer la ressource %1$s";
    }
    @Override
    protected String suffixContainsMillis$str() {
        return "WFLYLOG0082: Le suffixe (%1$s) ne peut pas contenir de secondes ou de millisecondes.";
    }
    @Override
    protected String invalidEscapeFoundInFilterExpression$str() {
        return "WFLYLOG0071: Séquence d'échappement non valide trouvée dans l'expression de filtre";
    }
    @Override
    protected String pathManagerServiceNotStarted$str() {
        return "WFLYLOG0008: Le service de gestion de chemins ne semble pas avoir démarré. Tout changement risque d'être perdu pour cette raison.";
    }
    @Override
    protected String deploymentNameNotFound$str() {
        return "WFLYLOG0086: Le nom du déploiement est ne peut être déterminé à partir de l'adresse %1$s.";
    }
    @Override
    protected String handlerAttachedToHandlers$str() {
        return "WFLYLOG0044: Le handler %1$s est attaché aux handlers suivants et ne peut pas être supprimé; %2$s";
    }
    @Override
    protected String handlerAttachedToLoggers$str() {
        return "WFLYLOG0045: Le handler %1$s est attaché aux enregistreurs suivants et ne peut pas être supprimé ; %2$s";
    }
    @Override
    protected String invalidExceptionOutputType$str() {
        return "WFLYLOG0091: Le type de sortie d'exception %1$s n'est pas valide.";
    }
    @Override
    protected String expectedString$str() {
        return "WFLYLOG0074: Chaîne attendue suivant l'expression de filtre";
    }
    @Override
    protected String invalidSuffix$str() {
        return "WFLYLOG0041: Le suffixe (%1$s) est non valide. Un suffixe doit être sous la forme d'un format valide.";
    }
    @Override
    protected String loggingProfileNotFound$str() {
        return "WFLYLOG0010: Le profil de connexion '%1$s' était spécifié pour le déploiement '%2$s' mais n'a pas pu être trouvé. Utilisation de la configuration de connexion système.";
    }
    @Override
    protected String unknownLogManager$str() {
        return "WFLYLOG0089: Le contrôle du gestionnaire de journalisation a été évité et la propriété système du gestionnaire de journalisation « java.util.logging.manager » ne semble pas être sur « org.jboss.logmanager.LogManager ». La valeur actuelle est '%1$s'. Certains comportements des sorties journalisées comme MDC ou NDC risquent de ne pas avoir lieu comme prévu.";
    }
    @Override
    protected String truncatedFilterExpression$str() {
        return "WFLYLOG0070: Chaine d'expression de filtre tronquée";
    }
    @Override
    protected String unsupportedMethod$str() {
        return "WFLYLOG0050: La méthode %1$s sur la classe %2$s n'est pas prise en charge";
    }
    @Override
    protected String failedToReadLogFile$str() {
        return "WFLYLOG0079: N'a pas pu lire le fichier de journalisation '%1$s'";
    }
    @Override
    protected String expected2$str() {
        return "WFLYLOG0075: '%1$s' ou '%2$s' attendu suivant l'expression de filtre";
    }
    @Override
    protected String cannotLoadModule$str() {
        return "WFLYLOG0019: N'a pas pu charger le module '%1$s' pour %2$s '%3$s'";
    }
    @Override
    protected String perLoggingDeploymentIgnored$str() {
        return "WFLYLOG0016: La propriété de déploiement par journalisation (%1$s) est ignorée car l'attribut %2$s a été défini pour ignorer les fichiers de configuration dans le déploiement %3$s.";
    }
    @Override
    protected String classNotFound$str() {
        return "WFLYLOG0021: La classe '%1$s' n'a pas pu être trouvée.";
    }
    @Override
    protected String invalidRelativeTo$str() {
        return "WFLYLOG0039: Un chemin complet (%1$s) ne peut pas être précisé pour «relative-to».";
    }
    @Override
    protected String errorDeterminingChildrenExist$str() {
        return "WFLYLOG0088: N'a pas pu déterminer si %1$s avait des ressources dépendantes.";
    }
    @Override
    protected String failedToConfigureSslContext$str() {
        return "WFLYLOG0093: N’a pas configuré le context SSL pour %1$s %2$s.";
    }
    @Override
    protected String unexpectedEnd$str() {
        return "WFLYLOG0076: Fin inattendue d'expression de filtre";
    }
    @Override
    protected String invalidLogFile$str() {
        return "WFLYLOG0083: Le chemin '%1$s' est un répertoire et ne peut pas être utilisé comme fichier de journalisation.";
    }
    @Override
    protected String logFileNotFound$str() {
        return "WFLYLOG0080: Le fichier '%1$s' n'a pas pu être trouvé et ne peut pas être trouvé dans le répertoire %2$s.";
    }
    @Override
    protected String invalidLogLevel$str() {
        return "WFLYLOG0026: Le niveau supérieur %1$s n'est pas valide.";
    }
    @Override
    protected String filterNotFound$str() {
        return "WFLYLOG0072: Filtre '%1$s' non trouvé";
    }
    @Override
    protected String invalidFilterName$str() {
        return "WFLYLOG0097: Le nom %1$s ne peut pas être utilisé comme nom de filtre car il contient un caractère non valide %2$s";
    }
    @Override
    protected String usageOfLog4j1Config$str() {
        return "WFLYLOG0100: L'utilisation d'un fichier de configuration log4j (%1$s) a été trouvée dans le déploiement %2$s. La prise en charge des fichiers de configuration log4j dans les déploiements a été abandonnée et sera supprimée dans une prochaine version.";
    }
    @Override
    protected String invalidOverflowAction$str() {
        return "WFLYLOG0027: L'action du surplus %1$s n'est pas valide.";
    }
    @Override
    protected String handlerAlreadyDefined$str() {
        return "WFLYLOG0023: Le handler %1$s est déjà assigné.";
    }
    @Override
    protected String expected1$str() {
        return "WFLYLOG0075: '%1$s' attendu suivant l'expression de filtre";
    }
    @Override
    protected String cannotRegisterResourceOfType$str() {
        return "WFLYLOG0084: Les ressources de type %1$s ne peuvent pas être enregistrées";
    }
    @Override
    protected String failedToConfigureLogging$str() {
        return "WFLYLOG0042: N'a pas pu configurer la connexion par le fichier de configuration '%1$s'.";
    }
    @Override
    protected String failedToWriteConfigurationFile$str() {
        return "WFLYLOG0051: N'a pas pu écrire sur le fichier de configuration %1$s";
    }
    @Override
    protected String cannotAddHandlerToSelf$str() {
        return "WFLYLOG0046: Impossible d'ajouter le handler (%1$s) à lui-même";
    }
    @Override
    protected String expectedIdentifier$str() {
        return "WFLYLOG0073: Identifiant attendu suivant l'expression de filtre";
    }
    @Override
    protected String errorProcessingLogDirectory$str() {
        return "WFLYLOG0087: Impossible de traiter le répertoire de journalisation %1$s. Les fichiers de journalisation ne peuvent être listés.";
    }
    @Override
    protected String invalidSize$str() {
        return "WFLYLOG0028: Taille %1$s non valide";
    }
    @Override
    protected String handlerClosed$str() {
        return "WFLYLOG0047: Le handler est fermé, impossible de publier dans un handler fermé";
    }
    @Override
    protected String reservedFilterName$str() {
        return "WFLYLOG0095: Le nom %1$s ne peut pas être utilisé comme nom de filtre car c'est un nom de filtre réservé. Les noms réservés sont : %2$s";
    }
    @Override
    protected String handlerConfigurationNotFound$str() {
        return "WFLYLOG0048: La configuration du handler '%1$s' n'a pas pu être trouvée.";
    }
    @Override
    protected String replacingConfigurator$str() {
        return "WFLYLOG0013: Une classe de configurateur, '%1$s' est un configurateur non connu et il sera remplacé.";
    }
    @Override
    protected String logContextNotRemoved$str() {
        return "WFLYLOG0014: Le contexte de journalisation (%1$s) n'a pas pu être supprimé pour le déploiement %2$s";
    }
    @Override
    protected String invalidFilter$str() {
        return "WFLYLOG0025: Le filtre %1$s n'est pas valide";
    }
    @Override
    protected String illegalFormatterName$str() {
        return "WFLYLOG0094: Le nom du formatter ne peut pas se terminer par '-wfcore-pattern-formatter'";
    }
    @Override
    protected String invalidFilterNameStart$str() {
        return "WFLYLOG0096: Le nom %1$s ne peut pas être utilisé comme nom de filtre car il commence par un caractère non valide %2$s";
    }
    @Override
    protected String extensionNotInitialized$str() {
        return "WFLYLOG0078: Le sous-système de logging requiert que le gestionnaire de journaux corresponde à org.jboss.logmanager.LogManager. Le sous-système n'a pas été initialisé et ne peut pas être utilisé. Pour utiliser JBoss Log Manager, vous devez ajouter la propriété système \"java.util.logging.manager\" et la définir à \"org.jboss.logmanager.LogManager\"";
    }
    @Override
    protected String julConfigurationFileFound$str() {
        return "WFLYLOG0011: Le fichier de configuration qui se trouve dans '%1$s' s'avère être un fichier de configuration J.U.L. Le gestionnaire de journaux ne permet pas ce type de fichier de configuration.";
    }
    @Override
    protected String errorProcessingLoggingConfiguration$str() {
        return "WFLYLOG0043: Erreur pendant la recherche des fichiers de configuration de la connexion.";
    }
    @Override
    protected String usageOfAppender$str() {
        return "WFLYLOG0099: Utilisation d'un appender log4j (%1$s) trouvé dans un custom-handler. La prise en charge de l'utilisation des appenders comme gestionnaires personnalisés a été dépréciée et sera supprimée dans une prochaine version.";
    }
    @Override
    protected String loggerConfigurationNotFound$str() {
        return "WFLYLOG0049: La configuration de l'enregistreur '%1$s' n'a pas été trouvée.";
    }
    @Override
    protected String readNotAllowed$str() {
        return "WFLYLOG0081: Le fichier '%1$s' n'est pas autorisé de lecture.";
    }
    @Override
    protected String cannotRemoveResourceOfType$str() {
        return "WFLYLOG0085: Les ressources de type %1$s ne peuvent pas être supprimées";
    }
    @Override
    protected String invalidType$str() {
        return "WFLYLOG0092: Type non valide. %1$s attendu mais %2$s trouvé à la place.";
    }
}
