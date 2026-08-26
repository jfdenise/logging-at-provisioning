package org.wildfly.extension.microprofile.config.smallrye._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:31+0200")
public class MicroProfileConfigLogger_$logger_ja extends MicroProfileConfigLogger_$logger implements MicroProfileConfigLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileConfigLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYCONF0001: MicroProfile Config サブシステムのアクティブ化";
    }
    @Override
    protected String unableToLoadClassFromModule$str() {
        return "WFLYCONF0002: モジュール %2$sからクラス %1$s をロードできません";
    }
    @Override
    protected String loadConfigSourceFromClass$str() {
        return "WFLYCONF0004: MicroProfile Config Source のクラスを使用します: %1$s";
    }
    @Override
    protected String loadConfigSourceRootFromDir$str() {
        return "WFLYCONF0009: MicroProfile Config Source Root のディレクトリーを使用します: %1$s";
    }
    @Override
    protected String loadConfigSourceFromDir$str() {
        return "WFLYCONF0003: MicroProfile Config Source のディレクトリーを使用します: %1$s";
    }
    @Override
    protected String logDirectoriesUnderConfigSourceRoot$str() {
        return "WFLYCONF0010: MicroProfile Config Source のルートディレクトリー '%1$s' に、MicroProfile Config Sources として使用される次のディレクトリーが含まれています: %2$s";
    }
}
