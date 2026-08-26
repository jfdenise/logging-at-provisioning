package org.wildfly.iiop.openjdk.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:54:06+0200")
public class IIOPLogger_$logger_fr extends IIOPLogger_$logger implements IIOPLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public IIOPLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYIIOP0001: Activation du sous-système IIOP";
    }
    @Override
    protected String failedToFetchCSIv2Policy$str() {
        return "WFLYIIOP0002: Erreur d'extraction de CSIv2Policy";
    }
    @Override
    protected String caughtExceptionEncodingGSSUPMechOID$str() {
        return "WFLYIIOP0003: Exception interceptée au moment de la codification de GSSUPMechOID";
    }
    @Override
    protected String logInternalError$str() {
        return "WFLYIIOP0004: Erreur interne";
    }
    @Override
    protected String failedToCreateNamingContext$str() {
        return "WFLYIIOP0005: N'a pas pu créer un contexte de nommage CORBA";
    }
    @Override
    protected String failedToUnbindObject$str() {
        return "WFLYIIOP0006: L'annulation de la liaison a échoué pour %1$s";
    }
    @Override
    protected String failedToObtainJSSEDomain$str() {
        return "WFLYIIOP0007: N'a pas pu obtenir le domaine de sécurité JSSE ayant pour nom %1$s";
    }
    @Override
    protected String corbaNamingServiceStarted$str() {
        return "WFLYIIOP0008: Service de nommage CORBA démarré";
    }
    @Override
    protected String corbaORBServiceStarted$str() {
        return "WFLYIIOP0009: Service CORBA ORB démarré";
    }
    @Override
    protected String warnClassDescDoesNotConformToSpec$str() {
        return "WFLYIIOP0010: Problème de compatibilité : la classe javax.rmi.CORBA.ClassDesc ne se conforme pas au language Java(TM) Language pour IDL Mapping Specification (01-06-07), section 1.3.5.11";
    }
    @Override
    protected String warnCouldNotDeactivateIRObject$str() {
        return "WFLYIIOP0011: N'a pas pu désactiver l'objet IR";
    }
    @Override
    protected String warnCouldNotDeactivateAnonIRObject$str() {
        return "WFLYIIOP0012: N'a pas pu désactiver l'objet IR anonyme";
    }
    @Override
    protected String noSecurityDomainOrSSLContextsSpecified$str() {
        return "WFLYIIOP0013: SSL support a été annulé, mais aucun domaine de sécurité ou contexte SSL client/serveur n'a été spécifié";
    }
    @Override
    protected String unexpectedException$str() {
        return "WFLYIIOP0014: Exception inattendue";
    }
    @Override
    protected String unexpectedContextErrorInSASReply$str() {
        return "WFLYIIOP0015: ContextError inattendue dans la réponse SAS";
    }
    @Override
    protected String errorParsingSASReply$str() {
        return "WFLYIIOP0016: N'a pas pu lire la réponse SAS : %1$s";
    }
    @Override
    protected String errorRegisteringSASCurrentInitRef$str() {
        return "WFLYIIOP0017: N'a pas pu enregistrer la référence initiale pour SASCurrent";
    }
    @Override
    protected String missingSASContext$str() {
        return "WFLYIIOP0018: Le contexte SAS n'existe pas";
    }
    @Override
    protected String errorDecodingInitContextToken$str() {
        return "WFLYIIOP0019: N'a pas pu décoder le token de contexte initial";
    }
    @Override
    protected String errorDecodingTargetInContextToken$str() {
        return "WFLYIIOP0020: N'a pas pu décoder le nom de la cible dans le token de contexte initial";
    }
    @Override
    protected String errorDecodingPrincipalName$str() {
        return "WFLYIIOP0021: N'a pas pu décoder le nom du principal entrant";
    }
    @Override
    protected String errorDecodingContextData$str() {
        return "WFLYIIOP0022: Exception lors du décodage des données de contexte dans %1$s";
    }
    @Override
    protected String illegalBatchSize$str() {
        return "WFLYIIOP0023: La taille du lot n'est pas numérique : %1$s";
    }
    @Override
    protected String errorGettingBindingList$str() {
        return "WFLYIIOP0024: Erreur d'obtention de la liste de liaisons";
    }
    @Override
    protected String errorGeneratingObjectViaFactory$str() {
        return "WFLYIIOP0025: Erreur de création d'objet via la fabrique d'objets";
    }
    @Override
    protected String errorConstructingCNCtx$str() {
        return "WFLYIIOP0026: Erreur de construction de contexte : ORB ou NamingContext doivent être fournis";
    }
    @Override
    protected String notANamingContext$str() {
        return "WFLYIIOP0027: %1$s ne nomme pas un NamingContext";
    }
    @Override
    protected String errorConvertingIORToNamingCtx$str() {
        return "WFLYIIOP0028: Impossible de convertir en NamingContext : %1$s";
    }
    @Override
    protected String errorResolvingNSInitRef$str() {
        return "WFLYIIOP0029: ORB.resolve_initial_references(\"NameService\") ne retourne pas un NamingContext";
    }
    @Override
    protected String cosNamingNotRegisteredCorrectly$str() {
        return "WFLYIIOP0030: Service de noms COS non enregistré avec ORB sous le nom 'NameService'";
    }
    @Override
    protected String errorConnectingToORB$str() {
        return "WFLYIIOP0031: Ne peut pas connecter à ORB";
    }
    @Override
    protected String invalidURLOrIOR$str() {
        return "WFLYIIOP0032: IOR ou URL non valide : %1$s";
    }
    @Override
    protected String invalidObjectReference$str() {
        return "WFLYIIOP0033: Référence d'objet non valide : %1$s";
    }
    @Override
    protected String urlDoesNotContainIOR$str() {
        return "WFLYIIOP0034: %1$s ne contient pas d'IOR";
    }
    @Override
    protected String notACorbaObject$str() {
        return "WFLYIIOP0035: Seules les instances d'org.omg.CORBA.Object peuvent être liées";
    }
    @Override
    protected String noReferenceFound$str() {
        return "WFLYIIOP0036: Aucune référence d'objet n'est liée pour le nom spécifié";
    }
    @Override
    protected String invalidEmptyName$str() {
        return "WFLYIIOP0037: Nom vide non valide";
    }
    @Override
    protected String unescapedCharacter$str() {
        return "WFLYIIOP0038: %1$s : non placé dans une séquence d'échappement en bout de composant";
    }
    @Override
    protected String invalidEscapedCharacter$str() {
        return "WFLYIIOP0039: %1$s : caractère non valide placé dans une séquence d'échappement";
    }
    @Override
    protected String invalidURL$str() {
        return "WFLYIIOP0040: URL %1$s non valide : %2$s";
    }
    @Override
    protected String problemInvokingPortableRemoteObjectToStub$str() {
        return "WFLYIIOP0041: Problème avec PortableRemoteObject.toStub(); objet non exporté ou stub non trouvé";
    }
    @Override
    protected String cannotInvokePortableRemoteObjectToStub$str() {
        return "WFLYIIOP0042: Ne peut pas invoquer javax.rmi.PortableRemoteObject.toStub(java.rmi.Remote)";
    }
    @Override
    protected String noMethodDefForPortableRemoteObjectToStub$str() {
        return "WFLYIIOP0043: Pas de définition de méthode pour javax.rmi.PortableRemoteObject.toStub(java.rmi.Remote)";
    }
    @Override
    protected String problemInvokingStubConnect$str() {
        return "WFLYIIOP0044: Problème d'invocation de javax.rmi.CORBA.Stub.connect()";
    }
    @Override
    protected String cannotInvokeStubConnect$str() {
        return "WFLYIIOP0045: Ne peut pas invoquer javax.rmi.CORBA.Stub.connect()";
    }
    @Override
    protected String noMethodDefForStubConnect$str() {
        return "WFLYIIOP0046: Pas de définition de méthode pour javax.rmi.CORBA.Stub.connect(org.omg.CORBA.ORB)";
    }
    @Override
    protected String invalidIIOPURLVersion$str() {
        return "WFLYIIOP0047: Version URL IIOP non valide : %1$s";
    }
    @Override
    protected String unavailableRMIPackages$str() {
        return "WFLYIIOP0048: Les packages javax.rmi ne sont pas disponibles";
    }
    @Override
    protected String unavailableISOLatin1Decoder$str() {
        return "WFLYIIOP0049: Décodeur ISO-Latin-1 non disponible";
    }
    @Override
    protected String invalidURIEncoding$str() {
        return "WFLYIIOP0050: Encodage URI non valide : %1$s";
    }
    @Override
    protected String failedToLookupJSSEDomain$str() {
        return "WFLYIIOP0051: Erreur de configuration de la fabrique de sockets de domaines : n'a pas pu trouver le domaine de sécurité JSSE";
    }
    @Override
    protected String errorObtainingKeyManagers$str() {
        return "WFLYIIOP0052: keyManager[] est null pour le domaine de sécurité %1$s";
    }
    @Override
    protected String failedToGetSSLContext$str() {
        return "WFLYIIOP0053: N'a pas pu obtenir le contexte SSL";
    }
    @Override
    protected String failedToStartJBossCOSNaming$str() {
        return "WFLYIIOP0054: N'a pas pu démarrer le Service de nommage JBoss Corba";
    }
    @Override
    protected String foreignTransaction$str() {
        return "WFLYIIOP0055: Transaction étrangère";
    }
    @Override
    protected String errorEncodingContext$str() {
        return "WFLYIIOP0056: Exception levée lors de l'encodage";
    }
    @Override
    protected String errorGettingSlotInTxInterceptor$str() {
        return "WFLYIIOP0057: Exception lors de l'obtention du slot dans TxServerInterceptor";
    }
    @Override
    protected String errorSettingSlotInTxInterceptor$str() {
        return "WFLYIIOP0058: Exception lors de la définition du slot dans TxServerInterceptor";
    }
    @Override
    protected String cannotAnalyzeNullClass$str() {
        return "WFLYIIOP0059: N'a pas pu analyser une classe null";
    }
    @Override
    protected String badConstantType$str() {
        return "WFLYIIOP0060: Mauvais type de constante : %1$s";
    }
    @Override
    protected String cannotAnalyzeSpecialClass$str() {
        return "WFLYIIOP0061: N'a pas pu analyser la classe spéciale : %1$s";
    }
    @Override
    protected String notAnAccessor$str() {
        return "WFLYIIOP0062: Ne correspond pas à un accesseur : %1$s";
    }
    @Override
    protected String notAnClassOrInterface$str() {
        return "WFLYIIOP0063: Ne correspond pas à une classe ou à une interface : %1$s";
    }
    @Override
    protected String notAnInterface$str() {
        return "WFLYIIOP0064: La classe %1$s n'est pas une interface";
    }
    @Override
    protected String notAPrimitive$str() {
        return "WFLYIIOP0065: N'est pas un type primitif : %1$s";
    }
    @Override
    protected String badRMIIIOPConstantType$str() {
        return "WFLYIIOP0066: Champ %1$s de l'interface %2$s est une constante, mais n'est pas primitif ou String";
    }
    @Override
    protected String badRMIIIOPExceptionType$str() {
        return "WFLYIIOP0067: Le type d'exception %1$s doit correspondre à une classe d'exception cochée";
    }
    @Override
    protected String badRMIIIOPMethodSignature$str() {
        return "WFLYIIOP0068: Toutes les méthodes d'interface doivent lancer une javax.rmi.RemoteException mais la méthode %1$s de l'interface %2$s non";
    }
    @Override
    protected String nameCannotBeNullEmptyOrQualified$str() {
        return "WFLYIIOP0069: Le nom ne peut pas être null, vide ou qualifié";
    }
    @Override
    protected String primitivesHaveNoIRIds$str() {
        return "WFLYIIOP0070: Les types de primitives n'ont pas d'ID IR";
    }
    @Override
    protected String unavailableSHADigest$str() {
        return "WFLYIIOP0071: Pas de SHA message digest disponible";
    }
    @Override
    protected String unknownPrimitiveType$str() {
        return "WFLYIIOP0072: Type de primitive inconnue : %1$s";
    }
    @Override
    protected String cannotAnalyzeStringType$str() {
        return "WFLYIIOP0073: Impossible d'analyser java.lang.String: il s'agit d'un cas spécial";
    }
    @Override
    protected String cannotAnalyzeClassType$str() {
        return "WFLYIIOP0074: Impossible d'analyser java.lang.Class: il s'agit d'un cas spécial";
    }
    @Override
    protected String valueTypeCantImplementRemote$str() {
        return "WFLYIIOP0075: Le type de valeur %1$s ne peut pas implémenter java.rmi.Remote";
    }
    @Override
    protected String valueTypeCantBeProxy$str() {
        return "WFLYIIOP0076: Le type de valeur %1$s ne peut pas correspondre à un proxy ou une classe interne";
    }
    @Override
    protected String errorLoadingClass$str() {
        return "WFLYIIOP0077: Erreur lors du chargement de la classe %1$s";
    }
    @Override
    protected String noReadMethodInHelper$str() {
        return "WFLYIIOP0078: Pas de méthode read dans la classe helper %1$s";
    }
    @Override
    protected String noWriteMethodInHelper$str() {
        return "WFLYIIOP0079: Pas de méthode write dans la classe helper %1$s";
    }
    @Override
    protected String errorUnmarshaling$str() {
        return "WFLYIIOP0080: Erreur unmarshaling %1$s";
    }
    @Override
    protected String errorMarshaling$str() {
        return "WFLYIIOP0081: Erreur marshaling %1$s";
    }
    @Override
    protected String cannotObtainExceptionRepositoryID$str() {
        return "WFLYIIOP0082: N'a pas pu obtenir d'id de référentiel d'exception pour %1$s";
    }
    @Override
    protected String errorMashalingParams$str() {
        return "WFLYIIOP0083: Impossible de lire le paramètre : nombre de paramètres inattendu";
    }
    @Override
    protected String cannotChangeRMIIIOPMapping$str() {
        return "WFLYIIOP0084: N'a pas pu changer le mappage RMI/IIOP";
    }
    @Override
    protected String badKindForTypeCode$str() {
        return "WFLYIIOP0085: Mauvais type de %1$d pour le TypeCode";
    }
    @Override
    protected String wrongInterfaceRepository$str() {
        return "WFLYIIOP0086: Mauvais référentiel d'interface";
    }
    @Override
    protected String duplicateRepositoryName$str() {
        return "WFLYIIOP0087: Nom de référentiel en double";
    }
    @Override
    protected String invalidNullClass$str() {
        return "WFLYIIOP0088: Classe null non valide";
    }
    @Override
    protected String badClassForConstant$str() {
        return "WFLYIIOP0089: Mauvaise classe %1$s pour une constante";
    }
    @Override
    protected String unknownTypeCodeForClass$str() {
        return "WFLYIIOP0090: TypeCode pour classe %1$s non connu";
    }
    @Override
    protected String duplicateTypeCodeForClass$str() {
        return "WFLYIIOP0091: TypeCode pour classe %1$s déjà établi";
    }
    @Override
    protected String collisionWhileCreatingPackage$str() {
        return "WFLYIIOP0092: Collision de nom lors de la création de package";
    }
    @Override
    protected String classIsNotArray$str() {
        return "WFLYIIOP0093: Classe %1$s n'est pas une classe d'Array";
    }
    @Override
    protected String cannotDestroyRMIIIOPMapping$str() {
        return "WFLYIIOP0094: Impossible de détruire le mappage RMI/IIOP";
    }
    @Override
    protected String badKindForSuperValueType$str() {
        return "WFLYIIOP0095: Mauvais type pour le super type de valeur de %1$s";
    }
    @Override
    protected String errorResolvingRefToImplementedInterface$str() {
        return "WFLYIIOP0096: ValueDef %1$s ne peut pas résoudre la référence dans l'interface implémentée %2$s";
    }
    @Override
    protected String errorResolvingRefToAbstractValuetype$str() {
        return "WFLYIIOP0097: ValueDef %1$s ne peut pas résoudre la référence du type de valeur de l'abstract %2$s";
    }
    @Override
    protected String errorResolvingInitRef$str() {
        return "WFLYIIOP0098: N'a pas pu résoudre la référence initiale %1$s";
    }
    @Override
    protected String errorCreatingPOAFromParent$str() {
        return "WFLYIIOP0099: N'a pas pu créer POA à partir du parent";
    }
    @Override
    protected String invalidPOACreationArgs$str() {
        return "WFLYIIOP0100: N'a pas pu instancier POA : ORB en cours ou le POA parent doit être spécifié";
    }
    @Override
    protected String errorActivatingPOA$str() {
        return "WFLYIIOP0101: N'a pas pu activer le POA";
    }
    @Override
    protected String exceptionDestroingIterator$str() {
        return "WFLYIIOP0102: Exception interceptée détruisant l'itérateur %1$s";
    }
    @Override
    protected String sslNotConfigured$str() {
        return "WFLYIIOP0103: Les configurations IOR impliquent l'utilisation des connexions ssl, mais des configurations sécurisées n'ont pas été configurées";
    }
    @Override
    protected String inconsistentSupportedTransportConfig$str() {
        return "WFLYIIOP0104: Configuration transport-config incohérente : %1$s est pris en charge ; veuillez le configurer sur la valeur %2$s";
    }
    @Override
    protected String inconsistentUnsupportedTransportConfig$str() {
        return "WFLYIIOP0105: Configuration transport-config incohérente : %1$s n'est pas pris en charge ; veuillez le supprimer ou le configurer sur « aucune valeur »";
    }
    @Override
    protected String inconsistentRequiredTransportConfig$str() {
        return "WFLYIIOP0106: Configuration transport-config incohérente : %1$s est défini sur true ; veuillez configurer %2$s suivant les besoins";
    }
    @Override
    protected String cannotCreateSSLSocket$str() {
        return "WFLYIIOP0109: Le socket SSL est exigé par le serveur, mais les connexions sécurisées ont été configurées";
    }
    @Override
    protected String serverDoesNotSupportSsl$str() {
        return "WFLYIIOP0110: Le client a besoin de SSL mais le serveur ne le prend pas en charge";
    }
    @Override
    protected String sslPortWithoutSslConfiguration$str() {
        return "WFLYIIOP0111: SSL n'a pas été configuré mais la propriété ssl-port a été spécifiée. La connexion utilisera le protocole clear-text";
    }
    @Override
    protected String ineffectiveAuthenticationContextConfiguration$str() {
        return "WFLYIIOP0113: Le contexte d'authentification a été défini mais il n'est pas efficace parce que l'initialisateur de sécurité a été défini à  « elytron »";
    }
    @Override
    protected String elytronInitializerNotSupportedInPreviousVersions$str() {
        return "WFLYIIOP0114: L'initialisateur de sécurité « elytron » n'était pas pris en charge dans les versions iiop-openjdk et ne peut pas être converti";
    }
    @Override
    protected String noSocketBindingsConfigured$str() {
        return "WFLYIIOP0115: Aucune liaison de socket IIOP n'a été configurée";
    }
    @Override
    protected String wontUseCleartextSocket$str() {
        return "WFLYIIOP0117: CLEARTEXT dans le sous-système IIOP ne sera pas utilisé car le paramètre server-requires-ssl a été mis à true";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYIIOP0118: L'ancienne sécurité n'est plus prise en charge.";
    }
    @Override
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYIIOP0119: L'utilisation des domaines de sécurité au moment de l'exécution n'est pas prise en charge.";
    }
    @Override
    protected String runtimeSecurityDomainUnsupported$str() {
        return "WFLYIIOP0120: L'utilisation de domaines de sécurité au moment de l'exécution n'est pas prise en charge.";
    }
}
