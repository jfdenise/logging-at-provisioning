package org.wildfly.extension.microprofile.jwt.smallrye._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:11+0200")
public class MicroProfileJWTLogger_$logger_fr extends MicroProfileJWTLogger_$logger implements MicroProfileJWTLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileJWTLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYJWT0001: Activation du sous-système JWT MicroProfile";
    }
    @Override
    protected String loginConfigInvalidTarget$str() {
        return "WFLYJWT0002: Annotation @LoginConfig détectée sur une cible invalide \"%1$s\".";
    }
    @Override
    protected String noAuthMethodSpecified$str() {
        return "WFLYJWT0003: Pas de `authMethod` spécifiée sur l'annotation @LoginConfig.";
    }
}
