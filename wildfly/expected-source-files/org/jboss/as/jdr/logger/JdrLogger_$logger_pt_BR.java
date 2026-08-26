package org.jboss.as.jdr.logger;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:50+0200")
public class JdrLogger_$logger_pt_BR extends JdrLogger_$logger_pt implements JdrLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JdrLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String couldNotCreateZipfile$str() {
        return "WFLYJDR0007: Não foi possível criar o zipfile.";
    }
    @Override
    protected String couldNotConfigureJDR$str() {
        return "WFLYJDR0008: Não foi possível configurar o JDR. Ocorreu a falha de pelo menos uma etapa da configuração.";
    }
    @Override
    protected String noCommandsToRun$str() {
        return "WFLYJDR0009: Nenhum dos comandos JDR foram carregados. Certifique-se de que uma classe válida Plugin está especificada no plugins.properties.";
    }
    @Override
    protected String couldNotFindJDRPropertiesFile$str() {
        return "WFLYJDR0011: Não foi possível encontrar arquivo de propriedades JDR.";
    }
    @Override
    protected String couldNotCreateJDRPropertiesFile$str() {
        return "WFLYJDR0012: Não foi possível criar arquivo de propriedades JDR em %1$s";
    }
    @Override
    protected String jdrHelpMessage$str() {
        return "Display esta mensagem e sai";
    }
    @Override
    protected String jdrHostnameMessage$str() {
        return "o hostname que o api de gerenciamento é vinculado. (default: localhost)";
    }
    @Override
    protected String jdrPortMessage$str() {
        return "a porta que o api de gerenciamento é vinculado. (default: 9990)";
    }
    @Override
    protected String jdrProtocolMessage$str() {
        return "O protocolo que é utilizado para conectar. Pode ser remoto, http ou https (padrão: http)";
    }
    @Override
    protected String jdrConfigMessage$str() {
        return "Arquivo de configuração do servidor se não estiver em execução.";
    }
    @Override
    protected String jdrDescriptionMessage$str() {
        return "JBoss Diagnostic Reporter (JDR) é um subsistema construído para coletar informações para auxiliar na resolução de problemas. O script jdr é um utilitário para gerar relatórios JDR.";
    }
}
