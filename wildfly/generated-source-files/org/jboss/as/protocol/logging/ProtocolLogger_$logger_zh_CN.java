package org.jboss.as.protocol.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:47+0200")
public class ProtocolLogger_$logger_zh_CN extends ProtocolLogger_$logger_zh implements ProtocolLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ProtocolLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String invalidType3$str() {
        return "WFLYPRT0035: 类型可以是 %1$s 或 %2$s：%3$s";
    }
    @Override
    protected String cancelledAsyncTaskBeforeRun$str() {
        return "WFLYPRT0058: %1$s 在执行开始前取消了任务";
    }
    @Override
    protected String channelTimedOut$str() {
        return "WFLYPRT0060: 频道打开请求超时";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYPRT0003: 关闭资源 %1$s 失败";
    }
    @Override
    protected String channelClosed$str() {
        return "WFLYPRT0054: 通道关闭";
    }
    @Override
    protected String errorClosingChannel$str() {
        return "WFLYPRT0001: 关闭通道 %1$s 得到出错信息";
    }
    @Override
    protected String couldNotConnect$str() {
        return "WFLYPRT0023: 无法连接到 %1$s。该连接超时。";
    }
    @Override
    protected String operationIdAlreadyExists$str() {
        return "WFLYPRT0051: 已注册 id 为 %1$d 的操作";
    }
    @Override
    protected String failedToConnect$str() {
        return "WFLYPRT0053: 无法连接到 %1$s。该连接失败。";
    }
    @Override
    protected String noSuchRequest$str() {
        return "WFLYPRT0018: 没有与通道 %2$s 关联的请求（%1$d）";
    }
    @Override
    protected String nullExecutor$str() {
        return "WFLYPRT0052: 空 executor";
    }
    @Override
    protected String cancelledAsyncTask$str() {
        return "WFLYPRT0057: %1$s 通过中断线程 %2$s 取消了任务";
    }
    @Override
    protected String responseHandlerNotFound$str() {
        return "WFLYPRT0056: 请求 %1$s 没有响应句柄";
    }
    @Override
    protected String noSuchResponseHandler$str() {
        return "WFLYPRT0055: 请求类型 '%1$s' 没有注册处理程序。";
    }
    @Override
    protected String failedToCloseServerSocket$str() {
        return "WFLYPRT0004: 关闭服务器套接字 %1$s 失败";
    }
    @Override
    protected String deprecatedCLIConfiguration$str() {
        return "WFLYPRT0059: 您正在使用已被舍弃的方法来设置客户绑定地址。请在 CLI 里使用 \"--bind\" 参数而不是 %1$s 系统属性。";
    }
    @Override
    protected String invalidType1$str() {
        return "WFLYPRT0034: 无效类型 %1$s";
    }
    @Override
    protected String invalidByteToken$str() {
        return "WFLYPRT0030: 无效字节令牌。需要 '%1$d'，得到的是 '%2$d'。";
    }
    @Override
    protected String invalidSignature$str() {
        return "WFLYPRT0032: 无效签名 [%1$s]";
    }
}
