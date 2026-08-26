package org.jboss.as.process.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:46+0200")
public class ProcessLogger_$logger_fr extends ProcessLogger_$logger implements ProcessLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ProcessLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String argHelp$str() {
        return "Afficher ce message et sortir";
    }
    @Override
    protected String nullCommandComponent$str() {
        return "WFLYPC0031: La commande contient un composant null";
    }
    @Override
    protected String invalidByteToken$str() {
        return "WFLYPC0049: Token d'octet non valide. '%1$s' attendu '%2$s' reçu";
    }
    @Override
    protected String argBackup$str() {
        return "Garder une copie de la configuration du domaine persistant même si cet hôte n'est pas le Contrôleur de domaine. Si ignore-unused-configuration n'est pas définie dans host.xml, alors la configuration totale du domaine sera stockée, sinon, la valeur configurée de ignore-unused-configuration sera utilisée.";
    }
    @Override
    protected String streamProcessingFailed$str() {
        return "WFLYPC0020: Le traitement de flux n'a pas fonctionné pour '%1$s': %2$s";
    }
    @Override
    protected String failedToHandleSocketFinished$str() {
        return "WFLYPC0041: N'a pas pu gérer la condition de terminaison de socket";
    }
    @Override
    protected String startingProcess$str() {
        return "WFLYPC0018: Démarrage du processus '%1$s'";
    }
    @Override
    protected String argHostConfig$str() {
        return "Nom du fichier de configuration de l'hôte à utiliser (valeur par défaut \"host.xml\")";
    }
    @Override
    protected String waitingToRestart$str() {
        return "WFLYPC0021: Attente de %1$d secondes avant de démarrer à nouveau le processus %2$s.";
    }
    @Override
    protected String readBytes$str() {
        return "WFLYPC0056: Lecture de %1$d octets.";
    }
    @Override
    protected String attemptToReconnectNonExistentProcess$str() {
        return "WFLYPC0001: A tenté de reconnecter le processus non existant '%1$s'";
    }
    @Override
    protected String jpsCommandNotFound$str() {
        return "WFLYPC0064: Impossible de localiser le processus '%1$s' -- n'a pas pu trouver la commande 'jps'";
    }
    @Override
    protected String argStability$str() {
        return "Exécute le serveur avec un niveau de stabilité spécifique. Valeurs possibles :%1$s, Par défaut = %2$s";
    }
    @Override
    protected String writesAlreadyShutdown$str() {
        return "WFLYPC0062: Les écritures sont déjà fermées";
    }
    @Override
    protected String invalidOption$str() {
        return "WFLYPC0030: Option non valide : %1$s";
    }
    @Override
    protected String failedToCreateServerThread$str() {
        return "WFLYPC0045: N'a pas pu créer de thread de serveur";
    }
    @Override
    protected String writeChannelClosed$str() {
        return "WFLYPC0061: Le canal écriture est fermé";
    }
    @Override
    protected String stoppingProcess$str() {
        return "WFLYPC0019: Arrêt du processus '%1$s'";
    }
    @Override
    protected String failedToStartProcess$str() {
        return "WFLYPC0009: N'a pas pu démarrer le processus '%1$s'";
    }
    @Override
    protected String failedToSendAuthKey$str() {
        return "WFLYPC0006: N'a pas pu envoyer la clé d'authentification pour traiter '%1$s': %2$s";
    }
    @Override
    protected String attemptToStartNonExistentProcess$str() {
        return "WFLYPC0003: A tenté de démarrer le processus non existant '%1$s'";
    }
    @Override
    protected String receivedUnknownCredentials$str() {
        return "WFLYPC0014: Connexion reçue comportant des identifiants inconnus de la part de %1$s";
    }
    @Override
    protected String argInterfaceBindAddress$str() {
        return "Définir la propriété système jboss.bind.address.<interface> sur la valeur donnée";
    }
    @Override
    protected String failedToSendDataBytes$str() {
        return "WFLYPC0007: N'a pas pu envoyer des octets de données pour traiter le flux d'entrée '%1$s'";
    }
    @Override
    protected String receivedInvalidVersion$str() {
        return "WFLYPC0012: Connexion reçue avec version non valide de %1$s";
    }
    @Override
    protected String failedToKillProcess$str() {
        return "WFLYPC0022: N'a pas pu anéantir (kill) le process '%1$s', mais a essayé de le détruire à la place.";
    }
    @Override
    protected String failedToCloseServerSocket$str() {
        return "WFLYPC0035: N'a pas fermé le socket de serveur %1$s";
    }
    @Override
    protected String failedToSendReconnect$str() {
        return "WFLYPC0008: N'a pas pu envoyer le message de reconnexion pour traiter le flux d'entrée '%1$s'";
    }
    @Override
    protected String invalidStartChunk$str() {
        return "WFLYPC0051: Démarrage «start chunk» non valide [%1$s]";
    }
    @Override
    protected String argPcPort$str() {
        return "Port sur lequel le Contrôleur de processus écoute les communications qu'il contrôle";
    }
    @Override
    protected String destroyingProcess$str() {
        return "WFLYPC0067: Process '%1$s' n'a pas complété un arrêt normal dans %2$d ms ; tentative de detruire le processus en utilisant java.lang.Process.destroyForcibly()";
    }
    @Override
    protected String attemptToRemoveNonExistentProcess$str() {
        return "WFLYPC0002: A tenté de supprimer le processus non existant '%1$s'";
    }
    @Override
    protected String receivedUnknownMessageCode$str() {
        return "WFLYPC0015: Message reçu inconnu ayant pour code 0x%1$02x";
    }
    @Override
    protected String invalidLength$str() {
        return "WFLYPC0029: La longueur %1$s est non valide";
    }
    @Override
    protected String failedToAcceptConnection$str() {
        return "WFLYPC0033: N'a pas accepté une connexion";
    }
    @Override
    protected String argAdminOnly$str() {
        return "Définir le type d'exécution du contrôleur hôte sur ADMIN_ONLY, ce qui permet d'ouvrir les interfaces d'administration et d'accepter les demandes de gestion mais pas de démarrer les serveurs ou, si ce contrôleur hôte est le primaire du domaine, d'accepter les connexions entrantes des contrôleurs hôtes secondaires.";
    }
    @Override
    protected String argReadOnlyDomainConfig$str() {
        return "Nom du fichier de configuration de domaine à utiliser (valeur par défaut \"domain.xml\"). Diffère de '--domain-config', '-c' et '-domain-config' dans le sens où le fichier initial n'est jamais remplacé.";
    }
    @Override
    protected String invalidAuthKeyLen$str() {
        return "WFLYPC0025: La clé d'authentification doit comprendre 24 octets de longueur";
    }
    @Override
    protected String processFinished$str() {
        return "WFLYPC0011: Le processus '%1$s' est terminé et a pour id de statut de sortie %2$d";
    }
    @Override
    protected String failedToHandleIncomingConnection$str() {
        return "WFLYPC0039: N'a pas pu gérer la connexion entrante";
    }
    @Override
    protected String multipleProcessesFound$str() {
        return "WFLYPC0066: Plusieurs processus identifiables comme '%1$s' ont été trouvés. « kill » au niveau SE ne peut pas être effectuée en toute sécurité";
    }
    @Override
    protected String shuttingDown$str() {
        return "WFLYPC0017: Fermeture du contrôleur de processus";
    }
    @Override
    protected String noArgValue$str() {
        return "WFLYPC0023: Aucune valeur n'a été fournie pour l'argument %1$s";
    }
    @Override
    protected String leakedMessageOutputStream$str() {
        return "WFLYPC0044: Fuite de flux de sortie de message; nettoyage";
    }
    @Override
    protected String argDefaultMulticastAddress$str() {
        return "Définir la propriété système jboss.default.multicast.address sur la valeur donnée";
    }
    @Override
    protected String attemptingToKillProcess$str() {
        return "WFLYPC0063: Process '%1$s' n'a pas terminé l'arrêt normal dans %2$d ms ; tentative de tuer le processus en utilisant les appels SE";
    }
    @Override
    protected String argShortDomainConfig$str() {
        return "Nom du fichier de configuration de domaine à utiliser (valeur par défaut \"domain.xml\") (Comme --domain-config)";
    }
    @Override
    protected String argPublicBindAddress$str() {
        return "Définir la propriété système jboss.bind.address sur la valeur donnée";
    }
    @Override
    protected String streamClosed$str() {
        return "WFLYPC0058: Flux fermé";
    }
    @Override
    protected String argReadOnlyHostConfig$str() {
        return "Nom du fichier de configuration hôte à utiliser. Diffère de '--host-config' dans le sens où le fichier initial n'est jamais remplacé.";
    }
    @Override
    protected String argMasterPort$str() {
        return "Définit la propriété système jboss.domain.primary.port à la valeur donnée. Dans une configuration de contrôleur hôte secondaire par défaut, ceci est utilisé pour configurer le port utilisé pour la communication de gestion native par le contrôleur hôte primaire.";
    }
    @Override
    protected String failedToHandleSocketFailure$str() {
        return "WFLYPC0040: N'a pas pu gérer la condition d'échec de socket";
    }
    @Override
    protected String unexpectedEndOfStream$str() {
        return "WFLYPC0060: Fin de flux non attendue";
    }
    @Override
    protected String failedToCloseSocket$str() {
        return "WFLYPC0036: N'a pas fermé un socket";
    }
    @Override
    protected String duplicateProcessName$str() {
        return "WFLYPC0005: A tenté d'enregistrer le processus nommé dupliqué '%1$s'";
    }
    @Override
    protected String argPcAddress$str() {
        return "Adresse sur laquelle le Contrôleur de processus écoute les communications en provenance des processus qu'il contrôle";
    }
    @Override
    protected String threadCreationRefused$str() {
        return "WFLYPC0059: La création de flux a été refusée";
    }
    @Override
    protected String argSecMgr$str() {
        return "Exécute le serveur avec le gestionnaire de sécurité installé.";
    }
    @Override
    protected String failedToReadObject$str() {
        return "WFLYPC0046: N'a pas pu lire l'objet";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYPC0034: N'a pas pu fermer la ressource %1$s";
    }
    @Override
    protected String argProperties$str() {
        return "Charger les propriétés du système à partir de l'url donné";
    }
    @Override
    protected String argSystem$str() {
        return "Définir une propriété système";
    }
    @Override
    protected String argVersion$str() {
        return "Imprimer la version et quitter";
    }
    @Override
    protected String shutdownComplete$str() {
        return "WFLYPC0016: Tous les processus sont terminés; sortie";
    }
    @Override
    protected String failedToHandleSocketShutdown$str() {
        return "WFLYPC0042: N'a pas pu gérer la condition de fermeture de socket";
    }
    @Override
    protected String receivedUnknownGreetingCode$str() {
        return "WFLYPC0013: Code de bienvenue reçu non reconnu 0x%1$02x de %2$s";
    }
    @Override
    protected String argDomainConfig$str() {
        return "Nom du fichier de configuration de domaine à utiliser (valeur par défaut \"domain.xml\") (Comme -c)";
    }
    @Override
    protected String invalidByte2$str() {
        return "WFLYPC0048: Octet non valide :%1$s(%2$d)";
    }
    @Override
    protected String argInterProcessHcPort$str() {
        return "Port sur lequel le Contrôleur de l'hôte écoute les communications provenant du Contrôleur de processus";
    }
    @Override
    protected String processNotFound$str() {
        return "WFLYPC0065: Aucun processus identifiable en tant que '%1$s' n'a pu être trouvé";
    }
    @Override
    protected String argCachedDc$str() {
        return "Si cet hôte n'est pas le Contrôleur de domaine et ne peut pas contacter le Contrôleur de domaine au démarrage, démarrer en utilisant une copie cache locale de la configuration du domaine (voir --backup). Le Contrôleur de domaine est interrogé en arrière-plan jusqu'à ce qu'il soit rendu disponible. Notez que si vous démarrez un hôte avec --cached-dc quand le Contrôleur de domaine est disponible, une copie du domaine de configuration sera mise en cache, même si --backup n'est pas utilisé.";
    }
    @Override
    protected String attemptToStopNonExistentProcess$str() {
        return "WFLYPC0004: A tenté de stopper le processus non existant '%1$s'";
    }
    @Override
    protected String failedToWriteMessage$str() {
        return "WFLYPC0010: N'a pas pu écrire le message %1$s dans la connexion : %2$s";
    }
    @Override
    protected String failedToReadMessage$str() {
        return "WFLYPC0043: N'a pas pu lire un message";
    }
    @Override
    protected String argUsage$str() {
        return "Usage: %1$s [args...]%n avec les args qui incluent :";
    }
    @Override
    protected String argMasterAddress$str() {
        return "Définit la propriété système jboss.domain.primary.address à la valeur donnée. Dans une configuration de contrôleur hôte secondaire par défaut, ceci est utilisé pour configurer l'adresse du contrôleur hôte primaire.";
    }
    @Override
    protected String invalidCommandByte$str() {
        return "WFLYPC0050: Lecture d'octets de commande non valide : %1$s";
    }
    @Override
    protected String argInterProcessHcAddress$str() {
        return "Adresse sur laquelle le Contrôleur de l'hôte écoute les communications provenant du Contrôleur de processus";
    }
    @Override
    protected String invalidByte0$str() {
        return "WFLYPC0047: Octet non valide";
    }
}
