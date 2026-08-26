package org.wildfly.extension.microprofile.reactive.messaging._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:38+0200")
public class MicroProfileReactiveMessagingLogger_$logger_fr extends MicroProfileReactiveMessagingLogger_$logger implements MicroProfileReactiveMessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveMessagingLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String intermediateModuleNotPresent$str() {
        return "WFLYRXMESS0003: Le module intermédiaire %1$s n'est pas présent. Ignorer l'ajout récursif de modules à partir de celui-ci";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYRXMESS0001: Activation du sous-système de messagerie réactive MicroProfile";
    }
    @Override
    protected String experimentalAnnotationNotAllowed$str() {
        return "WFLYRXMESS0005: L'utilisation de @%1$s n'est pas autorisée dans cette configuration";
    }
    @Override
    protected String experimentalPropertyNotAllowed$str() {
        return "WFLYRXMESS0004: L'utilisation de -D%1$s=true n'est pas autorisée dans cette configuration";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYRXMESS0002: Le déploiement %1$s nécessite l'utilisation de la capacité '%2$s' , mais elle n'est pas encore enregistrée";
    }
}
