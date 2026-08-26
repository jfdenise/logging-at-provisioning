package org.jboss.as.process.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:46+0200")
public class ProcessLogger_$logger_pt_BR extends ProcessLogger_$logger_pt implements ProcessLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ProcessLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String argHelp$str() {
        return "Display esta mensagem e sai";
    }
    @Override
    protected String nullCommandComponent$str() {
        return "WFLYPC0031: O comando contém um componente nulo";
    }
    @Override
    protected String invalidByteToken$str() {
        return "WFLYPC0049: Token de byte inválido. Espera-se '%1$s', foi recebido '%2$s'";
    }
    @Override
    protected String argBackup$str() {
        return "Mantenha uma cópia da configuração persistente do domínio mesmo que esse host não seja um controlador de domínio. Se ignore-unused-configuration não estiver definido em host.xml, então a configuração completa do domínio será armazenada. Caso contrário, o valor configurado de ignore-unused-configuration será usado.";
    }
    @Override
    protected String streamProcessingFailed$str() {
        return "WFLYPC0020: Falha ao processar o fluxo para o processo '%1$s': %2$s";
    }
    @Override
    protected String failedToHandleSocketFinished$str() {
        return "WFLYPC0041: Falha ao manusear a condição do socket encerrado";
    }
    @Override
    protected String startingProcess$str() {
        return "WFLYPC0018: Iniciando processo '%1$s'";
    }
    @Override
    protected String argHostConfig$str() {
        return "O nome do arquivo de configuração do host para uso (o default é \"host.xml\")";
    }
    @Override
    protected String waitingToRestart$str() {
        return "WFLYPC0021: Aguardando %1$d segundos até tentar reiniciar o processo %2$s.";
    }
    @Override
    protected String readBytes$str() {
        return "WFLYPC0056: Leitura de %1$d bytes.";
    }
    @Override
    protected String attemptToReconnectNonExistentProcess$str() {
        return "WFLYPC0001: Houve uma tentativa de reconexão do processo não existente '%1$s'";
    }
    @Override
    protected String jpsCommandNotFound$str() {
        return "WFLYPC0064: Não é possível localizar o processo '%1$s' -- não foi possível encontrar o comando 'jps'";
    }
    @Override
    protected String argStability$str() {
        return "Executa o servidor usando um nível de estabilidade específico. Valores possíveis: %1$s, Padrão = %2$s";
    }
    @Override
    protected String writesAlreadyShutdown$str() {
        return "WFLYPC0062: As gravações já foram encerradas";
    }
    @Override
    protected String invalidOption$str() {
        return "WFLYPC0030: Opção inválida: %1$s";
    }
    @Override
    protected String failedToCreateServerThread$str() {
        return "WFLYPC0045: Falha ao criar o thread do servidor";
    }
    @Override
    protected String writeChannelClosed$str() {
        return "WFLYPC0061: Canal de gravação encerrado";
    }
    @Override
    protected String stoppingProcess$str() {
        return "WFLYPC0019: Interrompendo processo '%1$s'";
    }
    @Override
    protected String failedToStartProcess$str() {
        return "WFLYPC0009: Falha ao iniciar o processo '%1$s'";
    }
    @Override
    protected String failedToSendAuthKey$str() {
        return "WFLYPC0006: Falha ao enviar a chave de autenticação ao processo '%1$s': %2$s";
    }
    @Override
    protected String attemptToStartNonExistentProcess$str() {
        return "WFLYPC0003: Houve uma tentativa de inicialização do processo não existente '%1$s'";
    }
    @Override
    protected String receivedUnknownCredentials$str() {
        return "WFLYPC0014: Conexão recebida com credenciais desconhecidas a partir do %1$s";
    }
    @Override
    protected String argInterfaceBindAddress$str() {
        return "Determinar o jboss.bind.address.<interface> da propriedade do sistema para valor gerado";
    }
    @Override
    protected String failedToSendDataBytes$str() {
        return "WFLYPC0007: Falha ao enviar os bytes de dados para o fluxo de entrada do processo '%1$s'";
    }
    @Override
    protected String receivedInvalidVersion$str() {
        return "WFLYPC0012: A conexão recebida com a versão inválida de %1$s";
    }
    @Override
    protected String failedToKillProcess$str() {
        return "WFLYPC0022: Falha ao encerrar o processo '%1$s', tentando eliminar o processo.";
    }
    @Override
    protected String failedToCloseServerSocket$str() {
        return "WFLYPC0035: Falha ao encerrar o soquete do servidor %1$s";
    }
    @Override
    protected String failedToSendReconnect$str() {
        return "WFLYPC0008: Falha ao enviar a mensagem de reconexão o fluxo de entrada do processo '%1$s'";
    }
    @Override
    protected String invalidStartChunk$str() {
        return "WFLYPC0051: Início de parte inicial inválido [%1$s]";
    }
    @Override
    protected String argPcPort$str() {
        return "A porta pela qual o controlador do processo escuta pela comunicação pela qual processa seus controles";
    }
    @Override
    protected String destroyingProcess$str() {
        return "WFLYPC0067: O processo '%1$s' não concluiu a parada normal em %2$d ms; tentando encerrar o processo usando java.lang.Process.destroyForcibly()";
    }
    @Override
    protected String attemptToRemoveNonExistentProcess$str() {
        return "WFLYPC0002: Houve uma tentativa de remoção do processo não existente '%1$s'";
    }
    @Override
    protected String receivedUnknownMessageCode$str() {
        return "WFLYPC0015: Mensagem desconhecida recebida com o código 0x%1$02x";
    }
    @Override
    protected String invalidLength$str() {
        return "WFLYPC0029: O comprimento %1$s é inválido";
    }
    @Override
    protected String failedToAcceptConnection$str() {
        return "WFLYPC0033: Falha ao aceitar a conexão";
    }
    @Override
    protected String argAdminOnly$str() {
        return "Determine o tipo de execução do controlador de hosts como ADMIN_ONLY, levando-o a abrir interfaces administrativas e aceitar solicitações de gerenciamento. No entanto, ele não inicia servidores ou, caso o controlador de hosts seja o principal do domínio, não aceita conexões de entrada a partir dos controladores de hosts secundários.";
    }
    @Override
    protected String argReadOnlyDomainConfig$str() {
        return "O nome do arquivo de configuração do domain para uso. Isto difere-se do '--domain-config', '-c' e '-domain-config' no arquivo inicial nunca é sobrescrito.";
    }
    @Override
    protected String invalidAuthKeyLen$str() {
        return "WFLYPC0025: Chave de autenticação deve ter 24 bytes de comprimento";
    }
    @Override
    protected String processFinished$str() {
        return "WFLYPC0011: Processo '%1$s' encerrado com o status de saída de %2$d";
    }
    @Override
    protected String failedToHandleIncomingConnection$str() {
        return "WFLYPC0039: Falha ao manusear a conexão de entrada";
    }
    @Override
    protected String multipleProcessesFound$str() {
        return "WFLYPC0066: Vários processos identificáveis como '%1$s' foram encontrados; não é possível executar com segurança o encerramento no nível do sistema operacional";
    }
    @Override
    protected String shuttingDown$str() {
        return "WFLYPC0017: Encerrando o controlador do processo";
    }
    @Override
    protected String noArgValue$str() {
        return "WFLYPC0023: Nenhum valor foi fornecido para o argumento %1$s";
    }
    @Override
    protected String leakedMessageOutputStream$str() {
        return "WFLYPC0044: Conectado ao fluxo do resultado da memória; limpando";
    }
    @Override
    protected String argDefaultMulticastAddress$str() {
        return "Determina o jboss.default.multicast.address da propriedade do sistema ao valor gerado";
    }
    @Override
    protected String attemptingToKillProcess$str() {
        return "WFLYPC0063: O processo '%1$s' não concluiu a parada normal em %2$d ms; tentando encerrar o processo usando chamadas do sistema operacional";
    }
    @Override
    protected String argShortDomainConfig$str() {
        return "O nome do arquivo de configuração do domain para uso (o default é \"domain.xml\") (O mesmo ao --domain-config)";
    }
    @Override
    protected String argPublicBindAddress$str() {
        return "Determina o jboss.bind.address da propriedade do sistema ao valor gerado";
    }
    @Override
    protected String streamClosed$str() {
        return "WFLYPC0058: Fluxo encerrado";
    }
    @Override
    protected String argReadOnlyHostConfig$str() {
        return "O nome do arquivo de configuração do host para uso. Isto difere-se do '--host-config' no sentido que o arquivo inicial nunca é sobrescrito.";
    }
    @Override
    protected String argMasterPort$str() {
        return "Define o jboss.domain.master.port da propriedade de sistema como o valor gerado. Em uma configuração do controlador de hosts secundário padrão, isso é usado para a configuração da porta usada para a comunicação de gerenciamento nativa pelo controlador de hosts principal.";
    }
    @Override
    protected String failedToHandleSocketFailure$str() {
        return "WFLYPC0040: Falha ao manusear a condição de falha do socket";
    }
    @Override
    protected String unexpectedEndOfStream$str() {
        return "WFLYPC0060: Final inesperado do fluxo";
    }
    @Override
    protected String failedToCloseSocket$str() {
        return "WFLYPC0036: Falha ao encerrar o socket";
    }
    @Override
    protected String duplicateProcessName$str() {
        return "WFLYPC0005: Houve uma tentativa de registrar o processo duplicado chamado '%1$s'";
    }
    @Override
    protected String argPcAddress$str() {
        return "Endereço pelo qual o controlador do processo escura pela comunicação a partir dos processos em que controla";
    }
    @Override
    protected String threadCreationRefused$str() {
        return "WFLYPC0059: A criação do thread foi recusada";
    }
    @Override
    protected String argSecMgr$str() {
        return "Executa o servidor com o gerenciador de segurança instalado.";
    }
    @Override
    protected String failedToReadObject$str() {
        return "WFLYPC0046: Falha ao ler o objeto";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYPC0034: Falha ao encerrar o recurso %1$s";
    }
    @Override
    protected String argProperties$str() {
        return "Carrega as propriedades a partir do url gerado";
    }
    @Override
    protected String argSystem$str() {
        return "Determina a propriedade do sistema";
    }
    @Override
    protected String argVersion$str() {
        return "Imprime a versão e encerra";
    }
    @Override
    protected String shutdownComplete$str() {
        return "WFLYPC0016: Todos os processos encerrados: encerrando";
    }
    @Override
    protected String failedToHandleSocketShutdown$str() {
        return "WFLYPC0042: Falha ao manusear a condição de encerramento do socket";
    }
    @Override
    protected String receivedUnknownGreetingCode$str() {
        return "WFLYPC0013: Recebimento do código de saudação não-reconhecível 0x%1$02x a partir de %2$s";
    }
    @Override
    protected String argDomainConfig$str() {
        return "O nome do arquivo da configuração do domain para uso (o default é \"domain.xml\") (O mesmo ao -c)";
    }
    @Override
    protected String invalidByte2$str() {
        return "WFLYPC0048: Bite inválido:%1$s(%2$d)";
    }
    @Override
    protected String argInterProcessHcPort$str() {
        return "A porta pela qual o controlador do processo deve escutar pela comunicação a partir do controlador do processo";
    }
    @Override
    protected String processNotFound$str() {
        return "WFLYPC0065: Não foi possível encontrar nenhum processo identificável como '%1$s'";
    }
    @Override
    protected String argCachedDc$str() {
        return "Caso esse host não seja um controlador de domínio e não possa entrar em contato com o controlador de domínio na inicialização, uma cópia com cache local da configuração do domínio será usada para inicialização (se estiver disponível, consulte --backup). O controlador de domínio é sondado em segundo plano até se tornar disponível. Observe que começar um host com --cached-dc quando o controlador de domínio estiver disponível armazenará em cache uma cópia da configuração do domínio mesmo que --backup não seja usado.";
    }
    @Override
    protected String attemptToStopNonExistentProcess$str() {
        return "WFLYPC0004: Houve uma tentativa de interrupção do processo não existente '%1$s'";
    }
    @Override
    protected String failedToWriteMessage$str() {
        return "WFLYPC0010: Falha ao gravar a mensagem %1$s na conexão: %2$s";
    }
    @Override
    protected String failedToReadMessage$str() {
        return "WFLYPC0043: Falha ao ler a mensagem";
    }
    @Override
    protected String argUsage$str() {
        return "Uso: %1$s [args...]%nonde argumentos incluem:";
    }
    @Override
    protected String argMasterAddress$str() {
        return "Define o jboss.domain.master.address da propriedade do sistema como um valor gerado. Em uma configuração de controlador de hosts secundário padrão, isso é usado para configurar o endereço do controlador de hosts principal.";
    }
    @Override
    protected String invalidCommandByte$str() {
        return "WFLYPC0050: Leitura de byte de comando inválida: %1$s";
    }
    @Override
    protected String argInterProcessHcAddress$str() {
        return "Endereço pelo qual o controlador do host deve escutar pela comunicação a partir do controlador do processo";
    }
    @Override
    protected String invalidByte0$str() {
        return "WFLYPC0047: Bite inválido";
    }
}
