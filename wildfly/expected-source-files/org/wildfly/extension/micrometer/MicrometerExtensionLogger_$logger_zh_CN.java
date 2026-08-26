package org.wildfly.extension.micrometer;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:10+0200")
public class MicrometerExtensionLogger_$logger_zh_CN extends MicrometerExtensionLogger_$logger_zh implements MicrometerExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicrometerExtensionLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMMTREXT0001: 激活 Micrometer 子系统";
    }
    @Override
    protected String processingDeployment$str() {
        return "WFLYMMTREXT0002: Micrometer 子系统在处理部署";
    }
    @Override
    protected String noCdiDeployment$str() {
        return "WFLYMMTREXT0003: 部署没有启用 Jakarta 上下文和依赖注入。跳过 Micrometer 集成。";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYMMTREXT0004: 部署 %1$s 需要使用 '%2$s' 功能，但它当前没有被注册";
    }
    @Override
    protected String unableToReadAttribute$str() {
        return "WFLYMMTREXT0005: 无法读 %2$s 上的属性 %1$s: %3$s。";
    }
    @Override
    protected String unableToConvertAttribute$str() {
        return "WFLYMMTREXT0006: 无法将 %2$s 上的属性 %1$s转换为 Double 值。";
    }
    @Override
    protected String malformedName$str() {
        return "WFLYMMTREXT0007: 格式错误的名称。";
    }
    @Override
    protected String failedInitializeJMXRegistrar$str() {
        return "WFLYMMTREXT0008: 从 JMX MBean 初始化指标数据失败";
    }
    @Override
    protected String unsupportedMetricType$str() {
        return "WFLYMMTREXT0009: 找到了一个不支持的指标类型：%1$s";
    }
    @Override
    protected String notActivatingSubsystem$str() {
        return "WFLYMMTREXT0010: 未激活 Micrometer 子系统";
    }
    @Override
    protected String noOpRegistryChosen$str() {
        return "WFLYMMTREXT0011: Micrometer 已启用，但没有配置端点。已配置了 No-op 指标注册中心。";
    }
    @Override
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYMMTREXT0012: 在配置 Micrometer 时发现的其他指标系统：%1$s。如需更多信息，请参阅管理指南。";
    }
}
