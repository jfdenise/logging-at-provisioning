package org.jboss.as.domain.management.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:14+0200")
public class DomainManagementLogger_$logger_zh_CN extends DomainManagementLogger_$logger_zh implements DomainManagementLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DomainManagementLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String passwordMustHaveSymbolInfo$str() {
        return "%1$s 非字母/数字字符";
    }
    @Override
    protected String argHelp$str() {
        return "显示这条消息并退出";
    }
    @Override
    protected String usernamePrompt0$str() {
        return "用户名";
    }
    @Override
    protected String handlerAlreadyExists$str() {
        return "WFLYDM0063: 处理程序必须是唯一的。在 %2$s 里已经有一个名为 '%1$s' 的处理程序。";
    }
    @Override
    protected String failedToGenerateSelfSignedCertificate$str() {
        return "WFLYDM0112: 生成自签名证书失败";
    }
    @Override
    protected String invalidChoiceUpdateUserResponse$str() {
        return "WFLYDM0070: 无效的响应。（有效的响应是 A, a, B, b, C 或 c）";
    }
    @Override
    protected String argServerConfigDirUsers$str() {
        return "定义服务器配置目录的位置。";
    }
    @Override
    protected String multipleAuthenticationMechanismsDefined$str() {
        return "WFLYDM0033: 安全域 '%1$s' 的配置包括多个基于用户名/密码的验证机制（%2$s）。但只允许一个。";
    }
    @Override
    protected String passwordUsernameMustMatchInfo$str() {
        return "密码必须和用户名不同。";
    }
    @Override
    protected String addedGroups$str() {
        return "添加属于组 %2$s 的用户 '%1$s' 到文件 '%3$s'";
    }
    @Override
    protected String sysLogProtocolAlreadyConfigured$str() {
        return "WFLYDM0059: 在 %1$s 里已经为 syslog 处理程序配置了一个协议";
    }
    @Override
    protected String multipleRealmDeclarations$str() {
        return "用户属性文件 '%1$s' 含有多个域名称声明";
    }
    @Override
    protected String realmPrompt$str() {
        return "域 (%1$s)";
    }
    @Override
    protected String passwordRequirements$str() {
        return "下面列出了对密码的要求。要修改这些限制，请编辑 add-user.properties 配置文件。";
    }
    @Override
    protected String badBaseRole$str() {
        return "WFLYDM0081: base-role '%1$s' 不是当前授权供应商的标准角色之一。";
    }
    @Override
    protected String suffixContainsMillis$str() {
        return "WFLYDM0104: 后缀（%1$s）不能包含秒或毫秒。";
    }
    @Override
    protected String passwordShouldNotEqualInfo$str() {
        return "密码不应该为下列限制值之一 {%1$s}";
    }
    @Override
    protected String argEnable$str() {
        return "启用这个用户";
    }
    @Override
    protected String aliasNotKey$str() {
        return "WFLYDM0084: 指定的别名 '%1$s' 不是密钥，有效的别名是 %2$s。";
    }
    @Override
    protected String multipleGroupSearchConfigurationsDefined$str() {
        return "WFLYDM0075: 安全区 '%1$s' 的配置包括 authorization=ldap 资源 (%2$s) 里的多重 group-search 资源。但只允许一个。";
    }
    @Override
    protected String passwordShouldContainInfo$str() {
        return "密码应该至少包含 %1$s";
    }
    @Override
    protected String yesNo$str() {
        return "是/否？";
    }
    @Override
    protected String failedToCreateLazyInitSSLContext$str() {
        return "WFLYDM0114: lazily 初始化 SSL 上下文失败";
    }
    @Override
    protected String alternativeRealm$str() {
        return "提供的区名必须匹配服务器配置使用的名称，其默认为 '%1$s'";
    }
    @Override
    protected String invalidConfirmationResponse$str() {
        return "WFLYDM0029: 无效的响应。（有效的响应是 %1$s 和 %2$s）";
    }
    @Override
    protected String realmMustBeSpecified$str() {
        return "WFLYDM0067: 必须指定区名。";
    }
    @Override
    protected String keystoreHasBeenCreated$str() {
        return "WFLYDM0113: 在 %1$s 生成自签名证书。请注意，自签名证书并不安全，只能用于进行测试。切勿在生产中使用该自签名证书。%n 生成的密钥的 SHA-1 指纹是 %2$s%n生成的密钥的 SHA-256 指纹是 %3$s";
    }
    @Override
    protected String passwordConfirmationPrompt$str() {
        return "重新输入密码";
    }
    @Override
    protected String aboutToUpdateEnabledUser$str() {
        return "用户 '%1$s' 已经存在，您要... %n a）更新现有的用户密码和角色 %n b）禁用现有的用户 %n c）输入新的用户名";
    }
    @Override
    protected String unableToLoadProperties$str() {
        return "WFLYDM0017: 无法加载属性";
    }
    @Override
    protected String userSuppliedRealm$str() {
        return "使用在命令行上指定的区 '%1$s'。";
    }
    @Override
    protected String unableToLoadPlugInProviders$str() {
        return "WFLYDM0045: 由于错误（%2$s）无法为模块 %1$s 加载插件";
    }
    @Override
    protected String aliasNotFound$str() {
        return "WFLYDM0085: 指定的别名 '%1$s' 不存在于密钥库里，有效的别名是 %2$s。";
    }
    @Override
    protected String unableToLoadSimpleNameForGroup$str() {
        return "WFLYDM0110: 无法为组 '%1$s' 加载简单的名称";
    }
    @Override
    protected String unableToAddUser$str() {
        return "WFLYDM0030: 由于错误 %2$s 无法把用户添加到 %1$s";
    }
    @Override
    protected String noNonProgressingOperationFound$str() {
        return "WFLYDM0089: 没有找到已经持有操作执行写锁超过 [%1$d] 秒的操作";
    }
    @Override
    protected String noHandlerCalled$str() {
        return "WFLYDM0058: 没有名为 '%1$s' 的处理程序";
    }
    @Override
    protected String passwordUsernameShouldNotMatch$str() {
        return "WFLYDM0098: 密码应该和用户名不同。";
    }
    @Override
    protected String passwordMustHaveDigit$str() {
        return "WFLYDM0050: 密码必须至少有 %1$d 个数字。";
    }
    @Override
    protected String imcompatibleConfiguredRequiresAttributeValue$str() {
        return "WFLYDM0144: Sensitivity 限制 %1$s 包括与其他 sensitive classification 限制不兼容的属性值。";
    }
    @Override
    protected String passwordMustNotEqualInfo$str() {
        return "密码不能为下列限制值之一 {%1$s}";
    }
    @Override
    protected String no$str() {
        return "No";
    }
    @Override
    protected String outboundConnectionsUnsupported$str() {
        return "WFLYDM0146: 不再支持出站连接，请将它们从配置中删除。";
    }
    @Override
    protected String invalidLocalUser$str() {
        return "WFLYDM0041: 在本地授权里不允许用户 '%1$s'";
    }
    @Override
    protected String noGroupSearchDefined$str() {
        return "WFLYDM0074: 安全区 '%1$s' 的配置没有包括 authorization=ldap 资源里的任何 group-search 资源。";
    }
    @Override
    protected String passwordShouldHaveSymbol$str() {
        return "WFLYDM0102: 密码必须至少有 %1$s 个非字母和数字的字符。";
    }
    @Override
    protected String passwordMustHaveAlphaInfo$str() {
        return "%1$d 个字母";
    }
    @Override
    protected String passwordRecommendations$str() {
        return "下面列出了对密码的建议。要修改这些限制，请编辑 add-user.properties 配置文件。";
    }
    @Override
    protected String scopedRoleStandardName$str() {
        return "WFLYDM0080: 名称 '%2$s' 和标准角色名 '%1$s' 冲突 - 比较是不区分大小写的。";
    }
    @Override
    protected String securityRealmsUnsupported$str() {
        return "WFLYDM0145: 安全域不再被支持，请将它们从配置中删除。";
    }
    @Override
    protected String userAndPasswordWarning$str() {
        return "WFLYDM0001: 使用默认用户和密码定义的属性文件，这容易被猜到。";
    }
    @Override
    protected String usageDescription$str() {
        return "add-user 脚本是添加立即验证的新用户至属性文件的工具。它可以用来管理 ManagementRealm 和 ApplicationRealm 里的用户。";
    }
    @Override
    protected String argConfirmWarning$str() {
        return "在交互模式里自动确认警告";
    }
    @Override
    protected String unableToUpdateUser$str() {
        return "WFLYDM0040: 由于错误 %2$s 无法更新用户到 %1$s";
    }
    @Override
    protected String multipleRealmsDetected$str() {
        return "WFLYDM0064: 读取用户属性文件时检测到不同的区名 '%1$s' 和 '%2$s'，所有的区都必须是相等的。";
    }
    @Override
    protected String inconsistentRbacRuntimeState$str() {
        return "WFLYDM0069: 运行时角色映射配置是不一致的，服务器必须被重启。";
    }
    @Override
    protected String passwordMustNotBeEqual$str() {
        return "WFLYDM0049: 密码不能为 '%1$s'，这个值是受限制的。";
    }
    @Override
    protected String passwordShouldHaveAlpha$str() {
        return "WFLYDM0100: 密码必须至少有 %1$d 个字母或数字。";
    }
    @Override
    protected String usernamePrompt1$str() {
        return "用户名 (%1$s)";
    }
    @Override
    protected String noFormatterCalled$str() {
        return "WFLYDM0061: 没有名为 '%1$s' 的格式化程序";
    }
    @Override
    protected String usernameEasyToGuess$str() {
        return "用户名 '%1$s' 太容易猜测";
    }
    @Override
    protected String invalidKeytab$str() {
        return "WFLYDM0090: 无效的 Keytab 数据";
    }
    @Override
    protected String passwordNotStrongEnough$str() {
        return "WFLYDM0048: 密码强度不够，它是 '%1$s'，它应该至少为 '%2$s'。";
    }
    @Override
    protected String argDomainConfigDirUsers$str() {
        return "定义域配置目录的位置";
    }
    @Override
    protected String passwordMisMatch$str() {
        return "WFLYDM0026: 密码不匹配。";
    }
    @Override
    protected String invalidRoleName$str() {
        return "WFLYDM0076: 角色名 '%1$s' 不是有效的标准角色。";
    }
    @Override
    protected String passwordNotLongEnough$str() {
        return "WFLYDM0053: 密码应该至少有 %1$s 个字符！";
    }
    @Override
    protected String noSyslogProtocol$str() {
        return "WFLYDM0060: 没有给定的 syslogn 处理程序";
    }
    @Override
    protected String duplicateScopedRole$str() {
        return "WFLYDM0079: 名为 '%2$s' 的 %1$s 已经存在";
    }
    @Override
    protected String userRealmNotMatchDiscovered$str() {
        return "WFLYDM0065: 用户提供的区名 '%1$s' 和从属性文件 '%2$s' 里发现的区名不匹配。";
    }
    @Override
    protected String invalidChoiceResponse$str() {
        return "WFLYDM0039: 无效的响应。（有效的响应是 A、a、B 或 b）";
    }
    @Override
    protected String argUser$str() {
        return "用户的名称";
    }
    @Override
    protected String argUserProperties$str() {
        return "可以是绝对路径的用户属性文件的名称。";
    }
    @Override
    protected String keyStoreNotFound$str() {
        return "WFLYDM0086: 无法在 %1$s 找到密钥库";
    }
    @Override
    protected String multipleCallbackHandlerForMechanism$str() {
        return "WFLYDM0042: 用于相同机制（%1$s）的多个 CallbackHanderService";
    }
    @Override
    protected String unableToObtainTGT$str() {
        return "WFLYDM0092: 无法获取 Kerberos TGT";
    }
    @Override
    protected String argPassword$str() {
        return "用户的密码，它将根据 add-user.properties 里定义的密码要求来进行检查。";
    }
    @Override
    protected String argApplicationUsers$str() {
        return "如果进行了设置，则添加一个应用程序用户而非管理用户。";
    }
    @Override
    protected String sureToAddUser$str() {
        return "您确定要添加用户 '%1$s' yes/no?";
    }
    @Override
    protected String unableToOperateOnTrustStore$str() {
        return "WFLYDM0055: 无法在信任库里操作。";
    }
    @Override
    protected String noCipherSuitesInCommon$str() {
        return "WFLYDM0095: 没有共用的 Cipher Suites, supported=(%1$s), requested=(%2$s)";
    }
    @Override
    protected String shortNo$str() {
        return "n";
    }
    @Override
    protected String aboutToAddUser$str() {
        return "要为域 '%2$s' 添加的用户 '%1$s'";
    }
    @Override
    protected String passwordMustContainInfo$str() {
        return "密码必须至少包含 %1$s";
    }
    @Override
    protected String passwordPrompt$str() {
        return "密码";
    }
    @Override
    protected String usernameNotAlphaNumeric$str() {
        return "WFLYDM0028: 用户名只能为字母/数字，除了下列字符（%1$s）。";
    }
    @Override
    protected String noPlugInProvidersLoaded$str() {
        return "WFLYDM0044: 未找到模块 %1$s 的插件提供者";
    }
    @Override
    protected String unsupportedResource$str() {
        return "WFLYDM0108: 不支持的资源 '%1$s'";
    }
    @Override
    protected String updatedGroups$str() {
        return "更新属于组 %2$s 的用户 '%1$s' 到文件 '%3$s'";
    }
    @Override
    protected String argUsage$str() {
        return "用法：./add-user.sh [args...]%n其中的 args 包括：";
    }
    @Override
    protected String isCorrectPrompt$str() {
        return "这是正确的吗？";
    }
    @Override
    protected String multipleUsernameToDnConfigurationsDefined$str() {
        return "WFLYDM0073: 安全区 '%1$s' 的配置包括 authorization=ldap 资源 (%2$s) 里的多重 username-to-dn 资源。但只允许一个。";
    }
    @Override
    protected String shortYes$str() {
        return "y";
    }
    @Override
    protected String argRealm$str() {
        return "用来设置管理接口安全性的区的名称（默认为 \"ManagementRealm\"）";
    }
    @Override
    protected String cannotRemoveReferencedFormatter$str() {
        return "WFLYDM0062: 无法删除这个格式化程序，它仍被处理程序 '%1$s' 引用。";
    }
    @Override
    protected String usingDeprecatedSystemProperty$str() {
        return "WFLYDM0140: 您不应使用系统属性 \"%1$s\"，因为该属性已弃用。请使用管理模型配置代替。";
    }
    @Override
    protected String invalidRoleNameDomain$str() {
        return "WFLYDM0077: 角色名 '%1$s' 不是有效的标准角色，它也不是作用域为主机或服务器组的角色。";
    }
    @Override
    protected String filePrompt$str() {
        return "您要添加哪个类型？%n a) 管理型用户 (mgmt-users.properties) %n b) 应用型用户 (application-users.properties)";
    }
    @Override
    protected String filePermissionsProblemsFound$str() {
        return "WFLYDM0106: 试图更新 %1$s 文件时发现权限问题。";
    }
    @Override
    protected String onlyOneSyslogHandlerProtocol$str() {
        return "WFLYDM0057: syslog-handler 只能包含一个协议 %1$s";
    }
    @Override
    protected String noUsernameExiting$str() {
        return "WFLYDM0024: 未输入用户名，退出中。";
    }
    @Override
    protected String invalidSensitiveClassificationAttribute$str() {
        return "WFLYDM0143: 无效的 sensitive classification 属性 '%1$s'";
    }
    @Override
    protected String errorHeader$str() {
        return "错误";
    }
    @Override
    protected String noSecurityContextEstablished$str() {
        return "WFLYDM0037: 没有建立安全上下文。";
    }
    @Override
    protected String unableToLoadKeyTrustFile$str() {
        return "WFLYDM0054: 无法夹在密钥信任文件。";
    }
    @Override
    protected String groupPropertiesButNoUserProperties$str() {
        return "WFLYDM0066: 已经指定了一个组属性文件 '%1$s'，然而没有指定用户属性。";
    }
    @Override
    protected String duplicateIncludeExclude$str() {
        return "WFLYDM0071: 角色 '%1$s' 已经包含了一个 %2$s（type=%3$s, name=%4$s, realm=%5$s）。";
    }
    @Override
    protected String keystoreWillBeCreated$str() {
        return "WFLYDM0111: 未找到密钥库 %1$s，它将在第一次使用主机 %2$s 的自签名证书时自动生成。";
    }
    @Override
    protected String unableToCreateDelegateTrustManager$str() {
        return "WFLYDM0056: 无法创建委托信任管理者。";
    }
    @Override
    protected String argGroup$str() {
        return "用逗号隔开的这个用户所属的组的列表";
    }
    @Override
    protected String passwordMustHaveAlpha$str() {
        return "WFLYDM0052: 密码必须至少有 %1$d 个字母或数字。";
    }
    @Override
    protected String noPasswordExiting$str() {
        return "WFLYDM0025: 未收入密码，退出中。";
    }
    @Override
    protected String passwordShouldHaveXCharacters$str() {
        return "WFLYDM0099: 密码应该至少有 %1$s 个字符！";
    }
    @Override
    protected String noConsoleAvailable$str() {
        return "WFLYDM0021: 和用户交互没有可用的 java.io.Console";
    }
    @Override
    protected String unableToObtainCredential$str() {
        return "无法获取服务器 %1$s 的凭据";
    }
    @Override
    protected String invalidSize$str() {
        return "WFLYDM0103: 无效的大小 %1$s";
    }
    @Override
    protected String unableToLoadUsers$str() {
        return "WFLYDM0031: 由于错误%2$s 无法从 %1$s 加载用户";
    }
    @Override
    protected String roleMappingRemaining$str() {
        return "WFLYDM0078: 无法删除作用域角色 '%1$s'，因为仍然存在角色映射。";
    }
    @Override
    protected String passwordUsernameShouldMatchInfo$str() {
        return "密码应该和用户名不同。";
    }
    @Override
    protected String passwordShouldHaveDigit$str() {
        return "WFLYDM0101: 密码必须至少有 %1$d 个数字。";
    }
    @Override
    protected String operationFailedOneOfRequired$str() {
        return "WFLYDM0034: 需要 '%1$s' 或 '%2$s' 中的一个。";
    }
    @Override
    protected String noCallbackHandlerForMechanism$str() {
        return "WFLYDM0043: 区 %2$s 里的机制 %1$s 没有可用的 CallbackHandler";
    }
    @Override
    protected String keyTabFileNotFound$str() {
        return "WFLYDM0109: Keytab 文件 '%1$s' 不存在。";
    }
    @Override
    protected String removedBrokenResource$str() {
        return "WFLYDM0135: 资源 %1$s 没有正常工作且已被删除。";
    }
    @Override
    protected String inconsistentRbacConfiguration$str() {
        return "WFLYDM0068: 当前的操作将启用基于角色的访问控制，但不可能为已验证的用户分配角色。";
    }
    @Override
    protected String invalidSuffix$str() {
        return "WFLYDM0105: 后缀（%1$s）是无效的。后缀必须是有效的日期格式。";
    }
    @Override
    protected String usernameNotLoaded$str() {
        return "WFLYDM0088: 无法为提供的用户名 '%1$s' 加载用户名";
    }
    @Override
    protected String propertiesFileNotFound$str() {
        return "WFLYDM0023: 未找到 %1$s 文件。";
    }
    @Override
    protected String groupsPrompt$str() {
        return "您希望这个用户属于哪些组？（请输入一个用逗号隔开的列表，或者留空表示没有）";
    }
    @Override
    protected String kerberosWithoutKeytab$str() {
        return "WFLYDM0094: 安全区 '%1$s' 上的验证启用了 kerberos，但没有添加 keytab 到这个 server-identity。";
    }
    @Override
    protected String passwordMustHaveSymbol$str() {
        return "WFLYDM0051: 密码必须至少有 %1$s 个非字母和数字的字符。";
    }
    @Override
    protected String multipleAuthorizationConfigurationsDefined$str() {
        return "WFLYDM0072: 安全域 '%1$s' 的配置包括多个授权配置（%2$s）。但只允许一个。";
    }
    @Override
    protected String operationFailedOnlyOneOfRequired$str() {
        return "WFLYDM0035: 只需要 '%1$s' 或 '%2$s' 中的一个。";
    }
    @Override
    protected String multipleCacheConfigurationsDefined$str() {
        return "WFLYDM0087: 安全区 '%1$s' 的配置包括层次结构里相同位置的多个缓存定义，但系统只允许一个。";
    }
    @Override
    protected String noSubjectIdentityForProtocolAndHost$str() {
        return "WFLYDM0139: 没有找到 %1$s/%2$s 的 SubjectIdentity。";
    }
    @Override
    protected String passwordLengthInfo$str() {
        return "%1$s 个字符";
    }
    @Override
    protected String noKey$str() {
        return "WFLYDM0083: 密钥库 %1$s 没有包含任何密钥。";
    }
    @Override
    protected String domainRolloutNotProgressing$str() {
        return "WFLYDM0107: 操作 '%1$s' 保持执行写锁定操作的时间已超过 [%2$d] 秒，但它是 domain-uuid 为 '%3$s' 的域范围首次操作的一部分。它们的 ID 为：%4$s 。建议取消对域控制器的操作。";
    }
    @Override
    protected String legacyMechanismsAreNotSupported$str() {
        return "WFLYDM0142: 域 '%2$s' 不支持在服务器 (%1$s) 上配置的以下机制。";
    }
    @Override
    protected String callbackHandlerNotInitialized$str() {
        return "回调处理程序尚未针对域服务器 %1$s 初始化。";
    }
    @Override
    protected String subjectIdentityLoggedOut$str() {
        return "WFLYDM0091: 在这个 SubjectIdentity 上已经调用了 logout。";
    }
    @Override
    protected String passwordMustHaveDigitInfo$str() {
        return "%1$d 个数字";
    }
    @Override
    protected String argSilent$str() {
        return "激活 Silent 模式（不输出到控制台）";
    }
    @Override
    protected String aboutToUpdateDisabledUser$str() {
        return "用户 '%1$s' 已经存在并被禁用，您要... %n a）更新现有的用户密码和角色 %n b）启用现有的用户 %n c）输入新的用户名";
    }
    @Override
    protected String noAuthenticationPlugInFound$str() {
        return "WFLYDM0046: 未找到名为 %1$s 的验证插件";
    }
    @Override
    protected String argGroupProperties$str() {
        return "可以是绝对路径的组属性文件的名称。（如果指定了组属性，那么用户属性也必须被指定）。";
    }
    @Override
    protected String realmConfirmation$str() {
        return "您确定要设置区为 '%1$s'?";
    }
    @Override
    protected String keytabLoginFailed$str() {
        return "WFLYDM0093: 无法使用主体 '%1$s' 的 Keytab 来处理主机 '%2$s' 的请求";
    }
    @Override
    protected String discoveredRealm$str() {
        return "使用从现有属性文件发现的区 '%1$s'。";
    }
    @Override
    protected String unableToInitialisePlugIn$str() {
        return "WFLYDM0047: 由于错误 %2$s 无法初始化插件 %1$s";
    }
    @Override
    protected String updateUser$str() {
        return "更新用户 '%1$s' 到文件 '%2$s' 里。";
    }
    @Override
    protected String noProtocolsInCommon$str() {
        return "WFLYDM0096: 没有共用的协议，supported=(%1$s), requested=(%2$s)";
    }
    @Override
    protected String sureToSetPassword$str() {
        return "您确定要使用输入的密码吗 yes/no?";
    }
    @Override
    protected String passwordUsernameMatchError$str() {
        return "WFLYDM0082: 密码必须和用户名不同。";
    }
    @Override
    protected String passwordShouldNotBeEqual$str() {
        return "WFLYDM0097: 密码不应该等于 '%1$s'，这个值是受限制的。";
    }
    @Override
    protected String enterNewUserDetails$str() {
        return "输入要添加的新用户的细节。";
    }
    @Override
    protected String yes$str() {
        return "yes";
    }
    @Override
    protected String addedUser$str() {
        return "将用户 '%1$s' 添加至为文件 '%2$s'";
    }
    @Override
    protected String argRole$str() {
        return "用逗号隔开的这个用户所属的角色的列表";
    }
    @Override
    protected String argDisable$str() {
        return "禁用这个用户";
    }
    @Override
    protected String userNotFoundInDirectory$str() {
        return "WFLYDM0020: 在目录里未找到用户 '%1$s'";
    }
}
