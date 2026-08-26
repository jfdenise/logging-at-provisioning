package org.wildfly.extension.io.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-09T10:27:19+0200")
public class IOLogger_$logger_pt_BR extends IOLogger_$logger_pt implements IOLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public IOLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String printDefaults$str() {
        return "WFLYIO001: O operador '%1$s' configurou automaticamente para as threads de E/S %2$d com o máximo de %3$d threads de tarefas com base em seus %4$d processadores disponíveis";
    }
    @Override
    protected String printDefaultsIoThreads$str() {
        return "WFLYIO002: O operador '%1$s' configurou automaticamente para as threads de E/S %2$d com base em seus %3$d processadores disponíveis";
    }
    @Override
    protected String printDefaultsWorkerThreads$str() {
        return "WFLYIO003: O operador '%1$s' configurou automaticamente para o máximo de %2$d threads de tarefas com base em seus %3$d processadores disponíveis";
    }
    @Override
    protected String lowFD$str() {
        return "WFLYIO004: O operador '%1$s' configuraria automaticamente para o máximo de %2$d threads de tarefas com base nos %3$d processadores disponíveis, no entanto, seu sistema não tem descritores de arquivo configurados o suficiente para suportar esta configuração. É provável que você experiencie degradação do aplicativo, a não ser que aumente seu limite de descritor de arquivo.";
    }
    @Override
    protected String lowGlobalFD$str() {
        return "WFLYIO005: Seu sistema está configurado com %1$d descritores de arquivo, mas a configuração de servidor de aplicativo atual exigirá um mínimo de %2$d (e provavelmente ainda mais). Tentando ajustar, porém, é provável que você tenha problemas de estabilidade, a não ser que aumente este número";
    }
    @Override
    protected String noMetrics$str() {
        return "WFLYIO006: nenhuma métrica disponível";
    }
    @Override
    protected String unexpectedBindAddressConflict$str() {
        return "WFLYIO007: Conflito inesperado no endereço de associação no recurso \"%1$s\" ao tentar estabelecer associação do destino %2$s com %3$s: já existia uma associação %4$s";
    }
    @Override
    protected String wrongStackSize$str() {
        return "WFLYIO008: O valor do tamanho da pilha de %1$d bytes para o operador de E/S %2$s é baixo, e pode resultar em problemas. É recomendado usar um valor de pelo menos 150.000.";
    }
}
