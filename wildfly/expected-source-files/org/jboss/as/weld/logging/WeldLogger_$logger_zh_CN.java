package org.jboss.as.weld.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:54:04+0200")
public class WeldLogger_$logger_zh_CN extends WeldLogger_$logger_zh implements WeldLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public WeldLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToSetupWeldContexts$str() {
        return "WFLYWELD0001: 设置 Weld 上下文失败";
    }
    @Override
    protected String failedToTearDownWeldContexts$str() {
        return "WFLYWELD0002: 拆除 Weld 上下文失败";
    }
    @Override
    protected String processingWeldDeployment$str() {
        return "WFLYWELD0003: 处理 Weld 部署 %1$s";
    }
    @Override
    protected String couldNotFindBeanManagerForDeployment$str() {
        return "WFLYWELD0005: 无法找到部署 %1$s 的 BeanManager";
    }
    @Override
    protected String startingServicesForCDIDeployment$str() {
        return "WFLYWELD0006: 为 Jakarta Contexts and Dependency Injection 部署启动服务： %1$s";
    }
    @Override
    protected String couldNotLoadPortableExceptionClass$str() {
        return "WFLYWELD0007: 无法加载可移植扩展类 %1$s";
    }
    @Override
    protected String injectionTypeNotValue$str() {
        return "WFLYWELD0008: 非 Jakarta Enterprise Beans 组件不支持类型 %1$s 的 @resource 注入。注入点：%2$s";
    }
    @Override
    protected String startingWeldService$str() {
        return "WFLYWELD0009: 为部署 %1$s 启动 Weld 服务";
    }
    @Override
    protected String stoppingWeldService$str() {
        return "WFLYWELD0010: 为部署 %1$s 停止 Weld 服务";
    }
    @Override
    protected String beansXmlValidationWarning$str() {
        return "WFLYWELD0011: 解析 %1$s 时出现警告: %2$s %3$s";
    }
    @Override
    protected String beansXmlValidationError$str() {
        return "WFLYWELD0012: 解析 %1$s 时出现警告: %2$s %3$s";
    }
    @Override
    protected String cdiAnnotationsButNotBeanArchive$str() {
        return "WFLYWELD0013: 部署 %1$s 包含 Jakarta Contexts and Dependency Injection 注解，但没有找到 bean 归档（没有 beans.xml 或带有 bean 定义注解的类）。";
    }
    @Override
    protected String exceptionClearingThreadState$str() {
        return "WFLYWELD0014: 解析线程状态抛出异常";
    }
    @Override
    protected String couldNotReadEntries$str() {
        return "WFLYWELD0016: 无法读取条目";
    }
    @Override
    protected String doNotUnderstandProtocol$str() {
        return "WFLYWELD0017: URL 扫描程序无法理解 URL 协议 %1$s，Jakarta Contexts and Dependency Injection beans 不会被扫描。";
    }
    @Override
    protected String duplicateBeansXml$str() {
        return "WFLYWELD0018: 找到了 WEB-INF/beans.xml 以及 WEB-INF/classes/META-INF/beans.xml。同时使用两个位置是不方便的。对这个部署 Weld 将使用前者。";
    }
    @Override
    protected String couldNotGetBeansXmlAsURL$str() {
        return "WFLYWELD0019: 处理文件 %1$s 时可以将 beans.xml 文件获取为 URL";
    }
    @Override
    protected String couldNotLoadInterceptorClass$str() {
        return "WFLYWELD0020: 无法加载拦截器类 %1$s";
    }
    @Override
    protected String extensionDoesNotImplementExtension$str() {
        return "WFLYWELD0021: 服务 %1$s 没有实现 jakarta.enterprise.inject.spi.Extension 接口";
    }
    @Override
    protected String viewNotFoundOnEJB$str() {
        return "WFLYWELD0022: 在 Jakarta Enterprise Beans 上未找到类型 %1$s %2$s";
    }
    @Override
    protected String unknownInterceptorClassForCDIInjection$str() {
        return "WFLYWELD0030: Jakarta Contexts and Dependency Injection 的未知拦截器类 %1$s";
    }
    @Override
    protected String parameterCannotBeNull$str() {
        return "WFLYWELD0031: %1$s 不能为 null";
    }
    @Override
    protected String injectionPointNotAJavabean$str() {
        return "WFLYWELD0032: 注入点代表了一个不遵循 JavaBean 约定（必须只有一个参数）的方法 %1$s";
    }
    @Override
    protected String annotationNotFound$str() {
        return "WFLYWELD0033: 未找到 %2$s 上的注解 %1$s";
    }
    @Override
    protected String ejbNotResolved$str() {
        return "WFLYWELD0034: 无法解析 %2$s 上的 %1$s 的 @EJB 注入";
    }
    @Override
    protected String moreThanOneEjbResolved$str() {
        return "WFLYWELD0035: 为 %2$s 上的 %1$s 的 @EJB 注入解决了多个 Jakarta Enterprise Beans。找到 %3$s";
    }
    @Override
    protected String couldNotDetermineUnderlyingType$str() {
        return "WFLYWELD0036: 无法从注入点类型 %1$s 决定 Bean 类";
    }
    @Override
    protected String couldNotFindPersistenceUnit$str() {
        return "WFLYWELD0037: 将持久性单元注入 Jakarta Contexts and Dependency Injection 管理的 bean 时出错。无法在注入点 %3$s 的部署 %2$s 中无法找到名为 \"%1$s\" 的持久性单元";
    }
    @Override
    protected String securityNotEnabled$str() {
        return "WFLYWELD0038: 无法注入 SecurityManager，没有启动安全性。";
    }
    @Override
    protected String singletonNotSet$str() {
        return "WFLYWELD0039: 没有为 %1$s 设置单点登录。这表示您试图用和这个部署不关联的线程上下文 ClassLoader 访问 Weld 部署。";
    }
    @Override
    protected String alreadyRunning$str() {
        return "WFLYWELD0040: %1$s 已在运行";
    }
    @Override
    protected String notStarted$str() {
        return "WFLYWELD0041: %1$s 没有启动";
    }
    @Override
    protected String beanDeploymentNotFound$str() {
        return "WFLYWELD0043: 在部署里无法找到 ID 为 %1$s 的 BeanDeploymentArchive";
    }
    @Override
    protected String couldNotFindResource1$str() {
        return "WFLYWELD0044: 将资源注入 Jakarta Contexts and Dependency Injection 管理的 bean 时出错。找不到名为 %1$s";
    }
    @Override
    protected String cannotDetermineResourceName$str() {
        return "WFLYWELD0045: 无法确定资源名称。jndiName 和 mappedName 都是空的。";
    }
    @Override
    protected String cannotInject$str() {
        return "WFLYWELD0046: 无法注入注入点 %1$s";
    }
    @Override
    protected String cannotUseAtRuntime$str() {
        return "WFLYWELD0047: %1$s 无法在运行时使用";
    }
    @Override
    protected String rejectAttributesMustBeTrue$str() {
        return "WFLYWELD0048: 与 CDI 1.0 '%1$s' 一起使用时这些属性必须设置为 'true'";
    }
    @Override
    protected String couldNotFindResource2$str() {
        return "WFLYWELD0049: 将资源注入 Jakarta Contexts and Dependency Injection 管理的 bean 时出错。无法找到在 %2$s 中定义的名为 %1$s 的资源。";
    }
    @Override
    protected String beanArchiveDiscovered$str() {
        return "发现 %1$s";
    }
    @Override
    protected String nameNotFoundInIndex$str() {
        return "WFLYWELD0050: 在复合索引里没找到 %1$s";
    }
    @Override
    protected String unableToLoadAnnotation$str() {
        return "无法加载注解 %1$s";
    }
    @Override
    protected String cannotLoadClass$str() {
        return "WFLYWELD0051: 无法加载 %1$s";
    }
    @Override
    protected String loadingProxiesUsingDeploymentClassLoader$str() {
        return "WFLYWELD0052: 使用部署类加载器为模块 %1$s 加载代理类。Package-private 访问无法进行。要修复这个问题，模块应该声明依赖关系 %2$s。";
    }
    @Override
    protected String componentInterceptorSupportNotAvailable$str() {
        return "WFLYWELD0053: %1$s 不支持组件拦截器";
    }
    @Override
    protected String cannotLoadAnnotationIndexOfExternalBeanArchive$str() {
        return "WFLYWELD0054: 无法读取外部 bean 存档的提供的索引：%1$s";
    }
    @Override
    protected String cannotIndexClassName$str() {
        return "WFLYWELD0055: 无法从外部 bean 存档对类 [%1$s] 进行索引：%2$s";
    }
    @Override
    protected String weldNotInitialized$str() {
        return "WFLYWELD0056: Weld 尚未初始化";
    }
    @Override
    protected String persistenceUnitFailed$str() {
        return "WFLYWELD0057: 持久性单元 '%1$s' 失败。";
    }
    @Override
    protected String persistenceUnitRemoved$str() {
        return "WFLYWELD0058: 持久性单元 '%1$s' 被删除。";
    }
    @Override
    protected String unknownDeploymentType$str() {
        return "WFLYWELD0059: 未知的部署类型 %1$s";
    }
    @Override
    protected String errorHandlingFile$str() {
        return "WFLYWELD0060: 错误处理文件 %1$s";
    }
    @Override
    protected String missingService$str() {
        return "WFLYWELD0061: %1$s 只需要一个服务提供商";
    }
    @Override
    protected String couldNotDeterminePackage$str() {
        return "WFLYWELD0062: 无法从损坏的类名称中确定软件包";
    }
    @Override
    protected String originalClassDoesNotHaveAModule$str() {
        return "WFLYWELD0063: 原始 %1$s 没有模块";
    }
    @Override
    protected String incorrectBceTranslatorSetup$str() {
        return "WFLYWELD0064: Weld 的 LiteExtensionTranslator 初始化的设置不正确；必须指定部署单元";
    }
}
