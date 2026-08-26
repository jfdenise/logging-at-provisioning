package org.jboss.as.jpa.messages;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:25+0200")
public class JpaLogger_$logger_de extends JpaLogger_$logger implements JpaLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JpaLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String relativePathNotFound$str() {
        return "WFLYJPA0058: Konnte relativen Pfad nicht finden: %1$s";
    }
    @Override
    protected String cannotCloseTransactionContainerEntityManger$str() {
        return "WFLYJPA0017: Container-gemanagter Entity-Manager kann nur vom Container geschlossen werden (automatisch geleert bei Transaktions-/Aufruf-Ende und geschlossen, wenn besitzende Komponente geschlossen wird.)";
    }
    @Override
    protected String badSynchronizationTypeCombination$str() {
        return "WFLYJPA0064: Der Jakarta Transactions-Transaktion ist bereits ein 'SynchronizationType.UNSYNCHRONIZED'-Persistenz-Kontext (EntityManager) zugewiesen, allerdings wird jetzt eine Komponente mit einem 'SynchronizationType.SYNCHRONIZED' verwendet. Ändern Sie den Code der aufrufenden Komponente, um den Persistenz-Kontext (EntityManager) der Transaktion hinzuzufügen, oder ändern Sie den Code der aufgerufenen Komponente, um ebenfalls 'SynchronizationType.UNSYNCHRONIZED' zu verwenden. Siehe JPA-Spezifikation 2.1 Abschnitt 7.6.4.1. Name der begrenzten Persistenz-Einheit = %1$s.";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYJPA0040: Parsen von %1$s fehlgeschlagen";
    }
    @Override
    protected String cannotUseExtendedPersistenceTransaction$str() {
        return "WFLYJPA0030: Es wurde ein erweiterter Persistenzkontext in der SFSB-Aktivierungs-Aufrufliste gefunden, dieser kann aber nicht verwendet werden, da der Transaktion bereits ein transaktionaler Kontext zugeordnet ist. Dies kann durch Änderung des Anwendungscodes vermieden werden, entweder durch die Beseitigung des erweiterten Persistenzkontextes oder des transaktionalen Kontextes. Siehe JPA-Spezifikation 2.0 Abschnitt 7.6.3.1. Name der begrenzten Persistenzeinheit = %1$s, Persistenzkontext bereits in der Transaktion = %2$s, erweiterter Persistenzkontext =%3$s.";
    }
    @Override
    protected String persistenceProviderNotFound$str() {
        return "WFLYJPA0057: PersistenceProvider '%1$s' nicht gefunden";
    }
    @Override
    protected String invalidPersistenceUnitName$str() {
        return "WFLYJPA0043: Persistenzeinheit-Name (%1$s) enthält unzulässiges '%2$s'-Zeichen";
    }
    @Override
    protected String noPUnitNameSpecifiedAndMultiplePersistenceUnits$str() {
        return "WFLYJPA0061: Persistenz-unitName wurde nicht angegeben, und es gibt %1$d Persistenzeinheitsdefinitionen in der Anwendungsbereitstellung %2$s. Ändern Sie entweder die Anwendungsbereitstellung auf nur eine Persistenzeinheitsdefinition, oder definieren Sie den unitName für jeden Verweis auf eine Persistenzeinheit.";
    }
    @Override
    protected String unexpectedStatisticsProblem$str() {
        return "WFLYJPA0012: Unerwartetes Problem beim Sammeln von Statistiken";
    }
    @Override
    protected String cannotGetSessionFactory$str() {
        return "WFLYJPA0020: Erhalt von Hibernate Session Factory vom Entity-Manager nicht möglich";
    }
    @Override
    protected String illegalCallOnCloseMethod$str() {
        return "WFLYJPA0075: Das Aufrufen dieser Methode vom injizierten, verwalteten EntityManager ist unzulässig.";
    }
    @Override
    protected String differentSearchModuleDependencies$str() {
        return "WFLYJPA0071: Deployment \"%1$s\" gab mehr als einen Hibernate Search-Modulnamen an (\"%2$s\", \"%3$s\")";
    }
    @Override
    protected String duplicatePersistenceUnitDefinition$str() {
        return "WFLYJPA0001: Doppelte Persistenz-Einheitendefinition für %1$s in der Anwendung. Eine der doppelten persistence.xml sollte aus der Anwendung entfernt werden. Die Anwendungsbereitstellung wird mit den persistence.xml-Definitionen aus %2$s fortgesetzt. Die persistence.xml-Definitionen aus %3$s werden ignoriert.";
    }
    @Override
    protected String setterMethodOnlyAnnotation$str() {
        return "WFLYJPA0059: %1$s Einspeisungsziel ist ungültig. Es sind nur Setter-Methoden gestattet: %2$s";
    }
    @Override
    protected String failedToStopPUService$str() {
        return "WFLYJPA0007: Konnte Persistenz-Einheitendienst %1$s nicht stoppen";
    }
    @Override
    protected String failedToAddPersistenceUnit$str() {
        return "WFLYJPA0038: Hinzufügung von Persistenzeinheit-Dienst für %1$s fehlgeschlagen";
    }
    @Override
    protected String transactionRequired$str() {
        return "WFLYJPA0060: Transaktion ist zur Durchführung dieser Operation erforderlich (verwenden Sie entweder eine Transaktion oder erweiterten Persistenzkontext)";
    }
    @Override
    protected String resourcesOfTypeCannotBeRegistered$str() {
        return "WFLYJPA0065: Ressourcen vom Typ %1$s können nicht registriert werden";
    }
    @Override
    protected String stoppingService$str() {
        return "WFLYJPA0004: Stoppe %1$s Dienst '%2$s'";
    }
    @Override
    protected String cannotCreateAdapter$str() {
        return "WFLYJPA0018: Konnte keine Instanz von Adapterklasse '%1$s' erstellen";
    }
    @Override
    protected String readingPersistenceXml$str() {
        return "WFLYJPA0002: Lese persistence.xml für %1$s";
    }
    @Override
    protected String errorGettingTransaction$str() {
        return "WFLYJPA0036: Fehler beim Abruf der mit dem aktuellen Thread assoziierten Transaktion: %1$s";
    }
    @Override
    protected String cannotDeployApp$str() {
        return "WFLYJPA0019: Konnte Applikations-gepackten Persistenz-Provider '%1$s' nicht deployen";
    }
    @Override
    protected String failedToGetAdapter$str() {
        return "WFLYJPA0037: Abruf von Adapter für Persistenz-Provider '%1$s' fehlgeschlagen";
    }
    @Override
    protected String startingPersistenceUnitService$str() {
        return "WFLYJPA0010: Starte Persistenz-Einheit (Phase %1$d von 2) Dienst \"%2$s\"";
    }
    @Override
    protected String cannotLoadPersistenceProviderIntegratorModule$str() {
        return "WFLYJPA0074: Fehler beim Laden des Persistenz-Provider-Integratormoduls für %1$s";
    }
    @Override
    protected String invalidScopedName$str() {
        return "WFLYJPA0044: jboss.as.jpa.scopedname-Hinweis (%1$s) enthält unzulässiges '%2$s'-Zeichen";
    }
    @Override
    protected String persistenceProviderAdaptorModuleLoadError$str() {
        return "WFLYJPA0069: Ladefehler des Persistenz-Provider-Adapter-Moduls %1$s";
    }
    @Override
    protected String classloaderHasMultipleAdapters$str() {
        return "WFLYJPA0067: Klassenlader \"%1$s\" hat mehr als einen Persistenz-Provider-Adapter";
    }
    @Override
    protected String couldNotCreateInstanceProvider$str() {
        return "WFLYJPA0062: Konnte keine Instanz von Persistenz-Provider-Klasse %1$s erstellen";
    }
    @Override
    protected String cannotInjectResourceLocalEntityManager$str() {
        return "WFLYJPA0021: Kann RESOURCE_LOCAL Container-gemanagte EntityManagers nicht mittels @PersistenceContext einspeisen";
    }
    @Override
    protected String xpcOnlyFromSFSB$str() {
        return "WFLYJPA0070: Ein containerverwalteter Persistenzkontext kann nur initiiert werden innerhalb der Begrenzung eines stateful Session Bean (Persistenz-Einheit \"%1$s\").";
    }
    @Override
    protected String cannotLoadFromJpa$str() {
        return "WFLYJPA0025: Konnte %1$s nicht vom Jakarta-Persistenz-Module-Klassenlader laden";
    }
    @Override
    protected String cannotLoadPersistenceProviderModule$str() {
        return "WFLYJPA0027: Ladefehler des Persistenz-Provider Moduls %1$s (Klasse %2$s)";
    }
    @Override
    protected String persistenceUnitNotFound2$str() {
        return "WFLYJPA0033: Kann keine Persistenzeinheit namens %1$s in %2$s finden";
    }
    @Override
    protected String multipleAdapters$str() {
        return "WFLYJPA0048: Persistenz-Provider Adaptermodul (%1$s) hat mehr als einen Adapter";
    }
    @Override
    protected String startingService$str() {
        return "WFLYJPA0003: Starte %1$s Dienst '%2$s'";
    }
    @Override
    protected String classLevelAnnotationParameterRequired$str() {
        return "WFLYJPA0032: Klassenebenen-%1$s-Annotation auf Klasse %2$s muss einen %3$s liefern";
    }
    @Override
    protected String errorPreloadingDefaultProvider$str() {
        return "WFLYJPA0006: Konnte Standard Persistenz-Provider-Modul nicht laden.  ";
    }
    @Override
    protected String stoppingPersistenceUnitService$str() {
        return "WFLYJPA0011: Stoppe Persistenz-Einheit (Phase %1$d von 2) Dienst \"%2$s\"";
    }
    @Override
    protected String cannotCloseContainerManagedEntityManager$str() {
        return "WFLYJPA0015: Container-gemanagter Entity-Manager kann nur vom Container geschlossen werden (erfolgt, wenn @remove-Methode am enthaltenden SFSB aufgerufen wird)";
    }
    @Override
    protected String resourcesOfTypeCannotBeRemoved$str() {
        return "WFLYJPA0066: Ressourcen vom Typ %1$s können nicht entfernt werden";
    }
    @Override
    protected String persistenceUnitNotFound3$str() {
        return "WFLYJPA0034: Kann keine Persistenzeinheit namens %1$s#%2$s an %3$s finden";
    }
    @Override
    protected String referenceCountedEntityManagerNegativeCount$str() {
        return "WFLYJPA0063: Interner Fehler, die Anzahl von stateful Session Beans (%1$d), die mit einem erweiterten Persistenzkontext (%2$s) assoziiert wird, kann keine negative Zahl sein.";
    }
    @Override
    protected String invalidClassFormat$str() {
        return "WFLYJPA0073: Bytecode-Umschreibung (Transformation) der Klasse %1$s fehlgeschlagen";
    }
    @Override
    protected String nullParameter$str() {
        return "WFLYJPA0053: Interner %1$s-Fehler, Null %2$s eingegeben";
    }
    @Override
    protected String cannotSpecifyBoth$str() {
        return "WFLYJPA0029: Kann nicht sowohl %1$s (%2$s) als auch %3$s (%4$s) in %5$s für %6$s festlegen";
    }
    @Override
    protected String childNotFound$str() {
        return "WFLYJPA0031: Konnte untergeordneten Prozess '%1$s' in '%2$s' nicht finden";
    }
}
