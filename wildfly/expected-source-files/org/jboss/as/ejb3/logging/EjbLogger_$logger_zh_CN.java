package org.jboss.as.ejb3.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:32+0200")
public class EjbLogger_$logger_zh_CN extends EjbLogger_$logger_zh implements EjbLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public EjbLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String getTxManagerStatusFailed$str() {
        return "WFLYEJB0004: 获取 tx 管理者状态失败；忽略";
    }
    @Override
    protected String setRollbackOnlyFailed$str() {
        return "WFLYEJB0005: 设置只回滚失败；忽略";
    }
    @Override
    protected String activationConfigPropertyIgnored$str() {
        return "WFLYEJB0006: ActivationConfigProperty %1$s 将被忽略，因为资源适配器 %2$s 不允许它";
    }
    @Override
    protected String discardingStatefulComponent$str() {
        return "WFLYEJB0007: 由于抛出异常丢弃 stateful 组件实例 %1$s";
    }
    @Override
    protected String defaultInterceptorClassNotListed$str() {
        return "WFLYEJB0010: 在 ejb-jar.xml 的 <interceptors> 部分没有列出默认的拦截器类 %1$s，将不会被应用。";
    }
    @Override
    protected String unknownTimezoneId$str() {
        return "WFLYEJB0015: 在调度表达式里找到未知的时区 ID %1$s。忽略它并使用服务器的时区 %2$s。";
    }
    @Override
    protected String timerPersistenceNotEnable$str() {
        return "WFLYEJB0016: 未启动定时器持久化，持久性定时器在 JVM 重启后将失效";
    }
    @Override
    protected String nextExpirationIsNull$str() {
        return "WFLYEJB0017: 下一个过期设置为 null。没有为定时器 %1$S 调度任何任务。";
    }
    @Override
    protected String ignoringException$str() {
        return "WFLYEJB0018: 在 setRollbackOnly 期间忽略异常";
    }
    @Override
    protected String errorInvokeTimeout$str() {
        return "WFLYEJB0020: 定时器 %1$s 的调用超时出错";
    }
    @Override
    protected String timerRetried$str() {
        return "WFLYEJB0021: 定时器 %1$s 将被重试";
    }
    @Override
    protected String errorDuringRetryTimeout$str() {
        return "WFLYEJB0022: 在重试定时器 %1$s 的超时时出错";
    }
    @Override
    protected String retryingTimeout$str() {
        return "WFLYEJB0023: 定时器 %1$s 的重试超时";
    }
    @Override
    protected String timerNotActive$str() {
        return "WFLYEJB0024: 定时器未处于活动状态，跳过定时器 %1$s 的重试";
    }
    @Override
    protected String failToReadTimerInformation$str() {
        return "WFLYEJB0026: 无法读取 Jakarta Enterprise Beans 组件的计时器信息 %1$s";
    }
    @Override
    protected String failToRestoreTimers$str() {
        return "WFLYEJB0028: %1$s 不是一个目录，无法恢复计时器。";
    }
    @Override
    protected String failToRestoreTimersFromFile$str() {
        return "WFLYEJB0029: 无法从 %1$s 恢复计时器";
    }
    @Override
    protected String failToCloseFile$str() {
        return "WFLYEJB0030: 关闭文件出错 ";
    }
    @Override
    protected String failToRestoreTimersForObjectId$str() {
        return "WFLYEJB0031: 无法为 %1$s 恢复计时器";
    }
    @Override
    protected String failToCreateDirectoryForPersistTimers$str() {
        return "WFLYEJB0032: 无法创建目录 %1$s 来持久化 Jakarta Enterprise Beans 计时器。";
    }
    @Override
    protected String invocationFailed2$str() {
        return "WFLYEJB0034: Jakarta Enterprise Beans 调用在方法 %2$s 的组件 %1$s 上失败";
    }
    @Override
    protected String couldNotFindEjbForLocatorIIOP$str() {
        return "WFLYEJB0035: 无法找到 locator %1$s 的 Jakarta Enterprise Beans bean，Jakarta Enterprise Beans 客户端代理不会被替换";
    }
    @Override
    protected String ejbNotExposedOverIIOP$str() {
        return "WFLYEJB0036: Jakarta Enterprise Beans Bean %1$s 不会被 Stub 替代，因为它没有通过 IIOP 公开";
    }
    @Override
    protected String dynamicStubCreationFailed$str() {
        return "WFLYEJB0037: 类 %1$s 的动态的 stub 创建失败";
    }
    @Override
    protected String logMDBStart$str() {
        return "WFLYEJB0042: 用资源适配器 '%2$s' 启动消息驱动 bean '%1$s'";
    }
    @Override
    protected String skipOverlappingInvokeTimeout$str() {
        return "WFLYEJB0043: 之前执行的定时器 %1$s 仍在运行，跳过 %2$s 上已调度的重叠的执行。";
    }
    @Override
    protected String resourceAdapterRepositoryUnAvailable$str() {
        return "WFLYEJB0044: 没有可用的资源适配器库";
    }
    @Override
    protected String noSuchEndpointException$str() {
        return "WFLYEJB0045: 无法找到用于资源适配器 %1$s 的端点";
    }
    @Override
    protected String endpointUnAvailable$str() {
        return "WFLYEJB0046: 消息驱动组件 %1$s 没有可用的端点";
    }
    @Override
    protected String failureDuringEndpointDeactivation$str() {
        return "WFLYEJB0047: 无法取消激活消息驱动组件 %1$s 的端点";
    }
    @Override
    protected String failureDuringLoadOfClusterNodeSelector$str() {
        return "WFLYEJB0049: 无法为集群 %2$s 创建集群节点 selector %1$s 的实例";
    }
    @Override
    protected String failedToCreateOptionForProperty$str() {
        return "WFLYEJB0050: 由于 %2$s 解析属性 %1$s 失败";
    }
    @Override
    protected String viewNotFound$str() {
        return "WFLYEJB0051: 无法为 Jakarta Enterprise Beans %2$s 找到 view%1$s";
    }
    @Override
    protected String asyncInvocationOnlyApplicableForSessionBeans$str() {
        return "WFLYEJB0052: 无法对非 session bean 的组件执行异步的本地调用";
    }
    @Override
    protected String notStatefulSessionBean$str() {
        return "WFLYEJB0053: %1$s 不是在应用程序中有状态会话 bean ：%2$s 模块: %3$s 独特名称: %4$s";
    }
    @Override
    protected String failedToMarshalEjbParameters$str() {
        return "WFLYEJB0054: 无法编组 Jakarta Enterprise Beans 参数";
    }
    @Override
    protected String unknownDeployment$str() {
        return "WFLYEJB0055: 没有 Jakarta Enterprise Beans 的匹配部署： %1$s";
    }
    @Override
    protected String ejbNotFoundInDeployment$str() {
        return "WFLYEJB0056: 无法在匹配的部署中找到 Jakarta Enterprise Beans：%1$s";
    }
    @Override
    protected String annotationApplicableOnlyForMethods$str() {
        return "WFLYEJB0057: %1$s 注解只在方法目标上有效";
    }
    @Override
    protected String aroundTimeoutMethodExpectedWithInvocationContextParam$str() {
        return "WFLYEJB0058: 在类 %2$s 上使用 @jakarta.interceptor.AroundTimeout 注释的方法 %1$s 可以接受类型 jakarta.interceptor.InvocationContext 的单个参数";
    }
    @Override
    protected String aroundTimeoutMethodMustReturnObjectType$str() {
        return "WFLYEJB0059: 在类 %2$s 上使用 @jakarta.interceptor.AroundTimeout 注释的方法 %1$s 必须返回对象类型";
    }
    @Override
    protected String wrongTxOnThread$str() {
        return "WFLYEJB0060: 线程上的错误 tx：期望 %1$s, 实际为 %2$s";
    }
    @Override
    protected String unknownTxAttributeOnInvocation$str() {
        return "WFLYEJB0061: 调用 %2$s 上的未知事务属性 %1$s";
    }
    @Override
    protected String txRequiredForInvocation$str() {
        return "WFLYEJB0062: 对于调用 %1$s，事务是必需的。";
    }
    @Override
    protected String txPresentForNeverTxAttribute$str() {
        return "WFLYEJB0063: 永不调用中的服务器上存在事务（Enterprise Beans 3 13.6.2.6）";
    }
    @Override
    protected String failedToSetRollbackOnly$str() {
        return "WFLYEJB0064: 无法只为回滚设置事务";
    }
    @Override
    protected String viewInterfaceCannotBeNull$str() {
        return "WFLYEJB0065: View 接口不能为 null";
    }
    @Override
    protected String failedToLoadViewClassForComponent$str() {
        return "WFLYEJB0068: 无法为组件 %1$s 加载视图类";
    }
    @Override
    protected String illegalCallToEjbHomeRemove$str() {
        return "WFLYEJB0073: 对 session bean 上的 EJBHome.remove(Object) 的非法调用";
    }
    @Override
    protected String setRollbackOnlyNotAllowedForSupportsTxAttr$str() {
        return "WFLYEJB0074: Enterprise Beans 3.1 FR 13.6.2.8 setRollbackOnly 不被允许和 SUPPORTS 事务属性一起使用";
    }
    @Override
    protected String cannotCallGetPKOnSessionBean$str() {
        return "WFLYEJB0075: 无法调用 session bean 上的 getPrimaryKey";
    }
    @Override
    protected String ejb2xViewNotApplicableForSingletonBeans$str() {
        return "WFLYEJB0076: singleton beans 无法使用 Enterprise Beans 2.x 视图";
    }
    @Override
    protected String ejbLocalObjectUnavailable$str() {
        return "WFLYEJB0078: Bean %1$s 没有 EJBLocalObject";
    }
    @Override
    protected String cannotBeApplicationExceptionBecauseNotAnExceptionType$str() {
        return "WFLYEJB0079: [Enterprise Beans 3.1 spec, section 14.1.1] 类: %1$s 不能标记为应用程序异常，因为它不是类型 java.lang.Exception。";
    }
    @Override
    protected String rmiRemoteExceptionCannotBeApplicationException$str() {
        return "WFLYEJB0080: [Enterprise Beans 3.1 spec, section 14.1.1] Exception 类: %1$s 不能标记为应用程序异常，因为它是类型 java.rmi.RemoteException。";
    }
    @Override
    protected String annotationOnlyAllowedOnClass$str() {
        return "WFLYEJB0081: 只允许在类上使用注解 %1$s。%2$s 不是一个类。";
    }
    @Override
    protected String beanWithRemoteAnnotationImplementsMoreThanOneInterface$str() {
        return "WFLYEJB0082: Bean %1$s 指定了 @Remote 注解，但没有实现 1 接口。";
    }
    @Override
    protected String beanWithLocalAnnotationImplementsMoreThanOneInterface$str() {
        return "WFLYEJB0083: Bean %1$s 指定了 @Local 注解，但没有实现 1 个接口";
    }
    @Override
    protected String failedToAnalyzeRemoteInterface$str() {
        return "WFLYEJB0084: 无法分析 %1$s 的远程接口";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYEJB0085: 解析 %1$s 时抛出异常";
    }
    @Override
    protected String failedToInstallManagementResource$str() {
        return "WFLYEJB0086: 安装 %1$s 的管理资源失败";
    }
    @Override
    protected String failedToLoadViewClass$str() {
        return "WFLYEJB0087: 无法加载视图 %1$s";
    }
    @Override
    protected String couldNotDetermineEjbRefForInjectionTarget$str() {
        return "WFLYEJB0088: 无法决定注入目标 %2$s 的 ejb-ref %1$s 的类型";
    }
    @Override
    protected String couldNotDetermineEjbLocalRefForInjectionTarget$str() {
        return "WFLYEJB0089: 无法确定注入目标 %2$s 的 ejb-local-ref %1$s 的类型";
    }
    @Override
    protected String onlySetterMethodsAllowedToHaveEJBAnnotation$str() {
        return "WFLYEJB0090: @EJB 注入目标 %1$s 是无效的。只允许 setter 方法。";
    }
    @Override
    protected String nameAttributeRequiredForEJBAnnotationOnClass$str() {
        return "WFLYEJB0091: 对于类级别的注解，@EJB 属性 'name' 是必需的。类：%1$s";
    }
    @Override
    protected String beanInterfaceAttributeRequiredForEJBAnnotationOnClass$str() {
        return "WFLYEJB0092: 对于类级别的注解，@EJB 属性 'beanInterface' 是必需的。类：%1$s";
    }
    @Override
    protected String moduleNotAttachedToDeploymentUnit$str() {
        return "WFLYEJB0093: 模块还未附加到部署单元 %1$s";
    }
    @Override
    protected String mdbDoesNotImplementNorSpecifyMessageListener$str() {
        return "WFLYEJB0094: Enterprise Beans 3.1 FR 5.4.2 MessageDrivenBean %1$s 没有实现 1 接口也没有指定消息监听接口";
    }
    @Override
    protected String unknownSessionBeanType$str() {
        return "WFLYEJB0095: 未知的会话 bean 类型 %1$s";
    }
    @Override
    protected String moreThanOneMethodWithSameNameOnComponent$str() {
        return "WFLYEJB0096: 在 %1$s 上找到多个名为 %2$s 的方法";
    }
    @Override
    protected String unknownEJBLocatorType$str() {
        return "WFLYEJB0097: 未知的 Jakarta Enterprise Beans locator 类型 %1$s";
    }
    @Override
    protected String couldNotCreateCorbaObject$str() {
        return "WFLYEJB0098: 无法为 %1$s 创建 CORBA 对象";
    }
    @Override
    protected String incorrectEJBLocatorForBean$str() {
        return "WFLYEJB0099: 提供的 locator %1$s 不适用于 Jakarta Enterprise Beans %2$s";
    }
    @Override
    protected String failedToLookupORB$str() {
        return "WFLYEJB0100: 查找 java:comp/ORB 失败";
    }
    @Override
    protected String notAnObjectImpl$str() {
        return "WFLYEJB0101: %1$s 不是一个 ObjectImpl";
    }
    @Override
    protected String messageEndpointAlreadyReleased$str() {
        return "WFLYEJB0102: 消息端点 %1$s 已经被释放";
    }
    @Override
    protected String timerInvocationFailedDueToInvokerNotBeingStarted$str() {
        return "WFLYEJB0107: 定时器调用失败，调用者未启动";
    }
    @Override
    protected String invalidValueForSecondInScheduleExpression$str() {
        return "WFLYEJB0109: 秒数的无效值：%1$s";
    }
    @Override
    protected String timerInvocationRolledBack$str() {
        return "WFLYEJB0110: 定时器调用失败，事务回滚";
    }
    @Override
    protected String noJNDIBindingsForSessionBean$str() {
        return "WFLYEJB0111: 不会为 Jakarta Enterprise Beans %1$s 创建 jndi 绑定，因为没有公开视图";
    }
    @Override
    protected String sessionBeanClassCannotBeAnInterface$str() {
        return "WFLYEJB0118: [Enterprise Beans 3.1 spec, section 4.9.2] Session bean 实现类不能是接口 - %1$s 是一个接口，因此不能被当作 Session bean。";
    }
    @Override
    protected String sessionBeanClassMustBePublicNonAbstractNonFinal$str() {
        return "WFLYEJB0119: [Enterprise Beans 3.1 spec, section 4.9.2] Session bean 实现类必须是 public 的，不能是 abstract 或 final - 既然 %1$s 没有满足这个要求，它不会被当作 Session bean。";
    }
    @Override
    protected String mdbClassCannotBeAnInterface$str() {
        return "WFLYEJB0120: [Enterprise Beans 3.1 spec, section 5.6.2] 消息驱动 bean 实现类不能是接口 - %1$s 是一个接口，因此不能被当作消息驱动 bean。";
    }
    @Override
    protected String mdbClassMustBePublicNonAbstractNonFinal$str() {
        return "WFLYEJB0121: [Enterprise Beans 3.1 spec, section 5.6.2] 消息驱动 bean 实现类必须是 public 的，不能是 abstract 或 final - 既然 %1$s 没有满足这个要求，它不会被当作消息驱动 bean。";
    }
    @Override
    protected String failedToCreateDeploymentNodeSelector$str() {
        return "WFLYEJB0125: 无法创建部署节点 selector %1$s 的实例";
    }
    @Override
    protected String ejbMustHavePublicDefaultConstructor$str() {
        return "WFLYEJB0127: Jakarta Enterprise Beans %1$s 类型 %2$s 必须具有公共默认构造方法";
    }
    @Override
    protected String ejbMustNotBeInnerClass$str() {
        return "WFLYEJB0128: 类型 %2$s 的 Jakarta Enterprise Beans %1$s 不能是内部类";
    }
    @Override
    protected String ejbMustBePublicClass$str() {
        return "WFLYEJB0129: 类型 %2$s 的 Jakarta Enterprise Beans %1$s 必须声明为 public";
    }
    @Override
    protected String ejbMustNotBeFinalClass$str() {
        return "WFLYEJB0130: 类型 %2$s 的 Jakarta Enterprise Beans %1$s 不能被声明为 final";
    }
    @Override
    protected String ejbMethodMustNotBeFinalNorStatic$str() {
        return "WFLYEJB0131: Jakarta Enterprise Beans %1$s 不应该是 final 或 static 方法（%2$s）";
    }
    @Override
    protected String reentrantSingletonCreation$str() {
        return "WFLYEJB0132: Jakarta Enterprise Beans singleton %1$s 的 @PostConstruct 方法 %2$s 已递归调用";
    }
    @Override
    protected String unauthorizedAccessToUserTransaction$str() {
        return "WFLYEJB0137: 只有会话和具有 bean 管理的事务划分的消息驱动的 bean 被允许访问 UserTransaction";
    }
    @Override
    protected String timerServiceIsNotActive$str() {
        return "WFLYEJB0139: 计时器服务已被禁用。请添加 <timer-service> 条目到服务器配置的 Jakarta Enterprise Beans 部分来启用它。";
    }
    @Override
    protected String ejbHasNoTimerMethods$str() {
        return "WFLYEJB0140: 这个 Jakarta Enterprise Beans 没有超时方法";
    }
    @Override
    protected String deploymentAddListenerException$str() {
        return "WFLYEJB0141: 调用部署添加的监听器时出现异常";
    }
    @Override
    protected String deploymentRemoveListenerException$str() {
        return "WFLYEJB0142: 调用部署删除的监听器时出现异常";
    }
    @Override
    protected String failedToRemoveManagementResources$str() {
        return "WFLYEJB0143: 为 %1$s 删除管理资源失败 -- %2$s";
    }
    @Override
    protected String cobraInterfaceRepository$str() {
        return "WFLYEJB0144: %1$s 的 CORBA 接口库：%2$s";
    }
    @Override
    protected String cannotUnregisterEJBHomeFromCobra$str() {
        return "WFLYEJB0145: 无法从 CORBA 命名服务里取消 EJBHome 的注册";
    }
    @Override
    protected String cannotDeactivateHomeServant$str() {
        return "WFLYEJB0146: 无法取消激活 home servant";
    }
    @Override
    protected String cannotDeactivateBeanServant$str() {
        return "WFLYEJB0147: 无法取消激活 bean servant";
    }
    @Override
    protected String couldNotWriteMethodInvocation$str() {
        return "WFLYEJB0150: 由于以下原因，无法为 appname %3$s modulename %4$s distinctname %5$s 的名为 %2$s 的 bean 上的方法 %1$s 写方法调用失败：";
    }
    @Override
    protected String exceptionGeneratingSessionId$str() {
        return "WFLYEJB0151: 为带有调用 %2$s 的组件 %1$s 生成会话 ID 时抛出异常";
    }
    @Override
    protected String failedToGetStatus$str() {
        return "WFLYEJB0157: 获取状态失败";
    }
    @Override
    protected String failedToRollback$str() {
        return "WFLYEJB0158: 回滚失败";
    }
    @Override
    protected String transactionNotComplete2$str() {
        return "WFLYEJB0159: BMT stateful bean '%1$s' 没有正确完成用户事务 status=%2$s";
    }
    @Override
    protected String timerReinstatementFailed$str() {
        return "WFLYEJB0161: 从持久化状态重新启动定时器 '%1$s' (id=%2$s) 失败";
    }
    @Override
    protected String skipInvokeTimeoutDuringRetry$str() {
        return "WFLYEJB0162: 定时器 %1$s 之前的执行已停止，跳过 %2$s 上已调度的执行。";
    }
    @Override
    protected String couldNotCreateTable$str() {
        return "WFLYEJB0163: 无法为定时器持久化创建表";
    }
    @Override
    protected String exceptionRunningTimerTask$str() {
        return "WFLYEJB0164: 在 Jakarta Enterprise Beans %2$s 上的计时器 %1$s 运行计时器任务异常";
    }
    @Override
    protected String deprecatedAnnotation$str() {
        return "WFLYEJB0166: @%1$s 注解已被舍弃且将被忽略。";
    }
    @Override
    protected String deprecatedNamespace$str() {
        return "WFLYEJB0167: <%2$s xmlns=\"%1$s\"/> 元素将被忽略。";
    }
    @Override
    protected String couldNotFindEjb$str() {
        return "WFLYEJB0168: 无法找到 ID 为 %1$s 的 Jakarta Enterprise Beans";
    }
    @Override
    protected String componentNotSetInInterceptor$str() {
        return "WFLYEJB0169: 在 InterceptorContext: %1$s 没有设置组件";
    }
    @Override
    protected String methodNameIsNull$str() {
        return "WFLYEJB0170: 方法名不能为 null";
    }
    @Override
    protected String beanHomeInterfaceIsNull$str() {
        return "WFLYEJB0171: Bean %1$s 没有主界面";
    }
    @Override
    protected String beanLocalHomeInterfaceIsNull$str() {
        return "WFLYEJB0172: Bean %1$s 没有本地主界面";
    }
    @Override
    protected String failToCallgetRollbackOnly$str() {
        return "WFLYEJB0173: Enterprise Beans 3.1 FR 13.6.1 只有带有容器管理的事务划分的 bean 可以使用 getRollbackOnly。";
    }
    @Override
    protected String failToCallgetRollbackOnlyOnNoneTransaction$str() {
        return "WFLYEJB0174: setRollbackOnly() 需要和事务一起执行。";
    }
    @Override
    protected String failToCallgetRollbackOnlyAfterTxcompleted$str() {
        return "WFLYEJB0175: getRollbackOnly() 不被允许在事务完成后再执行 (EJBTHREE-1445)";
    }
    @Override
    protected String jndiNameCannotBeNull$str() {
        return "WFLYEJB0177: 查找时 JNDI 名称不能为 null";
    }
    @Override
    protected String noNamespaceContextSelectorAvailable$str() {
        return "WFLYEJB0178: 没有可用的 NamespaceContextSelector，无法查找 %1$s";
    }
    @Override
    protected String failToLookupJNDI$str() {
        return "WFLYEJB0179: 无法查找 JNDI 名称：%1$s";
    }
    @Override
    protected String failToLookupJNDINameSpace$str() {
        return "WFLYEJB0180: 无法查找 jndi 名称 %1$s，因为它不属于 java:app, java:module, java:comp 或 java:global 命名空间。";
    }
    @Override
    protected String failToLookupStrippedJNDI$str() {
        return "WFLYEJB0181: 无法查找上下文 %2$s 里的 JNDI 名称：%1$s";
    }
    @Override
    protected String failToCallSetRollbackOnlyOnNoneCMB$str() {
        return "WFLYEJB0182: Enterprise Beans 3.1 FR 13.6.1 只有带有容器管理的事务划分的 bean 可以使用 setRollbackOnly。";
    }
    @Override
    protected String failToCallSetRollbackOnlyWithNoTx$str() {
        return "WFLYEJB0183: 在没有事务的情况下不允许 setRollbackOnly()。";
    }
    @Override
    protected String EjbJarConfigurationIsNull$str() {
        return "WFLYEJB0184: EjbJarConfiguration 不能为 null";
    }
    @Override
    protected String SecurityRolesIsNull$str() {
        return "WFLYEJB0185: 无法设置安全角色为 null";
    }
    @Override
    protected String failToLinkFromEmptySecurityRole$str() {
        return "WFLYEJB0193: 无法从 null 或空的安全角色 %1$s 进行链接";
    }
    @Override
    protected String failToLinkToEmptySecurityRole$str() {
        return "WFLYEJB0194: 无法链接至 null 或空的安全角色 %1$s";
    }
    @Override
    protected String ejbJarConfigNotFound$str() {
        return "WFLYEJB0195: 在部署单元: %1$s 里没有找到作为附件的 EjbJarConfiguration。";
    }
    @Override
    protected String componentViewNotAvailableInContext$str() {
        return "WFLYEJB0196: 在拦截器上下文: %1$s 里没有可用的 ComponentViewInstance";
    }
    @Override
    protected String unknownResourceAdapter$str() {
        return "WFLYEJB0199: 没有以资源适配器名称 %1$s 注册资源适配器";
    }
    @Override
    protected String failToCompleteTaskBeforeTimeOut$str() {
        return "WFLYEJB0202: 任务没有在 %1$s  %2$S 里完成";
    }
    @Override
    protected String taskWasCancelled$str() {
        return "WFLYEJB0203: 任务被取消";
    }
    @Override
    protected String methodNotImplemented$str() {
        return "WFLYEJB0206: 还未实现";
    }
    @Override
    protected String unexpectedComponent$str() {
        return "WFLYEJB0213: 意外的组件%1$s，期待的组件是 %2$s";
    }
    @Override
    protected String ejbJarConfigNotBeenSet$str() {
        return "WFLYEJB0214: %1$s 里还没有设置 EjbJarConfiguration，无法为 Jakarta Enterprise Beans %2$S 创建组件创建服务";
    }
    @Override
    protected String poolConfigIsEmpty$str() {
        return "WFLYEJB0218: PoolConfig 不能为 null 或空";
    }
    @Override
    protected String failToAddClassToLocalView$str() {
        return "WFLYEJB0220: [Enterprise Beans 3.1 spec, section 4.9.7] - 无法添加视图类: %1$s 为本地视图，因为它已经标记为 bean %2$s 的远程视图。";
    }
    @Override
    protected String businessInterfaceIsNull$str() {
        return "WFLYEJB0221: 商业接口类型无法为 null";
    }
    @Override
    protected String beanComponentMissingEjbObject$str() {
        return "WFLYEJB0222: Bean %1$s 没有 %2$s";
    }
    @Override
    protected String getRollBackOnlyIsNotAllowWithSupportsAttribute$str() {
        return "WFLYEJB0223: Jakarta Enterprise Beans 3.1 FR 13.6.2.9 getRollbackOnly 不允许使用 SUPPORTS 属性";
    }
    @Override
    protected String failToCallBusinessOnNonePublicMethod$str() {
        return "WFLYEJB0224: 不是业务方法 %1$s。不要在 Jakarta Enterprise Beans 的中调用非公共方法";
    }
    @Override
    protected String componentInstanceNotAvailable$str() {
        return "WFLYEJB0225: 对于调用 %1$s 组件实例不可用";
    }
    @Override
    protected String failToObtainLock$str() {
        return "WFLYEJB0228: Enterprise Beans 3.1 FR 4.3.14.1 %1$s 上的并行访问超时 - 无法在 %2$s %3$s 内获得锁";
    }
    @Override
    protected String statefulSessionIdIsNull$str() {
        return "WFLYEJB0234: 还没有为有状态组件: %1$s 设置会话 ID";
    }
    @Override
    protected String removeMethodIsNull$str() {
        return "WFLYEJB0235: @Remove 方法标识符不能为 null";
    }
    @Override
    protected String componentNotInstanceOfSessionComponent$str() {
        return "WFLYEJB0236: 带有组件类 %2$s%n 的组件 %1$s 不是一个 %3$s 组件";
    }
    @Override
    protected String bothMethodIntAndClassNameSet$str() {
        return "WFLYEJB0237: methodIntf 和 className 都在 %1$s 上进行了设置";
    }
    @Override
    protected String failToUpgradeToWriteLock$str() {
        return "WFLYEJB0238: Enterprise Beans 3.1 PFD2 4.8.5.1.1 不允许从读锁升级为写锁";
    }
    @Override
    protected String componentIsNull$str() {
        return "WFLYEJB0239: %1$s 不能为 null";
    }
    @Override
    protected String invocationNotApplicableForMethodInvocation$str() {
        return "WFLYEJB0240: 调用上下文：无法处理 %1$s，因为其不适用方法调用。";
    }
    @Override
    protected String concurrentAccessTimeoutException$str() {
        return "WFLYEJB0241: 在 %1$s 中的 Enterprise Beans 3.1 PFD2 4.8.5.5.1 并性访问超时 -- 无法在 %2$s 中获得锁定";
    }
    @Override
    protected String failToObtainLockIllegalType$str() {
        return "WFLYEJB0242: 在 %2$s 中对于组件 %3$s 的非法锁定类型 %1$s";
    }
    @Override
    protected String noAsynchronousInvocationInProgress$str() {
        return "WFLYEJB0244: 未进行异步调用";
    }
    @Override
    protected String roleNamesIsNull$str() {
        return "WFLYEJB0255: 对于 bean: %1$s，<role-name> 在 <security-role-ref>%n 中不能为 null 或空";
    }
    @Override
    protected String defaultInterceptorsNotBindToMethod$str() {
        return "WFLYEJB0256: 默认的拦截器无法在 ejb-jar.xml 里指定绑定的方法";
    }
    @Override
    protected String twoEjbBindingsSpecifyAbsoluteOrder$str() {
        return "WFLYEJB0258: %1$s 的两个 ejb-jar.xml 指定了一个绝对的顺序";
    }
    @Override
    protected String failToFindMethodInEjbJarXml$str() {
        return "WFLYEJB0259: 无法找到 ejb-jar.xml 里引用的方法 %1$s.%2$s";
    }
    @Override
    protected String multipleMethodReferencedInEjbJarXml$str() {
        return "WFLYEJB0260: 在 ejb-jar.xml 里引用的类 %2$s 上找到多个方法 %1$s。要解决这种歧义，请指定参数类型。";
    }
    @Override
    protected String failToFindMethodWithParameterTypes$str() {
        return "WFLYEJB0261: 无法找到 ejb-jar.xml 里引用的参数类型 %3$s 的方法 %1$s.%2$s";
    }
    @Override
    protected String failToLoadComponentClass$str() {
        return "WFLYEJB0262: 无法加载组件 %1$s 的组件类";
    }
    @Override
    protected String failToMergeData$str() {
        return "WFLYEJB0264: 无法为 %1$s 合并数据";
    }
    @Override
    protected String failToLoadEjbClass$str() {
        return "WFLYEJB0265: 无法加载 Jakarta Enterprise Beans 类 %1$s";
    }
    @Override
    protected String multipleAnnotationsOnBean$str() {
        return "WFLYEJB0266: Bean %2$s 上只允许一个 %1$s 方法";
    }
    @Override
    protected String multipleCreateMethod$str() {
        return "WFLYEJB0267: 由于 home %1$s 上具有不同返回类型的多个 create* 方法，无法确定对应的隐含的 Enterprise Beans 2.x 本地接口的类型（参考 Enterprise Beans 3.1 21.4.5）%n";
    }
    @Override
    protected String failToFindEjbRefByDependsOn$str() {
        return "WFLYEJB0268: 无法找到 %1$s 里的 @DependsOn 注解引用的 Jakarta Enterprise Beans %2$s";
    }
    @Override
    protected String failToCallEjbRefByDependsOn$str() {
        return "WFLYEJB0269: %2$s 组件中的 @DependsOn 注解引用了多个名为 %1$s 的 Jakarta Enterprise Beans：%3$s";
    }
    @Override
    protected String wrongReturnTypeForAsyncMethod$str() {
        return "WFLYEJB0270: Async 方法 %1$s 没有返回 void 或 Future";
    }
    @Override
    protected String failToLoadAppExceptionClassInEjbJarXml$str() {
        return "WFLYEJB0271: 无法加载 ejb-jar.xml 里的应用程序异常类 %1$s";
    }
    @Override
    protected String invalidEjbEntityTimeout$str() {
        return "WFLYEJB0272: Jakarta Enterprise Beans %1$s 实体 bean %2$s 实现了 TimedObject，但它有一个不同的通过注解或部署描述符指定的超时方法。";
    }
    @Override
    protected String invalidEjbLocalInterface$str() {
        return "WFLYEJB0273: %1$s 没有 Enterprise Beans 2.x 本地接口";
    }
    @Override
    protected String localHomeNotAllow$str() {
        return "WFLYEJB0274: %1$s 不允许本地主界面";
    }
    @Override
    protected String failToCallEjbCreateForHomeInterface$str() {
        return "WFLYEJB0275: 无法对 Jakarta Enterprise Beans %2$s 上的主界面方法 %1$s 解析相应的 ejbCreate 或 @Init 方法";
    }
    @Override
    protected String failToGetEjbComponent$str() {
        return "WFLYEJB0276: 在当前的调用上下文 %1$s 里还没有设置 EJBComponent";
    }
    @Override
    protected String invalidScheduleValue$str() {
        return "WFLYEJB0286: 无效的调度 %1$s 值：%2$s";
    }
    @Override
    protected String invalidScheduleExpressionType$str() {
        return "WFLYEJB0291: 无效值：%1$s 因为 %2$s 不支持类型为 %3$s 的值";
    }
    @Override
    protected String invalidListValue$str() {
        return "WFLYEJB0292: 列表值只能包含一个范围或单独的值。无效值：%1$s";
    }
    @Override
    protected String invalidValuesRange$str() {
        return "WFLYEJB0294: 无效值 %1$s，有效值应该在 %2$s 和 %3$s 之间";
    }
    @Override
    protected String invokerIsNull$str() {
        return "WFLYEJB0303: 调用者不能为 null";
    }
    @Override
    protected String executorIsNull$str() {
        return "WFLYEJB0305: 执行者不能为 null";
    }
    @Override
    protected String invalidTimerParameter$str() {
        return "WFLYEJB0306: 无效的计时器参数：%1$s = %2$s";
    }
    @Override
    protected String failToInvokeTimerServiceDoLifecycle$str() {
        return "WFLYEJB0325: 无法在非单点登录的 bean 的生命周期回调方法里调用计时器服务方法";
    }
    @Override
    protected String timerIsNull$str() {
        return "WFLYEJB0326: 计时器不能为 null";
    }
    @Override
    protected String invalidTimerHandlersForPersistentTimers$str() {
        return "WFLYEJB0327: %1$s 计时器处理只对持久性计时器可用。";
    }
    @Override
    protected String noMoreTimeoutForTimer$str() {
        return "WFLYEJB0328: 定时器 %1$s 不能有更多的超时";
    }
    @Override
    protected String invalidTimerNotCalendarBaseTimer$str() {
        return "WFLYEJB0329: 定时器 %1$s 不是一个基于日历的定时器";
    }
    @Override
    protected String timerHasExpired$str() {
        return "WFLYEJB0330: 定时器 %1$s 已经超时";
    }
    @Override
    protected String timerWasCanceled$str() {
        return "WFLYEJB0331: 定时器 %1$s 被取消";
    }
    @Override
    protected String timerServiceWithIdNotRegistered$str() {
        return "WFLYEJB0338: 带有 timedObjectId: %1$s 的定时器服务没有注册";
    }
    @Override
    protected String timerHandleIsNotActive$str() {
        return "WFLYEJB0339: 使用计时器 ID 处理的计时器：%1$s，timedObjectId: %2$s 不活跃";
    }
    @Override
    protected String failToInvokegetTimeoutMethod$str() {
        return "WFLYEJB0341: 无法调用非自动定时器的定时器的 getTimeout 方法";
    }
    @Override
    protected String failToLoadDeclaringClassOfTimeOut$str() {
        return "WFLYEJB0342: 无法加载 timeout 方法的声明类 %1$s";
    }
    @Override
    protected String failToInvokeTimeout$str() {
        return "WFLYEJB0343: 因为方法 %1$s 不是一个 timeout 方法，所以无法调用 timeout 方法。";
    }
    @Override
    protected String failToCreateTimerFileStoreDir$str() {
        return "WFLYEJB0344: 无法创建定时器文件存储目录 %1$s";
    }
    @Override
    protected String timerFileStoreDirNotExist$str() {
        return "WFLYEJB0345: 定时器文件存储目录 %1$s 不存在";
    }
    @Override
    protected String invalidTimerFileStoreDir$str() {
        return "WFLYEJB0346: 定时器文件存储目录 %1$s 不是一个目录";
    }
    @Override
    protected String invalidSecurityForDomainSet$str() {
        return "WFLYEJB0347: Jakarta Enterprise Beans %1$s 为安全启用，但没有安全域集";
    }
    @Override
    protected String invalidComponentConfiguration$str() {
        return "WFLYEJB0348: %1$s 不是 Jakarta Enterprise Beans 组件";
    }
    @Override
    protected String failToLoadViewClassEjb$str() {
        return "WFLYEJB0349: 无法为 EJB %1$s 加载视图类";
    }
    @Override
    protected String invalidEjbComponent$str() {
        return "WFLYEJB0350: 使用组件类 %2$s 命名的组件 %1$s 不是 Jakarta Enterprise Beans 组件";
    }
    @Override
    protected String invalidComponentType$str() {
        return "WFLYEJB0356: Jakarta Enterprise Beans 组件类型 %1$s 不支持池";
    }
    @Override
    protected String unknownComponentType$str() {
        return "WFLYEJB0357: 未知 Jakarta Enterprise Beans 组件类型 %1$s";
    }
    @Override
    protected String failProcessInvocation$str() {
        return "WFLYEJB0363: %1$s 不能处理视图类 %2$s 的方法 %3$s。期待的视图方法为视图类 %5$s 上的 %4$s";
    }
    @Override
    protected String invocationOfMethodNotAllowed$str() {
        return "WFLYEJB0364: 对 Bean %1$s 上的方法 %2$s 的调用是不允许的";
    }
    @Override
    protected String unknownComponentDescriptionType$str() {
        return "WFLYEJB0365: 未知 Jakarta Enterprise Beans 组件描述类型 %1$s";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYEJB0366: 未知属性 %1$s";
    }
    @Override
    protected String unknownOperations$str() {
        return "WFLYEJB0367: 未知操作 %1$s";
    }
    @Override
    protected String noComponentRegisteredForAddress$str() {
        return "WFLYEJB0368: 没有为地址 %1$s 注册 Jakarta Enterprise Beans 组件";
    }
    @Override
    protected String noComponentAvailableForAddress$str() {
        return "WFLYEJB0369: 没有地址 %1$s 的 Jakarta Enterprise Beans 组件";
    }
    @Override
    protected String invalidComponentState$str() {
        return "WFLYEJB0370: 地址 %1$s 的 Jakarta Enterprise Beans 组件处于 %n 状态 %2$s，必须处于状态 %3$s";
    }
    @Override
    protected String componentClassHasMultipleTimeoutAnnotations$str() {
        return "WFLYEJB0372: 组件类 %1$s 有多个 @Timeout 注解";
    }
    @Override
    protected String currentComponentNotAEjb$str() {
        return "WFLYEJB0373: 当前组件不是 Jakarta Enterprise Beans Bean %1$s";
    }
    @Override
    protected String lifecycleMethodNotAllowed$str() {
        return "WFLYEJB0374: 在生命周期方法里不允许 %1$s";
    }
    @Override
    protected String cannotCall$str() {
        return "WFLYEJB0376: 当通过 %2$s 或 %3$s 调用时无法调用 %1$s";
    }
    @Override
    protected String notAllowedFromStatefulBeans$str() {
        return "WFLYEJB0377: stateful bean 不允许 %1$s";
    }
    @Override
    protected String failedToAcquirePermit$str() {
        return "WFLYEJB0378: 获取 %1$s %2$s 里的许可失败";
    }
    @Override
    protected String acquireSemaphoreInterrupted$str() {
        return "WFLYEJB0379: 获取信号灯被中断";
    }
    @Override
    protected String couldNotFindClassLoaderForStub$str() {
        return "WFLYEJB0382: 无法确认 stub %1$s 的 ClassLoader";
    }
    @Override
    protected String unknownMessageListenerType$str() {
        return "WFLYEJB0383: 在资源适配器 %2$s 里没有找到类型为 %1$s 的消息监听程序";
    }
    @Override
    protected String couldNotFindViewMethodOnEjb$str() {
        return "WFLYEJB0384: 无法在 Jakarta Enterprise Beans 类 %3$s 的 %2$s 视图中找到方法 %1$s";
    }
    @Override
    protected String stringParamCannotBeNullOrEmpty$str() {
        return "WFLYEJB0385: %1$s 不能为 null 或空";
    }
    @Override
    protected String cannotRemoveWhileParticipatingInTransaction$str() {
        return "WFLYEJB0386: Jakarta Enterprise Beans 4.6.4 在参与事务时无法通过企业版 Beans 2.x remove() 方法移除 Jakarta Enterprise Beans";
    }
    @Override
    protected String transactionPropagationNotSupported$str() {
        return "WFLYEJB0387: 通过 IIOP 的事务传递是不被支持的";
    }
    @Override
    protected String cannotCallMethodInAfterCompletion$str() {
        return "WFLYEJB0388: 在 afterCompletion 回调方法里无法调用方法 %1$s";
    }
    @Override
    protected String cannotCallMethod$str() {
        return "WFLYEJB0389: 当状态为 %2$s 时无法调用 %1$s";
    }
    @Override
    protected String existingSerializationGroup$str() {
        return "WFLYEJB0390: %1$s 已经和序列化组 %2$s 相关联";
    }
    @Override
    protected String incompatibleSerializationGroup$str() {
        return "WFLYEJB0391: %1$s 和序列化组 %2$s 不兼容";
    }
    @Override
    protected String cacheEntryInUse$str() {
        return "WFLYEJB0392: 缓存条目 %1$s 已在使用中";
    }
    @Override
    protected String cacheEntryNotInUse$str() {
        return "WFLYEJB0393: 缓存条目 %1$s 还未被使用";
    }
    @Override
    protected String lockAcquisitionInterrupted$str() {
        return "WFLYEJB0394: 获取%1$s 的锁失败";
    }
    @Override
    protected String duplicateSerializationGroupMember$str() {
        return "WFLYEJB0395: %1$s 已经是一个序列化组 %2$s 的成员";
    }
    @Override
    protected String missingSerializationGroupMember$str() {
        return "WFLYEJB0396: %1$s 不是一个序列化组 %2$s 的成员";
    }
    @Override
    protected String duplicateCacheEntry$str() {
        return "WFLYEJB0397: %1$s 已经存在于缓存中";
    }
    @Override
    protected String missingCacheEntry$str() {
        return "WFLYEJB0398: 缓存里缺失 %1$s";
    }
    @Override
    protected String incompatibleCaches$str() {
        return "WFLYEJB0399: 嵌套的层次结构里的不兼容的缓存实现";
    }
    @Override
    protected String passivationFailed$str() {
        return "WFLYEJB0400: 钝化 %1$s 失败";
    }
    @Override
    protected String activationFailed$str() {
        return "WFLYEJB0401: 激活 %1$s 失败";
    }
    @Override
    protected String passivationDirectoryCreationFailed$str() {
        return "WFLYEJB0402: 创建钝化目录 %1$s 失败";
    }
    @Override
    protected String passivationPathNotADirectory$str() {
        return "WFLYEJB0403: 创建钝化目录 %1$s 失败";
    }
    @Override
    protected String groupCreationContextAlreadyExists$str() {
        return "WFLYEJB0404: 组件创建上下文已经存在";
    }
    @Override
    protected String ejbNotFound3$str() {
        return "WFLYEJB0405: 没有找到接口类型为 ‘%1$s’，名为 '%2$s' 的 Jakarta Enterprise Beans 用于绑定 %3$s";
    }
    @Override
    protected String ejbNotFound2$str() {
        return "WFLYEJB0406: 没有找到接口类型为 '%1$s' 的 Jakarta Enterprise Beans 用于绑定 %2$s";
    }
    @Override
    protected String moreThanOneEjbFound4$str() {
        return "WFLYEJB0407: 多个 Jakarta Enterprise Beans 找到接口类型为 '%1$s' 的接口，名称为 '%2$s'，绑定 %3$s。找到： %4$s";
    }
    @Override
    protected String moreThanOneEjbFound3$str() {
        return "WFLYEJB0408: 找到多个 Jakarta Enterprise Beans，其接口类型为 '%1$s' 接口用于绑定 %2$s。找到： %3$s";
    }
    @Override
    protected String clusteredAnnotationIsNotApplicableForMDB$str() {
        return "WFLYEJB0409: @Clustered 注解不能和消息驱动 bean 一起使用。%1$s 失败，因为 %2$s bean 在类 %3$s 中使用 @Clustered 进行标记。";
    }
    @Override
    protected String clusteredAnnotationIsNotApplicableForEntityBean$str() {
        return "WFLYEJB0410: @Clustered 注解不能和实体 bean 一起使用。%1$s 失败，因为 %2$s bean 在类 %3$s 中用 @Clustered 进行标记";
    }
    @Override
    protected String clusteredAnnotationNotYetImplementedForSingletonBean$str() {
        return "WFLYEJB0411: @Clustered 注解目前不支持单例 Jakarta Enterprise Beans。%1$s 失败，因为 %2$s bean 在类 %3$s 中用 @Clustered 进行标记";
    }
    @Override
    protected String clusteredAnnotationIsNotApplicableForBean$str() {
        return "WFLYEJB0412: %1$s 失败，因为 %2$s bean 在类 %3$s 中不能使用 @Clustered 注解。";
    }
    @Override
    protected String sessionTypeNotSpecified$str() {
        return "WFLYEJB0413: <session-type> 没有为 Jakarta Enterprise Beans %1$s 指定。此必须存在于 ejb-jar.xml 中。";
    }
    @Override
    protected String defaultInterceptorsNotSpecifyOrder$str() {
        return "WFLYEJB0414: 默认的拦截器不能在 ejb-jar.xml 里指定 <interceptor-order> 元素";
    }
    @Override
    protected String paramCannotBeNull$str() {
        return "WFLYEJB0416: %1$s 不能为 null";
    }
    @Override
    protected String poolNameCannotBeEmptyString$str() {
        return "WFLYEJB0419: 对于 bean %1$s，池的名称不能为空字符串";
    }
    @Override
    protected String noEjbContextAvailable$str() {
        return "WFLYEJB0420: 因为没有激活的 Jakarta Enterprise Beans 调用，所以没有可用的 EjbContext";
    }
    @Override
    protected String componentIsShuttingDown$str() {
        return "WFLYEJB0421: 失效无法进行，因为组件已被关闭";
    }
    @Override
    protected String failedToCreateSessionForStatefulBean$str() {
        return "WFLYEJB0423: 无法为有状态 bean %1$s 创建会话";
    }
    @Override
    protected String unknownChannelCreationOptionType$str() {
        return "WFLYEJB0436: 未知的频道创建选项类型 %1$s";
    }
    @Override
    protected String couldNotDetermineRemoteInterfaceFromHome$str() {
        return "WFLYEJB0437: 无法为 bean %2$s 从主界面确定远程界面 %1$s";
    }
    @Override
    protected String couldNotDetermineLocalInterfaceFromLocalHome$str() {
        return "WFLYEJB0438: 无法从主界面为 bean %2$s 确定本地界面 %1$s";
    }
    @Override
    protected String unexpectedError$str() {
        return "WFLYEJB0442: 意外的错误";
    }
    @Override
    protected String transactionNotComplete1$str() {
        return "WFLYEJB0443: Enterprise Beans 3.1 FR 13.3.3: BMT bean %1$s 应该在返回前完成事务交易。";
    }
    @Override
    protected String asymmetricCacheUsage$str() {
        return "WFLYEJB0445: 检测到缓存的不对称用法";
    }
    @Override
    protected String timerIsActive$str() {
        return "WFLYEJB0446: 定时器 '%1$s' 已处于活动状态。";
    }
    @Override
    protected String transactionAlreadyRolledBack$str() {
        return "WFLYEJB0447: 交易 '%1$s' 已被回滚";
    }
    @Override
    protected String transactionInUnexpectedState$str() {
        return "WFLYEJB0448: 交易 '%1$s' 处于意外的状态 (%2$s)";
    }
    @Override
    protected String timerServiceMethodNotAllowedForSFSB$str() {
        return "WFLYEJB0449: 有状态会话 bean %1$s 上不允许 Timerservice API";
    }
    @Override
    protected String entityBeansAreNotSupported$str() {
        return "WFLYEJB0450: 实体 Bean 不再被支持，无法部署 bean %1$s。";
    }
    @Override
    protected String inconsistentAttributeNotSupported$str() {
        return "WFLYEJB0451: 当前服务器版本不支持属性 '%1$s'；只有值符合 '%2$s' 时才允许它。";
    }
    @Override
    protected String failedToPersistTimer$str() {
        return "WFLYEJB0453: 持久化定时器 %1$s 失败";
    }
    @Override
    protected String mustOnlyBeSingleContainerTransactionElementWithWildcard$str() {
        return "WFLYEJB0454: <container-transaction> 上只能有一个带有 ejb-name * 的实例。";
    }
    @Override
    protected String wildcardContainerTransactionElementsMustHaveWildcardMethodName$str() {
        return "WFLYEJB0455: <container-transaction> 使用通配符 Jakarta Enterprise Beans name * 的元素只能使用 * 方法名";
    }
    @Override
    protected String failedToRefreshTimers$str() {
        return "WFLYEJB0456: 刷新 %1$s 的定时器失败";
    }
    @Override
    protected String unexpectedErrorRolledBack$str() {
        return "WFLYEJB0457: 意外的错误";
    }
    @Override
    protected String relativeResourceAdapterNameInStandaloneModule$str() {
        return "WFLYEJB0459: 包含 Bean %2$s 的模块 %1$s 没有部署在 EAR 里，但它以相对格式指定了资源适配器 '%3$s'。";
    }
    @Override
    protected String wrongTransactionIsolationConfiguredForTimer$str() {
        return "WFLYEJB0460: 事务隔离需要等同或比 READ_COMMITTED 更严格以确保定时器运行一次且只运行一次";
    }
    @Override
    protected String timerUpdateFailedAndRollbackNotPossible$str() {
        return "WFLYEJB0461: 更新定时器失败且无法回滚事务！";
    }
    @Override
    protected String databaseDialectNotConfiguredOrDetected$str() {
        return "WFLYEJB0462: 计时器服务 database-data-store 数据库属性没有配置，且不会从连接元数据或 JDBC 驱动程序名称中检测到。";
    }
    @Override
    protected String invalidTransactionTypeForSfsbLifecycleMethod$str() {
        return "WFLYEJB0463: 类 %3$s 上的 SFSB 生命周期方法 %2$s 上的事务属性类型 %1$s 无效，有效类型是：REQUIRES_NEW 和 NOT_SUPPORTED。方法将作为 NOT_SUPPORTED 对待。";
    }
    @Override
    protected String disableDefaultEjbPermissionsCannotBeTrue$str() {
        return "WFLYEJB0464: \"disable-default-ejb-permissions\" 不能设置为 true";
    }
    @Override
    protected String profileAndRemotingEjbReceiversUsedTogether$str() {
        return "WFLYEJB0465: 无效的客户描述符配置： 'profile' 和 'remoting-ejb-receivers' 不能一起使用";
    }
    @Override
    protected String failedToProcessBusinessInterfaces$str() {
        return "WFLYEJB0466: 无法为 Jakarta Enterprise Beans 类处理业务界面 %1$s";
    }
    @Override
    protected String containerSuspended$str() {
        return "WFLYEJB0467: 请求被拒绝，因为容器已暂停";
    }
    @Override
    protected String timerInvocationFailed$str() {
        return "WFLYEJB0468: 定时器调用失败";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYEJB0469: 只有父资源支持有序子资源时，有索引的子资源才可以注册。'%1$s' 的父资源没有编入索引";
    }
    @Override
    protected String rmiIiopVoliation$str() {
        return "WFLYEJB0471: RMI/IIOP Violation: %1$s%n";
    }
    @Override
    protected String exceptionRepositoryNotFound$str() {
        return "WFLYEJB0472: 无法为 %1$s 获得异常仓库 id :%n%2$s";
    }
    @Override
    protected String jndiBindings$str() {
        return "WFLYEJB0473: 部署单元 '%2$s' 里的名为 '%1$s' 的 Session Bean 的JNDI 绑定如下：%3$s";
    }
    @Override
    protected String logInconsistentAttributeNotSupported$str() {
        return "WFLYEJB0474: 当前服务器版本不支持属性 '%1$s'；只有值符合 '%2$s' 时才允许它。这个属性应该被删除。";
    }
    @Override
    protected String mdbDeliveryStarted$str() {
        return "WFLYEJB0475: 已启动 MDB 递送：%1$s, %2$s";
    }
    @Override
    protected String mdbDeliveryStopped$str() {
        return "WFLYEJB0476: 已停止 MDB 递送：%1$s, %2$s";
    }
    @Override
    protected String missingMdbDeliveryGroup$str() {
        return "WFLYEJB0477: 缺失 MDB 递送组：%1$s";
    }
    @Override
    protected String loadedPersistentTimerInTimeout$str() {
        return "WFLYEJB0480: 为 Jakarta Enterprise Beans（%2$s）和这个节点加载的定时器（%1$s）被标记为正处于超时状态。原始的超时可能没有被处理。请使用平滑关闭来确保在关闭前完成超时任务。";
    }
    @Override
    protected String strictPoolDerivedFromWorkers$str() {
        return "WFLYEJB0481: 严格的 pool %1$s 在使用源自线程 worker 池大小的最大实例数 %2$d（每个类）。";
    }
    @Override
    protected String strictPoolDerivedFromCPUs$str() {
        return "WFLYEJB0482: 严格的 pool %1$s 在使用源自这个主机的 CPU 数量的最大实例数 %2$d（每个类）。";
    }
    @Override
    protected String mutuallyExclusiveAttributes$str() {
        return "WFLYEJB0483: 属性 %1$s 和 %2$s 是相互排斥的";
    }
    @Override
    protected String invalidTransactionTypeForMDB$str() {
        return "WFLYEJB0485: 没有为 %3$s 消息驱动的 bean 的%2$s 方法指定交易类型 %1$s。它将被作为 NOT_SUPPORTED 处理。";
    }
    @Override
    protected String remappingCacheAttributes$str() {
        return "WFLYEJB0486: 为资源 '%1$s' 的 'add' 操作定义了参数 'default-clustered-sfsb-cache'。这个参数已被弃用，它之前的行为已映射到属性 'default-sfsb-cache'。因此， 'default-sfsb-cache' 属性已被设置为 '%2$s' ，而 'default-sfsb-passivation-disabled-cache' 属性被设置为 '%3$s'。";
    }
    @Override
    protected String unexpectedInvocationState$str() {
        return "WFLYEJB0487: 意外的调用状态 %1$s";
    }
    @Override
    protected String timerNotRunning$str() {
        return "WFLYEJB0489: 无法启动未作为事务运行的定时器 %1$s";
    }
    @Override
    protected String multipleSecurityDomainsDetected$str() {
        return "WFLYEJB0490: 不支持多个安全域";
    }
    @Override
    protected String cannotBeginUserTransaction$str() {
        return "WFLYEJB0491: 事务开始请求被拒绝，因为容器已暂停";
    }
    @Override
    protected String suspensionWaitingActiveTransactions$str() {
        return "WFLYEJB0492: Jakarta Enterprise Beans 子系统暂停，等待有效事务，剩余 %1$d 个事务";
    }
    @Override
    protected String suspensionComplete$str() {
        return "WFLYEJB0493: Jakarta Enterprise Beans 子系统挂起完成";
    }
    @Override
    protected String failedToObtainSSLContext$str() {
        return "WFLYEJB0494: 无法获取 SSLContext";
    }
    @Override
    protected String scheduleExpressionDateFromTimerPersistenceInvalid$str() {
        return "WFLYEJB0495: 忽略预定的定时器表达式 ID:%1$s 的存留开始或结束日期，因为它无效：%2$s。";
    }
    @Override
    protected String failedToCreateEJBClientInterceptor$str() {
        return "WFLYEJB0496: 无法创建 Jakarta Enterprise Beans 客户端拦截器实例 %1$s";
    }
    @Override
    protected String failedToPersistTimerOnStartup$str() {
        return "WFLYEJB0497: 使定时器 %1$s 在启动阶段具有持久性失败。这很可能是因为其他集群成员做了相同的改变，应该不会对操作有影响。";
    }
    @Override
    protected String cannotReadStrictMaxPoolDerivedSize$str() {
        return "WFLYEJB0499: 无法读取派生的大小 - 无法访问服务 %1$s";
    }
    @Override
    protected String failedToActivateMdb$str() {
        return "WFLYEJB0501: 激活 MDB %1$s 失败";
    }
    @Override
    protected String exceptionCheckingIfTimerShouldRun$str() {
        return "WFLYEJB0502: 异常检查定时器 %1$s 是否应运行";
    }
    @Override
    protected String mdbOnMessageMethodCantBeFinal$str() {
        return "WFLYEJB0503: [Jakarta Enterprise Beans 3.2 spec, section 5.6.4] 消息驱动 Bean 'onMessage' 方法不能为 final（MDB：%1$s）。";
    }
    @Override
    protected String mdbOnMessageMethodCantBePrivate$str() {
        return "WFLYEJB0504: [Jakarta Enterprise Beans 3.2 spec, section 5.6.4] 消息驱动 Bean 'onMessage' 方法不能为 private（MDB：%1$s）。";
    }
    @Override
    protected String mdbOnMessageMethodCantBeStatic$str() {
        return "WFLYEJB0505: [Jakarta Enterprise Beans 3.2 spec, section 5.6.4] 消息驱动 Bean 'onMessage' 方法不能为 static（MDB：%1$s）。";
    }
    @Override
    protected String mdbCantHaveFinalizeMethod$str() {
        return "WFLYEJB0506: [Jakarta Enterprise Beans 3.2 spec, section 5.6.2] 消息驱动 Bean 不能有 'finalize' 方法。(MDB: %1$s)";
    }
    @Override
    protected String exceptionPersistPostTimerState$str() {
        return "WFLYEJB0507: 持久化定时器的状态 %1$s 失败。必须手动恢复计时器";
    }
    @Override
    protected String exceptionPersistTimerState$str() {
        return "WFLYEJB0508: 由于 %2$s，无法使计时器的状态 %1$s 持久";
    }
    @Override
    protected String clusteredEJBsBoundToINADDRANY$str() {
        return "WFLYEJB0509: 集群的 Jakarta Enterprise Beans 在节点中：%1$s 与 INADDR_ANY(%2$s) 绑定。使用一个非通配符的服务器绑定地址或为 Remoting 的连接器的相关套接字绑定中添加客户端映射项。";
    }
    @Override
    protected String missingRunAsAnnotation$str() {
        return "WFLYEJB0510: 在类 %1$s 上使用 @RunAsPrincipal 时，需要@RunAs 注解";
    }
    @Override
    protected String cannotBuildIndexForServerInterceptor$str() {
        return "WFLYEJB0511: 无法为服务器拦截器类构建反射索引 %1$s";
    }
    @Override
    protected String serverInterceptorNoEmptyConstructor$str() {
        return "WFLYEJB0512: 服务器拦截器类 %1$s 没有无参数构造程序";
    }
    @Override
    protected String serverInterceptorInvalidMethod$str() {
        return "WFLYEJB0513: 使用 %3$s 注解的服务器拦截器 %2$s 中的方法 %1$s 带有无效的签名";
    }
    @Override
    protected String cannotLoadServerInterceptorModule$str() {
        return "WFLYEJB0514: 无法加载服务器拦截器模块 %1$s";
    }
    @Override
    protected String singletonCantImplementSessionBean$str() {
        return "WFLYEJB0515: [Jakarta Enterprise Beans 3.2 规范, 4.9.2 章节] 不允许单例会话 Bean 实现 'jakarta.ejb.SessionBean' 接口。这个在 bean '%1$s' 上的接口将被忽略，并且应被删除。";
    }
    @Override
    protected String iiopBindings$str() {
        return "WFLYEJB0516: 部署单元 '%2$s' 里的名为 '%1$s' 的 Session Bean 的 IIOP 绑定如下：%3$s";
    }
    @Override
    protected String typeSpecViolation$str() {
        return "WFLYEJB0517: [Jakarta Enterprise Beans 3.2, section 4.1] 违反类 %1$s。会话 Jakarta Enterprise Beans 应该只有以下类型之一： Stateful、Stateless、Singleton。";
    }
    @Override
    protected String cannotResolveFilteredClass$str() {
        return "WFLYEJB0518: 用于解组的异常解析类 %1$s ; 它已被放进阻止列表或未允许列表";
    }
    @Override
    protected String invalidFilterSpec$str() {
        return "WFLYEJB0519: 无效的 unmarshalling 过滤器规范 %1$s ; 规格必须描述匹配模式的类或软件包名称";
    }
    @Override
    protected String missingClassInAnnotation$str() {
        return "WFLYEJB0521: 注解引用的一些类： %1$s 在类：%2$s 中缺少。";
    }
    @Override
    protected String defaultPoolExpressionCouldNotBeResolved$str() {
        return "WFLYEJB0522: 默认池名称 %1$s 无法从其值中解析： %2$s";
    }
    @Override
    protected String timerNotDeployed$str() {
        return "WFLYEJB0523: 计时器 %1$s 尚未部署";
    }
    @Override
    protected String timerCannotBeAdded$str() {
        return "WFLYEJB0524: 计时器 %1$s 不能为 null";
    }
    @Override
    protected String mappedNameNotSupported$str() {
        return "WFLYEJB0525: 不支持 Jakarta Enterprise Beans 注解中的 'mappedName'。Jakarta Enterprise Beans '%2$s' 的 %1$s 值将被忽略。";
    }
    @Override
    protected String timerNotFound$str() {
        return "WFLYEJB0526: 计时器 %1$s 不存在";
    }
    @Override
    protected String connectorNotConfiguredForEJBClientInvocations$str() {
        return "WFLYEJB0527: 为 EJB 客户端调用的远程连接器（地址 %1$s、端口 %2$s）没有正确配置，连接器必须列在 <remote/> 'connectors' 属性中，以接收 EJB 客户端调用";
    }
    @Override
    protected String ejbBusinessMethodMustBePublic$str() {
        return "WFLYEJB0528: Jakarta Enterprise Beans 商业方法 %1$s 必须是公开的";
    }
    @Override
    protected String failedToRetrieveTimerInfo$str() {
        return "WFLYEJB0529: 无法从数据库中为计时器检索信息：%1$s";
    }
    @Override
    protected String legacySecurityUnsupported$str() {
        return "WFLYEJB0530: 部署被配置为使用传统的安全域 '%1$s'，其不再被支持。";
    }
    @Override
    protected String legacyClientMappingsRegistryProviderInUse$str() {
        return "WFLYEJB0531: 没有找到 %1$s 的客户端映射注册表提供程序; 使用基于静态配置的传统提供程序";
    }
    @Override
    protected String unknownDatabaseName$str() {
        return "WFLYEJB0532: 从配置中检测到的数据库为： '%1$s'。如果这不正确，请指定正确的数据库。";
    }
    @Override
    protected String invocationFailed0$str() {
        return "WFLYEJB0533: 调用失败";
    }
    @Override
    protected String authenticationFailed$str() {
        return "WFLYEJB0534: 身份验证失败";
    }
    @Override
    protected String messageEndpointAlreadyReleasedISE$str() {
        return "WFLYEJB0535: 消息端点 %1$s 已经被释放";
    }
    @Override
    protected String unsupportedEJBReceiverProtocol$str() {
        return "WFLYEJB0536: 不支持的 EJB 接收器协议 %1$s";
    }
}
