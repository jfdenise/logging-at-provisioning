package org.jboss.as.security.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:51+0200")
public class SecurityLogger_$logger_zh_CN extends SecurityLogger_$logger_zh implements SecurityLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SecurityLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unableToEnableJaccSupport$str() {
        return "WFLYSEC0105: 在启用了 elytron JACC 支持时，无法初始化旧的 JACC 支持。";
    }
    @Override
    protected String runtimeException$str() {
        return "WFLYSEC0007: 运行时异常：";
    }
    @Override
    protected String unsupportedOperationExceptionUseResourceDesc$str() {
        return "WFLYSEC0018: 使用 ResourceDescriptionResolver 变体";
    }
    @Override
    protected String unsupportedOperation$str() {
        return "WFLYSEC0019: 不支持的操作";
    }
    @Override
    protected String passwordAgain$str() {
        return "WFLYSEC0061: 再次输入：";
    }
    @Override
    protected String validationFailed$str() {
        return "WFLYSEC0107: %1$s 的检验失败";
    }
    @Override
    protected String xmlStreamExceptionAuth$str() {
        return "WFLYSEC0022: 安全域可使用 <authentication> 或 <authentication-jaspi> 元素，但不能同时使用。";
    }
    @Override
    protected String xmlStreamExceptionMissingAttribute$str() {
        return "WFLYSEC0023: 缺少所需属性：必须至少有 %1$s 或 %2$s";
    }
    @Override
    protected String securityException$str() {
        return "WFLYSEC0015: 安全性异常";
    }
}
