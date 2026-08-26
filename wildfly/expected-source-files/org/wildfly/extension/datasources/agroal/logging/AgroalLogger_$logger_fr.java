package org.wildfly.extension.datasources.agroal.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:23:39+0200")
public class AgroalLogger_$logger_fr extends AgroalLogger_$logger implements AgroalLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public AgroalLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String jndiNameInvalidFormat$str() {
        return "WFLYAG0303: Le nom jndi doit commencer par java:/ ou java:jboss/";
    }
    @Override
    protected String jndiNameShouldValidate$str() {
        return "WFLYAG0304: Le nom Jndi ne doit pas comprendre de '//' ni se terminer par un '/'";
    }
}
