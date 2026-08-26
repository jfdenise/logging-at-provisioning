package org.jboss.as.pojo.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:09+0200")
public class PojoLogger_$logger_zh_CN extends PojoLogger_$logger_zh implements PojoLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PojoLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String oldNamespace$str() {
        return "WFLYPOJO0001: 找到旧的 bean/POJO 命名空间：%1$s - 可能会失去一些 XML 功能（可能抛出异常）。";
    }
    @Override
    protected String ignoreUninstallError$str() {
        return "WFLYPOJO0002: 忽略目标：%1$s 上的卸载动作";
    }
    @Override
    protected String invokingCallback$str() {
        return "WFLYPOJO0003: 调用 callback 错误：%1$s";
    }
    @Override
    protected String errorAtIncallback$str() {
        return "WFLYPOJO0004: 调用 incallback 错误：%1$s";
    }
    @Override
    protected String errorAtUncallback$str() {
        return "WFLYPOJO0005: 调用 uncallback 错误：%1$s";
    }
    @Override
    protected String noModuleFound$str() {
        return "WFLYPOJO0006: 为 %1$s 获取模块附件失败";
    }
    @Override
    protected String missingReflectionIndex$str() {
        return "WFLYPOJO0007: 缺少 %1$s 的部署反射索引";
    }
    @Override
    protected String failedToParse$str() {
        return "WFLYPOJO0008: 无法解析 POJO XML [%1$s]";
    }
    @Override
    protected String cannotInstantiateCollection$str() {
        return "WFLYPOJO0010: 无法实例化新的集合实例。";
    }
    @Override
    protected String cannotInstantiateMap$str() {
        return "WFLYPOJO0011: 无法实例化新的映射实例。";
    }
    @Override
    protected String tooDynamicFromFactory$str() {
        return "WFLYPOJO0012: 过于动态以致无法决定从工厂注入的类型！";
    }
    @Override
    protected String tooDynamicFromDependency$str() {
        return "WFLYPOJO0013: 过于动态以致无法决定从依赖关系注入的类型！";
    }
    @Override
    protected String notValueConfig$str() {
        return "WFLYPOJO0014: 之前的节点不是一个值配置：%1$s";
    }
    @Override
    protected String nullFactoryMethod$str() {
        return "WFLYPOJO0015: 空的工厂方法！";
    }
    @Override
    protected String nullBeanInfo$str() {
        return "WFLYPOJO0016: 空的 Bean 信息！";
    }
    @Override
    protected String invalidMatchSize$str() {
        return "WFLYPOJO0017: 无效的类型实例匹配数量：%1$s，类型：%2$s";
    }
    @Override
    protected String cannotDetermineInjectedType$str() {
        return "WFLYPOJO0018: 无法确定插入的类型：%1$s，尝试设置 class 属性（如果可以）。";
    }
    @Override
    protected String nullOrEmptyAlias$str() {
        return "WFLYPOJO0019: 空值或空的别名。";
    }
    @Override
    protected String nullOrEmptyDependency$str() {
        return "WFLYPOJO0020: 空值或空的依赖关系。";
    }
    @Override
    protected String missingValue$str() {
        return "WFLYPOJO0021: 缺少的值";
    }
    @Override
    protected String nullValue$str() {
        return "WFLYPOJO0022: 空值";
    }
    @Override
    protected String nullName$str() {
        return "WFLYPOJO0023: 空名";
    }
    @Override
    protected String nullMethodName$str() {
        return "WFLYPOJO0024: 空的方法名！";
    }
    @Override
    protected String unknownType$str() {
        return "WFLYPOJO0025: 未知类型：%1$s";
    }
    @Override
    protected String illegalParameterLength$str() {
        return "WFLYPOJO0026: 非法的参数长度：%1$s";
    }
    @Override
    protected String missingFactoryMethod$str() {
        return "WFLYPOJO0027: ctor 配置中缺少 factory 方法：%1$s";
    }
    @Override
    protected String missingBeanInfo$str() {
        return "WFLYPOJO0028: 缺少 bean 信息，设置 bean 的 class 属性：%1$s";
    }
    @Override
    protected String wrongTypeSize$str() {
        return "WFLYPOJO0029: 错误的类型大小，与参数不匹配！";
    }
    @Override
    protected String nullClassInfo$str() {
        return "WFLYPOJO0030: 空 ClassInfo！";
    }
    @Override
    protected String ctorNotFound$str() {
        return "WFLYPOJO0031: 没有此类 contructor：类 %2$s 的 %1$s";
    }
    @Override
    protected String methodNotFound$str() {
        return "WFLYPOJO0032: 没有找到类 %3$s 的方法 %1$s%2$s。";
    }
    @Override
    protected String getterNotFound$str() {
        return "WFLYPOJO0033: 没有此类 getter：类 %2$s 中的 %1$s";
    }
    @Override
    protected String setterNotFound$str() {
        return "WFLYPOJO0034: 没有此类 setter：类 %2$s 中的 %1$s";
    }
    @Override
    protected String ambiguousMatch1$str() {
        return "WFLYPOJO0035: 有歧义的匹配 %1$s。";
    }
    @Override
    protected String ambiguousMatch3$str() {
        return "WFLYPOJO0036: 类 %3$s 上的名称为 %2$s 的有歧义的匹配 %1$s 。";
    }
    @Override
    protected String fieldNotFound$str() {
        return "WFLYPOJO0037: 没有找到类 %2$s 的 %1$s 。";
    }
    @Override
    protected String parsingException$str() {
        return "WFLYPOJO0038: 解析 POJO 描述符文件 %1$s 时抛出异常";
    }
    @Override
    protected String cannotDetermineType$str() {
        return "WFLYPOJO0039: 无法确定类型 - 配置信息不足！";
    }
}
