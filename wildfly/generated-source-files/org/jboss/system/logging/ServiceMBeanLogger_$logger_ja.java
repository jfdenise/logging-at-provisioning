package org.jboss.system.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:52+0200")
public class ServiceMBeanLogger_$logger_ja extends ServiceMBeanLogger_$logger implements ServiceMBeanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ServiceMBeanLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unknownLifecycleMethod$str() {
        return "WFLYSYSJMX0002: 不明なライフサイクルメソッド %1$s";
    }
    @Override
    protected String nullMethodName$str() {
        return "WFLYSYSJMX0001: null メソッド名";
    }
    @Override
    protected String startingFailed$str() {
        return "WFLYSYSJMX0006: 開始に失敗しました %1$s";
    }
    @Override
    protected String errorInDestroy$str() {
        return "WFLYSYSJMX0003: %1$s の破棄中にエラーが発生";
    }
    @Override
    protected String stoppingFailed$str() {
        return "WFLYSYSJMX0007: 停止に失敗しました %1$s";
    }
    @Override
    protected String destroyingFailed$str() {
        return "WFLYSYSJMX0008: 破棄に失敗しました %1$s";
    }
    @Override
    protected String errorInStop$str() {
        return "WFLYSYSJMX0004: %1$s の停止中にエラーが発生";
    }
    @Override
    protected String initializationFailed$str() {
        return "WFLYSYSJMX0005: 初期化に失敗しました %1$s";
    }
    @Override
    protected String postRegisterInitializationFailed$str() {
        return "WFLYSYSJMX0009: postRegister 中、初期化に失敗しました";
    }
}
