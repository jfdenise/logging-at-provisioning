package org.jboss.as.management.client.content;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:29+0200")
public class ManagedDMRContentLogger_$logger_zh_CN extends ManagedDMRContentLogger_$logger_zh implements ManagedDMRContentLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ManagedDMRContentLogger_$logger_zh_CN(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.SIMPLIFIED_CHINESE;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String messageDigestAlgorithmNotAvailable$str() {
        return "WFLYCNT0002: 无法获得信息摘要算法 SHA-1";
    }
    @Override
    protected String illegalChildType$str() {
        return "WFLYCNT0003: 非法子类型 %1$s -- 必须是 %2$s";
    }
    @Override
    protected String invalidHash$str() {
        return "WFLYCNT0001: 地址 %2$s 中内容的无效哈希 '%1$s'；当前哈希为 '%3$s' -- 可能给内容已被另一个调用程序更新吗？";
    }
    @Override
    protected String illegalChildClass$str() {
        return "WFLYCNT0004: 非法子资源类别 %1$s";
    }
    @Override
    protected String noContentFoundWithHash$str() {
        return "WFLYCNT0005: 没有找到使用哈希 %1$s 的内容";
    }
    @Override
    protected String nullParent$str() {
        return "WFLYCNT0006: parent 为空";
    }
}
