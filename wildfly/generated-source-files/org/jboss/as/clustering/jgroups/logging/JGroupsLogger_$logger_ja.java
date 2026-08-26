package org.jboss.as.clustering.jgroups.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:06+0200")
public class JGroupsLogger_$logger_ja extends JGroupsLogger_$logger implements JGroupsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JGroupsLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String notFound$str() {
        return "WFLYCLJG0008: %1$s を検索できませんでした。";
    }
    @Override
    protected String disconnected$str() {
        return "WFLYCLJG0035: '%1$s' チャンネルを切断しました。'%2$s' はクラスター '%3$s' を離れました";
    }
    @Override
    protected String unrecognizedProtocolProperty$str() {
        return "WFLYCLJG0031: 認識さえない %1$s プロパティーを無視します: %2$s";
    }
    @Override
    protected String connecting$str() {
        return "WFLYCLJG0032: '%1$s' チャンネルを接続中です。'%2$s' は %4$s 経由でクラスター '%3$s' に参加します";
    }
    @Override
    protected String parserFailure$str() {
        return "WFLYCLJG0007: %1$s の解析に失敗しました。";
    }
    @Override
    protected String unexpectedKeyStoreEntryType$str() {
        return "WFLYCLJG0023: %1$s キーストアエントリーは想定されたタイプではありません: %2$s";
    }
    @Override
    protected String legacyProtocol$str() {
        return "WFLYCLJG0030: プロコトル %1$s は廃止され %2$s に自動更新されます";
    }
    @Override
    protected String keyEntryNotFound$str() {
        return "WFLYCLJG0022: 設定されたキーストアで %1$s エントリーが見つかりませんでした";
    }
    @Override
    protected String unexpectedCredentialSource$str() {
        return "WFLYCLJG0025: 設定されたクレデンシャルソースはクリアテキストのパスワードクレデンシャルを参照しません";
    }
    @Override
    protected String unableToLoadProtocolClass$str() {
        return "WFLYCLJG0016: プロトコルクラス %1$s をロードできません";
    }
    @Override
    protected String unknownMetric$str() {
        return "WFLYCLJG0015: 不明なメトリック %1$s";
    }
    @Override
    protected String failedToResolveSocketBinding$str() {
        return "WFLYCLJG0028: '%1$s' という名前のアウトバウンドソケットバインディングの宛先アドレスを解決できませんでした";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYCLJG0001: JGroups サブシステムをアクティベートしています。 JGroups バージョン %1$s";
    }
    @Override
    protected String connected$str() {
        return "WFLYCLJG0033: '%1$s' チャンネルを接続しました。'%2$s' はビュー: %4$s で '%3$s' クラスターに参加しました";
    }
    @Override
    protected String disconnecting$str() {
        return "WFLYCLJG0034: '%1$s' チャンネルを切断中です。'%2$s' はビュー: %4$s で '%3$s' クラスターを離れました";
    }
}
