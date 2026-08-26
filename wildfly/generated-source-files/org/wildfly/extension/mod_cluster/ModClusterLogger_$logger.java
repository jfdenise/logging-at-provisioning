package org.wildfly.extension.mod_cluster;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.Throwable;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Arrays;
import java.lang.IllegalArgumentException;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:41+0200")
public class ModClusterLogger_$logger extends DelegatingBasicLogger implements ModClusterLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ModClusterLogger_$logger.class.getName();
    public ModClusterLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void errorAddingMetrics(final Throwable arg0) {
        super.log.logf(FQCN, ERROR, arg0, errorAddingMetrics$str());
    }
    protected String errorAddingMetrics$str() {
        return "WFLYMODCLS0001: Error adding metrics.";
    }
    @Override
    public final void multicastInterfaceNotAvailable() {
        super.log.logf(FQCN, ERROR, null, multicastInterfaceNotAvailable$str());
    }
    protected String multicastInterfaceNotAvailable$str() {
        return "WFLYMODCLS0004: Mod_cluster requires Advertise but Multicast interface is not available.";
    }
    @Override
    public final void usingSimpleLoadProvider(final String arg0) {
        super.log.logf(FQCN, WARN, null, usingSimpleLoadProvider$str(), arg0);
    }
    protected String usingSimpleLoadProvider$str() {
        return "WFLYMODCLS0005: No mod_cluster load balance factor provider specified for proxy '%s'! Using load balance factor provider with constant factor of '1'.";
    }
    @Override
    public final void errorApplyingMetricProperties(final Throwable arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, errorApplyingMetricProperties$str(), arg1);
    }
    protected String errorApplyingMetricProperties$str() {
        return "WFLYMODCLS0006: Error applying properties to load metric class '%s'. Metric will not be loaded.";
    }
    protected String contextOrHostNotFound$str() {
        return "WFLYMODCLS0011: Virtual host '%s' or context '%s' not found.";
    }
    @Override
    public final String contextOrHostNotFound(final String arg0, final String arg1) {
        return String.format(getLoggingLocale(), contextOrHostNotFound$str(), arg0, arg1);
    }
    protected String excludedContextsWrongFormat$str() {
        return "WFLYMODCLS0019: '%s' is not a valid value for excluded-contexts.";
    }
    @Override
    public final IllegalArgumentException excludedContextsWrongFormat(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), excludedContextsWrongFormat$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    @Override
    public final void excludedContextsUseSlashInsteadROOT() {
        super.log.logf(FQCN, WARN, null, excludedContextsUseSlashInsteadROOT$str());
    }
    protected String excludedContextsUseSlashInsteadROOT$str() {
        return "WFLYMODCLS0021: Value 'ROOT' for excluded-contexts is deprecated, to exclude the root context use '/' instead.";
    }
    @Override
    public final void errorLoadingModuleForCustomMetric(final String arg0, final Throwable arg1) {
        super.log.logf(FQCN, ERROR, arg1, errorLoadingModuleForCustomMetric$str(), arg0);
    }
    protected String errorLoadingModuleForCustomMetric$str() {
        return "WFLYMODCLS0023: Error loading module '%s' to load custom metric from.";
    }
    @Override
    public final void ignoredElement(final String arg0) {
        super.log.logf(FQCN, WARN, null, ignoredElement$str(), arg0);
    }
    protected String ignoredElement$str() {
        return "WFLYMODCLS0025: The '%s' element is no longer supported and will be ignored.";
    }
    @Override
    public final void ignoredAttribute(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, ignoredAttribute$str(), arg0, arg1);
    }
    protected String ignoredAttribute$str() {
        return "WFLYMODCLS0026: Attribute '%s' of element '%s' is no longer supported and will be ignored.";
    }
}
