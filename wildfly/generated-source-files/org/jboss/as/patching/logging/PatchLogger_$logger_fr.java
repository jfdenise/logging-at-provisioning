package org.jboss.as.patching.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:44+0200")
public class PatchLogger_$logger_fr extends PatchLogger_$logger implements PatchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PatchLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String notADirectory$str() {
        return "Ne correspond pas à un répertoire %1$s";
    }
    @Override
    protected String requiresPatch$str() {
        return "WFLYPAT0015: Requiert correctif '%1$s'";
    }
    @Override
    protected String failedToDelete$str() {
        return "WFLYPAT0004: N'a pas pu supprimer (%1$s)";
    }
    @Override
    protected String cliFailedToResolveDistribution$str() {
        return "n'a pas pu résoudre jboss.home.dir, utiliser l'attribut --distribution pour pointer vers une installation valide";
    }
    @Override
    protected String patchIdFoundInMoreThanOneStream$str() {
        return "WFLYPAT0041: Correctif %1$s trouvé dans plus d'un flux : %2$s et %3$s";
    }
    @Override
    protected String installationMissingLayer$str() {
        return "N'a pas pu trouver de couche '%1$s' sous le répertoire %2$s";
    }
    @Override
    protected String failedToDeleteBackup$str() {
        return "WFLYPAT0049: Certains fichiers de sauvegarde n'ont pas été supprimés.";
    }
    @Override
    protected String entryOutsideOfPatchDirectory$str() {
        return "WFLYPAT0051: Fichier zip non valide. A trouvé une entrée qui se résout à un chemin en dehors du répertoire de patch : %1$s";
    }
    @Override
    protected String cannotCopyFiles$str() {
        return "WFLYPAT0047: Impossible de copier des fichiers de %1$s vers %2$s : %3$s";
    }
    @Override
    protected String unrecognizedConditionFormat$str() {
        return "WFLYPAT0045: Format de condition non reconnu '%1$s'";
    }
    @Override
    protected String noSuchLayer$str() {
        return "WFLYPAT0013: Il n'y a pas de couche %1$s installée";
    }
    @Override
    protected String patchTypesDontMatch$str() {
        return "les types de correctifs de correspondent pas";
    }
    @Override
    protected String alreadyApplied$str() {
        return "WFLYPAT0012: Le correctif '%1$s' a déjà été appliqué";
    }
    @Override
    protected String detectedConflicts$str() {
        return "Conflits détectés";
    }
    @Override
    protected String patchBundleIsEmpty$str() {
        return "WFLYPAT0042: L'ensemble des correctifs est vide";
    }
    @Override
    protected String contentItemTypeMissing$str() {
        return "WFLYPAT0043: Le type d'élément de contenu est manquant dans '%1$s'";
    }
    @Override
    protected String productVersionDidNotMatchInstalled$str() {
        return "WFLYPAT0039: La version %1$s de %2$s requise ne correspond pas à la version %3$s installée";
    }
    @Override
    protected String patchNotFoundInHistory$str() {
        return "WFLYPAT0021: Le correctif '%1$s' ne peut pas être trouvé dans l'historique.";
    }
    @Override
    protected String cannotCreateDirectory$str() {
        return "WFLYPAT0005: N'a pas pu créer le répertoire (%1$s)";
    }
    @Override
    protected String installationInvalidLayerConfiguration$str() {
        return "aucun modèle associé ou référentiel de lot ayant pour couche '%1$s'";
    }
    @Override
    protected String noPatchesApplied$str() {
        return "WFLYPAT0020: Ne peut pas être annulé. Aucun correctif n'a pu être appliqué.";
    }
    @Override
    protected String fileDoesNotExist$str() {
        return "WFLYPAT0008: Le fichier dont le chemin est spécifié par l'argument %1$s n'existe pas";
    }
    @Override
    protected String serverRequiresRestart$str() {
        return "WFLYPAT0024: Impossible d'appliquer ou d'annuler un correctif quand le serveur est en état «restart-required» (redémarrage exigé).";
    }
    @Override
    protected String patchIsMissingFile$str() {
        return "WFLYPAT0028: Le correctif ne contient pas le fichier %1$s";
    }
    @Override
    protected String missingArtifact$str() {
        return "WFLYPAT0032: '%1$s' est manquant";
    }
    @Override
    protected String doesNotApply$str() {
        return "WFLYPAT0003: Le correctif ne s'applique pas - (%1$s) attendu, mais était (%2$s)";
    }
    @Override
    protected String layerNotFound$str() {
        return "WFLYPAT0030: Couche non trouvée %1$s";
    }
    @Override
    protected String incompatiblePatch$str() {
        return "WFLYPAT0016: Chemin d'accès incompatible avec correctif '%1$s'";
    }
    @Override
    protected String deleteRollbackError$str() {
        return "WFLYPAT0048: Erreur de restauration du fichier[%1$s] - %2$s";
    }
    @Override
    protected String logPatchingInfo$str() {
        return "WFLYPAT0050: L'ID du correctif cumulatif de %1$s est : %2$s, correctifs simples : %3$s";
    }
    @Override
    protected String cannotDeleteFile$str() {
        return "WFLYPAT0001: Impossible de supprimer le fichier %1$s";
    }
    @Override
    protected String illegalPatchName$str() {
        return "WFLYPAT0019: nom de correctif non valide '%1$s'";
    }
    @Override
    protected String invalidRollbackInformation$str() {
        return "information de rollback non valide";
    }
    @Override
    protected String failedToResolvePatch$str() {
        return "WFLYPAT0014: N'a pas pu résoudre un descripteur de correctif valide pour %1$s %2$s";
    }
    @Override
    protected String failedToShowHistory$str() {
        return "WFLYPAT0023: N'a pas pu afficher l'historique des correctifs";
    }
    @Override
    protected String fileIsNotReadable$str() {
        return "WFLYPAT0029: Le fichier n'est pas lisible %1$s";
    }
    @Override
    protected String failedToLoadIdentity$str() {
        return "WFLYPAT0025: n'a pas pu charger les info d'identification";
    }
    @Override
    protected String failedToLoadInfo$str() {
        return "WFLYPAT0040: impossible de charger les informations %1$s";
    }
    @Override
    protected String cannotRenameFileDuringRestore$str() {
        return "WFLYPAT0037: Impossible de traiter la restauration en renommant le fichier %1$s";
    }
    @Override
    protected String wrongCopiedContent$str() {
        return "WFLYPAT0018: le contenu copié ne correspond pas au hachage attendu pour item : %1$s";
    }
    @Override
    protected String unsupportedContentType$str() {
        return "WFLYPAT0044: Type de contenu non pris en charge '%1$s'";
    }
    @Override
    protected String conflictsDetected$str() {
        return "WFLYPAT0017: Conflits détectés";
    }
    @Override
    protected String cannotRenameFileDuringBackup$str() {
        return "WFLYPAT0036: Impossible d'effectuer des sauvegardes en renommant le fichier %1$s";
    }
    @Override
    protected String inconsistentArtifact$str() {
        return "WFLYPAT0033: état instable : '%1$s'";
    }
    @Override
    protected String cannotCopyFilesToTempDir$str() {
        return "WFLYPAT0046: Impossible de copier des fichiers vers le répertoire temporaire %1$s : %2$s. Veuillez noter que '-Djava.io.tmpdir' peut être utilisé pour définir des répertoires temporaires différents.";
    }
    @Override
    protected String noPatchHistory$str() {
        return "WFLYPAT0027: Aucun historique de correctif %1$s";
    }
    @Override
    protected String cannotRenameFile$str() {
        return "WFLYPAT0035: Impossible de renommer le fichier %1$s";
    }
    @Override
    protected String failedToUndoChange$str() {
        return "WFLYPAT0031: n'a pu annuler le changement pour : '%1$s'";
    }
    @Override
    protected String cannotInvalidateZip$str() {
        return "WFLYPAT0002: Ne peut pas invalider %1$s";
    }
    @Override
    protected String installationNoLayersConfigFound$str() {
        return "Aucune couche de répertoire trouvée à %1$s";
    }
    @Override
    protected String installationDuplicateLayer$str() {
        return "Dupliquer %1$s '%2$s'";
    }
    @Override
    protected String cannotRollbackPatch$str() {
        return "WFLYPAT0011: Ne peut pas annuler le correctif (%1$s)";
    }
    @Override
    protected String noMorePatches$str() {
        return "WFLYPAT0026: Aucun correctif restant";
    }
    @Override
    protected String duplicateElementPatchId$str() {
        return "WFLYPAT0038: Dupliquer le patch-id de l'élément (%1$s)";
    }
    @Override
    protected String artifactInError$str() {
        return "WFLYPAT0034: en erreur : '%1$s'";
    }
}
