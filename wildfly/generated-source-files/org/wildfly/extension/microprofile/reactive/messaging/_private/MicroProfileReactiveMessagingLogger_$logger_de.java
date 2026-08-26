package org.wildfly.extension.microprofile.reactive.messaging._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:38+0200")
public class MicroProfileReactiveMessagingLogger_$logger_de extends MicroProfileReactiveMessagingLogger_$logger implements MicroProfileReactiveMessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveMessagingLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String intermediateModuleNotPresent$str() {
        return "WFLYRXMESS0003: Zwischenmodul %1$s ist nicht vorhanden. Rekursives Hinzufügen von Modulen daraus wird übersprungen";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYRXMESS0001: Aktivieren des MicroProfile Reactive Messaging-Subsystems";
    }
    @Override
    protected String experimentalAnnotationNotAllowed$str() {
        return "WFLYRXMESS0005: Die Verwendung von @%1$s ist in diesem Setup nicht erlaubt";
    }
    @Override
    protected String experimentalPropertyNotAllowed$str() {
        return "WFLYRXMESS0004: Die Verwendung von -D%1$s=true ist in diesem Setup nicht erlaubt";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYRXMESS0002: Deployment %1$s erfordert die Verwendung der Capability '%2$s', ist aber derzeit nicht registriert";
    }
}
