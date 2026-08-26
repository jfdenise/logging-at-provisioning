package org.wildfly.core.jar.runtime._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:32:41+0200")
public class BootableJarLogger_$logger_fr extends BootableJarLogger_$logger implements BootableJarLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BootableJarLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String shuttingDown$str() {
        return "WFLYJAR0001: Fermeture";
    }
    @Override
    protected String serverStopped$str() {
        return "WFLYJAR0002: Le serveur s'est arrêté, sortie";
    }
    @Override
    protected String serverNotStopped$str() {
        return "WFLYJAR0003: Le serveur n'est pas encore arrêté, en attente";
    }
    @Override
    protected String nullController$str() {
        return "WFLYJAR0004: Client Null Controller, sortie";
    }
    @Override
    protected String unexpectedExceptionWhileShuttingDown$str() {
        return "WFLYJAR0005: Exception inattendue lors de l'arrêt du serveur";
    }
    @Override
    protected String installDeployment$str() {
        return "WFLYJAR0006: %1$s déployé dans le serveur";
    }
    @Override
    protected String advertiseInstall$str() {
        return "WFLYJAR0007: L’installation du serveur et de l'application dans %1$s, a pris %2$sms";
    }
    @Override
    protected String advertiseOptions$str() {
        return "WFLYJAR0008: Options du serveur : %1$s";
    }
    @Override
    protected String deletingHome$str() {
        return "WFLYJAR0009: Suppression du dir %1$s";
    }
    @Override
    protected String deploymentAlreadyExist$str() {
        return "WFLYJAR0010: Pas de hollow jar, le déploiement existe déjà";
    }
    @Override
    protected String unknownArgument$str() {
        return "WFLYJAR0011: Argument inconnu %1$s";
    }
    @Override
    protected String notExistingFile$str() {
        return "WFLYJAR0012: Le fichier %1$s n'existe pas";
    }
    @Override
    protected String invalidArgument$str() {
        return "WFLYJAR0013: Argument invalide %1$s, aucune valeur fournie";
    }
    @Override
    protected String processIsStopping$str() {
        return "WFLYJAR0014: Le serveur s'arrête et les invocations sur le ModelControllerClient ne sont pas disponibles";
    }
    @Override
    protected String processIsReloading$str() {
        return "WFLYJAR0015: Le serveur intégré est en rechargement et les invocations sur le ModelControllerClient ne sont pas encore disponibles";
    }
    @Override
    protected String processIsStopped$str() {
        return "WFLYJAR0016: Le serveur intégré est interrompu et les invocations sur le ModelControllerClient ne sont pas disponibles";
    }
    @Override
    protected String cannotStartServer$str() {
        return "WFLYJAR0017: Impossible de démarrer le serveur";
    }
    @Override
    protected String moduleLoaderError$str() {
        return "WFLYJAR0018: N'a pas pu charger le module %1$s de : %2$s";
    }
    @Override
    protected String cantRestartServer$str() {
        return "WFLYJAR0019: Impossible de redémarrer le serveur, sortie";
    }
    @Override
    protected String cantDelete$str() {
        return "WFLYJAR0020: Impossible de supprimer %1$s. Exception %2$s";
    }
    @Override
    protected String cantRegisterModuleMBeans$str() {
        return "WFLYJAR0021: Impossible d'enregistrer les MBeans de JBoss Modules, %1$s";
    }
    @Override
    protected String pidFileAlreadyExists$str() {
        return "WFLYJAR0022: Le fichier PID %1$s existe déjà. Il se peut donc que le répertoire d'installation \"%2$s\" ne soit pas correctement supprimé.";
    }
    @Override
    protected String failedToStartCleanupProcess$str() {
        return "WFLYJAR0023: Le lancement du processeur de nettoyage a échoué. Cela peut avoir pour conséquence que le répertoire d'installation \"%1$s\" n'est pas correctement supprimé.";
    }
    @Override
    protected String cleanupTimeout$str() {
        return "WFLYJAR0024: Le conteneur ne s'est pas arrêté correctement dans les %1$ds. Cela peut entraîner la suppression du répertoire d'installation \"%2$s\".";
    }
    @Override
    protected String argPublicBindAddress$str() {
        return "Définir la propriété système jboss.bind.address sur la valeur donnée";
    }
    @Override
    protected String argInterfaceBindAddress$str() {
        return "Définir la propriété système jboss.bind.address.<interface> sur la valeur donnée";
    }
    @Override
    protected String argSystem$str() {
        return "Définir une propriété système";
    }
    @Override
    protected String argHelp$str() {
        return "Afficher ce message et sortir";
    }
    @Override
    protected String argProperties$str() {
        return "Charger les propriétés du système à partir de l'url donné";
    }
    @Override
    protected String argDefaultMulticastAddress$str() {
        return "Définir la propriété système jboss.default.multicast.address sur la valeur donnée";
    }
    @Override
    protected String argVersion$str() {
        return "Imprimer la version et quitter";
    }
    @Override
    protected String argSecurityManager$str() {
        return "Activez le SecurityManager";
    }
    @Override
    protected String argStability$str() {
        return "Exécute le serveur avec un niveau de stabilité spécifique. Valeurs possibles :%1$s, Par défaut = %2$s";
    }
    @Override
    protected String argSecurityProperty$str() {
        return "Définir une propriété de sécurité";
    }
    @Override
    protected String argDeployment$str() {
        return "Chemin vers l'artefact de déploiement (war, jar, ear ou répertoire de déploiement éclaté) à déployer dans le hollow jar";
    }
    @Override
    protected String argInstallation$str() {
        return "Chemin du répertoire dans lequel le serveur est installé. Par défaut, le serveur est installé dans le répertoire TEMP.";
    }
    @Override
    protected String argDisplayGalleonConfig$str() {
        return "Affiche le contenu de la configuration Galleon utilisée pour construire ce JAR amorçable";
    }
    @Override
    protected String argCliScript$str() {
        return "Chemin d'accès à un script CLI à exécuter lors du démarrage du JAR amorçable";
    }
    @Override
    protected String securityProviderFailed$str() {
        return "WFLYJAR0025: Échec de l'initialisation d'un fournisseur de sécurité. Raison de cet échec : %1$s";
    }
}
