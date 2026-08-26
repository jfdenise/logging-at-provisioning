package org.jboss.as.server.deployment.scanner.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:17+0200")
public class DeploymentScannerLogger_$logger_fr extends DeploymentScannerLogger_$logger implements DeploymentScannerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DeploymentScannerLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotDeleteDeploymentProgressMarker$str() {
        return "WFLYDS0001: Impossible de supprimer le fichier marqueur de progrès de déploiement %1$s";
    }
    @Override
    protected String cannotRemoveDeploymentMarker$str() {
        return "WFLYDS0002: Impossible de supprimer le fichier marqueur de déploiement superflu %1$s";
    }
    @Override
    protected String deploymentNotFound$str() {
        return "WFLYDS0003: Déploiement de '%1$s' requis, mais le déploiement n'est pas présent";
    }
    @Override
    protected String deploymentTriggered$str() {
        return "WFLYDS0004: %1$s trouvé dans le répertoire du déploiement. Pour déclencher le déploiement, créer un fichier nommé %1$s%2$s";
    }
    @Override
    protected String errorWritingDeploymentMarker$str() {
        return "WFLYDS0005: Exception interceptée lors de l'écriture dans le fichier marqueur de déploiement %1$s";
    }
    @Override
    protected String explodedAutoDeploymentContentWarning$str() {
        return "WFLYDS0006: Le comportement de déploiement fiable n'est pas possible lorsque l'auto-déploiement de contenu explosé est activé (c'est-à-dire le déploiement sans utilisation des fichiers marqueurs \"%1$s\"). La configuration d'auto-déploiement de contenu explosé n'est pas recommandée dans toutes les situations quand on espère une certaine fiabilité. Configurer le paramètre %2$s de l'analyseur déploiement à false conseillé.";
    }
    @Override
    protected String explodedDeploymentContentDeleted$str() {
        return "WFLYDS0007: Le scanner de déploiement a détecté que le contenu du déploiement explosé %1$s a été supprimé, mais l'auto-déploiement/retrait de déploiement pour les déploiements explosés n'est pas activé et le marqueur de fichier %1$s%2$s pour ce déploiement n'a pas été supprimé. En conséquence, le déploiement n'est pas être retiré, mais les ressources nécessaires pour le déploiement ont sans doute été supprimées et des erreurs d'application ont pu se produire. Il est conseillé de supprimer le marqueur de fichier %1$s%2$s pour déclencher le déploiement.";
    }
    @Override
    protected String failedCheckingZipFile$str() {
        return "WFLYDS0008: Impossible de vérifier si %1$s était un fichier compressé complet";
    }
    @Override
    protected String fileSystemDeploymentFailed$str() {
        return "WFLYDS0009: Le service de déploiement du système de fichiers a échoué";
    }
    @Override
    protected String incompleteContent$str() {
        return "WFLYDS0010: Le scanneur a détecté un contenu de fichier partiellement copié pour le déploiement %1$s. Les changements de déploiement ne seront pas traités avant la fin du contenu.";
    }
    @Override
    protected String invalidExplodedDeploymentDirectory$str() {
        return "WFLYDS0011: L'analyseur de déploiement a trouvé un répertoire nommé %1$s qui n'était pas à l'intérieur d'un répertoire dont le nom se termine par .ear, .jar, .rar, .sar ou .war. C'est probablement le résultat de la décompression d'une archive dans le répertoire %2$s, qui est une erreur de l'utilisateur. Les déploiements ne pourront pas être détectés dans le répertoire %1$s, mais il est possible que l'analyseur trouve d'autres fichiers de l'archive décompressée et tente de les déployer, entraînant des erreurs.";
    }
    @Override
    protected String scanException$str() {
        return "WFLYDS0012: Exceptions suite au balayage de %1$s";
    }
    @Override
    protected String started$str() {
        return "WFLYDS0013: %1$s démarré pour le répertoire %2$s";
    }
    @Override
    protected String unsafeAutoDeploy$str() {
        return "WFLYDS0014: Du contenu configuré pour l'auto déploiement a été détecté lors du balayage. Voir détails ci-dessus. Les changements apportés au déploiement ne seront pas traités tant que tout le contenu problématique n'a pas été supprimé ou si la possibilité de déployer le contenu n'est pas indiquée par un marqueur %1$s ou %2$s. Les déploiements problématiques sont %3$s";
    }
    @Override
    protected String reattemptingFailedDeployment$str() {
        return "WFLYDS0015: La nouvelle tentative de déploiement %1$s n'a pas abouti";
    }
    @Override
    protected String failedCheckingXMLFile$str() {
        return "WFLYDS0016: N'a pas pu vérifier si %1$s était tout à fait XML";
    }
    @Override
    protected String initialScanFailed$str() {
        return "WFLYDS0017: L'analyse du déploiement initial a échoué";
    }
    @Override
    protected String scannerDeploymentUndeployedButNotByScanner$str() {
        return "WFLYDS0018: Le déploiement %1$s qui avait été déployé auparavant par ce scanner, mais qui a été retiré par un autre outil de gestion. Le fichier marqueur %2$s a été ajouté pour enregistrer ce fait.";
    }
    @Override
    protected String scannerDeploymentRemovedButNotByScanner$str() {
        return "WFLYDS0019: Le déploiement %1$s qui avait été déployé auparavant par ce scanner, mais qui a été retiré de la liste de déploiement du serveur par un autre outil de gestion. Le fichier marqueur %2$s a été ajouté pour enregistrer ce fait.";
    }
    @Override
    protected String deploymentContentIncomplete$str() {
        return "WFLYDS0021: Le contenu du déploiement %1$s ne semble pas être complet, ni progresser. Ce contenu ne peut pas être auto-déployé. %2$s";
    }
    @Override
    protected String deploymentTimeout$str() {
        return "WFLYDS0022: Aucune réponse à l'opération de déploiement n'a été reçue dans la période impartie [%1$d seconds]. Vérifier la fichier de configuration du serveur et les logs du serveur pour en savoir davantage sur le statut du déploiement.";
    }
    @Override
    protected String invalidZipFileFormat$str() {
        return "WFLYDS0025: Le fichier %1$s ne peut pas être scanné car il ne commence pas par une signature d'en-tête de fichier local de format fichier ZIP";
    }
    @Override
    protected String invalidZip64FileFormat$str() {
        return "WFLYDS0026: Le fichier %1$s ne peut pas être scanné car il utilise le format ZIP64 actuellement non pris en charge";
    }
    @Override
    protected String previousContentDeployed$str() {
        return "Une version précédente de ce contenu a été déployée et le restera.";
    }
    @Override
    protected String unsafeAutoDeploy2$str() {
        return "WFLYDS0030: Le fichier %2$s a été configuré pour l'auto déploiement, mais n'a pas pu être auto-déployé en toute sécurité. La raison pour laquelle le fichier n'a pas pu être auto-déployé est la suivante : %1$s. Pour permettre le déploiement de ce fichier, créer un fichier nommé %2$s%3$s";
    }
    @Override
    protected String deploymentScannerNotForDomainMode$str() {
        return "WFLYDS0031: L'extension ayant pour module 'org.jboss.as.deployment-scanner' ne peut pas être installée dans un domaine géré. Veuillez le supprimer, ainsi que tout sous-système qui le référence";
    }
    @Override
    protected String cannotListDirectoryFiles$str() {
        return "WFLYDS0032: N'a pas pu lister les fichiers dans le répertoire %1$s. Vérifier que les contenus du répertoire soient bien lisibles.";
    }
    @Override
    protected String scannerDeploymentRedeployedButNotByScanner$str() {
        return "WFLYDS0033: Le déploiement %1$s que l'on avait retiré auparavant par ce scanner, mais qui avait été redéployé par un autre outil de gestion. Le fichier marqueur %2$s a été ajouté pour enregistrer ce fait.";
    }
    @Override
    protected String failedStatusSynchronization$str() {
        return "WFLYDS0034: Erreur de synchronisation du statut du déploiement %1$s.";
    }
    @Override
    protected String invalidXmlFileFound$str() {
        return "WFLYDS0035: L'analyseur a trouvé %1$s, déformé à la ligne numéro : %2$s, numéro de colonne : %3$s. Soit le fichier a été copié de manière incomplète au moment de l'analyse, soit le fichier est incorrect.";
    }
    @Override
    protected String deployModelOperationFailed$str() {
        return "WFLYDS0036: L'opération du modèle de déploiement a échoué. %1$s";
    }
    @Override
    protected String directoryIsNonexistent$str() {
        return "WFLYDS0037: %1$s n'existe pas";
    }
    @Override
    protected String isNotADirectory$str() {
        return "WFLYDS0038: %1$s n'est pas un répertoire";
    }
    @Override
    protected String directoryIsNotWritable$str() {
        return "WFLYDS0039: %1$s n'est pas accessible en écriture";
    }
    @Override
    protected String pathEntryNotFound$str() {
        return "WFLYDS0040: Chemin relatif non trouvé pour %1$s";
    }
    @Override
    protected String directoryIsNotReadable$str() {
        return "WFLYDS0041: %1$s n'est pas accessible en lecture";
    }
    @Override
    protected String bootTimeScanFailed$str() {
        return "WFLYDS0042: Échec d'analyse au démarrage car le répertoire de déploiement n'était pas accessible : %1$s";
    }
    @Override
    protected String scanFailed$str() {
        return "WFLYDS0043: L'analyse du répertoire de déploiement a échoué car le répertoire de déploiement était inaccessible : %1$s";
    }
}
