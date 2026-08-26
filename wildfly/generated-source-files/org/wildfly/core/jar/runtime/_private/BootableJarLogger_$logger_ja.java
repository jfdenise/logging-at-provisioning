package org.wildfly.core.jar.runtime._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:03+0200")
public class BootableJarLogger_$logger_ja extends BootableJarLogger_$logger implements BootableJarLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BootableJarLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String argHelp$str() {
        return "このメッセージを表示し、終了";
    }
    @Override
    protected String argCliScript$str() {
        return "Bootable JAR の起動時に実行する CLI スクリプトへのパス";
    }
    @Override
    protected String shuttingDown$str() {
        return "WFLYJAR0001: シャットダウン";
    }
    @Override
    protected String deploymentAlreadyExist$str() {
        return "WFLYJAR0010: hollow jar ではなく、展開はすでに存在しています";
    }
    @Override
    protected String argDefaultMulticastAddress$str() {
        return "システムプロパティー jboss.default.multicast.address を指定の値に設定します。";
    }
    @Override
    protected String argInstallation$str() {
        return "サーバーがインストールされているディレクトリへのパス。デフォルトでは、サーバーは TEMP ディレクトリにインストールされます。";
    }
    @Override
    protected String argPublicBindAddress$str() {
        return "システムプロパティー jboss.bind.address を指定の値に設定します。";
    }
    @Override
    protected String deletingHome$str() {
        return "WFLYJAR0009: %1$s ディレクトリの削除中";
    }
    @Override
    protected String cleanupTimeout$str() {
        return "WFLYJAR0024: コンテナーが %1$d 内で適切にシャットダウンしていません。そのため、インストールディレクトリー \"%2$s\" が正しく削除されないことがあります。";
    }
    @Override
    protected String processIsStopped$str() {
        return "WFLYJAR0016: このサーバーは停止されています。ModelControllerClient の呼び出しは利用できません";
    }
    @Override
    protected String cantDelete$str() {
        return "WFLYJAR0020: %1$s を削除できません。例外 %2$s";
    }
    @Override
    protected String pidFileAlreadyExists$str() {
        return "WFLYJAR0022: PID ファイル %1$s はすでに存在します。インストールディレクトリー ”%2$s” が正しく削除されない可能性があります。";
    }
    @Override
    protected String serverStopped$str() {
        return "WFLYJAR0002: サーバー停止。終了しています";
    }
    @Override
    protected String serverNotStopped$str() {
        return "WFLYJAR0003: サーバーがまだ停止していません。待機中";
    }
    @Override
    protected String argDisplayGalleonConfig$str() {
        return "この起動可能な JAR を構築するために使用した Galleon 設定の内容を表示します。";
    }
    @Override
    protected String moduleLoaderError$str() {
        return "WFLYJAR0018: %2$s からモジュール %1$s をロードできません";
    }
    @Override
    protected String notExistingFile$str() {
        return "WFLYJAR0012: ファイル %1$s が存在しません";
    }
    @Override
    protected String cannotStartServer$str() {
        return "WFLYJAR0017: サーバーを起動できません";
    }
    @Override
    protected String argSecurityManager$str() {
        return "SecurityManager を有効にします。";
    }
    @Override
    protected String unknownArgument$str() {
        return "WFLYJAR0011: 不明な引数 %1$s";
    }
    @Override
    protected String argStability$str() {
        return "特定の安定性レベルを使用してサーバーを実行します。使用可能な値: %1$s、デフォルト = %2$s";
    }
    @Override
    protected String cantRestartServer$str() {
        return "WFLYJAR0019: サーバーを再起動できないません。終了しています";
    }
    @Override
    protected String failedToStartCleanupProcess$str() {
        return "WFLYJAR0023: クリーンアッププロセッサーの起動に失敗しました。インストールディレクトリー \"%1$s\" が正しく削除されない可能性があります。";
    }
    @Override
    protected String argProperties$str() {
        return "指定の url からシステムプロパティーをロードします";
    }
    @Override
    protected String invalidArgument$str() {
        return "WFLYJAR0013: 無効な引数 %1$s。値が指定されていません";
    }
    @Override
    protected String argInterfaceBindAddress$str() {
        return "システムプロパティー jboss.bind.address.<interface> を指定の値に設定します。";
    }
    @Override
    protected String argSystem$str() {
        return "システムプロパティーを設定します。";
    }
    @Override
    protected String processIsReloading$str() {
        return "WFLYJAR0015: このサーバーはリロード中で、ModelControllerClient の呼び出しはまだ利用できません";
    }
    @Override
    protected String cantRegisterModuleMBeans$str() {
        return "WFLYJAR0021: JBoss モジュール MBeans、%1$s を登録できません。";
    }
    @Override
    protected String argVersion$str() {
        return "バージョンを出力し、終了";
    }
    @Override
    protected String nullController$str() {
        return "WFLYJAR0004: null コントローラクライアント。終了";
    }
    @Override
    protected String advertiseInstall$str() {
        return "WFLYJAR0007: サーバーとアプリケーションを %1$s にインストールしました。所要時間: %2$sms";
    }
    @Override
    protected String securityProviderFailed$str() {
        return "WFLYJAR0025: セキュリティープロバイダーの初期化に失敗しました。理由: %1$s";
    }
    @Override
    protected String argDeployment$str() {
        return "hollow jar に展開するための展開アーティファクト (war、jar、ear、展開デプロイ dir) へのパス";
    }
    @Override
    protected String advertiseOptions$str() {
        return "WFLYJAR0008: サーバーオプション: %1$s";
    }
    @Override
    protected String installDeployment$str() {
        return "WFLYJAR0006: サーバーに %1$s をデプロイしました";
    }
    @Override
    protected String argSecurityProperty$str() {
        return "セキュリティープロパティーを設定します。";
    }
    @Override
    protected String unexpectedExceptionWhileShuttingDown$str() {
        return "WFLYJAR0005: サーバーのシャットダウン中に予期せぬ例外が発生しました";
    }
    @Override
    protected String processIsStopping$str() {
        return "WFLYJAR0014: このサーバーが停止され、ModelControllerClient の呼び出しは利用できません";
    }
}
