package org.wildfly.extension.clustering.singleton;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:53+0200")
public class SingletonLogger_$logger_zh_CN extends SingletonLogger_$logger_zh implements SingletonLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SingletonLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String singletonDeploymentDetected$str() {
        return "WFLYCLSNG0001: 检测到单例部署。将使用 %1$s 策略重置部署。";
    }
}
