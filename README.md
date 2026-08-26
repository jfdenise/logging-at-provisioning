# Logging src generation and compilation at provisioning time

## Systematic differences between build-time and provisioning-time generated source

When comparing the build-time generated sources (from `wildfly/expected-source-files`) with the
provisioning-time generated sources (from `wildfly/generated-source-files`), four systematic
differences are observed. The content of the generated code is functionally equivalent; the
differences are all artefacts of the generation process.

NOTE, the comparison has been done against 8.1 and latest wildfly upstream + 8.1 localization files.
This does create some other kind of diffs that have been understood and not 
reported there (bound guard in generation, method not existing, ...).

---

### 1. Parameter names replaced by `arg0`, `arg1`, …

Build-time preserves the original parameter names declared in the source interface because the
annotation processor runs against the `.java` source. Provisioning-time operates against compiled
`.class` bytecode, which does not retain parameter names unless the code was compiled with
`-parameters`. Every method parameter is therefore renamed to `arg0`, `arg1`, etc.

**Build-time (`expected`):**
```java
public final void exceptionRunningAppClient(final Throwable cause, final String exceptionName) {
    super.log.logf(FQCN, ERROR, cause, exceptionRunningAppClient$str(), exceptionName);
}

public final DeploymentUnitProcessingException failedToParseXml(
        final Throwable cause, final VirtualFile appXml) {
    final DeploymentUnitProcessingException result =
        new DeploymentUnitProcessingException(
            String.format(getLoggingLocale(), failedToParseXml1$str(), appXml), cause);
```

**Provisioning-time (`generated`):**
```java
public final void exceptionRunningAppClient(final Throwable arg0, final String arg1) {
    super.log.logf(FQCN, ERROR, arg0, exceptionRunningAppClient$str(), arg1);
}

public final DeploymentUnitProcessingException failedToParseXml(
        final Throwable arg0, final VirtualFile arg1) {
    final DeploymentUnitProcessingException result =
        new DeploymentUnitProcessingException(
            String.format(getLoggingLocale(), failedToParseXml1$str(), arg1), arg0);
```

---

### 2. `$str()` method override ordering differs in locale files

In locale-specific files (`_$logger_fr.java`, `_$logger_de.java`, etc.) the `protected String $str()`
override methods appear in a different order. Build-time orders them as they are declared in the
interface; provisioning-time derives the order from the bytecode constant pool, which differs.
All methods and their translated string bodies are identical — only the sequence changes.

**Build-time (`expected`) — first overrides in `AppClientLogger_$logger_de.java`:**
```java
protected String exceptionRunningAppClient$str() { return "WFLYAC0002: ..."; }
protected String argAppClientConfig$str()        { return "Name der ..."; }
protected String argHost$str()                   { return "Setzen Sie ..."; }
protected String argConnectionProperties$str()   { return "Laden Sie ..."; }
```

**Provisioning-time (`generated`) — first overrides in `AppClientLogger_$logger_de.java`:**
```java
protected String argHelp$str()               { return "Diese Nachricht ..."; }
protected String cannotFindAppClientFile$str() { return "WFLYAC0023: ..."; }
protected String failedToParseXml3$str()     { return "WFLYAC0016: ..."; }
protected String malformedUrl$str()          { return "WFLYAC0017: ..."; }
```


Attempt to move build time src generation and class compilation at provisioning time.
Covered all 8.1 translations.

# Build logging-tools

(we have a one liner fix to apply)

Build it from `https://github.com/jfdenise/jboss-logging-tools/tree/provisiong_logging`

# Build the generator

`cd generator; mvn clean install;cd ..`

# Build galleon-plugins

Build it from `https://github.com/jfdenise/galleon-plugins/tree/log_generation`

# Build WildFly

Needed to depend on the galleon-plugins (and workaround a missing jboss dmr dep in ejb3 module).
Build it from `https://github.com/jfdenise/wildfly/tree/logging-provisioning` 

# Build the WildFly translations feature-pack and provision the server

`cd wildfly/wildfly-translations-feature-pack; mvn clean install`

# You can check the generated source files there:

`ls galleon-pack/target/server/modules/system/layers/base/org/jboss/as/ejb3/main/generated-sources`

# You can check the generated class files there:

`ls galleon-pack/target/server/modules/system/layers/base/org/jboss/as/ejb3/main/translations`

# Start the server with french local, you will see french messages for ejb3

`JAVA_OPTS=-Duser.language=fr ./galleon-pack/target/server/bin/standalone.sh`

# To collect all the generated files in wildfly/generated-source-files

`cd wildfly;bash ./collect-generated-sources.sh`

# Simple examples to just activate the generator

# examples

A simple app with logging message and logger. Annotation processor has been disabled. Custom exception class 
is defined in a dependency jar, translation files are located in their own jar. Making for a kind of complex 
situation where mutiple jars are needed for the generation to properly operates.

# generator

The src generator and compiler that depends on jboss-logging-tools. Scan jar files and produce src and classes.
Contains a CLI main class to try it.

# Steps

Demo to first produce logging classes for english and french then run the app in english and french. 
Note that the french translation file is in its own jar file, not in the application jar file. 
That mimics what we should do when splitting src from translation files.

* Build the generator and example

`cd generator; mvn clean install;cd ..`

`cd examples; mvn clean install;cd ..`

* Generate the logging src and compile classes using the generator Command Line:

```
java -jar generator/target/provisioning-generator-1.0.0-SNAPSHOT-runner.jar \
examples/app/target/logging-example-1.0.0-SNAPSHOT.jar \
examples/translations/target/logging-example-translations-1.0.0-SNAPSHOT.jar \
--classpath examples/dependencies/target/logging-example-dependencies-1.0.0-SNAPSHOT.jar \
--source-dir generated-sources \
--keep-sources
```

* Run the application:

```
java -cp examples/dependencies/target/logging-example-dependencies-1.0.0-SNAPSHOT.jar:examples/app/target/logging-example-1.0.0-SNAPSHOT-runner.jar:generated-classes \
org.example.logging.Main
```

* Run the application in French:

```
java -Duser.language=fr -cp examples/dependencies/target/logging-example-dependencies-1.0.0-SNAPSHOT.jar:examples/app/target/logging-example-1.0.0-SNAPSHOT-runner.jar:generated-classes \
org.example.logging.Main
```