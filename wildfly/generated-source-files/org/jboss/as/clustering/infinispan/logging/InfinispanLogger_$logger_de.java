package org.jboss.as.clustering.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:05+0200")
public class InfinispanLogger_$logger_de extends InfinispanLogger_$logger implements InfinispanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYCLINF0001: Aktivierung des Infinispan-Untersystems.";
    }
    @Override
    protected String remoteCacheContainerStarted$str() {
        return "WFLYCLINF0029: Remote-Cache-Container \"%1$s\" gestartet.";
    }
    @Override
    protected String remoteCacheContainerStopped$str() {
        return "WFLYCLINF0030: Remote-Cache-Container \"%1$s\" angehalten.";
    }
    @Override
    protected String invalidCacheStore$str() {
        return "WFLYCLINF0010: %1$s ist kein gültiger Cache-Speicher";
    }
    @Override
    protected String marshallerEnumValueDeprecated$str() {
        return "WFLYCLINF0033: Das Attribut '%1$s' ist so konfiguriert, dass ein veralteter Wert verwendet wird: %2$s. Verwenden Sie stattdessen einen der folgenden Werte: %3$s";
    }
    @Override
    protected String cacheStopped$str() {
        return "WFLYCLINF0003: %1$s Cache von %2$s Container gestoppt";
    }
    @Override
    protected String cacheStarted$str() {
        return "WFLYCLINF0002: %1$s Cache von %2$s Container gestartet";
    }
}
