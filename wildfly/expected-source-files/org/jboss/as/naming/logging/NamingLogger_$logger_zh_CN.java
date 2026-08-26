package org.jboss.as.naming.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:53:56+0200")
public class NamingLogger_$logger_zh_CN extends NamingLogger_$logger_zh implements NamingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public NamingLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYNAM0001: 激活 Naming 子系统";
    }
    @Override
    protected String failedToSet$str() {
        return "WFLYNAM0002: 设置 %1$s 失败";
    }
    @Override
    protected String startingService$str() {
        return "WFLYNAM0003: 启动 Naming 服务";
    }
    @Override
    protected String failedToReleaseBinderService$str() {
        return "WFLYNAM0012: 无法释放用于运行时所做的 JNDI 绑定的 binder 服务";
    }
    @Override
    protected String failedToLookupJndiViewValue$str() {
        return "WFLYNAM0013: 获取条目 %1$s 的 JNDI 视图值失败。";
    }
    @Override
    protected String cannotAddToReadOnlyPermissionCollection$str() {
        return "WFLYNAM0014: 尝试在只读 PermissionCollection 中添加 Permission";
    }
    @Override
    protected String cannotBeNull$str() {
        return "WFLYNAM0015: %1$s 不能为 null";
    }
    @Override
    protected String cannotDeferenceObject$str() {
        return "WFLYNAM0016: 不能解除参照对象";
    }
    @Override
    protected String cannotListNonContextBinding$str() {
        return "WFLYNAM0017: 无法列出非上下文绑定。";
    }
    @Override
    protected String cannotLookupLink$str() {
        return "WFLYNAM0018: 无法查找链接";
    }
    @Override
    protected String cannotResolveService1$str() {
        return "WFLYNAM0020: 无法解析服务 %1$s";
    }
    @Override
    protected String cannotResolveService3$str() {
        return "WFLYNAM0021: 无法解析工厂 %2$s 中 %1$s 的服务引用。服务状态为 %3$s。";
    }
    @Override
    protected String cannotResolveServiceBug$str() {
        return "WFLYNAM0022: 无法解析对工厂 %2$s 中 %1$s 的服务引用。这是 ServiceReferenceObjectFactory 中的一个 bug 。状态为 %3$s。";
    }
    @Override
    protected String duplicateBinding$str() {
        return "WFLYNAM0023: '%1$s' 的重复 JNDI 绑定不兼容。 [%2$s] != [%3$s]";
    }
    @Override
    protected String emptyNameNotAllowed$str() {
        return "WFLYNAM0024: 不允许使用空白名称";
    }
    @Override
    protected String entryNotRegistered$str() {
        return "WFLYNAM0025: 还没有在上下文 '%2$s' 中注册 jndi 条目 '%1$s'";
    }
    @Override
    protected String failedToDestroyRootContext$str() {
        return "WFLYNAM0026: 无法销毁 root 上下文";
    }
    @Override
    protected String failedToInstantiate$str() {
        return "WFLYNAM0027: 从类别载入程序 %3$s 中实例化 %1$s%2$s 失败";
    }
    @Override
    protected String failedToReadContextEntries$str() {
        return "WFLYNAM0028: 读取 %1$s 上下文条目失败";
    }
    @Override
    protected String failedToStart$str() {
        return "WFLYNAM0029: 启动 %1$s 失败";
    }
    @Override
    protected String illegalContextInName$str() {
        return "WFLYNAM0030: 名称中的非法上下文：%1$s";
    }
    @Override
    protected String invalidContextReference$str() {
        return "WFLYNAM0032: 无效的上下文医用。不是一个 '%1$s' 引用。";
    }
    @Override
    protected String invalidJndiName$str() {
        return "WFLYNAM0033: 必须提供有效 JNDI 名称：%1$s";
    }
    @Override
    protected String invalidLoadFactor$str() {
        return "WFLYNAM0034: 载入系数必须大于 0，且小于等于 1";
    }
    @Override
    protected String invalidPermission$str() {
        return "WFLYNAM0035: 无效权限，未知动作：%1$s";
    }
    @Override
    protected String invalidPermissionAction$str() {
        return "WFLYNAM0036: 无效权限，未知动作：%1$s";
    }
    @Override
    protected String invalidTableSize$str() {
        return "WFLYNAM0037: 不能使用负数大小表格！";
    }
    @Override
    protected String jndiViewNotAvailable$str() {
        return "WFLYNAM0038: jndi 视图只可在运行时模式中使用。";
    }
    @Override
    protected String nameNotFoundInContext$str() {
        return "WFLYNAM0039: 没有在上下文 '%1$s' 中找到名称 '%2$s'";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYNAM0041: %1$s 为 null";
    }
    @Override
    protected String objectFactoryCreationFailure$str() {
        return "WFLYNAM0042: 无法从 classloader 生成对象工厂。";
    }
    @Override
    protected String readOnlyNamingContext$str() {
        return "WFLYNAM0043: 命名上下文为只读";
    }
    @Override
    protected String serviceAlreadyBound$str() {
        return "WFLYNAM0044: 已绑定名为 [%1$s] 的服务。";
    }
    @Override
    protected String tableIsFull$str() {
        return "WFLYNAM0045: 表格已满！";
    }
    @Override
    protected String threadInterrupt$str() {
        return "WFLYNAM0046: 检索服务 %1$s 的服务引用时线程中断。";
    }
    @Override
    protected String invalidNameForContextBinding$str() {
        return "WFLYNAM0047: 上下文绑定 %1$s 的非法名称";
    }
    @Override
    protected String invalidNamespaceForBinding$str() {
        return "WFLYNAM0048: 无效的绑定名称 %1$s，名称必须以 %2$s 中的其中之一开头。";
    }
    @Override
    protected String unknownBindingType$str() {
        return "WFLYNAM0049: 未知的绑定类型 %1$s";
    }
    @Override
    protected String unsupportedSimpleBindingType$str() {
        return "WFLYNAM0050: 不支持的简单绑定类型 %1$s";
    }
    @Override
    protected String unableToTransformURLBindingValue$str() {
        return "WFLYNAM0051: 无法转换 URL 绑定值 %1$s";
    }
    @Override
    protected String couldNotLoadModule$str() {
        return "WFLYNAM0052: 无法加载模块 [%1$s]。";
    }
    @Override
    protected String couldNotLoadClassFromModule$str() {
        return "WFLYNAM0053: 无法从模块 %2$s 加载类 %1$s";
    }
    @Override
    protected String couldNotInstantiateClassInstanceFromModule$str() {
        return "WFLYNAM0054: 无法从模块 %2$s 实例化类 %1$s 的实例";
    }
    @Override
    protected String notAnInstanceOfObjectFactory$str() {
        return "WFLYNAM0055: 模块 %2$s 的类 %1$s 不是一个 ObjectFactory 实例";
    }
    @Override
    protected String resourceLookupForInjectionFailed$str() {
        return "WFLYNAM0059: 注入的资源查找失败：%1$s";
    }
    @Override
    protected String bindingTypeRequiresAttributeDefined$str() {
        return "WFLYNAM0060: 绑定类型 %1$s 要求定义名为 %2$s 的属性";
    }
    @Override
    protected String cacheNotValidForBindingType$str() {
        return "WFLYNAM0061: 绑定类型 %1$s 不能使用 'cache' 属性";
    }
    @Override
    protected String lookupError$str() {
        return "WFLYNAM0062: 查找 %1$s 失败";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYNAM0063: %1$s 服务未启动";
    }
    @Override
    protected String cannotRebindExternalContext$str() {
        return "WFLYNAM0064: 无法重新绑定外部的上下文查找";
    }
    @Override
    protected String moduleNotFound$str() {
        return "WFLYNAM0065: 无法加载模块 %1$s - 该模块或其依赖项之一缺失 [%2$s]";
    }
    @Override
    protected String failedToStartRemoteNamingService$str() {
        return "WFLYNAM0066: 无法启动远程命名服务";
    }
    @Override
    protected String failedToStopRemoteNamingService$str() {
        return "WFLYNAM0067: 无法停止远程命名服务";
    }
}
