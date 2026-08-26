package org.jboss.as.platform.mbean.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:21+0200")
public class PlatformMBeanLogger_$logger_pt_BR extends PlatformMBeanLogger_$logger_pt implements PlatformMBeanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PlatformMBeanLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYPMB0001: Atributo não conhecido %1$s";
    }
    @Override
    protected String modelNotWritable$str() {
        return "WFLYPMB0002: O recurso da plataforma não possui modelo gravável";
    }
    @Override
    protected String addingChildrenNotSupported$str() {
        return "WFLYPMB0003: Adição dos recursos não é suportado";
    }
    @Override
    protected String removingChildrenNotSupported$str() {
        return "WFLYPMB0004: A remoção dos recursos filho não é suportada";
    }
    @Override
    protected String unknownBufferPool$str() {
        return "WFLYPMB0005: Atualmente, não existe nenhum BufferPoolMXBean com o nome %1$s";
    }
    @Override
    protected String badReadAttributeImpl$str() {
        return "WFLYPMB0006: O suporte de leitura para o atributo %1$s não foi implantado adequadamente";
    }
    @Override
    protected String badWriteAttributeImpl$str() {
        return "WFLYPMB0007: O suporte de gravação para o atributo %1$s não foi implantado adequadamente";
    }
    @Override
    protected String unknownGarbageCollector$str() {
        return "WFLYPMB0008: Não existe nenhum GarbageCollectorMXBean com o nome %1$s";
    }
    @Override
    protected String unknownMemoryManager$str() {
        return "WFLYPMB0009: Não existe nenhum MemoryManagerMXBean com o nome %1$s";
    }
    @Override
    protected String unknownMemoryPool$str() {
        return "WFLYPMB0010: Não existe nenhum MemoryPoolMXBean com o nome %1$s";
    }
}
