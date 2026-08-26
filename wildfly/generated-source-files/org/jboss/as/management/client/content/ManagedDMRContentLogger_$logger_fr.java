package org.jboss.as.management.client.content;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:29+0200")
public class ManagedDMRContentLogger_$logger_fr extends ManagedDMRContentLogger_$logger implements ManagedDMRContentLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ManagedDMRContentLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String messageDigestAlgorithmNotAvailable$str() {
        return "WFLYCNT0002: Impossible d'obtenir l'algorithme de Message Digest SHA-1";
    }
    @Override
    protected String illegalChildType$str() {
        return "WFLYCNT0003: Type d'enfant illégal %1$s -- doit correspondre à %2$s";
    }
    @Override
    protected String invalidHash$str() {
        return "WFLYCNT0001: Hachage non valide '%1$s' pour le contenu qui se trouve à l'adresse %2$s; le hachage en cours est '%3$s' -- le contenu a sans doute été mis à jour par un autre appelant ?";
    }
    @Override
    protected String illegalChildClass$str() {
        return "WFLYCNT0004: Classe de ressource enfant illégale %1$s";
    }
    @Override
    protected String noContentFoundWithHash$str() {
        return "WFLYCNT0005: Aucun contenu trouvé avec le hachage %1$s";
    }
    @Override
    protected String nullParent$str() {
        return "WFLYCNT0006: Parent null";
    }
}
