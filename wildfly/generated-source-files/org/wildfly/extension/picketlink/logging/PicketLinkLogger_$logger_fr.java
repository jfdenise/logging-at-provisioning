package org.wildfly.extension.picketlink.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:45+0200")
public class PicketLinkLogger_$logger_fr extends PicketLinkLogger_$logger implements PicketLinkLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PicketLinkLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String requiredAlternativeAttributes$str() {
        return "WFLYPL0016: [%1$s] requiert un des attributs donnés [%2$s].";
    }
    @Override
    protected String cannotMigrateNonEmptyConfiguration$str() {
        return "WFLYPL0107: Impossible de migrer une configuration non vide du sous-système picketlink-federation.";
    }
    @Override
    protected String migrationFailed$str() {
        return "WFLYPL0106: La migration a échoué, voir les résultats pour plus d'informations.";
    }
    @Override
    protected String boundToJndi$str() {
        return "WFLYPL0003: A lié [%1$s] à [%2$s]";
    }
    @Override
    protected String couldNotLoadClass$str() {
        return "WFLYPL0009: Impossible de charger la classe [%1$s].";
    }
    @Override
    protected String attributeNoLongerSupported$str() {
        return "WFLYPL0012: L'attribut [%1$s] n'est plus pris en charge.";
    }
    @Override
    protected String invalidChildTypeOccurrence$str() {
        return "WFLYPL0013: [%1$s] ne peut avoir que [%2$d] enfant de type [%3$s].";
    }
    @Override
    protected String typeAlreadyDefined$str() {
        return "WFLYPL0017: Type [%1$s] déjà défini.";
    }
    @Override
    protected String requiredAttribute$str() {
        return "WFLYPL0015: Attribut requis [%1$s] pour [%2$s].";
    }
    @Override
    protected String federationHandlerTypeNotProvided$str() {
        return "WFLYPL0101: Aucun type fourni pour le gestionnaire. Vous devez spécifier un nom de classe ou un code.";
    }
    @Override
    protected String typeNotProvided$str() {
        return "WFLYPL0010: Pas de type fourni pour %1$s. Vous devez spécifier un nom de classe ou un code.";
    }
    @Override
    protected String requiredChild$str() {
        return "WFLYPL0019: [%1$s] requiert enfant [%2$s].";
    }
    @Override
    protected String idmNoSupportedTypesDefined$str() {
        return "WFLYPL0056: Aucun type pris en charge fourni.";
    }
    @Override
    protected String idmNoIdentityConfigurationProvided$str() {
        return "WFLYPL0054: Vous devez fournir au moins une configuration d'entité.";
    }
    @Override
    protected String idmNoIdentityStoreProvided$str() {
        return "WFLYPL0055: Vous devez procurer un store d'identité au moins pour la configuration de l'identité [%1$s].";
    }
    @Override
    protected String invalidAlternativeAttributeOccurrence$str() {
        return "WFLYPL0014: Définition d'attribut [%1$s] non valide pour [%2$s]. Un seul des attributs suivants est autorisé : [%3$s].";
    }
    @Override
    protected String emptyResource$str() {
        return "WFLYPL0018: [%1$s] ne peut rester vide.";
    }
    @Override
    protected String idmLdapNoMappingDefined$str() {
        return "WFLYPL0057: Aucun mappage n'a été défini.";
    }
    @Override
    protected String moduleCouldNotLoad$str() {
        return "WFLYPL0007: Impossible de charger le module [%1$s].";
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "WFLYPL0105: Cette opération de migration ne peut pas être effectuée : le serveur doit être en mode admin uniquement";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYPL0001: Activation du sous-système PicketLink %1$s";
    }
}
