package org.jboss.as.clustering.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:05+0200")
public class InfinispanLogger_$logger_ja extends InfinispanLogger_$logger implements InfinispanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYCLINF0001: Infinispan サブシステムを有効化しています。";
    }
    @Override
    protected String remoteCacheContainerStarted$str() {
        return "WFLYCLINF0029: リモートキャッシュコンテナー '%1$s' を開始しました。";
    }
    @Override
    protected String remoteCacheContainerStopped$str() {
        return "WFLYCLINF0030: リモートキャッシュコンテナー '%1$s' を停止しました。";
    }
    @Override
    protected String invalidCacheStore$str() {
        return "WFLYCLINF0010: %1$s は有効なキャッシュストアではありません。";
    }
    @Override
    protected String marshallerEnumValueDeprecated$str() {
        return "WFLYCLINF0033: 属性 '%1$s' は、非推奨の値 %2$s を使用するよう設定されています。代わりに以下の値のいずれかを使用してください。%3$s";
    }
    @Override
    protected String cacheStopped$str() {
        return "WFLYCLINF0003: %2$s コンテナーから %1$s キャッシュを停止しました。";
    }
    @Override
    protected String cacheStarted$str() {
        return "WFLYCLINF0002: %2$s コンテナーから %1$s キャッシュを開始しました。";
    }
}
