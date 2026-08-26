package org.jboss.as.protocol.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:25:58+0200")
public class ProtocolLogger_$logger_pt_BR extends ProtocolLogger_$logger_pt implements ProtocolLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public ProtocolLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String errorClosingChannel$str() {
        return "WFLYPRT0001: Erro encontrado ao encerrar o canal %1$s";
    }
    @Override
    protected String failedToCloseResource$str() {
        return "WFLYPRT0003: Falha ao encerrar o recurso %1$s";
    }
    @Override
    protected String failedToCloseServerSocket$str() {
        return "WFLYPRT0004: Falha ao encerrar o soquete do servidor %1$s";
    }
    @Override
    protected String noSuchRequest$str() {
        return "WFLYPRT0018: Nenhuma solicitação (%1$d) associada ao canal %2$s";
    }
    @Override
    protected String couldNotConnect$str() {
        return "WFLYPRT0023: Não foi possível conectar-se ao %1$s. A conexão entrou atingiu o tempo limite";
    }
    @Override
    protected String invalidByteToken$str() {
        return "WFLYPRT0030: Token de byte inválido. Espera-se '%1$d', foi recebido '%2$d'";
    }
    @Override
    protected String invalidSignature$str() {
        return "WFLYPRT0032: Assinatura inválida [%1$s]";
    }
    @Override
    protected String invalidType1$str() {
        return "WFLYPRT0034: Tipo inválido: %1$s";
    }
    @Override
    protected String invalidType3$str() {
        return "WFLYPRT0035: O tipo não é %1$s nem %2$s: %3$s";
    }
    @Override
    protected String operationIdAlreadyExists$str() {
        return "WFLYPRT0051: A operação com ID %1$d já está registrada";
    }
    @Override
    protected String nullExecutor$str() {
        return "WFLYPRT0052: Executor nulo";
    }
    @Override
    protected String failedToConnect$str() {
        return "WFLYPRT0053: Não foi possível conectar-se a %1$s. A conexão falhou";
    }
    @Override
    protected String channelClosed$str() {
        return "WFLYPRT0054: Canal encerrado";
    }
    @Override
    protected String noSuchResponseHandler$str() {
        return "WFLYPRT0055: nenhum manipulador registrado para o tipo de solicitação '%1$s'.";
    }
    @Override
    protected String responseHandlerNotFound$str() {
        return "WFLYPRT0056: Nenhum manipulador de resposta para a solicitação %1$s";
    }
    @Override
    protected String cancelledAsyncTask$str() {
        return "WFLYPRT0057: Tarefa %1$s cancelada pela interrupção do thread %2$s";
    }
    @Override
    protected String cancelledAsyncTaskBeforeRun$str() {
        return "WFLYPRT0058: Tarefa %1$s cancelada antes de a execução iniciar";
    }
    @Override
    protected String deprecatedCLIConfiguration$str() {
        return "WFLYPRT0059: Você está usando uma forma obsoleta de determinar o endereço de associação do cliente. Use o parâmetro \"--bind\" na CLI ao invés de usar a propriedade de sistema %1$s.";
    }
    @Override
    protected String channelTimedOut$str() {
        return "WFLYPRT0060: Tempo limite da solicitação de canal aberto atingido";
    }
}
