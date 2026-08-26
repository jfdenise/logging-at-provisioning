package org.jboss.as.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:04+0200")
public class ControllerLogger_$logger_zh_CN extends ControllerLogger_$logger_zh implements ControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ControllerLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotResolveAddress$str() {
        return "WFLYCTL0001: 无法解析地址 %1$s，因此无法将其与任何 InetAddress 映射";
    }
    @Override
    protected String errorBootingContainer0$str() {
        return "WFLYCTL0002: 引导容器出错";
    }
    @Override
    protected String errorBootingContainer2$str() {
        return "WFLYCTL0003: 引导容器出错，因为没有为用来执行引导操作的线程提供足够的栈空间。将该线程使用栈大小 [%1$d] 配置。将系统属性 %2$s 值设定为大于 [%1$d] 即可解决这个问题。";
    }
    @Override
    protected String errorRevertingOperation$str() {
        return "WFLYCTL0004: %1$s 捕获异常以尝试在地址 %3$s 还原操作 %2$s";
    }
    @Override
    protected String failedExecutingOperation$str() {
        return "WFLYCTL0005: 在地址 %2$s 执行操作 %1$s 失败";
    }
    @Override
    protected String failedSubsystemBootOperations$str() {
        return "WFLYCTL0006: 执行子系统 %1$s 的引导操作失败";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYCTL0007: 关闭资源 %1$s 失败";
    }
    @Override
    protected String failedToPersistConfigurationChange0$str() {
        return "WFLYCTL0008: 持久配置更改失败";
    }
    @Override
    protected String failedToStoreConfiguration$str() {
        return "WFLYCTL0009: 将配置保存到 %1$s 失败";
    }
    @Override
    protected String invalidSystemPropertyValue$str() {
        return "WFLYCTL0010: 系统属性 %2$s 的无效值 %1$s -- 使用默认值 [%3$d]";
    }
    @Override
    protected String invalidWildcardAddress$str() {
        return "WFLYCTL0011: 地址 %1$s 是通配符地址，它不与具体地址匹配。不要使用 '%2$s' 配置元素指定使用通配符地址的接口，请使用 '%3$s'";
    }
    @Override
    protected String operationFailed2$str() {
        return "WFLYCTL0013: 操作（%1$s）失败 - 地址：（%2$s）";
    }
    @Override
    protected String operationFailed3$str() {
        return "WFLYCTL0013: 操作（%1$s）失败 - 地址：（%2$s）-- 故障描述：%3$s";
    }
    @Override
    protected String operationFailed4$str() {
        return "WFLYCTL0013: 操作(%1$s) 失败 - 地址: (%2$s)- 故障描述: %3$s%4$s";
    }
    @Override
    protected String wildcardAddressDetected$str() {
        return "WFLYCTL0015: 探测到通配符地址 -- 将忽略其他接口标准。";
    }
    @Override
    protected String noFinalProxyOutcomeReceived$str() {
        return "WFLYCTL0016: 没有收到地址 %3$s 上远程进程在地址 %2$s 的操作 %1$s 最终结果的响应。这个操作的结果只包含远程进程对该请求的预响应。";
    }
    @Override
    protected String operationFailedOnClientError$str() {
        return "WFLYCTL0017: 操作（%1$s）失败 - 地址：（%2$s）-- 故障描述：%3$s";
    }
    @Override
    protected String gracefulManagementChannelHandlerShutdownTimedOut$str() {
        return "WFLYCTL0019: 平滑关闭用于原生管理请求的处理程序没有在 [%1$d] 毫秒内完成，但底层通讯频道的关闭正在进行";
    }
    @Override
    protected String gracefulManagementChannelHandlerShutdownFailed$str() {
        return "WFLYCTL0020: 平滑关闭用于原生管理请求的处理程序失败，但底层通讯频道的关闭正在进行";
    }
    @Override
    protected String invalidChannelCloseTimeout$str() {
        return "WFLYCTL0021: 系统属性 '%2$s' 的无效值 '%1$s' - 值必须转换为整型";
    }
    @Override
    protected String multipleMatchingAddresses5$str() {
        return "WFLYCTL0022: 对于接口 '%1$s'，有多个地址或网络接口符合选择标准。匹配的地址：%2$s。匹配的网络接口：%3$s。这个接口将使用地址 %4$s 和网络接口 %5$s。";
    }
    @Override
    protected String multipleMatchingAddresses3$str() {
        return "WFLYCTL0023: 接口选择标准 'inet-address' 的值 ‘%1$s' 有歧义，机器上有多个与其匹配的地址或网络接口。因此，没有地址将被选为匹配结果。匹配地址：%2$s。匹配网络接口：%3$s。";
    }
    @Override
    protected String cannotReadTargetDefinition$str() {
        return "WFLYCTL0024: 无法读取目标定义！";
    }
    @Override
    protected String interruptedWaitingStability$str() {
        return "WFLYCTL0027: 在服务容器达到稳定前操作被中断。进程应该重启。首先更新服务容器的步骤是地址 '%2$s' 上的 '%1$s'";
    }
    @Override
    protected String attributeDeprecated$str() {
        return "WFLYCTL0028: 地址 '%2$s' 上的资源里的属性 '%1$s' 已被弃用，以后的版本可能会删除它。更多详情请参考 read-resource-description 操作的输出中的属性描述。";
    }
    @Override
    protected String cannotDeleteTempFile$str() {
        return "WFLYCTL0029: 无法删除临时文件 %1$s，将在退出时删除";
    }
    @Override
    protected String noSuchResourceType$str() {
        return "WFLYCTL0030: 在地址 %1$s 上没有注册资源定义";
    }
    @Override
    protected String noHandlerForOperation$str() {
        return "WFLYCTL0031: 地址 %2$s 上不存在名为 '%1$s' 的操作";
    }
    @Override
    protected String transformationWarnings$str() {
        return "WFLYCTL0032: 转换过程中出现问题的目标主机：'%1$s' %n找到问题：%n%2$s";
    }
    @Override
    protected String extensionDeprecated$str() {
        return "WFLYCTL0033: 扩展 %1$s 已被弃用，以后版本里可能也不被支持";
    }
    @Override
    protected String ignoringUnsupportedLegacyExtension$str() {
        return "WFLYCTL0034: 运行这个版本的服务器已不支持旧的扩展 '%2$s' 提供的子系统 %1$s。只有混合版本受管域里运行之前版本的主机支持这个扩展。在这个服务器上，这个扩展不会注册任何子系统，之后试图在这个服务器上创建子系统资源或对其寻址都会失败。";
    }
    @Override
    protected String failedToUpdateAuditLog$str() {
        return "WFLYCTL0035: 管理操作审计日志的更新失败";
    }
    @Override
    protected String disablingLoggingDueToFailures$str() {
        return "WFLYCTL0036: [%1$d] 次连续的管理操作审计日志失败已经发生；禁用审计日志";
    }
    @Override
    protected String logHandlerWriteFailed$str() {
        return "WFLYCTL0037: 处理程序 '%1$s' 的管理操作审计日志的更新失败";
    }
    @Override
    protected String disablingLogHandlerDueToFailures$str() {
        return "WFLYCTL0038: 处理程序 '%2$s' 里已发生 [%1$d] 次连续的管理操作审计日志失败；禁用这个处理程序的审计日志";
    }
    @Override
    protected String alreadyDefined$str() {
        return "WFLYCTL0039: 已定义 %1$s";
    }
    @Override
    protected String alreadyDeclared4$str() {
        return "WFLYCTL0041: %1$s %2$s 已在 %3$s %4$s 中声明";
    }
    @Override
    protected String alreadyDeclared5$str() {
        return "WFLYCTL0042: %1$s 或 %2$s %3$s 已在 %4$s %5$s 中声明";
    }
    @Override
    protected String alreadyRegistered$str() {
        return "WFLYCTL0043: 已在位置 '%3$s' 注册了名为 '%2$s' 的 %1$s";
    }
    @Override
    protected String ambiguousConfigurationFiles$str() {
        return "WFLYCTL0044: 模糊的配置文件名 '%1$s'。%2$s 中多个以 %3$s 结束的文件";
    }
    @Override
    protected String ambiguousName$str() {
        return "WFLYCTL0045: %2$s 中模糊的名称 '%1$s' : %3$s";
    }
    @Override
    protected String attributeNotWritable$str() {
        return "WFLYCTL0048: 属性 %1$s 不可写入";
    }
    @Override
    protected String cannotDetermineDefaultName$str() {
        return "WFLYCTL0050: 无法根据本地主机名确定默认名称";
    }
    @Override
    protected String cannotCreate$str() {
        return "WFLYCTL0051: 无法生成 %1$s";
    }
    @Override
    protected String cannotDelete$str() {
        return "WFLYCTL0052: 无法删除 %1$s";
    }
    @Override
    protected String cannotRegisterSubmodelWithNullPath$str() {
        return "WFLYCTL0053: 无法注册使用空 PathElement 的子型号";
    }
    @Override
    protected String cannotRemove$str() {
        return "WFLYCTL0055: 无法删除 %1$s";
    }
    @Override
    protected String cannotRename$str() {
        return "WFLYCTL0056: 无法将 %1$s 重新命名为 %2$s";
    }
    @Override
    protected String cannotWriteTo$str() {
        return "WFLYCTL0057: 无法写入 %1$s";
    }
    @Override
    protected String childAlreadyDeclared$str() {
        return "WFLYCTL0058: 元素 %2$s 的子 %1$s 已声明";
    }
    @Override
    protected String canonicalBootFileNotFound$str() {
        return "WFLYCTL0059: 无法为 boot 文件获得规范文件：%1$s";
    }
    @Override
    protected String canonicalMainFileNotFound$str() {
        return "WFLYCTL0060: 无法为 main 文件获得规范文件：%1$s";
    }
    @Override
    protected String compositeOperationFailed$str() {
        return "WFLYCTL0062: Composite 操作失败且已经回滚。失败的步骤是：";
    }
    @Override
    protected String compositeOperationRolledBack$str() {
        return "WFLYCTL0063: Composite 操作已回滚";
    }
    @Override
    protected String configurationFileNameNotAllowed$str() {
        return "WFLYCTL0064: 不允许完整名称为 %1$s 的配置文件";
    }
    @Override
    protected String configurationFileNotFound$str() {
        return "WFLYCTL0065: 在 %2$s 里未找到以 %1$s 结尾的配置文件";
    }
    @Override
    protected String directoryNotFound$str() {
        return "WFLYCTL0066: 未找到目录 %1$s";
    }
    @Override
    protected String domainControllerMustBeDeclared$str() {
        return "WFLYCTL0067: 必须声明 %1$s 或 %2$s 域控制器。";
    }
    @Override
    protected String duplicateAttribute$str() {
        return "WFLYCTL0068: 已经声明了名为 '%1$s' 的属性";
    }
    @Override
    protected String duplicateDeclaration1$str() {
        return "WFLYCTL0069: 重复的 %1$s 声明";
    }
    @Override
    protected String duplicateDeclaration2$str() {
        return "WFLYCTL0070: 重复的 %1$s 声明 %2$s";
    }
    @Override
    protected String duplicateElement$str() {
        return "WFLYCTL0071: 发现重复的路径元素 '%1$s'";
    }
    @Override
    protected String duplicateInterfaceDeclaration$str() {
        return "WFLYCTL0072: 重复的接口声明";
    }
    @Override
    protected String duplicateNamedElement$str() {
        return "WFLYCTL0073: 已经声明了这个类型的元素 '%1$s'";
    }
    @Override
    protected String duplicateResource$str() {
        return "WFLYCTL0075: 重复的资源 %1$s";
    }
    @Override
    protected String duplicateResourceType$str() {
        return "WFLYCTL0076: 重复的资源类型 %1$s";
    }
    @Override
    protected String failedInitializingModule$str() {
        return "WFLYCTL0079: 初始化模块 %1$s 失败";
    }
    @Override
    protected String failedServices$str() {
        return "WFLYCTL0080: 失败的服务";
    }
    @Override
    protected String failedToBackup$str() {
        return "WFLYCTL0081: 备份%1$s 失败";
    }
    @Override
    protected String failedToCreateConfigurationBackup$str() {
        return "WFLYCTL0082: 创建配置文件 %1$s 的备份失败";
    }
    @Override
    protected String failedToLoadModule0$str() {
        return "WFLYCTL0083: 加载模块失败";
    }
    @Override
    protected String failedToLoadModule1$str() {
        return "WFLYCTL0083: 加载模块 '%1$s' 失败";
    }
    @Override
    protected String failedToMarshalConfiguration$str() {
        return "WFLYCTL0084: 对配置解码失败";
    }
    @Override
    protected String failedToParseConfiguration$str() {
        return "WFLYCTL0085: 解析配置失败";
    }
    @Override
    protected String failedToPersistConfigurationChange1$str() {
        return "WFLYCTL0086: 持久化配置修改 %1$s 失败";
    }
    @Override
    protected String failedToTakeSnapshot$str() {
        return "WFLYCTL0088: 获得 %1$s 的快照到 %2$s 失败";
    }
    @Override
    protected String failedToWriteConfiguration$str() {
        return "WFLYCTL0089: 写入配置文件失败";
    }
    @Override
    protected String fileNotFound$str() {
        return "WFLYCTL0090: %1$s 不存在";
    }
    @Override
    protected String fileNotFoundWithPrefix$str() {
        return "WFLYCTL0091: 在 '%2$s' 里没有找到以 %1$s 开头的文件";
    }
    @Override
    protected String fullServerBootRequired$str() {
        return "WFLYCTL0092: 除了在完整的服务器启动时，否则无法使用 %1$s";
    }
    @Override
    protected String illegalInterfaceCriteria$str() {
        return "WFLYCTL0094: 非法的接口标准类型 %1$s；它必须为 %2$s";
    }
    @Override
    protected String illegalValueForInterfaceCriteria$str() {
        return "WFLYCTL0095: 接口标准 %2$s 的非法值 %1$s；它必须为 %3$s";
    }
    @Override
    protected String immutableResource$str() {
        return "WFLYCTL0096: 资源是不可改变的";
    }
    @Override
    protected String incorrectType$str() {
        return "WFLYCTL0097: '%1$s'的错误类型。期望是 %2$s ，但却是 %3$s";
    }
    @Override
    protected String invalid1$str() {
        return "WFLYCTL0099: %1$s 是无效的";
    }
    @Override
    protected String invalid2$str() {
        return "WFLYCTL0100: %1$d 不是有效的 %2$s";
    }
    @Override
    protected String invalidAddress$str() {
        return "WFLYCTL0101: 无效的地址 %1$s (%2$s)";
    }
    @Override
    protected String invalidAddressMaskValue$str() {
        return "WFLYCTL0102: 无效‘值’ %1$s - 必须是地址/掩码的形式";
    }
    @Override
    protected String invalidAddressMask$str() {
        return "WFLYCTL0103: 无效掩码 %1$s(%2$s)";
    }
    @Override
    protected String invalidAddressValue$str() {
        return "WFLYCTL0104: 无效的地址 %1$s (%2$s)";
    }
    @Override
    protected String invalidAttributeCombo$str() {
        return "WFLYCTL0105: %1$s 和 %2$s 组合是无效的";
    }
    @Override
    protected String invalidAttributeValue2$str() {
        return "WFLYCTL0106: 属性 '%2$s' 的无效值 '%1$s'";
    }
    @Override
    protected String invalidInterfaceCriteriaPattern$str() {
        return "WFLYCTL0109: 接口标准 %2$s 的无效模式 %1$s";
    }
    @Override
    protected String invalidPathElementKey$str() {
        return "WFLYCTL0110: 无效的资源地址元素 '%1$s'。对于资源地址里的元素来说，键 '%2$s' 是无效的。";
    }
    @Override
    protected String invalidLoadFactor$str() {
        return "WFLYCTL0111: 载入系数必须大于 0，且小于等于 1";
    }
    @Override
    protected String invalidMaxLength$str() {
        return "WFLYCTL0112: '%1$s' 是参数 %2$s 的无效值。这个值的长度最大为 %3$d 个字符";
    }
    @Override
    protected String invalidMinLength$str() {
        return "WFLYCTL0113: '%1$s' 是参数 %2$s 的无效值。这个值的长度最小为 %3$d 个字符";
    }
    @Override
    protected String invalidMaxSize$str() {
        return "WFLYCTL0114: [%1$d] 是参数 %2$s 的无效大小。它要求最长为 [%3$d]";
    }
    @Override
    protected String invalidMinSize$str() {
        return "WFLYCTL0115: [%1$d] 是参数 %2$s 的无效大小。它要求最短为 [%3$d]";
    }
    @Override
    protected String invalidMaxValue$str() {
        return "WFLYCTL0116: %1$d 是参数 %2$s 的无效值。它要求最长为 %3$d";
    }
    @Override
    protected String invalidMinValue$str() {
        return "WFLYCTL0117: %1$d 是参数 %2$s 的无效值。它要求最短为 %3$d";
    }
    @Override
    protected String invalidModificationAfterCompletedStep$str() {
        return "WFLYCTL0118: 完成步骤后的无效修改";
    }
    @Override
    protected String invalidMulticastAddress$str() {
        return "WFLYCTL0119: 属性 %2$s 的值 %1$s 不是一个有效的多点传送地址";
    }
    @Override
    protected String invalidOutboundSocketBinding$str() {
        return "WFLYCTL0120: 出站套接字绑定：%1$s 无法同时既有 %2$s 又有 %3$s";
    }
    @Override
    protected String invalidParameterValue$str() {
        return "WFLYCTL0121: %1$s 不是参数 %2$s 的一个有效值 - 必须是 %3$s 中的一个";
    }
    @Override
    protected String invalidSha1Value$str() {
        return "WFLYCTL0122: 属性 %2$s 的值 %1$s 不代表正确的 hex 编码的 SHA1 hash";
    }
    @Override
    protected String invalidStage$str() {
        return "WFLYCTL0123: 阶段 %1$s 对于上下文进程类型 %2$s 是无效的";
    }
    @Override
    protected String invalidStepStage$str() {
        return "WFLYCTL0124: 指定的无效步骤阶段";
    }
    @Override
    protected String invalidTableSize$str() {
        return "WFLYCTL0126: 不能使用负数大小表格！";
    }
    @Override
    protected String invalidType$str() {
        return "WFLYCTL0127: 无效类型 %1$s";
    }
    @Override
    protected String invalidPathElementValue$str() {
        return "WFLYCTL0128: 无效资源地址元素 '%1$s'。对于资源地址里的元素，这个值 '%2$s' 是无效的。字符 '%3$s' 是不被允许的。";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYCTL0129: %2$s 的无效值 %1$s；合法值是 %3$s";
    }
    @Override
    protected String missingOneOf$str() {
        return "WFLYCTL0132: 必须包括下列元素 %1$s 之一";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYCTL0133: 缺少必需属性：%1$s";
    }
    @Override
    protected String missingRequiredElements$str() {
        return "WFLYCTL0134: 缺少必需元素：%1$s";
    }
    @Override
    protected String moduleLoadingInterrupted$str() {
        return "WFLYCTL0135: 等待加载模块 %1$s 时被打断";
    }
    @Override
    protected String moduleInitializationInterrupted$str() {
        return "WFLYCTL0136: 等待初始化模块 %1$s 时被打断";
    }
    @Override
    protected String multipleModelNodes$str() {
        return "WFLYCTL0137: 模型包含多个 %1$s 节点";
    }
    @Override
    protected String namespaceAlreadyRegistered$str() {
        return "WFLYCTL0138: 带有前缀 %1$s 的命名空间已经注册了语义 URI %2$s";
    }
    @Override
    protected String namespaceNotFound$str() {
        return "WFLYCTL0139: 未找到带有 URI %1$s 的命名空间";
    }
    @Override
    protected String nestedElementNotAllowed$str() {
        return "WFLYCTL0140: 不允许嵌套的 %1$s";
    }
    @Override
    protected String noActiveStep$str() {
        return "WFLYCTL0144: 没有活动步骤";
    }
    @Override
    protected String noChildType$str() {
        return "WFLYCTL0147: 没有子类型 %1$s";
    }
    @Override
    protected String noInterfaceCriteria$str() {
        return "WFLYCTL0149: 没有提供接口标准";
    }
    @Override
    protected String noOperationHandler0$str() {
        return "WFLYCTL0150: 没有操作处理程序";
    }
    @Override
    protected String notADirectory$str() {
        return "WFLYCTL0152: %1$s 不是一个目录";
    }
    @Override
    protected String notFound$str() {
        return "WFLYCTL0153: 未找到 %3$s 的 %1$s%2$s";
    }
    @Override
    protected String nullAsynchronousExecutor$str() {
        return "WFLYCTL0154: 无法执行不带有 executor 的异步操作";
    }
    @Override
    protected String nullNotAllowed$str() {
        return "WFLYCTL0155: '%1$s' 可能不为空";
    }
    @Override
    protected String operation$str() {
        return "操作 %1$s";
    }
    @Override
    protected String operationAlreadyComplete$str() {
        return "WFLYCTL0157: 操作已经完成";
    }
    @Override
    protected String operationHandlerFailed$str() {
        return "WFLYCTL0158: 操作处理程序失败：%1$s";
    }
    @Override
    protected String operationRollingBack$str() {
        return "WFLYCTL0160: 操作回滚";
    }
    @Override
    protected String operationSucceeded$str() {
        return "WFLYCTL0161: 操作成功，提交中";
    }
    @Override
    protected String operationNotRegistered$str() {
        return "WFLYCTL0162: 在地址 %2$s 上没有注册操作 %1$s";
    }
    @Override
    protected String persisterNotInjected$str() {
        return "WFLYCTL0165: 没有注入配置 persister";
    }
    @Override
    protected String proxyHandlerAlreadyRegistered$str() {
        return "WFLYCTL0169: 代理处理程序已经在位置 '%1$s' 处注册";
    }
    @Override
    protected String removingServiceUnsatisfiedDependencies0$str() {
        return "WFLYCTL0171: 删除服务已经导致无法满足的依赖关系：";
    }
    @Override
    protected String removingServiceUnsatisfiedDependencies1$str() {
        return "%n服务%1$s 依赖于 ";
    }
    @Override
    protected String required$str() {
        return "WFLYCTL0172: %1$s 是必需的";
    }
    @Override
    protected String reserved$str() {
        return "WFLYCTL0173: %1$s 是保留的";
    }
    @Override
    protected String resourceNotFound$str() {
        return "WFLYCTL0175: 资源 %1$s 不存在，地址 %2$s 处的资源无法创建，直至添加了所有以前的资源";
    }
    @Override
    protected String rollbackAlreadyInvoked$str() {
        return "WFLYCTL0176: 已经调用了 rollback()";
    }
    @Override
    protected String schemaAlreadyRegistered$str() {
        return "WFLYCTL0177: 带有 URI %1$s 的语义已经在位置 %2$s 注册";
    }
    @Override
    protected String schemaNotFound$str() {
        return "WFLYCTL0178: 未找到带有 URI %1$s 的语义";
    }
    @Override
    protected String serviceInstallCancelled$str() {
        return "WFLYCTL0179: 取消了服务的安装";
    }
    @Override
    protected String servicesMissing$str() {
        return "缺少 [%1$s]";
    }
    @Override
    protected String servicesMissingDependencies$str() {
        return "WFLYCTL0180: 具有丢失/不可用依赖关系的服务";
    }
    @Override
    protected String serviceRegistryRuntimeOperationsOnly$str() {
        return "WFLYCTL0181: 获得只有运行时操作支持的服务注册表";
    }
    @Override
    protected String serviceRemovalRuntimeOperationsOnly$str() {
        return "WFLYCTL0182: 删除只有运行时操作支持的服务";
    }
    @Override
    protected String serviceStatusReportHeader$str() {
        return "WFLYCTL0183: 服务状态报告%n";
    }
    @Override
    protected String serviceStatusReportDependencies$str() {
        return "WFLYCTL0184: 新的缺失的/未满足的依赖关系：%n";
    }
    @Override
    protected String serviceStatusReportMissing$str() {
        return "%1$s（缺失的）依赖关系: %2$s %n";
    }
    @Override
    protected String serviceStatusReportCorrected$str() {
        return "WFLYCTL0185: 最近纠正的服务：%n";
    }
    @Override
    protected String serviceStatusReportNoLongerRequired$str() {
        return "%1$s（不再需要）%n";
    }
    @Override
    protected String serviceStatusReportAvailable$str() {
        return "%1$s（新提供的）%n";
    }
    @Override
    protected String serviceStatusReportFailed$str() {
        return "WFLYCTL0186: 启动失败的服务：";
    }
    @Override
    protected String serviceTargetRuntimeOperationsOnly$str() {
        return "WFLYCTL0187: 获得只有运行时操作支持的服务目标";
    }
    @Override
    protected String stageAlreadyComplete$str() {
        return "WFLYCTL0188: 阶段 %1$s 已经完成";
    }
    @Override
    protected String stepHandlerFailed$str() {
        return "WFLYCTL0190: 地址 %3$s 处操作 %2$s 的步骤处理程序 %1$s 失败 -- %4$s";
    }
    @Override
    protected String subsystemBootInterrupted$str() {
        return "WFLYCTL0191: 等待子系统引导操作执行时被中断";
    }
    @Override
    protected String subsystemBootOperationFailed$str() {
        return "WFLYCTL0192: 子系统 %1$s 的引导操作失败且没有任何解释";
    }
    @Override
    protected String subsystemBootOperationFailedExecuting$str() {
        return "WFLYCTL0193: 执行子系统 %1$s 的引导操作失败";
    }
    @Override
    protected String tableIsFull$str() {
        return "WFLYCTL0194: 表格已满！";
    }
    @Override
    protected String transactionInterrupted$str() {
        return "WFLYCTL0195: 中断了等待事务提交或回滚";
    }
    @Override
    protected String unexpectedAttribute1$str() {
        return "WFLYCTL0197: 遇到意外的属性 '%1$s'";
    }
    @Override
    protected String unexpectedElement1$str() {
        return "WFLYCTL0198: 遇到意外的元素 '%1$s'";
    }
    @Override
    protected String unexpectedEndElement$str() {
        return "WFLYCTL0199: 遇到意外的元素 '%1$s' 的结尾";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYCTL0201: 未知的属性 '%1$s'";
    }
    @Override
    protected String unknownChildType$str() {
        return "WFLYCTL0202: 未知的子类型 %1$s";
    }
    @Override
    protected String unknownCriteriaInterfaceProperty$str() {
        return "WFLYCTL0203: 接口标准列表里的未知属性：%1$s";
    }
    @Override
    protected String unknownCriteriaInterfaceType$str() {
        return "WFLYCTL0204: 未知的接口标准类型 %1$s";
    }
    @Override
    protected String unknownInterface$str() {
        return "WFLYCTL0205: 未知的接口 %1$s %2$s 必须在元素 %3$s 里声明";
    }
    @Override
    protected String unknownValueForElement$str() {
        return "WFLYCTL0206: 未知的接口 %1$s %2$s %3$s 必须在元素 %4$s 里声明";
    }
    @Override
    protected String validationFailed$str() {
        return "WFLYCTL0207: 对 %1$s 的验证失败";
    }
    @Override
    protected String andNMore$str() {
        return "WFLYCTL0208: 以及 %1$s 个更多";
    }
    @Override
    protected String invalidAttributeValue3$str() {
        return "WFLYCTL0209: 属性 '%2$s' 的无效值 '%1$s' - 有效值是 %3$s";
    }
    @Override
    protected String noPermissionToResolveExpression$str() {
        return "WFLYCTL0210: 试图解析表达式 '%1$s' 时 -- %2$s 捕获 SecurityException";
    }
    @Override
    protected String cannotResolveExpression$str() {
        return "WFLYCTL0211: 无法解析表达式 '%1$s'";
    }
    @Override
    protected String duplicateResourceAddress$str() {
        return "WFLYCTL0212: 重复的资源 %1$s";
    }
    @Override
    protected String mainFileNotFound$str() {
        return "WFLYCTL0214: 无法加载配置文件: %1$s。配置文件参数必须指定配置目录中文件的路径。路径必须是相对路径，且必须相对于配置目录 %2$s。";
    }
    @Override
    protected String absolutePathMainFileNotFound$str() {
        return "WFLYCTL0215: 无法加载配置文件：%1$s。配置文件参数必须指定以下之一：1）现有文件的绝对路径; 2）现有文件的相对路径，相对于当前的工作目录；或 3) 配置目录中文件的相对路径。在最后一种情况中，它必须是配置目录的相对路径 %2$s。";
    }
    @Override
    protected String managementResourceNotFound$str() {
        return "WFLYCTL0216: 没有找到管理资源 '%1$s'";
    }
    @Override
    protected String childResourceNotFound$str() {
        return "WFLYCTL0217: 未找到子资源 '%1$s'";
    }
    @Override
    protected String nodeAlreadyRegistered$str() {
        return "WFLYCTL0218: 节点已注册在 '%1$s'";
    }
    @Override
    protected String removingExtensionWithRegisteredSubsystem$str() {
        return "WFLYCTL0219: 试图取消子系统 %2$s 仍然注册了的扩展 %1$s 的注册";
    }
    @Override
    protected String cannotOverrideRootRegistration$str() {
        return "WFLYCTL0220: 对于根模型注册，不允许覆盖模型（Override Model）注册";
    }
    @Override
    protected String cannotOverrideNonWildCardRegistration$str() {
        return "WFLYCTL0221: 对于非通配符模型注册，不允许覆盖模型注册。这个注册用于非通配符名称 '%1$s'。";
    }
    @Override
    protected String wildcardRegistrationIsNotAnOverride$str() {
        return "WFLYCTL0222: 名为 '*' 的注册不是一个覆盖模型，且无法通过 unregisterOverrideModel API 取消注册。";
    }
    @Override
    protected String rootRegistrationIsNotOverridable$str() {
        return "WFLYCTL0223: 根资源注册不支持覆盖，所以不可以删除覆盖。";
    }
    @Override
    protected String operationNotRegisteredException$str() {
        return "WFLYCTL0224: 在地址 %2$s 上没有注册操作 %1$s";
    }
    @Override
    protected String failedToRecoverServices$str() {
        return "WFLYCTL0225: 在操作回滚期间恢复服务失败";
    }
    @Override
    protected String duplicateSubsystem$str() {
        return "WFLYCTL0226: 名为 '%1$s' 的子系统无法用扩展 '%2$s' 注册 - 具有该名称的子系统已经能够通过扩展 '%3$s' 注册了。";
    }
    @Override
    protected String validationFailedOperationHasNoField$str() {
        return "WFLYCTL0227: 操作没有 '%1$s' 字段。%2$s";
    }
    @Override
    protected String validationFailedOperationHasANullOrEmptyName$str() {
        return "WFLYCTL0228: 操作具有 null 或空的名称。%1$s";
    }
    @Override
    protected String validationFailedNoOperationFound$str() {
        return "WFLYCTL0229: %2$s 中没有名为 '%1$s' 的操作。%3$s";
    }
    @Override
    protected String validationFailedActualParameterNotDescribed$str() {
        return "WFLYCTL0230: 操作包括一个参数 '%1$s'，它不是期望的参数 %2$s 之一。%3$s";
    }
    @Override
    protected String validationFailedRequiredParameterNotPresent$str() {
        return "WFLYCTL0231: 必需的参数 %1$s 不存在。%2$s";
    }
    @Override
    protected String validationFailedRequiredParameterPresentAsWellAsAlternative$str() {
        return "WFLYCTL0232: 使用了必需参数 '%2$s' 的替代参数 '%1$s'。请使用其中一个或其他参数。%3$s";
    }
    @Override
    protected String validationFailedCouldNotConvertParamToType$str() {
        return "WFLYCTL0233: 无法将参数 '%1$s' 转换为 %2$s。%3$s";
    }
    @Override
    protected String validationFailedValueIsSmallerThanMin$str() {
        return "WFLYCTL0234: 传入 '%2$s' 的值 '%1$s' 比最小值 '%3$s' 更小。%4$s";
    }
    @Override
    protected String validationFailedValueIsGreaterThanMax$str() {
        return "WFLYCTL0235: 传入 '%2$s' 的值 '%1$s' 比最大值 '%3$s' 更大。%4$s";
    }
    @Override
    protected String validationFailedValueIsShorterThanMinLength$str() {
        return "WFLYCTL0236: 传入 '%2$s' 的值 '%1$s' 比最小长度 '%3$s' 更短。%4$s";
    }
    @Override
    protected String validationFailedValueIsLongerThanMaxLength$str() {
        return "WFLYCTL0237: 为 '%2$s' 传入的值 '%1$s' 比最大长度 '%3$s' 长。%4$s";
    }
    @Override
    protected String validationFailedInvalidElementType$str() {
        return "WFLYCTL0238: %1$s 预期为 %2$s 的一个列表。%3$s";
    }
    @Override
    protected String invalidDescriptionRequiredFlagIsNotABoolean$str() {
        return "WFLYCTL0239: 必需的参数：'%1$s' 必须是 %2$s: %3$s 处操作的描述里的一个布尔值";
    }
    @Override
    protected String invalidDescriptionUndefinedRequestProperty$str() {
        return "WFLYCTL0240: %2$s: %3$s 处操作描述里未定义的请求属性 '%1$s'";
    }
    @Override
    protected String invalidDescriptionNoParamTypeInDescription$str() {
        return "WFLYCTL0241: 在 %2$s: %3$s 处操作的描述里的参数 '%1$s' 没有类型";
    }
    @Override
    protected String invalidDescriptionInvalidParamTypeInDescription$str() {
        return "WFLYCTL0242: 无法确定 %2$s: %3$s 处操作的描述里的参数 '%1$s' 的类型";
    }
    @Override
    protected String invalidDescriptionMinMaxForParameterHasWrongType$str() {
        return "WFLYCTL0243: '%2$s' 参数的属性 '%1$s' 不能转换为其在 %4$s：%5$s 处的操作描述中的类型 %3$s";
    }
    @Override
    protected String invalidDescriptionMinMaxLengthForParameterHasWrongType$str() {
        return "WFLYCTL0244: 参数 '%2$s' 的属性 '%1$s' 无法转换为 %3$s 上的操作的描述里的整型：%4$s";
    }
    @Override
    protected String invalidPort$str() {
        return "WFLYCTL0245: 非法的 '%1$s' 值 %2$s -- 必须为有效的端口号码";
    }
    @Override
    protected String cannotResolveProcessUUID$str() {
        return "WFLYCTL0246: 无法解析 localhost 地址已创建这个进程的基于 UUID 的名称";
    }
    @Override
    protected String useOperationContextRemoveService$str() {
        return "WFLYCTL0247: 没有调用 ServiceController.setMode(REMOVE)，而是要了 OperationContext.removeService()。";
    }
    @Override
    protected String invalidEnumValue$str() {
        return "WFLYCTL0248: %2$s 的无效值 %1$s；合法值是 %3$s";
    }
    @Override
    protected String modelUpdateNotAuthorized$str() {
        return "WFLYCTL0249: 用户直接调用了目标资源为 '%2$s' 的操作 '%1$s'。用户操作是不被允许直接更新受管域里服务器的持久性配置的。";
    }
    @Override
    protected String serverResultsAccessNotAllowed$str() {
        return "WFLYCTL0250: 操作处理程序试图访问操作响应服务器的不是 '%1$s' 的进程类型上的结果对象。当前进程的类型是 '%2$s'";
    }
    @Override
    protected String cantHaveBothLoopbackAndInetAddressCriteria$str() {
        return "WFLYCTL0251: 不能同时具有 loopback 和 inet-address 标准";
    }
    @Override
    protected String cantHaveSameCriteriaForBothNotAndInclusion$str() {
        return "WFLYCTL0253: 不包含和包含 %1$s 不能具有相同的标准";
    }
    @Override
    protected String nonexistentInterface$str() {
        return "WFLYCTL0254: 属性 '%2$s' 的无效值 '%1$s' -- 不存在具有这个名字的接口配置";
    }
    @Override
    protected String pathEntryNotFound$str() {
        return "WFLYCTL0256: 无法找到名为 '%1$s' 的路径";
    }
    @Override
    protected String pathEntryIsReadOnly$str() {
        return "WFLYCTL0257: 路径条目是只读的: '%1$s'";
    }
    @Override
    protected String pathEntryAlreadyExists$str() {
        return "WFLYCTL0258: 已经有名为 '%1$s' 的路径条目";
    }
    @Override
    protected String invalidRelativePathValue$str() {
        return "WFLYCTL0260: 无效的 relativePath 值 '%1$s'";
    }
    @Override
    protected String pathIsAWindowsAbsolutePath$str() {
        return "WFLYCTL0261: '%1$s' 是一个 Windows 里的绝对路径";
    }
    @Override
    protected String cannotRemoveReadOnlyPath$str() {
        return "WFLYCTL0262: 路径 '%1$s' 是只读的，它不能被删除";
    }
    @Override
    protected String cannotModifyReadOnlyPath$str() {
        return "WFLYCTL0263: 路径 '%1$s' 是只读的，它不能被修改";
    }
    @Override
    protected String expressionNotAllowed$str() {
        return "WFLYCTL0264: %1$s 不能是 ModelType.EXPRESSION";
    }
    @Override
    protected String pathManagerNotAvailable$str() {
        return "WFLYCTL0265: 处理类型 '%1$s' 上的 PathManager 不可用";
    }
    @Override
    protected String unknownMulticastAddress$str() {
        return "WFLYCTL0266: 属性 %2$s 的值 %1$s 不是一个有效的多点传送地址";
    }
    @Override
    protected String cannotRemovePathWithDependencies$str() {
        return "WFLYCTL0267: 路径 '%1$s' 不能被删除，因为下列路径依赖它：%2$s";
    }
    @Override
    protected String failedToRenameTempFile$str() {
        return "WFLYCTL0268: 无法将临时文件 %1$s 重命名为 %2$s";
    }
    @Override
    protected String invalidLocaleString$str() {
        return "WFLYCTL0269: 无效的区域格式：%1$s";
    }
    @Override
    protected String operationCancelled$str() {
        return "WFLYCTL0271: 操作被取消";
    }
    @Override
    protected String operationCancelledAsynchronously$str() {
        return "WFLYCTL0272: 操作异步地取消";
    }
    @Override
    protected String streamWasKilled$str() {
        return "WFLYCTL0273: 流被终止";
    }
    @Override
    protected String streamWasClosed$str() {
        return "WFLYCTL0274: 流已被关闭";
    }
    @Override
    protected String cannotHaveBothParameters$str() {
        return "WFLYCTL0275: 不能既定义 '%1$s' 又定义 '%2$s'";
    }
    @Override
    protected String couldNotDeleteFile$str() {
        return "WFLYCTL0276: 删除文件 %1$s 失败";
    }
    @Override
    protected String aliasAlreadyRegistered$str() {
        return "WFLYCTL0277: 别名已经在位置 '%1$s' 注册";
    }
    @Override
    protected String aliasTargetResourceRegistrationNotFound$str() {
        return "WFLYCTL0279: 没有找到别名目标地址 %1$s";
    }
    @Override
    protected String aliasStepHandlerOperationNotFound$str() {
        return "WFLYCTL0280: 映射到 '%3$s' 的别名地址 '%2$s' 上没有名为 ‘%1$s' 的操作";
    }
    @Override
    protected String resourceRegistrationIsNotAnAlias$str() {
        return "WFLYCTL0281: 资源注册不是一个别名";
    }
    @Override
    protected String modelFieldsNotKnown$str() {
        return "WFLYCTL0282: 模型包含未知定义的字段，字段：%1$s，路径：%2$s";
    }
    @Override
    protected String couldNotMarshalAttributeAsElement$str() {
        return "WFLYCTL0283: 无法将属性整理为元素 %1$s";
    }
    @Override
    protected String couldNotMarshalAttributeAsAttribute$str() {
        return "WFLYCTL0284: 无法将属性整理为属性 %1$s";
    }
    @Override
    protected String wildcardOperationFailedAtSingleAddress$str() {
        return "WFLYCTL0285: 针对多个目标地址调用的操作 %1$s 在地址 %2$s 上调用失败，描述为 %3$s";
    }
    @Override
    protected String wildcardOperationFailedAtSingleAddressWithComplexFailure$str() {
        return "WFLYCTL0286: 针对多个目标地址调用的操作 %1$s 在地址 %2$s 上调用失败。其细节请查看操作结果。";
    }
    @Override
    protected String wildcardOperationFailedAtMultipleAddresses$str() {
        return "WFLYCTL0287: 针对多个目标地址调用的操作 %1$s 在地址 %2$s 上调用失败。其细节请查看操作结果。";
    }
    @Override
    protected String missingTransitiveDependencyProblem$str() {
        return "WFLYCTL0288: 由于一个或多个间接的依赖关系不可用，一个或多个服务无法启动。";
    }
    @Override
    protected String missingTransitiveDependents$str() {
        return "无法启动的服务：";
    }
    @Override
    protected String missingTransitiveDependencies$str() {
        return "可能是原因的服务：";
    }
    @Override
    protected String noOperationEntry$str() {
        return "WFLYCTL0289: 在 '%2$s' 中没有注册名为 '%1$s' 的操作条目";
    }
    @Override
    protected String noOperationHandler2$str() {
        return "WFLYCTL0290: '%2$s' 上没有注册名为 ‘%1$s' 的操作处理程序";
    }
    @Override
    protected String noPathToResolve$str() {
        return "WFLYCTL0291: 在 %3$s 上没有注册的路径可以用 path 属性 '%1$s' 和/或 relative-to 属性 '%2$s' 来解析";
    }
    @Override
    protected String attributesDontSupportExpressions$str() {
        return "WFLYCTL0292: 属性不支持目标模型版本里的表达式且目标主机上将需要忽略这个资源。";
    }
    @Override
    protected String attributesAreNotUnderstoodAndMustBeIgnored0$str() {
        return "WFLYCTL0293: 目标模型版本不能理解属性且目标主机上将需要忽略这个资源。";
    }
    @Override
    protected String transformerLoggerCoreModelResourceTransformerAttributes$str() {
        return "WFLYCTL0294: 转换资源 %1$s 为核心模型版本 '%2$s' -- %3$s %4$s";
    }
    @Override
    protected String transformerLoggerCoreModelOperationTransformerAttributes$str() {
        return "WFLYCTL0295: 转换资源 %2$s 上的操作 %1$s 为核心模型版本 '%3$s' -- %4$s %5$s";
    }
    @Override
    protected String transformerLoggerSubsystemModelResourceTransformerAttributes$str() {
        return "WFLYCTL0296: 转换资源 %1$s 为子系统 '%2$s' 模型版本 '%3$s' -- %4$s %5$s";
    }
    @Override
    protected String transformerLoggerSubsystemModelOperationTransformerAttributes$str() {
        return "WFLYCTL0297: 转换资源 %2$s 上的操作 %1$s 为子系统 '%3$s' 模型版本 '%4$s' -- %5$s %6$s";
    }
    @Override
    protected String illegalUnresolvedModel$str() {
        return "WFLYCTL0298: 节点包含未解析的表达式 %1$s -- 要求已解析的模型";
    }
    @Override
    protected String rejectAttributesCoreModelResourceTransformer$str() {
        return "WFLYCTL0299: 为主机控制器 '%2$s' 把资源 %1$s 转换为内核模型版本 '%3$s' -- 其中一些属性有问题且这个资源将需要被忽略。问题的详情：%4$s";
    }
    @Override
    protected String rejectAttributesSubsystemModelResourceTransformer$str() {
        return "WFLYCTL0300: 为主机控制器 '%2$s' 把资源 %1$s 转换为子系统 '%3$s' 模型版本 '%4$s' -- 其中一些属性有问题且这个资源将需要被忽略。问题的详情：%5$s";
    }
    @Override
    protected String attributesDoNotSupportExpressions$str() {
        return "WFLYCTL0301: 下面的属性不支持表达式：%1$s";
    }
    @Override
    protected String attributeNames$str() {
        return "属性 %1$s";
    }
    @Override
    protected String attributesAreNotUnderstoodAndMustBeIgnored1$str() {
        return "WFLYCTL0302: 目标模型版本不能理解下列属性且目标主机上将需要忽略这个资源：%1$s";
    }
    @Override
    protected String rejectedResourceResourceTransformation$str() {
        return "WFLYCTL0303: 目标主机上的资源 %1$s 被忽略，它也需要在这个主机上被忽略";
    }
    @Override
    protected String rejectResourceOperationTransformation$str() {
        return "WFLYCTL0304: 目标主机上的 %1$1s 的操作 %2$s 被拒绝，它也需要在这个主机上被忽略";
    }
    @Override
    protected String discoveryOptionsMustBeDeclared$str() {
        return "WFLYCTL0305: 除非主机控制器以命令行选项 %1$s 启动，且 %2$s 属性没有设置为 %3$s，否则必须声明 %4$s 或者提供 %5$s 和 %6$s。";
    }
    @Override
    protected String readOnlyContext$str() {
        return "WFLYCTL0306: 只读上下文";
    }
    @Override
    protected String cannotGetControllerLock$str() {
        return "WFLYCTL0307: 我们试图从域控制器读取数据，该控制器当前正忙于执行另一组操作。这是一种临时情况，请重试";
    }
    @Override
    protected String unsupportedLegacyExtension$str() {
        return "WFLYCTL0309: 运行这个版本的服务器已不支持旧的扩展 '%1$s'。只有混合版本受管域里运行之前版本的主机支持这个扩展";
    }
    @Override
    protected String extensionModuleNotFound$str() {
        return "WFLYCTL0310: 未找到扩展模块 %1$s";
    }
    @Override
    protected String extensionModuleLoadingFailure$str() {
        return "WFLYCTL0311: 加载扩展模块 %1$s 失败";
    }
    @Override
    protected String noContextToDelegateTo$str() {
        return "WFLYCTL0312: 无法用 ID %1$s 代理任何上下文";
    }
    @Override
    protected String unauthorized$str() {
        return "WFLYCTL0313: 没有权限对资源 '%2$s' 执行操作 '%1$s' -- %3$s";
    }
    @Override
    protected String illegalMultipleRoles$str() {
        return "WFLYCTL0314: 不允许具有多重角色的用户";
    }
    @Override
    protected String noHandlerCalled$str() {
        return "WFLYCTL0317: 没有名为 '%1$s' 的处理程序";
    }
    @Override
    protected String operationContextIsNotAbstractOperationContext$str() {
        return "WFLYCTL0318: 这个操作的上下文不是 AbstractOperationContext";
    }
    @Override
    protected String handlerIsReferencedBy$str() {
        return "WFLYCTL0319: 这个处理程序被 %1$s 引用，所以无法删除";
    }
    @Override
    protected String resolvedFileDoesNotExistOrIsDirectory$str() {
        return "WFLYCTL0320: 解析的文件 %1$s 不存在或不是目录";
    }
    @Override
    protected String couldNotBackUp$str() {
        return "WFLYCTL0321: 无法将 '%1$s' 备份为 '%2$s'";
    }
    @Override
    protected String attemptToBothRemoveAndAddHandlerUpdateInstead$str() {
        return "WFLYCTL0322: 试图通过复合操作来添加和删除处理程序的引用 - 更新处理程序";
    }
    @Override
    protected String attemptToBothAddAndRemoveAndHandlerFromCompositeOperation$str() {
        return "WFLYCTL0323: 试图通过复合操作来添加和删除处理程序";
    }
    @Override
    protected String attemptToBothUpdateAndRemoveHandlerFromCompositeOperation$str() {
        return "WFLYCTL0324: 试图通过复合操作来更新和删除处理程序";
    }
    @Override
    protected String attemptToBothRemoveAndAddHandlerReferenceFromCompositeOperation$str() {
        return "WFLYCTL0325: 试图通过复合操作来添加和删除处理程序的引用";
    }
    @Override
    protected String unknownRole$str() {
        return "WFLYCTL0327: 未知的角色 '%1$s'";
    }
    @Override
    protected String cannotRemoveStandardRole$str() {
        return "WFLYCTL0328: 无法删除标准的角色 '%1$s'";
    }
    @Override
    protected String unknownBaseRole$str() {
        return "WFLYCTL0329: 未知的基础角色 '%1$s'";
    }
    @Override
    protected String roleIsAlreadyRegistered$str() {
        return "WFLYCTL0330: 角色 '%1$s' 已经注册了";
    }
    @Override
    protected String canOnlyCreateChildAuditLoggerForMainAuditLogger$str() {
        return "WFLYCTL0331: 只能为主审计 logger 创建子审计 logger";
    }
    @Override
    protected String permissionDenied$str() {
        return "WFLYCTL0332: 权限被拒绝";
    }
    @Override
    protected String permissionCollectionIsReadOnly$str() {
        return "WFLYCTL0333: 无法在只读的 PermissionCollection 里添加权限";
    }
    @Override
    protected String incompatiblePermissionType$str() {
        return "WFLYCTL0334: 不兼容的权限类型 %1$s";
    }
    @Override
    protected String managementResourceNotFoundMessage$str() {
        return "WFLYCTL0335: 没有找到管理资源 '%1$s'";
    }
    @Override
    protected String attributesMustBeDefined$str() {
        return "WFLYCTL0336: 下列属性在当前模型里是可为 null 的，但在目标模型版本 %1$s 必须进行定义";
    }
    @Override
    protected String unsupportedIdentityType$str() {
        return "WFLYCTL0337: 接收到不支持的身份类型 '%1$X'。";
    }
    @Override
    protected String unsupportedIdentityParameter$str() {
        return "WFLYCTL0338: 不支持的身份参数 '%1$X' 接收到解析身份类型 '%2$X'。";
    }
    @Override
    protected String attributesMustBeDefinedAs$str() {
        return "WFLYCTL0339: 下面的属性必须在当前模型里被定义为 %1$s：%2$s";
    }
    @Override
    protected String attributesMustNotBeDefinedAs$str() {
        return "WFLYCTL0340: 下面的属性不能在当前模型里被定义为 %1$s：%2$s";
    }
    @Override
    protected String badUriSyntax$str() {
        return "WFLYCTL0341: 传入具有错误语法 '%1$s' 的 URI ，以进行验证。";
    }
    @Override
    protected String invalidBlockingTimeout$str() {
        return "WFLYCTL0342: 操作头信息 %2$s 的非法值 %1$d；它必须大于 0";
    }
    @Override
    protected String timeoutAwaitingInitialStability0$str() {
        return "WFLYCTL0343: 服务容器由于之前的操作而不稳定，无法处理进一步的运行时更新。需要重启。";
    }
    @Override
    protected String timeoutExecutingOperation0$str() {
        return "WFLYCTL0344: 等待服务容器稳定时操作超时";
    }
    @Override
    protected String serviceInstallTimedOut$str() {
        return "WFLYCTL0345: 等待现有服务 %2$s 被删除以便安装新实例 %1$d 秒后超时。";
    }
    @Override
    protected String invalidDefaultBlockingTimeout$str() {
        return "WFLYCTL0346: 属性 %2$s 的无效值 %1$s；它必须是大于零的整数。如果没有指定，默认值 %3$d 将被使用。";
    }
    @Override
    protected String timeoutAwaitingInitialStability3$str() {
        return "WFLYCTL0347: 在允许地址 '%3$s' 上的操作 '%2$s' 的运行时修改之前，等待初始服务容器稳定 [%1$d] 秒后超时。操作将回滚；需要重启进程。";
    }
    @Override
    protected String timeoutExecutingOperation3$str() {
        return "WFLYCTL0348: 等待服务容器稳定 [%1$d] 秒后超时。操作将回滚。首先更新服务容器的步骤是地址 '%3$s' 上的操作 '%2$s'";
    }
    @Override
    protected String timeoutCompletingOperation$str() {
        return "WFLYCTL0349: 在完成操作时等待服务容器稳定 [%1$d] 秒后超时。进程必须重启。首先更新服务容器的步骤是地址 '%3$s' 处的 '%2$s'";
    }
    @Override
    protected String interruptedAwaitingInitialResponse$str() {
        return "WFLYCTL0350: 当等待初始响应时，在地址 '%2$s' 上的远程进程上的操作 '%1$s' 执行中断；远程进程已被通知来取消操作";
    }
    @Override
    protected String interruptedAwaitingFinalResponse$str() {
        return "WFLYCTL0351: 当等待最后响应时，在地址 '%2$s' 上的远程进程上的操作 '%1$s' 执行中断；远程进程已被通知来终止操作";
    }
    @Override
    protected String cancellingOperation$str() {
        return "WFLYCTL0352: 取消运行在线程 '%3$s' 上的 ID 为 '%2$d' 的操作 '%1$s'";
    }
    @Override
    protected String responseHandlerNotFound$str() {
        return "WFLYCTL0353: 请求 %1$s 没有响应句柄";
    }
    @Override
    protected String attemptingReconnectToSyslog$str() {
        return "WFLYCTL0354: 在 %2$d 秒超时后试图重新连接到 syslog 处理程序 '%1$s'";
    }
    @Override
    protected String reconnectToSyslogFailed$str() {
        return "WFLYCTL0355: 重新连接 syslog 处理程序 '%1$s' 失败";
    }
    @Override
    protected String failedToEmitNotification$str() {
        return "WFLYCTL0356: 发送通知 %1$s 失败";
    }
    @Override
    protected String notificationIsNotDescribed$str() {
        return "WFLYCTL0357: 对于地址 %2$s 处的资源，没有描述类型 %1$s 的通知";
    }
    @Override
    protected String resourceWasAdded$str() {
        return "WFLYCTL0358: 在地址 %1$s 上添加了资源。";
    }
    @Override
    protected String resourceWasRemoved$str() {
        return "WFLYCTL0359: 从地址 %1$s 上删除了资源。";
    }
    @Override
    protected String attributeValueWritten$str() {
        return "WFLYCTL0360: 属性 %1$s 已经从 %2$s 改成了 %3$s。";
    }
    @Override
    protected String capabilitiesNotAvailable$str() {
        return "WFLYCTL0361: 不能在阶段 '%1$s' 查询功能，它们在阶段 '%2$s' 才提供。";
    }
    @Override
    protected String requiredCapabilityMissing1$str() {
        return "WFLYCTL0362: 资源 '%1$s' 要求的功能不可用：";
    }
    @Override
    protected String capabilityAlreadyRegisteredInContext2$str() {
        return "WFLYCTL0363: 功能 '%1$s' 已经在上下文 '%2$s' 中注册。";
    }
    @Override
    protected String unknownCapability$str() {
        return "WFLYCTL0364: 功能 '%1$s' 是未知的。";
    }
    @Override
    protected String unknownCapabilityInContext$str() {
        return "WFLYCTL0365: 功能 '%1$s' 在上下文 '%2$s' 里是未知的。";
    }
    @Override
    protected String capabilityDoesNotExposeRuntimeAPI$str() {
        return "WFLYCTL0366: 功能 '%1$s' 没有公开运行时 API。";
    }
    @Override
    protected String cannotRemoveRequiredCapability$str() {
        return "WFLYCTL0367: 无法删除功能 '%1$s'，因为它是其他功能所必需的：";
    }
    @Override
    protected String cannotRemoveRequiredCapabilityInContext$str() {
        return "WFLYCTL0368: 无法从上下文 '%2$s' 中删除功能 '%1$s'，因为它是其他功能所必需的：";
    }
    @Override
    protected String requiredCapabilityMissing0$str() {
        return "WFLYCTL0369: 要求的功能是不可用的：";
    }
    @Override
    protected String requirementPointSimple$str() {
        return "功能 '%1$s' 要求地址 '%2$s'";
    }
    @Override
    protected String requirementPointFull$str() {
        return "功能 '%1$s' 要求位于地址 '%3$s' 的属性 '%2$s'";
    }
    @Override
    protected String formattedCapabilityName$str() {
        return "%1$s";
    }
    @Override
    protected String formattedCapabilityId$str() {
        return "上下文 '%2$s' 中的%1$s";
    }
    @Override
    protected String possibleCapabilityProviderPoints$str() {
        return ";这个功能可能的注册点：%1$s";
    }
    @Override
    protected String noKnownProviderPoints$str() {
        return "没有已知的注册点可以提供这种功能。";
    }
    @Override
    protected String unsupportedUsageOfExpression$str() {
        return "; 这个无法解析的功能可能是由于在不支持表达式的配置属性中使用表达式字符串造成的。";
    }
    @Override
    protected String incompleteExpression$str() {
        return "WFLYCTL0370: 不完整的表达式：%1$s";
    }
    @Override
    protected String unsupportedElement$str() {
        return "WFLYCTL0371: 元素 '%1$s' 不再被支持，请使用 '%2$s'";
    }
    @Override
    protected String duplicateElementsInList$str() {
        return "WFLYCTL0372: 列表属性 '%1$s' 包含重复记录，这是不允许的";
    }
    @Override
    protected String deploymentResourceMustBeRuntimeOnly$str() {
        return "WFLYCTL0373: 部署资源必须只能是运行时的";
    }
    @Override
    protected String unableToResolveExpressions$str() {
        return "WFLYCTL0374: 无法解析这个位置上的表达式。";
    }
    @Override
    protected String udpSyslogServerUnavailable$str() {
        return "WFLYCTL0375: 由于 '%2$s'，处理程序 '%1$s' 上的管理操作审计日志更新失败。请确保这个 syslog 服务器正在运行且可以到达";
    }
    @Override
    protected String unexpectedAttribute2$str() {
        return "WFLYCTL0376: 遇到意外的属性 '%1$s'。有效的属性是：'%2$s'";
    }
    @Override
    protected String unexpectedElement2$str() {
        return "WFLYCTL0377: 遇到意外的元素 '%1$s'。有效的元素是：'%2$s'";
    }
    @Override
    protected String attributeIsWrongType$str() {
        return "WFLYCTL0378: 属性 '%1$s' 的类型不是 '%2$s'，是类型 '%3$s'";
    }
    @Override
    protected String managementUnavailableDuringBoot$str() {
        return "WFLYCTL0379: 系统引导在进行中；远程管理操作目前还不可用";
    }
    @Override
    protected String requiredAttributeNotSet$str() {
        return "WFLYCTL0380: 在属性 '%2$s' 可以正确设置前，需要设置或传入属性 '%1$s'";
    }
    @Override
    protected String illegalPermissionName$str() {
        return "WFLYCTL0381: 非法的权限名称 '%1$s'";
    }
    @Override
    protected String illegalPermissionActions$str() {
        return "WFLYCTL0382: 非法的权限动作 '%1$s'";
    }
    @Override
    protected String noOperationDefined$str() {
        return "WFLYCTL0383: 没有定义操作 %1$s";
    }
    @Override
    protected String nonHostCapableSubsystemInHostModel$str() {
        return "WFLYCTL0385: 试图注册主机模型里的扩展模块 '%2$s' 的非主机级子系统 '%1$s'。";
    }
    @Override
    protected String onlyAccessHostControllerInfoInRuntimeStage$str() {
        return "WFLYCTL0386: 主机控制器信息只能在引导的模型阶段后才能被访问";
    }
    @Override
    protected String illegalCLIStylePathAddress$str() {
        return "WFLYCTL0387: 非法的路径地址 '%1$s'，它不是正确的 CLI 格式";
    }
    @Override
    protected String cannotCreateEmptyConfig$str() {
        return "WFLYCTL0388: 无法创建空的配置文件 %1$s";
    }
    @Override
    protected String rejectEmptyConfig$str() {
        return "WFLYCTL0389: 无法在文件 %1$s 里创建空的配置，这里已有非空的配置存在";
    }
    @Override
    protected String couldNotResolveExpressionIndex$str() {
        return "WFLYCTL0391: 无法解析属性表达式：'%1$s'，无效的索引 '%2$d'";
    }
    @Override
    protected String couldNotResolveExpressionList$str() {
        return "WFLYCTL0392: 无法解析属性表达式：'%1$s'，类型不是一个列表";
    }
    @Override
    protected String couldNotResolveExpression$str() {
        return "WFLYCTL0393: 无法解析属性表达式：'%1$s'";
    }
    @Override
    protected String invalidCapabilityServiceType$str() {
        return "WFLYCTL0394: 功能 '%1$s' 没有提供类型 '%2$s' 服务";
    }
    @Override
    protected String operationDeprecated$str() {
        return "WFLYCTL0395: 针对地址 %2$s 的资源的操作 %1$s 已弃用，可能会在以后的版本中删除。请参考 read-resource-description 操作的输出了解更多与弃用相关的信息。";
    }
    @Override
    protected String discardedResourceTransformation$str() {
        return "WFLYCTL0396: 目标主机 %2$s 上的资源 %1$s 被舍弃";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYCTL0397: 只有父资源支持有序子资源时，有索引的子资源才可以注册。'%1$s' 的父资源没有编入索引";
    }
    @Override
    protected String orderedChildTypeRenamed$str() {
        return "WFLYCTL0398: 试图把在 %1$s 上找到的资源重新命名为 %2$s。然而，'%3$s' 是定义成在父资源 %4$s 上排序的资源类型之一";
    }
    @Override
    protected String inconsistentCapabilityContexts4$str() {
        return "WFLYCTL0399: 上下文 '%3$s' 里的功能 '%2$s' 要求的功能 '%1$s' 在一个或多个套接字绑定组里可用，但不是 '%4$s' 要求的所有套接字绑定功能都可以从单一套接字绑定组解析，所以这个配置是无效的";
    }
    @Override
    protected String inconsistentCapabilityContexts5$str() {
        return "WFLYCTL0400: 和资源 '%3$s' 关联的上下文 '%2$s' 里的功能 '%1$s' 要求功能 '%4$s'。它在一个或多个套接字绑定组里可用，但不是 '%5$s' 要求的所有套接字绑定功能都可以从单一套接字绑定组解析，所以这个配置是无效的";
    }
    @Override
    protected String failedToBuildReport$str() {
        return "WFLYCTL0401: 无法构建报表";
    }
    @Override
    protected String removeUnsupportedLegacyExtension$str() {
        return "WFLYCTL0402: 运行这个版本的服务器不支持旧的扩展 '%2$s' 提供的子系统 %1$s。在服务器正常运行前，子系统和扩展都必须删除。";
    }
    @Override
    protected String unexpectedOperationExecutionException$str() {
        return "WFLYCTL0403: 执行下列操作时意外失败：%1$s";
    }
    @Override
    protected String unexpectedOperationExecutionFailureDescription$str() {
        return "WFLYCTL0404: 执行过程中出现异常：%1$s";
    }
    @Override
    protected String couldNotFindTransformerRegistryFallingBack$str() {
        return "WFLYCTL0405: 无法找到 %1$s 的转换器，回滚至版本 %2$s";
    }
    @Override
    protected String selectFailedCouldNotConvertAttributeToType$str() {
        return "WFLYCTL0406: 无法将属性 '%1$s' 转换为 %2$s";
    }
    @Override
    protected String failedSendingCompletedResponse$str() {
        return "WFLYCTL0407: 为 %2$d 发送完成响应 %1$s 失败";
    }
    @Override
    protected String failedSendingFailedResponse$str() {
        return "WFLYCTL0408: 为 %2$d 发送失败响应 %1$s 失败";
    }
    @Override
    protected String proxiedOperationTimedOut$str() {
        return "WFLYCTL0409: 当等待初始响应 %3$d 毫秒后，在地址 '%2$s' 上的远程进程上的操作 '%1$s' 执行超时；远程进程已被通知来终止操作";
    }
    @Override
    protected String timeoutAwaitingFinalResponse$str() {
        return "WFLYCTL0410: 当等待最后响应 %3$d 毫秒后，在地址 '%2$s' 上的远程进程上的操作 '%1$s' 执行超时；远程进程已被通知来终止操作";
    }
    @Override
    protected String failedToParseElementLenient$str() {
        return "WFLYCTL0411: 解析元素 '%1$s' 失败，忽略它。";
    }
    @Override
    protected String missingRequiredServices$str() {
        return "WFLYCTL0412: 没有安装要求的服务：";
    }
    @Override
    protected String deprecatedAndCurrentParameterMismatch$str() {
        return "WFLYCTL0413: 除了当前的参数 %2$s 之外，还使用已弃用的参数 %1$s 设置了不同的值";
    }
    @Override
    protected String couldNotCreateHistoricalBackup$str() {
        return "WFLYCTL0414: 无法创建当前历史目录 %1$s 带时间戳的备份，所以它仍包含了来自之前引导的版本。";
    }
    @Override
    protected String runtimeModificationBegun$str() {
        return "WFLYCTL0415: 管理操作对运行时服务容器的修改已开始";
    }
    @Override
    protected String runtimeModificationComplete$str() {
        return "WFLYCTL0416: 管理操作对运行时服务容器的修改已完成";
    }
    @Override
    protected String cannotAddMoreThanOneJvmForServerOrHost$str() {
        return "WFLYCTL0417: 无法添加多个 JVM。已尝试添加 '%1$s'，但 '%2$s' 已存在";
    }
    @Override
    protected String socketBindingalreadyDeclared$str() {
        return "WFLYCTL0418: %1$s 或 %2$s %3$s 已在 %4$s %5$s 中声明";
    }
    @Override
    protected String invalidMaxBytesLength$str() {
        return "WFLYCTL0419: '%1$s' 是参数 %2$s 的无效值。这个值的长度最大为 %3$d 个字节";
    }
    @Override
    protected String invalidMinBytesLength$str() {
        return "WFLYCTL0420: '%1$s' 是参数 %2$s 的无效值。这个值的长度最小为 %3$d 个字节";
    }
    @Override
    protected String explodedDeploymentNotSupported$str() {
        return "WFLYCTL0421: 一些服务器不支持展开的部署";
    }
    @Override
    protected String couldNotLoadModuleForTransformers$str() {
        return "WFLYCTL0422: 无法加载转换器的模块 '%1$s'";
    }
    @Override
    protected String wrongMaskedPasswordFormat$str() {
        return "WFLYCTL0423: 屏蔽的密码命令格式错误。%nUsage: MASK-<encoded secret>;<salt>;<iteration count> 其中 <salt>=UTF-8 字符, <iteration count>=合理大小的正整数";
    }
    @Override
    protected String invalidAddressFormat$str() {
        return "WFLYCTL0433: '%1$s' 不是资源地址的有效表示形式";
    }
    @Override
    protected String bootComplete$str() {
        return "WFLYCTL0434: 引导完成";
    }
    @Override
    protected String attributeWasNotMarkedAsReloadRequired$str() {
        return "WFLYCTL0435: 资源 %2$s 的属性 %1$s 没要按要求那样标记为重载，或设置 RESTART_ALL_SERVICES 标志，或注册自定义写处理程序。";
    }
    @Override
    protected String typeConversionError$str() {
        return "无法将 %1$s 转换为 %2$s";
    }
    @Override
    protected String capabilityAlreadyRegisteredInContext4$str() {
        return "WFLYCTL0436: 无法在位置 '%2$s' 注册功能 '%1$s'，因为它已经在位置 '%4$s' 的上下文 '%3$s' 中注册";
    }
    @Override
    protected String duplicateExtensionElement$str() {
        return "WFLYCTL0437: 重复扩展：包含 %2$s 属性值 '%3$s' 的 %1$s 元素已被解析";
    }
    @Override
    protected String couldntConvertWarningLevel$str() {
        return "WFLYCTL0438: 无法将 '%1$s' 转换至适当的警告水平，阈值退回到 'ALL'。可能值：SEVERE、WARNING、INFO、CONFIG、FINE、FINER、FINEST、ALL、OFF";
    }
    @Override
    protected String invalidSubnetFormat$str() {
        return "WFLYCTL0439: 属性 %2$s 的值 %1$s 不是一个有效的子网格式";
    }
    @Override
    protected String cannotDeleteFileOrDirectory$str() {
        return "WFLYCTL0440: 无法删除文件或目录 %1$s";
    }
    @Override
    protected String serviceStatusReportFailureHeader$str() {
        return "WFLYCTL0441: 操作导致服务 %n 失败或丢失";
    }
    @Override
    protected String errorStoppingServer$str() {
        return "WFLYCTL0442: 停止服务器时出错";
    }
    @Override
    protected String errorObtainingPassword$str() {
        return "WFLYCTL0443: 从供应商 %1$s 获取密码时出错";
    }
    @Override
    protected String invalidRuntimeStageForProfile$str() {
        return "WFLYCTL0444: 地址 '%2$s' 处操作 '%1$s' 的处理程序试图添加一个阶段 %3$s 步骤。这对于进程类型 %4$s 上的一个 'profile' 资源无效，因此这个步骤不会被执行。";
    }
    @Override
    protected String alreadyDefinedAttribute$str() {
        return "WFLYCTL0445: 属性 %3$s 中值为 '%2$s' 的 %1$s 已定义";
    }
    @Override
    protected String requiredWithAlternatives$str() {
        return "WFLYCTL0446: 需要 %1$s 或 %2$s";
    }
    @Override
    protected String attributeExpressionDeprecated$str() {
        return "WFLYCTL0447: 地址 '%2$s' 上的资源中的属性 '%1$s' 已配置有表达式，但以后的版本可能会删除此属性的值中的表达式使用支持。此属性配置是否存在其他配置部分可能需要的功能或自己配置其他配置部分提供的功能要求。使用表达式时，无法提供对这种配置的完全支持。";
    }
    @Override
    protected String servicesWithTransitiveUnavailability$str() {
        return "WFLYCTL0448: %1$s 额外服务已停止，因为它们的依赖项缺失或失败";
    }
    @Override
    protected String operationDeprecatedMessage$str() {
        return "WFLYCTL0449: 针对地址 %2$s 的资源的操作 %1$s 已弃用，可能会在以后的版本中删除。请参考 read-resource-description 操作的输出了解更多与弃用相关的信息。";
    }
    @Override
    protected String failedToCloneRepository$str() {
        return "WFLYCTL0450: 克隆存储库 %1$s 失败";
    }
    @Override
    protected String failedToPublishConfiguration$str() {
        return "WFLYCTL0451: 由于 %2$s，向 %1$s 发布配置失败";
    }
    @Override
    protected String failedToPersistConfiguration$str() {
        return "WFLYCTL0452: 由于 %2$s，持久化配置至 %1$s 失败";
    }
    @Override
    protected String failedToDeleteConfigurationSnapshot$str() {
        return "WFLYCTL0453: 删除配置快照 %1$s 失败";
    }
    @Override
    protected String failedToListConfigurationSnapshot$str() {
        return "WFLYCTL0454: 列出配置快照 %1$s 失败";
    }
    @Override
    protected String snapshotAlreadyExistError$str() {
        return "WFLYCTL0455: 无法执行快照 %1$s，因为此快照已存在";
    }
    @Override
    protected String systemPropertyAlreadyExist$str() {
        return "WFLYCTL0456: 系统属性 \"%1$s\" 已在配置文件的 <system-properties> 部分中设置。在命令行中设置的值将被该值覆盖。";
    }
    @Override
    protected String invalidHeaderName$str() {
        return "WFLYCTL0457: 无效的 HTTP 标头名称 \"%1$s\"";
    }
    @Override
    protected String disallowedHeaderName$str() {
        return "WFLYCTL0458: 不允许的 HTTP 标头名称 \"%1$s\"";
    }
    @Override
    protected String missingManagementServices$str() {
        return "WFLYCTL0459: 因为缺少管理服务触发回滚。";
    }
    @Override
    protected String propertyCanOnlyBeUsedWithStandaloneOrEmbeddedServer$str() {
        return "WFLYCTL0460: 系统属性 \"%1$s\" 只能用于独立或嵌入的服务器";
    }
    @Override
    protected String propertyCanOnlyBeUsedWithAdminOnlyModeServer$str() {
        return "WFLYCTL0461: 系统属性 \"%1$s\" 只能与一个 admin-only 服务器一起使用";
    }
    @Override
    protected String couldNotFindDirectorySpecifiedByProperty$str() {
        return "WFLYCTL0462: 无法找到系统属性 \"%2$s\" 指定的目录 \"%1$s\"。请确定该目录存在";
    }
    @Override
    protected String moreThanOneInstanceOfAdditionalBootCliScriptInvokerFound$str() {
        return "WFLYCTL0463: 找到多个 AdditionalBootCliScriptInvoker 实例。有： '%1$s'; 找到： '%2$s";
    }
    @Override
    protected String cliScriptPropertyDefinedWithoutMarkerDirectoryWhenNotSkippingReload$str() {
        return "WFLYCTL0464: 如果使用 %1$s=true，在使用 -D%2$s 时需要设置 -D%3$s";
    }
    @Override
    protected String initialisedAdditionalBootCliScriptSystemKeepingAlive$str() {
        return "WFLYCTL0465: 初始化额外的引导 CLI 脚本功能。CLI 命令将从 %1$s 中读取。该服务器将在执行后以只读模式运行，并且 cli 操作的结果将写入 %2$s";
    }
    @Override
    protected String initialisedAdditionalBootCliScriptSystemNotKeepingAlive$str() {
        return "WFLYCTL0466: 初始化额外的引导 CLI 脚本功能。CLI 命令将从 %1$s 中读取。执行该服务器后，服务器将重启至正常模式";
    }
    @Override
    protected String executingBootCliScript$str() {
        return "WFLYCTL0467: 根据以 admin-only 模式运行的服务器，运行来自 CLI 脚本 %1$s 的额外命令";
    }
    @Override
    protected String completedRunningBootCliScript$str() {
        return "WFLYCTL0468: 完成运行来自 CLI 脚本的命令";
    }
    @Override
    protected String restartingServerAfterBootCliScript$str() {
        return "WFLYCTL0469: 重启服务器，因为来自 CLI 脚本中的额外命令需要重启操作。这将记录重启已在标记文件 %1$s 中启动，因为重启机制将保留所有与附加引导 CLI 脚本功能（%2$s、%3$s、%4$s）相关的属性。重启会维护 admin-only 运行模式，因此后续会进行重新加载操作";
    }
    @Override
    protected String reloadingServerToNormalModeAfterAdditionalBootCliScript$str() {
        return "WFLYCTL0470: 在通过 CLI 脚本执行附加命令后，将服务器重新加载到正常模式。这会在设置了%1$s、%2$s、%3$s时清除触发额外的引导 cli 脚本功能的属性，并删除表示服务器已重启的标记文件";
    }
    @Override
    protected String reloadingServerToNormalModeAfterRestartAfterAdditionalBootCliScript$str() {
        return "WFLYCTL0471: 重启以下 CLI 脚本中附加命令的执行后，将服务器重新载入至正常模式。如果设置了%1$s、%2$s、%3$s，则清除触发额外引导 cli 脚本功能的属性";
    }
    @Override
    protected String checkingForPresenceOfRestartMarkerFile$str() {
        return "WFLYCTL0472: 检查表示服务器已通过执行 CLI 脚本中附加命令而重启了的标记文件是否存在，";
    }
    @Override
    protected String foundRestartMarkerFile$str() {
        return "WFLYCTL0473: 在 %1$s 处找到了表示服务器在执行了 CLI 脚本中的附加命令后重启了的标记文件";
    }
    @Override
    protected String noRestartMarkerFile$str() {
        return "WFLYCTL0474: 没有找到表示服务器在执行了 CLI 脚本中的附加命令后重启了的标记文件";
    }
    @Override
    protected String invalidAttributeValue1$str() {
        return "WFLYCTL0475: 属性 '%1$s' 的无效值。";
    }
    @Override
    protected String invalidCredentialReferenceValue$str() {
        return "WFLYCTL0476: 属性 \"%1$s\" 的值无效：必须自行指定 \"%2$s\"，或 \"%3$s\" 需要至少使用 \"%4$s\" 或 \"%5$s\" 指定";
    }
    @Override
    protected String invalidParameterName$str() {
        return "WFLYCTL0477: 参数名称 \"%1$s\" 无效。";
    }
    @Override
    protected String unableToBuildCommandCredentialSource$str() {
        return "WFLYCTL0478: 无法为凭证引用创建基于命令的 CredentialSource。";
    }
    @Override
    protected String attributeUnresolvableUsingSimpleResolution$str() {
        return "WFLYCTL0479: 在资源 '%2$s' 处的带有未解析值 '%3$s' 的属性 '%1$s' 无法使用 'resolve' 参数支持的非安全敏感解析源解析源进行解析。响应会报告未解析的值。";
    }
    @Override
    protected String expressionUnresolvableUsingSimpleResolution$str() {
        return "WFLYCTL0480: 表达式 '%1$s' 无法使用 '%2$s' 操作支持的非安全敏感解析源解析源。响应会报告未解析的值。";
    }
    @Override
    protected String runtimePackageDependencyAlreadyRegistered$str() {
        return "WFLYCTL0481: 运行时依赖软件包 '%1$s' 已在 '%2$s' 处注册";
    }
    @Override
    protected String illegalCharsetName$str() {
        return "WFLYCTL0482: 值 '%1$s' 不是一个合法的字符集名称";
    }
    @Override
    protected String unsupportedCharset$str() {
        return "WFLYCTL0483: 这个 Java 虚拟机实例不支持字符集 '%1$s'";
    }
    @Override
    protected String invalidAttributeDefinition$str() {
        return "WFLYCTL0484: 属性 '%1$s' 的属性定义是 null";
    }
    @Override
    protected String failedToParseYamlConfigurationFile$str() {
        return "WFLYCTL0485: 解析 yaml 文件 %1$s 的错误";
    }
    @Override
    protected String missingYamlFile$str() {
        return "WFLYCTL0486: 缺少 yaml 文件 %1$s";
    }
    @Override
    protected String loadingYamlFiles$str() {
        return "WFLYCTL0487: 它需要 %1$s ms 来加载并解析以下 yaml 文件 [%2$s]";
    }
    @Override
    protected String noResourceRegistered1$str() {
        return "WFLYCTL0488: 没有找到地址 %1$s 的注册 - 请忽略子树";
    }
    @Override
    protected String noResourceForUndefiningAttribute$str() {
        return "WFLYCTL0489: 无法取消属性 %1$s 的定义，因为在 %2$s 处没有资源";
    }
    @Override
    protected String noAttributeSetForAddress$str() {
        return "WFLYCTL0490: 已为地址 %1$s 定义了一个没有任何属性的 YAML 资源。不会执行任何操作。";
    }
    @Override
    protected String unexpectedValueForResource$str() {
        return "WFLYCTL0491: 对于地址 %2$s 和名称 %3$s ，我们有一个意外的值 %1$s";
    }
    @Override
    protected String noResourceRegistered2$str() {
        return "WFLYCTL0492: 无法找到当前注册为 %2$s 的地址 %1$s 的资源注册";
    }
    @Override
    protected String missingListAttributeValueType$str() {
        return "WFLYCTL0493: %1$s 属性没有正确定义的 valueType。";
    }
    @Override
    protected String resolverExtensionExpressionsNotAllowed$str() {
        return "WFLYCTL0494: 此时不允许解析扩展表达式'%1$s'。";
    }
    @Override
    protected String adminOnlyPolicyDeprecatedValue$str() {
        return "WFLYCTL0495: \"fetch-from-master\" 是 \"domain-controller.remote.admin-only-policy\" 的弃用值，将改为使用 \"fetch-from-domain-controller\"。";
    }
    @Override
    protected String threadDumpException$str() {
        return "WFLYCTL0498: 在生成线程转储过程中抛出异常";
    }
    @Override
    protected String errorConstructingYAMLMapping$str() {
        return "在构建映射时，%1$s; 预期为合并的一个映射，但找到了 %2$s";
    }
    @Override
    protected String argYaml$str() {
        return "用于自定义配置的 yaml 配置文件。路径可以是绝对的，相对于当前执行目录，或者相对于独立的配置目录。";
    }
    @Override
    protected String noSatisfactoryCapability$str() {
        return "WFLYCTL0499: 功能范围 '%2$s' 没有可用功能 '%1$s'。此功能在地址 \"%3$s\" 中注册，且无法被范围为\"%4$s\"的资源访问。";
    }
    @Override
    protected String uuidIsEmpty$str() {
        return "WFLYCTL0500: '%1$s' 没有 UUID 字符串。将生成一个新的值。";
    }
    @Override
    protected String uuidNotValid$str() {
        return "WFLYCTL0501: 在 '%2$s' 中找到了一个无效的 UUID 字符串 '%1$s'。将生成一个新的值。";
    }
    @Override
    protected String noChildResource$str() {
        return "WFLYCTL0502: 在地址 '%2$s' 处没有找到名为 '%1$s' 的子资源。";
    }
    @Override
    protected String failedToPublishConfigurationInvalidRemote$str() {
        return "WFLYCTL0503: 无法发布配置，因为远程名称 %1$s 是无效的。";
    }
    @Override
    protected String missingOperationForResource$str() {
        return "WFLYCTL0504: 没有为资源 %2$s 定义操作 %1$s。";
    }
    @Override
    protected String unstableSubsystemNamespace$str() {
        return "WFLYCTL0505: %1$s 子系统命名空间 %2$s 没有被当前稳定性级别启用";
    }
    @Override
    protected String unstableExtension$str() {
        return "WFLYCTL0506: 模块 %2$s 中的扩展 %1$s 没有被当前稳定性级别启用";
    }
    @Override
    protected String unsupportedDeployment$str() {
        return "WFLYCTL0507: 不支持带有属性 %2$s 的部署 yaml 文件 %1$s";
    }
    @Override
    protected String ignoreYamlElement$str() {
        return "WFLYCTL0508: yaml 元素 '%1$s' 及其子元素都被忽略。";
    }
    @Override
    protected String ignoreYamlSubElement$str() {
        return "因此，忽略元素 '%1$s'。";
    }
    @Override
    protected String noAttributeDefined$str() {
        return "WFLYCTL0509: 在地址 '%2$s' 处没有定义名为 '%1$s' 的属性。";
    }
    @Override
    protected String illegalOperationForAttribute$str() {
        return "WFLYCTL0510: 没有对地址 '%3$s' 处定义的名为 '%2$s' 的属性执行操作 %1$s 。";
    }
    @Override
    protected String noAttributeValueDefined$str() {
        return "WFLYCTL0511: 没有为地址 '%2$s' 处的属性 '%1$s' 定义值。";
    }
    @Override
    protected String removingUnexistingResource$str() {
        return "WFLYCTL0512: 地址 '%1$s' 处不存在任何资源。忽略 remove 操作。";
    }
    @Override
    protected String unsupportedNamespace$str() {
        return "WFLYCTL0513: 不再支持 %1$s 的 XML 命名空间。";
    }
    @Override
    protected String unstableManagementNamespace$str() {
        return "WFLYCTL0514: 管理命名空间 %1$s 没有被当前稳定性级别启用";
    }
    @Override
    protected String systemPropertyDeprecated$str() {
        return "WFLYCTL0515: 系统属性 '%1$s' 已弃用，并可能在以后的版本中删除，应该改为使用资源 '%3$s' 上的属性 '%2$s' 。";
    }
    @Override
    protected String invalidModuleNameParameter$str() {
        return "WFLYCTL0516: 参数 %1$s 指定了一个无效的模块名称：%2$s";
    }
    @Override
    protected String multipleParallelBootOperation$str() {
        return "WFLYCTL0517: 有多个并行引导操作。";
    }
}
