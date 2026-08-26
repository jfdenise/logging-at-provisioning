package org.wildfly.extension.microprofile.telemetry;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:22+0200")
public class MicroProfileTelemetryExtensionLogger_$logger_ja extends MicroProfileTelemetryExtensionLogger_$logger implements MicroProfileTelemetryExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileTelemetryExtensionLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMPTEL0001: MicroProfile Telemetry サブシステムのアクティブ化";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYMPTEL0002: デプロイメント %1$s には %2$s 機能の使用が必要ですが、現在登録されていません。";
    }
}
