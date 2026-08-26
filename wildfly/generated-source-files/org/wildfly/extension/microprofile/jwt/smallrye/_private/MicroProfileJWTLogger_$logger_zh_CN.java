package org.wildfly.extension.microprofile.jwt.smallrye._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:33+0200")
public class MicroProfileJWTLogger_$logger_zh_CN extends MicroProfileJWTLogger_$logger_zh implements MicroProfileJWTLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileJWTLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYJWT0001: 激活 MicroProfile JWT 子系统";
    }
    @Override
    protected String noAuthMethodSpecified$str() {
        return "WFLYJWT0003: @LoginConfig 注解中没有指定 'authMethod'。";
    }
    @Override
    protected String loginConfigInvalidTarget$str() {
        return "WFLYJWT0002: @LoginConfig 注解在无效的目标 \"%1$s\" 上检测到。";
    }
}
