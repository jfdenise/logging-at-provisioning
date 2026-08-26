package org.jboss.as.jsf.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:26+0200")
public class JSFLogger_$logger_pt extends JSFLogger_$logger implements JSFLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JSFLogger_$logger_pt(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
}
