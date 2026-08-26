package org.wildfly.extension.security.manager.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:50+0200")
public class SecurityManagerLogger_$logger_pt_BR extends SecurityManagerLogger_$logger_pt implements SecurityManagerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SecurityManagerLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String unexpectedElement$str() {
        return "WFLYSM0006: Elemento '%1$s' inesperado encontrado";
    }
    @Override
    protected String invalidSubsystemConfiguration$str() {
        return "WFLYSM0003: Erro de configuração de subsistema: as permissões a seguir não são implícitas pelas definições de permissões máximas definidas %1$s";
    }
    @Override
    protected String unexpectedEndOfDocument$str() {
        return "WFLYSM0008: Final de documento inesperado";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYSM0009: O(s) atributo(s) necessário(s) ausente(s): %1$s";
    }
    @Override
    protected String unexpectedAttribute$str() {
        return "WFLYSM0007: Atributo '%1$s' inesperado encontrado";
    }
    @Override
    protected String ignoredPermission$str() {
        return "WFLYSM0012: A seguinte permissão não pôde ser construída e será ignorada no %1$s: (class=\"%2$s\" name=\"%3$s\" actions=\"%4$s\")";
    }
    @Override
    protected String rejectedEmptyMaximumSet$str() {
        return "WFLYSM0005: Os conjuntos máximos vazios não são compreendidos na versão do modelo de destino e devem ser rejeitados";
    }
    @Override
    protected String missingRequiredElements$str() {
        return "WFLYSM0010: Elemento(s) necessário(s) ausente(s): %1$s";
    }
    @Override
    protected String invalidDeploymentConfiguration$str() {
        return "WFLYSM0004: Erro de configuração de implantação: as permissões a seguir não são implícitas pelas definições de permissões máximas %1$s";
    }
    @Override
    protected String unexpectedContentType$str() {
        return "WFLYSM0011: Conteúdo inesperado do tipo %1$s";
    }
    @Override
    protected String invalidPermissionsXMLVersion$str() {
        return "WFLYSM0002: Versão inválida encontrada no elemento de permissões. Encontrada %1$s, esperava-se %2$s";
    }
}
