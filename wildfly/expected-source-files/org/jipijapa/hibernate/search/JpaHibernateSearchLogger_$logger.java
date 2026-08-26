package org.jipijapa.hibernate.search;

import java.util.Locale;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;
import java.lang.Exception;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:57:37+0200")
public class JpaHibernateSearchLogger_$logger extends DelegatingBasicLogger implements JpaHibernateSearchLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = JpaHibernateSearchLogger_$logger.class.getName();
    public JpaHibernateSearchLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String failOnPropertyParsingForIntegration$str() {
        return "JIPISEARCH020290: Failed to parse property '%2$s' while integrating Hibernate Search into persistence unit '%1$s";
    }
    @Override
    public final IllegalStateException failOnPropertyParsingForIntegration(final String puUnitName, final String propertyKey, final Exception cause) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), failOnPropertyParsingForIntegration$str(), puUnitName, propertyKey), cause);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
}
