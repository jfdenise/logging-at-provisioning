package org.example.logging;

import org.jboss.logging.Logger;
import org.example.logging.dependencies.MyException;

/**
 * Entry point that exercises the generated logger and bundle classes.
 *
 * <p>At compile time, maven-compiler-plugin runs the jboss-logging-tools APT processor
 * which generates {@code AppLogger_$logger}, {@code AppLogger_$logger_fr},
 * and {@code AppMessages_$bundle} in {@code target/generated-sources/annotations}.
 * Those classes are compiled into the JAR alongside the interfaces.</p>
 *
 * <p>To regenerate the implementation classes from the compiled JAR alone (no source)
 * using the provisioning-time tool, run:
 * <pre>
 *   java -jar ../logging-provisioning-time/target/logging-provisioning-time-1.0.0-SNAPSHOT-runner.jar \
 *       --output /tmp/regen-classes \
 *       --source-dir /tmp/regen-src \
 *       target/logging-example-1.0.0-SNAPSHOT.jar
 * </pre>
 * </p>
 */
public class Main {

    public static void main(String[] args) {
        // Install a simple console log manager so log output is visible
        // when running outside a WildFly container.
        System.setProperty("java.util.logging.manager",
                "org.jboss.logmanager.LogManager");

        // ── Logger examples ───────────────────────────────────────────────
        AppLogger log = AppLogger.LOGGER;

        log.serverStarted("1.0.0");
        log.serverStopped();

        try {
            throw new MyException("demo exception");
        } catch (MyException e) {
            log.unexpectedError(e);
        }

        try {
            throw new MyException("port 8080 in use");
        } catch (MyException e) {
            log.serviceFailedToStart("HTTP connector", e);
        }

        // ── Bundle examples ───────────────────────────────────────────────
        AppMessages msgs = AppMessages.MESSAGES;

        // String return — just print it
        System.out.println(msgs.operationTimedOut("database-init", 5000L));

        // Exception returns — demonstrate the messages are correctly formatted
        System.out.println(msgs.argumentMustNotBeNull("userId").getMessage());
        System.out.println(msgs.resourceNotFound("config.xml").getMessage());

        MyException connEx = msgs.connectionFailed(
                "db.example.com",
                new MyException("Connection refused"));
        System.out.println(connEx.getMessage());

        System.out.println("Done.");
    }
}
