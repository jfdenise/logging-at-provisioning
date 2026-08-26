package org.jboss.as.network.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2026-08-26T14:41:42+0200")
public class NetworkMessages_$bundle_pt_BR extends NetworkMessages_$bundle_pt implements NetworkMessages, Serializable {
    private static final long serialVersionUID = 1L;
    protected NetworkMessages_$bundle_pt_BR() {
        super();
    }
    public static final NetworkMessages_$bundle_pt_BR INSTANCE = new NetworkMessages_$bundle_pt_BR();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotChangeWhileBound$str() {
        return "WFLYNET0001: não foi possível alterar o valor enquanto o socket é vinculado.";
    }
    @Override
    protected String noMulticastBinding$str() {
        return "WFLYNET0002: nenhuma associação multicast: %1$s";
    }
}
