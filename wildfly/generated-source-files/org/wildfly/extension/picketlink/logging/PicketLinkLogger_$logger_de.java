package org.wildfly.extension.picketlink.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:45+0200")
public class PicketLinkLogger_$logger_de extends PicketLinkLogger_$logger implements PicketLinkLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PicketLinkLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String requiredAlternativeAttributes$str() {
        return "WFLYPL0016: [%1$s] erfordert eines der gegebenen Attribute [%2$s].";
    }
    @Override
    protected String cannotMigrateNonEmptyConfiguration$str() {
        return "WFLYPL0107: Die nicht leere Konfiguration des PicketLink-Federation-Subsystems kann nicht migriert werden.";
    }
    @Override
    protected String migrationFailed$str() {
        return "WFLYPL0106: Migration fehlgeschlagen, siehe Ergebnisse für weitere Einzelheiten.";
    }
    @Override
    protected String boundToJndi$str() {
        return "WFLYPL0003: [%1$s] an [%2$s] gebunden";
    }
    @Override
    protected String couldNotLoadClass$str() {
        return "WFLYPL0009: Konnte Klasse [%1$s] nicht laden.";
    }
    @Override
    protected String attributeNoLongerSupported$str() {
        return "WFLYPL0012: Attribut [%1$s] wird nicht mehr unterstützt.";
    }
    @Override
    protected String invalidChildTypeOccurrence$str() {
        return "WFLYPL0013: [%1$s] kann nur [%2$d] Unterelement vom Typ [%3$s] haben.";
    }
    @Override
    protected String typeAlreadyDefined$str() {
        return "WFLYPL0017: Typ [%1$s] bereits definiert.";
    }
    @Override
    protected String requiredAttribute$str() {
        return "WFLYPL0015: Erforderliches Attribut [%1$s] für [%2$s].";
    }
    @Override
    protected String federationHandlerTypeNotProvided$str() {
        return "WFLYPL0101: Kein Typ für den Handler bereitgestellt. Sie müssen einen Klassennamen oder Code festlegen.";
    }
    @Override
    protected String typeNotProvided$str() {
        return "WFLYPL0010: Kein Typ für %1$s bereitgestellt. Sie müssen einen Klassennamen oder Code festlegen.";
    }
    @Override
    protected String requiredChild$str() {
        return "WFLYPL0019: [%1$s] erfordert Unterelement [%2$s].";
    }
    @Override
    protected String idmNoSupportedTypesDefined$str() {
        return "WFLYPL0056: Keinen unterstützten Typ bereitgestellt.";
    }
    @Override
    protected String idmNoIdentityConfigurationProvided$str() {
        return "WFLYPL0054: Sie müssen mindestens eine Identitätskonfiguration bereitstellen.";
    }
    @Override
    protected String idmNoIdentityStoreProvided$str() {
        return "WFLYPL0055: Sie müssen mindestens einen Identitätsspeicher für Identitätskonfiguration [%1$s] bereitstellen.";
    }
    @Override
    protected String invalidAlternativeAttributeOccurrence$str() {
        return "WFLYPL0014: Ungültige Definition von Attribut [%1$s] für [%2$s]. Nur eines der folgenden Attribute ist erlaubt: [%3$s].";
    }
    @Override
    protected String emptyResource$str() {
        return "WFLYPL0018: [%1$s] kann nicht leer sein.";
    }
    @Override
    protected String idmLdapNoMappingDefined$str() {
        return "WFLYPL0057: Es wurde kein Mapping definiert.";
    }
    @Override
    protected String moduleCouldNotLoad$str() {
        return "WFLYPL0007: Konnte Modul [%1$s] nicht laden.";
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "WFLYPL0105: Die Migrations-Operation kann nicht ausgeführt werden: Server muss sich im \"admin-only\" Modus befinden";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYPL0001: Aktivierung des PicketLink-%1$s-Subsystems";
    }
}
