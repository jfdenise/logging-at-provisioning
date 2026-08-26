package org.wildfly.extension.security.manager.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:50+0200")
public class SecurityManagerLogger_$logger_de extends SecurityManagerLogger_$logger implements SecurityManagerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SecurityManagerLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unexpectedElement$str() {
        return "WFLYSM0006: Unerwartetes Element \"%1$s\" gefunden";
    }
    @Override
    protected String invalidSubsystemConfiguration$str() {
        return "WFLYSM0003: Fehler in Subsystemkonfiguration: Die folgenden Berechtigungen sind nicht im maximalen Berechtigungssatz enthalten: %1$s";
    }
    @Override
    protected String unexpectedEndOfDocument$str() {
        return "WFLYSM0008: Unerwartetes Ende des Dokuments";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYSM0009: Fehlende(s) erforderliche(s) Attribut(e): %1$s";
    }
    @Override
    protected String unexpectedAttribute$str() {
        return "WFLYSM0007: Unerwartetes Attribut \"%1$s\" gefunden";
    }
    @Override
    protected String ignoredPermission$str() {
        return "WFLYSM0012: Die folgende Erlaubnis konnte nicht erstellt werden und wird in %1$s ignoriert: (class=\"%2$s\" name=\"%3$s\" actions=\"%4$s\")";
    }
    @Override
    protected String rejectedEmptyMaximumSet$str() {
        return "WFLYSM0005: Leere Maximalsätze werden in der Zielmodellversion nicht verstanden und müssen abgelehnt werden";
    }
    @Override
    protected String missingRequiredElements$str() {
        return "WFLYSM0010: Fehlende(s) erforderliche(s) Element(e): %1$s";
    }
    @Override
    protected String invalidDeploymentConfiguration$str() {
        return "WFLYSM0004: Fehler in Deployment-Konfiguration: Die folgenden Berechtigungen sind nicht im maximalen Berechtigungssatz enthalten: %1$s";
    }
    @Override
    protected String unexpectedContentType$str() {
        return "WFLYSM0011: Unerwarteter Inhalt des Typs %1$s";
    }
    @Override
    protected String invalidPermissionsXMLVersion$str() {
        return "WFLYSM0002: Ungültige Version im Berechtigungselement gefunden. Gefunden: %1$s. Erwartet: %2$s";
    }
}
