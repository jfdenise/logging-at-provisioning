package org.wildfly.clustering.singleton.server;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:52+0200")
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
    protected String startSingleton$str() {
        return "WFLYCLSN0001: 今後このノードは %1$s サービスのシングルトンプロバイダーとして機能します。";
    }
    @Override
    protected String stopSingleton$str() {
        return "WFLYCLSN0002: このノードは %1$s サービスのシングルトンプロバイダーとして機能しなくなります。";
    }
    @Override
    protected String elected$str() {
        return "WFLYCLSN0003: %1$s は %2$s サービスのシングルトンプロバイダーとして選択されました。";
    }
    @Override
    protected String noResponseFromPrimary$str() {
        return "WFLYCLSN0004: %1$s サービスのプライマリープロバイダーから受信した応答がなく、再試行中...";
    }
    @Override
    protected String serviceStartFailed$str() {
        return "WFLYCLSN0005: %1$s サービスの開始に失敗しました。";
    }
    @Override
    protected String quorumNotReached$str() {
        return "WFLYCLSN0006: %2$d サービスの %1$s のクォーラムに到達できませんでした。プライマリーシングルトンプロバイダーは選択されません。";
    }
    @Override
    protected String quorumJustReached$str() {
        return "WFLYCLSN0007: %1$s サービスに必要な定数 (quorum) %2$d に達しました。クラスターで他のメンバーを失った場合、このサービスを提供するために選択されるノードはありません。";
    }
    @Override
    protected String multiplePrimaryProvidersDetected$str() {
        return "WFLYCLSN0008: %1$s サービスの複数のプライマリプロバイダーを検出: %2$s";
    }
    @Override
    protected String notStarted$str() {
        return "WFLYCLSN0009: シングルトンサービス %1$s は起動されていません。";
    }
    @Override
    protected String noPrimaryElected$str() {
        return "WFLYCLSN0010: %1$s サービスのシングルトンプロバイダーとしてノードが選択されませんでした。";
    }
    @Override
    protected String invalidQuorum$str() {
        return "WFLYCLSN0011: 指定した quorum %1$d はゼロよりも大きい必要があります";
    }
}
