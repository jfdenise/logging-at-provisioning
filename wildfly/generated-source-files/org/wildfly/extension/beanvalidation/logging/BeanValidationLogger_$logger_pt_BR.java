package org.wildfly.extension.beanvalidation.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:02+0200")
public class BeanValidationLogger_$logger_pt_BR extends BeanValidationLogger_$logger_pt implements BeanValidationLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BeanValidationLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
}
