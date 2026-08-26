package org.wildfly.clustering.web.undertow.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:08+0200")
public class UndertowClusteringLogger_$logger_fr extends UndertowClusteringLogger_$logger implements UndertowClusteringLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public UndertowClusteringLogger_$logger_fr(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.FRENCH;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String legacySingleSignOnProviderInUse$str() {
        return "WFLYCLWEBUT0008: Aucun fournisseur de gestion SSO distribuable n'a été trouvé pour %1$s; utilisation d'un fournisseur existant sur la configuration statique";
    }
    @Override
    protected String legacyRoutingProviderInUse$str() {
        return "WFLYCLWEBUT0007: Aucun fournisseur de routage n'a été trouvé pour %1$s; utiliser un fournisseur existant basé sur une configuration statique";
    }
    @Override
    protected String sessionIsInvalid$str() {
        return "WFLYCLWEBUT0001: La session %1$s n'est pas valide";
    }
    @Override
    protected String sessionManagerStopped$str() {
        return "WFLYCLWEBUT0003: Le gestionnaire de sessions a été arrêté";
    }
    @Override
    protected String legacySessionManagementProviderOverride$str() {
        return "WFLYCLWEBUT0004: L'ancien <replication-config/>remplaçant le fournisseur de gestion de session distribuable attachée déroge pour %1$s";
    }
    @Override
    protected String legacySessionManagementProviderInUse$str() {
        return "WFLYCLWEBUT0005: Aucun fournisseur de gestion de session distribuable n'a été trouvé pour %1$s; utilisation d'un fournisseur existant sur la base de <replication-config/>";
    }
}
