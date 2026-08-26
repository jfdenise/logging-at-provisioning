package org.jboss.as.jdr.logger;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:23+0200")
public class JdrLogger_$logger_fr extends JdrLogger_$logger implements JdrLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JdrLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String jdrConfigMessage$str() {
        return "Fichier de configuration du serveur si non en cours d'exécution.";
    }
    @Override
    protected String couldNotConfigureJDR$str() {
        return "WFLYJDR0008: N'a pas pu configurer JDR. Une étape de configuration au moins a échoué.";
    }
    @Override
    protected String jdrDescriptionMessage$str() {
        return "JBoss Diagnostic Reporter (JDR) est un sous-système créé pour récupérer des informations qui servent à la résolution de pannes. Le script jdr est un utilitaire qui génère des rapports JDR.";
    }
    @Override
    protected String noCommandsToRun$str() {
        return "WFLYJDR0009: Aucune commande JDR n'a pu être chargée. Veillez à ce qu'une classe Plugin valide ait été spécifiée dans les plugins.properties.";
    }
    @Override
    protected String jdrProtocolMessage$str() {
        return "Le protocole à utiliser pour la connexion. Peut être distante, http ou https (par défaut : http)";
    }
    @Override
    protected String jdrPortMessage$str() {
        return "port lié à l'api de gestion. (défaut : 9990)";
    }
    @Override
    protected String couldNotCreateJDRPropertiesFile$str() {
        return "WFLYJDR0012: N'a pas pu créer de fichier de propriétés JDR dans %1$s";
    }
    @Override
    protected String jdrHostnameMessage$str() {
        return "nom de l'hôte lié à l'api de gestion. (défaut : localhost)";
    }
    @Override
    protected String couldNotCreateZipfile$str() {
        return "WFLYJDR0007: N'a pas pu créer de zipfile.";
    }
    @Override
    protected String jdrHelpMessage$str() {
        return "Afficher ce message et sortir";
    }
    @Override
    protected String couldNotFindJDRPropertiesFile$str() {
        return "WFLYJDR0011: N'a pas pu trouver le fichier de propriétés JDR.";
    }
}
