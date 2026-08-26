package org.wildfly.clustering.server.infinispan;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:44+0200")
public class ClusteringServerLogger_$logger_zh_CN extends ClusteringServerLogger_$logger_zh implements ClusteringServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ClusteringServerLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String commandDispatcherAlreadyExists$str() {
        return "WFLYCLSV0001: %1$s 已存在命令分派程序";
    }
    @Override
    protected String registryPurgeFailed$str() {
        return "WFLYCLSV0020: 为 %3$s 删除旧的注册条目 %1$s /%2$s 失败。";
    }
    @Override
    protected String registryListenerFailed$str() {
        return "WFLYCLSV0021: 通知 %3$s(%4$s) 事件的 %1$s/%2$s 注册表 listener 失败。";
    }
    @Override
    protected String failedToRestoreLocalRegistryEntry$str() {
        return "WFLYCLSV0022: 无法在网络分区合并之后恢复本地 %1$s/%2$s 注册条目";
    }
    @Override
    protected String serviceProviderRegistrationListenerFailed$str() {
        return "WFLYCLSV0030: 通知新的提供者 %3$s 的 %1$s/%2$s 服务提供者注册 listener 失败。";
    }
}
