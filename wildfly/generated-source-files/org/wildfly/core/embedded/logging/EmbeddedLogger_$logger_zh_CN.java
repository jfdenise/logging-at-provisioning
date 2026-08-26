package org.wildfly.core.embedded.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:18+0200")
public class EmbeddedLogger_$logger_zh_CN extends EmbeddedLogger_$logger_zh implements EmbeddedLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public EmbeddedLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotCreateStandaloneServer$str() {
        return "WFLYEMB0019: 无法使用工厂 %1$s 创建独立服务器";
    }
    @Override
    protected String errorCopyingFile$str() {
        return "WFLYEMB0028: 复制 '%1$s' 到 '%2$s' 时出错 (%3$s)";
    }
    @Override
    protected String cannotGetReflectiveMethod$str() {
        return "WFLYEMB0018: 无法获取 %2$s 的反射性方法 '%1$s'";
    }
    @Override
    protected String processIsReloading$str() {
        return "WFLYEMB0024: 内嵌服务器正在重载，ModelControllerClient 上的调用还不可用。";
    }
    @Override
    protected String propertySpecifiedFileIsNotADirectory$str() {
        return "WFLYEMB0029: -D%1$s=%2$s 不是一个目录";
    }
    @Override
    protected String embeddedServerDirectoryNotFound$str() {
        return "WFLYEMB0143: 在 '%2$s' 下不存在名为 '%1$s' 的目录";
    }
    @Override
    protected String moduleLoaderAlreadyConfigured$str() {
        return "WFLYEMB0145: 模块加载器已配置。更改 %1$s 属性将没有影响。";
    }
    @Override
    protected String failedToRestoreContext$str() {
        return "WFLYEMB0146: 恢复上下文 %1$s 失败";
    }
    @Override
    protected String propertySpecifiedFileDoesNotExist$str() {
        return "WFLYEMB0144: -D%1$s=%2$s 不存在";
    }
    @Override
    protected String moduleLoaderError$str() {
        return "WFLYEMB0014: 无法从 %1$s 加载模块 %2$s";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYEMB0015: %1$s 为 null";
    }
    @Override
    protected String cannotInvokeStandaloneServer$str() {
        return "WFLYEMB0022: 无法调用内嵌进程上的 '%1$s'";
    }
    @Override
    protected String processIsStopped$str() {
        return "WFLYEMB0027: 内嵌服务器正在停止，ModelControllerClient 上的调用不可用。";
    }
    @Override
    protected String cannotStartEmbeddedServer$str() {
        return "WFLYEMB0021: 无法启动内嵌进程";
    }
    @Override
    protected String cannotLoadEmbeddedServerFactory$str() {
        return "WFLYEMB0017: 无法加载内嵌的服务器工厂：%1$s";
    }
    @Override
    protected String cannotSetupEmbeddedServer$str() {
        return "WFLYEMB0020: 无法设立内嵌进程";
    }
    @Override
    protected String invalidJBossHome$str() {
        return "WFLYEMB0011: 无效 JBoss 主目录：%1$s";
    }
    @Override
    protected String cannotCreateHostController$str() {
        return "WFLYEMB0026: 无法用工厂 %1$s 创建主机控制器";
    }
    @Override
    protected String processIsStopping$str() {
        return "WFLYEMB0023: 内嵌服务器正在停止，ModelControllerClient 上的调用不可用。";
    }
}
