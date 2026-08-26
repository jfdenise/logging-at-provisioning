package org.wildfly.clustering.server.infinispan;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:44+0200")
public class ClusteringServerLogger_$logger_ja extends ClusteringServerLogger_$logger implements ClusteringServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ClusteringServerLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String commandDispatcherAlreadyExists$str() {
        return "WFLYCLSV0001: %1$s にはすでにコマンドディスパッチャーが存在します。";
    }
    @Override
    protected String registryPurgeFailed$str() {
        return "WFLYCLSV0020: 旧式レジストリーエントリーの %1$s/%2$s レジストリーをパージできませんでした: %3$s";
    }
    @Override
    protected String registryListenerFailed$str() {
        return "WFLYCLSV0021: %3$s(%4$s) イベントの %1$s/%2$s レジストリーリスナーの通知に失敗しました";
    }
    @Override
    protected String failedToRestoreLocalRegistryEntry$str() {
        return "WFLYCLSV0022: ネットワークパーティションのマージ後にローカル %1$s/%2$s レジストリーエントリーの復元に失敗しました";
    }
    @Override
    protected String serviceProviderRegistrationListenerFailed$str() {
        return "WFLYCLSV0030: 新しいプロバイダーの %1$s/%2$s サービスプロバイダー登録リスナーの通知に失敗しました: %3$s";
    }
}
