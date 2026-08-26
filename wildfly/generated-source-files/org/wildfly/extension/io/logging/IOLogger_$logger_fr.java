package org.wildfly.extension.io.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:21+0200")
public class IOLogger_$logger_fr extends IOLogger_$logger implements IOLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public IOLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String printDefaultsIoThreads$str() {
        return "WFLYIO002: L'employé '%1$s' a configuré automatiquement les threads de tâches E/S %2$d sur la base de vos %3$d processeurs disponibles";
    }
    @Override
    protected String printDefaultsWorkerThreads$str() {
        return "WFLYIO003: L'employé '%1$s' a configuré automatiquement %2$d threads de tâches sur la base de vos %3$d processeurs disponibles";
    }
    @Override
    protected String wrongStackSize$str() {
        return "WFLYIO008: La valeur de la taille de la pile de %1$d octets pout le worker IO %2$s est faible et peut entraîner des problèmes. Une valeur d'au moins 150 000 est recommandée.";
    }
    @Override
    protected String lowGlobalFD$str() {
        return "WFLYIO005: Votre système est configuré avec %1$d décripteurs de fichier, mais la configuration actuelle de votre serveur d'application nécessite un minimum de %2$d (et probablement plus). Tout ajustement peut toutefois entraîner des instabilités, sauf si vous augmentez ce chiffre";
    }
    @Override
    protected String noMetrics$str() {
        return "WFLYIO006: aucun métrique disponible";
    }
    @Override
    protected String unexpectedBindAddressConflict$str() {
        return "WFLYIO007: Conflit d'adresses de liaison inattendu dans la ressource '%1$s' lors d'une tentative d'établissement de liaison pour la destination %2$s à %3$s : il existe déjà une liaison de %4$s";
    }
    @Override
    protected String printDefaults$str() {
        return "WFLYIO001: L'employé '%1$s' a configuré automatiquement les %2$d threads E/S avec %3$d threads de tâches maximum sur la base de vos %4$d processeurs disponibles";
    }
    @Override
    protected String lowFD$str() {
        return "WFLYIO004: L'employé '%1$s' configurerait automatiquement les threads de tâche %2$d sur la base de vos %3$d processeurs disponibles. Cependant, votre système ne possède pas suffisamment de descripteurs de fichier configurés pour prendre en charge cette configuration. Il se peut que vous rencontriez des dégradations d'application si vous ne réduisez pas la limite du descripteur de votre fichier.";
    }
}
