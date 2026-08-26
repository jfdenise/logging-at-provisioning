package org.jboss.as.management.client.content;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:28+0200")
public class ManagedDMRContentLogger_$logger_ja extends ManagedDMRContentLogger_$logger implements ManagedDMRContentLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ManagedDMRContentLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String invalidHash$str() {
        return "WFLYCNT0001: アドレス %2$s のコンテンツに対して無効なハッシュ '%1$s'。現在のハッシュは %3$s です。別の呼び出し元によってコンテンツが更新された可能性があります。";
    }
    @Override
    protected String messageDigestAlgorithmNotAvailable$str() {
        return "WFLYCNT0002: メッセージダイジェストアルゴリズム SHA-1 を取得できません。";
    }
    @Override
    protected String illegalChildType$str() {
        return "WFLYCNT0003: 不正な子の型 %1$s -- %2$s でなければなりません。";
    }
    @Override
    protected String illegalChildClass$str() {
        return "WFLYCNT0004: 子のリソースクラス %1$s は不正です。";
    }
    @Override
    protected String noContentFoundWithHash$str() {
        return "WFLYCNT0005: ハッシュ %1$s のあるコンテンツは見つかりませんでした。";
    }
    @Override
    protected String nullParent$str() {
        return "WFLYCNT0006: 親は null です。";
    }
}
