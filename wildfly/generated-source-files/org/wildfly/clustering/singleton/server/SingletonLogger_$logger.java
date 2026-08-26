package org.wildfly.clustering.singleton.server;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.util.Collection;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:07+0200")
public class SingletonLogger_$logger extends DelegatingBasicLogger implements SingletonLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = SingletonLogger_$logger.class.getName();
    public SingletonLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void startSingleton(final String arg0) {
        super.log.logf(FQCN, INFO, null, startSingleton$str(), arg0);
    }
    protected String startSingleton$str() {
        return "WFLYCLSN0001: This node will now operate as the singleton provider of the %s service";
    }
    @Override
    public final void stopSingleton(final String arg0) {
        super.log.logf(FQCN, INFO, null, stopSingleton$str(), arg0);
    }
    protected String stopSingleton$str() {
        return "WFLYCLSN0002: This node will no longer operate as the singleton provider of the %s service";
    }
    @Override
    public final void elected(final String arg0, final String arg1) {
        super.log.logf(FQCN, INFO, null, elected$str(), arg0, arg1);
    }
    protected String elected$str() {
        return "WFLYCLSN0003: %s elected as the singleton provider of the %s service";
    }
    protected String noResponseFromPrimary$str() {
        return "WFLYCLSN0004: No response received from primary provider of the %s service, retrying...";
    }
    @Override
    public final IllegalStateException noResponseFromPrimary(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), noResponseFromPrimary$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void quorumNotReached(final String arg0, final int arg1) {
        super.log.logf(FQCN, WARN, null, quorumNotReached$str(), arg0, arg1);
    }
    protected String quorumNotReached$str() {
        return "WFLYCLSN0006: Failed to reach quorum of %2$d for %1$s service. No primary singleton provider will be elected.";
    }
    @Override
    public final void quorumJustReached(final String arg0, final int arg1) {
        super.log.logf(FQCN, INFO, null, quorumJustReached$str(), arg0, arg1);
    }
    protected String quorumJustReached$str() {
        return "WFLYCLSN0007: Just reached required quorum of %2$d for %1$s service. If this cluster loses another member, no node will be chosen to provide this service.";
    }
    protected String multiplePrimaryProvidersDetected$str() {
        return "WFLYCLSN0008: Detected multiple primary providers for %s service: %s";
    }
    @Override
    public final IllegalArgumentException multiplePrimaryProvidersDetected(final String arg0, final Collection<org.wildfly.clustering.server.GroupMember> arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), multiplePrimaryProvidersDetected$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notStarted$str() {
        return "WFLYCLSN0009: Singleton service %s is not started.";
    }
    @Override
    public final IllegalStateException notStarted(final String arg0) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), notStarted$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void noPrimaryElected(final String arg0) {
        super.log.logf(FQCN, WARN, null, noPrimaryElected$str(), arg0);
    }
    protected String noPrimaryElected$str() {
        return "WFLYCLSN0010: No node was elected as the singleton provider of the %s service";
    }
    protected String invalidQuorum$str() {
        return "WFLYCLSN0011: Specified quorum %d must be greater than zero";
    }
    @Override
    public final IllegalArgumentException invalidQuorum(final int arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidQuorum$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
