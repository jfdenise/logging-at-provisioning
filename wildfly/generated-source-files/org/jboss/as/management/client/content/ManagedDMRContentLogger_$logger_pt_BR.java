package org.jboss.as.management.client.content;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:29+0200")
public class ManagedDMRContentLogger_$logger_pt_BR extends ManagedDMRContentLogger_$logger_pt implements ManagedDMRContentLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ManagedDMRContentLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String messageDigestAlgorithmNotAvailable$str() {
        return "WFLYCNT0002: Não foi possível obter o algoritmo de Resumo da Mensagem SHA-1";
    }
    @Override
    protected String illegalChildType$str() {
        return "WFLYCNT0003: Tipo de filho ilegal %1$s -- deve ser %2$s";
    }
    @Override
    protected String invalidHash$str() {
        return "WFLYCNT0001: Hash '%1$s' inválido para o conteúdo no endereço %2$s. O hash atual é '%3$s' -- talvez o conteúdo tenha sido atualizado por outro chamador.";
    }
    @Override
    protected String illegalChildClass$str() {
        return "WFLYCNT0004: Classe de recurso de filho ilegal %1$s";
    }
    @Override
    protected String noContentFoundWithHash$str() {
        return "WFLYCNT0005: Nenhum conteúdo encontrado com o hash %1$s";
    }
    @Override
    protected String nullParent$str() {
        return "WFLYCNT0006: pai nulo";
    }
}
