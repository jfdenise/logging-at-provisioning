package org.wildfly.extension.core.management.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:11+0200")
public class CoreManagementLogger_$logger_de extends CoreManagementLogger_$logger implements CoreManagementLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public CoreManagementLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String errorToInstantiateClassInstanceFromModule$str() {
        return "WFLYCM0008: Fehler beim Instantiieren der Instanz von Klasse %1$s aus Modul '%2$s";
    }
    @Override
    protected String processStateInitError$str() {
        return "WFLYCM0002: Fehler beim Initialisieren des Prozess-Status-Listeners %1$s";
    }
    @Override
    protected String processStateCleanupError$str() {
        return "WFLYCM0005: Fehler beim Bereinigen für Prozess-Status-Listener %1$s";
    }
    @Override
    protected String processStateInvokationError$str() {
        return "WFLYCM0003: Fehler beim Aufrufen des Prozess-Status-Listeners %1$s";
    }
    @Override
    protected String testOutputNumberOfClassesScanned$str() {
        return "WFLYCM0016: %1$d";
    }
    @Override
    protected String errorToLoadModule$str() {
        return "WFLYCM0006: Fehler beim Laden von Modul %1$s";
    }
    @Override
    protected String classUsesAnnotatedAnnotations$str() {
        return "WFLYCM0015: Klasse %1$s ist mit einer oder mehreren Annotationen versehen, die wiederum Annotationen enthalten, die auf eine instabile API hinweisen: %2$s";
    }
    @Override
    protected String classReferencesFieldWithUnstableApiAnnotations$str() {
        return "WFLYCM0012: %1$s verweist auf das Feld %2$s.%3$s mit der Annotation %4$s";
    }
    @Override
    protected String classImplementsInterfaceWithUnstableApiAnnotations$str() {
        return "WFLYCM0011: %1$s implementiert %2$s mit der Annotation %3$s";
    }
    @Override
    protected String classExtendsClassWithUnstableApiAnnotations$str() {
        return "WFLYCM0010: %1$s erweitert %2$s mit der Annotation %3$s";
    }
    @Override
    protected String classReferencesMethodWithUnstableApiAnnotations$str() {
        return "WFLYCM0013: %1$s verweist auf die Methode %2$s.%3$s%4$s mit der Annotation %5$s";
    }
    @Override
    protected String errorToLoadModuleClass$str() {
        return "WFLYCM0007: Fehler beim Laden von Klasse %1$s aus Modul %2$s";
    }
    @Override
    protected String processStateTimeoutError$str() {
        return "WFLYCM0004: Der Abschluss des Prozess-Status-Listeners %1$s dauerte zu lange.";
    }
    @Override
    protected String deploymentContainsUnstableApiAnnotations$str() {
        return "WFLYCM0009: %1$s umfasst die Verwendung von Annotationen, die auf eine instabile API hinweisen.";
    }
    @Override
    protected String classReferencesClassWithUnstableApiAnnotations$str() {
        return "WFLYCM0014: %1$s verweist auf die Klasse %2$s mit der Annotation %3$s";
    }
}
