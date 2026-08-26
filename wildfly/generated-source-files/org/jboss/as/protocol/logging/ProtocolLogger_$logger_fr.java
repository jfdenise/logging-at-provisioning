package org.jboss.as.protocol.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:47+0200")
public class ProtocolLogger_$logger_fr extends ProtocolLogger_$logger implements ProtocolLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ProtocolLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String invalidType3$str() {
        return "WFLYPRT0035: Type est ni %1$s ni %2$s: %3$s";
    }
    @Override
    protected String cancelledAsyncTaskBeforeRun$str() {
        return "WFLYPRT0058: %1$s tâches annulées avant le début de l'exécution";
    }
    @Override
    protected String channelTimedOut$str() {
        return "WFLYPRT0060: Votre demande de réseau a expiré";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYPRT0003: N'a pas pu fermer la ressource %1$s";
    }
    @Override
    protected String channelClosed$str() {
        return "WFLYPRT0054: Canal fermé";
    }
    @Override
    protected String errorClosingChannel$str() {
        return "WFLYPRT0001: Erreur lors de la fermeture du canal %1$s";
    }
    @Override
    protected String couldNotConnect$str() {
        return "WFLYPRT0023: N'a pas pu connecter à %1$s. La connexion a expiré";
    }
    @Override
    protected String operationIdAlreadyExists$str() {
        return "WFLYPRT0051: L'opération ayant pour id %1$d a déjà été enregistrée";
    }
    @Override
    protected String failedToConnect$str() {
        return "WFLYPRT0053: N'a pas pu connecter à %1$s. La connexion a échoué";
    }
    @Override
    protected String noSuchRequest$str() {
        return "WFLYPRT0018: Demande (%1$d) associée au canal %2$s";
    }
    @Override
    protected String nullExecutor$str() {
        return "WFLYPRT0052: Exécuteur Null";
    }
    @Override
    protected String cancelledAsyncTask$str() {
        return "WFLYPRT0057: %1$s tâches annulées en interrompant la chaîne %2$s";
    }
    @Override
    protected String responseHandlerNotFound$str() {
        return "WFLYPRT0056: Pas de contrôleur de réponse pour la requête %1$s";
    }
    @Override
    protected String noSuchResponseHandler$str() {
        return "WFLYPRT0055: Aucun handler n'a été enregistré pour ce type de requête '%1$s'.";
    }
    @Override
    protected String failedToCloseServerSocket$str() {
        return "WFLYPRT0004: N'a pas fermé le socket de serveur %1$s";
    }
    @Override
    protected String deprecatedCLIConfiguration$str() {
        return "WFLYPRT0059: Vous utilisez une méthode obsolète pour définir l'adresse de liaison du client. Veuillez utiliser le paramètre \"--bind\" sur le CLI plutôt que sur la propriété du système %1$s.";
    }
    @Override
    protected String invalidType1$str() {
        return "WFLYPRT0034: Type non valide %1$s";
    }
    @Override
    protected String invalidByteToken$str() {
        return "WFLYPRT0030: Token d'octet non valide. '%1$d' attendu '%2$d' reçu";
    }
    @Override
    protected String invalidSignature$str() {
        return "WFLYPRT0032: Signature non valide [%1$s]";
    }
}
