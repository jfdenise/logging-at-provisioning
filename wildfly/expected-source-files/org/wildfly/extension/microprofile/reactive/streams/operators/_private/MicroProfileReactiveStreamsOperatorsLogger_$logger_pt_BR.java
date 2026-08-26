package org.wildfly.extension.microprofile.reactive.streams.operators._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:22+0200")
public class MicroProfileReactiveStreamsOperatorsLogger_$logger_pt_BR extends MicroProfileReactiveStreamsOperatorsLogger_$logger_pt implements MicroProfileReactiveStreamsOperatorsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public MicroProfileReactiveStreamsOperatorsLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYRXSTOPS0001: Ativando o subsistema MicroProfile Reactive Streams Operators";
    }
    @Override
    protected String deploymentRequiresCapability$str() {
        return "WFLYRXSTOPS0002: A implantação %1$s requer o uso da funcionalidade '%2$s', mas esta não está registada no momento";
    }
}
