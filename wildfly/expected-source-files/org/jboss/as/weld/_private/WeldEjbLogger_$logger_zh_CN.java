package org.jboss.as.weld._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:35+0200")
public class WeldEjbLogger_$logger_zh_CN extends WeldEjbLogger_$logger_zh implements WeldEjbLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public WeldEjbLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String ejbHashBeenRemoved$str() {
        return "WFLYWELDEJB0001: EJB 已经被删除：%1$s";
    }
}
