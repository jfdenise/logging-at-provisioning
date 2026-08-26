package org.wildfly.extension.batch.jberet._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:54:10+0200")
public class BatchLogger_$logger_zh_CN extends BatchLogger_$logger_zh implements BatchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BatchLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String errorProcessingBatchJobsDir$str() {
        return "WFLYBATCH000001: 处理 META-INF/batch-jobs 目录时出错。";
    }
    @Override
    protected String cannotRemoveResourceOfType$str() {
        return "WFLYBATCH000002: 无法删除类型为 %1$s 的资源";
    }
    @Override
    protected String couldNotFindDeploymentName$str() {
        return "WFLYBATCH000003: 无法找到部署名称：%1$s";
    }
    @Override
    protected String jobOperatorServiceStopped$str() {
        return "WFLYBATCH000004: JobOperatorService 服务已被停止且无法执行操作。";
    }
    @Override
    protected String noSuchJobException$str() {
        return "WFLYBATCH000005: 无法找到部署的任务名称 '%1$s'。";
    }
    @Override
    protected String couldNotFindJobXml$str() {
        return "WFLYBATCH000006: 无法在部署 %1$s 里找到任务 XML 文件。";
    }
    @Override
    protected String invalidJobXmlFile$str() {
        return "WFLYBATCH000007: 处理作业 XML 文件 %1$s 失败。试图执行这个任务可能导致错误发生。";
    }
    @Override
    protected String emptyJobRepositoryElement$str() {
        return "WFLYBATCH000008: 在部署描述符里发现空的 job-repository 元素。对部署 %1$s 使用默认的任务仓库。";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYBATCH000009: 只有父资源支持有序子资源时，有索引的子资源才可以注册。'%1$s' 的父资源没有编入索引";
    }
    @Override
    protected String failedToCreateJobRepository$str() {
        return "WFLYBATCH000011: 创建 %1$s 任务仓库失败。";
    }
    @Override
    protected String multipleJobRepositoriesFound$str() {
        return "WFLYBATCH000013: 在 jboss-all.xml 部署描述符里只能定义一个任务资料库。第一个任务资料库将被使用。";
    }
    @Override
    protected String stoppingJob$str() {
        return "WFLYBATCH000014: 正在为部署 %3$s 执行 %2$s 的 %1$d";
    }
    @Override
    protected String stoppingJobFailed$str() {
        return "WFLYBATCH000015: 无法在部署 %3$s 上停止作业 %2$s 的执行 %1$d 。";
    }
    @Override
    protected String failedRestartingJob$str() {
        return "WFLYBATCH000016: 无法在部署 %3$s 上重启作业 %2$s 的执行 %1$d。";
    }
    @Override
    protected String restartingJob$str() {
        return "WFLYBATCH000017: 重启之前停止的批作业 %1$s。之前的执行 ID 为 %2$d，新的执行 ID 为 %3$d。";
    }
    @Override
    protected String noBatchEnvironmentFound$str() {
        return "WFLYBATCH000019: 未找到类加载器 %1$s 的批处理环境";
    }
    @Override
    protected String unauthorized$str() {
        return "WFLYBATCH000020: 权限被拒绝。用户%1$s没有%2$s权限。";
    }
    @Override
    protected String duplicateVirtualFile$str() {
        return "WFLYBATCH000021: 重复的虚拟文件 %1$s。";
    }
}
