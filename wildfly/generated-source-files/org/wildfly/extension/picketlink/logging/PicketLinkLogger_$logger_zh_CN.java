package org.wildfly.extension.picketlink.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:45+0200")
public class PicketLinkLogger_$logger_zh_CN extends PicketLinkLogger_$logger_zh implements PicketLinkLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PicketLinkLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String requiredAlternativeAttributes$str() {
        return "WFLYPL0016: [%1$s] 需要属性 [%2$s] 中的一个。";
    }
    @Override
    protected String cannotMigrateNonEmptyConfiguration$str() {
        return "WFLYPL0107: 无法迁移非空 picketlink-federation 子系统配置。";
    }
    @Override
    protected String migrationFailed$str() {
        return "WFLYPL0106: 迁移失败，请查看结果获得更多细节。";
    }
    @Override
    protected String boundToJndi$str() {
        return "WFLYPL0003: 绑定 [%1$s] 到 [%2$s]";
    }
    @Override
    protected String couldNotLoadClass$str() {
        return "WFLYPL0009: 无法加载类 [%1$s]。";
    }
    @Override
    protected String attributeNoLongerSupported$str() {
        return "WFLYPL0012: 属性 [%1$s] 不再被支持。";
    }
    @Override
    protected String invalidChildTypeOccurrence$str() {
        return "WFLYPL0013: [%1$s] 只能有 [%2$d] 个类型为 [%3$s] 的子元素。";
    }
    @Override
    protected String typeAlreadyDefined$str() {
        return "WFLYPL0017: 已经定义了类型 [%1$s]。";
    }
    @Override
    protected String requiredAttribute$str() {
        return "WFLYPL0015: [%2$s] 需要属性 [%1$s]。";
    }
    @Override
    protected String federationHandlerTypeNotProvided$str() {
        return "WFLYPL0101: 没有为这个处理程序提供类型。您必须指定一个类名或代码。";
    }
    @Override
    protected String typeNotProvided$str() {
        return "WFLYPL0010: 没有为 %1$s 提供类型。必须指定一个类名或代码。";
    }
    @Override
    protected String requiredChild$str() {
        return "WFLYPL0019: [%1$s] 要求子元素 [%2$s]。";
    }
    @Override
    protected String idmNoSupportedTypesDefined$str() {
        return "WFLYPL0056: 提供了不被支持的类型。";
    }
    @Override
    protected String idmNoIdentityConfigurationProvided$str() {
        return "WFLYPL0054: 您必须提供至少一个标识符配置。";
    }
    @Override
    protected String idmNoIdentityStoreProvided$str() {
        return "WFLYPL0055: 您必须为标识符配置 [%1$s] 提供至少一个标识符库。";
    }
    @Override
    protected String invalidAlternativeAttributeOccurrence$str() {
        return "WFLYPL0014: [%2$s] 的无效属性 [%1$s] 定义。只允许下列属性中的一个：[%3$s]。";
    }
    @Override
    protected String emptyResource$str() {
        return "WFLYPL0018: [%1$s] 不能为空。";
    }
    @Override
    protected String idmLdapNoMappingDefined$str() {
        return "WFLYPL0057: 没有定义映射。";
    }
    @Override
    protected String moduleCouldNotLoad$str() {
        return "WFLYPL0007: 无法加载模块 [%1$s]。";
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "WFLYPL0105: 不能执行 migrate 操作：服务器必须处于 admin-only 模式。";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYPL0001: 激活 PicketLink %1$s 子系统";
    }
}
