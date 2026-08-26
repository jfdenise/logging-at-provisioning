package org.jboss.as.controller.client.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:10+0200")
public class ControllerClientLogger_$logger_pt_BR extends ControllerClientLogger_$logger_pt implements ControllerClientLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ControllerClientLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String maxDisplayUnitLength$str() {
        return "WFLYCC0017: A tela imobiliária é cara; displayUnits deve ser 5 caracteres ou menos";
    }
    @Override
    protected String noFailureDetails$str() {
        return "WFLYCC0019: Nenhum detalhe de falha fornecido";
    }
    @Override
    protected String leakedControllerClient$str() {
        return "WFLYCC0034: Encerrando o cliente do controlador perdido";
    }
    @Override
    protected String cannotDeriveDeploymentName$str() {
        return "WFLYCC0004: Não foi possível derivar o nome da implantação de %1$s - use uma variante do método de sobrecarga que leve um parâmetro 'name'";
    }
    @Override
    protected String failed$str() {
        return "WFLYCC0008: falhou";
    }
    @Override
    protected String notConfigured$str() {
        return "WFLYCC0020: Nenhum %1$s configurado";
    }
    @Override
    protected String rollbackRolledBack$str() {
        return "WFLYCC0026: A reversão foi revertida por conta própria";
    }
    @Override
    protected String globalRollbackNotCompatible$str() {
        return "WFLYCC0009: A reversão global não é compatível com a reinicialização do servidor";
    }
    @Override
    protected String controllerClientNotClosed$str() {
        return "WFLYCC0030: Alocação do rastreio da pilha:";
    }
    @Override
    protected String cannotAddDeploymentAction$str() {
        return "WFLYCC0001: Não foi possível adicionar ações de implantação após iniciar a criação de um plano de distribuição";
    }
    @Override
    protected String invalidAddressType$str() {
        return "WFLYCC0033: O endereço deve ser do tipo ModelType.LIST.";
    }
    @Override
    protected String invalidUri$str() {
        return "WFLYCC0014: %1$s não é um URI válido";
    }
    @Override
    protected String invalidValue3$str() {
        return "WFLYCC0015: Valor ilegal de %1$s %2$d - deve ser maior que %3$d";
    }
    @Override
    protected String streamWasClosed$str() {
        return "WFLYCC0036: O fluxo foi encerrado";
    }
    @Override
    protected String noFailureDescription$str() {
        return "WFLYCC0031: Nenhuma descrição de falha uma vez que a operação ocorreu com êxito.";
    }
    @Override
    protected String failedToParseAuthenticationConfig$str() {
        return "WFLYCC0037: Falha ao analisar o arquivo de configuração: %1$s";
    }
    @Override
    protected String invalidActionType$str() {
        return "WFLYCC0012: Tipo de ação inválida %1$s";
    }
    @Override
    protected String serverDeploymentAlreadyExists$str() {
        return "WFLYCC0028: Implantação com nome %1$s já presente no servidor";
    }
    @Override
    protected String objectIsClosed$str() {
        return "WFLYCC0022: %1$s está encerrado";
    }
    @Override
    protected String cannotConvert$str() {
        return "WFLYCC0003: Não foi possível converter %1$s para %2$s";
    }
    @Override
    protected String cannotUseDeploymentPlan$str() {
        return "WFLYCC0005: Não foi possível usar o DeploymentPlan que não foi criado por este gerenciador";
    }
    @Override
    protected String operationsNotAllowed$str() {
        return "WFLYCC0024: %1$s operações não são permitidas após as modificações do conteúdo e da implantação";
    }
    @Override
    protected String cannotAddDeploymentActionsAfterStart$str() {
        return "WFLYCC0002: Não foi possível adicionar ações de implantação após iniciar a criação de um plano de distribuição";
    }
    @Override
    protected String unknownActionType$str() {
        return "WFLYCC0029: Tipo de ação desconhecida %1$s";
    }
    @Override
    protected String operationNameNotFound$str() {
        return "WFLYCC0032: O nome da operação não foi definido.";
    }
    @Override
    protected String domainDeploymentAlreadyExists$str() {
        return "WFLYCC0007: A implantação com nome %1$s já presente no domínio";
    }
    @Override
    protected String operationOutcome$str() {
        return "WFLYCC0023: O resultado da operação é %1$s";
    }
    @Override
    protected String cannotDeleteTempFile$str() {
        return "WFLYCC0035: Não foi possível excluir o arquivo temporário %1$s. Será excluído na saída";
    }
    @Override
    protected String gracefulShutdownAlreadyConfigured$str() {
        return "WFLYCC0010: Encerramento já configurado com o intervalo de %1$d ms";
    }
    @Override
    protected String invalidPrecedingAction$str() {
        return "WFLYCC0013: A ação precedente não era um %1$s";
    }
    @Override
    protected String invalidValue4$str() {
        return "WFLYCC0016: Valor ilegal de %1$s %2$d - deve ser maior que %3$d e menor que %4$d";
    }
    @Override
    protected String rollbackTimedOut$str() {
        return "WFLYCC0027: Intervalo de reversão";
    }
    @Override
    protected String incompleteDeploymentReplace$str() {
        return "WFLYCC0011: Apenas uma versão de implantação com um nome único gerado pode existir no domínio. O plano de implantação especificou que uma nova versão da implantação %1$s substitui uma implantação existente com o mesmo nome exclusivo, mas não é aplicada à substituição de todos os grupos do servidor. Os grupos de servidor ausentes eram: %2$s";
    }
    @Override
    protected String rollbackCancelled$str() {
        return "WFLYCC0025: A reversão foi cancelada";
    }
}
