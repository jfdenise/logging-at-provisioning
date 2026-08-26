package org.jboss.as.repository.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:12+0200")
public class DeploymentRepositoryLogger_$logger_zh_CN extends DeploymentRepositoryLogger_$logger_zh implements DeploymentRepositoryLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DeploymentRepositoryLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String obsoleteContentCleaned$str() {
        return "WFLYDR0009: 内容 %1$s 已过时，它将被删除。";
    }
    @Override
    protected String contentDeletionError$str() {
        return "WFLYDR0010: 无法删除内容 %1$s";
    }
    @Override
    protected String archiveNotFound$str() {
        return "WFLYDR0016: 未找到归档文件 %1$s";
    }
    @Override
    protected String errorUpdatingDeployment$str() {
        return "WFLYDR0021: 更新展开的部署的内容出错";
    }
    @Override
    protected String directoryNotWritable$str() {
        return "WFLYDR0006: 目录 %1$s 不是可写的";
    }
    @Override
    protected String localContentListError$str() {
        return "WFLYDR0011: 无法列出 %1$s 的目录文件";
    }
    @Override
    protected String hashingError$str() {
        return "WFLYDR0012: 无法 hash 当前的部署内容 %1$s";
    }
    @Override
    protected String notAnArchive$str() {
        return "WFLYDR0015: %1$s 不是一个归档文件";
    }
    @Override
    protected String forbiddenPath$str() {
        return "WFLYDR0013: 对部署里 %1$s 的内容访问被拒绝";
    }
    @Override
    protected String contentAdded$str() {
        return "WFLYDR0001: 在位置 %1$s 上添加内容";
    }
    @Override
    protected String cannotDeleteTempFile$str() {
        return "WFLYDR0003: 无法删除临时文件 %1$s，将在退出时删除";
    }
    @Override
    protected String cannotObtainSha1$str() {
        return "WFLYDR0005: 无法获得 SHA-1 %1$s";
    }
    @Override
    protected String notADirectory$str() {
        return "WFLYDR0007: %1$s 不是一个目录";
    }
    @Override
    protected String couldNotDeleteDeployment$str() {
        return "WFLYDR0014: 删除部署 %1$s 出错";
    }
    @Override
    protected String errorAccessingDeployment$str() {
        return "WFLYDR0020: 访问部署文件出错";
    }
    @Override
    protected String errorCopyingDeployment$str() {
        return "WFLYDR0022: 复制展开部署的文件至 %1$s 出错";
    }
    @Override
    protected String cannotCreateDirectory$str() {
        return "WFLYDR0004: 无法创建目录 %1$s";
    }
    @Override
    protected String cannotDeleteFile$str() {
        return "WFLYDR0023: 删除文件 %1$s 出错";
    }
    @Override
    protected String errorExplodingContent$str() {
        return "WFLYDR0018: 展开 %1$s 内容出错";
    }
    @Override
    protected String errorLockingDeployment$str() {
        return "WFLYDR0019: 部署被另外一个操作锁住";
    }
    @Override
    protected String cannotCopyFile$str() {
        return "WFLYDR0024: 复制文件 %1$s 出错";
    }
    @Override
    protected String contentRemoved$str() {
        return "WFLYDR0002: 在位置 %1$s 上删除内容";
    }
    @Override
    protected String contentExploded$str() {
        return "WFLYDR0017: 内容在位置 %1$s 展开";
    }
}
