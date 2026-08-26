package org.jboss.as.patching.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:44+0200")
public class PatchLogger_$logger_zh_CN extends PatchLogger_$logger_zh implements PatchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PatchLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String notADirectory$str() {
        return "%1$s 不是一个目录";
    }
    @Override
    protected String requiresPatch$str() {
        return "WFLYPAT0015: 需要补丁 '%1$s'";
    }
    @Override
    protected String failedToDelete$str() {
        return "WFLYPAT0004: 删除（%1$s）失败";
    }
    @Override
    protected String cliFailedToResolveDistribution$str() {
        return "无法解析 jboss.home.dir，请使用 --distribution 属性来指向有效的安装位置。";
    }
    @Override
    protected String patchIdFoundInMoreThanOneStream$str() {
        return "WFLYPAT0041: 在多个流里发现补丁 %1$s：%2$s 和 %3$s";
    }
    @Override
    protected String installationMissingLayer$str() {
        return "在目录 %2$s 下无法找到层 '%1$s'";
    }
    @Override
    protected String failedToDeleteBackup$str() {
        return "WFLYPAT0049: 没有删除某些备份文件。";
    }
    @Override
    protected String entryOutsideOfPatchDirectory$str() {
        return "WFLYPAT0051: 无效的 zip file. 发现了一个解析到补丁目录之外的路径的条目：%1$s";
    }
    @Override
    protected String cannotCopyFiles$str() {
        return "WFLYPAT0047: 无法将文件从 %1$s 复制到 %2$s：%3$s";
    }
    @Override
    protected String unrecognizedConditionFormat$str() {
        return "WFLYPAT0045: 不被承认的条件格式 '%1$s'";
    }
    @Override
    protected String noSuchLayer$str() {
        return "WFLYPAT0013: 没有安装名为 %1$s 的层";
    }
    @Override
    protected String patchTypesDontMatch$str() {
        return "补丁类型不匹配";
    }
    @Override
    protected String alreadyApplied$str() {
        return "WFLYPAT0012: 补丁 '%1$s' 已被应用";
    }
    @Override
    protected String detectedConflicts$str() {
        return "检测到冲突";
    }
    @Override
    protected String patchBundleIsEmpty$str() {
        return "WFLYPAT0042: 补丁束是空的";
    }
    @Override
    protected String contentItemTypeMissing$str() {
        return "WFLYPAT0043: '%1$s' 里缺失了内容项类型";
    }
    @Override
    protected String productVersionDidNotMatchInstalled$str() {
        return "WFLYPAT0039: 请求的 %1$s 版本 %2$s 与已安装的版本 %3$s 不匹配";
    }
    @Override
    protected String patchNotFoundInHistory$str() {
        return "WFLYPAT0021: 在历史记录里没有找到补丁 '%1$s'。";
    }
    @Override
    protected String cannotCreateDirectory$str() {
        return "WFLYPAT0005: 创建目录（%1$s）失败";
    }
    @Override
    protected String installationInvalidLayerConfiguration$str() {
        return "没有带有层 '%1$s' 的相关模块或束资料库";
    }
    @Override
    protected String noPatchesApplied$str() {
        return "WFLYPAT0020: 无法回滚。没有应用补丁。";
    }
    @Override
    protected String fileDoesNotExist$str() {
        return "WFLYPAT0008: 参数 %1$s 指定的路径上的文件不存在";
    }
    @Override
    protected String serverRequiresRestart$str() {
        return "WFLYPAT0024: 当服务器处于需要重启的状态时，无法应用或回滚补丁。";
    }
    @Override
    protected String patchIsMissingFile$str() {
        return "WFLYPAT0028: 补丁缺失了文件 %1$s";
    }
    @Override
    protected String missingArtifact$str() {
        return "WFLYPAT0032: 缺失：'%1$s'";
    }
    @Override
    protected String doesNotApply$str() {
        return "WFLYPAT0003: 补丁不适用 - 期望（%1$s），但结果是（%2$s）";
    }
    @Override
    protected String layerNotFound$str() {
        return "WFLYPAT0030: 未找到层 %1$s";
    }
    @Override
    protected String incompatiblePatch$str() {
        return "WFLYPAT0016: 补丁和补丁 '%1$s' 不兼容";
    }
    @Override
    protected String deleteRollbackError$str() {
        return "WFLYPAT0048: 恢复文件 [%1$s] - %2$s 时出错";
    }
    @Override
    protected String logPatchingInfo$str() {
        return "WFLYPAT0050: %1$s 累计补丁 ID 是：%2$s，一次性补丁包括：%3$s";
    }
    @Override
    protected String cannotDeleteFile$str() {
        return "WFLYPAT0001: 无法删除文件 %1$s";
    }
    @Override
    protected String illegalPatchName$str() {
        return "WFLYPAT0019: 无效的补丁名 '%1$s'";
    }
    @Override
    protected String invalidRollbackInformation$str() {
        return "无效的回滚信息";
    }
    @Override
    protected String failedToResolvePatch$str() {
        return "WFLYPAT0014: 解析 %1$s %2$s 的有效补丁描述符失败";
    }
    @Override
    protected String failedToShowHistory$str() {
        return "WFLYPAT0023: 显示补丁历史失败";
    }
    @Override
    protected String fileIsNotReadable$str() {
        return "WFLYPAT0029: 文件 %1$s 不是可读的";
    }
    @Override
    protected String failedToLoadIdentity$str() {
        return "WFLYPAT0025: 加载标识符信息失败";
    }
    @Override
    protected String failedToLoadInfo$str() {
        return "WFLYPAT0040: 加载 %1$s 信息失败";
    }
    @Override
    protected String cannotRenameFileDuringRestore$str() {
        return "WFLYPAT0037: 无法通过重命名文件 %1$s 处理恢复";
    }
    @Override
    protected String wrongCopiedContent$str() {
        return "WFLYPAT0018: 复制的内容不匹配条目 %1$s 的期望哈希值";
    }
    @Override
    protected String unsupportedContentType$str() {
        return "WFLYPAT0044: 不被支持的内容类型 '%1$s'";
    }
    @Override
    protected String conflictsDetected$str() {
        return "WFLYPAT0017: 检测到冲突";
    }
    @Override
    protected String cannotRenameFileDuringBackup$str() {
        return "WFLYPAT0036: 无法通过重命名文件 %1$s 处理备份";
    }
    @Override
    protected String inconsistentArtifact$str() {
        return "WFLYPAT0033: 不一致的状态：'%1$s'";
    }
    @Override
    protected String cannotCopyFilesToTempDir$str() {
        return "WFLYPAT0046: 无法复制文件到临时目录 %1$s：%2$s。请注意，'-Djava.io.tmpdir' 开关可用来设置不同的临时目录。";
    }
    @Override
    protected String noPatchHistory$str() {
        return "WFLYPAT0027: 没有补丁历史 %1$s";
    }
    @Override
    protected String cannotRenameFile$str() {
        return "WFLYPAT0035: 无法重命名文件 %1$s";
    }
    @Override
    protected String failedToUndoChange$str() {
        return "WFLYPAT0031: 取消 '%1$s' 的修改失败";
    }
    @Override
    protected String cannotInvalidateZip$str() {
        return "WFLYPAT0002: 无法使 %1$s 失效";
    }
    @Override
    protected String installationNoLayersConfigFound$str() {
        return "在 %1$s 没找到层目录";
    }
    @Override
    protected String installationDuplicateLayer$str() {
        return "复制 %1$s '%2$s'";
    }
    @Override
    protected String cannotRollbackPatch$str() {
        return "WFLYPAT0011: 无法回滚补丁（%1$s）";
    }
    @Override
    protected String noMorePatches$str() {
        return "WFLYPAT0026: 没有更多的补丁";
    }
    @Override
    protected String duplicateElementPatchId$str() {
        return "WFLYPAT0038: 重复的元素 patch-id (%1$s)";
    }
    @Override
    protected String artifactInError$str() {
        return "WFLYPAT0034: 出现错误：'%1$s'";
    }
}
