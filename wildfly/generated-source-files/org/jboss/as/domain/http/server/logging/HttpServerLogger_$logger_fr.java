package org.jboss.as.domain.http.server.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:14+0200")
public class HttpServerLogger_$logger_fr extends HttpServerLogger_$logger implements HttpServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public HttpServerLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String errorContextModuleNotFound$str() {
        return "WFLYDMHTTP0004: Impossible de charger le contexte d'erreur pour la plage %1$s, désactivant le contexte de l'erreur.";
    }
    @Override
    protected String invalidOperation$str() {
        return "WFLYDMHTTP0005: Opération non valide '%1$s'";
    }
    @Override
    protected String managementHttpServerAlreadyBuild$str() {
        return "WFLYDMHTTP0014: Le ManagementHttpServer a déjà été construit par ce Builder.";
    }
    @Override
    protected String realmNotReadyForSecuredManagementHandler$str() {
        return "WFLYDMHTTP0016: Votre serveur d’applications est en cours d’exécution. Cependant, vous n’avez pas ajouté d’utilisateur pour pouvoir avoir accès à l’interface de gestion HTTP. Pour ajouter un nouvel utilisateur, exécutez le script %1$s dans le dossier bin de votre installation WildFly et entrez les informations demandées : par défaut, le nom de domaine utilisé par WildFly est « ManagementRealm » et il est déjà sélectionné par défaut par l'outil add-user.";
    }
    @Override
    protected String consoleModuleNotFoundMsg$str() {
        return "WFLYDMHTTP0007: Aucun module de console trouvé ayant pour nom de module %1$s";
    }
    @Override
    protected String uploadError$str() {
        return "WFLYDMHTTP0002: Erreur inattendue lors de l'exécution de la demande de chargement du déploiement";
    }
    @Override
    protected String realmNotReadyMessage$str() {
        return "WFLYDMHTTP0006: Le domaine de sécurité n'est pas prêt pour traiter les requêtes, voir %1$s";
    }
    @Override
    protected String httpsRedirectNotSupported$str() {
        return "WFLYDMHTTP0011: L'interface de gestion utilise des adresses différentes pour HTTP (%1$s) ou HTTPS (%2$s). La redirection des requêtes HTTPS en provenance de socket HTTP vers une socket HTTPS ne sera pas pris en charge.";
    }
    @Override
    protected String sslRequestedNoSslContext$str() {
        return "WFLYDMHTTP0012: Une socket sécurisée a été définie pour l'interface HTTP, mais le domaine de sécurité référencé ne fournit pas de SSLContext.";
    }
    @Override
    protected String consoleModuleNotFound$str() {
        return "WFLYDMHTTP0003: Impossible de charger le module de la console pour le slot %1$s, désactivant la console";
    }
    @Override
    protected String invalidUseStreamAsResponseIndex$str() {
        return "WFLYDMHTTP0013: Valeur de useStreamIndex '%1$d' non valide. La réponse à l'opération avait %2$d streams attachés.";
    }
    @Override
    protected String noRealmOrSSLContext$str() {
        return "WFLYDMHTTP0015: Aucun SecurityRealm ou SSLContext n'a été fourni.";
    }
    @Override
    protected String modelRequestError$str() {
        return "WFLYDMHTTP0001: Erreur inattendue lors de l'exécution du modèle";
    }
    @Override
    protected String invalidCredentialType$str() {
        return "WFLYDMHTTP0010: Type d'information d'identification non valide '%1$s'";
    }
}
