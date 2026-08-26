package org.jipijapa;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:36+0200")
public class JipiLogger_$logger_de extends JipiLogger_$logger implements JipiLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JipiLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotLoadEntityClass$str() {
        return "JIPI020200: Konnte Entity-Klasse '%1$s' nicht laden, ignoriere diesen Fehler und fahre fort mit dem Deployment der Applikation";
    }
    @Override
    protected String cannotChangeInputStream$str() {
        return "JIPI020201: Kann Input-Stream Referenz nicht ändern.";
    }
    @Override
    protected String emptyParameter$str() {
        return "JIPI020202: Parameter %1$s ist leer";
    }
    @Override
    protected String missingPersistenceUnitMetadata$str() {
        return "JIPI020203: Fehlende PersistenceUnitMetadata (Thread local war nicht eingestellt)";
    }
    @Override
    protected String notYetImplemented$str() {
        return "JIPI020204: Noch nicht implementiert";
    }
    @Override
    protected String nullVar$str() {
        return "JIPI020205: Parameter %1$s ist Null";
    }
    @Override
    protected String cannotOpenVFSStream$str() {
        return "JIPI020250: Kann VirtualFile-basierten InputStream nicht öffnen %1$s";
    }
    @Override
    protected String uriSyntaxException$str() {
        return "JIPI020251: URI-Syntaxfehler";
    }
    @Override
    protected String cannotUseSecondLevelCache$str() {
        return "JIPI020252: Cache der zweiten Ebene nicht integriert - %1$s";
    }
}
