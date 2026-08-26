package org.wildfly.clustering.server.infinispan;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import org.infinispan.notifications.cachelistener.event.Event.Type;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.util.Collection;
import java.lang.Object;
import java.util.Arrays;
import java.util.Map;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2025-08-27T11:22:44+0200")
public class ClusteringServerLogger_$logger extends DelegatingBasicLogger implements ClusteringServerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ClusteringServerLogger_$logger.class.getName();
    public ClusteringServerLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String commandDispatcherAlreadyExists$str() {
        return "WFLYCLSV0001: A command dispatcher already exists for %s";
    }
    @Override
    public final IllegalArgumentException commandDispatcherAlreadyExists(final Object id) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), commandDispatcherAlreadyExists$str(), id));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void registryPurgeFailed(final Throwable e, final String containerName, final String cacheName, final Collection<?> members) {
        super.log.logf(FQCN, WARN, e, registryPurgeFailed$str(), containerName, cacheName, members);
    }
    protected String registryPurgeFailed$str() {
        return "WFLYCLSV0020: Failed to purge %s/%s registry of old registry entries for: %s";
    }
    @Override
    public final void registryListenerFailed(final Throwable e, final String containerName, final String cacheName, final Type type, final Map<?, ?> entries) {
        super.log.logf(FQCN, WARN, e, registryListenerFailed$str(), containerName, cacheName, type, entries);
    }
    protected String registryListenerFailed$str() {
        return "WFLYCLSV0021: Failed to notify %s/%s registry listener of %s(%s) event";
    }
    @Override
    public final void failedToRestoreLocalRegistryEntry(final Throwable cause, final String containerName, final String cacheName) {
        super.log.logf(FQCN, WARN, cause, failedToRestoreLocalRegistryEntry$str(), containerName, cacheName);
    }
    protected String failedToRestoreLocalRegistryEntry$str() {
        return "WFLYCLSV0022: Failed to restore local %s/%s registry entry following network partititon merge";
    }
    @Override
    public final void serviceProviderRegistrationListenerFailed(final Throwable e, final String containerName, final String cacheName, final Set<org.wildfly.clustering.group.Node> providers) {
        super.log.logf(FQCN, WARN, e, serviceProviderRegistrationListenerFailed$str(), containerName, cacheName, providers);
    }
    protected String serviceProviderRegistrationListenerFailed$str() {
        return "WFLYCLSV0030: Failed to notify %s/%s service provider registration listener of new providers: %s";
    }
}
