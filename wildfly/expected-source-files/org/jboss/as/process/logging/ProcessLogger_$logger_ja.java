package org.jboss.as.process.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:22+0200")
public class ProcessLogger_$logger_ja extends ProcessLogger_$logger implements ProcessLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ProcessLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String attemptToReconnectNonExistentProcess$str() {
        return "WFLYPC0001: 存在しないプロセス '%1$s' に再接続しようとしました。";
    }
    @Override
    protected String attemptToRemoveNonExistentProcess$str() {
        return "WFLYPC0002: 存在しないプロセス '%1$s' を削除しようとしました。";
    }
    @Override
    protected String attemptToStartNonExistentProcess$str() {
        return "WFLYPC0003: 存在しないプロセス '%1$s' を開始しようとしました。";
    }
    @Override
    protected String attemptToStopNonExistentProcess$str() {
        return "WFLYPC0004: 存在しないプロセス '%1$s' を停止しようとしました。";
    }
    @Override
    protected String duplicateProcessName$str() {
        return "WFLYPC0005: 重複した名前のプロセス '%1$s' を登録しようとしました。";
    }
    @Override
    protected String failedToSendAuthKey$str() {
        return "WFLYPC0006: プロセス '%1$s' へ認証キーを送ることができませんでした: %2$s";
    }
    @Override
    protected String failedToSendDataBytes$str() {
        return "WFLYPC0007: データバイトをプロセス '%1$s' の入力ストリームへ送信できませんでした。";
    }
    @Override
    protected String failedToSendReconnect$str() {
        return "WFLYPC0008: 再接続メッセージをプロセス '%1$s' の入力ストリームへ送信できませんでした。";
    }
    @Override
    protected String failedToStartProcess$str() {
        return "WFLYPC0009: プロセス '%1$s' の開始に失敗しました。";
    }
    @Override
    protected String failedToWriteMessage$str() {
        return "WFLYPC0010: 接続への %1$s メッセージの書き込みに失敗しました: %2$s";
    }
    @Override
    protected String processFinished$str() {
        return "WFLYPC0011: 終了ステータス %2$d でプロセス '%1$s' を完了しました。";
    }
    @Override
    protected String receivedInvalidVersion$str() {
        return "WFLYPC0012: %1$s から無効なバージョンがある接続を受信しました。";
    }
    @Override
    protected String receivedUnknownGreetingCode$str() {
        return "WFLYPC0013: %2$s から認識されないグリーティングコード 0x%1$02x を受信しました。";
    }
    @Override
    protected String receivedUnknownCredentials$str() {
        return "WFLYPC0014: %1$s から不明なクレデンシャルがある接続を受信しました。";
    }
    @Override
    protected String receivedUnknownMessageCode$str() {
        return "WFLYPC0015: コード 0x%1$02x がある不明なメッセージを受信しました。";
    }
    @Override
    protected String shutdownComplete$str() {
        return "WFLYPC0016: 全プロセスが完了しました。終了します。";
    }
    @Override
    protected String shuttingDown$str() {
        return "WFLYPC0017: プロセスコントローラーを終了します。";
    }
    @Override
    protected String startingProcess$str() {
        return "WFLYPC0018: プロセス '%1$s' を開始します。";
    }
    @Override
    protected String stoppingProcess$str() {
        return "WFLYPC0019: プロセス '%1$s' を停止します。";
    }
    @Override
    protected String streamProcessingFailed$str() {
        return "WFLYPC0020: プロセス '%1$s' に対するストリーム処理が失敗しました: %2$s";
    }
    @Override
    protected String waitingToRestart$str() {
        return "WFLYPC0021: プロセス %2$s の再起動試行まで %1$d 秒待機します。";
    }
    @Override
    protected String failedToKillProcess$str() {
        return "WFLYPC0022: プロセス '%1$s' を kill できませんでした。代わりに、破棄 (destroy) を試行中です。";
    }
    @Override
    protected String argUsage$str() {
        return "使用方法: %1$s [args...]%n args には次が含まれます:";
    }
    @Override
    protected String argBackup$str() {
        return "このホストがドメインコントローラーでない場合でも、永続ドメイン設定のコピーを保持します。host.xml で ignore-unused-configuration が設定されていない場合は、完全なドメイン設定が保存されます。それ以外の場合は、ignore-unused-configuration の設定値が使用されます。";
    }
    @Override
    protected String argCachedDc$str() {
        return "このホストがドメインコントローラーではなく起動時にドメインコントローラーに問い合わせできない場合は、ドメイン設定のローカルキャッシュコピーが起動に使用されます (可能な場合は --backup を参照)。ドメインコントローラーは、利用可能になるまでバックグラウンドでポーリングされます。ドメインコントローラーが利用可能な場合に --cached-dc でホストを起動すると、--backup が使用されていない場合であってもドメイン設定のコピーがキャッシュされます。";
    }
    @Override
    protected String argDomainConfig$str() {
        return "利用するドメイン設定ファイル名 (デフォルトは \"domain.xml\") (-c と同じ)";
    }
    @Override
    protected String argShortDomainConfig$str() {
        return "利用するドメイン設定ファイル名 (デフォルトは \"domain.xml\") (--domain-config と同じ)";
    }
    @Override
    protected String argReadOnlyDomainConfig$str() {
        return "使用するドメイン設定ファイル名。これは '--domain-config' とは異なり、元のファイルの '-c' と '-domain-config' は上書きされません。";
    }
    @Override
    protected String argHelp$str() {
        return "このメッセージを表示し、終了";
    }
    @Override
    protected String argInterProcessHcAddress$str() {
        return "ホストコントローラーがプロセスコントローラーから通信をリッスンすべきアドレス";
    }
    @Override
    protected String argInterProcessHcPort$str() {
        return "ホストコントローラーがプロセスコントローラーから通信をリッスンすべきポート";
    }
    @Override
    protected String argHostConfig$str() {
        return "利用する設定ファイル名 (デフォルトは \"host.xml\")";
    }
    @Override
    protected String argReadOnlyHostConfig$str() {
        return "使用するホスト設定ファイル名。これは '--host-config' とは異なり、元のファイルは上書きされません。";
    }
    @Override
    protected String argPcAddress$str() {
        return "プロセスコントローラーが制御しているプロセスから通信をリッスンするアドレス";
    }
    @Override
    protected String argPcPort$str() {
        return "プロセスコントローラーが制御しているプロセスから通信をリッスンするポート";
    }
    @Override
    protected String argProperties$str() {
        return "指定の url からシステムプロパティーをロードします";
    }
    @Override
    protected String argSystem$str() {
        return "システムプロパティーを設定します。";
    }
    @Override
    protected String argVersion$str() {
        return "バージョンを出力し、終了";
    }
    @Override
    protected String argPublicBindAddress$str() {
        return "システムプロパティー jboss.bind.address を指定の値に設定します。";
    }
    @Override
    protected String argInterfaceBindAddress$str() {
        return "システムプロパティー jboss.bind.address.<interface> を指定の値に設定します。";
    }
    @Override
    protected String argDefaultMulticastAddress$str() {
        return "システムプロパティー jboss.default.multicast.address を指定の値に設定します。";
    }
    @Override
    protected String argAdminOnly$str() {
        return "ホストコントローラの実行タイプを ADMIN_ONLY に設定します。ADMIN_ONLY では管理インターフェイスが開き管理リクエストを受け取りますが、サービスは開始されません。このホストコントローラーがドメインのプライマリーの場合、セカンダリーホストコントローラーから受信接続を受け付けます。";
    }
    @Override
    protected String argMasterAddress$str() {
        return "システムプロパティー jboss.domain.primary.address を指定の値に設定します。デフォルトのセカンダリーホストコントローラー設定では、これを使いプライマリーホストコントローラーのアドレスを設定します。";
    }
    @Override
    protected String argMasterPort$str() {
        return "システムプロパティー jboss.domain.primary.port を指定の値に設定します。デフォルトのセカンダリーホストコントローラー設定では、プライマリーホストコントローラーがネーティブ管理通信に利用するポートを設定するためにこれを使います。";
    }
    @Override
    protected String argSecMgr$str() {
        return "セキュリティーマネージャーがインストールされた状態でサーバーを実行します。";
    }
    @Override
    protected String argStability$str() {
        return "特定の安定性レベルを使用してサーバーを実行します。使用可能な値: %1$s、デフォルト = %2$s";
    }
    @Override
    protected String noArgValue$str() {
        return "WFLYPC0023: 引数 %1$s に対して値が提示されていません。";
    }
    @Override
    protected String invalidAuthKeyLen$str() {
        return "WFLYPC0025: 認証キーは 24 バイト長でなければなりません。";
    }
    @Override
    protected String invalidLength$str() {
        return "WFLYPC0029: %1$s の長さは無効です。";
    }
    @Override
    protected String invalidOption$str() {
        return "WFLYPC0030: 無効なオプション '%1$s'";
    }
    @Override
    protected String nullCommandComponent$str() {
        return "WFLYPC0031: コマンドには null コンポーネントが含まれています。";
    }
    @Override
    protected String failedToAcceptConnection$str() {
        return "WFLYPC0033: 接続の受け入れに失敗しました。";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYPC0034: リソース %1$s を終了することができませんでした。";
    }
    @Override
    protected String failedToCloseServerSocket$str() {
        return "WFLYPC0035: サーバーソケット %1$s の終了に失敗しました。";
    }
    @Override
    protected String failedToCloseSocket$str() {
        return "WFLYPC0036: ソケットの終了に失敗しました。";
    }
    @Override
    protected String failedToHandleIncomingConnection$str() {
        return "WFLYPC0039: 受信接続処理に失敗しました。";
    }
    @Override
    protected String failedToHandleSocketFailure$str() {
        return "WFLYPC0040: ソケット障害条件の処理に失敗しました。";
    }
    @Override
    protected String failedToHandleSocketFinished$str() {
        return "WFLYPC0041: ソケット完了条件の処理に失敗しました。";
    }
    @Override
    protected String failedToHandleSocketShutdown$str() {
        return "WFLYPC0042: ソケット終了条件の処理に失敗しました。";
    }
    @Override
    protected String failedToReadMessage$str() {
        return "WFLYPC0043: メッセージの読み込みに失敗しました。";
    }
    @Override
    protected String leakedMessageOutputStream$str() {
        return "WFLYPC0044: メッセージ出力ストリームがリークしました。消去しています。";
    }
    @Override
    protected String failedToCreateServerThread$str() {
        return "WFLYPC0045: サーバースレッドの作成に失敗しました。";
    }
    @Override
    protected String failedToReadObject$str() {
        return "WFLYPC0046: オブジェクトの読み込みに失敗しました。";
    }
    @Override
    protected String invalidByte0$str() {
        return "WFLYPC0047: 無効なバイト";
    }
    @Override
    protected String invalidByte2$str() {
        return "WFLYPC0048: 無効なバイト:%1$s(%2$d)";
    }
    @Override
    protected String invalidByteToken$str() {
        return "WFLYPC0049: 無効なバイトトークン。'%1$s' を想定しましたが '%2$s' を取得。";
    }
    @Override
    protected String invalidCommandByte$str() {
        return "WFLYPC0050: 無効なコマンドバイトの読み込み: %1$s";
    }
    @Override
    protected String invalidStartChunk$str() {
        return "WFLYPC0051: 無効なチャンク開始 [%1$s]";
    }
    @Override
    protected String readBytes$str() {
        return "WFLYPC0056: %1$d バイトを読み取り";
    }
    @Override
    protected String streamClosed$str() {
        return "WFLYPC0058: ストリームが終了しました。";
    }
    @Override
    protected String threadCreationRefused$str() {
        return "WFLYPC0059: スレッドの作成が却下されました。";
    }
    @Override
    protected String unexpectedEndOfStream$str() {
        return "WFLYPC0060: ストリームが予期せず終了";
    }
    @Override
    protected String writeChannelClosed$str() {
        return "WFLYPC0061: 書き込みチャネルが終了しました。";
    }
    @Override
    protected String writesAlreadyShutdown$str() {
        return "WFLYPC0062: 書き込みチャネルはすでに終了しています。";
    }
    @Override
    protected String attemptingToKillProcess$str() {
        return "WFLYPC0063: プロセス '%1$s' は %2$d ミリ秒内に通常停止を完了しませんでした。OS コールを使用してプロセスの kill を試行しています。";
    }
    @Override
    protected String jpsCommandNotFound$str() {
        return "WFLYPC0064: プロセス '%1$s' が見つかりません -- 'jps' コマンドが見つかりませんでした";
    }
    @Override
    protected String processNotFound$str() {
        return "WFLYPC0065: '%1$s' と識別できるプロセスは何も見つかりませんでした";
    }
    @Override
    protected String multipleProcessesFound$str() {
        return "WFLYPC0066: '%1$s' と識別できるプロセスが複数見つかりました。OS レベルの kill 操作は安全に実行できません。";
    }
    @Override
    protected String destroyingProcess$str() {
        return "WFLYPC0067: プロセス '%1$s' は %2$d ミリ秒内に通常停止を完了しませんでした。java.lang.Process.destroyForcibly() を使用してプロセスの破棄を試行しています。";
    }
}
