package org.example.logging;

import java.lang.invoke.MethodHandles;

import org.jboss.logging.Messages;
import org.jboss.logging.annotations.Cause;
import org.jboss.logging.annotations.Message;
import org.jboss.logging.annotations.MessageBundle;

/**
 * Example @MessageBundle interface.
 *
 * <p>The jboss-logging-tools APT processor generates
 * {@code AppMessages_$bundle.java} in the same package during compilation.
 * Unlike a logger, a message bundle returns exception or string instances
 * rather than writing to a log handler directly.</p>
 *
 * <p>Usage:
 * <pre>
 *     throw AppMessages.MESSAGES.resourceNotFound("config.xml");
 * </pre>
 * </p>
 */
@MessageBundle(projectCode = "APPMSG")
public interface AppMessages {

    /** Singleton obtained via the standard jboss-logging API. */
    AppMessages MESSAGES = Messages.getBundle(
            MethodHandles.lookup(), AppMessages.class);

    // Note: projectCode "APPMSG" is distinct from AppLogger's "APP" to satisfy
    // the jboss-logging-tools constraint that no two interfaces in the same
    // compilation unit may share the same projectCode + length combination.

    /**
     * Returns an {@link IllegalArgumentException} for a null argument.
     *
     * @param argName the name of the argument that was null
     * @return a new exception with a descriptive message
     */
    @Message(id = 100, value = "Argument '%s' must not be null")
    IllegalArgumentException argumentMustNotBeNull(String argName);

    /**
     * Returns an {@link IllegalStateException} when a named resource is not found.
     *
     * @param resourceName the name of the missing resource
     * @return a new exception with a descriptive message
     */
    @Message(id = 101, value = "Resource not found: %s")
    IllegalStateException resourceNotFound(String resourceName);

    /**
     * Returns an {@link RuntimeException} wrapping a cause, for connection failures.
     *
     * @param host  the target host
     * @param cause the underlying I/O exception
     * @return a new exception with a descriptive message
     */
    @Message(id = 102, value = "Failed to connect to host '%s'")
    MyException connectionFailed(String host, @Cause MyException cause);

    /**
     * Returns a plain formatted string (not an exception) describing an operation timeout.
     *
     * @param operationName the name of the operation that timed out
     * @param timeoutMs     the timeout in milliseconds
     * @return the formatted message string
     */
    @Message(id = 103, value = "Operation '%s' timed out after %d ms")
    String operationTimedOut(String operationName, long timeoutMs);
}
