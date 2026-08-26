package org.wildfly.extension.microprofile.config.smallrye._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:31+0200")
public class MicroProfileConfigLogger_$logger_zh_CN extends MicroProfileConfigLogger_$logger_zh implements MicroProfileConfigLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileConfigLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYCONF0001: 激活 MicroProfile 配置子系统";
    }
    @Override
    protected String unableToLoadClassFromModule$str() {
        return "WFLYCONF0002: 无法从模块 %2$s 加载类 %1$s";
    }
    @Override
    protected String loadConfigSourceFromClass$str() {
        return "WFLYCONF0004: 使用 MicroProfile 配置源的类：%1$s";
    }
    @Override
    protected String loadConfigSourceRootFromDir$str() {
        return "WFLYCONF0009: 使用 MicroProfile 配置源根的目录：%1$s";
    }
    @Override
    protected String loadConfigSourceFromDir$str() {
        return "WFLYCONF0003: 使用 MicroProfile 配置源的目录：%1$s";
    }
    @Override
    protected String logDirectoriesUnderConfigSourceRoot$str() {
        return "WFLYCONF0010: MicroProfile 配置源根目录 '%1$s' 包含以下目录，它们将被用作 MicroProfile 配置源：%2$s";
    }
}
