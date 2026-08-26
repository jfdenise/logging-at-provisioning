package org.jboss.as.server.deployment.scanner.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:17+0200")
public class DeploymentScannerLogger_$logger_zh extends DeploymentScannerLogger_$logger implements DeploymentScannerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DeploymentScannerLogger_$logger_zh(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
}
