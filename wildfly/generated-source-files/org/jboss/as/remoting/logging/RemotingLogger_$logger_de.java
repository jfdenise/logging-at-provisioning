package org.jboss.as.remoting.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:48+0200")
public class RemotingLogger_$logger_de extends RemotingLogger_$logger implements RemotingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public RemotingLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYRMT0029: Die Verwendung von Sicherheitsbereichen zur Laufzeit wird nicht unterstützt.";
    }
    @Override
    protected String endpointEmpty$str() {
        return "WFLYRMT0006: Endpunkt ist Null";
    }
    @Override
    protected String invalidQOPV$str() {
        return "WFLYRMT0016: Ungültiger QOP-Wert: %1$s";
    }
    @Override
    protected String addingIOSubsystem$str() {
        return "WFLYRMT0024: Das Remoting-Subsystem ist vorhanden, aber es konnte kein IO-Subsystem gefunden werden. Ein IO-Subsystem war nicht erforderlich, als das Remoting-Schema \"%1$s\" aktuell war; jetzt ist dies jedoch erforderlich, weshalb ein Standard-Subsystem hinzugefügt wird.";
    }
    @Override
    protected String illegalStrength$str() {
        return "WFLYRMT0020: Ungültiger Strength-String '%1$s' angegeben";
    }
    @Override
    protected String failedToObtainSSLContext$str() {
        return "WFLYRMT0027: SSLContext konnte nicht abgerufen werden";
    }
    @Override
    protected String couldNotStart$str() {
        return "WFLYRMT0005: Start des Dienstes fehlgeschlagen";
    }
    @Override
    protected String couldNotRemoveResource$str() {
        return "WFLYRMT0025: %1$s kann nicht entfernt werden, da JMX dies als Remoting-Endpunkt verwendet";
    }
    @Override
    protected String invalidOption$str() {
        return "WFLYRMT0028: Ungültige Option '%1$s'.";
    }
    @Override
    protected String couldNotCreateURI$str() {
        return "WFLYRMT0018: Kann keinen gültigen URI aus %1$s -- %2$s erstellen";
    }
    @Override
    protected String couldNotStartChanelListener$str() {
        return "WFLYRMT0002: Konnte Channel-Horcher nicht starten";
    }
    @Override
    protected String couldNotBindToSocket$str() {
        return "WFLYRMT0004: %1$s";
    }
    @Override
    protected String warningOnWorkerChange$str() {
        return "WFLYRMT0026: Die Änderung des Workers in '%1$s' im Remoting könnte die gleiche Änderung in den verknüpften Ressourcen je nach Remoting und in der Definition der HTTP(S)-Listener erfordern.";
    }
    @Override
    protected String listeningOnSocket$str() {
        return "WFLYRMT0001: Horchen auf %1$s";
    }
    @Override
    protected String workerConfigurationIgnored$str() {
        return "WFLYRMT0022: Worker-Konfiguration wird nicht mehr verwendet, bitte verwenden Sie Endpunkt-Worker-Konfiguration";
    }
    @Override
    protected String upgradeRequestMissingKey$str() {
        return "WFLYRMT0021: HTTP-Upgrade-Anfrage fehlt Sec-JbossRemoting-Key Header";
    }
    @Override
    protected String workerThreadsEndpointConfigurationChoiceRequired$str() {
        return "WFLYRMT0023: Nur eines von beidem – '%1$s'-Konfiguration oder '%2$s'-Konfiguration – ist zulässig";
    }
    @Override
    protected String invalidStrength$str() {
        return "WFLYRMT0017: Ungültiger Strength-Wert: %1$s";
    }
}
