package org.jboss.as.ee.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:15+0200")
public class EeLogger_$logger_zh_CN extends EeLogger_$logger_zh implements EeLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public EeLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String nullOrEmptyResourceReferenceType$str() {
        return "WFLYEE0076: 资源引用类型不能为 null 或空";
    }
    @Override
    protected String noMessageDestination$str() {
        return "WFLYEE0092: 对于绑定 %2$s 没有名为 %1$s 的消息目的地";
    }
    @Override
    protected String propertiesNotAllowedOnGlobalModules$str() {
        return "WFLYEE0100: 全局模块可能没有指定 'annotations'、'meta-inf' 或 'services'。";
    }
    @Override
    protected String nullName$str() {
        return "WFLYEE0115: %1$s 的名称为空";
    }
    @Override
    protected String earModuleChildOfLibraryDirectory$str() {
        return "WFLYEE0097: 模块可能不是 EAR 的库目录的子模块。库目录：%1$s，模块文件名：%2$s";
    }
    @Override
    protected String annotationAttributeMissing$str() {
        return "WFLYEE0020: %1$s 注解必须提供一个 %2$s。";
    }
    @Override
    protected String cannotAddRemotingReceiver$str() {
        return "WFLYEE0139: 无法添加引用 null/empty 出站连接的远程接收器";
    }
    @Override
    protected String classDoesNotImplementAllInterfaces$str() {
        return "WFLYEE0114: Class 没有实施所有提供的接口";
    }
    @Override
    protected String executorServiceNotFound$str() {
        return "WFLYEE0120: 定位 executor 服务 '%1$s' 失败";
    }
    @Override
    protected String componentNotFound$str() {
        return "WFLYEE0045: 没有找到类型为 '%1$s' 的组件";
    }
    @Override
    protected String cannotDetermineType3$str() {
        return "WFLYEE0026: 无法决定 %1$s %2$s 的类型，请指定 %3$s。";
    }
    @Override
    protected String cannotLoad$str() {
        return "WFLYEE0027: 无法加载在 env-entry 里引用的 %1$s";
    }
    @Override
    protected String noComponentInstance$str() {
        return "WFLYEE0073: 没有关联的组件实例";
    }
    @Override
    protected String conflictingBinding$str() {
        return "WFLYEE0047: %1$s 源处不兼容的绑定冲突：%2$s";
    }
    @Override
    protected String invalidReturnType$str() {
        return "WFLYEE0064: 类 %4$s 上使用 %3$s 注解的方法 %2$s 要求的返回类型为 %1$s";
    }
    @Override
    protected String concurrentContextServiceNotInstalled$str() {
        return "WFLYEE0106: EE 并发上下文 %1$s 服务未安装。";
    }
    @Override
    protected String rollbackOfTransactionStartedInEEConcurrentInvocation$str() {
        return "WFLYEE0015: EE Concurrent 调用里启动的事务仍是打开的，启动回滚以防止泄漏。";
    }
    @Override
    protected String failedToRead2$str() {
        return "WFLYEE0055: 读取应用程序 [%2$s] 的 %1$s 条目失败";
    }
    @Override
    protected String nullResourceReference$str() {
        return "WFLYEE0077: 无法注册 null 资源引用处理器";
    }
    @Override
    protected String componentIsStopped$str() {
        return "WFLYEE0043: 组件已停止";
    }
    @Override
    protected String unsupportedModuleType$str() {
        return "WFLYEE0095: 不被支持的 EAR 模块类型 %1$s";
    }
    @Override
    protected String failedToRead4$str() {
        return "WFLYEE0057: 读取组件 [%2$s, %3$s, %4$s] 的 %1$s 条目失败";
    }
    @Override
    protected String systemErrorWhileCheckingForTransactionLeak$str() {
        return "WFLYEE0018: 当检查 EE Concurrent 调用里的事务泄漏时出现系统错误。";
    }
    @Override
    protected String priorityAlreadyExists$str() {
        return "WFLYEE0079: 无法添加 %1$s，优先级 0x %2$s 已被 %3$s 使用";
    }
    @Override
    protected String cannotDetermineType1$str() {
        return "WFLYEE0025: 无法决定 resource-env-ref %1$s 的类型";
    }
    @Override
    protected String oneGlobalDirectory$str() {
        return "WFLYEE0123: 无法添加全局目录 %1$s，因为全局目录 %2$s 已定义。";
    }
    @Override
    protected String hungTaskNotCancelled$str() {
        return "WFLYEE0130: %1$s 停滞任务 %2$s 未取消";
    }
    @Override
    protected String defaultConstructorNotFound$str() {
        return "WFLYEE0048: 无法找到 %1$s 的默认构造器";
    }
    @Override
    protected String invalidMaxThreads$str() {
        return "WFLYEE0113: max-threads 值 %1$d 不能小于 core-threads 的值 %2$d。";
    }
    @Override
    protected String failedToProcessEJBClientDescriptor$str() {
        return "WFLYEE0089: 无法处理 jboss-ejb-client.xml";
    }
    @Override
    protected String methodNotFound3$str() {
        return "WFLYEE0068: 未找到匹配 %3$s 上方法 %1$s (%2$s) 的方法";
    }
    @Override
    protected String injectionTargetNotFound$str() {
        return "WFLYEE0059: 未找到注入目标";
    }
    @Override
    protected String multipleComponentsFound$str() {
        return "WFLYEE0070: 找到了类型为 '%1$s' 的多个组件";
    }
    @Override
    protected String cannotLoadInterceptor2$str() {
        return "WFLYEE0029: 无法在组件 %2$s 上加载拦截器类 %1$s";
    }
    @Override
    protected String componentClassHasErrors$str() {
        return "WFLYEE0041: 组件 %2$s 的组件类 %1$s 有错误：%n%3$s";
    }
    @Override
    protected String unableToStartException$str() {
        return "WFLYEE0125: 无法启动 %1$s 服务";
    }
    @Override
    protected String cannotParseResourceRefUri$str() {
        return "WFLYEE0032: 无法解析 resource-ref URI: %1$s";
    }
    @Override
    protected String circularDependency$str() {
        return "WFLYEE0037: 循环依赖关系安装 %1$s";
    }
    @Override
    protected String failedToLoadJbossProperties$str() {
        return "WFLYEE0094: 加载 jboss.properties 失败";
    }
    @Override
    protected String errorEqualsCannotBeCalledBeforeResolve$str() {
        return "WFLYEE0137: 错误 resolve （）之前无法调用 equals （）";
    }
    @Override
    protected String elementAttributeMissing$str() {
        return "WFLYEE0051: %1$s 元素必须提供一个 %2$s。";
    }
    @Override
    protected String multipleMethodsFound$str() {
        return "WFLYEE0071: 找到多个匹配 %3$s 上方法 %1$s (%2$s) 的方法";
    }
    @Override
    protected String instanceDataCanOnlyBeSetDuringConstruction$str() {
        return "WFLYEE0108: 实例数据只能在构造期间进行设置";
    }
    @Override
    protected String failedToLoadConcurrencyImplementation$str() {
        return "WFLYEE0142: 无法加载 Jakarta 并发实现";
    }
    @Override
    protected String cannotResolveMethod$str() {
        return "WFLYEE0034: 无法解析带有注解 %3$s 的类 %2$s 上的方法 %1$s";
    }
    @Override
    protected String cannotConfigureComponent$str() {
        return "WFLYEE0024: 无法配置组件 %1$s";
    }
    @Override
    protected String defaultConstructorNotFoundOnComponent$str() {
        return "WFLYEE0050: 组件 %2$s 上的拦截器类 %1$s 没有默认构造器";
    }
    @Override
    protected String cannotRunScheduledTask$str() {
        return "WFLYEE0111: 因为容器被暂停，所以无法运行预定任务 %1$s。";
    }
    @Override
    protected String viewMethodNotFound$str() {
        return "WFLYEE0086: 无法在 %4$s 的视图 %3$s 上找到方法 %1$s%2$s";
    }
    @Override
    protected String methodNotFound1$str() {
        return "WFLYEE0067: 方法不存在 %1$s";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYEE0066: 无效值：'%2$s' 元素的 %1$s";
    }
    @Override
    protected String componentViewConstructionFailure$str() {
        return "WFLYEE0046: 实例化组件视图失败";
    }
    @Override
    protected String managedReferenceMethodWasNull$str() {
        return "WFLYEE0132: ManagedReference 为 null，对于注入方法 %1$s ，注入不是可选的";
    }
    @Override
    protected String invalidNamePrefix$str() {
        return "WFLYEE0127: 无效的 env 的 '%1$s' 名称端，名称不能以 '/' 前缀开头，前缀已被删除";
    }
    @Override
    protected String errorDeletingJACCPolicy$str() {
        return "WFLYEE0124: 删除 Jakarta 授权策略时出错";
    }
    @Override
    protected String failedToRollbackTransaction$str() {
        return "WFLYEE0016: 无法回滚事务。";
    }
    @Override
    protected String multipleUsesOfAllRemaining$str() {
        return "WFLYEE0134: ContextServiceDefinition.ALL_REMAINING 的多次使用";
    }
    @Override
    protected String cannotAddHTTPConnection$str() {
        return "WFLYEE0140: 无法添加引用 null/empty URI 的 HTTP 连接";
    }
    @Override
    protected String componentConstructionFailure$str() {
        return "WFLYEE0042: 构造组件实例失败";
    }
    @Override
    protected String invalidInjectionTarget$str() {
        return "WFLYEE0062: 类 %2$s 上的注入目标 %1$s 和注入类型 %3$s 不兼容";
    }
    @Override
    protected String invalidManagedBeanAbstractOrFinal$str() {
        return "WFLYEE0009: [Managed Bean 规格，章节 %1$s] Managed bean 的实现类必须不能是一个接口 - %2$s 是一个接口，因此不会被考虑为 managed bean。";
    }
    @Override
    protected String aroundInvokeAnnotationUsedTooManyTimes$str() {
        return "WFLYEE0109: 类不能声明多于一个 AroundInvoke 方法。%1$s 注解了 %2$s 方法。";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYEE0082: 服务尚未启动";
    }
    @Override
    protected String invalidSignature$str() {
        return "WFLYEE0065: 类 %3$s 上使用 %2$s 注解的方法 %1$s 的签名无效，其签名必须为 '%4$s'";
    }
    @Override
    protected String nullVar3$str() {
        return "WFLYEE0116: %1$s 在 %2$s %3$s 中为空";
    }
    @Override
    protected String factoryAlreadyExists$str() {
        return "WFLYEE0104: EE 并发上下文 %1$s 已有一个名为 %2$s 的工厂";
    }
    @Override
    protected String cannotResolve$str() {
        return "WFLYEE0002: 无法解析 %1$s %2$s";
    }
    @Override
    protected String attributeNoLongerSupported$str() {
        return "WFLYEE0131: 属性 %1$s 不再被支持。";
    }
    @Override
    protected String errorParsingEJBClientDescriptor$str() {
        return "WFLYEE0091: %1$s";
    }
    @Override
    protected String hungTaskCancelled$str() {
        return "WFLYEE0129: %1$s 停滞任务 %2$s 取消";
    }
    @Override
    protected String invalidNumberOfArguments$str() {
        return "WFLYEE0063: 类 %3$s 上使用 %2$s 注解的方法 %1$s 的参数个数无效";
    }
    @Override
    protected String cannotResolveInjectionPoint$str() {
        return "WFLYEE0033: 无法解析 web.xml 里指定类 %2$s 上的注入点 %1$s";
    }
    @Override
    protected String unsupportedExecutorServiceMetric$str() {
        return "WFLYEE0121: 不支持的属性 '%1$s'";
    }
    @Override
    protected String securityManagerNotAllowed$str() {
        return "WFLYEE0141: 在 Jakarta EE 11 或更高版本环境中不允许在启用了 SecurityManager 的情况下运行";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYEE0053: 无法解析 %1$s";
    }
    @Override
    protected String invalidCoreThreadsSize$str() {
        return "WFLYEE0112: 当 queue-length 为 %1$s 时，core-threads 值必须大于 0。";
    }
    @Override
    protected String componentAlreadyDefined$str() {
        return "WFLYEE0040: 类 '%2$s' 中的组件 '%1$s' 已在类 '%3$s' 中定义。";
    }
    @Override
    protected String cannotBeNullOrEmpty$str() {
        return "WFLYEE0023: %1$s 不能为 null 或空：%2$s";
    }
    @Override
    protected String duplicateJndiBindingFound$str() {
        return "WFLYEE0133: 根据 Jakarta EE 规范，组件 '%1$s' 的 JNDI 绑定已安装在 JNDI 名称 '%2$s' 下。冲突的类是 %3$s。解决方案包括为组件提供备用名称或重命名该类。";
    }
    @Override
    protected String factoryNotFound$str() {
        return "WFLYEE0105: EE 并发上下文 %1$s 没有一个名为 %2$s 的工厂";
    }
    @Override
    protected String serializationMustBeHandledByTheFactory$str() {
        return "WFLYEE0103: EE 并发 ContextHandle 序列化必须由工厂来处理。";
    }
    @Override
    protected String preDestroyInterceptorFailure$str() {
        return "WFLYEE0011: 调用组件类 %1$s 的 pre-destroy 拦截器时抛出异常。";
    }
    @Override
    protected String alternateDeploymentDescriptor$str() {
        return "WFLYEE0019: 无法找到 %1$s 的替代部署描述符 %2$s";
    }
    @Override
    protected String cannotProcessEarModule$str() {
        return "WFLYEE0031: 无法处理 EAR [%1$s] 的 application.xml 里的模块，没有找到模块文件 %2$s";
    }
    @Override
    protected String invalidCharacterLength$str() {
        return "WFLYEE0060: 类型为 java.lang.Character 的 %1$s 不止一个字符长度 %2$s";
    }
    @Override
    protected String huntTaskTerminationFailure$str() {
        return "WFLYEE0128: 终止 %1$s 停滞任务 %2$s 失败";
    }
    @Override
    protected String failedToRunTask$str() {
        return "WFLYEE0110: 运行调度任务失败：%1$s";
    }
    @Override
    protected String cannotLoadInterceptor1$str() {
        return "WFLYEE0028: 无法加载拦截器类 %1$s";
    }
    @Override
    protected String failureWhileRunningTask$str() {
        return "WFLYEE0136: 无法运行调度任务：%1$s";
    }
    @Override
    protected String fieldNotFound$str() {
        return "WFLYEE0058: 未找到 '%1$s' 的匹配的字段";
    }
    @Override
    protected String multipleSetterMethodsFound$str() {
        return "WFLYEE0072: 当对 env-entry 应用 <injection-target> 时，发现类 %2$s 中 %1$s 的多个 setter 方法";
    }
    @Override
    protected String componentDestroyFailure$str() {
        return "WFLYEE0006: 无法销毁组件实例 %1$s";
    }
    @Override
    protected String classOnlyAnnotation$str() {
        return "WFLYEE0038: 只允许在类上使用注解 %1$s。%2$s 不是一个类。";
    }
    @Override
    protected String moreThanOneMessageDestination$str() {
        return "WFLYEE0093: 对于绑定 %2$s 目的地，有多个名为 %1$s 的消息目的地：%3$s";
    }
    @Override
    protected String unknownAnnotationTargetType$str() {
        return "WFLYEE0084: 未知的注解目标类型: %1$s";
    }
    @Override
    protected String unexpectedElement$str() {
        return "WFLYEE0088: 遇到意外的元素 '%1$s'";
    }
    @Override
    protected String cannotAddMoreItems$str() {
        return "WFLYEE0021: 一旦调用了 getSortedItems()，无法再添加更多的条目";
    }
    @Override
    protected String hungTaskTerminationPeriodIsNotBiggerThanZero$str() {
        return "WFLYEE0138: hungTaskTerminationPeriod not > 0";
    }
    @Override
    protected String setterMethodOnly$str() {
        return "WFLYEE0083: %1$s 注入目标是无效的。只允许 setter 方法：%2$s";
    }
    @Override
    protected String concurrentServiceValueUninitialized$str() {
        return "WFLYEE0102: EE 并发服务的值未初始化。";
    }
    @Override
    protected String methodOnlyAnnotation$str() {
        return "WFLYEE0069: @%1$s 只在方法目标上有效。";
    }
    @Override
    protected String managedReferenceWasNull$str() {
        return "WFLYEE0098: ManagedReferene 为 null 且注入对于字段 %1$s 不是可选的";
    }
    @Override
    protected String cannotSetField$str() {
        return "WFLYEE0117: 无法设置字段 %1$s - 由 %3$s 加载的对象 %2$s 不可分配给由 %5$s 加载的 %4$s";
    }
    @Override
    protected String lifecycleOperationNotSupported$str() {
        return "WFLYEE0143: 不支持生命周期操作";
    }
    @Override
    protected String invalidDescriptor$str() {
        return "WFLYEE0061: %1$s 不是一个有效的描述符";
    }
    @Override
    protected String failedToInstallComponent$str() {
        return "WFLYEE0052: 无法安装组件 %1$s";
    }
    @Override
    protected String globalDirectoryDoNotExist$str() {
        return "WFLYEE0122: %1$s 全局目录资源中的目录路径 %2$s 没有指向一个有效的目录。";
    }
    @Override
    protected String failedToProcessChild$str() {
        return "WFLYEE0054: 无法处理 EAR [%1$s] 的子模块";
    }
    @Override
    protected String componentNotAvailable$str() {
        return "WFLYEE0044: 组件不可用（被中断）";
    }
    @Override
    protected String xmlErrorParsingEJBClientDescriptor$str() {
        return "WFLYEE0090: 在解析 %1$s 处找到的 jboss-ejb-client.xml 文件时抛出异常";
    }
    @Override
    protected String failedToSuspendTransaction$str() {
        return "WFLYEE0017: 无法暂停事务。";
    }
    @Override
    protected String nullOrEmptyManagedBeanClassName$str() {
        return "WFLYEE0075: 受管 Bean 类名不能为 null 或空";
    }
    @Override
    protected String unknownElementType$str() {
        return "WFLYEE0085: 未知 %1$s 类型 %2$s";
    }
    @Override
    protected String failedToResumeTransaction$str() {
        return "WFLYEE0135: 无法恢复事务。";
    }
    @Override
    protected String subdeploymentIgnored$str() {
        return "WFLYEE0014: 子部署里的 %1$s 被忽略。jboss-ejb-client.xml 只对于顶层部署进行解析。";
    }
    @Override
    protected String cannotBeEmpty$str() {
        return "WFLYEE0022: %1$s 可能不为空";
    }
    @Override
    protected String cannotSpecifyBoth$str() {
        return "WFLYEE0036: 无法在一个环境条目里同时指定 %1$s 和 %2$s";
    }
    @Override
    protected String nullBindingName$str() {
        return "WFLYEE0074: 绑定名必须不为 null：%1$s";
    }
    @Override
    protected String rejectedDueToMaxRequests$str() {
        return "WFLYEE0126: 由于请求数量上限而拒绝";
    }
    @Override
    protected String nullVar1$str() {
        return "WFLYEE0078: %1$s 为 null";
    }
    @Override
    protected String cannotLoadViewClass$str() {
        return "WFLYEE0030: 无法加载组件 %2$s 的 view 类 %1$s";
    }
    @Override
    protected String failedToRead3$str() {
        return "WFLYEE0056: 读取模块 [%2$s, %3$s] 的 %1$s 条目失败";
    }
    @Override
    protected String invalidManagedBeanInterface$str() {
        return "WFLYEE0010: [Managed Bean 规格，章节 %1$s] Managed bean 的实现类必须不能是 abstract 或 final - 既然 %2$s 没有满足这个要求，它不会被考虑为 managed bean。";
    }
    @Override
    protected String componentInstallationFailure$str() {
        return "WFLYEE0007: 由于有异常抛出（请启用 DEBUG 日志级别以查看原因），没有安装可选组件 %1$s。";
    }
    @Override
    protected String rootAsLibraryDirectory$str() {
        return "WFLYEE0096: library-directory 值不被支持";
    }
    @Override
    protected String transactionSetupProviderServiceNotInstalled$str() {
        return "WFLYEE0107: EE 并发事务设置提供商服务未安装。";
    }
}
