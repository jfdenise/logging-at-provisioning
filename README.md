# Logging src generation and compilation at provisioning time

Attempt to move build time src generation and class compilation at provisioning time.

# examples

A simple app with logging message and logger. Annotation processor has been disabled.

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
examples/app/target/logging-example-1.0.0-SNAPSHOT.jar examples/translations/target/logging-example-translations-1.0.0-SNAPSHOT.jar \
--source-dir generated-sources \
--keep-sources
```

* Run the application:

```
java -cp examples/app/target/logging-example-1.0.0-SNAPSHOT-runner.jar:generated-classes \
org.example.logging.Main
```

* Run the application in French:

```
java -Duser.language=fr -cp examples/app/target/logging-example-1.0.0-SNAPSHOT-runner.jar:generated-classes \
org.example.logging.Main
```