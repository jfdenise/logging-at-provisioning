package org.wildfly.extension.security.manager.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:50+0200")
public class SecurityManagerLogger_$logger_fr extends SecurityManagerLogger_$logger implements SecurityManagerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SecurityManagerLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unexpectedElement$str() {
        return "WFLYSM0006: Élément '%1$s' non attendu rencontré";
    }
    @Override
    protected String invalidSubsystemConfiguration$str() {
        return "WFLYSM0003: Erreur de configuration du sous-système : les permissions suivantes ne sont pas comprises dans l'ensemble de permissions %1$s";
    }
    @Override
    protected String unexpectedEndOfDocument$str() {
        return "WFLYSM0008: Fin de document inattendue";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYSM0009: Attribut(s) manquants requis : %1$s";
    }
    @Override
    protected String unexpectedAttribute$str() {
        return "WFLYSM0007: Attribut '%1$s' inattendu rencontré";
    }
    @Override
    protected String ignoredPermission$str() {
        return "WFLYSM0012: La permission suivante n'a pas pu être construite et sera ignorée dans le site %1$s: (class=\"%2$s\" name=\"%3$s\" actions=\"%4$s\")";
    }
    @Override
    protected String rejectedEmptyMaximumSet$str() {
        return "WFLYSM0005: Les nombres maximum vides ne sont pas compris par la version du modèle cible et doivent être rejetés";
    }
    @Override
    protected String missingRequiredElements$str() {
        return "WFLYSM0010: Élément(s) manquants requis : %1$s";
    }
    @Override
    protected String invalidDeploymentConfiguration$str() {
        return "WFLYSM0004: Erreur de configuration du déploiement : les permissions suivantes ne sont pas comprises dans l'ensemble de permissions %1$s";
    }
    @Override
    protected String unexpectedContentType$str() {
        return "WFLYSM0011: Contenu de type %1$s inattendu";
    }
    @Override
    protected String invalidPermissionsXMLVersion$str() {
        return "WFLYSM0002: Version non valide trouvée dans l'élément de permission. %1$s trouvé, %2$s attendu";
    }
}
