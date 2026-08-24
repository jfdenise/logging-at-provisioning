# Logging src generation and compilation at provisioning time

Attempt to move build time src generation and class compilation at provisioning time.

# examples

A simple app with logging message and logger. Annotation processor has been disabled.

# generator

The src generator and compiler that depends on jboss-logging-tools. Scan jar files and produce src and classes.
Contains a CLI main class to try it.

# Steps

Produce english and other translations (for now french):

* `cd generator; mvn clean install;cd ..`
* `cd examples; mvn clean install;cd ..`
* Generate the src and classes: 
```
java -jar generator/target/provisioning-generator-1.0.0-SNAPSHOT-runner.jar \
examples/app/target/logging-example-1.0.0-SNAPSHOT.jar examples/translations/target/logging-example-translations-1.0.0-SNAPSHOT.jar \
--source-dir generated-sources \
--keep-sources
```

* Run the aplication:

```
java -cp examples/app/target/logging-example-1.0.0-SNAPSHOT-runner.jar:generated-classes \
org.example.logging.Main
```

* Run the aplication in french:

```
java -Duser.language=fr -cp examples/app/target/logging-example-1.0.0-SNAPSHOT-runner.jar:generated-classes \
org.example.logging.Main
```