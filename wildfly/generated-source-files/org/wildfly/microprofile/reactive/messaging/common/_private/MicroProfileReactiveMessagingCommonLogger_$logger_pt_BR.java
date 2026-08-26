package org.wildfly.microprofile.reactive.messaging.common._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:37+0200")
public class MicroProfileReactiveMessagingCommonLogger_$logger_pt_BR extends MicroProfileReactiveMessagingCommonLogger_$logger_pt implements MicroProfileReactiveMessagingCommonLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveMessagingCommonLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String noElytronClientSSLContext$str() {
        return "WFLYRXMKAF0002: Não foi possível encontrar um client-ssl-context Elytron chamado: %1$s";
    }
    @Override
    protected String foundPropertyUsingElytronClientSSLContext$str() {
        return "WFLYRXMKAF0001: A propriedade encontrada %1$s usará o contexto client-ssl-context Elytron: %2$s";
    }
}
