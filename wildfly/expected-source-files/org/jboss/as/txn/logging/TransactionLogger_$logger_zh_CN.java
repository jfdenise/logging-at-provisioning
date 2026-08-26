package org.jboss.as.txn.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:54:08+0200")
public class TransactionLogger_$logger_zh_CN extends TransactionLogger_$logger_zh implements TransactionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public TransactionLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unableToRollBack$str() {
        return "WFLYTX0001: 不能回滚活动的事务";
    }
    @Override
    protected String unableToGetTransactionStatus$str() {
        return "WFLYTX0002: 不能获取事务状态";
    }
    @Override
    protected String transactionStillOpen$str() {
        return "WFLYTX0003: APPLICATION ERROR: 交易仍在进行，其状态为 %1$s";
    }
    @Override
    protected String createFailed$str() {
        return "WFLYTX0004: 创建失败";
    }
    @Override
    protected String managerStartFailure$str() {
        return "WFLYTX0005: %1$s 管理者创建失败";
    }
    @Override
    protected String objectStoreStartFailure$str() {
        return "WFLYTX0006: 无法配置对象存储浏览器 Bean";
    }
    @Override
    protected String serviceNotStarted$str() {
        return "WFLYTX0007: 服务尚未启动";
    }
    @Override
    protected String startFailure$str() {
        return "WFLYTX0008: 启动失败";
    }
    @Override
    protected String unknownMetric$str() {
        return "WFLYTX0009: 未知的指标数据：%1$s";
    }
    @Override
    protected String jmxSubsystemNotInstalled$str() {
        return "WFLYTX0010: 没有安装 MBean 服务器服务，如果未安装 JMX 子系统，这个功能就不可用。";
    }
    @Override
    protected String inconsistentStatisticsSettings$str() {
        return "WFLYTX0012: 属性 %1$s 和 %2$s 是两者择一的；两者不能设置为冲突的值。";
    }
    @Override
    protected String nodeIdentifierIsSetToDefault$str() {
        return "WFLYTX0013: %2$s 上的 %1$s 属性被设置为默认值。这对于运行多个服务器的环境是一种危险。请确保属性值是唯一的。";
    }
    @Override
    protected String jndiNameInvalidFormat$str() {
        return "WFLYTX0015: JNDI 名称必须以 java:/ 或 java:jboss/ 开始";
    }
    @Override
    protected String mustBeUndefinedIfTrue$str() {
        return "WFLYTX0023: 如果 %2$s 是 'true'，%1$s 必须是未定义。";
    }
    @Override
    protected String mustBedefinedIfDefined$str() {
        return "WFLYTX0024: 如果 %2$s 已定义，%1$s 必须是已定义的。";
    }
    @Override
    protected String eitherTrueOrDefined$str() {
        return "WFLYTX0025: %1$s 必须为 'true'，或者 %2$s 必须为定义的。";
    }
    @Override
    protected String transactionNotFound$str() {
        return "WFLYTX0026: 在清除期间交易 %1$s 不能从缓存删除。";
    }
    @Override
    protected String preJcaSyncAfterCompletionFailed$str() {
        return "WFLYTX0027: 在 after completion 期间和 tx %2$s 关联的 pre-Jakarta Connectors 同步 %1$s 失败。";
    }
    @Override
    protected String jcaSyncAfterCompletionFailed$str() {
        return "WFLYTX0028: 与 tx %2$s 关联的 Jakarta Connectors 同步在完成后会失败 %1$s";
    }
    @Override
    protected String syncsnotallowed$str() {
        return "WFLYTX0029: 当 tx 处于状态 %1$s 时不允许注册 Syncs";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYTX0030: 只有父资源支持有序子资源时，有索引的子资源才可以注册。'%1$s' 的父资源没有编入索引";
    }
    @Override
    protected String unsupportedAttribute$str() {
        return "WFLYTX0031: 属性 '%1$s' 不再被支持";
    }
    @Override
    protected String mustBeDefinedIfTrue$str() {
        return "WFLYTX0032: 如果 %2$s 为 'true' 时必须定义 %1$s。";
    }
    @Override
    protected String onlyOneCanBeTrue$str() {
        return "WFLYTX0033: %1$s 和 %2$s 只可以有一个为 'true'。";
    }
    @Override
    protected String objectStoreRelativeToIsSetToDefault$str() {
        return "WFLYTX0034: 对象库的 relative_to 属性被设置为包含 jboss.server.data.dir 的默认值";
    }
    @Override
    protected String cannotFindOrImportInflowTransaction$str() {
        return "WFLYTX0035: 无法为 xid %1$s 和工作 %2$s 找到或导入流入交易";
    }
    @Override
    protected String importedInflowTransactionIsInactive$str() {
        return "WFLYTX0036: 导入的 Jakarta Connectors 使用 xid %1$s 的工作流事务 %2$s 不活跃";
    }
    @Override
    protected String cannotResumeInflowTransactionUnexpectedError$str() {
        return "WFLYTX0037: 为工作 %2$s 恢复交易 %1$s 时出错";
    }
    @Override
    protected String cannotSuspendInflowTransactionUnexpectedError$str() {
        return "WFLYTX0038: 暂停工作 %1$s 的交易时出错";
    }
    @Override
    protected String timeoutValueIsSetToMaximum$str() {
        return "WFLYTX0039: 最大超时值不允许为零，因此超时已设置为 %1$s";
    }
    @Override
    protected String noActiveTransactionToRegisterSynchronization$str() {
        return "WFLYTX0040: 当前上下文中没有活动的事务来注册同步 '%1$s''";
    }
    @Override
    protected String jmxError$str() {
        return "WFLYTX0041: JMX 错误：%1$s";
    }
    @Override
    protected String transactionDiscoveryError$str() {
        return "WFLYTX0042: 事务发现错误";
    }
    @Override
    protected String unableToDetermineInboundTransactionContext$str() {
        return "WFLYTX0043: InboundTransactionCurrentImpl 无法决定入站事务上下文";
    }
    @Override
    protected String unableToSuspendInboundTransactionContext$str() {
        return "WFLYTX0044: InboundTransactionCurrentImpl 无法挂起入站事务上下文";
    }
    @Override
    protected String cannotRegister$str() {
        return "WFLYTX0045: 无法注册 InboundTransactionCurrent 实现的初始引用";
    }
}
