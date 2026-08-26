package org.wildfly.core.instmgr.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:21+0200")
public class InstMgrLogger_$logger_ja extends InstMgrLogger_$logger implements InstMgrLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InstMgrLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String noChannelRepositoriesDefined$str() {
        return "WFLYIM0005: '%1$s' チャネルに定義されているレポジトリーはありません。";
    }
    @Override
    protected String invalidChannelManifestURL$str() {
        return "WFLYIM0010: '%2$s' チャネルのマニフェスト URL '%1$s' は無効です。";
    }
    @Override
    protected String invalidManifestGAOnly$str() {
        return "WFLYIM0016: '%1$s' のマニフェスト maven 座標は無効です。このマニフェストの maven 座標は、GA (GroupId:ArtifactId) が想定されています。";
    }
    @Override
    protected String noResolveLocalCacheWithUseDefaultLocalCache$str() {
        return "WFLYIM0022: 'no-resolve-local-cache' と 'use-default-local-cache' は相互に排他的です (1 つだけ指定してください)。";
    }
    @Override
    protected String invalidZipEntry$str() {
        return ".zip ファイル内のディレクトリーとファイルの構造は無効です。'%1$s' ディレクトリーは、展開した .zip ファイルの 2 次エントリーとして見つかりません。";
    }
    @Override
    protected String localCacheWithNoResolveLocalCache$str() {
        return "WFLYIM0011: 'no-resolve-local-cache' オプションが有効になっている場合、'local-cache' オプションは使用できません。";
    }
    @Override
    protected String noChannelRepositoryURLDefined$str() {
        return "WFLYIM0006: チャネルの '%1$s' リポジトリーの URL は定義されていません。";
    }
    @Override
    protected String mavenRepoFileWithRepositories$str() {
        return "WFLYIM0012: 相互に排他的であるため、'maven-repo-file' オプションは 'repositories' オプションと併用できません。";
    }
    @Override
    protected String provisioningChannels$str() {
        return "WFLYIM0023: 次のチャネルバージョンを使用してインストールがプロビジョニングされました: '%1$s'";
    }
    @Override
    protected String invalidChannelRepositoryURL$str() {
        return "WFLYIM0007: '%2$s' チャネルのリポジトリー URL '%1$s' は無効です。";
    }
    @Override
    protected String failedToFindInstallationChannels$str() {
        return "WFLYIM0025: 次のインストールチャネルを報告できません: '%1$s'";
    }
    @Override
    protected String failedToCreateInstallationManager$str() {
        return "WFLYIM0024: インストールステータスを報告できません。パス '%1$s' の InstallationManager を作成できません: '%2$s'";
    }
    @Override
    protected String noChannelRepositoryIDDefined$str() {
        return "WFLYIM0008: チャネルの '%1$s' リポジトリーの ID は定義されていません。";
    }
    @Override
    protected String missingChannelName$str() {
        return "WFLYIM0004: チャネル名は必須です。";
    }
    @Override
    protected String channelNameNotFound$str() {
        return "WFLYIM0015: 名前が '%1$s' のチャネルは見つかりません。";
    }
    @Override
    protected String invalidRepositoryURL$str() {
        return "WFLYIM0013: 無効なリポジトリー URL 形式: '%1$s'";
    }
    @Override
    protected String localCacheWithUseDefaultLocalCache$str() {
        return "WFLYIM0021: 'use-default-local-cache' オプションが有効な場合、'local-cache' オプションは使用できません。";
    }
    @Override
    protected String operationCancelled$str() {
        return "WFLYIM0019: 操作がキャンセルされました。";
    }
    @Override
    protected String noCustomPatchFound$str() {
        return "WFLYIM0020: 指定されたマニフェスト maven 座標にインストールされたカスタムパッチはありません: '%1$s'";
    }
    @Override
    protected String invalidManifestGAV$str() {
        return "WFLYIM0017: '%1$s' のマニフェスト maven 座標は無効です。このマニフェストの maven 座標は、GAV (GroupId:ArtifactId:Version) が想定されています。";
    }
    @Override
    protected String workDirWithMavenRepoFileOrRepositories$str() {
        return "WFLYIM0014: 相互に排他的であるため、'work-dir' オプションと 'repositories' オプションまたは 'maven-repo-file' オプションは併用できません。";
    }
    @Override
    protected String installationManagerServiceDown$str() {
        return "WFLYIM0018: Installation Manager Service がダウンしています。";
    }
    @Override
    protected String unexpectedArtifactChange$str() {
        return "WFLYIM0002: アーティファクトの無効なステータス変更が見つかりました: '%1$s'";
    }
    @Override
    protected String unexpectedConfigurationChange$str() {
        return "WFLYIM0003: 設定変更の無効なステータス変更が見つかりました: '%1$s'";
    }
    @Override
    protected String zipEntryOutsideOfTarget$str() {
        return "ZIP エントリー %1$s はターゲットディレクトリー %2$s の外にあります。";
    }
    @Override
    protected String serverAlreadyPrepared$str() {
        return "WFLYIM0001: インストール準備が完了し、適用できる状態です。準備完了の状態にあるインストールは、消去操作で破棄できます。";
    }
    @Override
    protected String invalidChannelManifestGAV$str() {
        return "WFLYIM0009: '%2$s' チャネルのマニフェスト GAV 座標 '%1$s' は無効です。";
    }
}
