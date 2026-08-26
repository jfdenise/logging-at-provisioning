package org.wildfly.extension.microprofile.config.smallrye._private;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.Class;
import java.util.List;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T12:02:10+0200")
public class MicroProfileConfigLogger_$logger extends DelegatingBasicLogger implements MicroProfileConfigLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = MicroProfileConfigLogger_$logger.class.getName();
    public MicroProfileConfigLogger_$logger(final Logger log) {
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
        return "WFLYCONF0001: Activating MicroProfile Config Subsystem";
    }
    protected String unableToLoadClassFromModule$str() {
        return "WFLYCONF0002: Unable to load class %s from module %s";
    }
    @Override
    public final OperationFailedException unableToLoadClassFromModule(final String className, final String moduleName) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), unableToLoadClassFromModule$str(), className, moduleName));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void loadConfigSourceFromDir(final String path) {
        super.log.logf(FQCN, DEBUG, null, loadConfigSourceFromDir$str(), path);
    }
    protected String loadConfigSourceFromDir$str() {
        return "WFLYCONF0003: Use directory for MicroProfile Config Source: %s";
    }
    @Override
    public final void loadConfigSourceFromClass(final Class clazz) {
        super.log.logf(FQCN, DEBUG, null, loadConfigSourceFromClass$str(), clazz);
    }
    protected String loadConfigSourceFromClass$str() {
        return "WFLYCONF0004: Use class for MicroProfile Config Source: %s";
    }
    @Override
    public final void loadConfigSourceRootFromDir(final String path) {
        super.log.logf(FQCN, DEBUG, null, loadConfigSourceRootFromDir$str(), path);
    }
    protected String loadConfigSourceRootFromDir$str() {
        return "WFLYCONF0009: Use directory for MicroProfile Config Source Root: %s";
    }
    @Override
    public final void logDirectoriesUnderConfigSourceRoot(final String name, final List<String> directories) {
        super.log.logf(FQCN, INFO, null, logDirectoriesUnderConfigSourceRoot$str(), name, directories);
    }
    protected String logDirectoriesUnderConfigSourceRoot$str() {
        return "WFLYCONF0010: The MicroProfile Config Source root directory '%s' contains the following directories which will be used as MicroProfile Config Sources: %s";
    }
}
