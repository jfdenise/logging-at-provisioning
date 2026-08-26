package org.jboss.as.domain.http.server.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:20+0200")
public class HttpServerLogger_$logger_zh_CN extends HttpServerLogger_$logger_zh implements HttpServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public HttpServerLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String modelRequestError$str() {
        return "WFLYDMHTTP0001: 执行型号查询时意外出错";
    }
    @Override
    protected String uploadError$str() {
        return "WFLYDMHTTP0002: 执行部署上传请求时意外出错";
    }
    @Override
    protected String consoleModuleNotFound$str() {
        return "WFLYDMHTTP0003: 无法为插槽 %1$s 载入控制台模块，禁用控制台。";
    }
    @Override
    protected String errorContextModuleNotFound$str() {
        return "WFLYDMHTTP0004: 无法为插槽 %1$s 载入错误上下文，禁用错误上下文。";
    }
    @Override
    protected String invalidOperation$str() {
        return "WFLYDMHTTP0005: 无效操作 '%1$s'";
    }
    @Override
    protected String realmNotReadyMessage$str() {
        return "WFLYDMHTTP0006: 安全区还没准备好处理请求，参考 %1$s。";
    }
    @Override
    protected String consoleModuleNotFoundMsg$str() {
        return "WFLYDMHTTP0007: 没有可用的模块名为 %1$s 的控制台模块";
    }
    @Override
    protected String invalidCredentialType$str() {
        return "WFLYDMHTTP0010: 无效的凭证类型 '%1$s'";
    }
    @Override
    protected String httpsRedirectNotSupported$str() {
        return "WFLYDMHTTP0011: 管理接口为 HTTP（%1$s）和 HTTPS（%2$s）使用了不同的地址。从 HTTP 套接字到 HTTPS 套接字的 HTTPS 请求的重定向是不被支持的。";
    }
    @Override
    protected String sslRequestedNoSslContext$str() {
        return "WFLYDMHTTP0012: 已为 HTTP 接口定义安全套接字，然而引用的安全区没有提供 SSL 上下文。";
    }
    @Override
    protected String invalidUseStreamAsResponseIndex$str() {
        return "WFLYDMHTTP0013: 无效的 useStreamIndex 值 '%1$d'。操作响应附加了 %2$d 个流。";
    }
    @Override
    protected String managementHttpServerAlreadyBuild$str() {
        return "WFLYDMHTTP0014: ManagementHttpServer 已用这个构建器进行构建。";
    }
    @Override
    protected String noRealmOrSSLContext$str() {
        return "WFLYDMHTTP0015: 还没有提供 SecurityRealm 或 SSLContext";
    }
    @Override
    protected String realmNotReadyForSecuredManagementHandler$str() {
        return "WFLYDMHTTP0016: 您的应用服务器正在运行。但您尚未添加任何用户以便能够访问 HTTP 管理接口。要添加新用户，在 WildFly 安装的 bin 文件夹中执行 %1$s 脚本并输入请求的信息。默认情况下，WildFly 使用的域名称为 'ManagementRealm'，添加用户工具已默认选择此名称。";
    }
}
