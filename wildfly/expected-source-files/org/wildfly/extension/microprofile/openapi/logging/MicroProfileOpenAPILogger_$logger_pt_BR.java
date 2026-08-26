package org.wildfly.extension.microprofile.openapi.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:20+0200")
public class MicroProfileOpenAPILogger_$logger_pt_BR extends MicroProfileOpenAPILogger_$logger_pt implements MicroProfileOpenAPILogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileOpenAPILogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYMPOAI0001: Ativando o subsistema MicroProfile OpenAPI";
    }
    @Override
    protected String failedToLoadStaticFile$str() {
        return "WFLYMPOAI0002: Falha ao carregar o OpenAPI '%1$s' a partir da implantação '%2$s'";
    }
    @Override
    protected String endpointAlreadyRegistered$str() {
        return "WFLYMPOAI0003: O ponto de extremidade MicroProfile OpenAPI já registrado para host '%1$s'. Ignorando a documentação do OpenAPI de '%2$s'.";
    }
    @Override
    protected String endpointRegistered$str() {
        return "WFLYMPOAI0004: Ponto de extremidade MicroProfile OpenAPI '%1$s' registrado para o host '%2$s'";
    }
    @Override
    protected String endpointUnregistered$str() {
        return "WFLYMPOAI0005: Ponto de extremidade MicroProfile OpenAPI não registrado '%1$s' para o host '%2$s'";
    }
    @Override
    protected String requiredListenersNotFound$str() {
        return "WFLYMPOAI0006: §5.1 da especificação do MicroProfile OpenAPI exige que o ponto de extremidade possa ser acessado via %2$s, mas esses ouvintes não estão presentes no servidor '%1$s'.";
    }
    @Override
    protected String nonStandardEndpoint$str() {
        return "WFLYMPOAI0007: §5.1 da especificação MicroProfile OpenAPI exige que a documentação esteja disponível em '%3$s', mas '%1$s' está configurado para usar '%2$s'.";
    }
    @Override
    protected String disabled$str() {
        return "WFLYMPOAI0008: Documentação do MicroProfile OpenAPI desabilitada para '%1$s'";
    }
}
