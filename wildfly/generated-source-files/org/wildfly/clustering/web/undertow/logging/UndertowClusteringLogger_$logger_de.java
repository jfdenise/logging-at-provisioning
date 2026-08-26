package org.wildfly.clustering.web.undertow.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.BasicLogger;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2026-08-26T14:41:08+0200")
public class UndertowClusteringLogger_$logger_de extends UndertowClusteringLogger_$logger implements UndertowClusteringLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    public UndertowClusteringLogger_$logger_de(final org.jboss.logging.Logger logger) {
        super(logger);
    }
    private static final Locale LOCALE = Locale.GERMAN;
    @Override
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    protected String legacySingleSignOnProviderInUse$str() {
        return "WFLYCLWEBUT0008: Kein verteilbarer Single-Sign-On-Management-Anbieter gefunden für %1$s; Verwendung von Legacy-Anbieter basierend auf statischer Konfiguration";
    }
    @Override
    protected String legacyRoutingProviderInUse$str() {
        return "WFLYCLWEBUT0007: Kein Routing-Anbieter gefunden für %1$s; Verwendung von Legacy-Anbieter basierend auf statischer Konfiguration";
    }
    @Override
    protected String sessionIsInvalid$str() {
        return "WFLYCLWEBUT0001: Session %1$s ist ungültig";
    }
    @Override
    protected String sessionManagerStopped$str() {
        return "WFLYCLWEBUT0003: Session-Manager wurde gestoppt";
    }
    @Override
    protected String legacySessionManagementProviderOverride$str() {
        return "WFLYCLWEBUT0004: Legacy <replication-config/>, der den angefügten verteilbaren Sitzungsverwaltungsanbieter überschreibt für %1$s";
    }
    @Override
    protected String legacySessionManagementProviderInUse$str() {
        return "WFLYCLWEBUT0005: Kein verteilbarer Sitzungsverwaltungsanbieter gefunden für %1$s; Verwendung von Legacy-Anbieter basierend auf <replication-config/>";
    }
}
