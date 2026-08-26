package org.wildfly.extension.microprofile.openapi.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.io.IOException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T12:02:20+0200")
public class MicroProfileOpenAPILogger_$logger extends DelegatingBasicLogger implements MicroProfileOpenAPILogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MicroProfileOpenAPILogger_$logger.class.getName();
    public MicroProfileOpenAPILogger_$logger(final Logger log) {
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
        return "WFLYMPOAI0001: Activating MicroProfile OpenAPI Subsystem";
    }
    protected String failedToLoadStaticFile$str() {
        return "WFLYMPOAI0002: Failed to load OpenAPI '%s' from deployment '%s'";
    }
    @Override
    public final IllegalArgumentException failedToLoadStaticFile(final IOException e, final String fileName, final String deploymentName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), failedToLoadStaticFile$str(), fileName, deploymentName), e);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void endpointAlreadyRegistered(final String hostName, final String deployment) {
        super.log.logf(FQCN, WARN, null, endpointAlreadyRegistered$str(), hostName, deployment);
    }
    protected String endpointAlreadyRegistered$str() {
        return "WFLYMPOAI0003: MicroProfile OpenAPI endpoint already registered for host '%s'.  Skipping OpenAPI documentation of '%s'.";
    }
    @Override
    public final void endpointRegistered(final String path, final String hostName) {
        super.log.logf(FQCN, INFO, null, endpointRegistered$str(), path, hostName);
    }
    protected String endpointRegistered$str() {
        return "WFLYMPOAI0004: Registered MicroProfile OpenAPI endpoint '%s' for host '%s'";
    }
    @Override
    public final void endpointUnregistered(final String path, final String hostName) {
        super.log.logf(FQCN, INFO, null, endpointUnregistered$str(), path, hostName);
    }
    protected String endpointUnregistered$str() {
        return "WFLYMPOAI0005: Unregistered MicroProfile OpenAPI endpoint '%s' for host '%s'";
    }
    @Override
    public final void requiredListenersNotFound(final String serverName, final Set<String> requisiteSchemes) {
        super.log.logf(FQCN, WARN, null, requiredListenersNotFound$str(), serverName, requisiteSchemes);
    }
    protected String requiredListenersNotFound$str() {
        return "WFLYMPOAI0006: §5.1 of MicroProfile OpenAPI specification requires that the endpoint be accessible via %2$s, but no such listeners exists for server '%1$s'.";
    }
    @Override
    public final void nonStandardEndpoint(final String deploymentName, final String deploymentEndpoint, final String standardEndpoint) {
        super.log.logf(FQCN, WARN, null, nonStandardEndpoint$str(), deploymentName, deploymentEndpoint, standardEndpoint);
    }
    protected String nonStandardEndpoint$str() {
        return "WFLYMPOAI0007: §5.1 of MicroProfile OpenAPI specification requires documentation to be available at '%3$s', but '%1$s' is configured to use '%2$s'";
    }
    @Override
    public final void disabled(final String deploymentName) {
        super.log.logf(FQCN, INFO, null, disabled$str(), deploymentName);
    }
    protected String disabled$str() {
        return "WFLYMPOAI0008: MicroProfile OpenAPI documentation disabled for '%s'";
    }
}
