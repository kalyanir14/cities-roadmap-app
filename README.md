# cities-roadmap-app
This project allows customers view roadmap available between two given cities or not.

**Description:**

**Get Cities Connected**

Required query parameters:
* origin
* destination

**Plugin Integartions**
- Integrated Swagger
- Jacoco plugin integration

**Technology Stack:**
  - Java 8/ Spring Boot / Rest Easy

## Dependencies

Dependencies that must be installed for this software to work:
* Java JDK - Current version: 1.8.0
    - [Download latest version](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* Postman - Current version: 6.0.10
    - [Download latest version](https://www.getpostman.com/apps)

### High Level Folder Structure
Root
- cities-roadmap-app
   - launch
    - src
    - pom.xml

## Usage
*Note - The below vm parameters are setup for Windows/mac.

**Windows InteliJ vm parameters for running service locally **

-DPORT=8080;
-Dspring.profiles.active=service,local,swagger;
-Dspring.config.location=classpath:/properties/local/application.properties;
-Dspring.cloud.bus.enabled=false

## Configuration

**Using Spring Tool Suite:**
- Right click the launch file and run

Navigate to [localhost:8080]

## How to Test the Software
#### Running all Unit Tests
- Run command ```mvn install```
    - All unit test will run locally

Tests can be run from each file in the 'test' folder. There are tests created and labeled for each scenario and they may
either be run individually or all at once. This can be done using the IntelliJ software and clicking the green arrow on
the left side of the code to run the test.

## Known Issues
There are no known issues.
**For questions, concerns, bug reports, etc, please refer to:**

    Developer
    Kalyani Rachabattula
