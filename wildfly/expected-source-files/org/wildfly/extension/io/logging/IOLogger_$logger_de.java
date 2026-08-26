package org.wildfly.extension.io.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:19+0200")
public class IOLogger_$logger_de extends IOLogger_$logger implements IOLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public IOLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String printDefaults$str() {
        return "WFLYIO001: Worker '%1$s' konfigurierte automatisch die %2$d IO-Threads mit max. %3$d Task-Threads basierend auf Ihren %4$d verfügbaren Prozessoren";
    }
    @Override
    protected String printDefaultsIoThreads$str() {
        return "WFLYIO002: Worker '%1$s' konfigurierte automatisch die %2$d IO-Threads basierend auf Ihren %3$d verfügbaren Prozessoren";
    }
    @Override
    protected String printDefaultsWorkerThreads$str() {
        return "WFLYIO003: Worker '%1$s' konfigurierte automatisch die max. %2$d Core-Threads basierend auf Ihren %3$d verfügbaren Prozessoren";
    }
    @Override
    protected String lowFD$str() {
        return "WFLYIO004: Worker '%1$s' würde automatisch die max. %2$d Core-Threads basierend auf %3$d verfügbaren Prozessoren konfigurieren, allerdings hat Ihr System nicht genügend Dateideskriptoren, um diese Konfiguration zu unterstützen. Sie werden wahrscheinlich negative Auswirkungen auf Ihre Anwendung bemerken, wenn Sie das Dateideskriptor-Limit nicht erhöhen.";
    }
    @Override
    protected String lowGlobalFD$str() {
        return "WFLYIO005: Ihr System ist mit %1$d Dateideskriptoren konfiguriert, aber Ihre derzeitige Anwendungsserverkonfiguration erfordert mindestens %2$d (wahrscheinlich mehr). Eine Anpassung wird versucht, allerdings werden wahrscheinlich Probleme mit der Stabilität auftreten, wenn Sie diese Zahl nicht erhöhen";
    }
    @Override
    protected String noMetrics$str() {
        return "WFLYIO006: Keine Metrik verfügbar";
    }
    @Override
    protected String unexpectedBindAddressConflict$str() {
        return "WFLYIO007: Unerwarteter Bindungsadresskonflikt in Ressource \"%1$s\" beim Versuch, eine Bindung für Ziel %2$s an %3$s herzustellen: Es ist bereits eine Bindung von %4$s vorhanden";
    }
    @Override
    protected String wrongStackSize$str() {
        return "WFLYIO008: Der Stack-Größenwert von %1$d Byte für IO-Worker %2$s ist niedrig und kann zu Problemen führen. Es wird ein Wert von mindestens 150.000 empfohlen.";
    }
}
