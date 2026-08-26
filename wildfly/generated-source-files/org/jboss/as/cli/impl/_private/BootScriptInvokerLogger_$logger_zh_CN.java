package org.jboss.as.cli.impl._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:03+0200")
public class BootScriptInvokerLogger_$logger_zh_CN extends BootScriptInvokerLogger_$logger_zh implements BootScriptInvokerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BootScriptInvokerLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cliOutput$str() {
        return "WFLYCLI0004: CLI 执行输出：";
    }
    @Override
    protected String executeCommand$str() {
        return "WFLYCLI0006: 执行 CLI 命令 %1$s";
    }
    @Override
    protected String unexpectedException$str() {
        return "WFLYCLI0007: 处理来自 %1$s 的 CLI 命令时出现意外异常";
    }
    @Override
    protected String propertiesFileNotFound$str() {
        return "WFLYCLI0003: 无法找到 CLI 属性文件 %1$s";
    }
    @Override
    protected String unexpectedErrors$str() {
        return "WFLYCLI0008: 处理 CLI 脚本 %1$s 时出错。操作已执行，但有意外值。请参阅 %2$s 中的错误列表";
    }
    @Override
    protected String unexpectedCommandException$str() {
        return "WFLYCLI0009: 处理来自 %2$s 的 CLI 命令 %1$s 时出现意外异常";
    }
    @Override
    protected String errorProcessingScript$str() {
        return "WFLYCLI0002: 处理 CLI 脚本出错 %1$s";
    }
    @Override
    protected String doneProcessScript$str() {
        return "WFLYCLI0005: 完成处理 CLI 脚本 %1$s";
    }
    @Override
    protected String processScript$str() {
        return "WFLYCLI0001: 处理 CLI 脚本 %1$s";
    }
}
