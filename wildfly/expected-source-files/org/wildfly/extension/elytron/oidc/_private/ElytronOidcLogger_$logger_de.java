package org.wildfly.extension.elytron.oidc._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:42+0200")
public class ElytronOidcLogger_$logger_de extends ElytronOidcLogger_$logger implements ElytronOidcLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ElytronOidcLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYOIDC0001: Aktivierung des WildFly Elytron OIDC-Subsystems";
    }
    @Override
    protected String deploymentSecured$str() {
        return "WFLYOIDC0002: Elytron OIDC-Client-Subsystemüberschreibung für Deployment '%1$s'";
    }
    @Override
    protected String cannotRemoveCredential$str() {
        return "WFLYOIDC0003: Anmeldeinformationen können nicht entfernt werden. Keine Anmeldeinformationen für Deployment '%1$s' definiert";
    }
    @Override
    protected String cannotUpdateCredential$str() {
        return "WFLYOIDC0004: Anmeldeinformationen können nicht aktualisiert werden. Keine Anmeldeinformationen für Deployment '%1$s' definiert";
    }
    @Override
    protected String cannotRemoveRedirectRuntimeRule$str() {
        return "WFLYOIDC0005: Redirect-Rewrite-Regel kann nicht entfernt werden. Kein Redirect-Rewrite für Deployment '%1$s' definiert";
    }
    @Override
    protected String cannotUpdateRedirectRuntimeRule$str() {
        return "WFLYOIDC0006: Redirect-Rewrite kann nicht aktualisiert werden. Kein Redirect-Rewrite für Deployment '%1$s' definiert";
    }
    @Override
    protected String resourceOrClientIdMustBeConfigured$str() {
        return "WFLYOIDC0007: Muss 'resource' oder 'client-id' festlegen";
    }
    @Override
    protected String disableTrustManagerSetToTrue$str() {
        return "WFLYOIDC0008: Das Attribut 'disable-trust-manager' wurde auf 'true' festgelegt, sodass bei der Kommunikation mit dem OpenID-Anbieter über HTTPS kein Trust Manager verwendet wird. Dieser Wert sollte in einer Produktionsumgebung immer auf 'false' festgelegt werden.";
    }
    @Override
    protected String unsupportedAttribute$str() {
        return "WFLYOIDC0009: Das Oidc-Attribut '%1$s' wird mit der aktuellen Stabilitätsebene nicht unterstützt.";
    }
}
