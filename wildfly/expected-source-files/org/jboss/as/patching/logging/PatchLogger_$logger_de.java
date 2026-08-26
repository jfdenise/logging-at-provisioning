package org.jboss.as.patching.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:23+0200")
public class PatchLogger_$logger_de extends PatchLogger_$logger implements PatchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PatchLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotDeleteFile$str() {
        return "WFLYPAT0001: Kann Datei %1$s nicht löschen";
    }
    @Override
    protected String cannotInvalidateZip$str() {
        return "WFLYPAT0002: Kann %1$s nicht ungültig machen";
    }
    @Override
    protected String detectedConflicts$str() {
        return "Konflikte gefunden";
    }
    @Override
    protected String cliFailedToResolveDistribution$str() {
        return "Auflösung einer jboss.home.dir fehlgeschlagen, verwende das --distribution Attribut zum Verweis auf eine gültige Installation";
    }
    @Override
    protected String installationNoLayersConfigFound$str() {
        return "Kein Ebenenverzeichnis gefunden an %1$s";
    }
    @Override
    protected String installationMissingLayer$str() {
        return "Kann Ebene '%1$s' nicht unter Verzeichnis %2$s finden";
    }
    @Override
    protected String installationInvalidLayerConfiguration$str() {
        return "kein zugehöriges Modul oder Bündel-Repository mit Ebene '%1$s'";
    }
    @Override
    protected String installationDuplicateLayer$str() {
        return "%1$s '%2$s' doppelt";
    }
    @Override
    protected String notADirectory$str() {
        return "Kein Verzeichnis %1$s";
    }
    @Override
    protected String patchTypesDontMatch$str() {
        return "Patch-Types stimmen nicht überein";
    }
    @Override
    protected String invalidRollbackInformation$str() {
        return "ungültige Rollback Informationen";
    }
    @Override
    protected String doesNotApply$str() {
        return "WFLYPAT0003: Patch nicht anwendbar – (%1$s) erwartet, gefunden wurde (%2$s)";
    }
    @Override
    protected String failedToDelete$str() {
        return "WFLYPAT0004: Löschung von (%1$s) fehlgeschlagen";
    }
    @Override
    protected String cannotCreateDirectory$str() {
        return "WFLYPAT0005: Erstellen von Verzeichnis (%1$s) fehlgeschlagen";
    }
    @Override
    protected String fileDoesNotExist$str() {
        return "WFLYPAT0008: Durch Argument %1$s festgelegte Datei an Pfad ist nicht vorhanden";
    }
    @Override
    protected String cannotRollbackPatch$str() {
        return "WFLYPAT0011: Rollback von Patch (%1$s) nicht möglich";
    }
    @Override
    protected String alreadyApplied$str() {
        return "WFLYPAT0012: Patch '%1$s' bereits angewendet";
    }
    @Override
    protected String noSuchLayer$str() {
        return "WFLYPAT0013: Keine Ebene namens %1$s installiert";
    }
    @Override
    protected String failedToResolvePatch$str() {
        return "WFLYPAT0014: Auflösung eines gültigen Patch-Deskriptors für %1$s %2$s fehlgeschlagen";
    }
    @Override
    protected String requiresPatch$str() {
        return "WFLYPAT0015: Benötigt Patch '%1$s'";
    }
    @Override
    protected String incompatiblePatch$str() {
        return "WFLYPAT0016: Patch ist nicht kompatibel mit Patch '%1$s'";
    }
    @Override
    protected String conflictsDetected$str() {
        return "WFLYPAT0017: Konflikte gefunden";
    }
    @Override
    protected String wrongCopiedContent$str() {
        return "WFLYPAT0018: kopierter Inhalt stimmt nicht mit erwartetem Hash für Element überein: %1$s";
    }
    @Override
    protected String illegalPatchName$str() {
        return "WFLYPAT0019: ungültiger Patch-Name '%1$s'";
    }
    @Override
    protected String noPatchesApplied$str() {
        return "WFLYPAT0020: Kann nicht zurücksetzen. Keine Patches angewendet.";
    }
    @Override
    protected String patchNotFoundInHistory$str() {
        return "WFLYPAT0021: Patch '%1$s' nicht in Historie gefunden.";
    }
    @Override
    protected String failedToShowHistory$str() {
        return "WFLYPAT0023: Anzeige der Historie von Patches fehlgeschlagen";
    }
    @Override
    protected String serverRequiresRestart$str() {
        return "WFLYPAT0024: Kann einen Patch nicht anwenden oder zurücksetzen, wenn sich der Server in einem Status befindet, der den Neustart erforderlich macht.";
    }
    @Override
    protected String failedToLoadIdentity$str() {
        return "WFLYPAT0025: Laden von Identitäts-Info fehlgeschlagen";
    }
    @Override
    protected String noMorePatches$str() {
        return "WFLYPAT0026: Keine Patches mehr";
    }
    @Override
    protected String noPatchHistory$str() {
        return "WFLYPAT0027: Keine Patch-Historie %1$s";
    }
    @Override
    protected String patchIsMissingFile$str() {
        return "WFLYPAT0028: Beim Patch fehlt Datei %1$s";
    }
    @Override
    protected String fileIsNotReadable$str() {
        return "WFLYPAT0029: Datei ist nicht lesbar %1$s";
    }
    @Override
    protected String layerNotFound$str() {
        return "WFLYPAT0030: Ebene nicht gefunden %1$s";
    }
    @Override
    protected String failedToUndoChange$str() {
        return "WFLYPAT0031: Konnte Änderung nicht rückgängig machen für: '%1$s'";
    }
    @Override
    protected String missingArtifact$str() {
        return "WFLYPAT0032: '%1$s' fehlt";
    }
    @Override
    protected String inconsistentArtifact$str() {
        return "WFLYPAT0033: inkonsistenter Status: '%1$s'";
    }
    @Override
    protected String artifactInError$str() {
        return "WFLYPAT0034: Fehler: '%1$s'";
    }
    @Override
    protected String cannotRenameFile$str() {
        return "WFLYPAT0035: Datei %1$s kann nicht umbenannt werden";
    }
    @Override
    protected String cannotRenameFileDuringBackup$str() {
        return "WFLYPAT0036: Backup kann nicht durch Umbenennen von Datei %1$s verarbeitet werden";
    }
    @Override
    protected String cannotRenameFileDuringRestore$str() {
        return "WFLYPAT0037: Wiederherstellen kann nicht durch Umbenennen von Datei %1$s verarbeitet werden";
    }
    @Override
    protected String duplicateElementPatchId$str() {
        return "WFLYPAT0038: Doppeltes Element patch-id (%1$s)";
    }
    @Override
    protected String productVersionDidNotMatchInstalled$str() {
        return "WFLYPAT0039: Angeforderte %1$s-Version %2$s stimmt nicht mit der installierten Version %3$s überein";
    }
    @Override
    protected String failedToLoadInfo$str() {
        return "WFLYPAT0040: Laden von %1$s-Informationen fehlgeschlagen";
    }
    @Override
    protected String patchIdFoundInMoreThanOneStream$str() {
        return "WFLYPAT0041: Patch %1$s wurde in mehr als einem Stream gefunden: %2$s und %3$s";
    }
    @Override
    protected String patchBundleIsEmpty$str() {
        return "WFLYPAT0042: Patch-Bündel ist leer";
    }
    @Override
    protected String contentItemTypeMissing$str() {
        return "WFLYPAT0043: Inhaltselementtyp fehlt in '%1$s'";
    }
    @Override
    protected String unsupportedContentType$str() {
        return "WFLYPAT0044: Nicht unterstützter Inhaltstyp '%1$s'";
    }
    @Override
    protected String unrecognizedConditionFormat$str() {
        return "WFLYPAT0045: Nicht erkanntes Bedingungsformat '%1$s'";
    }
    @Override
    protected String cannotCopyFilesToTempDir$str() {
        return "WFLYPAT0046: Dateien konnten nicht in temporäres Verzeichnis %1$s kopiert werden: %2$s. Beachten Sie, dass der Switch '-Djava.io.tmpdir' dazu verwendet werden kann, ein anderes temporäres Verzeichnis festzulegen.";
    }
    @Override
    protected String cannotCopyFiles$str() {
        return "WFLYPAT0047: Dateien konnten nicht von %1$s nach %2$s kopiert werden: %3$s";
    }
    @Override
    protected String deleteRollbackError$str() {
        return "WFLYPAT0048: Fehler beim Wiederherstellen von Datei [%1$s] – %2$s";
    }
    @Override
    protected String failedToDeleteBackup$str() {
        return "WFLYPAT0049: Einige Backup-Dateien wurden nicht entfernt.";
    }
    @Override
    protected String logPatchingInfo$str() {
        return "WFLYPAT0050: Kumulative Patch-ID von %1$s ist: %2$s, einzelne Patches sind u.a.: %3$s";
    }
    @Override
    protected String entryOutsideOfPatchDirectory$str() {
        return "WFLYPAT0051: Ungültige ZIP-Datei. Es wurde ein Eintrag gefunden, der in einem Pfad außerhalb des Patch-Verzeichnisses auflöst: %1$s";
    }
}
