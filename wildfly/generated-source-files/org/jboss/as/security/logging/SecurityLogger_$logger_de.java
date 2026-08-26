package org.jboss.as.security.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:51+0200")
public class SecurityLogger_$logger_de extends SecurityLogger_$logger implements SecurityLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SecurityLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unableToEnableJaccSupport$str() {
        return "WFLYSEC0105: JACC-Unterstützung kann nicht initialisiert werden, während JACC-Unterstützung von elytron aktiviert ist.";
    }
    @Override
    protected String runtimeException$str() {
        return "WFLYSEC0007: Runtime-Ausnahme:";
    }
    @Override
    protected String unsupportedOperationExceptionUseResourceDesc$str() {
        return "WFLYSEC0018: Verwendung der ResourceDescriptionResolver-Variante";
    }
    @Override
    protected String unsupportedOperation$str() {
        return "WFLYSEC0019: Nicht unterstützte Operation";
    }
    @Override
    protected String passwordAgain$str() {
        return "WFLYSEC0061: Erneut eingeben: ";
    }
    @Override
    protected String validationFailed$str() {
        return "WFLYSEC0107: Validierung fehlgeschlagen für %1$s";
    }
    @Override
    protected String xmlStreamExceptionAuth$str() {
        return "WFLYSEC0022: Eine Sicherheitsdomain kann entweder ein <authentication> oder ein <authentication-jaspi> Element besitzen, aber nicht beides";
    }
    @Override
    protected String xmlStreamExceptionMissingAttribute$str() {
        return "WFLYSEC0023: Erforderliches Attribut fehlt: entweder %1$s oder %2$s muss vorhanden sein";
    }
    @Override
    protected String securityException$str() {
        return "WFLYSEC0015: Sicherheitsausnahme";
    }
}
