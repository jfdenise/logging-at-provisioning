package org.wildfly.core.instmgr.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:21+0200")
public class InstMgrLogger_$logger_zh_CN extends InstMgrLogger_$logger_zh implements InstMgrLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InstMgrLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String noChannelRepositoriesDefined$str() {
        return "WFLYIM0005: '%1$s' 渠道中没有定义任何软件仓库。";
    }
    @Override
    protected String invalidChannelManifestURL$str() {
        return "WFLYIM0010: '%1$s' 渠道的清单 URL '%2$s'' 是无效的。";
    }
    @Override
    protected String invalidManifestGAOnly$str() {
        return "WFLYIM0016: '%1$s' 的清单 maven 坐标无效。此清单的预期 maven 坐标是 GA (GroupId:ArtifactId)。";
    }
    @Override
    protected String noResolveLocalCacheWithUseDefaultLocalCache$str() {
        return "WFLYIM0022: 'no-resolve-local-cache' 和 'use-default-local-cache' 是互斥的（只能指定一个）。";
    }
    @Override
    protected String invalidZipEntry$str() {
        return ".zip 文件中的目录和文件的结构无效。'%1$s' 目录不能在解压的 .zip 文件中作为一个二级条目找到。";
    }
    @Override
    protected String localCacheWithNoResolveLocalCache$str() {
        return "WFLYIM0011: 当启用 'no-resolve-local-cache' 选项时，您无法使用 'local-cache' 选项。";
    }
    @Override
    protected String noChannelRepositoryURLDefined$str() {
        return "WFLYIM0006: 渠道中的 '%1$s' 存储库没有定义它的 URL。";
    }
    @Override
    protected String mavenRepoFileWithRepositories$str() {
        return "WFLYIM0012: 您不能将 'maven-repo-file' 选项与 'repositories' 选项一起使用，因为它们是互斥的。";
    }
    @Override
    protected String provisioningChannels$str() {
        return "WFLYIM0023: 安装是使用以下渠道版本提供的： '%1$s'";
    }
    @Override
    protected String invalidChannelRepositoryURL$str() {
        return "WFLYIM0007: '%1$s' 渠道的存储库 URL '%2$s'' 是无效的。";
    }
    @Override
    protected String failedToFindInstallationChannels$str() {
        return "WFLYIM0025: 无法报告安装渠道： '%1$s'";
    }
    @Override
    protected String failedToCreateInstallationManager$str() {
        return "WFLYIM0024: 无法报告安装状态。无法为路径 '%1$s': '%2$s' 创建 InstallationManager";
    }
    @Override
    protected String noChannelRepositoryIDDefined$str() {
        return "WFLYIM0008: 渠道中的 '%1$s' 存储库没有定义其 ID。";
    }
    @Override
    protected String missingChannelName$str() {
        return "WFLYIM0004: 渠道名称是必需的。";
    }
    @Override
    protected String channelNameNotFound$str() {
        return "WFLYIM0015: 无法找到名为 '%1$s' 的渠道。";
    }
    @Override
    protected String invalidRepositoryURL$str() {
        return "WFLYIM0013: 存储库 URL 的格式无效： '%1$s'";
    }
    @Override
    protected String localCacheWithUseDefaultLocalCache$str() {
        return "WFLYIM0021: 当启用了 'use-default-local-cache' 选项时，您无法使用 'local-cache' 选项。";
    }
    @Override
    protected String operationCancelled$str() {
        return "WFLYIM0019: 操作已被取消。";
    }
    @Override
    protected String noCustomPatchFound$str() {
        return "WFLYIM0020: 没有为指定清单 maven 坐标找到安装的自定义补丁：'%1$s'";
    }
    @Override
    protected String invalidManifestGAV$str() {
        return "WFLYIM0017: '%1$s' 的清单 maven 坐标无效。此清单的预期 maven 坐标是 GAV (GroupId:ArtifactId:Version)，其中 Version 是可选的。";
    }
    @Override
    protected String workDirWithMavenRepoFileOrRepositories$str() {
        return "WFLYIM0014: 您不能将 'work-dir' 选项与 'repositories' 或 'maven-repo-file' 选项一起使用，因为它们是互斥的。";
    }
    @Override
    protected String installationManagerServiceDown$str() {
        return "WFLYIM0018: 安装管理器服务已停机。";
    }
    @Override
    protected String unexpectedArtifactChange$str() {
        return "WFLYIM0002: 为工件找到无效的状态更改：'%1$s'";
    }
    @Override
    protected String unexpectedConfigurationChange$str() {
        return "WFLYIM0003: 为配置更改找到无效的状态更改：'%1$s'";
    }
    @Override
    protected String zipEntryOutsideOfTarget$str() {
        return "zip 条目 %1$s 位于目标目录 %2$s 之外。";
    }
    @Override
    protected String serverAlreadyPrepared$str() {
        return "WFLYIM0001: 已准备好安装并准备好应用。当前准备的安装可以使用\"clean\"操作丢弃。";
    }
    @Override
    protected String invalidChannelManifestGAV$str() {
        return "WFLYIM0009: '%2$s' 渠道的清单 GAV 协调 '%1$s' 是无效的。";
    }
}
