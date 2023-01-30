# GiantMachineCodingExercise_TimeSheetEntry

[![Build Status](https://app.travis-ci.com/AndrewAlleyne/GiantMachineCodingExercise_TimeSheetEntry.svg?branch=master)](https://app.travis-ci.com/AndrewAlleyne/GiantMachineCodingExercise_TimeSheetEntry)

Minimal SpringBoot application supplying endpoints to retrieve all Time Sheets and create a new Time Sheet. 


## Requirements
For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running thea application locally
There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the  `com.example.giantmachinecodingexercise_timesheetentry`  class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
## Sample Data
Data used in this project can be found [Data.csv](https://github.com/AndrewAlleyne/GiantMachineCodingExercise_TimeSheetEntry/blob/master/src/main/resources/file.csv)

#Endpoints
`newEntry` - Adds new entry using the HTTP GET method. 
`timeSheetEntry` - Displays all entries in  [Data.csv](https://github.com/AndrewAlleyne/GiantMachineCodingExercise_TimeSheetEntry/blob/master/src/main/resources/file.csv)
