package org.jboss.as.network.logging;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.lang.String;
import java.util.Arrays;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2026-08-26T14:41:42+0200")
public class NetworkMessages_$bundle implements NetworkMessages, Serializable {
    private static final long serialVersionUID = 1L;
    protected NetworkMessages_$bundle() {}
    public static final NetworkMessages_$bundle INSTANCE = new NetworkMessages_$bundle();
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String cannotChangeWhileBound$str() {
        return "WFLYNET0001: cannot change value while the socket is bound.";
    }
    @Override
    public final IllegalStateException cannotChangeWhileBound() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), cannotChangeWhileBound$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String noMulticastBinding$str() {
        return "WFLYNET0002: no multicast binding: %s";
    }
    @Override
    public final IllegalStateException noMulticastBinding(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noMulticastBinding$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
