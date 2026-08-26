package org.jboss.as.host.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:19+0200")
public class HostControllerLogger_$logger_zh_CN extends HostControllerLogger_$logger_zh implements HostControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public HostControllerLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String lostRemoteDomainConnection$str() {
        return "WFLYHC0015: 到远程主机控制器的连接关闭。试图重新连接。";
    }
    @Override
    protected String noServerInventory$str() {
        return "WFLYHC0071: 没有服务器库存";
    }
    @Override
    protected String channelClosed$str() {
        return "WFLYHC0153: 通道关闭";
    }
    @Override
    protected String failedProfileOperationsRetrieval$str() {
        return "WFLYHC0056: 无法从域控制器检索配置文件操作";
    }
    @Override
    protected String shutdownHookInvoked$str() {
        return "WFLYHC0181: 已通过 OS 信号请求主机控制器关闭";
    }
    @Override
    protected String couldNotCreateDomainDataDirectory$str() {
        return "WFLYHC0101: 无法创建域数据目录：%1$s";
    }
    @Override
    protected String unsupportedManagementVersionForHost$str() {
        return "WFLYHC0113: 主机控制器管理版本 %1$s.%2$s 太旧，只支持 %3$s.%4$s 或更高版本";
    }
    @Override
    protected String cannotOverwriteDomainXmlWithEmpty$str() {
        return "WFLYHC0206: 文件 %1$s 已存在，您必须使用 --remove-existing-domain-config 覆盖现有文件。";
    }
    @Override
    protected String profileInvolvedInACycle$str() {
        return "WFLYHC0163: 配置文件 '%1$s' 涉及到一个循环";
    }
    @Override
    protected String lostConnectionToRemoteHost$str() {
        return "WFLYHC0030: 到远程主机 \"%1$s\" 的连接意外地关闭";
    }
    @Override
    protected String socketBindingGroupInvolvedInACycle$str() {
        return "WFLYHC0165: 套接字绑定组 '%1$s' 在一个循环里被调用";
    }
    @Override
    protected String cannotAccessS3File$str() {
        return "WFLYHC0116: 无法访问 S3 文件：%1$s";
    }
    @Override
    protected String reconnectingServer$str() {
        return "WFLYHC0018: 重连服务器 %1$s";
    }
    @Override
    protected String serverNameAlreadyRegistered$str() {
        return "WFLYHC0077: 已经有一个名为 '%1$s' 的注册的服务器";
    }
    @Override
    protected String domainModelAppliedButRestartIsRequired$str() {
        return "WFLYHC0203: 已成功应用域配置，但更改生效前需要先重新启动。";
    }
    @Override
    protected String failedMarshallingDomainControllerData$str() {
        return "WFLYHC0117: 从 S3 文件获取域控制器数据失败";
    }
    @Override
    protected String invalidPreSignedUrl$str() {
        return "WFLYHC0124: pre-signed url %1$s 不是有效的 URL";
    }
    @Override
    protected String unknownHostValue$str() {
        return "WFLYHC0085: %1$s 的值不是已知的主机 --%2$s. %3$s";
    }
    @Override
    protected String serverLoggingConfigurationFileNotFound$str() {
        return "WFLYHC0204: 无法找到用于服务器初始引导的日志配置文件。为服务器 %1$s 激活日志子系统之前，不会配置日志";
    }
    @Override
    protected String hostDomainSynchronizationError$str() {
        return "WFLYHC0201: 将主机模式与域控制器模式同步时出错，失败：%1$s。";
    }
    @Override
    protected String interruptedAwaitingResumeResponse$str() {
        return "WFLYHC0190: %1$s 中断了等待服务器恢复响应";
    }
    @Override
    protected String undefinedSocketBindingGroup$str() {
        return "WFLYHC0082: 未定义包含的套接字绑定组 %1$s";
    }
    @Override
    protected String domainDataDirectoryIsNotDirectory$str() {
        return "WFLYHC0100: 域数据目录不是一个目录：%1$s";
    }
    @Override
    protected String couldNotCreateDomainAutoStartDirectory$str() {
        return "WFLYHC0157: 无法创建自动启动目录：%1$s";
    }
    @Override
    protected String duplicateIgnoredResourceType$str() {
        return "WFLYHC0092: 已经找到 'type' 属性为 '%2$s' 的 '%1$s' 元素";
    }
    @Override
    protected String managedServerUnstable1$str() {
        return "WFLYHC0198: 服务器 '%1$s' 不稳定，应该被停止或重启。不稳定的服务器可能无法正常停止，所以可能需要 'kill' 操作来终止服务器进程。";
    }
    @Override
    protected String socketBindingGroupIncludesSameSocketBinding$str() {
        return "WFLYHC0168: 套接字绑定组 '%1$s' 包含了套接字绑定组 '%2$s' 和 '%3$s'。这个两个套接字绑定组都定义了不被支持的套接字绑定 '%4$s'";
    }
    @Override
    protected String resumeExecutionFailed$str() {
        return "WFLYHC0194: 无法执行服务器的恢复操作: %1$s";
    }
    @Override
    protected String resumeListenerFailedMsg$str() {
        return "WFLYHC0193: 无法从服务器 %1$s 的恢复监听程序获得响应";
    }
    @Override
    protected String domainBaseDirectoryIsNotADirectory$str() {
        return "WFLYHC0098: 域的基目录不是一个目录：%1$s";
    }
    @Override
    protected String hostControllerSystemPropertyUpdateNotSupported$str() {
        return "WFLYHC0090: HostControllerEnvironment 不支持系统属性的更新";
    }
    @Override
    protected String failedToApplyDomainConfig2$str() {
        return "WFLYHC0143: 无法从域控制器应用域范围的配置。操作结果：%1$s 。失败描述 %2$s";
    }
    @Override
    protected String invalidJavaHome$str() {
        return "WFLYHC0213: Java 主目录 '%1$s' 不存在。";
    }
    @Override
    protected String preSignedUrlMustPointToFile$str() {
        return "WFLYHC0123: pre-signed url %1$s 必须指向 bucket 里的一个文件";
    }
    @Override
    protected String stoppingServer$str() {
        return "WFLYHC0024: 停止服务器 %1$s";
    }
    @Override
    protected String failedToStartServer$str() {
        return "WFLYHC0008: 启动服务器 (%1$s) 失败";
    }
    @Override
    protected String failedToGetServerStatus$str() {
        return "WFLYHC0058: 无法获取服务器状态";
    }
    @Override
    protected String cannotBothHaveFalseUseCurrentHostConfigAndHostConfig$str() {
        return "WFLYHC0173: 在指定 host-config 时无法使用 use-current-host-config=false";
    }
    @Override
    protected String failedToSyncServerStatus$str() {
        return "WFLYHC0220: 无法在主机控制器注册时同步服务器状态。没有已注册的处理程序来管理服务器 %2$s 的操作 %1$s。";
    }
    @Override
    protected String invalidRemoteBackupPersisterState$str() {
        return "WFLYHC0031: 使用 --backup 无法加载域模型";
    }
    @Override
    protected String interruptedAwaitingSuspendResponseMsg$str() {
        return "WFLYHC0185: 等待服务器挂起响应时 %1$s 中断";
    }
    @Override
    protected String bindingNameNotUnique$str() {
        return "WFLYHC0162: 套接字绑定组 '%1$s' 里的绑定名称 '%2$s' 不是唯一的。名称必须在 socket-binding、local-destination-outbound-socket-binding 和 remote-destination-outbound-socket-binding 里是唯一的";
    }
    @Override
    protected String existingServerWithState$str() {
        return "WFLYHC0005: 现存的状态为 %2$s 的服务器 [%1$s]";
    }
    @Override
    protected String failedToSetLoggingConfiguration$str() {
        return "WFLYHC0205: 设置服务器 %1$s 的 -Dlogging.configuration 属性时出错。配置路径 %2$s";
    }
    @Override
    protected String cannotObtainValidDefaultAddress$str() {
        return "WFLYHC0046: 无法使用 %1$s 或 InetAddress.getLocalHost() 来获取和 ProcessController 通讯的有效默认地址。请检查您的系统网络配置或使用 %2$s 命令行开关来配置有效地址";
    }
    @Override
    protected String fetchConfigFromDomainMasterFailed$str() {
        return "WFLYHC0144: 主机无法启动，因为它是以不能访问域范围配置策略的本地拷贝的运行模式 '%1$s' 启动的，'%2$s' 属性被设置为 '%3$s'，而域范围配置策略无法从域控制器主机获取。启动将被中止。如果您想不连接域控制器而启动它，请使用 '%4$s' 命令行参数。";
    }
    @Override
    protected String closeShouldBeManagedByService$str() {
        return "WFLYHC0049: 关闭应该由服务管理";
    }
    @Override
    protected String cannotInstantiateDiscoveryOptionClass$str() {
        return "WFLYHC0134: 无法初始化发现选项类 '%1$s': %2$s";
    }
    @Override
    protected String failedReportingServerInstabilityToMaster$str() {
        return "WFLYHC0200: 报告服务器 '%1$s' 的不稳定性至域控制器失败。";
    }
    @Override
    protected String discoveryOptionsFailureUnableToConnect$str() {
        return "WFLYHC0120: 尝试了所有域控制器发现选项，但无法连接";
    }
    @Override
    protected String securityRealmReferencesUnsupported$str() {
        return "WFLYHC0217: 不再支持安全领域，请从配置中迁移对它们的引用。";
    }
    @Override
    protected String invalidOption$str() {
        return "WFLYHC0062: 无效的选项 '%1$s'. %2$s";
    }
    @Override
    protected String errorParsingBucketListings$str() {
        return "WFLYHC0132: 解析 bucket 列表时的意外错误";
    }
    @Override
    protected String cannotAccessS3Bucket$str() {
        return "WFLYHC0119: 无法访问 S3 bucket '%1$s'：%2$s";
    }
    @Override
    protected String unknown$str() {
        return "WFLYHC0084: 未知的 %1$s %2$s";
    }
    @Override
    protected String cannotWriteDomainControllerData$str() {
        return "WFLYHC0137: 无法将域控制器数据写入到 S3 文件。错误为：%1$s";
    }
    @Override
    protected String cannotOverwriteHostXmlWithEmpty$str() {
        return "WFLYHC0207: 文件 %1$s 已存在，您必须使用 --remove-existing-host-config 覆盖现有文件。";
    }
    @Override
    protected String shuttingDownInResponseToManagementRequest$str() {
        return "WFLYHC0180: 对管理操作 '%1$s' 作出响应而关闭";
    }
    @Override
    protected String socketBindingGroupAttemptingToOverrideSocketBinding$str() {
        return "WFLYHC0166: 套接字绑定组 '%1$s' 定义了套接字绑定 '%2$s'，它的原型套接字绑定组 '%3$s' 也定义了这个套接字绑定。不支持覆盖套接字绑定";
    }
    @Override
    protected String preSignedUrlsMustBeSetOrUnset$str() {
        return "WFLYHC0122: pre_signed_put_url 和 pre_signed_delete_url 必须都被设置或取消设置";
    }
    @Override
    protected String timedOutAwaitingResumeResponseMsg$str() {
        return "WFLYHC0189: 在等待服务器 %2$s 的恢复响应 %1$d 毫秒后超时";
    }
    @Override
    protected String slaveHostControllerChanged$str() {
        return "WFLYHC0039: 辅助主机控制器 \"%1$s\" 已重启或正在尝试重新连接。取消当前到此辅助控制器的连接的注册。";
    }
    @Override
    protected String couldNotPersistAutoStartServerStatus$str() {
        return "WFLYHC0158: 持久化服务器自动启动状态出错";
    }
    @Override
    protected String interruptedAwaitingSuspendResponse$str() {
        return "WFLYHC0184: 等待服务器挂起响应时 %1$s 中断";
    }
    @Override
    protected String mixedDomainUnsupportedStability$str() {
        return "WFLYHC0223: %1$s 稳定性级别只在与域控制器具有相同管理主版本和次要版本的主机控制器上支持。域控制器的版本为 %2$d.%3$d 。远程主机控制器版本为 %4$d.%5$d。";
    }
    @Override
    protected String cannotAccessRemoteFileRepository$str() {
        return "WFLYHC0044: 无法从域控制器访问远程文件存储库";
    }
    @Override
    protected String jvmOptionAlreadyExists$str() {
        return "WFLYHC0111: 选项 '%1$s' 已经存在";
    }
    @Override
    protected String cannotExecuteTransactionalOperationFromSlave$str() {
        return "WFLYHC0140: 不能从辅助主机控制器执行事务操作 '%1$s'";
    }
    @Override
    protected String invocationNotAllowedAfterBoot$str() {
        return "WFLYHC0065: 不允许在主机控制器引导后调用 %1$s";
    }
    @Override
    protected String serverSuspected$str() {
        return "WFLYHC0199: 服务器 '%1$s'（由主机 '%2$s' 管理）在配置的超时内没有响应操作请求。这可能表示这个服务器已处于不稳定状态。";
    }
    @Override
    protected String couldNotCreateDomainContentDirectory$str() {
        return "WFLYHC0103: 无法创建域内容目录：%1$s";
    }
    @Override
    protected String homeDirectoryDoesNotExist$str() {
        return "WFLYHC0095: 主目录不存在：%1$s";
    }
    @Override
    protected String incompatibleStability$str() {
        return "WFLYHC0221: 域控制器的 %1$s 稳定性级别与连接主机的 %2$s 稳定性级别不匹配";
    }
    @Override
    protected String cannotAccessJvmInputArgument$str() {
        return "WFLYHC0093: 无法访问 JVM 输入参数，所以直接传入这个主机控制器 JVM 的系统属性将不会传递给服务器进程。导致这个问题的原因：%1$s";
    }
    @Override
    protected String preSignedUrlsMustHaveSamePath$str() {
        return "WFLYHC0121: pre_signed_put_url 和 pre_signed_delete_url 必须具有相同的路径";
    }
    @Override
    protected String unableToLoadProperties$str() {
        return "WFLYHC0080: 无法从 URL %1$s. %2$s 加载属性";
    }
    @Override
    protected String configFileInUse$str() {
        return "- 使用中的主机控制器配置文件：%1$s";
    }
    @Override
    protected String suspendExecutionFailed$str() {
        return "WFLYHC0172: 执行服务器 %1$s 的挂起操作失败";
    }
    @Override
    protected String cannotRestartServer$str() {
        return "WFLYHC0047: 无法重启服务器 %1$s，因为它当前未启动；它是 %2$s";
    }
    @Override
    protected String invalidS3Location$str() {
        return "WFLYHC0127: 无效的位置: %1$s";
    }
    @Override
    protected String slaveHostControllerUnreachable$str() {
        return "WFLYHC0040: 无法在最后 [%2$d] 毫秒里访问辅助主机控制器 \"%1$s\" 。取消注册。";
    }
    @Override
    protected String couldNotGetServerInventory$str() {
        return "WFLYHC0053: 无法获取 %1$d %2$s 里的服务器库存";
    }
    @Override
    protected String couldNotCreateLogDirectory$str() {
        return "WFLYHC0105: 无法创建日志目录：%1$s";
    }
    @Override
    protected String stabilityInUse$str() {
        return "- 最低功能稳定性级别：%1$s";
    }
    @Override
    protected String noDomainControllerConfigurationProvided$str() {
        return "WFLYHC0012: 没有提供 <domain-controller> 配置且当前的运行模式 ('%1$s')要求对域控制器主机的访问。启动将被中止。如果想不使用域控制器连接而在以后通过管理工具来配置的方式启动，请使用 %2$s 命令行参数来以 %3$s 模式启动。";
    }
    @Override
    protected String sslFailureUnableToConnect$str() {
        return "WFLYHC0110: 由于 SSL 错误无法进行连接。";
    }
    @Override
    protected String configDirectoryDoesNotExist$str() {
        return "WFLYHC0099: 配置目录不存在：%1$s";
    }
    @Override
    protected String serverLaunchCommandPrefix$str() {
        return "WFLYHC0152: 服务器 %1$s 将用 JVM 启动命令前缀 '%2$s' 启动";
    }
    @Override
    protected String failedToApplyDomainConfig0$str() {
        return "WFLYHC0142: 无法从域控制器应用域范围的配置";
    }
    @Override
    protected String unregisteringServer$str() {
        return "WFLYHC0027: 未注册的服务器 %1$s";
    }
    @Override
    protected String invalidJavaHomeBin$str() {
        return "WFLYHC0214: Java 主目录下的 bin '%1$s' 不存在。主目录已被确认为 %2$s.";
    }
    @Override
    protected String cannotStartServersInvalidMode$str() {
        return "WFLYHC0048: 当主机控制器运行模式为 %1$s 时无法启动服务器";
    }
    @Override
    protected String creatingBucketWithUnsupportedCallingFormat$str() {
        return "WFLYHC0126: 用不受支持的 calling-format 创建位置受限的 bucket";
    }
    @Override
    protected String couldNotCreateServersDirectory$str() {
        return "WFLYHC0107: 无法创建服务器目录：%1$s";
    }
    @Override
    protected String aborting$str() {
        return "WFLYHC0178: 终止，退出码为 %1$d";
    }
    @Override
    protected String invalidPreSignedUrlLength$str() {
        return "WFLYHC0125: pre-signed url %1$s 只能具有 bucket 下的一个子目录";
    }
    @Override
    protected String unsuccessfulBoot$str() {
        return "WFLYHC0034: 主机控制器启动以一种不可恢复的方式失败了；有关详细信息，请参阅前面的信息。%1$s";
    }
    @Override
    protected String domainContentDirectoryIsNotDirectory$str() {
        return "WFLYHC0102: 域内容目录不是一个目录：%1$s";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYHC0064: %1$s 的值不是一个 %2$s -- %3$s. %4$s";
    }
    @Override
    protected String cannotIgnoreTypeHost$str() {
        return "WFLYHC0091: 不能忽略类型 %1$s 的资源";
    }
    @Override
    protected String noAccessControlConfigurationAvailable$str() {
        return "WFLYHC0145: 主机无法启动，因为它是以不能访问域范围配置策略的本地拷贝的运行模式 '%1$s' 启动的，'%2$s' 属性被设置为 '%3$s'。启动将被中止。请使用 '%4$s' 命令行参数在运行模式 '%5$s' 下启动它。";
    }
    @Override
    protected String timedOutAwaitingSuspendResponse$str() {
        return "WFLYHC0182: 在等待服务器 %2$s 的挂起响应 %1$d 毫秒后超时";
    }
    @Override
    protected String suspendListenerFailed$str() {
        return "WFLYHC0171: 无法从服务器 %1$s 的挂起的监听程序获得响应";
    }
    @Override
    protected String managedServerUnstable2$str() {
        return "WFLYHC0198: 服务器 '%1$s'（由主机 '%2$s' 管理）不稳定，应该被停止或重启。不稳定的服务器可能无法正常停止，所以可能需要 'kill' 操作来终止服务器进程。";
    }
    @Override
    protected String cannotRemoveS3File$str() {
        return "WFLYHC0138: 无法删除 S3 文件。错误为：%1$s";
    }
    @Override
    protected String domainTempDirectoryIsNotADirectory$str() {
        return "WFLYHC0108: 域的临时目录不存在：%1$s";
    }
    @Override
    protected String argumentExpected$str() {
        return "WFLYHC0041: 选项 %1$s. %2$s 期待的参数";
    }
    @Override
    protected String failedToAddExtensions$str() {
        return "WFLYHC0114: 添加域使用的扩展失败。失败的描述是：%1$s";
    }
    @Override
    protected String moduleOptionNotAllowed$str() {
        return "WFLYHC0216: 不允许模块选项 %1$s。";
    }
    @Override
    protected String bucketAuthenticationFailure$str() {
        return "WFLYHC0129: bucket '%1$s' 无法访问 (rsp=%2$d (%3$s))。可能这个 bucket 是由其他人所有或者验证失败";
    }
    @Override
    protected String cannotInitializeSaxDriver$str() {
        return "WFLYHC0133: 无法为 XMLReader 初始化 SAX 驱动";
    }
    @Override
    protected String undefinedSocketBinding$str() {
        return "WFLYHC0081: 服务器 %1$s 的未定义的套接字绑定组";
    }
    @Override
    protected String connectedToMaster$str() {
        return "WFLYHC0148: 在 %1$s 处连接到域控制器";
    }
    @Override
    protected String mustInvokeBeforeCheckingSlaveStatus$str() {
        return "WFLYHC0067: 在检查辅助主机控制器状态前必须调用 %1$s";
    }
    @Override
    protected String invalidDiscoveryType$str() {
        return "WFLYHC0159: 无效的发现类型 %1$s";
    }
    @Override
    protected String cannotCreateLocalDirectory$str() {
        return "WFLYHC0045: 无法创建本地目录：%1$s";
    }
    @Override
    protected String reconnectingToMaster$str() {
        return "WFLYHC0150: 尝试重新连接域控制器。";
    }
    @Override
    protected String mustInvokeBeforePersisting$str() {
        return "WFLYHC0068: 必须在持久化域模型之前调用 %1$s";
    }
    @Override
    protected String reportAdminOnlyDomainXmlFailure$str() {
        return "WFLYHC0035: 域范围配置的安装失败。因为这个主机控制器的运行模式是 ADMIN_ONLY，已允许继续引导。如果 ADMIN_ONLY 模式未生效，进程将由于严重的引导故障而终止。";
    }
    @Override
    protected String noDomainControllerConfigurationProvidedForAdminOnly$str() {
        return "WFLYHC0151: 没有域控制器发现配置，属性 '%1$s' 被设置为 '%2$s'。启动将被中止。如果想不使用域控制器连接而在以后通过管理工具来配置的方式启动，请使用 %3$s 命令行参数来以 %4$s 模式启动。";
    }
    @Override
    protected String shuttingDownInResponseToProcessControllerSignal$str() {
        return "WFLYHC0179: ProcessController 已给出关闭信号；正在关闭";
    }
    @Override
    protected String unsupportedStability$str() {
        return "WFLYHC0222: %2$s 中不支持稳定性级别 %1$s";
    }
    @Override
    protected String insufficientInformationToGenerateHash$str() {
        return "WFLYHC0061: 没有足够的信息来生成 hash。";
    }
    @Override
    protected String noServerInstallationPrepared$str() {
        return "WFLYHC0218: 没有准备 %1$s 安装。";
    }
    @Override
    protected String cannotConnect$str() {
        return "WFLYHC0001: 无法连接到远程域控制器 %1$s";
    }
    @Override
    protected String caughtExceptionDuringBoot$str() {
        return "WFLYHC0033: 在引导时捕获异常";
    }
    @Override
    protected String timedOutAwaitingSuspendResponseMsg$str() {
        return "WFLYHC0183: 在等待服务器 %2$s 的挂起响应 %1$d 毫秒后超时";
    }
    @Override
    protected String registeringServer$str() {
        return "WFLYHC0020: 注册服务器 %1$s";
    }
    @Override
    protected String didNotReadEntireFile$str() {
        return "WFLYHC0054: 无法读取整个文件。缺失了：%1$d";
    }
    @Override
    protected String registeredRemoteSlaveHost$str() {
        return "WFLYHC0019: 已注册的远程辅助主机 \"%1$s\"，%2$s";
    }
    @Override
    protected String attemptingToSet$str() {
        return "WFLYHC0042: 在已经设置 '%2$s' 时试图设置 '%1$s'";
    }
    @Override
    protected String unregisteredRemoteSlaveHost$str() {
        return "WFLYHC0026: 未注册的远程辅助主机 \"%1$s\"";
    }
    @Override
    protected String suspendExecutionFailedMsg$str() {
        return "WFLYHC0186: 执行服务器 %1$s 的挂起操作失败";
    }
    @Override
    protected String bootConfigValidationFailed$str() {
        return "WFLYHC0211: 启动配置验证失败";
    }
    @Override
    protected String cannotFindJavaExe$str() {
        return "WFLYHC0215: 无法在 %1$s 下找到 Java 执行文件。";
    }
    @Override
    protected String couldNotCreateDomainTempDirectory$str() {
        return "WFLYHC0109: 无法创建域临时目录：%1$s";
    }
    @Override
    protected String invalidS3Bucket$str() {
        return "WFLYHC0128: 无效的 bucket 名称: %1$s";
    }
    @Override
    protected String failedToGetFileFromRemoteRepository$str() {
        return "WFLYHC0057: 无法从远程库里获取文件";
    }
    @Override
    protected String cannotRenameCachedDomainXmlOnBoot$str() {
        return "WFLYHC0196: 无法移动文件 %1$s 至 %2$s，无法持久化域配置修改 %3$s";
    }
    @Override
    protected String resumeExecutionFailedMsg$str() {
        return "WFLYHC0192: 无法执行服务器的恢复操作: %1$s";
    }
    @Override
    protected String embeddedHostControllerRestartMustProvideAdminOnlyTrue$str() {
        return "WFLYHC0169: 内嵌的主机控制器不支持重载至运行模式， admin-only=true 必须被指定。";
    }
    @Override
    protected String cannotAddHostAlreadyRegistered$str() {
        return "WFLYHC0208: 主机 (%1$s) 已注册。您必须先关闭此主机，再添加新主机。";
    }
    @Override
    protected String connectionToMasterTimeout$str() {
        return "WFLYHC0052: 在 %1$d ms 内的 %2$s 次尝试中无法连接到域控制器";
    }
    @Override
    protected String optionAlreadySet$str() {
        return "WFLYHC0016: 忽略 jvm '%2$s' 的 <option value=\"%1$s\"，因为设置了 '%3$s'";
    }
    @Override
    protected String profileIncludesSameSubsystem$str() {
        return "WFLYHC0167: 配置文件 '%1$s' 包含了配置文件 '%2$s' 和配置文件 '%3$s'。这两个配置文件都定义了子系统 '%4$s'，该子系统不被支持";
    }
    @Override
    protected String serverConnected$str() {
        return "WFLYHC0021: 服务器 [%1$s] 已使用连接 [%2$s] 连接";
    }
    @Override
    protected String identityNotAuthorizedAsServer$str() {
        return "WFLYHC0219: '%1$s' 试图连接作为一个域服务器的授权失败。";
    }
    @Override
    protected String timedOutAwaitingResumeResponse$str() {
        return "WFLYHC0188: 在等待服务器 %2$s 的恢复响应 %1$d 毫秒后超时";
    }
    @Override
    protected String unexpectedResponse$str() {
        return "WFLYHC0130: 意外的响应：%1$s";
    }
    @Override
    protected String cannotBothHaveFalseUseCurrentDomainConfigAndDomainConfig$str() {
        return "WFLYHC0174: 在指定 domain-config 时无法使用 use-current-domain-config=false";
    }
    @Override
    protected String httpManagementInterfaceIsUnsecured$str() {
        return "WFLYHC0013: 没有为 HTTP 管理服务定义安全域，所有的访问将不受限制。";
    }
    @Override
    protected String interruptedAwaitingResumeResponseMsg$str() {
        return "WFLYHC0191: %1$s 中断了等待服务器恢复响应";
    }
    @Override
    protected String unregisteredAtRemoteHostController$str() {
        return "WFLYHC0029: 已在域服务器上取消注册";
    }
    @Override
    protected String configurationPersisterAlreadyInitialized$str() {
        return "WFLYHC0050: 已经初始化了域模型的配置 persister";
    }
    @Override
    protected String missingHomeDirConfiguration$str() {
        return "WFLYHC0094: 缺失 %1$s 的配置值";
    }
    @Override
    protected String suspendListenerFailedMsg$str() {
        return "WFLYHC0187: 无法从服务器 %1$s 的挂起的监听程序获得响应";
    }
    @Override
    protected String serverStillRunning$str() {
        return "WFLYHC0078: 服务器 (%1$s) 仍在运行";
    }
    @Override
    protected String connectionToMasterInterrupted$str() {
        return "WFLYHC0051: 尝试连接到域控制器时中断";
    }
    @Override
    protected String cannotAddSlaveHostAfterBoot$str() {
        return "WFLYHC0210: 无法使用 add（）添加辅助主机控制器。请添加主机，省略此参数，并使用 write 属性配置远程域控制器。";
    }
    @Override
    protected String usingCachedDC$str() {
        return "WFLYHC0149: 设置了选项 %1$s；从 %2$s 获取域范围的配置";
    }
    @Override
    protected String fetchOfMissingConfigurationFailed$str() {
        return "WFLYHC0212: 从域控制器获取配置失败，没有解释。获取操作的结果是 %1$s";
    }
    @Override
    protected String masterHostControllerUnreachable$str() {
        return "WFLYHC0038: 最后 [%1$d] 毫秒无法访问域控制器。重新连接。";
    }
    @Override
    protected String logDirectoryIsNotADirectory$str() {
        return "WFLYHC0104: 日志目录不是一个目录：%1$s";
    }
    @Override
    protected String cannotWriteToS3File$str() {
        return "WFLYHC0118: 无法将域控制器数据写入 S3 文件：%1$s";
    }
    @Override
    protected String noDiscoveryOptionsLeft$str() {
        return "WFLYHC0147: 没有余下的域控制器发现选项。";
    }
    @Override
    protected String domainBaseDirectoryDoesNotExist$str() {
        return "WFLYHC0097: 域的基目录不存在：%1$s";
    }
    @Override
    protected String failedToReadAuthenticationKey$str() {
        return "WFLYHC0059: 读取验证密钥 %1$s 失败";
    }
    @Override
    protected String noServerAvailable$str() {
        return "WFLYHC0014: 没有可用的名为 %1$s 的服务器";
    }
    @Override
    protected String resumeListenerFailed$str() {
        return "WFLYHC0195: 无法从服务器 %1$s 的恢复监听程序获得响应";
    }
    @Override
    protected String unableToGenerateHash$str() {
        return "WFLYHC0079: 无法生成 hash";
    }
    @Override
    protected String profileAttemptingToOverrideSubsystem$str() {
        return "WFLYHC0164: 配置文件 '%1$s' 定义子系统 '%2$s'，该子系统也在其祖先配置文件 '%3$s' 中定义了。不支持覆盖子系统";
    }
    @Override
    protected String domainConfigForReloadNotFound$str() {
        return "WFLYHC0175: 无法找到为重载指定的 domain-config '%1$s'";
    }
    @Override
    protected String serversDirectoryIsNotADirectory$str() {
        return "WFLYHC0106: 服务器目录不是一个目录：%1$s";
    }
    @Override
    protected String hostAlreadyShutdown$str() {
        return "WFLYHC0087: 主机控制器已经关闭。";
    }
    @Override
    protected String invalidRootId$str() {
        return "WFLYHC0063: 无效的根 ID [%1$d]";
    }
    @Override
    protected String nativeManagementInterfaceIsUnsecured$str() {
        return "WFLYHC0177: 没有为原生管理服务定义安全域；所有的访问都是不受限制的。";
    }
    @Override
    protected String hostRegistrationCannotReleaseSharedLock$str() {
        return "WFLYHC0170: 在主机注册操作 ID %1$s 后释放共享锁出错";
    }
    @Override
    protected String httpRedirectSupportRequired$str() {
        return "WFLYHC0131: 要求 HTTP 重定向支持";
    }
    @Override
    protected String errorClosingDownHost$str() {
        return "WFLYHC0055: 关闭主机出错";
    }
    @Override
    protected String nullHostName$str() {
        return "WFLYHC0209: 主机名不能为空。";
    }
    @Override
    protected String ignoringPermGen$str() {
        return "WFLYHC0011: 对 jvm '%1$s' 类型 jvm 忽略 <permgen> : %2$s";
    }
    @Override
    protected String attributeRequiresSSLContext$str() {
        return "WFLYHC0197: 如果定义了属性 %1$s ，则也必须定义 ssl-context";
    }
    @Override
    protected String argumentHasNoValue$str() {
        return "WFLYHC0115: 参数 %1$s 没有值. %2$s";
    }
    @Override
    protected String domainModelAppliedButReloadIsRequired$str() {
        return "WFLYHC0202: 已成功应用域配置，但更改生效前需要先重新加载。";
    }
    @Override
    protected String configFilesInUse$str() {
        return "- 使用中的主机控制器配置文件：%1$s, %2$s";
    }
    @Override
    protected String cannotConnectToMaster$str() {
        return "WFLYHC0002: 无法连接到域控制器。错误是：%1$s";
    }
    @Override
    protected String couldNotObtainDomainUuid$str() {
        return "WFLYHC0160: 无法在文件 %1$s 里读取或创建域 UUID";
    }
    @Override
    protected String masterHostControllerChanged$str() {
        return "WFLYHC0037: 主主机控制器已重启。使用新的主控制器重新注册此辅助主机控制器。";
    }
    @Override
    protected String usageNote$str() {
        return "使用 %1$s --help 来获得有效的命令行参数和语法。";
    }
    @Override
    protected String creatingHttpManagementService$str() {
        return "WFLYHC0003: 使用网络接口 (%1$s) 端口 (%2$d) 安全端口(%3$d) 创建 HTTP 管理服务";
    }
    @Override
    protected String startingServer$str() {
        return "WFLYHC0023: 启动服务器 %1$s";
    }
    @Override
    protected String malformedUrl$str() {
        return "WFLYHC0066: 为选项 %1$s. %2$s 提供的 Malformed URL";
    }
    @Override
    protected String failedToStopServer$str() {
        return "WFLYHC0009: 停止服务器 (%1$s) 失败";
    }
    @Override
    protected String failedDiscoveringMaster$str() {
        return "WFLYHC0146: 无法发现使用发现选项 %1$s 的域控制器。错误是：%2$s";
    }
    @Override
    protected String authenticationFailureUnableToConnect$str() {
        return "WFLYHC0043: 由于验证错误无法进行连接。";
    }
}
