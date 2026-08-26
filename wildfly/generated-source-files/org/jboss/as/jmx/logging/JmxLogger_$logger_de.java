package org.jboss.as.jmx.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:23+0200")
public class JmxLogger_$logger_de extends JmxLogger_$logger implements JmxLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JmxLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String attributeNotWritable$str() {
        return "WFLYJMX0008: Attribut %1$s ist nicht schreibbar";
    }
    @Override
    protected String cannotUnregisterMBeansUnderReservedDomain$str() {
        return "WFLYJMX0045: Sie können keine mbeans unter der reservierten Domain '%1$s' deregistrieren";
    }
    @Override
    protected String unknownChild$str() {
        return "WFLYJMX0031: Unbekanntes untergeordnetes %1$s-Objekt";
    }
    @Override
    protected String unsupportedMethod$str() {
        return "WFLYJMX0043: %1$s wird nicht unterstützt";
    }
    @Override
    protected String notAuthorizedToExecuteOperation$str() {
        return "WFLYJMX0040: Nicht autorisiert zum Aufrufen von Operation: '%1$s'";
    }
    @Override
    protected String errorUnregisteringMBeanWithBadCalculatedName$str() {
        return "WFLYJMX0047: Fehler beim Deregistrieren der MBean '%1$s', die in einer reservierten JMX-Domain registriert ist";
    }
    @Override
    protected String differentLengths$str() {
        return "WFLYJMX0012: %1$s und %2$s haben unterschiedliche Längen";
    }
    @Override
    protected String cannotSetAttribute$str() {
        return "WFLYJMX0010: Konnte %1$s nicht festlegen";
    }
    @Override
    protected String removeNotificationListenerNotAllowed$str() {
        return "WFLYJMX0051: Entfernen von Benachrichtungs-Listener mittels ObjectName %1$s wird nicht unterstützt";
    }
    @Override
    protected String descriptorMBeanExpressionSupportFalse$str() {
        return "Dieses mbean unterstützt keine Ausdrücke für Attribute oder Operationsparameter, sogar wenn diese vom zugrundeliegenden Modell unterstützt werden. Stattdessen wird das aufgelöste Attribut wiedergegeben und der \"real typed\"-Wert muss beimSchreiben von Attributen/Aufruf von Operationen verwendet werden.";
    }
    @Override
    protected String registrationNotFound$str() {
        return "WFLYJMX0022: Keine Registrierung für Pfadadresse %1$s gefunden";
    }
    @Override
    protected String notAuthorizedToWriteAttribute$str() {
        return "WFLYJMX0038: Nicht autorisiert zum Schreiben von Attribut: '%1$s'";
    }
    @Override
    protected String descriptorAlternateMBeanLegacy$str() {
        return "Um aufgelöste Werte zu lesen und Attribute schreiben sowie Operationsparameter verwenden zu können, gehen Sie zu %1$s";
    }
    @Override
    protected String descriptorAttributeExpressionsAllowedFalse$str() {
        return "Dieses Attribut unterstützt Ausdrücke nicht";
    }
    @Override
    protected String cannotCreateObjectName$str() {
        return "WFLYJMX0009: Konnte keinen ObjectName für Adresse %1$s von String %2$s erstellen";
    }
    @Override
    protected String objectNameCantBeNull$str() {
        return "WFLYJMX0032: ObjectName kann nicht Null sein";
    }
    @Override
    protected String attributeNotFound$str() {
        return "WFLYJMX0007: Es konnte kein passendes Attribut gefunden werden: %1$s";
    }
    @Override
    protected String compositeEntryValueDescription$str() {
        return "Der Wert";
    }
    @Override
    protected String dontKnowHowToDeserialize$str() {
        return "WFLYJMX0042: Deserialisierung nicht bekannt";
    }
    @Override
    protected String compositeEntryTypeDescription$str() {
        return "Ein Eintrag";
    }
    @Override
    protected String descriptorAttributeExpressionsAllowedTrue$str() {
        return "Dieses Attribut unterstützt Ausdrücke";
    }
    @Override
    protected String cannotRegisterMBeansUnderReservedDomain$str() {
        return "WFLYJMX0044: Sie können keine mbeans unter der reservierten Domain '%1$s' registrieren";
    }
    @Override
    protected String noOperationCalled1$str() {
        return "WFLYJMX0019: Keine Operation namens '%1$s'";
    }
    @Override
    protected String descriptorMBeanExpressionSupportTrue$str() {
        return "Dieses mbean unterstützt unbearbeitete Ausdrücke für Attributee und Operationsparameter, wo durch das zugrundeliegende Modell unterstützt. Wird kein Ausdruck verwendet, so wird die String-Repräsentation in einen echten Attributwert konvertiert.";
    }
    @Override
    protected String propertyValue$str() {
        return "Der Property-Wert";
    }
    @Override
    protected String invalidAttributeType$str() {
        return "WFLYJMX0013: Unzulässiger Typ für '%1$s'";
    }
    @Override
    protected String mbeanNotFound$str() {
        return "WFLYJMX0017: Kein MBean namens %1$s gefunden";
    }
    @Override
    protected String noOperationCalled2$str() {
        return "WFLYJMX0020: Keine Operation namens '%1$s' unter %2$s";
    }
    @Override
    protected String unknownValue$str() {
        return "WFLYJMX0025: Unbekannter Wert %1$s";
    }
    @Override
    protected String addNotificationListenerNotAllowed$str() {
        return "WFLYJMX0050: Hinzufügen von Benachrichtungs-Listener mittels ObjectName %1$s wird nicht unterstützt";
    }
    @Override
    protected String compositeEntryTypeName$str() {
        return "Eintrag";
    }
    @Override
    protected String unknownType$str() {
        return "WFLYJMX0024: Unbekannter Typ %1$s";
    }
    @Override
    protected String cannotCreateMBeansInReservedDomain$str() {
        return "WFLYJMX0041: Sie können keine mbeans unter der reservierten Domain '%1$s' erstellen";
    }
    @Override
    protected String compositeEntryKeyDescription$str() {
        return "Der Schlüssel";
    }
    @Override
    protected String compositeMapDescription$str() {
        return "Die Map ist durch 'key' (Schlüssel) indiziert";
    }
    @Override
    protected String complexCompositeEntryTypeName$str() {
        return "Komplexer Typ";
    }
    @Override
    protected String unknownDomain$str() {
        return "WFLYJMX0029: Unbekannte Domain: %1$s";
    }
    @Override
    protected String badDomainInCalculatedObjectNameException$str() {
        return "WFLYJMX0046: Der ObjectName von MBeanRegistration.preRegister() '%1$s' ist in einer reservierten JMX-Domain";
    }
    @Override
    protected String invalidKey$str() {
        return "WFLYJMX0014: Ungültiger Schlüssel %1$s für %2$s";
    }
    @Override
    protected String mbeanRegistrationFailed$str() {
        return "WFLYJMX0018: Registrierung von mbean [%1$s] fehlgeschlagen";
    }
    @Override
    protected String invalidObjectName3$str() {
        return "WFLYJMX0015: Ungültiger ObjectName: %1$s,%2$s; %3$s";
    }
    @Override
    protected String expressionCannotBeConvertedIntoTargeteType$str() {
        return "WFLYJMX0030: Der Ausdruck kann nicht in Zieltyp %1$s umgewandelt werden";
    }
    @Override
    protected String jmxConnectorNotSupported$str() {
        return "WFLYJMX0006: <jmx-connector/> bietet keine Unterstützung mehr. <remoting-connector/> sollte stattdessen verwendet werden, um Remote-Verbindungen über JBoss Remoting zu ermöglichen.";
    }
    @Override
    protected String unauthorized$str() {
        return "WFLYJMX0037: Nicht authorisierter Zugang";
    }
    @Override
    protected String notAuthorizedToReadAttribute$str() {
        return "WFLYJMX0039: Nicht autorisiert zum Lesen von Attribut: '%1$s'";
    }
    @Override
    protected String cannotUnregisterObject$str() {
        return "WFLYJMX0004: Kein ObjectName zur Deregistrierung verfügbar";
    }
    @Override
    protected String invalidObjectName2$str() {
        return "WFLYJMX0015: Ungültiger ObjectName: %1$s;%2$s";
    }
    @Override
    protected String removeNotificationListerWithObjectNameNotSupported$str() {
        return "WFLYJMX0049: Entfernen von Benachrichtungs-Listener mittels ObjectName %1$s wird nicht unterstützt";
    }
    @Override
    protected String noHandlerCalled$str() {
        return "WFLYJMX0036: Kein Handler namens '%1$s' vorhanden";
    }
    @Override
    protected String descriptorAlternateMBeanExpressions$str() {
        return "Um Ausdrücke lesen und festlegen zu können, gehen Sie zu %1$s";
    }
    @Override
    protected String propertyCompositeType$str() {
        return "Ein zusammengesetzter Typ der eine Property repräsentiert";
    }
    @Override
    protected String wildcardNameParameterRequired$str() {
        return "WFLYJMX0026: Benötige Namensparameter für Platzhalter-Hinzufügung";
    }
    @Override
    protected String propertyName$str() {
        return "Der Property-Name";
    }
    @Override
    protected String complexCompositeEntryTypeDescription$str() {
        return "Ein komplexer Typ";
    }
    @Override
    protected String invalidObjectName4$str() {
        return "WFLYJMX0015: Ungültiger ObjectName: %1$s,%2$s,%3$s; %4$s";
    }
    @Override
    protected String compositeMapName$str() {
        return "Ein Map";
    }
    @Override
    protected String addNotificationListerWithObjectNameNotSupported$str() {
        return "WFLYJMX0048: Hinzufügen von Benachrichtungs-Listener mittels ObjectName %1$s wird nicht unterstützt";
    }
    @Override
    protected String unregistrationFailure$str() {
        return "WFLYJMX0005: Deregistrierung von [%1$s] fehlgeschlagen";
    }
}
