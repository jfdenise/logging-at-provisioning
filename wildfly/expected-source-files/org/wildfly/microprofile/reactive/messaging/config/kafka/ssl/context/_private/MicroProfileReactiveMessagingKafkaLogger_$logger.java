package org.wildfly.microprofile.reactive.messaging.config.kafka.ssl.context._private;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.lang.RuntimeException;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T12:02:21+0200")
public class MicroProfileReactiveMessagingKafkaLogger_$logger extends DelegatingBasicLogger implements MicroProfileReactiveMessagingKafkaLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MicroProfileReactiveMessagingKafkaLogger_$logger.class.getName();
    public MicroProfileReactiveMessagingKafkaLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void foundPropertyUsingElytronClientSSLContext(final String prop, final String ctx) {
        super.log.logf(FQCN, INFO, null, foundPropertyUsingElytronClientSSLContext$str(), prop, ctx);
    }
    protected String foundPropertyUsingElytronClientSSLContext$str() {
        return "WFLYRXMKAF0001: Found property %s, will use the Elytron client-ssl-context: %s";
    }
    protected String noElytronClientSSLContext$str() {
        return "WFLYRXMKAF0002: Could not find an Elytron client-ssl-context called: %s";
    }
    @Override
    public final IllegalStateException noElytronClientSSLContext(final String ctx) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noElytronClientSSLContext$str(), ctx));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String compressionNotSupportedOnWindows$str() {
        return "WFLYRXMKAF0003: '%s' compression is not supported when running on Windows or Mac OS. The MicroProfile Config property configuring this compression type is: %s";
    }
    @Override
    public final RuntimeException compressionNotSupportedOnWindows(final String propertyValue, final String propertyName) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), compressionNotSupportedOnWindows$str(), propertyValue, propertyName));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
