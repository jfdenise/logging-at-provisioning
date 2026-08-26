package org.wildfly.extension.elytron.oidc._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:17+0200")
public class ElytronOidcLogger_$logger_ja extends ElytronOidcLogger_$logger implements ElytronOidcLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ElytronOidcLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String resourceOrClientIdMustBeConfigured$str() {
        return "WFLYOIDC0007: 'resource' または 'client-id' を設定する必要があります";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYOIDC0001: WildFly Elytron OIDC サブシステムのアクティブ化";
    }
    @Override
    protected String unsupportedAttribute$str() {
        return "WFLYOIDC0009: OIDC 属性 '%1$s' は、現在の安定性レベルではサポートされていません。";
    }
    @Override
    protected String cannotRemoveCredential$str() {
        return "WFLYOIDC0003: 認証情報を削除できません。デプロイメント '%1$s' 用に定義された認証情報はありません。";
    }
    @Override
    protected String cannotUpdateRedirectRuntimeRule$str() {
        return "WFLYOIDC0006: リダイレクト書き換えを更新できません。デプロイメント '%1$s' に対して定義されたリダイレクト書き換えはありません。";
    }
    @Override
    protected String disableTrustManagerSetToTrue$str() {
        return "WFLYOIDC0008: 'disable-trust-manager' 属性は 'true' に設定されているため、HTTPS 経由で OpenID プロバイダーと通信する際にトラストマネージャーは使用されません。この値は、実稼働環境で常に 'false' に設定する必要があります。";
    }
    @Override
    protected String cannotUpdateCredential$str() {
        return "WFLYOIDC0004: 認証情報を更新できません。デプロイメント '%1$s' 用に定義された認証情報はありません。";
    }
    @Override
    protected String cannotRemoveRedirectRuntimeRule$str() {
        return "WFLYOIDC0005: リダイレクト書き換えルールを削除できません。デプロイメント '%1$s' に対して定義されたリダイレクト書き換えはありません。";
    }
    @Override
    protected String deploymentSecured$str() {
        return "WFLYOIDC0002: デプロイメント '%1$s' の Elytron OIDC クライアントサブシステムのオーバーライド";
    }
}
