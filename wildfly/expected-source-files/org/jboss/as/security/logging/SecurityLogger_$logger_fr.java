package org.jboss.as.security.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:14+0200")
public class SecurityLogger_$logger_fr extends SecurityLogger_$logger implements SecurityLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SecurityLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String runtimeException$str() {
        return "WFLYSEC0007: Exception à l’exécution :";
    }
    @Override
    protected String securityException$str() {
        return "WFLYSEC0015: Exception de sécurité";
    }
    @Override
    protected String unsupportedOperationExceptionUseResourceDesc$str() {
        return "WFLYSEC0018: Utiliser la variante ResourceDescriptionResolver";
    }
    @Override
    protected String unsupportedOperation$str() {
        return "WFLYSEC0019: Opération non prise en charge";
    }
    @Override
    protected String xmlStreamExceptionAuth$str() {
        return "WFLYSEC0022: Un domaine de sécurité doit avoir soit l’élément <authentication> soit <authentication-jaspi>, mais pas les deux";
    }
    @Override
    protected String xmlStreamExceptionMissingAttribute$str() {
        return "WFLYSEC0023: Attribut manquant requis : soit %1$s ou %2$s doit être présent";
    }
    @Override
    protected String passwordAgain$str() {
        return "WFLYSEC0061: À nouveau : ";
    }
    @Override
    protected String unableToEnableJaccSupport$str() {
        return "WFLYSEC0105: Impossible d'initialiser le support JACC hérité quand le support JACC elytron est activé.";
    }
    @Override
    protected String validationFailed$str() {
        return "WFLYSEC0107: La validation a échoué pour %1$s";
    }
}
