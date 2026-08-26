package org.wildfly.core.instmgr.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:21+0200")
public class InstMgrLogger_$logger_de extends InstMgrLogger_$logger implements InstMgrLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InstMgrLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String noChannelRepositoriesDefined$str() {
        return "WFLYIM0005: Im Channel '%1$s' wurden keine Repositorys definiert.";
    }
    @Override
    protected String invalidChannelManifestURL$str() {
        return "WFLYIM0010: Die Manifest-URL '%1$s' für den Channel '%2$s' ist ungültig.";
    }
    @Override
    protected String invalidManifestGAOnly$str() {
        return "WFLYIM0016: Die Maven-Koordinaten des Manifests für '%1$s' sind ungültig. Die erwarteten Maven-Koordinaten für dieses Manifest sind GA (GroupId:ArtifactId).";
    }
    @Override
    protected String noResolveLocalCacheWithUseDefaultLocalCache$str() {
        return "WFLYIM0022: 'no-resolve-local-cache' und 'use-default-local-cache' schließen sich gegenseitig aus (geben Sie nur eine an).";
    }
    @Override
    protected String invalidZipEntry$str() {
        return "Die Struktur der Verzeichnisse und Dateien in der .zip-Datei ist ungültig. Das Verzeichnis '%1$s' wurde nicht als Eintrag der zweiten Ebene in der extrahierten .zip-Datei gefunden.";
    }
    @Override
    protected String localCacheWithNoResolveLocalCache$str() {
        return "WFLYIM0011: Sie können die Option 'local-cache' nicht verwenden, wenn die Option 'no-resolve-local-cache' aktiviert ist.";
    }
    @Override
    protected String noChannelRepositoryURLDefined$str() {
        return "WFLYIM0006: Für das Repository '%1$s' im Channel ist keine URL definiert.";
    }
    @Override
    protected String mavenRepoFileWithRepositories$str() {
        return "WFLYIM0012: Sie können die Option 'maven-repo-file' nicht zusammen mit der Option 'repositories' verwenden, da sie sich gegenseitig ausschließen.";
    }
    @Override
    protected String provisioningChannels$str() {
        return "WFLYIM0023: Die Installation wurde mithilfe der folgenden Kanalversionen bereitgestellt: '%1$s'";
    }
    @Override
    protected String invalidChannelRepositoryURL$str() {
        return "WFLYIM0007: Die Repository-URL '%1$s' für den Channel '%2$s' ist ungültig.";
    }
    @Override
    protected String failedToFindInstallationChannels$str() {
        return "WFLYIM0025: Installationskanäle können nicht gemeldet werden: '%1$s'";
    }
    @Override
    protected String failedToCreateInstallationManager$str() {
        return "WFLYIM0024: Installationsstatus kann nicht gemeldet werden. Für Pfad '%1$s': '%2$s' kann kein InstallationManager erstellt werden.";
    }
    @Override
    protected String noChannelRepositoryIDDefined$str() {
        return "WFLYIM0008: Für das Repository '%1$s' im Channel ist keine ID definiert.";
    }
    @Override
    protected String missingChannelName$str() {
        return "WFLYIM0004: Der Channel-Name ist obligatorisch.";
    }
    @Override
    protected String channelNameNotFound$str() {
        return "WFLYIM0015: Channel mit dem Namen '%1$s' wurde nicht gefunden.";
    }
    @Override
    protected String invalidRepositoryURL$str() {
        return "WFLYIM0013: Ungültiges Format für die Repository-URL: '%1$s'";
    }
    @Override
    protected String localCacheWithUseDefaultLocalCache$str() {
        return "WFLYIM0021: Sie können die Option 'local-cache' nicht verwenden, wenn die Option 'use-default-local-cache' aktiviert ist.";
    }
    @Override
    protected String operationCancelled$str() {
        return "WFLYIM0019: Die Operation wurde abgebrochen.";
    }
    @Override
    protected String noCustomPatchFound$str() {
        return "WFLYIM0020: Keine installierten benutzerdefinierten Patches für die angegebenen Maven-Koordinaten des Manifests gefunden : '%1$s'";
    }
    @Override
    protected String invalidManifestGAV$str() {
        return "WFLYIM0017: Die Maven-Koordinaten des Manifests für '%1$s' sind ungültig. Die erwarteten Maven-Koordinaten für dieses Manifest sind GAV (GroupId:ArtifactId:Version), wobei Version optional ist.";
    }
    @Override
    protected String workDirWithMavenRepoFileOrRepositories$str() {
        return "WFLYIM0014: Sie können die Option 'work-dir' nicht mit den Optionen 'repositories' oder 'maven-repo-file' verwenden, da sie sich gegenseitig ausschließen.";
    }
    @Override
    protected String installationManagerServiceDown$str() {
        return "WFLYIM0018: Der Installation Manager Service ist ausgefallen.";
    }
    @Override
    protected String unexpectedArtifactChange$str() {
        return "WFLYIM0002: Ungültige Statusänderung für das Artefakt gefunden: '%1$s'";
    }
    @Override
    protected String unexpectedConfigurationChange$str() {
        return "WFLYIM0003: Ungültige Statusänderung für die Konfigurationsänderung gefunden: '%1$s'";
    }
    @Override
    protected String zipEntryOutsideOfTarget$str() {
        return "Der Zip-Eintrag %1$s liegt außerhalb des Zielverzeichnisses %2$s.";
    }
    @Override
    protected String serverAlreadyPrepared$str() {
        return "WFLYIM0001: Es liegt eine vorbereitete Installation vor, die angewendet werden kann. Die aktuell vorbereitete Installation kann mit der Operation 'clean' verworfen werden.";
    }
    @Override
    protected String invalidChannelManifestGAV$str() {
        return "WFLYIM0009: Die GAV-Koordinate des Manifests '%1$s' für den Channel '%2$s' ist ungültig.";
    }
}
