package org.jboss.as.logging.logging;

import java.util.Locale;
import org.jboss.as.server.deployment.DeploymentUnitProcessingException;
import java.lang.IllegalStateException;
import java.io.Serializable;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logmanager.Configurator;
import java.lang.String;
import org.jboss.logging.Logger;
import org.jboss.as.controller.registry.Resource.NoSuchResourceException;
import org.jboss.as.server.deployment.module.ResourceRoot;
import java.lang.RuntimeException;
import org.jboss.logging.BasicLogger;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;
import javax.annotation.processing.Generated;
import java.lang.AutoCloseable;
import org.jboss.as.controller.OperationFailedException;
import org.jboss.logmanager.LogContext;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jboss.as.controller.PathAddress;
import java.lang.Throwable;
import java.util.Collection;
import java.lang.Class;
import java.util.Arrays;
import java.io.File;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-08-26T14:41:28+0200")
public class LoggingLogger_$logger extends DelegatingBasicLogger implements LoggingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = LoggingLogger_$logger.class.getName();
    public LoggingLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void failedToCloseResource(final Throwable arg0, final AutoCloseable arg1) {
        super.log.logf(FQCN, ERROR, arg0, failedToCloseResource$str(), arg1);
    }
    protected String failedToCloseResource$str() {
        return "WFLYLOG0006: Failed to close resource %s";
    }
    @Override
    public final void invalidPropertyAttribute(final String arg0) {
        super.log.logf(FQCN, WARN, null, invalidPropertyAttribute$str(), arg0);
    }
    protected String invalidPropertyAttribute$str() {
        return "WFLYLOG0007: The attribute %s could not be set as it is not a configurable property value.";
    }
    protected String pathManagerServiceNotStarted$str() {
        return "WFLYLOG0008: The path manager service does not appear to be started. Any changes may be lost as a result of this.";
    }
    @Override
    public final String pathManagerServiceNotStarted() {
        return String.format(getLoggingLocale(), pathManagerServiceNotStarted$str());
    }
    @Override
    public final void loggingProfileNotFound(final String arg0, final ResourceRoot arg1) {
        super.log.logf(FQCN, WARN, null, loggingProfileNotFound$str(), arg0, arg1);
    }
    protected String loggingProfileNotFound$str() {
        return "WFLYLOG0010: Logging profile '%s' was specified for deployment '%s' but was not found. Using system logging configuration.";
    }
    @Override
    public final void julConfigurationFileFound(final String arg0) {
        super.log.logf(FQCN, WARN, null, julConfigurationFileFound$str(), arg0);
    }
    protected String julConfigurationFileFound$str() {
        return "WFLYLOG0011: The configuration file in '%s' appears to be a J.U.L. configuration file. The log manager does not allow this type of configuration file.";
    }
    @Override
    public final void replacingNamedHandler(final String arg0) {
        super.log.logf(FQCN, WARN, null, replacingNamedHandler$str(), arg0);
    }
    protected String replacingNamedHandler$str() {
        return "WFLYLOG0012: Replacing handler '%s' during add operation. Either the handler type or the module name differs from the initial configuration.";
    }
    @Override
    public final void replacingConfigurator(final Configurator arg0) {
        if (super.log.isEnabled(WARN)) {
            final Class<?> arg0Class;
            if (arg0 == null) {
                arg0Class = null;
            } else arg0Class = arg0.getClass();
            super.log.logf(FQCN, WARN, null, replacingConfigurator$str(), arg0Class);
        }
    }
    protected String replacingConfigurator$str() {
        return "WFLYLOG0013: A configurator class, '%s', is not a known configurator and will be replaced.";
    }
    @Override
    public final void logContextNotRemoved(final LogContext arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, null, logContextNotRemoved$str(), arg0, arg1);
    }
    protected String logContextNotRemoved$str() {
        return "WFLYLOG0014: The log context (%s) could not be removed for deployment %s";
    }
    @Override
    public final void perDeploymentPropertyDeprecated(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, perDeploymentPropertyDeprecated$str(), arg0, arg1);
    }
    protected String perDeploymentPropertyDeprecated$str() {
        return "WFLYLOG0015: The per-logging deployment property (%s) has been deprecated. Please use the %s attribute to enable/disable per-deployment logging.";
    }
    @Override
    public final void perLoggingDeploymentIgnored(final String arg0, final String arg1, final String arg2) {
        super.log.logf(FQCN, WARN, null, perLoggingDeploymentIgnored$str(), arg0, arg1, arg2);
    }
    protected String perLoggingDeploymentIgnored$str() {
        return "WFLYLOG0016: The per-logging deployment property (%s) is being ignored because the attribute %s has been set to ignore configuration files in the deployment %s.";
    }
    protected String cannotLoadModule$str() {
        return "WFLYLOG0019: Failed to load module '%s' for %s '%s'";
    }
    @Override
    public final IllegalArgumentException cannotLoadModule(final Throwable arg0, final String arg1, final String arg2, final String arg3) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), cannotLoadModule$str(), arg1, arg2, arg3), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    private static void _copyStackTraceMinusOne(final Throwable e) {
        final StackTraceElement[] st = e.getStackTrace();
        if (st.length > 0) e.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
    }
    protected String classNotFound$str() {
        return "WFLYLOG0021: Class '%s' could not be found.";
    }
    @Override
    public final String classNotFound(final Throwable arg0, final String arg1) {
        return String.format(getLoggingLocale(), classNotFound$str(), arg1);
    }
    protected String handlerAlreadyDefined$str() {
        return "WFLYLOG0023: Handler %s is already assigned.";
    }
    @Override
    public final String handlerAlreadyDefined(final String arg0) {
        return String.format(getLoggingLocale(), handlerAlreadyDefined$str(), arg0);
    }
    protected String invalidFilter$str() {
        return "WFLYLOG0025: Filter %s is invalid";
    }
    @Override
    public final String invalidFilter(final String arg0) {
        return String.format(getLoggingLocale(), invalidFilter$str(), arg0);
    }
    protected String invalidLogLevel$str() {
        return "WFLYLOG0026: Log level %s is invalid.";
    }
    @Override
    public final String invalidLogLevel(final String arg0) {
        return String.format(getLoggingLocale(), invalidLogLevel$str(), arg0);
    }
    protected String invalidOverflowAction$str() {
        return "WFLYLOG0027: Overflow action %s is invalid.";
    }
    @Override
    public final String invalidOverflowAction(final String arg0) {
        return String.format(getLoggingLocale(), invalidOverflowAction$str(), arg0);
    }
    protected String invalidSize$str() {
        return "WFLYLOG0028: Invalid size %s";
    }
    @Override
    public final String invalidSize(final String arg0) {
        return String.format(getLoggingLocale(), invalidSize$str(), arg0);
    }
    protected String loggerNotFound$str() {
        return "WFLYLOG0035: Logger '%s' was not found.";
    }
    @Override
    public final String loggerNotFound(final String arg0) {
        return String.format(getLoggingLocale(), loggerNotFound$str(), arg0);
    }
    protected String invalidRelativeTo$str() {
        return "WFLYLOG0039: An absolute path (%s) cannot be specified for relative-to.";
    }
    @Override
    public final String invalidRelativeTo(final String arg0) {
        return String.format(getLoggingLocale(), invalidRelativeTo$str(), arg0);
    }
    protected String invalidSuffix$str() {
        return "WFLYLOG0041: The suffix (%s) is invalid. A suffix must be a valid date format.";
    }
    @Override
    public final String invalidSuffix(final String arg0) {
        return String.format(getLoggingLocale(), invalidSuffix$str(), arg0);
    }
    protected String failedToConfigureLogging$str() {
        return "WFLYLOG0042: Failed to configure logging using '%s' configuration file.";
    }
    @Override
    public final DeploymentUnitProcessingException failedToConfigureLogging(final Throwable arg0, final String arg1) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), failedToConfigureLogging$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String errorProcessingLoggingConfiguration$str() {
        return "WFLYLOG0043: Error occurred while searching for logging configuration files.";
    }
    @Override
    public final DeploymentUnitProcessingException errorProcessingLoggingConfiguration(final Throwable arg0) {
        final DeploymentUnitProcessingException result = new DeploymentUnitProcessingException(String.format(getLoggingLocale(), errorProcessingLoggingConfiguration$str()), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String handlerAttachedToHandlers$str() {
        return "WFLYLOG0044: Handler %s is attached to the following handlers and cannot be removed; %s";
    }
    @Override
    public final OperationFailedException handlerAttachedToHandlers(final String arg0, final Collection<String> arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), handlerAttachedToHandlers$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String handlerAttachedToLoggers$str() {
        return "WFLYLOG0045: Handler %s is attached to the following loggers and cannot be removed; %s";
    }
    @Override
    public final OperationFailedException handlerAttachedToLoggers(final String arg0, final Collection<String> arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), handlerAttachedToLoggers$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotAddHandlerToSelf$str() {
        return "WFLYLOG0046: Cannot add handler (%s) to itself";
    }
    @Override
    public final String cannotAddHandlerToSelf(final String arg0) {
        return String.format(getLoggingLocale(), cannotAddHandlerToSelf$str(), arg0);
    }
    protected String handlerClosed$str() {
        return "WFLYLOG0047: The handler is closed, cannot publish to a closed handler";
    }
    @Override
    public final IllegalStateException handlerClosed() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), handlerClosed$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String handlerConfigurationNotFound$str() {
        return "WFLYLOG0048: Configuration for handler '%s' could not be found.";
    }
    @Override
    public final String handlerConfigurationNotFound(final String arg0) {
        return String.format(getLoggingLocale(), handlerConfigurationNotFound$str(), arg0);
    }
    protected String loggerConfigurationNotFound$str() {
        return "WFLYLOG0049: Configuration for logger '%s' could not be found.";
    }
    @Override
    public final String loggerConfigurationNotFound(final String arg0) {
        return String.format(getLoggingLocale(), loggerConfigurationNotFound$str(), arg0);
    }
    protected String unsupportedMethod$str() {
        return "WFLYLOG0050: Method %s on class %s is not supported";
    }
    @Override
    public final UnsupportedOperationException unsupportedMethod(final String arg0, final String arg1) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), unsupportedMethod$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToWriteConfigurationFile$str() {
        return "WFLYLOG0051: Failed to write configuration file %s";
    }
    @Override
    public final RuntimeException failedToWriteConfigurationFile(final Throwable arg0, final File arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToWriteConfigurationFile$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String formatterNotFound$str() {
        return "WFLYLOG0061: Formatter '%s' is not found";
    }
    @Override
    public final String formatterNotFound(final String arg0) {
        return String.format(getLoggingLocale(), formatterNotFound$str(), arg0);
    }
    protected String truncatedFilterExpression$str() {
        return "WFLYLOG0070: Truncated filter expression string";
    }
    @Override
    public final IllegalArgumentException truncatedFilterExpression() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), truncatedFilterExpression$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidEscapeFoundInFilterExpression$str() {
        return "WFLYLOG0071: Invalid escape found in filter expression string";
    }
    @Override
    public final IllegalArgumentException invalidEscapeFoundInFilterExpression() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), invalidEscapeFoundInFilterExpression$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String filterNotFound$str() {
        return "WFLYLOG0072: Filter '%s' is not found";
    }
    @Override
    public final OperationFailedException filterNotFound(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), filterNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String expectedIdentifier$str() {
        return "WFLYLOG0073: Expected identifier next in filter expression";
    }
    @Override
    public final IllegalArgumentException expectedIdentifier() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), expectedIdentifier$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String expectedString$str() {
        return "WFLYLOG0074: Expected string next in filter expression";
    }
    @Override
    public final IllegalArgumentException expectedString() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), expectedString$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String expected1$str() {
        return "WFLYLOG0075: Expected '%s' next in filter expression";
    }
    @Override
    public final IllegalArgumentException expected(final String arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), expected1$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String expected2$str() {
        return "WFLYLOG0075: Expected '%s' or '%s' next in filter expression";
    }
    @Override
    public final IllegalArgumentException expected(final String arg0, final String arg1) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), expected2$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String unexpectedEnd$str() {
        return "WFLYLOG0076: Unexpected end of filter expression";
    }
    @Override
    public final IllegalArgumentException unexpectedEnd() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), unexpectedEnd$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String extensionNotInitialized$str() {
        return "WFLYLOG0078: The logging subsystem requires the log manager to be org.jboss.logmanager.LogManager. The subsystem has not be initialized and cannot be used. To use JBoss Log Manager you must add the system property \"java.util.logging.manager\" and set it to \"org.jboss.logmanager.LogManager\"";
    }
    @Override
    public final IllegalStateException extensionNotInitialized() {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), extensionNotInitialized$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToReadLogFile$str() {
        return "WFLYLOG0079: Failed to read the log file '%s'";
    }
    @Override
    public final RuntimeException failedToReadLogFile(final Throwable arg0, final String arg1) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), failedToReadLogFile$str(), arg1), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String logFileNotFound$str() {
        return "WFLYLOG0080: File '%s' was not found and cannot be found in the %s directory.";
    }
    @Override
    public final NoSuchResourceException logFileNotFound(final String arg0, final String arg1) {
        final NoSuchResourceException result = new NoSuchResourceException(String.format(getLoggingLocale(), logFileNotFound$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String readNotAllowed$str() {
        return "WFLYLOG0081: File '%s' is not allowed to be read.";
    }
    @Override
    public final OperationFailedException readNotAllowed(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), readNotAllowed$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String suffixContainsMillis$str() {
        return "WFLYLOG0082: The suffix (%s) can not contain seconds or milliseconds.";
    }
    @Override
    public final String suffixContainsMillis(final String arg0) {
        return String.format(getLoggingLocale(), suffixContainsMillis$str(), arg0);
    }
    protected String invalidLogFile$str() {
        return "WFLYLOG0083: Path '%s' is a directory and cannot be used as a log file.";
    }
    @Override
    public final OperationFailedException invalidLogFile(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidLogFile$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRegisterResourceOfType$str() {
        return "WFLYLOG0084: Resources of type %s cannot be registered";
    }
    @Override
    public final UnsupportedOperationException cannotRegisterResourceOfType(final String arg0) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), cannotRegisterResourceOfType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String cannotRemoveResourceOfType$str() {
        return "WFLYLOG0085: Resources of type %s cannot be removed";
    }
    @Override
    public final UnsupportedOperationException cannotRemoveResourceOfType(final String arg0) {
        final UnsupportedOperationException result = new UnsupportedOperationException(String.format(getLoggingLocale(), cannotRemoveResourceOfType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String deploymentNameNotFound$str() {
        return "WFLYLOG0086: Could not determine deployment name from the address %s.";
    }
    @Override
    public final IllegalArgumentException deploymentNameNotFound(final PathAddress arg0) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), deploymentNameNotFound$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void errorProcessingLogDirectory(final String arg0) {
        super.log.logf(FQCN, ERROR, null, errorProcessingLogDirectory$str(), arg0);
    }
    protected String errorProcessingLogDirectory$str() {
        return "WFLYLOG0087: Failed to process logging directory %s. Log files cannot be listed.";
    }
    @Override
    public final void errorDeterminingChildrenExist(final Throwable arg0, final String arg1) {
        super.log.logf(FQCN, ERROR, arg0, errorDeterminingChildrenExist$str(), arg1);
    }
    protected String errorDeterminingChildrenExist$str() {
        return "WFLYLOG0088: Could not determine %s had any children resources.";
    }
    @Override
    public final void unknownLogManager(final String arg0) {
        super.log.logf(FQCN, WARN, null, unknownLogManager$str(), arg0);
    }
    protected String unknownLogManager$str() {
        return "WFLYLOG0089: The log manager check was skipped and the log manager system property, \"java.util.logging.manager\", does not appear to be set to \"org.jboss.logmanager.LogManager\". The current value is \"%s\". Some behavior of the logged output such as MDC and NDC may not work as expected.";
    }
    @Override
    public final void unresolvablePathExpressions(final Set<String> arg0) {
        if (super.log.isEnabled(WARN) && unresolvablePathExpressions_$Once.compareAndSet(false, true)) {
            super.log.logf(FQCN, WARN, null, unresolvablePathExpressions$str(), arg0);
        }
    }
    protected String unresolvablePathExpressions$str() {
        return "WFLYLOG0090: The following path expressions could not be resolved while attempting to determine which log files are available to be read: %s";
    }
    private static final AtomicBoolean unresolvablePathExpressions_$Once = new AtomicBoolean(false);
    protected String invalidExceptionOutputType$str() {
        return "WFLYLOG0091: Exception output type %s is invalid.";
    }
    @Override
    public final OperationFailedException invalidExceptionOutputType(final String arg0) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidExceptionOutputType$str(), arg0));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidType$str() {
        return "WFLYLOG0092: Invalid type found. Expected %s but found %s.";
    }
    @Override
    public final OperationFailedException invalidType(final Class<?> arg0, final Class<?> arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidType$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String failedToConfigureSslContext$str() {
        return "WFLYLOG0093: Failed to configure SSL context for %s %s.";
    }
    @Override
    public final OperationFailedException failedToConfigureSslContext(final Throwable arg0, final String arg1, final String arg2) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), failedToConfigureSslContext$str(), arg1, arg2), arg0);
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String illegalFormatterName$str() {
        return "WFLYLOG0094: Formatter name cannot end with '-wfcore-pattern-formatter'";
    }
    @Override
    public final OperationFailedException illegalFormatterName() {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), illegalFormatterName$str()));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String reservedFilterName$str() {
        return "WFLYLOG0095: The name %s cannot be used as a filter name as it is a reserved filter name. Reserved names are: %s";
    }
    @Override
    public final OperationFailedException reservedFilterName(final String arg0, final Collection<String> arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), reservedFilterName$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidFilterNameStart$str() {
        return "WFLYLOG0096: The name %s cannot be used as a filter name as it starts with an invalid character %s";
    }
    @Override
    public final OperationFailedException invalidFilterNameStart(final String arg0, final char arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidFilterNameStart$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    protected String invalidFilterName$str() {
        return "WFLYLOG0097: The name %s cannot be used as a filter name as it contains an invalid character %s";
    }
    @Override
    public final OperationFailedException invalidFilterName(final String arg0, final char arg1) {
        final OperationFailedException result = new OperationFailedException(String.format(getLoggingLocale(), invalidFilterName$str(), arg0, arg1));
        _copyStackTraceMinusOne(result);
        return result;
    }
    @Override
    public final void usageOfAppender(final String arg0) {
        super.log.logf(FQCN, WARN, null, usageOfAppender$str(), arg0);
    }
    protected String usageOfAppender$str() {
        return "WFLYLOG0099: Usage of a log4j appender (%s) found in a custom-handler. Support for using appenders as custom handlers has been deprecated and will be removed in a future release.";
    }
    @Override
    public final void usageOfLog4j1Config(final String arg0, final String arg1) {
        super.log.logf(FQCN, WARN, null, usageOfLog4j1Config$str(), arg0, arg1);
    }
    protected String usageOfLog4j1Config$str() {
        return "WFLYLOG0100: Usage of a log4j configuration file (%s) was found in deployment %s. Support for log4j configuration files in deployments has been deprecated and will be removed in a future release.";
    }
}
