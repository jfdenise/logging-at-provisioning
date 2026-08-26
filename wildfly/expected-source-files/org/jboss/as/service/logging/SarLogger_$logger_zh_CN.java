package org.jboss.as.service.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:13+0200")
public class SarLogger_$logger_zh_CN extends SarLogger_$logger_zh implements SarLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SarLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedExecutingLegacyMethod$str() {
        return "WFLYSAR0001: 无法执行旧的服务 %1$s 方法";
    }
    @Override
    protected String propertyNotFound$str() {
        return "WFLYSAR0002: 无法找到类型 %1$s 的 PropertyEditor";
    }
    @Override
    protected String classNotFound$str() {
        return "WFLYSAR0003: 没有找到类别";
    }
    @Override
    protected String classNotInstantiated$str() {
        return "WFLYSAR0004: 没有类别示例";
    }
    @Override
    protected String failedToGetAttachment$str() {
        return "WFLYSAR0005: 为 %2$s 获取 %1$s 附件失败";
    }
    @Override
    protected String failedXmlParsing$str() {
        return "WFLYSAR0006: 解析服务 XML [%1$s] 失败";
    }
    @Override
    protected String methodNotFound$str() {
        return "WFLYSAR0007: 没有找到 %3$s 的方法 '%1$s(%2$s)'";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYSAR0008: 缺少一个或多个所需属性：";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYSAR0009: %1$s 为 null";
    }
    @Override
    protected String propertyMethodNotFound$str() {
        return "WFLYSAR0010: 没有找到 %3$s 的属性 '%2$s' 的 %1$s 方法";
    }
    @Override
    protected String unexpectedContent$str() {
        return "WFLYSAR0011: 意外的类型 '%1$s' 的内容，名为 '%2$s'，文本为：%3$s";
    }
    @Override
    protected String failedToProcessSarChild$str() {
        return "WFLYSAR0012: 无法处理 [%1$s] 的 SAR 子归档";
    }
    @Override
    protected String malformedDependencyName$str() {
        return "WFLYSAR0013: 格式错误的依赖关系名 %1$s";
    }
    @Override
    protected String defaultConstructorNotFound$str() {
        return "WFLYSAR0014: 无法找到 %1$s 的默认构造器";
    }
    @Override
    protected String mbeanRegistrationFailed$str() {
        return "WFLYSAR0015: 注册 mbean [%1$s] 失败";
    }
    @Override
    protected String cannotUnregisterObject$str() {
        return "WFLYSAR0016: 没有可用来取消注册的 ObjectName";
    }
    @Override
    protected String unregistrationFailure$str() {
        return "WFLYSAR0017: 无法取消注册 [%1$s]";
    }
    @Override
    protected String objectSupplierNotAvailable$str() {
        return "WFLYSAR0018: 对象供应商不可用";
    }
    @Override
    protected String objectNotAvailable$str() {
        return "WFLYSAR0019: 对象不可用";
    }
    @Override
    protected String methodIsNotAccessible$str() {
        return "WFLYSAR0020: 方法无法访问";
    }
    @Override
    protected String failedToInvokeMethod$str() {
        return "WFLYSAR0021: 无法调用方法";
    }
}
