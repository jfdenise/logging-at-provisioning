package org.wildfly.extension.metrics._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:00+0200")
public class MetricsLogger_$logger_zh_CN extends MetricsLogger_$logger_zh implements MetricsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MetricsLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMETRICS0001: 激活 Base Metrics 子系统";
    }
    @Override
    protected String failedInitializeJMXRegistrar$str() {
        return "WFLYMETRICS0002: 从 JMX MBean 初始化指标数据失败";
    }
    @Override
    protected String unableToReadAttribute$str() {
        return "WFLYMETRICS0003: 无法读 %2$s 上的属性 %1$s: %3$s。";
    }
    @Override
    protected String unableToConvertAttribute$str() {
        return "WFLYMETRICS0004: 无法将 %2$s 上的属性 %1$s转换为 Double 值。";
    }
    @Override
    protected String malformedName$str() {
        return "WFLYMETRICS0005: 格式错误的名称。";
    }
    @Override
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYMETRICS0006: 在配置 WildFly 指标时发现的其他指标系统：%1$s。如需更多信息，请参阅管理指南。";
    }
}
