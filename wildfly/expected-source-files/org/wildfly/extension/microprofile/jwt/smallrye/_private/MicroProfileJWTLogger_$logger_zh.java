package org.wildfly.extension.microprofile.jwt.smallrye._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:11+0200")
public class MicroProfileJWTLogger_$logger_zh extends MicroProfileJWTLogger_$logger implements MicroProfileJWTLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileJWTLogger_$logger_zh(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
}
