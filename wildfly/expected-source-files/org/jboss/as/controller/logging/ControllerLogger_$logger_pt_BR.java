package org.jboss.as.controller.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:26:04+0200")
public class ControllerLogger_$logger_pt_BR extends ControllerLogger_$logger_pt implements ControllerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ControllerLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String cannotResolveAddress$str() {
        return "WFLYCTL0001: Não foi possível resolver o endereço %1$s, portanto, não foi possível combiná-lo com nenhum InetAddress";
    }
    @Override
    protected String errorBootingContainer0$str() {
        return "WFLYCTL0002: Erro ao iniciar o recipiente";
    }
    @Override
    protected String errorBootingContainer2$str() {
        return "WFLYCTL0003: Erro ao iniciar o recipiente devido ao espaço insuficiente da pilha para o thread usado para executar as operações de inicialização. O thread foi configurado com o tamanho de pilha de [%1$d]. A configuração da propriedade do sistema %2$s para um valor mais alto que [%1$d], pode resolver este problema.";
    }
    @Override
    protected String errorRevertingOperation$str() {
        return "WFLYCTL0004: %1$s encontrou uma exceção tentando reverter a operação %2$s no endereço %3$s";
    }
    @Override
    protected String failedExecutingOperation$str() {
        return "WFLYCTL0005: Falha ao executar a operação %1$s no endereço %2$s";
    }
    @Override
    protected String failedSubsystemBootOperations$str() {
        return "WFLYCTL0006: Falha ao executar as operações de inicialização do subsistema %1$s";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYCTL0007: Falha ao encerrar o recurso %1$s";
    }
    @Override
    protected String failedToPersistConfigurationChange0$str() {
        return "WFLYCTL0008: Falha ao persistir a alteração de configuração";
    }
    @Override
    protected String failedToStoreConfiguration$str() {
        return "WFLYCTL0009: Falha ao armazenar a configuração em %1$s";
    }
    @Override
    protected String invalidSystemPropertyValue$str() {
        return "WFLYCTL0010: Valor inválido %1$s para a propriedade de sistema %2$s - usando o valor padrão [%3$d]";
    }
    @Override
    protected String invalidWildcardAddress$str() {
        return "WFLYCTL0011: O endereço %1$s é um endereço curinga, que não coincidirá com qualquer endereço específico. Não use o elemento de configuração '%2$s' para especificar que uma interface deve usar um endereço curinga: use '%3$s'";
    }
    @Override
    protected String operationFailed2$str() {
        return "WFLYCTL0013: Falha na operação (%1$s) - endereço (%2$s)";
    }
    @Override
    protected String operationFailed3$str() {
        return "WFLYCTL0013: Falha na operação (%1$s) - endereço (%2$s) - falha na descrição: %3$s";
    }
    @Override
    protected String operationFailed4$str() {
        return "WFLYCTL0013: Operação (%1$s) falhou - endereço: (%2$s) - descrição da falha: %3$s%4$s";
    }
    @Override
    protected String wildcardAddressDetected$str() {
        return "WFLYCTL0015: Endereço curinga detectado - será ignorado outro critério de interface.";
    }
    @Override
    protected String noFinalProxyOutcomeReceived$str() {
        return "WFLYCTL0016: Foi recebido na resposta do resultado final da operação %1$s com endereço %2$s a partir do processo remoto no endereço %3$s. O resultado dessa operação incluirá apenas a resposta preliminar do processo remoto à solicitação.";
    }
    @Override
    protected String operationFailedOnClientError$str() {
        return "WFLYCTL0017: Falha na operação (%1$s) - endereço (%2$s) - falha na descrição: %3$s";
    }
    @Override
    protected String gracefulManagementChannelHandlerShutdownTimedOut$str() {
        return "WFLYCTL0019: Encerramento normal do manipulador usado para as solicitações do gerenciamento nativo não foi concluído em [%1$d] ms. No entanto, o encerramento do canal de comunicação subjacente está em andamento";
    }
    @Override
    protected String gracefulManagementChannelHandlerShutdownFailed$str() {
        return "WFLYCTL0020: O encerramento reconhecido pelo manuseador usado para as solicitação de gerenciamento com falha. No entanto o encerramento do canal de comunicação subjacente está em procedimento";
    }
    @Override
    protected String invalidChannelCloseTimeout$str() {
        return "WFLYCTL0021: Valor '%1$s' inválido para a propriedade de sistema '%2$s' -- o valor deve ser convertido em um int";
    }
    @Override
    protected String multipleMatchingAddresses5$str() {
        return "WFLYCTL0022: Vários endereços ou interfaces de rede coincidiram com o critério de seleção para a interface '%1$s'. Endereços de correspondentes: %2$s. Interfaces de rede correspondentes: %3$s. A interface usará o endereço %4$s e a interface de rede %5$s.";
    }
    @Override
    protected String multipleMatchingAddresses3$str() {
        return "WFLYCTL0023: O valor '%1$s' para o critério de seleção da interface 'inet-address' é ambíguo, uma vez que mais de um endereço ou interface de rede disponível na máquina corresponde a ele. Devido a essa ambiguidade, nenhum endereço será selecionado como correspondente. Endereços correspondentes: %2$s. Interfaces da rede correspondentes: %3$s.";
    }
    @Override
    protected String cannotReadTargetDefinition$str() {
        return "WFLYCTL0024: Não foi possível ler a definição do destino!";
    }
    @Override
    protected String interruptedWaitingStability$str() {
        return "WFLYCTL0027: A operação foi interrompida antes que a estabilidade do contêiner de serviço pudesse ser alcançada. O processo precisa ser reiniciado. A etapa que atualizou o contêiner de serviço primeiro foi '%1$s' no endereço '%2$s'.";
    }
    @Override
    protected String attributeDeprecated$str() {
        return "WFLYCTL0028: O atributo '%1$s' no recurso, no endereço '%2$s', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.";
    }
    @Override
    protected String cannotDeleteTempFile$str() {
        return "WFLYCTL0029: Não foi possível excluir o arquivo temporário %1$s. Será excluído na saída";
    }
    @Override
    protected String noSuchResourceType$str() {
        return "WFLYCTL0030: Nenhuma definição do recurso registrada para o endereço %1$s";
    }
    @Override
    protected String noHandlerForOperation$str() {
        return "WFLYCTL0031: Nenhuma operação nomeada '%1$s' existente no endereço %2$s";
    }
    @Override
    protected String transformationWarnings$str() {
        return "WFLYCTL0032: Ocorreram problemas durante o processo de transformação para o host de destino: '%1$s' %nProblemas encontrados: %n%2$s";
    }
    @Override
    protected String extensionDeprecated$str() {
        return "WFLYCTL0033: A extensão '%1$s' é obsoleta e talvez não seja suportada em versões futuras";
    }
    @Override
    protected String ignoringUnsupportedLegacyExtension$str() {
        return "WFLYCTL0034: Os subsistemas %1$s fornecidos pela extensão herdada '%2$s' não são suportadas nos servidores sendo executados nesta versão. A extensão é apenas suportada para uso dos hosts sendo executados nas versões anteriores em um domínio gerenciado de versão. Nesta versão, a extensão não registrará quaisquer subsistemas, e futuras tentativas de criar ou endereçar os recursos de subsistema neste servidor resultarão em falha.";
    }
    @Override
    protected String failedToUpdateAuditLog$str() {
        return "WFLYCTL0035: Falha da atualização do log de auditoria de gerenciamento";
    }
    @Override
    protected String disablingLoggingDueToFailures$str() {
        return "WFLYCTL0036: [%1$d] falhas consecutivas de registro em log de auditoria de operação de gerenciamento; desabilitando o registro em log de auditoria";
    }
    @Override
    protected String logHandlerWriteFailed$str() {
        return "WFLYCTL0037: Falha na atualização do log de auditoria de gerenciamento no manipulador '%1$s'";
    }
    @Override
    protected String disablingLogHandlerDueToFailures$str() {
        return "WFLYCTL0038: [%1$d] falhas consecutivas de registro em log de auditoria de operação de gerenciamento no manipulador '%2$s'; desabilitando o registro em log de auditoria";
    }
    @Override
    protected String alreadyDefined$str() {
        return "WFLYCTL0039: %1$s já definido";
    }
    @Override
    protected String alreadyDeclared4$str() {
        return "WFLYCTL0041: Um %1$s %2$s já declarado foi declarado em %3$s %4$s";
    }
    @Override
    protected String alreadyDeclared5$str() {
        return "WFLYCTL0042: Um %1$s ou %2$s %3$s já declarado foi declarado em %4$s %5$s";
    }
    @Override
    protected String alreadyRegistered$str() {
        return "WFLYCTL0043: Já existe um %1$s chamado '%2$s' no local '%3$s'";
    }
    @Override
    protected String ambiguousConfigurationFiles$str() {
        return "WFLYCTL0044: O nome do arquivo da configuração ambígua '%1$s', uma vez que há diferentes arquivos em %2$s que terminam em %3$s";
    }
    @Override
    protected String ambiguousName$str() {
        return "WFLYCTL0045: Nome ambíguo '%1$s' em %2$s: %3$s";
    }
    @Override
    protected String attributeNotWritable$str() {
        return "WFLYCTL0048: O atributo %1$s não é gravável";
    }
    @Override
    protected String cannotDetermineDefaultName$str() {
        return "WFLYCTL0050: Não foi possível determinar o nome default baseado no nome host local";
    }
    @Override
    protected String cannotCreate$str() {
        return "WFLYCTL0051: Não foi possível criar %1$s";
    }
    @Override
    protected String cannotDelete$str() {
        return "WFLYCTL0052: Não foi possível excluir %1$s";
    }
    @Override
    protected String cannotRegisterSubmodelWithNullPath$str() {
        return "WFLYCTL0053: Não foi possível registrar sub-modelos com um PathElement nulo";
    }
    @Override
    protected String cannotRemove$str() {
        return "WFLYCTL0055: Não foi possível remover %1$s";
    }
    @Override
    protected String cannotRename$str() {
        return "WFLYCTL0056: Não foi possível renomear %1$s para %2$s";
    }
    @Override
    protected String cannotWriteTo$str() {
        return "WFLYCTL0057: Não foi possível gravar em %1$s";
    }
    @Override
    protected String childAlreadyDeclared$str() {
        return "WFLYCTL0058: %1$s filho do elemento %2$s já foi declarado";
    }
    @Override
    protected String canonicalBootFileNotFound$str() {
        return "WFLYCTL0059: Não foi possível obter um arquivo canônico para o arquivo de inicialização: %1$s";
    }
    @Override
    protected String canonicalMainFileNotFound$str() {
        return "WFLYCTL0060: Não foi possível obter um arquivo canônico para o arquivo principal: %1$s";
    }
    @Override
    protected String compositeOperationFailed$str() {
        return "WFLYCTL0062: A operação de composição falhou e foi revertida. Segue abaixo as etapas que falharam:";
    }
    @Override
    protected String compositeOperationRolledBack$str() {
        return "WFLYCTL0063: A operação de composição foi revertida";
    }
    @Override
    protected String configurationFileNameNotAllowed$str() {
        return "WFLYCTL0064: Os arquivos de configuração cujos nomes completos são %1$s, não são permitidos";
    }
    @Override
    protected String configurationFileNotFound$str() {
        return "WFLYCTL0065: Nenhum arquivo de configuração terminando em %1$s foi encontrado em %2$s";
    }
    @Override
    protected String directoryNotFound$str() {
        return "WFLYCTL0066: Nenhum diretório %1$s foi encontrado";
    }
    @Override
    protected String domainControllerMustBeDeclared$str() {
        return "WFLYCTL0067: É preciso declarar uma configuração de controlador de domínio %1$s ou %2$s.";
    }
    @Override
    protected String duplicateAttribute$str() {
        return "WFLYCTL0068: Um atributo chamado '%1$s' já foi declarado";
    }
    @Override
    protected String duplicateDeclaration1$str() {
        return "WFLYCTL0069: Declaração %1$s duplicada";
    }
    @Override
    protected String duplicateDeclaration2$str() {
        return "WFLYCTL0070: Declaração %1$s duplicada %2$s";
    }
    @Override
    protected String duplicateElement$str() {
        return "WFLYCTL0071: Elemento de caminho duplicado '%1$s' encontrado";
    }
    @Override
    protected String duplicateInterfaceDeclaration$str() {
        return "WFLYCTL0072: Declaração da interface duplicada";
    }
    @Override
    protected String duplicateNamedElement$str() {
        return "WFLYCTL0073: Um elemento desse tipo chamado '%1$s' já foi declarado";
    }
    @Override
    protected String duplicateResource$str() {
        return "WFLYCTL0075: Recurso %1$s duplicado";
    }
    @Override
    protected String duplicateResourceType$str() {
        return "WFLYCTL0076: Tipo de recurso %1$s duplicado";
    }
    @Override
    protected String failedInitializingModule$str() {
        return "WFLYCTL0079: Falha ao inicializar o módulo %1$s";
    }
    @Override
    protected String failedServices$str() {
        return "WFLYCTL0080: Falha de serviços";
    }
    @Override
    protected String failedToBackup$str() {
        return "WFLYCTL0081: Falha no backup %1$s";
    }
    @Override
    protected String failedToCreateConfigurationBackup$str() {
        return "WFLYCTL0082: Falha ao criar as cópias de backup do arquivo de configuração %1$s";
    }
    @Override
    protected String failedToLoadModule0$str() {
        return "WFLYCTL0083: Falha ao carregar o módulo";
    }
    @Override
    protected String failedToLoadModule1$str() {
        return "WFLYCTL0083: Falha ao carregar o módulo %1$s";
    }
    @Override
    protected String failedToMarshalConfiguration$str() {
        return "WFLYCTL0084: Falha ao aplicar o marshal na configuração";
    }
    @Override
    protected String failedToParseConfiguration$str() {
        return "WFLYCTL0085: Falha ao pesquisar a configuração";
    }
    @Override
    protected String failedToPersistConfigurationChange1$str() {
        return "WFLYCTL0086: Falha ao persistir a alteração de configuração %1$s";
    }
    @Override
    protected String failedToTakeSnapshot$str() {
        return "WFLYCTL0088: Falha ao obter um snapshot de %1$s para %2$s";
    }
    @Override
    protected String failedToWriteConfiguration$str() {
        return "WFLYCTL0089: Falha ao gravar uma configuração";
    }
    @Override
    protected String fileNotFound$str() {
        return "WFLYCTL0090: %1$s não existe";
    }
    @Override
    protected String fileNotFoundWithPrefix$str() {
        return "WFLYCTL0091: Nenhum arquivo começando com '%1$s' encontrado em %2$s";
    }
    @Override
    protected String fullServerBootRequired$str() {
        return "WFLYCTL0092: %1$s não pode ser usado, exceto em uma inicialização completa do servidor";
    }
    @Override
    protected String illegalInterfaceCriteria$str() {
        return "WFLYCTL0094: O tipo de critérios de interface %1$s é ilegal; deve ser %2$s";
    }
    @Override
    protected String illegalValueForInterfaceCriteria$str() {
        return "WFLYCTL0095: O valor %1$s é ilegal para os critérios de interface %2$s; deve ser %3$s";
    }
    @Override
    protected String immutableResource$str() {
        return "WFLYCTL0096: O recurso é imutável";
    }
    @Override
    protected String incorrectType$str() {
        return "WFLYCTL0097: Tipo incorreto para ‘%1$s’. Esperava-se %2$s, mas era %3$s";
    }
    @Override
    protected String invalid1$str() {
        return "WFLYCTL0099: %1$s é inválido";
    }
    @Override
    protected String invalid2$str() {
        return "WFLYCTL0100: %1$d não é um %2$s válido";
    }
    @Override
    protected String invalidAddress$str() {
        return "WFLYCTL0101: Endereço inválido %1$s (%2$s)";
    }
    @Override
    protected String invalidAddressMaskValue$str() {
        return "WFLYCTL0102: 'Valor' %1$s inválido -- deve estar na forma endereço/máscara";
    }
    @Override
    protected String invalidAddressMask$str() {
        return "WFLYCTL0103: Máscara inválida %1$s (%2$s)";
    }
    @Override
    protected String invalidAddressValue$str() {
        return "WFLYCTL0104: Endereço inválido %1$s (%2$s)";
    }
    @Override
    protected String invalidAttributeCombo$str() {
        return "WFLYCTL0105: %1$s é inválido na combinação com %2$s";
    }
    @Override
    protected String invalidAttributeValue2$str() {
        return "WFLYCTL0106: Valor '%1$s' inválido para o atributo '%2$s'";
    }
    @Override
    protected String invalidInterfaceCriteriaPattern$str() {
        return "WFLYCTL0109: Padrão %1$s inválido para os critérios de interface %2$s";
    }
    @Override
    protected String invalidPathElementKey$str() {
        return "WFLYCTL0110: Elemento de endereço de recurso '%1$s' inválido. A chave '%2$s' não é válida para um elemento em um endereço de recurso.";
    }
    @Override
    protected String invalidLoadFactor$str() {
        return "WFLYCTL0111: Fator de carregamento deve ser maior que 0 e menor ou igual a 1";
    }
    @Override
    protected String invalidMaxLength$str() {
        return "WFLYCTL0112: '%1$s' é um valor inválido para o parâmetro %2$s. O valor deve ter, no máximo, %3$d caracteres de comprimento";
    }
    @Override
    protected String invalidMinLength$str() {
        return "WFLYCTL0113: '%1$s' é um valor inválido para o parâmetro %2$s. Os valores devem ter, no máximo, %3$d caracteres de comprimento";
    }
    @Override
    protected String invalidMaxSize$str() {
        return "WFLYCTL0114: [%1$d] é um tamanho inválido para o parâmetro %2$s. É necessário ter o comprimento máximo de [%3$d]";
    }
    @Override
    protected String invalidMinSize$str() {
        return "WFLYCTL0115: [%1$d] é um tamanho inválido para o parâmetro %2$s. É necessário ter o comprimento mínimo de [%3$d]";
    }
    @Override
    protected String invalidMaxValue$str() {
        return "WFLYCTL0116: %1$d é um valor inválido para o parâmetro %2$s. É necessário ter o valor máximo de %3$d";
    }
    @Override
    protected String invalidMinValue$str() {
        return "WFLYCTL0117: %1$d é um valor inválido para o parâmetro %2$s. É necessário ter o valor mínimo de %3$d";
    }
    @Override
    protected String invalidModificationAfterCompletedStep$str() {
        return "WFLYCTL0118: Modificação inválida após completar a etapa";
    }
    @Override
    protected String invalidMulticastAddress$str() {
        return "WFLYCTL0119: O valor %1$s para o atributo %2$s não é um endereço multicast válido";
    }
    @Override
    protected String invalidOutboundSocketBinding$str() {
        return "WFLYCTL0120: A associação do soquete de saída %1$s não pode ter ambos %2$s, bem como ter o %3$s ao mesmo tempo";
    }
    @Override
    protected String invalidParameterValue$str() {
        return "WFLYCTL0121: %1$s não é um valor válido para o parâmetro %2$s --deve ser um dos seguintes: %3$s";
    }
    @Override
    protected String invalidSha1Value$str() {
        return "WFLYCTL0122: O valor %1$s para o atributo %2$s não representa um hash SHA1 codificado em hexadecimal apropriado";
    }
    @Override
    protected String invalidStage$str() {
        return "WFLYCTL0123: O estágio %1$s não é válido para o tipo de processo do contexto %2$s";
    }
    @Override
    protected String invalidStepStage$str() {
        return "WFLYCTL0124: Estágio especificado da etapa inválida";
    }
    @Override
    protected String invalidTableSize$str() {
        return "WFLYCTL0126: Não foi possível uma tabela de tamanho negativo!";
    }
    @Override
    protected String invalidType$str() {
        return "WFLYCTL0127: Tipo inválido: %1$s";
    }
    @Override
    protected String invalidPathElementValue$str() {
        return "WFLYCTL0128: O elemento de endereço de recurso '%1$s' é inválido. O valor '%2$s' não é válido para um elemento em um endereço de recurso. O caractere '%3$s' não é permitido.";
    }
    @Override
    protected String invalidValue$str() {
        return "WFLYCTL0129: Valor %1$s inválido para %2$s; os valores legais são %3$s";
    }
    @Override
    protected String missingOneOf$str() {
        return "WFLYCTL0132: Deve incluir um dos seguintes elementos: %1$s";
    }
    @Override
    protected String missingRequiredAttributes$str() {
        return "WFLYCTL0133: O(s) atributo(s) necessário(s) ausente(s): %1$s";
    }
    @Override
    protected String missingRequiredElements$str() {
        return "WFLYCTL0134: Elemento(s) necessário(s) ausente(s): %1$s";
    }
    @Override
    protected String moduleLoadingInterrupted$str() {
        return "WFLYCTL0135: Espera do carregamento interrompida do módulo %1$s";
    }
    @Override
    protected String moduleInitializationInterrupted$str() {
        return "WFLYCTL0136: Espera da inicialização interrompida do módulo %1$s";
    }
    @Override
    protected String multipleModelNodes$str() {
        return "WFLYCTL0137: O modelo contém nós %1$s múltiplos";
    }
    @Override
    protected String namespaceAlreadyRegistered$str() {
        return "WFLYCTL0138: Namespace com prefixo %1$s já registrado com o URI do esquema %2$s";
    }
    @Override
    protected String namespaceNotFound$str() {
        return "WFLYCTL0139: Não foi encontrado nenhum namespace com URI %1$s";
    }
    @Override
    protected String nestedElementNotAllowed$str() {
        return "WFLYCTL0140: %1$s aninhado não permitido";
    }
    @Override
    protected String noActiveStep$str() {
        return "WFLYCTL0144: Nenhuma etapa ativa";
    }
    @Override
    protected String noChildType$str() {
        return "WFLYCTL0147: Nenhum filho do tipo %1$s";
    }
    @Override
    protected String noInterfaceCriteria$str() {
        return "WFLYCTL0149: Nenhum critério de interface fornecido";
    }
    @Override
    protected String noOperationHandler0$str() {
        return "WFLYCTL0150: Nenhum manuseador de operação";
    }
    @Override
    protected String notADirectory$str() {
        return "WFLYCTL0152: %1$s não é um diretório";
    }
    @Override
    protected String notFound$str() {
        return "WFLYCTL0153: Nenhum %1$s%2$s encontrado para %3$s";
    }
    @Override
    protected String nullAsynchronousExecutor$str() {
        return "WFLYCTL0154: Não foi possível executar a operação assíncrona sem um executor";
    }
    @Override
    protected String nullNotAllowed$str() {
        return "WFLYCTL0155: '%1$s' não pode ser nulo";
    }
    @Override
    protected String operation$str() {
        return "Operação %1$s";
    }
    @Override
    protected String operationAlreadyComplete$str() {
        return "WFLYCTL0157: Operação já finalizada";
    }
    @Override
    protected String operationHandlerFailed$str() {
        return "WFLYCTL0158: Falha no manipulador da operação: %1$s";
    }
    @Override
    protected String operationRollingBack$str() {
        return "WFLYCTL0160: Operação de reversão";
    }
    @Override
    protected String operationSucceeded$str() {
        return "WFLYCTL0161: Operação bem sucedida, confirmando";
    }
    @Override
    protected String operationNotRegistered$str() {
        return "WFLYCTL0162: Não há operação %1$s registrada no endereço %2$s";
    }
    @Override
    protected String persisterNotInjected$str() {
        return "WFLYCTL0165: Nenhum persister da configuração foi injetado";
    }
    @Override
    protected String proxyHandlerAlreadyRegistered$str() {
        return "WFLYCTL0169: Um manipulador proxy já foi registrado no local '%1$s'";
    }
    @Override
    protected String removingServiceUnsatisfiedDependencies0$str() {
        return "WFLYCTL0171: A remoção dos serviços levou dependências não satisfatórias:";
    }
    @Override
    protected String removingServiceUnsatisfiedDependencies1$str() {
        return "%nService %1$s dependia de ";
    }
    @Override
    protected String required$str() {
        return "WFLYCTL0172: %1$s é necessário";
    }
    @Override
    protected String reserved$str() {
        return "WFLYCTL0173: %1$s é reservado";
    }
    @Override
    protected String resourceNotFound$str() {
        return "WFLYCTL0175: O recurso %1$s não existe; um recurso no endereço %2$s não pode ser criado até que todos os recursos ancestrais sejam adicionados";
    }
    @Override
    protected String rollbackAlreadyInvoked$str() {
        return "WFLYCTL0176: O rollback() já foi invocado";
    }
    @Override
    protected String schemaAlreadyRegistered$str() {
        return "WFLYCTL0177: O esquema com URI %1$s já registrou com o local %2$s";
    }
    @Override
    protected String schemaNotFound$str() {
        return "WFLYCTL0178: Não foi encontrada nenhum local com URL %1$s";
    }
    @Override
    protected String serviceInstallCancelled$str() {
        return "WFLYCTL0179: A instalação do serviço foi cancelada";
    }
    @Override
    protected String servicesMissing$str() {
        return "faltam [%1$s]";
    }
    @Override
    protected String servicesMissingDependencies$str() {
        return "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências";
    }
    @Override
    protected String serviceRegistryRuntimeOperationsOnly$str() {
        return "WFLYCTL0181: O registro do serviço apenas suportado nas operações do período de rodagem";
    }
    @Override
    protected String serviceRemovalRuntimeOperationsOnly$str() {
        return "WFLYCTL0182: A remoção do serviço apenas suportada nas operações do período de rodagem";
    }
    @Override
    protected String serviceStatusReportHeader$str() {
        return "WFLYCTL0183: Relatório%n de status de serviço";
    }
    @Override
    protected String serviceStatusReportDependencies$str() {
        return "WFLYCTL0184: Não falta/insatisfaz nenhuma das dependências:%n";
    }
    @Override
    protected String serviceStatusReportMissing$str() {
        return "%1$s (faltam) dependentes: %2$s %n";
    }
    @Override
    protected String serviceStatusReportCorrected$str() {
        return "WFLYCTL0185: Serviços recém corrigidos:%n";
    }
    @Override
    protected String serviceStatusReportNoLongerRequired$str() {
        return "%1$s (não mais solicitado)%n";
    }
    @Override
    protected String serviceStatusReportAvailable$str() {
        return "%1$s (recém disponível)%n";
    }
    @Override
    protected String serviceStatusReportFailed$str() {
        return "WFLYCTL0186: Serviços que falham na inicialização:";
    }
    @Override
    protected String serviceTargetRuntimeOperationsOnly$str() {
        return "WFLYCTL0187: Destino do serviço obtido apenas suportado nas operações do período de rodagem";
    }
    @Override
    protected String stageAlreadyComplete$str() {
        return "WFLYCTL0188: O estágio %1$s já foi concluído";
    }
    @Override
    protected String stepHandlerFailed$str() {
        return "WFLYCTL0190: O manipulador da etapa %1$s para a operação %2$s no endereço %3$s falhou -- %4$s";
    }
    @Override
    protected String subsystemBootInterrupted$str() {
        return "WFLYCTL0191: Espera interrompida da execução da operação de inicialização do subsistema";
    }
    @Override
    protected String subsystemBootOperationFailed$str() {
        return "WFLYCTL0192: As operações de inicialização para o subsistema %1$s falharam sem explicação";
    }
    @Override
    protected String subsystemBootOperationFailedExecuting$str() {
        return "WFLYCTL0193: Falha ao executar as operações de inicialização do subsistema %1$s";
    }
    @Override
    protected String tableIsFull$str() {
        return "WFLYCTL0194: A tabela está cheia!";
    }
    @Override
    protected String transactionInterrupted$str() {
        return "WFLYCTL0195: Confirmação ou reversão da transação de espera interrompida";
    }
    @Override
    protected String unexpectedAttribute1$str() {
        return "WFLYCTL0197: Atributo '%1$s' inesperado encontrado";
    }
    @Override
    protected String unexpectedElement1$str() {
        return "WFLYCTL0198: Elemento '%1$s' inesperado encontrado";
    }
    @Override
    protected String unexpectedEndElement$str() {
        return "WFLYCTL0199: Encerramento inesperado do elemento '%1$s' encontrado";
    }
    @Override
    protected String unknownAttribute$str() {
        return "WFLYCTL0201: Atributo '%1$s' desconhecido";
    }
    @Override
    protected String unknownChildType$str() {
        return "WFLYCTL0202: Nenhum tipo de filho chamado %1$s";
    }
    @Override
    protected String unknownCriteriaInterfaceProperty$str() {
        return "WFLYCTL0203: Propriedade desconhecida na lista de critérios da interface: %1$s";
    }
    @Override
    protected String unknownCriteriaInterfaceType$str() {
        return "WFLYCTL0204: Tipo de critério da interface %1$s desconhecido";
    }
    @Override
    protected String unknownInterface$str() {
        return "WFLYCTL0205: A interface desconhecida %1$s %2$s deve ser declarada no elemento %3$s";
    }
    @Override
    protected String unknownValueForElement$str() {
        return "WFLYCTL0206: %1$s %2$s %3$s desconhecido deve ser declarado no elemento %4$s";
    }
    @Override
    protected String validationFailed$str() {
        return "WFLYCTL0207: Falha na validação para %1$s";
    }
    @Override
    protected String andNMore$str() {
        return "WFLYCTL0208: ... e mais %1$s";
    }
    @Override
    protected String invalidAttributeValue3$str() {
        return "WFLYCTL0209: Valor '%1$s' inválido para o atributo '%2$s' -- os valores válidos são %3$s";
    }
    @Override
    protected String noPermissionToResolveExpression$str() {
        return "WFLYCTL0210: SecurityException estava tentando resolver a expressão '%1$s' -- %2$s";
    }
    @Override
    protected String cannotResolveExpression$str() {
        return "WFLYCTL0211: Não foi possível resolver a expressão '%1$s'";
    }
    @Override
    protected String duplicateResourceAddress$str() {
        return "WFLYCTL0212: Recurso %1$s duplicado";
    }
    @Override
    protected String mainFileNotFound$str() {
        return "WFLYCTL0214: Não foi possível carregar o arquivo de configuração: %1$s. O argumento do arquivo de configuração deve especificar o caminho para um arquivo localizado no diretório de configuração. O caminho deve ser um caminho relativo e deve ser relativo ao diretório de configuração %2$s.";
    }
    @Override
    protected String absolutePathMainFileNotFound$str() {
        return "WFLYCTL0215: Não foi possível carregar o arquivo de configuração: %1$s. O argumento do arquivo de configuração deve especificar um dos seguintes: 1) um caminho absoluto para um arquivo existente, 2) um caminho relativo para um arquivo existente, relativo ao diretório de trabalho atual ou 3) um caminho relativo para um arquivo localizado no diretório de configuração. Nesse último caso, deve ser um caminho relativo ao diretório de configuração %2$s.";
    }
    @Override
    protected String managementResourceNotFound$str() {
        return "WFLYCTL0216: O recurso de gerenciamento '%1$s' não foi encontrado";
    }
    @Override
    protected String childResourceNotFound$str() {
        return "WFLYCTL0217: O recurso filho '%1$s' não foi encontrado";
    }
    @Override
    protected String nodeAlreadyRegistered$str() {
        return "WFLYCTL0218: O nó já está registrado em '%1$s'";
    }
    @Override
    protected String removingExtensionWithRegisteredSubsystem$str() {
        return "WFLYCTL0219: Foi realizada uma tentativa de cancelar o registro da extensão %1$s, que continua tendo o subsistema %2$s registrado";
    }
    @Override
    protected String cannotOverrideRootRegistration$str() {
        return "WFLYCTL0220: Um registro de modelo de substituição não é permitido para o registro do modelo root";
    }
    @Override
    protected String cannotOverrideNonWildCardRegistration$str() {
        return "WFLYCTL0221: Um registro de modelo de substituição não é permitido para os registros do modelo não-curinga. Esse registro é para o nome não-curinga '%1$s'.";
    }
    @Override
    protected String wildcardRegistrationIsNotAnOverride$str() {
        return "WFLYCTL0222: O registro nomeado não é um modelo de substituição e não pode ter o registro cancelado através do unregisterOverrideModel API.";
    }
    @Override
    protected String rootRegistrationIsNotOverridable$str() {
        return "WFLYCTL0223: O registro do recurso root não pode suportar as substituições, de forma que nenhuma substituição pode ser removida.";
    }
    @Override
    protected String operationNotRegisteredException$str() {
        return "WFLYCTL0224: Não há operação %1$s registrada no endereço %2$s";
    }
    @Override
    protected String failedToRecoverServices$str() {
        return "WFLYCTL0225: Falha ao recuperar serviços durante a reversão da operação";
    }
    @Override
    protected String duplicateSubsystem$str() {
        return "WFLYCTL0226: Não é possível registrar um subsistema chamado '%1$s' pela extensão'%2$s' -- já foi registrado um subsistema com esse nome pela extensão '%3$s'.";
    }
    @Override
    protected String validationFailedOperationHasNoField$str() {
        return "WFLYCTL0227: A operação não possui o campo '%1$s'. %2$s";
    }
    @Override
    protected String validationFailedOperationHasANullOrEmptyName$str() {
        return "WFLYCTL0228: A operação não possui um nome vazio ou nulo. %1$s";
    }
    @Override
    protected String validationFailedNoOperationFound$str() {
        return "WFLYCTL0229: Nenhuma operação chamada '%1$s' no '%2$s'. %3$s";
    }
    @Override
    protected String validationFailedActualParameterNotDescribed$str() {
        return "WFLYCTL0230: A operação contém um parâmetro '%1$s' que não é um dos parâmetros %2$s esperados. %3$s";
    }
    @Override
    protected String validationFailedRequiredParameterNotPresent$str() {
        return "WFLYCTL0231: O parâmetro esperado %1$s não está presente. %2$s";
    }
    @Override
    protected String validationFailedRequiredParameterPresentAsWellAsAlternative$str() {
        return "WFLYCTL0232: O parâmetro alternativo '%1$s' ao parâmetro necessário '%2$s' foi utilizado. Use apenas um dos dois. %3$s";
    }
    @Override
    protected String validationFailedCouldNotConvertParamToType$str() {
        return "WFLYCTL0233: Não foi possível converter o parâmetro '%1$s' em um %2$s. %3$s";
    }
    @Override
    protected String validationFailedValueIsSmallerThanMin$str() {
        return "WFLYCTL0234: O valor '%1$s' passado ao '%2$s' é menor que o valor mínimo '%3$s'. %4$s";
    }
    @Override
    protected String validationFailedValueIsGreaterThanMax$str() {
        return "WFLYCTL0235: O valor '%1$s' passado ao '%2$s' é maior que o valor máximo '%3$s'. %4$s";
    }
    @Override
    protected String validationFailedValueIsShorterThanMinLength$str() {
        return "WFLYCTL0236: O valor '%1$s' passado ao '%2$s' é menor que o comprimento mínimo '%3$s'. %4$s";
    }
    @Override
    protected String validationFailedValueIsLongerThanMaxLength$str() {
        return "WFLYCTL0237: O valor '%1$s' passado ao '%2$s' é maior que o comprimento máximo '%3$s'. %4$s";
    }
    @Override
    protected String validationFailedInvalidElementType$str() {
        return "WFLYCTL0238: Espera-se que %1$s seja a lista de %2$s. %3$s";
    }
    @Override
    protected String invalidDescriptionRequiredFlagIsNotABoolean$str() {
        return "WFLYCTL0239: Parâmetro 'necessário': '%1$s' deve ser um booleano na descrição da operação em %2$s: %3$s";
    }
    @Override
    protected String invalidDescriptionUndefinedRequestProperty$str() {
        return "WFLYCTL0240: Propriedade de solicitação '%1$s' indefinida na descrição da operação em %2$s: %3$s";
    }
    @Override
    protected String invalidDescriptionNoParamTypeInDescription$str() {
        return "WFLYCTL0241: Não há nenhum tipo para o parâmetro '%1$s' na descrição da operação em %2$s: %3$s";
    }
    @Override
    protected String invalidDescriptionInvalidParamTypeInDescription$str() {
        return "WFLYCTL0242: Não foi possível determinar o tipo de parâmetro '%1$s' na descrição da operação em %2$s: %3$s";
    }
    @Override
    protected String invalidDescriptionMinMaxForParameterHasWrongType$str() {
        return "WFLYCTL0243: O atributo '%1$s' do parâmetro '%2$s' não pode ser convertido ao seu próprio tipo %3$s na descrição da operação em %4$s: %5$s";
    }
    @Override
    protected String invalidDescriptionMinMaxLengthForParameterHasWrongType$str() {
        return "WFLYCTL0244: O atributo '%1$s' do parâmetro '%2$s' não pode ser convertido ao número na descrição da operação em %3$s: %4$s";
    }
    @Override
    protected String invalidPort$str() {
        return "WFLYCTL0245: Valor '%1$s' ilegal %2$s -- deve ser um número de porta válida";
    }
    @Override
    protected String cannotResolveProcessUUID$str() {
        return "WFLYCTL0246: Não foi possível resolver o endereço localhost para criar um nome baseado no UUID para esse processo";
    }
    @Override
    protected String useOperationContextRemoveService$str() {
        return "WFLYCTL0247: Não foi possível chamar o ServiceController.setMode(REMOVE). Use o OperationContext.removeService() como forma alternativa.";
    }
    @Override
    protected String invalidEnumValue$str() {
        return "WFLYCTL0248: Valor %1$s inválido para %2$s; os valores legais são %3$s";
    }
    @Override
    protected String modelUpdateNotAuthorized$str() {
        return "WFLYCTL0249: A operação '%1$s' marcada no recurso '%2$s' foi diretamente invocada pelo usuário. Não é permitido usar as operações do usuário para atualizar diretamente a configuração persistente de um servidor no controlador de domínio.";
    }
    @Override
    protected String serverResultsAccessNotAllowed$str() {
        return "WFLYCTL0250: Um manipulador da operação tentou acessar o objeto de resultados do servidor de resposta da operação num tipo de processo diferente de '%1$s'. O tipo de processo atual é '%2$s'";
    }
    @Override
    protected String cantHaveBothLoopbackAndInetAddressCriteria$str() {
        return "WFLYCTL0251: Não foi possível possuir ambos critérios inet-address e loopback";
    }
    @Override
    protected String cantHaveSameCriteriaForBothNotAndInclusion$str() {
        return "WFLYCTL0253: Não é possível ter os mesmos critérios para inclusão e sem %1$s";
    }
    @Override
    protected String nonexistentInterface$str() {
        return "WFLYCTL0254: Valor '%1$s' inválido para o atributo '%2$s' -- não há nenhuma configuração de interface com esse nome";
    }
    @Override
    protected String pathEntryNotFound$str() {
        return "WFLYCTL0256: Não foi possível encontrar um caminho chamado '%1$s'";
    }
    @Override
    protected String pathEntryIsReadOnly$str() {
        return "WFLYCTL0257: A entrada é somente leitura: '%1$s'";
    }
    @Override
    protected String pathEntryAlreadyExists$str() {
        return "WFLYCTL0258: Já existe uma entrada de caminho chamada: '%1$s'";
    }
    @Override
    protected String invalidRelativePathValue$str() {
        return "WFLYCTL0260: Valor relativePath inválido '%1$s'";
    }
    @Override
    protected String pathIsAWindowsAbsolutePath$str() {
        return "WFLYCTL0261: '%1$s' é um caminho absoluto do Windows";
    }
    @Override
    protected String cannotRemoveReadOnlyPath$str() {
        return "WFLYCTL0262: O caminho '%1$s' é somente leitura; ele não pode ser removido";
    }
    @Override
    protected String cannotModifyReadOnlyPath$str() {
        return "WFLYCTL0263: O caminho '%1$s' é somente leitura; ele não pode ser modificado";
    }
    @Override
    protected String expressionNotAllowed$str() {
        return "WFLYCTL0264: %1$s não pode ser ModelType.EXPRESSION";
    }
    @Override
    protected String pathManagerNotAvailable$str() {
        return "WFLYCTL0265: O PathManager não está disponível no processo do tipo '%1$s'";
    }
    @Override
    protected String unknownMulticastAddress$str() {
        return "WFLYCTL0266: O valor %1$s para o atributo %2$s não é um endereço multicast válido";
    }
    @Override
    protected String cannotRemovePathWithDependencies$str() {
        return "WFLYCTL0267: O caminho '%1$s' não pode ser removido, uma vez que os seguintes caminhos dependem dele: %2$s";
    }
    @Override
    protected String failedToRenameTempFile$str() {
        return "WFLYCTL0268: Falha ao renomear o arquivo temporário %1$s para %2$s";
    }
    @Override
    protected String invalidLocaleString$str() {
        return "WFLYCTL0269: Formato local inválido: %1$s";
    }
    @Override
    protected String operationCancelled$str() {
        return "WFLYCTL0271: Operação cancelada";
    }
    @Override
    protected String operationCancelledAsynchronously$str() {
        return "WFLYCTL0272: Operação cancelada de forma assíncrona";
    }
    @Override
    protected String streamWasKilled$str() {
        return "WFLYCTL0273: O fluxo foi interrompido";
    }
    @Override
    protected String streamWasClosed$str() {
        return "WFLYCTL0274: O fluxo foi encerrado";
    }
    @Override
    protected String cannotHaveBothParameters$str() {
        return "WFLYCTL0275: Não foi possível definir ambos '%1$s' e '%2$s'";
    }
    @Override
    protected String couldNotDeleteFile$str() {
        return "WFLYCTL0276: Falha ao excluir o arquivo %1$s";
    }
    @Override
    protected String aliasAlreadyRegistered$str() {
        return "WFLYCTL0277: Já existe um alias registrado no local '%1$s'";
    }
    @Override
    protected String aliasTargetResourceRegistrationNotFound$str() {
        return "WFLYCTL0279: O endereço de destino do alias não foi encontrado: %1$s";
    }
    @Override
    protected String aliasStepHandlerOperationNotFound$str() {
        return "WFLYCTL0280: Nenhuma operação chamada '%1$s' encontrada para o endereço do alias '%2$s' que mapeia para '%3$s'";
    }
    @Override
    protected String resourceRegistrationIsNotAnAlias$str() {
        return "WFLYCTL0281: O registro do recurso não é um alias";
    }
    @Override
    protected String modelFieldsNotKnown$str() {
        return "WFLYCTL0282: O modelo contém campos que não são conhecidos na definição, campos: %1$s, caminho: %2$s";
    }
    @Override
    protected String couldNotMarshalAttributeAsElement$str() {
        return "WFLYCTL0283: Não foi possível aplicar o marshal ao atributo como elemento: %1$s";
    }
    @Override
    protected String couldNotMarshalAttributeAsAttribute$str() {
        return "WFLYCTL0284: Não foi possível aplicar o marshal ao atributo como atributo: %1$s";
    }
    @Override
    protected String wildcardOperationFailedAtSingleAddress$str() {
        return "WFLYCTL0285: A operação %1$s invocada para os endereços de destino múltiplos falhou no endereço %2$s com a descrição de falha %3$s";
    }
    @Override
    protected String wildcardOperationFailedAtSingleAddressWithComplexFailure$str() {
        return "WFLYCTL0286: A operação %1$s invocada para os endereços de destino falhou no endereço %2$s. Consulte o resultado da operação para mais informações.";
    }
    @Override
    protected String wildcardOperationFailedAtMultipleAddresses$str() {
        return "WFLYCTL0287: A operação %1$s invocada para os endereços de destino falhou no endereço %2$s. Consulte o resultado da operação para mais informações.";
    }
    @Override
    protected String missingTransitiveDependencyProblem$str() {
        return "WFLYCTL0288: Um ou mais serviços foram impossibilitados de iniciar devido a uma ou mais dependências não estarem disponíveis.";
    }
    @Override
    protected String missingTransitiveDependents$str() {
        return "Os serviços que não foi possível iniciar:";
    }
    @Override
    protected String missingTransitiveDependencies$str() {
        return "Os serviços que podem ser a causa:";
    }
    @Override
    protected String noOperationEntry$str() {
        return "WFLYCTL0289: Nenhuma entrada da operação chamada '%1$s' registrada no '%2$s'";
    }
    @Override
    protected String noOperationHandler2$str() {
        return "WFLYCTL0290: Nenhum manipulador da operação chamado '%1$s' registrado no '%2$s'";
    }
    @Override
    protected String noPathToResolve$str() {
        return "WFLYCTL0291: Não existe nenhum caminho registrado para resolver com o atributo do caminho '%1$s' e/ou relativo ao atributo '%2$s' em %3$s";
    }
    @Override
    protected String attributesDontSupportExpressions$str() {
        return "WFLYCTL0292: Os atributos não suportam expressões na versão do modelo do destino e este recurso precisará ser ignorado no host de destino.";
    }
    @Override
    protected String attributesAreNotUnderstoodAndMustBeIgnored0$str() {
        return "WFLYCTL0293: Os atributos não são entendidos na versão de modelo do destino e este recurso precisará ser ignorado no host de destino.";
    }
    @Override
    protected String transformerLoggerCoreModelResourceTransformerAttributes$str() {
        return "WFLYCTL0294: Transformação do recurso %1$s na versão do modelo core '%2$s' -- %3$s %4$s";
    }
    @Override
    protected String transformerLoggerCoreModelOperationTransformerAttributes$str() {
        return "WFLYCTL0295: Transformação da operação %1$s no recurso %2$s para a versão do modelo core '%3$s' -- %4$s %5$s";
    }
    @Override
    protected String transformerLoggerSubsystemModelResourceTransformerAttributes$str() {
        return "WFLYCTL0296: Transformação do recurso %1$s para o subsistema '%2$s' da versão de modelo '%3$s' -- %4$s %5$s";
    }
    @Override
    protected String transformerLoggerSubsystemModelOperationTransformerAttributes$str() {
        return "WFLYCTL0297: Transformação da operação %1$s no recurso %2$s para o subsistema '%3$s' da versão do modelo '%4$s' -- %5$s %6$s";
    }
    @Override
    protected String illegalUnresolvedModel$str() {
        return "WFLYCTL0298: O nó contém uma expressão não resolvida %1$s -- é preciso um modelo resolvido";
    }
    @Override
    protected String rejectAttributesCoreModelResourceTransformer$str() {
        return "WFLYCTL0299: Transformação do recurso %1$s para o controlador do host '%2$s' para a versão do modelo core '%3$s' -- ocorreram problemas com alguns atributos e o recurso precisará ser ignorado nesse host. Detalhes dos problemas: %4$s";
    }
    @Override
    protected String rejectAttributesSubsystemModelResourceTransformer$str() {
        return "WFLYCTL0300: Transformação do recurso %1$s para o controlador do host '%2$s' para o subsistema, versão do modelo '%3$s', '%4$s' -- ocorreram problemas com alguns dos atributos e este recurso precisará ser ignorado naquele host. Detalhes dos problemas: %5$s";
    }
    @Override
    protected String attributesDoNotSupportExpressions$str() {
        return "WFLYCTL0301: Os seguintes atributos não suportam expressões: %1$s";
    }
    @Override
    protected String attributeNames$str() {
        return "atributos %1$s";
    }
    @Override
    protected String attributesAreNotUnderstoodAndMustBeIgnored1$str() {
        return "WFLYCTL0302: Os seguinte atributos não são entendidos na versão do modelo de destino e este recurso precisará ser ignorado no host de destino: %1$s";
    }
    @Override
    protected String rejectedResourceResourceTransformation$str() {
        return "WFLYCTL0303: O recurso %1$s foi rejeitado no host de destino e precisará ser ignorado no host";
    }
    @Override
    protected String rejectResourceOperationTransformation$str() {
        return "WFLYCTL0304: A operação %2$s na %1$1s foi rejeitada no host de destino e precisará ser ignorada no host";
    }
    @Override
    protected String discoveryOptionsMustBeDeclared$str() {
        return "WFLYCTL0305: A não ser que o controlador do host seja iniciado com a opção da linha de comando %1$s e o atributo %2$s não seja configurado para %3$s, o %4$s deve ser declarado ou então é necessário fornecer %5$s e %6$s.";
    }
    @Override
    protected String readOnlyContext$str() {
        return "WFLYCTL0306: contexto apenas de leitura";
    }
    @Override
    protected String cannotGetControllerLock$str() {
        return "WFLYCTL0307: Estamos tentando ler dados do controlador de domínio, que está atualmente ocupado executando outro conjunto de operações. Essa é uma situação temporária, tente novamente";
    }
    @Override
    protected String unsupportedLegacyExtension$str() {
        return "WFLYCTL0309: A extensão herdada '%1$s' não é suportada nos servidores executando esta versão. A extensão é apenas suportada para uso de hosts sendo executados em uma versão anterior em um domínio gerenciado de versão mista";
    }
    @Override
    protected String extensionModuleNotFound$str() {
        return "WFLYCTL0310: O módulo de extensão %1$s não foi encontrado";
    }
    @Override
    protected String extensionModuleLoadingFailure$str() {
        return "WFLYCTL0311: Falha ao carregar o módulo de extensão %1$s";
    }
    @Override
    protected String noContextToDelegateTo$str() {
        return "WFLYCTL0312: Nenhum contexto para delegar com a ID: %1$s";
    }
    @Override
    protected String unauthorized$str() {
        return "WFLYCTL0313: Sem autorização para executar a operação '%1$s' para o recurso '%2$s' -- %3$s";
    }
    @Override
    protected String illegalMultipleRoles$str() {
        return "WFLYCTL0314: Os usuários com funções múltiplas não são permitidos";
    }
    @Override
    protected String noHandlerCalled$str() {
        return "WFLYCTL0317: Não existe um manipulador chamado '%1$s'";
    }
    @Override
    protected String operationContextIsNotAbstractOperationContext$str() {
        return "WFLYCTL0318: O contexto da operação não é um AbstractOperationContext";
    }
    @Override
    protected String handlerIsReferencedBy$str() {
        return "WFLYCTL0319: O manipulador é referenciado pelo %1$s e, portanto, não pode ser removido";
    }
    @Override
    protected String resolvedFileDoesNotExistOrIsDirectory$str() {
        return "WFLYCTL0320: O arquivo resolvido %1$s não existe ou é um diretório";
    }
    @Override
    protected String couldNotBackUp$str() {
        return "WFLYCTL0321: Não foi possível realizar o backup de '%1$s' para '%2$s'";
    }
    @Override
    protected String attemptToBothRemoveAndAddHandlerUpdateInstead$str() {
        return "WFLYCTL0322: A tentativa foi feita para remover e adicionar um manuseador a partir de uma operação composta - atualize o manuseador";
    }
    @Override
    protected String attemptToBothAddAndRemoveAndHandlerFromCompositeOperation$str() {
        return "WFLYCTL0323: A tentativa realizada para tanto adicionar e remover o manuseador de uma operação composta";
    }
    @Override
    protected String attemptToBothUpdateAndRemoveHandlerFromCompositeOperation$str() {
        return "WFLYCTL0324: A tentativa realizada para tanto atualizar e remover o manuseador de uma operação composta";
    }
    @Override
    protected String attemptToBothRemoveAndAddHandlerReferenceFromCompositeOperation$str() {
        return "WFLYCTL0325: A tentativa realizada para tanto remover e adicionar o manuseador de uma operação composta";
    }
    @Override
    protected String unknownRole$str() {
        return "WFLYCTL0327: Função '%1$s' desconhecida";
    }
    @Override
    protected String cannotRemoveStandardRole$str() {
        return "WFLYCTL0328: Não foi possível remover a função padrão '%1$s'";
    }
    @Override
    protected String unknownBaseRole$str() {
        return "WFLYCTL0329: Função base '%1$s' desconhecida";
    }
    @Override
    protected String roleIsAlreadyRegistered$str() {
        return "WFLYCTL0330: A função '%1$s' já está registrada";
    }
    @Override
    protected String canOnlyCreateChildAuditLoggerForMainAuditLogger$str() {
        return "WFLYCTL0331: Não foi possível criar um agente de auditoria filho para o agente de auditoria principal";
    }
    @Override
    protected String permissionDenied$str() {
        return "WFLYCTL0332: Permissão recusada";
    }
    @Override
    protected String permissionCollectionIsReadOnly$str() {
        return "WFLYCTL0333: Não foi possível adicionar uma permissão a um PermissionCollection de leitura apenas";
    }
    @Override
    protected String incompatiblePermissionType$str() {
        return "WFLYCTL0334: Tipo de permissão %1$s incompatível";
    }
    @Override
    protected String managementResourceNotFoundMessage$str() {
        return "WFLYCTL0335: O recurso de gerenciamento '%1$s' não foi encontrado";
    }
    @Override
    protected String attributesMustBeDefined$str() {
        return "WFLYCTL0336: Os atributos a seguir são anuláveis no modelo atual. Porém, precisam ser definidos na versão de modelo de destino: %1$s";
    }
    @Override
    protected String unsupportedIdentityType$str() {
        return "WFLYCTL0337: Tipo de Identidade não suportado '%1$X' recebido.";
    }
    @Override
    protected String unsupportedIdentityParameter$str() {
        return "WFLYCTL0338: Parâmetro Identidade não suportado '%1$X' recebido pesquisando o tipo de identidade '%2$X'.";
    }
    @Override
    protected String attributesMustBeDefinedAs$str() {
        return "WFLYCTL0339: Os seguintes atributos devem ser definidos como %1$s no modelo atual: %2$s";
    }
    @Override
    protected String attributesMustNotBeDefinedAs$str() {
        return "WFLYCTL0340: Os seguintes atributos NÃO devem ser definidos como %1$s no modelo atual: %2$s";
    }
    @Override
    protected String badUriSyntax$str() {
        return "WFLYCTL0341: Um URI com uma sintaxe ruim '%1$s' foi passado à validação.";
    }
    @Override
    protected String invalidBlockingTimeout$str() {
        return "WFLYCTL0342: Valor %1$d ilegal para o cabeçalho da operação %2$s. O valor deve ser maior que zero.";
    }
    @Override
    protected String timeoutAwaitingInitialStability0$str() {
        return "WFLYCTL0343: O contêiner do serviço foi desestabilizado por operações anteriores e atualizações do período de execução futuras não podem ser processadas. O reinício é requerido.";
    }
    @Override
    protected String timeoutExecutingOperation0$str() {
        return "WFLYCTL0344: A operação entrou em intervalo esperando pela estabilidade do contêiner de serviço";
    }
    @Override
    protected String serviceInstallTimedOut$str() {
        return "WFLYCTL0345: Tempo limite atingido após %1$d segundos de espera para que o serviço existente %2$s seja removido e uma nova instância possa ser instalada.";
    }
    @Override
    protected String invalidDefaultBlockingTimeout$str() {
        return "WFLYCTL0346: Valor inválido %1$s para a propriedade %2$s. Ele deve ser um valor numérico maior que zero. O valor padrão %3$d será usado.";
    }
    @Override
    protected String timeoutAwaitingInitialStability3$str() {
        return "WFLYCTL0347: Tempo limite atingido após [%1$d] segundos aguardando a estabilidade inicial do contêiner antes de permitir alterações de tempo de execução para a operação '%2$s' no endereço '%3$s'. A operação não será revertida; é necessário reinicias o processo.";
    }
    @Override
    protected String timeoutExecutingOperation3$str() {
        return "WFLYCTL0348: Tempo limite atingido após [%1$d] segundos aguardando a estabilidade do contêiner de serviço. A operação será revertida. A etapa que atualizou primeiro o contêiner de serviço era '%2$s' no endereço '%3$s'";
    }
    @Override
    protected String timeoutCompletingOperation$str() {
        return "WFLYCTL0349: Tempo limite atingido após [%1$d] segundos aguardando a estabilidade do contêiner de serviço ao finalizar a operação. A etapa que atualizou primeiro o contêiner de serviço era '%2$s' no endereço '%3$s'";
    }
    @Override
    protected String interruptedAwaitingInitialResponse$str() {
        return "WFLYCTL0350: A execução da operação '%1$s' no processo remoto do endereço '%2$s' foi interrompida enquanto aguardava uma resposta inicial. O processo remoto foi notificado para cancelar a operação.";
    }
    @Override
    protected String interruptedAwaitingFinalResponse$str() {
        return "WFLYCTL0351: A execução da operação '%1$s' no processo remoto do endereço '%2$s' foi interrompida enquanto aguardava a resposta final. O processo remoto foi notificado para encerrar a operação";
    }
    @Override
    protected String cancellingOperation$str() {
        return "WFLYCTL0352: Cancelando a operação '%1$s' com ID '%2$d' em execução no thread '%3$s'";
    }
    @Override
    protected String responseHandlerNotFound$str() {
        return "WFLYCTL0353: Nenhum manipulador de resposta para a solicitação %1$s";
    }
    @Override
    protected String attemptingReconnectToSyslog$str() {
        return "WFLYCTL0354: Tentando reconectar ao manipulador syslog '%1$s'; após intervalo de %2$d segundos";
    }
    @Override
    protected String reconnectToSyslogFailed$str() {
        return "WFLYCTL0355: Falha na reconexão do manipulador syslog '%1$s'";
    }
    @Override
    protected String failedToEmitNotification$str() {
        return "WFLYCTL0356: Falha ao emitir a notificação %1$s";
    }
    @Override
    protected String notificationIsNotDescribed$str() {
        return "WFLYCTL0357: O tipo de notificação %1$s não é descrito para o recurso no endereço %2$s";
    }
    @Override
    protected String resourceWasAdded$str() {
        return "WFLYCTL0358: O recurso foi adicionado ao endereço %1$s.";
    }
    @Override
    protected String resourceWasRemoved$str() {
        return "WFLYCTL0359: O recurso foi removido do endereço %1$s.";
    }
    @Override
    protected String attributeValueWritten$str() {
        return "WFLYCTL0360: O valor do atributo %1$s foi alterado de %2$s para %3$s.";
    }
    @Override
    protected String capabilitiesNotAvailable$str() {
        return "WFLYCTL0361: As funcionalidades não podem ser consultadas no estágio '%1$s'; elas não estão disponíveis até o estágio '%2$s'.";
    }
    @Override
    protected String requiredCapabilityMissing1$str() {
        return "WFLYCTL0362: As funcionalidades exigidas pelo recurso '%1$s' não estão disponíveis:";
    }
    @Override
    protected String capabilityAlreadyRegisteredInContext2$str() {
        return "WFLYCTL0363: A funcionalidade '%1$s' já está registrada no contexto '%2$s'.";
    }
    @Override
    protected String unknownCapability$str() {
        return "WFLYCTL0364: A funcionalidade '%1$s' é desconhecida.";
    }
    @Override
    protected String unknownCapabilityInContext$str() {
        return "WFLYCTL0365: A funcionalidade '%1$s' é desconhecida no contexto '%2$s'.";
    }
    @Override
    protected String capabilityDoesNotExposeRuntimeAPI$str() {
        return "WFLYCTL0366: A funcionalidade '%1$s' não expõe uma API de tempo de execução.";
    }
    @Override
    protected String cannotRemoveRequiredCapability$str() {
        return "WFLYCTL0367: Não foi possível remover a funcionalidade '%1$s', pois ela é exigida por outras funcionalidades:";
    }
    @Override
    protected String cannotRemoveRequiredCapabilityInContext$str() {
        return "WFLYCTL0368: Não foi possível remover a funcionalidade '%1$s' do contexto '%2$s' pois ela é exigida por outras funcionalidades:";
    }
    @Override
    protected String requiredCapabilityMissing0$str() {
        return "WFLYCTL0369: As capacidades exigidas não estão disponíveis:";
    }
    @Override
    protected String requirementPointSimple$str() {
        return "a funcionalidade '%1$s' a exige para o endereço '%2$s'";
    }
    @Override
    protected String requirementPointFull$str() {
        return "a funcionalidade '%1$s' a exige para o atributo '%2$s' no endereço '%3$s'";
    }
    @Override
    protected String formattedCapabilityName$str() {
        return "%1$s";
    }
    @Override
    protected String formattedCapabilityId$str() {
        return "%1$s no contexto '%2$s'";
    }
    @Override
    protected String possibleCapabilityProviderPoints$str() {
        return "; Pontos de registro possíveis para esta funcionalidade: %1$s";
    }
    @Override
    protected String noKnownProviderPoints$str() {
        return "; Não há pontos de registro conhecidos que podem fornecer esta capacidade";
    }
    @Override
    protected String unsupportedUsageOfExpression$str() {
        return "Esta funcionalidade não solucionável provavelmente se deve ao uso de uma string de expressão em um atributo de configuração que não é compatível com expressões.";
    }
    @Override
    protected String incompleteExpression$str() {
        return "WFLYCTL0370: Expressão incompleta: %1$s";
    }
    @Override
    protected String unsupportedElement$str() {
        return "WFLYCTL0371: O elemento '%1$s' não é mais suportado; use '%2$s' como alternativa.";
    }
    @Override
    protected String duplicateElementsInList$str() {
        return "WFLYCTL0372: O atributo '%1$s' da lista contém duplicatas que não são permitidas";
    }
    @Override
    protected String deploymentResourceMustBeRuntimeOnly$str() {
        return "WFLYCTL0373: Recursos de implantação deverm ser somente runtime";
    }
    @Override
    protected String unableToResolveExpressions$str() {
        return "WFLYCTL0374: Não foi possível resolver expressões nesta localização.";
    }
    @Override
    protected String udpSyslogServerUnavailable$str() {
        return "WFLYCTL0375: A atualização do log de auditoria da operação de gerenciamento falhou no manipulador '%1$s' devido a '%2$s'. Certifique-se de que o servidor syslog está sendo executado e pode ser acessado";
    }
    @Override
    protected String unexpectedAttribute2$str() {
        return "WFLYCTL0376: Foi encontrado um atributo '%1$s' inesperado. Atributos válidos são: '%2$s'";
    }
    @Override
    protected String unexpectedElement2$str() {
        return "WFLYCTL0377: Foi encontrado elemento '%1$s' inesperado. Elementos válidos são: '%2$s'";
    }
    @Override
    protected String attributeIsWrongType$str() {
        return "WFLYCTL0378: O atributo '%1$s' não é do tipo '%2$s', mas sim do tipo '%3$s'";
    }
    @Override
    protected String managementUnavailableDuringBoot$str() {
        return "WFLYCTL0379: O boot do sistema está em andamento; a execução das operações de gerenciamento remoto não está disponível no momento";
    }
    @Override
    protected String requiredAttributeNotSet$str() {
        return "WFLYCTL0380: O atributo '%1$s' precisa ser determinado ou aprovado antes do atributo '%2$s' ser definido corretamente";
    }
    @Override
    protected String illegalPermissionName$str() {
        return "WFLYCTL0381: Nome de permissão '%1$s' ilegal";
    }
    @Override
    protected String illegalPermissionActions$str() {
        return "WFLYCTL0382: Ações de permissão '%1$s' ilegais";
    }
    @Override
    protected String noOperationDefined$str() {
        return "WFLYCTL0383: Nenhuma operação foi definida %1$s";
    }
    @Override
    protected String nonHostCapableSubsystemInHostModel$str() {
        return "WFLYCTL0385: Foi feita uma tentativa de registrar o subsistema competente não-host '%1$s' a partir do módulo de extensão '%2$s' no modelo do host.";
    }
    @Override
    protected String onlyAccessHostControllerInfoInRuntimeStage$str() {
        return "WFLYCTL0386: A informação do controlador do host pode ser acessada somente depois da etapa modelo na inicialização";
    }
    @Override
    protected String illegalCLIStylePathAddress$str() {
        return "WFLYCTL0387: Endereço de caminho ilegal '%1$s', não está em um formato CLI correto";
    }
    @Override
    protected String cannotCreateEmptyConfig$str() {
        return "WFLYCTL0388: Não foi possível criar um arquivo de configuração %1$s vazio";
    }
    @Override
    protected String rejectEmptyConfig$str() {
        return "WFLYCTL0389: Não foi possível criar uma configuração vazia no arquivo %1$s pois já existe uma configuração não vazia nele.";
    }
    @Override
    protected String couldNotResolveExpressionIndex$str() {
        return "WFLYCTL0391: Não foi possível resolver a expressão de atributo '%1$s', índice '%2$d' inválido";
    }
    @Override
    protected String couldNotResolveExpressionList$str() {
        return "WFLYCTL0392: Não foi possível resolver expressão de atributo: '%1$s', tipo não é uma lista";
    }
    @Override
    protected String couldNotResolveExpression$str() {
        return "WFLYCTL0393: Não foi possível resolver expressão de atributo '%1$s'";
    }
    @Override
    protected String invalidCapabilityServiceType$str() {
        return "WFLYCTL0394: A funcionalidade '%1$s' não fornece serviços do tipo '%2$s'";
    }
    @Override
    protected String operationDeprecated$str() {
        return "WFLYCTL0395: A operação %1$s do recurso no endereço %2$s é obsoleta e poderá ser removida em uma versão futura. Consulte o resultado da operação read-operation-description para saber mais sobre a substituição.";
    }
    @Override
    protected String discardedResourceTransformation$str() {
        return "WFLYCTL0396: Recurso %1$s é descartado no host de destino %2$s";
    }
    @Override
    protected String indexedChildResourceRegistrationNotAvailable$str() {
        return "WFLYCTL0397: Os recursos filhos indexados podem ser registrados somente se o recurso primário suportar filhos ordenados. O primário de '%1$s' não está indexado.";
    }
    @Override
    protected String orderedChildTypeRenamed$str() {
        return "WFLYCTL0398: Foi feita uma tentativa de renomear o recurso encontrado em %1$s para %2$s. Contudo, '%3$s' é um dos tipos de recursos definidos para serem ordenados no recurso pai %4$s";
    }
    @Override
    protected String inconsistentCapabilityContexts4$str() {
        return "WFLYCTL0399: A funcionalidade '%1$s' exigida pela funcionalidade '%2$s' no contexto '%3$s' está disponível em um ou mais grupos de vinculação de soquete. Porém, nem todas funcionalidades de vinculação de soquete exigidas por '%4$s' podem ser resolvidas a partir de um único grupo de vinculação de soquete, por isso, esta configuração é inválida.";
    }
    @Override
    protected String inconsistentCapabilityContexts5$str() {
        return "WFLYCTL0400: A funcionalidade '%1$s' no contexto '%2$s' associado ao recurso '%3$s' exige a funcionalidade '%4$s'. Ela está disponível em um ou mais grupos de vinculação de soquete, mas nem todas as funcionalidades de vinculação de soquetes exigidas por '%5$s' podem ser resolvidas a partir de um único grupo de vinculação de soquete, por isso, esta configuração é inválida.";
    }
    @Override
    protected String failedToBuildReport$str() {
        return "WFLYCTL0401: Não foi possível criar o relatório";
    }
    @Override
    protected String removeUnsupportedLegacyExtension$str() {
        return "WFLYCTL0402: Os subsistemas %1$s fornecidos pela extensão herdada '%2$s' não são compatíveis nos servidores em execução nesta versão. Ambos o subsistema e a extensão devem ser removidos ou migrados antes que o servidor comece a funcionar.";
    }
    @Override
    protected String unexpectedOperationExecutionException$str() {
        return "WFLYCTL0403: Falha inesperada durante a execução da(s) seguinte(s) operação(ões): %1$s";
    }
    @Override
    protected String unexpectedOperationExecutionFailureDescription$str() {
        return "WFLYCTL0404: Exceção inesperada durante a execução: %1$s";
    }
    @Override
    protected String couldNotFindTransformerRegistryFallingBack$str() {
        return "WFLYCTL0405: Não foi possível encontrar um transformador para %1$s, retornando a %2$s";
    }
    @Override
    protected String selectFailedCouldNotConvertAttributeToType$str() {
        return "WFLYCTL0406: Não foi possível converter o atributo '%1$s' em %2$s";
    }
    @Override
    protected String failedSendingCompletedResponse$str() {
        return "WFLYCTL0407: Falha ao enviar resposta de conclusão %1$s para %2$d";
    }
    @Override
    protected String failedSendingFailedResponse$str() {
        return "WFLYCTL0408: Falha ao enviar resposta de falha %1$s para %2$d";
    }
    @Override
    protected String proxiedOperationTimedOut$str() {
        return "WFLYCTL0409: A execução da operação '%1$s' no processo remoto no endereço '%2$s' excedeu o tempo limite após %3$d ms enquanto aguardava resposta inicial; o processo remoto foi notificado para encerrar a operação";
    }
    @Override
    protected String timeoutAwaitingFinalResponse$str() {
        return "WFLYCTL0410: A execução da operação '%1$s' no processo remoto no endereço '%2$s' excedeu o tempo limite após %3$d ms enquanto aguardava resposta final; o processo remoto foi notificado para encerrar a operação";
    }
    @Override
    protected String failedToParseElementLenient$str() {
        return "WFLYCTL0411: Falha ao analisar o elemento '%1$s', ignorando...";
    }
    @Override
    protected String missingRequiredServices$str() {
        return "WFLYCTL0412: Serviços necessários que não estão instalados:";
    }
    @Override
    protected String deprecatedAndCurrentParameterMismatch$str() {
        return "WFLYCTL0413: O parâmetro obsoleto %1$s foi definido além do parâmetro atual %2$s, mas com valores diferentes.";
    }
    @Override
    protected String couldNotCreateHistoricalBackup$str() {
        return "WFLYCTL0414: Não foi possível criar um backup com carimbo de data e hora do diretório de histórico atual %1$s, por isso, ele ainda pode incluir versões da inicialização anterior.";
    }
    @Override
    protected String runtimeModificationBegun$str() {
        return "WFLYCTL0415: A modificação do contêiner de serviço de runtime por uma operação de gerenciamento começou.";
    }
    @Override
    protected String runtimeModificationComplete$str() {
        return "WFLYCTL0416: A modificação do contêiner de serviço de runtime por uma operação de gerenciamento está completa.";
    }
    @Override
    protected String cannotAddMoreThanOneJvmForServerOrHost$str() {
        return "WFLYCTL0417: Não foi possível adicionar mais de uma jvm. Ocorreu uma tentativa de adição de '%1$s', mas '%2$s' já existe";
    }
    @Override
    protected String socketBindingalreadyDeclared$str() {
        return "WFLYCTL0418: Um %1$s ou %2$s %3$s já declarado foi declarado em %4$s %5$s";
    }
    @Override
    protected String invalidMaxBytesLength$str() {
        return "WFLYCTL0419: '%1$s' é um valor inválido para o parâmetro %2$s. Os valores devem ter, no máximo, %3$d bytes";
    }
    @Override
    protected String invalidMinBytesLength$str() {
        return "WFLYCTL0420: '%1$s' é um valor inválido para parâmetro %2$s. Os valores devem ter, no mínimo, %3$d bytes";
    }
    @Override
    protected String explodedDeploymentNotSupported$str() {
        return "WFLYCTL0421: Implementação expandida não é suportada por alguns servidores";
    }
    @Override
    protected String couldNotLoadModuleForTransformers$str() {
        return "WFLYCTL0422: Não foi possível carregar o módulo '%1$s' para transformadores";
    }
    @Override
    protected String wrongMaskedPasswordFormat$str() {
        return "WFLYCTL0423: Comando de senha mascarada com formato errado.%nUso: MASK-<encoded secret>;<salt>;<iteration count> onde <salt>=caracteres UTF-8, <iteration count>=número inteiro de tamanho razoável";
    }
    @Override
    protected String invalidAddressFormat$str() {
        return "WFLYCTL0433: '%1$s' não é uma representação válida de um endereço de recurso";
    }
    @Override
    protected String bootComplete$str() {
        return "WFLYCTL0434: Inicialização concluída";
    }
    @Override
    protected String attributeWasNotMarkedAsReloadRequired$str() {
        return "WFLYCTL0435: O atributo %1$s do recurso %2$s não foi marcado como precisando ser recarregado. Defina o sinalizador RESTART_ALL_SERVICES ou registre um manipulador de gravação personalizado.";
    }
    @Override
    protected String typeConversionError$str() {
        return "Não foi possível converter %1$s para %2$s";
    }
    @Override
    protected String capabilityAlreadyRegisteredInContext4$str() {
        return "WFLYCTL0436: Não foi possível registrar a funcionalidade '%1$s' no local '%2$s' porque ela já está registrada no contexto '%3$s' no(s) local(ais) '%4$s'";
    }
    @Override
    protected String duplicateExtensionElement$str() {
        return "WFLYCTL0437: Extensão duplicada: um elemento %1$s com valor de atributo %2$s '%3$s' já foi analisado";
    }
    @Override
    protected String couldntConvertWarningLevel$str() {
        return "WFLYCTL0438: Não foi possível converter '%1$s' em um nível de aviso apropriado, o limite voltou para 'ALL'. Valores possíveis: SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST, ALL, OFF";
    }
    @Override
    protected String invalidSubnetFormat$str() {
        return "WFLYCTL0439: O valor %1$s para o atributo %2$s não é um formato de sub-rede válido";
    }
    @Override
    protected String cannotDeleteFileOrDirectory$str() {
        return "WFLYCTL0440: Não foi possível excluir o arquivo ou diretório %1$s";
    }
    @Override
    protected String serviceStatusReportFailureHeader$str() {
        return "WFLYCTL0441: A operação resultou em serviços com falha ou ausentes %n";
    }
    @Override
    protected String errorStoppingServer$str() {
        return "WFLYCTL0442: Erro ao interromper servidor";
    }
    @Override
    protected String errorObtainingPassword$str() {
        return "WFLYCTL0443: Erro ao obter a senha do fornecedor %1$s";
    }
    @Override
    protected String invalidRuntimeStageForProfile$str() {
        return "WFLYCTL0444: O manipulador para operação '%1$s' no endereço '%2$s' tentou adicionar uma etapa %3$s. Isso não é válido para um recurso 'profile' no tipo de processo %4$s, por isso, esta etapa não será executada.";
    }
    @Override
    protected String alreadyDefinedAttribute$str() {
        return "WFLYCTL0445: %1$s com valor '%2$s' no atributo %3$s já está definido";
    }
    @Override
    protected String requiredWithAlternatives$str() {
        return "WFLYCTL0446: %1$s ou %2$s alternativo(s) são obrigatórios";
    }
    @Override
    protected String attributeExpressionDeprecated$str() {
        return "WFLYCTL0447: O atributo '%1$s' do recurso no endereço '%2$s' foi configurado com uma expressão, mas é possível que o uso de expressões no valor desse atributo não seja mais compatível em versões futuras. Esse atributo configura se uma funcionalidade que pode ser exigida por outras partes da configuração está presente ou configura um requisito para uma funcionalidade fornecida por outra parte da configuração. Não é possível dar um suporte completo a esse tipo de configuração quando uma expressão é usada.";
    }
    @Override
    protected String servicesWithTransitiveUnavailability$str() {
        return "WFLYCTL0448: %1$s serviços adicionais estão inativos devido a ausência ou falha das suas dependências";
    }
    @Override
    protected String operationDeprecatedMessage$str() {
        return "WFLYCTL0449: A operação %1$s do recurso no endereço %2$s é obsoleta e poderá ser removida em uma versão futura. Consulte o resultado da operação read-operation-description para saber mais sobre a substituição.";
    }
    @Override
    protected String failedToCloneRepository$str() {
        return "WFLYCTL0450: Falha ao clonar o repositório %1$s";
    }
    @Override
    protected String failedToPublishConfiguration$str() {
        return "WFLYCTL0451: Falha ao publicar configuração para %1$s em função de %2$s";
    }
    @Override
    protected String failedToPersistConfiguration$str() {
        return "WFLYCTL0452: Falha ao persistir configuração para %1$s em função de %2$s";
    }
    @Override
    protected String failedToDeleteConfigurationSnapshot$str() {
        return "WFLYCTL0453: Falha ao excluir o snapshot de configuração %1$s";
    }
    @Override
    protected String failedToListConfigurationSnapshot$str() {
        return "WFLYCTL0454: Falha ao listar os snapshots de configuração %1$s";
    }
    @Override
    protected String snapshotAlreadyExistError$str() {
        return "WFLYCTL0455: Não é possível tirar o snapshot %1$s porque ele já existe";
    }
    @Override
    protected String systemPropertyAlreadyExist$str() {
        return "WFLYCTL0456: A propriedade do sistema \"%1$s\" já está definida na seção do arquivo de configuração. O valor definido na linha de comando será substituído por esse valor.";
    }
    @Override
    protected String invalidHeaderName$str() {
        return "WFLYCTL0457: Nome de cabeçalho HTTP '%1$s' inválido";
    }
    @Override
    protected String disallowedHeaderName$str() {
        return "WFLYCTL0458: Nome de cabeçalho HTTP '%1$s' não permitido";
    }
    @Override
    protected String missingManagementServices$str() {
        return "WFLYCTL0459: Acionando reversão devido à falta de serviços de gerenciamento.";
    }
    @Override
    protected String propertyCanOnlyBeUsedWithStandaloneOrEmbeddedServer$str() {
        return "WFLYCTL0460: A propriedade do sistema'%1$s' só pode ser usada com um servidor autônomo ou integrado";
    }
    @Override
    protected String propertyCanOnlyBeUsedWithAdminOnlyModeServer$str() {
        return "WFLYCTL0461: A propriedade do sistema'%1$s' só pode ser usada com um servidor somente administrado";
    }
    @Override
    protected String couldNotFindDirectorySpecifiedByProperty$str() {
        return "WFLYCTL0462: Não foi possível encontrar o diretório '%1$s' especificado pela propriedade do sistema '%2$s'. Por favor, certifique-se de que ele existe.";
    }
    @Override
    protected String cliScriptPropertyDefinedWithoutMarkerDirectoryWhenNotSkippingReload$str() {
        return "WFLYCTL0464: Se usar %1$s=true, quando você usar -D%2$s, precisará precisa definir -D%3$s";
    }
    @Override
    protected String initialisedAdditionalBootCliScriptSystemKeepingAlive$str() {
        return "WFLYCTL0465: A funcionalidade adicional do script CLI de inicialização foi iniciada. Os comandos da CLI serão lidos a partir de %1$s. O servidor permanecerá em execução no modo somente administrador após que os comandos tiverem sido executados, e o resultado das operações do CLI será gravado em %2$s";
    }
    @Override
    protected String initialisedAdditionalBootCliScriptSystemNotKeepingAlive$str() {
        return "WFLYCTL0466: A funcionalidade adicional do script CLI de inicialização foi iniciada. Os comandos CLI serão lidos a partir de %1$s. O servidor será reinicializado no modo normal depois que os comandos tiverem sido executados";
    }
    @Override
    protected String executingBootCliScript$str() {
        return "WFLYCTL0467: Executando os comandos adicionais do script CLI no servidor %1$s que está em execução no modo somente admin";
    }
    @Override
    protected String completedRunningBootCliScript$str() {
        return "WFLYCTL0468: A execução dos comandos do script CLI foi concluída";
    }
    @Override
    protected String restartingServerAfterBootCliScript$str() {
        return "WFLYCTL0469: Reiniciando o servidor porque os comandos adicionais do script CLI exigem reinicialização. Isso registrará que a reinicialização foi iniciada no arquivo marcador %1$s, uma vez que o mecanismo de reinicialização preservará todas as propriedades pertencentes à funcionalidade adicional do script CLI de inicialização (%2$s, %3$s, %4$s). A reinicialização mantém o modo de execução somente administrativo, portanto, ocorrerá um recarga.";
    }
    @Override
    protected String reloadingServerToNormalModeAfterAdditionalBootCliScript$str() {
        return "WFLYCTL0470: Recarregando o servidor para o modo normal após a execução dos comandos adicionais a partir do script CLI. Isso limpará as propriedades que acionam a funcionalidade adicional do script CLI, caso elas tenham sido definidas (%1$s, %2$s, %3$s), e excluirá o arquivo marcador indicando que o servidor foi reiniciado.";
    }
    @Override
    protected String reloadingServerToNormalModeAfterRestartAfterAdditionalBootCliScript$str() {
        return "WFLYCTL0471: Recarregando o servidor para o modo normal após a inicialização após a execução dos comandos adicionais a partir do script CLI. Isso limpará as propriedades que acionam a funcionalidade adicional do script CLI, caso elas tenham sido definidas (%1$s, %2$s, %3$s)";
    }
    @Override
    protected String checkingForPresenceOfRestartMarkerFile$str() {
        return "WFLYCTL0472: Verificação da presença de arquivo marcador indicando que o servidor foi reiniciado após a execução dos comandos adicionais do script CLI.";
    }
    @Override
    protected String foundRestartMarkerFile$str() {
        return "WFLYCTL0473: Arquivo marcador indicando que o servidor foi reiniciado após a execução dos comandos adicionais do script CLI encontrado em %1$s.";
    }
    @Override
    protected String noRestartMarkerFile$str() {
        return "WFLYCTL0474: Nenhum arquivo marcador encontrado indicando que o servidor foi reiniciado após a execução dos comandos adicionais do script CLI.";
    }
    @Override
    protected String invalidAttributeValue1$str() {
        return "WFLYCTL0475: O valor para o atributo '%1$s' é inválido.";
    }
    @Override
    protected String invalidCredentialReferenceValue$str() {
        return "WFLYCTL0476: O valor para o atributo '%1$s' é inválido: '%2$s' deve ser especificado por si só ou '%3$s' precisa ser especificado com pelo menos um dos seguintes: '%4$s' ou '%5$s'";
    }
    @Override
    protected String invalidParameterName$str() {
        return "WFLYCTL0477: O nome do parâmetro '%1$s' é inválido.";
    }
    @Override
    protected String unableToBuildCommandCredentialSource$str() {
        return "WFLYCTL0478: Não é possível criar CredentialSource baseado em comando para referência de credenciais.";
    }
    @Override
    protected String attributeUnresolvableUsingSimpleResolution$str() {
        return "WFLYCTL0479: O atributo '%1$s' no recurso '%2$s' com valor não resolvido '%3$s' não pode ser resolvido usando as fontes de resolução não sensíveis à segurança suportada pelo parâmetro 'resolve'. A resposta informará o valor não resolvido.";
    }
    @Override
    protected String expressionUnresolvableUsingSimpleResolution$str() {
        return "WFLYCTL0480: A expressão “%1$s” não pode ser resolvida usando as fontes de resolução não sensíveis à segurança compatível com a operação “%2$s”. A resposta relatará o valor não resolvido.";
    }
    @Override
    protected String runtimePackageDependencyAlreadyRegistered$str() {
        return "WFLYCTL0481: O pacote de dependência de tempo de execução “%1$s” já está registrado no local “%2$s”";
    }
    @Override
    protected String illegalCharsetName$str() {
        return "WFLYCTL0482: O valor “%1$s” não é um nome de conjunto de caracteres legal";
    }
    @Override
    protected String unsupportedCharset$str() {
        return "WFLYCTL0483: O conjunto de caracteres “%1$s” não é compatível com esse caso da máquina virtual Java";
    }
    @Override
    protected String invalidAttributeDefinition$str() {
        return "WFLYCTL0484: A definição do atributo “%1$s” é nula";
    }
    @Override
    protected String failedToParseYamlConfigurationFile$str() {
        return "WFLYCTL0485: Erro ao analisar arquivo yaml %1$s";
    }
    @Override
    protected String missingYamlFile$str() {
        return "WFLYCTL0486: Arquivo yaml ausente %1$s";
    }
    @Override
    protected String loadingYamlFiles$str() {
        return "WFLYCTL0487: Foram necessários %1$s ms para carregar e analisar os seguintes arquivos yaml [%2$s]";
    }
    @Override
    protected String noResourceRegistered1$str() {
        return "WFLYCTL0488: Nenhum registro encontrado para o endereço %1$s - Ignorando a sub-árvore";
    }
    @Override
    protected String noResourceForUndefiningAttribute$str() {
        return "WFLYCTL0489: Não é possível indefinir o atributo %1$s já que não há recurso em %2$s";
    }
    @Override
    protected String noAttributeSetForAddress$str() {
        return "WFLYCTL0490: Um recurso YAML foi definido para o endereço%1$s sem nenhum atributo. Nenhuma ação será tomada.";
    }
    @Override
    protected String unexpectedValueForResource$str() {
        return "WFLYCTL0491: Temos um valor inesperado %1$s para o endereço %2$s e o nome %3$s";
    }
    @Override
    protected String noResourceRegistered2$str() {
        return "WFLYCTL0492: Não foi possível encontrar um registro de recurso para o endereço %1$s com o registro atual %2$s";
    }
    @Override
    protected String missingListAttributeValueType$str() {
        return "WFLYCTL0493: O atributo %1$s não tem um valueType devidamente definido.";
    }
    @Override
    protected String resolverExtensionExpressionsNotAllowed$str() {
        return "WFLYCTL0494: A resolução de expressão de extensão '%1$s' não é permitida neste momento.";
    }
    @Override
    protected String adminOnlyPolicyDeprecatedValue$str() {
        return "WFLYCTL0495: \"fetch-from-master\" é um valor depreciado para \"domain-controller.remote.admin-only-policy\", \"fetch-from-domain-controller\" será usado em seu lugar.";
    }
    @Override
    protected String threadDumpException$str() {
        return "WFLYCTL0498: Exceção lançada durante a geração do descarte de thread";
    }
    @Override
    protected String errorConstructingYAMLMapping$str() {
        return "Durante a construção de um mapeamento, %1$s esperava um mapeamento para a fusão, mas encontrou %2$s";
    }
    @Override
    protected String argYaml$str() {
        return "Os arquivos de configuração yaml para personalizar a configuração. Os caminhos podem ser absolutos, relativos ao diretório de execução atual ou relativos ao diretório de configuração autônomo.";
    }
    @Override
    protected String noSatisfactoryCapability$str() {
        return "WFLYCTL0499: Não há capacidade satisfatória '%1$s' disponível para recursos com escopo de capacidade '%2$s'. Essa capacidade está registrada no(s) endereço(s) '%3$s' e não está acessível aos recursos com escopo '%4$s'.";
    }
    @Override
    protected String uuidIsEmpty$str() {
        return "WFLYCTL0500: Não há nenhuma string UUID em '%1$s'. Um novo valor será gerado.";
    }
    @Override
    protected String uuidNotValid$str() {
        return "WFLYCTL0501: Uma string UUID inválida '%1$s' foi encontrada em '%2$s'. Um novo valor será gerado.";
    }
    @Override
    protected String noChildResource$str() {
        return "WFLYCTL0502: Nenhum recurso filho chamado '%1$s' encontrado no endereço '%2$s'.";
    }
    @Override
    protected String failedToPublishConfigurationInvalidRemote$str() {
        return "WFLYCTL0503: Falha ao publicar a configuração, pois o nome remoto %1$s não é válido.";
    }
    @Override
    protected String missingOperationForResource$str() {
        return "WFLYCTL0504: A operação %1$s não está definido para recurso %2$s.";
    }
    @Override
    protected String unstableSubsystemNamespace$str() {
        return "WFLYCTL0505: O namespace do subsistema %1$s %2$s não é habilitado pelo nível de estabilidade atual";
    }
    @Override
    protected String unstableExtension$str() {
        return "WFLYCTL0506: A extensão %1$s do módulo %2$s não é habilitada pelo nível de estabilidade atual";
    }
    @Override
    protected String unsupportedDeployment$str() {
        return "WFLYCTL0507: Arquivo yaml de implantação não compatível %1$s com atributos %2$s";
    }
    @Override
    protected String ignoreYamlElement$str() {
        return "WFLYCTL0508: O elemento yaml '%1$s' e seus subelementos são ignorados.";
    }
    @Override
    protected String ignoreYamlSubElement$str() {
        return "Ignorando assim o elemento '%1$s'.";
    }
    @Override
    protected String noAttributeDefined$str() {
        return "WFLYCTL0509: Nenhum atributo chamado '%1$s' definido no endereço '%2$s'.";
    }
    @Override
    protected String illegalOperationForAttribute$str() {
        return "WFLYCTL0510: Nenhuma operação%1$s pode ser executado para o atributo chamado '%2$s' definido no endereço '%3$s'.";
    }
    @Override
    protected String noAttributeValueDefined$str() {
        return "WFLYCTL0511: Nenhum valor definido para o atributo '%1$s' no endereço '%2$s'.";
    }
    @Override
    protected String removingUnexistingResource$str() {
        return "WFLYCTL0512: Não existe nenhum recurso no endereço '%1$s'. Ignorando a operação de remoção.";
    }
    @Override
    protected String unsupportedNamespace$str() {
        return "WFLYCTL0513: O namespace XML de%1$s não é mais compatível.";
    }
    @Override
    protected String unstableManagementNamespace$str() {
        return "WFLYCTL0514: O namespace de gerenciamento %1$s não é habilitado pelo nível de estabilidade atual";
    }
    @Override
    protected String systemPropertyDeprecated$str() {
        return "WFLYCTL0515: A propriedade do sistema '%1$s' está obsoleta e pode ser removida em uma versão futura. O atributo '%2$s' no recurso '%3$s' deve ser usado no lugar.";
    }
    @Override
    protected String invalidModuleNameParameter$str() {
        return "WFLYCTL0516: O parâmetro %1$s especifica um nome de módulo inválido: %2$s";
    }
    @Override
    protected String multipleParallelBootOperation$str() {
        return "WFLYCTL0517: Há várias operações de inicialização paralelas.";
    }
}
