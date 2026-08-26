package org.jboss.as.protocol.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:47+0200")
public class ProtocolLogger_$logger_ja extends ProtocolLogger_$logger implements ProtocolLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ProtocolLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String invalidType3$str() {
        return "WFLYPRT0035: 型は %1$s あるいは %2$s のいずれかです: %3$s";
    }
    @Override
    protected String cancelledAsyncTaskBeforeRun$str() {
        return "WFLYPRT0058: %1$s によって、実行開始前にタスクがキャンセルされました。";
    }
    @Override
    protected String channelTimedOut$str() {
        return "WFLYPRT0060: チャネルオープンリクエストがタイムアウトしました";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYPRT0003: リソース %1$s を終了することができませんでした。";
    }
    @Override
    protected String channelClosed$str() {
        return "WFLYPRT0054: チャネルは閉じています";
    }
    @Override
    protected String errorClosingChannel$str() {
        return "WFLYPRT0001: チャネル %1$s の切断エラー";
    }
    @Override
    protected String couldNotConnect$str() {
        return "WFLYPRT0023: %1$s に接続できませんでした。接続はタイムアウトしています。";
    }
    @Override
    protected String operationIdAlreadyExists$str() {
        return "WFLYPRT0051: id %1$d の操作はすでに登録されています。";
    }
    @Override
    protected String failedToConnect$str() {
        return "WFLYPRT0053: %1$s に接続できませんでした。接続は失敗しました。";
    }
    @Override
    protected String noSuchRequest$str() {
        return "WFLYPRT0018: チャネル %2$s に関連付けられたそのようなリクエスト (%1$d) はありません。";
    }
    @Override
    protected String nullExecutor$str() {
        return "WFLYPRT0052: null のエグゼキューター";
    }
    @Override
    protected String cancelledAsyncTask$str() {
        return "WFLYPRT0057: %1$s により %2$s が中断され、タスクがキャンセルされました。";
    }
    @Override
    protected String responseHandlerNotFound$str() {
        return "WFLYPRT0056: 要求 %1$s の応答ハンドラーがありません";
    }
    @Override
    protected String noSuchResponseHandler$str() {
        return "WFLYPRT0055: リクエストタイプ '%1$s' に登録したハンドラーがありません。";
    }
    @Override
    protected String failedToCloseServerSocket$str() {
        return "WFLYPRT0004: サーバーソケット %1$s の終了に失敗しました。";
    }
    @Override
    protected String deprecatedCLIConfiguration$str() {
        return "WFLYPRT0059: 非推奨の方法を使用してクライアントバインドアドレスを設定しています。%1$s システムプロパティーの代わりに CLI で --bind パラメーターを使用してください。";
    }
    @Override
    protected String invalidType1$str() {
        return "WFLYPRT0034: 無効な型 %1$s";
    }
    @Override
    protected String invalidByteToken$str() {
        return "WFLYPRT0030: 無効なバイトトークン。'%1$d' を想定しましたが '%2$d' を取得。";
    }
    @Override
    protected String invalidSignature$str() {
        return "WFLYPRT0032: 無効な署名 [%1$s]";
    }
}
