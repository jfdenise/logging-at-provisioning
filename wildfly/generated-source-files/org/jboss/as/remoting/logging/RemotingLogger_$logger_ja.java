package org.jboss.as.remoting.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:48+0200")
public class RemotingLogger_$logger_ja extends RemotingLogger_$logger implements RemotingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public RemotingLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String runtimeSecurityRealmUnsupported$str() {
        return "WFLYRMT0029: ランタイム時のセキュリティーレルムの使用はサポート対象外です。";
    }
    @Override
    protected String endpointEmpty$str() {
        return "WFLYRMT0006: エンドポイントは null です。";
    }
    @Override
    protected String invalidQOPV$str() {
        return "WFLYRMT0016: 無効な QOP 値: %1$s";
    }
    @Override
    protected String addingIOSubsystem$str() {
        return "WFLYRMT0024: リモーティングサブシステムは存在しますが、io サブシステムは見つかりませんでした。これまではリモーティングスキーマ '%1$s' がある場合は io サブシステムは必要ありませんでしたが、現在は必要になったため、デフォルトのサブシステムが追加されます。";
    }
    @Override
    protected String illegalStrength$str() {
        return "WFLYRMT0020: 指定のストリング強度 '%1$s' は無効です。";
    }
    @Override
    protected String failedToObtainSSLContext$str() {
        return "WFLYRMT0027: SSLContext の取得に失敗しました";
    }
    @Override
    protected String couldNotStart$str() {
        return "WFLYRMT0005: サービスの開始に失敗しました";
    }
    @Override
    protected String couldNotRemoveResource$str() {
        return "WFLYRMT0025: JMX によってリモーティングエンドポイントとして使用されるため %1$s を削除できません";
    }
    @Override
    protected String invalidOption$str() {
        return "WFLYRMT0028: 無効なオプション '%1$s'。";
    }
    @Override
    protected String couldNotCreateURI$str() {
        return "WFLYRMT0018: %1$s から有効な URI を作成できません -- %2$s";
    }
    @Override
    protected String couldNotStartChanelListener$str() {
        return "WFLYRMT0002: チャネルリスナーを開始できませんでした。";
    }
    @Override
    protected String couldNotBindToSocket$str() {
        return "WFLYRMT0004: %1$s";
    }
    @Override
    protected String warningOnWorkerChange$str() {
        return "WFLYRMT0026: リモーティングでワーカーを '%1$s' に変更すると、リモーティングまたは http(s) リスナーの定義によっては、リンクされたリソースで同じ変更が必要になる場合があります。";
    }
    @Override
    protected String listeningOnSocket$str() {
        return "WFLYRMT0001: %1$s をリッスンしています。";
    }
    @Override
    protected String workerConfigurationIgnored$str() {
        return "WFLYRMT0022: ワーカー設定は使用されないようになりました。エンドポイントワーカー設定を使用してください。";
    }
    @Override
    protected String upgradeRequestMissingKey$str() {
        return "WFLYRMT0021: HTTP アップグレードリクエストに Sec-JbossRemoting-Key ヘッダーがありません";
    }
    @Override
    protected String workerThreadsEndpointConfigurationChoiceRequired$str() {
        return "WFLYRMT0023: '%1$s' 設定または '%2$s' 設定のいずれか 1 つのみが許可されます。";
    }
    @Override
    protected String invalidStrength$str() {
        return "WFLYRMT0017: 無効な強度の値: %1$s";
    }
}
