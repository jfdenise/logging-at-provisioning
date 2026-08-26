package org.wildfly.extension.microprofile.reactive.messaging._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:21+0200")
public class MicroProfileReactiveMessagingLogger_$logger_zh_CN extends MicroProfileReactiveMessagingLogger_$logger_zh implements MicroProfileReactiveMessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveMessagingLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYRXMESS0001: 激活 MicroProfile Reactive Messaging 子系统";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYRXMESS0002: 部署 %1$s 需要使用 '%2$s' 功能，但它当前没有被注册";
    }
    @Override
    protected String intermediateModuleNotPresent$str() {
        return "WFLYRXMESS0003: 中间模块 %1$s 不存在。跳过从其以递归方式添加模块";
    }
    @Override
    protected String experimentalPropertyNotAllowed$str() {
        return "WFLYRXMESS0004: 此设置中不允许使用 -D%1$s=true";
    }
    @Override
    protected String experimentalAnnotationNotAllowed$str() {
        return "WFLYRXMESS0005: 此设置中不允许使用 @%1$s";
    }
}
