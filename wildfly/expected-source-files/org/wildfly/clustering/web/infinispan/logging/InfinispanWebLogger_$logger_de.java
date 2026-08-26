package org.wildfly.clustering.web.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:48+0200")
public class InfinispanWebLogger_$logger_de extends InfinispanWebLogger_$logger implements InfinispanWebLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanWebLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToPassivateSession$str() {
        return "WFLYCLWEBINF0001: Passivierung der Attribute von Session %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToPassivateSessionAttribute$str() {
        return "WFLYCLWEBINF0002: Passivierung des Attribut %2$s von Session %1$s fehlgeschlagen";
    }
    @Override
    protected String invalidSession$str() {
        return "WFLYCLWEBINF0003: Session %1$s ist ungültig";
    }
    @Override
    protected String failedToExpireSession$str() {
        return "WFLYCLWEBINF0004: Verfallen von Session %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToCancelSession$str() {
        return "WFLYCLWEBINF0005: Abbrechen von Verfall/Passivierung von Session %1$s auf primärem Besitzer fehlgeschlagen.";
    }
    @Override
    protected String failedToScheduleSession$str() {
        return "WFLYCLWEBINF0006: Einplanen von Verfall/Passivierung von Session %1$s auf primärem Besitzer fehlgeschlagen.";
    }
    @Override
    protected String failedToActivateSession$str() {
        return "WFLYCLWEBINF0007: Aktivierung der Attribute von Session %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToActivateSessionAttribute$str() {
        return "WFLYCLWEBINF0008: Aktivierung des Attribut %2$s von Session %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToReadSessionAttribute$str() {
        return "WFLYCLWEBINF0009: Lesen des Attribut %2$s von Session %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToActivateAuthentication$str() {
        return "WFLYCLWEBINF0010: Aktivierung von Authentifizierung für Single Sign On %1$s fehlgeschlagen";
    }
    @Override
    protected String missingSessionAttributeCacheEntry$str() {
        return "WFLYCLWEBINF0011: Für Session %1$s fehlt Cache-Eintrag für Attribut %2$s";
    }
    @Override
    protected String evictionDisabled$str() {
        return "WFLYCLWEBINF0012: Entfernung für Cache \"%1$s\" wird deaktiviert. Web-Session-Passivierung sollte über <max-active-sessions/> in jboss-web.xml konfiguriert werden.";
    }
    @Override
    protected String expirationDisabled$str() {
        return "WFLYCLWEBINF0013: Ablauf für Cache \"%1$s\" wird deaktiviert. Web-Session-Ablauf sollte gemäß §7.5 der Servelet-Spezifikation konfiguriert werden.";
    }
}
