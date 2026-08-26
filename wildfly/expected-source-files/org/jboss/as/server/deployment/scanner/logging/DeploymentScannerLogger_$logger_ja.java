package org.jboss.as.server.deployment.scanner.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:17+0200")
public class DeploymentScannerLogger_$logger_ja extends DeploymentScannerLogger_$logger implements DeploymentScannerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DeploymentScannerLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotDeleteDeploymentProgressMarker$str() {
        return "WFLYDS0001: デプロイメントの進捗マーカーファイル %1$s を削除できません。";
    }
    @Override
    protected String cannotRemoveDeploymentMarker$str() {
        return "WFLYDS0002: 外部のデプロイメントマーカーファイル %1$s を削除できません。";
    }
    @Override
    protected String deploymentNotFound$str() {
        return "WFLYDS0003: '%1$s' のデプロイメントがリクエストされましたが、このデプロイメントは存在しません。";
    }
    @Override
    protected String deploymentTriggered$str() {
        return "WFLYDS0004: deployment ディレクトリーに %1$s がありました。デプロイメントをトリガーするには、%1$s%2$s というファイルを作成してください。";
    }
    @Override
    protected String errorWritingDeploymentMarker$str() {
        return "WFLYDS0005: デプロイメントマーカーファイル %1$s の書き込み途中で例外を検出しました。";
    }
    @Override
    protected String explodedAutoDeploymentContentWarning$str() {
        return "WFLYDS0006: 展開コンテンツの自動デプロイメントが有効な場合(すなわち、'\"%1$s\"' マーカーファイルを利用しないデプロイメント)、信頼できるデプロイメント動作は不可能です。信頼性を確保したい場合、展開コンテンツの自動デプロイメント設定は推奨されません。デプロイメントスキャナーの %2$s を false に設定することが推奨されます。";
    }
    @Override
    protected String explodedDeploymentContentDeleted$str() {
        return "WFLYDS0007: 展開デプロイメント %1$s のコンテンツが削除されているが、展開デプロイメントの自動デプロイ／アンデプロイが有効になっておらず、このデプロイメントの %1$s%2$s マーカーファイルが削除されていないと、デプロイメントスキャナーが検出しました。結果、デプロイメントはアンデプロイされていませんが、デプロイメントに必要なリソースは削除されているため、アプリケーションエラーが発生する可能性があります。%1$s%2$s マーカーファイルを削除しアンデプロイメントをトリガーするよう推奨されます。";
    }
    @Override
    protected String failedCheckingZipFile$str() {
        return "WFLYDS0008: %1$s が完全な zip であるかを確認できませんでした。";
    }
    @Override
    protected String fileSystemDeploymentFailed$str() {
        return "WFLYDS0009: ファイルシステムのデプロイメントサービスに問題がありました。";
    }
    @Override
    protected String incompleteContent$str() {
        return "WFLYDS0010: デプロイメント %1$s の不完全にコピーされたファイル内容がスキャンで見つかりました。すべてが完全な内容になるまで、デプロイメントの変更は処理されません。";
    }
    @Override
    protected String invalidExplodedDeploymentDirectory$str() {
        return "WFLYDS0011: デプロイメントスキャナーによって、名前が .ear、.jar、.rar、.sar、または .war で終わるディレクトリー内に存在しない %1$s という名前のディレクトリーが見つかりました。これは、%2$s ディレクトリー内で直接アーカイブを展開したことが原因であると考えられ、これはユーザーによるエラーです。%1$s ディレクトリーはデプロイメントにはスキャンされませんが、スキャナーが展開されていないアーカイブから他のファイルを見つけ、デプロイを試み、エラーが発生する可能性があります。";
    }
    @Override
    protected String scanException$str() {
        return "WFLYDS0012: %1$s のスキャンで例外が発生しました。";
    }
    @Override
    protected String started$str() {
        return "WFLYDS0013: ディレクトリー %2$s の %1$s が起動しました。";
    }
    @Override
    protected String unsafeAutoDeploy$str() {
        return "WFLYDS0014: 自動デプロイメント設定をしたコンテンツで、正常に自動デプロイできないものがスキャンで見つかりました。上記の詳細を確認してください。問題のあるコンテンツを削除するか、あるいはコンテンツをデプロイするか否かを %1$s あるいは %2$s マーカーファイルで指定するまで、デプロイメントの変更は処理されません。問題のデプロイメントは %3$s です。";
    }
    @Override
    protected String reattemptingFailedDeployment$str() {
        return "WFLYDS0015: 問題のあったデプロイメント %1$s を再試行中";
    }
    @Override
    protected String failedCheckingXMLFile$str() {
        return "WFLYDS0016: %1$s が完全な XML であるかを確認することに失敗しました。";
    }
    @Override
    protected String initialScanFailed$str() {
        return "WFLYDS0017: 最初のデプロイメントスキャンに失敗しました";
    }
    @Override
    protected String scannerDeploymentUndeployedButNotByScanner$str() {
        return "WFLYDS0018: デプロイメント %1$s は以前このスキャナーによってデプロイされましたが、他の管理ルールによってアンデプロイされました。この事実を記録するため、マーカーファイル %2$s が追加されました。";
    }
    @Override
    protected String scannerDeploymentRemovedButNotByScanner$str() {
        return "WFLYDS0019: デプロイメント %1$s は以前このスキャナーによってデプロイされましたが、他の管理ルールによってサーバーデプロイメントリストより削除されました。この事実を記録するため、マーカーファイル %2$s が追加されました。";
    }
    @Override
    protected String deploymentContentIncomplete$str() {
        return "WFLYDS0021: デプロイメントコンテンツ %1$s は不完全であるように見られ、処理に進展がありません。このコンテンツを自動デプロイできません。%2$s";
    }
    @Override
    protected String deploymentTimeout$str() {
        return "WFLYDS0022: タイムアウトの許容時間内 [%1$d 秒] にデプロイメント操作への応答を受信しませんでした。サーバー設定ファイルとサーバーログをチェックし、デプロイメントステータスの詳細を確認してください。";
    }
    @Override
    protected String invalidZipFileFormat$str() {
        return "WFLYDS0025: ZIP ファイル形式のローカルファイルヘッダー署名で始まらないため、ファイル %1$s をスキャンできません。";
    }
    @Override
    protected String invalidZip64FileFormat$str() {
        return "WFLYDS0026: 現在サポートされない ZIP64 形式を利用しているため、ファイル %1$s をスキャンできません。";
    }
    @Override
    protected String previousContentDeployed$str() {
        return "このコンテンツの以前のバージョンがデプロイされて、依然としてデプロイされた状態です。";
    }
    @Override
    protected String unsafeAutoDeploy2$str() {
        return "WFLYDS0030: ファイル %2$s は自動デプロイ用に設定されましたが、安全に自動デプロイできませんでした。このファイルが自動デプロイできない理由は %1$s です。このファイルのデプロイメントを可能にするには %2$s%3$s というファイルを作成してください。";
    }
    @Override
    protected String deploymentScannerNotForDomainMode$str() {
        return "WFLYDS0031: モジュール 'org.jboss.as.deployment-scanner' による拡張は管理対象ドメインにインストールできません。この拡張とそれを参照するサブシステムをすべて削除してください。";
    }
    @Override
    protected String cannotListDirectoryFiles$str() {
        return "WFLYDS0032: ディレクトリー %1$s のファイルをリストできませんでした。ディレクトリーのコンテンツにアクセスできるか確認してください。";
    }
    @Override
    protected String scannerDeploymentRedeployedButNotByScanner$str() {
        return "WFLYDS0033: デプロイメント %1$s は以前このスキャナーによってアンデプロイされましたが、他の管理ツールによって再デプロイされました。この事実を記録するため、マーカーファイル %2$s が削除されます。";
    }
    @Override
    protected String failedStatusSynchronization$str() {
        return "WFLYDS0034: デプロイメント %1$s のステータスの同期に失敗しました。";
    }
    @Override
    protected String invalidXmlFileFound$str() {
        return "WFLYDS0035: lineNumber: %2$s、columnNumber: %3$s で適切な形式でない %1$s がスキャンによって見つかりました。スキャン時にファイルが完全にコピーされなかったか、ファイルが正しくありません。";
    }
    @Override
    protected String deployModelOperationFailed$str() {
        return "WFLYDS0036: デプロイメントのモデル操作に失敗しました。%1$s";
    }
    @Override
    protected String directoryIsNonexistent$str() {
        return "WFLYDS0037: %1$s は存在しません";
    }
    @Override
    protected String isNotADirectory$str() {
        return "WFLYDS0038: %1$s はディレクトリーではありません。";
    }
    @Override
    protected String directoryIsNotWritable$str() {
        return "WFLYDS0039: %1$s が書き込み可能ではありません";
    }
    @Override
    protected String pathEntryNotFound$str() {
        return "WFLYDS0040: %1$s の relative-to パスエントリーを見つけることができませんでした";
    }
    @Override
    protected String directoryIsNotReadable$str() {
        return "WFLYDS0041: %1$s は読み取り可能ではありません";
    }
    @Override
    protected String bootTimeScanFailed$str() {
        return "WFLYDS0042: デプロイメントディレクトリーにアクセスできないため、ブート時のスキャンに失敗しました: %1$s";
    }
    @Override
    protected String scanFailed$str() {
        return "WFLYDS0043: デプロイメントディレクトリーにアクセスできないため、デプロイメントディレクトリーのスキャンに失敗しました: %1$s";
    }
}
