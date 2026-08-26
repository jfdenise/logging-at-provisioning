package org.jboss.as.clustering.logging;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.jboss.as.controller.OperationFailedException;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;


import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:56:12+0200")
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
    public final OperationFailedException parameterValueOutOfBounds(final String name, final double value, final String relationalOperator, final double bound) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), parameterValueOutOfBounds$str(), name, value, relationalOperator, bound));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void failedToClose(final Throwable cause, final Object value) {
        super.log.logf(FQCN, WARN, cause, failedToClose$str(), value);
    }
    protected String failedToClose$str() {
        return "WFLYCLCOM0002: Failed to close %s";
    }
    protected String attributesDoNotSupportNegativeValues$str() {
        return "WFLYCLCOM0003: The following attributes do not support negative values: %s";
    }
    @Override
    public final String attributesDoNotSupportNegativeValues(final Set<String> attributes) {
        return String.format(getLoggingLocale(), attributesDoNotSupportNegativeValues$str(), attributes);
    }
    protected String attributesDoNotSupportZeroValues$str() {
        return "WFLYCLCOM0004: The following attributes do not support zero values: %s";
    }
    @Override
    public final String attributesDoNotSupportZeroValues(final Set<String> attributes) {
        return String.format(getLoggingLocale(), attributesDoNotSupportZeroValues$str(), attributes);
    }
    protected String rejectedMultipleValues$str() {
        return "WFLYCLCOM0005: Legacy host does not support multiple values for attributes: %s";
    }
    @Override
    public final String rejectedMultipleValues(final Set<String> attributes) {
        return String.format(getLoggingLocale(), rejectedMultipleValues$str(), attributes);
    }
    @Override
    public final void attributeIgnored(final String attribute, final String element) {
        super.log.logf(FQCN, WARN, null, attributeIgnored$str(), attribute, element);
    }
    protected String attributeIgnored$str() {
        return "WFLYCLCOM0006: The '%s' attribute of the '%s' element is no longer supported and will be ignored";
    }
    @Override
    public final void elementIgnored(final String element) {
        super.log.logf(FQCN, WARN, null, elementIgnored$str(), element);
    }
    protected String elementIgnored$str() {
        return "WFLYCLCOM0007: The '%s' element is no longer supported and will be ignored";
    }
    protected String operationNotSupportedInNormalServerMode$str() {
        return "WFLYCLCOM0008: %s:%s operation is only supported in admin-only mode.";
    }
    @Override
    public final OperationFailedException operationNotSupportedInNormalServerMode(final String address, final String operation) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), operationNotSupportedInNormalServerMode$str(), address, operation));
        _copyStackTraceMinusOne(result);
        return result;
    }
}
