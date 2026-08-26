package org.wildfly.extension.datasources.agroal.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:11+0200")
public class AgroalLogger_$logger_zh_CN extends AgroalLogger_$logger_zh implements AgroalLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public AgroalLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String startedDataSource$str() {
        return "WFLYAG0101: 已启用绑定到 [%2$s] 的数据源 '%1$s'";
    }
    @Override
    protected String datasourceStartException$str() {
        return "WFLYAG0105: 启动数据源 '%1$s' 出现异常";
    }
    @Override
    protected String driverLoaded$str() {
        return "WFLYAG0501: 已为驱动 '%2$s' 加载了类 %1$s";
    }
    @Override
    protected String stoppedXADataSource$str() {
        return "WFLYAG0104: 已停止 xa-datasource '%1$s'";
    }
    @Override
    protected String missingTransactionManager$str() {
        return "WFLYAG0109: 无法启动数据源：交易管理程序缺失";
    }
    @Override
    protected String invalidConnectionProvider$str() {
        return "WFLYAG0107: 连接提供者无效。需要 java.sql.Driver 或 javax.sql.DataSource 实施。修复驱动程序的 connection-provider";
    }
    @Override
    protected String missingAttributeInDatasourceMetadata$str() {
        return "WFLYAG0403: 元素 <data-source> 必须提供属性 '%1$s'";
    }
    @Override
    protected String loadModuleException$str() {
        return "WFLYAG0502: 加载驱动程序模块 '%1$s' 失败";
    }
    @Override
    protected String jndiNameInvalidFormat$str() {
        return "WFLYAG0303: JNDI 名称必须以 java:/ 或 java:jboss/ 开头";
    }
    @Override
    protected String invalidCredentialSourceSupplier$str() {
        return "WFLYAG0111: 数据源 '%1$s' 的 CredentialSourceSupplier 无效";
    }
    @Override
    protected String unknownDatasourceServiceType$str() {
        return "WFLYAG0301: 未知数据源服务类型：%1$s";
    }
    @Override
    protected String invalidDeploymentConnectionProvider$str() {
        return "WFLYAG0401: 连接提供者无效。需要 java.sql.Driver 或 javax.sql.DataSource 实施。修复驱动程序的 connection-provider";
    }
    @Override
    protected String poolWarning$str() {
        return "WFLYAG0601: %1$s: %2$s";
    }
    @Override
    protected String invalidConnection$str() {
        return "WFLYAG0302: '%1$s' 中的连接无效";
    }
    @Override
    protected String loadClassDeploymentException$str() {
        return "WFLYAG0402: 加载连接提供者类 '%1$s' 失败";
    }
    @Override
    protected String addingDeploymentProcessors$str() {
        return "WFLYAG0001: 为 DataSourceDefinition 注解和 resource-ref 条目添加部署处理器";
    }
    @Override
    protected String invalidXAConnectionProvider$str() {
        return "WFLYAG0108: xa-datasource 需要 javax.sql.XADataSource 作为连接提供者。修复驱动程序的 connection-provider";
    }
    @Override
    protected String flushOperation$str() {
        return "WFLYAG0201: 执行清空操作，模式 %1$s";
    }
    @Override
    protected String jndiNameShouldValidate$str() {
        return "WFLYAG0304: JNDI 名称不应该包含 '//' 或以 '/' 结尾";
    }
    @Override
    protected String xaDatasourceStartException$str() {
        return "WFLYAG0106: 启动 xa-datasource '%1$s' 出现异常";
    }
    @Override
    protected String invalidAuthentication$str() {
        return "WFLYAG0110: 从数据源 '%1$s' 的身份验证上下文获取凭据出错";
    }
    @Override
    protected String loadClassException$str() {
        return "WFLYAG0503: 加载驱动程序类 '%1$s' 失败";
    }
    @Override
    protected String startedXADataSource$str() {
        return "WFLYAG0103: 已启用绑定到 [%2$s] 的 xa-datasource '%1$s'";
    }
    @Override
    protected String stoppedDataSource$str() {
        return "WFLYAG0102: 已停止数据源 '%1$s'";
    }
}
