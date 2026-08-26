package org.jboss.as.threads;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:25+0200")
public class ThreadsLogger_$logger_zh_CN extends ThreadsLogger_$logger_zh implements ThreadsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ThreadsLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String perCpuNotSupported$str() {
        return "WFLYTHR0001: 不再支持 '%1$s' 属性。'%3$s' 属性的 [%2$f] 值与 '%5$s' 属性的 [%4$f] 值合并，同时当前处理器计数 [%6$d] 为 '%8$s' 衍生出一个新的 [%7$d] 值。";
    }
    @Override
    protected String unsupportedBoundedQueueThreadPoolMetric$str() {
        return "WFLYTHR0002: 不支持的属性 '%1$s'";
    }
    @Override
    protected String unsupportedBoundedQueueThreadPoolAttribute$str() {
        return "WFLYTHR0003: 不支持的属性 '%1$s'";
    }
    @Override
    protected String unsupportedQueuelessThreadPoolMetric$str() {
        return "WFLYTHR0004: 不支持的属性 '%1$s'";
    }
    @Override
    protected String unsupportedQueuelessThreadPoolAttribute$str() {
        return "WFLYTHR0005: 不支持的属性 '%1$s'";
    }
    @Override
    protected String unsupportedScheduledThreadPoolMetric$str() {
        return "WFLYTHR0006: 不支持的属性 '%1$s'";
    }
    @Override
    protected String unsupportedScheduledThreadPoolAttribute$str() {
        return "WFLYTHR0007: 不支持的属性 '%1$s'";
    }
    @Override
    protected String unsupportedThreadFactoryAttribute$str() {
        return "WFLYTHR0008: 不支持的属性 '%1$s'";
    }
    @Override
    protected String unsupportedUnboundedQueueThreadPoolMetric$str() {
        return "WFLYTHR0009: 不支持的属性 '%1$s'";
    }
    @Override
    protected String unsupportedUnboundedQueueThreadPoolAttribute$str() {
        return "WFLYTHR0010: 不支持的属性 '%1$s'";
    }
    @Override
    protected String boundedQueueThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0011: 还没有初始化 executor 服务。";
    }
    @Override
    protected String queuelessThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0012: 还没有初始化 executor 服务。";
    }
    @Override
    protected String scheduledThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0013: 还没有初始化 executor 服务。";
    }
    @Override
    protected String threadFactoryUninitialized$str() {
        return "WFLYTHR0014: 还没有初始化线程库服务。";
    }
    @Override
    protected String unboundedQueueThreadPoolExecutorUninitialized$str() {
        return "WFLYTHR0015: 还没有初始化 executor 服务。";
    }
    @Override
    protected String boundedQueueThreadPoolServiceNotFound$str() {
        return "WFLYTHR0016: 没有找到服务 '%1$s'。";
    }
    @Override
    protected String queuelessThreadPoolServiceNotFound$str() {
        return "WFLYTHR0017: 没有找到服务 '%1$s'。";
    }
    @Override
    protected String scheduledThreadPoolServiceNotFound$str() {
        return "WFLYTHR0018: 没有找到服务 '%1$s'。";
    }
    @Override
    protected String threadFactoryServiceNotFound$str() {
        return "WFLYTHR0019: 没有找到服务 '%1$s'。";
    }
    @Override
    protected String unboundedQueueThreadPoolServiceNotFound$str() {
        return "WFLYTHR0020: 没有找到服务 '%1$s'。";
    }
    @Override
    protected String threadPoolServiceNotFoundForMetrics$str() {
        return "WFLYTHR0021: 定位 executor 服务 '%1$s' 失败";
    }
    @Override
    protected String missingKeepAliveTime$str() {
        return "WFLYTHR0024: 参数 '%2$s' 缺少 '%1$s'";
    }
    @Override
    protected String missingKeepAliveUnit$str() {
        return "WFLYTHR0025: 参数 '%2$s' 缺少 '%1$s'";
    }
    @Override
    protected String countMustBePositive$str() {
        return "WFLYTHR0027: %1$s 必须大于等于 0";
    }
    @Override
    protected String perCpuMustBePositive$str() {
        return "WFLYTHR0028: %1$s 必须大于等于 0";
    }
    @Override
    protected String missingTimeSpecTime$str() {
        return "WFLYTHR0029: 缺少 '%1$s' 的 '%2$s'";
    }
    @Override
    protected String failedToParseUnit$str() {
        return "WFLYTHR0030: 解析 '%1$s' 失败，允许的值为：%2$s";
    }
    @Override
    protected String unsupportedEnhancedQueueExecutorAttribute$str() {
        return "WFLYTHR0031: 不支持的属性 '%1$s'";
    }
    @Override
    protected String enhancedQueueExecutorServiceNotFound$str() {
        return "WFLYTHR0032: 没有找到服务 '%1$s'。";
    }
    @Override
    protected String enhancedQueueExecutorUninitialized$str() {
        return "WFLYTHR0033: 还没有初始化 executor 服务。";
    }
    @Override
    protected String unsupportedEnhancedQueueExecutorMetric$str() {
        return "WFLYTHR0034: 不支持的 metric '%1$s'";
    }
}
