package org.wildfly.extension.opentelemetry;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:44+0200")
public class OpenTelemetryExtensionLogger_$logger_zh_CN extends OpenTelemetryExtensionLogger_$logger_zh implements OpenTelemetryExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public OpenTelemetryExtensionLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String multipleMetricsSystemsEnabled$str() {
        return "WFLYOTELEXT0014: 配置 OpenTelemetry 时发现其他指标系统: %1$s。如需更多信息，请参阅管理指南。";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYOTELEXT0001: 激活 OpenTelemetry 子系统";
    }
    @Override
    protected String jaegerIsNoLongerSupported$str() {
        return "WFLYOTELEXT0013: 'jaeger' 导出器不再被支持。请更新系统以使用 otlp。";
    }
    @Override
    protected String unsupportedSampler$str() {
        return "WFLYOTELEXT0011: sampler 没有识别的值： '%1$s'。";
    }
    @Override
    protected String errorResolvingTelemetry$str() {
        return "WFLYOTELEXT0005: 解决 OpenTelemetry 实例时出错。";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYOTELEXT0004: 部署 %1$s 需要使用 '%2$s' 功能，但它当前没有被注册";
    }
    @Override
    protected String unsupportedExporter$str() {
        return "WFLYOTELEXT0008: 指定了不受支持的导出器：\"%1$s'。";
    }
    @Override
    protected String invalidRatio$str() {
        return "WFLYOTELEXT0012: 无效比率。必须介于 0.0 和 1.0 之间";
    }
    @Override
    protected String unsupportedSpanProcessor$str() {
        return "WFLYOTELEXT0010: 指定了不支持的 span 处理器：\"%1$s'。";
    }
    @Override
    protected String errorResolvingTracer$str() {
        return "WFLYOTELEXT0009: 解决追踪器时出错。";
    }
}
