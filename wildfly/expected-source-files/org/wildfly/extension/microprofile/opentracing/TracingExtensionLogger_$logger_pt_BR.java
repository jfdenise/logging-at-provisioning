package org.wildfly.extension.microprofile.opentracing;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T12:02:21+0200")
public class TracingExtensionLogger_$logger_pt_BR extends TracingExtensionLogger_$logger_pt implements TracingExtensionLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public TracingExtensionLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYTRACEXT0001: Ativando o subsistema MicroProfile OpenTracing";
    }
    @Override
    protected String migrateOperationAllowedOnlyInAdminOnly$str() {
        return "WFLYTRACEXT0013: A operação de migração não pode ser executada: o servidor deve estar em modo admin-only";
    }
    @Override
    protected String migrationFailed$str() {
        return "WFLYTRACEXT0014: A migração falhou. Veja resultados para mais detalhes.";
    }
}
