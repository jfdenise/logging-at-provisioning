package org.jboss.as.clustering.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-07-31T11:56:51+0200")
public class InfinispanLogger_$logger_pt_BR extends InfinispanLogger_$logger_pt implements InfinispanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String activatingSubsystem$str() {
        return "WFLYCLINF0001: Ativação do subsistema Infinispan.";
    }
    @Override
    protected String cacheStarted$str() {
        return "WFLYCLINF0002: Cache %1$s inicializado a partir do recipiente %2$s";
    }
    @Override
    protected String cacheStopped$str() {
        return "WFLYCLINF0003: Cache %1$s encerrado a partir do recipiente %2$s";
    }
    @Override
    protected String invalidCacheStore$str() {
        return "WFLYCLINF0010: O %1$s não é um armazenamento de cache válido";
    }
    @Override
    protected String remoteCacheContainerStarted$str() {
        return "WFLYCLINF0029: Iniciado recipiente de cache remoto '%1$s'.";
    }
    @Override
    protected String remoteCacheContainerStopped$str() {
        return "WFLYCLINF0030: Parado recipiente de cache remoto '%1$s'.";
    }
    @Override
    protected String remoteCacheMustBeDefined$str() {
        return "WFLYCLINF0031: A versão do protocolo HotRod especificado %1$s não dá suporte à criação de caches automaticamente. O cache chamado '%2$s' já deve ter sido criado no servidor Infinispan.";
    }
    @Override
    protected String marshallerEnumValueDeprecated$str() {
        return "WFLYCLINF0033: O atributo “%1$s” está configurado para usar um valor depreciado: %2$s. Em vez disso, use um dos seguintes valores: %3$s";
    }
}
