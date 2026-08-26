package org.wildfly.extension.picketlink.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:08+0200")
public class PicketLinkLogger_$logger_zh extends PicketLinkLogger_$logger implements PicketLinkLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PicketLinkLogger_$logger_zh(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
}
