package org.wildfly.extension.microprofile.faulttolerance;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:11+0200")
public class MicroProfileFaultToleranceLogger_$logger_ja extends MicroProfileFaultToleranceLogger_$logger implements MicroProfileFaultToleranceLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileFaultToleranceLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMPFTEXT0001: MicroProfile Fault Tolerance サブシステムのアクティブ化。";
    }
    @Override
    protected String metricsProvider$str() {
        return "WFLYMPFTEXT0002: MicroProfile Fault Tolerance サブシステムは %1$s メトリクスプロバイダーを使用します。";
    }
}
