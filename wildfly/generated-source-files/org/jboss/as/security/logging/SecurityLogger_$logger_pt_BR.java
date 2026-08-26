package org.jboss.as.security.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:51+0200")
public class SecurityLogger_$logger_pt_BR extends SecurityLogger_$logger_pt implements SecurityLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SecurityLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unableToEnableJaccSupport$str() {
        return "WFLYSEC0105: Não foi possível inicializar o suporte para JACC antigo enquanto o suporte para elytron JACC está ativado.";
    }
    @Override
    protected String runtimeException$str() {
        return "WFLYSEC0007: Exceção do Período de Execução:";
    }
    @Override
    protected String unsupportedOperationExceptionUseResourceDesc$str() {
        return "WFLYSEC0018: Use a variante ResourceDescriptionResolver";
    }
    @Override
    protected String unsupportedOperation$str() {
        return "WFLYSEC0019: Operação não-suportada";
    }
    @Override
    protected String passwordAgain$str() {
        return "WFLYSEC0061: Mais uma vez: ";
    }
    @Override
    protected String validationFailed$str() {
        return "WFLYSEC0107: Falha na validação para %1$s";
    }
    @Override
    protected String xmlStreamExceptionAuth$str() {
        return "WFLYSEC0022: O domínio de segurança pode ter tanto um elemento <authentication> ou <authentication-jaspi>, mas não ambos";
    }
    @Override
    protected String xmlStreamExceptionMissingAttribute$str() {
        return "WFLYSEC0023: Falta o atributo necessário: tanto %1$s ou %2$s deve estar presente";
    }
    @Override
    protected String securityException$str() {
        return "WFLYSEC0015: Exceção de Segurança";
    }
}
