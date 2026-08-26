package org.wildfly.extension.microprofile.reactive.streams.operators._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:40+0200")
public class MicroProfileReactiveStreamsOperatorsLogger_$logger_ja extends MicroProfileReactiveStreamsOperatorsLogger_$logger implements MicroProfileReactiveStreamsOperatorsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveStreamsOperatorsLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYRXSTOPS0001: MicroProfile Reactive Streams Operators サブシステムをアクティブ化しています";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYRXSTOPS0002: デプロイメント %1$s には %2$s 機能の使用が必要ですが、現在登録されていません。";
    }
}
