package org.jboss.as.connector.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:48+0200")
public class ConnectorLogger_$logger_zh_CN extends ConnectorLogger_$logger_zh implements ConnectorLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ConnectorLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String boundDataSource$str() {
        return "WFLYJCA0001: 绑定数据源 [%1$s]";
    }
    @Override
    protected String boundJca$str() {
        return "WFLYJCA0002: 绑定 Jakarta Connectors %1$s [%2$s]";
    }
    @Override
    protected String cannotInstantiateDriverClass2$str() {
        return "WFLYJCA0003: 不能实例化驱动类 \"%1$s\": %2$s";
    }
    @Override
    protected String deployingCompliantJdbcDriver$str() {
        return "WFLYJCA0004: 部署 JDBC 兼容的驱动 %1$s (版本 %2$d.%3$d)";
    }
    @Override
    protected String deployingNonCompliantJdbcDriver$str() {
        return "WFLYJCA0005: 部署非 JDBC 兼容的驱动 %1$s (版本 %2$d.%3$d)";
    }
    @Override
    protected String registeredAdminObject$str() {
        return "WFLYJCA0006: %1$s 里注册的 admin 对象";
    }
    @Override
    protected String registeredConnectionFactory$str() {
        return "WFLYJCA0007: 注册的连接工厂 %1$s";
    }
    @Override
    protected String startingSubsystem$str() {
        return "WFLYJCA0009: 启动 %1$s 子系统（%2$s）";
    }
    @Override
    protected String unboundDataSource$str() {
        return "WFLYJCA0010: 解除数据源 [%1$s] 的绑定";
    }
    @Override
    protected String unboundJca$str() {
        return "WFLYJCA0011: 取消绑定 Jakarta Connectors %1$s [%2$s]";
    }
    @Override
    protected String driversElementNotSupported$str() {
        return "WFLYJCA0012: standalone -ds.xml 部署中的 <drivers/> 不被支持；忽略 %1$s";
    }
    @Override
    protected String driverNameAndResourceNameNotEquals$str() {
        return "WFLYJCA0015: 属性 driver-name (%1$s) 不能和驱动资源名 (%2$s) 不同";
    }
    @Override
    protected String methodNotFoundOnDataSource$str() {
        return "WFLYJCA0016: DataSource 类 %2$s 上的方法 %1$s 未找到。忽略";
    }
    @Override
    protected String forceIJToNull$str() {
        return "WFLYJCA0017: 强制 ironjacamar.xml 描述符为 null";
    }
    @Override
    protected String startedDriverService$str() {
        return "WFLYJCA0018: 已用 driver-name = %1$s 启动 Driver 服务";
    }
    @Override
    protected String stoppedDriverService$str() {
        return "WFLYJCA0019: 已用 driver-name = %1$s 停止 Driver 服务";
    }
    @Override
    protected String unsupportedSelectorOption$str() {
        return "WFLYJCA0020: 不支持的选择器选项：%1$s";
    }
    @Override
    protected String unsupportedPolicyOption$str() {
        return "WFLYJCA0021: 不支持的策略选项：%1$s";
    }
    @Override
    protected String failedToStartJGroupsChannel$str() {
        return "WFLYJCA0022: 为分布式 workmanager %2$s 启动 JGroups 频道 %1$s 失败";
    }
    @Override
    protected String failedToFindDistributedWorkManager$str() {
        return "WFLYJCA0023: 无法找到 WorkManager %1$s 或它不是分布式的 WorkManager。只有 DWM 可以覆盖配置。";
    }
    @Override
    protected String failedToStartDWMTransport$str() {
        return "WFLYJCA0024: 为分布式 workmanager %1$s 启动 JGroups 传输失败";
    }
    @Override
    protected String unsupportedSelector$str() {
        return "WFLYJCA0025: 不支持的选择器选项：%1$s";
    }
    @Override
    protected String unsupportedPolicy$str() {
        return "WFLYJCA0026: 不支持的策略选项：%1$s";
    }
    @Override
    protected String noSecurityDefined$str() {
        return "WFLYJCA0027: 没有为 %1$s 定义 ironjacamar.security";
    }
    @Override
    protected String connectionFactoryAnnotation$str() {
        return "WFLYJCA0028: @ConnectionFactoryDefinition 将具有有限的管理：%1$s";
    }
    @Override
    protected String adminObjectAnnotation$str() {
        return "WFLYJCA0029: @AdministeredObjectDefinition 将具有有限的管理：%1$s";
    }
    @Override
    protected String cannotDeploy$str() {
        return "WFLYJCA0030: 无法部署";
    }
    @Override
    protected String cannotDeployAndValidate$str() {
        return "WFLYJCA0031: 无法检验并部署 DS 或 XADS";
    }
    @Override
    protected String deploymentError$str() {
        return "WFLYJCA0033: 部署 %1$s 时出错";
    }
    @Override
    protected String cannotInstantiateDriverClass1$str() {
        return "WFLYJCA0034: 无法实例化驱动类 %1$s。详情请参考日志（WARN）。";
    }
    @Override
    protected String driverVersionMismatch$str() {
        return "WFLYJCA0035: 指定的驱动版本无法和实际的版本匹配";
    }
    @Override
    protected String failedToCreate$str() {
        return "WFLYJCA0036: 为 [%2$s]%n 创建 %1$s 实例失败的原因：%3$s";
    }
    @Override
    protected String failedToGetMetrics$str() {
        return "WFLYJCA0037: 获取指标数据 %1$s 失败。";
    }
    @Override
    protected String failedToGetUrlDelimiter$str() {
        return "WFLYJCA0039: 获取 URL 限界符失败";
    }
    @Override
    protected String failedToInvokeOperation$str() {
        return "WFLYJCA0040: 调用操作 %1$s 失败";
    }
    @Override
    protected String failedToLoadModuleDriver$str() {
        return "WFLYJCA0041: 加载驱动 [%1$s] 的模块失败";
    }
    @Override
    protected String failedToMatchPool$str() {
        return "WFLYJCA0042: 匹配池失败。请检查 JNDI 名称 %1$s";
    }
    @Override
    protected String failedToParseServiceXml$str() {
        return "WFLYJCA0043: 解析服务 XML [%1$s] 失败";
    }
    @Override
    protected String failedToProcessRaChild$str() {
        return "WFLYJCA0044: 处理 [%1$s] 的 RA 子归档失败";
    }
    @Override
    protected String failedToSetAttribute$str() {
        return "WFLYJCA0045: 设置属性 %1$s 失败";
    }
    @Override
    protected String failedToStartRaDeployment$str() {
        return "WFLYJCA0046: 启动 RA 部署 [%1$s] 失败";
    }
    @Override
    protected String invalidConnection$str() {
        return "WFLYJCA0047: 连接是无效的";
    }
    @Override
    protected String jndiBindingsNotSupported$str() {
        return "WFLYJCA0049: 不支持非显性的 JNDI 绑定";
    }
    @Override
    protected String noMetricsAvailable$str() {
        return "WFLYJCA0050: 没有可用的度量";
    }
    @Override
    protected String notAnAnnotation$str() {
        return "WFLYJCA0051: %1$s 应该是一个注解";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYJCA0052: %1$s 为 null";
    }
    @Override
    protected String serviceAlreadyStarted$str() {
        return "WFLYJCA0053: %1$s 服务 [%2$s] 已启动";
    }
    @Override
    protected String serviceNotAvailable$str() {
        return "WFLYJCA0054: %1$s 服务 [%2$s] 不可用";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYJCA0056: 服务尚未启动";
    }
    @Override
    protected String undefinedVar$str() {
        return "WFLYJCA0058: %1$s 未定义";
    }
    @Override
    protected String failedToLoadNativeLibraries$str() {
        return "WFLYJCA0061: 加载原生库失败";
    }
    @Override
    protected String exceptionDeployingDatasource$str() {
        return "WFLYJCA0064: 部署数据源 %1$s 出现异常";
    }
    @Override
    protected String noDataSourceRegisteredForAddress$str() {
        return "WFLYJCA0065: 地址 %1$s 上不存在数据源";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYJCA0066: 未知属性 %1$s";
    }
    @Override
    protected String unknownOperation$str() {
        return "WFLYJCA0067: 未知操作 %1$s";
    }
    @Override
    protected String xaDataSourcePropertiesNotPresent$str() {
        return "WFLYJCA0069: XA 数据源要求至少一个 xa-datasource-property";
    }
    @Override
    protected String deploymentFailed$str() {
        return "WFLYJCA0072: 部署 %1$s 失败";
    }
    @Override
    protected String failedToLoadModuleRA$str() {
        return "WFLYJCA0073: 为 RA [%1$s] 加载模块失败，原因是：%2$s";
    }
    @Override
    protected String noSuchMethod$str() {
        return "WFLYJCA0074: 未找到方法 %1$s";
    }
    @Override
    protected String noSuchField$str() {
        return "WFLYJCA0075: 未找到字段 %1$s";
    }
    @Override
    protected String noPropertyResolution$str() {
        return "WFLYJCA0076: 属性 %1$s 的未知属性解析";
    }
    @Override
    protected String archiveOrModuleRequired$str() {
        return "WFLYJCA0077: 至少要求 ARCHIVE 或 MODULE 中的一个";
    }
    @Override
    protected String compressedRarNotSupportedInModuleRA$str() {
        return "WFLYJCA0078: 只支持未压缩形式的 RAR。加载 RA [%1$s] 的模块失败";
    }
    @Override
    protected String FailedDeployDriverNotSpecified$str() {
        return "WFLYJCA0079: 因为未指定驱动，部署数据源 %1$s 失败。";
    }
    @Override
    protected String RARNotYetDeployed$str() {
        return "WFLYJCA0080: 没有部署 RAR '%1$s'。";
    }
    @Override
    protected String invalidConnectionFactory$str() {
        return "WFLYJCA0083: 部署 %3$s 时资源适配器 '%2$s' 的连接工厂接口（%1$s）不正确。";
    }
    @Override
    protected String adminObjectForJCA10$str() {
        return "WFLYJCA0084: 部署 %2$s 时声明 JCA 1.0 资源适配器 '%1$s' 的 Admin 对象。";
    }
    @Override
    protected String invalidAdminObject$str() {
        return "WFLYJCA0085: 部署 %3$s 时资源适配器 '%2$s' 的 Admin 对象类（%1$s）不正确。";
    }
    @Override
    protected String cannotFindDriverClassName$str() {
        return "WFLYJCA0086: 无法在 \"%1$s\" jar 里找到驱动类名";
    }
    @Override
    protected String unableToRegisterRecovery$str() {
        return "WFLYJCA0087: 无法注册恢复: %1$s (%2$s)";
    }
    @Override
    protected String rejectAttributesMustBeTrue$str() {
        return "WFLYJCA0088: 属性 %1$s 被拒绝。它必须为 true。";
    }
    @Override
    protected String exceptionDuringUnregistering$str() {
        return "WFLYJCA0089: 取消注册部署时抛出异常";
    }
    @Override
    protected String jndiNameShouldValidate$str() {
        return "WFLYJCA0090: JNDI 名称不应该包含 '//' 或以 '/' 结尾";
    }
    @Override
    protected String deprecated$str() {
        return "WFLYJCA0091: -ds.xml 文件部署已被弃用。在未来的版本中会删除对此功能的支持。";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYJCA0092: 只有父资源支持有序子资源时，有索引的子资源才可以注册。'%1$s' 的父资源没有编入索引";
    }
    @Override
    protected String legacyDisableEnableOperation$str() {
        return "WFLYJCA0093: '%1$s' 操作已弃用。'add' 或 'remove' 操作现在是首选，如果需要则可以使用 'write-attribute' 操作来设置已弃用的 'enabled' 属性。";
    }
    @Override
    protected String errorDuringRecoveryShutdown$str() {
        return "WFLYJCA0096: 恢复关闭过程中出错";
    }
    @Override
    protected String errorStoppingRA$str() {
        return "WFLYJCA0097: 停止资源适配器时抛出异常";
    }
    @Override
    protected String boundNonJTADataSource$str() {
        return "WFLYJCA0098: 绑定非事务性数据源：%1$s";
    }
    @Override
    protected String unBoundNonJTADataSource$str() {
        return "WFLYJCA0099: 解除非事务性数据源 %1$s 的绑定";
    }
    @Override
    protected String noSupportedOperation$str() {
        return "WFLYJCA0100: 不支持操作 %1$s";
    }
    @Override
    protected String oneThreadPoolWorkManager$str() {
        return "WFLYJCA0101: 无法为工作节点管理者 %3$s 添加线程池 %1$s（类型：%2$s），每个类型只允许一个线程池。";
    }
    @Override
    protected String attributeRequiresTrueAttribute$str() {
        return "WFLYJCA0102: 只有 %2$s 为 true 时才能定义 %1$s 属性";
    }
    @Override
    protected String attributeRequiresFalseOrUndefinedAttribute$str() {
        return "WFLYJCA0103: 只有 %2$s 未定义或为 false 时才能定义属性 %1$s";
    }
    @Override
    protected String elytronHandlerHandle$str() {
        return "WFLYJCA0106: Elytron 处理程序句柄：%1$s";
    }
    @Override
    protected String executionSubjectNotSetInHandler$str() {
        return "WFLYJCA0107: 没有向回调处理程序提供执行主题";
    }
    @Override
    protected String invalidCallbackSecurityDomain$str() {
        return "WFLYJCA0108: 提供的回调中不包含安全域引用";
    }
    @Override
    protected String unsupportedCreateCallbackHandlerMethod$str() {
        return "WFLYJCA0109: 需要包含安全域的回调 - 使用 createCallbackHandler(Callback callback) 代替";
    }
    @Override
    protected String invalidCredentialSourceSupplier$str() {
        return "WFLYJCA0110: CredentialSourceSupplier 对于 DSSecurity 无效";
    }
    @Override
    protected String invalidElytronWorkManagerSetting$str() {
        return "WFLYJCA0111: WorkManager 没有为 RA 1 相应设置启用 elytron 的标记";
    }
    @Override
    protected String datasourceIsDisabled$str() {
        return "WFLYJCA0112: 数据源 %1$s 已禁用";
    }
    @Override
    protected String unexceptedWorkerCompletionError$str() {
        return "WFLYJCA0113: worker 执行期间出现意外错误：%1$s";
    }
    @Override
    protected String failedToLoadDataSourceClass$str() {
        return "WFLYJCA0114: 加载数据源类失败：%1$s";
    }
    @Override
    protected String missingDependencyInModuleDriver$str() {
        return "WFLYJCA0115: 驱动程序 [%1$s] 的模块或其依赖项之一缺失：[%2$s]";
    }
    @Override
    protected String raModuleNotFound$str() {
        return "WFLYJCA0116: 加载 RA [%1$s] 的模块失败 - 该模块或其依赖项之一缺失 [%2$s]";
    }
    @Override
    protected String notAValidDataSourceClass$str() {
        return "WFLYJCA0117: %1$s 不是一个有效的 %2$s 实现";
    }
    @Override
    protected String bindingAlias$str() {
        return "WFLYJCA0118: 将名为 %1$s 的连接工厂绑定到别名 %2$s";
    }
    @Override
    protected String unbindingAlias$str() {
        return "WFLYJCA0119: 将名为 %1$s 的连接工厂取消与别名 %2$s 的绑定";
    }
    @Override
    protected String cannotStartDSNoConnectionFactory$str() {
        return "WFLYJCA0120: 无法启动数据源 '%1$s'，因为没有连接工厂（未定义或失败），请检查日志。";
    }
    @Override
    protected String cannotStartDSTooManyConnectionFactories$str() {
        return "WFLYJCA0121: 无法启动数据源 '%1$s'，因为定义了多个（%2$s）连接工厂。";
    }
    @Override
    protected String threadPoolNameMustMatchWorkManagerName$str() {
        return "WFLYJCA0122: 线程池名称 %1$s（类型：%2$s）必须与 workmanager 名称匹配 %3$s 。";
    }
    @Override
    protected String legacySecurityNotAvailable2$str() {
        return "WFLYJCA0123: 来自资源适配器 %2$s 的连接定义 %1$s 被配置为需要旧的安全子系统，但该子系统不存在";
    }
    @Override
    protected String legacySecurityNotAvailable1$str() {
        return "WFLYJCA0124: 数据源 %1$s 配置为需要旧的安全子系统，但该子系统不存在";
    }
    @Override
    protected String legacySecurityNotAvailableForDsXml$str() {
        return "WFLYJCA0125: 数据源 %1$s 配置为需要旧的安全子系统，但该子系统不存在";
    }
    @Override
    protected String legacySecurityNotAvailableForRa$str() {
        return "WFLYJCA0126: %1$s 的连接定义被配置为需要旧的安全子系统，但该子系统不存在";
    }
    @Override
    protected String legacySecurityNotAvailableForConnectionFactory$str() {
        return "WFLYJCA0127: 连接工厂 %1$s 被配置为需要旧的安全子系统，但该子系统不存在";
    }
    @Override
    protected String legacySecurityNotAvailable0$str() {
        return "WFLYJCA0128: 传统的安全不可用";
    }
    @Override
    protected String wrongModuleName$str() {
        return "WFLYJCA0129: 错误的模块名称 %1$s";
    }
    @Override
    protected String reportDirectoryDoesNotExist$str() {
        return "WFLYJCA0130: 报告目录 %1$s 不存在";
    }
    @Override
    protected String legacySecurityAttributeNotSupported$str() {
        return "WFLYJCA0131: 旧版安全属性 %1$s 不再被支持。请使用 Elytron 配置";
    }
    @Override
    protected String legacySecurityNotSupported$str() {
        return "WFLYJCA0132: 旧版安全性不再被支持。请使用 Elytron 配置";
    }
    @Override
    protected String authorizationFailed$str() {
        return "WFLYJCA0133: 授权失败";
    }
    @Override
    protected String nameAttributeIsMandatory$str() {
        return "WFLYJCA0134: 对于 workmanager 元素，name 属性是必需的";
    }
    @Override
    protected String jdbcDriverNotInstalled$str() {
        return "WFLYJCA0135: jdbc 驱动程序： %1$s 未安装";
    }
}
