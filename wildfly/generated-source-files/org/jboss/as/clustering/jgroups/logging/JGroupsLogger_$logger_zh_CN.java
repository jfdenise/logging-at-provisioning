package org.jboss.as.clustering.jgroups.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:06+0200")
public class JGroupsLogger_$logger_zh_CN extends JGroupsLogger_$logger_zh implements JGroupsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JGroupsLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String notFound$str() {
        return "WFLYCLJG0008: 定位 %1$s 失败";
    }
    @Override
    protected String disconnected$str() {
        return "WFLYCLJG0035: 断开的 '%1$s' 频道。'%2$s' 离开集群 '%3$s'";
    }
    @Override
    protected String unrecognizedProtocolProperty$str() {
        return "WFLYCLJG0031: 忽略未被识别的 %1$s 属性：%2$s";
    }
    @Override
    protected String connecting$str() {
        return "WFLYCLJG0032: 连接 '%1$s' 频道。'%2$s' 通过 %4$s 加入集群 '%3$s'";
    }
    @Override
    protected String parserFailure$str() {
        return "WFLYCLJG0007: 解析 %1$s 失败";
    }
    @Override
    protected String unexpectedKeyStoreEntryType$str() {
        return "WFLYCLJG0023: %1$s 密钥库条目不属于预期类型：%2$s";
    }
    @Override
    protected String legacyProtocol$str() {
        return "WFLYCLJG0030: 协议 %1$s 已过时，将自动更新为 %2$s";
    }
    @Override
    protected String keyEntryNotFound$str() {
        return "WFLYCLJG0022: 未在已配置的密钥库中找到 %1$s 条目";
    }
    @Override
    protected String unexpectedCredentialSource$str() {
        return "WFLYCLJG0025: 已配置的凭证源未引用明文密码凭证";
    }
    @Override
    protected String unableToLoadProtocolClass$str() {
        return "WFLYCLJG0016: 无法加载协议类 %1$s";
    }
    @Override
    protected String unknownMetric$str() {
        return "WFLYCLJG0015: 未知的指标数据：%1$s";
    }
    @Override
    protected String failedToResolveSocketBinding$str() {
        return "WFLYCLJG0028: 无法解析转出套接字绑定 '%1$s' 的目的地地址";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYCLJG0001: 激活 JGroups 子系统。JGroups 版本 %1$s";
    }
    @Override
    protected String connected$str() {
        return "WFLYCLJG0033: 连接的 '%1$s' 频道。'%2$s' 加入集群 '%3$s' 带有视图: %4$s";
    }
    @Override
    protected String disconnecting$str() {
        return "WFLYCLJG0034: 断开 '%1$s' 频道。'%2$s' 保留集群 '%3$s' 带有视图: %4$s";
    }
}
