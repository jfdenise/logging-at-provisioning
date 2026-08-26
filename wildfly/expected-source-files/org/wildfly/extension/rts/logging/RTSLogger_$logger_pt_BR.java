package org.wildfly.extension.rts.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:58:12+0200")
public class RTSLogger_$logger_pt_BR extends RTSLogger_$logger_pt implements RTSLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public RTSLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failueOnImportingGlobalTransactionFromWildflyClient$str() {
        return "WFLYRTS0001: Não é possível importar a transação global para o cliente de transação WildFly.";
    }
    @Override
    protected String cannotGetTransactionStatus$str() {
        return "WFLYRTS0002: Não é possível obter o status da transação no contexto de identificação de resposta%1$s";
    }
}
