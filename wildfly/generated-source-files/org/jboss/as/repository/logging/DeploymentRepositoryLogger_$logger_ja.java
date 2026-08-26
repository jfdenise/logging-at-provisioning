package org.jboss.as.repository.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:12+0200")
public class DeploymentRepositoryLogger_$logger_ja extends DeploymentRepositoryLogger_$logger implements DeploymentRepositoryLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DeploymentRepositoryLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String obsoleteContentCleaned$str() {
        return "WFLYDR0009: コンテンツ %1$s は廃止されたため削除されます。";
    }
    @Override
    protected String contentDeletionError$str() {
        return "WFLYDR0010: コンテンツ %1$s を削除できませんでした。";
    }
    @Override
    protected String archiveNotFound$str() {
        return "WFLYDR0016: アーカイブファイル %1$s が見つかりません。";
    }
    @Override
    protected String errorUpdatingDeployment$str() {
        return "WFLYDR0021: 展開されたデプロイメントのコンテンツの更新中にエラーが発生しました";
    }
    @Override
    protected String directoryNotWritable$str() {
        return "WFLYDR0006: ディレクトリー %1$s は書き込み不可です。";
    }
    @Override
    protected String localContentListError$str() {
        return "WFLYDR0011: %1$s のディレクトリーファイルをリストできませんでした。";
    }
    @Override
    protected String hashingError$str() {
        return "WFLYDR0012: 現在のデプロイメントコンテンツ %1$s をハッシュできません。";
    }
    @Override
    protected String notAnArchive$str() {
        return "WFLYDR0015: %1$s はアーカイブファイルではありません。";
    }
    @Override
    protected String forbiddenPath$str() {
        return "WFLYDR0013: デプロイメントの %1$s でコンテンツへのアクセスが拒否されました。";
    }
    @Override
    protected String contentAdded$str() {
        return "WFLYDR0001: ロケーション %1$s にコンテンツが追加されました。";
    }
    @Override
    protected String cannotDeleteTempFile$str() {
        return "WFLYDR0003: 一時ファイル %1$s は削除できません。終了時に削除されます。";
    }
    @Override
    protected String cannotObtainSha1$str() {
        return "WFLYDR0005: SHA-1 %1$s を取得できません。";
    }
    @Override
    protected String notADirectory$str() {
        return "WFLYDR0007: %1$s はディレクトリーではありません。";
    }
    @Override
    protected String couldNotDeleteDeployment$str() {
        return "WFLYDR0014: デプロイメント %1$s の削除中にエラーが発生しました。";
    }
    @Override
    protected String errorAccessingDeployment$str() {
        return "WFLYDR0020: デプロイメントファイルのアクセス中にエラーが発生しました";
    }
    @Override
    protected String errorCopyingDeployment$str() {
        return "WFLYDR0022: 展開されたデプロイメントのファイルを %1$s にコピーするときにエラーが発生しました。";
    }
    @Override
    protected String cannotCreateDirectory$str() {
        return "WFLYDR0004: ディレクトリー %1$s を作成できません。";
    }
    @Override
    protected String cannotDeleteFile$str() {
        return "WFLYDR0023: ファイル %1$s の削除中にエラーが発生しました。";
    }
    @Override
    protected String errorExplodingContent$str() {
        return "WFLYDR0018: %1$s のコンテンツの展開中にエラーが発生しました";
    }
    @Override
    protected String errorLockingDeployment$str() {
        return "WFLYDR0019: デプロイメントが別の操作によりロックされています。";
    }
    @Override
    protected String cannotCopyFile$str() {
        return "WFLYDR0024: ファイル %1$s のコピー中にエラーが発生しました。";
    }
    @Override
    protected String contentRemoved$str() {
        return "WFLYDR0002: ロケーション %1$s からコンテンツを削除しました。";
    }
    @Override
    protected String contentExploded$str() {
        return "WFLYDR0017: 場所 %1$s で展開されたコンテンツ";
    }
}
