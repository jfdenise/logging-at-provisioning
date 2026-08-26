package org.wildfly.clustering.web.undertow.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:08+0200")
public class UndertowClusteringLogger_$logger_pt_BR extends UndertowClusteringLogger_$logger_pt implements UndertowClusteringLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public UndertowClusteringLogger_$logger_pt_BR(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = new Locale("pt", "BR");
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String legacySingleSignOnProviderInUse$str() {
        return "WFLYCLWEBUT0008: Nenhum provedor de gerenciamento single sign-on distribuível encontrado para %1$s; usando o provedor herdado baseado em configuração estática";
    }
    @Override
    protected String legacyRoutingProviderInUse$str() {
        return "WFLYCLWEBUT0007: Nenhum provedor de roteamento encontrado para %1$s; usando o provedor herdado baseado na configuração estática";
    }
    @Override
    protected String sessionIsInvalid$str() {
        return "WFLYCLWEBUT0001: Sessão %1$s é inválida ";
    }
    @Override
    protected String sessionManagerStopped$str() {
        return "WFLYCLWEBUT0003: O gerenciador de sessão foi interrompido";
    }
    @Override
    protected String legacySessionManagementProviderOverride$str() {
        return "WFLYCLWEBUT0004: <replication-config/> herdado substituindo provedor de gerenciamento de sessão distribuível anexado para %1$s";
    }
    @Override
    protected String legacySessionManagementProviderInUse$str() {
        return "WFLYCLWEBUT0005: Nenhum provedor de gerenciamento de sessão distribuível encontrado para %1$s; usando o provedor herdado baseado em <replication-config/>";
    }
}
