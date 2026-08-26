package org.wildfly.clustering.singleton.server;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:07+0200")
public class SingletonLogger_$logger_pt_BR extends SingletonLogger_$logger_pt implements SingletonLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public SingletonLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String multiplePrimaryProvidersDetected$str() {
        return "WFLYCLSN0008: Múltiplos provedores primários detectados para o serviço %1$s: %2$s";
    }
    @Override
    protected String elected$str() {
        return "WFLYCLSN0003: %1$s eleito como o provedor singleton do serviço %2$s";
    }
    @Override
    protected String quorumNotReached$str() {
        return "WFLYCLSN0006: Não foi atingido o quorum de %2$d para o serviço %1$s. Nenhum fornecedor primário de singleton será eleito.";
    }
    @Override
    protected String noPrimaryElected$str() {
        return "WFLYCLSN0010: Nenhum nó foi selecionado como provedor singleton do serviço %1$s";
    }
    @Override
    protected String stopSingleton$str() {
        return "WFLYCLSN0002: Esse nó não será mais operado como um provedor singleton do serviço %1$s";
    }
    @Override
    protected String invalidQuorum$str() {
        return "WFLYCLSN0011: O quorum %1$d especificado deve ser maior que zero.";
    }
    @Override
    protected String notStarted$str() {
        return "WFLYCLSN0009: O %1$s do serviço singleton não foi inicializado.";
    }
    @Override
    protected String startSingleton$str() {
        return "WFLYCLSN0001: Esse nó será operado como um provedor singleton do serviço %1$s";
    }
    @Override
    protected String quorumJustReached$str() {
        return "WFLYCLSN0007: Acabou de atingir quorum necessário de %2$d para o serviço %1$s. Caso esta cluster perder outro membro, nenhum nó será escolhido para fornecer este serviço.";
    }
    @Override
    protected String noResponseFromPrimary$str() {
        return "WFLYCLSN0004: Nenhuma resposta recebida do fornecedor principal do serviço %1$s, tentando novamente...";
    }
}
