package org.jboss.as.jaxrs.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:48+0200")
public class JaxrsLogger_$logger_fr extends JaxrsLogger_$logger implements JaxrsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JaxrsLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String classAnnotationNotFound$str() {
        return "WFLYRS0001: L'annotation %1$s n'est pas sur la Classe : %2$s";
    }
    @Override
    protected String classOrMethodAnnotationNotFound$str() {
        return "WFLYRS0002: L'annotation %1$s n'est pas sur la Classe ou la Méthode : %2$s";
    }
    @Override
    protected String moreThanOneServletMapping$str() {
        return "WFLYRS0003: Plus d'un mappage trouvé pour la servlet Jakarta RESTful Web Services : %1$s le deuxième mappage %2$s ne fonctionnera pas";
    }
    @Override
    protected String cannotLoadApplicationClass$str() {
        return "WFLYRS0006: Impossible de charger la classe d’application de services Jakarta RESTful Web";
    }
    @Override
    protected String typeNameNotAnEjbView$str() {
        return "WFLYRS0010: Ressource de services Web RESTful de Jakarta%1$s ne correspond pas à une vue sur Jakarta Enterprise Beans%2$s Les annotations @Path ne peuvent être placées que sur des classes ou des interfaces qui représentent une vue locale, distante ou sans interface d'un bean Jakarta Enterprise Beans.";
    }
    @Override
    protected String invalidParamValue$str() {
        return "WFLYRS0011: Valeur non valide pour le paramètre %1$s : %2$s";
    }
    @Override
    protected String noSpringIntegrationJar$str() {
        return "WFLYRS0012: Pas de jar Spring intégration trouvé";
    }
    @Override
    protected String disablePropertyDeprecated$str() {
        return "WFLYRS0013: Le param de contecte org.jboss.as.jaxrs.disableSpringIntegration est déprécié, et devra être supprimé dans une prochaine version. Veuillez utiliser org.jboss.as.jaxrs.enableSpringIntegration à la place";
    }
    @Override
    protected String failedToRegisterManagementViewForRESTResources$str() {
        return "WFLYRS0014: N'a pas pu enregistrer la vue de gestion de la classe de ressource REST: %1$s";
    }
    @Override
    protected String noServletDeclaration$str() {
        return "WFLYRS0015: Aucune déclaration de servlet trouvée pour l'application Jakarta RESTful Web Services.  Dans %1$s, vous devez fournir une classe qui étend jakarta.ws.rs.core.Application ou déclarer une classe de servlet dans le fichier web.xml.";
    }
    @Override
    protected String resteasyVersion$str() {
        return "WFLYRS0016: RESTEasy version %1$s";
    }
    @Override
    protected String failedToReadAttribute$str() {
        return "WFLYRS0017: Échec de la lecture de l'attribut du déploiement de services Jakarta RESTful Web à %1$savec le nom %2$s";
    }
    @Override
    protected String jacksonAnnotationDetected$str() {
        return "WFLYRS0018: Utilisation explicite de l'annotation Jackson dans un déploiement de Jakarta RESTful Web Services ; le système désactivera le traitement de Jakarta JSON Binding pour le déploiement actuel. Envisagez de définir la propriété '%1$s' à 'false' pour restaurer Jakarta JSON Binding.";
    }
    @Override
    protected String paramConverterFailed$str() {
        return "WFLYRS0019: Erreur de conversion de la valeur par défaut %1$s pour le paramètre %2$s dans la méthode %3$s en utilisant le convertisseur de paramètre %4$s. Exception: %5$s : %6$s";
    }
    @Override
    protected String baseTypeMethodFailed$str() {
        return "WFLYRS0020: \"Erreur de conversion de la valeur par défaut %1$s pour le paramètre %2$s dans la méthode %3$s en utilisant la méthode %4$s. Exception: %5$s : %6$s\"";
    }
    @Override
    protected String classIntrospectionFailure$str() {
        return "WFLYRS0021: %1$s %2$s";
    }
    @Override
    protected String tracingEnabled$str() {
        return "WFLYRS0029: L'API de traçage RESTEasy a été activée pour le déploiement \"%1$s\" et n'est pas destinée à la production.";
    }
    @Override
    protected String invalidConfigurationFactory$str() {
        return "WFLYRS0030: ConfigurationFactory non valide trouvée %1$s";
    }
    @Override
    protected String failedToLoadConfigurationFactory$str() {
        return "WFLYRS0031: Échec du chargement de la configuration du micro-profil RESTEasy : %1$s";
    }
}
