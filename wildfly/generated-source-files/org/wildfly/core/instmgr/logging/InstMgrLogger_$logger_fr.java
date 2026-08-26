package org.wildfly.core.instmgr.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:21+0200")
public class InstMgrLogger_$logger_fr extends InstMgrLogger_$logger implements InstMgrLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InstMgrLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String noChannelRepositoriesDefined$str() {
        return "WFLYIM0005: Aucun référentiel n'a été défini dans le canal '%1$s'.";
    }
    @Override
    protected String invalidChannelManifestURL$str() {
        return "WFLYIM0010: L'URL de manifeste '%1$s' pour le canal '%2$s' n'est pas valide.";
    }
    @Override
    protected String invalidManifestGAOnly$str() {
        return "WFLYIM0016: Les coordonnées Maven du manifeste pour '%1$s' ne sont pas valides. Les coordonnées Maven attendues pour ce manifeste sont GA (GroupId:ArtifactId).";
    }
    @Override
    protected String noResolveLocalCacheWithUseDefaultLocalCache$str() {
        return "WFLYIM0022: « no-resolve-local-cache » et « use-default-local-cache » s'excluent mutuellement (spécifiez-en un seul).";
    }
    @Override
    protected String invalidZipEntry$str() {
        return "La structure des répertoires et des fichiers dans le fichier .zip n'est pas valide. Le répertoire '%1$s' est introuvable en tant qu'entrée de second niveau dans le fichier .zip extrait.";
    }
    @Override
    protected String localCacheWithNoResolveLocalCache$str() {
        return "WFLYIM0011: Vous ne pouvez pas utiliser l'option \"local-cache\" lorsque l'option \"no-resolve-local-cache\" est activée.";
    }
    @Override
    protected String noChannelRepositoryURLDefined$str() {
        return "WFLYIM0006: Le référentiel '%1$s' du canal n'a pas d'URL définie.";
    }
    @Override
    protected String mavenRepoFileWithRepositories$str() {
        return "WFLYIM0012: Vous ne pouvez pas utiliser l'option \"maven-repo-file\" avec l'option \"repositories\" car elles s'excluent mutuellement.";
    }
    @Override
    protected String provisioningChannels$str() {
        return "WFLYIM0023: L'installation a été provisionnée à l'aide des versions de canal suivantes : '%1$s '";
    }
    @Override
    protected String invalidChannelRepositoryURL$str() {
        return "WFLYIM0007: L'URL du référentiel '%1$s' pour le canal '%2$s' n'est pas valide.";
    }
    @Override
    protected String failedToFindInstallationChannels$str() {
        return "WFLYIM0025: Impossible de signaler les canaux d'installation : '%1$s'";
    }
    @Override
    protected String failedToCreateInstallationManager$str() {
        return "WFLYIM0024: Impossible de signaler l'état de l'installation. Impossible de créer un gestionnaire d'installation pour le chemin ’%1$s' : '%2$s'";
    }
    @Override
    protected String noChannelRepositoryIDDefined$str() {
        return "WFLYIM0008: Le référentiel '%1$s' du canal n'a pas d'identifiant défini.";
    }
    @Override
    protected String missingChannelName$str() {
        return "WFLYIM0004: Le nom du canal est obligatoire.";
    }
    @Override
    protected String channelNameNotFound$str() {
        return "WFLYIM0015: Le canal portant le nom '%1$s' est introuvable.";
    }
    @Override
    protected String invalidRepositoryURL$str() {
        return "WFLYIM0013: Format non valide pour l'URL du référentiel : '%1$s'";
    }
    @Override
    protected String localCacheWithUseDefaultLocalCache$str() {
        return "WFLYIM0021: Vous ne pouvez pas utiliser l'option « local-cache » lorsque l'option « use-default-local-cache » est activée.";
    }
    @Override
    protected String operationCancelled$str() {
        return "WFLYIM0019: L'opération a été annulée.";
    }
    @Override
    protected String noCustomPatchFound$str() {
        return "WFLYIM0020: Aucun correctif personnalisé installé n'a été trouvé pour le manifeste spécifié. Coordonnées maven : '%1$s'";
    }
    @Override
    protected String invalidManifestGAV$str() {
        return "WFLYIM0017: Les coordonnées Maven du manifeste pour '%1$s' ne sont pas valides. Les coordonnées Maven attendues pour ce manifeste sont GAV (GroupId:ArtifactId:Version) où Version est optionnel.";
    }
    @Override
    protected String workDirWithMavenRepoFileOrRepositories$str() {
        return "WFLYIM0014: Vous ne pouvez pas utiliser l'option \"work-dir\" avec les options \"repositories\" ou \"maven-repo-file\" car elles s'excluent mutuellement.";
    }
    @Override
    protected String installationManagerServiceDown$str() {
        return "WFLYIM0018: Le service du gestionnaire d'installation est en panne.";
    }
    @Override
    protected String unexpectedArtifactChange$str() {
        return "WFLYIM0002: Changement de statut non valide trouvé pour l'artefact : '%1$s'";
    }
    @Override
    protected String unexpectedConfigurationChange$str() {
        return "WFLYIM0003: Changement d'état non valide trouvé pour le changement de configuration : '%1$s'";
    }
    @Override
    protected String zipEntryOutsideOfTarget$str() {
        return "L'entrée zip %1$s est en dehors du répertoire cible %2$s.";
    }
    @Override
    protected String serverAlreadyPrepared$str() {
        return "WFLYIM0001: Une installation est préparée et prête à être appliquée. L'installation préparée actuelle peut être éliminée en utilisant l'opération \"nettoyer\".";
    }
    @Override
    protected String invalidChannelManifestGAV$str() {
        return "WFLYIM0009: La coordonnée GAV manifeste '%1$s' pour le canal '%2$s' n'est pas valide.";
    }
}
