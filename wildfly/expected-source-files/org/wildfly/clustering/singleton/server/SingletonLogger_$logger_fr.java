package org.wildfly.clustering.singleton.server;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:52+0200")
public class SingletonLogger_$logger_fr extends SingletonLogger_$logger implements SingletonLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SingletonLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String startSingleton$str() {
        return "WFLYCLSN0001: Ce nœud va maintenant opérer comme fournisseur unique du service %1$s";
    }
    @Override
    protected String stopSingleton$str() {
        return "WFLYCLSN0002: Ce nœud ne peut plus opérer en tant que fournisseur unique du service %1$s";
    }
    @Override
    protected String elected$str() {
        return "WFLYCLSN0003: %1$s désigné comme fournisseur unique du service %2$s";
    }
    @Override
    protected String noResponseFromPrimary$str() {
        return "WFLYCLSN0004: Aucune réponse reçue du fournisseur principal du service %1$s, réessayer...";
    }
    @Override
    protected String serviceStartFailed$str() {
        return "WFLYCLSN0005: N'a pas pu démarrer le service %1$s";
    }
    @Override
    protected String quorumNotReached$str() {
        return "WFLYCLSN0006: Impossible d'atteindre le quorum de %2$d pour le service %1$s. Aucun fournisseur primaire unique ne sera élu.";
    }
    @Override
    protected String quorumJustReached$str() {
        return "WFLYCLSN0007: Quorum requis de %2$d pour le service %1$s atteint. Si ce cluster perd un autre membre, aucun nœud ne sera choisir pour fournir ce service.";
    }
    @Override
    protected String multiplePrimaryProvidersDetected$str() {
        return "WFLYCLSN0008: Détection de plusieurs fournisseurs primaires de services : %1$s service: %2$s";
    }
    @Override
    protected String notStarted$str() {
        return "WFLYCLSN0009: Service singleton %1$s n'est pas démarré.";
    }
    @Override
    protected String noPrimaryElected$str() {
        return "WFLYCLSN0010: Aucun nœud n'a été désigné comme fournisseur singleton du service %1$s";
    }
    @Override
    protected String invalidQuorum$str() {
        return "WFLYCLSN0011: Le quorum %1$d spécifié doit être supérieur à zéro";
    }
}
