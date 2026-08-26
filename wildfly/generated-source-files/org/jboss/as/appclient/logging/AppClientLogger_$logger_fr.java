package org.jboss.as.appclient.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:01+0200")
public class AppClientLogger_$logger_fr extends AppClientLogger_$logger implements AppClientLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public AppClientLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String argHelp$str() {
        return "Afficher ce message et sortir";
    }
    @Override
    protected String malformedUrl$str() {
        return "WFLYAC0017: URL mal-formé fourni pour l'option %1$s";
    }
    @Override
    protected String cannotLoadAppClientMainClass$str() {
        return "WFLYAC0008: Impossible de charger la classe du principal de l'app client";
    }
    @Override
    protected String unknownOption$str() {
        return "WFLYAC0020: Option inconnue %1$s";
    }
    @Override
    protected String cannotLoadProperties$str() {
        return "WFLYAC0010: Impossible de charger les propriétés à partir de %1$s de l'URL";
    }
    @Override
    protected String failedToParseXml1$str() {
        return "WFLYAC0015: N'a pas pu traiter %1$s";
    }
    @Override
    protected String usageDescription$str() {
        return "Le script appclient démarre une application client qui peut être utilisée pour tester et accéder aux Jakarta Enterprise Beans.";
    }
    @Override
    protected String cannotStartAppClient1$str() {
        return "WFLYAC0011: Impossible de démarrer %1$s de l'app client car aucune classe du main n'a été trouvée";
    }
    @Override
    protected String couldNotLoadCallbackClass$str() {
        return "WFLYAC0021: Impossible de charger la classe de callback-handler %1$s";
    }
    @Override
    protected String appClientNotSpecified$str() {
        return "WFLYAC0004: Vous devez indiquer l'app client à exécuter";
    }
    @Override
    protected String cannotStartAppClient2$str() {
        return "WFLYAC0012: Impossible de démarrer %1$s de l'app client car aucune méthode de main n'a été trouvée sur classe du main %2$s";
    }
    @Override
    protected String multipleAppClientsFound$str() {
        return "WFLYAC0018: Plus d'une app client trouvée et pas de nom d'app client spécifié";
    }
    @Override
    protected String cannotSpecifyBothHostAndPropertiesFile$str() {
        return "WFLYAC0024: Impossible d'indiquer à la fois un hôte auquel se connecter et un fichier ejb-client.properties. ";
    }
    @Override
    protected String failedToParseXml3$str() {
        return "WFLYAC0016: N'a pas pu traiter %1$s à [%2$d,%3$d]";
    }
    @Override
    protected String argSecMgr$str() {
        return "Exécute le conteneur avec le gestionnaire de sécurité activé.";
    }
    @Override
    protected String argAppClientConfig$str() {
        return "Nom du fichier de configuration de l'application du client à utiliser (la valeur par défaut est \"appclient.xml\")";
    }
    @Override
    protected String argumentExpected$str() {
        return "WFLYAC0005: Argument attendu de l'option %1$s";
    }
    @Override
    protected String argProperties$str() {
        return "Charger les propriétés du système à partir de l'url donné";
    }
    @Override
    protected String argSystemProperty$str() {
        return "Définir une propriété système";
    }
    @Override
    protected String argVersion$str() {
        return "Imprimer la version et quitter";
    }
    @Override
    protected String cannotFindAppClient0$str() {
        return "WFLYAC0006: Impossible de trouver le jar de l'app client dans le déploiement";
    }
    @Override
    protected String argConnectionProperties$str() {
        return "Charger le fichier ejb-client.properties à partir de l'url donné";
    }
    @Override
    protected String argHost$str() {
        return "Définir l'url de l'instance de serveur de l'application pour la connexion";
    }
    @Override
    protected String cannotFindAppClient1$str() {
        return "WFLYAC0007: L'app client %1$s est introuvable";
    }
    @Override
    protected String couldNotCreateCallbackHandler$str() {
        return "WFLYAC0022: N'a pas pu créer une instance de classe callback-handler %1$s";
    }
    @Override
    protected String duplicateSubsystemDeclaration$str() {
        return "WFLYAC0013: Dupliquer la déclaration du sous-système";
    }
    @Override
    protected String exceptionRunningAppClient$str() {
        return "WFLYAC0002: %1$s exécute main de l'app client";
    }
    @Override
    protected String cannotFindAppClientFile$str() {
        return "WFLYAC0023: L'app client %1$s est introuvable";
    }
}
