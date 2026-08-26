package org.wildfly.extension.core.management.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:11+0200")
public class CoreManagementLogger_$logger_ja extends CoreManagementLogger_$logger implements CoreManagementLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public CoreManagementLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String errorToInstantiateClassInstanceFromModule$str() {
        return "WFLYCM0008: モジュール %2$s からクラス %1$s のインスタンスのインスタンス化でエラー";
    }
    @Override
    protected String processStateInitError$str() {
        return "WFLYCM0002: process state listener の初期化でエラー %1$s";
    }
    @Override
    protected String processStateCleanupError$str() {
        return "WFLYCM0005: process state listener のクリーンアップでエラー %1$s";
    }
    @Override
    protected String processStateInvokationError$str() {
        return "WFLYCM0003: process state listener の呼び出しエラー %1$s";
    }
    @Override
    protected String testOutputNumberOfClassesScanned$str() {
        return "WFLYCM0016: %1$d";
    }
    @Override
    protected String errorToLoadModule$str() {
        return "WFLYCM0006: モジュール %1$s のロードでエラー";
    }
    @Override
    protected String classUsesAnnotatedAnnotations$str() {
        return "WFLYCM0015: クラス %1$s に 1 つ以上のアノテーションが付けられており、そのアノテーションに不安定な api を示す次のアノテーションが付けられています: %2$s";
    }
    @Override
    protected String classReferencesFieldWithUnstableApiAnnotations$str() {
        return "WFLYCM0012: %1$s が参照するフィールド %2$s.%3$s に %4$s アノテーションが付けられています";
    }
    @Override
    protected String classImplementsInterfaceWithUnstableApiAnnotations$str() {
        return "WFLYCM0011: %1$s が実装する %2$s に %3$s アノテーションが付けられています";
    }
    @Override
    protected String classExtendsClassWithUnstableApiAnnotations$str() {
        return "WFLYCM0010: %1$s が拡張する %2$s に %3$s アノテーションが付けられています";
    }
    @Override
    protected String classReferencesMethodWithUnstableApiAnnotations$str() {
        return "WFLYCM0013: %1$s が参照するメソッド %2$s.%3$s%4$s に %5$s アノテーションが付けられています";
    }
    @Override
    protected String errorToLoadModuleClass$str() {
        return "WFLYCM0007: モジュール %2$s からのクラス %1$s のロードでエラー";
    }
    @Override
    protected String processStateTimeoutError$str() {
        return "WFLYCM0004: process state listener %1$s の完了に時間がかかりすぎました";
    }
    @Override
    protected String deploymentContainsUnstableApiAnnotations$str() {
        return "WFLYCM0009: %1$s で不安定な API を示すアノテーションが使用されています。";
    }
    @Override
    protected String classReferencesClassWithUnstableApiAnnotations$str() {
        return "WFLYCM0014: %1$s が参照するクラス %2$s に %3$s アノテーションが付けられています";
    }
}
