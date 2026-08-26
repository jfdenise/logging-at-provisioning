package org.jboss.as.ejb3.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:16+0200")
public class EjbLogger_$logger_fr extends EjbLogger_$logger implements EjbLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public EjbLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToCreateOptionForProperty$str() {
        return "WFLYEJB0050: N'a pas pu lire la propriété %1$s à cause de %2$s";
    }
    @Override
    protected String beanWithRemoteAnnotationImplementsMoreThanOneInterface$str() {
        return "WFLYEJB0082: Bean %1$s indique une annotation @Remote, mais n'implémente pas d'interface";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYEJB0085: Exception lors de la lecture de %1$s";
    }
    @Override
    protected String removeMethodIsNull$str() {
        return "WFLYEJB0235: L'identifiant de méthode @Remove ne peut pas être null";
    }
    @Override
    protected String failToCallgetRollbackOnlyAfterTxcompleted$str() {
        return "WFLYEJB0175: getRollbackOnly() non autorisé une fois que la transaction a eu lieu (EJBTHREE-1445)";
    }
    @Override
    protected String methodNameIsNull$str() {
        return "WFLYEJB0170: Le nom de la méthode ne peut pas être null";
    }
    @Override
    protected String invalidEjbEntityTimeout$str() {
        return "WFLYEJB0272: L'entité bean %1$s de Jakarta Enterprise Beans %2$s a implémenté TimedObject, mais a une méthode de délai d'attente différente spécifiée soit via annotations ou via descripteur de déploiement";
    }
    @Override
    protected String cannotBeApplicationExceptionBecauseNotAnExceptionType$str() {
        return "WFLYEJB0079: [EJB 3.1 spec, section 14.1.1] Classe : %1$s ne peut pas être catégorisée en tant qu'exception d'application car elle n'est pas de type java.lang.Exception";
    }
    @Override
    protected String unknownResourceAdapter$str() {
        return "WFLYEJB0199: Aucun adaptateur de ressource n'est enregistré avec un adaptateur de ressource ayant pour nom %1$s";
    }
    @Override
    protected String noComponentAvailableForAddress$str() {
        return "WFLYEJB0369: Aucun composant Jakarta Enterprise Beans n'est disponible pour l'adresse %1$s";
    }
    @Override
    protected String cannotBuildIndexForServerInterceptor$str() {
        return "WFLYEJB0511: Impossible de construire un indice de réflexion pour la classe %1$s d'intercepteur du serveur";
    }
    @Override
    protected String scheduleExpressionDateFromTimerPersistenceInvalid$str() {
        return "WFLYEJB0495: Date de début ou de fin persistante pour l'expression planifiée de la minuterie ayant l'ID :%1$s ignorée, car elle n'est pas valide : %2$s.";
    }
    @Override
    protected String transactionInUnexpectedState$str() {
        return "WFLYEJB0448: La transaction '%1$s' est dans un état inattendu (%2$s)";
    }
    @Override
    protected String mdbClassCannotBeAnInterface$str() {
        return "WFLYEJB0120: [Enterprise Beans 3.1 spec, section 5.6.2] L'implémentation de Bean par message ne DOIT PAS être une interface - %1$s est une interface, donc ne sera pas considérée en tant que Bean basé message";
    }
    @Override
    protected String failToInvokeTimeout$str() {
        return "WFLYEJB0343: Impossible d'invoquer la méthode de timeout car la méthode %1$s n'est pas une méthode de timeout";
    }
    @Override
    protected String defaultInterceptorsNotSpecifyOrder$str() {
        return "WFLYEJB0414: Les intercepteurs par défaut ne peuvent pas spécifier un <interceptor-order> élément dans ejb-jar.xml";
    }
    @Override
    protected String failedToPersistTimerOnStartup$str() {
        return "WFLYEJB0497: Échec de la persistance de la minuterie %1$s au démarrage. Il est possible qu'un autre membre du cluster soit déjà en train d'apporter les mêmes modifications. L'opération ne devrait pas en être affectée.";
    }
    @Override
    protected String cannotDeactivateHomeServant$str() {
        return "WFLYEJB0146: N'a pas pu désactiver le Home Servant";
    }
    @Override
    protected String failToCallgetRollbackOnly$str() {
        return "WFLYEJB0173: Enterprise Beans 3.1 FR 13.6.1 Seuls les beans possédant une démarcation de transaction gérée-conteneur peuvent utiliser getRollbackOnly.";
    }
    @Override
    protected String failToLookupStrippedJNDI$str() {
        return "WFLYEJB0181: N'a pas pu trouver le nom jndi : %1$s en contexte : %2$s";
    }
    @Override
    protected String suspensionComplete$str() {
        return "WFLYEJB0493: Suspension du sous-système Jakarta Enterprise Beans terminée";
    }
    @Override
    protected String failedToCreateSessionForStatefulBean$str() {
        return "WFLYEJB0423: Impossible de créer une session pour bean stateful %1$s";
    }
    @Override
    protected String unknownComponentDescriptionType$str() {
        return "WFLYEJB0365: Type de description de composant Jakarta Enterprise Beans inconnu %1$s";
    }
    @Override
    protected String failedToRefreshTimers$str() {
        return "WFLYEJB0456: N'a pas pu réactualiser les minuteries pour %1$s";
    }
    @Override
    protected String failToLinkToEmptySecurityRole$str() {
        return "WFLYEJB0194: Impossible de se lier vers un rôle de sécurité null ou vide : %1$s";
    }
    @Override
    protected String invalidScheduleExpressionType$str() {
        return "WFLYEJB0291: Valeur non valide : %1$s car %2$s ne prend pas en charge les types de valeurs %3$s";
    }
    @Override
    protected String transactionAlreadyRolledBack$str() {
        return "WFLYEJB0447: Transaction '%1$s' déjà annulée";
    }
    @Override
    protected String ejbMustNotBeInnerClass$str() {
        return "WFLYEJB0128: Les Jakarta Enterprise Beans %1$s de type %2$s ne doivent pas être des classes internes";
    }
    @Override
    protected String deploymentRemoveListenerException$str() {
        return "WFLYEJB0142: Exception lors de l'appel du détecteur de suppression de déploiement";
    }
    @Override
    protected String failedToGetStatus$str() {
        return "WFLYEJB0157: N'a pas pu obtenir de statut";
    }
    @Override
    protected String timerIsActive$str() {
        return "WFLYEJB0446: La minuterie %1$s est déjà active.";
    }
    @Override
    protected String failureDuringLoadOfClusterNodeSelector$str() {
        return "WFLYEJB0049: N'a pas pu créer une instance de sélecteur de noeud de cluster %1$s pour le cluster %2$s";
    }
    @Override
    protected String skipOverlappingInvokeTimeout$str() {
        return "WFLYEJB0043: Une ancienne exécution de la minuterie %1$s est toujours active, évitement du chevauchement d'exécution prévu à : %2$s.";
    }
    @Override
    protected String timerNotRunning$str() {
        return "WFLYEJB0489: Le minuteur %1$s n'est pas en cours d'exécution car la transaction n'a pas pu démarrer";
    }
    @Override
    protected String failProcessInvocation$str() {
        return "WFLYEJB0363: %1$s ne peut pas gérer la méthode %2$s de la classe de vue %3$s. La méthode de vue attendue est %4$s sur la classe de vue %5$s";
    }
    @Override
    protected String wrongTransactionIsolationConfiguredForTimer$str() {
        return "WFLYEJB0460: L'isolation de la transaction doit être égale ou plus stricte que READ_COMMITTED pour veiller à ce que la minuterie exécute une fois et une fois seulement";
    }
    @Override
    protected String nextExpirationIsNull$str() {
        return "WFLYEJB0017: L'expiration suivante est null. Aucune tâche ne sera prévue pour le minuteur %1$S";
    }
    @Override
    protected String invalidTimerNotCalendarBaseTimer$str() {
        return "WFLYEJB0329: La minuterie %1$s n'est pas une minuterie basée calendrier";
    }
    @Override
    protected String notStatefulSessionBean$str() {
        return "WFLYEJB0053: %1$s n'est pas un bean Stateful Session dans l'app: %2$s module: %3$s distinct-name: %4$s";
    }
    @Override
    protected String invalidComponentState$str() {
        return "WFLYEJB0370: Composant Jakarta Enterprise Beans pour l'adresse %1$s est dans %n état %2$s, devrait être en état %3$s";
    }
    @Override
    protected String componentIsShuttingDown$str() {
        return "WFLYEJB0421: L'invocation ne peut pas continuer car le composant est en cours de fermeture";
    }
    @Override
    protected String annotationApplicableOnlyForMethods$str() {
        return "WFLYEJB0057: L'annotation %1$s n'est valide que sur les cibles de méthode";
    }
    @Override
    protected String invokerIsNull$str() {
        return "WFLYEJB0303: Invoker ne peut pas être null";
    }
    @Override
    protected String unknownTxAttributeOnInvocation$str() {
        return "WFLYEJB0061: Attribut de transaction inconnu %1$s sur l'invocation %2$s";
    }
    @Override
    protected String failedToCreateDeploymentNodeSelector$str() {
        return "WFLYEJB0125: N'a pas pu créer une instance de déploiement de sélecteur de noeud %1$s";
    }
    @Override
    protected String cannotCall$str() {
        return "WFLYEJB0376: Impossible d'appeler %1$s quand on invoque via %2$s ou %3$s";
    }
    @Override
    protected String groupCreationContextAlreadyExists$str() {
        return "WFLYEJB0404: Le contexte de création de groupe existe déjà";
    }
    @Override
    protected String timerInvocationFailed$str() {
        return "WFLYEJB0468: L'invocation du minuteur a échoué";
    }
    @Override
    protected String failedToActivateMdb$str() {
        return "WFLYEJB0501: N'a pas pu activer %1$s MDB";
    }
    @Override
    protected String passivationFailed$str() {
        return "WFLYEJB0400: N'a pas pu rendre inactif %1$s";
    }
    @Override
    protected String beanWithLocalAnnotationImplementsMoreThanOneInterface$str() {
        return "WFLYEJB0083: Bean %1$s indique une annotation @Loca, mais n'implémente pas 1 interface";
    }
    @Override
    protected String couldNotFindClassLoaderForStub$str() {
        return "WFLYEJB0382: N'a pas pu déterminer le ClassLoader pour stub %1$s";
    }
    @Override
    protected String duplicateCacheEntry$str() {
        return "WFLYEJB0397: %1$s existe déjà dans le cache";
    }
    @Override
    protected String failToRestoreTimersForObjectId$str() {
        return "WFLYEJB0031: Impossible de restaurer les minuteurs pour %1$s";
    }
    @Override
    protected String failToCreateDirectoryForPersistTimers$str() {
        return "WFLYEJB0032: Impossible de créer un répertoire %1$s pour conserver les informations de minuterie de Jakarta Enterprise Beans.";
    }
    @Override
    protected String failToAddClassToLocalView$str() {
        return "WFLYEJB0220: [Enterprise Beans 3.1 spec, section 4.9.7] - N'a pas pu voir la classe : %1$s comme vue locale car marquée en vue distante pour le bean: %2$s";
    }
    @Override
    protected String failToUpgradeToWriteLock$str() {
        return "WFLYEJB0238: La mise à niveau de EJB 3.1 PFD2 4.8.5.1.1 du verrou en lecture vers le verrou en écriture n'est pas permise";
    }
    @Override
    protected String failedToAnalyzeRemoteInterface$str() {
        return "WFLYEJB0084: N'a pas pu analyser l'interface distante de %1$s";
    }
    @Override
    protected String viewNotFound$str() {
        return "WFLYEJB0051: Impossible de trouver l’affichage %1$s pour Jakarta Enterprise Beans %2$s";
    }
    @Override
    protected String failToFindMethodWithParameterTypes$str() {
        return "WFLYEJB0261: Impossible de trouver la méthode %1$s. %2$s ayant les types de paramètres %3$s référencés dans ejb-jar.xml";
    }
    @Override
    protected String beanHomeInterfaceIsNull$str() {
        return "WFLYEJB0171: Bean %1$s ne possède pas d'interface d'accueil";
    }
    @Override
    protected String invalidComponentType$str() {
        return "WFLYEJB0356: Le type de composant Jakarta Enterprise Beans de type %1$s ne prend pas en charge les pools";
    }
    @Override
    protected String failToGetEjbComponent$str() {
        return "WFLYEJB0276: EJBComponent a été défini dans le contexte d'invocation en cours %1$s";
    }
    @Override
    protected String profileAndRemotingEjbReceiversUsedTogether$str() {
        return "WFLYEJB0465: Configuration de descripteur du client non valide : 'profile' et 'remoting-ejb-receivers' ne peuvent pas être utilisés ensemble";
    }
    @Override
    protected String ejbNotFoundInDeployment$str() {
        return "WFLYEJB0056: Impossible de trouver Jakarta Enterprise Beans dans le déploiement correspondant : %1$s";
    }
    @Override
    protected String clusteredAnnotationIsNotApplicableForBean$str() {
        return "WFLYEJB0412: %1$s a échoué car l'annotation @Clustered ne peut pas être utilisée pour le bean %2$s sur la classe %3$s";
    }
    @Override
    protected String concurrentAccessTimeoutException$str() {
        return "WFLYEJB0241: Le délai d'attente de l'accès concurrent de Enterprise Beans 3.1 PFD2 4.8.5.5.1 sur %1$s - n'a pas pu obtenir de verrou dans %2$s";
    }
    @Override
    protected String componentInstanceNotAvailable$str() {
        return "WFLYEJB0225: L'instance du composant n'est pas disponible à l'invocation : %1$s";
    }
    @Override
    protected String statefulSessionIdIsNull$str() {
        return "WFLYEJB0234: L'id de session n'a pas été défini pour le composant stateful : %1$s";
    }
    @Override
    protected String cannotUnregisterEJBHomeFromCobra$str() {
        return "WFLYEJB0145: N'a pas pu supprimer l'enregistrement d'EJBHome du Service de nommage COBRA";
    }
    @Override
    protected String setRollbackOnlyFailed$str() {
        return "WFLYEJB0005: impossible de définir le rollback uniquement, ignore";
    }
    @Override
    protected String moreThanOneMethodWithSameNameOnComponent$str() {
        return "WFLYEJB0096: On a trouvé plus d'une méthode ayant pour nom %1$s sur %2$s";
    }
    @Override
    protected String txPresentForNeverTxAttribute$str() {
        return "WFLYEJB0063: Transaction présente sur le serveur dans Never call (Enterprise Beans 3 13.6.2.6)";
    }
    @Override
    protected String noJNDIBindingsForSessionBean$str() {
        return "WFLYEJB0111: Aucun lien jndi ne sera créé pour les %1$s Jakarta Enterprise Beans puisqu'aucun affichage n'est exposé";
    }
    @Override
    protected String componentIsNull$str() {
        return "WFLYEJB0239: %1$s ne peut pas être null";
    }
    @Override
    protected String databaseDialectNotConfiguredOrDetected$str() {
        return "WFLYEJB0462: L'attribut de base de données du service de minuterie n'est pas configuré et n'est pas détecté à partir des métadonnées de connexion ou du nom du pilote JDBC.";
    }
    @Override
    protected String lockAcquisitionInterrupted$str() {
        return "WFLYEJB0394: N'a pas pu acquérir le verrou sur %1$s";
    }
    @Override
    protected String failToReadTimerInformation$str() {
        return "WFLYEJB0026: Impossible de lire les informations du minuteur pour le composant Jakarta Enterprise Beans %1$s";
    }
    @Override
    protected String dynamicStubCreationFailed$str() {
        return "WFLYEJB0037: La création de stub dynamique a échoué pour la classe %1$s";
    }
    @Override
    protected String clusteredAnnotationNotYetImplementedForSingletonBean$str() {
        return "WFLYEJB0411: L'annotation @Clustered n'est pas actuellement prise en charge pour le singleton Jakarta Enterprise Beans. %1$s a échoué puisque %2$s bean est marqué avec @Clustered sur la classe %3$s";
    }
    @Override
    protected String timerInvocationRolledBack$str() {
        return "WFLYEJB0110: L'invocation de la minuterie a échoué, la transaction a été restaurée";
    }
    @Override
    protected String failToCallEjbCreateForHomeInterface$str() {
        return "WFLYEJB0275: Impossible de résoudre la méthode @Init ou ejbCreate correspondante pour la méthode d'interface d'accueil %1$s sur Jakarta Enterprise Beans %2$s";
    }
    @Override
    protected String illegalCallToEjbHomeRemove$str() {
        return "WFLYEJB0073: Appel illégal vers EJBHome.remove(Object) sur un session bean";
    }
    @Override
    protected String failToCallBusinessOnNonePublicMethod$str() {
        return "WFLYEJB0224: Pas une méthode d'entreprise %1$s. Ne pas appeler les méthodes non publiques sur Jakarta Enterprise Beans's";
    }
    @Override
    protected String ejbMustBePublicClass$str() {
        return "WFLYEJB0129: Les Jakarta Enterprise Beans %1$s de type %2$s doivent être déclarés publics";
    }
    @Override
    protected String failToLookupJNDI$str() {
        return "WFLYEJB0179: Impossible de rechercher le nom jndi : %1$s";
    }
    @Override
    protected String couldNotFindViewMethodOnEjb$str() {
        return "WFLYEJB0384: Impossible de trouver une méthode %1$s dans l’affichage %2$s sur la classe Jakarta Enterprise Beans %3$s";
    }
    @Override
    protected String moreThanOneEjbFound4$str() {
        return "WFLYEJB0407: Plusieurs Jakarta Enterprise Beans ont été trouvés avec une interface de type '%1$s' ayant pour nom '%2$s' pour la liaison %3$s. Trouvé : %4$s";
    }
    @Override
    protected String incorrectEJBLocatorForBean$str() {
        return "WFLYEJB0099: Le localisateur %1$s fourni n'était pas pour Jakarta Enterprise Beans %2$s";
    }
    @Override
    protected String businessInterfaceIsNull$str() {
        return "WFLYEJB0221: Le type d'interface commerciale ne peut pas être null";
    }
    @Override
    protected String sessionBeanClassCannotBeAnInterface$str() {
        return "WFLYEJB0118: [Enterprise Beans 3.1 spec, section 4.9.2] L'implémentation de Bean de session ne DOIT PAS être une interface - %1$s est une interface, donc ne sera pas considérée comme session bean";
    }
    @Override
    protected String failedToAcquirePermit$str() {
        return "WFLYEJB0378: N'a pas pu acquérir un permis dans %1$s %2$s";
    }
    @Override
    protected String cannotCallGetPKOnSessionBean$str() {
        return "WFLYEJB0075: Ne peut pas appeler getPrimaryKey sur un session bean";
    }
    @Override
    protected String missingCacheEntry$str() {
        return "WFLYEJB0398: %1$s est manquant du cache";
    }
    @Override
    protected String couldNotWriteMethodInvocation$str() {
        return "WFLYEJB0150: N'a pas pu écrire l'erreur d'invocation de méthode pour la méthode %1$s sur le bean nommé %2$s pour appname %3$s modulename %4$s distinctname %5$s en raison de";
    }
    @Override
    protected String viewInterfaceCannotBeNull$str() {
        return "WFLYEJB0065: L'interface de la vue ne peut pas être null";
    }
    @Override
    protected String exceptionRunningTimerTask$str() {
        return "WFLYEJB0164: Exception lors de l'exécution d'une tâche de minuteur %1$s sur Jakarta Enterprise Beans %2$s";
    }
    @Override
    protected String failToCloseFile$str() {
        return "WFLYEJB0030: erreur lors de la fermeture du fichier ";
    }
    @Override
    protected String rmiRemoteExceptionCannotBeApplicationException$str() {
        return "WFLYEJB0080: [EJB 3.1 spec, section 14.1.1] Classe d'exception : %1$s ne peut pas être catégorisée en tant qu'exception d'application car elle est de type java.rmi.RemoteException";
    }
    @Override
    protected String multipleMethodReferencedInEjbJarXml$str() {
        return "WFLYEJB0260: Plus d'une méthode %1$s trouvée sur la classe %2$s référencée dans ejb-jar.xml. Spécifier les types de paramètres pour éviter l'ambiguïté";
    }
    @Override
    protected String ejbNotExposedOverIIOP$str() {
        return "WFLYEJB0036: Haricots Jakarta Enterprise%1$s n'est pas remplacé par un Stub car il n'est pas exposé sur IIOP";
    }
    @Override
    protected String invalidTimerHandlersForPersistentTimers$str() {
        return "WFLYEJB0327: %1$s Les handles de la minuterie ne sont disponibles que pour les minuteries persistantes.";
    }
    @Override
    protected String couldNotDetermineLocalInterfaceFromLocalHome$str() {
        return "WFLYEJB0438: N'a pas pu déterminer l'interface locale de l'interface d'accueil %1$s pour le bean %2$s";
    }
    @Override
    protected String onlySetterMethodsAllowedToHaveEJBAnnotation$str() {
        return "WFLYEJB0090: La cible d'injection @EJB %1$s n'est pas valide. Seules les méthodes getter sont autorisées";
    }
    @Override
    protected String mustOnlyBeSingleContainerTransactionElementWithWildcard$str() {
        return "WFLYEJB0454: Une seule instance sur <container-transaction> peut être présente avec un nom ejb-name de *.";
    }
    @Override
    protected String acquireSemaphoreInterrupted$str() {
        return "WFLYEJB0379: L'acquisition du sémaphore a été interrompue";
    }
    @Override
    protected String cannotLoadServerInterceptorModule$str() {
        return "WFLYEJB0514: Impossible de charger le module d'interception du serveur %1$s";
    }
    @Override
    protected String timerUpdateFailedAndRollbackNotPossible$str() {
        return "WFLYEJB0461: La mise à jour de la minuterie a échoué et il n'a pas été possible de renverser la transaction !";
    }
    @Override
    protected String deploymentAddListenerException$str() {
        return "WFLYEJB0141: Exception lors de l'appel du détecteur d'ajout de déploiement";
    }
    @Override
    protected String timerFileStoreDirNotExist$str() {
        return "WFLYEJB0345: Le répertoire de store de fichier de minuterie %1$s n'existe pas";
    }
    @Override
    protected String paramCannotBeNull$str() {
        return "WFLYEJB0416: %1$s ne peut pas être null";
    }
    @Override
    protected String failedToObtainSSLContext$str() {
        return "WFLYEJB0494: N'a pas pu obtenir un SSLContext";
    }
    @Override
    protected String failedToLookupORB$str() {
        return "WFLYEJB0100: N'a pas pu trouver java:comp/ORB";
    }
    @Override
    protected String failToLoadComponentClass$str() {
        return "WFLYEJB0262: Impossible de charger la classe de composant pour le composant %1$s";
    }
    @Override
    protected String entityBeansAreNotSupported$str() {
        return "WFLYEJB0450: Les EJB d'entité ne sont plus pris en charge, les beans %1$s ne peuvent pas être déployés";
    }
    @Override
    protected String multipleCreateMethod$str() {
        return "WFLYEJB0267: Impossible de déterminer le type d'interface locale EJB 2.x correspondante implicite (voir Enterprise Beans 3.1 21.4.5) %n en raison des divers méthodes create* présentes à type de retour différents sur home %1$s";
    }
    @Override
    protected String txRequiredForInvocation$str() {
        return "WFLYEJB0062: Transaction requise pour l'invocation %1$s";
    }
    @Override
    protected String couldNotDetermineEjbRefForInjectionTarget$str() {
        return "WFLYEJB0088: Impossible de déterminer le type d'ejb-ref %1$s pour la cible d'injection %2$s";
    }
    @Override
    protected String jndiBindings$str() {
        return "WFLYEJB0473: Les liaisons JNDI session bean nommées '%1$s' dans l'unité de développement '%2$s' sont les suivantes :%3$s";
    }
    @Override
    protected String activationConfigPropertyIgnored$str() {
        return "WFLYEJB0006: ActivationConfigProperty %1$s sera ignoré car non autorisé par l'adaptateur de ressources : %2$s";
    }
    @Override
    protected String nameAttributeRequiredForEJBAnnotationOnClass$str() {
        return "WFLYEJB0091: L'attribut @EJB 'name' est requis pour les annotations de niveau de classe. Classe : %1$s";
    }
    @Override
    protected String failToMergeData$str() {
        return "WFLYEJB0264: Impossible de faire merger les données pour %1$s";
    }
    @Override
    protected String beanComponentMissingEjbObject$str() {
        return "WFLYEJB0222: Le bean %1$s n'a pas de %2$s";
    }
    @Override
    protected String failToCallSetRollbackOnlyOnNoneCMB$str() {
        return "WFLYEJB0182: Enterprise Beans 3.1 FR 13.6.1 Seuls les beans possédant une démarcation de transaction gérée-conteneur peuvent utiliser setRollbackOnly.";
    }
    @Override
    protected String failToFindMethodInEjbJarXml$str() {
        return "WFLYEJB0259: Impossible de trouver la méthode %1$s. %2$s est référencé dans ejb-jar.xml";
    }
    @Override
    protected String ejbMethodMustNotBeFinalNorStatic$str() {
        return "WFLYEJB0131: Les Jakarta Enterprise Beans %1$s ne doivent pas avoir de méthode finale ou statique (%2$s)";
    }
    @Override
    protected String setRollbackOnlyNotAllowedForSupportsTxAttr$str() {
        return "WFLYEJB0074: EJB 3.1 FR 13.6.2.8 setRollbackOnly non autorisé avec l'attribut de transaction SUPPORTS";
    }
    @Override
    protected String rmiIiopVoliation$str() {
        return "WFLYEJB0471: Violation RMI/IIOP : %1$s%n";
    }
    @Override
    protected String mdbOnMessageMethodCantBeFinal$str() {
        return "WFLYEJB0503: [Jakarta Enterprise Beans 3.2 spec, section 5.6.4] La méthode 'onMessage' de Message Driven Bean ne peut pas être finale (MDB :%1$s).";
    }
    @Override
    protected String defaultInterceptorClassNotListed$str() {
        return "WFLYEJB0010: Classe d'intercepteur par défaut %1$s non listée dans la section <interceptors> de ejb-jar.xml et ne sera pas appliquée";
    }
    @Override
    protected String EjbJarConfigurationIsNull$str() {
        return "WFLYEJB0184: EjbJarConfiguration ne peut être null";
    }
    @Override
    protected String aroundTimeoutMethodExpectedWithInvocationContextParam$str() {
        return "WFLYEJB0058: La méthode %1$s, sur la classe %2$s, annotée avec @jakarta.interceptor.AroundTimeout est censée accepter un seul paramètre de type jakarta.interceptor.InvocationContext";
    }
    @Override
    protected String cannotBeginUserTransaction$str() {
        return "WFLYEJB0491: Le début de la requête de transaction a été rejetée car le conteneur est en attente";
    }
    @Override
    protected String missingClassInAnnotation$str() {
        return "WFLYEJB0521: Certaines classes référencées par l'annotation : %1$s classe: %2$s sont manquantes.";
    }
    @Override
    protected String couldNotDetermineRemoteInterfaceFromHome$str() {
        return "WFLYEJB0437: N'a pas pu déterminer l'interface distante de l'interface d'accueil %1$s pour le bean %2$s";
    }
    @Override
    protected String couldNotCreateTable$str() {
        return "WFLYEJB0163: N'a pas pu créer de tableau pour la persistance de la minuterie";
    }
    @Override
    protected String timerNotFound$str() {
        return "WFLYEJB0526: La minuterie %1$s n'existe pas";
    }
    @Override
    protected String couldNotDetermineEjbLocalRefForInjectionTarget$str() {
        return "WFLYEJB0089: Impossible de déterminer le type d'ejb-local-ref %1$s pour la cible d'injection %2$s";
    }
    @Override
    protected String componentNotInstanceOfSessionComponent$str() {
        return "WFLYEJB0236: Composant %1$s ayant pour classe de composant : %2$s%n n'est pas un composant %3$s";
    }
    @Override
    protected String invocationOfMethodNotAllowed$str() {
        return "WFLYEJB0364: L'invocation de la méthode : %1$s du bean : %2$s n'est pas autorisée";
    }
    @Override
    protected String failToLookupJNDINameSpace$str() {
        return "WFLYEJB0180: Impossible de rechercher le nom jndi : %1$s car il n'appartient pas aux espace-noms java:app, java:module, java:comp ou Java:global";
    }
    @Override
    protected String couldNotCreateCorbaObject$str() {
        return "WFLYEJB0098: N'a pas pu trouver d'objet COBRA pour %1$s";
    }
    @Override
    protected String unsupportedEJBReceiverProtocol$str() {
        return "WFLYEJB0536: Protocole de récepteur EJB non pris en charge %1$s";
    }
    @Override
    protected String invalidComponentConfiguration$str() {
        return "WFLYEJB0348: %1$s n'est pas un composant Jakarta Enterprise Beans";
    }
    @Override
    protected String reentrantSingletonCreation$str() {
        return "WFLYEJB0132: La méthode @PostConstruct du singleton Jakarta Enterprise Beans %1$s de type %2$s a été invoquée de manière récursive";
    }
    @Override
    protected String invalidSecurityForDomainSet$str() {
        return "WFLYEJB0347: Jakarta Enterprise Beans%1$s est activé pour la sécurité mais n'a pas de domaine de sécurité défini";
    }
    @Override
    protected String clusteredEJBsBoundToINADDRANY$str() {
        return "WFLYEJB0509: Clustered Enterprise Beans dans le neud : %1$s sont liés à INADDR_ANY(%2$s). Utilisez une adresse de liaison de serveur autre qu'une adresse de serveur avec astérix ou ajoutez des entrées de mappage client à la liaison socket correspondante pour le connecteur Remoting";
    }
    @Override
    protected String failToLoadAppExceptionClassInEjbJarXml$str() {
        return "WFLYEJB0271: Impossible de charger la classe d'exception d'application %1$s dans ejb-jar.xml";
    }
    @Override
    protected String cannotRemoveWhileParticipatingInTransaction$str() {
        return "WFLYEJB0386: Jakarta Enterprise Beans 4.6.4 Impossible de supprimer Jakarta Enterprise Beans via la méthode remove() de Enterprise Beans 2.x tout en participant à une transaction";
    }
    @Override
    protected String timerServiceWithIdNotRegistered$str() {
        return "WFLYEJB0338: Le service de minuterie avec timedObjectId: %1$s n'est pas enregistré";
    }
    @Override
    protected String failedToLoadViewClass$str() {
        return "WFLYEJB0087: N'a pas pu charger la vue %1$s";
    }
    @Override
    protected String noAsynchronousInvocationInProgress$str() {
        return "WFLYEJB0244: Aucune invocation asynchrone en cours";
    }
    @Override
    protected String mappedNameNotSupported$str() {
        return "WFLYEJB0525: Le \"mappedName\" dans les annotations Jakarta Enterprise Beans n'est pas pris en charge. La valeur de '%1$s' pour Jakarta Enterprise Beans '%2$s' sera ignorée.";
    }
    @Override
    protected String mdbOnMessageMethodCantBePrivate$str() {
        return "WFLYEJB0504: [Jakarta Enterprise Beans 3.2 spec, section 5.6.4] La méthode 'onMessage' de Message Driven Bean ne peut pas être privée (MDB :%1$s).";
    }
    @Override
    protected String ejbMustNotBeFinalClass$str() {
        return "WFLYEJB0130: Les Jakarta Enterprise Beans %1$s de type %2$s ne doivent pas être déclarés finaux";
    }
    @Override
    protected String strictPoolDerivedFromCPUs$str() {
        return "WFLYEJB0482: Strict pool %1$s utilise une taille d'instance max de %2$d (par classe), qui est dérivée du nombre de CPU présents sur cet hôte.";
    }
    @Override
    protected String ejbJarConfigNotFound$str() {
        return "WFLYEJB0195: EjbJarConfiguration non attaché à l'unité de déploiement : %1$s";
    }
    @Override
    protected String resourceAdapterRepositoryUnAvailable$str() {
        return "WFLYEJB0044: Le référentiel d'adaptateur de ressources n'est pas disponible";
    }
    @Override
    protected String invalidTransactionTypeForSfsbLifecycleMethod$str() {
        return "WFLYEJB0463: Type d'attribut de transaction non valide %1$s sur la méthode de cycle de vie SFSB %2$s de la classe %3$s, les types valides sont REQUIRES_NEW et NOT_SUPPORTED. La méthode sera traitée comme NOT_SUPPORTED.";
    }
    @Override
    protected String exceptionCheckingIfTimerShouldRun$str() {
        return "WFLYEJB0502: Exception de vérification de l'exécution de la minuterie %1$s";
    }
    @Override
    protected String wrongTxOnThread$str() {
        return "WFLYEJB0060: Tx erroné pour cette chaîne : %1$s attendu, mais avons %2$s";
    }
    @Override
    protected String unknownMessageListenerType$str() {
        return "WFLYEJB0383: Aucun détecteur de message de type %1$s n'a été trouvé dans l'adaptateur de ressources %2$s";
    }
    @Override
    protected String unknownDeployment$str() {
        return "WFLYEJB0055: Aucun déploiement correspondant pour Jakarta Enterprise Beans : %1$s";
    }
    @Override
    protected String skipInvokeTimeoutDuringRetry$str() {
        return "WFLYEJB0162: La minuterie %1$s a été activée à nouveau, évitement du chevauchement d'exécution prévu à : %2$s";
    }
    @Override
    protected String messageEndpointAlreadyReleasedISE$str() {
        return "WFLYEJB0535: Le point de terminaison du message %1$s a déjà été donné";
    }
    @Override
    protected String failToLinkFromEmptySecurityRole$str() {
        return "WFLYEJB0193: Impossible de se lier à partir d'un rôle de sécurité null ou vide : %1$s";
    }
    @Override
    protected String executorIsNull$str() {
        return "WFLYEJB0305: L'éxecuteur ne peut pas être null";
    }
    @Override
    protected String sessionTypeNotSpecified$str() {
        return "WFLYEJB0413: <session-type> non spécifié pour les Jakarta Enterprise Beans %1$s. Ceci doit être présent dans ejb-jar.xml";
    }
    @Override
    protected String singletonCantImplementSessionBean$str() {
        return "WFLYEJB0515: [Jakarta Enterprise Beans 3.2 spec, section 4.9.2] Les beans de session singleton ne sont pas autorisés à implémenter l'interface 'jakarta.ejb.SessionBean'. Cette interface sur le bean '%1$s' va être ignorée et doit être supprimée.";
    }
    @Override
    protected String unexpectedErrorRolledBack$str() {
        return "WFLYEJB0457: Erreur inattendue";
    }
    @Override
    protected String timerNotActive$str() {
        return "WFLYEJB0024: Minuteur non actif, éviter toute tentative à nouveau du minuteur : %1$s";
    }
    @Override
    protected String failedToRemoveManagementResources$str() {
        return "WFLYEJB0143: N'a pas pu supprimer les ressources de gestion de %1$s -- %2$s";
    }
    @Override
    protected String inconsistentAttributeNotSupported$str() {
        return "WFLYEJB0451: L'attribut '%1$s' n'est pas pris en charge par les versions de serveur actuelles ; il n'est autorisé que si sa valeur correspond à '%2$s'";
    }
    @Override
    protected String couldNotFindEjbForLocatorIIOP$str() {
        return "WFLYEJB0035: Impossible de trouver le bean Jakarta Enterprise Beans pour le localisateur%1$s Le proxy client Jakarta Enterprise Beans ne sera pas remplacé";
    }
    @Override
    protected String noComponentRegisteredForAddress$str() {
        return "WFLYEJB0368: Aucun composant Jakarta Enterprise Beans enregistré pour l'adresse %1$s";
    }
    @Override
    protected String unknownComponentType$str() {
        return "WFLYEJB0357: Type de composant Jakarta Enterprise Beans Type %1$s inconnu";
    }
    @Override
    protected String invocationFailed0$str() {
        return "WFLYEJB0533: L'invocation a échoué";
    }
    @Override
    protected String timerRetried$str() {
        return "WFLYEJB0021: Minuteur : %1$s sera tenté à nouveau";
    }
    @Override
    protected String mdbDeliveryStopped$str() {
        return "WFLYEJB0476: La livraison MDB a cessé : %1$s,%2$s";
    }
    @Override
    protected String invalidScheduleValue$str() {
        return "WFLYEJB0286: Valeur non valide du calendrier %1$s: %2$s";
    }
    @Override
    protected String wrongReturnTypeForAsyncMethod$str() {
        return "WFLYEJB0270: Méthode async %1$s ne retourne ni Nil, ni Future";
    }
    @Override
    protected String invalidValuesRange$str() {
        return "WFLYEJB0294: Valeur non valide : %1$s Les valeurs non valides sont entre %2$s et %3$s";
    }
    @Override
    protected String moreThanOneEjbFound3$str() {
        return "WFLYEJB0408: Plus d'un Jakarta Enterprise Beans trouvé avec une interface de type '%1$s' pour la liaison %2$s. Trouvé : %3$s";
    }
    @Override
    protected String lifecycleMethodNotAllowed$str() {
        return "WFLYEJB0374: %1$s non autorisé pour les méthodes de cycle de vie";
    }
    @Override
    protected String exceptionPersistTimerState$str() {
        return "WFLYEJB0508: Échec de la persistance de l'état de la minuterie %1$s en raison de %2$s";
    }
    @Override
    protected String containerSuspended$str() {
        return "WFLYEJB0467: La requête a été rejetée car le conteneur est en attente";
    }
    @Override
    protected String typeSpecViolation$str() {
        return "WFLYEJB0517: [Jakarta Enterprise Beans 3.2 spec, section 4.1] Violation de la spécification de la classe %1$s. Les Session Jakarta Enterprise Beans ne doivent avoir qu'un seul des types suivants : Stateful, Stateless, Singleton.";
    }
    @Override
    protected String getTxManagerStatusFailed$str() {
        return "WFLYEJB0004: n'a pas pu obtenir le statut manager tx; ignore";
    }
    @Override
    protected String unknownEJBLocatorType$str() {
        return "WFLYEJB0097: Type de localisateur de Jakarta Enterprise Beans inconnu %1$s";
    }
    @Override
    protected String SecurityRolesIsNull$str() {
        return "WFLYEJB0185: Impossible de définir les rôles de sécurité à null";
    }
    @Override
    protected String sessionBeanClassMustBePublicNonAbstractNonFinal$str() {
        return "WFLYEJB0119: [Enterprise Beans 3.1 spec, section 4.9.2] La classe d'implémentation de session bean DOIT être publique, non abstraite et non finale - %1$s ne sera pas considéré en tant que session bean, car il ne répond pas aux critères";
    }
    @Override
    protected String moduleNotAttachedToDeploymentUnit$str() {
        return "WFLYEJB0093: Le module n'a pas été attaché à l'unité de déploiement %1$s";
    }
    @Override
    protected String failToRestoreTimers$str() {
        return "WFLYEJB0028: %1$s n'est pas un répertoire, impossible de restaurer les minuteurs";
    }
    @Override
    protected String twoEjbBindingsSpecifyAbsoluteOrder$str() {
        return "WFLYEJB0258: Les liaisons de ejb-jar.xml de %1$s indiquent un ordre absolu";
    }
    @Override
    protected String failToInvokeTimerServiceDoLifecycle$str() {
        return "WFLYEJB0325: Impossible d'invoquer les méthodes de service de minuterie pour le callback du cycle de vie des beans non-singleton";
    }
    @Override
    protected String cannotCallMethodInAfterCompletion$str() {
        return "WFLYEJB0388: Ne peut pas appeler la méthode %1$s dans un callback afterCompletion";
    }
    @Override
    protected String asymmetricCacheUsage$str() {
        return "WFLYEJB0445: Usage de cache asymétrique détecté";
    }
    @Override
    protected String cobraInterfaceRepository$str() {
        return "WFLYEJB0144: Référentiel d'interface CORBA de %1$s: %2$s";
    }
    @Override
    protected String failToLoadEjbClass$str() {
        return "WFLYEJB0265: Impossible de charger la classe Jakarta Enterprise Beans %1$s";
    }
    @Override
    protected String wildcardContainerTransactionElementsMustHaveWildcardMethodName$str() {
        return "WFLYEJB0455: <container-transaction> éléments qui utilisent le nom générique Jakarta Enterprise Beans * peuvent uniquement utiliser un nom de méthode de *";
    }
    @Override
    protected String failToCallSetRollbackOnlyWithNoTx$str() {
        return "WFLYEJB0183: setRollbackOnly() non autorisé sans transaction.";
    }
    @Override
    protected String cannotDeactivateBeanServant$str() {
        return "WFLYEJB0147: N'a pas pu désactiver le Bean Servant";
    }
    @Override
    protected String beanLocalHomeInterfaceIsNull$str() {
        return "WFLYEJB0172: Bean %1$s ne possède pas d'interface d'accueil locale";
    }
    @Override
    protected String timerServiceIsNotActive$str() {
        return "WFLYEJB0139: Le service de la minuterie a été désactivé. Veuillez ajouter une entrée <timer-service> dans la section Jakarta Enterprise Beans de la configuration du serveur pour l'activer.";
    }
    @Override
    protected String stringParamCannotBeNullOrEmpty$str() {
        return "WFLYEJB0385: %1$s ne peut pas rester null ou vide";
    }
    @Override
    protected String clusteredAnnotationIsNotApplicableForMDB$str() {
        return "WFLYEJB0409: L'annotation @Clustered ne peut pas être utilisée avec des beans basés message. %1$s a échoué car %2$s bean est marqué avec @Clustered sur la classe %3$s";
    }
    @Override
    protected String exceptionRepositoryNotFound$str() {
        return "WFLYEJB0472: N'a pas pu obtenir d'id de référentiel d'exception pour %1$s:%n%2$s";
    }
    @Override
    protected String mdbOnMessageMethodCantBeStatic$str() {
        return "WFLYEJB0505: [Jakarta Enterprise Beans 3.2 spec, section 5.6.4] La méthode 'onMessage' de Message Driven Bean ne peut pas être statique (MDB :%1$s).";
    }
    @Override
    protected String failToInvokegetTimeoutMethod$str() {
        return "WFLYEJB0341: Impossible d'invoquer getTimeoutMethod sur une minuterie qui n'est pas un auto-timer";
    }
    @Override
    protected String invalidTimerFileStoreDir$str() {
        return "WFLYEJB0346: Le répertoire de store de fichier de minuterie %1$s n'est pas un répertoire";
    }
    @Override
    protected String errorDuringRetryTimeout$str() {
        return "WFLYEJB0022: Erreur lors de l'essai à nouveau du délai d'attente minuteur : %1$s";
    }
    @Override
    protected String ejbNotFound2$str() {
        return "WFLYEJB0406: Pas de Jakarta Enterprise Beans trouvé avec une interface de type '%1$s' pour la liaison %2$s";
    }
    @Override
    protected String incompatibleCaches$str() {
        return "WFLYEJB0399: Implémentations de cache incompatibles dans la hiérarchie imbriquée";
    }
    @Override
    protected String defaultInterceptorsNotBindToMethod$str() {
        return "WFLYEJB0256: Les intercepteurs par défaut ne peuvent pas spécifier de méthode pour se lier au ejb-jar.xml";
    }
    @Override
    protected String bothMethodIntAndClassNameSet$str() {
        return "WFLYEJB0237: methodIntf et className sont définis sur %1$s";
    }
    @Override
    protected String duplicateSerializationGroupMember$str() {
        return "WFLYEJB0395: %1$s est déjà un membre du groupe de sérialisation %2$s";
    }
    @Override
    protected String retryingTimeout$str() {
        return "WFLYEJB0023: Essai à nouveau du délai d'attente minuteur : %1$s";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYEJB0469: Les ressources enfants indexées peuvent uniquement être enregistrées si la ressource parent prend en charge les enfants ordonnés. Le parent de '%1$s' n'est pas indexé";
    }
    @Override
    protected String invocationNotApplicableForMethodInvocation$str() {
        return "WFLYEJB0240: Contexte d'invocation : %1$s ne peut pas être traité car non applicable dans une méthode d'invocation";
    }
    @Override
    protected String messageEndpointAlreadyReleased$str() {
        return "WFLYEJB0102: Le point de terminaison du message %1$s a déjà été donné";
    }
    @Override
    protected String suspensionWaitingActiveTransactions$str() {
        return "WFLYEJB0492: Suspension du sous-système EJB en attente de transactions actives, %1$d transaction(s) restantes";
    }
    @Override
    protected String failedToRetrieveTimerInfo$str() {
        return "WFLYEJB0529: Impossible de récupérer les informations de la base de données pour le timer : %1$s";
    }
    @Override
    protected String deprecatedAnnotation$str() {
        return "WFLYEJB0166: L'annotation @%1$s est dépréciée et ne sera donc pas prise en considération.";
    }
    @Override
    protected String componentNotSetInInterceptor$str() {
        return "WFLYEJB0169: Composant non défini pour InterceptorContext : %1$s";
    }
    @Override
    protected String localHomeNotAllow$str() {
        return "WFLYEJB0274: L'interface d'accueil local non autorisée pour %1$s";
    }
    @Override
    protected String ejbBusinessMethodMustBePublic$str() {
        return "WFLYEJB0528: La méthode de travail de Jakarta Enterprise Beans %1$s doit être publique";
    }
    @Override
    protected String authenticationFailed$str() {
        return "WFLYEJB0534: L'authentification a échoué";
    }
    @Override
    protected String failedToInstallManagementResource$str() {
        return "WFLYEJB0086: N'a pas pu installer les ressources de gestion de %1$s";
    }
    @Override
    protected String poolNameCannotBeEmptyString$str() {
        return "WFLYEJB0419: Le nom de pool ne peut pas être Une chaîne vide pour le bean %1$s";
    }
    @Override
    protected String clusteredAnnotationIsNotApplicableForEntityBean$str() {
        return "WFLYEJB0410: L'annotation @Clustered ne peut pas être utilisée avec des beans d'entité. %1$s a échoué car %2$s bean est marqué avec @Clustered sur la classe %3$s";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYEJB0530: Le déploiement est configuré pour utiliser un ancien domaine de sécurité '%1$s' qui n'est plus pris en charge.";
    }
    @Override
    protected String unknownDatabaseName$str() {
        return "WFLYEJB0532: La base de données détectée dans la configuration est : '%1$s'. Si ce n'est pas le cas, veuillez indiquer la base de données correcte.";
    }
    @Override
    protected String timerPersistenceNotEnable$str() {
        return "WFLYEJB0016: La persistance du minuteur n'est pas activée, les minuteurs persistants ne survivront pas au nouveaux démarrages";
    }
    @Override
    protected String failedToSetRollbackOnly$str() {
        return "WFLYEJB0064: N'a pas pu définir la transaction en rollback (basculement) uniquement";
    }
    @Override
    protected String invalidFilterSpec$str() {
        return "WFLYEJB0519: Spécification de filtre de démarshalling non valide%1$s ; les spécifications doivent décrire les modèles de correspondance des noms de classe ou de package";
    }
    @Override
    protected String timerHasExpired$str() {
        return "WFLYEJB0330: La minuterie %1$s n'a pas expiré";
    }
    @Override
    protected String invalidTimerParameter$str() {
        return "WFLYEJB0306: Paramètre de temporisation invalide : %1$s = %2$s";
    }
    @Override
    protected String aroundTimeoutMethodMustReturnObjectType$str() {
        return "WFLYEJB0059: La méthode %1$s, sur la classe %2$s, annotée avec @jakarta.interceptor.AroundTimeout doit retourner un objet de type";
    }
    @Override
    protected String invalidValueForSecondInScheduleExpression$str() {
        return "WFLYEJB0109: Valeur non valide pour les secondes : %1$s";
    }
    @Override
    protected String ignoringException$str() {
        return "WFLYEJB0018: Ignorer l'exception pendant le setRollbackOnly";
    }
    @Override
    protected String discardingStatefulComponent$str() {
        return "WFLYEJB0007: Ignorer l'instance du composant dynamique : %1$s en raison de l'exception";
    }
    @Override
    protected String timerCannotBeAdded$str() {
        return "WFLYEJB0524: La minuterie %1$s ne peut pas être ajoutée";
    }
    @Override
    protected String unknownOperations$str() {
        return "WFLYEJB0367: Opération %1$s inconnue";
    }
    @Override
    protected String passivationDirectoryCreationFailed$str() {
        return "WFLYEJB0402: N'a pas pu créer un répertoire de passivation : %1$s";
    }
    @Override
    protected String failToLoadViewClassEjb$str() {
        return "WFLYEJB0349: N'a pas pu charger la classe de vue pour ejb %1$s";
    }
    @Override
    protected String invocationFailed2$str() {
        return "WFLYEJB0034: Échec de l'invocation Jakarta Enterprise Beans sur le composant %1$s pour la méthode %2$s";
    }
    @Override
    protected String ejbHasNoTimerMethods$str() {
        return "WFLYEJB0140: Ce Jakarta Enterprise Beans n'a pas de méthode de délai d'attente";
    }
    @Override
    protected String cacheEntryNotInUse$str() {
        return "WFLYEJB0393: L'entrée de cache %1$s n'est pas en cours d'utilisation";
    }
    @Override
    protected String failedToProcessBusinessInterfaces$str() {
        return "WFLYEJB0466: Échec du traitement des interfaces commerciales pour la classe Jakarta Enterprise Beans %1$s";
    }
    @Override
    protected String missingMdbDeliveryGroup$str() {
        return "WFLYEJB0477: Le groupe de livraison MDB est manquant : %1$s";
    }
    @Override
    protected String serverInterceptorNoEmptyConstructor$str() {
        return "WFLYEJB0512: La classe d'intercepteur de serveur %1$sn'a pas de constructeur sans paramètres";
    }
    @Override
    protected String multipleSecurityDomainsDetected$str() {
        return "WFLYEJB0490: Domaines de sécurité multiples non pris en charge";
    }
    @Override
    protected String transactionPropagationNotSupported$str() {
        return "WFLYEJB0387: La propagation de la transaction par IIOP n'est pas prise en charge";
    }
    @Override
    protected String strictPoolDerivedFromWorkers$str() {
        return "WFLYEJB0481: Strict pool %1$s utilise une taille d'instance max de %2$d (par classe), qui est dérivée de la taille du pool de worker de threads.";
    }
    @Override
    protected String timerNotDeployed$str() {
        return "WFLYEJB0523: La minuterie %1$s n'a pas été déployée";
    }
    @Override
    protected String incompatibleSerializationGroup$str() {
        return "WFLYEJB0391: %1$s n'est pas compatible avec le groupe de sérialisation %2$s";
    }
    @Override
    protected String currentComponentNotAEjb$str() {
        return "WFLYEJB0373: Le composant actuel n'est pas un bean Jakarta Enterprise Beans %1$s";
    }
    @Override
    protected String noNamespaceContextSelectorAvailable$str() {
        return "WFLYEJB0178: Aucun NamespaceContextSelector disponible, impossible de rechercher %1$s";
    }
    @Override
    protected String failToCallEjbRefByDependsOn$str() {
        return "WFLYEJB0269: Plus d'un Jakarta Enterprise Beans appelé %1$s référencé par l'annotation @DependsOn %2$s dans Components :%3$s";
    }
    @Override
    protected String endpointUnAvailable$str() {
        return "WFLYEJB0046: Le point de terminaison n'est pas disponible pour le message par composant %1$s";
    }
    @Override
    protected String roleNamesIsNull$str() {
        return "WFLYEJB0255: <role-name> ne peut être null ou rester vide dans<security-role-ref>%npour le bean: %1$s";
    }
    @Override
    protected String transactionNotComplete2$str() {
        return "WFLYEJB0159: Le stateful bean BMT '%1$s' n'a pas réussi à compléter la transaction utilisateur correctement statut=%2$s";
    }
    @Override
    protected String notAnObjectImpl$str() {
        return "WFLYEJB0101: %1$s n'est pas un ObjectImpl";
    }
    @Override
    protected String remappingCacheAttributes$str() {
        return "WFLYEJB0486: Le paramètre « par default-cluster-sfsb-cache » a été défini pour l'opération « ajouter » pour la ressource « %1$s ». Ce paramètre est déprécié et son comportement précédent a été reconfiguré en attribut « par default-sfsb-cache ». Ainsi, l'attribut « par default-sfsb-cache » a été défini à « %2$s » et l'attribut « default-sfsb-passivation-disabled-cache » a été défini à « %3$s ».";
    }
    @Override
    protected String missingSerializationGroupMember$str() {
        return "WFLYEJB0396: %1$s n'est pas un membre du groupe de sérialisation %2$s";
    }
    @Override
    protected String failToFindEjbRefByDependsOn$str() {
        return "WFLYEJB0268: Impossible de trouver les Jakarta Enterprise Beans %1$s référencés par l'annotation @DependsOn en %2$s";
    }
    @Override
    protected String passivationPathNotADirectory$str() {
        return "WFLYEJB0403: N'a pas pu créer un répertoire de passivation : %1$s";
    }
    @Override
    protected String unknownTimezoneId$str() {
        return "WFLYEJB0015: Id de fuseau horaire inconnue : %1$s trouvé dans l'expression de programmation. L'ignorer et utiliser le fuseau horaire du serveur : %2$s";
    }
    @Override
    protected String failToCreateTimerFileStoreDir$str() {
        return "WFLYEJB0344: N'a pas pu créer un répertoire de store de fichier de minuterie %1$s";
    }
    @Override
    protected String defaultPoolExpressionCouldNotBeResolved$str() {
        return "WFLYEJB0522: Le nom du pool par défaut %1$s n'a pas pu être résolu à partir de sa valeur : %2$s";
    }
    @Override
    protected String ejbMustHavePublicDefaultConstructor$str() {
        return "WFLYEJB0127: Les Jakarta Enterprise Beans %1$s de type %2$s doivent avoir un constructeur public par défaut";
    }
    @Override
    protected String failToCallgetRollbackOnlyOnNoneTransaction$str() {
        return "WFLYEJB0174: getRollbackOnly() non autorisé sans une transaction.";
    }
    @Override
    protected String missingRunAsAnnotation$str() {
        return "WFLYEJB0510: L'annotation @RunAs est requise lors de l'utilisation de @RunAsPrincipal sur la classe %1$s";
    }
    @Override
    protected String mdbClassMustBePublicNonAbstractNonFinal$str() {
        return "WFLYEJB0121: [Enterprise Beans 3.1 spec, section 5.6.2] La classe d'implémentation de Bean par message DOIT être publique, non abstraite et non finale - %1$s ne sera pas considéré en tant que Bean basé message, ne répond pas aux critères";
    }
    @Override
    protected String exceptionGeneratingSessionId$str() {
        return "WFLYEJB0151: Exception lors de la création de l'id de session pour le composant %1$s ayant comme id d'invocation %2$s";
    }
    @Override
    protected String deprecatedNamespace$str() {
        return "WFLYEJB0167: L'élément <%2$s xmlns=\"%1$s\"/> ne sera pas pris en considération.";
    }
    @Override
    protected String invalidEjbComponent$str() {
        return "WFLYEJB0350: Composant nommé%1$s avec classe de composant%2$s n'est pas un composant Jakarta Enterprise Beans";
    }
    @Override
    protected String failedToCreateEJBClientInterceptor$str() {
        return "WFLYEJB0496: Impossible de créer une instance de l'intercepteur client de Jakarta Enterprise Beans %1$s";
    }
    @Override
    protected String logMDBStart$str() {
        return "WFLYEJB0042: Démarrage du bean basé message '%1$s' avec '%2$s' adaptateur de ressources";
    }
    @Override
    protected String poolConfigIsEmpty$str() {
        return "WFLYEJB0218: PoolConfig ne peut ni être null ni vide";
    }
    @Override
    protected String componentClassHasMultipleTimeoutAnnotations$str() {
        return "WFLYEJB0372: La classe de composant %1$s a des annotation @Timeout multiples";
    }
    @Override
    protected String unauthorizedAccessToUserTransaction$str() {
        return "WFLYEJB0137: Seuls les beans de session ou les beans message-driven avec démarcation de transaction bean-managed sont autorisés à accéder UserTransaction";
    }
    @Override
    protected String timerWasCanceled$str() {
        return "WFLYEJB0331: La minuterie %1$s n'a pas été annulée";
    }
    @Override
    protected String cannotCallMethod$str() {
        return "WFLYEJB0389: Ne peut pas appeler %1$s quand l'état est %2$s";
    }
    @Override
    protected String transactionNotComplete1$str() {
        return "WFLYEJB0443: EJB 3.1 FR 13.3.3: Bean BMT %1$s doit compléter la transaction avant d'être retourné.";
    }
    @Override
    protected String timerIsNull$str() {
        return "WFLYEJB0326: Le timer ne peut pas être null";
    }
    @Override
    protected String noEjbContextAvailable$str() {
        return "WFLYEJB0420: Aucun EjbContext n'est disponible car aucune invocation de Jakarta Enterprise Beans n'est active";
    }
    @Override
    protected String ejb2xViewNotApplicableForSingletonBeans$str() {
        return "WFLYEJB0076: Les beans singleton ne peuvent pas avoir d’affichages Enterprise Beans 2.x";
    }
    @Override
    protected String beanInterfaceAttributeRequiredForEJBAnnotationOnClass$str() {
        return "WFLYEJB0092: L'attribut @EJB 'beanInterface' est requis pour les annotations de niveau de classe. Classe : %1$s";
    }
    @Override
    protected String timerServiceMethodNotAllowedForSFSB$str() {
        return "WFLYEJB0449: L'API de service de minuterie n'est pas pris en charge par le bean de session stateful %1$s";
    }
    @Override
    protected String timerReinstatementFailed$str() {
        return "WFLYEJB0161: N'a pas pu réinstaurer l'horodateur '%1$s' (id=%2$s) de son état persistant";
    }
    @Override
    protected String cacheEntryInUse$str() {
        return "WFLYEJB0392: L'entrée de cache %1$s est en cours d'utilisation";
    }
    @Override
    protected String mdbDeliveryStarted$str() {
        return "WFLYEJB0475: La livraison MDB a commencé : %1$s,%2$s";
    }
    @Override
    protected String noSuchEndpointException$str() {
        return "WFLYEJB0045: Impossible de trouver un Point de terminaison pour l'adaptateur de ressources %1$s";
    }
    @Override
    protected String ejbLocalObjectUnavailable$str() {
        return "WFLYEJB0078: Bean %1$s n'a pas d'EJBLocalObject";
    }
    @Override
    protected String getRollBackOnlyIsNotAllowWithSupportsAttribute$str() {
        return "WFLYEJB0223: Jakarta Enterprise Beans 3.1 FR 13.6.2.9 getRollbackOnly n'est pas autorisé avec l'attribut SUPPORTS";
    }
    @Override
    protected String failToCompleteTaskBeforeTimeOut$str() {
        return "WFLYEJB0202: La tâche n'a pas pu être complétée en %1$s  %2$S";
    }
    @Override
    protected String unexpectedInvocationState$str() {
        return "WFLYEJB0487: État d'invocation %1$s non attendu";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYEJB0366: Attribut inconnu %1$s";
    }
    @Override
    protected String existingSerializationGroup$str() {
        return "WFLYEJB0390: %1$s est déjà associé à un groupe de sérialisation %2$s";
    }
    @Override
    protected String couldNotFindEjb$str() {
        return "WFLYEJB0168: Impossible de trouver les Jakarta Enterprise Beans avec l'identifiant %1$s";
    }
    @Override
    protected String invalidTransactionTypeForMDB$str() {
        return "WFLYEJB0485: Le type de transaction %1$s n'est pas spécifié pour la méthode %2$s du bean %3$s basé message. Il sera géré en tant que NOT_SUPPORTED.";
    }
    @Override
    protected String ejbNotFound3$str() {
        return "WFLYEJB0405: Pas de Jakarta Enterprise Beans trouvé avec une interface de type '%1$s' et le nom '%2$s' pour la liaison %3$s";
    }
    @Override
    protected String mdbCantHaveFinalizeMethod$str() {
        return "WFLYEJB0506: Jakarta Enterprise Beans 3.2 spec, section 5.6.2] Message Driven Bean ne peut pas avoir de méthode 'finalize'. (MDB :%1$s)";
    }
    @Override
    protected String invalidEjbLocalInterface$str() {
        return "WFLYEJB0273: %1$s ne dispose pas d'une interface locale Enterprise Beans 2.x";
    }
    @Override
    protected String unknownSessionBeanType$str() {
        return "WFLYEJB0095: Type de session bean %1$s inconnu";
    }
    @Override
    protected String invalidListValue$str() {
        return "WFLYEJB0292: Une liste de valeurs ne peut contenir qu'un groupe de valeurs ou une seule valeur. Valeur non valide : %1$s";
    }
    @Override
    protected String disableDefaultEjbPermissionsCannotBeTrue$str() {
        return "WFLYEJB0464: L'attribut \"disable-default-ejb-permissions\"n'est peut-être pas défini sur true";
    }
    @Override
    protected String failedToLoadViewClassForComponent$str() {
        return "WFLYEJB0068: Impossible de charger la classe pour le composant %1$s";
    }
    @Override
    protected String notAllowedFromStatefulBeans$str() {
        return "WFLYEJB0377: %1$s n'est pas autorisé à partir des beans stateful";
    }
    @Override
    protected String exceptionPersistPostTimerState$str() {
        return "WFLYEJB0507: Échec de la persistance des %1$s d'état de la minuterie. la minuterie doit être restaurée manuellement";
    }
    @Override
    protected String mdbDoesNotImplementNorSpecifyMessageListener$str() {
        return "WFLYEJB0094: EJB 3.1 FR 5.4.2 MessageDrivenBean %1$s n'implémente pas 1 interface, et n'indique pas l'interface de détecteur de message";
    }
    @Override
    protected String ejbJarConfigNotBeenSet$str() {
        return "WFLYEJB0214: EjbJarConfiguration n'a pas été définie dans %1$s. Impossible de créer un service de création de composant pour Jakarta Enterprise Beans %2$S";
    }
    @Override
    protected String failedToRollback$str() {
        return "WFLYEJB0158: N'a pas pu restaurer";
    }
    @Override
    protected String cannotResolveFilteredClass$str() {
        return "WFLYEJB0518: Exception de résolution de la classe %1$s pour le démarchage ; elle a été bloquée ou n'a pas été autorisée";
    }
    @Override
    protected String errorInvokeTimeout$str() {
        return "WFLYEJB0020: Erreur d'invocation du délai d'expiration pour le minuteur : %1$s";
    }
    @Override
    protected String methodNotImplemented$str() {
        return "WFLYEJB0206: Non mis en œuvre pour l'instant";
    }
    @Override
    protected String unexpectedComponent$str() {
        return "WFLYEJB0213: Composant inattendu : %1$s composant attendu %2$s";
    }
    @Override
    protected String mutuallyExclusiveAttributes$str() {
        return "WFLYEJB0483: Les attributs sont mutuellement exclusifs : %1$s, %2$s";
    }
    @Override
    protected String loadedPersistentTimerInTimeout$str() {
        return "WFLYEJB0480: La minuterie (%1$s) chargée pour Jakarta Enterprise Beans (%2$s) et ce nœud qui est signalé comme étant dans un délai d'attente. Le délai d'attente initial n'a peut-être pas écoulé. Veuillez utiliser un arrêt approprié pour s'assurer que le délai d'attente des tâches soit écoulé avant d'arrêter.";
    }
    @Override
    protected String failedToPersistTimer$str() {
        return "WFLYEJB0453: N'a pas pu faire persister la minuterie %1$s";
    }
    @Override
    protected String serverInterceptorInvalidMethod$str() {
        return "WFLYEJB0513: Méthode %1$s dans un intercepteur de serveur %2$s annoté avec %3$s a une signature invalide";
    }
    @Override
    protected String annotationOnlyAllowedOnClass$str() {
        return "WFLYEJB0081: L'annotation %1$s est uniquement autorisée sur les classes. %2$s n'est pas une classe";
    }
    @Override
    protected String unknownChannelCreationOptionType$str() {
        return "WFLYEJB0436: Type d'option de création de canal inconnu %1$s";
    }
    @Override
    protected String failureDuringEndpointDeactivation$str() {
        return "WFLYEJB0047: N'a pas pu désactiver le point de terminaison pour le composant basé message %1$s";
    }
    @Override
    protected String failToObtainLock$str() {
        return "WFLYEJB0228: Le délai d'attente de l'accès concurrent de EJB 3.1 FR 4.3.14.1 sur %1$s - n'a pas pu obtenir de verrou dans %2$s %3$s";
    }
    @Override
    protected String unexpectedError$str() {
        return "WFLYEJB0442: Erreur inattendue";
    }
    @Override
    protected String timerInvocationFailedDueToInvokerNotBeingStarted$str() {
        return "WFLYEJB0107: L'invocation de la minuterie a échoué, l'invocateur n'est pas démarré";
    }
    @Override
    protected String cannotReadStrictMaxPoolDerivedSize$str() {
        return "WFLYEJB0499: Impossible de lire la taille dérivée - service %1$s inaccessible";
    }
    @Override
    protected String taskWasCancelled$str() {
        return "WFLYEJB0203: La tâche a été annulée";
    }
    @Override
    protected String failToLoadDeclaringClassOfTimeOut$str() {
        return "WFLYEJB0342: N'a pas pu charger la classe déclarante : %1$s de la méthode de timeout";
    }
    @Override
    protected String activationFailed$str() {
        return "WFLYEJB0401: N'a pas pu activer %1$s";
    }
    @Override
    protected String failedToMarshalEjbParameters$str() {
        return "WFLYEJB0054: Échec de l'enregistrement des paramètres de Jakarta Enterprise Beans";
    }
    @Override
    protected String noMoreTimeoutForTimer$str() {
        return "WFLYEJB0328: Plus de délai d'attentes pour la minuterie %1$s";
    }
    @Override
    protected String iiopBindings$str() {
        return "WFLYEJB0516: Les liaisons IIOP de session bean nommées '%1$s' dans l'unité de déploiement '%2$s' sont les suivantes :%3$s";
    }
    @Override
    protected String failToObtainLockIllegalType$str() {
        return "WFLYEJB0242: Type de verrou illégal %1$s sur %2$s pour le composant %3$s";
    }
    @Override
    protected String relativeResourceAdapterNameInStandaloneModule$str() {
        return "WFLYEJB0459: Le module %1$s contenant le bean %2$s n'est pas déployé dans ear, mais il indique le nom d'adaptateur de ressource '%3$s' dans un format relatif.";
    }
    @Override
    protected String jndiNameCannotBeNull$str() {
        return "WFLYEJB0177: le nom jndi ne peut pas être utilisé en cours de recherche";
    }
    @Override
    protected String legacyClientMappingsRegistryProviderInUse$str() {
        return "WFLYEJB0531: Aucun fournisseur de registre de mappages de clients n'a été trouvé pour %1$s; utilisation d'un ancien fournisseur basé sur une configuration statique";
    }
    @Override
    protected String connectorNotConfiguredForEJBClientInvocations$str() {
        return "WFLYEJB0527: Le connecteur Remoting (adresse %1$s, port %2$s) n'est pas correctement configuré pour les invocations de clients EJB. Le connecteur doit être listé dans l'attribut 'connectors' de <remote/> pour recevoir des invocations de clients EJB";
    }
    @Override
    protected String asyncInvocationOnlyApplicableForSessionBeans$str() {
        return "WFLYEJB0052: Impossible d'exécuter une invocation locale asynchrone pour un composant qui ne correspond pas à une session bean";
    }
    @Override
    protected String componentViewNotAvailableInContext$str() {
        return "WFLYEJB0196: ComponentViewInstance non disponible dans le contexte de l'intercepteur : %1$s";
    }
    @Override
    protected String multipleAnnotationsOnBean$str() {
        return "WFLYEJB0266: Une seule méthode %1$s est autorisée sur le bean %2$s";
    }
    @Override
    protected String failToRestoreTimersFromFile$str() {
        return "WFLYEJB0029: Impossible de restaurer le minuteur de %1$s";
    }
    @Override
    protected String timerHandleIsNotActive$str() {
        return "WFLYEJB0339: Minuterie pour Handle ayant pour id de minuterie : %1$s, timedObjectId : %2$s n'est pas active";
    }
    @Override
    protected String logInconsistentAttributeNotSupported$str() {
        return "WFLYEJB0474: L'attribut '%1$s' n'est pas pris en charge par les versions de serveur actuelles ; il n'est autorisé que si sa valeur correspond à '%2$s'. Cet attribut doit être supprimé.";
    }
}
