package org.jboss.as.service.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:13+0200")
public class SarLogger_$logger_de extends SarLogger_$logger implements SarLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SarLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedExecutingLegacyMethod$str() {
        return "WFLYSAR0001: Ausführung der Legacy-Service-Methode %1$s fehlgeschlagen";
    }
    @Override
    protected String propertyNotFound$str() {
        return "WFLYSAR0002: Kann PropertyEditor für Typ %1$s nicht finden";
    }
    @Override
    protected String classNotFound$str() {
        return "WFLYSAR0003: Klasse nicht gefunden";
    }
    @Override
    protected String classNotInstantiated$str() {
        return "WFLYSAR0004: Klasse nicht instantiiert";
    }
    @Override
    protected String failedToGetAttachment$str() {
        return "WFLYSAR0005: Abruf von %1$s-Anhang für %2$s fehlgeschlagen";
    }
    @Override
    protected String failedXmlParsing$str() {
        return "WFLYSAR0006: Parsen von Dienst-XML [%1$s] fehlgeschlagen";
    }
    @Override
    protected String methodNotFound$str() {
        return "WFLYSAR0007: Methode '%1$s(%2$s)' nicht gefunden für: %3$s";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYSAR0008: Eines oder mehrere der erforderlichen Attribute fehlt:";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYSAR0009: %1$s ist Null";
    }
    @Override
    protected String propertyMethodNotFound$str() {
        return "WFLYSAR0010: %1$s-Methode für Property '%2$s' nicht gefunden für: %3$s";
    }
    @Override
    protected String unexpectedContent$str() {
        return "WFLYSAR0011: Unerwarteter Content des Typs '%1$s' namens '%2$s', Text ist: %3$s";
    }
    @Override
    protected String failedToProcessSarChild$str() {
        return "WFLYSAR0012: Bearbeitung von SAR-Unterarchiven für [%1$s] fehlgeschlagen";
    }
    @Override
    protected String malformedDependencyName$str() {
        return "WFLYSAR0013: Fehlerhaft gebildeter Abhängigkeitsname %1$s";
    }
    @Override
    protected String defaultConstructorNotFound$str() {
        return "WFLYSAR0014: Konnte Standard-Konstruktor für %1$s nicht finden";
    }
    @Override
    protected String mbeanRegistrationFailed$str() {
        return "WFLYSAR0015: Registrierung von mbean [%1$s] fehlgeschlagen";
    }
    @Override
    protected String cannotUnregisterObject$str() {
        return "WFLYSAR0016: Kein ObjectName zur Deregistrierung verfügbar";
    }
    @Override
    protected String unregistrationFailure$str() {
        return "WFLYSAR0017: Deregistrierung von [%1$s] fehlgeschlagen";
    }
    @Override
    protected String objectSupplierNotAvailable$str() {
        return "WFLYSAR0018: Objektanbieter nicht verfügbar";
    }
    @Override
    protected String objectNotAvailable$str() {
        return "WFLYSAR0019: Objekt nicht verfügbar";
    }
    @Override
    protected String methodIsNotAccessible$str() {
        return "WFLYSAR0020: Auf die Methode kann nicht zugegriffen werden";
    }
    @Override
    protected String failedToInvokeMethod$str() {
        return "WFLYSAR0021: Methode konnte nicht aufgerufen werden";
    }
}
