package org.wildfly.extension.microprofile.openapi.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:20+0200")
public class MicroProfileOpenAPILogger_$logger_de extends MicroProfileOpenAPILogger_$logger implements MicroProfileOpenAPILogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileOpenAPILogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMPOAI0001: Aktivieren des MicroProfile OpenAPI-Subsystems";
    }
    @Override
    protected String failedToLoadStaticFile$str() {
        return "WFLYMPOAI0002: Fehler beim Laden der OpenAPI '%1$s' aus Deployment '%2$s'";
    }
    @Override
    protected String endpointAlreadyRegistered$str() {
        return "WFLYMPOAI0003: MicroProfile OpenAPI-Endpunkt ist bereits für Host '%1$s' registriert. OpenAPI-Dokumentation von '%2$s' wird übersprungen.";
    }
    @Override
    protected String endpointRegistered$str() {
        return "WFLYMPOAI0004: Registrierter MicroProfile OpenAPI-Endpunkt '%1$s' für Host '%2$s'";
    }
    @Override
    protected String endpointUnregistered$str() {
        return "WFLYMPOAI0005: Nicht registrierter MicroProfile OpenAPI-Endpunkt '%1$s' für Host '%2$s'";
    }
    @Override
    protected String requiredListenersNotFound$str() {
        return "WFLYMPOAI0006: Laut §5.1 der MicroProfile OpenAPI-Spezifikation muss der Endpunkt über %2$s erreichbar sein, für den Server '%1$s' existiert jedoch kein solcher Listener.";
    }
    @Override
    protected String nonStandardEndpoint$str() {
        return "WFLYMPOAI0007: Laut §5.1 der MicroProfile OpenAPI-Spezifikation muss die Dokumentation unter '%3$s' verfügbar sein, '%1$s' ist jedoch für die Verwendung von '%2$s' konfiguriert.";
    }
    @Override
    protected String disabled$str() {
        return "WFLYMPOAI0008: MicroProfile OpenAPI-Dokumentation ist deaktiviert für '%1$s'";
    }
}
