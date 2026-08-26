package org.jboss.as.webservices.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:14+0200")
public class WSLogger_$logger_zh_CN extends WSLogger_$logger_zh implements WSLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public WSLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotLoadDeploymentAspectsDefinitionFile$str() {
        return "WFLYWS0001: 无法从 %1$s 加载 WS 部署方面";
    }
    @Override
    protected String activatingWebservicesExtension$str() {
        return "WFLYWS0002: 激活 WebServices 扩展";
    }
    @Override
    protected String starting$str() {
        return "WFLYWS0003: 启动 %1$s";
    }
    @Override
    protected String stopping$str() {
        return "WFLYWS0004: 停止 %1$s";
    }
    @Override
    protected String configServiceCreationFailed$str() {
        return "WFLYWS0005: 创建配置服务时出错";
    }
    @Override
    protected String configServiceDestroyFailed$str() {
        return "WFLYWS0006: 销毁配置服务时出错";
    }
    @Override
    protected String cannotReadWsdl$str() {
        return "WFLYWS0007: 无法从 %1$s 读取 WSDL";
    }
    @Override
    protected String mutuallyExclusiveAnnotations$str() {
        return "WFLYWS0008: [JAXWS 2.2 spec, section 7.7] @WebService 和 @WebServiceProvider 注解是互斥的 - 既然 %1$s 没有满足要求，它不会被当作 webservice 端点。";
    }
    @Override
    protected String finalEndpointClassDetected$str() {
        return "WFLYWS0009: WebService 端点类不能为 final - %1$s 不会被当作 webservice 端点。";
    }
    @Override
    protected String ignoringPortComponentRef$str() {
        return "WFLYWS0010: 忽略没有 <port-component-ref> 和 <service-endpoint-interface> 的 <port-qname>：%1$s";
    }
    @Override
    protected String cannotRegisterRecordProcessor$str() {
        return "WFLYWS0011: 无法在 JMX 服务器里注册记录处理器";
    }
    @Override
    protected String cannotUnregisterRecordProcessor$str() {
        return "WFLYWS0012: 无法从 JMX 服务器取消记录处理器的注册";
    }
    @Override
    protected String mBeanServerNotAvailable$str() {
        return "WFLYWS0013: MBeanServer 不可用，跳过 %1$s 的注册和取消注册。";
    }
    @Override
    protected String multipleEndpointsWithDifferentDeclaredSecurityRoles$str() {
        return "WFLYWS0014: 同一部署里的多个 Enterprise Beans 3 端点具有不同的声明的安全角色；请注意如果您没有在每个 WS 端点方法上控制所允许的角色（@RolesAllowe），这可能会是一个安全风险。";
    }
    @Override
    protected String cannotRegisterEndpoint$str() {
        return "WFLYWS0015: 无法在 JMX 服务器 %1$s 里注册端点";
    }
    @Override
    protected String cannotUnregisterEndpoint$str() {
        return "WFLYWS0016: 无法在 JMX 服务器 %1$s 里取消注册端点";
    }
    @Override
    protected String invalidHandlerChainFile$str() {
        return "WFLYWS0017: 无效的处理程序链文件: %1$s";
    }
    @Override
    protected String webMethodMustNotBeStaticOrFinal$str() {
        return "WFLYWS0018: Web service 方法 %1$s 不能是 static 或 final。请参考 Jakarta Enterprise Web Services 2.0\" 的 5.3.2.4.2 章节。";
    }
    @Override
    protected String webMethodMustBePublic$str() {
        return "WFLYWS0019: Web方法 %1$s 必须是公开的。请参阅 \"Jakarta Enterprise Web Services 2.0\" 章节 5.3.2.4.2。";
    }
    @Override
    protected String webServiceMethodNotFound$str() {
        return "WFLYWS0020: Web service 实现类 %1$s 没有包含方法 %2$s";
    }
    @Override
    protected String accessibleWebServiceMethodNotFound$str() {
        return "WFLYWS0021: Web service 实现类 %1$s 没有包含可访问的方法 %2$s";
    }
    @Override
    protected String finalizeMethodNotAllowed$str() {
        return "WFLYWS0022: Web service 实现类 %1$s 可能没有声明 finalize() 方法。请参考 \"Jakarta Enterprise Web Services 2.0\" 的 5.3.2.4.2 章节。";
    }
    @Override
    protected String nullEndpointName$str() {
        return "WFLYWS0023: 空的端点名称";
    }
    @Override
    protected String nullEndpointClass$str() {
        return "WFLYWS0024: 空的端点类";
    }
    @Override
    protected String classLoaderResolutionFailed$str() {
        return "WFLYWS0025: 无法解析部署 %1$s 的模块或类加载器";
    }
    @Override
    protected String missingHandlerChainConfigFile$str() {
        return "WFLYWS0026: 在 %2$s 中没有找到处理程序链配置文件 %1$s";
    }
    @Override
    protected String unexpectedElement$str() {
        return "WFLYWS0027: 意外的元素 %1$s";
    }
    @Override
    protected String unexpectedEndTag$str() {
        return "WFLYWS0028: 意外的结束标记: %1$s";
    }
    @Override
    protected String unexpectedEndOfDocument$str() {
        return "WFLYWS0029: 意外地到达了 XML 文档的底部";
    }
    @Override
    protected String missingDeploymentAspectClassAttribute$str() {
        return "WFLYWS0030: 无法找到用于部署方面的类属性";
    }
    @Override
    protected String cannotInstantiateDeploymentAspect$str() {
        return "WFLYWS0031: 无法创建类 %1$s 的部署方面";
    }
    @Override
    protected String missingPropertyNameAttribute$str() {
        return "WFLYWS0032: 无法找到用于部署方面 %1$s 的 property name 属性";
    }
    @Override
    protected String missingPropertyClassAttribute$str() {
        return "WFLYWS0033: 无法找到用于部署方面 %1$s 的 property class 属性";
    }
    @Override
    protected String unsupportedPropertyClass$str() {
        return "WFLYWS0034: 不被支持的属性类 %1$s";
    }
    @Override
    protected String cannotInstantiateList$str() {
        return "WFLYWS0035: 无法创建类型的列表：%1$s";
    }
    @Override
    protected String cannotInstantiateMap$str() {
        return "WFLYWS0036: 无法创建类型的映射 %1$s";
    }
    @Override
    protected String noMetricsAvailable$str() {
        return "WFLYWS0037: 没有可用的度量";
    }
    @Override
    protected String cannotFindComponentView$str() {
        return "WFLYWS0038: 无法找到组件视图 %1$s";
    }
    @Override
    protected String missingChild$str() {
        return "WFLYWS0039: 没有找到 VirtualFile: %2$s 的子 '%1$s'";
    }
    @Override
    protected String createContextPhaseFailed$str() {
        return "WFLYWS0040: 创建上下文失败";
    }
    @Override
    protected String startContextPhaseFailed$str() {
        return "WFLYWS0041: 启动上下文失败";
    }
    @Override
    protected String stopContextPhaseFailed$str() {
        return "WFLYWS0042: 停止上下文失败";
    }
    @Override
    protected String destroyContextPhaseFailed$str() {
        return "WFLYWS0043: 销毁上下文失败";
    }
    @Override
    protected String cannotInstantiateServletDelegate$str() {
        return "WFLYWS0044: 无法创建 servlet 委托 %1$s";
    }
    @Override
    protected String missingDeploymentProperty$str() {
        return "WFLYWS0045: 无法获取部署属性 %1$s";
    }
    @Override
    protected String multipleSecurityDomainsDetected$str() {
        return "WFLYWS0046: 不支持多重安全域。第一个域 '%1$s'，第二个域 '%2$s'";
    }
    @Override
    protected String sameUrlPatternRequested$str() {
        return "WFLYWS0047: 带有 URL 模式 %2$s 的 Web 服务端点 %1$s 已经注册了。Web 服务端点 %3$s 请求相同的 URL 模式。";
    }
    @Override
    protected String invalidServiceRefSetterMethodName$str() {
        return "WFLYWS0048: @WebServiceRef 注入目标是无效的。只允许 setter 方法 %1$s";
    }
    @Override
    protected String requiredServiceRefName$str() {
        return "WFLYWS0049: 类级别注解要求的 @WebServiceRef 属性 'name'。";
    }
    @Override
    protected String requiredServiceRefType$str() {
        return "WFLYWS0050: 类级别注解要求的 @WebServiceRef 属性 'type'。";
    }
    @Override
    protected String missingConfig$str() {
        return "WFLYWS0051: 配置 %1$s 不存在";
    }
    @Override
    protected String wrongHandlerChainType$str() {
        return "WFLYWS0052: 不支持的处理程序链类型：%1$s。所支持的类型是 %2$s 或 %3$s";
    }
    @Override
    protected String missingHandlerChain$str() {
        return "WFLYWS0054: 配置 %1$s：ID 为 %3$s 的 %2$s 处理程序链不存在。";
    }
    @Override
    protected String cannotGetURLForDescriptor$str() {
        return "WFLYWS0057: 无法获取 %1$s 的 URL";
    }
    @Override
    protected String jaxRpcNotSupported$str() {
        return "WFLYWS0058: 不支持 Jakarta XML RPC";
    }
    @Override
    protected String invalidLibraryInDeployment$str() {
        return "WFLYWS0059: 在 ws 端点部署检测到的 %1$s 库 (%2$s) 提供用容器模块依赖关系替换内嵌库的正确部署，或对当前部署添加 jboss-deployment-structure.xml 描述符来禁用 Webservice 子系统。我们推荐前者，因为后者导致多数 Webservice Java EE 和任何 JBossWS 专有的功能被禁用。";
    }
    @Override
    protected String endpointClassNotFound$str() {
        return "WFLYWS0060: 未找到 Web service 的端点类 %1$s";
    }
    @Override
    protected String declaredEndpointInterfaceClassNotFound$str() {
        return "WFLYWS0061: 未找到 Web Service 实现 bean %2$s 上 @WebService 注解里声明的端点接口 %1$s。";
    }
    @Override
    protected String jwsWebServiceClassVerificationFailed$str() {
        return "WFLYWS0062: Java Web Service 实现类 %1$s 的类检验失败。";
    }
    @Override
    protected String couldNotUpdateServerConfigBecauseOfReloadRequired$str() {
        return "WFLYWS0063: 由于待定的模块更新需要重载，无法更新 WS 服务器配置。";
    }
    @Override
    protected String couldNotUpdateServerConfigBecauseOfExistingWSDeployment$str() {
        return "WFLYWS0064: 由于服务器上现有的 WS 部署，无法更新 WS 服务器配置。";
    }
    @Override
    protected String invalidWSServlet$str() {
        return "WFLYWS0066: 在 web.xml 里检测到的 Servlet 类 %1$s 提供依赖于 JBossWS 的正确的部署，或对当前部署添加 jboss-deployment-structure.xml 描述符来禁用 Webservice 子系统。我们推荐前者，因为后者导致多数 Webservice Java EE 和任何 JBossWS 专有的功能被禁用。";
    }
    @Override
    protected String couldNotActivateSubsystem$str() {
        return "WFLYWS0067: 无法激活 webservices 子系统。";
    }
    @Override
    protected String failedAuthorization$str() {
        return "WFLYWS0070: 用户 %1$s 授权失败";
    }
    @Override
    protected String failedAuthentication$str() {
        return "WFLYWS0071: 验证用户名 %1$s 失败：用户名/密码错误";
    }
    @Override
    protected String failedAuthenticationWithException$str() {
        return "WFLYWS0072: 验证用户名 %1$s 时出错。异常消息：%2$s";
    }
    @Override
    protected String endpointAlreadyStopped$str() {
        return "WFLYWS0073: 正在取消部署或停止目标端点 %1$s";
    }
    @Override
    protected String warningLibraryInDeployment$str() {
        return "WFLYWS0068: 在 ws 端点部署中检测到一个潜在的有问题的 %1$s 库（%2$s）； 检查此库是否可以替换为容器模块";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYWS0074: 部署被配置为使用传统的安全，其不再被支持。";
    }
    @Override
    protected String onlyStringPasswordAccepted$str() {
        return "WFLYWS0075: 仅接受字符串密码";
    }
    @Override
    protected String checkModuleDependency$str() {
        return "WFLYWS0076: 在类 '%2$s' 上找到注解 '@%1$s' 。请确保 '%3$s' 模块依赖项已添加到您的部署中。";
    }
}
