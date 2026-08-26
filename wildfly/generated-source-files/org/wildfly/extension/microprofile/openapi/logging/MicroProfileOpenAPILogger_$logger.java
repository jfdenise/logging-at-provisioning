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
import java.util.Map;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:36+0200")
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
    public final IllegalArgumentException failedToLoadStaticFile(final IOException arg0, final String arg1, final String arg2) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), failedToLoadStaticFile$str(), arg1, arg2), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void endpointAlreadyRegistered(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, endpointAlreadyRegistered$str(), arg0, arg1);
    }
    protected String endpointAlreadyRegistered$str() {
        return "WFLYMPOAI0003: MicroProfile OpenAPI endpoint already registered for host '%s'.  Skipping OpenAPI documentation of '%s'.";
    }
    @Override
    public final void endpointRegistered(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, endpointRegistered$str(), arg0, arg1);
    }
    protected String endpointRegistered$str() {
        return "WFLYMPOAI0004: Registered MicroProfile OpenAPI endpoint '%s' for host '%s'";
    }
    @Override
    public final void endpointUnregistered(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, endpointUnregistered$str(), arg0, arg1);
    }
    protected String endpointUnregistered$str() {
        return "WFLYMPOAI0005: Unregistered MicroProfile OpenAPI endpoint '%s' for host '%s'";
    }
    @Override
    public final void requiredListenersNotFound(final String arg0, final Set<String> arg1) {
        super.log.logf(FQCN, WARN, null, requiredListenersNotFound$str(), arg0, arg1);
    }
    protected String requiredListenersNotFound$str() {
        return "WFLYMPOAI0006: §5.1 of MicroProfile OpenAPI specification requires that the endpoint be accessible via %2$s, but no such listeners exists for server '%1$s'.";
    }
    @Override
    public final void nonStandardEndpoint(final String arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, WARN, null, nonStandardEndpoint$str(), arg0, arg1, arg2);
    }
    protected String nonStandardEndpoint$str() {
        return "WFLYMPOAI0007: §5.1 of MicroProfile OpenAPI specification requires documentation to be available at '%3$s', but '%1$s' is configured to use '%2$s'";
    }
    @Override
    public final void disabled(final String arg0) {
        super.log.logf(FQCN, INFO, null, disabled$str(), arg0);
    }
    protected String disabled$str() {
        return "WFLYMPOAI0008: MicroProfile OpenAPI documentation disabled for '%s'";
    }
    @Override
    public final void propertyValueConflicts(final String arg0, final Map<String, String> arg1) {
        super.log.logf(FQCN, WARN, null, propertyValueConflicts$str(), arg0, arg1);
    }
    protected String propertyValueConflicts$str() {
        return "WFLYMPOAI0009: Ignoring deployment-specific property value for %s due to conflicts: %s";
    }
    @Override
    public final void propertyValueOverride(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, propertyValueOverride$str(), arg0, arg1);
    }
    protected String propertyValueOverride$str() {
        return "WFLYMPOAI0010: Host configuration overrides deployment-specific property value for %s: %s";
    }
}
