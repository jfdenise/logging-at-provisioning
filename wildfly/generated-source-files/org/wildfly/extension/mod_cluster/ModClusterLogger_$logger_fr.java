package org.wildfly.extension.mod_cluster;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:41+0200")
public class ModClusterLogger_$logger_fr extends ModClusterLogger_$logger implements ModClusterLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ModClusterLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String ignoredAttribute$str() {
        return "WFLYMODCLS0026: L'attribut '%1$s' de l'élément '%2$s' n'est plus pris en charge et sera ignoré.";
    }
    @Override
    protected String errorLoadingModuleForCustomMetric$str() {
        return "WFLYMODCLS0023: Module de chargement des erreurs '%1$s' pour charger des métriques personnalisées.";
    }
    @Override
    protected String ignoredElement$str() {
        return "WFLYMODCLS0025: L'élément '%1$s' n'est plus pris en charge et sera ignoré.";
    }
    @Override
    protected String multicastInterfaceNotAvailable$str() {
        return "WFLYMODCLS0004: Mod_cluster a besoin d'annoncer mais l'interface Multicast n'est pas disponible.";
    }
    @Override
    protected String errorAddingMetrics$str() {
        return "WFLYMODCLS0001: Erreur d'ajout de métriques.";
    }
    @Override
    protected String contextOrHostNotFound$str() {
        return "WFLYMODCLS0011: Hôte virtuel « %1$s » ou contexte « %2$s » non trouvé.";
    }
    @Override
    protected String excludedContextsUseSlashInsteadROOT$str() {
        return "WFLYMODCLS0021: La valeur 'ROOT' pour les contenus exclus est obsolète. Pour exclure le contexte racine, utilisez plutôt '/'.";
    }
    @Override
    protected String excludedContextsWrongFormat$str() {
        return "WFLYMODCLS0019: '%1$s' n'est pas une valeur valide pour les contenus exclus.";
    }
    @Override
    protected String errorApplyingMetricProperties$str() {
        return "WFLYMODCLS0006: Erreur d'application des propriétés pour charger la classe de métrique '%1$s'. Le métrique ne sera pas téléchargé.";
    }
    @Override
    protected String usingSimpleLoadProvider$str() {
        return "WFLYMODCLS0005: Aucun fournisseur de facteur d'équilibrage de charge mod_cluster spécifié pour le proxy'%1$s' en utilisant le fournisseur de facteur d'équilibrage de charge avec un facteur constant de '1'.";
    }
}
