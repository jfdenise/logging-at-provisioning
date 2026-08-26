package org.wildfly.extension.elytron.oidc._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:42+0200")
public class ElytronOidcLogger_$logger_zh_CN extends ElytronOidcLogger_$logger_zh implements ElytronOidcLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ElytronOidcLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYOIDC0001: 激活 WildFly Elytron OIDC 子系统";
    }
    @Override
    protected String deploymentSecured$str() {
        return "WFLYOIDC0002: Elytron OIDC 客户端子系统覆盖部署 '%1$s'";
    }
    @Override
    protected String cannotRemoveCredential$str() {
        return "WFLYOIDC0003: 无法删除凭证。没有为部署 '%1$s' 定义凭证";
    }
    @Override
    protected String cannotUpdateCredential$str() {
        return "WFLYOIDC0004: 无法更新凭证。没有为部署 '%1$s' 定义凭证";
    }
    @Override
    protected String cannotRemoveRedirectRuntimeRule$str() {
        return "WFLYOIDC0005: 无法删除重定向重写规则。没有为部署 '%1$s' 定义的重定向重写";
    }
    @Override
    protected String cannotUpdateRedirectRuntimeRule$str() {
        return "WFLYOIDC0006: 无法更新重定向重写。没有为部署 '%1$s' 定义的重定向重写";
    }
    @Override
    protected String resourceOrClientIdMustBeConfigured$str() {
        return "WFLYOIDC0007: 必须设置 'resource' 或 'client-id'";
    }
    @Override
    protected String disableTrustManagerSetToTrue$str() {
        return "WFLYOIDC0008: 'disable-trust-manager' 属性已设为 'true'，因此在通过 HTTPS 与 OpenID 提供程序通信时，不会使用信任管理器。在生产环境中，此值应始终设置为 'false'。";
    }
    @Override
    protected String unsupportedAttribute$str() {
        return "WFLYOIDC0009: 当前的稳定性级别不支持 OIDC 属性 '%1$s'。";
    }
}
