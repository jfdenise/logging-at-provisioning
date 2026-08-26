package org.jboss.as.appclient.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:54:03+0200")
public class AppClientLogger_$logger_pt_BR extends AppClientLogger_$logger_pt implements AppClientLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public AppClientLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String exceptionRunningAppClient$str() {
        return "WFLYAC0002: %1$saplicativo em execução do cliente principal";
    }
    @Override
    protected String argAppClientConfig$str() {
        return "Nome do arquivo de configuração de cliente app (default é \"appclient.xml\")";
    }
    @Override
    protected String argHelp$str() {
        return "Display esta mensagem e sai";
    }
    @Override
    protected String argHost$str() {
        return "Determina o url da instância do servidor do aplicativo a se conectar";
    }
    @Override
    protected String argConnectionProperties$str() {
        return "Efetua o carregamento no arquivo ejb-client.properties a partir do url gerado";
    }
    @Override
    protected String argProperties$str() {
        return "Carrega as propriedades a partir do url gerado";
    }
    @Override
    protected String argSystemProperty$str() {
        return "Determina a propriedade do sistema";
    }
    @Override
    protected String argVersion$str() {
        return "Imprime a versão e encerra";
    }
    @Override
    protected String argSecMgr$str() {
        return "Executa o contêiner com o gerenciador de segurança habilitado.";
    }
    @Override
    protected String usageDescription$str() {
        return "O script appclient inicia um cliente de aplicativo que pode ser utilizado para testar e acessar o Jakarta Enterprise Beans implementado.";
    }
    @Override
    protected String appClientNotSpecified$str() {
        return "WFLYAC0004: Você deverá especificar o cliente do aplicativo a ser executado";
    }
    @Override
    protected String argumentExpected$str() {
        return "WFLYAC0005: Argumento esperado para a opção %1$s";
    }
    @Override
    protected String cannotFindAppClient0$str() {
        return "WFLYAC0006: Não foi possível encontrar o jar do cliente do aplicativo na implantação";
    }
    @Override
    protected String cannotFindAppClient1$str() {
        return "WFLYAC0007: Não foi possível encontrar o cliente do aplicativo %1$s";
    }
    @Override
    protected String cannotLoadAppClientMainClass$str() {
        return "WFLYAC0008: Não foi possível carregar a classe principal do cliente do aplicativo";
    }
    @Override
    protected String cannotLoadProperties$str() {
        return "WFLYAC0010: Não foi possível carregar propriedades a partir do URL %1$s.";
    }
    @Override
    protected String cannotStartAppClient1$str() {
        return "WFLYAC0011: Não foi possível inicializar o cliente app %1$s uma vez que a classe principal não foi encontrada";
    }
    @Override
    protected String cannotStartAppClient2$str() {
        return "WFLYAC0012: Não foi possível inicializar o cliente app %1$s uma vez que não foi encontrado o método principal na classe principal %2$s";
    }
    @Override
    protected String duplicateSubsystemDeclaration$str() {
        return "WFLYAC0013: Declaração de subsistema duplicado";
    }
    @Override
    protected String failedToParseXml1$str() {
        return "WFLYAC0015: Falha ao analisar %1$s";
    }
    @Override
    protected String failedToParseXml3$str() {
        return "WFLYAC0016: Falha ao analisar %1$s no [%2$d,%3$d]";
    }
    @Override
    protected String malformedUrl$str() {
        return "WFLYAC0017: URL malformado fornecido para a opção %1$s";
    }
    @Override
    protected String multipleAppClientsFound$str() {
        return "WFLYAC0018: Mais de um cliente do aplicativo encontrado e nenhum nome do cliente app especificado";
    }
    @Override
    protected String unknownOption$str() {
        return "WFLYAC0020: Opção %1$s desconhecida";
    }
    @Override
    protected String couldNotLoadCallbackClass$str() {
        return "WFLYAC0021: Não foi possível carregar a classe manuseadora da chamada de retorno %1$s";
    }
    @Override
    protected String couldNotCreateCallbackHandler$str() {
        return "WFLYAC0022: Não foi possível criar a instância da classe manuseadora da chamada de retorno %1$s";
    }
    @Override
    protected String cannotFindAppClientFile$str() {
        return "WFLYAC0023: Não foi possível encontrar o cliente do aplicativo %1$s";
    }
    @Override
    protected String cannotSpecifyBothHostAndPropertiesFile$str() {
        return "WFLYAC0024: Não foi possível especificar o host para conexão e o arquivo ejb-client.properties ";
    }
}
