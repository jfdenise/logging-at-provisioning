package org.jboss.as.clustering.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:04+0200")
public class ClusteringLogger_$logger extends DelegatingBasicLogger implements ClusteringLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ClusteringLogger_$logger.class.getName();
    public ClusteringLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String parameterValueOutOfBounds$str() {
        return "WFLYCLCOM0001: %2$g is not a valid value for parameter %1$s. The value must be %3$s %4$g";
    }
    @Override
    public final OperationFailedException parameterValueOutOfBounds(final String arg0, final double arg1, final String arg2, final double arg3) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), parameterValueOutOfBounds$str(), arg0, arg1, arg2, arg3));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String attributesDoNotSupportNegativeValues$str() {
        return "WFLYCLCOM0003: The following attributes do not support negative values: %s";
    }
    @Override
    public final String attributesDoNotSupportNegativeValues(final Set<String> arg0) {
        return String.format(getLoggingLocale(), attributesDoNotSupportNegativeValues$str(), arg0);
    }
    protected String rejectedMultipleValues$str() {
        return "WFLYCLCOM0005: Legacy host does not support multiple values for attributes: %s";
    }
    @Override
    public final String rejectedMultipleValues(final Set<String> arg0) {
        return String.format(getLoggingLocale(), rejectedMultipleValues$str(), arg0);
    }
    protected String operationNotSupportedInNormalServerMode$str() {
        return "WFLYCLCOM0008: %s:%s operation is only supported in admin-only mode.";
    }
    @Override
    public final OperationFailedException operationNotSupportedInNormalServerMode(final String arg0, final String arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), operationNotSupportedInNormalServerMode$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
