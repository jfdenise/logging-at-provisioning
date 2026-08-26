package org.jboss.as.jaxrs.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:48+0200")
public class JaxrsLogger_$logger_zh_CN extends JaxrsLogger_$logger_zh implements JaxrsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JaxrsLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String classAnnotationNotFound$str() {
        return "WFLYRS0001: %1$s 注释不在 Class 中：%2$s";
    }
    @Override
    protected String classOrMethodAnnotationNotFound$str() {
        return "WFLYRS0002: %1$s 注释不在 Class 或 Method 中：%2$s";
    }
    @Override
    protected String moreThanOneServletMapping$str() {
        return "WFLYRS0003: 为 Jakarta RESTful Web Services servlet 找到的多个映射： %1$s 第二个映射 %2$s 不能正常工作";
    }
    @Override
    protected String cannotLoadApplicationClass$str() {
        return "WFLYRS0006: 无法加载 Jakarta RESTful Web Services Application 类";
    }
    @Override
    protected String typeNameNotAnEjbView$str() {
        return "WFLYRS0010: Jakarta RESTful Web Services 资源 %1$s 不对应于 Jakarta Enterprise Beans %2$s 上的一个视图。@Path 注解只能放在代表 Jakarta Enterprise Beans Bean 的一个本地、远程或无接口视图的类或接口上。";
    }
    @Override
    protected String invalidParamValue$str() {
        return "WFLYRS0011: 参数 %1$s 的无效值: %2$s";
    }
    @Override
    protected String noSpringIntegrationJar$str() {
        return "WFLYRS0012: 未找到 Spring 集成 JAR";
    }
    @Override
    protected String disablePropertyDeprecated$str() {
        return "WFLYRS0013: 上下文参数 org.jboss.as.jaxrs.disableSpringIntegration 已弃用，并将在以后版本中被删除。请使用 org.jboss.as.jaxrs.enableSpringIntegration";
    }
    @Override
    protected String failedToRegisterManagementViewForRESTResources$str() {
        return "WFLYRS0014: 注册 REST 资源类 %1$s 的管理视图失败";
    }
    @Override
    protected String noServletDeclaration$str() {
        return "WFLYRS0015: 没有找到 Jakarta RESTful Web Services 应用的 Servlet 声明。在 %1$s 中提供了一个扩展 jakarta.ws.rs.core.Application 的类，或在 web.xml 中声明了一个 servlet 类。";
    }
    @Override
    protected String resteasyVersion$str() {
        return "WFLYRS0016: RESTEasy 版本 %1$s";
    }
    @Override
    protected String failedToReadAttribute$str() {
        return "WFLYRS0017: 从带有名称的 Jakarta RESTful Web Services 部署读取属性失败： %1$s %2$s";
    }
    @Override
    protected String jacksonAnnotationDetected$str() {
        return "WFLYRS0018: 在 Jakarta RESTful Web Services 部署中明确使用 Jackson 注解 ; 系统会为当前部署禁用 Jakarta JSON Binding 处理。考虑将 '%1$s' 属性设置为 'false' 来恢复 Jakarta JSON 绑定。";
    }
    @Override
    protected String paramConverterFailed$str() {
        return "WFLYRS0019: 使用参数转换程序 %4$s 为方法 %3$s 中的参数 %2$s 转换默认值 %1$s 时出错。异常：%5$s : %6$s";
    }
    @Override
    protected String baseTypeMethodFailed$str() {
        return "WFLYRS0020: \"使用方法 %4$s 为方法 %3$s 中的参数 %2$s 转换默认值 %1$s 错误。异常：%5$s : %6$s\"";
    }
    @Override
    protected String classIntrospectionFailure$str() {
        return "WFLYRS0021: %1$s %2$s";
    }
    @Override
    protected String tracingEnabled$str() {
        return "WFLYRS0029: 为部署 \"%1$s\" 启用 RESTEasy 追踪 API，不适用于生产环境。";
    }
    @Override
    protected String invalidConfigurationFactory$str() {
        return "WFLYRS0030: 找到无效的 ConfigurationFactory %1$s";
    }
    @Override
    protected String failedToLoadConfigurationFactory$str() {
        return "WFLYRS0031: 无法加载 RESTEasy MicroProfile 配置：%1$s";
    }
}
