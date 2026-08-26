package org.jboss.as.domain.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:19+0200")
public class DomainControllerLogger_$logger_zh_CN extends DomainControllerLogger_$logger_zh implements DomainControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DomainControllerLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToSendMessage$str() {
        return "WFLYDC0066: 发送消息 %1$s 失败";
    }
    @Override
    protected String unexplainedFailure$str() {
        return "WFLYDC0021: 意外的故障";
    }
    @Override
    protected String noDeploymentContentWithName$str() {
        return "WFLYDC0042: 未找到名为 %1$s 的部署";
    }
    @Override
    protected String adminOnlyModeCannotAcceptSlaves$str() {
        return "WFLYDC0014: 主主机控制器无法注册辅助主机控制器，使其当前的运行模式为 '%1$s'";
    }
    @Override
    protected String invalidUrl$str() {
        return "WFLYDC0045: %1$s 不是有效的 URL -- %2$s";
    }
    @Override
    protected String undeployingDeploymentHasBeenRedeployed$str() {
        return "WFLYDC0073: %1$s 部署已被重新部署，它的内容不会被删除。您需要重启它。";
    }
    @Override
    protected String serverGroupExpectsSingleChild$str() {
        return "WFLYDC0019: 服务器组期待一个且只有一个子服务器：%1$s";
    }
    @Override
    protected String operationFailedOrRolledBackWithCause$str() {
        return "WFLYDC0074: 操作在所有服务器上失败或回滚。服务器失败信息：";
    }
    @Override
    protected String cannotAddContentToUnmanagedDeployment$str() {
        return "WFLYDC0089: 无法添加内容至未管理的部署";
    }
    @Override
    protected String interruptedAwaitingFinalResponse1$str() {
        return "WFLYDC0005: 等待主机 %1$s 的最后响应时被打断；远程进程已被通知取消操作。";
    }
    @Override
    protected String cannotRemoveUsedServerGroup$str() {
        return "WFLYDC0064: 无法删除服务器组 '%1$s'，因为它仍被服务器 %2$s 使用。";
    }
    @Override
    protected String serverManagementUnavailableDuringBoot$str() {
        return "WFLYDC0098: 以下服务器 %1$s 正在启动。当前还无法执行远程管理操作";
    }
    @Override
    protected String invalidUrlStream$str() {
        return "WFLYDC0038: 无效的 URL 流。";
    }
    @Override
    protected String invalidCode$str() {
        return "WFLYDC0054: 无效的代码 %1$d";
    }
    @Override
    protected String timedOutAwaitingHostPreparedResponse$str() {
        return "WFLYDC0080: 等待主机的预备响应 %1$d 毫秒后超时 - 已通知远程主机 %2$s 取消操作";
    }
    @Override
    protected String unknownAttributesFromSubsystemVersion$str() {
        return "WFLYDC0061: 操作 '%1$s' 失败，因为这个属性不被子系统 '%2$s' 模型版本 '%3$s': %4$s 所识别。";
    }
    @Override
    protected String timedOutAwaitingHostPreparedResponses$str() {
        return "WFLYDC0079: 等待主机 %2$s 的预备响应 %1$d 毫秒后超时 - 取消主机 %3$s 的更新";
    }
    @Override
    protected String invalidRolloutPlanGroupAlreadyExists$str() {
        return "WFLYDC0027: 无效的 rollout 计划。服务器组 %1$s 在计划里不只一次出现。";
    }
    @Override
    protected String caughtExceptionAwaitingFinalResponse1$str() {
        return "WFLYDC0006: 等待主机 %1$s 的最后响应时捕获异常";
    }
    @Override
    protected String slaveControllerCannotAcceptOtherSlaves$str() {
        return "WFLYDC0013: 辅助主机控制器上不支持远程主机的注册";
    }
    @Override
    protected String missingExtensions$str() {
        return "WFLYDC0075: 由于缺失扩展 %1$s，无法同步模型。";
    }
    @Override
    protected String caughtExceptionAwaitingFinalResponse2$str() {
        return "WFLYDC0004: 等待主机 %2$s 上的服务器 %1$s 的最后响应时捕获异常";
    }
    @Override
    protected String cannotReadContentFromUnmanagedDeployment$str() {
        return "WFLYDC0095: 无法从未管理的部署读取内容";
    }
    @Override
    protected String timedOutAwaitingPreparedResponse$str() {
        return "WFLYDC0082: 等待服务器预备响应 %2$d 毫秒后 %1$s 超时 -- 取消服务器 %3$s 的更新。";
    }
    @Override
    protected String cloneOperationNotSupportedOnHost$str() {
        return "WFLYDC0078: 配置文件克隆操作在主机 '%1$s' 上不可用。 为了能够在包含不支持配置文件克隆操作的旧辅助主机的域中使用它，您需要：a）确保所有模型版本小于4.0.0 的旧的辅助主机忽略克隆的配置文件和 \"to-profile\" 参数中指定的配置文件。b)将域控制器重新加载为 admin-only 模式，执行克隆，然后再将域控制器重新加载为正常模式，并检查是否需要重新加载辅助主机。";
    }
    @Override
    protected String cannotAddContentToSelfContainedServer$str() {
        return "WFLYDC0088: 无法添加内容至自包含服务器里的部署";
    }
    @Override
    protected String domainModelChangedOnReConnect$str() {
        return "WFLYDC0008: 在重连时域模型已经发生了变化。下面的服务器需要重启以使修改生效 %1$s";
    }
    @Override
    protected String unrecognizedChildren$str() {
        return "WFLYDC0017: %1$s 只承认 %2$s 为子节点: %3$s";
    }
    @Override
    protected String masterDomainControllerOnlyOperation$str() {
        return "WFLYDC0032: 地址 %2$s 的操作 %1$s 只能由域控制器来处理 ; 这个主机不是域控制器";
    }
    @Override
    protected String unknownServerGroup$str() {
        return "WFLYDC0052: 未知的服务器组 %1$s";
    }
    @Override
    protected String unknown$str() {
        return "WFLYDC0051: 未知的 %1$s %2$s";
    }
    @Override
    protected String unexpectedInitialPathKey$str() {
        return "WFLYDC0035: 意外的初始路径密钥 %1$s";
    }
    @Override
    protected String caughtExceptionStoringDeploymentContent$str() {
        return "WFLYDC0034: %1$s 存储部署内容时捕获 --- %2$s";
    }
    @Override
    protected String invalidRolloutPlan1$str() {
        return "WFLYDC0026: 无效的 rollout 计划。Plan 操作影响在 rollout 计划里未受影响的服务器组 %1$s";
    }
    @Override
    protected String timedOutAwaitingFinalResponse2$str() {
        return "WFLYDC0081: 等待主机 %2$s 的最后响应 %1$d 毫秒后超时；远程进程已被通知取消操作。";
    }
    @Override
    protected String cannotExplodeSubDeploymentOfUnexplodedDeployment$str() {
        return "WFLYDC0097: 无法展开未展开部署的子部署";
    }
    @Override
    protected String unexpectedInSeriesGroup$str() {
        return "WFLYDC0020: 其中一个组么有定义 server-group 或 concurrent-groups：%1$s";
    }
    @Override
    protected String invalidRolloutPlan2$str() {
        return "WFLYDC0025: 无效的 rollout 计划。%1$s 不是节点 %2$s 的有效子节点";
    }
    @Override
    protected String deploymentHashNotFoundInRepository$str() {
        return "WFLYDC0055: 库不包含任何具有 hash %1$s 的部署";
    }
    @Override
    protected String requiredChildIsMissing$str() {
        return "WFLYDC0016: %1$s 缺失了 %2$s: %3$s";
    }
    @Override
    protected String interruptedAwaitingHostPreparedResponse$str() {
        return "WFLYDC0071: 等待主机预备响应时中断 -- 取消主机 %1$s 的更新";
    }
    @Override
    protected String cannotReadContentFromSelfContainedServer$str() {
        return "WFLYDC0094: 无法从自包含服务器里的部署读取内容";
    }
    @Override
    protected String exceptionAwaitingResultFromServer$str() {
        return "WFLYDC0024: 从服务器 %1$s 获取结果时抛出异常：%2$s";
    }
    @Override
    protected String cannotRemoveDeploymentInUse$str() {
        return "WFLYDC0043: 无法从域删除部署 %1$s，因为它仍被服务器组 %2$s 所使用。";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYDC0044: 无效的 '%1$s' 值：%2$d，最大的索引是 %3$d";
    }
    @Override
    protected String unknownServer$str() {
        return "WFLYDC0053: 未知的服务器 %1$s";
    }
    @Override
    protected String cannotUseSameValueForParameters$str() {
        return "WFLYDC0049: 对于参数 %2$s 和 %3$s 无法使用具有相同值的 %1$s。请使用 %4$s 来重部署相同的内容或 %5$s 来用相同名称的更新版本来替换内容。";
    }
    @Override
    protected String slaveAlreadyRegistered$str() {
        return "WFLYDC0015: 已经存在一个注册的主机 '%1$s'";
    }
    @Override
    protected String interruptedAwaitingResultFromHost$str() {
        return "WFLYDC0030: 等待主机 %1$s 的结果时被打断";
    }
    @Override
    protected String duplicateProfileInclude$str() {
        return "WFLYDC0076: 重复包含的配置集 '%1$s'";
    }
    @Override
    protected String timedOutAwaitingFinalResponse3$str() {
        return "WFLYDC0083: 等待主机 %3$s 上的服务器 %2$s 的最后响应 %1$d 毫秒后超时；远程进程已被通知取消操作。";
    }
    @Override
    protected String invalidOperationTargetHost$str() {
        return "WFLYDC0033: 操作是以主机 %1$s 为目标，但这个主机未注册。";
    }
    @Override
    protected String caughtIOExceptionUploadingContent$str() {
        return "WFLYDC0072: 读取上传的部署内容时捕获 IOException";
    }
    @Override
    protected String slaveCannotAcceptUploads$str() {
        return "WFLYDC0041: 辅助主机控制器无法接受部署内容上传";
    }
    @Override
    protected String cannotExplodeEnabledDeployment$str() {
        return "WFLYDC0087: 无法展开已部署的部署";
    }
    @Override
    protected String cannotReadContentFromUnexplodedDeployment$str() {
        return "WFLYDC0096: 无法从未展开的部署读取内容";
    }
    @Override
    protected String cannotExplodeAlreadyExplodedDeployment$str() {
        return "WFLYDC0086: 无法展开已展开的部署";
    }
    @Override
    protected String reportAdminOnlyMissingDeploymentContent$str() {
        return "WFLYDC0011: 在部署 %2$s 的部署内容库里没有可用的带有 hash %1$s 的部署内容。因为这个主机控制器是以 ADMIN-ONLY 模式引导的，引导过程将为管理员提供机会来纠正这个问题。如果主机控制器不处于 ADMIN-ONLY 模式，这将是一个严重的引导故障。";
    }
    @Override
    protected String registrationTaskGotInterrupted$str() {
        return "WFLYDC0068: 主机注册任务被中断";
    }
    @Override
    protected String expectedOnlyOneDeployment$str() {
        return "WFLYDC0056: 期望只有一个部署，但找到 %1$d 个。";
    }
    @Override
    protected String cannotExplodeUnmanagedDeployment$str() {
        return "WFLYDC0085: 无法展开未管理的部署";
    }
    @Override
    protected String interruptedAwaitingResultFromServer$str() {
        return "WFLYDC0023: 等待主机 %1$s 的结果时被打断";
    }
    @Override
    protected String cannotRemoveContentFromSelfContainedServer$str() {
        return "WFLYDC0091: 无法从自包含服务器里的部署删除内容";
    }
    @Override
    protected String interruptedAwaitingFinalResponse2$str() {
        return "WFLYDC0003: 等待主机 %2$s 上的服务器 %1$s 的最后响应时被打断；远程进程已被通知取消操作。";
    }
    @Override
    protected String failedToLoadModule$str() {
        return "WFLYDC0059: 加载模块 '%1$s' 失败。";
    }
    @Override
    protected String unsupportedWildcardOperation$str() {
        return "WFLYDC0065: 通配符操作没有作为复合操作的一部分被支持";
    }
    @Override
    protected String registrationTaskFailed$str() {
        return "WFLYDC0069: 主机注册任务失败：%1$s";
    }
    @Override
    protected String cannotRemoveContentFromUnexplodedDeployment$str() {
        return "WFLYDC0093: 无法从未展开的部署删除内容";
    }
    @Override
    protected String as7431$str() {
        return "WFLYDC0039: 目前只支持 1 条内容（AS7-431）";
    }
    @Override
    protected String failedToSetServerInRestartRequireState$str() {
        return "WFLYDC0012: 设置服务器（%1$s）到一个需要重启的状态失败";
    }
    @Override
    protected String invalidJSFSlotValue$str() {
        return "WFLYDC0060: 无效的 Jakarta Server Faces slot 值： '%1$s'。主机控制器无法使用与默认值不同的 Jakarta Server Faces slot 值。该资源会在该主机上将被忽略";
    }
    @Override
    protected String cannotAddContentToUnexplodedDeployment$str() {
        return "WFLYDC0090: 无法添加内容至未展开的部署";
    }
    @Override
    protected String interruptedAwaitingPreparedResponse$str() {
        return "WFLYDC0070: 等待服务器预备响应时 %1$s 被中断 -- 取消服务器 %2$s 的更新。";
    }
    @Override
    protected String invalidByteStream$str() {
        return "WFLYDC0037: 无效的字节流。";
    }
    @Override
    protected String noSocketBindingGroupCalled$str() {
        return "WFLYDC0062: 没有名为 %1$s 的套接字绑定组";
    }
    @Override
    protected String failedToSendResponseHeader$str() {
        return "WFLYDC0067: 发送响应头部信息失败：%1$s";
    }
    @Override
    protected String inSeriesIsMissingGroups$str() {
        return "WFLYDC0018: in-series 缺少了组：%1$s";
    }
    @Override
    protected String operationFailedOrRolledBack$str() {
        return "WFLYDC0022: 操作失败或在所有服务器上回滚。";
    }
    @Override
    protected String nullStream$str() {
        return "WFLYDC0036: 索引 %1$d 处为 null";
    }
    @Override
    protected String duplicateSocketBindingGroupInclude$str() {
        return "WFLYDC0077: 重复包含的套接字绑定组 '%1$s'";
    }
    @Override
    protected String cannotExplodeDeploymentOfSelfContainedServer$str() {
        return "WFLYDC0084: 无法在自包含服务器里展开部署";
    }
    @Override
    protected String invalidRolloutPlanRange$str() {
        return "WFLYDC0028: 无效的 rollout 计划。服务器组 %1$s 具有值为 %3$s 的 %2$s；它必须是 0 到 100 之间的数字。";
    }
    @Override
    protected String noProfileCalled$str() {
        return "WFLYDC0057: 未调用配置集：%1$s";
    }
    @Override
    protected String caughtExceptionWaitingForTask$str() {
        return "WFLYDC0009: 等待任务 %3$s 时 %1$s 捕获了 %2$s。取消任务。";
    }
    @Override
    protected String deploymentAlreadyStarted$str() {
        return "WFLYDC0050: 部署 %1$s 已启动";
    }
    @Override
    protected String cannotRemoveContentFromUnmanagedDeployment$str() {
        return "WFLYDC0092: 无法从未管理的部署删除内容";
    }
    @Override
    protected String noDeploymentContentWithHash$str() {
        return "WFLYDC0040: 在部署内容库里没有具有 hash %1$s 的部署内容。";
    }
    @Override
    protected String invalidContentDeclaration$str() {
        return "WFLYDC0047: 无效的内容声明";
    }
    @Override
    protected String noDeploymentContentWithHashAtBoot$str() {
        return "WFLYDC0058: 在部署 %2$s 的部署内容库里没有可用的带有 hash %1$s 的部署内容。这是一个严重的引导错误。要纠正这个问题，要么使用 --admin-only 选项重启并使用 CLI 来安装缺失的内容或从配置里删除这些内容，或者从 XML 配置文件里删除这个部署并重启。";
    }
    @Override
    protected String errorObtainingUrlStream$str() {
        return "WFLYDC0046: 从 URL %1$s 里获取输入流出错 -- %2$s";
    }
    @Override
    protected String invalidRolloutPlanLess$str() {
        return "WFLYDC0029: 无效的 rollout 计划。服务器组 %1$s 具有值为%3$s 的 %2$s；它不能小于 0。";
    }
    @Override
    protected String caughtExceptionClosingInputStream$str() {
        return "WFLYDC0007: 关闭输入流时捕获异常";
    }
    @Override
    protected String runtimeNameMustBeUnique$str() {
        return "WFLYDC0063: 服务器组 %3$s 上已经存在具有相同运行时名 %2$s 的%1$s 部署";
    }
    @Override
    protected String warnIgnoringSocketBindingGroupInclude$str() {
        return "WFLYDC0001: 忽略 Ignoring'socket-binding-group' 的 'include' 子元素 %1$s";
    }
}
