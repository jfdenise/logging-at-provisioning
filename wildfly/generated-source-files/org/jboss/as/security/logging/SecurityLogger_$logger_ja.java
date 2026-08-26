package org.jboss.as.security.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:51+0200")
public class SecurityLogger_$logger_ja extends SecurityLogger_$logger implements SecurityLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SecurityLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unableToEnableJaccSupport$str() {
        return "WFLYSEC0105: elytron JACC サポートが有効な場合、レガシーの JACC サポートを初期化することはできません。";
    }
    @Override
    protected String runtimeException$str() {
        return "WFLYSEC0007: ランタイム例外:";
    }
    @Override
    protected String unsupportedOperationExceptionUseResourceDesc$str() {
        return "WFLYSEC0018: ResourceDescriptionResolver 変数の使用";
    }
    @Override
    protected String unsupportedOperation$str() {
        return "WFLYSEC0019: 対応していない操作";
    }
    @Override
    protected String passwordAgain$str() {
        return "WFLYSEC0061: 再入力してください:";
    }
    @Override
    protected String validationFailed$str() {
        return "WFLYSEC0107: %1$s の検証に失敗しました";
    }
    @Override
    protected String xmlStreamExceptionAuth$str() {
        return "WFLYSEC0022: セキュリティードメインは <authentication> あるいは <authentication-jaspi> 要素のいずれかを持つことができますが、両方はできません。";
    }
    @Override
    protected String xmlStreamExceptionMissingAttribute$str() {
        return "WFLYSEC0023: 必須属性がありません: %1$s あるいは %2$s のいずれかがなければなりません。";
    }
    @Override
    protected String securityException$str() {
        return "WFLYSEC0015: セキュリティー例外";
    }
}
