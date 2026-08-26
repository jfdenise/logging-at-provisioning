package org.jboss.as.jmx.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:23+0200")
public class JmxLogger_$logger_zh_CN extends JmxLogger_$logger_zh implements JmxLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JmxLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String attributeNotWritable$str() {
        return "WFLYJMX0008: 属性 %1$s 不可写入";
    }
    @Override
    protected String cannotUnregisterMBeansUnderReservedDomain$str() {
        return "WFLYJMX0045: 您不能在保留域 '%1$s' 中取消注册 mbean。";
    }
    @Override
    protected String unknownChild$str() {
        return "WFLYJMX0031: 未知子元素 %1$s";
    }
    @Override
    protected String unsupportedMethod$str() {
        return "WFLYJMX0043: %1$s 不被支持";
    }
    @Override
    protected String notAuthorizedToExecuteOperation$str() {
        return "WFLYJMX0040: 未授权调用操作: '%1$s'";
    }
    @Override
    protected String errorUnregisteringMBeanWithBadCalculatedName$str() {
        return "WFLYJMX0047: 取消在保留的 JMX 域里注册的 '%1$s' MBean 时发生错误";
    }
    @Override
    protected String differentLengths$str() {
        return "WFLYJMX0012: %1$s 和 %2$s 有不同的长度";
    }
    @Override
    protected String cannotSetAttribute$str() {
        return "WFLYJMX0010: 无法设定 %1$s";
    }
    @Override
    protected String removeNotificationListenerNotAllowed$str() {
        return "WFLYJMX0051: 不支持用 ObjectName %1$s 删除通知 listener";
    }
    @Override
    protected String descriptorMBeanExpressionSupportFalse$str() {
        return "这个 MBean 不支持将表达式用于属性或操作参数，即使底层模型支持。相反解析的属性将被返回，且在写入水乡能够/调用操作时必须使用实际的类型值。";
    }
    @Override
    protected String registrationNotFound$str() {
        return "WFLYJMX0022: 没有找到路径地址 %1$s 的注册";
    }
    @Override
    protected String notAuthorizedToWriteAttribute$str() {
        return "WFLYJMX0038: 未授权写入属性: '%1$s'";
    }
    @Override
    protected String descriptorAlternateMBeanLegacy$str() {
        return "要读取解析值和写入类型属性并使用类型操作参数，请进入 %1$s";
    }
    @Override
    protected String descriptorAttributeExpressionsAllowedFalse$str() {
        return "这个属性不支持表达式";
    }
    @Override
    protected String cannotCreateObjectName$str() {
        return "WFLYJMX0009: 无法从字符串 %2$s 为地址 %1$s 创建 ObjectName";
    }
    @Override
    protected String objectNameCantBeNull$str() {
        return "WFLYJMX0032: ObjectName 不能为 null";
    }
    @Override
    protected String attributeNotFound$str() {
        return "WFLYJMX0007: 无法找到任何匹配的属性：%1$s";
    }
    @Override
    protected String compositeEntryValueDescription$str() {
        return "值";
    }
    @Override
    protected String dontKnowHowToDeserialize$str() {
        return "WFLYJMX0042: 不知如何解序列化";
    }
    @Override
    protected String compositeEntryTypeDescription$str() {
        return "条目";
    }
    @Override
    protected String descriptorAttributeExpressionsAllowedTrue$str() {
        return "这个属性支持表达式";
    }
    @Override
    protected String cannotRegisterMBeansUnderReservedDomain$str() {
        return "WFLYJMX0044: 您不能在保留域 '%1$s' 中注册 mbean";
    }
    @Override
    protected String noOperationCalled1$str() {
        return "WFLYJMX0019: 没有名为 '%1$s' 的操作";
    }
    @Override
    protected String descriptorMBeanExpressionSupportTrue$str() {
        return "这个 Mbean 支持底层模型支持的将原始表达式用于属性和操作参数。如果没有使用参数，字符串形式将转换为实际的属性值。";
    }
    @Override
    protected String propertyValue$str() {
        return "属性值";
    }
    @Override
    protected String invalidAttributeType$str() {
        return "WFLYJMX0013: '%1$s' 的无效类型";
    }
    @Override
    protected String mbeanNotFound$str() {
        return "WFLYJMX0017: 没有找到名为 %1$s 的 MBean";
    }
    @Override
    protected String noOperationCalled2$str() {
        return "WFLYJMX0020: %2$s 中没有名为 '%1$s' 的操作";
    }
    @Override
    protected String unknownValue$str() {
        return "WFLYJMX0025: 未知值 %1$s";
    }
    @Override
    protected String addNotificationListenerNotAllowed$str() {
        return "WFLYJMX0050: 不支持用 ObjectName %1$s 添加通知 listener";
    }
    @Override
    protected String compositeEntryTypeName$str() {
        return "条目";
    }
    @Override
    protected String unknownType$str() {
        return "WFLYJMX0024: 未知类型 %1$s";
    }
    @Override
    protected String cannotCreateMBeansInReservedDomain$str() {
        return "WFLYJMX0041: 您不能在保留域 '%1$s' 中生成 mbean。";
    }
    @Override
    protected String compositeEntryKeyDescription$str() {
        return "键";
    }
    @Override
    protected String compositeMapDescription$str() {
        return "这个表以 'key' 为索引";
    }
    @Override
    protected String complexCompositeEntryTypeName$str() {
        return "复杂类型";
    }
    @Override
    protected String unknownDomain$str() {
        return "WFLYJMX0029: 未知域：%1$s";
    }
    @Override
    protected String badDomainInCalculatedObjectNameException$str() {
        return "WFLYJMX0046: 来自 MBeanRegistration.preRegister() '%1$s' 的 ObjectName 位于保留的 JMX 域里";
    }
    @Override
    protected String invalidKey$str() {
        return "WFLYJMX0014: %1$s 的无效密钥 %2$s";
    }
    @Override
    protected String mbeanRegistrationFailed$str() {
        return "WFLYJMX0018: 注册 mbean [%1$s] 失败";
    }
    @Override
    protected String invalidObjectName3$str() {
        return "WFLYJMX0015: 无效 ObjectName: %1$s,%2$s; %3$s";
    }
    @Override
    protected String expressionCannotBeConvertedIntoTargeteType$str() {
        return "WFLYJMX0030: 表达式无法转换成目标类型 %1$s";
    }
    @Override
    protected String jmxConnectorNotSupported$str() {
        return "WFLYJMX0006: <jmx-connector/> 不再被支持。应该使用 <remoting-connector/> 来允许通过 JBoss Remoting 的远程连接。";
    }
    @Override
    protected String unauthorized$str() {
        return "WFLYJMX0037: 未授权的访问";
    }
    @Override
    protected String notAuthorizedToReadAttribute$str() {
        return "WFLYJMX0039: 未授权读取属性: '%1$s'";
    }
    @Override
    protected String cannotUnregisterObject$str() {
        return "WFLYJMX0004: 没有可用来取消注册的 ObjectName";
    }
    @Override
    protected String invalidObjectName2$str() {
        return "WFLYJMX0015: 无效 ObjectName: %1$s; %2$s";
    }
    @Override
    protected String removeNotificationListerWithObjectNameNotSupported$str() {
        return "WFLYJMX0049: 不支持用 ObjectName %1$s 删除通知 listener";
    }
    @Override
    protected String noHandlerCalled$str() {
        return "WFLYJMX0036: 没有名为 '%1$s' 的处理程序";
    }
    @Override
    protected String descriptorAlternateMBeanExpressions$str() {
        return "要能够设置和读取表达式，请进入 %1$s";
    }
    @Override
    protected String propertyCompositeType$str() {
        return "表示一个属性的复杂类型";
    }
    @Override
    protected String wildcardNameParameterRequired$str() {
        return "WFLYJMX0026: 添加通配符需要 name 参数";
    }
    @Override
    protected String propertyName$str() {
        return "属性名称";
    }
    @Override
    protected String complexCompositeEntryTypeDescription$str() {
        return "复杂类型";
    }
    @Override
    protected String invalidObjectName4$str() {
        return "WFLYJMX0015: 无效 ObjectName: %1$s,%2$s,%3$s; %4$s";
    }
    @Override
    protected String compositeMapName$str() {
        return "表";
    }
    @Override
    protected String addNotificationListerWithObjectNameNotSupported$str() {
        return "WFLYJMX0048: 不支持用 ObjectName %1$s 添加通知 listener";
    }
    @Override
    protected String unregistrationFailure$str() {
        return "WFLYJMX0005: 无效注册 [%1$s] 失败";
    }
}
