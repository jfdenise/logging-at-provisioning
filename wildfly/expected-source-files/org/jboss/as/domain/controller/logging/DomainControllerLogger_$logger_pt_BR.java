package org.jboss.as.domain.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:30+0200")
public class DomainControllerLogger_$logger_pt_BR extends DomainControllerLogger_$logger_pt implements DomainControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public DomainControllerLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String warnIgnoringSocketBindingGroupInclude$str() {
        return "WFLYDC0001: Ignorando filho 'include' do 'socket-binding-group' %1$s";
    }
    @Override
    protected String interruptedAwaitingFinalResponse2$str() {
        return "WFLYDC0003: Resposta final esperada interrompida pelo servidor %1$s no host %2$s. O processo remoto foi notificado para cancelar a operação";
    }
    @Override
    protected String caughtExceptionAwaitingFinalResponse2$str() {
        return "WFLYDC0004: Foi encontrada uma exceção aguardando a resposta final do servidor %1$s no host %2$s";
    }
    @Override
    protected String interruptedAwaitingFinalResponse1$str() {
        return "WFLYDC0005: Resposta final esperada interrompida pelo host %1$s. O processo remoto foi notificado para cancelar a operação";
    }
    @Override
    protected String caughtExceptionAwaitingFinalResponse1$str() {
        return "WFLYDC0006: Foi encontrada uma exceção aguardando a resposta final do host %1$s";
    }
    @Override
    protected String caughtExceptionClosingInputStream$str() {
        return "WFLYDC0007: A exceção estava encerrando o fluxo de entrada";
    }
    @Override
    protected String domainModelChangedOnReConnect$str() {
        return "WFLYDC0008: O modelo de domínio foi alterado ao conectar novamente. Os seguintes servidores não precisarão ser reiniciados para que as alterações tenham efeito: %1$s";
    }
    @Override
    protected String caughtExceptionWaitingForTask$str() {
        return "WFLYDC0009: %1$s encontrado %2$s aguardando a tarefa %3$s. Cancelando a tarefa";
    }
    @Override
    protected String reportAdminOnlyMissingDeploymentContent$str() {
        return "WFLYDC0011: Nenhum conteúdo de implantação com hash %1$s está disponível no repositório do conteúdo para implantação %2$s. Como o controlador do host está iniciando no modo ADMIN-ONLY, a inicialização terá permissão para proceder e fornecer aos administradores a oportunidade de corrigir esse problema. Se o controlador do host não estivesse no modo ADMIN-ONLY, isso seria uma falha de inicialização fatal.";
    }
    @Override
    protected String failedToSetServerInRestartRequireState$str() {
        return "WFLYDC0012: Falha ao configurar o servidor (%1$s) em um estado inicial solicitado";
    }
    @Override
    protected String slaveControllerCannotAcceptOtherSlaves$str() {
        return "WFLYDC0013: O registro de hosts remotos não é compatível com controladores de hosts secundários";
    }
    @Override
    protected String adminOnlyModeCannotAcceptSlaves$str() {
        return "WFLYDC0014: O controlador anfitrião primário não pode registrar controladores anfitriões secundários, pois seu modo de funcionamento atual é “%1$s”";
    }
    @Override
    protected String slaveAlreadyRegistered$str() {
        return "WFLYDC0015: Já existe um host registrado chamado '%1$s'";
    }
    @Override
    protected String requiredChildIsMissing$str() {
        return "WFLYDC0016: %1$s não tem %2$s: %3$s";
    }
    @Override
    protected String unrecognizedChildren$str() {
        return "WFLYDC0017: O %1$s reconhece apenas %2$s como filho: %3$s";
    }
    @Override
    protected String inSeriesIsMissingGroups$str() {
        return "WFLYDC0018: Faltam grupos no in-series: %1$s";
    }
    @Override
    protected String serverGroupExpectsSingleChild$str() {
        return "WFLYDC0019: O server-group espera apenas um filho: %1$s";
    }
    @Override
    protected String unexpectedInSeriesGroup$str() {
        return "WFLYDC0020: Um dos grupos não define o server-group nem o concurrent-groups: %1$s";
    }
    @Override
    protected String unexplainedFailure$str() {
        return "WFLYDC0021: Falha inesperada";
    }
    @Override
    protected String operationFailedOrRolledBack$str() {
        return "WFLYDC0022: Falha na operação ou ocorreu reversão em todos os servidores.";
    }
    @Override
    protected String interruptedAwaitingResultFromServer$str() {
        return "WFLYDC0023: Interrupção na espera de resultado do servidor %1$s";
    }
    @Override
    protected String exceptionAwaitingResultFromServer$str() {
        return "WFLYDC0024: Exceção ao obter o resultado do servidor %1$s: %2$s";
    }
    @Override
    protected String invalidRolloutPlan2$str() {
        return "WFLYDC0025: Plano de distribuição inválido. %1$s não é um filho válido do nó %2$s";
    }
    @Override
    protected String invalidRolloutPlan1$str() {
        return "WFLYDC0026: Plano de distribuição inválido. As operações do plano afetam os grupos do servidor %1$s que não refletem o plano de distribuição";
    }
    @Override
    protected String invalidRolloutPlanGroupAlreadyExists$str() {
        return "WFLYDC0027: Plano de distribuição inválido. O grupo de servidor %1$s aparece mais de uma vez no plano.";
    }
    @Override
    protected String invalidRolloutPlanRange$str() {
        return "WFLYDC0028: Plano de distribuição inválido. O grupo de servidor %1$s tem um %2$s valor de %3$s; o valor deve estar entre 0 e 100.";
    }
    @Override
    protected String invalidRolloutPlanLess$str() {
        return "WFLYDC0029: Plano de distribuição inválido. O grupo de servidor %1$s tem um valor %2$s de %3$s; não pode ser menor do que 0.";
    }
    @Override
    protected String interruptedAwaitingResultFromHost$str() {
        return "WFLYDC0030: Interrupção na espera do resultado de um host %1$s";
    }
    @Override
    protected String masterDomainControllerOnlyOperation$str() {
        return "WFLYDC0032: A operação %1$s para o endereço %2$s só pode ser tratada pelo Controlador de Domínios, esse anfitrião não é o Controlador de Domínios";
    }
    @Override
    protected String invalidOperationTargetHost$str() {
        return "WFLYDC0033: A operação destina-se ao host %1$s, mas esse host não está registrado";
    }
    @Override
    protected String caughtExceptionStoringDeploymentContent$str() {
        return "WFLYDC0034: %1$s encontrado ao armazenar o conteúdo da implantação -- %2$s";
    }
    @Override
    protected String unexpectedInitialPathKey$str() {
        return "WFLYDC0035: Tecla de caminho inicial inesperada %1$s";
    }
    @Override
    protected String nullStream$str() {
        return "WFLYDC0036: Fluxo nulo no índice %1$d";
    }
    @Override
    protected String invalidByteStream$str() {
        return "WFLYDC0037: Fluxo de byte inválido.";
    }
    @Override
    protected String invalidUrlStream$str() {
        return "WFLYDC0038: Fluxo de url inválido.";
    }
    @Override
    protected String as7431$str() {
        return "WFLYDC0039: Apenas 1 pedaço do conteúdo é suportado (AS7-431)";
    }
    @Override
    protected String noDeploymentContentWithHash$str() {
        return "WFLYDC0040: Nenhum conteúdo da implantação com hash %1$s disponível no repositório de conteúdo da implantação.";
    }
    @Override
    protected String slaveCannotAcceptUploads$str() {
        return "WFLYDC0041: Um Controlador Host secundário não pode aceitar uploads de conteúdo de implantação";
    }
    @Override
    protected String noDeploymentContentWithName$str() {
        return "WFLYDC0042: Não foi encontrada nenhuma implantação com o nome %1$s";
    }
    @Override
    protected String cannotRemoveDeploymentInUse$str() {
        return "WFLYDC0043: Não foi possível remover a implantação%1$s do domínio, uma vez que ele continua sendo usado por grupos de servidor %2$s";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYDC0044: Valor '%1$s' inválido: %2$d, o índice máximo é %3$d";
    }
    @Override
    protected String invalidUrl$str() {
        return "WFLYDC0045: %1$s não é um URL válido -- %2$s";
    }
    @Override
    protected String errorObtainingUrlStream$str() {
        return "WFLYDC0046: Ocorreu um erro ao obter o fluxo de entrada do URL %1$s -- %2$s";
    }
    @Override
    protected String invalidContentDeclaration$str() {
        return "WFLYDC0047: Declaração de conteúdo inválido";
    }
    @Override
    protected String cannotUseSameValueForParameters$str() {
        return "WFLYDC0049: Não foi possível usar %1$s com o mesmo valor para parâmetros %2$s e %3$s. Use %4$s para reimplantar o mesmo conteúdo ou %5$s para substituir o conteúdo com uma nova versão de mesmo nome.";
    }
    @Override
    protected String deploymentAlreadyStarted$str() {
        return "WFLYDC0050: A implantação %1$s já foi inicializada";
    }
    @Override
    protected String unknown$str() {
        return "WFLYDC0051: %1$s %2$s desconhecido";
    }
    @Override
    protected String unknownServerGroup$str() {
        return "WFLYDC0052: Grupo do servidor %1$s desconhecido";
    }
    @Override
    protected String unknownServer$str() {
        return "WFLYDC0053: Servidor %1$s desconhecido";
    }
    @Override
    protected String invalidCode$str() {
        return "WFLYDC0054: Código %1$d inválido";
    }
    @Override
    protected String deploymentHashNotFoundInRepository$str() {
        return "WFLYDC0055: O repositório não contém implantações com hash %1$s";
    }
    @Override
    protected String expectedOnlyOneDeployment$str() {
        return "WFLYDC0056: Apenas uma implantação era esperada, encontrada(s) %1$d";
    }
    @Override
    protected String noProfileCalled$str() {
        return "WFLYDC0057: Nenhum perfil foi chamado: %1$s";
    }
    @Override
    protected String noDeploymentContentWithHashAtBoot$str() {
        return "WFLYDC0058: Nenhum conteúdo de implantação com hash %1$s disponível no repositório do conteúdo de implantação para a implantação '%2$s'. Esse é um erro de inicialização fatal. Para corrigir esse problema, reinicie com a opção de configuração --admin-only e use a CLI para instalar o resto do conteúdo que falta, ou remova-o da configuração. Como alternativa, remova a implantação do arquivo de configuração xml e reinicie a máquina.";
    }
    @Override
    protected String failedToLoadModule$str() {
        return "WFLYDC0059: Falha ao carregar o módulo '%1$s'.";
    }
    @Override
    protected String invalidJSFSlotValue$str() {
        return "WFLYDC0060: Valor do slot Inválido do Jakarta Server Faces: '%1$s'. O controlador de host não pode usar um valor de slot do Jakarta Server Faces diferente do seu valor padrão. Este recurso será ignorado nesse host";
    }
    @Override
    protected String unknownAttributesFromSubsystemVersion$str() {
        return "WFLYDC0061: A operação '%1$s' falha porque os atributos não são conhecidos no subsistema '%2$s', versão de modelo '%3$s': %4$s";
    }
    @Override
    protected String noSocketBindingGroupCalled$str() {
        return "WFLYDC0062: Nenhum socket-binding-group chamado %1$s";
    }
    @Override
    protected String runtimeNameMustBeUnique$str() {
        return "WFLYDC0063: Já existe uma implantação chamada %1$s com o mesmo nome de tempo de execução %2$s no grupo do servidor %3$s";
    }
    @Override
    protected String cannotRemoveUsedServerGroup$str() {
        return "WFLYDC0064: Não foi possível remover o server-group '%1$s', pois ele ainda está sendo usado pelos servidores %2$s";
    }
    @Override
    protected String unsupportedWildcardOperation$str() {
        return "WFLYDC0065: Operações genéricas não são suportadas como parte de operações compostas";
    }
    @Override
    protected String failedToSendMessage$str() {
        return "WFLYDC0066: Falha ao enviar a mensagem: %1$s";
    }
    @Override
    protected String failedToSendResponseHeader$str() {
        return "WFLYDC0067: Falha ao enviar o cabeçalho da resposta: %1$s";
    }
    @Override
    protected String registrationTaskGotInterrupted$str() {
        return "WFLYDC0068: A tarefa de registro do host foi interrompida";
    }
    @Override
    protected String registrationTaskFailed$str() {
        return "WFLYDC0069: Falha na tarefa do registro do host: %1$s";
    }
    @Override
    protected String interruptedAwaitingPreparedResponse$str() {
        return "WFLYDC0070: %1$s interrompido(s) esperando pelo servidor de resposta(s) preparada(s) -- cancelando as atualizações para o(s) servidor(es) %2$s";
    }
    @Override
    protected String interruptedAwaitingHostPreparedResponse$str() {
        return "WFLYDC0071: Interrompido aguardando resposta(s) preparada(s) pelo host -- cancelando atualizações para os hosts %1$s";
    }
    @Override
    protected String caughtIOExceptionUploadingContent$str() {
        return "WFLYDC0072: Foi vista uma IOException de leitura atualizando o conteúdo da implantação";
    }
    @Override
    protected String undeployingDeploymentHasBeenRedeployed$str() {
        return "WFLYDC0073: A implantação %1$s foi reimplantada, e seu conteúdo será removido. Você precisará reiniciá-la.";
    }
    @Override
    protected String operationFailedOrRolledBackWithCause$str() {
        return "WFLYDC0074: Falha na operação ou ocorreu reversão em todos os servidores. Falhas do servidor:";
    }
    @Override
    protected String missingExtensions$str() {
        return "WFLYDC0075: Não foi possível sincronizar o modelo devido à ausência de extensões: %1$s";
    }
    @Override
    protected String duplicateProfileInclude$str() {
        return "WFLYDC0076: A duplicação incluiu o perfil '%1$s'";
    }
    @Override
    protected String duplicateSocketBindingGroupInclude$str() {
        return "WFLYDC0077: A duplicação incluiu grupo de socket binding '%1$s'";
    }
    @Override
    protected String cloneOperationNotSupportedOnHost$str() {
        return "WFLYDC0078: A operação de clonagem do perfil não está disponível no host “%1$s”. Para poder usá-la em um domínio contendo hosts secundários antigos que não são compatíveis com a operação de clonagem de perfil, você precisa de uma das seguintes opções: a) certificar-se que todos os hosts secundários antigos com versão de modelo anterior a 4.0.0 ignorem o perfil clonado e o perfil especificado no parâmetro 'to-profile'. b) recarregar o controlador de domínio no modo admin-only, executar a clonagem e, depois, recarregar o controlador de domínio no modo normal novamente e verificar se os hosts secundários precisam ser recarregados.";
    }
    @Override
    protected String timedOutAwaitingHostPreparedResponses$str() {
        return "WFLYDC0079: Tempo limite atingido depois de %1$d ms aguardando resposta (s) preparada (s) pelo hosts%2$s -- cancelando atualizações para os hosts %3$s";
    }
    @Override
    protected String timedOutAwaitingHostPreparedResponse$str() {
        return "WFLYDC0080: Tempo limite atingido depois de %1$d ms aguardando resposta (s) preparada (s) pelo host -- o host remoto %2$s foi notificado para cancelar operação";
    }
    @Override
    protected String timedOutAwaitingFinalResponse2$str() {
        return "WFLYDC0081: Tempo limite atingido após %1$d ms aguardando resposta final do host %2$s; o processo remoto foi notificado para cancelar operação";
    }
    @Override
    protected String timedOutAwaitingPreparedResponse$str() {
        return "WFLYDC0082: %1$s atingiu o tempo limite após %2$d ms aguardando resposta(s) preparada(s) pelo servidor -- cancelando atualizações para os servidores %3$s";
    }
    @Override
    protected String timedOutAwaitingFinalResponse3$str() {
        return "WFLYDC0083: Tempo limite atingido após %1$d ms aguardando resposta final do servidor %2$s no host %3$s; o processo remoto foi notificado para cancelar operação";
    }
    @Override
    protected String cannotExplodeDeploymentOfSelfContainedServer$str() {
        return "WFLYDC0084: Não é possível expandir uma implementação em um servidor autônomo";
    }
    @Override
    protected String cannotExplodeUnmanagedDeployment$str() {
        return "WFLYDC0085: Não foi possível expandir uma implantação não gerenciada";
    }
    @Override
    protected String cannotExplodeAlreadyExplodedDeployment$str() {
        return "WFLYDC0086: Não foi possível expandir uma implantação já expandida";
    }
    @Override
    protected String cannotExplodeEnabledDeployment$str() {
        return "WFLYDC0087: Não foi possível expandir uma implantação já implementada";
    }
    @Override
    protected String cannotAddContentToSelfContainedServer$str() {
        return "WFLYDC0088: Não foi possível adicionar conteúdo a uma implementação em um servidor autônomo";
    }
    @Override
    protected String cannotAddContentToUnmanagedDeployment$str() {
        return "WFLYDC0089: Não é possível adicionar conteúdo a uma implantação não gerenciada";
    }
    @Override
    protected String cannotAddContentToUnexplodedDeployment$str() {
        return "WFLYDC0090: Não é possível adicionar conteúdo a uma implantação não expandida";
    }
    @Override
    protected String cannotRemoveContentFromSelfContainedServer$str() {
        return "WFLYDC0091: Não foi possível remover conteúdo de uma implementação em um servidor autônomo";
    }
    @Override
    protected String cannotRemoveContentFromUnmanagedDeployment$str() {
        return "WFLYDC0092: Não é possível remover conteúdo de uma implantação não gerenciada";
    }
    @Override
    protected String cannotRemoveContentFromUnexplodedDeployment$str() {
        return "WFLYDC0093: Não é possível remover conteúdo de uma implantação não expandida";
    }
    @Override
    protected String cannotReadContentFromSelfContainedServer$str() {
        return "WFLYDC0094: Não foi possível ler o conteúdo de uma implementação em um servidor autônomo";
    }
    @Override
    protected String cannotReadContentFromUnmanagedDeployment$str() {
        return "WFLYDC0095: Não é possível ler o conteúdo de uma implantação não gerenciada";
    }
    @Override
    protected String cannotReadContentFromUnexplodedDeployment$str() {
        return "WFLYDC0096: Não é possível ler o conteúdo de uma implantação não expandida";
    }
    @Override
    protected String cannotExplodeSubDeploymentOfUnexplodedDeployment$str() {
        return "WFLYDC0097: Não é possível expandir uma subimplantação de uma implantação não expandida";
    }
    @Override
    protected String serverManagementUnavailableDuringBoot$str() {
        return "WFLYDC0098: Os servidores %1$s a seguir estão iniciando; a execução das operações de gerenciamento remoto não está disponível no momento";
    }
}
