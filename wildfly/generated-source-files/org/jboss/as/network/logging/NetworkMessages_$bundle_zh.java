package org.jboss.as.network.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2026-08-26T14:41:42+0200")
public class NetworkMessages_$bundle_zh extends NetworkMessages_$bundle implements NetworkMessages, Serializable {
    private static final long serialVersionUID = 1L;
    protected NetworkMessages_$bundle_zh() {
        super();
    }
    public static final NetworkMessages_$bundle_zh INSTANCE = new NetworkMessages_$bundle_zh();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
}
