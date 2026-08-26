package org.wildfly.extension.microprofile.health._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:11+0200")
public class MicroProfileHealthLogger_$logger_zh_CN extends MicroProfileHealthLogger_$logger_zh implements MicroProfileHealthLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileHealthLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMPHEALTH0001: 激活 MicroProfile Health 子系统";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYMPHEALTH0002: 部署 %1$s 需要使用 '%2$s' 功能，但它当前没有被注册";
    }
    @Override
    protected String healthDownStatus$str() {
        return "WFLYMPHEALTH0003: 报告健康下降状态：%1$s";
    }
    @Override
    protected String defaultProceduresDisabledByDeployment$str() {
        return "WFLYMPHEALTH0007: 部署 %1$s 配置已指定应禁用默认 MicroProfile Health 流程；服务器端流程将被禁用。";
    }
}
