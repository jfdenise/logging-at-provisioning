package org.wildfly.core.embedded.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:18+0200")
public class EmbeddedLogger_$logger_fr extends EmbeddedLogger_$logger implements EmbeddedLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public EmbeddedLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotCreateStandaloneServer$str() {
        return "WFLYEMB0019: Impossible de créer un serveur autonome en utilisant la fabrique: %1$s";
    }
    @Override
    protected String errorCopyingFile$str() {
        return "WFLYEMB0028: Erreur lors de la copie de '%1$s' à '%2$s' (%3$s)";
    }
    @Override
    protected String cannotGetReflectiveMethod$str() {
        return "WFLYEMB0018: Impossible d'obtenir une méthode réflective '%1$s' pour : %2$s";
    }
    @Override
    protected String processIsReloading$str() {
        return "WFLYEMB0024: Le serveur intégré est en rechargement et les invocations sur le ModelControllerClient ne sont pas encore disponibles";
    }
    @Override
    protected String propertySpecifiedFileIsNotADirectory$str() {
        return "WFLYEMB0029: -D%1$s=%2$s n'est pas un répertoire";
    }
    @Override
    protected String embeddedServerDirectoryNotFound$str() {
        return "WFLYEMB0143: Aucun répertoire nommé '%1$s' n'existe sous '%2$s'";
    }
    @Override
    protected String moduleLoaderAlreadyConfigured$str() {
        return "WFLYEMB0145: Le chargeur de module a déjà été configuré. La modification de la propriété %1$s n'aura aucun effet.";
    }
    @Override
    protected String failedToRestoreContext$str() {
        return "WFLYEMB0146: N'a pas réussi à restaurer le contexte %1$s";
    }
    @Override
    protected String propertySpecifiedFileDoesNotExist$str() {
        return "WFLYEMB0144: -D%1$s=%2$s n'existe pas";
    }
    @Override
    protected String moduleLoaderError$str() {
        return "WFLYEMB0014: N'a pas pu charger le module %1$s de : %2$s";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYEMB0015: %1$s est nul";
    }
    @Override
    protected String cannotInvokeStandaloneServer$str() {
        return "WFLYEMB0022: Impossible d'invoquer '%1$s' sur processus intégré";
    }
    @Override
    protected String processIsStopped$str() {
        return "WFLYEMB0027: Le serveur intégré est interrompu et les invocations sur le ModelControllerClient ne sont pas disponibles";
    }
    @Override
    protected String cannotStartEmbeddedServer$str() {
        return "WFLYEMB0021: Impossible de démarrer le processus intégré";
    }
    @Override
    protected String cannotLoadEmbeddedServerFactory$str() {
        return "WFLYEMB0017: N'a pas pu charger fabrique de serveurs intégrée : %1$s";
    }
    @Override
    protected String cannotSetupEmbeddedServer$str() {
        return "WFLYEMB0020: Impossible d'installer le processus intégré";
    }
    @Override
    protected String invalidJBossHome$str() {
        return "WFLYEMB0011: Répertoire d'accueil JBoss non valide : %1$s";
    }
    @Override
    protected String cannotCreateHostController$str() {
        return "WFLYEMB0026: Impossible de créer un contrôleur d'hôte à l'aide de la fabrique : %1$s";
    }
    @Override
    protected String processIsStopping$str() {
        return "WFLYEMB0023: Le serveur intégré est interrompu et les invocations sur le ModelControllerClient ne sont pas disponibles";
    }
}
