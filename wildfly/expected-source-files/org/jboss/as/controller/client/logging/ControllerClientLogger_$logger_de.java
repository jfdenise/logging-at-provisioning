package org.jboss.as.controller.client.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:01+0200")
public class ControllerClientLogger_$logger_de extends ControllerClientLogger_$logger implements ControllerClientLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ControllerClientLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotAddDeploymentAction$str() {
        return "WFLYCC0001: Kann Deployment-Vorgänge nach Beginn der Erstellung eines Rollout-Plans nicht hinzufügen";
    }
    @Override
    protected String cannotAddDeploymentActionsAfterStart$str() {
        return "WFLYCC0002: Kann Deployment-Vorgänge nach Beginn der Erstellung eines Rollout-Plans nicht hinzufügen";
    }
    @Override
    protected String cannotConvert$str() {
        return "WFLYCC0003: Kann %1$s nicht in %2$s konvertieren";
    }
    @Override
    protected String cannotDeriveDeploymentName$str() {
        return "WFLYCC0004: Kann keinen Deployment-Namen von %1$s ableiten -- Verwendung von überladener Methodenvariante, die einen 'name'-Parameter annimmt";
    }
    @Override
    protected String cannotUseDeploymentPlan$str() {
        return "WFLYCC0005: Kann keinen DeploymentPlan verwenden, der nicht von diesem Manager erstellt wurde";
    }
    @Override
    protected String domainDeploymentAlreadyExists$str() {
        return "WFLYCC0007: Deployment mit Namen %1$s bereits in der Domain vorhanden";
    }
    @Override
    protected String failed$str() {
        return "WFLYCC0008: fehlgeschlagen";
    }
    @Override
    protected String globalRollbackNotCompatible$str() {
        return "WFLYCC0009: Globaler Rollback ist nicht kompatibel mit einem Server Neustart";
    }
    @Override
    protected String gracefulShutdownAlreadyConfigured$str() {
        return "WFLYCC0010: Shutdown bereits mit einem Timeout von %1$d ms konfiguriert";
    }
    @Override
    protected String incompleteDeploymentReplace$str() {
        return "WFLYCC0011: Nur eine Version von Deployment mit einem bestimmten eindeutigen Namen kann in der Domain existieren. Der Deployment-Plan legt fest, dass eine neue Version von Deployment %1$s ein bestehendes Deployment mit demselben eindeutigen Namen ersetzte, aber den Ersatz nicht an allen Servergruppen anwendete. Die fehlenden Servergruppen waren: %2$s";
    }
    @Override
    protected String invalidActionType$str() {
        return "WFLYCC0012: Ungültiger Vorgangstyp %1$s";
    }
    @Override
    protected String invalidPrecedingAction$str() {
        return "WFLYCC0013: Vorangegangener Vorgang war kein %1$s";
    }
    @Override
    protected String invalidUri$str() {
        return "WFLYCC0014: %1$s ist keine gültige URI";
    }
    @Override
    protected String invalidValue3$str() {
        return "WFLYCC0015: Unzulässiger %1$s Wert %2$d -- muss größer als %3$d sein";
    }
    @Override
    protected String invalidValue4$str() {
        return "WFLYCC0016: Unzulässiger %1$s Wert %2$d -- muss größer als %3$d und kleiner als %4$d sein";
    }
    @Override
    protected String maxDisplayUnitLength$str() {
        return "WFLYCC0017: Bildschirmplatz ist teuer; displayUnits müssen 5 Zeichen oder weniger umfassen";
    }
    @Override
    protected String noFailureDetails$str() {
        return "WFLYCC0019: Keine Fehlerinformationen angegeben";
    }
    @Override
    protected String notConfigured$str() {
        return "WFLYCC0020: Kein %1$s konfiguriert";
    }
    @Override
    protected String objectIsClosed$str() {
        return "WFLYCC0022: %1$s ist geschlossen";
    }
    @Override
    protected String operationOutcome$str() {
        return "WFLYCC0023: Ergebnis der Operation ist %1$s";
    }
    @Override
    protected String operationsNotAllowed$str() {
        return "WFLYCC0024: %1$s Operationen sind nach Inhalt- und Deployment-Änderungen nicht zulässig";
    }
    @Override
    protected String rollbackCancelled$str() {
        return "WFLYCC0025: Rollback wurde abgebrochen";
    }
    @Override
    protected String rollbackRolledBack$str() {
        return "WFLYCC0026: Rollback wurde selbst zurückgesetzt";
    }
    @Override
    protected String rollbackTimedOut$str() {
        return "WFLYCC0027: Timeout des Rollback";
    }
    @Override
    protected String serverDeploymentAlreadyExists$str() {
        return "WFLYCC0028: Deployment mit Namen %1$s bereits im Server vorhanden";
    }
    @Override
    protected String unknownActionType$str() {
        return "WFLYCC0029: Unbekannter Vorgangstyp %1$s";
    }
    @Override
    protected String controllerClientNotClosed$str() {
        return "WFLYCC0030: Allocation Stack Trace:";
    }
    @Override
    protected String noFailureDescription$str() {
        return "WFLYCC0031: Keine Fehlerbeschreibung, da die Operation erfolgreich war.";
    }
    @Override
    protected String operationNameNotFound$str() {
        return "WFLYCC0032: Der Operationsname war nicht definiert.";
    }
    @Override
    protected String invalidAddressType$str() {
        return "WFLYCC0033: Die Adresse muss vom Typ ModelType.LIST sein.";
    }
    @Override
    protected String leakedControllerClient$str() {
        return "WFLYCC0034: Schließe den Controller-Client mit Leck";
    }
    @Override
    protected String cannotDeleteTempFile$str() {
        return "WFLYCC0035: Kann temp-Datei %1$s nicht löschen, wird beim Beenden gelöscht";
    }
    @Override
    protected String streamWasClosed$str() {
        return "WFLYCC0036: Stream wurde geschlossen";
    }
    @Override
    protected String failedToParseAuthenticationConfig$str() {
        return "WFLYCC0037: Parsen der Konfigurationsdatei %1$s fehlgeschlagen";
    }
}
