package org.wildfly.clustering.web.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:48+0200")
public class InfinispanWebLogger_$logger_ja extends InfinispanWebLogger_$logger implements InfinispanWebLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanWebLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToPassivateSession$str() {
        return "WFLYCLWEBINF0001: セッション %1$s の属性をパッシベートできませんでした";
    }
    @Override
    protected String failedToPassivateSessionAttribute$str() {
        return "WFLYCLWEBINF0002: セッション %1$s の属性 %2$s をパッシベートできませんでした";
    }
    @Override
    protected String invalidSession$str() {
        return "WFLYCLWEBINF0003: セッション %1$s は有効ではありません";
    }
    @Override
    protected String failedToExpireSession$str() {
        return "WFLYCLWEBINF0004: セッション %1$s を期限切れにすることができませんでした";
    }
    @Override
    protected String failedToCancelSession$str() {
        return "WFLYCLWEBINF0005: プライマリーオーナー (所有者) でセッション %1$s のエクスパレーション/パッシベーションをキャンセルできませんでした。";
    }
    @Override
    protected String failedToScheduleSession$str() {
        return "WFLYCLWEBINF0006: プライマリーオーナー (所有者) でセッション %1$s のエクスパレーション/パッシベーションをスケジュールできませんでした。";
    }
    @Override
    protected String failedToActivateSession$str() {
        return "WFLYCLWEBINF0007: セッション %1$s の属性をアクティベートできませんでした";
    }
    @Override
    protected String failedToActivateSessionAttribute$str() {
        return "WFLYCLWEBINF0008: セッション %1$s の属性 %2$s をアクティベートできませんでした";
    }
    @Override
    protected String failedToReadSessionAttribute$str() {
        return "WFLYCLWEBINF0009: セッション %1$s の属性 %2$s を読み取りできませんでした";
    }
    @Override
    protected String failedToActivateAuthentication$str() {
        return "WFLYCLWEBINF0010: シングルトンサインオン %1$s の認証をアクティベートできませんでした";
    }
    @Override
    protected String missingSessionAttributeCacheEntry$str() {
        return "WFLYCLWEBINF0011: セッション %1$s に属性 %2$s のキャッシュエントリーがありません";
    }
    @Override
    protected String evictionDisabled$str() {
        return "WFLYCLWEBINF0012: キャッシュ %1$s のエビクションを無効にします。Web セッションパッシベーションは jboss-web.xml の <max-active-sessions/> を介して設定する必要があります。";
    }
    @Override
    protected String expirationDisabled$str() {
        return "WFLYCLWEBINF0013: キャッシュ '%1$s' のエクスパレーションを無効にします。web セッションエクスパレーションは、サーブレット仕様の §7.5 にしたがって設定する必要があります。";
    }
}
