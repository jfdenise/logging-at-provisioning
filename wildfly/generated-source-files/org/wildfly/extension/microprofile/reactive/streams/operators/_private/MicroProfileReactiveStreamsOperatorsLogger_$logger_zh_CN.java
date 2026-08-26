package org.wildfly.extension.microprofile.reactive.streams.operators._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:40+0200")
public class MicroProfileReactiveStreamsOperatorsLogger_$logger_zh_CN extends MicroProfileReactiveStreamsOperatorsLogger_$logger_zh implements MicroProfileReactiveStreamsOperatorsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveStreamsOperatorsLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYRXSTOPS0001: 激活 MicroProfile Reactive Streams Operators 子系统";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYRXSTOPS0002: 部署 %1$s 需要使用 '%2$s' 功能，但它当前没有被注册";
    }
}
