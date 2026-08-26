package org.jboss.as.service.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:13+0200")
public class SarLogger_$logger_fr extends SarLogger_$logger implements SarLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SarLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedExecutingLegacyMethod$str() {
        return "WFLYSAR0001: N'a pas pu exécuter la méthode %1$s du service hérité";
    }
    @Override
    protected String propertyNotFound$str() {
        return "WFLYSAR0002: Impossible de trouver le PropertyEditor pour le type %1$s";
    }
    @Override
    protected String classNotFound$str() {
        return "WFLYSAR0003: Classe non trouvée";
    }
    @Override
    protected String classNotInstantiated$str() {
        return "WFLYSAR0004: Classe non instanciée";
    }
    @Override
    protected String failedToGetAttachment$str() {
        return "WFLYSAR0005: N'a pas pu obtenir la pièce jointe %1$s pour %2$s";
    }
    @Override
    protected String failedXmlParsing$str() {
        return "WFLYSAR0006: N'a pas pu traiter le service xml [%1$s]";
    }
    @Override
    protected String methodNotFound$str() {
        return "WFLYSAR0007: Méthode '%1$s(%2$s)' non trouvée pour : %3$s";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYSAR0008: Un ou plusieurs attributs manquants :";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYSAR0009: %1$s est nul";
    }
    @Override
    protected String propertyMethodNotFound$str() {
        return "WFLYSAR0010: Méthode %1$s de propriété '%2$s' manquante pour : %3$s";
    }
    @Override
    protected String unexpectedContent$str() {
        return "WFLYSAR0011: Contenu non attendu de type '%1$s' nommé '%2$s', texte : %3$s";
    }
    @Override
    protected String failedToProcessSarChild$str() {
        return "WFLYSAR0012: N'a pas pu traiter les archives dépendantes SAR pour [%1$s]";
    }
    @Override
    protected String malformedDependencyName$str() {
        return "WFLYSAR0013: Nom de dépendance malformé %1$s";
    }
    @Override
    protected String defaultConstructorNotFound$str() {
        return "WFLYSAR0014: Impossible de trouver le constructeur par défaut pour %1$s";
    }
    @Override
    protected String mbeanRegistrationFailed$str() {
        return "WFLYSAR0015: N'a pas pu enregistrer le mbean [%1$s]";
    }
    @Override
    protected String cannotUnregisterObject$str() {
        return "WFLYSAR0016: Pas d'ObjectName disponible à dés-enregistrer";
    }
    @Override
    protected String unregistrationFailure$str() {
        return "WFLYSAR0017: N'a pas pu supprimer l'enregistrement [%1$s]";
    }
    @Override
    protected String objectSupplierNotAvailable$str() {
        return "WFLYSAR0018: Fournisseur d'objets non disponible";
    }
    @Override
    protected String objectNotAvailable$str() {
        return "WFLYSAR0019: Objet non disponible";
    }
    @Override
    protected String methodIsNotAccessible$str() {
        return "WFLYSAR0020: La méthode n'est pas accessible";
    }
    @Override
    protected String failedToInvokeMethod$str() {
        return "WFLYSAR0021: Échec de l'appel de la méthode";
    }
}
