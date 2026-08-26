package org.wildfly.core.elytron.tool.wrapper._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:19+0200")
public class ElytronToolWrapperMessages_$logger_zh_CN extends ElytronToolWrapperMessages_$logger_zh implements ElytronToolWrapperMessages, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ElytronToolWrapperMessages_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String redirectToScriptSimple$str() {
        return "要使用 WildFly Elytron 工具，应使用 elytron-tool 脚本，而不是 wildfly-elytron-tool.jar。";
    }
}
