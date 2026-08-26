package org.wildfly.iiop.openjdk.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:20+0200")
public class IIOPLogger_$logger_de extends IIOPLogger_$logger implements IIOPLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public IIOPLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String duplicateRepositoryName$str() {
        return "WFLYIIOP0087: Doppelter Repository-Name";
    }
    @Override
    protected String invalidEmptyName$str() {
        return "WFLYIIOP0037: Ungültiger leerer Name";
    }
    @Override
    protected String errorDecodingPrincipalName$str() {
        return "WFLYIIOP0021: Konnte eingehenden Principal-Namen nicht entschlüsseln";
    }
    @Override
    protected String errorResolvingRefToImplementedInterface$str() {
        return "WFLYIIOP0096: ValueDef %1$s kann Referenz zum implementierten Interface %2$s nicht auflösen";
    }
    @Override
    protected String failedToCreateNamingContext$str() {
        return "WFLYIIOP0005: Erstellen von CORBA-Naming-Kontext fehlgeschlagen";
    }
    @Override
    protected String failedToLookupJSSEDomain$str() {
        return "WFLYIIOP0051: Fehler bei der Konfiguration der Domain Socket Factory: Lookup der JSSE-Sicherheitsdomain fehlgeschlagen";
    }
    @Override
    protected String unavailableISOLatin1Decoder$str() {
        return "WFLYIIOP0049: ISO-Latin-1 Decoder nicht verfügbar";
    }
    @Override
    protected String valueTypeCantBeProxy$str() {
        return "WFLYIIOP0076: Wertetyp %1$s kann kein Proxy oder eine innere Klasse sein";
    }
    @Override
    protected String errorParsingSASReply$str() {
        return "WFLYIIOP0016: Konnte SAS-Antwort nicht parsen: %1$s";
    }
    @Override
    protected String notAPrimitive$str() {
        return "WFLYIIOP0065: Kein primitiver Typ: %1$s";
    }
    @Override
    protected String corbaNamingServiceStarted$str() {
        return "WFLYIIOP0008: CORBA Naming Service gestartet";
    }
    @Override
    protected String errorResolvingNSInitRef$str() {
        return "WFLYIIOP0029: ORB.resolve_initial_references(\"NameService\") gibt keinen NamingContext wieder";
    }
    @Override
    protected String ineffectiveAuthenticationContextConfiguration$str() {
        return "WFLYIIOP0113: Authentifizierungskontext wurde definiert, ist aber ungültig, da der Sicherheits-Initializer auf \"elytron\" gesetzt ist";
    }
    @Override
    protected String invalidObjectReference$str() {
        return "WFLYIIOP0033: Ungültiger Objektverweis: %1$s";
    }
    @Override
    protected String nameCannotBeNullEmptyOrQualified$str() {
        return "WFLYIIOP0069: Name kann nicht Null, leer oder qualifiziert sein";
    }
    @Override
    protected String badKindForSuperValueType$str() {
        return "WFLYIIOP0095: Ungeeigneter Super-Wertetyp von %1$s";
    }
    @Override
    protected String unavailableRMIPackages$str() {
        return "WFLYIIOP0048: javax.rmi-Pakete nicht verfügbar";
    }
    @Override
    protected String errorConstructingCNCtx$str() {
        return "WFLYIIOP0026: Fehler bei Kontextkonstruktion: entweder ORB oder NamingContext müssen bereitgestellt werden";
    }
    @Override
    protected String noReferenceFound$str() {
        return "WFLYIIOP0036: Keine Objektreferenz für festgelegten Namen gebunden";
    }
    @Override
    protected String errorGettingBindingList$str() {
        return "WFLYIIOP0024: Fehler beim Abruf der Binding-Liste";
    }
    @Override
    protected String errorResolvingInitRef$str() {
        return "WFLYIIOP0098: Auflösung der Anfangsreferenz %1$s fehlgeschlagen";
    }
    @Override
    protected String duplicateTypeCodeForClass$str() {
        return "WFLYIIOP0091: TypeCode für Klasse %1$s bereits etabliert";
    }
    @Override
    protected String inconsistentRequiredTransportConfig$str() {
        return "WFLYIIOP0106: Inkonsistente Konfiguration der transport-config: %1$s wurde auf \"true\" gesetzt, bitte %2$s wie erforderlich konfigurieren";
    }
    @Override
    protected String unavailableSHADigest$str() {
        return "WFLYIIOP0071: Kein SHA Message-Digest verfügbar";
    }
    @Override
    protected String badRMIIIOPMethodSignature$str() {
        return "WFLYIIOP0068: Alle Interface-Methoden müssen javax.rmi.RemoteException melden, aber Methode %1$s von Interface %2$s tut dies nicht";
    }
    @Override
    protected String missingSASContext$str() {
        return "WFLYIIOP0018: SAS-Kontext existiert nicht";
    }
    @Override
    protected String invalidURLOrIOR$str() {
        return "WFLYIIOP0032: Ungültiges IOR oder ungültige URL: %1$s";
    }
    @Override
    protected String cannotAnalyzeStringType$str() {
        return "WFLYIIOP0073: Analyse von java.lang.String nicht möglich: Es ist ein Sonderfall";
    }
    @Override
    protected String errorDecodingInitContextToken$str() {
        return "WFLYIIOP0019: Konnte Anfangskontext-Token nicht entschlüsseln";
    }
    @Override
    protected String errorGeneratingObjectViaFactory$str() {
        return "WFLYIIOP0025: Fehler bei Generierung von Objekt via Objekt-Factory";
    }
    @Override
    protected String unexpectedException$str() {
        return "WFLYIIOP0014: Unerwartete Ausnahme";
    }
    @Override
    protected String noMethodDefForPortableRemoteObjectToStub$str() {
        return "WFLYIIOP0043: Keine Methodendefinition für javax.rmi.PortableRemoteObject.toStub(java.rmi.Remote)";
    }
    @Override
    protected String exceptionDestroingIterator$str() {
        return "WFLYIIOP0102: Ausnahme abgefangen beim Löschen des Iterators %1$s";
    }
    @Override
    protected String errorConvertingIORToNamingCtx$str() {
        return "WFLYIIOP0028: Kann IOR nicht in NamingContext konvertieren: %1$s";
    }
    @Override
    protected String logInternalError$str() {
        return "WFLYIIOP0004: Interner Fehler";
    }
    @Override
    protected String notACorbaObject$str() {
        return "WFLYIIOP0035: Es können nur Instanzen von org.omg.CORBA.Object gebunden werden";
    }
    @Override
    protected String errorMashalingParams$str() {
        return "WFLYIIOP0083: Marshalling von Parameter nicht möglich: unerwartete Anzahl von Parametern";
    }
    @Override
    protected String notANamingContext$str() {
        return "WFLYIIOP0027: %1$s benennt keinen NamingContext";
    }
    @Override
    protected String errorMarshaling$str() {
        return "WFLYIIOP0081: Fehler beim Marshaling von %1$s";
    }
    @Override
    protected String elytronInitializerNotSupportedInPreviousVersions$str() {
        return "WFLYIIOP0114: Elytron-Sicherheits-Initializer wird in früheren iiop-openjdk-Versionen nicht unterstützt und kann nicht konvertiert werden";
    }
    @Override
    protected String collisionWhileCreatingPackage$str() {
        return "WFLYIIOP0092: Namenskonflikt bei Paketerstellung";
    }
    @Override
    protected String failedToStartJBossCOSNaming$str() {
        return "WFLYIIOP0054: Start des JBoss Corba Naming Service fehlgeschlagen";
    }
    @Override
    protected String warnClassDescDoesNotConformToSpec$str() {
        return "WFLYIIOP0010: Kompatibilitätsproblem: Klasse javax.rmi.CORBA.ClassDesc nicht konform mit der Java(TM) Language to IDL Mapping Spezifikation (01-06-07), Abschnitt 1.3.5.11";
    }
    @Override
    protected String badKindForTypeCode$str() {
        return "WFLYIIOP0085: Ungeeignete Art %1$d für TypeCode";
    }
    @Override
    protected String badRMIIIOPConstantType$str() {
        return "WFLYIIOP0066: Feld %1$s von Interface %2$s ist eine Konstante, aber nicht primitiv oder String";
    }
    @Override
    protected String errorDecodingContextData$str() {
        return "WFLYIIOP0022: Ausnahme bei Dekodierung von Kontextdaten in %1$s";
    }
    @Override
    protected String problemInvokingPortableRemoteObjectToStub$str() {
        return "WFLYIIOP0041: Problem mit PortableRemoteObject.toStub(); Objekt nicht exportiert oder Stub nicht gefunden";
    }
    @Override
    protected String cannotInvokeStubConnect$str() {
        return "WFLYIIOP0045: Kann javax.rmi.CORBA.Stub.connect() nicht aufrufen";
    }
    @Override
    protected String cannotObtainExceptionRepositoryID$str() {
        return "WFLYIIOP0082: Kann Ausnahmen-Repository-ID nicht abrufen für %1$s";
    }
    @Override
    protected String wrongInterfaceRepository$str() {
        return "WFLYIIOP0086: Falsches Interface-Repository";
    }
    @Override
    protected String caughtExceptionEncodingGSSUPMechOID$str() {
        return "WFLYIIOP0003: Ausnahme während der Verschlüsselung von GSSUPMechOID abgefangen";
    }
    @Override
    protected String errorUnmarshaling$str() {
        return "WFLYIIOP0080: Fehler beim Unmarshaling von %1$s";
    }
    @Override
    protected String errorObtainingKeyManagers$str() {
        return "WFLYIIOP0052: keyManager[] ist Null für Sicherheitsdomain %1$s";
    }
    @Override
    protected String illegalBatchSize$str() {
        return "WFLYIIOP0023: Batch-Größe nicht numerisch: %1$s";
    }
    @Override
    protected String cannotAnalyzeSpecialClass$str() {
        return "WFLYIIOP0061: Analyse der Spezialklasse nicht möglich: %1$s";
    }
    @Override
    protected String valueTypeCantImplementRemote$str() {
        return "WFLYIIOP0075: Wertetyp %1$s kann java.rmi.Remote nicht implementieren";
    }
    @Override
    protected String errorCreatingPOAFromParent$str() {
        return "WFLYIIOP0099: Erstellen von POA von Parent fehlgeschlagen";
    }
    @Override
    protected String warnCouldNotDeactivateAnonIRObject$str() {
        return "WFLYIIOP0012: Konnte anonymes IR-Objekt nicht deaktivieren";
    }
    @Override
    protected String problemInvokingStubConnect$str() {
        return "WFLYIIOP0044: Problem beim Aufruf von javax.rmi.CORBA.Stub.connect()";
    }
    @Override
    protected String noReadMethodInHelper$str() {
        return "WFLYIIOP0078: Keine \"read\"-Methode in Helper-Klasse %1$s";
    }
    @Override
    protected String sslNotConfigured$str() {
        return "WFLYIIOP0103: IOR-Einstellungen weisen auf Verwendung von SSL-Verbindungen hin, es wurden jedoch keine sichere Verbindungen konfiguriert";
    }
    @Override
    protected String unknownTypeCodeForClass$str() {
        return "WFLYIIOP0090: TypeCode für Klasse %1$s ist unbekannt";
    }
    @Override
    protected String unknownPrimitiveType$str() {
        return "WFLYIIOP0072: Unbekannter primitiver Typ: %1$s";
    }
    @Override
    protected String cannotAnalyzeClassType$str() {
        return "WFLYIIOP0074: Analyse von java.lang.Class nicht möglich: Es ist ein Sonderfall";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYIIOP0118: Legacy-Sicherheit wird nicht mehr unterstützt.";
    }
    @Override
    protected String cannotCreateSSLSocket$str() {
        return "WFLYIIOP0109: SSL-Socket ist für den Server erforderlich, aber es wurden keine sicheren Verbindungen konfiguriert";
    }
    @Override
    protected String inconsistentSupportedTransportConfig$str() {
        return "WFLYIIOP0104: Inkonsistente Konfiguration der transport-config: %1$s wird unterstützt, bitte konfigurieren Sie einen Wert von %2$s";
    }
    @Override
    protected String inconsistentUnsupportedTransportConfig$str() {
        return "WFLYIIOP0105: Inkonsistente Konfiguration der transport-config: %1$s wird nicht unterstützt, bitte entfernen oder auf Wert \"kein\" konfigurieren";
    }
    @Override
    protected String errorSettingSlotInTxInterceptor$str() {
        return "WFLYIIOP0058: Ausnahme bei der Einstellung des Slot in TxServerInterceptor";
    }
    @Override
    protected String foreignTransaction$str() {
        return "WFLYIIOP0055: Fremde Transaktion";
    }
    @Override
    protected String noWriteMethodInHelper$str() {
        return "WFLYIIOP0079: Keine \"write\"-Methode in Helper-Klasse %1$s";
    }
    @Override
    protected String errorConnectingToORB$str() {
        return "WFLYIIOP0031: Verbindung mit ORB nicht möglich";
    }
    @Override
    protected String notAnClassOrInterface$str() {
        return "WFLYIIOP0063: Keine Klasse oder Interface: %1$s";
    }
    @Override
    protected String wontUseCleartextSocket$str() {
        return "WFLYIIOP0117: CLEARTEXT im IIOP-Subsystem wird nicht verwendet, da der Parameter server-requires-ssl auf true gesetzt wurde";
    }
    @Override
    protected String invalidIIOPURLVersion$str() {
        return "WFLYIIOP0047: Ungültige IIOP-URL-Version: %1$s";
    }
    @Override
    protected String invalidURIEncoding$str() {
        return "WFLYIIOP0050: Ungültige URI-Verschlüsselung: %1$s";
    }
    @Override
    protected String failedToGetSSLContext$str() {
        return "WFLYIIOP0053: Abruf von SSL-Kontext fehlgeschlagen";
    }
    @Override
    protected String errorRegisteringSASCurrentInitRef$str() {
        return "WFLYIIOP0017: Konnte Anfangsreferenz für SASCurrent nicht registrieren";
    }
    @Override
    protected String errorEncodingContext$str() {
        return "WFLYIIOP0056: Ausnahme gemeldet während der Verschlüsselung";
    }
    @Override
    protected String errorLoadingClass$str() {
        return "WFLYIIOP0077: Fehler beim Laden der Klasse %1$s";
    }
    @Override
    protected String badClassForConstant$str() {
        return "WFLYIIOP0089: Ungeeignete Klasse %1$s für eine Konstante";
    }
    @Override
    protected String cannotInvokePortableRemoteObjectToStub$str() {
        return "WFLYIIOP0042: Kann javax.rmi.PortableRemoteObject.toStub(java.rmi.Remote) nicht aufrufen";
    }
    @Override
    protected String cannotAnalyzeNullClass$str() {
        return "WFLYIIOP0059: Kann keine Nullklasse analysieren";
    }
    @Override
    protected String badConstantType$str() {
        return "WFLYIIOP0060: Ungeeigneter Typ für eine Konstante: %1$s";
    }
    @Override
    protected String invalidPOACreationArgs$str() {
        return "WFLYIIOP0100: Kann POA nicht instantiieren: Es muss entweder die Ausführung von ORB oder Parent POA festgelegt werden";
    }
    @Override
    protected String noSocketBindingsConfigured$str() {
        return "WFLYIIOP0115: Es wurden keine IIOP-Socket-Bindings konfiguriert";
    }
    @Override
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYIIOP0119: Die Verwendung von Sicherheitsbereichen zur Laufzeit wird nicht unterstützt.";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYIIOP0001: Aktivierung des IIOP-Untersystems";
    }
    @Override
    protected String unescapedCharacter$str() {
        return "WFLYIIOP0038: %1$s: nicht durch Escapezeichen formatiert am Ende der Komponente";
    }
    @Override
    protected String classIsNotArray$str() {
        return "WFLYIIOP0093: Klasse %1$s ist keine Array-Klasse";
    }
    @Override
    protected String badRMIIIOPExceptionType$str() {
        return "WFLYIIOP0067: Ausnahmetyp %1$s muss eine markierte Ausnahmeklasse sein";
    }
    @Override
    protected String invalidNullClass$str() {
        return "WFLYIIOP0088: Ungültige Nullklasse";
    }
    @Override
    protected String notAnAccessor$str() {
        return "WFLYIIOP0062: Kein Accessor: %1$s";
    }
    @Override
    protected String errorDecodingTargetInContextToken$str() {
        return "WFLYIIOP0020: Konnte Zielnamen in Anfangskontext-Token nicht entschlüsseln";
    }
    @Override
    protected String notAnInterface$str() {
        return "WFLYIIOP0064: Klasse %1$s ist kein Interface";
    }
    @Override
    protected String runtimeSecurityDomainUnsupported$str() {
        return "WFLYIIOP0120: Die Verwendung von Sicherheitsdomänen zur Laufzeit wird nicht unterstützt.";
    }
    @Override
    protected String serverDoesNotSupportSsl$str() {
        return "WFLYIIOP0110: Client erfordert SSL, dies wird aber vom Server nicht unterstützt";
    }
    @Override
    protected String noMethodDefForStubConnect$str() {
        return "WFLYIIOP0046: Keine Methodendefinition für javax.rmi.CORBA.Stub.connect(org.omg.CORBA.ORB)";
    }
    @Override
    protected String corbaORBServiceStarted$str() {
        return "WFLYIIOP0009: CORBA ORB Service gestartet";
    }
    @Override
    protected String failedToObtainJSSEDomain$str() {
        return "WFLYIIOP0007: Erhalt von JSSE-Sicherheitsdomain mit Name %1$s fehlgeschlagen";
    }
    @Override
    protected String primitivesHaveNoIRIds$str() {
        return "WFLYIIOP0070: Primitive Typen haben keine IR IDs";
    }
    @Override
    protected String errorResolvingRefToAbstractValuetype$str() {
        return "WFLYIIOP0097: ValueDef %1$s kann Referenz zum abstrakten Basis-Wertetyp %2$s nicht auflösen";
    }
    @Override
    protected String cannotDestroyRMIIIOPMapping$str() {
        return "WFLYIIOP0094: Kann RMI/IIOP-Mapping nicht löschen";
    }
    @Override
    protected String invalidURL$str() {
        return "WFLYIIOP0040: Ungültige %1$s URL: %2$s";
    }
    @Override
    protected String invalidEscapedCharacter$str() {
        return "WFLYIIOP0039: %1$s: Ungültiges Zeichen durch Escapezeichen formatiert";
    }
    @Override
    protected String cannotChangeRMIIIOPMapping$str() {
        return "WFLYIIOP0084: Kann RMI/IIOP-Mapping nicht ändern";
    }
    @Override
    protected String warnCouldNotDeactivateIRObject$str() {
        return "WFLYIIOP0011: Konnte IR-Objekt nicht deaktivieren";
    }
    @Override
    protected String failedToUnbindObject$str() {
        return "WFLYIIOP0006: Unbind fehlgeschlagen für %1$s";
    }
    @Override
    protected String urlDoesNotContainIOR$str() {
        return "WFLYIIOP0034: %1$s enthält kein IOR";
    }
    @Override
    protected String cosNamingNotRegisteredCorrectly$str() {
        return "WFLYIIOP0030: COS Name Service ist nicht unter dem Namen 'NameService' bei ORB registriert";
    }
    @Override
    protected String errorActivatingPOA$str() {
        return "WFLYIIOP0101: Aktivierung von POA fehlgeschlagen";
    }
    @Override
    protected String failedToFetchCSIv2Policy$str() {
        return "WFLYIIOP0002: Fehler beim Abruf von CSIv2Policy";
    }
    @Override
    protected String errorGettingSlotInTxInterceptor$str() {
        return "WFLYIIOP0057: Ausnahme beim Abruf des Slot in TxServerInterceptor";
    }
    @Override
    protected String unexpectedContextErrorInSASReply$str() {
        return "WFLYIIOP0015: Unerwarteter ContextError in SAS-Antwort";
    }
}
