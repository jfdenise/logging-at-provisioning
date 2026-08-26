package org.jboss.as.appclient.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:54:03+0200")
public class AppClientLogger_$logger_zh_CN extends AppClientLogger_$logger_zh implements AppClientLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public AppClientLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String exceptionRunningAppClient$str() {
        return "WFLYAC0002: %1$s running app client main";
    }
    @Override
    protected String argAppClientConfig$str() {
        return "要使用的客户端配置文件的名称（缺省为 \"appclient.xml\"）";
    }
    @Override
    protected String argHelp$str() {
        return "显示这条消息并退出";
    }
    @Override
    protected String argHost$str() {
        return "设置要连接的应用服务器实例的 URL";
    }
    @Override
    protected String argConnectionProperties$str() {
        return "从给定的 URL 加载 ejb-client.properties 文件";
    }
    @Override
    protected String argProperties$str() {
        return "从给定的 URL 里加载系统属性";
    }
    @Override
    protected String argSystemProperty$str() {
        return "设置系统属性";
    }
    @Override
    protected String argVersion$str() {
        return "打印版本并退出";
    }
    @Override
    protected String argSecMgr$str() {
        return "使用已启用的安全管理者运行容器。";
    }
    @Override
    protected String usageDescription$str() {
        return "appclient 脚本启动一个应用程序客户端，用于测试和访问部署的 Jakarta Enterprise Beans。";
    }
    @Override
    protected String appClientNotSpecified$str() {
        return "WFLYAC0004: 您必须指定要执行的应用程序客户程序";
    }
    @Override
    protected String argumentExpected$str() {
        return "WFLYAC0005: 选项 %1$s 需要参数";
    }
    @Override
    protected String cannotFindAppClient0$str() {
        return "WFLYAC0006: 在部署里没有找到应用程序客户端 JAR 文件";
    }
    @Override
    protected String cannotFindAppClient1$str() {
        return "WFLYAC0007: 无法找到应用程序客户 %1$s";
    }
    @Override
    protected String cannotLoadAppClientMainClass$str() {
        return "WFLYAC0008: 无法加载应用程序客户主类";
    }
    @Override
    protected String cannotLoadProperties$str() {
        return "WFLYAC0010: 无法从 URL %1$s 加载属性";
    }
    @Override
    protected String cannotStartAppClient1$str() {
        return "WFLYAC0011: 无法启动应用程序客户 %1$s，因为未找到主类。";
    }
    @Override
    protected String cannotStartAppClient2$str() {
        return "WFLYAC0012: 无法启动应用程序客户 %1$s，因为在主类 %2$s 里没有找到 main 方法。";
    }
    @Override
    protected String duplicateSubsystemDeclaration$str() {
        return "WFLYAC0013: 重复的子系统声明";
    }
    @Override
    protected String failedToParseXml1$str() {
        return "WFLYAC0015: 解析 %1$s 失败";
    }
    @Override
    protected String failedToParseXml3$str() {
        return "WFLYAC0016: 在 [%2$d,%3$d] 解析 %1$s 失败";
    }
    @Override
    protected String malformedUrl$str() {
        return "WFLYAC0017: 为选项 %1$s 提供的 URL 格式不正确";
    }
    @Override
    protected String multipleAppClientsFound$str() {
        return "WFLYAC0018: 找到多个应用程序客户，且没有指定应用程序客户名称。";
    }
    @Override
    protected String unknownOption$str() {
        return "WFLYAC0020: 未知选项 %1$s";
    }
    @Override
    protected String couldNotLoadCallbackClass$str() {
        return "WFLYAC0021: 无法加载回调处理程序类 %1$s";
    }
    @Override
    protected String couldNotCreateCallbackHandler$str() {
        return "WFLYAC0022: 无法创建回调处理程序类 %1$s 的实例";
    }
    @Override
    protected String cannotFindAppClientFile$str() {
        return "WFLYAC0023: 无法找到应用程序客户 %1$s";
    }
    @Override
    protected String cannotSpecifyBothHostAndPropertiesFile$str() {
        return "WFLYAC0024: 无法指定要连接的主机以及 ejb-client.properties 文件。";
    }
}
