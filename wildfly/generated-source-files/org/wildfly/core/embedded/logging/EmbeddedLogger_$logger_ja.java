package org.wildfly.core.embedded.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:18+0200")
public class EmbeddedLogger_$logger_ja extends EmbeddedLogger_$logger implements EmbeddedLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public EmbeddedLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotCreateStandaloneServer$str() {
        return "WFLYEMB0019: ファクトリーを使用してスタンドアロンサーバーを作成できません: %1$s";
    }
    @Override
    protected String errorCopyingFile$str() {
        return "WFLYEMB0028: '%1$s' から '%2$s' へのコピーエラー (%3$s)";
    }
    @Override
    protected String cannotGetReflectiveMethod$str() {
        return "WFLYEMB0018: %1$s の反映メソッド %2$s を取得できません";
    }
    @Override
    protected String processIsReloading$str() {
        return "WFLYEMB0024: 組み込みサーバーはリロード中で、ModelControllerClient の呼び出しはまだ利用できません";
    }
    @Override
    protected String propertySpecifiedFileIsNotADirectory$str() {
        return "WFLYEMB0029: -D%1$s=%2$s is はディレクトリーではありません";
    }
    @Override
    protected String embeddedServerDirectoryNotFound$str() {
        return "WFLYEMB0143: '%2$s' で '%1$s' と呼ばれるディレクトリーはありません";
    }
    @Override
    protected String moduleLoaderAlreadyConfigured$str() {
        return "WFLYEMB0145: モジュールローダーはすでに設定されています。%1$s プロパティーの変更による影響はありません。";
    }
    @Override
    protected String failedToRestoreContext$str() {
        return "WFLYEMB0146: コンテキスト %1$s の復元に失敗しました。";
    }
    @Override
    protected String propertySpecifiedFileDoesNotExist$str() {
        return "WFLYEMB0144: -D%1$s=%2$s は存在しません";
    }
    @Override
    protected String moduleLoaderError$str() {
        return "WFLYEMB0014: %2$s からモジュール %1$s をロードできません";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYEMB0015: %1$s が null です";
    }
    @Override
    protected String cannotInvokeStandaloneServer$str() {
        return "WFLYEMB0022: 組み込みプロセスで '%1$s' を呼び出しできません。";
    }
    @Override
    protected String processIsStopped$str() {
        return "WFLYEMB0027: 組み込みサーバーが停止され、ModelControllerClient の呼び出しは利用できません";
    }
    @Override
    protected String cannotStartEmbeddedServer$str() {
        return "WFLYEMB0021: 組み込みプロセスを起動できません";
    }
    @Override
    protected String cannotLoadEmbeddedServerFactory$str() {
        return "WFLYEMB0017: 組み込みサーバーファクトリーをロードできません: %1$s";
    }
    @Override
    protected String cannotSetupEmbeddedServer$str() {
        return "WFLYEMB0020: 組み込みプロセスを設定できません";
    }
    @Override
    protected String invalidJBossHome$str() {
        return "WFLYEMB0011: 無効な JBoss ホームディレクトリー : %1$s";
    }
    @Override
    protected String cannotCreateHostController$str() {
        return "WFLYEMB0026: ファクトリーを使用してホストコントローラーを作成できません: %1$s";
    }
    @Override
    protected String processIsStopping$str() {
        return "WFLYEMB0023: 組み込みサーバーが停止され、ModelControllerClient の呼び出しは利用できません";
    }
}
