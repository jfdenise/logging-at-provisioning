package org.jboss.as.jsf.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:57+0200")
public class JSFLogger_$logger_fr extends JSFLogger_$logger implements JSFLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JSFLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String managedBeansConfigParseFailed$str() {
        return "WFLYJSF0004: Échec de l’analyse de %1$s, les artefacts Jakarta Server Faces définis dans ce fichier ne seront pas disponibles";
    }
    @Override
    protected String unknownJSFVersion$str() {
        return "WFLYJSF0005: Version inconnue de Jakarta Server Faces '%1$s'.  La version par défaut '%2$s' sera utilisée à la place.";
    }
    @Override
    protected String missingJSFModule$str() {
        return "WFLYJSF0006: L'emplacement de la version de Jakarta Server Faces '%1$s' manque dans le module %2$s";
    }
    @Override
    protected String activatedJSFImplementations$str() {
        return "WFLYJSF0007: A activé les implémentations suivantes de Jakarta Server Faces : %1$s";
    }
    @Override
    protected String classLoadingFailed$str() {
        return "WFLYJSF0008: Échec du chargement de la classe annotée : %1$s";
    }
    @Override
    protected String invalidAnnotationLocation$str() {
        return "WFLYJSF0009: L'annotation %1$s dans la classe %2$s est autorisée sur les classes uniquement";
    }
    @Override
    protected String invalidDefaultJSFImpl$str() {
        return "WFLYJSF0014: L'emplacement '%1$s' de l'implémentation par défaut de Jakarta Server Faces n'est pas valide";
    }
    @Override
    protected String jsfInjectionFailed$str() {
        return "WFLYJSF0016: Échec de l'injection de Jakarta Server Faces à partir du slot %1$s";
    }
    @Override
    protected String loadingJsf12$str() {
        return "WFLYJSF0017: Classes SF 1.2 détectées. Utilisation de org.jboss.as.jsf.jsf.injection.weld.weld.legacy.WeldApplicationFactoryLegacy.";
    }
    @Override
    protected String loadingJsf2x$str() {
        return "WFLYJSF0018: Classes SF 1.2 non détectées. Utilisation de org.jboss.as.jsf.jsf.injection.weld.WeldApplicationFactory.";
    }
    @Override
    protected String jsfArtifactNoDefaultConstructor$str() {
        return "WFLYJSF0019: L'artefact Jakarta Server Faces %1$s avec la classe %2$s n'a pas de constructeur par défaut, il ne sera donc pas pris en compte pour l'injection";
    }
    @Override
    protected String lazyBeanValidationEnabled$str() {
        return "WFLYJSF0020: La validation paresseuse des Java beans a été activée. Cela peut entraîner l'absence d'événements @PreDestroy lorsque les sessions web distribuées expirent.";
    }
}
