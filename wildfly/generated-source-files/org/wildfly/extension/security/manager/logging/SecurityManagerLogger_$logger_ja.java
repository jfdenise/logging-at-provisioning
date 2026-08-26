package org.wildfly.extension.security.manager.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:50+0200")
public class SecurityManagerLogger_$logger_ja extends SecurityManagerLogger_$logger implements SecurityManagerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SecurityManagerLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unexpectedElement$str() {
        return "WFLYSM0006: 予期せぬ要素 '%1$s' が見つかりました";
    }
    @Override
    protected String invalidSubsystemConfiguration$str() {
        return "WFLYSM0003: サブシステム設定エラー: 次のパーミッションは最大パーミッションセット %1$s によって暗黙的に示されていません。";
    }
    @Override
    protected String unexpectedEndOfDocument$str() {
        return "WFLYSM0008: 予期せず文書が終了しました。";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYSM0009: 必須属性がありません: %1$s";
    }
    @Override
    protected String unexpectedAttribute$str() {
        return "WFLYSM0007: 予期せぬ属性 '%1$s' が見つかりました。";
    }
    @Override
    protected String ignoredPermission$str() {
        return "WFLYSM0012: 以下のパーミッションは構築できず、%1$s (class=\"%2$s\" name=\"%3$s\" actions=\"%4$s\") で無視されます";
    }
    @Override
    protected String rejectedEmptyMaximumSet$str() {
        return "WFLYSM0005: 空の最大セットはターゲットモデルバージョンでは理解されません。拒否する必要があります";
    }
    @Override
    protected String missingRequiredElements$str() {
        return "WFLYSM0010: 必須要素がありません: %1$s";
    }
    @Override
    protected String invalidDeploymentConfiguration$str() {
        return "WFLYSM0004: デプロイメント設定エラー: 以下のパーミッションは最大パーミッションセット %1$s によって暗黙的に示されていません。";
    }
    @Override
    protected String unexpectedContentType$str() {
        return "WFLYSM0011: 想定外のコンテンツのタイプ %1$s";
    }
    @Override
    protected String invalidPermissionsXMLVersion$str() {
        return "WFLYSM0002: パーミッション要素で無効なバージョンが見つかりました。見つかったバージョン %1$s、想定されたバージョン %2$s";
    }
}
