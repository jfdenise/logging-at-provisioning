package org.jboss.system.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:52+0200")
public class ServiceMBeanLogger_$logger_pt_BR extends ServiceMBeanLogger_$logger_pt implements ServiceMBeanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ServiceMBeanLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unknownLifecycleMethod$str() {
        return "WFLYSYSJMX0002: Método desconhecido do ciclo de vida %1$s";
    }
    @Override
    protected String nullMethodName$str() {
        return "WFLYSYSJMX0001: Nome do método nulo";
    }
    @Override
    protected String startingFailed$str() {
        return "WFLYSYSJMX0006: Falha ao começar %1$s";
    }
    @Override
    protected String errorInDestroy$str() {
        return "WFLYSYSJMX0003: Erro na destruição %1$s";
    }
    @Override
    protected String stoppingFailed$str() {
        return "WFLYSYSJMX0007: Falha na interrupção %1$s";
    }
    @Override
    protected String destroyingFailed$str() {
        return "WFLYSYSJMX0008: Falha na destruição %1$s";
    }
    @Override
    protected String errorInStop$str() {
        return "WFLYSYSJMX0004: Erro na interrupção %1$s";
    }
    @Override
    protected String initializationFailed$str() {
        return "WFLYSYSJMX0005: Falha na inicialização %1$s";
    }
    @Override
    protected String postRegisterInitializationFailed$str() {
        return "WFLYSYSJMX0009: A inicialização falhou durante o postRegister";
    }
}
