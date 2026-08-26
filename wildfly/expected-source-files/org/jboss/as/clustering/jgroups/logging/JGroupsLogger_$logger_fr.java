package org.jboss.as.clustering.jgroups.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:30+0200")
public class JGroupsLogger_$logger_fr extends JGroupsLogger_$logger implements JGroupsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JGroupsLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYCLJG0001: Activation du sous-système JGroups. Version de JGroups %1$s";
    }
    @Override
    protected String parserFailure$str() {
        return "WFLYCLJG0007: N'a pas pu traiter %1$s";
    }
    @Override
    protected String notFound$str() {
        return "WFLYCLJG0008: N'a pu localiser %1$s";
    }
    @Override
    protected String transportNotDefined$str() {
        return "WFLYCLJG0010: Le transport de la pile %1$s n'est pas défini. Veuillez spécifier un transport et une liste de protocoles, soit en tant que paramètres facultatifs dans la méthode add() ou via le traitement par lots.";
    }
    @Override
    protected String unknownMetric$str() {
        return "WFLYCLJG0015: Métrique %1$s inconnue";
    }
    @Override
    protected String unableToLoadProtocolClass$str() {
        return "WFLYCLJG0016: Impossible de charger la classe du protocole %1$s";
    }
    @Override
    protected String keyEntryNotFound$str() {
        return "WFLYCLJG0022: %1$s entrée non trouvée dans le key store configuré";
    }
    @Override
    protected String unexpectedKeyStoreEntryType$str() {
        return "WFLYCLJG0023: L'entrée dans les key store %2$sn'est pas du type attendu : %1$s";
    }
    @Override
    protected String unexpectedCredentialSource$str() {
        return "WFLYCLJG0025: Identifiants configurés ne référençant pas de mot de passe identifiant en texte clair";
    }
    @Override
    protected String failedToResolveSocketBinding$str() {
        return "WFLYCLJG0028: Impossible de résoudre l'adresse de destination pour la liaison du socket sortant nommé '%1$s'";
    }
    @Override
    protected String legacyProtocol$str() {
        return "WFLYCLJG0030: Protocol %1$s est obsolète et sera automatiquement mis à jour à %2$s";
    }
    @Override
    protected String unrecognizedProtocolProperty$str() {
        return "WFLYCLJG0031: Ignorer les propriétés %1$s non reconnues : %2$s";
    }
    @Override
    protected String connecting$str() {
        return "WFLYCLJG0032: Connexion du canal '%1$s'. '%2$s' rejoignant le cluster '%3$s' via %4$s";
    }
    @Override
    protected String connected$str() {
        return "WFLYCLJG0033: Canal connecté '%1$s'. '%2$s' a rejoint le cluster '%3$s' avec affichage : %4$s";
    }
    @Override
    protected String disconnecting$str() {
        return "WFLYCLJG0034: Déconnexion du canal '%1$s'. '%2$s' quitte le groupe '%3$s' avec affichage : %4$s";
    }
    @Override
    protected String disconnected$str() {
        return "WFLYCLJG0035: Déconnecté '%1$s' canal. '%2$s' cluster de gauche '%3$s'";
    }
}
