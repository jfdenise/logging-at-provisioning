package org.jboss.as.platform.mbean.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:45+0200")
public class PlatformMBeanLogger_$logger_ja extends PlatformMBeanLogger_$logger implements PlatformMBeanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PlatformMBeanLogger_$logger_ja(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.JAPANESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String removingChildrenNotSupported$str() {
        return "WFLYPMB0004: 子リソースの削除には対応していません。";
    }
    @Override
    protected String badReadAttributeImpl$str() {
        return "WFLYPMB0006: 属性 %1$s に対する読み込みサポートが正しく実装されていませんでした。";
    }
    @Override
    protected String unknownBufferPool$str() {
        return "WFLYPMB0005: ’%1$s’ という名前の BufferPoolMXBean は現在存在しません。";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYPMB0001: 不明な属性 %1$s";
    }
    @Override
    protected String badWriteAttributeImpl$str() {
        return "WFLYPMB0007: 属性 %1$s に対する書き込みサポートが正しく実装されていませんでした。";
    }
    @Override
    protected String addingChildrenNotSupported$str() {
        return "WFLYPMB0003: 子リソースの追加には対応していません。";
    }
    @Override
    protected String unknownGarbageCollector$str() {
        return "WFLYPMB0008: %1$s という名前の GarbageCollectorMXBean は現在存在しません。";
    }
    @Override
    protected String modelNotWritable$str() {
        return "WFLYPMB0002: プラットフォーム mbean リソースには書き込み可能なモデルがありません。";
    }
    @Override
    protected String unknownMemoryManager$str() {
        return "WFLYPMB0009: %1$s という名前の MemoryManagerMXBean は現在存在しません。";
    }
    @Override
    protected String unknownMemoryPool$str() {
        return "WFLYPMB0010: %1$s という名前の MemoryPoolMXBean は現在存在しません。";
    }
}
