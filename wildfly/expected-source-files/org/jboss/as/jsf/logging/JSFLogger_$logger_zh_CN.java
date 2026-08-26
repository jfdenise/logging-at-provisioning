package org.jboss.as.jsf.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:57+0200")
public class JSFLogger_$logger_zh_CN extends JSFLogger_$logger_zh implements JSFLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JSFLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String managedBeansConfigParseFailed$str() {
        return "WFLYJSF0004: 无法解析 %1$s，此文件中定义的 Jakarta Server Faces 工件不可用";
    }
    @Override
    protected String unknownJSFVersion$str() {
        return "WFLYJSF0005: 未知的 Jakarta Server Faces 版本 '%1$s'。将使用默认版本 '%2$s'。";
    }
    @Override
    protected String missingJSFModule$str() {
        return "WFLYJSF0006: 模块中缺少 Jakarta Server Faces 版本插槽 '%1$s' %2$s";
    }
    @Override
    protected String activatedJSFImplementations$str() {
        return "WFLYJSF0007: 激活了以下 Jakarta Server Faces 实现： %1$s";
    }
    @Override
    protected String classLoadingFailed$str() {
        return "WFLYJSF0008: 加载已注解的类 %1$s 失败";
    }
    @Override
    protected String invalidAnnotationLocation$str() {
        return "WFLYJSF0009: 类 %2$s 里的注解 %1$s 只允许在类上使用";
    }
    @Override
    protected String invalidDefaultJSFImpl$str() {
        return "WFLYJSF0014: 默认 Jakarta Server Faces 实现插槽 '%1$s' 无效";
    }
    @Override
    protected String jsfInjectionFailed$str() {
        return "WFLYJSF0016: 从插槽 %1$s 注入 Jakarta Server Faces 失败";
    }
    @Override
    protected String loadingJsf12$str() {
        return "WFLYJSF0017: 发现 Faces 1.2 类。使用 org.jboss.as.jsf.injection.weld.legacy.WeldApplicationFactoryLegacy。";
    }
    @Override
    protected String loadingJsf2x$str() {
        return "WFLYJSF0018: 未检测到 Faces 1.2 类。使用 org.jboss.as.jsf.injection.weld.WeldApplicationFactory。";
    }
    @Override
    protected String jsfArtifactNoDefaultConstructor$str() {
        return "WFLYJSF0019: 带有类 %2$s 的 Jakarta Server Faces 工件 %1$s 没有默认的构造函数，所以它不会被考虑注入";
    }
    @Override
    protected String lazyBeanValidationEnabled$str() {
        return "WFLYJSF0020: 启用了 lazy bean 验证。这可能会导致分布式 web 会话过期时缺少 @PreDestroy 事件。";
    }
}
