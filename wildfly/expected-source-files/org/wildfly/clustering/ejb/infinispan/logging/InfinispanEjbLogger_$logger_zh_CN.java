package org.wildfly.clustering.ejb.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:28+0200")
public class InfinispanEjbLogger_$logger_zh_CN extends InfinispanEjbLogger_$logger_zh implements InfinispanEjbLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanEjbLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToExpireBean$str() {
        return "WFLYCLEJBINF0003: 终止 stateful session bean %1$s 失败";
    }
    @Override
    protected String expirationDisabled$str() {
        return "WFLYCLEJBINF0010: 禁用 '%1$s' 的过期。应该根据 Jakarta Enterprise Beans 规范中的 ©4.3.11 配置 SFSB 过期。";
    }
}
