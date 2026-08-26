package org.jboss.as.jaxrs.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:57:48+0200")
public class JaxrsLogger_$logger_pt_BR extends JaxrsLogger_$logger_pt implements JaxrsLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public JaxrsLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String classAnnotationNotFound$str() {
        return "WFLYRS0001: Anotação %1$snão está na classe: %2$s";
    }
    @Override
    protected String classOrMethodAnnotationNotFound$str() {
        return "WFLYRS0002: Anotação %1$s não está na Classe ou Método: %2$s";
    }
    @Override
    protected String cannotLoadApplicationClass$str() {
        return "WFLYRS0006: Não foi possível carregar a classe de aplicativo Jakarta RESTful Web Services";
    }
    @Override
    protected String typeNameNotAnEjbView$str() {
        return "WFLYRS0010: Jakarta RESTful Web Services recurso %1$s não corresponde a uma visualização no Jakarta Enterprise Beans %2$s. As anotações @Path só podem ser colocadas em classes ou interfaces que representem uma visão local, remota ou sem interface de um bean Jakarta Enterprise Beans.";
    }
    @Override
    protected String invalidParamValue$str() {
        return "WFLYRS0011: Valor inválido para o parâmetro %1$s: %2$s";
    }
    @Override
    protected String noSpringIntegrationJar$str() {
        return "WFLYRS0012: Nenhum jar de integração spring encontrado";
    }
    @Override
    protected String disablePropertyDeprecated$str() {
        return "WFLYRS0013: O parâmetro do contexto org.jboss.as.jaxrs.disableSpringIntegration está preterido e será removido num lançamento futuro. Por favor use o org.jboss.as.jaxrs.enableSpringIntegration";
    }
    @Override
    protected String failedToRegisterManagementViewForRESTResources$str() {
        return "WFLYRS0014: Falha ao registrar exibição de gerenciamento da classe de recurso REST: %1$s ";
    }
    @Override
    protected String noServletDeclaration$str() {
        return "WFLYRS0015: Nenhuma declaração de servlet encontrada para o aplicativo JAX-RS. Em %1$s, forneça uma classe que estenda jakarta.ws.rs.core.Application ou declare uma classe de servlet em web.xml.";
    }
    @Override
    protected String resteasyVersion$str() {
        return "WFLYRS0016: RESTEasy versão %1$s";
    }
    @Override
    protected String failedToReadAttribute$str() {
        return "WFLYRS0017: Falha na leitura do atributo de implantação de Jakarta RESTful Web Services em %1$s com nome %2$s";
    }
    @Override
    protected String jacksonAnnotationDetected$str() {
        return "WFLYRS0018: Uso explícito da anotação Jackson em uma implantação de Jakarta RESTful Web Services; o sistema desativará o processamento de Jakarta JSON Binding para a implantação atual. Considere definir a propriedade '%1$s' para 'falso' para restaurar o Jakarta JSON Binding.";
    }
    @Override
    protected String paramConverterFailed$str() {
        return "WFLYRS0019: Erro ao converter o valor padrão %1$s para o parâmetro %2$s no método %3$s usando o conversor de parâmetros %4$s. Exceção: %5$s: %6$s";
    }
    @Override
    protected String baseTypeMethodFailed$str() {
        return "WFLYRS0020: \"Erro ao converter o valor padrão %1$s para o parâmetro %2$s no método %3$s usando o método %4$s. Exceção: %5$s: %6$s\"";
    }
    @Override
    protected String classIntrospectionFailure$str() {
        return "WFLYRS0021: %1$s %2$s";
    }
    @Override
    protected String tracingEnabled$str() {
        return "WFLYRS0029: A API de rastreamento do RESTEasy foi ativada para a implantação \"%1$s\" e não se destina à produção.";
    }
    @Override
    protected String invalidConfigurationFactory$str() {
        return "WFLYRS0030: Encontrada uma ConfigurationFactory inválida %1$s";
    }
    @Override
    protected String failedToLoadConfigurationFactory$str() {
        return "WFLYRS0031: Falha ao carregar a configuração do RESTEasy MicroProfile: %1$s";
    }
}
