package org.wildfly.extension.clustering.singleton;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:07+0200")
public class SingletonLogger_$logger_pt_BR extends SingletonLogger_$logger_pt implements SingletonLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SingletonLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String singletonDeploymentDetected$str() {
        return "WFLYCLSNG0001: Implantação de singleton detectada. A implantação será redefinida usando a política %1$s.";
    }
}
