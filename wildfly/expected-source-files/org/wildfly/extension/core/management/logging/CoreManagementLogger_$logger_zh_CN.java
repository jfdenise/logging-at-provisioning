package org.wildfly.extension.core.management.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:17+0200")
public class CoreManagementLogger_$logger_zh_CN extends CoreManagementLogger_$logger_zh implements CoreManagementLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public CoreManagementLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String processStateInitError$str() {
        return "WFLYCM0002: 初始化进程状态监听程序 %1$s 出错";
    }
    @Override
    protected String processStateInvokationError$str() {
        return "WFLYCM0003: 调用进程状态监听程序 %1$s 出错";
    }
    @Override
    protected String processStateTimeoutError$str() {
        return "WFLYCM0004: 进程状态监听程序 %1$s 消耗过多时间来完成。";
    }
    @Override
    protected String processStateCleanupError$str() {
        return "WFLYCM0005: 清理进程状态监听程序 %1$s 出错";
    }
    @Override
    protected String errorToLoadModule$str() {
        return "WFLYCM0006: 加载模块 %1$s 出错";
    }
    @Override
    protected String errorToLoadModuleClass$str() {
        return "WFLYCM0007: 从模块 %2$s 加载类 %1$s 出错";
    }
    @Override
    protected String errorToInstantiateClassInstanceFromModule$str() {
        return "WFLYCM0008: 从模块 %2$s 实例化类 %1$s 实例出错";
    }
    @Override
    protected String deploymentContainsUnstableApiAnnotations$str() {
        return "WFLYCM0009: %1$s 包含指示不稳定 API 的注解的用法。";
    }
    @Override
    protected String classExtendsClassWithUnstableApiAnnotations$str() {
        return "WFLYCM0010: %1$s 扩展已使用 %3$s 注解的 %2$s";
    }
    @Override
    protected String classImplementsInterfaceWithUnstableApiAnnotations$str() {
        return "WFLYCM0011: %1$s 实现已使用 %3$s 注解的 %2$s";
    }
    @Override
    protected String classReferencesFieldWithUnstableApiAnnotations$str() {
        return "WFLYCM0012: %1$s 引用已使用 %4$s 注解的字段 %2$s.%3$s";
    }
    @Override
    protected String classReferencesMethodWithUnstableApiAnnotations$str() {
        return "WFLYCM0013: %1$s 引用已使用 %5$s 注解的方法 %2$s.%3$s%4$s";
    }
    @Override
    protected String classReferencesClassWithUnstableApiAnnotations$str() {
        return "WFLYCM0014: %1$s 引用已使用 %3$s 注解的类 %2$s";
    }
    @Override
    protected String classUsesAnnotatedAnnotations$str() {
        return "WFLYCM0015: 类 %1$s 使用一个或多个注解进行了注解，这些注解依次又使用指示不稳定 api 的注解进行了注解：%2$s";
    }
    @Override
    protected String testOutputNumberOfClassesScanned$str() {
        return "WFLYCM0016: %1$d";
    }
}
