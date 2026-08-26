package org.jboss.as.jdr.logger;

import java.util.Locale;
import java.nio.file.Path;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import java.io.IOException;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.ERROR;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2026-07-31T11:57:50+0200")
public class JdrLogger_$logger extends DelegatingBasicLogger implements JdrLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = JdrLogger_$logger.class.getName();
    public JdrLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    protected String couldNotCreateZipfile$str() {
        return "WFLYJDR0007: Could not create zipfile.";
    }
    @Override
    public final String couldNotCreateZipfile() {
        return String.format(getLoggingLocale(), couldNotCreateZipfile$str());
    }
    protected String couldNotConfigureJDR$str() {
        return "WFLYJDR0008: Could not configure JDR. At least one configuration step failed.";
    }
    @Override
    public final String couldNotConfigureJDR() {
        return String.format(getLoggingLocale(), couldNotConfigureJDR$str());
    }
    protected String noCommandsToRun$str() {
        return "WFLYJDR0009: No JDR commands were loaded. Be sure that a valid Plugin class is specified in plugins.properties.";
    }
    @Override
    public final String noCommandsToRun() {
        return String.format(getLoggingLocale(), noCommandsToRun$str());
    }
    @Override
    public final void couldNotFindJDRPropertiesFile() {
        super.log.logf(FQCN, ERROR, null, couldNotFindJDRPropertiesFile$str());
    }
    protected String couldNotFindJDRPropertiesFile$str() {
        return "WFLYJDR0011: Could not find JDR properties file.";
    }
    @Override
    public final void couldNotCreateJDRPropertiesFile(final IOException ioex, final Path path) {
        super.log.logf(FQCN, ERROR, ioex, couldNotCreateJDRPropertiesFile$str(), path);
    }
    protected String couldNotCreateJDRPropertiesFile$str() {
        return "WFLYJDR0012: Could not create JDR properties file at %s";
    }
    protected String jdrHelpMessage$str() {
        return "Display this message and exit";
    }
    @Override
    public final String jdrHelpMessage() {
        return String.format(getLoggingLocale(), jdrHelpMessage$str());
    }
    protected String jdrHostnameMessage$str() {
        return "hostname that the management api is bound to. (default: localhost)";
    }
    @Override
    public final String jdrHostnameMessage() {
        return String.format(getLoggingLocale(), jdrHostnameMessage$str());
    }
    protected String jdrPortMessage$str() {
        return "port that the management api is bound to. (default: 9990)";
    }
    @Override
    public final String jdrPortMessage() {
        return String.format(getLoggingLocale(), jdrPortMessage$str());
    }
    protected String jdrProtocolMessage$str() {
        return "Protocol that is used to connect. Can be remote, http or https (default: http)";
    }
    @Override
    public final String jdrProtocolMessage() {
        return String.format(getLoggingLocale(), jdrProtocolMessage$str());
    }
    protected String jdrConfigMessage$str() {
        return "Configuration file of the server if it is not running.";
    }
    @Override
    public final String jdrConfigMessage() {
        return String.format(getLoggingLocale(), jdrConfigMessage$str());
    }
    protected String jdrDescriptionMessage$str() {
        return "JBoss Diagnostic Reporter (JDR) is a subsystem built to collect information to aid in troubleshooting. The jdr script is a utility for generating JDR reports.";
    }
    @Override
    public final String jdrDescriptionMessage() {
        return String.format(getLoggingLocale(), jdrDescriptionMessage$str());
    }
}
