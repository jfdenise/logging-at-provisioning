package org.wildfly.extension.elytron.oidc._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:42+0200")
public class ElytronOidcLogger_$logger_fr extends ElytronOidcLogger_$logger implements ElytronOidcLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ElytronOidcLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYOIDC0001: Activation du sous-système OIDC de WildFly Elytron";
    }
    @Override
    protected String deploymentSecured$str() {
        return "WFLYOIDC0002: Dépassement du sous-système du client OIDC d'Elytron pour le déploiement '%1$s'";
    }
    @Override
    protected String cannotRemoveCredential$str() {
        return "WFLYOIDC0003: Impossible de supprimer l'identifiant. Aucun justificatif d'identité n'a été défini pour le déploiement '%1$s'";
    }
    @Override
    protected String cannotUpdateCredential$str() {
        return "WFLYOIDC0004: Impossible de mettre à jour les informations d'identification. Aucun justificatif d'identité n'a été défini pour le déploiement '%1$s'";
    }
    @Override
    protected String cannotRemoveRedirectRuntimeRule$str() {
        return "WFLYOIDC0005: Impossible de supprimer la règle de réécriture de la redirection. Aucune réécriture de redirection n'a été définie pour le déploiement '%1$s'";
    }
    @Override
    protected String cannotUpdateRedirectRuntimeRule$str() {
        return "WFLYOIDC0006: Impossible de mettre à jour la réécriture de la redirection. Aucune réécriture de redirection n'a été définie pour le déploiement '%1$s'";
    }
    @Override
    protected String resourceOrClientIdMustBeConfigured$str() {
        return "WFLYOIDC0007: Doit définir 'resource' ou 'client-id'";
    }
    @Override
    protected String disableTrustManagerSetToTrue$str() {
        return "WFLYOIDC0008: L'attribut 'disable-trust-manager' a été défini à 'true' de sorte qu'aucun gestionnaire de confiance ne sera utilisé lors de la communication avec le fournisseur OpenID via HTTPS. Cette valeur doit toujours être définie sur \"false\" dans un environnement de production.";
    }
    @Override
    protected String unsupportedAttribute$str() {
        return "WFLYOIDC0009: Attribut Oidc '%1$s ' n'est pas pris en charge avec le niveau de stabilité actuel.";
    }
}
