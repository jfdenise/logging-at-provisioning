package org.wildfly.extension.elytron._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:16+0200")
public class ElytronSubsystemMessages_$logger_zh_CN extends ElytronSubsystemMessages_$logger_zh implements ElytronSubsystemMessages, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ElytronSubsystemMessages_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unableToLoadPropertiesFiles$str() {
        return "WFLYELY00014: 无法加载启动属性文件支持域所需的属性文件：用户文件：'%1$s' 组文件：'%2$s'";
    }
    @Override
    protected String updateDependantServices$str() {
        return "更新依赖资源，因为别名为 '%1$s' 的资源已不存在";
    }
    @Override
    protected String invalidRegularExpression$str() {
        return "WFLYELY00016: 提供的正则表达式 '%1$s' 无效。";
    }
    @Override
    protected String topMostCertificateFromCertificateReplyNotTrusted$str() {
        return "WFLYELY01037: 证书回复中最上面的证书不可信。请仔细检查此证书，如果有效，则将验证设置为 false，再次执行 import-certificate。";
    }
    @Override
    protected String unableToObtainDynamicSSLContext$str() {
        return "WFLYELY01221: 无法从提供的身份验证上下文获取 DynamicSSLContext";
    }
    @Override
    protected String couldNotRemoveAttribute$str() {
        return "WFLYELY01010: 未能删除属性。";
    }
    @Override
    protected String suffixContainsMillis$str() {
        return "WFLYELY01019: 后缀（%1$s）不能包含秒或毫秒。";
    }
    @Override
    protected String unableToPerformOutflow$str() {
        return "WFLYELY01015: 无法对 '%1$s' 执行自动流出";
    }
    @Override
    protected String keyStoreAliasAlreadyExists$str() {
        return "WFLYELY01036: KeyStore 中已存在别名 '%1$s'";
    }
    @Override
    protected String failedToSetPolicy$str() {
        return "WFLYELY01022: 设置策略 [%1$s] 失败";
    }
    @Override
    protected String cycleDetected$str() {
        return "WFLYELY00043: 已检测到一个初始化资源的循环 - %1$s";
    }
    @Override
    protected String reloadDependantServices$str() {
        return "重新加载可能已缓存了秘密值的依赖服务";
    }
    @Override
    protected String failedToStoreGeneratedSelfSignedCertificate$str() {
        return "WFLYELY01082: 存储生成的自签名证书失败";
    }
    @Override
    protected String unableToCompleteOperation$str() {
        return "WFLYELY00009: 无法完成操作。'%1$s'";
    }
    @Override
    protected String providerLoaderCannotSupplyProvider$str() {
        return "WFLYELY00914: 提供程序加载器 '%1$s' 不能提供类型 '%2$s' 的凭据存储提供程序";
    }
    @Override
    protected String unableToCreateCredentialStoreImmediately$str() {
        return "WFLYELY00924: 无法立即创建可用的凭据存储。";
    }
    @Override
    protected String trustedCertificateAlreadyInKeyStore$str() {
        return "WFLYELY01038: 可信证书已经在 KeyStore 中的别名 '%1$s' 下";
    }
    @Override
    protected String identityNotAuthorized$str() {
        return "WFLYELY01004: 名称为 [%1$s] 的身份未被授权。";
    }
    @Override
    protected String propertyFileIsInvalid$str() {
        return "WFLYELY00025: 引用的属性文件无效：%1$s";
    }
    @Override
    protected String unableToChangeAccountKeyWithCertificateAuthority$str() {
        return "WFLYELY01044: 无法更改与证书颁发机构关联的帐户密钥：%1$s";
    }
    @Override
    protected String componentNotConfigurable$str() {
        return "WFLYELY00015: 自定义组件实现 '%1$s' 不实现方法初始化(Map<String, String>)，但已提供了配置。";
    }
    @Override
    protected String defaultRealmNotReferenced$str() {
        return "WFLYELY00013: 默认域 '%1$s' 不在被此域引用的域 [%2$s] 列表中。";
    }
    @Override
    protected String invalidCertificateAuthorityChallenge$str() {
        return "WFLYELY01050: 证书颁发机构挑战无效";
    }
    @Override
    protected String letsEncryptNameNotAllowed$str() {
        return "WFLYELY01063: LetsEncrypt 证书认证被默认配置。";
    }
    @Override
    protected String couldNotObtainAuthorizationIdentity$str() {
        return "WFLYELY01008: 未能获取授权身份。";
    }
    @Override
    protected String unableToDetectKeyStore$str() {
        return "WFLYELY01059: 无法检测到 KeyStore '%1$s'";
    }
    @Override
    protected String unableToLoadModule$str() {
        return "WFLYELY00035: 无法加载模块 '%1$s'。";
    }
    @Override
    protected String unableToTransformMultipleRealms$str() {
        return "WFLYELY00042: 无法把多个 'authorization-realms' 转换为单个值";
    }
    @Override
    protected String unableToEncryptClearText$str() {
        return "WFLYELY00923: 无法加密提供的清晰文本。";
    }
    @Override
    protected String invalidNotBefore$str() {
        return "WFLYELY01028: not-before 的值无效。%1$s";
    }
    @Override
    protected String noResolverSpecifiedAndNoDefault$str() {
        return "WFLYELY01200: 未指定要使用的解析程序名称，且没有定义 default-resolver。";
    }
    @Override
    protected String cantSaveWithoutFile$str() {
        return "WFLYELY00010: 无法保存 KeyStore - KeyStore 文件 '%1$s' 不存在。";
    }
    @Override
    protected String unableToReloadCredentialStore$str() {
        return "WFLYELY00925: 无法重新载入凭据存储。";
    }
    @Override
    protected String filesystemMissingKeypair$str() {
        return "WFLYELY01215: 文件系统域缺少密钥对配置，没有启用完整性检查";
    }
    @Override
    protected String nonexistingKeyStoreMissingType$str() {
        return "WFLYELY01080: 非现有密钥存储需要有定义了的类型。";
    }
    @Override
    protected String unableToCreateManagerFactory$str() {
        return "WFLYELY00018: 无法为算法 '%2$s' 创建 %1$s。";
    }
    @Override
    protected String unableToTransformTornAttribute$str() {
        return "WFLYELY00041: 无法把配置转换到目标版本 - 属性 '%1$s' 与 '%2$s' 不同";
    }
    @Override
    protected String keyStoreMissingAlias$str() {
        return "WFLYELY01218: 文件系统域使用的 keystore 不包含别名：%1$s";
    }
    @Override
    protected String noTypeFound$str() {
        return "WFLYELY00019: 未在注入值中找到 '%1$s'。";
    }
    @Override
    protected String cachedRealmServiceNotAvailable$str() {
        return "WFLYELY00050: 领域不可用。您无法刷新缓存。";
    }
    @Override
    protected String missingCertificateAuthorityChallenge$str() {
        return "WFLYELY01088: 缺少证书颁发机构质询";
    }
    @Override
    protected String unableToVerifyIntegrity$str() {
        return "WFLYELY01214: 无法验证文件系统域的完整性：%1$s";
    }
    @Override
    protected String duplicateRealmInjection$str() {
        return "WFLYELY00002: 不能在一个安全域中注入相同的域 '%1$s'。";
    }
    @Override
    protected String failedToLoadCallbackhandlerFromProvidedModule$str() {
        return "WFLYELY00045: 无法从提供的模块加载 CallbackHandler。";
    }
    @Override
    protected String hostContextMapHostnameContainsCaret$str() {
        return "WFLYELY01087: SNI 映射中的主机名不能包含 ^ 字符。";
    }
    @Override
    protected String certificateFileDoesNotExist$str() {
        return "WFLYELY01041: 证书文件不存在";
    }
    @Override
    protected String unableToUpdateCertificateAuthorityAccountKeyStore$str() {
        return "WFLYELY01048: 无法更新证书颁发机构帐户密钥库：%1$s";
    }
    @Override
    protected String unableToObtainCertificate$str() {
        return "WFLYELY01032: 无法获取别名 '%1$s' 的证书";
    }
    @Override
    protected String invalidCertificateRevocationReason$str() {
        return "WFLYELY01051: 证书撤销原因 '%1$s' 无效";
    }
    @Override
    protected String invalidAttributeValue$str() {
        return "WFLYELY01062: 属性 '%1$s' 的无效值。";
    }
    @Override
    protected String keyStoreFileNotExistsButIgnored$str() {
        return "WFLYELY00023: KeyStore 文件 '%1$s' 不存在。以空白形式使用。";
    }
    @Override
    protected String credentialCannotBeResolved$str() {
        return "WFLYELY00916: 无法解析凭证";
    }
    @Override
    protected String unableToRespondToCertificateAuthorityChallenge$str() {
        return "WFLYELY01049: 无法响应来自证书颁发机构的挑战：%1$s";
    }
    @Override
    protected String unableToAccessEntryFromKeyStore$str() {
        return "WFLYELY00033: 无法访问密钥存储 [%2$s] 中的条目 [%1$s]。";
    }
    @Override
    protected String jaasEntryNotDefined$str() {
        return "WFLYELY00049: 条目未定义。";
    }
    @Override
    protected String couldNotReadIdentity2$str() {
        return "WFLYELY01005: 无法读取安全域 [%2$s] 中的身份 [%1$s]。";
    }
    @Override
    protected String unableToObtainPrivateKey$str() {
        return "WFLYELY01031: 无法获取别名 '%1$s' 的私钥";
    }
    @Override
    protected String unableToLoadModuleRuntime$str() {
        return "WFLYELY01079: 无法加载模块 '%1$s'。";
    }
    @Override
    protected String invalidCipherSuiteFilter$str() {
        return "WFLYELY01017: cipher-suite-filter 的无效值。%1$s";
    }
    @Override
    protected String representationOfX500IsRequired$str() {
        return "WFLYELY00048: 需要 X.500 可区分名称的字符串表示：%1$s";
    }
    @Override
    protected String unableToDetermineIfCertificateIsTrusted$str() {
        return "WFLYELY01040: 无法确定证书是否可信。请仔细检查此证书，如果有效，则将验证设置为 false，再次执行 import-certificate。";
    }
    @Override
    protected String noCertificatesFoundInCertificateReply$str() {
        return "WFLYELY01033: 在证书回复中未找到证书";
    }
    @Override
    protected String jaasFileDoesNotExist$str() {
        return "WFLYELY00046: 提供的 '%1$s' JAAS 配置文件的路径不存在。";
    }
    @Override
    protected String keyStoreAliasDoesNotIdentifyPrivateKeyEntry$str() {
        return "WFLYELY01030: 别名 '%1$s' 未标别 KeyStore 中的 PrivateKeyEntry";
    }
    @Override
    protected String failedToCreatePolicy$str() {
        return "WFLYELY01025: 创建策略 [%1$s] 失败";
    }
    @Override
    protected String unableToObtainCertificateAuthorityAccountCertificate$str() {
        return "WFLYELY01046: 无法获取别名 '%1$s' 的证书颁发机构帐户证书";
    }
    @Override
    protected String noTypeFoundForLazyInitKeyManager$str() {
        return "WFLYELY01083: 未在注入值中找到 '%1$s'。";
    }
    @Override
    protected String selfSignedCertificateWillBeCreated$str() {
        return "WFLYELY01084: 未找到 KeyStore %1$s，它将在第一次使用主机 %2$s 的自签名证书时自动生成";
    }
    @Override
    protected String jdbcRealmOnlySingleKeyMapperAllowed$str() {
        return "WFLYELY00034: 主体查询只能有一个密钥映射器";
    }
    @Override
    protected String requiredServiceNotUp$str() {
        return "WFLYELY00007: 所需的服务 '%1$s' 不是 UP，它目前是 '%2$s'。";
    }
    @Override
    protected String addSecretKeyToInitializedFilesystemRealm$str() {
        return "WFLYELY01220: 初始化后无法将加密 secret 密钥添加到非空文件系统域中。要升级文件系统域，请使用 Elytron Tool 命令 'filesystem-realm-encrypt'";
    }
    @Override
    protected String certificateReplySameAsCertificateFromKeyStore$str() {
        return "WFLYELY01035: 证书回复和 KeyStore 中 PrivateKeyEntry 中的证书相同";
    }
    @Override
    protected String keyStoreFileNotExists$str() {
        return "WFLYELY00022: KeyStore 文件 '%1$s' 不存在但是必需的。";
    }
    @Override
    protected String certificateNotValid$str() {
        return "WFLYELY00024: KeyStore 中的证书 [%1$s] 是无效的";
    }
    @Override
    protected String trustedCertificateAlreadyInCacertsKeyStore$str() {
        return "WFLYELY01039: 可信证书已经在 cacerts KeyStore 中的别名 '%1$s' 下";
    }
    @Override
    protected String failedToLoadResponderCert$str() {
        return "WFLYELY01064: 加载 OCSP 响应者证书 '%1$s' 失败。";
    }
    @Override
    protected String keyPasswordCannotBeResolved$str() {
        return "WFLYELY01027: 无法为 keystore '%1$s' 解析密钥密码";
    }
    @Override
    protected String unableToEnableJaccSupport$str() {
        return "WFLYELY01086: 在启用了旧的 JACC 支持时，无法初始化 Elytron JACC 支持。";
    }
    @Override
    protected String propertyFilesDoesNotExist$str() {
        return "WFLYELY00017: 属性域引用的属性文件不存在：%1$s";
    }
    @Override
    protected String invalidDefinition$str() {
        return "WFLYELY01014: 无效的 [%1$s] 定义。只能在过滤器列表中的一个 Object 中设置 '%2$s' 或 '%3$s' 中的一个";
    }
    @Override
    protected String noResolverWithSpecifiedName$str() {
        return "WFLYELY01201: 没有定义名称为 '%1$s' 的表达式解析器。";
    }
    @Override
    protected String couldNotReadIdentity1$str() {
        return "WFLYELY01007: 无法读取名称为 [%1$s] 的身份。";
    }
    @Override
    protected String cycleDetectedInitialisingExpressionResolver$str() {
        return "WFLYELY01202: 已检测到 '%1$s' 和 '%2$s' 的初始化资源的循环。";
    }
    @Override
    protected String invalidServiceNameParent$str() {
        return "WFLYELY00044: 服务名父项的意外的名称 %1$s";
    }
    @Override
    protected String credentialDoesNotExist$str() {
        return "WFLYELY00920: 库中不存在凭据类型 '%2$s' 的凭据别名 '%1$s'";
    }
    @Override
    protected String invalidTypeInjected$str() {
        return "WFLYELY00037: 注入值不是 '%1$s' 类型。";
    }
    @Override
    protected String unableToGetCertificateAuthorityMetadata$str() {
        return "WFLYELY01054: 无法获取与证书颁发机构关联的元数据：%1$s";
    }
    @Override
    protected String unableToReloadCRL$str() {
        return "WFLYELY00032: 无法重新加载 CRL 文件。";
    }
    @Override
    protected String realmRefererencedTwice$str() {
        return "WFLYELY00036: 在同一个安全域中，安全域 '%1$s' 被引用了两次。";
    }
    @Override
    protected String couldNotAddAttribute$str() {
        return "WFLYELY01009: 未能添加属性。";
    }
    @Override
    protected String filelessKeyStoreMissingType$str() {
        return "WFLYELY01060: 没有文件的 KeyStore 需要有一个定义的类型。";
    }
    @Override
    protected String realmDoesNotSupportCache$str() {
        return "WFLYELY00030: 域 '%1$s' 不支持缓存";
    }
    @Override
    protected String publicKeyFromCertificateReplyDoesNotMatchKeyStore$str() {
        return "WFLYELY01034: 证书回复中的公钥与 KeyStore 中证书的公钥不匹配";
    }
    @Override
    protected String exceptionWhileCreatingPermission$str() {
        return "WFLYELY00021: 为许可映射创建许可对象时出现异常。请检查 [%1$s] 的 [class-name]、[target-name]（许可名称）和 [action]。";
    }
    @Override
    protected String invalidCipherSuiteNames$str() {
        return "WFLYELY01066: cipher-suite-names 的无效值。%1$s";
    }
    @Override
    protected String invalidImplementationLoaded$str() {
        return "WFLYELY01069: 无效的 %1$s 加载，预期为 %2$s，但接收到 %3$s。";
    }
    @Override
    protected String unableToLoadCredential$str() {
        return "WFLYELY00922: 无法从凭据存储加载凭据。";
    }
    @Override
    protected String unableToCreateAccountWithCertificateAuthority$str() {
        return "WFLYELY01043: 无法通过证书颁发机构创建帐户：%1$s";
    }
    @Override
    protected String unableToObtainEntry$str() {
        return "WFLYELY01042: 无法获取别名 '%1$s' 的条目";
    }
    @Override
    protected String unableToGetKeyStorePassword$str() {
        return "WFLYELY01216: 文件系统域无法获取密钥存储密码";
    }
    @Override
    protected String keyStorePasswordCannotBeResolved$str() {
        return "WFLYELY00910: 无法为 keystore '%1$s' 解析密码";
    }
    @Override
    protected String invalidSuffix$str() {
        return "WFLYELY01020: 后缀（%1$s）是无效的。后缀必须是有效的日期格式。";
    }
    @Override
    protected String illegalNonManagementInitialization$str() {
        return "WFLYELY01210: 不允许初始化没有活跃管理 OperationContext 的 %1$s。";
    }
    @Override
    protected String invalidPermissionModule$str() {
        return "WFLYELY00040: 无法为许可映射加载许可模块 '%1$s'";
    }
    @Override
    protected String discardingUnusedPolicy$str() {
        return "WFLYELY01026: 属性 '%2$s'被设置为 '%3$s' 的元素 '%1$s' 未使用。因为未使用的策略配置无法再被保存在配置模型中，所以此项被抛弃。";
    }
    @Override
    protected String couldNotCreateIdentity$str() {
        return "WFLYELY01001: 无法创建名称为 [%1$s] 的身份。";
    }
    @Override
    protected String patternRequiresCaptureGroup$str() {
        return "WFLYELY01013: 模式 [%1$s] 需要一个捕获组";
    }
    @Override
    protected String couldNotDeleteIdentity$str() {
        return "WFLYELY01003: 无法删除名称为 [%1$s] 的身份。";
    }
    @Override
    protected String duplicatePolicyContextHandler$str() {
        return "WFLYELY01068: 为密钥 '%1$s' 找到的重复的 PolicyContextHandler。";
    }
    @Override
    protected String unableToResolveCredentialStore$str() {
        return "WFLYELY01208: 无法解析 CredentialStore %1$s -- %2$s";
    }
    @Override
    protected String unableToAccessKeyStore$str() {
        return "WFLYELY00005: 无法访问 KeyStore 来完成请求的操作。";
    }
    @Override
    protected String filesystemIntegrityInvalid$str() {
        return "WFLYELY01217: 域验证失败，身份的无效签名：%1$s";
    }
    @Override
    protected String serverNotKnown$str() {
        return "WFLYELY01016: 服务器 '%1$s' 是未知的";
    }
    @Override
    protected String unableToStartService$str() {
        return "WFLYELY00004: 无法启动服务。";
    }
    @Override
    protected String unableToReloadCRLNotReloadable$str() {
        return "WFLYELY00039: 无法重新加载 CRL 文件 - TrustManager 无法加载";
    }
    @Override
    protected String secretKeyOperationFailed$str() {
        return "WFLYELY00927: 由于 '%2$s'，密钥操作 '%1$s' 无法完成。";
    }
    @Override
    protected String identityNotFound$str() {
        return "WFLYELY01002: 未找到名称为 [%1$s] 的身份。";
    }
    @Override
    protected String failedToRegisterPolicyHandlers$str() {
        return "WFLYELY01024: 注册策略上下文处理程序失败";
    }
    @Override
    protected String unableToLoadCredentialStore$str() {
        return "WFLYELY01211: 无法加载凭据存储。";
    }
    @Override
    protected String credentialStoreProtectionParameterCannotBeResolved$str() {
        return "WFLYELY00911: 无法解析凭据存储 '%1$s' 保护参数";
    }
    @Override
    protected String multipleMaximumCertPathDefinitions$str() {
        return "WFLYELY01065: 找到多个 maximum-cert-path 定义。";
    }
    @Override
    protected String expressionResolverInitialisationAlreadyFailed$str() {
        return "WFLYELY01203: 表达式解析器初始化已经失败。";
    }
    @Override
    protected String filebasedKeystoreLocationMissing$str() {
        return "WFLYELY00921: 没有为基于文件的 keystore 类型 '%1$s' 定义位置参数";
    }
    @Override
    protected String unableToInstatiateAcmeClientSpiImplementation$str() {
        return "WFLYELY01052: 无法实例化 AcmeClientSpi 实现";
    }
    @Override
    protected String unableToUpdateAccountWithCertificateAuthority$str() {
        return "WFLYELY01053: 无法通过证书颁发机构更新帐户：%1$s";
    }
    @Override
    protected String x500AttributeMustBeDefined$str() {
        return "WFLYELY00028: 必须按名称或 OID 定义 X.500 属性";
    }
    @Override
    protected String unableToObtainCertificateAuthorityAccountPrivateKey$str() {
        return "WFLYELY01047: 无法获取别名 '%1$s' 的证书颁发机构帐户私钥";
    }
    @Override
    protected String dirContextPasswordCannotBeResolved$str() {
        return "WFLYELY00917: 无法为 dir-context 解析密码";
    }
    @Override
    protected String certificateAuthorityAccountAlreadyExists$str() {
        return "WFLYELY01056: 已存在使用此帐户密钥的证书颁发机构帐户。要更新与此现有帐户关联的联系信息，请使用 %1$s。要更改与此现有帐户关联的密钥，请使用 %2$s。";
    }
    @Override
    protected String credentialStoreEntryTypeNotSupported$str() {
        return "WFLYELY00909: 凭据存储 '%1$s' 不支持给定的凭据存储条目类型 '%2$s'";
    }
    @Override
    protected String noAllowedJkuValuesSpecifiedForTokenRealm$str() {
        return "WFLYELY01090: 对于令牌领域 '%1$s'，允许的 jku 值未被指定。如果令牌包含 'jku' 标头参数，则令牌验证将失败。可以使用 '%2$s' 系统属性将允许的 jku 值指定为空格分隔的字符串。";
    }
    @Override
    protected String missingPublicKey$str() {
        return "WFLYELY01213: KeyStore 不包含 KeyStore 的 PublicKey：[%1$s] 和别名：[%2$s]。";
    }
    @Override
    protected String keyStoreAliasDoesNotExist$str() {
        return "WFLYELY01029: KeyStore 中不存在别名 '%1$s'";
    }
    @Override
    protected String invalidSize$str() {
        return "WFLYELY01018: 无效的大小 %1$s";
    }
    @Override
    protected String expressionResolutionWithoutResolver$str() {
        return "WFLYELY01204: 表达式 \"%1$s\" 没有指定解析器，且没有定义默认值。";
    }
    @Override
    protected String failedToCreateServerAuthModule$str() {
        return "WFLYELY01057: 无法使用模块 '%2$s' 创建 ServerAuthModule [%1$s]";
    }
    @Override
    protected String selfSignedCertificateHasBeenCreated$str() {
        return "WFLYELY01085: 在 %1$s 生成自签名证书。请注意自签名证书不安全，应只用于测试目的。不要在生产环境中使用这个自签名证书。";
    }
    @Override
    protected String missingPrivateKey$str() {
        return "WFLYELY01212: KeyStore不包含 KeyStore 的 PrivateKey: [%1$s] 和别名: [%2$s]。";
    }
    @Override
    protected String unableToInitializeCredentialStore$str() {
        return "WFLYELY01209: 无法初始化 CredentialStore %1$s -- %2$s";
    }
    @Override
    protected String ldapRealmDirectVerificationAndUserPasswordMapper$str() {
        return "WFLYELY00047: LDAP 域被配置为使用直接-验证和无效配置的用户-密码-映射器。";
    }
    @Override
    protected String modelStageResolutionNotSupported$str() {
        return "WFLYELY01207: 操作执行的 MODEL 阶段不支持凭证存储表达式的解析。";
    }
    @Override
    protected String unableToReLoadPropertiesFiles$str() {
        return "WFLYELY00020: 无法重新加载属性文件支持域所需的属性文件。";
    }
    @Override
    protected String credentialAlreadyExists$str() {
        return "WFLYELY00913: 库中已存在凭据类型 '%2$s' 的凭据别名 '%1$s'";
    }
    @Override
    protected String failedToParsePEMPublicKey$str() {
        return "WFLYELY01058: 无法使用 kid: %1$s 解析 PEM 公共密钥";
    }
    @Override
    protected String invalidRegex$str() {
        return "WFLYELY01067: 值 \"%1$s\" 不是一个有效的正则表达式。";
    }
    @Override
    protected String noSuitableProvider$str() {
        return "WFLYELY00012: 未找到适合类型 '%1$s' 的提供程序";
    }
    @Override
    protected String invalidPermissionClass$str() {
        return "WFLYELY00038: 无法加载许可类 '%1$s'";
    }
    @Override
    protected String addKeypairToInitializedFilesystemRealm$str() {
        return "WFLYELY01219: 初始化后无法将完整性对添加到非空文件系统域中。要升级文件系统域，请使用 Elytron Tool 命令 'filesystem-realm-integrity'";
    }
    @Override
    protected String invalidOperationName$str() {
        return "WFLYELY00008: 无效的操作名称 '%1$s'，预期 '%2$s' 中的一个";
    }
    @Override
    protected String invalidKeySize$str() {
        return "WFLYELY01055: 密钥大小无效：%1$d";
    }
    @Override
    protected String cannotFindPolicyProvider$str() {
        return "WFLYELY01023: 找不到名为 [%1$s] 的策略提供程序";
    }
    @Override
    protected String invalidResolver$str() {
        return "WFLYELY01205: 表达式 \"%1$s\" 指定了一个不存在的解析器配置。";
    }
    @Override
    protected String operationAddressMissingKey$str() {
        return "WFLYELY00003: 此操作不包含采用 '%1$s' 值的地址。";
    }
    @Override
    protected String invalidHostContextMapValue$str() {
        return "WFLYELY01061: 无效的主机上下文映射：'%1$s' 不是一个有效的主机名格式。";
    }
    @Override
    protected String invalidURL$str() {
        return "WFLYELY00029: 解析 URL '%1$s' 失败";
    }
    @Override
    protected String unableToDecryptExpression$str() {
        return "WFLYELY01206: 无法解密表达式 \"%1$s\"。";
    }
    @Override
    protected String couldNotCreatePassword$str() {
        return "WFLYELY01011: 无法创建密码。";
    }
    @Override
    protected String unexpectedPasswordType$str() {
        return "WFLYELY01012: 意外的密码类型 [%1$s]。";
    }
    @Override
    protected String unableToInitialiseCredentialStore$str() {
        return "WFLYELY00926: 无法初始化凭据存储。";
    }
    @Override
    protected String failedToLazilyInitKeyManager$str() {
        return "WFLYELY01081: 延迟初始化密钥管理器失败";
    }
    @Override
    protected String unableToAccessCRL$str() {
        return "WFLYELY00031: 无法访问 CRL 文件。";
    }
    @Override
    protected String unableToObtainOidForX500Attribute$str() {
        return "WFLYELY00027: 无法为 X.500 属性 '%1$s' 获取 OID";
    }
    @Override
    protected String identityAlreadyExists$str() {
        return "WFLYELY01000: 名称为 [%1$s] 的身份已存在。";
    }
    @Override
    protected String unableToDeactivateAccountWithCertificateAuthority$str() {
        return "WFLYELY01045: 无法停用与证书颁发机构关联的帐户：%1$s";
    }
    @Override
    protected String invalidEncodingName$str() {
        return "WFLYELY01089: 无效的文件编码 '%1$s'。";
    }
}
