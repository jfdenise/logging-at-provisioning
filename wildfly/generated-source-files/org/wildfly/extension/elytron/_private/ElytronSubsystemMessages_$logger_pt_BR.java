package org.wildfly.extension.elytron._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:16+0200")
public class ElytronSubsystemMessages_$logger_pt_BR extends ElytronSubsystemMessages_$logger_pt implements ElytronSubsystemMessages, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ElytronSubsystemMessages_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unableToLoadPropertiesFiles$str() {
        return "WFLYELY00014: Não foi possível carregar os arquivos de propriedades necessários para iniciar o realm com backup do arquivo de propriedades: Arquivo de usuários: '%1$s' Arquivo de grupos: '%2$s'";
    }
    @Override
    protected String updateDependantServices$str() {
        return "Atualize os recursos dependentes, pois o alias '%1$s' não existe mais";
    }
    @Override
    protected String invalidRegularExpression$str() {
        return "WFLYELY00016: A expressão regular '%1$s' fornecida é inválida.";
    }
    @Override
    protected String topMostCertificateFromCertificateReplyNotTrusted$str() {
        return "WFLYELY01037: O certificado mais superior da resposta do certificado não é confiável. Inspecione o certificado cuidadosamente e, se ele for válido, execute import-certificate novamente com validate definido como false.";
    }
    @Override
    protected String unableToObtainDynamicSSLContext$str() {
        return "WFLYELY01221: Não é possível obter DynamicSSLContext do contexto de autenticação fornecido";
    }
    @Override
    protected String couldNotRemoveAttribute$str() {
        return "WFLYELY01010: Falha ao remover atributo.";
    }
    @Override
    protected String suffixContainsMillis$str() {
        return "WFLYELY01019: O sufixo (%1$s) não pode conter segundos ou milésimos de segundos.";
    }
    @Override
    protected String unableToPerformOutflow$str() {
        return "WFLYELY01015: Não foi possível executar a saída automática para '%1$s'";
    }
    @Override
    protected String keyStoreAliasAlreadyExists$str() {
        return "WFLYELY01036: O alias '%1$s' já existe no KeyStore";
    }
    @Override
    protected String failedToSetPolicy$str() {
        return "WFLYELY01022: Falha ao definir a política [%1$s]";
    }
    @Override
    protected String cycleDetected$str() {
        return "WFLYELY00043: Foi detectado um ciclo de inicialização dos recursos - %1$s";
    }
    @Override
    protected String reloadDependantServices$str() {
        return "Recarregar serviços dependentes que já podem ter armazenado em cache o valor secreto";
    }
    @Override
    protected String failedToStoreGeneratedSelfSignedCertificate$str() {
        return "WFLYELY01082: Falha ao armazenar o certificado autoassinado gerado";
    }
    @Override
    protected String unableToCompleteOperation$str() {
        return "WFLYELY00009: Não foi possível concluir a operação. '%1$s'";
    }
    @Override
    protected String providerLoaderCannotSupplyProvider$str() {
        return "WFLYELY00914: O carregador do provedor '%1$s' não pode fornecer o provedor do repositório de credenciais do tipo '%2$s'";
    }
    @Override
    protected String unableToCreateCredentialStoreImmediately$str() {
        return "WFLYELY00924: Não é possível criar um repositório de credenciais imediatamente disponível.";
    }
    @Override
    protected String trustedCertificateAlreadyInKeyStore$str() {
        return "WFLYELY01038: O certificado confiável já está no KeyStore no alias '%1$s'";
    }
    @Override
    protected String identityNotAuthorized$str() {
        return "WFLYELY01004: A identidade com o nome [%1$s] não foi autorizada.";
    }
    @Override
    protected String propertyFileIsInvalid$str() {
        return "WFLYELY00025: O arquivo de propriedades referenciado é inválido: %1$s";
    }
    @Override
    protected String unableToChangeAccountKeyWithCertificateAuthority$str() {
        return "WFLYELY01044: Não foi possível criar a chave da conta associada à autoridade de certificação: %1$s";
    }
    @Override
    protected String componentNotConfigurable$str() {
        return "WFLYELY00015: A implementação de componentes personalizados “%1$s” não implementa o método initialize(Map<String, String>), entretanto a configuração foi fornecida.";
    }
    @Override
    protected String defaultRealmNotReferenced$str() {
        return "WFLYELY00013: O default-realm '%1$s' não está na lista de realms [%2$s] referenciados para este domínio.";
    }
    @Override
    protected String invalidCertificateAuthorityChallenge$str() {
        return "WFLYELY01050: Desafio da autoridade de certificação inválido";
    }
    @Override
    protected String letsEncryptNameNotAllowed$str() {
        return "WFLYELY01063: A autoridade de certificação LetsEncrypt é configurada por padrão.";
    }
    @Override
    protected String couldNotObtainAuthorizationIdentity$str() {
        return "WFLYELY01008: Falha ao obter a identidade de autorização.";
    }
    @Override
    protected String unableToDetectKeyStore$str() {
        return "WFLYELY01059: Não foi possível detectar o KeyStore '%1$s'";
    }
    @Override
    protected String unableToLoadModule$str() {
        return "WFLYELY00035: Não é possível carregar módulo '%1$s'.";
    }
    @Override
    protected String unableToTransformMultipleRealms$str() {
        return "WFLYELY00042: Não foi possível transformar vários 'authorization-realms' para o valor único";
    }
    @Override
    protected String unableToEncryptClearText$str() {
        return "WFLYELY00923: Não é possível criptografar o texto não criptografado fornecido.";
    }
    @Override
    protected String invalidNotBefore$str() {
        return "WFLYELY01028: Valor inválido para not-before. %1$s";
    }
    @Override
    protected String noResolverSpecifiedAndNoDefault$str() {
        return "WFLYELY01200: O nome do resolvedor a ser usado não foi especificado e nenhum resolvedor padrão foi definido.";
    }
    @Override
    protected String cantSaveWithoutFile$str() {
        return "WFLYELY00010: Não foi possível salvar a KeyStore – O arquivo '%1$s' da KeyStore não existe.";
    }
    @Override
    protected String unableToReloadCredentialStore$str() {
        return "WFLYELY00925: Não é possível recarregar o repositório de credenciais.";
    }
    @Override
    protected String filesystemMissingKeypair$str() {
        return "WFLYELY01215: Falta a configuração do par de chaves do sistema de arquivos, a verificação de integridade não está habilitada";
    }
    @Override
    protected String nonexistingKeyStoreMissingType$str() {
        return "WFLYELY01080: O armazenamento de chaves não existente precisa ter um tipo definido.";
    }
    @Override
    protected String unableToCreateManagerFactory$str() {
        return "WFLYELY00018: Não foi possível criar %1$s para o algoritmo '%2$s'.";
    }
    @Override
    protected String unableToTransformTornAttribute$str() {
        return "WFLYELY00041: Não foi possível transformar a configuração para a versão de destino. O atributo '%1$s' é diferente de '%2$s'";
    }
    @Override
    protected String keyStoreMissingAlias$str() {
        return "WFLYELY01218: O armazenamento de chaves usado pelo reino do sistema de arquivos não contém o pseudônimo: %1$s";
    }
    @Override
    protected String noTypeFound$str() {
        return "WFLYELY00019: Nenhum '%1$s' encontrado no valor injetado.";
    }
    @Override
    protected String cachedRealmServiceNotAvailable$str() {
        return "WFLYELY00050: O realm não está disponível. Você não pode limpar o cache.";
    }
    @Override
    protected String missingCertificateAuthorityChallenge$str() {
        return "WFLYELY01088: Desafio de autoridade de certificado ausente";
    }
    @Override
    protected String unableToVerifyIntegrity$str() {
        return "WFLYELY01214: Não é possível verificar a integridade do reino do sistema de arquivos: %1$s";
    }
    @Override
    protected String duplicateRealmInjection$str() {
        return "WFLYELY00002: Não é possível injetar o mesmo realm '%1$s' em um único domínio de segurança.";
    }
    @Override
    protected String failedToLoadCallbackhandlerFromProvidedModule$str() {
        return "WFLYELY00045: Falha no carregamento do CallbackHandler a partir do módulo fornecido.";
    }
    @Override
    protected String hostContextMapHostnameContainsCaret$str() {
        return "WFLYELY01087: O nome do host no mapeamento SNI não pode conter o caractere ^.";
    }
    @Override
    protected String certificateFileDoesNotExist$str() {
        return "WFLYELY01041: O arquivo do certificado não existe";
    }
    @Override
    protected String unableToUpdateCertificateAuthorityAccountKeyStore$str() {
        return "WFLYELY01048: Não foi possível atualizar o armazenamento de chaves da conta da autoridade de certificação: %1$s";
    }
    @Override
    protected String unableToObtainCertificate$str() {
        return "WFLYELY01032: Não foi possível obter o certificado para o alias '%1$s'";
    }
    @Override
    protected String invalidCertificateRevocationReason$str() {
        return "WFLYELY01051: Motivo da revogação de certificado inválido '%1$s'";
    }
    @Override
    protected String invalidAttributeValue$str() {
        return "WFLYELY01062: O valor para o atributo '%1$s' é inválido.";
    }
    @Override
    protected String keyStoreFileNotExistsButIgnored$str() {
        return "WFLYELY00023: O arquivo '%1$s' da KeyStore não existe. Usado em branco.";
    }
    @Override
    protected String credentialCannotBeResolved$str() {
        return "WFLYELY00916: Não foi possível resolver a credencial";
    }
    @Override
    protected String unableToRespondToCertificateAuthorityChallenge$str() {
        return "WFLYELY01049: Não foi possível responder ao desafio da autoridade de certificação: %1$s";
    }
    @Override
    protected String unableToAccessEntryFromKeyStore$str() {
        return "WFLYELY00033: Não foi possível acessar a entrada [%1$s] no armazenamento de chaves [%2$s].";
    }
    @Override
    protected String jaasEntryNotDefined$str() {
        return "WFLYELY00049: A entrada não está definida.";
    }
    @Override
    protected String couldNotReadIdentity2$str() {
        return "WFLYELY01005: Não foi possível ler a identidade [%1$s] no domínio de segurança [%2$s].";
    }
    @Override
    protected String unableToObtainPrivateKey$str() {
        return "WFLYELY01031: Não foi possível obter a PrivateKey para o alias '%1$s'";
    }
    @Override
    protected String unableToLoadModuleRuntime$str() {
        return "WFLYELY01079: Não é possível carregar módulo '%1$s'.";
    }
    @Override
    protected String invalidCipherSuiteFilter$str() {
        return "WFLYELY01017: Valor inválido para cipher-suite-filter. %1$s";
    }
    @Override
    protected String representationOfX500IsRequired$str() {
        return "WFLYELY00048: É necessária uma representação em cadeia de um nome distinto X.500: %1$s";
    }
    @Override
    protected String unableToDetermineIfCertificateIsTrusted$str() {
        return "WFLYELY01040: Não foi possível determinar se o certificado é confiável. Inspecione o certificado cuidadosamente e, se ele for válido, execute import-certificate novamente com validate definido como false.";
    }
    @Override
    protected String noCertificatesFoundInCertificateReply$str() {
        return "WFLYELY01033: Nenhum certificado encontrado na resposta do certificado";
    }
    @Override
    protected String jaasFileDoesNotExist$str() {
        return "WFLYELY00046: Desde que o caminho “%1$s” para o arquivo de configuração JAAS não exista.";
    }
    @Override
    protected String keyStoreAliasDoesNotIdentifyPrivateKeyEntry$str() {
        return "WFLYELY01030: O alias '%1$s' não identifica uma PrivateKeyEntry no armazenamento de chaves";
    }
    @Override
    protected String failedToCreatePolicy$str() {
        return "WFLYELY01025: Falha ao criar a política [%1$s]";
    }
    @Override
    protected String unableToObtainCertificateAuthorityAccountCertificate$str() {
        return "WFLYELY01046: Não foi possível obter o certificado da conta da autoridade de certificação para o alias '%1$s'";
    }
    @Override
    protected String noTypeFoundForLazyInitKeyManager$str() {
        return "WFLYELY01083: Nenhum '%1$s' encontrado no valor injetado.";
    }
    @Override
    protected String selfSignedCertificateWillBeCreated$str() {
        return "WFLYELY01084: Armazenamento de chaves %1$s não encontrado. Ele será gerado automaticamente no primeiro uso com um certificado autoassinado para o host %2$s";
    }
    @Override
    protected String jdbcRealmOnlySingleKeyMapperAllowed$str() {
        return "WFLYELY00034: Uma consulta principal pode ter somente um único mapeador de chaves";
    }
    @Override
    protected String requiredServiceNotUp$str() {
        return "WFLYELY00007: O serviço '%1$s' solicitado não está UP. No momento, ele está '%2$s'.";
    }
    @Override
    protected String addSecretKeyToInitializedFilesystemRealm$str() {
        return "WFLYELY01220: A chave secreta de criptografia não pode ser adicionada a um realm de sistema de arquivos não vazio após a inicialização. Para atualizar um realm de sistema de arquivos, use o comando `filesystem-realm-encrypt` da Elytron Tool";
    }
    @Override
    protected String certificateReplySameAsCertificateFromKeyStore$str() {
        return "WFLYELY01035: A resposta do certificado é a mesma do certificado da PrivateKeyEntry no KeyStore";
    }
    @Override
    protected String keyStoreFileNotExists$str() {
        return "WFLYELY00022: O arquivo '%1$s' da KeyStore não existe; este arquivo é necessário.";
    }
    @Override
    protected String certificateNotValid$str() {
        return "WFLYELY00024: O certificado [%1$s] na KeyStore não é válido";
    }
    @Override
    protected String trustedCertificateAlreadyInCacertsKeyStore$str() {
        return "WFLYELY01039: O certificado confiável já está no KeyStore cacerts no alias '%1$s'";
    }
    @Override
    protected String failedToLoadResponderCert$str() {
        return "WFLYELY01064: Falha ao carregar o certificado do respondente OCSP '%1$s'.";
    }
    @Override
    protected String keyPasswordCannotBeResolved$str() {
        return "WFLYELY01027: Não é possível resolver a senha da chave para o armazenamento de chaves '%1$s'";
    }
    @Override
    protected String unableToEnableJaccSupport$str() {
        return "WFLYELY01086: Não foi possível inicializar o suporte para Elytron JACC enquanto o suporte para JACC antigo está ativado.";
    }
    @Override
    protected String propertyFilesDoesNotExist$str() {
        return "WFLYELY00017: O arquivo de propriedades referenciado em properties-realm não existe: %1$s";
    }
    @Override
    protected String invalidDefinition$str() {
        return "WFLYELY01014: Definição [%1$s] inválida. Somente '%2$s' ou '%3$s' podem ser definidos em um objeto na lista de filtros.";
    }
    @Override
    protected String noResolverWithSpecifiedName$str() {
        return "WFLYELY01201: Nenhum resolvedor de expressões foi definido com o nome '%1$s'.";
    }
    @Override
    protected String couldNotReadIdentity1$str() {
        return "WFLYELY01007: Não foi possível ler a identidade com o nome [%1$s].";
    }
    @Override
    protected String cycleDetectedInitialisingExpressionResolver$str() {
        return "WFLYELY01202: Foi detectado um ciclo inicializando o resolvedor de expressões para '%1$s' e '%2$s'.";
    }
    @Override
    protected String invalidServiceNameParent$str() {
        return "WFLYELY00044: Nome inesperado do pai do nome de serviço - %1$s";
    }
    @Override
    protected String credentialDoesNotExist$str() {
        return "WFLYELY00920: O alias da credencial '%1$s' do tipo de credencial '%2$s' não existe no repositório";
    }
    @Override
    protected String invalidTypeInjected$str() {
        return "WFLYELY00037: O valor injetado não é do tipo '%1$s'.";
    }
    @Override
    protected String unableToGetCertificateAuthorityMetadata$str() {
        return "WFLYELY01054: Não foi possível obter os metadados associados à autoridade de certificação: %1$s";
    }
    @Override
    protected String unableToReloadCRL$str() {
        return "WFLYELY00032: Não foi possível recarregar o arquivo CRL.";
    }
    @Override
    protected String realmRefererencedTwice$str() {
        return "WFLYELY00036: O realm de segurança '%1$s' foi referenciado duas vezes no mesmo domínio de segurança.";
    }
    @Override
    protected String couldNotAddAttribute$str() {
        return "WFLYELY01009: Falha ao adicionar atributo.";
    }
    @Override
    protected String filelessKeyStoreMissingType$str() {
        return "WFLYELY01060: O armazenamento de chaves sem arquivo deve ter um tipo definido.";
    }
    @Override
    protected String realmDoesNotSupportCache$str() {
        return "WFLYELY00030: O realm '%1$s' não é compatível com cache";
    }
    @Override
    protected String publicKeyFromCertificateReplyDoesNotMatchKeyStore$str() {
        return "WFLYELY01034: A chave pública da resposta do certificado não corresponde à chave pública do certificado no KeyStore";
    }
    @Override
    protected String exceptionWhileCreatingPermission$str() {
        return "WFLYELY00021: Exceção ao criar o objeto de permissão para o mapeamento de permissões. Verifique [class-name], [target-name] (nome da permissão) e [action] de [%1$s].";
    }
    @Override
    protected String invalidCipherSuiteNames$str() {
        return "WFLYELY01066: Valor inválido para cipher-suite-names. %1$s";
    }
    @Override
    protected String invalidImplementationLoaded$str() {
        return "WFLYELY01069: Carregador %1$s inválido; %2$s era esperado, mas foi recebido %3$s.";
    }
    @Override
    protected String unableToLoadCredential$str() {
        return "WFLYELY00922: Não é possível carregar a credencial do repositório de credenciais.";
    }
    @Override
    protected String unableToCreateAccountWithCertificateAuthority$str() {
        return "WFLYELY01043: Não foi possível criar uma conta com a autoridade de certificação: %1$s";
    }
    @Override
    protected String unableToObtainEntry$str() {
        return "WFLYELY01042: Não foi possível obter a entrada para o alias '%1$s'";
    }
    @Override
    protected String unableToGetKeyStorePassword$str() {
        return "WFLYELY01216: O domínio do sistema de arquivos não consegue obter a senha do armazenamento de chaves";
    }
    @Override
    protected String keyStorePasswordCannotBeResolved$str() {
        return "WFLYELY00910: Não é possível resolver a senha para o armazenamento de chaves '%1$s'";
    }
    @Override
    protected String invalidSuffix$str() {
        return "WFLYELY01020: O sufixo (%1$s) é inválido. Ele deve ser um formato de data válido.";
    }
    @Override
    protected String illegalNonManagementInitialization$str() {
        return "WFLYELY01210: A inicialização de um %1$s sem um OperationContext de gerenciamento ativo não é permitida.";
    }
    @Override
    protected String invalidPermissionModule$str() {
        return "WFLYELY00040: Não foi possível carregar o módulo de permissões '%1$s' para o mapeamento de permissões";
    }
    @Override
    protected String discardingUnusedPolicy$str() {
        return "WFLYELY01026: O elemento '%1$s' com o atributo '%2$s' definido como '%3$s' não é usado. Como as configurações de políticas não utilizadas não podem mais ser armazenadas no modelo de configuração, este item está sendo descartado.";
    }
    @Override
    protected String couldNotCreateIdentity$str() {
        return "WFLYELY01001: Não foi possível criar a identidade com o nome [%1$s].";
    }
    @Override
    protected String patternRequiresCaptureGroup$str() {
        return "WFLYELY01013: O padrão [%1$s] exige um grupo de captura";
    }
    @Override
    protected String couldNotDeleteIdentity$str() {
        return "WFLYELY01003: Não foi possível excluir a identidade com o nome [%1$s].";
    }
    @Override
    protected String duplicatePolicyContextHandler$str() {
        return "WFLYELY01068: PolicyContextHandler duplicado encontrado para a chave '%1$s'.";
    }
    @Override
    protected String unableToResolveCredentialStore$str() {
        return "WFLYELY01208: Não foi possível resolver a CredentialStore %1$s -- %2$s";
    }
    @Override
    protected String unableToAccessKeyStore$str() {
        return "WFLYELY00005: Não foi possível acessar o KeyStore para completar a operação solicitada.";
    }
    @Override
    protected String filesystemIntegrityInvalid$str() {
        return "WFLYELY01217: A verificação do reino falhou, assinaturas inválidas para as identidades: %1$s";
    }
    @Override
    protected String serverNotKnown$str() {
        return "WFLYELY01016: Servidor '%1$s' desconhecido";
    }
    @Override
    protected String unableToStartService$str() {
        return "WFLYELY00004: Não foi possível iniciar o serviço.";
    }
    @Override
    protected String unableToReloadCRLNotReloadable$str() {
        return "WFLYELY00039: Não foi possível recarregar o arquivo CRL, o TrustManager não é recarregável";
    }
    @Override
    protected String secretKeyOperationFailed$str() {
        return "WFLYELY00927: A operação da chave secreta '%1$s' não foi concluída devido a '%2$s'.";
    }
    @Override
    protected String identityNotFound$str() {
        return "WFLYELY01002: Não foi encontrada nenhuma identidade com o nome [%1$s].";
    }
    @Override
    protected String failedToRegisterPolicyHandlers$str() {
        return "WFLYELY01024: Falha ao registrar os manipuladores de contexto de política";
    }
    @Override
    protected String unableToLoadCredentialStore$str() {
        return "WFLYELY01211: Não é possível de carregar a loja de credenciais.";
    }
    @Override
    protected String credentialStoreProtectionParameterCannotBeResolved$str() {
        return "WFLYELY00911: Não é possível resolver o parâmetro de proteção do repositório de credenciais '%1$s'";
    }
    @Override
    protected String multipleMaximumCertPathDefinitions$str() {
        return "WFLYELY01065: Várias definições máximas de caminho de certificação encontradas.";
    }
    @Override
    protected String expressionResolverInitialisationAlreadyFailed$str() {
        return "WFLYELY01203: A inicialização do resolvedor de expressões já falhou.";
    }
    @Override
    protected String filebasedKeystoreLocationMissing$str() {
        return "WFLYELY00921: O parâmetro de local não foi especificado para o tipo de armazenamento de chaves baseado em arquivo '%1$s'";
    }
    @Override
    protected String unableToInstatiateAcmeClientSpiImplementation$str() {
        return "WFLYELY01052: Não foi possível instanciar a implementação de AcmeClientSpi";
    }
    @Override
    protected String unableToUpdateAccountWithCertificateAuthority$str() {
        return "WFLYELY01053: Não foi possível atualizar a conta com a autoridade de certificação: %1$s";
    }
    @Override
    protected String x500AttributeMustBeDefined$str() {
        return "WFLYELY00028: O atributo X.500 deve ser definido pelo nome ou pelo OID";
    }
    @Override
    protected String unableToObtainCertificateAuthorityAccountPrivateKey$str() {
        return "WFLYELY01047: Não foi possível obter a PrivateKey da conta da autoridade de certificação para o alias '%1$s'";
    }
    @Override
    protected String dirContextPasswordCannotBeResolved$str() {
        return "WFLYELY00917: Não foi possível resolver a senha para dir-context";
    }
    @Override
    protected String certificateAuthorityAccountAlreadyExists$str() {
        return "WFLYELY01056: Já existe uma conta de autoridade de certificação com essa chave. Para atualizar as informações de contato associadas à conta existente, use %1$s. Para alterar a chave associada à conta existente, use %2$s.";
    }
    @Override
    protected String credentialStoreEntryTypeNotSupported$str() {
        return "WFLYELY00909: O repositório de credenciais '%1$s' não é compatível com o tipo de entrada de repositório de credenciais '%2$s' fornecido";
    }
    @Override
    protected String noAllowedJkuValuesSpecifiedForTokenRealm$str() {
        return "WFLYELY01090: Os valores jku permitidos não foram especificados para o reino do token '%1$s'. A validação do token falhará se o token contiver um parâmetro de cabeçalho 'jku'. Os valores jku permitidos podem ser especificados como uma string separada por espaços usando a propriedade do sistema '%2$s'.";
    }
    @Override
    protected String missingPublicKey$str() {
        return "WFLYELY01213: O armazenamento de chaves não contém uma chave pública para o armazenamento de chaves: [%1$s] e pseudônimo: [%2$s].";
    }
    @Override
    protected String keyStoreAliasDoesNotExist$str() {
        return "WFLYELY01029: O alias '%1$s' não existe no KeyStore";
    }
    @Override
    protected String invalidSize$str() {
        return "WFLYELY01018: Tamanho inválido %1$s";
    }
    @Override
    protected String expressionResolutionWithoutResolver$str() {
        return "WFLYELY01204: A expressão '%1$s' não especifica um resolvedor, e não há nenhum padrão definido.";
    }
    @Override
    protected String failedToCreateServerAuthModule$str() {
        return "WFLYELY01057: Falha ao criar o ServerAuthModule [%1$s] usando o módulo '%2$s'";
    }
    @Override
    protected String selfSignedCertificateHasBeenCreated$str() {
        return "WFLYELY01085: Certificado autoassinado gerado em %1$s. Observe que os certificados autoassinados não são seguros e devem ser usados somente para fins de teste. Não utilize este certificado autoassinado na produção.";
    }
    @Override
    protected String missingPrivateKey$str() {
        return "WFLYELY01212: O armazenamento de chaves não contém uma chave privada para o armazenamento de chaves: [%1$s] e pseudônimo: [%2$s].";
    }
    @Override
    protected String unableToInitializeCredentialStore$str() {
        return "WFLYELY01209: Não foi possível inicializar a CredentialStore %1$s -- %2$s";
    }
    @Override
    protected String ldapRealmDirectVerificationAndUserPasswordMapper$str() {
        return "WFLYELY00047: O LDAP Realm está configurado para usar a verificação direta e a senha do usuário, o que é uma configuração inválida.";
    }
    @Override
    protected String modelStageResolutionNotSupported$str() {
        return "WFLYELY01207: A resolução das expressões do repositório de credenciais não é compatível na etapa MODELO de execução da operação.";
    }
    @Override
    protected String unableToReLoadPropertiesFiles$str() {
        return "WFLYELY00020: Não foi possível recarregar os arquivos de propriedades solicitados pelo realm com backup do arquivo de propriedades.";
    }
    @Override
    protected String credentialAlreadyExists$str() {
        return "WFLYELY00913: O alias da credencial '%1$s' do tipo de credencial '%2$s' já existe no repositório";
    }
    @Override
    protected String failedToParsePEMPublicKey$str() {
        return "WFLYELY01058: Falha ao analisar a chave pública do PEM com o filho: %1$s";
    }
    @Override
    protected String invalidRegex$str() {
        return "WFLYELY01067: O valor '%1$s' não é um regex válido.";
    }
    @Override
    protected String noSuitableProvider$str() {
        return "WFLYELY00012: Nenhum provedor adequado encontrado para o tipo '%1$s'";
    }
    @Override
    protected String invalidPermissionClass$str() {
        return "WFLYELY00038: Não foi possível carregar a classe de permissão '%1$s'";
    }
    @Override
    protected String addKeypairToInitializedFilesystemRealm$str() {
        return "WFLYELY01219: O par de chaves de integridade não pode ser adicionado a um realm de sistema de arquivos não vazio após a inicialização. Para atualizar um realm de sistema de arquivos, use o comando `filesystem-realm-integrity` da Elytron Tool";
    }
    @Override
    protected String invalidOperationName$str() {
        return "WFLYELY00008: Nome de operação '%1$s' inválido. '%2$s' era esperado";
    }
    @Override
    protected String invalidKeySize$str() {
        return "WFLYELY01055: Tamanho de chave inválido: %1$d";
    }
    @Override
    protected String cannotFindPolicyProvider$str() {
        return "WFLYELY01023: Não foi possível encontrar o provedor de políticas com o nome [%1$s]";
    }
    @Override
    protected String invalidResolver$str() {
        return "WFLYELY01205: A expressão '%1$s' especifica uma configuração de resolvedor que não existe.";
    }
    @Override
    protected String operationAddressMissingKey$str() {
        return "WFLYELY00003: A operação não continha um endereço com um valor para '%1$s'.";
    }
    @Override
    protected String invalidHostContextMapValue$str() {
        return "WFLYELY01061: Valor inválido do mapa de contexto do host: '%1$s' não é um padrão de nome de host válido.";
    }
    @Override
    protected String invalidURL$str() {
        return "WFLYELY00029: Falha ao analisar a URL %1$s";
    }
    @Override
    protected String unableToDecryptExpression$str() {
        return "WFLYELY01206: Não é possível decifrar a expressão '%1$s'.";
    }
    @Override
    protected String couldNotCreatePassword$str() {
        return "WFLYELY01011: Não foi possível criar a senha.";
    }
    @Override
    protected String unexpectedPasswordType$str() {
        return "WFLYELY01012: Tipo de senha inesperado [%1$s].";
    }
    @Override
    protected String unableToInitialiseCredentialStore$str() {
        return "WFLYELY00926: Não é possível inicializar o repositório de credenciais.";
    }
    @Override
    protected String failedToLazilyInitKeyManager$str() {
        return "WFLYELY01081: Falha ao inicializar lentamente o gerenciador de chaves";
    }
    @Override
    protected String unableToAccessCRL$str() {
        return "WFLYELY00031: Não foi possível acessar o arquivo CRL.";
    }
    @Override
    protected String unableToObtainOidForX500Attribute$str() {
        return "WFLYELY00027: Não foi possível obter o OID para o atributo X.500 '%1$s'";
    }
    @Override
    protected String identityAlreadyExists$str() {
        return "WFLYELY01000: A identidade com o nome [%1$s] já existe.";
    }
    @Override
    protected String unableToDeactivateAccountWithCertificateAuthority$str() {
        return "WFLYELY01045: Não foi possível desativar a conta associada à autoridade de certificação: %1$s";
    }
    @Override
    protected String invalidEncodingName$str() {
        return "WFLYELY01089: Codificação de arquivo inválida '%1$s'.";
    }
}
