package org.jboss.as.server.deployment.scanner.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:12+0200")
public class DeploymentScannerLogger_$logger_zh_CN extends DeploymentScannerLogger_$logger_zh implements DeploymentScannerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DeploymentScannerLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedCheckingZipFile$str() {
        return "WFLYDS0008: 检查 %1$s 是否为完整 zip 失败";
    }
    @Override
    protected String scannerDeploymentRemovedButNotByScanner$str() {
        return "WFLYDS0019: 部署 %1$s 之前被这个扫描器部署但又被另外一个管理工具从服务器列表卸载。已添加了 Marker 文件 %2$s 来记录这个事实。";
    }
    @Override
    protected String previousContentDeployed$str() {
        return "已部署这个内容的上一个版本，并仍处于部署状态。";
    }
    @Override
    protected String directoryIsNotWritable$str() {
        return "WFLYDS0039: %1$s 不是可写的";
    }
    @Override
    protected String failedStatusSynchronization$str() {
        return "WFLYDS0034: 同步部署 %1$s 的状态失败。";
    }
    @Override
    protected String bootTimeScanFailed$str() {
        return "WFLYDS0042: 由于无法访问部署目录 %1$s，引导扫描失败。";
    }
    @Override
    protected String scanFailed$str() {
        return "WFLYDS0043: 由于无法访问部署目录 %1$s，部署目录扫描失败。";
    }
    @Override
    protected String cannotRemoveDeploymentMarker$str() {
        return "WFLYDS0002: 无法删除外部部署标记文件 %1$s";
    }
    @Override
    protected String cannotDeleteDeploymentProgressMarker$str() {
        return "WFLYDS0001: 无法删除部署进度标记文件 %1$s";
    }
    @Override
    protected String fileSystemDeploymentFailed$str() {
        return "WFLYDS0009: 失败的文件系统部署服务";
    }
    @Override
    protected String deploymentTriggered$str() {
        return "WFLYDS0004: 在部署目录中找到 %1$s。让部署生成名为 %1$s%2$s 的文件";
    }
    @Override
    protected String deploymentContentIncomplete$str() {
        return "WFLYDS0021: 部署内容 %1$s 不完整，且不会完整。无法自动部署这个内容。%2$s";
    }
    @Override
    protected String invalidXmlFileFound$str() {
        return "WFLYDS0035: 扫描发现 %1$s 的第 %2$s 行、第 %3$s 列格式不对。扫描时复制的文件不完整或者有错误。";
    }
    @Override
    protected String invalidZipFileFormat$str() {
        return "WFLYDS0025: 不能扫描文件 %1$s，因为它不以 ZIP 文件格式开始，使用的是本地文件标头签名。";
    }
    @Override
    protected String deploymentScannerNotForDomainMode$str() {
        return "WFLYDS0031: 带有模块 'org.jboss.as.deployment-scanner' 的扩展无法在受管域里安装。请将它以及任何引用它的子系统删除。";
    }
    @Override
    protected String incompleteContent$str() {
        return "WFLYDS0010: 扫描发现部署 %1$s 的不完整的复制文件内容。到所有内容完整后才可进行部署更改。";
    }
    @Override
    protected String unsafeAutoDeploy2$str() {
        return "WFLYDS0030: 文件 %2$s 被配置为自动部署，但不能安全地进行自动部署。该文件不能自动部署的理由为：%1$s。要启用这个文件部署，可生成名为 %2$s%3$s 的文件。";
    }
    @Override
    protected String directoryIsNotReadable$str() {
        return "WFLYDS0041: %1$s 不是可读的";
    }
    @Override
    protected String failedCheckingXMLFile$str() {
        return "WFLYDS0016: 检查 %1$s 是否为完整 XML 失败";
    }
    @Override
    protected String deploymentTimeout$str() {
        return "WFLYDS0022: 没有收到允许超时阶段 [%1$d seconds] 对部署操作的响应。检查服务器配置文件和服务器日志查找该部署的更多情况。";
    }
    @Override
    protected String invalidZip64FileFormat$str() {
        return "WFLYDS0026: 无法扫描文件 %1$s，因为它使用当前不支持的 ZIP64 格式。";
    }
    @Override
    protected String scanException$str() {
        return "WFLYDS0012: %1$s threw 异常的扫描";
    }
    @Override
    protected String invalidExplodedDeploymentDirectory$str() {
        return "WFLYDS0011: 部署扫描找到名为 %1$s 的目录，它不在以 .ear、.jar、.rar、.sar 或 .war 结尾的目录中。这可能是直接在 %2$s 目录解压缩归档的结果，它是一个用户错误。不会为部署扫描 %1$s 目录，但有可能该扫描程序会从未解压缩归档中找到其他文件，并尝试部署它们而导致出错。";
    }
    @Override
    protected String started$str() {
        return "WFLYDS0013: 为目录 %2$s 启动的 %1$s";
    }
    @Override
    protected String initialScanFailed$str() {
        return "WFLYDS0017: 初始的部署扫描失败";
    }
    @Override
    protected String pathEntryNotFound$str() {
        return "WFLYDS0040: 无法找到 %1$s 的 relative-to 路径条目";
    }
    @Override
    protected String unsafeAutoDeploy$str() {
        return "WFLYDS0014: 扫描找到为自动部署配置的内容，这些内容不能进行安全自动部署。查看以上详情。删除所有问题内容或是否部署内容，或不使用 %1$s 或 %2$s 标记文件指示后方可执行部署更改。问题部署为 %3$s。";
    }
    @Override
    protected String explodedAutoDeploymentContentWarning$str() {
        return "WFLYDS0006: 如果启用大量内容的自动部署（例如不使用 \"%1$s\"' 标记文件部署），则不可能有可信的部署行为。在所有要求可信性的情况下都不推荐使用大量内容的自动部署。配置部署扫描的 %2$s，建议设定为 \"false\"。";
    }
    @Override
    protected String reattemptingFailedDeployment$str() {
        return "WFLYDS0015: 重新尝试失败的部署 %1$s";
    }
    @Override
    protected String directoryIsNonexistent$str() {
        return "WFLYDS0037: %1$s 不存在";
    }
    @Override
    protected String deployModelOperationFailed$str() {
        return "WFLYDS0036: 部署模型操作失败 %1$s";
    }
    @Override
    protected String scannerDeploymentRedeployedButNotByScanner$str() {
        return "WFLYDS0033: 部署 %1$s 之前被这个扫描器卸载但又被另外一个管理工具部署。已删除 Marker 文件 %2$s 来记录这个事实。";
    }
    @Override
    protected String explodedDeploymentContentDeleted$str() {
        return "WFLYDS0007: 部署扫描程序发现大量的部署 %1$s 的内容已删除，但没有为大量部署启用 auto-deploy/undeploy，且已删除这个部署的 %1$s%2$s 标记文件。结果是该部署还没有取消部署，但已删除该部署所需资源，并可能会发生程序错误。建议删除 %1$s%2$s 标记文件启动取消部署。";
    }
    @Override
    protected String isNotADirectory$str() {
        return "WFLYDS0038: %1$s 不是一个目录";
    }
    @Override
    protected String scannerDeploymentUndeployedButNotByScanner$str() {
        return "WFLYDS0018: 这个扫描器之前部署但又被另外一个管理工具卸载的部署 %1$s。已添加了 Marker 文件 %2$s 来记录这个事实。";
    }
    @Override
    protected String errorWritingDeploymentMarker$str() {
        return "WFLYDS0005: 写入部署标记文件 %1$s 时捕获异常";
    }
    @Override
    protected String deploymentNotFound$str() {
        return "WFLYDS0003: 请求 '%1$s' 部署，但没有显示该部署。";
    }
    @Override
    protected String cannotListDirectoryFiles$str() {
        return "WFLYDS0032: 无法列出目录 %1$s 里的文件。请检查目录里的内容是否是可读的。";
    }
}
