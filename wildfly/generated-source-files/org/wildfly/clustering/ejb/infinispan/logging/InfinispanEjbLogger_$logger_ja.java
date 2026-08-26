package org.wildfly.clustering.ejb.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:05+0200")
public class InfinispanEjbLogger_$logger_ja extends InfinispanEjbLogger_$logger implements InfinispanEjbLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanEjbLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String expirationDisabled$str() {
        return "WFLYCLEJBINF0010: '%1$s' のエクスパレーションを無効にします。SFSB エクスパレーションは、Jakarta Enterprise Beans 仕様の §4.3.11 にしたがって設定する必要があります。";
    }
    @Override
    protected String failedToExpireBean$str() {
        return "WFLYCLEJBINF0003: ステートフルセッション Bean %1$s を期限切れにすることができませんでした";
    }
}
