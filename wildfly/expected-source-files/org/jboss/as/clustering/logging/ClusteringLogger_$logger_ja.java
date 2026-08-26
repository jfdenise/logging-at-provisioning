package org.jboss.as.clustering.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:12+0200")
public class ClusteringLogger_$logger_ja extends ClusteringLogger_$logger implements ClusteringLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ClusteringLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String parameterValueOutOfBounds$str() {
        return "WFLYCLCOM0001: %2$g はパラメーター %1$s の有効な値ではありません。値は %3$s %4$gである必要があります。";
    }
    @Override
    protected String failedToClose$str() {
        return "WFLYCLCOM0002: %1$s の終了に失敗しました";
    }
    @Override
    protected String attributesDoNotSupportNegativeValues$str() {
        return "WFLYCLCOM0003: 次の属性は負の値をサポートしません: %1$s";
    }
    @Override
    protected String attributesDoNotSupportZeroValues$str() {
        return "WFLYCLCOM0004: 次の属性はゼロの値をサポートしません: %1$s";
    }
    @Override
    protected String rejectedMultipleValues$str() {
        return "WFLYCLCOM0005: レガシーホストは、属性の複数の値をサポートしません。%1$s";
    }
    @Override
    protected String attributeIgnored$str() {
        return "WFLYCLCOM0006: '%2$s' 要素の '%1$s' 属性はサポート対象外になり、無視されます";
    }
    @Override
    protected String elementIgnored$str() {
        return "WFLYCLCOM0007: '%1$s' 要素はサポートされなくなり、無視されます";
    }
    @Override
    protected String operationNotSupportedInNormalServerMode$str() {
        return "WFLYCLCOM0008: %1$s:%2$s 操作は admin-only モードでのみサポートされます。";
    }
}
