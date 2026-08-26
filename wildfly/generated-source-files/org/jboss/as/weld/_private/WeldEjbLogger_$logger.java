package org.jboss.as.weld._private;

import java.util.Locale;
import jakarta.ejb.NoSuchEJBException;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.Object;
import org.jboss.logging.Logger;
import java.util.Arrays;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:55+0200")
public class WeldEjbLogger_$logger extends DelegatingBasicLogger implements WeldEjbLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = WeldEjbLogger_$logger.class.getName();
    public WeldEjbLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String ejbHashBeenRemoved$str() {
        return "WFLYWELDEJB0001: EJB has been removed: %s";
    }
    @Override
    public final NoSuchEJBException ejbHashBeenRemoved(final Object arg0) {
        final NoSuchEJBException result = new NoSuchEJBException(String.format(getLoggingLocale(), ejbHashBeenRemoved$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
}
