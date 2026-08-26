package org.jboss.as.patching.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:44+0200")
public class PatchLogger_$logger_ja extends PatchLogger_$logger implements PatchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PatchLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String notADirectory$str() {
        return "ディレクトリー %1$s ではありません";
    }
    @Override
    protected String requiresPatch$str() {
        return "WFLYPAT0015: パッチ '%1$s' が必要です";
    }
    @Override
    protected String failedToDelete$str() {
        return "WFLYPAT0004: 削除できませんでした (%1$s)";
    }
    @Override
    protected String cliFailedToResolveDistribution$str() {
        return "jboss.home.dir の解決に失敗しました。--distribution 属性を使用して、有効なインストールを示してください。";
    }
    @Override
    protected String patchIdFoundInMoreThanOneStream$str() {
        return "WFLYPAT0041: 1 つ以上のストリームでパッチ %1$s が見つかりました: %2$s および %3$s";
    }
    @Override
    protected String installationMissingLayer$str() {
        return "ディレクトリー %2$s 下でレイヤー '%1$s' が見つかりません";
    }
    @Override
    protected String failedToDeleteBackup$str() {
        return "WFLYPAT0049: 一部のバックアップファイルが削除されませんでした。";
    }
    @Override
    protected String entryOutsideOfPatchDirectory$str() {
        return "WFLYPAT0051: 無効な zip ファイルです。パッチディレクトリー外のパスに解決されるエントリーが見つかりました: %1$s";
    }
    @Override
    protected String cannotCopyFiles$str() {
        return "WFLYPAT0047: %1$s から %2$s へファイルをコピーできません: %3$s";
    }
    @Override
    protected String unrecognizedConditionFormat$str() {
        return "WFLYPAT0045: 認識されないの条件形式 '%1$s'";
    }
    @Override
    protected String noSuchLayer$str() {
        return "WFLYPAT0013: %1$s というレイヤーはインストールされていません";
    }
    @Override
    protected String patchTypesDontMatch$str() {
        return "パッチタイプが一致しません";
    }
    @Override
    protected String alreadyApplied$str() {
        return "WFLYPAT0012: パッチ '%1$s' はすでに適用済みです";
    }
    @Override
    protected String detectedConflicts$str() {
        return "競合が検出されました";
    }
    @Override
    protected String patchBundleIsEmpty$str() {
        return "WFLYPAT0042: パッチバンドルが空です";
    }
    @Override
    protected String contentItemTypeMissing$str() {
        return "WFLYPAT0043: コンテンツ項目タイプが '%1$s' にありません";
    }
    @Override
    protected String productVersionDidNotMatchInstalled$str() {
        return "WFLYPAT0039: 要求された %1$s のバージョン %2$s はインストールされたバージョン %3$s と一致しませんでした。";
    }
    @Override
    protected String patchNotFoundInHistory$str() {
        return "WFLYPAT0021: 履歴でパッチ '%1$s' が見つかりませんでした。";
    }
    @Override
    protected String cannotCreateDirectory$str() {
        return "WFLYPAT0005: ディレクトリーを作成できませんでした (%1$s)";
    }
    @Override
    protected String installationInvalidLayerConfiguration$str() {
        return "レイヤー '%1$s' がある関連するモジュールまたはバンドルリポジトリーはありません";
    }
    @Override
    protected String noPatchesApplied$str() {
        return "WFLYPAT0020: ロールバックできません。適用されたパッチはありません。";
    }
    @Override
    protected String fileDoesNotExist$str() {
        return "WFLYPAT0008: 引数 %1$s が指定するパスにファイルが存在しません。";
    }
    @Override
    protected String serverRequiresRestart$str() {
        return "WFLYPAT0024: サーバーの再起動が必要な状態で、パッチの適用またはロールバックはできません。";
    }
    @Override
    protected String patchIsMissingFile$str() {
        return "WFLYPAT0028: パッチにないファイルがあります %1$s";
    }
    @Override
    protected String missingArtifact$str() {
        return "WFLYPAT0032: 存在しません: '%1$s'";
    }
    @Override
    protected String doesNotApply$str() {
        return "WFLYPAT0003: パッチは適用されません - 想定 (%1$s)、実際 (%2$s)";
    }
    @Override
    protected String layerNotFound$str() {
        return "WFLYPAT0030: レイヤーが見つかりません %1$s";
    }
    @Override
    protected String incompatiblePatch$str() {
        return "WFLYPAT0016: パッチは、パッチ '%1$s' と互換性がありません";
    }
    @Override
    protected String deleteRollbackError$str() {
        return "WFLYPAT0048: ファイル [%1$s] の復元時にエラーが発生しました - %2$s";
    }
    @Override
    protected String logPatchingInfo$str() {
        return "WFLYPAT0050: %1$s 累積パッチ ID: %2$s。 1 回限りのパッチ: %3$s";
    }
    @Override
    protected String cannotDeleteFile$str() {
        return "WFLYPAT0001: ファイル %1$s を削除できません";
    }
    @Override
    protected String illegalPatchName$str() {
        return "WFLYPAT0019: 無効なパッチ名 '%1$s'";
    }
    @Override
    protected String invalidRollbackInformation$str() {
        return "無効なロールバック情報";
    }
    @Override
    protected String failedToResolvePatch$str() {
        return "WFLYPAT0014: %1$s %2$s の有効なパッチ記述子を解決できませんでした";
    }
    @Override
    protected String failedToShowHistory$str() {
        return "WFLYPAT0023: パッチの履歴を表示できませんでした";
    }
    @Override
    protected String fileIsNotReadable$str() {
        return "WFLYPAT0029: ファイルは読み取り不可能です %1$s";
    }
    @Override
    protected String failedToLoadIdentity$str() {
        return "WFLYPAT0025: ID 情報のロードに失敗しました";
    }
    @Override
    protected String failedToLoadInfo$str() {
        return "WFLYPAT0040: %1$s の情報のロードに失敗しました";
    }
    @Override
    protected String cannotRenameFileDuringRestore$str() {
        return "WFLYPAT0037: ファイル %1$s の名前を変更して復元を処理することはできません";
    }
    @Override
    protected String wrongCopiedContent$str() {
        return "WFLYPAT0018: コピーした内容が、項目: %1$s の予期されるハッシュと一致しません";
    }
    @Override
    protected String unsupportedContentType$str() {
        return "WFLYPAT0044: サポートされないコンテンツタイプ '%1$s'";
    }
    @Override
    protected String conflictsDetected$str() {
        return "WFLYPAT0017: 競合が検出されました";
    }
    @Override
    protected String cannotRenameFileDuringBackup$str() {
        return "WFLYPAT0036: ファイル %1$s の名前を変更してバックアップを処理することはできません";
    }
    @Override
    protected String inconsistentArtifact$str() {
        return "WFLYPAT0033: 一貫性のない状態: '%1$s'";
    }
    @Override
    protected String cannotCopyFilesToTempDir$str() {
        return "WFLYPAT0046: ファイルを一時ディレクトリー %1$s へコピーできません: %2$s。'-Djava.io.tmpdir' スイッチを使用すると異なる一時ディレクトリーを設定できます。";
    }
    @Override
    protected String noPatchHistory$str() {
        return "WFLYPAT0027: パッチ履歴なし %1$s";
    }
    @Override
    protected String cannotRenameFile$str() {
        return "WFLYPAT0035: ファイル %1$s の名前を変更できません";
    }
    @Override
    protected String failedToUndoChange$str() {
        return "WFLYPAT0031: '%1$s' の変更を元に戻せませんでした。";
    }
    @Override
    protected String cannotInvalidateZip$str() {
        return "WFLYPAT0002: %1$s を無効化できません";
    }
    @Override
    protected String installationNoLayersConfigFound$str() {
        return "%1$s で layers ディレクトリーが見つかりませんでした";
    }
    @Override
    protected String installationDuplicateLayer$str() {
        return "%1$s '%2$s' の重複";
    }
    @Override
    protected String cannotRollbackPatch$str() {
        return "WFLYPAT0011: パッチをロールバックできません (%1$s)";
    }
    @Override
    protected String noMorePatches$str() {
        return "WFLYPAT0026: これ以上パッチはありません";
    }
    @Override
    protected String duplicateElementPatchId$str() {
        return "WFLYPAT0038: 要素 patch-id (%1$s) の複製";
    }
    @Override
    protected String artifactInError$str() {
        return "WFLYPAT0034: エラー: '%1$s'";
    }
}
