package org.jboss.as.pojo.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:09+0200")
public class PojoLogger_$logger_de extends PojoLogger_$logger implements PojoLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PojoLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String oldNamespace$str() {
        return "WFLYPOJO0001: Veralteten Bean/Pojo-Namespace %1$s gefunden - es könnten xml-Features fehlen (potenzielle Ausnahmen).";
    }
    @Override
    protected String ignoreUninstallError$str() {
        return "WFLYPOJO0002: Ignoriere uninstall-Aktion an Ziel: %1$s";
    }
    @Override
    protected String invokingCallback$str() {
        return "WFLYPOJO0003: Fehler beim Aufruf von callback: %1$s";
    }
    @Override
    protected String errorAtIncallback$str() {
        return "WFLYPOJO0004: Fehler beim Aufruf von incallback: %1$s";
    }
    @Override
    protected String errorAtUncallback$str() {
        return "WFLYPOJO0005: Fehler beim Aufruf von uncallback: %1$s";
    }
    @Override
    protected String noModuleFound$str() {
        return "WFLYPOJO0006: Abruf von Modulanhang für %1$s fehlgeschlagen";
    }
    @Override
    protected String missingReflectionIndex$str() {
        return "WFLYPOJO0007: Fehlender Deploymentreflexionsindex für %1$s";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYPOJO0008: Parsen von POJO-XML [ %1$s ] fehlgeschlagen";
    }
    @Override
    protected String cannotInstantiateCollection$str() {
        return "WFLYPOJO0010: Kann neue Collection-Instanz nicht instantiieren.";
    }
    @Override
    protected String cannotInstantiateMap$str() {
        return "WFLYPOJO0011: Kann neue Map-Instanz nicht instantiieren.";
    }
    @Override
    protected String tooDynamicFromFactory$str() {
        return "WFLYPOJO0012: Zu dynamisch für die Bestimmung des eingespeisten Typs von der Factory!";
    }
    @Override
    protected String tooDynamicFromDependency$str() {
        return "WFLYPOJO0013: Zu dynamisch für die Bestimmung des eingespeisten Typs von der Dependency!";
    }
    @Override
    protected String notValueConfig$str() {
        return "WFLYPOJO0014: Vorheriger Knoten ist keine Wertekonfiguration: %1$s";
    }
    @Override
    protected String nullFactoryMethod$str() {
        return "WFLYPOJO0015: Null Factory-Methode!";
    }
    @Override
    protected String nullBeanInfo$str() {
        return "WFLYPOJO0016: Null Bean Info!";
    }
    @Override
    protected String invalidMatchSize$str() {
        return "WFLYPOJO0017: Ungültige Anzahl von Instanzen stimmt überein: %1$s, Typ: %2$s";
    }
    @Override
    protected String cannotDetermineInjectedType$str() {
        return "WFLYPOJO0018: Kann eingespeisten Typ nicht bestimmen: %1$s. Versuchen Sie, das Klassenattribut einzustellen (falls verfügbar).";
    }
    @Override
    protected String nullOrEmptyAlias$str() {
        return "WFLYPOJO0019: Null oder leerer Alias.";
    }
    @Override
    protected String nullOrEmptyDependency$str() {
        return "WFLYPOJO0020: Null oder leere Dependency.";
    }
    @Override
    protected String missingValue$str() {
        return "WFLYPOJO0021: Fehlender Wert";
    }
    @Override
    protected String nullValue$str() {
        return "WFLYPOJO0022: Nullwert";
    }
    @Override
    protected String nullName$str() {
        return "WFLYPOJO0023: Nullname";
    }
    @Override
    protected String nullMethodName$str() {
        return "WFLYPOJO0024: Null-Methodenname!";
    }
    @Override
    protected String unknownType$str() {
        return "WFLYPOJO0025: Unbekannter Typ: %1$s";
    }
    @Override
    protected String illegalParameterLength$str() {
        return "WFLYPOJO0026: Unzulässige Parameterlänge: %1$s";
    }
    @Override
    protected String missingFactoryMethod$str() {
        return "WFLYPOJO0027: Fehlende Factory-Methode in ctor-Konfiguration: %1$s";
    }
    @Override
    protected String missingBeanInfo$str() {
        return "WFLYPOJO0028: Fehlende Bean-Info, Klassenattribut des Beans festlegen: %1$s";
    }
    @Override
    protected String wrongTypeSize$str() {
        return "WFLYPOJO0029: Falsche Typengröße, stimmt nicht mit Parametern überein!";
    }
    @Override
    protected String nullClassInfo$str() {
        return "WFLYPOJO0030: Null ClassInfo!";
    }
    @Override
    protected String ctorNotFound$str() {
        return "WFLYPOJO0031: Kein solcher Constructor: %1$s für Klasse %2$s.";
    }
    @Override
    protected String methodNotFound$str() {
        return "WFLYPOJO0032: Methode nicht gefunden %1$s%2$s für Klasse %3$s.";
    }
    @Override
    protected String getterNotFound$str() {
        return "WFLYPOJO0033: Kein solcher Getter: %1$s an Klasse %2$s.";
    }
    @Override
    protected String setterNotFound$str() {
        return "WFLYPOJO0034: Kein solcher Setter: %1$s an Klasse %2$s.";
    }
    @Override
    protected String ambiguousMatch1$str() {
        return "WFLYPOJO0035: Missverständliche Übereinstimmung %1$s.";
    }
    @Override
    protected String ambiguousMatch3$str() {
        return "WFLYPOJO0036: Missverständliche Übereinstimmung %1$s für Name %2$s an Klasse %3$s.";
    }
    @Override
    protected String fieldNotFound$str() {
        return "WFLYPOJO0037: Feld nicht gefunden %1$s für Klasse %2$s.";
    }
    @Override
    protected String parsingException$str() {
        return "WFLYPOJO0038: Ausnahme während des Parsens von POJO-Deskriptor-Datei: %1$s";
    }
    @Override
    protected String cannotDetermineType$str() {
        return "WFLYPOJO0039: Typ kann nicht ermittelt werden – unzureichende Informationen zur Konfiguration!";
    }
}
