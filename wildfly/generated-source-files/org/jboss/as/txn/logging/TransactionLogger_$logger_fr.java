package org.jboss.as.txn.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:53+0200")
public class TransactionLogger_$logger_fr extends TransactionLogger_$logger implements TransactionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public TransactionLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String syncsnotallowed$str() {
        return "WFLYTX0029: Les syncs ne peuvent pas être enregistrées quand le tx est dans un état %1$s";
    }
    @Override
    protected String cannotFindOrImportInflowTransaction$str() {
        return "WFLYTX0035: Impossible de trouver ou d'importer une transaction de flux interne pour xid %1$s et work %2$s";
    }
    @Override
    protected String startFailure$str() {
        return "WFLYTX0008: Échec du démarrage";
    }
    @Override
    protected String onlyOneCanBeTrue$str() {
        return "WFLYTX0033: Un seul %1$s ou %2$s peut être sur 'true'.";
    }
    @Override
    protected String mustBeDefinedIfTrue$str() {
        return "WFLYTX0032: %1$s doit être défini si %2$s est sur 'true'.";
    }
    @Override
    protected String importedInflowTransactionIsInactive$str() {
        return "WFLYTX0036: La transaction d'entrée de Jakarta Connectors importée avec xid %1$s du flux de travail %2$s est inactive";
    }
    @Override
    protected String eitherTrueOrDefined$str() {
        return "WFLYTX0025: %1$s doit être sur 'true' ou %2$s doit être défini.";
    }
    @Override
    protected String noActiveTransactionToRegisterSynchronization$str() {
        return "WFLYTX0040: Il n'y a pas de transaction active dans le contexte actuel pour enregistrer la synchronisation '%1$s'";
    }
    @Override
    protected String jcaSyncAfterCompletionFailed$str() {
        return "WFLYTX0028: La synchronisation de Jakarta Connectors %1$s associée au tx %2$s a échoué après que l’exécution ait été terminée";
    }
    @Override
    protected String createFailed$str() {
        return "WFLYTX0004: Création échouée";
    }
    @Override
    protected String mustBedefinedIfDefined$str() {
        return "WFLYTX0024: %1$s doit être défini si %2$s est défini.";
    }
    @Override
    protected String cannotResumeInflowTransactionUnexpectedError$str() {
        return "WFLYTX0037: Une erreur inattendue est survenue lors de la reprise de la transaction %1$s pour work %2$s";
    }
    @Override
    protected String unableToSuspendInboundTransactionContext$str() {
        return "WFLYTX0044: InboundTransactionCurrentImpl ne peut pas suspendre le contexte de transaction entrante";
    }
    @Override
    protected String transactionStillOpen$str() {
        return "WFLYTX0003: ERREUR D'APPLICATION : transaction toujours active dans la requête avec le statut %1$s";
    }
    @Override
    protected String unableToRollBack$str() {
        return "WFLYTX0001: Impossible de restaurer la transaction active";
    }
    @Override
    protected String unableToGetTransactionStatus$str() {
        return "WFLYTX0002: Impossible d'obtenir l'état de la transaction";
    }
    @Override
    protected String objectStoreStartFailure$str() {
        return "WFLYTX0006: Échec de la configuration du bean du navigateur du store d'objets";
    }
    @Override
    protected String inconsistentStatisticsSettings$str() {
        return "WFLYTX0012: Les attributs %1$s et %2$s sont différents; ils ne peuvent pas être définis avec des valeurs qui entrent en conflit.";
    }
    @Override
    protected String nodeIdentifierIsSetToDefault$str() {
        return "WFLYTX0013: L'attribut %1$s sur %2$s est défini sur la valeur par défaut, ce qui constitue un risque pour les environnements qui exécutent plusieurs serveurs. Veillez à ce que cet attribut soit bien unique.";
    }
    @Override
    protected String unableToDetermineInboundTransactionContext$str() {
        return "WFLYTX0043: InboundTransactionCurrentImpl ne parvient pas à déterminer le contexte de la transaction entrante";
    }
    @Override
    protected String preJcaSyncAfterCompletionFailed$str() {
        return "WFLYTX0027: La synchronisation pre-Jakarta %1$s associée au tx %2$s a échoué après que l'exécution ait été terminée";
    }
    @Override
    protected String unknownMetric$str() {
        return "WFLYTX0009: Métrique %1$s inconnue";
    }
    @Override
    protected String mustBeUndefinedIfTrue$str() {
        return "WFLYTX0023: %1$s ne doit pas être défini si %2$s est sur 'true'.";
    }
    @Override
    protected String jndiNameInvalidFormat$str() {
        return "WFLYTX0015: Les noms jndi doivent commencer par java:/ ou java:jboss/";
    }
    @Override
    protected String transactionNotFound$str() {
        return "WFLYTX0026: La transaction %1$s n'a pas pu être supprimée du cache lors du nettoyage.";
    }
    @Override
    protected String cannotSuspendInflowTransactionUnexpectedError$str() {
        return "WFLYTX0038: Une erreur inattendue est survenue lors de l'arrêt de la transaction pour work %1$s";
    }
    @Override
    protected String unsupportedAttribute$str() {
        return "WFLYTX0031: L'attribut '%1$s' n'est plus pris en charge";
    }
    @Override
    protected String transactionDiscoveryError$str() {
        return "WFLYTX0042: Erreur de découverte de transaction";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYTX0030: Les ressources enfants indexées peuvent uniquement être enregistrées si la ressource parent prend en charge les enfants ordonnés. Le parent de '%1$s' n'est pas indexé";
    }
    @Override
    protected String jmxSubsystemNotInstalled$str() {
        return "WFLYTX0010: Le service MBean Server n'est pas installé, cette fonctionnalité n'est pas disponible si le sous-système JMX n'a pas été installé.";
    }
    @Override
    protected String objectStoreRelativeToIsSetToDefault$str() {
        return "WFLYTX0034: relative_to property de l' object-store est défini à la valeur par défaut avec jboss.server.data.dir";
    }
    @Override
    protected String timeoutValueIsSetToMaximum$str() {
        return "WFLYTX0039: Une valeur de zéro n'est pas autorisée pour le délai d'attente maximum, c'est pourquoi le délai d'attente a été défini sur %1$s";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYTX0007: Service non démarré";
    }
    @Override
    protected String jmxError$str() {
        return "WFLYTX0041: Erreur JMX : %1$s";
    }
    @Override
    protected String cannotRegister$str() {
        return "WFLYTX0045: Impossible d'enregistrer la référence initiale pour l'implémentation InboundTransactionCurrent";
    }
    @Override
    protected String managerStartFailure$str() {
        return "WFLYTX0005: Échec de la création du gestionnaire %1$s";
    }
}
