package org.jboss.as.jpa.hibernate;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;
import org.hibernate.boot.archive.spi.ArchiveException;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:57:36+0200")
public class JpaLogger_$logger extends DelegatingBasicLogger implements JpaLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = JpaLogger_$logger.class.getName();
    public JpaLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void secondLevelCacheIsEnabled(final Object puUnitName) {
        super.log.logf(FQCN, INFO, null, secondLevelCacheIsEnabled$str(), puUnitName);
    }
    protected String secondLevelCacheIsEnabled$str() {
        return "JIPIORMV6020260: Second level cache enabled for %s";
    }
    protected String HibernateORMDidNotRegisterLifeCycleListener$str() {
        return "JIPIORMV6020261: Hibernate ORM did not register LifeCycleListener";
    }
    @Override
    public final IllegalStateException HibernateORMDidNotRegisterLifeCycleListener() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), HibernateORMDidNotRegisterLifeCycleListener$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void ignoredCacheRegionSetting(final String propertyName, final String setting) {
        super.log.logf(FQCN, WARN, null, ignoredCacheRegionSetting$str(), propertyName, setting);
    }
    protected String ignoredCacheRegionSetting$str() {
        return "JIPIORMV6020262: Application custom cache region setting is ignored %s=%s";
    }
    protected String failOnIncompatibleSetting$str() {
        return "JIPIORMV6020263: hibernate.id.new_generator_mappings set to false is not supported, remove the setting or set to true.  Refer to Hibernate ORM migration documentation for how to update the next id state in the application database.";
    }
    @Override
    public final IllegalStateException failOnIncompatibleSetting() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failOnIncompatibleSetting$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unableOpenInputStream$str() {
        return "JIPIORMV6020264: Unable to open VirtualFile-based InputStream";
    }
    @Override
    public final ArchiveException unableOpenInputStream(final Throwable cause) {
        final ArchiveException result = new ArchiveException(String.format(getLoggingLocale(), unableOpenInputStream$str()), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
}
