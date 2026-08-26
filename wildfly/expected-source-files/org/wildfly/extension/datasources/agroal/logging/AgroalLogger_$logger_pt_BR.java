package org.wildfly.extension.datasources.agroal.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:23:39+0200")
public class AgroalLogger_$logger_pt_BR extends AgroalLogger_$logger_pt implements AgroalLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public AgroalLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String jndiNameInvalidFormat$str() {
        return "WFLYAG0303: O nome JNDI precisa começar com java:/ ou java:jboss/";
    }
    @Override
    protected String jndiNameShouldValidate$str() {
        return "WFLYAG0304: O nome JNDI não deve possuir “//” nem terminar com “/”";
    }
}
