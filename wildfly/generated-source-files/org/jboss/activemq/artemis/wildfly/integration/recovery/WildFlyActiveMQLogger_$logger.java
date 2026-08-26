package org.jboss.activemq.artemis.wildfly.integration.recovery;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.w3c.dom.Node;
import org.apache.activemq.artemis.service.extensions.xa.recovery.XARecoveryConfig;
import java.lang.String;
import org.jboss.logging.Logger;
import java.lang.Exception;
import org.jboss.logging.BasicLogger;
import java.lang.Runnable;
import java.lang.Throwable;
import java.lang.Object;
import org.apache.activemq.artemis.api.core.client.ClientSessionFactory;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:30+0200")
public class WildFlyActiveMQLogger_$logger extends DelegatingBasicLogger implements WildFlyActiveMQLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = WildFlyActiveMQLogger_$logger.class.getName();
    public WildFlyActiveMQLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void serverRunningCachedCommand(final Runnable arg0) {
        super.log.logv(FQCN, INFO, null, serverRunningCachedCommand$str(), arg0);
    }
    protected String serverRunningCachedCommand$str() {
        return "AMQ121003: JMS Server Manager Running cached command for {0}";
    }
    @Override
    public final void serverCachingCommand(final Object arg0) {
        super.log.logv(FQCN, INFO, null, serverCachingCommand$str(), arg0);
    }
    protected String serverCachingCommand$str() {
        return "AMQ121004: JMS Server Manager Caching command for {0} since the JMS Server is not active yet";
    }
    @Override
    public final void invalidHostForConnector(final String arg0, final String arg1) {
        super.log.logv(FQCN, INFO, null, invalidHostForConnector$str(), arg0, arg1);
    }
    protected String invalidHostForConnector$str() {
        return "AMQ121005: Invalid \"host\" value \"0.0.0.0\" detected for \"{0}\" connector. Switching to \"{1}\". If this new address is incorrect please manually configure the connector to use the proper one.";
    }
    @Override
    public final void noQueueOnTopic(final String arg0, final String arg1) {
        super.log.logv(FQCN, WARN, null, noQueueOnTopic$str(), arg0, arg1);
    }
    protected String noQueueOnTopic$str() {
        return "AMQ122007: Queue {0} does not exist on the topic {1}. It was deleted manually probably.";
    }
    @Override
    public final void recoveryConnectFailed(final String arg0) {
        super.log.logv(FQCN, WARN, null, recoveryConnectFailed$str(), arg0);
    }
    protected String recoveryConnectFailed$str() {
        return "AMQ122008: XA Recovery can not connect to any ActiveMQ server on recovery {0}";
    }
    @Override
    public final void jndiUnbindError(final Exception arg0, final String arg1) {
        super.log.logv(FQCN, WARN, arg0, jndiUnbindError$str(), arg1);
    }
    protected String jndiUnbindError$str() {
        return "AMQ122011: error unbinding {0} from JNDI";
    }
    @Override
    public final void jmsServerError(final Exception arg0) {
        super.log.logv(FQCN, WARN, arg0, jmsServerError$str());
    }
    protected String jmsServerError$str() {
        return "AMQ122012: JMS Server Manager error";
    }
    @Override
    public final void xaRecoverError(final Exception arg0) {
        super.log.logv(FQCN, WARN, arg0, xaRecoverError$str());
    }
    protected String xaRecoverError$str() {
        return "AMQ122013: Error in XA Recovery recover";
    }
    @Override
    public final void xaRecoverConnectionError(final Exception arg0, final ClientSessionFactory arg1) {
        super.log.logv(FQCN, WARN, arg0, xaRecoverConnectionError$str(), arg1);
    }
    protected String xaRecoverConnectionError$str() {
        return "AMQ122014: Notified of connection failure in xa recovery connectionFactory for provider {0} will attempt reconnect on next pass";
    }
    @Override
    public final void xaRecoverAutoConnectionError(final Throwable arg0, final XARecoveryConfig arg1) {
        super.log.logv(FQCN, WARN, arg0, xaRecoverAutoConnectionError$str(), arg1);
    }
    protected String xaRecoverAutoConnectionError$str() {
        return "AMQ122015: Can not connect to {0} on auto-generated resource recovery";
    }
    @Override
    public final void xaRecoveryError(final Exception arg0) {
        super.log.logv(FQCN, DEBUG, arg0, xaRecoveryError$str());
    }
    protected String xaRecoveryError$str() {
        return "AMQ122016: Error in XA Recovery";
    }
    @Override
    public final void failedToCorrectHost(final Exception arg0, final String arg1) {
        super.log.logv(FQCN, WARN, arg0, failedToCorrectHost$str(), arg1);
    }
    protected String failedToCorrectHost$str() {
        return "AMQ122017: Tried to correct invalid \"host\" value \"0.0.0.0\" for \"{0}\" connector, but received an exception.";
    }
    @Override
    public final void xaRecoveryStartError(final XARecoveryConfig arg0) {
        super.log.logv(FQCN, WARN, null, xaRecoveryStartError$str(), arg0);
    }
    protected String xaRecoveryStartError$str() {
        return "AMQ122018: Could not start recovery discovery on {0}, we will retry every recovery scan until the server is available";
    }
    @Override
    public final void jmsConfigMissingKey(final Node arg0) {
        super.log.logv(FQCN, ERROR, null, jmsConfigMissingKey$str(), arg0);
    }
    protected String jmsConfigMissingKey$str() {
        return "AMQ124000: key attribute missing for JMS configuration {0}";
    }
    @Override
    public final void jmsDeployerStartError(final Exception arg0) {
        super.log.logv(FQCN, ERROR, arg0, jmsDeployerStartError$str());
    }
    protected String jmsDeployerStartError$str() {
        return "AMQ124002: Failed to start JMS deployer";
    }
}
