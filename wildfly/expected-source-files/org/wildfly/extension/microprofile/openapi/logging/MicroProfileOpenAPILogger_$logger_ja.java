package org.wildfly.extension.microprofile.openapi.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:20+0200")
public class MicroProfileOpenAPILogger_$logger_ja extends MicroProfileOpenAPILogger_$logger implements MicroProfileOpenAPILogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileOpenAPILogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMPOAI0001: MicroProfile OpenAPI サブシステムをアクティブ化しています";
    }
    @Override
    protected String failedToLoadStaticFile$str() {
        return "WFLYMPOAI0002: デプロイメント '%1$s' からの OpenAPI '%2$s' のロードに失敗しました";
    }
    @Override
    protected String endpointAlreadyRegistered$str() {
        return "WFLYMPOAI0003: MicroProfile OpenAPI エンドポイントはすでにホスト '%1$s' に対して登録済みです。'%2$s' の OpenAPI ドキュメントを省略します。";
    }
    @Override
    protected String endpointRegistered$str() {
        return "WFLYMPOAI0004: ホスト '%2$s' に登録された MicroProfile OpenAPI エンドポイント '%1$s'";
    }
    @Override
    protected String endpointUnregistered$str() {
        return "WFLYMPOAI0005: ホスト '%2$s' に未登録の MicroProfile OpenAPI エンドポイント '%1$s'";
    }
    @Override
    protected String requiredListenersNotFound$str() {
        return "WFLYMPOAI0006: MicroProfile OpenAPI 仕様の §5.1 では、エンドポイントが %2$s 経由でアクセス可能でなければなりません。ただし、サーバー '%1$s' にはこのようなリスナーは存在しません。";
    }
    @Override
    protected String nonStandardEndpoint$str() {
        return "WFLYMPOAI0007: MicroProfile OpenAPI 仕様の §5.1 は、ドキュメントが '%3$s' で利用可能でなければなりませんが、'%1$s' は '%2$s' を使用するように設定されています";
    }
    @Override
    protected String disabled$str() {
        return "WFLYMPOAI0008: MicroProfile OpenAPI ドキュメントは '%1$s' では無効です";
    }
}
