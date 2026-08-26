package org.jboss.as.ejb3.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:16+0200")
public class EjbLogger_$logger_de extends EjbLogger_$logger implements EjbLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public EjbLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToCreateOptionForProperty$str() {
        return "WFLYEJB0050: Konnte Property %1$s wegen %2$s nicht analysieren";
    }
    @Override
    protected String beanWithRemoteAnnotationImplementsMoreThanOneInterface$str() {
        return "WFLYEJB0082: Bean %1$s legt @Remote-Annotation fest, implementiert aber nicht 1 Schnittstelle";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYEJB0085: Ausnahme beim Parsen von %1$s";
    }
    @Override
    protected String removeMethodIsNull$str() {
        return "WFLYEJB0235: @Remove Methodenbezeichner kann nicht Null sein";
    }
    @Override
    protected String failToCallgetRollbackOnlyAfterTxcompleted$str() {
        return "WFLYEJB0175: getRollbackOnly() nach abgeschlossener Transaktion nicht gestattet (EJBTHREE-1445)";
    }
    @Override
    protected String methodNameIsNull$str() {
        return "WFLYEJB0170: Methodenname kann nicht Null sein";
    }
    @Override
    protected String invalidEjbEntityTimeout$str() {
        return "WFLYEJB0272: Jakarta Entity Beans %1$s Entity-Bean %2$s implementierte TimedObject, hat aber eine andere Timeout-Methode entweder via Annotationen oder via dem Deployment-Descriptor festgelegt";
    }
    @Override
    protected String cannotBeApplicationExceptionBecauseNotAnExceptionType$str() {
        return "WFLYEJB0079: [Enterprise Beans 3.1-Spezifikation, Abschnitt 14.1.1] Klasse: %1$s kann nicht als Applikationsausnahme markiert werden, da nicht dem Typ java.lang.Exception entsprechend";
    }
    @Override
    protected String unknownResourceAdapter$str() {
        return "WFLYEJB0199: Kein Ressourcen-Adapter mit dem Ressourcen-Adapter-Namen %1$s registriert";
    }
    @Override
    protected String noComponentAvailableForAddress$str() {
        return "WFLYEJB0369: Für die Adresse %1$s ist keine Jakarta Enterprise Beans-Komponente verfügbar";
    }
    @Override
    protected String cannotBuildIndexForServerInterceptor$str() {
        return "WFLYEJB0511: Reflexionsindex für Server-Interzeptorklasse %1$s kann nicht erstellt werden";
    }
    @Override
    protected String scheduleExpressionDateFromTimerPersistenceInvalid$str() {
        return "WFLYEJB0495: Persistiertes Start- oder Enddatum für geplanten Ausdruck der Timer-ID:%1$s ist nicht gültig und wird ignoriert: %2$s.";
    }
    @Override
    protected String transactionInUnexpectedState$str() {
        return "WFLYEJB0448: Transaktion '%1$s' ist in unerwartetem Status (%2$s)";
    }
    @Override
    protected String mdbClassCannotBeAnInterface$str() {
        return "WFLYEJB0120: [Enterprise Beans 3.1-Spezifikation, Abschnitt 5.6.2] Message-Driven Bean-Implementierungsklasse darf keine Schnittstelle sein - %1$s ist eine Schnittstelle, kann also nicht als Message-Driven Bean in Betracht gezogen werden";
    }
    @Override
    protected String failToInvokeTimeout$str() {
        return "WFLYEJB0343: Kann Timeout-Methode nicht aufrufen, da %1$s keine Timeout-Methode ist";
    }
    @Override
    protected String defaultInterceptorsNotSpecifyOrder$str() {
        return "WFLYEJB0414: Standard-Interzeptoren können kein <interceptor-order>-Element in ejb-jar.xml angeben";
    }
    @Override
    protected String failedToPersistTimerOnStartup$str() {
        return "WFLYEJB0497: Fehler beim Beenden des Timers %1$s beim Start. Dies liegt wahrscheinlich an einem anderen Clustermitglied, das die gleiche Änderung vornimmt, und sollte den Betrieb nicht beeinträchtigen.";
    }
    @Override
    protected String cannotDeactivateHomeServant$str() {
        return "WFLYEJB0146: Kann Home Servant nicht deaktivieren";
    }
    @Override
    protected String failToCallgetRollbackOnly$str() {
        return "WFLYEJB0173: Enterprise Beans 3.1 FR 13.6.1 Nur Beans mit Container-Managed Transaktionsdemarkation können getRollbackOnly verwenden.";
    }
    @Override
    protected String failToLookupStrippedJNDI$str() {
        return "WFLYEJB0181: Lookup von jndi-Name %1$s nicht möglich in Kontext: %2$s";
    }
    @Override
    protected String suspensionComplete$str() {
        return "WFLYEJB0493: Unterbrechung des Jakarta Enterprise Beans-Subsystems abgeschlossen";
    }
    @Override
    protected String failedToCreateSessionForStatefulBean$str() {
        return "WFLYEJB0423: Konnte Session für stateful Bean %1$s nicht erstellen";
    }
    @Override
    protected String unknownComponentDescriptionType$str() {
        return "WFLYEJB0365: Unbekannter Jakarta Enterprise Beans-Komponentenbeschreibungstyp %1$s";
    }
    @Override
    protected String failedToRefreshTimers$str() {
        return "WFLYEJB0456: Erneutes Laden von Timern für %1$s fehlgeschlagen";
    }
    @Override
    protected String failToLinkToEmptySecurityRole$str() {
        return "WFLYEJB0194: Kann nicht zu einer Null oder leeren Sicherheitsrolle verknüpfen: %1$s";
    }
    @Override
    protected String invalidScheduleExpressionType$str() {
        return "WFLYEJB0291: Ungültiger Wert: %1$s da %2$s Werte der Typen %3$s nicht unterstützt";
    }
    @Override
    protected String transactionAlreadyRolledBack$str() {
        return "WFLYEJB0447: Transaktion '%1$s' wurde bereits zurückgesetzt";
    }
    @Override
    protected String ejbMustNotBeInnerClass$str() {
        return "WFLYEJB0128: Jakarta Enterprise Beans %1$s vom Typ %2$s dürfen keine innere Klasse sein";
    }
    @Override
    protected String deploymentRemoveListenerException$str() {
        return "WFLYEJB0142: Ausnahme beim Aufruf des Listeners für entfernte Deployments";
    }
    @Override
    protected String failedToGetStatus$str() {
        return "WFLYEJB0157: Abruf von Status fehlgeschlagen";
    }
    @Override
    protected String timerIsActive$str() {
        return "WFLYEJB0446: Der Timer \"%1$s\" ist bereits aktiv.";
    }
    @Override
    protected String failureDuringLoadOfClusterNodeSelector$str() {
        return "WFLYEJB0049: Konnte keine Instanz von Cluster-Knoten-Selektor %1$s für Cluster %2$s erstellen";
    }
    @Override
    protected String skipOverlappingInvokeTimeout$str() {
        return "WFLYEJB0043: Eine frühere Ausführung von Timer %1$s ist noch aktiv, diese überlappende geplante Ausführung wird übersprungen um: %2$s";
    }
    @Override
    protected String timerNotRunning$str() {
        return "WFLYEJB0489: Timer %1$s wird nicht ausgeführt, da die Transaktion nicht gestartet werden konnte";
    }
    @Override
    protected String failProcessInvocation$str() {
        return "WFLYEJB0363: %1$s kann Methode %2$s von Ansichtsklasse %3$s nicht handhaben. Erwartete Ansichtsmethode %4$s an Ansichtsklasse %5$s";
    }
    @Override
    protected String wrongTransactionIsolationConfiguredForTimer$str() {
        return "WFLYEJB0460: Die Transaktionsisolation muss gleich oder strenger sein als READ_COMMITTED, um sicher zu stellen, dass der Timer einmal und nur einmal ausgeführt wird";
    }
    @Override
    protected String nextExpirationIsNull$str() {
        return "WFLYEJB0017: Keine Ablauf Zeitpunkt (=NULL), es wird keine neue Task geplant für den Timer %1$S";
    }
    @Override
    protected String invalidTimerNotCalendarBaseTimer$str() {
        return "WFLYEJB0329: Timer %1$s ist kein Kalender-basierter Timer";
    }
    @Override
    protected String notStatefulSessionBean$str() {
        return "WFLYEJB0053: %1$s ist kein stateful Session Bean in App: %2$s Modul: %3$s distinct-name: %4$s";
    }
    @Override
    protected String invalidComponentState$str() {
        return "WFLYEJB0370: Jakarta Enterprise Beans-Komponente für Adresse %1$s ist im %n Status %2$s, muss im Status %3$s sein";
    }
    @Override
    protected String componentIsShuttingDown$str() {
        return "WFLYEJB0421: Aufruf kann nicht fortfahren, da Komponente herunterfährt";
    }
    @Override
    protected String annotationApplicableOnlyForMethods$str() {
        return "WFLYEJB0057: Annotation %1$s ist nur gültig an Methodenzielen";
    }
    @Override
    protected String invokerIsNull$str() {
        return "WFLYEJB0303: Invoker kann nicht Null sein";
    }
    @Override
    protected String unknownTxAttributeOnInvocation$str() {
        return "WFLYEJB0061: Unbekanntes Transaktionsattribut %1$s an Aufruf %2$s";
    }
    @Override
    protected String failedToCreateDeploymentNodeSelector$str() {
        return "WFLYEJB0125: Konnte keine Instanz von Deployment-Knoten-Selector %1$s erstellen";
    }
    @Override
    protected String cannotCall$str() {
        return "WFLYEJB0376: Aufruf von %1$s über %2$s oder %3$s nicht möglich";
    }
    @Override
    protected String groupCreationContextAlreadyExists$str() {
        return "WFLYEJB0404: Gruppenerstellungskontext existiert bereits";
    }
    @Override
    protected String timerInvocationFailed$str() {
        return "WFLYEJB0468: Timer-Aufruf fehlgeschlagen";
    }
    @Override
    protected String failedToActivateMdb$str() {
        return "WFLYEJB0501: Aktivierung von MDB %1$s fehlgeschlagen";
    }
    @Override
    protected String passivationFailed$str() {
        return "WFLYEJB0400: Passivierung von %1$s fehlgeschlagen";
    }
    @Override
    protected String beanWithLocalAnnotationImplementsMoreThanOneInterface$str() {
        return "WFLYEJB0083: Bean %1$s legt @Local-Annotation fest, implementiert aber nicht 1 Schnittstelle";
    }
    @Override
    protected String couldNotFindClassLoaderForStub$str() {
        return "WFLYEJB0382: Konnte ClassLoader für Stub %1$s nicht bestimmen";
    }
    @Override
    protected String duplicateCacheEntry$str() {
        return "WFLYEJB0397: %1$s existiert bereits im Cache";
    }
    @Override
    protected String failToRestoreTimersForObjectId$str() {
        return "WFLYEJB0031: Konnte Timer für %1$s nicht wiederherstellen";
    }
    @Override
    protected String failToCreateDirectoryForPersistTimers$str() {
        return "WFLYEJB0032: Konnte kein Verzeichnis %1$s zum Persistieren von Jakarta Enterprise Beans-Timern erstellen.";
    }
    @Override
    protected String failToAddClassToLocalView$str() {
        return "WFLYEJB0220: [Enterprise Bean 3.1-Spezifikation, Abschnitt 4.9.7] - Kann nicht Ansichts-Klasse: %1$s als lokale Ansicht hinzufügen, da sie bereits als Remote-Ansicht für Bean: %2$s markiert ist";
    }
    @Override
    protected String failToUpgradeToWriteLock$str() {
        return "WFLYEJB0238: Enterprise Beans 3.1 PFD2 4.8.5.1.1 Aktualisierung einer Lese-Sperre zu einer Schreib-Sperre ist nicht erlaubt";
    }
    @Override
    protected String failedToAnalyzeRemoteInterface$str() {
        return "WFLYEJB0084: Konnte Remote-Schnittstelle für %1$s nicht analysieren";
    }
    @Override
    protected String viewNotFound$str() {
        return "WFLYEJB0051: Konnte keine Ansicht %1$s für Jakarta Enterprise Beans %2$s finden";
    }
    @Override
    protected String failToFindMethodWithParameterTypes$str() {
        return "WFLYEJB0261: Methode %1$s konnte nicht gefunden werden. %2$s mit Parameter-Typen %3$s referenziert in ejb-jar.xml";
    }
    @Override
    protected String beanHomeInterfaceIsNull$str() {
        return "WFLYEJB0171: Bean %1$s hat kein Home-Interface";
    }
    @Override
    protected String invalidComponentType$str() {
        return "WFLYEJB0356: Der Jakarta Enterprise Beans-Komponententyp %1$s unterstützt keine Pools";
    }
    @Override
    protected String failToGetEjbComponent$str() {
        return "WFLYEJB0276: EJBComponent wurde nicht im aktuellen Aufruf-Kontext %1$s festgelegt";
    }
    @Override
    protected String profileAndRemotingEjbReceiversUsedTogether$str() {
        return "WFLYEJB0465: Ungültige Client-Deskriptorkonfiguration: \"profile\" und \"remoting-ejb-receivers\" können nicht zusammen verwendet werden";
    }
    @Override
    protected String ejbNotFoundInDeployment$str() {
        return "WFLYEJB0056: Es konnten keine Jakarta Enterprise Beans im passenden Deployment gefunden werden: %1$s";
    }
    @Override
    protected String clusteredAnnotationIsNotApplicableForBean$str() {
        return "WFLYEJB0412: %1$s fehlgeschlagen, da @Clustered-Annotation nicht für %2$s Bean an Klasse %3$s verwendet werden kann";
    }
    @Override
    protected String concurrentAccessTimeoutException$str() {
        return "WFLYEJB0241: Enterprise Beans 3.1 PFD2 4.8.5.5.1 nebenläufiger Zugriffs-Timeout an %1$s - Erhalt einer Sperre innerhalb von %2$s nicht möglich";
    }
    @Override
    protected String componentInstanceNotAvailable$str() {
        return "WFLYEJB0225: Komponenteninstanz ist nicht für den Aufruf verfügbar: %1$s";
    }
    @Override
    protected String statefulSessionIdIsNull$str() {
        return "WFLYEJB0234: Session-ID ist für stateful-Komponente %1$s nicht eingestellt";
    }
    @Override
    protected String cannotUnregisterEJBHomeFromCobra$str() {
        return "WFLYEJB0145: Kann Eintrag von EJBHome nicht aus CORBA Naming Service entfernen";
    }
    @Override
    protected String setRollbackOnlyFailed$str() {
        return "WFLYEJB0005: Setzen RollbackOnly ist fehlgeschlagen; Ignoriert";
    }
    @Override
    protected String moreThanOneMethodWithSameNameOnComponent$str() {
        return "WFLYEJB0096: Mehr als eine Methode mit dem Namen %1$s auf %2$s gefunden";
    }
    @Override
    protected String txPresentForNeverTxAttribute$str() {
        return "WFLYEJB0063: Transaktion auf dem Server vorhanden in Never call (Enterprise Beans 3 13.6.2.6)";
    }
    @Override
    protected String noJNDIBindingsForSessionBean$str() {
        return "WFLYEJB0111: Es werden keine jndi-Bindings für Jakarta Enterprise Beans %1$s erstellt, da keine Views ausgesetzt sind";
    }
    @Override
    protected String componentIsNull$str() {
        return "WFLYEJB0239: %1$s kann nicht Null sein";
    }
    @Override
    protected String databaseDialectNotConfiguredOrDetected$str() {
        return "WFLYEJB0462: Datenbankattribut des Timer-Dienstes database-data-store ist nicht konfiguriert und wird nicht von den Verbindungsmetadaten oder dem Namen des JDBC-Treibers erkannt.";
    }
    @Override
    protected String lockAcquisitionInterrupted$str() {
        return "WFLYEJB0394: Erwerb von Sperre an %1$s fehlgeschlagen";
    }
    @Override
    protected String failToReadTimerInformation$str() {
        return "WFLYEJB0026: Konnte keine Timer-Informationen für die Jakarta Enterprise Beans-Komponente %1$s lesen";
    }
    @Override
    protected String dynamicStubCreationFailed$str() {
        return "WFLYEJB0037: Dynamische Stub-Kreation für Klasse %1$s fehlgeschlagen";
    }
    @Override
    protected String clusteredAnnotationNotYetImplementedForSingletonBean$str() {
        return "WFLYEJB0411: @Clustered-Annotation wird derzeit nicht für Singleton Jakarta Enterprise Beans unterstützt. %1$s ist fehlgeschlagen, da %2$s Bean an Klasse %3$s mit @Clustered markiert ist";
    }
    @Override
    protected String timerInvocationRolledBack$str() {
        return "WFLYEJB0110: Timer-Aufruf fehlgeschlagen, Transaktion zurückgesetzt";
    }
    @Override
    protected String failToCallEjbCreateForHomeInterface$str() {
        return "WFLYEJB0275: Konnte entsprechende ejbCreate- oder @Init-Methode für Home-Interface-Methode %1$s auf Jakarta Enterprise Beans %2$s nicht auflösen";
    }
    @Override
    protected String illegalCallToEjbHomeRemove$str() {
        return "WFLYEJB0073: Unzulässiger Aufruf an EJBHome.remove(Object) an einem Session-Bean";
    }
    @Override
    protected String failToCallBusinessOnNonePublicMethod$str() {
        return "WFLYEJB0224: Keine Geschäftsmethode %1$s. Rufen Sie keine nicht-öffentlichen Methoden auf Jakarta Enterprise Beans auf";
    }
    @Override
    protected String ejbMustBePublicClass$str() {
        return "WFLYEJB0129: Jakarta Enterprise Beans %1$s vom Typ %2$s müssen als öffentlich deklariert werden";
    }
    @Override
    protected String failToLookupJNDI$str() {
        return "WFLYEJB0179: Konnte kein Lookup des jndi-Namens durchführen: %1$s";
    }
    @Override
    protected String couldNotFindViewMethodOnEjb$str() {
        return "WFLYEJB0384: Konnte keine Methode %1$s aus der Ansicht %2$s auf Jakarta Enterprise Beans-Klasse %3$s finden";
    }
    @Override
    protected String moreThanOneEjbFound4$str() {
        return "WFLYEJB0407: Mehr als eine Jakarta Enterprise Beans mit Schnittstelle vom Typ '%1$s' und Name '%2$s' für Binding %3$s gefunden. Gefunden: %4$s";
    }
    @Override
    protected String incorrectEJBLocatorForBean$str() {
        return "WFLYEJB0099: Der bereitgestellte Locator %1$s war nicht für Jakarta Enterprise Beans %2$s";
    }
    @Override
    protected String businessInterfaceIsNull$str() {
        return "WFLYEJB0221: Business Interface-Typ kann nicht Null sein";
    }
    @Override
    protected String sessionBeanClassCannotBeAnInterface$str() {
        return "WFLYEJB0118: [Enterprise Beans 3.1-Spezifikation, Abschnitt 4.9.2] Session Bean-Implementierungsklasse DARF KEINE Schnittstelle sein - %1$s ist eine Schnittstelle, wird also nicht als Session-Bean in Betracht gezogen";
    }
    @Override
    protected String failedToAcquirePermit$str() {
        return "WFLYEJB0378: Erwerb einer Genehmigung innerhalb von %1$s %2$s fehlgeschlagen";
    }
    @Override
    protected String cannotCallGetPKOnSessionBean$str() {
        return "WFLYEJB0075: Kann nicht getPrimaryKey an einem Session Bean aufrufen";
    }
    @Override
    protected String missingCacheEntry$str() {
        return "WFLYEJB0398: %1$s fehlt im Cache";
    }
    @Override
    protected String couldNotWriteMethodInvocation$str() {
        return "WFLYEJB0150: Konnte Fehler beim Aufruf von Methode %1$s an Bean namens %2$s für Appname %3$s Modulname %4$s distinctname %5$s nicht schreiben wegen";
    }
    @Override
    protected String viewInterfaceCannotBeNull$str() {
        return "WFLYEJB0065: View-Interface kann nicht Null sein";
    }
    @Override
    protected String exceptionRunningTimerTask$str() {
        return "WFLYEJB0164: Ausnahme beim Ausführen der Timer-Task für Timer %1$s auf Jakarta Enterprise Beans %2$s";
    }
    @Override
    protected String failToCloseFile$str() {
        return "WFLYEJB0030: Fehler beim Schließen der Datei ";
    }
    @Override
    protected String rmiRemoteExceptionCannotBeApplicationException$str() {
        return "WFLYEJB0080: [Enterprise Beans 3.1-Spezifikation, Abschnitt 14.1.1] Ausnahme-Klasse: %1$s kann nicht als Applikationsausnahme markiert werden, da dem Typ java.rmi.RemoteException entsprechend";
    }
    @Override
    protected String multipleMethodReferencedInEjbJarXml$str() {
        return "WFLYEJB0260: Mehr als eine Methode %1$s für Klasse %2$s referenziert in ejb-jar.xml gefunden. Spezifizieren Sie die Parameter-Typen, um die Mehrdeutigkeit aufzulösen";
    }
    @Override
    protected String ejbNotExposedOverIIOP$str() {
        return "WFLYEJB0036: Jakarta Enterprise Beans-Bean%1$s wird nicht durch einen Stub ersetzt, da er nicht über IIOP verfügbar ist";
    }
    @Override
    protected String invalidTimerHandlersForPersistentTimers$str() {
        return "WFLYEJB0327: %1$s Timer-Handhabungen sind nur für persistente Timer verfügbar.";
    }
    @Override
    protected String couldNotDetermineLocalInterfaceFromLocalHome$str() {
        return "WFLYEJB0438: Konnte lokales Interface vom Home-Interface %1$s für Bean %2$s nicht bestimmen";
    }
    @Override
    protected String onlySetterMethodsAllowedToHaveEJBAnnotation$str() {
        return "WFLYEJB0090: @EJB-Einspeisungsziel %1$s ist ungültig. Es sind nur Setter-Methoden gestattet";
    }
    @Override
    protected String mustOnlyBeSingleContainerTransactionElementWithWildcard$str() {
        return "WFLYEJB0454: Es darf nur eine Instanz mit ejb-name * für <container-transaction> vorhanden sein.";
    }
    @Override
    protected String acquireSemaphoreInterrupted$str() {
        return "WFLYEJB0379: Erwerb von Semaphore wurde unterbrochen";
    }
    @Override
    protected String cannotLoadServerInterceptorModule$str() {
        return "WFLYEJB0514: Server-Interzeptormodul %1$s kann nicht geladen werden";
    }
    @Override
    protected String timerUpdateFailedAndRollbackNotPossible$str() {
        return "WFLYEJB0461: Aktualisierung des Timers fehlgeschlagen, und es war nicht möglich, die Transaktion zurückzusetzen!";
    }
    @Override
    protected String deploymentAddListenerException$str() {
        return "WFLYEJB0141: Ausnahme beim Aufruf des Listeners für hinzugefügte Deployments";
    }
    @Override
    protected String timerFileStoreDirNotExist$str() {
        return "WFLYEJB0345: Speicher-Verzeichnis %1$s für Timer-Datei existiert nicht";
    }
    @Override
    protected String paramCannotBeNull$str() {
        return "WFLYEJB0416: %1$s kann nicht Null sein";
    }
    @Override
    protected String failedToObtainSSLContext$str() {
        return "WFLYEJB0494: SSLContext konnte nicht abgerufen werden";
    }
    @Override
    protected String failedToLookupORB$str() {
        return "WFLYEJB0100: Auffinden fehlgeschlagen für java:comp/ORB";
    }
    @Override
    protected String failToLoadComponentClass$str() {
        return "WFLYEJB0262: Konnte Komponentenklasse für Komponente %1$s nicht laden";
    }
    @Override
    protected String entityBeansAreNotSupported$str() {
        return "WFLYEJB0450: Entity Beans werden nicht mehr unterstützt, Beans %1$s können nicht deployt werden";
    }
    @Override
    protected String multipleCreateMethod$str() {
        return "WFLYEJB0267: Konnte Typ von entsprechendem, implizierten Enterprise Beans 2.x lokalem Interface (siehe Enterprise Beans 3.1 21.4.5)%n nicht bestimmen aufgrund mehrerer create* Methoden mit unterschiedlichen Wiedergabetypen an Home %1$s";
    }
    @Override
    protected String txRequiredForInvocation$str() {
        return "WFLYEJB0062: Transaktion ist erforderlich für Aufruf %1$s";
    }
    @Override
    protected String couldNotDetermineEjbRefForInjectionTarget$str() {
        return "WFLYEJB0088: Konnte Typ von ejb-ref %1$s für Einspeisungsziel %2$s nicht bestimmen";
    }
    @Override
    protected String jndiBindings$str() {
        return "WFLYEJB0473: JNDI-Bindings für Session-Bean namens \"%1$s\" in Deployment-Einheit \"%2$s\" lauten:%3$s";
    }
    @Override
    protected String activationConfigPropertyIgnored$str() {
        return "WFLYEJB0006: ActivationConfigProperty %1$s wird ignoriert, da vom Ressourcenadapter nicht zugelassen: %2$s";
    }
    @Override
    protected String nameAttributeRequiredForEJBAnnotationOnClass$str() {
        return "WFLYEJB0091: @EJB-Attribut 'name' wird für Annotationen auf Klassenebene benötigt. Klasse: %1$s";
    }
    @Override
    protected String failToMergeData$str() {
        return "WFLYEJB0264: Konnte Daten für %1$s nicht zusammenführen";
    }
    @Override
    protected String beanComponentMissingEjbObject$str() {
        return "WFLYEJB0222: Bean %1$s hat kein %2$s";
    }
    @Override
    protected String failToCallSetRollbackOnlyOnNoneCMB$str() {
        return "WFLYEJB0182: Enterprise Beans 3.1 FR 13.6.1 Nur Beans mit Container-Managed Transaktionsdemarkation können setRollbackOnly verwenden.";
    }
    @Override
    protected String failToFindMethodInEjbJarXml$str() {
        return "WFLYEJB0259: Methode %1$s konnte nicht gefunden werden. %2$s referenziert in ejb-jar.xml";
    }
    @Override
    protected String ejbMethodMustNotBeFinalNorStatic$str() {
        return "WFLYEJB0131: Jakarta Enterprise Beans %1$s sollten keine endgültige oder statische Methode haben (%2$s)";
    }
    @Override
    protected String setRollbackOnlyNotAllowedForSupportsTxAttr$str() {
        return "WFLYEJB0074: Enterprise Beans 3.1 FR 13.6.2.8 setRollbackOnly nicht zulässig mit dem SUPPORT-Transaktionsattribut";
    }
    @Override
    protected String rmiIiopVoliation$str() {
        return "WFLYEJB0471: RMI/IIOP-Verstoß: %1$s%n";
    }
    @Override
    protected String mdbOnMessageMethodCantBeFinal$str() {
        return "WFLYEJB0503: [Jakarta Enterprise Beans 3.2-Spezifikation, Abschnitt 5.6.4] Message-Driven-Bean-Methode 'onMessage' kann nicht final sein (MDB: %1$s).";
    }
    @Override
    protected String defaultInterceptorClassNotListed$str() {
        return "WFLYEJB0010: Standard-Interzeptorklasse %1$s ist nicht im Abschnitt <interceptors> von ejb-jar.xml aufgeführt und wird nicht angewendet";
    }
    @Override
    protected String EjbJarConfigurationIsNull$str() {
        return "WFLYEJB0184: EjbJarConfiguration kann nicht Null sein";
    }
    @Override
    protected String aroundTimeoutMethodExpectedWithInvocationContextParam$str() {
        return "WFLYEJB0058: Die Methode %1$s der Klasse %2$s, die mit @jakarta.interceptor.AroundTimeout kommentiert ist, sollte einen einzelnen Parameter vom Typ jakarta.interceptor.InvocationContext akzeptieren.";
    }
    @Override
    protected String cannotBeginUserTransaction$str() {
        return "WFLYEJB0491: Die Anfrage zum Transaktionsstart wurde abgelehnt, da der Container angehalten wurde";
    }
    @Override
    protected String missingClassInAnnotation$str() {
        return "WFLYEJB0521: Einige Klassen, die durch die Annotation %1$s in Klasse %2$s referenziert werden, fehlen.";
    }
    @Override
    protected String couldNotDetermineRemoteInterfaceFromHome$str() {
        return "WFLYEJB0437: Konnte Remote-Interface vom Home-Interface %1$s für Bean %2$s nicht bestimmen";
    }
    @Override
    protected String couldNotCreateTable$str() {
        return "WFLYEJB0163: Kann keine Tabelle für Timer-Persistenz erstellen";
    }
    @Override
    protected String timerNotFound$str() {
        return "WFLYEJB0526: Timer %1$s existiert nicht";
    }
    @Override
    protected String couldNotDetermineEjbLocalRefForInjectionTarget$str() {
        return "WFLYEJB0089: Konnte Typ von ejb-local-ref %1$s für Einspeisungsziel %2$s nicht bestimmen";
    }
    @Override
    protected String componentNotInstanceOfSessionComponent$str() {
        return "WFLYEJB0236: Komponente %1$s mit Komponentenklasse: %2$s%n ist keine %3$s Komponente";
    }
    @Override
    protected String invocationOfMethodNotAllowed$str() {
        return "WFLYEJB0364: Aufruf an Methode: %1$s von Bean: %2$s ist nicht gestattet";
    }
    @Override
    protected String failToLookupJNDINameSpace$str() {
        return "WFLYEJB0180: Lookup von jndi-Name %1$s nicht möglich, da es nicht zu Namespace java:app, java:module, java:comp oder java:global gehört";
    }
    @Override
    protected String couldNotCreateCorbaObject$str() {
        return "WFLYEJB0098: Konnte kein CORBA-Objekt für %1$s erstellen";
    }
    @Override
    protected String unsupportedEJBReceiverProtocol$str() {
        return "WFLYEJB0536: Nicht unterstütztes EJB-Empfängerprotokoll %1$s";
    }
    @Override
    protected String invalidComponentConfiguration$str() {
        return "WFLYEJB0348: %1$s ist keine Jakarta Enterprise Beans-Komponente";
    }
    @Override
    protected String reentrantSingletonCreation$str() {
        return "WFLYEJB0132: @PostConstruct-Methode von Jakarta Enterprise Beans-Singleton %1$s vom Typ %2$s wurde rekursiv aufgerufen";
    }
    @Override
    protected String invalidSecurityForDomainSet$str() {
        return "WFLYEJB0347: Jakarta Enterprise Beans %1$s sind für die Sicherheit aktiviert, aber es ist keine Sicherheitsdomäne festgelegt";
    }
    @Override
    protected String clusteredEJBsBoundToINADDRANY$str() {
        return "WFLYEJB0509: Geclusterte Jakarta Enterprise Beans in Knoten: %1$s sind an INADDR_ANY(%2$s) gebunden. Verwenden Sie entweder eine Nicht-Platzhalter-Server-Bind-Adresse oder fügen Sie Client-Mapping-Einträge zu der entsprechenden Socket-Bindung für den Remoting-Konnektor hinzu";
    }
    @Override
    protected String failToLoadAppExceptionClassInEjbJarXml$str() {
        return "WFLYEJB0271: Konnte Anwendungsausnahmeklasse %1$s in ejb-jar.xml nicht laden";
    }
    @Override
    protected String cannotRemoveWhileParticipatingInTransaction$str() {
        return "WFLYEJB0386: Jakarta Enterprise Beans 4.6.4 Jakarta Enterprise Beans können nicht über die Methode remove() von Enterprise Beans 2.x entfernt werden, während an einer Transaktion teilgenommen wird";
    }
    @Override
    protected String timerServiceWithIdNotRegistered$str() {
        return "WFLYEJB0338: Timerservice mit timedObjectId: %1$s ist nicht registriert";
    }
    @Override
    protected String failedToLoadViewClass$str() {
        return "WFLYEJB0087: Konnte Ansicht %1$s nicht laden";
    }
    @Override
    protected String noAsynchronousInvocationInProgress$str() {
        return "WFLYEJB0244: Kein laufender asynchroner Aufruf";
    }
    @Override
    protected String mappedNameNotSupported$str() {
        return "WFLYEJB0525: Der 'mappedName' in Jakarta Enterprise Beans-Annotationen wird nicht unterstützt. Der Wert von '%1$s' für Jakarta Enterprise Beans '%2$s' wird ignoriert.";
    }
    @Override
    protected String mdbOnMessageMethodCantBePrivate$str() {
        return "WFLYEJB0504: [Jakarta Enterprise Beans 3.2-Spezifikation, Abschnitt 5.6.4] Message-Driven-Bean-Methode 'onMessage' kann nicht privat sein (MDB: %1$s).";
    }
    @Override
    protected String ejbMustNotBeFinalClass$str() {
        return "WFLYEJB0130: Jakarta Enterprise Beans %1$s vom Typ %2$s dürfen nicht als endgültig deklariert werden";
    }
    @Override
    protected String strictPoolDerivedFromCPUs$str() {
        return "WFLYEJB0482: Strenger Pool %1$s verwendet eine maximale Instanzengröße von %2$d (pro Klasse), die von der Anzahl der CPUs auf dem Host abgeleitet wird.";
    }
    @Override
    protected String ejbJarConfigNotFound$str() {
        return "WFLYEJB0195: EjbJarConfiguration nicht als Anhang in Deployment-Einheit gefunden: %1$s";
    }
    @Override
    protected String resourceAdapterRepositoryUnAvailable$str() {
        return "WFLYEJB0044: Ressourcen-Adapter-Repository ist nicht verfügbar";
    }
    @Override
    protected String invalidTransactionTypeForSfsbLifecycleMethod$str() {
        return "WFLYEJB0463: Ungültiger Transaktionsattribut-Typ %1$s auf SFSB-Lebenszyklus-Methode %2$s der Klasse %3$s, gültige Typen sind REQUIRES_NEW und NOT_SUPPORTED. Methode wird als NOT_SUPPORTED behandelt.";
    }
    @Override
    protected String exceptionCheckingIfTimerShouldRun$str() {
        return "WFLYEJB0502: Ausnahmeprüfung, ob der Timer %1$s ausgeführt werden soll";
    }
    @Override
    protected String wrongTxOnThread$str() {
        return "WFLYEJB0060: Falscher tx auf Thread: erwartet %1$s, tatsächlich %2$s";
    }
    @Override
    protected String unknownMessageListenerType$str() {
        return "WFLYEJB0383: Kein Message Listener vom Typ %1$s in Ressourcenadapter %2$s gefunden";
    }
    @Override
    protected String unknownDeployment$str() {
        return "WFLYEJB0055: Kein passendes Deployment für Jakarta Enterprise Beans: %1$s";
    }
    @Override
    protected String skipInvokeTimeoutDuringRetry$str() {
        return "WFLYEJB0162: Eine frühere Ausführung von Timer %1$s wird erneut versucht, geplante Ausführung wird übersprungen um: %2$s";
    }
    @Override
    protected String messageEndpointAlreadyReleasedISE$str() {
        return "WFLYEJB0535: Nachrichtenendpunkt %1$s wurde bereits freigegeben";
    }
    @Override
    protected String failToLinkFromEmptySecurityRole$str() {
        return "WFLYEJB0193: Kann nicht von einer Null oder leeren Sicherheitsrolle verknüpfen: %1$s";
    }
    @Override
    protected String executorIsNull$str() {
        return "WFLYEJB0305: Executor kann nicht Null sein";
    }
    @Override
    protected String sessionTypeNotSpecified$str() {
        return "WFLYEJB0413: <session-type> für Jakarta Enterprise Beans %1$s nicht angegeben. Dies muss in ejb-jar.xml vorhanden sein";
    }
    @Override
    protected String singletonCantImplementSessionBean$str() {
        return "WFLYEJB0515: [Jakarta Enterprise Beans 3.2 Spez., Abschnitt 4.9.2] Singleton Session Beans dürfen die Schnittstelle 'jakarta.ejb.SessionBean' nicht implementieren. Diese Schnittstelle von Bean '%1$s' wird ignoriert und sollte entfernt werden.";
    }
    @Override
    protected String unexpectedErrorRolledBack$str() {
        return "WFLYEJB0457: Unerwarteter Fehler";
    }
    @Override
    protected String timerNotActive$str() {
        return "WFLYEJB0024: Timer %1$s ist nicht aktiv, Wiederholung wird übersprungen.";
    }
    @Override
    protected String failedToRemoveManagementResources$str() {
        return "WFLYEJB0143: Entfernung von Management-Ressourcen für %1$s -- %2$s fehlgeschlagen";
    }
    @Override
    protected String inconsistentAttributeNotSupported$str() {
        return "WFLYEJB0451: Attribut \"%1$s\" wird auf aktuellen Serverversionen nicht unterstützt; es ist nur zulässig, wenn dessen Wert \"%2$s\" entspricht";
    }
    @Override
    protected String couldNotFindEjbForLocatorIIOP$str() {
        return "WFLYEJB0035: Jakarta Enterprise Beans Bean für Locator %1$s konnte nicht gefunden werden, Jakarta Enterprise Beans Client-Proxy wird nicht ersetzt";
    }
    @Override
    protected String noComponentRegisteredForAddress$str() {
        return "WFLYEJB0368: Keine Jakarta Enterprise Beans-Komponente registriert für Adresse %1$s";
    }
    @Override
    protected String unknownComponentType$str() {
        return "WFLYEJB0357: Unbekannter Jakarta Enterprise Beans-Komponententyp %1$s";
    }
    @Override
    protected String invocationFailed0$str() {
        return "WFLYEJB0533: Aufruf fehlgeschlagen";
    }
    @Override
    protected String timerRetried$str() {
        return "WFLYEJB0021: Timer: %1$s wird wiederholt";
    }
    @Override
    protected String mdbDeliveryStopped$str() {
        return "WFLYEJB0476: MDB-Auslieferung gestoppt: %1$s,%2$s";
    }
    @Override
    protected String invalidScheduleValue$str() {
        return "WFLYEJB0286: Ungültiger Zeitplan %1$s, Wert: %2$s";
    }
    @Override
    protected String wrongReturnTypeForAsyncMethod$str() {
        return "WFLYEJB0270: Async Methode %1$s gibt nicht void oder Future zurück";
    }
    @Override
    protected String invalidValuesRange$str() {
        return "WFLYEJB0294: Ungültiger Wert: %1$s Gültige Werte liegen zwischen %2$s und %3$s";
    }
    @Override
    protected String moreThanOneEjbFound3$str() {
        return "WFLYEJB0408: Mehr als eine Jakarta Enterprise Beans mit Schnittstelle vom Typ '%1$s' für Binding %2$s gefunden. Gefunden: %3$s";
    }
    @Override
    protected String lifecycleMethodNotAllowed$str() {
        return "WFLYEJB0374: %1$s nicht gestattet in Lebenszyklus-Methoden";
    }
    @Override
    protected String exceptionPersistTimerState$str() {
        return "WFLYEJB0508: Status %1$s des Timers konnte aufgrund von %2$s nicht beibehalten werden";
    }
    @Override
    protected String containerSuspended$str() {
        return "WFLYEJB0467: Die Anfrage wurde abgewiesen, da der Container angehalten wurde";
    }
    @Override
    protected String typeSpecViolation$str() {
        return "WFLYEJB0517: [Jakarta Enterprise Beans 3.2 Spezifikation, Abschnitt 4.1] Spezifikationsverletzung für Klasse %1$s. Session Jakarta Enterprise Beans sollten nur einen der folgenden Typen aufweisen: Stateful, Stateless, Singleton.";
    }
    @Override
    protected String getTxManagerStatusFailed$str() {
        return "WFLYEJB0004: Abrufen des tx-Manager-Status ist fehlgeschlagen, wird ignoriert";
    }
    @Override
    protected String unknownEJBLocatorType$str() {
        return "WFLYEJB0097: Unbekannter Jakarta Enterprise Beans-Locator-Typ %1$s";
    }
    @Override
    protected String SecurityRolesIsNull$str() {
        return "WFLYEJB0185: Kann nicht Sicherheitsrollen auf null setzen";
    }
    @Override
    protected String sessionBeanClassMustBePublicNonAbstractNonFinal$str() {
        return "WFLYEJB0119: [Enterprise Beans 3.1-Spezifikation, Abschnitt 4.9.2] Session Bean-Implementierungsklasse MUSS öffentlich sein, nicht abstrakt und nicht endgültig - %1$s wird nicht als Session-Bean betrachtet, da es diese Voraussetzung nicht erfüllt";
    }
    @Override
    protected String moduleNotAttachedToDeploymentUnit$str() {
        return "WFLYEJB0093: Kein Modul an Deployment-Einheit %1$s angehängt";
    }
    @Override
    protected String failToRestoreTimers$str() {
        return "WFLYEJB0028: %1$s ist kein Verzeichnis, konnte Timer nicht wiederherstellen";
    }
    @Override
    protected String twoEjbBindingsSpecifyAbsoluteOrder$str() {
        return "WFLYEJB0258: Zwei ejb-jar.xml Bindungen für %1$s spezifizieren eine absolute Reihenfolge";
    }
    @Override
    protected String failToInvokeTimerServiceDoLifecycle$str() {
        return "WFLYEJB0325: Kann Timer-Service-Methoden in Lebenszyklus-Callback von nicht-Singleton Beans nicht aufrufen";
    }
    @Override
    protected String cannotCallMethodInAfterCompletion$str() {
        return "WFLYEJB0388: Kann Methode %1$s nicht nach afterCompletion-Callback aufrufen";
    }
    @Override
    protected String asymmetricCacheUsage$str() {
        return "WFLYEJB0445: Asymmetrische Verwendung von Cache erkannt";
    }
    @Override
    protected String cobraInterfaceRepository$str() {
        return "WFLYEJB0144: CORBA-Interface-Repository für %1$s: %2$s";
    }
    @Override
    protected String failToLoadEjbClass$str() {
        return "WFLYEJB0265: Die Jakarta Enterprise Beans-Klasse %1$s konnte nicht geladen werden";
    }
    @Override
    protected String wildcardContainerTransactionElementsMustHaveWildcardMethodName$str() {
        return "WFLYEJB0455: <container-transaction>-Elemente, die den Jakarta Enterprise Beans-Platzhalternamen * verwenden, können nur einen Methodennamen von * verwenden";
    }
    @Override
    protected String failToCallSetRollbackOnlyWithNoTx$str() {
        return "WFLYEJB0183: setRollbackOnly() ohne Transaktion nicht gestattet.";
    }
    @Override
    protected String cannotDeactivateBeanServant$str() {
        return "WFLYEJB0147: Kann Bean Servant nicht deaktivieren";
    }
    @Override
    protected String beanLocalHomeInterfaceIsNull$str() {
        return "WFLYEJB0172: Bean %1$s hat kein lokales Home-Interface";
    }
    @Override
    protected String timerServiceIsNotActive$str() {
        return "WFLYEJB0139: Der Timerdienst wurde deaktiviert. Fügen Sie einen <timer-service>-Eintrag zum Jakarta Enterprise Beans-Abschnitt der Serverkonfiguration hinzu, um ihn zu aktivieren.";
    }
    @Override
    protected String stringParamCannotBeNullOrEmpty$str() {
        return "WFLYEJB0385: %1$s kann nicht Null oder leer sein";
    }
    @Override
    protected String clusteredAnnotationIsNotApplicableForMDB$str() {
        return "WFLYEJB0409: @Clustered-Annotation kann nicht mit Message-Driven-Beans benutzt werden. %1$s ist fehlgeschlagen, da %2$s Bean an Klasse %3$s mit @Clustered markiert ist";
    }
    @Override
    protected String exceptionRepositoryNotFound$str() {
        return "WFLYEJB0472: Kann Ausnahmen-Repository ID nicht abrufen für %1$s:%n%2$s";
    }
    @Override
    protected String mdbOnMessageMethodCantBeStatic$str() {
        return "WFLYEJB0505: [Jakarta Enterprise Beans 3.2-Spezifikation, Abschnitt 5.6.4] Message-Driven-Bean-Methode 'onMessage' kann nicht statisch sein (MDB: %1$s).";
    }
    @Override
    protected String failToInvokegetTimeoutMethod$str() {
        return "WFLYEJB0341: Kann getTimeoutMethod nicht an einem Timer aufrufen, der kein Auto-Timer ist";
    }
    @Override
    protected String invalidTimerFileStoreDir$str() {
        return "WFLYEJB0346: Speicher-Verzeichnis %1$s für Timer-Datei ist kein Verzeichnis";
    }
    @Override
    protected String errorDuringRetryTimeout$str() {
        return "WFLYEJB0022: Fehler beim Wiederholen des Timeouts für Timer: %1$s";
    }
    @Override
    protected String ejbNotFound2$str() {
        return "WFLYEJB0406: Keine Jakarta Enterprise Beans mit Schnittstelle vom Typ '%1$s' für Bindung '%2$s' gefunden";
    }
    @Override
    protected String incompatibleCaches$str() {
        return "WFLYEJB0399: Inkompatible Cache-Implementierungen in verschachtelter Hierarchie";
    }
    @Override
    protected String defaultInterceptorsNotBindToMethod$str() {
        return "WFLYEJB0256: Standard-Interzeptoren können keine Methode festlegen, um in ejb-jar.xml zu binden";
    }
    @Override
    protected String bothMethodIntAndClassNameSet$str() {
        return "WFLYEJB0237: sowohl methodIntf als auch className sind auf %1$s eingestellt";
    }
    @Override
    protected String duplicateSerializationGroupMember$str() {
        return "WFLYEJB0395: %1$s ist bereits ein Mitglied von Serialisierungsgruppe %2$s";
    }
    @Override
    protected String retryingTimeout$str() {
        return "WFLYEJB0023: Wiederholung des Timeouts für Timer: %1$s";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYEJB0469: Indexierte Unterressourcen können nur registriert werden, wenn die übergeordnete Ressource geordnete Unterelemente unterstützt. Das übergeordnete Element von '%1$s' ist nicht indexiert";
    }
    @Override
    protected String invocationNotApplicableForMethodInvocation$str() {
        return "WFLYEJB0240: Aufruf-Kontext: %1$s kann nicht verarbeitet werden, weil es nicht für einen Methodenaufruf anwendbar ist";
    }
    @Override
    protected String messageEndpointAlreadyReleased$str() {
        return "WFLYEJB0102: Nachrichtenendpunkt %1$s wurde bereits freigegeben";
    }
    @Override
    protected String suspensionWaitingActiveTransactions$str() {
        return "WFLYEJB0492: Unterbrechung von Jakarta Enterprise Beans-Subsystem wartet auf aktive Transaktionen. %1$d Transaktion(en) ausstehend";
    }
    @Override
    protected String failedToRetrieveTimerInfo$str() {
        return "WFLYEJB0529: Informationen für Timer konnten nicht aus der Datenbank abgerufen werden: %1$s";
    }
    @Override
    protected String deprecatedAnnotation$str() {
        return "WFLYEJB0166: Die @%1$s-Annotation ist veraltet und wird ignoriert.";
    }
    @Override
    protected String componentNotSetInInterceptor$str() {
        return "WFLYEJB0169: Komponente in InterceptorContext nicht eingestellt: %1$s";
    }
    @Override
    protected String localHomeNotAllow$str() {
        return "WFLYEJB0274: Local-Home für %1$s nicht zugelassen";
    }
    @Override
    protected String ejbBusinessMethodMustBePublic$str() {
        return "WFLYEJB0528: Jakarta Enterprise Beans-Geschäftsmethode %1$s muss öffentlich sein";
    }
    @Override
    protected String authenticationFailed$str() {
        return "WFLYEJB0534: Authentifizierung fehlgeschlagen";
    }
    @Override
    protected String failedToInstallManagementResource$str() {
        return "WFLYEJB0086: Installation von Management-Ressourcen für %1$s fehlgeschlagen";
    }
    @Override
    protected String poolNameCannotBeEmptyString$str() {
        return "WFLYEJB0419: Pool-Name kann kein leerer String für Bean %1$s sein";
    }
    @Override
    protected String clusteredAnnotationIsNotApplicableForEntityBean$str() {
        return "WFLYEJB0410: @Clustered-Annotation kann nicht mit Entity-Beans benutzt werden. %1$s ist fehlgeschlagen, da %2$s Bean an Klasse %3$s mit @Clustered markiert ist";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYEJB0530: Die Bereitstellung ist so konfiguriert, dass eine veraltete Sicherheitsdomäne '%1$s' verwendet wird, die nicht mehr unterstützt wird.";
    }
    @Override
    protected String unknownDatabaseName$str() {
        return "WFLYEJB0532: Die in der Konfiguration erkannte Datenbank ist '%1$s'. Wenn dies nicht korrekt ist, geben Sie bitte die richtige Datenbank an.";
    }
    @Override
    protected String timerPersistenceNotEnable$str() {
        return "WFLYEJB0016: Timer Persistenz nicht aktiviert, der Persistente Timer ist nach einem JVM Neustart nicht mehr vorhanden.";
    }
    @Override
    protected String failedToSetRollbackOnly$str() {
        return "WFLYEJB0064: Transaktion konnte nicht auf nur Rollback eingestellt werden";
    }
    @Override
    protected String invalidFilterSpec$str() {
        return "WFLYEJB0519: Ungültige Unmarshalling-Filterspezifikation %1$s; Spezifikationen müssen Muster für die Übereinstimmung von Klassen- oder Paketnamen beschreiben";
    }
    @Override
    protected String timerHasExpired$str() {
        return "WFLYEJB0330: Timer %1$s ist abgelaufen";
    }
    @Override
    protected String invalidTimerParameter$str() {
        return "WFLYEJB0306: Ungültiger Timer-Parameter: %1$s = %2$s";
    }
    @Override
    protected String aroundTimeoutMethodMustReturnObjectType$str() {
        return "WFLYEJB0059: Die Methode %1$s der Klasse %2$s, die mit @jakarta.interceptor.AroundTimeout kommentiert ist, muss den Typ 'Object' zurückgeben.";
    }
    @Override
    protected String invalidValueForSecondInScheduleExpression$str() {
        return "WFLYEJB0109: Ungültiger Wert für Sekunde: %1$s";
    }
    @Override
    protected String ignoringException$str() {
        return "WFLYEJB0018: Ausnahme während setRollbackOnly wurde ignoriert!";
    }
    @Override
    protected String discardingStatefulComponent$str() {
        return "WFLYEJB0007: Verwerfen von stateful-Komponenteninstanz: %1$s aufgrund von Ausnahme";
    }
    @Override
    protected String timerCannotBeAdded$str() {
        return "WFLYEJB0524: Timer %1$s kann nicht Null sein";
    }
    @Override
    protected String unknownOperations$str() {
        return "WFLYEJB0367: Unbekannte Operation %1$s";
    }
    @Override
    protected String passivationDirectoryCreationFailed$str() {
        return "WFLYEJB0402: Erstellen von Passivierungsverzeichnis fehlgeschlagen: %1$s";
    }
    @Override
    protected String failToLoadViewClassEjb$str() {
        return "WFLYEJB0349: Konnte Ansichtsklasse für ejb %1$s nicht laden";
    }
    @Override
    protected String invocationFailed2$str() {
        return "WFLYEJB0034: Jakarta Enterprise Beans-Aufruf auf Komponente %1$s für Methode %2$s fehlgeschlagen";
    }
    @Override
    protected String ejbHasNoTimerMethods$str() {
        return "WFLYEJB0140: Dieses Jakarta Enterprise Beans verfügt über keine Timeout-Methoden";
    }
    @Override
    protected String cacheEntryNotInUse$str() {
        return "WFLYEJB0393: Cache-Eintrag %1$s ist nicht in Gebrauch";
    }
    @Override
    protected String failedToProcessBusinessInterfaces$str() {
        return "WFLYEJB0466: Fehler bei der Verarbeitung von Geschäftsschnittstellen für Jakarta Enterprise Beans-Klasse %1$s";
    }
    @Override
    protected String missingMdbDeliveryGroup$str() {
        return "WFLYEJB0477: MDB-Auslieferungsgruppe fehlt: %1$s";
    }
    @Override
    protected String serverInterceptorNoEmptyConstructor$str() {
        return "WFLYEJB0512: Server-Interzeptorklasse %1$s hat keinen No-Parameter-Konstruktor";
    }
    @Override
    protected String multipleSecurityDomainsDetected$str() {
        return "WFLYEJB0490: Mehrere Sicherheitsdomains werden nicht unterstützt";
    }
    @Override
    protected String transactionPropagationNotSupported$str() {
        return "WFLYEJB0387: Transaktionsfortpflanzung über IIOP wird nicht unterstützt";
    }
    @Override
    protected String strictPoolDerivedFromWorkers$str() {
        return "WFLYEJB0481: Strenger Pool %1$s verwendet eine maximale Instanzengröße von %2$d (pro Klasse), die von der Größe des Thread-Worker-Pools abgeleitet wird.";
    }
    @Override
    protected String timerNotDeployed$str() {
        return "WFLYEJB0523: Timer %1$s wurde nicht eingesetzt";
    }
    @Override
    protected String incompatibleSerializationGroup$str() {
        return "WFLYEJB0391: %1$s ist nicht kompatibel mit Serialisierungsgruppe %2$s";
    }
    @Override
    protected String currentComponentNotAEjb$str() {
        return "WFLYEJB0373: Die aktuelle Komponente ist keine Jakarta Enterprise Beans-Bean %1$s";
    }
    @Override
    protected String noNamespaceContextSelectorAvailable$str() {
        return "WFLYEJB0178: Kein NamespaceContextSelector verfügbar, Lookup von %1$s nicht möglich";
    }
    @Override
    protected String failToCallEjbRefByDependsOn$str() {
        return "WFLYEJB0269: Mehr als eine Jakarta Enterprise Beans namens %1$s referenziert durch die @DependsOn-Annotation in %2$s Komponenten:%3$s";
    }
    @Override
    protected String endpointUnAvailable$str() {
        return "WFLYEJB0046: Endpunkt ist nicht verfügbar für Message-driven Komponente %1$s";
    }
    @Override
    protected String roleNamesIsNull$str() {
        return "WFLYEJB0255: <role-name> kann nicht null oder leer in <security-role-ref>%n sein für Bean: %1$s";
    }
    @Override
    protected String transactionNotComplete2$str() {
        return "WFLYEJB0159: BMT stateful Bean '%1$s' hat Benutzertransaktion nicht ordnungsgemäß abgeschlossen status=%2$s";
    }
    @Override
    protected String notAnObjectImpl$str() {
        return "WFLYEJB0101: %1$s ist kein ObjectImpl";
    }
    @Override
    protected String remappingCacheAttributes$str() {
        return "WFLYEJB0486: Parameter \"default-clustered-sfsb-cache\" wurde für die \"add\"-Operation für Ressource \"%1$s\" definiert. Dieser Parameter ist veraltet und dessen Verhalten wurde dem Attribut \"default-sfsb-cache\" neu zugewiesen. Infolgedessen wurde das Attribut \"default-sfsb-cache\" auf \"%2$s\" gesetzt und das Attribut \"default-sfsb-passivation-disabled-cache\" wurde auf \"%3$s\" gesetzt.";
    }
    @Override
    protected String missingSerializationGroupMember$str() {
        return "WFLYEJB0396: %1$s ist kein Mitglied von Serialisierungsgruppe %2$s";
    }
    @Override
    protected String failToFindEjbRefByDependsOn$str() {
        return "WFLYEJB0268: Jakarta Enterprise Beans %1$s, die von der @DependsOn-Annotation referenziert werden, konnten nicht gefunden werden in %2$s";
    }
    @Override
    protected String passivationPathNotADirectory$str() {
        return "WFLYEJB0403: Erstellen von Passivierungsverzeichnis fehlgeschlagen: %1$s";
    }
    @Override
    protected String unknownTimezoneId$str() {
        return "WFLYEJB0015: Unbekannte Zeitzonen-ID: %1$s gefunden im Schedule-Ausdruck. Wert wird ignoriert und die Zeitzone %2$s des Servers verwendet.";
    }
    @Override
    protected String failToCreateTimerFileStoreDir$str() {
        return "WFLYEJB0344: Konnte Speicher-Verzeichnis %1$s für Timer-Datei nicht anlegen";
    }
    @Override
    protected String defaultPoolExpressionCouldNotBeResolved$str() {
        return "WFLYEJB0522: Der Standard-Poolname %1$s konnte nicht aus seinem Wert %2$s aufgelöst werden";
    }
    @Override
    protected String ejbMustHavePublicDefaultConstructor$str() {
        return "WFLYEJB0127: Jakarta Enterprise Beans %1$s vom Typ %2$s müssen einen öffentlichen Standardkonstruktor haben";
    }
    @Override
    protected String failToCallgetRollbackOnlyOnNoneTransaction$str() {
        return "WFLYEJB0174: getRollbackOnly() ohne Transaktion nicht gestattet.";
    }
    @Override
    protected String missingRunAsAnnotation$str() {
        return "WFLYEJB0510: @RunAs-Annotation erforderlich, wenn @RunAsPrincipal für Klasse %1$s verwendet wird";
    }
    @Override
    protected String mdbClassMustBePublicNonAbstractNonFinal$str() {
        return "WFLYEJB0121: [Enterprise Beans 3.1-Spezifikation, Abschnitt 5.6.2] Message-Driven Bean-Implementierungsklasse MUSS öffentlich sein, nicht abstrakt und nicht endgültig - %1$s wird nicht als Message-Driven Bean betrachtet, da sie diese Voraussetzung nicht erfüllt";
    }
    @Override
    protected String exceptionGeneratingSessionId$str() {
        return "WFLYEJB0151: Ausnahme bei Generierung von Session-ID für Komponente %1$s mit Aufruf %2$s";
    }
    @Override
    protected String deprecatedNamespace$str() {
        return "WFLYEJB0167: Das Element <%2$s xmlns=\"%1$s\"/> wird ignoriert.";
    }
    @Override
    protected String invalidEjbComponent$str() {
        return "WFLYEJB0350: Komponente mit dem Namen %1$s mit Komponentenklasse %2$s ist keine Jakarta Enterprise Beans-Komponente";
    }
    @Override
    protected String failedToCreateEJBClientInterceptor$str() {
        return "WFLYEJB0496: Eine Instanz für Interzeptor für Jakarta Enterprise Beans-Client konnte nicht erstellt werden %1$s";
    }
    @Override
    protected String logMDBStart$str() {
        return "WFLYEJB0042: Message-Driven Bean \"%1$s\" mit Ressourcenadapter %2$s gestartet";
    }
    @Override
    protected String poolConfigIsEmpty$str() {
        return "WFLYEJB0218: PoolConfig kann nicht Null oder leer sein";
    }
    @Override
    protected String componentClassHasMultipleTimeoutAnnotations$str() {
        return "WFLYEJB0372: Komponentenklasse %1$s hat mehrere @Timeout-Annotationen";
    }
    @Override
    protected String unauthorizedAccessToUserTransaction$str() {
        return "WFLYEJB0137: Nur Session und Message-driven Beans mit vom Bean gemanagter Transaktionsdemarkierung dürfen auf UserTransaction zugreifen";
    }
    @Override
    protected String timerWasCanceled$str() {
        return "WFLYEJB0331: Timer %1$s wurde abgebrochen";
    }
    @Override
    protected String cannotCallMethod$str() {
        return "WFLYEJB0389: Kann %1$s nicht aufrufen, wenn Status %2$s ist";
    }
    @Override
    protected String transactionNotComplete1$str() {
        return "WFLYEJB0443: Enterprise Beans 3.1 FR 13.3.3: BMT Bean %1$s sollte Transaktion vor Wiedergabe beenden.";
    }
    @Override
    protected String timerIsNull$str() {
        return "WFLYEJB0326: Timer kann nicht Null sein";
    }
    @Override
    protected String noEjbContextAvailable$str() {
        return "WFLYEJB0420: Kein EjbContext verfügbar, da kein Jakarta Enterprise Beans-Aufruf aktiv ist";
    }
    @Override
    protected String ejb2xViewNotApplicableForSingletonBeans$str() {
        return "WFLYEJB0076: Singleton-Beans können keine Enterprise Beans 2.x-Ansichten haben";
    }
    @Override
    protected String beanInterfaceAttributeRequiredForEJBAnnotationOnClass$str() {
        return "WFLYEJB0092: @EJB-Attribut 'beanInterface' wird für Annotationen auf Klassenebene benötigt. Klasse: %1$s";
    }
    @Override
    protected String timerServiceMethodNotAllowedForSFSB$str() {
        return "WFLYEJB0449: Timerservice-API ist nicht erlaubt auf stateful Session Bean %1$s";
    }
    @Override
    protected String timerReinstatementFailed$str() {
        return "WFLYEJB0161: Wiedereinsetzung des Timers '%1$s' (id=%2$s) aus dessen persistentem Status fehlgeschlagen";
    }
    @Override
    protected String cacheEntryInUse$str() {
        return "WFLYEJB0392: Cache-Eintrag %1$s ist in Gebrauch";
    }
    @Override
    protected String mdbDeliveryStarted$str() {
        return "WFLYEJB0475: MDB-Auslieferung gestartet: %1$s,%2$s";
    }
    @Override
    protected String noSuchEndpointException$str() {
        return "WFLYEJB0045: Konnte keinen Endpunkt für Ressourcen-Adapter %1$s finden";
    }
    @Override
    protected String ejbLocalObjectUnavailable$str() {
        return "WFLYEJB0078: Bean %1$s besitzt kein EJBLocalObject";
    }
    @Override
    protected String getRollBackOnlyIsNotAllowWithSupportsAttribute$str() {
        return "WFLYEJB0223: Jakarta Enterprise Beans 3.1 FR 13.6.2.9 getRollbackOnly ist nicht erlaubt mit SUPPORTS-Attribut";
    }
    @Override
    protected String failToCompleteTaskBeforeTimeOut$str() {
        return "WFLYEJB0202: Aufgabe nicht in %1$s %2$S abgeschlossen";
    }
    @Override
    protected String unexpectedInvocationState$str() {
        return "WFLYEJB0487: Unerwarteter Aufrufstatus %1$s";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYEJB0366: Unbekanntes Attribut %1$s";
    }
    @Override
    protected String existingSerializationGroup$str() {
        return "WFLYEJB0390: %1$s ist bereits mit Serialisierungsgruppe %2$s assoziiert";
    }
    @Override
    protected String couldNotFindEjb$str() {
        return "WFLYEJB0168: Konnte Jakarta Enterprise Beans mit ID %1$s nicht finden";
    }
    @Override
    protected String invalidTransactionTypeForMDB$str() {
        return "WFLYEJB0485: Transaktionstyp %1$s ist nicht spezifiziert für die Methode %2$s der Message Driven Bean %3$s. Er wird als NOT_SUPPORTED behandelt.";
    }
    @Override
    protected String ejbNotFound3$str() {
        return "WFLYEJB0405: Keine Jakarta Enterprise Beans mit Schnittstelle vom Typ '%1$s' und Namen '%2$s' für Bindung %3$s gefunden";
    }
    @Override
    protected String mdbCantHaveFinalizeMethod$str() {
        return "WFLYEJB0506: [Jakarta Enterprise Beans 3.2-Spezifikation, Abschnitt 5.6.2] Message-Driven-Bean kann keine 'finalize'-Methode haben. (MDB: %1$s).";
    }
    @Override
    protected String invalidEjbLocalInterface$str() {
        return "WFLYEJB0273: %1$s verfügt nicht über eine lokale Enterprise Beans 2.x-Schnittstelle";
    }
    @Override
    protected String unknownSessionBeanType$str() {
        return "WFLYEJB0095: Unbekannter Session-Bean-Typ %1$s";
    }
    @Override
    protected String invalidListValue$str() {
        return "WFLYEJB0292: Ein Listenwert kann nur entweder einen Bereich oder einen individuellen Wert enthalten. Ungültiger Wert: %1$s";
    }
    @Override
    protected String disableDefaultEjbPermissionsCannotBeTrue$str() {
        return "WFLYEJB0464: Das Attribut \"disable-default-ejb-permissions\" darf nicht auf \"true\" gesetzt sein";
    }
    @Override
    protected String failedToLoadViewClassForComponent$str() {
        return "WFLYEJB0068: Konnte View-Klasse nicht laden für Komponente %1$s";
    }
    @Override
    protected String notAllowedFromStatefulBeans$str() {
        return "WFLYEJB0377: %1$s ist nicht gestattet von stateful Beans";
    }
    @Override
    protected String exceptionPersistPostTimerState$str() {
        return "WFLYEJB0507: Status %1$s des Timers konnte nicht beibehalten werden. Der Timer muss manuell wiederhergestellt werden.";
    }
    @Override
    protected String mdbDoesNotImplementNorSpecifyMessageListener$str() {
        return "WFLYEJB0094: Enterprise Beans 3.1 FR 5.4.2 MessageDrivenBean %1$s implementiert weder 1 Schnittstelle noch definiert es das Message-Listener-Interface";
    }
    @Override
    protected String ejbJarConfigNotBeenSet$str() {
        return "WFLYEJB0214: EjbJarConfiguration nicht eingestellt in %1$s Kann keine Komponente erstellen Dienst für Jakarta Enterprise Beans %2$S";
    }
    @Override
    protected String failedToRollback$str() {
        return "WFLYEJB0158: Rollback fehlgeschlagen";
    }
    @Override
    protected String cannotResolveFilteredClass$str() {
        return "WFLYEJB0518: Ausnahme bei Auflösung der Klasse %1$s für Unmarshalling; sie wurde entweder gesperrt oder nicht zugelassen";
    }
    @Override
    protected String errorInvokeTimeout$str() {
        return "WFLYEJB0020: Fehler beim Aufrufen eines Timeouts für Timer: %1$s";
    }
    @Override
    protected String methodNotImplemented$str() {
        return "WFLYEJB0206: Noch nicht implementiert";
    }
    @Override
    protected String unexpectedComponent$str() {
        return "WFLYEJB0213: Unerwartete Komponente: %1$s Komponente erwartet %2$s";
    }
    @Override
    protected String mutuallyExclusiveAttributes$str() {
        return "WFLYEJB0483: Attribute schließen sich gegenseitig aus: %1$s, %2$s";
    }
    @Override
    protected String loadedPersistentTimerInTimeout$str() {
        return "WFLYEJB0480: Timer (%1$s) geladen für Jakarta Enterprise Beans (%2$s) und diesen Knoten, dessen Kennzeichnung besagt, dass er sich in einem Timeout befindet. Der ursprüngliche Timeout wurde möglicherweise nicht verarbeitet. Bitte fahren Sie ordnungsgemäß herunter, um sicherzustellen, dass Timeout-Tasks abgeschlossen werden, bevor beendet wird.";
    }
    @Override
    protected String failedToPersistTimer$str() {
        return "WFLYEJB0453: Persistieren von Timer %1$s fehlgeschlagen";
    }
    @Override
    protected String serverInterceptorInvalidMethod$str() {
        return "WFLYEJB0513: Methode %1$s in Server-Interzeptor %2$s annotiert mit %3$s verfügt über eine ungültige Signatur";
    }
    @Override
    protected String annotationOnlyAllowedOnClass$str() {
        return "WFLYEJB0081: %1$s-Annotation ist nur bei Klassen erlaubt. %2$s ist keine Klasse";
    }
    @Override
    protected String unknownChannelCreationOptionType$str() {
        return "WFLYEJB0436: Unbekannter Channel-Erstellungsoptionstyp %1$s";
    }
    @Override
    protected String failureDuringEndpointDeactivation$str() {
        return "WFLYEJB0047: Endpunkt für Message-driven Komponente %1$s konnte nicht deaktiviert werden";
    }
    @Override
    protected String failToObtainLock$str() {
        return "WFLYEJB0228: Enterprise Beans 3.1 FR 4.3.14.1 nebenläufiger Zugriffs-Timeout an %1$s - Erhalt einer Sperre innerhalb von %2$s %3$s nicht möglich";
    }
    @Override
    protected String unexpectedError$str() {
        return "WFLYEJB0442: Unerwarteter Fehler";
    }
    @Override
    protected String timerInvocationFailedDueToInvokerNotBeingStarted$str() {
        return "WFLYEJB0107: Timer Aufruf fehlgeschlagen, aufrufende Instanz nicht gestartet";
    }
    @Override
    protected String cannotReadStrictMaxPoolDerivedSize$str() {
        return "WFLYEJB0499: Kann die abgeleitete Größe nicht lesen - Dienst %1$s nicht erreichbar";
    }
    @Override
    protected String taskWasCancelled$str() {
        return "WFLYEJB0203: Aufgabe wurde abgebrochen";
    }
    @Override
    protected String failToLoadDeclaringClassOfTimeOut$str() {
        return "WFLYEJB0342: Konnte deklarierende Klasse nicht laden: %1$s der Timeout-Methode";
    }
    @Override
    protected String activationFailed$str() {
        return "WFLYEJB0401: Aktivierung von %1$s fehlgeschlagen";
    }
    @Override
    protected String failedToMarshalEjbParameters$str() {
        return "WFLYEJB0054: Marshalling von Parametern für Jakarta Enterprise Beans fehlgeschlagen";
    }
    @Override
    protected String noMoreTimeoutForTimer$str() {
        return "WFLYEJB0328: Keine Timeouts mehr für Timer %1$s";
    }
    @Override
    protected String iiopBindings$str() {
        return "WFLYEJB0516: IIOP-Bindings für Session Bean namens \"%1$s\" in Deployment-Einheit \"%2$s\" lauten: %3$s";
    }
    @Override
    protected String failToObtainLockIllegalType$str() {
        return "WFLYEJB0242: Unzulässiger Sperrtyp %1$s an %2$s für Komponente %3$s";
    }
    @Override
    protected String relativeResourceAdapterNameInStandaloneModule$str() {
        return "WFLYEJB0459: Modul %1$s, das Bean %2$s enthält, ist nicht in EAR deployt, sondern legt einen Ressourcenadapternamen '%3$s' in einem relativen Format fest.";
    }
    @Override
    protected String jndiNameCannotBeNull$str() {
        return "WFLYEJB0177: jndi-Name kann während des Lookup nicht Null sein";
    }
    @Override
    protected String legacyClientMappingsRegistryProviderInUse$str() {
        return "WFLYEJB0531: Kein Client-Mapping-Registrierungsanbieter gefunden für %1$s; Verwendung von Legacy-Provider basierend auf statischer Konfiguration";
    }
    @Override
    protected String connectorNotConfiguredForEJBClientInvocations$str() {
        return "WFLYEJB0527: Remoting-Konnektor (Adresse %1$s, Port %2$s) ist nicht korrekt für EJB-Client-Aufrufe konfiguriert. Konnektor muss im connectors-Attribut <remote/> aufgeführt sein, um EJB-Client-Aufrufe zu empfangen.";
    }
    @Override
    protected String asyncInvocationOnlyApplicableForSessionBeans$str() {
        return "WFLYEJB0052: Kann keinen asynchronen lokalen Aufruf für Komponente durchführen, die kein Session Bean ist";
    }
    @Override
    protected String componentViewNotAvailableInContext$str() {
        return "WFLYEJB0196: ComponentViewInstance nicht verfügbar in Interzeptorkontext: %1$s";
    }
    @Override
    protected String multipleAnnotationsOnBean$str() {
        return "WFLYEJB0266: Nur eine %1$s-Methode ist für Bean %2$s zugelassen";
    }
    @Override
    protected String failToRestoreTimersFromFile$str() {
        return "WFLYEJB0029: Konnte Timer aus %1$s nicht wiederherstellen";
    }
    @Override
    protected String timerHandleIsNotActive$str() {
        return "WFLYEJB0339: Timer für Handle mit Timer-ID: %1$s, timedObjectId: %2$s ist nicht aktiv";
    }
    @Override
    protected String logInconsistentAttributeNotSupported$str() {
        return "WFLYEJB0474: Attribut \"%1$s\" wird auf aktuellen Serverversionen nicht unterstützt; es ist nur zulässig, wenn dessen Wert \"%2$s\" entspricht. Dieses Attribut sollte entfernt werden.";
    }
}
