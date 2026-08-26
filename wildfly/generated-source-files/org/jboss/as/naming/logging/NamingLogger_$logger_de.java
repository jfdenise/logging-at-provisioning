package org.jboss.as.naming.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:42+0200")
public class NamingLogger_$logger_de extends NamingLogger_$logger implements NamingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public NamingLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String startingService$str() {
        return "WFLYNAM0003: Starte Naming-Dienst";
    }
    @Override
    protected String duplicateBinding$str() {
        return "WFLYNAM0023: Doppelte JNDI-Bindings für '%1$s' sind nicht kompatibel. [%2$s] != [%3$s]";
    }
    @Override
    protected String threadInterrupt$str() {
        return "WFLYNAM0046: Thread unterbrochen während des Abrufs der Dienstreferenz für Dienst %1$s";
    }
    @Override
    protected String notAnInstanceOfObjectFactory$str() {
        return "WFLYNAM0055: Klasse %1$s aus Modul %2$s ist keine Instanz von ObjectFactory";
    }
    @Override
    protected String entryNotRegistered$str() {
        return "WFLYNAM0025: Jndi-Eintrag '%1$s' ist noch nicht in Kontext '%2$s' registriert";
    }
    @Override
    protected String failedToDestroyRootContext$str() {
        return "WFLYNAM0026: Löschen von root-Kontext fehlgeschlagen";
    }
    @Override
    protected String cannotDeferenceObject$str() {
        return "WFLYNAM0016: Konnte Objekt nicht dereferenzieren";
    }
    @Override
    protected String tableIsFull$str() {
        return "WFLYNAM0045: Tabelle ist voll!";
    }
    @Override
    protected String moduleNotFound$str() {
        return "WFLYNAM0065: Modul %1$s konnte nicht geladen werden - dem Modul oder einer seiner Abhängigkeiten fehlt [%2$s]";
    }
    @Override
    protected String cannotResolveService1$str() {
        return "WFLYNAM0020: Konnte Dienst %1$s nicht auflösen";
    }
    @Override
    protected String jndiViewNotAvailable$str() {
        return "WFLYNAM0038: Jndi-Ansicht ist nur im Runtime-Modus verfügbar.";
    }
    @Override
    protected String serviceAlreadyBound$str() {
        return "WFLYNAM0044: Dienst mit Namen [%1$s] bereits gebunden.";
    }
    @Override
    protected String failedToInstantiate$str() {
        return "WFLYNAM0027: Instantiierung von %1$s %2$s vom Klassenlader %3$s fehlgeschlagen";
    }
    @Override
    protected String couldNotLoadClassFromModule$str() {
        return "WFLYNAM0053: Konnte Klasse %1$s nicht aus Modul %2$s laden";
    }
    @Override
    protected String cannotRebindExternalContext$str() {
        return "WFLYNAM0064: Externer Kontext-Lookup kann nicht neu verbunden werden";
    }
    @Override
    protected String illegalContextInName$str() {
        return "WFLYNAM0030: Unzulässiger Kontext in Name: %1$s";
    }
    @Override
    protected String failedToStopRemoteNamingService$str() {
        return "WFLYNAM0067: Remote-Namensdienst konnte nicht gestoppt werden";
    }
    @Override
    protected String unsupportedSimpleBindingType$str() {
        return "WFLYNAM0050: Nicht unterstützter einfacher Binding-Typ %1$s";
    }
    @Override
    protected String cannotResolveServiceBug$str() {
        return "WFLYNAM0022: Konnte Dienstreferenz zu %1$s in Factory %2$s nicht auflösen. Dies ist ein Fehler in der ServiceReferenceObjectFactory. Status war %3$s.";
    }
    @Override
    protected String invalidJndiName$str() {
        return "WFLYNAM0033: Es muss ein gültiger JNDI-Name bereitgestellt werden: %1$s";
    }
    @Override
    protected String invalidLoadFactor$str() {
        return "WFLYNAM0034: Load-Faktor muss größer als 0 und kleiner oder gleich 1 sein";
    }
    @Override
    protected String invalidNameForContextBinding$str() {
        return "WFLYNAM0047: Ungültiger Name für Kontext-Binding %1$s";
    }
    @Override
    protected String emptyNameNotAllowed$str() {
        return "WFLYNAM0024: Ein leerer Name ist nicht gestattet";
    }
    @Override
    protected String resourceLookupForInjectionFailed$str() {
        return "WFLYNAM0059: Ressourcen-Lookup für Injektion fehlgeschlagen: %1$s";
    }
    @Override
    protected String bindingTypeRequiresAttributeDefined$str() {
        return "WFLYNAM0060: Binding-Typ %1$s erfordert Definition eines Attributs namens %2$s";
    }
    @Override
    protected String failedToReadContextEntries$str() {
        return "WFLYNAM0028: Lesen von %1$s-Kontext-Einträgen fehlgeschlagen.";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYNAM0001: Aktivierung des Naming-Subsystems";
    }
    @Override
    protected String couldNotInstantiateClassInstanceFromModule$str() {
        return "WFLYNAM0054: Konnte keine Instanz von Klasse %1$s aus Modul %2$s instantiieren";
    }
    @Override
    protected String failedToLookupJndiViewValue$str() {
        return "WFLYNAM0013: Abruf von jndi-Ansichtswert für Eintrag %1$s fehlgeschlagen.";
    }
    @Override
    protected String cannotListNonContextBinding$str() {
        return "WFLYNAM0017: Auflistung eines nicht-Kontext-Bindings nicht möglich.";
    }
    @Override
    protected String cannotLookupLink$str() {
        return "WFLYNAM0018: Konnte Link nicht finden";
    }
    @Override
    protected String invalidPermissionAction$str() {
        return "WFLYNAM0036: ungültige Genehmigung, unbekannte Aktion: %1$s";
    }
    @Override
    protected String couldNotLoadModule$str() {
        return "WFLYNAM0052: Konnte Modul %1$s nicht laden.";
    }
    @Override
    protected String cannotAddToReadOnlyPermissionCollection$str() {
        return "WFLYNAM0014: Versuch des Hinzufügens einer Genehmigung zu einer schreibgeschützten readonly PermissionCollection";
    }
    @Override
    protected String unableToTransformURLBindingValue$str() {
        return "WFLYNAM0051: Transformation von URL-Binding-Wert %1$s nicht möglich";
    }
    @Override
    protected String invalidTableSize$str() {
        return "WFLYNAM0037: Tabelle in negativer Größe ist nicht möglich!";
    }
    @Override
    protected String failedToStartRemoteNamingService$str() {
        return "WFLYNAM0066: Remote-Namensdienst konnte nicht gestartet werden";
    }
    @Override
    protected String invalidContextReference$str() {
        return "WFLYNAM0032: Ungültiger Kontextverweis. Kein '%1$s'-Verweis.";
    }
    @Override
    protected String cacheNotValidForBindingType$str() {
        return "WFLYNAM0061: Binding-Typ %1$s kann kein 'cache'-Attribut nehmen";
    }
    @Override
    protected String nameNotFoundInContext$str() {
        return "WFLYNAM0039: Name '%1$s' nicht gefunden in Kontext '%2$s'";
    }
    @Override
    protected String cannotResolveService3$str() {
        return "WFLYNAM0021: Konnte Dienstreferenz zu %1$s in Factory %2$s nicht auflösen. Dienst war in Status %3$s.";
    }
    @Override
    protected String readOnlyNamingContext$str() {
        return "WFLYNAM0043: Naming-Kontext ist schreibgeschützt";
    }
    @Override
    protected String invalidPermission$str() {
        return "WFLYNAM0035: ungültige Genehmigung, unbekannte Aktion: %1$s";
    }
    @Override
    protected String objectFactoryCreationFailure$str() {
        return "WFLYNAM0042: Erstellen von Objekt-Factory vom Klassenlader fehlgeschlagen.";
    }
    @Override
    protected String unknownBindingType$str() {
        return "WFLYNAM0049: Unbekannter Binding-Typ %1$s";
    }
    @Override
    protected String cannotBeNull$str() {
        return "WFLYNAM0015: %1$s kann nicht Null sein.";
    }
    @Override
    protected String failedToStart$str() {
        return "WFLYNAM0029: Starten von %1$s fehlgeschlagen";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYNAM0063: Dienst %1$s nicht gestartet";
    }
    @Override
    protected String failedToReleaseBinderService$str() {
        return "WFLYNAM0012: Freigabe von Binder-Dienst fehlgeschlagen, verwendet für ein zur Runtime gemachtes JNDI-Binding";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYNAM0041: %1$s ist Null";
    }
    @Override
    protected String failedToSet$str() {
        return "WFLYNAM0002: Einstellung von %1$s fehlgeschlagen";
    }
    @Override
    protected String invalidNamespaceForBinding$str() {
        return "WFLYNAM0048: Ungültiger Binding-Name %1$s, Name muss mit einem %2$s beginnen";
    }
    @Override
    protected String lookupError$str() {
        return "WFLYNAM0062: Lookup von %1$s fehlgeschlagen";
    }
}
