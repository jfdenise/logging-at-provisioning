package org.wildfly.extension.messaging.activemq.injection._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:29+0200")
public class MessagingLogger_$logger_zh_CN extends MessagingLogger_$logger_zh implements MessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MessagingLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String callNotPermittedOnInjectedJMSContext$str() {
        return "WFLYMSGAMQINJ0001: 在注入的 JMSContext 上不允许调用这个方法（请参考 Jakarta Messaging 2.0 spec, §12.4.5）。";
    }
}
