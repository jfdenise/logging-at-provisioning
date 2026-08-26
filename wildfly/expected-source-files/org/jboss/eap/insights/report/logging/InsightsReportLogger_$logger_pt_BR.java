package org.jboss.eap.insights.report.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:59:22+0200")
public class InsightsReportLogger_$logger_pt_BR extends InsightsReportLogger_$logger_pt implements InsightsReportLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InsightsReportLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToReadRuntimeConfiguration1$str() {
        return "WFLYINSIGHTS0001: A leitura da configuração de tempo de execução falhou com %1$s";
    }
    @Override
    protected String failedToReadRuntimeConfiguration0$str() {
        return "WFLYINSIGHTS0002: Falha na leitura da configuração de tempo de execução";
    }
    @Override
    protected String failedToReadModules$str() {
        return "WFLYINSIGHTS0003: A análise dos caminhos do módulo falhou";
    }
    @Override
    protected String failedToProcessDeployments$str() {
        return "WFLYINSIGHTS0004: Erros no processamento de implantações";
    }
    @Override
    protected String missingAuthentication$str() {
        return "WFLYINSIGHTS0005: Autenticação ausente na solicitação: %1$s";
    }
    @Override
    protected String payloadTooLarge$str() {
        return "WFLYINSIGHTS0006: Carga útil muito grande: %1$s";
    }
    @Override
    protected String unsupportedContentType$str() {
        return "WFLYINSIGHTS0007: O tipo de conteúdo da carga útil não é compatível: %1$s";
    }
    @Override
    protected String serversideError$str() {
        return "WFLYINSIGHTS0008: A solicitação falhou no servidor com o código: %1$s";
    }
    @Override
    protected String addingAnalyzedJar$str() {
        return "Adicionando as informações para %1$s";
    }
    @Override
    protected String addingOverriddenJar$str() {
        return "Adicionando as informações substituídas para %1$s";
    }
    @Override
    protected String errorAnalyzingJar$str() {
        return "Analisando o JAR %1$s com falha";
    }
    @Override
    protected String endProcessingModules$str() {
        return "Análise de módulos concluída";
    }
    @Override
    protected String startProcessingModulePath$str() {
        return "O caminho do módulo %1$s está sendo processado";
    }
    @Override
    protected String startProcessingDeployment$str() {
        return "Processando a implantação %1$s";
    }
    @Override
    protected String startProcessingDeploymentForUpdate$str() {
        return "Processando a implantação %1$s para atualização";
    }
    @Override
    protected String deploymentHashFound$str() {
        return "A implantação %1$s tem hash sha1 %2$s";
    }
    @Override
    protected String endProcessingDeployments$str() {
        return "Todas as implantações foram processadas";
    }
    @Override
    protected String endProcessingDeploymentsForUpdate$str() {
        return "Todas as implantações foram atualizadas";
    }
    @Override
    protected String scheduledSendFailed$str() {
        return "Falha no envio agendado";
    }
    @Override
    protected String scheduledSendUnknownException$str() {
        return "Falha não relacionada a insights";
    }
    @Override
    protected String endGettingConfiguration$str() {
        return "Obteve a configuração de tempo de execução do servidor";
    }
    @Override
    protected String startGettingConfiguration$str() {
        return "Obtendo a configuração de tempo de execução do servidor";
    }
}
