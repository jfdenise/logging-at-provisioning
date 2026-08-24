package org.jboss.logging.tools.provisioning.generator;

/**
 * Thrown when the Phase 3 compilation step fails.
 * The message contains the full list of compiler error diagnostics.
 */
public class BridgeCompilationException extends RuntimeException {

    public BridgeCompilationException(String message) {
        super(message);
    }

    public BridgeCompilationException(String message, Throwable cause) {
        super(message, cause);
    }
}
