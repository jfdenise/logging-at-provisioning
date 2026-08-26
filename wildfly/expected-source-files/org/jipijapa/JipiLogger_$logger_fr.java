package org.jipijapa;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:36+0200")
public class JipiLogger_$logger_fr extends JipiLogger_$logger implements JipiLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JipiLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotLoadEntityClass$str() {
        return "JIPI020200: N'a pas pu charger la classe d'entité '%1$s', cette erreur sera donc ignorée et le déploiement de l'application procédera";
    }
    @Override
    protected String cannotChangeInputStream$str() {
        return "JIPI020201: Ne peut pas changer la référence du flux d'entrée.";
    }
    @Override
    protected String emptyParameter$str() {
        return "JIPI020202: Le paramètre %1$s est vide";
    }
    @Override
    protected String missingPersistenceUnitMetadata$str() {
        return "JIPI020203: PersistenceUnitMetadata manquante (thread local non défini)";
    }
    @Override
    protected String notYetImplemented$str() {
        return "JIPI020204: Pas encore implémenté";
    }
    @Override
    protected String nullVar$str() {
        return "JIPI020205: Le paramètre %1$s est null";
    }
    @Override
    protected String cannotOpenVFSStream$str() {
        return "JIPI020250: Impossible d'ouvrir l'InputStream basé VirtualFile %1$s";
    }
    @Override
    protected String uriSyntaxException$str() {
        return "JIPI020251: Erreur de syntaxe de l'URI";
    }
    @Override
    protected String cannotUseSecondLevelCache$str() {
        return "JIPI020252: cache de deuxième niveau non intégré - %1$s";
    }
}
