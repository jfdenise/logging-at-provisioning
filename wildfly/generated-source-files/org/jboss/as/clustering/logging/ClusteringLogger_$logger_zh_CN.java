package org.jboss.as.clustering.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:04+0200")
public class ClusteringLogger_$logger_zh_CN extends ClusteringLogger_$logger_zh implements ClusteringLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ClusteringLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String parameterValueOutOfBounds$str() {
        return "WFLYCLCOM0001: %2$g 不是参数 %1$s 的有效值。这个值必须为 %3$s %4$g";
    }
    @Override
    protected String attributesDoNotSupportNegativeValues$str() {
        return "WFLYCLCOM0003: 下面的属性不支持负值：%1$s";
    }
    @Override
    protected String rejectedMultipleValues$str() {
        return "WFLYCLCOM0005: 旧主机不支持属性的多个值： %1$s";
    }
    @Override
    protected String operationNotSupportedInNormalServerMode$str() {
        return "WFLYCLCOM0008: %1$s:%2$s 操作只在 admin-only 模式中被支持。";
    }
}
