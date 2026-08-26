package org.jboss.as.jpa.messages;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:25+0200")
public class JpaLogger_$logger_zh_CN extends JpaLogger_$logger_zh implements JpaLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JpaLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String relativePathNotFound$str() {
        return "WFLYJPA0058: 无法找到相对路径：%1$s";
    }
    @Override
    protected String cannotCloseTransactionContainerEntityManger$str() {
        return "WFLYJPA0017: 容器受管实体 manager 只能通过容器关闭（当拥有的组件关闭时在 tx/invocation 端自动清理并关闭）。";
    }
    @Override
    protected String badSynchronizationTypeCombination$str() {
        return "WFLYJPA0064: Jakarta Transactions 交易已有 'SynchronizationType.UNSYNCHRONIZED' 持久性上下文（EntityManager），但现在使用的是具有 'SynchronizationType.SYNCHRONIZED' 的组件。修改调用组件代码以加入持久性上下文（EntityManager）到事务或修改被调用的组件代码来使用 'SynchronizationType.UNSYNCHRONIZED'。请参考 JPA 规格 2.1 的 7.6.4.1 章节。带作用域的持久性单元名称=%1$s。";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYJPA0040: 无法解析 %1$s";
    }
    @Override
    protected String cannotUseExtendedPersistenceTransaction$str() {
        return "WFLYJPA0030: 在 SFSB 调用栈里找到扩展持久性上下文，但无法使用，因为事务已经有一个事务性上下文与之关联。这可以通过修改程序代码来避免，或者消除扩展的持久化上下文或事务性上下文。请参考 JPA 规格 2.0 的 7.6.3.1 章节。有作用域的持久性单元 name=%1$s，持久性上下文已经位于事务=%2$s，扩展的持久性上下文=%3$s。";
    }
    @Override
    protected String persistenceProviderNotFound$str() {
        return "WFLYJPA0057: 未找到 PersistenceProvider '%1$s'";
    }
    @Override
    protected String invalidPersistenceUnitName$str() {
        return "WFLYJPA0043: 持久性单元名称 (%1$s) 包含非法的 '%2$s' 字符";
    }
    @Override
    protected String noPUnitNameSpecifiedAndMultiplePersistenceUnits$str() {
        return "WFLYJPA0061: 没有指定持久性 unitName，在应用程序部署 %2$s 里有 %1$d 个持久化单元定义。要么修改应用程序部署使其只有一个持久性单元定义，要么为每个对持久性单元的引用指定 unitName。";
    }
    @Override
    protected String unexpectedStatisticsProblem$str() {
        return "WFLYJPA0012: 收集统计信息时出现意外的问题";
    }
    @Override
    protected String cannotGetSessionFactory$str() {
        return "WFLYJPA0020: 无法从实体管理者里获得 Hibernate 会话工厂";
    }
    @Override
    protected String illegalCallOnCloseMethod$str() {
        return "WFLYJPA0075: 从注入的受管 EntityManager 非法调用此方法";
    }
    @Override
    protected String differentSearchModuleDependencies$str() {
        return "WFLYJPA0071: 部署 '%1$s' 指定了多个 Hibernate Search 模块名（'%2$s','%3$s'）";
    }
    @Override
    protected String duplicatePersistenceUnitDefinition$str() {
        return "WFLYJPA0001: 对应用程序中 %1$s 的重复的持久性单元定义。其中一个重复的 persistence.xml 应该从应用程序里删除。应用程序部署将继续使用 %2$s 里的 persistence.xml 定义。%3$s 里的 persistence.xml 定义将被忽略。";
    }
    @Override
    protected String setterMethodOnlyAnnotation$str() {
        return "WFLYJPA0059: %1$s 注入目标无效。只允许 setter 方法：%2$s";
    }
    @Override
    protected String failedToStopPUService$str() {
        return "WFLYJPA0007: 无法停止持久性单元服务 %1$s 。";
    }
    @Override
    protected String failedToAddPersistenceUnit$str() {
        return "WFLYJPA0038: 无法为 %1$s 添加持久性单元服务";
    }
    @Override
    protected String transactionRequired$str() {
        return "WFLYJPA0060: 执行这个操作要求事务（使用事务或者作战的持久性上下文）";
    }
    @Override
    protected String resourcesOfTypeCannotBeRegistered$str() {
        return "WFLYJPA0065: 无法注册类型为 %1$s 的资源";
    }
    @Override
    protected String stoppingService$str() {
        return "WFLYJPA0004: 停止 %1$s 服务 '%2$s'";
    }
    @Override
    protected String cannotCreateAdapter$str() {
        return "WFLYJPA0018: 无法创建适配器类 '%1$s' 的实例";
    }
    @Override
    protected String readingPersistenceXml$str() {
        return "WFLYJPA0002: 读取 %1$s 的 persistence.xml";
    }
    @Override
    protected String errorGettingTransaction$str() {
        return "WFLYJPA0036: 当获取和当前线程 %1$s 关联的交易时出现错误";
    }
    @Override
    protected String cannotDeployApp$str() {
        return "WFLYJPA0019: 无法部署应用程序打包的持久性提供者 '%1$s'";
    }
    @Override
    protected String failedToGetAdapter$str() {
        return "WFLYJPA0037: 无法获取持久性提供者 '%1$s' 的适配器";
    }
    @Override
    protected String startingPersistenceUnitService$str() {
        return "WFLYJPA0010: 启动持久性单元（2 的阶段 %1$d）服务 '%2$s'";
    }
    @Override
    protected String cannotLoadPersistenceProviderIntegratorModule$str() {
        return "WFLYJPA0074: 对 %1$s 的持久性提供商集成器模块加载错误";
    }
    @Override
    protected String invalidScopedName$str() {
        return "WFLYJPA0044: jboss.as.jpa.scopedname 提示（%1$s）包含非法的 '%2$s' 字符";
    }
    @Override
    protected String persistenceProviderAdaptorModuleLoadError$str() {
        return "WFLYJPA0069: 持久性提供者适配器模块加载错误 %1$s";
    }
    @Override
    protected String classloaderHasMultipleAdapters$str() {
        return "WFLYJPA0067: 类加载器 '%1$s' 有多个持久性提供者适配器";
    }
    @Override
    protected String couldNotCreateInstanceProvider$str() {
        return "WFLYJPA0062: 无法创建持久性提供者类 %1$s 的实例";
    }
    @Override
    protected String cannotInjectResourceLocalEntityManager$str() {
        return "WFLYJPA0021: 无法使用 @PersistenceContext 注入 RESOURCE_LOCAL 容器受管 EntityManagers";
    }
    @Override
    protected String xpcOnlyFromSFSB$str() {
        return "WFLYJPA0070: 容器管理的扩展持久性上下文只能在有状态会话 bean (持久性单元 '%1$s') 里进行初始化。";
    }
    @Override
    protected String cannotLoadFromJpa$str() {
        return "WFLYJPA0025: 无法从 Jakarta Persistence 模块类加载程序加载 %1$s";
    }
    @Override
    protected String cannotLoadPersistenceProviderModule$str() {
        return "WFLYJPA0027: Persistence 提供者模块加载错误 %1$s（类 %2$s）";
    }
    @Override
    protected String persistenceUnitNotFound2$str() {
        return "WFLYJPA0033: 无法在 %2$s 里找到一个名为 %1$s 的持久性单元";
    }
    @Override
    protected String multipleAdapters$str() {
        return "WFLYJPA0048: 持久性提供者适配器模块（%1$s）具有多个适配器";
    }
    @Override
    protected String startingService$str() {
        return "WFLYJPA0003: 启动 %1$s 服务 '%2$s'";
    }
    @Override
    protected String classLevelAnnotationParameterRequired$str() {
        return "WFLYJPA0032: 类 %2$s 上的类级别 %1$s 注解必须提供一个 %3$s";
    }
    @Override
    protected String errorPreloadingDefaultProvider$str() {
        return "WFLYJPA0006: 无法加载默认的持久性提供者模块。 ";
    }
    @Override
    protected String stoppingPersistenceUnitService$str() {
        return "WFLYJPA0011: 停止持久性单元（2 的阶段 %1$d）服务 '%2$s'";
    }
    @Override
    protected String cannotCloseContainerManagedEntityManager$str() {
        return "WFLYJPA0015: 容器受管实体 manager 只能通过容器关闭（在包含的 SFSB 上调用 @remove 方法时发生）。";
    }
    @Override
    protected String resourcesOfTypeCannotBeRemoved$str() {
        return "WFLYJPA0066: 无法删除类型为 %1$s 的资源";
    }
    @Override
    protected String persistenceUnitNotFound3$str() {
        return "WFLYJPA0034: 无法在 %3$s 上找到一个名为 %1$s#%2$s 的持久性单元";
    }
    @Override
    protected String referenceCountedEntityManagerNegativeCount$str() {
        return "WFLYJPA0063: 内部错误，与扩展持久性上下文（%1$d）关联的有状态会话 Bean 的数量（%2$s）不能为负数。";
    }
    @Override
    protected String invalidClassFormat$str() {
        return "WFLYJPA0073: 类 %1$s 的字节码重写(转换)失败";
    }
    @Override
    protected String nullParameter$str() {
        return "WFLYJPA0053: 内部 %1$s 错误，传入了为 null 的 %2$s";
    }
    @Override
    protected String cannotSpecifyBoth$str() {
        return "WFLYJPA0029: 无法为 %6$s 在 %5$s 里同时指定 %1$s (%2$s) 和 %3$s (%4$s)";
    }
    @Override
    protected String childNotFound$str() {
        return "WFLYJPA0031: 无法在 '%1$s' 找到子 '%2$s'";
    }
}
