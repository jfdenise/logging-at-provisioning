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
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:29+0200")
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
    public final OperationFailedException invalidHash(final String arg0, final PathAddress arg1, final String arg2) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidHash$str(), arg0, arg1, arg2));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String messageDigestAlgorithmNotAvailable$str() {
        return "WFLYCNT0002: Cannot obtain Message Digest algorithm SHA-1";
    }
    @Override
    public final IllegalStateException messageDigestAlgorithmNotAvailable(final NoSuchAlgorithmException arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), messageDigestAlgorithmNotAvailable$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalChildType$str() {
        return "WFLYCNT0003: Illegal child type %s -- must be %s";
    }
    @Override
    public final IllegalArgumentException illegalChildType(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalChildType$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalChildClass$str() {
        return "WFLYCNT0004: Illegal child resource class %s";
    }
    @Override
    public final IllegalArgumentException illegalChildClass(final Class<? extends org.jboss.as.controller.registry.Resource> arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), illegalChildClass$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String noContentFoundWithHash$str() {
        return "WFLYCNT0005: No content found with hash %s";
    }
    @Override
    public final IllegalStateException noContentFoundWithHash(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noContentFoundWithHash$str(), arg0));
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
