package org.wildfly.extension.microprofile.openapi.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:36+0200")
public class MicroProfileOpenAPILogger_$logger_zh_CN extends MicroProfileOpenAPILogger_$logger_zh implements MicroProfileOpenAPILogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileOpenAPILogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String requiredListenersNotFound$str() {
        return "WFLYMPOAI0006: MicroProfile OpenAPI 规格的 §5.1 要求通过 %2$s 访问端点，但服务器 '%1$s' 没有这样的监听程序。";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMPOAI0001: 激活 MicroProfile OpenAPI 子系统";
    }
    @Override
    protected String endpointRegistered$str() {
        return "WFLYMPOAI0004: 为主机 '%2$s' 注册 MicroProfile OpenAPI 端点 '%1$s'";
    }
    @Override
    protected String failedToLoadStaticFile$str() {
        return "WFLYMPOAI0002: 从部署 '%2$s' 加载 OpenAPI '%1$s' 失败";
    }
    @Override
    protected String disabled$str() {
        return "WFLYMPOAI0008: 为 '%1$s' 禁用了 MicroProfile OpenAPI 文档";
    }
    @Override
    protected String endpointAlreadyRegistered$str() {
        return "WFLYMPOAI0003: MicroProfile OpenAPI 端点已经为主机 '%1$s' 注册。跳过 '%2$s' 的 OpenAPI 文档。";
    }
    @Override
    protected String endpointUnregistered$str() {
        return "WFLYMPOAI0005: 为主机 '%2$s' 取消注册 MicroProfile OpenAPI 端点 '%1$s'";
    }
    @Override
    protected String nonStandardEndpoint$str() {
        return "WFLYMPOAI0007: MicroProfile OpenAPI 规格的 §5.1 要求文档在 '%3$s' 上提供，但 '%1$s' 被配置为使用 '%2$s'";
    }
}
