package org.wildfly.extension.security.manager.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:24+0200")
public class SecurityManagerLogger_$logger_zh_CN extends SecurityManagerLogger_$logger_zh implements SecurityManagerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SecurityManagerLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String invalidPermissionsXMLVersion$str() {
        return "WFLYSM0002: 在 permissions 元素里发现无效的版本。发现 %1$s，期望的是 %2$s。";
    }
    @Override
    protected String invalidSubsystemConfiguration$str() {
        return "WFLYSM0003: 子系统配置错误：最大权限集 %1$s 没有暗示下列权限";
    }
    @Override
    protected String invalidDeploymentConfiguration$str() {
        return "WFLYSM0004: 部署配置错误：最大权限集 %1$s 没有暗示下列权限";
    }
    @Override
    protected String rejectedEmptyMaximumSet$str() {
        return "WFLYSM0005: 目标模型版本无法识别空的最大集合且必须拒绝它。";
    }
    @Override
    protected String unexpectedElement$str() {
        return "WFLYSM0006: 遇到意外的元素 '%1$s'";
    }
    @Override
    protected String unexpectedAttribute$str() {
        return "WFLYSM0007: 遇到意外的属性 '%1$s'";
    }
    @Override
    protected String unexpectedEndOfDocument$str() {
        return "WFLYSM0008: 文档结尾";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYSM0009: 缺少必需属性：%1$s";
    }
    @Override
    protected String missingRequiredElements$str() {
        return "WFLYSM0010: 缺少必需元素：%1$s";
    }
    @Override
    protected String unexpectedContentType$str() {
        return "WFLYSM0011: 意外的类型为 %1$s 的内容";
    }
    @Override
    protected String ignoredPermission$str() {
        return "WFLYSM0012: 以下权限无法构建并将在 %1$s 中被忽略： (class=\"%2$s\" name=\"%3$s\" actions=\"%4$s\")";
    }
}
