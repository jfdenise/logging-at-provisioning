package org.jboss.as.platform.mbean.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:45+0200")
public class PlatformMBeanLogger_$logger_de extends PlatformMBeanLogger_$logger implements PlatformMBeanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PlatformMBeanLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String removingChildrenNotSupported$str() {
        return "WFLYPMB0004: Entfernung untergeordneter Ressourcen wird nicht unterstützt";
    }
    @Override
    protected String badReadAttributeImpl$str() {
        return "WFLYPMB0006: Read-Support für Attribut %1$s nicht ordnungsgemäß implementiert";
    }
    @Override
    protected String unknownBufferPool$str() {
        return "WFLYPMB0005: Es existiert derzeit kein BufferPoolMXBean namens %1$s";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYPMB0001: Kein bekanntes Attribut %1$s";
    }
    @Override
    protected String badWriteAttributeImpl$str() {
        return "WFLYPMB0007: Write-Support für Attribut %1$s nicht ordnungsgemäß implementiert";
    }
    @Override
    protected String addingChildrenNotSupported$str() {
        return "WFLYPMB0003: Hinzufügung untergeordneter Ressourcen wird nicht unterstützt";
    }
    @Override
    protected String unknownGarbageCollector$str() {
        return "WFLYPMB0008: Es existiert derzeit kein GarbageCollectorMXBean namens %1$s";
    }
    @Override
    protected String modelNotWritable$str() {
        return "WFLYPMB0002: Eine Plattform mbean Ressource hat kein schreibbares Modell";
    }
    @Override
    protected String unknownMemoryManager$str() {
        return "WFLYPMB0009: Es existiert derzeit kein MemoryManagerMXBean namens %1$s";
    }
    @Override
    protected String unknownMemoryPool$str() {
        return "WFLYPMB0010: Es existiert derzeit kein MemoryPoolMXBean namens %1$s";
    }
}
