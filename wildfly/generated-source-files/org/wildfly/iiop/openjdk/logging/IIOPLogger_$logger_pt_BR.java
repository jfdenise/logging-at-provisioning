package org.wildfly.iiop.openjdk.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:20+0200")
public class IIOPLogger_$logger_pt_BR extends IIOPLogger_$logger_pt implements IIOPLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public IIOPLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String duplicateRepositoryName$str() {
        return "WFLYIIOP0087: Nome de repositório duplicado";
    }
    @Override
    protected String invalidEmptyName$str() {
        return "WFLYIIOP0037: Nome vazio invalido";
    }
    @Override
    protected String errorDecodingPrincipalName$str() {
        return "WFLYIIOP0021: Não foi possível decodificar o nome principal de entrada";
    }
    @Override
    protected String errorResolvingRefToImplementedInterface$str() {
        return "WFLYIIOP0096: ValueDef %1$s não disponível para solucionar a referência da interface implantada %2$s";
    }
    @Override
    protected String failedToCreateNamingContext$str() {
        return "WFLYIIOP0005: Falha ao criar o contexto de nomeação CORBA";
    }
    @Override
    protected String failedToLookupJSSEDomain$str() {
        return "WFLYIIOP0051: Erro ao configurar o domain socket: falha ao observar o security socket JSSE";
    }
    @Override
    protected String unavailableISOLatin1Decoder$str() {
        return "WFLYIIOP0049: Decodificador ISO-Latin-1 não disponível";
    }
    @Override
    protected String valueTypeCantBeProxy$str() {
        return "WFLYIIOP0076: O tipo de valor %1$s não pôde ser um proxy ou classe interna";
    }
    @Override
    protected String errorParsingSASReply$str() {
        return "WFLYIIOP0016: Não foi possível analisar a resposta SAS: %1$s";
    }
    @Override
    protected String notAPrimitive$str() {
        return "WFLYIIOP0065: Não é um tipo primitivo: %1$s";
    }
    @Override
    protected String corbaNamingServiceStarted$str() {
        return "WFLYIIOP0008: Serviço de Nomeação CORBA iniciado";
    }
    @Override
    protected String errorResolvingNSInitRef$str() {
        return "WFLYIIOP0029: O ORB.resolve_initial_references(\"NameService\") não retorna um NamingContext";
    }
    @Override
    protected String ineffectiveAuthenticationContextConfiguration$str() {
        return "WFLYIIOP0113: O contexto de autenticação foi definido mas é ineficaz porque o inicializador de segurança não está definido como \"elytron\"";
    }
    @Override
    protected String invalidObjectReference$str() {
        return "WFLYIIOP0033: Referência de objeto inválida: %1$s";
    }
    @Override
    protected String nameCannotBeNullEmptyOrQualified$str() {
        return "WFLYIIOP0069: O nome não pode ser nulo, vazio ou qualificado";
    }
    @Override
    protected String badKindForSuperValueType$str() {
        return "WFLYIIOP0095: Tipo ruim para o valuetype do %1$s";
    }
    @Override
    protected String unavailableRMIPackages$str() {
        return "WFLYIIOP0048: os pacotes javax.rmi não estão disponíveis";
    }
    @Override
    protected String errorConstructingCNCtx$str() {
        return "WFLYIIOP0026: Erro ao construir o contexto: um ORB ou NamingContext deve ser fornecido";
    }
    @Override
    protected String noReferenceFound$str() {
        return "WFLYIIOP0036: Nenhum objeto de referência limitado para o nome especificado";
    }
    @Override
    protected String errorGettingBindingList$str() {
        return "WFLYIIOP0024: Erro ao obter a lista binding";
    }
    @Override
    protected String errorResolvingInitRef$str() {
        return "WFLYIIOP0098: Falha ao resolver a referência inicial %1$s";
    }
    @Override
    protected String duplicateTypeCodeForClass$str() {
        return "WFLYIIOP0091: TypeCode já estabelecido para a classe %1$s";
    }
    @Override
    protected String inconsistentRequiredTransportConfig$str() {
        return "WFLYIIOP0106: Configuração inconsistente de transport-config: %1$s está definido como verdadeiro. Configure %2$s conforme necessário";
    }
    @Override
    protected String unavailableSHADigest$str() {
        return "WFLYIIOP0071: Nenhum resumo da mensagem disponível";
    }
    @Override
    protected String badRMIIIOPMethodSignature$str() {
        return "WFLYIIOP0068: Todos os métodos devem lançar javax.rmi.RemoteException, mas isto não é necessário para o método %1$s da interface %2$s";
    }
    @Override
    protected String missingSASContext$str() {
        return "WFLYIIOP0018: O contexto SAS não existe";
    }
    @Override
    protected String invalidURLOrIOR$str() {
        return "WFLYIIOP0032: IOR ou URL inválido: %1$s";
    }
    @Override
    protected String cannotAnalyzeStringType$str() {
        return "WFLYIIOP0073: Não foi possível analisar o java.lang.String: isto é um caso especial";
    }
    @Override
    protected String errorDecodingInitContextToken$str() {
        return "WFLYIIOP0019: Não foi possível decodificar o token do contexto inicial";
    }
    @Override
    protected String errorGeneratingObjectViaFactory$str() {
        return "WFLYIIOP0025: Erro ao gerar o objeto através da criação do objeto";
    }
    @Override
    protected String unexpectedException$str() {
        return "WFLYIIOP0014: Exceção inesperada";
    }
    @Override
    protected String noMethodDefForPortableRemoteObjectToStub$str() {
        return "WFLYIIOP0043: Nenhuma definição de método para o javax.rmi.PortableRemoteObject.toStub(java.rmi.Remote)";
    }
    @Override
    protected String exceptionDestroingIterator$str() {
        return "WFLYIIOP0102: Exceção detectada destruindo Iterator %1$s";
    }
    @Override
    protected String errorConvertingIORToNamingCtx$str() {
        return "WFLYIIOP0028: Não foi possível converter o IOR para NamingContext: %1$s";
    }
    @Override
    protected String logInternalError$str() {
        return "WFLYIIOP0004: Erro interno";
    }
    @Override
    protected String notACorbaObject$str() {
        return "WFLYIIOP0035: Apenas instâncias do org.omg.CORBA.Object podem ser encontradas";
    }
    @Override
    protected String errorMashalingParams$str() {
        return "WFLYIIOP0083: Não foi possível efetuar o marshal no parâmetro: número inesperado de parâmetros";
    }
    @Override
    protected String notANamingContext$str() {
        return "WFLYIIOP0027: %1$s não nomeia um NamingContext";
    }
    @Override
    protected String errorMarshaling$str() {
        return "WFLYIIOP0081: Ocorreu um erro ao marshaling %1$s";
    }
    @Override
    protected String elytronInitializerNotSupportedInPreviousVersions$str() {
        return "WFLYIIOP0114: O inicializador de segurança do Elytron não é suportado em versões anteriores de iiop-openjdk e não pode ser convertido";
    }
    @Override
    protected String collisionWhileCreatingPackage$str() {
        return "WFLYIIOP0092: Colisão de nome enquanto criando o pacote";
    }
    @Override
    protected String failedToStartJBossCOSNaming$str() {
        return "WFLYIIOP0054: Falha ao iniciar o Serviço de Nomeação JBoss Corba";
    }
    @Override
    protected String warnClassDescDoesNotConformToSpec$str() {
        return "WFLYIIOP0010: Problema de compatibilidade: o javax.rmi.CORBA.ClassDesc não está de acordo com a Linguagem Java(TM) à Especificação de Mapeamento IDL (01-06-07), seção 1.3.5.11";
    }
    @Override
    protected String badKindForTypeCode$str() {
        return "WFLYIIOP0085: Tipo ruim de %1$d para o TypeCode";
    }
    @Override
    protected String badRMIIIOPConstantType$str() {
        return "WFLYIIOP0066: Campo %1$s de interface %2$s é uma constante, mas não é primitivo ou cadeia";
    }
    @Override
    protected String errorDecodingContextData$str() {
        return "WFLYIIOP0022: Exceção na decodificação de dados do contexto em %1$s";
    }
    @Override
    protected String problemInvokingPortableRemoteObjectToStub$str() {
        return "WFLYIIOP0041: Problema com o PortableRemoteObject.toStub(); o objeto não foi exportado ou o stub não foi encontrado";
    }
    @Override
    protected String cannotInvokeStubConnect$str() {
        return "WFLYIIOP0045: Não foi possível invocar o javax.rmi.CORBA.Stub.connect()";
    }
    @Override
    protected String cannotObtainExceptionRepositoryID$str() {
        return "WFLYIIOP0082: Não foi possível obter uma id do repositório de exceção para %1$s";
    }
    @Override
    protected String wrongInterfaceRepository$str() {
        return "WFLYIIOP0086: Repositório errado de interface";
    }
    @Override
    protected String caughtExceptionEncodingGSSUPMechOID$str() {
        return "WFLYIIOP0003: Foi vista uma exceção enquanto codificação GSSUPMechOID";
    }
    @Override
    protected String errorUnmarshaling$str() {
        return "WFLYIIOP0080: Ocorreu um erro ao unmarshaling %1$s";
    }
    @Override
    protected String errorObtainingKeyManagers$str() {
        return "WFLYIIOP0052: O keyManager[] é nulo para o domínio de segurança %1$s";
    }
    @Override
    protected String illegalBatchSize$str() {
        return "WFLYIIOP0023: Tamanho de lote não numérico: %1$s";
    }
    @Override
    protected String cannotAnalyzeSpecialClass$str() {
        return "WFLYIIOP0061: Não foi possível analisar uma classe especial: %1$s";
    }
    @Override
    protected String valueTypeCantImplementRemote$str() {
        return "WFLYIIOP0075: O tipo de valor %1$s não pôde implantar o java.rmi.Remote";
    }
    @Override
    protected String errorCreatingPOAFromParent$str() {
        return "WFLYIIOP0099: Falha ao criar o POA a partir do pai";
    }
    @Override
    protected String warnCouldNotDeactivateAnonIRObject$str() {
        return "WFLYIIOP0012: Não foi possível desativar o objeto IR anônimo";
    }
    @Override
    protected String problemInvokingStubConnect$str() {
        return "WFLYIIOP0044: Problema ao invocar o javax.rmi.CORBA.Stub.connect()";
    }
    @Override
    protected String noReadMethodInHelper$str() {
        return "WFLYIIOP0078: Nenhum método de leitura na classe auxiliar %1$s";
    }
    @Override
    protected String sslNotConfigured$str() {
        return "WFLYIIOP0103: As configurações IOR implicam a utilização de conexões ssl, mas conexões seguras não foram configuradas ";
    }
    @Override
    protected String unknownTypeCodeForClass$str() {
        return "WFLYIIOP0090: TypeCode desconhecido para a classe %1$s ";
    }
    @Override
    protected String unknownPrimitiveType$str() {
        return "WFLYIIOP0072: Tipo primitivo desconhecido: %1$s";
    }
    @Override
    protected String cannotAnalyzeClassType$str() {
        return "WFLYIIOP0074: Não foi possível analisar o java.lang.Class: isto é um caso especial";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYIIOP0118: A segurança do legado não é mais compatível.";
    }
    @Override
    protected String cannotCreateSSLSocket$str() {
        return "WFLYIIOP0109: O socket SSL é exigido pelo servidor mas conexões seguras não foram configuradas";
    }
    @Override
    protected String inconsistentSupportedTransportConfig$str() {
        return "WFLYIIOP0104: Configuração inconsistente de transport-config: %1$s é compatível, configure-o com o valor %2$s";
    }
    @Override
    protected String inconsistentUnsupportedTransportConfig$str() {
        return "WFLYIIOP0105: Configuração inconsistente de transport-config: %1$s não é compatível";
    }
    @Override
    protected String errorSettingSlotInTxInterceptor$str() {
        return "WFLYIIOP0058: Exceção ao obter o slot no TxServerInterceptor";
    }
    @Override
    protected String foreignTransaction$str() {
        return "WFLYIIOP0055: Transação Exterior";
    }
    @Override
    protected String noWriteMethodInHelper$str() {
        return "WFLYIIOP0079: Nenhum método de gravação na classe auxiliar %1$s";
    }
    @Override
    protected String errorConnectingToORB$str() {
        return "WFLYIIOP0031: Não foi possível conectar-se ao ORB";
    }
    @Override
    protected String notAnClassOrInterface$str() {
        return "WFLYIIOP0063: Não é uma classe ou interface: %1$s";
    }
    @Override
    protected String wontUseCleartextSocket$str() {
        return "WFLYIIOP0117: CLEARTEXT no subsistema IIOP não será usado porque o parâmetro server-requires-ssl foi configurado como verdadeiro";
    }
    @Override
    protected String invalidIIOPURLVersion$str() {
        return "WFLYIIOP0047: Versão de IIOP URL inválida: %1$s";
    }
    @Override
    protected String invalidURIEncoding$str() {
        return "WFLYIIOP0050: Codificação de URI inválida: %1$s";
    }
    @Override
    protected String failedToGetSSLContext$str() {
        return "WFLYIIOP0053: Falha ao obter o contexto SSL";
    }
    @Override
    protected String errorRegisteringSASCurrentInitRef$str() {
        return "WFLYIIOP0017: Não foi possível registrar a referência inicial para o SASCurrent";
    }
    @Override
    protected String errorEncodingContext$str() {
        return "WFLYIIOP0056: Exceção encontrada durante a codificação";
    }
    @Override
    protected String errorLoadingClass$str() {
        return "WFLYIIOP0077: Erro ao carregar a classe %1$s";
    }
    @Override
    protected String badClassForConstant$str() {
        return "WFLYIIOP0089: Classe ruim %1$s para uma constante";
    }
    @Override
    protected String cannotInvokePortableRemoteObjectToStub$str() {
        return "WFLYIIOP0042: Não foi possível invocar o javax.rmi.PortableRemoteObject.toStub(java.rmi.Remote)";
    }
    @Override
    protected String cannotAnalyzeNullClass$str() {
        return "WFLYIIOP0059: Não foi possível analisar a classe nula";
    }
    @Override
    protected String badConstantType$str() {
        return "WFLYIIOP0060: Tipo inválido para uma constante: %1$s";
    }
    @Override
    protected String invalidPOACreationArgs$str() {
        return "WFLYIIOP0100: Não foi possível instanciar o POA: o ORB em execução ou o POA pai devem ser especificados";
    }
    @Override
    protected String noSocketBindingsConfigured$str() {
        return "WFLYIIOP0115: Nenhuma ligação de soquete IIOP foi configurada";
    }
    @Override
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYIIOP0119: O uso de reinos de segurança em tempo de execução não é compatível.";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYIIOP0001: Ativação de subsistema IIOP ";
    }
    @Override
    protected String unescapedCharacter$str() {
        return "WFLYIIOP0038: %1$s: final do componente sem escape";
    }
    @Override
    protected String classIsNotArray$str() {
        return "WFLYIIOP0093: A classe %1$s não é uma classe matriz";
    }
    @Override
    protected String badRMIIIOPExceptionType$str() {
        return "WFLYIIOP0067: Exceção tipo %1$s deve ser uma classe de exceção checada";
    }
    @Override
    protected String invalidNullClass$str() {
        return "WFLYIIOP0088: Classe nula inválida";
    }
    @Override
    protected String notAnAccessor$str() {
        return "WFLYIIOP0062: Não é um acessador: %1$s";
    }
    @Override
    protected String errorDecodingTargetInContextToken$str() {
        return "WFLYIIOP0020: Não foi possível decodificar o nome de destinação no token do contexto inicial";
    }
    @Override
    protected String notAnInterface$str() {
        return "WFLYIIOP0064: Classe %1$s não é uma interface";
    }
    @Override
    protected String runtimeSecurityDomainUnsupported$str() {
        return "WFLYIIOP0120: Não há suporte para o uso de domínios de segurança em tempo de execução.";
    }
    @Override
    protected String serverDoesNotSupportSsl$str() {
        return "WFLYIIOP0110: O cliente requer SSL mas o servidor não tem suporte para isso";
    }
    @Override
    protected String noMethodDefForStubConnect$str() {
        return "WFLYIIOP0046: Nenhuma definição de método para o javax.rmi.CORBA.Stub.connect(org.omg.CORBA.ORB)";
    }
    @Override
    protected String corbaORBServiceStarted$str() {
        return "WFLYIIOP0009: Serviço CORBA ORB iniciado";
    }
    @Override
    protected String failedToObtainJSSEDomain$str() {
        return "WFLYIIOP0007: Falha ao obter o domínio de segurança JSSE com o nome %1$s";
    }
    @Override
    protected String primitivesHaveNoIRIds$str() {
        return "WFLYIIOP0070: Tipos primitivos não possuem IR IDs";
    }
    @Override
    protected String errorResolvingRefToAbstractValuetype$str() {
        return "WFLYIIOP0097: ValueDef %1$s não disponível para solucionar a referência para base abstrata de valuetype %2$s";
    }
    @Override
    protected String cannotDestroyRMIIIOPMapping$str() {
        return "WFLYIIOP0094: Não foi possível destruir o mapeamento RMI/IIOP";
    }
    @Override
    protected String invalidURL$str() {
        return "WFLYIIOP0040: %1$s inválido URL: %2$s";
    }
    @Override
    protected String invalidEscapedCharacter$str() {
        return "WFLYIIOP0039: %1$s: caractere inválido sendo aplicado o escape";
    }
    @Override
    protected String cannotChangeRMIIIOPMapping$str() {
        return "WFLYIIOP0084: Não foi possível alterar o mapeamento RMI/IIOP ";
    }
    @Override
    protected String warnCouldNotDeactivateIRObject$str() {
        return "WFLYIIOP0011: Não foi possível desativar o objeto IR";
    }
    @Override
    protected String failedToUnbindObject$str() {
        return "WFLYIIOP0006: Falha ao desvincular para %1$s";
    }
    @Override
    protected String urlDoesNotContainIOR$str() {
        return "WFLYIIOP0034: %1$s não contém um IOR";
    }
    @Override
    protected String cosNamingNotRegisteredCorrectly$str() {
        return "WFLYIIOP0030: O serviço do Nome COS não registrado como o ORB sob o nome 'NameService'";
    }
    @Override
    protected String errorActivatingPOA$str() {
        return "WFLYIIOP0101: Falha ao ativar o POA";
    }
    @Override
    protected String failedToFetchCSIv2Policy$str() {
        return "WFLYIIOP0002: Erro ao pesquisar CSIv2Policy";
    }
    @Override
    protected String errorGettingSlotInTxInterceptor$str() {
        return "WFLYIIOP0057: Exceção ao obter o slot no TxServerInterceptor";
    }
    @Override
    protected String unexpectedContextErrorInSASReply$str() {
        return "WFLYIIOP0015: ContextErro inesperado na resposta SAS";
    }
}
