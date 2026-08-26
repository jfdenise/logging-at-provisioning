package org.jipijapa;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:36+0200")
public class JipiLogger_$logger_ja extends JipiLogger_$logger implements JipiLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JipiLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotLoadEntityClass$str() {
        return "JIPI020200: エンティティークラス '%1$s' をロードできませんでした。このエラーを無視し、アプリケーションのデプロイメントを続行します。";
    }
    @Override
    protected String cannotChangeInputStream$str() {
        return "JIPI020201: 入力ストリーム参照を変更できません。";
    }
    @Override
    protected String emptyParameter$str() {
        return "JIPI020202: パラメーター %1$s は空です。";
    }
    @Override
    protected String missingPersistenceUnitMetadata$str() {
        return "JIPI020203: PersistenceUnitMetadata がありません (スレッドローカルが設定されていませんでした)";
    }
    @Override
    protected String notYetImplemented$str() {
        return "JIPI020204: まだ実装されていません。";
    }
    @Override
    protected String nullVar$str() {
        return "JIPI020205: パラメーター %1$s は null です。";
    }
    @Override
    protected String cannotOpenVFSStream$str() {
        return "JIPI020250: VirtualFile ベースの InputStream %1$s を開くことができません";
    }
    @Override
    protected String uriSyntaxException$str() {
        return "JIPI020251: URI 構文エラー";
    }
    @Override
    protected String cannotUseSecondLevelCache$str() {
        return "JIPI020252: 2 次キャッシュが等号されていません - %1$s";
    }
}
