package org.wildfly.extension.microprofile.health._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:11+0200")
public class MicroProfileHealthLogger_$logger_ja extends MicroProfileHealthLogger_$logger implements MicroProfileHealthLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileHealthLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMPHEALTH0001: MicroProfile Health サブシステムのアクティブ化";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYMPHEALTH0002: デプロイメント %1$s には %2$s 機能の使用が必要ですが、現在登録されていません。";
    }
    @Override
    protected String healthDownStatus$str() {
        return "WFLYMPHEALTH0003: ヘルスダウンステータスの報告: %1$s";
    }
    @Override
    protected String defaultProceduresDisabledByDeployment$str() {
        return "WFLYMPHEALTH0007: デプロイメント %1$s の設定で、デフォルトの MicroProfile Health 手順を無効にすることが指定されています。サーバー全体の手順が無効になります。";
    }
}
