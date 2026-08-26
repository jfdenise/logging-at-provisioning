package org.wildfly.clustering.web.hotrod.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:48+0200")
public class Logger_$logger_ja extends Logger_$logger implements Logger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public Logger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToExpireSession$str() {
        return "WFLYCLWEBHR0001: セッション %1$s を期限切れにすることができませんでした";
    }
    @Override
    protected String failedToActivateSession$str() {
        return "WFLYCLWEBHR0007: セッション %1$s の属性をアクティベートできませんでした";
    }
    @Override
    protected String failedToActivateSessionAttribute$str() {
        return "WFLYCLWEBHR0008: セッション %1$s の属性 %2$s をアクティベートできませんでした";
    }
    @Override
    protected String failedToReadSessionAttribute$str() {
        return "WFLYCLWEBHR0009: セッション %1$s の属性 %2$s を読み取りできませんでした";
    }
    @Override
    protected String failedToActivateAuthentication$str() {
        return "WFLYCLWEBHR0010: シングルトンサインオン %1$s の認証をアクティベートできませんでした";
    }
    @Override
    protected String missingSessionAttributeCacheEntry$str() {
        return "WFLYCLWEBHR0011: セッション %1$s に属性 %2$s のキャッシュエントリーがありません";
    }
}
