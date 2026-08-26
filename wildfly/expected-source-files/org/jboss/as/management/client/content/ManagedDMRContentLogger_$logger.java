package org.jboss.as.management.client.content;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import java.security.NoSuchAlgorithmException;
import org.jboss.logging.Logger;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.PathAddress;
import java.lang.Class;
import java.util.Arrays;
import java.lang.IllegalArgumentException;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:26:28+0200")
public class ManagedDMRContentLogger_$logger extends DelegatingBasicLogger implements ManagedDMRContentLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ManagedDMRContentLogger_$logger.class.getName();
    public ManagedDMRContentLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String invalidHash$str() {
        return "WFLYCNT0001: Invalid hash '%s' for content at address %s; current hash is '%s' -- perhaps the content has been updated by another caller?";
    }
    @Override
    public final OperationFailedException invalidHash(final String expectedHash, final PathAddress address, final String currentHash) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidHash$str(), expectedHash, address, currentHash));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String messageDigestAlgorithmNotAvailable$str() {
        return "WFLYCNT0002: Cannot obtain Message Digest algorithm SHA-1";
    }
    @Override
    public final IllegalStateException messageDigestAlgorithmNotAvailable(final NoSuchAlgorithmException cause) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), messageDigestAlgorithmNotAvailable$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalChildType$str() {
        return "WFLYCNT0003: Illegal child type %s -- must be %s";
    }
    @Override
    public final IllegalArgumentException illegalChildType(final String type, final String legalType) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalChildType$str(), type, legalType));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalChildClass$str() {
        return "WFLYCNT0004: Illegal child resource class %s";
    }
    @Override
    public final IllegalArgumentException illegalChildClass(final Class<? extends org.jboss.as.controller.registry.Resource> clazz) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalChildClass$str(), clazz));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noContentFoundWithHash$str() {
        return "WFLYCNT0005: No content found with hash %s";
    }
    @Override
    public final IllegalStateException noContentFoundWithHash(final String hash) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noContentFoundWithHash$str(), hash));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullParent$str() {
        return "WFLYCNT0006: null parent";
    }
    @Override
    public final IllegalStateException nullParent() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), nullParent$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
