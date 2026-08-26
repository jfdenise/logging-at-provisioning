package org.wildfly.extension.microprofile.opentracing;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:21+0200")
public class TracingExtensionLogger_$logger_ja extends TracingExtensionLogger_$logger implements TracingExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public TracingExtensionLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYTRACEXT0001: MicroProfile OpenTracing サブシステムのアクティベート";
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "WFLYTRACEXT0013: 移行操作を実行できません: サーバーが admin-only モードである必要があります";
    }
    @Override
    protected String migrationFailed$str() {
        return "WFLYTRACEXT0014: 移行に失敗しました。詳細は結果を参照してください。";
    }
}
