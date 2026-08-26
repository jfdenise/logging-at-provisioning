package org.wildfly.extension.clustering.singleton;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:07+0200")
public class SingletonLogger_$logger_ja extends SingletonLogger_$logger implements SingletonLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SingletonLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String singletonDeploymentDetected$str() {
        return "WFLYCLSNG0001: シングルトンのデプロイメントが検出されました。デプロイメントは %1$s ポリシーを使用してリセットされます。";
    }
}
