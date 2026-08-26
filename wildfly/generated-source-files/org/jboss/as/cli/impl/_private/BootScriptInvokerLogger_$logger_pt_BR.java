package org.jboss.as.cli.impl._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:03+0200")
public class BootScriptInvokerLogger_$logger_pt_BR extends BootScriptInvokerLogger_$logger_pt implements BootScriptInvokerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public BootScriptInvokerLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cliOutput$str() {
        return "WFLYCLI0004: Saída de execução CLI:";
    }
    @Override
    protected String executeCommand$str() {
        return "WFLYCLI0006: Executando o comando CLI %1$s";
    }
    @Override
    protected String unexpectedException$str() {
        return "WFLYCLI0007: Exceção inesperada durante o processamento de comandos CLI de %1$s";
    }
    @Override
    protected String propertiesFileNotFound$str() {
        return "WFLYCLI0003: Não foi possível encontrar arquivo de propriedades CLI %1$s";
    }
    @Override
    protected String unexpectedErrors$str() {
        return "WFLYCLI0008: Erro ao processar o script CLI %1$s. As operações foram executadas, mas valores inesperados ocorreram. Veja a lista de erros em %2$s";
    }
    @Override
    protected String unexpectedCommandException$str() {
        return "WFLYCLI0009: Exceção inesperada durante o processamento do comando CLI %1$s de %2$s";
    }
    @Override
    protected String errorProcessingScript$str() {
        return "WFLYCLI0002: Erro ao processar script CLI %1$s";
    }
    @Override
    protected String doneProcessScript$str() {
        return "WFLYCLI0005: Processamento do script CLI %1$s concluído";
    }
    @Override
    protected String processScript$str() {
        return "WFLYCLI0001: Processando script CLI %1$s";
    }
}
