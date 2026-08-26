package org.jboss.as.remoting.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:48+0200")
public class RemotingLogger_$logger_zh_CN extends RemotingLogger_$logger_zh implements RemotingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public RemotingLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYRMT0029: 不支持在运行时使用安全域。";
    }
    @Override
    protected String endpointEmpty$str() {
        return "WFLYRMT0006: 端点为空";
    }
    @Override
    protected String invalidQOPV$str() {
        return "WFLYRMT0016: 无效的 QOP 值：%1$s";
    }
    @Override
    protected String addingIOSubsystem$str() {
        return "WFLYRMT0024: 出现 Remoting 子系统但未找到 IO 子系统。以前当远程模式 '%1$s' 出现时并不要求 IO 子系统，而现在要求，所以我们添加了默认的子系统。";
    }
    @Override
    protected String illegalStrength$str() {
        return "WFLYRMT0020: 给定的无效的 Strength '%1$s' 字符串";
    }
    @Override
    protected String failedToObtainSSLContext$str() {
        return "WFLYRMT0027: 无法获取 SSLContext";
    }
    @Override
    protected String couldNotStart$str() {
        return "WFLYRMT0005: 启动服务失败";
    }
    @Override
    protected String couldNotRemoveResource$str() {
        return "WFLYRMT0025: 无法删除 %1$s，因为 JMX 将其用作远程端点";
    }
    @Override
    protected String invalidOption$str() {
        return "WFLYRMT0028: 无效的选项 '%1$s'。";
    }
    @Override
    protected String couldNotCreateURI$str() {
        return "WFLYRMT0018: 无法从 %1$s -- %2$s 创建一个有效的 URI";
    }
    @Override
    protected String couldNotStartChanelListener$str() {
        return "WFLYRMT0002: 无法启动通道侦听程序";
    }
    @Override
    protected String couldNotBindToSocket$str() {
        return "WFLYRMT0004: %1$s";
    }
    @Override
    protected String warningOnWorkerChange$str() {
        return "WFLYRMT0026: 在远程端点中将 worker 更改为 '%1$s' 可能需要在链接的资源中有同样的更改，具体取决于远程端点和 http(s)监听程序的定义。";
    }
    @Override
    protected String listeningOnSocket$str() {
        return "WFLYRMT0001: 在 %1$s 侦听";
    }
    @Override
    protected String workerConfigurationIgnored$str() {
        return "WFLYRMT0022: 不再使用 worker 配置，请使用端点 worker 配置";
    }
    @Override
    protected String upgradeRequestMissingKey$str() {
        return "WFLYRMT0021: 缺少 Sec-JbossRemoting-Key 头部的 HTTP 升级请求";
    }
    @Override
    protected String workerThreadsEndpointConfigurationChoiceRequired$str() {
        return "WFLYRMT0023: 只允许 '%1$s' 配置或 '%2$s' 配置中的一个";
    }
    @Override
    protected String invalidStrength$str() {
        return "WFLYRMT0017: 无效的 Strength 值：%1$s";
    }
}
