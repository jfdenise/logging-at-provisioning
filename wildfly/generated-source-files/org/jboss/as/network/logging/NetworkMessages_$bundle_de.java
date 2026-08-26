package org.jboss.as.network.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2026-08-26T14:41:42+0200")
public class NetworkMessages_$bundle_de extends NetworkMessages_$bundle implements NetworkMessages, Serializable {
    private static final long serialVersionUID = 1L;
    protected NetworkMessages_$bundle_de() {
        super();
    }
    public static final NetworkMessages_$bundle_de INSTANCE = new NetworkMessages_$bundle_de();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotChangeWhileBound$str() {
        return "WFLYNET0001: Kann Wert nicht ändern während das Socket gebunden ist.";
    }
    @Override
    protected String noMulticastBinding$str() {
        return "WFLYNET0002: Kein Multicast-Binding: %1$s";
    }
}
