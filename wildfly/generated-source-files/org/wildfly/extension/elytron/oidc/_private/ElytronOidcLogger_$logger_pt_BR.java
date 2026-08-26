package org.wildfly.extension.elytron.oidc._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:17+0200")
public class ElytronOidcLogger_$logger_pt_BR extends ElytronOidcLogger_$logger_pt implements ElytronOidcLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ElytronOidcLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String resourceOrClientIdMustBeConfigured$str() {
        return "WFLYOIDC0007: Deve definir “resource” ou “client-id”";
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYOIDC0001: Ativação do subsistema WildFly Elytron OIDC";
    }
    @Override
    protected String unsupportedAttribute$str() {
        return "WFLYOIDC0009: O atributo Oidc '%1$s ' não é compatível com o nível de estabilidade atual.";
    }
    @Override
    protected String cannotRemoveCredential$str() {
        return "WFLYOIDC0003: Não é possível remover a credencial. Nenhuma credencial definida para implantação “%1$s”";
    }
    @Override
    protected String cannotUpdateRedirectRuntimeRule$str() {
        return "WFLYOIDC0006: Não é possível atualizar a reescrita de redirecionamento. Não há reescrita de redirecionamento definida para implantação “%1$s”";
    }
    @Override
    protected String disableTrustManagerSetToTrue$str() {
        return "WFLYOIDC0008: O atributo “disable-trust-manager” foi definido como “true”, portanto nenhum gerente de confiança será usado ao se comunicar com o fornecedor do OpenID sobre HTTPS. Esse valor deve ser sempre definido como “false” em um ambiente de produção.";
    }
    @Override
    protected String cannotUpdateCredential$str() {
        return "WFLYOIDC0004: Não é possível atualizar as credenciais. Nenhuma credencial definida para implantação “%1$s”";
    }
    @Override
    protected String cannotRemoveRedirectRuntimeRule$str() {
        return "WFLYOIDC0005: Não é possível remover a regra de reescrita de redirecionamento. Não há reescrita de redirecionamento definida para implantação “%1$s”";
    }
    @Override
    protected String deploymentSecured$str() {
        return "WFLYOIDC0002: Substituição do subsistema do cliente Elytron OIDC para implantação “%1$s”";
    }
}
