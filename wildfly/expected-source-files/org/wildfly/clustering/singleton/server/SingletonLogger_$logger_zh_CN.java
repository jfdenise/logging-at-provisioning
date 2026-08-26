package org.wildfly.clustering.singleton.server;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:52+0200")
public class SingletonLogger_$logger_zh_CN extends SingletonLogger_$logger_zh implements SingletonLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SingletonLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String startSingleton$str() {
        return "WFLYCLSN0001: 这个节点现在将以 %1$s 服务的单点登录提供者操作。";
    }
    @Override
    protected String stopSingleton$str() {
        return "WFLYCLSN0002: 这个节点不再作为 %1$s 服务的单例提供者操作。";
    }
    @Override
    protected String elected$str() {
        return "WFLYCLSN0003: 选择 %1$s 作为 %2$s 服务的单例提供者";
    }
    @Override
    protected String noResponseFromPrimary$str() {
        return "WFLYCLSN0004: 没有收到 %1$s 服务的主提供程序的响应，重试...";
    }
    @Override
    protected String serviceStartFailed$str() {
        return "WFLYCLSN0005: 启动 %1$s 服务失败";
    }
    @Override
    protected String quorumNotReached$str() {
        return "WFLYCLSN0006: 没有达到 %1$s 服务的 %2$d 的仲裁。将不会选择主单例提供程序。";
    }
    @Override
    protected String quorumJustReached$str() {
        return "WFLYCLSN0007: 刚好到达 %1$s 服务的 %2$d 数量。如果群集再损失一个成员，不会选择其他节点来提供这个服务。";
    }
    @Override
    protected String multiplePrimaryProvidersDetected$str() {
        return "WFLYCLSN0008: 检测到 %1$s 服务的多个主供应商：%2$s";
    }
    @Override
    protected String notStarted$str() {
        return "WFLYCLSN0009: 单例服务 %1$s 还未启动。";
    }
    @Override
    protected String noPrimaryElected$str() {
        return "WFLYCLSN0010: 没有选择节点作为 %1$s 服务的单例提供者";
    }
    @Override
    protected String invalidQuorum$str() {
        return "WFLYCLSN0011: 指定的 quorum %1$d 必须大于零。";
    }
}
