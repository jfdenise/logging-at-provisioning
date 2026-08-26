package org.wildfly.core.embedded.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:33+0200")
public class EmbeddedLogger_$logger_pt_BR extends EmbeddedLogger_$logger_pt implements EmbeddedLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public EmbeddedLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String invalidJBossHome$str() {
        return "WFLYEMB0011: Diretório base do JBoss inválido: %1$s";
    }
    @Override
    protected String moduleLoaderError$str() {
        return "WFLYEMB0014: Não foi possível carregar o módulo %1$s a partir de %2$s";
    }
    @Override
    protected String nullVar$str() {
        return "WFLYEMB0015: %1$s é nulo";
    }
    @Override
    protected String cannotLoadEmbeddedServerFactory$str() {
        return "WFLYEMB0017: Não foi possível carregar o alocador de servidor integrado: %1$s";
    }
    @Override
    protected String cannotGetReflectiveMethod$str() {
        return "WFLYEMB0018: Não foi possível obter o método reflexivo '%1$s' para: %2$s";
    }
    @Override
    protected String cannotCreateStandaloneServer$str() {
        return "WFLYEMB0019: Não foi possível criar um servidor autônomo usando o alocador: %1$s";
    }
    @Override
    protected String cannotSetupEmbeddedServer$str() {
        return "WFLYEMB0020: Não foi possível configurar o processo incorporado";
    }
    @Override
    protected String cannotStartEmbeddedServer$str() {
        return "WFLYEMB0021: Não foi possível iniciar o processo incorporado";
    }
    @Override
    protected String cannotInvokeStandaloneServer$str() {
        return "WFLYEMB0022: Não foi possível invocar '%1$s' no processo integrado";
    }
    @Override
    protected String processIsStopping$str() {
        return "WFLYEMB0023: O servidor incorporado está interrompendo e invocações no ModelControllerClient não estão disponíveis";
    }
    @Override
    protected String processIsReloading$str() {
        return "WFLYEMB0024: O servidor incorporado está recarregando e invocações no ModelControllerClient ainda não estão disponíveis";
    }
    @Override
    protected String cannotCreateHostController$str() {
        return "WFLYEMB0026: Não foi possível criar um controlador de host usando o alocador: %1$s";
    }
    @Override
    protected String processIsStopped$str() {
        return "WFLYEMB0027: O servidor incorporado está interrompido e invocações no ModelControllerClient não estão disponíveis";
    }
    @Override
    protected String errorCopyingFile$str() {
        return "WFLYEMB0028: Erro ao copiar '%1$s' para '%2$s' (%3$s)";
    }
    @Override
    protected String propertySpecifiedFileIsNotADirectory$str() {
        return "WFLYEMB0029: -D%1$s=%2$s não é um diretório";
    }
    @Override
    protected String propertySpecifiedFileDoesNotExist$str() {
        return "WFLYEMB0144: -D%1$s=%2$s não existe";
    }
    @Override
    protected String embeddedServerDirectoryNotFound$str() {
        return "WFLYEMB0143: Não existe nenhum diretório chamado '%1$s' em '%2$s'";
    }
    @Override
    protected String moduleLoaderAlreadyConfigured$str() {
        return "WFLYEMB0145: O carregador de módulo já foi configurado. Alterar a propriedade %1$s não surtirá efeito.";
    }
    @Override
    protected String failedToRestoreContext$str() {
        return "WFLYEMB0146: Falha ao restaurar o contexto %1$s";
    }
}
