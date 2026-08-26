package org.jboss.as.cli.impl._private;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.lang.RuntimeException;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;
import java.io.File;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-09T10:26:35+0200")
public class BootScriptInvokerLogger_$logger extends DelegatingBasicLogger implements BootScriptInvokerLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = BootScriptInvokerLogger_$logger.class.getName();
    public BootScriptInvokerLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void processScript(final File file) {
        super.log.logf(FQCN, INFO, null, processScript$str(), file);
    }
    protected String processScript$str() {
        return "WFLYCLI0001: Processing CLI script %s";
    }
    @Override
    public final void errorProcessingScript(final File file) {
        super.log.logf(FQCN, ERROR, null, errorProcessingScript$str(), file);
    }
    protected String errorProcessingScript$str() {
        return "WFLYCLI0002: Error processing CLI script %s";
    }
    protected String propertiesFileNotFound$str() {
        return "WFLYCLI0003: Could not find CLI properties file %s";
    }
    @Override
    public final RuntimeException propertiesFileNotFound(final File file) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), propertiesFileNotFound$str(), file));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void cliOutput() {
        super.log.logf(FQCN, ERROR, null, cliOutput$str());
    }
    protected String cliOutput$str() {
        return "WFLYCLI0004: CLI execution output:";
    }
    @Override
    public final void doneProcessScript(final File file) {
        super.log.logf(FQCN, INFO, null, doneProcessScript$str(), file);
    }
    protected String doneProcessScript$str() {
        return "WFLYCLI0005: Done processing CLI script %s";
    }
    @Override
    public final void executeCommand(final String cmd) {
        super.log.logf(FQCN, DEBUG, null, executeCommand$str(), cmd);
    }
    protected String executeCommand$str() {
        return "WFLYCLI0006: Executing CLI command %s";
    }
    protected String unexpectedException$str() {
        return "WFLYCLI0007: Unexpected exception while processing CLI commands from %s";
    }
    @Override
    public final IllegalStateException unexpectedException(final Throwable cause, final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unexpectedException$str(), file), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedErrors$str() {
        return "WFLYCLI0008: Error processing CLI script %s. The Operations were executed but there were unexpected values. See list of errors in %s";
    }
    @Override
    public final IllegalStateException unexpectedErrors(final File script, final File errors) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unexpectedErrors$str(), script, errors));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedCommandException$str() {
        return "WFLYCLI0009: Unexpected exception while processing CLI command %s from %s";
    }
    @Override
    public final IllegalStateException unexpectedCommandException(final Throwable cause, final String cmd, final File file) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), unexpectedCommandException$str(), cmd, file), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
}
