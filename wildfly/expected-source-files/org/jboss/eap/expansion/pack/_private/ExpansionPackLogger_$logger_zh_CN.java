package org.jboss.eap.expansion.pack._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:09+0200")
public class ExpansionPackLogger_$logger_zh_CN extends ExpansionPackLogger_$logger_zh implements ExpansionPackLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ExpansionPackLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String expansionPackActive$str() {
        return "JBEAPXP0003: 启动安装了 %1$s 的服务器。";
    }
}
