package org.wildfly.microprofile.reactive.messaging.common._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:37+0200")
public class MicroProfileReactiveMessagingCommonLogger_$logger_zh_CN extends MicroProfileReactiveMessagingCommonLogger_$logger_zh implements MicroProfileReactiveMessagingCommonLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveMessagingCommonLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String noElytronClientSSLContext$str() {
        return "WFLYRXMKAF0002: 无法找到名为 %1$s 的 Elytron client-ssl-context";
    }
    @Override
    protected String foundPropertyUsingElytronClientSSLContext$str() {
        return "WFLYRXMKAF0001: 找到的属性 %1$s，将使用 Elytron client-ssl-context: %2$s";
    }
}
