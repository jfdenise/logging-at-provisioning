package org.jboss.as.network.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2026-08-26T14:41:42+0200")
public class NetworkMessages_$bundle_zh_CN extends NetworkMessages_$bundle_zh implements NetworkMessages, Serializable {
    private static final long serialVersionUID = 1L;
    protected NetworkMessages_$bundle_zh_CN() {
        super();
    }
    public static final NetworkMessages_$bundle_zh_CN INSTANCE = new NetworkMessages_$bundle_zh_CN();
    @Override
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotChangeWhileBound$str() {
        return "WFLYNET0001: 套接字绑定时功能更改数值。";
    }
    @Override
    protected String noMulticastBinding$str() {
        return "WFLYNET0002: 无 multicast 绑定：%1$s";
    }
}
