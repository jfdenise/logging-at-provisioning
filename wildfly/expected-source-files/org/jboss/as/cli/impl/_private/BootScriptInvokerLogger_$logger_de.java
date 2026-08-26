package org.jboss.as.cli.impl._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:35+0200")
public class BootScriptInvokerLogger_$logger_de extends BootScriptInvokerLogger_$logger implements BootScriptInvokerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BootScriptInvokerLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String processScript$str() {
        return "WFLYCLI0001: CLI-Skript %1$s wird verarbeitet";
    }
    @Override
    protected String errorProcessingScript$str() {
        return "WFLYCLI0002: Fehler bei der Verarbeitung von CLI-Skript %1$s";
    }
    @Override
    protected String propertiesFileNotFound$str() {
        return "WFLYCLI0003: CLI-Eigenschaftendatei %1$s nicht gefunden";
    }
    @Override
    protected String cliOutput$str() {
        return "WFLYCLI0004: Ausgabe der CLI-Ausführung:";
    }
    @Override
    protected String doneProcessScript$str() {
        return "WFLYCLI0005: Verarbeitung des CLI-Skripts %1$s beendet";
    }
    @Override
    protected String executeCommand$str() {
        return "WFLYCLI0006: CLI-Befehl %1$s wird ausgeführt";
    }
    @Override
    protected String unexpectedException$str() {
        return "WFLYCLI0007: Unerwartete Ausnahme bei der Verarbeitung von CLI-Befehlen aus %1$s";
    }
    @Override
    protected String unexpectedErrors$str() {
        return "WFLYCLI0008: Fehler bei der Verarbeitung des CLI-Skripts %1$s. Die Operationen wurden ausgeführt, aber es traten unerwartete Werte auf. Siehe Liste der Fehler in %2$s";
    }
    @Override
    protected String unexpectedCommandException$str() {
        return "WFLYCLI0009: Unerwartete Ausnahme bei der Verarbeitung des CLI-Befehls %1$s aus %2$s";
    }
}
