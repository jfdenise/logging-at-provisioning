package org.wildfly.extension.requestcontroller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:21+0200")
public class RequestControllerLogger_$logger_ja extends RequestControllerLogger_$logger implements RequestControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public RequestControllerLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToCancelTask$str() {
        return "WFLYREQCON001: キューに置かれたタスク %1$s のキャンセルに失敗しました";
    }
}
