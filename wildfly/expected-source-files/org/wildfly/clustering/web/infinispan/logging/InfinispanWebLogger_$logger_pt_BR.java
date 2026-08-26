package org.wildfly.clustering.web.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2025-08-27T11:22:48+0200")
public class InfinispanWebLogger_$logger_pt_BR extends InfinispanWebLogger_$logger_pt implements InfinispanWebLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public InfinispanWebLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String failedToPassivateSession$str() {
        return "WFLYCLWEBINF0001: Falha ao passivar atributos da sessão %1$s";
    }
    @Override
    protected String failedToPassivateSessionAttribute$str() {
        return "WFLYCLWEBINF0002: Falha ao passivar atributo %2$s da sessão %1$s";
    }
    @Override
    protected String invalidSession$str() {
        return "WFLYCLWEBINF0003: Sessão %1$s não é válida";
    }
    @Override
    protected String failedToExpireSession$str() {
        return "WFLYCLWEBINF0004: Não foi possível terminar a sessão %1$s";
    }
    @Override
    protected String failedToCancelSession$str() {
        return "WFLYCLWEBINF0005: Não foi possível anular encerramento/passivação da sessão %1$s no proprietário principal.";
    }
    @Override
    protected String failedToScheduleSession$str() {
        return "WFLYCLWEBINF0006: Falha ao programar encerramento/passivação da sessão %1$s no proprietário principal.";
    }
    @Override
    protected String failedToActivateSession$str() {
        return "WFLYCLWEBINF0007: Falha ao ativar atributos da sessão %1$s";
    }
    @Override
    protected String failedToActivateSessionAttribute$str() {
        return "WFLYCLWEBINF0008: Falha ao ativar atributo %2$s da sessão %1$s";
    }
    @Override
    protected String failedToReadSessionAttribute$str() {
        return "WFLYCLWEBINF0009: Falha ao ler atributo %2$s da sessão %1$s";
    }
    @Override
    protected String failedToActivateAuthentication$str() {
        return "WFLYCLWEBINF0010: Falha ao ativar autenticação para logon único %1$s";
    }
    @Override
    protected String missingSessionAttributeCacheEntry$str() {
        return "WFLYCLWEBINF0011: A sessão %1$s não possui entrada de cache para atributo %2$s";
    }
    @Override
    protected String evictionDisabled$str() {
        return "WFLYCLWEBINF0012: Desativando remoção para o cache '%1$s'. A passivação de sessão Web deve ser configurada por meio de <max-active-sessions/> em jboss-web.xml.";
    }
    @Override
    protected String expirationDisabled$str() {
        return "WFLYCLWEBINF0013: Desativando expiração para o cache '%1$s'. A expiração de sessão web deve ser configurada de acordo com §7.5 da especificação do servlet.";
    }
}
