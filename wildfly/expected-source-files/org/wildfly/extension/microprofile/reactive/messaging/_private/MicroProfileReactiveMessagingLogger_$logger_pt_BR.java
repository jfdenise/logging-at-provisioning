package org.wildfly.extension.microprofile.reactive.messaging._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:21+0200")
public class MicroProfileReactiveMessagingLogger_$logger_pt_BR extends MicroProfileReactiveMessagingLogger_$logger_pt implements MicroProfileReactiveMessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveMessagingLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYRXMESS0001: Ativando o subsistema MicroProfile Reactive Messaging";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYRXMESS0002: A implantação %1$s requer o uso da funcionalidade '%2$s', mas esta não está registada no momento";
    }
    @Override
    protected String intermediateModuleNotPresent$str() {
        return "WFLYRXMESS0003: O módulo intermediário %1$s não está presente. Ignorando de forma recursiva a inclusão de módulos a partir dele";
    }
    @Override
    protected String experimentalPropertyNotAllowed$str() {
        return "WFLYRXMESS0004: O uso de -D%1$s=true não é permitido nesta configuração";
    }
    @Override
    protected String experimentalAnnotationNotAllowed$str() {
        return "WFLYRXMESS0005: O uso de @%1$s não é permitido nesta configuração";
    }
}
