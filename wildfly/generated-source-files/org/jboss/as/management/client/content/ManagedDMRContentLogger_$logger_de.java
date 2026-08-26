package org.jboss.as.management.client.content;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:29+0200")
public class ManagedDMRContentLogger_$logger_de extends ManagedDMRContentLogger_$logger implements ManagedDMRContentLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ManagedDMRContentLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String messageDigestAlgorithmNotAvailable$str() {
        return "WFLYCNT0002: Erhalt von Message Digest Algorithmus SHA-1 nicht möglich";
    }
    @Override
    protected String illegalChildType$str() {
        return "WFLYCNT0003: Unzulässiger untergeordneter Typ %1$s – muss %2$s sein";
    }
    @Override
    protected String invalidHash$str() {
        return "WFLYCNT0001: Ungültiger Hash '%1$s' für Inhalt an Adresse %2$s; aktueller Hash ist '%3$s' -- wurde der Inhalt möglicherweise von einem anderen Aufrufer aktualisiert?";
    }
    @Override
    protected String illegalChildClass$str() {
        return "WFLYCNT0004: Unzulässige untergeordnete Ressourcenklasse %1$s";
    }
    @Override
    protected String noContentFoundWithHash$str() {
        return "WFLYCNT0005: Kein Inhalt mit Hash %1$s gefunden";
    }
    @Override
    protected String nullParent$str() {
        return "WFLYCNT0006: Null-Parent";
    }
}
