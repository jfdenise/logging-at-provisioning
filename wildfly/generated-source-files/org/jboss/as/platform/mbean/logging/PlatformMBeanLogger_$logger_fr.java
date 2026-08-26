package org.jboss.as.platform.mbean.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:45+0200")
public class PlatformMBeanLogger_$logger_fr extends PlatformMBeanLogger_$logger implements PlatformMBeanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public PlatformMBeanLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String removingChildrenNotSupported$str() {
        return "WFLYPMB0004: Le retrait des ressources enfant n'est pas pris en charge";
    }
    @Override
    protected String badReadAttributeImpl$str() {
        return "WFLYPMB0006: Le support de lecture de l'attribut %1$s n'a pas été implémenté correctement";
    }
    @Override
    protected String unknownBufferPool$str() {
        return "WFLYPMB0005: Aucun BufferPoolMXBean possédant le nom '%1$s' existe actuellement";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYPMB0001: Pas d'attribut connu %1$s";
    }
    @Override
    protected String badWriteAttributeImpl$str() {
        return "WFLYPMB0007: Le support d'écriture de l'attribut %1$s n'a pas été implémenté correctement";
    }
    @Override
    protected String addingChildrenNotSupported$str() {
        return "WFLYPMB0003: L'ajout des ressources enfant n'est pas pris en charge";
    }
    @Override
    protected String unknownGarbageCollector$str() {
        return "WFLYPMB0008: Aucun GarbageCollectorMXBean nommé %1$s n'existe actuellement";
    }
    @Override
    protected String modelNotWritable$str() {
        return "WFLYPMB0002: Une ressource mbean de plate-forme n'a pas de modèle permissible en écriture";
    }
    @Override
    protected String unknownMemoryManager$str() {
        return "WFLYPMB0009: Aucun MemoryManagerMXBean nommé %1$s n'existe actuellement";
    }
    @Override
    protected String unknownMemoryPool$str() {
        return "WFLYPMB0010: Aucun MemoryPoolMXBean nommé %1$s n'existe actuellement";
    }
}
