package org.example.logging;

import java.lang.invoke.MethodHandles;

import org.jboss.logging.BasicLogger;
import org.jboss.logging.Logger;
import org.jboss.logging.annotations.Cause;
import org.jboss.logging.annotations.LogMessage;
import org.jboss.logging.annotations.Message;
import org.jboss.logging.annotations.MessageLogger;

/**
 * Example @MessageLogger interface.
 *
 * <p>The jboss-logging-tools APT processor generates
 * {@code AppLogger_$logger.java} in the same package during compilation.
 * At provisioning time, the logging-provisioning-time runner regenerates
 * that class from this compiled interface's bytecode alone.</p>
 *
 * <p>Usage:
 * <pre>
 *     AppLogger LOG = AppLogger.LOGGER;
 *     LOG.serverStarted("1.0.0");
 * </pre>
 * </p>
 */
@MessageLogger(projectCode = "APP", length = 5)
public interface AppLogger extends BasicLogger {

    /** Singleton obtained via the standard jboss-logging API. */
    AppLogger LOGGER = Logger.getMessageLogger(
            MethodHandles.lookup(), AppLogger.class, "org.example.logging");

    /**
     * Logged when the server starts.
     *
     * @param version the server version string
     */
    @LogMessage(level = Logger.Level.INFO)
    @Message(id = 1, value = "Server started (version %s)")
    void serverStarted(String version);

    /**
     * Logged when the server stops.
     */
    @LogMessage(level = Logger.Level.INFO)
    @Message(id = 2, value = "Server stopped")
    void serverStopped();

    /**
     * Logged when an unexpected error occurs.
     *
     * @param cause the throwable that caused the error
     */
    @LogMessage(level = Logger.Level.ERROR)
    @Message(id = 3, value = "Unexpected error during processing")
    void unexpectedError(@Cause MyException cause);

    /**
     * Logged when a named service fails to start.
     *
     * @param serviceName the name of the service
     * @param cause       the underlying failure
     */
    @LogMessage(level = Logger.Level.WARN)
    @Message(id = 4, value = "Service '%s' failed to start")
    void serviceFailedToStart(String serviceName, @Cause Throwable cause);
}
