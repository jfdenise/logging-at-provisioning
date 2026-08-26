package org.jboss.system.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:52+0200")
public class ServiceMBeanLogger_$logger_zh_CN extends ServiceMBeanLogger_$logger_zh implements ServiceMBeanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ServiceMBeanLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unknownLifecycleMethod$str() {
        return "WFLYSYSJMX0002: 未知的生命周期方法 %1$s";
    }
    @Override
    protected String nullMethodName$str() {
        return "WFLYSYSJMX0001: Null 方法名称";
    }
    @Override
    protected String startingFailed$str() {
        return "WFLYSYSJMX0006: 启动失败 %1$s";
    }
    @Override
    protected String errorInDestroy$str() {
        return "WFLYSYSJMX0003: 销毁出错  %1$s ";
    }
    @Override
    protected String stoppingFailed$str() {
        return "WFLYSYSJMX0007: 停止失败 %1$s";
    }
    @Override
    protected String destroyingFailed$str() {
        return "WFLYSYSJMX0008: 销毁失败 %1$s";
    }
    @Override
    protected String errorInStop$str() {
        return "WFLYSYSJMX0004: 停止出错 %1$s ";
    }
    @Override
    protected String initializationFailed$str() {
        return "WFLYSYSJMX0005: 初始化失败 %1$s";
    }
    @Override
    protected String postRegisterInitializationFailed$str() {
        return "WFLYSYSJMX0009: 在 postRegister 期间初始化失败";
    }
}
