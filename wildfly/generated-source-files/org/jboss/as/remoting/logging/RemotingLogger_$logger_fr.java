package org.jboss.as.remoting.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:48+0200")
public class RemotingLogger_$logger_fr extends RemotingLogger_$logger implements RemotingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public RemotingLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYRMT0029: L'utilisation des domaines de sécurité au moment de l'exécution n'est pas prise en charge.";
    }
    @Override
    protected String endpointEmpty$str() {
        return "WFLYRMT0006: Le point de terminaison est null";
    }
    @Override
    protected String invalidQOPV$str() {
        return "WFLYRMT0016: Valeur QOP non valide : %1$s";
    }
    @Override
    protected String addingIOSubsystem$str() {
        return "WFLYRMT0024: Le sous-système distant est présent mais aucun sous-système d'entrée et sortie n'a été trouvé. Un sous-système d'entrée et sortie n'était pas requis lorsque le schéma '%1$s' distant était actuel, mais il l'est désormais. Un sous-système par défaut a donc été ajouté.";
    }
    @Override
    protected String illegalStrength$str() {
        return "WFLYRMT0020: Chaîne de Strength (puissance) '%1$s' non valide";
    }
    @Override
    protected String failedToObtainSSLContext$str() {
        return "WFLYRMT0027: N'a pas pu obtenir un SSLContext";
    }
    @Override
    protected String couldNotStart$str() {
        return "WFLYRMT0005: N'a pas pu démarrer les services";
    }
    @Override
    protected String couldNotRemoveResource$str() {
        return "WFLYRMT0025: Impossible de supprimer %1$s car JMX l'utilise comme point de terminaison distant";
    }
    @Override
    protected String invalidOption$str() {
        return "WFLYRMT0028: Option '%1$s' non valide.";
    }
    @Override
    protected String couldNotCreateURI$str() {
        return "WFLYRMT0018: N'a pas pu créer un URI valide à partir de %1$s -- %2$s";
    }
    @Override
    protected String couldNotStartChanelListener$str() {
        return "WFLYRMT0002: N'a pas pu démarrer le listener de réseau";
    }
    @Override
    protected String couldNotBindToSocket$str() {
        return "WFLYRMT0004: %1$s";
    }
    @Override
    protected String warningOnWorkerChange$str() {
        return "WFLYRMT0026: Le changement du worker en '%1$s' dans le remoting pourrait nécessiter le même changement dans les ressources liées en fonction du remoting et de la définition des listeners http(s).";
    }
    @Override
    protected String listeningOnSocket$str() {
        return "WFLYRMT0001: En écoute sur %1$s";
    }
    @Override
    protected String workerConfigurationIgnored$str() {
        return "WFLYRMT0022: La configuration de l'employé n'est plus utilisée, veuillez utiliser la configuration de l'employé du point de terminaison";
    }
    @Override
    protected String upgradeRequestMissingKey$str() {
        return "WFLYRMT0021: Sec-JbossRemoting-Key header manque à la requête de mise à niveau HTTP";
    }
    @Override
    protected String workerThreadsEndpointConfigurationChoiceRequired$str() {
        return "WFLYRMT0023: Uniquement une configuration '%1$s' ou '%2$s' est autorisée";
    }
    @Override
    protected String invalidStrength$str() {
        return "WFLYRMT0017: Valeur de Strength (puissance) non valide : %1$s";
    }
}
