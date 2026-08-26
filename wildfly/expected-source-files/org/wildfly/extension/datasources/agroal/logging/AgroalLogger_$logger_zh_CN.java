package org.wildfly.extension.datasources.agroal.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:23:39+0200")
public class AgroalLogger_$logger_zh_CN extends AgroalLogger_$logger_zh implements AgroalLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public AgroalLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String jndiNameInvalidFormat$str() {
        return "WFLYAG0303: JNDI 名称必须以 java:/ 或 java:jboss/ 开头";
    }
    @Override
    protected String jndiNameShouldValidate$str() {
        return "WFLYAG0304: JNDI 名称不应该包含 '//' 或以 '/' 结尾";
    }
}
