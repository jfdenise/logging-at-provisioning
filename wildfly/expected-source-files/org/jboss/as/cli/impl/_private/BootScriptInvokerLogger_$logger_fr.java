package org.jboss.as.cli.impl._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:35+0200")
public class BootScriptInvokerLogger_$logger_fr extends BootScriptInvokerLogger_$logger implements BootScriptInvokerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BootScriptInvokerLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String processScript$str() {
        return "WFLYCLI0001: Traitement du script CLI %1$s";
    }
    @Override
    protected String errorProcessingScript$str() {
        return "WFLYCLI0002: Erreur de traitement du script CLI %1$s";
    }
    @Override
    protected String propertiesFileNotFound$str() {
        return "WFLYCLI0003: N'a pas pu trouver le fichier de propriétés CLI %1$s";
    }
    @Override
    protected String cliOutput$str() {
        return "WFLYCLI0004: Sortie d'exécution CLI :";
    }
    @Override
    protected String doneProcessScript$str() {
        return "WFLYCLI0005: Traitement du script CLI terminé %1$s";
    }
    @Override
    protected String executeCommand$str() {
        return "WFLYCLI0006: Exécution de la commande CLI %1$s";
    }
    @Override
    protected String unexpectedException$str() {
        return "WFLYCLI0007: Exception inattendue lors du traitement des commandes CLI à partir de %1$s";
    }
    @Override
    protected String unexpectedErrors$str() {
        return "WFLYCLI0008: Erreur de traitement du script CLI %1$s. Les opérations ont été exécutées mais il y avait des valeurs inattendues. Voir la liste des erreurs dans %2$s";
    }
    @Override
    protected String unexpectedCommandException$str() {
        return "WFLYCLI0009: Exception inattendue lors du traitement de la commande CLI %1$s de %2$s";
    }
}
