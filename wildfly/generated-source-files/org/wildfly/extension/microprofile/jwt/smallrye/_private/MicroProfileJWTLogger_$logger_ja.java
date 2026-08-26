package org.wildfly.extension.microprofile.jwt.smallrye._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:33+0200")
public class MicroProfileJWTLogger_$logger_ja extends MicroProfileJWTLogger_$logger implements MicroProfileJWTLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileJWTLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYJWT0001: MicroProfile JWT サブシステムのアクティブ化";
    }
    @Override
    protected String noAuthMethodSpecified$str() {
        return "WFLYJWT0003: @LoginConfig アノテーションに 'authMethod' が指定されていません。";
    }
    @Override
    protected String loginConfigInvalidTarget$str() {
        return "WFLYJWT0002: @LoginConfig アノテーションが、無効なターゲット \"%1$s\" で検出されました。";
    }
}
