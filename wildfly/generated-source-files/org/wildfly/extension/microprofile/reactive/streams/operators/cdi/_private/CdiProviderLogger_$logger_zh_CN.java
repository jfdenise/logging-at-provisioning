package org.wildfly.extension.microprofile.reactive.streams.operators.cdi._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:39+0200")
public class CdiProviderLogger_$logger_zh_CN extends CdiProviderLogger_$logger_zh implements CdiProviderLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public CdiProviderLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String noImplementationFound$str() {
        return "WFLYRXSTOPSCDI0001: 在 classpath 里没有找到 %1$s 的实现";
    }
}
