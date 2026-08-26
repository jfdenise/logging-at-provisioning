package org.jboss.as.jdr.logger;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:23+0200")
public class JdrLogger_$logger_ja extends JdrLogger_$logger implements JdrLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JdrLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String jdrConfigMessage$str() {
        return "稼働していない場合はサーバーの設定ファイル。";
    }
    @Override
    protected String couldNotConfigureJDR$str() {
        return "WFLYJDR0008: JDR を設定できませんでした。最低でも 1 つの設定手順に失敗しました。";
    }
    @Override
    protected String jdrDescriptionMessage$str() {
        return "JBoss Diagnostic Reporter (JDR) は、トラブルシューティングで役に立つ情報を収集するために構築されたサブシステムです。jdr スクリプトは JDR レポートを生成するユーティリティーです。";
    }
    @Override
    protected String noCommandsToRun$str() {
        return "WFLYJDR0009: JDR コマンドはロードされませんでした。有効な Plugin クラスが plugins.properties に指定されているようにしてください。";
    }
    @Override
    protected String jdrProtocolMessage$str() {
        return "接続に使用されるプロトコル。remote、http、または https を指定できます (デフォルトは http)。";
    }
    @Override
    protected String jdrPortMessage$str() {
        return "管理 api のバインド先のポート (デフォルト: 9990)";
    }
    @Override
    protected String couldNotCreateJDRPropertiesFile$str() {
        return "WFLYJDR0012: %1$s で JDR プロパティーファイルが見つかりませんでした。";
    }
    @Override
    protected String jdrHostnameMessage$str() {
        return "管理 api のバインド先のホスト名 (デフォルト: localhost)";
    }
    @Override
    protected String couldNotCreateZipfile$str() {
        return "WFLYJDR0007: zip ファイルを作成できませんでした。";
    }
    @Override
    protected String jdrHelpMessage$str() {
        return "このメッセージを表示し、終了";
    }
    @Override
    protected String couldNotFindJDRPropertiesFile$str() {
        return "WFLYJDR0011: JDR プロパティーファイルが見つかりませんでした。";
    }
}
