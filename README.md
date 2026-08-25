# Logging src generation and compilation at provisioning time

Attempt to move build time src generation and class compilation at provisioning time.
Covered translations for now:

* ejb3
* server (from wildfly core)

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