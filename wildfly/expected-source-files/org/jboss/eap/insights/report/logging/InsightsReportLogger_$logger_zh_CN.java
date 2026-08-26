package org.jboss.eap.insights.report.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:59:22+0200")
public class InsightsReportLogger_$logger_zh_CN extends InsightsReportLogger_$logger_zh implements InsightsReportLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InsightsReportLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToReadRuntimeConfiguration1$str() {
        return "WFLYINSIGHTS0001: 读取运行时配置失败，并显示 %1$s";
    }
    @Override
    protected String failedToReadRuntimeConfiguration0$str() {
        return "WFLYINSIGHTS0002: 读取运行时配置失败";
    }
    @Override
    protected String failedToReadModules$str() {
        return "WFLYINSIGHTS0003: 分析模块路径失败";
    }
    @Override
    protected String failedToProcessDeployments$str() {
        return "WFLYINSIGHTS0004: 处理部署时出错";
    }
    @Override
    protected String missingAuthentication$str() {
        return "WFLYINSIGHTS0005: 请求中缺少身份验证：%1$s";
    }
    @Override
    protected String payloadTooLarge$str() {
        return "WFLYINSIGHTS0006: 有效负载过大：%1$s";
    }
    @Override
    protected String unsupportedContentType$str() {
        return "WFLYINSIGHTS0007: 不支持有效负载的内容类型：%1$s";
    }
    @Override
    protected String serversideError$str() {
        return "WFLYINSIGHTS0008: 使用代码：%1$s 在服务器上请求失败";
    }
    @Override
    protected String addingAnalyzedJar$str() {
        return "为 %1$s 添加信息";
    }
    @Override
    protected String addingOverriddenJar$str() {
        return "为 %1$s 添加覆盖信息";
    }
    @Override
    protected String errorAnalyzingJar$str() {
        return "分析 jar %1$s 失败";
    }
    @Override
    protected String endProcessingModules$str() {
        return "模块分析完成";
    }
    @Override
    protected String startProcessingModulePath$str() {
        return "正在处理模块路径 %1$s";
    }
    @Override
    protected String startProcessingDeployment$str() {
        return "处理部署 %1$s";
    }
    @Override
    protected String startProcessingDeploymentForUpdate$str() {
        return "处理部署 %1$s 以进行更新";
    }
    @Override
    protected String deploymentHashFound$str() {
        return "部署 %1$s 具有 sha1 哈希 %2$s";
    }
    @Override
    protected String endProcessingDeployments$str() {
        return "所有部署都已处理";
    }
    @Override
    protected String endProcessingDeploymentsForUpdate$str() {
        return "所有部署都已更新";
    }
    @Override
    protected String scheduledSendFailed$str() {
        return "调度的发送失败";
    }
    @Override
    protected String scheduledSendUnknownException$str() {
        return "非 Insights 失败";
    }
    @Override
    protected String endGettingConfiguration$str() {
        return "获取服务器运行时配置";
    }
    @Override
    protected String startGettingConfiguration$str() {
        return "获取服务器运行时配置";
    }
}
