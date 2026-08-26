package org.wildfly.extension.datasources.agroal.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.OperationFailedException;
import org.jboss.logging.Logger;
import java.util.Arrays;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2025-08-27T11:23:39+0200")
public class AgroalLogger_$logger extends DelegatingBasicLogger implements AgroalLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = AgroalLogger_$logger.class.getName();
    public AgroalLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String jndiNameInvalidFormat$str() {
        return "WFLYAG0303: JNDI name have to start with java:/ or java:jboss/";
    }
    @Override
    public final OperationFailedException jndiNameInvalidFormat() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), jndiNameInvalidFormat$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String jndiNameShouldValidate$str() {
        return "WFLYAG0304: JNDI name shouldn't include '//' or end with '/'";
    }
    @Override
    public final OperationFailedException jndiNameShouldValidate() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), jndiNameShouldValidate$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
