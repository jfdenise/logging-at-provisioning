package org.wildfly.extension.core.management.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:11+0200")
public class CoreManagementLogger_$logger_fr extends CoreManagementLogger_$logger implements CoreManagementLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public CoreManagementLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String errorToInstantiateClassInstanceFromModule$str() {
        return "WFLYCM0008: Erreur d'instanciation de l'instance de la classe %1$s du module %2$s";
    }
    @Override
    protected String processStateInitError$str() {
        return "WFLYCM0002: Erreur lors de l'initialisation du listener d'état de processus %1$s";
    }
    @Override
    protected String processStateCleanupError$str() {
        return "WFLYCM0005: Erreur lors du nettoyage du listener d'état de processus %1$s";
    }
    @Override
    protected String processStateInvokationError$str() {
        return "WFLYCM0003: Erreur d'invocation de listener d’état de processus %1$s";
    }
    @Override
    protected String testOutputNumberOfClassesScanned$str() {
        return "WFLYCM0016: %1$d";
    }
    @Override
    protected String errorToLoadModule$str() {
        return "WFLYCM0006: Erreur lors du chargement du module %1$s";
    }
    @Override
    protected String classUsesAnnotatedAnnotations$str() {
        return "WFLYCM0015: Classe %1$s est annoté avec une ou plusieurs annotations qui à leur tour ont été annotées avec des annotations indiquant une API instable : %2$s";
    }
    @Override
    protected String classReferencesFieldWithUnstableApiAnnotations$str() {
        return "WFLYCM0012: %1$s champ de références%2$s .%3$s qui a été annoté avec %4$s";
    }
    @Override
    protected String classImplementsInterfaceWithUnstableApiAnnotations$str() {
        return "WFLYCM0011: %1$s outils%2$s qui a été annoté avec %3$s";
    }
    @Override
    protected String classExtendsClassWithUnstableApiAnnotations$str() {
        return "WFLYCM0010: %1$s s'étend%2$s qui a été annoté avec %3$s";
    }
    @Override
    protected String classReferencesMethodWithUnstableApiAnnotations$str() {
        return "WFLYCM0013: %1$s méthode des références%2$s .%3$s%4$s qui a été annoté avec %5$s";
    }
    @Override
    protected String errorToLoadModuleClass$str() {
        return "WFLYCM0007: Erreur lors du chargement de la classe %1$s du module %2$s";
    }
    @Override
    protected String processStateTimeoutError$str() {
        return "WFLYCM0004: L'écouteur de l'état du processus %1$s a pris trop de temps pour compléter sa tâche.";
    }
    @Override
    protected String deploymentContainsUnstableApiAnnotations$str() {
        return "WFLYCM0009: %1$s contient l'utilisation d'annotations qui indiquent une API instable.";
    }
    @Override
    protected String classReferencesClassWithUnstableApiAnnotations$str() {
        return "WFLYCM0014: %1$s classe de références%2$s qui a été annoté avec %3$s";
    }
}
