package org.wildfly.extension.microprofile.config.smallrye._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:10+0200")
public class MicroProfileConfigLogger_$logger_pt_BR extends MicroProfileConfigLogger_$logger_pt implements MicroProfileConfigLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileConfigLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYCONF0001: Ativando o subsistema da MicroProfile Config";
    }
    @Override
    protected String unableToLoadClassFromModule$str() {
        return "WFLYCONF0002: Não foi possível carregar classe %1$s a partir do módulo %2$s";
    }
    @Override
    protected String loadConfigSourceFromDir$str() {
        return "WFLYCONF0003: Use o diretório para a origem da MicroProfile Config: %1$s";
    }
    @Override
    protected String loadConfigSourceFromClass$str() {
        return "WFLYCONF0004: Use a classe para a origem da MicroProfile Config: %1$s";
    }
    @Override
    protected String loadConfigSourceRootFromDir$str() {
        return "WFLYCONF0009: Use o diretório para a raiz da MicroProfile Config Source: %1$s";
    }
    @Override
    protected String logDirectoriesUnderConfigSourceRoot$str() {
        return "WFLYCONF0010: O diretório-raiz da MicroProfile Config Source '%1$s' contém os seguintes diretórios que serão usados como MicroProfile Config Sources: %2$s";
    }
}
