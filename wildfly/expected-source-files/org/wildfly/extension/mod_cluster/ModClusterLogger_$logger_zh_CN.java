package org.wildfly.extension.mod_cluster;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:00+0200")
public class ModClusterLogger_$logger_zh_CN extends ModClusterLogger_$logger_zh implements ModClusterLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ModClusterLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String errorAddingMetrics$str() {
        return "WFLYMODCLS0001: 添加规格出错。";
    }
    @Override
    protected String multicastInterfaceNotAvailable$str() {
        return "WFLYMODCLS0004: mod_cluster 需要 Advertise，但多播接口不可用。";
    }
    @Override
    protected String usingSimpleLoadProvider$str() {
        return "WFLYMODCLS0005: 没有为代理 '%1$s' 指定 mod_cluster 负载平衡因子提供者！使用常数因子为 '1' 的负载平衡因子提供者。";
    }
    @Override
    protected String errorApplyingMetricProperties$str() {
        return "WFLYMODCLS0006: 应用属性来加载度量类 '%1$s' 出错。度量不会被加载。";
    }
    @Override
    protected String contextOrHostNotFound$str() {
        return "WFLYMODCLS0011: 未找到虚拟主机 '%1$s' 或上下文 '%2$s'。";
    }
    @Override
    protected String excludedContextsWrongFormat$str() {
        return "WFLYMODCLS0019: '%1$s' 不是 excluded-contexts 的有效值。";
    }
    @Override
    protected String excludedContextsUseSlashInsteadROOT$str() {
        return "WFLYMODCLS0021: 已弃用 excluded-contexts 的值 'ROOT'，要排除根上下文，请使用 '/' 代替。";
    }
    @Override
    protected String errorLoadingModuleForCustomMetric$str() {
        return "WFLYMODCLS0023: 加载从其加载自定义度量的模块 '%1$s' 出错。";
    }
    @Override
    protected String ignoredElement$str() {
        return "WFLYMODCLS0025: '%1$s' 元素不再被支持，并将被忽略。";
    }
    @Override
    protected String ignoredAttribute$str() {
        return "WFLYMODCLS0026: 元素 '%2$s' 的属性 '%1$s' 不再被支持 ，并将被忽略。";
    }
}
