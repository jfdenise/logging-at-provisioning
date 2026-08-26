package org.jboss.as.domain.http.server.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:20+0200")
public class HttpServerLogger_$logger_pt_BR extends HttpServerLogger_$logger_pt implements HttpServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public HttpServerLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String modelRequestError$str() {
        return "WFLYDMHTTP0001: Erro inesperado da execução da solicitação do modelo";
    }
    @Override
    protected String uploadError$str() {
        return "WFLYDMHTTP0002: Erro inesperado da execução da solicitação do carregamento";
    }
    @Override
    protected String consoleModuleNotFound$str() {
        return "WFLYDMHTTP0003: Não foi possível carregar o módulo do console para o slot %1$s, desativando o console";
    }
    @Override
    protected String errorContextModuleNotFound$str() {
        return "WFLYDMHTTP0004: Não foi possível carregar o contexto de erro para o slot %1$s, desabilitando o contexto de erro.";
    }
    @Override
    protected String invalidOperation$str() {
        return "WFLYDMHTTP0005: Operação '%1$s' inválida";
    }
    @Override
    protected String realmNotReadyMessage$str() {
        return "WFLYDMHTTP0006: O realm de segurança não está pronto para processar as solicitações. Consulte %1$s";
    }
    @Override
    protected String consoleModuleNotFoundMsg$str() {
        return "WFLYDMHTTP0007: Nenhum módulo do console disponível com o nome de módulo %1$s";
    }
    @Override
    protected String invalidCredentialType$str() {
        return "WFLYDMHTTP0010: Tipo de credencial '%1$s' inválida";
    }
    @Override
    protected String httpsRedirectNotSupported$str() {
        return "WFLYDMHTTP0011: A interface de gerenciamento está usando endereços diferentes para HTTP (%1$s) e HTTPS (%2$s). O redirecionamento das solicitações HTTPS a partir do soquete HTTP para o soquete HTTPS não será suportado.";
    }
    @Override
    protected String sslRequestedNoSslContext$str() {
        return "WFLYDMHTTP0012: Um soquete seguro foi definido para a interface HTTP, porém o realm de segurança referenciado não está fornecendo um contexto SSL.";
    }
    @Override
    protected String invalidUseStreamAsResponseIndex$str() {
        return "WFLYDMHTTP0013: Valor useStreamIndex '%1$d' inválido. A resposta da operação teve %2$d fluxos anexados.";
    }
    @Override
    protected String managementHttpServerAlreadyBuild$str() {
        return "WFLYDMHTTP0014: O ManagementHttpServer já foi compilado usando este construtor.";
    }
    @Override
    protected String noRealmOrSSLContext$str() {
        return "WFLYDMHTTP0015: Nenhum SecurityRealm ou SSLContext foi fornecido.";
    }
    @Override
    protected String realmNotReadyForSecuredManagementHandler$str() {
        return "WFLYDMHTTP0016: Seu servidor de aplicativos está em execução. No entanto, você ainda não adicionou usuários para poder acessar a interface de gerenciamento HTTP. Para adicionar um novo usuário, execute o script %1$s na pasta bin da instalação do WildFly e insira as informações solicitadas. Por padrão, o nome do realm usado pelo WildFly é “ManagementRealm”, que já é selecionado por padrão pela ferramenta add-user.";
    }
}
