package org.jboss.as.clustering.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:12+0200")
public class ClusteringLogger_$logger_fr extends ClusteringLogger_$logger implements ClusteringLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ClusteringLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String parameterValueOutOfBounds$str() {
        return "WFLYCLCOM0001: %2$g n'est pas une valeur acceptée pour le paramètre %1$s. La valeur doit être %3$s %4$g";
    }
    @Override
    protected String failedToClose$str() {
        return "WFLYCLCOM0002: N'a pas pu fermer la ressource %1$s";
    }
    @Override
    protected String attributesDoNotSupportNegativeValues$str() {
        return "WFLYCLCOM0003: Les attributs suivants ne supportent pas les valeurs négatives : %1$s";
    }
    @Override
    protected String attributesDoNotSupportZeroValues$str() {
        return "WFLYCLCOM0004: Les attributs suivants ne supportent pas les valeurs zéro : %1$s";
    }
    @Override
    protected String rejectedMultipleValues$str() {
        return "WFLYCLCOM0005: L'hôte hérité ne prend pas en charge les valeurs multiples pour les attributs : %1$s";
    }
    @Override
    protected String attributeIgnored$str() {
        return "WFLYCLCOM0006: L'attribut « %1$s » de l'élément « %2$s » n'est plus pris en charge et sera ignoré";
    }
    @Override
    protected String elementIgnored$str() {
        return "WFLYCLCOM0007: L'élément '%1$s' n'est plus pris en charge et sera ignoré";
    }
    @Override
    protected String operationNotSupportedInNormalServerMode$str() {
        return "WFLYCLCOM0008: %1$sL'opération%2$s n'est possible qu'en mode administrateur seul.";
    }
}
