package org.wildfly.extension.messaging.activemq._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:58+0200")
public class MessagingLogger_$logger_zh_CN extends MessagingLogger_$logger_zh implements MessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MessagingLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String aioInfo$str() {
        return "WFLYMSGAMQ0001: 这个平台中没有 AIO，它将返回使用纯 Java NIO。";
    }
    @Override
    protected String boundJndiName$str() {
        return "WFLYMSGAMQ0002: 将消息对象绑定到 jndi 名称 %1$s";
    }
    @Override
    protected String errorStoppingJmsServer$str() {
        return "WFLYMSGAMQ0003: 在停止 Jakarta 消息服务器时出现异常";
    }
    @Override
    protected String failedToDestroy$str() {
        return "WFLYMSGAMQ0004: 销毁 %1$s 失败：%2$s";
    }
    @Override
    protected String revertOperationFailed$str() {
        return "WFLYMSGAMQ0005: %1$s 捕获异常以尝试在地址 %3$s 还原操作 %2$s";
    }
    @Override
    protected String unboundJndiName$str() {
        return "WFLYMSGAMQ0006: 取消将消息对象绑定到 jndi 名称 %1$s";
    }
    @Override
    protected String couldNotCloseFile$str() {
        return "WFLYMSGAMQ0007: 无法关闭文件 %1$s";
    }
    @Override
    protected String failedToUnbindJndiName$str() {
        return "WFLYMSGAMQ0008: 无法将消息对象绑定解绑到 %2$d %3$s 里的 JNDI 名称 %1$s";
    }
    @Override
    protected String startedService$str() {
        return "WFLYMSGAMQ0011: 已启动 %1$s %2$s";
    }
    @Override
    protected String stoppedService$str() {
        return "WFLYMSGAMQ0012: 已停止 %1$s %2$s";
    }
    @Override
    protected String unknownPooledConnectionFactoryAttribute$str() {
        return "WFLYMSGAMQ0015: 忽略不是池化连接工厂的已知属性的 %1$s 属性。";
    }
    @Override
    protected String registeredHTTPUpgradeHandler$str() {
        return "WFLYMSGAMQ0016: 已为 %2$s 接收器处理的 %1$s 协议注册的 HTTP 升级";
    }
    @Override
    protected String connectorForPooledConnectionFactory$str() {
        return "WFLYMSGAMQ0018: 没有为池化连接工厂 %1$s 显性地定义连接器。将 %2$s 作为连接器使用。";
    }
    @Override
    protected String cannotBindJndiName$str() {
        return "WFLYMSGAMQ0022: 无法绑定 null 或空字符串为 JNDI 名称";
    }
    @Override
    protected String cannotUnbindJndiName$str() {
        return "WFLYMSGAMQ0025: 无法解除 null 或空字符串为 JNDI 名称的绑定";
    }
    @Override
    protected String childResourceAlreadyExists$str() {
        return "WFLYMSGAMQ0026: 已经存在了类型 %1$s 的子资源；消息子系统只允许一个类型为 %1$s 的资源";
    }
    @Override
    protected String connectorNotDefined$str() {
        return "WFLYMSGAMQ0027: 没有定义连接器 %1$s";
    }
    @Override
    protected String failedToCreate$str() {
        return "WFLYMSGAMQ0028: 创建 %1$s 失败";
    }
    @Override
    protected String failedToFindBroadcastSocketBinding$str() {
        return "WFLYMSGAMQ0029: 寻找广播绑定 %1$s 的 SocketBinding 失败";
    }
    @Override
    protected String failedToFindConnectorSocketBinding$str() {
        return "WFLYMSGAMQ0030: 寻找连接器 %1$s 的 SocketBinding 失败";
    }
    @Override
    protected String failedToFindDiscoverySocketBinding$str() {
        return "WFLYMSGAMQ0031: 寻找发现绑定 %1$s 的 SocketBinding 失败";
    }
    @Override
    protected String failedToShutdownServer$str() {
        return "WFLYMSGAMQ0032: 关闭 %1$s 服务器失败";
    }
    @Override
    protected String failedToStartService$str() {
        return "WFLYMSGAMQ0033: 启动服务失败";
    }
    @Override
    protected String illegalValue$str() {
        return "WFLYMSGAMQ0036: 无效的值 %1$s（元素 %2$s）";
    }
    @Override
    protected String immutableResource$str() {
        return "WFLYMSGAMQ0037: 资源是不可改变的";
    }
    @Override
    protected String invalid$str() {
        return "WFLYMSGAMQ0038: %1$s 是无效的";
    }
    @Override
    protected String invalidAttributeType$str() {
        return "WFLYMSGAMQ0039: 属性 %1$s 具有意外的类型 %2$s";
    }
    @Override
    protected String invalidServiceState$str() {
        return "WFLYMSGAMQ0042: 服务 %1$s 没有处于状态 %2$s，而是状态 %3$s";
    }
    @Override
    protected String jndiNameAlreadyRegistered$str() {
        return "WFLYMSGAMQ0043: 已经注册了 JNDI 名称 %1$s";
    }
    @Override
    protected String required1$str() {
        return "WFLYMSGAMQ0045: %1$s 是必需的";
    }
    @Override
    protected String required2$str() {
        return "WFLYMSGAMQ0046: %1$s 或 %2$s 是必需的";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYMSGAMQ0047: %1$s 为 null";
    }
    @Override
    protected String unsupportedAttribute$str() {
        return "WFLYMSGAMQ0050: 没有正确实现对属性 %1$s 的读支持";
    }
    @Override
    protected String unsupportedOperation$str() {
        return "WFLYMSGAMQ0052: 没有正确实现操作 %1$s 的支持";
    }
    @Override
    protected String unsupportedRuntimeAttribute$str() {
        return "WFLYMSGAMQ0053: 没有实现对 %1$s 的运行时处理";
    }
    @Override
    protected String activeMQServerNotInstalled$str() {
        return "WFLYMSGAMQ0054: 在名称 %1$s 下没有可用的 ActiveMQ 服务器";
    }
    @Override
    protected String couldNotParseDeployment$str() {
        return "WFLYMSGAMQ0055: 无法解析文件 %1$s";
    }
    @Override
    protected String operationNotValid$str() {
        return "WFLYMSGAMQ0056: 处理程序无法处理操作 %1$s";
    }
    @Override
    protected String noDestinationRegisteredForAddress$str() {
        return "WFLYMSGAMQ0057: 在地址 %1$s 上没有注册消息目的地";
    }
    @Override
    protected String securityDomainContextNotSet$str() {
        return "WFLYMSGAMQ0058: 还没有设置 SecurityDomainContext";
    }
    @Override
    protected String failedToRecover$str() {
        return "WFLYMSGAMQ0060: 恢复 %1$s 失败";
    }
    @Override
    protected String canNotRegisterResourceOfType$str() {
        return "WFLYMSGAMQ0063: 无法注册类型为 %1$s 的资源";
    }
    @Override
    protected String canNotRemoveResourceOfType$str() {
        return "WFLYMSGAMQ0064: 无法删除类型为 %1$s 的资源";
    }
    @Override
    protected String serverInBackupMode$str() {
        return "WFLYMSGAMQ0066: 无法管理位于地址 %1$s 上的资源，服务器处于备份模式。";
    }
    @Override
    protected String wrongConnectorRefInBroadCastGroup$str() {
        return "WFLYMSGAMQ0067: 广播组 '%1$s' 定义了对不存在的连接器 '%2$s' 的引用。可用的连接器 '%3$s'。";
    }
    @Override
    protected String noMatchingExpiryAddress$str() {
        return "WFLYMSGAMQ0071: 没有匹配 address-settings %2$s 的 expiry-address %1$s 的资源，符合这个 address-setting 的目的地的过期消息将会丢失！";
    }
    @Override
    protected String noMatchingDeadLetterAddress$str() {
        return "WFLYMSGAMQ0072: 没有匹配 address-settings %2$s 的 dead-letter-address %1$s 的资源，符合这个 address-setting 的目的地的未递送的消息将会丢失！";
    }
    @Override
    protected String canNotRemoveLastJNDIName$str() {
        return "WFLYMSGAMQ0073: 无法删除 JNDI 名称 %1$s。这个资源必需至少有一个 JNDI 名称。";
    }
    @Override
    protected String aioInfoLinux$str() {
        return "WFLYMSGAMQ0075: 这个平台中没有 AIO，它将返回使用纯 Java NIO。如果您的平台是 Linux，请安装 LibAIO 以便启用 AIO 日志来实现最佳性能。";
    }
    @Override
    protected String duplicateElements$str() {
        return "WFLYMSGAMQ0076: 参数 %1$s 包含重复的元素 [%2$s]";
    }
    @Override
    protected String canNotRemoveUnknownEntry$str() {
        return "WFLYMSGAMQ0077: 无法删除未知的条目 %1$s";
    }
    @Override
    protected String onlyOneChildIsAllowed$str() {
        return "WFLYMSGAMQ0078: 只允许一个 %1$s 子资源，但发现子资源：%2$s。";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYMSGAMQ0079: 只有父资源支持有序子资源时，有索引的子资源才可以注册。'%1$s' 的父资源没有编入索引";
    }
    @Override
    protected String discoveryGroupIsNotDefined$str() {
        return "WFLYMSGAMQ0080: 没有定义发现组 %1$s";
    }
    @Override
    protected String unsupportedBroadcastGroupConfigurationForLegacy$str() {
        return "WFLYMSGAMQ0081: 不受支持的旧的资源的广播组配置类型：%1$s";
    }
    @Override
    protected String unsupportedConnectorFactoryForLegacy$str() {
        return "WFLYMSGAMQ0082: 不受支持的旧的资源的连接工厂类型：%1$s";
    }
    @Override
    protected String managementOperationAllowedOnlyInRunningMode$str() {
        return "WFLYMSGAMQ0083: 不能执行 %1$s 操作：服务器必须处于 %2$s 模式。";
    }
    @Override
    protected String noInVMConnector$str() {
        return "WFLYMSGAMQ0084: 服务器没有定义任何 in-vm 连接器。导入日志要求 in-vm 连接器";
    }
    @Override
    protected String unableToLoadClassFromModule$str() {
        return "WFLYMSGAMQ0085: 无法从模块 %2$s 加载类 %1$s";
    }
    @Override
    protected String unableToLoadModule$str() {
        return "WFLYMSGAMQ0086: 无法加载模块 %1$s";
    }
    @Override
    protected String unableToLoadConnectorServiceFactoryClass$str() {
        return "WFLYMSGAMQ0087: 无法加载连接器服务工厂类 %1$s";
    }
    @Override
    protected String invalidModularParameterValue$str() {
        return "WFLYMSGAMQ0088: %1$s 是参数 %2$s 的无效值，它必须是 %3$s 的倍数。";
    }
    @Override
    protected String invalidConfiguration$str() {
        return "WFLYMSGAMQ0089: %1$s 的资源没有正确配置：当定义了它的属性 %2$s 时，其他属性 %3$s 将不会被考虑。";
    }
    @Override
    protected String invalidNullSecurityDomain$str() {
        return "WFLYMSGAMQ0090: Elytron 安全域不能为空";
    }
    @Override
    protected String failedAuthenticationWithException$str() {
        return "WFLYMSGAMQ0091: 验证用户名 %1$s 失败。异常信息：%2$s";
    }
    @Override
    protected String failedAuthentication$str() {
        return "WFLYMSGAMQ0092: 验证用户名 %1$s 失败：无法检验用户/密码对。";
    }
    @Override
    protected String failedAuthorization$str() {
        return "WFLYMSGAMQ0093: 授权用户名 %1$s 失败：缺少权限。";
    }
    @Override
    protected String jdbcDatabaseDialectDetectionFailed$str() {
        return "WFLYMSGAMQ0094: 无法从连接元数据或 JDBC 驱动名检测数据库方言。请使用配置里的 'journal-datasource' 属性手动配置它。已知的数据库方言字符串是 %1$s。";
    }
    @Override
    protected String multipleClientMappingsFound$str() {
        return "WFLYMSGAMQ0095: 在 ActiveMQ [%2$s] 传输配置使用的 [%1$s] 套接字绑定中找到多个客户端映射。使用地址：[host: %3$s, port %4$s]";
    }
    @Override
    protected String operationNotAllowedOnJdbcStore$str() {
        return "WFLYMSGAMQ0096: 不能对 JDBC 存储日志执行 %1$s 操作";
    }
    @Override
    protected String noSocketBinding$str() {
        return "WFLYMSGAMQ0097: 没有使用名为 %1$s 的配置 socket-binding 或 outbound-socket-binding";
    }
    @Override
    protected String moduleNotFound$str() {
        return "WFLYMSGAMQ0098: 无法加载模块 %1$s - 该模块或其依赖项之一缺失 [%2$s]";
    }
    @Override
    protected String remoteDestinationCreationFailed$str() {
        return "WFLYMSGAMQ0099: 创建远程目标 %1$s 失败，错误为 %2$s";
    }
    @Override
    protected String remoteDestinationDeletionFailed$str() {
        return "WFLYMSGAMQ0100: 删除远程目标 %1$s 失败，错误为 %2$s";
    }
    @Override
    protected String invalidTransactionNameValue$str() {
        return "WFLYMSGAMQ0101: %2$s 的无效值 %1$s，有效值为 %3$s，应用默认值。";
    }
    @Override
    protected String upgradeRequestMissingKey$str() {
        return "WFLYMSGAMQ0102: HTTP 升级请求缺失了 Sec-JbossRemoting-Key 头部信息";
    }
    @Override
    protected String brokerNotStarted$str() {
        return "WFLYMSGAMQ0103: 代理还未启动。它还不能被管理。";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYMSGAMQ0104: 传统的安全不再被支持。";
    }
    @Override
    protected String socketBindingMulticastNotSet$str() {
        return "WFLYMSGAMQ0105: %1$s %2$s 被配置为使用 socket-binding %3$s，但这个套接字绑定没有配置 multicast-address 或 multicast-port 属性。";
    }
    @Override
    protected String failedBridgeDeployment$str() {
        return "WFLYMSGAMQ0106: 网桥 %1$s 没有部署。";
    }
    @Override
    protected String securityEnabledWithoutDomain$str() {
        return "WFLYMSGAMQ0107: 当启用了安全性时，您必须定义一个 elytron 安全域。";
    }
    @Override
    protected String socketBindingOrJGroupsClusterRequired$str() {
        return "WFLYMSGAMQ0108: socket-binding 或 jgroups-cluster 属性是必需的。";
    }
    @Override
    protected String unknownHAPolicyType$str() {
        return "WFLYMSGAMQ0109: 未知的 ha 策略类型。";
    }
    @Override
    protected String unableToFindRecoveryRegistry$str() {
        return "WFLYMSGAMQ0110: 无法找到恢复注册中心";
    }
    @Override
    protected String noSubscriptionError$str() {
        return "WFLYMSGAMQ0111: 没有用于 clientID %2$s 的名为 %1$s 的订阅";
    }
    @Override
    protected String noSubscriptionWithQueueName$str() {
        return "WFLYMSGAMQ0112: 没有名为 %1$s 的订阅";
    }
    @Override
    protected String missingArguments$str() {
        return "WFLYMSGAMQ0113: 参数缺失";
    }
    @Override
    protected String missingRestype$str() {
        return "WFLYMSGAMQ0114: 必需的参数 --restype 缺失。";
    }
    @Override
    protected String missingJNDIName$str() {
        return "WFLYMSGAMQ0115: JNDI 名称缺失。";
    }
    @Override
    protected String failedToParseProperty$str() {
        return "WFLYMSGAMQ0116: 无法解析属性 '%1$s' ";
    }
    @Override
    protected String unsupportedResourceType$str() {
        return "WFLYMSGAMQ0117: 不支持资源类型 %1$s。";
    }
    @Override
    protected String missingName$str() {
        return "WFLYMSGAMQ0118: 名称缺失。";
    }
    @Override
    protected String jndiWasNotFound$str() {
        return "WFLYMSGAMQ0119: 在现有 JMS 资源中没有找到 '%1$s'。";
    }
}
