package org.jipijapa;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.lang.RuntimeException;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:57:36+0200")
public class JipiLogger_$logger extends DelegatingBasicLogger implements JipiLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = JipiLogger_$logger.class.getName();
    public JipiLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void cannotLoadEntityClass(final Throwable cause, final String className) {
        super.log.logf(FQCN, WARN, cause, cannotLoadEntityClass$str(), className);
    }
    protected String cannotLoadEntityClass$str() {
        return "JIPI020200: Could not load entity class '%s', ignoring this error and continuing with application deployment";
    }
    protected String cannotChangeInputStream$str() {
        return "JIPI020201: Cannot change input stream reference.";
    }
    @Override
    public final IllegalArgumentException cannotChangeInputStream() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotChangeInputStream$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String emptyParameter$str() {
        return "JIPI020202: Parameter %s is empty";
    }
    @Override
    public final IllegalArgumentException emptyParameter(final String parameterName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), emptyParameter$str(), parameterName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String missingPersistenceUnitMetadata$str() {
        return "JIPI020203: Missing PersistenceUnitMetadata (thread local wasn't set)";
    }
    @Override
    public final RuntimeException missingPersistenceUnitMetadata() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), missingPersistenceUnitMetadata$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String notYetImplemented$str() {
        return "JIPI020204: Not yet implemented";
    }
    @Override
    public final RuntimeException notYetImplemented() {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), notYetImplemented$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String nullVar$str() {
        return "JIPI020205: Parameter %s is null";
    }
    @Override
    public final IllegalArgumentException nullVar(final String varName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), nullVar$str(), varName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotOpenVFSStream$str() {
        return "JIPI020250: Unable to open VirtualFile-based InputStream %s";
    }
    @Override
    public final RuntimeException cannotOpenVFSStream(final Throwable cause, final String name) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), cannotOpenVFSStream$str(), name), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String uriSyntaxException$str() {
        return "JIPI020251: URI syntax error";
    }
    @Override
    public final IllegalArgumentException uriSyntaxException(final Throwable cause) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), uriSyntaxException$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void cannotUseSecondLevelCache(final String scopedPuName) {
        super.log.logf(FQCN, WARN, null, cannotUseSecondLevelCache$str(), scopedPuName);
    }
    protected String cannotUseSecondLevelCache$str() {
        return "JIPI020252: second level cache not integrated - %s";
    }
}
