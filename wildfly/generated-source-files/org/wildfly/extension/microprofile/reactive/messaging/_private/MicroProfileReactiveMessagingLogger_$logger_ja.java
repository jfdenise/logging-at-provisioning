package org.wildfly.extension.microprofile.reactive.messaging._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:38+0200")
public class MicroProfileReactiveMessagingLogger_$logger_ja extends MicroProfileReactiveMessagingLogger_$logger implements MicroProfileReactiveMessagingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveMessagingLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String intermediateModuleNotPresent$str() {
        return "WFLYRXMESS0003: 中間モジュール %1$s は存在しません。再帰的にモジュールを追加しています";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYRXMESS0001: MicroProfile リアクティブメッセージングサブシステムをアクティブ化しています";
    }
    @Override
    protected String experimentalAnnotationNotAllowed$str() {
        return "WFLYRXMESS0005: @%1$s の使用は、この設定では利用できません";
    }
    @Override
    protected String experimentalPropertyNotAllowed$str() {
        return "WFLYRXMESS0004: この設定では、-D%1$s=true の使用は許可されていません";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYRXMESS0002: デプロイメント %1$s には %2$s 機能の使用が必要ですが、現在登録されていません。";
    }
}
