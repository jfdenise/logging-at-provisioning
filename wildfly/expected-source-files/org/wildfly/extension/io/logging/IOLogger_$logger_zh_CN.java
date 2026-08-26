package org.wildfly.extension.io.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:19+0200")
public class IOLogger_$logger_zh_CN extends IOLogger_$logger_zh implements IOLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public IOLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String printDefaults$str() {
        return "WFLYIO001: 基于 %4$d 个可用的处理器，Worker '%1$s' 已被自动配置为带有 %3$d 个任务线程的 %2$d 个 IO 线程";
    }
    @Override
    protected String printDefaultsIoThreads$str() {
        return "WFLYIO002: 基于 %3$d 个可用的处理器，'%1$s' 已被自动配置为 %2$d 个 IO 线程";
    }
    @Override
    protected String printDefaultsWorkerThreads$str() {
        return "WFLYIO003: 基于 %3$d 个可用的处理器，'%1$s' 已被自动配置为 %2$d 个最多任务线程";
    }
    @Override
    protected String lowFD$str() {
        return "WFLYIO004: 基于 %3$d 个可用的处理器，Worker '%1$s' 被自动配置为 %2$d 个最多任务线程，但您的系统没有配置足够的文件描述符以支持这个配置。除非增加文件描述符限额，否则很可能会出现应用程序性能下降。";
    }
    @Override
    protected String lowGlobalFD$str() {
        return "WFLYIO005: 您的系统用 %1$d 个文件描述符进行了配置，但您当前的应用服务器配置要求至少 %2$d 个（可能更多）；您可以进行调整，但您可能遇到稳定性问题，除非您增大这个数量。";
    }
    @Override
    protected String noMetrics$str() {
        return "WFLYIO006: 没有可用的度量";
    }
    @Override
    protected String unexpectedBindAddressConflict$str() {
        return "WFLYIO007: 尝试将目标 %2$s 绑定至 %3$s时，资源 \" %1$s\" 中出现意外绑定地址冲突：已存在 %4$s 绑定";
    }
    @Override
    protected String wrongStackSize$str() {
        return "WFLYIO008: IO worker %2$s 的堆栈值 %1$d 较低，可能会导致问题。推荐最少使用 150,000。";
    }
}
