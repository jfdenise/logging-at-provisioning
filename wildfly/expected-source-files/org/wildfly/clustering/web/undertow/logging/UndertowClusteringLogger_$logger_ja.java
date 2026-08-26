package org.wildfly.clustering.web.undertow.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:30+0200")
public class UndertowClusteringLogger_$logger_ja extends UndertowClusteringLogger_$logger implements UndertowClusteringLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public UndertowClusteringLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String sessionIsInvalid$str() {
        return "WFLYCLWEBUT0001: セッション %1$s は無効です。";
    }
    @Override
    protected String sessionAlreadyExists$str() {
        return "WFLYCLWEBUT0002: セッション %1$s はすでに存在します。";
    }
    @Override
    protected String sessionManagerStopped$str() {
        return "WFLYCLWEBUT0003: セッションマネージャーが停止しました";
    }
    @Override
    protected String legacySessionManagementProviderOverride$str() {
        return "WFLYCLWEBUT0004: レガシーの <replication-config/> が%1$s の分散可能セッション管理プロバイダーをオーバーライドします。";
    }
    @Override
    protected String legacySessionManagementProviderInUse$str() {
        return "WFLYCLWEBUT0005: %1$s の分散可能セッション管理プロバイダーは見つかりませんでした。<replication-config/> を基にしてレガシープロバイダーを使用します。";
    }
    @Override
    protected String legacyRoutingProviderInUse$str() {
        return "WFLYCLWEBUT0007: %1$s のルーティングプロバイダーは見つかりませんでした。静的設定を基にしてレガシープロバイダーを使用します。";
    }
    @Override
    protected String legacySingleSignOnProviderInUse$str() {
        return "WFLYCLWEBUT0008: %1$s の分散可能シングルサインオン管理プロバイアーは見つかりませんでした。静的設定を基にしてレガシープロバイダーを使用します。";
    }
    @Override
    protected String batchIsAlreadyClosed$str() {
        return "WFLYCLWEBUT0009: 応答のコミット後にセッション %1$s にインバリデーションが試行されました (例: HttpServletResponse.sendRedirect または sendError の後)。";
    }
}
