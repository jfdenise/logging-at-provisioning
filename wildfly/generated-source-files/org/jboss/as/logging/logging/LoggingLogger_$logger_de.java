package org.jboss.as.logging.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:28+0200")
public class LoggingLogger_$logger_de extends LoggingLogger_$logger implements LoggingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public LoggingLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String invalidPropertyAttribute$str() {
        return "WFLYLOG0007: Das Attribut %1$s konnte nicht festgelegt werden, da es kein konfigurierbarer Eigenschaftswert ist.";
    }
    @Override
    protected String perDeploymentPropertyDeprecated$str() {
        return "WFLYLOG0015: Die Deployment-Eigenschaft pro Protokollierung (%1$s) gilt als veraltet. Verwenden Sie das Attribut %2$s, um die Protokollierung einzelner Deployments zu aktivieren bzw. zu deaktivieren.";
    }
    @Override
    protected String loggerNotFound$str() {
        return "WFLYLOG0035: Logger '%1$s' nicht gefunden.";
    }
    @Override
    protected String unresolvablePathExpressions$str() {
        return "WFLYLOG0090: Beim Versuch zu bestimmen, welche Protokolldateien zum Lesen verfügbar sind, konnten die folgenden Pfad-Ausdrücke nicht aufgelöst werden: %1$s";
    }
    @Override
    protected String replacingNamedHandler$str() {
        return "WFLYLOG0012: Handler '%1$s' wird beim Hinzufügen ersetzt. Der Handler-Typ oder der Modulname unterscheidet sich von der Anfangskonfiguration.";
    }
    @Override
    protected String formatterNotFound$str() {
        return "WFLYLOG0061: Formatierer '%1$s' nicht gefunden";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYLOG0006: Schließen von Ressource %1$s fehlgeschlagen";
    }
    @Override
    protected String suffixContainsMillis$str() {
        return "WFLYLOG0082: Das Suffix (%1$s) kann keine Sekunden oder Millisekunden enthalten.";
    }
    @Override
    protected String invalidEscapeFoundInFilterExpression$str() {
        return "WFLYLOG0071: Ungültiges Escape-Zeichen in Filterausdruck-String gefunden";
    }
    @Override
    protected String pathManagerServiceNotStarted$str() {
        return "WFLYLOG0008: Der Pfad-Manager-Dienst wurde offenbar nicht gestartet. Sämtliche Änderungen können aufgrund dessen verloren gehen.";
    }
    @Override
    protected String deploymentNameNotFound$str() {
        return "WFLYLOG0086: Konnte Deployment-Name nicht von der Adresse %1$s bestimmen.";
    }
    @Override
    protected String handlerAttachedToHandlers$str() {
        return "WFLYLOG0044: Handler %1$s ist folgenden Handlern angehängt und kann nicht entfernt werden; %2$s";
    }
    @Override
    protected String handlerAttachedToLoggers$str() {
        return "WFLYLOG0045: Handler %1$s ist folgenden Loggers angehängt und kann nicht entfernt werden; %2$s";
    }
    @Override
    protected String invalidExceptionOutputType$str() {
        return "WFLYLOG0091: Ausgabetyp %1$s für Ausnahmen ist ungültig.";
    }
    @Override
    protected String expectedString$str() {
        return "WFLYLOG0074: Erwarteter String nächster in Filterausdruck";
    }
    @Override
    protected String invalidSuffix$str() {
        return "WFLYLOG0041: Das Suffix (%1$s) ist ungültig. Ein Suffix muss ein gültiges Datumsformat haben.";
    }
    @Override
    protected String loggingProfileNotFound$str() {
        return "WFLYLOG0010: Protokollierungsprofil '%1$s' wurde für Deployment '%2$s' festgelegt aber nicht gefunden. Systemprotokollierungskonfiguration wird verwendet.";
    }
    @Override
    protected String unknownLogManager$str() {
        return "WFLYLOG0089: Die Protokoll-Manager-Prüfung wurde übersprungen und die Protokoll-Manager-Systemeigenschaft 'java.util.logging.manager' scheint nicht auf 'org.jboss.logmanager.LogManager' festgelegt zu sein. Der derzeitige Wert ist '%1$s'. Manche Verhaltensweisen der protokollierten Ausgabe wie z.B. MDC und NDC funktionieren ggf. nicht wie erwartet.";
    }
    @Override
    protected String truncatedFilterExpression$str() {
        return "WFLYLOG0070: Abgeschnittener Filterausdruck-String";
    }
    @Override
    protected String unsupportedMethod$str() {
        return "WFLYLOG0050: Methode %1$s an Klasse %2$s wird nicht unterstützt";
    }
    @Override
    protected String failedToReadLogFile$str() {
        return "WFLYLOG0079: Protokolldatei '%1$s' kann nicht gelesen werden";
    }
    @Override
    protected String expected2$str() {
        return "WFLYLOG0075: '%1$s' oder '%2$s' als Nächstes in Filterausdruck erwartet";
    }
    @Override
    protected String cannotLoadModule$str() {
        return "WFLYLOG0019: Konnte Modul '%1$s' für %2$s '%3$s' nicht laden";
    }
    @Override
    protected String perLoggingDeploymentIgnored$str() {
        return "WFLYLOG0016: Die Deployment-Eigenschaft pro Protokollierung (%1$s) wurde ignoriert, da das Attribut %2$s festgelegt wurde, um Konfigurationsdateien im Deployment %3$s zu ignorieren.";
    }
    @Override
    protected String classNotFound$str() {
        return "WFLYLOG0021: Konnte Klasse '%1$s' nicht finden.";
    }
    @Override
    protected String invalidRelativeTo$str() {
        return "WFLYLOG0039: Es kann kein absoluter Pfad (%1$s) für 'relative-to' festgelegt werden.";
    }
    @Override
    protected String errorDeterminingChildrenExist$str() {
        return "WFLYLOG0088: Konnte nicht feststellen, ob %1$s über untergeordnete Ressourcen verfügt.";
    }
    @Override
    protected String failedToConfigureSslContext$str() {
        return "WFLYLOG0093: SSL-Kontext für %1$s %2$s konnte nicht konfiguriert werden.";
    }
    @Override
    protected String unexpectedEnd$str() {
        return "WFLYLOG0076: Unerwartetes Ende des Filterausdrucks";
    }
    @Override
    protected String invalidLogFile$str() {
        return "WFLYLOG0083: Pfad '%1$s' ist ein Verzeichnis und kann nicht als Protokolldatei verwendet werden.";
    }
    @Override
    protected String logFileNotFound$str() {
        return "WFLYLOG0080: Datei '%1$s' wurde nicht gefunden und kann im %2$s-Verzeichnis nicht gefunden werden.";
    }
    @Override
    protected String invalidLogLevel$str() {
        return "WFLYLOG0026: Protokollebene %1$s ist ungültig.";
    }
    @Override
    protected String filterNotFound$str() {
        return "WFLYLOG0072: Filter '%1$s' nicht gefunden";
    }
    @Override
    protected String invalidFilterName$str() {
        return "WFLYLOG0097: Der Name %1$s kann nicht als Filtername verwendet werden, da er ein ungültiges Zeichen %2$s enthält";
    }
    @Override
    protected String usageOfLog4j1Config$str() {
        return "WFLYLOG0100: Verwendung einer log4j-Konfigurationsdatei (%1$s) im Deployment %2$s gefunden. Die Unterstützung für log4j-Konfigurationsdateien in Deployments ist veraltet und wird in einem künftigen Release entfernt.";
    }
    @Override
    protected String invalidOverflowAction$str() {
        return "WFLYLOG0027: Überlauf-Aktion %1$s ist ungültig.";
    }
    @Override
    protected String handlerAlreadyDefined$str() {
        return "WFLYLOG0023: Handler %1$s ist bereits zugeordnet.";
    }
    @Override
    protected String expected1$str() {
        return "WFLYLOG0075: '%1$s' als Nächstes in Filterausdruck erwartet";
    }
    @Override
    protected String cannotRegisterResourceOfType$str() {
        return "WFLYLOG0084: Ressourcen vom Typ %1$s können nicht registriert werden";
    }
    @Override
    protected String failedToConfigureLogging$str() {
        return "WFLYLOG0042: Konfiguration der Protokollierung mittels der Konfigurationsdatei '%1$s' fehlgeschlagen.";
    }
    @Override
    protected String failedToWriteConfigurationFile$str() {
        return "WFLYLOG0051: Schreiben der Konfigurationsdatei %1$s fehlgeschlagen";
    }
    @Override
    protected String cannotAddHandlerToSelf$str() {
        return "WFLYLOG0046: Kann Handler (%1$s) nicht zu sich selbst hinzufügen";
    }
    @Override
    protected String expectedIdentifier$str() {
        return "WFLYLOG0073: Erwarteter Bezeichner nächster in Filterausdruck";
    }
    @Override
    protected String errorProcessingLogDirectory$str() {
        return "WFLYLOG0087: Verarbeiten von Protokollverzeichnis %1$s fehlgeschlagen. Protokolldateien können nicht aufgelistet werden.";
    }
    @Override
    protected String invalidSize$str() {
        return "WFLYLOG0028: Ungültige Größe %1$s";
    }
    @Override
    protected String handlerClosed$str() {
        return "WFLYLOG0047: Der Handler ist geschlossen, kann nicht in einem geschlossenen Handler veröffentlicht werden";
    }
    @Override
    protected String reservedFilterName$str() {
        return "WFLYLOG0095: Der Name %1$s kann nicht als Filtername verwendet werden, da es sich um einen reservierten Filternamen handelt. Reservierte Namen sind: %2$s";
    }
    @Override
    protected String handlerConfigurationNotFound$str() {
        return "WFLYLOG0048: Konfiguration für Handler '%1$s' nicht gefunden.";
    }
    @Override
    protected String replacingConfigurator$str() {
        return "WFLYLOG0013: Eine Konfiguratorklasse '%1$s' ist kein bekannter Konfigurator und wird ersetzt.";
    }
    @Override
    protected String logContextNotRemoved$str() {
        return "WFLYLOG0014: Der Protokollkontext (%1$s) für Deployment %2$s konnte nicht entfernt werden";
    }
    @Override
    protected String invalidFilter$str() {
        return "WFLYLOG0025: Filter %1$s ist ungültig";
    }
    @Override
    protected String illegalFormatterName$str() {
        return "WFLYLOG0094: Der Name des Formatierers darf nicht mit '-wfcore-pattern-formatter' enden";
    }
    @Override
    protected String invalidFilterNameStart$str() {
        return "WFLYLOG0096: Der Name %1$s kann nicht als Filtername verwendet werden, da er mit einem ungültigen Zeichen %2$s beginnt";
    }
    @Override
    protected String extensionNotInitialized$str() {
        return "WFLYLOG0078: Für das Protokollierungs-Subsystem muss der Protokollmanager org.jboss.logmanager.LogManager sein. Das Subsystem wurde nicht initialisiert und kann nicht verwendet werden. Um den JBoss Log Manager zu verwenden, müssen Sie die System-Property \"java.util.logging.manager\" hinzufügen und sie auf \"org.jboss.logmanager.LogManager\" einstellen";
    }
    @Override
    protected String julConfigurationFileFound$str() {
        return "WFLYLOG0011: Die Konfigurationsdatei in '%1$s' scheint eine J.U.L. Konfigurationsdatei zu sein. Der Protokollmanager lässt diesen Typ von Konfigurationsdatei nicht zu.";
    }
    @Override
    protected String errorProcessingLoggingConfiguration$str() {
        return "WFLYLOG0043: Fehler bei der Suche nach Protokollierungs-Konfigurationsdateien.";
    }
    @Override
    protected String usageOfAppender$str() {
        return "WFLYLOG0099: Verwendung eines log4j-Appenders (%1$s) in einem benutzerdefinierten Handler gefunden. Die Unterstützung für die Verwendung von Appendern als benutzerdefinierte Handler ist veraltet und wird in einem künftigen Release entfernt.";
    }
    @Override
    protected String loggerConfigurationNotFound$str() {
        return "WFLYLOG0049: Konfiguration für Logger '%1$s' nicht gefunden.";
    }
    @Override
    protected String readNotAllowed$str() {
        return "WFLYLOG0081: Das Lesen von Datei '%1$s' ist nicht zulässig.";
    }
    @Override
    protected String cannotRemoveResourceOfType$str() {
        return "WFLYLOG0085: Ressourcen vom Typ %1$s können nicht entfernt werden";
    }
    @Override
    protected String invalidType$str() {
        return "WFLYLOG0092: Ungültiger Typ gefunden. Erwartet wurde %1$s, gefunden wurde jedoch %2$s.";
    }
}
