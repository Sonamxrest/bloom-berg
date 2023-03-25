**Spring Boot Assignment Documentation**

This documentation describes a Spring Boot project that uses JDK 17 and Spring
parent version 3.0.5. The project implements a system that imports Orders and persist them to Postgres Database:

Deal Unique Id From Currency ISO Code "Ordering Currency"
To Currency ISO Code Deal timestamp Deal Amount in ordering currency The system should validate the row structure and
check for missing fields and type format errors. The system should not import the same request twice. Once a row is
imported, it should be saved in the database, and no rollback is allowed.

Requirements JDK 17 Spring parent version 3.0.5 PostgreSQL database Project Structure The project has the following
structure:

my-project/ |- src/ |- main/ |- java/ | |- com.xrest.assignment/ | |- controller/ | | |- OrderController.java | |- dto/
| | |- OrderDto.java | | |- ResponseDto.java | |- model/ | | |- Order.java | | |- BaseEntity.java | |- repository/ | |
|- OrderRepo.java | |- service/ | |- OrderService.java |- resources/ |- application.yaml |- test/ |- java/ |-
com.xrest.assignment/ |- controller/ |- ImportControllerTest.java src/main/java: Contains the Java source code.
src/main/resources: Contains the application.yaml file that configures the database connection. src/test/java: Contains
the unit tests for the OrderController. Dependencies The project uses the following dependencies:

Spring Boot Starter Web Spring Boot Starter Data JPA Spring Boot Starter Validation PostgreSQL Driver
