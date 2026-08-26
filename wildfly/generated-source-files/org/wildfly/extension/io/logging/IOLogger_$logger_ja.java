package org.wildfly.extension.io.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:21+0200")
public class IOLogger_$logger_ja extends IOLogger_$logger implements IOLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public IOLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String printDefaultsIoThreads$str() {
        return "WFLYIO002: %3$d 個の利用可能なプロセッサーを基に、ワーカー '%1$s' は %2$d 個の IO スレッドに自動設定しました";
    }
    @Override
    protected String printDefaultsWorkerThreads$str() {
        return "WFLYIO003: %3$d 個の利用可能なプロセッサーを基に、ワーカー '%1$s' は %2$d 個の 最大タスクスレッドに自動設定しました";
    }
    @Override
    protected String wrongStackSize$str() {
        return "WFLYIO008: IO ワーカー %1$d のスタックサイズ %2$s バイトの値は低く、問題が発生する可能性があります。少なくとも 150,000 の値が推奨されます。";
    }
    @Override
    protected String lowGlobalFD$str() {
        return "WFLYIO005: ご使用のシステムには %1$d 個のファイル記述子が設定されていますが、現在のアプリケーションサーバー設定には最低 %2$d 個が必要で、それ以上が必要になる可能性が高くなります。調整を行いますが、この値を大きくしないと安定性の問題が発生することになります。";
    }
    @Override
    protected String noMetrics$str() {
        return "WFLYIO006: 利用できるメトリクスはありません。";
    }
    @Override
    protected String unexpectedBindAddressConflict$str() {
        return "WFLYIO007: %3$s へ宛先 %2$s のバインディングを確立しようとしたときにリソース \"%1$s\" で予期せぬバインディングアドレスの競合が発生しました: %4$s のバインディングはすでに存在します";
    }
    @Override
    protected String printDefaults$str() {
        return "WFLYIO001: %4$d 個の利用可能なプロセッサーを基にして、ワーカー '%1$s' は %3$d 個の最大タスクスレッドを持つ %2$d 個の IO スレッドに自動設定しました";
    }
    @Override
    protected String lowFD$str() {
        return "WFLYIO004: %3$d 個の利用可能なプロセッサーを基に、ワーカー '%1$s' は %2$d 個の最大タスクスレッドに自動設定するはずですが、この設定をサポートするために十分なファイル記述子がこのシステムには設定されていません。ファイル記述子の上限を増やさないとアプリケーションのパフォーマンスが低下する可能性が高くなります。";
    }
}
