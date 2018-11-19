# Ict
Iota Controlled agenT

Software for the IOTA network nodes running on low-end devices, using the final design of the transaction structure,
swarm logic and relying on (static) Economic Clustering instead of the Coordinator for doublespending protection.

Extra service plugins can be attached to icts to allow their operators earn iotas.

Ict is being developed for the Internet, not for the Internet-of-Things.

# Build instructions

## Build Dependencies
Java JDK >= 1.8
Apache Maven >= 3.6.0

## Build, test and run the application
The following command will build the project from scratch, test it and finally run it.
```
mvn clean test exec:java
```
