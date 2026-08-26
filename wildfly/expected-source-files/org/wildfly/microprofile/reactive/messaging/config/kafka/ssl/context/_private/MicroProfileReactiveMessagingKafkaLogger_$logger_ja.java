package org.wildfly.microprofile.reactive.messaging.config.kafka.ssl.context._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:21+0200")
public class MicroProfileReactiveMessagingKafkaLogger_$logger_ja extends MicroProfileReactiveMessagingKafkaLogger_$logger implements MicroProfileReactiveMessagingKafkaLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveMessagingKafkaLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String foundPropertyUsingElytronClientSSLContext$str() {
        return "WFLYRXMKAF0001: 見つかったプロパティー %1$s は Elytron client-ssl-context を使用します。%2$s";
    }
    @Override
    protected String noElytronClientSSLContext$str() {
        return "WFLYRXMKAF0002: 以下と呼ばれる Elytron client-ssl-context が見つかりませんでした。%1$s";
    }
}
