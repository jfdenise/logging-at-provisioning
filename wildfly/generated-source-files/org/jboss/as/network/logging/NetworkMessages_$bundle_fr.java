package org.jboss.as.network.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2026-08-26T14:41:42+0200")
public class NetworkMessages_$bundle_fr extends NetworkMessages_$bundle implements NetworkMessages, Serializable {
    private static final long serialVersionUID = 1L;
    protected NetworkMessages_$bundle_fr() {
        super();
    }
    public static final NetworkMessages_$bundle_fr INSTANCE = new NetworkMessages_$bundle_fr();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotChangeWhileBound$str() {
        return "WFLYNET0001: ne peut pas changer la valeur tant que le socket est lié.";
    }
    @Override
    protected String noMulticastBinding$str() {
        return "WFLYNET0002: pas de liaison multicast : %1$s";
    }
}
