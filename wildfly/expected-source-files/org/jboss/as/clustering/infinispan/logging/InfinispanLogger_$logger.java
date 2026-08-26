package org.jboss.as.clustering.infinispan.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.infinispan.client.hotrod.exceptions.HotRodClientException;
import org.jboss.logging.Logger;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.lang.Object;
import java.util.Arrays;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:56:51+0200")
public class InfinispanLogger_$logger extends DelegatingBasicLogger implements InfinispanLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = InfinispanLogger_$logger.class.getName();
    public InfinispanLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void activatingSubsystem() {
        super.log.logf(FQCN, INFO, null, activatingSubsystem$str());
    }
    protected String activatingSubsystem$str() {
        return "WFLYCLINF0001: Activating Infinispan subsystem.";
    }
    @Override
    public final void cacheStarted(final String cacheName, final String containerName) {
        super.log.logf(FQCN, INFO, null, cacheStarted$str(), cacheName, containerName);
    }
    protected String cacheStarted$str() {
        return "WFLYCLINF0002: Started %s cache from %s container";
    }
    @Override
    public final void cacheStopped(final String cacheName, final String containerName) {
        super.log.logf(FQCN, INFO, null, cacheStopped$str(), cacheName, containerName);
    }
    protected String cacheStopped$str() {
        return "WFLYCLINF0003: Stopped %s cache from %s container";
    }
    protected String invalidCacheStore$str() {
        return "WFLYCLINF0010: %s is not a valid cache store";
    }
    @Override
    public final IllegalArgumentException invalidCacheStore(final Throwable cause, final String cacheStoreName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidCacheStore$str(), cacheStoreName), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void remoteCacheContainerStarted(final String remoteCacheContainer) {
        super.log.logf(FQCN, INFO, null, remoteCacheContainerStarted$str(), remoteCacheContainer);
    }
    protected String remoteCacheContainerStarted$str() {
        return "WFLYCLINF0029: Started remote cache container '%s'.";
    }
    @Override
    public final void remoteCacheContainerStopped(final String remoteCacheContainer) {
        super.log.logf(FQCN, INFO, null, remoteCacheContainerStopped$str(), remoteCacheContainer);
    }
    protected String remoteCacheContainerStopped$str() {
        return "WFLYCLINF0030: Stopped remote cache container '%s'.";
    }
    protected String remoteCacheMustBeDefined$str() {
        return "WFLYCLINF0031: Specified HotRod protocol version %s does not support creating caches automatically. Cache named '%s' must be already created on the Infinispan Server!";
    }
    @Override
    public final HotRodClientException remoteCacheMustBeDefined(final String protocolVersion, final String remoteCacheName) {
        final HotRodClientException result = new HotRodClientException(String.format(getLoggingLocale(), remoteCacheMustBeDefined$str(), protocolVersion, remoteCacheName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void marshallerEnumValueDeprecated(final String attributeName, final Object attributeValue, final Set<?> supportedValues) {
        super.log.logf(FQCN, WARN, null, marshallerEnumValueDeprecated$str(), attributeName, attributeValue, supportedValues);
    }
    protected String marshallerEnumValueDeprecated$str() {
        return "WFLYCLINF0033: Attribute '%s' is configured to use a deprecated value: %s; use one of the following values instead: %s";
    }
}
