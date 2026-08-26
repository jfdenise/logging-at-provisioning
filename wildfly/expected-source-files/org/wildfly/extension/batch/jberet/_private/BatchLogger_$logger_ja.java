package org.wildfly.extension.batch.jberet._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:54:10+0200")
public class BatchLogger_$logger_ja extends BatchLogger_$logger implements BatchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BatchLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String errorProcessingBatchJobsDir$str() {
        return "WFLYBATCH000001: META-INF/batch-jobs ディレクトリーの処理でエラーが発生しました。";
    }
    @Override
    protected String cannotRemoveResourceOfType$str() {
        return "WFLYBATCH000002: タイプ %1$s のリソースは削除できません";
    }
    @Override
    protected String couldNotFindDeploymentName$str() {
        return "WFLYBATCH000003: デプロイメント名が見つかりませんでした: %1$s";
    }
    @Override
    protected String jobOperatorServiceStopped$str() {
        return "WFLYBATCH000004: サービス JobOperatorService は停止され、操作を実行できません。";
    }
    @Override
    protected String noSuchJobException$str() {
        return "WFLYBATCH000005: デプロイメントのジョブ名 '%1$s' は見つかりませんでした。";
    }
    @Override
    protected String couldNotFindJobXml$str() {
        return "WFLYBATCH000006: デプロイメントでジョブ XML ファイルが見つかりませんでした: %1$s";
    }
    @Override
    protected String invalidJobXmlFile$str() {
        return "WFLYBATCH000007: ジョブ XML ファイル %1$s の処理に失敗しました。このジョブを実行しようとするとエラーが発生する可能性があります。";
    }
    @Override
    protected String emptyJobRepositoryElement$str() {
        return "WFLYBATCH000008: デプロイメント記述子に空の job-repository 要素が見つかりました。デプロイメント %1$s にデフォルトのジョブリポジトリーを使用します。";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYBATCH000009: インデックス化された子リソースは、順序付けされた子が親リソースによってサポートされる場合のみ登録できます。'%1$s' の親はインデックス化されていません。";
    }
    @Override
    protected String failedToCreateJobRepository$str() {
        return "WFLYBATCH000011: %1$s ジョブリポジトリーの作成に失敗しました。";
    }
    @Override
    protected String multipleJobRepositoriesFound$str() {
        return "WFLYBATCH000013: jboss-all.xml デプロイメント記述子には 1 つのジョブリポジトリーのみを定義できます。最初のジョブリポジトリーが使用されます。";
    }
    @Override
    protected String stoppingJob$str() {
        return "WFLYBATCH000014: デプロイメント %3$s に対して %2$s の実行 %1$d を停止しています";
    }
    @Override
    protected String stoppingJobFailed$str() {
        return "WFLYBATCH000015: デプロイメント %3$s でジョブ %2$s の実行 %1$d を停止できませんでした";
    }
    @Override
    protected String failedRestartingJob$str() {
        return "WFLYBATCH000016: デプロイメント %3$s でジョブ %2$s の実行 %1$d を再開できませんでした";
    }
    @Override
    protected String restartingJob$str() {
        return "WFLYBATCH000017: 以前停止したバッチジョブ %1$s を再開しています。以前の実行 ID %2$d。新しい実行 ID %3$d。";
    }
    @Override
    protected String noBatchEnvironmentFound$str() {
        return "WFLYBATCH000019: クラスローダーのバッチ環境が見つかりませんでした: %1$s";
    }
    @Override
    protected String unauthorized$str() {
        return "WFLYBATCH000020: パーミッションが拒否されました。ユーザー %1$s には %2$s パーミッションがありません。";
    }
    @Override
    protected String duplicateVirtualFile$str() {
        return "WFLYBATCH000021: 重複した仮想ファイル %1$s。";
    }
}
