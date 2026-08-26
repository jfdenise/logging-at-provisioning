package org.wildfly.core.jar.runtime._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:03+0200")
public class BootableJarLogger_$logger_zh_CN extends BootableJarLogger_$logger_zh implements BootableJarLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BootableJarLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String argHelp$str() {
        return "显示这条消息并退出";
    }
    @Override
    protected String argCliScript$str() {
        return "启动可引导 JAR 时执行的 CLI 脚本的路径";
    }
    @Override
    protected String shuttingDown$str() {
        return "WFLYJAR0001: 关闭";
    }
    @Override
    protected String deploymentAlreadyExist$str() {
        return "WFLYJAR0010: 不是空 jar，部署已存在";
    }
    @Override
    protected String argDefaultMulticastAddress$str() {
        return "设置系统属性 jboss.default.multicast.address 为给定的值";
    }
    @Override
    protected String argInstallation$str() {
        return "服务器被安装到的目录的路径。默认情况下，服务器被安装在 TEMP 目录下。";
    }
    @Override
    protected String argPublicBindAddress$str() {
        return "设置系统属性 jboss.bind.address 为给定的值";
    }
    @Override
    protected String deletingHome$str() {
        return "WFLYJAR0009: 删除%1$sdir";
    }
    @Override
    protected String cleanupTimeout$str() {
        return "WFLYJAR0024: 容器在 %1$d 中还没有正确关闭。这可能导致安装目录 \"%2$s\" 无法正确删除。";
    }
    @Override
    protected String processIsStopped$str() {
        return "WFLYJAR0016: 服务器已停止，ModelControllerClient 上的调用不可用";
    }
    @Override
    protected String cantDelete$str() {
        return "WFLYJAR0020: 不能删除 %1$s。异常 %2$s";
    }
    @Override
    protected String pidFileAlreadyExists$str() {
        return "WFLYJAR0022: PID 文件 %1$s 已存在。这可能导致安装目录 \"%2$s\" 无法正确删除。";
    }
    @Override
    protected String serverStopped$str() {
        return "WFLYJAR0002: 服务器停止，退出";
    }
    @Override
    protected String serverNotStopped$str() {
        return "WFLYJAR0003: 服务器尚未停止，等待";
    }
    @Override
    protected String argDisplayGalleonConfig$str() {
        return "显示用于构建这个可引导 JAR 的 Galleon 配置的内容";
    }
    @Override
    protected String moduleLoaderError$str() {
        return "WFLYJAR0018: 无法从 %1$s 加载模块 %2$s";
    }
    @Override
    protected String notExistingFile$str() {
        return "WFLYJAR0012: 文件%1$s不存在";
    }
    @Override
    protected String cannotStartServer$str() {
        return "WFLYJAR0017: 无法启动服务器";
    }
    @Override
    protected String argSecurityManager$str() {
        return "激活 SecurityManager";
    }
    @Override
    protected String unknownArgument$str() {
        return "WFLYJAR0011: 未知参数 %1$s";
    }
    @Override
    protected String argStability$str() {
        return "使用特定的稳定性级别运行服务器。可能的值：%1$s, Default = %2$s";
    }
    @Override
    protected String cantRestartServer$str() {
        return "WFLYJAR0019: 无法重启服务器，退出";
    }
    @Override
    protected String failedToStartCleanupProcess$str() {
        return "WFLYJAR0023: 无法启动清理处理器。这可能导致安装目录 \"%1$s\" 无法正确删除。";
    }
    @Override
    protected String argProperties$str() {
        return "从给定的 URL 里加载系统属性";
    }
    @Override
    protected String invalidArgument$str() {
        return "WFLYJAR0013: 无效参数%1$s，没有提供值";
    }
    @Override
    protected String argInterfaceBindAddress$str() {
        return "把系统属性 jboss.bind.address.<interface> 设置为给定的值";
    }
    @Override
    protected String argSystem$str() {
        return "设置系统属性";
    }
    @Override
    protected String processIsReloading$str() {
        return "WFLYJAR0015: 服务器正在重载，ModelControllerClient 上的调用还不可用";
    }
    @Override
    protected String cantRegisterModuleMBeans$str() {
        return "WFLYJAR0021: 不能注册 JBoss 模块 MBeans，%1$s";
    }
    @Override
    protected String argVersion$str() {
        return "打印版本并退出";
    }
    @Override
    protected String nullController$str() {
        return "WFLYJAR0004: 空控制器客户端，退出";
    }
    @Override
    protected String advertiseInstall$str() {
        return "WFLYJAR0007: 在 %1$s 上安装服务器和应用程序，耗时%2$sms";
    }
    @Override
    protected String securityProviderFailed$str() {
        return "WFLYJAR0025: 初始化安全供应商失败。原因：%1$s";
    }
    @Override
    protected String argDeployment$str() {
        return "用于在空 jar 中部署工件（war、jar、ear 或 exploded deployment dir）的路径";
    }
    @Override
    protected String advertiseOptions$str() {
        return "WFLYJAR0008: 服务器选项： %1$s";
    }
    @Override
    protected String installDeployment$str() {
        return "WFLYJAR0006: 部署%1$s在服务器上";
    }
    @Override
    protected String argSecurityProperty$str() {
        return "设置安全属性";
    }
    @Override
    protected String unexpectedExceptionWhileShuttingDown$str() {
        return "WFLYJAR0005: 关闭服务器时出现意外异常";
    }
    @Override
    protected String processIsStopping$str() {
        return "WFLYJAR0014: 服务器正在停止，ModelControllerClient 上的调用不可用";
    }
}
