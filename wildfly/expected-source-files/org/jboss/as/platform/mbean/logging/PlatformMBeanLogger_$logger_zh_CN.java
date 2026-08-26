package org.jboss.as.platform.mbean.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:21+0200")
public class PlatformMBeanLogger_$logger_zh_CN extends PlatformMBeanLogger_$logger_zh implements PlatformMBeanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PlatformMBeanLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYPMB0001: 未知属性 %1$s";
    }
    @Override
    protected String modelNotWritable$str() {
        return "WFLYPMB0002: 平台 mbean 资源没有可写入型号";
    }
    @Override
    protected String addingChildrenNotSupported$str() {
        return "WFLYPMB0003: 不支持添加子资源";
    }
    @Override
    protected String removingChildrenNotSupported$str() {
        return "WFLYPMB0004: 不支持删除子资源";
    }
    @Override
    protected String unknownBufferPool$str() {
        return "WFLYPMB0005: 目前不存在名为 '%1$s' 的 BufferPoolMXBean";
    }
    @Override
    protected String badReadAttributeImpl$str() {
        return "WFLYPMB0006: 没有正确实现属性 %1$s 的读取支持";
    }
    @Override
    protected String badWriteAttributeImpl$str() {
        return "WFLYPMB0007: 没有正确实现属性 %1$s 的写支持";
    }
    @Override
    protected String unknownGarbageCollector$str() {
        return "WFLYPMB0008: 目前不存在名为 %1$s 的 GargageCollectorMXBean";
    }
    @Override
    protected String unknownMemoryManager$str() {
        return "WFLYPMB0009: 目前不存在名为 %1$s 的 MemoryManagerMXBean";
    }
    @Override
    protected String unknownMemoryPool$str() {
        return "WFLYPMB0010: 目前不存在名为 %1$s 的 MemoryPoolMXBean";
    }
}
