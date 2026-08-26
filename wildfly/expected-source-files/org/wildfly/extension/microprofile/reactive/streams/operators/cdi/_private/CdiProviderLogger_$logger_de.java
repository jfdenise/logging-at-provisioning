package org.wildfly.extension.microprofile.reactive.streams.operators.cdi._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:22+0200")
public class CdiProviderLogger_$logger_de extends CdiProviderLogger_$logger implements CdiProviderLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public CdiProviderLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String noImplementationFound$str() {
        return "WFLYRXSTOPSCDI0001: Keine Implementierung von %1$s im classpath gefunden";
    }
}
